package l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩶ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7VP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20256 implements InterfaceC1142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Cipher f65691;

    @Override // l.InterfaceC1142
    public final int getBlockSize() {
        return 16;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۖ */
    public final int mo2383() {
        return 8;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2384(int i) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2387(byte[] bArr) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2388() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۚ */
    public final /* synthetic */ boolean mo2389() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo2390() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ int mo2391() {
        return 0;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ void mo2392(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final void mo2386(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            bArr = bArr3;
        }
        try {
            this.f65691 = Cipher.getInstance("RC4");
            this.f65691.init(i == 0 ? 1 : 2, new SecretKeySpec(bArr, "RC4"));
            byte[] bArr4 = new byte[1];
            for (int i2 = 0; i2 < 1536; i2++) {
                this.f65691.update(bArr4, 0, 1, bArr4, 0);
            }
        } catch (Exception e) {
            this.f65691 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final void mo2385(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f65691.update(bArr, i, i2, bArr2, i3);
    }
}
