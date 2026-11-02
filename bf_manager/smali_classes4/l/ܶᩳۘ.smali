.class public final synthetic Ll/ܶᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/᩷᩸;


# instance fields
.field public final synthetic ֡:Ll/֫ᩴۘ;

.field public final synthetic ܺ:Ll/ۙ۠ۘ;

.field public final synthetic ܽ:Ll/᩵ۡۜ;

.field public final synthetic ᩶:Ll/ܽᩴۘ;


# direct methods
.method public synthetic constructor <init>(Ll/ۙ۠ۘ;Ll/ܽᩴۘ;Ll/֫ᩴۘ;Ll/᩵ۡۜ;)V
    .locals 6

    const v0, 0x2e39482e

    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a76\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7471

    const v5, -0x5c5ceb65

    xor-int/2addr v4, v5

    const v5, -0x789355ef

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x18cb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_4

    goto/16 :goto_1

    .line 0
    :sswitch_0
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_b

    goto/16 :goto_2

    .line 4
    :sswitch_1
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ܶᩳۘ;->֡:Ll/֫ᩴۘ;

    iput-object p4, p0, Ll/ܶᩳۘ;->ܽ:Ll/᩵ۡۜ;

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v3

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u06e7\u1a7b"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e41

    const v5, 0x4457cdc4

    xor-int/2addr v4, v5

    const v5, 0x38e71137

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06d7\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3321

    const v5, -0x642df2b2

    xor-int/2addr v4, v5

    const v5, -0x3d3a819b

    goto :goto_0

    :sswitch_8
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06d9\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1457

    const v5, 0x66c2a77e

    xor-int/2addr v4, v5

    const v5, 0x2745d170

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u1a74\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77cb

    const v5, -0x6a516097

    xor-int/2addr v4, v5

    const v5, -0x36c7488

    goto/16 :goto_0

    :goto_1
    const-string v3, "\u05ab\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x54c1

    const v5, -0x136a62ec

    xor-int/2addr v4, v5

    const v5, -0x2d7ec886

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06ec\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x53df

    const v5, 0x4d23f3c4    # 1.7191635E8f

    xor-int/2addr v4, v5

    const v5, 0x64327095

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x39f9

    const v5, 0x1d6083d6

    xor-int/2addr v4, v5

    const v5, 0x1edc7eac

    goto/16 :goto_0

    .line 1
    :sswitch_b
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x349

    const v5, -0x3be67161

    xor-int/2addr v4, v5

    const v5, 0x468ca505

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073a\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71b3

    const v5, -0x5f392a4e

    xor-int/2addr v4, v5

    const v5, -0x291ddb9b

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x29e7

    const v5, 0x2657fa49

    xor-int/2addr v4, v5

    const v5, 0x4b060ffc    # 8785916.0f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a76\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x599d

    const v5, 0x76c67ba9

    xor-int/2addr v4, v5

    const v5, 0x350c23ac

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06ec\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5739

    const v5, 0x51e7b41a

    xor-int/2addr v4, v5

    const v5, 0x2f66b0e9

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a77\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x513f

    const v5, -0x424ff3a4

    xor-int/2addr v4, v5

    const v5, -0x5a3bf558

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ܶᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    iput-object p2, p0, Ll/ܶᩳۘ;->᩶:Ll/ܽᩴۘ;

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06db\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1943

    const v5, 0x58322432

    xor-int/2addr v4, v5

    const v5, -0x3c951b75

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1053

    const v5, -0x6f342ac4

    xor-int/2addr v4, v5

    const v5, -0x432d307a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x71c2faba -> :sswitch_b
        -0x642c3ca7 -> :sswitch_c
        -0x637a35ba -> :sswitch_3
        -0x5d880e97 -> :sswitch_d
        -0x4f14e174 -> :sswitch_7
        -0x3b25cb7d -> :sswitch_3
        -0x357faf87 -> :sswitch_4
        -0x2ca46bd2 -> :sswitch_5
        -0x214c9211 -> :sswitch_b
        -0x1f8c75c6 -> :sswitch_a
        -0x19602f85 -> :sswitch_e
        -0x151daac3 -> :sswitch_0
        -0xe9e3324 -> :sswitch_c
        -0xa79a371 -> :sswitch_2
        -0x82e45a4 -> :sswitch_9
        0xa518632 -> :sswitch_1
        0x10c1b076 -> :sswitch_e
        0x172cb093 -> :sswitch_8
        0x2989eb32 -> :sswitch_8
        0x38738a98 -> :sswitch_4
        0x3aac5f30 -> :sswitch_5
        0x414ce3c8 -> :sswitch_a
        0x41e02d9d -> :sswitch_2
        0x452fa0dc -> :sswitch_0
        0x556bb15a -> :sswitch_6
        0x55ba63fb -> :sswitch_9
        0x576e553d -> :sswitch_d
        0x68cd527c -> :sswitch_1
        0x76d902b5 -> :sswitch_7
        0x7731e686 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x393723b0

    sget v5, Ll/֨᩺;->۬᩺ܰ:I

    sget v6, Ll/֡᩶;->ۗ֨ܺ:I

    const-string v7, "\u0730\u1a79"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x61

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7505

    const v9, -0x5edc9374

    xor-int/2addr v8, v9

    const v9, -0x3fb835c1

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x6255

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 0
    iget-object v0, p0, Ll/ܶᩳۘ;->֡:Ll/֫ᩴۘ;

    sget v7, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v7, :cond_2

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget v7, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v7, :cond_3

    goto :goto_1

    .line 3
    :sswitch_1
    sget v7, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v7, :cond_6

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v7, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v7, :cond_9

    goto :goto_1

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    invoke-static {v2, v3, v0, v1, p1}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;Ll/ܽᩴۘ;Ll/֫ᩴۘ;Ll/᩵ۡۜ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    iget-object v2, p0, Ll/ܶᩳۘ;->ܺ:Ll/ۙ۠ۘ;

    iget-object v3, p0, Ll/ܶᩳۘ;->᩶:Ll/ܽᩴۘ;

    .line 3
    sget-boolean v7, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v7, :cond_0

    :goto_1
    const-string v7, "\u05a8\u06db"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x23ad

    const v9, -0x1610c519

    xor-int/2addr v8, v9

    const v9, 0x1759bfa1

    goto :goto_0

    :cond_0
    const-string v7, "\u073d\u06d8"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x13

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7249

    const v9, 0x459145ec

    xor-int/2addr v8, v9

    const v9, 0x7a70fd80

    goto :goto_0

    .line 0
    :sswitch_7
    iget-object v1, p0, Ll/ܶᩳۘ;->ܽ:Ll/᩵ۡۜ;

    sget v7, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v7, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v7, "\u1a78\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x21

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x75db

    const v9, -0x1ac4632

    xor-int/2addr v8, v9

    const v9, -0x5471284c

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u0733\u1a77"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x5141

    const v9, -0x62691b5b

    xor-int/2addr v8, v9

    const v9, 0x7b0cf9bb

    goto/16 :goto_0

    :sswitch_8
    sget v7, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v7, :cond_4

    :cond_3
    const-string v7, "\u1a75\u073d"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7705

    const v9, 0x19f57203

    xor-int/2addr v8, v9

    const v9, 0x5356ea7b

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06d7\u1a7a"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2dff

    const v9, 0x34cb8b74

    xor-int/2addr v8, v9

    const v9, 0x65a37889

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget-boolean v7, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v7, :cond_5

    goto :goto_2

    :cond_5
    const-string v7, "\u06d7\u1a76"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3835

    const v9, 0x7f50e004

    xor-int/2addr v8, v9

    const v9, 0x419f71e8

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v7, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v7, :cond_7

    :cond_6
    :goto_2
    const-string v7, "\u1a73\u06da"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1c1

    const v9, 0x3110ee0e

    xor-int/2addr v8, v9

    const v9, 0xbebda66

    goto/16 :goto_0

    :cond_7
    const-string v7, "\u06df\u1a76"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x6b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x416b

    const v9, 0x46aa15fe

    xor-int/2addr v8, v9

    const v9, 0x5c653a24

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v7

    if-gtz v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "\u0736\u06e1"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x33

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7d21

    const v9, 0x47114473

    xor-int/2addr v8, v9

    const v9, -0x3019811f

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget-boolean v7, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v7, :cond_a

    :cond_9
    :goto_3
    const-string v7, "\u06e0\u0730"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x19

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x50f3

    const v9, 0x41257931

    xor-int/2addr v8, v9

    const v9, -0x11c7339a

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u06d6\u1a74"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7b77

    const v9, -0x3d151708

    xor-int/2addr v8, v9

    const v9, -0x5e5c45d

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget-boolean v7, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v7, :cond_b

    goto :goto_4

    :cond_b
    const-string v7, "\u0730\u06da"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x75

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x154f

    const v9, 0x59518136

    xor-int/2addr v8, v9

    const v9, -0x4802c9c3

    goto/16 :goto_0

    :sswitch_e
    sget v7, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v7, :cond_c

    :goto_4
    const-string v7, "\u06d7\u1a77"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5c09

    const v9, 0x7356dcbd

    xor-int/2addr v8, v9

    const v9, 0x74c3c73b

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06e4\u06d6"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x3d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x177b

    const v9, -0x467246dc

    xor-int/2addr v8, v9

    const v9, 0x657b537a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7dd66e6e -> :sswitch_d
        -0x7b32d6ae -> :sswitch_2
        -0x78c695cc -> :sswitch_8
        -0x6fca605f -> :sswitch_1
        -0x6d84f70f -> :sswitch_8
        -0x62876cba -> :sswitch_4
        -0x5f7eacad -> :sswitch_5
        -0x562e5d79 -> :sswitch_c
        -0x562ab20f -> :sswitch_c
        -0x557a364d -> :sswitch_e
        -0x5153f69b -> :sswitch_7
        -0x3d06ff18 -> :sswitch_4
        -0x30858d5a -> :sswitch_7
        -0x2731e2a7 -> :sswitch_3
        -0x109200be -> :sswitch_a
        -0xbe0f616 -> :sswitch_3
        -0x8b7dbd0 -> :sswitch_5
        0x11a2786a -> :sswitch_d
        0x177bad5f -> :sswitch_b
        0x18873065 -> :sswitch_2
        0x1c6f5452 -> :sswitch_0
        0x2a5a47d6 -> :sswitch_6
        0x2fbadc87 -> :sswitch_b
        0x38c5a261 -> :sswitch_0
        0x431aa5f5 -> :sswitch_9
        0x5dbf1190 -> :sswitch_6
        0x6347905a -> :sswitch_e
        0x6afa2b8c -> :sswitch_9
        0x741223c8 -> :sswitch_a
        0x78c0c634 -> :sswitch_1
    .end sparse-switch
.end method
