/*
 * Copyright 1999-2002 Carnegie Mellon University.
 * Portions Copyright 2002 Sun Microsystems, Inc.
 * Portions Copyright 2002 Mitsubishi Electronic Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 *
 */

package edu.cmu.sphinx.trainer;

import edu.cmu.sphinx.knowledge.acoustic.AcousticModel;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Defines the Transcript Graph
 */

public class TranscriptHMMGraph extends Graph implements TranscriptGraph {

    /**
     * Constructor for class. Creates lists of edges and nodes.
     */
    public TranscriptHMMGraph(String context, Transcript transcript,
			      AcousticModel acousticModel) {
	super();
	BuildTranscriptHMM builder = 
	    new BuildTranscriptHMM(context, transcript, acousticModel);
	// Copies the graph created with BuildTranscriptHMM into this Graph.
	copyGraph(builder.getGraph());
    }

}
