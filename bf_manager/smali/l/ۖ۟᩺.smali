.class public final Ll/ۖ۟᩺;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:I

.field public final synthetic ܺ:Landroid/app/Activity;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/ۨ᩵᩺;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2a

    invoke-static {v0}, Ll/ۛܶۘ;->ۤ᩻᩻(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILandroid/app/Activity;Ll/ۨ᩵᩺;)V
    .locals 3

    const v0, -0x4c2c5aaf

    sget v1, Ll/֫֡;->ۡ᩹ۗ:I

    sget v2, Ll/֫ᩳ;->۬֨᩸:I

    .line 706
    iput-object p1, p0, Ll/ۖ۟᩺;->ܽ:Ljava/lang/String;

    iput p2, p0, Ll/ۖ۟᩺;->֡:I

    iput-object p3, p0, Ll/ۖ۟᩺;->ܺ:Landroid/app/Activity;

    iput-object p4, p0, Ll/ۖ۟᩺;->᩶:Ll/ۨ᩵᩺;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06ec\u1a79"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x1f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2475

    const p3, -0x7260342d

    xor-int/2addr p2, p3

    const p3, 0x295a6cbf    # 4.8500046E-14f

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x613d

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/֡۠;->ۛ᩻ۧ:I

    if-gtz p1, :cond_3

    const-string p1, "\u06e1\u073d"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x3b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2333

    const p3, -0x4a8cb1d4

    xor-int/2addr p2, p3

    const p3, 0x3fd46107

    goto :goto_0

    .line 343
    :sswitch_0
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    move-result p1

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a7b\u06d8"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x76f

    const p3, 0xb717cfe

    xor-int/2addr p2, p3

    const p3, 0xe743e61

    goto :goto_0

    .line 309
    :sswitch_1
    invoke-static {}, Ll/֫۟;->ᩴۖᩳ()Z

    invoke-static {}, Ll/ۗ᩺;->᩺᩺ۖ()I

    move-result p1

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06ec\u05a1"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x75

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3f3

    const p3, 0x156a678a

    xor-int/2addr p2, p3

    const p3, -0xcdc0423

    goto :goto_0

    :sswitch_2
    sget p1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u1a7a\u06e0"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x5

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6ab9

    const p3, -0x1e78c901

    xor-int/2addr p2, p3

    const p3, 0x1bdd9fef

    goto :goto_0

    .line 573
    :sswitch_3
    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    invoke-static {}, Ll/ۖۧ;->ۢۜۚ()I

    :goto_2
    const-string p1, "\u073a\u1a76"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0xe71

    const p3, -0x79469106

    xor-int/2addr p2, p3

    const p3, -0x321e6903

    goto/16 :goto_0

    .line 617
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u1a7b\u1a7b"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4659

    const p3, 0x3661577b

    xor-int/2addr p2, p3

    const p3, 0x2e58612a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b970f45 -> :sswitch_2
        -0x6d724964 -> :sswitch_1
        -0x605c6424 -> :sswitch_0
        -0x601b0efb -> :sswitch_4
        -0x4f8b22c3 -> :sswitch_5
        0x25c3bee3 -> :sswitch_0
        0x3f799a25 -> :sswitch_3
        0x3fdabc2a -> :sswitch_4
        0x5c729858 -> :sswitch_1
        0x6a75cb95 -> :sswitch_2
        0x763e13e9 -> :sswitch_5
        0x7e0e5dc1 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
