package com.ohgiraffers.section01.xmlconfig;

import static com.ohgiraffers.section01.xmlconfig.Template.getSqlSession;

public class Application {

    public static void main(String[] args) {

        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        System.out.println(getSqlSession());
        // 똑같은지 여러 출력을 통해 확인! :
        // SQlSessionFactory hashCode 는 동일, sqlSession 은 다 다름!_생명주기 확인
        // 따라서 재사용성이 좋아짐 알 수 있다. (MyBatis 의 장점!)

    }
}
