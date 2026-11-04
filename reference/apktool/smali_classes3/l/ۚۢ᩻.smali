.class public final synthetic Ll/ۚۢ᩻;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ljava/util/function/Consumer;


# static fields
.field private static final ۟ۖܽ:[S


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚۢ᩻;->۟ۖܽ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x23c2s
        0x5e8cs
        0x5e91s
        0x258es
        0x3c15s
        -0x31fds
    .end array-data
.end method

.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/ۚۢ᩻;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/֨ۢ᩻;)V
    .locals 5

    const p1, -0x47bdb4b7

    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    const/4 v2, 0x0

    .line 0
    iput v2, p0, Ll/ۚۢ᩻;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v2, "\u073f\u1a78"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x13

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5d57

    const v4, -0xe6e03bd

    xor-int/2addr v3, v4

    const v4, 0xefa2c52

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v1

    mul-int/lit16 p1, p1, -0x3209

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "\u06df\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x23

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5923

    const v4, 0x78906e9

    xor-int/2addr v3, v4

    const v4, 0x2559da00

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v2, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "\u1a74\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x3d91

    const v4, 0x60d42a1e

    xor-int/2addr v3, v4

    const v4, 0x4d98ae39    # 3.2019434E8f

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u073d\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0xf

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5a6b

    const v4, 0x96947c9

    xor-int/2addr v3, v4

    const v4, -0x7608bc60

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    :goto_1
    const-string v2, "\u06da\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x66b5

    const v4, -0x20394e03

    xor-int/2addr v3, v4

    const v4, -0x65014d97

    goto/16 :goto_0

    :sswitch_4
    return-void

    :sswitch_5
    sget v2, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v2, :cond_3

    const-string v2, "\u1a78\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x17

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x113b

    const v4, -0x574a4bc6

    xor-int/2addr v3, v4

    const v4, 0x6069dd2e

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u0736\u06d6"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4d19

    const v4, -0x171e0231

    xor-int/2addr v3, v4

    const v4, 0x40d0b888

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6ee997a3 -> :sswitch_5
        -0x68263bb5 -> :sswitch_0
        -0x55335694 -> :sswitch_4
        -0x3e53b1bc -> :sswitch_3
        -0x275db2cd -> :sswitch_2
        -0x17fcf3cf -> :sswitch_5
        -0x11c309cd -> :sswitch_1
        0x18be59df -> :sswitch_1
        0x1f05e1c7 -> :sswitch_4
        0x5aead3c2 -> :sswitch_2
        0x63449c40 -> :sswitch_0
        0x6dcce6d9 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 17

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x61b03798    # -1.0999932E-20f

    sget v11, Ll/֫֨;->᩶ܺۡ:I

    sget v12, Ll/֡᩵;->ۤܳ۬:I

    const-string v13, "\u06ec\u06e1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x59

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1cdb

    const v15, -0x24158e53

    xor-int/2addr v14, v15

    const v15, -0x45d7220c    # -6.441765E-4f

    :goto_0
    xor-int/2addr v13, v15

    const/4 v15, 0x0

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x2cb7

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v1, p0

    move-object/from16 v16, v7

    aget-short v4, v2, v3

    const/16 v5, 0x6cdc

    sget v7, Ll/֫֡;->֫ۙۖ:I

    if-gtz v7, :cond_b

    goto/16 :goto_9

    .line 622
    :sswitch_0
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v13, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v13, :cond_0

    goto :goto_4

    :cond_0
    :goto_2
    move-object/from16 v1, p0

    goto/16 :goto_b

    .line 480
    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v13

    if-nez v13, :cond_1

    goto :goto_4

    :cond_1
    move-object/from16 v16, v7

    goto/16 :goto_5

    .line 400
    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v13, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v13, :cond_2

    :goto_3
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    goto/16 :goto_c

    .line 668
    :sswitch_3
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto :goto_3

    .line 735
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    return-void

    .line 7
    :sswitch_5
    move-object/from16 v0, p1

    check-cast v0, Ll/ۛ֨ۗ;

    .line 10
    invoke-static {v0}, Ll/ۤܳ᩵;->ۙ(Ll/ۛ֨ۗ;)V

    return-void

    .line 743
    :sswitch_6
    new-instance v13, Ljava/lang/Thread;

    new-instance v14, Ll/ۧ᩷ۧ;

    const/4 v1, 0x4

    .line 20
    sget v16, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v16, :cond_3

    :cond_2
    :goto_4
    const-string v1, "\u06df\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v12, v1

    mul-int/lit8 v1, v1, 0x7b

    xor-int v13, v1, v11

    mul-int/lit16 v13, v13, 0x25ef

    const v14, -0xc05bdac

    xor-int/2addr v14, v13

    const v13, 0x1e923d8c

    goto/16 :goto_7

    .line 743
    :cond_3
    invoke-direct {v14, v1, v0, v15}, Ll/ۧ᩷ۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v13, v14}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v13}, Ll/ۗ֫;->ۚ᩻᩷(Ljava/lang/Object;)V

    return-void

    .line 13
    :sswitch_7
    invoke-static {v7, v8, v9, v6}, Ll/ۗۖ;->᩵᩻ۘ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 0
    invoke-static {v0, v1}, Ll/ۗ᩺;->֫᩶֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 353
    new-instance v1, Ll/۬֨ᩴ;

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v13

    if-eqz v13, :cond_4

    move-object/from16 v1, p0

    move-object/from16 v16, v7

    goto/16 :goto_9

    :cond_4
    sget-object v13, Ll/ۚۢ᩻;->۟ۖܽ:[S

    const/4 v14, 0x3

    move-object/from16 v16, v7

    const/4 v7, 0x3

    invoke-static {v13, v14, v7, v6}, Ll/֡۟;->ᩳۧܳ([SIII)Ljava/lang/String;

    move-result-object v7

    .line 508
    sget-boolean v13, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v13, :cond_5

    goto :goto_5

    .line 353
    :cond_5
    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    const v13, 0x7ec9ddda

    .line 320
    sget v14, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v14, :cond_6

    move-object/from16 v1, p0

    goto/16 :goto_9

    :cond_6
    xor-int/2addr v7, v13

    .line 353
    invoke-direct {v1, v0, v7}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    invoke-static {v1}, Ll/֨ᩳ;->᩻۠۫(Ljava/lang/Object;)V

    .line 354
    new-instance v15, Ll/ܿۛܳ;

    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v7, :cond_7

    move-object/from16 v1, p0

    goto/16 :goto_a

    :cond_7
    invoke-direct {v15, v1}, Ll/ܿۛܳ;-><init>(Ljava/lang/Object;)V

    sget-object v1, Ll/ۧ۬᩻;->᩸:Ljava/util/concurrent/locks/ReentrantLock;

    .line 74
    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v1, :cond_8

    :goto_5
    const-string v1, "\u073f\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v1, v1, -0x5f

    xor-int v7, v1, v11

    mul-int/lit16 v7, v7, 0x3cfd

    const v13, 0x3624797c

    xor-int v14, v7, v13

    const v7, 0x7e6834ea

    goto :goto_6

    :cond_8
    const-string v1, "\u1a76\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v7, v1, v12

    mul-int/lit16 v7, v7, 0x5675

    const v13, -0x72b43ebd

    xor-int v14, v7, v13

    const v7, 0x42d62b6f

    :goto_6
    xor-int v13, v1, v7

    goto/16 :goto_e

    .line 13
    :sswitch_8
    move-object/from16 v0, p1

    check-cast v0, Ll/ܽ֡֫;

    sget-object v7, Ll/ۚۢ᩻;->۟ۖܽ:[S

    const/4 v8, 0x1

    const/4 v9, 0x2

    .line 252
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v1

    if-eqz v1, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v1, v1, -0x43

    xor-int v13, v1, v11

    mul-int/lit16 v13, v13, -0x99d

    const v14, 0x396b21ec

    xor-int/2addr v14, v13

    const v13, 0x7494046b

    :goto_7
    xor-int/2addr v13, v1

    goto/16 :goto_1

    :sswitch_9
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    .line 2
    iget v7, v1, Ll/ۚۢ᩻;->ܰ:I

    packed-switch v7, :pswitch_data_0

    const-string v7, "\u073d\u06dc"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    mul-int/lit8 v7, v7, -0x33

    xor-int v13, v7, v11

    mul-int/lit16 v13, v13, -0x1e09

    const v14, 0x201a8337

    xor-int/2addr v14, v13

    const v13, -0x383606c0    # -103410.5f

    goto/16 :goto_d

    :pswitch_0
    const-string v7, "\u073d\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v11, v7

    mul-int/lit8 v7, v7, -0x1b

    xor-int v13, v7, v12

    mul-int/lit16 v13, v13, -0x4913

    const v14, 0x64ce9d16

    xor-int/2addr v14, v13

    const v13, -0x230ecf4b

    goto/16 :goto_d

    :sswitch_a
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    const v6, 0x85ff

    goto :goto_8

    :sswitch_b
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    const/16 v6, 0x5ee5

    :goto_8
    const-string v7, "\u1a78\u06e1"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v11

    xor-int v13, v7, v12

    mul-int/lit16 v13, v13, 0x1c9b

    const v14, 0x73fc0661

    xor-int/2addr v14, v13

    const v13, -0x5df4e233

    goto/16 :goto_d

    :sswitch_c
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    mul-int v7, v4, v5

    mul-int v13, v4, v4

    const v14, 0xb929744

    add-int/2addr v13, v14

    sub-int/2addr v13, v7

    if-gez v13, :cond_a

    const-string v7, "\u1a7a\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    xor-int v13, v7, v11

    mul-int/lit16 v13, v13, -0x52f7

    const v14, 0x27a4665

    xor-int/2addr v14, v13

    const v13, 0x17aeeed9

    goto/16 :goto_d

    :cond_a
    const-string v7, "\u06e2\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v11

    mul-int/lit8 v7, v7, -0x3b

    xor-int v13, v7, v12

    mul-int/lit16 v13, v13, -0x483

    const v14, -0x4ddd0ad0

    xor-int/2addr v14, v13

    const v13, -0x1881a392

    goto/16 :goto_d

    :goto_9
    const-string v7, "\u06e0\u06d9"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v12

    mul-int/lit8 v7, v7, -0x79

    xor-int v13, v7, v11

    mul-int/lit16 v13, v13, 0xad

    const v14, 0x90770f5

    xor-int/2addr v14, v13

    const v13, 0xb74f63f

    goto/16 :goto_d

    :cond_b
    const-string v7, "\u1a79\u1a78"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v12

    mul-int/lit8 v7, v7, -0x25

    xor-int v13, v7, v11

    mul-int/lit16 v13, v13, -0x691f

    const v14, -0x5990710d

    xor-int/2addr v14, v13

    const v13, -0x49977cac

    goto :goto_d

    :sswitch_d
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    const/4 v3, 0x0

    .line 333
    sget v7, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v7, :cond_c

    :goto_a
    move-object/from16 v7, v16

    :goto_b
    const-string v13, "\u06df\u06db"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5523

    const v15, 0x7d23c679

    xor-int/2addr v14, v15

    const v15, 0x481186cf

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u073f\u1a75"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v11

    xor-int v13, v7, v12

    mul-int/lit16 v13, v13, 0x6c8f

    const v14, 0xdb1ff83

    xor-int/2addr v14, v13

    const v13, -0x377c2838

    goto :goto_d

    :sswitch_e
    move-object/from16 v1, p0

    move-object/from16 v16, v7

    sget-object v2, Ll/ۚۢ᩻;->۟ۖܽ:[S

    .line 689
    sget v7, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v7, :cond_d

    :goto_c
    const-string v7, "\u073f\u06d7"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v11

    xor-int v13, v7, v12

    mul-int/lit16 v13, v13, 0x226f

    const v14, -0x34dc2c64    # -1.073654E7f

    xor-int/2addr v14, v13

    const v13, -0x47a8b785

    goto :goto_d

    :cond_d
    const-string v7, "\u06db\u05a8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    mul-int/lit8 v7, v7, -0x31

    xor-int v13, v7, v11

    mul-int/lit16 v13, v13, -0x7e2d

    const v14, 0x42222285

    xor-int/2addr v14, v13

    const v13, -0x7fc8e1c7

    :goto_d
    xor-int/2addr v13, v7

    :goto_e
    move-object/from16 v7, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x70622455 -> :sswitch_d
        -0x6f4c2797 -> :sswitch_5
        -0x67a7b827 -> :sswitch_8
        -0x6287cbea -> :sswitch_a
        -0x5558a292 -> :sswitch_3
        -0x3d3fb150 -> :sswitch_4
        -0x341c0bc5 -> :sswitch_e
        -0x311d5843 -> :sswitch_8
        -0x2cfc6ed1 -> :sswitch_a
        -0x29d5535f -> :sswitch_0
        -0x276038e9 -> :sswitch_9
        -0x22b0d5f7 -> :sswitch_7
        -0x12e35798 -> :sswitch_d
        0x40fd2f1 -> :sswitch_2
        0xb80c122 -> :sswitch_6
        0xc4d8f14 -> :sswitch_c
        0xd88fa9b -> :sswitch_4
        0x1b8d1174 -> :sswitch_b
        0x1d295a85 -> :sswitch_2
        0x24a8a47a -> :sswitch_e
        0x3286bca0 -> :sswitch_1
        0x36bb75c8 -> :sswitch_5
        0x37508c4e -> :sswitch_9
        0x3842f1ee -> :sswitch_6
        0x3f3a70a5 -> :sswitch_3
        0x4d37a650 -> :sswitch_1
        0x52b23836 -> :sswitch_7
        0x58ce67df -> :sswitch_c
        0x59b266f2 -> :sswitch_b
        0x6bd0d1d2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
