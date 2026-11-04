.class public Ll/֡֡᩷;
.super Ll/᩶۟᩷;
.source "K4ND"

# interfaces
.implements Ll/᩵֡᩷;
.implements Ll/᩸ᩳ᩷;


# static fields
.field public static final DEBUG:Z = false

.field public static final HORIZONTAL:I = 0x0

.field public static final INVALID_OFFSET:I = -0x80000000

.field public static final MAX_SCROLL_FACTOR:F = 0.33333334f

.field public static final TAG:Ljava/lang/String; = "LinearLayoutManager"

.field public static final VERTICAL:I = 0x1


# instance fields
.field public final mAnchorInfo:Ll/᩺֡᩷;

.field public mInitialPrefetchItemCount:I

.field public mLastStackFromEnd:Z

.field public final mLayoutChunkResult:Ll/ۘ֡᩷;

.field public mLayoutState:Ll/ܰ֡᩷;

.field public mOrientation:I

.field public mOrientationHelper:Ll/ۡ֡᩷;

.field public mPendingSavedState:Ll/ܿ֡᩷;

.field public mPendingScrollPosition:I

.field public mPendingScrollPositionOffset:I

.field public mRecycleChildrenOnDetach:Z

.field public mReusableIntPair:[I

.field public mReverseLayout:Z

.field public mShouldReverseLayout:Z

.field public mSmoothScrollbarEnabled:Z

.field public mStackFromEnd:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 168
    invoke-direct {p0, p1, v0, v1}, Ll/֡֡᩷;-><init>(Landroid/content/Context;IZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;IZ)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 183
    invoke-direct {p0}, Ll/᩶۟᩷;-><init>()V

    const/4 p1, 0x1

    .line 72
    iput p1, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v0, 0x0

    .line 99
    iput-boolean v0, p0, Ll/֡֡᩷;->mReverseLayout:Z

    .line 106
    iput-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    .line 113
    iput-boolean v0, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    .line 119
    iput-boolean p1, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    const/4 p1, -0x1

    .line 125
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    const/high16 p1, -0x80000000

    .line 131
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    const/4 p1, 0x0

    .line 135
    iput-object p1, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    .line 141
    new-instance p1, Ll/᩺֡᩷;

    invoke-direct {p1}, Ll/᩺֡᩷;-><init>()V

    iput-object p1, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    .line 146
    new-instance p1, Ll/ۘ֡᩷;

    .line 2670
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object p1, p0, Ll/֡֡᩷;->mLayoutChunkResult:Ll/ۘ֡᩷;

    const/4 p1, 0x2

    .line 151
    iput p1, p0, Ll/֡֡᩷;->mInitialPrefetchItemCount:I

    new-array p1, p1, [I

    .line 156
    iput-object p1, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    .line 184
    invoke-virtual {p0, p2}, Ll/֡֡᩷;->setOrientation(I)V

    .line 185
    invoke-virtual {p0, p3}, Ll/֡֡᩷;->setReverseLayout(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 198
    invoke-direct {p0}, Ll/᩶۟᩷;-><init>()V

    const/4 v0, 0x1

    .line 72
    iput v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x0

    .line 99
    iput-boolean v1, p0, Ll/֡֡᩷;->mReverseLayout:Z

    .line 106
    iput-boolean v1, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    .line 113
    iput-boolean v1, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    .line 119
    iput-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    const/4 v0, -0x1

    .line 125
    iput v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    const/high16 v0, -0x80000000

    .line 131
    iput v0, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    .line 141
    new-instance v0, Ll/᩺֡᩷;

    invoke-direct {v0}, Ll/᩺֡᩷;-><init>()V

    iput-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    .line 146
    new-instance v0, Ll/ۘ֡᩷;

    .line 2670
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 146
    iput-object v0, p0, Ll/֡֡᩷;->mLayoutChunkResult:Ll/ۘ֡᩷;

    const/4 v0, 0x2

    .line 151
    iput v0, p0, Ll/֡֡᩷;->mInitialPrefetchItemCount:I

    new-array v0, v0, [I

    .line 156
    iput-object v0, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    .line 199
    invoke-static {p1, p2, p3, p4}, Ll/᩶۟᩷;->ۙ(Landroid/content/Context;Landroid/util/AttributeSet;II)Ll/ܰ۟᩷;

    move-result-object p1

    .line 200
    iget p2, p1, Ll/ܰ۟᩷;->ۙ:I

    invoke-virtual {p0, p2}, Ll/֡֡᩷;->setOrientation(I)V

    .line 201
    iget-boolean p2, p1, Ll/ܰ۟᩷;->᩷:Z

    invoke-virtual {p0, p2}, Ll/֡֡᩷;->setReverseLayout(Z)V

    .line 202
    iget-boolean p1, p1, Ll/ܰ۟᩷;->᩸:Z

    invoke-virtual {p0, p1}, Ll/֡֡᩷;->setStackFromEnd(Z)V

    return-void
.end method

.method private getChildClosestToEnd()Landroid/view/View;
    .locals 1

    .line 1866
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private getChildClosestToStart()Landroid/view/View;
    .locals 1

    .line 1856
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;Z)I
    .locals 1

    .line 1049
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->᩷()I

    move-result v0

    sub-int/2addr v0, p1

    if-lez v0, :cond_1

    neg-int v0, v0

    .line 1052
    invoke-virtual {p0, v0, p2, p3}, Ll/֡֡᩷;->scrollBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p2

    neg-int p2, p2

    add-int/2addr p1, p2

    if-eqz p4, :cond_0

    .line 1060
    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p3}, Ll/ۡ֡᩷;->᩷()I

    move-result p3

    sub-int/2addr p3, p1

    if-lez p3, :cond_0

    .line 1062
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1, p3}, Ll/ۡ֡᩷;->ۙ(I)V

    add-int/2addr p3, p2

    return p3

    :cond_0
    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ۙ(Ll/ܳᩳ᩷;)I
    .locals 6

    .line 1269
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1272
    :cond_0
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 1273
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    .line 1274
    invoke-virtual {p0, v0, v2}, Ll/֡֡᩷;->findFirstVisibleChildClosestToStart(ZZ)Landroid/view/View;

    move-result-object v3

    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    xor-int/2addr v0, v2

    .line 1275
    invoke-virtual {p0, v0, v2}, Ll/֡֡᩷;->findFirstVisibleChildClosestToEnd(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v5, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    move-object v0, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, p0

    .line 1273
    invoke-static/range {v0 .. v5}, Ll/ܶᩳ᩷;->ۙ(Ll/ܳᩳ᩷;Ll/ۡ֡᩷;Landroid/view/View;Landroid/view/View;Ll/᩶۟᩷;Z)I

    move-result p1

    return p1
.end method

.method private ۙ()Landroid/view/View;
    .locals 2

    const/4 v0, 0x0

    .line 2015
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/֡֡᩷;->findOnePartiallyOrCompletelyInvisibleChild(II)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private ۙ(II)V
    .locals 3

    .line 1099
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->᩷()I

    move-result v1

    sub-int/2addr v1, p2

    iput v1, v0, Ll/ܰ֡᩷;->ۙ:I

    .line 1100
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget-boolean v1, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 1101
    :goto_0
    iput v1, v0, Ll/ܰ֡᩷;->ᩴ:I

    .line 1102
    iput p1, v0, Ll/ܰ֡᩷;->᩷:I

    .line 1103
    iput v2, v0, Ll/ܰ֡᩷;->۫:I

    .line 1104
    iput p2, v0, Ll/ܰ֡᩷;->֫:I

    const/high16 p1, -0x80000000

    .line 1105
    iput p1, v0, Ll/ܰ֡᩷;->ܺ:I

    return-void
.end method

.method private ۙ(IIZLl/ܳᩳ᩷;)V
    .locals 4

    .line 1323
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    invoke-virtual {p0}, Ll/֡֡᩷;->resolveIsInfinite()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܰ֡᩷;->᩸:Z

    .line 1324
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput p1, v0, Ll/ܰ֡᩷;->۫:I

    .line 1325
    iget-object v0, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    const/4 v1, 0x0

    aput v1, v0, v1

    const/4 v2, 0x1

    .line 1326
    aput v1, v0, v2

    .line 1327
    invoke-virtual {p0, p4, v0}, Ll/֡֡᩷;->calculateExtraLayoutSpace(Ll/ܳᩳ᩷;[I)V

    .line 1328
    iget-object p4, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    aget p4, p4, v1

    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    .line 1329
    iget-object v0, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    aget v0, v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-ne p1, v2, :cond_0

    const/4 v1, 0x1

    .line 1331
    :cond_0
    iget-object p1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    if-eqz v1, :cond_1

    move v3, v0

    goto :goto_0

    :cond_1
    move v3, p4

    :goto_0
    iput v3, p1, Ll/ܰ֡᩷;->ۤ:I

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move p4, v0

    .line 1332
    :goto_1
    iput p4, p1, Ll/ܰ֡᩷;->ۚ:I

    if-eqz v1, :cond_4

    .line 1335
    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p4}, Ll/ۡ֡᩷;->ۤ()I

    move-result p4

    add-int/2addr p4, v3

    iput p4, p1, Ll/ܰ֡᩷;->ۤ:I

    .line 1337
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToEnd()Landroid/view/View;

    move-result-object p1

    .line 1339
    iget-object p4, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_3

    const/4 v2, -0x1

    .line 1340
    :cond_3
    iput v2, p4, Ll/ܰ֡᩷;->ᩴ:I

    .line 1341
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v2, v1, Ll/ܰ֡᩷;->ᩴ:I

    add-int/2addr v0, v2

    iput v0, p4, Ll/ܰ֡᩷;->᩷:I

    .line 1342
    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p4, p1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p4

    iput p4, v1, Ll/ܰ֡᩷;->֫:I

    .line 1344
    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p4, p1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p1

    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1345
    invoke-virtual {p4}, Ll/ۡ֡᩷;->᩷()I

    move-result p4

    sub-int/2addr p1, p4

    goto :goto_3

    .line 1348
    :cond_4
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToStart()Landroid/view/View;

    move-result-object p1

    .line 1349
    iget-object p4, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v0, p4, Ll/ܰ֡᩷;->ۤ:I

    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->ܳ()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p4, Ll/ܰ֡᩷;->ۤ:I

    .line 1350
    iget-object p4, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, -0x1

    .line 1351
    :goto_2
    iput v2, p4, Ll/ܰ֡᩷;->ᩴ:I

    .line 1352
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v2, v1, Ll/ܰ֡᩷;->ᩴ:I

    add-int/2addr v0, v2

    iput v0, p4, Ll/ܰ֡᩷;->᩷:I

    .line 1353
    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p4, p1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p4

    iput p4, v1, Ll/ܰ֡᩷;->֫:I

    .line 1354
    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p4, p1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p1

    neg-int p1, p1

    iget-object p4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1355
    invoke-virtual {p4}, Ll/ۡ֡᩷;->ܳ()I

    move-result p4

    add-int/2addr p1, p4

    .line 1357
    :goto_3
    iget-object p4, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput p2, p4, Ll/ܰ֡᩷;->ۙ:I

    if-eqz p3, :cond_6

    sub-int/2addr p2, p1

    .line 1359
    iput p2, p4, Ll/ܰ֡᩷;->ۙ:I

    .line 1361
    :cond_6
    iput p1, p4, Ll/ܰ֡᩷;->ܺ:I

    return-void
.end method

.method private ۙ(Ll/ۖ۟᩷;II)V
    .locals 0

    if-ne p2, p3, :cond_0

    goto :goto_2

    :cond_0
    if-le p3, p2, :cond_1

    :goto_0
    add-int/lit8 p3, p3, -0x1

    if-lt p3, p2, :cond_2

    .line 1524
    invoke-virtual {p0, p3, p1}, Ll/᩶۟᩷;->removeAndRecycleViewAt(ILl/ۖ۟᩷;)V

    goto :goto_0

    :cond_1
    :goto_1
    if-le p2, p3, :cond_2

    .line 1528
    invoke-virtual {p0, p2, p1}, Ll/᩶۟᩷;->removeAndRecycleViewAt(ILl/ۖ۟᩷;)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method private ۙ(Ll/ۖ۟᩷;Ll/ܰ֡᩷;)V
    .locals 3

    .line 1641
    iget-boolean v0, p2, Ll/ܰ֡᩷;->ۧ:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p2, Ll/ܰ֡᩷;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1644
    :cond_0
    iget v0, p2, Ll/ܰ֡᩷;->ܺ:I

    .line 1645
    iget v1, p2, Ll/ܰ֡᩷;->ۚ:I

    .line 1646
    iget p2, p2, Ll/ܰ֡᩷;->۫:I

    const/4 v2, -0x1

    if-ne p2, v2, :cond_1

    .line 1647
    invoke-direct {p0, p1, v0, v1}, Ll/֡֡᩷;->᩷(Ll/ۖ۟᩷;II)V

    return-void

    .line 1649
    :cond_1
    invoke-direct {p0, p1, v0, v1}, Ll/֡֡᩷;->ۤ(Ll/ۖ۟᩷;II)V

    :cond_2
    :goto_0
    return-void
.end method

.method private ۙ(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;II)V
    .locals 10

    .line 13636
    iget-boolean v0, p2, Ll/ܳᩳ᩷;->ۧ:Z

    if-eqz v0, :cond_7

    .line 839
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_7

    .line 13625
    iget-boolean v0, p2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v0, :cond_7

    .line 840
    invoke-virtual {p0}, Ll/֡֡᩷;->supportsPredictiveItemAnimations()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 845
    :cond_0
    invoke-virtual {p1}, Ll/ۖ۟᩷;->᩷()Ljava/util/List;

    move-result-object v0

    .line 846
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    .line 847
    invoke-virtual {p0, v2}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    .line 849
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧᩳ᩷;

    .line 850
    invoke-virtual {v7}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    .line 853
    :cond_1
    invoke-virtual {v7}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v8

    if-ge v8, v3, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 854
    :goto_1
    iget-boolean v9, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eq v8, v9, :cond_3

    .line 857
    iget-object v8, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    iget-object v7, v7, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v8, v7}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v7

    add-int/2addr v5, v7

    goto :goto_2

    .line 859
    :cond_3
    iget-object v8, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    iget-object v7, v7, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v8, v7}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v7

    add-int/2addr v6, v7

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 867
    :cond_4
    iget-object v1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput-object v0, v1, Ll/ܰ֡᩷;->᩻:Ljava/util/List;

    const/4 v0, 0x0

    if-lez v5, :cond_5

    .line 869
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToStart()Landroid/view/View;

    move-result-object v1

    .line 870
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v1

    invoke-direct {p0, v1, p3}, Ll/֡֡᩷;->᩷(II)V

    .line 871
    iget-object p3, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v5, p3, Ll/ܰ֡᩷;->ۤ:I

    .line 872
    iput v2, p3, Ll/ܰ֡᩷;->ۙ:I

    .line 2452
    invoke-virtual {p3, v0}, Ll/ܰ֡᩷;->ۙ(Landroid/view/View;)V

    .line 874
    iget-object p3, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    invoke-virtual {p0, p1, p3, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    :cond_5
    if-lez v6, :cond_6

    .line 878
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToEnd()Landroid/view/View;

    move-result-object p3

    .line 879
    invoke-virtual {p0, p3}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p3

    invoke-direct {p0, p3, p4}, Ll/֡֡᩷;->ۙ(II)V

    .line 880
    iget-object p3, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v6, p3, Ll/ܰ֡᩷;->ۤ:I

    .line 881
    iput v2, p3, Ll/ܰ֡᩷;->ۙ:I

    .line 2452
    invoke-virtual {p3, v0}, Ll/ܰ֡᩷;->ۙ(Landroid/view/View;)V

    .line 883
    iget-object p3, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    invoke-virtual {p0, p1, p3, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 885
    :cond_6
    iget-object p1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput-object v0, p1, Ll/ܰ֡᩷;->᩻:Ljava/util/List;

    :cond_7
    :goto_3
    return-void
.end method

.method private ۙ(Ll/᩺֡᩷;)V
    .locals 1

    .line 1095
    iget v0, p1, Ll/᩺֡᩷;->᩸:I

    iget p1, p1, Ll/᩺֡᩷;->ۙ:I

    invoke-direct {p0, v0, p1}, Ll/֡֡᩷;->ۙ(II)V

    return-void
.end method

.method private ۙ(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;)Z
    .locals 5

    .line 918
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 921
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    .line 922
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2606
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ܿ۟᩷;

    .line 12758
    iget-object v4, v3, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v4}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v4

    if-nez v4, :cond_1

    .line 12787
    iget-object v4, v3, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v4}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v4

    if-ltz v4, :cond_1

    iget-object v3, v3, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v3}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v3

    .line 2608
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v4

    if-ge v3, v4, :cond_1

    .line 923
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1, v0}, Ll/᩺֡᩷;->᩷(ILandroid/view/View;)V

    return v2

    .line 926
    :cond_1
    iget-boolean v0, p0, Ll/֡֡᩷;->mLastStackFromEnd:Z

    iget-boolean v3, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    if-eq v0, v3, :cond_2

    goto :goto_1

    .line 929
    :cond_2
    iget-boolean v0, p3, Ll/᩺֡᩷;->᩷:Z

    .line 930
    invoke-virtual {p0, p1, p2, v0, v3}, Ll/֡֡᩷;->findReferenceChild(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;ZZ)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 936
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p3, v0, p1}, Ll/᩺֡᩷;->ۙ(ILandroid/view/View;)V

    .line 13625
    iget-boolean p2, p2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez p2, :cond_7

    .line 939
    invoke-virtual {p0}, Ll/֡֡᩷;->supportsPredictiveItemAnimations()Z

    move-result p2

    if-eqz p2, :cond_7

    .line 941
    iget-object p2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p2, p1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p2

    .line 942
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p1

    .line 943
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->ܳ()I

    move-result v0

    .line 944
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3}, Ll/ۡ֡᩷;->᩷()I

    move-result v3

    if-gt p1, v0, :cond_3

    if-ge p2, v0, :cond_3

    const/4 v4, 0x1

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    if-lt p2, v3, :cond_4

    if-le p1, v3, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-nez v4, :cond_5

    if-eqz v1, :cond_7

    .line 950
    :cond_5
    iget-boolean p1, p3, Ll/᩺֡᩷;->᩷:Z

    if-eqz p1, :cond_6

    move v0, v3

    :cond_6
    iput v0, p3, Ll/᩺֡᩷;->ۙ:I

    :cond_7
    return v2

    :cond_8
    :goto_1
    return v1
