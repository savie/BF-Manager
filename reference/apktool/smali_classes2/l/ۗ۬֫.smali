.class public final synthetic Ll/ۗ۬֫;
.super Ljava/lang/Object;
.source "H6HS"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ۙ:Ll/ۢ۬֫;

.field public final synthetic ۤ:F

.field public final synthetic ᩴ:I

.field public final synthetic ᩷:F

.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۬֫;FFII)V
    .locals 6

    const v0, -0x1bbb564b

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a78\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53a5

    const v5, -0xcaebb39

    xor-int/2addr v4, v5

    const v5, -0x18add2f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xa41

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-gez v3, :cond_a

    goto :goto_1

    .line 1
    :sswitch_2
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u05a8\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x467d

    const v5, 0x2fc377f3

    xor-int/2addr v4, v5

    const v5, -0x38799fde

    goto :goto_0

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p4, p0, Ll/ۗ۬֫;->᩸:I

    iput p5, p0, Ll/ۗ۬֫;->ᩴ:I

    return-void

    :sswitch_6
    iput p3, p0, Ll/ۗ۬֫;->ۤ:F

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_1

    const-string v3, "\u06eb\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3315

    const v5, 0x2410c617

    xor-int/2addr v4, v5

    const v5, 0x13c15208

    goto :goto_0

    :cond_1
    const-string v3, "\u06e1\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x393d

    const v5, 0x1f1df5ed

    xor-int/2addr v4, v5

    const v5, -0x66f4ced5

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_3

    :cond_2
    const-string v3, "\u06e1\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x37ff

    const v5, 0x4e2459b4    # 6.8933555E8f

    xor-int/2addr v4, v5

    const v5, 0x44e1792b

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a75\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5815

    const v5, -0x235abd5f

    xor-int/2addr v4, v5

    const v5, 0x3dc7d389

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u1a7a\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2957

    const v5, -0x3a284f98

    xor-int/2addr v4, v5

    const v5, -0x73bf363f

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1d55

    const v5, -0x4fc8be13

    xor-int/2addr v4, v5

    const v5, -0x1c908a2f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x79c3

    const v5, 0x1ee01b73

    xor-int/2addr v4, v5

    const v5, -0x172a3b5c

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x21df

    const v5, -0x3dff786f

    xor-int/2addr v4, v5

    const v5, -0x75e84a3a

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    const-string v3, "\u06e4\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1283

    const v5, 0x2eead4f8

    xor-int/2addr v4, v5

    const v5, -0x75e22ce5

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x56a7

    const v5, 0x29e05e1b

    xor-int/2addr v4, v5

    const v5, 0x2ded90fd

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u073d\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a4b

    const v5, 0x34bb63d0

    xor-int/2addr v4, v5

    const v5, 0x5a4b584

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a78\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51ab

    const v5, -0x370c2314

    xor-int/2addr v4, v5

    const v5, -0x5d359bb4

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۗ۬֫;->ۙ:Ll/ۢ۬֫;

    iput p2, p0, Ll/ۗ۬֫;->᩷:F

    .line 4
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u05a8\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x31c5

    const v5, 0x2e4d74c0

    xor-int/2addr v4, v5

    const v5, -0x312bb49

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2963

    const v5, 0x71af3e59

    xor-int/2addr v4, v5

    const v5, -0x622e849e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x641d8c34 -> :sswitch_7
        -0x5df23463 -> :sswitch_5
        -0x5a2b0eb9 -> :sswitch_3
        -0x4fbd0a98 -> :sswitch_a
        -0x460387cb -> :sswitch_7
        -0x41de07fe -> :sswitch_1
        -0x3c334eec -> :sswitch_4
        -0x333d4d08 -> :sswitch_6
        -0x2b9b0275 -> :sswitch_2
        -0x1f1508eb -> :sswitch_e
        -0x13469ab6 -> :sswitch_a
        -0x62011c3 -> :sswitch_6
        -0x4a63592 -> :sswitch_5
        -0x1227e55 -> :sswitch_8
        0xd941b -> :sswitch_2
        0x7fdc15e -> :sswitch_4
        0x18512090 -> :sswitch_b
        0x1f5b868c -> :sswitch_9
        0x25df444f -> :sswitch_e
        0x267e70da -> :sswitch_0
        0x4168ba2c -> :sswitch_c
        0x4d20413b -> :sswitch_b
        0x50cde994 -> :sswitch_d
        0x516f84b6 -> :sswitch_3
        0x52233420 -> :sswitch_9
        0x5418b208 -> :sswitch_8
        0x639c2a65 -> :sswitch_d
        0x6ce24776 -> :sswitch_0
        0x715e5b96 -> :sswitch_1
        0x7cb65181 -> :sswitch_c
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x76ab0cb4

    sget v6, Ll/ۖۗ;->᩻ܳܶ:I

    sget v7, Ll/֡ۢ;->۟֡᩻:I

    const-string v8, "\u06d9\u06e2"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x79

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x789f

    const v10, 0x4525e5f6

    xor-int/2addr v9, v10

    const v10, 0x4946a5e4    # 813662.25f

    xor-int/2addr v8, v10

    move-object v10, v3

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    xor-int v1, v5, v7

    mul-int/lit16 v1, v1, -0x401b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v9

    xor-int v5, v8, v1

    sparse-switch v5, :sswitch_data_0

    .line 4
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v1, :cond_a

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v1, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v1, :cond_8

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-gez v1, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_3

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    return-void

    .line 0
    :sswitch_5
    iget v12, v0, Ll/ۗ۬֫;->ۤ:F

    move-object/from16 v15, p1

    invoke-static/range {v10 .. v15}, Ll/ۢ۬֫;->ۙ(Ll/ۢ۬֫;FFIILandroid/animation/ValueAnimator;)V

    return-void

    :sswitch_6
    iget-object v10, v0, Ll/ۗ۬֫;->ۙ:Ll/ۢ۬֫;

    iget v11, v0, Ll/ۗ۬֫;->᩷:F

    sget v1, Ll/᩺;->۫۬۫:I

    if-gtz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u1a79\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    mul-int/lit8 v1, v1, 0x77

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, -0x12ab

    const v3, -0x1f274a00

    xor-int v9, v2, v3

    const v2, -0x7573825

    goto/16 :goto_5

    :sswitch_7
    iget v14, v0, Ll/ۗ۬֫;->ᩴ:I

    .line 2
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u073f\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v6

    mul-int/lit8 v1, v1, -0x6d

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x5fb

    const v3, -0x47cfbc98

    xor-int v9, v2, v3

    const v2, -0x64390c08

    goto/16 :goto_5

    .line 0
    :sswitch_8
    iget v13, v0, Ll/ۗ۬֫;->᩸:I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u0733\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, 0x41bf

    const v3, 0x509fe5d2

    xor-int v9, v2, v3

    const v2, -0x2428a71d

    goto/16 :goto_5

    .line 1
    :sswitch_9
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_4

    :cond_3
    :goto_1
    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v7

    mul-int/lit8 v1, v1, 0x7f

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, -0x719d

    const v3, 0x27307b4f

    xor-int v9, v2, v3

    const v2, -0x642f3ca0

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06eb\u06db"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v6

    mul-int/lit8 v1, v1, -0x47

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x51df

    const v3, 0x2ad9d478

    xor-int v9, v2, v3

    const v2, -0x68b96c06

    goto/16 :goto_5

    :sswitch_a
    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u073f\u0730"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, 0x224d

    const v3, 0x7343c502

    xor-int v9, v2, v3

    const v2, -0x4b5b60a4

    goto/16 :goto_5

    .line 3
    :sswitch_b
    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_6

    :goto_2
    const-string v1, "\u06dc\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, 0x53fd

    const v3, -0x181cc0cd

    xor-int v9, v2, v3

    const v2, 0x30d4facb

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u1a73\u1a7b"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v6

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, -0x4e53

    const v3, 0x719b05d7

    xor-int v9, v2, v3

    const v2, -0x7d2a8dca

    goto/16 :goto_5

    .line 1
    :sswitch_c
    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_7

    :goto_3
    const-string v1, "\u06e0\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v6

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x2a47

    const v3, -0x4f791574

    xor-int v9, v2, v3

    const v2, -0x2dd760ca

    goto/16 :goto_5

    :cond_7
    const-string v1, "\u1a74\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v6

    mul-int/lit8 v1, v1, -0x39

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0xbd7

    const v3, -0x586cecef

    xor-int v9, v2, v3

    const v2, 0x57b9cb26

    goto/16 :goto_5

    .line 0
    :sswitch_d
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    const-string v1, "\u1a7a\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v6, v1

    mul-int/lit8 v1, v1, 0x5

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x263d

    const v3, -0x37de24b4

    xor-int v9, v2, v3

    const v2, 0x333c2514

    goto :goto_5

    :cond_9
    const-string v1, "\u1a77\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v7, v1

    mul-int/lit8 v1, v1, 0x41

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, 0x7b0b

    const v3, -0x32fc2d32

    xor-int v9, v2, v3

    const v2, -0x435470ff

    goto :goto_5

    :cond_a
    const-string v1, "\u1a79\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, 0x2c2f

    const v3, 0x503b0964

    xor-int v9, v2, v3

    const v2, -0x1f960da9

    goto :goto_5

    .line 3
    :sswitch_e
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u05a1\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v7

    xor-int v2, v1, v6

    mul-int/lit16 v2, v2, -0x5a8b

    const v3, -0x65281c11

    xor-int v9, v2, v3

    const v2, 0x63f7b060

    goto :goto_5

    :cond_c
    const-string v1, "\u1a77\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v6

    xor-int v2, v1, v7

    mul-int/lit16 v2, v2, 0x225

    const v3, 0x58c7592e

    xor-int v9, v2, v3

    const v2, -0x32d1b6c2

    :goto_5
    xor-int v8, v1, v2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fc3d229 -> :sswitch_6
        -0x7ee479be -> :sswitch_9
        -0x6260b59d -> :sswitch_4
        -0x5e9b3b6c -> :sswitch_b
        -0x5971cbdd -> :sswitch_6
        -0x577c68d3 -> :sswitch_0
        -0x52106266 -> :sswitch_4
        -0x51fee701 -> :sswitch_b
        -0x2a2abc47 -> :sswitch_d
        -0x24433aea -> :sswitch_2
        -0x1197a078 -> :sswitch_7
        -0xd873982 -> :sswitch_5
        -0x9f757d9 -> :sswitch_a
        0x141e2bb -> :sswitch_8
        0x217718f -> :sswitch_5
        0x56bdfe5 -> :sswitch_0
        0x184323b2 -> :sswitch_c
        0x2682285c -> :sswitch_3
        0x28a8cc71 -> :sswitch_8
        0x2add8fd2 -> :sswitch_c
        0x300acc0c -> :sswitch_3
        0x30d3f634 -> :sswitch_7
        0x3abd3743 -> :sswitch_e
        0x5648fbf1 -> :sswitch_2
        0x5a949064 -> :sswitch_d
        0x6261c5f6 -> :sswitch_a
        0x6d4776bb -> :sswitch_9
        0x74dd6676 -> :sswitch_e
        0x752f957b -> :sswitch_1
        0x7b747f0c -> :sswitch_1
    .end sparse-switch
.end method
