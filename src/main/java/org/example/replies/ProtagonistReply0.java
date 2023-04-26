package org.example.replies;

import org.example.dialogue.DialogueChain;
import org.example.dialogue.Lines;

public class ProtagonistReply0 implements DialogueChain {
    private int levelNum;
    private final Lines lines;
    private String nextMasterLine;
    public ProtagonistReply0(int levelNum, Lines lines){
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
            case 1 -> setNextMasterLine(lines.getMasterLines().get(2).get(0));
            case 2 -> setNextMasterLine(lines.getMasterLines().get(3).get(0));
            case 3 -> setNextMasterLine(lines.getMasterLines().get(4).get(0));
            case 4 -> setNextMasterLine(lines.getMasterLines().get(24).get(0));
            case 5, 24 -> setNextMasterLine(lines.getMasterLines().get(6).get(0));
            case 6 -> setNextMasterLine(lines.getMasterLines().get(6).get(1));
            case 7 -> setNextMasterLine(lines.getMasterLines().get(8).get(0));
            case 9 -> setNextMasterLine(lines.getMasterLines().get(10).get(0));
            case 10 -> setNextMasterLine(lines.getMasterLines().get(12).get(0));
            case 13 -> setNextMasterLine(lines.getMasterLines().get(14).get(1));
            case 17, 20 -> setNextMasterLine(lines.getMasterLines().get(0).get(0));
            case 19 -> setNextMasterLine(lines.getMasterLines().get(20).get(0));
        }
    }

    public String getNextMasterLine(){
        return nextMasterLine;
    }
}
