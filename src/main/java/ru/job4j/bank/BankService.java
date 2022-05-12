package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу системы банковских переводов
 * @author Popov Maksim
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение информации о пользователях системы и их счетах осуществляется в коллекции HashMap.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в коллекцию, если
     * пользователь с такими же паспортными данными не был добавлен ранее.
     * @param user добавляемый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод осуществляет поиск пользователя по паспорту и добавляет к нему переданный
     * банковский счет. Если пользователь не найден или счет уже привязан к данному пользователю,
     * то счет не добавляется.
     *
      * @param passport паспортные данные пользователя.
     * @param account добавляемый банковский счет.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя в системе по паспортным данным.
     * @param passport паспортные данные пользователя.
     * @return возвращает пользователя или null, если пользователь не найден.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод осуществляет поиск банковского счета по паспорту пользователя и реквизитам счета.
     * @param passport паспортные данные пользователя.
     * @param requisite реквизиты банквоского счета (номер счета, БИК).
     * @return возвращает банковский счет или null, если пользователь или счет не найдены.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денежных средств со счета одного пользователя на счет другого -
     * баланс на счете отправителе уменьшается на указанную сумму, а на счете получателе увеличивается.
     * Поиск счета осуществляется по паспортным данным пользователя и реквизитам счета.
     * @param srcPassport паспортные данные отправителя.
     * @param srcRequisite реквизиты счета отправителя.
     * @param destPassport паспортные данные получателя.
     * @param destRequisite реквизиты счета получателя.
     * @param amount сумма перевода.
     * @return метод возвращает true, если оба счета были найдены и на счете отправителе
     * достаточно денежных средств. В противном случае метод возвращает false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
