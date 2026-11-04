.class public final Ll/᩵᩶֫;
.super Ldalvik/system/DexClassLoader;
.source "E411"


# instance fields
.field public final synthetic ۙ:Ldalvik/system/BaseDexClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ldalvik/system/DexClassLoader;Ldalvik/system/BaseDexClassLoader;)V
    .locals 3

    const v0, -0x7975cf23

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    sget v2, Ll/ۖۖ;->᩵ۜ֨:I

    .line 60
    iput-object p4, p0, Ll/᩵᩶֫;->ۙ:Ldalvik/system/BaseDexClassLoader;

    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p4, p3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    const-string p1, "\u06e8\u05a8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3989

    const p3, -0x49419e6d

    xor-int/2addr p2, p3

    const p3, -0x778378c1

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x5c9b

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget p1, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06d7\u05a8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x4f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2631

    const p3, -0x7c02f878

    xor-int/2addr p2, p3

    const p3, -0x712d56a8

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u073d\u06eb"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x7

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3287

    const p3, -0x30cd5b74

    xor-int/2addr p2, p3

    const p3, -0x61b65091

    goto :goto_0

    :sswitch_1
    sget p1, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u1a78\u06df"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6271

    const p3, -0x2dbb61a5

    xor-int/2addr p2, p3

    const p3, -0xa475846

    goto :goto_0

    .line 48
    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    :goto_1
    const-string p1, "\u06e0\u073d"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1e7

    const p3, 0x47f407f6

    xor-int/2addr p2, p3

    const p3, -0x4bffdc47

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 44
    :sswitch_5
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u0736\u05ab"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5eeb

    const p3, 0x645e4540

    xor-int/2addr p2, p3

    const p3, -0x21b77bdb

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e2\u06d8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x37ff

    const p3, 0x7056e51c

    xor-int/2addr p2, p3

    const p3, -0x53f104ca

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x1c23f9eb -> :sswitch_4
        -0xc059ea2 -> :sswitch_2
        -0x38d6c89 -> :sswitch_0
        0xdbf16ca -> :sswitch_5
        0x2b5379ef -> :sswitch_0
        0x3c6e2e90 -> :sswitch_4
        0x456e0fc5 -> :sswitch_1
        0x51e2988f -> :sswitch_3
        0x5702ccc0 -> :sswitch_5
        0x65db954d -> :sswitch_2
        0x6b7e6fdb -> :sswitch_3
        0x7dc31486 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/᩵᩶֫;->ۙ:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public final getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/᩵᩶֫;->ۙ:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final getResources(Ljava/lang/String;)Ljava/util/Enumeration;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/᩵᩶֫;->ۙ:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object p1

    return-object p1
.end method
