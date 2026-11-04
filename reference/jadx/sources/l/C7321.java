package l;

import java.security.SecureRandom;

/* JADX INFO: renamed from: l.ۜᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7321 implements InterfaceC10502 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SecureRandom f24115;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f24116 = new byte[16];

    public C7321() {
        this.f24115 = null;
        this.f24115 = new SecureRandom();
    }

    @Override // l.InterfaceC10502
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo20077(int i, int i2, byte[] bArr) {
        if (i2 > this.f24116.length) {
            this.f24116 = new byte[i2];
        }
        this.f24115.nextBytes(this.f24116);
        System.arraycopy(this.f24116, 0, bArr, i, i2);
    }
}
