.class public final Ll/ᩴ۬֫;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public ۙ:Z

.field public final synthetic ᩷:Lbin/mt/plus/Main;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 1324
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۬֫;->᩷:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    const v0, 0x360cf6c4

    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    const-string v3, "\u073f\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x11b7

    const v5, 0x4e552885    # 8.940506E8f

    xor-int/2addr v4, v5

    const v5, 0x6e2bb7a6

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x3ef1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v3, :cond_7

    goto/16 :goto_3

    .line 844
    :sswitch_0
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v3, :cond_8

    goto/16 :goto_3

    .line 1154
    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    .line 600
    :sswitch_2
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_d

    goto/16 :goto_2

    .line 552
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    return-void

    :sswitch_5
    const/4 v3, 0x1

    .line 1333
    iput-boolean v3, p0, Ll/ᩴ۬֫;->ۙ:Z

    goto :goto_1

    .line 1332
    :sswitch_6
    iget-object v3, p0, Ll/ᩴ۬֫;->᩷:Lbin/mt/plus/Main;

    invoke-static {v3}, Lbin/mt/plus/Main;->ܿ(Lbin/mt/plus/Main;)V

    .line 1211
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u0730\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x450f

    const v5, 0x1a7402e4

    xor-int/2addr v4, v5

    const v5, 0x406db76d

    goto :goto_0

    .line 1330
    :sswitch_7
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v3

    const v4, 0x3f333333    # 0.7f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4065

    const v5, 0x70ac3398

    xor-int/2addr v4, v5

    const v5, -0x3627e4cc

    goto :goto_0

    :sswitch_8
    return-void

    :sswitch_9
    iget-boolean v3, p0, Ll/ᩴ۬֫;->ۙ:Z

    if-nez v3, :cond_2

    const-string v3, "\u0736\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4c67

    const v5, -0x2f5ce6c

    xor-int/2addr v4, v5

    const v5, -0x2c6de395    # -1.255084E12f

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v3, "\u05ab\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6185

    const v5, 0x17956940

    xor-int/2addr v4, v5

    const v5, 0x5ff6006

    goto/16 :goto_0

    .line 945
    :sswitch_a
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06dc\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39d1

    const v5, -0x19663117

    xor-int/2addr v4, v5

    const v5, -0x28b60d19

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u05a1\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7fd

    const v5, -0x53f95017

    xor-int/2addr v4, v5

    const v5, 0x68fe822a

    goto/16 :goto_0

    .line 1185
    :sswitch_c
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_5

    :goto_2
    const-string v3, "\u073a\u06da"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6e59

    const v5, 0x4e360565    # 7.634517E8f

    xor-int/2addr v4, v5

    const v5, 0x4aef1100    # 7833728.0f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a74\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c7

    const v5, 0x2c33893b

    xor-int/2addr v4, v5

    const v5, -0x7df59c16

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x44ad

    const v5, 0x236f4de5

    xor-int/2addr v4, v5

    const v5, 0x7ad46dd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e0\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4e01

    const v5, -0x5c407bcc

    xor-int/2addr v4, v5

    const v5, -0x2c412910

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    const-string v3, "\u06df\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ab3

    const v5, 0x938267d

    xor-int/2addr v4, v5

    const v5, -0x74b50d57

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06df\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x331d

    const v5, -0x12d6ae69

    xor-int/2addr v4, v5

    const v5, 0x2065b39a

    goto/16 :goto_0

    .line 1263
    :sswitch_e
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u1a76\u073d"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1981

    const v5, -0x702ae084

    xor-int/2addr v4, v5

    const v5, -0x6df6fe7

    goto/16 :goto_0

    :sswitch_f
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u1a77\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3ad7

    const v5, 0x1784cb2f

    xor-int/2addr v4, v5

    const v5, 0x7538ab6a

    goto/16 :goto_0

    .line 976
    :sswitch_10
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u1a74\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x5f

    const v5, 0x20265ca2

    xor-int/2addr v4, v5

    const v5, -0x39213c3

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e0\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4faf

    const v5, -0x3c35e974

    xor-int/2addr v4, v5

    const v5, -0x363e9781

    goto/16 :goto_0

    .line 248
    :sswitch_11
    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v3, :cond_e

    :cond_d
    :goto_5
    const-string v3, "\u1a7b\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2c2b

    const v5, 0x70c063

    xor-int/2addr v4, v5

    const v5, -0x160fa594

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06db\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4079

    const v5, 0x54e357a8

    xor-int/2addr v4, v5

    const v5, -0xaed1fae

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e50ac38 -> :sswitch_f
        -0x7b18787e -> :sswitch_8
        -0x6f79f501 -> :sswitch_2
        -0x6c4616ae -> :sswitch_9
        -0x683c30ca -> :sswitch_10
        -0x642f2127 -> :sswitch_c
        -0x5d099ee1 -> :sswitch_e
        -0x4eb2b3de -> :sswitch_d
        -0x4bffce94 -> :sswitch_0
        -0x47227254 -> :sswitch_1
        -0x3ba2f22b -> :sswitch_7
        -0x350b2f37 -> :sswitch_4
        -0x2fbc4924 -> :sswitch_2
        -0x2d047eea -> :sswitch_c
        -0x2ae6572d -> :sswitch_3
        -0x28b927f5 -> :sswitch_5
        -0x1fc71c2b -> :sswitch_5
        -0x12194107 -> :sswitch_6
        -0xc78c88b -> :sswitch_b
        -0x6ff39fd -> :sswitch_11
        0x281105c -> :sswitch_4
        0x12af3706 -> :sswitch_a
        0x1368a801 -> :sswitch_e
        0x1522cf2d -> :sswitch_b
        0x1c61b8be -> :sswitch_1
        0x4062bf4b -> :sswitch_9
        0x4369a7ac -> :sswitch_10
        0x44b96c8e -> :sswitch_7
        0x49fff1ef -> :sswitch_a
        0x4f306ead -> :sswitch_0
        0x58b5b1cc -> :sswitch_3
        0x613fc7c9 -> :sswitch_d
        0x6351c4b1 -> :sswitch_f
        0x691f3aa4 -> :sswitch_6
        0x6fd8f66e -> :sswitch_8
        0x711fe5a7 -> :sswitch_11
    .end sparse-switch
.end method
