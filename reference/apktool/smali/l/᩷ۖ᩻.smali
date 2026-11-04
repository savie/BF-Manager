.class public final Ll/᩷ۖ᩻;
.super Ljava/lang/Object;
.source "U4EL"


# static fields
.field public static final synthetic ۙ:I

.field private static final ۡۜۢ:[S

.field public static final ۤ:Ljava/util/regex/Pattern;

.field public static final ᩷:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 21

    const/16 v0, 0x40

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩷ۖ᩻;->ۡۜۢ:[S

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

    const v13, -0x59af977

    sget v14, Ll/֡ܳ;->֨ᩳۢ:I

    sget v15, Ll/ۖۖ;->᩵ۜ֨:I

    const-string v16, "\u0733\u06e7"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v15

    mul-int/lit8 v16, v16, -0x59

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x5697

    const v18, 0x30add380

    xor-int v0, v0, v18

    const v18, 0x15152eeb

    xor-int v16, v16, v18

    const/16 v18, 0x0

    const/16 v17, 0x0

    :goto_0
    xor-int/2addr v13, v14

    mul-int/lit16 v13, v13, 0x5c71

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v13, v16, v0

    sparse-switch v13, :sswitch_data_0

    move/from16 v19, v1

    move/from16 v16, v3

    const/16 v0, 0xc84

    goto/16 :goto_6

    .line 19
    :sswitch_0
    invoke-static {v10, v11, v12, v6}, Ll/֨ܿ;->᩻ۢ۟([SIII)Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷ۖ᩻;->᩷:Ljava/util/regex/Pattern;

    return-void

    .line 2
    :sswitch_1
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move/from16 v16, v3

    goto/16 :goto_3

    :sswitch_2
    add-int v0, v4, v5

    sub-int/2addr v0, v3

    if-ltz v0, :cond_0

    const-string v0, "\u06e8\u1a74"

    .line 6
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x71

    move/from16 v16, v3

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x729f

    const v19, -0x4d24cbf6

    xor-int v3, v3, v19

    const v19, -0x2d225d01

    goto/16 :goto_7

    :cond_0
    move/from16 v16, v3

    const-string v0, "\u1a77\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x4ee5

    const v19, 0x664f6024

    xor-int v3, v3, v19

    const v19, -0x338b355d    # -6.4170636E7f

    goto/16 :goto_7

    :sswitch_3
    mul-int/lit16 v3, v2, 0x142

    .line 19
    sget-boolean v0, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v0, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u06db\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, -0x4d

    move/from16 v16, v3

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x702f

    const v19, -0x1eb635ca

    xor-int v3, v3, v19

    const v19, 0x6d037ed2

    goto/16 :goto_7

    :sswitch_4
    move/from16 v16, v3

    sget-object v10, Ll/᩷ۖ᩻;->ۡۜۢ:[S

    const/16 v11, 0x33

    .line 2
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v0, "\u06db\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x4793

    const v19, -0x3770b557

    xor-int v3, v3, v19

    const v19, 0x34562ce9

    goto/16 :goto_7

    :sswitch_5
    move/from16 v16, v3

    const/16 v9, 0x32

    .line 0
    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "\u1a78\u06e0"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x5d

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x32b7

    const v19, 0x44356e4e

    xor-int v3, v3, v19

    const v19, -0xa7ec50f

    goto/16 :goto_7

    :sswitch_6
    move/from16 v16, v3

    .line 9
    sget-object v17, Ll/᩷ۖ᩻;->ۡۜۢ:[S

    const/4 v1, 0x0

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u1a77\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x29

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x5937

    const v19, -0x2f9790ef

    xor-int v3, v3, v19

    const v19, 0x33b18ed4

    goto/16 :goto_7

    :sswitch_7
    move/from16 v16, v3

    .line 17
    sget v0, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v0, :cond_5

    goto/16 :goto_3

    :sswitch_8
    move/from16 v16, v3

    .line 7
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v0, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v0, :cond_6

    :cond_5
    :goto_1
    move/from16 v3, v16

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u1a73\u06e1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x15af

    const v19, 0x2273b494

    xor-int v3, v3, v19

    const v19, -0x6b0ab38a

    goto/16 :goto_7

    :sswitch_9
    move/from16 v16, v3

    .line 0
    sget-object v7, Ll/᩷ۖ᩻;->ۡۜۢ:[S

    const/4 v8, 0x1

    .line 6
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v0, "\u06ec\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x138f

    const v19, 0x464aa72d

    xor-int v3, v3, v19

    const v19, -0x65812571

    goto/16 :goto_7

    :sswitch_a
    move/from16 v16, v3

    .line 19
    aget-short v2, v17, v1

    .line 9
    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "\u1a7a\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x3e1b

    const v19, -0x5c5068cf

    xor-int v3, v3, v19

    const v19, -0x1e05203a

    goto/16 :goto_7

    :sswitch_b
    move/from16 v16, v3

    .line 19
    invoke-static/range {v18 .. v18}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩷ۖ᩻;->ۤ:Ljava/util/regex/Pattern;

    .line 2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v0

    if-ltz v0, :cond_9

    move/from16 v19, v1

    goto/16 :goto_5

    :cond_9
    const-string v0, "\u0730\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, 0x476f

    const v19, 0x747ba529

    xor-int v3, v3, v19

    const v19, -0x71fd3695

    goto/16 :goto_7

    .line 4
    :sswitch_c
    invoke-static {}, Ll/᩺;->۟ܰ᩻()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_d
    move/from16 v16, v3

    .line 12
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-nez v0, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    const-string v0, "\u1a76\u073d"

    .line 2
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x7577

    const v19, -0x2520357d

    xor-int v3, v3, v19

    const v19, -0x3e553ad9

    goto/16 :goto_7

    :sswitch_e
    move/from16 v16, v3

    mul-int v4, v2, v2

    const/16 v5, 0x6541

    .line 7
    sget v0, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v0, :cond_b

    :goto_3
    const-string v0, "\u06ec\u1a73"

    .line 9
    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x39

    xor-int v3, v0, v14

    mul-int/lit16 v3, v3, -0x53bd

    const v19, -0x4411d7f6

    xor-int v3, v3, v19

    const v19, 0x7971067d

    goto/16 :goto_7

    :cond_b
    const-string v0, "\u1a75\u1a74"

    .line 7
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x55

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x1255

    const v19, 0x2b217cd1

    xor-int v3, v3, v19

    const v19, 0x7933ca33

    goto/16 :goto_7

    :sswitch_f
    move/from16 v16, v3

    .line 0
    invoke-static {v7, v8, v9, v6}, Ll/ۗ᩸;->۫ᩳۡ([SIII)Ljava/lang/String;

    move-result-object v18

    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_c

    goto/16 :goto_1

    :goto_4
    const-string v0, "\u1a7a\u073f"

    .line 19
    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    move/from16 v19, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x1117

    const v16, -0x5a801e0d

    xor-int v1, v1, v16

    const v16, -0x30cb1077

    move/from16 v16, v3

    move v3, v1

    move/from16 v1, v19

    const v19, -0x30cb1077

    goto/16 :goto_7

    :cond_c
    move/from16 v19, v1

    const-string v0, "\u1a7b\u0733"

    .line 0
    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x25

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x6d13

    const v3, 0x7840b7f6

    xor-int/2addr v1, v3

    const v3, 0x73e05df3

    move v3, v1

    move/from16 v1, v19

    const v19, 0x73e05df3

    goto :goto_7

    :sswitch_10
    move/from16 v19, v1

    move/from16 v16, v3

    const v0, 0xe187

    goto :goto_6

    :sswitch_11
    move/from16 v19, v1

    move/from16 v16, v3

    const/16 v12, 0xd

    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_d

    :goto_5
    const-string v0, "\u05a1\u073a"

    .line 2
    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x2739

    const v3, 0x364f6036

    xor-int/2addr v1, v3

    const v3, 0x66b8b42d

    move v3, v1

    move/from16 v1, v19

    const v19, 0x66b8b42d

    goto :goto_7

    :cond_d
    const-string v0, "\u06e2\u1a73"

    .line 0
    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x23

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x3ed1

    const v3, 0x5951d997

    xor-int/2addr v1, v3

    const v3, 0x5e2d2d69

    move v3, v1

    move/from16 v1, v19

    const v19, 0x5e2d2d69

    goto :goto_7

    :goto_6
    const-string v1, "\u06e4\u1a79"

    .line 6
    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v3, v1, v15

    mul-int/lit16 v3, v3, 0x6533

    const v6, 0x71ae6302

    xor-int/2addr v3, v6

    const v6, -0x54c18982    # -6.7666E-13f

    move v6, v0

    move v0, v1

    move/from16 v1, v19

    const v19, -0x54c18982    # -6.7666E-13f

    :goto_7
    xor-int v0, v0, v19

    move/from16 v20, v16

    move/from16 v16, v0

    move v0, v3

    move/from16 v3, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bfad7d6 -> :sswitch_11
        -0x7448d265 -> :sswitch_10
        -0x738f91d1 -> :sswitch_f
        -0x6cdaa06e -> :sswitch_e
        -0x6c22bf6b -> :sswitch_d
        -0x5ce65fe4 -> :sswitch_c
        -0x52491ea5 -> :sswitch_b
        -0x49a51683 -> :sswitch_a
        -0x43b03e8d -> :sswitch_9
        -0x351337c4 -> :sswitch_8
        -0x29274648 -> :sswitch_8
        -0x24e37d2e -> :sswitch_7
        -0x24a67ee9 -> :sswitch_6
        -0x434a4ed -> :sswitch_6
        -0x1a39c87 -> :sswitch_e
        0xa148386 -> :sswitch_d
        0xa1e2217 -> :sswitch_5
        0xde6925f -> :sswitch_a
        0x1d066954 -> :sswitch_4
        0x1e622550 -> :sswitch_4
        0x21d7c8bd -> :sswitch_b
        0x2327b094 -> :sswitch_11
        0x255d4836 -> :sswitch_9
        0x373dc6bd -> :sswitch_c
        0x4979cba7 -> :sswitch_3
        0x4b319fe5 -> :sswitch_10
        0x4e111c1e -> :sswitch_2
        0x599463ba -> :sswitch_1
        0x59dff30e -> :sswitch_2
        0x5a3a4e80 -> :sswitch_0
        0x5f57da1c -> :sswitch_1
        0x6a76c3dc -> :sswitch_0
        0x71160e41 -> :sswitch_f
        0x7199996a -> :sswitch_3
        0x778b02ba -> :sswitch_5
        0x78f24e64 -> :sswitch_7
    .end sparse-switch

    :array_0
    .array-data 2
        0xf51s
        -0x1e27s
        -0x1e24s
        -0x1e1as
        -0x1e56s
        -0x1e03s
        -0x1e3as
        -0x1e56s
        -0x1e23s
        -0x1e49s
        -0x1e56s
        -0x1e42s
        -0x1e28s
        -0x1e57s
        -0x1e25s
        -0x1e56s
        -0x1e26s
        -0x1e54s
        -0x1e39s
        -0x1e24s
        -0x1e1as
        -0x1e56s
        -0x1e03s
        -0x1e3as
        -0x1e56s
        -0x1e23s
        -0x1e49s
        -0x1e56s
        -0x1e42s
        -0x1e28s
        -0x1e57s
        -0x1e25s
        -0x1e56s
        -0x1e26s
        -0x1e54s
        -0x1e25s
        -0x1e57s
        -0x1e24s
        -0x1e1as
        -0x1e56s
        -0x1e03s
        -0x1e3as
        -0x1e56s
        -0x1e23s
        -0x1e26s
        -0x1e04s
        -0x1e4bs
        -0x1e55s
        -0x1e4fs
        -0x1e06s
        -0x1e5ds
        -0x1e27s
        -0x1e4as
        -0x1e24s
        -0x1e4cs
        -0x1e56s
        -0x1e42s
        -0x1e26s
        -0x1e25s
        -0x1e1ds
        -0x1e04s
        -0x1e42s
        -0x1e06s
        -0x1e5ds
    .end array-data
.end method

.method public static ۙ(IILjava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3b5231a5

    sget v2, Ll/֨ۨ;->ۜܳ᩵:I

    sget v3, Ll/֫۠;->ۢᩴ᩺:I

    const-string v4, "\u0730\u05ab"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x787

    const v6, -0x7ece616c

    xor-int/2addr v5, v6

    const v6, -0x6d857838

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x374f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    if-gt v0, p1, :cond_0

    const-string v4, "\u06db\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x702d

    const v6, -0x4da5b44d

    xor-int/2addr v5, v6

    const v6, -0x66951f4a

    goto :goto_0

    .line 57
    :sswitch_0
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v4, :cond_d

    goto/16 :goto_3

    .line 43
    :sswitch_1
    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    sget v4, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v4, :cond_4

    goto/16 :goto_2

    :sswitch_2
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-eqz v4, :cond_7

    goto/16 :goto_2

    .line 58
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_2

    .line 14
    :sswitch_4
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x1

    return p0

    :sswitch_6
    const/4 p0, 0x0

    return p0

    .line 69
    :sswitch_7
    invoke-static {p2}, Ll/ۗ֫;->᩵۠ۙ(Ljava/lang/Object;)I

    move-result v0

    if-gt p0, v0, :cond_0

    const-string v4, "\u1a75\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5f6b

    const v6, -0x5491d970

    xor-int/2addr v5, v6

    const v6, -0x66278351

    goto :goto_0

    :sswitch_8
    if-nez p2, :cond_1

    :cond_0
    const-string v4, "\u06eb\u06ec"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x70f9

    const v6, 0x48ebb3e

    xor-int/2addr v5, v6

    const v6, 0x668975ac

    goto :goto_0

    :cond_1
    const-string v4, "\u06d6\u073f"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2f1b

    const v6, -0x504356b

    xor-int/2addr v5, v6

    const v6, -0x7ba10487

    goto/16 :goto_0

    .line 22
    :sswitch_9
    sget v4, Ll/᩶;->ᩴ᩶ۛ:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a75\u06e0"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x509d

    const v6, -0x1dc17a58

    xor-int/2addr v5, v6

    const v6, -0x6127f221

    goto/16 :goto_0

    .line 53
    :sswitch_a
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    move-result v4

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a77\u1a76"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5aed

    const v6, -0x3375192b    # -7.282449E7f

    xor-int/2addr v5, v6

    const v6, 0x1bb93d8e

    goto/16 :goto_0

    .line 15
    :sswitch_b
    sget v4, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u06ec\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7933

    const v6, 0x39ea5d8b

    xor-int/2addr v5, v6

    const v6, -0x323b45e6

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06eb\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2fad

    const v6, 0x4cc1e3a6    # 1.0165381E8f

    xor-int/2addr v5, v6

    const v6, -0x4218d4eb

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v4, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v4, :cond_6

    :goto_2
    const-string v4, "\u1a77\u06e8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x482f

    const v6, -0x4515f566

    xor-int/2addr v5, v6

    const v6, -0xfe06a37

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d6\u1a78"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2787

    const v6, 0x10430035

    xor-int/2addr v5, v6

    const v6, 0x1f690fd5

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u06d6\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ab7

    const v6, -0x4c110c10

    xor-int/2addr v5, v6

    const v6, 0x624b4278

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d7\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x32a1

    const v6, -0x4844ec00

    xor-int/2addr v5, v6

    const v6, -0x35de8752    # -2645547.5f

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a75\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6687

    const v6, -0x9c86f91

    xor-int/2addr v5, v6

    const v6, 0x74be27de

    goto/16 :goto_0

    .line 67
    :sswitch_f
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u06e2\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa65

    const v6, 0xd42588c

    xor-int/2addr v5, v6

    const v6, 0x7e0d7bb7

    goto/16 :goto_0

    :sswitch_10
    sget v4, Ll/ۖ;->ܿۚ֡:I

    if-ltz v4, :cond_b

    :goto_4
    const-string v4, "\u0733\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x31c1

    const v6, 0xac69fea

    xor-int/2addr v5, v6

    const v6, -0x412fd11d

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u05a1\u1a79"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6173

    const v6, -0x601a521

    xor-int/2addr v5, v6

    const v6, -0x490563b4

    goto/16 :goto_0

    .line 55
    :sswitch_11
    sget v4, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v4, :cond_c

    goto :goto_5

    :cond_c
    const-string v4, "\u06db\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5283

    const v6, -0x1a73d619

    xor-int/2addr v5, v6

    const v6, 0x414ce6c5

    goto/16 :goto_0

    .line 7
    :sswitch_12
    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v4, :cond_e

    :cond_d
    :goto_5
    const-string v4, "\u06dc\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe8d

    const v6, 0x4402b1e2

    xor-int/2addr v5, v6

    const v6, -0x765ccfc2

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x251b

    const v6, -0x7427d055

    xor-int/2addr v5, v6

    const v6, -0x118b65da

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a683a8a -> :sswitch_7
        -0x780ff16c -> :sswitch_2
        -0x7548dd1e -> :sswitch_e
        -0x7139d24b -> :sswitch_f
        -0x70102c5d -> :sswitch_12
        -0x68dbe2b8 -> :sswitch_6
        -0x625c9fc1 -> :sswitch_0
        -0x5c49b273 -> :sswitch_b
        -0x543cd2ad -> :sswitch_9
        -0x45d73892 -> :sswitch_4
        -0x44acb4ce -> :sswitch_a
        -0x403685e1 -> :sswitch_8
        -0x3c395657 -> :sswitch_a
        -0x38ce313d -> :sswitch_e
        -0x36768149 -> :sswitch_9
        -0x32406e84 -> :sswitch_11
        -0x2f11682d -> :sswitch_d
        -0x2dcd38a0 -> :sswitch_3
        -0x28b0a14e -> :sswitch_3
        -0x251c116a -> :sswitch_12
        -0x18df8841 -> :sswitch_4
        -0xf7bb6fd -> :sswitch_2
        0xb785457 -> :sswitch_10
        0xea996bc -> :sswitch_0
        0x1aadafe0 -> :sswitch_10
        0x247027df -> :sswitch_5
        0x34277e52 -> :sswitch_7
        0x37fdb586 -> :sswitch_8
        0x39da8126 -> :sswitch_1
        0x3a256f75 -> :sswitch_6
        0x3e89752c -> :sswitch_d
        0x4a1fe4ce -> :sswitch_b
        0x5155faf3 -> :sswitch_11
        0x62a06ba2 -> :sswitch_f
        0x63654fd2 -> :sswitch_1
        0x6eb316f8 -> :sswitch_c
        0x7a58fc41 -> :sswitch_c
        0x7b8aaba3 -> :sswitch_5
    .end sparse-switch
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x547a65c3

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    sget v3, Ll/ۗ֡;->ۜ᩻۫:I

    const-string v4, "\u073f\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3e91

    const v6, 0x315740df

    xor-int/2addr v5, v6

    const v6, 0x57bd80a6

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x75dd

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 27
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_7

    goto/16 :goto_2

    .line 38
    :sswitch_0
    invoke-static {}, Ll/ۗܶ;->ܿ۬֨()Z

    sget v4, Ll/ۗܶ;->ᩴ֫۫:I

    if-lez v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v4, "\u0733\u073a"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xa8b

    const v6, 0x303b15c

    xor-int/2addr v5, v6

    const v6, 0x56aad8eb

    goto :goto_0

    .line 22
    :sswitch_1
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    move-result v4

    if-lez v4, :cond_b

    goto/16 :goto_1

    .line 42
    :sswitch_2
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    move-result v4

    if-ltz v4, :cond_3

    goto/16 :goto_1

    .line 9
    :sswitch_3
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    invoke-static {}, Ll/֨᩻;->ܺۘۜ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    const/4 p0, 0x0

    return p0

    .line 57
    :sswitch_6
    sget-object v0, Ll/᩷ۖ᩻;->ۤ:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    :sswitch_7
    const/16 v4, 0x20

    .line 55
    invoke-static {v0, v4, p0}, Ll/᩷ۖ᩻;->ۙ(IILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "\u1a76\u05a1"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x553

    const v6, -0x2ad316e1

    xor-int/2addr v5, v6

    const v6, -0x763ab779

    goto :goto_0

    :cond_1
    const-string v4, "\u06e8\u1a73"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7293

    const v6, -0x4f37b2cc

    xor-int/2addr v5, v6

    const v6, -0x2337baac

    goto/16 :goto_0

    .line 23
    :sswitch_8
    sget-boolean v4, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u06e1\u06d9"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a07

    const v6, -0x2fc0445f

    xor-int/2addr v5, v6

    const v6, 0x58525d82

    goto/16 :goto_0

    .line 55
    :sswitch_9
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    const-string v4, "\u06d6\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a4d

    const v6, -0x699732e7

    xor-int/2addr v5, v6

    const v6, -0x7111af37

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u05a8\u073f"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5b1d

    const v6, -0x542f48be

    xor-int/2addr v5, v6

    const v6, 0x202a1eb0

    goto/16 :goto_0

    .line 41
    :sswitch_a
    sget v4, Ll/۬;->᩸ۜ᩹:I

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06eb\u0733"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x19

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x26a9

    const v6, 0x3c0d639b

    xor-int/2addr v5, v6

    const v6, 0x2bddadf2

    goto/16 :goto_0

    .line 17
    :sswitch_b
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v4, "\u073f\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3da9

    const v6, 0x73e13243

    xor-int/2addr v5, v6

    const v6, 0x1bca69cc

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e2\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2fb7

    const v6, 0x76179b51

    xor-int/2addr v5, v6

    const v6, 0x747957

    goto/16 :goto_0

    .line 55
    :sswitch_c
    sget v4, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u06d7\u06e4"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5707

    const v6, -0x530cc9c7

    xor-int/2addr v5, v6

    const v6, -0x2ab07d0f

    goto/16 :goto_0

    .line 29
    :sswitch_d
    sget v4, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v4, :cond_9

    goto :goto_1

    :cond_9
    const-string v4, "\u1a78\u1a73"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7f8b

    const v6, -0x17a12dcd

    xor-int/2addr v5, v6

    const v6, 0x315b5689

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_a

    :goto_1
    const-string v4, "\u06e2\u1a79"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x231b

    const v6, 0x3f5cbb14

    xor-int/2addr v5, v6

    const v6, -0x12f2b9a

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a74\u06d9"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x11fd

    const v6, 0x35516aa5

    xor-int/2addr v5, v6

    const v6, 0x7d6755f0

    goto/16 :goto_0

    .line 40
    :sswitch_f
    invoke-static {}, Ll/ۘ֡;->ۧۚ֡()Z

    move-result v4

    if-nez v4, :cond_c

    :cond_b
    :goto_2
    const-string v4, "\u1a73\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5d77

    const v6, 0x128dea32

    xor-int/2addr v5, v6

    const v6, -0x500eae4d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a7b\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3cd3

    const v6, -0x4c7e0762

    xor-int/2addr v5, v6

    const v6, 0x2f185756

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x6

    sget v4, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v4, :cond_d

    :goto_3
    const-string v4, "\u1a74\u0730"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2871

    const v6, -0x775e5eef

    xor-int/2addr v5, v6

    const v6, -0x7ec5db9f

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0733\u06df"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x11b

    const v6, -0x425130ba

    xor-int/2addr v5, v6

    const v6, -0x33dbbec

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a36e274 -> :sswitch_5
        -0x6efed40d -> :sswitch_2
        -0x6d47b341 -> :sswitch_d
        -0x4fe20033 -> :sswitch_3
        -0x4689e2da -> :sswitch_1
        -0x3f38b0b9 -> :sswitch_e
        -0x33e890e7 -> :sswitch_7
        -0x32f721a8 -> :sswitch_8
        -0x32508634 -> :sswitch_0
        -0x2ed5e4f8 -> :sswitch_10
        -0x2b03bede -> :sswitch_5
        -0x26cbb60d -> :sswitch_a
        -0x1f8254da -> :sswitch_6
        -0x1dc40b41 -> :sswitch_6
        -0x1a096995 -> :sswitch_10
        -0x135e3c27 -> :sswitch_9
        -0xb759ffc -> :sswitch_b
        -0x2920d8a -> :sswitch_c
        0x547bb3d -> :sswitch_8
        0xd476369 -> :sswitch_d
        0x110c181b -> :sswitch_4
        0x2434f3fb -> :sswitch_2
        0x2539d3b7 -> :sswitch_a
        0x2a71986b -> :sswitch_1
        0x2e615e8f -> :sswitch_0
        0x33b6799c -> :sswitch_c
        0x3e87d7e6 -> :sswitch_b
        0x403d7c04 -> :sswitch_e
        0x41e185fe -> :sswitch_4
        0x47488cf0 -> :sswitch_9
        0x61eb117e -> :sswitch_3
        0x66a1c0fa -> :sswitch_7
        0x66fb6fa0 -> :sswitch_f
        0x67f05e58 -> :sswitch_f
    .end sparse-switch
.end method

.method public static ۤ(Ljava/lang/String;)Z
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x5a1607f7

    sget v7, Ll/֨᩻;->ۛ֫ܶ:I

    sget v8, Ll/ۖᩳ;->᩹ۧܳ:I

    const-string v9, "\u1a73\u06e1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5d17

    const v11, -0x1761898d

    xor-int/2addr v10, v11

    const v11, -0x168d6e5d

    :goto_0
    xor-int/2addr v9, v11

    :goto_1
    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x392d

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v9

    if-gez v9, :cond_e

    goto/16 :goto_6

    .line 33
    :sswitch_0
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    sget v9, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v9, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v9, "\u06e2\u1a7a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x21

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x1341

    const v11, 0x577f0791

    xor-int/2addr v10, v11

    const v11, 0x2617cf9d

    goto :goto_0

    .line 12
    :sswitch_1
    sget v9, Ll/֨ܿ;->᩹᩻۟:I

    if-gez v9, :cond_9

    goto/16 :goto_6

    .line 37
    :sswitch_2
    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto/16 :goto_6

    :sswitch_3
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    const/4 p0, 0x0

    return p0

    :sswitch_4
    return v2

    :sswitch_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 48
    :sswitch_6
    aget-char v9, v3, v5

    if-ne v9, v1, :cond_1

    const-string v9, "\u1a76\u06d8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0xf

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x62af

    const v11, -0x11f4ce8

    xor-int/2addr v10, v11

    const v11, 0x69ce45ee

    goto :goto_0

    :cond_1
    const-string v9, "\u1a78\u06d8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x3e3b

    const v11, -0x3664470a

    xor-int/2addr v10, v11

    const v11, -0x44865e66

    goto :goto_0

    :sswitch_7
    const/4 p0, 0x1

    return p0

    :sswitch_8
    if-ge v5, v4, :cond_2

    const-string v9, "\u06d9\u06d7"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0xad

    const v11, -0x7e89cbf6

    xor-int/2addr v10, v11

    const v11, 0x2818f39e

    goto/16 :goto_0

    :cond_2
    const-string v9, "\u073a\u1a74"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x1b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x6855

    const v11, 0x73793137

    xor-int/2addr v10, v11

    const v11, -0x70bea67f

    goto/16 :goto_0

    :sswitch_9
    return v2

    :sswitch_a
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_2
    const-string v9, "\u06d9\u1a7a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x1f

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6007

    const v11, -0x394e3409

    xor-int/2addr v10, v11

    const v11, 0x7e2a066d

    goto/16 :goto_0

    .line 42
    :sswitch_b
    invoke-static {v0, v1, p0}, Ll/᩷ۖ᩻;->ۙ(IILjava/lang/String;)Z

    move-result v2

    const/4 v9, 0x0

    if-nez v2, :cond_3

    const-string v2, "\u0736\u05ab"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v7

    xor-int v10, v2, v8

    mul-int/lit16 v10, v10, -0x165f

    const v11, 0x684f156f

    xor-int/2addr v10, v11

    const v11, 0xe781b25

    goto :goto_3

    :cond_3
    const-string v2, "\u1a74\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    mul-int/lit8 v2, v2, -0x31

    xor-int v10, v2, v7

    mul-int/lit16 v10, v10, 0x3605

    const v11, -0x3b7a6fe8

    xor-int/2addr v10, v11

    const v11, -0x41f1cf00

    :goto_3
    xor-int/2addr v2, v11

    move v9, v2

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_c
    const/16 v1, 0x20

    .line 35
    sget v9, Ll/ۖᩳ;->᩹ۧܳ:I

    if-gtz v9, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v9, "\u05ab\u05a1"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2eeb

    const v11, 0x76aaaeb4

    xor-int/2addr v10, v11

    const v11, 0x1c2c72d8

    goto/16 :goto_0

    .line 37
    :sswitch_d
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v9

    if-nez v9, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v9, "\u06d9\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x5e39

    const v11, 0x2b44b7b1

    xor-int/2addr v10, v11

    const v11, 0x7f02c903

    goto/16 :goto_0

    .line 44
    :sswitch_e
    sget v9, Ll/֫֡;->֫ۙۖ:I

    if-gtz v9, :cond_6

    goto :goto_4

    :cond_6
    const-string v9, "\u073a\u1a73"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x63

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x6ab

    const v11, 0x5fd8dceb

    xor-int/2addr v10, v11

    const v11, 0x36b5e5da

    goto/16 :goto_0

    :sswitch_f
    sget v9, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v9, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v9, "\u06d9\u1a75"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x6b

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x973

    const v11, 0x135cd3a5

    xor-int/2addr v10, v11

    const v11, 0x164c524e

    goto/16 :goto_0

    .line 29
    :sswitch_10
    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v9, :cond_8

    goto :goto_5

    :cond_8
    const-string v9, "\u1a77\u06d9"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x5

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x3ac7

    const v11, -0x1f9fb6fa

    xor-int/2addr v10, v11

    const v11, 0x5192e9ea

    goto/16 :goto_0

    .line 13
    :sswitch_11
    sget v9, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v9, :cond_a

    :cond_9
    :goto_4
    const-string v9, "\u06e7\u073f"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x490f

    const v11, 0xeab3593

    xor-int/2addr v10, v11

    const v11, 0x3fcc7a03

    goto/16 :goto_0

    :cond_a
    const-string v9, "\u1a78\u1a7a"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, -0x23

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6df

    const v11, -0x52868d1b

    xor-int/2addr v10, v11

    const v11, 0x1910952f

    goto/16 :goto_0

    .line 5
    :sswitch_12
    invoke-static {}, Ll/۬;->ܿ᩺֫()Z

    move-result v9

    if-nez v9, :cond_b

    :goto_5
    const-string v9, "\u06d9\u05ab"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x695

    const v11, -0x7a951091

    xor-int/2addr v10, v11

    const v11, -0x6257572d

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u073a\u05a8"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x45b5

    const v11, 0x4589d7c1

    xor-int/2addr v10, v11

    const v11, -0x47f18ceb

    goto/16 :goto_0

    .line 29
    :sswitch_13
    sget v9, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v9, :cond_c

    :goto_6
    const-string v9, "\u0733\u1a78"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1c9f

    const v11, 0x424cd43

    xor-int/2addr v10, v11

    const v11, 0x602d64ad

    goto/16 :goto_0

    :cond_c
    const-string v9, "\u06eb\u06da"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, -0x73

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x354f

    const v11, -0x2e27315a

    xor-int/2addr v10, v11

    const v11, -0x33337ee3

    goto/16 :goto_0

    :sswitch_14
    sget-boolean v9, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v9, :cond_d

    goto :goto_7

    :cond_d
    const-string v9, "\u06e1\u1a76"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, 0x49

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x370f

    const v11, 0x658a5656

    xor-int/2addr v10, v11

    const v11, -0x1a5e88a3

    goto/16 :goto_0

    :sswitch_15
    const/4 v0, 0x7

    .line 19
    sget v9, Ll/᩺;->۫۬۫:I

    if-gtz v9, :cond_f

    :cond_e
    :goto_7
    const-string v9, "\u1a77\u06d7"

    invoke-static {v9}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x71

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x5c1

    const v11, 0x6d9722fa

    xor-int/2addr v10, v11

    const v11, -0x20bbebf0

    goto/16 :goto_0

    :cond_f
    const-string v9, "\u06d9\u06ec"

    invoke-static {v9}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x35

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x53ed

    const v11, -0x6840464c

    xor-int/2addr v10, v11

    const v11, 0x2c78ceb6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c0640a7 -> :sswitch_e
        -0x783d9b70 -> :sswitch_0
        -0x774be843 -> :sswitch_14
        -0x76f61ec8 -> :sswitch_5
        -0x6d273b65 -> :sswitch_13
        -0x6c0f1e79 -> :sswitch_6
        -0x59c7e143 -> :sswitch_15
        -0x51207367 -> :sswitch_e
        -0x4f12dc7b -> :sswitch_c
        -0x4c083e86 -> :sswitch_f
        -0x40acf2c9 -> :sswitch_3
        -0x3cada84f -> :sswitch_b
        -0x336fda40 -> :sswitch_4
        -0x2ef991d1 -> :sswitch_9
        -0x2a1a0b47 -> :sswitch_4
        -0x204d8400 -> :sswitch_2
        -0x1e88953b -> :sswitch_1
        -0x1d146cc8 -> :sswitch_7
        -0x1504112a -> :sswitch_b
        -0x1455a68d -> :sswitch_1
        -0xc1a106f -> :sswitch_f
        -0x8b8dc95 -> :sswitch_11
        0x9f5c85a -> :sswitch_9
        0x15be2982 -> :sswitch_3
        0x1bdc141c -> :sswitch_8
        0x2796a90a -> :sswitch_d
        0x304ba755 -> :sswitch_c
        0x304f64f9 -> :sswitch_10
        0x35c9d757 -> :sswitch_a
        0x42d6e11e -> :sswitch_0
        0x4608cb29 -> :sswitch_14
        0x4cf2865f -> :sswitch_11
        0x4d965615 -> :sswitch_10
        0x52a45fc7 -> :sswitch_15
        0x56441f2d -> :sswitch_12
        0x5efa0bc9 -> :sswitch_13
        0x60a8361f -> :sswitch_d
        0x64040ac5 -> :sswitch_5
        0x67519d50 -> :sswitch_6
        0x680af035 -> :sswitch_8
        0x6cb4a453 -> :sswitch_a
        0x6f26a82c -> :sswitch_7
        0x732d3bab -> :sswitch_12
        0x7ec6a76b -> :sswitch_2
    .end sparse-switch
.end method

.method public static ᩴ(Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    const v1, -0x40cfdaed

    sget v2, Ll/ۘܶ;->ܶ᩵ۢ:I

    sget v3, Ll/֨ۢ;->۬ܿܺ:I

    const-string v4, "\u1a78\u06d6"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x374b

    const v6, -0x67487ca4

    xor-int/2addr v5, v6

    const v6, -0x5ef4ac4b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x69d5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    sget-boolean v4, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v4, Ll/֡ۢ;->۟֡᩻:I

    if-lez v4, :cond_c

    :cond_0
    const-string v4, "\u0733\u06e8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x69ef

    const v6, -0x5e1cbf7c

    xor-int/2addr v5, v6

    const v6, 0xe2af2c

    goto :goto_0

    .line 60
    :sswitch_2
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    goto/16 :goto_2

    .line 42
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    const/4 p0, 0x0

    return p0

    :sswitch_4
    const/4 p0, 0x0

    return p0

    .line 63
    :sswitch_5
    sget-object v0, Ll/᩷ۖ᩻;->᩷:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result p0

    return p0

    :sswitch_6
    const/16 v4, 0x18

    .line 61
    invoke-static {v0, v4, p0}, Ll/᩷ۖ᩻;->ۙ(IILjava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "\u06df\u0733"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x191f

    const v6, 0x31542a9e

    xor-int/2addr v5, v6

    const v6, 0x1156602a

    goto :goto_0

    :cond_1
    const-string v4, "\u06df\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7495

    const v6, 0x2fc1ce88

    xor-int/2addr v5, v6

    const v6, 0x26f2d36d

    goto/16 :goto_0

    .line 54
    :sswitch_7
    sget-boolean v4, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u05ab\u06d6"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xb79

    const v6, -0x7c18847d

    xor-int/2addr v5, v6

    const v6, 0x592a4942

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a7b\u05a8"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5453

    const v6, 0x2a4f04e6

    xor-int/2addr v5, v6

    const v6, 0x156aee63

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u06e4\u05ab"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3c19

    const v6, -0x525554fc

    xor-int/2addr v5, v6

    const v6, -0x15aa4eaa

    goto/16 :goto_0

    .line 16
    :sswitch_a
    sget-boolean v4, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "\u06dc\u1a74"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a4b

    const v6, -0x35c1b6ea    # -3117637.5f

    xor-int/2addr v5, v6

    const v6, -0x1915dbee

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v4

    if-gtz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u05a8\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x51d

    const v6, 0x4fc397e5    # 6.5630234E9f

    xor-int/2addr v5, v6

    const v6, 0x6371f2e4

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡᩻;->᩷ۧ᩺:I

    if-gtz v4, :cond_8

    :cond_7
    :goto_1
    const-string v4, "\u06e2\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit8 v5, v5, 0x35

    const v6, 0x3799e372

    xor-int/2addr v5, v6

    const v6, 0x278a3ea5

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u073f\u1a7b"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x13f

    const v6, 0x220f9897

    xor-int/2addr v5, v6

    const v6, 0x31425547

    goto/16 :goto_0

    .line 37
    :sswitch_d
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v4

    if-nez v4, :cond_9

    :goto_2
    const-string v4, "\u073a\u06d8"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x55cf

    const v6, -0x6b90e53b

    xor-int/2addr v5, v6

    const v6, -0x1c5d90d0

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u0733\u06e0"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7dff

    const v6, 0x2c3ed80f

    xor-int/2addr v5, v6

    const v6, 0x69e6920a

    goto/16 :goto_0

    .line 33
    :sswitch_e
    sget-boolean v4, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v4, :cond_a

    :goto_3
    const-string v4, "\u073a\u0730"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4bdd

    const v6, -0x49b5532d

    xor-int/2addr v5, v6

    const v6, 0x508bf899

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x52a5

    const v6, -0x76f2094e

    xor-int/2addr v5, v6

    const v6, 0xc4e2c84

    goto/16 :goto_0

    :sswitch_f
    sget v4, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u06df\u1a7a"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x326d

    const v6, 0x348c3c74

    xor-int/2addr v5, v6

    const v6, 0x24ccee04

    goto/16 :goto_0

    :sswitch_10
    const/4 v0, 0x4

    .line 30
    sget v4, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v4, :cond_d

    :cond_c
    :goto_4
    const-string v4, "\u06e0\u06e4"

    invoke-static {v4}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x26df

    const v6, 0x6ba5a5b5

    xor-int/2addr v5, v6

    const v6, 0x1cde7bad

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a75\u1a76"

    invoke-static {v4}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7c2d

    const v6, 0x44f68d6e

    xor-int/2addr v5, v6

    const v6, 0x1488d9c1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f925272 -> :sswitch_f
        -0x7f001d2b -> :sswitch_8
        -0x7df471dc -> :sswitch_7
        -0x7952800d -> :sswitch_b
        -0x7412b6b9 -> :sswitch_0
        -0x6fbaca5f -> :sswitch_5
        -0x6f243947 -> :sswitch_6
        -0x6f193748 -> :sswitch_9
        -0x6d84c3aa -> :sswitch_e
        -0x61c76a42 -> :sswitch_d
        -0x566882ba -> :sswitch_c
        -0x50508d52 -> :sswitch_f
        -0x4ad431bc -> :sswitch_6
        -0x499aef49 -> :sswitch_8
        -0x45c2aacd -> :sswitch_d
        -0x3c38f3c3 -> :sswitch_4
        -0x35cf150a -> :sswitch_4
        -0x33185d2e -> :sswitch_3
        -0x2efd548d -> :sswitch_1
        -0x2a39860b -> :sswitch_a
        -0x106e5dc8 -> :sswitch_1
        -0x1019ec25 -> :sswitch_a
        0x8678bc7 -> :sswitch_b
        0x8d6d710 -> :sswitch_e
        0xf94ebaf -> :sswitch_0
        0x17ef5b15 -> :sswitch_c
        0x18931794 -> :sswitch_7
        0x289ddc0c -> :sswitch_10
        0x38c4df06 -> :sswitch_3
        0x515f2fdd -> :sswitch_5
        0x543ee346 -> :sswitch_2
        0x7643b29c -> :sswitch_2
        0x7bac06f3 -> :sswitch_9
        0x7fd541f7 -> :sswitch_10
    .end sparse-switch
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 2

    const/4 v0, 0x1

    const/16 v1, 0x18

    .line 23
    invoke-static {v0, v1, p0}, Ll/᩷ۖ᩻;->ۙ(IILjava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ᩸(Ljava/lang/String;)Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x4e2f16cc

    sget v8, Ll/ۗܶ;->ᩴ֫۫:I

    sget v9, Ll/֫֡;->֫ۙۖ:I

    const-string v10, "\u06da\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4483

    const v12, -0x3c40021f

    xor-int/2addr v11, v12

    const v12, -0x7d231a9b

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x3d8f

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    move-result v10

    if-gtz v10, :cond_14

    goto/16 :goto_a

    .line 32
    :sswitch_0
    sget v10, Ll/۬;->᩸ۜ᩹:I

    if-nez v10, :cond_0

    goto/16 :goto_9

    :cond_0
    const-string v10, "\u06d8\u06d9"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x65

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x46b9

    const v12, -0x7e643eda

    xor-int/2addr v11, v12

    const v12, 0x2799c441

    goto :goto_0

    .line 24
    :sswitch_1
    sget v10, Ll/֫֡;->֫ۙۖ:I

    if-lez v10, :cond_11

    goto :goto_3

    .line 14
    :sswitch_2
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    sget v10, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v10, :cond_13

    goto :goto_3

    .line 27
    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    sget v10, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-nez v10, :cond_1

    goto :goto_2

    :cond_1
    const-string v10, "\u05a1\u06eb"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xf3b

    const v12, 0x315df5d5

    xor-int/2addr v11, v12

    const v12, -0x51701f6

    goto :goto_0

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    sget v10, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v10, :cond_2

    goto :goto_2

    :cond_2
    const-string v10, "\u05a1\u06e1"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x19

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x23c9

    const v12, -0x5fc4f65b

    xor-int/2addr v11, v12

    const v12, -0x40b5e3ac

    goto :goto_0

    .line 26
    :sswitch_5
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget v10, Ll/֡ۖ;->۫ۙ᩶:I

    if-lez v10, :cond_3

    goto :goto_3

    :cond_3
    :goto_2
    const-string v10, "\u1a76\u06e8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7181

    const v12, -0x5dc2dd99

    xor-int/2addr v11, v12

    const v12, 0x3c784517

    goto/16 :goto_0

    .line 21
    :sswitch_6
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    :goto_3
    const-string v10, "\u073a\u06df"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x7d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6acb

    const v12, -0x49ef9451

    xor-int/2addr v11, v12

    const v12, -0x2319a1b2

    goto/16 :goto_0

    .line 24
    :sswitch_7
    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    const/4 p0, 0x0

    return p0

    :sswitch_8
    return v2

    :sswitch_9
    const/16 v10, 0x39

    if-le v6, v10, :cond_5

    goto :goto_4

    :sswitch_a
    const/16 v10, 0x5f

    if-eq v6, v10, :cond_5

    const-string v10, "\u1a78\u06d7"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3f29

    const v12, 0x5e8374f1

    xor-int/2addr v11, v12

    const v12, -0x352e6444    # -6868446.0f

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_7

    :sswitch_c
    const/16 v10, 0x5a

    if-le v6, v10, :cond_5

    goto :goto_5

    :sswitch_d
    const/16 v10, 0x30

    if-lt v6, v10, :cond_4

    const-string v10, "\u06d9\u06e2"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x12d

    const v12, 0x15bc1921

    xor-int/2addr v11, v12

    const v12, 0x6b422794

    goto/16 :goto_0

    :cond_4
    :goto_4
    const-string v10, "\u1a79\u06e4"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x438f

    const v12, 0x395e7a53

    xor-int/2addr v11, v12

    const v12, 0x79fb929a    # 1.6327999E35f

    goto/16 :goto_0

    :sswitch_e
    const/16 v10, 0x7a

    if-le v6, v10, :cond_5

    goto :goto_6

    :cond_5
    const-string v10, "\u1a7b\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x7

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5ed1

    const v12, 0x3b07f8aa

    xor-int/2addr v11, v12

    const v12, -0x636cc88a

    goto/16 :goto_0

    :sswitch_f
    const/16 v10, 0x41

    if-lt v6, v10, :cond_6

    const-string v10, "\u06eb\u0736"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x867

    const v12, 0x3523577a

    xor-int/2addr v11, v12

    const v12, 0x4f6785b5    # 3.8842995E9f

    goto/16 :goto_0

    :cond_6
    :goto_5
    const-string v10, "\u06eb\u1a77"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x51

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xdf7

    const v12, 0x630c1590

    xor-int/2addr v11, v12

    const v12, 0x5075ab4a

    goto/16 :goto_0

    .line 33
    :sswitch_10
    aget-char v6, v3, v5

    const/16 v10, 0x61

    if-lt v6, v10, :cond_7

    const-string v10, "\u1a75\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x77

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1d31

    const v12, -0x36c68050    # -759803.0f

    xor-int/2addr v11, v12

    const v12, 0x1b17eebd

    goto/16 :goto_0

    :cond_7
    :goto_6
    const-string v10, "\u0736\u06d6"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x44ad

    const v12, -0x5916c6f2

    xor-int/2addr v11, v12

    const v12, 0x59777ba3

    goto/16 :goto_0

    :sswitch_11
    const/4 p0, 0x1

    return p0

    :sswitch_12
    if-ge v5, v4, :cond_8

    const-string v10, "\u06db\u1a7b"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x62b1

    const v12, 0x135f983b

    xor-int/2addr v11, v12

    const v12, 0x10f0afff

    goto/16 :goto_0

    :cond_8
    const-string v10, "\u1a73\u0730"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x75

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x99

    const v12, -0x7d6ea7ee

    xor-int/2addr v11, v12

    const v12, -0x7ee72034

    goto/16 :goto_0

    :sswitch_13
    return v2

    :sswitch_14
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_7
    const-string v10, "\u06df\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x75

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x2ff1

    const v12, 0x1035b985

    xor-int/2addr v11, v12

    const v12, -0x268baa19

    goto/16 :goto_0

    .line 27
    :sswitch_15
    invoke-static {v0, v1, p0}, Ll/᩷ۖ᩻;->ۙ(IILjava/lang/String;)Z

    move-result v2

    const/4 v10, 0x0

    if-nez v2, :cond_9

    const-string v2, "\u073f\u06df"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v9

    xor-int v11, v2, v8

    mul-int/lit16 v11, v11, 0x129d

    const v12, -0x4b175e6b

    xor-int/2addr v11, v12

    const v12, 0x52bad4ac

    goto :goto_8

    :cond_9
    const-string v2, "\u073f\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v8

    xor-int v11, v2, v9

    mul-int/lit16 v11, v11, -0x69a1

    const v12, 0x6b62df67

    xor-int/2addr v11, v12

    const v12, -0x1f8ef9ed

    :goto_8
    xor-int/2addr v2, v12

    move v10, v2

    const/4 v2, 0x0

    goto/16 :goto_1

    :sswitch_16
    const/16 v1, 0x18

    .line 5
    sget v10, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v10, :cond_a

    goto/16 :goto_b

    :cond_a
    const-string v10, "\u05a1\u1a75"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x19

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4453

    const v12, -0x66d890e4

    xor-int/2addr v11, v12

    const v12, -0x608fad41

    goto/16 :goto_0

    .line 22
    :sswitch_17
    sget v10, Ll/۬;->᩸ۜ᩹:I

    if-eqz v10, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v10, "\u073d\u06df"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2f1f

    const v12, 0x1343a0cd

    xor-int/2addr v11, v12

    const v12, -0x5faef3

    goto/16 :goto_0

    :sswitch_18
    sget-boolean v10, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v10, :cond_c

    goto/16 :goto_a

    :cond_c
    const-string v10, "\u05ab\u06ec"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0xd

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1931

    const v12, -0x1aedef67

    xor-int/2addr v11, v12

    const v12, 0x16762e2

    goto/16 :goto_0

    :sswitch_19
    sget v10, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v10, :cond_d

    goto :goto_9

    :cond_d
    const-string v10, "\u06e4\u0736"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x3f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6797

    const v12, -0x3a90c1b9

    xor-int/2addr v11, v12

    const v12, -0x398974e5

    goto/16 :goto_0

    .line 32
    :sswitch_1a
    sget v10, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v10, :cond_e

    goto/16 :goto_b

    :cond_e
    const-string v10, "\u0736\u1a7a"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x7d6b

    const v12, 0x1852b8f0

    xor-int/2addr v11, v12

    const v12, 0x1c1ae80e

    goto/16 :goto_0

    .line 21
    :sswitch_1b
    sget-boolean v10, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v10, :cond_f

    goto/16 :goto_b

    :cond_f
    const-string v10, "\u06d7\u06dc"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x31

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x34f1

    const v12, -0x791531af

    xor-int/2addr v11, v12

    const v12, 0x51aa4028

    goto/16 :goto_0

    .line 4
    :sswitch_1c
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    move-result v10

    if-eqz v10, :cond_10

    goto :goto_a

    :cond_10
    const-string v10, "\u073a\u06d8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x39e9

    const v12, 0x7b18f708

    xor-int/2addr v11, v12

    const v12, -0x45e19aed

    goto/16 :goto_0

    .line 23
    :sswitch_1d
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v10

    if-ltz v10, :cond_12

    :cond_11
    :goto_9
    const-string v10, "\u0733\u1a74"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x264d

    const v12, 0x4778d4ab

    xor-int/2addr v11, v12

    const v12, -0x76952a84

    goto/16 :goto_0

    :cond_12
    const-string v10, "\u1a76\u06e4"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6df3

    const v12, -0x5d45a601

    xor-int/2addr v11, v12

    const v12, -0x67939699

    goto/16 :goto_0

    :cond_13
    :goto_a
    const-string v10, "\u06e2\u05a8"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x35

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x8f3

    const v12, -0x53b6fcbd

    xor-int/2addr v11, v12

    const v12, -0x1ab3f321

    goto/16 :goto_0

    :cond_14
    const-string v10, "\u06e0\u05a1"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x61

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x263f

    const v12, -0x674052ef

    xor-int/2addr v11, v12

    const v12, 0x651bd44f

    goto/16 :goto_0

    :sswitch_1e
    const/4 v0, 0x4

    sget-boolean v10, Ll/ۗ᩶;->ۜۨ᩺:Z

    if-eqz v10, :cond_15

    :goto_b
    const-string v10, "\u06e7\u1a78"

    invoke-static {v10}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x46cd

    const v12, 0x4fe29f12

    xor-int/2addr v11, v12

    const v12, 0x47c5e250    # 101316.625f

    goto/16 :goto_0

    :cond_15
    const-string v10, "\u1a74\u05ab"

    invoke-static {v10}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x85b

    const v12, -0x17619905

    xor-int/2addr v11, v12

    const v12, 0x3e0f4ae1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c76d1bc -> :sswitch_1a
        -0x7a91ae97 -> :sswitch_3
        -0x74663180 -> :sswitch_1c
        -0x6ed55d6e -> :sswitch_1e
        -0x6af7ab9c -> :sswitch_13
        -0x65634fec -> :sswitch_2
        -0x5a67b0a8 -> :sswitch_10
        -0x4d70af51 -> :sswitch_8
        -0x4c2e9ef3 -> :sswitch_7
        -0x4a9f248e -> :sswitch_17
        -0x479893b8 -> :sswitch_8
        -0x476b9835 -> :sswitch_17
        -0x45e3e79d -> :sswitch_0
        -0x418847c8 -> :sswitch_15
        -0x3645eb72 -> :sswitch_12
        -0x30eb3b02 -> :sswitch_f
        -0x2cc6e874 -> :sswitch_16
        -0x2bbc83ff -> :sswitch_3
        -0x2b5c524a -> :sswitch_1
        -0x1ff11689 -> :sswitch_4
        -0x1fc0a9cd -> :sswitch_2
        -0x1be6d1a2 -> :sswitch_c
        -0x1747dcb4 -> :sswitch_b
        -0x16e12857 -> :sswitch_4
        -0x13a9d57a -> :sswitch_16
        -0xe4659c7 -> :sswitch_6
        -0xc80bc1f -> :sswitch_1b
        -0xc789e3a -> :sswitch_14
        -0xab4a2b9 -> :sswitch_1d
        -0x92a1017 -> :sswitch_11
        -0x2ffd3a5 -> :sswitch_5
        0x22c63ce -> :sswitch_1c
        0x306dc36 -> :sswitch_10
        0x69dd981 -> :sswitch_e
        0x7da88c8 -> :sswitch_18
        0xea4d20d -> :sswitch_0
        0x10165def -> :sswitch_f
        0x16dd2c71 -> :sswitch_9
        0x1bdbf300 -> :sswitch_13
        0x2a14415e -> :sswitch_1
        0x2f90663e -> :sswitch_18
        0x3099693d -> :sswitch_a
        0x36ca119c -> :sswitch_1e
        0x39da87b7 -> :sswitch_12
        0x4074204b -> :sswitch_d
        0x4a5f85c6 -> :sswitch_14
        0x4af78937 -> :sswitch_15
        0x4b17e9a4 -> :sswitch_1b
        0x4c6d1a55 -> :sswitch_5
        0x4fb715d5 -> :sswitch_1a
        0x5048e210 -> :sswitch_b
        0x51bd478a -> :sswitch_c
        0x51f75872 -> :sswitch_1d
        0x557bd226 -> :sswitch_19
        0x5b080823 -> :sswitch_19
        0x5d35a49f -> :sswitch_e
        0x63bff932 -> :sswitch_7
        0x6630831c -> :sswitch_a
        0x67b5c78a -> :sswitch_d
        0x6c11110f -> :sswitch_11
        0x751abe09 -> :sswitch_6
        0x78b46074 -> :sswitch_9
    .end sparse-switch
.end method
