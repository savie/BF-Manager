.class public Ll/᩹ۖ᩸;
.super Ll/᩺ۜ᩸;
.source "R98O"


# static fields
.field public static final ۙܳ:Ll/۫ۚܺ;

.field public static final synthetic ۬ᩴ:I


# instance fields
.field public ֡ᩴ:I

.field public final ֨ᩴ:Landroid/graphics/Rect;

.field public ۖᩴ:Z

.field public ۗᩴ:I

.field public final ۘᩴ:Landroid/graphics/Rect;

.field public ۛᩴ:Landroid/text/method/NumberKeyListener;

.field public ۜᩴ:Z

.field public ۟ᩴ:I

.field public final ۠ᩴ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

.field public ۡᩴ:Z

.field public ۢᩴ:Z

.field public ۨᩴ:I

.field public ܰᩴ:I

.field public final ܶᩴ:Ljava/lang/Runnable;

.field public ܺᩴ:[Landroid/text/InputFilter;

.field public ܽᩴ:I

.field public ܿᩴ:I

.field public ᩳᩴ:J

.field public ᩵ᩴ:Ljava/lang/Runnable;

.field public ᩶ᩴ:I

.field public ᩹ᩴ:Z

.field public ᩺ᩴ:I

.field public ᩻ᩴ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 63
    new-instance v0, Ll/۫ۚܺ;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Ll/۫ۚܺ;-><init>(II)V

    sput-object v0, Ll/᩹ۖ᩸;->ۙܳ:Ll/۫ۚܺ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 345
    invoke-direct {p0, p1, v0}, Ll/᩺ۜ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->᩹ᩴ:Z

    .line 59
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->ۡᩴ:Z

    const/4 p1, -0x1

    .line 66
    iput p1, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    .line 69
    new-instance v1, Ll/ۧۖ᩸;

    invoke-direct {v1, p0}, Ll/ۧۖ᩸;-><init>(Ll/᩹ۖ᩸;)V

    iput-object v1, p0, Ll/᩹ۖ᩸;->ܶᩴ:Ljava/lang/Runnable;

    .line 74
    iput p1, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    .line 76
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/᩹ۖ᩸;->ۘᩴ:Landroid/graphics/Rect;

    .line 77
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Ll/᩹ۖ᩸;->֨ᩴ:Landroid/graphics/Rect;

    .line 79
    new-instance v1, Ll/᩻ۖ᩸;

    invoke-direct {v1, p0}, Ll/᩻ۖ᩸;-><init>(Ll/᩹ۖ᩸;)V

    iput-object v1, p0, Ll/᩹ۖ᩸;->۠ᩴ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    const v1, 0x80001

    .line 477
    iput v1, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    .line 478
    iput p1, p0, Ll/᩹ۖ᩸;->ۗᩴ:I

    .line 1123
    iput-object v0, p0, Ll/᩹ۖ᩸;->ۛᩴ:Landroid/text/method/NumberKeyListener;

    .line 1124
    sget-object p1, Ll/ۙܿ᩸;->ᩴۙ:[Landroid/text/InputFilter;

    iput-object p1, p0, Ll/᩹ۖ᩸;->ܺᩴ:[Landroid/text/InputFilter;

    .line 83
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ۙ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 87
    invoke-direct {p0, p1, p2}, Ll/᩺ۜ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->᩹ᩴ:Z

    .line 59
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->ۡᩴ:Z

    const/4 p1, -0x1

    .line 66
    iput p1, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    .line 69
    new-instance v0, Ll/ۧۖ᩸;

    invoke-direct {v0, p0}, Ll/ۧۖ᩸;-><init>(Ll/᩹ۖ᩸;)V

    iput-object v0, p0, Ll/᩹ۖ᩸;->ܶᩴ:Ljava/lang/Runnable;

    .line 74
    iput p1, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    .line 76
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩹ۖ᩸;->ۘᩴ:Landroid/graphics/Rect;

    .line 77
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩹ۖ᩸;->֨ᩴ:Landroid/graphics/Rect;

    .line 79
    new-instance v0, Ll/᩻ۖ᩸;

    invoke-direct {v0, p0}, Ll/᩻ۖ᩸;-><init>(Ll/᩹ۖ᩸;)V

    iput-object v0, p0, Ll/᩹ۖ᩸;->۠ᩴ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    const v0, 0x80001

    .line 477
    iput v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    .line 478
    iput p1, p0, Ll/᩹ۖ᩸;->ۗᩴ:I

    const/4 p1, 0x0

    .line 1123
    iput-object p1, p0, Ll/᩹ۖ᩸;->ۛᩴ:Landroid/text/method/NumberKeyListener;

    .line 1124
    sget-object p1, Ll/ۙܿ᩸;->ᩴۙ:[Landroid/text/InputFilter;

    iput-object p1, p0, Ll/᩹ۖ᩸;->ܺᩴ:[Landroid/text/InputFilter;

    .line 88
    invoke-direct {p0, p2}, Ll/᩹ۖ᩸;->ۙ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2, p3}, Ll/᩺ۜ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 58
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->᩹ᩴ:Z

    .line 59
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->ۡᩴ:Z

    const/4 p1, -0x1

    .line 66
    iput p1, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    .line 69
    new-instance p3, Ll/ۧۖ᩸;

    invoke-direct {p3, p0}, Ll/ۧۖ᩸;-><init>(Ll/᩹ۖ᩸;)V

    iput-object p3, p0, Ll/᩹ۖ᩸;->ܶᩴ:Ljava/lang/Runnable;

    .line 74
    iput p1, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    .line 76
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Ll/᩹ۖ᩸;->ۘᩴ:Landroid/graphics/Rect;

    .line 77
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Ll/᩹ۖ᩸;->֨ᩴ:Landroid/graphics/Rect;

    .line 79
    new-instance p3, Ll/᩻ۖ᩸;

    invoke-direct {p3, p0}, Ll/᩻ۖ᩸;-><init>(Ll/᩹ۖ᩸;)V

    iput-object p3, p0, Ll/᩹ۖ᩸;->۠ᩴ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    const p3, 0x80001

    .line 477
    iput p3, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    .line 478
    iput p1, p0, Ll/᩹ۖ᩸;->ۗᩴ:I

    const/4 p1, 0x0

    .line 1123
    iput-object p1, p0, Ll/᩹ۖ᩸;->ۛᩴ:Landroid/text/method/NumberKeyListener;

    .line 1124
    sget-object p1, Ll/ۙܿ᩸;->ᩴۙ:[Landroid/text/InputFilter;

    iput-object p1, p0, Ll/᩹ۖ᩸;->ܺᩴ:[Landroid/text/InputFilter;

    .line 93
    invoke-direct {p0, p2}, Ll/᩹ۖ᩸;->ۙ(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ֨᩸()V
    .locals 2

    .line 573
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    if-nez v0, :cond_0

    return-void

    .line 574
    :cond_0
    invoke-virtual {v0}, Ll/۬ۡ᩸;->ܰ()V

    .line 575
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v0}, Ll/۬ۡ᩸;->ۤ()V

    .line 576
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 577
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->ۚ(I)I

    move-result v0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩺ۜ᩸;->֫(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/᩺ۜ᩸;->scrollTo(II)V

    const/4 v0, 0x0

    .line 1351
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->ۙ(Z)V

    .line 579
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܽ᩸()V

    .line 580
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 581
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 352
    :cond_0
    new-instance v0, Ll/ܶۖ᩸;

    invoke-direct {v0, p0, p1}, Ll/ܶۖ᩸;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method private ۙ(Landroid/util/AttributeSet;)V
    .locals 8

    .line 149
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܶ᩸()V

    const/4 v0, 0x1

    .line 150
    invoke-virtual {p0, v0}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 151
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹᩸()V

    const/4 v1, 0x0

    .line 152
    invoke-virtual {p0, v1}, Ll/᩺ۜ᩸;->ᩴ(Z)V

    .line 153
    iget-object v2, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v2}, Ll/ۚۚܺ;->ۤ()V

    .line 154
    iput-boolean v1, v2, Ll/ܰۤᩴ;->ۡ᩷:Z

    .line 155
    iput v1, v2, Ll/ܰۤᩴ;->ᩴۙ:I

    .line 156
    iput v1, v2, Ll/ܰۤᩴ;->ۚۙ:I

    .line 157
    iput v1, v2, Ll/ܰۤᩴ;->ᩴۤ:I

    .line 158
    iput v1, v2, Ll/ܰۤᩴ;->᩸ۤ:I

    .line 159
    iput-boolean v1, v2, Ll/ܰۤᩴ;->ۛ᩷:Z

    .line 160
    iput-boolean v1, v2, Ll/ܰۤᩴ;->֨᩷:Z

    .line 161
    iput-boolean v1, v2, Ll/ܰۤᩴ;->ܰۙ:Z

    .line 162
    iput-boolean v1, v2, Ll/ܰۤᩴ;->ۛۙ:Z

    .line 163
    iget v3, v2, Ll/ܰۤᩴ;->֫ۙ:I

    iput v3, v2, Ll/ܰۤᩴ;->ܽۙ:I

    .line 164
    iput v1, v2, Ll/ܰۤᩴ;->ܶۙ:I

    .line 165
    iget v3, v2, Ll/ܰۤᩴ;->۟᩷:F

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iput v3, v2, Ll/ܰۤᩴ;->۟᩷:F

    .line 166
    iput-boolean v0, v2, Ll/ܰۤᩴ;->᩺ۙ:Z

    .line 167
    iput-boolean v1, v2, Ll/ܰۤᩴ;->᩵ۙ:Z

    .line 168
    iput-boolean v1, v2, Ll/ܰۤᩴ;->ۖ᩷:Z

    .line 169
    iput-boolean v0, v2, Ll/ܰۤᩴ;->ۖۙ:Z

    .line 170
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_1

    sget v3, Ll/ۗ۬᩸;->֫:I

    .line 456
    sget-object v3, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const-string v4, "edit_show_ascii_control"

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    .line 170
    :goto_1
    invoke-virtual {v2, v3}, Ll/ۚۚܺ;->ۤ(Z)V

    .line 171
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_3

    sget v3, Ll/ۗ۬᩸;->֫:I

    .line 460
    sget-object v3, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    const-string v4, "edit_show_unicode_special"

    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v3, 0x1

    .line 171
    :goto_3
    invoke-virtual {v2, v3}, Ll/ۚۚܺ;->᩸(Z)V

    .line 172
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-static {}, Ll/ۗۡ֫;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_4

    const v3, -0x55777778

    .line 173
    iput v3, v2, Ll/ܰۤᩴ;->֡᩷:I

    .line 175
    :cond_4
    iget v3, v2, Ll/ܰۤᩴ;->ۨ᩷:I

    .line 176
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v4, v4, v5

    float-to-int v4, v4

    shl-int/lit8 v4, v4, 0x18

    const v5, 0xffffff

    and-int/2addr v3, v5

    or-int/2addr v3, v4

    .line 177
    iput v3, v2, Ll/ܰۤᩴ;->ۨ᩷:I

    .line 179
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Ll/ۗ᩷ۧ;->᩷:[I

    invoke-virtual {v2, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v2, 0x5

    const/4 v3, -0x1

    .line 180
    invoke-virtual {p1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/4 v4, 0x4

    .line 181
    invoke-virtual {p1, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    const/4 v5, 0x6

    .line 182
    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    if-ne v2, v3, :cond_5

    move v6, v4

    goto :goto_4

    :cond_5
    move v6, v2

    :goto_4
    if-ne v5, v3, :cond_6

    move v7, v2

    goto :goto_5

    :cond_6
    move v7, v5

    :goto_5
    if-ne v6, v3, :cond_7

    const v6, 0x7fffffff

    :cond_7
    if-ne v7, v3, :cond_8

    const/4 v7, 0x0

    .line 193
    :cond_8
    iput v6, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    .line 194
    iput v7, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    const/4 v6, 0x7

    .line 197
    invoke-virtual {p1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 198
    invoke-virtual {p1, v6, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->ۘ(Z)V

    goto :goto_7

    :cond_9
    if-gt v2, v0, :cond_a

    if-gt v5, v0, :cond_a

    if-gt v4, v0, :cond_a

    const/4 v2, 0x1

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    .line 200
    :goto_6
    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->ۘ(Z)V

    :goto_7
    const/16 v2, 0xb

    .line 202
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 203
    invoke-virtual {p0, v0}, Ll/᩹ۖ᩸;->ۗ(I)V

    :cond_b
    const/high16 v2, -0x40800000    # -1.0f

    .line 205
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    const/4 v4, 0x0

    cmpl-float v4, v2, v4

    if-lez v4, :cond_c

    .line 207
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->᩷(F)V

    goto :goto_8

    :cond_c
    const/high16 v2, 0x41900000    # 18.0f

    .line 209
    invoke-virtual {p0, v2}, Ll/᩺ۜ᩸;->ۤ(F)V

    :goto_8
    const/4 v2, 0x3

    .line 211
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->᩸(Ljava/lang/String;)V

    const/4 v2, 0x2

    .line 212
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-super {p0, v4}, Ll/᩺ۜ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 213
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    if-nez v4, :cond_d

    const/16 v4, 0xc

    .line 214
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_d

    .line 215
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_d

    .line 2119
    invoke-virtual {p0, v4, v0}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/String;Z)V

    :cond_d
    const/16 v4, 0xd

    .line 220
    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    invoke-virtual {p0, v4}, Ll/᩹ۖ᩸;->ۢ(I)V

    const/16 v4, 0xa

    .line 221
    invoke-virtual {p1, v4, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    if-eq v4, v3, :cond_e

    .line 223
    invoke-virtual {p0, v4}, Ll/᩹ۖ᩸;->ܿ(I)V

    :cond_e
    const/16 v4, 0x9

    .line 226
    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x8

    .line 227
    invoke-virtual {p1, v5, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    if-nez v4, :cond_f

    if-ltz v3, :cond_12

    .line 229
    :cond_f
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v4, :cond_10

    .line 230
    invoke-static {v4}, Landroid/text/method/DigitsKeyListener;->getInstance(Ljava/lang/String;)Landroid/text/method/DigitsKeyListener;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    if-ltz v3, :cond_11

    .line 231
    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    new-array v2, v1, [Landroid/text/InputFilter;

    .line 232
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/text/InputFilter;

    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    .line 233
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 235
    :cond_12
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Ll/᩹ۖ᩸;->ܽᩴ:I

    .line 236
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 238
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-nez p1, :cond_13

    .line 239
    invoke-static {}, Ll/ۗ۬᩸;->᩹()Z

    :cond_13
    return-void
.end method

.method public static ۙ(Ll/᩹ۖ᩸;)V
    .locals 3

    .line 283
    iget-object v0, p0, Ll/᩹ۖ᩸;->ۘᩴ:Landroid/graphics/Rect;

    iget-object v1, p0, Ll/᩹ۖ᩸;->֨ᩴ:Landroid/graphics/Rect;

    invoke-virtual {p0}, Ll/᩹ۖ᩸;->᩸᩸()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x0

    .line 285
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->᩶(Z)V

    goto :goto_0

    .line 288
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 289
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 291
    :cond_2
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 292
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 294
    invoke-virtual {v1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 295
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_3
    :goto_0
    return-void
.end method

.method public static ۡ(I)Z
    .locals 3

    and-int/lit8 v0, p0, 0xf

    and-int/lit16 p0, p0, 0xff0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/16 v1, 0x10

    if-eq p0, v1, :cond_1

    :cond_0
    if-ne v0, v2, :cond_2

    const/16 v0, 0x80

    if-eq p0, v0, :cond_1

    const/16 v0, 0xe0

    if-eq p0, v0, :cond_1

    const/16 v0, 0x90

    if-ne p0, v0, :cond_2

    :cond_1
    return v2

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private ۢ᩸()V
    .locals 2

    .line 841
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    if-eqz v0, :cond_2

    iget v0, p0, Ll/᩹ۖ᩸;->ܽᩴ:I

    if-nez v0, :cond_0

    goto :goto_0

    .line 842
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۤ()V

    .line 843
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->ۚ(I)I

    move-result v0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    invoke-virtual {p0, v1}, Ll/᩺ۜ᩸;->֫(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 844
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    if-ltz v0, :cond_1

    const/4 v0, 0x0

    .line 1351
    invoke-virtual {p0, v0}, Ll/᩺ۜ᩸;->ۙ(Z)V

    .line 845
    :cond_1
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܽ᩸()V

    .line 846
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 847
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    :goto_0
    return-void
.end method

.method private ܰ(Z)V
    .locals 5

    .line 585
    iget-wide v0, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    .line 586
    :cond_0
    iget-object v0, p0, Ll/᩹ۖ᩸;->ܶᩴ:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 587
    :cond_1
    iput-wide v2, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    .line 588
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    if-nez v0, :cond_2

    goto :goto_0

    .line 589
    :cond_2
    invoke-virtual {v0}, Ll/ۚۚܺ;->᩻()Ll/۫ۚܺ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 590
    sget-object v2, Ll/᩹ۖ᩸;->ۙܳ:Ll/۫ۚܺ;

    invoke-virtual {v1, v2}, Ll/۫ۚܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 591
    invoke-virtual {v0, v2}, Ll/ۚۚܺ;->ۙ(Ll/۫ۚܺ;)V

    if-eqz p1, :cond_3

    .line 592
    invoke-direct {p0}, Ll/᩹ۖ᩸;->֨᩸()V

    :cond_3
    :goto_0
    return-void
.end method

.method private ᩳ᩸()Z
    .locals 1

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 565
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۢᩴ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ᩶(Z)V
    .locals 2

    .line 303
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۜᩴ:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 306
    :cond_0
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->ۜᩴ:Z

    .line 307
    iget-object v0, p0, Ll/᩹ۖ᩸;->ۘᩴ:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 308
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 309
    iget-object v1, p0, Ll/᩹ۖ᩸;->۠ᩴ:Landroid/view/ViewTreeObserver$OnPreDrawListener;

    if-eqz p1, :cond_1

    .line 310
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    .line 312
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public static ᩷(Ll/᩹ۖ᩸;)V
    .locals 5

    .line 597
    iget-wide v0, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    .line 598
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getBaseline()I
    .locals 3

    .line 1184
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v0}, Ll/ۚۚܺ;->ۚ()F

    move-result v0

    iget-object v1, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/۬ۡ᩸;->᩷(Z)F

    move-result v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 245
    invoke-super {p0}, Ll/᩺ۜ᩸;->onAttachedToWindow()V

    .line 246
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۚ᩸()V

    .line 247
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۡᩴ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩸()V

    :cond_0
    return-void
.end method

.method public final onCheckIsTextEditor()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    const/4 v0, 0x1

    .line 319
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    const/4 v0, 0x0

    .line 320
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->᩶(Z)V

    .line 321
    invoke-super {p0}, Ll/᩺ۜ᩸;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 597
    iget-wide v0, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    const-wide/16 v2, 0x0

    const/4 v4, 0x1

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    cmp-long v5, v0, v2

    if-ltz v5, :cond_0

    .line 598
    invoke-direct {p0, v4}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 277
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ll/᩹ۖ᩸;->᩸᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-direct {p0, v4}, Ll/᩹ۖ᩸;->᩶(Z)V

    .line 278
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    .line 680
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 681
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/᩺ۜ᩸;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 374
    iget-object p1, p0, Ll/᩹ۖ᩸;->᩵ᩴ:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 711
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    .line 712
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 705
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    .line 706
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setPassword(Z)V

    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 665
    new-instance p2, Landroid/view/KeyEvent;

    invoke-direct {p2, v0, p1}, Landroid/view/KeyEvent;-><init>(II)V

    .line 666
    :cond_0
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    const/16 v1, 0x116

    if-eq p1, v1, :cond_1

    const/16 v1, 0x115

    if-eq p1, v1, :cond_1

    .line 667
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x1f

    if-eq p1, v1, :cond_1

    const/16 v1, 0x34

    if-ne p1, v1, :cond_2

    :cond_1
    return v2

    .line 669
    :cond_2
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    if-eqz v0, :cond_4

    .line 670
    invoke-virtual {p0}, Ll/᩹ۖ᩸;->۫()V

    .line 672
    :cond_4
    :try_start_0
    invoke-super {p0, p1, p2}, Ll/᩺ۜ᩸;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_5

    .line 674
    invoke-virtual {p0}, Ll/᩹ۖ᩸;->ۙۙ()V

    :cond_5
    return p1

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Ll/᩹ۖ᩸;->ۙۙ()V

    .line 675
    :cond_6
    throw p1
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 419
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result p1

    .line 421
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 422
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, -0x1

    if-ne v0, v1, :cond_0

    .line 425
    iput v2, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    goto :goto_3

    :cond_0
    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const p2, 0x7fffffff

    .line 429
    :goto_0
    iget v0, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    iget v1, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    if-eq v0, v1, :cond_3

    .line 430
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int v1, p1, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ll/۬ۡ᩸;->ܳ(I)V

    .line 431
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܽۙ()I

    move-result v0

    iput v0, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    .line 432
    iget v1, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    if-le v0, v1, :cond_2

    :goto_1
    move v0, v1

    goto :goto_2

    .line 434
    :cond_2
    iget v1, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    if-ge v0, v1, :cond_4

    goto :goto_1

    .line 439
    :cond_3
    iput v2, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    :cond_4
    :goto_2
    if-gtz v0, :cond_5

    const/4 v0, 0x1

    :cond_5
    int-to-float v0, v0

    .line 9477
    iget-object v1, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v1}, Ll/ۚۚܺ;->֫()F

    move-result v1

    mul-float v1, v1, v0

    .line 444
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr v1, v0

    float-to-int v0, v1

    add-int/lit8 v0, v0, 0x1

    .line 446
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-le v0, p2, :cond_6

    goto :goto_3

    :cond_6
    move p2, v0

    .line 452
    :goto_3
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .line 717
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-nez v0, :cond_0

    .line 718
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    .line 719
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    if-nez v0, :cond_2

    .line 9745
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v0, v0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 720
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p1

    .line 9745
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v0, v0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    .line 720
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void

    .line 723
    :cond_2
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    const/16 v1, 0x2710

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 724
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    const/16 v3, 0x2022

    .line 725
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 726
    :cond_3
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4

    .line 113
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Landroid/os/Bundle;

    const-string v1, "mt.gravity"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "mt.memory.editor"

    if-nez v2, :cond_0

    .line 114
    invoke-static {v0, v3}, Ll/ۚ᩷ᩴ;->ۙ(Landroid/os/Bundle;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_0
    const-string p1, "parent"

    .line 115
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 116
    iget p1, p0, Ll/᩹ۖ᩸;->ܽᩴ:I

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Ll/᩹ۖ᩸;->ܽᩴ:I

    .line 117
    invoke-static {v0, v3}, Ll/ۚ᩷ᩴ;->ۙ(Landroid/os/Bundle;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 118
    invoke-static {v0, v3}, Ll/ۚ᩷ᩴ;->᩷(Landroid/os/Bundle;Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 544
    :goto_0
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-nez v0, :cond_2

    if-eqz p1, :cond_2

    .line 120
    invoke-static {p1}, Ll/᩵ۚۤ;->᩷([B)Ll/᩵ۚۤ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩹ۖ᩸;->ۙ(Ll/᩵ۚۤ;)V

    .line 121
    :cond_2
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ۢ᩸()V

    return-void

    .line 123
    :cond_3
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 99
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "parent"

    .line 100
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "mt.gravity"

    .line 101
    iget v2, p0, Ll/᩹ۖ᩸;->ܽᩴ:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 544
    iget v1, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v1}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 104
    :cond_0
    new-instance v1, Ll/ۛۚۤ;

    invoke-direct {v1}, Ll/ۛۚۤ;-><init>()V

    const/4 v2, 0x0

    .line 105
    invoke-virtual {p0, v1, v2}, Ll/᩺ۜ᩸;->ۙ(Ll/ۛۚۤ;Z)V

    const-string v2, "mt.memory.editor"

    .line 107
    invoke-virtual {v1}, Ll/ۛۚۤ;->ܽ()[B

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    return-object v0
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    .line 693
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 694
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩺ۜ᩸;->onVisibilityChanged(Landroid/view/View;I)V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    .line 687
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 688
    :cond_0
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->onWindowFocusChanged(Z)V

    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 699
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 700
    :cond_0
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public final setEnabled(Z)V
    .locals 1

    .line 387
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 388
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v0, :cond_2

    .line 391
    iget-object p1, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ll/ܰۤᩴ;->ܿ()V

    .line 392
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 374
    iget-object p1, p0, Ll/᩹ۖ᩸;->᩵ᩴ:Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method

.method public final ֡(I)V
    .locals 0

    .line 857
    iput p1, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    iput p1, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    .line 858
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 859
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final ֡ۤ()V
    .locals 1

    const/4 v0, 0x1

    .line 659
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 660
    invoke-super {p0}, Ll/᩺ۜ᩸;->֡ۤ()V

    return-void
.end method

.method public final ֡᩷()Z
    .locals 1

    .line 365
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->᩹ᩴ:Z

    return v0
.end method

.method public final ֡᩸()V
    .locals 2

    const/4 v0, 0x0

    .line 1142
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/᩹ۖ᩸;->ۧ(II)V

    return-void
.end method

.method public final ֨(I)V
    .locals 1

    .line 906
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 599
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iput-object p1, v0, Ll/ܰۤᩴ;->᩻ۙ:Ljava/lang/Integer;

    .line 600
    invoke-virtual {v0}, Ll/ܰۤᩴ;->ܿ()V

    .line 907
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۗ(I)V
    .locals 1

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 561
    :cond_0
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->ۗ(I)V

    .line 562
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ۢ᩸()V

    return-void
.end method

.method public final ۗۙ()I
    .locals 3

    .line 948
    iget v0, p0, Ll/᩹ۖ᩸;->᩻ᩴ:I

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 953
    instance-of v2, v1, Ll/ܶۖ᩸;

    if-eqz v2, :cond_0

    check-cast v1, Ll/ܶۖ᩸;

    invoke-static {v1}, Ll/ܶۖ᩸;->ۙ(Ll/ܶۖ᩸;)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final ۗۤ()V
    .locals 1

    const/4 v0, 0x0

    .line 634
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    return-void
.end method

.method public final ۗ᩸()V
    .locals 2

    .line 406
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    const/4 v1, 0x0

    iput-boolean v1, v0, Ll/ܰۤᩴ;->ۗۙ:Z

    .line 407
    iget-object v0, p0, Ll/᩺ۜ᩸;->۠:Ll/ܽ֨᩸;

    invoke-virtual {v0}, Ll/ܽ֨᩸;->ܳ()V

    .line 408
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۘ(I)V
    .locals 3

    .line 934
    iget v0, p0, Ll/᩹ۖ᩸;->᩻ᩴ:I

    if-ne v0, p1, :cond_0

    return-void

    .line 935
    :cond_0
    iput p1, p0, Ll/᩹ۖ᩸;->᩻ᩴ:I

    .line 936
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܿۙ()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p1}, Ll/᩺ۜ᩸;->setPadding(IIII)V

    .line 937
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۘ(Z)V
    .locals 3

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 808
    :cond_0
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    if-eq v0, p1, :cond_3

    .line 809
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    .line 852
    invoke-super {p0}, Ll/᩺ۜ᩸;->ܶ()V

    .line 853
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ۢ᩸()V

    .line 811
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    and-int/lit8 v2, v0, 0xf

    if-ne v2, v1, :cond_2

    if-eqz p1, :cond_1

    const p1, -0x20001

    and-int/2addr p1, v0

    .line 813
    iput p1, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    goto :goto_0

    :cond_1
    const/high16 p1, 0x20000

    or-int/2addr p1, v0

    .line 815
    iput p1, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    .line 818
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 819
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۜۤ()V

    :cond_3
    return-void
.end method

.method public final ۘۙ()I
    .locals 1

    .line 768
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    return v0
.end method

.method public final ۘ᩸()Z
    .locals 2

    .line 325
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Ll/ܶۖ᩸;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ܶۖ᩸;

    invoke-static {v0}, Ll/ܶۖ᩸;->᩷(Ll/ܶۖ᩸;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(II)V
    .locals 1

    .line 647
    iget v0, p0, Ll/᩹ۖ᩸;->۟ᩴ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 648
    :cond_0
    invoke-super {p0, p1, p2}, Ll/᩺ۜ᩸;->ۙ(II)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Integer;)V
    .locals 1

    .line 928
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v0, p1}, Ll/ܰۤᩴ;->ۙ(Ljava/lang/Integer;)V

    .line 929
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۙ(Ljava/util/ArrayList;)V
    .locals 2

    .line 732
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->ۙ(Ljava/util/ArrayList;)V

    .line 733
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll/ܺۖ᩸;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺۖ᩸;-><init>(I)V

    invoke-static {p1, v0}, Ll/֨۫ۗ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۙۖ᩸;)V
    .locals 0

    .line 370
    iput-object p1, p0, Ll/᩹ۖ᩸;->᩵ᩴ:Ljava/lang/Runnable;

    return-void
.end method

.method public final ۙ(Ll/᩵ۚۤ;)V
    .locals 1

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 131
    :cond_0
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/᩵ۚۤ;)V

    .line 132
    iget-object p1, p0, Ll/᩹ۖ᩸;->ܺᩴ:[Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    return-void
.end method

.method public final ۙ([Landroid/text/InputFilter;)V
    .locals 4

    if-eqz p1, :cond_1

    .line 1130
    iput-object p1, p0, Ll/᩹ۖ᩸;->ܺᩴ:[Landroid/text/InputFilter;

    .line 1131
    iget-object v0, p0, Ll/᩹ۖ᩸;->ۛᩴ:Landroid/text/method/NumberKeyListener;

    if-nez v0, :cond_0

    .line 1132
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    return-void

    .line 1134
    :cond_0
    array-length v1, p1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    new-array v1, v1, [Landroid/text/InputFilter;

    const/4 v3, 0x0

    .line 1135
    aput-object v0, v1, v3

    .line 1136
    array-length v0, p1

    invoke-static {p1, v3, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1137
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/text/Editable;->setFilters([Landroid/text/InputFilter;)V

    return-void

    .line 1128
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ljava/lang/CharSequence;)Z
    .locals 1

    .line 758
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙۙ()V
    .locals 5

    .line 613
    iget v0, p0, Ll/᩹ۖ᩸;->۟ᩴ:I

    if-eqz v0, :cond_7

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/᩹ۖ᩸;->۟ᩴ:I

    if-eqz v0, :cond_0

    goto/16 :goto_1

    .line 614
    :cond_0
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_7

    iget v0, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    if-ltz v0, :cond_7

    iget v0, p0, Ll/᩹ۖ᩸;->ܿᩴ:I

    if-nez v0, :cond_1

    goto :goto_1

    .line 616
    :cond_1
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 617
    iget v1, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    iget v2, p0, Ll/᩹ۖ᩸;->ܿᩴ:I

    add-int/2addr v1, v2

    .line 618
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-le v1, v2, :cond_2

    goto :goto_1

    .line 619
    :cond_2
    invoke-static {v1, v0}, Ll/֫ۚܺ;->ۙ(ILjava/lang/CharSequence;)I

    move-result v2

    .line 621
    iget v3, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    if-gt v2, v3, :cond_7

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-static {v2, v3, v0}, Ll/֫ۚܺ;->ۙ(IILjava/lang/CharSequence;)I

    move-result v3

    if-eq v3, v1, :cond_3

    goto :goto_1

    :cond_3
    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    .line 623
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 624
    :cond_5
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v0

    if-ne v0, v1, :cond_7

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v0

    if-eq v0, v1, :cond_6

    goto :goto_1

    .line 625
    :cond_6
    new-instance v0, Ll/۫ۚܺ;

    invoke-direct {v0, v2, v1}, Ll/۫ۚܺ;-><init>(II)V

    iget-object v1, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۚۚܺ;->ۙ(Ll/۫ۚܺ;)V

    .line 626
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x5dc

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩹ۖ᩸;->ᩳᩴ:J

    .line 627
    iget-object v0, p0, Ll/᩹ۖ᩸;->ܶᩴ:Ljava/lang/Runnable;

    invoke-virtual {p0, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 628
    invoke-direct {p0}, Ll/᩹ۖ᩸;->֨᩸()V

    :cond_7
    :goto_1
    return-void
.end method

.method public final ۛ(Z)V
    .locals 1

    .line 357
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->᩹ᩴ:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 358
    :cond_0
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->᩹ᩴ:Z

    .line 359
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 360
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ۛۤ()V
    .locals 2

    .line 471
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 472
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 473
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final ۛ᩸()I
    .locals 1

    .line 878
    iget v0, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    return v0
.end method

.method public final ۟(I)V
    .locals 1

    .line 882
    iput p1, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    .line 883
    iget v0, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    if-ge p1, v0, :cond_0

    .line 884
    iput p1, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    .line 886
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 887
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void
.end method

.method public final ۟᩷()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۟᩸()V
    .locals 1

    const/4 v0, 0x0

    .line 252
    iput-boolean v0, p0, Ll/᩹ۖ᩸;->ۡᩴ:Z

    return-void
.end method

.method public ۠᩷()Z
    .locals 1

    .line 1169
    invoke-static {}, Ll/ۗ۬᩸;->ۗ()Z

    move-result v0

    return v0
.end method

.method public final ۡۤ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۢ(I)V
    .locals 2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 337
    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const/4 p1, 0x0

    .line 339
    invoke-virtual {p0, p1, p1, p1, p1}, Ll/᩺ۜ᩸;->setPadding(IIII)V

    return-void

    .line 342
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Ll/ܶۖ᩸;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ܶۖ᩸;

    invoke-static {v0}, Ll/ܶۖ᩸;->᩷(Ll/ܶۖ᩸;)I

    move-result v0

    if-ne v0, p1, :cond_1

    return-void

    .line 347
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩹ۖ᩸;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public ۤ()V
    .locals 4

    .line 137
    invoke-super {p0}, Ll/᩺ۜ᩸;->ۤ()V

    .line 138
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ܰۤᩴ;->ᩴۙ:I

    .line 139
    iput v1, v0, Ll/ܰۤᩴ;->ۚۙ:I

    .line 140
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Ll/ۗۡ֫;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, -0x55777778

    .line 141
    iput v1, v0, Ll/ܰۤᩴ;->֡᩷:I

    .line 143
    :cond_0
    iget v1, v0, Ll/ܰۤᩴ;->ۨ᩷:I

    .line 144
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    float-to-int v2, v2

    shl-int/lit8 v2, v2, 0x18

    const v3, 0xffffff

    and-int/2addr v1, v3

    or-int/2addr v1, v2

    .line 145
    iput v1, v0, Ll/ܰۤᩴ;->ۨ᩷:I

    return-void
.end method

.method public final ۧ(I)V
    .locals 4

    .line 457
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_2

    iget v0, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    iget v1, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    if-eq v0, v1, :cond_2

    .line 458
    iget v2, p0, Ll/᩹ۖ᩸;->᩺ᩴ:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    if-gt v2, v0, :cond_0

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    if-lez v1, :cond_1

    if-lt v2, v1, :cond_1

    if-lt p1, v1, :cond_1

    goto :goto_0

    .line 465
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۧ(II)V
    .locals 0

    .line 1153
    invoke-super {p0, p1, p2}, Ll/᩺ۜ᩸;->ۧ(II)V

    const/4 p1, 0x0

    .line 1695
    invoke-virtual {p0, p1}, Ll/᩺ۜ᩸;->᩷(Z)V

    return-void
.end method

.method public final ۨۙ()F
    .locals 3

    .line 943
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v0}, Ll/۬ۡ᩸;->ۧ()F

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float v1, v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-super {p0}, Ll/᩺ۜ᩸;->ۨۙ()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۨ᩸()I
    .locals 1

    .line 835
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۬ۙ()I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Ll/᩹ۖ᩸;->ܽᩴ:I

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۫()V
    .locals 2

    .line 603
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 604
    :cond_0
    iget v0, p0, Ll/᩹ۖ᩸;->۟ᩴ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/᩹ۖ᩸;->۟ᩴ:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 605
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    const/4 v0, -0x1

    .line 606
    iput v0, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    const/4 v0, 0x0

    .line 607
    iput v0, p0, Ll/᩹ۖ᩸;->ܿᩴ:I

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۫ۤ()Z
    .locals 1

    .line 799
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    return v0
.end method

.method public final ܰ(I)V
    .locals 1

    .line 920
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܰۤᩴ;->ۙ(Ljava/lang/Integer;)V

    .line 921
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܰۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܰ᩸()Z
    .locals 2

    .line 329
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Ll/ܶۖ᩸;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ܶۖ᩸;

    invoke-static {v0}, Ll/ܶۖ᩸;->᩷(Ll/ܶۖ᩸;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܺ(I)V
    .locals 1

    .line 752
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x1020021

    if-eq p1, v0, :cond_0

    const v0, 0x1020020

    if-ne p1, v0, :cond_1

    :cond_0
    return-void

    .line 753
    :cond_1
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->ܺ(I)V

    return-void
.end method

.method public final ܺ᩸()V
    .locals 1

    const/4 v0, 0x1

    .line 653
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 654
    invoke-super {p0}, Ll/᩺ۜ᩸;->ܺ᩸()V

    return-void
.end method

.method public final ܿ(I)V
    .locals 6

    .line 482
    invoke-static {p1}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, -0x20001

    and-int/2addr p1, v0

    .line 483
    :cond_0
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    if-eq v0, p1, :cond_12

    .line 544
    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_2

    .line 484
    invoke-static {p1}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 485
    :goto_1
    invoke-direct {p0, v2}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 486
    iput p1, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    .line 544
    invoke-static {p1}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v3

    if-eqz v3, :cond_3

    and-int/lit8 v3, p1, 0xf

    if-ne v3, v1, :cond_3

    and-int/lit16 v3, p1, 0xff0

    const/16 v4, 0x90

    if-ne v3, v4, :cond_3

    const/4 v3, 0x1

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    .line 487
    :goto_2
    iput-boolean v3, p0, Ll/᩹ۖ᩸;->ۢᩴ:Z

    .line 568
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    sget-object v3, Ll/᩹ۖ᩸;->ۙܳ:Ll/۫ۚܺ;

    goto :goto_3

    :cond_4
    move-object v3, v4

    :goto_3
    iget-object v5, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v5, v3}, Ll/ۚۚܺ;->ۙ(Ll/۫ۚܺ;)V

    .line 544
    iget v3, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v3}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 490
    invoke-super {p0, v2}, Ll/᩺ۜ᩸;->ۗ(I)V

    .line 544
    :cond_5
    iget v2, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v2}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v2

    if-nez v2, :cond_6

    const v2, 0x2000f

    and-int/2addr v2, p1

    const v3, 0x20001

    if-ne v2, v3, :cond_6

    const/4 v2, 0x0

    goto :goto_4

    :cond_6
    const/4 v2, 0x1

    .line 492
    :goto_4
    iget-boolean v3, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    if-eq v3, v2, :cond_7

    .line 493
    iput-boolean v2, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    .line 852
    invoke-super {p0}, Ll/᩺ۜ᩸;->ܶ()V

    .line 853
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ۢ᩸()V

    :cond_7
    and-int/lit8 v2, p1, 0xf

    const/4 v3, 0x2

    if-ne v2, v3, :cond_a

    and-int/lit16 v2, p1, 0x1000

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    :goto_5
    and-int/lit16 p1, p1, 0x2000

    if-eqz p1, :cond_9

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    .line 501
    :goto_6
    invoke-static {v2, v1}, Landroid/text/method/DigitsKeyListener;->getInstance(ZZ)Landroid/text/method/DigitsKeyListener;

    move-result-object v4

    goto :goto_7

    :cond_a
    const/4 v1, 0x4

    if-ne v2, v1, :cond_d

    and-int/lit16 p1, p1, 0xff0

    const/16 v1, 0x10

    if-eq p1, v1, :cond_c

    const/16 v1, 0x20

    if-eq p1, v1, :cond_b

    .line 511
    invoke-static {}, Landroid/text/method/DateTimeKeyListener;->getInstance()Landroid/text/method/DateTimeKeyListener;

    move-result-object v4

    goto :goto_7

    .line 508
    :cond_b
    invoke-static {}, Landroid/text/method/TimeKeyListener;->getInstance()Landroid/text/method/TimeKeyListener;

    move-result-object v4

    goto :goto_7

    .line 505
    :cond_c
    invoke-static {}, Landroid/text/method/DateKeyListener;->getInstance()Landroid/text/method/DateKeyListener;

    move-result-object v4

    goto :goto_7

    :cond_d
    const/4 p1, 0x3

    if-ne v2, p1, :cond_e

    .line 515
    invoke-static {}, Landroid/text/method/DialerKeyListener;->getInstance()Landroid/text/method/DialerKeyListener;

    move-result-object v4

    .line 519
    :cond_e
    :goto_7
    iget-object p1, p0, Ll/᩹ۖ᩸;->ۛᩴ:Landroid/text/method/NumberKeyListener;

    if-eq p1, v4, :cond_f

    .line 520
    iput-object v4, p0, Ll/᩹ۖ᩸;->ۛᩴ:Landroid/text/method/NumberKeyListener;

    .line 521
    iget-object p1, p0, Ll/᩹ۖ᩸;->ܺᩴ:[Landroid/text/InputFilter;

    invoke-virtual {p0, p1}, Ll/᩹ۖ᩸;->ۙ([Landroid/text/InputFilter;)V

    :cond_f
    if-eqz v0, :cond_10

    .line 524
    invoke-direct {p0}, Ll/᩹ۖ᩸;->֨᩸()V

    .line 525
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖ()V

    .line 527
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_11

    .line 528
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۜۤ()V

    .line 374
    :cond_11
    iget-object p1, p0, Ll/᩹ۖ᩸;->᩵ᩴ:Ljava/lang/Runnable;

    if-eqz p1, :cond_12

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_12
    return-void
.end method

.method public final ܿ᩸()Z
    .locals 1

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 546
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۢᩴ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 868
    iput p1, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    .line 869
    iget v0, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    if-le p1, v0, :cond_0

    .line 870
    iput p1, p0, Ll/᩹ۖ᩸;->ܰᩴ:I

    .line 872
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 873
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_1
    return-void
.end method

.method public final ᩴ(II)V
    .locals 1

    .line 639
    iget v0, p0, Ll/᩹ۖ᩸;->۟ᩴ:I

    if-lez v0, :cond_0

    .line 640
    iput p1, p0, Ll/᩹ۖ᩸;->֡ᩴ:I

    .line 641
    iput p2, p0, Ll/᩹ۖ᩸;->ܿᩴ:I

    :cond_0
    return-void
.end method

.method public final ᩴ᩸()Z
    .locals 5

    .line 264
    iget-wide v0, p0, Ll/᩺ۜ᩸;->ܳۤ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result v0

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖۙ()I

    move-result v1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩵ۤ()V
    .locals 2

    const-wide/16 v0, 0x0

    .line 258
    iput-wide v0, p0, Ll/᩺ۜ᩸;->ܳۤ:J

    return-void
.end method

.method public final ᩵᩸()V
    .locals 2

    .line 412
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ܰۤᩴ;->ۗۙ:Z

    .line 413
    iget-object v0, p0, Ll/᩺ۜ᩸;->۠:Ll/ܽ֨᩸;

    invoke-virtual {v0}, Ll/ܽ֨᩸;->ܳ()V

    .line 414
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ᩶(I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/high16 v0, 0x2000000

    or-int/2addr p1, v0

    .line 775
    :cond_0
    iput p1, p0, Ll/᩹ۖ᩸;->ۗᩴ:I

    .line 776
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 777
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۜۤ()V

    :cond_1
    return-void
.end method

.method public final ᩶᩸()Z
    .locals 1

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    return v0
.end method

.method public final ᩷(Ljava/lang/CharSequence;)V
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    .line 900
    :cond_0
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    .line 901
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1, p1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 902
    invoke-virtual {p0, v2}, Ll/᩹ۖ᩸;->᩹(I)V

    return-void
.end method

.method public final ᩷(Ljava/lang/Integer;)V
    .locals 1

    .line 599
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iput-object p1, v0, Ll/ܰۤᩴ;->᩻ۙ:Ljava/lang/Integer;

    .line 600
    invoke-virtual {v0}, Ll/ܰۤᩴ;->ܿ()V

    .line 915
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ᩸(Ljava/lang/String;)V
    .locals 1

    .line 9745
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v0, v0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    .line 379
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 9740
    :cond_0
    iget-object v0, p0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v0, p1}, Ll/۬ۡ᩸;->ۙ(Ljava/lang/String;)V

    .line 9741
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 381
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 374
    iget-object p1, p0, Ll/᩹ۖ᩸;->᩵ᩴ:Ljava/lang/Runnable;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩸᩸()Z
    .locals 2

    .line 270
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    const/16 v1, 0x3e8

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩹(I)V
    .locals 1

    .line 1147
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->᩹(I)V

    const/4 v0, 0x0

    .line 1378
    invoke-virtual {p0, p1, v0}, Ll/᩺ۜ᩸;->ۙ(IZ)Z

    return-void
.end method

.method public final ᩺(Z)V
    .locals 1

    .line 544
    iget v0, p0, Ll/᩹ۖ᩸;->ۨᩴ:I

    invoke-static {v0}, Ll/᩹ۖ᩸;->ۡ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 550
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۢᩴ:Z

    if-ne v0, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 551
    invoke-direct {p0, v0}, Ll/᩹ۖ᩸;->ܰ(Z)V

    .line 552
    iput-boolean p1, p0, Ll/᩹ۖ᩸;->ۢᩴ:Z

    .line 568
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Ll/᩹ۖ᩸;->ۙܳ:Ll/۫ۚܺ;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    invoke-virtual {v0, p1}, Ll/ۚۚܺ;->ۙ(Ll/۫ۚܺ;)V

    .line 554
    invoke-direct {p0}, Ll/᩹ۖ᩸;->֨᩸()V

    .line 555
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ۖ()V

    .line 374
    iget-object p1, p0, Ll/᩹ۖ᩸;->᩵ᩴ:Ljava/lang/Runnable;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final ᩺ۙ()I
    .locals 2

    .line 783
    iget v0, p0, Ll/᩹ۖ᩸;->ۗᩴ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 786
    :cond_0
    iget-boolean v0, p0, Ll/᩹ۖ᩸;->ۖᩴ:Z

    if-eqz v0, :cond_2

    const/16 v0, 0x82

    .line 787
    invoke-virtual {p0, v0}, Landroid/view/View;->focusSearch(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    const v0, 0x2000005

    return v0

    :cond_1
    const v0, 0x2000006

    return v0

    :cond_2
    const v0, 0x2000001

    return v0
.end method

.method public final ᩺᩸()I
    .locals 1

    .line 864
    iget v0, p0, Ll/᩹ۖ᩸;->᩶ᩴ:I

    return v0
.end method

.method public final ᩻(I)V
    .locals 1

    .line 745
    invoke-direct {p0}, Ll/᩹ۖ᩸;->ᩳ᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x104000d

    if-eq p1, v0, :cond_0

    const v0, 0x7f120aef

    if-eq p1, v0, :cond_0

    const v0, 0x104000b

    if-eq p1, v0, :cond_0

    const v0, 0x7f120787

    if-eq p1, v0, :cond_0

    return-void

    .line 747
    :cond_0
    invoke-super {p0, p1}, Ll/᩺ۜ᩸;->᩻(I)V

    return-void
.end method
