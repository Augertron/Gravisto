// =============================================================================
//
//   TestdataIterator.java
//
//   Copyright (c) 2001-2008, Gravisto Team, University of Passau
//
// =============================================================================
// $Id$

package org.graffiti.plugins.algorithms.cyclicLeveling.test;

import java.io.File;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * @author Gerg�
 * @version $Revision$ $Date$
 */
public class PaperIterator implements Iterator<String> {

    private String[] entries;
    private int current;
    private int limit;

    public PaperIterator() {
        entries = new File("c:/graphs/").list();
        current = 0;
        limit = 18;
    }

    public PaperIterator(int limit) {
        entries = new File("c:/graphs/").list();
        current = 0;
        this.limit = limit;
    }

    /*
     * @see java.util.Iterator#hasNext()
     */
    public boolean hasNext() {
        StringTokenizer tokenizer;

        for (int i = current; i < entries.length; i++) {
            String fileName = entries[i];
            tokenizer = new StringTokenizer(fileName, "_");

            int numberOfNodes = Integer.parseInt(tokenizer.nextToken());
            double numberOfEdges = Double.parseDouble(tokenizer.nextToken());

            if ((numberOfNodes <= limit && (numberOfEdges == 2 || numberOfEdges == 5))
                    || numberOfEdges == 5) {
                current = i;
                return true;
            }

        }
        return false;
    }

    /*
     * @see java.util.Iterator#next()
     */
    public String next() {
        int position = current;
        current++;
        return entries[position];

    }

    /*
     * @see java.util.Iterator#remove()
     */
    public void remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    public static void main(String[] args) {
        PaperIterator it = new PaperIterator();
        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);

        }
    }

}

// -----------------------------------------------------------------------------
// end of file
// -----------------------------------------------------------------------------
