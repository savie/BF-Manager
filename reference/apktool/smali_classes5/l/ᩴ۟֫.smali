.class public final synthetic Ll/ᩴ۟֫;
.super Ljava/lang/Object;
.source "JAJI"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ۟ܰ֫:[S


# instance fields
.field public final synthetic ܰ:Ll/ܳ۟֫;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ۟֫;->۟ܰ֫:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xcbbs
        0x50c8s
        -0x6469s
        0x533fs
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ܳ۟֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۟֫;->ܰ:Ll/ܳ۟֫;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    const/4 v1, 0x0

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

    const v15, 0x4552665b

    sget v16, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v17, Ll/֫֡;->֫ۙۖ:I

    const-string v18, "\u1a75\u06e2"

    invoke-static/range {v18 .. v18}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    mul-int/lit8 v18, v18, 0x67

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, -0x13f9

    const v19, -0x6046cfd8

    xor-int v0, v0, v19

    const v19, -0x1633b380

    xor-int v18, v18, v19

    move-object v4, v3

    move-object/from16 p1, v6

    move-object v15, v14

    move/from16 v19, v18

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v18, 0x4552665b

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v7, v18, v16

    mul-int/lit16 v7, v7, -0x12fd

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    .line 262
    iget-object v3, v1, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 80
    sget v0, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v0, :cond_6

    goto/16 :goto_4

    .line 21
    :sswitch_0
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v0, :cond_4

    :goto_1
    move-object/from16 v0, p1

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_1

    .line 94
    :sswitch_2
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-lez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v0, p0

    goto/16 :goto_2

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    goto :goto_1

    .line 108
    :sswitch_4
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    return-void

    :sswitch_5
    xor-int v0, v5, v6

    const/4 v1, 0x0

    .line 265
    invoke-static {v2, v0, v1}, Ll/ۗܶ;->۫֫᩹(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 266
    invoke-static {v2}, Ll/ۗۖ;->ܽ᩵ܰ(Ljava/lang/Object;)Ll/۠ۖۧ;

    return-void

    .line 264
    :sswitch_6
    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    const v6, 0x7d425a98

    sget v0, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "\u06e0\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x27

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, 0x1a07

    const v19, -0x6639c07b

    xor-int v7, v7, v19

    const v19, 0x1afe0d20

    goto/16 :goto_5

    :sswitch_7
    const/4 v0, 0x1

    const/4 v4, 0x3

    invoke-static {v15, v0, v4, v14}, Ll/ۗ᩶;->ܳܶۢ([SIII)Ljava/lang/String;

    move-result-object v4

    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u06db\u06d8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x79

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x22d5

    const v19, -0x9618c08

    xor-int v7, v7, v19

    const v19, 0x347d0d6

    goto/16 :goto_5

    .line 263
    :sswitch_8
    iget-object v0, v1, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 264
    invoke-virtual {v0}, Ll/ܶ᩹;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v2, v0}, Ll/֨᩻;->᩵ۡܿ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v15, Ll/ᩴ۟֫;->۟ܰ֫:[S

    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x13

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, 0x3773

    const v19, 0x3374d5

    xor-int v7, v7, v19

    const v19, -0x230daf48

    goto/16 :goto_5

    .line 263
    :sswitch_9
    invoke-virtual {v3}, Ll/ܶ᩹;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v2, v0}, Ll/֨ۨ;->ۛ᩻᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v0, :cond_5

    :cond_4
    const-string v0, "\u1a79\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, -0x76e3

    const v19, -0x43429252

    xor-int v7, v7, v19

    const v19, -0x7df99cf8

    goto/16 :goto_5

    :cond_5
    const-string v0, "\u06d7\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, 0x69cd

    const v19, 0x518b1acd

    xor-int v7, v7, v19

    const v19, 0x7a945489

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u1a79\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x51

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x85f

    const v19, 0x570eee61

    xor-int v7, v7, v19

    const v19, -0x7213a92a

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v0, p0

    .line 2
    iget-object v1, v0, Ll/ᩴ۟֫;->ܰ:Ll/ܳ۟֫;

    .line 262
    iget-object v1, v1, Ll/ܳ۟֫;->ܳ:Ll/ܺ۟֫;

    invoke-static {v1}, Ll/֨ۚ;->ܿ֡֨(Ljava/lang/Object;)Ll/ۖۖۧ;

    move-result-object v2

    .line 183
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v7

    if-gtz v7, :cond_7

    :goto_2
    const-string v7, "\u1a78\u1a74"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v16

    xor-int v0, v7, v17

    mul-int/lit16 v0, v0, 0x637

    const v19, 0x539abf0

    xor-int v0, v0, v19

    const v19, 0x7dd5540a

    goto/16 :goto_7

    :cond_7
    const-string v0, "\u05a1\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, -0x578f

    const v19, 0x61ec88f7

    xor-int v7, v7, v19

    const v19, -0x620cd4f6

    goto/16 :goto_5

    :sswitch_b
    const/16 v0, 0x78ac

    const/16 v14, 0x78ac

    goto :goto_3

    :sswitch_c
    const v0, 0xcbc4

    const v14, 0xcbc4

    :goto_3
    const-string v0, "\u06da\u0733"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x5525

    const v19, -0x391f938

    xor-int v7, v7, v19

    const v19, -0xba58612

    goto/16 :goto_5

    :sswitch_d
    add-int v0, v9, v13

    mul-int v0, v0, v0

    sub-int/2addr v0, v12

    if-gtz v0, :cond_8

    const-string v0, "\u0733\u06d6"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x4f

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x6051

    const v19, -0x30abf028

    xor-int v7, v7, v19

    const v19, -0x3090cca6    # -4.01312E9f

    goto/16 :goto_5

    :cond_8
    const-string v0, "\u06e0\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x79

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, 0x1f09

    const v19, -0x1a5139bc

    xor-int v7, v7, v19

    const v19, 0x467d9929

    goto/16 :goto_5

    :sswitch_e
    add-int v0, v10, v11

    add-int v12, v0, v0

    const/16 v13, 0x48c5

    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_9

    goto/16 :goto_1

    :cond_9
    const-string v0, "\u06eb\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x5977

    const v19, 0x766222b3

    xor-int v7, v7, v19

    const v19, -0x1e2b3c8d

    goto :goto_5

    :sswitch_f
    aget-short v9, p1, v8

    mul-int v10, v9, v9

    const v11, 0x14af6799

    .line 103
    sget v0, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v0, :cond_a

    :goto_4
    const-string v0, "\u06d8\u05a8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x2d

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x43a3

    const v19, 0x42a0d46e

    xor-int v7, v7, v19

    const v19, -0x1839cff6

    goto :goto_5

    :cond_a
    const-string v0, "\u073f\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x6f

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, -0x2449

    const v19, -0x15022dc5

    xor-int v7, v7, v19

    const v19, -0x63ae2e0a

    goto :goto_5

    :sswitch_10
    const/4 v8, 0x0

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_c

    :cond_b
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x41

    xor-int v7, v0, v16

    mul-int/lit16 v7, v7, -0x1485

    const v19, 0x1c576a40

    xor-int v7, v7, v19

    const v19, 0x419d36c6

    goto :goto_5

    :cond_c
    const-string v0, "\u1a74\u06ec"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, 0x237b

    const v19, -0x34b5a5ad    # -1.3261395E7f

    xor-int v7, v7, v19

    const v19, 0x7ad44b0d

    :goto_5
    xor-int v19, v0, v19

    move v0, v7

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ᩴ۟֫;->۟ܰ֫:[S

    .line 264
    sget v7, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v7, :cond_d

    :goto_6
    const-string v7, "\u06e0\u0730"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v17

    move-object/from16 p1, v0

    xor-int v0, v7, v16

    mul-int/lit16 v0, v0, -0x1879

    const v19, -0x63e9d7e2

    xor-int v0, v0, v19

    const v19, -0x6c03f00f

    goto :goto_7

    :cond_d
    const-string v7, "\u05a8\u06e4"

    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v17, v7

    mul-int/lit8 v7, v7, -0x5b

    move-object/from16 p1, v0

    xor-int v0, v7, v16

    mul-int/lit16 v0, v0, 0x6479

    const v19, -0x2917a188

    xor-int v0, v0, v19

    const v19, 0x674a6552

    :goto_7
    xor-int v19, v7, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7657fdc4 -> :sswitch_d
        -0x7234ed1e -> :sswitch_10
        -0x71316513 -> :sswitch_11
        -0x6e11b535 -> :sswitch_10
        -0x654737fc -> :sswitch_0
        -0x5e444784 -> :sswitch_6
        -0x5cec6688 -> :sswitch_9
        -0x510ff0fc -> :sswitch_7
        -0x349ed821 -> :sswitch_3
        -0x349b13fa -> :sswitch_1
        -0x339fb324 -> :sswitch_f
        -0x3302aa5b -> :sswitch_5
        -0x31eb3d5b -> :sswitch_8
        -0x2d43733d -> :sswitch_1
        -0x2562ec73 -> :sswitch_4
        -0x1fce34c3 -> :sswitch_2
        -0x1740f18a -> :sswitch_b
        -0x495cfc2 -> :sswitch_7
        0x66af031 -> :sswitch_0
        0xa083cbf -> :sswitch_5
        0x16d68014 -> :sswitch_b
        0x2124bb00 -> :sswitch_f
        0x2fe2cb9b -> :sswitch_2
        0x33f57ada -> :sswitch_8
        0x37790c50 -> :sswitch_3
        0x3b999182 -> :sswitch_e
        0x42ed9f5e -> :sswitch_a
        0x46217d40 -> :sswitch_4
        0x4d9ee068 -> :sswitch_e
        0x522c6d50 -> :sswitch_c
        0x52553706 -> :sswitch_6
        0x55b906e2 -> :sswitch_a
        0x57630eb5 -> :sswitch_d
        0x6f1f46c7 -> :sswitch_11
        0x6fc159db -> :sswitch_9
        0x78c5d772 -> :sswitch_c
    .end sparse-switch
.end method
