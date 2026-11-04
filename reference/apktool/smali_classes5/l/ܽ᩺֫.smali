.class public final Ll/ܽ᩺֫;
.super Ljava/lang/Object;
.source "A3Z1"

# interfaces
.implements Lbin/mt/plugin/api/PluginContext;


# static fields
.field private static final ֡ܳ֡:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x82

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    return-void

    :array_0
    .array-data 2
        0x187ds
        -0x3f56s
        -0x3f4as
        -0x3f56s
        -0x3f52s
        -0x3f4as
        -0x3f57s
        -0x3f57s
        0xfes
        0x4dcfs
        0x4dc4s
        0x4dc3s
        0x4d83s
        0x4dc0s
        0x4dd9s
        0x4d83s
        0x4ddds
        0x4dc1s
        0x4dd8s
        0x4dcas
        0x4dc4s
        0x4dc3s
        0x4d83s
        0x4ddes
        0x4dd4s
        0x4ddes
        0x4dd9s
        0x4dc8s
        0x4dc0s
        0x21d7s
        -0x4835s
        -0x481fs
        -0x4815s
        -0x4814s
        -0x4803s
        -0x480bs
        0x141fs
        0x214s
        0x233s
        0x235s
        0x22es
        0x229s
        0x220s
        0x267s
        0x229s
        0x228s
        0x233s
        0x267s
        0x221s
        0x228s
        0x232s
        0x229s
        0x223s
        0x27ds
        0x267s
        0x12d7s
        0x1db9s
        0x1db4s
        0x1dbbs
        0x1db2s
        0x1da6s
        0x1da1s
        0x1da7s
        0x1dbcs
        0x1dbbs
        0x1db2s
        0x1da6s
        0xfc7s
        0x786ds
        0x7866s
        0x7861s
        0x7821s
        0x7862s
        0x787bs
        0x7821s
        0x787fs
        0x7863s
        0x787as
        0x7868s
        0x7866s
        0x7861s
        0x7821s
        0x787cs
        0x7876s
        0x787cs
        0x787bs
        0x786as
        0x7862s
        0x10f1s
        -0x13b5s
        -0x13c0s
        -0x13b9s
        -0x13f9s
        -0x13bcs
        -0x13a3s
        -0x13f9s
        -0x13a7s
        -0x13bbs
        -0x13a4s
        -0x13b2s
        -0x13c0s
        -0x13b9s
        -0x13f9s
        -0x13a6s
        -0x13b0s
        -0x13a6s
        -0x13a3s
        -0x13b4s
        -0x13bcs
        0x639s
        -0x7013s
        -0x701as
        -0x701fs
        -0x705fs
        -0x701es
        -0x7005s
        -0x705fs
        -0x7001s
        -0x701ds
        -0x7006s
        -0x7018s
        -0x701as
        -0x701fs
        -0x705fs
        -0x7004s
        -0x700as
        -0x7004s
        -0x7005s
        -0x7016s
        -0x701es
    .end array-data
.end method


