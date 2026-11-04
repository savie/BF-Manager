.class public final synthetic Ll/ۡۛܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Lbin/mt/plus/Main;

.field public final synthetic ۟:Ll/ۖۗܳ;

.field public final synthetic ܰ:Ljava/util/List;

.field public final synthetic ܿ:Ll/۠ۨܳ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILl/۠ۨܳ;Lbin/mt/plus/Main;Ll/ۖۗܳ;)V
    .locals 6

    const v0, -0x159d328f

    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    sget v2, Ll/᩶;->ᩴ᩶ۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06df\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b0f

    const v5, 0x41160fbc

    xor-int/2addr v4, v5

    const v5, -0x1c3bb3b1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x672b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p4, p0, Ll/ۡۛܳ;->֡:Lbin/mt/plus/Main;

    iput-object p5, p0, Ll/ۡۛܳ;->۟:Ll/ۖۗܳ;

    return-void

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_9

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-nez v3, :cond_4

    goto :goto_1

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    :goto_1
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c5d

    const v5, -0x25e94d50

    xor-int/2addr v4, v5

    const v5, 0x2071c93f

    goto :goto_0

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۡۛܳ;->ܿ:Ll/۠ۨܳ;

    .line 2
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_0

    goto :goto_2

    :cond_0
    const-string v3, "\u05a8\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4d55

    const v5, -0x2126d7d7

    xor-int/2addr v4, v5

    const v5, -0x51ba99cb

    goto :goto_0

    .line 0
    :sswitch_6
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_1

    goto :goto_3

    :cond_1
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e43

    const v5, 0x1fd682df

    xor-int/2addr v4, v5

    const v5, 0x86acd9e

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u06ec\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d5

    const v5, 0xed2b8db

    xor-int/2addr v4, v5

    const v5, 0x6adfdd7

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_3

    :goto_2
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xe45

    const v5, -0x5e657bce

    xor-int/2addr v4, v5

    const v5, 0x204727f1

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x32ff

    const v5, -0x301de469

    xor-int/2addr v4, v5

    const v5, 0x5fbcd348

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_3
    const-string v3, "\u0736\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7557

    const v5, -0x2941efc6

    xor-int/2addr v4, v5

    const v5, -0x5c18080d

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06dc\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x23c1

    const v5, 0xaba12d4

    xor-int/2addr v4, v5

    const v5, 0x4e832488

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u0733\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x54af

    const v5, -0xc42fc6b

    xor-int/2addr v4, v5

    const v5, 0x465b1423

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x668f

    const v5, -0x3b7d5632

    xor-int/2addr v4, v5

    const v5, 0x44bc0ba

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06e8\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6aed

    const v5, 0x37eb0c39

    xor-int/2addr v4, v5

    const v5, -0x6dcd08cd

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4bc1

    const v5, -0x5d529644

    xor-int/2addr v4, v5

    const v5, -0x9826a9f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1f67

    const v5, -0x3eb96c7a

    xor-int/2addr v4, v5

    const v5, 0x1497930d

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۡۛܳ;->ܰ:Ljava/util/List;

    iput p2, p0, Ll/ۡۛܳ;->᩶:I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    const-string v3, "\u06e0\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3cc9

    const v5, -0x1b676260

    xor-int/2addr v4, v5

    const v5, 0x4c5d3a83    # 5.799374E7f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6f05

    const v5, 0x5eef99c4

    xor-int/2addr v4, v5

    const v5, -0x33ae6d18    # -5.493853E7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dd1e32b -> :sswitch_6
        -0x7d6ceac6 -> :sswitch_0
        -0x7b1e58ae -> :sswitch_4
        -0x76d42641 -> :sswitch_3
        -0x6a8a2a8c -> :sswitch_5
        -0x66ab1ce7 -> :sswitch_a
        -0x660c96e3 -> :sswitch_c
        -0x65953ee9 -> :sswitch_9
        -0x644d36e1 -> :sswitch_6
        -0x59bc2c3f -> :sswitch_0
        -0x55d86319 -> :sswitch_8
        -0x4ec83115 -> :sswitch_b
        -0x4a95cde4 -> :sswitch_7
        -0x42c734ef -> :sswitch_a
        -0x423e3594 -> :sswitch_e
        -0x3a2699a5 -> :sswitch_9
        -0x2ebdef29 -> :sswitch_1
        -0x2c63c5cc -> :sswitch_8
        -0x291b3f82 -> :sswitch_c
        -0x25b49176 -> :sswitch_e
        -0x234d9919 -> :sswitch_2
        -0x123fd1a2 -> :sswitch_2
        -0xc38a11e -> :sswitch_3
        0x34a36090 -> :sswitch_1
        0x514eb15d -> :sswitch_d
        0x527dafd3 -> :sswitch_b
        0x5d5317aa -> :sswitch_4
        0x685b18a6 -> :sswitch_5
        0x75bc4f69 -> :sswitch_d
        0x75bf7556 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0xb7ddddb

    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    sget v5, Ll/֡ۢ;->۟֡᩻:I

    const-string v6, "\u06ec\u0733"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1585

    const v8, 0x21759c9

    xor-int/2addr v7, v8

    const v8, -0x4a1f2aab

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x12f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget v6, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v6, :cond_5

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_7

    goto/16 :goto_2

    .line 1
    :sswitch_1
    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_a

    goto/16 :goto_2

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto :goto_1

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    return-void

    :sswitch_4
    iget v3, p0, Ll/ۡۛܳ;->᩶:I

    iget-object v4, p0, Ll/ۡۛܳ;->ܿ:Ll/۠ۨܳ;

    invoke-static {v2, v3, v4, v0, v1}, Ll/֫ۘܳ;->ۙ(Ljava/util/List;ILl/۠ۨܳ;Lbin/mt/plus/Main;Ll/ۖۗܳ;)V

    return-void

    :sswitch_5
    iget-object v2, p0, Ll/ۡۛܳ;->ܰ:Ljava/util/List;

    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u1a73\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7c5f

    const v8, 0x1d4f4332

    xor-int/2addr v7, v8

    const v8, -0x15e2caa8

    goto :goto_0

    :sswitch_6
    iget-object v1, p0, Ll/ۡۛܳ;->۟:Ll/ۖۗܳ;

    .line 1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "\u06da\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4c8f

    const v8, -0x2717c99f

    xor-int/2addr v7, v8

    const v8, 0x481e9464

    goto :goto_0

    :sswitch_7
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_2

    :goto_1
    const-string v6, "\u0730\u06d9"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1a39

    const v8, -0x43e35a8

    xor-int/2addr v7, v8

    const v8, -0x531fa5e7

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u073d\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x73

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7b03

    const v8, -0xd9214bd

    xor-int/2addr v7, v8

    const v8, 0xd0ff1e

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    const-string v6, "\u0733\u1a78"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5bf9

    const v8, 0x15fba429

    xor-int/2addr v7, v8

    const v8, 0x79bd2d77

    goto/16 :goto_0

    :sswitch_9
    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u1a74\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7c55

    const v8, 0x18427277

    xor-int/2addr v7, v8

    const v8, -0x151c5a8e

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget-boolean v6, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v6, :cond_6

    :cond_5
    :goto_2
    const-string v6, "\u073a\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x8f

    const v8, -0xd626ef6

    xor-int/2addr v7, v8

    const v8, -0x3919d202

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u05a1\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5c45

    const v8, 0x60f6f56c

    xor-int/2addr v7, v8

    const v8, -0x1a623bcb

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v6

    if-eqz v6, :cond_8

    :cond_7
    :goto_3
    const-string v6, "\u1a75\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x57

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x35e3

    const v8, -0x38617232

    xor-int/2addr v7, v8

    const v8, -0x2868bf19

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a74\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x17

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x375d

    const v8, -0x6ebb6557

    xor-int/2addr v7, v8

    const v8, -0x1585b276

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v6, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "\u073f\u1a7b"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x71

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x77f1

    const v8, -0x7a809627

    xor-int/2addr v7, v8

    const v8, 0x226bd957

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v6, Ll/۬;->᩸ۜ᩹:I

    if-eqz v6, :cond_b

    :cond_a
    :goto_4
    const-string v6, "\u06e1\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1919

    const v8, -0x13ca7c68

    xor-int/2addr v7, v8

    const v8, 0xe21aa1b

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06d6\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2805

    const v8, -0x4b7dd894

    xor-int/2addr v7, v8

    const v8, 0x4f5e9914    # 3.734574E9f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ۡۛܳ;->֡:Lbin/mt/plus/Main;

    sget-boolean v6, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v6, :cond_c

    :goto_5
    const-string v6, "\u06d7\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3937

    const v8, -0x419d8a74

    xor-int/2addr v7, v8

    const v8, 0x72d1b74f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u0736\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3e47

    const v8, 0xc2f7ac3

    xor-int/2addr v7, v8

    const v8, 0x339d791

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa009a3 -> :sswitch_e
        -0x7e2ab963 -> :sswitch_c
        -0x7d1f5478 -> :sswitch_8
        -0x791efb3a -> :sswitch_b
        -0x6d631e65 -> :sswitch_7
        -0x6b4e3959 -> :sswitch_1
        -0x4db079a2 -> :sswitch_8
        -0x4b8eefd7 -> :sswitch_4
        -0x4b1048c0 -> :sswitch_1
        -0x3008a589 -> :sswitch_2
        -0x2fdd70ab -> :sswitch_9
        -0x2afe4088 -> :sswitch_5
        -0x2850e498 -> :sswitch_3
        -0x205e0eb1 -> :sswitch_4
        -0xce92068 -> :sswitch_0
        -0xca88d7d -> :sswitch_c
        -0xca6d64f -> :sswitch_2
        -0x344623c -> :sswitch_5
        0x1274e685 -> :sswitch_d
        0x23c23361 -> :sswitch_7
        0x31ff7a73 -> :sswitch_3
        0x34520ca2 -> :sswitch_d
        0x398fd4c4 -> :sswitch_a
        0x476ea700 -> :sswitch_0
        0x4cce21e3 -> :sswitch_e
        0x52315baa -> :sswitch_a
        0x64041dc0 -> :sswitch_6
        0x65e89061 -> :sswitch_b
        0x69a28028 -> :sswitch_9
        0x6bf2ef06 -> :sswitch_6
    .end sparse-switch
.end method
