.class public final Ll/ۤ۬᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܰ:Ll/֨۠᩻;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ll/֫۠᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x61

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ll/֨۠᩻;Ll/֫۠᩻;)V
    .locals 3

    const v0, 0x175ab9de

    sget v1, Ll/᩶;->ᩴ᩶ۛ:I

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    .line 1083
    iput p1, p0, Ll/ۤ۬᩻;->ܿ:I

    iput-object p2, p0, Ll/ۤ۬᩻;->֡:Ljava/lang/String;

    iput-object p3, p0, Ll/ۤ۬᩻;->ܰ:Ll/֨۠᩻;

    iput-object p4, p0, Ll/ۤ۬᩻;->᩶:Ll/֫۠᩻;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06da\u1a7a"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3c99

    const p3, 0x38692fa7

    xor-int/2addr p2, p3

    const p3, 0x7ae4963e

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x70d

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 128
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget p1, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e2\u0736"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x37

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x34a5

    const p3, 0x509c992e

    xor-int/2addr p2, p3

    const p3, 0x29969066

    goto :goto_0

    .line 406
    :sswitch_0
    sget p1, Ll/֫֡;->֫ۙۖ:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06e7\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x6b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x330d

    const p3, 0x43e6915e

    xor-int/2addr p2, p3

    const p3, -0x4e6af477

    goto :goto_0

    .line 893
    :sswitch_1
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e4\u06d6"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5807

    const p3, 0x8b88d04

    xor-int/2addr p2, p3

    const p3, 0x750f6d09

    goto :goto_0

    .line 877
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    :goto_2
    const-string p1, "\u05a1\u05a1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x45

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5d59

    const p3, -0x357fb3e8    # -4204044.0f

    xor-int/2addr p2, p3

    const p3, -0x353a1881    # -6484927.5f

    goto :goto_0

    .line 267
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 786
    :sswitch_5
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    move-result p1

    if-ltz p1, :cond_3

    const-string p1, "\u0736\u05a8"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x3b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5de5

    const p3, 0x1778b964

    xor-int/2addr p2, p3

    const p3, 0xe8158d7

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e8\u06da"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x420d

    const p3, 0x7517d653

    xor-int/2addr p2, p3

    const p3, -0x6fb34649

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79acc8dc -> :sswitch_5
        -0x7801d118 -> :sswitch_0
        -0x47bb2ffc -> :sswitch_1
        -0x457f5240 -> :sswitch_4
        -0xd6c46ac -> :sswitch_5
        0x2b251ad -> :sswitch_3
        0x3298e6d1 -> :sswitch_0
        0x38269a8a -> :sswitch_3
        0x53fe3a91 -> :sswitch_2
        0x5fc379fe -> :sswitch_2
        0x68e6ce32 -> :sswitch_1
        0x7f226c4a -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
