.class public final synthetic Ll/ۙۡ᩺;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۜ۟᩺;


# instance fields
.field public final synthetic ֡:Landroid/widget/EditText;

.field public final synthetic ܺ:Ll/ܿܿۚ;

.field public final synthetic ܽ:Ll/᩻ۡ᩺;

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ll/ܿܿۚ;Landroid/view/View;Landroid/widget/EditText;Ll/᩻ۡ᩺;)V
    .locals 6

    const v0, -0x49b04cae

    sget v1, Ll/֫ᩳ;->۬֨᩸:I

    sget v2, Ll/ۗ;->֨۬ۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0736\u073a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5db1

    const v5, 0x78f5765e

    xor-int/2addr v4, v5

    const v5, 0x68ce4596

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x272d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-gez v3, :cond_9

    goto :goto_1

    :sswitch_0
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_7

    goto/16 :goto_3

    .line 4
    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ܽۚۛ()I

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_b

    goto :goto_1

    .line 3
    :sswitch_2
    invoke-static {}, Ll/֫ۚ;->ۙ᩵ۤ()I

    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    :goto_1
    const-string v3, "\u1a77\u06e0"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x588b

    const v5, 0x5173b41d

    xor-int/2addr v4, v5

    const v5, 0x38cdece

    goto :goto_0

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/ۙۡ᩺;->֡:Landroid/widget/EditText;

    iput-object p4, p0, Ll/ۙۡ᩺;->ܽ:Ll/᩻ۡ᩺;

    return-void

    .line 2
    :sswitch_5
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u073d\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x165b

    const v5, -0x1321a300

    xor-int/2addr v4, v5

    const v5, -0x3be3d484

    goto :goto_0

    :cond_0
    const-string v3, "\u1a76\u1a75"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x103

    const v5, 0x49ffe171

    xor-int/2addr v4, v5

    const v5, -0xb0c80d6

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u073a\u06ec"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1f5d

    const v5, -0x3031fd35

    xor-int/2addr v4, v5

    const v5, 0x170c24f3

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/֡ۛ;->۬᩸ܶ:I

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06eb\u0730"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x353f

    const v5, -0x54246892

    xor-int/2addr v4, v5

    const v5, -0x58c5c2fa

    goto/16 :goto_0

    .line 1
    :sswitch_8
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v3

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a76\u0733"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1d4d

    const v5, -0x3dc1820a

    xor-int/2addr v4, v5

    const v5, 0x61706402

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget-boolean v3, Ll/ۘۛ;->ۧᩴ۠:Z

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06eb\u06e4"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ee5

    const v5, -0x774ebb41

    xor-int/2addr v4, v5

    const v5, 0x11e4c9a3

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06dc\u06e1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2a0f

    const v5, -0x4e899205

    xor-int/2addr v4, v5

    const v5, 0x54cbb838    # 6.9997523E12f

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a79\u073a"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x215f

    const v5, 0x11e82a1f

    xor-int/2addr v4, v5

    const v5, 0x7aa96628

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget-boolean v3, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4677

    const v5, -0x45b7b9eb

    xor-int/2addr v4, v5

    const v5, -0x706b9607

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a73\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2fdf

    const v5, -0x2fd791d0

    xor-int/2addr v4, v5

    const v5, 0x18038004

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result v3

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06dc\u05a8"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55bb

    const v5, 0x74e7e33f

    xor-int/2addr v4, v5

    const v5, 0x3e5f9442

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u0736"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x733f

    const v5, -0x66beb17d

    xor-int/2addr v4, v5

    const v5, 0x97cecb

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۙۡ᩺;->ܺ:Ll/ܿܿۚ;

    iput-object p2, p0, Ll/ۙۡ᩺;->᩶:Landroid/view/View;

    sget v3, Ll/֡ۚ;->ۢܰ᩸:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a76\u05a1"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2cbf

    const v5, -0x70e2ceb2

    xor-int/2addr v4, v5

    const v5, -0x3b4ea061

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3065

    const v5, -0x41f009b

    xor-int/2addr v4, v5

    const v5, -0x22f1789a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ea707b3 -> :sswitch_3
        -0x73951084 -> :sswitch_e
        -0x7350a37e -> :sswitch_1
        -0x6c466092 -> :sswitch_2
        -0x69175889 -> :sswitch_9
        -0x550f54fa -> :sswitch_b
        -0x4cd9b2e2 -> :sswitch_c
        -0x4a2a3500 -> :sswitch_0
        -0x45a62075 -> :sswitch_3
        -0x3e028f76 -> :sswitch_8
        -0x31408d43 -> :sswitch_d
        -0x30cc6317 -> :sswitch_1
        -0x182d4d7b -> :sswitch_d
        -0x16f54386 -> :sswitch_c
        -0x386467d -> :sswitch_4
        0xd3d69e -> :sswitch_8
        0xd112f0e -> :sswitch_e
        0xdac786b -> :sswitch_2
        0x158f8128 -> :sswitch_0
        0x24135b61 -> :sswitch_4
        0x3376c2fb -> :sswitch_7
        0x38b35d8c -> :sswitch_b
        0x3c3a8bd9 -> :sswitch_a
        0x4727b25b -> :sswitch_a
        0x47e81d2c -> :sswitch_6
        0x62399ee0 -> :sswitch_5
        0x6b2b5449 -> :sswitch_5
        0x6ded373c -> :sswitch_7
        0x72df5d8f -> :sswitch_9
        0x7d0625f9 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ(Ll/֨ᩴ᩺;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x59c80836

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    sget v4, Ll/֨ۧ;->֫۠֡:I

    const-string v5, "\u1a73\u06e2"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xaa3

    const v7, 0x730aac96

    xor-int/2addr v6, v7

    const v7, -0xd662e4a

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x123b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    goto/16 :goto_1

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget-boolean v5, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v5, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result v5

    if-eqz v5, :cond_4

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    sget-boolean v5, Ll/ۖۛ;->ۡܶ۬:Z

    if-eqz v5, :cond_7

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    return-void

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/ۙۡ᩺;->ܺ:Ll/ܿܿۚ;

    iget-object v3, p0, Ll/ۙۡ᩺;->᩶:Landroid/view/View;

    invoke-static {v2, v3, v0, v1, p1}, Ll/᩻ۡ᩺;->ۙ(Ll/ܿܿۚ;Landroid/view/View;Landroid/widget/EditText;Ll/᩻ۡ᩺;Ll/֨ᩴ᩺;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/ۙۡ᩺;->ܽ:Ll/᩻ۡ᩺;

    sget v5, Ll/֨᩹;->᩻ᩳ֨:I

    if-gtz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u06df\u073f"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6f6f

    const v7, -0x5a514e37

    xor-int/2addr v6, v7

    const v7, -0x57e6fd27

    goto :goto_0

    :sswitch_6
    iget-object v0, p0, Ll/ۙۡ᩺;->֡:Landroid/widget/EditText;

    sget v5, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u05ab\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x40db

    const v7, -0x7fad5153

    xor-int/2addr v6, v7

    const v7, -0x10286daf

    goto :goto_0

    .line 2
    :sswitch_7
    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "\u06dc\u06da"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x13e5

    const v7, -0x37c910ee

    xor-int/2addr v6, v7

    const v7, -0x30d654ee

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v5, :cond_3

    :goto_1
    const-string v5, "\u06e0\u1a7a"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5a39

    const v7, 0x22607406

    xor-int/2addr v6, v7

    const v7, 0x5e12dd4c

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06d8\u073f"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x39e3

    const v7, -0x5d0ff1db

    xor-int/2addr v6, v7

    const v7, 0x27ff504c

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget-boolean v5, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v5, :cond_5

    :cond_4
    :goto_2
    const-string v5, "\u06e7\u06d9"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x379

    const v7, -0x653173ae

    xor-int/2addr v6, v7

    const v7, -0x1969e183

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a7a\u06d7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7061

    const v7, -0x478adb50

    xor-int/2addr v6, v7

    const v7, 0x325ff01d

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v5, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u06ec\u06eb"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x37

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x64d

    const v7, 0x7561c4da

    xor-int/2addr v6, v7

    const v7, 0x491d2d99

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v5, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v5, :cond_8

    :cond_7
    :goto_3
    const-string v5, "\u1a74\u06e7"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6399

    const v7, 0x130a91ce

    xor-int/2addr v6, v7

    const v7, -0x5b1beb09

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d6\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x16bb

    const v7, 0x3ded2d2

    xor-int/2addr v6, v7

    const v7, 0x920e730

    goto/16 :goto_0

    .line 1
    :sswitch_c
    sget v5, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u06d6\u1a75"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5c8b

    const v7, -0x34cae79c    # -1.186826E7f

    xor-int/2addr v6, v7

    const v7, 0x7e02df44

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v5, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v5, :cond_a

    :goto_4
    const-string v5, "\u1a78\u06e0"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2deb

    const v7, 0x48315764

    xor-int/2addr v6, v7

    const v7, -0x1445b125

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e4\u06e4"

    invoke-static {v5}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x62ef

    const v7, -0x687bf42d

    xor-int/2addr v6, v7

    const v7, 0x6109a430

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v5, :cond_c

    :cond_b
    const-string v5, "\u06ec\u06df"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7bd1

    const v7, -0x645c45ec

    xor-int/2addr v6, v7

    const v7, -0x64a4df96

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a77\u1a77"

    invoke-static {v5}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x74c1

    const v7, -0x2a61a038

    xor-int/2addr v6, v7

    const v7, -0x6facba6f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa236df -> :sswitch_7
        -0x49db3e6b -> :sswitch_a
        -0x46a6a477 -> :sswitch_1
        -0x3c254fe1 -> :sswitch_1
        -0x3624562b -> :sswitch_4
        -0x355bd2aa -> :sswitch_7
        -0x325a0809 -> :sswitch_4
        -0x301e264d -> :sswitch_0
        -0x2034e810 -> :sswitch_a
        -0x1bd8f7f0 -> :sswitch_5
        -0x1572702c -> :sswitch_e
        -0x10dee377 -> :sswitch_d
        -0xf6d67e2 -> :sswitch_e
        -0x85c89ee -> :sswitch_6
        0x4b551de -> :sswitch_c
        0x22ee62c3 -> :sswitch_8
        0x2f54f71a -> :sswitch_d
        0x32e6fddc -> :sswitch_3
        0x330126b0 -> :sswitch_9
        0x36449726 -> :sswitch_c
        0x382373bb -> :sswitch_8
        0x49e3bdd3 -> :sswitch_b
        0x4a469909 -> :sswitch_2
        0x50d3d89a -> :sswitch_5
        0x54bd89d8 -> :sswitch_0
        0x59923ec4 -> :sswitch_2
        0x5b194763 -> :sswitch_b
        0x6d7eae8c -> :sswitch_9
        0x702d8c07 -> :sswitch_6
        0x775c79e9 -> :sswitch_3
    .end sparse-switch
.end method
