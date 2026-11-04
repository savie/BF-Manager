.class public Ll/ᩴ֡᩷;
.super Ll/֡֡᩷;
.source "B5F4"


# static fields
.field public static final ܺ:Ljava/util/Set;


# instance fields
.field public ֫:[Landroid/view/View;

.field public ۙ:[I

.field public ۚ:I

.field public final ۤ:Landroid/graphics/Rect;

.field public ۧ:I

.field public final ۫:Landroid/util/SparseIntArray;

.field public final ܳ:Landroid/util/SparseIntArray;

.field public ᩴ:I

.field public ᩷:I

.field public ᩸:Z

.field public ᩻:Ll/᩷֡᩷;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 58
    new-instance v0, Ljava/util/HashSet;

    const/16 v1, 0x11

    .line 60
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x42

    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v3, 0x21

    .line 62
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v4, 0x82

    .line 63
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Integer;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v1, 0x1

    aput-object v2, v5, v1

    const/4 v1, 0x2

    aput-object v3, v5, v1

    const/4 v1, 0x3

    aput-object v4, v5, v1

    .line 59
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ll/ᩴ֡᩷;->ܺ:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 146
    invoke-direct {p0, p1}, Ll/֡֡᩷;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 68
    iput-boolean p1, p0, Ll/ᩴ֡᩷;->᩸:Z

    const/4 p1, -0x1

    .line 69
    iput p1, p0, Ll/ᩴ֡᩷;->ۧ:I

    .line 80
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ll/ᩴ֡᩷;->۫:Landroid/util/SparseIntArray;

    .line 81
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ll/ᩴ֡᩷;->ܳ:Landroid/util/SparseIntArray;

    .line 82
    new-instance v0, Ll/᩷֡᩷;

    .line 2043
    invoke-direct {v0}, Ll/᩸֡᩷;-><init>()V

    .line 82
    iput-object v0, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    .line 84
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ᩴ֡᩷;->ۤ:Landroid/graphics/Rect;

    .line 93
    iput p1, p0, Ll/ᩴ֡᩷;->ᩴ:I

    .line 108
    iput p1, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 123
    iput p1, p0, Ll/ᩴ֡᩷;->᩷:I

    .line 147
    invoke-virtual {p0, p2}, Ll/ᩴ֡᩷;->ۙ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 134
    invoke-direct {p0, p1, p2, p3, p4}, Ll/֡֡᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 68
    iput-boolean v0, p0, Ll/ᩴ֡᩷;->᩸:Z

    const/4 v0, -0x1

    .line 69
    iput v0, p0, Ll/ᩴ֡᩷;->ۧ:I

    .line 80
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Ll/ᩴ֡᩷;->۫:Landroid/util/SparseIntArray;

    .line 81
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Ll/ᩴ֡᩷;->ܳ:Landroid/util/SparseIntArray;

    .line 82
    new-instance v1, Ll/᩷֡᩷;

    .line 2043
    invoke-direct {v1}, Ll/᩸֡᩷;-><init>()V

    .line 82
    iput-object v1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    .line 84
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/ᩴ֡᩷;->ۤ:Landroid/graphics/Rect;

    .line 93
    iput v0, p0, Ll/ᩴ֡᩷;->ᩴ:I

    .line 108
    iput v0, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 123
    iput v0, p0, Ll/ᩴ֡᩷;->᩷:I

    .line 135
    invoke-static {p1, p2, p3, p4}, Ll/᩶۟᩷;->ۙ(Landroid/content/Context;Landroid/util/AttributeSet;II)Ll/ܰ۟᩷;

    move-result-object p1

    .line 136
    iget p1, p1, Ll/ܰ۟᩷;->ۤ:I

    invoke-virtual {p0, p1}, Ll/ᩴ֡᩷;->ۙ(I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 159
    invoke-direct {p0, p1, v0, v1}, Ll/֡֡᩷;-><init>(Landroid/content/Context;IZ)V

    .line 68
    iput-boolean v1, p0, Ll/ᩴ֡᩷;->᩸:Z

    const/4 p1, -0x1

    .line 69
    iput p1, p0, Ll/ᩴ֡᩷;->ۧ:I

    .line 80
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ll/ᩴ֡᩷;->۫:Landroid/util/SparseIntArray;

    .line 81
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ll/ᩴ֡᩷;->ܳ:Landroid/util/SparseIntArray;

    .line 82
    new-instance v0, Ll/᩷֡᩷;

    .line 2043
    invoke-direct {v0}, Ll/᩸֡᩷;-><init>()V

    .line 82
    iput-object v0, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    .line 84
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/ᩴ֡᩷;->ۤ:Landroid/graphics/Rect;

    .line 93
    iput p1, p0, Ll/ᩴ֡᩷;->ᩴ:I

    .line 108
    iput p1, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 123
    iput p1, p0, Ll/ᩴ֡᩷;->᩷:I

    .line 160
    invoke-virtual {p0, p2}, Ll/ᩴ֡᩷;->ۙ(I)V

    return-void
.end method

.method private ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 1

    .line 13625
    iget-boolean p3, p3, Ll/ܳᩳ᩷;->ᩴ:Z

    .line 1146
    iget-object v0, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    if-nez p3, :cond_0

    .line 1147
    iget p2, p0, Ll/ᩴ֡᩷;->ۧ:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1620
    :goto_0
    invoke-static {p1, p2}, Ll/᩸֡᩷;->ۙ(II)I

    move-result p1

    return p1

    .line 1149
    :cond_0
    invoke-virtual {p2, p1}, Ll/ۖ۟᩷;->ۙ(I)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    return p1

    .line 1158
    :cond_1
    iget p2, p0, Ll/ᩴ֡᩷;->ۧ:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0
.end method

.method private ۙ(Landroid/view/View;IZ)V
    .locals 8

    .line 1405
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ۤ֡᩷;

    .line 1406
    iget-object v1, v0, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 1407
    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    .line 1409
    iget v3, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    .line 1411
    iget v1, v0, Ll/ۤ֡᩷;->ᩴ:I

    iget v4, v0, Ll/ۤ֡᩷;->ܳ:I

    invoke-virtual {p0, v1, v4}, Ll/ᩴ֡᩷;->ۙ(II)I

    move-result v1

    .line 1414
    iget v4, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ne v4, v6, :cond_0

    .line 1415
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, p2, v3, v4, v5}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result p2

    .line 1417
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->۫()I

    move-result v1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeightMode()I

    move-result v3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, v3, v2, v0, v6}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result v0

    goto :goto_0

    .line 1420
    :cond_0
    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, p2, v2, v4, v5}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result p2

    .line 1422
    iget-object v1, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1}, Ll/ۡ֡᩷;->۫()I

    move-result v1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidthMode()I

    move-result v2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, v2, v3, v0, v6}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result v0

    move v7, v0

    move v0, p2

    move p2, v7

    .line 1446
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܿ۟᩷;

    if-eqz p3, :cond_1

    .line 1449
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/᩶۟᩷;->shouldReMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z

    move-result p3

    goto :goto_1

    .line 1451
    :cond_1
    invoke-virtual {p0, p1, p2, v0, v1}, Ll/᩶۟᩷;->shouldMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z

    move-result p3

    :goto_1
    if-eqz p3, :cond_2

    .line 1454
    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V

    :cond_2
    return-void
.end method

.method private ۤ(I)I
    .locals 2

    .line 757
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, p1, v1, v0}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1

    .line 758
    :cond_0
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, p1, v1, v0}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method private ۤ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 3

    .line 13625
    iget-boolean p3, p3, Ll/ܳᩳ᩷;->ᩴ:Z

    .line 1183
    iget-object v0, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    const/4 v1, 0x1

    if-nez p3, :cond_0

    .line 1184
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1

    .line 1186
    :cond_0
    iget-object p3, p0, Ll/ᩴ֡᩷;->۫:Landroid/util/SparseIntArray;

    const/4 v2, -0x1

    invoke-virtual {p3, p1, v2}, Landroid/util/SparseIntArray;->get(II)I

    move-result p3

    if-eq p3, v2, :cond_1

    return p3

    .line 1190
    :cond_1
    invoke-virtual {p2, p1}, Ll/ۖ۟᩷;->ۙ(I)I

    move-result p1

    if-ne p1, v2, :cond_2

    return v1

    .line 1200
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v1
.end method

