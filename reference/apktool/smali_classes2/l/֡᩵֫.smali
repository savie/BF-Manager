.class public final synthetic Ll/֡᩵֫;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ܰ:Ll/ۡ᩵֫;


# direct methods
.method public synthetic constructor <init>(Ll/ۡ᩵֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩵֫;->ܰ:Ll/ۡ᩵֫;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const p1, -0x66055c7

    sget v0, Ll/ۖۙ;->ۤۧۤ:I

    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v2, "\u1a76\u1a76"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x55b1

    const v4, -0x27dc2690

    xor-int/2addr v3, v4

    const v4, 0x5caabdf8

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v1

    mul-int/lit16 p1, p1, 0x1b9

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 3
    sget v2, Ll/۬;->᩸ۜ᩹:I

    if-eqz v2, :cond_7

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v2, Ll/ۘ۟;->ۜ᩺᩺:I

    if-nez v2, :cond_8

    goto/16 :goto_4

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v2, :cond_b

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v2, Ll/֨ۨ;->ۜܳ᩵:I

    if-gez v2, :cond_2

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    goto/16 :goto_4

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/֡᩵֫;->ܰ:Ll/ۡ᩵֫;

    invoke-static {p1, p2}, Ll/ۡ᩵֫;->ۙ(Ll/ۡ᩵֫;Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 4
    :sswitch_6
    sget v2, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u1a79\u1a7a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x71

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x431b

    const v4, 0x709acd8e

    xor-int/2addr v3, v4

    const v4, -0x6f7cf3ef

    goto :goto_0

    .line 1
    :sswitch_7
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v2, "\u073d\u06e8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x51

    xor-int v3, v2, v1

    mul-int/lit8 v3, v3, 0x6d

    const v4, 0x5caf8766

    xor-int/2addr v3, v4

    const v4, 0x49cd11cc    # 1679929.5f

    goto :goto_0

    .line 4
    :sswitch_8
    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v2, :cond_3

    :cond_2
    :goto_2
    const-string v2, "\u06eb\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x17

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x5059

    const v4, 0x1b5e12c6

    xor-int/2addr v3, v4

    const v4, 0x1df032e8

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u05a8\u1a78"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x57

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x7431

    const v4, -0x7a8c57a3

    xor-int/2addr v3, v4

    const v4, 0x5a063bc9

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v2, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v2, "\u06d6\u06e4"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x120d

    const v4, -0x142f411d

    xor-int/2addr v3, v4

    const v4, 0x764d9e32

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v2, "\u06df\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x31bf

    const v4, 0x46d2ebf4

    xor-int/2addr v3, v4

    const v4, 0x76391115

    goto/16 :goto_0

    :sswitch_b
    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v2, :cond_6

    :goto_3
    const-string v2, "\u073a\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x805

    const v4, -0x7278dfe7

    xor-int/2addr v3, v4

    const v4, 0x79639fa4

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u1a75\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x21

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5f79

    const v4, -0x7b4b5903

    xor-int/2addr v3, v4

    const v4, 0x27eac946

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06df\u1a75"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x3d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2e07

    const v4, -0x6c8847bd

    xor-int/2addr v3, v4

    const v4, -0x7a819156

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    const-string v2, "\u073f\u06e0"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0xd

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2cd5

    const v4, 0x2b82d37b

    xor-int/2addr v3, v4

    const v4, 0x6a6fa980

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06d9\u06dc"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x9

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2123

    const v4, -0x2a0ace4f

    xor-int/2addr v3, v4

    const v4, 0xa4035de

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v2, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v2, :cond_a

    :goto_4
    const-string v2, "\u1a76\u06e1"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x4d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6719

    const v4, -0x67e0df47

    xor-int/2addr v3, v4

    const v4, -0x5bd3b7c2

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u1a7a\u073d"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x65

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x12e1

    const v4, -0x66d1462d

    xor-int/2addr v3, v4

    const v4, 0xc380724

    goto/16 :goto_0

    :sswitch_e
    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v2, :cond_c

    :cond_b
    :goto_5
    const-string v2, "\u0730\u1a7b"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x3131

    const v4, -0x1e5edad2

    xor-int/2addr v3, v4

    const v4, 0x8c20754

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06db\u06d6"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x59fb

    const v4, 0x62c5ffef

    xor-int/2addr v3, v4

    const v4, -0x3881bb0c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f4ac06b -> :sswitch_2
        -0x73c1d6cf -> :sswitch_e
        -0x610f55ab -> :sswitch_5
        -0x5f43a51a -> :sswitch_3
        -0x4a1f18fa -> :sswitch_d
        -0x479e4378 -> :sswitch_1
        -0x416c471d -> :sswitch_6
        -0x3eef33eb -> :sswitch_4
        -0x3edeb18a -> :sswitch_b
        -0x3512dead -> :sswitch_2
        -0x2f8131f6 -> :sswitch_a
        -0x2b21cd4e -> :sswitch_e
        -0x2362c928 -> :sswitch_4
        -0x12c7a210 -> :sswitch_7
        -0x1c57a8a -> :sswitch_8
        0x1bc43aa -> :sswitch_b
        0x4a7b254 -> :sswitch_9
        0x9ea3c3b -> :sswitch_5
        0xbfd0034 -> :sswitch_0
        0xed5a4b1 -> :sswitch_d
        0x2b41f07b -> :sswitch_c
        0x330a869c -> :sswitch_8
        0x48fa7953 -> :sswitch_0
        0x4f10626b -> :sswitch_a
        0x56179428 -> :sswitch_7
        0x5bf8b825 -> :sswitch_1
        0x5d83362b -> :sswitch_9
        0x5ed9b22f -> :sswitch_3
        0x647e52dd -> :sswitch_6
        0x7acb9a9e -> :sswitch_c
    .end sparse-switch
.end method
