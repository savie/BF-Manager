package l;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: l.ۨᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12546 extends AbstractC7744 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;
    public Scroller mGravityScroller;
    public C25227 mRecyclerView;
    public final AbstractC9980 mScrollListener = new C3597(this);

    public abstract int[] calculateDistanceToFinalSnap(AbstractC21169 abstractC21169, View view);

    public abstract View findSnapView(AbstractC21169 abstractC21169);

    public abstract int findTargetSnapPosition(AbstractC21169 abstractC21169, int i, int i2);

    @Override // l.AbstractC7744
    public boolean onFling(int i, int i2) {
        AbstractC21169 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m31218(layoutManager, i, i2);
    }

    public void attachToRecyclerView(C25227 c25227) {
        C25227 c25228 = this.mRecyclerView;
        if (c25228 == c25227) {
            return;
        }
        if (c25228 != null) {
            m31217();
        }
        this.mRecyclerView = c25227;
        if (c25227 != null) {
            m31219();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31219() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31217() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m31218(AbstractC21169 abstractC21169, int i, int i2) {
        AbstractC20005 abstractC20005CreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC21169 instanceof InterfaceC22989) || (abstractC20005CreateScroller = createScroller(abstractC21169)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC21169, i, i2)) == -1) {
            return false;
        }
        abstractC20005CreateScroller.setTargetPosition(iFindTargetSnapPosition);
        abstractC21169.startSmoothScroll(abstractC20005CreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        AbstractC21169 layoutManager;
        View viewFindSnapView;
        C25227 c25227 = this.mRecyclerView;
        if (c25227 == null || (layoutManager = c25227.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    public AbstractC20005 createScroller(AbstractC21169 abstractC21169) {
        return createSnapScroller(abstractC21169);
    }

    @Deprecated
    public C7525 createSnapScroller(AbstractC21169 abstractC21169) {
        if (abstractC21169 instanceof InterfaceC22989) {
            return new C20751(this, this.mRecyclerView.getContext());
        }
        return null;
    }
}
