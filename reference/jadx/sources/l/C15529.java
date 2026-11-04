package l;

/* JADX INFO: renamed from: l.ܳᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15529 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50515;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f50516;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f50517;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f50518;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50519;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f50520;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f50521;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f50522;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f50523;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50524;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f50525;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f50526;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f50527;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f50528;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37185(int i) {
        if ((this.f50517 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f50517));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m37186() {
        return this.f50525;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m37184() {
        if (this.f50525) {
            return this.f50515 - this.f50516;
        }
        return this.f50520;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f50524 + ", mData=null, mItemCount=" + this.f50520 + ", mIsMeasuring=" + this.f50521 + ", mPreviousLayoutItemCount=" + this.f50515 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f50516 + ", mStructureChanged=" + this.f50523 + ", mInPreLayout=" + this.f50525 + ", mRunSimpleAnimations=" + this.f50528 + ", mRunPredictiveAnimations=" + this.f50519 + '}';
    }
}
