package by.epam.javatraining.zarembo.model.logic;

import org.junit.Assert;
import org.junit.Test;

public class NaturalNumberTest {

    /* @Test
     public void test(){
         Assert.fail();
     }*/
    @Test
    public void testFindLargestDigit() {
        int number = 154;
        int result = 5;
        if (NaturalNumber.findLargestDigit(number) != result) {
            Assert.fail();
        }
    }

    @Test
    public void testIsPalindrome() {
        int number=4785874;
        Assert.assertTrue(NaturalNumber.isPalindrome(number));
    }

    @Test
    public void testIsNaturalNumber() {
        int number=17;
        Assert.assertTrue(NaturalNumber.isPrimeNumber(number));
    }

    @Test
    public void testFindNOD() {
        int number=112;
        int numberTwo=96;
        int result=16;
        Assert.assertEquals(result,NaturalNumber.findNOD(number,numberTwo));
        }


    @Test
    public void testFindNOK() {
        int number=112;
        int numberTwo=96;
        int result=672;
        Assert.assertEquals(result,NaturalNumber.findNOK(number,numberTwo));
    }
}
