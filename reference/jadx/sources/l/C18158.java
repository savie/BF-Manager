package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܿۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: A88Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C18158 extends AbstractC21142 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2496 f59360;

    public C18158(C2496 c2496) {
        this.f59360 = c2496;
    }

    @Override // l.AbstractC21142
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo42312(byte[] bArr, byte[] bArr2) throws IOException {
        byte[] bArrM8383 = this.f59360.m8383(bArr);
        System.arraycopy(bArrM8383, 0, bArr2, 0, bArrM8383.length);
        return bArrM8383.length;
    }

    @Override // l.AbstractC21142
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo42313(byte[] bArr) {
        this.f59360.write(bArr);
    }

    @Override // l.AbstractC21142
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo42311(byte[] bArr) {
        byte[] bArr2 = this.f59360.read();
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        return bArr2.length;
    }
}
