.class public final Ll/᩹᩵ܺ;
.super Ll/۫֨ܺ;
.source "QB8X"


# virtual methods
.method public final ۙ(ILl/۬֡ܺ;)V
    .locals 1

    .line 61
    instance-of v0, p2, Ll/ۢ۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/֨۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ܶ۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ۘ۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ܽ۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/ۧ۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/᩶۟ܺ;

    if-nez v0, :cond_1

    instance-of v0, p2, Ll/۟۟ܺ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 72
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "bad type for bootstrap argument: "

    .line 0
    invoke-static {p1, v0}, Ll/᩻ۢ᩹;->ۙ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 72
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 69
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Ll/۫֨ܺ;->ۙ(ILjava/lang/Object;)V

    return-void
.end method
