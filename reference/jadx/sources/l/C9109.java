package l;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
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
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۡۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9109 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f29589;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2398 f29591;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f29590 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginUIBuilder f29588 = this;

    public C9109(AbstractC2398 abstractC2398) {
        this.f29591 = abstractC2398;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m24262(AbstractC0907 abstractC0907) {
        AbstractC2398 abstractC2398 = this.f29591;
        abstractC2398.f7710.dispatch(abstractC2398.getPluginUI(), abstractC0907);
        this.f29590.add(abstractC0907);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f29591.getPluginUI();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView() {
        C0466 c0466 = new C0466(this.f29588);
        m24262(c0466);
        return c0466;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView(String str) {
        C0466 c0466 = new C0466(this.f29588);
        c0466.id(str);
        m24262(c0466);
        return c0466;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView() {
        C14635 c14635 = new C14635(this.f29588);
        m24262(c14635);
        return c14635;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView(String str) {
        C14635 c14635 = new C14635(this.f29588);
        c14635.id(str);
        m24262(c14635);
        return c14635;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton() {
        C6873 c6873 = new C6873(this.f29588);
        m24262(c6873);
        return c6873;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton(String str) {
        C6873 c6873 = new C6873(this.f29588);
        c6873.id(str);
        m24262(c6873);
        return c6873;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox() {
        C13584 c13584 = new C13584(this.f29588);
        m24262(c13584);
        return c13584;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox(String str) {
        C13584 c13584 = new C13584(this.f29588);
        c13584.id(str);
        m24262(c13584);
        return c13584;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton() {
        C4195 c4195 = new C4195(this.f29588);
        m24262(c4195);
        return c4195;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton(String str) {
        C4195 c4195 = new C4195(this.f29588);
        c4195.id(str);
        m24262(c4195);
        return c4195;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton() {
        C3449 c3449 = new C3449(this.f29588);
        m24262(c3449);
        return c3449;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton(String str) {
        C3449 c3449 = new C3449(this.f29588);
        c3449.id(str);
        m24262(c3449);
        return c3449;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner() {
        C24333 c24333 = new C24333(this.f29588);
        m24262(c24333);
        return c24333;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner(String str) {
        C24333 c24333 = new C24333(this.f29588);
        c24333.id(str);
        m24262(c24333);
        return c24333;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar() {
        C23587 c23587 = new C23587(this.f29588);
        m24262(c23587);
        return c23587;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar(String str) {
        C23587 c23587 = new C23587(this.f29588);
        c23587.id(str);
        m24262(c23587);
        return c23587;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText() {
        C11652 c11652 = new C11652(this.f29588, false);
        m24262(c11652);
        return c11652;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText(String str) {
        C11652 c11652 = new C11652(this.f29588, false);
        c11652.id(str);
        m24262(c11652);
        return c11652;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox() {
        C11652 c11652 = new C11652(this.f29588, true);
        m24262(c11652);
        return c11652;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox(String str) {
        C11652 c11652 = new C11652(this.f29588, true);
        c11652.id(str);
        m24262(c11652);
        return c11652;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView() {
        C16873 c16873 = new C16873(this.f29588);
        m24262(c16873);
        return c16873;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView(String str) {
        C16873 c16873 = new C16873(this.f29588);
        c16873.id(str);
        m24262(c16873);
        return c16873;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout() {
        C17619 c17619 = new C17619(this.f29588, this.f29591.f7710, 0);
        m24262(c17619);
        return c17619;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        C17619 c17619 = new C17619(this.f29588, this.f29591.f7710, 0);
        c17619.id(str);
        m24262(c17619);
        return c17619;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout() {
        C17619 c17619 = new C17619(this.f29588, this.f29591.f7710, 1);
        m24262(c17619);
        return c17619;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout(String str) {
        C17619 c17619 = new C17619(this.f29588, this.f29591.f7710, 1);
        c17619.id(str);
        m24262(c17619);
        return c17619;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout() {
        C25079 c25079 = new C25079(this.f29588, this.f29591.f7710);
        m24262(c25079);
        return c25079;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout(String str) {
        C25079 c25079 = new C25079(this.f29588, this.f29591.f7710);
        c25079.id(str);
        m24262(c25079);
        return c25079;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(boolean z) {
        C20603 c20603 = new C20603(this.f29588, this.f29591.f7710, z ? 1 : 0);
        m24262(c20603);
        return c20603;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        C20603 c20603 = new C20603(this.f29588, this.f29591.f7710, z ? 1 : 0);
        c20603.id(str);
        m24262(c20603);
        return c20603;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginView build() {
        throw new UnsupportedOperationException("Method 'build()' is not supported by this PluginUIBuilder");
    }
}
