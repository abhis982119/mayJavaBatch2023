package com.batch.maybatch.stringsInjava.mystringbuffer;

public class StringVsStringBufferWRTObjectCreation {

    public static void main(String[] args) {

        /*
        i/p : firstName , lastName, Gender, MaritalStatus

         */

        String firstName = new String("Ashish");
        String lastName = new String("Gautam");
        boolean male = true;
        boolean married = true;

       String fullNameWithSalutation =  getNameWithSalutation(firstName, lastName, male, married);
       String fullNameWithSalutationWithSb =  getNameWithSalutationWithStringBuffer(firstName, lastName, male, married);
        System.out.println("user name with String : " + fullNameWithSalutation);
        System.out.println("user name  with SB: " + fullNameWithSalutationWithSb);

    }


    //StringBuffer


    public static String getNameWithSalutationWithStringBuffer( String firstName , String lastName, boolean male, boolean married){

        StringBuffer  salutationWithName   = new StringBuffer("Hello, ");  // 1


        if(male ){
            salutationWithName.append("Mr. ");

        }else{
            if(married){
                salutationWithName.append( "Mrs. ");

            }else{
                salutationWithName.append("Ms. ");

            }
        }

        salutationWithName.append(firstName);
        salutationWithName.append(" ");
        salutationWithName.append(lastName);


        return salutationWithName.toString();  // 1


    }



    //String
    public static String getNameWithSalutation( String firstName , String lastName, boolean male, boolean married){

        String salutation = "Hello, ";  // 1

        String firstNameWithSpace = firstName.concat(" ");    // 1
        String completeName = firstNameWithSpace.concat(lastName);// 1

        String fullNameWithSalutation ;  //1
        if(male ){
            String mr = "Mr. ";      // 1
            fullNameWithSalutation =  mr.concat(completeName);
        }else{
            if(married){
                String mrs = "Mrs. ";  // 1
                fullNameWithSalutation = mrs.concat(completeName);
            }else{
                String ms = "Ms. ";   //1
                fullNameWithSalutation = ms.concat(completeName);
            }
        }

        return salutation.concat(fullNameWithSalutation); // 1


    }
}
