package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A88Y */
/* JADX INFO: loaded from: classes.dex */
public final class C22934 extends AbstractC6705 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8823 f74553;

    public C22934(C8823 c8823) {
        this.f74553 = c8823;
    }

    @Override // l.AbstractC6705
    /* JADX INFO: renamed from: ۙ */
    public final int mo18120(byte[] bArr, byte[] bArr2) throws IOException {
        byte[] bArrM22959 = this.f74553.m22959(bArr);
        System.arraycopy(bArrM22959, 0, bArr2, 0, bArrM22959.length);
        return bArrM22959.length;
    }

    @Override // l.AbstractC6705
    /* JADX INFO: renamed from: ܰ */
    public final void mo18123(byte[] bArr) {
        this.f74553.write(bArr);
    }

    @Override // l.AbstractC6705
    /* JADX INFO: renamed from: ۙ */
    public final int mo18119(byte[] bArr) {
        byte[] bArr2 = this.f74553.read();
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        return bArr2.length;
    }
}
