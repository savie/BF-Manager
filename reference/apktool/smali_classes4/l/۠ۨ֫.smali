.class public final Ll/۠ۨ֫;
.super Ll/۠ۢᩴ;
.source "O3YD"


# instance fields
.field public final synthetic ۙۙ:Ll/ܿܰ֫;

.field public final synthetic ۜ:Ll/ۜۨ֫;

.field public final synthetic ۬:Ll/᩺᩺֫;

.field public final synthetic ᩷ۙ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۜۨ֫;Ll/ܽ֡֫;Ll/᩺᩺֫;Ljava/lang/String;Ll/ܿܰ֫;)V
    .locals 3

    const v0, 0x56bdb917

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    .line 374
    iput-object p1, p0, Ll/۠ۨ֫;->ۜ:Ll/ۜۨ֫;

    iput-object p3, p0, Ll/۠ۨ֫;->۬:Ll/᩺᩺֫;

    iput-object p4, p0, Ll/۠ۨ֫;->᩷ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/۠ۨ֫;->ۙۙ:Ll/ܿܰ֫;

    const/4 p1, -0x1

    .line 39
    invoke-direct {p0, p2, p1}, Ll/۠ۢᩴ;-><init>(Ll/ܽ֡֫;I)V

    const-string p1, "\u1a7b\u0733"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x4f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x417b

    const p3, 0x527f5ff

    xor-int/2addr p2, p3

    const p3, -0x680a847a

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x5db9

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 37
    :sswitch_0
    sget-boolean p1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0736\u1a73"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2675

    const p3, 0x99f0863

    xor-int/2addr p2, p3

    const p3, -0x496ebeb0

    goto :goto_0

    .line 334
    :sswitch_1
    sget p1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06dc\u06e8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x314b

    const p3, 0x173125a2

    xor-int/2addr p2, p3

    const p3, 0x418d9bb9

    goto :goto_0

    :sswitch_2
    sget p1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-lez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u073f\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x178d

    const p3, 0x1c185b2d

    xor-int/2addr p2, p3

    const p3, 0x2166f65d

    goto :goto_0

    .line 114
    :sswitch_3
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    :goto_1
    const-string p1, "\u06d9\u0733"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xfa5

    const p3, 0x2a3649d5

    xor-int/2addr p2, p3

    const p3, 0x6dc44083

    goto :goto_0

    .line 125
    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget p1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz p1, :cond_3

    const-string p1, "\u0733\u06d8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xd

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7f11

    const p3, -0x1b08fb57

    xor-int/2addr p2, p3

    const p3, -0x282a573c

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06ec\u073f"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x19

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x4e8d

    const p3, -0x79973911

    xor-int/2addr p2, p3

    const p3, -0x7bad923c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x563b036d -> :sswitch_2
        -0x49b279c8 -> :sswitch_3
        -0x3908c128 -> :sswitch_5
        -0x171842e3 -> :sswitch_5
        -0x510f22b -> :sswitch_4
        -0x314e40d -> :sswitch_2
        0x1c1fea6b -> :sswitch_0
        0x21ba2e81 -> :sswitch_1
        0x3454967f -> :sswitch_1
        0x347b088f -> :sswitch_0
        0x362bbbb0 -> :sswitch_4
        0x5c7a6e8c -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ܶ()V
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

    const v14, 0x41a6af6d

    sget v15, Ll/ۘ֡;->᩹ܶ۬:I

    sget v16, Ll/֡ۢ;->۟֡᩻:I

    const-string v17, "\u06e1\u1a7b"

    invoke-static/range {v17 .. v17}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    mul-int/lit8 v17, v17, -0x9

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, -0x570f

    const v19, 0x40293143

    xor-int v1, v1, v19

    const v19, 0x67ec50fe

    xor-int v17, v17, v19

    move-object/from16 v19, v6

    move-object v14, v13

    move/from16 v18, v17

    const v17, 0x41a6af6d

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

    mul-int/lit16 v7, v7, 0x4ebb

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v1, v7

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    .line 183
    invoke-static {v9, v8}, Ll/֨ۖ;->᩸ۙۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_a

    move-object v14, v1

    goto/16 :goto_7

    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    move-object/from16 v18, v19

    goto/16 :goto_c

    .line 120
    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v1, :cond_8

    goto/16 :goto_5

    .line 103
    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u1a76\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x6237

    const v18, 0x9049fca

    xor-int v7, v7, v18

    const v18, -0x75831638

    goto/16 :goto_b

    .line 271
    :sswitch_3
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_4

    :cond_2
    :goto_1
    move-object/from16 v18, v19

    goto/16 :goto_e

    .line 371
    :sswitch_4
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    const-string v1, "\u1a78\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x17

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x65e1

    const v18, -0x1d1b3a58

    xor-int v7, v7, v18

    const v18, 0x3ee20cc7

    goto/16 :goto_b

    :sswitch_5
    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v1, :cond_2

    :goto_3
    move-object/from16 v18, v19

    goto/16 :goto_f

    :sswitch_6
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto :goto_3

    .line 386
    :sswitch_7
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    return-void

    :sswitch_8
    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v8}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v1

    const/16 v7, 0x7d

    if-ne v1, v7, :cond_a

    const-string v1, "\u1a7a\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x7027

    const v18, 0x3742eb09

    xor-int v7, v7, v18

    const v18, -0x77a9b364

    goto/16 :goto_b

    :sswitch_9
    const/4 v1, 0x0

    .line 182
    invoke-static {v8, v1}, Ll/֨ᩳ;->֡᩶ۖ(Ljava/lang/Object;I)C

    move-result v1

    const/16 v7, 0x7b

    if-ne v1, v7, :cond_a

    const-string v1, "\u1a7a\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x17ed

    const v18, 0x455484c7

    xor-int v7, v7, v18

    const v18, 0x4fcc61b1

    goto/16 :goto_b

    .line 383
    :sswitch_a
    invoke-virtual {v0, v14}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/String;)V

    return-void

    .line 389
    :sswitch_b
    iget-object v1, v6, Ll/ܰ᩺֫;->ᩴ:Ljava/lang/CharSequence;

    invoke-static {v3, v1}, Ll/ۖۖ;->ܳ۫᩸(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    .line 391
    :sswitch_c
    invoke-static {v3, v5}, Ll/᩺;->ܰܺ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    move-object/from16 v18, v19

    goto/16 :goto_9

    .line 396
    :sswitch_d
    iget-object v1, v2, Ll/ۜۨ֫;->ܰ:Ll/ܰ᩺֫;

    invoke-static {v2, v13, v1, v5}, Ll/ۜۨ֫;->ۙ(Ll/ۜۨ֫;Ll/ܿܰ֫;Ll/ܰ᩺֫;Ljava/lang/String;)V

    goto/16 :goto_8

    .line 394
    :sswitch_e
    invoke-interface {v12}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 396
    iget-object v13, v0, Ll/۠ۨ֫;->ۙۙ:Ll/ܿܰ֫;

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_5

    :cond_4
    :goto_5
    const-string v1, "\u05ab\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x711d

    const v18, 0x5179a3b3

    xor-int v7, v7, v18

    const v18, 0x3663578f

    goto/16 :goto_b

    :cond_5
    const-string v1, "\u06ec\u05a1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x4e05

    const v18, -0x4591ef33

    xor-int v7, v7, v18

    const v18, 0x6318f5bd

    goto/16 :goto_b

    .line 394
    :sswitch_f
    invoke-interface {v10, v11, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v12

    .line 298
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_6

    move-object/from16 v18, v19

    goto/16 :goto_d

    :cond_6
    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x6133

    const v18, 0x6cd22450

    xor-int v7, v7, v18

    const v18, -0x7a3427ee    # -1.91694E-35f

    goto/16 :goto_b

    .line 394
    :sswitch_10
    iget-object v11, v6, Ll/ܰ᩺֫;->ۤ:Ljava/lang/String;

    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v1, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x24ef

    const v18, 0x49a14232

    xor-int v7, v7, v18

    const v18, -0x15f046d5

    goto/16 :goto_b

    :sswitch_11
    invoke-static {v4}, Ll/ۤۛ֫;->᩸(Ll/ۤۛ֫;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v10

    .line 231
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    :goto_6
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x19

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x55d5

    const v18, -0x3e093093

    xor-int v7, v7, v18

    const v18, -0x55bdbd8c

    goto/16 :goto_b

    :cond_9
    const-string v1, "\u06db\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x5b

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x165f

    const v18, -0x4fffe16f

    xor-int v7, v7, v18

    const v18, -0x76f970a3

    goto/16 :goto_b

    .line 398
    :sswitch_12
    invoke-virtual/range {p0 .. p0}, Ll/۠ۢᩴ;->᩷()V

    return-void

    .line 382
    :sswitch_13
    invoke-static {v4}, Ll/ۤۛ֫;->ۤ(Ll/ۤۛ֫;)Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    .line 182
    invoke-static {v8}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v1

    const/4 v7, 0x3

    if-lt v1, v7, :cond_a

    const-string v1, "\u073a\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0xb55

    const v18, -0x15aa21db

    xor-int v7, v7, v18

    const v18, -0x108643d

    goto/16 :goto_b

    :cond_a
    move-object v14, v8

    :goto_7
    const-string v1, "\u06d6\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x127f

    const v18, 0x4fc32a70

    xor-int v7, v7, v18

    const v18, 0xb3ee5eb

    goto/16 :goto_b

    .line 388
    :sswitch_14
    invoke-static {v5}, Ll/ۖ᩵;->ۡ֫۠(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "\u06d6\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x2089

    const v18, -0x47a9813f

    xor-int v7, v7, v18

    const v18, -0x311fd468

    goto/16 :goto_b

    :cond_b
    const-string v1, "\u0730\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x723b

    const v18, 0x71cc64c5

    xor-int v7, v7, v18

    const v18, 0xce6e9f3

    goto/16 :goto_b

    .line 393
    :sswitch_15
    iget-object v1, v0, Ll/۠ۨ֫;->᩷ۙ:Ljava/lang/String;

    invoke-static {v5, v1}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "\u1a79\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x69

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x5959

    const v18, 0x1f79c33c

    xor-int v7, v7, v18

    const v18, 0x459f0b15

    goto/16 :goto_b

    :cond_c
    :goto_8
    const-string v1, "\u06e0\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x6d

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x5ab5

    const v18, 0x54157fba

    xor-int v7, v7, v18

    const v18, 0xf39b705

    goto/16 :goto_b

    :sswitch_16
    move-object/from16 v1, v19

    .line 380
    invoke-interface {v1, v5}, Lbin/mt/plugin/api/preference/PluginPreference$Input$Validator;->validate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_e

    const-string v7, "\u06e8\u06db"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v15

    move-object/from16 v18, v1

    xor-int v1, v7, v16

    mul-int/lit16 v1, v1, 0x3c4b

    const v19, 0x14178155

    xor-int v1, v1, v19

    const v19, 0x1def1b2d

    goto :goto_a

    :sswitch_17
    move-object/from16 v18, v19

    .line 387
    iget-boolean v1, v6, Ll/᩺᩺֫;->ܺ:Z

    if-eqz v1, :cond_d

    const-string v1, "\u0730\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x2bb7

    const v19, -0x2c80a3f4

    xor-int v7, v7, v19

    const v19, 0x7ec78b2c

    goto/16 :goto_10

    :cond_d
    :goto_9
    const-string v1, "\u06d9\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x3f39

    const v19, -0x66693d71

    xor-int v7, v7, v19

    const v19, -0x21c97c9b

    goto/16 :goto_10

    .line 378
    :sswitch_18
    invoke-virtual/range {p0 .. p0}, Ll/۠ۢᩴ;->֫()Ljava/lang/String;

    move-result-object v5

    .line 379
    iget-object v6, v0, Ll/۠ۨ֫;->۬:Ll/᩺᩺֫;

    iget-object v1, v6, Ll/᩺᩺֫;->᩻:Lbin/mt/plugin/api/preference/PluginPreference$Input$Validator;

    if-eqz v1, :cond_e

    const-string v7, "\u1a77\u06db"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v15

    move-object/from16 v18, v1

    xor-int v1, v7, v16

    mul-int/lit16 v1, v1, 0x3b89

    const v19, -0x5889952b

    xor-int v1, v1, v19

    const v19, 0x712a3dc6

    :goto_a
    xor-int v7, v7, v19

    move-object/from16 v19, v18

    move/from16 v18, v7

    goto/16 :goto_0

    :cond_e
    move-object/from16 v18, v1

    move-object/from16 v19, v18

    const-string v1, "\u05a1\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x35

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x5e65

    const v18, -0x10d5b2dd

    xor-int v7, v7, v18

    const v18, -0x4a48ed31

    :goto_b
    xor-int v18, v1, v18

    goto/16 :goto_11

    :sswitch_19
    move-object/from16 v18, v19

    .line 378
    iget-object v4, v2, Ll/ۜۨ֫;->֡:Ll/ۤۛ֫;

    sget v1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v1, :cond_f

    goto/16 :goto_f

    :cond_f
    const-string v1, "\u06e7\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x2c57

    const v19, 0xc588098

    xor-int v7, v7, v19

    const v19, 0x4f43615c

    goto/16 :goto_10

    :sswitch_1a
    move-object/from16 v18, v19

    iget-object v3, v2, Ll/ۜۨ֫;->᩶:Landroid/widget/TextView;

    .line 365
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_f

    :cond_10
    const-string v1, "\u05a1\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x59

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x50ad

    const v19, -0x50c5c051

    xor-int v7, v7, v19

    const v19, -0x624069dd

    goto/16 :goto_10

    :sswitch_1b
    move-object/from16 v18, v19

    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v1, :cond_11

    :goto_c
    const-string v1, "\u05a1\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x6f27

    const v19, -0x4df8efc2

    xor-int v7, v7, v19

    const v19, -0x3ec2180f

    goto/16 :goto_10

    :cond_11
    const-string v1, "\u1a74\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x7

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x130f

    const v19, -0x52da6b23

    xor-int v7, v7, v19

    const v19, 0x282dc867

    goto/16 :goto_10

    :sswitch_1c
    move-object/from16 v18, v19

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_12

    :goto_d
    const-string v1, "\u06df\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x547d

    const v19, -0x2cac0ea5

    xor-int v7, v7, v19

    const v19, -0x7c52fd39

    goto/16 :goto_10

    :cond_12
    const-string v1, "\u1a73\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x5d

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, -0x22fd

    const v19, -0x562a1027

    xor-int v7, v7, v19

    const v19, 0x2234dbbd

    goto :goto_10

    :sswitch_1d
    move-object/from16 v18, v19

    .line 254
    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_13

    :goto_e
    const-string v1, "\u06e4\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x1b81

    const v19, -0xf418367

    xor-int v7, v7, v19

    const v19, 0x4d379154    # 1.9248467E8f

    goto :goto_10

    :cond_13
    const-string v1, "\u06e7\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v7, v1, v15

    mul-int/lit16 v7, v7, 0x5251

    const v19, -0x1c5a2f75

    xor-int v7, v7, v19

    const v19, -0x10d0af93

    goto :goto_10

    :sswitch_1e
    move-object/from16 v18, v19

    .line 378
    iget-object v2, v0, Ll/۠ۨ֫;->ۜ:Ll/ۜۨ֫;

    .line 311
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v1

    if-gtz v1, :cond_14

    :goto_f
    const-string v1, "\u073a\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x37

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, 0x3f3d

    const v19, 0x66182874

    xor-int v7, v7, v19

    const v19, 0x112daf22

    goto :goto_10

    :cond_14
    const-string v1, "\u0736\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v7, v1, v16

    mul-int/lit16 v7, v7, -0x2899

    const v19, -0x5a5e747c

    xor-int v7, v7, v19

    const v19, -0x7a102300

    :goto_10
    xor-int v1, v1, v19

    move-object/from16 v19, v18

    move/from16 v18, v1

    :goto_11
    move v1, v7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f8fbabc -> :sswitch_16
        -0x70a5d1ab -> :sswitch_1a
        -0x6ad2460c -> :sswitch_17
        -0x6a173972 -> :sswitch_2
        -0x68ccc3e6 -> :sswitch_8
        -0x6493f289 -> :sswitch_d
        -0x5ff883ad -> :sswitch_13
        -0x5c1801bf -> :sswitch_3
        -0x5c01f07a -> :sswitch_f
        -0x5858c392 -> :sswitch_1b
        -0x53889d74 -> :sswitch_1d
        -0x4ffb1b80 -> :sswitch_11
        -0x4f8b0491 -> :sswitch_e
        -0x49edd820 -> :sswitch_0
        -0x44b633b0 -> :sswitch_1c
        -0x3c68c377 -> :sswitch_f
        -0x2dc7bd05 -> :sswitch_6
        -0x2cfe64d6 -> :sswitch_a
        -0x2890c775 -> :sswitch_9
        -0x256fa12d -> :sswitch_1c
        -0x22e35afd -> :sswitch_10
        -0x201e98ae -> :sswitch_b
        -0x175a89cd -> :sswitch_1
        -0x147679cd -> :sswitch_19
        -0x13db0581 -> :sswitch_12
        -0x11bc9373 -> :sswitch_7
        -0xfe94f59 -> :sswitch_2
        -0xb1272b6 -> :sswitch_1a
        -0x851fe8f -> :sswitch_15
        -0x122acc8 -> :sswitch_7
        0x3816ffd -> :sswitch_1d
        0x3dc1fb2 -> :sswitch_4
        0x5905ad1 -> :sswitch_19
        0xb1b5a4f -> :sswitch_b
        0x2035b526 -> :sswitch_14
        0x22a66611 -> :sswitch_a
        0x26f24e08 -> :sswitch_17
        0x29430108 -> :sswitch_0
        0x2c688d34 -> :sswitch_18
        0x2ffa18db -> :sswitch_1e
        0x34779ee8 -> :sswitch_13
        0x372c3c7d -> :sswitch_9
        0x3959f29a -> :sswitch_c
        0x398aebf6 -> :sswitch_1
        0x3c57753e -> :sswitch_4
        0x410b9479 -> :sswitch_12
        0x41bc6ba0 -> :sswitch_5
        0x41df3882 -> :sswitch_10
        0x4a8070be -> :sswitch_d
        0x4b789052 -> :sswitch_14
        0x4d9518ce -> :sswitch_e
        0x4ff0f044 -> :sswitch_c
        0x58b15fb4 -> :sswitch_16
        0x677b3e18 -> :sswitch_1b
        0x68b40e17 -> :sswitch_11
        0x6d438dc3 -> :sswitch_15
        0x7826747d -> :sswitch_3
        0x7888b4a6 -> :sswitch_6
        0x7a70a482 -> :sswitch_8
        0x7afc4409 -> :sswitch_18
        0x7ba4321d -> :sswitch_1e
        0x7de7aaa8 -> :sswitch_5
    .end sparse-switch
.end method
