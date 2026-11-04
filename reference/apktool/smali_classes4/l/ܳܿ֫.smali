.class public final synthetic Ll/ܳܿ֫;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۙ᩶ۤ:[S


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܳܿ֫;->ۙ᩶ۤ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x14e2s
        0x45aes
        0x534fs
        0x5745s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܳܿ֫;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 25

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, 0x306760b7

    sget v18, Ll/ۖ֡;->ۚۛᩳ:I

    sget v19, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v20, "\u06e7\u1a76"

    invoke-static/range {v20 .. v20}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v18

    xor-int v0, v20, v19

    mul-int/lit16 v0, v0, -0x1b69

    const v1, 0x2a144a99

    xor-int/2addr v0, v1

    const v1, -0x7854f40a

    xor-int v1, v20, v1

    move-object/from16 v16, v6

    const/4 v6, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    :goto_0
    xor-int v7, v17, v19

    mul-int/lit16 v7, v7, -0x3ad1

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v17, v1, v0

    sparse-switch v17, :sswitch_data_0

    .line 274
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    sget v0, Ll/ۖۗ;->᩻ܳܶ:I

    if-lez v0, :cond_0

    goto/16 :goto_3

    .line 172
    :sswitch_0
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v0

    if-ltz v0, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v1, p0

    goto/16 :goto_8

    :cond_1
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, 0xb

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0xf8d

    const v7, -0x7e18b2f2

    xor-int/2addr v1, v7

    const v7, -0x507cc8f2

    goto/16 :goto_4

    .line 108
    :sswitch_1
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-lez v0, :cond_2

    :goto_2
    move-object/from16 v1, p0

    goto/16 :goto_9

    .line 188
    :sswitch_2
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    goto :goto_2

    .line 349
    :sswitch_3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    return-void

    .line 359
    :sswitch_4
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 362
    :sswitch_5
    invoke-static {}, Ll/ۡۧᩴ;->ᩴ()Ll/ۧ᩻ᩴ;

    .line 364
    invoke-static {}, Ll/ۡ۫ܺ;->᩷()V

    .line 366
    invoke-static {}, Ll/᩻۫᩸;->ᩴ()Z

    return-void

    .line 357
    :sswitch_6
    :try_start_0
    invoke-static/range {v21 .. v22}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v0, "\u073d\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x33

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x1843

    const v7, 0x38508fd6

    xor-int/2addr v1, v7

    const v7, -0x6482ca87

    goto/16 :goto_4

    :catch_0
    move-exception v0

    const-string v1, "\u0733\u1a79"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, 0x2373

    const v7, 0xd364138

    xor-int/2addr v2, v7

    const v7, -0xd52f6e4

    xor-int/2addr v1, v7

    move/from16 v24, v2

    move-object v2, v0

    goto/16 :goto_5

    :sswitch_7
    xor-int v0, v4, v5

    .line 345
    invoke-static {v0}, Ll/ۗ᩺;->ۚۨܳ(I)V

    return-void

    .line 2
    :sswitch_8
    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7ea40d6a

    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v0, :cond_3

    :cond_2
    :goto_3
    const-string v0, "\u1a76\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x4b

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x32bb

    const v7, -0x1e808b88

    xor-int/2addr v1, v7

    const v7, 0x24f3fc7f

    goto :goto_4

    :cond_3
    const-string v0, "\u06d8\u1a79"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x73

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4a81

    const v7, 0x5a9e6d24

    xor-int/2addr v1, v7

    const v7, 0x4262dca1

    goto :goto_4

    :sswitch_9
    invoke-static {v14, v15, v6, v13}, Ll/֫ܺ;->᩸ܰۨ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v0, "\u1a78\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x43

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x1273

    const v7, 0x36fac65

    xor-int/2addr v1, v7

    const v7, 0x74ddd1d9

    goto :goto_4

    :sswitch_a
    const/4 v6, 0x3

    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u0733\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x58ef

    const v7, 0x7842ad3a

    xor-int/2addr v1, v7

    const v7, 0x1a261c5d

    goto :goto_4

    :sswitch_b
    sget-object v14, Ll/ܳܿ֫;->ۙ᩶ۤ:[S

    const/4 v15, 0x1

    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_6

    move-object/from16 v1, p0

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06e4\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x3563

    const v7, -0x14fc8399

    xor-int/2addr v1, v7

    const v7, 0x41e90a78

    :goto_4
    xor-int/2addr v0, v7

    move/from16 v24, v1

    move v1, v0

    :goto_5
    move/from16 v0, v24

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v0, Ll/᩹۬᩸;->ᩳ:I

    return-void

    :sswitch_d
    sget-object v0, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-wide/16 v21, 0xbb8

    const-string v0, "\u06e0\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x7901

    const v7, 0x389f6a55

    xor-int/2addr v1, v7

    const v7, -0x59b30c1d

    goto :goto_4

    :sswitch_e
    move-object/from16 v1, p0

    .line 2
    iget v0, v1, Ll/ܳܿ֫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "\u06dc\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x27

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, 0x63b7

    const v23, -0x641f4199

    xor-int v7, v7, v23

    const v23, 0x5e60578f

    goto/16 :goto_a

    :pswitch_0
    const-string v0, "\u1a7b\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x453b

    const v23, -0x7ea7c80c

    xor-int v7, v7, v23

    const v23, 0x18f909dd

    goto/16 :goto_a

    :pswitch_1
    const-string v0, "\u06db\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x19

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x7ced

    const v23, 0x17d26a8b

    xor-int v7, v7, v23

    const v23, -0x72b63b23

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v1, p0

    const v0, 0xa025

    const v13, 0xa025

    goto :goto_6

    :sswitch_10
    move-object/from16 v1, p0

    const/16 v0, 0x3492

    const/16 v13, 0x3492

    :goto_6
    const-string v0, "\u05ab\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x55

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, 0x7be3

    const v23, -0x66aa59c0

    xor-int v7, v7, v23

    const v23, 0x3aed4362

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v1, p0

    add-int/lit8 v0, v12, 0x1

    sub-int v0, v10, v0

    if-gez v0, :cond_7

    const-string v0, "\u1a78\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, -0x7a71

    const v23, 0x6e2adf3e

    xor-int v7, v7, v23

    const v23, 0x4a022e9d    # 2132903.2f

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u05a1\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x6f

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x33fb

    const v23, 0x45f76869

    xor-int v7, v7, v23

    const v23, -0x1eef1112

    goto/16 :goto_a

    :sswitch_12
    move-object/from16 v1, p0

    mul-int v12, v8, v11

    sget v0, Ll/ۖ;->ܿۚ֡:I

    if-ltz v0, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v0, "\u1a7a\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, -0x2c8f

    const v23, -0x3807dbb

    xor-int v7, v7, v23

    const v23, 0x2febdc2e

    goto/16 :goto_a

    :sswitch_13
    move-object/from16 v1, p0

    mul-int v10, v9, v9

    const/4 v11, 0x2

    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_9

    goto :goto_7

    :cond_9
    const-string v0, "\u073f\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x37

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, -0x2479

    const v23, 0x709b0129

    xor-int v7, v7, v23

    const v23, -0x1c33d01a

    goto/16 :goto_a

    :sswitch_14
    move-object/from16 v1, p0

    add-int/lit8 v9, v8, 0x1

    .line 28
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_a

    goto :goto_7

    :cond_a
    const-string v0, "\u06d7\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x11

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, -0x6b05

    const v23, 0x59cef202

    xor-int v7, v7, v23

    const v23, -0x3071bb4d

    goto/16 :goto_a

    :sswitch_15
    move-object/from16 v1, p0

    aget-short v8, v16, v20

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_b

    :goto_7
    const-string v0, "\u0736\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, -0x32e3

    const v23, -0x4fa11300    # -8.1099927E-10f

    xor-int v7, v7, v23

    const v23, -0x875276f

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u0736\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x54a5

    const v23, 0xaa0eda6

    xor-int v7, v7, v23

    const v23, -0x413fa20b

    goto :goto_a

    :sswitch_16
    move-object/from16 v1, p0

    const/16 v20, 0x0

    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v0

    if-eqz v0, :cond_c

    :goto_8
    const-string v0, "\u0730\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x5e3f

    const v23, 0x6545a447

    xor-int v7, v7, v23

    const v23, -0x673501e1

    goto :goto_a

    :cond_c
    const-string v0, "\u1a77\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, -0x5a8b

    const v23, -0x4e563add

    xor-int v7, v7, v23

    const v23, 0x4ca258e5    # 8.511671E7f

    goto :goto_a

    :sswitch_17
    move-object/from16 v1, p0

    sget-object v16, Ll/ܳܿ֫;->ۙ᩶ۤ:[S

    .line 339
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_d

    :goto_9
    const-string v0, "\u06e0\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, 0x6a11

    const v23, 0x41273981

    xor-int v7, v7, v23

    const v23, 0x28215b5a

    goto :goto_a

    :cond_d
    const-string v0, "\u06d6\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x1b

    xor-int v7, v0, v19

    mul-int/lit16 v7, v7, -0x37c5

    const v23, 0x32cb63e6

    xor-int v7, v7, v23

    const v23, -0x39925d3e

    :goto_a
    xor-int v0, v0, v23

    move v1, v0

    move v0, v7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c89590c -> :sswitch_b
        -0x74f94572 -> :sswitch_c
        -0x6b27df65 -> :sswitch_d
        -0x6a27fa32 -> :sswitch_0
        -0x6a1a3b45 -> :sswitch_1
        -0x69929638 -> :sswitch_e
        -0x65b951af -> :sswitch_f
        -0x643fcb0e -> :sswitch_8
        -0x60910dc8 -> :sswitch_e
        -0x599702b2 -> :sswitch_7
        -0x4c24f822 -> :sswitch_12
        -0x46bf2490 -> :sswitch_4
        -0x3b639fff -> :sswitch_11
        -0x3a46e70a -> :sswitch_a
        -0x2743bc28 -> :sswitch_7
        -0x1a06233c -> :sswitch_17
        -0x188888ec -> :sswitch_d
        -0x16138ef9 -> :sswitch_2
        -0x14dac9b3 -> :sswitch_1
        -0x125efb8a -> :sswitch_6
        -0xd52f356 -> :sswitch_5
        -0xad26f7e -> :sswitch_14
        -0x65036e5 -> :sswitch_6
        0xa27285 -> :sswitch_2
        0xa04fd36 -> :sswitch_a
        0xd04ac5d -> :sswitch_9
        0xd347072 -> :sswitch_10
        0x1daa8b20 -> :sswitch_10
        0x1e0ac836 -> :sswitch_14
        0x26454773 -> :sswitch_13
        0x2853473b -> :sswitch_f
        0x29f3d847 -> :sswitch_15
        0x3185ef38 -> :sswitch_8
        0x3fa4ee41 -> :sswitch_3
        0x40164565 -> :sswitch_15
        0x4286a834 -> :sswitch_16
        0x447183b4 -> :sswitch_12
        0x480c9d2d -> :sswitch_13
        0x4a73a7fd -> :sswitch_3
        0x4b3dd49e -> :sswitch_11
        0x4bb6424b -> :sswitch_4
        0x531719d1 -> :sswitch_c
        0x5919d72f -> :sswitch_0
        0x5b3ae8ce -> :sswitch_b
        0x655397f7 -> :sswitch_5
        0x6752e3d1 -> :sswitch_16
        0x6f7e8015 -> :sswitch_17
        0x7874dd18 -> :sswitch_9
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
