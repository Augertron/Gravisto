/* Generated By:JJTree: Do not edit this line. ASTideq_stmt.java */

package org.graffiti.plugins.ios.importers.dot.parser;

public class ASTideq_stmt extends SimpleNode {
    public ASTideq_stmt(int id) {
        super(id);
    }

    public ASTideq_stmt(DOTParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    @Override
    public Object jjtAccept(DOTParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
