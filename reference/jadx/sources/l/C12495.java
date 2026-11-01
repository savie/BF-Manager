package l;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.۫ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97X8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12495 implements InterfaceC1142 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Cipher f41787;

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
        return true;
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
    public final void mo2386(int i, byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr2.length > 8) {
            byte[] bArr3 = new byte[8];
            System.arraycopy(bArr2, 0, bArr3, 0, 8);
            bArr2 = bArr3;
        }
        if (bArr.length > 16) {
            byte[] bArr4 = new byte[16];
            System.arraycopy(bArr, 0, bArr4, 0, 16);
            bArr = bArr4;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "Blowfish");
        Cipher cipher = Cipher.getInstance("Blowfish/CBC/NoPadding");
        this.f41787 = cipher;
        cipher.init(i == 0 ? 1 : 2, secretKeySpec, new IvParameterSpec(bArr2));
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final void mo2385(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f41787.update(bArr, i, i2, bArr2, i3);
    }
}
