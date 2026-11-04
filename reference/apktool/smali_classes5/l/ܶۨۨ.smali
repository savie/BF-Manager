.class public final Ll/ܶۨۨ;
.super Ll/ܳۨۨ;
.source "O7II"


# static fields
.field public static final synthetic ᩳ:I


# virtual methods
.method public final size()I
    .locals 1

    .line 201
    iget v0, p0, Ll/ܳۨۨ;->᩶:I

    return v0
.end method

.method public final write([BII)V
    .locals 0

    .line 223
    invoke-static {p2, p3, p1}, Ll/ۙ᩵ۨ;->ۙ(II[B)V

    if-nez p3, :cond_0

    return-void

    .line 227
    :cond_0
    invoke-virtual {p0, p2, p3, p1}, Ll/ܳۨۨ;->ᩴ(II[B)V

    return-void
.end method

.method public final ۙ()[B
    .locals 1

    .line 206
    invoke-virtual {p0}, Ll/ܳۨۨ;->᩷()[B

    move-result-object v0

    return-object v0
.end method