.end method

.method private ۙ(Ll/ܳᩳ᩷;Ll/᩺֡᩷;)Z
    .locals 5

    .line 13625
    iget-boolean v0, p1, Ll/ܳᩳ᩷;->ᩴ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_f

    .line 963
    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const/high16 v3, -0x80000000

    if-ltz v0, :cond_e

    .line 967
    invoke-virtual {p1}, Ll/ܳᩳ᩷;->ۙ()I

    move-result p1

    if-lt v0, p1, :cond_1

    goto/16 :goto_2

    .line 978
    :cond_1
    iget p1, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    iput p1, p2, Ll/᩺֡᩷;->᩸:I

    .line 979
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 2531
    iget v4, v0, Ll/ܿ֡᩷;->ܿ:I

    if-ltz v4, :cond_3

    .line 982
    iget-boolean p1, v0, Ll/ܿ֡᩷;->ܰ:Z

    iput-boolean p1, p2, Ll/᩺֡᩷;->᩷:Z

    if-eqz p1, :cond_2

    .line 984
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->᩷()I

    move-result p1

    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    iget v0, v0, Ll/ܿ֡᩷;->᩶:I

    sub-int/2addr p1, v0

    iput p1, p2, Ll/᩺֡᩷;->ۙ:I

    return v2

    .line 987
    :cond_2
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->ܳ()I

    move-result p1

    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    iget v0, v0, Ll/ܿ֡᩷;->᩶:I

    add-int/2addr p1, v0

    iput p1, p2, Ll/᩺֡᩷;->ۙ:I

    return v2

    .line 993
    :cond_3
    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    if-ne v0, v3, :cond_c

    .line 994
    invoke-virtual {p0, p1}, Ll/֡֡᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 996
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v0

    .line 997
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3}, Ll/ۡ֡᩷;->۫()I

    move-result v3

    if-le v0, v3, :cond_4

    .line 999
    invoke-virtual {p2}, Ll/᩺֡᩷;->ۙ()V

    return v2

    .line 1002
    :cond_4
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v0

    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1003
    invoke-virtual {v3}, Ll/ۡ֡᩷;->ܳ()I

    move-result v3

    sub-int/2addr v0, v3

    if-gez v0, :cond_5

    .line 1005
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->ܳ()I

    move-result p1

    iput p1, p2, Ll/᩺֡᩷;->ۙ:I

    .line 1006
    iput-boolean v1, p2, Ll/᩺֡᩷;->᩷:Z

    return v2

    .line 1009
    :cond_5
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->᩷()I

    move-result v0

    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1010
    invoke-virtual {v1, p1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    if-gez v0, :cond_6

    .line 1012
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->᩷()I

    move-result p1

    iput p1, p2, Ll/᩺֡᩷;->ۙ:I

    .line 1013
    iput-boolean v2, p2, Ll/᩺֡᩷;->᩷:Z

    return v2

    .line 1016
    :cond_6
    iget-boolean v0, p2, Ll/᩺֡᩷;->᩷:Z

    if-eqz v0, :cond_7

    .line 1017
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1018
    invoke-virtual {v0}, Ll/ۡ֡᩷;->ۚ()I

    move-result v0

    add-int/2addr v0, p1

    goto :goto_0

    .line 1019
    :cond_7
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v0

    :goto_0
    iput v0, p2, Ll/᩺֡᩷;->ۙ:I

    return v2

    .line 1021
    :cond_8
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p1

    if-lez p1, :cond_b

    .line 1023
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p1

    .line 1024
    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    if-ge v0, p1, :cond_9

    const/4 p1, 0x1

    goto :goto_1

    :cond_9
    const/4 p1, 0x0

    :goto_1
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-ne p1, v0, :cond_a

    const/4 v1, 0x1

    :cond_a
    iput-boolean v1, p2, Ll/᩺֡᩷;->᩷:Z

    .line 1027
    :cond_b
    invoke-virtual {p2}, Ll/᩺֡᩷;->ۙ()V

    return v2

    .line 1032
    :cond_c
    iget-boolean p1, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    iput-boolean p1, p2, Ll/᩺֡᩷;->᩷:Z

    if-eqz p1, :cond_d

    .line 1035
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->᩷()I

    move-result p1

    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    sub-int/2addr p1, v0

    iput p1, p2, Ll/᩺֡᩷;->ۙ:I

    return v2

    .line 1038
    :cond_d
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->ܳ()I

    move-result p1

    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    add-int/2addr p1, v0

    iput p1, p2, Ll/᩺֡᩷;->ۙ:I

    return v2

    .line 968
    :cond_e
    :goto_2
    iput v2, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    .line 969
    iput v3, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    :cond_f
    :goto_3
    return v1
.end method

.method private ۤ(Ll/ܳᩳ᩷;)I
    .locals 6

    .line 1280
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1283
    :cond_0
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 1284
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    .line 1285
    invoke-virtual {p0, v0, v2}, Ll/֡֡᩷;->findFirstVisibleChildClosestToStart(ZZ)Landroid/view/View;

    move-result-object v3

    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    xor-int/2addr v0, v2

    .line 1286
    invoke-virtual {p0, v0, v2}, Ll/֡֡᩷;->findFirstVisibleChildClosestToEnd(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v5, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    move-object v0, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, p0

    .line 1284
    invoke-static/range {v0 .. v5}, Ll/ܶᩳ᩷;->᩷(Ll/ܳᩳ᩷;Ll/ۡ֡᩷;Landroid/view/View;Landroid/view/View;Ll/᩶۟᩷;Z)I

    move-result p1

    return p1
.end method

.method private ۤ()Landroid/view/View;
    .locals 1

    .line 2003
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ll/֡֡᩷;->ۙ()Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 2004
    :cond_0
    invoke-direct {p0}, Ll/֡֡᩷;->᩷()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private ۤ(Ll/ۖ۟᩷;II)V
    .locals 4

    if-gez p2, :cond_0

    goto :goto_4

    :cond_0
    sub-int/2addr p2, p3

    .line 1557
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p3

    .line 1558
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_3

    add-int/lit8 p3, p3, -0x1

    move v0, p3

    :goto_0
    if-ltz v0, :cond_6

    .line 1560
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1561
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2, v1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_2

    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1562
    invoke-virtual {v2, v1}, Ll/ۡ֡᩷;->ᩴ(Landroid/view/View;)I

    move-result v1

    if-le v1, p2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 1564
    :cond_2
    :goto_1
    invoke-direct {p0, p1, p3, v0}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;II)V

    return-void

    :cond_3
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_2
    if-ge v1, p3, :cond_6

    .line 1570
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1571
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3, v2}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v3

    if-gt v3, p2, :cond_5

    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1572
    invoke-virtual {v3, v2}, Ll/ۡ֡᩷;->ᩴ(Landroid/view/View;)I

    move-result v2

    if-le v2, p2, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1574
    :cond_5
    :goto_3
    invoke-direct {p0, p1, v0, v1}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;II)V

    :cond_6
    :goto_4
    return-void
