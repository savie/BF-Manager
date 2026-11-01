package l;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginCheckBoxBuilder;
import bin.mt.plugin.api.ui.builder.PluginEditTextBuilder;
import bin.mt.plugin.api.ui.builder.PluginFrameLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginImageViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginProgressBarBuilder;
import bin.mt.plugin.api.ui.builder.PluginRadioButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginRadioGroupBuilder;
import bin.mt.plugin.api.ui.builder.PluginSpinnerBuilder;
import bin.mt.plugin.api.ui.builder.PluginSwitchButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginTextViewBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.ui.builder.PluginViewBuilder;

/* JADX INFO: renamed from: l.ۨۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11529 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginUIBuilder f38749;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28701(PluginUIBuilder pluginUIBuilder) {
        this.f38749 = pluginUIBuilder;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginUI getPluginUI() {
        return this.f38749.getPluginUI();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginViewBuilder addView() {
        return this.f38749.addView();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginViewBuilder addView(String str) {
        return this.f38749.addView(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginTextViewBuilder addTextView() {
        return this.f38749.addTextView();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginTextViewBuilder addTextView(String str) {
        return this.f38749.addTextView(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginButtonBuilder addButton() {
        return this.f38749.addButton();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginButtonBuilder addButton(String str) {
        return this.f38749.addButton(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginCheckBoxBuilder addCheckBox() {
        return this.f38749.addCheckBox();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginCheckBoxBuilder addCheckBox(String str) {
        return this.f38749.addCheckBox(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSwitchButtonBuilder addSwitchButton() {
        return this.f38749.addSwitchButton();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSwitchButtonBuilder addSwitchButton(String str) {
        return this.f38749.addSwitchButton(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioButtonBuilder addRadioButton() {
        return this.f38749.addRadioButton();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioButtonBuilder addRadioButton(String str) {
        return this.f38749.addRadioButton(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSpinnerBuilder addSpinner() {
        return this.f38749.addSpinner();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSpinnerBuilder addSpinner(String str) {
        return this.f38749.addSpinner(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginProgressBarBuilder addProgressBar() {
        return this.f38749.addProgressBar();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginProgressBarBuilder addProgressBar(String str) {
        return this.f38749.addProgressBar(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditText() {
        return this.f38749.addEditText();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditText(String str) {
        return this.f38749.addEditText(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditBox() {
        return this.f38749.addEditBox();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditBox(String str) {
        return this.f38749.addEditBox(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginImageViewBuilder addImageView() {
        return this.f38749.addImageView();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginImageViewBuilder addImageView(String str) {
        return this.f38749.addImageView(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addHorizontalLayout() {
        return this.f38749.addHorizontalLayout();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        return this.f38749.addHorizontalLayout(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addVerticalLayout() {
        return this.f38749.addVerticalLayout();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addVerticalLayout(String str) {
        return this.f38749.addVerticalLayout(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginFrameLayoutBuilder addFrameLayout() {
        return this.f38749.addFrameLayout();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginFrameLayoutBuilder addFrameLayout(String str) {
        return this.f38749.addFrameLayout(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioGroupBuilder addRadioGroup(boolean z) {
        return this.f38749.addRadioGroup(z);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        return this.f38749.addRadioGroup(str, z);
    }
}
