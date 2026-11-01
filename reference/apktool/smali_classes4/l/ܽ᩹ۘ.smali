.class public final Ll/ܽ᩹ۘ;
.super Ljava/lang/Object;
.source "GA31"


# static fields
.field public static ۙ:Ljava/util/List;

.field public static ۨ:Z

.field public static ܰ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5336fcf

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    const-string v5, "\u073f\u06db"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x20d5

    const v7, -0x2625f0a9

    xor-int/2addr v6, v7

    const v7, -0x66a37a00

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v1

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x7ef3

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 37
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v5

    if-gtz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u05a8\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x574f

    const v8, -0x45129e42

    xor-int/2addr v6, v8

    const v8, -0x44a4eb6b

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_b

    goto/16 :goto_4

    .line 19
    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v5, :cond_9

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 42
    :sswitch_4
    sget-object v5, Ll/ۙܳ᩺;->ܰ:Ljava/util/concurrent/ExecutorService;

    new-instance v6, Ll/᩺᩻֨;

    .line 30
    sget-boolean v8, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    const/4 v8, 0x1

    sget v9, Ll/֫;->ܶܺ᩻:I

    if-ltz v9, :cond_2

    goto/16 :goto_4

    .line 42
    :cond_2
    invoke-direct {v6, v8}, Ll/᩺᩻֨;-><init>(I)V

    invoke-static {v5, v6}, Ll/᩶;->֫ۚۛ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 23
    :sswitch_5
    new-instance v0, Ll/֡᩹ۘ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/ܿۚۘ;->ۙ(Ll/֨ۚۘ;)V

    return-void

    .line 22
    :sswitch_6
    invoke-virtual {v0, v7}, Ll/᩵᩺ۙ;->ۙ(Ll/ۤ᩺ۙ;)V

    .line 34
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v5

    if-gtz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u06e7\u06d8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x5d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x27d5

    const v8, 0x22ac6192    # 4.6724E-18f

    xor-int/2addr v6, v8

    const v8, 0x6e3a025b

    goto/16 :goto_6

    .line 22
    :sswitch_7
    sget-object v0, Ll/ۗۡ᩺;->ۖ:Ll/ۡ᩺ۙ;

    new-instance v7, Ll/ܺ᩹ۘ;

    .line 38
    sget v5, Ll/֨ۧ;->֫۠֡:I

    if-gtz v5, :cond_4

    goto :goto_3

    :cond_4
    sget-boolean v5, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v5, :cond_5

    goto :goto_2

    .line 34
    :cond_5
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_6

    :goto_2
    const-string v5, "\u06dc\u1a76"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x70bf

    const v7, 0x506d97d

    xor-int/2addr v6, v7

    const v7, -0x4d970ff0

    goto/16 :goto_0

    :cond_6
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v5

    if-gtz v5, :cond_7

    :goto_3
    const-string v5, "\u06e0\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x20b3

    const v7, 0x35829e04

    xor-int/2addr v6, v7

    const v7, -0x5f8b34d

    goto/16 :goto_0

    .line 39
    :cond_7
    sget v5, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v5, :cond_8

    goto :goto_4

    .line 30
    :cond_8
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_4
    const-string v5, "\u0730\u1a78"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7095

    const v7, 0x34b482b6

    xor-int/2addr v6, v7

    const v7, 0x78664911

    goto/16 :goto_0

    .line 22
    :cond_a
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 36
    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v5, :cond_c

    :cond_b
    const-string v5, "\u06d6\u06ec"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2585

    const v8, 0x454f08fb

    xor-int/2addr v6, v8

    const v8, -0x2719bd21

    goto :goto_6

    :cond_c
    const-string v5, "\u1a7a\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6769

    const v8, -0x13c0f7e6

    xor-int/2addr v6, v8

    const v8, -0x36b63fa8    # -826373.5f

    goto :goto_6

    .line 19
    :sswitch_8
    invoke-static {}, Ll/ۗ;->ۚ۠ܰ()Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v5, "\u06dc\u1a75"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x39b7

    const v8, 0x545a2405

    xor-int/2addr v6, v8

    const v8, 0x5457250e

    goto :goto_6

    :cond_d
    :goto_5
    const-string v5, "\u0736\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5395

    const v8, 0x55a82d3d

    xor-int/2addr v6, v8

    const v8, -0x104a11a6

    :goto_6
    xor-int/2addr v5, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e81f65b -> :sswitch_0
        -0x7bd49de5 -> :sswitch_8
        -0x4580c8dd -> :sswitch_2
        -0x4132475c -> :sswitch_8
        -0x27e15e30 -> :sswitch_2
        -0x188f6c7c -> :sswitch_3
        -0x159b599f -> :sswitch_5
        -0x3512d8a -> :sswitch_0
        0xefac92 -> :sswitch_5
        0x1b696440 -> :sswitch_1
        0x21dd05e2 -> :sswitch_7
        0x252ef9c9 -> :sswitch_6
        0x38b53450 -> :sswitch_7
        0x585cfe9f -> :sswitch_6
        0x5e8b1d6c -> :sswitch_3
        0x731a34e2 -> :sswitch_1
        0x74c9a1a0 -> :sswitch_4
        0x7e25c78e -> :sswitch_4
    .end sparse-switch
