.class public final Ll/ܶ᩹ܳ;
.super Landroid/widget/LinearLayout;
.source "E6CW"


# instance fields
.field public ֡:I

.field public ֨:Z

.field public ۖ:Z

.field public final ۜ:Landroid/widget/TextView;

.field public ۟:Z

.field public final ۠:Landroid/widget/TextView;

.field public ۡ:Z

.field public final ۢ:Ll/ܽ᩹ܳ;

.field public final ۬:Landroid/widget/TextView;

.field public ܰ:I

.field public ܿ:Z

.field public ᩳ:I

.field public final ᩶:Landroid/graphics/drawable/GradientDrawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    .line 32
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x10

    .line 33
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/4 v1, 0x4

    .line 34
    invoke-direct {p0, v1}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v2

    invoke-direct {p0, v1}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v4, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    const/16 v2, 0x22

    .line 35
    invoke-direct {p0, v2}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 36
    new-instance v2, Ll/ܽܽܳ;

    invoke-direct {v2, p1}, Ll/ܽܽܳ;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x3

    .line 37
    invoke-virtual {v2, v4, v3, v4}, Ll/ܽܽܳ;->ۙ(III)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    iput-object v5, p0, Ll/ܶ᩹ܳ;->᩶:Landroid/graphics/drawable/GradientDrawable;

    .line 39
    new-instance v6, Landroid/graphics/drawable/RippleDrawable;

    const v7, 0x22ffffff

    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v7

    const/4 v8, -0x1

    .line 40
    invoke-virtual {v2, v8, v3, v4}, Ll/ܽܽܳ;->ۙ(III)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v3

    invoke-direct {v6, v7, v5, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 39
    invoke-virtual {p0, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 41
    new-instance v3, Ll/ܽ᩹ܳ;

    invoke-direct {v3, p0, p1}, Ll/ܽ᩹ܳ;-><init>(Ll/ܶ᩹ܳ;Landroid/content/Context;)V

    iput-object v3, p0, Ll/ܶ᩹ܳ;->ۢ:Ll/ܽ᩹ܳ;

    .line 42
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/16 v6, 0x18

    invoke-direct {p0, v6}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v6

    invoke-direct {v5, v6, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 44
    invoke-virtual {v3, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 45
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 46
    invoke-direct {p0, v1}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result p1

    invoke-direct {p0, v1}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v0

    invoke-virtual {v3, v4, p1, v4, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 47
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, -0x2

    invoke-direct {p1, v4, v1, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p0, v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const p1, -0xe0b09

    const/16 v0, 0xb

    const-string v5, ""

    .line 48
    invoke-virtual {v2, v0, p1, v5}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩹ܳ;->۠:Landroid/widget/TextView;

    .line 49
    sget-object v6, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 50
    invoke-virtual {p1}, Landroid/widget/TextView;->setSingleLine()V

    .line 51
    sget-object v7, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 52
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 53
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v8, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, p1, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/16 p1, 0x9

    const v9, -0x4e443b

    .line 54
    invoke-virtual {v2, p1, v9, v5}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩹ܳ;->۬:Landroid/widget/TextView;

    .line 55
    invoke-virtual {p1}, Landroid/widget/TextView;->setSingleLine()V

    .line 56
    invoke-virtual {p1, v7}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 57
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 58
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v8, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x2

    .line 59
    invoke-direct {p0, v1}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v1

    iput v1, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 60
    invoke-virtual {v3, p1, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 61
    invoke-virtual {v2, v0, v9, v5}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object p1

    iput-object p1, p0, Ll/ܶ᩹ܳ;->ۜ:Landroid/widget/TextView;

    .line 62
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v0, 0x800005

    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 64
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    const/16 v0, 0x8

    .line 65
    invoke-direct {p0, v0}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result v0

    invoke-virtual {p1, v0, v4, v4, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 66
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private ۙ(I)I
    .locals 1

    int-to-float p1, p1

    .line 155
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

.method public static bridge synthetic ۙ(Ll/ܶ᩹ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶ᩹ܳ;->ܰ:I

    return p0
.end method

.method public static bridge synthetic ۙ(Ll/ܶ᩹ܳ;I)I
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/ܶ᩹ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶ᩹ܳ;->ۖ:Z

    return p0
.end method

.method public static bridge synthetic ۤ(Ll/ܶ᩹ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶ᩹ܳ;->֡:I

    return p0
.end method

.method public static bridge synthetic ۫(Ll/ܶ᩹ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶ᩹ܳ;->ۡ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ܶ᩹ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶ᩹ܳ;->֨:Z

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/ܶ᩹ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܶ᩹ܳ;->ᩳ:I

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ܶ᩹ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶ᩹ܳ;->ܿ:Z

    return p0
.end method

.method public static bridge synthetic ᩸(Ll/ܶ᩹ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܶ᩹ܳ;->۟:Z

    return p0
.end method


# virtual methods
.method public final ۙ(ILjava/lang/String;Ljava/lang/String;Ll/᩹᩹ܳ;ZLl/ۙܶܳ;Ll/᩷ܶܳ;)V
    .locals 7

    .line 71
    iget-object v0, p4, Ll/᩹᩹ܳ;->᩸:[I

    aget v1, v0, p1

    iput v1, p0, Ll/ܶ᩹ܳ;->֡:I

    .line 72
    iget-object v2, p4, Ll/᩹᩹ܳ;->ۙ:[I

    aget v2, v2, p1

    iput v2, p0, Ll/ܶ᩹ܳ;->ܰ:I

    .line 73
    iget-object v2, p4, Ll/᩹᩹ܳ;->ܳ:[I

    aget v3, v2, p1

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ltz v3, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 74
    :goto_0
    iput-boolean v6, p0, Ll/ܶ᩹ܳ;->֨:Z

    if-eqz v6, :cond_1

    .line 75
    aget v0, v0, v3

    if-le v1, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Ll/ܶ᩹ܳ;->ۡ:Z

    .line 76
    invoke-virtual {p4, p1}, Ll/᩹᩹ܳ;->᩷(I)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܶ᩹ܳ;->ۖ:Z

    add-int/lit8 v0, p1, 0x1

    .line 48
    array-length v1, v2

    if-ge v0, v1, :cond_2

    aget v0, v2, v0

    if-ne v0, p1, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    .line 77
    :goto_2
    iput-boolean v0, p0, Ll/ܶ᩹ܳ;->ܿ:Z

    .line 78
    invoke-virtual {p4, p1}, Ll/᩹᩹ܳ;->ۙ(I)Z

    move-result p4

    xor-int/2addr p4, v4

    iput-boolean p4, p0, Ll/ܶ᩹ܳ;->۟:Z

    if-eqz p5, :cond_3

    const p4, -0xc74001

    goto :goto_3

    :cond_3
    const p4, -0x4e443b

    .line 79
    :goto_3
    iput p4, p0, Ll/ܶ᩹ܳ;->ᩳ:I

    .line 80
    iget-object p4, p0, Ll/ܶ᩹ܳ;->۠:Landroid/widget/TextView;

    invoke-virtual {p4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p4, 0xa0

    .line 82
    invoke-static {p4, p3}, Ll/ᩳۡܶ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p4

    iget-object v0, p0, Ll/ܶ᩹ܳ;->۬:Landroid/widget/TextView;

    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_5

    .line 83
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_4

    :cond_4
    const/4 p3, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/16 p3, 0x8

    :goto_5
    invoke-virtual {v0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 84
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "#"

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Ll/ܶ᩹ܳ;->ۜ:Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    iget p1, p0, Ll/ܶ᩹ܳ;->ᩳ:I

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 86
    invoke-virtual {p0, p5}, Landroid/view/View;->setSelected(Z)V

    if-eqz p5, :cond_6

    const p1, -0xdcb6a8

    goto :goto_6

    :cond_6
    const/4 p1, 0x0

    .line 87
    :goto_6
    iget-object p3, p0, Ll/ܶ᩹ܳ;->᩶:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {p3, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 88
    new-instance p1, Ll/ܳᩳ᩻;

    const/4 p3, 0x4

    invoke-direct {p1, p3, p6}, Ll/ܳᩳ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    iget-object p1, p0, Ll/ܶ᩹ܳ;->ۢ:Ll/ܽ᩹ܳ;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    iget p4, p0, Ll/ܶ᩹ܳ;->֡:I

    mul-int/lit8 p4, p4, 0x10

    add-int/lit8 p4, p4, 0x18

    invoke-direct {p0, p4}, Ll/ܶ᩹ܳ;->ۙ(I)I

    move-result p4

    iput p4, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 90
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 91
    iget-boolean p3, p0, Ll/ܶ᩹ܳ;->ܿ:Z

    const/4 p4, 0x2

    const/4 p5, 0x0

    if-eqz p3, :cond_7

    new-instance p3, Ll/᩻ܽܳ;

    invoke-direct {p3, p4, p7}, Ll/᩻ܽܳ;-><init>(ILjava/lang/Object;)V

    goto :goto_7

    :cond_7
    move-object p3, p5

    :goto_7
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    iget-boolean p3, p0, Ll/ܶ᩹ܳ;->ܿ:Z

    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    .line 94
    iget-boolean p3, p0, Ll/ܶ᩹ܳ;->ܿ:Z

    if-eqz p3, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    iget-boolean p4, p0, Ll/ܶ᩹ܳ;->۟:Z

    if-eqz p4, :cond_8

    const p4, 0x7f1205a1

    goto :goto_8

    :cond_8
    const p4, 0x7f1205a2

    :goto_8
    new-array p5, v4, [Ljava/lang/Object;

    aput-object p2, p5, v5

    invoke-virtual {p3, p4, p5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    :cond_9
    invoke-virtual {p1, p5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 96
    iget-boolean p2, p0, Ll/ܶ᩹ܳ;->ܿ:Z

    if-eqz p2, :cond_a

    goto :goto_9

    :cond_a
    const/4 v5, 0x2

    :goto_9
    invoke-virtual {p1, v5}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 97
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
