package l;

import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86CV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18783 implements Cloneable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object[] f60999;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ boolean f61000;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ int f61001;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public /* synthetic */ long[] f61002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m43579(long j) {
        int iM19065 = C6850.m19065(j, this.f61002, this.f61001);
        if (iM19065 < 0 || this.f60999[iM19065] == C9832.f31648) {
            return -1L;
        }
        return this.f60999[iM19065];
    }

    public C18783() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f61002 = new long[i4];
        this.f60999 = new Object[i4];
    }

    public final C18783 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        C15243.m36587(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C18783 c18783 = (C18783) objClone;
        c18783.f61002 = (long[]) this.f61002.clone();
        c18783.f60999 = (Object[]) this.f60999.clone();
        return c18783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m43573(long j) {
        int iM19065 = C6850.m19065(j, this.f61002, this.f61001);
        if (iM19065 < 0 || this.f60999[iM19065] == C9832.f31648) {
            return null;
        }
        return this.f60999[iM19065];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43576(long j, Object obj) {
        int iM19065 = C6850.m19065(j, this.f61002, this.f61001);
        if (iM19065 >= 0) {
            this.f60999[iM19065] = obj;
            return;
        }
        int i = ~iM19065;
        if (i < this.f61001 && this.f60999[i] == C9832.f31648) {
            this.f61002[i] = j;
            this.f60999[i] = obj;
            return;
        }
        if (this.f61000) {
            int i2 = this.f61001;
            long[] jArr = this.f61002;
            if (i2 >= jArr.length) {
                Object[] objArr = this.f60999;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = objArr[i4];
                    if (obj2 != C9832.f31648) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj2;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f61000 = false;
                this.f61001 = i3;
                i = ~C6850.m19065(j, this.f61002, i3);
            }
        }
        int i5 = this.f61001;
        if (i5 >= this.f61002.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f61002, i9);
            C15243.m36591(jArrCopyOf, "copyOf(this, newSize)");
            this.f61002 = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60999, i9);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f60999 = objArrCopyOf;
        }
        int i10 = this.f61001 - i;
        if (i10 != 0) {
            long[] jArr2 = this.f61002;
            int i11 = i + 1;
            C15243.m36590(jArr2, "<this>");
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr2 = this.f60999;
            C21168.m48276(i11, i, this.f61001, objArr2, objArr2);
        }
        this.f61002[i] = j;
        this.f60999[i] = obj;
        this.f61001++;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m43578() {
        if (this.f61000) {
            int i = this.f61001;
            long[] jArr = this.f61002;
            Object[] objArr = this.f60999;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != C9832.f31648) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f61000 = false;
            this.f61001 = i2;
        }
        return this.f61001;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43572(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f61001)) {
            throw new IllegalArgumentException(C13645.m33382(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f61000) {
            long[] jArr = this.f61002;
            Object[] objArr = this.f60999;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != C9832.f31648) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f61000 = false;
            this.f61001 = i3;
        }
        return this.f61002[i];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m43577(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f61001)) {
            throw new IllegalArgumentException(C13645.m33382(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.f61000) {
            long[] jArr = this.f61002;
            Object[] objArr = this.f60999;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != C9832.f31648) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f61000 = false;
            this.f61001 = i3;
        }
        return this.f60999[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43574() {
        int i = this.f61001;
        Object[] objArr = this.f60999;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f61001 = 0;
        this.f61000 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43575(long j, Long l2) {
        int i = this.f61001;
        if (i != 0 && j <= this.f61002[i - 1]) {
            m43576(j, (Object) l2);
            return;
        }
        if (this.f61000) {
            long[] jArr = this.f61002;
            if (i >= jArr.length) {
                Object[] objArr = this.f60999;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != C9832.f31648) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.f61000 = false;
                this.f61001 = i2;
            }
        }
        int i4 = this.f61001;
        if (i4 >= this.f61002.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f61002, i8);
            C15243.m36591(jArrCopyOf, "copyOf(this, newSize)");
            this.f61002 = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f60999, i8);
            C15243.m36591(objArrCopyOf, "copyOf(this, newSize)");
            this.f60999 = objArrCopyOf;
        }
        this.f61002[i4] = j;
        this.f60999[i4] = l2;
        this.f61001 = i4 + 1;
    }

    public final String toString() {
        if (m43578() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f61001 * 28);
        sb.append('{');
        int i = this.f61001;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m43572(i2));
            sb.append(a.h);
            Object objM43577 = m43577(i2);
            if (objM43577 != sb) {
                sb.append(objM43577);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        C15243.m36591(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
