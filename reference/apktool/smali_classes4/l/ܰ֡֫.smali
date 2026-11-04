.class public final Ll/ܰ֡֫;
.super Landroid/webkit/WebChromeClient;
.source "N15Q"


# instance fields
.field public final synthetic ۙ:Ll/᩶֡֫;


# direct methods
.method public constructor <init>(Ll/᩶֡֫;)V
    .locals 0

    .line 69
    iput-object p1, p0, Ll/ܰ֡֫;->ۙ:Ll/᩶֡֫;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    const p1, -0x49775191

    sget v0, Ll/ۧ;->ۨۗܰ:I

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    const-string v2, "\u06e7\u06d8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6c5f

    const v4, -0x4346b57c

    xor-int/2addr v3, v4

    const v4, 0x3af2357

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, 0x6a83

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    return-void

    .line 6
    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    sget-boolean v2, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v2, :cond_5

    goto/16 :goto_2

    .line 14
    :sswitch_1
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    sget v2, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v2, :cond_2

    goto/16 :goto_4

    .line 46
    :sswitch_2
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v2

    if-ltz v2, :cond_b

    goto/16 :goto_2

    .line 65
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    goto/16 :goto_2

    .line 72
    :sswitch_4
    iget-object p1, p0, Ll/ܰ֡֫;->ۙ:Ll/᩶֡֫;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    .line 24
    :sswitch_5
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u06d8\u1a75"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x27

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x20cb

    const v4, 0x7079c5b9

    xor-int/2addr v3, v4

    const v4, -0x22763cd5

    goto :goto_0

    .line 23
    :sswitch_6
    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "\u1a77\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x10b7

    const v4, -0x2fcc880f

    xor-int/2addr v3, v4

    const v4, 0x73480a19

    goto :goto_0

    :sswitch_7
    sget v2, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v2, :cond_3

    :cond_2
    const-string v2, "\u06df\u06d6"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x7797

    const v4, 0x3fa3a989

    xor-int/2addr v3, v4

    const v4, 0x696ff9ed

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06ec\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x321b

    const v4, 0x2664c90f

    xor-int/2addr v3, v4

    const v4, -0x4915fb65

    goto/16 :goto_0

    .line 43
    :sswitch_8
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    const-string v2, "\u1a76\u1a76"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x7d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2d01

    const v4, 0x124e3fa7

    xor-int/2addr v3, v4

    const v4, -0x342fbed

    goto/16 :goto_0

    .line 50
    :sswitch_9
    sget v2, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v2, :cond_6

    :cond_5
    :goto_1
    const-string v2, "\u1a77\u0736"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x7b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x28c9

    const v4, -0x31902111    # -1.0060912E9f

    xor-int/2addr v3, v4

    const v4, -0x2e909568

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u06d6\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x6b37

    const v4, 0x354833ab

    xor-int/2addr v3, v4

    const v4, -0x7912e0d9

    goto/16 :goto_0

    .line 34
    :sswitch_a
    sget v2, Ll/ۧ;->ۨۗܰ:I

    if-ltz v2, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v2, "\u06e2\u06e7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x67

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x70b3

    const v4, -0x48ea7fad

    xor-int/2addr v3, v4

    const v4, 0x5dd071ae

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v2, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v2, :cond_8

    :goto_2
    const-string v2, "\u06e4\u0730"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x45

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x553

    const v4, -0x3030b26

    xor-int/2addr v3, v4

    const v4, 0x23a9ebf3

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u073f\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0xd

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x7a13

    const v4, -0x582e7f3e

    xor-int/2addr v3, v4

    const v4, -0x6b798e6e

    goto/16 :goto_0

    .line 50
    :sswitch_c
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_9
    const-string v2, "\u06df\u073f"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x593d

    const v4, -0x2123a833

    xor-int/2addr v3, v4

    const v4, 0x666148c8

    goto/16 :goto_0

    :sswitch_d
    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v2, :cond_a

    :goto_3
    const-string v2, "\u1a79\u073a"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x3f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4fa3

    const v4, 0x2bd33117

    xor-int/2addr v3, v4

    const v4, -0xc455695

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06e8\u1a75"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x1241

    const v4, -0xf96b7a8

    xor-int/2addr v3, v4

    const v4, 0x2c7fdf69

    goto/16 :goto_0

    .line 60
    :sswitch_e
    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v2, :cond_c

    :cond_b
    :goto_4
    const-string v2, "\u05a1\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x56ab

    const v4, -0x1d38c394

    xor-int/2addr v3, v4

    const v4, 0x4b021d3

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u073d\u06e2"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x3d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x31cb

    const v4, -0x266666cb

    xor-int/2addr v3, v4

    const v4, -0x204298a4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b0cd466 -> :sswitch_0
        -0x69ad5960 -> :sswitch_3
        -0x63f98e1a -> :sswitch_c
        -0x576d457b -> :sswitch_b
        -0x4e1a109b -> :sswitch_9
        -0x4c295e7c -> :sswitch_e
        -0x42ec1764 -> :sswitch_4
        -0x3ccde501 -> :sswitch_5
        -0x37fc794b -> :sswitch_1
        -0x31c3d830 -> :sswitch_a
        -0x2ffdc934 -> :sswitch_5
        -0x29e73576 -> :sswitch_b
        -0x2181245e -> :sswitch_4
        -0x13d3e6e4 -> :sswitch_7
        -0xc8bd24e -> :sswitch_6
        -0x472ee92 -> :sswitch_2
        0xdb3aeb7 -> :sswitch_3
        0xf8025f0 -> :sswitch_2
        0x140ff76e -> :sswitch_8
        0x19adef09 -> :sswitch_1
        0x1efd4169 -> :sswitch_a
        0x204e10af -> :sswitch_d
        0x2408ea08 -> :sswitch_6
        0x28d8d555 -> :sswitch_7
        0x290cbcdb -> :sswitch_c
        0x5a1db826 -> :sswitch_8
        0x5dac42a5 -> :sswitch_9
        0x625a4448 -> :sswitch_0
        0x763bc1e7 -> :sswitch_e
        0x7d41ea81 -> :sswitch_d
    .end sparse-switch
.end method
