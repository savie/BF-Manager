.class public final synthetic Ll/ۙۚۘ;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ܺ:Ll/᩹ۚۘ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۚۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙۚۘ;->ܺ:Ll/᩹ۚۘ;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const p1, -0x11aaacda

    sget v0, Ll/ۖܽ;->ܳ۠᩹:I

    sget v1, Ll/֨᩹;->᩻ᩳ֨:I

    const-string v2, "\u1a73\u05ab"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5e51

    const v4, 0x7ea56881

    xor-int/2addr v3, v4

    const v4, -0x398d7c91

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x2f31

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 0
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v2

    if-ltz v2, :cond_4

    goto/16 :goto_2

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    sget v2, Ll/֫ۚ;->ܽ۠᩹:I

    if-gez v2, :cond_8

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v2, :cond_6

    goto/16 :goto_4

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    goto/16 :goto_4

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ۙۚۘ;->ܺ:Ll/᩹ۚۘ;

    invoke-static {p1, p2}, Ll/᩹ۚۘ;->ۙ(Ll/᩹ۚۘ;Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 1
    :sswitch_6
    sget v2, Ll/ۘ֡;->ܰ֡ܽ:I

    if-ltz v2, :cond_0

    const-string v2, "\u06da\u06d6"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x15

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5b27

    const v4, 0x7ba2d157

    xor-int/2addr v3, v4

    const v4, -0x1b5d664b

    goto :goto_0

    :cond_0
    const-string v2, "\u06df\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x4b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x167

    const v4, 0x2d173494

    xor-int/2addr v3, v4

    const v4, 0x60206b2c

    goto :goto_0

    :sswitch_7
    sget v2, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v2, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v2, "\u06d9\u06d7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x58d3

    const v4, -0x16421289

    xor-int/2addr v3, v4

    const v4, 0x2264aee9

    goto/16 :goto_0

    :sswitch_8
    sget v2, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v2, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v2, "\u073f\u1a73"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x17

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x4d0b

    const v4, 0x6dec7ede

    xor-int/2addr v3, v4

    const v4, 0x2de0e5c5

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    move-result v2

    if-ltz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, "\u06d6\u06e1"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3281

    const v4, -0x42d2921e

    xor-int/2addr v3, v4

    const v4, 0x63f5cb4c

    goto/16 :goto_0

    :cond_4
    const-string v2, "\u0736\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x17f9

    const v4, 0x5a7c42b0

    xor-int/2addr v3, v4

    const v4, -0x4886efb1

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget-boolean v2, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, "\u05a1\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4865

    const v4, 0x1cc805b7

    xor-int/2addr v3, v4

    const v4, -0xf32638d

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v2, :cond_7

    :cond_6
    :goto_2
    const-string v2, "\u06d9\u1a7a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x534b

    const v4, 0x23135f5

    xor-int/2addr v3, v4

    const v4, 0x107a70e7

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u05a8\u06e1"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5cab

    const v4, -0x7d8ea5e

    xor-int/2addr v3, v4

    const v4, 0x51440c0b

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v2

    if-eqz v2, :cond_9

    :cond_8
    :goto_3
    const-string v2, "\u06e7\u0733"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x7f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x5a3d

    const v4, 0x7bb3a6fb

    xor-int/2addr v3, v4

    const v4, -0x25a9d738

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06db\u06e7"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x5b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x7831

    const v4, -0x4805b99c

    xor-int/2addr v3, v4

    const v4, 0x45c43e40    # 6279.7812f

    goto/16 :goto_0

    :sswitch_d
    sget v2, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz v2, :cond_a

    :goto_4
    const-string v2, "\u05ab\u1a78"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x3f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x50b1

    const v4, -0x1bba333a

    xor-int/2addr v3, v4

    const v4, -0x3e797a2e

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06d9\u06e7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x795b

    const v4, -0x74ee541b

    xor-int/2addr v3, v4

    const v4, -0x460455cd

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    :goto_5
    const-string v2, "\u06dc\u1a78"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x51f1

    const v4, 0x4d46752b    # 2.0809797E8f

    xor-int/2addr v3, v4

    const v4, 0x1f5eac1e

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u073a\u06e0"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x9

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x26df

    const v4, -0x12be53e4

    xor-int/2addr v3, v4

    const v4, 0xda1dae0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6d11bb20 -> :sswitch_c
        -0x6d079ddf -> :sswitch_d
        -0x6c6df01a -> :sswitch_0
        -0x63933c39 -> :sswitch_9
        -0x5bef71fe -> :sswitch_4
        -0x51d130d5 -> :sswitch_3
        -0x29560ac8 -> :sswitch_2
        -0x294e5ff2 -> :sswitch_4
        -0x18f577b2 -> :sswitch_0
        -0x129b70f6 -> :sswitch_e
        -0xaeee0d8 -> :sswitch_c
        -0x4fe7651 -> :sswitch_7
        -0x1604cf4 -> :sswitch_7
        -0xd12139 -> :sswitch_a
        0xc53938 -> :sswitch_2
        0x1f8b184 -> :sswitch_e
        0xfe1e41c -> :sswitch_3
        0x11d9595c -> :sswitch_d
        0x2113e889 -> :sswitch_b
        0x22ed5c6a -> :sswitch_5
        0x36128d55 -> :sswitch_9
        0x4081ca63 -> :sswitch_1
        0x48e0247a -> :sswitch_8
        0x5ec7c56c -> :sswitch_8
        0x6211bcc3 -> :sswitch_5
        0x643766b4 -> :sswitch_6
        0x7034f926 -> :sswitch_6
        0x799667d2 -> :sswitch_b
        0x7a518fcf -> :sswitch_a
        0x7a5a5661 -> :sswitch_1
    .end sparse-switch
.end method
