.class public final Ll/۬᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 2

    .line 28
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object p3

    const/4 v0, 0x0

    .line 29
    invoke-static {p2}, Ll/ܳܺ᩵;->᩷(I)I

    move-result v1

    aput v1, p3, v0

    shr-int/lit8 p2, p2, 0xc

    and-int/lit8 p2, p2, 0xf

    shl-int/lit8 p2, p2, 0x1c

    shr-int/lit8 p2, p2, 0x1c

    int-to-long p2, p2

    .line 30
    invoke-virtual {p1, p2, p3}, Ll/ۧ᩻᩵;->ۙ(J)V

    return-void
.end method
