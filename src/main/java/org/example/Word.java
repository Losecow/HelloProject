package org.example;

public class Word {
    //보통 데이터 클래스를 가장 먼저 만든다
    //데이터 구조 -> 들어가는 필드를 보고 구성
    private String name; //<- 외부에서 변경 불가
    String meaning; // 게터, 세터 만들 때
    // 쉬프트 두번

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
}
