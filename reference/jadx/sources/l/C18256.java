package l;

/* JADX INFO: renamed from: l.ᩳ᩵۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YB */
/* JADX INFO: loaded from: classes5.dex */
public final class C18256 extends AbstractC23196 {
    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۙ */
    public final int mo8342(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ܰ */
    public final int mo8343(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC23196
    /* JADX INFO: renamed from: ۖ */
    public final int mo8341(int i, byte[] bArr) {
        C11907 c11907 = this.f75282;
        int i2 = c11907.f39951;
        c11907.f39951 = 0;
        int iM29702 = c11907.m29702(i, bArr) + i;
        AbstractC23196.m51222(this.f75283, iM29702, bArr);
        AbstractC23196.m51222(this.f75281, iM29702 + 2, bArr);
        int i3 = (iM29702 + 4) - i;
        this.f75282.f39951 = i2;
        return i3;
    }

    @Override // l.AbstractC23196
    public final String toString() {
        return new String(C22697.m50267(new StringBuilder("NodeStatusRequest["), super.toString(), "]"));
    }
}
