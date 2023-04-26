package org.example.replies;

import org.example.dialogue.DialogueChain;
import org.example.dialogue.Lines;

public class ProtagonistReply4 implements DialogueChain {
    private int levelNum;
    private String nextMasterLine;
    private final Lines lines;

    public ProtagonistReply4(int levelNum, Lines lines){
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
        if (levelNum == 6) {
            setNextMasterLine(lines.getMasterLines().get(19).get(0));
        }
    }
    public String getNextMasterLine(){
        return nextMasterLine;
    }
}