# virtual methods
.method public final cancelToast()V
    .locals 6

    const v0, 0x1fe49409

    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    sget v2, Ll/֡ۢ;->۟֡᩻:I

    const-string v3, "\u06e0\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x71f1

    const v5, -0x7d95de3c

    xor-int/2addr v4, v5

    const v5, 0x22059e01

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5f35

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    .line 111
    :sswitch_2
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-nez v3, :cond_8

    goto/16 :goto_3

    .line 108
    :sswitch_3
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    return-void

    .line 94
    :sswitch_4
    new-instance v3, Ll/۟᩶᩻;

    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-direct {v3, v0}, Ll/۟᩶᩻;-><init>(I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 226
    :sswitch_5
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u073d\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7957

    const v5, 0x34bb1b30

    xor-int/2addr v4, v5

    const v5, -0x60a6714d

    goto :goto_0

    .line 63
    :sswitch_6
    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v3, :cond_2

    :goto_1
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x59

    const v5, 0x7681f56f

    xor-int/2addr v4, v5

    const v5, -0x551b6ce9    # -4.0603E-13f

    goto :goto_0

    :cond_2
    const-string v3, "\u1a79\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x18f9

    const v5, -0x2b8ae1c9

    xor-int/2addr v4, v5

    const v5, 0x2419a066

    goto/16 :goto_0

    .line 76
    :sswitch_7
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06e0\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1bc7

    const v5, -0x71e56231

    xor-int/2addr v4, v5

    const v5, 0xd11e4ac

    goto/16 :goto_0

    .line 191
    :sswitch_8
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u073d\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1395

    const v5, 0x146493cb

    xor-int/2addr v4, v5

    const v5, 0x75072616

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a7a\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3fd1

    const v5, 0x3a6e416

    xor-int/2addr v4, v5

    const v5, 0x25ec8109

    goto/16 :goto_0

    .line 111
    :sswitch_9
    sget-boolean v3, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x169d

    const v5, 0x68e87a3b

    xor-int/2addr v4, v5

    const v5, 0x62f476af

    goto/16 :goto_0

    .line 186
    :sswitch_a
    sget v3, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06e1\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5347

    const v5, -0x776dc1a3

    xor-int/2addr v4, v5

    const v5, -0x53aab152

    goto/16 :goto_0

    .line 116
    :sswitch_b
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06db\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x73b1

    const v5, -0x6c5e182e

    xor-int/2addr v4, v5

    const v5, 0x5991f653

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3957

    const v5, -0x75a9892d

    xor-int/2addr v4, v5

    const v5, 0x60198f8

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u1a73\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3dcd

    const v5, 0x34ae9e96

    xor-int/2addr v4, v5

    const v5, -0x68ce9f3c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06da\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x33d1

    const v5, -0x58964228

    xor-int/2addr v4, v5

    const v5, 0x12b14eba

    goto/16 :goto_0

    .line 229
    :sswitch_d
    sget-object v3, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 166
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_c

    :cond_b
    const-string v3, "\u06da\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3a63

    const v5, -0x3a1feddc

    xor-int/2addr v4, v5

    const v5, 0xf51ddbc

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x621d

    const v5, 0x6c1847d6

    xor-int/2addr v4, v5

    const v5, 0x1ea36a58

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d1882d9 -> :sswitch_1
        -0x6d5e4594 -> :sswitch_a
        -0x68a0a139 -> :sswitch_2
        -0x6615938a -> :sswitch_9
        -0x652c4f86 -> :sswitch_d
        -0x5d6bfa91 -> :sswitch_0
        -0x5d56aec6 -> :sswitch_c
        -0x5c911981 -> :sswitch_9
        -0x5b8e847a -> :sswitch_2
        -0x5574ae9d -> :sswitch_4
        -0x4d4912cc -> :sswitch_0
        -0x4d3ba7e6 -> :sswitch_7
        -0x4ccef270 -> :sswitch_5
        -0x49e6f56d -> :sswitch_3
        -0x41541298 -> :sswitch_7
        -0x36ede97c -> :sswitch_3
        -0x33b959d8 -> :sswitch_5
        -0xfb95da1 -> :sswitch_6
        -0x9996b3a -> :sswitch_c
        -0x5611c4e -> :sswitch_6
        0x12f1aff7 -> :sswitch_1
        0x1b42c619 -> :sswitch_b
        0x278da2da -> :sswitch_4
        0x35d0b615 -> :sswitch_b
        0x3eec16ac -> :sswitch_a
        0x433da410 -> :sswitch_8
        0x574b53f9 -> :sswitch_8
        0x7c36a963 -> :sswitch_d
    .end sparse-switch
.end method

.method public final getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 0

    .line 149
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 0

    .line 85
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getClipboardText()Ljava/lang/CharSequence;
    .locals 1

    .line 192
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 75
    invoke-static {}, Ll/ۚۛ֫;->᩷()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 4

    const p1, -0x73cb5de3

    sget p2, Ll/֨ۚ;->֡᩸ۛ:I

    sget v0, Ll/᩺;->۫۬۫:I

    const-string v1, "\u06da\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x2107

    const v3, -0x1f6964c3

    xor-int/2addr v2, v3

    const v3, 0x4064d3f8

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x1e55

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 75
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_0
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    if-gez v1, :cond_8

    goto/16 :goto_3

    .line 108
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v1, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v1, :cond_6

    goto/16 :goto_3

    .line 15
    :sswitch_2
    sget v1, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v1, :cond_b

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_2

    .line 155
    :sswitch_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 31
    :sswitch_5
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "\u1a7b\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x25

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x547b

    const v3, -0x4f002375

    xor-int/2addr v2, v3

    const v3, -0x3c3c3ab8

    goto :goto_0

    :cond_0
    const-string v1, "\u06da\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x5487

    const v3, -0x67268a03

    xor-int/2addr v2, v3

    const v3, 0xc3584b8

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v1, "\u073f\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x5

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x1af7

    const v3, 0x951a2e4

    xor-int/2addr v2, v3

    const v3, -0x71f6cd3c

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u06df\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x202f

    const v3, -0x364f9bed

    xor-int/2addr v2, v3

    const v3, -0x3efe25e5

    goto/16 :goto_0

    .line 150
    :sswitch_8
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u06da\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0xd

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x2dbd

    const v3, 0x2f6d2c07

    xor-int/2addr v2, v3

    const v3, -0x2bd6b6f8

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v1, "\u06d8\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x29

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x21e1

    const v3, 0x7d9c620f

    xor-int/2addr v2, v3

    const v3, -0x7626e138

    goto/16 :goto_0

    :sswitch_a
    sget v1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v1, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v1, "\u05ab\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0xf

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x6fa3

    const v3, -0x38a30695

    xor-int/2addr v2, v3

    const v3, 0x1c6c4984

    goto/16 :goto_0

    .line 54
    :sswitch_b
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_7

    :cond_6
    :goto_1
    const-string v1, "\u1a78\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v2, v1, v0

    mul-int/lit8 v2, v2, -0xf

    const v3, -0x4fa39b51

    xor-int/2addr v2, v3

    const v3, 0x565e6109

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u073a\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0xded

    const v3, 0x1493f63a

    xor-int/2addr v2, v3

    const v3, 0x698af8b7    # 2.1000786E25f

    goto/16 :goto_0

    :sswitch_c
    sget v1, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v1, :cond_9

    :cond_8
    const-string v1, "\u06e2\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x61

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x71bf

    const v3, 0x55d968a2

    xor-int/2addr v2, v3

    const v3, -0x7a3c398d

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u1a79\u05a8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0xf

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x13f

    const v3, 0x6fdb2333

    xor-int/2addr v2, v3

    const v3, -0x71eddf98

    goto/16 :goto_0

    .line 122
    :sswitch_d
    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_a

    :goto_2
    const-string v1, "\u0730\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x98f

    const v3, -0x2b5dfc4c

    xor-int/2addr v2, v3

    const v3, -0x453333f7

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x25

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x31e1

    const v3, -0x6555d423

    xor-int/2addr v2, v3

    const v3, -0x42d9b64e

    goto/16 :goto_0

    .line 138
    :sswitch_e
    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v1, :cond_c

    :cond_b
    :goto_3
    const-string v1, "\u06dc\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x3f03

    const v3, -0x6f10bf3d

    xor-int/2addr v2, v3

    const v3, 0x765a21a8

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06d9\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x5bfb

    const v3, 0xd9d5803

    xor-int/2addr v2, v3

    const v3, -0x675470d0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ddc5551 -> :sswitch_5
        -0x4a6563df -> :sswitch_a
        -0x40917cf6 -> :sswitch_0
        -0x3fcf1b5c -> :sswitch_c
        -0x34c30f09 -> :sswitch_7
        -0x1e8e93f8 -> :sswitch_3
        -0x7662330 -> :sswitch_2
        0xf80f7a6 -> :sswitch_d
        0x1400c14f -> :sswitch_e
        0x192f9f0f -> :sswitch_8
        0x1f98e139 -> :sswitch_4
        0x29bf2c82 -> :sswitch_7
        0x2a766db3 -> :sswitch_1
        0x2fe674ae -> :sswitch_5
        0x36d60c8e -> :sswitch_4
        0x39598869 -> :sswitch_3
        0x3ab0bdf3 -> :sswitch_b
        0x3d42177f -> :sswitch_c
        0x408d91bf -> :sswitch_9
        0x43f118d5 -> :sswitch_8
        0x5369515b -> :sswitch_a
        0x549e4abe -> :sswitch_6
        0x557039a5 -> :sswitch_b
        0x68ca5a05 -> :sswitch_1
        0x69bb635b -> :sswitch_0
        0x6f30d127 -> :sswitch_9
        0x72fdb539 -> :sswitch_2
        0x776978a5 -> :sswitch_d
        0x7780f06b -> :sswitch_6
        0x7a876eb1 -> :sswitch_e
    .end sparse-switch
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 1

    .line 166
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 50
    invoke-static {}, Ll/᩶᩷ۧ;->᩹()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostVersionCode()I
    .locals 1

    const v0, 0x18e699d

    return v0
.end method

.method public final getHostVersionName()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x4d2ce63

    sget v11, Ll/֫֨;->᩶ܺۡ:I

    sget v12, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v13, "\u05a1\u1a7a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x7

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x532d

    const v15, -0x7cf535f6

    xor-int/2addr v14, v15

    const v15, -0x4217b8c6

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x6829

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 0
    sget v13, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v13, :cond_7

    goto/16 :goto_3

    .line 1
    :sswitch_0
    sget v13, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u1a7a\u06e1"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x9

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1e8b

    const v15, 0x66f8e6bf

    xor-int/2addr v14, v15

    const v15, -0x57acea23

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v13

    if-ltz v13, :cond_a

    goto/16 :goto_2

    .line 2
    :sswitch_2
    sget v13, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v13, :cond_c

    goto/16 :goto_2

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    goto/16 :goto_2

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x7

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/ۖ;->᩺ۢ۠([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ܽ᩺֫;->֡ܳ֡:[S

    const/4 v9, 0x1

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v13

    if-eqz v13, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v13, "\u1a73\u073f"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x7f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x659

    const v15, 0x1b176680

    xor-int/2addr v14, v15

    const v15, -0x360f920a

    goto :goto_0

    :sswitch_7
    const v7, 0xc77b

    goto :goto_1

    :sswitch_8
    const v7, 0xc098

    :goto_1
    const-string v13, "\u06ec\u06e7"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x51e7

    const v15, 0x74e8d2fc

    xor-int/2addr v14, v15

    const v15, -0x768fd19b

    goto/16 :goto_0

    :sswitch_9
    add-int v13, v5, v6

    sub-int/2addr v13, v4

    if-ltz v13, :cond_2

    const-string v13, "\u05a8\u06e4"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x7f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x63ad

    const v15, -0x5d48ad01

    xor-int/2addr v14, v15

    const v15, 0x3696aeba

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u06e4\u1a73"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1a9f

    const v15, 0x71b9b8a7

    xor-int/2addr v14, v15

    const v15, -0x6d00a9d2

    goto/16 :goto_0

    :sswitch_a
    const v6, 0xbb2244

    .line 3
    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v13, "\u05a8\u05ab"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3c03

    const v15, -0x898e57b

    xor-int/2addr v14, v15

    const v15, 0x53c652de

    goto/16 :goto_0

    :sswitch_b
    mul-int v4, v2, v3

    mul-int v5, v2, v2

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v13

    if-ltz v13, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v13, "\u0736\u06e2"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x5d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2181

    const v15, 0x59d70d9b

    xor-int/2addr v14, v15

    const v15, -0x20d8c559

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    const/16 v3, 0x1b5c

    sget v13, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u05a8\u0733"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x6f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3365

    const v15, 0x6c94c224

    xor-int/2addr v14, v15

    const v15, -0x585fd56c

    goto/16 :goto_0

    :sswitch_d
    const/4 v1, 0x0

    .line 4
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result v13

    if-nez v13, :cond_6

    :goto_2
    const-string v13, "\u1a7a\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5b35

    const v15, 0x533fec40

    xor-int/2addr v14, v15

    const v15, -0x66373f2b

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u1a77\u05a1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4543

    const v15, -0x3c7c246f

    xor-int/2addr v14, v15

    const v15, -0xc811da5

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u0730\u06db"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x869

    const v15, 0x38ff2c2

    xor-int/2addr v14, v15

    const v15, 0x2050816b

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_8

    :goto_3
    const-string v13, "\u06ec\u0730"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x43

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x208d

    const v15, -0x725572ee

    xor-int/2addr v14, v15

    const v15, -0x44853a2c

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06dc\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x75

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6ef

    const v15, -0x6a7efbb9

    xor-int/2addr v14, v15

    const v15, -0x237c5c9b

    goto/16 :goto_0

    .line 0
    :sswitch_f
    sget v13, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v13, :cond_9

    goto :goto_4

    :cond_9
    const-string v13, "\u1a78\u073d"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x419

    const v15, 0x552602ec

    xor-int/2addr v14, v15

    const v15, -0x59c5d080

    goto/16 :goto_0

    .line 1
    :sswitch_10
    sget v13, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v13, :cond_b

    :cond_a
    :goto_4
    const-string v13, "\u073f\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x99f

    const v15, 0x612ccb2d

    xor-int/2addr v14, v15

    const v15, -0x6d88b337

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u0730\u06e1"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4fd

    const v15, 0x33eb27c

    xor-int/2addr v14, v15

    const v15, 0x1f5c487f

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    .line 0
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v13

    if-nez v13, :cond_d

    :cond_c
    :goto_5
    const-string v13, "\u05a1\u1a7b"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x17ab

    const v15, 0x18377826

    xor-int/2addr v14, v15

    const v15, 0x4be4511a    # 2.992594E7f

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u1a76\u06e8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3d01

    const v15, -0x1023421

    xor-int/2addr v14, v15

    const v15, -0x7f127f41

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e7ec822 -> :sswitch_2
        -0x6598e211 -> :sswitch_b
        -0x65799029 -> :sswitch_6
        -0x57fe726e -> :sswitch_a
        -0x534725f3 -> :sswitch_a
        -0x4a307774 -> :sswitch_e
        -0x39d56809 -> :sswitch_0
        -0x335a6ec7 -> :sswitch_e
        -0x32f17d47 -> :sswitch_c
        -0x1f74bb68 -> :sswitch_c
        -0x1ca3e29b -> :sswitch_4
        -0x1c86420a -> :sswitch_d
        -0x1bdd7fed -> :sswitch_1
        -0x1797b86e -> :sswitch_7
        -0xefe602a -> :sswitch_4
        -0x7c165d9 -> :sswitch_f
        -0x586a5c2 -> :sswitch_10
        -0x566cf07 -> :sswitch_11
        0x1c780a -> :sswitch_b
        0x2a3332f -> :sswitch_2
        0x2d6bcf5 -> :sswitch_3
        0x6e8567e -> :sswitch_9
        0xb23d364 -> :sswitch_f
        0x14d90ccc -> :sswitch_6
        0x2951066e -> :sswitch_9
        0x2c4d0115 -> :sswitch_5
        0x2f5a0059 -> :sswitch_10
        0x2f940eb7 -> :sswitch_8
        0x31737853 -> :sswitch_3
        0x36508d8a -> :sswitch_11
        0x3ddabd60 -> :sswitch_7
        0x517f260f -> :sswitch_0
        0x521d8373 -> :sswitch_1
        0x5ac78573 -> :sswitch_d
        0x62416745 -> :sswitch_5
        0x769544d2 -> :sswitch_8
    .end sparse-switch
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 70
    invoke-static {}, Ll/ۚۛ֫;->ۤ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageCountry()Ljava/lang/String;
    .locals 1

    .line 80
    invoke-static {}, Ll/ۚۛ֫;->᩸()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 161
    invoke-static {}, Ll/ۚۛ֫;->ᩴ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    return-object v0
.end method

.method public final getLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 143
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPluginId()Ljava/lang/String;
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0x52ba81da

    sget v10, Ll/֡۟;->᩶᩺ܰ:I

    sget v11, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v12, "\u06e2\u06d6"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x57

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x6621

    const v14, -0x28f2839e

    xor-int/2addr v13, v14

    const v14, -0x292fd73e

    :goto_0
    xor-int/2addr v12, v14

    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x6ce7

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    const/16 v1, 0x8

    .line 1
    sget v12, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v12, :cond_6

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v12, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v12, :cond_7

    goto/16 :goto_5

    .line 0
    :sswitch_1
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v12

    if-nez v12, :cond_5

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v12

    if-lez v12, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    :goto_1
    const-string v12, "\u073f\u06d7"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x58ad

    const v14, 0x6e972e5

    xor-int/2addr v13, v14

    const v14, 0xc7709f9

    goto :goto_0

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x14

    .line 0
    invoke-static {v7, v8, v0, v6}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v7, Ll/ܽ᩺֫;->֡ܳ֡:[S

    const/16 v8, 0x9

    .line 1
    sget-boolean v12, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v12, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v12, "\u1a7b\u06da"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x6e61

    const v14, 0x2f1b405b

    xor-int/2addr v13, v14

    const v14, -0x2ed68738

    goto :goto_0

    :sswitch_7
    const/16 v6, 0x60ff

    goto :goto_2

    :sswitch_8
    const/16 v6, 0x4dad

    :goto_2
    const-string v12, "\u1a7b\u06dc"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x43

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x69db

    const v14, 0x7153679c

    xor-int/2addr v13, v14

    const v14, -0x6075cd63

    goto/16 :goto_0

    :sswitch_9
    mul-int v12, v2, v5

    sub-int/2addr v12, v4

    if-gtz v12, :cond_1

    const-string v12, "\u1a76\u1a76"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x3

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x1d0f

    const v14, -0x4e6a8939

    xor-int/2addr v13, v14

    const v14, -0x4ca31076

    goto/16 :goto_0

    :cond_1
    const-string v12, "\u06da\u073f"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x12c9

    const v14, 0x2a7e20b0

    xor-int/2addr v13, v14

    const v14, -0x2bfb5f9c

    goto/16 :goto_0

    :sswitch_a
    const/16 v5, 0x4780

    .line 4
    sget v12, Ll/ۧ;->ۨۗܰ:I

    if-ltz v12, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v12, "\u1a77\u1a79"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, -0x4b

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x2cb7

    const v14, 0x5ec0937a

    xor-int/2addr v13, v14

    const v14, 0x615a78a9

    goto/16 :goto_0

    :sswitch_b
    const v4, 0x4fe1000

    add-int/2addr v4, v3

    .line 1
    sget-boolean v12, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v12, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v12, "\u06e1\u06d6"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x618b

    const v14, -0x6044f360

    xor-int/2addr v13, v14

    const v14, 0x474a5d43

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    mul-int v3, v2, v2

    .line 2
    sget v12, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v12, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v12, "\u06d8\u06e4"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x228f

    const v14, -0x6f3899d0

    xor-int/2addr v13, v14

    const v14, -0x4f98ec55

    goto/16 :goto_0

    :cond_5
    :goto_3
    const-string v12, "\u06df\u06dc"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x4907

    const v14, 0x5e742bdc

    xor-int/2addr v13, v14

    const v14, 0x389556eb

    goto/16 :goto_0

    :cond_6
    const-string v12, "\u073f\u06db"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x7

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x4af

    const v14, -0x6014560

    xor-int/2addr v13, v14

    const v14, 0x2a0a3c82

    goto/16 :goto_0

    .line 1
    :sswitch_d
    sget v12, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v12, :cond_8

    :cond_7
    :goto_4
    const-string v12, "\u1a7b\u05a8"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x35

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x1ed

    const v14, -0x1a4b449d

    xor-int/2addr v13, v14

    const v14, -0x5b16d70e

    goto/16 :goto_0

    :cond_8
    const-string v12, "\u073d\u1a7a"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x1c0d

    const v14, 0x410dc5a5

    xor-int/2addr v13, v14

    const v14, -0x6641a129

    goto/16 :goto_0

    :sswitch_e
    sget v12, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v12, :cond_9

    goto :goto_6

    :cond_9
    const-string v12, "\u1a7a\u06d7"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x59

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x1f2b

    const v14, 0x51c41b4f

    xor-int/2addr v13, v14

    const v14, 0x79a5b3a4

    goto/16 :goto_0

    .line 0
    :sswitch_f
    sget-boolean v12, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v12, :cond_a

    goto :goto_5

    :cond_a
    const-string v12, "\u0733\u1a74"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x17

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x6253

    const v14, 0x665ec046

    xor-int/2addr v13, v14

    const v14, -0x7e3758b8

    goto/16 :goto_0

    .line 4
    :sswitch_10
    sget v12, Ll/᩺;->۫۬۫:I

    if-gtz v12, :cond_c

    :cond_b
    :goto_5
    const-string v12, "\u06dc\u06dc"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x6b

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x28c9

    const v14, 0x6e2a3c1c

    xor-int/2addr v13, v14

    const v14, 0x374c0ac0

    goto/16 :goto_0

    :cond_c
    const-string v12, "\u06d8\u06e8"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x15

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x565d

    const v14, 0x192552d4

    xor-int/2addr v13, v14

    const v14, 0x7a17986

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    sget-boolean v12, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v12, :cond_d

    :goto_6
    const-string v12, "\u06e2\u1a77"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x2d9b

    const v14, 0x7863eabd

    xor-int/2addr v13, v14

    const v14, 0x3fcdefb6

    goto/16 :goto_0

    :cond_d
    const-string v12, "\u05a1\u05a1"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0x4f

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x1a4f

    const v14, 0x1ceb90c0

    xor-int/2addr v13, v14

    const v14, 0x59ad1bf2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ea66529 -> :sswitch_11
        -0x7b9a5da6 -> :sswitch_6
        -0x79c8a632 -> :sswitch_1
        -0x755d8ceb -> :sswitch_3
        -0x644cf30b -> :sswitch_6
        -0x60deaf48 -> :sswitch_b
        -0x58788a0b -> :sswitch_f
        -0x55addbbe -> :sswitch_d
        -0x527abc71 -> :sswitch_2
        -0x4d1dd1cb -> :sswitch_7
        -0x4cfb1acc -> :sswitch_1
        -0x415940f8 -> :sswitch_e
        -0x3e8d6b17 -> :sswitch_8
        -0x2da5b011 -> :sswitch_a
        -0x285e4418 -> :sswitch_8
        -0x241ed9ee -> :sswitch_5
        -0x193aeae0 -> :sswitch_d
        -0x12082d69 -> :sswitch_10
        -0x4bd1c22 -> :sswitch_7
        0xa6ea64b -> :sswitch_3
        0xd937bf5 -> :sswitch_e
        0x108b987c -> :sswitch_0
        0x2331769e -> :sswitch_4
        0x30c3bfbd -> :sswitch_10
        0x3451f4aa -> :sswitch_9
        0x3544990e -> :sswitch_2
        0x3671957d -> :sswitch_c
        0x397b18e1 -> :sswitch_c
        0x39e0a82c -> :sswitch_9
        0x3df0bf5b -> :sswitch_f
        0x443a8dce -> :sswitch_5
        0x45959e80 -> :sswitch_a
        0x4b2081ff -> :sswitch_11
        0x639d7881 -> :sswitch_4
        0x65307c82 -> :sswitch_b
        0x79f30d60 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x52706f9b

    sget v11, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v12, Ll/ۗ᩸;->ۧ۫ᩴ:I

    const-string v13, "\u06df\u06e4"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0xe57

    const v15, 0x6fcc6c55

    xor-int/2addr v14, v15

    const v15, 0x21128358

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, 0xa0f

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    const v7, 0xb798

    goto :goto_1

    .line 0
    :sswitch_0
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v13, "\u1a75\u06d7"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x19

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5e81

    const v15, 0x2d4da07a

    xor-int/2addr v14, v15

    const v15, -0x927ec1a

    goto :goto_0

    .line 1
    :sswitch_1
    sget v13, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v13, :cond_9

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget v13, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v13, :cond_c

    goto/16 :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x6

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/ܽ;->᩷ܰۨ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ܽ᩺֫;->֡ܳ֡:[S

    const/16 v9, 0x1e

    .line 1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v13

    if-gtz v13, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v13, "\u1a74\u06e8"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x7d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x279f

    const v15, -0x63f10c4f

    xor-int/2addr v14, v15

    const v15, 0x2ba89ed4

    goto :goto_0

    :sswitch_7
    const/16 v7, 0x4a8e

    :goto_1
    const-string v13, "\u06d7\u073d"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x5d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1747

    const v15, -0xdc679c0

    xor-int/2addr v14, v15

    const v15, 0x3ab6fd37

    goto/16 :goto_0

    :sswitch_8
    mul-int v13, v6, v6

    sub-int/2addr v13, v4

    if-ltz v13, :cond_2

    const-string v13, "\u1a78\u06eb"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5b17

    const v15, 0x7b41e918

    xor-int/2addr v14, v15

    const v15, 0xf4f7ce6

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u06d8\u073a"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x14e5

    const v15, 0x7e08985

    xor-int/2addr v14, v15

    const v15, 0x58e5ced

    goto/16 :goto_0

    :sswitch_9
    add-int v6, v2, v5

    .line 4
    sget v13, Ll/ۧ;->ۨۗܰ:I

    if-ltz v13, :cond_3

    :goto_2
    const-string v13, "\u1a79\u1a7b"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2e7b

    const v15, 0x3a941e05

    xor-int/2addr v14, v15

    const v15, 0x70edb7de

    goto/16 :goto_0

    :cond_3
    const-string v13, "\u06d9\u0730"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x462f

    const v15, -0x8a5b637

    xor-int/2addr v14, v15

    const v15, 0x795ca9bd

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v2, v3

    const/16 v5, 0x74a

    sget v13, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v13, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v13, "\u073f\u1a79"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x55

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3ae9

    const v15, 0x34839c15

    xor-int/2addr v14, v15

    const v15, -0x1b62842a

    goto/16 :goto_0

    :sswitch_b
    aget-short v2, v0, v1

    const/16 v3, 0x1d28

    .line 0
    sget v13, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v13, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u06e7\u1a76"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3a0b

    const v15, 0xb447432

    xor-int/2addr v14, v15

    const v15, -0x61d57930

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x1d

    .line 2
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v13, "\u06e4\u06eb"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x471

    const v15, -0x1d9b00d1

    xor-int/2addr v14, v15

    const v15, 0x737d5f59

    goto/16 :goto_0

    :sswitch_d
    sget v13, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v13, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v13, "\u0733\u06d8"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x73

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x61a1

    const v15, 0x711cfb0e

    xor-int/2addr v14, v15

    const v15, 0x35a297f6

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v13, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v13, :cond_8

    goto :goto_3

    :cond_8
    const-string v13, "\u0733\u06df"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x16e7

    const v15, -0x6d3a38ff

    xor-int/2addr v14, v15

    const v15, 0x588ef55c

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v13, :cond_a

    :cond_9
    :goto_3
    const-string v13, "\u06e1\u06d6"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x6b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xac5

    const v15, 0x7e12dea2

    xor-int/2addr v14, v15

    const v15, -0x6b69a964

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u05ab\u06d7"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x1f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x533b

    const v15, 0x54d543ff

    xor-int/2addr v14, v15

    const v15, -0x3bfa8c07

    goto/16 :goto_0

    .line 4
    :sswitch_10
    sget-boolean v13, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v13, :cond_b

    :goto_4
    const-string v13, "\u073a\u06eb"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x59fb

    const v15, -0x4e9c4013

    xor-int/2addr v14, v15

    const v15, 0x5c82ee3b

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06e7\u1a75"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x2f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4f97

    const v15, 0x3a95d904

    xor-int/2addr v14, v15

    const v15, 0x64fa6b85

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    .line 0
    sget v13, Ll/ۖ;->ܿۚ֡:I

    if-ltz v13, :cond_d

    :cond_c
    :goto_5
    const-string v13, "\u1a74\u1a77"

    invoke-static {v13}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x69

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2ca3

    const v15, 0x7660e7c6

    xor-int/2addr v14, v15

    const v15, -0x810c2cc

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u1a77\u0736"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1c3f

    const v15, -0x32758990

    xor-int/2addr v14, v15

    const v15, -0x3d459d89

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f9e7fc8 -> :sswitch_6
        -0x72d6a5a9 -> :sswitch_c
        -0x6f644398 -> :sswitch_5
        -0x5f26c821 -> :sswitch_a
        -0x59e0a3d1 -> :sswitch_0
        -0x4cc6455a -> :sswitch_7
        -0x471c8be6 -> :sswitch_2
        -0x4640ca47 -> :sswitch_4
        -0x3a354109 -> :sswitch_b
        -0x39a63a2b -> :sswitch_4
        -0x36d01db1 -> :sswitch_a
        -0x359b258a -> :sswitch_2
        -0x3014b01d -> :sswitch_8
        -0x2f91b774 -> :sswitch_d
        -0x2d2a23c1 -> :sswitch_3
        -0x1be0c106 -> :sswitch_e
        -0x1b4615bb -> :sswitch_6
        -0x15b815e9 -> :sswitch_f
        -0x103dd9f5 -> :sswitch_9
        -0xd1b51b8 -> :sswitch_8
        -0x8bc932f -> :sswitch_c
        0x95e29aa -> :sswitch_7
        0x131df8e7 -> :sswitch_10
        0x1e738ed4 -> :sswitch_e
        0x1f607336 -> :sswitch_b
        0x1fe119dd -> :sswitch_11
        0x24ce392f -> :sswitch_3
        0x2eedafd5 -> :sswitch_1
        0x4f99b539 -> :sswitch_9
        0x58ea2f7c -> :sswitch_1
        0x60ad16fc -> :sswitch_11
        0x627149aa -> :sswitch_0
        0x667d5230 -> :sswitch_d
        0x71becba0 -> :sswitch_f
        0x740e64c1 -> :sswitch_10
        0x76b5e0ac -> :sswitch_5
    .end sparse-switch
.end method

.method public final getPluginSdkVersion()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final getPluginVersionCode()I
    .locals 1

    .line 40
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPluginVersionName()Ljava/lang/String;
    .locals 1

    .line 45
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 65
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, -0x144a98c9

    sget v10, Ll/֫۠;->ۢᩴ᩺:I

    sget v11, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v12, "\u06d7\u0736"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x6289

    const v14, -0x6ddff42f

    xor-int/2addr v13, v14

    const v14, 0x5821b366

    :goto_0
    xor-int/2addr v12, v14

    :goto_1
    xor-int/2addr v9, v10

    mul-int/lit16 v9, v9, -0x2ff3

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    move-object/from16 v13, p1

    .line 11
    sget v12, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v12, :cond_e

    goto/16 :goto_9

    .line 18
    :sswitch_0
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v12

    if-nez v12, :cond_0

    :goto_2
    move-object/from16 v13, p1

    goto/16 :goto_7

    :cond_0
    :goto_3
    move-object/from16 v13, p1

    goto/16 :goto_8

    .line 93
    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v12, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v12, :cond_1

    goto :goto_2

    :cond_1
    const-string v12, "\u1a75\u1a73"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x13

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x63d7

    const v14, 0x7caff74e

    xor-int/2addr v13, v14

    const v14, -0x59a4748a

    goto :goto_0

    :sswitch_2
    sget-boolean v12, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v12, :cond_2

    goto :goto_2

    :cond_2
    :goto_4
    move-object/from16 v13, p1

    goto/16 :goto_9

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    goto :goto_2

    .line 22
    :sswitch_4
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    .line 115
    :sswitch_6
    new-instance v12, Ljava/lang/IllegalArgumentException;

    sget-object v13, Ll/ܽ᩺֫;->֡ܳ֡:[S

    .line 108
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result v14

    if-gtz v14, :cond_3

    goto :goto_3

    :cond_3
    const/16 v14, 0x25

    .line 31
    sget v15, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v15, :cond_4

    goto :goto_4

    :cond_4
    const/16 v15, 0x12

    sget v16, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v16, :cond_5

    goto :goto_4

    .line 115
    :cond_5
    invoke-static {v13, v14, v15, v8}, Ll/֨ۨ;->ۗ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    invoke-static {v0, v13}, Ll/֨ᩳ;->ܶ᩷ᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12

    :sswitch_7
    move-object/from16 v13, p1

    .line 113
    invoke-static/range {p0 .. p1}, Ll/֨ۖ;->᩸ۙۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v12, "\u06d8\u06e7"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0x47

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x2e71

    const v15, 0x6413e15

    xor-int/2addr v14, v15

    const v15, 0x26d57a32

    goto/16 :goto_a

    :cond_6
    const-string v12, "\u05ab\u05a1"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x328d

    const v15, 0x3499d1d2

    xor-int/2addr v14, v15

    const v15, -0x5eac4571

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v13, p1

    const/16 v8, 0x2486

    goto :goto_5

    :sswitch_9
    move-object/from16 v13, p1

    const/16 v8, 0x247

    :goto_5
    const-string v12, "\u06d8\u06d9"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x63

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x2be1

    const v15, -0x3e0d568

    xor-int/2addr v14, v15

    const v15, -0x47e5d02c

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v13, p1

    add-int v12, v3, v7

    mul-int v12, v12, v12

    sub-int/2addr v12, v6

    if-gtz v12, :cond_7

    const-string v12, "\u073a\u1a78"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x53

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x7ed9

    const v15, 0x180ef9f8

    xor-int/2addr v14, v15

    const v15, 0x503b223

    goto/16 :goto_a

    :cond_7
    const-string v12, "\u1a75\u06e8"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x431

    const v15, 0x167b7e97

    xor-int/2addr v14, v15

    const v15, -0x21b7f638

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v13, p1

    const/16 v7, 0x3e70

    .line 44
    sget-boolean v12, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v12, :cond_8

    goto :goto_6

    :cond_8
    const-string v12, "\u06d6\u06dc"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x61ef

    const v15, 0x4db6558a    # 3.823824E8f

    xor-int/2addr v14, v15

    const v15, -0x421c0e18

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v13, p1

    add-int v6, v4, v5

    add-int/2addr v6, v6

    .line 11
    sget v12, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v12, :cond_9

    goto :goto_7

    :cond_9
    const-string v12, "\u06dc\u0730"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0xb

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x6e71

    const v15, 0x142eb5a8

    xor-int/2addr v14, v15

    const v15, -0x42556a87

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v13, p1

    const v5, 0xf3a7100

    .line 72
    sget v12, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v12, :cond_a

    :goto_6
    const-string v12, "\u06da\u1a7b"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x4f

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x1bd1

    const v15, 0x26fb5788

    xor-int/2addr v14, v15

    const v15, -0x2e7b480c

    goto/16 :goto_a

    :cond_a
    const-string v12, "\u1a78\u06e8"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x63

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, -0x4313

    const v15, 0x48674ebc

    xor-int/2addr v14, v15

    const v15, 0x1879b0db

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v13, p1

    aget-short v3, v1, v2

    mul-int v4, v3, v3

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v12

    if-nez v12, :cond_b

    :goto_7
    const-string v12, "\u1a7b\u06da"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x7245

    const v15, 0x3c466a08

    xor-int/2addr v14, v15

    const v15, 0x7e0bd543

    goto/16 :goto_a

    :cond_b
    const-string v12, "\u073a\u05ab"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x75

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, -0x301

    const v15, 0x3444195c

    xor-int/2addr v14, v15

    const v15, 0x337982d

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v13, p1

    const/16 v2, 0x24

    .line 82
    sget v12, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v12, :cond_c

    goto :goto_8

    :cond_c
    const-string v12, "\u0733\u0736"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x47

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x835

    const v15, 0x75c64ee3

    xor-int/2addr v14, v15

    const v15, 0x56ae6fa0

    goto :goto_a

    :sswitch_10
    move-object/from16 v13, p1

    sget-object v1, Ll/ܽ᩺֫;->֡ܳ֡:[S

    .line 56
    sget v12, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v12, :cond_d

    :goto_8
    const-string v12, "\u1a79\u06d9"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0xd

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x70a7

    const v15, 0x7729c164

    xor-int/2addr v14, v15

    const v15, -0x5132cc0b

    goto :goto_a

    :cond_d
    const-string v12, "\u06e7\u06e0"

    invoke-static {v12}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x31c1

    const v15, -0x37aaf3ba

    xor-int/2addr v14, v15

    const v15, 0x2104e8d0

    goto :goto_a

    :goto_9
    const-string v12, "\u06db\u0730"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x6d

    xor-int v14, v12, v10

    mul-int/lit16 v14, v14, 0x2f97

    const v15, 0x7c9a1e6c

    xor-int/2addr v14, v15

    const v15, -0x63ea4b79

    goto :goto_a

    :cond_e
    const-string v12, "\u05ab\u06ec"

    invoke-static {v12}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0x31

    xor-int v14, v12, v11

    mul-int/lit16 v14, v14, 0x249f

    const v15, -0x769506f

    xor-int/2addr v14, v15

    const v15, -0x1e843348

    :goto_a
    xor-int/2addr v12, v15

    move v13, v14

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x72d00713 -> :sswitch_9
        -0x6b80a4d3 -> :sswitch_8
        -0x6a5007c7 -> :sswitch_5
        -0x54cc14e0 -> :sswitch_f
        -0x4e9bc267 -> :sswitch_f
        -0x37f77181 -> :sswitch_4
        -0x342daf0b -> :sswitch_9
        -0x244c67c2 -> :sswitch_2
        -0x2272e7dc -> :sswitch_0
        -0x1ad332ba -> :sswitch_3
        -0x15e63327 -> :sswitch_c
        -0x1543145c -> :sswitch_d
        -0x828bd28 -> :sswitch_a
        0x4384dc5 -> :sswitch_1
        0xa20b249 -> :sswitch_e
        0x1b187a5b -> :sswitch_3
        0x1d5ec81f -> :sswitch_d
        0x2809e30b -> :sswitch_6
        0x2d616003 -> :sswitch_10
        0x31330649 -> :sswitch_6
        0x31e5e1db -> :sswitch_c
        0x343c870a -> :sswitch_4
        0x475383e8 -> :sswitch_2
        0x4d6627dd -> :sswitch_5
        0x55b1cc32 -> :sswitch_a
        0x55dd8f21 -> :sswitch_8
        0x5950cc1a -> :sswitch_7
        0x5c4ce3c5 -> :sswitch_e
        0x5cdd8bf5 -> :sswitch_0
        0x62df7fdd -> :sswitch_b
        0x6b4cae8b -> :sswitch_1
        0x6d624bc7 -> :sswitch_7
        0x7216cdf3 -> :sswitch_b
        0x7a916e27 -> :sswitch_10
    .end sparse-switch
.end method

.method public final varargs getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const v0, 0x591f255c

    sget v1, Ll/ۖۙ;->ۤۧۤ:I

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    const-string v3, "\u06e2\u06e2"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53e1

    const v5, -0x5c9bb4c4

    xor-int/2addr v4, v5

    const v5, -0x50405c23

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3739

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 61
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_1

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v3, :cond_b

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_1

    .line 27
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06e0\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7281

    const v5, -0x3ba58039

    xor-int/2addr v4, v5

    const v5, -0x4bdfa0c5

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    goto/16 :goto_1

    .line 48
    :sswitch_4
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    const/4 p1, 0x0

    return-object p1

    .line 123
    :sswitch_5
    invoke-virtual {p0, p1}, Ll/ܽ᩺֫;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ll/᩵᩺֫;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v3, "\u0733\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ddd

    const v5, 0x60922b72    # 8.42611E19f

    xor-int/2addr v4, v5

    const v5, -0x4e637c22

    goto :goto_0

    .line 51
    :sswitch_6
    sget v3, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06db\u06d7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4599

    const v5, 0x5149ce91

    xor-int/2addr v4, v5

    const v5, 0x43bad177

    goto :goto_0

    .line 93
    :sswitch_7
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06d8\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x70df

    const v5, 0x140f2304

    xor-int/2addr v4, v5

    const v5, -0x5cc3501a

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u06e1\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3199

    const v5, 0x726e6e06

    xor-int/2addr v4, v5

    const v5, -0x5efbe877

    goto/16 :goto_0

    .line 51
    :sswitch_9
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_5

    :goto_1
    const-string v3, "\u06dc\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1a57

    const v5, -0x1d2929b2

    xor-int/2addr v4, v5

    const v5, 0x6bf2f2ad

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u1a79"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e9

    const v5, -0x5f862fad

    xor-int/2addr v4, v5

    const v5, -0x2329113f

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v3, :cond_6

    :goto_2
    const-string v3, "\u06e0\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x681

    const v5, -0x40ed6d0f

    xor-int/2addr v4, v5

    const v5, -0x3a05383

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06ec\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44e5

    const v5, 0xec0d51

    xor-int/2addr v4, v5

    const v5, -0x49848c3d

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u06e4\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x55c9

    const v5, -0x516f086c

    xor-int/2addr v4, v5

    const v5, 0x6688aca7

    goto/16 :goto_0

    .line 57
    :sswitch_c
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06df\u06ec"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x953

    const v5, -0x302389f6

    xor-int/2addr v4, v5

    const v5, 0x75e23051

    goto/16 :goto_0

    .line 45
    :sswitch_d
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_a

    :cond_9
    const-string v3, "\u073d\u05ab"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x64b3

    const v5, 0x3e00fb1c

    xor-int/2addr v4, v5

    const v5, -0x3ab15e3b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a73\u05ab"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1d5b

    const v5, 0x71064602    # 6.6489E29f

    xor-int/2addr v4, v5

    const v5, -0x4a41bcce

    goto/16 :goto_0

    .line 94
    :sswitch_e
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b8b

    const v5, 0x66404214

    xor-int/2addr v4, v5

    const v5, -0x1522b40b

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0733\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a27

    const v5, 0x292118fc

    xor-int/2addr v4, v5

    const v5, 0x75742c07

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x69f50b42 -> :sswitch_8
        -0x51ed6315 -> :sswitch_d
        -0x48a0e84e -> :sswitch_8
        -0x478c3f3d -> :sswitch_b
        -0x364c6127 -> :sswitch_2
        -0x26fe0c98 -> :sswitch_9
        -0x1c7a23c6 -> :sswitch_4
        -0x1c6ae69f -> :sswitch_d
        -0x11004e57 -> :sswitch_a
        0x7fd35d -> :sswitch_4
        0x98a3d19 -> :sswitch_1
        0xa61ae35 -> :sswitch_7
        0x16458600 -> :sswitch_c
        0x1923fbc9 -> :sswitch_e
        0x1f4a9374 -> :sswitch_b
        0x2270a108 -> :sswitch_3
        0x24715c81 -> :sswitch_2
        0x27c8be17 -> :sswitch_e
        0x2b4bb578 -> :sswitch_6
        0x2d3e534a -> :sswitch_6
        0x3349509e -> :sswitch_5
        0x3dcabb20 -> :sswitch_c
        0x49574c57 -> :sswitch_a
        0x5c23ead4 -> :sswitch_1
        0x6afa2c96 -> :sswitch_5
        0x6d6db738 -> :sswitch_9
        0x6e190a18 -> :sswitch_3
        0x7066781a -> :sswitch_0
        0x74288264 -> :sswitch_0
        0x7a62aedb -> :sswitch_7
    .end sparse-switch
.end method

.method public final varargs getStringArray([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5977245a

    sget v3, Ll/֫֡;->֫ۙۖ:I

    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    const-string v5, "\u06d8\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3153

    const v7, 0x5bc8b00f

    xor-int/2addr v6, v7

    const v7, 0x2c32b819

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x4e51

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 134
    array-length v5, p1

    if-ge v0, v5, :cond_4

    const-string v5, "\u1a77\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x594f

    const v7, 0xe2f7c20

    xor-int/2addr v6, v7

    const v7, 0x7c99bea7

    goto :goto_0

    .line 80
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u05a1\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x891

    const v7, 0x2c3567b3

    xor-int/2addr v6, v7

    const v7, 0x112890e2

    goto :goto_0

    .line 83
    :sswitch_1
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06dc\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4741

    const v7, -0x1983eec9

    xor-int/2addr v6, v7

    const v7, -0x3a2e7f85

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v5, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v5, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto/16 :goto_2

    .line 120
    :sswitch_4
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 135
    :sswitch_6
    aput-object v1, p1, v0

    .line 77
    sget v5, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06ec\u1a7b"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6081

    const v7, -0x2ca36719

    xor-int/2addr v6, v7

    const v7, -0x2ce6b35a

    goto/16 :goto_0

    .line 135
    :sswitch_7
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Ll/ܽ᩺֫;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 111
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u1a75\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6bd3

    const v7, 0x18056bca

    xor-int/2addr v6, v7

    const v7, -0x37fcaa14

    goto/16 :goto_0

    :sswitch_8
    return-object p1

    :cond_4
    const-string v5, "\u0730\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7343

    const v7, 0x1823c573

    xor-int/2addr v6, v7

    const v7, -0x6ea5370b

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x0

    :goto_1
    const-string v5, "\u0736\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1c9b

    const v7, 0x33cd9d7f

    xor-int/2addr v6, v7

    const v7, 0x5ba88ce7

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_5

    :goto_2
    const-string v5, "\u05ab\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2f17

    const v7, 0x267a47a9

    xor-int/2addr v6, v7

    const v7, 0x50d79b71

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06e4\u06e1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x64d7

    const v7, -0x2947dbb

    xor-int/2addr v6, v7

    const v7, -0x1814a1a9

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06db\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2f0f

    const v7, 0x4e465c86    # 8.319881E8f

    xor-int/2addr v6, v7

    const v7, 0x25f87613

    goto/16 :goto_0

    .line 19
    :sswitch_c
    sget v5, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u073a\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5e7f

    const v7, 0x3d94b690

    xor-int/2addr v6, v7

    const v7, -0x50f13d41

    goto/16 :goto_0

    .line 92
    :sswitch_d
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v5, "\u1a79\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x8c3

    const v7, -0x560b1c1a

    xor-int/2addr v6, v7

    const v7, 0x1618eb71

    goto/16 :goto_0

    .line 17
    :sswitch_e
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u0733\u1a7a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4ae9

    const v7, -0xbee46dd

    xor-int/2addr v6, v7

    const v7, 0x60168db0

    goto/16 :goto_0

    .line 36
    :sswitch_f
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u1a74\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3ae3

    const v7, 0x3faf72f2

    xor-int/2addr v6, v7

    const v7, 0x2ccff6be

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v5

    if-ltz v5, :cond_b

    :goto_3
    const-string v5, "\u06e7\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5bd7

    const v7, 0xcead486

    xor-int/2addr v6, v7

    const v7, 0x376efb47

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06eb\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x131d

    const v7, -0x7ffca6f8

    xor-int/2addr v6, v7

    const v7, 0x7e02730f

    goto/16 :goto_0

    .line 18
    :sswitch_11
    sget v5, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u06d9\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x62f7

    const v7, 0x14609ddf

    xor-int/2addr v6, v7

    const v7, 0x38f9f1a8

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e1\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x78d5

    const v7, 0x72487453

    xor-int/2addr v6, v7

    const v7, 0x7aeb8a49

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e9e513d -> :sswitch_6
        -0x7e26e546 -> :sswitch_0
        -0x7bbe9357 -> :sswitch_4
        -0x77e87fbb -> :sswitch_0
        -0x6f275885 -> :sswitch_11
        -0x6702114f -> :sswitch_b
        -0x65840f58 -> :sswitch_e
        -0x65444493 -> :sswitch_5
        -0x4bc7d0e8 -> :sswitch_3
        -0x428d1d49 -> :sswitch_10
        -0x374a6c6c -> :sswitch_f
        -0x35d23296 -> :sswitch_7
        -0x30cc93a0 -> :sswitch_2
        -0x2e39d1e0 -> :sswitch_a
        -0x28ca6963 -> :sswitch_11
        -0x26512bcc -> :sswitch_5
        -0x22b5c0c2 -> :sswitch_9
        -0x586f5db -> :sswitch_7
        0x7a48df -> :sswitch_d
        0x112b00e4 -> :sswitch_1
        0x135c94c8 -> :sswitch_e
        0x18fef8ff -> :sswitch_b
        0x272299e8 -> :sswitch_8
        0x27ed0c98 -> :sswitch_8
        0x286d3db6 -> :sswitch_d
        0x2cf0a507 -> :sswitch_10
        0x36a6aaf8 -> :sswitch_a
        0x4970d81b -> :sswitch_9
        0x506d8207 -> :sswitch_6
        0x5849e4e9 -> :sswitch_1
        0x588fae59 -> :sswitch_4
        0x5f7a10d2 -> :sswitch_c
        0x68e67cd9 -> :sswitch_f
        0x7198e86c -> :sswitch_3
        0x736666b3 -> :sswitch_2
        0x7884782a -> :sswitch_c
    .end sparse-switch
.end method

.method public final varargs getStringList([Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 129
    invoke-virtual {p0, p1}, Ll/ܽ᩺֫;->getStringArray([Ljava/lang/String;)[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getStringNullable(Ljava/lang/String;)Ljava/lang/String;
    .locals 25

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0xd59ef11

    sget v18, Ll/֡۟;->᩶᩺ܰ:I

    sget v19, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v20, "\u1a79\u1a75"

    invoke-static/range {v20 .. v20}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v18

    mul-int/lit8 v20, v20, -0x37

    xor-int v1, v20, v19

    mul-int/lit16 v1, v1, 0x395b

    const v22, 0x1abd203a

    xor-int v1, v1, v22

    const v22, -0xd7c09e7

    xor-int v20, v20, v22

    move-object v4, v3

    move-object/from16 v10, v16

    move/from16 v21, v20

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const v20, -0xd59ef11

    const/16 v22, 0x0

    move-object/from16 v16, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v11, v20, v19

    mul-int/lit16 v11, v11, 0x1923

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    move/from16 v21, v12

    move/from16 v23, v13

    sget-object v16, Ll/ܽ᩺֫;->֡ܳ֡:[S

    .line 57
    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_12

    goto/16 :goto_c

    .line 156
    :sswitch_0
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move/from16 v21, v12

    move/from16 v23, v13

    goto/16 :goto_5

    :cond_1
    move/from16 v21, v12

    :goto_1
    move/from16 v23, v13

    goto/16 :goto_d

    :sswitch_1
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v1, :cond_0

    goto :goto_3

    .line 140
    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v1, :cond_2

    :goto_2
    move/from16 v21, v12

    move/from16 v23, v13

    goto/16 :goto_c

    :cond_2
    move/from16 v21, v12

    goto/16 :goto_8

    .line 37
    :sswitch_3
    sget v1, Ll/ۧ;->ۨۗܰ:I

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_3
    const-string v1, "\u1a73\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x27

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x7b21

    const v21, -0x77adfd63

    xor-int v11, v11, v21

    const v21, -0xd9e5756

    xor-int v21, v1, v21

    goto/16 :goto_10

    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto :goto_2

    :sswitch_5
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_6
    invoke-static {v3, v3, v0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    move/from16 v21, v12

    move/from16 v23, v13

    goto/16 :goto_6

    .line 46
    :sswitch_7
    new-instance v1, Ll/ܺ᩺֫;

    sget-object v11, Ll/ܽ᩺֫;->֡ܳ֡:[S

    move/from16 v21, v12

    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v23

    if-eqz v23, :cond_4

    move/from16 v23, v13

    move/from16 v12, v21

    goto/16 :goto_a

    :cond_4
    const/4 v12, 0x7

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v24

    if-eqz v24, :cond_5

    goto :goto_1

    :cond_5
    move/from16 v23, v13

    const/16 v13, 0x3c

    invoke-static {v11, v13, v12, v9}, Ll/֨ۨ;->ۗ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v1, v11}, Ll/ܺ᩺֫;-><init>(Ljava/lang/String;)V

    sput-object v1, Ll/ۚۛ֫;->᩷:Ll/ܺ᩺֫;

    goto :goto_4

    .line 48
    :sswitch_8
    sget-object v0, Ll/ۚۛ֫;->᩷:Ll/ܺ᩺֫;

    .line 97
    invoke-virtual {v0, v4, v6}, Ll/ܺ᩺֫;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 161
    :sswitch_9
    invoke-static {}, Ll/ۚۛ֫;->ᩴ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    .line 102
    check-cast v0, Ll/ܺ᩺֫;

    invoke-virtual {v0, v8, v6}, Ll/ܺ᩺֫;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_a
    return-object v6

    :sswitch_b
    move/from16 v21, v12

    move/from16 v23, v13

    .line 0
    invoke-static {v3, v0}, Ll/ۗ᩶;->ۛ᩹ᩳ(ILjava/lang/Object;)C

    move-result v1

    const/16 v11, 0x7d

    if-ne v1, v11, :cond_c

    const-string v1, "\u1a74\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0xd

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x6c49

    const v12, 0x4bf21b01    # 3.173325E7f

    xor-int/2addr v11, v12

    const v12, -0x5b7e6a51

    goto/16 :goto_e

    :sswitch_c
    move/from16 v21, v12

    move/from16 v23, v13

    .line 45
    sget-object v1, Ll/ۚۛ֫;->᩷:Ll/ܺ᩺֫;

    if-nez v1, :cond_6

    const-string v1, "\u1a76\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x6e99

    const v12, -0x405dd2a9

    xor-int/2addr v11, v12

    const v12, 0x173bd959

    goto/16 :goto_e

    :cond_6
    :goto_4
    const-string v1, "\u06da\u1a7a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x383

    const v12, -0x4f8ce45

    xor-int/2addr v11, v12

    const v12, 0x5632ce3e

    goto/16 :goto_e

    :sswitch_d
    move/from16 v21, v12

    move/from16 v23, v13

    const/16 v1, 0x38

    const/4 v11, 0x4

    .line 100
    invoke-static {v10, v1, v11, v9}, Ll/ۗܶ;->ۧۢ᩶([SIII)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-static {v7, v1}, Ll/ۖۙ;->ᩴ۫ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x63

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x467d

    const v12, -0x1b9b035

    xor-int/2addr v11, v12

    const v12, 0x666c176d

    goto/16 :goto_e

    :cond_7
    const-string v1, "\u1a75\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x1d

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x5b73

    const v12, 0x6683f1d3

    xor-int/2addr v11, v12

    const v12, 0x246c760f

    goto/16 :goto_e

    :sswitch_e
    move/from16 v21, v12

    move/from16 v23, v13

    .line 100
    sget-object v10, Ll/ܽ᩺֫;->֡ܳ֡:[S

    .line 81
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_8

    goto/16 :goto_c

    :cond_8
    const-string v1, "\u05a8\u06e2"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x503d

    const v12, -0x52eb85da

    xor-int/2addr v11, v12

    const v12, 0x5ba14fe4

    goto/16 :goto_e

    :sswitch_f
    move/from16 v21, v12

    move/from16 v23, v13

    .line 99
    invoke-static {v4, v2, v5}, Ll/ۗ᩵;->᩸ᩴۡ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v7

    add-int v1, v5, v3

    .line 100
    invoke-static {v4, v1}, Ll/֡᩵;->᩹۠᩷(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v8

    .line 32
    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v1, :cond_9

    :goto_5
    const-string v1, "\u06da\u06e4"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x25

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x2471

    const v12, 0x138f502a

    xor-int/2addr v11, v12

    const v12, -0x1f990ff

    goto/16 :goto_e

    :cond_9
    const-string v1, "\u06d6\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x7023

    const v12, 0x5effa26d

    xor-int/2addr v11, v12

    const v12, -0x16423c7

    goto/16 :goto_e

    :sswitch_10
    move/from16 v21, v12

    move/from16 v23, v13

    .line 91
    invoke-static {v0, v2}, Ll/ۘܽ;->᩷۬ܽ(Ljava/lang/Object;I)C

    move-result v1

    const/16 v11, 0x7b

    if-ne v1, v11, :cond_c

    const-string v1, "\u073a\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x6f

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x55c7

    const v12, 0x1fe64613

    xor-int/2addr v11, v12

    const v12, -0x71069252

    goto/16 :goto_e

    :sswitch_11
    move/from16 v21, v12

    move/from16 v23, v13

    const/16 v1, 0x3a

    .line 94
    invoke-static {v4, v1}, Ll/ۧ;->᩹ۙۨ(Ljava/lang/Object;I)I

    move-result v5

    const/4 v1, -0x1

    const/4 v6, 0x0

    if-ne v5, v1, :cond_a

    const-string v1, "\u1a7b\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x33

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x3c4d

    const v12, -0x4c5492c9

    xor-int/2addr v11, v12

    const v12, -0x41aed96d

    goto/16 :goto_e

    :cond_a
    const-string v1, "\u1a79\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x61

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x1b7

    const v12, -0x6d449ca1

    xor-int/2addr v11, v12

    const v12, 0x629363c3

    goto/16 :goto_e

    :sswitch_12
    move/from16 v21, v12

    move/from16 v23, v13

    .line 91
    invoke-static/range {p1 .. p1}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v11, 0x1

    if-lt v1, v2, :cond_b

    const-string v1, "\u06e0\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x1d

    xor-int v2, v1, v19

    mul-int/lit16 v2, v2, -0x6c9f

    const v12, -0xedc029d

    xor-int/2addr v2, v12

    const v12, -0x76fcc26

    xor-int/2addr v1, v12

    move/from16 v12, v21

    move/from16 v13, v23

    const/4 v3, 0x1

    move/from16 v21, v1

    move v1, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_b
    const/4 v2, 0x0

    const/4 v3, 0x1

    :cond_c
    move-object v4, v0

    :goto_6
    const-string v1, "\u06df\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x19f3

    const v12, 0x6070f51c

    xor-int/2addr v11, v12

    const v12, 0x1e33af64

    goto/16 :goto_e

    :sswitch_13
    move/from16 v21, v12

    move/from16 v23, v13

    const v1, 0xb322

    const v9, 0xb322

    goto :goto_7

    :sswitch_14
    move/from16 v21, v12

    move/from16 v23, v13

    const/16 v1, 0x1dd5

    const/16 v9, 0x1dd5

    :goto_7
    const-string v1, "\u073f\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x6b47

    const v12, 0x54873230

    xor-int/2addr v11, v12

    const v12, 0x9b93ae0

    goto/16 :goto_e

    :sswitch_15
    move/from16 v21, v12

    move/from16 v23, v13

    add-int v1, v14, v15

    sub-int v13, v23, v1

    if-lez v13, :cond_d

    const-string v1, "\u1a76\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x79

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0xff3

    const v12, 0x75514caa

    xor-int/2addr v11, v12

    const v12, -0x3722a7ef

    goto/16 :goto_e

    :cond_d
    const-string v1, "\u1a74\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x35

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x33b3

    const v12, 0x31da9441

    xor-int/2addr v11, v12

    const v12, -0x16ae5e98

    goto/16 :goto_e

    :sswitch_16
    move/from16 v21, v12

    move/from16 v23, v13

    const v15, 0x6541000

    .line 3
    sget v1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v1, :cond_e

    move/from16 v13, v23

    goto :goto_8

    :cond_e
    const-string v1, "\u06df\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x7ba9

    const v12, 0x16fc0db

    xor-int/2addr v11, v12

    const v12, -0x7a53d1c5

    goto/16 :goto_e

    :sswitch_17
    move/from16 v21, v12

    mul-int v13, v22, v21

    mul-int v14, v22, v22

    .line 123
    sget v1, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v1, :cond_f

    :goto_8
    const-string v1, "\u1a74\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x672d

    const v12, -0x6526e59e

    xor-int/2addr v11, v12

    const v12, -0x12731f7

    goto :goto_9

    :cond_f
    const-string v1, "\u06df\u0733"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x59

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x6579

    const v12, 0x2e75e6de

    xor-int/2addr v11, v12

    const v12, 0x11063fec

    :goto_9
    xor-int/2addr v1, v12

    move/from16 v12, v21

    goto/16 :goto_f

    :sswitch_18
    move/from16 v23, v13

    aget-short v22, v16, v17

    const/16 v12, 0x5080

    .line 26
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v1, :cond_10

    :goto_a
    const-string v1, "\u06d9\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x43

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x7507

    const v13, 0x77cbf764

    xor-int/2addr v11, v13

    const v13, 0x7fe13371

    goto :goto_b

    :cond_10
    const-string v1, "\u05a1\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x2245

    const v13, -0x144a83da

    xor-int/2addr v11, v13

    const v13, 0x11da78ab

    :goto_b
    xor-int v21, v1, v13

    move v1, v11

    move/from16 v13, v23

    goto/16 :goto_0

    :sswitch_19
    move/from16 v21, v12

    move/from16 v23, v13

    const/16 v17, 0x37

    .line 52
    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v1, :cond_11

    goto :goto_d

    :cond_11
    const-string v1, "\u06e7\u06d8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x31

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, -0x42eb

    const v12, 0x81d286c

    xor-int/2addr v11, v12

    const v12, -0x612e9372

    goto :goto_e

    :goto_c
    const-string v1, "\u06df\u05ab"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x69f

    const v12, -0x746628ef

    xor-int/2addr v11, v12

    const v12, -0x78eb65c8

    goto :goto_e

    :cond_12
    const-string v1, "\u1a75\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x15

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x1685

    const v12, -0x455c257b

    xor-int/2addr v11, v12

    const v12, 0x6ac89ca7

    goto :goto_e

    :sswitch_1a
    move/from16 v21, v12

    move/from16 v23, v13

    .line 45
    sget v1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v1, :cond_13

    :goto_d
    const-string v1, "\u05ab\u05ab"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x7f

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x43ab

    const v12, -0x4489d15d

    xor-int/2addr v11, v12

    const v12, 0x5de52392

    goto :goto_e

    :cond_13
    const-string v1, "\u06d7\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x3b

    xor-int v11, v1, v18

    mul-int/lit16 v11, v11, 0x5b09

    const v12, 0x7680a1ef

    xor-int/2addr v11, v12

    const v12, -0x4506fb22

    :goto_e
    xor-int/2addr v1, v12

    move/from16 v12, v21

    move/from16 v13, v23

    :goto_f
    move/from16 v21, v1

    :goto_10
    move v1, v11

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74137b58 -> :sswitch_2
        -0x66d3b5c1 -> :sswitch_19
        -0x6613ce20 -> :sswitch_13
        -0x6581fe43 -> :sswitch_e
        -0x5e815688 -> :sswitch_f
        -0x5c77ead8 -> :sswitch_10
        -0x57ad2775 -> :sswitch_5
        -0x578b81c6 -> :sswitch_8
        -0x55159373 -> :sswitch_15
        -0x51204c84 -> :sswitch_3
        -0x4a6280b7 -> :sswitch_a
        -0x4537bff7 -> :sswitch_7
        -0x44b3cebf -> :sswitch_6
        -0x31126ab3 -> :sswitch_16
        -0x2e9a3848 -> :sswitch_18
        -0x2e62930e -> :sswitch_3
        -0x2cfeb39a -> :sswitch_0
        -0x264dea54 -> :sswitch_1a
        -0x131fab4a -> :sswitch_5
        -0x7800fad -> :sswitch_9
        -0x147f7e1 -> :sswitch_e
        -0x451460 -> :sswitch_13
        0x21f1597 -> :sswitch_12
        0x2f65fb7 -> :sswitch_16
        0xef95a86 -> :sswitch_b
        0x10d7de37 -> :sswitch_c
        0x11c132ce -> :sswitch_14
        0x15f082e3 -> :sswitch_f
        0x167f9482 -> :sswitch_b
        0x17d4c39c -> :sswitch_0
        0x1f71c992 -> :sswitch_1
        0x21a3e88f -> :sswitch_14
        0x222dead1 -> :sswitch_15
        0x257d3842 -> :sswitch_1a
        0x26d9acdd -> :sswitch_d
        0x27de139e -> :sswitch_17
        0x28fd3276 -> :sswitch_4
        0x2e35b193 -> :sswitch_1
        0x2e4028cd -> :sswitch_9
        0x2e40e3be -> :sswitch_10
        0x3175edd9 -> :sswitch_11
        0x32d71339 -> :sswitch_8
        0x3e3e6361 -> :sswitch_a
        0x3e9c55ee -> :sswitch_17
        0x49029889 -> :sswitch_18
        0x52953378 -> :sswitch_4
        0x58aab6fd -> :sswitch_c
        0x650e337a -> :sswitch_7
        0x65d426f9 -> :sswitch_6
        0x6b465d14 -> :sswitch_2
        0x6ccc8557 -> :sswitch_11
        0x6d5cef4b -> :sswitch_12
        0x74e761c1 -> :sswitch_d
        0x75b1c121 -> :sswitch_19
    .end sparse-switch
.end method

.method public final hasClipboardText()Z
    .locals 1

    .line 186
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final log(Ljava/lang/String;)V
    .locals 0

    .line 234
    invoke-static {p1}, Ll/ۚۛ֫;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public final log(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x1e71d0d9

    sget v11, Ll/ۗ֨;->᩹ۜۡ:I

    sget v12, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v13, "\u0736\u1a73"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2cf9

    const v15, -0xacc1663

    xor-int/2addr v14, v15

    const v15, -0x7a75544

    xor-int/2addr v13, v15

    :goto_0
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x967

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_9

    :sswitch_0
    sget v13, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v13, :cond_1

    :cond_0
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    goto/16 :goto_9

    :cond_1
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    goto/16 :goto_8

    .line 79
    :sswitch_1
    sget-boolean v13, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v13, :cond_2

    :goto_1
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    goto/16 :goto_3

    :cond_2
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    goto/16 :goto_7

    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    sget v13, Ll/֫۠;->ۢᩴ᩺:I

    if-lez v13, :cond_0

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    .line 0
    :sswitch_5
    invoke-static {v7, v8, v9, v6}, Ll/֨ۨ;->ۗ۟ۡ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    .line 155
    invoke-static {v0, v13, v14}, Ll/ۚۛ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_6
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    .line 0
    sget-object v7, Ll/ܽ᩺֫;->֡ܳ֡:[S

    const/16 v9, 0x14

    .line 31
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v15

    if-ltz v15, :cond_3

    move/from16 v17, v1

    move/from16 v16, v3

    const/16 v8, 0x44

    goto/16 :goto_9

    :cond_3
    const-string v15, "\u06e1\u1a77"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v11

    mul-int/lit8 v15, v15, -0x7b

    xor-int v8, v15, v12

    mul-int/lit16 v8, v8, -0x3fe1

    const v17, -0x741ac166

    xor-int v8, v8, v17

    const v17, -0x10dbf194

    xor-int v15, v15, v17

    move v14, v8

    move v13, v15

    const/16 v8, 0x44

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    const v6, 0xb477

    goto :goto_2

    :sswitch_8
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    const/16 v6, 0x780f

    :goto_2
    const-string v15, "\u06e7\u1a7a"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v11

    move/from16 v16, v6

    xor-int v6, v15, v12

    mul-int/lit16 v6, v6, 0x6e19

    const v17, 0x78665818

    xor-int v6, v6, v17

    const v17, 0xb25b930

    xor-int v15, v15, v17

    move v14, v6

    move v13, v15

    move/from16 v6, v16

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    add-int/lit8 v15, v5, 0x1

    sub-int v15, v3, v15

    if-gez v15, :cond_4

    const-string v15, "\u1a76\u06e2"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v3

    xor-int v3, v15, v11

    mul-int/lit16 v3, v3, -0x7e9

    const v17, -0x82bddd5

    xor-int v3, v3, v17

    const v17, 0x2bc7bd10

    xor-int v15, v15, v17

    move v14, v3

    move v13, v15

    goto/16 :goto_5

    :cond_4
    move/from16 v16, v3

    const-string v3, "\u1a78\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v11

    xor-int v15, v3, v12

    mul-int/lit16 v15, v15, 0x363b

    const v17, 0x5db2b629

    xor-int v15, v15, v17

    const v17, 0x85e62b6

    goto/16 :goto_4

    :sswitch_a
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v16, v3

    mul-int v5, v1, v4

    .line 46
    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v3, "\u1a7b\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    xor-int v15, v3, v11

    mul-int/lit16 v15, v15, 0x6857

    const v17, 0x455bbd2d

    xor-int v15, v15, v17

    const v17, -0x909ee4d

    goto/16 :goto_4

    :sswitch_b
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    add-int v3, v1, v2

    mul-int v3, v3, v3

    const/4 v4, 0x2

    .line 140
    sget v15, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v15, :cond_6

    :goto_3
    const-string v15, "\u05ab\u0736"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v12

    mul-int/lit8 v15, v15, 0x1f

    move/from16 v17, v1

    xor-int v1, v15, v11

    mul-int/lit16 v1, v1, -0x226d

    const v16, -0x481c8

    xor-int v1, v1, v16

    const v16, 0x301355c6

    xor-int v15, v15, v16

    move v14, v1

    move v13, v15

    goto/16 :goto_b

    :cond_6
    move/from16 v17, v1

    const-string v1, "\u06e0\u0736"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v15, v1, v12

    mul-int/lit16 v15, v15, 0x6031

    const v16, -0x16f2e2d4

    xor-int v15, v15, v16

    const v16, -0x2960807d

    xor-int v1, v1, v16

    move v13, v1

    move v14, v15

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v16, v3

    const/16 v1, 0x43

    aget-short v1, v0, v1

    const/4 v2, 0x1

    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_7

    goto :goto_6

    :cond_7
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    mul-int/lit8 v3, v3, 0xd

    xor-int v15, v3, v11

    mul-int/lit16 v15, v15, 0x5ef9

    const v17, -0x33f18b72    # -3.73438E7f

    xor-int v15, v15, v17

    const v17, -0x228ec063

    :goto_4
    xor-int v3, v3, v17

    move v13, v3

    move v14, v15

    :goto_5
    move/from16 v3, v16

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    sget-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u1a75\u1a7a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x493d

    const v15, 0x68e3b0b9

    xor-int/2addr v3, v15

    const v15, 0x3bc9dab6

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 15
    sget v1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v1, :cond_9

    move/from16 v1, v17

    :goto_6
    const-string v3, "\u073f\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    mul-int/lit8 v3, v3, 0x55

    xor-int v15, v3, v11

    mul-int/lit16 v15, v15, -0x4daf

    const v17, -0x584946ef

    xor-int v15, v15, v17

    const v17, -0x58745faa

    goto :goto_4

    :cond_9
    const-string v1, "\u073f\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, -0x748b

    const v15, -0x79cc0054

    xor-int/2addr v3, v15

    const v15, -0x5e366056

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v1, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v1, "\u06e4\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    mul-int/lit8 v1, v1, 0x2f

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, 0x443

    const v15, 0x33da0b83

    xor-int/2addr v3, v15

    const v15, -0x3bff8a58

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 109
    sget v1, Ll/۬;->᩸ۜ᩹:I

    if-eqz v1, :cond_b

    :goto_7
    const-string v1, "\u1a73\u1a75"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, -0x1bb5

    const v15, -0x5eb2188f

    xor-int/2addr v3, v15

    const v15, -0x1ade3e6e

    goto :goto_a

    :cond_b
    const-string v1, "\u06dc\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, 0x4b1d

    const v15, -0x3896f23c

    xor-int/2addr v3, v15

    const v15, 0x146f69b6

    goto :goto_a

    :sswitch_11
    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move/from16 v17, v1

    move/from16 v16, v3

    .line 7
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v1

    if-eqz v1, :cond_c

    :goto_8
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x3959

    const v15, -0x3754a052

    xor-int/2addr v3, v15

    const v15, -0x7991ee7b

    goto :goto_a

    :cond_c
    const-string v1, "\u06e7\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x56a7

    const v15, -0x3c2db01

    xor-int/2addr v3, v15

    const v15, 0x587b773a

    goto :goto_a

    :goto_9
    const-string v1, "\u06e0\u06e2"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v11

    xor-int v3, v1, v12

    mul-int/lit16 v3, v3, -0x400d

    const v15, -0x6415c69a

    xor-int/2addr v3, v15

    const v15, 0x372890b8

    goto :goto_a

    :cond_d
    const-string v1, "\u06e7\u06dc"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v3, v1, v11

    mul-int/lit16 v3, v3, -0x130f

    const v15, 0x7fe82a6f

    xor-int/2addr v3, v15

    const v15, -0x4a7b21ad

    :goto_a
    xor-int/2addr v1, v15

    move v13, v1

    move v14, v3

    move/from16 v3, v16

    :goto_b
    move/from16 v1, v17

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b87d7d1 -> :sswitch_c
        -0x755bb21b -> :sswitch_a
        -0x701f7958 -> :sswitch_4
        -0x6d808c42 -> :sswitch_0
        -0x51305bc6 -> :sswitch_2
        -0x5102e92a -> :sswitch_d
        -0x4d98a3a6 -> :sswitch_10
        -0x42e7fe47 -> :sswitch_9
        -0x3f8e8184 -> :sswitch_3
        -0x337e59c0 -> :sswitch_f
        -0x2e299c69 -> :sswitch_c
        -0x2431ffbb -> :sswitch_e
        -0x22cb44c2 -> :sswitch_3
        -0x1ec64139 -> :sswitch_6
        -0x1dbe510b -> :sswitch_8
        -0x1a69be51 -> :sswitch_2
        -0x172f9ed6 -> :sswitch_6
        -0x168df834 -> :sswitch_5
        -0x15dbac1f -> :sswitch_d
        -0x196d6b4 -> :sswitch_11
        -0x18cba5e -> :sswitch_f
        0x1dd262d -> :sswitch_4
        0x66a1acc -> :sswitch_b
        0x1e5476c8 -> :sswitch_11
        0x28935483 -> :sswitch_0
        0x2bd50dbf -> :sswitch_10
        0x30215a4f -> :sswitch_8
        0x34ab297f -> :sswitch_e
        0x3c835451 -> :sswitch_a
        0x4fddddd6 -> :sswitch_9
        0x580b5d47 -> :sswitch_1
        0x5a62296f -> :sswitch_b
        0x6029adf6 -> :sswitch_7
        0x626a3613 -> :sswitch_7
        0x6c720184 -> :sswitch_1
        0x6c85e94e -> :sswitch_5
    .end sparse-switch
.end method

.method public final log(Ljava/lang/Throwable;)V
    .locals 17

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x6bec00a2

    sget v11, Ll/֨᩻;->ۛ֫ܶ:I

    sget v12, Ll/ۖ᩹;->۫ܽۗ:I

    const-string v13, "\u06d9\u1a75"

    invoke-static {v13}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x53

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6645

    const v15, 0x1e01cfc2

    xor-int/2addr v14, v15

    const v15, 0x33e83c4b

    xor-int/2addr v13, v15

    :goto_0
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x609

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget-boolean v13, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v13, :cond_1

    :cond_0
    move-object/from16 v13, p1

    goto/16 :goto_4

    :cond_1
    move-object/from16 v13, p1

    goto/16 :goto_3

    :sswitch_0
    sget v13, Ll/᩺;->۫۬۫:I

    if-gtz v13, :cond_0

    :cond_2
    move-object/from16 v13, p1

    goto/16 :goto_6

    .line 55
    :sswitch_1
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v13

    if-eqz v13, :cond_2

    :goto_1
    move-object/from16 v13, p1

    goto/16 :goto_7

    .line 62
    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto :goto_1

    .line 22
    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    .line 0
    :sswitch_4
    invoke-static {v7, v8, v9, v6}, Ll/֡᩻;->ܺܽ۠([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v13, p1

    .line 163
    invoke-static {v0, v1, v13}, Ll/ۚۛ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_5
    move-object/from16 v13, p1

    const/16 v9, 0x14

    sget-boolean v14, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v14, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v14, "\u06e7\u1a78"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x17a5

    const v16, 0x1cc4a0de

    xor-int v15, v15, v16

    const v16, 0x1e1b1c6

    goto/16 :goto_8

    :sswitch_6
    move-object/from16 v13, p1

    .line 0
    sget-object v7, Ll/ܽ᩺֫;->֡ܳ֡:[S

    const/16 v8, 0x59

    sget v14, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v14, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v14, "\u05a8\u06e1"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x1f

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x4d11

    const v16, 0x707f649d

    xor-int v15, v15, v16

    const v16, 0x47feb89f

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v13, p1

    const v6, 0xfc4e

    goto :goto_2

    :sswitch_8
    move-object/from16 v13, p1

    const v6, 0xec29

    :goto_2
    const-string v14, "\u1a74\u05a8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7c4d

    const v16, -0x3c19f8f9

    xor-int v15, v15, v16

    const v16, -0x5e900f55

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v13, p1

    mul-int v14, v2, v5

    sub-int/2addr v14, v4

    if-lez v14, :cond_5

    const-string v14, "\u1a76\u06e8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x68b1

    const v16, 0x12a98e95

    xor-int v15, v15, v16

    const v16, -0x422fa4c5

    goto/16 :goto_8

    :cond_5
    const-string v14, "\u06ec\u1a75"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x4e85

    const v16, 0x471cd29f

    xor-int v15, v15, v16

    const v16, 0x3df529eb

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v13, p1

    const/16 v5, 0xed0

    .line 156
    sget v14, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v14, :cond_6

    :goto_3
    const-string v14, "\u06e2\u1a7a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0x5485

    const v16, -0x26152d8f

    xor-int v15, v15, v16

    const v16, -0x1b888483

    goto/16 :goto_8

    :cond_6
    const-string v14, "\u06e0\u1a75"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x4d

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x445

    const v16, 0x4ebdda03    # 1.5925907E9f

    xor-int v15, v15, v16

    const v16, -0x5d3cf352

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v13, p1

    add-int v4, v2, v3

    mul-int v4, v4, v4

    sget v14, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v14, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v14, "\u06e4\u06d7"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x60ad

    const v16, -0x60c190c4

    xor-int v15, v15, v16

    const v16, -0x24c8bc84

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v13, p1

    aget-short v2, v0, v1

    const/16 v3, 0x3b4

    .line 78
    sget v14, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v14, :cond_8

    goto :goto_5

    :cond_8
    const-string v14, "\u06db\u1a7b"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x6d

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, -0xcb9

    const v16, -0x35093e34    # -8085734.0f

    xor-int v15, v15, v16

    const v16, -0x39ba291f

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v13, p1

    const/16 v1, 0x58

    sget-boolean v14, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v14, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v14, "\u06df\u06e0"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1469

    const v16, 0x2a12da69

    xor-int v15, v15, v16

    const v16, -0x7708831f

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v13, p1

    sget-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    sget v14, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v14, :cond_a

    :goto_4
    const-string v14, "\u1a76\u06da"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x2651

    const v16, -0x39185988

    xor-int v15, v15, v16

    const v16, -0x6f9f910a

    goto/16 :goto_8

    :cond_a
    const-string v14, "\u06e1\u06e0"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x3963

    const v16, 0x73cc4f89

    xor-int v15, v15, v16

    const v16, -0x391426ba

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v13, p1

    .line 124
    sget v14, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v14, :cond_b

    :goto_5
    const-string v14, "\u1a7b\u06d9"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    mul-int/lit8 v14, v14, 0x77

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7f97

    const v16, 0x191fcded

    xor-int v15, v15, v16

    const v16, 0x204ea13e

    goto/16 :goto_8

    :cond_b
    const-string v14, "\u1a76\u073f"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x61

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x88b

    const v16, 0x2e0879da

    xor-int v15, v15, v16

    const v16, -0x349f96cc

    goto :goto_8

    :sswitch_10
    move-object/from16 v13, p1

    sget v14, Ll/᩺;->۫۬۫:I

    if-gtz v14, :cond_c

    :goto_6
    const-string v14, "\u06e0\u06e8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v11

    mul-int/lit8 v14, v14, -0x59

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0xbc1

    const v16, 0x6472c40c

    xor-int v15, v15, v16

    const v16, 0x2a370cba

    goto :goto_8

    :cond_c
    const-string v14, "\u0730\u0733"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x5285

    const v16, -0x5fdd6c52

    xor-int v15, v15, v16

    const v16, 0x5585e23c

    goto :goto_8

    :sswitch_11
    move-object/from16 v13, p1

    .line 62
    sget-boolean v14, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v14, :cond_d

    :goto_7
    const-string v14, "\u073d\u073a"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x383f

    const v16, 0x61a96e58

    xor-int v15, v15, v16

    const v16, 0x7bc43856

    goto :goto_8

    :cond_d
    const-string v14, "\u1a74\u1a76"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v11

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x777d

    const v16, -0x2f05ed43

    xor-int v15, v15, v16

    const v16, 0x56d70bab

    :goto_8
    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76552aea -> :sswitch_10
        -0x6ce9cd33 -> :sswitch_7
        -0x66db71c2 -> :sswitch_e
        -0x5f2d9cd7 -> :sswitch_f
        -0x5f15e2df -> :sswitch_8
        -0x45be172c -> :sswitch_11
        -0x44428d26 -> :sswitch_11
        -0x4131b3db -> :sswitch_5
        -0x37653e04 -> :sswitch_f
        -0x2e3e7a93 -> :sswitch_5
        -0x2d5b07a5 -> :sswitch_0
        -0x27412339 -> :sswitch_e
        -0x21602e78 -> :sswitch_4
        -0x20a921e8 -> :sswitch_b
        -0x1f7a9888 -> :sswitch_9
        -0x19f92f81 -> :sswitch_6
        -0x1924e5f8 -> :sswitch_3
        -0x158ccb4a -> :sswitch_9
        0x4490f30 -> :sswitch_a
        0xbf70a51 -> :sswitch_a
        0xd7c9011 -> :sswitch_1
        0x24f46909 -> :sswitch_8
        0x3262698f -> :sswitch_3
        0x4b5352da -> :sswitch_d
        0x4c942fb7 -> :sswitch_4
        0x56021431 -> :sswitch_1
        0x5789373f -> :sswitch_c
        0x5b799f4d -> :sswitch_c
        0x5bf4c09a -> :sswitch_d
        0x5dfe392d -> :sswitch_10
        0x62034f3e -> :sswitch_b
        0x62adf036 -> :sswitch_7
        0x668457eb -> :sswitch_2
        0x79685166 -> :sswitch_0
        0x7e125920 -> :sswitch_6
        0x7f0541f5 -> :sswitch_2
    .end sparse-switch
.end method

.method public final openBrowser(Ljava/lang/String;)V
    .locals 0

    .line 176
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final openBuiltinBrowser(Ljava/lang/String;Z)V
    .locals 4

    const p1, 0x655a6496

    sget p2, Ll/֫֡;->֫ۙۖ:I

    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v1, "\u06e2\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x55

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x67b

    const v3, -0x153d46c4

    xor-int/2addr v2, v3

    const v3, -0x7997f101

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x72b9

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_4

    goto/16 :goto_1

    :sswitch_0
    sget-boolean v1, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-nez v1, :cond_5

    goto/16 :goto_1

    .line 80
    :sswitch_1
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_3

    .line 146
    :sswitch_2
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-eqz v1, :cond_a

    goto/16 :goto_2

    .line 23
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    goto/16 :goto_2

    .line 30
    :sswitch_4
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    return-void

    .line 181
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 42
    :sswitch_6
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x50bb

    const v3, 0x97c109d

    xor-int/2addr v2, v3

    const v3, 0x19b4eff9

    goto :goto_0

    :sswitch_7
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v1, "\u06e7\u06db"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x23

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x75af

    const v3, -0x1469ce65

    xor-int/2addr v2, v3

    const v3, -0x6ea96084

    goto :goto_0

    .line 19
    :sswitch_8
    sget v1, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v1, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v1, "\u1a73\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x5af

    const v3, 0x625c2766

    xor-int/2addr v2, v3

    const v3, -0x4682ab1e

    goto/16 :goto_0

    :sswitch_9
    sget v1, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u05a8\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x47

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x57dd

    const v3, -0x65351954

    xor-int/2addr v2, v3

    const v3, 0x3d5b77f4

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u0733\u073f"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x3ac3

    const v3, -0x40975b85

    xor-int/2addr v2, v3

    const v3, 0x3248d23c

    goto/16 :goto_0

    .line 37
    :sswitch_a
    sget v1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v1, :cond_6

    :cond_5
    const-string v1, "\u05ab\u06d6"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x7d99

    const v3, -0x2ee8cfec

    xor-int/2addr v2, v3

    const v3, 0x5d15f24f

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u06db\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4643

    const v3, -0x6ed41322

    xor-int/2addr v2, v3

    const v3, 0x75b9dfed

    goto/16 :goto_0

    .line 19
    :sswitch_b
    sget v1, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v1, :cond_8

    :cond_7
    :goto_1
    const-string v1, "\u073f\u06d9"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x55

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6df1

    const v3, 0xbec418c

    xor-int/2addr v2, v3

    const v3, -0xde92398

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u06e0\u073d"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x48cd

    const v3, 0x29b73da5

    xor-int/2addr v2, v3

    const v3, 0x64d3266

    goto/16 :goto_0

    .line 21
    :sswitch_c
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_9

    :goto_2
    const-string v1, "\u1a74\u1a74"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1d61

    const v3, 0x410f849e

    xor-int/2addr v2, v3

    const v3, -0x21a3804d

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u1a77\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x18f5

    const v3, 0x5a8eba7a

    xor-int/2addr v2, v3

    const v3, 0x5ab9a8b6

    goto/16 :goto_0

    .line 119
    :sswitch_d
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    :goto_3
    const-string v1, "\u06d8\u06e8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4703

    const v3, 0x59f56d76

    xor-int/2addr v2, v3

    const v3, -0x15677236

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06db\u1a77"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0xfd7

    const v3, 0x5ee3e071

    xor-int/2addr v2, v3

    const v3, 0x599f0b18

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v1

    if-eqz v1, :cond_c

    :goto_4
    const-string v1, "\u06e7\u1a73"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x40a3

    const v3, -0x5be6ece8

    xor-int/2addr v2, v3

    const v3, 0x1cb3f47e

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u05ab\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x53

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0xcf9

    const v3, -0x58a0eb5e

    xor-int/2addr v2, v3

    const v3, -0x3bafac99

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6f3e1433 -> :sswitch_2
        -0x6f1b3e0b -> :sswitch_d
        -0x6ca2df7e -> :sswitch_a
        -0x6a297992 -> :sswitch_8
        -0x66898853 -> :sswitch_0
        -0x5fcf1585 -> :sswitch_1
        -0x5028898a -> :sswitch_2
        -0x37fa7583 -> :sswitch_1
        -0xfe051f8 -> :sswitch_7
        -0x7c14a3f -> :sswitch_e
        -0x6f68fd1 -> :sswitch_5
        0x1f0969a -> :sswitch_3
        0xa21cb34 -> :sswitch_9
        0xbe40a9c -> :sswitch_9
        0xc8d2327 -> :sswitch_4
        0xf9be465 -> :sswitch_6
        0x10fe25c8 -> :sswitch_c
        0x13db5290 -> :sswitch_b
        0x1891533f -> :sswitch_b
        0x3084170f -> :sswitch_a
        0x33e5b799 -> :sswitch_d
        0x39897ea7 -> :sswitch_e
        0x42d7a4dc -> :sswitch_8
        0x4a104a3e -> :sswitch_0
        0x5065dbb4 -> :sswitch_4
        0x50d5cbad -> :sswitch_5
        0x7b51183b -> :sswitch_6
        0x7e2ba568 -> :sswitch_c
        0x7f54ead3 -> :sswitch_7
        0x7f889863 -> :sswitch_3
    .end sparse-switch
.end method

.method public final openLogViewer()V
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x6ee937df

    sget v9, Ll/ۗ᩺;->֡ۙۜ:I

    sget v10, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v11, "\u073d\u06df"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x3b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x6c9f

    const v13, 0x2c67f176

    xor-int/2addr v12, v13

    const v13, -0x54d5136a

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x488f

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    aget-short v2, v0, v1

    .line 225
    sget v11, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v11, :cond_b

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v11, Ll/֡ۢ;->۟֡᩻:I

    if-lez v11, :cond_a

    goto :goto_1

    .line 180
    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v11

    if-nez v11, :cond_3

    goto/16 :goto_3

    .line 195
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v11, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v11, :cond_7

    goto :goto_1

    .line 139
    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    :goto_1
    const-string v11, "\u06d8\u06e7"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x2eef

    const v13, -0x6c619b38

    xor-int/2addr v12, v13

    const v13, 0x7828dde1    # 1.3700095E34f

    goto :goto_0

    .line 446
    :sswitch_4
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    return-void

    .line 508
    :sswitch_5
    new-instance v11, Ll/֫۠֫;

    const/4 v12, 0x3

    sget-boolean v13, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    sget-object v13, Ll/ܽ᩺֫;->֡ܳ֡:[S

    sget v14, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v14, :cond_1

    goto/16 :goto_3

    :cond_1
    const/16 v14, 0x6e

    .line 9
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v15

    if-ltz v15, :cond_2

    goto/16 :goto_3

    :cond_2
    const/16 v15, 0x14

    .line 508
    invoke-static {v13, v14, v15, v7}, Ll/ۖ᩹;->ᩳۨ֨([SIII)Ljava/lang/String;

    move-result-object v13

    .line 152
    sget v14, Ll/᩺;->۫۬۫:I

    if-gtz v14, :cond_4

    :cond_3
    const-string v11, "\u06e8\u0736"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x29

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7799

    const v13, -0x79d4c0ff

    xor-int/2addr v12, v13

    const v13, 0x5e284e22

    goto :goto_0

    .line 508
    :cond_4
    invoke-direct {v11, v12, v13}, Ll/֫۠֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v11}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    const/16 v7, 0x31d1

    goto :goto_2

    :sswitch_7
    const v7, 0x8f8f

    :goto_2
    const-string v11, "\u073a\u06eb"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2bb7

    const v13, -0x3c2396d1

    xor-int/2addr v12, v13

    const v13, -0x38171a07

    goto/16 :goto_0

    :sswitch_8
    add-int v11, v5, v6

    add-int/2addr v11, v11

    sub-int v11, v4, v11

    if-lez v11, :cond_5

    const-string v11, "\u0730\u06da"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x1d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x30b7

    const v13, -0x386c8eb2

    xor-int/2addr v12, v13

    const v13, 0x55c0e55

    goto/16 :goto_0

    :cond_5
    const-string v11, "\u05ab\u1a73"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x77

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x3033

    const v13, -0xa8ef857

    xor-int/2addr v12, v13

    const v13, 0x6b324e26

    goto/16 :goto_0

    :sswitch_9
    const v6, 0x12298900

    .line 505
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_3

    :cond_6
    const-string v11, "\u06df\u06da"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x508d

    const v13, 0x7ecabf00

    xor-int/2addr v12, v13

    const v13, 0x5c062ef0

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v3, v3

    mul-int v5, v2, v2

    .line 172
    sget v11, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v11, :cond_8

    :cond_7
    :goto_3
    const-string v11, "\u1a7b\u1a77"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x43f1

    const v13, -0x1d312821

    xor-int/2addr v12, v13

    const v13, -0x360f499d

    goto/16 :goto_0

    :cond_8
    const-string v11, "\u1a73\u06e4"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x3b

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5829

    const v13, 0x42322587

    xor-int/2addr v12, v13

    const v13, -0x302457e8

    goto/16 :goto_0

    :sswitch_b
    add-int/lit16 v3, v2, 0x4430

    .line 487
    sget v11, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v11, :cond_9

    goto :goto_5

    :cond_9
    const-string v11, "\u0736\u05a1"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x3d

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x60a5

    const v13, -0x21f30d6a

    xor-int/2addr v12, v13

    const v13, -0x765f3bea

    goto/16 :goto_0

    :cond_a
    :goto_4
    const-string v11, "\u1a76\u06dc"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x349d

    const v13, 0x33826026

    xor-int/2addr v12, v13

    const v13, -0x123889f3

    goto/16 :goto_0

    :cond_b
    const-string v11, "\u1a76\u1a7b"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x309

    const v13, 0x1c2e1816

    xor-int/2addr v12, v13

    const v13, -0x39005227

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x6d

    .line 450
    sget v11, Ll/֫֡;->֫ۙۖ:I

    if-gtz v11, :cond_c

    goto :goto_5

    :cond_c
    const-string v11, "\u05ab\u06e8"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x21

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x6fdb

    const v13, -0x3995f4bd

    xor-int/2addr v12, v13

    const v13, -0x499d0c4d

    goto/16 :goto_0

    :sswitch_d
    sget-object v0, Ll/ܽ᩺֫;->֡ܳ֡:[S

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v11

    if-gtz v11, :cond_d

    :goto_5
    const-string v11, "\u06ec\u06dc"

    invoke-static {v11}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x15

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x558b

    const v13, -0x137c3108

    xor-int/2addr v12, v13

    const v13, 0x18ca600d

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u1a77\u05ab"

    invoke-static {v11}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x65

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x28c1

    const v13, -0x2b3b6c2a

    xor-int/2addr v12, v13

    const v13, -0x4651bb55

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e5a1bff -> :sswitch_2
        -0x7de12d0b -> :sswitch_3
        -0x7750f374 -> :sswitch_5
        -0x72ee372a -> :sswitch_b
        -0x6353914b -> :sswitch_6
        -0x62729282 -> :sswitch_0
        -0x4d43483f -> :sswitch_c
        -0x43c8fba6 -> :sswitch_b
        -0x42cc8616 -> :sswitch_8
        -0x36e9c46e -> :sswitch_8
        -0x33de826b -> :sswitch_1
        -0x2fc2f9f6 -> :sswitch_d
        -0xffcd430 -> :sswitch_4
        -0xfc1e3b1 -> :sswitch_d
        -0xe724e66 -> :sswitch_6
        0x7594761 -> :sswitch_7
        0xb6779eb -> :sswitch_3
        0xd6a62c0 -> :sswitch_a
        0x1f21b004 -> :sswitch_c
        0x21405141 -> :sswitch_7
        0x22a80d6f -> :sswitch_0
        0x2578588a -> :sswitch_9
        0x33c52d24 -> :sswitch_4
        0x4ff9a6df -> :sswitch_9
        0x52f8cdb1 -> :sswitch_5
        0x7261d7bf -> :sswitch_2
        0x75f11ca2 -> :sswitch_a
        0x78d48392 -> :sswitch_1
    .end sparse-switch
.end method

.method public final openPreference(Ljava/lang/Class;)V
    .locals 0

    .line 171
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 197
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 4

    const p1, -0x48a6e806

    sget p2, Ll/᩶;->ᩴ᩶ۛ:I

    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    const-string v1, "\u0730\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x65

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x2497

    const v3, -0x4689254a

    xor-int/2addr v2, v3

    const v3, 0x100e0958

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x1c4f

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v1, :cond_6

    goto/16 :goto_2

    .line 54
    :sswitch_0
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    .line 173
    :sswitch_1
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v1

    if-eqz v1, :cond_8

    goto/16 :goto_4

    :sswitch_2
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_b

    goto/16 :goto_3

    .line 200
    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    goto/16 :goto_3

    .line 62
    :sswitch_4
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    const/4 p1, 0x0

    return p1

    .line 202
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :sswitch_6
    sget v1, Ll/᩺;->۫۬۫:I

    if-gtz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v1, "\u1a7a\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0xb6b

    const v3, 0x28c07b3e

    xor-int/2addr v2, v3

    const v3, -0x15514d1a

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "\u1a7b\u06d7"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x3d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0xa7d

    const v3, -0x74eb3f08

    xor-int/2addr v2, v3

    const v3, 0x5e81e7d7

    goto :goto_0

    :cond_2
    const-string v1, "\u06d6\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x27

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x245d

    const v3, 0x56805f90

    xor-int/2addr v2, v3

    const v3, -0x5a03f270

    goto/16 :goto_0

    :sswitch_8
    sget v1, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u06dc\u06e0"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x5

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x5a2b

    const v3, -0x110c944a

    xor-int/2addr v2, v3

    const v3, 0x49f60800    # 2015488.0f

    goto/16 :goto_0

    .line 54
    :sswitch_9
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v1, "\u06ec\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x43

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x7223

    const v3, 0xc6cf53d

    xor-int/2addr v2, v3

    const v3, -0x7915b43a

    goto/16 :goto_0

    .line 139
    :sswitch_a
    sget v1, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v1, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v1, "\u0733\u06e7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x71

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x410b

    const v3, -0x63769081

    xor-int/2addr v2, v3

    const v3, 0x131ae158

    goto/16 :goto_0

    :cond_6
    const-string v1, "\u1a77\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x66f3

    const v3, -0x7f9652e2

    xor-int/2addr v2, v3

    const v3, 0x775097b9

    goto/16 :goto_0

    .line 190
    :sswitch_b
    sget-boolean v1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v1, :cond_7

    :goto_1
    const-string v1, "\u0730\u06d6"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x2f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3c29

    const v3, -0x3157ef9b

    xor-int/2addr v2, v3

    const v3, 0x20dab067

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06e7\u06da"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4859

    const v3, 0x5a6dd60c

    xor-int/2addr v2, v3

    const v3, 0x52045ece

    goto/16 :goto_0

    :sswitch_c
    sget v1, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v1, :cond_9

    :cond_8
    :goto_2
    const-string v1, "\u05a1\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x6f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x148d

    const v3, 0x1a225570

    xor-int/2addr v2, v3

    const v3, -0x6413d855

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u073a\u06d8"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x75b3

    const v3, -0x4eb7700c

    xor-int/2addr v2, v3

    const v3, 0x18969d73

    goto/16 :goto_0

    .line 66
    :sswitch_d
    sget v1, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v1, :cond_a

    :goto_3
    const-string v1, "\u073f\u06df"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x30c9

    const v3, -0x735a3592

    xor-int/2addr v2, v3

    const v3, -0x2cf715fa

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06da\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x4f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2fcb

    const v3, 0x3ad5fdd8

    xor-int/2addr v2, v3

    const v3, -0x1ec6c607

    goto/16 :goto_0

    .line 150
    :sswitch_e
    sget v1, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u1a77\u1a74"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x45

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x1565

    const v3, -0x2e4af15e

    xor-int/2addr v2, v3

    const v3, -0x7816a496

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06e0\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0xca3

    const v3, 0x4630ac17

    xor-int/2addr v2, v3

    const v3, -0x35795004    # -4413438.0f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6e5c45ce -> :sswitch_8
        -0x6daaa5b9 -> :sswitch_0
        -0x54b5aaca -> :sswitch_b
        -0x4ca4410a -> :sswitch_9
        -0x3512a8d6 -> :sswitch_a
        -0x33d0bbe6 -> :sswitch_2
        -0x32f3b532 -> :sswitch_2
        -0x2bfafd4d -> :sswitch_e
        -0x2a3ace59 -> :sswitch_7
        -0x268f10cf -> :sswitch_d
        -0x20ed351e -> :sswitch_6
        -0x1003308b -> :sswitch_5
        -0xfcc1d8f -> :sswitch_e
        -0xdff1604 -> :sswitch_3
        -0x89fa625 -> :sswitch_4
        0x4e7b67c -> :sswitch_0
        0x5510edb -> :sswitch_3
        0x132d0b9d -> :sswitch_6
        0x2390bb43 -> :sswitch_9
        0x2a2eef9d -> :sswitch_c
        0x2c1b86dd -> :sswitch_5
        0x2d80cbad -> :sswitch_4
        0x325ab328 -> :sswitch_b
        0x38d226b6 -> :sswitch_1
        0x433c337e -> :sswitch_a
        0x47a0e86a -> :sswitch_c
        0x4ac7c50f -> :sswitch_8
        0x4e17990e -> :sswitch_d
        0x6d10e4aa -> :sswitch_1
        0x730ad15b -> :sswitch_7
    .end sparse-switch
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 6

    const v0, 0x670f7f21

    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    sget v2, Ll/֡᩻;->᩷ۧ᩺:I

    const-string v3, "\u05a8\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x76fd

    const v5, -0x1ae42db2

    xor-int/2addr v4, v5

    const v5, 0x39312591

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x5505

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 150
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    goto/16 :goto_2

    .line 184
    :sswitch_0
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    .line 159
    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    .line 149
    :sswitch_2
    sget v3, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez v3, :cond_a

    goto/16 :goto_2

    .line 184
    :sswitch_3
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    return-void

    .line 86
    :sswitch_4
    new-instance v3, Ll/ۙ۠᩸;

    .line 90
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x4

    .line 86
    invoke-direct {v3, v0, p1}, Ll/ۙ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 207
    :sswitch_5
    sget-object v3, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u0730\u06e2"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1205

    const v5, 0x58e370bf    # 2.000587E15f

    xor-int/2addr v4, v5

    const v5, 0x19662f85

    goto :goto_0

    .line 36
    :sswitch_6
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7fc1

    const v5, -0x28b47743

    xor-int/2addr v4, v5

    const v5, -0x318dacce

    goto :goto_0

    .line 175
    :sswitch_7
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06d9\u1a7b"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1d85

    const v5, -0x412d8db2

    xor-int/2addr v4, v5

    const v5, 0x3efc6c4d

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a75\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6deb

    const v5, 0x6fbee2b5

    xor-int/2addr v4, v5

    const v5, 0x67ac1ac1

    goto/16 :goto_0

    .line 149
    :sswitch_8
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x46c1

    const v5, 0x2ecdd8c8

    xor-int/2addr v4, v5

    const v5, -0x23f1eb9c

    goto/16 :goto_0

    .line 70
    :sswitch_9
    sget-boolean v3, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06e0\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x71fb

    const v5, 0x484dd699

    xor-int/2addr v4, v5

    const v5, -0x68de69b3

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x14b5

    const v5, 0x26e7cbab

    xor-int/2addr v4, v5

    const v5, -0xecbf4d6

    goto/16 :goto_0

    .line 88
    :sswitch_a
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x17ff

    const v5, 0x77731de0

    xor-int/2addr v4, v5

    const v5, -0x53f98757

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v3

    if-eqz v3, :cond_9

    :goto_2
    const-string v3, "\u1a76\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6cc9

    const v5, -0x6f033aa1

    xor-int/2addr v4, v5

    const v5, 0x71616f07

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06dc\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x51e1

    const v5, -0x6d57f33f

    xor-int/2addr v4, v5

    const v5, -0x5d798439

    goto/16 :goto_0

    .line 43
    :sswitch_c
    sget v3, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a7a\u1a75"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4805

    const v5, 0x6cc69d54

    xor-int/2addr v4, v5

    const v5, -0x5a60beb8

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a8\u073f"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3b2f

    const v5, -0x4832553

    xor-int/2addr v4, v5

    const v5, 0x32615f58

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06d7\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1895

    const v5, -0x4f2cc5bb

    xor-int/2addr v4, v5

    const v5, -0x4f9dd244

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a76\u06e7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x49c1

    const v5, -0x2ccfc6bc

    xor-int/2addr v4, v5

    const v5, -0x23956994

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75fcb281 -> :sswitch_4
        -0x6c992a2d -> :sswitch_8
        -0x59653de8 -> :sswitch_9
        -0x5567b44e -> :sswitch_b
        -0x516f4836 -> :sswitch_7
        -0x3b406577 -> :sswitch_1
        -0x3a063e3c -> :sswitch_0
        -0x37c07aaa -> :sswitch_c
        -0x32db9919 -> :sswitch_a
        -0x31ab4f94 -> :sswitch_9
        -0x2bbd3a88 -> :sswitch_b
        -0x2954b473 -> :sswitch_6
        -0x2736f74d -> :sswitch_5
        -0x18dba766 -> :sswitch_2
        -0x16d7c231 -> :sswitch_7
        -0x8853a2e -> :sswitch_5
        0x5fd0450 -> :sswitch_6
        0x1330736f -> :sswitch_3
        0x329b31b9 -> :sswitch_3
        0x3b770d32 -> :sswitch_0
        0x3f058e90 -> :sswitch_1
        0x4c62fa26 -> :sswitch_2
        0x5917b302 -> :sswitch_d
        0x5b63cb03 -> :sswitch_d
        0x64f56570 -> :sswitch_a
        0x65f9473f -> :sswitch_c
        0x682ec8e8 -> :sswitch_8
        0x6bf8b29e -> :sswitch_4
    .end sparse-switch
.end method

.method public final varargs showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x13376cbe

    sget v2, Ll/ۖ֨;->֨ۨۧ:I

    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v4, "\u0730\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6a15

    const v6, -0x149c1765

    xor-int/2addr v5, v6

    const v6, -0x7a40935d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x7439

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 106
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_8

    goto/16 :goto_3

    .line 193
    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_1

    .line 88
    :sswitch_1
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    .line 75
    :sswitch_2
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_b

    goto/16 :goto_3

    .line 155
    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    goto/16 :goto_3

    .line 22
    :sswitch_4
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    return-void

    .line 213
    :sswitch_5
    sget-object v4, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 86
    new-instance v4, Ll/ۙ۠᩸;

    const/4 v5, 0x4

    .line 208
    sget v6, Ll/ۧ;->ۨۗܰ:I

    if-ltz v6, :cond_0

    goto/16 :goto_2

    .line 86
    :cond_0
    invoke-direct {v4, v5, v0}, Ll/ۙ۠᩸;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 212
    :sswitch_6
    invoke-static {p1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ll/ܺ᩺֫;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 20
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u0733\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1f03

    const v6, 0x47985c7f

    xor-int/2addr v5, v6

    const v6, 0x40325009

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u06e7\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x72c5

    const v6, 0x149b7e6

    xor-int/2addr v5, v6

    const v6, 0x1282b83d

    goto/16 :goto_0

    .line 170
    :sswitch_8
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06d9\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x38f

    const v6, -0x5396366b

    xor-int/2addr v5, v6

    const v6, 0x24cdba36

    goto/16 :goto_0

    .line 94
    :sswitch_9
    sget v4, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u06e8\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a03

    const v6, 0x57e74f36

    xor-int/2addr v5, v6

    const v6, -0x9fd9fe8

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1b63

    const v6, -0x7134a96e

    xor-int/2addr v5, v6

    const v6, -0x73ce2dd7

    goto/16 :goto_0

    .line 123
    :sswitch_a
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result v4

    if-eqz v4, :cond_6

    :goto_2
    const-string v4, "\u06df\u1a77"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2dad

    const v6, -0x1bacd993

    xor-int/2addr v5, v6

    const v6, 0x489ab2c0    # 316822.0f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06ec\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x38b5

    const v6, -0x38aa72ac

    xor-int/2addr v5, v6

    const v6, -0x33f8e668    # -3.541565E7f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x217d

    const v6, -0x58c118e0

    xor-int/2addr v5, v6

    const v6, 0x272c01e

    goto/16 :goto_0

    :goto_3
    const-string v4, "\u06ec\u05a8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x276d

    const v6, -0xfb7200d

    xor-int/2addr v5, v6

    const v6, -0x28f68b00

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a74\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xcf

    const v6, -0x26da6fef

    xor-int/2addr v5, v6

    const v6, -0x4de8bb65

    goto/16 :goto_0

    .line 198
    :sswitch_c
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    const-string v4, "\u06e0\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x199f

    const v6, 0x21a9b668

    xor-int/2addr v5, v6

    const v6, 0x7b1ba886

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d9\u06da"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6357

    const v6, 0x6a6eb331

    xor-int/2addr v5, v6

    const v6, 0x78b5340e

    goto/16 :goto_0

    .line 164
    :sswitch_d
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e1\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x801

    const v6, -0x7bd26451

    xor-int/2addr v5, v6

    const v6, 0x541b6b14

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e7\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3601

    const v6, 0x7200afa2

    xor-int/2addr v5, v6

    const v6, -0x77983661

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71ff8f7c -> :sswitch_1
        -0x691f3e5e -> :sswitch_8
        -0x65b4edaf -> :sswitch_4
        -0x4ec8b267 -> :sswitch_7
        -0x4e37f8a0 -> :sswitch_9
        -0x3a2191b8 -> :sswitch_0
        -0x192423e4 -> :sswitch_3
        -0x14e7049e -> :sswitch_c
        0x13ba265 -> :sswitch_4
        0x1e3ef22 -> :sswitch_b
        0x5f30f54 -> :sswitch_6
        0x9418293 -> :sswitch_a
        0x19a877a2 -> :sswitch_6
        0x1a35cf41 -> :sswitch_9
        0x1a73c3fd -> :sswitch_d
        0x3508b372 -> :sswitch_5
        0x3a4b35a9 -> :sswitch_d
        0x436ac3b6 -> :sswitch_3
        0x51d3454b -> :sswitch_2
        0x59946236 -> :sswitch_1
        0x5ec21f90 -> :sswitch_8
        0x5feb1aa0 -> :sswitch_0
        0x6426752e -> :sswitch_b
        0x666d8564 -> :sswitch_c
        0x694ba284 -> :sswitch_a
        0x6db8a0cb -> :sswitch_7
        0x7059c697 -> :sswitch_5
        0x79731162 -> :sswitch_2
    .end sparse-switch
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 6

    const v0, 0x20fb93d2

    sget v1, Ll/᩺;->۫۬۫:I

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5381

    const v5, 0x6be3034d

    xor-int/2addr v4, v5

    const v5, -0x181febd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x515b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    .line 63
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v3, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v3, :cond_9

    goto :goto_1

    .line 159
    :sswitch_1
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    goto/16 :goto_2

    .line 216
    :sswitch_3
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    return-void

    .line 90
    :sswitch_4
    new-instance v3, Ll/۫ۛ֫;

    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_0

    const-string v3, "\u05a8\u06eb"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7db1

    const v5, 0xf4ab316

    xor-int/2addr v4, v5

    const v5, 0x33e153cc

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-direct {v3, v0, p1}, Ll/۫ۛ֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 218
    :sswitch_5
    sget-object v3, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 145
    sget v3, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u06df\u1a75"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x55e7

    const v5, -0x30d3d52f

    xor-int/2addr v4, v5

    const v5, -0x400fec88

    goto :goto_0

    :sswitch_6
    sget v3, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x61df

    const v5, -0x7b7609ee

    xor-int/2addr v4, v5

    const v5, 0x6b653a9

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e0\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x41e1

    const v5, -0x3d3a2e1c

    xor-int/2addr v4, v5

    const v5, -0x58bdbf22

    goto/16 :goto_0

    .line 193
    :sswitch_7
    sget-boolean v3, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x65ed

    const v5, -0x201f35f8

    xor-int/2addr v4, v5

    const v5, -0x715594d3

    goto/16 :goto_0

    .line 155
    :sswitch_8
    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v3, :cond_5

    :goto_2
    const-string v3, "\u0730\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x64a7

    const v5, 0x4b07bbc9    # 8895433.0f

    xor-int/2addr v4, v5

    const v5, 0x3dbf5d37

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06eb\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ef1

    const v5, -0x8dac991

    xor-int/2addr v4, v5

    const v5, -0x3453dc0

    goto/16 :goto_0

    .line 9
    :sswitch_9
    sget v3, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u05ab\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x13ed

    const v5, -0x1bb9256b

    xor-int/2addr v4, v5

    const v5, 0xdd67716

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v3

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x456f

    const v5, 0x4cc1bd4c    # 1.0157526E8f

    xor-int/2addr v4, v5

    const v5, 0x5ad68ae6

    goto/16 :goto_0

    .line 144
    :sswitch_b
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u073f\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x11db

    const v5, -0x681a82b3

    xor-int/2addr v4, v5

    const v5, 0x50e238e3

    goto/16 :goto_0

    .line 155
    :sswitch_c
    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a7a\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7eeb

    const v5, 0x3230ef48

    xor-int/2addr v4, v5

    const v5, 0x5973a3a2

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d8\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d2b

    const v5, -0x204ed0e7

    xor-int/2addr v4, v5

    const v5, 0x4a8f62cf    # 4698471.5f

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d6\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x289d

    const v5, -0x7850725d

    xor-int/2addr v4, v5

    const v5, 0x6991b6e9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7a\u06d9"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4c6b

    const v5, -0x392c3a57

    xor-int/2addr v4, v5

    const v5, -0x5ba59440

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7450cd61 -> :sswitch_4
        -0x7132ec3a -> :sswitch_1
        -0x63759bce -> :sswitch_a
        -0x5a2dad9c -> :sswitch_b
        -0x54730a71 -> :sswitch_7
        -0x51503ab2 -> :sswitch_3
        -0x4bb621fa -> :sswitch_6
        -0x493ae33f -> :sswitch_3
        -0x39a69eda -> :sswitch_7
        -0x2ac416f1 -> :sswitch_b
        -0x23177027 -> :sswitch_c
        -0x1cfcaf59 -> :sswitch_2
        -0x1cd42512 -> :sswitch_d
        -0x1883cb50 -> :sswitch_5
        -0x861e44e -> :sswitch_4
        0x14788c2 -> :sswitch_0
        0x63ffdac -> :sswitch_5
        0x12bb5792 -> :sswitch_9
        0x22436165 -> :sswitch_8
        0x27336add -> :sswitch_2
        0x45b82624 -> :sswitch_8
        0x46283720 -> :sswitch_9
        0x5065e1cc -> :sswitch_d
        0x53723fb1 -> :sswitch_1
        0x53a9ea21 -> :sswitch_0
        0x58ce3479 -> :sswitch_c
        0x5a3de33b -> :sswitch_6
        0x6a018c0f -> :sswitch_a
    .end sparse-switch
.end method

.method public final varargs showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x21ac35be

    sget v2, Ll/֫֨;->᩶ܺۡ:I

    sget v3, Ll/֡ܳ;->֨ᩳۢ:I

    const-string v4, "\u1a75\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x664b

    const v6, -0x227e8850

    xor-int/2addr v5, v6

    const v6, -0x56dd46c8

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x5b3b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 63
    sget v4, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v4, :cond_4

    goto/16 :goto_2

    .line 22
    :sswitch_0
    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    if-gez v4, :cond_b

    goto :goto_1

    .line 83
    :sswitch_1
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-gez v4, :cond_7

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_2

    goto/16 :goto_2

    .line 133
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    return-void

    .line 224
    :sswitch_5
    sget-object v4, Ll/ۚۛ֫;->ܳ:Ll/ܺ᩺֫;

    .line 90
    new-instance v4, Ll/۫ۛ֫;

    const/4 v5, 0x0

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-direct {v4, v5, v0}, Ll/۫ۛ֫;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 223
    :sswitch_6
    invoke-static {p1}, Ll/֨ۢ;->ܿܽ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ll/ܺ᩺֫;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 66
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a7a\u06e7"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x17bd

    const v6, -0x43180cd4

    xor-int/2addr v5, v6

    const v6, 0x2ad39105

    goto :goto_0

    :sswitch_7
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_3

    :cond_2
    :goto_1
    const-string v4, "\u0733\u06dc"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x64f1

    const v6, -0x449fbc73

    xor-int/2addr v5, v6

    const v6, 0xc35f0ee

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u073d\u06dc"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x47f7

    const v6, 0x7ffb851b

    xor-int/2addr v5, v6

    const v6, -0x5e725838

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a78\u06db"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6b07

    const v6, -0x3759f4fb

    xor-int/2addr v5, v6

    const v6, 0x4be0e9a0    # 2.9479744E7f

    goto/16 :goto_0

    .line 80
    :sswitch_8
    sget v4, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06e0\u0736"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x46d9

    const v6, -0x334e7020    # -9.309363E7f

    xor-int/2addr v5, v6

    const v6, -0x6413eb1

    goto/16 :goto_0

    .line 202
    :sswitch_9
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result v4

    if-ltz v4, :cond_6

    :goto_2
    const-string v4, "\u1a74\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x457f

    const v6, -0x3e533a7f

    xor-int/2addr v5, v6

    const v6, 0x31dff58b

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06df\u1a7b"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x29e5

    const v6, -0x66887554

    xor-int/2addr v5, v6

    const v6, -0x1dcbaff3

    goto/16 :goto_0

    .line 205
    :sswitch_a
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v4

    if-gtz v4, :cond_8

    :cond_7
    const-string v4, "\u0736\u1a75"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5c5f

    const v6, -0x36b3e02b

    xor-int/2addr v5, v6

    const v6, -0x55e832b

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e0\u06e1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x33c7

    const v6, -0x3345e166    # -9.758024E7f

    xor-int/2addr v5, v6

    const v6, 0x59c5bd44

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06df\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3acf

    const v6, 0x434a4a7e

    xor-int/2addr v5, v6

    const v6, 0x27d1b7ef

    goto/16 :goto_0

    .line 50
    :sswitch_c
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06e7\u06eb"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3ecb

    const v6, 0x11a9406f

    xor-int/2addr v5, v6

    const v6, 0x1ab846ce

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06eb\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5ff9

    const v6, 0x4b21020b    # 1.0551819E7f

    xor-int/2addr v5, v6

    const v6, 0x54c8db41

    goto/16 :goto_0

    .line 138
    :sswitch_d
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d9\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3da7

    const v6, 0x15743255

    xor-int/2addr v5, v6

    const v6, -0x5600fd35

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x13a3

    const v6, 0x1bbb48a5

    xor-int/2addr v5, v6

    const v6, 0x66fae5ee

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ba197f0 -> :sswitch_7
        -0x765950a8 -> :sswitch_2
        -0x6bb2795c -> :sswitch_4
        -0x6ad43140 -> :sswitch_8
        -0x577a6121 -> :sswitch_b
        -0x5544d13e -> :sswitch_a
        -0x4fd403db -> :sswitch_5
        -0x44b54120 -> :sswitch_6
        -0x41af3ab6 -> :sswitch_d
        -0x1999f2a7 -> :sswitch_c
        0x490b388 -> :sswitch_c
        0x857bce5 -> :sswitch_8
        0x9a8da84 -> :sswitch_1
        0xe154d7e -> :sswitch_b
        0x223cc3a1 -> :sswitch_5
        0x270d80cc -> :sswitch_3
        0x28f72847 -> :sswitch_0
        0x330e508f -> :sswitch_d
        0x3922f63b -> :sswitch_6
        0x4c3e3eeb -> :sswitch_3
        0x50fd842d -> :sswitch_0
        0x549d1aea -> :sswitch_9
        0x59d8d6e6 -> :sswitch_9
        0x6215c84d -> :sswitch_1
        0x6a0c5b8e -> :sswitch_a
        0x6ef76493 -> :sswitch_2
        0x71a68441 -> :sswitch_4
        0x76b13a7d -> :sswitch_7
    .end sparse-switch
.end method
