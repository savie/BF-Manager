package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۠ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8301 implements InterfaceC11849 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f28821;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28822;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f28823;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f28824;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21734(C17492 c17492, boolean z) {
        this.f28822 = 0;
        int[] iArr = this.f28824;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC5498 abstractC5498 = c17492.mLayout;
        if (c17492.mAdapter == null || abstractC5498 == null || !abstractC5498.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!c17492.mAdapterHelper.m25166()) {
                abstractC5498.collectInitialPrefetchPositions(c17492.mAdapter.getItemCount(), this);
            }
        } else if (!c17492.hasPendingAdapterUpdates()) {
            abstractC5498.collectAdjacentPrefetchPositions(this.f28823, this.f28821, c17492.mState, this);
        }
        int i = this.f28822;
        if (i > abstractC5498.mPrefetchMaxCountObserved) {
            abstractC5498.mPrefetchMaxCountObserved = i;
            abstractC5498.mPrefetchMaxObservedInInitialPrefetch = z;
            c17492.mRecycler.m48489();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21733(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f28822;
        int i4 = i3 * 2;
        int[] iArr = this.f28824;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f28824 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f28824 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f28824;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f28822++;
    }
}
