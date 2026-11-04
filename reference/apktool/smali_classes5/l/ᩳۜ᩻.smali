.class public final synthetic Ll/ᩳۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ᩳۜ᩻;->ܰ:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 13

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x3c6d420e

    sget v8, Ll/֡ܳ;->֨ᩳۢ:I

    sget v9, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v10, "\u06dc\u06d7"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x43

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6dff

    const v12, 0x5c1074e

    xor-int/2addr v11, v12

    const v12, 0x45cb16cf

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x1b33

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    const v6, 0x7266748

    .line 87
    sget v10, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v10, :cond_0

    goto/16 :goto_2

    .line 121
    :sswitch_0
    sget-boolean v10, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v10, :cond_5

    goto/16 :goto_1

    :sswitch_1
    sget v10, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v10, :cond_3

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v10, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v10, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    return-void

    :sswitch_5
    xor-int p1, v5, v6

    .line 132
    iput p1, v0, Ll/֫۬᩻;->ᩴ:I

    return-void

    :cond_0
    const-string v10, "\u06d6\u073f"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x9e3

    const v12, 0x65285110

    xor-int/2addr v11, v12

    const v12, -0x7a36a26d

    goto :goto_0

    :sswitch_6
    div-long v10, v1, v3

    long-to-int v5, v10

    .line 75
    sget v10, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v10, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v10, "\u06d9\u06d6"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x43

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x531b

    const v12, -0x13d1c340

    xor-int/2addr v11, v12

    const v12, 0x24123d39

    goto :goto_0

    .line 131
    :sswitch_7
    iput-wide v1, v0, Ll/֫۬᩻;->ۗ:J

    const-wide/16 v3, 0x3e8

    .line 62
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v10

    if-eqz v10, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v10, "\u06e7\u073d"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2beb

    const v12, -0x1280200a

    xor-int/2addr v11, v12

    const v12, 0x3b50cbf3

    goto/16 :goto_0

    .line 131
    :sswitch_8
    iget-wide v1, p0, Ll/ᩳۜ᩻;->ܰ:J

    .line 25
    sget v10, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v10, :cond_4

    :cond_3
    const-string v10, "\u0736\u1a77"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x373

    const v12, 0x3ece62

    xor-int/2addr v11, v12

    const v12, -0x41c0419d

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u05a1\u1a74"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit8 v11, v11, 0x1f

    const v12, 0x9c42316

    xor-int/2addr v11, v12

    const v12, -0x35e7ceec    # -2493509.0f

    goto/16 :goto_0

    .line 2
    :sswitch_9
    move-object v0, p1

    check-cast v0, Ll/֫۬᩻;

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v10

    if-nez v10, :cond_6

    :cond_5
    const-string v10, "\u073a\u073a"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x5497

    const v12, -0x6e60123b

    xor-int/2addr v11, v12

    const v12, 0x4db85e11    # 3.8664656E8f

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u1a7b\u1a7b"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x39

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x648d

    const v12, -0x7eb6a4fa

    xor-int/2addr v11, v12

    const v12, 0x6c7515db

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v10

    if-eqz v10, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v10, "\u1a78\u0733"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x73

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x59b7

    const v12, 0x3e8251a1

    xor-int/2addr v11, v12

    const v12, -0x870c231

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v10

    if-eqz v10, :cond_9

    :cond_8
    :goto_1
    const-string v10, "\u0730\u1a76"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x11

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7b81

    const v12, 0x425e6b91

    xor-int/2addr v11, v12

    const v12, -0x5f7c12db

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u1a75\u06d9"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x79

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x76c9

    const v12, -0x4d722082

    xor-int/2addr v11, v12

    const v12, -0x7059d564

    goto/16 :goto_0

    .line 44
    :sswitch_c
    sget v10, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v10, :cond_a

    goto :goto_3

    :cond_a
    const-string v10, "\u06ec\u06db"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3151

    const v12, 0x29bd2bf4

    xor-int/2addr v11, v12

    const v12, -0x3c5af819

    goto/16 :goto_0

    .line 131
    :sswitch_d
    sget v10, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v10, :cond_b

    :goto_2
    const-string v10, "\u05ab\u073d"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x29

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x3291

    const v12, 0x43abc0b5

    xor-int/2addr v11, v12

    const v12, 0x62eac991

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u1a79\u0736"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6ab9

    const v12, 0x7c50dbad

    xor-int/2addr v11, v12

    const v12, -0x3463f16b    # -2.0454698E7f

    goto/16 :goto_0

    :sswitch_e
    sget v10, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v10, :cond_c

    :goto_3
    const-string v10, "\u06ec\u1a74"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x79d5

    const v12, -0xd5aa09a

    xor-int/2addr v11, v12

    const v12, -0x20f20da6

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u06d7\u06ec"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x6ba7

    const v12, -0x68ec986a

    xor-int/2addr v11, v12

    const v12, -0x204060b2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73ff13be -> :sswitch_e
        -0x7194c31c -> :sswitch_8
        -0x62661a16 -> :sswitch_7
        -0x5c3053a6 -> :sswitch_6
        -0x56b1fc86 -> :sswitch_2
        -0x5416f76d -> :sswitch_8
        -0x469ad814 -> :sswitch_d
        -0x3119778a -> :sswitch_9
        -0x2f58836e -> :sswitch_1
        -0x2ded7f88 -> :sswitch_4
        -0x2d85e50a -> :sswitch_2
        -0x2c7ae6a7 -> :sswitch_a
        -0x28a66755 -> :sswitch_c
        -0x23118db0 -> :sswitch_c
        -0x2302ae01 -> :sswitch_5
        -0x2240a537 -> :sswitch_0
        0x18d64379 -> :sswitch_5
        0x2c2151dd -> :sswitch_6
        0x2ef6c7d7 -> :sswitch_3
        0x4212c691 -> :sswitch_4
        0x42a08078 -> :sswitch_d
        0x4567bef7 -> :sswitch_3
        0x57073c24 -> :sswitch_7
        0x5c5499f7 -> :sswitch_0
        0x5eb3a4c4 -> :sswitch_1
        0x5eba1f4b -> :sswitch_b
        0x645d3c57 -> :sswitch_9
        0x65c570b3 -> :sswitch_b
        0x6648aa58 -> :sswitch_a
        0x67a73cd8 -> :sswitch_e
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
