.class public final synthetic Ll/۠ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/ۙ۠ۘ;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۙ۠ۘ;I)V
    .locals 6

    const v0, -0x4f16f711

    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6417

    const v5, 0x4167927a

    xor-int/2addr v4, v5

    const v5, -0x3bbd4440

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1b63

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v3, :cond_5

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u073d\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2623

    const v5, 0x2e11e3c6

    xor-int/2addr v4, v5

    const v5, -0x7fc46aed

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput p2, p0, Ll/۠ᩳۘ;->᩶:I

    return-void

    .line 3
    :sswitch_5
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a73\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x19c1

    const v5, -0x5e13b612

    xor-int/2addr v4, v5

    const v5, 0x624c5b20

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06e7\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe27

    const v5, -0xd447c17

    xor-int/2addr v4, v5

    const v5, 0x578b2ec9

    goto :goto_0

    .line 0
    :sswitch_7
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a78\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x45c9

    const v5, -0x25dd7eee

    xor-int/2addr v4, v5

    const v5, -0x317bbdcf

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5f27

    const v5, 0x7c74fd1d

    xor-int/2addr v4, v5

    const v5, 0x66cbe068

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u06eb\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x704d

    const v5, -0x3ac3bbbd

    xor-int/2addr v4, v5

    const v5, -0x5a931ef1

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x501

    const v5, -0x6353d89

    xor-int/2addr v4, v5

    const v5, -0x3b78abf6

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_7

    :goto_2
    const-string v3, "\u0730\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x12cf

    const v5, -0x6df2b91e

    xor-int/2addr v4, v5

    const v5, -0x454f5df6

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a78\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30b7

    const v5, -0x50164ee3

    xor-int/2addr v4, v5

    const v5, 0x2513cbb6

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u073a\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7dcb

    const v5, -0x24f7f7d4

    xor-int/2addr v4, v5

    const v5, -0x6822f1e

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1d7f

    const v5, -0x13d596e2

    xor-int/2addr v4, v5

    const v5, 0x6748f326

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_a

    :goto_3
    const-string v3, "\u1a73\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x51e7

    const v5, -0x4ca93c92    # -5.00035E-8f

    xor-int/2addr v4, v5

    const v5, 0x3b006bbf

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1443

    const v5, 0x3a4e93d

    xor-int/2addr v4, v5

    const v5, 0x740c35dc

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/۠ᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x14f1

    const v5, -0x5b9976e4

    xor-int/2addr v4, v5

    const v5, 0x2ae48839

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x387b

    const v5, 0x18a8264c

    xor-int/2addr v4, v5

    const v5, -0x422bdfb9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76b3cf02 -> :sswitch_a
        -0x74a28c04 -> :sswitch_9
        -0x73ab3d5b -> :sswitch_5
        -0x6e78d9e8 -> :sswitch_7
        -0x6d412c42 -> :sswitch_8
        -0x60c7aed9 -> :sswitch_e
        -0x5b92c517 -> :sswitch_d
        -0x554920d5 -> :sswitch_2
        -0x4b2e3a5d -> :sswitch_1
        -0x4806239b -> :sswitch_b
        -0x3d67009e -> :sswitch_0
        -0x3cd79482 -> :sswitch_5
        -0x3bfb5291 -> :sswitch_8
        -0x2aa2c550 -> :sswitch_1
        -0xd9bc0e3 -> :sswitch_3
        0x43e0aa7 -> :sswitch_c
        0x465d4da -> :sswitch_0
        0x127e6716 -> :sswitch_4
        0x1e368d94 -> :sswitch_6
        0x1f6bb8e2 -> :sswitch_7
        0x22ea1339 -> :sswitch_2
        0x48ae4e65 -> :sswitch_6
        0x49f28386 -> :sswitch_c
        0x525a7b92 -> :sswitch_e
        0x5268fa41 -> :sswitch_4
        0x552183a5 -> :sswitch_9
        0x594b3cd6 -> :sswitch_3
        0x62004d7d -> :sswitch_a
        0x6d803ab4 -> :sswitch_d
        0x7f9ef0a8 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/۠ᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    iget v1, p0, Ll/۠ᩳۘ;->᩶:I

    invoke-static {v0, v1}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;I)V

    return-void
.end method
