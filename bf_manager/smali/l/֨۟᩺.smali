.class public final Ll/֨۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ܺ:Ll/᩻ۡ᩺;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ۜۡ᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ll/᩻ۡ᩺;Ll/ۜۡ᩺;)V
    .locals 3

    const v0, -0x204ce4a7

    sget v1, Ll/֨ܰ;->ۢ᩷۟:I

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    .line 966
    iput p1, p0, Ll/֨۟᩺;->֡:I

    iput-object p2, p0, Ll/֨۟᩺;->ܽ:Ljava/lang/String;

    iput-object p3, p0, Ll/֨۟᩺;->ܺ:Ll/᩻ۡ᩺;

    iput-object p4, p0, Ll/֨۟᩺;->᩶:Ll/ۜۡ᩺;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u1a76\u06df"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x6f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2031

    const p3, 0x1276d57d

    xor-int/2addr p2, p3

    const p3, -0x1b6e012d

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x7b3b

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    goto :goto_2

    .line 29
    :sswitch_0
    invoke-static {}, Ll/ۗ;->ۢۢܺ()Z

    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a7b\u1a75"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x6f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2907

    const p3, -0x7e98b83e

    xor-int/2addr p2, p3

    const p3, 0x377436ae

    goto :goto_0

    .line 850
    :sswitch_1
    sget p1, Ll/ۘۗ;->ۖۧ۬:I

    if-ltz p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u05a8\u06eb"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6f81

    const p3, -0x1bb5ff85

    xor-int/2addr p2, p3

    const p3, 0x1908142f

    goto :goto_0

    .line 98
    :sswitch_2
    invoke-static {}, Ll/ۗᩳ;->ᩳۘۘ()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u073d\u06e4"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x59

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x4f07

    const p3, 0x653d531a

    xor-int/2addr p2, p3

    const p3, -0x2e869cc8

    goto :goto_0

    :goto_2
    const-string p1, "\u06e1\u1a7a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x37

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6ced

    const p3, -0x2a831ade

    xor-int/2addr p2, p3

    const p3, -0x3bd22192

    goto :goto_0

    .line 645
    :sswitch_3
    invoke-static {}, Ll/֨۟;->ܶܽܶ()I

    invoke-static {}, Ll/ۗ۬;->֡ᩳܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    invoke-static {}, Ll/֫֡;->ܽۖܿ()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u073d\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x694d

    const p3, 0x29b24f3e

    xor-int/2addr p2, p3

    const p3, -0x410ba24c

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u0736\u0733"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x137d

    const p3, -0x7047838a

    xor-int/2addr p2, p3

    const p3, -0x62eb006a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5b276630 -> :sswitch_2
        -0x5b065575 -> :sswitch_3
        -0x57412981 -> :sswitch_1
        -0x1d58bb34 -> :sswitch_4
        -0x19b77e8d -> :sswitch_3
        -0x16562d36 -> :sswitch_5
        -0x130ed9c5 -> :sswitch_0
        0xd996410 -> :sswitch_1
        0x4433b320 -> :sswitch_4
        0x4631114d -> :sswitch_5
        0x4f36a3bd -> :sswitch_0
        0x66bbff8b -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
