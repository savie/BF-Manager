.class public final Ll/ۚ۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Ll/᩻ۡ᩺;

.field public final synthetic ᩶:Ll/ۘۡ᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4a

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/᩻ۡ᩺;Ll/ۘۡ᩺;)V
    .locals 3

    const v0, 0x15098dae

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    sget v2, Ll/֫ܽ;->֡ᩴܶ:I

    .line 921
    iput-object p1, p0, Ll/ۚ۟᩺;->֡:Ljava/lang/String;

    iput-object p2, p0, Ll/ۚ۟᩺;->ܺ:Ll/᩻ۡ᩺;

    iput-object p3, p0, Ll/ۚ۟᩺;->᩶:Ll/ۘۡ᩺;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e8\u05ab"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5a9b

    const p3, -0xc6765f

    xor-int/2addr p2, p3

    const p3, 0x56600606

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0xe37

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/֡᩶;->ۗ֨ܺ:I

    if-gtz p1, :cond_1

    goto :goto_2

    .line 533
    :sswitch_0
    sget p1, Ll/ۖ᩸;->ۨܽ۬:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06db\u1a78"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1021

    const p3, 0x75508b28

    xor-int/2addr p2, p3

    const p3, 0x638be328

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u06d6\u06db"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x73

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x45f9

    const p3, 0x227943ac

    xor-int/2addr p2, p3

    const p3, 0x58154538

    goto :goto_0

    .line 556
    :sswitch_1
    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    sget-boolean p1, Ll/ۗܳ;->ۤᩴۗ:Z

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u05a1\u0733"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x43

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x58a1

    const p3, -0x6e4061d5

    xor-int/2addr p2, p3

    const p3, -0x4d0e27b4

    goto :goto_0

    .line 381
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->᩷ۙܺ()I

    invoke-static {}, Ll/֡۠;->᩹ۧᩴ()I

    :goto_3
    const-string p1, "\u0730\u06e0"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6723

    const p3, 0x7ad1547d

    xor-int/2addr p2, p3

    const p3, 0x140983d0

    goto :goto_0

    .line 285
    :sswitch_3
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz p1, :cond_3

    const-string p1, "\u06d9\u06e7"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x39

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x54f7

    const p3, -0x31556542

    xor-int/2addr p2, p3

    const p3, 0x3e2c0163

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e7\u06da"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x57

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x61d9

    const p3, -0x228079ca

    xor-int/2addr p2, p3

    const p3, -0x1f336dcb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c8c7501 -> :sswitch_3
        -0x41e1bcb2 -> :sswitch_1
        -0x3ee5cea6 -> :sswitch_5
        -0x17f48e8b -> :sswitch_2
        -0x3f3b19d -> :sswitch_4
        0x16cf550 -> :sswitch_5
        0x12835584 -> :sswitch_3
        0x23c3b4ca -> :sswitch_4
        0x2e852282 -> :sswitch_0
        0x42e95964 -> :sswitch_0
        0x5f066072 -> :sswitch_2
        0x6f86b6bd -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
