package l;

/* JADX INFO: renamed from: l.֡ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: L3KT */
/* JADX INFO: loaded from: classes2.dex */
public final class C0138 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f1104;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f1105;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f1106;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f1107;

    public C0138() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f1104 = iHighestOneBit - 1;
        this.f1106 = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1297(int i) {
        int[] iArr = this.f1106;
        int i2 = this.f1107;
        iArr[i2] = i;
        int i3 = this.f1104 & (i2 + 1);
        this.f1107 = i3;
        int i4 = this.f1105;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            C21168.m48277(0, i4, iArr, iArr2, length);
            C21168.m48277(i5, 0, this.f1106, iArr2, this.f1105);
            this.f1106 = iArr2;
            this.f1105 = 0;
            this.f1107 = length;
            this.f1104 = i6 - 1;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m1298() {
        int i = this.f1105;
        if (i == this.f1107) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f1106[i];
        this.f1105 = (i + 1) & this.f1104;
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1296() {
        this.f1107 = this.f1105;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m1299() {
        return this.f1105 == this.f1107;
    }
}
