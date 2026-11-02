.class public final synthetic Ll/᩸᩺ۘ;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩸֫᩹:[S


# instance fields
.field public final synthetic ܺ:Ll/֡᩺ۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸᩺ۘ;->᩸֫᩹:[S

    return-void

    :array_0
    .array-data 2
        0xfa0s
        0x76ces
        0x76cds
        0x76cds
        0x769es
        0x76ccs
        0x7698s
        0x76c8s
        0x76cas
        0x769es
        0x76cbs
        0x769ds
        0x76ces
        0x76ces
        0x769as
        0x7699s
        0x769fs
        0x76ccs
        0x76ces
        0x76cbs
        0x76cbs
        0x76cbs
        0x769ds
        0x76cds
        0x76cbs
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/֡᩺ۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩺ۘ;->ܺ:Ll/֡᩺ۘ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    const/4 v1, 0x0

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

    const v12, -0x28e1d16d

    sget v13, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v14, Ll/۟;->ۨᩴۛ:I

    const-string v15, "\u06e4\u06d6"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x47ef

    const v17, 0x76c0724e

    xor-int v0, v0, v17

    const v17, 0x1723e895

    xor-int v15, v15, v17

    move-object v2, v1

    move-object v10, v9

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, -0x28e1d16d

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x2935

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    mul-int v5, v4, v4

    const v6, 0xaaef69

    sget v0, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v0, :cond_b

    goto/16 :goto_9

    .line 146
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    sget v0, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v0, :cond_1

    move/from16 v16, v15

    :cond_0
    :goto_1
    move-object/from16 v15, p0

    goto/16 :goto_6

    :cond_1
    const-string v0, "\u073a\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move/from16 v16, v15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x338f

    const v17, 0x32084e6d

    xor-int v15, v15, v17

    const v17, 0x6161d1c7

    goto/16 :goto_5

    :sswitch_1
    move/from16 v16, v15

    .line 237
    sget-boolean v0, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v0, :cond_0

    :cond_2
    :goto_2
    move-object/from16 v15, p0

    move-object/from16 v17, v1

    goto/16 :goto_a

    :sswitch_2
    move/from16 v16, v15

    .line 11
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v0

    if-ltz v0, :cond_2

    :goto_3
    move-object/from16 v15, p0

    move-object/from16 v17, v1

    goto/16 :goto_8

    :sswitch_3
    move/from16 v16, v15

    .line 1
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    goto :goto_3

    .line 157
    :sswitch_4
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    :sswitch_5
    move/from16 v16, v15

    .line 23
    invoke-static {v10, v11, v12, v9}, Ll/֫;->ۗܿܶ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x0

    .line 26
    invoke-static {v1, v0, v15}, Lcom/umeng/commonsdk/UMConfigure;->preInit(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :sswitch_6
    move/from16 v16, v15

    const/16 v12, 0x18

    .line 238
    sget v0, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u073f\u1a73"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x61

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x4799

    const v17, 0x159ecaf1

    xor-int v15, v15, v17

    const v17, -0x35d45366

    goto/16 :goto_5

    :sswitch_7
    move/from16 v16, v15

    .line 23
    sget-object v10, Ll/᩸᩺ۘ;->᩸֫᩹:[S

    const/4 v11, 0x1

    .line 143
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v0

    if-ltz v0, :cond_4

    goto :goto_1

    :cond_4
    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0xba5

    const v17, -0x165ab706

    xor-int v15, v15, v17

    const v17, 0x1b9c455a

    goto :goto_5

    :sswitch_8
    return-void

    :sswitch_9
    move/from16 v16, v15

    .line 254
    sget v0, Ll/۬ܳ᩺;->ۙ:I

    .line 23
    invoke-static {}, Ll/ܶۧ᩺;->ۙ()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "\u06e7\u1a78"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4b

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x238b

    const v17, 0x41bd5c26    # 23.669994f

    xor-int v15, v15, v17

    const v17, 0x2698c9d8

    goto :goto_5

    :cond_5
    :goto_4
    const-string v0, "\u1a77\u06e0"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x55

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x56e9

    const v17, 0x280ec5c8

    xor-int v15, v15, v17

    const v17, 0x501fc817

    goto :goto_5

    :sswitch_a
    move/from16 v16, v15

    .line 7
    invoke-static {v1}, Ll/ۗᩳ;->֨ۢܺ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 179
    sget-boolean v0, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v0, :cond_6

    goto/16 :goto_1

    :cond_6
    const-string v0, "\u073f\u1a78"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x63

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x867

    const v17, 0x16f68afb

    xor-int v15, v15, v17

    const v17, 0x761c0ffb

    :goto_5
    xor-int v0, v0, v17

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_b
    move/from16 v16, v15

    .line 2
    sget-object v0, Ll/֡᩺ۘ;->֡:Landroid/content/SharedPreferences;

    move-object/from16 v15, p0

    .line 4
    iget-object v1, v15, Ll/᩸᩺ۘ;->ܺ:Ll/֡᩺ۘ;

    .line 235
    sget v0, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v0, :cond_7

    :goto_6
    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x1d

    move-object/from16 v17, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x3f15

    const v18, 0x2a2cab59

    xor-int v1, v1, v18

    const v18, -0x1ca5f611

    goto/16 :goto_b

    :cond_7
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move-object/from16 v17, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x14d1

    const v18, 0x4481afc

    xor-int v1, v1, v18

    const v18, 0x4c89983d    # 7.213924E7f

    goto/16 :goto_b

    :sswitch_c
    move/from16 v16, v15

    move-object/from16 v15, p0

    const/16 v0, 0xc57

    const/16 v9, 0xc57

    goto :goto_7

    :sswitch_d
    move/from16 v16, v15

    move-object/from16 v15, p0

    const/16 v0, 0x76fb

    const/16 v9, 0x76fb

    :goto_7
    const-string v0, "\u06d8\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move-object/from16 v17, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x25cd

    const v18, -0x1f14b032

    xor-int v1, v1, v18

    const v18, -0x705b55fe

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    add-int v0, v4, v8

    mul-int v0, v0, v0

    sub-int v0, v7, v0

    if-ltz v0, :cond_8

    const-string v0, "\u06db\u06d7"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x7d11

    const v18, -0x55566633

    xor-int v1, v1, v18

    const v18, -0x55ae92e9

    goto/16 :goto_b

    :cond_8
    const-string v0, "\u06dc\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x39a9

    const v18, 0x2ae83b9b

    xor-int v1, v1, v18

    const v18, -0x2059b225

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    const/16 v8, 0xd13

    .line 182
    sget-boolean v0, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v0, :cond_9

    :goto_8
    const-string v0, "\u06e1\u05ab"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x4405

    const v18, 0x6afe6e25

    xor-int v1, v1, v18

    const v18, -0x7f0961b1

    goto/16 :goto_b

    :cond_9
    const-string v0, "\u06d9\u05a8"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x722b

    const v18, -0x504793f4

    xor-int v1, v1, v18

    const v18, 0xa8f11b0

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    add-int v0, v5, v6

    add-int v7, v0, v0

    sget v0, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v0, :cond_a

    goto :goto_9

    :cond_a
    const-string v0, "\u1a75\u06d6"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x393f

    const v18, -0x1bf62260

    xor-int v1, v1, v18

    const v18, 0x4eac8d36

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u06e1\u073a"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x6f

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x66bd

    const v18, -0x16ef3754

    xor-int v1, v1, v18

    const v18, -0x69ee8536

    goto/16 :goto_b

    :sswitch_11
    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    aget-short v4, v2, v3

    .line 32
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_9
    const-string v0, "\u05ab\u06e0"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x38bd

    const v18, -0x42929cf0

    xor-int v1, v1, v18

    const v18, -0x35021d02    # -8319359.0f

    goto/16 :goto_b

    :cond_c
    const-string v0, "\u1a7a\u1a77"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x51

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x3c6b

    const v18, 0x42eea3c7

    xor-int v1, v1, v18

    const v18, 0x17c003e8

    goto :goto_b

    :sswitch_12
    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    const/4 v3, 0x0

    .line 230
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_a

    :cond_d
    const-string v0, "\u073d\u0736"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x45

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x2047

    const v18, -0x12bcb5ab

    xor-int v1, v1, v18

    const v18, -0x53db3afa

    goto :goto_b

    :sswitch_13
    move-object/from16 v17, v1

    move/from16 v16, v15

    move-object/from16 v15, p0

    sget-object v2, Ll/᩸᩺ۘ;->᩸֫᩹:[S

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v0

    if-gtz v0, :cond_e

    :goto_a
    const-string v0, "\u06df\u06d6"

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x4619

    const v18, -0x407d038f

    xor-int v1, v1, v18

    const v18, -0x3cc99353

    goto :goto_b

    :cond_e
    const-string v0, "\u06df\u06eb"

    invoke-static {v0}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x3b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2329

    const v18, -0x48b04be4

    xor-int v1, v1, v18

    const v18, 0x4254dc02

    :goto_b
    xor-int v0, v0, v18

    move/from16 v15, v16

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v17

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f3b9e3b -> :sswitch_f
        -0x7a62f209 -> :sswitch_5
        -0x7a0da8c1 -> :sswitch_5
        -0x647d3fc1 -> :sswitch_8
        -0x62609975 -> :sswitch_1
        -0x5a5c5182 -> :sswitch_a
        -0x55c1c041 -> :sswitch_4
        -0x54885dae -> :sswitch_12
        -0x5406fc46 -> :sswitch_13
        -0x3f146290 -> :sswitch_e
        -0x3d56b007 -> :sswitch_10
        -0x39629b98 -> :sswitch_e
        -0x296a315f -> :sswitch_4
        -0x216da4e2 -> :sswitch_11
        -0x1e014b1c -> :sswitch_9
        -0x1c66f507 -> :sswitch_10
        -0x15b2fd71 -> :sswitch_11
        -0x3cdc3b1 -> :sswitch_d
        -0x2cb805 -> :sswitch_8
        0x990144 -> :sswitch_0
        0x15c2c38e -> :sswitch_c
        0x18cc3c33 -> :sswitch_f
        0x1ae95d61 -> :sswitch_a
        0x2a64a40d -> :sswitch_2
        0x2c985ab8 -> :sswitch_3
        0x2fb36b4f -> :sswitch_9
        0x3702bd1f -> :sswitch_1
        0x4140bee3 -> :sswitch_13
        0x45c025d3 -> :sswitch_b
        0x4dff15ab -> :sswitch_6
        0x5042e592 -> :sswitch_c
        0x505c1e8c -> :sswitch_b
        0x56072b7b -> :sswitch_2
        0x5b2b7e55 -> :sswitch_3
        0x60c13c9b -> :sswitch_d
        0x6d33ac38 -> :sswitch_7
        0x6d6ec312 -> :sswitch_0
        0x7797632a -> :sswitch_7
        0x799d0f47 -> :sswitch_6
        0x7d604219 -> :sswitch_12
    .end sparse-switch
.end method
