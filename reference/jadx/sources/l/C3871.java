package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۘۤۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58QC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3871 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14469;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f14471;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long[] f14470 = new long[10];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object[] f14468 = new Object[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11200() {
        this.f14469 = 0;
        this.f14471 = 0;
        Arrays.fill(this.f14468, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m11201(long j, Object obj) {
        int i = this.f14471;
        if (i > 0) {
            if (j <= this.f14470[((this.f14469 + i) - 1) % this.f14468.length]) {
                m11200();
            }
        }
        m11196();
        int i2 = this.f14469;
        int i3 = this.f14471;
        Object[] objArr = this.f14468;
        int length = (i2 + i3) % objArr.length;
        this.f14470[length] = j;
        objArr[length] = obj;
        this.f14471 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized int m11202() {
        return this.f14471;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m11203() {
        return this.f14471 == 0 ? null : m11198();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m11204(long j) {
        return m11197(j, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m11199(long j) {
        return m11197(j, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m11197(long j, boolean z) {
        Object objM11198 = null;
        long j2 = C17492.FOREVER_NS;
        while (this.f14471 > 0) {
            long j3 = j - this.f14470[this.f14469];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM11198 = m11198();
            j2 = j3;
        }
        return objM11198;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private Object m11198() {
        C2023.m6510(this.f14471 > 0);
        Object[] objArr = this.f14468;
        int i = this.f14469;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f14469 = (i + 1) % objArr.length;
        this.f14471--;
        return obj;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m11196() {
        int length = this.f14468.length;
        if (this.f14471 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f14469;
        int i3 = length - i2;
        System.arraycopy(this.f14470, i2, jArr, 0, i3);
        System.arraycopy(this.f14468, this.f14469, objArr, 0, i3);
        int i4 = this.f14469;
        if (i4 > 0) {
            System.arraycopy(this.f14470, 0, jArr, i3, i4);
            System.arraycopy(this.f14468, 0, objArr, i3, this.f14469);
        }
        this.f14470 = jArr;
        this.f14468 = objArr;
        this.f14469 = 0;
    }
}
