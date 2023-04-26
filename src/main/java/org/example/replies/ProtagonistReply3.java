package org.example.replies;

import org.example.dialogue.DialogueChain;
import org.example.dialogue.Lines;

public class ProtagonistReply3 implements DialogueChain {

    private int levelNum;
    private final Lines lines;
    private String nextMasterLine;

    public ProtagonistReply3(int levelNum, Lines lines){
        this.levelNum = levelNum;
        this.lines = lines;
        defineDialogueChain();
    }
    @Override
    public void setNextMasterLine(String nextMasterLine) {
        this.nextMasterLine = nextMasterLine;
    }

    @Override
    public void defineDialogueChain() {
        if (levelNum == 1) {
            setNextMasterLine(lines.getMasterLines().get(25).get(1));
        }
    }
    public String getNextMasterLine(){
        return nextMasterLine;
    }
}
