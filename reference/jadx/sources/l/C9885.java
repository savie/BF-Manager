package l;

/* JADX INFO: renamed from: l.ۢ᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes3.dex */
public class C9885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f33733;

    public C9885() {
        this.f33733 = new byte[32];
    }

    public C9885(C9885 c9885) {
        byte[] bArr = new byte[32];
        this.f33733 = bArr;
        System.arraycopy(c9885.f33733, 0, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24977(String str, int i) {
        int iM24974 = m24974(str);
        if (i < 255) {
            this.f33733[iM24974] = (byte) (i + 1);
        } else {
            this.f33733[iM24974] = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m24976(int i) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f33733;
            if (i2 >= bArr.length) {
                return;
            }
            byte b = bArr[i2];
            int i3 = i + 1;
            if ((b & 255) == i3) {
                bArr[i2] = 0;
            } else if ((b & 255) > i3) {
                bArr[i2] = (byte) (b - 1);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int m24975(Object obj) {
        return (this.f33733[m24974(obj)] & 255) - 1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private int m24974(Object obj) {
        return obj.hashCode() & (this.f33733.length - 1);
    }
}
