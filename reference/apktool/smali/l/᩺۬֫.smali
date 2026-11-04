.class public final Ll/᩺۬֫;
.super Landroid/animation/AnimatorListenerAdapter;
.source "H6HS"


# instance fields
.field public final synthetic ۙ:Ll/ۢ۬֫;

.field public final synthetic ۤ:I

.field public final synthetic ᩴ:Z

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩸:Z


# direct methods
.method public constructor <init>(ILl/ۢ۬֫;Ljava/lang/String;ZZ)V
    .locals 3

    const v0, 0x7a412d0a

    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    .line 557
    iput-object p2, p0, Ll/᩺۬֫;->ۙ:Ll/ۢ۬֫;

    iput p1, p0, Ll/᩺۬֫;->ۤ:I

    iput-boolean p4, p0, Ll/᩺۬֫;->᩸:Z

    iput-object p3, p0, Ll/᩺۬֫;->᩷:Ljava/lang/String;

    iput-boolean p5, p0, Ll/᩺۬֫;->ᩴ:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const-string p1, "\u06e7\u1a73"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x37

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x498b

    const p3, -0x7c1bc39f

    xor-int/2addr p2, p3

    const p3, 0x1409dcb0

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x61d1

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 361
    :sswitch_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05a1\u06db"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2b93

    const p3, -0x10535939

    xor-int/2addr p2, p3

    const p3, 0xdcb71b1

    goto :goto_0

    .line 422
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a76\u1a7a"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2f05

    const p3, -0x36fe428d

    xor-int/2addr p2, p3

    const p3, -0x7d68992f

    goto :goto_0

    :sswitch_2
    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u06e4\u0730"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4a89

    const p3, -0x6d6a90b7

    xor-int/2addr p2, p3

    const p3, -0x46b8bb66

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    :goto_1
    const-string p1, "\u1a74\u1a73"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6723

    const p3, 0x70c2f25

    xor-int/2addr p2, p3

    const p3, -0x3b0d15f2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 313
    :sswitch_5
    sget p1, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz p1, :cond_3

    const-string p1, "\u06db\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7bc7

    const p3, 0x260d7217

    xor-int/2addr p2, p3

    const p3, 0x1702b054

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a76\u05ab"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7227

    const p3, 0x1b5f15bc

    xor-int/2addr p2, p3

    const p3, -0x42cef65f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d2af118 -> :sswitch_5
        -0x6f203ea0 -> :sswitch_3
        -0x6e16a450 -> :sswitch_2
        -0x4e654b15 -> :sswitch_0
        -0x129602b9 -> :sswitch_4
        -0x11b2f7d1 -> :sswitch_1
        -0x43a411a -> :sswitch_5
        0x68a5148 -> :sswitch_4
        0x240cf76e -> :sswitch_2
        0x24539ddd -> :sswitch_1
        0x3e51b17d -> :sswitch_0
        0x5cece8de -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 10

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x3b7407aa

    sget v4, Ll/᩺;->۫۬۫:I

    sget v5, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v6, "\u06e2\u06d9"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5e97

    const v8, 0x38554e90

    xor-int/2addr v7, v8

    const v8, -0x4f8eaed1

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x7a8b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget v6, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v6, :cond_5

    goto/16 :goto_5

    .line 417
    :sswitch_0
    sget v6, Ll/ۘ֡;->᩹ܶ۬:I

    if-lez v6, :cond_6

    goto/16 :goto_4

    .line 18
    :sswitch_1
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v6

    if-eqz v6, :cond_b

    goto/16 :goto_4

    .line 445
    :sswitch_2
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-lez v6, :cond_d

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto/16 :goto_4

    .line 196
    :sswitch_4
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    return-void

    .line 561
    :sswitch_5
    iget-boolean v6, p0, Ll/᩺۬֫;->᩸:Z

    invoke-static {v0, p1, v1, v6, v2}, Ll/ۢ۬֫;->ۙ(ILl/ۢ۬֫;Ljava/lang/String;ZZ)V

    goto/16 :goto_3

    :sswitch_6
    iget-boolean v2, p0, Ll/᩺۬֫;->ᩴ:Z

    .line 519
    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v6, :cond_0

    goto :goto_2

    :cond_0
    const-string v6, "\u06d9\u05ab"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x51

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5e4d

    const v8, -0x79ebb357

    xor-int/2addr v7, v8

    const v8, -0xd9bc6bb

    goto :goto_0

    .line 560
    :sswitch_7
    invoke-static {p1}, Ll/ۢ۬֫;->֫(Ll/ۢ۬֫;)V

    .line 561
    iget-object v1, p0, Ll/᩺۬֫;->᩷:Ljava/lang/String;

    .line 112
    sget v6, Ll/֫֡;->֫ۙۖ:I

    if-gtz v6, :cond_1

    :goto_2
    const-string v6, "\u06eb\u06e0"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1315

    const v8, -0x6b3b5254

    xor-int/2addr v7, v8

    const v8, 0x66fc52aa

    goto :goto_0

    :cond_1
    const-string v6, "\u073d\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6c57

    const v8, 0x322bdb0e    # 1.0003317E-8f

    xor-int/2addr v7, v8

    const v8, 0x323de2b6

    goto/16 :goto_0

    .line 559
    :sswitch_8
    invoke-static {p1}, Ll/ۢ۬֫;->۫(Ll/ۢ۬֫;)I

    move-result v0

    iget v6, p0, Ll/᩺۬֫;->ۤ:I

    if-eq v6, v0, :cond_2

    move v0, v6

    goto :goto_3

    :cond_2
    const-string v0, "\u06da\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0xf

    xor-int v7, v0, v4

    mul-int/lit16 v7, v7, 0x7b3

    const v8, 0x523dfe5

    xor-int/2addr v7, v8

    const v8, -0x34c6a0ed    # -1.2148499E7f

    xor-int/2addr v0, v8

    move v9, v6

    move v6, v0

    move v0, v9

    goto/16 :goto_1

    :sswitch_9
    return-void

    :sswitch_a
    iget-object p1, p0, Ll/᩺۬֫;->ۙ:Ll/ۢ۬֫;

    invoke-static {p1}, Ll/ۢ۬֫;->ۤ(Ll/ۢ۬֫;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "\u06d9\u06ec"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xc59

    const v8, -0x68a78f86

    xor-int/2addr v7, v8

    const v8, 0x6f51eadc

    goto/16 :goto_0

    :cond_3
    :goto_3
    const-string v6, "\u06e1\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5b3b

    const v8, 0x5d19cb4e

    xor-int/2addr v7, v8

    const v8, 0x15979cb7

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u1a7a\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1ba7

    const v8, 0x55646a3c

    xor-int/2addr v7, v8

    const v8, -0xd31848f

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06e4\u06e4"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x35b1

    const v8, 0x770ad93a

    xor-int/2addr v7, v8

    const v8, -0x360811c3

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v6, :cond_7

    :cond_6
    const-string v6, "\u0730\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4deb

    const v8, -0x7eb7cacc

    xor-int/2addr v7, v8

    const v8, 0x1bd94000

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u073a\u06e4"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x315

    const v8, 0x15822e90

    xor-int/2addr v7, v8

    const v8, 0x28dc0a5a

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v6

    if-gtz v6, :cond_8

    goto :goto_5

    :cond_8
    const-string v6, "\u06df\u1a7b"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x67af

    const v8, -0x9cb25fb

    xor-int/2addr v7, v8

    const v8, -0x16194616

    goto/16 :goto_0

    .line 510
    :sswitch_e
    sget v6, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "\u05ab\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6419

    const v8, -0x51fad7ed

    xor-int/2addr v7, v8

    const v8, 0x68717db4

    goto/16 :goto_0

    .line 118
    :sswitch_f
    sget v6, Ll/۬;->᩸ۜ᩹:I

    if-eqz v6, :cond_a

    :goto_4
    const-string v6, "\u05ab\u06eb"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x71

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7f9b

    const v8, 0x2ccbadc2

    xor-int/2addr v7, v8

    const v8, -0x474223b8

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a78\u0730"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5ffb

    const v8, -0x64f8ebd1

    xor-int/2addr v7, v8

    const v8, -0x578321e4

    goto/16 :goto_0

    .line 45
    :sswitch_10
    sget v6, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u06d9\u0733"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1ccf

    const v8, 0xa74fb04

    xor-int/2addr v7, v8

    const v8, -0xb16ecfc

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d6\u0733"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x186f

    const v8, 0xb82bbc1

    xor-int/2addr v7, v8

    const v8, 0x7da63dc2

    goto/16 :goto_0

    .line 202
    :sswitch_11
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_e

    :cond_d
    const-string v6, "\u1a74\u06e8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x59c5

    const v8, 0x32a16876

    xor-int/2addr v7, v8

    const v8, -0x6b286917

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06d6\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x75cd

    const v8, 0x551500af

    xor-int/2addr v7, v8

    const v8, -0x2194297

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x756d2172 -> :sswitch_11
        -0x66999d68 -> :sswitch_2
        -0x52768cc8 -> :sswitch_0
        -0x51615f52 -> :sswitch_6
        -0x4fd05e30 -> :sswitch_8
        -0x4e054f4b -> :sswitch_d
        -0x4aae20af -> :sswitch_2
        -0x467de040 -> :sswitch_0
        -0x442a95a8 -> :sswitch_4
        -0x331219e1 -> :sswitch_e
        -0x2cb1ec28 -> :sswitch_7
        -0x13ff4ac6 -> :sswitch_7
        -0xceb9ed5 -> :sswitch_b
        -0xc28bbc9 -> :sswitch_c
        -0x9f45fd3 -> :sswitch_a
        -0x7f09e29 -> :sswitch_5
        0x5a99884 -> :sswitch_f
        0x17b31420 -> :sswitch_8
        0x1e30d367 -> :sswitch_4
        0x213af622 -> :sswitch_1
        0x2298c337 -> :sswitch_10
        0x2db3d0e4 -> :sswitch_a
        0x2f74130b -> :sswitch_9
        0x32f74fb6 -> :sswitch_b
        0x3698c6a9 -> :sswitch_c
        0x39bfa4e1 -> :sswitch_6
        0x3cb82d40 -> :sswitch_10
        0x4745b549 -> :sswitch_f
        0x48fbf38a -> :sswitch_9
        0x4baa3c22 -> :sswitch_3
        0x539af0e1 -> :sswitch_5
        0x54358977 -> :sswitch_1
        0x66623454 -> :sswitch_d
        0x6c71c5d0 -> :sswitch_11
        0x7701759b -> :sswitch_e
        0x7ef3923b -> :sswitch_3
    .end sparse-switch
.end method
