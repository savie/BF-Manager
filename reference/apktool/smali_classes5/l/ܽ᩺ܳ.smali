.class public final synthetic Ll/ܽ᩺ܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ll/ۚۘܳ;


# instance fields
.field public final synthetic ܰ:Ll/۠ۨܳ;

.field public final synthetic ܿ:[I

.field public final synthetic ᩶:[I


# direct methods
.method public synthetic constructor <init>(Ll/۠ۨܳ;[I[I)V
    .locals 6

    const v0, -0x6c8a1de4

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d9\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x21fb

    const v5, 0x23732a3e

    xor-int/2addr v4, v5

    const v5, 0x37e0fa37

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x28a3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_3

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_1

    :sswitch_1
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a7a\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x507f

    const v5, 0x32817cf0

    xor-int/2addr v4, v5

    const v5, 0x7bbd9b6c

    goto :goto_0

    .line 4
    :sswitch_2
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v3, :cond_7

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ܽ᩺ܳ;->ܿ:[I

    return-void

    .line 4
    :sswitch_6
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x68a3

    const v5, -0x2a0eab20

    xor-int/2addr v4, v5

    const v5, 0x55a98576

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2815

    const v5, -0x2b1535ba

    xor-int/2addr v4, v5

    const v5, 0x2b4a30c8

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d9\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f4d

    const v5, 0x65578d5a

    xor-int/2addr v4, v5

    const v5, 0x5a852607

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06df\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1e2b

    const v5, 0x454bbb86

    xor-int/2addr v4, v5

    const v5, 0x4ef242b1    # 2.0322285E9f

    goto/16 :goto_0

    .line 1
    :sswitch_9
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_6

    :cond_5
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe5b

    const v5, 0x28997e54

    xor-int/2addr v4, v5

    const v5, -0x1dc4b4c

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6c35

    const v5, -0x127165e7

    xor-int/2addr v4, v5

    const v5, -0x702d5fac

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c23

    const v5, -0x6d7ccd56

    xor-int/2addr v4, v5

    const v5, -0x33d0ee48    # -4.5893344E7f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d8\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1cf9

    const v5, -0x38bc848c

    xor-int/2addr v4, v5

    const v5, 0x7c8ea540

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u073a\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7609

    const v5, 0x61c18bfb

    xor-int/2addr v4, v5

    const v5, 0x72f34826

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_a

    :goto_2
    const-string v3, "\u06e7\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b9f

    const v5, 0x1537f42f

    xor-int/2addr v4, v5

    const v5, -0x6f1f0001

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5b19

    const v5, -0x6026a9da

    xor-int/2addr v4, v5

    const v5, -0x426b5045

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u0733\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2173

    const v5, 0x49a82896    # 1377554.8f

    xor-int/2addr v4, v5

    const v5, 0x4bb74680    # 2.4022272E7f

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܽ᩺ܳ;->ܰ:Ll/۠ۨܳ;

    iput-object p2, p0, Ll/ܽ᩺ܳ;->᩶:[I

    .line 3
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u073f\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x408b

    const v5, -0x237157d9

    xor-int/2addr v4, v5

    const v5, -0x53460220

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1c8f

    const v5, 0xdf93a6f

    xor-int/2addr v4, v5

    const v5, 0x48e88ba9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e6170e8 -> :sswitch_c
        -0x706baf82 -> :sswitch_9
        -0x6c07ccf1 -> :sswitch_4
        -0x6b7d690b -> :sswitch_8
        -0x68b6d1db -> :sswitch_a
        -0x57d8b51f -> :sswitch_7
        -0x57992b67 -> :sswitch_b
        -0x578b82d8 -> :sswitch_3
        -0x551af902 -> :sswitch_b
        -0x4b228443 -> :sswitch_9
        -0x439d177f -> :sswitch_6
        -0x376ceb1c -> :sswitch_d
        -0x319ef37e -> :sswitch_7
        -0x2933d794 -> :sswitch_0
        -0x26f2cad2 -> :sswitch_5
        -0x1f49649e -> :sswitch_6
        -0x1bec5c7c -> :sswitch_2
        -0x1b81c2e6 -> :sswitch_4
        -0x1a27db76 -> :sswitch_a
        -0x136ac94a -> :sswitch_2
        -0x111024f2 -> :sswitch_c
        0x18fa7884 -> :sswitch_8
        0x1f26d534 -> :sswitch_1
        0x1f7bb160 -> :sswitch_d
        0x20916606 -> :sswitch_e
        0x318ea316 -> :sswitch_0
        0x42d8188c -> :sswitch_5
        0x5b07bcdf -> :sswitch_3
        0x5c7d26bc -> :sswitch_1
        0x7077eb57 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/᩷ۨᩴ;)V
    .locals 8

    const v0, -0x14a6365f

    sget v1, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v2, Ll/֡۟;->᩶᩺ܰ:I

    const-string v3, "\u06e7\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3e45

    const v5, -0x6cff3793

    xor-int/2addr v4, v5

    const v5, -0x3c4602ec

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3e03

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 114
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v3, :cond_b

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_9

    goto :goto_1

    .line 1377
    :sswitch_3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto :goto_1

    .line 1366
    :sswitch_4
    new-instance v3, Ll/ܿ᩺ܳ;

    .line 1282
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    .line 1366
    :cond_0
    iget-object v4, p0, Ll/ܽ᩺ܳ;->ܰ:Ll/۠ۨܳ;

    sget v5, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    iget-object v5, p0, Ll/ܽ᩺ܳ;->᩶:[I

    iget-object v6, p0, Ll/ܽ᩺ܳ;->ܿ:[I

    .line 341
    sget v7, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v7, :cond_2

    goto :goto_1

    .line 1366
    :cond_2
    invoke-direct {v3, p1, v4, v5, v6}, Ll/ܿ᩺ܳ;-><init>(Ll/᩷ۨᩴ;Ll/۠ۨܳ;[I[I)V

    .line 1429
    invoke-static {v3}, Ll/ۗܰ;->ۜ᩺ᩴ(Ljava/lang/Object;)V

    return-void

    .line 665
    :sswitch_5
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v3

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u06df\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6eb

    const v5, -0x6b81846a

    xor-int/2addr v4, v5

    const v5, -0x46edefe

    goto :goto_0

    .line 223
    :sswitch_6
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xb1f

    const v5, -0x43216b92

    xor-int/2addr v4, v5

    const v5, 0x5c496780

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e7\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6e3

    const v5, 0x18bcc567

    xor-int/2addr v4, v5

    const v5, 0x34cb3c03

    goto/16 :goto_0

    .line 211
    :sswitch_7
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x595d

    const v5, 0x36cc2fcb

    xor-int/2addr v4, v5

    const v5, 0x68791b4a

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e1\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5551

    const v5, -0x7de16fc4    # -1.16494E-37f

    xor-int/2addr v4, v5

    const v5, 0x2dbcb323

    goto/16 :goto_0

    .line 1100
    :sswitch_8
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u1a76\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x325d

    const v5, -0x976eaa

    xor-int/2addr v4, v5

    const v5, 0x3f8d73f4

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v3

    if-nez v3, :cond_8

    :goto_3
    const-string v3, "\u1a7b\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7501

    const v5, -0x75326a41

    xor-int/2addr v4, v5

    const v5, 0x521a883e

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e1\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3e0f

    const v5, -0x3771d8dd

    xor-int/2addr v4, v5

    const v5, -0xbb75f89

    goto/16 :goto_0

    .line 744
    :sswitch_a
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u073a\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c8d

    const v5, 0x67da372d

    xor-int/2addr v4, v5

    const v5, -0x4818221c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24fb

    const v5, 0x7ef3a6eb

    xor-int/2addr v4, v5

    const v5, 0x68389cfb

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xcb9

    const v5, -0x9740d18

    xor-int/2addr v4, v5

    const v5, -0x5469adf3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3aeb

    const v5, -0x56da0749

    xor-int/2addr v4, v5

    const v5, -0x6193105a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6f52b07b -> :sswitch_8
        -0x686951ae -> :sswitch_2
        -0x5dbc0445 -> :sswitch_8
        -0x55d89dd6 -> :sswitch_1
        -0x51d0d8b7 -> :sswitch_5
        -0x3fa90cda -> :sswitch_a
        -0x32184fec -> :sswitch_1
        -0x30d62111 -> :sswitch_9
        -0x2d6bf621 -> :sswitch_6
        -0x18e77e16 -> :sswitch_0
        -0x13004627 -> :sswitch_b
        0x1d11399 -> :sswitch_4
        0x269ba5b -> :sswitch_7
        0x15d1d323 -> :sswitch_4
        0x25abdff7 -> :sswitch_a
        0x25fb3e96 -> :sswitch_6
        0x26efa326 -> :sswitch_9
        0x27b2f0cc -> :sswitch_2
        0x4598d725 -> :sswitch_7
        0x502ed305 -> :sswitch_5
        0x615e35ae -> :sswitch_3
        0x62ccb360 -> :sswitch_0
        0x6a35a0d5 -> :sswitch_3
        0x79ebc41a -> :sswitch_b
    .end sparse-switch
.end method
