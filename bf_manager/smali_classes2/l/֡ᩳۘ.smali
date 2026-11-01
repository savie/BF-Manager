.class public final synthetic Ll/֡ᩳۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܺ:Ll/ܽᩴۘ;

.field public final synthetic ᩶:Landroid/graphics/drawable/BitmapDrawable;


# direct methods
.method public synthetic constructor <init>(Ll/ܽᩴۘ;Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 6

    const v0, -0x76c353aa

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    sget v2, Ll/ۘۗ;->ۖۧ۬:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u05a8\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x60e7

    const v5, 0x250932aa    # 1.1900021E-16f

    xor-int/2addr v4, v5

    const v5, 0x612ca9eb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x797b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_2

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_1

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-lez v3, :cond_8

    goto :goto_1

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u06d7\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x30dd

    const v5, 0x46bc7272

    xor-int/2addr v4, v5

    const v5, -0x2a22a1d3

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    goto/16 :goto_4

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/֡ᩳۘ;->᩶:Landroid/graphics/drawable/BitmapDrawable;

    return-void

    .line 2
    :sswitch_6
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x13f9

    const v5, -0x626543e

    xor-int/2addr v4, v5

    const v5, 0x4d230f54    # 1.7098067E8f

    goto :goto_0

    :cond_2
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x125b

    const v5, 0x18efd4a6

    xor-int/2addr v4, v5

    const v5, -0x457190bf

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e4\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x434b

    const v5, -0x5ec6ceef

    xor-int/2addr v4, v5

    const v5, -0x42438acc

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u1a79\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7917

    const v5, 0x238414d6

    xor-int/2addr v4, v5

    const v5, -0x68faa5ab

    goto/16 :goto_0

    .line 2
    :sswitch_9
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v3, "\u06e2\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3edd

    const v5, -0x7a42a3cd

    xor-int/2addr v4, v5

    const v5, 0x76256e7a

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_6

    :goto_2
    const-string v3, "\u06db\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7209

    const v5, -0x27602ffb

    xor-int/2addr v4, v5

    const v5, -0x6f515a7a

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a79\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b61

    const v5, 0x382a8db6

    xor-int/2addr v4, v5

    const v5, 0x1198ee77

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u06ec\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c13

    const v5, -0x6f0d29ca

    xor-int/2addr v4, v5

    const v5, 0x507911a6

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06d7\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2359

    const v5, 0x313da69f

    xor-int/2addr v4, v5

    const v5, -0x7cc7fb91

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a73\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x60f9

    const v5, -0x4cd3729d

    xor-int/2addr v4, v5

    const v5, -0x2a8e2fe4

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_a

    :goto_4
    const-string v3, "\u1a79\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4cd1

    const v5, 0x7fb79eb5

    xor-int/2addr v4, v5

    const v5, -0x4cc5ed27

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x58cb

    const v5, 0x3e70038e

    xor-int/2addr v4, v5

    const v5, -0x43c75774

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/֡ᩳۘ;->ܺ:Ll/ܽᩴۘ;

    .line 1
    sget v3, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d9\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3f5f

    const v5, 0x5145b097

    xor-int/2addr v4, v5

    const v5, 0x2fbb2aab

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x78bb

    const v5, 0x51e12b9a

    xor-int/2addr v4, v5

    const v5, -0x75581d63

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x767888d6 -> :sswitch_8
        -0x72ad1d00 -> :sswitch_6
        -0x6e1b6204 -> :sswitch_3
        -0x6d6e15d1 -> :sswitch_9
        -0x597cb982 -> :sswitch_4
        -0x47ea2f3a -> :sswitch_1
        -0x455ef4dd -> :sswitch_2
        -0x36725059 -> :sswitch_b
        -0x309b5dad -> :sswitch_7
        -0x1ba53be2 -> :sswitch_c
        -0x191f9fb1 -> :sswitch_5
        -0x5be94b8 -> :sswitch_7
        -0x3e78feb -> :sswitch_5
        0x7005f7e -> :sswitch_0
        0x73a77f3 -> :sswitch_a
        0x81b7abd -> :sswitch_a
        0xaedc817 -> :sswitch_4
        0x1d0919d0 -> :sswitch_d
        0x2414b4d5 -> :sswitch_c
        0x2e4705c9 -> :sswitch_8
        0x330abd78 -> :sswitch_b
        0x390c1344 -> :sswitch_e
        0x394ed707 -> :sswitch_e
        0x3d1a4cd8 -> :sswitch_d
        0x68184275 -> :sswitch_2
        0x68bc7a52 -> :sswitch_0
        0x6fb1c078 -> :sswitch_9
        0x728e8118 -> :sswitch_6
        0x757a7bdb -> :sswitch_1
        0x77baf7d0 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x7cd12818

    sget v11, Ll/֫۟;->᩸ᩴܿ:I

    sget v12, Ll/֫ᩳ;->۬֨᩸:I

    const-string v13, "\u05ab\u06e8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2adb

    const v15, -0x726227ff

    xor-int/2addr v14, v15

    const v15, 0x517587e4

    :goto_0
    xor-int/2addr v13, v15

    move-object v15, v8

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x6f59

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 1054
    invoke-virtual {v3, v15}, Ll/᩵֨;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1055
    invoke-virtual {v15, v9}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    const/16 v1, 0x12c

    .line 1056
    invoke-virtual {v15, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    .line 78
    :sswitch_0
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget-boolean v13, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez v13, :cond_5

    goto/16 :goto_6

    .line 633
    :sswitch_1
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v13

    if-gtz v13, :cond_c

    goto/16 :goto_3

    :sswitch_2
    sget v13, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v13, :cond_8

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    goto/16 :goto_4

    .line 391
    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    return-void

    .line 1047
    :sswitch_5
    invoke-virtual {v3, v4}, Ll/᩵֨;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 1052
    :sswitch_6
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 1053
    new-instance v15, Landroid/graphics/drawable/TransitionDrawable;

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v13

    if-eqz v13, :cond_0

    goto/16 :goto_3

    :cond_0
    const/4 v13, 0x2

    new-array v13, v13, [Landroid/graphics/drawable/Drawable;

    const/4 v14, 0x0

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v16

    if-eqz v16, :cond_1

    goto/16 :goto_5

    :cond_1
    aput-object v5, v13, v14

    const/4 v9, 0x1

    aput-object v6, v13, v9

    sget-boolean v14, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v14, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-direct {v15, v13}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 586
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v13

    if-ltz v13, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v13, "\u1a73\u1a73"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x759b

    const v16, -0x414305d8

    xor-int v14, v14, v16

    const v16, 0x539ac3dc

    goto/16 :goto_7

    .line 1052
    :sswitch_7
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u0730\u0733"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x2d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x791b

    const v16, -0x1f6c1178

    xor-int v14, v14, v16

    const v16, 0x5faab856

    goto/16 :goto_7

    .line 1049
    :sswitch_8
    invoke-virtual {v3}, Ll/᩵֨;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 1050
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    .line 917
    sget-boolean v13, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v13, :cond_6

    :cond_5
    :goto_2
    const-string v13, "\u0730\u06e1"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x58d9

    const v16, -0x4eeea591

    xor-int v14, v14, v16

    const v16, 0x7cd54383

    goto/16 :goto_7

    :cond_6
    const-string v13, "\u06d8\u06e8"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7e75

    const v16, -0x104aefdf

    xor-int v14, v14, v16

    const v16, -0x525ab67d

    goto/16 :goto_7

    .line 1045
    :sswitch_9
    invoke-virtual {v2, v4}, Ll/᩵֨;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1046
    iget-boolean v13, v1, Ll/ܽᩴۘ;->ۖ:Z

    if-nez v13, :cond_7

    const-string v13, "\u06d8\u06d9"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x9

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x57b1

    const v16, -0x69314171

    xor-int v14, v14, v16

    const v16, -0x6cf8626e

    goto/16 :goto_7

    :cond_7
    const-string v13, "\u0733\u073d"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4bbb

    const v16, -0x4752cb92

    xor-int v14, v14, v16

    const v16, 0x581efce5

    goto/16 :goto_7

    .line 1045
    :sswitch_a
    iget-object v3, v1, Ll/ܽᩴۘ;->᩹:Ll/᩵֨;

    iget-object v4, v0, Ll/֡ᩳۘ;->᩶:Landroid/graphics/drawable/BitmapDrawable;

    .line 742
    sget v13, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v13, :cond_9

    :cond_8
    :goto_3
    const-string v13, "\u06db\u06ec"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x61

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xd1b

    const v15, -0x102bbc11

    xor-int/2addr v14, v15

    const v15, 0x55683aa3

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u0736\u06e7"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x4b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3955

    const v16, 0x4e337369    # 7.526713E8f

    xor-int v14, v14, v16

    const v16, 0x3072e675

    goto/16 :goto_7

    .line 1045
    :sswitch_b
    iget-object v2, v1, Ll/ܽᩴۘ;->֨:Ll/᩵֨;

    .line 356
    sget v13, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v13, :cond_a

    :goto_4
    const-string v13, "\u073d\u06e0"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3f83

    const v15, -0x3ecf0491

    xor-int/2addr v14, v15

    const v15, -0x726a0a13

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06e4\u1a7a"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x54f

    const v16, 0x7f732bbd

    xor-int v14, v14, v16

    const v16, 0x43bb2a2a

    goto :goto_7

    .line 1045
    :sswitch_c
    iget-object v1, v0, Ll/֡ᩳۘ;->ܺ:Ll/ܽᩴۘ;

    .line 508
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result v13

    if-ltz v13, :cond_b

    :goto_5
    const-string v13, "\u1a77\u073d"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x3

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x74bf

    const v15, 0x78d46bc5

    xor-int/2addr v14, v15

    const v15, 0x5285d4db

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06e2\u0730"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6f45

    const v16, -0x7eaa85ac

    xor-int v14, v14, v16

    const v16, 0x1c3f4962

    goto :goto_7

    .line 2
    :sswitch_d
    sget v13, Ll/ۙ۠ۘ;->᩻ܰ:I

    .line 1026
    sget-boolean v13, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v13, :cond_d

    :cond_c
    :goto_6
    const-string v13, "\u1a79\u06da"

    invoke-static {v13}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xb3d

    const v16, -0x5ef54b6f

    xor-int v14, v14, v16

    const v16, 0x3747e19a

    goto :goto_7

    :cond_d
    const-string v13, "\u05a1\u1a78"

    invoke-static {v13}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1aa9

    const v16, -0x41902f7f

    xor-int v14, v14, v16

    const v16, 0xe18e678

    :goto_7
    xor-int v13, v13, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6badc0d5 -> :sswitch_9
        -0x67b9a43f -> :sswitch_0
        -0x669d3df0 -> :sswitch_c
        -0x5fc1c97c -> :sswitch_2
        -0x5f6651bb -> :sswitch_d
        -0x5b7d0ebf -> :sswitch_0
        -0x58c21615 -> :sswitch_b
        -0x46a5b392 -> :sswitch_3
        -0x3fb2fce4 -> :sswitch_5
        -0x39f0221a -> :sswitch_d
        -0x357ef9fb -> :sswitch_6
        -0x309b09f0 -> :sswitch_8
        -0x2da7870b -> :sswitch_8
        -0x2b3ec95d -> :sswitch_a
        -0x206f70d6 -> :sswitch_4
        -0x190f80d9 -> :sswitch_3
        -0x1450b553 -> :sswitch_1
        -0x91f3e31 -> :sswitch_7
        -0x5ff0e9 -> :sswitch_7
        0x1e8164d8 -> :sswitch_1
        0x371344e4 -> :sswitch_9
        0x3b93f6e3 -> :sswitch_a
        0x4e3a0868 -> :sswitch_b
        0x64e6e6a7 -> :sswitch_2
        0x68d53d85 -> :sswitch_5
        0x68e9e34d -> :sswitch_4
        0x7b5b30f1 -> :sswitch_6
        0x7d3ea65d -> :sswitch_c
    .end sparse-switch
.end method
