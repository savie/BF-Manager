.class public final Ll/᩵۟᩺;
.super Ljava/lang/Object;
.source "R5PD"


# static fields
.field private static final ᩶ۙۗ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵۟᩺;->᩶ۙۗ:[S

    return-void

    :array_0
    .array-data 2
        0x2025s
        -0x6194s
        -0x61dcs
        -0x61c8s
        -0x61c7s
        -0x61dds
        -0x6192s
        0xf53s
        -0x2d86s
        -0x2dces
        -0x2dd2s
        -0x2dd1s
        -0x2dcbs
        -0x2d88s
    .end array-data
.end method

.method public static final ۙ(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x4d55991a

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v4, "\u06dc\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xaed

    const v6, 0x5612ce39

    xor-int/2addr v5, v6

    const v6, 0x1cab3fb3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x7df9

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    .line 56
    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    sget v4, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v4, :cond_4

    goto/16 :goto_3

    .line 27
    :sswitch_1
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-gez v4, :cond_a

    goto/16 :goto_1

    :sswitch_2
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_7

    goto/16 :goto_1

    .line 22
    :sswitch_3
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    goto/16 :goto_1

    .line 60
    :sswitch_4
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    return-void

    .line 80
    :sswitch_5
    new-instance v1, Ll/۠۟᩺;

    invoke-direct {v1, p0}, Ll/۠۟᩺;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 93
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void

    .line 8
    :sswitch_6
    invoke-static {v0}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v4, "\u06e4\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d01

    const v6, 0x398b8428

    xor-int/2addr v5, v6

    const v6, 0x49fe7a54    # 2084682.5f

    goto :goto_0

    .line 6
    :sswitch_7
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u06d7\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x727d

    const v6, -0x167a5918

    xor-int/2addr v5, v6

    const v6, 0x48232f7a

    goto :goto_0

    .line 51
    :sswitch_8
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a75\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x401b

    const v6, -0x267ead9a

    xor-int/2addr v5, v6

    const v6, -0x176a91a5

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06e8\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7829

    const v6, 0x645673a9

    xor-int/2addr v5, v6

    const v6, 0x56f903ad

    goto/16 :goto_0

    .line 64
    :sswitch_a
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_5

    :cond_4
    const-string v4, "\u06e1\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xc71

    const v6, -0x49571a7e

    xor-int/2addr v5, v6

    const v6, -0xdbbe237

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d9\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6045

    const v6, -0x71838805

    xor-int/2addr v5, v6

    const v6, -0x74342890

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_6

    :goto_1
    const-string v4, "\u06e1\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5389

    const v6, 0x63e5721b

    xor-int/2addr v5, v6

    const v6, 0x7aad7b99

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a7b\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa7

    const v6, 0x4f36541c

    xor-int/2addr v5, v6

    const v6, -0x76456d3b

    goto/16 :goto_0

    .line 15
    :sswitch_c
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v4

    if-gtz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u06d9\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xd4b

    const v6, -0x5904cda2

    xor-int/2addr v5, v6

    const v6, -0x5199326b

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06db\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x10b3

    const v6, -0x3f086bb6

    xor-int/2addr v5, v6

    const v6, 0x506e38d9

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u05a1\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ca1

    const v6, -0x5aaffeef

    xor-int/2addr v5, v6

    const v6, -0x4f6c43a0

    goto/16 :goto_0

    :cond_a
    :goto_3
    const-string v4, "\u073f\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7119

    const v6, -0x1e88eda1

    xor-int/2addr v5, v6

    const v6, 0x2eea20a4

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u0733\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x256d

    const v6, -0x3e386765

    xor-int/2addr v5, v6

    const v6, -0x1fe58c44

    goto/16 :goto_0

    .line 8
    :sswitch_e
    invoke-static {p0}, Ll/֨۟;->ۡ᩷ۗ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    .line 22
    sget-boolean v4, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v4, :cond_c

    :goto_4
    const-string v4, "\u06d8\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ccb

    const v6, -0x3df7ddd6

    xor-int/2addr v5, v6

    const v6, 0x66a34df5

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0730\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2df5

    const v6, -0x50b38d0

    xor-int/2addr v5, v6

    const v6, -0x7c0e4580

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dac1b01 -> :sswitch_7
        -0x70592445 -> :sswitch_a
        -0x6fdf1af3 -> :sswitch_3
        -0x53386125 -> :sswitch_a
        -0x3b4d5df8 -> :sswitch_4
        -0x3866cf8f -> :sswitch_0
        -0x354f18ed -> :sswitch_9
        -0x28c509c8 -> :sswitch_1
        -0x21492841 -> :sswitch_9
        -0xf45d57f -> :sswitch_2
        0x7ea6446 -> :sswitch_5
        0x11ab3054 -> :sswitch_e
        0x27f61dee -> :sswitch_8
        0x2a763133 -> :sswitch_d
        0x3171bde2 -> :sswitch_2
        0x39d5d3ec -> :sswitch_e
        0x41608f1c -> :sswitch_6
        0x4962a579 -> :sswitch_8
        0x536916b9 -> :sswitch_b
        0x57b88fab -> :sswitch_6
        0x592ecc7e -> :sswitch_c
        0x5979e80c -> :sswitch_3
        0x5c4732df -> :sswitch_1
        0x5fd3a3f1 -> :sswitch_4
        0x619f6867 -> :sswitch_d
        0x6c80910e -> :sswitch_5
        0x704d9c77 -> :sswitch_b
        0x77dcdf2b -> :sswitch_c
        0x7922a9cf -> :sswitch_7
        0x7938eca8 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final ۙ(Lcom/google/android/material/textfield/TextInputLayout;I)V
    .locals 19

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

    const v13, -0x5667be57

    sget v14, Ll/֫ܽ;->֡ᩴܶ:I

    sget v15, Ll/ۧ;->֫۠ᩴ:I

    const-string v16, "\u073f\u06e8"

    invoke-static/range {v16 .. v16}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    mul-int/lit8 v16, v16, -0x7b

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0x1067

    const v18, -0x261a17c7

    xor-int v1, v1, v18

    const v18, -0x422d5990

    xor-int v16, v16, v18

    move-object/from16 v18, v3

    move-object v11, v10

    move/from16 v17, v16

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const v16, -0x5667be57

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v16, v14

    mul-int/lit16 v4, v4, 0x5043

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    .line 9
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v1

    if-eqz v1, :cond_d

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget-boolean v1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v1, "\u1a75\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x3a11

    const v17, -0x55857a83

    xor-int v4, v4, v17

    const v17, 0x6a7f3396

    goto/16 :goto_6

    .line 11
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_4

    .line 14
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    return-void

    .line 19
    :sswitch_5
    invoke-static/range {p0 .. p0}, Ll/֫ۘ;->ۜۧۢ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/֫ܺ;->᩹᩷ۧ(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/֫ᩳ;->ᩳۛᩴ(Ljava/lang/Object;)Z

    return-void

    .line 18
    :sswitch_6
    invoke-virtual {v3}, Landroid/widget/EditText;->selectAll()V

    .line 13
    sget v1, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u05a8\u05a8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x67

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x723d

    const v17, -0x2d91eda4

    xor-int v4, v4, v17

    const v17, 0x66770b5

    goto/16 :goto_6

    .line 17
    :sswitch_7
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 18
    invoke-static/range {p0 .. p0}, Ll/֨۟;->ۡ᩷ۗ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Ll/֫ܺ;->᩹᩷ۧ(Ljava/lang/Object;)V

    .line 8
    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_3

    :cond_2
    :goto_2
    const-string v1, "\u0736\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x45

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0xa07

    const v17, 0x1fe0d39d

    xor-int v4, v4, v17

    const v17, 0x66bf8095

    goto/16 :goto_6

    :cond_3
    const-string v1, "\u06e4\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x725

    const v17, -0x3c13e862

    xor-int v4, v4, v17

    const v17, -0x454846ff

    goto/16 :goto_6

    .line 16
    :sswitch_8
    invoke-static/range {p1 .. p1}, Ll/֫ܳ;->֨᩷֨(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v2, 0x1

    sget v1, Ll/۟;->ۨᩴۛ:I

    if-ltz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06e8\u06eb"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x7

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x295b

    const v17, -0x70e743c1

    xor-int v4, v4, v17

    const v17, -0x35141472    # -7730631.0f

    goto/16 :goto_6

    .line 0
    :sswitch_9
    invoke-static {v11, v12, v13, v10}, Ll/֨ܶ;->ۢ֡᩷([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫ۛ;->ۨܰۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u06df\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x7783

    const v17, 0x389bdb5

    xor-int v4, v4, v17

    const v17, 0x20fd4841

    goto/16 :goto_6

    :sswitch_a
    sget-object v11, Ll/᩵۟᩺;->᩶ۙۗ:[S

    const/4 v12, 0x1

    const/4 v13, 0x6

    .line 13
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06d8\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x6d

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0x7265

    const v17, 0x65497d26

    xor-int v4, v4, v17

    const v17, -0x6f37a452

    goto/16 :goto_6

    :sswitch_b
    const/16 v1, 0x4355

    const/16 v10, 0x4355

    goto :goto_3

    :sswitch_c
    const v1, 0x9e50

    const v10, 0x9e50

    :goto_3
    const-string v1, "\u0736\u06db"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x5baf

    const v17, 0x23e21114

    xor-int v4, v4, v17

    const v17, -0x8cc7b

    goto/16 :goto_6

    :sswitch_d
    add-int/lit8 v1, v9, 0x1

    sub-int/2addr v1, v8

    if-lez v1, :cond_7

    const-string v1, "\u0730\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x7d

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x7e57

    const v17, 0x4085805e

    xor-int v4, v4, v17

    const v17, 0x2c157aed

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0xeef

    const v17, 0x25830090

    xor-int v4, v4, v17

    const v17, 0x9ae48b3

    goto/16 :goto_6

    :sswitch_e
    mul-int v8, v7, v7

    mul-int/lit8 v9, v6, 0x2

    .line 6
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_9

    :cond_8
    const-string v1, "\u06e1\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x27

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xe2f

    const v17, -0x76047720

    xor-int v4, v4, v17

    const v17, 0x73971ecd

    goto/16 :goto_6

    :cond_9
    const-string v1, "\u06eb\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0xfad

    const v17, 0x2223d16a

    xor-int v4, v4, v17

    const v17, 0x51384fd0

    goto/16 :goto_6

    :sswitch_f
    aget-short v6, v18, v5

    add-int/lit8 v7, v6, 0x1

    .line 10
    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u1a79\u06da"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x2535

    const v17, -0x75db9dfa

    xor-int v4, v4, v17

    const v17, 0x5a92141d

    goto/16 :goto_6

    :sswitch_10
    const/4 v5, 0x0

    .line 2
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v1

    if-gtz v1, :cond_b

    :goto_4
    const-string v1, "\u06e4\u1a79"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x45

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x1347

    const v17, 0x651ad385

    xor-int v4, v4, v17

    const v17, 0x425e45ac

    goto :goto_6

    :cond_b
    const-string v1, "\u1a7a\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x1c13

    const v17, -0x3e5f7bb1

    xor-int v4, v4, v17

    const v17, 0x5d7d5b1e

    goto :goto_6

    :sswitch_11
    sget-object v18, Ll/᩵۟᩺;->᩶ۙۗ:[S

    .line 5
    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_c

    goto :goto_5

    :cond_c
    const-string v1, "\u06da\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, 0x4d05

    const v17, -0x20e002d5

    xor-int v4, v4, v17

    const v17, -0xbbd00f5

    goto :goto_6

    :goto_5
    const-string v1, "\u06eb\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x51

    xor-int v4, v1, v14

    mul-int/lit16 v4, v4, -0xc4d

    const v17, 0x544e4f8e

    xor-int v4, v4, v17

    const v17, 0x1f3ba2fd

    goto :goto_6

    :cond_d
    const-string v1, "\u06e7\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x217d

    const v17, 0x2fca69e4

    xor-int v4, v4, v17

    const v17, -0x37700cd

    :goto_6
    xor-int v17, v1, v17

    move v1, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x785ff0a6 -> :sswitch_3
        -0x73d27e3f -> :sswitch_10
        -0x68f54f2b -> :sswitch_3
        -0x65fcbd5b -> :sswitch_2
        -0x60d7a94e -> :sswitch_4
        -0x4ed2a50f -> :sswitch_e
        -0x49559730 -> :sswitch_c
        -0x473c8f74 -> :sswitch_7
        -0x457b181f -> :sswitch_d
        -0x4068bbae -> :sswitch_c
        -0x3fe82dc3 -> :sswitch_8
        -0x3e49185a -> :sswitch_4
        -0x3a4b1c74 -> :sswitch_9
        -0x34be193b -> :sswitch_8
        -0x2fe98dde -> :sswitch_5
        -0x2169e492 -> :sswitch_5
        -0x1d856328 -> :sswitch_f
        -0x19ed770c -> :sswitch_11
        -0x10cdf4a6 -> :sswitch_1
        -0xd5d11da -> :sswitch_f
        -0x6c3096 -> :sswitch_0
        0x5b39911 -> :sswitch_6
        0x17345684 -> :sswitch_11
        0x1abd6d32 -> :sswitch_a
        0x214abf36 -> :sswitch_2
        0x2cbc75bb -> :sswitch_1
        0x3707d559 -> :sswitch_b
        0x3c835fe0 -> :sswitch_7
        0x40f3298b -> :sswitch_a
        0x427c4f7f -> :sswitch_9
        0x48a3e830 -> :sswitch_b
        0x4b46d8c5 -> :sswitch_10
        0x6ada8fa5 -> :sswitch_d
        0x6f5fbffa -> :sswitch_e
        0x6f7674ba -> :sswitch_0
        0x715ab760 -> :sswitch_6
    .end sparse-switch
.end method

.method public static final ۙ(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V
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

    const v14, 0x385eb840

    sget v15, Ll/֡ۚ;->ۢܰ᩸:I

    sget v16, Ll/֨ܶ;->ۛۛۛ:I

    const-string v17, "\u06e2\u1a7b"

    invoke-static/range {v17 .. v17}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, -0x2f35

    const v19, -0x579ee129

    xor-int v1, v1, v19

    const v19, 0x468ab48e

    xor-int v17, v17, v19

    move-object/from16 v19, v4

    move-object v12, v11

    move/from16 v18, v17

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x385eb840

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x56f1

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    .line 13
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v1

    if-eqz v1, :cond_b

    goto/16 :goto_1

    .line 9
    :sswitch_0
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v1, :cond_9

    goto/16 :goto_1

    .line 23
    :sswitch_1
    sget v1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "\u06e2\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x4239

    const v18, 0x7ca1e3ee

    xor-int v5, v5, v18

    const v18, -0x24e2e52

    goto/16 :goto_6

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 26
    :sswitch_4
    invoke-static/range {p0 .. p0}, Ll/֫ۘ;->ۜۧۢ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۗ;->۟ۖܶ(Ljava/lang/Object;)Z

    return-void

    .line 25
    :sswitch_5
    invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V

    .line 24
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v1, "\u0736\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2919

    const v18, 0x5e56ab0e

    xor-int v5, v5, v18

    const v18, -0x648cbb05

    goto/16 :goto_6

    :sswitch_6
    invoke-virtual {v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 25
    invoke-static/range {p0 .. p0}, Ll/֫ۘ;->ۜۧۢ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/֫ܺ;->᩹᩷ۧ(Ljava/lang/Object;)V

    .line 4
    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v1, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u1a78\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x84b

    const v18, -0x11a29119

    xor-int v5, v5, v18

    const v18, -0x38e943f7

    goto/16 :goto_6

    .line 0
    :sswitch_7
    invoke-static {v0, v2}, Ll/ۖᩴ;->֡۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    .line 16
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06db\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x4f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x5b37

    const v18, -0x18ff3c8a

    xor-int v5, v5, v18

    const v18, -0x372ea52

    goto/16 :goto_6

    .line 0
    :sswitch_8
    invoke-static {v12, v13, v14, v11}, Ll/֡ܽ;->ۗܺۛ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 5
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06da\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7f6d

    const v18, -0x4d189260

    xor-int v5, v5, v18

    const v18, -0x5266a7e0

    goto/16 :goto_6

    .line 0
    :sswitch_9
    sget-object v12, Ll/᩵۟᩺;->᩶ۙۗ:[S

    const/16 v13, 0x8

    const/4 v14, 0x6

    .line 9
    sget-boolean v1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v1, :cond_5

    :goto_1
    const-string v1, "\u06d7\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x20b

    const v18, -0x3680f9c9

    xor-int v5, v5, v18

    const v18, -0x307a97d7

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u1a74\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0xb

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x72f3

    const v18, 0x7668caa

    xor-int v5, v5, v18

    const v18, 0x6a00f475

    goto/16 :goto_6

    :sswitch_a
    const v1, 0xefef

    const v11, 0xefef

    goto :goto_2

    :sswitch_b
    const v1, 0xd246

    const v11, 0xd246

    :goto_2
    const-string v1, "\u1a7a\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x6243

    const v18, 0x668c5f91

    xor-int v5, v5, v18

    const v18, 0x48d4c63a

    goto/16 :goto_6

    :sswitch_c
    mul-int v1, v7, v10

    sub-int/2addr v1, v9

    if-lez v1, :cond_6

    const-string v1, "\u073f\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2739

    const v18, 0x101aef4d

    xor-int v5, v5, v18

    const v18, -0x7ec95cc2

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06da\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x7577

    const v18, 0x18ee8dd5

    xor-int v5, v5, v18

    const v18, -0x1b2ae4ab

    goto/16 :goto_6

    :sswitch_d
    const v1, 0x369b5e1

    add-int v9, v8, v1

    const/16 v10, 0x3b1e

    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06db\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x2ed3

    const v18, 0x74db72e3

    xor-int v5, v5, v18

    const v18, -0x5d3b7ff9

    goto/16 :goto_6

    :sswitch_e
    aget-short v7, v19, v6

    mul-int v8, v7, v7

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "\u073a\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5729

    const v18, 0x4432e735

    xor-int v5, v5, v18

    const v18, 0x58478729

    goto/16 :goto_6

    :sswitch_f
    const/4 v6, 0x7

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v1, :cond_a

    :cond_9
    :goto_3
    const-string v1, "\u1a78\u073f"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x75

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x745b

    const v18, -0x6e2869fe

    xor-int v5, v5, v18

    const v18, 0x3e356d4e

    goto/16 :goto_6

    :cond_a
    const-string v1, "\u06e4\u06eb"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x377f

    const v18, -0xd9b6a3f

    xor-int v5, v5, v18

    const v18, -0x7106e50a

    goto :goto_6

    :sswitch_10
    sget-object v19, Ll/᩵۟᩺;->᩶ۙۗ:[S

    .line 18
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2cbb

    const v18, 0x7e86d853

    xor-int v5, v5, v18

    const v18, 0x40734c72

    goto :goto_6

    :cond_c
    const-string v1, "\u06ec\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x65

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x7f5d

    const v18, 0x54260d4b

    xor-int v5, v5, v18

    const v18, 0x27d1ed39

    goto :goto_6

    :sswitch_11
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_d

    :goto_5
    const-string v1, "\u1a7b\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x79cb

    const v18, 0x123870

    xor-int v5, v5, v18

    const v18, 0x66e81553

    goto :goto_6

    :cond_d
    const-string v1, "\u073f\u06e7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x5d11

    const v18, -0x3940406b

    xor-int v5, v5, v18

    const v18, -0x41871f85

    :goto_6
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c146508 -> :sswitch_11
        -0x7740e59a -> :sswitch_a
        -0x72087bb4 -> :sswitch_2
        -0x70da02ca -> :sswitch_10
        -0x6e0d717a -> :sswitch_e
        -0x566be2e2 -> :sswitch_0
        -0x48acc27a -> :sswitch_5
        -0x46b6091c -> :sswitch_c
        -0x32f80137 -> :sswitch_7
        -0x2706ce13 -> :sswitch_5
        -0x2220c6aa -> :sswitch_7
        -0x1c59b94b -> :sswitch_1
        -0x14fdd397 -> :sswitch_9
        -0x14cae754 -> :sswitch_4
        -0xe8f017a -> :sswitch_a
        -0x1f523a -> :sswitch_4
        0xbdfdcfe -> :sswitch_8
        0x1004fe5e -> :sswitch_9
        0x107e9517 -> :sswitch_c
        0x2545205d -> :sswitch_10
        0x2801dbc5 -> :sswitch_d
        0x2d2c1022 -> :sswitch_e
        0x2d626c35 -> :sswitch_2
        0x36cce166 -> :sswitch_11
        0x4700169a -> :sswitch_b
        0x58c17aa7 -> :sswitch_0
        0x598424e3 -> :sswitch_f
        0x600b2190 -> :sswitch_8
        0x648a78f3 -> :sswitch_3
        0x6afb1d67 -> :sswitch_d
        0x6c505005 -> :sswitch_3
        0x6e14acd9 -> :sswitch_6
        0x724168cd -> :sswitch_6
        0x726c1554 -> :sswitch_1
        0x7b369420 -> :sswitch_f
        0x7cd0f9a1 -> :sswitch_b
    .end sparse-switch
.end method

.method public static final varargs ۙ([Lcom/google/android/material/textfield/TextInputLayout;)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0xc47543

    sget v7, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v8, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v9, "\u06d6\u1a76"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x27bf

    const v11, 0x2be455d

    xor-int/2addr v10, v11

    const v11, 0x3fec6f60

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0x661b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 30
    array-length v0, p0

    .line 28
    sget v9, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v9, :cond_e

    goto/16 :goto_6

    .line 15
    :sswitch_0
    sget v9, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v9, :cond_8

    goto/16 :goto_4

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    sget v9, Ll/ۗ;->֨۬ۖ:I

    if-gez v9, :cond_a

    goto :goto_1

    .line 15
    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v9, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v9, :cond_d

    goto :goto_1

    .line 32
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    :goto_1
    const-string v9, "\u073d\u06d7"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x511f

    const v11, 0x3ef28df8

    xor-int/2addr v10, v11

    const v11, 0x2c7973b7

    goto :goto_0

    .line 24
    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    const/4 p0, 0x0

    return p0

    .line 33
    :sswitch_5
    invoke-static {v5}, Ll/֡᩶;->ܳۛ᩺(Ljava/lang/Object;)V

    invoke-static {v5}, Ll/֫ᩳ;->ᩳۛᩴ(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :sswitch_6
    invoke-static {v3}, Ll/֨۟;->ۡ᩷ۗ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v5

    .line 12
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v9

    if-eqz v9, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v9, "\u06dc\u1a7b"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4b4f

    const v11, 0x5521bfe6

    xor-int/2addr v10, v11

    const v11, -0xca7d8e3

    goto :goto_0

    .line 32
    :sswitch_7
    invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V

    sget v9, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v9, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v9, "\u1a79\u05a8"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x6b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1579

    const v11, 0x295c1973

    xor-int/2addr v10, v11

    const v11, 0x69947b06

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v3}, Ll/֫ۘ;->ۜۧۢ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/֫ܺ;->᩹᩷ۧ(Ljava/lang/Object;)V

    .line 29
    sget v9, Ll/۟;->ۨᩴۛ:I

    if-ltz v9, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v9, "\u1a75\u073a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x79e7

    const v11, 0x19897402

    xor-int/2addr v10, v11

    const v11, -0x256b9dd8

    goto/16 :goto_0

    :sswitch_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 30
    :sswitch_a
    aget-object v3, p0, v2

    .line 31
    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "\u0730\u073f"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0xb

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6d7

    const v11, -0x708a019

    xor-int/2addr v10, v11

    const v11, -0x1a9234ea

    goto/16 :goto_0

    :cond_3
    const-string v9, "\u06dc\u06e2"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x1f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x63e5

    const v11, -0x6d3bef79

    xor-int/2addr v10, v11

    const v11, 0x34b7fed4

    goto/16 :goto_0

    :sswitch_b
    return v1

    :sswitch_c
    if-ge v2, v0, :cond_4

    const-string v9, "\u06eb\u1a7b"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3c03

    const v11, -0x4abdc2c1

    xor-int/2addr v10, v11

    const v11, 0x33a357f8

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u06d9\u06e2"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x57

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x52d7

    const v11, -0x4c234b3d

    xor-int/2addr v10, v11

    const v11, 0x45e9ad41

    goto/16 :goto_0

    :sswitch_d
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    const-string v9, "\u06dc\u1a73"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x1b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x36d1

    const v11, 0x62038463

    xor-int/2addr v10, v11

    const v11, 0x25d645bf

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v9, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v9, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v9, "\u0730\u073d"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x77c5

    const v11, 0x4332e070

    xor-int/2addr v10, v11

    const v11, -0x609be1b5

    goto/16 :goto_0

    :sswitch_f
    sget v9, Ll/۟;->ۨᩴۛ:I

    if-ltz v9, :cond_6

    goto :goto_3

    :cond_6
    const-string v9, "\u06eb\u0733"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x4261

    const v11, -0x1ad71061

    xor-int/2addr v10, v11

    const v11, 0x53d32ee2

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v9

    if-gtz v9, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v9, "\u073a\u06e7"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1bb1

    const v11, 0x6e8de3a6

    xor-int/2addr v10, v11

    const v11, 0x6373514

    goto/16 :goto_0

    .line 26
    :sswitch_11
    sget v9, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v9, :cond_9

    :cond_8
    :goto_3
    const-string v9, "\u06db\u05a8"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x31

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1e55

    const v11, -0x38a76c28

    xor-int/2addr v10, v11

    const v11, 0x6869789a

    goto/16 :goto_0

    :cond_9
    const-string v9, "\u06e1\u06df"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x6d

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x34cf

    const v11, 0x7ed0d0c3

    xor-int/2addr v10, v11

    const v11, -0x63d651d

    goto/16 :goto_0

    .line 23
    :sswitch_12
    sget v9, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v9, :cond_b

    :cond_a
    :goto_4
    const-string v9, "\u05a8\u1a76"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x706b

    const v11, 0x73d647e1

    xor-int/2addr v10, v11

    const v11, 0x2bd1a593

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06ec\u06e4"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2fbb

    const v11, 0x75d86266

    xor-int/2addr v10, v11

    const v11, -0x34fb8ce1    # -8680223.0f

    goto/16 :goto_0

    .line 27
    :sswitch_13
    sget-boolean v9, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v9, :cond_c

    :goto_5
    const-string v9, "\u06d8\u06db"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1a97

    const v11, -0x4dba55e

    xor-int/2addr v10, v11

    const v11, 0xa1c0d2d

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06eb\u1a73"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xfe3

    const v11, -0x1325f422

    xor-int/2addr v10, v11

    const v11, -0x1a6ebdc9

    goto/16 :goto_0

    :cond_d
    :goto_6
    const-string v9, "\u073f\u073d"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x63d3

    const v11, 0x3919d0e3

    xor-int/2addr v10, v11

    const v11, -0x6c98a158

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06d9\u1a7b"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3ea1

    const v11, 0x72f50a34

    xor-int/2addr v10, v11

    const v11, -0x20187dff

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dbd9c0c -> :sswitch_11
        -0x75bd9c6d -> :sswitch_9
        -0x6c8dc552 -> :sswitch_6
        -0x6c2e6b22 -> :sswitch_7
        -0x695e5eb0 -> :sswitch_13
        -0x55b48c1c -> :sswitch_0
        -0x52a3e326 -> :sswitch_12
        -0x467441d1 -> :sswitch_10
        -0x3f3f57e2 -> :sswitch_e
        -0x3c868320 -> :sswitch_8
        -0x36e5f3e6 -> :sswitch_1
        -0x36e14ee7 -> :sswitch_e
        -0x2ff7e71f -> :sswitch_c
        -0x29ddca2b -> :sswitch_d
        -0x1e2afb60 -> :sswitch_4
        -0x1c2915cc -> :sswitch_a
        -0xd666066 -> :sswitch_d
        -0xcd0c550 -> :sswitch_9
        -0x81be2c1 -> :sswitch_7
        0x9aafb25 -> :sswitch_3
        0x10c51e72 -> :sswitch_10
        0x1290ca0a -> :sswitch_11
        0x21d00c66 -> :sswitch_5
        0x234f934c -> :sswitch_6
        0x261a579d -> :sswitch_b
        0x2872d526 -> :sswitch_13
        0x2978752f -> :sswitch_f
        0x435a1bbd -> :sswitch_0
        0x489d81f5 -> :sswitch_2
        0x4f711e6a -> :sswitch_f
        0x6297a1ce -> :sswitch_2
        0x653f591e -> :sswitch_4
        0x69958a51 -> :sswitch_5
        0x6bc4328d -> :sswitch_1
        0x72bef76a -> :sswitch_8
        0x7599417c -> :sswitch_3
        0x76670393 -> :sswitch_c
        0x7ae56a9b -> :sswitch_a
        0x7c2e2207 -> :sswitch_b
        0x7f5cf08c -> :sswitch_12
    .end sparse-switch
.end method
