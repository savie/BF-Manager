.class public final Ll/ۘ۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Ll/᩻ۡ᩺;

.field public final synthetic ᩶:Ll/֨ۡ᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3f

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/᩻ۡ᩺;Ll/֨ۡ᩺;)V
    .locals 3

    const v0, -0x2af7bd0c

    sget v1, Ll/ۖ᩸;->ۨܽ۬:I

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    .line 1013
    iput-object p1, p0, Ll/ۘ۟᩺;->֡:Ljava/lang/String;

    iput-object p2, p0, Ll/ۘ۟᩺;->ܺ:Ll/᩻ۡ᩺;

    iput-object p3, p0, Ll/ۘ۟᩺;->᩶:Ll/֨ۡ᩺;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u05ab\u05a8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x3b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6207

    const p3, 0x211356f6

    xor-int/2addr p2, p3

    const p3, 0x165317f1

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0xcf3

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 14
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u06d7\u06e8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x46b

    const p3, 0x3d3d08f1

    xor-int/2addr p2, p3

    const p3, -0x72a07a94

    goto :goto_0

    .line 624
    :sswitch_0
    sget p1, Ll/֫;->ܶܺ᩻:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06db\u06d6"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x31

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x49b9

    const p3, -0x5bcd2c7a

    xor-int/2addr p2, p3

    const p3, 0x3252f80a    # 1.2280006E-8f

    goto :goto_0

    .line 367
    :sswitch_1
    sget p1, Ll/ۗܺ;->ۨ᩺۠:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a7b\u1a75"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x17

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6815

    const p3, 0x8d1621e

    xor-int/2addr p2, p3

    const p3, 0x47e385e5

    goto :goto_0

    .line 70
    :sswitch_2
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    sget p1, Ll/֫ܽ;->֡ᩴܶ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u0730\u1a7a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1ed9

    const p3, 0x62b3f9

    xor-int/2addr p2, p3

    const p3, 0xe582e5b

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    :goto_2
    const-string p1, "\u1a75\u06e0"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x41

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xb6d

    const p3, -0x243fb724

    xor-int/2addr p2, p3

    const p3, 0x74e0f7fd

    goto/16 :goto_0

    .line 627
    :sswitch_4
    invoke-static {}, Ll/֫ᩳ;->۠ۧۨ()Z

    invoke-static {}, Ll/֡᩶;->ۢܳ᩺()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u0730\u06dc"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0xca3

    const p3, -0x3429970a    # -2.8103148E7f

    xor-int/2addr p2, p3

    const p3, -0x6aa339b8

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7af16854 -> :sswitch_0
        -0x785565b6 -> :sswitch_2
        -0x72044d47 -> :sswitch_2
        -0x70e15a51 -> :sswitch_1
        -0x3f49e895 -> :sswitch_1
        -0x2582bee2 -> :sswitch_4
        -0x2449c239 -> :sswitch_3
        -0x10b24165 -> :sswitch_3
        0x172e966f -> :sswitch_0
        0x45edd72b -> :sswitch_5
        0x61f2e686 -> :sswitch_4
        0x65d27fe2 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
