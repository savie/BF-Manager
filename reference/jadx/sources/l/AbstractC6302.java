package l;

/* JADX INFO: renamed from: l.ۛ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: V42A */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6302 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23942 f21322;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC11242 mo17388(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC11242 mo17390(char[] cArr, int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo17391();

    public AbstractC6302(C23942 c23942) {
        this.f21322 = c23942;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11242 m17389(String str) {
        char[] charArray = str.toCharArray();
        return mo17390(charArray, charArray.length);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m17387(int i, int i2, byte[] bArr) {
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
    public static boolean m17386(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        while (i4 < i3 && bArr[i + i4] == bArr2[i2 + i4]) {
            i4++;
        }
        return i4 == i3;
    }
}
