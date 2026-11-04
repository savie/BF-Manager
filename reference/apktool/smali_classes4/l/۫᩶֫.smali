.class public final synthetic Ll/۫᩶֫;
.super Ljava/lang/Object;
.source "F6IK"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# static fields
.field private static final ᩴܺ᩷:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۫᩶֫;->ᩴܺ᩷:[S

    return-void

    :array_0
    .array-data 2
        0x654s
        0x73b0s
        0x738cs
        0x7395s
        0x7387s
        0x7389s
        0x738es
        0x73c0s
        0x738cs
        0x7389s
        0x7382s
        0x7392s
        0x7381s
        0x7392s
        0x7399s
        0x73c0s
        0x7383s
        0x7381s
        0x738es
        0x7383s
        0x7385s
        0x738cs
        0x738cs
        0x7381s
        0x7394s
        0x7389s
        0x738fs
        0x738es
    .end array-data
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, -0x54345ac3

    sget v10, Ll/ۖۖ;->᩵ۜ֨:I

    sget v11, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v12, "\u1a75\u06da"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x1f

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x6709

    const v14, 0x7c178f57

    xor-int/2addr v13, v14

    const v14, -0x528c1b78

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x26d9

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v13, p1

    const/4 v1, 0x0

    .line 6
    sget v12, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v12, :cond_b

    goto/16 :goto_7

    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v12, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v12, :cond_1

    :cond_0
    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_8

    :cond_1
    const-string v12, "\u06db\u1a78"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x7c09

    const v14, 0x12cb034e

    xor-int/2addr v13, v14

    const v14, 0x718ccf70

    goto :goto_0

    .line 19
    :sswitch_1
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v12, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v12, :cond_2

    :goto_3
    move-object/from16 v13, p1

    goto/16 :goto_7

    :cond_2
    :goto_4
    move-object/from16 v13, p1

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_3

    .line 58
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto :goto_3

    .line 92
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    const/4 v0, 0x0

    return-object v0

    .line 94
    :sswitch_5
    new-instance v12, Ljava/lang/Thread;

    sget-object v13, Ll/۫᩶֫;->ᩴܺ᩷:[S

    sget v14, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v14, :cond_3

    goto :goto_4

    :cond_3
    const/4 v14, 0x1

    .line 37
    sget v15, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v15, :cond_4

    goto :goto_2

    :cond_4
    const/16 v15, 0x1b

    .line 59
    sget-boolean v16, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v16, :cond_5

    goto :goto_4

    .line 94
    :cond_5
    invoke-static {v13, v14, v15, v8}, Ll/ۖ᩹;->ᩳۨ֨([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    invoke-direct {v12, v13, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 95
    invoke-virtual {v12, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v12

    :sswitch_6
    move-object/from16 v13, p1

    const v8, 0x8e12

    goto :goto_5

    :sswitch_7
    move-object/from16 v13, p1

    const/16 v8, 0x73e0

    :goto_5
    const-string v12, "\u06e7\u1a75"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x210b

    const v15, 0x44692e60

    xor-int/2addr v14, v15

    const v15, 0x1ac21279

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v13, p1

    add-int/lit8 v12, v7, 0x1

    sub-int v12, v5, v12

    if-ltz v12, :cond_6

    const-string v12, "\u06e2\u1a75"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x7a5b

    const v15, -0xaf4c059

    xor-int/2addr v14, v15

    const v15, -0x34cb607f    # -1.1837313E7f

    goto/16 :goto_9

    :cond_6
    const-string v12, "\u1a78\u1a78"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x73

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x6803

    const v15, -0x6d3ce195

    xor-int/2addr v14, v15

    const v15, 0x7a2af136

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v13, p1

    mul-int v7, v2, v6

    .line 73
    sget v12, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v12, :cond_7

    goto :goto_6

    :cond_7
    const-string v12, "\u1a7b\u1a75"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x6fb9

    const v15, 0x7340d7cb

    xor-int/2addr v14, v15

    const v15, 0x33f5a11a

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v13, p1

    mul-int v5, v4, v4

    const/4 v6, 0x2

    .line 80
    sget v12, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v12, :cond_8

    :goto_6
    const-string v12, "\u1a79\u1a77"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x7d79

    const v15, -0x1eff508d

    xor-int/2addr v14, v15

    const v15, 0x5bc9b6d6

    goto/16 :goto_9

    :cond_8
    const-string v12, "\u06e8\u05ab"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x7193

    const v15, 0x761ef841

    xor-int/2addr v14, v15

    const v15, -0x14e35a23

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v13, p1

    add-int v4, v2, v3

    .line 19
    sget v12, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v12, :cond_9

    const-string v12, "\u073a\u06eb"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x3d1

    const v15, 0x1719c692

    xor-int/2addr v14, v15

    const v15, -0x39b2defb

    goto/16 :goto_9

    :cond_9
    const-string v12, "\u1a77\u0733"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x2d47

    const v15, 0x3a20d83b

    xor-int/2addr v14, v15

    const v15, 0x4c80fdff    # 6.762905E7f

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v13, p1

    aget-short v2, v0, v1

    const/4 v3, 0x1

    .line 22
    sget v12, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v12, :cond_a

    goto :goto_7

    :cond_a
    const-string v12, "\u06e0\u1a74"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x37

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x5bb7

    const v15, 0x37338f39

    xor-int/2addr v14, v15

    const v15, -0x46f7fa95

    goto/16 :goto_9

    :goto_7
    const-string v12, "\u06d6\u06e0"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x39

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x2025

    const v15, -0x68a2aa9f

    xor-int/2addr v14, v15

    const v15, -0x3abb7135

    goto :goto_9

    :cond_b
    const-string v12, "\u1a74\u1a74"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x31

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x79db

    const v15, -0x7dcc4595

    xor-int/2addr v14, v15

    const v15, -0x2b64fbc4

    goto :goto_9

    :sswitch_d
    move-object/from16 v13, p1

    sget-object v0, Ll/۫᩶֫;->ᩴܺ᩷:[S

    .line 92
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_8

    :cond_c
    const-string v12, "\u06df\u1a73"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x4511

    const v15, -0x3495ecc5    # -1.5340347E7f

    xor-int/2addr v14, v15

    const v15, -0x544e852a

    goto :goto_9

    :sswitch_e
    move-object/from16 v13, p1

    .line 58
    sget v12, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v12, :cond_d

    :goto_8
    const-string v12, "\u1a77\u06d9"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x55

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x414b

    const v15, -0x65f735bd

    xor-int/2addr v14, v15

    const v15, 0x5fb4fa70

    goto :goto_9

    :cond_d
    const-string v12, "\u1a76\u073f"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x23ad

    const v15, 0x3017c17a

    xor-int/2addr v14, v15

    const v15, -0x2a5b58a1

    :goto_9
    xor-int/2addr v12, v15

    move v13, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7597a8c8 -> :sswitch_c
        -0x755d1479 -> :sswitch_5
        -0x57a0d121 -> :sswitch_6
        -0x5116d47d -> :sswitch_8
        -0x35f0b67a -> :sswitch_5
        -0x34550fa8 -> :sswitch_2
        -0x31e58f19 -> :sswitch_0
        -0x2795adf5 -> :sswitch_4
        -0x231c300d -> :sswitch_a
        -0x161c5751 -> :sswitch_6
        -0x136c1bb2 -> :sswitch_1
        0x15cf74e -> :sswitch_2
        0x57d2e5a -> :sswitch_b
        0xcdb532f -> :sswitch_3
        0xfe398e2 -> :sswitch_1
        0x1f29a93d -> :sswitch_4
        0x2683abcc -> :sswitch_9
        0x32bc27e5 -> :sswitch_7
        0x45c79546 -> :sswitch_d
        0x4686186e -> :sswitch_d
        0x53fb0aa1 -> :sswitch_a
        0x540ec28e -> :sswitch_e
        0x58354b9f -> :sswitch_e
        0x5b520237 -> :sswitch_0
        0x5b5479c2 -> :sswitch_7
        0x666264c9 -> :sswitch_8
        0x7524ca2c -> :sswitch_c
        0x75cd06a5 -> :sswitch_3
        0x7603bbdd -> :sswitch_9
        0x78a80172 -> :sswitch_b
    .end sparse-switch
.end method
