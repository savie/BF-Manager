.class public Ll/֫ۖ᩸;
.super Landroid/view/ViewGroup;
.source "T6J6"


# instance fields
.field public ֡:Ljava/lang/CharSequence;

.field public ֡ۙ:Landroid/animation/ValueAnimator;

.field public ֨:Z

.field public ֨ۙ:Z

.field public ֫ۙ:I

.field public ۖ:I

.field public ۖۙ:Landroid/graphics/drawable/Drawable;

.field public ۗۙ:I

.field public final ۘۙ:Landroid/view/GestureDetector;

.field public ۙۙ:Z

.field public ۙ᩷:Ll/۠۬֫;

.field public ۚۙ:Ll/᩸ۡ;

.field public ۛۙ:I

.field public ۜ:Z

.field public final ۜۙ:[I

.field public ۟:Ll/᩹ۖ᩸;

.field public ۟ۙ:Landroid/content/res/ColorStateList;

.field public ۠:Landroid/content/res/ColorStateList;

.field public ۠ۙ:Z

.field public ۡ:Landroid/view/View$OnClickListener;

.field public ۡۙ:Ll/᩸ۡ;

.field public final ۢ:Ll/ۚۖ᩸;

.field public ۢۙ:Z

.field public ۤۙ:Z

.field public ۧۙ:Ljava/lang/CharSequence;

.field public ۨۙ:I

.field public ۫ۙ:F

.field public ۬:Ljava/lang/CharSequence;

.field public ۬ۙ:Z

.field public final ܰ:Landroid/widget/TextView;

.field public ܰۙ:Ll/᩹ۖ᩸;

.field public ܳۙ:I

.field public ܶۙ:Ljava/lang/CharSequence;

.field public ܺۙ:Z

.field public ܽۙ:Landroid/view/ViewGroup$OnHierarchyChangeListener;

.field public ܿ:Landroid/graphics/drawable/Drawable;

.field public final ܿۙ:Landroid/widget/TextView;

.field public ᩳ:I

.field public ᩳۙ:F

.field public ᩴۙ:I

.field public ᩵ۙ:Landroid/graphics/drawable/Drawable;

.field public ᩶:Z

.field public ᩶ۙ:I

.field public final ᩷ۙ:Landroid/widget/ImageView;

.field public final ᩷᩷:Landroid/text/TextWatcher;

.field public ᩸ۙ:Z

.field public ᩹ۙ:Z

.field public final ᩺ۙ:Landroid/graphics/Rect;

.field public ᩻ۙ:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, p1, p2, v0}, Ll/֫ۖ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v1, p1

    .line 128
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v2, 0x0

    .line 65
    iput v2, v0, Ll/֫ۖ᩸;->᩶ۙ:I

    .line 66
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, v0, Ll/֫ۖ᩸;->᩺ۙ:Landroid/graphics/Rect;

    const/4 v3, 0x1

    .line 73
    iput-boolean v3, v0, Ll/֫ۖ᩸;->᩹ۙ:Z

    .line 74
    iput-boolean v3, v0, Ll/֫ۖ᩸;->᩸ۙ:Z

    .line 79
    iput-boolean v3, v0, Ll/֫ۖ᩸;->ۜ:Z

    const/4 v4, 0x4

    new-array v5, v4, [I

    .line 94
    iput-object v5, v0, Ll/֫ۖ᩸;->ۜۙ:[I

    .line 110
    new-instance v5, Ll/᩸ۖ᩸;

    invoke-direct {v5, p0}, Ll/᩸ۖ᩸;-><init>(Ll/֫ۖ᩸;)V

    iput-object v5, v0, Ll/֫ۖ᩸;->᩷᩷:Landroid/text/TextWatcher;

    .line 129
    invoke-virtual {p0, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 130
    invoke-direct {p0}, Ll/֫ۖ᩸;->֫()V

    const v5, 0x101009a

    .line 131
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    .line 126
    invoke-static {v6, v5}, Ll/᩹ۡ֫;->ۙ(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object v5

    .line 131
    iput-object v5, v0, Ll/֫ۖ᩸;->۟ۙ:Landroid/content/res/ColorStateList;

    .line 132
    invoke-virtual {p0, v3}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 133
    new-instance v5, Landroid/view/GestureDetector;

    new-instance v6, Ll/ᩴۖ᩸;

    invoke-direct {v6, p0}, Ll/ᩴۖ᩸;-><init>(Ll/֫ۖ᩸;)V

    invoke-direct {v5, v1, v6}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v5, v0, Ll/֫ۖ᩸;->ۘۙ:Landroid/view/GestureDetector;

    .line 143
    invoke-virtual {v5, v2}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    const/4 v6, 0x0

    .line 144
    invoke-virtual {v5, v6}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 145
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v5, v0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    const v6, 0x7f0a0191

    .line 146
    invoke-virtual {v5, v6}, Landroid/view/View;->setId(I)V

    .line 147
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 149
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 150
    sget-object v6, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 152
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v6

    or-int/lit16 v6, v6, 0x80

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setPaintFlags(I)V

    const v6, 0x800003

    .line 153
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v6, 0x2

    .line 154
    invoke-virtual {v5, v6}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 155
    new-instance v7, Landroid/widget/TextView;

    invoke-direct {v7, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v7, v0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    const v8, 0x7f0a018e

    .line 156
    invoke-virtual {v7, v8}, Landroid/view/View;->setId(I)V

    .line 157
    sget v8, Ll/ۘ۬ܺ;->ۛܽ:I

    invoke-static {v7, v8}, Ll/ܿۙۙ;->ᩴ(Landroid/widget/TextView;I)V

    .line 158
    invoke-virtual {v7, v3}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 159
    new-instance v8, Ll/ۚۖ᩸;

    invoke-direct {v8, p0, v1}, Ll/ۚۖ᩸;-><init>(Ll/֫ۖ᩸;Landroid/content/Context;)V

    iput-object v8, v0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    const v9, 0x7f0a018f

    .line 160
    invoke-virtual {v8, v9}, Landroid/view/View;->setId(I)V

    .line 161
    sget-object v9, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v8, v9}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/16 v10, 0xc

    .line 162
    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v11

    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v12

    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v13

    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v14

    invoke-virtual {v8, v11, v12, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    const v11, 0x7f08007f

    .line 164
    invoke-virtual {v8, v11}, Ll/᩸᩻;->setBackgroundResource(I)V

    .line 165
    invoke-virtual {v8, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 166
    invoke-virtual {v8, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 167
    new-instance v11, Ll/᩷ۖ᩸;

    invoke-direct {v11, p0}, Ll/᩷ۖ᩸;-><init>(Ll/֫ۖ᩸;)V

    invoke-virtual {v8, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    new-instance v11, Landroid/widget/ImageView;

    invoke-direct {v11, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v11, v0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    const v12, 0x7f0a0190

    .line 177
    invoke-virtual {v11, v12}, Landroid/view/View;->setId(I)V

    const v12, 0x7f080136

    .line 178
    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 179
    invoke-virtual {v11, v9}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 180
    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v9

    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v12

    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v13

    invoke-direct {p0, v10}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v10

    invoke-virtual {v11, v9, v12, v13, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 182
    invoke-virtual {v11, v6}, Landroid/view/View;->setImportantForAccessibility(I)V

    new-array v9, v4, [Landroid/view/View;

    aput-object v5, v9, v2

    aput-object v7, v9, v3

    aput-object v8, v9, v6

    const/4 v5, 0x3

    aput-object v11, v9, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_0

    .line 183
    aget-object v8, v9, v7

    .line 184
    invoke-virtual {v8, v2}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 185
    new-instance v10, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v11, -0x2

    invoke-direct {v10, v11, v11}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    invoke-super {p0, v8, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 188
    :cond_0
    sget-object v7, Ll/ۗ᩷ۧ;->ۙ:[I

    move-object/from16 v8, p2

    move/from16 v9, p3

    invoke-virtual {v1, v8, v7, v9, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 189
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    iput-object v7, v0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    const/16 v7, 0x9

    .line 190
    invoke-virtual {v1, v7, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ll/֫ۖ᩸;->᩹ۙ:Z

    const/4 v7, 0x6

    .line 191
    invoke-virtual {v1, v7, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ll/֫ۖ᩸;->᩸ۙ:Z

    .line 192
    invoke-virtual {v1, v4, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, v0, Ll/֫ۖ᩸;->ۖ:I

    .line 193
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, v0, Ll/֫ۖ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    .line 194
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, v0, Ll/֫ۖ᩸;->֡:Ljava/lang/CharSequence;

    const/4 v4, 0x5

    .line 195
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, v0, Ll/֫ۖ᩸;->۠:Landroid/content/res/ColorStateList;

    .line 196
    invoke-virtual {v1, v3, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v0, Ll/֫ۖ᩸;->֨:Z

    const/16 v4, 0xb

    .line 197
    invoke-virtual {v1, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v0, Ll/֫ۖ᩸;->ۤۙ:Z

    const/4 v4, 0x7

    .line 198
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, v0, Ll/֫ۖ᩸;->ۧۙ:Ljava/lang/CharSequence;

    const/16 v4, 0x8

    .line 199
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, v0, Ll/֫ۖ᩸;->᩻ۙ:Landroid/content/res/ColorStateList;

    const/16 v4, 0xa

    .line 200
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    iput-object v4, v0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    .line 201
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 202
    iget v1, v0, Ll/֫ۖ᩸;->ۖ:I

    invoke-static {v1}, Ll/֫ۖ᩸;->ۤ(I)V

    .line 203
    iget-object v1, v0, Ll/֫ۖ᩸;->ۧۙ:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/2addr v1, v3

    iput-boolean v1, v0, Ll/֫ۖ᩸;->ܺۙ:Z

    .line 204
    iget-object v1, v0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/2addr v1, v3

    iput-boolean v1, v0, Ll/֫ۖ᩸;->ۙۙ:Z

    .line 206
    new-instance v1, Ll/ܳۖ᩸;

    invoke-direct {v1, p0}, Ll/ܳۖ᩸;-><init>(Ll/֫ۖ᩸;)V

    invoke-super {p0, v1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 216
    invoke-direct {p0, v2}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 753
    iget-object v0, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 754
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Ll/֫ۖ᩸;->᩶ۙ:I

    invoke-static {v0, v1}, Ll/᩹ۖ᩸;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    .line 755
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 756
    iget-object v0, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ll/֫ۖ᩸;->᩺ۙ:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/֫ۖ᩸;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۚ()Z

    move-result p0

    return p0
.end method

.method private ۙ(IIILandroid/view/View;)V
    .locals 3

    .line 699
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 700
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->resolveLayoutDirection(I)V

    const/high16 v1, 0x40000000    # 2.0f

    .line 701
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {p1, v1, v2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p3, v1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p3, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 702
    invoke-static {p2, p3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    .line 701
    invoke-virtual {p4, p1, p2}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ۖ᩸;)V
    .locals 1

    const/4 v0, 0x1

    .line 266
    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ۖ᩸;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 589
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iput p1, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    .line 590
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۧ()V

    .line 591
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܶ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ۖ᩸;Landroid/view/View;)V
    .locals 3

    .line 168
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 169
    :cond_0
    iget v0, p0, Ll/֫ۖ᩸;->ۖ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 170
    iget-object p0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {p0}, Ll/᩹ۖ᩸;->ܿ᩸()Z

    move-result p1

    xor-int/2addr p1, v1

    invoke-virtual {p0, p1}, Ll/᩹ۖ᩸;->᩺(Z)V

    return-void

    :cond_1
    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    .line 172
    iget-boolean v0, p0, Ll/֫ۖ᩸;->֨:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    move-result v2

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 173
    :cond_2
    iget-object p0, p0, Ll/֫ۖ᩸;->ۡ:Landroid/view/View$OnClickListener;

    if-eqz p0, :cond_3

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)V
    .locals 5

    .line 243
    iput-object p1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    .line 244
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۖ᩸;->ۖۙ:Landroid/graphics/drawable/Drawable;

    .line 245
    iget-object v0, p0, Ll/֫ۖ᩸;->ۜۙ:[I

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 246
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p1}, Ll/᩺ۜ᩸;->ܿۙ()I

    move-result v3

    sub-int/2addr v1, v3

    const/4 v3, 0x1

    aput v1, v0, v3

    .line 247
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    const/4 v3, 0x2

    aput v1, v0, v3

    const/4 v1, 0x3

    .line 248
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    aput v4, v0, v1

    .line 249
    invoke-virtual {p1}, Ll/᩹ۖ᩸;->֡᩷()Z

    move-result v0

    iput-boolean v0, p0, Ll/֫ۖ᩸;->۠ۙ:Z

    .line 251
    iget-boolean v0, p0, Ll/֫ۖ᩸;->᩹ۙ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 9745
    iget-object v0, p1, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v0, v0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    .line 251
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9745
    iget-object v0, p1, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    iget-object v0, v0, Ll/۬ۡ᩸;->᩺:Ljava/lang/String;

    .line 252
    iput-object v0, p0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    const/4 v0, 0x0

    .line 253
    invoke-virtual {p1, v0}, Ll/᩹ۖ᩸;->᩸(Ljava/lang/String;)V

    .line 255
    :cond_0
    invoke-virtual {p1, v3}, Ll/᩹ۖ᩸;->ۢ(I)V

    .line 256
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Ll/᩹ۖ᩸;->setEnabled(Z)V

    .line 257
    :cond_1
    invoke-direct {p0}, Ll/֫ۖ᩸;->᩻()V

    .line 258
    invoke-direct {p0, v2}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method private ۙ(FF)Z
    .locals 2

    .line 496
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 497
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_0

    iget v0, p0, Ll/֫ۖ᩸;->ۨۙ:I

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    .line 498
    invoke-static {p1, p2, v0}, Ll/֫ۖ᩸;->ۙ(FFLandroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    invoke-static {p1, p2, v0}, Ll/֫ۖ᩸;->ۙ(FFLandroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ۙ(FFLandroid/view/View;)Z
    .locals 1

    .line 502
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p0, p0, v0

    if-gez p0, :cond_0

    .line 503
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p0

    int-to-float p0, p0

    cmpl-float p0, p1, p0

    if-ltz p0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p0

    int-to-float p0, p0

    cmpg-float p0, p1, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۙ(Landroid/view/View;)Z
    .locals 1

    .line 239
    iget-object v0, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public static bridge synthetic ۙ(Ll/֫ۖ᩸;FF)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/֫ۖ᩸;->ۙ(FF)Z

    move-result p0

    return p0
.end method

.method private ۙ(Ll/᩹ۖ᩸;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 491
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 492
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static bridge synthetic ۚ(Ll/֫ۖ᩸;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method private ۚ()Z
    .locals 1

    .line 460
    iget-boolean v0, p0, Ll/֫ۖ᩸;->᩹ۙ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ۤ(I)V
    .locals 2

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, -0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 423
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported end icon mode: "

    .line 0
    invoke-static {p0, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 423
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method private ۤ(Z)V
    .locals 8

    .line 507
    iget-object v0, p0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    .line 508
    :cond_0
    iget-object v2, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 509
    :cond_1
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۚ()Z

    move-result v0

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 510
    iget-boolean v0, p0, Ll/֫ۖ᩸;->᩸ۙ:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_3

    .line 511
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v0

    if-lez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-eqz p1, :cond_6

    .line 513
    iget-object v5, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_3
    if-eqz v0, :cond_7

    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_7
    const/4 v6, 0x0

    .line 578
    :goto_4
    iget-boolean v7, p0, Ll/֫ۖ᩸;->᩶:Z

    if-eq v7, v0, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    .line 579
    :goto_5
    iput-boolean v0, p0, Ll/֫ۖ᩸;->᩶:Z

    const/4 v0, 0x0

    if-eqz v5, :cond_b

    .line 580
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-direct {p0}, Ll/֫ۖ᩸;->ۚ()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_6

    :cond_9
    if-eqz v7, :cond_d

    .line 598
    iget-object v5, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    if-eqz v5, :cond_a

    .line 599
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 600
    iput-object v0, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    .line 586
    :cond_a
    iget v0, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    const/4 v5, 0x2

    new-array v5, v5, [F

    aput v0, v5, v4

    aput v6, v5, v2

    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    const-wide/16 v5, 0x96

    .line 587
    invoke-virtual {v0, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 588
    iget-object v0, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    new-instance v5, Ll/ۤۖ᩸;

    invoke-direct {v5, p0}, Ll/ۤۖ᩸;-><init>(Ll/֫ۖ᩸;)V

    invoke-virtual {v0, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 593
    iget-object v0, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    goto :goto_7

    .line 598
    :cond_b
    :goto_6
    iget-object v5, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    if-eqz v5, :cond_c

    .line 599
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 600
    iput-object v0, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    .line 582
    :cond_c
    iput v6, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    .line 583
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۧ()V

    .line 514
    :cond_d
    :goto_7
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܶ()V

    .line 515
    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v1, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    goto :goto_8

    :cond_e
    iget-boolean v0, p0, Ll/֫ۖ᩸;->ܺۙ:Z

    if-eqz v0, :cond_f

    iget-object v0, p0, Ll/֫ۖ᩸;->ۧۙ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_f

    move-object v1, v0

    .line 516
    :cond_f
    :goto_8
    iget-object v0, p0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-static {v5, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_10

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    :cond_10
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_11

    const/16 v1, 0x8

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 518
    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v1

    if-eqz v1, :cond_12

    iget-boolean v1, p0, Ll/֫ۖ᩸;->ۤۙ:Z

    if-eqz v1, :cond_12

    const/4 v1, 0x1

    goto :goto_a

    :cond_12
    const/4 v1, 0x0

    :goto_a
    if-eqz v1, :cond_13

    const/4 v5, 0x0

    goto :goto_b

    :cond_13
    const/16 v5, 0x8

    .line 519
    :goto_b
    iget-object v6, p0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 520
    iget v5, p0, Ll/֫ۖ᩸;->ۖ:I

    if-ne v5, v2, :cond_14

    const/4 v5, 0x1

    goto :goto_c

    :cond_14
    const/4 v5, 0x0

    .line 521
    :goto_c
    iget-object v6, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    if-eqz v5, :cond_19

    .line 522
    iget-boolean v4, p0, Ll/֫ۖ᩸;->۬ۙ:Z

    if-nez v4, :cond_15

    const v4, 0x7f080137

    .line 523
    invoke-virtual {v6, v4}, Ll/᩸᩻;->setImageResource(I)V

    .line 524
    iput-boolean v2, p0, Ll/֫ۖ᩸;->۬ۙ:Z

    .line 526
    :cond_15
    iget-object v4, p0, Ll/֫ۖ᩸;->֡:Ljava/lang/CharSequence;

    if-eqz v4, :cond_16

    goto :goto_d

    .line 527
    :cond_16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v7, 0x7f120cdc

    invoke-virtual {v4, v7}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 526
    :goto_d
    invoke-virtual {v6, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 528
    iget-object v4, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v4, :cond_17

    invoke-virtual {v4}, Ll/᩹ۖ᩸;->ܿ᩸()Z

    move-result v4

    if-eqz v4, :cond_17

    const/4 v4, 0x1

    goto :goto_e

    :cond_17
    const/4 v4, 0x0

    :goto_e
    invoke-virtual {v6, v4}, Landroid/view/View;->setSelected(Z)V

    if-eqz p1, :cond_18

    .line 529
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-nez p1, :cond_1a

    :cond_18
    invoke-virtual {v6}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    goto :goto_f

    .line 531
    :cond_19
    iput-boolean v4, p0, Ll/֫ۖ᩸;->۬ۙ:Z

    .line 532
    iget-object p1, p0, Ll/֫ۖ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6, p1}, Ll/᩸᩻;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 533
    iget-object p1, p0, Ll/֫ۖ᩸;->֡:Ljava/lang/CharSequence;

    invoke-virtual {v6, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1a
    :goto_f
    if-eqz v5, :cond_1b

    .line 535
    iget-object p1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz p1, :cond_1c

    invoke-virtual {p1}, Ll/᩹ۖ᩸;->᩶᩸()Z

    move-result p1

    if-eqz p1, :cond_1c

    goto :goto_10

    .line 536
    :cond_1b
    iget p1, p0, Ll/֫ۖ᩸;->ۖ:I

    const/4 v4, -0x1

    if-ne p1, v4, :cond_1c

    iget-object p1, p0, Ll/֫ۖ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1c

    goto :goto_10

    :cond_1c
    const/4 v2, 0x0

    .line 537
    :goto_10
    iget-boolean p1, p0, Ll/֫ۖ᩸;->ۜ:Z

    if-eqz p1, :cond_1d

    if-eqz v2, :cond_1d

    if-nez v1, :cond_1d

    const/4 p1, 0x0

    goto :goto_11

    :cond_1d
    const/16 p1, 0x8

    :goto_11
    invoke-virtual {v6, p1}, Landroid/view/View;->setVisibility(I)V

    .line 538
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result p1

    invoke-virtual {v6, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 539
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 540
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܽ()V

    .line 541
    iget-object p1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz p1, :cond_1f

    .line 542
    invoke-virtual {p1}, Ll/᩹ۖ᩸;->ܿ᩸()Z

    move-result p1

    .line 543
    iget-boolean v0, p0, Ll/֫ۖ᩸;->ۢۙ:Z

    if-eq v0, p1, :cond_1f

    .line 544
    iput-boolean p1, p0, Ll/֫ۖ᩸;->ۢۙ:Z

    .line 545
    iget-object v0, p0, Ll/֫ۖ᩸;->ۙ᩷:Ll/۠۬֫;

    if-eqz v0, :cond_1f

    iget-object v0, v0, Ll/۠۬֫;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/֫ۖ᩸;

    if-eqz p1, :cond_1e

    goto :goto_12

    :cond_1e
    const/4 v3, 0x0

    .line 66
    :goto_12
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1f
    return-void
.end method

.method public static bridge synthetic ۤ(Ll/֫ۖ᩸;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/֫ۖ᩸;->֨:Z

    return p0
.end method

.method private ۧ()V
    .locals 9

    .line 611
    iget v0, p0, Ll/֫ۖ᩸;->۫ۙ:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/16 v2, 0xc

    int-to-float v2, v2

    .line 804
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v4, v2, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    .line 612
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 614
    iget v2, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v2, v2, v6

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    move v7, v0

    goto :goto_1

    .line 615
    :cond_2
    iget v7, p0, Ll/֫ۖ᩸;->۫ۙ:F

    :goto_1
    iget-object v8, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    invoke-virtual {v8, v3, v7}, Landroid/widget/TextView;->setTextSize(IF)V

    if-eqz v2, :cond_3

    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_2

    .line 616
    :cond_3
    iget v2, p0, Ll/֫ۖ᩸;->۫ۙ:F

    div-float/2addr v0, v2

    sub-float v0, v6, v0

    iget v2, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    mul-float v0, v0, v2

    sub-float v0, v6, v0

    .line 617
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v2

    if-ne v2, v5, :cond_4

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v8, v2}, Landroid/view/View;->setPivotX(F)V

    .line 618
    invoke-virtual {v8, v1}, Landroid/view/View;->setPivotY(F)V

    .line 619
    invoke-virtual {v8, v0}, Landroid/view/View;->setScaleX(F)V

    .line 620
    invoke-virtual {v8, v0}, Landroid/view/View;->setScaleY(F)V

    .line 622
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-nez v0, :cond_5

    .line 623
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iget v1, p0, Ll/֫ۖ᩸;->֫ۙ:I

    add-int/2addr v0, v1

    iget v1, p0, Ll/֫ۖ᩸;->ۛۙ:I

    iget v2, p0, Ll/֫ۖ᩸;->ܳۙ:I

    invoke-static {v1, v2, v4, v0}, Ll/ۛ۬ܳ;->ۙ(IIII)I

    move-result v0

    goto :goto_4

    .line 625
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Ll/᩹ۖ᩸;->getBaseline()I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Ll/֫ۖ᩸;->ᩴۙ:I

    sub-int v0, v1, v0

    .line 627
    :goto_4
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    iget v1, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    sub-float/2addr v6, v1

    mul-float v6, v6, v0

    invoke-virtual {v8, v6}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static ۧ(Ll/֫ۖ᩸;)V
    .locals 8

    const/4 v0, 0x0

    .line 322
    iput-object v0, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    .line 323
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܺ()V

    .line 324
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/᩹ۖ᩸;->ۘ(I)V

    .line 325
    iput v2, p0, Ll/֫ۖ᩸;->ᩳ:I

    .line 326
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    iget-boolean v3, p0, Ll/֫ۖ᩸;->۠ۙ:Z

    invoke-virtual {v1, v3}, Ll/᩹ۖ᩸;->ۛ(Z)V

    .line 327
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    iget-object v3, p0, Ll/֫ۖ᩸;->ۖۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 328
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    iget-object v3, p0, Ll/֫ۖ᩸;->ۜۙ:[I

    aget v4, v3, v2

    const/4 v5, 0x1

    aget v5, v3, v5

    const/4 v6, 0x2

    aget v6, v3, v6

    const/4 v7, 0x3

    aget v3, v3, v7

    invoke-virtual {v1, v4, v5, v6, v3}, Ll/᩺ۜ᩸;->setPadding(IIII)V

    .line 329
    iput-object v0, p0, Ll/֫ۖ᩸;->ۖۙ:Landroid/graphics/drawable/Drawable;

    .line 330
    iput-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    .line 331
    invoke-direct {p0, v2}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public static bridge synthetic ۫(Ll/֫ۖ᩸;)Ljava/lang/CharSequence;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method private ۫()Z
    .locals 1

    .line 461
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private ܳ()I
    .locals 2

    .line 707
    iget v0, p0, Ll/֫ۖ᩸;->᩶ۙ:I

    iget-object v1, p0, Ll/֫ۖ᩸;->᩺ۙ:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_0

    .line 708
    iget v1, v1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܿۙ()I

    move-result v0

    sub-int/2addr v1, v0

    const/4 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_0
    iget v0, v1, Landroid/graphics/Rect;->top:I

    return v0
.end method

.method public static bridge synthetic ܳ(Ll/֫ۖ᩸;)Landroid/view/ViewGroup$OnHierarchyChangeListener;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۖ᩸;->ܽۙ:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    return-object p0
.end method

.method private ܶ()V
    .locals 3

    .line 606
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Ll/֫ۖ᩸;->۠ۙ:Z

    if-eqz v1, :cond_1

    .line 607
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Ll/֫ۖ᩸;->᩶:Z

    if-eqz v1, :cond_1

    iget v1, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 606
    :goto_0
    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->ۛ(Z)V

    :cond_2
    return-void
.end method

.method private ܺ()V
    .locals 3

    .line 310
    iget-boolean v0, p0, Ll/֫ۖ᩸;->֨ۙ:Z

    if-nez v0, :cond_0

    return-void

    .line 311
    :cond_0
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    iget-object v1, p0, Ll/֫ۖ᩸;->᩷᩷:Landroid/text/TextWatcher;

    .line 781
    iget-object v0, v0, Ll/᩺ۜ᩸;->ۙۤ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 312
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->ۙ(Ll/ۙۖ᩸;)V

    .line 313
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-static {v0}, Ll/᩸۠;->᩷(Landroid/view/View;)Ll/᩸ۡ;

    move-result-object v0

    iget-object v2, p0, Ll/֫ۖ᩸;->ۚۙ:Ll/᩸ۡ;

    if-ne v0, v2, :cond_1

    .line 314
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    iget-object v2, p0, Ll/֫ۖ᩸;->ۡۙ:Ll/᩸ۡ;

    invoke-static {v0, v2}, Ll/᩸۠;->ۙ(Landroid/view/View;Ll/᩸ۡ;)V

    .line 316
    :cond_1
    iput-object v1, p0, Ll/֫ۖ᩸;->ۡۙ:Ll/᩸ۡ;

    .line 317
    iput-object v1, p0, Ll/֫ۖ᩸;->ۚۙ:Ll/᩸ۡ;

    const/4 v0, 0x0

    .line 318
    iput-boolean v0, p0, Ll/֫ۖ᩸;->֨ۙ:Z

    return-void
.end method

.method private ܽ()V
    .locals 9

    .line 551
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 552
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x1010038

    .line 126
    invoke-static {v0, v1}, Ll/᩹ۡ֫;->ۙ(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    goto :goto_0

    :cond_0
    sget v0, Ll/ۗۡ֫;->ۚۙ:I

    .line 553
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    sget v1, Ll/ۗۡ֫;->֫ۙ:I

    .line 554
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v0

    goto :goto_2

    :cond_2
    sget v2, Ll/ۗۡ֫;->ۙ:I

    .line 556
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Ll/ܺ۬ܺ;->ۚ᩷:I

    invoke-static {v3, v4}, Ll/۟֡;->ۙ(Landroid/content/Context;I)I

    move-result v3

    .line 557
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v4

    if-nez v4, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v4

    if-eqz v4, :cond_4

    move v2, v3

    goto :goto_3

    .line 462
    :cond_4
    iget-object v4, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    move v2, v0

    .line 559
    :goto_3
    iget-object v4, p0, Ll/֫ۖ᩸;->۟ۙ:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v5

    sget-object v6, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    sget-object v7, Landroid/view/ViewGroup;->ENABLED_STATE_SET:[I

    if-eqz v5, :cond_6

    move-object v5, v7

    goto :goto_4

    :cond_6
    move-object v5, v6

    :goto_4
    iget-object v8, p0, Ll/֫ۖ᩸;->۟ۙ:Landroid/content/res/ColorStateList;

    .line 560
    invoke-virtual {v8}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v8

    .line 559
    invoke-virtual {v4, v5, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v4

    .line 561
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v5

    if-nez v5, :cond_8

    .line 462
    iget-object v5, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Landroid/view/View;->hasFocus()Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    move v2, v4

    .line 561
    :cond_8
    :goto_5
    iget-object v4, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 562
    iget-object v2, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_6

    .line 462
    :cond_9
    iget-object v4, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v4

    if-eqz v4, :cond_a

    .line 563
    sget-object v6, Landroid/view/ViewGroup;->ENABLED_FOCUSED_STATE_SET:[I

    goto :goto_6

    :cond_a
    move-object v6, v7

    .line 562
    :goto_6
    invoke-virtual {v2, v6}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 565
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v2

    if-nez v2, :cond_b

    iget-object v2, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v1, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_7

    .line 566
    :cond_b
    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_7

    .line 567
    :cond_c
    iget-object v2, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 568
    :goto_7
    invoke-virtual {p0}, Ll/֫ۖ᩸;->᩷()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {v3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_9

    .line 569
    :cond_d
    iget-object v2, p0, Ll/֫ۖ᩸;->᩻ۙ:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_e

    move-object v0, v2

    goto :goto_9

    :cond_e
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_8

    :cond_f
    move v0, v1

    :goto_8
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 568
    :goto_9
    iget-object v2, p0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 570
    iget-object v0, p0, Ll/֫ۖ᩸;->۠:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_10

    goto :goto_a

    .line 571
    :cond_10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Ll/ܺ۬ܺ;->ۗ᩷:I

    .line 46
    invoke-static {v0, v2}, Ll/۟֡;->᩷(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 570
    :goto_a
    iget-object v2, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 572
    invoke-direct {p0}, Ll/֫ۖ᩸;->۫()Z

    move-result v0

    if-eqz v0, :cond_11

    move v1, v3

    :cond_11
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iget-object v1, p0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 573
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/֫ۖ᩸;)Ljava/lang/CharSequence;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/֫ۖ᩸;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۙ(Ll/᩹ۖ᩸;)Z

    move-result p0

    return p0
.end method

.method private ᩸(I)I
    .locals 1

    int-to-float p1, p1

    .line 803
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

.method public static bridge synthetic ᩸(Ll/֫ۖ᩸;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/֫ۖ᩸;->ۖ:I

    return p0
.end method

.method private ᩻()V
    .locals 3

    .line 262
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Ll/֫ۖ᩸;->֨ۙ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 263
    iput-boolean v1, p0, Ll/֫ۖ᩸;->֨ۙ:Z

    .line 264
    invoke-virtual {v0}, Ll/᩹ۖ᩸;->ܿ᩸()Z

    move-result v0

    iput-boolean v0, p0, Ll/֫ۖ᩸;->ۢۙ:Z

    .line 265
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    iget-object v1, p0, Ll/֫ۖ᩸;->᩷᩷:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 266
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    new-instance v1, Ll/ۙۖ᩸;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۙۖ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->ۙ(Ll/ۙۖ᩸;)V

    .line 267
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-static {v0}, Ll/᩸۠;->᩷(Landroid/view/View;)Ll/᩸ۡ;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۖ᩸;->ۡۙ:Ll/᩸ۡ;

    if-nez v0, :cond_1

    .line 270
    new-instance v0, Ll/᩸ۡ;

    invoke-direct {v0}, Ll/᩸ۡ;-><init>()V

    .line 271
    :cond_1
    new-instance v1, Ll/۫ۖ᩸;

    invoke-direct {v1, p0, v0}, Ll/۫ۖ᩸;-><init>(Ll/֫ۖ᩸;Ll/᩸ۡ;)V

    iput-object v1, p0, Ll/֫ۖ᩸;->ۚۙ:Ll/᩸ۡ;

    .line 306
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-static {v0, v1}, Ll/᩸۠;->ۙ(Landroid/view/View;Ll/᩸ۡ;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/֫ۖ᩸;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 224
    instance-of v0, p1, Ll/᩹ۖ᩸;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-nez v0, :cond_0

    goto :goto_0

    .line 225
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Only one EditTextView is supported"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 227
    :cond_1
    :goto_0
    instance-of v0, p1, Landroid/widget/EditText;

    if-nez v0, :cond_2

    .line 228
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 227
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Use EditTextView for the input field"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 774
    instance-of p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    return p1
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 799
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    const/4 p1, 0x0

    .line 800
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 769
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 770
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 772
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_0
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final getBaseline()I
    .locals 2

    .line 768
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Ll/᩹ۖ᩸;->getBaseline()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 335
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 336
    invoke-direct {p0}, Ll/֫ۖ᩸;->᩻()V

    .line 455
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0x101009a

    .line 126
    invoke-static {v0, v1}, Ll/᩹ۡ֫;->ۙ(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 455
    iput-object v0, p0, Ll/֫ۖ᩸;->۟ۙ:Landroid/content/res/ColorStateList;

    .line 456
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩹ۖ᩸;->ۤ()V

    :cond_0
    const/4 v0, 0x0

    .line 457
    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .line 348
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 349
    invoke-direct {p0}, Ll/֫ۖ᩸;->֫()V

    .line 350
    iget-object p1, p0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    sget v0, Ll/ۘ۬ܺ;->ۛܽ:I

    invoke-static {p1, v0}, Ll/ܿۙۙ;->ᩴ(Landroid/widget/TextView;I)V

    .line 455
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v0, 0x101009a

    .line 126
    invoke-static {p1, v0}, Ll/᩹ۡ֫;->ۙ(Landroid/content/res/Resources$Theme;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 455
    iput-object p1, p0, Ll/֫ۖ᩸;->۟ۙ:Landroid/content/res/ColorStateList;

    .line 456
    iget-object p1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩹ۖ᩸;->ۤ()V

    :cond_0
    const/4 p1, 0x0

    .line 457
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    .line 352
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    const/4 v0, 0x0

    .line 341
    iput-object v0, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    .line 598
    iget-object v1, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_0

    .line 599
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 600
    iput-object v0, p0, Ll/֫ۖ᩸;->֡ۙ:Landroid/animation/ValueAnimator;

    .line 343
    :cond_0
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܺ()V

    .line 344
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 764
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 765
    iget-object v0, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 712
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p1

    iget-object p2, p0, Ll/֫ۖ᩸;->᩺ۙ:Landroid/graphics/Rect;

    iget p3, p2, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, p3

    .line 713
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p4

    sub-int/2addr p3, p4

    iget p4, p2, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, p4

    .line 714
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    const/4 p5, 0x0

    const/4 v0, 0x1

    if-ne p4, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 715
    iget p4, p0, Ll/֫ۖ᩸;->ۗۙ:I

    add-int/2addr p4, p1

    goto :goto_1

    :cond_1
    move p4, p1

    :goto_1
    if-eqz v0, :cond_2

    move v1, p3

    goto :goto_2

    .line 716
    :cond_2
    iget v1, p0, Ll/֫ۖ᩸;->ۗۙ:I

    sub-int v1, p3, v1

    .line 717
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v3, p0, Ll/֫ۖ᩸;->֫ۙ:I

    add-int/2addr v2, v3

    .line 718
    iget v3, p0, Ll/֫ۖ᩸;->ۛۙ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/֫ۖ᩸;->ۨۙ:I

    .line 720
    iget-object v3, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    iget v6, p0, Ll/֫ۖ᩸;->ۨۙ:I

    invoke-virtual {v3, v4, v2, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 721
    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    const/16 v4, 0x8

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eq v3, v4, :cond_4

    .line 722
    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 723
    iget-object v5, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    iget v6, p0, Ll/֫ۖ᩸;->ᩳ:I

    sub-int/2addr v5, v6

    .line 724
    iget v6, p0, Ll/֫ۖ᩸;->ۛۙ:I

    sub-int/2addr v6, v5

    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v6, v5

    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v6, v5

    invoke-direct {p0}, Ll/֫ۖ᩸;->ܳ()I

    move-result v5

    sub-int/2addr v6, v5

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v6, p2

    .line 725
    iget p2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p2, v2

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v6, p2

    invoke-direct {p0}, Ll/֫ۖ᩸;->ܳ()I

    move-result p2

    add-int/2addr v6, p2

    if-eqz v0, :cond_3

    .line 726
    iget p2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int p2, v1, p2

    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr p2, v3

    goto :goto_3

    :cond_3
    iget p2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p2, p4

    .line 727
    :goto_3
    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    add-int/2addr v5, p2

    iget-object v7, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v3, p2, v6, v5, v7}, Landroid/view/View;->layout(IIII)V

    :cond_4
    if-eqz v0, :cond_5

    .line 729
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p2

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr p2, v3

    iget v3, p0, Ll/֫ۖ᩸;->ۗۙ:I

    sub-int/2addr p2, v3

    .line 730
    :goto_4
    iget v3, p0, Ll/֫ۖ᩸;->ۛۙ:I

    iget-object v5, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    sub-int/2addr v3, v6

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    .line 731
    iget v2, p0, Ll/֫ۖ᩸;->ۗۙ:I

    add-int/2addr v2, p2

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v3

    invoke-virtual {v5, p2, v3, v2, v6}, Landroid/view/View;->layout(IIII)V

    .line 732
    iget v2, p0, Ll/֫ۖ᩸;->ۗۙ:I

    add-int/2addr v2, p2

    iget-object v5, p0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    add-int/2addr v6, v3

    invoke-virtual {v5, p2, v3, v2, v6}, Landroid/view/View;->layout(IIII)V

    .line 733
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, v2

    invoke-virtual {v3, p4, p2, v1, v5}, Landroid/view/View;->layout(IIII)V

    .line 734
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۧ()V

    .line 735
    iget p2, p0, Ll/֫ۖ᩸;->ۨۙ:I

    .line 736
    :goto_5
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p4

    if-ge p5, p4, :cond_9

    .line 737
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    .line 738
    invoke-direct {p0, p4}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_8

    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eq p4, v1, :cond_8

    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-ne v1, v4, :cond_6

    goto :goto_7

    .line 739
    :cond_6
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 740
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p2, v2

    if-eqz v0, :cond_7

    .line 741
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v2, v3

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v2, v3

    goto :goto_6

    .line 742
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v3

    .line 743
    :goto_6
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    add-int/2addr v5, p2

    invoke-virtual {p4, v2, p2, v3, v5}, Landroid/view/View;->layout(IIII)V

    .line 744
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p4, v1

    add-int/2addr p4, p2

    move p2, p4

    :cond_8
    :goto_7
    add-int/lit8 p5, p5, 0x1

    goto :goto_5

    .line 746
    :cond_9
    iget-object p4, p0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p5

    if-nez p5, :cond_a

    .line 747
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p5

    add-int/2addr p5, p2

    invoke-virtual {p4, p1, p2, p3, p5}, Landroid/view/View;->layout(IIII)V

    :cond_a
    return-void
.end method

.method public final onMeasure(II)V
    .locals 13

    .line 631
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v0, p1}, Landroid/view/View;->getDefaultSize(II)I

    move-result v0

    .line 632
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int v1, v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 633
    iget-object v3, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    iget-object v5, p0, Ll/֫ۖ᩸;->᩷ۙ:Landroid/widget/ImageView;

    const/16 v6, 0x30

    if-eqz v4, :cond_1

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-direct {p0, v6}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v4

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v4

    :goto_1
    iput v4, p0, Ll/֫ۖ᩸;->ۗۙ:I

    const/high16 v7, 0x40000000    # 2.0f

    .line 634
    invoke-static {v4, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 635
    invoke-direct {p0, v6}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v6

    invoke-static {v6, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 636
    invoke-virtual {v3, v4, v6}, Landroid/view/View;->measure(II)V

    .line 637
    invoke-virtual {v5, v4, v6}, Landroid/view/View;->measure(II)V

    .line 639
    iget-object v3, p0, Ll/֫ۖ᩸;->᩺ۙ:Landroid/graphics/Rect;

    iget v4, v3, Landroid/graphics/Rect;->left:I

    sub-int v4, v1, v4

    iget v5, v3, Landroid/graphics/Rect;->right:I

    sub-int/2addr v4, v5

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 640
    iget v5, p0, Ll/֫ۖ᩸;->ۗۙ:I

    sub-int v5, v4, v5

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 641
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܳ()I

    move-result v6

    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v6, v3

    .line 642
    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    const/4 v8, 0x2

    if-nez v3, :cond_2

    const/16 v3, 0x12

    int-to-float v3, v3

    .line 804
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    invoke-static {v8, v3, v9}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v3

    goto :goto_2

    .line 642
    :cond_2
    iget-object v3, v3, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget-object v3, v3, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    :goto_2
    iput v3, p0, Ll/֫ۖ᩸;->۫ۙ:F

    .line 643
    invoke-static {v5, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 644
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v9

    .line 645
    iget v10, p0, Ll/֫ۖ᩸;->۫ۙ:F

    iget-object v11, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    invoke-virtual {v11, v2, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 646
    invoke-virtual {v11, v3, v9}, Landroid/view/View;->measure(II)V

    .line 647
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    iput v10, p0, Ll/֫ۖ᩸;->ܳۙ:I

    .line 648
    invoke-virtual {v11}, Landroid/widget/TextView;->getBaseline()I

    move-result v10

    iput v10, p0, Ll/֫ۖ᩸;->ᩴۙ:I

    const/16 v10, 0xc

    int-to-float v10, v10

    .line 804
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    invoke-static {v8, v10, v12}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v8

    .line 650
    iget v10, p0, Ll/֫ۖ᩸;->۫ۙ:F

    div-float/2addr v8, v10

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 651
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۚ()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-virtual {v11}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v12

    invoke-virtual {v12}, Landroid/graphics/Paint;->ascent()F

    move-result v12

    neg-float v12, v12

    mul-float v12, v12, v8

    float-to-int v12, v12

    goto :goto_3

    :cond_3
    const/4 v12, 0x0

    :goto_3
    iput v12, p0, Ll/֫ۖ᩸;->֫ۙ:I

    .line 652
    iget v12, p0, Ll/֫ۖ᩸;->ᩳۙ:F

    cmpl-float v10, v12, v10

    if-nez v10, :cond_4

    .line 653
    iget v10, p0, Ll/֫ۖ᩸;->۫ۙ:F

    mul-float v10, v10, v8

    invoke-virtual {v11, v2, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 654
    invoke-virtual {v11, v3, v9}, Landroid/view/View;->measure(II)V

    :cond_4
    const/4 v3, 0x0

    const/4 v8, 0x0

    .line 657
    :goto_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/16 v10, 0x8

    if-ge v3, v9, :cond_7

    .line 658
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 659
    invoke-direct {p0, v9}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View;)Z

    move-result v11

    if-nez v11, :cond_6

    iget-object v11, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eq v9, v11, :cond_6

    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v11

    if-ne v11, v10, :cond_5

    goto :goto_5

    .line 661
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v10

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v11

    add-int/2addr v11, v10

    iget v10, p0, Ll/֫ۖ᩸;->֫ۙ:I

    add-int/2addr v11, v10

    add-int/2addr v11, v6

    invoke-direct {p0, v1, p2, v11, v9}, Ll/֫ۖ᩸;->ۙ(IIILandroid/view/View;)V

    .line 662
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 663
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    iget v11, v10, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v9, v11

    iget v10, v10, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v9, v10

    add-int/2addr v8, v9

    :cond_6
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 665
    :cond_7
    iget-object v1, p0, Ll/֫ۖ᩸;->ܰ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_8

    .line 666
    invoke-static {v4, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/view/View;->measure(II)V

    .line 667
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    add-int/2addr v8, v1

    .line 670
    :cond_8
    iget v1, p0, Ll/֫ۖ᩸;->ۗۙ:I

    if-gtz v1, :cond_a

    iget v1, p0, Ll/֫ۖ᩸;->ۖ:I

    if-eqz v1, :cond_9

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    goto :goto_7

    :cond_a
    :goto_6
    const/16 v1, 0x30

    invoke-direct {p0, v1}, Ll/֫ۖ᩸;->᩸(I)I

    move-result v1

    :goto_7
    iput v1, p0, Ll/֫ۖ᩸;->ۛۙ:I

    .line 671
    iput v2, p0, Ll/֫ۖ᩸;->ᩳ:I

    .line 672
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v1, :cond_b

    invoke-virtual {v1, v2}, Ll/᩹ۖ᩸;->ۘ(I)V

    .line 673
    :cond_b
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v10, :cond_c

    .line 674
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    .line 675
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, p0, Ll/֫ۖ᩸;->֫ۙ:I

    invoke-static {v4, v3, v8, v6}, Ll/᩺᩸ۚ;->ۙ(IIII)I

    move-result v3

    .line 674
    invoke-direct {p0, v5, p2, v3, v1}, Ll/֫ۖ᩸;->ۙ(IIILandroid/view/View;)V

    .line 676
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 678
    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 679
    iget v4, p0, Ll/֫ۖ᩸;->ۛۙ:I

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v3, v5

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v3, v1

    add-int/2addr v3, v6

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/֫ۖ᩸;->ۛۙ:I

    .line 682
    :cond_c
    invoke-direct {p0}, Ll/֫ۖ᩸;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_d

    iget-boolean v1, p0, Ll/֫ۖ᩸;->᩸ۙ:Z

    if-eqz v1, :cond_d

    iget v1, p0, Ll/֫ۖ᩸;->ۛۙ:I

    iget v3, p0, Ll/֫ۖ᩸;->ܳۙ:I

    add-int/2addr v3, v6

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/֫ۖ᩸;->ۛۙ:I

    .line 683
    :cond_d
    iget v1, p0, Ll/֫ۖ᩸;->᩶ۙ:I

    if-nez v1, :cond_f

    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eq v1, v10, :cond_f

    .line 684
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 685
    iget-object v3, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 686
    iget v4, p0, Ll/֫ۖ᩸;->ۛۙ:I

    sub-int/2addr v4, v3

    iget v5, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v4, v5

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v4, v1

    sub-int/2addr v4, v6

    .line 688
    div-int/lit8 v5, v4, 0x2

    sub-int/2addr v4, v5

    add-int/2addr v4, v1

    iget-object v1, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    .line 689
    sget v5, Ll/᩹ۖ᩸;->۬ᩴ:I

    .line 953
    invoke-static {v1}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    check-cast v1, Ll/ܶۖ᩸;

    invoke-static {v1}, Ll/ܶۖ᩸;->ۙ(Ll/ܶۖ᩸;)I

    move-result v1

    goto :goto_8

    :cond_e
    const/4 v1, 0x0

    :goto_8
    add-int/2addr v4, v1

    .line 688
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/֫ۖ᩸;->ᩳ:I

    .line 690
    iget-object v2, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v2, v1}, Ll/᩹ۖ᩸;->ۘ(I)V

    .line 691
    iget-object v1, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-static {v2, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    iget v4, p0, Ll/֫ۖ᩸;->ᩳ:I

    add-int/2addr v3, v4

    .line 692
    invoke-static {v3, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 691
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->measure(II)V

    .line 694
    :cond_f
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget v2, p0, Ll/֫ۖ᩸;->֫ۙ:I

    add-int/2addr v1, v2

    iget v2, p0, Ll/֫ۖ᩸;->ۛۙ:I

    add-int/2addr v1, v2

    add-int/2addr v1, v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v1

    .line 695
    invoke-static {v0, p1}, Landroid/view/View;->resolveSize(II)I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v0, p2}, Landroid/view/View;->resolveSize(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 788
    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "parent"

    .line 789
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const-string v0, "error"

    .line 790
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    const-string v0, "errorEnabled"

    .line 791
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/֫ۖ᩸;->ۙۙ:Z

    const-string v0, "helper"

    .line 792
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۖ᩸;->ۧۙ:Ljava/lang/CharSequence;

    const-string v0, "helperEnabled"

    .line 793
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/֫ۖ᩸;->ܺۙ:Z

    const/4 p1, 0x0

    .line 794
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void

    .line 795
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 778
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "parent"

    .line 779
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "error"

    .line 780
    iget-object v2, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v1, "errorEnabled"

    .line 781
    iget-boolean v2, p0, Ll/֫ۖ᩸;->ۙۙ:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "helper"

    .line 782
    iget-object v2, p0, Ll/֫ۖ᩸;->ۧۙ:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const-string v1, "helperEnabled"

    .line 783
    iget-boolean v2, p0, Ll/֫ۖ᩸;->ܺۙ:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 466
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 468
    iget-object v2, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    invoke-direct {p0, v2}, Ll/֫ۖ᩸;->ۙ(Ll/᩹ۖ᩸;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-direct {p0, v2, v3}, Ll/֫ۖ᩸;->ۙ(FF)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 469
    iget-object v2, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    .line 471
    :cond_1
    iget-object v2, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    if-nez v2, :cond_2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 472
    :cond_2
    iget-object v2, p0, Ll/֫ۖ᩸;->ۘۙ:Landroid/view/GestureDetector;

    invoke-virtual {v2, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    if-eq v0, p1, :cond_3

    const/4 v2, 0x3

    if-ne v0, v2, :cond_4

    .line 473
    :cond_3
    iput-object v1, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    :cond_4
    return p1
.end method

.method public final performClick()Z
    .locals 3

    .line 479
    iget-object v0, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    .line 480
    :goto_0
    invoke-super {p0}, Landroid/view/ViewGroup;->performClick()Z

    move-result v1

    .line 481
    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۙ(Ll/᩹ۖ᩸;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 483
    :cond_1
    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۙ(Ll/᩹ۖ᩸;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۖ᩷()Z

    move-result v1

    if-nez v1, :cond_2

    .line 484
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    .line 485
    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final removeAllViews()V
    .locals 2

    .line 233
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 234
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final setEnabled(Z)V
    .locals 1

    .line 447
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V

    if-nez p1, :cond_0

    const/4 v0, 0x0

    .line 448
    iput-object v0, p0, Ll/֫ۖ᩸;->ܰۙ:Ll/᩹ۖ᩸;

    .line 449
    :cond_0
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->setEnabled(Z)V

    .line 450
    :cond_1
    iget-object p1, p0, Ll/֫ۖ᩸;->ܿۙ:Landroid/widget/TextView;

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    :cond_2
    return-void
.end method

.method public final setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
    .locals 0

    .line 220
    iput-object p1, p0, Ll/֫ۖ᩸;->ܽۙ:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    return-void
.end method

.method public final verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 760
    iget-object v0, p0, Ll/֫ۖ᩸;->᩵ۙ:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

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

.method public final ۙ()Ll/᩹ۖ᩸;
    .locals 1

    .line 355
    iget-object v0, p0, Ll/֫ۖ᩸;->۟:Ll/᩹ۖ᩸;

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 428
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/֡ۧۤ;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 430
    :goto_0
    iput-object p1, p0, Ll/֫ۖ᩸;->ܿ:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ۙ(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 410
    iput-object p1, p0, Ll/֫ۖ᩸;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-direct {p0}, Ll/֫ۖ᩸;->ܽ()V

    return-void
.end method

.method public final ۙ(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 433
    iput-object p1, p0, Ll/֫ۖ᩸;->ۡ:Landroid/view/View$OnClickListener;

    return-void
.end method

.method public final ۙ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 435
    iput-object p1, p0, Ll/֫ۖ᩸;->֡:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 436
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 0

    .line 373
    iput-object p1, p0, Ll/֫ۖ᩸;->ܶۙ:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    .line 374
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ۙ(Ll/۠۬֫;)V
    .locals 0

    .line 443
    iput-object p1, p0, Ll/֫ۖ᩸;->ۙ᩷:Ll/۠۬֫;

    return-void
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 431
    iput-boolean p1, p0, Ll/֫ۖ᩸;->ۜ:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ۤ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 399
    iput-object p1, p0, Ll/֫ۖ᩸;->ۧۙ:Ljava/lang/CharSequence;

    .line 400
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Ll/֫ۖ᩸;->ܺۙ:Z

    const/4 p1, 0x0

    .line 401
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ۤ()Z
    .locals 1

    .line 396
    iget-boolean v0, p0, Ll/֫ۖ᩸;->ۙۙ:Z

    return v0
.end method

.method public final ᩴ()V
    .locals 2

    .line 362
    iget v0, p0, Ll/֫ۖ᩸;->᩶ۙ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    .line 363
    :cond_0
    iput v1, p0, Ll/֫ۖ᩸;->᩶ۙ:I

    .line 364
    invoke-direct {p0}, Ll/֫ۖ᩸;->֫()V

    .line 365
    invoke-direct {p0}, Ll/֫ۖ᩸;->ܽ()V

    .line 366
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ᩷(I)V
    .locals 2

    .line 414
    invoke-static {p1}, Ll/֫ۖ᩸;->ۤ(I)V

    .line 415
    iget v0, p0, Ll/֫ۖ᩸;->ۖ:I

    const/4 v1, 0x0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->ۢ:Ll/ۚۖ᩸;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 416
    :cond_0
    iput p1, p0, Ll/֫ۖ᩸;->ۖ:I

    .line 417
    invoke-direct {p0, v1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ᩷(Ljava/lang/CharSequence;)V
    .locals 1

    .line 385
    iput-object p1, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    .line 386
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iput-boolean v0, p0, Ll/֫ۖ᩸;->ۙۙ:Z

    .line 387
    :cond_0
    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ᩷(Z)V
    .locals 0

    .line 392
    iput-boolean p1, p0, Ll/֫ۖ᩸;->ۙۙ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 393
    iput-object p1, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    :cond_0
    const/4 p1, 0x1

    .line 394
    invoke-direct {p0, p1}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 397
    iget-boolean v0, p0, Ll/֫ۖ᩸;->ۙۙ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/֫ۖ᩸;->۬:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸()V
    .locals 1

    const/4 v0, 0x0

    .line 380
    iput-boolean v0, p0, Ll/֫ۖ᩸;->᩸ۙ:Z

    invoke-direct {p0, v0}, Ll/֫ۖ᩸;->ۤ(Z)V

    return-void
.end method
