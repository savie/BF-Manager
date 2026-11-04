package l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۤᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11049 implements InterfaceC21360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Cipher f34871;

    @Override // l.InterfaceC21360
    public final int getBlockSize() {
        return 16;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3921(int i) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3924(byte[] bArr) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3925() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo3926() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ boolean mo3927() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ int mo3928() {
        return 0;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ void mo3929(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩸ */
    public final int mo3930() {
        return 8;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            bArr = bArr3;
        }
        try {
            this.f34871 = Cipher.getInstance("RC4");
            this.f34871.init(i == 0 ? 1 : 2, new SecretKeySpec(bArr, "RC4"));
            byte[] bArr4 = new byte[1];
            for (int i2 = 0; i2 < 1536; i2++) {
                this.f34871.update(bArr4, 0, 1, bArr4, 0);
            }
        } catch (Exception e) {
            this.f34871 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f34871.update(bArr, i, i2, bArr2, i3);
    }
}
