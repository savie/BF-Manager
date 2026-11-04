package l;

import com.alipay.sdk.m.b0.a;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.᩷ᩳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7XL */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22238 implements InterfaceC21360 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Cipher f71633;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f71634;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f71635;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f71636;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public SecretKeySpec f71637;

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo3921(int i) {
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ boolean mo3926() {
        return false;
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public void mo3923(int i, byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2.length > 12) {
            byte[] bArr3 = new byte[12];
            System.arraycopy(bArr2, 0, bArr3, 0, 12);
            bArr2 = bArr3;
        }
        int blockSize = getBlockSize();
        if (bArr.length > blockSize) {
            byte[] bArr4 = new byte[blockSize];
            System.arraycopy(bArr, 0, bArr4, 0, blockSize);
            bArr = bArr4;
        }
        this.f71635 = i == 0 ? 1 : 2;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        this.f71634 = byteBufferWrap;
        this.f71636 = byteBufferWrap.getLong(4);
        try {
            this.f71637 = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(a.f);
            this.f71633 = cipher;
            cipher.init(this.f71635, this.f71637, new GCMParameterSpec(128, bArr2));
        } catch (Exception e) {
            this.f71633 = null;
            this.f71637 = null;
            this.f71634 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public void mo3922(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f71633.update(bArr, i, i2, bArr2, i3);
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ۙ */
    public void mo3924(byte[] bArr) {
        this.f71633.updateAAD(bArr, 0, 4);
    }

    @Override // l.InterfaceC21360
    /* JADX INFO: renamed from: ᩷ */
    public void mo3929(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, ShortBufferException, InvalidAlgorithmParameterException {
        this.f71633.doFinal(bArr, i, i2, bArr2, i3);
        long j = this.f71634.getLong(4) + 1;
        if (j == this.f71636) {
            throw new IllegalStateException("GCM IV would be reused");
        }
        this.f71634.putLong(4, j);
        this.f71633.init(this.f71635, this.f71637, new GCMParameterSpec(128, this.f71634.array()));
    }
}
