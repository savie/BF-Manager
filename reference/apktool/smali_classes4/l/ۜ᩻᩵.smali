.class public final Ll/ۜ᩻᩵;
.super Ll/ܳܺ᩵;
.source "Y6HM"


# virtual methods
.method public final ۙ(Ll/ۧ᩻᩵;ILl/ۨܺ᩵;)V
    .locals 8

    .line 305
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܶ()I

    move-result p2

    .line 306
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p2, :cond_4

    if-eq p2, v4, :cond_3

    if-eq p2, v2, :cond_2

    if-eq p2, v1, :cond_1

    const/16 v5, 0x8

    if-ne p2, v5, :cond_0

    .line 333
    new-array v5, v0, [J

    :goto_0
    if-ge v3, v0, :cond_5

    .line 335
    invoke-virtual {p3}, Ll/ۨܺ᩵;->֫()J

    move-result-wide v6

    aput-wide v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 345
    :cond_0
    new-instance p1, Ll/۬ۧ᩵;

    const-string p3, "Unexpected element size in FILL_ARRAY_DATA_PAYLOAD: "

    .line 0
    invoke-static {p2, p3}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 345
    throw p1

    .line 325
    :cond_1
    new-array v5, v0, [I

    :goto_1
    if-ge v3, v0, :cond_5

    .line 327
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۚ()I

    move-result v6

    aput v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 317
    :cond_2
    new-array v5, v0, [S

    :goto_2
    if-ge v3, v0, :cond_5

    .line 319
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ۧ()I

    move-result v6

    int-to-short v6, v6

    aput-short v6, v5, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 310
    :cond_3
    invoke-virtual {p3, v0}, Ll/ۨܺ᩵;->֫(I)[B

    move-result-object v5

    .line 311
    rem-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_5

    .line 312
    invoke-virtual {p3}, Ll/ۨܺ᩵;->ܽ()I

    goto :goto_3

    :cond_4
    new-array v5, v3, [B

    :cond_5
    :goto_3
    mul-int p3, v0, p2

    add-int/2addr p3, v4

    .line 347
    div-int/2addr p3, v2

    add-int/2addr p3, v1

    invoke-virtual {p1, p3}, Ll/ۧ᩻᩵;->᩸(I)V

    .line 348
    new-instance p3, Ll/ۚܺ᩵;

    invoke-direct {p3, v0, p2, v5}, Ll/ۚܺ᩵;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, p3}, Ll/ۧ᩻᩵;->ۙ(Ll/ۤܿۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ۧ᩻᩵;Ll/ۨܺ᩵;)V
    .locals 4

    .line 353
    invoke-virtual {p2}, Ll/ۨܺ᩵;->ܶ()I

    move-result v0

    .line 354
    invoke-virtual {p2}, Ll/ۨܺ᩵;->ۚ()I

    move-result v1

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 356
    rem-int/lit8 v3, v1, 0x2

    add-int/2addr v3, v1

    invoke-virtual {p2, v3}, Ll/ۨܺ᩵;->᩻(I)V

    goto :goto_0

    :cond_0
    mul-int v3, v1, v0

    .line 358
    invoke-virtual {p2, v3}, Ll/ۨܺ᩵;->᩻(I)V

    :goto_0
    mul-int v1, v1, v0

    add-int/2addr v1, v2

    .line 360
    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x4

    invoke-virtual {p1, v1}, Ll/ۧ᩻᩵;->᩸(I)V

    return-void
.end method
