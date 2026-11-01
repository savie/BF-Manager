.class public final Ll/ۗܶۘ;
.super Landroid/webkit/WebViewClient;
.source "N15Q"


# instance fields
.field public final synthetic ۙ:Ll/ܰ᩸ۘ;


# direct methods
.method public constructor <init>(Ll/ܰ᩸ۘ;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/ۗܶۘ;->ۙ:Ll/ܰ᩸ۘ;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    const/4 p1, 0x0

    const p2, -0x21cf874f

    sget p3, Ll/ۗ᩺;->ۢۜ᩶:I

    sget v0, Ll/֡ܳ;->֡۠ۧ:I

    const-string v1, "\u05ab\u1a7a"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x50cd

    const v3, -0x4bfbdb1f

    xor-int/2addr v2, v3

    const v3, -0x43179d23

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p2, v0

    mul-int/lit16 p2, p2, -0x6b2d

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v2

    xor-int/2addr p2, v1

    sparse-switch p2, :sswitch_data_0

    return-void

    .line 31
    :sswitch_0
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz v1, :cond_8

    goto/16 :goto_5

    :sswitch_1
    sget v1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v1, :cond_c

    goto/16 :goto_4

    :sswitch_2
    sget v1, Ll/֡֡;->᩶ۤ۠:I

    if-gtz v1, :cond_a

    goto :goto_1

    .line 8
    :sswitch_3
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    :goto_1
    const-string v1, "\u06e7\u06e2"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x23

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x359d

    const v3, 0xe9dc2c8

    xor-int/2addr v2, v3

    const v3, -0x1ddf9d2a

    goto :goto_0

    .line 47
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    return-void

    .line 64
    :sswitch_5
    invoke-static {p1}, Ll/ܰ᩸ۘ;->ܰ(Ll/ܰ᩸ۘ;)Ll/ܿܿۚ;

    move-result-object v1

    invoke-static {v1}, Ll/֨᩺;->᩹ܽۧ(Ljava/lang/Object;)V

    .line 65
    invoke-static {p1}, Ll/ܰ᩸ۘ;->ۨ(Ll/ܰ᩸ۘ;)V

    goto :goto_2

    .line 63
    :sswitch_6
    iget-object p1, p0, Ll/ۗܶۘ;->ۙ:Ll/ܰ᩸ۘ;

    invoke-static {p1}, Ll/ܰ᩸ۘ;->ܰ(Ll/ܰ᩸ۘ;)Ll/ܿܿۚ;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "\u06d8\u1a74"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x19fd

    const v3, -0x621ed07f

    xor-int/2addr v2, v3

    const v3, -0x6aaa057e

    goto :goto_0

    :cond_0
    :goto_2
    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p3, v1

    mul-int/lit8 v1, v1, -0x2d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x6025

    const v3, 0xbb7383f

    xor-int/2addr v2, v3

    const v3, -0x7d197982

    goto :goto_0

    :sswitch_7
    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v1, :cond_1

    const-string v1, "\u05a8\u1a78"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x3d

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x799d

    const v3, -0x6fa8739e

    xor-int/2addr v2, v3

    const v3, 0x1d7845ba

    goto/16 :goto_0

    :cond_1
    const-string v1, "\u1a76\u06d7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x5d

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x5e87

    const v3, -0x172e2ebf

    xor-int/2addr v2, v3

    const v3, -0x1f189353

    goto/16 :goto_0

    :sswitch_8
    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u0733\u1a7a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p3

    mul-int/lit8 v1, v1, 0x27

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x76db

    const v3, 0x609d2d7e

    xor-int/2addr v2, v3

    const v3, -0x325d681a

    goto/16 :goto_0

    .line 45
    :sswitch_9
    sget-boolean v1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06df\u05a8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x4391

    const v3, 0x538f5af2

    xor-int/2addr v2, v3

    const v3, -0xabf1d7f

    goto/16 :goto_0

    .line 60
    :sswitch_a
    sget-boolean v1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-nez v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u05a1\u0730"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p3, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x20b9

    const v3, -0x5499d4ac

    xor-int/2addr v2, v3

    const v3, 0x3966f191

    goto/16 :goto_0

    .line 22
    :sswitch_b
    sget v1, Ll/֨᩺;->۬᩺ܰ:I

    if-ltz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x780f

    const v3, -0x18c8ff52

    xor-int/2addr v2, v3

    const v3, -0x3c785cff

    goto/16 :goto_0

    .line 32
    :sswitch_c
    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz v1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v1, "\u06e4\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x7ca1

    const v3, -0xdc3674c

    xor-int/2addr v2, v3

    const v3, -0x6535f3fc

    goto/16 :goto_0

    :sswitch_d
    sget v1, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v1, :cond_7

    goto :goto_4

    :cond_7
    const-string v1, "\u073f\u073a"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p3

    mul-int/lit8 v1, v1, 0x71

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1d61

    const v3, -0x1fc050a0

    xor-int/2addr v2, v3

    const v3, 0x70cb6756

    goto/16 :goto_0

    :sswitch_e
    sget v1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz v1, :cond_9

    :cond_8
    :goto_3
    const-string v1, "\u06d6\u073d"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x6dc5

    const v3, 0xd8b83de

    xor-int/2addr v2, v3

    const v3, 0x225e807c

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u0730\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x7b

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x1747

    const v3, -0x45aadf61

    xor-int/2addr v2, v3

    const v3, -0x50dcaa36

    goto/16 :goto_0

    .line 54
    :sswitch_f
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    move-result v1

    if-gtz v1, :cond_b

    :cond_a
    :goto_4
    const-string v1, "\u06e1\u05a1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p3, v1

    mul-int/lit8 v1, v1, -0x5

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3d0d

    const v3, 0x3f97cf13

    xor-int/2addr v2, v3

    const v3, -0x296e2ca4

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p3, v1

    mul-int/lit8 v1, v1, 0x73

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3833

    const v3, 0x3cfceae9

    xor-int/2addr v2, v3

    const v3, -0xeb35787

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result v1

    if-eqz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u1a74\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x36e3

    const v3, 0x30e2b234

    xor-int/2addr v2, v3

    const v3, -0x1099e17f

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u06ec\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x2d

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x48b3

    const v3, 0x7943dcb2

    xor-int/2addr v2, v3

    const v3, 0x3cf5bed7    # 0.029998226f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x771dfbac -> :sswitch_5
        -0x769c9295 -> :sswitch_4
        -0x5d7b0c24 -> :sswitch_8
        -0x52dd70f1 -> :sswitch_8
        -0x4f7ae78b -> :sswitch_2
        -0x4c355578 -> :sswitch_a
        -0x48ca451e -> :sswitch_d
        -0x3ad53ff6 -> :sswitch_b
        -0x3a34df53 -> :sswitch_7
        -0x34d3b579 -> :sswitch_1
        -0x33c538cf -> :sswitch_c
        -0x33bd4e6d -> :sswitch_0
        -0x32c85cc7 -> :sswitch_5
        -0x2a160cdf -> :sswitch_9
        -0x27e0567a -> :sswitch_d
        -0x1feb7dd4 -> :sswitch_e
        -0x1cf76b13 -> :sswitch_10
        -0x12cdff61 -> :sswitch_0
        -0x9cd3567 -> :sswitch_3
        -0x8f4c26c -> :sswitch_9
        0x5a89d7f -> :sswitch_6
        0x842a16c -> :sswitch_4
        0x12c07edb -> :sswitch_6
        0x1f560099 -> :sswitch_10
        0x22ab860c -> :sswitch_c
        0x245ef789 -> :sswitch_b
        0x4a09da8f -> :sswitch_e
        0x4a39774e -> :sswitch_f
        0x56eda6cc -> :sswitch_7
        0x5c07f74e -> :sswitch_f
        0x6e63c1ba -> :sswitch_a
        0x7a3cec7c -> :sswitch_1
        0x7c1b65a6 -> :sswitch_2
        0x7edb410c -> :sswitch_3
    .end sparse-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    const v0, -0x1d568e9c

    sget v1, Ll/ۖۧ;->ܺۚۖ:I

    sget v2, Ll/֡֡;->᩶ۤ۠:I

    const-string v3, "\u06eb\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c71

    const v5, -0x557f60e3

    xor-int/2addr v4, v5

    const v5, -0x4a596529

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x51fb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 19
    sget-boolean v3, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v3, :cond_c

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    invoke-static {}, Ll/֡ܽ;->᩹ۢᩴ()I

    move-result v3

    if-gez v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_3

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x48b1

    const v5, -0x74753aa

    xor-int/2addr v4, v5

    const v5, 0x697c71b5

    goto :goto_0

    .line 26
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    const/4 p1, 0x0

    return p1

    .line 57
    :sswitch_5
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    .line 45
    :sswitch_6
    sget v3, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5523

    const v5, 0x5029fa40    # 1.1407E10f

    xor-int/2addr v4, v5

    const v5, -0x4d76571c

    goto :goto_0

    .line 26
    :sswitch_7
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u0733\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5683

    const v5, -0x3d4f4d6d

    xor-int/2addr v4, v5

    const v5, -0x4d9e88ad

    goto/16 :goto_0

    .line 24
    :sswitch_8
    sget v3, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06db\u06e2"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5437

    const v5, 0x684e69eb

    xor-int/2addr v4, v5

    const v5, -0x25596360

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫ᩳ;->۬֨᩸:I

    if-gtz v3, :cond_4

    :goto_1
    const-string v3, "\u0736\u1a7a"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4211

    const v5, -0x5f888f47

    xor-int/2addr v4, v5

    const v5, 0x3834cbcc

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c23

    const v5, 0xca4848f

    xor-int/2addr v4, v5

    const v5, -0x49a19c00

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫;->ܶܺ᩻:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u073d\u06d9"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x523

    const v5, -0x74cc5c20

    xor-int/2addr v4, v5

    const v5, 0x74899fa0

    goto/16 :goto_0

    .line 20
    :sswitch_b
    sget v3, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u05ab\u06e7"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x60c9

    const v5, -0x2c7b4960    # -1.1399992E12f

    xor-int/2addr v4, v5

    const v5, -0x65fd0554

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073d\u1a75"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x35d7

    const v5, -0x60e2b1eb

    xor-int/2addr v4, v5

    const v5, 0x109202bf

    goto/16 :goto_0

    .line 12
    :sswitch_c
    sget v3, Ll/ۖۗ;->᩶۫ۗ:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6847

    const v5, -0x12457e3c

    xor-int/2addr v4, v5

    const v5, 0x33774acb

    goto/16 :goto_0

    .line 27
    :sswitch_d
    sget-boolean v3, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u0733\u06eb"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2ae9

    const v5, 0x3985e828

    xor-int/2addr v4, v5

    const v5, 0x230a0c35

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v3, Ll/֨ۖ;->۫ۗۜ:Z

    if-nez v3, :cond_a

    :goto_3
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7f2d

    const v5, 0xdae4a31

    xor-int/2addr v4, v5

    const v5, 0x2d87fb22

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u05a1"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3b8b

    const v5, 0x40a457e3

    xor-int/2addr v4, v5

    const v5, -0x71ca6fa6

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u1a75\u06d7"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x29bd

    const v5, -0x20873410

    xor-int/2addr v4, v5

    const v5, -0x84fe28b

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x428f

    const v5, -0x18148a22

    xor-int/2addr v4, v5

    const v5, -0x27038b3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ea96833 -> :sswitch_e
        -0x728a212e -> :sswitch_9
        -0x5d7622eb -> :sswitch_4
        -0x5568bed7 -> :sswitch_7
        -0x53aed553 -> :sswitch_8
        -0x52c414a7 -> :sswitch_2
        -0x3daf6a9b -> :sswitch_6
        -0x2a42c221 -> :sswitch_1
        -0x2662c222 -> :sswitch_2
        -0x264820f5 -> :sswitch_0
        -0x24a76c2a -> :sswitch_d
        -0x1326f7bb -> :sswitch_a
        -0x11b27e6c -> :sswitch_b
        -0x7760854 -> :sswitch_d
        -0x15c3eea -> :sswitch_5
        0x2b633f7 -> :sswitch_6
        0x2d1b87a -> :sswitch_5
        0x199e41f9 -> :sswitch_8
        0x1e975204 -> :sswitch_7
        0x26a2f0af -> :sswitch_a
        0x38a3e17f -> :sswitch_9
        0x43469763 -> :sswitch_b
        0x4d861d20 -> :sswitch_1
        0x4fbb2df0 -> :sswitch_3
        0x540c5edb -> :sswitch_3
        0x607b3dfb -> :sswitch_c
        0x61ad85f8 -> :sswitch_4
        0x6f2073ce -> :sswitch_c
        0x741ea82b -> :sswitch_0
        0x7aad4161 -> :sswitch_e
    .end sparse-switch
.end method
