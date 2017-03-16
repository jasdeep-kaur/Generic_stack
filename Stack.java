/**
 * Created by jasdeepkaur on 2/25/17.
 */
// Stack.java
public class Stack<E>
{
    private E[] elements;
    private int top;
    public Stack(int size)
    {
        elements = (E[]) new Object[size];
        top = -1;
    }
    public void push(E element) throws StackFullException
    {
        if (top == elements.length-1)
            throw new StackFullException();
        elements[++top] = element;
    }
    E pop() throws StackEmptyException
    {
        if (isEmpty())
            throw new StackEmptyException();
        return elements[top--];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public static void main(String[] args)
            throws StackFullException, StackEmptyException
    {
        Stack<String> stack = new Stack<String>(5);
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");
        while (!stack.isEmpty())
            System.out.println(stack.pop());
        }
}
class StackEmptyException extends Exception
{
}
class StackFullException extends Exception
{
}