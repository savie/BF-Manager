.class public Ll/ۗۘ᩺;
.super Ll/ܿܰۙ;
.source "046D"


# static fields
.field public static final synthetic ܺۙ:I

.field private static final ᩷᩶֫:[S


# instance fields
.field public ᩷ۙ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x33

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    const/16 v0, 0x7f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗۘ᩺;->᩷᩶֫:[S

    .line 56
    sget-object v0, Ll/ۙܳ᩺;->ܰ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/֫ۘ᩺;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 322
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    return-void

    :array_0
    .array-data 2
        0x23f1s
        -0xa17s
        -0xa1as
        -0xa14s
        -0xa06s
        -0xa19s
        -0xa1fs
        -0xa14s
        -0xa5as
        -0xa15s
        -0xa19s
        -0xa1as
        -0xa04s
        -0xa13s
        -0xa1as
        -0xa04s
        -0xa5as
        -0xa08s
        -0xa1bs
        -0xa5as
        -0xa28s
        -0xa17s
        -0xa15s
        -0xa1ds
        -0xa17s
        -0xa11s
        -0xa13s
        -0xa3fs
        -0xa1as
        -0xa12s
        -0xa19s
        -0xa54s
        -0xa47s
        -0xa17s
        -0xa1as
        -0xa14s
        -0xa06s
        -0xa19s
        -0xa1fs
        -0xa14s
        -0xa5as
        -0xa15s
        -0xa19s
        -0xa1as
        -0xa04s
        -0xa13s
        -0xa1as
        -0xa04s
        -0xa5as
        -0xa08s
        -0xa1bs
        -0xa5as
        -0xa28s
        -0xa17s
        -0xa15s
        -0xa1ds
        -0xa17s
        -0xa11s
        -0xa13s
        -0xa3fs
        -0xa1as
        -0xa12s
        -0xa19s
        -0xa35s
        -0xa26s
        -0xa33s
        -0xa37s
        -0xa24s
        -0xa39s
        -0xa26s
        -0xa05s
        -0xa28s
        -0xa17s
        -0xa15s
        -0xa1ds
        -0xa17s
        -0xa11s
        -0xa13s
        -0xa3fs
        -0xa1as
        -0xa12s
        -0xa19s
        -0xa35s
        -0xa17s
        -0xa15s
        -0xa20s
        -0xa13s
        -0xa1bs
        -0xa35s
        -0xa06s
        -0xa13s
        -0xa17s
        -0xa04s
        -0xa19s
        -0xa06s
        -0xa05s
        -0xa05s
        -0xa28s
        -0xa17s
        -0xa1fs
        -0xa06s
        -0xa13s
        -0xa14s
        -0xa35s
        -0xa06s
        -0xa13s
        -0xa17s
        -0xa04s
        -0xa19s
        -0xa06s
        -0xa05s
        -0xa15s
        -0xa1cs
        -0xa13s
        -0xa17s
        -0xa06s
        -0xa16s
        -0xa1fs
        -0xa1as
        -0xa5as
        -0xa1bs
        -0xa04s
        -0xa5as
        -0xa08s
        -0xa1cs
        -0xa03s
        -0xa05s
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 218
    invoke-direct {p0, p1, p2}, Ll/ܿܰۙ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 222
    invoke-direct {p0, p1, p2, p3}, Ll/ܿܰۙ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic ۖ()V
    .locals 0

    .line 0
    invoke-static {}, Ll/ۗۘ᩺;->ۚ()V

    return-void
.end method

.method public static ۘ(Landroid/view/View;)V
    .locals 1

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    .line 47
    instance-of v0, p0, Ll/ۗۘ᩺;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۗۘ᩺;

    const/4 v0, 0x1

    .line 48
    iput-boolean v0, p0, Ll/ۗۘ᩺;->᩷ۙ:Z

    return-void

    .line 51
    :cond_0
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static native ۚ()V
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 258
    iget-boolean v0, p0, Ll/ۗۘ᩺;->᩷ۙ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 259
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    .line 260
    iput-boolean v1, p0, Ll/ۗۘ᩺;->᩷ۙ:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 266
    :cond_1
    :goto_0
    :try_start_0
    invoke-super {p0, p1}, Ll/ܿܰۙ;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 238
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 239
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 240
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    .line 241
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v0, v4, :cond_0

    if-eq v1, v4, :cond_3

    :cond_0
    const/high16 p1, -0x80000000

    if-ne v0, p1, :cond_1

    const/high16 v0, 0x40000000    # 2.0f

    :cond_1
    if-ne v1, p1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    .line 249
    :cond_2
    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 250
    invoke-static {v3, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 253
    :cond_3
    invoke-super {p0, p1, p2}, Ll/ܿܰۙ;->onMeasure(II)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 274
    iget-boolean v0, p0, Ll/ۗۘ᩺;->᩷ۙ:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 275
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 276
    iput-boolean v0, p0, Ll/ۗۘ᩺;->᩷ۙ:Z

    goto :goto_0

    :cond_0
    return v1

    .line 281
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/ܿܰۙ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return v1
.end method

.method public final postDelayed(Ljava/lang/Runnable;J)Z
    .locals 3

    const-wide/16 v0, 0xa0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 232
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    move-result p1

    return p1
.end method
