.class public final synthetic Ll/ۤ۠֫;
.super Ljava/lang/Object;
.source "UAQE"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/֫֫᩷;


# direct methods
.method public static bridge synthetic ۙ(Ljava/lang/Object;)Landroid/media/AudioDeviceInfo;
    .locals 0

    .line 0
    check-cast p0, Landroid/media/AudioDeviceInfo;

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ljava/lang/Object;)Landroid/os/storage/StorageVolume;
    .locals 0

    .line 0
    check-cast p0, Landroid/os/storage/StorageVolume;

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-static {v0, p0}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-object v0
.end method

.method public static synthetic ۙ([Ljava/lang/Object;)Ljava/util/List;
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x2c69e563

    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v6, "\u05a8\u06da"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x3f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x362f

    const v8, -0x7824d002

    xor-int/2addr v7, v8

    const v8, -0xab25cad

    :goto_0
    xor-int/2addr v6, v8

    move-object v8, v0

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x5d6d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 0
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_8

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v6

    if-nez v6, :cond_6

    goto/16 :goto_2

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    move-result v6

    if-gtz v6, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    const/4 p0, 0x0

    return-object p0

    :sswitch_4
    aget-object v6, p0, v2

    const/4 v7, 0x1

    invoke-static {v6, v8, v6, v2, v7}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v2

    goto/16 :goto_6

    :sswitch_5
    invoke-static {v8}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :sswitch_6
    if-ge v2, v1, :cond_0

    const-string v6, "\u0733\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2f0b

    const v9, -0x6b42bda1

    xor-int/2addr v7, v9

    const v9, 0x7fc61b2e

    goto/16 :goto_7

    :cond_0
    const-string v6, "\u05a1\u06e8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x7b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x86d

    const v9, 0x21db48b5

    xor-int/2addr v7, v9

    const v9, 0x256a52b3

    goto/16 :goto_7

    :sswitch_7
    new-instance v8, Ljava/util/ArrayList;

    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_1

    goto :goto_3

    :cond_1
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_2

    goto :goto_2

    .line 4
    :cond_2
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_3

    goto :goto_4

    :cond_3
    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v6, :cond_4

    goto :goto_5

    :cond_4
    sget v6, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v6, :cond_5

    goto :goto_3

    :cond_5
    sget v6, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v6, :cond_7

    :cond_6
    const-string v6, "\u0733\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x37cb

    const v8, 0x7d7a7d4a

    xor-int/2addr v7, v8

    const v8, -0x411d80bc

    goto/16 :goto_0

    :cond_7
    sget v6, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v6, :cond_9

    :cond_8
    :goto_2
    const-string v6, "\u06e2\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xd1

    const v8, 0x14b3c463

    xor-int/2addr v7, v8

    const v8, 0xafe7c89

    goto/16 :goto_0

    .line 2
    :cond_9
    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_a

    :goto_3
    const-string v6, "\u06e7\u05a1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x1d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7695

    const v8, 0xe461413

    xor-int/2addr v7, v8

    const v8, 0x597d8539

    goto/16 :goto_0

    .line 0
    :cond_a
    sget v6, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u0730\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4651

    const v8, 0x472ea5b

    xor-int/2addr v7, v8

    const v8, 0xaa2b09b

    goto/16 :goto_0

    :cond_c
    array-length v6, p0

    sget v7, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v7, :cond_d

    :goto_5
    const-string v6, "\u0733\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1cd3

    const v8, -0x651f48e8

    xor-int/2addr v7, v8

    const v8, -0x51796366

    goto/16 :goto_0

    :cond_d
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_6
    const-string v6, "\u1a7a\u1a7a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6e7b

    const v9, -0x1b7db88

    xor-int/2addr v7, v9

    const v9, 0x2020d562

    :goto_7
    xor-int/2addr v6, v9

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x6fa53be0 -> :sswitch_6
        -0x457801ea -> :sswitch_2
        -0x4386574a -> :sswitch_4
        -0x3e1e869e -> :sswitch_7
        -0x32b18d0b -> :sswitch_0
        -0x30404375 -> :sswitch_4
        -0x17d419d0 -> :sswitch_5
        -0xaf20eeb -> :sswitch_2
        -0x812b2ae -> :sswitch_3
        0x1143d099 -> :sswitch_0
        0x28df0d57 -> :sswitch_6
        0x44f1a3fb -> :sswitch_5
        0x50e3a85c -> :sswitch_3
        0x619c096e -> :sswitch_1
        0x64b8a467 -> :sswitch_7
        0x7754e46c -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;Ljava/lang/String;)V
    .locals 6

    const v0, -0x68694f29

    sget v1, Ll/ۘܽ;->᩹ۧۚ:I

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v3, "\u06ec\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xa09

    const v5, 0x3e2140ed

    xor-int/2addr v4, v5

    const v5, -0x6e3917fe

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6805

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    goto/16 :goto_3

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-ltz v3, :cond_b

    goto/16 :goto_2

    .line 1
    :sswitch_2
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v3, :cond_4

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    .line 0
    :sswitch_4
    invoke-static {p0, p1}, Ll/֫۠;->ۧۜܿ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1
    invoke-static {p0}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 2
    invoke-interface {p2, p3, p0}, Lorg/bouncycastle/jcajce/provider/config/ConfigurableProvider;->addAlgorithm(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :sswitch_5
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u1a77\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x72fd

    const v5, 0x75dd24fc

    xor-int/2addr v4, v5

    const v5, 0x22607b9b

    goto :goto_0

    .line 0
    :sswitch_6
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06da\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x16fb

    const v5, -0x6bba0981

    xor-int/2addr v4, v5

    const v5, -0x219fee30

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a7a\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f13

    const v5, 0x6eafa1c1

    xor-int/2addr v4, v5

    const v5, -0x67a27be0

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_3

    :goto_1
    const-string v3, "\u06e8\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3609

    const v5, -0x1389fc5a

    xor-int/2addr v4, v5

    const v5, -0x65bda6aa

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u05a8\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4cc1

    const v5, 0x6125893f

    xor-int/2addr v4, v5

    const v5, 0x1cedf318

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1177

    const v5, 0x4db67568

    xor-int/2addr v4, v5

    const v5, -0x683c4756

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a75\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4117

    const v5, -0x3b2d17bc

    xor-int/2addr v4, v5

    const v5, -0x2f2ac2e

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4e5

    const v5, -0x7765ebc

    xor-int/2addr v4, v5

    const v5, -0x6c9c153a

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_7

    goto :goto_5

    :cond_7
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x684d

    const v5, -0x15558895

    xor-int/2addr v4, v5

    const v5, -0x18d49782

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3713

    const v5, -0x1173f5ee

    xor-int/2addr v4, v5

    const v5, -0x2fe35cf8

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a73\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x42eb

    const v5, 0xe913c3b

    xor-int/2addr v4, v5

    const v5, 0x78a2b4c1

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06e8\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1663

    const v5, 0x7e808dc0

    xor-int/2addr v4, v5

    const v5, 0xe917fce

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06df\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6039

    const v5, -0x73224e81

    xor-int/2addr v4, v5

    const v5, 0x6edd3099

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05a8\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63bd

    const v5, 0x7ac968db

    xor-int/2addr v4, v5

    const v5, -0x66a8210d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xb7b

    const v5, -0x1c68f827

    xor-int/2addr v4, v5

    const v5, 0x39434e23

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x73b670b8 -> :sswitch_6
        -0x7146e89d -> :sswitch_8
        -0x6650440f -> :sswitch_6
        -0x65bf2d9e -> :sswitch_4
        -0x6104dbe9 -> :sswitch_b
        -0x6003fe51 -> :sswitch_d
        -0x587b98af -> :sswitch_1
        -0x483f7615 -> :sswitch_9
        -0x3c7413b3 -> :sswitch_a
        -0x36fbd687 -> :sswitch_2
        -0x30700e7a -> :sswitch_4
        -0x1b28c3f4 -> :sswitch_e
        -0x1ae75e58 -> :sswitch_e
        -0x1163c260 -> :sswitch_0
        -0xffc8fa4 -> :sswitch_2
        -0xf7d380e -> :sswitch_7
        -0xb400d83 -> :sswitch_3
        -0x53c8a71 -> :sswitch_5
        0xc7f1b92 -> :sswitch_b
        0x1b673473 -> :sswitch_3
        0x29feeb16 -> :sswitch_d
        0x2cd4c693 -> :sswitch_c
        0x2f64c54e -> :sswitch_5
        0x45a96d64 -> :sswitch_a
        0x483d5973 -> :sswitch_9
        0x4a7e60f6 -> :sswitch_c
        0x5d01aa88 -> :sswitch_1
        0x5f983f63 -> :sswitch_8
        0x6224a2fd -> :sswitch_0
        0x6833d1ea -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 349
    invoke-static {p1}, Ll/ܽ;->ۜ᩻֨(Ljava/lang/Object;)Ljava/lang/Class;

    return-void
.end method

.method public ۙ()Ll/֫֫᩷;
    .locals 0

    return-object p0
.end method

.method public ۙ(Ll/ۗܶ᩷;)Ll/֫֫᩷;
    .locals 0

    return-object p0
.end method

.method public ۙ(Z)Ll/֫֫᩷;
    .locals 0

    return-object p0
.end method

.method public ۙ(Landroid/net/Uri;Ljava/util/Map;)[Ll/᩸֫᩷;
    .locals 0

    .line 102
    invoke-virtual {p0}, Ll/ۤ۠֫;->᩷()[Ll/᩸֫᩷;

    move-result-object p1

    return-object p1
.end method

.method public ᩷()[Ll/᩸֫᩷;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x337a4b9d

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v5, "\u1a73\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2403

    const v7, -0x64057a9a

    xor-int/2addr v6, v7

    const v7, 0x1c3e0be8

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x5d3

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 69
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    const/4 v0, 0x0

    return-object v0

    .line 176
    :sswitch_0
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v5, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_9

    goto :goto_2

    .line 84
    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    .line 262
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto :goto_3

    :sswitch_4
    const/4 v0, 0x0

    .line 417
    aput-object v7, v1, v0

    return-object v1

    :sswitch_5
    const/4 v1, 0x1

    new-array v1, v1, [Ll/᩸֫᩷;

    .line 99
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_0

    goto :goto_2

    :cond_0
    const-string v5, "\u06d6\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x602f

    const v8, -0x2406333d

    xor-int/2addr v6, v8

    const v8, -0x2abc0f2e

    goto/16 :goto_7

    .line 417
    :sswitch_6
    new-instance v7, Ll/ۜ᩵᩷;

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_4

    :cond_2
    new-instance v12, Ll/֨ۨۙ;

    .line 24
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u05a8\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x652d

    const v7, -0x75b89dec    # -9.599948E-33f

    xor-int/2addr v6, v7

    const v7, 0x6f4c5aa0

    goto :goto_0

    :cond_4
    const-wide v5, 0x7fffffffffffffffL

    .line 417
    invoke-direct {v12, v5, v6}, Ll/֨ۨۙ;-><init>(J)V

    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_5

    goto :goto_6

    :cond_5
    new-instance v13, Ll/ۡۗ᩷;

    const/16 v5, 0x18

    .line 357
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_6

    :goto_3
    const-string v5, "\u06e0\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4a8d

    const v7, -0x717acaad

    xor-int/2addr v6, v7

    const v7, 0x7b986d60

    goto/16 :goto_0

    .line 417
    :cond_6
    invoke-direct {v13, v5}, Ll/ۡۗ᩷;-><init>(I)V

    .line 54
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v5

    if-nez v5, :cond_7

    :goto_4
    const-string v5, "\u05a1\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x38a7

    const v7, 0x4d6b2fc6    # 2.4661104E8f

    xor-int/2addr v6, v7

    const v7, -0x767eb545

    goto/16 :goto_0

    :cond_7
    const/4 v9, 0x2

    const/4 v10, 0x1

    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_8

    goto :goto_6

    .line 417
    :cond_8
    sget-object v11, Ll/֨ܶ᩷;->ۙ:Ll/֨ܶ᩷;

    .line 53
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_a

    :cond_9
    :goto_5
    const-string v5, "\u05ab\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x77f9

    const v7, -0x14489965

    xor-int/2addr v6, v7

    const v7, 0x71162d28

    goto/16 :goto_0

    :cond_a
    move-object v8, v7

    .line 417
    invoke-direct/range {v8 .. v13}, Ll/ۜ᩵᩷;-><init>(IILl/֨ܶ᩷;Ll/֨ۨۙ;Ll/ۡۗ᩷;)V

    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_c

    :cond_b
    :goto_6
    const-string v5, "\u0736\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x783d

    const v7, -0x36460733

    xor-int/2addr v6, v7

    const v7, -0x2651c8fd

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06dc\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x334f

    const v8, 0x1e9984b6

    xor-int/2addr v6, v8

    const v8, -0x24825853

    :goto_7
    xor-int/2addr v5, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7aafe4e9 -> :sswitch_3
        -0x5882468b -> :sswitch_6
        -0x52a575d3 -> :sswitch_4
        -0x518a4a7f -> :sswitch_2
        -0x19fc8a3e -> :sswitch_5
        -0xeac711e -> :sswitch_4
        0x63dedf -> :sswitch_2
        0x92b3137 -> :sswitch_1
        0x136638de -> :sswitch_5
        0x275b9729 -> :sswitch_3
        0x33b225b2 -> :sswitch_1
        0x4cb04468 -> :sswitch_0
        0x639d0860 -> :sswitch_0
        0x7af3815f -> :sswitch_6
    .end sparse-switch
.end method
