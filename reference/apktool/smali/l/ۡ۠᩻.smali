.class public final Ll/ۡ۠᩻;
.super Ljava/lang/Object;
.source "CB0A"


# static fields
.field public static final ۙ:Ll/ۧ᩹᩹;

.field public static final ᩷:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x55

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/4 v0, 0x0

    const v1, -0x6863378

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    const-string v4, "\u073f\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x22e9

    const v6, 0x37babf2b

    xor-int/2addr v5, v6

    const v6, 0x2b4f7ad

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x79ef

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 13
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 16
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v4

    if-ltz v4, :cond_b

    goto :goto_1

    .line 13
    :sswitch_1
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_9

    goto :goto_1

    .line 17
    :sswitch_2
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u06e1\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x29a1

    const v6, 0x3feb78f0

    xor-int/2addr v5, v6

    const v6, 0xf9540de

    goto :goto_0

    .line 13
    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto/16 :goto_3

    .line 14
    :sswitch_4
    invoke-static {}, Ll/ۡ۠᩻;->ۙ()Ll/ۧ᩹᩹;

    move-result-object v0

    sput-object v0, Ll/ۡ۠᩻;->ۙ:Ll/ۧ᩹᩹;

    return-void

    .line 13
    :sswitch_5
    sput-object v0, Ll/ۡ۠᩻;->᩷:Ljava/util/concurrent/locks/ReentrantLock;

    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_1

    goto :goto_2

    :cond_1
    const-string v4, "\u0733\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6f9

    const v6, 0x161aa856

    xor-int/2addr v5, v6

    const v6, -0x74b65cb3

    goto :goto_0

    .line 15
    :sswitch_6
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u06da\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x805

    const v6, -0x7e9efca3

    xor-int/2addr v5, v6

    const v6, -0x5818217e

    goto/16 :goto_0

    .line 17
    :sswitch_7
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u1a7a\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x15c1

    const v6, 0x5bb86ba9

    xor-int/2addr v5, v6

    const v6, 0x2d42f626

    goto/16 :goto_0

    .line 13
    :sswitch_8
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v4

    if-nez v4, :cond_4

    :goto_2
    const-string v4, "\u1a75\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7633

    const v6, 0x21972df9

    xor-int/2addr v5, v6

    const v6, -0x4733b0e0

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a73\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x38d7

    const v6, 0x2583de23

    xor-int/2addr v5, v6

    const v6, 0x6fc45ad9    # 1.2153778E29f

    goto/16 :goto_0

    .line 17
    :sswitch_9
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06dc\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x611b

    const v6, -0x6298b88e

    xor-int/2addr v5, v6

    const v6, -0x17ab0a2e

    goto/16 :goto_0

    .line 13
    :sswitch_a
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u1a77\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x14c3

    const v6, 0x39dd100a

    xor-int/2addr v5, v6

    const v6, 0x69535e3c

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u06d9\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5fc1

    const v6, -0x498b4425

    xor-int/2addr v5, v6

    const v6, 0x2a9a40e3

    goto/16 :goto_0

    .line 17
    :sswitch_c
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_8

    :goto_3
    const-string v4, "\u06e8\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2aeb

    const v6, 0x3eb29c35

    xor-int/2addr v5, v6

    const v6, -0x4cec239e

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05a1\u06d8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x9c7

    const v6, 0x5016c2a4

    xor-int/2addr v5, v6

    const v6, 0x5be8ec6f

    goto/16 :goto_0

    .line 15
    :sswitch_d
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u0733\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6f6b

    const v6, 0x736f5276

    xor-int/2addr v5, v6

    const v6, 0x326e643b

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a79\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xdc7

    const v6, -0x71a37e5e

    xor-int/2addr v5, v6

    const v6, 0x5188b8db

    goto/16 :goto_0

    .line 13
    :sswitch_e
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u05a8\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7ec3

    const v6, -0xe7daf0b

    xor-int/2addr v5, v6

    const v6, -0x69d54218

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e4\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b49

    const v6, -0xbfab9f1

    xor-int/2addr v5, v6

    const v6, -0x10ec6a59

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e4ecdaa -> :sswitch_9
        -0x75f69078 -> :sswitch_2
        -0x74489dd5 -> :sswitch_8
        -0x728f7516 -> :sswitch_0
        -0x5e7a6d96 -> :sswitch_4
        -0x55018616 -> :sswitch_a
        -0x4aa12b89 -> :sswitch_a
        -0x4592b7b0 -> :sswitch_0
        -0x43d86a28 -> :sswitch_b
        -0x42414b45 -> :sswitch_1
        -0x36066c51 -> :sswitch_9
        -0x28137585 -> :sswitch_3
        -0x255348f0 -> :sswitch_d
        -0x6dab420 -> :sswitch_5
        0x28faf6b -> :sswitch_e
        0x6e46d64 -> :sswitch_4
        0x78d053e -> :sswitch_6
        0x1f68ff5d -> :sswitch_d
        0x2a2225be -> :sswitch_c
        0x2c9f7862 -> :sswitch_1
        0x308cbac0 -> :sswitch_5
        0x370beeb9 -> :sswitch_e
        0x4757837e -> :sswitch_6
        0x5a789ed3 -> :sswitch_7
        0x5e9b0f2e -> :sswitch_2
        0x5ff3fddd -> :sswitch_3
        0x660c9b7a -> :sswitch_8
        0x69dd6b17 -> :sswitch_7
        0x6e57a7f7 -> :sswitch_b
        0x7b474b23 -> :sswitch_c
    .end sparse-switch
.end method

.method public static native ۙ()Ll/ۧ᩹᩹;
.end method
