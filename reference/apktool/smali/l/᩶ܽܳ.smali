.class public final Ll/᩶ܽܳ;
.super Ll/ܶܿ᩻;
.source "76ID"


# static fields
.field public static final synthetic ۙ᩷:I


# instance fields
.field public ֡ۙ:Z

.field public ֨ۙ:Ll/ۜ۟ᩴ;

.field public ֫ۙ:Z

.field public ۖۙ:F

.field public ۗۙ:Z

.field public ۘۙ:Z

.field public final ۚۙ:Landroid/widget/LinearLayout;

.field public ۛۙ:Ll/۠ܶܳ;

.field public final ۜۙ:Ll/ܽܽܳ;

.field public ۟ۙ:Z

.field public final ۠ۙ:Ll/ܶ᩻;

.field public ۡۙ:F

.field public ۢۙ:Landroid/widget/ImageView;

.field public final ۧۙ:Landroid/widget/LinearLayout;

.field public ۨۙ:Ll/ܿܽ;

.field public ۫ۙ:Z

.field public ۬ۙ:Z

.field public ܰۙ:Z

.field public ܶۙ:Z

.field public ܺۙ:Z

.field public final ܽۙ:Landroid/view/GestureDetector;

.field public ܿۙ:Z

.field public final ᩳۙ:Landroid/widget/LinearLayout;

.field public ᩵ۙ:Z

.field public final ᩶ۙ:Landroid/widget/ScrollView;

.field public final ᩹ۙ:Ll/ܶܽܳ;

.field public ᩺ۙ:Z

