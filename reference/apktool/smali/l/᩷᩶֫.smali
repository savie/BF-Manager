.class public final Ll/᩷᩶֫;
.super Ll/ۖۙܺ;
.source "517G"


# instance fields
.field public final synthetic ֫:Ll/ܽ֡֫;

.field public final synthetic ۚ:Ll/ܳ᩶֫;

.field public final synthetic ۧ:Ljava/util/concurrent/ExecutorService;

.field public volatile ۫:Z

.field public ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩻:Ll/ܿۨ֫;


# direct methods
.method public constructor <init>(Ll/ܳ᩶֫;Ll/ܽ֡֫;Ljava/util/concurrent/ExecutorService;Ll/ܿۨ֫;)V
    .locals 4

    const/4 v0, 0x0

    const v1, 0x3ad39d71

    sget v2, Ll/ۗ֨;->᩹ۜۡ:I

    sget v3, Ll/ۗ᩸;->ۧ۫ᩴ:I

    .line 45
    iput-object p1, p0, Ll/᩷᩶֫;->ۚ:Ll/ܳ᩶֫;

    iput-object p2, p0, Ll/᩷᩶֫;->֫:Ll/ܽ֡֫;

    iput-object p3, p0, Ll/᩷᩶֫;->ۧ:Ljava/util/concurrent/ExecutorService;

    iput-object p4, p0, Ll/᩷᩶֫;->᩻:Ll/ܿۨ֫;

    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    const-string p1, "\u1a74\u05ab"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xf

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x46b9

    const p3, -0x5b78c27d

    xor-int/2addr p2, p3

    const p3, -0x15e95428

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v3

    mul-int/lit16 p3, p3, 0x5689

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    sget p1, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez p1, :cond_8

    goto/16 :goto_1

    .line 21
    :sswitch_1
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget p1, Ll/ۖᩳ;->᩹ۧܳ:I

    if-lez p1, :cond_1

    goto/16 :goto_3

    .line 19
    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    goto/16 :goto_3

    .line 20
    :sswitch_3
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/᩷᩶֫;->۫:Z

    return-void

    .line 46
    :sswitch_5
    iput-object v0, p0, Ll/᩷᩶֫;->ܳ:Ljava/util/ArrayList;

    sget p1, Ll/֫֡;->֫ۙۖ:I

    if-gtz p1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string p1, "\u05a1\u1a74"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x3ce3

    const p3, -0x17e08047

    xor-int/2addr p2, p3

    const p3, -0x61849ef8

    goto :goto_0

    .line 42
    :sswitch_6
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "\u1a77\u06d7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x62b7

    const p3, 0x76df1748

    xor-int/2addr p2, p3

    const p3, -0x96ebb32

    goto :goto_0

    :cond_2
    const-string p1, "\u1a78\u06d9"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1327

    const p3, 0x6010d86c

    xor-int/2addr p2, p3

    const p3, -0x6b131190

    goto/16 :goto_0

    .line 45
    :sswitch_7
    sget p1, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz p1, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string p1, "\u06d9\u06e2"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x41d

    const p3, -0x2f0026ba

    xor-int/2addr p2, p3

    const p3, -0x1724ca6

    goto/16 :goto_0

    :sswitch_8
    sget p1, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz p1, :cond_5

    :cond_4
    :goto_1
    const-string p1, "\u06eb\u06e4"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x1b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3793

    const p3, 0x2ba7a767

    xor-int/2addr p2, p3

    const p3, -0x53ef326d

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u1a7b\u06ec"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0xf

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1671

    const p3, 0x2ca92d63

    xor-int/2addr p2, p3

    const p3, -0x38a9a83

    goto/16 :goto_0

    .line 38
    :sswitch_9
    sget-boolean p1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p1, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string p1, "\u06e0\u073a"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x2d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6bab

    const p3, -0x45c8719

    xor-int/2addr p2, p3

    const p3, 0x4f6fbdb6    # 4.0221875E9f

    goto/16 :goto_0

    .line 42
    :sswitch_a
    sget p1, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz p1, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string p1, "\u06e4\u1a7b"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x7183

    const p3, -0x48005534

    xor-int/2addr p2, p3

    const p3, 0x1caf6694

    goto/16 :goto_0

    .line 21
    :sswitch_b
    sget p1, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz p1, :cond_9

    :cond_8
    const-string p1, "\u0730\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x35

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x1715

    const p3, -0x183e0479

    xor-int/2addr p2, p3

    const p3, 0x32b1d831

    goto/16 :goto_0

    :cond_9
    const-string p1, "\u06d6\u06d9"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x6b

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x11f5

    const p3, -0x7bf0314

    xor-int/2addr p2, p3

    const p3, 0x3f086f57

    goto/16 :goto_0

    :sswitch_c
    sget p1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz p1, :cond_a

    goto :goto_3

    :cond_a
    const-string p1, "\u06dc\u0736"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x21

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7dcf

    const p3, -0x4a081ca2

    xor-int/2addr p2, p3

    const p3, -0x2741ca60

    goto/16 :goto_0

    .line 40
    :sswitch_d
    sget-boolean p1, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz p1, :cond_b

    :goto_2
    const-string p1, "\u05a1\u06d7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x73

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7d61

    const p3, -0x34ac276a    # -1.3883542E7f

    xor-int/2addr p2, p3

    const p3, 0x1fb57aa3

    goto/16 :goto_0

    :cond_b
    const-string p1, "\u1a73\u073d"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x75

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x372b

    const p3, -0x6cc9eee4

    xor-int/2addr p2, p3

    const p3, 0x399bf3b7

    goto/16 :goto_0

    .line 46
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget p1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz p1, :cond_c

    :goto_3
    const-string p1, "\u073f\u06e8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x6dc1

    const p3, 0x713d9b3a

    xor-int/2addr p2, p3

    const p3, 0x58038440

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06e4\u05a8"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x336f

    const p3, 0x62a6d76b

    xor-int/2addr p2, p3

    const p3, -0x7425b8ba

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7dec219e -> :sswitch_2
        -0x55e36b8f -> :sswitch_5
        -0x4de06bb3 -> :sswitch_3
        -0x379ec112 -> :sswitch_2
        -0x34a84ed3 -> :sswitch_e
        -0x34862260 -> :sswitch_5
        -0x2a71a56e -> :sswitch_9
        -0x211f9d73 -> :sswitch_0
        -0x18b8e28a -> :sswitch_6
        -0x94c9ef9 -> :sswitch_9
        -0xc2e75b -> :sswitch_c
        0x5c7d48d -> :sswitch_d
        0xfa1b790 -> :sswitch_1
        0x136c0e8b -> :sswitch_c
        0x14919ff7 -> :sswitch_6
        0x19317c04 -> :sswitch_a
        0x36f561ea -> :sswitch_7
        0x379872d9 -> :sswitch_a
        0x3a273ba6 -> :sswitch_b
        0x3f061d1a -> :sswitch_b
        0x43e9aa8c -> :sswitch_1
        0x4c0430a2 -> :sswitch_7
        0x52ca3ca4 -> :sswitch_3
        0x5822a961 -> :sswitch_0
        0x5dcbbf25 -> :sswitch_e
        0x5fbd1e84 -> :sswitch_8
        0x6124c1f1 -> :sswitch_8
        0x61c66b86 -> :sswitch_d
        0x6d9213a3 -> :sswitch_4
        0x74675e7f -> :sswitch_4
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/᩷᩶֫;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0xcae9125

    sget v2, Ll/ۖᩳ;->᩹ۧܳ:I

    sget v3, Ll/֫֨;->᩶ܺۡ:I

    const-string v4, "\u1a73\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x61

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x200d

    const v6, 0x69fe5915

    xor-int/2addr v5, v6

    const v6, 0x5a492a4f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4d51

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 55
    invoke-static {v0}, Ll/ۖ᩵;->᩶֨۟(Ljava/lang/Object;)V

    .line 56
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    :sswitch_0
    sget v4, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-lez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06d7\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x553f

    const v6, 0x16d40cda

    xor-int/2addr v5, v6

    const v6, -0xe4d1cf4

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    move-result v4

    if-gtz v4, :cond_7

    goto/16 :goto_2

    .line 16
    :sswitch_2
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-gez v4, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    goto/16 :goto_3

    .line 14
    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    return-void

    .line 55
    :sswitch_5
    iget-object v0, p0, Ll/ۖۙܺ;->᩷:Ll/۬֨ᩴ;

    .line 37
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u06d9\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6429

    const v6, 0x550388c7

    xor-int/2addr v5, v6

    const v6, 0x436e01af

    goto :goto_0

    .line 7
    :sswitch_6
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06d8\u073d"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2fcf

    const v6, -0x637da037

    xor-int/2addr v5, v6

    const v6, -0x309e5691    # -3.7859776E9f

    goto :goto_0

    .line 32
    :sswitch_7
    sget v4, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u073d\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x19ed

    const v6, -0x1a6f5d2b

    xor-int/2addr v5, v6

    const v6, -0x73194c6b

    goto/16 :goto_0

    .line 26
    :sswitch_8
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v4

    if-nez v4, :cond_4

    :goto_1
    const-string v4, "\u1a7a\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1001

    const v6, 0x5f7c4c90

    xor-int/2addr v5, v6

    const v6, -0x5a85c280

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a8\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4c0b

    const v6, -0x54c8efe6

    xor-int/2addr v5, v6

    const v6, 0xf00502d

    goto/16 :goto_0

    .line 50
    :sswitch_9
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v4

    if-ltz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06dc\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b77

    const v6, -0x3e21182

    xor-int/2addr v5, v6

    const v6, 0x22682d07

    goto/16 :goto_0

    .line 43
    :sswitch_a
    sget v4, Ll/᩺;->۫۬۫:I

    if-gtz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u05a1\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7097

    const v6, -0x2179fecd

    xor-int/2addr v5, v6

    const v6, -0x3915a916    # -29995.457f

    goto/16 :goto_0

    .line 5
    :sswitch_b
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    const-string v4, "\u06d8\u073a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xf77

    const v6, -0x5953c200

    xor-int/2addr v5, v6

    const v6, 0x6d8482d1

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a76\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x27

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6b15

    const v6, -0x409da141

    xor-int/2addr v5, v6

    const v6, -0x2b91c8c4

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_2

    :cond_9
    const-string v4, "\u06e7\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3793

    const v6, 0x20098a19

    xor-int/2addr v5, v6

    const v6, 0x1f754d14

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_2
    const-string v4, "\u1a75\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7eb9

    const v6, -0x7c6a5160

    xor-int/2addr v5, v6

    const v6, -0x2b073b3

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7a\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2013

    const v6, 0x823b58e

    xor-int/2addr v5, v6

    const v6, 0x1795935

    goto/16 :goto_0

    .line 27
    :sswitch_e
    sget v4, Ll/ۧ;->ۨۗܰ:I

    if-ltz v4, :cond_c

    :goto_3
    const-string v4, "\u073f\u05a1"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28f5

    const v6, -0x4032c016

    xor-int/2addr v5, v6

    const v6, 0x4d317259    # 1.8606632E8f

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06d9\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3807

    const v6, 0x58b85e56

    xor-int/2addr v5, v6

    const v6, 0x3299c3c0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fd73826 -> :sswitch_5
        -0x7a2e97f0 -> :sswitch_7
        -0x779d27cb -> :sswitch_5
        -0x5a95f189 -> :sswitch_2
        -0x4dfafd3d -> :sswitch_3
        -0x33ae1fa0 -> :sswitch_a
        -0x282ff85d -> :sswitch_e
        -0x24b06fc4 -> :sswitch_1
        -0x1ebbee25 -> :sswitch_1
        -0x15cf38f0 -> :sswitch_0
        -0x98e5703 -> :sswitch_6
        -0x4459da0 -> :sswitch_9
        -0x43c7d57 -> :sswitch_b
        -0x2faebed -> :sswitch_8
        0x1713b800 -> :sswitch_2
        0x1ee42832 -> :sswitch_9
        0x25baa171 -> :sswitch_8
        0x27aa3a88 -> :sswitch_3
        0x2e611429 -> :sswitch_4
        0x37a675a8 -> :sswitch_4
        0x382d6813 -> :sswitch_a
        0x38cfdb4a -> :sswitch_d
        0x3d79c369 -> :sswitch_7
        0x480ef96e -> :sswitch_d
        0x49b165ba -> :sswitch_e
        0x4b6fdf18 -> :sswitch_c
        0x4d3c3f5d -> :sswitch_0
        0x565297ca -> :sswitch_c
        0x65e2707e -> :sswitch_b
        0x72294d80 -> :sswitch_6
    .end sparse-switch
