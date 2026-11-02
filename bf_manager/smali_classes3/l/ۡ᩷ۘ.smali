.class public final synthetic Ll/ۡ᩷ۘ;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic ܺ:Ll/۬ܺۘ;


# direct methods
.method public synthetic constructor <init>(Ll/۬ܺۘ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩷ۘ;->ܺ:Ll/۬ܺۘ;

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

    const v6, -0x79ff402f

    sget v7, Ll/֡ܳ;->֡۠ۧ:I

    sget v8, Ll/ۘۧ;->ܳ᩷᩸:I

    const-string v9, "\u05a8\u1a79"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x5

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4d37

    const v11, 0x39cc1ca5

    xor-int/2addr v10, v11

    const v11, -0x61cb382c

    :goto_0
    xor-int/2addr v9, v11

    xor-int/2addr v6, v8

    mul-int/lit16 v6, v6, -0x378b

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 425
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    goto/16 :goto_4

    :sswitch_0
    sget v9, Ll/֨ۧ;->֫۠֡:I

    if-lez v9, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/᩶;->ۨ֨ۜ()Z

    move-result v9

    if-nez v9, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v9, "\u06e4\u06e4"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x7b

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x14b7

    const v11, 0x65a7a9c8

    xor-int/2addr v10, v11

    const v11, 0x666863a2

    goto :goto_0

    .line 271
    :sswitch_2
    sget v9, Ll/֨ۧ;->֫۠֡:I

    if-gtz v9, :cond_5

    goto/16 :goto_4

    .line 212
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    return-void

    .line 491
    :sswitch_4
    invoke-virtual {v4, v5}, Landroid/view/Window;->clearFlags(I)V

    .line 492
    invoke-static {v0}, Ll/ۖۗ;->ᩳ۬ۤ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void

    :sswitch_5
    const/4 v5, 0x2

    .line 144
    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    move-result v9

    if-eqz v9, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v9, "\u06da\u06da"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x173b

    const v11, 0x4b299ff6    # 1.1116534E7f

    xor-int/2addr v10, v11

    const v11, -0x2f27b075

    goto :goto_0

    .line 490
    :sswitch_6
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 491
    invoke-static {v0}, Ll/ۖۗ;->ᩳ۬ۤ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v4

    .line 147
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v9

    if-gtz v9, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v9, "\u06ec\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0xb

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x150b

    const v11, -0xf085552

    xor-int/2addr v10, v11

    const v11, -0x39500f5a

    goto/16 :goto_0

    .line 489
    :sswitch_7
    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v9

    if-gtz v9, :cond_3

    const-string v9, "\u06db\u06da"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3417

    const v11, -0x612eeee

    xor-int/2addr v10, v11

    const v11, -0x758a5d4c

    goto/16 :goto_0

    :cond_3
    const-string v9, "\u0736\u1a75"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x5361

    const v11, 0x2ac18421

    xor-int/2addr v10, v11

    const v11, 0x58071f9d

    goto/16 :goto_0

    :sswitch_8
    invoke-static {v0}, Ll/ۘۗ;->֫ۧܿ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v1

    .line 154
    sget v9, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v9, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v9, "\u073d\u1a7b"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x3d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x27b

    const v11, -0x1f971bc4

    xor-int/2addr v10, v11

    const v11, -0x177e054b

    goto/16 :goto_0

    .line 489
    :sswitch_9
    iget-object v0, p0, Ll/ۡ᩷ۘ;->ܺ:Ll/۬ܺۘ;

    sget v9, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v9, :cond_6

    :cond_5
    :goto_2
    const-string v9, "\u1a74\u06e7"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x69

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1531

    const v11, 0x6471ac1

    xor-int/2addr v10, v11

    const v11, 0xac500fd

    goto/16 :goto_0

    :cond_6
    const-string v9, "\u06e1\u06dc"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x3c67

    const v11, 0x48a4b12f

    xor-int/2addr v10, v11

    const v11, -0x940e18d

    goto/16 :goto_0

    .line 212
    :sswitch_a
    sget v9, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v9, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v9, "\u06d6\u1a78"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x6b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x4f93

    const v11, 0x26b35634

    xor-int/2addr v10, v11

    const v11, 0x54eb34ad

    goto/16 :goto_0

    .line 287
    :sswitch_b
    sget-boolean v9, Ll/ۗܳ;->ۤᩴۗ:Z

    if-eqz v9, :cond_8

    goto :goto_4

    :cond_8
    const-string v9, "\u06eb\u06d9"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x61

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6eef

    const v11, -0x7f88d28e

    xor-int/2addr v10, v11

    const v11, -0x29298c71

    goto/16 :goto_0

    .line 47
    :sswitch_c
    sget v9, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v9, :cond_a

    :cond_9
    :goto_3
    const-string v9, "\u1a7a\u1a76"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x1c51

    const v11, -0x72357142

    xor-int/2addr v10, v11

    const v11, -0x730bf24d

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u073f\u0736"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x6889

    const v11, -0x3ddc4c71

    xor-int/2addr v10, v11

    const v11, 0x57b1b7fa

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_4

    :cond_b
    const-string v9, "\u073a\u1a79"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x6535

    const v11, 0xf5cb5f4

    xor-int/2addr v10, v11

    const v11, 0xd5b4f51

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v9, Ll/۬ܺۘ;->᩺ܰ:I

    .line 453
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    move-result v9

    if-eqz v9, :cond_c

    :goto_4
    const-string v9, "\u1a73\u06e8"

    invoke-static {v9}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x581f

    const v11, -0x3f50cec6

    xor-int/2addr v10, v11

    const v11, -0x6810bacf

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u1a76\u06ec"

    invoke-static {v9}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3d55

    const v11, -0x2cace473

    xor-int/2addr v10, v11

    const v11, -0x490c5e76

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bed6ade -> :sswitch_7
        -0x705e4cb6 -> :sswitch_a
        -0x6add559f -> :sswitch_a
        -0x64dcb423 -> :sswitch_5
        -0x60ac9abb -> :sswitch_4
        -0x5f23b794 -> :sswitch_8
        -0x520e9b99 -> :sswitch_9
        -0x458ab326 -> :sswitch_4
        -0x3e700a20 -> :sswitch_3
        -0x3425c1c8 -> :sswitch_6
        -0x319ee72e -> :sswitch_c
        -0x2de83134 -> :sswitch_0
        -0x2b6a0a58 -> :sswitch_1
        -0x27d8bd1a -> :sswitch_e
        -0x22b22327 -> :sswitch_e
        -0x18fec232 -> :sswitch_2
        -0x116dd265 -> :sswitch_d
        -0xdfee7ef -> :sswitch_b
        -0x40dbb35 -> :sswitch_8
        0x655145 -> :sswitch_6
        0xfd3e70a -> :sswitch_b
        0x15e1fb27 -> :sswitch_1
        0x1fde33ef -> :sswitch_d
        0x5b383f2a -> :sswitch_c
        0x5bca2104 -> :sswitch_9
        0x65db4210 -> :sswitch_3
        0x68e4cb65 -> :sswitch_2
        0x70929ad4 -> :sswitch_5
        0x70f9c502 -> :sswitch_0
        0x7d72536f -> :sswitch_7
    .end sparse-switch
.end method
