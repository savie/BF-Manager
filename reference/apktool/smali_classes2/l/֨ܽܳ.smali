.class public final Ll/֨ܽܳ;
.super Landroid/view/View;
.source "FITB"


# instance fields
.field public final ֡:Landroid/graphics/Paint;

.field public ۟:I

.field public final ۢ:Ll/ܳ᩹ܳ;

.field public ܰ:Ljava/util/List;

.field public final ܿ:[I

.field public final ᩳ:Ll/ۧܶܳ;

.field public final ᩶:Ll/ᩳܶܳ;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Ll/ܳ᩹ܳ;Ll/ۧܶܳ;)V
    .locals 5

    .line 23
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 17
    new-instance p1, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Ll/֨ܽܳ;->֡:Landroid/graphics/Paint;

    const/4 p1, 0x2

    new-array p1, p1, [I

    .line 18
    iput-object p1, p0, Ll/֨ܽܳ;->ܿ:[I

    .line 19
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/֨ܽܳ;->ܰ:Ljava/util/List;

    const/4 p1, -0x1

    .line 20
    iput p1, p0, Ll/֨ܽܳ;->۟:I

    .line 24
    iput-object p2, p0, Ll/֨ܽܳ;->ۢ:Ll/ܳ᩹ܳ;

    .line 25
    iput-object p3, p0, Ll/֨ܽܳ;->ᩳ:Ll/ۧܶܳ;

    .line 26
    iget-object p1, p2, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    .line 27
    new-array p3, p1, [I

    .line 28
    new-array v0, p1, [Ljava/lang/String;

    .line 29
    new-array v1, p1, [Z

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 31
    iget-object v3, p2, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ᩹ܳ;

    .line 32
    iget v4, v3, Ll/ᩴ᩹ܳ;->᩷:I

    iget-object v3, v3, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    aput v4, p3, v2

    const-string v4, "bounds"

    .line 33
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    aput-object v4, v0, v2

    const-string v4, "visible-to-user"

    .line 34
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "true"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    aput-boolean v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ll/ᩳܶܳ;

    invoke-direct {p1, p3, v0, v1}, Ll/ᩳܶܳ;-><init>([I[Ljava/lang/String;[Z)V

    iput-object p1, p0, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f12055d

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private ۙ(Landroid/graphics/Canvas;Ll/۟ܶܳ;)V
    .locals 13

    if-eqz p2, :cond_1

    .line 70
    iget v0, p2, Ll/۟ܶܳ;->ۤ:I

    iget v1, p2, Ll/۟ܶܳ;->᩷:I

    if-le v0, v1, :cond_1

    iget v2, p2, Ll/۟ܶܳ;->ۙ:I

    iget p2, p2, Ll/۟ܶܳ;->᩸:I

    if-gt v2, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 71
    iget-object v4, p0, Ll/֨ܽܳ;->ܿ:[I

    aget v3, v4, v3

    int-to-long v5, v1

    int-to-long v7, v3

    sub-long/2addr v5, v7

    long-to-float v8, v5

    const/4 v1, 0x1

    aget v1, v4, v1

    int-to-long v4, p2

    int-to-long v6, v1

    sub-long/2addr v4, v6

    long-to-float v9, v4

    int-to-long v4, v0

    int-to-long v6, v3

    sub-long/2addr v4, v6

    long-to-float v10, v4

    int-to-long v2, v2

    int-to-long v0, v1

    sub-long/2addr v2, v0

    long-to-float v11, v2

    .line 74
    iget-object v12, p0, Ll/֨ܽܳ;->֡:Landroid/graphics/Paint;

    move-object v7, p1

    .line 71
    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 54
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 55
    iget-object v0, p0, Ll/֨ܽܳ;->ܿ:[I

    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 56
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    iget-object v1, p0, Ll/֨ܽܳ;->֡:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v0, 0x1

    int-to-float v0, v0

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v2

    .line 57
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const v0, -0x7797360a

    .line 58
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x0

    .line 59
    :goto_0
    iget-object v2, p0, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    iget-object v3, v2, Ll/ᩳܶܳ;->ۙ:[Ll/۟ܶܳ;

    array-length v4, v3

    if-ge v0, v4, :cond_1

    .line 60
    iget v4, p0, Ll/֨ܽܳ;->۟:I

    if-eq v0, v4, :cond_0

    iget-object v2, v2, Ll/ᩳܶܳ;->᩸:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    aget-object v2, v3, v0

    invoke-direct {p0, p1, v2}, Ll/֨ܽܳ;->ۙ(Landroid/graphics/Canvas;Ll/۟ܶܳ;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 62
    :cond_1
    iget v0, p0, Ll/֨ܽܳ;->۟:I

    if-ltz v0, :cond_2

    const/16 v0, -0x47a5

    .line 63
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/4 v0, 0x2

    int-to-float v0, v0

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v3

    .line 64
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    iget-object v0, v2, Ll/ᩳܶܳ;->ۙ:[Ll/۟ܶܳ;

    iget v1, p0, Ll/֨ܽܳ;->۟:I

    aget-object v0, v0, v1

    invoke-direct {p0, p1, v0}, Ll/֨ܽܳ;->ۙ(Landroid/graphics/Canvas;Ll/۟ܶܳ;)V

    :cond_2
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 79
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 80
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iget-object v2, p0, Ll/֨ܽܳ;->᩶:Ll/ᩳܶܳ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 31
    :goto_0
    iget-object v6, v2, Ll/ᩳܶܳ;->ۙ:[Ll/۟ܶܳ;

    array-length v7, v6

    if-ge v5, v7, :cond_1

    .line 32
    iget-object v7, v2, Ll/ᩳܶܳ;->᩸:[Z

    aget-boolean v7, v7, v5

    if-eqz v7, :cond_0

    aget-object v6, v6, v5

    if-eqz v6, :cond_0

    .line 67
    iget v7, v6, Ll/۟ܶܳ;->᩷:I

    iget v8, v6, Ll/۟ܶܳ;->ۤ:I

    if-ge v7, v8, :cond_0

    iget v9, v6, Ll/۟ܶܳ;->᩸:I

    iget v6, v6, Ll/۟ܶܳ;->ۙ:I

    if-ge v9, v6, :cond_0

    int-to-float v7, v7

    cmpl-float v7, v0, v7

    if-ltz v7, :cond_0

    int-to-float v7, v8

    cmpg-float v7, v0, v7

    if-gez v7, :cond_0

    int-to-float v7, v9

    cmpl-float v7, p1, v7

    if-ltz v7, :cond_0

    int-to-float v6, v6

    cmpg-float v6, p1, v6

    if-gez v6, :cond_0

    .line 32
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 34
    :cond_1
    new-instance p1, Ll/֡ܶܳ;

    invoke-direct {p1, v2}, Ll/֡ܶܳ;-><init>(Ll/ᩳܶܳ;)V

    invoke-static {v3, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 80
    iput-object v3, p0, Ll/֨ܽܳ;->ܰ:Ljava/util/List;

    .line 81
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Ll/֨ܽܳ;->ܰ:Ljava/util/List;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    invoke-virtual {p0, p1}, Ll/֨ܽܳ;->ۙ(I)V

    .line 89
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    :cond_3
    return v1
.end method

.method public final performClick()Z
    .locals 1

    .line 89
    invoke-super {p0}, Landroid/view/View;->performClick()Z

    const/4 v0, 0x1

    return v0
.end method

.method public final ۙ()I
    .locals 1

    .line 41
    iget-object v0, p0, Ll/֨ܽܳ;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ۙ(I)V
    .locals 1

    if-ltz p1, :cond_0

    .line 47
    iget-object v0, p0, Ll/֨ܽܳ;->ۢ:Ll/ܳ᩹ܳ;

    iget-object v0, v0, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    iput p1, p0, Ll/֨ܽܳ;->۟:I

    .line 48
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 49
    iget-object p1, p0, Ll/֨ܽܳ;->ᩳ:Ll/ۧܶܳ;

    invoke-virtual {p1}, Ll/ۧܶܳ;->run()V

    return-void
.end method

.method public final ۤ()I
    .locals 2

    .line 42
    iget-object v0, p0, Ll/֨ܽܳ;->ܰ:Ljava/util/List;

    iget v1, p0, Ll/֨ܽܳ;->۟:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/֨ܽܳ;->ܰ:Ljava/util/List;

    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()I
    .locals 1

    .line 40
    iget v0, p0, Ll/֨ܽܳ;->۟:I

    return v0
.end method
