.class public final Ll/ܶۢ֫;
.super Ll/ۢ۟᩷;
.source "C2R7"


# instance fields
.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ᩷:Ll/֡֡᩷;

.field public final synthetic ᩸:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicInteger;Ll/֡֡᩷;)V
    .locals 3

    const v0, 0xf3b656b

    sget v1, Ll/ۧ;->ۨۗܰ:I

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    .line 1092
    iput-object p1, p0, Ll/ܶۢ֫;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Ll/ܶۢ֫;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Ll/ܶۢ֫;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p4, p0, Ll/ܶۢ֫;->᩷:Ll/֡֡᩷;

    invoke-direct {p0}, Ll/ۢ۟᩷;-><init>()V

    const-string p1, "\u06d6\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6bcf

    const p3, 0x415833c8

    xor-int/2addr p2, p3

    const p3, -0x76e65b06

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x5393

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    :sswitch_0
    sget p1, Ll/֫֡;->֫ۙۖ:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a77\u1a77"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x75

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7a87

    const p3, -0x4c11c9ca

    xor-int/2addr p2, p3

    const p3, -0x4f1a3510

    goto :goto_0

    .line 828
    :sswitch_1
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result p1

    if-lez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u1a77\u06d6"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1723

    const p3, -0x766b67f7

    xor-int/2addr p2, p3

    const p3, 0xb10c3e1

    goto :goto_0

    .line 714
    :sswitch_2
    sget p1, Ll/᩺;->۫۬۫:I

    if-gtz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06eb\u06d6"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2451

    const p3, 0x135417e4

    xor-int/2addr p2, p3

    const p3, 0x419984fd

    goto :goto_0

    .line 10
    :sswitch_3
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    :goto_2
    const-string p1, "\u073d\u1a7b"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4695

    const p3, 0x35b2ea34

    xor-int/2addr p2, p3

    const p3, 0x1d7581ce

    goto :goto_0

    .line 695
    :sswitch_4
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 945
    :sswitch_5
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u0736\u06eb"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x67

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x2115

    const p3, 0x6c52db91

    xor-int/2addr p2, p3

    const p3, 0x3b455a8f

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u05a1\u073f"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x3967

    const p3, 0x6b720dd6

    xor-int/2addr p2, p3

    const p3, 0x362bec79

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7068b7bc -> :sswitch_4
        -0x6e14464c -> :sswitch_1
        -0x660e3476 -> :sswitch_2
        -0x3d9390ad -> :sswitch_4
        -0x34a39cef -> :sswitch_3
        -0x2d9829e6 -> :sswitch_0
        0x11d81de1 -> :sswitch_2
        0x1bfb79f0 -> :sswitch_5
        0x23cb7eeb -> :sswitch_3
        0x32e07c9f -> :sswitch_5
        0x4a0bb827 -> :sswitch_0
        0x583e3353 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onScrollStateChanged(Ll/᩻ᩳ᩷;I)V
    .locals 8

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x10778fce

    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    const-string v5, "\u1a73\u1a76"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x42b1

    const v7, -0x44ed7812

    xor-int/2addr v6, v7

    const v7, 0x350a9037

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x52af

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    goto :goto_1

    .line 1053
    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u073d\u06db"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6537

    const v7, 0x2ece2540

    xor-int/2addr v6, v7

    const v7, -0x71cb4f2

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v5, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v5, :cond_b

    goto :goto_1

    .line 233
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    sget v5, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v5, :cond_d

    :goto_1
    const-string v5, "\u1a76\u06d6"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x19

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x963

    const v7, 0x3174a408    # 3.5599914E-9f

    xor-int/2addr v6, v7

    const v7, -0x52516cb4

    goto :goto_0

    .line 145
    :sswitch_3
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    return-void

    .line 1098
    :sswitch_4
    invoke-virtual {v1}, Ll/֡֡᩷;->findFirstVisibleItemPosition()I

    move-result v5

    iget-object v6, p0, Ll/ܶۢ֫;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_2

    .line 1097
    :sswitch_5
    iget-object v1, p0, Ll/ܶۢ֫;->ۤ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1098
    iget-object v1, p0, Ll/ܶۢ֫;->᩷:Ll/֡֡᩷;

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u1a77\u05a1"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2df7

    const v7, -0x4dd43889

    xor-int/2addr v6, v7

    const v7, -0x58a926cf

    goto/16 :goto_0

    :sswitch_6
    if-nez v0, :cond_2

    const-string v5, "\u06d9\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4729

    const v7, -0x3707ed61

    xor-int/2addr v6, v7

    const v7, -0x79cb60e2

    goto/16 :goto_0

    :sswitch_7
    return-void

    :sswitch_8
    xor-int/lit8 v5, v0, 0x1

    .line 1096
    iget-object v6, p0, Ll/ܶۢ֫;->᩸:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v5, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "\u06d9\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6403

    const v7, -0x7b5e39a3

    xor-int/2addr v6, v7

    const v7, 0x7517a4

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u06dc\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5fad

    const v7, 0x4ef0fb6d    # 2.0215046E9f

    xor-int/2addr v6, v7

    const v7, -0x727ed739

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x1

    goto :goto_3

    :sswitch_a
    const/4 v0, 0x0

    :goto_3
    const-string v5, "\u06db\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2023

    const v7, -0x2e8fab3b

    xor-int/2addr v6, v7

    const v7, 0x3d186cb9

    goto/16 :goto_0

    :sswitch_b
    const/4 p1, 0x1

    if-eqz p2, :cond_3

    const-string v5, "\u06e7\u1a76"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x31cb

    const v7, 0x2ac02e36

    xor-int/2addr v6, v7

    const v7, -0x718c7f90

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u1a78\u1a74"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x719b

    const v7, 0x5b7a0395

    xor-int/2addr v6, v7

    const v7, 0x60b4d2ef

    goto/16 :goto_0

    .line 961
    :sswitch_c
    sget v5, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v5, :cond_4

    goto :goto_4

    :cond_4
    const-string v5, "\u06d6\u06db"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b9

    const v7, -0x6a09eaf0

    xor-int/2addr v6, v7

    const v7, 0x4573908f

    goto/16 :goto_0

    .line 881
    :sswitch_d
    sget v5, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v5, :cond_5

    goto :goto_4

    :cond_5
    const-string v5, "\u05a1\u1a78"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2e11

    const v7, 0x632b88e9

    xor-int/2addr v6, v7

    const v7, 0x7f62f822

    goto/16 :goto_0

    .line 975
    :sswitch_e
    sget-boolean v5, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u06da\u073d"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x74d7

    const v7, 0x3416df92

    xor-int/2addr v6, v7

    const v7, 0x217a3d71

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v5, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v5, "\u06db\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x509f

    const v7, -0x40f8921b

    xor-int/2addr v6, v7

    const v7, 0x3470ad38

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-ltz v5, :cond_8

    :goto_4
    const-string v5, "\u1a74\u06e0"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4813

    const v7, 0x469bff01

    xor-int/2addr v6, v7

    const v7, -0x831e1cd

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a7b\u1a77"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v3

    mul-int/lit8 v6, v6, -0x6d

    const v7, -0x39b967b4

    xor-int/2addr v6, v7

    const v7, 0x15f9ef08

    goto/16 :goto_0

    .line 228
    :sswitch_11
    sget v5, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v5, :cond_9

    goto :goto_6

    :cond_9
    const-string v5, "\u06e0\u06e4"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x14f3

    const v7, -0xd10d724

    xor-int/2addr v6, v7

    const v7, -0x183b2835

    goto/16 :goto_0

    .line 934
    :sswitch_12
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_a

    goto :goto_6

    :cond_a
    const-string v5, "\u1a7a\u06e7"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7077

    const v7, -0xbd0223f

    xor-int/2addr v6, v7

    const v7, -0x747d99ca

    goto/16 :goto_0

    :sswitch_13
    sget v5, Ll/ۘ۟;->ۜ᩺᩺:I

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u073d\u06eb"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b63

    const v7, -0x4c2935f

    xor-int/2addr v6, v7

    const v7, 0x2579d6b4

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u0730\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1c9f

    const v7, -0xf49c363

    xor-int/2addr v6, v7

    const v7, -0x2511176a

    goto/16 :goto_0

    .line 156
    :sswitch_14
    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v5, :cond_e

    :cond_d
    :goto_6
    const-string v5, "\u06e7\u1a74"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5a2f

    const v7, 0x2ab43def

    xor-int/2addr v6, v7

    const v7, -0x1a2e8bfa

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06e2\u05ab"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x64e7

    const v7, -0x8758f85

    xor-int/2addr v6, v7

    const v7, -0x3df98489

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75d54a5a -> :sswitch_4
        -0x73084c19 -> :sswitch_11
        -0x714585be -> :sswitch_a
        -0x69fc3bf7 -> :sswitch_10
        -0x67bb691f -> :sswitch_4
        -0x66c3e158 -> :sswitch_1
        -0x5b2303a8 -> :sswitch_1
        -0x4a8de305 -> :sswitch_11
        -0x4a7166f0 -> :sswitch_7
        -0x4738fa01 -> :sswitch_5
        -0x386ad389 -> :sswitch_12
        -0x36c19a41 -> :sswitch_0
        -0x2fb1a9c9 -> :sswitch_14
        -0x2de4d4d0 -> :sswitch_b
        -0x21683194 -> :sswitch_e
        -0x1fd66ab0 -> :sswitch_8
        -0x1d3689fd -> :sswitch_c
        -0x1c19de35 -> :sswitch_d
        -0x8bc4d16 -> :sswitch_9
        0x3ebc324 -> :sswitch_8
        0xaf95710 -> :sswitch_13
        0xb4d4abd -> :sswitch_2
        0x1cc2d7bb -> :sswitch_9
        0x20b3751b -> :sswitch_e
        0x21f3fb13 -> :sswitch_10
        0x220006fc -> :sswitch_0
        0x2c7a7962 -> :sswitch_f
        0x32806993 -> :sswitch_6
        0x334d1ff2 -> :sswitch_7
        0x374617f5 -> :sswitch_12
        0x383c4d03 -> :sswitch_c
        0x38e56695 -> :sswitch_a
        0x3ec89190 -> :sswitch_f
        0x41aa161f -> :sswitch_5
        0x54bfebf0 -> :sswitch_2
        0x594d4611 -> :sswitch_b
        0x5f4b806a -> :sswitch_3
        0x64dbe2ab -> :sswitch_6
        0x6d5b24d2 -> :sswitch_14
        0x744344cc -> :sswitch_3
        0x76401192 -> :sswitch_13
        0x79281c54 -> :sswitch_d
    .end sparse-switch
.end method