.end method

.method private ܳ()V
    .locals 2

    .line 440
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 443
    :cond_0
    iget-boolean v0, p0, Ll/֡֡᩷;->mReverseLayout:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    return-void

    .line 441
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/֡֡᩷;->mReverseLayout:Z

    iput-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    return-void
.end method

.method private ᩴ()V
    .locals 3

    const/4 v0, 0x0

    .line 2209
    :goto_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2210
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2211
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2212
    invoke-virtual {v2, v1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;Z)I
    .locals 1

    .line 1074
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->ܳ()I

    move-result v0

    sub-int v0, p1, v0

    if-lez v0, :cond_1

    .line 1078
    invoke-virtual {p0, v0, p2, p3}, Ll/֡֡᩷;->scrollBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p2

    neg-int p2, p2

    add-int/2addr p1, p2

    if-eqz p4, :cond_0

    .line 1085
    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p3}, Ll/ۡ֡᩷;->ܳ()I

    move-result p3

    sub-int/2addr p1, p3

    if-lez p1, :cond_0

    .line 1087
    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    neg-int p4, p1

    invoke-virtual {p3, p4}, Ll/ۡ֡᩷;->ۙ(I)V

    sub-int/2addr p2, p1

    :cond_0
    return p2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ᩷(Ll/ܳᩳ᩷;)I
    .locals 7

    .line 1258
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1261
    :cond_0
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 1262
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    .line 1263
    invoke-virtual {p0, v0, v2}, Ll/֡֡᩷;->findFirstVisibleChildClosestToStart(ZZ)Landroid/view/View;

    move-result-object v3

    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    xor-int/2addr v0, v2

    .line 1264
    invoke-virtual {p0, v0, v2}, Ll/֡֡᩷;->findFirstVisibleChildClosestToEnd(ZZ)Landroid/view/View;

    move-result-object v4

    iget-boolean v5, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    iget-boolean v6, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    move-object v0, p1

    move-object v2, v3

    move-object v3, v4

    move-object v4, p0

    .line 1262
    invoke-static/range {v0 .. v6}, Ll/ܶᩳ᩷;->ۙ(Ll/ܳᩳ᩷;Ll/ۡ֡᩷;Landroid/view/View;Landroid/view/View;Ll/᩶۟᩷;ZZ)I

    move-result p1

    return p1
.end method

.method private ᩷()Landroid/view/View;
    .locals 2

    .line 2019
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ll/֡֡᩷;->findOnePartiallyOrCompletelyInvisibleChild(II)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private ᩷(II)V
    .locals 2

    .line 1113
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->ܳ()I

    move-result v1

    sub-int v1, p2, v1

    iput v1, v0, Ll/ܰ֡᩷;->ۙ:I

    .line 1114
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput p1, v0, Ll/ܰ֡᩷;->᩷:I

    .line 1115
    iget-boolean p1, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    const/4 v1, -0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    .line 1116
    :goto_0
    iput p1, v0, Ll/ܰ֡᩷;->ᩴ:I

    .line 1117
    iput v1, v0, Ll/ܰ֡᩷;->۫:I

    .line 1118
    iput p2, v0, Ll/ܰ֡᩷;->֫:I

    const/high16 p1, -0x80000000

    .line 1119
    iput p1, v0, Ll/ܰ֡᩷;->ܺ:I

    return-void
.end method

.method private ᩷(Ll/ۖ۟᩷;II)V
    .locals 4

    .line 1597
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-gez p2, :cond_0

    goto :goto_4

    .line 1605
    :cond_0
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->ۙ()I

    move-result v1

    sub-int/2addr v1, p2

    add-int/2addr v1, p3

    .line 1606
    iget-boolean p2, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    const/4 p3, 0x0

    :goto_0
    if-ge p3, v0, :cond_6

    .line 1608
    invoke-virtual {p0, p3}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1609
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3, v2}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v3

    if-lt v3, v1, :cond_2

    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1610
    invoke-virtual {v3, v2}, Ll/ۡ֡᩷;->ܳ(Landroid/view/View;)I

    move-result v2

    if-ge v2, v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 1612
    :cond_2
    :goto_1
    invoke-direct {p0, p1, p2, p3}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;II)V

    return-void

    :cond_3
    add-int/lit8 v0, v0, -0x1

    move p2, v0

    :goto_2
    if-ltz p2, :cond_6

    .line 1618
    invoke-virtual {p0, p2}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    .line 1619
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2, p3}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v2

    if-lt v2, v1, :cond_5

    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1620
    invoke-virtual {v2, p3}, Ll/ۡ֡᩷;->ܳ(Landroid/view/View;)I

    move-result p3

    if-ge p3, v1, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 p2, p2, -0x1

    goto :goto_2

    .line 1622
    :cond_5
    :goto_3
    invoke-direct {p0, p1, v0, p2}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;II)V

    :cond_6
    :goto_4
    return-void
.end method

