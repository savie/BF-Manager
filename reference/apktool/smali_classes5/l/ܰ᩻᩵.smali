.class public final Ll/ܰ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 2

    .line 186
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 187
    invoke-static {p2}, Ll/ܳܺ᩵;->ۙ(I)I

    move-result p2

    aput p2, v0, v1

    .line 188
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result p2

    int-to-long p2, p2

    invoke-virtual {p1, p2, p3}, Ll/ۧ᩻᩵;->ۙ(J)V

    return-void
.end method
