.class public final synthetic Ll/֫ۡۤ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# static fields
.field private static final ۛ۫ۨ:[S


# instance fields
.field public final synthetic ܰ:Landroid/widget/CheckBox;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֫ۡۤ;->ۛ۫ۨ:[S

    return-void

    :array_0
    .array-data 2
        0x684s
        -0x498fs
        -0x498as
        -0x498es
        -0x4983s
        -0x4985s
        -0x4994s
        -0x49b9s
        -0x498cs
        -0x4989s
        -0x4981s
        -0x49b9s
        -0x4982s
        -0x4989s
        -0x4996s
        -0x498bs
        -0x4987s
        -0x4994s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/CheckBox;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۡۤ;->ܰ:Landroid/widget/CheckBox;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 18

    const/4 v0, 0x0

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

    const v11, -0x249db6bc

    sget v12, Ll/ۗ֡;->ۜ᩻۫:I

    sget v13, Ll/֨ۢ;->۬ܿܺ:I

    const-string v14, "\u1a7a\u073d"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0xb

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x270d

    const v16, 0x31b1916e

    xor-int v15, v15, v16

    const v16, -0x2637951d

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, 0x7f0f

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p0

    move-object/from16 v16, v0

    .line 391
    sget v0, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v0, :cond_d

    goto/16 :goto_9

    :sswitch_0
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    sget v14, Ll/֨᩻;->ۛ֫ܶ:I

    if-gez v14, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_7

    :cond_1
    move-object/from16 v14, p0

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    goto/16 :goto_9

    .line 264
    :sswitch_2
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    move-result v14

    if-eqz v14, :cond_0

    :goto_2
    move-object/from16 v14, p0

    goto :goto_3

    .line 336
    :sswitch_3
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    goto :goto_2

    .line 265
    :sswitch_4
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    return-void

    :sswitch_5
    move-object/from16 v14, p0

    .line 558
    iget-object v0, v14, Ll/֫ۡۤ;->ܰ:Landroid/widget/CheckBox;

    invoke-static {v0, v2}, Ll/֨᩻;->ܽ۟ܳ(Ljava/lang/Object;Z)V

    return-void

    :sswitch_6
    move-object/from16 v14, p0

    .line 557
    invoke-interface {v0, v1}, Ll/ᩳ֫ܺ;->remove(Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v2

    invoke-static {v2}, Ll/ۖۗ;->ۜۜۧ(Ljava/lang/Object;)V

    .line 349
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v15

    if-eqz v15, :cond_3

    move-object/from16 v16, v0

    const/4 v2, 0x0

    goto/16 :goto_9

    :cond_3
    const-string v15, "\u1a73\u1a79"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x3d

    xor-int v2, v15, v12

    mul-int/lit16 v2, v2, 0x1c2f

    const v16, 0x66333f44

    xor-int v2, v2, v16

    const v16, -0x2f1f5ceb

    xor-int v15, v15, v16

    move v14, v15

    move v15, v2

    const/4 v2, 0x0

    goto :goto_0

    :sswitch_7
    move-object/from16 v14, p0

    const/16 v1, 0x11

    .line 557
    invoke-static {v9, v10, v1, v8}, Ll/֨ۢ;->ܰ֫֡([SIII)Ljava/lang/String;

    move-result-object v1

    sget v15, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v15, :cond_4

    :goto_3
    const-string v15, "\u06d8\u06ec"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x4643

    const v17, -0x12874b46

    xor-int v0, v0, v17

    const v17, -0x6bc85d4c

    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto/16 :goto_b

    :cond_4
    move-object/from16 v16, v0

    const-string v0, "\u1a77\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x7cdd

    const v17, -0x574da43

    xor-int v15, v15, v17

    const v17, 0x2396a297

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/4 v10, 0x1

    .line 465
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_5

    move-object/from16 v0, v16

    goto :goto_4

    :cond_5
    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x13

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x1f75

    const v17, -0x781708de

    xor-int v15, v15, v17

    const v17, 0x6666e95d

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v14, p0

    .line 557
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-static {v0}, Ll/ۖۙ;->ᩳܿܰ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v0

    sget-object v9, Ll/֫ۡۤ;->ۛ۫ۨ:[S

    .line 535
    sget v15, Ll/֫֡;->֫ۙۖ:I

    if-gtz v15, :cond_6

    :goto_4
    const-string v15, "\u073f\u06e8"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 p1, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x5baf

    const v16, 0x179e0376

    xor-int v0, v0, v16

    const v16, 0x4a2c93d9    # 2827510.2f

    goto :goto_5

    :cond_6
    const-string v15, "\u06e1\u06eb"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x79

    move-object/from16 p1, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x7de1

    const v16, 0x7a420047

    xor-int v0, v0, v16

    const v16, 0x47f10941

    :goto_5
    xor-int v15, v15, v16

    move v14, v15

    move v15, v0

    move-object/from16 v0, p1

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/16 v0, 0x6e97

    const/16 v8, 0x6e97

    goto :goto_6

    :sswitch_b
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const v0, 0xb618

    const v8, 0xb618

    :goto_6
    const-string v0, "\u1a79\u06da"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x51

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x8e9

    const v17, 0x689a67d1

    xor-int v15, v15, v17

    const v17, 0x4f3a5bb3

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    add-int v0, v4, v7

    mul-int v0, v0, v0

    sub-int/2addr v0, v6

    if-lez v0, :cond_7

    const-string v0, "\u06da\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x345d

    const v17, 0x56e2bb43

    xor-int v15, v15, v17

    const v17, 0x733fa645

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x730d

    const v17, 0x38d3edfd

    xor-int v15, v15, v17

    const v17, -0x3ce0bb70

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/16 v7, 0x3064

    sget v0, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v0, :cond_8

    :goto_7
    const-string v0, "\u05ab\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x69

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x796d

    const v17, -0x549afc9e

    xor-int v15, v15, v17

    const v17, -0x294c5bae

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u1a74\u06e2"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x53

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x81f

    const v17, 0x5e367b81

    xor-int v15, v15, v17

    const v17, 0xf0d8e54

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const v0, 0x925a710

    add-int/2addr v0, v5

    add-int v6, v0, v0

    .line 31
    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_9

    goto :goto_8

    :cond_9
    const-string v0, "\u06ec\u06e4"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0xb

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x2b43

    const v17, 0xb5537ea

    xor-int v15, v15, v17

    const v17, 0x57191590

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    const/4 v0, 0x0

    aget-short v4, v3, v0

    mul-int v5, v4, v4

    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u1a78\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x17

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x8e3

    const v17, 0x251ba5c6

    xor-int v15, v15, v17

    const v17, -0x5961fbd9

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    sget-object v3, Ll/֫ۡۤ;->ۛ۫ۨ:[S

    .line 68
    sget v0, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v0, :cond_b

    :goto_8
    const-string v0, "\u06e0\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x985

    const v17, 0x59ab699b

    xor-int v15, v15, v17

    const v17, -0x264044ac

    goto :goto_a

    :cond_b
    const-string v0, "\u1a76\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x4a25

    const v17, 0x2dba6fb7

    xor-int v15, v15, v17

    const v17, -0x7234a6cb

    goto :goto_a

    :sswitch_11
    move-object/from16 v14, p0

    move-object/from16 v16, v0

    .line 291
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_c

    goto :goto_9

    :cond_c
    const-string v0, "\u06e2\u073f"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x4857

    const v17, 0x60007b02

    xor-int v15, v15, v17

    const v17, -0x7c37600f

    goto :goto_a

    :goto_9
    const-string v0, "\u0736\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x4d

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x2a97

    const v17, -0x41ebe8de

    xor-int v15, v15, v17

    const v17, 0x1a2998b

    goto :goto_a

    :cond_d
    const-string v0, "\u06d8\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x41

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x4df3

    const v17, -0x4e7bc16a

    xor-int v15, v15, v17

    const v17, -0x5f567e8

    :goto_a
    xor-int v0, v0, v17

    move v14, v0

    :goto_b
    move-object/from16 v0, v16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x67333f7d -> :sswitch_5
        -0x6722690d -> :sswitch_10
        -0x631ca151 -> :sswitch_a
        -0x5a0fa806 -> :sswitch_1
        -0x59eaa86a -> :sswitch_8
        -0x4e14ca32 -> :sswitch_4
        -0x49bbefe9 -> :sswitch_3
        -0x47b9a53c -> :sswitch_6
        -0x33a10560 -> :sswitch_c
        -0x292e91c7 -> :sswitch_e
        -0x235d088c -> :sswitch_9
        -0x1d225b3d -> :sswitch_5
        -0x1885e273 -> :sswitch_8
        -0x11724943 -> :sswitch_7
        -0x70c30c1 -> :sswitch_6
        -0x5e88043 -> :sswitch_c
        0x2d90226 -> :sswitch_0
        0x3bf6415 -> :sswitch_2
        0x10292ab7 -> :sswitch_1
        0x13799064 -> :sswitch_e
        0x1879ce98 -> :sswitch_b
        0x26d784aa -> :sswitch_a
        0x339fa422 -> :sswitch_3
        0x3a7655b0 -> :sswitch_d
        0x499a1463 -> :sswitch_2
        0x4f1e4e2f -> :sswitch_11
        0x50e99e75 -> :sswitch_0
        0x54fec324 -> :sswitch_7
        0x58fbbfa3 -> :sswitch_b
        0x603b2dbe -> :sswitch_11
        0x615ad0ae -> :sswitch_f
        0x6214436a -> :sswitch_f
        0x67885944 -> :sswitch_d
        0x6c1460c6 -> :sswitch_10
        0x75269d6e -> :sswitch_9
        0x7beb5a0a -> :sswitch_4
    .end sparse-switch
.end method
