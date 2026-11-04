package l;

/* JADX INFO: renamed from: l.᩷ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9YE */
/* JADX INFO: loaded from: classes2.dex */
public final class C22110 extends AbstractC12108 {

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f71259;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int m50065() {
        return this.f71259;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        if (C0481.m2318(i, bArr) != 17) {
            throw new C19061("Expected structureSize = 17");
        }
        this.f71259 = C0481.m2322(i + 4, bArr);
        C0481.m2322(i + 8, bArr);
        return (i + 16) - i;
    }
}
