.class public final Ll/᩹۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ܺ:Ll/᩻ۡ᩺;

.field public final synthetic ᩶:Ll/ۗ᩵᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa0

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(ILl/᩻ۡ᩺;Ll/ۗ᩵᩺;)V
    .locals 3

    const v0, -0x38436d43

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/֫᩺;->᩺۟ۘ:I

    .line 939
    iput p1, p0, Ll/᩹۟᩺;->֡:I

    iput-object p2, p0, Ll/᩹۟᩺;->ܺ:Ll/᩻ۡ᩺;

    iput-object p3, p0, Ll/᩹۟᩺;->᩶:Ll/ۗ᩵᩺;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e2\u1a7a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1373

    const p3, 0x7738aa3f

    xor-int/2addr p2, p3

    const p3, -0x5b68da62

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x725f

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 791
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    sget p1, Ll/ۘۚ;->ܺ᩶ܽ:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05ab\u1a7b"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4409

    const p3, 0x687455a9

    xor-int/2addr p2, p3

    const p3, -0x46dd8c4

    goto :goto_0

    .line 490
    :sswitch_0
    sget p1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06eb\u0733"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x5

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x695f

    const p3, 0x69f56801

    xor-int/2addr p2, p3

    const p3, 0x21c94b5e

    goto :goto_0

    .line 154
    :sswitch_1
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u06e0\u073d"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x61a9

    const p3, -0x431a3bee

    xor-int/2addr p2, p3

    const p3, -0x77ef4943

    goto :goto_0

    .line 282
    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    :goto_1
    const-string p1, "\u06d7\u0733"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6a4d

    const p3, -0x14035f00

    xor-int/2addr p2, p3

    const p3, 0xe39bff

    goto :goto_0

    .line 447
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֫ܳ;->֫᩺᩹()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 19
    :sswitch_5
    sget p1, Ll/ۗܺ;->ۨ᩺۠:I

    if-gtz p1, :cond_3

    const-string p1, "\u06eb\u073a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x23

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3fc9

    const p3, -0x1f972cc4

    xor-int/2addr p2, p3

    const p3, -0x51398be9

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a74\u06da"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x345b

    const p3, 0x761dbb

    xor-int/2addr p2, p3

    const p3, -0x18a055ca

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77cc02b1 -> :sswitch_1
        -0x73f694f9 -> :sswitch_0
        -0x671032c9 -> :sswitch_4
        -0x49d6d602 -> :sswitch_4
        -0x36f0e308 -> :sswitch_1
        -0x2cf3b3b3 -> :sswitch_5
        0x1dba92e -> :sswitch_5
        0xa5a2e12 -> :sswitch_0
        0xb59dbbf -> :sswitch_2
        0x3df78e5c -> :sswitch_2
        0x6725c6b8 -> :sswitch_3
        0x7778c6c8 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
