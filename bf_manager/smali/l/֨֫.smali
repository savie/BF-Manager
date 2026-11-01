.class public final Ll/֨֫;
.super Ljava/lang/Object;
.source "W5B8"


# static fields
.field public static ᩸ۜ᩵:Z


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֨ۜ֡(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static ֫ܿ᩸(Ljava/lang/Object;)Ll/֨ᩴ᩺;
    .locals 0

    check-cast p0, Ll/ۖᩴ᩺;

    invoke-virtual {p0}, Ll/ۖᩴ᩺;->ۖ()Ll/֨ᩴ᩺;

    move-result-object p0

    return-object p0
.end method

.method public static ۗ᩹᩶(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/᩺ۖ᩹;

    invoke-virtual {p0}, Ll/᩺ۖ᩹;->ۙ()Z

    move-result p0

    return p0
.end method

.method public static ۙ(Landroid/view/ViewConfiguration;)I
    .locals 0

    .line 315
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHoverSlop()I

    move-result p0

    return p0
.end method

.method public static ۜ᩷᩺(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۗ᩷᩺;

    invoke-virtual {p0}, Ll/ۗ᩷᩺;->ۨ()V

    return-void
.end method

.method public static ۠ۡܶ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܿܿۚ;

    invoke-virtual {p0}, Ll/ܿܿۚ;->᩹()V

    return-void
.end method

.method public static ۡۢ֫(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-static {p0}, Ll/ܽܺۘ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static ܰ(Landroid/view/ViewConfiguration;)Z
    .locals 0

    .line 321
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->shouldShowMenuShortcutsWhenKeyboardPresent()Z

    move-result p0

    return p0
.end method

.method public static ܰ᩸᩵(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/ܿ᩸᩺;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/ܿ᩸᩺;->ۙ(Ljava/lang/String;I)V

    return-void
.end method

.method public static ܶۛۡ(Ljava/lang/Object;)Ll/ܿ᩻᩵;
    .locals 0

    check-cast p0, [B

    invoke-static {p0}, Ll/ܿ᩻᩵;->ۙ([B)Ll/ܿ᩻᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ܶۡܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static ܺܰ۬(II)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static ܺᩴܳ([SIII)Ljava/lang/String;
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

.method public static ܿ֡ۜ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/ۛۨ᩹;

    invoke-virtual {p0}, Ll/ۛۨ᩹;->ܰ()I

    move-result p0

    return p0
.end method

.method public static ܿ۬᩹(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    return p0
.end method

.method public static ᩳۖۘ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    return p0
.end method

.method public static ᩳۜ֨(Ljava/lang/Object;CLjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Ll/ܿۗᩳ;

    invoke-interface {p0, p1, p2}, Ll/ܿۗᩳ;->ۙ(CLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ᩹᩹֡(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۠᩻᩺;

    check-cast p1, Ll/᩸᩻᩺;

    invoke-virtual {p0, p1}, Ll/۠᩻᩺;->ۙ(Ll/᩸᩻᩺;)V

    return-void
.end method
