//package com.spring.tktapp.security;
//
//
//import com.spring.tktapp.entity.MLoginUser;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//
///**
// * 認証ユーザーの情報を格納するクラス
// */
//public class LoginUser extends User {
//    /**
//     * ログインユーザー
//     */
//    private final MLoginUser mLoginUser;
//    /**
//     * その他、ログイン後に利用したい情報があればここで宣言する
//     */
//
//    /**
//     * コンストラクタ
//     * @param user
//     */
//    public LoginUser(MLoginUser user) {
//        // スーパークラスのユーザーID、パスワードに値をセットする
//        // 実際の認証はスーパークラスのユーザーID、パスワードで行われる
//        super(user.getMailAddress(), user.getLoginPassword(),
//                AuthorityUtils.createAuthorityList("ROLE_USER"));
//        this.mLoginUser = user;
//    }
//
//    /**
//     *
//     * @return
//     */
//    public MLoginUser getUser() {
//        return mLoginUser;
//    }
//}
