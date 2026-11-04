.class public final Ll/ۙ۬᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ܰ:Ll/֨۠᩻;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ۚ۠᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/֨۠᩻;Ll/ۚ۠᩻;)V
    .locals 3

    const v0, 0xb2b938b

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    .line 1038
    iput-object p1, p0, Ll/ۙ۬᩻;->ܿ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۙ۬᩻;->ܰ:Ll/֨۠᩻;

    iput-object p3, p0, Ll/ۙ۬᩻;->᩶:Ll/ۚ۠᩻;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06da\u06db"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x65

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5d7b

    const p3, 0x7b73454d

    xor-int/2addr p2, p3

    const p3, -0x38a51e8

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x5881

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 670
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    .line 566
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a77\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x4b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2247

    const p3, -0x64e2b648

    xor-int/2addr p2, p3

    const p3, 0x4dd49022    # 4.4577696E8f

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u073a\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x42fb

    const p3, -0x68e3d093

    xor-int/2addr p2, p3

    const p3, 0x36a3e2d9

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget p1, Ll/ۖ;->ܿۚ֡:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    const-string p1, "\u0733\u1a79"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5e0f

    const p3, -0x547ef0e9

    xor-int/2addr p2, p3

    const p3, -0x3f38abc3

    goto :goto_0

    .line 401
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    :goto_2
    const-string p1, "\u05ab\u1a76"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x6b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x536f

    const p3, -0x712bc515

    xor-int/2addr p2, p3

    const p3, -0x6e664d1c

    goto :goto_0

    .line 441
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u1a77\u1a79"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1d11

    const p3, -0x51b6e155

    xor-int/2addr p2, p3

    const p3, -0x6e852bc5

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06d8\u0730"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x77

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6923

    const p3, 0x71cf1e58

    xor-int/2addr p2, p3

    const p3, 0x236e9f9d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x45afb3d8 -> :sswitch_2
        -0x315e4efc -> :sswitch_3
        -0x29d7e423 -> :sswitch_5
        -0x21319e3d -> :sswitch_3
        -0x20dd0360 -> :sswitch_4
        -0x14118496 -> :sswitch_0
        -0x341d3de -> :sswitch_5
        0x85059c0 -> :sswitch_1
        0x15453b80 -> :sswitch_0
        0x34948f1a -> :sswitch_2
        0x542bcab1 -> :sswitch_4
        0x7288ce03 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
