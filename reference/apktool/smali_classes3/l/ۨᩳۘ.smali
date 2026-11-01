.class public final synthetic Ll/ۨᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Ll/ۙ۠ۘ;

.field public final synthetic ᩶:Ll/ܽᩴۘ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ۠ۘ;Ll/ܽᩴۘ;Ljava/lang/String;)V
    .locals 6

    const v0, -0x28d1ad54

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/֨ۧ;->֫۠֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x44cd

    const v5, -0x53e65e83

    xor-int/2addr v4, v5

    const v5, 0x32e6b0d1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x28c5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_5

    :sswitch_0
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_7

    goto :goto_1

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-nez v3, :cond_1

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    goto/16 :goto_5

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/ۨᩳۘ;->֡:Ljava/lang/String;

    return-void

    .line 3
    :sswitch_5
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b85

    const v5, -0x5969c7bc

    xor-int/2addr v4, v5

    const v5, 0x269aa843

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    :goto_1
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1fa3

    const v5, 0x23190c90

    xor-int/2addr v4, v5

    const v5, -0x4dfc037

    goto :goto_0

    :cond_2
    const-string v3, "\u06d9\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x49d7

    const v5, 0x1fe60662

    xor-int/2addr v4, v5

    const v5, -0x5ff00d89

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a77\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x468d

    const v5, 0x58cc4174

    xor-int/2addr v4, v5

    const v5, -0x17c65967

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x125b

    const v5, 0x5580b3db

    xor-int/2addr v4, v5

    const v5, -0x3d9eb762

    goto/16 :goto_0

    .line 0
    :sswitch_9
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2631

    const v5, -0x6c1c9d87    # -5.7399958E-27f

    xor-int/2addr v4, v5

    const v5, -0x683858f6

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1bf9

    const v5, 0x7e10041a

    xor-int/2addr v4, v5

    const v5, 0x67960903

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06d7\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xbf9

    const v5, 0x1c7574a0

    xor-int/2addr v4, v5

    const v5, -0x76829505

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0730\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x15a7

    const v5, -0x2428eaab

    xor-int/2addr v4, v5

    const v5, 0x2362e266

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_9

    :goto_3
    const-string v3, "\u0730\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x33

    const v5, 0x74035d1f

    xor-int/2addr v4, v5

    const v5, -0x1077e576

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x423d

    const v5, -0x571efd3c

    xor-int/2addr v4, v5

    const v5, 0x3b525e28

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u06d6\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b59

    const v5, -0x224426f8

    xor-int/2addr v4, v5

    const v5, -0x2b1bfa18

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x38af

    const v5, 0x7952d2e2

    xor-int/2addr v4, v5

    const v5, 0x67416a1f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۨᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    iput-object p2, p0, Ll/ۨᩳۘ;->᩶:Ll/ܽᩴۘ;

    .line 4
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_c

    :goto_5
    const-string v3, "\u06e8\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ef3

    const v5, -0x2d9511df

    xor-int/2addr v4, v5

    const v5, 0x3b5f5188

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x18a3

    const v5, 0x4adf2af0    # 7312760.0f

    xor-int/2addr v4, v5

    const v5, -0x1f122571

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7de02dc7 -> :sswitch_4
        -0x72794b59 -> :sswitch_6
        -0x6bc1a26d -> :sswitch_b
        -0x6274ae2f -> :sswitch_9
        -0x52bf1afe -> :sswitch_c
        -0x48245351 -> :sswitch_e
        -0x40f2c22a -> :sswitch_d
        -0x3f8bb8f8 -> :sswitch_0
        -0x3d85be6a -> :sswitch_b
        -0x307eb44d -> :sswitch_2
        -0x2cf7a224 -> :sswitch_a
        -0x2cbcccde -> :sswitch_8
        -0x29627259 -> :sswitch_1
        -0x2214f469 -> :sswitch_e
        -0x1dc6e5f1 -> :sswitch_3
        -0x16855311 -> :sswitch_7
        -0xd874a5e -> :sswitch_8
        -0xbc84da7 -> :sswitch_1
        0x137279a -> :sswitch_5
        0x2fdf55e -> :sswitch_c
        0x7bc6400 -> :sswitch_6
        0x182650e1 -> :sswitch_4
        0x25537807 -> :sswitch_7
        0x29be6223 -> :sswitch_d
        0x40ec90dd -> :sswitch_2
        0x430512c2 -> :sswitch_5
        0x46de324f -> :sswitch_a
        0x64bfb0dc -> :sswitch_3
        0x727cffd6 -> :sswitch_9
        0x7ea05113 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 p1, 0x0

    const v0, -0x4b6567a0

    sget v1, Ll/ۗᩳ;->ۚۤ֡:I

    sget v2, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d11

    const v5, 0x491d98d9

    xor-int/2addr v4, v5

    const v5, 0x6bb95c12

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x20d9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_0
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-gez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xbb5

    const v5, 0x20e30f30

    xor-int/2addr v4, v5

    const v5, 0x33bf16e3

    goto :goto_0

    .line 0
    :sswitch_1
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_7

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    return-void

    .line 0
    :sswitch_4
    iget-object v0, p0, Ll/ۨᩳۘ;->֡:Ljava/lang/String;

    iget-object v1, p0, Ll/ۨᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    invoke-static {v1, p1, v0}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;Ll/ܽᩴۘ;Ljava/lang/String;)V

    return-void

    :sswitch_5
    iget-object p1, p0, Ll/ۨᩳۘ;->᩶:Ll/ܽᩴۘ;

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a15

    const v5, -0x2fabd75b

    xor-int/2addr v4, v5

    const v5, 0x12394196

    goto :goto_0

    .line 2
    :sswitch_6
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a77\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2ab1

    const v5, -0x7e275111

    xor-int/2addr v4, v5

    const v5, -0x19f6527b

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a74\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5d1d

    const v5, -0x58787f39

    xor-int/2addr v4, v5

    const v5, -0x6bb763eb

    goto/16 :goto_0

    .line 3
    :sswitch_8
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d8d

    const v5, 0x7c9d38dc

    xor-int/2addr v4, v5

    const v5, 0x606fb8eb

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u05a1\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x16b7

    const v5, -0x3f44b612

    xor-int/2addr v4, v5

    const v5, -0x3ef4bb0d

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06db\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x695f

    const v5, 0x7188798e

    xor-int/2addr v4, v5

    const v5, -0x7a014968

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u06d8\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x37ad

    const v5, -0x1820aaf0

    xor-int/2addr v4, v5

    const v5, 0x135c857c

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3ad1

    const v5, 0x147c125

    xor-int/2addr v4, v5

    const v5, -0x7ae2b31f

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_9

    :goto_2
    const-string v3, "\u1a77\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xd95

    const v5, -0x4bdb1c42

    xor-int/2addr v4, v5

    const v5, 0x46b7b06e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d5f

    const v5, 0x4844eaa1

    xor-int/2addr v4, v5

    const v5, -0x60383e0b

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u1a7a\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a79

    const v5, 0x6b56b56b

    xor-int/2addr v4, v5

    const v5, 0x3e3b3521

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05ab\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x68e3

    const v5, 0x59dd5f13

    xor-int/2addr v4, v5

    const v5, 0x5be3b8ad

    goto/16 :goto_0

    .line 1
    :sswitch_e
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0733\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f1b

    const v5, -0x396daf47

    xor-int/2addr v4, v5

    const v5, 0x2fd2e553

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63f7

    const v5, 0x4cd2705a    # 1.1033058E8f

    xor-int/2addr v4, v5

    const v5, 0x79200a0c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x795ab90b -> :sswitch_9
        -0x68d40fe9 -> :sswitch_3
        -0x547cd857 -> :sswitch_b
        -0x48e4077b -> :sswitch_0
        -0x4438bb6c -> :sswitch_e
        -0x3fd72e16 -> :sswitch_8
        -0x3e2ad962 -> :sswitch_2
        -0x33e5b477 -> :sswitch_d
        -0x325d5cd7 -> :sswitch_c
        -0x30acfceb -> :sswitch_a
        -0x1ff06164 -> :sswitch_4
        0x8c4390 -> :sswitch_3
        0xe9c0ad8 -> :sswitch_6
        0x12107815 -> :sswitch_c
        0x18aaf9fe -> :sswitch_1
        0x24423621 -> :sswitch_2
        0x277addbd -> :sswitch_8
        0x2976dc97 -> :sswitch_5
        0x2dd3998f -> :sswitch_6
        0x31dba3d0 -> :sswitch_b
        0x378997b8 -> :sswitch_1
        0x392c91c1 -> :sswitch_4
        0x3ea363ed -> :sswitch_a
        0x40acb3df -> :sswitch_e
        0x447b2b54 -> :sswitch_7
        0x4b7a68ad -> :sswitch_7
        0x4ba2c883 -> :sswitch_d
        0x50d4ff58 -> :sswitch_5
        0x6009c898 -> :sswitch_9
        0x6da1be30 -> :sswitch_0
    .end sparse-switch
.end method
