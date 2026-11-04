.class public final synthetic Ll/ܰ᩷ۧ;
.super Ljava/lang/Object;
.source "02QQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Landroid/view/View;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;)V
    .locals 6

    const v0, -0x5681e26a

    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073a\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2083

    const v5, 0x5a9078a5

    xor-int/2addr v4, v5

    const v5, -0x5583f3d1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1467

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v3

    if-ltz v3, :cond_a

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-nez v3, :cond_1

    goto/16 :goto_2

    .line 3
    :sswitch_1
    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v3, :cond_9

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p1, p0, Ll/ܰ᩷ۧ;->᩶:I

    return-void

    .line 2
    :sswitch_6
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u1a74\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x52bd

    const v5, 0x62c4d49c

    xor-int/2addr v4, v5

    const v5, 0x58cc3b41

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v3

    if-gtz v3, :cond_2

    :cond_1
    const-string v3, "\u06ec\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2ae1

    const v5, -0x3b74a534

    xor-int/2addr v4, v5

    const v5, -0x622092db

    goto :goto_0

    :cond_2
    const-string v3, "\u06db\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x79f5

    const v5, 0x58210413

    xor-int/2addr v4, v5

    const v5, 0x1bcf5623

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06e7\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b13

    const v5, 0x14b6faa6

    xor-int/2addr v4, v5

    const v5, 0x162cabd2

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u06db\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5ca1

    const v5, 0x146224e8

    xor-int/2addr v4, v5

    const v5, -0xeb58aa1

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a7b\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5291

    const v5, 0x74b75129

    xor-int/2addr v4, v5

    const v5, -0x24c1aaf0

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06e0\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2835

    const v5, -0x1a8d6dcb

    xor-int/2addr v4, v5

    const v5, 0x1fdc8c20

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a74\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x78e1

    const v5, -0x7421a805

    xor-int/2addr v4, v5

    const v5, -0x6296b113

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_8

    :goto_1
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d15

    const v5, -0x121a2480

    xor-int/2addr v4, v5

    const v5, -0x5f03c09b

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e7\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44c5

    const v5, 0x60b78757

    xor-int/2addr v4, v5

    const v5, 0x43a83fea

    goto/16 :goto_0

    :cond_9
    :goto_2
    const-string v3, "\u0733\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x103b

    const v5, -0x4f6619e5

    xor-int/2addr v4, v5

    const v5, 0x148edd34

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4fed

    const v5, 0x4dfb62e2    # 5.271952E8f

    xor-int/2addr v4, v5

    const v5, -0x3f068108

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u05ab\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1b83

    const v5, 0x2d99b938

    xor-int/2addr v4, v5

    const v5, -0x313e0aed

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p2, p0, Ll/ܰ᩷ۧ;->ܰ:Landroid/view/View;

    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u1a77\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4aa5

    const v5, -0x4b7c199f

    xor-int/2addr v4, v5

    const v5, -0x55c13248

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4401

    const v5, 0x9233b3c

    xor-int/2addr v4, v5

    const v5, -0xf76feac

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x734efafb -> :sswitch_0
        -0x607d8258 -> :sswitch_4
        -0x5f8a253f -> :sswitch_8
        -0x559ceceb -> :sswitch_e
        -0x510fa232 -> :sswitch_c
        -0x48593715 -> :sswitch_a
        -0x33021a75 -> :sswitch_2
        -0x2f92d9ea -> :sswitch_8
        -0x24799956 -> :sswitch_3
        -0x1e3a381a -> :sswitch_1
        -0x10626ad9 -> :sswitch_d
        0x28e40ba -> :sswitch_b
        0x12a6ae3e -> :sswitch_4
        0x1edda34c -> :sswitch_0
        0x2393a573 -> :sswitch_7
        0x23c71778 -> :sswitch_e
        0x2c4ed006 -> :sswitch_5
        0x2e704615 -> :sswitch_6
        0x4132b4c4 -> :sswitch_3
        0x4b1c770c -> :sswitch_1
        0x52e443b7 -> :sswitch_6
        0x55bbf4a7 -> :sswitch_d
        0x5dfc4e9b -> :sswitch_c
        0x5e790fa8 -> :sswitch_9
        0x6600ffb9 -> :sswitch_a
        0x7203bdbb -> :sswitch_5
        0x72a40132 -> :sswitch_2
        0x761d1ed1 -> :sswitch_b
        0x77811f79 -> :sswitch_7
        0x7bbf86a3 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܰ᩷ۧ;->ܰ:Landroid/view/View;

    iget v1, p0, Ll/ܰ᩷ۧ;->᩶:I

    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(ILandroid/view/View;)V

    return-void
.end method
