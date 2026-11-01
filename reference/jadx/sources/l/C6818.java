package l;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ۜܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LW */
/* JADX INFO: loaded from: classes3.dex */
public final class C6818 implements InterfaceC15785 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15785 f22980;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CipherInputStream f22981;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f22982;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f22983;

    public C6818(InterfaceC15785 interfaceC15785, byte[] bArr, byte[] bArr2) {
        this.f22980 = interfaceC15785;
        this.f22982 = bArr;
        this.f22983 = bArr2;
    }

    @Override // l.InterfaceC6942
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f22981.getClass();
        int i3 = this.f22981.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۚ */
    public final Uri mo9274() {
        return this.f22980.mo9274();
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final Map mo9273() {
        return this.f22980.mo9273();
    }

    @Override // l.InterfaceC15785
    public final void close() {
        if (this.f22981 != null) {
            this.f22981 = null;
            this.f22980.close();
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final long mo9272(C12257 c12257) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f22982, "AES"), new IvParameterSpec(this.f22983));
                C0261 c0261 = new C0261(this.f22980, c12257);
                this.f22981 = new CipherInputStream(c0261, cipher);
                c0261.m1760();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l.InterfaceC15785
    /* JADX INFO: renamed from: ۙ */
    public final void mo11161(InterfaceC19706 interfaceC19706) {
        interfaceC19706.getClass();
        this.f22980.mo11161(interfaceC19706);
    }
}
