.class public final Ll/᩵ۜۘ;
.super Ll/ۗ᩷᩺;
.source "517G"


# instance fields
.field public volatile ֨:Z

.field public final synthetic ۘ:Ll/۫ܶۘ;

.field public final synthetic ۜ:Ljava/util/concurrent/ExecutorService;

.field public final synthetic ۬:Ll/᩷ۜۘ;

.field public ᩹:Ljava/util/ArrayList;

.field public final synthetic ᩺:Ll/ۨ᩹ۘ;


# direct methods
.method public constructor <init>(Ll/᩷ۜۘ;Ll/۫ܶۘ;Ljava/util/concurrent/ExecutorService;Ll/ۨ᩹ۘ;)V
    .locals 4

    const/4 v0, 0x0

    const v1, -0x1237282d

    sget v2, Ll/֡ܳ;->֡۠ۧ:I

    sget v3, Ll/֡֡;->᩶ۤ۠:I

    .line 45
    iput-object p1, p0, Ll/᩵ۜۘ;->۬:Ll/᩷ۜۘ;

    iput-object p2, p0, Ll/᩵ۜۘ;->ۘ:Ll/۫ܶۘ;

    iput-object p3, p0, Ll/᩵ۜۘ;->ۜ:Ljava/util/concurrent/ExecutorService;

    iput-object p4, p0, Ll/᩵ۜۘ;->᩺:Ll/ۨ᩹ۘ;

    invoke-direct {p0}, Ll/ۗ᩷᩺;-><init>()V

    const-string p1, "\u1a79\u1a73"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x4f

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x3385

    const p3, -0x76236bef

    xor-int/2addr p2, p3

    const p3, -0x284efaa0

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v3

    mul-int/lit16 p3, p3, -0x29e7

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    move-result p1

    if-eqz p1, :cond_c

    goto/16 :goto_5

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget p1, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz p1, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    sget p1, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz p1, :cond_4

    goto :goto_1

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    move-result p1

    if-lez p1, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    :goto_1
    const-string p1, "\u073f\u1a74"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x530d

    const p3, -0x1aa2804e

    xor-int/2addr p2, p3

    const p3, -0x51c1b8e4

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/᩵ۜۘ;->֨:Z

    return-void

    .line 46
    :sswitch_6
    iput-object v0, p0, Ll/᩵ۜۘ;->᩹:Ljava/util/ArrayList;

    sget-boolean p1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz p1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p1, "\u05a1\u06e0"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x29

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2cf5

    const p3, 0x28a82c73

    xor-int/2addr p2, p3

    const p3, -0x1591f103

    goto :goto_0

    .line 7
    :sswitch_7
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result p1

    if-eqz p1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p1, "\u06dc\u1a76"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x3139

    const p3, 0x4c3b689

    xor-int/2addr p2, p3

    const p3, -0x20dc052

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget p1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u06d7\u06e2"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x4193

    const p3, 0x3a875741

    xor-int/2addr p2, p3

    const p3, -0x1d4338b3

    goto/16 :goto_0

    .line 5
    :sswitch_9
    sget p1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz p1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string p1, "\u06d7\u073a"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5065

    const p3, -0x21e7f874

    xor-int/2addr p2, p3

    const p3, 0x699d38b7

    goto/16 :goto_0

    :sswitch_a
    sget p1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz p1, :cond_5

    :cond_4
    :goto_2
    const-string p1, "\u06df\u06ec"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xd75

    const p3, 0x17f2faf2

    xor-int/2addr p2, p3

    const p3, 0x640a6eef

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u06e1\u073f"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x305d

    const p3, -0x6c4e8dbd

    xor-int/2addr p2, p3

    const p3, 0x47500ea5

    goto/16 :goto_0

    .line 26
    :sswitch_b
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_4

    :cond_6
    const-string p1, "\u06e1\u1a77"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x39

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x209b

    const p3, 0x5f53f83b

    xor-int/2addr p2, p3

    const p3, 0x2cb97e0c

    goto/16 :goto_0

    .line 3
    :sswitch_c
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result p1

    if-gtz p1, :cond_7

    goto :goto_5

    :cond_7
    const-string p1, "\u05a1\u06df"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x6ec9

    const p3, -0x6739079d

    xor-int/2addr p2, p3

    const p3, 0x18f716f1

    goto/16 :goto_0

    :sswitch_d
    sget-boolean p1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez p1, :cond_8

    :goto_3
    const-string p1, "\u06e2\u06dc"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x30c9

    const p3, -0x294a57be

    xor-int/2addr p2, p3

    const p3, -0x5153854

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u0736\u06e4"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x13

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x23b9

    const p3, 0x639ce0c1

    xor-int/2addr p2, p3

    const p3, 0x50831dff

    goto/16 :goto_0

    .line 27
    :sswitch_e
    sget p1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p1, :cond_a

    :cond_9
    :goto_4
    const-string p1, "\u06dc\u1a73"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x2dbb

    const p3, -0x35f32f90    # -2307100.0f

    xor-int/2addr p2, p3

    const p3, -0x5d8a9bca

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u06e2\u06df"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x32a3

    const p3, -0x1f1a84e9

    xor-int/2addr p2, p3

    const p3, -0x2a6400a

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string p1, "\u06d6\u06e2"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xf

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x76b7

    const p3, 0x138b8055

    xor-int/2addr p2, p3

    const p3, -0x76928a2c

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u1a7a\u06eb"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2c2d

    const p3, -0x67a60993

    xor-int/2addr p2, p3

    const p3, -0x69de9760

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c39f972 -> :sswitch_d
        -0x5db33b3b -> :sswitch_4
        -0x5d77534f -> :sswitch_0
        -0x5b56faef -> :sswitch_1
        -0x5ac42b14 -> :sswitch_d
        -0x5a6f986d -> :sswitch_6
        -0x54d3bfa9 -> :sswitch_3
        -0x544227c3 -> :sswitch_7
        -0x4521557f -> :sswitch_7
        -0x3ab3dd10 -> :sswitch_e
        -0x387244ff -> :sswitch_b
        -0x25f7350e -> :sswitch_e
        -0x1debda16 -> :sswitch_4
        -0x11149263 -> :sswitch_0
        -0x8466404 -> :sswitch_c
        -0x5e8c3fa -> :sswitch_3
        -0x156143f -> :sswitch_c
        0xb7a4b38 -> :sswitch_9
        0x1c29d234 -> :sswitch_a
        0x25b77a17 -> :sswitch_8
        0x277e4093 -> :sswitch_5
        0x28202ce1 -> :sswitch_2
        0x2fe28688 -> :sswitch_6
        0x362c73d8 -> :sswitch_8
        0x39c88dc3 -> :sswitch_5
        0x39e60950 -> :sswitch_2
        0x40951488 -> :sswitch_b
        0x699d5492 -> :sswitch_1
        0x6b37cb15 -> :sswitch_9
        0x7d76a6c7 -> :sswitch_a
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/᩵ۜۘ;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7436e483

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v4, "\u05ab\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa85

    const v6, -0x602f070

    xor-int/2addr v5, v6

    const v6, -0x62b98e0

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x10ff

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v4, :cond_6

    goto/16 :goto_3

    .line 30
    :sswitch_0
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-lez v4, :cond_3

    goto/16 :goto_4

    .line 32
    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    move-result v4

    if-lez v4, :cond_9

    goto/16 :goto_1

    .line 27
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    return-void

    .line 55
    :sswitch_5
    invoke-static {v0}, Ll/ۗܳ;->ܽܳۡ(Ljava/lang/Object;)V

    .line 56
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    .line 55
    :sswitch_6
    iget-object v0, p0, Ll/ۗ᩷᩺;->ܰ:Ll/ܿܿۚ;

    sget v4, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u0733\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1cb7

    const v6, -0x5e335d21

    xor-int/2addr v5, v6

    const v6, 0x8e33f96

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7b93

    const v6, -0x169e6b95

    xor-int/2addr v5, v6

    const v6, 0x740087

    goto :goto_0

    :sswitch_8
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06db\u06eb"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x35a1

    const v6, 0x8fb7ef3

    xor-int/2addr v5, v6

    const v6, -0x2fa88c8d

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_4

    :cond_3
    const-string v4, "\u1a77\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5155

    const v6, -0x33ffcb51    # -3.360838E7f

    xor-int/2addr v5, v6

    const v6, -0x1e0b2da4

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a1\u06dc"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xaf9

    const v6, 0x75b9b50e

    xor-int/2addr v5, v6

    const v6, 0x35d89306

    goto/16 :goto_0

    .line 9
    :sswitch_a
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_5

    :goto_1
    const-string v4, "\u06d6\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x722b

    const v6, 0x4d686678    # 2.4368934E8f

    xor-int/2addr v5, v6

    const v6, 0x5add4035

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d8\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x11e7

    const v6, 0x12c18c91

    xor-int/2addr v5, v6

    const v6, -0x558d0910

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a74\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1bcf

    const v6, -0x4c0c901a

    xor-int/2addr v5, v6

    const v6, 0x661ccd83

    goto/16 :goto_0

    .line 12
    :sswitch_b
    sget v4, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a76\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x492b

    const v6, 0x37729c89

    xor-int/2addr v5, v6

    const v6, -0x53c370f2

    goto/16 :goto_0

    .line 48
    :sswitch_c
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_8

    :goto_2
    const-string v4, "\u06e0\u06df"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x33

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1631

    const v6, -0x1368c623

    xor-int/2addr v5, v6

    const v6, -0x53fe7ce7

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e0\u06d6"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5f7d

    const v6, 0x55bf1f17

    xor-int/2addr v5, v6

    const v6, 0x3cf6d382

    goto/16 :goto_0

    .line 44
    :sswitch_d
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a79\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4785

    const v6, -0x1fe43aa0

    xor-int/2addr v5, v6

    const v6, -0xfbbd8ab

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4af5

    const v6, -0x63837b95

    xor-int/2addr v5, v6

    const v6, -0x77181f5e

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06da\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x58e5

    const v6, -0x7ae9380b

    xor-int/2addr v5, v6

    const v6, -0x77e22447

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x15

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6ca9

    const v6, 0x25a8558c

    xor-int/2addr v5, v6

    const v6, 0x2c9164d3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e98e7f4 -> :sswitch_9
        -0x7e712740 -> :sswitch_b
        -0x7e6a8c1d -> :sswitch_3
        -0x7630c03f -> :sswitch_6
        -0x725c7dea -> :sswitch_a
        -0x724c0a09 -> :sswitch_4
        -0x70396bb6 -> :sswitch_9
        -0x6c4199fe -> :sswitch_5
        -0x6c1b2079 -> :sswitch_1
        -0x6a9b41b6 -> :sswitch_1
        -0x63bc2da3 -> :sswitch_e
        -0x639ea6dd -> :sswitch_8
        -0x5ba1ece6 -> :sswitch_d
        -0x5ab6bb9b -> :sswitch_0
        -0x5a374a37 -> :sswitch_2
        -0x5200572e -> :sswitch_d
        -0x46e46460 -> :sswitch_7
        -0x3a62d15a -> :sswitch_5
        -0x2e102716 -> :sswitch_4
        -0x2d3e6713 -> :sswitch_e
        -0x28b582e7 -> :sswitch_b
        -0x1b518543 -> :sswitch_7
        -0x1a6f279e -> :sswitch_2
        -0x1434b15e -> :sswitch_6
        -0x8eb1f74 -> :sswitch_c
        0x56ee018 -> :sswitch_a
        0x10f302f7 -> :sswitch_0
        0x1ecd13a0 -> :sswitch_8
        0x23def4c7 -> :sswitch_3
        0x48eef465 -> :sswitch_c
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/᩵ۜۘ;Ll/۫ܶۘ;Ljava/util/concurrent/ExecutorService;)V
    .locals 6

    const v0, 0x1af4d44d

    sget v1, Ll/֡ۚ;->ۢܰ᩸:I

    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    const-string v3, "\u1a7a\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6e2f

    const v5, 0x6313a063

    xor-int/2addr v4, v5

    const v5, 0x41878d0b

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x14b1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    return-void

    .line 46
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v3, :cond_4

    goto/16 :goto_4

    .line 20
    :sswitch_1
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_8

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_a

    goto/16 :goto_3

    .line 8
    :sswitch_3
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    goto/16 :goto_3

    .line 53
    :sswitch_4
    invoke-static {p0, p1}, Ll/֡᩸;->ܳܽܽ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    iget-object v3, p0, Ll/ۗ᩷᩺;->ܰ:Ll/ܿܿۚ;

    new-instance v4, Ll/۠ۜۘ;

    sget v5, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v5, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-direct {v4, p0, p2}, Ll/۠ۜۘ;-><init>(Ll/᩵ۜۘ;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {v3, v4}, Ll/ܿܿۚ;->ۙ(Ljava/lang/Runnable;)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 52
    :sswitch_6
    iget-boolean v3, p0, Ll/᩵ۜۘ;->֨:Z

    if-eqz v3, :cond_1

    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c5b

    const v5, 0x2703dd1b

    xor-int/2addr v4, v5

    const v5, 0x4f00b974

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, "\u06dc\u1a76"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x11d3

    const v5, -0x349848cf    # -1.5185713E7f

    xor-int/2addr v4, v5

    const v5, -0x5a5d11a2

    goto :goto_0

    .line 43
    :sswitch_7
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a76\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x163d

    const v5, -0x778a7d98

    xor-int/2addr v4, v5

    const v5, 0x4cb003

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d6\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4ba9

    const v5, 0x32801607

    xor-int/2addr v4, v5

    const v5, 0x34bb61b4

    goto/16 :goto_0

    .line 28
    :sswitch_9
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u0736\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x11b5

    const v5, 0x3e7ae52c

    xor-int/2addr v4, v5

    const v5, 0x1c46502a

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5a09

    const v5, 0x4e18d084    # 6.409505E8f

    xor-int/2addr v4, v5

    const v5, -0x29826bea

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    move-result v3

    if-nez v3, :cond_6

    :goto_3
    const-string v3, "\u1a74\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1d61

    const v5, -0x7ad8c6ba

    xor-int/2addr v4, v5

    const v5, -0x2a3505c0

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u073d\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x73df

    const v5, -0x27970ef3

    xor-int/2addr v4, v5

    const v5, -0x17c1d05a

    goto/16 :goto_0

    .line 21
    :sswitch_b
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_7

    goto :goto_5

    :cond_7
    const-string v3, "\u0736\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x40e7

    const v5, 0x5dbf9d3d

    xor-int/2addr v4, v5

    const v5, 0x7470d6f6

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u073f\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x30d7

    const v5, -0x709a279a

    xor-int/2addr v4, v5

    const v5, -0x772b8bc9

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05ab\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5a51

    const v5, -0x4432362

    xor-int/2addr v4, v5

    const v5, 0x587274de

    goto/16 :goto_0

    .line 22
    :sswitch_d
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v3

    if-gtz v3, :cond_b

    :cond_a
    :goto_5
    const-string v3, "\u05a8\u0736"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b7d

    const v5, 0x1778688d

    xor-int/2addr v4, v5

    const v5, 0x32e5400f

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a73\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x334f

    const v5, 0x3fef2e7f

    xor-int/2addr v4, v5

    const v5, -0x1ac89080

    goto/16 :goto_0

    .line 39
    :sswitch_e
    sget v3, Ll/֨ۧ;->֫۠֡:I

    if-gtz v3, :cond_c

    goto :goto_6

    :cond_c
    const-string v3, "\u05ab\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7963

    const v5, -0x4840a590

    xor-int/2addr v4, v5

    const v5, -0x3671c282

    goto/16 :goto_0

    .line 10
    :sswitch_f
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v3

    if-gtz v3, :cond_d

    :goto_6
    const-string v3, "\u1a76\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5095

    const v5, -0x970a98e

    xor-int/2addr v4, v5

    const v5, -0x3230515e

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06e1\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a1b

    const v5, 0x344a208

    xor-int/2addr v4, v5

    const v5, 0x66116a8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a0a1303 -> :sswitch_1
        -0x74c3299c -> :sswitch_1
        -0x67915efb -> :sswitch_a
        -0x65117043 -> :sswitch_4
        -0x5debec31 -> :sswitch_e
        -0x59039054 -> :sswitch_6
        -0x562ac1e6 -> :sswitch_f
        -0x49d3cbda -> :sswitch_7
        -0x3e649299 -> :sswitch_f
        -0x2c70dfa0 -> :sswitch_e
        -0x21024629 -> :sswitch_2
        -0x1eaaae50 -> :sswitch_7
        -0x1df26251 -> :sswitch_c
        -0x1c96c0a5 -> :sswitch_5
        -0x18f4e3a9 -> :sswitch_3
        -0xbebbf9e -> :sswitch_8
        -0x6190a5f -> :sswitch_5
        -0x43669c8 -> :sswitch_9
        0x6950cca -> :sswitch_0
        0x220123bd -> :sswitch_b
        0x226cf81a -> :sswitch_d
        0x23d8a898 -> :sswitch_b
        0x256aa615 -> :sswitch_a
        0x2b0145bf -> :sswitch_2
        0x2e34fc18 -> :sswitch_4
        0x3a039cda -> :sswitch_6
        0x3dd022e3 -> :sswitch_9
        0x549231bc -> :sswitch_d
        0x57f24594 -> :sswitch_c
        0x59e93b7b -> :sswitch_3
        0x5fcb4cef -> :sswitch_0
        0x75a8adf7 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final ۖ()V
    .locals 1

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Ll/᩵ۜۘ;->֨:Z

    .line 97
    invoke-static {p0}, Ll/֨֫;->ۜ᩷᩺(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ()V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x5cae2448

    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v7, Ll/֫۟;->᩸ᩴܿ:I

    const-string v8, "\u06e2\u06d6"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3b37

    const v10, -0x7b54174b

    xor-int/2addr v9, v10

    const v10, 0x5f3c491c

    :goto_0
    xor-int/2addr v8, v10

    :goto_1
    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x21ad

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 72
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget v8, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v8, :cond_3

    goto/16 :goto_3

    .line 30
    :sswitch_0
    sget v8, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v8, :cond_5

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    sget v8, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v8, :cond_8

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto/16 :goto_5

    .line 29
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    return-void

    .line 82
    :sswitch_4
    new-instance v8, Ll/۬ܰۖ;

    sget v9, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v9, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v9, p0, Ll/᩵ۜۘ;->ۘ:Ll/۫ܶۘ;

    iget-object v10, p0, Ll/᩵ۜۘ;->᩺:Ll/ۨ᩹ۘ;

    .line 30
    sget-boolean v11, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v11, :cond_1

    goto :goto_2

    .line 82
    :cond_1
    invoke-direct {v8, v9, v10, v3}, Ll/۬ܰۖ;-><init>(Ll/۫ܶۘ;Ll/ۨ᩹ۘ;Lbin/mt/plugin/api/translation/TranslationEngine;)V

    invoke-static {v4, v8}, Ll/ۘۗ;->ܽۛܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_7

    :sswitch_5
    invoke-static {v2}, Ll/᩷ۜۘ;->ۨ(Ll/᩷ۜۘ;)Ljava/util/ArrayList;

    move-result-object v4

    sget v8, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v8, :cond_2

    goto :goto_2

    :cond_2
    const-string v8, "\u06db\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5f97

    const v10, -0x55ceb4a1

    xor-int/2addr v9, v10

    const v10, 0xb462439

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v8

    if-ltz v8, :cond_4

    :cond_3
    const-string v8, "\u06e1\u073d"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x33

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4ed3

    const v10, 0x39666d68

    xor-int/2addr v9, v10

    const v10, -0x31554065

    goto :goto_0

    :cond_4
    const-string v8, "\u0736\u06ec"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5fe3

    const v10, 0x73541296

    xor-int/2addr v9, v10

    const v10, -0x463c6a99

    goto/16 :goto_0

    :sswitch_7
    sget v8, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v8, :cond_6

    :cond_5
    :goto_2
    const-string v8, "\u073d\u1a73"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x222f

    const v10, -0x6d0da11c

    xor-int/2addr v9, v10

    const v10, 0x5ce70cdf

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06e1\u073a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x1d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1813

    const v10, -0x75c64a57

    xor-int/2addr v9, v10

    const v10, -0x2c0a0caa

    goto/16 :goto_0

    .line 71
    :sswitch_8
    sget v8, Ll/֫;->ܶܺ᩻:I

    if-ltz v8, :cond_7

    goto :goto_3

    :cond_7
    const-string v8, "\u0736\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3603

    const v10, 0x4b3de065    # 1.2443749E7f

    xor-int/2addr v9, v10

    const v10, -0x7a942c4e

    goto/16 :goto_0

    :sswitch_9
    sget v8, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v8, :cond_9

    :cond_8
    :goto_3
    const-string v8, "\u05a1\u05ab"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x63

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x49dd

    const v10, -0x5288ae59

    xor-int/2addr v9, v10

    const v10, -0xfd5e6dc

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06db\u1a75"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x69

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6b1f

    const v10, -0x21ffe378

    xor-int/2addr v9, v10

    const v10, -0x6e64fd8c    # -2.44562E-28f

    goto/16 :goto_0

    .line 13
    :sswitch_a
    sget v8, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v8, :cond_a

    goto :goto_4

    :cond_a
    const-string v8, "\u0733\u1a73"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x1b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x62b5

    const v10, -0x1c5b7bcc

    xor-int/2addr v9, v10

    const v10, -0x6c305a63

    goto/16 :goto_0

    .line 56
    :sswitch_b
    sget-boolean v8, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v8, :cond_b

    :goto_4
    const-string v8, "\u05a1\u0733"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xf79

    const v10, -0x4d4a77fe

    xor-int/2addr v9, v10

    const v10, -0x29036202

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u1a7b\u1a7a"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x3d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3175

    const v10, 0x57d49010

    xor-int/2addr v9, v10

    const v10, 0x5f2e3973

    goto/16 :goto_0

    .line 81
    :sswitch_c
    invoke-static {v1}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 54
    sget v8, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v8, :cond_c

    :goto_5
    const-string v8, "\u073f\u073a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x51

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2d4d

    const v10, -0x3849594    # -5.2217E36f

    xor-int/2addr v9, v10

    const v10, 0x1a9a8424

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u06ec\u1a78"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x25

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x158f

    const v10, 0x687a1c0a

    xor-int/2addr v9, v10

    const v10, 0x72a83b96

    goto/16 :goto_0

    .line 84
    :sswitch_d
    invoke-static {v2}, Ll/᩷ۜۘ;->ۖ(Ll/᩷ۜۘ;)V

    :sswitch_e
    return-void

    .line 81
    :sswitch_f
    invoke-static {v1}, Ll/֫ۘ;->ۡۘᩴ(Ljava/lang/Object;)Z

    move-result v2

    iget-object v8, p0, Ll/᩵ۜۘ;->۬:Ll/᩷ۜۘ;

    if-eqz v2, :cond_d

    const-string v2, "\u1a7a\u0736"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v7

    xor-int v9, v2, v6

    mul-int/lit16 v9, v9, -0x71cf

    const v10, -0x5746d065

    xor-int/2addr v9, v10

    const v10, -0x2eab27f6

    goto :goto_6

    :cond_d
    const-string v2, "\u06dc\u06e7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v6

    mul-int/lit8 v2, v2, 0x7d

    xor-int v9, v2, v7

    mul-int/lit16 v9, v9, -0x69a5

    const v10, 0x1adee148

    xor-int/2addr v9, v10

    const v10, -0x2516f959

    :goto_6
    xor-int/2addr v2, v10

    move-object v12, v8

    move v8, v2

    move-object v2, v12

    goto/16 :goto_1

    .line 79
    :sswitch_10
    invoke-virtual {v0}, Ll/ܿܿۚ;->ۖ()Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "\u05ab\u05a8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x5f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x781d

    const v10, -0x123231a6

    xor-int/2addr v9, v10

    const v10, 0x4b032bdf    # 8596447.0f

    goto/16 :goto_0

    .line 81
    :sswitch_11
    iget-object v1, p0, Ll/᩵ۜۘ;->᩹:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘ֡;->֫᩺ܶ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    const-string v8, "\u1a79\u06ec"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6409

    const v10, -0x78f0de17

    xor-int/2addr v9, v10

    const v10, 0x4567adf1

    goto/16 :goto_0

    .line 79
    :sswitch_12
    iget-object v0, p0, Ll/ۗ᩷᩺;->ܰ:Ll/ܿܿۚ;

    if-eqz v0, :cond_e

    const-string v8, "\u1a76\u06e2"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x45

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x3d9b

    const v10, 0x7a8fb

    xor-int/2addr v9, v10

    const v10, 0x1787c540

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06e7\u1a78"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x1d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5c45

    const v10, 0x18bd638f

    xor-int/2addr v9, v10

    const v10, -0x456b0145

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f605db8 -> :sswitch_0
        -0x6bef9cda -> :sswitch_8
        -0x67b4ed12 -> :sswitch_2
        -0x5aaacfed -> :sswitch_b
        -0x463a72f7 -> :sswitch_a
        -0x3cb7134c -> :sswitch_7
        -0x37b98649 -> :sswitch_12
        -0x3343182b -> :sswitch_e
        -0x2cf7402e -> :sswitch_7
        -0x291fddbb -> :sswitch_c
        -0x23c8057c -> :sswitch_9
        -0x130067c8 -> :sswitch_d
        -0x126737c1 -> :sswitch_5
        -0xb682b8c -> :sswitch_d
        -0x8f8eb60 -> :sswitch_3
        -0x541e0d5 -> :sswitch_0
        -0x531b22a -> :sswitch_2
        -0x4d9d8e8 -> :sswitch_6
        0xee8204e -> :sswitch_b
        0x13071c66 -> :sswitch_f
        0x1c04769c -> :sswitch_1
        0x2504c173 -> :sswitch_1
        0x2660e19b -> :sswitch_12
        0x2c2bb08f -> :sswitch_a
        0x2db71b7b -> :sswitch_11
        0x2eb99f8e -> :sswitch_5
        0x3b1d34c3 -> :sswitch_10
        0x3baf1981 -> :sswitch_10
        0x3d6a064c -> :sswitch_3
        0x462d0f69 -> :sswitch_c
        0x4f6df527 -> :sswitch_8
        0x5d257550 -> :sswitch_4
        0x610d8233 -> :sswitch_6
        0x704d6829 -> :sswitch_9
        0x73bf9b1c -> :sswitch_11
        0x7b4697e9 -> :sswitch_4
        0x7d59aaa1 -> :sswitch_e
        0x7db3a737 -> :sswitch_f
    .end sparse-switch
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x41a7707e

    sget v2, Ll/ۗ;->֨۬ۖ:I

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    const-string v4, "\u06db\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1f8d

    const v6, 0x7eed2f7a

    xor-int/2addr v5, v6

    const v6, 0x2c700ebf

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x7d2b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v4, :cond_d

    goto/16 :goto_4

    .line 29
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v4

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a7a\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4505

    const v6, 0x38e80a3

    xor-int/2addr v5, v6

    const v6, -0x6a92fb44

    goto :goto_0

    :sswitch_1
    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v4, :cond_8

    goto/16 :goto_4

    :sswitch_2
    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_5

    goto/16 :goto_4

    .line 53
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    goto/16 :goto_4

    .line 71
    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    :sswitch_5
    return-void

    .line 89
    :sswitch_6
    invoke-virtual {v0}, Ll/ܿܿۚ;->ۖ()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u1a76\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x16e1

    const v6, -0x4c740d18

    xor-int/2addr v5, v6

    const v6, 0x193f5b40

    goto :goto_0

    .line 91
    :sswitch_7
    iget-object v0, p0, Ll/᩵ۜۘ;->᩺:Ll/ۨ᩹ۘ;

    invoke-virtual {v0, p1}, Ll/ۨ᩹ۘ;->ۙ(Ljava/lang/Throwable;)V

    return-void

    .line 89
    :sswitch_8
    iget-object v0, p0, Ll/ۗ᩷᩺;->ܰ:Ll/ܿܿۚ;

    if-eqz v0, :cond_1

    const-string v4, "\u06dc\u073f"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4b75

    const v6, -0x52863a5b

    xor-int/2addr v5, v6

    const v6, 0x6d52b528

    goto :goto_0

    :cond_1
    const-string v4, "\u06e0\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5423

    const v6, -0x147adde4

    xor-int/2addr v5, v6

    const v6, -0x257afeb8

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a74\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x11a9

    const v6, -0x4f2f745e

    xor-int/2addr v5, v6

    const v6, -0x3810e8b4

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u06e1\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x31

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x25b1

    const v6, -0x56547414

    xor-int/2addr v5, v6

    const v6, 0x569328f4

    goto/16 :goto_0

    .line 50
    :sswitch_b
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u06eb\u06d7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7cc3

    const v6, 0x6d4499a9

    xor-int/2addr v5, v6

    const v6, 0x64c3f82

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u06df\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fd5

    const v6, 0x4c543417    # 5.5627868E7f

    xor-int/2addr v5, v6

    const v6, -0x5ac44515

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u1a77\u06e0"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3cc1

    const v6, -0x2e45ba9

    xor-int/2addr v5, v6

    const v6, -0x182c165

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06e8\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4d45

    const v6, -0xfdafe5c

    xor-int/2addr v5, v6

    const v6, 0x489e1a2b

    goto/16 :goto_0

    .line 36
    :sswitch_e
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d7\u06eb"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x47e9

    const v6, 0x1a340f60

    xor-int/2addr v5, v6

    const v6, -0xc5a872

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x77d5

    const v6, 0x1444dd04

    xor-int/2addr v5, v6

    const v6, -0x6807546f

    goto/16 :goto_0

    .line 23
    :sswitch_f
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u073f\u1a78"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x46cb

    const v6, -0x79a4e7e6

    xor-int/2addr v5, v6

    const v6, -0x380dda5

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u06db\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2b41

    const v6, 0x31d084ce

    xor-int/2addr v5, v6

    const v6, 0x31519b3b

    goto/16 :goto_0

    :sswitch_11
    sget v4, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v4, :cond_c

    :goto_3
    const-string v4, "\u06da\u0730"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1f6d

    const v6, -0x77d2f825

    xor-int/2addr v5, v6

    const v6, 0x6f935178

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x75c7

    const v6, 0x3ccbd3

    xor-int/2addr v5, v6

    const v6, 0x34e09828

    goto/16 :goto_0

    :goto_4
    const-string v4, "\u06d9\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4541

    const v6, -0x3893c458

    xor-int/2addr v5, v6

    const v6, 0x7298ffae

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xfc9

    const v6, -0x840c2b

    xor-int/2addr v5, v6

    const v6, -0xfbe657a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e32a7cb -> :sswitch_b
        -0x7c5eac6f -> :sswitch_f
        -0x79efa94e -> :sswitch_10
        -0x788b782f -> :sswitch_3
        -0x700e77a3 -> :sswitch_11
        -0x6b01589a -> :sswitch_5
        -0x66322ca5 -> :sswitch_e
        -0x642dd76f -> :sswitch_8
        -0x353bf455 -> :sswitch_0
        -0x3036015f -> :sswitch_d
        -0x282c6ad1 -> :sswitch_5
        -0x27b43fdc -> :sswitch_9
        -0x205d83b9 -> :sswitch_6
        -0x1cf2aa57 -> :sswitch_4
        -0x17b4d379 -> :sswitch_d
        -0x1142fc36 -> :sswitch_6
        -0xa9bd1ac -> :sswitch_9
        -0x83ca5b6 -> :sswitch_10
        -0x59107cc -> :sswitch_c
        0x11145d03 -> :sswitch_0
        0x15e9b3ea -> :sswitch_a
        0x1a4fc9ae -> :sswitch_a
        0x1c2b8cbd -> :sswitch_e
        0x25cab846 -> :sswitch_8
        0x279e5970 -> :sswitch_1
        0x35b2ff2c -> :sswitch_f
        0x362b63db -> :sswitch_3
        0x41b453b8 -> :sswitch_c
        0x43f03c4a -> :sswitch_4
        0x5543b614 -> :sswitch_2
        0x5be6863c -> :sswitch_b
        0x665b4e04 -> :sswitch_1
        0x67b3e152 -> :sswitch_7
        0x67f16359 -> :sswitch_2
        0x6830d939 -> :sswitch_11
        0x78246357 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۚ()V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x180dcc57

    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    sget v7, Ll/ۘۗ;->ۖۧ۬:I

    const-string v8, "\u073a\u073a"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x59

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5d8b

    const v10, 0x17c4159a

    xor-int/2addr v9, v10

    const v10, 0x4bfd23d5    # 3.3179562E7f

    :goto_0
    xor-int/2addr v8, v10

    move-object v10, v0

    :goto_1
    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x4c6b

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    sget v8, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v8, :cond_2

    goto/16 :goto_4

    .line 9
    :sswitch_0
    sget v8, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v8, :cond_a

    goto/16 :goto_4

    .line 55
    :sswitch_1
    sget v8, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v8, :cond_c

    goto :goto_2

    .line 64
    :sswitch_2
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    sget v8, Ll/ۗ᩺;->ۢۜ᩶:I

    if-lez v8, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_2
    const-string v8, "\u073f\u05a8"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x7

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5c7f

    const v11, 0x1cc0529c

    xor-int/2addr v9, v11

    const v11, -0x3bb6b83b

    goto/16 :goto_8

    .line 56
    :sswitch_3
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    goto/16 :goto_4

    .line 30
    :sswitch_4
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    return-void

    .line 72
    :sswitch_5
    invoke-virtual {v1, v4}, Ll/ۨ᩹ۘ;->ۙ(Ljava/lang/Throwable;)V

    goto/16 :goto_3

    .line 68
    :sswitch_6
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 69
    invoke-virtual {v1}, Ll/ۨ᩹ۘ;->ܰ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    invoke-interface {v8, v9}, Lbin/mt/plugin/api/translation/TranslationEngine;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 70
    iget-object v9, p0, Ll/᩵ۜۘ;->᩹:Ljava/util/ArrayList;

    invoke-static {v9, v8}, Ll/ۖۗ;->ۨۜܰ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v4

    const-string v8, "\u1a78\u06d7"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x69

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7539

    const v11, 0x7e8e1d2d

    xor-int/2addr v9, v11

    const v11, -0x14e39601

    goto/16 :goto_8

    .line 66
    :sswitch_7
    invoke-static {v2}, Ll/֡۠;->ۗۛۖ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    const-string v8, "\u06ec\u06e8"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x13

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1d0f

    const v11, 0x72ee42ba

    xor-int/2addr v9, v11

    const v11, -0x43c56682

    goto/16 :goto_8

    :sswitch_8
    return-void

    :sswitch_9
    invoke-static {v2}, Ll/֨۟;->᩵ۨۚ(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "\u05a1\u06db"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x1d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7457

    const v11, 0x37a4f245

    xor-int/2addr v9, v11

    const v11, 0x3aa325cf

    goto/16 :goto_8

    :cond_1
    const-string v8, "\u1a79\u073d"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x2f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1f33

    const v11, -0x792e037f

    xor-int/2addr v9, v11

    const v11, -0x24323240

    goto/16 :goto_8

    .line 65
    :sswitch_a
    iget-object v1, p0, Ll/᩵ۜۘ;->᩺:Ll/ۨ᩹ۘ;

    invoke-virtual {v1, v10}, Ll/ۨ᩹ۘ;->ۖ(Ljava/util/ArrayList;)V

    .line 66
    invoke-static {v10}, Ll/ۗܺ;->֡ۙۚ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    const-string v8, "\u06e0\u06da"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7341

    const v11, -0x43fa9e45

    xor-int/2addr v9, v11

    const v11, -0x35ab0efa    # -3488833.5f

    goto/16 :goto_8

    .line 64
    :sswitch_b
    new-instance v10, Ljava/util/ArrayList;

    sget v8, Ll/۟;->ۨᩴۛ:I

    if-ltz v8, :cond_3

    :cond_2
    const-string v8, "\u06eb\u05ab"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x67

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x4baf

    const v10, 0x76ee9fd7

    xor-int/2addr v9, v10

    const v10, 0x6ec2dc7b

    goto/16 :goto_0

    .line 16
    :cond_3
    sget v8, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v8, :cond_4

    goto :goto_5

    .line 36
    :cond_4
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_7

    .line 58
    :cond_5
    sget v8, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v8, :cond_6

    goto :goto_6

    .line 57
    :cond_6
    sget v8, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v8, :cond_7

    goto :goto_6

    :cond_7
    sget v8, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v8, :cond_8

    goto :goto_4

    :cond_8
    sget v8, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v8, :cond_9

    :goto_4
    const-string v8, "\u073d\u073d"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x4f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2783

    const v10, -0x36c4e96f

    xor-int/2addr v9, v10

    const v10, -0x463199dc

    goto/16 :goto_0

    :cond_9
    sget-boolean v8, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v8, :cond_b

    :cond_a
    :goto_5
    const-string v8, "\u073d\u1a7a"

    invoke-static {v8}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0xb

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2321

    const v10, -0x16aaefef

    xor-int/2addr v9, v10

    const v10, -0x48e29174

    goto/16 :goto_0

    :cond_b
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v8

    if-eqz v8, :cond_d

    :cond_c
    :goto_6
    const-string v8, "\u1a7a\u06e4"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4009

    const v10, -0x389973e7

    xor-int/2addr v9, v10

    const v10, 0x7f7ee5c3

    goto/16 :goto_0

    .line 64
    :cond_d
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 35
    sget v8, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v8, :cond_e

    :goto_7
    const-string v8, "\u1a7b\u1a73"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2283

    const v10, -0x291f062

    xor-int/2addr v9, v10

    const v10, 0x6ef6bc17

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u05ab\u1a79"

    invoke-static {v8}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7bd

    const v11, -0x219d50f2

    xor-int/2addr v9, v11

    const v11, 0x227a2df6

    :goto_8
    xor-int/2addr v8, v11

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x77baaf69 -> :sswitch_4
        -0x73067565 -> :sswitch_a
        -0x6dc67b94 -> :sswitch_b
        -0x65342055 -> :sswitch_9
        -0x617c4435 -> :sswitch_6
        -0x5ca25c3b -> :sswitch_3
        -0x5c3cd8d8 -> :sswitch_1
        -0x59223846 -> :sswitch_0
        -0x4a2b3965 -> :sswitch_a
        -0x48ee00af -> :sswitch_7
        -0x34160166 -> :sswitch_3
        -0x30711512 -> :sswitch_8
        -0x1d9fab29 -> :sswitch_5
        -0x172c00d6 -> :sswitch_2
        -0x7ef1f18 -> :sswitch_7
        -0xd48cd7 -> :sswitch_5
        0x2398ead -> :sswitch_6
        0x25dd7e9 -> :sswitch_8
        0x5432dfe -> :sswitch_1
        0xfdb29a0 -> :sswitch_b
        0x44adb482 -> :sswitch_9
        0x64033ef2 -> :sswitch_4
        0x7987b34f -> :sswitch_0
        0x7fb58681 -> :sswitch_2
    .end sparse-switch
.end method

.method public final ܰ()V
    .locals 7

    const v0, -0x41461d6c

    sget v1, Ll/ۧ;->֫۠ᩴ:I

    sget v2, Ll/֫;->ܶܺ᩻:I

    const-string v3, "\u06eb\u1a74"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4fe3

    const v5, -0x34ae8040    # -1.3729728E7f

    xor-int/2addr v4, v5

    const v5, -0x45c78ff0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1ae3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/֫;->ۛۖۤ()I

    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_a

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06d8\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x22d7

    const v5, -0x568e63ca

    xor-int/2addr v4, v5

    const v5, 0x4b22f475    # 1.0679413E7f

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    .line 41
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    return-void

    .line 51
    :sswitch_4
    new-instance v3, Ll/ᩴۜۘ;

    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_1

    goto :goto_2

    .line 22
    :cond_1
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_2

    goto :goto_1

    .line 11
    :cond_2
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u06e4\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5707

    const v5, -0x62e769d0

    xor-int/2addr v4, v5

    const v5, 0x726ac076

    goto :goto_0

    :cond_4
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_2

    .line 3
    :cond_5
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v4

    if-ltz v4, :cond_6

    goto :goto_2

    .line 43
    :cond_6
    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    sget v4, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v4, :cond_8

    :goto_2
    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf5d

    const v5, 0x4c549102    # 5.5723016E7f

    xor-int/2addr v4, v5

    const v5, 0x7bd0713

    goto/16 :goto_0

    .line 24
    :cond_8
    sget v4, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v4, :cond_9

    goto :goto_4

    .line 51
    :cond_9
    iget-object v4, p0, Ll/᩵ۜۘ;->ۘ:Ll/۫ܶۘ;

    .line 18
    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e8\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x783b

    const v5, -0x4e2168cf

    xor-int/2addr v4, v5

    const v5, -0x7c7acf2a

    goto/16 :goto_0

    .line 51
    :cond_b
    iget-object v5, p0, Ll/᩵ۜۘ;->ۜ:Ljava/util/concurrent/ExecutorService;

    .line 45
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v6

    if-gtz v6, :cond_c

    :goto_4
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2599

    const v5, -0x494716e9

    xor-int/2addr v4, v5

    const v5, 0x42aed63e

    goto/16 :goto_0

    .line 51
    :cond_c
    invoke-direct {v3, p0, v4, v5}, Ll/ᩴۜۘ;-><init>(Ll/᩵ۜۘ;Ll/۫ܶۘ;Ljava/util/concurrent/ExecutorService;)V

    const-wide/16 v0, 0x320

    invoke-static {v3, v0, v1}, Ll/֫᩺;->ۚᩴۘ(Ljava/lang/Object;J)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x69836643 -> :sswitch_2
        -0x57683a8e -> :sswitch_3
        -0x4cb31f6b -> :sswitch_1
        -0x39d8e66b -> :sswitch_3
        -0x27501713 -> :sswitch_2
        -0x209e9308 -> :sswitch_0
        0x53c7c92 -> :sswitch_4
        0x13b8de33 -> :sswitch_1
        0x485449b6 -> :sswitch_4
        0x5be33eff -> :sswitch_0
    .end sparse-switch
.end method
