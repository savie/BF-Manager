.class public final Ll/ܶ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 1

    .line 115
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object p1

    const/4 v0, 0x0

    .line 116
    invoke-static {p2}, Ll/ܳܺ᩵;->ۙ(I)I

    move-result p2

    aput p2, p1, v0

    .line 117
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    and-int/lit16 p3, p2, 0xff

    const/4 v0, 0x1

    .line 118
    aput p3, p1, v0

    const/4 p3, 0x2

    .line 119
    invoke-static {p2}, Ll/ܳܺ᩵;->ۙ(I)I

    move-result p2

    aput p2, p1, p3

    return-void
.end method
