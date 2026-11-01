.class public Ll/ۧܶۘ;
.super Ll/ۖ᩺;
.source "4651"


# instance fields
.field public ֡:I

.field public ܺ:Ll/ܳܶۘ;

.field public ܽ:Landroid/graphics/Paint;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/4 v0, 0x0

    const v1, -0x70ef0144

    sget v2, Ll/ۗܺ;->ۨ᩺۠:I

    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    .line 17
    invoke-direct {p0, p1, p2}, Ll/ۖ᩺;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "\u06df\u06da"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x1b91

    const v4, 0x34f9bced

    xor-int/2addr p2, v4

    const v4, 0x2b7fd17e

    :goto_0
    xor-int/2addr p1, v4

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x1ba1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr p2, v1

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget-boolean p1, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz p1, :cond_5

    goto/16 :goto_1

    .line 5
    :sswitch_1
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget p1, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez p1, :cond_b

    goto :goto_1

    .line 7
    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget p1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-gez p1, :cond_8

    goto :goto_1

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    iput-boolean v0, p0, Ll/ۧܶۘ;->᩶:Z

    return-void

    .line 16
    :sswitch_5
    sget p1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz p1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string p1, "\u06e2\u073d"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x15

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6ed9

    const v4, 0x3d033a06

    xor-int/2addr p2, v4

    const v4, 0x58dbbfcd

    goto :goto_0

    .line 14
    :sswitch_6
    sget p1, Ll/֫;->ܶܺ᩻:I

    if-ltz p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u05a8\u05ab"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x3d

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x3e89

    const v4, 0x61bfcb9e

    xor-int/2addr p2, v4

    const v4, 0x2d0f5528

    goto :goto_0

    .line 12
    :sswitch_7
    sget p1, Ll/ۗ;->֨۬ۖ:I

    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u1a74\u06e2"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x1f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x271d

    const v4, 0x4b69a74f    # 1.5312719E7f

    xor-int/2addr p2, v4

    const v4, -0x3cda0c2a

    goto/16 :goto_0

    .line 7
    :sswitch_8
    sget p1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p1, :cond_3

    :goto_1
    const-string p1, "\u1a78\u0730"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x57

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x36df

    const v4, -0x2cb62cd2

    xor-int/2addr p2, v4

    const v4, -0x7e2a15e3

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073a\u0736"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x277

    const v4, -0x250c0869

    xor-int/2addr p2, v4

    const v4, 0x4ab40402    # 5898753.0f

    goto/16 :goto_0

    .line 11
    :sswitch_9
    sget p1, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz p1, :cond_4

    :goto_2
    const-string p1, "\u06e7\u06e2"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x57

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5087

    const v4, 0x8708603

    xor-int/2addr p2, v4

    const v4, -0x2b6daf7b

    goto/16 :goto_0

    :cond_4
    const-string p1, "\u06dc\u06db"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x39

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x5d19

    const v4, -0xf53c515

    xor-int/2addr p2, v4

    const v4, -0x551ad0ab

    goto/16 :goto_0

    .line 13
    :sswitch_a
    sget-boolean p1, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez p1, :cond_6

    :cond_5
    const-string p1, "\u1a74\u06e0"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x53e7

    const v4, -0x191a16c7

    xor-int/2addr p2, v4

    const v4, -0x169bd4dc

    goto/16 :goto_0

    :cond_6
    const-string p1, "\u06d8\u05a1"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x65

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x8a7

    const v4, -0x2b43f05b

    xor-int/2addr p2, v4

    const v4, -0x28398f00

    goto/16 :goto_0

    .line 7
    :sswitch_b
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const-string p1, "\u06da\u06da"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x27

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x7039

    const v4, 0x7e8d983c

    xor-int/2addr p2, v4

    const v4, 0x4fcbfd83

    goto/16 :goto_0

    .line 16
    :sswitch_c
    sget p1, Ll/֫;->ܶܺ᩻:I

    if-ltz p1, :cond_9

    :cond_8
    :goto_3
    const-string p1, "\u06eb\u06e4"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0xd

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x546d

    const v4, -0x41360131

    xor-int/2addr p2, v4

    const v4, 0x5538db9

    goto/16 :goto_0

    :cond_9
    const-string p1, "\u06e1\u05ab"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x1d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2a1f

    const v4, -0x4dd85de3

    xor-int/2addr p2, v4

    const v4, 0x1b54f347

    goto/16 :goto_0

    :sswitch_d
    sget-boolean p1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz p1, :cond_a

    goto :goto_4

    :cond_a
    const-string p1, "\u06d8\u06e0"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x2d

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x5bb

    const v4, -0x5cd49401

    xor-int/2addr p2, v4

    const v4, 0x4cfec122    # 1.3356469E8f

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 14
    sget p1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz p1, :cond_c

    :cond_b
    :goto_4
    const-string p1, "\u073f\u0730"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x79

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x31c7

    const v4, -0x10e3ec78

    xor-int/2addr p2, v4

    const v4, 0x5a0a9702

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06da\u05ab"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x527

    const v4, 0x2242fddd

    xor-int/2addr p2, v4

    const v4, 0x1e8fc139

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79af239f -> :sswitch_2
        -0x6f622ef1 -> :sswitch_d
        -0x6f535935 -> :sswitch_8
        -0x666c1728 -> :sswitch_a
        -0x65d88962 -> :sswitch_3
        -0x5fde23a5 -> :sswitch_1
        -0x56ef7ce2 -> :sswitch_a
        -0x5250c7e3 -> :sswitch_c
        -0x51444e1d -> :sswitch_5
        -0x484be6b7 -> :sswitch_6
        -0x3ab01a92 -> :sswitch_9
        -0x37ad76e5 -> :sswitch_0
        -0x368b8550 -> :sswitch_2
        -0x348ffe5e -> :sswitch_6
        -0x2535c38b -> :sswitch_b
        -0xacc91bb -> :sswitch_d
        -0x581ca27 -> :sswitch_8
        0x3f22ead -> :sswitch_7
        0xeb836f7 -> :sswitch_4
        0x11788ad0 -> :sswitch_e
        0x293de94c -> :sswitch_9
        0x3fdaadc3 -> :sswitch_0
        0x4d6bfea0 -> :sswitch_1
        0x50f4eef2 -> :sswitch_b
        0x59acddb0 -> :sswitch_4
        0x5b054896 -> :sswitch_5
        0x5d455940 -> :sswitch_3
        0x6239c736 -> :sswitch_e
        0x6e23de14 -> :sswitch_7
        0x6e38b5f8 -> :sswitch_c
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const/4 v0, 0x0

    const v1, 0x302d04e3

    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    .line 25
    invoke-direct {p0, p1, p2, p3}, Ll/ۖ᩺;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u073d\u073f"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x5797

    const p3, -0x6e0fd1a8

    xor-int/2addr p2, p3

    const p3, 0x78b5099c

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v3

    mul-int/lit16 p3, p3, -0x6939

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 11
    sget-boolean p1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez p1, :cond_0

    const-string p1, "\u06df\u06d8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x55b9

    const p3, -0x57971d2e

    xor-int/2addr p2, p3

    const p3, 0x252c88b7

    goto :goto_0

    .line 17
    :sswitch_0
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget p1, Ll/֫ܳ;->᩶ۧۛ:I

    if-gez p1, :cond_7

    goto/16 :goto_2

    .line 23
    :sswitch_1
    sget p1, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez p1, :cond_9

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    sget p1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz p1, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    goto/16 :goto_3

    .line 15
    :sswitch_4
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 12
    :sswitch_5
    iput-boolean v0, p0, Ll/ۧܶۘ;->᩶:Z

    return-void

    :cond_0
    const-string p1, "\u1a7b\u073d"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x1ed9

    const p3, 0x64f7853

    xor-int/2addr p2, p3

    const p3, 0x12181a4a

    goto :goto_0

    .line 13
    :sswitch_6
    sget p1, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz p1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p1, "\u06e8\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x47

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3e4f

    const p3, 0x493b160b

    xor-int/2addr p2, p3

    const p3, 0x6b32b555

    goto :goto_0

    :sswitch_7
    sget p1, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u06da\u1a75"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x9c3

    const p3, 0x218b9115

    xor-int/2addr p2, p3

    const p3, 0x645c5f4a    # 1.62606E22f

    goto/16 :goto_0

    :sswitch_8
    sget p1, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz p1, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string p1, "\u06df\u06d6"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x68e5

    const p3, 0x58fa6e0

    xor-int/2addr p2, p3

    const p3, 0x3fc2995a

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result p1

    if-gtz p1, :cond_5

    :cond_4
    :goto_1
    const-string p1, "\u1a78\u06d7"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2099

    const p3, 0xec0a2f8

    xor-int/2addr p2, p3

    const p3, 0x760ee65a

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u06d6\u06d6"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x1011

    const p3, 0x4bb133c7    # 2.3226254E7f

    xor-int/2addr p2, p3

    const p3, -0x328d173e

    goto/16 :goto_0

    .line 12
    :sswitch_a
    sget p1, Ll/֫;->ܶܺ᩻:I

    if-ltz p1, :cond_6

    goto :goto_2

    :cond_6
    const-string p1, "\u05ab\u1a78"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x7f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2b57

    const p3, -0x41de84e0

    xor-int/2addr p2, p3

    const p3, -0x1426b228

    goto/16 :goto_0

    .line 8
    :sswitch_b
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result p1

    if-gtz p1, :cond_8

    :cond_7
    const-string p1, "\u06eb\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x71

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x5743

    const p3, 0x56fbb1cc

    xor-int/2addr p2, p3

    const p3, -0x1739fb19

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u1a79\u06e1"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x2f

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x1195

    const p3, 0x3d547087

    xor-int/2addr p2, p3

    const p3, -0x5f2e635e

    goto/16 :goto_0

    .line 7
    :sswitch_c
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result p1

    if-gtz p1, :cond_a

    :cond_9
    :goto_2
    const-string p1, "\u06e2\u1a79"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x1d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3485

    const p3, -0x7029882d

    xor-int/2addr p2, p3

    const p3, 0x8f9c048

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u06e1\u06e0"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x3d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4011

    const p3, -0x1cb6a967

    xor-int/2addr p2, p3

    const p3, -0x65cbecf7

    goto/16 :goto_0

    :sswitch_d
    sget-boolean p1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz p1, :cond_b

    goto :goto_3

    :cond_b
    const-string p1, "\u06eb\u1a74"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x79df

    const p3, 0x508a3a7f

    xor-int/2addr p2, p3

    const p3, -0x19cf50b

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 3
    sget p1, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz p1, :cond_c

    :goto_3
    const-string p1, "\u06e7\u073a"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x19d

    const p3, -0x4633c4cc

    xor-int/2addr p2, p3

    const p3, -0x51723a1e

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06db\u06e8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x4bc1

    const p3, -0x72fc78a

    xor-int/2addr p2, p3

    const p3, 0x5e60f4e8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x780fe0db -> :sswitch_d
        -0x740cd0f5 -> :sswitch_4
        -0x57939c32 -> :sswitch_7
        -0x4f1e17f8 -> :sswitch_8
        -0x4dcc86be -> :sswitch_9
        -0x48fd5e8f -> :sswitch_e
        -0x41798cad -> :sswitch_b
        -0x2ad881ce -> :sswitch_9
        -0x1e5c03ba -> :sswitch_3
        -0x17f3fa28 -> :sswitch_8
        0x5264b4 -> :sswitch_0
        0xdb5bfb0 -> :sswitch_1
        0x12b184e4 -> :sswitch_6
        0x1e8774da -> :sswitch_a
        0x25301526 -> :sswitch_0
        0x26675974 -> :sswitch_2
        0x376511b2 -> :sswitch_5
        0x4122864b -> :sswitch_6
        0x4215b25c -> :sswitch_a
        0x465bb550 -> :sswitch_c
        0x48e7857d -> :sswitch_4
        0x5573ba14 -> :sswitch_3
        0x5dcbd9e4 -> :sswitch_e
        0x64937a8a -> :sswitch_1
        0x652b4b62 -> :sswitch_5
        0x65cc93e8 -> :sswitch_7
        0x66f0bbd9 -> :sswitch_2
        0x69beea4a -> :sswitch_b
        0x69cddb5f -> :sswitch_c
        0x7b1e185f -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 20

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

    const v12, 0x55664710

    sget v13, Ll/ۘ֡;->ܰ֡ܽ:I

    sget v14, Ll/֫᩺;->᩺۟ۘ:I

    const-string v15, "\u06d6\u06dc"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x3b

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, 0x66b5

    const v17, -0x4e6383c6

    xor-int v1, v1, v17

    const v17, 0x1ec0baf7

    xor-int v15, v15, v17

    move-object v7, v6

    move-object v11, v10

    move/from16 v16, v15

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, 0x55664710

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x19bb

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v16, v1

    sparse-switch v15, :sswitch_data_0

    sget-boolean v1, Ll/᩶;->ۚۤۘ:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-gtz v1, :cond_0

    :goto_1
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_4

    :cond_0
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_8

    :cond_1
    const-string v1, "\u06e8\u06ec"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x15

    move/from16 v16, v15

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x466d

    const v17, -0x631359ca

    xor-int v15, v15, v17

    const v17, 0x162ac5d9

    xor-int v1, v1, v17

    goto/16 :goto_a

    :sswitch_1
    move/from16 v16, v15

    .line 29
    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    move-object/from16 v17, v2

    move-object/from16 v2, p1

    if-gtz v1, :cond_8

    goto :goto_2

    :sswitch_2
    move/from16 v16, v15

    .line 32
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-object/from16 v17, v2

    move-object/from16 v2, p1

    goto :goto_2

    .line 7
    :sswitch_3
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    return-void

    :sswitch_4
    move/from16 v16, v15

    .line 53
    iget v1, v0, Ll/ۧܶۘ;->֡:I

    int-to-float v1, v1

    iget-object v15, v0, Ll/ۧܶۘ;->ܽ:Landroid/graphics/Paint;

    move-object/from16 v17, v2

    move-object/from16 v2, p1

    .line 52
    invoke-virtual {v2, v9, v12, v1, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_7

    :sswitch_5
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 53
    invoke-virtual {v11}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    add-float v12, v1, v10

    .line 23
    sget-boolean v1, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v1, :cond_2

    :goto_2
    const-string v1, "\u06d9\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x73

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x1cbb

    const v18, -0x2aefa160

    xor-int v15, v15, v18

    const v18, -0x3955cae7

    goto/16 :goto_9

    :cond_2
    const-string v1, "\u06d6\u0736"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x1f

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x4711

    const v18, 0x72e3acb6

    xor-int v15, v15, v18

    const v18, 0x2fc35ec3

    goto/16 :goto_9

    :sswitch_6
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    iget v1, v0, Ll/ۧܶۘ;->֡:I

    int-to-float v10, v1

    iget-object v11, v0, Ll/ۧܶۘ;->ܽ:Landroid/graphics/Paint;

    .line 49
    sget-boolean v1, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v1, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u1a7b\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x59

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x5ced

    const v18, 0x3116214d

    xor-int v15, v15, v18

    const v18, 0x1869b94c

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    sub-float v9, v6, v8

    .line 24
    sget-boolean v1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v1, :cond_4

    :goto_3
    move-object/from16 v1, v17

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06e7\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x4f

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x53dd

    const v18, -0x5d4541ef

    xor-int v15, v15, v18

    const v18, -0x2b29efb1

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v8

    .line 4
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x41

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x7a3b

    const v18, -0x360d32c1

    xor-int v15, v15, v18

    const v18, 0x6c11fea6

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    int-to-float v6, v5

    .line 52
    iget-object v7, v0, Ll/ۧܶۘ;->ܽ:Landroid/graphics/Paint;

    sget v1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v1, :cond_6

    goto :goto_4

    :cond_6
    const-string v1, "\u1a7a\u1a79"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x4995

    const v18, 0x40b62dc6

    xor-int v15, v15, v18

    const v18, 0x2c824f33

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    iget v1, v0, Ll/ۧܶۘ;->֡:I

    sub-int v5, v4, v1

    .line 37
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    const-string v1, "\u06d9\u06dc"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x5a0b

    const v18, -0x3ff37692

    xor-int v15, v15, v18

    const v18, 0x79d4ef2d

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    invoke-static/range {p0 .. p0}, Ll/֨֫;->ܿ۬᩹(Ljava/lang/Object;)I

    move-result v4

    sget-boolean v1, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v1, :cond_9

    :cond_8
    :goto_4
    const-string v1, "\u1a7b\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x7b89

    const v18, -0x146d31f3

    xor-int v15, v15, v18

    const v18, -0x66bab8fa

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u1a77\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x63

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x1b1f

    const v18, -0xb3a0a2d

    xor-int v15, v15, v18

    const v18, -0x41f77cdd

    goto/16 :goto_9

    :sswitch_c
    move-object v1, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 51
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget v15, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v15, :cond_a

    :goto_5
    const-string v15, "\u1a74\u0736"

    invoke-static {v15}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move-object/from16 v17, v1

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, 0x360f

    const v18, 0x7ca2488a

    xor-int v1, v1, v18

    const v18, 0x406735b9

    goto :goto_6

    :cond_a
    move-object/from16 v17, v1

    const-string v1, "\u06e1\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x5d13

    const v18, -0x46461cdc

    xor-int v15, v15, v18

    const v18, -0x2f311f98

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v2, p1

    move/from16 v16, v15

    iget-object v1, v0, Ll/ۧܶۘ;->ܽ:Landroid/graphics/Paint;

    sget v3, Ll/᩶᩵ۘ;->ۖۙ:I

    .line 18
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v15

    if-ltz v15, :cond_b

    move-object/from16 v17, v1

    goto :goto_8

    :cond_b
    const-string v15, "\u0733\u06dc"

    invoke-static {v15}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    move-object/from16 v17, v1

    xor-int v1, v15, v13

    mul-int/lit16 v1, v1, 0x7491

    const v18, 0x4d8b3ad7    # 2.9198614E8f

    xor-int v1, v1, v18

    const v18, -0x25ed0207

    :goto_6
    xor-int v15, v15, v18

    move-object/from16 v2, v17

    move/from16 v19, v16

    move/from16 v16, v15

    goto/16 :goto_b

    :sswitch_e
    return-void

    :sswitch_f
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 49
    invoke-super/range {p0 .. p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 50
    iget-boolean v1, v0, Ll/ۧܶۘ;->᩶:Z

    if-eqz v1, :cond_c

    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, 0x71

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x1ce5

    const v18, -0xc7ceca9

    xor-int v15, v15, v18

    const v18, 0x4b029a9e    # 8559262.0f

    goto :goto_9

    :cond_c
    :goto_7
    const-string v1, "\u06d8\u06e0"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x4e33

    const v18, -0x6d9eca42

    xor-int v15, v15, v18

    const v18, -0x2c789d39

    goto :goto_9

    :sswitch_10
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 13
    sget v1, Ll/֨ۧ;->֫۠֡:I

    if-gtz v1, :cond_d

    :goto_8
    const-string v1, "\u073f\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x6025

    const v18, -0x5fba3fef

    xor-int v15, v15, v18

    const v18, 0x7aa91450

    goto :goto_9

    :cond_d
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x535

    const v18, 0x3edf7e0c

    xor-int v15, v15, v18

    const v18, -0x7f563e1d

    :goto_9
    xor-int v1, v1, v18

    move-object/from16 v2, v17

    :goto_a
    move/from16 v19, v16

    move/from16 v16, v1

    move v1, v15

    :goto_b
    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x747d44ce -> :sswitch_5
        -0x6ec931d2 -> :sswitch_4
        -0x6aab7b33 -> :sswitch_c
        -0x63d9d5ce -> :sswitch_8
        -0x60c524d9 -> :sswitch_6
        -0x5be3c03c -> :sswitch_e
        -0x5ad1677c -> :sswitch_9
        -0x58aa45be -> :sswitch_b
        -0x52766205 -> :sswitch_c
        -0x522d955c -> :sswitch_0
        -0x43303568 -> :sswitch_2
        -0x2d37a820 -> :sswitch_d
        -0x28317705 -> :sswitch_a
        -0x2556b358 -> :sswitch_0
        -0x1ce689a3 -> :sswitch_9
        -0x11a5e8a3 -> :sswitch_6
        -0xbe1e3cc -> :sswitch_f
        0x38b3e90 -> :sswitch_2
        0x5546363 -> :sswitch_b
        0xb7c2dde -> :sswitch_4
        0x1a67bf94 -> :sswitch_f
        0x1f3a6c60 -> :sswitch_d
        0x26011a1c -> :sswitch_1
        0x3263b75f -> :sswitch_7
        0x4c30696a -> :sswitch_e
        0x4c5d6f5e -> :sswitch_10
        0x4f0abeee -> :sswitch_10
        0x50ed7b82 -> :sswitch_3
        0x5b1a8607 -> :sswitch_8
        0x60a83468 -> :sswitch_a
        0x67f831b2 -> :sswitch_7
        0x69a5a0f4 -> :sswitch_1
        0x7212f028 -> :sswitch_5
        0x7cd0fd6e -> :sswitch_3
    .end sparse-switch
.end method

.method public final ۙ(Ll/ܳܶۘ;)V
    .locals 6

    const v0, 0x550b63a6

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    const-string v3, "\u06ec\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x58c7

    const v5, 0x2e1c3225

    xor-int/2addr v4, v5

    const v5, -0x19129a90

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x63b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 26
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-lez v3, :cond_7

    goto/16 :goto_2

    .line 6
    :sswitch_1
    sget v3, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a77\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b01

    const v5, 0x15acf081

    xor-int/2addr v4, v5

    const v5, 0x10a6ec07

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v3, Ll/֨᩹;->᩻ᩳ֨:I

    if-lez v3, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    return-void

    .line 30
    :sswitch_5
    invoke-virtual {p1}, Ll/ܳܶۘ;->ܰ()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۖ᩺;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 29
    :sswitch_6
    iput-object p1, p0, Ll/ۧܶۘ;->ܺ:Ll/ܳܶۘ;

    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_1

    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3c95

    const v5, -0x1419810c

    xor-int/2addr v4, v5

    const v5, -0x354af70c    # -5932154.0f

    goto :goto_0

    :cond_1
    const-string v3, "\u1a7a\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2bdf

    const v5, -0x160e4ee7

    xor-int/2addr v4, v5

    const v5, -0x1997d30d

    goto :goto_0

    :cond_2
    const-string v3, "\u1a73\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x48a7

    const v5, 0x5490b965

    xor-int/2addr v4, v5

    const v5, -0x3478a161    # -1.7743166E7f

    goto/16 :goto_0

    .line 5
    :sswitch_7
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06e8\u06e0"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x74a3

    const v5, -0x5be0a9bd

    xor-int/2addr v4, v5

    const v5, 0x48864155

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06eb\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x40c7

    const v5, -0x659d8324

    xor-int/2addr v4, v5

    const v5, -0x3898311a

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "\u05a8\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x156f

    const v5, -0x5d1aa5ce

    xor-int/2addr v4, v5

    const v5, 0x46e2ab9e

    goto/16 :goto_0

    .line 7
    :sswitch_a
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a78\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3a9f

    const v5, -0x48c8e88b

    xor-int/2addr v4, v5

    const v5, -0x688f9beb

    goto/16 :goto_0

    .line 6
    :sswitch_b
    sget v3, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a85

    const v5, 0x7ed47927

    xor-int/2addr v4, v5

    const v5, 0x452f7cd4

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d6\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5851

    const v5, 0x2f6d7db

    xor-int/2addr v4, v5

    const v5, 0x20278bc1

    goto/16 :goto_0

    .line 27
    :sswitch_c
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x689b

    const v5, -0x52213646

    xor-int/2addr v4, v5

    const v5, 0x5ec00f9d

    goto/16 :goto_0

    .line 11
    :sswitch_d
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    move-result v3

    if-ltz v3, :cond_a

    :goto_2
    const-string v3, "\u06ec\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e4f

    const v5, -0x55f23cc0

    xor-int/2addr v4, v5

    const v5, -0x33722674    # -7.437014E7f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a3d

    const v5, 0x499914e5

    xor-int/2addr v4, v5

    const v5, 0x41ffee2b

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1cef

    const v5, -0x45a8a6fc

    xor-int/2addr v4, v5

    const v5, 0x7601543d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u0730"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5169

    const v5, 0x546f5314

    xor-int/2addr v4, v5

    const v5, 0xfdbb75

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b6d35a5 -> :sswitch_8
        -0x48a24269 -> :sswitch_a
        -0x43255bf6 -> :sswitch_c
        -0x4170f0c4 -> :sswitch_e
        -0x382a32dc -> :sswitch_2
        -0x31bb071d -> :sswitch_4
        -0x30ee16e5 -> :sswitch_9
        0x99a855 -> :sswitch_c
        0x50594e2 -> :sswitch_e
        0x6a27294 -> :sswitch_b
        0xb865100 -> :sswitch_b
        0xf401aa5 -> :sswitch_3
        0x1d1c3fa1 -> :sswitch_2
        0x1d4d111b -> :sswitch_1
        0x23de5a67 -> :sswitch_d
        0x2817fc75 -> :sswitch_7
        0x281dd16c -> :sswitch_4
        0x2bc75d42 -> :sswitch_8
        0x4694a68d -> :sswitch_a
        0x469e26ac -> :sswitch_1
        0x4da229ce -> :sswitch_d
        0x501dffdc -> :sswitch_7
        0x51c5729f -> :sswitch_9
        0x52ef3598 -> :sswitch_6
        0x55977c9b -> :sswitch_0
        0x5dccaaee -> :sswitch_0
        0x6246b8d5 -> :sswitch_6
        0x66e22d6d -> :sswitch_5
        0x6af04ef0 -> :sswitch_3
        0x7111fbc9 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ۙ(Z)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x364bd3c9

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    sget v4, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v5, "\u05a1\u05a8"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2717

    const v7, -0x6c492220

    xor-int/2addr v6, v7

    const v7, 0x154e411d

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v1

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x36db

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 22
    sget v5, Ll/֫;->ܶܺ᩻:I

    if-gez v5, :cond_6

    goto/16 :goto_5

    :sswitch_0
    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v5, :cond_9

    goto/16 :goto_7

    :sswitch_1
    sget v5, Ll/ۗ;->֨۬ۖ:I

    if-ltz v5, :cond_c

    goto/16 :goto_4

    .line 23
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    return-void

    .line 42
    :sswitch_4
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto/16 :goto_2

    .line 41
    :sswitch_5
    new-instance v7, Landroid/graphics/Paint;

    const/4 v5, 0x1

    .line 23
    sget v6, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v6, :cond_0

    goto/16 :goto_6

    .line 41
    :cond_0
    invoke-direct {v7, v5}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v7, p0, Ll/ۧܶۘ;->ܽ:Landroid/graphics/Paint;

    .line 2
    sget v5, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06dc\u1a7b"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1be7

    const v8, -0x129b69b1

    xor-int/2addr v6, v8

    const v8, 0x7740ca20

    goto/16 :goto_8

    .line 40
    :sswitch_6
    iput v0, p0, Ll/ۧܶۘ;->֡:I

    .line 5
    sget-boolean v5, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v5, :cond_2

    goto/16 :goto_7

    :cond_2
    const-string v5, "\u06e4\u05ab"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x50a9

    const v8, 0x4fd80403

    xor-int/2addr v6, v8

    const v8, -0x2a2ae8d8

    goto/16 :goto_8

    :sswitch_7
    const/high16 v0, 0x40200000    # 2.5f

    .line 40
    invoke-static {v0}, Ll/֡ܳ;->ۛۤ۠(F)I

    move-result v0

    .line 1
    sget v5, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v5, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v5, "\u06d6\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2217

    const v8, 0x2bee555c

    xor-int/2addr v6, v8

    const v8, -0x7bc2da2c

    goto/16 :goto_8

    .line 39
    :sswitch_8
    iget v5, p0, Ll/ۧܶۘ;->֡:I

    if-nez v5, :cond_4

    const-string v5, "\u06e8\u073d"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x25db

    const v8, 0x720b2e2f

    xor-int/2addr v6, v8

    const v8, 0x1b312eb5

    goto/16 :goto_8

    .line 44
    :sswitch_9
    invoke-static {p0}, Ll/᩶;->ۘ᩶֡(Ljava/lang/Object;)V

    return-void

    .line 38
    :sswitch_a
    iput-boolean p1, p0, Ll/ۧܶۘ;->᩶:Z

    if-eqz p1, :cond_4

    const-string v5, "\u0733\u06e0"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3541

    const v8, -0x4443426e

    xor-int/2addr v6, v8

    const v8, -0x313c7f31    # -1.6399994E9f

    goto/16 :goto_8

    :cond_4
    :goto_2
    const-string v5, "\u06dc\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xe0d

    const v8, -0x31b475ed    # -8.537059E8f

    xor-int/2addr v6, v8

    const v8, -0x2c0b8f31

    goto/16 :goto_8

    :sswitch_b
    sget v5, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u0736\u1a74"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x569

    const v8, 0x6009eb86

    xor-int/2addr v6, v8

    const v8, 0x38d62575

    goto/16 :goto_8

    .line 41
    :sswitch_c
    sget-boolean v5, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v5, :cond_7

    :cond_6
    :goto_3
    const-string v5, "\u1a75\u06df"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3189

    const v8, 0x13840387

    xor-int/2addr v6, v8

    const v8, -0x90d6e5a

    goto/16 :goto_8

    :cond_7
    const-string v5, "\u1a73\u1a7a"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7efd

    const v8, 0x76252090

    xor-int/2addr v6, v8

    const v8, -0x2ad94352

    goto/16 :goto_8

    .line 36
    :sswitch_d
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v5

    if-gtz v5, :cond_8

    :goto_4
    const-string v5, "\u06e2\u0730"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xef1

    const v8, 0x61285a0d

    xor-int/2addr v6, v8

    const v8, 0xe9526ce

    goto/16 :goto_8

    :cond_8
    const-string v5, "\u06e1\u05a8"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4adf

    const v8, -0x5ccb352e

    xor-int/2addr v6, v8

    const v8, 0x123ad672

    goto/16 :goto_8

    .line 9
    :sswitch_e
    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_5
    const-string v5, "\u06ec\u05a1"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x299

    const v8, -0x4203d482

    xor-int/2addr v6, v8

    const v8, -0x522811ae

    goto :goto_8

    :cond_a
    const-string v5, "\u1a79\u06dc"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x12a9

    const v8, 0x74fbbc90

    xor-int/2addr v6, v8

    const v8, -0x525d305d

    goto :goto_8

    .line 21
    :sswitch_f
    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v5, :cond_b

    :goto_6
    const-string v5, "\u06d6\u1a73"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5fcb

    const v7, -0x3095c2fd

    xor-int/2addr v6, v7

    const v7, 0x5c72cb5f

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u1a7b\u0730"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x44dd

    const v8, 0x20ee11a

    xor-int/2addr v6, v8

    const v8, -0xcdc6084

    goto :goto_8

    .line 43
    :sswitch_10
    sget v5, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_7
    const-string v5, "\u05ab\u0736"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6f61

    const v8, 0x1ad9e379

    xor-int/2addr v6, v8

    const v8, -0x4221c014

    goto :goto_8

    :cond_d
    const-string v5, "\u073f\u05ab"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x37

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x60ef

    const v8, -0xdaa693

    xor-int/2addr v6, v8

    const v8, 0x498cacd8    # 1152411.0f

    :goto_8
    xor-int/2addr v5, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x787a54af -> :sswitch_8
        -0x7506f130 -> :sswitch_a
        -0x6dbc8781 -> :sswitch_9
        -0x6a5f49eb -> :sswitch_e
        -0x6079a903 -> :sswitch_f
        -0x5ee65472 -> :sswitch_5
        -0x5a551616 -> :sswitch_d
        -0x55126e54 -> :sswitch_8
        -0x41c54213 -> :sswitch_6
        -0x3f7932c6 -> :sswitch_2
        -0x3ea6e66a -> :sswitch_4
        -0x3a00fe0b -> :sswitch_10
        -0x25f8984a -> :sswitch_1
        -0x21dbf171 -> :sswitch_3
        -0x1b18c64d -> :sswitch_d
        -0xc536a29 -> :sswitch_1
        -0xaf9f9d9 -> :sswitch_b
        0x3456b18 -> :sswitch_9
        0x5940606 -> :sswitch_b
        0x1aa96ee4 -> :sswitch_c
        0x2137b90d -> :sswitch_0
        0x227d50e6 -> :sswitch_10
        0x2daf4d7a -> :sswitch_f
        0x32ff1c80 -> :sswitch_5
        0x36009332 -> :sswitch_2
        0x3e06e8ac -> :sswitch_4
        0x3ffc8230 -> :sswitch_3
        0x4aa63a93 -> :sswitch_c
        0x4cf98662 -> :sswitch_e
        0x52773e73 -> :sswitch_7
        0x54868f11 -> :sswitch_7
        0x548c0a32 -> :sswitch_6
        0x690aaf0e -> :sswitch_0
        0x7425d52c -> :sswitch_a
    .end sparse-switch
.end method

.method public final ۨ()V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۧܶۘ;->ܺ:Ll/ܳܶۘ;

    invoke-virtual {v0}, Ll/ܳܶۘ;->ܰ()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۖ᩺;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