.field public final ᩻ۙ:Ll/ܽܺܳ;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Ll/ܽܺܳ;)V
    .locals 10

    .line 84
    invoke-direct {p0, p1}, Ll/ܶܿ᩻;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 76
    new-instance v0, Ll/ܶܽܳ;

    invoke-direct {v0, p0}, Ll/ܶܽܳ;-><init>(Ll/᩶ܽܳ;)V

    iput-object v0, p0, Ll/᩶ܽܳ;->᩹ۙ:Ll/ܶܽܳ;

    .line 85
    iput-object p2, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    .line 86
    invoke-virtual {p2}, Ll/ܽܺܳ;->ۚ()F

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 87
    new-instance v0, Ll/ܽܽܳ;

    invoke-direct {v0, p1}, Ll/ܽܽܳ;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Ll/᩶ܽܳ;->ۜۙ:Ll/ܽܽܳ;

    const v1, -0xa69c93

    const v2, -0xdfdad5

    const/16 v3, 0x8

    .line 88
    invoke-virtual {v0, v2, v3, v1}, Ll/ܽܽܳ;->ۙ(III)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x7

    .line 89
    invoke-direct {p0, v1}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0, v1}, Landroid/view/View;->setElevation(F)V

    .line 90
    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/᩶ܽܳ;->ۚۙ:Landroid/widget/LinearLayout;

    const/4 v2, 0x1

    .line 91
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0xa

    .line 92
    invoke-direct {p0, v4}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v5

    const/4 v6, 0x5

    invoke-direct {p0, v6}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v6

    invoke-direct {p0, v4}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v4

    const/16 v7, 0x9

    invoke-direct {p0, v7}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v7

    invoke-virtual {v1, v5, v6, v4, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 93
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x1

    const/4 v6, -0x2

    invoke-direct {v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 94
    new-instance v4, Landroid/widget/ScrollView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v4, v7}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Ll/᩶ܽܳ;->᩶ۙ:Landroid/widget/ScrollView;

    const/4 v7, 0x0

    .line 95
    invoke-virtual {v4, v7}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    .line 96
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v8, v5, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v4, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 97
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v5, v8}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Ll/᩶ܽܳ;->ۧۙ:Landroid/widget/LinearLayout;

    .line 98
    invoke-virtual {v5, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 99
    invoke-virtual {v4, v5}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 100
    invoke-virtual {v0, v1}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    move-result-object v1

    iput-object v1, p0, Ll/᩶ܽܳ;->ᩳۙ:Landroid/widget/LinearLayout;

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    .line 102
    invoke-static {}, Ll/ܽܺܳ;->ܰ()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v5, v2, v7

    const v5, 0x7f120564

    .line 101
    invoke-virtual {v4, v5, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb

    const v5, -0x4e443b

    invoke-virtual {v0, v4, v5, v2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v0

    .line 103
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 104
    new-instance v2, Ll/ܶ᩻;

    const/4 v4, 0x0

    .line 41
    invoke-direct {v2, p1, v4}, Ll/ܶ᩻;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 104
    iput-object v2, p0, Ll/᩶ܽܳ;->۠ۙ:Ll/ܶ᩻;

    const/16 v4, 0x32

    .line 105
    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 106
    invoke-static {}, Ll/ܽܺܳ;->ܰ()I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 107
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    const v4, -0xc74001

    .line 108
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 109
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    const/16 v4, 0x28

    .line 110
    invoke-direct {p0, v4}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setMinimumHeight(I)V

    .line 111
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v7, v6, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v1, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 113
    new-instance v1, Ll/᩺ܽܳ;

    invoke-direct {v1, p0, v0, p2}, Ll/᩺ܽܳ;-><init>(Ll/᩶ܽܳ;Landroid/widget/TextView;Ll/ܽܺܳ;)V

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 122
    new-instance p2, Landroid/view/GestureDetector;

    new-instance v0, Ll/ۘܽܳ;

    invoke-direct {v0, p0}, Ll/ۘܽܳ;-><init>(Ll/᩶ܽܳ;)V

    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Ll/᩶ܽܳ;->ܽۙ:Landroid/view/GestureDetector;

    .line 138
    invoke-virtual {p2, v7}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    .line 139
    new-instance p1, Ll/ܰܽܳ;

    invoke-direct {p1, p0}, Ll/ܰܽܳ;-><init>(Ll/᩶ܽܳ;)V

    invoke-virtual {p0, p1}, Ll/ܶܿ᩻;->ۙ(Ll/ܺܿ᩻;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ܽܳ;->֡ۙ:Z

    return p0
.end method

.method private ۙ(I)I
    .locals 1

    int-to-float p1, p1

    .line 528
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private ۙ(Landroid/view/View;Landroid/view/ActionMode$Callback;)Ll/ۜ۟ᩴ;
    .locals 2

    .line 218
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->isTextSelectable()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 201
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_3

    if-ne v0, p0, :cond_2

    .line 219
    iget-object v0, p0, Ll/᩶ܽܳ;->֨ۙ:Ll/ۜ۟ᩴ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۜ۟ᩴ;->finish()V

    .line 220
    :cond_0
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 221
    new-instance v0, Ll/ۗܽܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/ۗܽܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {p1, p2, v0}, Ll/ۜ۟ᩴ;->ۙ(Landroid/view/View;Landroid/view/ActionMode$Callback;Ll/ۗܽܳ;)Ll/ۜ۟ᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶ܽܳ;->֨ۙ:Ll/ۜ۟ᩴ;

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    .line 222
    iput-boolean p2, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    :cond_1
    return-object p1

    .line 201
    :cond_2
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic ۙ(Ll/᩶ܽܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܶ()Z

    return-void
.end method

.method public static ۙ(Ll/᩶ܽܳ;Landroid/view/MotionEvent;)V
    .locals 2

    .line 233
    invoke-virtual {p0}, Ll/ܶܿ᩻;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 234
    :cond_0
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    const/4 v1, 0x3

    .line 235
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 236
    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 237
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    const/4 v0, 0x1

    .line 238
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    .line 239
    invoke-super {p0, p1}, Ll/ܶܿ᩻;->onTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public static ۙ(Ll/᩶ܽܳ;Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x1

    .line 409
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ۘۙ:Z

    .line 410
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 449
    :cond_0
    invoke-virtual {p0, p2}, Ll/᩶ܽܳ;->ۙ(Landroid/view/View;)Ll/ܿܽ;

    move-result-object p0

    .line 450
    invoke-virtual {p0}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p2

    const v0, 0x7f12077f

    .line 451
    invoke-static {p2, v0}, Ll/֨ۚ;->ۙ(Ll/ۢۚ;I)V

    const/4 v0, 0x0

    .line 452
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {p2, v2, v0, v0, v1}, Ll/ۢۚ;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 453
    :cond_1
    new-instance p2, Ll/ۢ᩵ᩴ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p1}, Ll/ۢ᩵ᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p2}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 457
    invoke-static {p0}, Ll/ᩳܽ;->ۙ(Ll/ܿܽ;)Ll/ܳ֫;

    move-result-object p0

    invoke-static {p0}, Ll/᩵֫;->ۙ(Ll/ܳ֫;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܽܳ;Ll/۠ܶܳ;)V
    .locals 1

    .line 474
    iget-object v0, p0, Ll/᩶ܽܳ;->ۛۙ:Ll/۠ܶܳ;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Ll/᩶ܽܳ;->ۛۙ:Ll/۠ܶܳ;

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩶ܽܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩶ܽܳ;->ܿۙ:Z

    return-void
.end method

.method public static bridge synthetic ۙ(FFLandroid/view/View;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩶ܽܳ;->᩷(FFLandroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/᩶ܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ܽܳ;->ܿۙ:Z

    return p0
.end method

.method public static synthetic ۤ(Ll/᩶ܽܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 221
    iput-object v0, p0, Ll/᩶ܽܳ;->֨ۙ:Ll/ۜ۟ᩴ;

    return-void
.end method

.method private ۤ(FFLandroid/view/View;)Z
    .locals 1

    .line 201
    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    if-ne v0, p0, :cond_0

    .line 194
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 195
    invoke-virtual {p3, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 196
    invoke-virtual {p0, p3, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    float-to-int p1, p1

    float-to-int p2, p2

    .line 197
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1

    return p1

    .line 201
    :cond_0
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۧ(Ll/᩶ܽܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/᩶ܽܳ;->᩵ۙ:Z

    return-void
.end method

.method public static bridge synthetic ۫(Ll/᩶ܽܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    return p0
.end method

.method public static synthetic ܳ(Ll/᩶ܽܳ;)Z
    .locals 1

    .line 78
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 79
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object p0, p0, Ll/᩶ܽܳ;->᩹ۙ:Ll/ܶܽܳ;

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    const/4 p0, 0x1

    return p0
.end method

.method private ܶ()Z
    .locals 7

    .line 484
    iget-boolean v0, p0, Ll/᩶ܽܳ;->᩺ۙ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ll/ܶܿ᩻;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x1

    .line 485
    iput-boolean v0, p0, Ll/᩶ܽܳ;->᩺ۙ:Z

    .line 523
    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    .line 524
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "window"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/WindowManager;

    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    const/4 v3, 0x2

    new-array v4, v3, [I

    .line 488
    invoke-virtual {p0, v4}, Ll/ܶܿ᩻;->ۙ([I)V

    .line 489
    iget-boolean v5, p0, Ll/᩶ܽܳ;->᩵ۙ:Z

    if-eqz v5, :cond_1

    aget v3, v4, v1

    iget v5, v2, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_0

    .line 490
    :cond_1
    iget v5, v2, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    sub-int/2addr v5, v6

    div-int/2addr v5, v3

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 491
    :goto_0
    iget-boolean v5, p0, Ll/᩶ܽܳ;->᩵ۙ:Z

    if-eqz v5, :cond_2

    aget v5, v4, v0

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v6

    sub-int/2addr v2, v6

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_2
    const/16 v2, 0xc

    .line 492
    invoke-direct {p0, v2}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v2

    .line 493
    :goto_1
    invoke-virtual {p0, v3, v2}, Ll/ܶܿ᩻;->ۙ(II)V

    .line 494
    iput-boolean v1, p0, Ll/᩶ܽܳ;->᩺ۙ:Z

    .line 495
    aget v5, v4, v1

    if-ne v3, v5, :cond_3

    aget v3, v4, v0

    if-eq v2, v3, :cond_4

    :cond_3
    return v0

    :cond_4
    :goto_2
    return v1
.end method

.method private ܽ()V
    .locals 2

    .line 479
    iget-object v0, p0, Ll/᩶ܽܳ;->ۨۙ:Ll/ܿܽ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿܽ;->ۙ()V

    iput-object v1, p0, Ll/᩶ܽܳ;->ۨۙ:Ll/ܿܽ;

    .line 480
    :cond_0
    iget-object v0, p0, Ll/᩶ܽܳ;->ۛۙ:Ll/۠ܶܳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ܺܽ;->dismiss()V

    iput-object v1, p0, Ll/᩶ܽܳ;->ۛۙ:Ll/۠ܶܳ;

    :cond_1
    return-void
.end method

.method public static ᩴ(Ll/᩶ܽܳ;)V
    .locals 0

    .line 461
    iget-object p0, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {p0}, Ll/ܽܺܳ;->ۙ()V

    return-void
.end method

.method public static synthetic ᩷(Ll/᩶ܽܳ;)V
    .locals 1

    .line 367
    iget-object v0, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {v0, p0}, Ll/ܽܺܳ;->ۙ(Ll/᩶ܽܳ;)V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/᩶ܽܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/᩶ܽܳ;->֡ۙ:Z

    return-void
.end method

.method public static ᩷(FFLandroid/view/View;)Z
    .locals 8

    const/4 v0, -0x1

    .line 244
    invoke-virtual {p2, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p2, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 245
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 246
    move-object v0, p2

    check-cast v0, Landroid/view/ViewGroup;

    .line 247
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    sub-int/2addr v2, v1

    :goto_0
    if-ltz v2, :cond_2

    .line 248
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 249
    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, p0

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    .line 250
    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result v5

    int-to-float v5, v5

    add-float/2addr v5, p1

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    .line 251
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_1

    const/4 v6, 0x0

    cmpl-float v7, v4, v6

    if-ltz v7, :cond_1

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    cmpg-float v7, v4, v7

    if-gez v7, :cond_1

    cmpl-float v6, v5, v6

    if-ltz v6, :cond_1

    .line 252
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    cmpg-float v6, v5, v6

    if-gez v6, :cond_1

    invoke-static {v4, v5, v3}, Ll/᩶ܽܳ;->᩷(FFLandroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_1
    return v1
.end method

.method public static synthetic ᩸(Ll/᩶ܽܳ;)V
    .locals 4

    .line 426
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v2, "isr"

    const/4 v3, 0x1

    .line 427
    invoke-interface {v1, v2, v3}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    xor-int/2addr v1, v3

    .line 426
    invoke-interface {v0, v2, v1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object v0

    .line 427
    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    .line 428
    invoke-direct {p0}, Ll/᩶ܽܳ;->᩹()V

    return-void
.end method

.method private ᩹()V
    .locals 15

    .line 378
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 379
    iget-object v0, p0, Ll/᩶ܽܳ;->ۧۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    const/4 v1, 0x0

    .line 380
    iput-object v1, p0, Ll/᩶ܽܳ;->ۢۙ:Landroid/widget/ImageView;

    .line 381
    iget-object v1, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {v1}, Ll/ܽܺܳ;->ܳ()Ll/֫ܶܳ;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 382
    invoke-virtual {v2}, Ll/֫ܶܳ;->᩷()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0xa

    .line 384
    invoke-direct {p0, v6}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v7

    const/4 v8, 0x5

    invoke-direct {p0, v8}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v9

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    :goto_1
    invoke-direct {p0, v6}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v6

    const/16 v10, 0x9

    invoke-direct {p0, v10}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v10

    iget-object v11, p0, Ll/᩶ܽܳ;->ۚۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v11, v7, v9, v6, v10}, Landroid/view/View;->setPadding(IIII)V

    if-eqz v5, :cond_2

    const/16 v6, 0x8

    .line 385
    invoke-direct {p0, v6}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    iget-object v7, p0, Ll/᩶ܽܳ;->ᩳۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v4, v6, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    if-eqz v5, :cond_3

    .line 387
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_9

    .line 394
    :cond_3
    iget-object v2, p0, Ll/᩶ܽܳ;->ۜۙ:Ll/ܽܽܳ;

    invoke-virtual {v2, v0}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;

    move-result-object v5

    .line 395
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x7f1204ef

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0xf

    const v9, -0xe0b09

    invoke-virtual {v2, v7, v9, v6}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v6

    .line 396
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, -0x2

    invoke-direct {v7, v4, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v5, v6, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 397
    new-instance v13, Ll/᩵ܽܳ;

    const/4 v6, 0x0

    invoke-direct {v13, v6, p0}, Ll/᩵ܽܳ;-><init>(ILjava/lang/Object;)V

    const v14, -0xc74001

    iget-object v9, p0, Ll/᩶ܽܳ;->ۜۙ:Ll/ܽܽܳ;

    const/4 v6, -0x2

    const v11, 0x7f08011a

    const v12, 0x7f12054f

    move-object v10, v5

    invoke-virtual/range {v9 .. v14}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;

    .line 398
    new-instance v7, Ll/ۨܽܳ;

    invoke-direct {v7, p0}, Ll/ۨܽܳ;-><init>(Ll/᩶ܽܳ;)V

    invoke-virtual {p0}, Ll/᩶ܽܳ;->֫()Z

    move-result v9

    invoke-virtual {v2, v5, v7, v9}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;Ljava/lang/Runnable;Z)Landroid/widget/ImageView;

    move-result-object v7

    iput-object v7, p0, Ll/᩶ܽܳ;->ۢۙ:Landroid/widget/ImageView;

    .line 399
    new-instance v13, Ll/۫᩷ۚ;

    const/4 v7, 0x4

    invoke-direct {v13, v7, v1}, Ll/۫᩷ۚ;-><init>(ILjava/lang/Object;)V

    const v7, -0x4e443b

    iget-object v9, p0, Ll/᩶ܽܳ;->ۜۙ:Ll/ܽܽܳ;

    const v11, 0x7f08024c

    const v12, 0x7f1207e7

    move v14, v7

    invoke-virtual/range {v9 .. v14}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;

    .line 400
    new-instance v13, Ll/ᩳۖ᩸;

    const/4 v9, 0x1

    invoke-direct {v13, v9, v1}, Ll/ᩳۖ᩸;-><init>(ILjava/lang/Object;)V

    iget-object v9, p0, Ll/᩶ܽܳ;->ۜۙ:Ll/ܽܽܳ;

    const v11, 0x7f0801bf

    const v12, 0x7f12018c

    invoke-virtual/range {v9 .. v14}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;

    .line 401
    invoke-virtual {v1}, Ll/ܽܺܳ;->֫()Ljava/util/List;

    move-result-object v1

    .line 402
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v5

    .line 403
    sget-object v7, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v9, "isr"

    invoke-interface {v7, v9, v3}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    .line 405
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    :goto_3
    if-eqz v3, :cond_4

    const/4 v10, 0x1

    goto :goto_4

    :cond_4
    const/4 v10, 0x4

    .line 406
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    if-ge v9, v10, :cond_5

    .line 407
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܿܽܳ;

    iget-object v10, v10, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 408
    :cond_5
    new-instance v9, Ll/ۛܽܳ;

    invoke-direct {v9, p0, v7}, Ll/ۛܽܳ;-><init>(Ll/᩶ܽܳ;Ljava/util/ArrayList;)V

    if-eqz v5, :cond_6

    .line 414
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v10, 0x7f120560

    invoke-virtual {v7, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_5

    .line 415
    :cond_6
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܿܽܳ;

    iget-object v7, v7, Ll/ܿܽܳ;->᩷:Ljava/lang/String;

    :goto_5
    const/16 v10, 0xd

    const v11, -0xc74001

    .line 414
    invoke-virtual {v2, v10, v11, v7}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v7

    const v10, 0x800003

    .line 416
    invoke-virtual {v7, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 417
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v12, -0x1

    invoke-direct {v11, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v7, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-eqz v5, :cond_7

    .line 418
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v11

    const v13, 0x7f120550

    invoke-virtual {v11, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    goto :goto_6

    .line 419
    :cond_7
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ܿܽܳ;

    iget-object v11, v11, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    :goto_6
    if-eqz v5, :cond_8

    const v13, -0x4e443b

    goto :goto_7

    :cond_8
    const v13, -0xc74001

    :goto_7
    const/16 v14, 0xb

    .line 418
    invoke-virtual {v2, v14, v13, v11}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v11

    if-nez v5, :cond_9

    .line 420
    sget-object v13, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 421
    :cond_9
    invoke-virtual {v11, v10}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v10, 0x3

    .line 422
    invoke-direct {p0, v10}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v13

    invoke-direct {p0, v8}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v8

    invoke-virtual {v11, v4, v13, v4, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 423
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v8, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v11, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    if-nez v5, :cond_a

    .line 425
    new-instance v5, Ll/֫᩶ۤ;

    const/4 v8, 0x2

    invoke-direct {v5, v8, p0}, Ll/֫᩶ۤ;-><init>(ILjava/lang/Object;)V

    .line 430
    invoke-virtual {v7, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 431
    invoke-virtual {v11, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 432
    invoke-virtual {v7, v9}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 433
    invoke-virtual {v11, v9}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_a
    if-nez v3, :cond_b

    const/4 v3, 0x1

    .line 436
    :goto_8
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x4

    invoke-static {v7, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-ge v3, v5, :cond_b

    .line 437
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿܽܳ;

    iget-object v5, v5, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    const v7, -0xe0b09

    .line 438
    invoke-virtual {v2, v14, v7, v5}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    .line 439
    sget-object v7, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v7, 0x800003

    .line 440
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 441
    invoke-direct {p0, v10}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v7

    invoke-direct {p0, v10}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v8

    invoke-virtual {v5, v4, v7, v4, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 442
    invoke-virtual {v5, v9}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 443
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v12, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 389
    :cond_b
    :goto_9
    iget-object v0, p0, Ll/᩶ܽܳ;->᩶ۙ:Landroid/widget/ScrollView;

    invoke-virtual {v0, v4, v4}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 390
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 147
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_3

    .line 149
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, p0, Ll/᩶ܽܳ;->ۡۙ:F

    .line 150
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Ll/᩶ܽܳ;->ۖۙ:F

    .line 151
    iput-boolean v2, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    .line 152
    iget-object v3, p0, Ll/᩶ܽܳ;->֨ۙ:Ll/ۜ۟ᩴ;

    if-eqz v3, :cond_1

    .line 153
    invoke-virtual {v3}, Ll/ۜ۟ᩴ;->ۙ()Landroid/view/View;

    move-result-object v3

    .line 154
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-direct {p0, v4, v5, v3}, Ll/᩶ܽܳ;->ۤ(FFLandroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    iput-boolean v1, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    goto :goto_0

    .line 155
    :cond_0
    iget-object v3, p0, Ll/᩶ܽܳ;->֨ۙ:Ll/ۜ۟ᩴ;

    invoke-virtual {v3}, Ll/ۜ۟ᩴ;->finish()V

    .line 157
    :cond_1
    :goto_0
    iput-boolean v2, p0, Ll/᩶ܽܳ;->ۘۙ:Z

    .line 158
    iget-object v3, p0, Ll/᩶ܽܳ;->ᩳۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_2

    .line 159
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iget-object v5, p0, Ll/᩶ܽܳ;->۠ۙ:Ll/ܶ᩻;

    invoke-direct {p0, v3, v4, v5}, Ll/᩶ܽܳ;->ۤ(FFLandroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    iput-boolean v3, p0, Ll/᩶ܽܳ;->۫ۙ:Z

    :cond_3
    const/4 v3, 0x2

    if-ne v0, v3, :cond_4

    .line 162
    iget-boolean v3, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    if-nez v3, :cond_4

    iget-boolean v3, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    if-nez v3, :cond_4

    .line 163
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    .line 164
    instance-of v4, v3, Landroid/widget/TextView;

    if-eqz v4, :cond_4

    move-object v4, v3

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->isTextSelectable()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 165
    invoke-virtual {v4}, Landroid/widget/TextView;->hasSelection()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 166
    iget v4, p0, Ll/᩶ܽܳ;->ۡۙ:F

    iget v5, p0, Ll/᩶ܽܳ;->ۖۙ:F

    invoke-direct {p0, v4, v5, v3}, Ll/᩶ܽܳ;->ۤ(FFLandroid/view/View;)Z

    move-result v3

    iput-boolean v3, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    .line 170
    :cond_4
    iget-boolean v3, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    if-eqz v3, :cond_5

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 172
    :cond_5
    iget-boolean v3, p0, Ll/᩶ܽܳ;->۫ۙ:Z

    const/4 v4, 0x3

    if-eqz v3, :cond_8

    .line 173
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eq v0, v1, :cond_7

    if-ne v0, v4, :cond_6

    goto :goto_2

    :cond_6
    return p1

    .line 174
    :cond_7
    :goto_2
    iput-boolean v2, p0, Ll/᩶ܽܳ;->۫ۙ:Z

    return p1

    .line 178
    :cond_8
    iget-boolean v3, p0, Ll/᩶ܽܳ;->ۘۙ:Z

    if-eqz v3, :cond_b

    .line 179
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eq v0, v1, :cond_a

    if-ne v0, v4, :cond_9

    goto :goto_3

    :cond_9
    return p1

    .line 180
    :cond_a
    :goto_3
    iput-boolean v2, p0, Ll/᩶ܽܳ;->ۘۙ:Z

    return p1

    .line 183
    :cond_b
    iget-object v0, p0, Ll/᩶ܽܳ;->ܽۙ:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 184
    iget-boolean v0, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    if-nez v0, :cond_c

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 185
    :cond_c
    invoke-super {p0, p1}, Ll/ܶܿ᩻;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 186
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-eq v3, v1, :cond_e

    .line 187
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-ne p1, v4, :cond_d

    goto :goto_4

    :cond_d
    return v0

    :cond_e
    :goto_4
    iput-boolean v2, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 347
    invoke-super {p0}, Ll/ܶܿ᩻;->onAttachedToWindow()V

    .line 348
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ܽܳ;->᩹ۙ:Ll/ܶܽܳ;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 507
    invoke-super {p0, p1}, Ll/ܶܿ᩻;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 508
    iget-object p1, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {p1}, Ll/ܽܺܳ;->ܶ()V

    .line 509
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 510
    new-instance p1, Ll/֫۠֫;

    const/4 v0, 0x2

    invoke-direct {p1, v0, p0}, Ll/֫۠֫;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 8

    .line 354
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-wide v0, v2

    .line 355
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 356
    iget-object v1, p0, Ll/᩶ܽܳ;->ܽۙ:Landroid/view/GestureDetector;

    invoke-virtual {v1, v0}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 357
    iget-boolean v1, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    if-eqz v1, :cond_0

    invoke-super {p0, v0}, Ll/ܶܿ᩻;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_0
    const/4 v1, 0x0

    .line 358
    iput-boolean v1, p0, Ll/᩶ܽܳ;->ܶۙ:Z

    .line 359
    iput-boolean v1, p0, Ll/᩶ܽܳ;->۫ۙ:Z

    .line 360
    iput-boolean v1, p0, Ll/᩶ܽܳ;->ۘۙ:Z

    .line 361
    iput-boolean v1, p0, Ll/᩶ܽܳ;->۟ۙ:Z

    .line 362
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 363
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v2, p0, Ll/᩶ܽܳ;->᩹ۙ:Ll/ܶܽܳ;

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 364
    invoke-super {p0}, Ll/ܶܿ᩻;->onDetachedFromWindow()V

    .line 365
    iget-boolean v0, p0, Ll/᩶ܽܳ;->ܰۙ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩶ܽܳ;->ܺۙ:Z

    if-nez v0, :cond_1

    .line 366
    iput-boolean v1, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    .line 367
    new-instance v0, Ll/ۡۚ᩵;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۡۚ᩵;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 523
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1}, Landroid/graphics/Point;-><init>()V

    .line 524
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "window"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/WindowManager;

    invoke-interface {p2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 516
    iget-object p2, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {p2}, Ll/ܽܺܳ;->ܳ()Ll/֫ܶܳ;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 517
    invoke-virtual {p2}, Ll/֫ܶܳ;->᩷()Z

    move-result p2

    if-eqz p2, :cond_0

    const/16 p2, 0x168

    goto :goto_0

    :cond_0
    const/16 p2, 0x118

    .line 518
    :goto_0
    invoke-direct {p0, p2}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result p2

    iget v0, p1, Landroid/graphics/Point;->x:I

    const/16 v1, 0x10

    invoke-direct {p0, v1}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    const/16 v0, 0x64

    .line 519
    invoke-direct {p0, v0}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v0

    iget p1, p1, Landroid/graphics/Point;->y:I

    const/16 v1, 0x20

    invoke-direct {p0, v1}, Ll/᩶ܽܳ;->ۙ(I)I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/high16 v0, -0x80000000

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 518
    invoke-super {p0, p2, p1}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 500
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    if-ne p1, p3, :cond_1

    if-eq p2, p4, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 502
    :cond_1
    :goto_0
    new-instance p1, Ll/֫۠֫;

    const/4 p2, 0x2

    invoke-direct {p1, p2, p0}, Ll/֫۠֫;-><init>(ILjava/lang/Object;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 209
    invoke-direct {p0, p1, p2}, Ll/᩶ܽܳ;->ۙ(Landroid/view/View;Landroid/view/ActionMode$Callback;)Ll/ۜ۟ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final startActionModeForChild(Landroid/view/View;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 0

    .line 214
    invoke-direct {p0, p1, p2}, Ll/᩶ܽܳ;->ۙ(Landroid/view/View;Landroid/view/ActionMode$Callback;)Ll/ۜ۟ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    .line 271
    iget-object v0, p0, Ll/᩶ܽܳ;->ᩳۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(Landroid/view/View;)Ll/ܿܽ;
    .locals 4

    .line 465
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 466
    new-instance v0, Ll/ܿܽ;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f130170

    invoke-direct {v1, v2, v3}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 466
    iput-object v0, p0, Ll/᩶ܽܳ;->ۨۙ:Ll/ܿܽ;

    return-object v0
.end method

.method public final ۙ()V
    .locals 2

    .line 320
    iget-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 321
    iput-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    const/4 v0, 0x0

    .line 323
    :try_start_0
    invoke-super {p0}, Ll/ܶܿ᩻;->ۙ()V

    .line 324
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ll/ܶܿ᩻;->isAttachedToWindow()Z

    move-result v1

    if-nez v1, :cond_1

    iput-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 326
    iput-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    .line 327
    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۙ(Ll/۠ܶܳ;)V
    .locals 1

    .line 472
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 473
    iput-object p1, p0, Ll/᩶ܽܳ;->ۛۙ:Ll/۠ܶܳ;

    .line 474
    new-instance v0, Ll/᩹ܽܳ;

    invoke-direct {v0, p0, p1}, Ll/᩹ܽܳ;-><init>(Ll/᩶ܽܳ;Ll/۠ܶܳ;)V

    invoke-virtual {p1, v0}, Ll/ܺܽ;->ۙ(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 475
    invoke-virtual {p1}, Ll/۠ܶܳ;->show()V

    return-void
.end method

.method public final ۙ(Ll/ܶܶܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 311
    iput-boolean v0, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    .line 312
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 313
    invoke-virtual {p0}, Ll/᩶ܽܳ;->᩸()V

    .line 314
    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 302
    iput-boolean p1, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    .line 303
    invoke-virtual {p0}, Ll/᩶ܽܳ;->᩸()V

    .line 305
    :cond_0
    invoke-direct {p0}, Ll/᩶ܽܳ;->᩹()V

    .line 372
    iget-boolean p1, p0, Ll/᩶ܽܳ;->ۗۙ:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    if-nez p1, :cond_1

    iget-boolean p1, p0, Ll/᩶ܽܳ;->ܺۙ:Z

    if-nez p1, :cond_1

    .line 373
    invoke-virtual {p0}, Ll/᩶ܽܳ;->ۙ()V

    return-void

    .line 374
    :cond_1
    invoke-virtual {p0}, Ll/᩶ܽܳ;->᩸()V

    return-void
.end method

.method public final ۚ()Z
    .locals 1

    .line 275
    iget-boolean v0, p0, Ll/᩶ܽܳ;->ܺۙ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩶ܽܳ;->ۗۙ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, 0x0

    .line 295
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ۗۙ:Z

    .line 296
    invoke-direct {p0}, Ll/᩶ܽܳ;->᩹()V

    .line 372
    iget-boolean v0, p0, Ll/᩶ܽܳ;->ۗۙ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/᩶ܽܳ;->ܺۙ:Z

    if-nez v0, :cond_0

    .line 373
    invoke-virtual {p0}, Ll/᩶ܽܳ;->ۙ()V

    return-void

    .line 374
    :cond_0
    invoke-virtual {p0}, Ll/᩶ܽܳ;->᩸()V

    return-void
.end method

.method public final ۫()V
    .locals 1

    const/4 v0, 0x1

    .line 288
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ۗۙ:Z

    const/4 v0, 0x0

    .line 289
    iput-boolean v0, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    .line 290
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 291
    invoke-virtual {p0}, Ll/᩶ܽܳ;->᩸()V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x1

    .line 279
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ܺۙ:Z

    .line 280
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ۗۙ:Z

    const/4 v0, 0x0

    .line 281
    iput-boolean v0, p0, Ll/᩶ܽܳ;->֫ۙ:Z

    .line 282
    invoke-direct {p0}, Ll/᩶ܽܳ;->ܽ()V

    .line 283
    invoke-virtual {p0}, Ll/᩶ܽܳ;->᩸()V

    return-void
.end method

.method public final ܺ()V
    .locals 1

    .line 259
    iget-object v0, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {v0}, Ll/ܽܺܳ;->ܳ()Ll/֫ܶܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 260
    invoke-virtual {v0}, Ll/֫ܶܳ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩶ܽܳ;->᩹()V

    return-void
.end method

.method public final ᩸()V
    .locals 3

    .line 333
    iget-object v0, p0, Ll/᩶ܽܳ;->֨ۙ:Ll/ۜ۟ᩴ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۜ۟ᩴ;->finish()V

    :cond_0
    const/4 v0, 0x1

    .line 335
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ܰۙ:Z

    const/4 v0, 0x0

    .line 337
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "window"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    invoke-interface {v1, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 340
    :cond_1
    iput-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    .line 341
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ܰۙ:Z

    return-void

    :catchall_0
    move-exception v1

    .line 340
    iput-boolean v0, p0, Ll/᩶ܽܳ;->۬ۙ:Z

    .line 341
    iput-boolean v0, p0, Ll/᩶ܽܳ;->ܰۙ:Z

    .line 342
    throw v1
.end method

.method public final ᩻()V
    .locals 2

    .line 264
    iget-object v0, p0, Ll/᩶ܽܳ;->ᩳۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 265
    invoke-virtual {p0}, Ll/᩶ܽܳ;->֫()Z

    move-result v0

    .line 266
    iget-object v1, p0, Ll/᩶ܽܳ;->ۢۙ:Landroid/widget/ImageView;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 267
    :cond_1
    iget-object v1, p0, Ll/᩶ܽܳ;->᩻ۙ:Ll/ܽܺܳ;

    invoke-virtual {v1}, Ll/ܽܺܳ;->ܳ()Ll/֫ܶܳ;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 268
    invoke-virtual {v1, v0}, Ll/֫ܶܳ;->᩷(Z)V

    :cond_2
    return-void
.end method
