.class public final Ll/ۢ᩵֫;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ܰ:Ll/ۡ᩵֫;

.field public final synthetic ᩶:Landroid/view/ViewTreeObserver;


# direct methods
.method public constructor <init>(Ll/ۡ᩵֫;Landroid/view/ViewTreeObserver;)V
    .locals 6

    const v0, -0x2771b53b

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x456d

    const v5, 0x2ddaf2e3

    xor-int/2addr v4, v5

    const v5, -0x756dc7cb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3f99

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u05a8\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7fc5

    const v5, -0x6a9a1e26

    xor-int/2addr v4, v5

    const v5, 0x4846b80e

    goto :goto_0

    .line 65
    :sswitch_0
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_1
    const-string v3, "\u06db\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5287

    const v5, 0x2449ec

    xor-int/2addr v4, v5

    const v5, 0x5f004d94

    goto :goto_0

    .line 150
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v3, :cond_7

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    goto/16 :goto_3

    .line 111
    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 156
    :sswitch_4
    iput-object p2, p0, Ll/ۢ᩵֫;->᩶:Landroid/view/ViewTreeObserver;

    return-void

    .line 32
    :sswitch_5
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a74\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x770d

    const v5, -0x76312759

    xor-int/2addr v4, v5

    const v5, 0x451e6844

    goto :goto_0

    .line 104
    :sswitch_6
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75d

    const v5, 0x2e6c6ea7

    xor-int/2addr v4, v5

    const v5, 0x1fc5b760

    goto/16 :goto_0

    .line 78
    :sswitch_7
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a76\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3439

    const v5, -0x18518428

    xor-int/2addr v4, v5

    const v5, -0x6280c5c8

    goto/16 :goto_0

    .line 117
    :sswitch_8
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06dc\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6775

    const v5, -0x70a3305

    xor-int/2addr v4, v5

    const v5, 0x5da15e17

    goto/16 :goto_0

    .line 7
    :sswitch_9
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a74\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7361

    const v5, 0x12a904a9

    xor-int/2addr v4, v5

    const v5, -0x218cb64e

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b0b

    const v5, 0x63a00dab

    xor-int/2addr v4, v5

    const v5, 0x9c2d72c

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a79\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5315

    const v5, 0x354c6fb8

    xor-int/2addr v4, v5

    const v5, 0x2ea417a9

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6a8b

    const v5, -0x6f07a4d2

    xor-int/2addr v4, v5

    const v5, -0x47d35243

    goto/16 :goto_0

    .line 128
    :sswitch_c
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u073f\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69f5

    const v5, 0x4d0672d2    # 1.4097949E8f

    xor-int/2addr v4, v5

    const v5, -0x51edca88

    goto/16 :goto_0

    .line 47
    :sswitch_d
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v3

    if-eqz v3, :cond_b

    :goto_3
    const-string v3, "\u05a1\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2abd

    const v5, 0x891744b

    xor-int/2addr v4, v5

    const v5, 0x4c37f46c    # 4.822264E7f

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e73

    const v5, -0x35daf7fb

    xor-int/2addr v4, v5

    const v5, 0x909829a

    goto/16 :goto_0

    .line 156
    :sswitch_e
    iput-object p1, p0, Ll/ۢ᩵֫;->ܰ:Ll/ۡ᩵֫;

    .line 87
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_c

    :goto_4
    const-string v3, "\u06e1\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d23

    const v5, -0x671c7be

    xor-int/2addr v4, v5

    const v5, -0x4252f1ed

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06df\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x17bf

    const v5, 0x21640fec

    xor-int/2addr v4, v5

    const v5, 0x5b6f72db

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f2d545b -> :sswitch_d
        -0x79dd7628 -> :sswitch_8
        -0x778a5001 -> :sswitch_a
        -0x74fbfbda -> :sswitch_0
        -0x725a9eff -> :sswitch_b
        -0x685e467f -> :sswitch_4
        -0x5483589a -> :sswitch_7
        -0x48279dbe -> :sswitch_c
        -0x45333cb8 -> :sswitch_8
        -0x3db148aa -> :sswitch_c
        -0x3ad171fd -> :sswitch_6
        -0x2d3fe652 -> :sswitch_e
        -0x25085e9d -> :sswitch_6
        -0x24be8635 -> :sswitch_3
        -0x1a188dbb -> :sswitch_e
        -0x91612cd -> :sswitch_9
        -0x7c8b345 -> :sswitch_2
        -0x475b564 -> :sswitch_2
        0x79f9bcb -> :sswitch_5
        0xab8e6dd -> :sswitch_b
        0x273664da -> :sswitch_7
        0x32d1ef36 -> :sswitch_0
        0x36a0a081 -> :sswitch_3
        0x3f8ab040 -> :sswitch_4
        0x4a11ba41 -> :sswitch_d
        0x53532324 -> :sswitch_5
        0x5ee08ef2 -> :sswitch_a
        0x64063d5b -> :sswitch_1
        0x7898ab75 -> :sswitch_1
        0x7b4f6a65 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x1fee2161

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x747b

    const v6, 0x5bffbaaf

    xor-int/2addr v5, v6

    const v6, 0x11f41130

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x193b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v4, :cond_1

    goto/16 :goto_3

    .line 64
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    .line 95
    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_2

    goto/16 :goto_2

    .line 72
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    const/4 v0, 0x0

    return v0

    .line 160
    :sswitch_5
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_1

    .line 162
    :sswitch_6
    iget-object v0, p0, Ll/ۢ᩵֫;->ܰ:Ll/ۡ᩵֫;

    invoke-static {v0}, Ll/ۡ᩵֫;->᩷(Ll/ۡ᩵֫;)V

    .line 163
    invoke-static {v0}, Ll/ۡ᩵֫;->᩸(Ll/ۡ᩵֫;)Z

    move-result v0

    return v0

    .line 159
    :sswitch_7
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u1a7b\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x69a7

    const v6, -0x6edbb18

    xor-int/2addr v5, v6

    const v6, 0x5162a471

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u06e1\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x9c5

    const v6, -0x669912fb

    xor-int/2addr v5, v6

    const v6, 0xe5a57f1

    goto :goto_0

    :cond_1
    const-string v4, "\u06df\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6a41

    const v6, -0x6a918f96

    xor-int/2addr v5, v6

    const v6, -0x4640221

    goto/16 :goto_0

    .line 16
    :sswitch_8
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    const-string v4, "\u1a79\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xd45

    const v6, -0x1535d734

    xor-int/2addr v5, v6

    const v6, 0x17425656

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u073f\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4a71

    const v6, 0x63d65745

    xor-int/2addr v5, v6

    const v6, -0x48f5eef

    goto/16 :goto_0

    .line 14
    :sswitch_9
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v4

    if-eqz v4, :cond_4

    :goto_2
    const-string v4, "\u1a79\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3e4f

    const v6, -0x6aa06503

    xor-int/2addr v5, v6

    const v6, -0x2a19c638

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e2\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x605f

    const v6, -0x1f317f8b

    xor-int/2addr v5, v6

    const v6, 0x7611a06a

    goto/16 :goto_0

    .line 41
    :sswitch_a
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u0733\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x466b

    const v6, 0x11cc1f4

    xor-int/2addr v5, v6

    const v6, -0x52dcb90c

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_7

    :cond_6
    const-string v4, "\u06e7\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x60b7

    const v6, -0x55e5e7a1

    xor-int/2addr v5, v6

    const v6, 0xa764728

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u1a78\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6cb3

    const v6, 0xf1db1f2

    xor-int/2addr v5, v6

    const v6, 0x2b7ed77f

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u06d8\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c8b

    const v6, 0x7167f112

    xor-int/2addr v5, v6

    const v6, 0x350266aa

    goto/16 :goto_0

    .line 69
    :sswitch_d
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06d9\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4151

    const v6, 0x5b75c5

    xor-int/2addr v5, v6

    const v6, 0x7da60ff8

    goto/16 :goto_0

    .line 8
    :sswitch_e
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06e7\u06e2"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7063

    const v6, 0x508ace31

    xor-int/2addr v5, v6

    const v6, 0x79660ee2

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06db\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3649

    const v6, 0x53b2cd29

    xor-int/2addr v5, v6

    const v6, -0x5d0b7939

    goto/16 :goto_0

    .line 125
    :sswitch_f
    sget v4, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u06ec\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5e59

    const v6, -0x21aeb188

    xor-int/2addr v5, v6

    const v6, 0x6b5aa7c0

    goto/16 :goto_0

    .line 159
    :sswitch_10
    iget-object v0, p0, Ll/ۢ᩵֫;->᩶:Landroid/view/ViewTreeObserver;

    .line 149
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_4
    const-string v4, "\u1a74\u06d7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1297

    const v6, -0x5a1aba7f

    xor-int/2addr v5, v6

    const v6, 0x183d4739

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e4\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5055

    const v6, -0x1f97127a

    xor-int/2addr v5, v6

    const v6, -0x38547c5d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79e7c877 -> :sswitch_4
        -0x773bf135 -> :sswitch_c
        -0x70ea140a -> :sswitch_2
        -0x6a49d8fd -> :sswitch_3
        -0x668ed197 -> :sswitch_6
        -0x63702ce3 -> :sswitch_d
        -0x57a51493 -> :sswitch_5
        -0x4ac278e4 -> :sswitch_8
        -0x46d7dc97 -> :sswitch_5
        -0x43a9f1ae -> :sswitch_a
        -0x2b09f527 -> :sswitch_7
        -0x22b4fea9 -> :sswitch_b
        -0x20675e68 -> :sswitch_2
        -0x1dc0d8a9 -> :sswitch_1
        -0x17e1d6b2 -> :sswitch_3
        -0x15728897 -> :sswitch_c
        -0x1372b97a -> :sswitch_f
        -0xd64f561 -> :sswitch_0
        -0x7bdca8 -> :sswitch_9
        0x7ba367f -> :sswitch_0
        0x13d29d4e -> :sswitch_7
        0x2d27d162 -> :sswitch_10
        0x3dacbeef -> :sswitch_4
        0x456a03f7 -> :sswitch_9
        0x5000f2f1 -> :sswitch_10
        0x60d1d559 -> :sswitch_8
        0x619f24ee -> :sswitch_d
        0x62491f96 -> :sswitch_e
        0x64380a5d -> :sswitch_1
        0x69453503 -> :sswitch_f
        0x6b44e46f -> :sswitch_a
        0x6bdf1935 -> :sswitch_e
        0x7f9a37c0 -> :sswitch_b
        0x7fe735da -> :sswitch_6
    .end sparse-switch
.end method