.end method

.method public static synthetic ۙ()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7b7bd1fc

    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v5, "\u06ec\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4537

    const v7, 0x20a144a2

    xor-int/2addr v6, v7

    const v7, 0x3a57ed8e

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x39e1

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 52
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    goto/16 :goto_1

    .line 45
    :sswitch_0
    sget v5, Ll/۟;->ۨᩴۛ:I

    if-gez v5, :cond_9

    goto/16 :goto_1

    :sswitch_1
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-eqz v5, :cond_b

    goto/16 :goto_2

    :sswitch_2
    sget v5, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v5, :cond_4

    goto/16 :goto_1

    .line 47
    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    .line 52
    :sswitch_4
    sput-boolean v0, Ll/ܽ᩹ۘ;->ۨ:Z

    return-void

    :sswitch_5
    sput-boolean v0, Ll/ܽ᩹ۘ;->ۨ:Z

    .line 53
    throw v1

    .line 52
    :sswitch_6
    sput-boolean v0, Ll/ܽ᩹ۘ;->ۨ:Z

    return-void

    .line 48
    :sswitch_7
    :try_start_0
    invoke-static {}, Ll/᩵֨ۘ;->ܰ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ܽ᩹ۘ;->ۙ(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "\u06d7\u06db"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x25eb

    const v7, -0x5a02914d

    xor-int/2addr v6, v7

    const v7, 0x7e43beee

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v5, "\u1a79\u06e1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x9d9

    const v7, 0x66aba578

    xor-int/2addr v6, v7

    const v7, -0x6088d709

    goto :goto_0

    :catch_0
    const-string v5, "\u1a76\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x38b9

    const v7, 0x4926bcbd

    xor-int/2addr v6, v7

    const v7, 0x30f5d4e4

    goto :goto_0

    :sswitch_8
    return-void

    :sswitch_9
    const/4 v0, 0x0

    const-string v5, "\u06e7\u1a74"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1039

    const v7, 0x73f471e1

    xor-int/2addr v6, v7

    const v7, 0x44c58454

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_0

    const-string v5, "\u0733\u06df"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x27d7

    const v7, 0x70193c10

    xor-int/2addr v6, v7

    const v7, 0x58b9071b

    goto/16 :goto_0

    :cond_0
    const-string v5, "\u06dc\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6fb3

    const v7, -0x1f0f749

    xor-int/2addr v6, v7

    const v7, -0x23fe100f

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u073a\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x233

    const v7, -0x45982717

    xor-int/2addr v6, v7

    const v7, 0x34768e4c

    goto/16 :goto_0

    .line 50
    :sswitch_c
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_2

    :goto_1
    const-string v5, "\u06eb\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4dcf

    const v7, 0x3f0c21af

    xor-int/2addr v6, v7

    const v7, 0x2bb44b92

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u073d\u06df"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7ef3

    const v7, -0x6d925373

    xor-int/2addr v6, v7

    const v7, 0x26fb841a

    goto/16 :goto_0

    .line 45
    :sswitch_d
    sget v5, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u06eb\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x56c3

    const v7, -0x2659cb84

    xor-int/2addr v6, v7

    const v7, -0x67dad630

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_5

    :cond_4
    :goto_2
    const-string v5, "\u1a78\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7d3b

    const v7, -0x19661652

    xor-int/2addr v6, v7

    const v7, 0x4ae92b22    # 7640465.0f

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u0736\u0736"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x853

    const v7, -0x8820650

    xor-int/2addr v6, v7

    const v7, -0x4cdfc282

    goto/16 :goto_0

    .line 48
    :sswitch_f
    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v5, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v5, "\u1a7a\u06e8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b47

    const v7, -0x2ac7e2db

    xor-int/2addr v6, v7

    const v7, 0x14056498

    goto/16 :goto_0

    .line 43
    :sswitch_10
    sget v5, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06e8\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5251

    const v7, -0x72a31a46

    xor-int/2addr v6, v7

    const v7, 0x42d51ed4

    goto/16 :goto_0

    .line 50
    :sswitch_11
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u1a7b\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x47

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x71a5

    const v7, 0x5d5c42a5

    xor-int/2addr v6, v7

    const v7, 0x25e33995

    goto/16 :goto_0

    :sswitch_12
    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_a

    :cond_9
    const-string v5, "\u06e2\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7d01

    const v7, -0x70a7bcfa

    xor-int/2addr v6, v7

    const v7, 0x168bf628

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e1\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3961

    const v7, 0x536f85d7

    xor-int/2addr v6, v7

    const v7, 0x64e15ead

    goto/16 :goto_0

    :sswitch_13
    const/4 v5, 0x1

    .line 46
    sput-boolean v5, Ll/ܽ᩹ۘ;->ۨ:Z

    .line 51
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u1a73\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x71fb

    const v7, 0x1ab77b9

    xor-int/2addr v6, v7

    const v7, -0x7e7b7719

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06da\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x642b

    const v7, 0xf55943

    xor-int/2addr v6, v7

    const v7, -0x5df68890

    goto/16 :goto_0

    .line 43
    :sswitch_14
    sget-boolean v5, Ll/ܽ᩹ۘ;->ۨ:Z

    if-eqz v5, :cond_d

    const-string v5, "\u06df\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x609d

    const v7, -0x61df0779

    xor-int/2addr v6, v7

    const v7, -0xc6857b1

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a74\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x67c7

    const v7, -0x63f62616

    xor-int/2addr v6, v7

    const v7, 0x396295d3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78f00522 -> :sswitch_a
        -0x78068911 -> :sswitch_b
        -0x726584b7 -> :sswitch_10
        -0x71dbdd78 -> :sswitch_d
        -0x71709767 -> :sswitch_1
        -0x6e0b7012 -> :sswitch_6
        -0x6dbca6b1 -> :sswitch_9
        -0x5c75c2c5 -> :sswitch_0
        -0x3c9a3809 -> :sswitch_1
        -0x3a68f95b -> :sswitch_b
        -0x332d819e -> :sswitch_10
        -0x31680109 -> :sswitch_2
        -0x3161cecc -> :sswitch_4
        -0x2f5555b9 -> :sswitch_3
        -0x2b765bbb -> :sswitch_7
        -0x2a0846cf -> :sswitch_5
        -0x1e67611c -> :sswitch_a
        -0x1dcbc009 -> :sswitch_12
        -0x1370ba0b -> :sswitch_13
        -0x10462577 -> :sswitch_14
        -0x6440b60 -> :sswitch_0
        0x21acee5 -> :sswitch_11
        0x30bb98d -> :sswitch_12
        0x514c7ad -> :sswitch_11
        0x9856aac -> :sswitch_8
        0xb0c7dfb -> :sswitch_14
        0x18bfb36b -> :sswitch_f
        0x27e0956c -> :sswitch_2
        0x28cd94af -> :sswitch_6
        0x2d082376 -> :sswitch_4
        0x2e5976a8 -> :sswitch_13
        0x329a4eb1 -> :sswitch_c
        0x3731ba7b -> :sswitch_3
        0x3caeb7b3 -> :sswitch_9
        0x3e7606c8 -> :sswitch_5
        0x40e17fd5 -> :sswitch_d
        0x52955280 -> :sswitch_8
        0x613e6a4d -> :sswitch_e
        0x7479e956 -> :sswitch_c
        0x74b0c341 -> :sswitch_e
        0x7ab98452 -> :sswitch_7
        0x7d0863a9 -> :sswitch_f
    .end sparse-switch
.end method

.method public static declared-synchronized ۙ(Ljava/util/List;)V
    .locals 2

    .line 2
    const-class v0, Ll/ܽ᩹ۘ;

    .line 3
    monitor-enter v0

    .line 58
    :try_start_0
    sput-object p0, Ll/ܽ᩹ۘ;->ۙ:Ljava/util/List;

    .line 59
    invoke-static {p0}, Ll/֡᩶;->ۗᩴۛ(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    .line 60
    sget-boolean v1, Ll/ܽ᩹ۘ;->ܰ:Z

    if-eq v1, p0, :cond_0

    .line 61
    sput-boolean p0, Ll/ܽ᩹ۘ;->ܰ:Z

    .line 62
    new-instance p0, Ll/ܶ᩻֨;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Ll/ܶ᩻֨;-><init>(I)V

    invoke-static {p0}, Ll/֨ۢ;->᩵᩵ܳ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܰ()Z
    .locals 1

    .line 88
    sget-boolean v0, Ll/ܽ᩹ۘ;->ܰ:Z

    return v0
.end method
