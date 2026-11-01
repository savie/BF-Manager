.class public final synthetic Ll/ۘۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ֡:Ll/᩵ۡۜ;

.field public final synthetic ۫:Ljava/lang/String;

.field public final synthetic ܺ:Ljava/util/ArrayList;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:Ll/ۜ۟᩺;

.field public final synthetic ᩶:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;Ll/᩵ۡۜ;Ljava/lang/String;Ljava/lang/String;Ll/ۜ۟᩺;)V
    .locals 6

    const v0, 0x4da8e549    # 3.5419984E8f

    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v2, Ll/֫ܳ;->᩶ۧۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06eb\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x21b1

    const v5, 0x11a89585

    xor-int/2addr v4, v5

    const v5, 0x35dafe51

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7489

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_5

    goto/16 :goto_1

    .line 2
    :sswitch_0
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v3, :cond_4

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_4

    :sswitch_2
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_8

    goto/16 :goto_4

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/ۘۤ᩺;->ܽ:Ljava/lang/String;

    iput-object p5, p0, Ll/ۘۤ᩺;->۫:Ljava/lang/String;

    iput-object p6, p0, Ll/ۘۤ᩺;->ܿ:Ll/ۜ۟᩺;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ۘۤ᩺;->֡:Ll/᩵ۡۜ;

    .line 3
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_0

    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x50ab

    const v5, -0x24a9713

    xor-int/2addr v4, v5

    const v5, -0x72d2861b

    goto :goto_0

    :cond_0
    const-string v3, "\u06e8\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4789

    const v5, 0x5be1a8d7

    xor-int/2addr v4, v5

    const v5, -0x5f53af67

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u073a\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3cc3

    const v5, -0x10d2e49d

    xor-int/2addr v4, v5

    const v5, -0x3f6f3df8

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a78\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x42cf

    const v5, 0x77363442

    xor-int/2addr v4, v5

    const v5, -0x3eaf9eb7

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06d6\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x903

    const v5, 0x7e42288a

    xor-int/2addr v4, v5

    const v5, -0x2d91160

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v3, "\u1a77\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5623

    const v5, 0x1f28e50e

    xor-int/2addr v4, v5

    const v5, -0x300d25df

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a7b\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x50f7

    const v5, 0x732071be

    xor-int/2addr v4, v5

    const v5, -0xaeb1f79

    goto/16 :goto_0

    .line 2
    :sswitch_a
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a79\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x58a9

    const v5, -0x5ad836ad

    xor-int/2addr v4, v5

    const v5, 0x3c405aba

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71a1

    const v5, 0x3469cf01

    xor-int/2addr v4, v5

    const v5, 0x217e802d

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u05ab\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f15

    const v5, 0x37aec5bf

    xor-int/2addr v4, v5

    const v5, -0x708fb30e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0736\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4347

    const v5, 0x3be9e3cf

    xor-int/2addr v4, v5

    const v5, 0x76c1fbca

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x49fb

    const v5, -0x5f9a6055

    xor-int/2addr v4, v5

    const v5, -0xf19236b

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x47e3

    const v5, -0x6461df19    # -2.616017E-22f

    xor-int/2addr v4, v5

    const v5, 0x217e8445

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۘۤ᩺;->ܺ:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/ۘۤ᩺;->᩶:Landroid/app/Activity;

    .line 4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u1a76\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c47

    const v5, 0x74877df4

    xor-int/2addr v4, v5

    const v5, 0x6ef60bd9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7b\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3129

    const v5, 0x7e26dd22    # 5.545001E37f

    xor-int/2addr v4, v5

    const v5, 0xa0e1380

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aff5189 -> :sswitch_b
        -0x7a3bdca6 -> :sswitch_4
        -0x651a99cb -> :sswitch_0
        -0x5c795a22 -> :sswitch_2
        -0x57ac6b20 -> :sswitch_0
        -0x48ae83fd -> :sswitch_b
        -0x42c35cff -> :sswitch_4
        -0x41f41145 -> :sswitch_9
        -0x419aa53a -> :sswitch_c
        -0x32db402f -> :sswitch_7
        -0x2d6274bc -> :sswitch_6
        -0x1ec3c46d -> :sswitch_d
        -0x1a11ecc6 -> :sswitch_6
        -0x1570294d -> :sswitch_1
        -0x952ae60 -> :sswitch_e
        -0x35c7682 -> :sswitch_d
        0x109839e -> :sswitch_8
        0x4006c2f -> :sswitch_a
        0x1bd7147e -> :sswitch_2
        0x1e26cf31 -> :sswitch_9
        0x2045af21 -> :sswitch_a
        0x28850dad -> :sswitch_8
        0x2a624983 -> :sswitch_7
        0x33405c20 -> :sswitch_1
        0x3adf3417 -> :sswitch_c
        0x4b9d9e7c -> :sswitch_5
        0x5d511f88 -> :sswitch_3
        0x787bc9b1 -> :sswitch_3
        0x796f12e2 -> :sswitch_5
        0x7ade83ec -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final accept(I)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x101cfdf5

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v6, "\u05ab\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x416f

    const v8, 0x79ff19a9

    xor-int/2addr v7, v8

    const v8, -0x1b3160fe

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3363

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    .line 1400
    :sswitch_0
    sget v6, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v6, :cond_2

    :goto_2
    move/from16 v6, p1

    goto/16 :goto_4

    .line 1022
    :sswitch_1
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    move-result v6

    if-nez v6, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v6, p1

    goto/16 :goto_5

    :sswitch_2
    sget v6, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v6, :cond_1

    goto :goto_2

    :cond_1
    move/from16 v6, p1

    goto/16 :goto_6

    .line 1254
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto :goto_2

    .line 1405
    :sswitch_4
    move-object v6, v2

    check-cast v6, Ll/ۘ۠᩺;

    .line 1406
    new-instance v14, Ll/۠ۤ᩺;

    .line 192
    sget-boolean v7, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v7, :cond_3

    :cond_2
    const-string v6, "\u1a77\u06e2"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x52a3

    const v8, -0x7aaed886

    xor-int/2addr v7, v8

    const v8, -0x1a5b522a

    goto :goto_0

    .line 1406
    :cond_3
    iget-object v8, v0, Ll/ۘۤ᩺;->֡:Ll/᩵ۡۜ;

    .line 27
    sget v7, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v7, :cond_4

    :goto_3
    move/from16 v6, p1

    goto/16 :goto_7

    .line 1406
    :cond_4
    iget-object v9, v0, Ll/ۘۤ᩺;->ܽ:Ljava/lang/String;

    iget-object v10, v0, Ll/ۘۤ᩺;->۫:Ljava/lang/String;

    sget v7, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v7, :cond_5

    goto :goto_3

    :cond_5
    iget-object v15, v0, Ll/ۘۤ᩺;->᩶:Landroid/app/Activity;

    .line 1010
    sget v7, Ll/֫;->ܶܺ᩻:I

    if-ltz v7, :cond_6

    goto :goto_2

    .line 1406
    :cond_6
    iget-object v13, v0, Ll/ۘۤ᩺;->ܿ:Ll/ۜ۟᩺;

    move-object v7, v14

    move-object v11, v6

    move-object v12, v15

    invoke-direct/range {v7 .. v13}, Ll/۠ۤ᩺;-><init>(Ll/᩵ۡۜ;Ljava/lang/String;Ljava/lang/String;Ll/ۘ۠᩺;Landroid/app/Activity;Ll/ۜ۟᩺;)V

    invoke-static {v15, v6, v14}, Ll/᩸۠᩺;->ۙ(Landroid/app/Activity;Ll/ۘ۠᩺;Ljava/lang/Runnable;)V

    return-void

    :sswitch_5
    move/from16 v6, p1

    .line 1405
    invoke-static {v1, v6}, Ll/ۗܳ;->ܿۙۧ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    sget-boolean v7, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v7, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v7, "\u06d8\u06ec"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v4

    mul-int/lit8 v7, v7, -0x45

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4da1

    const v9, -0x195af207

    xor-int/2addr v8, v9

    const v9, 0x651fb6e3

    goto/16 :goto_8

    :sswitch_6
    move/from16 v6, p1

    iget-object v1, v0, Ll/ۘۤ᩺;->ܺ:Ljava/util/ArrayList;

    sget v7, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v7, :cond_8

    :goto_4
    const-string v7, "\u1a73\u06df"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x1897

    const v9, -0x69f35b30

    xor-int/2addr v8, v9

    const v9, 0x478735f8    # 69227.94f

    goto/16 :goto_8

    :cond_8
    const-string v7, "\u0733\u0730"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x320f

    const v9, -0x5a7f1e3c

    xor-int/2addr v8, v9

    const v9, -0x4e069375

    goto/16 :goto_8

    :sswitch_7
    move/from16 v6, p1

    .line 795
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_5

    :cond_9
    const-string v7, "\u1a7b\u06df"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7e9b

    const v9, 0x16c561a0

    xor-int/2addr v8, v9

    const v9, 0x686421e0

    goto/16 :goto_8

    :sswitch_8
    move/from16 v6, p1

    sget v7, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v7, :cond_a

    :goto_5
    const-string v7, "\u05ab\u1a74"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v4

    mul-int/lit8 v7, v7, 0x27

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1971

    const v9, -0x3c8228eb

    xor-int/2addr v8, v9

    const v9, 0x49a32bb4    # 1336694.5f

    goto/16 :goto_8

    :cond_a
    const-string v7, "\u0736\u06d7"

    invoke-static {v7}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0xf8f

    const v9, 0x4eef04f8

    xor-int/2addr v8, v9

    const v9, -0x847ece9

    goto :goto_8

    :sswitch_9
    move/from16 v6, p1

    .line 582
    sget v7, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v7, :cond_b

    :goto_6
    const-string v7, "\u1a73\u06d7"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v4, v7

    mul-int/lit8 v7, v7, 0x7

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x297f

    const v9, 0x3ed4bcce

    xor-int/2addr v8, v9

    const v9, 0x57494bf8

    goto :goto_8

    :cond_b
    const-string v7, "\u073d\u06eb"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x5f

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x78d5

    const v9, -0x7dd2716c

    xor-int/2addr v8, v9

    const v9, -0x132b770a

    goto :goto_8

    :sswitch_a
    move/from16 v6, p1

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v7

    if-eqz v7, :cond_c

    :goto_7
    const-string v7, "\u06dc\u06e0"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x3cbf

    const v9, -0x4ee44818    # -2.2660007E-9f

    xor-int/2addr v8, v9

    const v9, 0x1971fa3b

    goto :goto_8

    :cond_c
    const-string v7, "\u06d8\u05a8"

    invoke-static {v7}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x279

    const v9, 0x4abc225c    # 6164782.0f

    xor-int/2addr v8, v9

    const v9, 0x35b0c296

    :goto_8
    xor-int/2addr v7, v9

    move v6, v7

    move v7, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7b7768df -> :sswitch_9
        -0x74bca8eb -> :sswitch_3
        -0x518f8308 -> :sswitch_a
        -0x5022372b -> :sswitch_7
        -0x4d525c5a -> :sswitch_a
        -0x423d54c2 -> :sswitch_1
        -0x2dc0ba7e -> :sswitch_2
        -0x2c108995 -> :sswitch_4
        -0x21e8817d -> :sswitch_8
        -0x1663488b -> :sswitch_5
        -0x82d49e9 -> :sswitch_0
        0xbeb6138 -> :sswitch_3
        0x10b54871 -> :sswitch_6
        0x1c305c99 -> :sswitch_4
        0x2a9f744b -> :sswitch_7
        0x3e049020 -> :sswitch_6
        0x41141c1c -> :sswitch_0
        0x427df717 -> :sswitch_5
        0x50198dec -> :sswitch_8
        0x60ebf96f -> :sswitch_2
        0x63d39142 -> :sswitch_9
        0x73c021f8 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۜ᩻ᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
