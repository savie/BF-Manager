.class public final Ll/ۜ᩹ۘ;
.super Ll/ܿ۫ۚ;
.source "O3YD"


# instance fields
.field public final synthetic ۗ:Ll/᩺᩹ۘ;

.field public final synthetic ۙۙ:Ll/֫֨ۘ;

.field public final synthetic ۨۙ:Ljava/lang/String;

.field public final synthetic ܰۙ:Ll/ۖۜۘ;


# direct methods
.method public constructor <init>(Ll/᩺᩹ۘ;Ll/۫ܶۘ;Ll/֫֨ۘ;Ljava/lang/String;Ll/ۖۜۘ;)V
    .locals 3

    const v0, 0x682255f0

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/֡ۚ;->ۢܰ᩸:I

    .line 374
    iput-object p1, p0, Ll/ۜ᩹ۘ;->ۗ:Ll/᩺᩹ۘ;

    iput-object p3, p0, Ll/ۜ᩹ۘ;->ۙۙ:Ll/֫֨ۘ;

    iput-object p4, p0, Ll/ۜ᩹ۘ;->ۨۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۜ᩹ۘ;->ܰۙ:Ll/ۖۜۘ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/ܿ۫ۚ;-><init>(Ll/۫ܶۘ;I)V

    const-string p1, "\u073a\u05ab"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6529

    const p3, 0x2df76de2

    xor-int/2addr p2, p3

    const p3, -0x4722064f

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x63a5

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 39
    sget p1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz p1, :cond_3

    const-string p1, "\u06e1\u1a74"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3715

    const p3, -0x468c8ef1

    xor-int/2addr p2, p3

    const p3, 0x625e4164

    goto :goto_0

    .line 363
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0730\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x6b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x55c1

    const p3, 0x8a7c2ed

    xor-int/2addr p2, p3

    const p3, -0x2a5eebd6

    goto :goto_0

    .line 57
    :sswitch_1
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u06e2\u06e7"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x1d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4243

    const p3, 0x6e91eba2

    xor-int/2addr p2, p3

    const p3, 0x5ff98369

    goto :goto_0

    .line 65
    :sswitch_2
    sget p1, Ll/۟;->ۨᩴۛ:I

    if-gez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e8\u1a73"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x4f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4575

    const p3, 0x921ed86

    xor-int/2addr p2, p3

    const p3, 0x73c7300e

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    :goto_2
    const-string p1, "\u06e8\u073a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x15

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x29b7

    const p3, -0x51a16bde

    xor-int/2addr p2, p3

    const p3, 0x19dcb627

    goto/16 :goto_0

    .line 166
    :sswitch_4
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u06e2\u05a1"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x17

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x5e9f

    const p3, -0x210b5742

    xor-int/2addr p2, p3

    const p3, 0x12332d8b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ea8c3c2 -> :sswitch_2
        -0x55853c2b -> :sswitch_5
        -0x505ffd5d -> :sswitch_1
        -0x49231f36 -> :sswitch_5
        -0x19d09d5e -> :sswitch_3
        -0x91cd6a8 -> :sswitch_1
        0xe62088e -> :sswitch_4
        0x2f262f03 -> :sswitch_2
        0x3b513288 -> :sswitch_4
        0x3dbe92c8 -> :sswitch_0
        0x4e07f351 -> :sswitch_3
        0x6f915ad2 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ᩴ()V
    .locals 20

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

    const v14, -0x77560a5b

    sget v15, Ll/ۗܺ;->ۨ᩺۠:I

    sget v16, Ll/֫۟;->᩸ᩴܿ:I

    const-string v17, "\u06ec\u06da"

    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x45e3

    const v19, -0x732abdc3

    xor-int v1, v1, v19

    const v19, 0x1b71ac9e    # 1.9990828E-22f

    xor-int v17, v17, v19

    move-object/from16 v19, v6

    move-object v14, v13

    move/from16 v18, v17

    const v17, -0x77560a5b

    move-object v6, v5

    move-object v13, v12

    move-object v5, v4

    move-object v12, v11

    move-object v4, v3

    move-object v11, v10

    move-object v3, v2

    move-object v10, v9

    const/4 v2, 0x0

    move-object v9, v8

    move-object v8, v7

    :goto_0
    xor-int v7, v17, v15

    mul-int/lit16 v7, v7, -0x4645

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v1, v7

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    .line 206
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v1

    if-nez v1, :cond_2

    :goto_1
    move-object/from16 v18, v19

    goto/16 :goto_b

    :sswitch_0
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v1, :cond_5

    :cond_0
    :goto_2
    move-object/from16 v18, v19

    goto/16 :goto_a

    .line 122
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v1, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v18, v19

    goto/16 :goto_c

    .line 373
    :sswitch_2
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_3

    :cond_2
    move-object/from16 v18, v19

    goto/16 :goto_d

    :cond_3
    const-string v1, "\u1a73\u06e2"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x5b59

    const v18, 0x6a1592ac

    xor-int v7, v7, v18

    const v18, 0x123b128d

    goto/16 :goto_9

    :sswitch_3
    sget v1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v1, :cond_0

    goto :goto_1

    .line 301
    :sswitch_4
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "\u06e1\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x38d9

    const v18, 0x547e37dd

    xor-int v7, v7, v18

    const v18, -0x5f075e97

    goto/16 :goto_9

    .line 90
    :sswitch_5
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto :goto_1

    :sswitch_6
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    .line 183
    :sswitch_7
    invoke-static {v9, v8}, Ll/ۗ;->֡ۚۢ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    move-object v14, v1

    goto/16 :goto_5

    :sswitch_8
    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v8}, Ll/֡ۛ;->ۖۘ۟(ILjava/lang/Object;)C

    move-result v1

    const/16 v7, 0x7d

    if-ne v1, v7, :cond_a

    const-string v1, "\u05ab\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x321b

    const v18, -0x41109e29

    xor-int v7, v7, v18

    const v18, 0x622eaed1

    goto/16 :goto_9

    :sswitch_9
    const/4 v1, 0x0

    .line 182
    invoke-static {v8, v1}, Ll/ۗ;->᩶᩺ܶ(Ljava/lang/Object;I)C

    move-result v1

    const/16 v7, 0x7b

    if-ne v1, v7, :cond_a

    const-string v1, "\u1a75\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x4b9b

    const v18, -0x5166c41b

    xor-int v7, v7, v18

    const v18, 0x70f6d688

    goto/16 :goto_9

    .line 383
    :sswitch_a
    invoke-virtual {v0, v14}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 389
    :sswitch_b
    iget-object v1, v6, Ll/ۗ֨ۘ;->ۚ:Ljava/lang/CharSequence;

    invoke-static {v3, v1}, Ll/ۗ۬;->ۚܶۜ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    .line 391
    :sswitch_c
    invoke-static {v3, v5}, Ll/֫֡;->᩵ܿۛ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    move-object/from16 v18, v19

    goto/16 :goto_7

    .line 396
    :sswitch_d
    iget-object v1, v2, Ll/᩺᩹ۘ;->ܺ:Ll/ۗ֨ۘ;

    invoke-static {v2, v13, v1, v5}, Ll/᩺᩹ۘ;->ۙ(Ll/᩺᩹ۘ;Ll/ۖۜۘ;Ll/ۗ֨ۘ;Ljava/lang/String;)V

    goto/16 :goto_6

    .line 394
    :sswitch_e
    invoke-interface {v12}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 396
    iget-object v13, v0, Ll/ۜ᩹ۘ;->ܰۙ:Ll/ۖۜۘ;

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_6

    :cond_5
    const-string v1, "\u06e0\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x47e5

    const v18, 0x17f3838c

    xor-int v7, v7, v18

    const v18, -0x1d19be8

    goto/16 :goto_9

    :cond_6
    const-string v1, "\u06d7\u06dc"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x73b1

    const v18, 0x4dc75b79    # 4.180826E8f

    xor-int v7, v7, v18

    const v18, -0x5ce1e6d5

    goto/16 :goto_9

    .line 394
    :sswitch_f
    invoke-interface {v10, v11, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v12

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_7

    goto :goto_4

    :cond_7
    const-string v1, "\u1a73\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x4b

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x1acb

    const v18, 0x5d858411

    xor-int v7, v7, v18

    const v18, -0x6cd5fc1f

    goto/16 :goto_9

    :sswitch_10
    iget-object v11, v6, Ll/ۗ֨ۘ;->ۨ:Ljava/lang/String;

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v1, :cond_8

    :goto_4
    const-string v1, "\u1a76\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0xa65

    const v18, -0x46e88bc8

    xor-int v7, v7, v18

    const v18, -0x7ca833bb

    goto/16 :goto_9

    :cond_8
    const-string v1, "\u073a\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x446d

    const v18, 0x6110ae6f

    xor-int v7, v7, v18

    const v18, 0x6c96e0d3

    goto/16 :goto_9

    :sswitch_11
    invoke-static {v4}, Ll/ᩴ᩹ۘ;->ۖ(Ll/ᩴ᩹ۘ;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    .line 120
    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_9

    goto/16 :goto_1

    :cond_9
    const-string v1, "\u06ec\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x4d71

    const v18, -0x4140aef0

    xor-int v7, v7, v18

    const v18, -0x78be3259

    goto/16 :goto_9

    .line 398
    :sswitch_12
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۫ۚ;->ܰ()V

    return-void

    .line 382
    :sswitch_13
    invoke-static {v4}, Ll/ᩴ᩹ۘ;->ۨ(Ll/ᩴ᩹ۘ;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    .line 182
    invoke-static {v8}, Ll/ۗ;->ۘ᩻ۘ(Ljava/lang/Object;)I

    move-result v1

    const/4 v7, 0x3

    if-lt v1, v7, :cond_a

    const-string v1, "\u05a1\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x68f1

    const v18, -0x3800525d

    xor-int v7, v7, v18

    const v18, -0x5ac13b80

    goto/16 :goto_9

    :cond_a
    move-object v14, v8

    :goto_5
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x7a63

    const v18, 0x13cd1ef5

    xor-int v7, v7, v18

    const v18, -0x42c56e68

    goto/16 :goto_9

    .line 388
    :sswitch_14
    invoke-static {v5}, Ll/ۘۗ;->۬۫ܿ(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "\u073f\u1a77"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x3b

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x4fe5

    const v18, 0x602b79ca

    xor-int v7, v7, v18

    const v18, -0x1e1bb603

    goto/16 :goto_9

    :cond_b
    const-string v1, "\u06e8\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x31

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x3bbb

    const v18, 0x1443afc

    xor-int v7, v7, v18

    const v18, -0x1efac1df

    goto/16 :goto_9

    .line 393
    :sswitch_15
    iget-object v1, v0, Ll/ۜ᩹ۘ;->ۨۙ:Ljava/lang/String;

    invoke-static {v5, v1}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "\u1a73\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x7fd7

    const v18, -0x2236bde8

    xor-int v7, v7, v18

    const v18, 0x3bfc31ea

    goto/16 :goto_9

    :cond_c
    :goto_6
    const-string v1, "\u06e0\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x55ed

    const v18, 0x2d933796

    xor-int v7, v7, v18

    const v18, -0x4b5db1f3

    goto/16 :goto_9

    :sswitch_16
    move-object/from16 v1, v19

    .line 380
    invoke-interface {v1, v5}, Lbin/mt/plugin/api/preference/PluginPreference$Input$Validator;->validate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_e

    const-string v7, "\u06d8\u06db"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v15

    mul-int/lit8 v7, v7, -0x73

    move-object/from16 v18, v1

    xor-int v1, v7, v16

    mul-int/lit16 v1, v1, -0x1a99

    const v19, -0x31816080

    xor-int v1, v1, v19

    const v19, 0x518d38cb

    goto :goto_8

    :sswitch_17
    move-object/from16 v18, v19

    .line 387
    iget-boolean v1, v6, Ll/֫֨ۘ;->ܶ:Z

    if-eqz v1, :cond_d

    const-string v1, "\u1a78\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x1a2b

    const v19, -0x4144d488

    xor-int v7, v7, v19

    const v19, 0x3c44b142

    goto/16 :goto_e

    :cond_d
    :goto_7
    const-string v1, "\u06d7\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xd

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x6d49

    const v19, 0x4e01b7c6    # 5.4407616E8f

    xor-int v7, v7, v19

    const v19, 0x702ce23b

    goto/16 :goto_e

    .line 378
    :sswitch_18
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۫ۚ;->ۜ()Ljava/lang/String;

    move-result-object v5

    .line 379
    iget-object v6, v0, Ll/ۜ᩹ۘ;->ۙۙ:Ll/֫֨ۘ;

    iget-object v1, v6, Ll/֫֨ۘ;->᩺:Lbin/mt/plugin/api/preference/PluginPreference$Input$Validator;

    if-eqz v1, :cond_e

    const-string v7, "\u1a77\u06d8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v16, v7

    mul-int/lit8 v7, v7, 0x29

    move-object/from16 v18, v1

    xor-int v1, v7, v15

    mul-int/lit16 v1, v1, -0x6935

    const v19, 0x3fa9c99d

    xor-int v1, v1, v19

    const v19, 0x7f9b98f9

    :goto_8
    xor-int v7, v7, v19

    move-object/from16 v19, v18

    move/from16 v18, v7

    goto/16 :goto_0

    :cond_e
    move-object/from16 v18, v1

    move-object/from16 v19, v18

    const-string v1, "\u06ec\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x2757

    const v18, -0x2072a81e

    xor-int v7, v7, v18

    const v18, -0x1e521377

    :goto_9
    xor-int v18, v1, v18

    goto/16 :goto_f

    :sswitch_19
    move-object/from16 v18, v19

    .line 378
    iget-object v4, v2, Ll/᩺᩹ۘ;->ܽ:Ll/ᩴ᩹ۘ;

    .line 44
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_f

    :goto_a
    const-string v1, "\u06e1\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x62c1

    const v19, 0x58444d62

    xor-int v7, v7, v19

    const v19, -0x9ce05a6

    goto/16 :goto_e

    :cond_f
    const-string v1, "\u06e1\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x7d

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x3c7f

    const v19, 0x30512164

    xor-int v7, v7, v19

    const v19, 0x25fde2dc

    goto/16 :goto_e

    :sswitch_1a
    move-object/from16 v18, v19

    .line 378
    iget-object v3, v2, Ll/᩺᩹ۘ;->᩶:Landroid/widget/TextView;

    .line 253
    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_10

    goto/16 :goto_d

    :cond_10
    const-string v1, "\u06df\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x5b

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0xc93

    const v19, -0x79a253cc

    xor-int v7, v7, v19

    const v19, 0x184581ba

    goto/16 :goto_e

    :sswitch_1b
    move-object/from16 v18, v19

    .line 67
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_11

    :goto_b
    const-string v1, "\u06d6\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x35

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x7fc5

    const v19, -0x242a0976

    xor-int v7, v7, v19

    const v19, -0x27710d46

    goto/16 :goto_e

    :cond_11
    const-string v1, "\u1a77\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x2617

    const v19, 0x1cf7257a

    xor-int v7, v7, v19

    const v19, 0x22477d4a

    goto/16 :goto_e

    :sswitch_1c
    move-object/from16 v18, v19

    .line 93
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_c

    :cond_12
    const-string v1, "\u06e0\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x3

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x1d3

    const v19, -0x41ba37d9

    xor-int v7, v7, v19

    const v19, -0x7c21db28

    goto :goto_e

    :sswitch_1d
    move-object/from16 v18, v19

    .line 318
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v1

    if-gtz v1, :cond_13

    :goto_c
    const-string v1, "\u06e8\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x7

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x3b1d

    const v19, -0xf7cff22

    xor-int v7, v7, v19

    const v19, 0x3102094f

    goto :goto_e

    :cond_13
    const-string v1, "\u06dc\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0xf

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x25bf

    const v19, -0x62ff0c46

    xor-int v7, v7, v19

    const v19, 0xd4883ae

    goto :goto_e

    :sswitch_1e
    move-object/from16 v18, v19

    .line 378
    iget-object v2, v0, Ll/ۜ᩹ۘ;->ۗ:Ll/᩺᩹ۘ;

    .line 276
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v1

    if-eqz v1, :cond_14

    :goto_d
    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x4b

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x6227

    const v19, -0x6a4dcb74

    xor-int v7, v7, v19

    const v19, 0x4cd1e712    # 1.1004942E8f

    goto :goto_e

    :cond_14
    const-string v1, "\u0733\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x4223

    const v19, 0x74d27c5

    xor-int v7, v7, v19

    const v19, 0x152dcfba

    :goto_e
    xor-int v1, v1, v19

    move-object/from16 v19, v18

    move/from16 v18, v1

    :goto_f
    move v1, v7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fc4dc95 -> :sswitch_f
        -0x7f3b144c -> :sswitch_1e
        -0x7f0f6f5f -> :sswitch_6
        -0x7da83aba -> :sswitch_1d
        -0x7b3c3364 -> :sswitch_6
        -0x7a4914a9 -> :sswitch_11
        -0x78351d16 -> :sswitch_c
        -0x76e87277 -> :sswitch_14
        -0x73f46291 -> :sswitch_1e
        -0x663ea8b5 -> :sswitch_3
        -0x64012b38 -> :sswitch_8
        -0x61a9a2cf -> :sswitch_19
        -0x59b62314 -> :sswitch_17
        -0x5714039e -> :sswitch_17
        -0x56ebe620 -> :sswitch_0
        -0x54b997eb -> :sswitch_16
        -0x537a19ae -> :sswitch_11
        -0x48978a23 -> :sswitch_1
        -0x45ad7e33 -> :sswitch_1b
        -0x3bb3f0fe -> :sswitch_a
        -0x3ad41a68 -> :sswitch_1b
        -0x35edc5a1 -> :sswitch_0
        -0x35daf982 -> :sswitch_2
        -0x31f82210 -> :sswitch_10
        -0x2c785ac3 -> :sswitch_7
        -0x2c63f050 -> :sswitch_3
        -0x23f31215 -> :sswitch_4
        -0x22696cd1 -> :sswitch_1a
        -0x1f8db0ae -> :sswitch_13
        -0x16417cbe -> :sswitch_5
        -0x15a7f1a3 -> :sswitch_d
        -0x1554640d -> :sswitch_2
        -0x1302220d -> :sswitch_5
        -0x3de2622 -> :sswitch_9
        -0x2cadbf6 -> :sswitch_b
        0x4b30a8 -> :sswitch_10
        0xc7cb2bc -> :sswitch_12
        0xd207046 -> :sswitch_e
        0x164961d3 -> :sswitch_1
        0x165c6502 -> :sswitch_15
        0x1d24c2e4 -> :sswitch_18
        0x1fb49beb -> :sswitch_c
        0x23d87968 -> :sswitch_12
        0x25d0cba6 -> :sswitch_f
        0x2a40a124 -> :sswitch_a
        0x2a761093 -> :sswitch_e
        0x2b68d5d4 -> :sswitch_7
        0x3244e0ea -> :sswitch_9
        0x39b32010 -> :sswitch_8
        0x3db0f0f7 -> :sswitch_16
        0x3eba3786 -> :sswitch_19
        0x3ee7d9b6 -> :sswitch_15
        0x404787c8 -> :sswitch_b
        0x440ee59b -> :sswitch_13
        0x4653d44d -> :sswitch_1c
        0x54b3b6a7 -> :sswitch_18
        0x55337dc3 -> :sswitch_d
        0x5650ea73 -> :sswitch_1c
        0x614bcab0 -> :sswitch_4
        0x6b028b45 -> :sswitch_1a
        0x75014716 -> :sswitch_14
        0x775cff50 -> :sswitch_1d
    .end sparse-switch
.end method
