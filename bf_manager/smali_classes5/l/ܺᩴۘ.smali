.class public final Ll/ܺᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/ۤܺۚ;


# instance fields
.field public final synthetic ܺ:Ll/᩶ᩴۘ;

.field public final synthetic ᩶:Ll/۠᩻᩺;


# direct methods
.method public constructor <init>(Ll/᩶ᩴۘ;Ll/۠᩻᩺;)V
    .locals 6

    const v0, -0x1fc639cb

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    .line 1606
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a74\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x78f7

    const v5, 0x70465331

    xor-int/2addr v4, v5

    const v5, -0x5ff823d5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x1a59

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p2, p0, Ll/ܺᩴۘ;->᩶:Ll/۠᩻᩺;

    return-void

    .line 1443
    :sswitch_0
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v3, :cond_2

    goto/16 :goto_3

    .line 1286
    :sswitch_1
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_9

    goto :goto_1

    .line 1288
    :sswitch_2
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-gez v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x13c9

    const v5, -0x580d5683

    xor-int/2addr v4, v5

    const v5, -0x239173c4

    goto :goto_0

    .line 413
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_4

    .line 1106
    :sswitch_4
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1949

    const v5, 0x31f2c5e7

    xor-int/2addr v4, v5

    const v5, 0x25549d74

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1349

    const v5, -0x36b037c0    # -851076.0f

    xor-int/2addr v4, v5

    const v5, -0x3d4b67b3

    goto :goto_0

    :cond_3
    const-string v3, "\u06da\u06d8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x83

    const v5, 0x227e5a48

    xor-int/2addr v4, v5

    const v5, -0x57e657c7

    goto/16 :goto_0

    .line 343
    :sswitch_7
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u05a8\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4801

    const v5, -0x2ad02696

    xor-int/2addr v4, v5

    const v5, -0x4b6b8766

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u0733\u06d7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2d97

    const v5, 0x20740133    # 2.0668001E-19f

    xor-int/2addr v4, v5

    const v5, -0x2cb580ed

    goto/16 :goto_0

    .line 1291
    :sswitch_9
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_6

    :goto_2
    const-string v3, "\u06ec\u05a8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x455b

    const v5, 0x6c44c87a

    xor-int/2addr v4, v5

    const v5, 0x3145ec16

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a4d

    const v5, -0x4e162b00

    xor-int/2addr v4, v5

    const v5, -0x5fa4a5d0

    goto/16 :goto_0

    .line 883
    :sswitch_a
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u06da\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x664b

    const v5, 0x78579dde

    xor-int/2addr v4, v5

    const v5, -0x1c4bed13

    goto/16 :goto_0

    .line 70
    :sswitch_b
    sget v3, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d9\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5053

    const v5, 0xf739131

    xor-int/2addr v4, v5

    const v5, -0x883ca1f

    goto/16 :goto_0

    .line 1048
    :sswitch_c
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06ec\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x137

    const v5, -0x6dd8a971

    xor-int/2addr v4, v5

    const v5, 0x7b64d7e0

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u06eb"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x17d3

    const v5, 0x28eb9c88

    xor-int/2addr v4, v5

    const v5, 0x411c1dc3

    goto/16 :goto_0

    .line 1169
    :sswitch_d
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1003

    const v5, -0x35246fce    # -7194649.0f

    xor-int/2addr v4, v5

    const v5, -0x7cb39fdb

    goto/16 :goto_0

    .line 1606
    :sswitch_e
    iput-object p1, p0, Ll/ܺᩴۘ;->ܺ:Ll/᩶ᩴۘ;

    .line 1482
    sget v3, Ll/ۗ۬;->ۤᩴ᩻:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u05ab\u1a76"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4553

    const v5, 0x7a77404d

    xor-int/2addr v4, v5

    const v5, -0x18929bee

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7f07

    const v5, -0x3ff064b8

    xor-int/2addr v4, v5

    const v5, -0x6d54c7e

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ad6eced -> :sswitch_7
        -0x78fa5e24 -> :sswitch_a
        -0x75f222da -> :sswitch_3
        -0x61b60482 -> :sswitch_8
        -0x5d7ba20c -> :sswitch_0
        -0x5d6eb8dd -> :sswitch_a
        -0x4999bb7e -> :sswitch_d
        -0x3863e4cd -> :sswitch_9
        -0x2d0b83e5 -> :sswitch_b
        -0x25695d81 -> :sswitch_2
        -0x1cda389f -> :sswitch_4
        -0x1717aa4a -> :sswitch_e
        -0x14d0c0b8 -> :sswitch_7
        -0x9977938 -> :sswitch_d
        -0x9193c2d -> :sswitch_9
        -0x3c4c912 -> :sswitch_c
        -0x14df4f -> :sswitch_c
        0xad32766 -> :sswitch_6
        0x192e8909 -> :sswitch_3
        0x2086fc47 -> :sswitch_4
        0x2d078097 -> :sswitch_2
        0x2d6393c3 -> :sswitch_1
        0x41c58a25 -> :sswitch_1
        0x47cea5df -> :sswitch_5
        0x4fd331ba -> :sswitch_e
        0x62d17731 -> :sswitch_5
        0x64519404 -> :sswitch_6
        0x6726ba2e -> :sswitch_0
        0x70b78e47 -> :sswitch_b
        0x770b673c -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final ֨()Z
    .locals 1

    .line 1614
    iget-object v0, p0, Ll/ܺᩴۘ;->ܺ:Ll/᩶ᩴۘ;

    iget-object v0, v0, Ll/᩶ᩴۘ;->֨:Ll/֫ۧۚ;

    invoke-static {v0}, Ll/֫ۘ;->ᩳܰۤ(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final synthetic ۘۙ()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ(JJJ)V
    .locals 2

    const p3, -0x4d52bc74

    sget p4, Ll/֨ۢ;->ۢ۬ۧ:I

    sget p5, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string p6, "\u05a8\u06ec"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p5

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, 0x64f7

    const v1, -0x88177c3

    xor-int/2addr v0, v1

    const v1, -0x3f064f16

    :goto_0
    xor-int/2addr p6, v1

    xor-int/2addr p3, p4

    mul-int/lit16 p3, p3, -0x60f1

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p3, v0

    xor-int/2addr p3, p6

    sparse-switch p3, :sswitch_data_0

    .line 514
    sget p6, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz p6, :cond_0

    goto/16 :goto_3

    .line 277
    :sswitch_0
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result p6

    if-lez p6, :cond_6

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    sget-boolean p6, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz p6, :cond_b

    goto :goto_2

    .line 580
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget p6, Ll/֡֡;->᩶ۤ۠:I

    if-lez p6, :cond_1

    goto :goto_1

    .line 778
    :sswitch_3
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    :goto_1
    const-string p6, "\u1a77\u1a78"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    sub-int p6, p5, p6

    mul-int/lit8 p6, p6, 0x5

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, 0x1985

    const v1, -0x34b29e81    # -1.3459839E7f

    xor-int/2addr v0, v1

    const v1, 0x113604b8

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    return-void

    .line 1609
    :sswitch_5
    iget-object p3, p0, Ll/ܺᩴۘ;->᩶:Ll/۠᩻᩺;

    invoke-virtual {p3, p1, p2}, Ll/۠᩻᩺;->ۙ(J)V

    return-void

    :cond_0
    const-string p6, "\u1a75\u1a76"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p5

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, -0x431b

    const v1, 0x4f0b81f2    # 2.340549E9f

    xor-int/2addr v0, v1

    const v1, 0x7801dd17

    goto :goto_0

    .line 394
    :sswitch_6
    sget p6, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz p6, :cond_2

    :cond_1
    :goto_2
    const-string p6, "\u06d7\u06ec"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p4

    mul-int/lit8 p6, p6, -0x57

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, 0x72ab

    const v1, 0xf0700a5

    xor-int/2addr v0, v1

    const v1, 0x53dc6561

    goto/16 :goto_0

    :cond_2
    const-string p6, "\u05ab\u1a75"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    add-int/2addr p6, p4

    mul-int/lit8 p6, p6, 0x37

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, -0x6b71

    const v1, -0x17f6ee8b

    xor-int/2addr v0, v1

    const v1, -0x13fa6246

    goto/16 :goto_0

    .line 301
    :sswitch_7
    sget p6, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz p6, :cond_3

    goto :goto_3

    :cond_3
    const-string p6, "\u1a74\u0730"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    add-int/2addr p6, p5

    mul-int/lit8 p6, p6, 0xb

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, -0x3875

    const v1, 0x2ae3ca34

    xor-int/2addr v0, v1

    const v1, -0x1d17e9c0

    goto/16 :goto_0

    .line 115
    :sswitch_8
    sget p6, Ll/֨ۧ;->֫۠֡:I

    if-gtz p6, :cond_4

    goto :goto_3

    :cond_4
    const-string p6, "\u1a77\u06df"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    add-int/2addr p6, p4

    mul-int/lit8 p6, p6, -0x17

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, -0x5c8d

    const v1, -0x7d9c3ffc

    xor-int/2addr v0, v1

    const v1, -0x5d85c6d0

    goto/16 :goto_0

    :sswitch_9
    sget p6, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p6, :cond_5

    :goto_3
    const-string p6, "\u073f\u06d8"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    sub-int p6, p5, p6

    mul-int/lit8 p6, p6, -0x47

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, 0x4a09

    const v1, 0x16715be1

    xor-int/2addr v0, v1

    const v1, -0x9118db3

    goto/16 :goto_0

    :cond_5
    const-string p6, "\u1a7b\u1a78"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    add-int/2addr p6, p4

    mul-int/lit8 p6, p6, -0x67

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, -0x5927

    const v1, -0x38c29565

    xor-int/2addr v0, v1

    const v1, 0x4bd4fd53    # 2.7916966E7f

    goto/16 :goto_0

    .line 1387
    :sswitch_a
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    move-result p6

    if-nez p6, :cond_7

    :cond_6
    const-string p6, "\u0730\u06e0"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p5

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, 0x198b

    const v1, 0x2bb580aa

    xor-int/2addr v0, v1

    const v1, -0x6841d32d

    goto/16 :goto_0

    :cond_7
    const-string p6, "\u1a73\u06e7"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    add-int/2addr p6, p5

    mul-int/lit8 p6, p6, -0x61

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, -0x2f59

    const v1, 0x20509014

    xor-int/2addr v0, v1

    const v1, -0x6aff6e8f

    goto/16 :goto_0

    .line 1317
    :sswitch_b
    sget-boolean p6, Ll/֨᩸;->ۚۢۧ:Z

    if-nez p6, :cond_8

    goto :goto_4

    :cond_8
    const-string p6, "\u06df\u1a73"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p5

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, -0x4953

    const v1, -0x5b89dd8c

    xor-int/2addr v0, v1

    const v1, -0x67b749d7

    goto/16 :goto_0

    .line 1573
    :sswitch_c
    sget-boolean p6, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez p6, :cond_9

    goto :goto_4

    :cond_9
    const-string p6, "\u06e4\u06e2"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p4

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, -0x2a93

    const v1, -0x3c7019d6

    xor-int/2addr v0, v1

    const v1, 0xbfeeae1

    goto/16 :goto_0

    .line 274
    :sswitch_d
    sget p6, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz p6, :cond_a

    goto :goto_4

    :cond_a
    const-string p6, "\u06e7\u1a74"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    add-int/2addr p6, p5

    mul-int/lit8 p6, p6, 0x2d

    xor-int v0, p6, p4

    mul-int/lit16 v0, v0, 0x16d1

    const v1, 0x67fea725

    xor-int/2addr v0, v1

    const v1, 0x1b601b7c

    goto/16 :goto_0

    :sswitch_e
    sget p6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz p6, :cond_c

    :cond_b
    :goto_4
    const-string p6, "\u06dc\u1a77"

    invoke-static {p6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p6

    xor-int/2addr p6, p4

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, -0xc89

    const v1, 0x4a0d327d    # 2313375.2f

    xor-int/2addr v0, v1

    const v1, -0x5ecc9d53

    goto/16 :goto_0

    :cond_c
    const-string p6, "\u06da\u06db"

    invoke-static {p6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p6

    sub-int p6, p4, p6

    mul-int/lit8 p6, p6, -0x7

    xor-int v0, p6, p5

    mul-int/lit16 v0, v0, 0x7c0f

    const v1, 0x3775f629

    xor-int/2addr v0, v1

    const v1, 0x17267609

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x623d6b21 -> :sswitch_7
        -0x60e6c54f -> :sswitch_e
        -0x601e0845 -> :sswitch_0
        -0x45e1b9c1 -> :sswitch_6
        -0x3e0b3020 -> :sswitch_c
        -0x38579abe -> :sswitch_a
        -0x37a10a84 -> :sswitch_1
        -0x31995972 -> :sswitch_4
        -0x24b03db0 -> :sswitch_b
        -0x20e312fa -> :sswitch_c
        -0x19946c21 -> :sswitch_8
        -0x3d1c957 -> :sswitch_6
        0x5640a0b -> :sswitch_7
        0x7bc26e2 -> :sswitch_a
        0x1971cb49 -> :sswitch_3
        0x1dfcd95b -> :sswitch_0
        0x21f5114e -> :sswitch_5
        0x2500d631 -> :sswitch_d
        0x27e2afa9 -> :sswitch_5
        0x3fcf7c9c -> :sswitch_9
        0x40152f2b -> :sswitch_3
        0x443b7b59 -> :sswitch_2
        0x44bb47ac -> :sswitch_4
        0x4cc56f1f -> :sswitch_8
        0x5c0e3b17 -> :sswitch_d
        0x5c13e9a6 -> :sswitch_9
        0x5d6976f6 -> :sswitch_1
        0x71827979 -> :sswitch_2
        0x75754240 -> :sswitch_e
        0x7fccb06c -> :sswitch_b
    .end sparse-switch
.end method
