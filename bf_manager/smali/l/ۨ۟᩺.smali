.class public final Ll/ۨ۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# static fields
.field private static final ᩴۖ᩵:[S


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܺ:Ll/᩻ۡ᩺;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/۬ۡ᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6e

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨ۟᩺;->ᩴۖ᩵:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1d31s
        -0x774cs
        -0x7761s
        -0x774cs
        -0x7745s
        -0x776es
        -0x7717s
        -0x770as
        -0x774fs
        -0x775ds
        -0x770bs
        -0x770as
        -0x771cs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/᩻ۡ᩺;Ll/۬ۡ᩺;)V
    .locals 3

    const v0, 0x4b17d776    # 9951094.0f

    sget v1, Ll/ۗܺ;->ۨ᩺۠:I

    sget v2, Ll/֨ۢ;->ۢ۬ۧ:I

    .line 666
    iput-object p1, p0, Ll/ۨ۟᩺;->ܽ:Ljava/lang/String;

    iput-object p2, p0, Ll/ۨ۟᩺;->֡:Ljava/lang/String;

    iput-object p3, p0, Ll/ۨ۟᩺;->ܺ:Ll/᩻ۡ᩺;

    iput-object p4, p0, Ll/ۨ۟᩺;->᩶:Ll/۬ۡ᩺;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e7\u06e2"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x20f

    const p3, -0x2609eda6

    xor-int/2addr p2, p3

    const p3, 0x622fa6db

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x2e3

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 148
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    sget p1, Ll/֡᩸;->ۨ᩵ܽ:I

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e1\u0733"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4d73

    const p3, -0x18a72cdf

    xor-int/2addr p2, p3

    const p3, -0x7d34678e

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    move-result p1

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a7a\u1a7b"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x49b3

    const p3, 0x722a81b9

    xor-int/2addr p2, p3

    const p3, 0x279958c

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    sget-boolean p1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a74\u0733"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x59a7

    const p3, -0x66824530

    xor-int/2addr p2, p3

    const p3, -0x33a9fdde    # -5.6101E7f

    goto :goto_0

    .line 574
    :sswitch_3
    invoke-static {}, Ll/ۗܺ;->ᩴۤ֫()Z

    :goto_2
    const-string p1, "\u06ec\u06eb"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x65

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x611d

    const p3, -0x1425fe8a

    xor-int/2addr p2, p3

    const p3, 0x70588381

    goto/16 :goto_0

    :sswitch_4
    return-void

    .line 399
    :sswitch_5
    sget-boolean p1, Ll/֫ۘ;->᩷᩻ۜ:Z

    if-eqz p1, :cond_3

    const-string p1, "\u1a7a\u1a75"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x4d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2df3

    const p3, -0x52b54aeb

    xor-int/2addr p2, p3

    const p3, 0x613ada35

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a76\u0733"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x69

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x77e5

    const p3, 0x5f9a66d7

    xor-int/2addr p2, p3

    const p3, 0x5a8e41fb

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73c1af81 -> :sswitch_0
        -0x69606ce8 -> :sswitch_1
        -0x628a4da2 -> :sswitch_2
        -0x4d617131 -> :sswitch_5
        -0x3472766d -> :sswitch_1
        0x1ce4cdd2 -> :sswitch_3
        0x1f4bc1ad -> :sswitch_4
        0x39677169 -> :sswitch_3
        0x3c268e05 -> :sswitch_4
        0x4b3c175e -> :sswitch_2
        0x5a42e849 -> :sswitch_0
        0x61c6e382 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
