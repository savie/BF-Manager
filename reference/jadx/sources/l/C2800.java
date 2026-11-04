package l;

/* JADX INFO: renamed from: l.ۖܽ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2800 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f9210;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f9211;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f9212;

    public C2800(int i) {
        this.f9210 = new int[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m9267() {
        return this.f9211;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9264(int i) {
        int i2 = this.f9211;
        int[] iArr = this.f9210;
        if (i2 == iArr.length) {
            throw new IllegalStateException("Code point window is full");
        }
        int length = this.f9212 + i2;
        if (length >= iArr.length) {
            length -= iArr.length;
        }
        iArr[length] = i;
        this.f9211 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9266(InterfaceC1309 interfaceC1309) {
        if (this.f9211 == 0) {
            throw new IllegalStateException("Code point window is empty");
        }
        int i = this.f9212;
        int[] iArr = this.f9210;
        interfaceC1309.mo4777(iArr[i]);
        int i2 = this.f9212 + 1;
        if (i2 == iArr.length) {
            i2 = 0;
        }
        this.f9212 = i2;
        this.f9211--;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9265(int i, InterfaceC1309 interfaceC1309) {
        if (i < 0 || i > this.f9211) {
            throw new IllegalArgumentException("Code point count is out of range");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m9266(interfaceC1309);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9268(InterfaceC1309 interfaceC1309) {
        m9265(this.f9211, interfaceC1309);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9263() {
        int length;
        int[] iArr;
        int i = this.f9211;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
            length = this.f9212 + i;
            iArr = this.f9210;
            if (length >= iArr.length) {
                length -= iArr.length;
            }
        } while (iArr[length] != 10);
        return i;
    }
}
