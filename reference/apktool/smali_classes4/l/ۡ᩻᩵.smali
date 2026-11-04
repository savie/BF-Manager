.class public final Ll/ۡ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 5

    .line 258
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    .line 259
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    .line 260
    new-array v1, p2, [I

    .line 261
    new-array v2, p2, [I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_0

    .line 263
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result v4

    aput v4, v2, v3

    add-int v4, v0, v3

    .line 264
    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 266
    :cond_0
    new-instance p3, Ll/ᩴܿۗ;

    invoke-direct {p3, p2, v1, v2}, Ll/ᩴܿۗ;-><init>(I[I[I)V

    invoke-virtual {p1, p3}, Ll/ۧ᩻᩵;->ۙ(Ll/ۤܿۗ;)V

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x4

    .line 267
    invoke-virtual {p1, p2}, Ll/ۧ᩻᩵;->᩸(I)V

    return-void
.end method

.method public final ۙ(Ll/ۧ᩻᩵;Ll/ۨܺ᩵;)V
    .locals 2

    .line 272
    invoke-virtual {p2}, Ll/ۨܺ᩵;->ܶ()I

    move-result v0

    mul-int/lit8 v1, v0, 0x4

    add-int/lit8 v1, v1, 0x4

    .line 273
    invoke-virtual {p2, v1}, Ll/ۨܺ᩵;->᩻(I)V

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x4

    .line 274
    invoke-virtual {p1, v0}, Ll/ۧ᩻᩵;->᩸(I)V

    return-void
.end method
