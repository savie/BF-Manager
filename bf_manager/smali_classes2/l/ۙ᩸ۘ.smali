.class public final Ll/ۙ᩸ۘ;
.super Landroid/webkit/WebChromeClient;
.source "N15Q"


# instance fields
.field public final synthetic ۙ:Ll/ܰ᩸ۘ;


# direct methods
.method public constructor <init>(Ll/ܰ᩸ۘ;)V
    .locals 0

    .line 69
    iput-object p1, p0, Ll/ۙ᩸ۘ;->ۙ:Ll/ܰ᩸ۘ;

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceivedTitle(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    const p1, -0x76974cfc

    sget v0, Ll/ۖ᩸;->ۨܽ۬:I

    sget v1, Ll/֨ۢ;->ۢ۬ۧ:I

    const-string v2, "\u06e1\u1a77"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x48a3

    const v4, -0x67614e20

    xor-int/2addr v3, v4

    const v4, 0x2d7a1a86

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x2d9d

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    sget v2, Ll/ۗᩳ;->ۚۤ֡:I

    if-ltz v2, :cond_3

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result v2

    if-gtz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u1a74\u06e2"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x63

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4573

    const v4, 0x5f75f277

    xor-int/2addr v3, v4

    const v4, -0x1ee0301e

    goto :goto_0

    .line 59
    :sswitch_1
    invoke-static {}, Ll/ۘۧ;->ۘۤ᩶()I

    move-result v2

    if-gtz v2, :cond_9

    goto/16 :goto_4

    .line 30
    :sswitch_2
    sget v2, Ll/֨ܶ;->ۛۛۛ:I

    if-lez v2, :cond_b

    goto :goto_1

    .line 21
    :sswitch_3
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    goto :goto_1

    .line 31
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->۟ۗܳ()I

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    return-void

    .line 72
    :sswitch_5
    iget-object p1, p0, Ll/ۙ᩸ۘ;->ۙ:Ll/ܰ᩸ۘ;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    return-void

    .line 53
    :sswitch_6
    sget-boolean v2, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v2, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v2, "\u06d8\u06e0"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x7d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7375

    const v4, 0x6743e81a

    xor-int/2addr v3, v4

    const v4, 0x4a81a308    # 4247940.0f

    goto :goto_0

    .line 19
    :sswitch_7
    sget v2, Ll/֫۟;->᩸ᩴܿ:I

    if-ltz v2, :cond_2

    :goto_1
    const-string v2, "\u073d\u06d8"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x79

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x39bb

    const v4, -0x25884beb

    xor-int/2addr v3, v4

    const v4, 0x887d5

    goto :goto_0

    :cond_2
    const-string v2, "\u073d\u1a7b"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x3b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x6aeb

    const v4, -0x5e8f241

    xor-int/2addr v3, v4

    const v4, -0x34ccf04

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06e7\u05ab"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x25

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x6133

    const v4, -0x5fe0870d

    xor-int/2addr v3, v4

    const v4, 0x7f3fb5b7

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v2, "\u1a75\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x11df

    const v4, 0x24efe163

    xor-int/2addr v3, v4

    const v4, -0x7096dc63

    goto/16 :goto_0

    .line 9
    :sswitch_9
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    move-result v2

    if-gtz v2, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v2, "\u05ab\u06d7"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x384b

    const v4, -0x64e2d37a

    xor-int/2addr v3, v4

    const v4, 0x6fa85886    # 1.04201E29f

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v2, Ll/֨֫;->᩸ۜ᩵:Z

    if-eqz v2, :cond_6

    :goto_2
    const-string v2, "\u06ec\u1a74"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7279

    const v4, 0xce49b93

    xor-int/2addr v3, v4

    const v4, 0x1172afa5

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u1a73\u06ec"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2da9

    const v4, -0x209ce8a5

    xor-int/2addr v3, v4

    const v4, -0x1c60a5d0

    goto/16 :goto_0

    .line 69
    :sswitch_b
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    move-result v2

    if-gtz v2, :cond_7

    goto :goto_3

    :cond_7
    const-string v2, "\u073f\u073a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2c8d

    const v4, 0x13093d2c

    xor-int/2addr v3, v4

    const v4, -0x431cd702

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget-boolean v2, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v2, :cond_8

    goto :goto_3

    :cond_8
    const-string v2, "\u1a74\u1a7a"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0xaf

    const v4, -0x3bae028d

    xor-int/2addr v3, v4

    const v4, -0x65257766

    goto/16 :goto_0

    .line 22
    :sswitch_d
    sget v2, Ll/ۗ;->֨۬ۖ:I

    if-ltz v2, :cond_a

    :cond_9
    :goto_3
    const-string v2, "\u05ab\u06eb"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x6d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6e09

    const v4, 0xa98ec1

    xor-int/2addr v3, v4

    const v4, -0x1296497a

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06d9\u073d"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x30f1

    const v4, 0x40a4a8f3

    xor-int/2addr v3, v4

    const v4, -0x434075e2

    goto/16 :goto_0

    :sswitch_e
    sget v2, Ll/ۗ;->֨۬ۖ:I

    if-ltz v2, :cond_c

    :cond_b
    :goto_4
    const-string v2, "\u1a78\u06e2"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x3b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4d4f

    const v4, 0x6e1ef00d

    xor-int/2addr v3, v4

    const v4, -0x37031164

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u1a79\u073f"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x1b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2709

    const v4, 0x26234585

    xor-int/2addr v3, v4

    const v4, -0x7658d4b6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x70155f08 -> :sswitch_0
        -0x678b0969 -> :sswitch_4
        -0x5be84a46 -> :sswitch_1
        -0x5be2cde6 -> :sswitch_8
        -0x56e7952a -> :sswitch_7
        -0x53fa08dd -> :sswitch_5
        -0x4916df39 -> :sswitch_2
        -0x472d1068 -> :sswitch_5
        -0x40e6e53b -> :sswitch_8
        -0x3e3c559e -> :sswitch_0
        -0x3aef7e88 -> :sswitch_6
        -0x361ecc85 -> :sswitch_2
        -0x2f47ab25 -> :sswitch_3
        -0x192d3e9a -> :sswitch_d
        -0xf6cdd69 -> :sswitch_3
        -0xecdff07 -> :sswitch_a
        -0x888e7b0 -> :sswitch_7
        -0x234fe01 -> :sswitch_e
        0xd45aa72 -> :sswitch_e
        0x1e52cddc -> :sswitch_4
        0x2422d311 -> :sswitch_b
        0x289c756b -> :sswitch_c
        0x36728a3f -> :sswitch_9
        0x415478e6 -> :sswitch_1
        0x4a6832d3 -> :sswitch_b
        0x4e9a8124 -> :sswitch_6
        0x555b9fa4 -> :sswitch_9
        0x5e682e18 -> :sswitch_d
        0x690d25f3 -> :sswitch_a
        0x6c0ea555 -> :sswitch_c
    .end sparse-switch
.end method
