.class public final synthetic Ll/᩵۠᩺;
.super Ljava/lang/Object;
.source "51RP"

# interfaces
.implements Ll/᩺᩶ۘ;


# static fields
.field private static final ܿ۫۠:[S


# instance fields
.field public final synthetic ۙ:Ll/᩶ۡ᩺;

.field public final synthetic ܰ:Ll/᩻ۡ᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵۠᩺;->ܿ۫۠:[S

    return-void

    :array_0
    .array-data 2
        0x12a4s
        0x4ffds
        0x4feas
        0x4ffcs
        0x4fffs
        0x4feas
        0x4ffds
        0x4ffds
        0x4fdcs
        0x4ffbs
        0x4ffds
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/᩶ۡ᩺;Ll/᩻ۡ᩺;)V
    .locals 6

    const v0, 0x6571d0ef

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a79\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc35

    const v5, -0x19ecb74d

    xor-int/2addr v4, v5

    const v5, 0x2e41d40d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x20c9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_1

    .line 2
    :sswitch_1
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-lez v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xbbd

    const v5, 0x2f6e364b

    xor-int/2addr v4, v5

    const v5, 0x373be198

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/᩵۠᩺;->ܰ:Ll/᩻ۡ᩺;

    return-void

    :sswitch_6
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a7b\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2fc7

    const v5, -0x715ce7ac

    xor-int/2addr v4, v5

    const v5, -0x516e8631

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u05ab\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x47cf

    const v5, -0x65117da3

    xor-int/2addr v4, v5

    const v5, 0x17c55aba

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2469

    const v5, 0x464da200    # 13160.5f

    xor-int/2addr v4, v5

    const v5, 0x4a053f96    # 2183141.5f

    goto/16 :goto_0

    .line 0
    :sswitch_8
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_4

    :goto_2
    const-string v3, "\u06dc\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5cbf

    const v5, 0x4289f724

    xor-int/2addr v4, v5

    const v5, 0x657ab02f

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x24c1

    const v5, -0x43efd6b0

    xor-int/2addr v4, v5

    const v5, -0x1e4e0e47

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u06df\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c4f

    const v5, 0x2518a6a3

    xor-int/2addr v4, v5

    const v5, -0x7d438cd9

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06e4\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x267f

    const v5, 0x6cc62930

    xor-int/2addr v4, v5

    const v5, 0x3800dbf9

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_3
    const-string v3, "\u1a74\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2cb5

    const v5, -0x13e1f5f7

    xor-int/2addr v4, v5

    const v5, -0x125d6d22

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a1\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2985

    const v5, 0x4e22dbdf    # 6.830796E8f

    xor-int/2addr v4, v5

    const v5, -0x62b8ee8

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_9

    :goto_4
    const-string v3, "\u0730\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xdd5

    const v5, -0x36eeb070    # -595193.0f

    xor-int/2addr v4, v5

    const v5, -0x7b8a6f68

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c33

    const v5, -0x4bab2724

    xor-int/2addr v4, v5

    const v5, -0xbb74b3f

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x77bb

    const v5, -0x4685a4bc

    xor-int/2addr v4, v5

    const v5, 0x64eba22d

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩵۠᩺;->ۙ:Ll/᩶ۡ᩺;

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06e2\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x137b

    const v5, -0x3d92aabf

    xor-int/2addr v4, v5

    const v5, -0x32fd5e1c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1a8b

    const v5, -0x19c7ff4c

    xor-int/2addr v4, v5

    const v5, -0x44df6908

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x761a3d51 -> :sswitch_a
        -0x6ad27ce4 -> :sswitch_2
        -0x6218edfe -> :sswitch_1
        -0x60987255 -> :sswitch_c
        -0x5e51daae -> :sswitch_b
        -0x42cc84c9 -> :sswitch_2
        -0x2d840e59 -> :sswitch_9
        -0x26cd913b -> :sswitch_8
        -0x212b0024 -> :sswitch_5
        -0x1f44981c -> :sswitch_e
        -0x15a9981b -> :sswitch_4
        -0x11522e71 -> :sswitch_7
        -0xd726541 -> :sswitch_8
        -0xbcc30ef -> :sswitch_0
        0x10f98712 -> :sswitch_3
        0x11b6afdd -> :sswitch_5
        0x122df222 -> :sswitch_d
        0x153cd1c9 -> :sswitch_4
        0x288a6151 -> :sswitch_1
        0x3a3702d6 -> :sswitch_7
        0x470a09ad -> :sswitch_3
        0x49927136 -> :sswitch_d
        0x4b716e56 -> :sswitch_6
        0x4bcc06ef -> :sswitch_e
        0x4ff51d32 -> :sswitch_0
        0x68211469 -> :sswitch_b
        0x6e8ebb42 -> :sswitch_c
        0x719d7b63 -> :sswitch_6
        0x7388675e -> :sswitch_9
        0x76668e12 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0x25827287

    sget v20, Ll/֫;->ܶܺ᩻:I

    sget v21, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v22, "\u05a8\u06d7"

    invoke-static/range {v22 .. v22}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v21

    xor-int v2, v22, v20

    mul-int/lit16 v2, v2, -0x3565

    const v24, -0xb384bd4

    xor-int v2, v2, v24

    const v24, 0x51a91656

    xor-int v22, v22, v24

    move-object v4, v3

    move-object v14, v13

    move-object/from16 v8, v16

    move/from16 v23, v22

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, 0x25827287

    const/16 v24, 0x0

    move-object/from16 v16, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v11, v22, v20

    mul-int/lit16 v11, v11, 0x529d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v2, v11

    xor-int v22, v23, v2

    sparse-switch v22, :sswitch_data_0

    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    move/from16 v8, v18

    const/16 v17, 0x0

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v2, :cond_f

    goto/16 :goto_b

    .line 599
    :sswitch_0
    sget-boolean v2, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v2, :cond_1

    :cond_0
    move-object/from16 v23, v6

    goto/16 :goto_6

    :cond_1
    :goto_1
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    :goto_2
    move/from16 v8, v18

    goto/16 :goto_c

    .line 450
    :sswitch_1
    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v2, :cond_2

    :goto_3
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    :goto_4
    move/from16 v8, v18

    goto/16 :goto_b

    :cond_2
    const-string v2, "\u0733\u06e7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v11, v2, v20

    mul-int/lit16 v11, v11, -0x7155

    const v23, 0x58a6a59

    xor-int v11, v11, v23

    const v23, 0x291cc886

    goto :goto_5

    :sswitch_2
    sget-boolean v2, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v2, :cond_0

    goto :goto_3

    .line 592
    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    return-void

    .line 104
    :sswitch_5
    invoke-static {v8, v9, v10, v13}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Ll/۟;->ܳۢ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 440
    invoke-virtual {v4, v6, v1}, Ll/᩶ۡ᩺;->ۙ(Ljava/lang/String;Z)V

    return-void

    .line 104
    :sswitch_6
    iget-object v6, v1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errStr:Ljava/lang/String;

    sget-object v8, Ll/᩵۠᩺;->ܿ۫۠:[S

    const/4 v9, 0x5

    const/4 v10, 0x6

    .line 356
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v2

    if-ltz v2, :cond_3

    goto/16 :goto_9

    :cond_3
    const-string v2, "\u0733\u05a1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, 0x39

    xor-int v11, v2, v20

    mul-int/lit16 v11, v11, 0x7553

    const v23, 0x17605614

    xor-int v11, v11, v23

    const v23, 0x434186d9

    :goto_5
    xor-int v23, v2, v23

    move v2, v11

    goto/16 :goto_0

    .line 94
    :sswitch_7
    move-object v2, v1

    check-cast v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;

    iget-object v2, v2, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;->code:Ljava/lang/String;

    .line 95
    new-instance v11, Ll/ۤ۠᩺;

    .line 689
    sget v23, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v23, :cond_4

    goto :goto_1

    .line 95
    :cond_4
    invoke-direct {v11, v4}, Ll/ۤ۠᩺;-><init>(Ljava/lang/Object;)V

    move-object/from16 v23, v6

    .line 846
    new-instance v6, Ljava/lang/Thread;

    .line 375
    sget v25, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v25, :cond_5

    :goto_6
    const-string v2, "\u1a79\u073a"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, 0x7d

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, -0x34df

    const v11, 0x3b5d3916

    xor-int/2addr v6, v11

    const v11, 0x7166851c

    xor-int/2addr v2, v11

    goto/16 :goto_f

    :cond_5
    move-object/from16 v25, v8

    .line 846
    new-instance v8, Ll/۟ۤ᩺;

    move/from16 v26, v9

    iget-object v9, v0, Ll/᩵۠᩺;->ܰ:Ll/᩻ۡ᩺;

    invoke-direct {v8, v2, v9, v11}, Ll/۟ۤ᩺;-><init>(Ljava/lang/String;Ll/᩻ۡ᩺;Ll/ۤ۠᩺;)V

    sget v2, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v2, :cond_6

    goto/16 :goto_7

    :cond_6
    invoke-direct {v6, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 857
    invoke-static {v6}, Ll/ۖܽ;->ۢ᩹۠(Ljava/lang/Object;)V

    return-void

    :sswitch_8
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    if-eqz v5, :cond_7

    const-string v2, "\u06e4\u073f"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, -0x6f3d

    const v8, -0x7b94a269

    xor-int/2addr v6, v8

    const v8, 0x3e3c29a5

    goto/16 :goto_a

    :cond_7
    const-string v2, "\u06d9\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, -0x285

    const v8, -0x1b2a97f6

    xor-int/2addr v6, v8

    const v8, -0x2e0db840

    goto/16 :goto_a

    .line 837
    :sswitch_9
    iget-object v1, v4, Ll/᩶ۡ᩺;->ۙ:Ll/ܿܿۚ;

    invoke-static {v1}, Ll/ۗܳ;->ܽܳۡ(Ljava/lang/Object;)V

    :sswitch_a
    return-void

    :sswitch_b
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    .line 92
    iget v5, v1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    const/4 v2, -0x2

    if-eq v5, v2, :cond_8

    const-string v2, "\u06e1\u05a1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    mul-int/lit8 v2, v2, -0x1b

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, -0x2fdf

    const v8, 0x18ccda3f

    xor-int/2addr v6, v8

    const v8, -0x177bd29e

    goto/16 :goto_a

    :cond_8
    const-string v2, "\u1a7b\u06e4"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v20

    mul-int/lit8 v2, v2, -0x61

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, -0x7437

    const v8, -0x5fb8ab9f

    xor-int/2addr v6, v8

    const v8, 0x42a3b2f3

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    .line 0
    invoke-static {v1, v3}, Ll/֫ۛ;->ۨܰۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 808
    iget-object v4, v0, Ll/᩵۠᩺;->ۙ:Ll/᩶ۡ᩺;

    iget-object v2, v4, Ll/᩶ۡ᩺;->ۙ:Ll/ܿܿۚ;

    invoke-virtual {v2}, Ll/ܿܿۚ;->ۖ()Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "\u1a77\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, 0x2925

    const v8, 0x69da7de8

    xor-int/2addr v6, v8

    const v8, -0x2c986bf3

    goto/16 :goto_a

    :cond_9
    const-string v2, "\u06e4\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, 0x296d

    const v8, -0x30d3986e

    xor-int/2addr v6, v8

    const v8, 0x338a8c70

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    .line 0
    invoke-static {v14, v15, v7, v13}, Ll/֨ۖ;->ۨۜۧ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 770
    sget v2, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v2, :cond_a

    goto/16 :goto_2

    :cond_a
    const-string v2, "\u0730\u06e0"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, -0x2ded

    const v8, -0x3c4f37b3

    xor-int/2addr v6, v8

    const v8, -0x50389ca5

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    .line 0
    sget-object v14, Ll/᩵۠᩺;->ܿ۫۠:[S

    const/4 v15, 0x1

    const/4 v7, 0x4

    sget-boolean v2, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v2, :cond_b

    :goto_7
    goto/16 :goto_4

    :cond_b
    const-string v2, "\u1a7a\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    mul-int/lit8 v2, v2, 0x27

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, -0x7863

    const v8, -0x58b8c73e

    xor-int/2addr v6, v8

    const v8, -0x435416e5

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    const v2, 0xa3b1

    const v13, 0xa3b1

    goto :goto_8

    :sswitch_10
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    const/16 v2, 0x4f8f

    const/16 v13, 0x4f8f

    :goto_8
    const-string v2, "\u06dc\u073f"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, 0x1b

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, -0x2fd7

    const v8, 0x3c2594d

    xor-int/2addr v6, v8

    const v8, 0x51a12dc1

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    mul-int v2, v12, v12

    sub-int v2, v2, v24

    if-gez v2, :cond_c

    const-string v2, "\u0736\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, -0x4d

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, 0x18d1

    const v8, -0x318f7704

    xor-int/2addr v6, v8

    const v8, -0x2586ff4f

    goto/16 :goto_a

    :cond_c
    const-string v2, "\u1a7a\u06e4"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, -0x1b9f

    const v8, -0x1be7d49e

    xor-int/2addr v6, v8

    const v8, -0xd4b7f8c

    goto :goto_a

    :sswitch_12
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    mul-int v24, v18, v19

    move/from16 v8, v18

    add-int/lit16 v12, v8, 0xcbe

    sget-boolean v2, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v2, :cond_d

    goto :goto_b

    :cond_d
    const-string v2, "\u05a1\u0736"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, 0x7415

    const v9, 0x7005335a

    xor-int/2addr v6, v9

    const v9, 0x3e17fd0f

    goto/16 :goto_d

    :sswitch_13
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    aget-short v18, v16, v17

    const/16 v19, 0x32f8

    .line 540
    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v2, :cond_e

    move-object/from16 v6, v23

    move-object/from16 v8, v25

    move/from16 v9, v26

    :goto_9
    const-string v2, "\u0730\u0733"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v21

    xor-int v11, v2, v20

    mul-int/lit16 v11, v11, -0x7989

    const v23, 0x23cd0dc7

    xor-int v11, v11, v23

    const v23, 0x49336f70    # 734967.0f

    goto/16 :goto_5

    :cond_e
    const-string v2, "\u0736\u06e8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, 0x3d49

    const v8, -0x45c38b4a

    xor-int/2addr v6, v8

    const v8, -0x6bae56e2

    :goto_a
    xor-int/2addr v2, v8

    goto :goto_e

    :goto_b
    const-string v2, "\u0736\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v20, v2

    mul-int/lit8 v2, v2, -0x5

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, 0x2a07

    const v9, 0xa7b4c0

    xor-int/2addr v6, v9

    const v9, -0x266dfc34

    goto :goto_d

    :cond_f
    const-string v2, "\u1a77\u06e8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v20

    mul-int/lit8 v2, v2, 0x2b

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, 0xee9

    const v9, -0x6b6ae87e

    xor-int/2addr v6, v9

    const v9, -0x72b7f66b

    goto :goto_d

    :sswitch_14
    move-object/from16 v23, v6

    move-object/from16 v25, v8

    move/from16 v26, v9

    move/from16 v8, v18

    sget-object v16, Ll/᩵۠᩺;->ܿ۫۠:[S

    .line 394
    sget-boolean v2, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v2, :cond_10

    :goto_c
    const-string v2, "\u1a79\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v20

    mul-int/lit8 v2, v2, -0x15

    xor-int v6, v2, v21

    mul-int/lit16 v6, v6, 0x3a5d

    const v9, 0x7c32dca6

    xor-int/2addr v6, v9

    const v9, -0x1c239cfe

    goto :goto_d

    :cond_10
    const-string v2, "\u1a77\u06e2"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v21, v2

    mul-int/lit8 v2, v2, 0x7

    xor-int v6, v2, v20

    mul-int/lit16 v6, v6, -0x73b7

    const v9, -0x584c701f

    xor-int/2addr v6, v9

    const v9, -0x7e29bd33

    :goto_d
    xor-int/2addr v2, v9

    move/from16 v18, v8

    :goto_e
    move-object/from16 v8, v25

    move/from16 v9, v26

    :goto_f
    move-object/from16 v27, v23

    move/from16 v23, v2

    move v2, v6

    move-object/from16 v6, v27

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7297e3b1 -> :sswitch_e
        -0x61ffa4a3 -> :sswitch_1
        -0x5d7003e2 -> :sswitch_0
        -0x5b6b738c -> :sswitch_d
        -0x5b5ce606 -> :sswitch_e
        -0x55c2160e -> :sswitch_1
        -0x50535325 -> :sswitch_10
        -0x4790a04f -> :sswitch_0
        -0x45ea2aec -> :sswitch_14
        -0x3d5fa401 -> :sswitch_2
        -0x3d13062b -> :sswitch_f
        -0x3462aebd -> :sswitch_8
        -0x2f61e3ee -> :sswitch_9
        -0x2a54c229 -> :sswitch_11
        -0x2a3c7b75 -> :sswitch_11
        -0x27c9da92 -> :sswitch_b
        -0x25d58f38 -> :sswitch_6
        -0x22e49a48 -> :sswitch_13
        -0x200ce37c -> :sswitch_14
        -0x47e568c -> :sswitch_b
        0x3e41f06 -> :sswitch_d
        0x11352969 -> :sswitch_5
        0x11a797e1 -> :sswitch_c
        0x16a13e68 -> :sswitch_10
        0x22ac172d -> :sswitch_4
        0x2424e7af -> :sswitch_a
        0x251ea95f -> :sswitch_6
        0x349d055d -> :sswitch_12
        0x35e41944 -> :sswitch_7
        0x38d8da20 -> :sswitch_a
        0x3c60e5bc -> :sswitch_3
        0x3f82b5be -> :sswitch_5
        0x4bd1035d -> :sswitch_c
        0x5201e06b -> :sswitch_4
        0x5671097a -> :sswitch_13
        0x590e2cbd -> :sswitch_7
        0x6dff160a -> :sswitch_3
        0x7047cada -> :sswitch_12
        0x7790e65b -> :sswitch_f
        0x7913570b -> :sswitch_8
        0x7d472c9f -> :sswitch_9
        0x7f5f3fe3 -> :sswitch_2
    .end sparse-switch
.end method
