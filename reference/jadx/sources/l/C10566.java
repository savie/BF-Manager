package l;

import java.security.SecureRandom;

/* JADX INFO: renamed from: l.ۤ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAYQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10566 implements InterfaceC20008 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public SecureRandom f36168;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public byte[] f36169 = new byte[16];

    public C10566() {
        this.f36168 = null;
        this.f36168 = new SecureRandom();
    }

    @Override // l.InterfaceC20008
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo26724(int i, int i2, byte[] bArr) {
        if (i2 > this.f36169.length) {
            this.f36169 = new byte[i2];
        }
        this.f36168.nextBytes(this.f36169);
        System.arraycopy(this.f36169, 0, bArr, i, i2);
    }
}
