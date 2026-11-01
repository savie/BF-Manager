package l;

/* JADX INFO: renamed from: l.֨᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1424 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f5873;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5874;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f5875;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C7027 f5876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1900 f5877;

    public C1424(InterfaceC2916 interfaceC2916, C1900 c1900, C7027 c7027) {
        this.f5875 = interfaceC2916;
        this.f5877 = c1900;
        this.f5876 = c7027;
        this.f5874 = interfaceC2916.mo2395();
        int length = interfaceC2916.length();
        this.f5873 = length;
        if (c7027.m18860() != length) {
            throw new IllegalArgumentException("Line background store length differs from text");
        }
    }
}
