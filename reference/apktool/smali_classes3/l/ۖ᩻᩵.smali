.class public final Ll/ۖ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 4

    .line 281
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    .line 282
    new-array v0, p2, [I

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_0

    .line 284
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 286
    :cond_0
    new-array v2, p2, [I

    :goto_1
    if-ge v1, p2, :cond_1

    .line 288
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 290
    :cond_1
    new-instance p3, Ll/ᩴܿۗ;

    invoke-direct {p3, p2, v0, v2}, Ll/ᩴܿۗ;-><init>(I[I[I)V

    invoke-virtual {p1, p3}, Ll/ۧ᩻᩵;->ۙ(Ll/ۤܿۗ;)V

    mul-int/lit8 p2, p2, 0x4

    add-int/lit8 p2, p2, 0x2

    .line 291
    invoke-virtual {p1, p2}, Ll/ۧ᩻᩵;->᩸(I)V

    return-void
.end method

.method public final ۙ(Ll/ۧ᩻᩵;Ll/ۨܺ᩵;)V
    .locals 2

    .line 296
    invoke-virtual {p2}, Ll/ۨܺ᩵;->ܶ()I

    move-result v0

    mul-int/lit8 v1, v0, 0x8

    .line 297
    invoke-virtual {p2, v1}, Ll/ۨܺ᩵;->᩻(I)V

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0x2

    .line 298
    invoke-virtual {p1, v0}, Ll/ۧ᩻᩵;->᩸(I)V

    return-void
.end method
