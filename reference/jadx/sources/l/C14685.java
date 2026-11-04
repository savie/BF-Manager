package l;

import bin.mt.plugin.api.regex.MatcherSnapshot;

/* JADX INFO: renamed from: l.ܰܶۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97NX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14685 implements MatcherSnapshot, InterfaceC0516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f47996;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f47997;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f47998;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f47999;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f48000;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18415 f48001;

    public C14685() {
        this.f47997 = new int[2];
    }

    public C14685(C4245 c4245) {
        this.f47997 = new int[2];
        this.f48001 = c4245.pattern();
        this.f47998 = c4245.getText();
        this.f47996 = c4245.m13564();
        int iGroupCount = c4245.groupCount();
        this.f48000 = iGroupCount;
        int i = iGroupCount + 1;
        int i2 = i * 2;
        if (this.f47997.length < i2) {
            this.f47997 = new int[i2];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f47997[i3] = c4245.start(i4);
            i3 += 2;
            this.f47997[i5] = c4245.end(i4);
        }
        this.f47999 = null;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC0516
    public final CharSequence getText() {
        return this.f47998;
    }

    @Override // l.InterfaceC0516
    /* JADX INFO: renamed from: ۙ */
    public final void mo2478() {
        Runnable runnable = this.f47996;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final int start() {
        return this.f47997[0];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final int end() {
        return this.f47997[1];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String group() {
        return group(0);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC0516
    public final String group(int i) {
        if (i >= 0 && i <= this.f48000) {
            int i2 = i * 2;
            int[] iArr = this.f47997;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 != -1 && i4 != -1) {
                return this.f47998.subSequence(i3, i4).toString();
            }
        }
        return "";
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC0516
    public final int groupCount() {
        return this.f48000;
    }

    @Override // l.InterfaceC0516
    public final C18415 pattern() {
        return this.f48001;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String expandReplacement(String str) {
        StringBuilder sb = new StringBuilder();
        C7974.m21760(this, sb, str);
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C7974.m21760(this, sb, str);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void prepareReplacement(String str) {
        this.f47999 = expandReplacement(str);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String getComputedReplacement() {
        String str = this.f47999;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Please call prepareReplacement() first");
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void clearComputedReplacement() {
        this.f47999 = null;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC0516
    public final int end(int i) {
        if (i < 0 || i > this.f48000) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "No group "));
        }
        return this.f47997[(i * 2) + 1];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC0516
    public final int start(int i) {
        if (i < 0 || i > this.f48000) {
            throw new IndexOutOfBoundsException(C13645.m33382(i, "No group "));
        }
        return this.f47997[i * 2];
    }
}
