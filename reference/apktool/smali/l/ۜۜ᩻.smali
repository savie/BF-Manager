.class public final Ll/ۜۜ᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# static fields
.field private static final ۤ᩻ۙ:[S


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܰ:Ll/֨۠᩻;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/۫۠᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4a

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۜۜ᩻;->ۤ᩻ۙ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x6f4s
        -0x390bs
        -0x3922s
        -0x390bs
        -0x3906s
        -0x392ds
        -0x3958s
        -0x3949s
        -0x3910s
        -0x391es
        -0x394cs
        -0x3949s
        -0x395bs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/֨۠᩻;Ll/۫۠᩻;)V
    .locals 3

    const v0, -0x6b2fdd7e

    sget v1, Ll/ۗܶ;->ᩴ֫۫:I

    sget v2, Ll/ۖۗ;->᩻ܳܶ:I

    .line 782
    iput-object p1, p0, Ll/ۜۜ᩻;->֡:Ljava/lang/String;

    iput-object p2, p0, Ll/ۜۜ᩻;->ܿ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۜۜ᩻;->ܰ:Ll/֨۠᩻;

    iput-object p4, p0, Ll/ۜۜ᩻;->᩶:Ll/۫۠᩻;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e7\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x9

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x40cd

    const p3, 0x92604f

    xor-int/2addr p2, p3

    const p3, -0xfc63dbc

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x2015

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 591
    sget p1, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz p1, :cond_3

    const-string p1, "\u06df\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x595d

    const p3, 0x693bfae2

    xor-int/2addr p2, p3

    const p3, 0x6a763d17

    goto :goto_0

    .line 779
    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06ec\u06e7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x5

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4e27

    const p3, -0x5646fa5b

    xor-int/2addr p2, p3

    const p3, 0x4bd6c8e9    # 2.8152274E7f

    goto :goto_0

    .line 647
    :sswitch_1
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u1a75\u06d8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x786b

    const p3, -0x6304a674

    xor-int/2addr p2, p3

    const p3, 0x6cb67b07

    goto :goto_0

    .line 109
    :sswitch_2
    sget p1, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a77\u06e1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xb

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6c43

    const p3, 0x6d3d364f

    xor-int/2addr p2, p3

    const p3, -0x1df66154

    goto :goto_0

    .line 747
    :sswitch_3
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    :goto_2
    const-string p1, "\u1a7b\u05ab"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4f15

    const p3, 0x2d10d43a

    xor-int/2addr p2, p3

    const p3, -0x76907826

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u06ec\u06e1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4aad

    const p3, 0x468718b7

    xor-int/2addr p2, p3

    const p3, -0x4ae5e78f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75605713 -> :sswitch_1
        -0x6565de7d -> :sswitch_4
        -0x55672486 -> :sswitch_3
        -0x3e3bae83 -> :sswitch_5
        -0x28198091 -> :sswitch_1
        -0x18458c33 -> :sswitch_3
        0x32021eb -> :sswitch_5
        0x1ea8461a -> :sswitch_0
        0x3a031534 -> :sswitch_0
        0x430df96e -> :sswitch_2
        0x7c880919 -> :sswitch_4
        0x7f43dccd -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
