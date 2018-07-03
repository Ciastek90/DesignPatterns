package com.patterns.operational.visitor;

import com.patterns.operational.visitor.utilities.Cinema;
import com.patterns.operational.visitor.utilities.Opera;
import com.patterns.operational.visitor.utilities.Theatre;

public interface Visitor {
    void visit(Cinema cinema);
    void visit(Opera opera);
    void visit(Theatre theatre);
}
