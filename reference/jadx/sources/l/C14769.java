package l;

/* JADX INFO: renamed from: l.ܳ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81T3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14769 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f48292;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f48295;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f48294 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f48293 = new byte[40960];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m35392(byte[] bArr, boolean z) {
        int i;
        while (true) {
            i = this.f48292;
            if (i != 0 || !this.f48294) {
                break;
            }
            if (!z) {
                return 0;
            }
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f48294) {
            return -1;
        }
        int length = this.f48293.length;
        boolean z2 = length == i;
        int length2 = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (length2 > 0) {
            int i4 = this.f48292;
            if (i4 <= 0) {
                break;
            }
            int iMin = Math.min(length2, Math.min(length - this.f48295, i4));
            System.arraycopy(this.f48293, this.f48295, bArr, i3, iMin);
            int i5 = this.f48295 + iMin;
            this.f48295 = i5;
            if (i5 >= length) {
                this.f48295 = 0;
            }
            this.f48292 -= iMin;
            length2 -= iMin;
            i3 += iMin;
            i2 += iMin;
        }
        if (z2) {
            notify();
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m35393() {
        this.f48294 = false;
        notify();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m35394(int i, byte[] bArr) {
        int i2;
        int i3;
        if (i > bArr.length) {
            throw new IllegalArgumentException("length + offset > buffer.length");
        }
        if (i <= 0) {
            throw new IllegalArgumentException("length <= 0");
        }
        int length = this.f48293.length;
        synchronized (this) {
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i <= 0) {
                    return true;
                }
                while (true) {
                    try {
                        i2 = this.f48292;
                        if (length != i2 || !this.f48294) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!this.f48294) {
                    return false;
                }
                if (i2 != 0) {
                    z = false;
                }
                int iMin = Math.min(i, length - i2);
                i -= iMin;
                while (iMin > 0) {
                    int i5 = this.f48295;
                    int i6 = this.f48292 + i5;
                    if (i6 >= length) {
                        i6 -= length;
                        i3 = i5 - i6;
                    } else {
                        i3 = length - i6;
                    }
                    int iMin2 = Math.min(i3, iMin);
                    System.arraycopy(bArr, i4, this.f48293, i6, iMin2);
                    i4 += iMin2;
                    iMin -= iMin2;
                    this.f48292 += iMin2;
                }
                if (z) {
                    notify();
                }
            }
        }
    }
}
