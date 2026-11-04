.class public final Ll/ܽۨۨ;
.super Ll/۫᩵ۨ;
.source "O7II"


# virtual methods
.method public final ۧ()Ll/ܶۨۨ;
    .locals 3

    .line 91
    new-instance v0, Ll/ܶۨۨ;

    .line 173
    invoke-virtual {p0}, Ll/۫᩵ۨ;->۫()I

    move-result v1

    .line 184
    invoke-direct {v0}, Ll/ܳۨۨ;-><init>()V

    if-ltz v1, :cond_0

    .line 188
    invoke-virtual {v0, v1}, Ll/ܳۨۨ;->ۙ(I)V

    return-object v0

    .line 186
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Negative initial size: "

    .line 0
    invoke-static {v1, v2}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 186
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
