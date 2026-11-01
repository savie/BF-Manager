.class public final Ll/ۢܳۨ;
.super Ljava/lang/Object;
.source "71K9"


# instance fields
.field public final ۙ:Ljava/util/ArrayList;

.field public final ܰ:Ll/۟۫᩵;


# direct methods
.method public constructor <init>(Ll/۟۫᩵;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x50d4dee4

    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    .line 462
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06e4\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5591

    const v6, -0x62512d6c

    xor-int/2addr v5, v6

    const v6, 0x2981981c

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x27db

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 442
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_9

    goto/16 :goto_3

    .line 237
    :sswitch_0
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u06db\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2dd3

    const v6, -0x24101f66

    xor-int/2addr v5, v6

    const v6, 0x610ad8bb

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-gtz v4, :cond_a

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_5

    goto/16 :goto_2

    .line 67
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 460
    :sswitch_5
    iput-object v0, p0, Ll/ۢܳۨ;->ۙ:Ljava/util/ArrayList;

    .line 463
    iput-object p1, p0, Ll/ۢܳۨ;->ܰ:Ll/۟۫᩵;

    return-void

    :sswitch_6
    sget-boolean v4, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06e8\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x46bd

    const v6, -0x67bcb607

    xor-int/2addr v5, v6

    const v6, -0x542a5aa7

    goto :goto_0

    :sswitch_7
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u1a7a\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4e0f

    const v6, -0x7f920170

    xor-int/2addr v5, v6

    const v6, -0x40dda8fd

    goto/16 :goto_0

    .line 27
    :sswitch_8
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u0736\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7d27

    const v6, -0x4ec7dab2

    xor-int/2addr v5, v6

    const v6, -0x40a22370

    goto/16 :goto_0

    .line 131
    :sswitch_9
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06eb\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xdab

    const v6, -0x1cfc7768

    xor-int/2addr v5, v6

    const v6, 0x6b15672d

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u1a73\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x53a9

    const v6, -0x352e5c4

    xor-int/2addr v5, v6

    const v6, 0x6fbb29b9

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a74\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a57

    const v6, -0x14fc4b0a

    xor-int/2addr v5, v6

    const v6, -0x7a0b5cec

    goto/16 :goto_0

    .line 284
    :sswitch_b
    sget v4, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u0730\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x785d

    const v6, 0x5f32594f

    xor-int/2addr v5, v6

    const v6, -0x1d19cf73

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_8

    :goto_2
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x45d3

    const v6, -0xfe96e7c

    xor-int/2addr v5, v6

    const v6, 0x3baba8f9

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a77\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x36dd

    const v6, 0x5d62fa0f

    xor-int/2addr v5, v6

    const v6, -0x47e916f4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a76\u0736"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x100b

    const v6, 0x13c44bff

    xor-int/2addr v5, v6

    const v6, 0x18ec4146

    goto/16 :goto_0

    .line 316
    :sswitch_d
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06d8\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x749f

    const v6, 0x767dde3b

    xor-int/2addr v5, v6

    const v6, 0x44d25550

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06ec\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7d87

    const v6, -0x7127c6dd

    xor-int/2addr v5, v6

    const v6, 0x20026da2

    goto/16 :goto_0

    .line 460
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 220
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u06db\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6465

    const v6, -0x6e236034

    xor-int/2addr v5, v6

    const v6, 0x6248c9d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0730\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2681

    const v6, 0x6b939e37

    xor-int/2addr v5, v6

    const v6, -0x40ff802d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ff17b5f -> :sswitch_c
        -0x6e96f885 -> :sswitch_6
        -0x5e99cf88 -> :sswitch_4
        -0x4d60096e -> :sswitch_9
        -0x4cb3f9ce -> :sswitch_e
        -0x43b10ceb -> :sswitch_c
        -0x3da21d1f -> :sswitch_a
        -0x30eef488 -> :sswitch_0
        -0x2a26d949 -> :sswitch_d
        -0x16b05b4a -> :sswitch_7
        -0x1320e27c -> :sswitch_6
        -0xc515c38 -> :sswitch_2
        -0x4948ca3 -> :sswitch_1
        -0x438be78 -> :sswitch_1
        -0x1e2fede -> :sswitch_7
        0xc859f4a -> :sswitch_b
        0xd2f0c3e -> :sswitch_8
        0x12f44a47 -> :sswitch_5
        0x161d1b22 -> :sswitch_a
        0x20ffd5f0 -> :sswitch_e
        0x2ecc45b1 -> :sswitch_5
        0x3543ce59 -> :sswitch_4
        0x3c98bc39 -> :sswitch_0
        0x4857fe9a -> :sswitch_b
        0x4a0a5ffe -> :sswitch_3
        0x50d7504e -> :sswitch_d
        0x580a3e4b -> :sswitch_2
        0x6358f98d -> :sswitch_9
        0x6a7fbd54 -> :sswitch_8
        0x77f50a85 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()Ll/۠᩺ۡ;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x31ab8f29

    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    sget v6, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v7, "\u1a75\u1a77"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x445b

    const v9, -0x1820f969

    xor-int/2addr v8, v9

    const v9, -0x3bb263ad

    :goto_0
    xor-int/2addr v7, v9

    move-object v9, v0

    :goto_1
    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x5797

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 449
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_2

    .line 280
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_0

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget v7, Ll/֫᩺;->᩺۟ۘ:I

    if-lez v7, :cond_6

    goto :goto_2

    .line 421
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    const/4 v0, 0x0

    return-object v0

    .line 478
    :sswitch_4
    new-instance v7, Ll/ܳܳۨ;

    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v8

    if-eqz v8, :cond_1

    :cond_0
    const-string v7, "\u0733\u05ab"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1fff

    const v10, 0xbe90029

    xor-int/2addr v8, v10

    const v10, 0x3cb364e1

    goto/16 :goto_7

    :cond_1
    invoke-direct {v7, v9, v3}, Ll/ܳܳۨ;-><init>(Ll/۠᩺ۡ;Ll/᩺ۙۡ;)V

    invoke-interface {v1, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 477
    :sswitch_5
    invoke-static {v2}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۙۡ;

    .line 226
    sget v7, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v7, :cond_2

    :goto_2
    const-string v7, "\u1a75\u1a75"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6dbb

    const v10, 0x3afd3e20

    xor-int/2addr v8, v10

    const v10, 0x591638b

    goto/16 :goto_7

    :cond_2
    const-string v7, "\u0736\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x41

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7699

    const v10, 0x64111b08

    xor-int/2addr v8, v10

    const v10, -0x2d957408

    goto/16 :goto_7

    .line 480
    :sswitch_6
    invoke-static {v1}, Ll/ۙܳ᩺;->ۙ(Ljava/util/concurrent/ExecutorService;)V

    return-object v9

    .line 477
    :sswitch_7
    invoke-static {v2}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "\u06d7\u06e8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x3b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x421d

    const v10, -0x564f6b34

    xor-int/2addr v8, v10

    const v10, -0x2667c00c

    goto/16 :goto_7

    :cond_3
    const-string v7, "\u0733\u06eb"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x13

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1869

    const v10, 0x57fa494c

    xor-int/2addr v8, v10

    const v10, -0x71ddbddb    # -1.999989E-30f

    goto/16 :goto_7

    :sswitch_8
    iget-object v2, p0, Ll/ۢܳۨ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۗܺ;->֡ۙۚ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    const-string v7, "\u1a79\u1a7b"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6195

    const v10, -0x30d8e02e

    xor-int/2addr v8, v10

    const v10, 0x43c125e2

    goto/16 :goto_7

    .line 39
    :sswitch_9
    sget v1, Ll/ۚܺ᩺;->ۙ:I

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 345
    sget v7, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v7, :cond_4

    goto :goto_6

    :cond_4
    const-string v7, "\u0730\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x5b03

    const v10, 0x3b10c2d2

    xor-int/2addr v8, v10

    const v10, 0x6962e3aa

    goto/16 :goto_7

    .line 475
    :sswitch_a
    new-instance v9, Ll/۠᩺ۡ;

    .line 151
    sget v7, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v7, :cond_5

    goto :goto_5

    .line 35
    :cond_5
    sget-boolean v7, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v7, :cond_7

    :cond_6
    :goto_4
    const-string v7, "\u073f\u1a78"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x47e1

    const v9, 0x20c2126b

    xor-int/2addr v8, v9

    const v9, 0x7a8025d4

    goto/16 :goto_0

    .line 412
    :cond_7
    sget v7, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v7, :cond_8

    goto :goto_5

    .line 253
    :cond_8
    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    sget-boolean v7, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v7, :cond_b

    :cond_a
    :goto_5
    const-string v7, "\u1a74\u06e8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x7f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x22f

    const v9, -0x7173e7cc

    xor-int/2addr v8, v9

    const v9, 0x23b8d898

    goto/16 :goto_0

    .line 475
    :cond_b
    iget-object v7, p0, Ll/ۢܳۨ;->ܰ:Ll/۟۫᩵;

    sget-boolean v8, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v8, :cond_c

    goto :goto_6

    :cond_c
    invoke-direct {v9, v7}, Ll/۠᩺ۡ;-><init>(Ll/۟۫᩵;)V

    .line 476
    sget-object v7, Ll/ۙܳ᩺;->ۖ:Ljava/util/concurrent/ExecutorService;

    .line 309
    sget v7, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v7, :cond_d

    :goto_6
    const-string v7, "\u06e7\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x1f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2fb

    const v9, -0xc95f9e7

    xor-int/2addr v8, v9

    const v9, 0x1291e97d

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u073a\u073f"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x7d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2b99

    const v10, -0x20ce852e

    xor-int/2addr v8, v10

    const v10, 0x1b5284a8

    :goto_7
    xor-int/2addr v7, v10

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cea0ea4 -> :sswitch_0
        -0x7b3d6479 -> :sswitch_2
        -0x6dc8d255 -> :sswitch_8
        -0x56e45c8a -> :sswitch_4
        -0x535c1381 -> :sswitch_9
        -0x50f7e7a9 -> :sswitch_1
        -0x48a145b5 -> :sswitch_2
        -0x3a86d4a2 -> :sswitch_5
        -0x3007c1c8 -> :sswitch_a
        -0xa09f42b -> :sswitch_4
        0xa84a753 -> :sswitch_7
        0x18e52e4c -> :sswitch_3
        0x1e2ea813 -> :sswitch_a
        0x1ecbe0f3 -> :sswitch_7
        0x2024cb96 -> :sswitch_8
        0x239f9130 -> :sswitch_3
        0x592e319a -> :sswitch_6
        0x5e199106 -> :sswitch_6
        0x7315cc55 -> :sswitch_5
        0x75f54daa -> :sswitch_1
        0x78d8e032 -> :sswitch_9
        0x7ccd1ec3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ۙ(Ll/ۙ֫ۨ;)Ll/۠᩺ۡ;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0x23b2dc84

    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    sget v8, Ll/ۗ;->֨۬ۖ:I

    const-string v9, "\u06e1\u06df"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x53

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xf7f

    const v11, 0xc2f206c

    xor-int/2addr v10, v11

    const v11, 0x2572c489

    :goto_0
    xor-int/2addr v9, v11

    move-object v11, v0

    :goto_1
    move-object v12, v3

    :goto_2
    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x436b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 195
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget v9, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v9, :cond_8

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v9

    if-eqz v9, :cond_a

    goto/16 :goto_8

    .line 260
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v9

    if-lez v9, :cond_6

    goto/16 :goto_8

    .line 31
    :sswitch_2
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto/16 :goto_8

    .line 295
    :sswitch_3
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    const/4 p1, 0x0

    return-object p1

    .line 488
    :sswitch_4
    invoke-static {v5}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩺ۙۡ;

    .line 489
    new-instance v10, Ll/֫ܳۨ;

    .line 63
    sget v13, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v13, :cond_0

    goto :goto_4

    .line 489
    :cond_0
    invoke-direct {v10, p1, v12, v11, v9}, Ll/֫ܳۨ;-><init>(Ll/ۙ֫ۨ;Ll/۠᩻᩺;Ll/۠᩺ۡ;Ll/᩺ۙۡ;)V

    invoke-interface {v2, v10}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 496
    :sswitch_5
    invoke-static {v2}, Ll/ۙܳ᩺;->ۙ(Ljava/util/concurrent/ExecutorService;)V

    return-object v11

    .line 488
    :sswitch_6
    invoke-static {v5}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const-string v9, "\u1a73\u06e1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x5d81

    const v13, 0x752cc305

    xor-int/2addr v10, v13

    const v13, -0x61d94644

    goto/16 :goto_9

    :cond_1
    const-string v9, "\u06eb\u1a7a"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x6b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x53e9

    const v13, 0xf59744e

    xor-int/2addr v10, v13

    const v13, 0x763939dc

    goto/16 :goto_9

    .line 487
    :sswitch_7
    new-instance v5, Ll/۫ܳۨ;

    invoke-direct {v5, p1}, Ll/۫ܳۨ;-><init>(Ll/ۙ֫ۨ;)V

    invoke-static {v12, v5}, Ll/֨ۢ;->֨ܰ֡(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 488
    invoke-static {v4}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    const-string v9, "\u06dc\u06db"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x4009

    const v13, -0x468bae96    # -2.3299982E-4f

    xor-int/2addr v10, v13

    const v13, 0x26b7e2ba

    goto/16 :goto_9

    .line 487
    :sswitch_8
    new-instance v12, Ll/۠᩻᩺;

    .line 165
    sget-boolean v9, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v9, :cond_2

    :goto_4
    const-string v9, "\u06e1\u06db"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x39ad

    const v12, 0x3b79dba1

    xor-int/2addr v10, v12

    const v12, -0x24745c54

    xor-int/2addr v9, v12

    goto/16 :goto_1

    .line 487
    :cond_2
    iget-object v4, p0, Ll/ۢܳۨ;->ۙ:Ljava/util/ArrayList;

    invoke-static {v4}, Ll/֡֡;->ۢۡۜ(Ljava/lang/Object;)I

    move-result v9

    sget-boolean v10, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v10, :cond_3

    goto/16 :goto_7

    :cond_3
    int-to-long v9, v9

    .line 135
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v13

    if-gtz v13, :cond_4

    goto/16 :goto_7

    .line 487
    :cond_4
    invoke-direct {v12, v9, v10}, Ll/۠᩻᩺;-><init>(J)V

    .line 246
    sget-boolean v9, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v9, :cond_5

    goto :goto_6

    :cond_5
    const-string v9, "\u0736\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0xce9

    const v13, 0x7040921b

    xor-int/2addr v10, v13

    const v13, 0x42f59b4a

    goto/16 :goto_9

    .line 39
    :sswitch_9
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    :goto_5
    const-string v9, "\u1a73\u06e2"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4185

    const v13, 0x66b07469

    xor-int/2addr v10, v13

    const v13, 0x187b14e2

    goto/16 :goto_9

    :cond_7
    const-string v9, "\u06d7\u06dc"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x27bb

    const v13, -0x1242c8b4

    xor-int/2addr v10, v13

    const v13, 0x6a244510

    goto/16 :goto_9

    .line 486
    :sswitch_a
    sget-object v1, Ll/ۙܳ᩺;->ۖ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v1, Ll/ۚܺ᩺;->ۙ:I

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v9

    if-gtz v9, :cond_9

    :cond_8
    :goto_6
    const-string v9, "\u05ab\u05a8"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x73

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1229

    const v13, -0x6923557e

    xor-int/2addr v10, v13

    const v13, -0x7eddcc2b

    goto/16 :goto_9

    :cond_9
    const-string v9, "\u06d7\u1a7a"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x29

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3f0f

    const v13, 0x1a77aa43

    xor-int/2addr v10, v13

    const v13, -0x6673cf00

    goto :goto_9

    .line 485
    :sswitch_b
    new-instance v11, Ll/۠᩺ۡ;

    .line 366
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v9

    if-eqz v9, :cond_b

    :cond_a
    :goto_7
    const-string v9, "\u1a74\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x5471

    const v11, -0x6b59099e

    xor-int/2addr v10, v11

    const v11, -0x33e0d80a    # -4.1721816E7f

    goto/16 :goto_0

    .line 485
    :cond_b
    iget-object v9, p0, Ll/ۢܳۨ;->ܰ:Ll/۟۫᩵;

    invoke-direct {v11, v9}, Ll/۠᩺ۡ;-><init>(Ll/۟۫᩵;)V

    .line 270
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v9

    if-gtz v9, :cond_c

    goto :goto_8

    :cond_c
    const-string v9, "\u0733\u1a75"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x720b

    const v13, 0x55b1f4c3

    xor-int/2addr v10, v13

    const v13, 0x23e14c1b

    goto :goto_9

    .line 221
    :sswitch_c
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v9

    if-ltz v9, :cond_d

    :goto_8
    const-string v9, "\u06dc\u073d"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x593f

    const v13, 0xf6b269f

    xor-int/2addr v10, v13

    const v13, -0x30803943

    goto :goto_9

    :cond_d
    const-string v9, "\u06df\u05a1"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x35

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1201

    const v13, 0xd9d79f9

    xor-int/2addr v10, v13

    const v13, 0x1b87393d

    :goto_9
    xor-int/2addr v9, v13

    goto/16 :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d69d3ad -> :sswitch_7
        -0x7287eb09 -> :sswitch_2
        -0x6eee58cb -> :sswitch_a
        -0x6bb8d4b7 -> :sswitch_6
        -0x49820cc2 -> :sswitch_9
        -0x492e534c -> :sswitch_0
        -0x437ab24b -> :sswitch_5
        -0x390df12b -> :sswitch_7
        -0x27e480be -> :sswitch_2
        -0x272b7287 -> :sswitch_8
        -0x216fa595 -> :sswitch_c
        0x97d5113 -> :sswitch_9
        0xc7f4c7f -> :sswitch_1
        0xdcfbc0a -> :sswitch_c
        0xf30cccd -> :sswitch_3
        0x1b490b57 -> :sswitch_8
        0x1cf40180 -> :sswitch_0
        0x1db879b5 -> :sswitch_4
        0x301a5eb2 -> :sswitch_b
        0x3f9bd8a7 -> :sswitch_6
        0x5e46d21d -> :sswitch_4
        0x61a2b528 -> :sswitch_1
        0x71e9a13d -> :sswitch_a
        0x723a6271 -> :sswitch_5
        0x76208c48 -> :sswitch_b
        0x7d8f0fd0 -> :sswitch_3
    .end sparse-switch
.end method
