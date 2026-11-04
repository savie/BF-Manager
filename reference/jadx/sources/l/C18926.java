package l;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ᩳ۟ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7X2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18926 implements InterfaceC3570 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7739 f61396;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f61397;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f61398;

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final void mo11615(HashMap map) throws C2079 {
        throw new C2079("initWithPPKv3Header() not supported");
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final void mo11616(byte[] bArr) {
        C9866 c9866 = new C9866(bArr);
        this.f61397 = c9866.m25649();
        this.f61398 = c9866.m25658();
        this.f61396 = new C7739();
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ᩷ */
    public final void mo11618(byte[] bArr) throws C2079 {
        throw new C2079("initWithASN1() not supported");
    }

    @Override // l.InterfaceC3570
    /* JADX INFO: renamed from: ۙ */
    public final byte[] mo11617(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        C7739 c7739 = this.f61396;
        byte[] bArr3 = this.f61397;
        int i2 = this.f61398;
        c7739.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
            int i3 = (i + 31) / 32;
            byte[] bArrDigest = messageDigest.digest(bArr);
            byte[] bArr4 = new byte[64];
            byte[] bArr5 = new byte[32];
            byte[] bArr6 = new byte[32];
            int i4 = 1;
            while (i4 <= i3) {
                byte[] bArr7 = bArr2;
                messageDigest.reset();
                messageDigest.update(bArr3);
                messageDigest.update(new byte[]{(byte) ((i4 >> 24) & 255), (byte) ((i4 >> 16) & 255), (byte) ((i4 >> 8) & 255), (byte) (i4 & 255)});
                messageDigest.digest(bArr4, 0, 64);
                c7739.m21067(bArrDigest, bArr4, bArr5);
                System.arraycopy(bArr5, 0, bArr6, 0, 32);
                for (int i5 = 1; i5 < i2; i5++) {
                    messageDigest.reset();
                    messageDigest.update(bArr6);
                    messageDigest.digest(bArr4, 0, 64);
                    c7739.m21067(bArrDigest, bArr4, bArr6);
                    for (int i6 = 0; i6 < 32; i6++) {
                        bArr5[i6] = (byte) (bArr5[i6] ^ bArr6[i6]);
                    }
                }
                for (int i7 = 0; i7 < 32; i7++) {
                    int i8 = (i4 - 1) + (i7 * i3);
                    if (i8 < i) {
                        bArr7[i8] = bArr5[i7];
                    }
                }
                i4++;
                bArr2 = bArr7;
            }
            return bArr2;
        } catch (DigestException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
