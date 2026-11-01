.class public Ll/ۚ֫ۨ;
.super Ll/۫ᩳ;
.source "B97X"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Ll/۫ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const v0, 0x2fa21657

    sget v1, Ll/֡᩶;->ۗ֨ܺ:I

    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    .line 20
    invoke-direct {p0, p1, p2, p3}, Ll/۫ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u1a75\u1a79"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x19

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x18a1

    const p3, -0x2b9749d

    xor-int/2addr p2, p3

    const p3, -0x40f0316

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x2cc3

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a7a\u1a74"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x41

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x619f

    const p3, -0x7f39a741

    xor-int/2addr p2, p3

    const p3, 0x2f5e7a45

    goto :goto_0

    .line 4
    :sswitch_1
    sget p1, Ll/֫᩺;->᩺۟ۘ:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u0736\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x52b1

    const p3, 0x76b451f2

    xor-int/2addr p2, p3

    const p3, -0xf44d1cc

    goto :goto_0

    :sswitch_2
    sget-boolean p1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u05a8\u06db"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x37

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2ffb

    const p3, 0x3ac7e3c6

    xor-int/2addr p2, p3

    const p3, 0x36d30259

    goto :goto_0

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    :goto_1
    const-string p1, "\u073f\u073d"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x67

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x97d

    const p3, -0x494b5ede

    xor-int/2addr p2, p3

    const p3, -0x51986c84

    goto :goto_0

    .line 5
    :sswitch_4
    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget p1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-eqz p1, :cond_3

    const-string p1, "\u06d7\u06eb"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x73

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0xc05

    const p3, -0x7074bf01

    xor-int/2addr p2, p3

    const p3, -0x6542bb87

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u05a1\u1a7a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7a81

    const p3, 0x45759b95

    xor-int/2addr p2, p3

    const p3, -0x56945671

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c66a1ca -> :sswitch_4
        -0x6b6acf76 -> :sswitch_5
        -0x55a41f1f -> :sswitch_0
        -0x462c7062 -> :sswitch_2
        -0x2b8391be -> :sswitch_1
        -0x1c2be43e -> :sswitch_2
        -0x6f335d6 -> :sswitch_0
        0xc376cbe -> :sswitch_4
        0x1dd9bad9 -> :sswitch_3
        0x3e2d61b3 -> :sswitch_1
        0x467d1276 -> :sswitch_3
        0x63272735 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final toggle()V
    .locals 0

    return-void
.end method
