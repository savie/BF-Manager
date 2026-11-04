package l;

/* JADX INFO: renamed from: l.ۖ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3025 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24655 f9811;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20661 f9812;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f9813;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f9814;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC9629 f9815;

    public C3025(C20661 c20661, InterfaceC9629 interfaceC9629, int i, int i2, int i3) {
        C17359.requireNonNull(c20661);
        this.f9812 = c20661;
        C17359.requireNonNull(interfaceC9629);
        this.f9815 = interfaceC9629;
        this.f9814 = i;
        this.f9813 = i2;
        this.f9811 = new C24655(i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m9836() {
        InterfaceC9629 interfaceC9629 = this.f9815;
        try {
            int iMo15344 = interfaceC9629.mo15344();
            int i = this.f9814;
            return iMo15344 == i && interfaceC9629.length() == this.f9813 && interfaceC9629.mo15344() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
