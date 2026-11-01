package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܿۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48EV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17097 implements InterfaceC10748 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f54554;

    public C17097(int i) {
        this.f54554 = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0091 A[PHI: r2
      0x0091: PHI (r2v10 int) = (r2v1 int), (r2v11 int) binds: [B:19:0x00a5, B:15:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // l.InterfaceC10748
    /* JADX INFO: renamed from: ۙ */
    public final int mo1309(int i, int i2, byte[] bArr) {
        int i3;
        int i4;
        int i5 = (i2 + i) - 8;
        int i6 = i;
        while (i6 <= i5) {
            byte b = bArr[i6];
            int i7 = b & 255;
            if (i7 == 239) {
                int i8 = i6 + 1;
                byte b2 = bArr[i8];
                if ((b2 & cb.k) == 0) {
                    int i9 = i6 + 2;
                    int i10 = i6 + 3;
                    int i11 = ((((b2 & 240) << 13) | ((bArr[i9] & 255) << 9)) | ((bArr[i10] & 255) << 1)) - ((this.f54554 + i6) - i);
                    bArr[i8] = (byte) ((b2 & 15) | ((i11 >>> 8) & 240));
                    bArr[i9] = (byte) (((i11 >>> 16) & 15) | ((i11 >>> 7) & 16) | ((i11 << 4) & BERTags.FLAGS));
                    bArr[i10] = (byte) (((i11 >>> 13) & 128) | ((i11 >>> 4) & 127));
                    i6 = i9;
                }
            } else if ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) == 23) {
                int i12 = ((bArr[i6 + 1] & 255) << 8) | i7;
                int i13 = i6 + 2;
                int i14 = i12 | ((bArr[i13] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                if ((i14 & 3712) != 0) {
                    i13 = i6 + 4;
                    int iM8155 = C2641.m8155(i13, bArr);
                    if ((((i14 << 8) ^ iM8155) & 1015811) != 3) {
                        i6 = i13;
                    } else {
                        i3 = (i14 & (-4096)) + (iM8155 >>> 20);
                        i4 = (iM8155 << 12) | 279;
                        C2641.m8156(i6, i4, bArr);
                        C2641.m8156(i6 + 4, i3, bArr);
                        i6 += 6;
                    }
                } else {
                    int i15 = i14 >>> 27;
                    if (((i14 - 12544) & 16256) >= (i15 & 29)) {
                        i6 = i13;
                    } else {
                        int iM8149 = C2641.m8149(i6 + 4, bArr) - ((this.f54554 + i6) - i);
                        i3 = (i14 >>> 12) | (iM8149 << 20);
                        i4 = ((iM8149 + 2048) & (-4096)) | 23 | (i15 << 7);
                        C2641.m8156(i6, i4, bArr);
                        C2641.m8156(i6 + 4, i3, bArr);
                        i6 += 6;
                    }
                }
            }
            i6 += 2;
        }
        int i16 = i6 - i;
        this.f54554 += i16;
        return i16;
    }
}
