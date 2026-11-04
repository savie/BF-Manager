package l;

/* JADX INFO: renamed from: l.ۡܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X8LV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9496 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f30769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f30770;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long[] f30771;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18010 f30772;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f30773;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f30774;

    public C9496(C18010 c18010, long j, long j2, long[] jArr, int i, int i2) {
        C18010 c18011 = new C18010();
        c18011.f58965 = c18010.f58965;
        c18011.f58969 = c18010.f58969;
        c18011.f58964 = c18010.f58964;
        c18011.f58967 = c18010.f58967;
        c18011.f58968 = c18010.f58968;
        c18011.f58963 = c18010.f58963;
        c18011.f58966 = c18010.f58966;
        this.f30772 = c18011;
        this.f30774 = j;
        this.f30769 = j2;
        this.f30771 = jArr;
        this.f30773 = i;
        this.f30770 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9496 m24874(C18010 c18010, C21287 c21287) {
        long[] jArr;
        int i;
        int i2;
        int iM48500 = c21287.m48500();
        int iM48512 = (iM48500 & 1) != 0 ? c21287.m48512() : -1;
        long jM48485 = (iM48500 & 2) != 0 ? c21287.m48485() : -1L;
        if ((iM48500 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = c21287.m48493();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iM48500 & 8) != 0) {
            c21287.m48503(4);
        }
        if (c21287.m48486() >= 24) {
            c21287.m48503(21);
            int iM48501 = c21287.m48501();
            i2 = iM48501 & 4095;
            i = (16773120 & iM48501) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new C9496(c18010, iM48512, jM48485, jArr, i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m24875() {
        long j = this.f30774;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        C18010 c18010 = this.f30772;
        return C7116.m19473(c18010.f58967, (j * ((long) c18010.f58966)) - 1);
    }
}
