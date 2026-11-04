.class public final synthetic Ll/ܰ᩹֫;
.super Ljava/lang/Object;
.source "X2T2"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ll/᩸᩺֫;

.field public final synthetic ܰ:Ll/᩶᩹֫;

.field public final synthetic ܿ:Z

.field public final synthetic ᩶:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ll/᩶᩹֫;Ljava/util/List;ZLl/᩸᩺֫;)V
    .locals 6

    const v0, 0x457ab550

    sget v1, Ll/ۖ;->ܿۚ֡:I

    sget v2, Ll/֨ܿ;->᩹᩻۟:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a78\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x23d9

    const v5, 0x72c905bf

    xor-int/2addr v4, v5

    const v5, 0x2acde8d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x50eb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v3

    if-lez v3, :cond_9

    goto :goto_1

    .line 0
    :sswitch_1
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_b

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p3, p0, Ll/ܰ᩹֫;->ܿ:Z

    iput-object p4, p0, Ll/ܰ᩹֫;->֡:Ll/᩸᩺֫;

    return-void

    :sswitch_6
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a2f

    const v5, -0x52ab31f8

    xor-int/2addr v4, v5

    const v5, -0x4a5a69b4

    goto :goto_0

    :cond_1
    const-string v3, "\u1a76\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7019

    const v5, 0xb54b473

    xor-int/2addr v4, v5

    const v5, 0x50db3f59

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u06e7\u05a8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7df

    const v5, 0x74b13c18

    xor-int/2addr v4, v5

    const v5, -0x29c6db15

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u073f\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a23

    const v5, 0x432cbbc7

    xor-int/2addr v4, v5

    const v5, -0x63eaa882

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u06d9\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2db

    const v5, 0xf233876

    xor-int/2addr v4, v5

    const v5, -0xd8eb1d9

    goto/16 :goto_0

    .line 1
    :sswitch_9
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v3

    if-eqz v3, :cond_5

    :goto_2
    const-string v3, "\u0736\u06e4"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1fe3

    const v5, 0x1547b0cd

    xor-int/2addr v4, v5

    const v5, 0x99d5172

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a76\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3467

    const v5, 0x169c21cc

    xor-int/2addr v4, v5

    const v5, -0xb52c1ec

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u1a73\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4817

    const v5, 0x4d6e9575    # 2.5017326E8f

    xor-int/2addr v4, v5

    const v5, 0x167b5f10

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-gtz v3, :cond_7

    :goto_3
    const-string v3, "\u0730\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x859

    const v5, 0x41f4c2cb

    xor-int/2addr v4, v5

    const v5, 0x12cc282b

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5857

    const v5, 0x7aeadd16

    xor-int/2addr v4, v5

    const v5, 0x7b7bbbb1

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06dc\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x19

    const v5, -0x1133b65c

    xor-int/2addr v4, v5

    const v5, 0x36b9b1d3

    goto/16 :goto_0

    .line 3
    :sswitch_d
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06eb\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x2d

    const v5, 0x76013d8

    xor-int/2addr v4, v5

    const v5, -0x39cd535f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06da\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6be5

    const v5, 0x21b02808

    xor-int/2addr v4, v5

    const v5, 0x3b501fd5

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܰ᩹֫;->ܰ:Ll/᩶᩹֫;

    iput-object p2, p0, Ll/ܰ᩹֫;->᩶:Ljava/util/List;

    .line 3
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_c

    :cond_b
    const-string v3, "\u06d6\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ab1

    const v5, -0x7a61464b

    xor-int/2addr v4, v5

    const v5, 0x3b873174

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1273

    const v5, -0x620fec27

    xor-int/2addr v4, v5

    const v5, 0x5f7c9c63

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x780a6ef8 -> :sswitch_e
        -0x7675d6eb -> :sswitch_0
        -0x6fde4ad8 -> :sswitch_b
        -0x5933006a -> :sswitch_3
        -0x4556b0e3 -> :sswitch_2
        -0x42a54cf4 -> :sswitch_c
        -0x37928d08 -> :sswitch_5
        -0x35c5a4b8 -> :sswitch_7
        -0x30da35fb -> :sswitch_e
        -0x1a2d0473 -> :sswitch_d
        -0xd3f6891 -> :sswitch_d
        -0xa50080c -> :sswitch_0
        -0x7742987 -> :sswitch_a
        -0x6841c7a -> :sswitch_7
        0x56d2511 -> :sswitch_4
        0xf778af2 -> :sswitch_9
        0x150b7826 -> :sswitch_2
        0x1df87df1 -> :sswitch_5
        0x2f9a5f75 -> :sswitch_6
        0x366349ba -> :sswitch_a
        0x3a434112 -> :sswitch_c
        0x3eab6887 -> :sswitch_4
        0x451422d2 -> :sswitch_b
        0x4edf35a9 -> :sswitch_8
        0x5236afac -> :sswitch_8
        0x562e6143 -> :sswitch_3
        0x5f0b2db4 -> :sswitch_1
        0x60aaaeba -> :sswitch_1
        0x6a625f3d -> :sswitch_9
        0x78b53029 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x70dd65d2

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v5, "\u06df\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5f23

    const v7, -0x47980e09    # -5.530004E-5f

    xor-int/2addr v6, v7

    const v7, -0x73978cfa

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x1a1b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v5, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v5, :cond_8

    goto/16 :goto_2

    .line 2
    :sswitch_1
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-lez v5, :cond_a

    goto :goto_1

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u1a79\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1d4f

    const v7, 0x3c717c6

    xor-int/2addr v6, v7

    const v7, 0xd29c933

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    goto/16 :goto_2

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/ܰ᩹֫;->ܰ:Ll/᩶᩹֫;

    iget-object v3, p0, Ll/ܰ᩹֫;->᩶:Ljava/util/List;

    invoke-static {v2, v3, v0, v1}, Ll/᩶᩹֫;->ۙ(Ll/᩶᩹֫;Ljava/util/List;ZLl/᩸᩺֫;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/ܰ᩹֫;->֡:Ll/᩸᩺֫;

    sget v5, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v5, "\u06d6\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x52cb

    const v7, -0x73d01d48

    xor-int/2addr v6, v7

    const v7, -0x4ee7201b

    goto :goto_0

    :sswitch_6
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v5, "\u06e2\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3b1f

    const v7, -0x7b935387

    xor-int/2addr v6, v7

    const v7, -0x397f0431

    goto :goto_0

    :sswitch_7
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u1a76\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x22ed

    const v7, 0x37bb876

    xor-int/2addr v6, v7

    const v7, 0x5c523bd8

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v5, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u073a\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x66ff

    const v7, -0x46f8b636

    xor-int/2addr v6, v7

    const v7, -0x1e494f74

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06d7\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7135

    const v7, -0xccd0e05

    xor-int/2addr v6, v7

    const v7, 0x1dd2b439

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u05a8\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x48cd

    const v7, -0x2a3e8eee

    xor-int/2addr v6, v7

    const v7, -0x2ef089c1

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_7

    :goto_2
    const-string v5, "\u1a7b\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5f27

    const v7, 0x257e4be9

    xor-int/2addr v6, v7

    const v7, -0x942f69

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u0733\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1729

    const v7, 0x6d5c9073

    xor-int/2addr v6, v7

    const v7, -0x55fa9dcc

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_9

    :cond_8
    :goto_3
    const-string v5, "\u073f\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xfc9

    const v7, 0x7a93fec2

    xor-int/2addr v6, v7

    const v7, -0x7d06bb31

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06df\u1a75"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x35d5

    const v7, 0x63a879cb

    xor-int/2addr v6, v7

    const v7, 0x4e7282f8

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_4
    const-string v5, "\u1a7a\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x127f

    const v7, -0x2d287367

    xor-int/2addr v6, v7

    const v7, 0x2e6a329c

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e0\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7131

    const v7, 0x44c19d96

    xor-int/2addr v6, v7

    const v7, 0x14c27e03

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-boolean v0, p0, Ll/ܰ᩹֫;->ܿ:Z

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_5
    const-string v5, "\u06e8\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x44cb

    const v7, -0x22fcbb38

    xor-int/2addr v6, v7

    const v7, 0x107bb2f0

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d8\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x767f

    const v7, -0x28d4182c

    xor-int/2addr v6, v7

    const v7, -0x49e2a2d0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x701636aa -> :sswitch_e
        -0x6ec7c022 -> :sswitch_a
        -0x59a5ff3a -> :sswitch_1
        -0x5467dd74 -> :sswitch_9
        -0x44551447 -> :sswitch_5
        -0x3b12abdb -> :sswitch_d
        -0x3aea0a1d -> :sswitch_7
        -0x34701ab4 -> :sswitch_4
        -0x2f6d9a71 -> :sswitch_a
        -0x2cfe3074 -> :sswitch_9
        -0x264f941e -> :sswitch_5
        -0x21b4081d -> :sswitch_0
        -0x12560a58 -> :sswitch_e
        -0x2fb8141 -> :sswitch_b
        0x30e5dab -> :sswitch_d
        0xd2d7770 -> :sswitch_b
        0xedad7c1 -> :sswitch_0
        0x1c153fe0 -> :sswitch_c
        0x24bf79ec -> :sswitch_2
        0x26c694d4 -> :sswitch_6
        0x29894dc7 -> :sswitch_3
        0x2e3a04f2 -> :sswitch_1
        0x35b9dd71 -> :sswitch_8
        0x3e23bc18 -> :sswitch_4
        0x535fea79 -> :sswitch_6
        0x53f29cf5 -> :sswitch_7
        0x54fee887 -> :sswitch_2
        0x6c71770a -> :sswitch_8
        0x6e554578 -> :sswitch_c
        0x73df11e8 -> :sswitch_3
    .end sparse-switch
.end method
