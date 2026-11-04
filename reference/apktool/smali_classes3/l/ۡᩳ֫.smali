.class public final Ll/ۡᩳ֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ۙ:Ll/۟ۢ֫;


# direct methods
.method public constructor <init>(Ll/۟ۢ֫;)V
    .locals 0

    .line 2538
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡᩳ֫;->ۙ:Ll/۟ۢ֫;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x7104bfef

    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    sget v5, Ll/֡᩵;->ۤܳ۬:I

    const-string v6, "\u06e4\u06d7"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5f93

    const v8, -0x64ee0d01

    xor-int/2addr v7, v8

    const v8, 0x7d4b525

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x523

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget v6, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v6, :cond_8

    goto/16 :goto_4

    .line 2025
    :sswitch_0
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v6, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v6, :cond_4

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    sget v6, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v6, :cond_a

    goto/16 :goto_4

    .line 1733
    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    goto/16 :goto_4

    .line 242
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    return-void

    .line 2549
    :sswitch_4
    invoke-virtual {v2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 2550
    invoke-static {p1}, Ll/۟ۢ֫;->ۨ(Ll/۟ۢ֫;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    return-void

    .line 2549
    :sswitch_5
    invoke-static {p1}, Ll/۟ۢ֫;->ܳ(Ll/۟ۢ֫;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v2

    .line 1164
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u06df\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4a0f

    const v8, 0x9a59d74

    xor-int/2addr v7, v8

    const v8, -0x87c86cf

    goto :goto_0

    .line 2548
    :sswitch_6
    invoke-static {p1}, Ll/۟ۢ֫;->᩹(Ll/۟ۢ֫;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 904
    sget v6, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u06e1\u06d8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1d0f

    const v8, -0x3e62723c

    xor-int/2addr v7, v8

    const v8, -0xba27ac

    goto/16 :goto_0

    :sswitch_7
    const/4 v1, 0x4

    .line 2547
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v6

    if-ltz v6, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v6, "\u06d8\u06e2"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4a1b

    const v8, -0x1594c1

    xor-int/2addr v7, v8

    const v8, 0x1b4b8041

    goto/16 :goto_0

    :sswitch_8
    invoke-static {p1}, Ll/۟ۢ֫;->ۚ(Ll/۟ۢ֫;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const-string v6, "\u1a74\u0730"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x57f9

    const v8, -0xed6a5c2

    xor-int/2addr v7, v8

    const v8, -0x66602910

    goto/16 :goto_0

    :sswitch_9
    iget-object p1, p0, Ll/ۡᩳ֫;->ۙ:Ll/۟ۢ֫;

    .line 1178
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v6

    if-eqz v6, :cond_5

    :cond_4
    const-string v6, "\u06ec\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2ea9

    const v8, 0x14e2e64e

    xor-int/2addr v7, v8

    const v8, -0x442de8ed

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u1a78\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x53f9

    const v8, -0x35ee60b7

    xor-int/2addr v7, v8

    const v8, -0x7e458633

    goto/16 :goto_0

    .line 2372
    :sswitch_a
    sget-boolean v6, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v6, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v6, "\u06e2\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4e0f

    const v8, -0x68bcf654

    xor-int/2addr v7, v8

    const v8, -0x4dd1b4d4

    goto/16 :goto_0

    .line 1760
    :sswitch_b
    sget v6, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v6, :cond_7

    :goto_1
    const-string v6, "\u06e4\u06d6"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb77

    const v8, -0x6fb18c6

    xor-int/2addr v7, v8

    const v8, 0x4f31216f

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u0730\u073f"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x5f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x462b

    const v8, -0x6159cca

    xor-int/2addr v7, v8

    const v8, 0x55238a2

    goto/16 :goto_0

    .line 2084
    :sswitch_c
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    :goto_2
    const-string v6, "\u06e4\u06eb"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x188b

    const v8, -0x22dcdfeb

    xor-int/2addr v7, v8

    const v8, 0x1bc0b77b

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u0733\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3db

    const v8, -0x1af1719c

    xor-int/2addr v7, v8

    const v8, -0x2bd6cba8

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_3
    const-string v6, "\u06e4\u06df"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3fcb

    const v8, 0x584c0bd0

    xor-int/2addr v7, v8

    const v8, -0x3e743998

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06d9\u1a77"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3493

    const v8, 0x63537f6f

    xor-int/2addr v7, v8

    const v8, -0x39860300    # -15999.25f

    goto/16 :goto_0

    .line 1489
    :sswitch_e
    sget v6, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v6, :cond_c

    :goto_4
    const-string v6, "\u06e4\u05a8"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x4d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3e5b

    const v8, -0x177c7934

    xor-int/2addr v7, v8

    const v8, -0x606e908f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073a\u1a79"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x20c9

    const v8, 0x434da2cf

    xor-int/2addr v7, v8

    const v8, -0x76f1cf26

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72035622 -> :sswitch_6
        -0x671da014 -> :sswitch_9
        -0x5c3dfde0 -> :sswitch_d
        -0x586c4ec9 -> :sswitch_1
        -0x5132359e -> :sswitch_5
        -0x404b2c06 -> :sswitch_3
        -0x2a76333a -> :sswitch_5
        -0x297a9bae -> :sswitch_9
        -0x189fe2f1 -> :sswitch_0
        -0x13daf54f -> :sswitch_8
        0x7395e95 -> :sswitch_b
        0x8b8e948 -> :sswitch_c
        0x98a85a7 -> :sswitch_d
        0xb6ca33e -> :sswitch_8
        0x1349783e -> :sswitch_7
        0x1b04ce94 -> :sswitch_a
        0x1d65b498 -> :sswitch_4
        0x2c733d98 -> :sswitch_e
        0x2d18a1d3 -> :sswitch_e
        0x318793ce -> :sswitch_6
        0x3db7f44e -> :sswitch_a
        0x45a2a6cb -> :sswitch_3
        0x4cac864c -> :sswitch_c
        0x5010d9f3 -> :sswitch_7
        0x5efc47c0 -> :sswitch_b
        0x5f4d7b6a -> :sswitch_2
        0x65fd3598 -> :sswitch_0
        0x73352c78 -> :sswitch_4
        0x73c685cc -> :sswitch_1
        0x77d50723 -> :sswitch_2
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
