.class public final Ll/۠ۜ᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ܰ:Landroid/app/Activity;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/۬ۙۧ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x52

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ll/۬ۙۧ;Ljava/lang/String;)V
    .locals 3

    const v0, -0x5a25a9c7

    sget v1, Ll/ۗ֡;->ۜ᩻۫:I

    sget v2, Ll/֡᩵;->ۤܳ۬:I

    .line 722
    iput-object p3, p0, Ll/۠ۜ᩻;->ܿ:Ljava/lang/String;

    iput-object p1, p0, Ll/۠ۜ᩻;->ܰ:Landroid/app/Activity;

    iput-object p2, p0, Ll/۠ۜ᩻;->᩶:Ll/۬ۙۧ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u1a7a\u1a7b"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2615

    const p3, -0x79b04dd6

    xor-int/2addr p2, p3

    const p3, 0x2359e251

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x24af

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/᩶;->ᩴ᩶ۛ:I

    if-lez p1, :cond_1

    goto :goto_2

    .line 125
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget p1, Ll/ۖۙ;->ۤۧۤ:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e1\u06eb"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7c1

    const p3, 0x38ed250b

    xor-int/2addr p2, p3

    const p3, 0x3193fb8f

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u06e8\u06da"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5feb

    const p3, 0x70e8fb6c

    xor-int/2addr p2, p3

    const p3, 0x55826c10

    goto :goto_0

    :sswitch_1
    sget p1, Ll/ۧ;->ۨۗܰ:I

    if-gez p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u06ec\u1a79"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7ef1

    const p3, -0x79bbf7ba

    xor-int/2addr p2, p3

    const p3, -0x171f880e

    goto :goto_0

    .line 188
    :sswitch_2
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    :goto_2
    const-string p1, "\u05a8\u0736"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x37

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x30e1

    const p3, 0x1c3ac4a8

    xor-int/2addr p2, p3

    const p3, 0x25ca43df

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz p1, :cond_3

    const-string p1, "\u06e8\u05a1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0xb

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xc8d

    const p3, -0x11ce29b0

    xor-int/2addr p2, p3

    const p3, -0x40a48c5d

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073a\u1a75"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x4bff

    const p3, -0x720a4f3a

    xor-int/2addr p2, p3

    const p3, 0x240e71c4

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ebfb958 -> :sswitch_4
        -0x5670c71e -> :sswitch_5
        -0x5124e1b3 -> :sswitch_4
        -0x45a16cb8 -> :sswitch_1
        -0xeda248e -> :sswitch_0
        0xb7397d6 -> :sswitch_1
        0x3adf503b -> :sswitch_5
        0x40536ec5 -> :sswitch_3
        0x463a5d65 -> :sswitch_0
        0x4aa6e64e -> :sswitch_2
        0x5211cd23 -> :sswitch_3
        0x6235130d -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
