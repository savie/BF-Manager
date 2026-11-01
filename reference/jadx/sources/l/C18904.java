package l;

/* JADX INFO: renamed from: l.ᩴܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18904 extends AbstractC12410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17492 f61191;

    public C18904(C17492 c17492) {
        this.f61191 = c17492;
    }

    @Override // l.AbstractC12410
    public final void onChanged() {
        C17492 c17492 = this.f61191;
        c17492.assertNotInLayoutOrScroll(null);
        c17492.mState.f52020 = true;
        c17492.processDataSetCompletelyChanged(true);
        if (c17492.mAdapterHelper.m25166()) {
            return;
        }
        c17492.requestLayout();
    }

    @Override // l.AbstractC12410
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        C17492 c17492 = this.f61191;
        c17492.assertNotInLayoutOrScroll(null);
        if (c17492.mAdapterHelper.m25164(i, i2, obj)) {
            m43570();
        }
    }

    @Override // l.AbstractC12410
    public final void onItemRangeInserted(int i, int i2) {
        C17492 c17492 = this.f61191;
        c17492.assertNotInLayoutOrScroll(null);
        if (c17492.mAdapterHelper.m25169(i, i2)) {
            m43570();
        }
    }

    @Override // l.AbstractC12410
    public final void onItemRangeRemoved(int i, int i2) {
        C17492 c17492 = this.f61191;
        c17492.assertNotInLayoutOrScroll(null);
        if (c17492.mAdapterHelper.m25167(i, i2)) {
            m43570();
        }
    }

    @Override // l.AbstractC12410
    public final void onItemRangeMoved(int i, int i2, int i3) {
        C17492 c17492 = this.f61191;
        c17492.assertNotInLayoutOrScroll(null);
        if (c17492.mAdapterHelper.m25163(i, i2, i3)) {
            m43570();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43570() {
        boolean z = C17492.POST_UPDATES_ON_ANIMATION;
        C17492 c17492 = this.f61191;
        if (z && c17492.mHasFixedSize && c17492.mIsAttached) {
            Runnable runnable = c17492.mUpdateChildViewsRunnable;
            int i = C5031.f17539;
            c17492.postOnAnimation(runnable);
        } else {
            c17492.mAdapterUpdateDuringMeasure = true;
            c17492.requestLayout();
        }
    }

    @Override // l.AbstractC12410
    public final void onStateRestorationPolicyChanged() {
        AbstractC0414 abstractC0414;
        C17492 c17492 = this.f61191;
        if (c17492.mPendingSavedState == null || (abstractC0414 = c17492.mAdapter) == null || !abstractC0414.canRestoreState()) {
            return;
        }
        c17492.requestLayout();
    }
}
