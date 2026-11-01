package l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: renamed from: l.᩷ܿܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21020 {
    public AbstractC5498 mLayoutManager;
    public boolean mPendingInitialRun;
    public C17492 mRecyclerView;
    public boolean mRunning;
    public boolean mStarted;
    public View mTargetView;
    public int mTargetPosition = -1;
    public final C10438 mRecyclingAction = new C10438();

    public abstract void onSeekTargetStep(int i, int i2, C16082 c16082, C10438 c10438);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, C16082 c16082, C10438 c10438);

    public void start(C17492 c17492, AbstractC5498 abstractC5498) {
        RunnableC16787 runnableC16787 = c17492.mViewFlinger;
        runnableC16787.f53774.removeCallbacks(runnableC16787);
        runnableC16787.f53775.abortAnimation();
        this.mRecyclerView = c17492;
        this.mLayoutManager = abstractC5498;
        int i = this.mTargetPosition;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        c17492.mState.f52022 = i;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.m39437();
        this.mStarted = true;
    }

    public void setTargetPosition(int i) {
        this.mTargetPosition = i;
    }

    public PointF computeScrollVectorForPosition(int i) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof InterfaceC7615) {
            return ((InterfaceC7615) layoutManager).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public AbstractC5498 getLayoutManager() {
        return this.mLayoutManager;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f52022 = -1;
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
        C17492 c17492 = this.mRecyclerView;
        if (this.mTargetPosition == -1 || c17492 == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f = pointFComputeScrollVectorForPosition.x;
            if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                c17492.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, c17492.mState, this.mRecyclingAction);
                this.mRecyclingAction.m26353(c17492);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i, i2, c17492.mState, this.mRecyclingAction);
            boolean zM26354 = this.mRecyclingAction.m26354();
            this.mRecyclingAction.m26353(c17492);
            if (zM26354 && this.mRunning) {
                this.mPendingInitialRun = true;
                c17492.mViewFlinger.m39437();
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
            int i = C17492.HORIZONTAL;
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
