.class public final Ll/ܰۡۤ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ܰ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩶ۡۤ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x25ccc976

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    .line 751
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06e4\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x769d

    const v6, 0x3a1e7c53

    xor-int/2addr v5, v6

    const v6, -0x4299066f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x76ff

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 534
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_1

    .line 622
    :sswitch_0
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-gez v4, :cond_1

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v4, :cond_b

    goto/16 :goto_2

    .line 116
    :sswitch_2
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_6

    goto/16 :goto_1

    .line 158
    :sswitch_3
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    goto/16 :goto_1

    .line 630
    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 752
    :sswitch_5
    iput-object v0, p0, Ll/ܰۡۤ;->ܰ:Ljava/lang/ref/WeakReference;

    return-void

    :sswitch_6
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_0

    const-string v4, "\u1a77\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6963

    const v6, 0x31edbd2d

    xor-int/2addr v5, v6

    const v6, 0x45295c6

    goto :goto_0

    :cond_0
    const-string v4, "\u073a\u06db"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7bd9

    const v6, -0x7b7e04d9

    xor-int/2addr v5, v6

    const v6, 0x26bf2a63

    goto :goto_0

    .line 658
    :sswitch_7
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_2

    :cond_1
    const-string v4, "\u1a76\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x556b

    const v6, 0x13d4291f

    xor-int/2addr v5, v6

    const v6, 0x3594f7c9

    goto :goto_0

    :cond_2
    const-string v4, "\u1a75\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6187

    const v6, -0x4e436396

    xor-int/2addr v5, v6

    const v6, -0x1c4f75c2

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06dc\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x404f

    const v6, 0x1c45cbdb

    xor-int/2addr v5, v6

    const v6, 0x609fe070

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u1a74\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7459

    const v6, -0x7119b118

    xor-int/2addr v5, v6

    const v6, 0x5c10f6fc

    goto/16 :goto_0

    .line 435
    :sswitch_9
    sget v4, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v4, :cond_5

    :goto_1
    const-string v4, "\u06e1\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3e1d

    const v6, 0x7873659e

    xor-int/2addr v5, v6

    const v6, 0x129cd1be

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u073a\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2dcd

    const v6, -0x5b85447b

    xor-int/2addr v5, v6

    const v6, -0x15a210e3

    goto/16 :goto_0

    .line 573
    :sswitch_a
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_7

    :cond_6
    :goto_2
    const-string v4, "\u073f\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2f7d

    const v6, -0x72088b33

    xor-int/2addr v5, v6

    const v6, 0x1a6a79e6

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06df\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7fa7

    const v6, -0x694ae428

    xor-int/2addr v5, v6

    const v6, -0x51103920

    goto/16 :goto_0

    .line 656
    :sswitch_b
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u1a76\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ad9

    const v6, 0x57c68533

    xor-int/2addr v5, v6

    const v6, -0x14d8ed65

    goto/16 :goto_0

    .line 355
    :sswitch_c
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "\u05a1\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1c53

    const v6, -0xdb114b8

    xor-int/2addr v5, v6

    const v6, 0x900d8da

    goto/16 :goto_0

    .line 65
    :sswitch_d
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_a

    goto :goto_3

    :cond_a
    const-string v4, "\u06e1\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x648d

    const v6, -0x487817c9

    xor-int/2addr v5, v6

    const v6, -0x17c74b2

    goto/16 :goto_0

    .line 752
    :sswitch_e
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 568
    sget v4, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u05a1\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x417

    const v6, 0x1e72c586

    xor-int/2addr v5, v6

    const v6, 0x6ea627f8

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e1b

    const v6, 0x24c38774

    xor-int/2addr v5, v6

    const v6, -0x4776c4d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6cd92a67 -> :sswitch_4
        -0x6a6cf9f1 -> :sswitch_9
        -0x5d465f1c -> :sswitch_7
        -0x5210a954 -> :sswitch_3
        -0x4c88d941 -> :sswitch_4
        -0x380e3ba9 -> :sswitch_e
        -0x35026e5e -> :sswitch_c
        -0x32f8cb01 -> :sswitch_6
        -0x2b87049e -> :sswitch_9
        -0x271e7f17 -> :sswitch_b
        -0x256e4203 -> :sswitch_5
        -0x1516a1fc -> :sswitch_1
        -0xf55d7e9 -> :sswitch_7
        0x2037a88 -> :sswitch_3
        0xdb551fe -> :sswitch_0
        0x11b65ff2 -> :sswitch_d
        0x1431726c -> :sswitch_2
        0x1dd55dcc -> :sswitch_d
        0x21fdf4c9 -> :sswitch_c
        0x243caa4d -> :sswitch_1
        0x345ab98e -> :sswitch_a
        0x352399d0 -> :sswitch_8
        0x3ae1c1f7 -> :sswitch_a
        0x3c9094a3 -> :sswitch_5
        0x3ccd54a1 -> :sswitch_6
        0x49ef6236 -> :sswitch_b
        0x7490304f -> :sswitch_e
        0x7aab2649 -> :sswitch_2
        0x7af657b3 -> :sswitch_8
        0x7ec64e64 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x2f7f1067

    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    const-string v5, "\u06df\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5465

    const v7, -0x524e5a9a

    xor-int/2addr v6, v7

    const v7, 0x5fd990b6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x1b0f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v5

    if-gtz v5, :cond_b

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v5

    if-eqz v5, :cond_c

    goto/16 :goto_3

    .line 482
    :sswitch_1
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v5

    if-eqz v5, :cond_9

    goto/16 :goto_2

    .line 701
    :sswitch_2
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u1a76\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x18e1

    const v7, 0x604a4597

    xor-int/2addr v6, v7

    const v7, 0x182f0d8e

    goto :goto_0

    .line 508
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_2

    .line 290
    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    return-void

    .line 759
    :sswitch_5
    invoke-static {v1}, Ll/᩶ۡۤ;->ۚ(Ll/᩶ۡۤ;)V

    goto :goto_1

    :sswitch_6
    return-void

    .line 757
    :sswitch_7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۡۤ;

    if-eqz v1, :cond_1

    const-string v5, "\u06eb\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2e15

    const v7, 0x484abba3

    xor-int/2addr v6, v7

    const v7, -0x206b88ad

    goto :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u06d6\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x783f

    const v7, 0x941ebad

    xor-int/2addr v6, v7

    const v7, -0x3300d9ac

    goto/16 :goto_0

    .line 488
    :sswitch_8
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u05a8\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x159d

    const v7, 0x749e43f6

    xor-int/2addr v6, v7

    const v7, 0x44857009

    goto/16 :goto_0

    .line 289
    :sswitch_9
    sget v5, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06da\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4567

    const v7, 0x21c4d495

    xor-int/2addr v6, v7

    const v7, 0x34566947

    goto/16 :goto_0

    .line 557
    :sswitch_a
    sget v5, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u06e4\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7ef1

    const v7, 0x262fd03

    xor-int/2addr v6, v7

    const v7, 0xbdd1793

    goto/16 :goto_0

    .line 8
    :sswitch_b
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u06d7\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x626f

    const v7, -0x11a8f3e7

    xor-int/2addr v6, v7

    const v7, -0x47229959

    goto/16 :goto_0

    .line 416
    :sswitch_c
    sget v5, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v5, :cond_6

    :goto_2
    const-string v5, "\u06d6\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x43e7

    const v7, 0xf5a1d08

    xor-int/2addr v6, v7

    const v7, -0x275f485f

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06eb\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1b01

    const v7, 0x6ab417d0

    xor-int/2addr v6, v7

    const v7, 0x28fb9e2d

    goto/16 :goto_0

    .line 645
    :sswitch_d
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v5, "\u073f\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5f1b

    const v7, 0x2c250697

    xor-int/2addr v6, v7

    const v7, 0x6907d7bc

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u0730\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1a05

    const v7, 0x3fe3eef9

    xor-int/2addr v6, v7

    const v7, -0x55131157

    goto/16 :goto_0

    .line 131
    :sswitch_f
    sget v5, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u05a1\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7271

    const v7, 0x2f9260a4

    xor-int/2addr v6, v7

    const v7, 0x4d5c7c2e    # 2.3119536E8f

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06ec\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7813

    const v7, -0x1a4878e0

    xor-int/2addr v6, v7

    const v7, 0xc5d9494

    goto/16 :goto_0

    :goto_4
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x452b

    const v7, 0x555ed0dd

    xor-int/2addr v6, v7

    const v7, -0x658aab6

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u0733\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2bd9

    const v7, -0x41b7d9cc

    xor-int/2addr v6, v7

    const v7, 0x3038e0a5

    goto/16 :goto_0

    .line 757
    :sswitch_10
    iget-object v0, p0, Ll/ܰۡۤ;->ܰ:Ljava/lang/ref/WeakReference;

    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u06da\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3a11

    const v7, 0x351365eb

    xor-int/2addr v6, v7

    const v7, 0xb2442b

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a73\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c19

    const v7, -0x4426f2f2

    xor-int/2addr v6, v7

    const v7, 0x41a975f8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7286e590 -> :sswitch_0
        -0x71638aba -> :sswitch_0
        -0x6d89acbe -> :sswitch_6
        -0x59d5bf92 -> :sswitch_1
        -0x47dea3b4 -> :sswitch_6
        -0x31bd0219 -> :sswitch_a
        -0x2cddd295 -> :sswitch_e
        -0x24c943d5 -> :sswitch_c
        -0x2484c57e -> :sswitch_3
        -0x1de2e619 -> :sswitch_7
        -0x1bd50d14 -> :sswitch_3
        -0x6be6bec -> :sswitch_10
        0x3a5155a -> :sswitch_c
        0xc74c894 -> :sswitch_d
        0x19a9e706 -> :sswitch_f
        0x20c3117f -> :sswitch_8
        0x242ad305 -> :sswitch_8
        0x31af9c85 -> :sswitch_9
        0x39825d0f -> :sswitch_2
        0x3b285483 -> :sswitch_5
        0x3f07e086 -> :sswitch_b
        0x41b05f68 -> :sswitch_b
        0x44e692d8 -> :sswitch_f
        0x49af3315 -> :sswitch_10
        0x4b96e76e -> :sswitch_4
        0x5ed5b28a -> :sswitch_7
        0x5f180da0 -> :sswitch_a
        0x60640e79 -> :sswitch_1
        0x6a49d85c -> :sswitch_4
        0x7883dd2a -> :sswitch_e
        0x788a6411 -> :sswitch_2
        0x790c58c3 -> :sswitch_5
        0x7aeb4539 -> :sswitch_d
        0x7f035f31 -> :sswitch_9
    .end sparse-switch
.end method
