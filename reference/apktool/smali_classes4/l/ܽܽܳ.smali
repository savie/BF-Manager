.class public final Ll/ܽܽܳ;
.super Ljava/lang/Object;
.source "I6H8"


# instance fields
.field public final ۙ:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    return-void
.end method

.method private ۙ(I)I
    .locals 1

    int-to-float p1, p1

    .line 127
    iget-object v0, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;II)Landroid/widget/ImageView;
    .locals 4

    .line 90
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 91
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-static {v2, p2, v3}, Ll/᩻۠᩷;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻۠᩷;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 92
    invoke-static {p2}, Ll/֡ᩳ;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2, p5}, Ll/֡ᩳ;->᩷(Landroid/graphics/drawable/Drawable;I)V

    .line 93
    :cond_0
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 94
    invoke-virtual {v1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    const/16 p2, 0x8

    .line 95
    invoke-direct {p0, p2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p3

    invoke-direct {p0, p2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p5

    invoke-direct {p0, p2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v1

    invoke-direct {p0, p2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p2

    invoke-virtual {v0, p3, p5, v1, p2}, Landroid/view/View;->setPadding(IIII)V

    .line 96
    new-instance p2, Landroid/graphics/drawable/RippleDrawable;

    const p3, 0x3340c4ff

    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    const/4 p5, 0x5

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {p0, v2, p5, v1}, Ll/ܽܽܳ;->ۙ(III)Landroid/graphics/drawable/GradientDrawable;

    move-result-object p5

    const/4 v1, 0x0

    invoke-direct {p2, p3, v1, p5}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 97
    new-instance p2, Ll/ܺܽܳ;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p4}, Ll/ܺܽܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p0, p6}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p3

    invoke-direct {p0, p6}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p4

    invoke-direct {p2, p3, p4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method private ۙ(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/Runnable;)V
    .locals 5

    const/16 v0, 0x11

    .line 69
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v0, 0x4

    .line 70
    invoke-direct {p0, v0}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v1

    const/4 v2, 0x7

    invoke-direct {p0, v2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v3

    invoke-direct {p0, v0}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v0

    invoke-direct {p0, v2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v2

    invoke-virtual {p2, v1, v3, v0, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 71
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    const v1, 0x3340c4ff

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    const v2, -0xcdc4ba

    const/4 v3, 0x5

    const/4 v4, 0x0

    .line 72
    invoke-virtual {p0, v2, v3, v4}, Ll/ܽܽܳ;->ۙ(III)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 71
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 73
    new-instance v0, Ll/᩻ܽܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p3}, Ll/᩻ܽܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v0, -0x2

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p3, v4, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/4 v0, 0x2

    .line 75
    invoke-direct {p0, v0}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v1

    invoke-direct {p0, v0}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v2

    invoke-direct {p0, v0}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v3

    invoke-direct {p0, v0}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v0

    invoke-virtual {p3, v1, v2, v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 76
    invoke-virtual {p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public final ۙ(III)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 120
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 121
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 122
    invoke-direct {p0, p2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    .line 123
    invoke-direct {p0, p1}, Ll/ܽܽܳ;->ۙ(I)I

    move-result p1

    invoke-virtual {v0, p1, p3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_0
    return-object v0
.end method

.method public final ۙ(Ll/֫ܶܳ;)Landroid/view/View;
    .locals 4

    .line 113
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v1, -0xbcb4ab

    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 115
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, 0x1

    invoke-direct {p0, v2}, Ll/ܽܽܳ;->ۙ(I)I

    move-result v2

    const/4 v3, -0x1

    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;I)Landroid/widget/ImageView;
    .locals 7

    const/16 v6, 0x20

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    .line 86
    invoke-direct/range {v0 .. v6}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;II)Landroid/widget/ImageView;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Landroid/widget/LinearLayout;Ljava/lang/Runnable;Z)Landroid/widget/ImageView;
    .locals 7

    const v5, -0x4e443b

    const/16 v6, 0x20

    const v2, 0x7f08013f

    const v3, 0x7f120b08

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 86
    invoke-direct/range {v0 .. v6}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;II)Landroid/widget/ImageView;

    move-result-object p1

    .line 105
    new-instance p2, Landroid/content/res/ColorStateList;

    const/4 v0, 0x0

    new-array v1, v0, [I

    const/4 v2, 0x2

    new-array v2, v2, [[I

    const v3, 0x10100a1

    filled-new-array {v3}, [I

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const v0, -0xc74001

    const v1, -0x4e443b

    filled-new-array {v0, v1}, [I

    move-result-object v0

    invoke-direct {p2, v2, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 108
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setSelected(Z)V

    return-object p1
.end method

.method public final ۙ(Landroid/widget/LinearLayout;)Landroid/widget/LinearLayout;
    .locals 4

    .line 39
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v1, 0x10

    .line 40
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 41
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final ۙ(IILjava/lang/String;)Landroid/widget/TextView;
    .locals 2

    .line 31
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 32
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p3, 0x1

    int-to-float p1, p1

    .line 33
    invoke-virtual {v0, p3, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 34
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-object v0
.end method

.method public final ۙ(Landroid/widget/LinearLayout;ILjava/lang/Runnable;)Landroid/widget/TextView;
    .locals 2

    .line 46
    iget-object v0, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0xb

    const v1, -0xe0b09

    invoke-virtual {p0, v0, v1, p2}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/Runnable;)V

    return-object p2
.end method

.method public final ۙ(Landroid/widget/LinearLayout;Ll/ۨۨ᩸;)Ll/ۚܺ;
    .locals 3

    .line 51
    new-instance v0, Ll/ۚܺ;

    iget-object v1, p0, Ll/ܽܽܳ;->ۙ:Landroid/content/Context;

    invoke-direct {v0, v1}, Ll/ۚܺ;-><init>(Landroid/content/Context;)V

    const v1, 0x7f120557

    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/high16 v1, 0x41300000    # 11.0f

    const/4 v2, 0x1

    .line 53
    invoke-virtual {v0, v2, v1}, Ll/ۚܺ;->setTextSize(IF)V

    const v1, -0xe0b09

    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 55
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 57
    invoke-direct {p0, p1, v0, p2}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/Runnable;)V

    .line 58
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/4 p2, 0x2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 60
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p2

    .line 61
    iget v1, p2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iget p2, p2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v1, p2

    .line 62
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result p2

    add-int/2addr p2, v1

    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v1

    add-int/2addr v1, p2

    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 63
    invoke-static {v0, p1}, Ll/ܿۙۙ;->ۙ(Landroid/widget/TextView;I)V

    return-object v0
.end method

.method public final ۙ(Landroid/widget/LinearLayout;Ll/۫ܶܳ;)V
    .locals 7

    const v5, -0x4e443b

    const/16 v6, 0x22

    const v2, 0x7f0801ff

    const v3, 0x7f12077f

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    .line 81
    invoke-direct/range {v0 .. v6}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;IILjava/lang/Runnable;II)Landroid/widget/ImageView;

    return-void
.end method
