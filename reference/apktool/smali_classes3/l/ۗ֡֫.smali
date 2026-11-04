.class public Ll/ۗ֡֫;
.super Ll/ܳ᩻;
.source "4651"


# instance fields
.field public ֡:Landroid/graphics/Paint;

.field public ܰ:Ll/ۨ֡֫;

.field public ܿ:I

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/4 v0, 0x0

    const v1, -0x70e6a5fd

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    .line 17
    invoke-direct {p0, p1, p2}, Ll/ܳ᩻;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "\u06df\u06ec"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x67

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x1641

    const v4, 0x7e02d2e8

    xor-int/2addr p2, v4

    const v4, -0x6db9d9a8

    :goto_0
    xor-int/2addr p1, v4

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x19d1

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr p2, v1

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto/16 :goto_1

    .line 9
    :sswitch_0
    sget p1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz p1, :cond_b

    goto/16 :goto_3

    .line 11
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result p1

    if-lez p1, :cond_3

    goto/16 :goto_3

    .line 0
    :sswitch_2
    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p1, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 12
    :sswitch_4
    iput-boolean v0, p0, Ll/ۗ֡֫;->᩶:Z

    return-void

    .line 6
    :sswitch_5
    sget p1, Ll/ۧ;->ۨۗܰ:I

    if-ltz p1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string p1, "\u05ab\u06d8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x5519

    const v4, -0x2bbca022

    xor-int/2addr p2, v4

    const v4, -0x40ab6e29

    goto :goto_0

    :sswitch_6
    sget-boolean p1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz p1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p1, "\u0733\u05a8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x6b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7b77

    const v4, -0x2944e760

    xor-int/2addr p2, v4

    const v4, 0x4859593c

    goto :goto_0

    :sswitch_7
    sget p1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz p1, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string p1, "\u1a79\u06d8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x6f

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x2f9d

    const v4, -0x67d425e

    xor-int/2addr p2, v4

    const v4, -0x619696ba

    goto/16 :goto_0

    .line 10
    :sswitch_8
    sget p1, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz p1, :cond_4

    :cond_3
    const-string p1, "\u06eb\u06eb"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x1b

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x5901

    const v4, -0x327263a6

    xor-int/2addr p2, v4

    const v4, 0x1f9d1cd6

    goto/16 :goto_0

    :cond_4
    const-string p1, "\u1a75\u06e2"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0xd

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5a27

    const v4, 0x58227213

    xor-int/2addr p2, v4

    const v4, 0x47a0cfe5

    goto/16 :goto_0

    :sswitch_9
    sget p1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz p1, :cond_5

    goto :goto_2

    :cond_5
    const-string p1, "\u06db\u06e1"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x7ba7

    const v4, -0x17f39438

    xor-int/2addr p2, v4

    const v4, 0x58e7c006

    goto/16 :goto_0

    .line 7
    :sswitch_a
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string p1, "\u06e8\u06ec"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x49

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3e3

    const v4, -0x55e7ee74

    xor-int/2addr p2, v4

    const v4, -0x6c0f59b3

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result p1

    if-eqz p1, :cond_7

    :goto_1
    const-string p1, "\u0736\u06dc"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x74ad

    const v4, -0x222cdb26

    xor-int/2addr p2, v4

    const v4, 0x422bb934

    goto/16 :goto_0

    :cond_7
    const-string p1, "\u06e8\u1a74"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x43

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5475

    const v4, 0x4e56aecd    # 9.00445E8f

    xor-int/2addr p2, v4

    const v4, -0x59258a50

    goto/16 :goto_0

    :sswitch_c
    sget-boolean p1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz p1, :cond_8

    :goto_2
    const-string p1, "\u06d9\u06d9"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x7f39

    const v4, 0x33c74b35

    xor-int/2addr p2, v4

    const v4, 0x676f5048

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u1a78\u1a78"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x15

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x55e3

    const v4, -0x484e18d0

    xor-int/2addr p2, v4

    const v4, 0x5271f83b

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result p1

    if-nez p1, :cond_a

    :cond_9
    :goto_3
    const-string p1, "\u06e1\u06e7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0xd7

    const v4, -0x55c5f783

    xor-int/2addr p2, v4

    const v4, 0x39c13803

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u1a74\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x2a0b

    const v4, -0x6653c95b

    xor-int/2addr p2, v4

    const v4, 0x27b117d

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    sget-boolean p1, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez p1, :cond_c

    :cond_b
    const-string p1, "\u06d9\u1a73"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x37

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x57bf

    const v4, 0x4e87831

    xor-int/2addr p2, v4

    const v4, -0x5a0c776a

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06e1\u06d6"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1609

    const v4, 0x223ec9f

    xor-int/2addr p2, v4

    const v4, -0x292a3a94

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c7eb278 -> :sswitch_8
        -0x52c527cd -> :sswitch_b
        -0x4dcfd562 -> :sswitch_d
        -0x43f62280 -> :sswitch_0
        -0x42658415 -> :sswitch_d
        -0x3c4dab82 -> :sswitch_2
        -0x286da35b -> :sswitch_e
        -0x26e1f6eb -> :sswitch_c
        -0x1156a95 -> :sswitch_c
        0x5b45d7 -> :sswitch_e
        0x789d664 -> :sswitch_3
        0x882f801 -> :sswitch_1
        0xacf9e0f -> :sswitch_1
        0xd9cb85f -> :sswitch_a
        0x13973a6b -> :sswitch_2
        0x26ce6cb5 -> :sswitch_3
        0x328ec710 -> :sswitch_b
        0x36970022 -> :sswitch_4
        0x3b340843 -> :sswitch_6
        0x3e982a9f -> :sswitch_a
        0x4350ec11 -> :sswitch_6
        0x43c951c4 -> :sswitch_5
        0x50e08f3f -> :sswitch_8
        0x566a754e -> :sswitch_9
        0x57afe692 -> :sswitch_7
        0x580ebc07 -> :sswitch_7
        0x633455ba -> :sswitch_5
        0x643271b2 -> :sswitch_4
        0x6cf11b5d -> :sswitch_9
        0x70603fc2 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const/4 v0, 0x0

    const v1, 0x4604f509

    sget v2, Ll/᩶;->ᩴ᩶ۛ:I

    sget v3, Ll/֫֡;->֫ۙۖ:I

    .line 25
    invoke-direct {p0, p1, p2, p3}, Ll/ܳ᩻;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u06e8\u06d8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x19

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6be1

    const p3, -0x32e52dd1

    xor-int/2addr p2, p3

    const p3, -0x7bae41c0

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v2

    mul-int/lit16 p3, p3, -0x61ef

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget-boolean p1, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz p1, :cond_a

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget p1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz p1, :cond_6

    goto/16 :goto_1

    :sswitch_2
    sget p1, Ll/֡᩵;->ۤܳ۬:I

    if-gez p1, :cond_8

    goto/16 :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_1

    .line 9
    :sswitch_4
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 12
    :sswitch_5
    iput-boolean v0, p0, Ll/ۗ֡֫;->᩶:Z

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string p1, "\u05a8\u06e0"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5c45

    const p3, 0x23e7a83f

    xor-int/2addr p2, p3

    const p3, -0x16d19dc7

    goto :goto_0

    :sswitch_7
    sget p1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p1, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string p1, "\u0730\u05a1"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x6e3d

    const p3, 0x9f61eaa

    xor-int/2addr p2, p3

    const p3, 0x6eeee82a

    goto :goto_0

    .line 13
    :sswitch_8
    sget p1, Ll/֫֡;->֫ۙۖ:I

    if-gtz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u06da\u0736"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x2d

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x266b

    const p3, 0x46792672

    xor-int/2addr p2, p3

    const p3, -0x5923c044

    goto/16 :goto_0

    :sswitch_9
    sget-boolean p1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, "\u06e2\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4f2b

    const p3, -0x76b35a18

    xor-int/2addr p2, p3

    const p3, -0x33f80806    # -3.564337E7f

    goto/16 :goto_0

    :sswitch_a
    sget p1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz p1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string p1, "\u06ec\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x15

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x22bf

    const p3, -0x7e155ba4

    xor-int/2addr p2, p3

    const p3, -0x1bf63b8c

    goto/16 :goto_0

    .line 10
    :sswitch_b
    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p1, :cond_5

    :goto_1
    const-string p1, "\u06ec\u06d7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x1453

    const p3, -0xe99059    # -1.9996393E38f

    xor-int/2addr p2, p3

    const p3, -0x14a98fc9

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u06e8\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x13

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x7221

    const p3, 0x200d3780

    xor-int/2addr p2, p3

    const p3, 0x1685d0f8

    goto/16 :goto_0

    :cond_6
    :goto_2
    const-string p1, "\u073d\u0733"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xc9f

    const p3, -0x1044201f

    xor-int/2addr p2, p3

    const p3, 0x63f3281c

    goto/16 :goto_0

    :cond_7
    const-string p1, "\u06e8\u06d7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x2157

    const p3, 0xd4ec59b

    xor-int/2addr p2, p3

    const p3, -0x18ff7427

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget p1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p1, :cond_9

    :cond_8
    :goto_3
    const-string p1, "\u06d6\u06e1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4ba9

    const p3, -0x3078ccc8

    xor-int/2addr p2, p3

    const p3, 0x34779ac1

    goto/16 :goto_0

    :cond_9
    const-string p1, "\u06df\u1a7a"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x11

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xad

    const p3, -0x96d5ca5

    xor-int/2addr p2, p3

    const p3, -0x49e8c67a

    goto/16 :goto_0

    .line 22
    :sswitch_d
    sget-boolean p1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez p1, :cond_b

    :cond_a
    :goto_4
    const-string p1, "\u073d\u1a75"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x6e15

    const p3, -0x351f86e9    # -7355531.5f

    xor-int/2addr p2, p3

    const p3, 0x3f8ec8d

    goto/16 :goto_0

    :cond_b
    const-string p1, "\u06db\u1a76"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x23

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x5de9

    const p3, -0x1f1715e6

    xor-int/2addr p2, p3

    const p3, 0x72bc0e9f

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 20
    sget p1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz p1, :cond_c

    :goto_5
    const-string p1, "\u06d8\u05ab"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x79

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x4573

    const p3, -0x4a10d752

    xor-int/2addr p2, p3

    const p3, -0x6fe2a75d

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06e0\u1a75"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4777

    const p3, -0xd0c36b9

    xor-int/2addr p2, p3

    const p3, 0x5b2a7585

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a9927fc -> :sswitch_8
        -0x770d8c1e -> :sswitch_b
        -0x648eab45 -> :sswitch_8
        -0x5fb0ebd3 -> :sswitch_5
        -0x549d4cbf -> :sswitch_c
        -0x51d590c4 -> :sswitch_e
        -0x3e659a27 -> :sswitch_4
        -0x3233604d -> :sswitch_b
        -0x32073af9 -> :sswitch_5
        -0x31e2e504 -> :sswitch_6
        -0x277c8068 -> :sswitch_4
        -0x8a5d684 -> :sswitch_1
        -0x480d21b -> :sswitch_c
        0x8f32bac -> :sswitch_3
        0x124b5a3c -> :sswitch_d
        0x15428ae9 -> :sswitch_0
        0x1f04aa3e -> :sswitch_9
        0x230364d9 -> :sswitch_7
        0x2934ded0 -> :sswitch_1
        0x2a920fa6 -> :sswitch_2
        0x2ae8a398 -> :sswitch_2
        0x3306c868 -> :sswitch_a
        0x3badf9f2 -> :sswitch_a
        0x4422c4de -> :sswitch_6
        0x443200d6 -> :sswitch_7
        0x4bf85bca -> :sswitch_e
        0x54d31ccb -> :sswitch_0
        0x56b303ed -> :sswitch_9
        0x7040b39f -> :sswitch_d
        0x7d168026 -> :sswitch_3
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

    const v12, -0x7ae6e07a

    sget v13, Ll/֫֨;->᩶ܺۡ:I

    sget v14, Ll/֨ܿ;->᩹᩻۟:I

    const-string v15, "\u1a74\u06e0"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x2f

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, -0x4fb1

    const v17, 0x6cb77d45    # 1.7746E27f

    xor-int v1, v1, v17

    const v17, -0x51b40259

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

    const v15, -0x7ae6e07a

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x75a1

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v16, v1

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v2, p1

    move/from16 v16, v15

    .line 51
    iget-object v1, v0, Ll/ۗ֡֫;->֡:Landroid/graphics/Paint;

    sget v3, Ll/ۗۡ֫;->᩸ۙ:I

    .line 42
    sget v15, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v15, :cond_b

    goto/16 :goto_5

    .line 39
    :sswitch_0
    sget-boolean v1, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v1, :cond_1

    :cond_0
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_4

    :cond_1
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_3

    .line 11
    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v1, :cond_0

    :cond_2
    move-object v1, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_5

    .line 42
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    sget v1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v1, :cond_2

    :goto_1
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto :goto_1

    .line 27
    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    return-void

    .line 53
    :sswitch_5
    iget v1, v0, Ll/ۗ֡֫;->ܿ:I

    int-to-float v1, v1

    move/from16 v16, v15

    iget-object v15, v0, Ll/ۗ֡֫;->֡:Landroid/graphics/Paint;

    move-object/from16 v17, v2

    move-object/from16 v2, p1

    .line 52
    invoke-virtual {v2, v9, v12, v1, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_7

    :sswitch_6
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 53
    invoke-virtual {v11}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    add-float v12, v1, v10

    .line 24
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x77

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x2a19

    const v18, -0x342a71e

    xor-int v15, v15, v18

    const v18, -0x3ea3ccd5

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    iget v1, v0, Ll/ۗ֡֫;->ܿ:I

    int-to-float v10, v1

    iget-object v11, v0, Ll/ۗ֡֫;->֡:Landroid/graphics/Paint;

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u05ab\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x6163

    const v18, 0x1aaf046f

    xor-int v15, v15, v18

    const v18, -0x7aed5e4d

    goto/16 :goto_9

    :sswitch_8
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    sub-float v9, v6, v8

    .line 39
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v1

    if-gtz v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u1a7a\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x4097

    const v18, -0x6e1c1dfe

    xor-int v15, v15, v18

    const v18, 0x6a750c71

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 52
    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v8

    .line 14
    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v1, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06d8\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x15bd

    const v18, 0x2fe5c769

    xor-int v15, v15, v18

    const v18, 0x25e1684a

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    int-to-float v6, v5

    .line 52
    iget-object v7, v0, Ll/ۗ֡֫;->֡:Landroid/graphics/Paint;

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v1

    if-eqz v1, :cond_7

    :goto_2
    const-string v1, "\u1a75\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x32b7

    const v18, -0x61c558c6

    xor-int v15, v15, v18

    const v18, -0x3418ae82

    goto/16 :goto_9

    :cond_7
    const-string v1, "\u06d8\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x4d

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x57e1

    const v18, 0x1f7280a1

    xor-int v15, v15, v18

    const v18, 0x6e0960a1

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    iget v1, v0, Ll/ۗ֡֫;->ܿ:I

    sub-int v5, v4, v1

    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_8

    :goto_3
    const-string v1, "\u06d8\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x21

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x4fd1

    const v18, 0x68e71c70

    xor-int v15, v15, v18

    const v18, -0x3415b74f    # -3.0708066E7f

    goto/16 :goto_9

    :cond_8
    const-string v1, "\u0736\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x5123

    const v18, -0x5167b849

    xor-int v15, v15, v18

    const v18, -0x49984448

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    invoke-static/range {p0 .. p0}, Ll/֡᩻;->ۙ᩷᩵(Ljava/lang/Object;)I

    move-result v4

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v1

    if-eqz v1, :cond_9

    :goto_4
    const-string v1, "\u073f\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x697f

    const v18, 0xffcb7cc

    xor-int v15, v15, v18

    const v18, 0x61ccf947

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u06eb\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x13

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x7689

    const v18, -0x34794e0b    # -1.7654762E7f

    xor-int v15, v15, v18

    const v18, 0x97ca586

    goto/16 :goto_9

    :sswitch_d
    move-object v1, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 51
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v15

    if-gtz v15, :cond_a

    goto :goto_5

    :cond_a
    const-string v15, "\u1a78\u06eb"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move-object/from16 v17, v1

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, 0x399f

    const v18, 0x4afad7d8    # 8219628.0f

    xor-int v1, v1, v18

    const v18, -0x56f4525a

    goto :goto_6

    :goto_5
    const-string v15, "\u06df\u1a73"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move-object/from16 v17, v1

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, -0x6e6f

    const v18, 0x7e727115

    xor-int v1, v1, v18

    const v18, 0x5cbf2886

    goto :goto_6

    :cond_b
    const-string v15, "\u06dc\u05a1"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v14, v15

    mul-int/lit8 v15, v15, 0x59

    move-object/from16 v17, v1

    xor-int v1, v15, v13

    mul-int/lit16 v1, v1, -0x5c77

    const v18, 0x3028a7d5

    xor-int v1, v1, v18

    const v18, 0x407b6f43

    :goto_6
    xor-int v15, v15, v18

    move-object/from16 v2, v17

    move/from16 v19, v16

    move/from16 v16, v15

    goto/16 :goto_a

    :sswitch_e
    return-void

    :sswitch_f
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 49
    invoke-super/range {p0 .. p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 50
    iget-boolean v1, v0, Ll/ۗ֡֫;->᩶:Z

    if-eqz v1, :cond_c

    const-string v1, "\u06e2\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x6029

    const v18, -0x351f38e8    # -7365516.0f

    xor-int v15, v15, v18

    const v18, -0x6549fe1c

    goto :goto_9

    :cond_c
    :goto_7
    const-string v1, "\u1a7a\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x5c69

    const v18, 0x76e54223

    xor-int v15, v15, v18

    const v18, 0x78534ec7

    goto :goto_9

    :sswitch_10
    move-object/from16 v17, v2

    move/from16 v16, v15

    move-object/from16 v2, p1

    .line 32
    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v1, :cond_d

    :goto_8
    const-string v1, "\u1a77\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x5d

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0xb49

    const v18, 0x36f1f0b5

    xor-int v15, v15, v18

    const v18, -0x4d7e0465

    goto :goto_9

    :cond_d
    const-string v1, "\u1a74\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x73fd

    const v18, 0x12aec78b

    xor-int v15, v15, v18

    const v18, -0x475188d4

    :goto_9
    xor-int v1, v1, v18

    move-object/from16 v2, v17

    move/from16 v19, v16

    move/from16 v16, v1

    move v1, v15

    :goto_a
    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ea0efd8 -> :sswitch_3
        -0x6b5ec448 -> :sswitch_2
        -0x6a6fe4d7 -> :sswitch_0
        -0x59256a8c -> :sswitch_1
        -0x555d5f7b -> :sswitch_d
        -0x54348c0a -> :sswitch_b
        -0x52f3a6f2 -> :sswitch_a
        -0x4e8c0192 -> :sswitch_0
        -0x4afda790 -> :sswitch_8
        -0x3e246d65 -> :sswitch_c
        -0x3a459bc5 -> :sswitch_6
        -0x38ab22d9 -> :sswitch_2
        -0x33111760 -> :sswitch_7
        -0x2c60889a -> :sswitch_c
        -0x15a2b225 -> :sswitch_9
        -0x694ec7b -> :sswitch_1
        0x2c794d6 -> :sswitch_e
        0x10ff9ec2 -> :sswitch_a
        0x193d7973 -> :sswitch_e
        0x1bf8dc85 -> :sswitch_10
        0x1d4384a6 -> :sswitch_b
        0x1e3592bf -> :sswitch_f
        0x238ac83a -> :sswitch_6
        0x26282641 -> :sswitch_3
        0x2eded954 -> :sswitch_f
        0x2f1fbbd6 -> :sswitch_10
        0x2f8d2822 -> :sswitch_5
        0x34344133 -> :sswitch_4
        0x3d115e0a -> :sswitch_5
        0x487c5ccd -> :sswitch_d
        0x4e0037f7 -> :sswitch_9
        0x5d739235 -> :sswitch_4
        0x5f7652a7 -> :sswitch_8
        0x6e9d5990 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۙ(Ll/ۨ֡֫;)V
    .locals 6

    const v0, 0x32ef19e5

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v3, "\u1a7b\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x53f1

    const v5, 0x7f28ce36

    xor-int/2addr v4, v5

    const v5, -0x5830a508

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x6ce9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_a

    goto/16 :goto_4

    .line 3
    :sswitch_0
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v3, :cond_5

    goto/16 :goto_5

    .line 7
    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_3

    :sswitch_2
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_8

    goto :goto_1

    .line 22
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    :goto_1
    const-string v3, "\u06df\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x9eb

    const v5, -0x175a4d9a

    xor-int/2addr v4, v5

    const v5, -0x10de1499

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    return-void

    .line 30
    :sswitch_5
    invoke-virtual {p1}, Ll/ۨ֡֫;->᩷()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܳ᩻;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 29
    :sswitch_6
    iput-object p1, p0, Ll/ۗ֡֫;->ܰ:Ll/ۨ֡֫;

    .line 23
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u073f\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6839

    const v5, 0x48da10c2

    xor-int/2addr v4, v5

    const v5, -0x291691d9

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u06dc\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2921

    const v5, -0x522c246

    xor-int/2addr v4, v5

    const v5, -0x4b7db3c

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06d6\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x17d7

    const v5, 0x469f0c5f

    xor-int/2addr v4, v5

    const v5, 0x5c3f504e    # 2.1540007E17f

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u06df\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3fd

    const v5, 0x25c0a7d9

    xor-int/2addr v4, v5

    const v5, -0x619cba9c

    goto/16 :goto_0

    .line 28
    :sswitch_a
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e8\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1851

    const v5, 0x299a45d4

    xor-int/2addr v4, v5

    const v5, 0x5df0883b

    goto/16 :goto_0

    .line 29
    :sswitch_b
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a79\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x72a9

    const v5, -0x7c909d8d

    xor-int/2addr v4, v5

    const v5, 0x6c5dbb93

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0730\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xf9b

    const v5, 0x7ed03ef7

    xor-int/2addr v4, v5

    const v5, 0x612f7ac0

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06d8\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x16b

    const v5, -0x310b5f95

    xor-int/2addr v4, v5

    const v5, 0x71272c26

    goto/16 :goto_0

    .line 11
    :sswitch_d
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06e1\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7093

    const v5, 0x5b03c5e6

    xor-int/2addr v4, v5

    const v5, -0x3cc5d53e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0736\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e25

    const v5, 0x27662474

    xor-int/2addr v4, v5

    const v5, 0xb6b0a1a

    goto/16 :goto_0

    :goto_4
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x419b

    const v5, 0xe4eacf7

    xor-int/2addr v4, v5

    const v5, -0x5a3613f1

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073d\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7b0d

    const v5, 0x2d3dc218

    xor-int/2addr v4, v5

    const v5, -0x1edc4b83

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u073f\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e15

    const v5, -0x7f4ab680

    xor-int/2addr v4, v5

    const v5, 0x27fc7918

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6285

    const v5, 0x42b964b3

    xor-int/2addr v4, v5

    const v5, 0x55a4589f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fe0e6c4 -> :sswitch_0
        -0x6bec9939 -> :sswitch_1
        -0x64c5ab6e -> :sswitch_0
        -0x5f6f2019 -> :sswitch_8
        -0x4e55f539 -> :sswitch_7
        -0x4bdcc851 -> :sswitch_9
        -0x48935912 -> :sswitch_2
        -0x488c35c7 -> :sswitch_4
        -0x487892bb -> :sswitch_a
        -0x40fd1d3b -> :sswitch_c
        -0x3a444182 -> :sswitch_6
        -0x30425593 -> :sswitch_e
        -0x2c518080 -> :sswitch_6
        -0x2b347431 -> :sswitch_8
        -0x2b2dc916 -> :sswitch_1
        -0xea35636 -> :sswitch_5
        -0x6962ae6 -> :sswitch_d
        -0x1f8c0ba -> :sswitch_e
        0x1247b93 -> :sswitch_5
        0x5a2822d -> :sswitch_9
        0x29750f73 -> :sswitch_b
        0x32e786dc -> :sswitch_2
        0x3d9dea59 -> :sswitch_d
        0x4178afcc -> :sswitch_3
        0x42ac0149 -> :sswitch_4
        0x5a64134b -> :sswitch_7
        0x5fdcc2e8 -> :sswitch_a
        0x6157ee3f -> :sswitch_b
        0x753fd132 -> :sswitch_3
        0x772b2d92 -> :sswitch_c
    .end sparse-switch
.end method

.method public final ۙ(Z)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x628addb6

    sget v3, Ll/֡ۢ;->۟֡᩻:I

    sget v4, Ll/֫֨;->᩶ܺۡ:I

    const-string v5, "\u06d7\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1a5f

    const v7, -0x3204e39

    xor-int/2addr v6, v7

    const v7, 0x6e2fe8f3

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v1

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x1275

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 22
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_c

    goto/16 :goto_6

    .line 32
    :sswitch_0
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v5, :cond_8

    goto/16 :goto_5

    .line 31
    :sswitch_1
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v5

    if-gtz v5, :cond_a

    goto :goto_2

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v5, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_2
    const-string v5, "\u06e4\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7b0d

    const v8, -0x49686c3

    xor-int/2addr v6, v8

    const v8, 0x42fb0efa

    goto/16 :goto_8

    .line 26
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    return-void

    .line 42
    :sswitch_5
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto/16 :goto_3

    .line 41
    :sswitch_6
    new-instance v7, Landroid/graphics/Paint;

    const/4 v5, 0x1

    .line 14
    sget v6, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v6, :cond_1

    goto/16 :goto_7

    .line 41
    :cond_1
    invoke-direct {v7, v5}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v7, p0, Ll/ۗ֡֫;->֡:Landroid/graphics/Paint;

    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u0733\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x681f

    const v8, -0x520a01cd

    xor-int/2addr v6, v8

    const v8, 0x2587de1b

    goto/16 :goto_8

    .line 40
    :sswitch_7
    iput v0, p0, Ll/ۗ֡֫;->ܿ:I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u073a\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x78e7

    const v8, 0x2a65d3e1

    xor-int/2addr v6, v8

    const v8, -0x1f834b31

    goto/16 :goto_8

    :sswitch_8
    const/high16 v0, 0x40200000    # 2.5f

    invoke-static {v0}, Ll/ۖۙ;->᩸ۨ᩶(F)I

    move-result v0

    .line 28
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v5, "\u06e2\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x67

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7381

    const v8, 0x18cf2bc5

    xor-int/2addr v6, v8

    const v8, -0x713a2ed9

    goto/16 :goto_8

    .line 39
    :sswitch_9
    iget v5, p0, Ll/ۗ֡֫;->ܿ:I

    if-nez v5, :cond_5

    const-string v5, "\u06ec\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4c7f

    const v8, -0x93bd54

    xor-int/2addr v6, v8

    const v8, -0x1b97fd58

    goto/16 :goto_8

    .line 44
    :sswitch_a
    invoke-static {p0}, Ll/֡ᩴ;->֨ܶܳ(Ljava/lang/Object;)V

    return-void

    .line 38
    :sswitch_b
    iput-boolean p1, p0, Ll/ۗ֡֫;->᩶:Z

    if-eqz p1, :cond_5

    const-string v5, "\u06d8\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x605

    const v8, -0x30b8abf8

    xor-int/2addr v6, v8

    const v8, -0xdf04ac7

    goto/16 :goto_8

    :cond_5
    :goto_3
    const-string v5, "\u1a75\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x54cb

    const v8, -0x67873eaa

    xor-int/2addr v6, v8

    const v8, -0x3ccde8da

    goto/16 :goto_8

    .line 35
    :sswitch_c
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v5

    if-gtz v5, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v5, "\u06d7\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x42b

    const v8, -0x485c870f

    xor-int/2addr v6, v8

    const v8, -0x58dde743

    goto/16 :goto_8

    .line 15
    :sswitch_d
    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    const-string v5, "\u06d9\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6659

    const v8, -0x709bdf3a

    xor-int/2addr v6, v8

    const v8, 0x28f35a43

    goto/16 :goto_8

    .line 26
    :sswitch_e
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v5

    if-eqz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u073a\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ddd

    const v8, 0x8a6ce74

    xor-int/2addr v6, v8

    const v8, -0x340c78bd    # -3.191975E7f

    goto/16 :goto_8

    :cond_9
    const-string v5, "\u06e4\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x52d9

    const v8, 0x3642a198

    xor-int/2addr v6, v8

    const v8, -0x79b11c5a

    goto/16 :goto_8

    :sswitch_f
    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_b

    :cond_a
    :goto_5
    const-string v5, "\u073d\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x446d

    const v8, -0x19c8142f

    xor-int/2addr v6, v8

    const v8, 0x315cd4f3

    goto :goto_8

    :cond_b
    const-string v5, "\u1a77\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6f6f

    const v8, -0x2cd2d1d0

    xor-int/2addr v6, v8

    const v8, 0x55b4e7a3

    goto :goto_8

    :goto_6
    const-string v5, "\u0733\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3625

    const v8, 0x1c28cb6e

    xor-int/2addr v6, v8

    const v8, 0x7c09bf1d

    goto :goto_8

    :cond_c
    const-string v5, "\u06d7\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6659

    const v8, -0x7adabc6

    xor-int/2addr v6, v8

    const v8, -0x44f7d0a3

    goto :goto_8

    .line 1
    :sswitch_10
    sget v5, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v5, :cond_d

    :goto_7
    const-string v5, "\u06e4\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x228b

    const v7, 0x7993260

    xor-int/2addr v6, v7

    const v7, 0x2902e8eb

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06d8\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3c35

    const v8, -0xa0a57e9

    xor-int/2addr v6, v8

    const v8, 0x62c0ded4

    :goto_8
    xor-int/2addr v5, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a4d17ff -> :sswitch_b
        -0x6c567f05 -> :sswitch_10
        -0x524a1803 -> :sswitch_d
        -0x4c0e3ee1 -> :sswitch_d
        -0x3f4b4669 -> :sswitch_8
        -0x3e60ebf1 -> :sswitch_f
        -0x3e1170aa -> :sswitch_6
        -0x3b9f05b7 -> :sswitch_2
        -0x384f6f0b -> :sswitch_9
        -0x224ae88f -> :sswitch_b
        -0x199b8049 -> :sswitch_8
        -0xfc0d788 -> :sswitch_4
        -0xf877ad0 -> :sswitch_3
        -0xb00d753 -> :sswitch_6
        -0x8b438d5 -> :sswitch_a
        -0x5419e25 -> :sswitch_a
        -0x1b363d5 -> :sswitch_1
        0x5dbfe5e -> :sswitch_f
        0x69eb8c4 -> :sswitch_4
        0x14b8d3b4 -> :sswitch_10
        0x1d4c7f0d -> :sswitch_c
        0x1fd97cbc -> :sswitch_e
        0x23f93f3a -> :sswitch_7
        0x2f2048f2 -> :sswitch_e
        0x3104e4ce -> :sswitch_0
        0x39def1e7 -> :sswitch_5
        0x4bcbd27e -> :sswitch_2
        0x4ee2e14c -> :sswitch_3
        0x5181163e -> :sswitch_c
        0x5395d525 -> :sswitch_0
        0x56f71a54 -> :sswitch_5
        0x776eeb78 -> :sswitch_9
        0x7c935c50 -> :sswitch_1
        0x7e5024d1 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ۤ()V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/ۗ֡֫;->ܰ:Ll/ۨ֡֫;

    invoke-virtual {v0}, Ll/ۨ֡֫;->᩷()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܳ᩻;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
