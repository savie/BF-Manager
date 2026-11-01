.class public final Ll/۠ᩴۘ;
.super Ll/ۗ᩷᩺;
.source "C2R7"


# static fields
.field private static final ۫۫ۛ:[S


# instance fields
.field public ֨:Ljava/util/ArrayList;

.field public ۘ:Z

.field public final synthetic ۜ:Ll/ۙ۠ۘ;

.field public final ۬:Landroid/content/pm/PackageManager;

.field public ᩹:Ll/۠֡ۚ;

.field public final synthetic ᩺:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x62

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    const/16 v0, 0x3e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ᩴۘ;->۫۫ۛ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x949s
        -0x79b7s
        -0x79b9s
        -0x79b7s
        -0x79bfs
        -0x79b0s
        -0x79bds
        -0x79b1s
        -0x79b3s
        -0x79f2s
        -0x79bfs
        -0x79b2s
        -0x79bcs
        -0x79aes
        -0x79b1s
        -0x79b7s
        -0x79bcs
        -0x79f2s
        -0x79b0s
        -0x79bbs
        -0x79aes
        -0x79b3s
        -0x79b7s
        -0x79ads
        -0x79ads
        -0x79b7s
        -0x79b1s
        -0x79b2s
        -0x79f2s
        -0x7999s
        -0x799bs
        -0x798cs
        -0x7981s
        -0x7997s
        -0x7992s
        -0x798ds
        -0x798cs
        -0x799fs
        -0x7994s
        -0x7994s
        -0x799bs
        -0x799cs
        -0x7981s
        -0x799fs
        -0x7990s
        -0x7990s
        -0x798ds
        0x8c6s
        -0x1d47s
        -0x162s
        -0x2436s
        -0x1e4cs
        0x13bfs
        0x1915s
        0x1d5cs
        -0x2f4ds
        0xa91s
        -0x108fs
        -0x2aces
        -0xfcds
        -0x6e3s
        -0x1205s
    .end array-data
.end method

.method public constructor <init>(Ll/ۙ۠ۘ;I)V
    .locals 5

    const v0, -0x404c7b81

    sget v1, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    .line 488
    iput-object p1, p0, Ll/۠ᩴۘ;->ۜ:Ll/ۙ۠ۘ;

    iput p2, p0, Ll/۠ᩴۘ;->᩺:I

    invoke-direct {p0}, Ll/ۗ᩷᩺;-><init>()V

    const-string p2, "\u06e8\u06ec"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x561f

    const v4, 0x28be8a80

    xor-int/2addr v3, v4

    const v4, -0x2b5c9567

    :goto_0
    xor-int/2addr p2, v4

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x48dd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v3

    xor-int/2addr v0, p2

    sparse-switch v0, :sswitch_data_0

    .line 489
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    iput-object p2, p0, Ll/۠ᩴۘ;->۬:Landroid/content/pm/PackageManager;

    sget-boolean p2, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez p2, :cond_c

    goto/16 :goto_4

    .line 9
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result p2

    if-eqz p2, :cond_5

    goto/16 :goto_4

    .line 368
    :sswitch_1
    sget p2, Ll/ۧ;->֫۠ᩴ:I

    if-gez p2, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    sget-boolean p2, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez p2, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 491
    iput-boolean p1, p0, Ll/۠ᩴۘ;->ۘ:Z

    return-void

    :sswitch_6
    sget p2, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz p2, :cond_0

    const-string p2, "\u1a73\u1a73"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v2, p2

    mul-int/lit8 p2, p2, -0x4f

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x28d9

    const v4, -0x60782eeb

    xor-int/2addr v3, v4

    const v4, 0x43bd7d3b

    goto :goto_0

    :cond_0
    const-string p2, "\u06d6\u05ab"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, -0x15df

    const v4, -0x60678bd3

    xor-int/2addr v3, v4

    const v4, -0x1b1af4e3

    goto :goto_0

    .line 116
    :sswitch_7
    sget p2, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz p2, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p2, "\u1a7a\u1a7a"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x1577

    const v4, 0x5358f602

    xor-int/2addr v3, v4

    const v4, 0x2c5dff71

    goto/16 :goto_0

    :sswitch_8
    sget-boolean p2, Ll/᩶;->ۚۤۘ:Z

    if-eqz p2, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string p2, "\u0733\u06da"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v1

    mul-int/lit8 p2, p2, 0x63

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x5463

    const v4, -0x5e845acb

    xor-int/2addr v3, v4

    const v4, 0xef07689

    goto/16 :goto_0

    .line 313
    :sswitch_9
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result p2

    if-ltz p2, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string p2, "\u1a74\u05a8"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x6eeb

    const v4, 0x55a55362

    xor-int/2addr v3, v4

    const v4, -0x7d921483

    goto/16 :goto_0

    .line 448
    :sswitch_a
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_1

    :cond_4
    const-string p2, "\u06d8\u06da"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x7eb7

    const v4, -0x4dc66f94

    xor-int/2addr v3, v4

    const v4, 0x3aaa76ad

    goto/16 :goto_0

    .line 274
    :sswitch_b
    sget p2, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz p2, :cond_6

    :cond_5
    :goto_1
    const-string p2, "\u0730\u06df"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v1, p2

    mul-int/lit8 p2, p2, -0x1b

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x610f

    const v4, 0x339b51b9

    xor-int/2addr v3, v4

    const v4, 0x75b0fc44

    goto/16 :goto_0

    :cond_6
    const-string p2, "\u06eb\u0733"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v2, p2

    mul-int/lit8 p2, p2, 0x2b

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x62e9

    const v4, 0x78f4a09d

    xor-int/2addr v3, v4

    const v4, -0xe64b1d9

    goto/16 :goto_0

    .line 276
    :sswitch_c
    sget p2, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz p2, :cond_7

    goto :goto_4

    :cond_7
    const-string p2, "\u06eb\u05a1"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    mul-int/lit8 p2, p2, 0x6b

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x778b

    const v4, 0xc2252e5

    xor-int/2addr v3, v4

    const v4, 0x1c772a4e

    goto/16 :goto_0

    :sswitch_d
    sget p2, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz p2, :cond_8

    :goto_2
    const-string p2, "\u06da\u05a8"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v1, p2

    mul-int/lit8 p2, p2, -0xf

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x75af

    const v4, 0x3210fb4b

    xor-int/2addr v3, v4

    const v4, -0x199eeec9

    goto/16 :goto_0

    :cond_8
    const-string p2, "\u0736\u06e2"

    invoke-static {p2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x43d5

    const v4, 0x6488592b

    xor-int/2addr v3, v4

    const v4, -0x5f7a423e

    goto/16 :goto_0

    :sswitch_e
    sget-boolean p2, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz p2, :cond_a

    :cond_9
    :goto_3
    const-string p2, "\u06dc\u0730"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    mul-int/lit8 p2, p2, -0x9

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x41e5

    const v4, 0x418cfc61

    xor-int/2addr v3, v4

    const v4, -0x5da9c351

    goto/16 :goto_0

    :cond_a
    const-string p2, "\u06dc\u0736"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    mul-int/lit8 p2, p2, -0x21

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x4397

    const v4, 0x6ebb9431

    xor-int/2addr v3, v4

    const v4, 0xcf50943

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string p2, "\u1a77\u073a"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v2, p2

    mul-int/lit8 p2, p2, 0x19

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, -0x50db

    const v4, 0x2715885f

    xor-int/2addr v3, v4

    const v4, 0x24b85fe1

    goto/16 :goto_0

    :cond_c
    const-string p2, "\u1a75\u06e4"

    invoke-static {p2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v2, p2

    mul-int/lit8 p2, p2, 0x65

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x5861

    const v4, 0x165ff6a

    xor-int/2addr v3, v4

    const v4, 0x3d8eddf0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7877afca -> :sswitch_4
        -0x74adf4a9 -> :sswitch_0
        -0x693ee18c -> :sswitch_1
        -0x5708e928 -> :sswitch_d
        -0x5500265f -> :sswitch_e
        -0x515f390c -> :sswitch_7
        -0x4ebd6e16 -> :sswitch_8
        -0x3bc6ec83 -> :sswitch_a
        -0x2f871811 -> :sswitch_5
        -0x2a9316de -> :sswitch_c
        -0x19a77697 -> :sswitch_2
        -0x495395 -> :sswitch_a
        0xe8a898d -> :sswitch_b
        0x12754922 -> :sswitch_c
        0x14114dc7 -> :sswitch_6
        0x17ded747 -> :sswitch_3
        0x188fe97b -> :sswitch_9
        0x18cccdd5 -> :sswitch_3
        0x1ae0423b -> :sswitch_7
        0x247e3f78 -> :sswitch_d
        0x309ec045 -> :sswitch_8
        0x41fb0345 -> :sswitch_e
        0x4672258d -> :sswitch_b
        0x54e7251e -> :sswitch_4
        0x5615c004 -> :sswitch_5
        0x5871e731 -> :sswitch_1
        0x5d98a320 -> :sswitch_2
        0x654a91b0 -> :sswitch_9
        0x73be8c2e -> :sswitch_6
        0x7b4dc939 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ۖ()V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0xeec2b2c

    sget v8, Ll/֫᩺;->᩺۟ۘ:I

    sget v9, Ll/ۗᩳ;->ۚۤ֡:I

    const-string v10, "\u06db\u1a7a"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x15f9

    const v12, 0x4b1c04c2    # 1.0224834E7f

    xor-int/2addr v11, v12

    const v12, 0x34d2f0f9

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0x7505

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 584
    invoke-static {v6}, Ll/֫ܶ;->᩸ۘۤ(Ljava/lang/Object;)V

    goto :goto_1

    .line 255
    :sswitch_0
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    sget v10, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v10, :cond_b

    goto/16 :goto_2

    :sswitch_1
    sget v10, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v10, :cond_7

    goto/16 :goto_3

    .line 562
    :sswitch_2
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget-boolean v10, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-eqz v10, :cond_5

    goto/16 :goto_3

    .line 70
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    return-void

    .line 586
    :sswitch_5
    invoke-static {v0}, Ll/ۙ۠ۘ;->۟(Ll/ۙ۠ۘ;)V

    .line 587
    invoke-static {v0}, Ll/ۙ۠ۘ;->ۛ(Ll/ۙ۠ۘ;)V

    return-void

    .line 582
    :sswitch_6
    invoke-virtual {v5, v3}, Ll/ۛۧܰ;->ۙ(Z)V

    .line 583
    iget-object v6, p0, Ll/۠ᩴۘ;->᩹:Ll/۠֡ۚ;

    if-eqz v6, :cond_0

    const-string v10, "\u06df\u0730"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x2f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x715

    const v12, -0x2ca37878

    xor-int/2addr v11, v12

    const v12, -0x15762c86

    goto :goto_0

    :cond_0
    :goto_1
    const-string v10, "\u073a\u1a73"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x526f

    const v12, -0xd4a0341

    xor-int/2addr v11, v12

    const v12, 0x79140a11

    goto :goto_0

    .line 582
    :sswitch_7
    iget-object v5, v4, Ll/۫ᩴۘ;->ۨ:Ll/ۛۧܰ;

    .line 84
    sget-boolean v10, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v10, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v10, "\u06df\u0736"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xfdd

    const v12, 0x6ae30a4b

    xor-int/2addr v11, v12

    const v12, 0xa19eeed

    goto/16 :goto_0

    .line 581
    :sswitch_8
    invoke-virtual {v2, v3}, Ll/ۛۧܰ;->ۙ(Z)V

    .line 582
    invoke-static {v0}, Ll/ۙ۠ۘ;->᩵(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v4

    .line 159
    sget v10, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v10, :cond_2

    goto :goto_2

    :cond_2
    const-string v10, "\u06e2\u05a1"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7de3

    const v12, 0x1d553db

    xor-int/2addr v11, v12

    const v12, -0x1d8b7d6c

    goto/16 :goto_0

    .line 581
    :sswitch_9
    iget-object v2, v1, Ll/۫ᩴۘ;->ۨ:Ll/ۛۧܰ;

    const/4 v3, 0x0

    .line 51
    sget-boolean v10, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v10, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v10, "\u06e4\u06db"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4eed

    const v12, 0x2ab35959

    xor-int/2addr v11, v12

    const v12, -0x5926ffdb

    goto/16 :goto_0

    .line 581
    :sswitch_a
    invoke-static {v0}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    .line 8
    sget v10, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v10, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v10, "\u05a8\u05ab"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x128b

    const v12, 0x7a3cb6d8

    xor-int/2addr v11, v12

    const v12, -0x72efe920

    goto/16 :goto_0

    .line 268
    :sswitch_b
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v10

    if-eqz v10, :cond_6

    :cond_5
    :goto_2
    const-string v10, "\u0736\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x55

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x34b

    const v12, 0x61fe5d83

    xor-int/2addr v11, v12

    const v12, -0x241da19b

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u1a76\u06e0"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7875

    const v12, 0x2952974d

    xor-int/2addr v11, v12

    const v12, -0x63d21526

    goto/16 :goto_0

    :sswitch_c
    sget v10, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v10, :cond_8

    :cond_7
    const-string v10, "\u06dc\u06da"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x51

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x11ab

    const v12, -0x2dd1334d

    xor-int/2addr v11, v12

    const v12, 0x8cd32e0

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a74\u1a73"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x61

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7e8f

    const v12, -0x72f4aacf

    xor-int/2addr v11, v12

    const v12, 0x7681081a

    goto/16 :goto_0

    :sswitch_d
    sget v10, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v10, :cond_9

    goto/16 :goto_5

    :cond_9
    const-string v10, "\u05ab\u06e8"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x57db

    const v12, 0x1dcca02

    xor-int/2addr v11, v12

    const v12, 0x12b7bf30

    goto/16 :goto_0

    :sswitch_e
    sget v10, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v10, :cond_a

    :goto_3
    const-string v10, "\u1a73\u06db"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x49

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6777

    const v12, 0x27cf26a0

    xor-int/2addr v11, v12

    const v12, -0x2c327e0a

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u05ab\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0xf

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3c5d

    const v12, 0x63bfef91

    xor-int/2addr v11, v12

    const v12, -0x3cad511a

    goto/16 :goto_0

    .line 12
    :sswitch_f
    sget v10, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v10, :cond_c

    :cond_b
    :goto_4
    const-string v10, "\u05a8\u06e4"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x582b

    const v12, 0x55848760

    xor-int/2addr v11, v12

    const v12, -0x74d38d5

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u05ab\u05ab"

    invoke-static {v10}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x5d

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x38f1

    const v12, -0x61b8b1ce

    xor-int/2addr v11, v12

    const v12, 0x2e0b2d97

    goto/16 :goto_0

    .line 581
    :sswitch_10
    iget-object v0, p0, Ll/۠ᩴۘ;->ۜ:Ll/ۙ۠ۘ;

    sget v10, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v10, :cond_d

    :goto_5
    const-string v10, "\u06da\u06e7"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x71

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x79e3

    const v12, 0x6b3a1691

    xor-int/2addr v11, v12

    const v12, -0x30b3c5d7

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u06d9\u1a7b"

    invoke-static {v10}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6ecb

    const v12, -0x6c426606

    xor-int/2addr v11, v12

    const v12, 0x25c44dfa

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7728a29b -> :sswitch_4
        -0x5f58ad0d -> :sswitch_8
        -0x5dec9749 -> :sswitch_c
        -0x552d1047 -> :sswitch_10
        -0x54642ca6 -> :sswitch_b
        -0x4bf4046d -> :sswitch_9
        -0x354e1859 -> :sswitch_3
        -0x33417f72 -> :sswitch_b
        -0x29cb672c -> :sswitch_d
        -0x1b9d2b80 -> :sswitch_a
        -0x18ebfe29 -> :sswitch_5
        -0x144aa805 -> :sswitch_a
        -0x574da18 -> :sswitch_9
        0x40967f7 -> :sswitch_0
        0x87fd88b -> :sswitch_5
        0xb79b9e0 -> :sswitch_1
        0x1a25ab88 -> :sswitch_10
        0x1b8d3d9b -> :sswitch_0
        0x20dd3b83 -> :sswitch_2
        0x22f1fc73 -> :sswitch_6
        0x244e27a7 -> :sswitch_f
        0x36bfad93 -> :sswitch_4
        0x3cdbe8fd -> :sswitch_8
        0x48929bd4 -> :sswitch_e
        0x4f2f21c4 -> :sswitch_2
        0x525f2533 -> :sswitch_f
        0x52bee989 -> :sswitch_3
        0x54b519de -> :sswitch_e
        0x5509b28e -> :sswitch_7
        0x652c8fa6 -> :sswitch_c
        0x66b280a8 -> :sswitch_1
        0x7c74a9d4 -> :sswitch_7
        0x7d82b4d1 -> :sswitch_6
        0x7eb75219 -> :sswitch_d
    .end sparse-switch
.end method

.method public final ۙ()V
    .locals 30

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x3311702f

    sget v24, Ll/֡ۚ;->ۢܰ᩸:I

    sget v25, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v26, "\u06d7\u06df"

    invoke-static/range {v26 .. v26}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v26

    xor-int v26, v26, v24

    xor-int v1, v26, v25

    mul-int/lit16 v1, v1, -0x41f5

    const v28, -0x5fb19886

    xor-int v1, v1, v28

    const v28, -0x63212544

    xor-int v26, v26, v28

    move-object/from16 v23, v2

    move-object/from16 v28, v3

    move-object v14, v13

    move-object/from16 v17, v16

    move-object/from16 v20, v19

    move/from16 v27, v26

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v26, 0x3311702f

    move-object v13, v12

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v4, v26, v25

    mul-int/lit16 v4, v4, 0x3d5

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v26, v27, v1

    sparse-switch v26, :sswitch_data_0

    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    const/16 v1, 0x1db0

    const/16 v3, 0x1db0

    goto/16 :goto_c

    .line 1194
    :sswitch_0
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    goto/16 :goto_7

    :cond_0
    move-object/from16 v27, v11

    goto/16 :goto_9

    .line 541
    :sswitch_1
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    goto/16 :goto_f

    .line 214
    :sswitch_2
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    sget-boolean v1, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v27, v11

    goto/16 :goto_3

    .line 552
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto :goto_1

    .line 19
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    return-void

    .line 555
    :sswitch_5
    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x5c80

    invoke-static {v2, v1, v3}, Ll/ᩴ᩶;->ۙ(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    .line 563
    :sswitch_6
    invoke-static/range {v20 .. v20}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7ed915f4

    xor-int/2addr v1, v4

    .line 564
    invoke-static {v12, v1, v14}, Ll/֨ۧ;->ᩳ֨ܶ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 565
    invoke-static {v12}, Ll/֫ۛ;->᩶ۖܿ(Ljava/lang/Object;)Ll/᩵ۡۜ;

    move-object/from16 v29, v12

    goto/16 :goto_5

    .line 563
    :sswitch_7
    new-instance v14, Ll/ᩴᩴۘ;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/16 v4, 0x3b

    move-object/from16 v27, v11

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/ۗܳ;->ۡܿۘ([SIII)Ljava/lang/String;

    move-result-object v20

    const-string v1, "\u1a7b\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x4b5

    const v11, -0x6d41dd75    # -1.1999201E-27f

    xor-int/2addr v4, v11

    const v11, 0x179875d3

    goto/16 :goto_4

    :sswitch_8
    move-object/from16 v27, v11

    .line 559
    invoke-static/range {v19 .. v19}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7d0f390c

    xor-int/2addr v1, v4

    const/4 v4, 0x0

    .line 563
    invoke-static {v12, v1, v4}, Ll/ۧ;->᩷ۤ۫(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-boolean v1, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u1a73\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x5319

    const v11, -0x28b99fff

    xor-int/2addr v4, v11

    const v11, -0x62efae58

    goto/16 :goto_4

    :sswitch_9
    move-object/from16 v27, v11

    const v1, 0x7d7ad786

    xor-int v1, v18, v1

    .line 559
    invoke-static {v12, v1, v13}, Ll/֫;->ܳܶۤ(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/16 v4, 0x38

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֫᩺;->ܰܶ֨([SIII)Ljava/lang/String;

    move-result-object v19

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v1, "\u1a75\u06d6"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x71

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x5e03

    const v11, -0x12dffe8b

    xor-int/2addr v4, v11

    const v11, -0x3d3dc2d6

    goto/16 :goto_4

    :sswitch_a
    move-object/from16 v27, v11

    .line 558
    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/16 v4, 0x35

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/۟;->ܳܳ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v18

    sget v1, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v1, :cond_5

    :goto_2
    const-string v1, "\u1a73\u0736"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x29d7

    const v11, -0x2f875905

    xor-int/2addr v4, v11

    const v11, 0x3587f589

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u05a8\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0xad7

    const v11, -0x1ba7200f

    xor-int/2addr v4, v11

    const v11, 0x526db58d

    goto/16 :goto_4

    :sswitch_b
    move-object/from16 v27, v11

    .line 557
    invoke-static/range {v17 .. v17}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7e7fa182

    xor-int/2addr v1, v4

    .line 558
    invoke-static {v12, v1}, Ll/ۖ᩸;->᩻ܶᩴ(Ljava/lang/Object;I)V

    new-instance v13, Ll/ᩳᩴۘ;

    invoke-direct {v13, v0}, Ll/ᩳᩴۘ;-><init>(Ll/۠ᩴۘ;)V

    const-string v1, "\u06da\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x7b

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x6197

    const v11, 0x4811f3a9

    xor-int/2addr v4, v11

    const v11, -0x170b1b8a

    goto/16 :goto_4

    :sswitch_c
    move-object/from16 v27, v11

    xor-int v1, v15, v16

    .line 557
    invoke-static {v12, v1}, Ll/֡֡;->ۙۗۛ(Ljava/lang/Object;I)V

    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/16 v4, 0x32

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֫᩺;->ܰܶ֨([SIII)Ljava/lang/String;

    move-result-object v17

    .line 482
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v1

    if-eqz v1, :cond_6

    :goto_3
    const-string v1, "\u06e2\u073a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x67

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x469

    const v11, -0x77bddf94

    xor-int/2addr v4, v11

    const v11, 0x6230b71d

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06e2\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x2379

    const v11, -0x72d8cb77

    xor-int/2addr v4, v11

    const v11, -0x661cf54b

    goto :goto_4

    :sswitch_d
    move-object/from16 v27, v11

    .line 557
    invoke-static {v2}, Ll/֫ۘ;->᩹᩶۠(Ljava/lang/Object;)Ll/۠ۡۜ;

    move-result-object v12

    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/16 v4, 0x2f

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֨۟;->ᩴۚۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    const v16, 0x7d371edd

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v1, :cond_7

    goto/16 :goto_9

    :cond_7
    const-string v1, "\u06d8\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x167b

    const v11, -0x3b61cd79

    xor-int/2addr v4, v11

    const v11, -0x4e27e35a

    goto :goto_4

    :sswitch_e
    move-object/from16 v27, v11

    .line 554
    invoke-static {v2}, Ll/ۙ۠ۘ;->᩺(Ll/ۙ۠ۘ;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "\u1a76\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x41

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0xedb

    const v11, 0x462e6cb7

    xor-int/2addr v4, v11

    const v11, 0x615f54

    goto :goto_4

    :cond_8
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x49bb

    const v11, -0x879385

    xor-int/2addr v4, v11

    const v11, 0x15ec033e

    :goto_4
    xor-int/2addr v1, v11

    move-object/from16 v11, v27

    goto/16 :goto_b

    .line 553
    :sswitch_f
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v4, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/4 v11, 0x6

    move-object/from16 v29, v12

    const/16 v12, 0x29

    invoke-static {v4, v11, v12, v3}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Ll/ۤܽ;->ۙ(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "\u06eb\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x5fd3

    const v12, 0x48715df5

    xor-int/2addr v4, v12

    const v12, -0x2fd67fa5

    goto :goto_6

    :sswitch_10
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 551
    invoke-static {v2}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    .line 1224
    iget-object v1, v1, Ll/۫ᩴۘ;->ۙ:Ll/֡ᩴۘ;

    iget-object v1, v1, Ll/֡ᩴۘ;->ۚ:Ll/۠᩵ᩴ;

    .line 552
    invoke-virtual {v1}, Ll/۠᩵ᩴ;->size()I

    move-result v1

    if-gt v1, v6, :cond_9

    const-string v1, "\u073a\u06e0"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x5bb1

    const v11, 0x57d56c91

    xor-int/2addr v4, v11

    const v11, -0x52cc6e8f

    goto/16 :goto_a

    :sswitch_11
    return-void

    :sswitch_12
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 551
    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/4 v4, 0x1

    const/4 v11, 0x5

    invoke-static {v1, v4, v11, v3}, Ll/֫᩺;->ܰܶ֨([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1, v5}, Ll/֫۟;->ܶ᩷ۨ(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x5757

    const v11, 0x11888fe6

    xor-int/2addr v4, v11

    const v11, 0x6a5278a6

    goto/16 :goto_a

    :cond_9
    move-object/from16 v11, v27

    :cond_a
    :goto_5
    const-string v1, "\u06df\u06ec"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x6213

    const v12, 0x75b75cce

    xor-int/2addr v4, v12

    const v12, 0x644fea7a

    :goto_6
    xor-int v27, v1, v12

    move v1, v4

    goto/16 :goto_e

    :sswitch_13
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 523
    new-instance v1, Ll/᩸۟ۘ;

    const/4 v4, 0x1

    invoke-direct {v1, v4, v0}, Ll/᩸۟ۘ;-><init>(ILjava/lang/Object;)V

    invoke-static {v9, v1}, Ll/᩶;->֫ۚۛ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 535
    new-instance v1, Ljava/lang/Thread;

    new-instance v4, Ll/ܶᩴۘ;

    iget v11, v0, Ll/۠ᩴۘ;->᩺:I

    invoke-direct {v4, v0, v11}, Ll/ܶᩴۘ;-><init>(Ll/۠ᩴۘ;I)V

    invoke-direct {v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 542
    invoke-static {v1}, Ll/ۖܽ;->ۢ᩹۠(Ljava/lang/Object;)V

    .line 543
    new-instance v1, Ljava/lang/Thread;

    .line 567
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v4

    if-nez v4, :cond_b

    :goto_7
    const-string v1, "\u0736\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, 0xb

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x51ad

    const v11, 0x5df4b97e

    xor-int/2addr v4, v11

    const v11, 0x1179d12b

    goto/16 :goto_a

    .line 543
    :cond_b
    new-instance v4, Ll/᩸ᩴۘ;

    invoke-direct {v4, v0, v11}, Ll/᩸ᩴۘ;-><init>(Ll/۠ᩴۘ;I)V

    invoke-direct {v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 550
    invoke-static {v1}, Ll/ۘۛ;->᩸֨ܰ(Ljava/lang/Object;)V

    .line 551
    sget-object v10, Ll/֡᩺ۘ;->ܽ:Ll/ۛۧ᩺;

    const-string v1, "\u06e0\u0733"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x6cb

    const v11, 0x7fdbcac3

    xor-int/2addr v4, v11

    const v11, -0x45cd1de5

    goto/16 :goto_a

    :sswitch_14
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 520
    iget-object v1, v8, Ll/֡ᩴۘ;->ۖ:Ljava/lang/String;

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    invoke-static {v2, v4, v11, v7, v1}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;Ll/۠᩵ᩴ;Ll/۠᩵ᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/᩻ᩴۘ;

    move-result-object v1

    .line 522
    invoke-static {v2, v1}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;Ll/᩻ᩴۘ;)V

    .line 523
    sget-object v9, Ll/ۙܳ᩺;->ܰ:Ljava/util/concurrent/ExecutorService;

    .line 864
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_c

    goto/16 :goto_f

    :cond_c
    const-string v1, "\u06d9\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v12, v1, v24

    mul-int/lit16 v12, v12, 0x2115

    const v23, 0x10f83e5

    xor-int v12, v12, v23

    const v23, -0x67d7f534

    goto/16 :goto_d

    :sswitch_15
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    .line 519
    iput-boolean v6, v0, Ll/۠ᩴۘ;->ۘ:Z

    .line 520
    invoke-static {v2}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    iget-object v1, v1, Ll/۫ᩴۘ;->ۙ:Ll/֡ᩴۘ;

    iget-object v7, v1, Ll/֡ᩴۘ;->ۖ:Ljava/lang/String;

    invoke-static {v2}, Ll/ۙ۠ۘ;->᩵(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    iget-object v8, v1, Ll/۫ᩴۘ;->ۙ:Ll/֡ᩴۘ;

    const-string v1, "\u06db\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, -0x1f

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, -0x5689

    const v23, -0x5456aa1d

    xor-int v12, v12, v23

    const v23, 0x45761df8

    goto/16 :goto_d

    :sswitch_16
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    const/4 v5, 0x0

    .line 517
    iput-boolean v5, v0, Ll/۠ᩴۘ;->ۘ:Z

    .line 518
    iget-object v1, v0, Ll/۠ᩴۘ;->᩹:Ll/۠֡ۚ;

    invoke-static {v2, v1, v4, v11}, Ll/ۙ۠ۘ;->ۙ(Ll/ۙ۠ۘ;Ll/۠֡ۚ;Ll/۠᩵ᩴ;Ll/۠᩵ᩴ;)V

    const/4 v6, 0x1

    .line 1145
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v1

    if-eqz v1, :cond_d

    move-object/from16 v23, v4

    move-object/from16 v28, v11

    :goto_8
    move-object/from16 v12, v29

    goto :goto_9

    :cond_d
    const-string v1, "\u06df\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, -0x3e63

    const v23, -0x6962e922

    xor-int v12, v12, v23

    const v23, -0x4e1865a9

    goto/16 :goto_d

    :sswitch_17
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 515
    iget-object v2, v0, Ll/۠ᩴۘ;->ۜ:Ll/ۙ۠ۘ;

    invoke-static {v2}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    iget-object v4, v0, Ll/۠ᩴۘ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ll/۫ᩴۘ;->ۙ(Ljava/util/ArrayList;)Ll/۠᩵ᩴ;

    move-result-object v23

    .line 516
    invoke-static {v2}, Ll/ۙ۠ۘ;->᩵(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    iget-object v4, v0, Ll/۠ᩴۘ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ll/۫ᩴۘ;->ۙ(Ljava/util/ArrayList;)Ll/۠᩵ᩴ;

    move-result-object v28

    .line 476
    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v1, :cond_e

    goto :goto_8

    :goto_9
    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x3fcf

    const v11, 0xd5408f2

    xor-int/2addr v4, v11

    const v11, -0x20c8165b

    goto/16 :goto_4

    :cond_e
    const-string v1, "\u0733\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x1edb

    const v11, -0x375d6305

    xor-int/2addr v4, v11

    const v11, 0x7d44f9e3

    :goto_a
    xor-int/2addr v1, v11

    move-object/from16 v11, v27

    move-object/from16 v12, v29

    :goto_b
    move/from16 v27, v1

    move v1, v4

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    const v1, 0x8620

    const v3, 0x8620

    :goto_c
    const-string v1, "\u0733\u1a73"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x47

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, -0x464b

    const v23, -0x7356ac49

    xor-int v12, v12, v23

    const v23, -0x13ed1b11

    goto :goto_d

    :sswitch_19
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    mul-int v1, v22, v22

    mul-int v12, v21, v21

    const v23, 0x5c90c1

    add-int v12, v12, v23

    add-int/2addr v12, v12

    sub-int/2addr v12, v1

    if-ltz v12, :cond_f

    const-string v1, "\u1a7b\u05ab"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, -0x204b

    const v23, -0x62e086f9

    xor-int v12, v12, v23

    const v23, -0x1dbc594e

    :goto_d
    xor-int v1, v1, v23

    move-object/from16 v23, v4

    move-object/from16 v28, v11

    move-object/from16 v11, v27

    move/from16 v27, v1

    move v1, v12

    :goto_e
    move-object/from16 v12, v29

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v12, v1, v24

    mul-int/lit16 v12, v12, 0x7847

    const v23, -0x326d1320

    xor-int v12, v12, v23

    const v23, -0x764d2599

    goto :goto_d

    :sswitch_1a
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    sget-object v1, Ll/۠ᩴۘ;->۫۫ۛ:[S

    const/4 v12, 0x0

    aget-short v1, v1, v12

    add-int/lit16 v12, v1, 0x99f

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result v21

    if-eqz v21, :cond_10

    move/from16 v21, v1

    move/from16 v22, v12

    :goto_f
    const-string v1, "\u1a76\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x3

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, 0x617d

    const v23, -0x55fcea5f

    xor-int v12, v12, v23

    const v23, 0x4d6f5795    # 2.509684E8f

    goto :goto_d

    :cond_10
    const-string v21, "\u06e1\u06e8"

    invoke-static/range {v21 .. v21}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v25

    xor-int v0, v21, v24

    mul-int/lit16 v0, v0, -0x6557

    const v22, -0x185f3aeb

    xor-int v0, v0, v22

    const v22, -0x6d38fb1b

    xor-int v21, v21, v22

    move-object/from16 v23, v4

    move-object/from16 v28, v11

    move/from16 v22, v12

    move-object/from16 v11, v27

    move-object/from16 v12, v29

    move/from16 v27, v21

    move/from16 v21, v1

    move v1, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fa65b51 -> :sswitch_18
        -0x787c15a5 -> :sswitch_9
        -0x6d70b60d -> :sswitch_19
        -0x6857461e -> :sswitch_e
        -0x5fa9a899 -> :sswitch_a
        -0x5e4affaf -> :sswitch_a
        -0x591b9d1b -> :sswitch_2
        -0x57550ad4 -> :sswitch_16
        -0x54058b9e -> :sswitch_c
        -0x51499f76 -> :sswitch_6
        -0x51030e69 -> :sswitch_5
        -0x4bb11321 -> :sswitch_6
        -0x4a4fb888 -> :sswitch_7
        -0x48da22a5 -> :sswitch_16
        -0x4690eeec -> :sswitch_1
        -0x44ba61f0 -> :sswitch_5
        -0x3ffdcafa -> :sswitch_d
        -0x38c753ed -> :sswitch_12
        -0x3865183c -> :sswitch_11
        -0x367b6a27 -> :sswitch_10
        -0x1f95db84 -> :sswitch_0
        -0x1be50351 -> :sswitch_3
        -0x1056ecb0 -> :sswitch_10
        -0x72a47be -> :sswitch_11
        -0x4007568 -> :sswitch_8
        0x37b7ae7 -> :sswitch_9
        0x5a577ab -> :sswitch_14
        0xad9b5fd -> :sswitch_1
        0x123297e7 -> :sswitch_15
        0x1d9b6d4a -> :sswitch_2
        0x20436837 -> :sswitch_4
        0x270e95ca -> :sswitch_13
        0x290bdea3 -> :sswitch_f
        0x3a3607e0 -> :sswitch_b
        0x3a9aa9ef -> :sswitch_7
        0x3c6f7dd2 -> :sswitch_1a
        0x3f0bd607 -> :sswitch_1a
        0x40654eb7 -> :sswitch_15
        0x41954a71 -> :sswitch_18
        0x47293214 -> :sswitch_19
        0x4dc63b33 -> :sswitch_13
        0x4fc12854 -> :sswitch_d
        0x52df4cb2 -> :sswitch_17
        0x52df7133 -> :sswitch_8
        0x5a19997c -> :sswitch_b
        0x637eb774 -> :sswitch_17
        0x64362d71 -> :sswitch_c
        0x6c41e14d -> :sswitch_14
        0x6fdcd49e -> :sswitch_12
        0x725a80ed -> :sswitch_0
        0x73b1e62a -> :sswitch_4
        0x73fc8b46 -> :sswitch_e
        0x76aeb46e -> :sswitch_3
        0x78dd9d41 -> :sswitch_f
    .end sparse-switch
.end method

.method public native ۙ(Ljava/lang/Exception;)V
.end method

.method public final ۚ()V
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x38e861af

    sget v9, Ll/֫۟;->᩸ᩴܿ:I

    sget v10, Ll/֫ܳ;->᩶ۧۛ:I

    const-string v11, "\u05a1\u06e2"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x9a1

    const v13, 0x5667f61

    xor-int/2addr v12, v13

    const v13, 0x128e932c

    :goto_0
    xor-int/2addr v11, v13

    move-object v13, v3

    :goto_1
    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x3233

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 502
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v2

    .line 503
    invoke-static {}, Ll/ۜۤۜ;->ᩳ()V

    sget v11, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v11, :cond_8

    const-string v11, "\u06e1\u06e8"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x69

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x5659

    const v14, -0x72c02640

    xor-int/2addr v12, v14

    const v14, 0x1f25964

    goto/16 :goto_6

    :sswitch_0
    sget-boolean v11, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v11, :cond_b

    goto/16 :goto_3

    .line 511
    :sswitch_1
    sget-boolean v11, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v11, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v11, "\u05a8\u06d8"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x45

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x610f

    const v14, -0x391474f5

    xor-int/2addr v12, v14

    const v14, -0x3c101d29

    goto/16 :goto_6

    .line 363
    :sswitch_2
    sget v11, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez v11, :cond_9

    goto/16 :goto_5

    .line 10
    :sswitch_3
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    goto/16 :goto_5

    .line 468
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    return-void

    .line 507
    :sswitch_5
    iget-object v11, p0, Ll/۠ᩴۘ;->֨:Ljava/util/ArrayList;

    new-instance v12, Ll/ܽᩴۘ;

    .line 164
    sget v14, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v14, :cond_1

    goto/16 :goto_3

    .line 507
    :cond_1
    invoke-direct {v12, v6}, Ll/ܽᩴۘ;-><init>(Landroid/content/pm/PackageInfo;)V

    invoke-static {v11, v12}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 506
    :sswitch_6
    iget-object v11, v7, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    if-eqz v11, :cond_5

    const-string v11, "\u1a76\u06ec"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x466d

    const v14, 0x287a9158

    xor-int/2addr v12, v14

    const v14, -0x6233d142

    goto/16 :goto_6

    .line 505
    :sswitch_7
    invoke-static {v4}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/PackageInfo;

    .line 506
    iget-object v7, v6, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v7, :cond_5

    const-string v11, "\u06e1\u06db"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7aa1

    const v14, 0x43075364

    xor-int/2addr v12, v14

    const v14, 0x7e1f38a6

    goto/16 :goto_6

    .line 546
    :sswitch_8
    invoke-static {}, Ll/ۜۤۜ;->ۜ()Z

    move-result v0

    .line 510
    invoke-static {v0}, Ll/۫֡ۚ;->ܰ(Z)Ll/۠֡ۚ;

    move-result-object v0

    iput-object v0, p0, Ll/۠ᩴۘ;->᩹:Ll/۠֡ۚ;

    return-void

    :sswitch_9
    invoke-static {v5}, Ll/ۗᩳ;->֨ۢܺ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 14
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v11

    if-ltz v11, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v11, "\u1a75\u0736"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x6d87

    const v14, -0x29d69b91

    xor-int/2addr v12, v14

    const v14, -0xdceeab0

    goto/16 :goto_6

    .line 510
    :sswitch_a
    invoke-static {}, Ll/᩶֡ۚ;->ۖ()Ll/᩵֡ۚ;

    move-result-object v5

    check-cast v5, Ll/᩷᩺ۘ;

    sget-boolean v11, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v11, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v11, "\u06df\u1a75"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x33

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x66b5

    const v14, 0x2c19c19e

    xor-int/2addr v12, v14

    const v14, -0x71caca11

    goto/16 :goto_6

    .line 505
    :sswitch_b
    invoke-static {v4}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const-string v11, "\u06e8\u06dc"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x7d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5ff7

    const v14, 0x3f2f0443

    xor-int/2addr v12, v14

    const v14, -0x37d3ac24

    goto/16 :goto_6

    :cond_4
    const-string v11, "\u06d9\u06ec"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x5

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x42b9

    const v14, -0x6b2fadce

    xor-int/2addr v12, v14

    const v14, 0x40da60da

    goto/16 :goto_6

    .line 504
    :sswitch_c
    iput-object v13, p0, Ll/۠ᩴۘ;->֨:Ljava/util/ArrayList;

    .line 505
    invoke-static {v2}, Ll/ۗ۬;->ۜܿ᩹(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    const-string v11, "\u06e1\u0733"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x69

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x434b

    const v14, -0x3ecd81bb

    xor-int/2addr v12, v14

    const v14, 0x543dce64

    goto/16 :goto_6

    .line 504
    :sswitch_d
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v2}, Ll/۟;->ܰۢᩴ(Ljava/lang/Object;)I

    move-result v11

    .line 375
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v12

    if-gtz v12, :cond_6

    goto :goto_4

    .line 504
    :cond_6
    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 330
    sget v11, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v11, :cond_7

    goto :goto_4

    :cond_7
    const-string v11, "\u1a77\u06e2"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x49

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x114f

    const v14, 0x2cf840e5

    xor-int/2addr v12, v14

    const v14, -0x58bb8c56

    goto/16 :goto_6

    :cond_8
    const-string v11, "\u0730\u1a78"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x4f

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4557

    const v14, -0x3b77b9eb

    xor-int/2addr v12, v14

    const v14, -0x1c8c0e84    # -4.4999596E21f

    goto/16 :goto_6

    :sswitch_e
    const/4 v1, 0x0

    sget v11, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v11, :cond_a

    :cond_9
    :goto_3
    const-string v11, "\u06d7\u06e7"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x41

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0xcf5

    const v14, -0x85ba65d

    xor-int/2addr v12, v14

    const v14, -0x2ccf842f

    goto/16 :goto_6

    :cond_a
    const-string v11, "\u1a73\u1a78"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x465f

    const v14, 0x480bdfa7

    xor-int/2addr v12, v14

    const v14, 0x5e532439

    goto/16 :goto_6

    :sswitch_f
    sget v11, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v11, :cond_c

    :cond_b
    :goto_4
    const-string v11, "\u1a79\u06e7"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x57

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x67a7

    const v13, 0x578fe8f8

    xor-int/2addr v12, v13

    const v13, -0x3efa4a8e

    goto/16 :goto_0

    :cond_c
    const-string v11, "\u06e0\u06e1"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x74d

    const v14, 0x3a5f076

    xor-int/2addr v12, v14

    const v14, -0xa9ec92a

    goto :goto_6

    .line 271
    :sswitch_10
    sget v11, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v11, :cond_d

    goto :goto_5

    :cond_d
    const-string v11, "\u0733\u06e4"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x1ad9

    const v14, -0x1ede1a89

    xor-int/2addr v12, v14

    const v14, -0x1afb383f

    goto :goto_6

    .line 502
    :sswitch_11
    iget-object v0, p0, Ll/۠ᩴۘ;->۬:Landroid/content/pm/PackageManager;

    sget v11, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v11, :cond_e

    :goto_5
    const-string v11, "\u0733\u06d6"

    invoke-static {v11}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x5b

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x977

    const v14, -0x16226681

    xor-int/2addr v12, v14

    const v14, 0x79e9d793

    goto :goto_6

    :cond_e
    const-string v11, "\u06eb\u06db"

    invoke-static {v11}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x4d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2e8f

    const v14, -0x33a99f84    # -5.6197616E7f

    xor-int/2addr v12, v14

    const v14, 0x2856f199

    :goto_6
    xor-int/2addr v11, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f80325d -> :sswitch_2
        -0x7a0b352e -> :sswitch_11
        -0x73ad83e2 -> :sswitch_c
        -0x6f6af493 -> :sswitch_f
        -0x60c3a774 -> :sswitch_9
        -0x5fe5e201 -> :sswitch_a
        -0x5f61fe89 -> :sswitch_3
        -0x5c480335 -> :sswitch_d
        -0x5aa22f62 -> :sswitch_3
        -0x50641c82 -> :sswitch_11
        -0x49f625c4 -> :sswitch_c
        -0x44925c4b -> :sswitch_1
        -0x403fc606 -> :sswitch_10
        -0x28dd7434 -> :sswitch_a
        -0x19aa79f8 -> :sswitch_d
        -0x169af7dd -> :sswitch_6
        0xab5f917 -> :sswitch_5
        0xda41a03 -> :sswitch_5
        0x16a1fb7b -> :sswitch_4
        0x19033d9c -> :sswitch_8
        0x1cd5e9e3 -> :sswitch_4
        0x1e50f97a -> :sswitch_e
        0x1f4e2d41 -> :sswitch_7
        0x2a7d4b10 -> :sswitch_7
        0x3d622b9c -> :sswitch_b
        0x4a58eed3 -> :sswitch_0
        0x4adc8736 -> :sswitch_8
        0x4ea2656b -> :sswitch_1
        0x5060776f -> :sswitch_6
        0x587b75b8 -> :sswitch_2
        0x5c87a53a -> :sswitch_9
        0x69ac727e -> :sswitch_10
        0x6d7af25b -> :sswitch_e
        0x727ecd4f -> :sswitch_f
        0x7523df51 -> :sswitch_b
        0x77349c92 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ܰ()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x4ec90cab

    sget v6, Ll/֨ۢ;->ۢ۬ۧ:I

    sget v7, Ll/֫ܽ;->֡ᩴܶ:I

    const-string v8, "\u06ec\u0733"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2bc3

    const v10, 0x58bd097f

    xor-int/2addr v9, v10

    const v10, -0x2bf1679c

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x6ce5

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 496
    invoke-virtual {v2, v3}, Ll/ۛۧܰ;->ۙ(Z)V

    .line 497
    invoke-static {v0}, Ll/ۙ۠ۘ;->᩵(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v4

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_1

    :sswitch_0
    sget v8, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v8, :cond_0

    goto/16 :goto_5

    .line 85
    :sswitch_1
    sget-boolean v8, Ll/᩶;->ۚۤۘ:Z

    if-nez v8, :cond_b

    goto/16 :goto_4

    .line 332
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    sget v8, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v8, :cond_9

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    goto/16 :goto_3

    .line 153
    :sswitch_4
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    return-void

    .line 497
    :sswitch_5
    iget-object v0, v4, Ll/۫ᩴۘ;->ۨ:Ll/ۛۧܰ;

    invoke-virtual {v0, v3}, Ll/ۛۧܰ;->ۙ(Z)V

    return-void

    :cond_0
    :goto_1
    const-string v8, "\u1a73\u06d7"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x236b

    const v10, 0x659b4138

    xor-int/2addr v9, v10

    const v10, 0x1b6c7442

    goto :goto_0

    :cond_1
    const-string v8, "\u1a75\u1a74"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x240b

    const v10, -0x2bb8c2f7

    xor-int/2addr v9, v10

    const v10, -0x60bf997f

    goto :goto_0

    .line 496
    :sswitch_6
    iget-object v2, v1, Ll/۫ᩴۘ;->ۨ:Ll/ۛۧܰ;

    const/4 v3, 0x1

    sget-boolean v8, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    const-string v8, "\u073f\u1a73"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x6813

    const v10, 0x2abf6cb9

    xor-int/2addr v9, v10

    const v10, -0x5c35b115

    goto/16 :goto_0

    :sswitch_7
    invoke-static {v0}, Ll/ۙ۠ۘ;->ۤ(Ll/ۙ۠ۘ;)Ll/۫ᩴۘ;

    move-result-object v1

    .line 159
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    move-result v8

    if-eqz v8, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v8, "\u1a78\u06e2"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3ecf

    const v10, 0x47ad0343

    xor-int/2addr v9, v10

    const v10, 0xe6ebfe8

    goto/16 :goto_0

    .line 439
    :sswitch_8
    sget-boolean v8, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v8, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v8, "\u1a76\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4123

    const v10, -0x33ef42b0    # -3.794259E7f

    xor-int/2addr v9, v10

    const v10, -0x72d0cf2f

    goto/16 :goto_0

    .line 25
    :sswitch_9
    sget v8, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v8, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v8, "\u1a7b\u0733"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5acb

    const v10, 0x16f515b5

    xor-int/2addr v9, v10

    const v10, 0x49332f60    # 733942.0f

    goto/16 :goto_0

    .line 115
    :sswitch_a
    sget-boolean v8, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v8, :cond_6

    :goto_2
    const-string v8, "\u06ec\u073f"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3f4d

    const v10, 0x75a49ea7

    xor-int/2addr v9, v10

    const v10, -0x54e42e27

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e0\u06db"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5a87

    const v10, 0x43f20c0c

    xor-int/2addr v9, v10

    const v10, -0x2c37c47f

    goto/16 :goto_0

    .line 388
    :sswitch_b
    sget v8, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v8, :cond_7

    :goto_3
    const-string v8, "\u06e2\u1a75"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x2f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2731

    const v10, 0x3ae03056

    xor-int/2addr v9, v10

    const v10, 0x22402bfd

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06db\u073f"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2cc5

    const v10, -0x269691b1

    xor-int/2addr v9, v10

    const v10, 0x21dabfad

    goto/16 :goto_0

    .line 182
    :sswitch_c
    sget v8, Ll/֫;->ܶܺ᩻:I

    if-ltz v8, :cond_8

    goto :goto_5

    :cond_8
    const-string v8, "\u06e7\u1a78"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x5f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2fb7

    const v10, 0x713cd397

    xor-int/2addr v9, v10

    const v10, 0x5d3b562c

    goto/16 :goto_0

    .line 403
    :sswitch_d
    sget v8, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v8, :cond_a

    :cond_9
    :goto_4
    const-string v8, "\u06d6\u06d7"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x29e9

    const v10, 0x5fa957dd

    xor-int/2addr v9, v10

    const v10, -0x73f5a886

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u1a7b\u0736"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5375

    const v10, -0x2ee02d93

    xor-int/2addr v9, v10

    const v10, -0x4f949767

    goto/16 :goto_0

    .line 496
    :sswitch_e
    iget-object v0, p0, Ll/۠ᩴۘ;->ۜ:Ll/ۙ۠ۘ;

    sget-boolean v8, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v8, :cond_c

    :cond_b
    :goto_5
    const-string v8, "\u06e7\u06d9"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x41

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7a6b

    const v10, -0x545ecd2a

    xor-int/2addr v9, v10

    const v10, -0x44a0f631

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u05ab\u1a77"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2329

    const v10, -0x29b24da1

    xor-int/2addr v9, v10

    const v10, -0x792ae9fd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6b2d1969 -> :sswitch_a
        -0x5ebd6e60 -> :sswitch_e
        -0x5d7399eb -> :sswitch_8
        -0x4b19aa29 -> :sswitch_9
        -0x41ef53d4 -> :sswitch_7
        -0x342145b7 -> :sswitch_1
        -0x1e26d94e -> :sswitch_3
        -0x1c82bed1 -> :sswitch_1
        -0x1a2e0e11 -> :sswitch_6
        -0x12119e0a -> :sswitch_2
        -0xe946f5a -> :sswitch_a
        -0x6f99f2c -> :sswitch_4
        -0x5729a47 -> :sswitch_5
        -0x2cafa9f -> :sswitch_0
        -0x2ae675d -> :sswitch_d
        0xfa67ae4 -> :sswitch_6
        0x180e4a8c -> :sswitch_b
        0x26739b4e -> :sswitch_b
        0x3fb230ce -> :sswitch_e
        0x48e55a22 -> :sswitch_8
        0x4ff2dcd1 -> :sswitch_5
        0x5cbb7974 -> :sswitch_3
        0x5d9dff2c -> :sswitch_7
        0x604ee830 -> :sswitch_2
        0x60d9a04d -> :sswitch_c
        0x652dacbb -> :sswitch_4
        0x6d69a942 -> :sswitch_d
        0x74f9c2ad -> :sswitch_c
        0x7674bc38 -> :sswitch_9
        0x7baaf8c5 -> :sswitch_0
    .end sparse-switch
.end method
