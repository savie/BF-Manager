package l;

/* JADX INFO: renamed from: l.ܺܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16082 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f52011;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f52012;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f52013;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52014;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f52015;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f52016;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f52017;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f52018;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f52019;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f52020;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52021;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f52022;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f52023;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f52024;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38109(int i) {
        if ((this.f52018 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f52018));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m38108() {
        if (this.f52015) {
            return this.f52013 - this.f52014;
        }
        return this.f52011;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f52022 + ", mData=null, mItemCount=" + this.f52011 + ", mIsMeasuring=" + this.f52023 + ", mPreviousLayoutItemCount=" + this.f52013 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f52014 + ", mStructureChanged=" + this.f52020 + ", mInPreLayout=" + this.f52015 + ", mRunSimpleAnimations=" + this.f52024 + ", mRunPredictiveAnimations=" + this.f52016 + '}';
    }
}
