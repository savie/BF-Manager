.class public final Ll/ۗ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 3

    .line 137
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->᩷()[I

    move-result-object v0

    const/4 v1, 0x0

    .line 138
    invoke-static {p2}, Ll/ܳܺ᩵;->᩷(I)I

    move-result v2

    aput v2, v0, v1

    const/4 v1, 0x1

    .line 139
    invoke-static {p2}, Ll/ܳܺ᩵;->ۤ(I)I

    move-result p2

    aput p2, v0, v1

    .line 140
    invoke-virtual {p1}, Ll/ۧ᩻᩵;->getOffset()I

    move-result p2

    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۧ()I

    move-result p3

    add-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ۧ᩻᩵;->ۚ(I)V

    return-void
.end method
