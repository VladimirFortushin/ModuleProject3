package org.example.dialogue;

import org.example.replies.*;

public class DialogueOrderManager {
    private final Lines lines = new Lines();
    private int levelNum;
    private int protagonistReplyIndex;

    public int getNewLevelNum(String masterNewLine){
        for(var speechLevel : lines.getMasterLines().entrySet()){
            if(speechLevel.getValue().contains(masterNewLine)){
                return speechLevel.getKey();
            }
        }
        return 0;
    }
    public String defineMasterLine(String protagonistLine){
        for(var speechLevel : lines.getProtagonistLines().entrySet()){
            if(speechLevel.getValue().contains(protagonistLine)){
                this.levelNum = speechLevel.getKey();
                this.protagonistReplyIndex = speechLevel.getValue().indexOf(protagonistLine);
                break;
            }
        }
       return spreadResponsibilityAndGetReply();
    }

    private String spreadResponsibilityAndGetReply(){
       return switch (protagonistReplyIndex){
            case 0 -> new ProtagonistReply0(levelNum, lines).getNextMasterLine();
            case 1 -> new ProtagonistReply1(levelNum, lines).getNextMasterLine();
            case 2 -> new ProtagonistReply2(levelNum, lines).getNextMasterLine();
            case 3 -> new ProtagonistReply3(levelNum, lines).getNextMasterLine();
            case 4 -> new ProtagonistReply4(levelNum, lines).getNextMasterLine();
           default -> throw new IllegalStateException("Unexpected value: " + protagonistReplyIndex);
       };
    }

    public Lines getLines() {
        return lines;
    }


}
