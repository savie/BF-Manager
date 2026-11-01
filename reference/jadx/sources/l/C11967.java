package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11967 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40098;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40100;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40102;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f40097 = new int[128];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15682[] f40099 = new C15682[128];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC13378[] f40101 = new AbstractC13378[32];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29779(int i, C15682 c15682, boolean z) {
        int i2;
        AbstractC13378[] abstractC13378Arr;
        if (i <= 0) {
            throw new IllegalArgumentException("Non-positive syntax run length");
        }
        C13638.requireNonNull(c15682, "style");
        long j = ((long) this.f40100) + ((long) i);
        int i3 = (int) j;
        if (j != i3) {
            throw new ArithmeticException();
        }
        int i4 = this.f40098;
        int[] iArr = this.f40097;
        C15682[] c15682Arr = this.f40099;
        if (i4 == 0 || z || !c15682Arr[i4 - 1].equals(c15682)) {
            int i5 = this.f40098;
            if (i5 == 128) {
                AbstractC13378 c1382 = new C1382(Arrays.copyOf(iArr, i5), (C15682[]) Arrays.copyOf(c15682Arr, this.f40098));
                while (true) {
                    i2 = this.f40102;
                    abstractC13378Arr = this.f40101;
                    if (i2 == 0) {
                        break;
                    }
                    int i6 = i2 - 1;
                    AbstractC13378 abstractC13378 = abstractC13378Arr[i6];
                    if (abstractC13378.f44318 != c1382.f44318) {
                        break;
                    }
                    this.f40102 = i6;
                    C14084 c14084 = new C14084(abstractC13378, c1382);
                    abstractC13378Arr[this.f40102] = null;
                    c1382 = c14084;
                }
                this.f40102 = i2 + 1;
                abstractC13378Arr[i2] = c1382;
                Arrays.fill(c15682Arr, (Object) null);
                this.f40098 = 0;
            }
            int i7 = this.f40098;
            iArr[i7] = i | (z ? Integer.MIN_VALUE : 0);
            this.f40098 = i7 + 1;
            c15682Arr[i7] = c15682;
        } else {
            int i8 = this.f40098 - 1;
            int i9 = iArr[i8];
            iArr[i8] = (Integer.MIN_VALUE & i9) | ((i9 & Integer.MAX_VALUE) + i);
        }
        this.f40100 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7027 m29778() {
        int i = this.f40098;
        AbstractC13378 c1382 = i == 0 ? null : new C1382(Arrays.copyOf(this.f40097, i), (C15682[]) Arrays.copyOf(this.f40099, this.f40098));
        int i2 = this.f40102;
        while (true) {
            i2--;
            if (i2 < 0) {
                return C7027.m18852(c1382);
            }
            c1382 = C7027.m18846(this.f40101[i2], c1382);
        }
    }
}
