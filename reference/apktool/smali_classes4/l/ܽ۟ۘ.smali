.class public final Ll/ܽ۟ۘ;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public ۙ:Z

.field public final synthetic ܰ:Lbin/mt/plus/Main;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 1312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۟ۘ;->ܰ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    const v0, -0x297392f5    # -7.719998E13f

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5a27

    const v5, -0x6dba415f

    xor-int/2addr v4, v5

    const v5, -0x61038ad2    # -2.6730002E-20f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6601

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1320
    iget-object v3, p0, Ll/ܽ۟ۘ;->ܰ:Lbin/mt/plus/Main;

    invoke-static {v3}, Lbin/mt/plus/Main;->᩶(Lbin/mt/plus/Main;)V

    .line 527
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget-boolean v3, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v3, :cond_8

    goto/16 :goto_4

    .line 1110
    :sswitch_2
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_c

    goto/16 :goto_2

    .line 1179
    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto :goto_2

    .line 1040
    :sswitch_4
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    return-void

    :sswitch_5
    const/4 v3, 0x1

    .line 1321
    iput-boolean v3, p0, Ll/ܽ۟ۘ;->ۙ:Z

    goto :goto_1

    :cond_0
    const-string v3, "\u1a78\u06df"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x76b9

    const v5, -0x309a661d

    xor-int/2addr v4, v5

    const v5, -0x6d2755c4

    goto :goto_0

    .line 1318
    :sswitch_6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v3

    const v4, 0x3f333333    # 0.7f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a77\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x752f

    const v5, 0x4643e4d7

    xor-int/2addr v4, v5

    const v5, 0x47c534fa

    goto :goto_0

    :sswitch_7
    return-void

    :sswitch_8
    iget-boolean v3, p0, Ll/ܽ۟ۘ;->ۙ:Z

    if-nez v3, :cond_2

    const-string v3, "\u06d9\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24df

    const v5, -0x70fc4c2c

    xor-int/2addr v4, v5

    const v5, -0x4e7126ef

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v3, "\u1a77\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x92b

    const v5, -0x5eb94ebc

    xor-int/2addr v4, v5

    const v5, -0x46116d8d

    goto/16 :goto_0

    .line 977
    :sswitch_9
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_3

    :goto_2
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2107

    const v5, 0x1359790e

    xor-int/2addr v4, v5

    const v5, 0x6d5f705b

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06da\u06e8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x64ab

    const v5, 0x5bbd3d88

    xor-int/2addr v4, v5

    const v5, -0x1a3bae01

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u1a7a\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4c79

    const v5, 0x5f62610f

    xor-int/2addr v4, v5

    const v5, 0x23e79373

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06da\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6e73

    const v5, 0x6c19bc06

    xor-int/2addr v4, v5

    const v5, -0x60002dcd

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c25

    const v5, -0x5b4f2880

    xor-int/2addr v4, v5

    const v5, -0x2a9b13a2

    goto/16 :goto_0

    .line 558
    :sswitch_d
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v3, "\u06e4\u06dc"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2ba9

    const v5, -0xbbb307f

    xor-int/2addr v4, v5

    const v5, 0x7c0772a2

    goto/16 :goto_0

    .line 1113
    :sswitch_e
    sget v3, Ll/۟;->ۨᩴۛ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1479

    const v5, 0x7e08ba8d

    xor-int/2addr v4, v5

    const v5, 0x5dfc3c6c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e4\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x40a5

    const v5, 0x4e1ba8cf    # 6.528829E8f

    xor-int/2addr v4, v5

    const v5, -0x4408cbdd

    goto/16 :goto_0

    .line 734
    :sswitch_f
    sget v3, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v3, :cond_b

    :cond_a
    const-string v3, "\u06d9\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3567

    const v5, 0x60c99da5

    xor-int/2addr v4, v5

    const v5, 0x3f5a60d3

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e8\u06da"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6c5b

    const v5, 0x741aae87

    xor-int/2addr v4, v5

    const v5, 0x4a0696e7    # 2205113.8f

    goto/16 :goto_0

    .line 325
    :sswitch_10
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_d

    :cond_c
    :goto_4
    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x12cd

    const v5, 0x2dbb35da

    xor-int/2addr v4, v5

    const v5, -0x51fe430b

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u05a8\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3863

    const v5, -0x5166328d

    xor-int/2addr v4, v5

    const v5, -0x1e9c1164

    goto/16 :goto_0

    :sswitch_11
    sget v3, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v3, :cond_e

    :goto_5
    const-string v3, "\u06e1\u06e1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c63

    const v5, -0x35b260bc    # -3368913.0f

    xor-int/2addr v4, v5

    const v5, -0x3a00af13

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06eb\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5893

    const v5, -0x6a557d4f

    xor-int/2addr v4, v5

    const v5, -0x3a6bc3db

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d86da4a -> :sswitch_a
        -0x6c5b9d38 -> :sswitch_5
        -0x537db8de -> :sswitch_8
        -0x531e92d3 -> :sswitch_3
        -0x523c7dc9 -> :sswitch_e
        -0x4bc7ba1e -> :sswitch_2
        -0x49509dab -> :sswitch_f
        -0x4816f007 -> :sswitch_b
        -0x45880e3a -> :sswitch_4
        -0x37d6cc36 -> :sswitch_0
        -0x357a61af -> :sswitch_2
        -0x2588572e -> :sswitch_3
        -0x18a51ac4 -> :sswitch_1
        -0x15f45aec -> :sswitch_f
        -0xbff3038 -> :sswitch_11
        -0x26713d7 -> :sswitch_10
        0x885e50c -> :sswitch_a
        0xdc2e075 -> :sswitch_9
        0x21265490 -> :sswitch_11
        0x25ff6aaa -> :sswitch_4
        0x26f4ec7c -> :sswitch_6
        0x2a781b69 -> :sswitch_1
        0x2c3f478a -> :sswitch_5
        0x33fe1781 -> :sswitch_7
        0x35416349 -> :sswitch_c
        0x35d0615c -> :sswitch_c
        0x35fa0fd3 -> :sswitch_10
        0x38029226 -> :sswitch_e
        0x3bf6676d -> :sswitch_d
        0x421eb653 -> :sswitch_b
        0x4ab1378e -> :sswitch_7
        0x4cbc7740 -> :sswitch_8
        0x6aa26491 -> :sswitch_9
        0x7c283d16 -> :sswitch_6
        0x7c42b44d -> :sswitch_d
        0x7f276cea -> :sswitch_0
    .end sparse-switch
.end method
