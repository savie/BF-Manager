.class public final Ll/ܶ᩵֫;
.super Ljava/lang/Object;
.source "L2RS"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ۙ:Ll/ܳ᩻;

.field public final synthetic ᩷:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Ll/ܳ᩻;Landroid/view/ViewGroup;)V
    .locals 6

    const v0, -0x4b113d85

    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    sget v2, Ll/᩺;->۫۬۫:I

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d0b

    const v5, 0x38860c4f

    xor-int/2addr v4, v5

    const v5, -0x769c5f25

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3f83

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 40
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_5

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x831

    const v5, -0x57f5a03c

    xor-int/2addr v4, v5

    const v5, 0x49bd54a1

    goto :goto_0

    .line 49
    :sswitch_1
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-lez v3, :cond_9

    goto/16 :goto_1

    .line 239
    :sswitch_2
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_3

    .line 300
    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 372
    :sswitch_5
    iput-object p2, p0, Ll/ܶ᩵֫;->᩷:Landroid/view/ViewGroup;

    return-void

    .line 330
    :sswitch_6
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x36a7

    const v5, 0x4d1c4c8e    # 1.6389142E8f

    xor-int/2addr v4, v5

    const v5, 0x19d901f8

    goto :goto_0

    .line 165
    :sswitch_7
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u073a\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1c27

    const v5, 0x1f170106

    xor-int/2addr v4, v5

    const v5, -0x11ea0dd9

    goto/16 :goto_0

    .line 95
    :sswitch_8
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u1a79\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4c17

    const v5, 0x29ed5911

    xor-int/2addr v4, v5

    const v5, -0x71ba5294

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v3, "\u1a76\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x101f

    const v5, -0x60acaaa7

    xor-int/2addr v4, v5

    const v5, -0x66cf2be3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a75\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x71d7

    const v5, 0x3e62517d

    xor-int/2addr v4, v5

    const v5, 0x148f5f58

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06da\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7737

    const v5, 0x2b34d06c

    xor-int/2addr v4, v5

    const v5, 0xfac760b

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06df\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2943

    const v5, -0x5aa7b8ba

    xor-int/2addr v4, v5

    const v5, 0x3c06ede8

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_8

    goto :goto_2

    :cond_8
    const-string v3, "\u06d7\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x441

    const v5, 0x348f9470

    xor-int/2addr v4, v5

    const v5, 0x549a85ea

    goto/16 :goto_0

    .line 196
    :sswitch_c
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u0730\u06e0"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x280b

    const v5, -0xf9210e7

    xor-int/2addr v4, v5

    const v5, 0x3560dd55

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2269

    const v5, -0x6af76e18

    xor-int/2addr v4, v5

    const v5, 0x8e1834e

    goto/16 :goto_0

    .line 227
    :sswitch_d
    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v3, :cond_b

    :goto_3
    const-string v3, "\u06da\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1399

    const v5, 0x7b7df38e

    xor-int/2addr v4, v5

    const v5, -0x7a4de737

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77ad

    const v5, -0x2593439a

    xor-int/2addr v4, v5

    const v5, 0x1197c9d4

    goto/16 :goto_0

    .line 372
    :sswitch_e
    iput-object p1, p0, Ll/ܶ᩵֫;->ۙ:Ll/ܳ᩻;

    .line 315
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u1a75\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3c7d

    const v5, 0x311f84c1

    xor-int/2addr v4, v5

    const v5, -0x1c042d76

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6a47

    const v5, 0x6f72b781

    xor-int/2addr v4, v5

    const v5, -0x29033ed5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x725bc6f0 -> :sswitch_7
        -0x7000b55a -> :sswitch_0
        -0x6c2c8c74 -> :sswitch_a
        -0x6a386486 -> :sswitch_9
        -0x67f6369c -> :sswitch_8
        -0x5f4fbf0e -> :sswitch_4
        -0x55adcd7b -> :sswitch_e
        -0x4c7ff669 -> :sswitch_e
        -0x4c00ada5 -> :sswitch_3
        -0x486b3c70 -> :sswitch_1
        -0x3b26221f -> :sswitch_6
        -0x2f10279b -> :sswitch_c
        -0x26e43047 -> :sswitch_0
        -0x1f7e7c5b -> :sswitch_d
        -0x11991cce -> :sswitch_3
        -0x42818ea -> :sswitch_7
        0xa70cb01 -> :sswitch_9
        0x24aec0b4 -> :sswitch_4
        0x292784a5 -> :sswitch_b
        0x2b360fa0 -> :sswitch_2
        0x2b5fe7f8 -> :sswitch_2
        0x2b742cd0 -> :sswitch_c
        0x362ca122 -> :sswitch_b
        0x422d6c23 -> :sswitch_8
        0x42881a35 -> :sswitch_5
        0x714a76f2 -> :sswitch_5
        0x731a6cd7 -> :sswitch_6
        0x735eda4c -> :sswitch_1
        0x7d19998c -> :sswitch_d
        0x7e5694de -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 8

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x3dd89ce3

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v5, "\u06e7\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x79d1

    const v7, 0x2fe1acca

    xor-int/2addr v6, v7

    const v7, 0x3c89b31d

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x3661

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 14
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    .line 24
    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-gez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u1a73\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x28b5

    const v7, -0x465c24dc

    xor-int/2addr v6, v7

    const v7, -0xb19c199

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06df\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3963

    const v7, 0x2e00788e

    xor-int/2addr v6, v7

    const v7, -0xe1ed2a4

    goto :goto_0

    .line 29
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v5, :cond_b

    goto/16 :goto_1

    .line 173
    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    goto/16 :goto_1

    .line 362
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    return-void

    :sswitch_5
    const/4 p1, 0x0

    .line 382
    invoke-virtual {v1, p1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    return-void

    .line 381
    :sswitch_6
    iget-object v1, p0, Ll/ܶ᩵֫;->᩷:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u1a76\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x451

    const v7, -0x4fe3fc68

    xor-int/2addr v6, v7

    const v7, 0x3b686146

    goto/16 :goto_0

    .line 380
    :sswitch_7
    iget-object v0, p0, Ll/ܶ᩵֫;->ۙ:Ll/ܳ᩻;

    invoke-virtual {v0, p1}, Ll/ܳ᩻;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 199
    sget v5, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v5, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v5, "\u06da\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xc31

    const v7, -0x265bead8

    xor-int/2addr v6, v7

    const v7, -0x57705e1c

    goto/16 :goto_0

    :sswitch_8
    const/4 p1, 0x0

    .line 46
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u06d9\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x77

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2481

    const v7, 0x27a6bd1

    xor-int/2addr v6, v7

    const v7, 0x5abb35c0

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06dc\u0736"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7fc5

    const v7, 0x760bcf54

    xor-int/2addr v6, v7

    const v7, 0x661723c3

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v5, :cond_6

    goto :goto_1

    :cond_6
    const-string v5, "\u1a76\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5089

    const v7, 0x79d92ec8

    xor-int/2addr v6, v7

    const v7, -0x30def67f

    goto/16 :goto_0

    :sswitch_a
    sget v5, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v5, :cond_7

    :goto_1
    const-string v5, "\u06e1\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2e53

    const v7, 0x6f02b423

    xor-int/2addr v6, v7

    const v7, 0x351a562c

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u0736\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x25

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x47af

    const v7, -0x5d0092e2

    xor-int/2addr v6, v7

    const v7, 0x40517641

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_8

    goto :goto_2

    :cond_8
    const-string v5, "\u0733\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6f85

    const v7, 0x77dc7f8

    xor-int/2addr v6, v7

    const v7, 0x648fc2c1

    goto/16 :goto_0

    .line 361
    :sswitch_c
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_9

    goto :goto_2

    :cond_9
    const-string v5, "\u06d9\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1bad

    const v7, 0x20523992

    xor-int/2addr v6, v7

    const v7, 0x39cd4c07

    goto/16 :goto_0

    .line 380
    :sswitch_d
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_a

    :goto_2
    const-string v5, "\u1a7b\u05ab"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x508b

    const v7, 0x48fe51ac    # 520845.38f

    xor-int/2addr v6, v7

    const v7, 0xc607f76

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e7\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5259

    const v7, 0x5f9184f

    xor-int/2addr v6, v7

    const v7, 0x2d73504c

    goto/16 :goto_0

    .line 17
    :sswitch_e
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u073f\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x586b

    const v7, -0x6cf930f8

    xor-int/2addr v6, v7

    const v7, 0x1b2e8e26

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05a8\u1a7a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5269

    const v7, -0x796825e1

    xor-int/2addr v6, v7

    const v7, -0x645b6c2

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b93d160 -> :sswitch_b
        -0x676da1f6 -> :sswitch_8
        -0x520b555a -> :sswitch_9
        -0x50fc7e9e -> :sswitch_1
        -0x3f3dd8e5 -> :sswitch_d
        -0x2abdb662 -> :sswitch_2
        -0x25eefd8e -> :sswitch_6
        -0xb9acb7f -> :sswitch_9
        -0x5df2eea -> :sswitch_1
        0x9d0326f -> :sswitch_c
        0xfb7e171 -> :sswitch_2
        0x11802e54 -> :sswitch_d
        0x13acd34f -> :sswitch_a
        0x15cb2b2b -> :sswitch_5
        0x1a516743 -> :sswitch_e
        0x1c906243 -> :sswitch_0
        0x1d6e2839 -> :sswitch_b
        0x1fc8e57d -> :sswitch_5
        0x266eb36a -> :sswitch_4
        0x28c0faf3 -> :sswitch_0
        0x33703e58 -> :sswitch_3
        0x395eff30 -> :sswitch_a
        0x44fa5f40 -> :sswitch_7
        0x4784f465 -> :sswitch_4
        0x5cbd8e49 -> :sswitch_6
        0x5d15ef8d -> :sswitch_7
        0x69c9c0b2 -> :sswitch_e
        0x6a015028 -> :sswitch_8
        0x6c14d773 -> :sswitch_3
        0x7e68b826 -> :sswitch_c
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
