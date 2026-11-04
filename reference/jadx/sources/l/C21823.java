package l;

/* JADX INFO: renamed from: l.᩷ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M45G */
/* JADX INFO: loaded from: classes.dex */
public final class C21823 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4669[] f69566;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f69567;

    public C21823(int i, C4669... c4669Arr) {
        this.f69567 = i;
        this.f69566 = c4669Arr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m49475() {
        return this.f69567;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49474() {
        int iM14521 = 0;
        for (C4669 c4669 : this.f69566) {
            iM14521 += c4669.m14521();
        }
        return iM14521;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m49476() {
        return m49474() * this.f69567;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4669[] m49473() {
        return this.f69566;
    }
}
