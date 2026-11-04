package l;

import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۜ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6993 implements InterfaceC21360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Cipher f23060;

    @Override // l.InterfaceC21360
    public final int getBlockSize() {
        return 32;
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
        return true;
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
        return 16;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3923(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 16) {
            byte[] bArr3 = new byte[16];
            System.arraycopy(bArr2, 0, bArr3, 0, 16);
            bArr2 = bArr3;
        }
        if (bArr.length > 32) {
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 0, bArr4, 0, 32);
            bArr = bArr4;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            this.f23060 = cipher;
            cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
        } catch (Exception e) {
            this.f23060 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final void mo3922(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f23060.update(bArr, i, i2, bArr2, i3);
    }
}
