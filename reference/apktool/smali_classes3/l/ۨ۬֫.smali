.class public final synthetic Ll/ۨ۬֫;
.super Ljava/lang/Object;
.source "H6HS"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܰ:Ll/ۢ۬֫;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ll/ۢ۬֫;IILjava/lang/String;)V
    .locals 6

    const v0, 0x530bd1a6

    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v2, Ll/ۘܶ;->ܶ᩵ۢ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x76a7

    const v5, -0x307359f3

    xor-int/2addr v4, v5

    const v5, 0x38c6f5b4

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x27c5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_a

    goto/16 :goto_3

    .line 0
    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-gez v3, :cond_8

    goto/16 :goto_1

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p3, p0, Ll/ۨ۬֫;->ܿ:I

    iput-object p4, p0, Ll/ۨ۬֫;->֡:Ljava/lang/String;

    return-void

    .line 1
    :sswitch_6
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u1a73\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x302b

    const v5, 0x6d34441a

    xor-int/2addr v4, v5

    const v5, -0x4eef3a41

    goto :goto_0

    :cond_0
    const-string v3, "\u06d6\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e25

    const v5, -0x4fb9ab7c

    xor-int/2addr v4, v5

    const v5, 0x339b609

    goto :goto_0

    .line 4
    :sswitch_7
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a7b\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5d67

    const v5, -0x70bc22a0

    xor-int/2addr v4, v5

    const v5, -0x2696a41b

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u06e0\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x284f

    const v5, 0x95ba486

    xor-int/2addr v4, v5

    const v5, -0x327c7c6c    # -2.758048E8f

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a77\u0730"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6775

    const v5, -0x53a60f1b

    xor-int/2addr v4, v5

    const v5, -0x50216730

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u0730\u0730"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x563b

    const v5, 0x124415eb

    xor-int/2addr v4, v5

    const v5, -0x6c730fb0

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7851

    const v5, -0x27053133

    xor-int/2addr v4, v5

    const v5, -0x6bf25da0

    goto/16 :goto_0

    .line 0
    :sswitch_b
    sget v3, Ll/ۖ;->ܿۚ֡:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x357f

    const v5, -0x12b470d7

    xor-int/2addr v4, v5

    const v5, -0x61d1eed9

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a21

    const v5, 0x6752271b

    xor-int/2addr v4, v5

    const v5, -0x668816d3

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06df\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x13f1

    const v5, 0x1c6d7cc8

    xor-int/2addr v4, v5

    const v5, 0x3f0de33b

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x576f

    const v5, 0x24bc5e29

    xor-int/2addr v4, v5

    const v5, 0x47602076

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a78\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x676b

    const v5, -0x3bc73613

    xor-int/2addr v4, v5

    const v5, 0x7847bbb2

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u06e7\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xf41

    const v5, 0x4fe5a7ad

    xor-int/2addr v4, v5

    const v5, -0x41682dd

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۨ۬֫;->ܰ:Ll/ۢ۬֫;

    iput p2, p0, Ll/ۨ۬֫;->᩶:I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v3

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u06e0\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x29df

    const v5, 0x729302fd

    xor-int/2addr v4, v5

    const v5, 0x3bbf1cbd

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a75\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x13e7

    const v5, -0xd65f932

    xor-int/2addr v4, v5

    const v5, 0x4a1ea25d    # 2599063.2f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ab9873a -> :sswitch_5
        -0x7645fa31 -> :sswitch_2
        -0x744a3a6b -> :sswitch_7
        -0x727b6595 -> :sswitch_5
        -0x701f41f9 -> :sswitch_0
        -0x5c1f0fba -> :sswitch_0
        -0x49264748 -> :sswitch_e
        -0x479a1613 -> :sswitch_d
        -0x3a57a72b -> :sswitch_4
        -0x35876278 -> :sswitch_8
        -0x310c4204 -> :sswitch_c
        -0x2f836c3b -> :sswitch_b
        -0x221f4d31 -> :sswitch_3
        -0x20906759 -> :sswitch_1
        -0x128f216d -> :sswitch_d
        -0x1219e72a -> :sswitch_b
        -0xc07e27b -> :sswitch_6
        -0xb3938ad -> :sswitch_2
        -0x143a910 -> :sswitch_8
        0x17f8645 -> :sswitch_a
        0x54c8716 -> :sswitch_4
        0x6355bd4 -> :sswitch_e
        0xc05e53f -> :sswitch_a
        0x22ba44c5 -> :sswitch_9
        0x24a0cc7c -> :sswitch_3
        0x2f751851 -> :sswitch_6
        0x49e218a3 -> :sswitch_9
        0x4fc1361d -> :sswitch_1
        0x565ac9d7 -> :sswitch_c
        0x7ab39c00 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x784cba91

    sget v3, Ll/֡۟;->᩶᩺ܰ:I

    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v5, "\u06d6\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x66c1

    const v7, 0x4978694

    xor-int/2addr v6, v7

    const v7, -0x19309d0a

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x2237

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    .line 2
    :sswitch_0
    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v5, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v5, "\u1a79\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5e19

    const v7, 0x1a2a4d81

    xor-int/2addr v6, v7

    const v7, -0x30575ea3

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_2

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    return-void

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/ۨ۬֫;->ܰ:Ll/ۢ۬֫;

    iget v3, p0, Ll/ۨ۬֫;->᩶:I

    invoke-static {v2, v3, v0, v1}, Ll/ۢ۬֫;->ۤ(Ll/ۢ۬֫;IILjava/lang/String;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/ۨ۬֫;->֡:Ljava/lang/String;

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u073a\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x23f9

    const v7, -0x7f33a8c1

    xor-int/2addr v6, v7

    const v7, -0x63fcee5c

    goto :goto_0

    :sswitch_6
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u073f\u05a1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x33

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1dd7

    const v7, -0x70841cab

    xor-int/2addr v6, v7

    const v7, 0x1b734232

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget v5, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v5, :cond_4

    :cond_3
    const-string v5, "\u073d\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xaed

    const v7, -0x42ca441d

    xor-int/2addr v6, v7

    const v7, -0x46facfe6

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06d7\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5327

    const v7, -0x402f77ea

    xor-int/2addr v6, v7

    const v7, -0x34f8aa34    # -8869324.0f

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06db\u1a78"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5575

    const v7, 0x28e97bc3

    xor-int/2addr v6, v7

    const v7, -0x4510bbdb

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u1a76\u06e2"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7561

    const v7, 0x5480da60

    xor-int/2addr v6, v7

    const v7, 0x5cb0d46a

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u06dc\u06eb"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x134f

    const v7, 0x473bdd26

    xor-int/2addr v6, v7

    const v7, -0x6f03d1c3

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_8

    :goto_2
    const-string v5, "\u06eb\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7f49

    const v7, -0x69398c12

    xor-int/2addr v6, v7

    const v7, 0xf1556c5

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06eb\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6ab

    const v7, 0x22cfe531

    xor-int/2addr v6, v7

    const v7, -0x6d8b040c

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v5, Ll/᩺;->۫۬۫:I

    if-gtz v5, :cond_9

    :goto_3
    const-string v5, "\u06e8\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1fb

    const v7, 0x5db72f8c    # 1.6499904E18f

    xor-int/2addr v6, v7

    const v7, -0x1a3508b2    # -1.1981E23f

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06db\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5085

    const v7, 0x7d303d8d

    xor-int/2addr v6, v7

    const v7, -0x531db6c6

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget-boolean v5, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u06df\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x67

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x114b

    const v7, 0xacbc6eb

    xor-int/2addr v6, v7

    const v7, 0x6ed639f6

    goto/16 :goto_0

    :sswitch_e
    iget v0, p0, Ll/ۨ۬֫;->ܿ:I

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u1a7b\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xcc9

    const v7, -0x4c80374f

    xor-int/2addr v6, v7

    const v7, 0x74e366ff

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a74\u06d8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7e21

    const v7, 0x672c76c7

    xor-int/2addr v6, v7

    const v7, -0x4e60cb21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d8ea72b -> :sswitch_9
        -0x7a405a56 -> :sswitch_3
        -0x72b94fdc -> :sswitch_e
        -0x6c5f5b77 -> :sswitch_4
        -0x6a56cd39 -> :sswitch_7
        -0x609421cb -> :sswitch_6
        -0x5f19e72c -> :sswitch_a
        -0x477a3818 -> :sswitch_4
        -0x46660873 -> :sswitch_6
        -0x42cd4145 -> :sswitch_a
        -0x1cbdeeb6 -> :sswitch_b
        -0x1536f6d7 -> :sswitch_1
        -0xe3bdbc3 -> :sswitch_e
        -0xe1e6936 -> :sswitch_9
        -0x36404f4 -> :sswitch_0
        0x1d3d2643 -> :sswitch_7
        0x1f34afc0 -> :sswitch_b
        0x28ff75e2 -> :sswitch_d
        0x29cc45bb -> :sswitch_d
        0x2cde3a63 -> :sswitch_8
        0x33d993c4 -> :sswitch_0
        0x3d23e067 -> :sswitch_3
        0x47a642fe -> :sswitch_c
        0x49eb484d -> :sswitch_1
        0x600c5742 -> :sswitch_5
        0x6916a21b -> :sswitch_2
        0x6b699538 -> :sswitch_c
        0x6c89c94e -> :sswitch_2
        0x71912d35 -> :sswitch_5
        0x73f57759 -> :sswitch_8
    .end sparse-switch
.end method
