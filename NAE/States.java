package NAE;

import java.util.ArrayList;

/*****************************************************************
 *we added this class in order to replace function class in case
 * of a special node  
 *****************************************************************/

class States{
    Input[] strongPositiveInputs;
    Input[] weakPositiveInputs;
    Input[] strongNegativeInputs;
    Input[] weakNegativeInputs;

    String functionString = ""; 
    
    
    //create a function of specified type and specified inputs
    States(Input[] inputs){
        //divide inputs into negative and positive
        ArrayList<Input> strongPositive= new ArrayList<>();
        ArrayList<Input> weakPositive= new ArrayList<>();
        ArrayList<Input> strongNegative= new ArrayList<>();
        ArrayList<Input> weakNegative= new ArrayList<>();
        
        for(Input input:inputs){
            if(input.isPositive && input.isStrong){
            	strongPositive.add(input);
            }
            else if(input.isPositive && !input.isStrong){
            	weakPositive.add(input);
            }
            else if(!input.isPositive && input.isStrong){
            	strongNegative.add(input);
            }
            else if(!input.isPositive && !input.isStrong){
            	weakNegative.add(input);
            }
            else{
            	System.out.println("Error!");
            }
        }
        this.strongPositiveInputs = strongPositive.toArray(new Input[0]);
        this.weakPositiveInputs = weakPositive.toArray(new Input[0]);
        this.strongNegativeInputs = strongNegative.toArray(new Input[0]);
        this.weakNegativeInputs = weakNegative.toArray(new Input[0]);

        
       // this.functionString = getState(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
    }
    
