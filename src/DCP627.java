/*
Given an iterator with methods next() and hasNext(), create a wrapper iterator, PeekableInterface, which also implements peek().
peek shows the next element that would be returned on next().

Here is the interface:

class PeekableInterface(object):
    def __init__(self, iterator):
        pass

    def peek(self):
        pass

    def next(self):
        pass

    def hasNext(self):
        pass

 */
public class DCP627 {

    public static void main(String[] args) {

    }

    public class PeekableInterface {

        public void init() {}

        public int peek(){
            return 0;
        }

        public int next() { return 0; }

        public int hasNext() { return 0; }
    }
}
