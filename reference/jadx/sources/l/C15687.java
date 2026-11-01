package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.math.ec.rfc7748.X25519Field;

/* JADX INFO: renamed from: l.ܺۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8EM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15687 implements InterfaceC10748 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50928;

    public C15687(int i) {
        this.f50928 = i;
    }

    @Override // l.InterfaceC10748
    /* JADX INFO: renamed from: ۙ */
    public final int mo1309(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            byte b = bArr[i4 + 3];
            if ((b & Poly1305KeyGenerator.R_MASK_LOW_2) == 148) {
                C2641.m8156(i4, ((C2641.m8155(i4, bArr) + (-(((this.f50928 + i4) - i) >>> 2))) & X25519Field.M26) | (-1811939328), bArr);
            } else if ((b & 159) == 144) {
                int iM8155 = C2641.m8155(i4, bArr);
                int i5 = ((iM8155 >>> 29) & 3) | ((iM8155 >>> 3) & 2097148);
                if (((i5 + WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) & 1835008) == 0) {
                    int i6 = i5 + (-(((this.f50928 + i4) - i) >>> 12));
                    C2641.m8156(i4, (iM8155 & (-1879048161)) | ((i6 & 3) << 29) | ((262140 & i6) << 3) | ((-(i6 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT)) & 14680064), bArr);
                }
            }
            i4 += 4;
        }
        int i7 = i4 - i;
        this.f50928 += i7;
        return i7;
    }
}
