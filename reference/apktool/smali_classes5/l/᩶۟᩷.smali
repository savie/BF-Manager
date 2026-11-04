.class public abstract Ll/᩶۟᩷;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public mAutoMeasure:Z

.field public mChildHelper:Ll/ܳܿ᩷;

.field public mHeight:I

.field public mHeightMode:I

.field public mHorizontalBoundCheck:Ll/ۖᩳ᩷;

.field public final mHorizontalBoundCheckCallback:Ll/ۡᩳ᩷;

.field public mIsAttachedToWindow:Z

.field public mItemPrefetchEnabled:Z

.field public mMeasurementCacheEnabled:Z

.field public mPrefetchMaxCountObserved:I

.field public mPrefetchMaxObservedInInitialPrefetch:Z

.field public mRecyclerView:Ll/᩻ᩳ᩷;

.field public mRequestedSimpleAnimations:Z

.field public mSmoothScroller:Ll/ᩴᩳ᩷;

.field public mVerticalBoundCheck:Ll/ۖᩳ᩷;

.field public final mVerticalBoundCheckCallback:Ll/ۡᩳ᩷;

.field public mWidth:I

.field public mWidthMode:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 8508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8516
    new-instance v0, Ll/ۛ۟᩷;

    invoke-direct {v0, p0}, Ll/ۛ۟᩷;-><init>(Ll/᩶۟᩷;)V

    iput-object v0, p0, Ll/᩶۟᩷;->mHorizontalBoundCheckCallback:Ll/ۡᩳ᩷;

    .line 8552
    new-instance v1, Ll/᩺۟᩷;

    invoke-direct {v1, p0}, Ll/᩺۟᩷;-><init>(Ll/᩶۟᩷;)V

    iput-object v1, p0, Ll/᩶۟᩷;->mVerticalBoundCheckCallback:Ll/ۡᩳ᩷;

    .line 8593
    new-instance v2, Ll/ۖᩳ᩷;

    invoke-direct {v2, v0}, Ll/ۖᩳ᩷;-><init>(Ll/ۡᩳ᩷;)V

    iput-object v2, p0, Ll/᩶۟᩷;->mHorizontalBoundCheck:Ll/ۖᩳ᩷;

    .line 8594
    new-instance v0, Ll/ۖᩳ᩷;

    invoke-direct {v0, v1}, Ll/ۖᩳ᩷;-><init>(Ll/ۡᩳ᩷;)V

    iput-object v0, p0, Ll/᩶۟᩷;->mVerticalBoundCheck:Ll/ۖᩳ᩷;

    const/4 v0, 0x0

    .line 8599
    iput-boolean v0, p0, Ll/᩶۟᩷;->mRequestedSimpleAnimations:Z

    .line 8601
    iput-boolean v0, p0, Ll/᩶۟᩷;->mIsAttachedToWindow:Z

    .line 8607
    iput-boolean v0, p0, Ll/᩶۟᩷;->mAutoMeasure:Z

    const/4 v0, 0x1

    .line 8613
    iput-boolean v0, p0, Ll/᩶۟᩷;->mMeasurementCacheEnabled:Z

    .line 8615
    iput-boolean v0, p0, Ll/᩶۟᩷;->mItemPrefetchEnabled:Z

    return-void
.end method

.method public static ۙ(III)I
    .locals 2

    .line 8801
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 8802
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    .line 8810
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    .line 8807
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static ۙ(IIIIZ)I
    .locals 3

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    .line 10386
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 p2, -0x2

    const/4 v0, -0x1

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz p4, :cond_1

    if-ltz p3, :cond_0

    goto :goto_0

    :cond_0
    if-ne p3, v0, :cond_7

    if-eq p1, v1, :cond_6

    if-eqz p1, :cond_7

    if-eq p1, v2, :cond_6

    goto :goto_3

    :cond_1
    if-ltz p3, :cond_2

    :goto_0
    const/high16 p0, 0x40000000    # 2.0f

    goto :goto_4

    :cond_2
    if-ne p3, v0, :cond_3

    goto :goto_2

    :cond_3
    if-ne p3, p2, :cond_7

    if-eq p1, v1, :cond_5

    if-ne p1, v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/high16 p1, -0x80000000

    :cond_6
    :goto_2
    move p3, p0

    move p0, p1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 p0, 0x0

    const/4 p3, 0x0

    .line 10427
    :goto_4
    invoke-static {p3, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static ۙ(IIIZ)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sub-int/2addr p0, p1

    const/4 p1, 0x0

    .line 10344
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-eqz p3, :cond_0

    if-ltz p2, :cond_3

    goto :goto_0

    :cond_0
    if-ltz p2, :cond_1

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_2

    :cond_1
    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    const/high16 p1, 0x40000000    # 2.0f

    goto :goto_1

    :cond_2
    const/4 p3, -0x2

    if-ne p2, p3, :cond_3

    const/high16 p1, -0x80000000

    :goto_1
    move p2, p0

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    .line 10370
    :goto_2
    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static ۙ(Landroid/content/Context;Landroid/util/AttributeSet;II)Ll/ܰ۟᩷;
    .locals 2

    .line 11622
    new-instance v0, Ll/ܰ۟᩷;

    .line 11670
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11623
    sget-object v1, Ll/۬᩶᩷;->ۙ:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 11625
    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, Ll/ܰ۟᩷;->ۙ:I

    const/16 p3, 0xa

    .line 11627
    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, Ll/ܰ۟᩷;->ۤ:I

    const/16 p2, 0x9

    .line 11628
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, Ll/ܰ۟᩷;->᩷:Z

    const/16 p2, 0xb

    .line 11629
    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Ll/ܰ۟᩷;->᩸:Z

    .line 11630
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method private ۙ(ILandroid/view/View;)V
    .locals 0

    .line 9735
    iget-object p2, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {p2, p1}, Ll/ܳܿ᩷;->ۙ(I)V

    return-void
.end method

.method private ۙ(Landroid/view/View;IZ)V
    .locals 5

    .line 9508
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p3, :cond_1

    .line 9509
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    .line 9518
    :cond_0
    iget-object p3, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p3, p3, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    invoke-virtual {p3, v0}, Ll/۬ᩳ᩷;->ۤ(Ll/ۧᩳ᩷;)V

    goto :goto_1

    .line 9511
    :cond_1
    :goto_0
    iget-object p3, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p3, p3, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    .line 198
    iget-object p3, p3, Ll/۬ᩳ᩷;->ۙ:Ll/ۡۗ;

    invoke-virtual {p3, v0}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ᩳ᩷;

    if-nez v2, :cond_2

    .line 200
    invoke-static {}, Ll/۠ᩳ᩷;->ۙ()Ll/۠ᩳ᩷;

    move-result-object v2

    .line 201
    invoke-virtual {p3, v0, v2}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    :cond_2
    iget p3, v2, Ll/۠ᩳ᩷;->ۙ:I

    or-int/2addr p3, v1

    iput p3, v2, Ll/۠ᩳ᩷;->ۙ:I

    .line 9520
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Ll/ܿ۟᩷;

    .line 9521
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->wasReturnedFromScrap()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_7

    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isScrap()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    .line 9531
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-ne v2, v4, :cond_6

    .line 9533
    iget-object v1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v1, p1}, Ll/ܳܿ᩷;->᩷(Landroid/view/View;)I

    move-result v1

    const/4 v2, -0x1

    if-ne p2, v2, :cond_4

    .line 9535
    iget-object p2, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {p2}, Ll/ܳܿ᩷;->ۙ()I

    move-result p2

    :cond_4
    if-eq v1, v2, :cond_5

    if-eq v1, p2, :cond_9

    .line 9543
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {p1, v1, p2}, Ll/᩶۟᩷;->moveView(II)V

    goto :goto_4

    .line 9538
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 9540
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {p1}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 9546
    :cond_6
    iget-object v2, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v2, p1, p2, v3}, Ll/ܳܿ᩷;->ۙ(Landroid/view/View;IZ)V

    .line 9547
    iput-boolean v1, p3, Ll/ܿ۟᩷;->᩷:Z

    .line 9548
    iget-object p2, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Ll/ᩴᩳ᩷;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_9

    .line 9549
    iget-object p2, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    invoke-virtual {p2, p1}, Ll/ᩴᩳ᩷;->onChildAttachedToWindow(Landroid/view/View;)V

    goto :goto_4

    .line 9522
    :cond_7
    :goto_2
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isScrap()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 9523
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->unScrap()V

    goto :goto_3

    .line 9525
    :cond_8
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->clearReturnedFromScrapFlag()V

    .line 9527
    :goto_3
    iget-object v1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v3}, Ll/ܳܿ᩷;->ۙ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 9552
    :cond_9
    :goto_4
    iget-boolean p1, p3, Ll/ܿ۟᩷;->ۤ:Z

    if-eqz p1, :cond_b

    .line 9553
    sget-boolean p1, Ll/᩻ᩳ᩷;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_a

    .line 9554
    iget-object p1, p3, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-static {p1}, Ll/ܽۚۗ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 9556
    :cond_a
    iget-object p1, v0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 9557
    iput-boolean v3, p3, Ll/ܿ۟᩷;->ۤ:Z

    :cond_b
    return-void
