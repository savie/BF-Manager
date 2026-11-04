.class public final synthetic Ll/ܶ֨᩻;
.super Ljava/lang/Object;
.source "T5M8"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ܳ᩻֨:[S


# instance fields
.field public final synthetic ܰ:Lorg/json/JSONObject;

.field public final synthetic ܿ:J

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x16

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܶ֨᩻;->ܳ᩻֨:[S

    return-void

    :array_0
    .array-data 2
        0x1c20s
        0x5a64s
        0x5a79s
        0x5a6fs
        0x5a6es
        0x5a79s
        0x5a42s
        0x5a6fs
        0x5a6cs
        0x5a6es
        0x5a7fs
        0x5a58s
        0x5a7fs
        0x5a79s
        0x5a62s
        0x5a65s
        0x5a6cs
        0x5a23s
        0x5a25s
        0x5a25s
        0x5a25s
        0x5a22s
    .end array-data
.end method

.method public synthetic constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;J)V
    .locals 6

    const v0, -0x3561ffb8    # -5177380.0f

    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4367

    const v5, 0x474b3b9e

    xor-int/2addr v4, v5

    const v5, 0x405a3bba

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x34fb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-lez v3, :cond_b

    goto/16 :goto_2

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-wide p3, p0, Ll/ܶ֨᩻;->ܿ:J

    return-void

    .line 3
    :sswitch_5
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18e1

    const v5, -0x100c410e

    xor-int/2addr v4, v5

    const v5, -0x66479f8d

    goto :goto_0

    .line 2
    :sswitch_6
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    const-string v3, "\u073d\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x42ab

    const v5, -0x6011d6fd

    xor-int/2addr v4, v5

    const v5, -0x5d41587

    goto :goto_0

    :cond_2
    const-string v3, "\u1a79\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6661

    const v5, -0x3593334c    # -3879725.0f

    xor-int/2addr v4, v5

    const v5, -0x2f5f9798

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6883

    const v5, -0x43388bc8

    xor-int/2addr v4, v5

    const v5, 0x7f1effc6

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a78\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x270f

    const v5, -0x47b9b848

    xor-int/2addr v4, v5

    const v5, 0x7a709dee

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u0733\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x107

    const v5, -0xbf87842

    xor-int/2addr v4, v5

    const v5, 0x229808e1

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_6

    goto :goto_1

    :cond_6
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a6b

    const v5, 0x4ab0cb38    # 5793180.0f

    xor-int/2addr v4, v5

    const v5, -0x32ada468

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-nez v3, :cond_7

    :goto_1
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2dcf

    const v5, -0x120cc307

    xor-int/2addr v4, v5

    const v5, 0x2591ef3d

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d8f

    const v5, -0x151375a

    xor-int/2addr v4, v5

    const v5, 0x7fd855d

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_9

    :cond_8
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a4f

    const v5, 0x5e0ece28

    xor-int/2addr v4, v5

    const v5, -0x7e5eade8

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073d\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4f27

    const v5, 0x5370080f

    xor-int/2addr v4, v5

    const v5, -0x2d3bc881

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-gtz v3, :cond_a

    :goto_2
    const-string v3, "\u0736\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7b87

    const v5, 0x37f92d44

    xor-int/2addr v4, v5

    const v5, -0x2d4067ac

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d7\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6949

    const v5, 0x7b59e593

    xor-int/2addr v4, v5

    const v5, 0x799f3b94

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܶ֨᩻;->ܰ:Lorg/json/JSONObject;

    iput-object p2, p0, Ll/ܶ֨᩻;->᩶:Ljava/lang/String;

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u1a74\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3533

    const v5, -0x5a1c9373

    xor-int/2addr v4, v5

    const v5, -0x2dc2f51e

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1fef

    const v5, 0x39f13010

    xor-int/2addr v4, v5

    const v5, -0x1dc4247c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6b825813 -> :sswitch_a
        -0x6a2aef8c -> :sswitch_b
        -0x5e02dfa4 -> :sswitch_1
        -0x57b29b4b -> :sswitch_8
        -0x52190d02 -> :sswitch_0
        -0x4015534a -> :sswitch_5
        -0x3570bf4d -> :sswitch_e
        -0x28b6aaa8 -> :sswitch_6
        -0x25b02fd3 -> :sswitch_a
        -0x21fa33c0 -> :sswitch_9
        -0x1d910dc6 -> :sswitch_3
        -0x169583e7 -> :sswitch_8
        -0xf59b8e2 -> :sswitch_7
        -0xf04c88b -> :sswitch_2
        -0xe17eb9f -> :sswitch_c
        -0xcb68d68 -> :sswitch_0
        -0x8961b47 -> :sswitch_6
        0x5bfcd7c -> :sswitch_7
        0xbfde4f3 -> :sswitch_c
        0x11cc9a86 -> :sswitch_4
        0x16fb330a -> :sswitch_9
        0x2b8d2898 -> :sswitch_e
        0x5035dafe -> :sswitch_d
        0x58eba5e4 -> :sswitch_2
        0x5a76b2bb -> :sswitch_5
        0x5ab311be -> :sswitch_b
        0x5ac8bfba -> :sswitch_3
        0x68ed751e -> :sswitch_d
        0x725cd12a -> :sswitch_1
        0x738be6ad -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 26

    move-object/from16 v0, p0

    const/4 v2, 0x0

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

    const v18, -0x486a0586

    sget v19, Ll/֫۠;->ۢᩴ᩺:I

    sget v20, Ll/ۖۙ;->ۤۧۤ:I

    const-string v21, "\u06df\u06ec"

    invoke-static/range {v21 .. v21}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v19

    xor-int v1, v21, v20

    mul-int/lit16 v1, v1, -0x2f7

    const v23, -0x1d7e49cf

    xor-int v1, v1, v23

    const v23, -0x544148de

    xor-int v21, v21, v23

    move-object/from16 v16, v4

    move-object v13, v12

    move-object v5, v15

    move/from16 v22, v21

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, -0x486a0586

    const/16 v23, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v8, v21, v20

    mul-int/lit16 v8, v8, 0x1a97

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v1, v8

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    move-object/from16 v22, v5

    aget-short v18, v16, v17

    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_c

    goto/16 :goto_d

    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v22, v5

    goto/16 :goto_8

    :cond_1
    move-object/from16 v22, v5

    goto/16 :goto_d

    .line 121
    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v22, v5

    :goto_2
    move/from16 v1, v18

    goto/16 :goto_c

    .line 39
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-gez v1, :cond_0

    :goto_3
    move-object/from16 v22, v5

    :goto_4
    move/from16 v1, v18

    goto/16 :goto_f

    .line 107
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    .line 128
    :sswitch_5
    invoke-static {v5, v6, v7, v12}, Ll/ۗ᩶;->ܳܶۢ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Ll/֡۟;->ۧۧ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    new-instance v1, Ljava/lang/Thread;

    .line 186
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_6

    .line 187
    :cond_3
    new-instance v8, Ll/ۧ֨᩻;

    move-object/from16 v22, v5

    iget-object v5, v0, Ll/ܶ֨᩻;->᩶:Ljava/lang/String;

    .line 133
    sget v24, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v24, :cond_4

    :goto_5
    goto :goto_4

    .line 187
    :cond_4
    iget-wide v2, v0, Ll/ܶ֨᩻;->ܿ:J

    invoke-direct {v8, v5, v4, v2, v3}, Ll/ۧ֨᩻;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 167
    invoke-direct {v1, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 187
    invoke-static {v1}, Ll/ۖ᩹;->᩷᩹ۖ(Ljava/lang/Object;)V

    return-void

    .line 128
    :sswitch_6
    invoke-static {v3, v2}, Ll/֨ۨ;->᩹ۧ۬(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ll/ܶ֨᩻;->ܳ᩻֨:[S

    const/16 v6, 0x8

    const/16 v7, 0xe

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_5

    :goto_6
    const-string v1, "\u1a7b\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, 0x6b

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, 0x1935

    const v22, -0x93ed3d8

    xor-int v8, v8, v22

    const v22, 0x50933b23

    goto :goto_7

    :cond_5
    const-string v1, "\u06db\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, -0xbe7

    const v22, -0x17e6db37

    xor-int v8, v8, v22

    const v22, 0x733bb43b

    :goto_7
    xor-int v22, v1, v22

    move v1, v8

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v22, v5

    invoke-static {v13, v14, v15, v12}, Ll/ۖ᩵;->ܿۖᩳ([SIII)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Ll/ܶ֨᩻;->ܰ:Lorg/json/JSONObject;

    .line 140
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_6

    :goto_8
    const-string v1, "\u073d\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, -0xc49

    const v8, -0x5af487ec

    xor-int/2addr v5, v8

    const v8, -0x7e050c17

    goto/16 :goto_a

    :cond_6
    const-string v1, "\u06e7\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x7d

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, 0x7bc5

    const v8, 0x6f87c304

    xor-int/2addr v5, v8

    const v8, -0x248568ad

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v22, v5

    const/4 v15, 0x7

    .line 7
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_d

    :cond_7
    const-string v1, "\u1a79\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x1547

    const v8, 0xb9725c7

    xor-int/2addr v5, v8

    const v8, -0x612a10ba

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v22, v5

    .line 128
    sget-object v1, Ll/ۗ֨᩻;->ۙ:Ll/ܽ᩻ۙ;

    sget-object v13, Ll/ܶ֨᩻;->ܳ᩻֨:[S

    const/4 v14, 0x1

    .line 145
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_8

    goto/16 :goto_2

    :cond_8
    const-string v1, "\u06e1\u1a76"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x33

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x7115

    const v8, 0x14bf49b7

    xor-int/2addr v5, v8

    const v8, -0x46fd079

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v22, v5

    const v1, 0xf5a7

    const v12, 0xf5a7

    goto :goto_9

    :sswitch_b
    move-object/from16 v22, v5

    const/16 v1, 0x5a0b

    const/16 v12, 0x5a0b

    :goto_9
    const-string v1, "\u073a\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x39

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, 0x65cb

    const v8, -0x74b33231

    xor-int/2addr v5, v8

    const v8, 0x3ee6fc96

    goto :goto_a

    :sswitch_c
    move-object/from16 v22, v5

    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int/2addr v1, v9

    if-gez v1, :cond_9

    const-string v1, "\u06eb\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v5, v1, v20

    mul-int/lit16 v5, v5, 0x5e4f

    const v8, 0x3ed5e10d

    xor-int/2addr v5, v8

    const v8, 0x45093701

    goto :goto_a

    :cond_9
    const-string v1, "\u05a8\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x21

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0x186b

    const v8, -0x79b986c0

    xor-int/2addr v5, v8

    const v8, -0x3274a24

    goto :goto_a

    :sswitch_d
    move-object/from16 v22, v5

    mul-int v9, v23, v23

    mul-int v10, v18, v18

    const v11, 0x12cce40

    .line 133
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_a

    goto/16 :goto_5

    :cond_a
    const-string v1, "\u06dc\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x37

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x2111

    const v8, 0x12867793

    xor-int/2addr v5, v8

    const v8, 0x236968ef

    :goto_a
    xor-int/2addr v1, v8

    move-object/from16 v25, v22

    move/from16 v22, v1

    move v1, v5

    :goto_b
    move-object/from16 v5, v25

    goto/16 :goto_0

    :sswitch_e
    move-object/from16 v22, v5

    move/from16 v1, v18

    add-int/lit16 v5, v1, 0x1158

    sget v8, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v8, :cond_b

    move/from16 v23, v5

    :goto_c
    const-string v5, "\u06e0\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int v5, v5, v20

    mul-int/lit8 v5, v5, 0x3

    xor-int v8, v5, v19

    mul-int/lit16 v8, v8, 0x4761

    const v18, -0x3cc435cf

    xor-int v8, v8, v18

    const v18, -0x174b228c

    xor-int v5, v5, v18

    move/from16 v18, v1

    move v1, v8

    move-object/from16 v25, v22

    move/from16 v22, v5

    goto :goto_b

    :cond_b
    const-string v8, "\u1a76\u06e8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v19

    xor-int v0, v8, v20

    mul-int/lit16 v0, v0, -0x4a87

    const v18, 0x719c790f

    xor-int v0, v0, v18

    const v18, 0x11a17da1

    xor-int v8, v8, v18

    move/from16 v18, v1

    move/from16 v23, v5

    move-object/from16 v5, v22

    move v1, v0

    move/from16 v22, v8

    goto :goto_12

    :goto_d
    const-string v0, "\u06e7\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x37ff

    const v5, -0x2a1983ab

    xor-int/2addr v1, v5

    const v5, -0x77316c9

    goto :goto_e

    :cond_c
    const-string v0, "\u1a76\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v20

    mul-int/lit16 v1, v1, -0x41df

    const v5, 0x48e8555d

    xor-int/2addr v1, v5

    const v5, 0x2707b44c

    :goto_e
    xor-int/2addr v0, v5

    goto :goto_11

    :sswitch_f
    move-object/from16 v22, v5

    move/from16 v1, v18

    sget-object v16, Ll/ܶ֨᩻;->ܳ᩻֨:[S

    const/16 v17, 0x0

    .line 65
    sget v0, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v0, :cond_d

    :goto_f
    const-string v0, "\u1a75\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v5, v0, v20

    mul-int/lit16 v5, v5, 0x1449

    const v8, -0x3ea9bcc2

    xor-int/2addr v5, v8

    const v8, 0x1354d03

    goto :goto_10

    :cond_d
    const-string v0, "\u06df\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x6f

    xor-int v5, v0, v19

    mul-int/lit16 v5, v5, -0x3c35

    const v8, -0x7db3c233

    xor-int/2addr v5, v8

    const v8, 0xb27ea5f

    :goto_10
    xor-int/2addr v0, v8

    move/from16 v18, v1

    move v1, v5

    :goto_11
    move-object/from16 v5, v22

    move/from16 v22, v0

    :goto_12
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72fff07d -> :sswitch_c
        -0x6b5ff216 -> :sswitch_b
        -0x5fabc2cd -> :sswitch_2
        -0x50e3a3bf -> :sswitch_0
        -0x4d478f4e -> :sswitch_1
        -0x497655d6 -> :sswitch_c
        -0x44aadf32 -> :sswitch_9
        -0x3ab707df -> :sswitch_6
        -0x34319f3d -> :sswitch_3
        -0x30a86c4c -> :sswitch_d
        -0x2e74fb0c -> :sswitch_a
        -0x2e516d38 -> :sswitch_a
        -0x239b34e4 -> :sswitch_5
        -0x1fae8bee -> :sswitch_6
        -0x1e75fac7 -> :sswitch_f
        -0x1a447191 -> :sswitch_4
        -0x4b35128 -> :sswitch_5
        0x90fee11 -> :sswitch_f
        0x16a161d0 -> :sswitch_7
        0x1c28e8b7 -> :sswitch_3
        0x2fcd4fb7 -> :sswitch_7
        0x34649ff4 -> :sswitch_8
        0x380e5aaa -> :sswitch_8
        0x4b021ff4 -> :sswitch_4
        0x5820d6a6 -> :sswitch_0
        0x5b962f65 -> :sswitch_d
        0x605e1ce8 -> :sswitch_1
        0x64dc206a -> :sswitch_b
        0x6b073abb -> :sswitch_e
        0x6d309307 -> :sswitch_e
        0x71dd05e6 -> :sswitch_2
        0x7a5e9287 -> :sswitch_9
    .end sparse-switch
.end method
