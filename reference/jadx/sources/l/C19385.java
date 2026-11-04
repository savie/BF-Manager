package l;

/* JADX INFO: renamed from: l.ᩳ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes5.dex */
public class C19385 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f62628;

    public C19385() {
        this.f62628 = new byte[32];
    }

    public C19385(C19385 c19385) {
        byte[] bArr = new byte[32];
        this.f62628 = bArr;
        System.arraycopy(c19385.f62628, 0, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44829(String str, int i) {
        int iM44826 = m44826(str);
        if (i < 255) {
            this.f62628[iM44826] = (byte) (i + 1);
        } else {
            this.f62628[iM44826] = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44828(int i) {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f62628;
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
    public int m44827(Object obj) {
        return (this.f62628[m44826(obj)] & 255) - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m44826(Object obj) {
        return obj.hashCode() & (this.f62628.length - 1);
    }
}
