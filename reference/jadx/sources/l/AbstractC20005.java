package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.ᩴᩳ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20005 {
    public AbstractC21169 mLayoutManager;
    public boolean mPendingInitialRun;
    public C25227 mRecyclerView;
    public boolean mRunning;
    public boolean mStarted;
    public View mTargetView;
    public int mTargetPosition = -1;
    public final C11054 mRecyclingAction = new C11054();

    public abstract void onSeekTargetStep(int i, int i2, C15529 c15529, C11054 c11054);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, C15529 c15529, C11054 c11054);

    public void start(C25227 c25227, AbstractC21169 abstractC21169) {
        RunnableC2106 runnableC2106 = c25227.mViewFlinger;
        runnableC2106.f6974.removeCallbacks(runnableC2106);
        runnableC2106.f6973.abortAnimation();
        this.mRecyclerView = c25227;
        this.mLayoutManager = abstractC21169;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        c25227.mState.f50524 = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.m7279();
        this.mStarted = true;
    }

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof InterfaceC22989) {
            return ((InterfaceC22989) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public AbstractC21169 getLayoutManager() {
        return this.mLayoutManager;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f50524 = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    public void onAnimation(int i, int i2) {
        PointF pointFComputeScrollVectorForPosition;
        C25227 c25227 = this.mRecyclerView;
        if (this.mTargetPosition == -1 || c25227 == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                c25227.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, c25227.mState, this.mRecyclingAction);
                this.mRecyclingAction.m27939(c25227);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, c25227.mState, this.mRecyclingAction);
            boolean zM27940 = this.mRecyclingAction.m27940();
            this.mRecyclingAction.m27939(c25227);
            if (zM27940 && this.mRunning) {
                this.mPendingInitialRun = true;
                c25227.mViewFlinger.m7279();
            }
        }
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public View findViewByPosition(int i) {
        return this.mRecyclerView.mLayout.findViewByPosition(i);
    }

    @Deprecated
    public void instantScrollToPosition(int i) {
        this.mRecyclerView.scrollToPosition(i);
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
            int i = C25227.HORIZONTAL;
        }
    }

    public void normalize(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }
}
