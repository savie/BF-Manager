package l;

/* JADX INFO: renamed from: l.ۜ۟᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6998 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25227 f23092;

    public C6998(C25227 c25227) {
        this.f23092 = c25227;
    }

    @Override // l.AbstractC1778
    public final void onChanged() {
        C25227 c25227 = this.f23092;
        c25227.assertNotInLayoutOrScroll(null);
        c25227.mState.f50523 = true;
        c25227.processDataSetCompletelyChanged(true);
        if (c25227.mAdapterHelper.m50272()) {
            return;
        }
        c25227.requestLayout();
    }

    @Override // l.AbstractC1778
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        C25227 c25227 = this.f23092;
        c25227.assertNotInLayoutOrScroll(null);
        if (c25227.mAdapterHelper.m50271(i, i2, obj)) {
            m19324();
        }
    }

    @Override // l.AbstractC1778
    public final void onItemRangeInserted(int i, int i2) {
        C25227 c25227 = this.f23092;
        c25227.assertNotInLayoutOrScroll(null);
        if (c25227.mAdapterHelper.m50276(i, i2)) {
            m19324();
        }
    }

    @Override // l.AbstractC1778
    public final void onItemRangeRemoved(int i, int i2) {
        C25227 c25227 = this.f23092;
        c25227.assertNotInLayoutOrScroll(null);
        if (c25227.mAdapterHelper.m50273(i, i2)) {
            m19324();
        }
    }

    @Override // l.AbstractC1778
    public final void onItemRangeMoved(int i, int i2, int i3) {
        C25227 c25227 = this.f23092;
        c25227.assertNotInLayoutOrScroll(null);
        if (c25227.mAdapterHelper.m50270(i, i2, i3)) {
            m19324();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19324() {
        C25227 c25227 = this.f23092;
        if (c25227.mHasFixedSize && c25227.mIsAttached) {
            Runnable runnable = c25227.mUpdateChildViewsRunnable;
            int i = C22666.f73603;
            c25227.postOnAnimation(runnable);
        } else {
            c25227.mAdapterUpdateDuringMeasure = true;
            c25227.requestLayout();
        }
    }

    @Override // l.AbstractC1778
    public final void onStateRestorationPolicyChanged() {
        AbstractC12964 abstractC12964;
        C25227 c25227 = this.f23092;
        if (c25227.mPendingSavedState == null || (abstractC12964 = c25227.mAdapter) == null || !abstractC12964.canRestoreState()) {
            return;
        }
        c25227.requestLayout();
    }
}
