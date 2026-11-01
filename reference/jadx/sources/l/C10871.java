package l;

/* JADX INFO: renamed from: l.ۧ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8A3D */
/* JADX INFO: loaded from: classes4.dex */
public final class C10871 extends AbstractC17529 {

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f36961;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public int f36962;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f36963;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f36964;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) {
        return 0;
    }

    public C10871(InterfaceC19067 interfaceC19067, int i, int i2, long j, byte[] bArr) {
        super(interfaceC19067.mo29449(), 1);
        this.f36962 = i;
        this.f36961 = i2;
        this.f36964 = j;
        this.f36963 = bArr;
    }

    @Override // l.AbstractC17529
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6240 mo3799(InterfaceC19067 interfaceC19067) {
        return new C23571(interfaceC19067.mo29449());
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo27236(AbstractC12591 abstractC12591) {
        abstractC12591.mo24572(-1L);
        return super.mo27236(abstractC12591);
    }

    @Override // l.InterfaceC3314
    public final int size() {
        byte[] bArr = this.f36963;
        return AbstractC12591.m31337((bArr != null ? bArr.length : 0) + 88);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        C4850.m13546(25L, i, bArr);
        bArr[i + 2] = (byte) 0;
        bArr[i + 3] = (byte) this.f36962;
        C4850.m13550(this.f36961, i + 4, bArr);
        C4850.m13550(0L, i + 8, bArr);
        int i2 = i + 12;
        int i3 = i + 14;
        byte[] bArr2 = this.f36963;
        C4850.m13546(bArr2 != null ? bArr2.length : 0L, i3, bArr);
        C4850.m13548(this.f36964, i + 16, bArr);
        int i4 = i + 24;
        C4850.m13546(i4 - m31366(), i2, bArr);
        int iM31338 = i4 + m31338(i4);
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, iM31338, bArr2.length);
            iM31338 += bArr2.length;
        }
        return iM31338 - i;
    }
}
