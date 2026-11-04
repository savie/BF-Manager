package l;

import java.io.DataOutputStream;

/* JADX INFO: renamed from: l.ۗܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C3481 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f12028;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f12029;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC0433[] f12030;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f12031;

    public C3481(AbstractC0433[] abstractC0433Arr, long[] jArr, long j, long j2) {
        this.f12030 = abstractC0433Arr;
        this.f12028 = jArr;
        this.f12031 = j;
        this.f12029 = j2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m11441() {
        return this.f12031;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m11440(long j) {
        if (j < 0 || j >= this.f12031) {
            throw new IndexOutOfBoundsException(C24770.m55292(j, "Match ordinal "));
        }
        long[] jArr = this.f12028;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            int i2 = (i + length) >>> 1;
            if (jArr[i2] <= j) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        return this.f12030[i].mo2249((int) (j - (i != 0 ? jArr[i - 1] : 0L)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23619 m11437(long j) {
        if (j < 0 || j >= this.f12031) {
            throw new IndexOutOfBoundsException(C24770.m55292(j, "Match ordinal "));
        }
        long[] jArr = this.f12028;
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            int i2 = (i + length) >>> 1;
            if (jArr[i2] <= j) {
                i = i2 + 1;
            } else {
                length = i2;
            }
        }
        int i3 = (int) (j - (i != 0 ? jArr[i - 1] : 0L));
        return new C23619(this, i, i3, j, this.f12030[i].mo2249(i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11438(DataOutputStream dataOutputStream) {
        AbstractC0433[] abstractC0433Arr = this.f12030;
        dataOutputStream.writeInt(abstractC0433Arr.length);
        for (AbstractC0433 abstractC0433 : abstractC0433Arr) {
            abstractC0433.mo2244(dataOutputStream, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11439(int i) {
        int iMo2249 = -1;
        for (AbstractC0433 abstractC0433 : this.f12030) {
            int iMo22410 = abstractC0433.mo2249(0);
            if ((iMo2249 >= 0 && ((long) iMo2249) + ((long) i) > iMo22410) || !abstractC0433.mo2246(i)) {
                return false;
            }
            iMo2249 = abstractC0433.mo2249(abstractC0433.mo2248() - 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m11436() {
        return this.f12029;
    }
}
