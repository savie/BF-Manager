package l;

import bin.mt.plugin.api.regex.Matcher;
import bin.mt.plugin.api.regex.MatcherSnapshot;
import bin.mt.plugin.api.regex.Pattern;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAYU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4245 implements Matcher, InterfaceC0516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23879 f15464;

    public C4245(C18415 c18415, CharSequence charSequence) {
        this.f15464 = new C23879(c18415, c18415.m42927(), charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13550() {
        this.f15464.m53364();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m13566() {
        return this.f15464.m53357();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m13558() {
        return this.f15464.m53359();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13552(long j) {
        this.f15464.m53338(j);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Pattern pattern() {
        return this.f15464.pattern();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final C18415 pattern() {
        return this.f15464.pattern();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13554(C18415 c18415) {
        this.f15464.m53342(c18415, c18415.m42927());
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC0516
    public final CharSequence getText() {
        return this.f15464.getText();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher reset() {
        this.f15464.m53370();
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher reset(CharSequence charSequence) {
        this.f15464.m53339(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: reset, reason: collision with other method in class */
    public final void m13568reset(CharSequence charSequence) {
        this.f15464.m53339(charSequence);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int start() {
        return this.f15464.m53349();
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC0516
    public final int start(int i) {
        return this.f15464.start(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13563(String str) {
        return this.f15464.m53366(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int end() {
        return this.f15464.m53351();
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC0516
    public final int end(int i) {
        return this.f15464.end(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String group() {
        return this.f15464.group(0);
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC0516
    public final String group(int i) {
        return this.f15464.group(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m13551(String str) {
        return this.f15464.m53371(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher, l.InterfaceC0516
    public final int groupCount() {
        return this.f15464.groupCount();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String expandReplacement(String str) {
        C23879 c23879 = this.f15464;
        c23879.getClass();
        StringBuilder sb = new StringBuilder();
        C7974.m21760(c23879, sb, str);
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C23879 c23879 = this.f15464;
        c23879.getClass();
        C7974.m21760(c23879, sb, str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean matches() {
        return this.f15464.m53369();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean find() {
        return this.f15464.m53378();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean find(int i) {
        return this.f15464.m53375(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean lookingAt() {
        return this.f15464.m53334();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean lookingAt(int i) {
        return this.f15464.m53354(i);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final MatcherSnapshot toSnapshot() {
        return new C14685(this);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final C14685 toSnapshot() {
        return new C14685(this);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher appendReplacement(StringBuilder sb, String str) {
        this.f15464.m53341(sb, str);
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final StringBuilder appendTail(StringBuilder sb) {
        this.f15464.m53337(sb);
        return sb;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String replaceAll(String str) {
        return this.f15464.m53352(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final String replaceFirst(String str) {
        return this.f15464.m53376(str);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher region(int i, int i2) {
        this.f15464.m53372(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: region, reason: collision with other method in class */
    public final void m13567region(int i, int i2) {
        this.f15464.m53372(i, i2);
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int regionStart() {
        return this.f15464.m53335();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int regionEnd() {
        return this.f15464.m53381();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hasTransparentBounds() {
        return this.f15464.m53361();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher useTransparentBounds(boolean z) {
        this.f15464.m53377(z);
        return this;
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hasAnchoringBounds() {
        return this.f15464.m53355();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher useAnchoringBounds(boolean z) {
        this.f15464.m53353(z);
        return this;
    }

    public final String toString() {
        return this.f15464.toString();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean hitEnd() {
        return this.f15464.m53380();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final boolean requireEnd() {
        return this.f15464.m53358();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final Matcher setTimeoutMillis(int i) {
        this.f15464.m53368(i);
        return this;
    }

    /* JADX INFO: renamed from: setTimeoutMillis, reason: collision with other method in class */
    public final void m13569setTimeoutMillis(int i) {
        this.f15464.m53368(i);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m13565(boolean z) {
        this.f15464.m53373(z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13553(Runnable runnable) {
        this.f15464.m53340(runnable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Runnable m13564() {
        return this.f15464.m53367();
    }

    @Override // l.InterfaceC0516
    /* JADX INFO: renamed from: ۙ */
    public final void mo2478() {
        this.f15464.mo2478();
    }

    @Override // bin.mt.plugin.api.regex.Matcher
    public final int getTimeoutMillis() {
        return this.f15464.m53333();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m13557() {
        return this.f15464.m53363();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m13560() {
        return this.f15464.m53362();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m13561() {
        return this.f15464.m53382();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13559() {
        this.f15464.m53332();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13556(int i) {
        return this.f15464.m53344(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13555(boolean z) {
        this.f15464.m53343(z);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ArrayList m13562() {
        return this.f15464.m53347();
    }
}
