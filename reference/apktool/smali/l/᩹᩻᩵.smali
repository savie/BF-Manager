.class public final Ll/᩹᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 2

    .line 126
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 127
    invoke-static {p2}, Ll/ܳܺ᩵;->ۙ(I)I

    move-result p2

    aput p2, v0, v1

    .line 128
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    and-int/lit16 p3, p2, 0xff

    const/4 v1, 0x1

    .line 129
    aput p3, v0, v1

    shr-int/lit8 p2, p2, 0x8

    int-to-byte p2, p2

    int-to-long p2, p2

    .line 130
    invoke-virtual {p1, p2, p3}, Ll/ۧ᩻᩵;->ۙ(J)V

    return-void
.end method
