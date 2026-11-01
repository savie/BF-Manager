package l;

/* JADX INFO: renamed from: l.ܶ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9YE */
/* JADX INFO: loaded from: classes5.dex */
public final class C15104 extends AbstractC6240 {

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f49324;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int m36180() {
        return this.f49324;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        if (C4850.m13545(i, bArr) != 17) {
            throw new C2796("Expected structureSize = 17");
        }
        this.f49324 = C4850.m13549(i + 4, bArr);
        C4850.m13549(i + 8, bArr);
        return (i + 16) - i;
    }
}
