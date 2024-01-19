package jp.co.lbn.study.ut.Gohara;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Lesson01Test {

    Lesson01 target;

    @BeforeEach
    void SetUp(){
        target = new Lesson01(999);
    }


    @Test
    void getValue() {
        var expect = 999;
        var actual = target.getValue();
        assertEquals(expect,actual);
    }

    @Test
    void addValue() {
        var expect = 1000;
        target.addValue(1);
        assertEquals(expect,target.getValue());
    }

    @Test
    void subValue() {
        var expect = 998;
        target.subValue(1);
        assertEquals(expect,target.getValue());
    }

    @Test
    void multipleValue() {
        var expect = 1;
        var target= new Lesson01(expect);
        assertEquals(expect,target.getValue());
    }

    @Test
    void divValue() {
        var expect = 998001;
        var target= new Lesson01(expect);
        assertEquals(expect,target.getValue());
    }
}