.method private ۤ()V
    .locals 2

    .line 959
    invoke-virtual {p0}, Ll/֡֡᩷;->getOrientation()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 960
    invoke-virtual {p0}, Ll/᩶۟᩷;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v1

    goto :goto_0

    .line 962
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v1

    :goto_0
    sub-int/2addr v0, v1

    .line 964
    invoke-direct {p0, v0}, Ll/ᩴ֡᩷;->᩷(I)V

    return-void
.end method

.method private ᩴ(I)Ljava/util/HashSet;
    .locals 1

    .line 771
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v0

    invoke-direct {p0, v0, p1}, Ll/ᩴ֡᩷;->᩷(II)Ljava/util/HashSet;

    move-result-object p1

    return-object p1
.end method

.method private ᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 2

    .line 13625
    iget-boolean p3, p3, Ll/ܳᩳ᩷;->ᩴ:Z

    .line 1162
    iget-object v0, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    if-nez p3, :cond_0

    .line 1163
    iget p2, p0, Ll/ᩴ֡᩷;->ۧ:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2052
    :goto_0
    rem-int/2addr p1, p2

    return p1

    .line 1165
    :cond_0
    iget-object p3, p0, Ll/ᩴ֡᩷;->ܳ:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {p3, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result p3

    if-eq p3, v1, :cond_1

    return p3

    .line 1169
    :cond_1
    invoke-virtual {p2, p1}, Ll/ۖ۟᩷;->ۙ(I)I

    move-result p1

    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    return p1

    .line 1179
    :cond_2
    iget p2, p0, Ll/ᩴ֡᩷;->ۧ:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0
.end method

.method private ᩷(II)Ljava/util/HashSet;
    .locals 3

    .line 788
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 789
    iget-object v1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v2, v1, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v1, v1, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, p2, v2, v1}, Ll/ᩴ֡᩷;->ۤ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p2

    move v1, p1

    :goto_0
    add-int v2, p1, p2

    if-ge v1, v2, :cond_0

    .line 791
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private ᩷()V
    .locals 2

    .line 1047
    iget-object v0, p0, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    if-eqz v0, :cond_1

    array-length v0, v0

    iget v1, p0, Ll/ᩴ֡᩷;->ۧ:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 1048
    :cond_1
    :goto_0
    iget v0, p0, Ll/ᩴ֡᩷;->ۧ:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    return-void
.end method

.method private ᩷(I)V
    .locals 7

    .line 993
    iget-object v0, p0, Ll/ᩴ֡᩷;->ۙ:[I

    iget v1, p0, Ll/ᩴ֡᩷;->ۧ:I

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 1004
    array-length v3, v0

    add-int/lit8 v4, v1, 0x1

    if-ne v3, v4, :cond_0

    array-length v3, v0

    sub-int/2addr v3, v2

    aget v3, v0, v3

    if-eq v3, p1, :cond_1

    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 1006
    new-array v0, v0, [I

    :cond_1
    const/4 v3, 0x0

    .line 1008
    aput v3, v0, v3

    .line 1009
    div-int v4, p1, v1

    .line 1010
    rem-int/2addr p1, v1

    const/4 v5, 0x0

    :goto_0
    if-gt v2, v1, :cond_3

    add-int/2addr v3, p1

    if-lez v3, :cond_2

    sub-int v6, v1, v3

    if-ge v6, p1, :cond_2

    add-int/lit8 v6, v4, 0x1

    sub-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move v6, v4

    :goto_1
    add-int/2addr v5, v6

    .line 1021
    aput v5, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 993
    :cond_3
    iput-object v0, p0, Ll/ᩴ֡᩷;->ۙ:[I

    return-void
.end method

.method private ᩸(I)I
    .locals 2

    .line 746
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, p1, v1, v0}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1

    .line 747
    :cond_0
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, p1, v1, v0}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final checkLayoutParams(Ll/ܿ۟᩷;)Z
    .locals 0

    .line 935
    instance-of p1, p1, Ll/ۤ֡᩷;

    return p1
.end method

.method public final collectPrefetchPositionsForLayoutState(Ll/ܳᩳ᩷;Ll/ܰ֡᩷;Ll/ۘ۟᩷;)V
    .locals 6

    .line 1206
    iget v0, p0, Ll/ᩴ֡᩷;->ۧ:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1208
    :goto_0
    iget v3, p0, Ll/ᩴ֡᩷;->ۧ:I

    if-ge v2, v3, :cond_0

    .line 2409
    iget v3, p2, Ll/ܰ֡᩷;->᩷:I

    if-ltz v3, :cond_0

    invoke-virtual {p1}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v4

    if-ge v3, v4, :cond_0

    if-lez v0, :cond_0

    .line 1209
    iget v3, p2, Ll/ܰ֡᩷;->᩷:I

    .line 1210
    iget v4, p2, Ll/ܰ֡᩷;->ܺ:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    move-object v5, p3

    check-cast v5, Ll/ۜܿ᩷;

    invoke-virtual {v5, v3, v4}, Ll/ۜܿ᩷;->ۙ(II)V

    .line 1211
    iget-object v3, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v0, v0, -0x1

    .line 1213
    iget v3, p2, Ll/ܰ֡᩷;->᩷:I

    iget v4, p2, Ll/ܰ֡᩷;->ᩴ:I

    add-int/2addr v3, v4

    iput v3, p2, Ll/ܰ֡᩷;->᩷:I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final findReferenceChild(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;ZZ)Landroid/view/View;
    .locals 8

    .line 1102
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p3

    const/4 v0, 0x1

    if-eqz p4, :cond_0

    .line 1105
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result p3

    sub-int/2addr p3, v0

    const/4 p4, -0x1

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    move p4, p3

    const/4 p3, 0x0

    .line 1110
    :goto_0
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v1

    .line 1112
    invoke-virtual {p0}, Ll/֡֡᩷;->ensureLayoutState()V

    .line 1116
    iget-object v2, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v2}, Ll/ۡ֡᩷;->ܳ()I

    move-result v2

    .line 1117
    iget-object v3, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3}, Ll/ۡ֡᩷;->᩷()I

    move-result v3

    const/4 v4, 0x0

    move-object v5, v4

    :goto_1
    if-eq p3, p4, :cond_6

    .line 1120
    invoke-virtual {p0, p3}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1121
    invoke-virtual {p0, v6}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v7

    if-ltz v7, :cond_5

    if-ge v7, v1, :cond_5

    .line 1123
    invoke-direct {p0, v7, p1, p2}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_3

    .line 1127
    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Ll/ܿ۟᩷;

    .line 12758
    iget-object v7, v7, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v7}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v7

    if-eqz v7, :cond_2

    if-nez v5, :cond_5

    move-object v5, v6

    goto :goto_3

    .line 1131
    :cond_2
    iget-object v7, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v7, v6}, Ll/ۡ֡᩷;->᩸(Landroid/view/View;)I

    move-result v7

    if-ge v7, v3, :cond_4

    iget-object v7, p0, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    .line 1132
    invoke-virtual {v7, v6}, Ll/ۡ֡᩷;->ۙ(Landroid/view/View;)I

    move-result v7

    if-ge v7, v2, :cond_3

    goto :goto_2

    :cond_3
    return-object v6

    :cond_4
    :goto_2
    if-nez v4, :cond_5

    move-object v4, v6

    :cond_5
    :goto_3
    add-int/2addr p3, v0

    goto :goto_1

    :cond_6
    if-eqz v4, :cond_7

    return-object v4

    :cond_7
    return-object v5
