.class public final synthetic Ll/ۡۛ֫;
.super Ljava/lang/Object;
.source "42TB"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/ref/WeakReference;

.field public final synthetic ܰ:Ljava/lang/String;

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩶:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/ref/WeakReference;)V
    .locals 6

    const v0, -0x38dd16eb

    sget v1, Ll/ۗۖ;->ۙ᩶֨:I

    sget v2, Ll/ۖܰ;->۟֫ܽ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a79\u06e7"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x201b

    const v5, 0x26eaa3e4

    xor-int/2addr v4, v5

    const v5, 0x5b8591cc

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x32d3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۧ;->ۨۗܰ:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v3

    if-ltz v3, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u05a1\u0733"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x38c3

    const v5, -0x2974efe1

    xor-int/2addr v4, v5

    const v5, 0x4b6a38e5    # 1.5349989E7f

    goto :goto_0

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    :goto_2
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x639f

    const v5, 0x395d3391

    xor-int/2addr v4, v5

    const v5, 0x477d1214

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    goto/16 :goto_3

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ۡۛ֫;->ܿ:Ljava/lang/String;

    iput-object p4, p0, Ll/ۡۛ֫;->֡:Ljava/lang/ref/WeakReference;

    return-void

    .line 2
    :sswitch_6
    sget-boolean v3, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06dc\u1a76"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x146d

    const v5, -0x153c50a1

    xor-int/2addr v4, v5

    const v5, 0x3a48289

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u073d\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x441

    const v5, 0x5943b1d8

    xor-int/2addr v4, v5

    const v5, -0x2efc3e62

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e2\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f5

    const v5, 0x3408e3d0

    xor-int/2addr v4, v5

    const v5, 0x2ec3038a

    goto/16 :goto_0

    .line 3
    :sswitch_9
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u073f\u1a74"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x460f

    const v5, -0x6c9ccca

    xor-int/2addr v4, v5

    const v5, -0x43e91ee3

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06df\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5ef3

    const v5, -0x10aa177a

    xor-int/2addr v4, v5

    const v5, 0x7e370877

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u073d\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5a47

    const v5, -0x2e3742ab

    xor-int/2addr v4, v5

    const v5, 0x65555b87

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v3

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x590d

    const v5, 0x53b67229

    xor-int/2addr v4, v5

    const v5, 0x4edac7c5

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a79\u06e8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a47

    const v5, -0x4bfdf1e7

    xor-int/2addr v4, v5

    const v5, 0x6b4196b2

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u1a75\u06e1"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1b47

    const v5, 0x4b2a5319    # 1.1162393E7f

    xor-int/2addr v4, v5

    const v5, 0x5c585a17

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/۬;->᩸ۜ᩹:I

    if-eqz v3, :cond_a

    :goto_4
    const-string v3, "\u06d7\u1a78"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2aeb

    const v5, 0x1985b49b

    xor-int/2addr v4, v5

    const v5, 0xa2f40fe

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ebd

    const v5, 0x549ec56c

    xor-int/2addr v4, v5

    const v5, -0x59650bde

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۡۛ֫;->ܰ:Ljava/lang/String;

    iput p2, p0, Ll/ۡۛ֫;->᩶:I

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a7a\u05a1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2c4b

    const v5, -0x113cf7d2

    xor-int/2addr v4, v5

    const v5, 0x11dd52af

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u1a74"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6fd3

    const v5, 0x271ec71

    xor-int/2addr v4, v5

    const v5, -0x17f9c891

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x760ac2c6 -> :sswitch_c
        -0x66a1785a -> :sswitch_2
        -0x6049e763 -> :sswitch_3
        -0x5c682476 -> :sswitch_d
        -0x586ba0be -> :sswitch_c
        -0x57c1e393 -> :sswitch_6
        -0x4d7a7c38 -> :sswitch_d
        -0x463cd24f -> :sswitch_a
        -0x43cb680f -> :sswitch_0
        -0x41be9824 -> :sswitch_e
        -0x2cbfc04f -> :sswitch_9
        0x3d450c4 -> :sswitch_e
        0xdd4b2d0 -> :sswitch_5
        0xf131013 -> :sswitch_3
        0x133877d1 -> :sswitch_2
        0x143586a7 -> :sswitch_b
        0x168b0661 -> :sswitch_4
        0x2276a7ba -> :sswitch_6
        0x2a370365 -> :sswitch_1
        0x2d26ac61 -> :sswitch_a
        0x2d2b45ee -> :sswitch_7
        0x424149c3 -> :sswitch_0
        0x4526d903 -> :sswitch_8
        0x4bca8a2f -> :sswitch_5
        0x4c3f3586 -> :sswitch_7
        0x54036d7c -> :sswitch_9
        0x59b08f74 -> :sswitch_1
        0x7506cf26 -> :sswitch_8
        0x75949f44 -> :sswitch_b
        0x7db1cc80 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x5200c19e

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    const-string v5, "\u0733\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x32fd

    const v7, 0x6a17aabf

    xor-int/2addr v6, v7

    const v7, -0x684bf094

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x5875

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 0
    iget-object v0, p0, Ll/ۡۛ֫;->ܿ:Ljava/lang/String;

    .line 4
    sget v5, Ll/ۖ;->ܿۚ֡:I

    if-ltz v5, :cond_c

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v5, Ll/ۧ;->ۨۗܰ:I

    if-gez v5, :cond_4

    goto/16 :goto_1

    :sswitch_1
    sget v5, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v5, :cond_8

    goto/16 :goto_1

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v5

    if-lez v5, :cond_a

    goto/16 :goto_1

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v2, p0, Ll/ۡۛ֫;->ܰ:Ljava/lang/String;

    iget v3, p0, Ll/ۡۛ֫;->᩶:I

    invoke-static {v2, v3, v0, v1}, Ll/۬ۛ֫;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/ref/WeakReference;)V

    return-void

    :sswitch_6
    iget-object v1, p0, Ll/ۡۛ֫;->֡:Ljava/lang/ref/WeakReference;

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u0730\u06d7"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5d3

    const v7, -0x282e21da

    xor-int/2addr v6, v7

    const v7, 0x60d7652

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    move-result v5

    if-eqz v5, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v5, "\u073f\u06e1"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xa27

    const v7, -0x73872cac

    xor-int/2addr v6, v7

    const v7, 0x5da957d

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    const-string v5, "\u06e2\u06d6"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x67

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1831

    const v7, 0x168c16c5

    xor-int/2addr v6, v7

    const v7, -0x650440b2

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v5, :cond_3

    goto :goto_1

    :cond_3
    const-string v5, "\u06d9\u06e8"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x26b3

    const v7, -0x68da72de

    xor-int/2addr v6, v7

    const v7, 0x774c54d

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    const-string v5, "\u05ab\u06d9"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5b5f

    const v7, 0x464904d8

    xor-int/2addr v6, v7

    const v7, 0x44e0106a

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u1a75\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7723

    const v7, 0x4d9b06e2    # 3.2511494E8f

    xor-int/2addr v6, v7

    const v7, 0x615de3ba

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v5, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v5, :cond_6

    :goto_1
    const-string v5, "\u06e0\u073a"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x64cf

    const v7, -0x771867c2

    xor-int/2addr v6, v7

    const v7, -0x5115862e

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u0730\u06da"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3a23

    const v7, 0x36b87144

    xor-int/2addr v6, v7

    const v7, 0xfdea3b1

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_2

    :cond_7
    const-string v5, "\u06d7\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x577

    const v7, 0x7766ea68

    xor-int/2addr v6, v7

    const v7, 0x15d38b3f

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_9

    :cond_8
    const-string v5, "\u1a7a\u1a7b"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2b1d

    const v7, 0x3ba20ba9

    xor-int/2addr v6, v7

    const v7, 0x46784121

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u0736\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5505

    const v7, -0x515226d4

    xor-int/2addr v6, v7

    const v7, 0x23f9d99

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    const-string v5, "\u1a7b\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3c71

    const v7, 0x134f4bee

    xor-int/2addr v6, v7

    const v7, -0x65e44885

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06e0\u0730"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3f1b

    const v7, 0x283f0b0c

    xor-int/2addr v6, v7

    const v7, -0x14979c15

    goto/16 :goto_0

    :goto_2
    const-string v5, "\u073a\u06e0"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2395

    const v7, 0x1942515c

    xor-int/2addr v6, v7

    const v7, -0x22478044

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u073f\u06df"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2eb7

    const v7, 0x40362d95

    xor-int/2addr v6, v7

    const v7, 0x23febe7c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6922cc99 -> :sswitch_c
        -0x674f20e8 -> :sswitch_8
        -0x57552566 -> :sswitch_c
        -0x51460dab -> :sswitch_0
        -0x3650c32e -> :sswitch_a
        -0x29c722d0 -> :sswitch_6
        -0x24c1c511 -> :sswitch_7
        -0x13d07045 -> :sswitch_4
        -0x7b553c2 -> :sswitch_3
        -0x6e4d9b1 -> :sswitch_0
        0x1d0721e2 -> :sswitch_d
        0x20920405 -> :sswitch_2
        0x22ae2ce0 -> :sswitch_5
        0x26b281b9 -> :sswitch_1
        0x334d9171 -> :sswitch_4
        0x350001ee -> :sswitch_7
        0x3a007bc5 -> :sswitch_5
        0x3b675f60 -> :sswitch_3
        0x3f657b19 -> :sswitch_e
        0x3fdd3aa2 -> :sswitch_d
        0x45fd67ab -> :sswitch_9
        0x4e955692 -> :sswitch_b
        0x610261b4 -> :sswitch_a
        0x6526393f -> :sswitch_8
        0x65a28ae7 -> :sswitch_2
        0x678855a2 -> :sswitch_6
        0x685a6f74 -> :sswitch_e
        0x6fdb381b -> :sswitch_1
        0x7572c62d -> :sswitch_9
        0x7781421c -> :sswitch_b
    .end sparse-switch
.end method
