package edu.qc.seclass;

public class BuggyClass {
    public int buggyMethod1(int first, int second){

        int result = 1;

        if (second % 2 == 0){
            second = 0;
        }

        result = first / second;


        if(result % 2 == 0){
            result = first/result;
        }

        else {
            result = first/result;
        }

        return result;
    }


    public int buggyMethod2(int first, int second){
        int result = 1;

        if (second % 2 == 0){
            result = 0;
        }

        if(second == 0){
            result = first/result;
        }

        else {
            result = first/result;
        }

        return result;
    }

    public void buggyMethod3(int first, int second){
        /*It is impossible to create such a class. We cannot get 100% coverage with less than 100% branch coverage by putting it one of the branches the previous test. 100% branch coverage would not be satisfied which means we would have to put the error in the statement coverage
        portion which would not be possible to reach 100% coverage and identify the error without the program throwing an error before we reach 100% statement coverage.
        */
    }

    public void buggyMethod4(int first, int second){
        /* it is impossible to have 100% statement coverage while being able to trigger the divide by 0 error as the error would halt the program before 100% statement coverage is reached. The second part of the test requires there to be 100% coverage of branches without showing the error.*/
    }

    public void buggyMethod5(int i ){
        /*it is impossible to reach 100% statement coverage when there is an error present because the error would interrupt the test/program. It would not let us reach 100% statement coverage.*/
    }


}
