.class public final synthetic Ll/ۖۙ;
.super Ljava/lang/Object;
.source "U6BF"


# static fields
.field public static ۤۧۤ:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֨ۗ᩸(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ll/ۘᩳ᩻;

    invoke-virtual {p0}, Ll/ۘᩳ᩻;->ۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֨ᩴᩴ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    return-void
.end method

.method public static ۘ᩹ܰ([SIII)Ljava/lang/String;
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

.method public static synthetic ۙ(Ll/ۘ᩷֫;)Landroid/media/session/MediaSession;
    .locals 3

    .line 0
    new-instance v0, Landroid/media/session/MediaSession;

    const-string v1, "MusicService"

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static ۚ᩷᩹(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۖۖۧ;

    check-cast p2, Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p1, p2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    return-void
.end method

.method public static ۡۡᩴ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p0, Landroid/content/Intent;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static ۢܿ۫(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    check-cast p0, Landroid/os/Bundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public static ۢ᩻ۙ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public static ܰܶۙ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/ܺۚۤ;

    invoke-virtual {p0}, Ll/ܺۚۤ;->᩸()I

    move-result p0

    return p0
.end method

.method public static ᩳܿܰ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;
    .locals 0

    check-cast p0, Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩴ֨ۧ()I
    .locals 1

    const v0, -0x6e50aac1

    return v0
.end method

.method public static ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ᩷᩸ۜ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/᩷ۨᩴ;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۡ()V

    return-void
.end method

.method public static ᩸ۨ᩶(F)I
    .locals 0

    invoke-static {p0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result p0

    return p0
.end method

.method public static ᩸᩵۬(Ljava/lang/Object;J)V
    .locals 0

    check-cast p0, Ljava/lang/Runnable;

    invoke-static {p0, p1, p2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static ᩸᩸ۨ(Ljava/lang/Object;I)I
    .locals 0

    check-cast p0, Ll/ۖۤۛ;

    invoke-virtual {p0, p1}, Ll/ۖۤۛ;->ۚ(I)I

    move-result p0

    return p0
.end method

.method public static ᩺۬ܽ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayDeque;

    invoke-virtual {p0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p0

    return p0
.end method
