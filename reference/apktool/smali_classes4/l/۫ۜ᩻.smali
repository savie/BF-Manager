.class public final synthetic Ll/۫ۜ᩻;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ۟:Ljava/lang/String;

.field public final synthetic ܰ:Ljava/util/ArrayList;

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩳ:Ll/ܳ۬᩻;

.field public final synthetic ᩶:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;Ll/۠ۖۧ;Ljava/lang/String;Ljava/lang/String;Ll/ܳ۬᩻;)V
    .locals 6

    const v0, -0x69ed801a

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x298d

    const v5, 0x3d3b76e0

    xor-int/2addr v4, v5

    const v5, -0x6dfa2d7c

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x7c3d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u05ab\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5fe7

    const v5, -0xd6449d0

    xor-int/2addr v4, v5

    const v5, 0x360bafa1

    goto :goto_0

    .line 0
    :sswitch_1
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-gez v3, :cond_9

    goto/16 :goto_4

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v3, :cond_b

    goto/16 :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    goto/16 :goto_2

    .line 0
    :sswitch_4
    iput-object p4, p0, Ll/۫ۜ᩻;->֡:Ljava/lang/String;

    iput-object p5, p0, Ll/۫ۜ᩻;->۟:Ljava/lang/String;

    iput-object p6, p0, Ll/۫ۜ᩻;->ᩳ:Ll/ܳ۬᩻;

    return-void

    :sswitch_5
    iput-object p3, p0, Ll/۫ۜ᩻;->ܿ:Ll/۠ۖۧ;

    .line 4
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06db\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x40ef

    const v5, 0x106c633c

    xor-int/2addr v4, v5

    const v5, 0x95e3ef8

    goto :goto_0

    .line 3
    :sswitch_6
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u073f\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6b43

    const v5, -0x6c5101cb

    xor-int/2addr v4, v5

    const v5, -0x48611a44

    goto/16 :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x915

    const v5, 0x7a8a23f7

    xor-int/2addr v4, v5

    const v5, -0x3c5d2d3d

    goto/16 :goto_0

    .line 4
    :sswitch_8
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v3

    if-gtz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u1a76\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xab1

    const v5, -0x78f00134

    xor-int/2addr v4, v5

    const v5, 0x523094ff

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e4\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5fb9

    const v5, -0x5f400a6

    xor-int/2addr v4, v5

    const v5, 0x33e4e8f2

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_6

    :goto_1
    const-string v3, "\u06ec\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x40e9

    const v5, 0x700ef7d1

    xor-int/2addr v4, v5

    const v5, -0x484d4ee4

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1835

    const v5, -0x39e95179

    xor-int/2addr v4, v5

    const v5, -0x305fbac5

    goto/16 :goto_0

    .line 3
    :sswitch_b
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-gtz v3, :cond_7

    :goto_2
    const-string v3, "\u06e0\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b77

    const v5, -0x2657ceb1

    xor-int/2addr v4, v5

    const v5, 0x1a6f0b43

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14bf

    const v5, 0x5a49f99b

    xor-int/2addr v4, v5

    const v5, 0x44add9ce

    goto/16 :goto_0

    .line 1
    :sswitch_c
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06d7\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x62bf

    const v5, 0x5397098d

    xor-int/2addr v4, v5

    const v5, -0x6abc0a79

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55ef

    const v5, 0x46416ca

    xor-int/2addr v4, v5

    const v5, 0xea2b527

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06dc\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2615

    const v5, 0x7a48db9c

    xor-int/2addr v4, v5

    const v5, 0x38f132b7

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۫ۜ᩻;->ܰ:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/۫ۜ᩻;->᩶:Landroid/app/Activity;

    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e4\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b89

    const v5, 0x69624c71

    xor-int/2addr v4, v5

    const v5, 0x45bf56d9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4483

    const v5, 0x89ff1ae

    xor-int/2addr v4, v5

    const v5, 0x5c4264d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c9d76b2 -> :sswitch_3
        -0x7692bcf5 -> :sswitch_5
        -0x73f28327 -> :sswitch_e
        -0x718f0858 -> :sswitch_6
        -0x6f0d2508 -> :sswitch_8
        -0x69988025 -> :sswitch_2
        -0x6315cac4 -> :sswitch_b
        -0x544fa568 -> :sswitch_b
        -0x352583a2 -> :sswitch_e
        -0x1e985249 -> :sswitch_1
        -0x19f78179 -> :sswitch_d
        -0x1926d356 -> :sswitch_6
        -0x4a13bed -> :sswitch_7
        0x4bd4d01 -> :sswitch_1
        0x928d43d -> :sswitch_5
        0xd177515 -> :sswitch_8
        0xe99058a -> :sswitch_a
        0x121a0e35 -> :sswitch_a
        0x159cb0f4 -> :sswitch_9
        0x1807c623 -> :sswitch_7
        0x305111ed -> :sswitch_2
        0x3b345c4c -> :sswitch_d
        0x3ee5d5bb -> :sswitch_0
        0x436a8d28 -> :sswitch_4
        0x4a0fc15f -> :sswitch_c
        0x50517c44 -> :sswitch_4
        0x63330075 -> :sswitch_0
        0x695b7dbf -> :sswitch_9
        0x72c58096 -> :sswitch_c
        0x7b4ccb31 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final accept(I)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x1401872b

    sget v4, Ll/֨ۨ;->ۜܳ᩵:I

    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v6, "\u06e0\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6033

    const v8, 0x269a367f

    xor-int/2addr v7, v8

    const v8, 0x11c73173

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3915

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 1522
    move-object v6, v2

    check-cast v6, Ll/᩸ۡ᩻;

    .line 1523
    new-instance v14, Ll/ܶۜ᩻;

    .line 1149
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v7

    if-ltz v7, :cond_2

    goto :goto_2

    .line 673
    :sswitch_0
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v6, :cond_5

    :cond_0
    :goto_2
    move/from16 v6, p1

    goto/16 :goto_6

    .line 57
    :sswitch_1
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_1

    :goto_3
    move/from16 v6, p1

    goto/16 :goto_5

    :cond_1
    move/from16 v6, p1

    goto/16 :goto_7

    .line 156
    :sswitch_2
    sget v6, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v6, :cond_0

    goto :goto_3

    .line 1307
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto :goto_3

    .line 506
    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    return-void

    .line 1523
    :cond_2
    iget-object v8, v0, Ll/۫ۜ᩻;->ܿ:Ll/۠ۖۧ;

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v7

    if-gtz v7, :cond_3

    goto :goto_4

    :cond_3
    iget-object v9, v0, Ll/۫ۜ᩻;->֡:Ljava/lang/String;

    iget-object v10, v0, Ll/۫ۜ᩻;->۟:Ljava/lang/String;

    .line 706
    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v7, :cond_4

    :goto_4
    const-string v6, "\u06e0\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3a47

    const v8, 0x9e7ff18

    xor-int/2addr v7, v8

    const v8, 0x7b6aa675

    goto :goto_0

    .line 1523
    :cond_4
    iget-object v15, v0, Ll/۫ۜ᩻;->᩶:Landroid/app/Activity;

    .line 1197
    sget v7, Ll/ۖ;->ܿۚ֡:I

    if-ltz v7, :cond_6

    :cond_5
    const-string v6, "\u0730\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x3b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x317f

    const v8, -0x47bb4f39

    xor-int/2addr v7, v8

    const v8, 0x315ad7db

    goto :goto_0

    .line 1523
    :cond_6
    iget-object v13, v0, Ll/۫ۜ᩻;->ᩳ:Ll/ܳ۬᩻;

    move-object v7, v14

    move-object v11, v6

    move-object v12, v15

    invoke-direct/range {v7 .. v13}, Ll/ܶۜ᩻;-><init>(Ll/۠ۖۧ;Ljava/lang/String;Ljava/lang/String;Ll/᩸ۡ᩻;Landroid/app/Activity;Ll/ܳ۬᩻;)V

    invoke-static {v15, v6, v14}, Ll/ۧۡ᩻;->ۙ(Landroid/app/Activity;Ll/᩸ۡ᩻;Ljava/lang/Runnable;)V

    return-void

    :sswitch_5
    move/from16 v6, p1

    .line 1522
    invoke-static {v1, v6}, Ll/ۗ᩸;->ۙ۫ۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    .line 166
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v7

    if-gtz v7, :cond_7

    goto :goto_5

    :cond_7
    const-string v7, "\u1a77\u06e1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x26bd

    const v9, -0x62cb99cb

    xor-int/2addr v8, v9

    const v9, -0x7cc9a776

    goto/16 :goto_8

    :sswitch_6
    move/from16 v6, p1

    .line 1522
    iget-object v1, v0, Ll/۫ۜ᩻;->ܰ:Ljava/util/ArrayList;

    .line 563
    sget v7, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v7, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v7, "\u073d\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x7745

    const v9, 0x5e12dbdf

    xor-int/2addr v8, v9

    const v9, 0x1dc5945d

    goto/16 :goto_8

    :sswitch_7
    move/from16 v6, p1

    .line 60
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    const-string v7, "\u06e7\u1a79"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x5b15

    const v9, 0x287a6ecb

    xor-int/2addr v8, v9

    const v9, 0x215d47ba

    goto/16 :goto_8

    :sswitch_8
    move/from16 v6, p1

    .line 345
    sget v7, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v7, :cond_a

    :goto_5
    const-string v7, "\u06df\u06d9"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x23

    xor-int v8, v7, v4

    mul-int/lit8 v8, v8, -0x73

    const v9, 0x34d0c783

    xor-int/2addr v8, v9

    const v9, -0x66435496

    goto :goto_8

    :cond_a
    const-string v7, "\u06e1\u073d"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xca9

    const v9, -0x48b22da1

    xor-int/2addr v8, v9

    const v9, -0x67691886

    goto :goto_8

    :sswitch_9
    move/from16 v6, p1

    sget v7, Ll/ۧ;->ۨۗܰ:I

    if-ltz v7, :cond_b

    :goto_6
    const-string v7, "\u06d7\u06e4"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    mul-int/lit8 v7, v7, -0x17

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x38a7

    const v9, -0x5183dd0b

    xor-int/2addr v8, v9

    const v9, 0x58cb7304

    goto :goto_8

    :cond_b
    const-string v7, "\u06d6\u1a76"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x721

    const v9, -0x253b2c9e

    xor-int/2addr v8, v9

    const v9, 0x47e246b

    goto :goto_8

    :sswitch_a
    move/from16 v6, p1

    .line 1300
    sget v7, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v7, :cond_c

    :goto_7
    const-string v7, "\u1a7b\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v4, v7

    mul-int/lit8 v7, v7, -0x4b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5db7

    const v9, 0x599ec77a

    xor-int/2addr v8, v9

    const v9, -0x7ebce5e8

    goto :goto_8

    :cond_c
    const-string v7, "\u1a73\u1a75"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x355f

    const v9, -0x71f7800c

    xor-int/2addr v8, v9

    const v9, 0x2a8200a6

    :goto_8
    xor-int/2addr v7, v9

    move v6, v7

    move v7, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x772a4320 -> :sswitch_5
        -0x6e91fb4e -> :sswitch_8
        -0x6be33ee2 -> :sswitch_1
        -0x6507ef3a -> :sswitch_9
        -0x5f6d71dd -> :sswitch_0
        -0x5e414cd2 -> :sswitch_a
        -0x4bb2868f -> :sswitch_6
        -0x4acb189d -> :sswitch_2
        -0x3dbfb406 -> :sswitch_7
        -0x33d5536e -> :sswitch_2
        -0x163bf0b5 -> :sswitch_9
        -0x118578ab -> :sswitch_0
        -0x76d60e9 -> :sswitch_4
        0x1447f15 -> :sswitch_8
        0x1b3b74c7 -> :sswitch_6
        0x28ef6504 -> :sswitch_7
        0x32a752ba -> :sswitch_5
        0x399058f8 -> :sswitch_3
        0x39f97067 -> :sswitch_4
        0x74f4bf9e -> :sswitch_1
        0x77eb543d -> :sswitch_a
        0x7dde7d83 -> :sswitch_3
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۧۗ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
