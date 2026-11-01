package l;

import bin.mt.plugin.api.regex.Matcher;
import bin.mt.plugin.api.regex.MatcherSnapshot;
import bin.mt.plugin.api.regex.Pattern;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6222 implements Matcher, InterfaceC1988 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7324 f21141;

    public C6222(C14690 c14690, CharSequence charSequence) {
        this.f21141 = new C7324(c14690, c14690.m35222(), charSequence);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m17260() {
        this.f21141.m19532();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m17259() {
        return this.f21141.m19533();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m17269() {
        return this.f21141.m19580();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17262(long j) {
        this.f21141.m19540(j);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Pattern pattern() {
        return this.f21141.pattern();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final C14690 pattern() {
        return this.f21141.pattern();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17264(C14690 c14690) {
        this.f21141.m19544(c14690, c14690.m35222());
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC1988
    public final CharSequence getText() {
        return this.f21141.getText();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher reset() {
        this.f21141.m19577();
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher reset(CharSequence charSequence) {
        this.f21141.m19541(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: reset, reason: collision with other method in class */
    public final void m17276reset(CharSequence charSequence) {
        this.f21141.m19541(charSequence);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int start() {
        return this.f21141.m19573();
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC1988
    public final int start(int i) {
        return this.f21141.start(i);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m17271(String str) {
        return this.f21141.m19549(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int end() {
        return this.f21141.m19559();
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC1988
    public final int end(int i) {
        return this.f21141.end(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String group() {
        return this.f21141.group(0);
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC1988
    public final String group(int i) {
        return this.f21141.group(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17261(String str) {
        return this.f21141.m19565(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC1988
    public final int groupCount() {
        return this.f21141.groupCount();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String expandReplacement(String str) {
        C7324 c7324 = this.f21141;
        c7324.getClass();
        StringBuilder sb = new StringBuilder();
        C9751.m24731(c7324, sb, str);
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C7324 c7324 = this.f21141;
        c7324.getClass();
        C9751.m24731(c7324, sb, str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean matches() {
        return this.f21141.m19576();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean find() {
        return this.f21141.m19535();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean find(int i) {
        return this.f21141.m19569(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean lookingAt() {
        return this.f21141.m19555();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean lookingAt(int i) {
        return this.f21141.m19562(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final MatcherSnapshot toSnapshot() {
        return new C11162(this);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final C11162 toSnapshot() {
        return new C11162(this);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher appendReplacement(StringBuilder sb, String str) {
        this.f21141.m19543(sb, str);
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final StringBuilder appendTail(StringBuilder sb) {
        this.f21141.m19539(sb);
        return sb;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String replaceAll(String str) {
        return this.f21141.m19560(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String replaceFirst(String str) {
        return this.f21141.m19534(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher region(int i, int i2) {
        this.f21141.m19566(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: region, reason: collision with other method in class */
    public final void m17275region(int i, int i2) {
        this.f21141.m19566(i, i2);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int regionStart() {
        return this.f21141.m19578();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int regionEnd() {
        return this.f21141.m19554();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hasTransparentBounds() {
        return this.f21141.m19574();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher useTransparentBounds(boolean z) {
        this.f21141.m19561(z);
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hasAnchoringBounds() {
        return this.f21141.m19553();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher useAnchoringBounds(boolean z) {
        this.f21141.m19567(z);
        return this;
    }

    public final String toString() {
        return this.f21141.toString();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hitEnd() {
        return this.f21141.m19575();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean requireEnd() {
        return this.f21141.m19571();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher setTimeoutMillis(int i) {
        this.f21141.m19551(i);
        return this;
    }

    /* JADX INFO: renamed from: setTimeoutMillis, reason: collision with other method in class */
    public final void m17277setTimeoutMillis(int i) {
        this.f21141.m19551(i);
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m17274() {
        this.f21141.m19563();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17263(Runnable runnable) {
        this.f21141.m19542(runnable);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Runnable m17272() {
        return this.f21141.m19550();
    }

    @Override // l.InterfaceC1988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6401() {
        this.f21141.mo6401();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int getTimeoutMillis() {
        return this.f21141.m19537();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m17270() {
        return this.f21141.m19579();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m17258() {
        return this.f21141.m19570();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m17273() {
        return this.f21141.m19582();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m17268() {
        this.f21141.m19572();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17266(int i) {
        return this.f21141.m19546(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17265(boolean z) {
        this.f21141.m19545(z);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ArrayList m17267() {
        return this.f21141.m19564();
    }
}
