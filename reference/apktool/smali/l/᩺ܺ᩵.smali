.class public final Ll/᩺ܺ᩵;
.super Ljava/lang/Object;
.source "ZIUC"


# direct methods
.method public static ۙ(Ll/ۨܺ᩵;IZI)J
    .locals 9

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move-wide v3, v0

    move-wide v5, v3

    :goto_0
    if-ge v2, p1, :cond_0

    .line 112
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v5

    int-to-long v5, v5

    mul-int/lit8 v7, v2, 0x8

    shl-long v7, v5, v7

    or-long/2addr v3, v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 p0, 0x8

    if-eqz p3, :cond_2

    :goto_1
    if-ge p1, p3, :cond_1

    shl-long/2addr v3, p0

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-wide v3

    :cond_2
    if-eqz p2, :cond_3

    const-wide/16 p2, 0x80

    and-long/2addr p2, v5

    cmp-long v2, p2, v0

    if-eqz v2, :cond_3

    :goto_2
    if-ge p1, p0, :cond_3

    mul-int/lit8 p2, p1, 0x8

    const-wide/16 v0, 0xff

    shl-long p2, v0, p2

    or-long/2addr v3, p2

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_3
    return-wide v3
.end method

.method public static ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ljava/util/ArrayList;
    .locals 4

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    invoke-static {p0}, Ll/᩸֨᩵;->ۙ(Ll/ۨܺ᩵;)I

    move-result v0

    .line 93
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 95
    invoke-static {p0, p1}, Ll/᩺ܺ᩵;->᩷(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ll/ܳ᩶ۗ;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static ᩷(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ll/ܳ᩶ۗ;
    .locals 7

    .line 33
    invoke-virtual {p0}, Ll/ۨܺ᩵;->ܽ()I

    move-result v0

    and-int/lit8 v1, v0, 0x1f

    and-int/lit16 v0, v0, 0xe0

    shr-int/lit8 v0, v0, 0x5

    add-int/lit8 v2, v0, 0x1

    if-eqz v1, :cond_7

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v1, v3, :cond_6

    const/4 v3, 0x2

    if-eq v1, v3, :cond_5

    const/4 v3, 0x3

    if-eq v1, v3, :cond_4

    const/4 v3, 0x4

    if-eq v1, v3, :cond_3

    const/16 v6, 0x10

    if-eq v1, v6, :cond_2

    const/16 v3, 0x11

    if-eq v1, v3, :cond_1

    packed-switch v1, :pswitch_data_0

    .line 87
    new-instance p0, Ll/۬ۧ᩵;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Unknown encoded value type: 0x"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۙۡۙ;->ۙ(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 87
    throw p0

    .line 43
    :pswitch_0
    new-instance p0, Ll/ܳ᩶ۗ;

    sget-object p1, Ll/᩸᩶ۗ;->֡:Ll/᩸᩶ۗ;

    if-ne v0, v5, :cond_0

    const/4 v4, 0x1

    :cond_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p0

    .line 40
    :pswitch_1
    sget-object p0, Ll/ܳ᩶ۗ;->ܿ:Ll/ܳ᩶ۗ;

    return-object p0

    .line 75
    :pswitch_2
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->᩶:Ll/᩸᩶ۗ;

    invoke-static {p0, p1, v4}, Ll/ۛܺ᩵;->ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;Z)Ll/ۚ᩶ۗ;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 72
    :pswitch_3
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->ܿ:Ll/᩸᩶ۗ;

    invoke-static {p0, p1}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;Ll/ۨܺ᩵;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 78
    :pswitch_4
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->۬:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v2

    long-to-int p0, v2

    .line 200
    new-instance v2, Ll/᩵ܺ᩵;

    .line 9
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 201
    invoke-virtual {p1, p0, v2}, Ll/ۨܺ᩵;->ۙ(ILl/᩵ܺ᩵;)V

    .line 78
    invoke-direct {v0, v1, v2}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 69
    :pswitch_5
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->ۡ:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v2

    long-to-int p0, v2

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    new-instance v2, Ll/ܺܺ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܺܺ᩵;-><init>(Ll/ۛܺ᩵;)V

    .line 183
    invoke-virtual {p1, v2, p0}, Ll/ۨܺ᩵;->ۙ(Ll/ܺܺ᩵;I)I

    move-result p0

    .line 184
    invoke-virtual {p1, p0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/ܺܺ᩵;->᩷(Ljava/lang/String;)V

    .line 69
    invoke-direct {v0, v1, v2}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 65
    :pswitch_6
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->ܳۙ:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v2

    long-to-int p0, v2

    .line 65
    invoke-virtual {p1, p0}, Ll/ۨܺ᩵;->۫(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 62
    :pswitch_7
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->ᩴۙ:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v2

    long-to-int p0, v2

    .line 62
    invoke-virtual {p1, p0}, Ll/ۨܺ᩵;->ܳ(I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 84
    :pswitch_8
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->ۙۙ:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v2

    long-to-int p0, v2

    .line 84
    invoke-virtual {p1, p0}, Ll/ۨܺ᩵;->ۤ(I)Ll/۠ܰۗ;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 81
    :pswitch_9
    new-instance v0, Ll/ܳ᩶ۗ;

    sget-object v1, Ll/᩸᩶ۗ;->᩷ۙ:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v2

    long-to-int p0, v2

    .line 81
    invoke-virtual {p1, p0}, Ll/ۨܺ᩵;->ᩴ(I)Ll/ۗܺ᩵;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object v0

    .line 59
    :cond_1
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->ۢ:Ll/᩸᩶ۗ;

    const/16 v1, 0x8

    invoke-static {p0, v2, v4, v1}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    .line 57
    :cond_2
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->ۖ:Ll/᩸᩶ۗ;

    invoke-static {p0, v2, v4, v3}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v1

    long-to-int p0, v1

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    .line 52
    :cond_3
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->۠:Ll/᩸᩶ۗ;

    .line 105
    invoke-static {p0, v2, v5, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v1

    long-to-int p0, v1

    .line 52
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    .line 50
    :cond_4
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->ᩳ:Ll/᩸᩶ۗ;

    .line 101
    invoke-static {p0, v2, v4, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v1

    long-to-int p0, v1

    int-to-char p0, p0

    .line 50
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    .line 48
    :cond_5
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->᩸ۙ:Ll/᩸᩶ۗ;

    .line 105
    invoke-static {p0, v2, v5, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v1

    long-to-int p0, v1

    int-to-short p0, p0

    .line 48
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    .line 54
    :cond_6
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->ۜ:Ll/᩸᩶ۗ;

    .line 105
    invoke-static {p0, v2, v5, v4}, Ll/᩺ܺ᩵;->ۙ(Ll/ۨܺ᩵;IZI)J

    move-result-wide v1

    .line 54
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    .line 45
    :cond_7
    new-instance p1, Ll/ܳ᩶ۗ;

    sget-object v0, Ll/᩸᩶ۗ;->۟:Ll/᩸᩶ۗ;

    invoke-virtual {p0}, Ll/ۨܺ᩵;->۫()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Ll/ܳ᩶ۗ;-><init>(Ll/᩸᩶ۗ;Ljava/lang/Object;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
