.class public final synthetic Ll/֫᩵֫;
.super Ljava/lang/Object;
.source "L2RS"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 4

    const v0, -0x3178b887

    sget v1, Ll/᩺;->۫۬۫:I

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    .line 0
    iput p2, p0, Ll/֫᩵֫;->ܰ:I

    iput-object p1, p0, Ll/֫᩵֫;->᩶:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a78\u073f"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x5d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x45ed

    const v3, -0x7b311bc0

    xor-int/2addr p2, v3

    const v3, -0x7deb6416

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6d4b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    sget p1, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06d8\u0733"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5ad9

    const v3, 0x75809947

    xor-int/2addr p2, v3

    const v3, 0x7615067

    goto :goto_0

    .line 3
    :sswitch_1
    sget p1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a78\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x232d

    const v3, 0x22ee4ec8

    xor-int/2addr p2, v3

    const v3, -0x62ae612d

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result p1

    if-ltz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u06da\u06e4"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5d07

    const v3, -0xe8f46a0

    xor-int/2addr p2, v3

    const v3, -0x2e17dfe2

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    :goto_1
    const-string p1, "\u06e7\u0733"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x31

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4319

    const v3, -0x42cefed9

    xor-int/2addr p2, v3

    const v3, 0x3e88e7c7

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz p1, :cond_3

    const-string p1, "\u06da\u06ec"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x5f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1599

    const v3, -0x2a9a5de0

    xor-int/2addr p2, v3

    const v3, 0x64a868ee

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06ec\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x47

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3d11

    const v3, 0x3edc035c    # 0.42971313f

    xor-int/2addr p2, v3

    const v3, 0x7ab409ee

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7017071a -> :sswitch_2
        -0x584e7c42 -> :sswitch_2
        -0x4c4523f7 -> :sswitch_3
        -0x46b5d349 -> :sswitch_5
        -0x44a83312 -> :sswitch_3
        -0x1e6e8179 -> :sswitch_5
        -0x11abcf03 -> :sswitch_1
        -0x8f8fb1f -> :sswitch_4
        0x188350fb -> :sswitch_0
        0x2e7b1018 -> :sswitch_4
        0x3d82d8aa -> :sswitch_1
        0x737cf290 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x323ef8b9

    sget v3, Ll/֡ۖ;->۫ۙ᩶:I

    sget v4, Ll/֫֡;->֫ۙۖ:I

    const-string v5, "\u06d8\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3661

    const v7, -0xa33c0d

    xor-int/2addr v6, v7

    const v7, 0x5a7a79a0

    :goto_0
    xor-int/2addr v5, v7

    :goto_1
    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x5707

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 572
    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_7

    goto/16 :goto_5

    .line 210
    :sswitch_0
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u06df\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6423

    const v7, 0x55221b11

    xor-int/2addr v6, v7

    const v7, -0x6be117b3

    goto :goto_0

    .line 188
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    return-void

    .line 842
    :sswitch_4
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩹ۤ()I

    move-result v5

    invoke-static {v0, v5}, Ll/ۘܶ;->ۢ֨᩶(Ljava/lang/Object;I)V

    goto :goto_2

    .line 841
    :sswitch_5
    invoke-static {v1}, Ll/֫ۤ;->ܽ֨ᩴ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v5}, Ll/֡۟;->ᩴۖ᩺(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 734
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v5, "\u06db\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x41d9

    const v7, 0x7df4ee85

    xor-int/2addr v6, v7

    const v7, 0x2dbab862

    goto :goto_0

    :sswitch_6
    return-void

    .line 9
    :sswitch_7
    check-cast p1, Ll/ܽ֡֫;

    const/4 v0, 0x1

    .line 33
    invoke-static {p1, v0}, Lbin/mt/plus/ShortcutActivity;->ۙ(Ll/ܽ֡֫;Z)V

    return-void

    .line 0
    :sswitch_8
    move-object v0, p1

    check-cast v0, Ll/᩹ۖ᩸;

    .line 839
    invoke-static {}, Ll/᩶᩷ۧ;->ܳ()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v5, "\u073d\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x385d

    const v7, 0x71bd1928

    xor-int/2addr v6, v7

    const v7, -0x7d1766b4

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u06db\u0733"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x51a1

    const v7, -0x359a261e

    xor-int/2addr v6, v7

    const v7, 0x4e0b3afe    # 5.839748E8f

    goto/16 :goto_0

    .line 0
    :sswitch_9
    check-cast p1, Ll/᩵᩵֫;

    sget v0, Ll/᩵᩵֫;->᩺᩷:I

    .line 160
    invoke-static {p1}, Ll/ۘܶ;->ܶ֡ۜ(Ljava/lang/Object;)V

    return-void

    .line 2
    :sswitch_a
    iget p1, p0, Ll/֫᩵֫;->ܰ:I

    .line 4
    iget-object v5, p0, Ll/֫᩵֫;->᩶:Landroid/view/KeyEvent$Callback;

    packed-switch p1, :pswitch_data_0

    const-string p1, "\u06e8\u1a79"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v6, p1, v3

    mul-int/lit16 v6, v6, -0x265

    const v7, -0x502f9db7

    xor-int/2addr v6, v7

    const v7, -0x2eb8e460

    goto :goto_3

    :pswitch_0
    const-string p1, "\u06d8\u073d"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v6, p1, v4

    mul-int/lit16 v6, v6, -0x6029

    const v7, -0x21c106e0

    xor-int/2addr v6, v7

    const v7, -0x33824add    # -6.6507916E7f

    goto :goto_3

    :pswitch_1
    const-string p1, "\u06e2\u06d9"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x7

    xor-int v6, p1, v4

    mul-int/lit16 v6, v6, 0x223

    const v7, 0x4dee9f2c    # 5.004261E8f

    xor-int/2addr v6, v7

    const v7, 0x2d376829

    :goto_3
    xor-int/2addr p1, v7

    move-object v8, v5

    move v5, p1

    move-object p1, v8

    goto/16 :goto_1

    .line 275
    :sswitch_b
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_3

    goto/16 :goto_7

    :cond_3
    const-string v5, "\u06e7\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6c75

    const v7, 0x6672f264

    xor-int/2addr v6, v7

    const v7, -0x666a9079

    goto/16 :goto_0

    .line 192
    :sswitch_c
    sget-boolean v5, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    const-string v5, "\u06da\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x77

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2f1

    const v7, -0x813004e

    xor-int/2addr v6, v7

    const v7, 0x3887758f

    goto/16 :goto_0

    .line 537
    :sswitch_d
    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u06e4\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x883

    const v7, -0x2d4a4796

    xor-int/2addr v6, v7

    const v7, 0xee21a72

    goto/16 :goto_0

    .line 758
    :sswitch_e
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    const-string v5, "\u06eb\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7cbd

    const v7, 0x6a9ab2b1

    xor-int/2addr v6, v7

    const v7, 0x1bf92606

    goto/16 :goto_0

    .line 810
    :sswitch_f
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_8

    :cond_7
    :goto_4
    const-string v5, "\u06dc\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x9c1

    const v7, 0x12cb0227

    xor-int/2addr v6, v7

    const v7, -0x1168adab

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06db\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x265d

    const v7, -0x4687d8a0

    xor-int/2addr v6, v7

    const v7, -0x2492dbaf

    goto/16 :goto_0

    .line 616
    :sswitch_10
    sget v5, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_5
    const-string v5, "\u06e8\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x30cf

    const v7, 0x3377532c

    xor-int/2addr v6, v7

    const v7, 0x6756a274

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e7\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x201f

    const v7, 0xfb6bca6

    xor-int/2addr v6, v7

    const v7, 0x46fdf9ec

    goto/16 :goto_0

    .line 320
    :sswitch_11
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result v5

    if-nez v5, :cond_b

    :goto_6
    const-string v5, "\u06dc\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1889

    const v7, -0x6b2baf08

    xor-int/2addr v6, v7

    const v7, 0x4b4c8211    # 1.3402641E7f

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073a\u1a73"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5d05

    const v7, 0x7872e0ab

    xor-int/2addr v6, v7

    const v7, -0x1ae4bef6

    goto/16 :goto_0

    .line 829
    :sswitch_12
    sget v5, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v5, :cond_c

    goto :goto_7

    :cond_c
    const-string v5, "\u06ec\u073f"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x31bb

    const v7, -0x123d1e27

    xor-int/2addr v6, v7

    const v7, 0x404e5c91

    goto/16 :goto_0

    .line 827
    :sswitch_13
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_d

    :goto_7
    const-string v5, "\u073a\u06d7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2ebd

    const v7, 0x32a499ef

    xor-int/2addr v6, v7

    const v7, 0x79bdcdd

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u073d\u05a8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6fe9

    const v7, -0x309a7f4d

    xor-int/2addr v6, v7

    const v7, -0x4d2cdf31

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x764ab7e7 -> :sswitch_8
        -0x697fe258 -> :sswitch_0
        -0x67d9d4e3 -> :sswitch_7
        -0x5ce07ebd -> :sswitch_1
        -0x54b00bde -> :sswitch_1
        -0x538584a1 -> :sswitch_10
        -0x537026eb -> :sswitch_3
        -0x46b49248 -> :sswitch_12
        -0x3f2be33a -> :sswitch_f
        -0x3b161779 -> :sswitch_10
        -0x38e8dd70 -> :sswitch_5
        -0x379c6c06 -> :sswitch_8
        -0x3647cef1 -> :sswitch_b
        -0x3376a79c -> :sswitch_c
        -0x31e5828c -> :sswitch_9
        -0x2f0b8d63 -> :sswitch_a
        -0x24511baa -> :sswitch_b
        -0xd34e361 -> :sswitch_13
        -0x80e577d -> :sswitch_f
        -0x1efff38 -> :sswitch_12
        0x9fa4268 -> :sswitch_5
        0x1048d9a7 -> :sswitch_d
        0x174eccdb -> :sswitch_a
        0x195006d5 -> :sswitch_e
        0x2cbff04d -> :sswitch_4
        0x2e37beab -> :sswitch_2
        0x35b4994d -> :sswitch_e
        0x3be5fa32 -> :sswitch_6
        0x4038c128 -> :sswitch_11
        0x44507cfe -> :sswitch_11
        0x4616dd74 -> :sswitch_2
        0x4f52a477 -> :sswitch_3
        0x51ed7a22 -> :sswitch_0
        0x52983b73 -> :sswitch_d
        0x5a0730a0 -> :sswitch_6
        0x5b0c55cf -> :sswitch_7
        0x5e646a81 -> :sswitch_13
        0x61d8f22b -> :sswitch_9
        0x644e93a0 -> :sswitch_c
        0x76b83427 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
