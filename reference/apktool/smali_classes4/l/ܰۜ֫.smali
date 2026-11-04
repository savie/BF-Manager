.class public final synthetic Ll/ܰۜ֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x478e823

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    .line 0
    iput p1, p0, Ll/ܰۜ֫;->ܰ:I

    iput-object p2, p0, Ll/ܰۜ֫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u073d\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6b67

    const v3, 0x72908bdf

    xor-int/2addr p2, v3

    const v3, 0x105e56ff

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x14db

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget p1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz p1, :cond_1

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a7b\u1a73"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x36e5

    const v3, -0x19478211

    xor-int/2addr p2, v3

    const v3, 0x714988f0

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u1a74\u073a"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x75

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3325

    const v3, 0x405c87d9

    xor-int/2addr p2, v3

    const v3, -0x20e8c607

    goto :goto_0

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u073d\u1a79"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x31

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x40db

    const v3, 0x70469d9b

    xor-int/2addr p2, v3

    const v3, 0x2e1f7619

    goto :goto_0

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    :goto_2
    const-string p1, "\u1a73\u1a77"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x43b3

    const v3, -0x4c824444

    xor-int/2addr p2, v3

    const v3, 0x21709681

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u06d6\u06d7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x19

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x640d

    const v3, -0x35020137    # -8322916.5f

    xor-int/2addr p2, v3

    const v3, -0x3810e8a8

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a7a\u0733"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x39f9

    const v3, 0x261ccc64

    xor-int/2addr p2, v3

    const v3, 0x751aad68

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x3490d09f -> :sswitch_3
        -0x2548e335 -> :sswitch_1
        -0x21b67184 -> :sswitch_2
        -0x205ff055 -> :sswitch_1
        -0x1fbd2a2a -> :sswitch_3
        0x787ee38 -> :sswitch_4
        0x9748300 -> :sswitch_0
        0x16f73468 -> :sswitch_4
        0x31961324 -> :sswitch_5
        0x50a33962 -> :sswitch_2
        0x62c0c9cb -> :sswitch_5
        0x7e6b7fe5 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2e0f704b

    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v4, "\u073d\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1dd

    const v6, -0x25f48ca7

    xor-int/2addr v5, v6

    const v6, 0x173a269b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x2e99

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    invoke-static {v0}, Lbin/mt/plus/Main;->ۙ(Ljava/lang/ref/WeakReference;)V

    return-void

    :sswitch_0
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v4, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v4, :cond_a

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v4

    if-lez v4, :cond_1

    goto/16 :goto_4

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v0, p0, Ll/ܰۜ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۚ᩷ۧ;

    invoke-static {v0}, Ll/ۚ᩷ۧ;->۫(Ll/ۚ᩷ۧ;)V

    return-void

    :sswitch_6
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06e4\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x55e7

    const v6, -0xd28f668

    xor-int/2addr v5, v6

    const v6, 0x64b7411f

    goto :goto_0

    .line 3
    :sswitch_7
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u0733\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x14bb

    const v6, -0x2788d0be

    xor-int/2addr v5, v6

    const v6, -0x4e8a172b

    goto :goto_0

    :cond_2
    const-string v4, "\u06e1\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xe93

    const v6, 0x25dbd23f

    xor-int/2addr v5, v6

    const v6, -0x6ab450f4

    goto :goto_0

    .line 4
    :sswitch_8
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u073d\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x68fb

    const v6, -0x62c03178

    xor-int/2addr v5, v6

    const v6, -0x61612ee0

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u0736\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x9f3

    const v6, -0x4efcd5b8

    xor-int/2addr v5, v6

    const v6, -0x24350c58

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06e2\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d3f

    const v6, -0x4da739f3

    xor-int/2addr v5, v6

    const v6, 0x3ee00492

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_7

    :cond_6
    const-string v4, "\u05a1\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xb9

    const v6, -0x2f12974d

    xor-int/2addr v5, v6

    const v6, -0x1b41bbce

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06da\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x632d

    const v6, -0x522f3087

    xor-int/2addr v5, v6

    const v6, -0x6d8aeffc

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_8

    :goto_2
    const-string v4, "\u073f\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x404b

    const v6, -0x4d60ca16

    xor-int/2addr v5, v6

    const v6, 0x4740c394

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e1\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x378f

    const v6, -0x3c7de510

    xor-int/2addr v5, v6

    const v6, -0x32300e81    # -4.360888E8f

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a75\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x31a3

    const v6, 0x11095b68

    xor-int/2addr v5, v6

    const v6, 0x23d4d7ed

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_b

    :cond_a
    :goto_3
    const-string v4, "\u06d6\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6d45

    const v6, -0x22e7a810

    xor-int/2addr v5, v6

    const v6, -0x30ae26f6

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a77\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x104d

    const v6, 0x41f46d6d

    xor-int/2addr v5, v6

    const v6, 0xc4fc565

    goto/16 :goto_0

    :sswitch_f
    iget-object v0, p0, Ll/ܰۜ֫;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ref/WeakReference;

    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u1a78\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3535

    const v6, -0x28eb284f

    xor-int/2addr v5, v6

    const v6, 0x1d7968c3

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a74\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1a11

    const v6, -0x4378bdc6

    xor-int/2addr v5, v6

    const v6, 0x396608d

    goto/16 :goto_0

    :sswitch_10
    iget v4, p0, Ll/ܰۜ֫;->ܰ:I

    packed-switch v4, :pswitch_data_0

    const-string v4, "\u06e1\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3f07

    const v6, -0x4d9c530a

    xor-int/2addr v5, v6

    const v6, 0x43619492

    goto/16 :goto_0

    :pswitch_0
    const-string v4, "\u06d8\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3891

    const v6, -0xaf39c8d

    xor-int/2addr v5, v6

    const v6, -0x5e641351

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x70d1b563 -> :sswitch_1
        -0x69df76de -> :sswitch_1
        -0x56ab9238 -> :sswitch_8
        -0x51ae6daf -> :sswitch_c
        -0x3c149628 -> :sswitch_3
        -0x32c96bfb -> :sswitch_d
        -0x2cfab22b -> :sswitch_f
        -0x2b0dfff8 -> :sswitch_b
        -0x2b03d0de -> :sswitch_9
        -0x1c3d2b73 -> :sswitch_a
        -0x19e84130 -> :sswitch_e
        -0x167653cb -> :sswitch_e
        -0x8992fbb -> :sswitch_4
        0x11d90c8c -> :sswitch_5
        0x16111552 -> :sswitch_6
        0x224beef6 -> :sswitch_9
        0x254df5a9 -> :sswitch_2
        0x27d3dadd -> :sswitch_b
        0x2cd7781a -> :sswitch_a
        0x2e187185 -> :sswitch_5
        0x390efade -> :sswitch_0
        0x3d2c0484 -> :sswitch_f
        0x41d4c0ec -> :sswitch_8
        0x4fd4834f -> :sswitch_4
        0x51499441 -> :sswitch_c
        0x53982692 -> :sswitch_0
        0x576090e5 -> :sswitch_7
        0x60bd4aeb -> :sswitch_2
        0x65a4b90d -> :sswitch_10
        0x6aabdc22 -> :sswitch_10
        0x74dea4d1 -> :sswitch_d
        0x7cecf377 -> :sswitch_3
        0x7cf3b828 -> :sswitch_7
        0x7f578493 -> :sswitch_6
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
