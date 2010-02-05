////////////////////////////////////////////////////////////////////////////////
//
//	RMG - Reaction Mechanism Generator
//
//	Copyright (c) 2002-2009 Prof. William H. Green (whgreen@mit.edu) and the
//	RMG Team (rmg_dev@mit.edu)
//
//	Permission is hereby granted, free of charge, to any person obtaining a
//	copy of this software and associated documentation files (the "Software"),
//	to deal in the Software without restriction, including without limitation
//	the rights to use, copy, modify, merge, publish, distribute, sublicense,
//	and/or sell copies of the Software, and to permit persons to whom the
//	Software is furnished to do so, subject to the following conditions:
//
//	The above copyright notice and this permission notice shall be included in
//	all copies or substantial portions of the Software.
//
//	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
//	FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
//	DEALINGS IN THE SOFTWARE.
//
////////////////////////////////////////////////////////////////////////////////



package jing.rxn;


import java.util.*;

//## package jing::rxn 

//----------------------------------------------------------------------------
// jing\rxn\LibraryReaction.java                                                                  
//----------------------------------------------------------------------------

/**
the reaction in the kinetics library.  the part inherited from super class Reaction is immutable.  but the _Key attribute part is mutable.  Say, we can change the _Key for search a reaction in a kinetics library.
*/
//## class LibraryReaction 
public class LibraryReaction extends Reaction {
    
	protected PDepNetwork pDepNetwork;
    
    
    // Constructors
    
    //## operation LibraryReaction(Structure,RateConstant) 
    private  LibraryReaction(Structure p_structure, Kinetics p_kinetics) {
        //#[ operation LibraryReaction(Structure,RateConstant) 
        structure = p_structure;
        kinetics = p_kinetics;
        comments = "Library Reaction";
        
        
        
        //#]
    }
    //## operation LibraryReaction(Structure,RateConstant,String) 
    private  LibraryReaction(Structure p_structure, Kinetics p_kinetics, String p_comments) {
        //#[ operation LibraryReaction(Structure,RateConstant,String) 
        structure = p_structure;
        kinetics = p_kinetics;
        if (comments != null) comments = "Library Reaction: " + p_comments;
        else comments = "Library Reaction";
        
        
        
        //#]
    }
    public  LibraryReaction() {
    }
    
    public static LibraryReaction makeLibraryReaction(Reaction r){
    	LibraryReaction lR = new LibraryReaction(r.structure, r.kinetics, null);
    	
    	
    	return lR;
    }
    
    
    
}
/*********************************************************************
	File Path	: RMG\RMG\jing\rxn\LibraryReaction.java
*********************************************************************/
