package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: l.ۛ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6025 implements Comparable {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f20607;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f20608;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public String f20609;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f20610;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f20611;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f20613;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Bitmap f20614;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f20615;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f20606 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11990 f20616 = new C11990();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f20612 = Integer.MIN_VALUE;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f20611 - ((C6025) obj).f20611;
        if (j == 0) {
            return 0;
        }
        return j > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6025 m17499(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ (i ^ length));
        }
        C20348 c20348M46739 = C20348.m46739(bArr);
        C6025 c6025 = new C6025();
        c6025.f20607 = c20348M46739.m46758();
        c6025.f20608 = c20348M46739.m46758();
        c6025.f20613 = c20348M46739.m46758();
        c6025.f20615 = c20348M46739.m46758();
        c6025.f20610 = c20348M46739.m46758();
        c6025.f20609 = c20348M46739.m46758();
        byte[] bArrM46748 = c20348M46739.m46748();
        c6025.f20614 = BitmapFactory.decodeByteArray(bArrM46748, 0, bArrM46748.length);
        c6025.f20611 = c20348M46739.readLong();
        c6025.f20616.m30128(c20348M46739.m46758());
        return c6025;
    }
}
