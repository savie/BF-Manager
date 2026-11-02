.class public final Ll/֫ᩳ;
.super Ljava/lang/Object;
.source "O5HE"


# static fields
.field public static ۬֨᩸:I


# instance fields
.field public final ۙ:Landroid/content/Context;

.field public final ۨ:Landroid/content/res/TypedArray;

.field public ܰ:Landroid/util/TypedValue;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Ll/֫ᩳ;->ۙ:Landroid/content/Context;

    .line 69
    iput-object p2, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    return-void
.end method

.method public static ۖ۬۠(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۠ۡۜ;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Ll/۠ۡۜ;->ۙ(Landroid/view/View;)V

    return-void
.end method

.method public static ۗ۟᩹(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ll/ᩴۗ᩵;

    invoke-virtual {p0}, Ll/ᩴۗ᩵;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/content/Context;I[I)Ll/֫ᩳ;
    .locals 1

    .line 64
    new-instance v0, Ll/֫ᩳ;

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/֫ᩳ;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method public static ۙ(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/֫ᩳ;
    .locals 1

    .line 54
    new-instance v0, Ll/֫ᩳ;

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/֫ᩳ;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method public static ۙ(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/֫ᩳ;
    .locals 1

    .line 59
    new-instance v0, Ll/֫ᩳ;

    .line 60
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ll/֫ᩳ;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method public static ۛ۬ܽ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    return p0
.end method

.method public static ۜ۟ۡ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;
    .locals 0

    check-cast p0, Landroid/animation/ObjectAnimator;

    invoke-virtual {p0, p1, p2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public static ۠ۧۨ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ۤ۟ۧ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/֡ᩳۨ;->ܰ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۧ֫ۤ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/ܽ۬ۨ;

    invoke-interface {p0, p1}, Ll/ܽ۬ۨ;->writeByte(I)V

    return-void
.end method

.method public static ۫᩶ۜ(Ljava/lang/Object;I)Landroid/content/Intent;
    .locals 0

    check-cast p0, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static ܶ᩷᩺(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0
.end method

.method public static ᩳۛᩴ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    move-result p0

    return p0
.end method

.method public static ᩳܺ᩻(Ljava/lang/Object;I)C
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0
.end method

.method public static ᩵ۡ᩻([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩷ܽ᩵(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/io/File;

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result p0

    return p0
.end method

.method public static ᩷ᩴ֫(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public static ᩹ᩳᩴ()Z
    .locals 1

    invoke-static {}, Ll/֫۠᩺;->ᩳ()Z

    move-result v0

    return v0
.end method

.method public static ᩺֨۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Lbin/mt/plugin/api/PluginContext;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֨(I)Ljava/lang/CharSequence;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.method public final ۖ(II)I
    .locals 1

    .line 188
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    return p1
.end method

.method public final ۖ(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 80
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 81
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    .line 83
    iget-object p1, p0, Ll/֫ᩳ;->ۙ:Landroid/content/Context;

    invoke-static {p1, v1}, Ll/ܺ۫᩺;->ۙ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 86
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public final ۖ()Landroid/util/TypedValue;
    .locals 2

    const/16 v0, 0x13

    .line 244
    iget-object v1, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()F
    .locals 3

    const/high16 v0, -0x40800000    # -1.0f

    .line 166
    iget-object v1, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    const/4 v2, 0x4

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    return v0
.end method

.method public final ۙ(I)I
    .locals 2

    const/4 v0, 0x0

    .line 170
    iget-object v1, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    return p1
.end method

.method public final ۙ(II)I
    .locals 1

    .line 196
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    return p1
.end method

.method public final ۙ(IILl/᩷۫;)Landroid/graphics/Typeface;
    .locals 2

    .line 119
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 123
    :cond_0
    iget-object v0, p0, Ll/֫ᩳ;->ܰ:Landroid/util/TypedValue;

    if-nez v0, :cond_1

    .line 124
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/֫ᩳ;->ܰ:Landroid/util/TypedValue;

    .line 126
    :cond_1
    iget-object v0, p0, Ll/֫ᩳ;->ۙ:Landroid/content/Context;

    iget-object v1, p0, Ll/֫ᩳ;->ܰ:Landroid/util/TypedValue;

    invoke-static {v0, p1, v1, p2, p3}, Ll/ܽ۫;->ۙ(Landroid/content/Context;ILandroid/util/TypedValue;ILl/᩷۫;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(IZ)Z
    .locals 1

    .line 158
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    return p1
.end method

.method public final ۚ(II)I
    .locals 1

    .line 208
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result p1

    return p1
.end method

.method public final ۚ(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 90
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 91
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_0

    .line 93
    invoke-static {}, Ll/᩻ۜ;->ܰ()Ll/᩻ۜ;

    move-result-object v0

    iget-object v1, p0, Ll/֫ᩳ;->ۙ:Landroid/content/Context;

    invoke-virtual {v0, v1, p1}, Ll/᩻ۜ;->ܰ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۚ()V
    .locals 1

    .line 252
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final ۨ(I)F
    .locals 2

    const/high16 v0, -0x40800000    # -1.0f

    .line 192
    iget-object v1, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    return p1
.end method

.method public final ۨ(II)I
    .locals 1

    .line 162
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    return p1
.end method

.method public final ۨ()Landroid/content/res/TypedArray;
    .locals 1

    .line 76
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    return-object v0
.end method

.method public final ۬(I)Z
    .locals 1

    .line 240
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    return p1
.end method

.method public final ܰ(II)I
    .locals 1

    .line 200
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    return p1
.end method

.method public final ܰ(I)Landroid/content/res/ColorStateList;
    .locals 3

    .line 174
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    .line 175
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    .line 177
    iget-object v2, p0, Ll/֫ᩳ;->ۙ:Landroid/content/Context;

    .line 46
    invoke-static {v2, v1}, Ll/ۤܽ;->ܰ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    .line 184
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public final ܰ()[Ljava/lang/CharSequence;
    .locals 2

    const/4 v0, 0x0

    .line 220
    iget-object v1, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final ᩹(II)I
    .locals 1

    .line 216
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    return p1
.end method

.method public final ᩹(I)Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Ll/֫ᩳ;->ۨ:Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
