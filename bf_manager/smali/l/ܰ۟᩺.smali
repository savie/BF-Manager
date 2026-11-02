.class public final Ll/ܰ۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Landroid/app/Activity;

.field public final synthetic ᩶:Ll/ۗ᩷ۘ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7b

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Ll/ۗ᩷ۘ;Ljava/lang/String;)V
    .locals 3

    const v0, -0x1bcc0a1e

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    sget v2, Ll/ۘۧ;->ܳ᩷᩸:I

    .line 606
    iput-object p3, p0, Ll/ܰ۟᩺;->֡:Ljava/lang/String;

    iput-object p1, p0, Ll/ܰ۟᩺;->ܺ:Landroid/app/Activity;

    iput-object p2, p0, Ll/ܰ۟᩺;->᩶:Ll/ۗ᩷ۘ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06d9\u06df"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x477d

    const p3, 0xa9208c8

    xor-int/2addr p2, p3

    const p3, -0x5d7cd8ce

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x7265

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֨᩸;->۬۟᩶()I

    sget p1, Ll/ۖ᩸;->ۨܽ۬:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e0\u1a75"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x6b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x71af

    const p3, 0x26298b54

    xor-int/2addr p2, p3

    const p3, -0x2cae6030

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/۟;->۬ۙܿ()Z

    sget p1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u0733\u1a78"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6a87

    const p3, 0x12ffdcf4

    xor-int/2addr p2, p3

    const p3, -0x6e0fc291

    goto :goto_0

    .line 407
    :sswitch_1
    sget p1, Ll/ۖۧ;->ܺۚۖ:I

    if-lez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a76\u1a75"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x19

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6407

    const p3, -0x7d74bc83

    xor-int/2addr p2, p3

    const p3, 0x41129ac9

    goto :goto_0

    .line 273
    :sswitch_2
    invoke-static {}, Ll/ۧ;->ۨ᩻ۨ()Z

    :goto_2
    const-string p1, "\u0730\u06e2"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x7f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5721

    const p3, 0x70c17f10

    xor-int/2addr p2, p3

    const p3, -0x17a9eee8

    goto :goto_0

    .line 79
    :sswitch_3
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 48
    :sswitch_5
    sget-boolean p1, Ll/֫ۛ;->ۜ᩷ۢ:Z

    if-nez p1, :cond_3

    const-string p1, "\u0730\u073f"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x569

    const p3, -0x349a66a8    # -1.5047E7f

    xor-int/2addr p2, p3

    const p3, 0x1aa6dfff

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a79\u06da"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x257f

    const p3, 0x79b05fd

    xor-int/2addr p2, p3

    const p3, 0x3f6a50ef

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b2cd6c9 -> :sswitch_3
        -0x372513b5 -> :sswitch_0
        -0x32b995b6 -> :sswitch_3
        -0x1150ef5d -> :sswitch_0
        -0xb1f89f0 -> :sswitch_5
        -0x6f82a4b -> :sswitch_4
        0x68a2855 -> :sswitch_1
        0x3119b1c2 -> :sswitch_2
        0x64075113 -> :sswitch_1
        0x6cbc916f -> :sswitch_5
        0x7580b7b3 -> :sswitch_2
        0x7e511a16 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
