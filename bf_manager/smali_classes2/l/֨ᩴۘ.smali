.class public final Ll/֨ᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ۙ:Ll/ۙ۠ۘ;


# direct methods
.method public constructor <init>(Ll/ۙ۠ۘ;)V
    .locals 0

    .line 2453
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ᩴۘ;->ۙ:Ll/ۙ۠ۘ;

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

    const v3, -0x158bc836

    sget v4, Ll/ۗ;->֨۬ۖ:I

    sget v5, Ll/֫֡;->ۡ᩹ۗ:I

    const-string v6, "\u073d\u073a"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x45b

    const v8, -0x4d80535c

    xor-int/2addr v7, v8

    const v8, -0x5dacc4c4

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x58d5

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 2292
    sget v6, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v6, :cond_b

    goto/16 :goto_1

    .line 1024
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v6, Ll/ۗ۬;->ۤᩴ᩻:I

    if-gez v6, :cond_4

    goto/16 :goto_4

    .line 490
    :sswitch_1
    sget v6, Ll/֡ܳ;->֡۠ۧ:I

    if-lez v6, :cond_7

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    goto/16 :goto_1

    .line 1961
    :sswitch_3
    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    return-void

    .line 2464
    :sswitch_4
    invoke-virtual {v2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 2465
    invoke-static {p1}, Ll/ۙ۠ۘ;->ۡ(Ll/ۙ۠ۘ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    return-void

    .line 2464
    :sswitch_5
    invoke-static {p1}, Ll/ۙ۠ۘ;->᩹(Ll/ۙ۠ۘ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v2

    .line 1582
    sget v6, Ll/֨ۧ;->֫۠֡:I

    if-gtz v6, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v6, "\u06db\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x29f9

    const v8, -0x6181098e

    xor-int/2addr v7, v8

    const v8, 0x3abb2ba5

    goto :goto_0

    .line 2463
    :sswitch_6
    invoke-static {p1}, Ll/ۙ۠ۘ;->ᩴ(Ll/ۙ۠ۘ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 2055
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u1a78\u073f"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x79

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x15a9

    const v8, -0x29f3230

    xor-int/2addr v7, v8

    const v8, 0x10f484c2

    goto :goto_0

    :sswitch_7
    const/4 v1, 0x4

    .line 2462
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 384
    sget v6, Ll/֨ۧ;->֫۠֡:I

    if-gtz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u1a78\u06e0"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x77c3

    const v8, -0x5752fac7

    xor-int/2addr v7, v8

    const v8, 0x993d9f1

    goto/16 :goto_0

    .line 2462
    :sswitch_8
    invoke-static {p1}, Ll/ۙ۠ۘ;->۬(Ll/ۙ۠ۘ;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    .line 1609
    sget v6, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v6, :cond_3

    :goto_1
    const-string v6, "\u06d7\u1a73"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5753

    const v8, -0x64296b0f

    xor-int/2addr v7, v8

    const v8, -0x5a2ab6cd    # -3.6999212E-16f

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u1a73\u05a8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3a43

    const v8, -0x3a7184c

    xor-int/2addr v7, v8

    const v8, 0x9f689d

    goto/16 :goto_0

    .line 2462
    :sswitch_9
    iget-object p1, p0, Ll/֨ᩴۘ;->ۙ:Ll/ۙ۠ۘ;

    .line 667
    sget v6, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v6, :cond_5

    :cond_4
    const-string v6, "\u06e8\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x22e3

    const v8, -0x67d426d2

    xor-int/2addr v7, v8

    const v8, -0x4b30630c

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06d7\u06d9"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xca3

    const v8, -0x700c91bc

    xor-int/2addr v7, v8

    const v8, 0x7c6a04bd

    goto/16 :goto_0

    .line 613
    :sswitch_a
    sget v6, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v6, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v6, "\u1a73\u06e7"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6a31

    const v8, 0x151fe7be

    xor-int/2addr v7, v8

    const v8, -0x7a25a6c2

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v6, :cond_8

    :cond_7
    :goto_2
    const-string v6, "\u1a74\u1a7a"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x546d

    const v8, 0x3a2a35f6

    xor-int/2addr v7, v8

    const v8, 0x624a169d

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u06dc\u06dc"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x22af

    const v8, -0x544e4b85

    xor-int/2addr v7, v8

    const v8, 0x2435cd8f

    goto/16 :goto_0

    .line 1322
    :sswitch_c
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    move-result v6

    if-gtz v6, :cond_9

    :goto_3
    const-string v6, "\u06e2\u06ec"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3471

    const v8, 0x27eb4954

    xor-int/2addr v7, v8

    const v8, -0x6147a417

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a76\u06d6"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xf47

    const v8, -0x5b8ea44a

    xor-int/2addr v7, v8

    const v8, 0x4f4c1c70

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v6, :cond_a

    goto :goto_4

    :cond_a
    const-string v6, "\u06eb\u06e8"

    invoke-static {v6}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xdaf

    const v8, -0x1791b40e

    xor-int/2addr v7, v8

    const v8, -0x6f2883f7

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u05a1\u06e8"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x177b

    const v8, -0x4c9fdc39

    xor-int/2addr v7, v8

    const v8, 0x16071b04

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e0\u1a77"

    invoke-static {v6}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1bd

    const v8, -0x12c63b82

    xor-int/2addr v7, v8

    const v8, -0x74640b2d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cfde0bd -> :sswitch_b
        -0x77b41cfc -> :sswitch_4
        -0x730b77fb -> :sswitch_1
        -0x68b4fcbb -> :sswitch_2
        -0x5ee50a66 -> :sswitch_d
        -0x5cb7d6e1 -> :sswitch_c
        -0x5a5f9ff2 -> :sswitch_5
        -0x3d30624f -> :sswitch_7
        -0x3c886504 -> :sswitch_9
        -0x2bd962da -> :sswitch_8
        -0x2b46624b -> :sswitch_6
        -0x262db588 -> :sswitch_4
        -0x2243a1b7 -> :sswitch_9
        -0xdd7ad20 -> :sswitch_e
        -0xa032ff0 -> :sswitch_0
        -0x5c91efe -> :sswitch_e
        -0x240ca24 -> :sswitch_b
        -0x120a379 -> :sswitch_6
        0x63f5378 -> :sswitch_1
        0x90b9294 -> :sswitch_3
        0x266a1824 -> :sswitch_5
        0x2c48952f -> :sswitch_0
        0x2d07a114 -> :sswitch_2
        0x4707ca06 -> :sswitch_d
        0x4d5434a4 -> :sswitch_3
        0x4edc0def -> :sswitch_8
        0x58f96cab -> :sswitch_7
        0x6a92a6ab -> :sswitch_c
        0x6f1fe188 -> :sswitch_a
        0x7c502bac -> :sswitch_a
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