.end method

.method public final generateDefaultLayoutParams()Ll/ܿ۟᩷;
    .locals 3

    .line 910
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    .line 911
    new-instance v0, Ll/ۤ֡᩷;

    invoke-direct {v0, v2, v1}, Ll/ۤ֡᩷;-><init>(II)V

    return-object v0

    .line 914
    :cond_0
    new-instance v0, Ll/ۤ֡᩷;

    invoke-direct {v0, v1, v2}, Ll/ۤ֡᩷;-><init>(II)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/ܿ۟᩷;
    .locals 1

    .line 921
    new-instance v0, Ll/ۤ֡᩷;

    invoke-direct {v0, p1, p2}, Ll/ۤ֡᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ܿ۟᩷;
    .locals 3

    .line 926
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    .line 927
    new-instance v0, Ll/ۤ֡᩷;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2083
    invoke-direct {v0, p1}, Ll/ܿ۟᩷;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 2070
    :goto_0
    iput v2, v0, Ll/ۤ֡᩷;->ᩴ:I

    .line 2072
    iput v1, v0, Ll/ۤ֡᩷;->ܳ:I

    return-object v0

    .line 929
    :cond_0
    new-instance v0, Ll/ۤ֡᩷;

    .line 2087
    invoke-direct {v0, p1}, Ll/ܿ۟᩷;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public final getColumnCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 2

    .line 194
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 195
    iget p1, p0, Ll/ᩴ֡᩷;->ۧ:I

    invoke-virtual {p0}, Ll/᩶۟᩷;->getItemCount()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 197
    :cond_0
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v0

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 202
    :cond_1
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-direct {p0, v0, p1, p2}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final getRowCountForAccessibility(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 2

    .line 180
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v0, :cond_0

    .line 181
    iget p1, p0, Ll/ᩴ֡᩷;->ۧ:I

    invoke-virtual {p0}, Ll/᩶۟᩷;->getItemCount()I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 183
    :cond_0
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 188
    :cond_1
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-direct {p0, v0, p1, p2}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    add-int/2addr p1, v1

    return p1
.end method

.method public final layoutChunk(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ܰ֡᩷;Ll/ۘ֡᩷;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v7, p4

    .line 1221
    iget-object v3, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3}, Ll/ۡ֡᩷;->ᩴ()I

    move-result v3

    const/4 v4, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    if-eq v3, v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 1223
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v8

    if-lez v8, :cond_1

    iget-object v8, v6, Ll/ᩴ֡᩷;->ۙ:[I

    iget v9, v6, Ll/ᩴ֡᩷;->ۧ:I

    aget v8, v8, v9

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-eqz v5, :cond_2

    .line 1228
    invoke-direct/range {p0 .. p0}, Ll/ᩴ֡᩷;->ۤ()V

    .line 1230
    :cond_2
    iget v9, v2, Ll/ܰ֡᩷;->ᩴ:I

    if-ne v9, v4, :cond_3

    const/4 v9, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    .line 1233
    :goto_2
    iget v10, v6, Ll/ᩴ֡᩷;->ۧ:I

    if-nez v9, :cond_4

    .line 1235
    iget v10, v2, Ll/ܰ֡᩷;->᩷:I

    invoke-direct {v6, v10, v0, v1}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v10

    .line 1236
    iget v11, v2, Ll/ܰ֡᩷;->᩷:I

    invoke-direct {v6, v11, v0, v1}, Ll/ᩴ֡᩷;->ۤ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v11

    add-int/2addr v10, v11

    :cond_4
    const/4 v11, 0x0

    .line 1239
    :goto_3
    iget v12, v6, Ll/ᩴ֡᩷;->ۧ:I

    if-ge v11, v12, :cond_8

    .line 2409
    iget v12, v2, Ll/ܰ֡᩷;->᩷:I

    if-ltz v12, :cond_8

    invoke-virtual/range {p2 .. p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v13

    if-ge v12, v13, :cond_8

    if-lez v10, :cond_8

    .line 1240
    iget v12, v2, Ll/ܰ֡᩷;->᩷:I

    .line 1241
    invoke-direct {v6, v12, v0, v1}, Ll/ᩴ֡᩷;->ۤ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v13

    .line 1242
    iget v14, v6, Ll/ᩴ֡᩷;->ۧ:I

    if-gt v13, v14, :cond_7

    sub-int/2addr v10, v13

    if-gez v10, :cond_5

    goto :goto_4

    .line 1251
    :cond_5
    invoke-virtual {v2, v0}, Ll/ܰ֡᩷;->ۙ(Ll/ۖ۟᩷;)Landroid/view/View;

    move-result-object v12

    if-nez v12, :cond_6

    goto :goto_4

    .line 1255
    :cond_6
    iget-object v13, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    aput-object v12, v13, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 1243
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " requires "

    const-string v2, " spans but GridLayoutManager has only "

    const-string v3, "Item at position "

    .line 0
    invoke-static {v3, v12, v1, v2, v13}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 1243
    iget v2, v6, Ll/ᩴ֡᩷;->ۧ:I

    const-string v3, " spans."

    .line 0
    invoke-static {v2, v3, v1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    .line 1243
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_4
    if-nez v11, :cond_9

    .line 1260
    iput-boolean v4, v7, Ll/ۘ֡᩷;->᩷:Z

    return-void

    :cond_9
    if-eqz v9, :cond_a

    const/4 v4, 0x0

    const/4 v10, 0x1

    move v10, v11

    const/4 v12, 0x1

    goto :goto_5

    :cond_a
    add-int/lit8 v4, v11, -0x1

    const/4 v10, -0x1

    const/4 v12, -0x1

    :goto_5
    const/4 v13, 0x0

    :goto_6
    if-eq v4, v10, :cond_b

    .line 1475
    iget-object v14, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    aget-object v14, v14, v4

    .line 1476
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Ll/ۤ֡᩷;

    .line 1477
    invoke-virtual {v6, v14}, Ll/᩶۟᩷;->getPosition(Landroid/view/View;)I

    move-result v14

    invoke-direct {v6, v14, v0, v1}, Ll/ᩴ֡᩷;->ۤ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v14

    iput v14, v15, Ll/ۤ֡᩷;->ܳ:I

    .line 1478
    iput v13, v15, Ll/ۤ֡᩷;->ᩴ:I

    add-int/2addr v13, v14

    add-int/2addr v4, v12

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_7
    if-ge v1, v11, :cond_11

    .line 1270
    iget-object v10, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    aget-object v10, v10, v1

    .line 1271
    iget-object v12, v2, Ll/ܰ֡᩷;->᩻:Ljava/util/List;

    if-nez v12, :cond_d

    if-eqz v9, :cond_c

    .line 1273
    invoke-virtual {v6, v10}, Ll/᩶۟᩷;->addView(Landroid/view/View;)V

    const/4 v12, 0x0

    goto :goto_8

    :cond_c
    const/4 v12, 0x0

    .line 1275
    invoke-virtual {v6, v10, v12}, Ll/᩶۟᩷;->addView(Landroid/view/View;I)V

    goto :goto_8

    :cond_d
    const/4 v12, 0x0

    if-eqz v9, :cond_e

    .line 1279
    invoke-virtual {v6, v10}, Ll/᩶۟᩷;->addDisappearingView(Landroid/view/View;)V

    goto :goto_8

    .line 1281
    :cond_e
    invoke-virtual {v6, v10, v12}, Ll/᩶۟᩷;->addDisappearingView(Landroid/view/View;I)V

    .line 1284
    :goto_8
    iget-object v13, v6, Ll/ᩴ֡᩷;->ۤ:Landroid/graphics/Rect;

    invoke-virtual {v6, v10, v13}, Ll/᩶۟᩷;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1286
    invoke-direct {v6, v10, v3, v12}, Ll/ᩴ֡᩷;->ۙ(Landroid/view/View;IZ)V

    .line 1287
    iget-object v12, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v12, v10}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v12

    if-le v12, v4, :cond_f

    move v4, v12

    .line 1291
    :cond_f
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Ll/ۤ֡᩷;

    .line 1292
    iget-object v13, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v13, v10}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v10

    int-to-float v10, v10

    const/high16 v13, 0x3f800000    # 1.0f

    mul-float v10, v10, v13

    iget v12, v12, Ll/ۤ֡᩷;->ܳ:I

    int-to-float v12, v12

    div-float/2addr v10, v12

    cmpl-float v12, v10, v0

    if-lez v12, :cond_10

    move v0, v10

    :cond_10
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_11
    if-eqz v5, :cond_13

    .line 1439
    iget v1, v6, Ll/ᩴ֡᩷;->ۧ:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 1441
    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-direct {v6, v0}, Ll/ᩴ֡᩷;->᩷(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_9
    if-ge v1, v11, :cond_13

    .line 1304
    iget-object v0, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    aget-object v0, v0, v1

    const/4 v3, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    .line 1305
    invoke-direct {v6, v0, v5, v3}, Ll/ᩴ֡᩷;->ۙ(Landroid/view/View;IZ)V

    .line 1306
    iget-object v3, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3, v0}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v0

    if-le v0, v4, :cond_12

    move v4, v0

    :cond_12
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_13
    const/4 v0, 0x0

    :goto_a
    if-ge v0, v11, :cond_16

    .line 1316
    iget-object v1, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    aget-object v1, v1, v0

    .line 1317
    iget-object v3, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3, v1}, Ll/ۡ֡᩷;->᩷(Landroid/view/View;)I

    move-result v3

    if-eq v3, v4, :cond_15

    .line 1318
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ۤ֡᩷;

    .line 1319
    iget-object v5, v3, Ll/ܿ۟᩷;->ۙ:Landroid/graphics/Rect;

    .line 1320
    iget v8, v5, Landroid/graphics/Rect;->top:I

    iget v9, v5, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v8, v9

    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v8, v9

    iget v9, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v8, v9

    .line 1322
    iget v9, v5, Landroid/graphics/Rect;->left:I

    iget v5, v5, Landroid/graphics/Rect;->right:I

    add-int/2addr v9, v5

    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v9, v5

    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v9, v5

    .line 1324
    iget v5, v3, Ll/ۤ֡᩷;->ᩴ:I

    iget v10, v3, Ll/ۤ֡᩷;->ܳ:I

    invoke-virtual {v6, v5, v10}, Ll/ᩴ֡᩷;->ۙ(II)I

    move-result v5

    .line 1327
    iget v10, v6, Ll/֡֡᩷;->mOrientation:I

    const/4 v12, 0x1

    if-ne v10, v12, :cond_14

    .line 1328
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v10, 0x0

    const/high16 v12, 0x40000000    # 2.0f

    invoke-static {v5, v12, v9, v3, v10}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result v3

    sub-int v5, v4, v8

    .line 1330
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    goto :goto_b

    :cond_14
    const/4 v10, 0x0

    const/high16 v12, 0x40000000    # 2.0f

    sub-int v9, v4, v9

    .line 1333
    invoke-static {v9, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 1335
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v5, v12, v8, v3, v10}, Ll/᩶۟᩷;->ۙ(IIIIZ)I

    move-result v5

    move v3, v9

    .line 1446
    :goto_b
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Ll/ܿ۟᩷;

    .line 1449
    invoke-virtual {v6, v1, v3, v5, v8}, Ll/᩶۟᩷;->shouldReMeasureChild(Landroid/view/View;IILl/ܿ۟᩷;)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 1454
    invoke-virtual {v1, v3, v5}, Landroid/view/View;->measure(II)V

    :cond_15
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_16
    const/4 v0, 0x0

    .line 1342
    iput v4, v7, Ll/ۘ֡᩷;->ۙ:I

    .line 1345
    iget v1, v6, Ll/֡֡᩷;->mOrientation:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_18

    .line 1346
    iget v1, v2, Ll/ܰ֡᩷;->۫:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_17

    .line 1347
    iget v1, v2, Ll/ܰ֡᩷;->֫:I

    sub-int v2, v1, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_c

    .line 1350
    :cond_17
    iget v2, v2, Ll/ܰ֡᩷;->֫:I

    add-int v1, v2, v4

    const/4 v4, 0x0

    const/4 v3, 0x0

    :goto_c
    const/4 v8, 0x0

    goto :goto_e

    :cond_18
    const/4 v1, -0x1

    .line 1354
    iget v3, v2, Ll/ܰ֡᩷;->۫:I

    if-ne v3, v1, :cond_19

    .line 1355
    iget v1, v2, Ll/ܰ֡᩷;->֫:I

    sub-int v2, v1, v4

    move v4, v1

    move v3, v2

    goto :goto_d

    .line 1358
    :cond_19
    iget v1, v2, Ll/ܰ֡᩷;->֫:I

    add-int/2addr v4, v1

    move v3, v1

    :goto_d
    const/4 v2, 0x0

    const/4 v1, 0x0

    goto :goto_c

    :goto_e
    if-ge v8, v11, :cond_1e

    .line 1363
    iget-object v0, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    aget-object v9, v0, v8

    .line 1364
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ll/ۤ֡᩷;

    .line 1365
    iget v0, v6, Ll/֡֡᩷;->mOrientation:I

    const/4 v5, 0x1

    if-ne v0, v5, :cond_1b

    .line 1366
    invoke-virtual/range {p0 .. p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 1367
    invoke-virtual/range {p0 .. p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v0

    iget-object v3, v6, Ll/ᩴ֡᩷;->ۙ:[I

    iget v4, v6, Ll/ᩴ֡᩷;->ۧ:I

    iget v5, v10, Ll/ۤ֡᩷;->ᩴ:I

    sub-int/2addr v4, v5

    aget v3, v3, v4

    add-int/2addr v3, v0

    .line 1368
    iget-object v0, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v0, v9}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v0

    sub-int v0, v3, v0

    goto :goto_f

    .line 1370
    :cond_1a
    invoke-virtual/range {p0 .. p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v0

    iget-object v3, v6, Ll/ᩴ֡᩷;->ۙ:[I

    iget v4, v10, Ll/ۤ֡᩷;->ᩴ:I

    aget v3, v3, v4

    add-int/2addr v0, v3

    .line 1371
    iget-object v3, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v3, v9}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, v0

    :goto_f
    move v14, v0

    move v12, v1

    move v13, v2

    move v15, v3

    goto :goto_10

    .line 1374
    :cond_1b
    invoke-virtual/range {p0 .. p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v0

    iget-object v1, v6, Ll/ᩴ֡᩷;->ۙ:[I

    iget v2, v10, Ll/ۤ֡᩷;->ᩴ:I

    aget v1, v1, v2

    add-int/2addr v0, v1

    .line 1375
    iget-object v1, v6, Ll/֡֡᩷;->mOrientationHelper:Ll/ۡ֡᩷;

    invoke-virtual {v1, v9}, Ll/ۡ֡᩷;->ۤ(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    move v13, v0

    move v12, v1

    move v14, v3

    move v15, v4

    :goto_10
    move-object/from16 v0, p0

    move-object v1, v9

    move v2, v14

    move v3, v13

    move v4, v15

    move v5, v12

    .line 1379
    invoke-virtual/range {v0 .. v5}, Ll/᩶۟᩷;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 12758
    iget-object v0, v10, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isRemoved()Z

    move-result v0

    if-nez v0, :cond_1c

    .line 12769
    iget-object v0, v10, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v0}, Ll/ۧᩳ᩷;->isUpdated()Z

    move-result v0

    if-eqz v0, :cond_1d

    :cond_1c
    const/4 v0, 0x1

    .line 1388
    iput-boolean v0, v7, Ll/ۘ֡᩷;->᩸:Z

    .line 1390
    :cond_1d
    iget-boolean v0, v7, Ll/ۘ֡᩷;->ۤ:Z

    invoke-virtual {v9}, Landroid/view/View;->hasFocusable()Z

    move-result v1

    or-int/2addr v0, v1

    iput-boolean v0, v7, Ll/ۘ֡᩷;->ۤ:Z

    add-int/lit8 v8, v8, 0x1

    move v1, v12

    move v2, v13

    move v3, v14

    move v4, v15

    goto/16 :goto_e

    .line 1392
    :cond_1e
    iget-object v0, v6, Ll/ᩴ֡᩷;->֫:[Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final onAnchorReady(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;I)V
    .locals 4

    .line 1038
    invoke-super {p0, p1, p2, p3, p4}, Ll/֡֡᩷;->onAnchorReady(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/᩺֡᩷;I)V

    .line 1039
    invoke-direct {p0}, Ll/ᩴ֡᩷;->ۤ()V

    .line 1040
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result v0

    if-lez v0, :cond_3

    .line 13625
    iget-boolean v0, p2, Ll/ܳᩳ᩷;->ᩴ:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    const/4 p4, 0x1

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    .line 1072
    :goto_0
    iget v1, p3, Ll/᩺֡᩷;->᩸:I

    invoke-direct {p0, v1, p1, p2}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v1

    if-eqz p4, :cond_1

    :goto_1
    if-lez v1, :cond_3

    .line 1075
    iget p4, p3, Ll/᩺֡᩷;->᩸:I

    if-lez p4, :cond_3

    add-int/lit8 p4, p4, -0x1

    .line 1076
    iput p4, p3, Ll/᩺֡᩷;->᩸:I

    .line 1077
    invoke-direct {p0, p4, p1, p2}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v1

    goto :goto_1

    .line 1081
    :cond_1
    invoke-virtual {p2}, Ll/ܳᩳ᩷;->ۙ()I

    move-result p4

    sub-int/2addr p4, v0

    .line 1082
    iget v0, p3, Ll/᩺֡᩷;->᩸:I

    :goto_2
    if-ge v0, p4, :cond_2

    add-int/lit8 v2, v0, 0x1

    .line 1085
    invoke-direct {p0, v2, p1, p2}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v3

    if-le v3, v1, :cond_2

    move v0, v2

    move v1, v3

    goto :goto_2

    .line 1093
    :cond_2
    iput v0, p3, Ll/᩺֡᩷;->᩸:I

    .line 1043
    :cond_3
    invoke-direct {p0}, Ll/ᩴ֡᩷;->᩷()V

    return-void
.end method

.method public final onFocusSearchFailed(Landroid/view/View;ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)Landroid/view/View;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    .line 1763
    invoke-virtual/range {p0 .. p1}, Ll/᩶۟᩷;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return-object v4

    .line 1767
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ۤ֡᩷;

    .line 1768
    iget v6, v5, Ll/ۤ֡᩷;->ᩴ:I

    .line 1769
    iget v5, v5, Ll/ۤ֡᩷;->ܳ:I

    add-int/2addr v5, v6

    .line 1770
    invoke-super/range {p0 .. p4}, Ll/֡֡᩷;->onFocusSearchFailed(Landroid/view/View;ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)Landroid/view/View;

    move-result-object v7

    if-nez v7, :cond_1

    return-object v4

    :cond_1
    move/from16 v7, p2

    .line 1776
    invoke-virtual {v0, v7}, Ll/֡֡᩷;->convertFocusDirectionToLayoutDirection(I)I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_2

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    .line 1777
    :goto_0
    iget-boolean v9, v0, Ll/֡֡᩷;->mShouldReverseLayout:Z

    if-eq v7, v9, :cond_3

    .line 1780
    invoke-virtual/range {p0 .. p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v7

    sub-int/2addr v7, v8

    const/4 v9, -0x1

    const/4 v10, -0x1

    goto :goto_1

    .line 1786
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v9

    const/4 v7, 0x0

    const/4 v10, 0x1

    .line 1788
    :goto_1
    iget v11, v0, Ll/֡֡᩷;->mOrientation:I

    if-ne v11, v8, :cond_4

    invoke-virtual/range {p0 .. p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result v8

    if-eqz v8, :cond_4

    const/4 v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    .line 1812
    :goto_2
    invoke-direct {v0, v7, v1, v2}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v11

    const/4 v12, 0x0

    const/4 v13, -0x1

    const/4 v14, -0x1

    const/4 v15, 0x0

    move v12, v7

    move/from16 p1, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/4 v15, -0x1

    move-object v7, v4

    :goto_3
    if-eq v12, v9, :cond_14

    move/from16 p2, v9

    .line 1814
    invoke-direct {v0, v12, v1, v2}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v9

    .line 1815
    invoke-virtual {v0, v12}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto/16 :goto_a

    .line 1820
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v16

    if-eqz v16, :cond_8

    if-eq v9, v11, :cond_8

    if-eqz v4, :cond_6

    goto/16 :goto_a

    :cond_6
    move-object/from16 v16, v3

    move/from16 v19, v11

    :cond_7
    move/from16 v17, v13

    move/from16 v18, v14

    goto/16 :goto_8

    .line 1831
    :cond_8
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ۤ֡᩷;

    .line 1832
    iget v2, v9, Ll/ۤ֡᩷;->ᩴ:I

    move-object/from16 v16, v3

    .line 1833
    iget v3, v9, Ll/ۤ֡᩷;->ܳ:I

    add-int/2addr v3, v2

    .line 1834
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v17

    if-eqz v17, :cond_9

    if-ne v2, v6, :cond_9

    if-ne v3, v5, :cond_9

    return-object v1

    .line 1839
    :cond_9
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v17

    if-eqz v17, :cond_a

    if-eqz v4, :cond_b

    .line 1840
    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v17

    if-nez v17, :cond_c

    if-nez v7, :cond_c

    :cond_b
    move/from16 v19, v11

    goto :goto_5

    .line 1843
    :cond_c
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v17

    .line 1844
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v18

    move/from16 v19, v11

    sub-int v11, v18, v17

    .line 1846
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v17

    if-eqz v17, :cond_f

    if-le v11, v13, :cond_d

    goto :goto_5

    :cond_d
    if-ne v11, v13, :cond_7

    if-le v2, v14, :cond_e

    const/4 v11, 0x1

    goto :goto_4

    :cond_e
    const/4 v11, 0x0

    :goto_4
    if-ne v8, v11, :cond_7

    :goto_5
    move/from16 v17, v13

    move/from16 v18, v14

    goto :goto_7

    :cond_f
    if-nez v4, :cond_7

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x1

    .line 1855
    invoke-virtual {v0, v1, v13, v14}, Ll/᩶۟᩷;->isViewPartiallyVisible(Landroid/view/View;ZZ)Z

    move-result v13

    if-eqz v13, :cond_13

    if-le v11, v10, :cond_10

    goto :goto_7

    :cond_10
    if-ne v11, v10, :cond_13

    if-le v2, v15, :cond_11

    goto :goto_6

    :cond_11
    const/4 v14, 0x0

    :goto_6
    if-ne v8, v14, :cond_13

    .line 1867
    :goto_7
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    move-result v11

    if-eqz v11, :cond_12

    .line 1869
    iget v4, v9, Ll/ۤ֡᩷;->ᩴ:I

    .line 1870
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1871
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr v3, v2

    move v13, v3

    move v14, v4

    move-object v4, v1

    goto :goto_9

    .line 1874
    :cond_12
    iget v15, v9, Ll/ۤ֡᩷;->ᩴ:I

    .line 1875
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 1876
    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int v10, v3, v2

    move-object v7, v1

    :cond_13
    :goto_8
    move/from16 v13, v17

    move/from16 v14, v18

    :goto_9
    add-int v12, v12, p1

    move/from16 v9, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, v16

    move/from16 v11, v19

    goto/16 :goto_3

    :cond_14
    :goto_a
    if-eqz v4, :cond_15

    return-object v4

    :cond_15
    return-object v7
.end method

.method public final onInitializeAccessibilityNodeInfo(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ᩴ۬;)V
    .locals 0

    .line 229
    invoke-super {p0, p1, p2, p3}, Ll/֡֡᩷;->onInitializeAccessibilityNodeInfo(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Ll/ᩴ۬;)V

    .line 233
    const-class p1, Landroid/widget/GridView;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ᩴ۬;->ۙ(Ljava/lang/CharSequence;)V

    .line 235
    iget-object p1, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object p1, p1, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/۫۟᩷;->getItemCount()I

    move-result p1

    const/4 p2, 0x1

    if-le p1, p2, :cond_0

    .line 236
    sget-object p1, Ll/۠ۜ;->ܶ:Ll/۠ۜ;

    invoke-virtual {p3, p1}, Ll/ᩴ۬;->ۙ(Ll/۠ۜ;)V

    :cond_0
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfoForItem(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;Landroid/view/View;Ll/ᩴ۬;)V
    .locals 7

    .line 208
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 209
    instance-of v1, v0, Ll/ۤ֡᩷;

    if-nez v1, :cond_0

    .line 210
    invoke-super {p0, p3, p4}, Ll/᩶۟᩷;->onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;Ll/ᩴ۬;)V

    return-void

    .line 213
    :cond_0
    check-cast v0, Ll/ۤ֡᩷;

    .line 12787
    iget-object p3, v0, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {p3}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result p3

    .line 214
    invoke-direct {p0, p3, p1, p2}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    .line 215
    iget p2, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez p2, :cond_1

    .line 2109
    iget v1, v0, Ll/ۤ֡᩷;->ᩴ:I

    .line 2119
    iget v2, v0, Ll/ۤ֡᩷;->ܳ:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    move v3, p1

    .line 216
    invoke-static/range {v1 .. v6}, Ll/ۤ۬;->ۙ(IIIIZZ)Ll/ۤ۬;

    move-result-object p1

    invoke-virtual {p4, p1}, Ll/ᩴ۬;->ۙ(Ll/ۤ۬;)V

    return-void

    .line 2109
    :cond_1
    iget v3, v0, Ll/ۤ֡᩷;->ᩴ:I

    .line 2119
    iget v4, v0, Ll/ۤ֡᩷;->ܳ:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x1

    move v1, p1

    .line 220
    invoke-static/range {v1 .. v6}, Ll/ۤ۬;->ۙ(IIIIZZ)Ll/ۤ۬;

    move-result-object p1

    invoke-virtual {p4, p1}, Ll/ᩴ۬;->ۙ(Ll/ۤ۬;)V

    return-void
.end method

.method public final onItemsAdded(Ll/᩻ᩳ᩷;II)V
    .locals 0

    .line 879
    iget-object p1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {p1}, Ll/᩸֡᩷;->ۙ()V

    .line 1584
    iget-object p1, p1, Ll/᩸֡᩷;->ۙ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final onItemsChanged(Ll/᩻ᩳ᩷;)V
    .locals 0

    .line 885
    iget-object p1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {p1}, Ll/᩸֡᩷;->ۙ()V

    .line 1584
    iget-object p1, p1, Ll/᩸֡᩷;->ۙ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final onItemsMoved(Ll/᩻ᩳ᩷;III)V
    .locals 0

    .line 904
    iget-object p1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {p1}, Ll/᩸֡᩷;->ۙ()V

    .line 1584
    iget-object p1, p1, Ll/᩸֡᩷;->ۙ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final onItemsRemoved(Ll/᩻ᩳ᩷;II)V
    .locals 0

    .line 891
    iget-object p1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {p1}, Ll/᩸֡᩷;->ۙ()V

    .line 1584
    iget-object p1, p1, Ll/᩸֡᩷;->ۙ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final onItemsUpdated(Ll/᩻ᩳ᩷;IILjava/lang/Object;)V
    .locals 0

    .line 898
    iget-object p1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {p1}, Ll/᩸֡᩷;->ۙ()V

    .line 1584
    iget-object p1, p1, Ll/᩸֡᩷;->ۙ:Landroid/util/SparseIntArray;

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final onLayoutChildren(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)V
    .locals 7

    .line 13625
    iget-boolean v0, p2, Ll/ܳᩳ᩷;->ᩴ:Z

    .line 834
    iget-object v1, p0, Ll/ᩴ֡᩷;->ܳ:Landroid/util/SparseIntArray;

    iget-object v2, p0, Ll/ᩴ֡᩷;->۫:Landroid/util/SparseIntArray;

    if-eqz v0, :cond_0

    .line 868
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    .line 870
    invoke-virtual {p0, v3}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ۤ֡᩷;

    .line 12787
    iget-object v5, v4, Ll/ܿ۟᩷;->᩸:Ll/ۧᩳ᩷;

    invoke-virtual {v5}, Ll/ۧᩳ᩷;->getLayoutPosition()I

    move-result v5

    .line 2119
    iget v6, v4, Ll/ۤ֡᩷;->ܳ:I

    .line 872
    invoke-virtual {v2, v5, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 2109
    iget v4, v4, Ll/ۤ֡᩷;->ᩴ:I

    .line 873
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 837
    :cond_0
    invoke-super {p0, p1, p2}, Ll/֡֡᩷;->onLayoutChildren(Ll/ۖ۟᩷;Ll/ܳᩳ᩷;)V

    .line 863
    invoke-virtual {v2}, Landroid/util/SparseIntArray;->clear()V

    .line 864
    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public final onLayoutCompleted(Ll/ܳᩳ᩷;)V
    .locals 2

    .line 846
    invoke-super {p0, p1}, Ll/֡֡᩷;->onLayoutCompleted(Ll/ܳᩳ᩷;)V

    const/4 p1, 0x0

    .line 847
    iput-boolean p1, p0, Ll/ᩴ֡᩷;->᩸:Z

    .line 848
    iget p1, p0, Ll/ᩴ֡᩷;->ᩴ:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 849
    invoke-virtual {p0, p1}, Ll/֡֡᩷;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    const/high16 v1, 0x4000000

    .line 855
    invoke-virtual {p1, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 857
    iput v0, p0, Ll/ᩴ֡᩷;->ᩴ:I

    :cond_0
    return-void
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 11

    .line 247
    sget-object v0, Ll/۠ۜ;->ܶ:Ll/۠ۜ;

    invoke-virtual {v0}, Ll/۠ۜ;->ۙ()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne p1, v0, :cond_31

    if-eq p1, v3, :cond_31

    const/4 p1, 0x0

    .line 803
    :goto_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 804
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2131
    invoke-virtual {v0}, Landroid/view/View;->isAccessibilityFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 810
    invoke-virtual {p0, p1}, Ll/᩶۟᩷;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    goto :goto_1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_2

    goto/16 :goto_11

    :cond_2
    if-nez p2, :cond_3

    goto/16 :goto_11

    :cond_3
    const-string v0, "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"

    .line 261
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p2

    .line 264
    sget-object v0, Ll/ᩴ֡᩷;->ܺ:Ljava/util/Set;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_11

    .line 272
    :cond_4
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    .line 273
    invoke-virtual {v0, p1}, Ll/᩻ᩳ᩷;->getChildViewHolder(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object p1

    if-nez p1, :cond_5

    goto/16 :goto_11

    .line 282
    :cond_5
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->getAbsoluteAdapterPosition()I

    move-result p1

    .line 283
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v0

    .line 284
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v4

    if-ltz v0, :cond_36

    if-gez v4, :cond_6

    goto/16 :goto_11

    .line 828
    :cond_6
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ᩴ(I)Ljava/util/HashSet;

    move-result-object v5

    iget v6, p0, Ll/ᩴ֡᩷;->ۚ:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 784
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v5

    invoke-direct {p0, v5, p1}, Ll/ᩴ֡᩷;->᩷(II)Ljava/util/HashSet;

    move-result-object v5

    .line 829
    iget v6, p0, Ll/ᩴ֡᩷;->᩷:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    .line 296
    :cond_7
    iput v0, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 297
    iput v4, p0, Ll/ᩴ֡᩷;->᩷:I

    .line 302
    :cond_8
    iget v5, p0, Ll/ᩴ֡᩷;->ۚ:I

    if-ne v5, v3, :cond_9

    move v5, v0

    .line 304
    :cond_9
    iget v6, p0, Ll/ᩴ֡᩷;->᩷:I

    if-ne v6, v3, :cond_a

    goto :goto_2

    :cond_a
    move v4, v6

    :goto_2
    const/16 v6, 0x42

    const/16 v7, 0x11

    if-eq p2, v7, :cond_1a

    const/16 v8, 0x21

    if-eq p2, v8, :cond_16

    if-eq p2, v6, :cond_10

    const/16 v8, 0x82

    if-eq p2, v8, :cond_b

    goto/16 :goto_11

    :cond_b
    add-int/2addr p1, v1

    .line 563
    :goto_3
    invoke-virtual {p0}, Ll/᩶۟᩷;->getItemCount()I

    move-result v8

    if-ge p1, v8, :cond_20

    .line 564
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v8

    .line 565
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v9

    if-ltz v8, :cond_20

    if-gez v9, :cond_c

    goto/16 :goto_7

    .line 576
    :cond_c
    iget v10, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne v10, v1, :cond_e

    if-le v8, v5, :cond_f

    if-eq v9, v4, :cond_d

    .line 784
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v9

    invoke-direct {p0, v9, p1}, Ll/ᩴ֡᩷;->᩷(II)Ljava/util/HashSet;

    move-result-object v9

    .line 586
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    .line 588
    :cond_d
    iput v8, p0, Ll/ᩴ֡᩷;->ۚ:I

    goto/16 :goto_8

    :cond_e
    if-le v8, v5, :cond_f

    if-ne v9, v4, :cond_f

    .line 603
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v4

    iput v4, p0, Ll/ᩴ֡᩷;->ۚ:I

    goto/16 :goto_8

    :cond_f
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_10
    add-int/2addr p1, v1

    .line 402
    :goto_4
    invoke-virtual {p0}, Ll/᩶۟᩷;->getItemCount()I

    move-result v8

    if-ge p1, v8, :cond_20

    .line 403
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v8

    .line 404
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v9

    if-ltz v8, :cond_20

    if-gez v9, :cond_11

    goto/16 :goto_7

    .line 415
    :cond_11
    iget v10, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne v10, v1, :cond_14

    if-ne v8, v5, :cond_12

    if-gt v9, v4, :cond_13

    :cond_12
    if-le v8, v5, :cond_15

    .line 426
    :cond_13
    iput v8, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 427
    iput v9, p0, Ll/ᩴ֡᩷;->᩷:I

    goto/16 :goto_8

    :cond_14
    if-le v9, v4, :cond_15

    .line 440
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ᩴ(I)Ljava/util/HashSet;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    .line 443
    iput v9, p0, Ll/ᩴ֡᩷;->᩷:I

    goto/16 :goto_8

    :cond_15
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_16
    sub-int/2addr p1, v1

    :goto_5
    if-ltz p1, :cond_20

    .line 509
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v8

    .line 510
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v9

    if-ltz v8, :cond_20

    if-gez v9, :cond_17

    goto/16 :goto_7

    .line 521
    :cond_17
    iget v10, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne v10, v1, :cond_18

    if-ge v8, v5, :cond_19

    .line 784
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v9

    invoke-direct {p0, v9, p1}, Ll/ᩴ֡᩷;->᩷(II)Ljava/util/HashSet;

    move-result-object v9

    .line 530
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    .line 532
    iput v8, p0, Ll/ᩴ֡᩷;->ۚ:I

    goto :goto_8

    :cond_18
    if-ge v8, v5, :cond_19

    if-ne v9, v4, :cond_19

    .line 548
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ᩴ(I)Ljava/util/HashSet;

    move-result-object v4

    .line 550
    invoke-static {v4}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iput v4, p0, Ll/ᩴ֡᩷;->ۚ:I

    goto :goto_8

    :cond_19
    add-int/lit8 p1, p1, -0x1

    goto :goto_5

    :cond_1a
    sub-int/2addr p1, v1

    :goto_6
    if-ltz p1, :cond_20

    .line 456
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->᩸(I)I

    move-result v8

    .line 457
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result v9

    if-ltz v8, :cond_20

    if-gez v9, :cond_1b

    goto :goto_7

    .line 468
    :cond_1b
    iget v10, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne v10, v1, :cond_1e

    if-ne v8, v5, :cond_1c

    if-lt v9, v4, :cond_1d

    :cond_1c
    if-ge v8, v5, :cond_1f

    .line 480
    :cond_1d
    iput v8, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 481
    iput v9, p0, Ll/ᩴ֡᩷;->᩷:I

    goto :goto_8

    .line 494
    :cond_1e
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ᩴ(I)Ljava/util/HashSet;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1f

    if-ge v9, v4, :cond_1f

    .line 497
    iput v9, p0, Ll/ᩴ֡᩷;->᩷:I

    goto :goto_8

    :cond_1f
    add-int/lit8 p1, p1, -0x1

    goto :goto_6

    :cond_20
    :goto_7
    const/4 p1, -0x1

    :goto_8
    if-ne p1, v3, :cond_30

    .line 329
    iget v4, p0, Ll/֡֡᩷;->mOrientation:I

    if-nez v4, :cond_30

    if-ne p2, v7, :cond_27

    if-gez v0, :cond_21

    goto/16 :goto_d

    :cond_21
    if-ne v4, v1, :cond_22

    goto/16 :goto_d

    .line 649
    :cond_22
    new-instance p1, Ljava/util/TreeMap;

    invoke-static {}, Ljava/util/Collections;->reverseOrder()Ljava/util/Comparator;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    const/4 p2, 0x0

    .line 650
    :goto_9
    invoke-virtual {p0}, Ll/᩶۟᩷;->getItemCount()I

    move-result v4

    if-ge p2, v4, :cond_25

    .line 651
    invoke-direct {p0, p2}, Ll/ᩴ֡᩷;->ᩴ(I)Ljava/util/HashSet;

    move-result-object v4

    .line 652
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_24

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-gez v6, :cond_23

    goto/16 :goto_d

    .line 660
    :cond_23
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_24
    add-int/lit8 p2, p2, 0x1

    goto :goto_9

    .line 664
    :cond_25
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_26
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2f

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ge v5, v0, :cond_26

    .line 666
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 667
    iput v5, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 668
    invoke-direct {p0, p1}, Ll/ᩴ֡᩷;->ۤ(I)I

    move-result p2

    iput p2, p0, Ll/ᩴ֡᩷;->᩷:I

    goto/16 :goto_e

    :cond_27
    if-ne p2, v6, :cond_30

    if-gez v0, :cond_28

    goto :goto_d

    :cond_28
    if-ne v4, v1, :cond_29

    goto :goto_d

    .line 711
    :cond_29
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    const/4 p2, 0x0

    .line 712
    :goto_b
    invoke-virtual {p0}, Ll/᩶۟᩷;->getItemCount()I

    move-result v4

    if-ge p2, v4, :cond_2d

    .line 713
    invoke-direct {p0, p2}, Ll/ᩴ֡᩷;->ᩴ(I)Ljava/util/HashSet;

    move-result-object v4

    .line 714
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2a
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-gez v6, :cond_2b

    goto :goto_d

    .line 723
    :cond_2b
    invoke-virtual {p1, v5}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2a

    .line 724
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {p1, v5, v6}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    :cond_2c
    add-int/lit8 p2, p2, 0x1

    goto :goto_b

    .line 729
    :cond_2d
    invoke-virtual {p1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2e
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2f

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v5, v0, :cond_2e

    .line 731
    invoke-virtual {p1, v4}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 732
    iput v5, p0, Ll/ᩴ֡᩷;->ۚ:I

    .line 733
    iput v2, p0, Ll/ᩴ֡᩷;->᩷:I

    goto :goto_e

    :cond_2f
    :goto_d
    const/4 p1, -0x1

    :cond_30
    :goto_e
    if-eq p1, v3, :cond_36

    .line 344
    invoke-virtual {p0, p1}, Ll/֡֡᩷;->scrollToPosition(I)V

    .line 345
    iput p1, p0, Ll/ᩴ֡᩷;->ᩴ:I

    return v1

    :cond_31
    const v0, 0x1020037

    if-ne p1, v0, :cond_37

    if-eqz p2, :cond_37

    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 354
    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 356
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p2

    if-eq p1, v3, :cond_36

    if-ne p2, v3, :cond_32

    goto :goto_11

    .line 363
    :cond_32
    iget-object v0, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v0, v0, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    invoke-virtual {v0}, Ll/۫۟᩷;->getItemCount()I

    move-result v0

    const/4 v4, 0x0

    :goto_f
    if-ge v4, v0, :cond_35

    .line 369
    iget-object v5, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v6, v5, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v5, v5, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, v4, v6, v5}, Ll/ᩴ֡᩷;->᩷(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v5

    .line 373
    iget-object v6, p0, Ll/᩶۟᩷;->mRecyclerView:Ll/᩻ᩳ᩷;

    iget-object v7, v6, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    iget-object v6, v6, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    invoke-direct {p0, v4, v7, v6}, Ll/ᩴ֡᩷;->ۙ(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result v6

    .line 376
    iget v7, p0, Ll/֡֡᩷;->mOrientation:I

    if-ne v7, v1, :cond_33

    if-ne v5, p2, :cond_34

    if-ne v6, p1, :cond_34

    goto :goto_10

    :cond_33
    if-ne v5, p1, :cond_34

    if-ne v6, p2, :cond_34

    goto :goto_10

    :cond_34
    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    :cond_35
    const/4 v4, -0x1

    :goto_10
    if-le v4, v3, :cond_36

    .line 390
    invoke-virtual {p0, v4, v2}, Ll/֡֡᩷;->scrollToPositionWithOffset(II)V

    return v1

    :cond_36
    :goto_11
    return v2

    .line 396
    :cond_37
    invoke-super {p0, p1, p2}, Ll/֡֡᩷;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final scrollHorizontallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1055
    invoke-direct {p0}, Ll/ᩴ֡᩷;->ۤ()V

    .line 1056
    invoke-direct {p0}, Ll/ᩴ֡᩷;->᩷()V

    .line 1057
    invoke-super {p0, p1, p2, p3}, Ll/֡֡᩷;->scrollHorizontallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public final scrollVerticallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I
    .locals 0

    .line 1063
    invoke-direct {p0}, Ll/ᩴ֡᩷;->ۤ()V

    .line 1064
    invoke-direct {p0}, Ll/ᩴ֡᩷;->᩷()V

    .line 1065
    invoke-super {p0, p1, p2, p3}, Ll/֡֡᩷;->scrollVerticallyBy(ILl/ۖ۟᩷;Ll/ܳᩳ᩷;)I

    move-result p1

    return p1
.end method

.method public final setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 4

    .line 969
    iget-object v0, p0, Ll/ᩴ֡᩷;->ۙ:[I

    if-nez v0, :cond_0

    .line 970
    invoke-super {p0, p1, p2, p3}, Ll/᩶۟᩷;->setMeasuredDimension(Landroid/graphics/Rect;II)V

    .line 973
    :cond_0
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    .line 974
    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Ll/᩶۟᩷;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v0

    .line 975
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    .line 976
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v2

    .line 977
    invoke-virtual {p0}, Ll/᩶۟᩷;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, Ll/᩶۟᩷;->ۙ(III)I

    move-result p1

    .line 978
    iget-object p3, p0, Ll/ᩴ֡᩷;->ۙ:[I

    array-length v0, p3

    sub-int/2addr v0, v3

    aget p3, p3, v0

    add-int/2addr p3, v1

    .line 979
    invoke-virtual {p0}, Ll/᩶۟᩷;->getMinimumWidth()I

    move-result v0

    .line 978
    invoke-static {p2, p3, v0}, Ll/᩶۟᩷;->ۙ(III)I

    move-result p2

    goto :goto_0

    .line 981
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v1

    .line 982
    invoke-virtual {p0}, Ll/᩶۟᩷;->getMinimumWidth()I

    move-result v0

    invoke-static {p2, p1, v0}, Ll/᩶۟᩷;->ۙ(III)I

    move-result p2

    .line 983
    iget-object p1, p0, Ll/ᩴ֡᩷;->ۙ:[I

    array-length v0, p1

    sub-int/2addr v0, v3

    aget p1, p1, v0

    add-int/2addr p1, v2

    .line 984
    invoke-virtual {p0}, Ll/᩶۟᩷;->getMinimumHeight()I

    move-result v0

    .line 983
    invoke-static {p3, p1, v0}, Ll/᩶۟᩷;->ۙ(III)I

    move-result p1

    .line 986
    :goto_0
    invoke-virtual {p0, p2, p1}, Ll/᩶۟᩷;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setStackFromEnd(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 174
    invoke-super {p0, p1}, Ll/֡֡᩷;->setStackFromEnd(Z)V

    return-void

    .line 170
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final supportsPredictiveItemAnimations()Z
    .locals 1

    .line 1885
    iget-object v0, p0, Ll/֡֡᩷;->mPendingSavedState:Ll/ܿ֡᩷;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ᩴ֡᩷;->᩸:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 1490
    iget v0, p0, Ll/ᩴ֡᩷;->ۧ:I

    return v0
.end method

.method public final ۙ(II)I
    .locals 3

    .line 1027
    iget v0, p0, Ll/֡֡᩷;->mOrientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Ll/֡֡᩷;->isLayoutRTL()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1028
    iget-object v0, p0, Ll/ᩴ֡᩷;->ۙ:[I

    iget v1, p0, Ll/ᩴ֡᩷;->ۧ:I

    sub-int v2, v1, p1

    aget v2, v0, v2

    sub-int/2addr v1, p1

    sub-int/2addr v1, p2

    aget p1, v0, v1

    sub-int/2addr v2, p1

    return v2

    .line 1031
    :cond_0
    iget-object v0, p0, Ll/ᩴ֡᩷;->ۙ:[I

    add-int/2addr p2, p1

    aget p2, v0, p2

    aget p1, v0, p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public final ۙ(I)V
    .locals 2

    .line 1503
    iget v0, p0, Ll/ᩴ֡᩷;->ۧ:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1506
    iput-boolean v0, p0, Ll/ᩴ֡᩷;->᩸:Z

    if-lt p1, v0, :cond_1

    .line 1511
    iput p1, p0, Ll/ᩴ֡᩷;->ۧ:I

    .line 1512
    iget-object p1, p0, Ll/ᩴ֡᩷;->᩻:Ll/᩷֡᩷;

    invoke-virtual {p1}, Ll/᩸֡᩷;->ۙ()V

    .line 1513
    invoke-virtual {p0}, Ll/᩶۟᩷;->requestLayout()V

    return-void

    .line 1508
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Span count should be at least 1. Provided "

    .line 0
    invoke-static {p1, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1508
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
