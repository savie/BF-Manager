package l;

/* JADX INFO: renamed from: l.᩸ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22712 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15252 f73707;

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC19728 mo2068(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC19728 mo2069(char[] cArr, int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo2070();

    public AbstractC22712(C15252 c15252) {
        this.f73707 = c15252;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19728 m51194(String str) {
        char[] charArray = str.toCharArray();
        return mo2069(charArray, charArray.length);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m51193(int i, int i2, byte[] bArr) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = (i4 << 5) - i4;
            i3++;
            i4 = bArr[i] + i5;
            i++;
        }
        return i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51192(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i + i4] == bArr2[i2 + i4]) {
            i4++;
        }
        return i4 == i3;
    }
}
