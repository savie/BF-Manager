package l;

import bin.mt.plugin.api.regex.MatcherSnapshot;

/* JADX INFO: renamed from: l.ۧᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11162 implements MatcherSnapshot, InterfaceC1988 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14690 f37838;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Runnable f37839;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f37840;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int[] f37841;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f37842;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CharSequence f37843;

    public C11162() {
        this.f37841 = new int[2];
    }

    public C11162(C6222 c6222) {
        this.f37841 = new int[2];
        this.f37838 = c6222.pattern();
        this.f37843 = c6222.getText();
        this.f37839 = c6222.m17272();
        int iGroupCount = c6222.groupCount();
        this.f37842 = iGroupCount;
        int i = iGroupCount + 1;
        int i2 = i * 2;
        if (this.f37841.length < i2) {
            this.f37841 = new int[i2];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f37841[i3] = c6222.start(i4);
            i3 += 2;
            this.f37841[i5] = c6222.end(i4);
        }
        this.f37840 = null;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC1988
    public final CharSequence getText() {
        return this.f37843;
    }

    @Override // l.InterfaceC1988
    /* JADX INFO: renamed from: ۙ */
    public final void mo6401() {
        Runnable runnable = this.f37839;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final int start() {
        return this.f37841[0];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final int end() {
        return this.f37841[1];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String group() {
        return group(0);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC1988
    public final String group(int i) {
        if (i >= 0 && i <= this.f37842) {
            int i2 = i * 2;
            int[] iArr = this.f37841;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 != -1 && i4 != -1) {
                return this.f37843.subSequence(i3, i4).toString();
            }
        }
        return "";
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC1988
    public final int groupCount() {
        return this.f37842;
    }

    @Override // l.InterfaceC1988
    public final C14690 pattern() {
        return this.f37838;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String expandReplacement(String str) {
        StringBuilder sb = new StringBuilder();
        C9751.m24731(this, sb, str);
        return sb.toString();
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void expandReplacementInto(StringBuilder sb, String str) {
        C9751.m24731(this, sb, str);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void prepareReplacement(String str) {
        this.f37840 = expandReplacement(str);
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final String getComputedReplacement() {
        String str = this.f37840;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Please call prepareReplacement() first");
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot
    public final void clearComputedReplacement() {
        this.f37840 = null;
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC1988
    public final int end(int i) {
        if (i < 0 || i > this.f37842) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "No group "));
        }
        return this.f37841[(i * 2) + 1];
    }

    @Override // bin.mt.plugin.api.regex.MatcherSnapshot, l.InterfaceC1988
    public final int start(int i) {
        if (i < 0 || i > this.f37842) {
            throw new IndexOutOfBoundsException(C8479.m22141(i, "No group "));
        }
        return this.f37841[i * 2];
    }
}
