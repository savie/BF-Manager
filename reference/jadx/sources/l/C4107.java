package l;

/* JADX INFO: renamed from: l.ۘᩳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8NW */
/* JADX INFO: loaded from: classes2.dex */
public final class C4107 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long[] f15049;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long[] f15050;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f15051;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f15052;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f15053;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C22453 f15054;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f15055;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f15056;

    public C4107(C22453 c22453, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C2023.m6507(iArr.length == jArr2.length);
        C2023.m6507(jArr.length == jArr2.length);
        C2023.m6507(iArr2.length == jArr2.length);
        this.f15054 = c22453;
        this.f15050 = jArr;
        this.f15056 = iArr;
        this.f15053 = i;
        this.f15049 = jArr2;
        this.f15055 = iArr2;
        this.f15051 = j;
        this.f15052 = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11658(long j) {
        long[] jArr = this.f15049;
        for (int iM41825 = C17983.m41825(jArr, j, true); iM41825 < jArr.length; iM41825++) {
            if ((this.f15055[iM41825] & 1) != 0) {
                return iM41825;
            }
        }
        return -1;
    }
}
