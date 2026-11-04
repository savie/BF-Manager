package l;

/* JADX INFO: renamed from: l.ۢܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K9V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10175 extends AbstractC5154 {
    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4458(int i, byte[] bArr) {
        return 0;
    }

    public C10175(InterfaceC5878 interfaceC5878, C19126 c19126) {
        super(interfaceC5878);
        this.f17968 = c19126;
        this.f17964 = 32;
    }

    @Override // l.AbstractC5154
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("NameQueryRequest["), super.toString(), "]"));
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩸ */
    public final int mo4459(int i, byte[] bArr) {
        int iM44257 = this.f17968.m44257(i, bArr) + i;
        AbstractC5154.m15569(this.f17964, iM44257, bArr);
        AbstractC5154.m15569(this.f17960, iM44257 + 2, bArr);
        return (iM44257 + 4) - i;
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ۙ */
    public final int mo4457(int i, byte[] bArr) {
        int iM44255 = this.f17968.m44255(i, bArr) + i;
        this.f17964 = AbstractC5154.m15571(iM44255, bArr);
        this.f17960 = AbstractC5154.m15571(iM44255 + 2, bArr);
        return (iM44255 + 4) - i;
    }
}
