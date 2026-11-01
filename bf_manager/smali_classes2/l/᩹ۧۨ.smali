.class public final Ll/᩹ۧۨ;
.super Ljava/lang/Object;
.source "U8VA"

# interfaces
.implements Ll/ۤܺۚ;


# instance fields
.field public final synthetic ֡:F

.field public final synthetic ܺ:I

.field public final synthetic ᩶:Ll/֨ۧۨ;


# direct methods
.method public constructor <init>(Ll/֨ۧۨ;IF)V
    .locals 6

    const v0, -0x2be3490e

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    sget v2, Ll/֫֡;->ۡ᩹ۗ:I

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d9\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7989

    const v5, 0x62f61116

    xor-int/2addr v4, v5

    const v5, 0x30b54cc3

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7b7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    .line 24
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-gez v3, :cond_3

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a77\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4815

    const v5, -0x515f4d9c

    xor-int/2addr v4, v5

    const v5, -0x3e282365

    goto :goto_0

    .line 51
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_3

    .line 9
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto/16 :goto_3

    .line 5
    :sswitch_4
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 112
    :sswitch_5
    iput p3, p0, Ll/᩹ۧۨ;->֡:F

    return-void

    .line 82
    :sswitch_6
    sget v3, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v3, "\u06e2\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5fb3

    const v5, 0x778b25e5

    xor-int/2addr v4, v5

    const v5, 0x531e559a

    goto :goto_0

    :cond_2
    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xccf

    const v5, 0x638965de

    xor-int/2addr v4, v5

    const v5, -0x3a725671

    goto/16 :goto_0

    .line 26
    :sswitch_7
    sget v3, Ll/ۗ;->֨۬ۖ:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06d7\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2d29

    const v5, -0x637e83de

    xor-int/2addr v4, v5

    const v5, 0x360e9236

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5449

    const v5, -0x72dfb6a8

    xor-int/2addr v4, v5

    const v5, -0x7b8e0053

    goto/16 :goto_0

    .line 50
    :sswitch_8
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06da\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4c75

    const v5, 0xf599875

    xor-int/2addr v4, v5

    const v5, 0x38902c1d

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x58ef

    const v5, 0x3453d7b9

    xor-int/2addr v4, v5

    const v5, 0x208ea41d

    goto/16 :goto_0

    .line 57
    :sswitch_a
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u073f\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x65d

    const v5, -0x729e19c1

    xor-int/2addr v4, v5

    const v5, 0x4bed6170    # 3.1113952E7f

    goto/16 :goto_0

    .line 80
    :sswitch_b
    sget v3, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v3, :cond_8

    goto :goto_1

    :cond_8
    const-string v3, "\u05a8\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6691

    const v5, -0x2a058d74

    xor-int/2addr v4, v5

    const v5, -0x92cdbde

    goto/16 :goto_0

    .line 101
    :sswitch_c
    sget v3, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v3, :cond_9

    :goto_1
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b85

    const v5, 0x30563346

    xor-int/2addr v4, v5

    const v5, -0x2ca121d6

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d8\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e91

    const v5, 0x12c1ab

    xor-int/2addr v4, v5

    const v5, 0x5daaef14

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u073d\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7db1

    const v5, -0x15f471e9

    xor-int/2addr v4, v5

    const v5, -0x709e96bd

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a78\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x64a9

    const v5, 0x23ba9e28

    xor-int/2addr v4, v5

    const v5, 0x2bec29c6

    goto/16 :goto_0

    .line 112
    :sswitch_e
    iput-object p1, p0, Ll/᩹ۧۨ;->᩶:Ll/֨ۧۨ;

    iput p2, p0, Ll/᩹ۧۨ;->ܺ:I

    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_c

    :goto_3
    const-string v3, "\u0733\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4225

    const v5, 0x3a320087

    xor-int/2addr v4, v5

    const v5, 0x5a0af1f5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x713d

    const v5, 0xe8ee157

    xor-int/2addr v4, v5

    const v5, 0x205804a5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7763cfe5 -> :sswitch_c
        -0x692ea22e -> :sswitch_e
        -0x6845e06c -> :sswitch_4
        -0x6217b138 -> :sswitch_6
        -0x564277ac -> :sswitch_5
        -0x436a745c -> :sswitch_c
        -0x3a21c1f9 -> :sswitch_9
        -0x36522551 -> :sswitch_5
        -0x28fb4c51 -> :sswitch_3
        -0x10c998b2 -> :sswitch_6
        0xde557d -> :sswitch_a
        0xda15636 -> :sswitch_2
        0x13fa8075 -> :sswitch_8
        0x1739834c -> :sswitch_1
        0x174d33d9 -> :sswitch_b
        0x1ecce827 -> :sswitch_0
        0x2c1717fc -> :sswitch_b
        0x2e4e2c60 -> :sswitch_7
        0x4424efcd -> :sswitch_0
        0x4a44099b -> :sswitch_8
        0x4f19659f -> :sswitch_7
        0x4f25f13b -> :sswitch_3
        0x54f2f8c4 -> :sswitch_9
        0x56ae7ed9 -> :sswitch_2
        0x57fbba05 -> :sswitch_d
        0x61a90170 -> :sswitch_a
        0x63a615c3 -> :sswitch_1
        0x65f78019 -> :sswitch_4
        0x68d09fa1 -> :sswitch_e
        0x783dde3c -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final ֨()Z
    .locals 1

    .line 121
    iget-object v0, p0, Ll/᩹ۧۨ;->᩶:Ll/֨ۧۨ;

    invoke-static {v0}, Ll/ۘ֡;->ۗܽۨ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final synthetic ۘۙ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ(JJJ)V
    .locals 9

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x34465630

    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    sget v5, Ll/֡ܳ;->֡۠ۧ:I

    const-string v6, "\u1a73\u05a1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb75

    const v8, 0x57f4864c

    xor-int/2addr v7, v8

    const v8, 0x3d2b1a0f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x2555

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 93
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    goto/16 :goto_3

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    sget-boolean v6, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v6, :cond_2

    goto/16 :goto_4

    .line 31
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v6, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v6, :cond_9

    goto/16 :goto_5

    .line 79
    :sswitch_2
    sget-boolean v6, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v6, :cond_b

    goto/16 :goto_3

    .line 24
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    return-void

    :sswitch_4
    add-int/2addr v2, v1

    .line 116
    iget-object p2, p0, Ll/᩹ۧۨ;->᩶:Ll/֨ۧۨ;

    invoke-interface {p2, p1, v2}, Ll/ܿܰۖ;->ۙ(II)V

    return-void

    :sswitch_5
    mul-float v1, p2, v0

    float-to-int v1, v1

    iget v2, p0, Ll/᩹ۧۨ;->ܺ:I

    .line 79
    sget-boolean v6, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    const-string v6, "\u1a7b\u1a74"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x299

    const v8, 0x55750ccf

    xor-int/2addr v7, v8

    const v8, 0x6469a4a0

    goto :goto_0

    .line 115
    :sswitch_6
    invoke-static {p3, p4, p5, p6}, Ll/۠᩻᩺;->ۙ(JJ)I

    move-result p1

    int-to-float p2, p1

    .line 116
    iget v0, p0, Ll/᩹ۧۨ;->֡:F

    .line 30
    sget-boolean v6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    const-string v6, "\u1a78\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2e69

    const v8, 0x3ab64700

    xor-int/2addr v7, v8

    const v8, -0x5a26a20c

    goto :goto_0

    .line 2
    :sswitch_7
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    move-result v6

    if-gtz v6, :cond_3

    :cond_2
    :goto_1
    const-string v6, "\u1a79\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb27

    const v8, 0x7728baee

    xor-int/2addr v7, v8

    const v8, -0x1638c788

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u05a1\u1a79"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x6f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x683d

    const v8, 0x36ec7c2d

    xor-int/2addr v7, v8

    const v8, 0x650b5042

    goto/16 :goto_0

    :sswitch_8
    sget v6, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v6, :cond_4

    :goto_2
    const-string v6, "\u1a77\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x308d

    const v8, 0x37ff07a1

    xor-int/2addr v7, v8

    const v8, -0x19e726c6

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u05a1\u05a1"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1f5d

    const v8, 0x1bb9fc61

    xor-int/2addr v7, v8

    const v8, 0x50b09cdb

    goto/16 :goto_0

    .line 25
    :sswitch_9
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v6

    if-gtz v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u1a78\u073f"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3a0b

    const v8, 0x3b4390a1

    xor-int/2addr v7, v8

    const v8, 0x7efb81a3

    goto/16 :goto_0

    .line 14
    :sswitch_a
    sget-boolean v6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "\u06db\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x78bb

    const v8, 0x728adcd2

    xor-int/2addr v7, v8

    const v8, -0x174b67da

    goto/16 :goto_0

    .line 74
    :sswitch_b
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v6

    if-gtz v6, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v6, "\u073a\u05a1"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x11b3

    const v8, -0x71bfe35f

    xor-int/2addr v7, v8

    const v8, 0x67bb31aa

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v6, :cond_8

    :goto_3
    const-string v6, "\u06ec\u0736"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x22b7

    const v8, 0x680f360

    xor-int/2addr v7, v8

    const v8, 0x107f05bc

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u0733\u0730"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6fbb

    const v8, 0x11ee9992

    xor-int/2addr v7, v8

    const v8, -0x72e3e88d

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v6

    if-ltz v6, :cond_a

    :cond_9
    :goto_4
    const-string v6, "\u1a75\u1a74"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7aeb

    const v8, 0x7634d43a

    xor-int/2addr v7, v8

    const v8, 0x16343127

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u0730\u06e4"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5d3f

    const v8, 0xa071445

    xor-int/2addr v7, v8

    const v8, -0x799ffcb0

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u06d8\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5cfb

    const v8, -0x16eeb892

    xor-int/2addr v7, v8

    const v8, 0x88f2373

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06dc\u06ec"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x20fd

    const v8, -0x2e5d59dd

    xor-int/2addr v7, v8

    const v8, -0x295c5b0d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f4562fe -> :sswitch_a
        -0x713e37bc -> :sswitch_d
        -0x6c6b9a37 -> :sswitch_6
        -0x666eb0a5 -> :sswitch_5
        -0x61020a2e -> :sswitch_e
        -0x4186abf4 -> :sswitch_0
        -0x38641e77 -> :sswitch_9
        -0x379e3fd1 -> :sswitch_2
        -0x255b17e7 -> :sswitch_1
        -0x6cf9564 -> :sswitch_2
        -0x500eaf4 -> :sswitch_0
        -0x361be0 -> :sswitch_e
        0x60fb0c6 -> :sswitch_5
        0x8d29fdc -> :sswitch_7
        0xa061b18 -> :sswitch_6
        0xea38920 -> :sswitch_4
        0x19f4bbe3 -> :sswitch_3
        0x1b6ca2cb -> :sswitch_d
        0x25b530b7 -> :sswitch_c
        0x269a0d43 -> :sswitch_8
        0x2ec9277d -> :sswitch_b
        0x2fc3a2f4 -> :sswitch_4
        0x3fd9632a -> :sswitch_a
        0x481d6f51 -> :sswitch_3
        0x4a11d5a8 -> :sswitch_1
        0x4b619518 -> :sswitch_9
        0x4d2eb032 -> :sswitch_c
        0x4d8d3f1c -> :sswitch_b
        0x4f6a11ad -> :sswitch_8
        0x580937c1 -> :sswitch_7
    .end sparse-switch
.end method
