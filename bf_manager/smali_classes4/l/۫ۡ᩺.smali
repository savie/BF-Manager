.class public final synthetic Ll/۫ۡ᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۤ᩺ۙ;
.implements Ll/ۢ᩶۠;


# instance fields
.field public final synthetic ܺ:Ll/ᩳۡ᩺;


# direct methods
.method public constructor <init>(Ll/ᩳۡ᩺;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۡ᩺;->ܺ:Ll/ᩳۡ᩺;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x69da560f

    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    const-string v4, "\u1a7b\u1a78"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xc83

    const v6, -0x20766f91

    xor-int/2addr v5, v6

    const v6, -0x118720b3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x37e5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 7
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_3

    :sswitch_0
    sget v4, Ll/ۗᩳ;->ۚۤ֡:I

    if-gez v4, :cond_2

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v4, :cond_9

    goto/16 :goto_1

    .line 71
    :sswitch_2
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-lez v4, :cond_5

    goto/16 :goto_4

    .line 20
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    goto/16 :goto_4

    .line 79
    :sswitch_4
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    const/4 p1, 0x0

    return p1

    .line 169
    :sswitch_5
    iget-object p1, p0, Ll/۫ۡ᩺;->ܺ:Ll/ᩳۡ᩺;

    invoke-static {p1, v0}, Ll/֫;->ᩴܽܽ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 0
    :sswitch_6
    move-object v0, p1

    check-cast v0, Ll/ۢ᩶۠;

    invoke-interface {v0}, Ll/ۢ᩶۠;->ۙ()Ll/ܶ᩶۠;

    move-result-object v0

    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06e8\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3793

    const v6, -0x67d716b9

    xor-int/2addr v5, v6

    const v6, -0x6865aed3

    goto :goto_0

    .line 6
    :sswitch_7
    instance-of v4, p1, Ll/ۢ᩶۠;

    if-eqz v4, :cond_1

    const-string v4, "\u1a7b\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5d0d

    const v6, -0x4a54f860

    xor-int/2addr v5, v6

    const v6, 0x384cef58

    goto :goto_0

    :sswitch_8
    const/4 p1, 0x0

    return p1

    .line 2
    :sswitch_9
    instance-of v4, p1, Ll/ۤ᩺ۙ;

    if-eqz v4, :cond_1

    const-string v4, "\u1a74\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a65

    const v6, -0x4ffbf970

    xor-int/2addr v5, v6

    const v6, 0x374c8254

    goto/16 :goto_0

    :cond_1
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x10f1

    const v6, 0x5c80f8f6

    xor-int/2addr v5, v6

    const v6, 0x4ee8624f

    goto/16 :goto_0

    .line 45
    :sswitch_a
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    move-result v4

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u073d\u06dc"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x634b

    const v6, 0x59e2c1f9

    xor-int/2addr v5, v6

    const v6, -0x497ef3f0

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a74\u06ec"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2c3b

    const v6, 0x630a8ad4

    xor-int/2addr v5, v6

    const v6, 0x777c89db

    goto/16 :goto_0

    .line 0
    :sswitch_b
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u1a75\u06d8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2c65

    const v6, 0x73bcfc1e

    xor-int/2addr v5, v6

    const v6, -0x1cbe23eb

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u0736\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ab

    const v6, 0x7272a4ac

    xor-int/2addr v5, v6

    const v6, 0x41044e0c

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u073d\u05a8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5d17

    const v6, 0x593d4fc4

    xor-int/2addr v5, v6

    const v6, 0x28e39f26

    goto/16 :goto_0

    .line 104
    :sswitch_d
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u05a1\u0730"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x70d7

    const v6, 0x2e81a74a

    xor-int/2addr v5, v6

    const v6, 0x628b22e5

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v4

    if-gtz v4, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v4, "\u06d6\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1985

    const v6, -0x7b71324e

    xor-int/2addr v5, v6

    const v6, -0x739f9f52

    goto/16 :goto_0

    .line 97
    :sswitch_f
    sget v4, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v4, :cond_a

    :cond_9
    :goto_2
    const-string v4, "\u06d9\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7a6b

    const v6, 0x7d999578

    xor-int/2addr v5, v6

    const v6, 0x240286bf

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x63

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x69e3

    const v6, -0xd15e8f0

    xor-int/2addr v5, v6

    const v6, -0x236837e3

    goto/16 :goto_0

    .line 14
    :sswitch_10
    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u1a7b\u06e7"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x62bb

    const v6, -0x4a1ff822

    xor-int/2addr v5, v6

    const v6, -0x2c11248e

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u1a7a\u1a75"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x432f

    const v6, -0x30e958b0

    xor-int/2addr v5, v6

    const v6, -0x7cccf39a

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a75\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x474d

    const v6, -0x688123be

    xor-int/2addr v5, v6

    const v6, -0x55d29889

    goto/16 :goto_0

    :sswitch_11
    sget v4, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz v4, :cond_d

    :goto_4
    const-string v4, "\u06e8\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x63c9

    const v6, 0x6d0b99fa

    xor-int/2addr v5, v6

    const v6, 0x42b9238c

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0733\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x39df

    const v6, 0x7f5fdc31

    xor-int/2addr v5, v6

    const v6, -0x64fe8dfa

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x707ad064 -> :sswitch_10
        -0x70594d7a -> :sswitch_10
        -0x6d23f371 -> :sswitch_4
        -0x5f0c8a8b -> :sswitch_2
        -0x5e33a0e1 -> :sswitch_e
        -0x5d7d6eec -> :sswitch_6
        -0x4dd1c482 -> :sswitch_b
        -0x4c81bef2 -> :sswitch_0
        -0x341442c6 -> :sswitch_b
        -0x2d23c931 -> :sswitch_1
        -0x27679036 -> :sswitch_7
        -0x24b10adb -> :sswitch_f
        -0x13c3b866 -> :sswitch_8
        -0x124d0e90 -> :sswitch_9
        -0x11e6060a -> :sswitch_f
        -0x10bde307 -> :sswitch_8
        -0xba76df0 -> :sswitch_a
        -0x78a0680 -> :sswitch_2
        -0x16594bb -> :sswitch_7
        0x64ce61 -> :sswitch_3
        0x11e5e30 -> :sswitch_e
        0x6307dca -> :sswitch_1
        0x17a17cdb -> :sswitch_9
        0x18c497a7 -> :sswitch_3
        0x2c3f1584 -> :sswitch_a
        0x31f6f428 -> :sswitch_11
        0x378c6948 -> :sswitch_5
        0x3a0db778 -> :sswitch_4
        0x3dfbd5af -> :sswitch_c
        0x476eae4e -> :sswitch_0
        0x53a2c530 -> :sswitch_6
        0x5cec470d -> :sswitch_5
        0x5e583469 -> :sswitch_c
        0x63b75817 -> :sswitch_d
        0x7404dfcb -> :sswitch_d
        0x74123ae5 -> :sswitch_11
    .end sparse-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۫ۡ᩺;->ܺ:Ll/ᩳۡ᩺;

    invoke-static {v0}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final ۙ()Ll/ܶ᩶۠;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۫ۡ᩺;->ܺ:Ll/ᩳۡ᩺;

    return-object v0
.end method

.method public final synthetic ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۫ۡ᩺;->ܺ:Ll/ᩳۡ᩺;

    invoke-virtual {v0, p1}, Ll/ᩳۡ᩺;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
