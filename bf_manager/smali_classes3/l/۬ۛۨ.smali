.class public final synthetic Ll/۬ۛۨ;
.super Ljava/lang/Object;
.source "819S"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ܺ:Ll/۫ܶۘ;

.field public final synthetic ᩶:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ll/۫ܶۘ;Ljava/lang/Exception;)V
    .locals 6

    const v0, 0x356382de

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0733\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3bb3

    const v5, 0x20289611

    xor-int/2addr v4, v5

    const v5, -0x44fa386b

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x7f25

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/۬ۛۨ;->ܺ:Ll/۫ܶۘ;

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_c

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_5

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06dc\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x451f

    const v5, 0x76615ecb

    xor-int/2addr v4, v5

    const v5, -0x52be40ea

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget-boolean v3, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez v3, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto/16 :goto_3

    .line 3
    :sswitch_4
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/۬ۛۨ;->᩶:Ljava/lang/Exception;

    return-void

    .line 3
    :sswitch_6
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u1a74\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63fd

    const v5, -0x158fdb7a

    xor-int/2addr v4, v5

    const v5, 0x57e64fd7

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v3, "\u1a75\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6a4b

    const v5, -0x505c1a4

    xor-int/2addr v4, v5

    const v5, -0x74551bb9

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3fbb

    const v5, 0x6411db01

    xor-int/2addr v4, v5

    const v5, 0x1e8b7f4e

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a75\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x58e9

    const v5, -0x5bcb51c6

    xor-int/2addr v4, v5

    const v5, -0x252bb29e

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    const-string v3, "\u1a76\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1165

    const v5, -0x3d2fa67c

    xor-int/2addr v4, v5

    const v5, 0x6b9e58fc

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073a\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7f09

    const v5, 0xabb0d16

    xor-int/2addr v4, v5

    const v5, -0x2fd98d93

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x25

    const v5, 0x6fd5c257

    xor-int/2addr v4, v5

    const v5, 0x72dc35b

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_8

    :goto_1
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7c0f

    const v5, 0x1908c3e7

    xor-int/2addr v4, v5

    const v5, -0x4f410323

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u073f\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6a91

    const v5, -0x7b20c8f3

    xor-int/2addr v4, v5

    const v5, -0x782d644c

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u05a1\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ddb

    const v5, 0x52d621f5

    xor-int/2addr v4, v5

    const v5, -0x747e1734

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u073f\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x36b3

    const v5, 0x6ee7373a

    xor-int/2addr v4, v5

    const v5, -0x6acaacec

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x79e7

    const v5, -0x25453cb0

    xor-int/2addr v4, v5

    const v5, -0x2c3a6b14

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b1b

    const v5, 0x56dab5da

    xor-int/2addr v4, v5

    const v5, -0x6afa101a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4443

    const v5, 0x9a85dd0

    xor-int/2addr v4, v5

    const v5, -0x204e2e65

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7cdb44d1 -> :sswitch_4
        -0x7abc651f -> :sswitch_a
        -0x71685626 -> :sswitch_c
        -0x6f141af8 -> :sswitch_b
        -0x6b214cdd -> :sswitch_d
        -0x65332d89 -> :sswitch_a
        -0x538a0dd9 -> :sswitch_d
        -0x3aa4a7ff -> :sswitch_0
        -0x34fb9ead -> :sswitch_4
        -0x2de855c8 -> :sswitch_6
        -0x2dafc90c -> :sswitch_0
        -0x299867d4 -> :sswitch_c
        -0x245196b1 -> :sswitch_e
        -0x1f09bedc -> :sswitch_2
        -0x17681d19 -> :sswitch_8
        -0x976821b -> :sswitch_3
        -0x79eded8 -> :sswitch_b
        0xfbfd14b -> :sswitch_5
        0x123fdee3 -> :sswitch_1
        0x142e3e9c -> :sswitch_1
        0x15a92ea6 -> :sswitch_6
        0x1eabc101 -> :sswitch_3
        0x270247a0 -> :sswitch_7
        0x3341a1b4 -> :sswitch_2
        0x4bf8fadd -> :sswitch_8
        0x4e2664eb -> :sswitch_9
        0x5ad0536a -> :sswitch_9
        0x5fbfff85 -> :sswitch_7
        0x66d84338 -> :sswitch_e
        0x7992ab5a -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, -0x46ff3d1f

    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    const-string v4, "\u0730\u06d6"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5c3b

    const v6, 0x4b4fb291    # 1.3611665E7f

    xor-int/2addr v5, v6

    const v6, -0x5edb7266

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x74f5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 282
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_a

    goto/16 :goto_4

    .line 296
    :sswitch_0
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v4

    if-lez v4, :cond_b

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v4

    if-gtz v4, :cond_9

    goto :goto_1

    .line 488
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v4, "\u06db\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x36d5

    const v6, -0x60e267b8

    xor-int/2addr v5, v6

    const v6, -0x168ef4c2

    goto :goto_0

    .line 123
    :sswitch_3
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    :goto_2
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a9b

    const v6, 0x5170e335

    xor-int/2addr v5, v6

    const v6, -0x3358ee5

    goto :goto_0

    .line 128
    :sswitch_4
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    const/4 p1, 0x0

    return p1

    .line 546
    :sswitch_5
    iget-object v1, p0, Ll/۬ۛۨ;->ܺ:Ll/۫ܶۘ;

    invoke-static {v1, p1, v0}, Ll/֡᩸;->᩷ۜ᩹(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :sswitch_6
    const/4 v0, 0x0

    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u05a1\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x63d9

    const v6, -0x1b86b6c4

    xor-int/2addr v5, v6

    const v6, 0x4115254c

    goto/16 :goto_0

    .line 2
    :sswitch_7
    iget-object p1, p0, Ll/۬ۛۨ;->᩶:Ljava/lang/Exception;

    .line 364
    sget v4, Ll/ۗ;->֨۬ۖ:I

    if-ltz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u06e4\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x296f

    const v6, 0x6b8766b

    xor-int/2addr v5, v6

    const v6, -0x3473b87d    # -1.8386694E7f

    goto/16 :goto_0

    .line 203
    :sswitch_8
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result v4

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e1\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3335

    const v6, 0x360b939

    xor-int/2addr v5, v6

    const v6, -0x9b585a5

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u06dc\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2553

    const v6, -0x2ee408e1

    xor-int/2addr v5, v6

    const v6, -0x4df2d1be

    goto/16 :goto_0

    .line 135
    :sswitch_a
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v4

    if-gtz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v4, "\u06d6\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6005

    const v6, -0x978cf23

    xor-int/2addr v5, v6

    const v6, -0x7a2e78f3

    goto/16 :goto_0

    .line 456
    :sswitch_b
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06da\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x68bd

    const v6, 0x11dff173    # 3.5332E-28f

    xor-int/2addr v5, v6

    const v6, 0x290d4959

    goto/16 :goto_0

    .line 284
    :sswitch_c
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v4

    if-gtz v4, :cond_7

    goto :goto_4

    :cond_7
    const-string v4, "\u06d6\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3ccb

    const v6, 0x29dfd834

    xor-int/2addr v5, v6

    const v6, 0x69fc3445

    goto/16 :goto_0

    .line 249
    :sswitch_d
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u06db\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4493

    const v6, 0x762026fa

    xor-int/2addr v5, v6

    const v6, -0x51046da5

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e7\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1461

    const v6, -0x1d0bb3d6

    xor-int/2addr v5, v6

    const v6, -0x7f261510

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v4, "\u06d8\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x56e7

    const v6, 0x6f3e5054

    xor-int/2addr v5, v6

    const v6, 0x4de03a28    # 4.7023846E8f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a76\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6e89

    const v6, -0x1de32e4c

    xor-int/2addr v5, v6

    const v6, 0x609d0930

    goto/16 :goto_0

    .line 312
    :sswitch_e
    sget-boolean v4, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u0730\u1a73"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xd4f

    const v6, 0x2f956109

    xor-int/2addr v5, v6

    const v6, -0x29380742

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073f\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2543

    const v6, 0x4d1e0735    # 1.6570453E8f

    xor-int/2addr v5, v6

    const v6, -0x25421d83

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7852165b -> :sswitch_e
        -0x57a29582 -> :sswitch_7
        -0x573ca866 -> :sswitch_c
        -0x3b5fbd1c -> :sswitch_6
        -0x33f018a1 -> :sswitch_3
        -0x2ffa11e4 -> :sswitch_2
        -0x2ccb5dce -> :sswitch_7
        -0x20690a9c -> :sswitch_4
        -0xdfc7f3c -> :sswitch_a
        -0x84d6ce6 -> :sswitch_e
        -0x6c1891e -> :sswitch_9
        -0x41b12ed -> :sswitch_9
        -0x25e14f5 -> :sswitch_8
        0xf472382 -> :sswitch_0
        0x18967cd6 -> :sswitch_d
        0x1a58f58c -> :sswitch_c
        0x251a1b7d -> :sswitch_2
        0x25adb0aa -> :sswitch_3
        0x29247c45 -> :sswitch_4
        0x2964faff -> :sswitch_b
        0x2de2bf1b -> :sswitch_0
        0x30e247cd -> :sswitch_b
        0x31814e91 -> :sswitch_a
        0x33c9f8bd -> :sswitch_8
        0x41dc707c -> :sswitch_6
        0x430629fe -> :sswitch_5
        0x61bae59f -> :sswitch_1
        0x646ba6b1 -> :sswitch_5
        0x705d6d2b -> :sswitch_d
        0x760686e3 -> :sswitch_1
    .end sparse-switch
.end method
