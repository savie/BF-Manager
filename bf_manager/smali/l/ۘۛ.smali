.class public final Ll/ۘۛ;
.super Ljava/lang/Object;
.source "G3C1"


# static fields
.field public static ۧᩴ۠:Z


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ۖ֫ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ll/۫᩻֨;
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Ll/۫᩻֨;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/۫᩻֨;

    move-result-object p0

    return-object p0
.end method

.method public static ۖܺ᩹(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Landroid/content/SharedPreferences;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۖ᩸᩶(Ljava/lang/Object;II)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/content/res/Configuration;)Ll/ᩳۛ;
    .locals 2

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 47
    invoke-static {p0}, Ll/۬ۛ;->ۙ(Landroid/content/res/Configuration;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, Ll/ᩳۛ;->ۙ(Landroid/os/LocaleList;)Ll/ᩳۛ;

    move-result-object p0

    return-object p0

    .line 49
    :cond_0
    iget-object p0, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/util/Locale;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {v0}, Ll/ᩳۛ;->ۙ([Ljava/util/Locale;)Ll/ᩳۛ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙᩳ۠(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {p0, p1}, Ll/᩵۟᩺;->ۙ(Lcom/google/android/material/textfield/TextInputLayout;I)V

    return-void
.end method

.method public static ۚ֡ܶ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۗܺۖ;

    invoke-virtual {p0}, Ll/ۗܺۖ;->close()V

    return-void
.end method

.method public static ۚܽۙ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    return p0
.end method

.method public static ۡۛۚ(Ljava/lang/Object;I)Landroid/view/View;
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static ۢۤۜ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܶۜ᩹;

    invoke-virtual {p0}, Ll/ܶۜ᩹;->ۖ()Z

    move-result p0

    return p0
.end method

.method public static ۫֫᩶(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/᩷۠ۚ;

    invoke-virtual {p0}, Ll/᩷۠ۚ;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܰܺ֡(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/os/Bundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ܶܶۜ(Ljava/lang/Object;)Ll/ۗ֫ۖ;
    .locals 0

    check-cast p0, Ll/ۛܳۖ;

    invoke-virtual {p0}, Ll/ۛܳۖ;->ܰܰ()Ll/ۗ֫ۖ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩳ᩻ۚ(Ljava/lang/Object;)Ll/ᩴ֨ۘ;
    .locals 0

    check-cast p0, Ll/ۛۖۘ;

    invoke-static {p0}, Ll/ۛۖۘ;->ܶ(Ll/ۛۖۘ;)Ll/ᩴ֨ۘ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴ֡ܽ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/᩺ۢ᩺;

    invoke-virtual {p0, p1}, Ll/᩺ۢ᩺;->ܰ(I)V

    return-void
.end method

.method public static ᩷ۧ᩹([SIII)Ljava/lang/String;
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

.method public static ᩸֨ܰ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Thread;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static ᩺᩷ܿ()I
    .locals 1

    const v0, 0x9dfc670

    return v0
.end method