.method private ᩷(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;)V
    .locals 1

    .line 890
    invoke-direct {p0, p2, p3}, Ll/֡֡᩷;->ۙ(Ll/ܳᩳ᩷;Ll/᩺֡᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 897
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    return-void

    .line 906
    :cond_1
    invoke-virtual {p3}, Ll/᩺֡᩷;->ۙ()V

    .line 907
    iget-boolean p1, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput p1, p3, Ll/᩺֡᩷;->᩸:I

    return-void
.end method

.method private ᩷(Ll/᩺֡᩷;)V
    .locals 1

    .line 1109
    iget v0, p1, Ll/᩺֡᩷;->᩸:I

    iget p1, p1, Ll/᩺֡᩷;->ۙ:I

    invoke-direct {p0, v0, p1}, Ll/֡֡᩷;->᩷(II)V

    return-void
.end method

.method private ᩸()Landroid/view/View;
    .locals 1

    .line 2010
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ll/֡֡᩷;->᩷()Landroid/view/View;

    move-result-object v0

    return-object v0

    .line 2011
    :cond_0
    invoke-direct {p0}, Ll/֡֡᩷;->ۙ()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 1504
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-nez v0, :cond_0

    .line 1505
    invoke-super {p0, p1}, Ll/᩶۟᩷;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public calculateExtraLayoutSpace(Ll/ܳᩳ᩷;[I)V
    .locals 3

    .line 567
    invoke-virtual {p0, p1}, Ll/֡֡᩷;->getExtraLayoutSpace(Ll/ܳᩳ᩷;)I

    move-result p1

    .line 568
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v0, v0, Ll/ܰ֡᩷;->۫:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v0, p1

    const/4 p1, 0x0

    .line 574
    :goto_0
    aput p1, p2, v2

    const/4 p1, 0x1

    .line 575
    aput v0, p2, p1

    return-void
.end method

.method public canScrollHorizontally()Z
    .locals 1

    .line 368
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public canScrollVertically()Z
    .locals 2

    .line 376
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public collectAdjacentPrefetchPositions(IILl/ܳᩳ᩷;Ll/ۘ۟᩷;)V
    .locals 1

    .line 1462
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    .line 1463
    :goto_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p2

    if-eqz p2, :cond_3

    if-nez p1, :cond_1

    goto :goto_2

    .line 1468
    :cond_1
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    const/4 p2, 0x1

    if-lez p1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    .line 1470
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    .line 1471
    invoke-direct {p0, v0, p1, p2, p3}, Ll/֡֡᩷;->ۙ(IIZLl/ܳᩳ᩷;)V

    .line 1472
    iget-object p1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    invoke-virtual {p0, p3, p1, p4}, Ll/֡֡᩷;->collectPrefetchPositionsForLayoutState(Ll/ܳᩳ᩷;Ll/ܰ֡᩷;Ll/ۘ۟᩷;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public collectInitialPrefetchPositions(ILl/ۘ۟᩷;)V
    .locals 5

    .line 1383
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 2531
    iget v3, v0, Ll/ܿ֡᩷;->ܿ:I

    if-ltz v3, :cond_0

    .line 1385
    iget-boolean v0, v0, Ll/ܿ֡᩷;->ܰ:Z

    goto :goto_0

    .line 1388
    :cond_0
    invoke-direct {p0}, Ll/֡֡᩷;->ܳ()V

    .line 1389
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    .line 1390
    iget v3, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    if-ne v3, v1, :cond_2

    if-eqz v0, :cond_1

    add-int/lit8 v3, p1, -0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    :goto_1
    const/4 v0, 0x0

    .line 1401
    :goto_2
    iget v4, p0, Ll/֡֡᩷;->mInitialPrefetchItemCount:I

    if-ge v0, v4, :cond_4

    if-ltz v3, :cond_4

    if-ge v3, p1, :cond_4

    .line 1403
    move-object v4, p2

    check-cast v4, Ll/ۜܿ᩷;

    invoke-virtual {v4, v3, v2}, Ll/ۜܿ᩷;->ۙ(II)V

    add-int/2addr v3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public collectPrefetchPositionsForLayoutState(Ll/ܳᩳ᩷;Ll/ܰ֡᩷;Ll/ۘ۟᩷;)V
    .locals 1

    .line 1371
    iget v0, p2, Ll/ܰ֡᩷;->᩷:I

    if-ltz v0, :cond_0

    .line 1372
    invoke-virtual {p1}, Ll/ܳᩳ᩷;->ۙ()I

    move-result p1

    if-ge v0, p1, :cond_0

    const/4 p1, 0x0

    .line 1373
    iget p2, p2, Ll/ܰ֡᩷;->ܺ:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    check-cast p3, Ll/ۜܿ᩷;

    invoke-virtual {p3, v0, p1}, Ll/ۜܿ᩷;->ۙ(II)V

    :cond_0
    return-void
.end method

.method public computeHorizontalScrollExtent(Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1236
    invoke-direct {p0, p1}, Ll/֡֡᩷;->ۙ(Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public computeHorizontalScrollOffset(Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1224
    invoke-direct {p0, p1}, Ll/֡֡᩷;->᩷(Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public computeHorizontalScrollRange(Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1248
    invoke-direct {p0, p1}, Ll/֡֡᩷;->ۤ(Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3

    .line 591
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 594
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x1

    if-ge p1, v1, :cond_1

    const/4 v0, 0x1

    .line 595
    :cond_1
    iget-boolean p1, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eq v0, p1, :cond_2

    const/4 v2, -0x1

    .line 596
    :cond_2
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v0, 0x0

    if-nez p1, :cond_3

    .line 597
    new-instance p1, Landroid/graphics/PointF;

    int-to-float v1, v2

    invoke-direct {p1, v1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1

    .line 599
    :cond_3
    new-instance p1, Landroid/graphics/PointF;

    int-to-float v1, v2

    invoke-direct {p1, v0, v1}, Landroid/graphics/PointF;-><init>(FF)V

    return-object p1
.end method

.method public computeVerticalScrollExtent(Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1242
    invoke-direct {p0, p1}, Ll/֡֡᩷;->ۙ(Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public computeVerticalScrollOffset(Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1230
    invoke-direct {p0, p1}, Ll/֡֡᩷;->᩷(Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public computeVerticalScrollRange(Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1254
    invoke-direct {p0, p1}, Ll/֡֡᩷;->ۤ(Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public convertFocusDirectionToLayoutDirection(I)I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_b

    const/4 v2, 0x2

    if-eq p1, v2, :cond_8

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_6

    const/16 v2, 0x21

    if-eq p1, v2, :cond_4

    const/16 v0, 0x42

    if-eq p1, v0, :cond_2

    const/16 v0, 0x82

    if-eq p1, v0, :cond_0

    return v3

    .line 1832
    :cond_0
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne p1, v1, :cond_1

    return v1

    :cond_1
    return v3

    .line 1838
    :cond_2
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez p1, :cond_3

    return v1

    :cond_3
    return v3

    .line 1829
    :cond_4
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne p1, v1, :cond_5

    return v0

    :cond_5
    return v3

    .line 1835
    :cond_6
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez p1, :cond_7

    return v0

    :cond_7
    return v3

    .line 1821
    :cond_8
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne p1, v1, :cond_9

    return v1

    .line 1823
    :cond_9
    invoke-virtual {p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result p1

    if-eqz p1, :cond_a

    return v0

    :cond_a
    return v1

    .line 1813
    :cond_b
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne p1, v1, :cond_c

    return v0

    .line 1815
    :cond_c
    invoke-virtual {p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result p1

    if-eqz p1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public createLayoutState()Ll/ܰ֡᩷;
    .locals 2

    .line 1139
    new-instance v0, Ll/ܰ֡᩷;

    .line 2312
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 2331
    iput-boolean v1, v0, Ll/ܰ֡᩷;->ۧ:Z

    const/4 v1, 0x0

    .line 2372
    iput v1, v0, Ll/ܰ֡᩷;->ۤ:I

    .line 2379
    iput v1, v0, Ll/ܰ֡᩷;->ۚ:I

    const/4 v1, 0x0

    .line 2398
    iput-object v1, v0, Ll/ܰ֡᩷;->᩻:Ljava/util/List;

    return-object v0
.end method

.method public ensureLayoutState()V
    .locals 1

    .line 1128
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    if-nez v0, :cond_0

    .line 1129
    invoke-virtual {p0}, Ll/֡֡᩷;->createLayoutState()Ll/ܰ֡᩷;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    :cond_0
    return-void
.end method

.method public fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I
    .locals 7

    .line 1667
    iget v0, p2, Ll/ܰ֡᩷;->ۙ:I

    .line 1668
    iget v1, p2, Ll/ܰ֡᩷;->ܺ:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    if-gez v0, :cond_0

    add-int/2addr v1, v0

    .line 1671
    iput v1, p2, Ll/ܰ֡᩷;->ܺ:I

    .line 1673
    :cond_0
    invoke-direct {p0, p1, p2}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;Ll/ܰ֡᩷;)V

    .line 1675
    :cond_1
    iget v1, p2, Ll/ܰ֡᩷;->ۙ:I

    iget v3, p2, Ll/ܰ֡᩷;->ۤ:I

    add-int/2addr v1, v3

    .line 1676
    iget-object v3, p0, Ll/֡֡᩷;->mLayoutChunkResult:Ll/ۘ֡᩷;

    .line 1677
    :cond_2
    iget-boolean v4, p2, Ll/ܰ֡᩷;->᩸:Z

    if-nez v4, :cond_3

    if-lez v1, :cond_9

    .line 2409
    :cond_3
    iget v4, p2, Ll/ܰ֡᩷;->᩷:I

    if-ltz v4, :cond_9

    invoke-virtual {p3}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v5

    if-ge v4, v5, :cond_9

    const/4 v4, 0x0

    .line 2677
    iput v4, v3, Ll/ۘ֡᩷;->ۙ:I

    .line 2678
    iput-boolean v4, v3, Ll/ۘ֡᩷;->᩷:Z

    .line 2679
    iput-boolean v4, v3, Ll/ۘ֡᩷;->᩸:Z

    .line 2680
    iput-boolean v4, v3, Ll/ۘ֡᩷;->ۤ:Z

    .line 1682
    invoke-virtual {p0, p1, p3, p2, v3}, Ll/֡֡᩷;->layoutChunk(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ܰ֡᩷;Ll/ۘ֡᩷;)V

    .line 1686
    iget-boolean v4, v3, Ll/ۘ֡᩷;->᩷:Z

    if-eqz v4, :cond_4

    goto :goto_0

    .line 1689
    :cond_4
    iget v4, p2, Ll/ܰ֡᩷;->֫:I

    iget v5, v3, Ll/ۘ֡᩷;->ۙ:I

    iget v6, p2, Ll/ܰ֡᩷;->۫:I

    mul-int v6, v6, v5

    add-int/2addr v6, v4

    iput v6, p2, Ll/ܰ֡᩷;->֫:I

    .line 1696
    iget-boolean v4, v3, Ll/ۘ֡᩷;->᩸:Z

    if-eqz v4, :cond_5

    iget-object v4, p2, Ll/ܰ֡᩷;->᩻:Ljava/util/List;

    if-nez v4, :cond_5

    .line 13625
    iget-boolean v4, p3, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v4, :cond_6

    .line 1698
    :cond_5
    iget v4, p2, Ll/ܰ֡᩷;->ۙ:I

    sub-int/2addr v4, v5

    iput v4, p2, Ll/ܰ֡᩷;->ۙ:I

    sub-int/2addr v1, v5

    .line 1703
    :cond_6
    iget v4, p2, Ll/ܰ֡᩷;->ܺ:I

    if-eq v4, v2, :cond_8

    add-int/2addr v4, v5

    .line 1704
    iput v4, p2, Ll/ܰ֡᩷;->ܺ:I

    .line 1705
    iget v5, p2, Ll/ܰ֡᩷;->ۙ:I

    if-gez v5, :cond_7

    add-int/2addr v4, v5

    .line 1706
    iput v4, p2, Ll/ܰ֡᩷;->ܺ:I

    .line 1708
    :cond_7
    invoke-direct {p0, p1, p2}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;Ll/ܰ֡᩷;)V

    :cond_8
    if-eqz p4, :cond_2

    .line 1710
    iget-boolean v4, v3, Ll/ۘ֡᩷;->ۤ:Z

    if-eqz v4, :cond_2

    .line 1717
    :cond_9
    :goto_0
    iget p1, p2, Ll/ܰ֡᩷;->ۙ:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public findFirstCompletelyVisibleItemPosition()I
    .locals 3

    .line 2058
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 2059
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public findFirstVisibleChildClosestToEnd(ZZ)Landroid/view/View;
    .locals 2

    .line 1896
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 1897
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 1900
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public findFirstVisibleChildClosestToStart(ZZ)Landroid/view/View;
    .locals 2

    .line 1878
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v0, :cond_0

    .line 1879
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 1882
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1, p2}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public findFirstVisibleItemPosition()I
    .locals 3

    .line 2041
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2, v1}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 2042
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public findLastCompletelyVisibleItemPosition()I
    .locals 4

    .line 2098
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-virtual {p0, v0, v3, v1, v2}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return v3

    .line 2099
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public findLastVisibleItemPosition()I
    .locals 4

    .line 2081
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-virtual {p0, v0, v3, v2, v1}, Ll/֡֡᩷;->findOneVisibleChild(IIZZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return v3

    .line 2082
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public findOnePartiallyOrCompletelyInvisibleChild(II)Landroid/view/View;
    .locals 3

    .line 2130
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    if-le p2, p1, :cond_0

    goto :goto_0

    :cond_0
    if-ge p2, p1, :cond_3

    .line 2137
    :goto_0
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2138
    invoke-virtual {v1}, Ll/ۡ֡᩷;->ܳ()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/16 v0, 0x4104

    const/16 v1, 0x4004

    goto :goto_1

    :cond_1
    const/16 v0, 0x1041

    const/16 v1, 0x1001

    .line 2149
    :goto_1
    iget v2, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v2, :cond_2

    .line 2150
    iget-object v2, p0, Ll/᩶۟᩷;->mHorizontalBoundCheck:Ll/ۖᩳ᩷;

    invoke-virtual {v2, p1, p2, v0, v1}, Ll/ۖᩳ᩷;->ۙ(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 2152
    :cond_2
    iget-object v2, p0, Ll/᩶۟᩷;->mVerticalBoundCheck:Ll/ۖᩳ᩷;

    invoke-virtual {v2, p1, p2, v0, v1}, Ll/ۖᩳ᩷;->ۙ(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 2133
    :cond_3
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public findOneVisibleChild(IIZZ)Landroid/view/View;
    .locals 1

    .line 2108
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    const/16 v0, 0x140

    if-eqz p3, :cond_0

    const/16 p3, 0x6003

    goto :goto_0

    :cond_0
    const/16 p3, 0x140

    :goto_0
    if-eqz p4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 2122
    :goto_1
    iget p4, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez p4, :cond_2

    .line 2123
    iget-object p4, p0, Ll/᩶۟᩷;->mHorizontalBoundCheck:Ll/ۖᩳ᩷;

    invoke-virtual {p4, p1, p2, p3, v0}, Ll/ۖᩳ᩷;->ۙ(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 2125
    :cond_2
    iget-object p4, p0, Ll/᩶۟᩷;->mVerticalBoundCheck:Ll/ۖᩳ᩷;

    invoke-virtual {p4, p1, p2, p3, v0}, Ll/ۖᩳ᩷;->ۙ(IIII)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public findReferenceChild(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;ZZ)Landroid/view/View;
    .locals 10

    .line 1928
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 1932
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p1

    if-eqz p4, :cond_0

    .line 1935
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    const/4 p4, -0x1

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    const/4 v0, 0x1

    move p4, p1

    const/4 p1, 0x0

    .line 1940
    :goto_0
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result p2

    .line 1942
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->ܳ()I

    move-result v1

    .line 1943
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2}, Ll/ۡ֡᩷;->᩷()I

    move-result v2

    const/4 v3, 0x0

    move-object v4, v3

    move-object v5, v4

    :goto_1
    if-eq p1, p4, :cond_a

    .line 1950
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1951
    invoke-virtual {p0, v6}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v7

    .line 1952
    iget-object v8, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v8, v6}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v8

    .line 1953
    iget-object v9, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v9, v6}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v9

    if-ltz v7, :cond_9

    if-ge v7, p2, :cond_9

    .line 1955
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Ll/ܿ۟᩷;

    .line 12758
    iget-object v7, v7, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v7}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v7

    if-eqz v7, :cond_1

    if-nez v5, :cond_9

    move-object v5, v6

    goto :goto_7

    :cond_1
    if-gt v9, v1, :cond_2

    if-ge v8, v1, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    if-lt v8, v2, :cond_3

    if-le v9, v2, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    :goto_3
    if-nez v7, :cond_5

    if-eqz v8, :cond_4

    goto :goto_4

    :cond_4
    return-object v6

    :cond_5
    :goto_4
    if-eqz p3, :cond_7

    if-eqz v8, :cond_6

    goto :goto_5

    :cond_6
    if-nez v3, :cond_9

    goto :goto_6

    :cond_7
    if-eqz v7, :cond_8

    :goto_5
    move-object v4, v6

    goto :goto_7

    :cond_8
    if-nez v3, :cond_9

    :goto_6
    move-object v3, v6

    :cond_9
    :goto_7
    add-int/2addr p1, v0

    goto :goto_1

    :cond_a
    if-eqz v3, :cond_b

    return-object v3

    :cond_b
    if-eqz v4, :cond_c

    return-object v4

    :cond_c
    return-object v5
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 2

    .line 486
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const/4 v1, 0x0

    .line 490
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v1

    sub-int v1, p1, v1

    if-ltz v1, :cond_1

    if-ge v1, v0, :cond_1

    .line 493
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 494
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v1

    if-ne v1, p1, :cond_1

    return-object v0

    .line 499
    :cond_1
    invoke-super {p0, p1}, Ll/᩶۟᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public generateDefaultLayoutParams()Ll/ܿ۟᩷;
    .locals 2

    .line 216
    new-instance v0, Ll/ܿ۟᩷;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Ll/ܿ۟᩷;-><init>(II)V

    return-object v0
.end method

.method public getExtraLayoutSpace(Ll/ܳᩳ᩷;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 13713
    iget p1, p1, Ll/ܳᩳ᩷;->ܽ:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 527
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->۫()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getInitialPrefetchItemCount()I
    .locals 1

    .line 1455
    iget v0, p0, Ll/֡֡᩷;->mInitialPrefetchItemCount:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    .line 408
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    return v0
.end method

.method public getRecycleChildrenOnDetach()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Ll/֡֡᩷;->mRecycleChildrenOnDetach:Z

    return v0
.end method

.method public getReverseLayout()Z
    .locals 1

    .line 454
    iget-boolean v0, p0, Ll/֡֡᩷;->mReverseLayout:Z

    return v0
.end method

.method public getStackFromEnd()Z
    .locals 1

    .line 397
    iget-boolean v0, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    return v0
.end method

.method public isAutoMeasureEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isLayoutRTL()Z
    .locals 2

    .line 1124
    invoke-virtual {p0}, Ll/᩶۟᩷;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isLayoutReversed()Z
    .locals 1

    .line 381
    iget-boolean v0, p0, Ll/֡֡᩷;->mReverseLayout:Z

    return v0
.end method

.method public isSmoothScrollbarEnabled()Z
    .locals 1

    .line 1317
    iget-boolean v0, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    return v0
.end method

.method public layoutChunk(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ܰ֡᩷;Ll/ۘ֡᩷;)V
    .locals 7

    .line 1722
    invoke-virtual {p3, p1}, Ll/ܰ֡᩷;->ۙ(Ll/ۖ۟᩷;)Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x1

    if-nez p1, :cond_0

    .line 1729
    iput-boolean p2, p4, Ll/ۘ֡᩷;->᩷:Z

    return-void

    .line 1732
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ll/ܿ۟᩷;

    .line 1733
    iget-object v0, p3, Ll/ܰ֡᩷;->᩻:Ljava/util/List;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-nez v0, :cond_3

    .line 1734
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    iget v3, p3, Ll/ܰ֡᩷;->۫:I

    if-ne v3, v1, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-ne v0, v3, :cond_2

    .line 1736
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->addView(Landroid/view/View;)V

    goto :goto_2

    .line 1738
    :cond_2
    invoke-virtual {p0, p1, v2}, Ll/᩶۟᩷;->addView(Landroid/view/View;I)V

    goto :goto_2

    .line 1741
    :cond_3
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    iget v3, p3, Ll/ܰ֡᩷;->۫:I

    if-ne v3, v1, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    const/4 v3, 0x0

    :goto_1
    if-ne v0, v3, :cond_5

    .line 1743
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->addDisappearingView(Landroid/view/View;)V

    goto :goto_2

    .line 1745
    :cond_5
    invoke-virtual {p0, p1, v2}, Ll/᩶۟᩷;->addDisappearingView(Landroid/view/View;I)V

    .line 1748
    :goto_2
    invoke-virtual {p0, p1, v2, v2}, Ll/᩶۟᩷;->measureChildWithMargins(Landroid/view/View;II)V

    .line 1749
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v0

    iput v0, p4, Ll/ۘ֡᩷;->ۙ:I

    .line 1751
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne v0, p2, :cond_8

    .line 1752
    invoke-virtual {p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1753
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v2

    sub-int/2addr v0, v2

    .line 1754
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2, p1}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v2

    sub-int v2, v0, v2

    goto :goto_3

    .line 1756
    :cond_6
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v2

    .line 1757
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v2

    .line 1759
    :goto_3
    iget v3, p3, Ll/ܰ֡᩷;->۫:I

    if-ne v3, v1, :cond_7

    .line 1760
    iget p3, p3, Ll/ܰ֡᩷;->֫:I

    .line 1761
    iget v1, p4, Ll/ۘ֡᩷;->ۙ:I

    sub-int v1, p3, v1

    goto :goto_4

    .line 1763
    :cond_7
    iget v1, p3, Ll/ܰ֡᩷;->֫:I

    .line 1764
    iget p3, p4, Ll/ۘ֡᩷;->ۙ:I

    add-int/2addr p3, v1

    :goto_4
    move v5, p3

    move v4, v0

    move v3, v1

    goto :goto_6

    .line 1767
    :cond_8
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v0

    .line 1768
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2, p1}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v2, v0

    .line 1770
    iget v3, p3, Ll/ܰ֡᩷;->۫:I

    if-ne v3, v1, :cond_9

    .line 1771
    iget p3, p3, Ll/ܰ֡᩷;->֫:I

    .line 1772
    iget v1, p4, Ll/ۘ֡᩷;->ۙ:I

    sub-int v1, p3, v1

    goto :goto_5

    .line 1774
    :cond_9
    iget v1, p3, Ll/ܰ֡᩷;->֫:I

    .line 1775
    iget p3, p4, Ll/ۘ֡᩷;->ۙ:I

    add-int/2addr p3, v1

    :goto_5
    move v4, p3

    move v3, v0

    move v5, v2

    move v2, v1

    :goto_6
    move-object v0, p0

    move-object v1, p1

    .line 1780
    invoke-virtual/range {v0 .. v5}, Ll/᩶۟᩷;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 12758
    iget-object p3, v6, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {p3}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result p3

    if-nez p3, :cond_a

    .line 12769
    iget-object p3, v6, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {p3}, Ll/ۧᩳ᩷;->isUpdated()Z

    move-result p3

    if-eqz p3, :cond_b

    .line 1788
    :cond_a
    iput-boolean p2, p4, Ll/ۘ֡᩷;->᩸:Z

    .line 1790
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p1

    iput-boolean p1, p4, Ll/ۘ֡᩷;->ۤ:Z

    return-void
.end method

.method public onAnchorReady(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;I)V
    .locals 0

    return-void
.end method

.method public onDetachedFromWindow(Ll/᩻ᩳ᩷;Ll/ۖ۟᩷;)V
    .locals 0

    .line 251
    invoke-super {p0, p1, p2}, Ll/᩶۟᩷;->onDetachedFromWindow(Ll/᩻ᩳ᩷;Ll/ۖ۟᩷;)V

    .line 252
    iget-boolean p1, p0, Ll/֡֡᩷;->mRecycleChildrenOnDetach:Z

    if-eqz p1, :cond_0

    .line 253
    invoke-virtual {p0, p2}, Ll/᩶۟᩷;->removeAndRecycleAllViews(Ll/ۖ۟᩷;)V

    .line 6631
    iget-object p1, p2, Ll/ۖ۟᩷;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 6632
    invoke-virtual {p2}, Ll/ۖ۟᩷;->ᩴ()V

    :cond_0
    return-void
.end method

.method public onFocusSearchFailed(Landroid/view/View;ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)Landroid/view/View;
    .locals 3

    .line 2160
    invoke-direct {p0}, Ll/֡֡᩷;->ܳ()V

    .line 2161
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 2165
    :cond_0
    invoke-virtual {p0, p2}, Ll/֡֡᩷;->convertFocusDirectionToLayoutDirection(I)I

    move-result p1

    const/high16 p2, -0x80000000

    if-ne p1, p2, :cond_1

    return-object v0

    .line 2169
    :cond_1
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 2170
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->۫()I

    move-result v1

    int-to-float v1, v1

    const v2, 0x3eaaaaab

    mul-float v1, v1, v2

    float-to-int v1, v1

    const/4 v2, 0x0

    .line 2171
    invoke-direct {p0, p1, v1, v2, p4}, Ll/֡֡᩷;->ۙ(IIZLl/ܳᩳ᩷;)V

    .line 2172
    iget-object v1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput p2, v1, Ll/ܰ֡᩷;->ܺ:I

    .line 2173
    iput-boolean v2, v1, Ll/ܰ֡᩷;->ۧ:Z

    const/4 p2, 0x1

    .line 2174
    invoke-virtual {p0, p3, v1, p4, p2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    const/4 p2, -0x1

    if-ne p1, p2, :cond_2

    .line 2182
    invoke-direct {p0}, Ll/֡֡᩷;->᩸()Landroid/view/View;

    move-result-object p3

    goto :goto_0

    .line 2184
    :cond_2
    invoke-direct {p0}, Ll/֡֡᩷;->ۤ()Landroid/view/View;

    move-result-object p3

    :goto_0
    if-ne p1, p2, :cond_3

    .line 2190
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToStart()Landroid/view/View;

    move-result-object p1

    goto :goto_1

    .line 2192
    :cond_3
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToEnd()Landroid/view/View;

    move-result-object p1

    .line 2194
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p2

    if-eqz p2, :cond_5

    if-nez p3, :cond_4

    return-object v0

    :cond_4
    return-object p1

    :cond_5
    return-object p3
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 261
    invoke-super {p0, p1}, Ll/᩶۟᩷;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 262
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 263
    invoke-virtual {p0}, Ll/֡֡᩷;->findFirstVisibleItemPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 264
    invoke-virtual {p0}, Ll/֡֡᩷;->findLastVisibleItemPosition()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ᩴ۬;)V
    .locals 0

    .line 271
    invoke-super {p0, p1, p2, p3}, Ll/᩶۟᩷;->onInitializeAccessibilityNodeInfo(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ᩴ۬;)V

    .line 273
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/۫۟᩷;->getItemCount()I

    move-result p1

    if-lez p1, :cond_0

    .line 274
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x17

    if-lt p1, p2, :cond_0

    .line 275
    sget-object p1, Ll/۠ۜ;->᩹:Ll/۠ۜ;

    invoke-virtual {p3, p1}, Ll/ᩴ۬;->ۙ(Ll/۠ۜ;)V

    :cond_0
    return-void
.end method

.method public onLayoutChildren(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)V
    .locals 8

    .line 619
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    if-eq v0, v1, :cond_1

    .line 620
    :cond_0
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v0

    if-nez v0, :cond_1

    .line 621
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->removeAndRecycleAllViews(Ll/ۖ۟᩷;)V

    return-void

    .line 625
    :cond_1
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-eqz v0, :cond_2

    .line 2531
    iget v0, v0, Ll/ܿ֡᩷;->ܿ:I

    if-ltz v0, :cond_2

    .line 626
    iput v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    .line 629
    :cond_2
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 630
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    const/4 v2, 0x0

    iput-boolean v2, v0, Ll/ܰ֡᩷;->ۧ:Z

    .line 632
    invoke-direct {p0}, Ll/֡֡᩷;->ܳ()V

    .line 634
    invoke-virtual {p0}, Ll/᩶۟᩷;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    .line 635
    iget-object v3, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    iget-boolean v4, v3, Ll/᩺֡᩷;->ᩴ:Z

    const/4 v5, 0x1

    if-eqz v4, :cond_5

    iget v4, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    if-ne v4, v1, :cond_5

    iget-object v4, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_6

    .line 642
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3, v0}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v3

    iget-object v4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 643
    invoke-virtual {v4}, Ll/ۡ֡᩷;->᩷()I

    move-result v4

    if-ge v3, v4, :cond_4

    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 644
    invoke-virtual {v3, v0}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v3

    iget-object v4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 645
    invoke-virtual {v4}, Ll/ۡ֡᩷;->ܳ()I

    move-result v4

    if-gt v3, v4, :cond_6

    .line 657
    :cond_4
    iget-object v3, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v4

    invoke-virtual {v3, v4, v0}, Ll/᩺֡᩷;->᩷(ILandroid/view/View;)V

    goto :goto_1

    .line 637
    :cond_5
    :goto_0
    invoke-virtual {v3}, Ll/᩺֡᩷;->᩷()V

    .line 638
    iget-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    iget-boolean v3, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    iget-boolean v4, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    xor-int/2addr v3, v4

    iput-boolean v3, v0, Ll/᩺֡᩷;->᩷:Z

    .line 640
    invoke-direct {p0, p1, p2, v0}, Ll/֡֡᩷;->᩷(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;)V

    .line 641
    iget-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    iput-boolean v5, v0, Ll/᩺֡᩷;->ᩴ:Z

    .line 666
    :cond_6
    :goto_1
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v3, v0, Ll/ܰ֡᩷;->ܳ:I

    if-ltz v3, :cond_7

    const/4 v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v3, -0x1

    .line 667
    :goto_2
    iput v3, v0, Ll/ܰ֡᩷;->۫:I

    .line 668
    iget-object v0, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    aput v2, v0, v2

    .line 669
    aput v2, v0, v5

    .line 670
    invoke-virtual {p0, p2, v0}, Ll/֡֡᩷;->calculateExtraLayoutSpace(Ll/ܳᩳ᩷;[I)V

    .line 671
    iget-object v0, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    aget v0, v0, v2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 672
    invoke-virtual {v3}, Ll/ۡ֡᩷;->ܳ()I

    move-result v3

    add-int/2addr v3, v0

    .line 673
    iget-object v0, p0, Ll/֡֡᩷;->mReusableIntPair:[I

    aget v0, v0, v5

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget-object v4, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 674
    invoke-virtual {v4}, Ll/ۡ֡᩷;->ۤ()I

    move-result v4

    add-int/2addr v4, v0

    .line 13625
    iget-boolean v0, p2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-eqz v0, :cond_a

    .line 675
    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    if-eq v0, v1, :cond_a

    iget v6, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    const/high16 v7, -0x80000000

    if-eq v6, v7, :cond_a

    .line 680
    invoke-virtual {p0, v0}, Ll/֡֡᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 684
    iget-boolean v6, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v6, :cond_8

    .line 685
    iget-object v6, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v6}, Ll/ۡ֡᩷;->᩷()I

    move-result v6

    iget-object v7, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 686
    invoke-virtual {v7, v0}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v0

    sub-int/2addr v6, v0

    .line 687
    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    goto :goto_3

    .line 689
    :cond_8
    iget-object v6, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v6, v0}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v0

    iget-object v6, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 690
    invoke-virtual {v6}, Ll/ۡ֡᩷;->ܳ()I

    move-result v6

    sub-int/2addr v0, v6

    .line 691
    iget v6, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    :goto_3
    sub-int/2addr v6, v0

    if-lez v6, :cond_9

    add-int/2addr v3, v6

    goto :goto_4

    :cond_9
    sub-int/2addr v4, v6

    .line 703
    :cond_a
    :goto_4
    iget-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    iget-boolean v6, v0, Ll/᩺֡᩷;->᩷:Z

    if-eqz v6, :cond_b

    .line 704
    iget-boolean v6, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v6, :cond_d

    goto :goto_5

    .line 707
    :cond_b
    iget-boolean v6, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v6, :cond_c

    goto :goto_6

    :cond_c
    :goto_5
    const/4 v1, 0x1

    .line 711
    :cond_d
    :goto_6
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/֡֡᩷;->onAnchorReady(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;I)V

    .line 712
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->detachAndScrapAttachedViews(Ll/ۖ۟᩷;)V

    .line 713
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    invoke-virtual {p0}, Ll/֡֡᩷;->resolveIsInfinite()Z

    move-result v1

    iput-boolean v1, v0, Ll/ܰ֡᩷;->᩸:Z

    .line 714
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 717
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v2, v0, Ll/ܰ֡᩷;->ۚ:I

    .line 718
    iget-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    iget-boolean v1, v0, Ll/᩺֡᩷;->᩷:Z

    if-eqz v1, :cond_f

    .line 720
    invoke-direct {p0, v0}, Ll/֡֡᩷;->᩷(Ll/᩺֡᩷;)V

    .line 721
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v3, v0, Ll/ܰ֡᩷;->ۤ:I

    .line 722
    invoke-virtual {p0, p1, v0, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 723
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v1, v0, Ll/ܰ֡᩷;->֫:I

    .line 724
    iget v3, v0, Ll/ܰ֡᩷;->᩷:I

    .line 725
    iget v0, v0, Ll/ܰ֡᩷;->ۙ:I

    if-lez v0, :cond_e

    add-int/2addr v4, v0

    .line 729
    :cond_e
    iget-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    invoke-direct {p0, v0}, Ll/֡֡᩷;->ۙ(Ll/᩺֡᩷;)V

    .line 730
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v4, v0, Ll/ܰ֡᩷;->ۤ:I

    .line 731
    iget v4, v0, Ll/ܰ֡᩷;->᩷:I

    iget v6, v0, Ll/ܰ֡᩷;->ᩴ:I

    add-int/2addr v4, v6

    iput v4, v0, Ll/ܰ֡᩷;->᩷:I

    .line 732
    invoke-virtual {p0, p1, v0, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 733
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v4, v0, Ll/ܰ֡᩷;->֫:I

    .line 735
    iget v0, v0, Ll/ܰ֡᩷;->ۙ:I

    if-lez v0, :cond_12

    .line 738
    invoke-direct {p0, v3, v1}, Ll/֡֡᩷;->᩷(II)V

    .line 739
    iget-object v1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v0, v1, Ll/ܰ֡᩷;->ۤ:I

    .line 740
    invoke-virtual {p0, p1, v1, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 741
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v1, v0, Ll/ܰ֡᩷;->֫:I

    goto :goto_8

    .line 745
    :cond_f
    invoke-direct {p0, v0}, Ll/֡֡᩷;->ۙ(Ll/᩺֡᩷;)V

    .line 746
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v4, v0, Ll/ܰ֡᩷;->ۤ:I

    .line 747
    invoke-virtual {p0, p1, v0, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 748
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v1, v0, Ll/ܰ֡᩷;->֫:I

    .line 749
    iget v4, v0, Ll/ܰ֡᩷;->᩷:I

    .line 750
    iget v0, v0, Ll/ܰ֡᩷;->ۙ:I

    if-lez v0, :cond_10

    add-int/2addr v3, v0

    .line 754
    :cond_10
    iget-object v0, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    invoke-direct {p0, v0}, Ll/֡֡᩷;->᩷(Ll/᩺֡᩷;)V

    .line 755
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v3, v0, Ll/ܰ֡᩷;->ۤ:I

    .line 756
    iget v3, v0, Ll/ܰ֡᩷;->᩷:I

    iget v6, v0, Ll/ܰ֡᩷;->ᩴ:I

    add-int/2addr v3, v6

    iput v3, v0, Ll/ܰ֡᩷;->᩷:I

    .line 757
    invoke-virtual {p0, p1, v0, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 758
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v3, v0, Ll/ܰ֡᩷;->֫:I

    .line 760
    iget v0, v0, Ll/ܰ֡᩷;->ۙ:I

    if-lez v0, :cond_11

    .line 763
    invoke-direct {p0, v4, v1}, Ll/֡֡᩷;->ۙ(II)V

    .line 764
    iget-object v1, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput v0, v1, Ll/ܰ֡᩷;->ۤ:I

    .line 765
    invoke-virtual {p0, p1, v1, p2, v2}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    .line 766
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v0, v0, Ll/ܰ֡᩷;->֫:I

    move v4, v0

    goto :goto_7

    :cond_11
    move v4, v1

    :goto_7
    move v1, v3

    .line 773
    :cond_12
    :goto_8
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-lez v0, :cond_14

    .line 777
    iget-boolean v0, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    iget-boolean v3, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    xor-int/2addr v0, v3

    if-eqz v0, :cond_13

    .line 778
    invoke-direct {p0, v4, p1, p2, v5}, Ll/֡֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;Z)I

    move-result v0

    add-int/2addr v1, v0

    add-int/2addr v4, v0

    .line 781
    invoke-direct {p0, v1, p1, p2, v2}, Ll/֡֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;Z)I

    move-result v0

    goto :goto_9

    .line 785
    :cond_13
    invoke-direct {p0, v1, p1, p2, v5}, Ll/֡֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;Z)I

    move-result v0

    add-int/2addr v1, v0

    add-int/2addr v4, v0

    .line 788
    invoke-direct {p0, v4, p1, p2, v2}, Ll/֡֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;Z)I

    move-result v0

    :goto_9
    add-int/2addr v1, v0

    add-int/2addr v4, v0

    .line 793
    :cond_14
    invoke-direct {p0, p1, p2, v1, v4}, Ll/֡֡᩷;->ۙ(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;II)V

    .line 13625
    iget-boolean p1, p2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez p1, :cond_15

    .line 795
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1}, Ll/ۡ֡᩷;->֫()V

    goto :goto_a

    .line 797
    :cond_15
    iget-object p1, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    invoke-virtual {p1}, Ll/᩺֡᩷;->᩷()V

    .line 799
    :goto_a
    iget-boolean p1, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    iput-boolean p1, p0, Ll/֡֡᩷;->mLastStackFromEnd:Z

    return-void
.end method

.method public onLayoutCompleted(Ll/ܳᩳ᩷;)V
    .locals 0

    .line 808
    invoke-super {p0, p1}, Ll/᩶۟᩷;->onLayoutCompleted(Ll/ܳᩳ᩷;)V

    const/4 p1, 0x0

    .line 809
    iput-object p1, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    const/4 p1, -0x1

    .line 810
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    const/high16 p1, -0x80000000

    .line 811
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    .line 812
    iget-object p1, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    invoke-virtual {p1}, Ll/᩺֡᩷;->᩷()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 349
    instance-of v0, p1, Ll/ܿ֡᩷;

    if-eqz v0, :cond_1

    .line 350
    check-cast p1, Ll/ܿ֡᩷;

    iput-object p1, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    .line 351
    iget v0, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 2535
    iput v1, p1, Ll/ܿ֡᩷;->ܿ:I

    .line 354
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    :cond_1
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    .line 321
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-eqz v0, :cond_0

    .line 322
    new-instance v1, Ll/ܿ֡᩷;

    .line 2524
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 2525
    iget v2, v0, Ll/ܿ֡᩷;->ܿ:I

    iput v2, v1, Ll/ܿ֡᩷;->ܿ:I

    .line 2526
    iget v2, v0, Ll/ܿ֡᩷;->᩶:I

    iput v2, v1, Ll/ܿ֡᩷;->᩶:I

    .line 2527
    iget-boolean v0, v0, Ll/ܿ֡᩷;->ܰ:Z

    iput-boolean v0, v1, Ll/ܿ֡᩷;->ܰ:Z

    return-object v1

    .line 324
    :cond_0
    new-instance v0, Ll/ܿ֡᩷;

    .line 2513
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 325
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v1

    if-lez v1, :cond_2

    .line 326
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 327
    iget-boolean v1, p0, Ll/֡֡᩷;->mLastStackFromEnd:Z

    iget-boolean v2, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    xor-int/2addr v1, v2

    .line 328
    iput-boolean v1, v0, Ll/ܿ֡᩷;->ܰ:Z

    if-eqz v1, :cond_1

    .line 330
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToEnd()Landroid/view/View;

    move-result-object v1

    .line 331
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2}, Ll/ۡ֡᩷;->᩷()I

    move-result v2

    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 332
    invoke-virtual {v3, v1}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Ll/ܿ֡᩷;->᩶:I

    .line 333
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Ll/ܿ֡᩷;->ܿ:I

    return-object v0

    .line 335
    :cond_1
    invoke-direct {p0}, Ll/֡֡᩷;->getChildClosestToStart()Landroid/view/View;

    move-result-object v1

    .line 336
    invoke-virtual {p0, v1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Ll/ܿ֡᩷;->ܿ:I

    .line 337
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2, v1}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 338
    invoke-virtual {v2}, Ll/ۡ֡᩷;->ܳ()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Ll/ܿ֡᩷;->᩶:I

    return-object v0

    :cond_2
    const/4 v1, -0x1

    .line 2535
    iput v1, v0, Ll/ܿ֡᩷;->ܿ:I

    return-object v0
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 3

    .line 282
    invoke-super {p0, p1, p2}, Ll/᩶۟᩷;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const v0, 0x1020037

    const/4 v2, 0x0

    if-ne p1, v0, :cond_4

    if-eqz p2, :cond_4

    .line 289
    iget p1, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v0, -0x1

    if-ne p1, v1, :cond_2

    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 290
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-gez p1, :cond_1

    return v2

    .line 295
    :cond_1
    iget-object p2, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, p2, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object p2, p2, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-virtual {p0, v0, p2}, Ll/᩶۟᩷;->getRowCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p2

    sub-int/2addr p2, v1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    goto :goto_0

    :cond_2
    const-string p1, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 298
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-gez p1, :cond_3

    return v2

    .line 303
    :cond_3
    iget-object p2, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, p2, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object p2, p2, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    .line 304
    invoke-virtual {p0, v0, p2}, Ll/᩶۟᩷;->getColumnCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p2

    sub-int/2addr p2, v1

    .line 303
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_4

    .line 311
    invoke-virtual {p0, p1, v2}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    return v1

    :cond_4
    return v2
.end method

.method public prepareForDrop(Landroid/view/View;Landroid/view/View;II)V
    .locals 3

    const-string p3, "Cannot drop a view during a scroll or layout calculation"

    .line 2279
    invoke-virtual {p0, p3}, Ll/֡֡᩷;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 2280
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 2281
    invoke-direct {p0}, Ll/֡֡᩷;->ܳ()V

    .line 2282
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p3

    .line 2283
    invoke-virtual {p0, p2}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result p4

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-ge p3, p4, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, -0x1

    .line 2286
    :goto_0
    iget-boolean v2, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eqz v2, :cond_2

    if-ne p3, v1, :cond_1

    .line 2288
    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2289
    invoke-virtual {p3}, Ll/ۡ֡᩷;->᩷()I

    move-result p3

    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2290
    invoke-virtual {v0, p2}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2291
    invoke-virtual {v0, p1}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, p2

    sub-int/2addr p3, p1

    .line 2288
    invoke-virtual {p0, p4, p3}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    return-void

    .line 2293
    :cond_1
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2294
    invoke-virtual {p1}, Ll/ۡ֡᩷;->᩷()I

    move-result p1

    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2295
    invoke-virtual {p3, p2}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    .line 2293
    invoke-virtual {p0, p4, p1}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    return-void

    :cond_2
    if-ne p3, v0, :cond_3

    .line 2299
    iget-object p1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p1, p2}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p0, p4, p1}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    return-void

    .line 2301
    :cond_3
    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2302
    invoke-virtual {p3, p2}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result p2

    iget-object p3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 2303
    invoke-virtual {p3, p1}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result p1

    sub-int/2addr p2, p1

    .line 2301
    invoke-virtual {p0, p4, p2}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    return-void
.end method

.method public resolveIsInfinite()Z
    .locals 1

    .line 1365
    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0}, Ll/ۡ֡᩷;->᩸()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1366
    invoke-virtual {v0}, Ll/ۡ֡᩷;->ۙ()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public scrollBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 5

    .line 1476
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    goto :goto_1

    .line 1479
    :cond_0
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 1480
    iget-object v0, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    const/4 v2, 0x1

    iput-boolean v2, v0, Ll/ܰ֡᩷;->ۧ:Z

    if-lez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    .line 1482
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 1483
    invoke-direct {p0, v0, v3, v2, p3}, Ll/֡֡᩷;->ۙ(IIZLl/ܳᩳ᩷;)V

    .line 1484
    iget-object v2, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iget v4, v2, Ll/ܰ֡᩷;->ܺ:I

    .line 1485
    invoke-virtual {p0, p2, v2, p3, v1}, Ll/֡֡᩷;->fill(Ll/ۖ۟᩷;Ll/ܰ֡᩷;Ll/ܳᩳ᩷;Z)I

    move-result p2

    add-int/2addr v4, p2

    if-gez v4, :cond_2

    return v1

    :cond_2
    if-le v3, v4, :cond_3

    mul-int p1, v0, v4

    .line 1493
    :cond_3
    iget-object p2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    neg-int p3, p1

    invoke-virtual {p2, p3}, Ll/ۡ֡᩷;->ۙ(I)V

    .line 1497
    iget-object p2, p0, Ll/֡֡᩷;->mLayoutState:Ll/ܰ֡᩷;

    iput p1, p2, Ll/ܰ֡᩷;->ܳ:I

    return p1

    :cond_4
    :goto_1
    return v1
.end method

.method public scrollHorizontallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 2

    .line 1202
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1205
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ll/֡֡᩷;->scrollBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public scrollToPosition(I)V
    .locals 1

    .line 1158
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    const/high16 p1, -0x80000000

    .line 1159
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    .line 1160
    iget-object p1, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-eqz p1, :cond_0

    const/4 v0, -0x1

    .line 2535
    iput v0, p1, Ll/ܿ֡᩷;->ܿ:I

    .line 1163
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    return-void
.end method

.method public scrollToPositionWithOffset(II)V
    .locals 0

    .line 1186
    iput p1, p0, Ll/֡֡᩷;->mPendingScrollPosition:I

    .line 1187
    iput p2, p0, Ll/֡֡᩷;->mPendingScrollPositionOffset:I

    .line 1188
    iget-object p1, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-eqz p1, :cond_0

    const/4 p2, -0x1

    .line 2535
    iput p2, p1, Ll/ܿ֡᩷;->ܿ:I

    .line 1191
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    return-void
.end method

.method public scrollVerticallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 1

    .line 1215
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1218
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ll/֡֡᩷;->scrollBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public setInitialPrefetchItemCount(I)V
    .locals 0

    .line 1440
    iput p1, p0, Ll/֡֡᩷;->mInitialPrefetchItemCount:I

    return-void
.end method

.method public setOrientation(I)V
    .locals 2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 419
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid orientation:"

    .line 0
    invoke-static {p1, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 419
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 422
    invoke-virtual {p0, v0}, Ll/֡֡᩷;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 424
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne p1, v0, :cond_3

    iget-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-void

    .line 426
    :cond_3
    :goto_1
    invoke-static {p0, p1}, Ll/ۡ֡᩷;->ۙ(Ll/᩶۟᩷;I)Ll/ۡ֡᩷;

    move-result-object v0

    iput-object v0, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 427
    iget-object v1, p0, Ll/֡֡᩷;->mAnchorInfo:Ll/᩺֡᩷;

    iput-object v0, v1, Ll/᩺֡᩷;->ۤ:Ll/ۡ֡᩷;

    .line 428
    iput p1, p0, Ll/֡֡᩷;->mOrientation:I

    .line 429
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    return-void
.end method

.method public setRecycleChildrenOnDetach(Z)V
    .locals 0

    .line 245
    iput-boolean p1, p0, Ll/֡֡᩷;->mRecycleChildrenOnDetach:Z

    return-void
.end method

.method public setReverseLayout(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 472
    invoke-virtual {p0, v0}, Ll/֡֡᩷;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 473
    iget-boolean v0, p0, Ll/֡֡᩷;->mReverseLayout:Z

    if-ne p1, v0, :cond_0

    return-void

    .line 476
    :cond_0
    iput-boolean p1, p0, Ll/֡֡᩷;->mReverseLayout:Z

    .line 477
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    return-void
.end method

.method public setSmoothScrollbarEnabled(Z)V
    .locals 0

    .line 1307
    iput-boolean p1, p0, Ll/֡֡᩷;->mSmoothScrollbarEnabled:Z

    return-void
.end method

.method public setStackFromEnd(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 388
    invoke-virtual {p0, v0}, Ll/֡֡᩷;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 389
    iget-boolean v0, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 392
    :cond_0
    iput-boolean p1, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    .line 393
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    return-void
.end method

.method public shouldMeasureTwice()Z
    .locals 2

    .line 1795
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeightMode()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    .line 1796
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidthMode()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 1797
    invoke-virtual {p0}, Ll/᩶۟᩷;->hasFlexibleChildInBothOrientations()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public smoothScrollToPosition(Ll/᩻ᩳ᩷;Ll/ܳᩳ᩷;I)V
    .locals 0

    .line 582
    new-instance p2, Ll/۟֡᩷;

    .line 583
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/۟֡᩷;-><init>(Landroid/content/Context;)V

    .line 584
    invoke-virtual {p2, p3}, Ll/ᩴᩳ᩷;->setTargetPosition(I)V

    .line 585
    invoke-virtual {p0, p2}, Ll/᩶۟᩷;->startSmoothScroll(Ll/ᩴᩳ᩷;)V

    return-void
.end method

.method public supportsPredictiveItemAnimations()Z
    .locals 2

    .line 2269
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/֡֡᩷;->mLastStackFromEnd:Z

    iget-boolean v1, p0, Ll/֡֡᩷;->mStackFromEnd:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public validateChildOrder()V
    .locals 9

    .line 2228
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    .line 2229
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x0

    .line 2232
    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v2

    .line 2233
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {p0, v0}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v0

    .line 2234
    iget-boolean v3, p0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    const-string v4, "detected invalid location"

    const-string v5, "detected invalid position. loc invalid? "

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    .line 2235
    :goto_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v6

    if-ge v3, v6, :cond_8

    .line 2236
    invoke-virtual {p0, v3}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 2237
    invoke-virtual {p0, v6}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v7

    .line 2238
    iget-object v8, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v8, v6}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v6

    if-ge v7, v2, :cond_2

    .line 2240
    invoke-direct {p0}, Ll/֡֡᩷;->ᩴ()V

    .line 2241
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-ge v6, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    if-gt v6, v0, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2245
    :cond_3
    invoke-direct {p0}, Ll/֡֡᩷;->ᩴ()V

    .line 2246
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v3, 0x1

    .line 2250
    :goto_2
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v6

    if-ge v3, v6, :cond_8

    .line 2251
    invoke-virtual {p0, v3}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 2252
    invoke-virtual {p0, v6}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v7

    .line 2253
    iget-object v8, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v8, v6}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v6

    if-ge v7, v2, :cond_6

    .line 2255
    invoke-direct {p0}, Ll/֡֡᩷;->ᩴ()V

    .line 2256
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-ge v6, v0, :cond_5

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    if-lt v6, v0, :cond_7

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 2260
    :cond_7
    invoke-direct {p0}, Ll/֡֡᩷;->ᩴ()V

    .line 2261
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_4
    return-void
.end method
