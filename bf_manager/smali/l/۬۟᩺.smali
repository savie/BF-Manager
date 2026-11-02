.class public final Ll/۬۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ܺ:Ll/᩻ۡ᩺;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ܽܺۜ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x77

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ll/᩻ۡ᩺;Ll/ܽܺۜ;)V
    .locals 3

    const v0, 0x4f511cba

    sget v1, Ll/ۖܽ;->ܳ۠᩹:I

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    .line 995
    iput p1, p0, Ll/۬۟᩺;->֡:I

    iput-object p2, p0, Ll/۬۟᩺;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/۬۟᩺;->ܺ:Ll/᩻ۡ᩺;

    iput-object p4, p0, Ll/۬۟᩺;->᩶:Ll/ܽܺۜ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u0733\u0730"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4a7b

    const p3, -0x25594440

    xor-int/2addr p2, p3

    const p3, 0x78ec36fa

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x4541

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 692
    invoke-static {}, Ll/֨֫;->ܶۡܽ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    sget-boolean p1, Ll/֨᩸;->ۚۢۧ:Z

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u1a79\u1a79"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x71ff

    const p3, 0x5544cd1d

    xor-int/2addr p2, p3

    const p3, 0xd81bd06

    goto :goto_0

    .line 336
    :sswitch_1
    invoke-static {}, Ll/֨ۧ;->֨᩸ܿ()I

    invoke-static {}, Ll/֫ۛ;->ۖ᩻ܿ()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u073f\u06ec"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x65

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2ac3

    const p3, -0x2ef9ccdf

    xor-int/2addr p2, p3

    const p3, -0x1b43669a

    goto :goto_0

    .line 241
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u05a8\u0733"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4f7d

    const p3, -0x4231cd40

    xor-int/2addr p2, p3

    const p3, -0x4fd7c997

    goto :goto_0

    .line 830
    :sswitch_3
    invoke-static {}, Ll/ۗܳ;->᩵ܽ۟()I

    :goto_2
    const-string p1, "\u06db\u06e8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x15

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x489d

    const p3, 0x225d42ca

    xor-int/2addr p2, p3

    const p3, -0x5f27a7c6

    goto/16 :goto_0

    :sswitch_4
    return-void

    .line 499
    :sswitch_5
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u073f\u0730"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x49

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x525d

    const p3, -0x3d7dccbc

    xor-int/2addr p2, p3

    const p3, -0x2c14a103

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u05ab\u06e7"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x2b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7ff7

    const p3, 0x47f468dc

    xor-int/2addr p2, p3

    const p3, -0x448c790e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7671c9eb -> :sswitch_5
        -0x51952d71 -> :sswitch_0
        -0x504c0528 -> :sswitch_3
        -0x4e995d94 -> :sswitch_2
        -0x4a8eb3f5 -> :sswitch_4
        -0x2a4669ed -> :sswitch_0
        -0x240616c3 -> :sswitch_2
        0x1219881c -> :sswitch_1
        0x3480920c -> :sswitch_4
        0x3d71bf9e -> :sswitch_3
        0x6777aa9d -> :sswitch_5
        0x7185a2d4 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
