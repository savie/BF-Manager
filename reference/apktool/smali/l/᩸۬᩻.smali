.class public final Ll/᩸۬᩻;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ֡:Ljava/lang/String;

.field public final synthetic ܰ:Ll/֨۠᩻;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ll/ۧ۠᩻;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa4

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ll/֨۠᩻;Ll/ۧ۠᩻;)V
    .locals 3

    const v0, -0x4bd098ee

    sget v1, Ll/ۖۗ;->᩻ܳܶ:I

    sget v2, Ll/ۗܰ;->ܶۜ۬:I

    .line 1112
    iput p1, p0, Ll/᩸۬᩻;->ܿ:I

    iput-object p2, p0, Ll/᩸۬᩻;->֡:Ljava/lang/String;

    iput-object p3, p0, Ll/᩸۬᩻;->ܰ:Ll/֨۠᩻;

    iput-object p4, p0, Ll/᩸۬᩻;->᩶:Ll/ۧ۠᩻;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06d8\u06eb"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x2f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x5cd9

    const p3, 0x67edc994

    xor-int/2addr p2, p3

    const p3, 0x3eade4b0

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x72e1

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 287
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 807
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0736\u06df"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1b6f

    const p3, -0x3c5a6624

    xor-int/2addr p2, p3

    const p3, -0x6e57d3ac

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u05ab\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x44d3

    const p3, 0x7296fc38

    xor-int/2addr p2, p3

    const p3, -0x63f0a42a

    goto :goto_0

    .line 341
    :sswitch_2
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06da\u073f"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1c75

    const p3, 0x2ae1f88a

    xor-int/2addr p2, p3

    const p3, 0x7b33c05

    goto :goto_0

    .line 1097
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    :goto_2
    const-string p1, "\u1a78\u0730"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x6d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x59e5

    const p3, 0x30281eca

    xor-int/2addr p2, p3

    const p3, 0x4c61eff8    # 5.922813E7f

    goto :goto_0

    :sswitch_4
    return-void

    .line 852
    :sswitch_5
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "\u0736\u1a7b"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x50ad

    const p3, -0x3531f31a    # -6751859.0f

    xor-int/2addr p2, p3

    const p3, 0x4b1e6b4e    # 1.0382158E7f

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06db\u1a76"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6219

    const p3, 0x5f701a01

    xor-int/2addr p2, p3

    const p3, 0x4ecae110

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b64afc3 -> :sswitch_5
        -0x62a07738 -> :sswitch_4
        -0x5ca8d213 -> :sswitch_0
        -0x597c4cb3 -> :sswitch_4
        -0x1a89a1bc -> :sswitch_1
        -0x172efa79 -> :sswitch_2
        -0x1005a4fa -> :sswitch_3
        -0xcc1abd6 -> :sswitch_2
        0xaf7c2b2 -> :sswitch_3
        0x2de4bc59 -> :sswitch_0
        0x31b3ea8e -> :sswitch_1
        0x64e3c1b9 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
