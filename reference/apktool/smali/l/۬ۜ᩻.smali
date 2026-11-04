.class public final Ll/۬ۜ᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܰ:Landroid/app/Activity;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ll/۠ۡ᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6e

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/app/Activity;Ll/۠ۡ᩻;)V
    .locals 3

    const v0, -0x492c987f

    sget v1, Ll/֨᩻;->ۛ֫ܶ:I

    sget v2, Ll/ۖ;->ܿۚ֡:I

    .line 822
    iput-object p1, p0, Ll/۬ۜ᩻;->֡:Ljava/lang/String;

    iput p2, p0, Ll/۬ۜ᩻;->ܿ:I

    iput-object p3, p0, Ll/۬ۜ᩻;->ܰ:Landroid/app/Activity;

    iput-object p4, p0, Ll/۬ۜ᩻;->᩶:Ll/۠ۡ᩻;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u1a78\u06eb"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x23

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x60f

    const p3, 0x51c1decc

    xor-int/2addr p2, p3

    const p3, 0x125475f1

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x1a09

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    sget-boolean p1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-nez p1, :cond_1

    goto :goto_1

    .line 269
    :sswitch_0
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget p1, Ll/֡۟;->᩶᩺ܰ:I

    if-lez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u06da\u06e7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x29ff

    const p3, -0x6012dd2b

    xor-int/2addr p2, p3

    const p3, -0x19c04d1c

    goto :goto_0

    :cond_1
    const-string p1, "\u06d7\u05ab"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x5f6f

    const p3, 0x41d5685e

    xor-int/2addr p2, p3

    const p3, 0x69448af5

    goto :goto_0

    .line 427
    :sswitch_1
    sget p1, Ll/᩺;->۫۬۫:I

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e8\u1a76"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7221

    const p3, -0x29db8f53

    xor-int/2addr p2, p3

    const p3, -0x549a3892

    goto :goto_0

    .line 452
    :sswitch_2
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    :goto_2
    const-string p1, "\u05ab\u05a8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x7b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xe35

    const p3, -0x1fc32529

    xor-int/2addr p2, p3

    const p3, 0x1bd743ad

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 502
    :sswitch_5
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result p1

    if-ltz p1, :cond_3

    const-string p1, "\u1a7b\u073d"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3a4d

    const p3, 0x3ab08b23

    xor-int/2addr p2, p3

    const p3, 0x590b7df6

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06d9\u0736"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x357d

    const p3, -0x4051c1e7

    xor-int/2addr p2, p3

    const p3, 0x20652b78

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e8fc2cc -> :sswitch_0
        -0x79f1325f -> :sswitch_3
        -0x79892e15 -> :sswitch_0
        -0x5f8d91f4 -> :sswitch_4
        -0x1ebc2e1c -> :sswitch_5
        -0x16bb807f -> :sswitch_3
        -0x16ac32b8 -> :sswitch_1
        -0xd5b0a4c -> :sswitch_1
        0x222812ca -> :sswitch_2
        0x6009fc8a -> :sswitch_4
        0x6315535b -> :sswitch_5
        0x741ba7df -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
