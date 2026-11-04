package l;

/* JADX INFO: renamed from: l.᩸᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YB */
/* JADX INFO: loaded from: classes.dex */
public final class C23054 extends AbstractC5154 {
    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ۙ */
    public final int mo4457(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4458(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC5154
    /* JADX INFO: renamed from: ᩸ */
    public final int mo4459(int i, byte[] bArr) {
        C19126 c19126 = this.f17968;
        int i2 = c19126.f61898;
        c19126.f61898 = 0;
        int iM44257 = c19126.m44257(i, bArr) + i;
        AbstractC5154.m15569(this.f17964, iM44257, bArr);
        AbstractC5154.m15569(this.f17960, iM44257 + 2, bArr);
        int i3 = (iM44257 + 4) - i;
        this.f17968.f61898 = i2;
        return i3;
    }

    @Override // l.AbstractC5154
    public final String toString() {
        return new String(C8947.m23910(new StringBuilder("NodeStatusRequest["), super.toString(), "]"));
    }
}
