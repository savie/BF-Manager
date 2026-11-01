package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: l.ۨܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11780 implements Comparable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Bitmap f39564;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f39565;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f39567;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f39568;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f39569;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f39570;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f39572;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f39574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39571 = -1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13897 f39573 = new C13897();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f39566 = Integer.MIN_VALUE;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f39574 - ((C11780) obj).f39574;
        if (j == 0) {
            return 0;
        }
        return j > 0 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11780 m29446(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ (i ^ length));
        }
        C17367 c17367M40440 = C17367.m40440(bArr);
        C11780 c11780 = new C11780();
        c11780.f39567 = c17367M40440.m40458();
        c11780.f39569 = c17367M40440.m40458();
        c11780.f39570 = c17367M40440.m40458();
        c11780.f39572 = c17367M40440.m40458();
        c11780.f39565 = c17367M40440.m40458();
        c11780.f39568 = c17367M40440.m40458();
        byte[] bArrM40451 = c17367M40440.m40451();
        c11780.f39564 = BitmapFactory.decodeByteArray(bArrM40451, 0, bArrM40451.length);
        c11780.f39574 = c17367M40440.readLong();
        c11780.f39573.m33734(c17367M40440.m40458());
        return c11780;
    }
}
