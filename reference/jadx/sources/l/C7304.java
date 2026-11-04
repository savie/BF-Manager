package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R5DS */
/* JADX INFO: loaded from: classes4.dex */
public final class C7304 implements InterfaceC4015 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f24040;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f24041;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f24042;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24043;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19988(C25227 c25227, boolean z) {
        this.f24040 = 0;
        int[] iArr = this.f24042;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC21169 abstractC21169 = c25227.mLayout;
        if (c25227.mAdapter == null || abstractC21169 == null || !abstractC21169.isItemPrefetchEnabled()) {
            return;
        }
        if (z) {
            if (!c25227.mAdapterHelper.m50272()) {
                abstractC21169.collectInitialPrefetchPositions(c25227.mAdapter.getItemCount(), this);
            }
        } else if (!c25227.hasPendingAdapterUpdates()) {
            abstractC21169.collectAdjacentPrefetchPositions(this.f24041, this.f24043, c25227.mState, this);
        }
        int i = this.f24040;
        if (i > abstractC21169.mPrefetchMaxCountObserved) {
            abstractC21169.mPrefetchMaxCountObserved = i;
            abstractC21169.mPrefetchMaxObservedInInitialPrefetch = z;
            c25227.mRecycler.m8423();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19987(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f24040;
        int i4 = i3 * 2;
        int[] iArr = this.f24042;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f24042 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f24042 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f24042;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f24040++;
    }
}
