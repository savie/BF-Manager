.class public final Ll/ܺ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 3

    .line 94
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 95
    invoke-static {p2}, Ll/ܳܺ᩵;->ۙ(I)I

    move-result v2

    aput v2, v0, v1

    .line 97
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۧ()I

    move-result p3

    int-to-long v0, p3

    and-int/lit16 p2, p2, 0xff

    const/16 p3, 0x15

    if-ne p2, p3, :cond_0

    const/16 p2, 0x10

    goto :goto_0

    :cond_0
    const/16 p2, 0x30

    :goto_0
    shl-long p2, v0, p2

    .line 99
    invoke-virtual {p1, p2, p3}, Ll/ۧ᩻᩵;->ۙ(J)V

    return-void
.end method
