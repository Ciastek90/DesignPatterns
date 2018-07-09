package com.patterns.operational.composite;

import java.util.LinkedList;
import java.util.List;

public class Composite extends Component {

    private List<Component> list = new LinkedList<Component>();
    public void operation() {
    }
    public void add (Component component){
        list.add(component);
    }
    public void remove (int i){
        list.remove(i);
    }
    public Component getChild(int i){
        return list.get(i);
    }
}
