package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: X9ZV */
/* JADX INFO: loaded from: classes3.dex */
public final class C6646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f22175;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f22176;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object[] f22177;

    public C6646(C21540 c21540) {
        int iM35716 = c21540.m35716();
        int iM35703 = c21540.m35703();
        this.f22176 = 0;
        this.f22177 = new Object[iM35716];
        this.f22175 = iM35703;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m18585() {
        synchronized (this.f22177) {
            if (this.f22176 > 0) {
                int i = 0;
                while (true) {
                    Object[] objArr = this.f22177;
                    if (i >= objArr.length) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (obj != null) {
                        byte[] bArr = (byte[]) obj;
                        objArr[i] = null;
                        this.f22176--;
                        return bArr;
                    }
                    i++;
                }
            }
            return new byte[this.f22175];
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18584(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = 0;
        Arrays.fill(bArr, (byte) 0);
        synchronized (this.f22177) {
            if (this.f22176 < this.f22177.length) {
                while (true) {
                    Object[] objArr = this.f22177;
                    if (i >= objArr.length) {
                        break;
                    }
                    if (objArr[i] == null) {
                        objArr[i] = bArr;
                        this.f22176++;
                        return;
                    }
                    i++;
                }
            }
        }
    }
}
