.class public final Ll/ۖۚۘ;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ܺ:Ll/᩹ۚۘ;

.field public final synthetic ᩶:Landroid/view/ViewTreeObserver;


# direct methods
.method public constructor <init>(Ll/᩹ۚۘ;Landroid/view/ViewTreeObserver;)V
    .locals 6

    const v0, 0x72e2fb8e

    sget v1, Ll/֡۠;->ۛ᩻ۧ:I

    sget v2, Ll/ۖۧ;->ܺۚۖ:I

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7db3

    const v5, -0x109a136

    xor-int/2addr v4, v5

    const v5, 0x13e0ccbd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0xc7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p2, p0, Ll/ۖۚۘ;->᩶:Landroid/view/ViewTreeObserver;

    return-void

    .line 49
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_5

    .line 103
    :sswitch_1
    sget-boolean v3, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-eqz v3, :cond_a

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    move-result v3

    if-ltz v3, :cond_8

    goto/16 :goto_5

    .line 29
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    goto/16 :goto_5

    .line 93
    :sswitch_4
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 155
    :sswitch_5
    sget-boolean v3, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u0730\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3b89

    const v5, 0x42c240f5

    xor-int/2addr v4, v5

    const v5, 0x547c546e

    goto :goto_0

    .line 118
    :sswitch_6
    sget v3, Ll/֨ۢ;->ۢ۬ۧ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06e2\u06e2"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4fe9

    const v5, 0x8450fa4

    xor-int/2addr v4, v5

    const v5, 0x6da7015f

    goto :goto_0

    .line 114
    :sswitch_7
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result v3

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a73\u1a73"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x12f

    const v5, -0x7578aefc

    xor-int/2addr v4, v5

    const v5, -0x34ab9b12    # -1.391947E7f

    goto/16 :goto_0

    .line 69
    :sswitch_8
    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u1a77\u1a7a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ca3

    const v5, 0x354e8147

    xor-int/2addr v4, v5

    const v5, 0x7f8fb25f

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ۖᩴ;->᩹ܶܶ:Z

    if-nez v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u073d\u06d9"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1819

    const v5, 0x5bf4dd85

    xor-int/2addr v4, v5

    const v5, -0x784d810a

    goto/16 :goto_0

    .line 72
    :sswitch_a
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_5

    :goto_1
    const-string v3, "\u0736\u1a77"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5f81

    const v5, 0xe671981

    xor-int/2addr v4, v5

    const v5, 0x2a6c0736

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7651

    const v5, 0x6cccfe0

    xor-int/2addr v4, v5

    const v5, -0x60255509

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06eb\u1a74"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x23b1

    const v5, 0x2a1324fb

    xor-int/2addr v4, v5

    const v5, 0x6062301

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u05a1\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7569

    const v5, 0xd14aecb

    xor-int/2addr v4, v5

    const v5, -0x54307a58

    goto/16 :goto_0

    .line 140
    :sswitch_c
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06e7\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x41b9

    const v5, -0x2c465985

    xor-int/2addr v4, v5

    const v5, -0xb5fb15a

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x64a1

    const v5, -0x4c2a58a2

    xor-int/2addr v4, v5

    const v5, -0x3158ceb0

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u0733\u06db"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1267

    const v5, 0x7e73416a

    xor-int/2addr v4, v5

    const v5, -0x1dd6a03e    # -7.8109996E20f

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d7\u06db"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2ff3

    const v5, -0x31808d7b

    xor-int/2addr v4, v5

    const v5, -0x2d600375

    goto/16 :goto_0

    .line 156
    :sswitch_e
    iput-object p1, p0, Ll/ۖۚۘ;->ܺ:Ll/᩹ۚۘ;

    .line 71
    sget v3, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz v3, :cond_c

    :goto_5
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5da3

    const v5, 0x1af3d9b3

    xor-int/2addr v4, v5

    const v5, 0x3dee9eaa

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u05ab"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x25ff

    const v5, -0x51813bfe

    xor-int/2addr v4, v5

    const v5, -0x1b250a91

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72a96122 -> :sswitch_2
        -0x6fe3a37b -> :sswitch_8
        -0x653a6553 -> :sswitch_8
        -0x5a03460e -> :sswitch_4
        -0x45d1737a -> :sswitch_c
        -0x2c2428f7 -> :sswitch_5
        -0x28ee0fcc -> :sswitch_5
        -0x2401c89f -> :sswitch_a
        -0x239d1a20 -> :sswitch_b
        -0x237cb8d8 -> :sswitch_6
        -0x16286f18 -> :sswitch_3
        -0x1014bd47 -> :sswitch_9
        -0xa14553 -> :sswitch_2
        0x8260008 -> :sswitch_a
        0x1dbf369d -> :sswitch_1
        0x1e92d8b3 -> :sswitch_7
        0x1f3b5b4e -> :sswitch_7
        0x30a2e2f3 -> :sswitch_3
        0x34eee3f4 -> :sswitch_d
        0x371bfe50 -> :sswitch_0
        0x3a7d775d -> :sswitch_6
        0x3b51fdb4 -> :sswitch_4
        0x50e6dc59 -> :sswitch_0
        0x550d3f5e -> :sswitch_9
        0x5be99c06 -> :sswitch_b
        0x5c6a8784 -> :sswitch_c
        0x60ed72f7 -> :sswitch_d
        0x61bf28b4 -> :sswitch_e
        0x63d11137 -> :sswitch_e
        0x7637d506 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x7b337565

    sget v2, Ll/֡֡;->᩶ۤ۠:I

    sget v3, Ll/ۗ᩺;->ۢۜ᩶:I

    const-string v4, "\u06e2\u073a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d37

    const v6, -0x36247ddf

    xor-int/2addr v5, v6

    const v6, 0x773628fb

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x2acd

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 160
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_1

    .line 145
    :sswitch_0
    sget v4, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v4, :cond_b

    goto/16 :goto_3

    .line 41
    :sswitch_1
    sget-boolean v4, Ll/֨ۖ;->۫ۗۜ:Z

    if-eqz v4, :cond_9

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    sget v4, Ll/ۖۧ;->ܺۚۖ:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a7a\u1a77"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3b1b

    const v6, 0x77499532

    xor-int/2addr v5, v6

    const v6, -0x49be33c3

    goto :goto_0

    .line 124
    :sswitch_3
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_2

    .line 73
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    const/4 v0, 0x0

    return v0

    .line 162
    :sswitch_5
    iget-object v0, p0, Ll/ۖۚۘ;->ܺ:Ll/᩹ۚۘ;

    invoke-static {v0}, Ll/᩹ۚۘ;->ܰ(Ll/᩹ۚۘ;)V

    .line 163
    invoke-static {v0}, Ll/᩹ۚۘ;->ۖ(Ll/᩹ۚۘ;)Z

    move-result v0

    return v0

    .line 159
    :sswitch_6
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u05ab\u1a76"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3cd5

    const v6, -0x497a7f32

    xor-int/2addr v5, v6

    const v6, 0x7de30d4b

    goto :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u073a\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x32c1

    const v6, 0x24d6bc93

    xor-int/2addr v5, v6

    const v6, -0x5d412bcb

    goto :goto_0

    .line 149
    :sswitch_7
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v4, "\u1a76\u1a73"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x418d

    const v6, 0x68a28de4

    xor-int/2addr v5, v6

    const v6, 0x19987c7c

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u06e2\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6623

    const v6, -0x7a3e924d

    xor-int/2addr v5, v6

    const v6, -0x3ab794ad

    goto/16 :goto_0

    .line 50
    :sswitch_9
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_4

    :goto_2
    const-string v4, "\u1a7b\u06db"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7a33

    const v6, 0x233a31b2

    xor-int/2addr v5, v6

    const v6, 0x3cb87727

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06d8\u06d9"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x26f9

    const v6, -0x6b91ccce

    xor-int/2addr v5, v6

    const v6, 0x73558a7

    goto/16 :goto_0

    .line 123
    :sswitch_a
    sget-boolean v4, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2f1b

    const v6, 0x9ca9db1

    xor-int/2addr v5, v6

    const v6, 0x4d0d6919    # 1.482797E8f

    goto/16 :goto_0

    .line 136
    :sswitch_b
    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06d9\u0736"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3353

    const v6, -0x12c6b280

    xor-int/2addr v5, v6

    const v6, 0x296c3c2

    goto/16 :goto_0

    .line 75
    :sswitch_c
    sget v4, Ll/۟;->ۨᩴۛ:I

    if-ltz v4, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v4, "\u06e4\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4e03

    const v6, 0x34305a24

    xor-int/2addr v5, v6

    const v6, 0x318957b5

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6227

    const v6, -0x3cc62fb3

    xor-int/2addr v5, v6

    const v6, 0x1d3e5bd0

    goto/16 :goto_0

    .line 20
    :sswitch_e
    sget-boolean v4, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u06e8\u1a74"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d39

    const v6, -0x51556dc2

    xor-int/2addr v5, v6

    const v6, 0x3391c545

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u0733"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1b21

    const v6, -0x55e8c1f1

    xor-int/2addr v5, v6

    const v6, 0x19e4e4c3

    goto/16 :goto_0

    .line 121
    :sswitch_f
    invoke-static {}, Ll/ۘۚ;->ۧۤۘ()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u1a7b\u06da"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x587f

    const v6, -0x74d1f2f3    # -3.3521E-32f

    xor-int/2addr v5, v6

    const v6, 0x189528be

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7a\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x999

    const v6, 0x490cb765

    xor-int/2addr v5, v6

    const v6, 0x6187cb93

    goto/16 :goto_0

    .line 159
    :sswitch_10
    iget-object v0, p0, Ll/ۖۚۘ;->᩶:Landroid/view/ViewTreeObserver;

    sget-boolean v4, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v4, :cond_d

    :goto_5
    const-string v4, "\u06e2\u06d7"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa9d

    const v6, -0x91f24d8

    xor-int/2addr v5, v6

    const v6, -0x196be1c3

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e0\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x711f

    const v6, -0x612289bc

    xor-int/2addr v5, v6

    const v6, 0x3a08f631

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c3f4c4e -> :sswitch_4
        -0x590bbf50 -> :sswitch_2
        -0x42eb5d6d -> :sswitch_8
        -0x42ea71f9 -> :sswitch_d
        -0x3f01f32e -> :sswitch_1
        -0x32e57dec -> :sswitch_c
        -0x299e118b -> :sswitch_6
        -0x2790efec -> :sswitch_0
        -0x26510c6c -> :sswitch_2
        -0x24d3573d -> :sswitch_9
        -0x16517178 -> :sswitch_9
        -0x159eb074 -> :sswitch_8
        -0x1247b28c -> :sswitch_3
        -0x11bc917e -> :sswitch_6
        -0xb1f8d92 -> :sswitch_e
        -0x8995067 -> :sswitch_10
        -0x597e51d -> :sswitch_3
        -0x2adb2bf -> :sswitch_0
        -0x2a1f13c -> :sswitch_5
        0xe3a8b94 -> :sswitch_a
        0x163e944a -> :sswitch_4
        0x1913bc8c -> :sswitch_10
        0x1b230aa8 -> :sswitch_7
        0x20080741 -> :sswitch_a
        0x21fdc50f -> :sswitch_d
        0x26c3e3a3 -> :sswitch_7
        0x28d5fae5 -> :sswitch_e
        0x2da2b734 -> :sswitch_f
        0x4ae15939 -> :sswitch_5
        0x511474a6 -> :sswitch_c
        0x54bc8ae2 -> :sswitch_1
        0x5ef39238 -> :sswitch_b
        0x7326aeaa -> :sswitch_b
        0x7622b3d3 -> :sswitch_f
    .end sparse-switch
.end method
