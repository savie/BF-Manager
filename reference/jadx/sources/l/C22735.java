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

/* JADX INFO: renamed from: l.᩺ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7NW */
/* JADX INFO: loaded from: classes.dex */
public final class C22735 implements PluginUIBuilder {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC14974 f74063;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f74065;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74066 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PluginUIBuilder f74064 = this;

    public C22735(AbstractC14974 abstractC14974) {
        this.f74063 = abstractC14974;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m50405(AbstractC6506 abstractC6506) {
        AbstractC14974 abstractC14974 = this.f74063;
        abstractC14974.f48883.dispatch(abstractC14974.getPluginUI(), abstractC6506);
        this.f74066.add(abstractC6506);
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginUI getPluginUI() {
        return this.f74063.getPluginUI();
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView() {
        C5178 c5178 = new C5178(this.f74064);
        m50405(c5178);
        return c5178;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginViewBuilder addView(String str) {
        C5178 c5178 = new C5178(this.f74064);
        c5178.id(str);
        m50405(c5178);
        return c5178;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView() {
        C13646 c13646 = new C13646(this.f74064);
        m50405(c13646);
        return c13646;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginTextViewBuilder addTextView(String str) {
        C13646 c13646 = new C13646(this.f74064);
        c13646.id(str);
        m50405(c13646);
        return c13646;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton() {
        C17795 c17795 = new C17795(this.f74064);
        m50405(c17795);
        return c17795;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginButtonBuilder addButton(String str) {
        C17795 c17795 = new C17795(this.f74064);
        c17795.id(str);
        m50405(c17795);
        return c17795;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox() {
        C18501 c18501 = new C18501(this.f74064);
        m50405(c18501);
        return c18501;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginCheckBoxBuilder addCheckBox(String str) {
        C18501 c18501 = new C18501(this.f74064);
        c18501.id(str);
        m50405(c18501);
        return c18501;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton() {
        C4472 c4472 = new C4472(this.f74064);
        m50405(c4472);
        return c4472;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSwitchButtonBuilder addSwitchButton(String str) {
        C4472 c4472 = new C4472(this.f74064);
        c4472.id(str);
        m50405(c4472);
        return c4472;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton() {
        C23441 c23441 = new C23441(this.f74064);
        m50405(c23441);
        return c23441;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioButtonBuilder addRadioButton(String str) {
        C23441 c23441 = new C23441(this.f74064);
        c23441.id(str);
        m50405(c23441);
        return c23441;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner() {
        C2978 c2978 = new C2978(this.f74064);
        m50405(c2978);
        return c2978;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginSpinnerBuilder addSpinner(String str) {
        C2978 c2978 = new C2978(this.f74064);
        c2978.id(str);
        m50405(c2978);
        return c2978;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar() {
        C10741 c10741 = new C10741(this.f74064);
        m50405(c10741);
        return c10741;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginProgressBarBuilder addProgressBar(String str) {
        C10741 c10741 = new C10741(this.f74064);
        c10741.id(str);
        m50405(c10741);
        return c10741;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText() {
        C0156 c0156 = new C0156(this.f74064, false);
        m50405(c0156);
        return c0156;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditText(String str) {
        C0156 c0156 = new C0156(this.f74064, false);
        c0156.id(str);
        m50405(c0156);
        return c0156;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox() {
        C0156 c0156 = new C0156(this.f74064, true);
        m50405(c0156);
        return c0156;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginEditTextBuilder addEditBox(String str) {
        C0156 c0156 = new C0156(this.f74064, true);
        c0156.id(str);
        m50405(c0156);
        return c0156;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView() {
        C12152 c12152 = new C12152(this.f74064);
        m50405(c12152);
        return c12152;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginImageViewBuilder addImageView(String str) {
        C12152 c12152 = new C12152(this.f74064);
        c12152.id(str);
        m50405(c12152);
        return c12152;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout() {
        C17090 c17090 = new C17090(this.f74064, this.f74063.f48883, 0);
        m50405(c17090);
        return c17090;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addHorizontalLayout(String str) {
        C17090 c17090 = new C17090(this.f74064, this.f74063.f48883, 0);
        c17090.id(str);
        m50405(c17090);
        return c17090;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout() {
        C17090 c17090 = new C17090(this.f74064, this.f74063.f48883, 1);
        m50405(c17090);
        return c17090;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginLinearLayoutBuilder addVerticalLayout(String str) {
        C17090 c17090 = new C17090(this.f74064, this.f74063.f48883, 1);
        c17090.id(str);
        m50405(c17090);
        return c17090;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout() {
        C16385 c16385 = new C16385(this.f74064, this.f74063.f48883);
        m50405(c16385);
        return c16385;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginFrameLayoutBuilder addFrameLayout(String str) {
        C16385 c16385 = new C16385(this.f74064, this.f74063.f48883);
        c16385.id(str);
        m50405(c16385);
        return c16385;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(boolean z) {
        C14269 c14269 = new C14269(this.f74064, this.f74063.f48883, z ? 1 : 0);
        m50405(c14269);
        return c14269;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginRadioGroupBuilder addRadioGroup(String str, boolean z) {
        C14269 c14269 = new C14269(this.f74064, this.f74063.f48883, z ? 1 : 0);
        c14269.id(str);
        m50405(c14269);
        return c14269;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginUIBuilder
    public final PluginView build() {
        throw new UnsupportedOperationException("Method 'build()' is not supported by this PluginUIBuilder");
    }
}
