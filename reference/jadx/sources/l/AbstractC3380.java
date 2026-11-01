package l;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: renamed from: l.ۗܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 92WK */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3380 extends AbstractC13260 {
    public static final float MILLISECONDS_PER_INCH = 100.0f;
    public Scroller mGravityScroller;
    public C17492 mRecyclerView;
    public final AbstractC6909 mScrollListener = new C1969(this);

    public abstract int[] calculateDistanceToFinalSnap(AbstractC5498 abstractC5498, View view);

    public abstract View findSnapView(AbstractC5498 abstractC5498);

    public abstract int findTargetSnapPosition(AbstractC5498 abstractC5498, int i, int i2);

    @Override // l.AbstractC13260
    public boolean onFling(int i, int i2) {
        AbstractC5498 layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m10032(layoutManager, i, i2);
    }

    public void attachToRecyclerView(C17492 c17492) {
        C17492 c17493 = this.mRecyclerView;
        if (c17493 == c17492) {
            return;
        }
        if (c17493 != null) {
            m10031();
        }
        this.mRecyclerView = c17492;
        if (c17492 != null) {
            m10033();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m10033() {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m10031() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m10032(AbstractC5498 abstractC5498, int i, int i2) {
        AbstractC21020 abstractC21020CreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC5498 instanceof InterfaceC7615) || (abstractC21020CreateScroller = createScroller(abstractC5498)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC5498, i, i2)) == -1) {
            return false;
        }
        abstractC21020CreateScroller.setTargetPosition(iFindTargetSnapPosition);
        abstractC5498.startSmoothScroll(abstractC21020CreateScroller);
        return true;
    }

    public void snapToTargetExistingView() {
        AbstractC5498 layoutManager;
        View viewFindSnapView;
        C17492 c17492 = this.mRecyclerView;
        if (c17492 == null || (layoutManager = c17492.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i = iArrCalculateDistanceToFinalSnap[0];
        if (i == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i, iArrCalculateDistanceToFinalSnap[1]);
    }

    public AbstractC21020 createScroller(AbstractC5498 abstractC5498) {
        return createSnapScroller(abstractC5498);
    }

    @Deprecated
    public C3941 createSnapScroller(AbstractC5498 abstractC5498) {
        if (abstractC5498 instanceof InterfaceC7615) {
            return new C9732(this, this.mRecyclerView.getContext());
        }
        return null;
    }
}
