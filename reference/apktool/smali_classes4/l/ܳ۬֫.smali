.class public final Ll/ܳ۬֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ۙ:Landroid/graphics/Bitmap;

.field public final synthetic ۤ:Landroid/view/ViewGroup;

.field public final synthetic ᩷:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Bitmap;)V
    .locals 6

    const v0, 0x5c7ab837

    sget v1, Ll/ۘ֡;->᩹ܶ۬:I

    sget v2, Ll/֫۠;->ۢᩴ᩺:I

    .line 1336
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a75\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7671

    const v5, 0x11d73647

    xor-int/2addr v4, v5

    const v5, 0x29c5b0ca

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1cdd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v3, :cond_9

    goto/16 :goto_1

    .line 1294
    :sswitch_1
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    .line 263
    :sswitch_2
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a79\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3fa3

    const v5, 0x6df6fec

    xor-int/2addr v4, v5

    const v5, -0x30bfb317

    goto :goto_0

    .line 1251
    :sswitch_3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1336
    :sswitch_5
    iput-object p3, p0, Ll/ܳ۬֫;->ۙ:Landroid/graphics/Bitmap;

    return-void

    .line 1078
    :sswitch_6
    sget v3, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06df\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x295

    const v5, -0x4b6157b9

    xor-int/2addr v4, v5

    const v5, 0x334872fe

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4511

    const v5, 0x2926537c

    xor-int/2addr v4, v5

    const v5, 0x706a0bfa

    goto :goto_0

    .line 835
    :sswitch_8
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2c9f

    const v5, -0x1aed47a3

    xor-int/2addr v4, v5

    const v5, 0x24fdb5e

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0730\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7521

    const v5, -0x4ea29c11

    xor-int/2addr v4, v5

    const v5, 0x5faa6586

    goto/16 :goto_0

    .line 282
    :sswitch_9
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u0736\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2ded

    const v5, 0x6d4c6a5

    xor-int/2addr v4, v5

    const v5, -0x14dbda7c

    goto/16 :goto_0

    .line 1011
    :sswitch_a
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7933

    const v5, -0x1c3e20b4

    xor-int/2addr v4, v5

    const v5, -0x2b6309a9

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a7a\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x590b

    const v5, -0xe1afda4

    xor-int/2addr v4, v5

    const v5, -0x5c746bb2

    goto/16 :goto_0

    .line 115
    :sswitch_c
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_8

    goto :goto_2

    :cond_8
    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x214d

    const v5, -0x11a84efb

    xor-int/2addr v4, v5

    const v5, 0x54045a33

    goto/16 :goto_0

    .line 794
    :sswitch_d
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x9af

    const v5, -0x4eb61b35

    xor-int/2addr v4, v5

    const v5, 0x4570dff9

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x15e5

    const v5, 0x35599162

    xor-int/2addr v4, v5

    const v5, -0x70c9b5ac

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3f63

    const v5, -0x44970001

    xor-int/2addr v4, v5

    const v5, 0x21716b6c

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u0736\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d79

    const v5, 0x59ee1ea8

    xor-int/2addr v4, v5

    const v5, 0x29be7439

    goto/16 :goto_0

    .line 1336
    :sswitch_e
    iput-object p1, p0, Ll/ܳ۬֫;->ۤ:Landroid/view/ViewGroup;

    iput-object p2, p0, Ll/ܳ۬֫;->᩷:Landroid/view/View;

    .line 992
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u073a\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1839

    const v5, -0x7d08e91d

    xor-int/2addr v4, v5

    const v5, -0x423e3fab

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e1\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7e13

    const v5, -0x1a584f04

    xor-int/2addr v4, v5

    const v5, 0x15db0988

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e1f7e93 -> :sswitch_5
        -0x5dbeef7f -> :sswitch_9
        -0x52d7948b -> :sswitch_2
        -0x46db701d -> :sswitch_5
        -0x27f3defb -> :sswitch_c
        -0x17feab4b -> :sswitch_a
        -0xd2c971d -> :sswitch_8
        0x17990cdf -> :sswitch_b
        0x2024bffc -> :sswitch_1
        0x29182ab9 -> :sswitch_e
        0x2a7fb227 -> :sswitch_3
        0x308cb25b -> :sswitch_1
        0x3ef5ffeb -> :sswitch_0
        0x405ca4be -> :sswitch_6
        0x40c4e908 -> :sswitch_b
        0x42129e66 -> :sswitch_a
        0x424ad8d3 -> :sswitch_3
        0x468ab707 -> :sswitch_4
        0x487889aa -> :sswitch_2
        0x491ff463 -> :sswitch_7
        0x4b8e1fac -> :sswitch_6
        0x4ce929ad -> :sswitch_9
        0x62d30225 -> :sswitch_4
        0x638ae431 -> :sswitch_d
        0x6703e38b -> :sswitch_e
        0x6bc1812b -> :sswitch_d
        0x752b1f00 -> :sswitch_0
        0x77dcd586 -> :sswitch_7
        0x786c3944 -> :sswitch_c
        0x7b046344 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, 0x4ed4baa

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    sget v3, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v4, "\u06e4\u06d7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3f81

    const v6, -0x2341b9bd    # -4.2846E17f

    xor-int/2addr v5, v6

    const v6, 0x11fcb55f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x1bc7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 675
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_6

    goto/16 :goto_1

    .line 419
    :sswitch_0
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-gez v4, :cond_9

    goto/16 :goto_1

    :sswitch_1
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v4, :cond_7

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    .line 906
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto/16 :goto_4

    .line 245
    :sswitch_4
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    return-void

    .line 1344
    :sswitch_5
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1345
    iget-object p1, p0, Ll/ܳ۬֫;->ۙ:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-void

    .line 1344
    :sswitch_6
    iget-object v0, p0, Ll/ܳ۬֫;->᩷:Landroid/view/View;

    .line 493
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06d6\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2d49

    const v6, 0x62301e86

    xor-int/2addr v5, v6

    const v6, -0x246fe5f7

    goto :goto_0

    .line 1344
    :sswitch_7
    iget-object p1, p0, Ll/ܳ۬֫;->ۤ:Landroid/view/ViewGroup;

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v4

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a7a\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x325d

    const v6, -0x2a7bba48

    xor-int/2addr v5, v6

    const v6, 0x4aca6fbb    # 6633437.5f

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u05a8\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5c69

    const v6, -0x337fd10c    # -6.720502E7f

    xor-int/2addr v5, v6

    const v6, -0x10b62c22

    goto/16 :goto_0

    .line 181
    :sswitch_9
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06e7\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1133

    const v6, -0x4200292b

    xor-int/2addr v5, v6

    const v6, -0x40decc15

    goto/16 :goto_0

    .line 1222
    :sswitch_a
    sget v4, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v4, :cond_4

    goto :goto_2

    :cond_4
    const-string v4, "\u05ab\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ecf

    const v6, -0x6c7f7123

    xor-int/2addr v5, v6

    const v6, -0x7f7d4ed5

    goto/16 :goto_0

    :cond_5
    :goto_1
    const-string v4, "\u06da\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6d61

    const v6, -0x2a270d48

    xor-int/2addr v5, v6

    const v6, -0x3473cb83    # -1.8376954E7f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e7\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e91

    const v6, 0x141a21f0

    xor-int/2addr v5, v6

    const v6, 0x3b4b67e6

    goto/16 :goto_0

    .line 710
    :sswitch_b
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u1a79\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6217

    const v6, 0x462b7ae

    xor-int/2addr v5, v6

    const v6, 0x7f8c8a16

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0730\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7a2f

    const v6, 0x13f1819d

    xor-int/2addr v5, v6

    const v6, 0xa134a03

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v4, :cond_a

    :cond_9
    const-string v4, "\u1a7b\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x38d1

    const v6, -0x4d6a94f4

    xor-int/2addr v5, v6

    const v6, -0x587d05df

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e0\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x33bd

    const v6, 0x15ed90ff

    xor-int/2addr v5, v6

    const v6, 0xa79b2fb

    goto/16 :goto_0

    .line 777
    :sswitch_d
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_b

    :goto_3
    const-string v4, "\u1a78\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3f7d

    const v6, -0x6b8eee3

    xor-int/2addr v5, v6

    const v6, 0x63a2ce7

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06eb\u1a75"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7337

    const v6, 0x5256fee4

    xor-int/2addr v5, v6

    const v6, -0x6af84fc5

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_c

    :goto_4
    const-string v4, "\u1a78\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7e1d

    const v6, 0x2304ed0d

    xor-int/2addr v5, v6

    const v6, 0x73cb27f6

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06eb\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4de9

    const v6, 0x5a1dac92

    xor-int/2addr v5, v6

    const v6, -0x22352f2a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79280100 -> :sswitch_e
        -0x6eed0a35 -> :sswitch_0
        -0x65e69f69 -> :sswitch_b
        -0x62113eae -> :sswitch_2
        -0x5eebfcdd -> :sswitch_6
        -0x544ea88d -> :sswitch_1
        -0x53b074bd -> :sswitch_4
        -0x539fd307 -> :sswitch_a
        -0x41b21649 -> :sswitch_3
        -0x1ec5e03e -> :sswitch_8
        -0x1b1c7556 -> :sswitch_4
        -0x19804f90 -> :sswitch_6
        -0x13d7c91e -> :sswitch_9
        -0x101047f3 -> :sswitch_2
        -0x705f475 -> :sswitch_d
        0xc3c203e -> :sswitch_d
        0x10e27293 -> :sswitch_9
        0x11212ca8 -> :sswitch_b
        0x11b9cb1a -> :sswitch_0
        0x1fec69f6 -> :sswitch_a
        0x2f260a9f -> :sswitch_c
        0x2f41e1df -> :sswitch_8
        0x30aa5680 -> :sswitch_1
        0x4bbe89fc -> :sswitch_7
        0x4cbb5701 -> :sswitch_5
        0x5ad50101 -> :sswitch_c
        0x5bece64e -> :sswitch_3
        0x610e0edf -> :sswitch_5
        0x68f4a50c -> :sswitch_e
        0x7862f379 -> :sswitch_7
    .end sparse-switch
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
