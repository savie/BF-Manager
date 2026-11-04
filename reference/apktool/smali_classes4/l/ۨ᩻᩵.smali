.class public final Ll/ۨ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 3

    .line 157
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 158
    invoke-static {p2}, Ll/ܳܺ᩵;->᩷(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 159
    invoke-static {p2}, Ll/ܳܺ᩵;->ۤ(I)I

    move-result p2

    aput p2, v0, v1

    .line 160
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    invoke-virtual {p1, p2}, Ll/ۧ᩻᩵;->ۤ(I)V

    const-wide/16 p2, 0x0

    .line 161
    invoke-virtual {p1, p2, p3}, Ll/ۧ᩻᩵;->ۙ(J)V

    return-void
.end method
