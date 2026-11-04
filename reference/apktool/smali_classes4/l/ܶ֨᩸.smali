.class public final Ll/ܶ֨᩸;
.super Ljava/lang/Object;
.source "25S1"

# interfaces
.implements Landroid/text/TextWatcher;
.implements Landroid/text/SpanWatcher;


# static fields
.field public static final ֡:Ljava/lang/Class;

.field private static final ᩳۡۚ:[S


# instance fields
.field public ܰ:Ll/᩺ۜ᩸;

.field public ܿ:I

.field public ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܶ֨᩸;->ᩳۡۚ:[S

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x16db1b13

    sget v9, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v10, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v11, "\u06d7\u0733"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x43

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7f6d

    const v13, 0x6be85cff

    xor-int/2addr v12, v13

    const v13, 0x5dc228b4

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x3e3f

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    const/16 v7, 0x3582

    goto/16 :goto_7

    .line 15
    :sswitch_0
    sget-object v1, Ll/ܶ֨᩸;->ᩳۡۚ:[S

    const/4 v2, 0x0

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v11

    if-gtz v11, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v11, "\u06ec\u1a7a"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x79e1

    const v13, -0x5bdcea37

    xor-int/2addr v12, v13

    const v13, -0x28d9db6e

    goto :goto_0

    .line 32
    :sswitch_1
    sput-object v0, Ll/ܶ֨᩸;->֡:Ljava/lang/Class;

    return-void

    .line 21
    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v11

    if-ltz v11, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v11, "\u1a74\u06df"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x19

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2135

    const v13, -0xa15236f

    xor-int/2addr v12, v13

    const v13, -0x724a0bce

    goto :goto_0

    .line 22
    :sswitch_3
    sget v11, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v11, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v11, "\u05a1\u06d8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x7a47

    const v13, 0x50e83542

    xor-int/2addr v12, v13

    const v13, -0x55d34aad

    goto :goto_0

    .line 2
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v11, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v11, :cond_6

    goto/16 :goto_3

    :sswitch_5
    const v7, 0xabcf

    goto/16 :goto_7

    .line 22
    :sswitch_6
    sget v11, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v11, :cond_7

    goto/16 :goto_4

    :sswitch_7
    mul-int/lit16 v4, v3, 0xe68

    .line 16
    sget-boolean v11, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v11, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v11, "\u1a75\u06d6"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7c6f

    const v13, -0x732a906a

    xor-int/2addr v12, v13

    const v13, -0x3c0191ea

    goto/16 :goto_0

    .line 21
    :sswitch_8
    sget v11, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v11, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v11, "\u06e0\u06d6"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x63

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x95

    const v13, -0x1462cabf

    xor-int/2addr v12, v13

    const v13, -0x683367b1

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x0

    goto/16 :goto_6

    .line 28
    :sswitch_a
    sget v11, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v11, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v11, "\u06e7\u1a7a"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x1d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x238b

    const v13, -0x3693e1c1

    xor-int/2addr v12, v13

    const v13, -0x35a19bbc    # -3643665.0f

    goto/16 :goto_0

    .line 9
    :sswitch_b
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v11, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v11, :cond_a

    :cond_6
    :goto_1
    const-string v11, "\u1a78\u05ab"

    .line 15
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x41

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3247

    const v13, 0x33606cbe

    xor-int/2addr v12, v13

    const v13, 0x5e4a23fa

    goto/16 :goto_0

    .line 14
    :sswitch_c
    sget v11, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v11, :cond_8

    :cond_7
    :goto_2
    const-string v11, "\u05a1\u0733"

    .line 21
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x17

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0xe67

    const v13, -0xdfb6d51

    xor-int/2addr v12, v13

    const v13, 0x3196635a

    goto/16 :goto_0

    :cond_8
    const-string v11, "\u1a7b\u1a79"

    .line 14
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0xd

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2769

    const v13, -0x5102b588

    xor-int/2addr v12, v13

    const v13, 0x154addc7

    goto/16 :goto_0

    .line 2
    :sswitch_d
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    :goto_3
    const-string v11, "\u0736\u1a78"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x52e7

    const v13, 0x721abe20

    xor-int/2addr v12, v13

    const v13, -0x266cbec8

    goto/16 :goto_0

    :sswitch_e
    add-int v11, v5, v6

    sub-int v11, v4, v11

    if-gtz v11, :cond_9

    const-string v11, "\u06e8\u06e8"

    .line 29
    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x4d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x2809

    const v13, -0x6ccdbcc

    xor-int/2addr v12, v13

    const v13, -0x10090880

    goto/16 :goto_0

    :cond_9
    const-string v11, "\u06db\u06da"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x63

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x2dd5

    const v13, -0x70150d2c

    xor-int/2addr v12, v13

    const v13, 0x2bb5b690

    goto/16 :goto_0

    .line 15
    :sswitch_f
    sget v11, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v11, :cond_b

    :cond_a
    :goto_4
    const-string v11, "\u1a78\u06e7"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x43f9

    const v13, -0x752746f4

    xor-int/2addr v12, v13

    const v13, 0x55f7b52a

    goto/16 :goto_0

    :cond_b
    const-string v11, "\u06e1\u05a1"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x6d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2f59

    const v13, 0x3f179cbd

    xor-int/2addr v12, v13

    const v13, -0x758b59b1

    goto/16 :goto_0

    .line 2
    :sswitch_10
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 16
    :sswitch_11
    aget-short v3, v1, v2

    sget v11, Ll/֫֡;->֫ۙۖ:I

    if-gtz v11, :cond_c

    goto :goto_5

    :cond_c
    const-string v11, "\u1a76\u06df"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x71

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x285f

    const v13, -0x1ad1da44

    xor-int/2addr v12, v13

    const v13, 0x78c6d17e

    goto/16 :goto_0

    :sswitch_12
    mul-int v5, v3, v3

    const v6, 0x33e290

    .line 15
    sget v11, Ll/᩺;->۫۬۫:I

    if-gtz v11, :cond_d

    :goto_5
    const-string v11, "\u1a77\u05a8"

    .line 16
    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x1d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2465

    const v13, 0x46f710f9

    xor-int/2addr v12, v13

    const v13, -0x56da0fb    # -3.800013E35f

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u1a7b\u06df"

    .line 15
    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x30cd

    const v13, 0x64d1f238

    xor-int/2addr v12, v13

    const v13, -0x42cb03df

    goto/16 :goto_0

    .line 0
    :sswitch_13
    :try_start_0
    sget-object v11, Ll/ܶ֨᩸;->ᩳۡۚ:[S

    const/4 v12, 0x1

    const/16 v13, 0x21

    invoke-static {v11, v12, v13, v7}, Ll/ۖۖ;->ܺۙᩴ([SIII)Ljava/lang/String;

    move-result-object v11

    .line 29
    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_6
    const-string v11, "\u05a8\u073d"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x35

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2b27

    const v13, 0x60a9bc82

    xor-int/2addr v12, v13

    const v13, 0x1e7fa4bb

    goto/16 :goto_0

    :catch_0
    const-string v11, "\u06e7\u1a79"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x184d

    const v13, 0xa48b5d0

    xor-int/2addr v12, v13

    const v13, 0x410bc276

    goto/16 :goto_0

    :goto_7
    const-string v11, "\u073f\u06dc"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3edd

    const v13, 0x581e4650

    xor-int/2addr v12, v13

    const v13, 0x76065c7a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b3ad6f2 -> :sswitch_13
        -0x734b1f39 -> :sswitch_12
        -0x714b7abd -> :sswitch_11
        -0x6925f116 -> :sswitch_10
        -0x67776049 -> :sswitch_f
        -0x55b97f03 -> :sswitch_e
        -0x55a41bef -> :sswitch_d
        -0x42a2b8e4 -> :sswitch_c
        -0x408a7b17 -> :sswitch_b
        -0x3fa86d7c -> :sswitch_f
        -0x38741da6 -> :sswitch_a
        -0x32ef8c0a -> :sswitch_9
        -0x312ab1d3 -> :sswitch_8
        -0x2b589c7c -> :sswitch_7
        -0x25df49b7 -> :sswitch_11
        -0x16b0f15a -> :sswitch_6
        -0x13054c5f -> :sswitch_e
        -0x1223b888 -> :sswitch_5
        -0x125737a -> :sswitch_6
        0xe4287d4 -> :sswitch_9
        0x12568f49 -> :sswitch_8
        0x1877a508 -> :sswitch_4
        0x1abd3b95 -> :sswitch_4
        0x2aaaae1c -> :sswitch_b
        0x33367671 -> :sswitch_3
        0x37c85576 -> :sswitch_12
        0x38e0851a -> :sswitch_2
        0x3a96e295 -> :sswitch_5
        0x3b175974 -> :sswitch_1
        0x4390c3c9 -> :sswitch_3
        0x48cb3cbf -> :sswitch_a
        0x5114471b -> :sswitch_0
        0x5bf72eb9 -> :sswitch_c
        0x5d13430c -> :sswitch_d
        0x6177fc1f -> :sswitch_13
        0x62be2168 -> :sswitch_0
        0x666e2bb1 -> :sswitch_1
        0x69a0128c -> :sswitch_10
        0x78dcd7b9 -> :sswitch_2
        0x79250d37 -> :sswitch_7
    .end sparse-switch

    :array_0
    .array-data 2
        0x1061s
        0x35e3s
        0x35ecs
        0x35e6s
        0x35f0s
        0x35eds
        0x35ebs
        0x35e6s
        0x35acs
        0x35f6s
        0x35e7s
        0x35fas
        0x35f6s
        0x35acs
        0x35f1s
        0x35f6s
        0x35fbs
        0x35ees
        0x35e7s
        0x35acs
        0x35d1s
        0x35f2s
        0x35e7s
        0x35ees
        0x35ees
        0x35c1s
        0x35eas
        0x35e7s
        0x35e1s
        0x35e9s
        0x35d1s
        0x35f2s
        0x35e3s
        0x35ecs
    .end array-data
.end method

.method public constructor <init>(Ll/᩺ۜ᩸;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    return-void
.end method

.method private ۙ(IILjava/lang/Class;)V
    .locals 17

    move/from16 v0, p1

    move/from16 v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x47cec9b1

    sget v11, Ll/֨ۨ;->ۜܳ᩵:I

    sget v12, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v13, "\u1a74\u06da"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x9

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4db9

    const v15, -0x59f38f58

    xor-int/2addr v14, v15

    const v15, 0x15d28e7e

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x5fe5

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    if-ge v6, v5, :cond_6

    const-string v13, "\u06da\u1a78"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x1b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x187f

    const v15, -0x58684984

    xor-int/2addr v14, v15

    const v15, -0x44fd3219

    goto :goto_0

    .line 162
    :sswitch_0
    sget v13, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v13, :cond_1

    :cond_0
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_7

    :cond_1
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_9

    .line 19
    :sswitch_1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v13, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v13, :cond_0

    :cond_2
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_6

    .line 35
    :sswitch_2
    sget v13, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v13, :cond_2

    :goto_2
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    goto/16 :goto_8

    .line 23
    :sswitch_3
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto :goto_2

    .line 184
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    return-void

    .line 237
    :sswitch_5
    invoke-static {v4, v8}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_3

    .line 239
    :sswitch_6
    invoke-static {v7}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    .line 240
    invoke-interface {v2, v13}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    goto/16 :goto_4

    :sswitch_7
    return-void

    :sswitch_8
    if-ne v9, v1, :cond_3

    goto :goto_3

    :cond_3
    const-string v13, "\u06e1\u1a73"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x19

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5d61

    const v15, -0x1f0c1302

    xor-int/2addr v14, v15

    const v15, 0x1be82980    # 3.8408E-22f

    goto :goto_0

    :sswitch_9
    add-int/lit8 v6, v6, 0x1

    move-object/from16 v13, p3

    goto/16 :goto_5

    .line 239
    :sswitch_a
    invoke-static {v7}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const-string v13, "\u06ec\u1a7a"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2351

    const v15, -0x4520e2e4

    xor-int/2addr v14, v15

    const v15, -0x6aa05f4e

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06e0\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x175f

    const v15, 0x72462ff5

    xor-int/2addr v14, v15

    const v15, -0x3417514b    # -3.0498154E7f

    goto/16 :goto_0

    .line 233
    :sswitch_b
    aget-object v8, v3, v6

    .line 234
    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v9

    .line 235
    invoke-interface {v2, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v13

    if-eq v13, v0, :cond_5

    const-string v13, "\u05ab\u1a76"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7941

    const v15, 0x41f49a10

    xor-int/2addr v14, v15

    const v15, -0x3028999d

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string v13, "\u06d8\u073a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x25e1

    const v15, 0x795acc0d

    xor-int/2addr v14, v15

    const v15, 0x6dbbd21b

    goto/16 :goto_0

    .line 239
    :sswitch_c
    invoke-static {v4}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    const-string v13, "\u073f\u1a76"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4017

    const v15, 0x6d5d2715

    xor-int/2addr v14, v15

    const v15, -0xc3bf507

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u1a74\u05a8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x7c61

    const v15, -0x4164e5be

    xor-int/2addr v14, v15

    const v15, 0xf0387c

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v13, p3

    .line 231
    invoke-interface {v2, v0, v1, v13}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    .line 232
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 233
    array-length v5, v3

    const/4 v6, 0x0

    :goto_5
    const-string v14, "\u06e2\u06dc"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x71

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x7729

    const v16, 0x1cbfcb0b

    xor-int v15, v15, v16

    const v16, -0xf1fad9d

    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_1

    :sswitch_e
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 230
    iget-object v2, v14, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    invoke-static {v2}, Ll/ۗ᩵;->ۖ֡ᩳ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v2

    sget v15, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v15, :cond_7

    const-string v15, "\u06e4\u06ec"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x2f

    xor-int v0, v15, v11

    mul-int/lit16 v0, v0, -0x4a01

    const v16, -0x7105ad7b

    xor-int v0, v0, v16

    const v16, 0x50981a17

    xor-int v15, v15, v16

    move v14, v0

    move v13, v15

    goto/16 :goto_b

    :cond_7
    const-string v0, "\u0736\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x4f

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x2827

    const v16, 0x7da9d8f3

    xor-int v15, v15, v16

    const v16, -0x381035f7

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 193
    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a79\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x47

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x69f5

    const v16, -0x29dada52

    xor-int v15, v15, v16

    const v16, -0x63de7c10

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 179
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06db\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x3e33

    const v16, 0x4816799e

    xor-int v15, v15, v16

    const v16, -0x33448b0e    # -9.828136E7f

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 39
    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_a

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u073f\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x14df

    const v16, -0x47d51651

    xor-int v15, v15, v16

    const v16, 0x49de4bf9

    goto/16 :goto_a

    :sswitch_12
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 49
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_b

    goto/16 :goto_8

    :cond_b
    const-string v0, "\u05ab\u0736"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x2f31

    const v16, -0x346f711f    # -1.8947522E7f

    xor-int v15, v15, v16

    const v16, 0x464228f2

    goto/16 :goto_a

    :sswitch_13
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 70
    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v0, :cond_c

    goto :goto_7

    :cond_c
    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x4d1d

    const v16, -0x746d5550

    xor-int v15, v15, v16

    const v16, 0x458baccb

    goto/16 :goto_a

    :sswitch_14
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 162
    sget-boolean v0, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v0, :cond_d

    :goto_6
    const-string v0, "\u1a78\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x7d

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x71e9

    const v16, -0x1de1b58e

    xor-int v15, v15, v16

    const v16, -0xa09d599

    goto/16 :goto_a

    :cond_d
    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x6aaf

    const v16, 0x404b17a3

    xor-int v15, v15, v16

    const v16, -0x6bef88f0

    goto/16 :goto_a

    :sswitch_15
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    sget v0, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v0, :cond_e

    :goto_7
    const-string v0, "\u0733\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x4499

    const v16, -0x33910790    # -6.264467E7f

    xor-int v15, v15, v16

    const v16, -0x5182fceb

    goto/16 :goto_a

    :cond_e
    const-string v0, "\u073d\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x6ef9

    const v16, -0x586fa143

    xor-int v15, v15, v16

    const v16, 0x2cefcf0d

    goto :goto_a

    :sswitch_16
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 77
    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_f

    :goto_8
    const-string v0, "\u06d6\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x5437

    const v16, 0x4743c1cf

    xor-int v15, v15, v16

    const v16, 0x167df410

    goto :goto_a

    :cond_f
    const-string v0, "\u05ab\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x6a07

    const v16, 0x1e3699bb

    xor-int v15, v15, v16

    const v16, -0x3e518c39

    goto :goto_a

    :sswitch_17
    move-object/from16 v14, p0

    move-object/from16 v13, p3

    .line 46
    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_10

    :goto_9
    const-string v0, "\u06e2\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x20d3

    const v16, -0x46f576c

    xor-int v15, v15, v16

    const v16, -0x6a3f4643

    goto :goto_a

    :cond_10
    const-string v0, "\u05a1\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x716b

    const v16, 0x4a38e6a2    # 3029416.5f

    xor-int v15, v15, v16

    const v16, 0x386b3d2b

    :goto_a
    xor-int v0, v0, v16

    move v13, v0

    move v14, v15

    :goto_b
    move/from16 v0, p1

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aaf94f0 -> :sswitch_1
        -0x77ed29bd -> :sswitch_16
        -0x70fba359 -> :sswitch_17
        -0x6d28c24c -> :sswitch_16
        -0x64f26c38 -> :sswitch_15
        -0x5bb8381a -> :sswitch_0
        -0x59fb8ec5 -> :sswitch_4
        -0x5244ec96 -> :sswitch_b
        -0x4f75a036 -> :sswitch_c
        -0x4dab14ff -> :sswitch_d
        -0x4ccf420e -> :sswitch_15
        -0x4c775492 -> :sswitch_0
        -0x46376cfe -> :sswitch_7
        -0x442566a5 -> :sswitch_3
        -0x41da28c4 -> :sswitch_f
        -0x2e423116 -> :sswitch_13
        -0x2a94e823 -> :sswitch_5
        -0x25f1e426 -> :sswitch_8
        -0x21b3ee5a -> :sswitch_17
        -0x1e41ae1a -> :sswitch_4
        -0x139aed46 -> :sswitch_11
        -0x9c43fe5 -> :sswitch_11
        -0x6580d8e -> :sswitch_10
        -0x3ac641 -> :sswitch_3
        0xa62a6fe -> :sswitch_f
        0x1e04bb1b -> :sswitch_2
        0x1f2571d0 -> :sswitch_9
        0x234cfc75 -> :sswitch_d
        0x2469f516 -> :sswitch_13
        0x2479fddc -> :sswitch_5
        0x25260fbe -> :sswitch_6
        0x25b93b80 -> :sswitch_1
        0x263bc35a -> :sswitch_2
        0x2a0a42fc -> :sswitch_e
        0x2e31eb72 -> :sswitch_14
        0x305e7419 -> :sswitch_b
        0x37150e82 -> :sswitch_12
        0x3dd02769 -> :sswitch_6
        0x43bdafec -> :sswitch_a
        0x4c14588a -> :sswitch_9
        0x54a3631d -> :sswitch_a
        0x56f9757a -> :sswitch_e
        0x59938b37 -> :sswitch_c
        0x5b0579f1 -> :sswitch_7
        0x5c8500bf -> :sswitch_10
        0x5e7151af -> :sswitch_14
        0x67ad874d -> :sswitch_12
        0x7faef24a -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x60e7fbc8

    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    const-string v7, "\u06e7\u0730"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4b07

    const v9, -0x5a2e70ca

    xor-int/2addr v8, v9

    const v9, 0x7873a75e

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit8 v4, v4, 0x71

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 148
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܺ()V

    .line 149
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->۠ۤ()V

    goto/16 :goto_2

    .line 949
    :sswitch_0
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget-boolean v7, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v7, :cond_b

    goto/16 :goto_5

    .line 3690
    :sswitch_1
    sget-boolean v7, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v7, :cond_e

    goto/16 :goto_3

    .line 10025
    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v7

    if-eqz v7, :cond_6

    goto/16 :goto_5

    .line 3684
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto/16 :goto_5

    .line 7840
    :sswitch_4
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    return-void

    .line 147
    :sswitch_5
    invoke-virtual {v0, v2, v3}, Ll/᩺ۜ᩸;->ۙ(II)V

    .line 5960
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v7

    if-gtz v7, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v7, "\u06e4\u06e8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x3f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6de5

    const v9, 0x3928b476

    xor-int/2addr v8, v9

    const v9, 0x2b52b650    # 7.4859997E-13f

    goto :goto_0

    .line 145
    :sswitch_6
    invoke-static {v0}, Ll/ۗ֫;->۫ᩴ᩸(Ljava/lang/Object;)I

    move-result v2

    .line 146
    invoke-static {v0}, Ll/֨ۢ;->ۖܿۘ(Ljava/lang/Object;)I

    move-result v3

    sget v7, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u06db\u1a77"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3c61

    const v9, 0x76a8fbd9

    xor-int/2addr v8, v9

    const v9, -0x1af7fc4b

    goto :goto_0

    .line 142
    :sswitch_7
    invoke-static {v0}, Ll/ۖۗ;->ܰ᩸ۧ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v7, "\u1a76\u0733"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x2d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x77a5

    const v9, 0x766f6198

    xor-int/2addr v8, v9

    const v9, 0x131b3efe

    goto/16 :goto_0

    .line 140
    :sswitch_8
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/text/TextWatcher;

    .line 141
    invoke-interface {v7, p1}, Landroid/text/TextWatcher;->afterTextChanged(Landroid/text/Editable;)V

    goto :goto_1

    .line 10117
    :sswitch_9
    iget-boolean v7, v0, Ll/᩺ۜ᩸;->ۚ᩷:Z

    if-nez v7, :cond_4

    const-string v7, "\u06db\u06e2"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x3

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x524f

    const v9, 0x6d794bae

    xor-int/2addr v8, v9

    const v9, -0xba59566

    goto/16 :goto_0

    :sswitch_a
    return-void

    .line 140
    :sswitch_b
    invoke-static {v1}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "\u1a75\u06e0"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x70d7

    const v9, 0x3d22fff7

    xor-int/2addr v8, v9

    const v9, 0x3012d5c1

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06e4\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0xb

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x741d

    const v9, 0x5c437782

    xor-int/2addr v8, v9

    const v9, -0x3bfcfa8a

    goto/16 :goto_0

    :sswitch_c
    iget-object v1, v0, Ll/᩺ۜ᩸;->ۙۤ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    const-string v7, "\u1a74\u06eb"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x15

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3565

    const v9, -0x5010d055

    xor-int/2addr v8, v9

    const v9, 0x14f269c2

    goto/16 :goto_0

    .line 137
    :sswitch_d
    iget-object v0, p0, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    invoke-static {v0}, Ll/ۗ᩵;->ۖ֡ᩳ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v7

    if-eq p1, v7, :cond_5

    :cond_4
    :goto_2
    const-string v7, "\u06e2\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x79

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0xadd

    const v9, -0x784c139

    xor-int/2addr v8, v9

    const v9, 0x7c9ab10c

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u05a1\u06ec"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x73c7

    const v9, -0x95ef01a

    xor-int/2addr v8, v9

    const v9, 0x6863137d

    goto/16 :goto_0

    .line 6672
    :sswitch_e
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v7

    if-gtz v7, :cond_7

    :cond_6
    :goto_3
    const-string v7, "\u06d9\u06d6"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x27

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7665

    const v9, -0x18950b8d

    xor-int/2addr v8, v9

    const v9, 0x2e51c7bd

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06e7\u06e4"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x47

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3eaf

    const v9, -0x26ef720d

    xor-int/2addr v8, v9

    const v9, -0x65eae865

    goto/16 :goto_0

    :sswitch_f
    sget v7, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v7, :cond_8

    goto :goto_4

    :cond_8
    const-string v7, "\u06e1\u06dc"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x36b9

    const v9, -0x2cbf4e29

    xor-int/2addr v8, v9

    const v9, -0x2a5e9bdf

    goto/16 :goto_0

    :sswitch_10
    sget v7, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v7, :cond_9

    goto :goto_5

    :cond_9
    const-string v7, "\u06e0\u06e4"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x39

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x686b

    const v9, 0x43b70ce

    xor-int/2addr v8, v9

    const v9, -0x29d6557a

    goto/16 :goto_0

    .line 8972
    :sswitch_11
    sget v7, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v7, :cond_a

    goto :goto_4

    :cond_a
    const-string v7, "\u06ec\u1a74"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4925

    const v9, -0x7071e17

    xor-int/2addr v8, v9

    const v9, -0x92e2bc0

    goto/16 :goto_0

    :sswitch_12
    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v7, :cond_c

    :cond_b
    :goto_4
    const-string v7, "\u073a\u06d9"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x15

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2ab

    const v9, 0xfc26c37

    xor-int/2addr v8, v9

    const v9, 0x66546dce

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u073f\u06d6"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x76bf

    const v9, -0xf6e393e

    xor-int/2addr v8, v9

    const v9, -0x576bba7b

    goto/16 :goto_0

    .line 2623
    :sswitch_13
    sget v7, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v7, :cond_d

    :goto_5
    const-string v7, "\u073f\u1a73"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x29

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3d7b

    const v9, -0x3d7e104c

    xor-int/2addr v8, v9

    const v9, 0x3ec25c5

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06d6\u05ab"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7af3

    const v9, 0x4e8d55f5

    xor-int/2addr v8, v9

    const v9, 0x71a09938

    goto/16 :goto_0

    :sswitch_14
    sget v7, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v7, :cond_f

    :cond_e
    const-string v7, "\u1a7a\u1a74"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x15

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x577f

    const v9, -0x3da50ebc

    xor-int/2addr v8, v9

    const v9, 0x1cd43638

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u073f\u06da"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x18fd

    const v9, -0x6f75043c

    xor-int/2addr v8, v9

    const v9, -0x6ec3f241

    goto/16 :goto_0

    .line 6910
    :sswitch_15
    sget v7, Ll/۬;->᩸ۜ᩹:I

    if-eqz v7, :cond_10

    :goto_6
    const-string v7, "\u1a76\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6a8d

    const v9, 0x1215b19b

    xor-int/2addr v8, v9

    const v9, -0x4d8225aa

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u0733\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x39

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x62bb

    const v9, 0x801e8f6

    xor-int/2addr v8, v9

    const v9, -0x1e265761

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f9e4eaf -> :sswitch_9
        -0x72141878 -> :sswitch_b
        -0x712155d9 -> :sswitch_2
        -0x7006c1e0 -> :sswitch_12
        -0x6320577d -> :sswitch_7
        -0x60ac430a -> :sswitch_13
        -0x58c03f6d -> :sswitch_e
        -0x586db40c -> :sswitch_12
        -0x58140495 -> :sswitch_3
        -0x51be8ed2 -> :sswitch_15
        -0x51a1297e -> :sswitch_14
        -0x508ed2a3 -> :sswitch_14
        -0x4f130b2b -> :sswitch_2
        -0x4dc45992 -> :sswitch_4
        -0x4c65763f -> :sswitch_f
        -0x42946e9c -> :sswitch_a
        -0x41ae52b1 -> :sswitch_c
        -0x3f688fa2 -> :sswitch_0
        -0x3aad7193 -> :sswitch_6
        -0x3652fe46 -> :sswitch_6
        -0x265c6a30 -> :sswitch_10
        -0x25f525a5 -> :sswitch_11
        -0x1cbca75e -> :sswitch_b
        -0x1c5d6d93 -> :sswitch_13
        -0x19dc1a6d -> :sswitch_8
        -0x1999c397 -> :sswitch_e
        -0xff7abcf -> :sswitch_d
        -0x5878740 -> :sswitch_a
        0xb8985c -> :sswitch_1
        0x5e15a2c -> :sswitch_4
        0xdf48e9d -> :sswitch_d
        0x1274cc0c -> :sswitch_1
        0x1c62a4f7 -> :sswitch_15
        0x20e32e11 -> :sswitch_10
        0x242500a9 -> :sswitch_8
        0x28895e2a -> :sswitch_c
        0x28c6c640 -> :sswitch_9
        0x333ae610 -> :sswitch_5
        0x3ad8da73 -> :sswitch_3
        0x43a21620 -> :sswitch_11
        0x537b0003 -> :sswitch_f
        0x5c7d42a0 -> :sswitch_7
        0x605bb3bd -> :sswitch_5
        0x644ce8fa -> :sswitch_0
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x592d9037

    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v5, Ll/᩶;->ᩴ᩶ۛ:I

    const-string v6, "\u06e2\u1a78"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x785f

    const v8, 0x1387eb21

    xor-int/2addr v7, v8

    const v8, -0x30eff308

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x1f31

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 30
    sget v6, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v6, :cond_a

    goto/16 :goto_3

    :sswitch_0
    sget v6, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v6, :cond_e

    goto/16 :goto_4

    .line 53
    :sswitch_1
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-gez v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u06df\u05a1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x4d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1eb3

    const v8, 0x331a1b4d

    xor-int/2addr v7, v8

    const v8, -0x3eadb31b

    goto :goto_0

    .line 62
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_5

    .line 16
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto/16 :goto_5

    .line 6
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    return-void

    :sswitch_5
    add-int v6, p2, p3

    .line 63
    invoke-direct {p0, p2, v6, v2}, Ll/ܶ֨᩸;->ۙ(IILjava/lang/Class;)V

    goto :goto_1

    :sswitch_6
    add-int/2addr p3, p2

    .line 65
    const-class p1, Landroid/text/style/SuggestionSpan;

    invoke-direct {p0, p2, p3, p1}, Ll/ܶ֨᩸;->ۙ(IILjava/lang/Class;)V

    return-void

    .line 56
    :sswitch_7
    invoke-static {v1}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/text/TextWatcher;

    .line 57
    invoke-interface {v6, p1, p2, p3, p4}, Landroid/text/TextWatcher;->beforeTextChanged(Ljava/lang/CharSequence;III)V

    goto/16 :goto_2

    .line 58
    :sswitch_8
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܽۙ()I

    move-result v2

    iput v2, p0, Ll/ܶ֨᩸;->᩶:I

    .line 59
    invoke-static {v0}, Ll/֡ۖ;->ۜۤۘ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v2

    invoke-interface {v2}, Ll/ۡ᩶᩸;->ۛ᩷()I

    move-result v2

    iput v2, p0, Ll/ܶ֨᩸;->ܿ:I

    .line 62
    sget-object v2, Ll/ܶ֨᩸;->֡:Ljava/lang/Class;

    if-eqz v2, :cond_1

    const-string v6, "\u06eb\u06e1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x338d

    const v8, 0x3a661d9

    xor-int/2addr v7, v8

    const v8, -0x45abc4f9

    goto/16 :goto_0

    :cond_1
    :goto_1
    const-string v6, "\u1a77\u06d6"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6ae9

    const v8, 0x5b30edb7

    xor-int/2addr v7, v8

    const v8, -0x3e76d5a3

    goto/16 :goto_0

    .line 56
    :sswitch_9
    invoke-static {v1}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string v6, "\u073d\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x308f

    const v8, 0x5bfe2140

    xor-int/2addr v7, v8

    const v8, 0x4eaa9eab

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06eb\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1d6d

    const v8, -0x3392c10

    xor-int/2addr v7, v8

    const v8, -0x67c59023

    goto/16 :goto_0

    :sswitch_a
    return-void

    .line 55
    :sswitch_b
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۗۤ()V

    .line 56
    iget-object v1, v0, Ll/᩺ۜ᩸;->ۙۤ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    const-string v6, "\u06e7\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1671

    const v8, 0x5c909e74

    xor-int/2addr v7, v8

    const v8, 0x21e801f7

    goto/16 :goto_0

    .line 52
    :sswitch_c
    iget-object v0, p0, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    invoke-static {v0}, Ll/֡ۖ;->ۜۤۘ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v6

    if-eq p1, v6, :cond_3

    const-string v6, "\u06db\u1a75"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x57

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x807

    const v8, 0x5018f06c

    xor-int/2addr v7, v8

    const v8, -0x78e5b1ee

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06e8\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x239

    const v8, -0x707e2816

    xor-int/2addr v7, v8

    const v8, -0x2703cdc3

    goto/16 :goto_0

    .line 9
    :sswitch_d
    sget v6, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u06e4\u1a73"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x522b

    const v8, 0x1b8aa041

    xor-int/2addr v7, v8

    const v8, 0x5e59fa35

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u1a73\u06db"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7d6f

    const v8, 0x2b669457

    xor-int/2addr v7, v8

    const v8, -0x489ea0f4

    goto/16 :goto_0

    .line 46
    :sswitch_f
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "\u1a78\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1b31

    const v8, -0x723274d0

    xor-int/2addr v7, v8

    const v8, -0x3f1f6ae3

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v6, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v6, "\u1a79\u1a79"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xd85

    const v8, -0x7b9d61a7

    xor-int/2addr v7, v8

    const v8, -0x275ad8ba

    goto/16 :goto_0

    .line 25
    :sswitch_11
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_8

    goto :goto_3

    :cond_8
    const-string v6, "\u073a\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x65

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7b77

    const v8, -0x19c6dc19

    xor-int/2addr v7, v8

    const v8, 0x56bbe19e

    goto/16 :goto_0

    :sswitch_12
    sget v6, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "\u0736\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x481d

    const v8, 0x3c46421b

    xor-int/2addr v7, v8

    const v8, 0x194197be    # 1.000851E-23f

    goto/16 :goto_0

    :goto_3
    const-string v6, "\u1a73\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x2f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xe9b

    const v8, -0x18cb6180

    xor-int/2addr v7, v8

    const v8, -0x68cae09b

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u073a\u1a73"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2c83

    const v8, 0x7654a156

    xor-int/2addr v7, v8

    const v8, 0x6a9d2476

    goto/16 :goto_0

    .line 36
    :sswitch_13
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u06e7\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x59f3

    const v8, -0x7326c38

    xor-int/2addr v7, v8

    const v8, 0x65c37119

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073f\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7753

    const v8, -0x49f3a0f

    xor-int/2addr v7, v8

    const v8, 0x62524868

    goto/16 :goto_0

    .line 31
    :sswitch_14
    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_d

    :goto_5
    const-string v6, "\u06e4\u05a8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7f0d

    const v8, 0x42f05581    # 120.167f

    xor-int/2addr v7, v8

    const v8, -0x1c6862d0

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e1\u1a74"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x217f

    const v8, 0xf171051

    xor-int/2addr v7, v8

    const v8, 0x6a8b9e29

    goto/16 :goto_0

    :sswitch_15
    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_f

    :cond_e
    const-string v6, "\u1a78\u06e7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3693

    const v8, -0x57533ca0

    xor-int/2addr v7, v8

    const v8, 0x144742c8

    goto/16 :goto_0

    :cond_f
    const-string v6, "\u1a76\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4e9b

    const v8, -0xaea1584

    xor-int/2addr v7, v8

    const v8, -0x5ed20122

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7827e618 -> :sswitch_9
        -0x76a1dcac -> :sswitch_a
        -0x7692a8b8 -> :sswitch_c
        -0x713c5b4e -> :sswitch_6
        -0x6d73197f -> :sswitch_5
        -0x6810224a -> :sswitch_f
        -0x62538c93 -> :sswitch_a
        -0x547a985f -> :sswitch_c
        -0x4d0984bb -> :sswitch_8
        -0x4af08ef3 -> :sswitch_12
        -0x4368997c -> :sswitch_2
        -0x409af9e9 -> :sswitch_15
        -0x3dc11f45 -> :sswitch_4
        -0x382b3e99 -> :sswitch_d
        -0x34df6417 -> :sswitch_10
        -0x1e04c1a4 -> :sswitch_2
        -0x1ac58b27 -> :sswitch_0
        -0x1a23d455 -> :sswitch_15
        -0x15d099e0 -> :sswitch_e
        -0x15a32c4f -> :sswitch_b
        -0x131a7b13 -> :sswitch_8
        -0x8cefd10 -> :sswitch_1
        -0xe6e9f8 -> :sswitch_3
        -0x3380b3 -> :sswitch_e
        0x25c2c44a -> :sswitch_13
        0x25d46bdf -> :sswitch_12
        0x2a514c83 -> :sswitch_6
        0x2a8a19e5 -> :sswitch_3
        0x2ab91331 -> :sswitch_5
        0x33031025 -> :sswitch_d
        0x348647e0 -> :sswitch_7
        0x3e88b122 -> :sswitch_1
        0x4019adfd -> :sswitch_13
        0x41be7bdf -> :sswitch_b
        0x4308537a -> :sswitch_14
        0x488323cb -> :sswitch_7
        0x4bd405b6 -> :sswitch_10
        0x5608d86f -> :sswitch_11
        0x59fb9f3a -> :sswitch_14
        0x633a9bd8 -> :sswitch_f
        0x64616ef0 -> :sswitch_11
        0x6648e5dd -> :sswitch_4
        0x6ea1444b -> :sswitch_9
        0x736e1bda -> :sswitch_0
    .end sparse-switch
.end method

.method public final onSpanAdded(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 2

    const p1, 0x24de69b7

    sget p2, Ll/᩶;->ᩴ᩶ۛ:I

    sget p3, Ll/֨ۢ;->۬ܿܺ:I

    const-string p4, "\u073f\u06d9"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x3a4f

    const v1, -0x6a090a9

    xor-int/2addr v0, v1

    const v1, 0x48cc09db

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, -0x30b9

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 0
    sget-boolean p4, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz p4, :cond_2

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result p4

    if-nez p4, :cond_9

    goto/16 :goto_2

    :sswitch_1
    sget p4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz p4, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result p4

    if-eqz p4, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    :sswitch_5
    return-void

    :sswitch_6
    sget p4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz p4, :cond_0

    goto :goto_1

    :cond_0
    const-string p4, "\u06ec\u06db"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x5be5

    const v1, -0x7c0033c6

    xor-int/2addr v0, v1

    const v1, 0x2b008791

    goto :goto_0

    :sswitch_7
    sget p4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz p4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string p4, "\u1a77\u06d9"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4ce7

    const v1, 0x11a26c97

    xor-int/2addr v0, v1

    const v1, -0x194fece3

    goto :goto_0

    :cond_2
    const-string p4, "\u1a73\u073f"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x65

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x705d

    const v1, -0x566fee4c

    xor-int/2addr v0, v1

    const v1, 0x46d8b93b

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result p4

    if-eqz p4, :cond_3

    :goto_1
    const-string p4, "\u05a1\u06da"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2805

    const v1, -0x4c13a0e0

    xor-int/2addr v0, v1

    const v1, -0x5a9d70e0

    goto/16 :goto_0

    :cond_3
    const-string p4, "\u073d\u1a7a"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x7f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x16f

    const v1, 0x1835e98b

    xor-int/2addr v0, v1

    const v1, -0x7632eeff

    goto/16 :goto_0

    :sswitch_9
    sget p4, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz p4, :cond_5

    :cond_4
    :goto_2
    const-string p4, "\u05a8\u073a"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x68f9

    const v1, -0x49fe1308

    xor-int/2addr v0, v1

    const v1, -0x25bc63f5

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u0736\u1a76"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x50ad

    const v1, 0x4b966993    # 1.9714854E7f

    xor-int/2addr v0, v1

    const v1, -0x72690ba4

    goto/16 :goto_0

    :sswitch_a
    sget p4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p4, :cond_6

    goto :goto_3

    :cond_6
    const-string p4, "\u05a1\u05a8"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x67

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x348f

    const v1, -0x14435131

    xor-int/2addr v0, v1

    const v1, -0x133e4795

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget p4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz p4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string p4, "\u1a76\u0730"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x61

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1671

    const v1, -0x757193e1

    xor-int/2addr v0, v1

    const v1, -0x84be7e7

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget p4, Ll/᩺;->۫۬۫:I

    if-gtz p4, :cond_8

    :goto_3
    const-string p4, "\u1a76\u0736"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x73

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x4145

    const v1, 0x53db99e2

    xor-int/2addr v0, v1

    const v1, -0x1d043560

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u1a7a\u05ab"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, 0x53

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x5a45

    const v1, 0x4e5e6a44    # 9.3287654E8f

    xor-int/2addr v0, v1

    const v1, 0x5f9b169e

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget p4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz p4, :cond_a

    :cond_9
    const-string p4, "\u0736\u1a7a"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x21

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x1799

    const v1, 0x6a09d9bf

    xor-int/2addr v0, v1

    const v1, -0x15a1dc6e

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u06df\u06db"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x4e3d

    const v1, 0xd0afd9b

    xor-int/2addr v0, v1

    const v1, -0x51ff3bea

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget p4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz p4, :cond_c

    :cond_b
    :goto_4
    const-string p4, "\u1a75\u06df"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x1d

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2753

    const v1, 0x4d567695    # 2.2488098E8f

    xor-int/2addr v0, v1

    const v1, 0x20e64973

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u05a1\u0736"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x70b5

    const v1, -0x694ff6c

    xor-int/2addr v0, v1

    const v1, -0x4100bc11

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x735055e0 -> :sswitch_0
        -0x70510d04 -> :sswitch_0
        -0x6bccc121 -> :sswitch_d
        -0x67f21772 -> :sswitch_3
        -0x58a53927 -> :sswitch_8
        -0x57aa2296 -> :sswitch_e
        -0x33801f26 -> :sswitch_6
        -0x2dc15670 -> :sswitch_1
        -0x2d3e602c -> :sswitch_2
        -0x266e1e61 -> :sswitch_4
        -0xf99f3ea -> :sswitch_5
        -0x8679801 -> :sswitch_b
        0x1257c71 -> :sswitch_3
        0x51bf98e -> :sswitch_4
        0x69721be -> :sswitch_2
        0xea23d94 -> :sswitch_c
        0x1e860c19 -> :sswitch_9
        0x2554c41e -> :sswitch_a
        0x30809478 -> :sswitch_a
        0x36230897 -> :sswitch_7
        0x3d2741f3 -> :sswitch_d
        0x3f79991a -> :sswitch_5
        0x4f3c72da -> :sswitch_6
        0x56da3c32 -> :sswitch_9
        0x5df0b206 -> :sswitch_1
        0x62002624 -> :sswitch_e
        0x634b42e3 -> :sswitch_8
        0x6b641538 -> :sswitch_7
        0x75664922 -> :sswitch_c
        0x7eb92c0b -> :sswitch_b
    .end sparse-switch
.end method

.method public final onSpanChanged(Landroid/text/Spannable;Ljava/lang/Object;IIII)V
    .locals 7

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 p5, 0x0

    const/4 p6, 0x0

    const v0, -0x27320ae1

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v3, "\u06df\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6fff

    const v5, -0x2a255851

    xor-int/2addr v4, v5

    const v5, -0x1b68946a

    :goto_0
    xor-int/2addr v3, v5

    :goto_1
    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x415f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 194
    invoke-static {p3}, Ll/֡ᩴ;->֨ܶܳ(Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 116
    :sswitch_0
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_10

    :cond_0
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x278d

    const v5, 0x3d82fe24

    xor-int/2addr v4, v5

    const v5, 0x133a842f

    goto :goto_0

    :sswitch_1
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v3, :cond_1

    goto/16 :goto_b

    :cond_1
    const-string v3, "\u06e7\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e77

    const v5, 0x137d178b

    xor-int/2addr v4, v5

    const v5, 0x5645f306

    goto :goto_0

    .line 1259
    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-eqz v3, :cond_13

    goto/16 :goto_d

    :sswitch_3
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v3, :cond_f

    goto/16 :goto_10

    .line 637
    :sswitch_4
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_2

    goto/16 :goto_f

    :cond_2
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5d89

    const v5, 0x2ee44586

    xor-int/2addr v4, v5

    const v5, -0x3aa81b14

    goto :goto_0

    :sswitch_5
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v3

    if-eqz v3, :cond_15

    goto/16 :goto_f

    .line 349
    :sswitch_6
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-gtz v3, :cond_1a

    goto/16 :goto_e

    .line 1340
    :sswitch_7
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez v3, :cond_17

    goto/16 :goto_f

    :sswitch_8
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_f

    .line 915
    :sswitch_9
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    return-void

    .line 193
    :sswitch_a
    iget v3, p4, Ll/۠۠᩸;->ۙ:I

    if-nez v3, :cond_6

    goto :goto_2

    .line 189
    :sswitch_b
    iput-boolean p5, p4, Ll/۠۠᩸;->ᩴ:Z

    goto/16 :goto_3

    :sswitch_c
    if-eqz p4, :cond_3

    const-string v3, "\u06e8\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3041

    const v5, -0x53dc7c10

    xor-int/2addr v4, v5

    const v5, 0x1bfbe3e3

    goto/16 :goto_0

    :cond_3
    :goto_2
    const-string v3, "\u06e8\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6061

    const v5, -0x4580868c

    xor-int/2addr v4, v5

    const v5, -0x53387df5

    goto/16 :goto_0

    .line 188
    :sswitch_d
    invoke-static {p1, p2}, Landroid/text/method/MetaKeyKeyListener;->isSelectingMetaTracker(Ljava/lang/CharSequence;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "\u0730\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7b0d

    const v5, -0x65135d9d

    xor-int/2addr v4, v5

    const v5, 0x5521e5df

    goto/16 :goto_0

    .line 192
    :sswitch_e
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v3

    if-ltz v3, :cond_6

    const-string v3, "\u0733\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xbb5

    const v5, 0x60a73569

    xor-int/2addr v4, v5

    const v5, 0x34cc7070

    goto/16 :goto_0

    .line 170
    :sswitch_f
    invoke-static {p3}, Ll/ۗ᩵;->ۖ֡ᩳ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۖ;->᩹ۡۢ(Ljava/lang/Object;)I

    move-result v3

    if-ne p6, v3, :cond_8

    goto :goto_4

    .line 171
    :sswitch_10
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->֫᩸()V

    const/4 v3, 0x0

    .line 1351
    invoke-virtual {p3, v3}, Ll/᩺ۜ᩸;->ۙ(Z)V

    .line 173
    invoke-static {p3}, Ll/֡᩻;->᩻ᩳ۟(Ljava/lang/Object;)V

    goto/16 :goto_6

    :sswitch_11
    if-eqz p4, :cond_4

    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x46a9

    const v5, -0x3558073a    # -5504099.0f

    xor-int/2addr v4, v5

    const v5, -0x5642af34

    goto/16 :goto_0

    :cond_4
    :goto_3
    const-string v3, "\u1a75\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x26d1

    const v5, 0x7ed30d67

    xor-int/2addr v4, v5

    const v5, 0x36ad6a66

    goto/16 :goto_0

    :sswitch_12
    return-void

    .line 183
    :sswitch_13
    iput-boolean p5, p4, Ll/۠۠᩸;->᩸:Z

    goto/16 :goto_7

    :sswitch_14
    if-eqz p6, :cond_5

    const-string v3, "\u0733\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d77

    const v5, -0x10bb5b2a

    xor-int/2addr v4, v5

    const v5, -0x1eb23f3d

    goto/16 :goto_0

    :cond_5
    :goto_4
    const-string v3, "\u05ab\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3cb1

    const v5, -0x5180fef4

    xor-int/2addr v4, v5

    const v5, 0x9534ecb

    goto/16 :goto_0

    .line 175
    :sswitch_15
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->ܽ᩸()V

    goto/16 :goto_a

    .line 187
    :sswitch_16
    invoke-static {p1, p2}, Landroid/text/method/MetaKeyKeyListener;->isMetaTracker(Ljava/lang/CharSequence;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "\u06d9\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4545

    const v5, -0x1a918844

    xor-int/2addr v4, v5

    const v5, -0x7d2e477d

    goto/16 :goto_0

    :cond_6
    :goto_5
    const-string v3, "\u1a76\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4a33

    const v5, 0x1aefaa2d

    xor-int/2addr v4, v5

    const v5, -0x54063cd2

    goto/16 :goto_0

    .line 180
    :sswitch_17
    iget v3, p4, Ll/۠۠᩸;->ۙ:I

    if-nez v3, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v3, "\u06d8\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63b5

    const v5, 0xde14845

    xor-int/2addr v4, v5

    const v5, 0x4c84abfb    # 6.955823E7f

    goto/16 :goto_0

    .line 181
    :sswitch_18
    invoke-static {p3}, Ll/֡ᩴ;->֨ܶܳ(Ljava/lang/Object;)V

    goto :goto_7

    .line 166
    :sswitch_19
    invoke-static {p3}, Ll/ۗ֫;->۫ᩴ᩸(Ljava/lang/Object;)I

    move-result p6

    .line 167
    invoke-static {p3}, Ll/֨ۢ;->ۖܿۘ(Ljava/lang/Object;)I

    move-result v3

    .line 168
    invoke-virtual {p3, p6, v3}, Ll/᩺ۜ᩸;->ۙ(II)V

    .line 169
    invoke-virtual {p3}, Ll/᩺ۜ᩸;->ܺ()V

    if-ne p6, v3, :cond_8

    const-string v3, "\u06e1\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4b43

    const v5, 0x6bb3048a

    xor-int/2addr v4, v5

    const v5, 0x1183a18d

    goto/16 :goto_0

    :cond_8
    :goto_6
    const-string v3, "\u06ec\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x42d5

    const v5, -0x5ccdf597

    xor-int/2addr v4, v5

    const v5, 0x28f3b166

    goto/16 :goto_0

    .line 178
    :sswitch_1a
    instance-of v3, p2, Landroid/text/style/ParagraphStyle;

    if-eqz v3, :cond_9

    goto/16 :goto_9

    :cond_9
    :goto_7
    const-string v3, "\u06e0\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x41b5

    const v5, 0x543cda0

    xor-int/2addr v4, v5

    const v5, 0x78690b7b

    goto/16 :goto_0

    :sswitch_1b
    if-eqz p4, :cond_a

    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b6b

    const v5, 0x14e491e

    xor-int/2addr v4, v5

    const v5, -0x2a9d8502

    goto/16 :goto_0

    :cond_a
    :goto_8
    const-string v3, "\u05a8\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75d1

    const v5, 0x2ca511eb

    xor-int/2addr v4, v5

    const v5, 0x4d1c5b4f    # 1.6395186E8f

    goto/16 :goto_0

    .line 165
    :sswitch_1c
    invoke-static {p3}, Ll/ۖۗ;->ܰ᩸ۧ(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6865

    const v5, 0x5643463

    xor-int/2addr v4, v5

    const v5, 0x1a8ca911

    goto/16 :goto_0

    .line 177
    :sswitch_1d
    iget-object p4, p3, Ll/᩺ۜ᩸;->۠᩷:Ll/۠۠᩸;

    .line 178
    instance-of p5, p2, Landroid/text/style/UpdateAppearance;

    const/4 v3, 0x1

    if-nez p5, :cond_b

    const-string p5, "\u1a73\u1a77"

    invoke-static {p5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p5

    add-int/2addr p5, v2

    mul-int/lit8 p5, p5, 0x1b

    xor-int v4, p5, v1

    mul-int/lit16 v4, v4, -0x1f4b

    const v5, 0x59be2d28

    xor-int/2addr v4, v5

    const v5, -0x20716a41

    xor-int/2addr p5, v5

    move v3, p5

    const/4 p5, 0x1

    goto/16 :goto_1

    :cond_b
    const/4 p5, 0x1

    :goto_9
    const-string v3, "\u1a75\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x44e9

    const v5, 0xf9ed608

    xor-int/2addr v4, v5

    const v5, 0x34fe45fb

    goto/16 :goto_0

    .line 165
    :sswitch_1e
    sget-object p3, Landroid/text/Selection;->SELECTION_END:Ljava/lang/Object;

    iget-object v3, p0, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    if-ne p2, p3, :cond_c

    const-string p3, "\u1a75\u1a7a"

    invoke-static {p3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p3

    sub-int p3, v1, p3

    mul-int/lit8 p3, p3, -0x5d

    xor-int v4, p3, v2

    mul-int/lit16 v4, v4, 0x6d6d

    const v5, -0x6aadbd88

    xor-int/2addr v4, v5

    const v5, 0x6c46dce1

    xor-int/2addr p3, v5

    move-object v6, v3

    move v3, p3

    move-object p3, v6

    goto/16 :goto_1

    :cond_c
    move-object p3, v3

    :cond_d
    :goto_a
    const-string v3, "\u1a7a\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63ff

    const v5, 0x40104746

    xor-int/2addr v4, v5

    const v5, -0x3359ebfc    # -8.70728E7f

    goto/16 :goto_0

    .line 1207
    :sswitch_1f
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-ltz v3, :cond_e

    goto/16 :goto_11

    :cond_e
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x105f

    const v5, -0x59ef80bd

    xor-int/2addr v4, v5

    const v5, -0x361bc9e7

    goto/16 :goto_0

    .line 339
    :sswitch_20
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_10

    :cond_f
    :goto_b
    const-string v3, "\u06e4\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4465

    const v5, -0x6e9750d

    xor-int/2addr v4, v5

    const v5, -0x96dbb3

    goto/16 :goto_0

    :cond_10
    const-string v3, "\u1a79\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x627

    const v5, -0x7d51c946

    xor-int/2addr v4, v5

    const v5, 0x7f65245a

    goto/16 :goto_0

    .line 739
    :sswitch_21
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_c

    :cond_11
    const-string v3, "\u06e4\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7ffb

    const v5, 0x6a0527bc

    xor-int/2addr v4, v5

    const v5, 0x5becd122

    goto/16 :goto_0

    :sswitch_22
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-ltz v3, :cond_12

    goto/16 :goto_10

    :cond_12
    const-string v3, "\u06d8\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3311

    const v5, 0x6d5ed3b5

    xor-int/2addr v4, v5

    const v5, 0x5ef80430

    goto/16 :goto_0

    .line 736
    :sswitch_23
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_14

    :cond_13
    :goto_c
    const-string v3, "\u06d9\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5f01

    const v5, -0x109a078c

    xor-int/2addr v4, v5

    const v5, -0x3cadb914

    goto/16 :goto_0

    :cond_14
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3269

    const v5, 0x33ce537a

    xor-int/2addr v4, v5

    const v5, 0x4313cb99

    goto/16 :goto_0

    .line 1005
    :sswitch_24
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_16

    :cond_15
    :goto_d
    const-string v3, "\u06d9\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x42cb

    const v5, 0x5fd8a73e

    xor-int/2addr v4, v5

    const v5, -0x43761715

    goto/16 :goto_0

    :cond_16
    const-string v3, "\u1a77\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x725b

    const v5, -0x6ee66a06

    xor-int/2addr v4, v5

    const v5, -0x17230cea

    goto/16 :goto_0

    .line 659
    :sswitch_25
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v3

    if-gtz v3, :cond_18

    :cond_17
    :goto_e
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x41b9

    const v5, -0x27eb04da

    xor-int/2addr v4, v5

    const v5, -0x3241786a    # -3.995696E8f

    goto/16 :goto_0

    :cond_18
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x17a5

    const v5, 0x159b577c

    xor-int/2addr v4, v5

    const v5, -0x49ae4818

    goto/16 :goto_0

    .line 1156
    :sswitch_26
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_19

    :goto_f
    const-string v3, "\u1a7a\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3113

    const v5, -0x4917e6e3

    xor-int/2addr v4, v5

    const v5, -0x427c555

    goto/16 :goto_0

    :cond_19
    const-string v3, "\u0733\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5161

    const v5, -0x36a46f1d

    xor-int/2addr v4, v5

    const v5, 0x23cdefae

    goto/16 :goto_0

    .line 1127
    :sswitch_27
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v3

    if-nez v3, :cond_1b

    :cond_1a
    :goto_10
    const-string v3, "\u06da\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x49b3

    const v5, -0x2f9f7c74

    xor-int/2addr v4, v5

    const v5, 0x26e9aa86

    goto/16 :goto_0

    :cond_1b
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a7

    const v5, 0x56c86a72

    xor-int/2addr v4, v5

    const v5, 0xb6a6c3d

    goto/16 :goto_0

    .line 587
    :sswitch_28
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_1c

    :goto_11
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3c41

    const v5, -0x3bbf7b8

    xor-int/2addr v4, v5

    const v5, 0xc030709

    goto/16 :goto_0

    :cond_1c
    const-string v3, "\u06dc\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc9d

    const v5, 0xe75815a

    xor-int/2addr v4, v5

    const v5, 0x45c152b5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e7c4bb5 -> :sswitch_7
        -0x7cab1d9c -> :sswitch_4
        -0x7b7322e6 -> :sswitch_15
        -0x7a93e5be -> :sswitch_1b
        -0x7a85abda -> :sswitch_23
        -0x7a73deb3 -> :sswitch_24
        -0x77231479 -> :sswitch_25
        -0x73a38710 -> :sswitch_1a
        -0x735b6ef7 -> :sswitch_10
        -0x709f3c59 -> :sswitch_5
        -0x6fb6ef68 -> :sswitch_28
        -0x6f4ae628 -> :sswitch_26
        -0x6e625f21 -> :sswitch_9
        -0x6d0db561 -> :sswitch_1d
        -0x6cf1da31 -> :sswitch_28
        -0x6bcf51bd -> :sswitch_21
        -0x68029508 -> :sswitch_c
        -0x63fea3db -> :sswitch_23
        -0x61fae989 -> :sswitch_0
        -0x61b2c93c -> :sswitch_d
        -0x5e43cc2b -> :sswitch_17
        -0x55791ceb -> :sswitch_1a
        -0x5486af6c -> :sswitch_f
        -0x53c2caca -> :sswitch_8
        -0x52476aa3 -> :sswitch_20
        -0x4e1090a2 -> :sswitch_9
        -0x4c9a551b -> :sswitch_18
        -0x469ca34a -> :sswitch_8
        -0x437481c6 -> :sswitch_22
        -0x42c5bbf6 -> :sswitch_1e
        -0x4294e079 -> :sswitch_e
        -0x3f25c932 -> :sswitch_14
        -0x3cb7391f -> :sswitch_3
        -0x37a85aa0 -> :sswitch_6
        -0x30ae89e1 -> :sswitch_5
        -0x2ec04b5d -> :sswitch_2
        -0x2c6edeab -> :sswitch_12
        -0x273998e8 -> :sswitch_a
        -0x26fe349e -> :sswitch_16
        -0x229cd493 -> :sswitch_d
        -0x20dbe618 -> :sswitch_12
        -0x14761ee7 -> :sswitch_3
        -0xd88bf81 -> :sswitch_27
        -0xd135964 -> :sswitch_22
        -0x39adb9f -> :sswitch_24
        0x39fc553 -> :sswitch_13
        0x5aa1007 -> :sswitch_1
        0x6b018f3 -> :sswitch_13
        0x728fb72 -> :sswitch_18
        0x118044db -> :sswitch_e
        0x11d864aa -> :sswitch_20
        0x137e0da8 -> :sswitch_1c
        0x198ea2b2 -> :sswitch_11
        0x1e4b6d4c -> :sswitch_1e
        0x1f156852 -> :sswitch_b
        0x2963d4bf -> :sswitch_6
        0x29a24755 -> :sswitch_b
        0x29a2736e -> :sswitch_26
        0x2a264b17 -> :sswitch_21
        0x2b98075d -> :sswitch_15
        0x2cedbb5b -> :sswitch_a
        0x325dbed2 -> :sswitch_16
        0x32ae2c38 -> :sswitch_4
        0x3552028c -> :sswitch_1f
        0x3f2a6dbe -> :sswitch_1
        0x443194ae -> :sswitch_0
        0x45fb1320 -> :sswitch_f
        0x47c99961 -> :sswitch_1f
        0x53a4514a -> :sswitch_1d
        0x57139dd2 -> :sswitch_25
        0x5a87b1e1 -> :sswitch_10
        0x5bb71450 -> :sswitch_14
        0x606fcf72 -> :sswitch_1c
        0x66d21800 -> :sswitch_19
        0x69579194 -> :sswitch_17
        0x6acea2e9 -> :sswitch_27
        0x6cdd184d -> :sswitch_7
        0x6e03ebe4 -> :sswitch_11
        0x6e52e651 -> :sswitch_19
        0x70bc4d0c -> :sswitch_2
        0x73f6bd8a -> :sswitch_1b
        0x7ef8e023 -> :sswitch_c
    .end sparse-switch
.end method

.method public final onSpanRemoved(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 2

    const p1, -0x60513866

    sget p2, Ll/ۖᩳ;->᩹ۧܳ:I

    sget p3, Ll/֡ۢ;->۟֡᩻:I

    const-string p4, "\u06da\u1a75"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x4539

    const v1, -0x3d1a167b

    xor-int/2addr v0, v1

    const v1, -0x46115a2

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, 0x15a5

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_0
    sget p4, Ll/֫۠;->ۢᩴ᩺:I

    if-lez p4, :cond_2

    goto/16 :goto_3

    .line 1
    :sswitch_1
    sget p4, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez p4, :cond_4

    goto/16 :goto_1

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget p4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz p4, :cond_8

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    :sswitch_4
    return-void

    .line 1
    :sswitch_5
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result p4

    if-eqz p4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string p4, "\u06da\u073d"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x6f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x695d

    const v1, -0x62b5e8ba

    xor-int/2addr v0, v1

    const v1, 0x2e21fcf3

    goto :goto_0

    .line 4
    :sswitch_6
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result p4

    if-nez p4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string p4, "\u05a1\u1a76"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x21

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x3b95

    const v1, 0x379f4d70

    xor-int/2addr v0, v1

    const v1, -0x52b3d9cc

    goto :goto_0

    :sswitch_7
    sget p4, Ll/ۖ;->ܿۚ֡:I

    if-ltz p4, :cond_3

    :cond_2
    const-string p4, "\u05ab\u1a79"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x6885

    const v1, -0x31cef24b

    xor-int/2addr v0, v1

    const v1, -0x2ae3ff40

    goto/16 :goto_0

    :cond_3
    const-string p4, "\u06e1\u05a8"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x57

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1bb1

    const v1, -0x7cba7ce2

    xor-int/2addr v0, v1

    const v1, -0x45345654

    goto/16 :goto_0

    :sswitch_8
    sget p4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz p4, :cond_5

    :cond_4
    const-string p4, "\u05a1\u1a79"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0xe19

    const v1, 0x5b2993a1

    xor-int/2addr v0, v1

    const v1, 0x1b70c7fe

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u0733\u06e1"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0xd81

    const v1, 0x5785273e

    xor-int/2addr v0, v1

    const v1, 0x216f1c4b

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget p4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz p4, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string p4, "\u06da\u06e2"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x71

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x13bb

    const v1, -0x3426e51a

    xor-int/2addr v0, v1

    const v1, 0xa333a6a

    goto/16 :goto_0

    :sswitch_a
    sget p4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz p4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string p4, "\u06e2\u1a77"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x78a7

    const v1, 0x4e5ff358    # 9.3931674E8f

    xor-int/2addr v0, v1

    const v1, 0x196e68f3

    goto/16 :goto_0

    :sswitch_b
    sget p4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz p4, :cond_9

    :cond_8
    :goto_1
    const-string p4, "\u06e1\u06e8"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2a05

    const v1, 0x7cad08a6

    xor-int/2addr v0, v1

    const v1, -0x8a7bf7a

    goto/16 :goto_0

    :cond_9
    const-string p4, "\u06dc\u05a8"

    invoke-static {p4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x41

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x78db

    const v1, 0x59afd46d

    xor-int/2addr v0, v1

    const v1, -0x1b8bc1d7

    goto/16 :goto_0

    :sswitch_c
    sget-boolean p4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz p4, :cond_a

    goto :goto_3

    :cond_a
    const-string p4, "\u1a7a\u06e1"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x59b9

    const v1, -0x6d8eab45

    xor-int/2addr v0, v1

    const v1, 0x114f08d8

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget p4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz p4, :cond_b

    :goto_2
    const-string p4, "\u06e2\u0730"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1653

    const v1, -0x224d6c4c

    xor-int/2addr v0, v1

    const v1, -0x5cd17ea7

    goto/16 :goto_0

    :cond_b
    const-string p4, "\u1a78\u073f"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x27

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x2149

    const v1, 0x51c1a1aa

    xor-int/2addr v0, v1

    const v1, -0x14e96386

    goto/16 :goto_0

    .line 1
    :sswitch_e
    sget p4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz p4, :cond_c

    :goto_3
    const-string p4, "\u06e0\u06e7"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x5119

    const v1, 0x790d4d7

    xor-int/2addr v0, v1

    const v1, 0x797b21e4

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u06da\u06e7"

    invoke-static {p4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x5039

    const v1, 0xfc30f38

    xor-int/2addr v0, v1

    const v1, -0x635aed73

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x788d5451 -> :sswitch_5
        -0x6acaf80f -> :sswitch_5
        -0x63c1bce1 -> :sswitch_4
        -0x53000793 -> :sswitch_4
        -0x4b284eab -> :sswitch_e
        -0x3e423125 -> :sswitch_7
        -0x3b2b67be -> :sswitch_c
        -0x2c1383f0 -> :sswitch_d
        -0x1f5ccbdf -> :sswitch_1
        -0x139817f9 -> :sswitch_0
        0x14d0048a -> :sswitch_7
        0x1c05411c -> :sswitch_b
        0x1cd19ac0 -> :sswitch_c
        0x281f3fe1 -> :sswitch_1
        0x28fc6af6 -> :sswitch_a
        0x33a31194 -> :sswitch_9
        0x3f2ce1b0 -> :sswitch_0
        0x418321f2 -> :sswitch_a
        0x4b3f621d -> :sswitch_6
        0x4cb78ea3 -> :sswitch_3
        0x4cc4032c -> :sswitch_3
        0x4e2f4e96 -> :sswitch_d
        0x4fec81b3 -> :sswitch_8
        0x52551b8c -> :sswitch_e
        0x5439bad6 -> :sswitch_2
        0x562732f6 -> :sswitch_9
        0x5a9370c6 -> :sswitch_8
        0x5e0586af -> :sswitch_b
        0x6edea71d -> :sswitch_6
        0x7259aaf8 -> :sswitch_2
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

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

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const v34, -0x3b20cba4

    sget v35, Ll/᩺;->۫۬۫:I

    sget v36, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v37, "\u06eb\u06db"

    invoke-static/range {v37 .. v37}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v37

    sub-int v37, v35, v37

    mul-int/lit8 v37, v37, -0x37

    xor-int v5, v37, v36

    mul-int/lit16 v5, v5, 0x3b4d

    const v39, -0x17091cd5

    xor-int v5, v5, v39

    const v39, 0x366708f0

    xor-int v37, v37, v39

    move-object v10, v9

    move-object/from16 v9, v16

    move-wide/from16 v22, v17

    move-object/from16 v30, v24

    move-wide/from16 v11, v25

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v17, v8

    move-object/from16 v25, v14

    move-object/from16 v24, v20

    const/4 v14, 0x0

    move-object v8, v7

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v3, v34, v36

    mul-int/lit16 v3, v3, -0x158b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v5

    xor-int v34, v37, v3

    sparse-switch v34, :sswitch_data_0

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 113
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۡ()V

    const/4 v5, 0x0

    .line 1351
    invoke-virtual {v6, v5}, Ll/᩺ۜ᩸;->ۙ(Z)V

    move v5, v11

    move-wide/from16 v10, v22

    .line 115
    iput-wide v10, v6, Ll/᩺ۜ᩸;->ܳۤ:J

    .line 116
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->֫᩸()V

    if-nez v29, :cond_18

    const-string v12, "\u073d\u05a8"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v35

    mul-int/lit8 v12, v12, -0x2b

    move/from16 v22, v5

    xor-int v5, v12, v36

    mul-int/lit16 v5, v5, 0x14af

    const v23, 0x1776808a

    xor-int v5, v5, v23

    const v23, 0x1aa7739

    xor-int v12, v12, v23

    move/from16 v41, v22

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move-wide/from16 v22, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    :goto_1
    move-object/from16 v24, v33

    move/from16 v21, v3

    move-wide/from16 v42, v37

    move/from16 v37, v12

    goto/16 :goto_1e

    :sswitch_0
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_1

    :cond_0
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_34

    :cond_1
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_32

    :sswitch_1
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :sswitch_2
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_3

    :cond_2
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_35

    :cond_3
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x1267

    const v31, 0xb3889ef

    xor-int v5, v5, v31

    const v31, 0x73bce78a

    goto/16 :goto_7

    .line 3689
    :sswitch_3
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_2

    :cond_4
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_36

    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06da\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x43b7

    const v31, -0x1ffe2564

    xor-int v5, v5, v31

    const v31, -0x317972ee

    goto/16 :goto_7

    :sswitch_5
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-gez v3, :cond_4

    goto :goto_3

    .line 9509
    :sswitch_6
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v3, :cond_6

    :goto_2
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_33

    :cond_6
    :goto_3
    const-string v3, "\u1a73\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, -0xc25

    const v31, -0x5f103c0c

    xor-int v5, v5, v31

    const v31, -0x4b5dfb4b

    goto/16 :goto_7

    :sswitch_7
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    :goto_4
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, -0x1dbb

    const v31, 0x68217c83

    xor-int v5, v5, v31

    const v31, 0x1b2ac3ff

    goto/16 :goto_7

    :sswitch_8
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto :goto_2

    .line 7141
    :sswitch_9
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    :sswitch_a
    sub-int v1, v14, v2

    .line 9422
    invoke-static {v13, v1}, Ll/᩺;->ܿۘܿ(II)I

    move-result v1

    sub-int v1, v14, v1

    move/from16 v31, v4

    move-object/from16 v5, v30

    goto/16 :goto_b

    :sswitch_b
    if-gez v1, :cond_8

    goto/16 :goto_6

    :cond_8
    move/from16 v28, v1

    move v5, v4

    move-object/from16 v26, v9

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v9, p3

    move/from16 v1, p4

    move/from16 v30, v28

    move/from16 v25, v5

    move-object/from16 v4, p1

    goto/16 :goto_1b

    .line 110
    :sswitch_c
    invoke-virtual {v7, v11, v12}, Ll/ܽ֨᩸;->ۙ(J)V

    goto/16 :goto_8

    .line 131
    :sswitch_d
    invoke-virtual {v6, v15}, Ll/᩺ۜ᩸;->ۧ(I)V

    goto/16 :goto_5

    :sswitch_e
    if-ge v2, v14, :cond_a

    const-string v3, "\u1a78\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x2db5

    const v31, 0x4b5b35d8    # 1.4366168E7f

    xor-int v5, v5, v31

    const v31, -0x6f393399

    goto/16 :goto_7

    :sswitch_f
    if-ltz v4, :cond_b

    const-string v3, "\u1a7b\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, -0x6d19

    const v31, -0x1bafe3f9

    xor-int v5, v5, v31

    const v31, 0x26e515ef

    goto/16 :goto_7

    :sswitch_10
    const/4 v3, -0x1

    .line 9426
    iput v3, v10, Ll/ܰۤᩴ;->ۘ᩷:I

    iput v3, v10, Ll/ܰۤᩴ;->ܰ᩷:I

    .line 9427
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ܽ()V

    .line 9428
    invoke-static {v6}, Ll/֡᩻;->᩻ᩳ۟(Ljava/lang/Object;)V

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move/from16 v42, v18

    move-object/from16 v18, v7

    move/from16 v7, v42

    move-wide/from16 v43, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v43

    goto/16 :goto_29

    .line 108
    :sswitch_11
    invoke-virtual {v8}, Ll/֨ܽᩴ;->᩷()J

    move-result-wide v31

    const-wide/16 v37, -0x1

    cmp-long v3, v31, v37

    if-nez v3, :cond_c

    const-string v3, "\u06e0\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x5ea9

    const v31, 0x55798cf7

    xor-int v5, v5, v31

    const v31, 0x617403f

    goto/16 :goto_7

    .line 130
    :sswitch_12
    iget v3, v0, Ll/ܶ֨᩸;->᩶:I

    if-eq v3, v15, :cond_9

    const-string v3, "\u06d8\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, 0x7bf5

    const v31, 0x3f80fc0f

    xor-int v5, v5, v31

    const v31, 0x3ff338ca

    goto/16 :goto_7

    :cond_9
    :goto_5
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    goto/16 :goto_30

    :sswitch_13
    if-lt v2, v4, :cond_a

    const-string v3, "\u06e7\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v5, v3, v35

    mul-int/lit16 v5, v5, 0x3303

    const v31, -0x2ccbe165

    xor-int v5, v5, v31

    const v31, -0x2e64accf

    goto :goto_7

    :cond_a
    move/from16 v31, v4

    move-object/from16 v5, v30

    goto/16 :goto_a

    :sswitch_14
    if-eq v4, v1, :cond_b

    const-string v3, "\u06da\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v35

    mul-int/lit8 v3, v3, 0x35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x20bb

    const v31, -0x5e43fe98

    xor-int v5, v5, v31

    const v31, 0x15bfbcb7

    goto :goto_7

    :cond_b
    :goto_6
    const-string v3, "\u1a7b\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v5, v3, v36

    mul-int/lit16 v5, v5, -0x401f

    const v31, 0xf8a8f63

    xor-int v5, v5, v31

    const v31, 0x41e11764

    goto :goto_7

    .line 107
    :sswitch_15
    invoke-virtual {v8}, Ll/֨ܽᩴ;->۫()Ll/ܺۧᩴ;

    move-result-object v3

    if-ne v9, v3, :cond_c

    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v5, v3, v35

    mul-int/lit8 v5, v5, -0x3f

    const v31, -0x2da2a72a

    xor-int v5, v5, v31

    const v31, 0x4da97e0d    # 3.554513E8f

    :goto_7
    xor-int v37, v3, v31

    goto/16 :goto_0

    :cond_c
    :goto_8
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-wide/from16 v18, v22

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v23, v8

    move-object v11, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    goto/16 :goto_20

    .line 126
    :sswitch_16
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۘ᩷()Z

    move-result v3

    move-object/from16 v5, v30

    invoke-interface {v5, v3}, Ll/۫ۜ᩸;->ۙ(Z)V

    .line 127
    iget-object v3, v6, Ll/᩺ۜ᩸;->֫ۙ:Ll/۫ۜ᩸;

    move/from16 v30, v1

    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۛ()Z

    move-result v1

    move/from16 v31, v4

    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۨ()Z

    move-result v4

    invoke-interface {v3, v1, v4}, Ll/۫ۜ᩸;->ۙ(ZZ)V

    move-object/from16 v4, p1

    move/from16 v1, p4

    move-object/from16 v32, v5

    move-object/from16 v33, v24

    move/from16 v5, v26

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v42, v31

    move-object/from16 v31, v25

    move/from16 v25, v42

    goto/16 :goto_e

    :sswitch_17
    move/from16 v31, v4

    move-object/from16 v5, v30

    move/from16 v30, v1

    .line 129
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ܽۙ()I

    move-result v15

    if-nez v29, :cond_d

    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v36, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, -0x5031

    const v4, 0x5aa14592

    xor-int/2addr v3, v4

    const v4, 0x4c882e8b    # 7.139849E7f

    goto :goto_9

    :cond_d
    move-object/from16 v4, p1

    move/from16 v1, p4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move/from16 v39, v40

    move-object/from16 v24, v5

    move-object/from16 v26, v9

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v9, p3

    move/from16 v42, v31

    move-object/from16 v31, v25

    move/from16 v25, v42

    move-wide/from16 v43, v22

    move/from16 v22, v41

    move-wide/from16 v40, v43

    goto/16 :goto_30

    :sswitch_18
    move/from16 v31, v4

    move-object/from16 v5, v30

    move/from16 v30, v1

    if-lez v13, :cond_e

    const-string v1, "\u0730\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v3, v1, v36

    mul-int/lit16 v3, v3, 0x1651

    const v4, -0x33dafb50

    xor-int/2addr v3, v4

    const v4, -0x41c691a0

    :goto_9
    xor-int v37, v1, v4

    move/from16 v1, v30

    move/from16 v4, v31

    goto/16 :goto_c

    :cond_e
    :goto_a
    move v1, v14

    :goto_b
    const-string v3, "\u06e2\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v4, v3, v36

    mul-int/lit16 v4, v4, 0x702b

    const v30, -0x33c2fc7f    # -4.9548804E7f

    xor-int v4, v4, v30

    const v30, 0xe853ee9

    xor-int v37, v3, v30

    move-object/from16 v30, v5

    move v5, v4

    move/from16 v4, v31

    goto/16 :goto_0

    :sswitch_19
    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    add-int v3, v26, v1

    move/from16 v27, v3

    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v25, v4

    move-object/from16 v24, v5

    move/from16 v5, v26

    move-object/from16 v4, p1

    move-object/from16 v26, v9

    move/from16 v9, p3

    goto/16 :goto_f

    :sswitch_1a
    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    add-int v3, v28, v1

    move/from16 v41, v3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move/from16 v40, v27

    move/from16 v25, v4

    move-object/from16 v24, v5

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    goto/16 :goto_15

    :sswitch_1b
    move-object/from16 v3, v25

    move-object/from16 v5, v30

    move/from16 v30, v1

    move/from16 v1, p4

    .line 105
    invoke-virtual {v8, v3}, Ll/֨ܽᩴ;->ᩴ(Ll/ۡ᩶᩸;)V

    cmp-long v25, v11, v22

    if-ltz v25, :cond_f

    const-string v25, "\u1a73\u06db"

    invoke-static/range {v25 .. v25}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v25

    add-int v25, v25, v36

    mul-int/lit8 v25, v25, 0xd

    move-object/from16 v31, v3

    xor-int v3, v25, v35

    mul-int/lit16 v3, v3, -0x1263

    const v32, -0x7ab328b0

    xor-int v3, v3, v32

    const v32, 0x1f5526a7

    xor-int v37, v25, v32

    move/from16 v1, v30

    move-object/from16 v25, v31

    :goto_c
    move-object/from16 v30, v5

    goto/16 :goto_d

    :cond_f
    move-object/from16 v31, v3

    move/from16 v25, v4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move/from16 v39, v40

    move-object/from16 v4, p1

    move-object/from16 v24, v5

    move-object v11, v9

    move-object/from16 v5, v17

    move/from16 v17, v19

    move-wide/from16 v18, v22

    move/from16 v22, v41

    move/from16 v9, p3

    goto/16 :goto_1f

    :sswitch_1c
    move-object/from16 v3, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 120
    invoke-virtual {v3, v4, v2, v9, v1}, Ll/ܽᩴᩴ;->᩷(Ljava/lang/CharSequence;III)V

    move-object/from16 v33, v3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-wide/from16 v10, v22

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v21, v5

    goto/16 :goto_1d

    :sswitch_1d
    move-object/from16 v3, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 123
    invoke-static/range {v20 .. v20}, Ll/ۘܶ;->֡۟ۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v32

    move-object/from16 v33, v3

    move-object/from16 v3, v32

    check-cast v3, Landroid/text/TextWatcher;

    .line 124
    invoke-interface {v3, v4, v2, v9, v1}, Landroid/text/TextWatcher;->onTextChanged(Ljava/lang/CharSequence;III)V

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v21, v5

    goto/16 :goto_17

    :sswitch_1e
    move/from16 v30, v1

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move/from16 v1, p4

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    .line 125
    iget-object v3, v6, Ll/᩺ۜ᩸;->֫ۙ:Ll/۫ۜ᩸;

    if-eqz v3, :cond_10

    const-string v24, "\u06df\u06e2"

    invoke-static/range {v24 .. v24}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v24

    sub-int v24, v36, v24

    mul-int/lit8 v24, v24, 0x21

    move-object/from16 v32, v3

    xor-int v3, v24, v35

    mul-int/lit16 v3, v3, 0x5e87

    const v37, -0x4ab4bc59

    xor-int v3, v3, v37

    const v37, -0x420e419c

    xor-int v37, v24, v37

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v30, v32

    move-object/from16 v24, v33

    move/from16 v26, v5

    :goto_d
    move v5, v3

    goto/16 :goto_0

    :cond_10
    move-object/from16 v32, v3

    :goto_e
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    move-wide/from16 v37, v11

    xor-int v11, v3, v36

    mul-int/lit16 v11, v11, -0x57d9

    const v12, 0x15f623b7

    xor-int/2addr v11, v12

    const v12, -0x12b2c19f

    xor-int/2addr v3, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v30, v32

    move-object/from16 v24, v33

    move/from16 v26, v5

    move v5, v11

    goto/16 :goto_13

    :sswitch_1f
    move-object/from16 v4, p1

    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v1, p4

    sub-int v3, v21, v2

    .line 9416
    invoke-static {v9, v3}, Ll/᩺;->ܿۘܿ(II)I

    move-result v3

    sub-int v11, v9, v3

    sub-int v12, v21, v3

    sub-int v3, v18, v3

    move v14, v3

    move v13, v11

    move/from16 v3, v21

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v21, v5

    goto/16 :goto_14

    :sswitch_20
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-ge v2, v5, :cond_11

    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, 0x397f

    const v12, -0x6f20a435

    xor-int/2addr v11, v12

    const v12, 0x46d11c9d

    goto :goto_10

    :cond_11
    move/from16 v27, v5

    :goto_f
    const-string v3, "\u1a77\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v11, v3, v36

    mul-int/lit16 v11, v11, -0x7cdf

    const v12, -0x3bd539c5

    xor-int/2addr v11, v12

    const v12, 0x33de19a8

    :goto_10
    xor-int/2addr v3, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v26, v5

    move v5, v11

    goto/16 :goto_12

    :sswitch_21
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 9440
    iput v3, v10, Ll/ܰۤᩴ;->ܰ᩷:I

    move/from16 v11, v41

    .line 9441
    iput v11, v10, Ll/ܰۤᩴ;->ۘ᩷:I

    .line 9442
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ܽ()V

    .line 9443
    invoke-static {v6}, Ll/֡ᩴ;->֨ܶܳ(Ljava/lang/Object;)V

    move/from16 v39, v3

    move/from16 v12, v16

    move/from16 v3, v21

    move-wide/from16 v40, v22

    move/from16 v21, v5

    move-object/from16 v23, v8

    move/from16 v22, v11

    move-object/from16 v5, v17

    move/from16 v17, v19

    move/from16 v42, v18

    move-object/from16 v18, v7

    move/from16 v7, v42

    goto/16 :goto_29

    :sswitch_22
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 102
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۖۤ()V

    move/from16 v39, v3

    move-object/from16 v32, v10

    move/from16 v3, v21

    move/from16 v21, v5

    goto/16 :goto_1c

    :sswitch_23
    move-wide/from16 v37, v11

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v3, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 118
    iget-object v12, v6, Ll/᩺ۜ᩸;->᩷ۙ:Ll/ܽᩴᩴ;

    if-eqz v12, :cond_12

    const-string v32, "\u06df\u1a79"

    invoke-static/range {v32 .. v32}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v32

    sub-int v32, v35, v32

    mul-int/lit8 v32, v32, 0x45

    move/from16 v39, v3

    xor-int v3, v32, v36

    mul-int/lit16 v3, v3, -0x52cd

    const v33, -0x3fee581

    xor-int v3, v3, v33

    const v33, -0xfbae1d4

    xor-int v32, v32, v33

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move-object/from16 v30, v24

    move v5, v3

    move-object/from16 v24, v12

    move-wide/from16 v11, v37

    move/from16 v37, v32

    goto/16 :goto_0

    :cond_12
    move/from16 v39, v3

    move-object/from16 v32, v10

    move-object/from16 v33, v12

    move/from16 v3, v21

    move/from16 v21, v5

    goto/16 :goto_16

    :sswitch_24
    move-wide/from16 v37, v11

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 123
    invoke-static/range {v20 .. v20}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    const-string v3, "\u0730\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v36

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x1589

    const v32, 0x5d42e341

    xor-int v12, v12, v32

    const v32, -0x657665f2

    goto :goto_11

    :cond_13
    const-string v3, "\u1a77\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v36, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0xa95

    const v32, 0x23940f3b

    xor-int v12, v12, v32

    const v32, 0x546b3d07

    :goto_11
    xor-int v3, v3, v32

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move v5, v12

    :goto_12
    move-object/from16 v30, v24

    move-object/from16 v24, v33

    :goto_13
    move-wide/from16 v11, v37

    move/from16 v37, v3

    goto/16 :goto_0

    :sswitch_25
    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v5, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-ge v2, v3, :cond_14

    const-string v12, "\u0736\u1a79"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int v12, v12, v35

    mul-int/lit8 v12, v12, 0x3

    move/from16 v21, v5

    xor-int v5, v12, v36

    mul-int/lit16 v5, v5, -0x21cd

    const v32, 0x1029188

    xor-int v5, v5, v32

    const v32, 0x1a965c5

    xor-int v12, v12, v32

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v21

    move-object/from16 v30, v24

    goto/16 :goto_1

    :cond_14
    move/from16 v21, v5

    move v12, v3

    move v13, v9

    move/from16 v14, v18

    :goto_14
    const-string v5, "\u1a73\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    move-object/from16 v32, v10

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, 0x2ef5

    const v25, 0x44211eb8

    xor-int v10, v10, v25

    const v25, 0x61816b14

    xor-int v5, v5, v25

    move/from16 v41, v11

    move v4, v12

    goto/16 :goto_19

    :sswitch_26
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-lez v1, :cond_15

    const-string v5, "\u06d6\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x85d

    const v12, 0x58eb162a

    xor-int/2addr v10, v12

    const v12, 0x375cb394

    goto/16 :goto_18

    :cond_15
    move/from16 v40, v21

    move/from16 v41, v28

    :goto_15
    const-string v5, "\u06d7\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, 0x7615

    const v11, -0x43ac7616

    xor-int/2addr v10, v11

    const v11, -0x5204ad63

    xor-int/2addr v5, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    goto/16 :goto_1a

    :sswitch_27
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 10117
    iget-boolean v5, v6, Ll/᩺ۜ᩸;->ۚ᩷:Z

    if-nez v5, :cond_16

    const-string v5, "\u06df\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x2b11

    const v12, 0x17ade1c2

    xor-int/2addr v10, v12

    const v12, -0x5b4a95b

    goto/16 :goto_18

    :cond_16
    :goto_16
    move-wide/from16 v42, v22

    move/from16 v22, v11

    move-wide/from16 v10, v42

    goto/16 :goto_1d

    :sswitch_28
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 123
    iget-object v5, v6, Ll/᩺ۜ᩸;->ۙۤ:Ljava/util/ArrayList;

    invoke-static {v5}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    move-object/from16 v20, v5

    :goto_17
    const-string v5, "\u06dc\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v35

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, 0x7bd7

    const v12, 0x26dcc509

    xor-int/2addr v10, v12

    const v12, 0x2523bfd1

    goto :goto_18

    :sswitch_29
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    if-lez v9, :cond_17

    const-string v5, "\u073f\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, -0x6813

    const v12, -0x16c1d4be

    xor-int/2addr v10, v12

    const v12, -0x563da3fb

    :goto_18
    xor-int/2addr v5, v12

    move/from16 v41, v11

    move/from16 v4, v25

    :goto_19
    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v40, v39

    :goto_1a
    move/from16 v37, v5

    move v5, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_0

    :cond_17
    move v5, v3

    move/from16 v28, v18

    :goto_1b
    const-string v10, "\u06d7\u1a7b"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v36

    xor-int v12, v10, v35

    mul-int/lit16 v12, v12, -0x59a3

    const v21, -0x51da98b

    xor-int v12, v12, v21

    const v21, -0x6a0cc6f4

    xor-int v10, v10, v21

    move/from16 v21, v3

    move/from16 v41, v11

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v26, v5

    move v5, v12

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v37, v10

    goto/16 :goto_21

    :sswitch_2a
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v11, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 99
    :try_start_0
    iget-object v5, v6, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v5, v2, v9, v1}, Ll/۬ۡ᩸;->ۙ(III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1c
    const-string v5, "\u0736\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v10, v5, v35

    mul-int/lit16 v10, v10, 0x69d1

    const v12, -0x3a336b26

    xor-int/2addr v10, v12

    const v12, 0x721e8a38

    goto/16 :goto_18

    :catch_0
    const-string v5, "\u06d6\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v35, v5

    mul-int/lit8 v5, v5, -0x63

    xor-int v10, v5, v36

    mul-int/lit16 v10, v10, 0x7e57

    const v12, -0x7f3a71c0

    xor-int/2addr v10, v12

    const v12, 0x129a6695

    goto/16 :goto_18

    :cond_18
    move/from16 v22, v5

    :goto_1d
    const-string v5, "\u073f\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    mul-int/lit8 v5, v5, 0x15

    xor-int v12, v5, v35

    mul-int/lit16 v12, v12, -0x41b

    const v23, 0x2e7c30ff

    xor-int v12, v12, v23

    const v23, -0x45013bac

    xor-int v5, v5, v23

    move/from16 v41, v22

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move-wide/from16 v22, v10

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    move-object/from16 v24, v33

    move/from16 v21, v3

    move-wide/from16 v42, v37

    move/from16 v37, v5

    move v5, v12

    :goto_1e
    move-wide/from16 v11, v42

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v12, v19

    move/from16 v3, v21

    move-wide/from16 v10, v22

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    .line 83
    iput v12, v5, Ll/۠۠᩸;->᩷:I

    move-object/from16 v23, v8

    move-wide/from16 v40, v10

    move/from16 v12, v16

    move/from16 v10, v18

    move-object/from16 v18, v7

    goto/16 :goto_2d

    :sswitch_2c
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v12, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-le v2, v10, :cond_19

    move-object/from16 v18, v7

    move-object/from16 v23, v8

    move v7, v10

    move/from16 v17, v12

    goto/16 :goto_22

    :cond_19
    const-string v11, "\u1a7b\u06d8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v35

    move/from16 v17, v12

    xor-int v12, v11, v36

    mul-int/lit16 v12, v12, -0x6457

    const v18, -0x4079cb58

    xor-int v12, v12, v18

    const v18, -0x3d8fd81c

    xor-int v11, v11, v18

    move/from16 v18, v10

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v12

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_31

    :sswitch_2d
    move/from16 v9, p3

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v22, v41

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v4, p1

    move/from16 v1, p4

    .line 94
    invoke-virtual {v8}, Ll/֨ܽᩴ;->۫()Ll/ܺۧᩴ;

    move-result-object v11

    .line 96
    invoke-virtual {v8, v2, v9, v1, v4}, Ll/֨ܽᩴ;->ۙ(IIILjava/lang/CharSequence;)V

    const-wide/16 v18, 0x0

    if-nez v29, :cond_1a

    const-string v12, "\u073a\u1a79"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v35

    move-object/from16 v23, v8

    xor-int v8, v12, v36

    mul-int/lit16 v8, v8, 0x5d79

    const v26, -0x21e83e66

    xor-int v8, v8, v26

    const v26, 0xcafef65

    xor-int v12, v12, v26

    move-object v9, v11

    move/from16 v26, v21

    move/from16 v41, v22

    move/from16 v4, v25

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v21, v3

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v42, v17

    move-object/from16 v17, v5

    move v5, v8

    move-object/from16 v8, v23

    move-wide/from16 v22, v18

    move/from16 v18, v10

    move/from16 v19, v42

    move-object/from16 v10, v32

    move-wide/from16 v43, v37

    move/from16 v37, v12

    move-wide/from16 v11, v43

    goto/16 :goto_0

    :cond_1a
    :goto_1f
    move-object/from16 v23, v8

    :goto_20
    const-string v8, "\u06e1\u1a73"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v36

    xor-int v12, v8, v35

    mul-int/lit16 v12, v12, 0x693

    const v26, -0x230b99e5

    xor-int v12, v12, v26

    const v26, -0x3b911315

    xor-int v8, v8, v26

    move-object v9, v11

    move/from16 v26, v21

    move/from16 v41, v22

    move/from16 v4, v25

    move/from16 v1, v30

    move-object/from16 v25, v31

    move/from16 v40, v39

    move/from16 v21, v3

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v42, v17

    move-object/from16 v17, v5

    move v5, v12

    move-wide/from16 v11, v37

    move/from16 v37, v8

    move-object/from16 v8, v23

    move-wide/from16 v22, v18

    move/from16 v18, v10

    move/from16 v19, v42

    :goto_21
    move-object/from16 v10, v32

    goto/16 :goto_0

    :sswitch_2e
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 82
    iput v2, v5, Ll/۠۠᩸;->ۤ:I

    move-object/from16 v18, v7

    move/from16 v12, v16

    goto/16 :goto_24

    :sswitch_2f
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 83
    iget v8, v5, Ll/۠۠᩸;->᩷:I

    add-int v11, v2, v9

    if-ge v8, v11, :cond_1b

    const-string v8, "\u073a\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v36

    xor-int v12, v8, v35

    mul-int/lit16 v12, v12, 0x4577

    const v17, 0x4c56949

    xor-int v12, v12, v17

    const v17, 0x3a94e66b

    xor-int v8, v8, v17

    move-object/from16 v17, v5

    move/from16 v18, v10

    move/from16 v19, v11

    move v5, v12

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-wide/from16 v11, v37

    move/from16 v37, v8

    move/from16 v26, v21

    move-object/from16 v8, v23

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move/from16 v21, v3

    goto/16 :goto_3a

    :cond_1b
    move-object/from16 v17, v5

    move-object/from16 v18, v7

    move/from16 v19, v11

    move/from16 v12, v16

    goto/16 :goto_2d

    :sswitch_30
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-ltz v10, :cond_1c

    const-string v8, "\u1a7b\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v35

    mul-int/lit8 v8, v8, -0x71

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x5b3d

    const v12, 0x29c600ae

    xor-int/2addr v11, v12

    const v12, -0x1dfe326f

    xor-int/2addr v8, v12

    move/from16 v18, v10

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    goto/16 :goto_28

    :cond_1c
    move-object/from16 v18, v7

    move v7, v10

    :goto_22
    move/from16 v12, v16

    goto/16 :goto_25

    :sswitch_31
    move-object/from16 v32, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    const-wide/16 v11, -0x1

    goto :goto_23

    :sswitch_32
    move-object/from16 v32, v10

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 93
    invoke-virtual {v7, v2, v9, v1}, Ll/ܽ֨᩸;->ۙ(III)J

    move-result-wide v11

    :goto_23
    const-string v8, "\u06da\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v36

    mul-int/lit8 v8, v8, 0x75

    move-object/from16 v18, v7

    xor-int v7, v8, v35

    mul-int/lit16 v7, v7, 0x1375

    const v19, -0x7ba7a37c

    xor-int v7, v7, v19

    const v19, 0x46df9eac

    xor-int v37, v8, v19

    move/from16 v19, v17

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    goto/16 :goto_2e

    :sswitch_33
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 79
    iput v2, v5, Ll/۠۠᩸;->ۤ:I

    add-int v7, v2, v9

    .line 80
    iput v7, v5, Ll/۠۠᩸;->᩷:I

    move/from16 v12, v16

    goto/16 :goto_2c

    :sswitch_34
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-le v12, v2, :cond_1d

    const-string v7, "\u1a77\u06d6"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v35, v7

    mul-int/lit8 v7, v7, -0x49

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, -0x5d2b

    const v11, -0x747895e9

    xor-int/2addr v8, v11

    const v11, 0x3ade73f0

    goto/16 :goto_2b

    :cond_1d
    :goto_24
    const-string v7, "\u1a75\u06e0"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, 0x47bd

    const v11, -0x27c72b57

    xor-int/2addr v8, v11

    const v11, 0x1db2623

    goto/16 :goto_2b

    :sswitch_35
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    if-ltz v3, :cond_1e

    const-string v7, "\u06e4\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v36, v7

    mul-int/lit8 v7, v7, 0x6f

    xor-int v8, v7, v35

    mul-int/lit16 v8, v8, 0x973

    const v11, -0x74872cbb

    xor-int/2addr v8, v11

    const v11, -0x3adb9b40

    goto/16 :goto_2b

    :cond_1e
    move v7, v10

    :goto_25
    move-object/from16 v10, v32

    goto/16 :goto_29

    :sswitch_36
    move/from16 v25, v4

    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move-object/from16 v4, p1

    move/from16 v30, v1

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 91
    iget v7, v0, Ll/ܶ֨᩸;->ܿ:I

    invoke-virtual {v6, v2, v9, v1, v7}, Ll/᩺ۜ᩸;->ۙ(IIII)Z

    move-result v29

    .line 92
    iget-object v7, v6, Ll/᩺ۜ᩸;->ۛ᩸:Ll/ۖ᩷ᩴ;

    move-object v8, v4

    check-cast v8, Ll/ۡ᩶᩸;

    invoke-virtual {v7, v8, v2, v9, v1}, Ll/ۖ᩷ᩴ;->ۙ(Ll/ۡ᩶᩸;III)V

    if-eqz v29, :cond_1f

    const-string v7, "\u1a79\u06da"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    mul-int/lit8 v7, v7, -0x1b

    xor-int v11, v7, v36

    mul-int/lit16 v11, v11, 0x6fc7

    const v16, 0x7b7ff743

    xor-int v11, v11, v16

    const v16, 0x30eaaf4a

    goto :goto_26

    :cond_1f
    const-string v7, "\u1a7a\u06e8"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    add-int v7, v7, v36

    mul-int/lit8 v7, v7, -0x13

    xor-int v11, v7, v35

    mul-int/lit16 v11, v11, 0x6d6d

    const v16, 0x5000ce8e

    xor-int v11, v11, v16

    const v16, 0x198d33e0    # 1.460001E-23f

    :goto_26
    xor-int v7, v7, v16

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v17, v5

    move-object/from16 v25, v8

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v8, v23

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v7

    move-object/from16 v7, v18

    goto/16 :goto_39

    :sswitch_37
    return-void

    :sswitch_38
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    const/4 v7, 0x1

    .line 77
    iput-boolean v7, v5, Ll/۠۠᩸;->᩸:Z

    .line 78
    iget v7, v5, Ll/۠۠᩸;->ۤ:I

    if-gez v7, :cond_20

    const-string v8, "\u05a8\u06e4"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v35

    mul-int/lit8 v8, v8, 0x17

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, -0x7ff7

    const v12, -0x11ab5c04

    xor-int/2addr v11, v12

    const v12, -0x77636b16

    goto :goto_27

    :cond_20
    const-string v8, "\u1a7b\u1a77"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v36

    mul-int/lit8 v8, v8, -0x1b

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, -0x7aff

    const v12, -0x5bfad674

    xor-int/2addr v11, v12

    const v12, -0x5151586e

    :goto_27
    xor-int/2addr v8, v12

    move/from16 v16, v7

    move/from16 v19, v17

    move-object/from16 v7, v18

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    move/from16 v18, v10

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v10, v32

    :goto_28
    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v8

    move-object/from16 v8, v23

    goto/16 :goto_3a

    :sswitch_39
    move-object/from16 v18, v7

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v17, v19

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 89
    invoke-virtual {v6}, Ll/᩺ۜ᩸;->ۛ᩷()V

    .line 9409
    iget-object v10, v6, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget v3, v10, Ll/ܰۤᩴ;->ܰ᩷:I

    .line 9410
    iget v7, v10, Ll/ܰۤᩴ;->ۘ᩷:I

    if-eq v3, v7, :cond_21

    const-string v8, "\u05ab\u06d8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v36, v8

    mul-int/lit8 v8, v8, 0x31

    xor-int v11, v8, v35

    mul-int/lit16 v11, v11, -0x6a49

    const v16, -0x4b996325

    xor-int v11, v11, v16

    const v16, -0x78b1e090

    goto :goto_2a

    :cond_21
    :goto_29
    const-string v8, "\u06e1\u06d8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v35, v8

    mul-int/lit8 v8, v8, -0xd

    xor-int v11, v8, v36

    mul-int/lit16 v11, v11, 0x4569

    const v16, 0x480d1863

    xor-int v11, v11, v16

    const v16, 0x7892ff55

    :goto_2a
    xor-int v8, v8, v16

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v21, v3

    move/from16 v37, v8

    move-object/from16 v8, v23

    move-object/from16 v42, v18

    move/from16 v18, v7

    move-object/from16 v7, v42

    move-wide/from16 v43, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v43

    goto/16 :goto_0

    :sswitch_3a
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 74
    invoke-virtual {v6, v2, v1}, Ll/᩺ۜ᩸;->ᩴ(II)V

    .line 75
    iget-object v5, v6, Ll/᩺ۜ᩸;->۠᩷:Ll/۠۠᩸;

    if-eqz v5, :cond_22

    const-string v7, "\u1a76\u05a8"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v35

    xor-int v8, v7, v36

    mul-int/lit16 v8, v8, -0x77b7

    const v11, -0x13da073e

    xor-int/2addr v8, v11

    const v11, 0x753acd06

    :goto_2b
    xor-int/2addr v7, v11

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move-object/from16 v17, v5

    move/from16 v37, v7

    move v5, v8

    move-object/from16 v7, v18

    move/from16 v26, v21

    move-object/from16 v8, v23

    goto :goto_2f

    :cond_22
    move/from16 v19, v17

    :goto_2c
    move-object/from16 v17, v5

    :goto_2d
    const-string v5, "\u06e0\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int v5, v5, v36

    xor-int v7, v5, v35

    mul-int/lit16 v7, v7, -0x36c1

    const v8, 0x3db81b82

    xor-int/2addr v7, v8

    const v8, 0x461780f3

    xor-int/2addr v5, v8

    move/from16 v16, v12

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v37, v5

    :goto_2e
    move v5, v7

    move-object/from16 v7, v18

    move/from16 v26, v21

    :goto_2f
    move-object/from16 v30, v24

    move-object/from16 v24, v33

    goto/16 :goto_38

    :sswitch_3b
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 71
    iget-object v6, v0, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    iget-object v7, v6, Ll/᩺ۜ᩸;->۠:Ll/ܽ֨᩸;

    iget-object v8, v6, Ll/᩺ۜ᩸;->۠᩸:Ll/֨ܽᩴ;

    invoke-static {v6}, Ll/ۗ᩵;->ۖ֡ᩳ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v11

    if-eq v4, v11, :cond_23

    :goto_30
    const-string v11, "\u06e7\u05a8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v36

    mul-int/lit8 v11, v11, 0x3d

    xor-int v0, v11, v35

    mul-int/lit16 v0, v0, -0x3711

    const v16, -0x24f39383

    xor-int v0, v0, v16

    const v16, -0x1d253109

    xor-int v11, v11, v16

    move/from16 v18, v10

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move v5, v0

    move/from16 v21, v3

    move-object/from16 v0, p0

    :goto_31
    move-wide/from16 v42, v37

    move/from16 v37, v11

    move-wide/from16 v11, v42

    move-wide/from16 v44, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v44

    goto/16 :goto_0

    :cond_23
    const-string v0, "\u1a7a\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x1b

    xor-int v11, v0, v36

    mul-int/lit16 v11, v11, -0x2767

    const v16, -0x4da4ac12

    xor-int v11, v11, v16

    const v16, 0x254b90f5

    xor-int v0, v0, v16

    move/from16 v18, v10

    move/from16 v16, v12

    move/from16 v19, v17

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-object/from16 v10, v32

    move-object/from16 v17, v5

    move v5, v11

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-wide/from16 v11, v37

    move/from16 v37, v0

    move/from16 v21, v3

    move-object/from16 v0, p0

    goto/16 :goto_3a

    :sswitch_3c
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 5642
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_24

    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x3675

    const v8, 0x18fbe4a5

    xor-int/2addr v7, v8

    const v8, 0x73911b12

    goto/16 :goto_37

    :cond_24
    const-string v0, "\u06d7\u06e7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x415b

    const v8, -0xc7c7018

    xor-int/2addr v7, v8

    const v8, -0x3ed08a8f

    goto/16 :goto_37

    :sswitch_3d
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/ۧ;->ۨۗܰ:I

    if-ltz v0, :cond_25

    goto/16 :goto_32

    :cond_25
    const-string v0, "\u05a8\u1a78"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x42b5

    const v8, 0x1b2562e6

    xor-int/2addr v7, v8

    const v8, -0x548bdd11

    goto/16 :goto_37

    :sswitch_3e
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 3350
    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_26

    goto/16 :goto_33

    :cond_26
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x1a9b

    const v8, 0x1b39d044

    xor-int/2addr v7, v8

    const v8, 0x383597ee

    goto/16 :goto_37

    :sswitch_3f
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 9811
    sget-boolean v0, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v0, :cond_27

    goto/16 :goto_34

    :cond_27
    const-string v0, "\u06e1\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x6de7

    const v8, 0x1cb4be93

    xor-int/2addr v7, v8

    const v8, 0x42d26c26

    goto/16 :goto_37

    :sswitch_40
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 7984
    sget v0, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v0, :cond_28

    :goto_32
    const-string v0, "\u1a73\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v36, v0

    mul-int/lit8 v0, v0, 0x2b

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x1c6f

    const v8, 0x7a75d52c

    xor-int/2addr v7, v8

    const v8, -0x6300a14b

    goto/16 :goto_37

    :cond_28
    const-string v0, "\u1a73\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0x45d9

    const v8, 0x8e505d9

    xor-int/2addr v7, v8

    const v8, -0x779593b4

    goto/16 :goto_37

    :sswitch_41
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 4344
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_29

    goto :goto_33

    :cond_29
    const-string v0, "\u06db\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x4f

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x6ae5

    const v8, 0x1434d295

    xor-int/2addr v7, v8

    const v8, -0x2a74a743

    goto/16 :goto_37

    :sswitch_42
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_2a

    :goto_33
    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x63e9

    const v8, 0x38c2f0b3

    xor-int/2addr v7, v8

    const v8, 0x5ef28dc7

    goto/16 :goto_37

    :cond_2a
    const-string v0, "\u1a77\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x7ee1

    const v8, -0x5c94fb34

    xor-int/2addr v7, v8

    const v8, -0x58d74eea

    goto/16 :goto_37

    :sswitch_43
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_2b

    :goto_34
    const-string v0, "\u06db\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x8b5

    const v8, 0x5e3ca333

    xor-int/2addr v7, v8

    const v8, -0x4d24d319

    goto/16 :goto_37

    :cond_2b
    const-string v0, "\u06e0\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x62a3

    const v8, 0x24a77afd

    xor-int/2addr v7, v8

    const v8, -0x24735685

    goto/16 :goto_37

    :sswitch_44
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 3922
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_2c

    :goto_35
    const-string v0, "\u073f\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v36

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, 0xb85

    const v8, -0x4c55f8b3

    xor-int/2addr v7, v8

    const v8, 0x7aa3dfc2

    goto/16 :goto_37

    :cond_2c
    const-string v0, "\u0730\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v36, v0

    mul-int/lit8 v0, v0, 0x67

    xor-int v7, v0, v35

    mul-int/lit16 v7, v7, -0x3175

    const v8, 0x4f2ef1e3

    xor-int/2addr v7, v8

    const v8, 0x5069ef7e

    goto :goto_37

    :sswitch_45
    move-object/from16 v32, v10

    move-wide/from16 v37, v11

    move/from16 v12, v16

    move-object/from16 v5, v17

    move/from16 v10, v18

    move/from16 v17, v19

    move/from16 v3, v21

    move-object/from16 v33, v24

    move-object/from16 v31, v25

    move/from16 v21, v26

    move-object/from16 v24, v30

    move/from16 v39, v40

    move/from16 v30, v1

    move/from16 v25, v4

    move-object/from16 v18, v7

    move-object/from16 v26, v9

    move-object/from16 v4, p1

    move/from16 v9, p3

    move/from16 v1, p4

    move-wide/from16 v42, v22

    move-object/from16 v23, v8

    move/from16 v22, v41

    move-wide/from16 v40, v42

    .line 2972
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v0

    if-nez v0, :cond_2d

    :goto_36
    const-string v0, "\u06eb\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, 0x1327

    const v8, -0x2541d45e

    xor-int/2addr v7, v8

    const v8, 0x2b96fb6

    goto :goto_37

    :cond_2d
    const-string v0, "\u1a76\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x71

    xor-int v7, v0, v36

    mul-int/lit16 v7, v7, -0x29e7

    const v8, 0x6e680a0a

    xor-int/2addr v7, v8

    const v8, -0x29c99a48

    :goto_37
    xor-int/2addr v0, v8

    move/from16 v16, v12

    move/from16 v19, v17

    move-object/from16 v8, v23

    move/from16 v4, v25

    move-object/from16 v9, v26

    move/from16 v1, v30

    move-object/from16 v25, v31

    move-wide/from16 v11, v37

    move/from16 v37, v0

    move-object/from16 v17, v5

    move v5, v7

    move-object/from16 v7, v18

    move/from16 v26, v21

    move-object/from16 v30, v24

    move-object/from16 v24, v33

    move-object/from16 v0, p0

    :goto_38
    move/from16 v21, v3

    :goto_39
    move/from16 v18, v10

    move-object/from16 v10, v32

    :goto_3a
    move-wide/from16 v42, v40

    move/from16 v41, v22

    move/from16 v40, v39

    move-wide/from16 v22, v42

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b253b44 -> :sswitch_13
        -0x79eeff56 -> :sswitch_32
        -0x7993aaee -> :sswitch_37
        -0x77c75bd1 -> :sswitch_2
        -0x72ed2b5a -> :sswitch_1e
        -0x7255c287 -> :sswitch_27
        -0x7208a4c0 -> :sswitch_38
        -0x714c6c00 -> :sswitch_28
        -0x6f91ce5b -> :sswitch_16
        -0x6f40303b -> :sswitch_4
        -0x6e684757 -> :sswitch_3c
        -0x68e72741 -> :sswitch_21
        -0x68a1071a -> :sswitch_44
        -0x67fd648b -> :sswitch_1b
        -0x5ce1fc3f -> :sswitch_6
        -0x591b366f -> :sswitch_22
        -0x58953140 -> :sswitch_9
        -0x57a20d75 -> :sswitch_35
        -0x574c8a85 -> :sswitch_31
        -0x5677d5f9 -> :sswitch_26
        -0x55d95bcd -> :sswitch_a
        -0x53f45484 -> :sswitch_39
        -0x534485c4 -> :sswitch_19
        -0x5332c81f -> :sswitch_19
        -0x509cd0b6 -> :sswitch_5
        -0x506f6223 -> :sswitch_4
        -0x4f625478 -> :sswitch_34
        -0x4f433e62 -> :sswitch_e
        -0x4efa72f2 -> :sswitch_1f
        -0x4c527e7d -> :sswitch_2c
        -0x4b78e01e -> :sswitch_33
        -0x4973119a -> :sswitch_11
        -0x46811cf4 -> :sswitch_2d
        -0x465d019e -> :sswitch_2f
        -0x46441cd7 -> :sswitch_30
        -0x3ff2da9f -> :sswitch_12
        -0x3ee10342 -> :sswitch_17
        -0x3d1f8acc -> :sswitch_33
        -0x3c6b7c35 -> :sswitch_21
        -0x34adbda2 -> :sswitch_42
        -0x3371aa0f -> :sswitch_23
        -0x33052645 -> :sswitch_b
        -0x314fc9c2 -> :sswitch_1
        -0x2f7708d0 -> :sswitch_2b
        -0x2dd64497 -> :sswitch_3d
        -0x2adcc40e -> :sswitch_44
        -0x285148e1 -> :sswitch_17
        -0x22bf627e -> :sswitch_20
        -0x1fc9de0e -> :sswitch_34
        -0x1f038b29 -> :sswitch_3a
        -0x1dc4bc89 -> :sswitch_2c
        -0x1b2e7aaf -> :sswitch_1d
        -0x169b67a8 -> :sswitch_2
        -0x13f49447 -> :sswitch_c
        -0x10e16ece -> :sswitch_3a
        -0xec92eb7 -> :sswitch_8
        -0xdc29f96 -> :sswitch_8
        -0xb9afa32 -> :sswitch_5
        -0x76fb031 -> :sswitch_29
        -0x5405527 -> :sswitch_31
        -0x3f92e73 -> :sswitch_d
        -0x3085485 -> :sswitch_15
        -0x13df5d -> :sswitch_10
        0x510b055 -> :sswitch_d
        0x61e246a -> :sswitch_40
        0x93e716a -> :sswitch_1a
        0xa590535 -> :sswitch_7
        0xcc77cc1 -> :sswitch_2e
        0xcd324e0 -> :sswitch_29
        0xd238356 -> :sswitch_12
        0xd465447 -> :sswitch_3b
        0xf1f6864 -> :sswitch_1b
        0xf87e366 -> :sswitch_6
        0x10577ac3 -> :sswitch_23
        0x14564465 -> :sswitch_3c
        0x14a33247 -> :sswitch_1c
        0x14ee233f -> :sswitch_3
        0x19c90b8a -> :sswitch_3
        0x1a0026cc -> :sswitch_27
        0x1b593675 -> :sswitch_28
        0x1ceaa23b -> :sswitch_1f
        0x1da29fd9 -> :sswitch_39
        0x1ee551e3 -> :sswitch_16
        0x1f2222e0 -> :sswitch_42
        0x1fc03738 -> :sswitch_24
        0x205ea949 -> :sswitch_15
        0x24820dcd -> :sswitch_f
        0x2727dda4 -> :sswitch_14
        0x27e4d032 -> :sswitch_2b
        0x28e8ba71 -> :sswitch_22
        0x29cfe867 -> :sswitch_45
        0x2a6c4a26 -> :sswitch_37
        0x2ad2539e -> :sswitch_1e
        0x2b335805 -> :sswitch_3b
        0x2d8b9f26 -> :sswitch_2d
        0x2f41e5a0 -> :sswitch_1c
        0x2fe409b2 -> :sswitch_b
        0x3436e01b -> :sswitch_a
        0x3466b141 -> :sswitch_14
        0x3484b80a -> :sswitch_36
        0x34c4720d -> :sswitch_11
        0x364c468c -> :sswitch_2a
        0x3800cf47 -> :sswitch_0
        0x38367007 -> :sswitch_3e
        0x38783070 -> :sswitch_41
        0x3b3b4ebe -> :sswitch_2f
        0x3b877868 -> :sswitch_e
        0x40ef68d3 -> :sswitch_f
        0x42fec509 -> :sswitch_43
        0x43de4c55 -> :sswitch_25
        0x47145ab3 -> :sswitch_30
        0x48267037 -> :sswitch_35
        0x49729271 -> :sswitch_0
        0x4b763d98 -> :sswitch_3d
        0x4d37084e -> :sswitch_41
        0x4fdaa762 -> :sswitch_38
        0x579c99db -> :sswitch_3f
        0x58e56e4f -> :sswitch_2e
        0x5a2dd8d4 -> :sswitch_13
        0x5b6176e2 -> :sswitch_18
        0x5bdfed57 -> :sswitch_1a
        0x5ebdc9f6 -> :sswitch_7
        0x6122c49b -> :sswitch_43
        0x6275a0ef -> :sswitch_3f
        0x6365ef59 -> :sswitch_25
        0x641102ab -> :sswitch_9
        0x65682788 -> :sswitch_32
        0x665abd93 -> :sswitch_2a
        0x6b6cb340 -> :sswitch_18
        0x6d171c28 -> :sswitch_20
        0x6f3f9e06 -> :sswitch_45
        0x70958b87 -> :sswitch_1d
        0x71d191ba -> :sswitch_24
        0x721ed17f -> :sswitch_1
        0x7831e391 -> :sswitch_3e
        0x799309c0 -> :sswitch_40
        0x7aed11d8 -> :sswitch_36
        0x7b0178e7 -> :sswitch_10
        0x7fcec5de -> :sswitch_c
        0x7fef200c -> :sswitch_26
    .end sparse-switch
.end method

.method public final ۙ(Ll/ᩳ۬᩸;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x92d294

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v5, "\u05a8\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1cb

    const v7, -0x636c1fa7

    xor-int/2addr v6, v7

    const v7, 0x70f4a5ad

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x7891

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_3

    goto/16 :goto_4

    .line 5
    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v5

    if-lez v5, :cond_c

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v5, :cond_9

    goto/16 :goto_2

    .line 41
    :sswitch_2
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_5

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    goto/16 :goto_5

    .line 43
    :sswitch_4
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    return-void

    .line 44
    :sswitch_5
    invoke-virtual {v1}, Ll/۬ۡ᩸;->ܺ()V

    goto :goto_1

    .line 43
    :sswitch_6
    iget-object v1, v0, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    if-eqz v1, :cond_0

    const-string v5, "\u1a77\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3f9f

    const v7, 0x1db884bc

    xor-int/2addr v6, v7

    const v7, -0x75e356bd

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_8
    iget-object v0, p0, Ll/ܶ֨᩸;->ܰ:Ll/᩺ۜ᩸;

    invoke-static {v0}, Ll/֡ۖ;->ۜۤۘ(Ljava/lang/Object;)Ll/ᩳ۬᩸;

    move-result-object v5

    if-ne v5, p1, :cond_0

    const-string v5, "\u06d7\u06dc"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x8e1

    const v7, -0x7bd1fafd

    xor-int/2addr v6, v7

    const v7, 0x61f4acd6

    goto :goto_0

    :cond_0
    :goto_1
    const-string v5, "\u06e8\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3ddd

    const v7, 0x12d525fc

    xor-int/2addr v6, v7

    const v7, 0x756495e3

    goto/16 :goto_0

    .line 23
    :sswitch_9
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06db\u06e4"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6873

    const v7, -0x2b85527b

    xor-int/2addr v6, v7

    const v7, 0x759cc04f

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u1a73\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4ae9

    const v7, -0x61cca103

    xor-int/2addr v6, v7

    const v7, -0x1c51f955

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06e1\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6f07

    const v7, -0x25098961

    xor-int/2addr v6, v7

    const v7, -0x431d8071

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u06e7\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1949

    const v7, 0xc95679

    xor-int/2addr v6, v7

    const v7, 0xced913

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_6

    :cond_5
    :goto_2
    const-string v5, "\u0736\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5315

    const v7, -0x24d3d98c

    xor-int/2addr v6, v7

    const v7, -0x16993993

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06e1\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1089

    const v7, -0x617a7513

    xor-int/2addr v6, v7

    const v7, -0x191b1d83

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u06e1\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6eff

    const v7, -0x3f16c3df

    xor-int/2addr v6, v7

    const v7, -0x73f7a056

    goto/16 :goto_0

    .line 25
    :sswitch_e
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_8

    :goto_3
    const-string v5, "\u073a\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x22e9

    const v7, 0x653eb76b

    xor-int/2addr v6, v7

    const v7, -0x5573acae

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e8\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x38a3

    const v7, 0x1594fbf3

    xor-int/2addr v6, v7

    const v7, 0x73c92006

    goto/16 :goto_0

    .line 19
    :sswitch_f
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u06d9\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x59f9

    const v7, -0x55090627

    xor-int/2addr v6, v7

    const v7, -0xef8603b

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a79\u06dc"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3feb

    const v7, -0x2d449417

    xor-int/2addr v6, v7

    const v7, 0x2c11d36b

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_b

    :goto_5
    const-string v5, "\u06df\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x30f3

    const v7, -0x26c195c0

    xor-int/2addr v6, v7

    const v7, 0x50983921

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e0\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7f1f

    const v7, -0x9247a6f

    xor-int/2addr v6, v7

    const v7, -0x5ff00148

    goto/16 :goto_0

    .line 2
    :sswitch_11
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v5

    if-gtz v5, :cond_d

    :cond_c
    const-string v5, "\u06e4\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2e13

    const v7, 0x265b14ea

    xor-int/2addr v6, v7

    const v7, 0x29730f32

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a79\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x375f

    const v7, -0x137be19b

    xor-int/2addr v6, v7

    const v7, -0x54d92407

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cbf6ca5 -> :sswitch_c
        -0x7097eeb5 -> :sswitch_3
        -0x60e07dd7 -> :sswitch_f
        -0x5652744e -> :sswitch_b
        -0x54dbfb66 -> :sswitch_8
        -0x4c0bd771 -> :sswitch_10
        -0x45be049b -> :sswitch_10
        -0x44daf9d2 -> :sswitch_11
        -0x3fe45db5 -> :sswitch_4
        -0x3bbfa0fd -> :sswitch_e
        -0x3aa9d83a -> :sswitch_5
        -0x24cd976f -> :sswitch_9
        -0x2222e4da -> :sswitch_5
        -0x1cf62c89 -> :sswitch_9
        -0x179394b3 -> :sswitch_d
        -0x128eee68 -> :sswitch_1
        -0x11e6dce7 -> :sswitch_b
        -0xb04d601 -> :sswitch_8
        -0x71f65b8 -> :sswitch_7
        0x20ffaac -> :sswitch_a
        0x12f96ad3 -> :sswitch_2
        0x138da9a1 -> :sswitch_2
        0x19e1215a -> :sswitch_4
        0x24c30b65 -> :sswitch_7
        0x3072e2b1 -> :sswitch_6
        0x3f542b5e -> :sswitch_3
        0x4ae5de04 -> :sswitch_0
        0x4c729a67 -> :sswitch_f
        0x51ca128e -> :sswitch_1
        0x53c62ccc -> :sswitch_6
        0x5a3a888f -> :sswitch_c
        0x635b5d38 -> :sswitch_e
        0x64f91f58 -> :sswitch_11
        0x6ad0a8f1 -> :sswitch_a
        0x6c49894c -> :sswitch_d
        0x713f9736 -> :sswitch_0
    .end sparse-switch
.end method