.end method

.method public static synthetic ۙ(Ll/᩷᩶֫;Ll/ܽ֡֫;Ljava/util/concurrent/ExecutorService;)V
    .locals 6

    const v0, 0x4711e8fe

    sget v1, Ll/֫֡;->֫ۙۖ:I

    sget v2, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v3, "\u1a73\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d9b

    const v5, 0x34904d86

    xor-int/2addr v4, v5

    const v5, -0x22628ce5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3853

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_6

    goto/16 :goto_5

    .line 7
    :sswitch_0
    sget v3, Ll/֫֡;->֫ۙۖ:I

    if-lez v3, :cond_4

    goto/16 :goto_3

    :sswitch_1
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-lez v3, :cond_c

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_3

    .line 51
    :sswitch_3
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    return-void

    .line 53
    :sswitch_4
    invoke-static {p0, p1}, Ll/֫۠;->᩶᩹᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    iget-object v3, p0, Ll/ۖۙܺ;->᩷:Ll/۬֨ᩴ;

    new-instance v4, Ll/ۙ᩶֫;

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-direct {v4, p0, p2}, Ll/ۙ᩶֫;-><init>(Ll/᩷᩶֫;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {v3, v4}, Ll/۬֨ᩴ;->ۙ(Ljava/lang/Runnable;)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 52
    :sswitch_6
    iget-boolean v3, p0, Ll/᩷᩶֫;->۫:Z

    if-eqz v3, :cond_1

    const-string v3, "\u1a79\u06da"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x11bf

    const v5, -0x3a0525cd

    xor-int/2addr v4, v5

    const v5, -0x4b0ab0a

    goto :goto_0

    :cond_1
    :goto_1
    const-string v3, "\u1a7b\u06d6"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x656f

    const v5, 0x402f6ead

    xor-int/2addr v4, v5

    const v5, -0x24983eda

    goto :goto_0

    .line 20
    :sswitch_7
    sget v3, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e8\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4531

    const v5, -0x5c4fce09

    xor-int/2addr v4, v5

    const v5, -0x537cec90

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u073a\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x191f

    const v5, 0x15109d17

    xor-int/2addr v4, v5

    const v5, -0x25651663

    goto/16 :goto_0

    .line 16
    :sswitch_9
    sget v3, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v3, :cond_5

    :cond_4
    const-string v3, "\u05a1\u1a77"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x407f

    const v5, 0xe91ba72    # 3.59248E-30f

    xor-int/2addr v4, v5

    const v5, 0x3aa782b

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a7a\u06db"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63f1

    const v5, 0x4d6df36b    # 2.4950955E8f

    xor-int/2addr v4, v5

    const v5, 0x6c7f0071

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/᩺;->۫۬۫:I

    if-gtz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06d6\u05a8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x180b

    const v5, -0x7176bfb9

    xor-int/2addr v4, v5

    const v5, 0x5997a090

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x45a5

    const v5, 0x741a6b6e

    xor-int/2addr v4, v5

    const v5, -0x474aac96

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a7a\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e83

    const v5, 0x4ecdfcb

    xor-int/2addr v4, v5

    const v5, 0x6741b0ff

    goto/16 :goto_0

    .line 49
    :sswitch_c
    sget v3, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u06ec\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x285f

    const v5, -0x501a7b44

    xor-int/2addr v4, v5

    const v5, 0x14900b86

    goto/16 :goto_0

    .line 42
    :sswitch_d
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u06d9\u1a73"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e17

    const v5, -0x711a8851

    xor-int/2addr v4, v5

    const v5, 0xd67272f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d9\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2a8d

    const v5, -0x2ea808a9

    xor-int/2addr v4, v5

    const v5, -0x56bd35d4

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_4
    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x54cd

    const v5, 0x52d30c71

    xor-int/2addr v4, v5

    const v5, 0x491f6236    # 652835.4f

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd0f

    const v5, 0x4b0eb278    # 9351800.0f

    xor-int/2addr v4, v5

    const v5, -0x48448349

    goto/16 :goto_0

    .line 27
    :sswitch_f
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u1a7b\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x35a9

    const v5, 0x27c3a7b6

    xor-int/2addr v4, v5

    const v5, -0x719f0947

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x644b

    const v5, -0x4d1352e7

    xor-int/2addr v4, v5

    const v5, 0x4a580684    # 3539361.0f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6c270908 -> :sswitch_a
        -0x6c0430ad -> :sswitch_7
        -0x6461c17b -> :sswitch_e
        -0x62578db4 -> :sswitch_f
        -0x5a512b3b -> :sswitch_c
        -0x59ecb21b -> :sswitch_4
        -0x470752f6 -> :sswitch_3
        -0x437efd75 -> :sswitch_2
        -0x3ec890d6 -> :sswitch_2
        -0x30f88e26 -> :sswitch_3
        -0x1f51465d -> :sswitch_b
        -0xe28579a -> :sswitch_9
        -0xdadba25 -> :sswitch_a
        -0xa28b47c -> :sswitch_e
        0x7d98cb -> :sswitch_0
        0x409e330 -> :sswitch_6
        0x5a8b26b -> :sswitch_6
        0xf0f1016 -> :sswitch_d
        0x10f6b92e -> :sswitch_1
        0x17b159fc -> :sswitch_4
        0x1eb6d8ed -> :sswitch_c
        0x299e9456 -> :sswitch_8
        0x2a5f5672 -> :sswitch_5
        0x30a70f66 -> :sswitch_f
        0x4149e72d -> :sswitch_d
        0x4368ea0f -> :sswitch_8
        0x448ce3da -> :sswitch_1
        0x5234bece -> :sswitch_0
        0x5795972d -> :sswitch_7
        0x5bdba5a1 -> :sswitch_9
        0x5bf20d8b -> :sswitch_5
        0x6e94e114 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final ۙ()V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x1b0f2c8f

    sget v6, Ll/ۗ᩺;->֡ۙۜ:I

    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v8, "\u06d9\u06d9"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x7f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xca5

    const v10, 0x7b4756af

    xor-int/2addr v9, v10

    const v10, 0x2c103b5a

    :goto_0
    xor-int/2addr v8, v10

    :goto_1
    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x22c5

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 35
    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v8, :cond_7

    goto/16 :goto_3

    .line 42
    :sswitch_0
    sget v8, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v8, :cond_b

    goto/16 :goto_2

    .line 48
    :sswitch_1
    sget v8, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v8, :cond_3

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v8

    if-eqz v8, :cond_8

    goto/16 :goto_2

    .line 65
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto/16 :goto_2

    .line 26
    :sswitch_4
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    return-void

    .line 82
    :sswitch_5
    new-instance v8, Ll/۫᩷᩸;

    .line 35
    sget v9, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v9, :cond_0

    goto/16 :goto_4

    .line 82
    :cond_0
    iget-object v9, p0, Ll/᩷᩶֫;->֫:Ll/ܽ֡֫;

    iget-object v10, p0, Ll/᩷᩶֫;->᩻:Ll/ܿۨ֫;

    .line 18
    sget v11, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v11, :cond_1

    goto/16 :goto_5

    .line 82
    :cond_1
    invoke-direct {v8, v9, v10, v3}, Ll/۫᩷᩸;-><init>(Ll/ܽ֡֫;Ll/ܿۨ֫;Lbin/mt/plugin/api/translation/TranslationEngine;)V

    invoke-static {v4, v8}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_7

    :sswitch_6
    invoke-static {v2}, Ll/ܳ᩶֫;->ۤ(Ll/ܳ᩶֫;)Ljava/util/ArrayList;

    move-result-object v4

    .line 7
    sget v8, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v8, :cond_2

    goto :goto_2

    :cond_2
    const-string v8, "\u06e4\u06d7"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xba3

    const v10, 0x1e41cc63

    xor-int/2addr v9, v10

    const v10, -0x45edc677

    goto :goto_0

    :sswitch_7
    sget v8, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v8, :cond_4

    :cond_3
    const-string v8, "\u06da\u06eb"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x63

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2033

    const v10, 0x71ba10af

    xor-int/2addr v9, v10

    const v10, -0x3bfb61da

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u1a74\u05ab"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0xb

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x26e5

    const v10, 0x5230800f

    xor-int/2addr v9, v10

    const v10, 0x42bdb215

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v8

    if-nez v8, :cond_5

    :goto_2
    const-string v8, "\u1a74\u06dc"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6219

    const v10, -0x707d090

    xor-int/2addr v9, v10

    const v10, 0x5ac8007

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u1a79\u05a8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x141

    const v10, -0x430813a8

    xor-int/2addr v9, v10

    const v10, -0x18d03332

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v8, "\u06e2\u073d"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5507

    const v10, 0x5f97de63

    xor-int/2addr v9, v10

    const v10, -0x675ad97b

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u073d\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4577

    const v10, -0x5ae91010

    xor-int/2addr v9, v10

    const v10, -0x40297300

    goto/16 :goto_0

    :sswitch_a
    sget v8, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v8, :cond_9

    :cond_8
    :goto_3
    const-string v8, "\u1a73\u06eb"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5d5b

    const v10, -0x18b723e8

    xor-int/2addr v9, v10

    const v10, 0x59fde82f

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06e7\u06d9"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x5d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2e13

    const v10, 0x11885e9d

    xor-int/2addr v9, v10

    const v10, -0x4ccd2cc1

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v8

    if-gtz v8, :cond_a

    :goto_4
    const-string v8, "\u06d6\u1a75"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x3f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5ba5

    const v10, -0x47de8709

    xor-int/2addr v9, v10

    const v10, 0x4653f632

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u0733\u1a74"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6a41

    const v10, 0x786d0a53

    xor-int/2addr v9, v10

    const v10, 0x16b0bf7d

    goto/16 :goto_0

    .line 81
    :sswitch_c
    invoke-static {v1}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/plugin/api/translation/TranslationEngine;

    sget v8, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v8, :cond_c

    :cond_b
    :goto_5
    const-string v8, "\u073f\u073a"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7bd

    const v10, 0x5b8b3202

    xor-int/2addr v9, v10

    const v10, -0xd052397

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u06d6\u06da"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6419

    const v10, 0x316618b4

    xor-int/2addr v9, v10

    const v10, -0x56c3a74c

    goto/16 :goto_0

    .line 84
    :sswitch_d
    invoke-static {v2}, Ll/ܳ᩶֫;->᩸(Ll/ܳ᩶֫;)V

    :sswitch_e
    return-void

    .line 81
    :sswitch_f
    invoke-static {v1}, Ll/ۘ۟;->ᩳۘ᩸(Ljava/lang/Object;)Z

    move-result v2

    iget-object v8, p0, Ll/᩷᩶֫;->ۚ:Ll/ܳ᩶֫;

    if-eqz v2, :cond_d

    const-string v2, "\u06ec\u073d"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v6

    mul-int/lit8 v2, v2, -0x6d

    xor-int v9, v2, v7

    mul-int/lit16 v9, v9, 0x2a9f

    const v10, 0xd4f9704

    xor-int/2addr v9, v10

    const v10, -0x479fb238

    goto :goto_6

    :cond_d
    const-string v2, "\u073f\u05a8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v7

    mul-int/lit8 v2, v2, 0x15

    xor-int v9, v2, v6

    mul-int/lit16 v9, v9, 0x5f45

    const v10, 0x6c286909

    xor-int/2addr v9, v10

    const v10, 0x784f603    # 2.0005745E-34f

    :goto_6
    xor-int/2addr v2, v10

    move-object v12, v8

    move v8, v2

    move-object v2, v12

    goto/16 :goto_1

    .line 79
    :sswitch_10
    invoke-virtual {v0}, Ll/۬֨ᩴ;->᩸()Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "\u06d9\u05a8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7fd5

    const v10, 0x6dd7b33a

    xor-int/2addr v9, v10

    const v10, -0x10a56b61

    goto/16 :goto_0

    .line 81
    :sswitch_11
    iget-object v1, p0, Ll/᩷᩶֫;->ܳ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/֨ᩳ;->ۛۙۙ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    const-string v8, "\u05a8\u1a75"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2667

    const v10, 0x19a55668

    xor-int/2addr v9, v10

    const v10, -0x27652c61

    goto/16 :goto_0

    .line 79
    :sswitch_12
    iget-object v0, p0, Ll/ۖۙܺ;->᩷:Ll/۬֨ᩴ;

    if-eqz v0, :cond_e

    const-string v8, "\u1a79\u1a75"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x1f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x522b

    const v10, 0x4feb631f    # 7.8982835E9f

    xor-int/2addr v9, v10

    const v10, 0x6499b44b

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a79\u06eb"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x59

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x32db

    const v10, 0x6f9b586a

    xor-int/2addr v9, v10

    const v10, -0x3337fd82

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c363a9a -> :sswitch_7
        -0x7367a7aa -> :sswitch_3
        -0x7142b5c3 -> :sswitch_10
        -0x6f408baa -> :sswitch_4
        -0x69e0f7ab -> :sswitch_1
        -0x66def6a6 -> :sswitch_12
        -0x612fbf12 -> :sswitch_2
        -0x593d1679 -> :sswitch_5
        -0x558cc4a9 -> :sswitch_d
        -0x53c8bfa7 -> :sswitch_8
        -0x4380d64b -> :sswitch_f
        -0x3aab3b8b -> :sswitch_c
        -0x24cca6bb -> :sswitch_9
        -0x1f3f966d -> :sswitch_11
        -0x1aaf86fa -> :sswitch_f
        -0x1708721b -> :sswitch_6
        -0x16805a29 -> :sswitch_a
        -0x8ef3e6f -> :sswitch_9
        -0x649994a -> :sswitch_e
        0xdb534a7 -> :sswitch_8
        0x16f1812a -> :sswitch_0
        0x21157243 -> :sswitch_12
        0x2f022b43 -> :sswitch_5
        0x3047f170 -> :sswitch_c
        0x31677577 -> :sswitch_11
        0x3c2c4cc9 -> :sswitch_b
        0x3d1be110 -> :sswitch_3
        0x4164d3f3 -> :sswitch_d
        0x4ef2701c -> :sswitch_2
        0x5370962e -> :sswitch_10
        0x56591b78 -> :sswitch_0
        0x5951b56f -> :sswitch_7
        0x67c5f298 -> :sswitch_1
        0x69125e59 -> :sswitch_6
        0x69235277 -> :sswitch_b
        0x71ca77e0 -> :sswitch_4
        0x7255753b -> :sswitch_a
        0x7a4a83c9 -> :sswitch_e
    .end sparse-switch
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x465ccd15

    sget v2, Ll/ۖ᩹;->۫ܽۗ:I

    sget v3, Ll/ۧ;->ۨۗܰ:I

    const-string v4, "\u1a73\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7939

    const v6, 0x38954191

    xor-int/2addr v5, v6

    const v6, 0x216cded2

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x78cf

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_4

    .line 13
    :sswitch_0
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_1

    .line 55
    :sswitch_1
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v4

    if-gtz v4, :cond_c

    goto :goto_1

    .line 48
    :sswitch_2
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    :goto_1
    const-string v4, "\u1a73\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x61b

    const v6, 0xa119cf2

    xor-int/2addr v5, v6

    const v6, -0x262d32d9

    goto :goto_0

    .line 6
    :sswitch_3
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    :sswitch_4
    return-void

    .line 89
    :sswitch_5
    invoke-virtual {v0}, Ll/۬֨ᩴ;->᩸()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u073a\u06eb"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2d59

    const v6, -0x610b9147

    xor-int/2addr v5, v6

    const v6, 0x4f9b1e9a

    goto :goto_0

    .line 91
    :sswitch_6
    iget-object v0, p0, Ll/᩷᩶֫;->᩻:Ll/ܿۨ֫;

    invoke-virtual {v0, p1}, Ll/ܿۨ֫;->ۙ(Ljava/lang/Throwable;)V

    return-void

    .line 89
    :sswitch_7
    iget-object v0, p0, Ll/ۖۙܺ;->᩷:Ll/۬֨ᩴ;

    if-eqz v0, :cond_0

    const-string v4, "\u06dc\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x38f3

    const v6, 0x27533932

    xor-int/2addr v5, v6

    const v6, 0x6b4fa8a6

    goto :goto_0

    :cond_0
    const-string v4, "\u06e4\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3e3d

    const v6, 0xb838c4a

    xor-int/2addr v5, v6

    const v6, 0x7f8ef9e8

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06e8\u06ec"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x205b

    const v6, 0x2e99e6a5

    xor-int/2addr v5, v6

    const v6, -0x315eb253

    goto/16 :goto_0

    .line 64
    :sswitch_9
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u073d\u0736"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x17

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d47

    const v6, -0x772efcd9

    xor-int/2addr v5, v6

    const v6, -0x5562dc01

    goto/16 :goto_0

    .line 38
    :sswitch_a
    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06e2\u06e7"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x45db

    const v6, -0x118468a9

    xor-int/2addr v5, v6

    const v6, 0x53d4e59

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_5

    :cond_4
    :goto_2
    const-string v4, "\u06e1\u1a7a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x64a3

    const v6, -0x712f64f4

    xor-int/2addr v5, v6

    const v6, -0xfc7bbf2

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u05a8\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1a45

    const v6, -0x5adfc286

    xor-int/2addr v5, v6

    const v6, 0x2d67556b

    goto/16 :goto_0

    .line 24
    :sswitch_c
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06da\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7f19

    const v6, 0x7ea24e67

    xor-int/2addr v5, v6

    const v6, -0x1922227

    goto/16 :goto_0

    .line 29
    :sswitch_d
    sget v4, Ll/֫֡;->֫ۙۖ:I

    if-gtz v4, :cond_7

    :goto_3
    const-string v4, "\u1a79\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x129b

    const v6, -0x10af1588

    xor-int/2addr v5, v6

    const v6, -0x28dccb53

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06d7\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3193

    const v6, -0x891d346

    xor-int/2addr v5, v6

    const v6, 0x275b6ff3

    goto/16 :goto_0

    .line 39
    :sswitch_e
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u0730\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3035

    const v6, 0x65f72fce

    xor-int/2addr v5, v6

    const v6, 0x7984abb3

    goto/16 :goto_0

    .line 6
    :sswitch_f
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "\u0730\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x60a9

    const v6, -0x5e7fcd90

    xor-int/2addr v5, v6

    const v6, -0x556d7ac7

    goto/16 :goto_0

    :sswitch_10
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u1a76\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2cc5

    const v6, 0x1e657d98

    xor-int/2addr v5, v6

    const v6, 0x7a23de42

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a7a\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x546d

    const v6, 0x34b665a0

    xor-int/2addr v5, v6

    const v6, -0x4a08f19

    goto/16 :goto_0

    :sswitch_11
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u1a74\u1a77"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ef

    const v6, -0x133be9a

    xor-int/2addr v5, v6

    const v6, -0xa968829

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06e0\u1a78"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3eff

    const v6, -0x23d5fe0

    xor-int/2addr v5, v6

    const v6, -0x21a97d30

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a049c25 -> :sswitch_11
        -0x78647bd5 -> :sswitch_8
        -0x67dda821 -> :sswitch_9
        -0x6705b74c -> :sswitch_8
        -0x5f4758c7 -> :sswitch_4
        -0x5209a206 -> :sswitch_c
        -0x4cd301b5 -> :sswitch_0
        -0x438fdff4 -> :sswitch_11
        -0x407a2cc1 -> :sswitch_a
        -0x3ce572e9 -> :sswitch_2
        -0x3789a431 -> :sswitch_b
        -0x325163f9 -> :sswitch_d
        -0x29576e90 -> :sswitch_7
        -0x19131c37 -> :sswitch_3
        -0x128563f8 -> :sswitch_a
        -0x9af4913 -> :sswitch_5
        -0x5876aa3 -> :sswitch_2
        0xdf8316a -> :sswitch_d
        0x1d2110e9 -> :sswitch_0
        0x1db51ac5 -> :sswitch_e
        0x378da6f9 -> :sswitch_e
        0x3ca212c9 -> :sswitch_6
        0x44ce4687 -> :sswitch_3
        0x47507d57 -> :sswitch_1
        0x4b9a64da -> :sswitch_b
        0x4c22ea61 -> :sswitch_1
        0x4cb45e1c -> :sswitch_10
        0x53be556a -> :sswitch_7
        0x5e3313b2 -> :sswitch_5
        0x60ad7959 -> :sswitch_6
        0x63b804d2 -> :sswitch_9
        0x66a8d4e0 -> :sswitch_4
        0x6951a4e2 -> :sswitch_f
        0x77a49633 -> :sswitch_10
        0x78567c42 -> :sswitch_c
        0x7d22d03f -> :sswitch_f
    .end sparse-switch
.end method

.method public final ᩴ()V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x6bf0c94a

    sget v6, Ll/֡ۢ;->۟֡᩻:I

    sget v7, Ll/ۗ֨;->᩹ۜۡ:I

    const-string v8, "\u06eb\u05a8"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x3

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2935

    const v10, 0x1a1cf7f4

    xor-int/2addr v9, v10

    const v10, -0x77a455e1

    :goto_0
    xor-int/2addr v8, v10

    move-object v10, v0

    :goto_1
    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, -0x2349

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 66
    invoke-static {v2}, Ll/֫ۢ;->᩷ۤ᩷(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v8, "\u1a73\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1e9f

    const v11, -0x65db46ba

    xor-int/2addr v9, v11

    const v11, -0x5dac9e04

    goto/16 :goto_8

    .line 24
    :sswitch_0
    sget-boolean v8, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v8, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v8, "\u1a7a\u073f"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x53

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7e25

    const v11, 0x7b754de0

    xor-int/2addr v9, v11

    const v11, -0x5de3964e

    goto/16 :goto_8

    :sswitch_1
    sget v8, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v8, :cond_c

    goto :goto_2

    :sswitch_2
    sget v8, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v8, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_2
    const-string v8, "\u1a74\u06d6"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x35

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4bd3

    const v11, -0x3f6ab36c

    xor-int/2addr v9, v11

    const v11, 0x67aaefbb

    goto/16 :goto_8

    .line 26
    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    sget v8, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v8, :cond_9

    goto/16 :goto_4

    .line 68
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_4

    .line 22
    :sswitch_5
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    return-void

    .line 72
    :sswitch_6
    invoke-virtual {v1, v4}, Ll/ܿۨ֫;->ۙ(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 68
    :sswitch_7
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 69
    invoke-virtual {v1}, Ll/ܿۨ֫;->᩷()Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    invoke-interface {v8, v9}, Lbin/mt/plugin/api/translation/TranslationEngine;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 70
    iget-object v9, p0, Ll/᩷᩶֫;->ܳ:Ljava/util/ArrayList;

    invoke-static {v9, v8}, Ll/֡ۢ;->ۗܶᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v4

    const-string v8, "\u0730\u06e8"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x3b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3a67

    const v11, -0x38f3acdc

    xor-int/2addr v9, v11

    const v11, 0x35e00dcf

    goto/16 :goto_8

    .line 66
    :sswitch_8
    invoke-static {v2}, Ll/֨ۚ;->ᩳ᩷ܺ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    const-string v8, "\u05a8\u1a7a"

    invoke-static {v8}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x329

    const v11, -0x119ab385

    xor-int/2addr v9, v11

    const v11, -0x49e83bce

    goto/16 :goto_8

    :sswitch_9
    return-void

    :cond_2
    const-string v8, "\u05a1\u0733"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x47

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7cd5

    const v11, -0x73baa847

    xor-int/2addr v9, v11

    const v11, 0x5bb3b04d

    goto/16 :goto_8

    .line 65
    :sswitch_a
    iget-object v1, p0, Ll/᩷᩶֫;->᩻:Ll/ܿۨ֫;

    invoke-virtual {v1, v10}, Ll/ܿۨ֫;->᩸(Ljava/util/ArrayList;)V

    .line 66
    invoke-static {v10}, Ll/ۘܽ;->ۘ֨᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    const-string v8, "\u06e0\u06e4"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x49

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7001

    const v11, -0x45214988

    xor-int/2addr v9, v11

    const v11, 0x6d4145b9

    goto/16 :goto_8

    .line 64
    :sswitch_b
    new-instance v10, Ljava/util/ArrayList;

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v8

    if-ltz v8, :cond_3

    goto :goto_6

    .line 24
    :cond_3
    sget v8, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v8, :cond_4

    :goto_4
    const-string v8, "\u06dc\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5561

    const v10, -0x45d91195

    xor-int/2addr v9, v10

    const v10, 0x4b3db591    # 1.2432785E7f

    goto/16 :goto_0

    .line 60
    :cond_4
    sget v8, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v8, :cond_5

    goto :goto_6

    .line 31
    :cond_5
    sget v8, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v8, :cond_6

    goto :goto_7

    :cond_6
    sget v8, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v8, :cond_7

    goto :goto_6

    :cond_7
    sget v8, Ll/֫֡;->֫ۙۖ:I

    if-gtz v8, :cond_8

    goto :goto_5

    .line 17
    :cond_8
    sget-boolean v8, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v8, :cond_a

    :cond_9
    :goto_5
    const-string v8, "\u05a8\u0736"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0xf

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1cf1

    const v10, 0x67a280c1

    xor-int/2addr v9, v10

    const v10, -0x3df2fc85

    goto/16 :goto_0

    .line 36
    :cond_a
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_6

    .line 20
    :cond_b
    sget v8, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v8, :cond_d

    :cond_c
    :goto_6
    const-string v8, "\u06d8\u06dc"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x5f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2d13

    const v10, -0x53793d6f

    xor-int/2addr v9, v10

    const v10, 0x2976d856

    goto/16 :goto_0

    .line 64
    :cond_d
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 33
    sget v8, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v8, :cond_e

    :goto_7
    const-string v8, "\u05a8\u06ec"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x6b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2ae5

    const v10, 0x70b6093c

    xor-int/2addr v9, v10

    const v10, 0x10f2618c

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a79\u0730"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x2b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4be9

    const v11, 0x1892840f

    xor-int/2addr v9, v11

    const v11, -0x2a9d2b5f

    :goto_8
    xor-int/2addr v8, v11

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7d71700c -> :sswitch_b
        -0x7c570cd1 -> :sswitch_7
        -0x780f6a8b -> :sswitch_8
        -0x75aacd13 -> :sswitch_4
        -0x4bb8401f -> :sswitch_a
        -0x4a6cdcd9 -> :sswitch_1
        -0x3feb14bc -> :sswitch_9
        -0x3e67e835 -> :sswitch_6
        -0x36e7b42a -> :sswitch_2
        -0x34a08966 -> :sswitch_2
        -0x1aa76ce2 -> :sswitch_5
        0xc105ce5 -> :sswitch_4
        0x272833c5 -> :sswitch_1
        0x2e49e32b -> :sswitch_7
        0x360f28d4 -> :sswitch_b
        0x47be72ea -> :sswitch_3
        0x47d74f42 -> :sswitch_6
        0x484cad5b -> :sswitch_8
        0x4c41a018 -> :sswitch_9
        0x5ac22226 -> :sswitch_0
        0x66013395 -> :sswitch_0
        0x79ca7aae -> :sswitch_a
        0x7b174af1 -> :sswitch_3
        0x7e829084 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ᩷()V
    .locals 7

    const v0, -0x33cbe887    # -4.7209956E7f

    sget v1, Ll/֫֨;->᩶ܺۡ:I

    sget v2, Ll/ۖۙ;->ۤۧۤ:I

    const-string v3, "\u1a75\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x582b

    const v5, -0x1f6dfd02    # -8.417001E19f

    xor-int/2addr v4, v5

    const v5, -0x261aad72

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x23df

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 50
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_2

    .line 43
    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v3

    if-gez v3, :cond_a

    goto :goto_1

    .line 46
    :sswitch_1
    invoke-static {}, Ll/֨ᩳ;->ۤ۟ܿ()Z

    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v3

    if-eqz v3, :cond_8

    :cond_0
    :goto_1
    const-string v3, "\u0730\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x26f3

    const v5, -0x4076a421

    xor-int/2addr v4, v5

    const v5, -0x75a6d0e0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    goto :goto_2

    .line 47
    :sswitch_3
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    return-void

    .line 51
    :sswitch_4
    new-instance v3, Ll/۬ܰ֫;

    .line 47
    sget v4, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v4, :cond_1

    goto :goto_3

    .line 7
    :cond_1
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_2

    goto :goto_4

    :cond_2
    sget v4, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v4, :cond_3

    goto :goto_5

    :cond_3
    sget-boolean v4, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v4, :cond_4

    :goto_2
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x40b

    const v5, 0x1565db49

    xor-int/2addr v4, v5

    const v5, -0x2fc9fc64

    goto :goto_0

    .line 17
    :cond_4
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_5

    goto :goto_3

    .line 28
    :cond_5
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_6

    goto :goto_5

    .line 15
    :cond_6
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v4

    if-gtz v4, :cond_7

    goto :goto_5

    .line 43
    :cond_7
    sget v4, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v4, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06e2\u073d"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xc35

    const v5, 0xc7d1708

    xor-int/2addr v4, v5

    const v5, 0x1b8e2fe5

    goto/16 :goto_0

    .line 51
    :cond_9
    iget-object v4, p0, Ll/᩷᩶֫;->֫:Ll/ܽ֡֫;

    .line 23
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_4
    const-string v3, "\u1a7b\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5165

    const v5, -0x25961b81

    xor-int/2addr v4, v5

    const v5, -0x16250178

    goto/16 :goto_0

    .line 51
    :cond_b
    iget-object v5, p0, Ll/᩷᩶֫;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 35
    sget v6, Ll/ۖۙ;->ۤۧۤ:I

    if-ltz v6, :cond_c

    :goto_5
    const-string v3, "\u073a\u06d9"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3ef7

    const v5, -0x1562f297

    xor-int/2addr v4, v5

    const v5, -0x554f3d22

    goto/16 :goto_0

    .line 51
    :cond_c
    invoke-direct {v3, p0, v4, v5}, Ll/۬ܰ֫;-><init>(Ll/᩷᩶֫;Ll/ܽ֡֫;Ljava/util/concurrent/ExecutorService;)V

    const-wide/16 v0, 0x320

    invoke-static {v3, v0, v1}, Ll/ۖۙ;->᩸᩵۬(Ljava/lang/Object;J)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6cb1db0a -> :sswitch_1
        -0x5c8e77c4 -> :sswitch_4
        -0x5c160aaf -> :sswitch_3
        0x22e0b1b -> :sswitch_2
        0xf517308 -> :sswitch_0
        0x19aa0435 -> :sswitch_1
        0x22c7e58b -> :sswitch_0
        0x3864adeb -> :sswitch_3
        0x550ae0dc -> :sswitch_2
        0x619ca75a -> :sswitch_4
    .end sparse-switch
.end method

.method public final ᩸()V
    .locals 1

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Ll/᩷᩶֫;->۫:Z

    .line 97
    invoke-static {p0}, Ll/᩶;->ۚ᩷ܰ(Ljava/lang/Object;)V

    return-void
.end method
