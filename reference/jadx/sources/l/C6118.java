package l;

/* JADX INFO: renamed from: l.ۛۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAJ8 */
/* JADX INFO: loaded from: classes3.dex */
public class C6118 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17656(int i, String str) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17657(int i, C17347 c17347) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17658(int i, C17347 c17347, String str, String str2, String str3) {
        throw null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo17659(C17347 c17347) {
        throw null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void mo17660(int i, C17347 c17347) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo17661(int i, C17347 c17347) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo17662(C17347 c17347) {
        throw null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m17655(C15000 c15000, int i, long j) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i2 = (iNumberOfLeadingZeros + 7) >> 3;
        c15000.m36129(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c15000.m36129((byte) j);
            j >>= 8;
            i2--;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17654(C15000 c15000, int i, long j) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i2 = (iNumberOfTrailingZeros + 7) >> 3;
        long j2 = j >> (64 - (i2 * 8));
        c15000.m36129(i | ((i2 - 1) << 5));
        while (i2 > 0) {
            c15000.m36129((byte) j2);
            j2 >>= 8;
            i2--;
        }
    }
}
