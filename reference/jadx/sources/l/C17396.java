package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܿܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C17396 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f55363;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f55364;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f55365;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC13538[] f55366;

    public C17396(AbstractC13538[] abstractC13538Arr, long[] jArr, long j, long j2) {
        this.f55366 = abstractC13538Arr;
        this.f55364 = jArr;
        this.f55363 = j;
        this.f55365 = j2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m40519() {
        return this.f55363;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m40518(long j) {
        if (j < 0 || j >= this.f55363) {
            throw new IndexOutOfBoundsException(C15489.m37074(j, "Match ordinal "));
        }
        long[] jArr = this.f55364;
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
        return this.f55366[i].mo19950((int) (j - (i != 0 ? jArr[i - 1] : 0L)));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12458 m40515(long j) {
        if (j < 0 || j >= this.f55363) {
            throw new IndexOutOfBoundsException(C15489.m37074(j, "Match ordinal "));
        }
        long[] jArr = this.f55364;
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
        return new C12458(this, i, i3, j, this.f55366[i].mo19950(i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40516(DataOutputStream dataOutputStream) throws IOException {
        AbstractC13538[] abstractC13538Arr = this.f55366;
        dataOutputStream.writeInt(abstractC13538Arr.length);
        for (AbstractC13538 abstractC13538 : abstractC13538Arr) {
            abstractC13538.mo19945(dataOutputStream, 0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m40517(int i) {
        int iMo19950 = -1;
        for (AbstractC13538 abstractC13538 : this.f55366) {
            int iMo19951 = abstractC13538.mo19950(0);
            if ((iMo19950 >= 0 && ((long) iMo19950) + ((long) i) > iMo19951) || !abstractC13538.mo19947(i)) {
                return false;
            }
            iMo19950 = abstractC13538.mo19950(abstractC13538.mo19949() - 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m40514() {
        return this.f55365;
    }
}
