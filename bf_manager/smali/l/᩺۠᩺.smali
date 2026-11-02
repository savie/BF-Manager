.class public final synthetic Ll/᩺۠᩺;
.super Ljava/lang/Object;
.source "T6NI"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ֡:Ll/᩵ۡۜ;

.field public final synthetic ܺ:Ljava/util/List;

.field public final synthetic ܽ:Ll/ۛۡ᩺;

.field public final synthetic ᩶:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroid/app/Activity;Ll/᩵ۡۜ;Ll/ۛۡ᩺;)V
    .locals 6

    const v0, 0x16690dbd

    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    sget v2, Ll/ۖܽ;->ܳ۠᩹:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e0\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x57c7

    const v5, -0x16d5d741

    xor-int/2addr v4, v5

    const v5, 0x2825b358

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5065

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/᩺۠᩺;->ܺ:Ljava/util/List;

    iput-object p2, p0, Ll/᩺۠᩺;->᩶:Landroid/app/Activity;

    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_c

    goto/16 :goto_3

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_8

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_3

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_a

    goto/16 :goto_3

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    goto/16 :goto_3

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/᩺۠᩺;->֡:Ll/᩵ۡۜ;

    iput-object p4, p0, Ll/᩺۠᩺;->ܽ:Ll/ۛۡ᩺;

    return-void

    .line 2
    :sswitch_6
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u1a78\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4de1

    const v5, -0x69b9242c

    xor-int/2addr v4, v5

    const v5, -0x1520087d

    goto :goto_0

    :cond_0
    const-string v3, "\u06ec\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1da9

    const v5, -0x5c802242

    xor-int/2addr v4, v5

    const v5, -0xf3a476f

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a7a\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x37eb

    const v5, -0x5f8f72d8

    xor-int/2addr v4, v5

    const v5, 0x7a95c82e

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u1a75\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e4f

    const v5, -0x10be1900    # -6.000987E28f

    xor-int/2addr v4, v5

    const v5, 0x211df627

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073d\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d35

    const v5, 0x41b80075    # 23.000223f

    xor-int/2addr v4, v5

    const v5, 0xc73bca

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u06e1\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3d33

    const v5, -0x49dfb476

    xor-int/2addr v4, v5

    const v5, -0x7ebf895f

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c01

    const v5, -0xf80779a

    xor-int/2addr v4, v5

    const v5, -0x712f29d1

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073f\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2fd

    const v5, 0x627fac70

    xor-int/2addr v4, v5

    const v5, 0x42e818ca

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06d7\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1357

    const v5, -0x552c1a3f

    xor-int/2addr v4, v5

    const v5, 0x208f4510

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u0730\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3fb7

    const v5, -0x412edd02

    xor-int/2addr v4, v5

    const v5, 0x658130a0

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073f\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2e79

    const v5, -0x627cba6

    xor-int/2addr v4, v5

    const v5, -0x7d499fa5

    goto/16 :goto_0

    .line 2
    :sswitch_e
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_b

    :cond_a
    const-string v3, "\u06e4\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d57

    const v5, 0x405a9b78

    xor-int/2addr v4, v5

    const v5, 0x7b7d53d9

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a75\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1acb

    const v5, 0x5479fdc6

    xor-int/2addr v4, v5

    const v5, -0x454dd772

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u06e8\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a25

    const v5, 0x3bb95c26

    xor-int/2addr v4, v5

    const v5, 0x2b93a149

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1ab1

    const v5, 0x188647dc

    xor-int/2addr v4, v5

    const v5, -0x7e522b5f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x71d66417 -> :sswitch_e
        -0x6eb76a3d -> :sswitch_2
        -0x4fde2255 -> :sswitch_1
        -0x3c1e83d4 -> :sswitch_a
        -0x343edc54 -> :sswitch_1
        -0x336e3c5a -> :sswitch_5
        -0x2f41f65e -> :sswitch_b
        -0x180e0baf -> :sswitch_0
        -0x1361374b -> :sswitch_3
        -0xc74e1f5 -> :sswitch_3
        -0xb413972 -> :sswitch_7
        -0x55a7ae7 -> :sswitch_9
        -0x27988fd -> :sswitch_c
        0x9652aed -> :sswitch_8
        0x176770cf -> :sswitch_2
        0x1c3d4739 -> :sswitch_a
        0x1f5ca652 -> :sswitch_8
        0x2837b274 -> :sswitch_c
        0x2a9c1000 -> :sswitch_d
        0x2d9cef2e -> :sswitch_6
        0x3408078a -> :sswitch_4
        0x4b3efeaf -> :sswitch_6
        0x4bddfe38 -> :sswitch_e
        0x4cbc33cd -> :sswitch_5
        0x5c102bef -> :sswitch_4
        0x6e894c5b -> :sswitch_b
        0x6f111a91 -> :sswitch_d
        0x736af32d -> :sswitch_7
        0x7520bebb -> :sswitch_0
        0x77c19c11 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final accept(I)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x2bc6bf6

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v5, "\u05ab\u06e4"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2449

    const v7, 0x273e3b3

    xor-int/2addr v6, v7

    const v7, -0x5d52a000

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x55ff

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 28
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_8

    goto/16 :goto_3

    .line 15
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_2

    .line 19
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_4

    goto/16 :goto_2

    .line 29
    :sswitch_2
    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_c

    goto/16 :goto_2

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    :sswitch_5
    return-void

    .line 33
    :sswitch_6
    new-instance v5, Ll/۟۠ۘ;

    const/4 v6, 0x1

    .line 12
    sget v7, Ll/ۗ;->֨۬ۖ:I

    if-ltz v7, :cond_0

    goto :goto_1

    .line 33
    :cond_0
    iget-object v7, p0, Ll/᩺۠᩺;->֡:Ll/᩵ۡۜ;

    .line 20
    sget-boolean v8, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v8, :cond_1

    goto :goto_1

    .line 33
    :cond_1
    iget-object v8, p0, Ll/᩺۠᩺;->ܽ:Ll/ۛۡ᩺;

    sget v9, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v9, :cond_2

    const-string v5, "\u1a79\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xf0f

    const v7, 0x37c25173

    xor-int/2addr v6, v7

    const v7, -0x343fbba2    # -2.5200828E7f

    goto :goto_0

    :cond_2
    invoke-direct {v5, v7, v8, v1, v6}, Ll/۟۠ۘ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Ll/᩺۠᩺;->᩶:Landroid/app/Activity;

    invoke-static {p1, v1, v5}, Ll/᩸۠᩺;->ۙ(Landroid/app/Activity;Ll/ۘ۠᩺;Ljava/lang/Runnable;)V

    return-void

    .line 31
    :sswitch_7
    invoke-static {v0, p1}, Ll/ۖۧ;->ۘ۟ᩴ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۘ۠᩺;

    .line 32
    iget-boolean v5, v1, Ll/ۘ۠᩺;->ۙ:Z

    if-eqz v5, :cond_3

    const-string v5, "\u06db\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6513

    const v7, -0x4cbb26f6

    xor-int/2addr v6, v7

    const v7, 0xf45db1a

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06eb\u06d6"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6ee9

    const v7, -0x26ddb929

    xor-int/2addr v6, v7

    const v7, -0x1d131732

    goto/16 :goto_0

    .line 31
    :sswitch_8
    iget-object v0, p0, Ll/᩺۠᩺;->ܺ:Ljava/util/List;

    .line 16
    sget v5, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v5, :cond_5

    :cond_4
    :goto_1
    const-string v5, "\u1a76\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v3

    mul-int/lit8 v6, v6, -0x29

    const v7, 0x76941c20

    xor-int/2addr v6, v7

    const v7, 0x1649c7d7

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06d7\u06da"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1775

    const v7, -0x5f0caaaa

    xor-int/2addr v6, v7

    const v7, -0x630bbc86

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget-boolean v5, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v5, :cond_7

    :cond_6
    const-string v5, "\u06d8\u0733"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2af1

    const v7, -0x1b871505

    xor-int/2addr v6, v7

    const v7, 0x265e82bb

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a7a\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x10c5

    const v7, -0x30903646

    xor-int/2addr v6, v7

    const v7, 0x70c88f2c

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06db\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7c9d

    const v7, 0x1b544b8e

    xor-int/2addr v6, v7

    const v7, 0x325a6fe

    goto/16 :goto_0

    .line 20
    :sswitch_a
    sget v5, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v5, :cond_9

    :goto_2
    const-string v5, "\u06e7\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1e6d

    const v7, -0x32a9458a

    xor-int/2addr v6, v7

    const v7, 0x7953f24f

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0730\u06ec"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6ca5

    const v7, -0x728b07bd

    xor-int/2addr v6, v7

    const v7, -0x1f395b9

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u0733\u1a79"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7f75

    const v7, -0x7ae58dcf

    xor-int/2addr v6, v7

    const v7, -0xf54ebd1

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v5, :cond_b

    goto :goto_3

    :cond_b
    const-string v5, "\u06eb\u1a78"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4d41

    const v7, 0x2ca34ae0

    xor-int/2addr v6, v7

    const v7, 0x4f2c0d4e

    goto/16 :goto_0

    .line 5
    :sswitch_d
    sget v5, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_3
    const-string v5, "\u06e7\u06d8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6911

    const v7, -0x9c0efad

    xor-int/2addr v6, v7

    const v7, -0x175562a7

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a73\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x761

    const v7, -0x4c18f89f

    xor-int/2addr v6, v7

    const v7, 0x64665275

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b80a6dd -> :sswitch_9
        -0x6f2044fa -> :sswitch_2
        -0x6a4d55f8 -> :sswitch_d
        -0x62a0979e -> :sswitch_6
        -0x5cffb831 -> :sswitch_c
        -0x4b8fdc0a -> :sswitch_0
        -0x4a982779 -> :sswitch_5
        -0x3ce8d4f3 -> :sswitch_b
        -0x3a8acbb6 -> :sswitch_b
        -0x2f21ff86 -> :sswitch_7
        -0x2734336d -> :sswitch_3
        -0x22e17482 -> :sswitch_d
        -0x22aea34e -> :sswitch_4
        0x2332483 -> :sswitch_5
        0x4b52bac -> :sswitch_6
        0x6e07378 -> :sswitch_4
        0xa2c32f5 -> :sswitch_a
        0xf78eece -> :sswitch_8
        0x26ecb5bf -> :sswitch_7
        0x284f85f4 -> :sswitch_c
        0x3c403497 -> :sswitch_1
        0x4f0fe46c -> :sswitch_9
        0x5a28304f -> :sswitch_8
        0x5d059f3d -> :sswitch_3
        0x61f4edd8 -> :sswitch_2
        0x66b6c61e -> :sswitch_0
        0x6a74c003 -> :sswitch_1
        0x75b90380 -> :sswitch_a
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜ᩻ᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
