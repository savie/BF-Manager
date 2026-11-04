.class public final synthetic Ll/᩹۬ۤ;
.super Ljava/lang/Object;
.source "Q62Z"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ۢ۬ۤ;

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۬ۤ;Z)V
    .locals 6

    const v0, 0x32565ac4

    sget v1, Ll/ۗܰ;->ܶۜ۬:I

    sget v2, Ll/ۗ֡;->ۜ᩻۫:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x10a9

    const v5, 0x376518d9

    xor-int/2addr v4, v5

    const v5, 0x4a63823a    # 3727502.5f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x25f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4fdf

    const v5, 0x462ed70a

    xor-int/2addr v4, v5

    const v5, -0x4e76e39

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    if-gez v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    :goto_1
    const-string v3, "\u06d7\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2007

    const v5, 0x1fed84c8

    xor-int/2addr v4, v5

    const v5, -0x83df24

    goto :goto_0

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p2, p0, Ll/᩹۬ۤ;->᩶:Z

    return-void

    .line 3
    :sswitch_6
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e8\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6631

    const v5, -0x4e7408fa

    xor-int/2addr v4, v5

    const v5, -0x271e1793

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2895

    const v5, -0x1a565cfe

    xor-int/2addr v4, v5

    const v5, -0x6bb89a81

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1f7

    const v5, -0xaa31f84    # -2.7999472E32f

    xor-int/2addr v4, v5

    const v5, 0x5445b76b

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a74\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51d5

    const v5, 0x30452671

    xor-int/2addr v4, v5

    const v5, -0x20f16cc

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e8\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb4b

    const v5, -0x10c06336

    xor-int/2addr v4, v5

    const v5, -0x73b339a8

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06db\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2439

    const v5, -0x288ad6b0

    xor-int/2addr v4, v5

    const v5, -0x32aad075

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3e7f

    const v5, 0x30df9319

    xor-int/2addr v4, v5

    const v5, 0x604b68e

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d8\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x69bb

    const v5, 0x58f2f043

    xor-int/2addr v4, v5

    const v5, 0x35a9dd88

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x69b1

    const v5, -0x1a440528

    xor-int/2addr v4, v5

    const v5, -0x66a3b6

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u1a7b\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3e9

    const v5, -0x6983443f

    xor-int/2addr v4, v5

    const v5, -0x5534f3a9

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06eb\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6ef9

    const v5, -0x16ed9af2

    xor-int/2addr v4, v5

    const v5, 0x196e3308

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩹۬ۤ;->ܰ:Ll/ۢ۬ۤ;

    .line 4
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x512f

    const v5, 0x4f1387a0

    xor-int/2addr v4, v5

    const v5, -0x45248686

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7bd5

    const v5, 0x3d181e1

    xor-int/2addr v4, v5

    const v5, -0x5bab7a85

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f24043f -> :sswitch_5
        -0x7e8a1099 -> :sswitch_9
        -0x67dccdb9 -> :sswitch_0
        -0x5a43652c -> :sswitch_e
        -0x558eef4a -> :sswitch_d
        -0x4466b1f6 -> :sswitch_7
        -0x258adaca -> :sswitch_a
        -0x224c942d -> :sswitch_6
        -0x1db47708 -> :sswitch_1
        -0x10286fe0 -> :sswitch_0
        -0x9bd1dc7 -> :sswitch_4
        -0x9746354 -> :sswitch_d
        0x1908e75 -> :sswitch_e
        0xc5c4ada -> :sswitch_4
        0x17d03bc4 -> :sswitch_b
        0x26f7d24d -> :sswitch_9
        0x27e96e93 -> :sswitch_3
        0x30a8a447 -> :sswitch_5
        0x3eb892b4 -> :sswitch_c
        0x407140fd -> :sswitch_a
        0x40a85426 -> :sswitch_c
        0x4741af9a -> :sswitch_8
        0x5292192e -> :sswitch_2
        0x57764b89 -> :sswitch_7
        0x64cad74b -> :sswitch_1
        0x6ffd7728 -> :sswitch_8
        0x72f4cc43 -> :sswitch_3
        0x7ab2de00 -> :sswitch_b
        0x7b9b9a2d -> :sswitch_6
        0x7c94b8d0 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/᩹۬ۤ;->ܰ:Ll/ۢ۬ۤ;

    iget-boolean v1, p0, Ll/᩹۬ۤ;->᩶:Z

    invoke-static {v0, v1}, Ll/ۢ۬ۤ;->ۙ(Ll/ۢ۬ۤ;Z)V

    return-void
.end method
