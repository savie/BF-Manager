.class public final Ll/᩷۬᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ܰ:Ll/֨۠᩻;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ll/۠ۖ᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9f

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(ILl/֨۠᩻;Ll/۠ۖ᩻;)V
    .locals 3

    const v0, -0x4db341da

    sget v1, Ll/֡ܳ;->֨ᩳۢ:I

    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    .line 1056
    iput p1, p0, Ll/᩷۬᩻;->ܿ:I

    iput-object p2, p0, Ll/᩷۬᩻;->ܰ:Ll/֨۠᩻;

    iput-object p3, p0, Ll/᩷۬᩻;->᩶:Ll/۠ۖ᩻;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06d8\u06d9"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0xf

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1de5

    const p3, 0x1408e504

    xor-int/2addr p2, p3

    const p3, -0x5b47a73b

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, 0x701b

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 1002
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06df\u06d6"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6045

    const p3, 0x4493a71d

    xor-int/2addr p2, p3

    const p3, 0x13686017

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u06d6\u1a73"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x23ff

    const p3, 0x17766657

    xor-int/2addr p2, p3

    const p3, 0x61c50fe3

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u06db\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x789d

    const p3, -0x2cea11b8

    xor-int/2addr p2, p3

    const p3, 0x6480a82e

    goto :goto_0

    :goto_3
    const-string p1, "\u06d6\u1a7b"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x73

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x43cb

    const p3, -0x6c732b63

    xor-int/2addr p2, p3

    const p3, -0x6c7aa948

    goto :goto_0

    .line 970
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 92
    :sswitch_5
    sget p1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz p1, :cond_3

    const-string p1, "\u1a74\u06d7"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1ddd

    const p3, 0x44e9c6ef

    xor-int/2addr p2, p3

    const p3, -0x7daa6493

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a77\u1a78"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x5f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2461

    const p3, -0x313d9d7a

    xor-int/2addr p2, p3

    const p3, 0x7b4d8f2e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ad8196a -> :sswitch_0
        -0x6a02e48b -> :sswitch_5
        -0x18237087 -> :sswitch_3
        -0x15035aa5 -> :sswitch_4
        0x6321aac -> :sswitch_2
        0x782dd80 -> :sswitch_0
        0x1bcb519f -> :sswitch_3
        0x1ea30608 -> :sswitch_1
        0x34a7c220 -> :sswitch_5
        0x3a720d90 -> :sswitch_4
        0x3af0e2f6 -> :sswitch_1
        0x485db888 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
