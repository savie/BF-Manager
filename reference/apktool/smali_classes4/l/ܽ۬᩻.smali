.class public final Ll/ܽ۬᩻;
.super Ljava/lang/Object;
.source "R5PD"


# static fields
.field private static final ᩷֨᩺:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ۬᩻;->᩷֨᩺:[S

    return-void

    :array_0
    .array-data 2
        0x4f5s
        -0x38bbs
        -0x38f3s
        -0x38efs
        -0x38f0s
        -0x38f6s
        -0x38b9s
        0x16cbs
        0xb71s
        0xb39s
        0xb25s
        0xb24s
        0xb3es
        0xb73s
    .end array-data
.end method

.method public static final ۙ(Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x643b0762

    sget v2, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v3, Ll/ۧ;->ۨۗܰ:I

    const-string v4, "\u1a7a\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x338f

    const v6, -0x410b8872

    xor-int/2addr v5, v6

    const v6, 0x239a7f5f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x311d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 2
    sget v4, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v4, :cond_5

    goto/16 :goto_1

    .line 62
    :sswitch_0
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a76\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x24ff

    const v6, -0x24c70b8d

    xor-int/2addr v5, v6

    const v6, 0x13d57e07

    goto :goto_0

    :sswitch_1
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v4, :cond_b

    goto/16 :goto_2

    .line 13
    :sswitch_2
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-lez v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a7a\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a2b

    const v6, -0x345fb5e4    # -2.1009464E7f

    xor-int/2addr v5, v6

    const v6, 0x5a4a8297

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto/16 :goto_2

    .line 39
    :sswitch_4
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    return-void

    .line 80
    :sswitch_5
    new-instance v1, Ll/ܺ۬᩻;

    invoke-direct {v1, p0}, Ll/ܺ۬᩻;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 93
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void

    .line 8
    :sswitch_6
    invoke-static {v0}, Ll/ۗ᩶;->ܳۛۘ(Ljava/lang/Object;)V

    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u06e0\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x9bb

    const v6, 0x38130823

    xor-int/2addr v5, v6

    const v6, -0x3303c07b

    goto :goto_0

    .line 52
    :sswitch_7
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06e2\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6bb1

    const v6, -0x2ddd42e6

    xor-int/2addr v5, v6

    const v6, 0x5b452435

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1771

    const v6, -0x43dc3c98

    xor-int/2addr v5, v6

    const v6, -0x54d2e9b4

    goto/16 :goto_0

    :goto_1
    const-string v4, "\u06df\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x32e3

    const v6, 0x5328e951

    xor-int/2addr v5, v6

    const v6, -0x15c68ada

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073a\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3cad

    const v6, 0x4e2cbd6f    # 7.2452397E8f

    xor-int/2addr v5, v6

    const v6, -0x552d66f

    goto/16 :goto_0

    .line 27
    :sswitch_9
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v4, "\u06da\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x34b1

    const v6, -0x4cc3b8e9

    xor-int/2addr v5, v6

    const v6, -0x283de250

    goto/16 :goto_0

    .line 22
    :sswitch_a
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u073f\u06e1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4119

    const v6, 0x1739833a

    xor-int/2addr v5, v6

    const v6, 0x466e5098

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u06e0\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1dd1

    const v6, -0x50ad8831

    xor-int/2addr v5, v6

    const v6, -0x697f61

    goto/16 :goto_0

    .line 12
    :sswitch_c
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u05a1\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x40bd

    const v6, -0x33499272    # -9.564478E7f

    xor-int/2addr v5, v6

    const v6, 0x4fc8c755

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v4

    if-nez v4, :cond_a

    :goto_2
    const-string v4, "\u073f\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4a47

    const v6, 0x33ed83bd

    xor-int/2addr v5, v6

    const v6, -0x21109382

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a79\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d2f

    const v6, 0x4342a11b

    xor-int/2addr v5, v6

    const v6, -0x1f757588

    goto/16 :goto_0

    .line 8
    :sswitch_e
    invoke-static {p0}, Ll/֡ܳ;->֡ܺ᩻(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5d5d

    const v6, -0xb7f7862

    xor-int/2addr v5, v6

    const v6, -0x6cbc8fc8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0730\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x27e5

    const v6, -0x25e4a491

    xor-int/2addr v5, v6

    const v6, -0x20365854

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ecbfc6f -> :sswitch_1
        -0x6f8e5d12 -> :sswitch_9
        -0x6581256e -> :sswitch_0
        -0x649e3b2d -> :sswitch_d
        -0x63ad39e1 -> :sswitch_d
        -0x61b71ff3 -> :sswitch_8
        -0x5d156603 -> :sswitch_9
        -0x57e62956 -> :sswitch_5
        -0x55c4a1b3 -> :sswitch_3
        -0x537bb52e -> :sswitch_4
        -0x47745707 -> :sswitch_a
        -0x46d6e4a5 -> :sswitch_a
        -0x46648f32 -> :sswitch_6
        -0x4262e6c3 -> :sswitch_e
        -0x376ccc78 -> :sswitch_6
        -0x254deed8 -> :sswitch_3
        -0x74b244 -> :sswitch_b
        0xaba416a -> :sswitch_c
        0xca10e93 -> :sswitch_1
        0xdb0fbba -> :sswitch_8
        0x1d708c2d -> :sswitch_2
        0x2d690ebe -> :sswitch_4
        0x3317bf45 -> :sswitch_b
        0x351a9a5f -> :sswitch_7
        0x39cfc169 -> :sswitch_7
        0x477c76df -> :sswitch_e
        0x5972ec2e -> :sswitch_2
        0x6e603450 -> :sswitch_5
        0x726b8364 -> :sswitch_c
        0x78db9cd0 -> :sswitch_0
    .end sparse-switch
.end method

.method public static final ۙ(Lcom/google/android/material/textfield/TextInputLayout;I)V
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

    const v14, 0x3d66496a

    sget v15, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v16, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v17, "\u06e7\u06db"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    mul-int/lit8 v17, v17, -0x6f

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, -0xd25

    const v19, -0x3e54f0d6

    xor-int v1, v1, v19

    const v19, -0x6039b3f

    xor-int v17, v17, v19

    move-object/from16 v19, v3

    move-object v12, v11

    move/from16 v18, v17

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x3d66496a

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v17, v16

    mul-int/lit16 v4, v4, 0x3b25

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    .line 9
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v1

    if-gtz v1, :cond_4

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v1

    if-eqz v1, :cond_6

    goto/16 :goto_1

    .line 1
    :sswitch_1
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto/16 :goto_4

    .line 17
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    return-void

    .line 19
    :sswitch_4
    invoke-static/range {p0 .. p0}, Ll/֡ܳ;->֡ܺ᩻(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ᩶;->ܳۛۘ(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۖ;->᩻ۚۘ(Ljava/lang/Object;)Z

    return-void

    .line 18
    :sswitch_5
    invoke-virtual {v3}, Landroid/widget/EditText;->selectAll()V

    .line 3
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-ltz v1, :cond_1

    :cond_0
    const-string v1, "\u0730\u06e1"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x6b

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x6613

    const v18, 0x29a87ca7

    xor-int v4, v4, v18

    const v18, -0xcfc5bb8

    goto/16 :goto_5

    :cond_1
    const-string v1, "\u06e8\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x6123

    const v18, 0x79c3b22d

    xor-int v4, v4, v18

    const v18, 0x30de778d

    goto/16 :goto_5

    .line 17
    :sswitch_6
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 18
    invoke-static/range {p0 .. p0}, Ll/֡ܳ;->֡ܺ᩻(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v3

    invoke-static {v3}, Ll/֨ۨ;->ܺ᩵۠(Ljava/lang/Object;)V

    .line 17
    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u073a\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x19

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x700f

    const v18, 0x7bbc96b

    xor-int v4, v4, v18

    const v18, 0x3fc9f49a

    goto/16 :goto_5

    .line 16
    :sswitch_7
    invoke-static/range {p1 .. p1}, Ll/ۗ᩵;->۬֫ۛ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v2, 0x1

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u1a78\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x4c55

    const v18, -0x700b230d

    xor-int v4, v4, v18

    const v18, 0x7d8d6c8

    goto/16 :goto_5

    .line 0
    :sswitch_8
    invoke-static {v12, v13, v14, v11}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܽ;->᩹ᩳܶ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_5

    :cond_4
    :goto_1
    const-string v1, "\u06e7\u06e0"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x79

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x1e1f

    const v18, -0x8ff9b82

    xor-int v4, v4, v18

    const v18, -0x66e7dc54

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06da\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x7fab

    const v18, 0x4dbd753e

    xor-int v4, v4, v18

    const v18, -0x5ee0e3fd

    goto/16 :goto_5

    :sswitch_9
    sget-object v12, Ll/ܽ۬᩻;->᩷֨᩺:[S

    const/4 v13, 0x1

    const/4 v14, 0x6

    .line 4
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_7

    :cond_6
    const-string v1, "\u06d6\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0xbbf

    const v18, -0x3cc24dc9

    xor-int v4, v4, v18

    const v18, 0x11503f2c

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u06e4\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x4f

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x3221

    const v18, 0x15ff2236

    xor-int v4, v4, v18

    const v18, -0x6689816b

    goto/16 :goto_5

    :sswitch_a
    const v1, 0xa80e

    const v11, 0xa80e

    goto :goto_2

    :sswitch_b
    const v1, 0xc779

    const v11, 0xc779

    :goto_2
    const-string v1, "\u1a7a\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x5737

    const v18, 0x3f881e47

    xor-int v4, v4, v18

    const v18, 0x7ff77246

    goto/16 :goto_5

    :sswitch_c
    add-int v1, v6, v10

    mul-int v1, v1, v1

    sub-int/2addr v1, v9

    if-lez v1, :cond_8

    const-string v1, "\u06da\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x3241

    const v18, -0xb24a3e5

    xor-int v4, v4, v18

    const v18, 0xea3b1e4

    goto/16 :goto_5

    :cond_8
    const-string v1, "\u06d8\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x3b

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x7d99

    const v18, 0x6bbbc763

    xor-int v4, v4, v18

    const v18, 0xecf0a53

    goto/16 :goto_5

    :sswitch_d
    add-int v1, v7, v8

    add-int v9, v1, v1

    const/16 v10, 0x2364

    .line 15
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v1

    if-gtz v1, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v1, "\u1a73\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x5f

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2693

    const v18, 0x5fb9290a

    xor-int v4, v4, v18

    const v18, 0x36adf8fd

    goto/16 :goto_5

    :sswitch_e
    aget-short v6, v19, v5

    mul-int v7, v6, v6

    const v8, 0x4e47f10

    .line 8
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_a

    goto :goto_3

    :cond_a
    const-string v1, "\u06e8\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x1e51

    const v18, -0x79cae6e9

    xor-int v4, v4, v18

    const v18, -0xd38b0b2

    goto/16 :goto_5

    :sswitch_f
    const/4 v5, 0x0

    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_b

    :goto_3
    const-string v1, "\u06d9\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x2b2f

    const v18, 0x62b804b4

    xor-int v4, v4, v18

    const v18, -0x5dee2a64

    goto :goto_5

    :cond_b
    const-string v1, "\u05ab\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x9

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x3d89

    const v18, -0x26458fbc

    xor-int v4, v4, v18

    const v18, 0x5373b939

    goto :goto_5

    :sswitch_10
    sget-object v19, Ll/ܽ۬᩻;->᩷֨᩺:[S

    sget-boolean v1, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v1, :cond_c

    goto :goto_4

    :cond_c
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x2cbb

    const v18, 0xe02a0a1

    xor-int v4, v4, v18

    const v18, 0x6dae946

    goto :goto_5

    :sswitch_11
    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_d

    :goto_4
    const-string v1, "\u05a1\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x3151

    const v18, -0x2c41c98d

    xor-int v4, v4, v18

    const v18, -0x3cfaf528

    goto :goto_5

    :cond_d
    const-string v1, "\u1a76\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x73e1

    const v18, 0x42ee4b6f

    xor-int v4, v4, v18

    const v18, 0x6c8401d5

    :goto_5
    xor-int v18, v1, v18

    move v1, v4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75f5b071 -> :sswitch_f
        -0x717d2518 -> :sswitch_0
        -0x717871ef -> :sswitch_4
        -0x6eee1dda -> :sswitch_e
        -0x6e435e78 -> :sswitch_4
        -0x6d34dcea -> :sswitch_6
        -0x6c350424 -> :sswitch_f
        -0x644c5ba0 -> :sswitch_a
        -0x539c61e0 -> :sswitch_d
        -0x4cc18da5 -> :sswitch_e
        -0x4271d835 -> :sswitch_d
        -0x35c3eb98 -> :sswitch_5
        -0x32a802bb -> :sswitch_7
        -0x246fa640 -> :sswitch_11
        -0x1510e441 -> :sswitch_10
        -0xc8599a6 -> :sswitch_8
        0x112e1aae -> :sswitch_8
        0x126e8e8c -> :sswitch_2
        0x23ce8f2e -> :sswitch_10
        0x30bdfc0b -> :sswitch_9
        0x32013002 -> :sswitch_2
        0x340f3c61 -> :sswitch_7
        0x3701c2d7 -> :sswitch_0
        0x3b9624b5 -> :sswitch_3
        0x400d6f26 -> :sswitch_c
        0x547a6f60 -> :sswitch_b
        0x56150c95 -> :sswitch_3
        0x5629f956 -> :sswitch_b
        0x57c49343 -> :sswitch_6
        0x5a06f4d0 -> :sswitch_c
        0x5e195036 -> :sswitch_1
        0x5ff57b9c -> :sswitch_1
        0x62851ad7 -> :sswitch_a
        0x65bcfdd8 -> :sswitch_9
        0x66d71385 -> :sswitch_11
        0x7e7f462d -> :sswitch_5
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

    const v14, 0x1729061

    sget v15, Ll/֡᩵;->ۤܳ۬:I

    sget v16, Ll/᩺;->۫۬۫:I

    const-string v17, "\u1a7b\u1a76"

    invoke-static/range {v17 .. v17}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v16

    xor-int v1, v17, v15

    mul-int/lit16 v1, v1, 0x72bd

    const v19, 0x3920f1

    xor-int v1, v1, v19

    const v19, -0x52159e9b

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

    const v17, 0x1729061

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v17, v15

    mul-int/lit16 v5, v5, -0x7203

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    aget-short v7, v19, v6

    const/16 v8, 0xfa4

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_9

    goto/16 :goto_3

    .line 25
    :sswitch_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-gez v1, :cond_b

    goto :goto_1

    .line 19
    :sswitch_1
    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v1, :cond_4

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_1

    goto/16 :goto_3

    .line 25
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto/16 :goto_3

    .line 7
    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    return-void

    .line 26
    :sswitch_5
    invoke-static/range {p0 .. p0}, Ll/֡ܳ;->֡ܺ᩻(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Ll/ۗ᩶;->ܳۛۘ(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/ۖ;->᩻ۚۘ(Ljava/lang/Object;)Z

    return-void

    .line 25
    :sswitch_6
    invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V

    .line 4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v1, "\u1a79\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x7f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x2e21

    const v18, -0x3126023

    xor-int v5, v5, v18

    const v18, -0x4d1e43fe

    goto/16 :goto_6

    .line 24
    :sswitch_7
    invoke-virtual {v0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 25
    invoke-static/range {p0 .. p0}, Ll/᩶;->ᩴܶۗ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۨ;->ܺ᩵۠(Ljava/lang/Object;)V

    .line 10
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_2

    :cond_1
    :goto_1
    const-string v1, "\u1a75\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x2e1

    const v18, 0x26bb81c2

    xor-int v5, v5, v18

    const v18, 0x7abc040d

    goto/16 :goto_6

    :cond_2
    const-string v1, "\u1a73\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x53

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5a3d

    const v18, 0x2a02c797

    xor-int v5, v5, v18

    const v18, -0x313f8c3f

    goto/16 :goto_6

    .line 0
    :sswitch_8
    invoke-static {v0, v2}, Ll/ۗ᩺;->֫᩶֫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    .line 16
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06e0\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x2129

    const v18, -0x592b39f8

    xor-int v5, v5, v18

    const v18, 0x69da6b43

    goto/16 :goto_6

    .line 0
    :sswitch_9
    invoke-static {v12, v13, v14, v11}, Ll/ۖܰ;->۬ۛܳ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 10
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    const-string v1, "\u05a1\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x15

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x4793

    const v18, -0x4c8e71a3

    xor-int v5, v5, v18

    const v18, -0x2af86514

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u06db\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x5ab3

    const v18, -0x22c07039

    xor-int v5, v5, v18

    const v18, -0x444559ff

    goto/16 :goto_6

    .line 0
    :sswitch_a
    sget-object v12, Ll/ܽ۬᩻;->᩷֨᩺:[S

    const/16 v13, 0x8

    const/4 v14, 0x6

    .line 13
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u05ab\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x5

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x20b5

    const v18, -0x229d3447

    xor-int v5, v5, v18

    const v18, 0x27bef580

    goto/16 :goto_6

    :sswitch_b
    const v1, 0xe443

    const v11, 0xe443

    goto :goto_2

    :sswitch_c
    const/16 v1, 0xb4d

    const/16 v11, 0xb4d

    :goto_2
    const-string v1, "\u06e2\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x690b

    const v18, -0x14bc63a7

    xor-int v5, v5, v18

    const v18, -0x4689111d

    goto/16 :goto_6

    :sswitch_d
    mul-int v1, v10, v10

    sub-int/2addr v1, v9

    if-gez v1, :cond_7

    const-string v1, "\u06df\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x2d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x19f1

    const v18, 0x71b5b59d    # 1.799563E30f

    xor-int v5, v5, v18

    const v18, -0x12336830

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u05ab\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x20ed

    const v18, -0x17193f69

    xor-int v5, v5, v18

    const v18, -0x7e6fc6da

    goto/16 :goto_6

    :sswitch_e
    mul-int v9, v7, v8

    add-int/lit16 v10, v7, 0x3e9

    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    const-string v1, "\u06ec\u06e7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x19

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x7729

    const v18, 0x7ed681b5

    xor-int v5, v5, v18

    const v18, 0x3296cc4e

    goto/16 :goto_6

    :cond_9
    const-string v1, "\u06e2\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x387

    const v18, 0x4f5c3e3b

    xor-int v5, v5, v18

    const v18, -0x4946152f

    goto/16 :goto_6

    :sswitch_f
    const/4 v6, 0x7

    .line 2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v1

    if-gtz v1, :cond_a

    :goto_3
    const-string v1, "\u06e8\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x7ee1

    const v18, -0x67982247

    xor-int v5, v5, v18

    const v18, -0xdd4f8e1

    goto/16 :goto_6

    :cond_a
    const-string v1, "\u06dc\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x15

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x4bab

    const v18, -0x24da7013

    xor-int v5, v5, v18

    const v18, 0x6b4264d7

    goto :goto_6

    :sswitch_10
    sget-object v19, Ll/ܽ۬᩻;->᩷֨᩺:[S

    sget-boolean v1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u1a79\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3d33

    const v18, 0x2f4116a2

    xor-int v5, v5, v18

    const v18, -0x29b11426

    goto :goto_6

    :cond_c
    const-string v1, "\u06d9\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x51

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x205d

    const v18, 0x2f885bad

    xor-int v5, v5, v18

    const v18, 0x56365342

    goto :goto_6

    :sswitch_11
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_d

    :goto_5
    const-string v1, "\u06e7\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1b15

    const v18, -0x53796260

    xor-int v5, v5, v18

    const v18, 0x3b3f724c

    goto :goto_6

    :cond_d
    const-string v1, "\u06e2\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x71

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x11a5

    const v18, -0x2360c545

    xor-int v5, v5, v18

    const v18, -0x5dca10bf

    :goto_6
    xor-int v18, v1, v18

    move v1, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c6a9ecb -> :sswitch_a
        -0x791fa3e6 -> :sswitch_1
        -0x75861c07 -> :sswitch_b
        -0x68f58258 -> :sswitch_11
        -0x5dc48cc7 -> :sswitch_2
        -0x47d09177 -> :sswitch_5
        -0x44106bea -> :sswitch_f
        -0x37375bfc -> :sswitch_4
        -0x2fa6cfb6 -> :sswitch_8
        -0x21fc768c -> :sswitch_4
        -0x18dfb3ac -> :sswitch_6
        -0x168785c3 -> :sswitch_f
        -0xf95550c -> :sswitch_3
        -0x1ccf51d -> :sswitch_9
        0x1b67713 -> :sswitch_2
        0x1dcd1ae -> :sswitch_0
        0x2198d34 -> :sswitch_e
        0xb451a5b -> :sswitch_c
        0xd51c695 -> :sswitch_d
        0x13203343 -> :sswitch_c
        0x267b4621 -> :sswitch_9
        0x2814197c -> :sswitch_10
        0x2b8f344f -> :sswitch_d
        0x316fe894 -> :sswitch_8
        0x3574c4fa -> :sswitch_6
        0x380221ff -> :sswitch_7
        0x3c6ca31e -> :sswitch_e
        0x43ceb855 -> :sswitch_b
        0x52613da2 -> :sswitch_5
        0x5339e4d2 -> :sswitch_7
        0x5422e118 -> :sswitch_a
        0x5c478ae1 -> :sswitch_10
        0x62404847 -> :sswitch_3
        0x79973cda -> :sswitch_11
        0x7cbceefa -> :sswitch_1
        0x7e83acbe -> :sswitch_0
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

    const v6, -0x524d09f0

    sget v7, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    const-string v9, "\u06d6\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x31

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x307

    const v11, 0x19337f0e

    xor-int/2addr v10, v11

    const v11, 0x4cdb5da7    # 1.1501087E8f

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, 0x3847

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v9

    if-lez v9, :cond_c

    goto :goto_1

    :sswitch_0
    sget v9, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v9, :cond_5

    goto/16 :goto_4

    :sswitch_1
    sget v9, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v9, :cond_a

    goto :goto_1

    .line 24
    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    :goto_1
    const-string v9, "\u05a8\u06eb"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x27d3

    const v11, 0x29c6892b

    xor-int/2addr v10, v11

    const v11, -0x7c2bdf52

    goto :goto_0

    .line 29
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    const/4 p0, 0x0

    return p0

    .line 33
    :sswitch_4
    invoke-static {v5}, Ll/ۗ᩶;->ܳۛۘ(Ljava/lang/Object;)V

    invoke-static {v5}, Ll/ۖ;->᩻ۚۘ(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :sswitch_5
    invoke-static {v3}, Ll/᩶;->ᩴܶۗ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v5

    .line 31
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v9

    if-ltz v9, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v9, "\u06e8\u06d8"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x63

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4493

    const v11, -0x1ae8e0ec

    xor-int/2addr v10, v11

    const v11, -0x690c69a3

    goto :goto_0

    .line 32
    :sswitch_6
    invoke-virtual {v4}, Landroid/widget/EditText;->selectAll()V

    sget v9, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v9, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v9, "\u1a76\u1a76"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1b59

    const v11, -0x36f4277b

    xor-int/2addr v10, v11

    const v11, 0x5487aa2b

    goto/16 :goto_0

    :sswitch_7
    invoke-static {v3}, Ll/֡ܳ;->֡ܺ᩻(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    invoke-static {v4}, Ll/֨ۨ;->ܺ᩵۠(Ljava/lang/Object;)V

    .line 13
    sget v9, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v9, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v9, "\u0733\u06d6"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x61bb

    const v11, 0x3d19bf0

    xor-int/2addr v10, v11

    const v11, 0x937f7f6

    goto/16 :goto_0

    :sswitch_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 30
    :sswitch_9
    aget-object v3, p0, v2

    .line 31
    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->isErrorEnabled()Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "\u073d\u06db"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x7859

    const v11, 0x11de07e

    xor-int/2addr v10, v11

    const v11, -0x5d2a97c5

    goto/16 :goto_0

    :cond_3
    const-string v9, "\u06eb\u06dc"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x45

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2e05

    const v11, 0x574ea41a

    xor-int/2addr v10, v11

    const v11, -0x660981cb

    goto/16 :goto_0

    :sswitch_a
    return v1

    :sswitch_b
    if-ge v2, v0, :cond_4

    const-string v9, "\u1a79\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x7f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x2961

    const v11, -0x7534a2c2

    xor-int/2addr v10, v11

    const v11, -0x3745d2d3

    goto/16 :goto_0

    :cond_4
    const-string v9, "\u1a76\u073d"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2111

    const v11, -0x2e00e851

    xor-int/2addr v10, v11

    const v11, 0x6d4da029

    goto/16 :goto_0

    :sswitch_c
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    const-string v9, "\u06da\u06e1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x7d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5a15

    const v11, 0x78629a85

    xor-int/2addr v10, v11

    const v11, -0x538d1cea

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v9, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v9, :cond_6

    :cond_5
    const-string v9, "\u06e1\u1a76"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x60c3

    const v11, -0x35783b24    # -4448878.0f

    xor-int/2addr v10, v11

    const v11, 0x203fe661

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u1a76\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0xd

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3e2d

    const v11, -0x6acaffa4

    xor-int/2addr v10, v11

    const v11, -0x68593fe3

    goto/16 :goto_0

    :sswitch_e
    sget v9, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v9, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v9, "\u06df\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4a99

    const v11, -0x6bffbc3f

    xor-int/2addr v10, v11

    const v11, -0x3cc1871b

    goto/16 :goto_0

    :sswitch_f
    sget v9, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v9, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v9, "\u06e1\u1a77"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x49

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x11b

    const v11, 0x7b4ffd1a

    xor-int/2addr v10, v11

    const v11, -0x197c3910

    goto/16 :goto_0

    .line 13
    :sswitch_10
    sget v9, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v9, :cond_9

    goto :goto_4

    :cond_9
    const-string v9, "\u1a76\u1a7b"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3d17

    const v11, 0x9a04f8

    xor-int/2addr v10, v11

    const v11, 0xe1a37ff

    goto/16 :goto_0

    :sswitch_11
    sget v9, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v9, :cond_b

    :cond_a
    :goto_3
    const-string v9, "\u1a77\u05a8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x661b

    const v11, 0x221c11e0

    xor-int/2addr v10, v11

    const v11, -0x3cb58017

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u06db\u06df"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x5b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x24c5

    const v11, -0x740a5baa

    xor-int/2addr v10, v11

    const v11, -0x6bb85b9

    goto/16 :goto_0

    :sswitch_12
    sget v9, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v9, :cond_d

    :cond_c
    :goto_4
    const-string v9, "\u06d6\u0733"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5691

    const v11, -0x15e47db8    # -4.6999684E25f

    xor-int/2addr v10, v11

    const v11, 0x7fe102ca

    goto/16 :goto_0

    :cond_d
    const-string v9, "\u06e2\u05ab"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x13

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1571

    const v11, -0x3f11908b

    xor-int/2addr v10, v11

    const v11, 0x74655e6e

    goto/16 :goto_0

    .line 30
    :sswitch_13
    array-length v0, p0

    .line 19
    sget v9, Ll/ۧ;->ۨۗܰ:I

    if-ltz v9, :cond_e

    :goto_5
    const-string v9, "\u06e0\u06e8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x3

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x700d

    const v11, -0x78ffbb6d

    xor-int/2addr v10, v11

    const v11, -0x5771d09

    goto/16 :goto_0

    :cond_e
    const-string v9, "\u06d8\u1a76"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x61

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x635f

    const v11, 0x35dc860

    xor-int/2addr v10, v11

    const v11, -0x546562c9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7491a8d5 -> :sswitch_2
        -0x6e5f6702 -> :sswitch_8
        -0x6b539bb3 -> :sswitch_10
        -0x68579a8f -> :sswitch_1
        -0x4959b9d0 -> :sswitch_a
        -0x465fd2f1 -> :sswitch_0
        -0x45d90f19 -> :sswitch_f
        -0x432724bc -> :sswitch_6
        -0x381b178b -> :sswitch_b
        -0x329088d6 -> :sswitch_e
        -0x316bd153 -> :sswitch_4
        -0x2ddd6b77 -> :sswitch_10
        -0x22d252cf -> :sswitch_b
        -0x206739e5 -> :sswitch_11
        -0x1f5622ff -> :sswitch_3
        -0x1e8152ad -> :sswitch_6
        -0x12cd1fd3 -> :sswitch_9
        -0xbbcde8c -> :sswitch_9
        -0x245fb68 -> :sswitch_2
        -0x2321a3b -> :sswitch_d
        0x228c4829 -> :sswitch_13
        0x25be4960 -> :sswitch_e
        0x30ea385a -> :sswitch_f
        0x397f524f -> :sswitch_12
        0x3ad7c193 -> :sswitch_13
        0x3bcd993b -> :sswitch_8
        0x481064db -> :sswitch_4
        0x4900c6b3 -> :sswitch_11
        0x4a9c33a3 -> :sswitch_7
        0x4b236312 -> :sswitch_d
        0x502f860b -> :sswitch_12
        0x53bddace -> :sswitch_a
        0x55ce7332 -> :sswitch_1
        0x57298c15 -> :sswitch_7
        0x5add6c8b -> :sswitch_c
        0x60f35de4 -> :sswitch_5
        0x665014a7 -> :sswitch_c
        0x68cb925a -> :sswitch_0
        0x6a77a58b -> :sswitch_5
        0x6b9d2a4b -> :sswitch_3
    .end sparse-switch
.end method
