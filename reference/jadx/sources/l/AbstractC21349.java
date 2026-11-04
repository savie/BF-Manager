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

/* JADX INFO: renamed from: l.᩶ܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21349 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginUIBuilder f68003;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m48573(PluginUIBuilder pluginUIBuilder) {
        this.f68003 = pluginUIBuilder;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginUI getPluginUI() {
        return this.f68003.getPluginUI();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginViewBuilder addView() {
        return this.f68003.addView();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginViewBuilder addView(String str) {
        return this.f68003.addView(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginTextViewBuilder addTextView() {
        return this.f68003.addTextView();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginTextViewBuilder addTextView(String str) {
        return this.f68003.addTextView(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginButtonBuilder addButton() {
        return this.f68003.addButton();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginButtonBuilder addButton(String str) {
        return this.f68003.addButton(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginCheckBoxBuilder addCheckBox() {
        return this.f68003.addCheckBox();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginCheckBoxBuilder addCheckBox(String str) {
        return this.f68003.addCheckBox(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSwitchButtonBuilder addSwitchButton() {
        return this.f68003.addSwitchButton();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSwitchButtonBuilder addSwitchButton(String str) {
        return this.f68003.addSwitchButton(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioButtonBuilder addRadioButton() {
        return this.f68003.addRadioButton();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioButtonBuilder addRadioButton(String str) {
        return this.f68003.addRadioButton(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSpinnerBuilder addSpinner() {
        return this.f68003.addSpinner();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginSpinnerBuilder addSpinner(String str) {
        return this.f68003.addSpinner(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginProgressBarBuilder addProgressBar() {
        return this.f68003.addProgressBar();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginProgressBarBuilder addProgressBar(String str) {
        return this.f68003.addProgressBar(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditText() {
        return this.f68003.addEditText();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditText(String str) {
        return this.f68003.addEditText(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditBox() {
        return this.f68003.addEditBox();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginEditTextBuilder addEditBox(String str) {
        return this.f68003.addEditBox(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginImageViewBuilder addImageView() {
        return this.f68003.addImageView();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginImageViewBuilder addImageView(String str) {
        return this.f68003.addImageView(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addHorizontalLayout() {
        return this.f68003.addHorizontalLayout();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        return this.f68003.addHorizontalLayout(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addVerticalLayout() {
        return this.f68003.addVerticalLayout();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginLinearLayoutBuilder addVerticalLayout(String str) {
        return this.f68003.addVerticalLayout(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginFrameLayoutBuilder addFrameLayout() {
        return this.f68003.addFrameLayout();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginFrameLayoutBuilder addFrameLayout(String str) {
        return this.f68003.addFrameLayout(str);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioGroupBuilder addRadioGroup(boolean z) {
        return this.f68003.addRadioGroup(z);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        return this.f68003.addRadioGroup(str, z);
    }
}
