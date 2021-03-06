package sample.workedClasses;

import java.sql.Date;

public class User {

    private int id;
    private String name;
    private String surname;
    private String login;
    private String nowBook;
    private String bookForClub;
    private Date data;
    private String male;
    private String password;

    public User(String names, String surnames, String logins, String nowBooks, String bookForClubs, String males, String passwords)
    {
        name = names;
        surname = surnames;
        login = logins;
        nowBook = nowBooks;
        bookForClub = bookForClubs;
        male = males;
        password = passwords;
    }
    public User()
    {

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String loginl) {
        this.login = loginl;
    }

    public String getNowBook() {
        return nowBook;
    }

    public void setNowBook(String nowBook) {
        this.nowBook = nowBook;
    }

    public String getBookForClub() {
        return bookForClub;
    }

    public void setBookForClub(String bookForClub) {
        this.bookForClub = bookForClub;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
