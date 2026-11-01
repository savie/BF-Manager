package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۜ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5SH */
/* JADX INFO: loaded from: classes2.dex */
public final class C6768 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22997 f22854;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6768 f22855;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6768 f22857;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22859;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f22860;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public LinkedList f22858 = new LinkedList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f22856 = -1;

    public C6768(C22997 c22997, int i, int i2) {
        this.f22854 = c22997;
        this.f22857 = null;
        this.f22855 = null;
        this.f22860 = i;
        this.f22859 = i2;
        this.f22857 = null;
        this.f22855 = null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18349(C6768 c6768) {
        C6768 c6769 = this.f22857;
        c6769.f22855 = c6768;
        c6768.f22857 = c6769;
        this.f22857 = c6768;
        c6768.f22855 = this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6768 m18348(int i) {
        C6768 c6768 = new C6768(this.f22854, i, this.f22859);
        c6768.f22856 = this.f22856;
        c6768.f22858.addAll(this.f22858);
        C6768 c6769 = this.f22855;
        c6769.f22857 = c6768;
        c6768.f22855 = c6769;
        this.f22855 = c6768;
        c6768.f22857 = this;
        this.f22859 = i;
        return c6768;
    }
}
