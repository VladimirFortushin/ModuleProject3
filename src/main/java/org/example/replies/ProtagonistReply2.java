package org.example.replies;

import org.example.dialogue.DialogueChain;
import org.example.dialogue.Lines;

public class ProtagonistReply2 implements DialogueChain {

    private int levelNum;
    private final Lines lines;

    private String nextMasterLine;

    public ProtagonistReply2(int levelNum, Lines lines){
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
        switch (levelNum){
            case 1 -> setNextMasterLine(lines.getMasterLines().get(0).get(0));
            case 6 -> setNextMasterLine(lines.getMasterLines().get(7).get(0));
            case 8 -> setNextMasterLine(lines.getMasterLines().get(9).get(1));
            case 25 -> setNextMasterLine(lines.getMasterLines().get(26).get(0));
        }
    }
    public String getNextMasterLine(){
        return nextMasterLine;
    }
}
