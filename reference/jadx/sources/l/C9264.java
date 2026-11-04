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

/* JADX INFO: renamed from: l.ۡۡۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47LW */
/* JADX INFO: loaded from: classes4.dex */
public final class C9264 implements InterfaceC13433 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public CipherInputStream f30125;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f30126;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f30127;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC13433 f30128;

    public C9264(InterfaceC13433 interfaceC13433, byte[] bArr, byte[] bArr2) {
        this.f30128 = interfaceC13433;
        this.f30126 = bArr;
        this.f30127 = bArr2;
    }

    @Override // l.InterfaceC9461
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.f30125.getClass();
        int i3 = this.f30125.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ᩴ */
    public final Uri mo8327() {
        return this.f30128.mo8327();
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final Map mo10893() {
        return this.f30128.mo10893();
    }

    @Override // l.InterfaceC13433
    public final void close() {
        if (this.f30125 != null) {
            this.f30125 = null;
            this.f30128.close();
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final long mo8326(C25368 c25368) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f30126, "AES"), new IvParameterSpec(this.f30127));
                C2247 c2247 = new C2247(this.f30128, c25368);
                this.f30125 = new CipherInputStream(c2247, cipher);
                c2247.m7664();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // l.InterfaceC13433
    /* JADX INFO: renamed from: ۙ */
    public final void mo10894(InterfaceC4639 interfaceC4639) {
        interfaceC4639.getClass();
        this.f30128.mo10894(interfaceC4639);
    }
}
