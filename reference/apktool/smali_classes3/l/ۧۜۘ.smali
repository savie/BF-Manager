.class public final Ll/ۧۜۘ;
.super Ldalvik/system/DexClassLoader;
.source "E411"


# instance fields
.field public final synthetic ۙ:Ldalvik/system/BaseDexClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ldalvik/system/DexClassLoader;Ldalvik/system/BaseDexClassLoader;)V
    .locals 3

    const v0, -0x41e4b021

    sget v1, Ll/֡ܳ;->֡۠ۧ:I

    sget v2, Ll/ۘۚ;->ܺ᩶ܽ:I

    .line 60
    iput-object p4, p0, Ll/ۧۜۘ;->ۙ:Ldalvik/system/BaseDexClassLoader;

    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p4, p3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    const-string p1, "\u06e8\u06d9"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x2f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1a83

    const p3, -0x2f17f9d4

    xor-int/2addr p2, p3

    const p3, -0x5e0a75f9

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x87

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 51
    invoke-static {}, Ll/֨᩹;->ۜ֡ۡ()I

    sget-boolean p1, Ll/֫ܶ;->ۧ᩵۫:Z

    if-eqz p1, :cond_1

    goto :goto_2

    .line 22
    :sswitch_0
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/ۘۗ;->᩻ۗۖ()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e2\u05a8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x4f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3263

    const p3, -0x799c2c64

    xor-int/2addr p2, p3

    const p3, -0x1264b23d

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u06eb\u0736"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2eab

    const p3, -0x77a07fd6

    xor-int/2addr p2, p3

    const p3, -0x5c30afcc

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    sget p1, Ll/֫ܽ;->֡ᩴܶ:I

    if-gez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u1a7b\u06e2"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x67

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2c1d

    const p3, -0x4ed62be3

    xor-int/2addr p2, p3

    const p3, 0x759098e7

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    invoke-static {}, Ll/֨᩺;->ܳۤۖ()Z

    :goto_2
    const-string p1, "\u06e1\u1a77"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x37

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1a67

    const p3, 0x79b39e9

    xor-int/2addr p2, p3

    const p3, 0x47abd9c0    # 87987.5f

    goto/16 :goto_0

    .line 55
    :sswitch_3
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    invoke-static {}, Ll/ۖ᩸;->۫᩻ܽ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz p1, :cond_3

    const-string p1, "\u1a7a\u06da"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0xf

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5d57

    const p3, -0x4122ae33

    xor-int/2addr p2, p3

    const p3, 0x142442b5

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06d8\u1a78"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1eb3

    const p3, 0x5b4e1045

    xor-int/2addr p2, p3

    const p3, 0x164a7861

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5dea748b -> :sswitch_2
        -0x43b8a6e4 -> :sswitch_5
        -0x39bc7e5e -> :sswitch_0
        -0x452c548 -> :sswitch_1
        0x1f5e7ac4 -> :sswitch_0
        0x26ba891c -> :sswitch_1
        0x3334a11b -> :sswitch_4
        0x4555ff79 -> :sswitch_3
        0x58555fa7 -> :sswitch_4
        0x5b7a35bb -> :sswitch_3
        0x60df474c -> :sswitch_2
        0x7081c27c -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۧۜۘ;->ۙ:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public final getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۧۜۘ;->ۙ:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final getResources(Ljava/lang/String;)Ljava/util/Enumeration;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۧۜۘ;->ۙ:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object p1

    return-object p1
.end method
