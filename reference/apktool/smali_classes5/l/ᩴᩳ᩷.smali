.class public abstract Ll/ᩴᩳ᩷;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public mLayoutManager:Ll/᩶۟᩷;

.field public mPendingInitialRun:Z

.field public mRecyclerView:Ll/᩻ᩳ᩷;

.field public final mRecyclingAction:Ll/ۤᩳ᩷;

.field public mRunning:Z

.field public mStarted:Z

.field public mTargetPosition:I

.field public mTargetView:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12900
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 12884
    iput v0, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    .line 12901
    new-instance v0, Ll/ۤᩳ᩷;

    invoke-direct {v0}, Ll/ۤᩳ᩷;-><init>()V

    iput-object v0, p0, Ll/ᩴᩳ᩷;->mRecyclingAction:Ll/ۤᩳ᩷;

    return-void
.end method


# virtual methods
.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 2

    .line 12958
    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->getLayoutManager()Ll/᩶۟᩷;

    move-result-object v0

    .line 12959
    instance-of v1, v0, Ll/᩸ᩳ᩷;

    if-eqz v1, :cond_0

    .line 12960
    check-cast v0, Ll/᩸ᩳ᩷;

    .line 12961
    invoke-interface {v0, p1}, Ll/᩸ᩳ᩷;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 1

    .line 13095
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {v0, p1}, Ll/᩶۟᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 13088
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {v0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getChildPosition(Landroid/view/View;)I
    .locals 1

    .line 13081
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->getChildLayoutPosition(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public getLayoutManager()Ll/᩶۟᩷;
    .locals 1

    .line 12974
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mLayoutManager:Ll/᩶۟᩷;

    return-object v0
.end method

.method public getTargetPosition()I
    .locals 1

    .line 13026
    iget v0, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    return v0
.end method

.method public instantScrollToPosition(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 13104
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->scrollToPosition(I)V

    return-void
.end method

.method public isPendingInitialRun()Z
    .locals 1

    .line 13008
    iget-boolean v0, p0, Ll/ᩴᩳ᩷;->mPendingInitialRun:Z

    return v0
.end method

.method public isRunning()Z
    .locals 1

    .line 13016
    iget-boolean v0, p0, Ll/ᩴᩳ᩷;->mRunning:Z

    return v0
.end method

.method public normalize(Landroid/graphics/PointF;)V
    .locals 2

    .line 13122
    iget v0, p1, Landroid/graphics/PointF;->x:F

    mul-float v0, v0, v0

    iget v1, p1, Landroid/graphics/PointF;->y:F

    mul-float v1, v1, v1

    add-float/2addr v1, v0

    float-to-double v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    .line 13124
    iget v1, p1, Landroid/graphics/PointF;->x:F

    div-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/PointF;->x:F

    .line 13125
    iget v1, p1, Landroid/graphics/PointF;->y:F

    div-float/2addr v1, v0

    iput v1, p1, Landroid/graphics/PointF;->y:F

    return-void
.end method

.method public onAnimation(II)V
    .locals 6

    .line 13030
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 13031
    iget v1, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    if-nez v0, :cond_1

    .line 13032
    :cond_0
    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->stop()V

    .line 13040
    :cond_1
    iget-boolean v1, p0, Ll/ᩴᩳ᩷;->mPendingInitialRun:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/ᩴᩳ᩷;->mLayoutManager:Ll/᩶۟᩷;

    if-eqz v1, :cond_3

    .line 13041
    iget v1, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    invoke-virtual {p0, v1}, Ll/ᩴᩳ᩷;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 13042
    iget v3, v1, Landroid/graphics/PointF;->x:F

    const/4 v4, 0x0

    cmpl-float v5, v3, v4

    if-nez v5, :cond_2

    iget v5, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v4, v5, v4

    if-eqz v4, :cond_3

    .line 13044
    :cond_2
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    float-to-int v3, v3

    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 13045
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    float-to-int v1, v1

    .line 13043
    invoke-virtual {v0, v3, v1, v2}, Ll/᩻ᩳ᩷;->scrollStep(II[I)V

    :cond_3
    const/4 v1, 0x0

    .line 13050
    iput-boolean v1, p0, Ll/ᩴᩳ᩷;->mPendingInitialRun:Z

    .line 13052
    iget-object v1, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    if-eqz v1, :cond_5

    .line 13054
    invoke-virtual {p0, v1}, Ll/ᩴᩳ᩷;->getChildPosition(Landroid/view/View;)I

    move-result v1

    iget v3, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    if-ne v1, v3, :cond_4

    .line 13055
    iget-object v1, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    iget-object v2, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    iget-object v3, p0, Ll/ᩴᩳ᩷;->mRecyclingAction:Ll/ۤᩳ᩷;

    invoke-virtual {p0, v1, v2, v3}, Ll/ᩴᩳ᩷;->onTargetFound(Landroid/view/View;Ll/ܳᩳ᩷;Ll/ۤᩳ᩷;)V

    .line 13056
    iget-object v1, p0, Ll/ᩴᩳ᩷;->mRecyclingAction:Ll/ۤᩳ᩷;

    invoke-virtual {v1, v0}, Ll/ۤᩳ᩷;->ۙ(Ll/᩻ᩳ᩷;)V

    .line 13057
    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->stop()V

    goto :goto_0

    .line 13060
    :cond_4
    iput-object v2, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    .line 13063
    :cond_5
    :goto_0
    iget-boolean v1, p0, Ll/ᩴᩳ᩷;->mRunning:Z

    if-eqz v1, :cond_6

    .line 13064
    iget-object v1, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    iget-object v2, p0, Ll/ᩴᩳ᩷;->mRecyclingAction:Ll/ۤᩳ᩷;

    invoke-virtual {p0, p1, p2, v1, v2}, Ll/ᩴᩳ᩷;->onSeekTargetStep(IILl/ܳᩳ᩷;Ll/ۤᩳ᩷;)V

    .line 13065
    iget-object p1, p0, Ll/ᩴᩳ᩷;->mRecyclingAction:Ll/ۤᩳ᩷;

    invoke-virtual {p1}, Ll/ۤᩳ᩷;->ۙ()Z

    move-result p1

    .line 13066
    iget-object p2, p0, Ll/ᩴᩳ᩷;->mRecyclingAction:Ll/ۤᩳ᩷;

    invoke-virtual {p2, v0}, Ll/ۤᩳ᩷;->ۙ(Ll/᩻ᩳ᩷;)V

    if-eqz p1, :cond_6

    .line 13069
    iget-boolean p1, p0, Ll/ᩴᩳ᩷;->mRunning:Z

    if-eqz p1, :cond_6

    const/4 p1, 0x1

    .line 13070
    iput-boolean p1, p0, Ll/ᩴᩳ᩷;->mPendingInitialRun:Z

    .line 13071
    iget-object p1, v0, Ll/᩻ᩳ᩷;->mViewFlinger:Ll/֫ᩳ᩷;

    invoke-virtual {p1}, Ll/֫ᩳ᩷;->ۙ()V

    :cond_6
    return-void
.end method

.method public onChildAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 13108
    invoke-virtual {p0, p1}, Ll/ᩴᩳ᩷;->getChildPosition(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->getTargetPosition()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 13109
    iput-object p1, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    .line 13110
    sget p1, Ll/᩻ᩳ᩷;->HORIZONTAL:I

    :cond_0
    return-void
.end method

.method public abstract onSeekTargetStep(IILl/ܳᩳ᩷;Ll/ۤᩳ᩷;)V
.end method

.method public abstract onStart()V
.end method

.method public abstract onStop()V
.end method

.method public abstract onTargetFound(Landroid/view/View;Ll/ܳᩳ᩷;Ll/ۤᩳ᩷;)V
.end method

.method public setTargetPosition(I)V
    .locals 0

    .line 12944
    iput p1, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    return-void
.end method

.method public start(Ll/᩻ᩳ᩷;Ll/᩶۟᩷;)V
    .locals 2

    .line 12919
    iget-object v0, p1, Ll/᩻ᩳ᩷;->mViewFlinger:Ll/֫ᩳ᩷;

    .line 6125
    iget-object v1, v0, Ll/֫ᩳ᩷;->ۢ:Ll/᩻ᩳ᩷;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6126
    iget-object v0, v0, Ll/֫ᩳ᩷;->۟:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 12928
    iput-object p1, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 12929
    iput-object p2, p0, Ll/ᩴᩳ᩷;->mLayoutManager:Ll/᩶۟᩷;

    .line 12930
    iget p2, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 12933
    iget-object p1, p1, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    iput p2, p1, Ll/ܳᩳ᩷;->ܽ:I

    const/4 p1, 0x1

    .line 12934
    iput-boolean p1, p0, Ll/ᩴᩳ᩷;->mRunning:Z

    .line 12935
    iput-boolean p1, p0, Ll/ᩴᩳ᩷;->mPendingInitialRun:Z

    .line 12936
    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->getTargetPosition()I

    move-result p2

    invoke-virtual {p0, p2}, Ll/ᩴᩳ᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    .line 12937
    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->onStart()V

    .line 12938
    iget-object p2, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p2, p2, Ll/᩻ᩳ᩷;->mViewFlinger:Ll/֫ᩳ᩷;

    invoke-virtual {p2}, Ll/֫ᩳ᩷;->ۙ()V

    .line 12940
    iput-boolean p1, p0, Ll/ᩴᩳ᩷;->mStarted:Z

    return-void

    .line 12931
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid target position"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final stop()V
    .locals 3

    .line 12984
    iget-boolean v0, p0, Ll/ᩴᩳ᩷;->mRunning:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 12987
    iput-boolean v0, p0, Ll/ᩴᩳ᩷;->mRunning:Z

    .line 12988
    invoke-virtual {p0}, Ll/ᩴᩳ᩷;->onStop()V

    .line 12989
    iget-object v1, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v1, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    const/4 v2, -0x1

    iput v2, v1, Ll/ܳᩳ᩷;->ܽ:I

    const/4 v1, 0x0

    .line 12990
    iput-object v1, p0, Ll/ᩴᩳ᩷;->mTargetView:Landroid/view/View;

    .line 12991
    iput v2, p0, Ll/ᩴᩳ᩷;->mTargetPosition:I

    .line 12992
    iput-boolean v0, p0, Ll/ᩴᩳ᩷;->mPendingInitialRun:Z

    .line 12994
    iget-object v0, p0, Ll/ᩴᩳ᩷;->mLayoutManager:Ll/᩶۟᩷;

    invoke-virtual {v0, p0}, Ll/᩶۟᩷;->onSmoothScrollerStopped(Ll/ᩴᩳ᩷;)V

    .line 12996
    iput-object v1, p0, Ll/ᩴᩳ᩷;->mLayoutManager:Ll/᩶۟᩷;

    .line 12997
    iput-object v1, p0, Ll/ᩴᩳ᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    return-void
.end method
