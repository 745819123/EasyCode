package com.sjhy.plugin.action;

import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.Nullable;

public class ConfigAction extends AnAction {
    ConfigAction(@Nullable String text) {
        super(text);
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

    }
}