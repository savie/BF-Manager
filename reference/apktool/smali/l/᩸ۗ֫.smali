.class public final synthetic Ll/᩸ۗ֫;
.super Ljava/lang/Object;
.source "D2S2"

# interfaces
.implements Ll/᩶ܽ;


# instance fields
.field public final synthetic ܰ:Ll/۫ۗ֫;

.field public final synthetic ᩶:Ll/۠ۖۧ;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۗ֫;Ll/۠ۖۧ;)V
    .locals 6

    const v0, 0x75edebed

    sget v1, Ll/᩺;->۫۬۫:I

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e0\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd87

    const v5, 0x4ff24726

    xor-int/2addr v4, v5

    const v5, 0x1abd1234

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7877

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_8

    goto/16 :goto_2

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v3

    if-ltz v3, :cond_4

    goto/16 :goto_3

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u073d\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4599

    const v5, 0x488cd26e

    xor-int/2addr v4, v5

    const v5, 0x78a1cc16

    goto :goto_0

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v3, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/᩸ۗ֫;->᩶:Ll/۠ۖۧ;

    return-void

    :sswitch_6
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06ec\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x20e7

    const v5, 0x65fff6a4

    xor-int/2addr v4, v5

    const v5, -0x5a48eec9

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a75\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x21d

    const v5, 0x67fba39

    xor-int/2addr v4, v5

    const v5, 0xeac6e79

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a79\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5195

    const v5, -0x7e345f9

    xor-int/2addr v4, v5

    const v5, -0xa7ace0

    goto/16 :goto_0

    .line 3
    :sswitch_9
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u073d\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e41

    const v5, 0x76f2d807

    xor-int/2addr v4, v5

    const v5, -0x493d655b

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05a1\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x648f

    const v5, -0x7c576a7d

    xor-int/2addr v4, v5

    const v5, 0x29454420

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06e8\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xbe7

    const v5, -0x6381f1db

    xor-int/2addr v4, v5

    const v5, 0x26116048

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x655f

    const v5, -0x60e04a24    # -3.381999E-20f

    xor-int/2addr v4, v5

    const v5, -0x6134045d

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u06e7\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2901

    const v5, -0x67d55840

    xor-int/2addr v4, v5

    const v5, 0x7713b4e

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u073a\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5561

    const v5, 0x6cda0fda

    xor-int/2addr v4, v5

    const v5, -0x55dc22eb

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v3

    if-gtz v3, :cond_9

    :goto_3
    const-string v3, "\u06da\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71c9

    const v5, -0x24cac8b8

    xor-int/2addr v4, v5

    const v5, -0x4ba9d1fc

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5bc5

    const v5, -0x41b939eb

    xor-int/2addr v4, v5

    const v5, -0x60d7ecbe

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u1a74\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6fd

    const v5, -0x7f71287b

    xor-int/2addr v4, v5

    const v5, -0x5f8969c0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩸ۗ֫;->ܰ:Ll/۫ۗ֫;

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0730\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x31b5

    const v5, -0x41e164c9

    xor-int/2addr v4, v5

    const v5, -0x7cbd1c12

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x633b

    const v5, 0x292c4874

    xor-int/2addr v4, v5

    const v5, -0x1a1bf156

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x714a59f2 -> :sswitch_4
        -0x6b55eae8 -> :sswitch_0
        -0x656900db -> :sswitch_c
        -0x630a9e53 -> :sswitch_3
        -0x5dc9d863 -> :sswitch_5
        -0x5d26c07b -> :sswitch_3
        -0x5087022e -> :sswitch_6
        -0x405d6a5b -> :sswitch_8
        -0x306a8084 -> :sswitch_4
        -0x21e59557 -> :sswitch_a
        -0x16864567 -> :sswitch_b
        -0x140e6f15 -> :sswitch_a
        -0xfb92480 -> :sswitch_e
        -0xd8fb9da -> :sswitch_2
        -0x1d0ceec -> :sswitch_6
        0x1aa1eb45 -> :sswitch_8
        0x1b84a89d -> :sswitch_9
        0x1cf2c352 -> :sswitch_9
        0x26045f1e -> :sswitch_0
        0x2bb8c402 -> :sswitch_1
        0x3a7e5665 -> :sswitch_1
        0x43799d48 -> :sswitch_e
        0x465277ad -> :sswitch_2
        0x49f2bd0d -> :sswitch_d
        0x4f1265ad -> :sswitch_7
        0x52e3e10d -> :sswitch_5
        0x5d8feb23 -> :sswitch_b
        0x63c68251 -> :sswitch_c
        0x77ea165b -> :sswitch_7
        0x7f7c94cc -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x16753800

    sget v2, Ll/᩺;->۫۬۫:I

    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v4, "\u073a\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6fc1

    const v6, -0x2748c627

    xor-int/2addr v5, v6

    const v6, -0x201a7df2

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x4725

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 0
    iget-object v0, p0, Ll/᩸ۗ֫;->ܰ:Ll/۫ۗ֫;

    .line 1
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_0

    goto/16 :goto_1

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_3

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v4, :cond_b

    goto/16 :goto_3

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v4

    if-eqz v4, :cond_8

    goto/16 :goto_3

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object v1, p0, Ll/᩸ۗ֫;->᩶:Ll/۠ۖۧ;

    invoke-static {v0, v1, p1}, Ll/۫ۗ֫;->ۙ(Ll/۫ۗ֫;Ll/۠ۖۧ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string v4, "\u06df\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3059

    const v6, 0xe11817f

    xor-int/2addr v5, v6

    const v6, -0x6fceb95a

    goto :goto_0

    .line 3
    :sswitch_6
    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u05a1\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x687

    const v6, 0x6ad4e04    # 6.519E-35f

    xor-int/2addr v5, v6

    const v6, -0x6f9e2bb2

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v4, "\u073a\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x58d

    const v6, -0x528b97c9

    xor-int/2addr v5, v6

    const v6, 0x7fc32dc5

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v4, :cond_4

    :cond_3
    const-string v4, "\u06e1\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x36e9

    const v6, -0x244d157d

    xor-int/2addr v5, v6

    const v6, -0x69ab8cbb

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u073d\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2187

    const v6, -0x37688822

    xor-int/2addr v5, v6

    const v6, -0x61b17d3f

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a7a\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6859

    const v6, 0xf5e31be

    xor-int/2addr v5, v6

    const v6, 0x204dee83

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_6

    goto :goto_1

    :cond_6
    const-string v4, "\u0733\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x79

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7bb5

    const v6, 0x75941d42

    xor-int/2addr v5, v6

    const v6, -0x59251a9

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_7

    :goto_1
    const-string v4, "\u0730\u06df"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ea9

    const v6, 0x3b8e9211

    xor-int/2addr v5, v6

    const v6, -0x1aae694d

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u073a\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6915

    const v6, 0x34887730

    xor-int/2addr v5, v6

    const v6, -0x4f5f2109

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06db\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x618b

    const v6, 0x145c99cf

    xor-int/2addr v5, v6

    const v6, 0xbc44a82

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a74\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2a5b

    const v6, -0xedf13f0

    xor-int/2addr v5, v6

    const v6, 0x62326c60

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06dc\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x9ff

    const v6, -0xeaf1bb3

    xor-int/2addr v5, v6

    const v6, 0x2d6efc76

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x785f

    const v6, -0x3d5c2271

    xor-int/2addr v5, v6

    const v6, -0x3b179ede

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_c

    :cond_b
    const-string v4, "\u05a1\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6cb

    const v6, -0x2aa229d0

    xor-int/2addr v5, v6

    const v6, 0x5d6712bb

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6823

    const v6, 0x233c7984

    xor-int/2addr v5, v6

    const v6, 0x5be28bc5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x675a3c01 -> :sswitch_5
        -0x644ddbef -> :sswitch_3
        -0x5913cabc -> :sswitch_6
        -0x57a3489f -> :sswitch_7
        -0x4884d23b -> :sswitch_2
        -0x321821b6 -> :sswitch_8
        -0x2ac1cff3 -> :sswitch_2
        -0x1eece128 -> :sswitch_5
        -0x7367893 -> :sswitch_e
        -0x146c89 -> :sswitch_9
        0xf4d8498 -> :sswitch_0
        0x119a970a -> :sswitch_1
        0x12125a16 -> :sswitch_b
        0x178d746b -> :sswitch_4
        0x1c47ea2f -> :sswitch_d
        0x29e8a6bb -> :sswitch_c
        0x2c35681b -> :sswitch_e
        0x2d3b7e31 -> :sswitch_8
        0x2ef47970 -> :sswitch_c
        0x30de15bf -> :sswitch_4
        0x453f8d43 -> :sswitch_6
        0x46aef885 -> :sswitch_a
        0x58d20511 -> :sswitch_b
        0x5abccf93 -> :sswitch_a
        0x5d29b538 -> :sswitch_9
        0x610102a2 -> :sswitch_d
        0x6dfb3bbb -> :sswitch_7
        0x6dfd72b2 -> :sswitch_0
        0x71b757b4 -> :sswitch_1
        0x7544f86d -> :sswitch_3
    .end sparse-switch
.end method
