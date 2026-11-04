.class public abstract Ll/۬۬᩻;
.super Ljava/lang/Object;
.source "P1ZL"


# static fields
.field public static volatile ۤ:Z = true

.field private static final ᩵ۙۡ:[S

.field public static volatile ᩸:J


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x70

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬۬᩻;->᩵ۙۡ:[S

    return-void

    :array_0
    .array-data 2
        0x19fs
        0x34ads
        0x4f0s
        -0x72dbs
        -0x7300s
        -0x72ebs
        -0x72fcs
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x70e409b

    sget v4, Ll/ۗ᩺;->֡ۙۜ:I

    sget v5, Ll/ۖۗ;->᩻ܳܶ:I

    sget-object v6, Ll/۬۬᩻;->᩵ۙۡ:[S

    const/4 v7, 0x0

    aget-short v6, v6, v7

    mul-int v7, v6, v6

    const v8, 0x33e290

    add-int/2addr v7, v8

    mul-int/lit16 v6, v6, 0xe68

    sub-int/2addr v7, v6

    if-ltz v7, :cond_0

    const/16 v6, 0x3482

    goto :goto_0

    :cond_0
    const/16 v6, 0x3f6e

    .line 50
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v7, "\u0733\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x23b3

    const v9, 0x3f5a4d40

    xor-int/2addr v8, v9

    const v9, 0xdec169b

    :goto_1
    xor-int/2addr v7, v9

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x1aa1

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v8

    xor-int/2addr v3, v7

    sparse-switch v3, :sswitch_data_0

    .line 20
    sget v7, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v7, :cond_a

    goto/16 :goto_6

    .line 52
    :sswitch_0
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget v7, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v7, :cond_d

    goto/16 :goto_5

    .line 51
    :sswitch_1
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_3

    .line 47
    :sswitch_2
    sget v7, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v7, :cond_8

    goto/16 :goto_3

    .line 31
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto/16 :goto_3

    .line 5
    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 53
    :sswitch_5
    iput-object p1, p0, Ll/۬۬᩻;->ۙ:Ljava/lang/String;

    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Ll/۬۬᩻;->᩷:Z

    return-void

    .line 52
    :sswitch_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :sswitch_7
    invoke-static {v0, v1, v2, v6}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v7

    .line 51
    invoke-static {p1, v7}, Ll/ۖᩳ;->ܽ᩸ᩴ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "\u06da\u05ab"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x51

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x5659

    const v9, 0x2538266b

    xor-int/2addr v8, v9

    const v9, -0x7cf72489

    goto :goto_1

    :cond_1
    const-string v7, "\u1a79\u1a7a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x663d

    const v9, -0x1fb87412

    xor-int/2addr v8, v9

    const v9, -0x1d828996

    goto :goto_1

    :sswitch_8
    const/4 v2, 0x1

    .line 49
    sget v7, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v7, :cond_2

    goto :goto_2

    :cond_2
    const-string v7, "\u06d6\u1a76"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x77

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x1237

    const v9, 0x2582c1a

    xor-int/2addr v8, v9

    const v9, -0x1a683f3c

    goto/16 :goto_1

    .line 26
    :sswitch_9
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v7

    if-nez v7, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v7, "\u073a\u1a73"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3abd

    const v9, -0x1520152a

    xor-int/2addr v8, v9

    const v9, -0x491b38a8

    goto/16 :goto_1

    .line 9
    :sswitch_a
    sget v7, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u06d7\u1a77"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x34cf

    const v9, -0x621997e6

    xor-int/2addr v8, v9

    const v9, 0x1849baa2

    goto/16 :goto_1

    .line 38
    :sswitch_b
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v7

    if-nez v7, :cond_5

    :goto_2
    const-string v7, "\u06d8\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0xe9f

    const v9, 0xf0990a3

    xor-int/2addr v8, v9

    const v9, 0x3e8d0cc7

    goto/16 :goto_1

    :cond_5
    const-string v7, "\u05a8\u073f"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v4

    mul-int/lit8 v7, v7, -0x1f

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2eaf

    const v9, 0x2d5357e1

    xor-int/2addr v8, v9

    const v9, -0x43004a93

    goto/16 :goto_1

    :sswitch_c
    sget v7, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v7, :cond_6

    goto :goto_3

    :cond_6
    const-string v7, "\u06e1\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x4dcd

    const v9, 0xe98cc36

    xor-int/2addr v8, v9

    const v9, 0x4ae17491    # 7387720.5f

    goto/16 :goto_1

    :sswitch_d
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v7

    if-gtz v7, :cond_7

    :goto_3
    const-string v7, "\u1a77\u06e4"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x1301

    const v9, -0xbd1acaf

    xor-int/2addr v8, v9

    const v9, -0x3abb7792

    goto/16 :goto_1

    :cond_7
    const-string v7, "\u0736\u1a75"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v4, v7

    mul-int/lit8 v7, v7, -0x75

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5a1d

    const v9, -0x6eeedc81

    xor-int/2addr v8, v9

    const v9, 0x7f2360c1

    goto/16 :goto_1

    :sswitch_e
    sget v7, Ll/֫۠;->ۢᩴ᩺:I

    if-gtz v7, :cond_9

    :cond_8
    :goto_4
    const-string v7, "\u1a7a\u073a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    mul-int/lit8 v7, v7, 0x63

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7417

    const v9, 0x2819379c

    xor-int/2addr v8, v9

    const v9, -0x4a381bce

    goto/16 :goto_1

    :cond_9
    const-string v7, "\u1a78\u0736"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x218b

    const v9, -0x2c6b52f9

    xor-int/2addr v8, v9

    const v9, -0x6dba61e4

    goto/16 :goto_1

    :cond_a
    const-string v7, "\u06d7\u1a7b"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x12ed

    const v9, 0x7358c32c

    xor-int/2addr v8, v9

    const v9, -0x701302c0

    goto/16 :goto_1

    .line 7
    :sswitch_f
    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v7, :cond_c

    :cond_b
    :goto_5
    const-string v7, "\u1a73\u1a77"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x1509

    const v9, -0x22086e0b

    xor-int/2addr v8, v9

    const v9, -0x1c584c37

    goto/16 :goto_1

    :cond_c
    const-string v7, "\u06da\u1a7a"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x4f

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x7e33

    const v9, 0x2c0ed782

    xor-int/2addr v8, v9

    const v9, 0x443ac32d

    goto/16 :goto_1

    .line 50
    :sswitch_10
    sget-object v0, Ll/۬۬᩻;->᩵ۙۡ:[S

    const/4 v1, 0x1

    .line 45
    sget-boolean v7, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v7, :cond_e

    :cond_d
    :goto_6
    const-string v7, "\u0736\u1a7a"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4eed

    const v9, -0x7e3babe7

    xor-int/2addr v8, v9

    const v9, 0x6a4e69f2

    goto/16 :goto_1

    :cond_e
    const-string v7, "\u06df\u06e2"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3119

    const v9, 0x42a97425

    xor-int/2addr v8, v9

    const v9, -0x32e86e00

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fd3439a -> :sswitch_10
        -0x7f5bb5f5 -> :sswitch_c
        -0x77952a1b -> :sswitch_2
        -0x6885962c -> :sswitch_2
        -0x6703c314 -> :sswitch_10
        -0x65bdac88 -> :sswitch_4
        -0x5f1f59c1 -> :sswitch_c
        -0x4e66d8a6 -> :sswitch_4
        -0x498dede5 -> :sswitch_7
        -0x3f28148a -> :sswitch_d
        -0x3043f1ea -> :sswitch_b
        -0x4cd7843 -> :sswitch_e
        -0xa1a2b1 -> :sswitch_1
        0x7566b1b -> :sswitch_d
        0x137139b9 -> :sswitch_3
        0x1388429b -> :sswitch_3
        0x13bca081 -> :sswitch_6
        0x1d63ee65 -> :sswitch_e
        0x23f4f398 -> :sswitch_8
        0x379a207d -> :sswitch_0
        0x3e3f0f5e -> :sswitch_b
        0x4a537621 -> :sswitch_0
        0x4cdd8bdb -> :sswitch_8
        0x4e1f6e3d -> :sswitch_a
        0x4e827beb -> :sswitch_7
        0x5807875a -> :sswitch_f
        0x63b11781 -> :sswitch_9
        0x69d361dd -> :sswitch_5
        0x6a62bd25 -> :sswitch_a
        0x6c97c05b -> :sswitch_9
        0x76b343ea -> :sswitch_f
        0x776ef7f2 -> :sswitch_6
        0x792f219f -> :sswitch_5
        0x7fdc8422 -> :sswitch_1
    .end sparse-switch
.end method

.method public static ۙ()J
    .locals 17

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const v11, -0x64599579

    sget v12, Ll/֡ܳ;->֨ᩳۢ:I

    sget v13, Ll/֫ۢ;->ۚ᩻᩵:I

    const-string v14, "\u06db\u1a79"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2bfd

    const v16, 0x3ddd27b7

    xor-int v15, v15, v16

    const v16, 0x545d8658

    :goto_0
    xor-int v14, v14, v16

    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x5465

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 107
    invoke-static {}, Ll/ۖᩳ;->ܶܰ۫()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    .line 109
    sget-boolean v14, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v14, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget-boolean v14, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v14, :cond_4

    goto/16 :goto_2

    :sswitch_1
    sget v14, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v14, :cond_b

    goto/16 :goto_4

    .line 110
    :sswitch_2
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v14, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v14, :cond_9

    goto/16 :goto_2

    .line 107
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    int-to-long v0, v10

    add-long/2addr v8, v0

    return-wide v8

    :sswitch_6
    const/16 v10, -0x708

    .line 110
    sget v14, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v14, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v14, "\u06e7\u06e1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x4ea7

    const v16, 0x4767f469

    xor-int v15, v15, v16

    const v16, 0x35630fc2

    goto :goto_0

    :sswitch_7
    const-wide/16 v8, 0x1e

    add-long/2addr v8, v6

    sget v14, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v14, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v14, "\u1a77\u073a"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x46a1

    const v16, -0x3ba17086

    xor-int v15, v15, v16

    const v16, 0x1b378bfb

    goto :goto_0

    .line 107
    :sswitch_8
    sget-wide v6, Ll/۬۬᩻;->᩸:J

    add-long/2addr v6, v4

    sget v14, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v14, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v14, "\u06dc\u0733"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x67

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x2473

    const v16, 0x44b92c98

    xor-int v15, v15, v16

    const v16, -0x1f531853

    goto/16 :goto_0

    :sswitch_9
    div-long v4, v0, v2

    sget v14, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v14, :cond_3

    goto :goto_1

    :cond_3
    const-string v14, "\u06e1\u05a8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x51

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3f63

    const v16, 0xbb3553d

    xor-int v15, v15, v16

    const v16, -0x74018d2e    # -9.8010004E-32f

    goto/16 :goto_0

    .line 110
    :sswitch_a
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v14

    if-ltz v14, :cond_5

    :cond_4
    :goto_1
    const-string v14, "\u073d\u1a77"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x2d

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7595

    const v16, 0x3b0c547b

    xor-int v15, v15, v16

    const v16, -0x2347533a

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u06e4\u05a1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, 0x4b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0xc43

    const v16, 0x44b79188

    xor-int v15, v15, v16

    const v16, -0x41d7676a

    goto/16 :goto_0

    .line 111
    :sswitch_b
    sget v14, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v14, :cond_6

    :goto_2
    const-string v14, "\u06da\u0730"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0xb4f

    const v16, 0x7ebe3873

    xor-int v15, v15, v16

    const v16, -0xcfa9a61

    goto/16 :goto_0

    :cond_6
    const-string v14, "\u06e1\u06db"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x210b

    const v16, -0x1055ba03

    xor-int v15, v15, v16

    const v16, 0x4a261a56    # 2721429.5f

    goto/16 :goto_0

    :sswitch_c
    sget v14, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v14, :cond_7

    :goto_3
    const-string v14, "\u05a1\u06d8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3a11

    const v16, -0x292da2a8

    xor-int v15, v15, v16

    const v16, 0x51617825

    goto/16 :goto_0

    :cond_7
    const-string v14, "\u1a73\u06ec"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x11

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1de5

    const v16, -0xc9ca1cf

    xor-int v15, v15, v16

    const v16, -0x5905d34e

    goto/16 :goto_0

    .line 108
    :sswitch_d
    sget v14, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v14, :cond_8

    goto :goto_4

    :cond_8
    const-string v14, "\u06d7\u05a8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x5f

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0xf2b

    const v16, -0x1330295b

    xor-int v15, v15, v16

    const v16, -0x2710993a

    goto/16 :goto_0

    .line 109
    :sswitch_e
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v14

    if-gtz v14, :cond_a

    :cond_9
    :goto_4
    const-string v14, "\u05ab\u06e0"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x77

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x2609

    const v16, 0x60240454

    xor-int v15, v15, v16

    const v16, -0x3eaf3885

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u1a76\u06e7"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1a57

    const v16, -0x5761fb80

    xor-int v15, v15, v16

    const v16, 0x1501995f

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string v14, "\u0736\u1a78"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x359d

    const v16, -0x34cbd4e4

    xor-int v15, v15, v16

    const v16, 0x76310c13

    goto/16 :goto_0

    :cond_c
    const-string v14, "\u1a7a\u06e1"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x25

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x73dd

    const v16, 0x4eb18a2e

    xor-int v15, v15, v16

    const v16, 0x76c6c76

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x71e50f1c -> :sswitch_7
        -0x69f017d2 -> :sswitch_9
        -0x681f7212 -> :sswitch_4
        -0x67be5a2e -> :sswitch_8
        -0x64ba89ed -> :sswitch_e
        -0x61ddd1aa -> :sswitch_7
        -0x582a1d4b -> :sswitch_5
        -0x40b834bc -> :sswitch_b
        -0x2638971a -> :sswitch_6
        -0x22a551a9 -> :sswitch_8
        -0x18caee06 -> :sswitch_4
        0x470742f -> :sswitch_1
        0x9c2883c -> :sswitch_2
        0xc45f740 -> :sswitch_6
        0x23d97324 -> :sswitch_3
        0x2403eb9e -> :sswitch_3
        0x28b4fc9d -> :sswitch_b
        0x314ef71a -> :sswitch_9
        0x3584fe95 -> :sswitch_0
        0x5186e0ff -> :sswitch_5
        0x54ee38fb -> :sswitch_e
        0x564f925e -> :sswitch_c
        0x5ac21d7b -> :sswitch_c
        0x5d578154 -> :sswitch_a
        0x60a6ab8f -> :sswitch_1
        0x6140b109 -> :sswitch_2
        0x6c2afd80 -> :sswitch_a
        0x71e79189 -> :sswitch_d
        0x7c69b015 -> :sswitch_0
        0x7ffe9e0b -> :sswitch_d
    .end sparse-switch
.end method

.method public static native ۙ(Ll/ۡܳۨ;)J
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Ll/۬۬᩻;
    .locals 1

    .line 29
    new-instance v0, Ll/ۜ۬᩻;

    invoke-direct {v0, p0, p1}, Ll/ۜ۬᩻;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Ll/۬۬᩻;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public abstract ۙ(Ljava/lang/String;)Ljava/lang/String;
.end method
