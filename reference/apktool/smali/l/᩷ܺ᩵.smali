.class public final Ll/᩷ܺ᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 0

    .line 45
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->getOffset()I

    move-result p3

    shr-int/lit8 p2, p2, 0x8

    int-to-byte p2, p2

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ۧ᩻᩵;->ۚ(I)V

    return-void
.end method