.end method

.method private ۙ(Ll/ۖ۟᩷;ILandroid/view/View;)V
    .locals 2

    .line 10143
    invoke-static {p3}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v0

    .line 10144
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 10145
    sget-boolean p1, Ll/᩻ᩳ᩷;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_0

    .line 10146
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->toString()Ljava/lang/String;

    :cond_0
    return-void

    .line 10150
    :cond_1
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    .line 10151
    invoke-virtual {v1}, Ll/۫۟᩷;->hasStableIds()Z

    move-result v1

    if-nez v1, :cond_2

    .line 10152
    invoke-virtual {p0, p2}, Ll/᩶۟᩷;->removeViewAt(I)V

    .line 10153
    invoke-virtual {p1, v0}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    return-void

    .line 10155
    :cond_2
    invoke-virtual {p0, p2}, Ll/᩶۟᩷;->detachViewAt(I)V

    .line 10156
    invoke-virtual {p1, p3}, Ll/ۖ۟᩷;->᩷(Landroid/view/View;)V

    .line 10157
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    .line 277
    invoke-virtual {p1, v0}, Ll/۬ᩳ᩷;->ۤ(Ll/ۧᩳ᩷;)V

    return-void
.end method

.method private ۙ(Ll/᩻ᩳ᩷;II)Z
    .locals 6

    .line 10911
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 10915
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v1

    .line 10916
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v2

    .line 10917
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 10918
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    .line 10919
    iget-object v5, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v5, v5, Ll/᩻ᩳ᩷;->mTempRect:Landroid/graphics/Rect;

    .line 10920
    invoke-virtual {p0, p1, v5}, Ll/᩶۟᩷;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 10922
    iget p1, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p1, p2

    if-ge p1, v3, :cond_2

    iget p1, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p1, p2

    if-le p1, v1, :cond_2

    iget p1, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p3

    if-ge p1, v4, :cond_2

    iget p1, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, p3

    if-gt p1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method private ۙ(Landroid/view/View;Landroid/graphics/Rect;)[I
    .locals 7

    .line 10772
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v0

    .line 10773
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v1

    .line 10774
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 10775
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 10776
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    .line 10777
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, p2, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v5, p1

    .line 10778
    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v4

    .line 10779
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    add-int/2addr p2, v5

    sub-int/2addr v4, v0

    const/4 v0, 0x0

    .line 10781
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v1

    .line 10782
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr p1, v2

    .line 10783
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr p2, v3

    .line 10784
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 10790
    invoke-virtual {p0}, Ll/᩶۟᩷;->getLayoutDirection()I

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    .line 10792
    :cond_0
    invoke-static {v6, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    goto :goto_0

    .line 10795
    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_0
    move v2, v6

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    .line 10801
    :cond_3
    invoke-static {v5, p2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 10803
    :goto_2
    filled-new-array {v2, v1}, [I

    move-result-object p1

    return-object p1
.end method

.method public static ᩷(III)Z
    .locals 3

    .line 10282
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 10283
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    if-eq p0, p2, :cond_0

    return v1

    :cond_0
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_4

    if-eqz v0, :cond_3

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1

    return v1

    :cond_1
    if-ne p1, p0, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    if-lt p1, p0, :cond_5

    return v2

    :cond_5
    return v1
.end method


# virtual methods
.method public addDisappearingView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 9460
    invoke-virtual {p0, p1, v0}, Ll/᩶۟᩷;->addDisappearingView(Landroid/view/View;I)V

    return-void
.end method

.method public addDisappearingView(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x1

    .line 9479
    invoke-direct {p0, p1, p2, v0}, Ll/᩶۟᩷;->ۙ(Landroid/view/View;IZ)V

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 9491
    invoke-virtual {p0, p1, v0}, Ll/᩶۟᩷;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 9504
    invoke-direct {p0, p1, p2, v0}, Ll/᩶۟᩷;->ۙ(Landroid/view/View;IZ)V

    return-void
.end method

.method public assertInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 8786
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 8787
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->assertInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 8823
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 8824
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public attachView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 9780
    invoke-virtual {p0, p1, v0}, Ll/᩶۟᩷;->attachView(Landroid/view/View;I)V

    return-void
.end method

.method public attachView(Landroid/view/View;I)V
    .locals 1

    .line 9769
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    invoke-virtual {p0, p1, p2, v0}, Ll/᩶۟᩷;->attachView(Landroid/view/View;ILl/ܿ۟᩷;)V

    return-void
.end method

.method public attachView(Landroid/view/View;ILl/ܿ۟᩷;)V
    .locals 3

    .line 9748
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v0

    .line 9749
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 9750
    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v1, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    .line 198
    iget-object v1, v1, Ll/۬ᩳ᩷;->ۙ:Ll/ۡۗ;

    invoke-virtual {v1, v0}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ᩳ᩷;

    if-nez v2, :cond_0

    .line 200
    invoke-static {}, Ll/۠ᩳ᩷;->ۙ()Ll/۠ᩳ᩷;

    move-result-object v2

    .line 201
    invoke-virtual {v1, v0, v2}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    :cond_0
    iget v1, v2, Ll/۠ᩳ᩷;->ۙ:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v2, Ll/۠ᩳ᩷;->ۙ:I

    goto :goto_0

    .line 9752
    :cond_1
    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v1, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    invoke-virtual {v1, v0}, Ll/۬ᩳ᩷;->ۤ(Ll/ۧᩳ᩷;)V

    .line 9754
    :goto_0
    iget-object v1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v0

    invoke-virtual {v1, p1, p2, p3, v0}, Ll/ܳܿ᩷;->ۙ(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    return-void
.end method

.method public calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .line 10643
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 10644
    invoke-virtual {p2, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    .line 10647
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p1

    .line 10648
    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public canScrollHorizontally()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public canScrollVertically()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public checkLayoutParams(Ll/ܿ۟᩷;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public collectAdjacentPrefetchPositions(IILl/ܳᩳ᩷;Ll/ۘ۟᩷;)V
    .locals 0

    return-void
.end method

.method public collectInitialPrefetchPositions(ILl/ۘ۟᩷;)V
    .locals 0

    return-void
.end method

.method public computeHorizontalScrollExtent(Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeHorizontalScrollOffset(Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeHorizontalScrollRange(Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeVerticalScrollExtent(Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeVerticalScrollOffset(Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public computeVerticalScrollRange(Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public detachAndScrapAttachedViews(Ll/ۖ۟᩷;)V
    .locals 2

    .line 10135
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 10137
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 10138
    invoke-direct {p0, p1, v0, v1}, Ll/᩶۟᩷;->ۙ(Ll/ۖ۟᩷;ILandroid/view/View;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public detachAndScrapView(Landroid/view/View;Ll/ۖ۟᩷;)V
    .locals 1

    .line 9819
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v0, p1}, Ll/ܳܿ᩷;->᩷(Landroid/view/View;)I

    move-result v0

    .line 9820
    invoke-direct {p0, p2, v0, p1}, Ll/᩶۟᩷;->ۙ(Ll/ۖ۟᩷;ILandroid/view/View;)V

    return-void
.end method

.method public detachAndScrapViewAt(ILl/ۖ۟᩷;)V
    .locals 1

    .line 9833
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 9834
    invoke-direct {p0, p2, p1, v0}, Ll/᩶۟᩷;->ۙ(Ll/ۖ۟᩷;ILandroid/view/View;)V

    return-void
.end method

.method public detachView(Landroid/view/View;)V
    .locals 1

    .line 9706
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v0, p1}, Ll/ܳܿ᩷;->᩷(Landroid/view/View;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 9708
    invoke-direct {p0, v0, p1}, Ll/᩶۟᩷;->ۙ(ILandroid/view/View;)V

    :cond_0
    return-void
.end method

.method public detachViewAt(I)V
    .locals 1

    .line 9728
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll/᩶۟᩷;->ۙ(ILandroid/view/View;)V

    return-void
.end method

.method public dispatchAttachedToWindow(Ll/᩻ᩳ᩷;)V
    .locals 1

    const/4 v0, 0x1

    .line 9036
    iput-boolean v0, p0, Ll/᩶۟᩷;->mIsAttachedToWindow:Z

    .line 9037
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->onAttachedToWindow(Ll/᩻ᩳ᩷;)V

    return-void
.end method

.method public dispatchDetachedFromWindow(Ll/᩻ᩳ᩷;Ll/ۖ۟᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 9041
    iput-boolean v0, p0, Ll/᩶۟᩷;->mIsAttachedToWindow:Z

    .line 9042
    invoke-virtual {p0, p1, p2}, Ll/᩶۟᩷;->onDetachedFromWindow(Ll/᩻ᩳ᩷;Ll/ۖ۟᩷;)V

    return-void
.end method

.method public endAnimation(Landroid/view/View;)V
    .locals 1

    .line 9440
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mItemAnimator:Ll/ۗ۟᩷;

    if-eqz v0, :cond_0

    .line 9441
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۗ۟᩷;->᩷(Ll/ۧᩳ᩷;)V

    :cond_0
    return-void
.end method

.method public findContainingItemView(Landroid/view/View;)Landroid/view/View;
    .locals 1

    .line 9647
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-nez v0, :cond_0

    goto :goto_0

    .line 9650
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 9654
    :cond_1
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    .line 367
    iget-object v0, v0, Ll/ܳܿ᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    :cond_2
    return-object p1
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 5

    .line 9675
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 9677
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 9678
    invoke-static {v2}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 9682
    :cond_0
    invoke-virtual {v3}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v4

    if-ne v4, p1, :cond_2

    invoke-virtual {v3}, Ll/ۧᩳ᩷;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v4, v4, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 13625
    iget-boolean v4, v4, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v4, :cond_1

    .line 9683
    invoke-virtual {v3}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    return-object v2

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract generateDefaultLayoutParams()Ll/ܿ۟᩷;
.end method

.method public generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/ܿ۟᩷;
    .locals 1

    .line 9295
    new-instance v0, Ll/ܿ۟᩷;

    invoke-direct {v0, p1, p2}, Ll/ܿ۟᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ܿ۟᩷;
    .locals 1

    .line 9270
    instance-of v0, p1, Ll/ܿ۟᩷;

    if-eqz v0, :cond_0

    .line 9271
    new-instance v0, Ll/ܿ۟᩷;

    check-cast p1, Ll/ܿ۟᩷;

    invoke-direct {v0, p1}, Ll/ܿ۟᩷;-><init>(Ll/ܿ۟᩷;)V

    return-object v0

    .line 9272
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 9273
    new-instance v0, Ll/ܿ۟᩷;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Ll/ܿ۟᩷;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 9275
    :cond_1
    new-instance v0, Ll/ܿ۟᩷;

    invoke-direct {v0, p1}, Ll/ܿ۟᩷;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getBottomDecorationHeight(Landroid/view/View;)I
    .locals 0

    .line 10678
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܿ۟᩷;

    iget-object p1, p1, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    return p1
.end method

.method public getChildAt(I)Landroid/view/View;
    .locals 1

    .line 9878
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ܳܿ᩷;->᩷(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    .line 9867
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܳܿ᩷;->ۙ()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getClipToPadding()Z
    .locals 1

    .line 9149
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ll/᩻ᩳ᩷;->mClipToPadding:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getColumnCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    .line 11459
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-nez p1, :cond_0

    goto :goto_0

    .line 11462
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollHorizontally()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {p1}, Ll/۫۟᩷;->getItemCount()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method public getDecoratedBottom(Landroid/view/View;)I
    .locals 1

    .line 10622
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getBottomDecorationHeight(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 10574
    invoke-static {p1, p2}, Ll/᩻ᩳ᩷;->ۙ(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public getDecoratedLeft(Landroid/view/View;)I
    .locals 1

    .line 10586
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getLeftDecorationWidth(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public getDecoratedMeasuredHeight(Landroid/view/View;)I
    .locals 2

    .line 10452
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    iget-object v0, v0, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 10453
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedMeasuredWidth(Landroid/view/View;)I
    .locals 2

    .line 10439
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    iget-object v0, v0, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 10440
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedRight(Landroid/view/View;)I
    .locals 1

    .line 10610
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getRightDecorationWidth(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedTop(Landroid/view/View;)I
    .locals 1

    .line 10598
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getTopDecorationHeight(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public getFocusedChild()Landroid/view/View;
    .locals 2

    .line 10032
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-nez v0, :cond_0

    goto :goto_0

    .line 10035
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10036
    iget-object v1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    .line 367
    iget-object v1, v1, Ll/ܳܿ᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 9942
    iget v0, p0, Ll/᩶۟᩷;->mHeight:I

    return v0
.end method

.method public getHeightMode()I
    .locals 1

    .line 9910
    iget v0, p0, Ll/᩶۟᩷;->mHeightMode:I

    return v0
.end method

.method public getItemCount()I
    .locals 1

    .line 10055
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->getAdapter()Ll/۫۟᩷;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 10056
    invoke-virtual {v0}, Ll/۫۟᩷;->getItemCount()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(Landroid/view/View;)I
    .locals 0

    .line 9629
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۧᩳ᩷;->getItemViewType()I

    move-result p1

    return p1
.end method

.method public getLayoutDirection()I
    .locals 1

    .line 9419
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    return v0
.end method

.method public getLeftDecorationWidth(Landroid/view/View;)I
    .locals 0

    .line 10693
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܿ۟᩷;

    iget-object p1, p1, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    return p1
.end method

.method public getMinimumHeight()I
    .locals 2

    .line 11202
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    sget v1, Ll/᩸۠;->ۙ:I

    .line 2393
    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public getMinimumWidth()I
    .locals 2

    .line 11194
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    sget v1, Ll/᩸۠;->ۙ:I

    .line 2378
    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public getPaddingBottom()I
    .locals 1

    .line 9982
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingEnd()I
    .locals 2

    .line 10002
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    sget v1, Ll/᩸۠;->ۙ:I

    .line 2235
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingLeft()I
    .locals 1

    .line 9952
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingRight()I
    .locals 1

    .line 9972
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingStart()I
    .locals 2

    .line 9992
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    sget v1, Ll/᩸۠;->ۙ:I

    .line 2220
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingTop()I
    .locals 1

    .line 9962
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPosition(Landroid/view/View;)I
    .locals 0

    .line 9619
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܿ۟᩷;

    .line 12787
    iget-object p1, p1, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {p1}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result p1

    return p1
.end method

.method public getRightDecorationWidth(Landroid/view/View;)I
    .locals 0

    .line 10708
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܿ۟᩷;

    iget-object p1, p1, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    return p1
.end method

.method public getRowCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    .line 11439
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-nez p1, :cond_0

    goto :goto_0

    .line 11442
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollVertically()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {p1}, Ll/۫۟᩷;->getItemCount()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    return p2
.end method

.method public getSelectionModeForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getTopDecorationHeight(Landroid/view/View;)I
    .locals 0

    .line 10663
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܿ۟᩷;

    iget-object p1, p1, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    return p1
.end method

.method public getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .locals 5

    if-eqz p2, :cond_0

    .line 10542
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Ll/ܿ۟᩷;

    iget-object p2, p2, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 10543
    iget v0, p2, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    .line 10544
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, p2, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, p2

    .line 10543
    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    .line 10546
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p3, v1, v1, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 10549
    :goto_0
    iget-object p2, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz p2, :cond_1

    .line 10550
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 10551
    invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_1

    .line 10552
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mTempRectF:Landroid/graphics/RectF;

    .line 10553
    invoke-virtual {v0, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 10554
    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 10555
    iget p2, v0, Landroid/graphics/RectF;->left:F

    float-to-double v1, p2

    .line 10556
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int p2, v1

    iget v1, v0, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    .line 10557
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, v0, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    .line 10558
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, v0

    .line 10559
    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v0, v3

    .line 10555
    invoke-virtual {p3, p2, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 10563
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public getWidth()I
    .locals 1

    .line 9926
    iget v0, p0, Ll/᩶۟᩷;->mWidth:I

    return v0
.end method

.method public getWidthMode()I
    .locals 1

    .line 9894
    iget v0, p0, Ll/᩶۟᩷;->mWidthMode:I

    return v0
.end method

.method public hasFlexibleChildInBothOrientations()Z
    .locals 5

    .line 11656
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 11658
    invoke-virtual {p0, v2}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 11659
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 11660
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gez v4, :cond_0

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public hasFocus()Z
    .locals 1

    .line 10022
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ignoreView(Landroid/view/View;)V
    .locals 2

    .line 10100
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-ne v0, v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 10106
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object p1

    const/16 v0, 0x80

    .line 10107
    invoke-virtual {p1, v0}, Ll/ۧᩳ᩷;->addFlags(I)V

    .line 10108
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mViewInfoStore:Ll/۬ᩳ᩷;

    invoke-virtual {v0, p1}, Ll/۬ᩳ᩷;->᩸(Ll/ۧᩳ᩷;)V

    return-void

    .line 10103
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View should be fully attached to be ignored"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 10104
    invoke-virtual {v1}, Ll/᩻ᩳ᩷;->exceptionLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isAttachedToWindow()Z
    .locals 1

    .line 9053
    iget-boolean v0, p0, Ll/᩶۟᩷;->mIsAttachedToWindow:Z

    return v0
.end method

.method public isAutoMeasureEnabled()Z
    .locals 1

    .line 8914
    iget-boolean v0, p0, Ll/᩶۟᩷;->mAutoMeasure:Z

    return v0
.end method

.method public isFocused()Z
    .locals 1

    .line 10012
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isItemPrefetchEnabled()Z
    .locals 1

    .line 8979
    iget-boolean v0, p0, Ll/᩶۟᩷;->mItemPrefetchEnabled:Z

    return v0
.end method

.method public isLayoutHierarchical(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isLayoutReversed()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isMeasurementCacheEnabled()Z
    .locals 1

    .line 10267
    iget-boolean v0, p0, Ll/᩶۟᩷;->mMeasurementCacheEnabled:Z

    return v0
.end method

.method public isSmoothScrolling()Z
    .locals 1

    .line 9407
    iget-object v0, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩴᩳ᩷;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isViewPartiallyVisible(Landroid/view/View;ZZ)Z
    .locals 0

    .line 10890
    iget-object p3, p0, Ll/᩶۟᩷;->mHorizontalBoundCheck:Ll/ۖᩳ᩷;

    invoke-virtual {p3, p1}, Ll/ۖᩳ᩷;->ۙ(Landroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_0

    iget-object p3, p0, Ll/᩶۟᩷;->mVerticalBoundCheck:Ll/ۖᩳ᩷;

    .line 10892
    invoke-virtual {p3, p1}, Ll/ۖᩳ᩷;->ۙ(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    return p1

    :cond_1
    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public layoutDecorated(Landroid/view/View;IIII)V
    .locals 2

    .line 10486
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    iget-object v0, v0, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 10487
    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public layoutDecoratedWithMargins(Landroid/view/View;IIII)V
    .locals 3

    .line 10521
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    .line 10522
    iget-object v1, v0, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 10523
    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p3, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p4, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public measureChild(Landroid/view/View;II)V
    .locals 5

    .line 10213
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    .line 10215
    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v1, p1}, Ll/᩻ᩳ᩷;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    .line 10216
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v2, p2

    .line 10217
    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, v1

    add-int/2addr p2, p3

    .line 10218
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidthMode()I

    move-result v1

    .line 10219
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 10220
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollHorizontally()Z

    move-result v3

    .line 10218
    invoke-static {p3, v1, v4, v2, v3}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result p3

    .line 10221
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeightMode()I

    move-result v2

    .line 10222
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 10223
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollVertically()Z

    move-result v3

    .line 10221
    invoke-static {v1, v2, v4, p2, v3}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result p2

    .line 10224
    invoke-virtual {p0, p1, p3, p2, v0}, Ll/᩶۟᩷;->shouldMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10225
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public measureChildWithMargins(Landroid/view/View;II)V
    .locals 5

    .line 10311
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܿ۟᩷;

    .line 10313
    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v1, p1}, Ll/᩻ᩳ᩷;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    .line 10314
    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v2, p2

    .line 10315
    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, v1

    add-int/2addr p2, p3

    .line 10317
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidthMode()I

    move-result v1

    .line 10318
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 10320
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollHorizontally()Z

    move-result v3

    .line 10317
    invoke-static {p3, v1, v4, v2, v3}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result p3

    .line 10321
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeightMode()I

    move-result v2

    .line 10322
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v3

    add-int/2addr v4, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 10324
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollVertically()Z

    move-result v3

    .line 10321
    invoke-static {v1, v2, v4, p2, v3}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result p2

    .line 10325
    invoke-virtual {p0, p1, p3, p2, v0}, Ll/᩶۟᩷;->shouldMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10326
    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public moveView(II)V
    .locals 2

    .line 9800
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9805
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->detachViewAt(I)V

    .line 9806
    invoke-virtual {p0, v0, p2}, Ll/᩶۟᩷;->attachView(Landroid/view/View;I)V

    return-void

    .line 9802
    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot move a child from non-existing index:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 9803
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public offsetChildrenHorizontal(I)V
    .locals 1

    .line 10066
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 10067
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->offsetChildrenHorizontal(I)V

    :cond_0
    return-void
.end method

.method public offsetChildrenVertical(I)V
    .locals 1

    .line 10078
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 10079
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->offsetChildrenVertical(I)V

    :cond_0
    return-void
.end method

.method public onAdapterChanged(Ll/۫۟᩷;Ll/۫۟᩷;)V
    .locals 0

    return-void
.end method

.method public onAddFocusables(Ll/᩻ᩳ᩷;Ljava/util/ArrayList;II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onAttachedToWindow(Ll/᩻ᩳ᩷;)V
    .locals 0

    return-void
.end method

.method public onDetachedFromWindow(Ll/᩻ᩳ᩷;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onDetachedFromWindow(Ll/᩻ᩳ᩷;Ll/ۖ۟᩷;)V
    .locals 0

    .line 9140
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->onDetachedFromWindow(Ll/᩻ᩳ᩷;)V

    return-void
.end method

.method public onFocusSearchFailed(Landroid/view/View;ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 11329
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {p0, v1, v0, p1}, Ll/᩶۟᩷;->onInitializeAccessibilityEvent(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 11345
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz p1, :cond_3

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    .line 11348
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 v0, -0x1

    .line 11349
    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 11350
    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 11351
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 11348
    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 11353
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-eqz p1, :cond_3

    .line 11354
    invoke-virtual {p1}, Ll/۫۟᩷;->getItemCount()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ᩴ۬;)V
    .locals 3

    .line 11308
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v0, 0x2000

    .line 11309
    invoke-virtual {p3, v0}, Ll/ᩴ۬;->ۙ(I)V

    .line 11310
    invoke-virtual {p3, v2}, Ll/ᩴ۬;->ܽ(Z)V

    .line 11311
    invoke-virtual {p3}, Ll/ᩴ۬;->ۘ()V

    .line 11313
    :cond_1
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0x1000

    .line 11314
    invoke-virtual {p3, v0}, Ll/ᩴ۬;->ۙ(I)V

    .line 11315
    invoke-virtual {p3, v2}, Ll/ᩴ۬;->ܽ(Z)V

    .line 11316
    invoke-virtual {p3}, Ll/ᩴ۬;->ۘ()V

    .line 11320
    :cond_3
    invoke-virtual {p0, p1, p2}, Ll/᩶۟᩷;->getRowCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v0

    .line 11321
    invoke-virtual {p0, p1, p2}, Ll/᩶۟᩷;->getColumnCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v1

    .line 11322
    invoke-virtual {p0, p1, p2}, Ll/᩶۟᩷;->isLayoutHierarchical(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)Z

    move-result v2

    .line 11323
    invoke-virtual {p0, p1, p2}, Ll/᩶۟᩷;->getSelectionModeForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    .line 11320
    invoke-static {v0, v1, p1, v2}, Ll/᩷۬;->ۙ(IIIZ)Ll/᩷۬;

    move-result-object p1

    .line 11324
    invoke-virtual {p3, p1}, Ll/ᩴ۬;->ۙ(Ll/᩷۬;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Ll/ᩴ۬;)V
    .locals 2

    .line 11278
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {p0, v1, v0, p1}, Ll/᩶۟᩷;->onInitializeAccessibilityNodeInfo(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ᩴ۬;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;Ll/ᩴ۬;)V
    .locals 2

    .line 11360
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11362
    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    iget-object v0, v0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 367
    iget-object v1, v1, Ll/ܳܿ᩷;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 11363
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {p0, v1, v0, p1, p2}, Ll/᩶۟᩷;->onInitializeAccessibilityNodeInfoForItem(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/View;Ll/ᩴ۬;)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/View;Ll/ᩴ۬;)V
    .locals 6

    .line 11385
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollVertically()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p3}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p1

    move v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 11386
    :goto_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->canScrollHorizontally()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, p3}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p1

    move v2, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    const/4 v2, 0x0

    :goto_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v3, 0x1

    .line 11388
    invoke-static/range {v0 .. v5}, Ll/ۤ۬;->ۙ(IIIIZZ)Ll/ۤ۬;

    move-result-object p1

    .line 11390
    invoke-virtual {p4, p1}, Ll/ᩴ۬;->ۙ(Ll/ۤ۬;)V

    return-void
.end method

.method public onInterceptFocusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onItemsAdded(Ll/᩻ᩳ᩷;II)V
    .locals 0

    return-void
.end method

.method public onItemsChanged(Ll/᩻ᩳ᩷;)V
    .locals 0

    return-void
.end method

.method public onItemsMoved(Ll/᩻ᩳ᩷;III)V
    .locals 0

    return-void
.end method

.method public onItemsRemoved(Ll/᩻ᩳ᩷;II)V
    .locals 0

    return-void
.end method

.method public onItemsUpdated(Ll/᩻ᩳ᩷;II)V
    .locals 0

    return-void
.end method

.method public onItemsUpdated(Ll/᩻ᩳ᩷;IILjava/lang/Object;)V
    .locals 0

    .line 11045
    invoke-virtual {p0, p1, p2, p3}, Ll/᩶۟᩷;->onItemsUpdated(Ll/᩻ᩳ᩷;II)V

    return-void
.end method

.method public onLayoutChildren(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)V
    .locals 0

    return-void
.end method

.method public onLayoutCompleted(Ll/ܳᩳ᩷;)V
    .locals 0

    return-void
.end method

.method public onMeasure(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;II)V
    .locals 0

    .line 11175
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {p1, p3, p4}, Ll/᩻ᩳ᩷;->defaultOnMeasure(II)V

    return-void
.end method

.method public onRequestChildFocus(Ll/᩻ᩳ᩷;Landroid/view/View;Landroid/view/View;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 10936
    invoke-virtual {p0}, Ll/᩶۟᩷;->isSmoothScrolling()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ll/᩻ᩳ᩷;->isComputingLayout()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestChildFocus(Ll/᩻ᩳ᩷;Ll/ܳᩳ᩷;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 10958
    invoke-virtual {p0, p1, p3, p4}, Ll/᩶۟᩷;->onRequestChildFocus(Ll/᩻ᩳ᩷;Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onSmoothScrollerStopped(Ll/ᩴᩳ᩷;)V
    .locals 1

    .line 11242
    iget-object v0, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    .line 11243
    iput-object p1, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    :cond_0
    return-void
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 2

    .line 11481
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {p0, v1, v0, p1, p2}, Ll/᩶۟᩷;->performAccessibilityAction(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;ILandroid/os/Bundle;)Z
    .locals 10

    .line 11497
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    .line 11501
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeight()I

    move-result p1

    .line 11502
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result v0

    .line 11503
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 11506
    iget-object v2, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v2, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 11508
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result p1

    .line 11509
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v0

    :cond_1
    const/16 v1, 0x2000

    const/16 v2, 0x1000

    const/4 v3, 0x1

    if-eq p3, v2, :cond_4

    if-eq p3, v1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    .line 11514
    :cond_2
    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 11515
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v4

    sub-int/2addr p1, v4

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v4

    sub-int/2addr p1, v4

    neg-int p1, p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    .line 11517
    :goto_0
    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v4, v5}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 11518
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v0, v4

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v4

    sub-int/2addr v0, v4

    neg-int v0, v0

    goto :goto_3

    .line 11522
    :cond_4
    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v4, v3}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 11523
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v4

    sub-int/2addr p1, v4

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v4

    sub-int/2addr p1, v4

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    .line 11525
    :goto_1
    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v4, v3}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 11526
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v0, v4

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v4

    sub-int/2addr v0, v4

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v0, 0x0

    :goto_3
    if-nez p1, :cond_7

    if-nez v0, :cond_7

    return p2

    :cond_7
    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz p4, :cond_9

    const-string v6, "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT"

    .line 11538
    invoke-virtual {p4, v6, v5}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p4

    cmpg-float v6, p4, v4

    if-gez v6, :cond_a

    .line 11541
    sget-boolean p1, Ll/᩻ᩳ᩷;->sDebugAssertionsEnabled:Z

    if-nez p1, :cond_8

    return p2

    .line 11542
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ("

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p3, ")"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    const/high16 p4, 0x3f800000    # 1.0f

    :cond_a
    const/high16 v6, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 11550
    invoke-static {p4, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-nez v6, :cond_e

    .line 11555
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p4, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-nez p4, :cond_b

    return p2

    :cond_b
    if-eq p3, v2, :cond_d

    if-eq p3, v1, :cond_c

    goto :goto_4

    .line 11560
    :cond_c
    invoke-virtual {p1, p2}, Ll/᩻ᩳ᩷;->smoothScrollToPosition(I)V

    goto :goto_4

    .line 11564
    :cond_d
    invoke-virtual {p4}, Ll/۫۟᩷;->getItemCount()I

    move-result p2

    sub-int/2addr p2, v3

    .line 11563
    invoke-virtual {p1, p2}, Ll/᩻ᩳ᩷;->smoothScrollToPosition(I)V

    :goto_4
    return v3

    .line 11572
    :cond_e
    invoke-static {v5, p4}, Ljava/lang/Float;->compare(FF)I

    move-result p2

    if-eqz p2, :cond_f

    invoke-static {v4, p4}, Ljava/lang/Float;->compare(FF)I

    move-result p2

    if-eqz p2, :cond_f

    int-to-float p2, v0

    mul-float p2, p2, p4

    float-to-int v0, p2

    int-to-float p1, p1

    mul-float p1, p1, p4

    float-to-int p1, p1

    :cond_f
    move v6, p1

    move v5, v0

    .line 11578
    iget-object v4, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/high16 v8, -0x80000000

    const/4 v9, 0x1

    const/4 v7, 0x0

    invoke-virtual/range {v4 .. v9}, Ll/᩻ᩳ᩷;->smoothScrollBy(IILandroid/view/animation/Interpolator;IZ)V

    return v3
.end method

.method public performAccessibilityActionForItem(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 7

    .line 11585
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v2, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v3, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Ll/᩶۟᩷;->performAccessibilityActionForItem(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityActionForItem(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public postOnAnimation(Ljava/lang/Runnable;)V
    .locals 2

    .line 9066
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 9067
    sget v1, Ll/᩸۠;->ۙ:I

    .line 1359
    invoke-virtual {v0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public removeAllViews()V
    .locals 2

    .line 9595
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 9597
    iget-object v1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v1, v0}, Ll/ܳܿ᩷;->᩸(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeAndRecycleAllViews(Ll/ۖ۟᩷;)V
    .locals 2

    .line 11268
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 11269
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 11270
    invoke-static {v1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۧᩳ᩷;->shouldIgnore()Z

    move-result v1

    if-nez v1, :cond_0

    .line 11271
    invoke-virtual {p0, v0, p1}, Ll/᩶۟᩷;->removeAndRecycleViewAt(ILl/ۖ۟᩷;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeAndRecycleScrapInt(Ll/ۖ۟᩷;)V
    .locals 7

    .line 7343
    iget-object v0, p1, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_3

    .line 7347
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧᩳ᩷;

    iget-object v3, v3, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 10175
    invoke-static {v3}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v4

    .line 10176
    invoke-virtual {v4}, Ll/ۧᩳ᩷;->shouldIgnore()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 10184
    invoke-virtual {v4, v5}, Ll/ۧᩳ᩷;->setIsRecyclable(Z)V

    .line 10185
    invoke-virtual {v4}, Ll/ۧᩳ᩷;->isTmpDetached()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 10186
    iget-object v6, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v6, v3, v5}, Ll/᩻ᩳ᩷;->removeDetachedView(Landroid/view/View;Z)V

    .line 10188
    :cond_1
    iget-object v6, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v6, v6, Ll/᩻ᩳ᩷;->mItemAnimator:Ll/ۗ۟᩷;

    if-eqz v6, :cond_2

    .line 10189
    invoke-virtual {v6, v4}, Ll/ۗ۟᩷;->᩷(Ll/ۧᩳ᩷;)V

    :cond_2
    const/4 v6, 0x1

    .line 10191
    invoke-virtual {v4, v6}, Ll/ۧᩳ᩷;->setIsRecyclable(Z)V

    .line 7289
    invoke-static {v3}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v3

    const/4 v4, 0x0

    .line 7290
    iput-object v4, v3, Ll/ۧᩳ᩷;->mScrapContainer:Ll/ۖ۟᩷;

    .line 7291
    iput-boolean v5, v3, Ll/ۧᩳ᩷;->mInChangeScrap:Z

    .line 7292
    invoke-virtual {v3}, Ll/ۧᩳ᩷;->clearReturnedFromScrapFlag()V

    .line 7293
    invoke-virtual {p1, v3}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;)V

    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 7351
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7352
    iget-object p1, p1, Ll/ۖ۟᩷;->ۤ:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    .line 7353
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v1, :cond_5

    .line 10196
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public removeAndRecycleView(Landroid/view/View;Ll/ۖ۟᩷;)V
    .locals 0

    .line 9844
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->removeView(Landroid/view/View;)V

    .line 9845
    invoke-virtual {p2, p1}, Ll/ۖ۟᩷;->ۙ(Landroid/view/View;)V

    return-void
.end method

.method public removeAndRecycleViewAt(ILl/ۖ۟᩷;)V
    .locals 1

    .line 9855
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 9856
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->removeViewAt(I)V

    .line 9857
    invoke-virtual {p2, v0}, Ll/ۖ۟᩷;->ۙ(Landroid/view/View;)V

    return-void
.end method

.method public removeCallbacks(Ljava/lang/Runnable;)Z
    .locals 1

    .line 9084
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 9085
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeDetachedView(Landroid/view/View;)V
    .locals 2

    .line 9790
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/᩻ᩳ᩷;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1

    .line 9571
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v0, p1}, Ll/ܳܿ᩷;->ۤ(Landroid/view/View;)V

    return-void
.end method

.method public removeViewAt(I)V
    .locals 1

    .line 9583
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9585
    iget-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v0, p1}, Ll/ܳܿ᩷;->᩸(I)V

    :cond_0
    return-void
.end method

.method public requestChildRectangleOnScreen(Ll/᩻ᩳ᩷;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 10825
    invoke-virtual/range {v0 .. v5}, Ll/᩶۟᩷;->requestChildRectangleOnScreen(Ll/᩻ᩳ᩷;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    move-result p1

    return p1
.end method

.method public requestChildRectangleOnScreen(Ll/᩻ᩳ᩷;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 2

    .line 10846
    invoke-direct {p0, p2, p3}, Ll/᩶۟᩷;->ۙ(Landroid/view/View;Landroid/graphics/Rect;)[I

    move-result-object p2

    const/4 p3, 0x0

    .line 10848
    aget v0, p2, p3

    const/4 v1, 0x1

    .line 10849
    aget p2, p2, v1

    if-eqz p5, :cond_0

    .line 10850
    invoke-direct {p0, p1, v0, p2}, Ll/᩶۟᩷;->ۙ(Ll/᩻ᩳ᩷;II)Z

    move-result p5

    if-eqz p5, :cond_1

    :cond_0
    if-nez v0, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    return p3

    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    .line 10853
    invoke-virtual {p1, v0, p2}, Ll/᩻ᩳ᩷;->scrollBy(II)V

    goto :goto_1

    .line 10855
    :cond_3
    invoke-virtual {p1, v0, p2}, Ll/᩻ᩳ᩷;->smoothScrollBy(II)V

    :goto_1
    return v1
.end method

.method public requestLayout()V
    .locals 1

    .line 8773
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz v0, :cond_0

    .line 8774
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->requestLayout()V

    :cond_0
    return-void
.end method

.method public requestSimpleAnimationsInNextLayout()V
    .locals 1

    const/4 v0, 0x1

    .line 11403
    iput-boolean v0, p0, Ll/᩶۟᩷;->mRequestedSimpleAnimations:Z

    return-void
.end method

.method public scrollHorizontallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public scrollToPosition(I)V
    .locals 0

    .line 9362
    sget p1, Ll/᩻ᩳ᩷;->HORIZONTAL:I

    return-void
.end method

.method public scrollVerticallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setAutoMeasureEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 8842
    iput-boolean p1, p0, Ll/᩶۟᩷;->mAutoMeasure:Z

    return-void
.end method

.method public setExactMeasureSpecsFrom(Ll/᩻ᩳ᩷;)V
    .locals 2

    .line 11636
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 11637
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 11635
    invoke-virtual {p0, v0, p1}, Ll/᩶۟᩷;->setMeasureSpecs(II)V

    return-void
.end method

.method public final setItemPrefetchEnabled(Z)V
    .locals 1

    .line 8962
    iget-boolean v0, p0, Ll/᩶۟᩷;->mItemPrefetchEnabled:Z

    if-eq p1, v0, :cond_0

    .line 8963
    iput-boolean p1, p0, Ll/᩶۟᩷;->mItemPrefetchEnabled:Z

    const/4 p1, 0x0

    .line 8964
    iput p1, p0, Ll/᩶۟᩷;->mPrefetchMaxCountObserved:I

    .line 8965
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    if-eqz p1, :cond_0

    .line 8966
    iget-object p1, p1, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    invoke-virtual {p1}, Ll/ۖ۟᩷;->ܳ()V

    :cond_0
    return-void
.end method

.method public setMeasureSpecs(II)V
    .locals 1

    .line 8684
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Ll/᩶۟᩷;->mWidth:I

    .line 8685
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Ll/᩶۟᩷;->mWidthMode:I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 8686
    sget-boolean p1, Ll/᩻ᩳ᩷;->ALLOW_SIZE_IN_UNSPECIFIED_SPEC:Z

    if-nez p1, :cond_0

    .line 8687
    iput v0, p0, Ll/᩶۟᩷;->mWidth:I

    .line 8690
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Ll/᩶۟᩷;->mHeight:I

    .line 8691
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Ll/᩶۟᩷;->mHeightMode:I

    if-nez p1, :cond_1

    .line 8692
    sget-boolean p1, Ll/᩻ᩳ᩷;->ALLOW_SIZE_IN_UNSPECIFIED_SPEC:Z

    if-nez p1, :cond_1

    .line 8693
    iput v0, p0, Ll/᩶۟᩷;->mHeight:I

    :cond_1
    return-void
.end method

.method public setMeasuredDimension(II)V
    .locals 1

    .line 11186
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-static {v0, p1, p2}, Ll/᩻ᩳ᩷;->ۙ(Ll/᩻ᩳ᩷;II)V

    return-void
.end method

.method public setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 2

    .line 8762
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, v1

    .line 8763
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result p1

    add-int/2addr p1, v1

    .line 8764
    invoke-virtual {p0}, Ll/᩶۟᩷;->getMinimumWidth()I

    move-result v1

    invoke-static {p2, v0, v1}, Ll/᩶۟᩷;->ۙ(III)I

    move-result p2

    .line 8765
    invoke-virtual {p0}, Ll/᩶۟᩷;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, Ll/᩶۟᩷;->ۙ(III)I

    move-result p1

    .line 8766
    invoke-virtual {p0, p2, p1}, Ll/᩶۟᩷;->setMeasuredDimension(II)V

    return-void
.end method

.method public setMeasuredDimensionFromChildren(II)V
    .locals 8

    .line 8711
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 8713
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {v0, p1, p2}, Ll/᩻ᩳ᩷;->defaultOnMeasure(II)V

    return-void

    :cond_0
    const/high16 v1, -0x80000000

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    const v4, 0x7fffffff

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_5

    .line 8722
    invoke-virtual {p0, v5}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 8723
    iget-object v7, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v7, v7, Ll/᩻ᩳ᩷;->mTempRect:Landroid/graphics/Rect;

    .line 8724
    invoke-virtual {p0, v6, v7}, Ll/᩶۟᩷;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 8725
    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v3, :cond_1

    move v3, v6

    .line 8728
    :cond_1
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v1, :cond_2

    move v1, v6

    .line 8731
    :cond_2
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v4, :cond_3

    move v4, v6

    .line 8734
    :cond_3
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v2, :cond_4

    move v2, v6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 8738
    :cond_5
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 8739
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, Ll/᩶۟᩷;->setMeasuredDimension(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public setMeasurementCacheEnabled(Z)V
    .locals 0

    .line 10278
    iput-boolean p1, p0, Ll/᩶۟᩷;->mMeasurementCacheEnabled:Z

    return-void
.end method

.method public setRecyclerView(Ll/᩻ᩳ᩷;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 8669
    iput-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 8670
    iput-object p1, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    const/4 p1, 0x0

    .line 8671
    iput p1, p0, Ll/᩶۟᩷;->mWidth:I

    .line 8672
    iput p1, p0, Ll/᩶۟᩷;->mHeight:I

    goto :goto_0

    .line 8674
    :cond_0
    iput-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 8675
    iget-object v0, p1, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    iput-object v0, p0, Ll/᩶۟᩷;->mChildHelper:Ll/ܳܿ᩷;

    .line 8676
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Ll/᩶۟᩷;->mWidth:I

    .line 8677
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Ll/᩶۟᩷;->mHeight:I

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    .line 8679
    iput p1, p0, Ll/᩶۟᩷;->mWidthMode:I

    .line 8680
    iput p1, p0, Ll/᩶۟᩷;->mHeightMode:I

    return-void
.end method

.method public shouldMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z
    .locals 2

    .line 10251
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩶۟᩷;->mMeasurementCacheEnabled:Z

    if-eqz v0, :cond_1

    .line 10253
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Ll/᩶۟᩷;->᩷(III)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 10254
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Ll/᩶۟᩷;->᩷(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public shouldMeasureTwice()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldReMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z
    .locals 2

    .line 10236
    iget-boolean v0, p0, Ll/᩶۟᩷;->mMeasurementCacheEnabled:Z

    if-eqz v0, :cond_1

    .line 10237
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Ll/᩶۟᩷;->᩷(III)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 10238
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Ll/᩶۟᩷;->᩷(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public smoothScrollToPosition(Ll/᩻ᩳ᩷;Ll/ܳᩳ᩷;I)V
    .locals 0

    return-void
.end method

.method public startSmoothScroll(Ll/ᩴᩳ᩷;)V
    .locals 1

    .line 9395
    iget-object v0, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    if-eqz v0, :cond_0

    if-eq p1, v0, :cond_0

    .line 9396
    invoke-virtual {v0}, Ll/ᩴᩳ᩷;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9397
    iget-object v0, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    invoke-virtual {v0}, Ll/ᩴᩳ᩷;->stop()V

    .line 9399
    :cond_0
    iput-object p1, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    .line 9400
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    invoke-virtual {p1, v0, p0}, Ll/ᩴᩳ᩷;->start(Ll/᩻ᩳ᩷;Ll/᩶۟᩷;)V

    return-void
.end method

.method public stopIgnoringView(Landroid/view/View;)V
    .locals 1

    .line 10121
    invoke-static {p1}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object p1

    .line 10122
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->stopIgnoring()V

    .line 10123
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->resetInternal()V

    const/4 v0, 0x4

    .line 10124
    invoke-virtual {p1, v0}, Ll/ۧᩳ᩷;->addFlags(I)V

    return-void
.end method

.method public stopSmoothScroller()V
    .locals 1

    .line 11236
    iget-object v0, p0, Ll/᩶۟᩷;->mSmoothScroller:Ll/ᩴᩳ᩷;

    if-eqz v0, :cond_0

    .line 11237
    invoke-virtual {v0}, Ll/ᩴᩳ᩷;->stop()V

    :cond_0
    return-void
.end method

.method public supportsPredictiveItemAnimations()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
