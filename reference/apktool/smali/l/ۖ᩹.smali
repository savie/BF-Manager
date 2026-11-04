.class public final Ll/ۖ᩹;
.super Ljava/lang/Object;
.source "T58S"


# static fields
.field public static ۫ܽۗ:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֡ۗ۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/String;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۗۖܿ(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public static ۙ(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 0

    .line 111
    invoke-static {p0}, Landroid/os/Handler;->createAsync(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static ۛۡᩴ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static ۜۚܳ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ll/᩺ۜ᩸;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->۠ۙ()I

    move-result p0

    return p0
.end method

.method public static ۠ۗۘ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static ۢۛ۫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳ֫ܺ;
    .locals 0

    check-cast p0, Ll/ᩳ֫ܺ;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ۨۤ᩺(Ljava/lang/Object;)Ll/ۡܰ᩸;
    .locals 0

    check-cast p0, Ll/ۜܽ᩸;

    invoke-virtual {p0}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object p0

    return-object p0
.end method

.method public static ܳܰܰ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public static ܳܽ֫(I)Ll/᩸۠ۧ;
    .locals 0

    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    move-result-object p0

    return-object p0
.end method

.method public static ܿۚ֨(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    return p0
.end method

.method public static ᩳۨ֨([SIII)Ljava/lang/String;
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

.method public static ᩳ᩶ۖ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    return p0
.end method

.method public static ᩷ܰܽ(JJ)J
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll/ᩳܳܳ;->᩸(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static ᩷᩸۫()Z
    .locals 1

    invoke-static {}, Ll/ᩳۡ᩻;->ܶ()Z

    move-result v0

    return v0
.end method

.method public static ᩷᩹ۖ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/lang/Thread;

    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static ᩺ۚۤ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/io/DataInputStream;

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p0

    return p0
.end method
