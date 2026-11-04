.class public final synthetic Ll/ۨۙۧ;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic ܰ:Ll/ۚ᩷ۧ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ᩷ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۙۧ;->ܰ:Ll/ۚ᩷ۧ;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x4f0b7e1d

    sget v7, Ll/ۘܽ;->᩹ۧۚ:I

    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    const-string v9, "\u1a79\u073f"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x79

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x60f5

    const v11, -0x59fb15d6

    xor-int/2addr v10, v11

    const v11, 0x7418d7ae

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x44f7

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    const/4 v5, 0x2

    sget v9, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v9, :cond_0

    goto/16 :goto_2

    :sswitch_0
    sget v9, Ll/ۧ;->ۨۗܰ:I

    if-gez v9, :cond_7

    goto/16 :goto_4

    .line 209
    :sswitch_1
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v9

    if-nez v9, :cond_b

    goto :goto_1

    .line 269
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget v9, Ll/᩺;->۫۬۫:I

    if-gtz v9, :cond_9

    goto :goto_1

    .line 52
    :sswitch_3
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    :goto_1
    const-string v9, "\u06da\u06e2"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x6f

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2eb7

    const v11, -0x460a3252

    xor-int/2addr v10, v11

    const v11, 0x68652ae4

    goto :goto_0

    .line 265
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    return-void

    .line 491
    :sswitch_5
    invoke-virtual {v4, v5}, Landroid/view/Window;->clearFlags(I)V

    .line 492
    invoke-static {v0}, Ll/ۖ֡;->ۧ᩷ܶ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void

    :cond_0
    const-string v9, "\u06e7\u1a75"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0xc49

    const v11, 0xbff55c1

    xor-int/2addr v10, v11

    const v11, -0x2f318d39

    goto :goto_0

    .line 490
    :sswitch_6
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 491
    invoke-static {v0}, Ll/ۖ֡;->ۧ᩷ܶ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v4

    .line 187
    sget v9, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v9, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v9, "\u073f\u1a7b"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x3d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x359

    const v11, 0x9a0760b

    xor-int/2addr v10, v11

    const v11, 0x726518b3

    goto/16 :goto_0

    .line 489
    :sswitch_7
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    sget v9, Ll/ۖ;->ܿۚ֡:I

    if-ltz v9, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v9, "\u06ec\u0736"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x2e7

    const v11, 0xa59ca21

    xor-int/2addr v10, v11

    const v11, 0x6fe78e78

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v0}, Ll/ۖ֡;->ۧ᩷ܶ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v1

    .line 75
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v9

    if-gtz v9, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v9, "\u1a73\u06eb"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x3d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5d21

    const v11, 0x5eede0cb

    xor-int/2addr v10, v11

    const v11, -0x8b69a32

    goto/16 :goto_0

    .line 489
    :sswitch_9
    iget-object v0, p0, Ll/ۨۙۧ;->ܰ:Ll/ۚ᩷ۧ;

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    const-string v9, "\u06e1\u05a1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x6d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x7c67

    const v11, -0x2dd13313

    xor-int/2addr v10, v11

    const v11, -0x3f670f01

    goto/16 :goto_0

    :sswitch_a
    sget v9, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v9, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v9, "\u1a79\u1a77"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x25

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x133f

    const v11, -0x7b3fb496

    xor-int/2addr v10, v11

    const v11, -0x5cba2662

    goto/16 :goto_0

    .line 365
    :sswitch_b
    sget-boolean v9, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v9, :cond_6

    :goto_2
    const-string v9, "\u05ab\u073d"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x489f

    const v11, 0x56bb3de1

    xor-int/2addr v10, v11

    const v11, 0x3fd77501

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u1a76\u0730"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x51

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6605

    const v11, -0x2fb59d

    xor-int/2addr v10, v11

    const v11, -0x24f9414b

    goto/16 :goto_0

    .line 70
    :sswitch_c
    sget v9, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v9, :cond_8

    :cond_7
    const-string v9, "\u1a76\u06e4"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0xf35

    const v11, -0x5dfd5593

    xor-int/2addr v10, v11

    const v11, -0x7c303851

    goto/16 :goto_0

    :cond_8
    const-string v9, "\u06e7\u06d6"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x73

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x64e1

    const v11, 0x4831aae5

    xor-int/2addr v10, v11

    const v11, 0x6fcacc4a

    goto/16 :goto_0

    .line 146
    :sswitch_d
    sget-boolean v9, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v9, :cond_a

    :cond_9
    :goto_3
    const-string v9, "\u06e7\u1a7a"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x5f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3537

    const v11, -0x63db7daa

    xor-int/2addr v10, v11

    const v11, 0x85d7330

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u06db\u1a7a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x3b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5a51

    const v11, -0x6e1384ab

    xor-int/2addr v10, v11

    const v11, 0x35a49ff8

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v9, Ll/ۚ᩷ۧ;->᩻᩷:I

    .line 202
    sget-boolean v9, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v9, :cond_c

    :cond_b
    :goto_4
    const-string v9, "\u05a8\u05a8"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4527

    const v11, -0x36a5c21f

    xor-int/2addr v10, v11

    const v11, 0x507a1d85

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06eb\u1a77"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6827

    const v11, 0x24657ca1

    xor-int/2addr v10, v11

    const v11, 0x42dcc856

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74996670 -> :sswitch_7
        -0x4f100289 -> :sswitch_9
        -0x447b2009 -> :sswitch_7
        -0x44508164 -> :sswitch_c
        -0x375d793d -> :sswitch_e
        -0x2fb141ae -> :sswitch_5
        -0x2e229202 -> :sswitch_8
        -0x2498543f -> :sswitch_e
        -0x1bbb183f -> :sswitch_d
        -0x142d6d43 -> :sswitch_4
        -0x109f2b3f -> :sswitch_9
        -0x5b6941d -> :sswitch_0
        -0x3ed1dc3 -> :sswitch_a
        0x114289a -> :sswitch_b
        0x1b747ce6 -> :sswitch_0
        0x24b6a59e -> :sswitch_3
        0x255423fa -> :sswitch_1
        0x2beac71f -> :sswitch_8
        0x3619b752 -> :sswitch_d
        0x3baad257 -> :sswitch_1
        0x4581bf82 -> :sswitch_6
        0x467c9a6e -> :sswitch_b
        0x4a2703b3 -> :sswitch_2
        0x4b44eca7 -> :sswitch_6
        0x4dcf59aa -> :sswitch_a
        0x4fd177f8 -> :sswitch_c
        0x5982c2b1 -> :sswitch_5
        0x74d91790 -> :sswitch_2
        0x753a10f9 -> :sswitch_4
        0x7de049e5 -> :sswitch_3
    .end sparse-switch
.end method
