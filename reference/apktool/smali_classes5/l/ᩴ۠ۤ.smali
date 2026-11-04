.class public Ll/ᩴ۠ۤ;
.super Ll/֨ܶ;
.source "B97X"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Ll/֨ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const v0, -0x634e9b2e

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/ۗܶ;->ᩴ֫۫:I

    .line 20
    invoke-direct {p0, p1, p2, p3}, Ll/֨ܶ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u1a7a\u06ec"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x55

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7e79

    const p3, 0x443945fe

    xor-int/2addr p2, p3

    const p3, 0x639e9f0c

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x1649

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/֨ܿ;->᩹᩻۟:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06d6\u06db"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x75

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x492b

    const p3, -0x311ebbfd

    xor-int/2addr p2, p3

    const p3, -0x37a71693

    goto :goto_0

    .line 18
    :sswitch_0
    sget p1, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u05ab\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2649

    const p3, 0x5ecb5d47

    xor-int/2addr p2, p3

    const p3, -0x1ff13561

    goto :goto_0

    :sswitch_1
    sget p1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a77\u05ab"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x71

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x46a9

    const p3, 0x5ac65451

    xor-int/2addr p2, p3

    const p3, -0x78fdd274

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    :goto_2
    const-string p1, "\u06e4\u1a77"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x69

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x29dd

    const p3, -0x5c2aa02

    xor-int/2addr p2, p3

    const p3, -0x4e55b2fa

    goto :goto_0

    .line 12
    :sswitch_3
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 11
    :sswitch_5
    sget p1, Ll/֡᩵;->ۤܳ۬:I

    if-ltz p1, :cond_3

    const-string p1, "\u06e1\u06d8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x33

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2883

    const p3, 0x57277bd9

    xor-int/2addr p2, p3

    const p3, 0x48b71364    # 374939.12f

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a76\u06d9"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x44d7

    const p3, 0x63fd62d7

    xor-int/2addr p2, p3

    const p3, 0xe997ab9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7598ff23 -> :sswitch_5
        -0x224d0f24 -> :sswitch_0
        -0xc071cf5 -> :sswitch_1
        0x8c62c5c -> :sswitch_2
        0x1d6cdd53 -> :sswitch_4
        0x21b45f49 -> :sswitch_3
        0x381b6034 -> :sswitch_5
        0x38b40f4e -> :sswitch_2
        0x3ae08ae5 -> :sswitch_3
        0x3b8a17f7 -> :sswitch_0
        0x3f3ea642 -> :sswitch_1
        0x5dedc9f8 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final toggle()V
    .locals 0

    return-void
.end method
