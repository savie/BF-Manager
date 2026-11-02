.class public final synthetic Ll/ۜۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ۫:Ll/ۨۤ᩺;

.field public final synthetic ܺ:Ljava/lang/String;

.field public final synthetic ܽ:Landroid/app/Activity;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ll/ۨۤ᩺;)V
    .locals 6

    const v0, 0x11587c4c

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    sget v2, Ll/֡᩶;->ۗ֨ܺ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1e83

    const v5, 0x6589f011

    xor-int/2addr v4, v5

    const v5, -0x7019dd4

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x4873

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p3, p0, Ll/ۜۤ᩺;->֡:Ljava/lang/String;

    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_1

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06d7\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x57bd

    const v5, -0xa423258

    xor-int/2addr v4, v5

    const v5, 0x47fb930d

    goto :goto_0

    .line 1
    :sswitch_1
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_5

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v3

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-object p4, p0, Ll/ۜۤ᩺;->ܽ:Landroid/app/Activity;

    iput-object p5, p0, Ll/ۜۤ᩺;->۫:Ll/ۨۤ᩺;

    return-void

    :cond_1
    const-string v3, "\u1a76\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3291

    const v5, 0x7e0db9d8

    xor-int/2addr v4, v5

    const v5, -0x6ff8870a

    goto :goto_0

    .line 3
    :sswitch_6
    sget v3, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xe73

    const v5, 0x3aa9be5e

    xor-int/2addr v4, v5

    const v5, 0x1d03ff2a

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x20f

    const v5, 0x651e1204

    xor-int/2addr v4, v5

    const v5, 0x48eefea6

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u05a8\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x511b

    const v5, 0x2c130263

    xor-int/2addr v4, v5

    const v5, 0x4fd3a52e

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u073a\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1821

    const v5, 0x1d35febc

    xor-int/2addr v4, v5

    const v5, 0x6ccd6ac4

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a78\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x735b

    const v5, -0x6388fb8d

    xor-int/2addr v4, v5

    const v5, 0x29eeee7e

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_7

    :goto_2
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x71f1

    const v5, 0x15b066d

    xor-int/2addr v4, v5

    const v5, 0x1bde38fa

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a1\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x12b

    const v5, 0x6c6ee184

    xor-int/2addr v4, v5

    const v5, 0x1b89fbe2

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06df\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5217

    const v5, 0x1ed993e9

    xor-int/2addr v4, v5

    const v5, -0x4ec8fa91

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a74\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4cb1

    const v5, -0x83c2d40

    xor-int/2addr v4, v5

    const v5, 0xf6a787d

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06e8\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x4d

    const v5, -0x3b5e8e94

    xor-int/2addr v4, v5

    const v5, 0x40019b9e

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06d7\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1a99

    const v5, 0x5beebe52

    xor-int/2addr v4, v5

    const v5, -0x9f32905

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ۜۤ᩺;->ܺ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۜۤ᩺;->᩶:Ljava/lang/String;

    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u05a1\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7345

    const v5, 0x5bf2db0

    xor-int/2addr v4, v5

    const v5, -0x2aeb2f28

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3da3

    const v5, 0x25750364

    xor-int/2addr v4, v5

    const v5, -0x55c6908f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76e32c7a -> :sswitch_6
        -0x73f5a425 -> :sswitch_2
        -0x707da07a -> :sswitch_9
        -0x5eb1f2df -> :sswitch_0
        -0x5da7f1b9 -> :sswitch_0
        -0x4830106c -> :sswitch_4
        -0x41acdb1f -> :sswitch_d
        -0x4168c66b -> :sswitch_8
        -0x332e1cee -> :sswitch_a
        -0x2e690ecc -> :sswitch_c
        -0x19437cd5 -> :sswitch_9
        -0x152a3f94 -> :sswitch_b
        -0x41168ad -> :sswitch_8
        -0x8e5d62 -> :sswitch_1
        0x87edb6 -> :sswitch_c
        0x18949ac -> :sswitch_3
        0x287810d -> :sswitch_1
        0x8b2a683 -> :sswitch_4
        0xe47c1e4 -> :sswitch_5
        0x1c4d9f77 -> :sswitch_b
        0x2e9ee8cb -> :sswitch_5
        0x31a825ee -> :sswitch_7
        0x324d1d22 -> :sswitch_a
        0x3262f5a9 -> :sswitch_e
        0x3d40b929 -> :sswitch_d
        0x426e891c -> :sswitch_3
        0x5cbcc3aa -> :sswitch_7
        0x5e3c11fb -> :sswitch_e
        0x7f3f69de -> :sswitch_6
        0x7fa2407d -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x96e62d9

    sget v4, Ll/ۗ;->֨۬ۖ:I

    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v6, "\u1a75\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x65

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5c2b

    const v8, 0x108b1a98

    xor-int/2addr v7, v8

    const v8, 0x4bf63a6c    # 3.2273624E7f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x3f3

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget v6, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v6, :cond_2

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v6, :cond_5

    goto/16 :goto_4

    :sswitch_1
    sget v6, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v6, :cond_b

    goto :goto_1

    .line 4
    :sswitch_2
    sget v6, Ll/֫ᩳ;->۬֨᩸:I

    if-lez v6, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v3, p0, Ll/ۜۤ᩺;->᩶:Ljava/lang/String;

    iget-object v4, p0, Ll/ۜۤ᩺;->֡:Ljava/lang/String;

    invoke-static {v2, v3, v4, v0, v1}, Ll/᩸۟᩺;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Ll/ۨۤ᩺;)V

    return-void

    :sswitch_6
    iget-object v2, p0, Ll/ۜۤ᩺;->ܺ:Ljava/lang/String;

    sget-boolean v6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u1a7b\u1a73"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5115

    const v8, 0x705b0e69

    xor-int/2addr v7, v8

    const v8, -0x2893c6b7

    goto :goto_0

    :sswitch_7
    iget-object v1, p0, Ll/ۜۤ᩺;->۫:Ll/ۨۤ᩺;

    sget-boolean v6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u1a77\u0733"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x1b

    xor-int v7, v6, v4

    mul-int/lit8 v7, v7, -0x61

    const v8, -0x705d4bf9

    xor-int/2addr v7, v8

    const v8, 0xadafc72

    goto :goto_0

    :cond_2
    const-string v6, "\u0730\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xcbb

    const v8, -0xf992f83

    xor-int/2addr v7, v8

    const v8, 0x7755e71

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v6, Ll/۟;->ۨᩴۛ:I

    if-ltz v6, :cond_3

    :goto_1
    const-string v6, "\u06d6\u06df"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x481f

    const v8, -0xe8a86a9

    xor-int/2addr v7, v8

    const v8, -0x62638fab

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u073d\u06d9"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x213d

    const v8, 0x472a8363

    xor-int/2addr v7, v8

    const v8, -0x1749cbea

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget-boolean v6, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u1a78\u0730"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3379

    const v8, 0x43a1601b

    xor-int/2addr v7, v8

    const v8, 0x1775c7a8

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_6

    :cond_5
    :goto_2
    const-string v6, "\u06d7\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x49e7

    const v8, 0x32599c70

    xor-int/2addr v7, v8

    const v8, -0x3f4acae7

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u1a73\u06da"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x15

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4d3d

    const v8, -0x68d51121

    xor-int/2addr v7, v8

    const v8, -0x4cf252dd

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v6, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v6, :cond_7

    goto :goto_4

    :cond_7
    const-string v6, "\u1a79\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7093

    const v8, -0x1ec8f293

    xor-int/2addr v7, v8

    const v8, -0xd36c822

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v6

    if-eqz v6, :cond_8

    :goto_3
    const-string v6, "\u06e0\u1a7b"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3f9f

    const v8, -0x63b283cb

    xor-int/2addr v7, v8

    const v8, -0x62973910

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u06da\u06d7"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x1b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5dc9

    const v8, 0x4e0e0abc

    xor-int/2addr v7, v8

    const v8, 0x50217865

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget-boolean v6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u073f\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2a23

    const v8, -0x3956cce6

    xor-int/2addr v7, v8

    const v8, -0x8524be

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06ec\u06db"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2239

    const v8, -0x5971dc29

    xor-int/2addr v7, v8

    const v8, 0xe9cd9ac

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ۜۤ᩺;->ܽ:Landroid/app/Activity;

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v6

    if-gtz v6, :cond_c

    :cond_b
    const-string v6, "\u06df\u06da"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x482f

    const v8, -0x1d7bd375

    xor-int/2addr v7, v8

    const v8, -0x9ee3b22

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e7\u073a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x64a9

    const v8, -0x29615f96

    xor-int/2addr v7, v8

    const v8, 0x1ee647d4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aed18f2 -> :sswitch_5
        -0x70bbc232 -> :sswitch_b
        -0x69c318f0 -> :sswitch_4
        -0x664bf7ea -> :sswitch_e
        -0x65301144 -> :sswitch_6
        -0x5a791164 -> :sswitch_8
        -0x4d301557 -> :sswitch_8
        -0x41b01502 -> :sswitch_d
        -0x3b3edf33 -> :sswitch_0
        -0x3319361d -> :sswitch_d
        -0x2da843bb -> :sswitch_6
        -0x2d64aee5 -> :sswitch_7
        -0x2c7b7a5b -> :sswitch_5
        -0x2378c2eb -> :sswitch_e
        -0x2338e502 -> :sswitch_4
        -0xcf3241c -> :sswitch_9
        0x228b75b -> :sswitch_a
        0xbf1a30b -> :sswitch_0
        0x155b053b -> :sswitch_1
        0x2724e687 -> :sswitch_a
        0x311e1253 -> :sswitch_2
        0x38d8faa9 -> :sswitch_b
        0x3fd0b8c2 -> :sswitch_9
        0x44e10d89 -> :sswitch_2
        0x4d8a32db -> :sswitch_3
        0x4f04c371 -> :sswitch_c
        0x5fe0fc55 -> :sswitch_c
        0x6164e198 -> :sswitch_7
        0x717997f2 -> :sswitch_3
        0x7ce98fb5 -> :sswitch_1
    .end sparse-switch
.end method
