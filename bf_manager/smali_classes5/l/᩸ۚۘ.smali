.class public final Ll/᩸ۚۘ;
.super Ll/ۢܳۖ;
.source "K3YG"


# static fields
.field private static final ᩴܳܰ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩸ۚۘ;->ᩴܳܰ:[S

    return-void

    :array_0
    .array-data 2
        0xf74s
        0x6b05s
        0x6b19s
        0x6b00s
        0x6b12s
        0x6b1cs
        0x6b1bs
        0x6b5bs
        0x6b19s
        0x6b1as
        0x6b12s
    .end array-data
.end method


# virtual methods
.method public final ܰ()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x2e46148f

    sget v11, Ll/֫۟;->᩸ᩴܿ:I

    sget v12, Ll/֡ܳ;->֡۠ۧ:I

    const-string v13, "\u0733\u1a7b"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1167

    const v15, 0x13429c4e

    xor-int/2addr v14, v15

    const v15, -0x60d0b7db

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0x5d5

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v13

    if-ltz v13, :cond_b

    goto/16 :goto_5

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v13, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v13, :cond_a

    goto :goto_1

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget-boolean v13, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v13, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v13, "\u06d6\u06e0"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x2b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x44a5

    const v15, 0x7eaf97d9

    xor-int/2addr v14, v15

    const v15, -0x76e0574

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v13, :cond_c

    goto/16 :goto_4

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0xa

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֨ۧ;->᩻᩵᩵([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/᩸ۚۘ;->ᩴܳܰ:[S

    const/4 v9, 0x1

    sget-boolean v13, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v13, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v13, "\u06d9\u06df"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x5d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3a95

    const v15, -0x82481c2

    xor-int/2addr v14, v15

    const v15, -0x72f5e04c

    goto :goto_0

    :sswitch_7
    const/16 v7, 0x6078

    goto :goto_2

    :sswitch_8
    const/16 v7, 0x6b75

    :goto_2
    const-string v13, "\u06e0\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3897

    const v15, -0x34337380    # -2.6810624E7f

    xor-int/2addr v14, v15

    const v15, 0x5330ad4f

    goto/16 :goto_0

    :sswitch_9
    mul-int v13, v6, v6

    sub-int/2addr v13, v4

    if-gez v13, :cond_2

    const-string v13, "\u06eb\u1a7b"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5c51

    const v15, -0x25646e77

    xor-int/2addr v14, v15

    const v15, -0x238d7598

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u06d8\u05ab"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1229

    const v15, -0x5b7acb1b

    xor-int/2addr v14, v15

    const v15, 0x8340a9c

    goto/16 :goto_0

    :sswitch_a
    add-int v6, v2, v5

    .line 4
    sget v13, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v13, :cond_3

    goto :goto_3

    :cond_3
    const-string v13, "\u1a76\u06d6"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xa17

    const v15, -0x101a786f

    xor-int/2addr v14, v15

    const v15, -0x143211f4

    goto/16 :goto_0

    :sswitch_b
    mul-int v4, v2, v3

    const/16 v5, 0x35b4

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v13

    if-eqz v13, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v13, "\u06e1\u06df"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x53

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x232d

    const v15, 0x77c64b1b

    xor-int/2addr v14, v15

    const v15, 0x5d199259

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    const v3, 0xd6d0

    .line 0
    sget-boolean v13, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v13, :cond_5

    :goto_3
    const-string v13, "\u1a7a\u06e4"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x7

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x40d1

    const v15, -0x6a66c943

    xor-int/2addr v14, v15

    const v15, -0x6f196ac2

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u073f\u0730"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x7

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x22fd

    const v15, 0x1e893e15

    xor-int/2addr v14, v15

    const v15, 0x113c657d

    goto/16 :goto_0

    :sswitch_d
    const/4 v1, 0x0

    .line 4
    sget v13, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v13, :cond_6

    goto :goto_4

    :cond_6
    const-string v13, "\u0736\u06ec"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0xd

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6b1d

    const v15, 0x1b33ccfb

    xor-int/2addr v14, v15

    const v15, -0x38a63456

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget v13, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v13, :cond_7

    goto :goto_4

    :cond_7
    const-string v13, "\u0736\u1a75"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x433

    const v15, -0x1ee858b0

    xor-int/2addr v14, v15

    const v15, -0x6c2df054

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v13, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v13, "\u0733\u06da"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x33

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x70bb

    const v15, -0x1493d17e

    xor-int/2addr v14, v15

    const v15, -0x24d32fe

    goto/16 :goto_0

    .line 1
    :sswitch_10
    sget v13, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v13, :cond_9

    :goto_4
    const-string v13, "\u0736\u06eb"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x35

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1af

    const v15, 0x7287722

    xor-int/2addr v14, v15

    const v15, -0x6c2f872c

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u0730\u1a74"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x65

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x62a1

    const v15, -0x59fecf84

    xor-int/2addr v14, v15

    const v15, 0x1b5630c1

    goto/16 :goto_0

    :cond_a
    :goto_5
    const-string v13, "\u06e4\u06e2"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4f53

    const v15, -0x7ad63cf3

    xor-int/2addr v14, v15

    const v15, 0x544c9688

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06e2\u1a77"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x53

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xcab

    const v15, -0x43ebb0a0

    xor-int/2addr v14, v15

    const v15, 0x39ff358c

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/᩸ۚۘ;->ᩴܳܰ:[S

    .line 4
    sget v13, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v13, :cond_d

    :cond_c
    :goto_6
    const-string v13, "\u06d6\u05a1"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xaf9

    const v15, -0x1bc4cf57

    xor-int/2addr v14, v15

    const v15, 0x6738b827

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06eb\u06df"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x65a9

    const v15, -0x193b1327

    xor-int/2addr v14, v15

    const v15, 0x517af8fc

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fdc9ea3 -> :sswitch_a
        -0x76eefbb5 -> :sswitch_2
        -0x75adb8bf -> :sswitch_5
        -0x6fea345d -> :sswitch_b
        -0x6ad6d1af -> :sswitch_d
        -0x6ad2cda1 -> :sswitch_9
        -0x431f9348 -> :sswitch_6
        -0x3cc95997 -> :sswitch_1
        -0x3a612232 -> :sswitch_f
        -0x38b2f956 -> :sswitch_11
        -0x356a44dd -> :sswitch_b
        -0x33e27e67 -> :sswitch_4
        -0x2a049080 -> :sswitch_0
        -0x1e13f63e -> :sswitch_f
        -0x1238710e -> :sswitch_2
        -0xf3a85aa -> :sswitch_1
        -0xaaed2fa -> :sswitch_a
        -0x41ff45e -> :sswitch_c
        0x5b3bd1b -> :sswitch_0
        0x74208d2 -> :sswitch_d
        0x8dd655a -> :sswitch_9
        0xa30e9b6 -> :sswitch_7
        0xb52c191 -> :sswitch_6
        0x10cb39ae -> :sswitch_8
        0x207552d2 -> :sswitch_4
        0x21a3de94 -> :sswitch_11
        0x2f0262ba -> :sswitch_e
        0x3f5ad68b -> :sswitch_3
        0x45840d9f -> :sswitch_10
        0x45d5efb9 -> :sswitch_5
        0x4772b847 -> :sswitch_3
        0x4b089607 -> :sswitch_7
        0x50566468 -> :sswitch_8
        0x61e21c06 -> :sswitch_10
        0x69ac3fe3 -> :sswitch_e
        0x761073bb -> :sswitch_c
    .end sparse-switch
.end method
