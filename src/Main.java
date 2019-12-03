import java.util.Stack;

public  class Main {


    public  static boolean isValid(String braces) {

        Stack<Character> st=new Stack();

        // Traverse a string
        for (int i=0;i< braces.length();i++) {

            /* If the current character is starting bracket,
               then push them in a stack
             */
            if (braces.charAt(i)=='(' || braces.charAt(i)=='[' || braces.charAt(i)=='{') {
                st.push(braces.charAt(i));
                System.out.println("Block 1 and i= " + i + " " + st.elementAt(i));
            }
            /*
               Else, If the stack is not empty,
               And current character is a closing bracket
               and top character of a stack is matching open bracket
               then pop it.
             */

            else if ( !st.empty() && (

                    (braces.charAt(i)==')' && st.peek()=='(') ||
                    (braces.charAt(i)==']' && st.peek()=='[') ||
                    (braces.charAt(i)=='}' && st.peek()=='{')
            )

                    ) {
                st.pop();
                //System.out.println("Block 2 and i= " + i + " " + st.elementAt(i)); // Block 2

            }
            else {

                st.push(braces.charAt(i));
                System.out.println("block3 and i = " + i + " " + st.elementAt(i));// Block 3
            }


        }

        return st.empty() ? true : false ;


    }


        public static void main( String[] args ){

            //System.out.println("Hello World!");
            String s1 = "()";
           // String s2 = "";

            System.out.println("isValid  " + isValid(s1));
           // System.out.println("isValid  " + isValid(s2));


        }

}

