package l;

/* JADX INFO: renamed from: l.ۨۚ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C11486 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f38655;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38656;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f38657;

    public C11486(int i) {
        this.f38655 = new int[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m28672() {
        return this.f38656;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28669(int i) {
        int i2 = this.f38656;
        int[] iArr = this.f38655;
        if (i2 == iArr.length) {
            throw new IllegalStateException("Code point window is full");
        }
        int length = this.f38657 + i2;
        if (length >= iArr.length) {
            length -= iArr.length;
        }
        iArr[length] = i;
        this.f38656 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28671(InterfaceC4429 interfaceC4429) {
        if (this.f38656 == 0) {
            throw new IllegalStateException("Code point window is empty");
        }
        int i = this.f38657;
        int[] iArr = this.f38655;
        interfaceC4429.mo12360(iArr[i]);
        int i2 = this.f38657 + 1;
        if (i2 == iArr.length) {
            i2 = 0;
        }
        this.f38657 = i2;
        this.f38656--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28670(int i, InterfaceC4429 interfaceC4429) {
        if (i < 0 || i > this.f38656) {
            throw new IllegalArgumentException("Code point count is out of range");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m28671(interfaceC4429);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m28673(InterfaceC4429 interfaceC4429) {
        m28670(this.f38656, interfaceC4429);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28668() {
        int length;
        int[] iArr;
        int i = this.f38656;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
            length = this.f38657 + i;
            iArr = this.f38655;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
        } while (iArr[length] != 10);
        return i;
    }
}