    //get this function representation for NuSMV
    @Override
    public String toString() {
        return functionString;
    }
    String getState(int state) {       
        switch(state){
        case 1:
            return state1(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 2:
        	return state2(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 3:
        	return state3(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 4:
        	return state4(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 5:
        	return state5(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 6:
        	return state6(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 7:
        	return state7(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 8:
        	return state8(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 9:
        	return state9(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 10:
        	return state10(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 11:
        	return state11(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 12:
        	return state12(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 13:
        	return state13(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 14:
        	return state14(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 15:
        	return state15(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 16:
        	return state16(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 17:
        	return state17(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 18:
            return state18(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 19:
        	return state19(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 20:
        	return state20(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 21:
        	return state21(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 22:
        	return state22(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 23:
        	return state23(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 24:
        	return state24(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 25:
        	return state25(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 26:
        	return state26(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 27:
        	return state27(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 28:
        	return state28(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 29:
        	return state29(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 30:
        	return state30(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 31:
        	return state31(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 32:
        	return state32(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 33:
        	return state33(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 34:
        	return state34(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 35:
            return state35(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 36:
        	return state36(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 37:
        	return state37(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 38:
        	return state38(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 39:
        	return state39(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 40:
        	return state40(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 41:
        	return state41(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 42:
        	return state42(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 43:
        	return state43(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 44:
        	return state44(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 45:
        	return state45(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 46:
        	return state46(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 47:
        	return state47(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 48:
        	return state48(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 49:
        	return state49(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 50:
        	return state50(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 51:
        	return state51(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 52:
            return state52(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 53:
        	return state53(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 54:
        	return state54(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 55:
        	return state55(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 56:
        	return state56(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 57:
        	return state57(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 58:
        	return state58(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 59:
        	return state59(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 60:
        	return state60(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 61:
        	return state61(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 62:
        	return state62(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 63:
        	return state63(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 64:
        	return state64(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 65:
        	return state65(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 66:
        	return state66(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 67:
        	return state67(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 68:
        	return state68(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);  
        case 69:
        	return state69(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 70:
        	return state70(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 71:
        	return state71(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 72:
        	return state72(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 73:
        	return state73(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 74:
        	return state74(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 75:
        	return state75(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 76:
        	return state76(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 77:
        	return state77(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 78:
        	return state78(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 79:
        	return state79(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 80:
        	return state80(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
        case 81:
        	return state81(this.strongPositiveInputs,this.weakPositiveInputs,this.strongNegativeInputs,this.weakNegativeInputs);
    }
    return null;
}
    
    String getState(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative) {
    	return "";
    }
    
    //helper methods
    private String conjuntion(Input[] regulators){
        StringBuilder partialState = new StringBuilder("(");
        if(regulators.length == 0)
        	return "FALSE";
        for(int i = 0;i<regulators.length;i++){
            if(i!=0){
            	partialState.append("&");
            }
            if(regulators[i].optional){
            	partialState.append("("+regulators[i].name+".value | ! "+regulators[i].name+"_connected)");
            }else{
            	partialState.append(regulators[i].name+".value");
            }
        }
        partialState.append(")");
        return partialState.toString();
    }

    private String disjuntion(Input[]regulators){
        StringBuilder partialState = new StringBuilder("(");
        if(regulators.length == 0)
        	return "FALSE";
        for(int i = 0;i<regulators.length;i++){
            if(i!=0){
            	partialState.append("|");
            }
            if(regulators[i].optional){
            	partialState.append("("+regulators[i].name+".value & "+regulators[i].name+"_connected)");  
            }else{
            	partialState.append(regulators[i].name+".value");
            }
        }
        partialState.append(")");
        return partialState.toString();
    }


    //we defined each one of the state using disjuntion and conjuntion functions  
    
    //NoWeakActivators & NoStrongActivators& NoStrongRepressors & NoWeakRepressors
    String state1(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & !"+disjuntion(weakNegative);
    }
    //NoWeakActivators & NoStrongActivators & NoStrongRepressors & SomeWeakRepressors
    String state2(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //NoWeakActivators & NoStrongActivators & NoStrongRepressors & AllWeakRepressors
    String state3(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & "+conjuntion(weakNegative);
    }
    //NoWeakActivators & NoStrongActivators&SomeStrongRepressors & NoWeakRepressors
    String state4(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & !"+disjuntion(weakNegative);
    }
    //NoWeakActivators & NoStrongActivators & SomeStrongRepressors & SomeWeakRepressors
    String state5(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //NoWeakActivators & NoStrongActivators & SomeStrongRepressors & AllWeakRepressors
    String state6(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & "+conjuntion(weakNegative);
    }
    //NoWeakActivators & NoStrongActivators & AllStrongRepressors & NoWeakRepressors
    String state7(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //NoWeakActivators & NoStrongActivators & AllStrongRepressors & SomeWeakRepressors
    String state8(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //NoWeakActivators & NoStrongActivators & AllStrongRepressors & AllWeakRepressors
    String state9(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //SomeWeakActivators & NoStrongActivators & NoStrongRepressors & NoWeakRepressors
    String state10(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //SomeWeakActivators & NoStrongActivators & NoStrongRepressors & SomeWeakRepressors
    String state11(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //SomeWeakActivators & NoStrongActivators & NoStrongRepressors & AllWeakRepressors
    String state12(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //SomeWeakActivators & NoStrongActivators & SomeStrongRepressors & NoWeakRepressors
    String state13(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & !"+disjuntion(weakNegative);
    }
    //SomeWeakActivators & NoStrongActivators & SomeStrongRepressors & SomeWeakRepressors
    String state14(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //SomeWeakActivators & NoStrongActivators & SomeStrongRepressors & AllWeakRepressors
    String state15(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & "+conjuntion(weakNegative);
    }
    //SomeWeakActivators & NoStrongActivators & AllStrongRepressors & NoWeakRepressors
    String state16(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //SomeWeakActivators & NoStrongActivators & AllStrongRepressors & SomeWeakRepressors
    String state17(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //SomeWeakActivators & NoStrongActivators & AllStrongRepressors & AllWeakRepressors
    String state18(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllWeakActivators & NoStrongActivators & NoStrongRepressors & NoWeakRepressors
    String state19(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //AllWeakActivators & NoStrongActivators & NoStrongRepressors & SomeWeakRepressors
    String state20(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllWeakActivators & NoStrongActivators & NoStrongRepressors & AllWeakRepressors
    String state21(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllWeakActivators & NoStrongActivators & SomeStrongRepressors & NoWeakRepressors
    String state22(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & !"+disjuntion(weakNegative);
    }
    //AllWeakActivators & NoStrongActivators & SomeStrongRepressors & SomeWeakRepressors
    String state23(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllWeakActivators & NoStrongActivators & SomeStrongRepressors & AllWeakRepressors
    String state24(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & "+conjuntion(weakNegative);
    }
    //AllWeakActivators & NoStrongActivators &AllStrongRepressors & NoWeakRepressors
    String state25(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & !"+disjuntion(weakNegative);
    }   
    //AllWeakActivators & NoStrongActivators &AllStrongRepressors & SomeWeakRepressors
    String state26(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }   
    //AllWeakActivators & NoStrongActivators &AllStrongRepressors & AllWeakRepressors
    String state27(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "!"+disjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & "+conjuntion(weakNegative);
    }
    //NoWeakActivators &SomeStrongActivators & NoStrongRepressors & NoWeakRepressors
    String state28(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & !"+disjuntion(weakNegative);
    }
    //NoWeakActivators &SomeStrongActivators & NoStrongRepressors & SomeWeakRepressors
    String state29(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //NoWeakActivators &SomeStrongActivators & NoStrongRepressors & AllWeakRepressors
    String state30(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & "+conjuntion(weakNegative);
    }
    //NoWeakActivators & SomeStrongActivators & SomeStrongRepressors & NoWeakRepressors
    String state31(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & !"+disjuntion(weakNegative);
    }
    //NoWeakActivators & SomeStrongActivators & SomeStrongRepressors & SomeWeakRepressors
    String state32(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //NoWeakActivators & SomeStrongActivators & SomeStrongRepressors & AllWeakRepressors
    String state33(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & "+conjuntion(weakNegative);
    }
    //NoWeakActivators & SomeStrongActivators & AllStrongRepressors & NoWeakRepressors
    String state34(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //NoWeakActivators & SomeStrongActivators & AllStrongRepressors & SomeWeakRepressors
    String state35(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //NoWeakActivators & SomeStrongActivators & AllStrongRepressors & AllWeakRepressors
    String state36(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //SomeWeakActivators & SomeStrongActivators & NoStrongRepressors & NoWeakRepressors
    String state37(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //SomeWeakActivators & SomeStrongActivators & NoStrongRepressors & SomeWeakRepressors
    String state38(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //SomeWeakActivators & SomeStrongActivators & NoStrongRepressors & AllWeakRepressors
    String state39(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //SomeWeakActivators & SomeStrongActivators & SomeStrongRepressors & NoWeakRepressors
    String state40(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & !"+disjuntion(weakNegative);
    }
    //SomeWeakActivators & SomeStrongActivators & SomeStrongRepressors & SomeWeakRepressors
    String state41(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //SomeWeakActivators & SomeStrongActivators & SomeStrongRepressors & AllWeakRepressors
    String state42(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & "+conjuntion(weakNegative);
    }
    //SomeWeakActivators & SomeStrongActivators & AllStrongRepressors & NoWeakRepressors
    String state43(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //SomeWeakActivators & SomeStrongActivators & AllStrongRepressors & SomeWeakRepressors
    String state44(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //SomeWeakActivators & SomeStrongActivators & AllStrongRepressors & AllWeakRepressors
    String state45(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllWeakActivators & SomeStrongActivators & NoStrongRepressors & NoWeakRepressors
    String state46(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //AllWeakActivators & SomeStrongActivators & NoStrongRepressors & SomeWeakRepressors
    String state47(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllWeakActivators & SomeStrongActivators & NoStrongRepressors & AllWeakRepressors
    String state48(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllWeakActivators & SomeStrongActivators & SomeStrongRepressors
    String state49(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & !"+disjuntion(weakNegative);
    }
    //AllWeakActivators & SomeStrongActivators & SomeStrongRepressors & SomeWeakRepressors
    String state50(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllWeakActivators & SomeStrongActivators & SomeStrongRepressors & AllWeakRepressors
    String state51(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & "+conjuntion(weakNegative);
    }
    //AllWeakActivators & SomeStrongActivators & AllStrongRepressors & NoWeakRepressors
    String state52(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & !"+disjuntion(weakNegative);
    }   
    //AllWeakActivators & SomeStrongActivators & AllStrongRepressors & SomeWeakRepressors
    String state53(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }   
    //AllWeakActivators & SomeStrongActivators & AllStrongRepressors & AllWeakRepressors
    String state54(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return "("+disjuntion(strongPositive)+" & !"+conjuntion(strongPositive)+") & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & "+conjuntion(weakNegative);
    } 
    //AllStrongActivators & NoWeakActivators & NoStrongRepressors & NoWeakRepressors
    String state55(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & NoWeakActivators & NoStrongRepressors & SomeWeakRepressors
    String state56(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & NoWeakActivators & NoStrongRepressors & AllWeakRepressors
    String state57(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+" & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & NoWeakActivators & SomeStrongRepressors & NoWeakRepressors
    String state58(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & NoWeakActivators & SomeStrongRepressors & SomeWeakRepressors
    String state59(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & NoWeakActivators & SomeStrongRepressors & AllWeakRepressors
    String state60(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & NoWeakActivators & AllStrongRepressors & NoWeakRepressors
    String state61(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & NoWeakActivators & AllStrongRepressors & SomeWeakRepressors
    String state62(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & NoWeakActivators & AllStrongRepressors & AllWeakRepressors
    String state63(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & !"+disjuntion(weakPositive)+" & "+conjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & SomeWeakActivators & NoStrongRepressors & NoWeakRepressors
    String state64(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & SomeWeakActivators & NoStrongRepressors & SomeWeakRepressors
    String state65(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & SomeWeakActivators & NoStrongRepressors & AllWeakRepressors
    String state66(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & !" +disjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & SomeWeakActivators & SomeStrongRepressors & NoWeakRepressors
    String state67(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & SomeWeakActivators & SomeStrongRepressors & SomeWeakRepressors
    String state68(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & SomeWeakActivators & SomeStrongRepressors & AllWeakRepressors
    String state69(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & ("+disjuntion(strongNegative)+" & !"+conjuntion(strongNegative)+ ") & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & SomeWeakActivators & AllStrongRepressors & NoWeakRepressors
    String state70(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & SomeWeakActivators & AllStrongRepressors & SomeWeakRepressors
    String state71(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & SomeWeakActivators & AllStrongRepressors & AllWeakRepressors
    String state72(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & ("+disjuntion(weakPositive)+" & !"+conjuntion(weakPositive)+") & "+conjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & AllWeakActivators & NoStrongRepressors & NoWeakRepressors
    String state73(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & AllWeakActivators & NoStrongRepressors & SomeWeakRepressors
    String state74(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & AllWeakActivators & NoStrongRepressors & AllWeakRepressors
    String state75(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & !"+disjuntion(strongNegative)+ " & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & AllWeakActivators & SomeStrongRepressors & NoWeakRepressors
    String state76(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & !"+disjuntion(weakNegative);
    }
    //AllStrongActivators & AllWeakActivators & SomeStrongRepressors & SomeWeakRepressors
    String state77(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }
    //AllStrongActivators & AllWeakActivators & SomeStrongRepressors & AllWeakRepressors
    String state78(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & ("+disjuntion(strongNegative)+ " & !"+conjuntion(strongNegative)+") & "+conjuntion(weakNegative);
    }
    //AllStrongActivators & AllWeakActivators & AllStrongRepressors & NoWeakRepressors
    String state79(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & !"+disjuntion(weakNegative);
    }   
    //AllStrongActivators & AllWeakActivators & AllStrongRepressors & SomeWeakRepressors
    String state80(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & ("+disjuntion(weakNegative)+" & !"+conjuntion(weakNegative)+")";
    }   
    //AllStrongActivators & AllWeakActivators & AllStrongRepressors & AllWeakRepressors
    String state81(Input[] strongPositive,Input[] weakPositive, Input[] strongNegative, Input[] weakNegative){
    	
    	return conjuntion(strongPositive)+" & "+conjuntion(weakPositive)+" & "+conjuntion(strongNegative)+" & "+conjuntion(weakNegative);
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}