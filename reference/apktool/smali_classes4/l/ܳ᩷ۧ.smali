.class public final Ll/ܳ᩷ۧ;
.super Ljava/lang/Object;
.source "12B7"


# instance fields
.field public ۙ:I

.field public ۤ:I

.field public ᩴ:Ljava/lang/String;

.field public ᩷:Z

.field public ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;Z)V
    .locals 6

    const v0, -0x2da1c78

    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    .line 640
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a74\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3a51

    const v5, 0x1a9055bf

    xor-int/2addr v4, v5

    const v5, -0x4162cd3d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6baf

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 565
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v3, :cond_6

    goto/16 :goto_2

    .line 508
    :sswitch_0
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_b

    goto :goto_2

    .line 251
    :sswitch_1
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    goto/16 :goto_4

    .line 252
    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 644
    :sswitch_4
    iput-object p4, p0, Ll/ܳ᩷ۧ;->᩸:Ljava/lang/String;

    .line 645
    iput-boolean p5, p0, Ll/ܳ᩷ۧ;->᩷:Z

    return-void

    .line 643
    :sswitch_5
    iput-object p1, p0, Ll/ܳ᩷ۧ;->ᩴ:Ljava/lang/String;

    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x49f5

    const v5, -0x393a42d5

    xor-int/2addr v4, v5

    const v5, 0x5d742b57

    goto :goto_0

    .line 501
    :sswitch_6
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_1

    :goto_1
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1b9f

    const v5, 0x7638b450

    xor-int/2addr v4, v5

    const v5, -0x30d9a5b4

    goto :goto_0

    :cond_1
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x74f7

    const v5, 0x44a52ca7

    xor-int/2addr v4, v5

    const v5, 0x509f48c7

    goto :goto_0

    .line 477
    :sswitch_7
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-gtz v3, :cond_3

    :cond_2
    :goto_2
    const-string v3, "\u06e0\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x71dd

    const v5, -0x3ec1dd

    xor-int/2addr v4, v5

    const v5, -0x4fe7b28b

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u073f\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x67a5

    const v5, 0x67eef068

    xor-int/2addr v4, v5

    const v5, -0x49d8eb2

    goto/16 :goto_0

    .line 25
    :sswitch_8
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u1a76\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x163f

    const v5, 0x12419254

    xor-int/2addr v4, v5

    const v5, -0xa88dcb9

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u1a7a\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x357b

    const v5, -0xe8a14e7

    xor-int/2addr v4, v5

    const v5, -0xa5b43f5

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3fb5

    const v5, 0x1e97e837

    xor-int/2addr v4, v5

    const v5, -0xafc776

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d9\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a9b

    const v5, -0x360ddfb5

    xor-int/2addr v4, v5

    const v5, -0xfaa1c06

    goto/16 :goto_0

    .line 487
    :sswitch_b
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06e0\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7d9f

    const v5, -0x7384df26

    xor-int/2addr v4, v5

    const v5, 0x65db8010

    goto/16 :goto_0

    .line 26
    :sswitch_c
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u1a73\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b01

    const v5, -0x4fffc9f

    xor-int/2addr v4, v5

    const v5, 0x75bd4dc6

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v3, :cond_a

    :goto_4
    const-string v3, "\u1a7b\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x50c9

    const v5, 0x78b47d2c

    xor-int/2addr v4, v5

    const v5, 0x63617d60

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1bed

    const v5, -0x67f20e89

    xor-int/2addr v4, v5

    const v5, -0x27715907

    goto/16 :goto_0

    .line 641
    :sswitch_e
    iput p2, p0, Ll/ܳ᩷ۧ;->ۙ:I

    .line 642
    iput p3, p0, Ll/ܳ᩷ۧ;->ۤ:I

    .line 459
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u06dc\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x823

    const v5, -0x448bff83

    xor-int/2addr v4, v5

    const v5, 0x78aeb844

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7abd

    const v5, 0x589411a1

    xor-int/2addr v4, v5

    const v5, -0x23e84fd0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77afde9a -> :sswitch_8
        -0x72397e76 -> :sswitch_d
        -0x44cf2516 -> :sswitch_c
        -0x395933e6 -> :sswitch_a
        -0x24ec6713 -> :sswitch_0
        -0x20b9ad03 -> :sswitch_2
        -0x1f21399a -> :sswitch_2
        -0x1ab183da -> :sswitch_6
        -0x173195a9 -> :sswitch_1
        -0xd0f35c2 -> :sswitch_a
        -0x2a5e841 -> :sswitch_9
        0x6e1629d -> :sswitch_b
        0xad626b7 -> :sswitch_1
        0xade1e3e -> :sswitch_e
        0x13368ad8 -> :sswitch_4
        0x2258bc33 -> :sswitch_c
        0x3f94dcd4 -> :sswitch_e
        0x42c65aaf -> :sswitch_3
        0x479de104 -> :sswitch_7
        0x4b50dce4 -> :sswitch_5
        0x4df6ddff -> :sswitch_7
        0x4f1d71c0 -> :sswitch_5
        0x531774a6 -> :sswitch_4
        0x687b752a -> :sswitch_0
        0x6c4900b6 -> :sswitch_6
        0x70465a69 -> :sswitch_d
        0x70fafcfd -> :sswitch_9
        0x717b9875 -> :sswitch_b
        0x767cbcb8 -> :sswitch_3
        0x7fdbfddd -> :sswitch_8
    .end sparse-switch
.end method

.method public static bridge synthetic ۙ(Ll/ܳ᩷ۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳ᩷ۧ;->ۙ:I

    return p0
.end method

.method public static bridge synthetic ۤ(Ll/ܳ᩷ۧ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܳ᩷ۧ;->ۤ:I

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/ܳ᩷ۧ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ۧ;->ᩴ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ܳ᩷ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܳ᩷ۧ;->᩷:Z

    return p0
.end method

.method public static bridge synthetic ᩸(Ll/ܳ᩷ۧ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳ᩷ۧ;->᩸:Ljava/lang/String;

    return-object p0
.end method
