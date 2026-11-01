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

/* JADX INFO: renamed from: l.ܺܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7XL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16023 implements InterfaceC1142 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public SecretKeySpec f51851;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Cipher f51852;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f51853;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f51854;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f51855;

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo2384(int i) {
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ boolean mo2390() {
        return false;
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public void mo2386(int i, byte[] bArr, byte[] bArr2) throws Exception {
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
        this.f51853 = i == 0 ? 1 : 2;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr2);
        this.f51854 = byteBufferWrap;
        this.f51855 = byteBufferWrap.getLong(4);
        try {
            this.f51851 = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(a.f);
            this.f51852 = cipher;
            cipher.init(this.f51853, this.f51851, new GCMParameterSpec(128, bArr2));
        } catch (Exception e) {
            this.f51852 = null;
            this.f51851 = null;
            this.f51854 = null;
            throw e;
        }
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public void mo2385(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        this.f51852.update(bArr, i, i2, bArr2, i3);
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ۙ */
    public void mo2387(byte[] bArr) {
        this.f51852.updateAAD(bArr, 0, 4);
    }

    @Override // l.InterfaceC1142
    /* JADX INFO: renamed from: ܰ */
    public void mo2392(int i, byte[] bArr, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, ShortBufferException, InvalidAlgorithmParameterException {
        this.f51852.doFinal(bArr, i, i2, bArr2, i3);
        long j = this.f51854.getLong(4) + 1;
        if (j == this.f51855) {
            throw new IllegalStateException("GCM IV would be reused");
        }
        this.f51854.putLong(4, j);
        this.f51852.init(this.f51853, this.f51851, new GCMParameterSpec(128, this.f51854.array()));
    }
}
