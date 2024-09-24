/*
 * Introduction to Software Development (Java)
 * 
 * https://github.com/egalli64/dev-intro
 *
 * Exercises on boolean variables and operators
 */

void main() {
    int target = -42;
    System.out.println("target is " + target);
    boolean positive = target > 0;
    //set positive to true if target is greater than zero
    //si potrebbe fare anche con if, ma è più ridondante
  
    System.out.println("target is positive: " + positive);
}