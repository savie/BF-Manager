.class public final synthetic Ll/᩶ۤ᩺;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/ۘ۠᩺;

.field public final synthetic ۫:Ll/ۜ۟᩺;

.field public final synthetic ܺ:Ljava/lang/String;

.field public final synthetic ܽ:Landroid/app/Activity;

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ۘ۠᩺;Landroid/app/Activity;Ll/ۜ۟᩺;)V
    .locals 6

    const v0, -0x14dcb849

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7a\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x18b5

    const v5, -0x13276c1a

    xor-int/2addr v4, v5

    const v5, 0x6e2c9934

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5845

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/᩶ۤ᩺;->ܺ:Ljava/lang/String;

    iput-object p2, p0, Ll/᩶ۤ᩺;->᩶:Ljava/lang/String;

    .line 4
    sget-boolean v3, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v3, :cond_c

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v3, :cond_b

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez v3, :cond_3

    goto/16 :goto_2

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/᩶ۤ᩺;->ܽ:Landroid/app/Activity;

    iput-object p5, p0, Ll/᩶ۤ᩺;->۫:Ll/ۜ۟᩺;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/᩶ۤ᩺;->֡:Ll/ۘ۠᩺;

    .line 4
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_0

    const-string v3, "\u1a7b\u06da"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x11ff

    const v5, -0x7a24a40f

    xor-int/2addr v4, v5

    const v5, 0x4169cbeb

    goto :goto_0

    :cond_0
    const-string v3, "\u06e7\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6c87

    const v5, 0x38b4879a

    xor-int/2addr v4, v5

    const v5, -0x50eee774

    goto :goto_0

    .line 1
    :sswitch_7
    sget-boolean v3, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x459f

    const v5, 0x3e8e6bd7

    xor-int/2addr v4, v5

    const v5, -0x7489f93c

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a73\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e37

    const v5, 0x3284562e

    xor-int/2addr v4, v5

    const v5, -0x62661947

    goto/16 :goto_0

    .line 2
    :sswitch_9
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u073f\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6103

    const v5, 0x5691550b

    xor-int/2addr v4, v5

    const v5, -0x2c05739c

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3129

    const v5, -0x437a9671

    xor-int/2addr v4, v5

    const v5, -0x594d99f6

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a74\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6745

    const v5, -0x46f05151

    xor-int/2addr v4, v5

    const v5, -0x46bd5dc

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x673b

    const v5, -0x461d298d

    xor-int/2addr v4, v5

    const v5, 0x2d1c24d7

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a78\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6c99

    const v5, -0x3302b395

    xor-int/2addr v4, v5

    const v5, 0x2c9b141

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06da\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c1

    const v5, -0x551d9f8c

    xor-int/2addr v4, v5

    const v5, -0x2489d796    # -6.928728E16f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb45

    const v5, 0x50d9751b

    xor-int/2addr v4, v5

    const v5, 0xddb7a6f

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget-boolean v3, Ll/᩶;->ۚۤۘ:Z

    if-eqz v3, :cond_a

    :cond_9
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e77

    const v5, -0x5697fca1

    xor-int/2addr v4, v5

    const v5, 0x1d904a05

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a77\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3113

    const v5, 0x6718c23c

    xor-int/2addr v4, v5

    const v5, -0x523710fa

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x147d

    const v5, -0x5ec5e93b

    xor-int/2addr v4, v5

    const v5, 0x5cc8c280

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b0d

    const v5, -0x6f061b2f

    xor-int/2addr v4, v5

    const v5, 0x3d090d7d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66a36ce1 -> :sswitch_e
        -0x65fe1ca7 -> :sswitch_7
        -0x6543598c -> :sswitch_2
        -0x61f5e9e4 -> :sswitch_c
        -0x5a4f70b0 -> :sswitch_9
        -0x5a20c03e -> :sswitch_7
        -0x593f8a05 -> :sswitch_d
        -0x488ba7c1 -> :sswitch_1
        -0x43001f4d -> :sswitch_4
        -0x3f32aa15 -> :sswitch_a
        -0x3dcfda54 -> :sswitch_6
        -0x395f543f -> :sswitch_a
        -0x2e66f1fc -> :sswitch_b
        -0x1b72e6f6 -> :sswitch_d
        -0xb30880a -> :sswitch_2
        -0x9f22d28 -> :sswitch_8
        0x8560c77 -> :sswitch_b
        0x21c9fd1e -> :sswitch_e
        0x21f7a457 -> :sswitch_0
        0x30ca863a -> :sswitch_4
        0x35424e86 -> :sswitch_1
        0x379389b1 -> :sswitch_5
        0x4a5dab89 -> :sswitch_0
        0x4e148860 -> :sswitch_6
        0x539d590f -> :sswitch_3
        0x5f2e58c1 -> :sswitch_8
        0x5fffdda7 -> :sswitch_c
        0x6da20d45 -> :sswitch_3
        0x71550442 -> :sswitch_9
        0x7a8149e9 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x40c2fc4c

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v6, "\u06ec\u073d"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4d31

    const v8, -0x446f9b82

    xor-int/2addr v7, v8

    const v8, 0x6cf4f9f1

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x2b63

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget v6, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v6, :cond_6

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v6, Ll/ۘۗ;->ۖۧ۬:I

    if-gez v6, :cond_5

    goto/16 :goto_4

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget-boolean v6, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez v6, :cond_8

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v6

    if-eqz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u06e8\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x1b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5993

    const v8, 0x1d8c6f93

    xor-int/2addr v7, v8

    const v8, -0x7c56f0c0

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto/16 :goto_4

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v3, p0, Ll/᩶ۤ᩺;->᩶:Ljava/lang/String;

    iget-object v4, p0, Ll/᩶ۤ᩺;->֡:Ll/ۘ۠᩺;

    invoke-static {v2, v3, v4, v0, v1}, Ll/᩸۟᩺;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/ۘ۠᩺;Landroid/app/Activity;Ll/ۜ۟᩺;)V

    return-void

    :sswitch_6
    iget-object v2, p0, Ll/᩶ۤ᩺;->ܺ:Ljava/lang/String;

    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u06d8\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3b49

    const v8, -0x3fbf011d

    xor-int/2addr v7, v8

    const v8, 0xa91c07a

    goto :goto_0

    :sswitch_7
    iget-object v1, p0, Ll/᩶ۤ᩺;->۫:Ll/ۜ۟᩺;

    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v6, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v6, "\u06d7\u06d6"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3afd

    const v8, 0x512f33aa

    xor-int/2addr v7, v8

    const v8, 0x6b7b357d

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget-boolean v6, Ll/᩶;->ۚۤۘ:Z

    if-eqz v6, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v6, "\u1a78\u06e1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x19

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x33c5

    const v8, 0x2b6eb211

    xor-int/2addr v7, v8

    const v8, 0x3d74e991

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v6, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u1a74\u06e4"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4781

    const v8, -0x20eb23f1

    xor-int/2addr v7, v8

    const v8, -0x139e2663

    goto/16 :goto_0

    :cond_5
    :goto_1
    const-string v6, "\u06d9\u0736"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x60d5

    const v8, -0x534ca6ca

    xor-int/2addr v7, v8

    const v8, -0x161da736

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u0733\u06d7"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7b57

    const v8, 0x594470a5

    xor-int/2addr v7, v8

    const v8, -0x4016177b

    goto/16 :goto_0

    .line 2
    :sswitch_a
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_7
    const-string v6, "\u1a77\u05ab"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5e5b

    const v8, 0x4b476698    # 1.3067928E7f

    xor-int/2addr v7, v8

    const v8, -0x34a67bd0    # -1.4255152E7f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    :goto_2
    const-string v6, "\u06e7\u06eb"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1c79

    const v8, -0x4f9a802b

    xor-int/2addr v7, v8

    const v8, -0x50f3e3da

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a7a\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x57

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x20cf

    const v8, 0x87d1053

    xor-int/2addr v7, v8

    const v8, 0xaee5781

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_3

    :cond_a
    const-string v6, "\u1a79\u06e0"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6e59

    const v8, 0x58c8c2d5

    xor-int/2addr v7, v8

    const v8, -0x6c871dc2

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v6, Ll/ۗ;->֨۬ۖ:I

    if-ltz v6, :cond_b

    :goto_3
    const-string v6, "\u0733\u06d6"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x37bb

    const v8, 0x41403c30

    xor-int/2addr v7, v8

    const v8, 0x3257535a

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a73\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x53ef

    const v8, -0x7e462bc3

    xor-int/2addr v7, v8

    const v8, -0x150257e0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/᩶ۤ᩺;->ܽ:Landroid/app/Activity;

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v6

    if-gtz v6, :cond_c

    :goto_4
    const-string v6, "\u06e1\u1a75"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x41

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6185

    const v8, 0x5cfa344b

    xor-int/2addr v7, v8

    const v8, 0x41e30920

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d7\u06eb"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x78cd

    const v8, 0x64acac03

    xor-int/2addr v7, v8

    const v8, 0x7b6e7af7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f3759bd -> :sswitch_9
        -0x7c79a405 -> :sswitch_2
        -0x6b6e1565 -> :sswitch_5
        -0x6902e342 -> :sswitch_c
        -0x64c1b2e4 -> :sswitch_6
        -0x601ac4e0 -> :sswitch_1
        -0x5f993713 -> :sswitch_4
        -0x4bf82132 -> :sswitch_8
        -0x439e3784 -> :sswitch_2
        -0x2ec2d05a -> :sswitch_3
        -0x1cb11dd3 -> :sswitch_8
        -0x57298d2 -> :sswitch_3
        0x617266b -> :sswitch_d
        0x7a82db6 -> :sswitch_0
        0x21e9ff3e -> :sswitch_9
        0x230b9da0 -> :sswitch_d
        0x2972bfec -> :sswitch_b
        0x2d142f80 -> :sswitch_4
        0x2f4d933e -> :sswitch_e
        0x331ed201 -> :sswitch_6
        0x34911983 -> :sswitch_e
        0x3832a0df -> :sswitch_7
        0x46541501 -> :sswitch_a
        0x4865b0ab -> :sswitch_1
        0x531c8179 -> :sswitch_7
        0x614ad7e1 -> :sswitch_a
        0x6c76badc -> :sswitch_b
        0x72cd3233 -> :sswitch_0
        0x74013c56 -> :sswitch_5
        0x74fe62b3 -> :sswitch_c
    .end sparse-switch
.end method
