.class public final synthetic Ll/ܳۡ᩻;
.super Ljava/lang/Object;
.source "T6NI"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ֡:Ll/ᩳ۠᩻;

.field public final synthetic ܰ:Ljava/util/List;

.field public final synthetic ܿ:Ll/۠ۖۧ;

.field public final synthetic ᩶:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroid/app/Activity;Ll/۠ۖۧ;Ll/ᩳ۠᩻;)V
    .locals 6

    const v0, -0xec9ccb7

    sget v1, Ll/֫֡;->֫ۙۖ:I

    sget v2, Ll/ۖ;->ܿۚ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24cd

    const v5, 0x272553de

    xor-int/2addr v4, v5

    const v5, -0x7c05c520

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x637b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v3, :cond_b

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v3, :cond_5

    goto/16 :goto_4

    .line 3
    :sswitch_2
    sget-boolean v3, Ll/֡ᩴ;->۬֡᩺:Z

    if-nez v3, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_2

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ܳۡ᩻;->ܿ:Ll/۠ۖۧ;

    iput-object p4, p0, Ll/ܳۡ᩻;->֡:Ll/ᩳ۠᩻;

    return-void

    :cond_0
    const-string v3, "\u06e0\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4fb7

    const v5, 0x5fa705b1

    xor-int/2addr v4, v5

    const v5, 0x75c7de9e

    goto :goto_0

    .line 1
    :sswitch_6
    sget v3, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e7\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3653

    const v5, -0x6dc3e75b

    xor-int/2addr v4, v5

    const v5, 0x18f97c70

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06dc\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x261f

    const v5, 0x10ac5ee8

    xor-int/2addr v4, v5

    const v5, 0x3b8f58ad

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u0736\u1a7a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6321

    const v5, -0x2f8ed04b

    xor-int/2addr v4, v5

    const v5, -0x5a38c164

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06e0\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1273

    const v5, 0x62ed100f

    xor-int/2addr v4, v5

    const v5, 0x2fd6e5f3

    goto/16 :goto_0

    .line 2
    :sswitch_a
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v3

    if-eqz v3, :cond_6

    :cond_5
    :goto_1
    const-string v3, "\u06df\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5225

    const v5, 0x56b5ddac

    xor-int/2addr v4, v5

    const v5, -0x10dac57e

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a73\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3fcb

    const v5, 0x7ea30a42

    xor-int/2addr v4, v5

    const v5, 0xed71a77

    goto/16 :goto_0

    .line 3
    :sswitch_b
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v3

    if-eqz v3, :cond_7

    :goto_2
    const-string v3, "\u06d6\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6d47

    const v5, 0x1371cfaa

    xor-int/2addr v4, v5

    const v5, 0x72010a81

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06eb\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x669

    const v5, 0x797ae190

    xor-int/2addr v4, v5

    const v5, 0x166eb09c

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06e4\u06e0"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2561

    const v5, 0x7c770395

    xor-int/2addr v4, v5

    const v5, 0xedb6daa

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06eb\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x427d

    const v5, -0x617e3818

    xor-int/2addr v4, v5

    const v5, -0x7b46aa1a

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u1a7a\u073a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2791

    const v5, 0x72698ab5

    xor-int/2addr v4, v5

    const v5, -0x45314e0e

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6de5

    const v5, -0x57301e36

    xor-int/2addr v4, v5

    const v5, 0x63954daa

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܳۡ᩻;->ܰ:Ljava/util/List;

    iput-object p2, p0, Ll/ܳۡ᩻;->᩶:Landroid/app/Activity;

    .line 1
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_c

    :cond_b
    const-string v3, "\u06e1\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5847

    const v5, 0x688f1d9b

    xor-int/2addr v4, v5

    const v5, 0x78ae60a9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b83

    const v5, -0x28587606

    xor-int/2addr v4, v5

    const v5, -0x64bc0f08

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e658346 -> :sswitch_4
        -0x793ab358 -> :sswitch_a
        -0x69862185 -> :sswitch_a
        -0x6691723d -> :sswitch_5
        -0x59bbdeb2 -> :sswitch_2
        -0x503e580e -> :sswitch_8
        -0x4cd2615f -> :sswitch_6
        -0x36854182 -> :sswitch_9
        -0x1e39f600 -> :sswitch_7
        -0x1bf46c65 -> :sswitch_2
        -0x16235170 -> :sswitch_c
        -0xa5925c6 -> :sswitch_d
        -0x9c83456 -> :sswitch_5
        -0x32849c4 -> :sswitch_9
        0x205a4a6 -> :sswitch_e
        0xcd8665e -> :sswitch_1
        0x17be59a8 -> :sswitch_0
        0x184f13ca -> :sswitch_8
        0x1b54d8de -> :sswitch_d
        0x1bab823a -> :sswitch_0
        0x250f7157 -> :sswitch_b
        0x280f9194 -> :sswitch_7
        0x35f84269 -> :sswitch_6
        0x36c78a66 -> :sswitch_e
        0x3a9e3fe9 -> :sswitch_3
        0x3b60106d -> :sswitch_4
        0x3f201b7b -> :sswitch_3
        0x3f38053b -> :sswitch_c
        0x639bab87 -> :sswitch_b
        0x79a41578 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final accept(I)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x2461afa1

    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    const-string v5, "\u073f\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x31e9

    const v7, 0x50843b94

    xor-int/2addr v6, v7

    const v7, 0x405a3d39

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x7f1f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 31
    invoke-static {v0, p1}, Ll/ۗ᩸;->ܰ֫ۢ(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۡ᩻;

    .line 32
    iget-boolean v5, v1, Ll/᩸ۡ᩻;->ۙ:Z

    if-eqz v5, :cond_3

    const-string v5, "\u073f\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x70c1

    const v7, 0x3b5b1edf

    xor-int/2addr v6, v7

    const v7, 0x7c4c32ba

    goto :goto_0

    .line 24
    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v5, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u0730\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xf6f

    const v7, 0x4c38acbb    # 4.8411372E7f

    xor-int/2addr v6, v7

    const v7, 0x7c92bdbd

    goto :goto_0

    .line 20
    :sswitch_1
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    sget-boolean v5, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v5, :cond_6

    goto :goto_1

    .line 2
    :sswitch_2
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-gez v5, :cond_c

    goto :goto_1

    .line 21
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    :sswitch_5
    return-void

    .line 33
    :sswitch_6
    new-instance v5, Ll/۫ۡ᩻;

    iget-object v6, p0, Ll/ܳۡ᩻;->ܿ:Ll/۠ۖۧ;

    .line 29
    sget v7, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v7, :cond_1

    goto/16 :goto_4

    .line 33
    :cond_1
    iget-object v7, p0, Ll/ܳۡ᩻;->֡:Ll/ᩳ۠᩻;

    sget-boolean v8, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v8, :cond_2

    :goto_1
    const-string v5, "\u06da\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x33af

    const v7, -0x240b89d0

    xor-int/2addr v6, v7

    const v7, 0x2f59eed9

    goto/16 :goto_0

    :cond_2
    invoke-direct {v5, v6, v7, v1}, Ll/۫ۡ᩻;-><init>(Ll/۠ۖۧ;Ll/ᩳ۠᩻;Ll/᩸ۡ᩻;)V

    iget-object p1, p0, Ll/ܳۡ᩻;->᩶:Landroid/app/Activity;

    invoke-static {p1, v1, v5}, Ll/ۧۡ᩻;->ۙ(Landroid/app/Activity;Ll/᩸ۡ᩻;Ljava/lang/Runnable;)V

    return-void

    :cond_3
    const-string v5, "\u1a7b\u06ec"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1147

    const v7, 0x66d5afc2

    xor-int/2addr v6, v7

    const v7, -0x17921ec9

    goto/16 :goto_0

    .line 31
    :sswitch_7
    iget-object v0, p0, Ll/ܳۡ᩻;->ܰ:Ljava/util/List;

    .line 2
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u06d7\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3871

    const v7, -0x3e88140b

    xor-int/2addr v6, v7

    const v7, -0x54e07b75

    goto/16 :goto_0

    .line 12
    :sswitch_8
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u073f\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x535b

    const v7, 0x3ee9932a

    xor-int/2addr v6, v7

    const v7, 0x1705e88

    goto/16 :goto_0

    .line 22
    :sswitch_9
    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u06e2\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x52bb

    const v7, -0x128ad0b5

    xor-int/2addr v6, v7

    const v7, 0x11ee9a6e

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a75\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x14b3

    const v7, 0x9f605da

    xor-int/2addr v6, v7

    const v7, 0x8871f13

    goto/16 :goto_0

    .line 9
    :sswitch_a
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v5

    if-gtz v5, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v5, "\u06db\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2021

    const v7, -0x78cab585

    xor-int/2addr v6, v7

    const v7, 0x26624b78

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06df\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3857

    const v7, 0x11d73e43

    xor-int/2addr v6, v7

    const v7, 0x73c6447f

    goto/16 :goto_0

    .line 11
    :sswitch_c
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_a

    :goto_3
    const-string v5, "\u06e7\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x777b

    const v7, -0x712356c9

    xor-int/2addr v6, v7

    const v7, 0x616599a1

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u05a8\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6195

    const v7, -0x5fa3601d

    xor-int/2addr v6, v7

    const v7, -0x3229d0ae

    goto/16 :goto_0

    .line 32
    :sswitch_d
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_b

    goto :goto_4

    :cond_b
    const-string v5, "\u0730\u1a73"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5c0f

    const v7, 0x76d1e97a

    xor-int/2addr v6, v7

    const v7, -0x5f3c05d1

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v5

    if-eqz v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u1a7a\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7d71

    const v7, -0x75d9d50f    # -8.000686E-33f

    xor-int/2addr v6, v7

    const v7, 0x1531b51

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a73\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5449

    const v7, 0x6a419d76

    xor-int/2addr v6, v7

    const v7, -0x1ad46d08

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7649a7b8 -> :sswitch_3
        -0x6a49c46f -> :sswitch_8
        -0x64c37400 -> :sswitch_e
        -0x649b44e9 -> :sswitch_4
        -0x575f3685 -> :sswitch_a
        -0x569f2e32 -> :sswitch_d
        -0x53506b56 -> :sswitch_d
        -0x4e78e6bd -> :sswitch_6
        -0x3210be44 -> :sswitch_6
        -0x2d7575d7 -> :sswitch_8
        -0x25e90c88 -> :sswitch_7
        -0x1570930e -> :sswitch_7
        -0x10c67ab5 -> :sswitch_9
        -0x10754944 -> :sswitch_c
        -0xf2a5bbf -> :sswitch_b
        -0xcee89cb -> :sswitch_1
        -0xbc09dca -> :sswitch_4
        -0x90d4734 -> :sswitch_a
        0x51d9ef3 -> :sswitch_c
        0x1077818d -> :sswitch_5
        0x1504a685 -> :sswitch_e
        0x1d108a4b -> :sswitch_b
        0x35e5d556 -> :sswitch_1
        0x3b23055e -> :sswitch_0
        0x3db81879 -> :sswitch_0
        0x3f98574e -> :sswitch_5
        0x4e199529 -> :sswitch_3
        0x55ce0c75 -> :sswitch_2
        0x6066e3cc -> :sswitch_2
        0x692b251d -> :sswitch_9
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۘۧۗ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
