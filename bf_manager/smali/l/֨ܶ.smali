.class public final Ll/֨ܶ;
.super Ljava/lang/Object;
.source "K51P"


# static fields
.field public static ۛۛۛ:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֡ܰۛ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ܺۨۡ;

    invoke-interface {p0}, Ll/ܺۨۡ;->getType()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֨ۖۜ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/Enum;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    return p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;IILandroid/widget/TextView;Landroid/text/TextPaint;Ll/ۜܶ;)Landroid/text/StaticLayout;
    .locals 2

    const/4 v0, 0x0

    .line 854
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 853
    invoke-static {p0, v0, v1, p5, p2}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    move-result-object p0

    .line 856
    invoke-virtual {p0, p1}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 858
    invoke-virtual {p4}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result p2

    .line 859
    invoke-virtual {p4}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result p5

    .line 857
    invoke-virtual {p1, p2, p5}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 860
    invoke-virtual {p4}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 861
    invoke-virtual {p4}, Landroid/widget/TextView;->getBreakStrategy()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    .line 862
    invoke-virtual {p4}, Landroid/widget/TextView;->getHyphenationFrequency()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    move-result-object p1

    const/4 p2, -0x1

    if-ne p3, p2, :cond_0

    const p3, 0x7fffffff

    .line 863
    :cond_0
    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setMaxLines(I)Landroid/text/StaticLayout$Builder;

    .line 868
    :try_start_0
    invoke-virtual {p6, p0, p4}, Ll/ۜܶ;->ۙ(Landroid/text/StaticLayout$Builder;Landroid/widget/TextView;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 873
    :catch_0
    invoke-virtual {p0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ᩺ۢ(Ljava/lang/Object;)Ll/۫᩻֨;
    .locals 0

    check-cast p0, Ljava/lang/Exception;

    invoke-static {p0}, Ll/ܶۗ֨;->ۙ(Ljava/lang/Exception;)Ll/۫᩻֨;

    move-result-object p0

    return-object p0
.end method

.method public static ۚۛۢ(I)Ll/ܺۡۜ;
    .locals 0

    invoke-static {p0}, Ll/ܺۡۜ;->ۙ(I)Ll/ܺۡۜ;

    move-result-object p0

    return-object p0
.end method

.method public static ۛۤ᩺(I)V
    .locals 0

    invoke-static {p0}, Ll/ܺۡۜ;->ܰ(I)V

    return-void
.end method

.method public static ۛ᩵᩺(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۟ܰ᩻(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p0, p1}, Ll/֡ᩳۨ;->ܰ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۡۚܿ(Ljava/lang/Object;Ljava/lang/Object;)Ll/᩷۠ۚ;
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/᩷۠ۚ;->ۖ(Ljava/lang/String;)Ll/᩷۠ۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۢ֡᩷([SIII)Ljava/lang/String;
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

.method public static ۨ۟ۜ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/᩻۬ۨ;

    invoke-virtual {p0}, Ll/᩻۬ۨ;->ۖ()I

    move-result p0

    return p0
.end method

.method public static ۬ܳ᩻(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩵ۡۜ;

    invoke-virtual {p0}, Ll/᩵ۡۜ;->dismiss()V

    return-void
.end method

.method public static ۬ܽۛ()I
    .locals 1

    const v0, 0x4706a04e

    return v0
.end method

.method public static ܳۛܽ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/view/ViewGroup;

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public static ܽۖۘ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/widget/CompoundButton;

    check-cast p1, Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p0, p1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public static ܽ۟ܿ(Ljava/lang/Object;Ljava/lang/Object;Z)Z
    .locals 0

    check-cast p0, Ll/ۛۧ᩺;

    check-cast p1, Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Ll/ۛۧ᩺;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method public static ᩸᩻ۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p0, Landroid/content/Intent;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method
