.class public final synthetic Ll/ۡܺۘ;
.super Ljava/lang/Object;
.source "V6YT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/۟ܺۘ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/۟ܺۘ;I)V
    .locals 6

    const v0, -0x489ecd3d

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    sget v2, Ll/֨᩺;->۬᩺ܰ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a8\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xfc7

    const v5, -0x43bff53f

    xor-int/2addr v4, v5

    const v5, 0x2ee11f91

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x4e2d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ۡܺۘ;->ܺ:Ll/۟ܺۘ;

    sget v3, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v3, :cond_c

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v3, :cond_4

    goto/16 :goto_2

    .line 0
    :sswitch_1
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u073d\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x20f7

    const v5, 0x1e58b45b

    xor-int/2addr v4, v5

    const v5, 0x1f5ccb4

    goto :goto_0

    :sswitch_2
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_2

    .line 0
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput p2, p0, Ll/ۡܺۘ;->᩶:I

    return-void

    :sswitch_6
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e8\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ddd

    const v5, 0x236ced48

    xor-int/2addr v4, v5

    const v5, 0x8fa3dff

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c11

    const v5, -0x2f6931fa

    xor-int/2addr v4, v5

    const v5, 0x27776edc

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06ec\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7c35

    const v5, 0x3c7407bf

    xor-int/2addr v4, v5

    const v5, 0x63e6061d

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u073d\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a2d

    const v5, -0xcf07d88    # -1.1370005E31f

    xor-int/2addr v4, v5

    const v5, 0x3682be18

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06db\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xc73

    const v5, -0x9874b88

    xor-int/2addr v4, v5

    const v5, -0xe846f95

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3939

    const v5, 0x489f9cd2

    xor-int/2addr v4, v5

    const v5, 0x63944d69

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06d7\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x750d

    const v5, -0xbfbd505

    xor-int/2addr v4, v5

    const v5, 0x1113e4ea

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u073f\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c0d

    const v5, -0x267d6417

    xor-int/2addr v4, v5

    const v5, -0x6819d086

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_1
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x747f

    const v5, 0x3c5a735e

    xor-int/2addr v4, v5

    const v5, -0x3a455fd3

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x563d

    const v5, 0x143116aa

    xor-int/2addr v4, v5

    const v5, 0x417ce3ed

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_b

    :goto_2
    const-string v3, "\u0733\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x32f3

    const v5, -0x31ebac42

    xor-int/2addr v4, v5

    const v5, -0x127a2502

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x606b

    const v5, -0x787ff75

    xor-int/2addr v4, v5

    const v5, -0x36134e10    # -1939006.0f

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u073f\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2469

    const v5, -0x318fab7b

    xor-int/2addr v4, v5

    const v5, 0x1d341264

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x183

    const v5, -0x62f85037

    xor-int/2addr v4, v5

    const v5, -0x6985066e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x768361f3 -> :sswitch_e
        -0x703b2317 -> :sswitch_8
        -0x6fd12608 -> :sswitch_b
        -0x59376f48 -> :sswitch_5
        -0x4a18744b -> :sswitch_4
        -0x3b4cc957 -> :sswitch_a
        -0x36270e18 -> :sswitch_d
        -0x2c016695 -> :sswitch_3
        -0x1cff9d45 -> :sswitch_1
        -0x1cddae9a -> :sswitch_1
        -0x1add0372 -> :sswitch_b
        -0x1ad6875e -> :sswitch_5
        -0xde62d6d -> :sswitch_0
        -0xbf6f78 -> :sswitch_4
        0x4fde5b5 -> :sswitch_c
        0x1313f0de -> :sswitch_6
        0x191ee253 -> :sswitch_c
        0x1bc09ef1 -> :sswitch_8
        0x1c4f8318 -> :sswitch_d
        0x2a73f857 -> :sswitch_9
        0x2dff83d4 -> :sswitch_3
        0x34e0e909 -> :sswitch_7
        0x3b82c646 -> :sswitch_a
        0x3bf5c1f0 -> :sswitch_9
        0x4556423b -> :sswitch_0
        0x4e725881 -> :sswitch_e
        0x560b9d63 -> :sswitch_2
        0x59979c31 -> :sswitch_2
        0x59a9d7df -> :sswitch_7
        0x67f81020 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۡܺۘ;->ܺ:Ll/۟ܺۘ;

    iget v1, p0, Ll/ۡܺۘ;->᩶:I

    invoke-static {v0, v1}, Ll/۟ܺۘ;->ۙ(Ll/۟ܺۘ;I)V

    return-void
.end method
