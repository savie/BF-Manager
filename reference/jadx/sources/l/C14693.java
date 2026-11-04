package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܰܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14693 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f48016;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f48017;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f48018;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int[] f48021 = new int[128];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C11974[] f48019 = new C11974[128];

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC19169[] f48020 = new AbstractC19169[32];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35347(int i, C11974 c11974, boolean z) {
        int i2;
        AbstractC19169[] abstractC19169Arr;
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C17359.requireNonNull(c11974, "style");
        long j = ((long) this.f48017) + ((long) i);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        int i4 = this.f48016;
        int[] iArr = this.f48021;
        C11974[] c11974Arr = this.f48019;
        if (i4 == 0 || z || !c11974Arr[i4 - 1].equals(c11974)) {
            int i5 = this.f48016;
            if (i5 == 128) {
                AbstractC19169 c7982 = new C7982(Arrays.copyOf(iArr, i5), (C11974[]) Arrays.copyOf(c11974Arr, this.f48016));
                while (true) {
                    i2 = this.f48018;
                    abstractC19169Arr = this.f48020;
                    if (i2 == 0) {
                        break;
                    }
                    int i6 = i2 - 1;
                    AbstractC19169 abstractC19169 = abstractC19169Arr[i6];
                    if (abstractC19169.f62020 != c7982.f62020) {
                        break;
                    }
                    this.f48018 = i6;
                    C4253 c4253 = new C4253(abstractC19169, c7982);
                    abstractC19169Arr[this.f48018] = null;
                    c7982 = c4253;
                }
                this.f48018 = i2 + 1;
                abstractC19169Arr[i2] = c7982;
                Arrays.fill(c11974Arr, (Object) null);
                this.f48016 = 0;
            }
            int i7 = this.f48016;
            iArr[i7] = i | (z ? Integer.MIN_VALUE : 0);
            this.f48016 = i7 + 1;
            c11974Arr[i7] = c11974;
        } else {
            int i8 = this.f48016 - 1;
            int i9 = iArr[i8];
            iArr[i8] = (Integer.MIN_VALUE & i9) | ((i9 & Integer.MAX_VALUE) + i);
        }
        this.f48017 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1270 m35346() {
        int i = this.f48016;
        AbstractC19169 c7982 = i == 0 ? null : new C7982(Arrays.copyOf(this.f48021, i), (C11974[]) Arrays.copyOf(this.f48019, this.f48016));
        int i2 = this.f48018;
        while (true) {
            i2--;
            if (i2 < 0) {
                return C1270.m4616(c7982);
            }
            c7982 = C1270.m4627(this.f48020[i2], c7982);
        }
    }
}
