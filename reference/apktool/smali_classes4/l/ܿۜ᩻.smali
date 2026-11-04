.class public final synthetic Ll/ܿۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Landroid/app/Activity;

.field public final synthetic ۟:Ll/᩵ۡ᩻;

.field public final synthetic ܰ:[B

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>([BLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ll/᩵ۡ᩻;)V
    .locals 6

    const v0, -0x5fd006e6

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073a\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5def

    const v5, 0x6f456c0d

    xor-int/2addr v4, v5

    const v5, -0x3eaad383

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x1bc7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_5

    goto/16 :goto_1

    .line 2
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_1

    goto/16 :goto_1

    .line 3
    :sswitch_1
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_8

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/ܿۜ᩻;->֡:Landroid/app/Activity;

    iput-object p5, p0, Ll/ܿۜ᩻;->۟:Ll/᩵ۡ᩻;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ܿۜ᩻;->ܿ:Ljava/lang/String;

    .line 1
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06d7\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2129

    const v5, -0x77e51cf1

    xor-int/2addr v4, v5

    const v5, -0x1b21ec28

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_2

    :cond_1
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4525

    const v5, -0x265a0e4

    xor-int/2addr v4, v5

    const v5, -0x1f71893e

    goto :goto_0

    :cond_2
    const-string v3, "\u05ab\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x649f

    const v5, 0x6910b5a

    xor-int/2addr v4, v5

    const v5, 0x3e44122b

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u05a1\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xc69

    const v5, 0x7bd3df8

    xor-int/2addr v4, v5

    const v5, 0x727387d9

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6acf

    const v5, -0x7da3e480

    xor-int/2addr v4, v5

    const v5, -0x3df7168

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7d1d

    const v5, 0xe6ddc8c

    xor-int/2addr v4, v5

    const v5, 0x5d4e8d66

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06df\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x67c1

    const v5, -0x334cb122    # -9.400907E7f

    xor-int/2addr v4, v5

    const v5, 0x4c4147ac    # 5.0667184E7f

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7d2f

    const v5, 0x1de70bb1

    xor-int/2addr v4, v5

    const v5, -0x753079fc

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u0730\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7bdb

    const v5, 0x18d9a533    # 5.6259994E-24f

    xor-int/2addr v4, v5

    const v5, -0x5640f69

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06ec\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf83

    const v5, -0x2e6951c6

    xor-int/2addr v4, v5

    const v5, 0x2c1250c1

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06e2\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x10c7

    const v5, -0x2dd74f24

    xor-int/2addr v4, v5

    const v5, 0x4269ead0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_3
    const-string v3, "\u06e4\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x45a3

    const v5, 0x4f73f473

    xor-int/2addr v4, v5

    const v5, 0x1e8dfc81

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a7b\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x364f

    const v5, 0xe451fdd

    xor-int/2addr v4, v5

    const v5, 0x2df2075d

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܿۜ᩻;->ܰ:[B

    iput-object p2, p0, Ll/ܿۜ᩻;->᩶:Ljava/lang/String;

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u073a\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x19f1

    const v5, -0x1d921661

    xor-int/2addr v4, v5

    const v5, -0x74f3394e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x77e9

    const v5, 0x697fa1b7

    xor-int/2addr v4, v5

    const v5, 0x4e896fe6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75286eac -> :sswitch_8
        -0x70090f49 -> :sswitch_d
        -0x6e44d739 -> :sswitch_3
        -0x63617d94 -> :sswitch_c
        -0x61b6d77a -> :sswitch_5
        -0x51a90c43 -> :sswitch_2
        -0x443dd4ed -> :sswitch_e
        -0x435dd604 -> :sswitch_4
        -0x343d88cf -> :sswitch_0
        -0x2ebdfbbe -> :sswitch_6
        -0x206af624 -> :sswitch_3
        -0x1c9ad25a -> :sswitch_9
        -0x10e037b9 -> :sswitch_5
        0xe0274e -> :sswitch_d
        0x17acef8a -> :sswitch_b
        0x1d66d592 -> :sswitch_4
        0x27da579e -> :sswitch_9
        0x2ada97b4 -> :sswitch_6
        0x2d20089a -> :sswitch_1
        0x2d54894a -> :sswitch_7
        0x2e364493 -> :sswitch_a
        0x323ade49 -> :sswitch_b
        0x362670e1 -> :sswitch_0
        0x39d395ce -> :sswitch_a
        0x485f61cd -> :sswitch_2
        0x550fc9bb -> :sswitch_8
        0x5766a9b0 -> :sswitch_c
        0x6997ccec -> :sswitch_e
        0x6ab5d472 -> :sswitch_1
        0x766db293 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x63bd9767

    sget v4, Ll/ۖ֡;->ۚۛᩳ:I

    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    const-string v6, "\u06db\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5c7

    const v8, 0x4daf00fb    # 3.6700963E8f

    xor-int/2addr v7, v8

    const v8, -0x43ef6948

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x6e53

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 0
    iget-object v1, p0, Ll/ܿۜ᩻;->۟:Ll/᩵ۡ᩻;

    .line 3
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_1

    goto :goto_1

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-lez v6, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v6, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v6, :cond_9

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v6

    if-gtz v6, :cond_2

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    .line 0
    :sswitch_5
    iget-object v3, p0, Ll/ܿۜ᩻;->᩶:Ljava/lang/String;

    iget-object v4, p0, Ll/ܿۜ᩻;->ܿ:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۧ۬᩻;->ۙ([BLjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ll/᩵ۡ᩻;)V

    return-void

    :sswitch_6
    iget-object v2, p0, Ll/ܿۜ᩻;->ܰ:[B

    .line 2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v6

    if-gtz v6, :cond_0

    goto :goto_1

    :cond_0
    const-string v6, "\u06e8\u06da"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6caf

    const v8, 0x62bde765

    xor-int/2addr v7, v8

    const v8, -0x63e14a5e

    goto :goto_0

    :goto_1
    const-string v6, "\u073a\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x414f

    const v8, -0x60715994

    xor-int/2addr v7, v8

    const v8, -0x1c31fa6a

    goto :goto_0

    :cond_1
    const-string v6, "\u06e0\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6bf9

    const v8, 0x245ca96b

    xor-int/2addr v7, v8

    const v8, 0x6292b518

    goto/16 :goto_0

    .line 3
    :sswitch_7
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_3

    :cond_2
    :goto_2
    const-string v6, "\u1a78\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x13

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1fc9

    const v8, -0x2991ae60

    xor-int/2addr v7, v8

    const v8, 0x29b641ba

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u1a76\u06d8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x2b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1073

    const v8, -0x28803681

    xor-int/2addr v7, v8

    const v8, -0x2526ea8d

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v6, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u1a75\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4831

    const v8, -0x2347af20

    xor-int/2addr v7, v8

    const v8, -0x4b78993

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u06dc\u05ab"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v5

    mul-int/lit8 v7, v7, 0x4d

    const v8, -0xd756f71

    xor-int/2addr v7, v8

    const v8, 0x4547b424

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_6

    :goto_3
    const-string v6, "\u05ab\u1a78"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4239

    const v8, 0x4bf3927e    # 3.19255E7f

    xor-int/2addr v7, v8

    const v8, -0x21bf45f3

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06e4\u06e2"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x19

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x790b

    const v8, -0x667e1c81

    xor-int/2addr v7, v8

    const v8, -0x4ee3c3ef

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v6, Ll/۬;->᩸ۜ᩹:I

    if-eqz v6, :cond_7

    goto :goto_5

    :cond_7
    const-string v6, "\u05a8\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1675

    const v8, 0x75d256f5

    xor-int/2addr v7, v8

    const v8, 0x5c0da44d

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u06d7\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7b71

    const v8, -0x6ea3ccbf

    xor-int/2addr v7, v8

    const v8, 0x4b2ad386    # 1.119527E7f

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u06e0\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4b9b

    const v8, -0x4e8d229f

    xor-int/2addr v7, v8

    const v8, -0x5a57aeb

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u05a8\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x114b

    const v8, -0x7d239ecf

    xor-int/2addr v7, v8

    const v8, -0x66bb0e5a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ܿۜ᩻;->֡:Landroid/app/Activity;

    .line 3
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u1a79\u1a78"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x59d5

    const v8, -0x55687d68

    xor-int/2addr v7, v8

    const v8, 0x2e6eba14

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06dc\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5d8f

    const v8, -0x355089e3    # -5749518.5f

    xor-int/2addr v7, v8

    const v8, -0x2b6c1baf

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e4bface -> :sswitch_8
        -0x75113747 -> :sswitch_d
        -0x69c2b47b -> :sswitch_1
        -0x69234f3b -> :sswitch_e
        -0x67f781e8 -> :sswitch_2
        -0x66e6e06b -> :sswitch_7
        -0x53abcfe2 -> :sswitch_e
        -0x493ee78f -> :sswitch_d
        -0x492d5e2b -> :sswitch_5
        -0x43dbb0d5 -> :sswitch_a
        -0x36ffc862 -> :sswitch_6
        -0x350fdfef -> :sswitch_0
        -0x198f42c5 -> :sswitch_0
        -0x4d95be8 -> :sswitch_3
        0x4a13d8e -> :sswitch_1
        0x8f3ead3 -> :sswitch_9
        0xfac173b -> :sswitch_b
        0x117c9834 -> :sswitch_c
        0x23819732 -> :sswitch_b
        0x2c311e98 -> :sswitch_8
        0x2fc02ca0 -> :sswitch_c
        0x39beb6fd -> :sswitch_4
        0x4a2a08fa -> :sswitch_5
        0x4b413370 -> :sswitch_4
        0x572d518e -> :sswitch_6
        0x60f6dea4 -> :sswitch_9
        0x70288ed7 -> :sswitch_a
        0x73cf0e8f -> :sswitch_3
        0x7998a821 -> :sswitch_2
        0x7e365f98 -> :sswitch_7
    .end sparse-switch
.end method
