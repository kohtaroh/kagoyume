/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.util.ArrayList;

/**
 *
 * @author kotaroh
 */
public class JumsHelper {

    private final String homeURL = "Top";
    private final String cartURL = "Cart";
    private final String registrationURL = "Registration";
    private final String loginURL = "Login";
    private final String mydataURL = "MyData";

    public static JumsHelper getInstance() {
        return new JumsHelper();
    }

    //トップへのリンクを返却
    public String top() {
        return "<br><br><div class=\"main\"><button type=\"button\" ><a href=\"" + homeURL + "\"><h2>トップへ戻る<h2></a></button></div>";
    }

    //カートへのリンクを返却
    public String cart() {
        return "<br><br><div class=\"main\"><button type=\"button\" ><a href=\"" + cartURL + "\">カートを見る</a></button></div>";
    }

    //ログインと新規登録のリンクを返却・条件分岐は.jsp側でしてもらう
    public String NotLoginMode() {
        return "<br><div class=\"main\"><button type=\"button\" ><a href=\"" + loginURL + "\">ログイン</a></button><br><br>"
                + "<br><button type=\"button\" ><a href=\"" + registrationURL + "\">新規登録</a></button></div><br><br>";
    }

    //ログアウトのリンクを返却・条件分岐は.jsp側でしてもらう
    public String Logout() {
        return "<br><div class=\"main\"><button type=\"button\" ><a href=\"" + loginURL + "\">ログアウト</a></button></div><br><br>";
    }

    //マイページとログアウトのリンクを返却・条件分岐は.jsp側でしてもらう
    public String LoginMode() {
        return "<br><div class=\"main\"><button type=\"button\" ><a href=\"" + mydataURL + "\">マイページ</a></button><br><br>"
                + "<br><button type=\"button\" ><a href=\"" + loginURL + "\">ログアウト</a></button></div><br><br>";
    }

    public String chkinput(ArrayList<String> chkList) {
        String output = "";
        for (String val : chkList) {
            if (val.equals("name")) {
                output += "名前";
            }
            if (val.equals("password")) {
                output += "パスワード";
            }
            if (val.equals("mail")) {
                output += "メールアドレス";
            }
            if (val.equals("address")) {
                output += "住所";
            }
            output += "が未記入です<br>";
        }
        return output;
    }
}
