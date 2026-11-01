.class public final Ll/ۜᩴۘ;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ll/᩸ۢܰ;


# instance fields
.field public final synthetic ܺ:Ll/ۙ۠ۘ;


# direct methods
.method public constructor <init>(Ll/ۙ۠ۘ;)V
    .locals 0

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜᩴۘ;->ܺ:Ll/ۙ۠ۘ;

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public final onPageSelected(I)V
    .locals 7

    const/4 p1, 0x0

    const/4 v0, 0x0

    const v1, 0x7d4a54ed

    sget v2, Ll/֨ܰ;->ۢ᩷۟:I

    sget v3, Ll/ۗܺ;->ۨ᩺۠:I

    const-string v4, "\u06d8\u073f"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6243

    const v6, 0x6f96edbd

    xor-int/2addr v5, v6

    const v6, 0x5dd9c943

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x70d5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_4

    .line 237
    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_1

    .line 72
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_9

    goto/16 :goto_3

    .line 180
    :sswitch_2
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_3

    .line 224
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    goto/16 :goto_3

    .line 210
    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    return-void

    .line 248
    :sswitch_5
    invoke-static {v0, p1}, Ll/ۙ۠ۘ;->ۖ(Ll/ۙ۠ۘ;I)V

    const/4 p1, -0x2

    .line 249
    iput p1, v0, Ll/ۙ۠ۘ;->ᩴܰ:I

    return-void

    .line 248
    :sswitch_6
    iget-object v0, p0, Ll/ۜᩴۘ;->ܺ:Ll/ۙ۠ۘ;

    sget v4, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u0736\u06e2"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5b13

    const v6, 0x76faf584

    xor-int/2addr v5, v6

    const v6, 0x12ec377b

    goto :goto_0

    :sswitch_7
    const/4 p1, -0x1

    sget v4, Ll/֨ۧ;->֫۠֡:I

    if-gtz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06d9\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3777

    const v6, 0x470b1ab9

    xor-int/2addr v5, v6

    const v6, 0x38bf9d0c

    goto :goto_0

    :sswitch_8
    sget v4, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u06db\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1caf

    const v6, -0x651b4b4b

    xor-int/2addr v5, v6

    const v6, -0x34f87821    # -8882143.0f

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a78\u1a77"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3629

    const v6, 0x1e303090

    xor-int/2addr v5, v6

    const v6, 0x7a4d8d8e

    goto/16 :goto_0

    .line 80
    :sswitch_9
    sget v4, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u05a1\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4009

    const v6, -0x6de46ebc

    xor-int/2addr v5, v6

    const v6, 0x1e58912b

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz v4, :cond_5

    :goto_2
    const-string v4, "\u06d8\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1187

    const v6, 0x22f7136f

    xor-int/2addr v5, v6

    const v6, -0x9f056d2

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e4\u06e8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x78bd

    const v6, 0x7a697099

    xor-int/2addr v5, v6

    const v6, 0x3e0054f6

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d6\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2641

    const v6, -0x1c59aa21

    xor-int/2addr v5, v6

    const v6, 0x1f2dccd9

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a73\u05a8"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x239

    const v6, -0x7da5a162

    xor-int/2addr v5, v6

    const v6, -0xeee700f

    goto/16 :goto_0

    .line 86
    :sswitch_c
    sget v4, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u1a79\u06ec"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4f69

    const v6, -0x77a0023c

    xor-int/2addr v5, v6

    const v6, -0x11d20305

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u05a8\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7c6d

    const v6, 0x2aefb34a

    xor-int/2addr v5, v6

    const v6, 0xa8dab2f

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u05ab\u06e4"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7747

    const v6, -0x59f864e

    xor-int/2addr v5, v6

    const v6, 0x8826cb5

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06da\u0733"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x267b

    const v6, -0x619a4e69

    xor-int/2addr v5, v6

    const v6, -0x210f5d32

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    const-string v4, "\u1a79\u05ab"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6769

    const v6, -0x3c7f2245

    xor-int/2addr v5, v6

    const v6, 0x34260ceb

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a76\u1a76"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x23e7

    const v6, -0x231f1d7d

    xor-int/2addr v5, v6

    const v6, 0x1e9a6105

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e396608 -> :sswitch_8
        -0x7a94ed9c -> :sswitch_b
        -0x69429261 -> :sswitch_e
        -0x61e8fa33 -> :sswitch_4
        -0x600063af -> :sswitch_d
        -0x5ebcdb50 -> :sswitch_c
        -0x52540ecd -> :sswitch_2
        -0x329304c8 -> :sswitch_9
        -0x257a595a -> :sswitch_7
        -0x10d0b27a -> :sswitch_3
        -0x6c497c6 -> :sswitch_d
        -0x601a633 -> :sswitch_9
        0xf05f57 -> :sswitch_1
        0x187855a -> :sswitch_4
        0x6d37052 -> :sswitch_2
        0x73aafad -> :sswitch_e
        0x11f9c206 -> :sswitch_c
        0x29c1842d -> :sswitch_3
        0x2c1e0e15 -> :sswitch_a
        0x35203ba8 -> :sswitch_1
        0x451d3434 -> :sswitch_0
        0x483bf3c5 -> :sswitch_7
        0x4e9732bc -> :sswitch_5
        0x571e9442 -> :sswitch_8
        0x61515970 -> :sswitch_a
        0x6d5f8cf0 -> :sswitch_5
        0x71f9be21 -> :sswitch_6
        0x753e4043 -> :sswitch_b
        0x7ca9f17e -> :sswitch_6
        0x7e239212 -> :sswitch_0
    .end sparse-switch
.end method
