.class public final synthetic Ll/ܺ֨᩻;
.super Ljava/lang/Object;
.source "T5M8"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۠ܰۙ:[S


# instance fields
.field public final synthetic ܰ:Lorg/json/JSONObject;

.field public final synthetic ܿ:J

.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x16

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺ֨᩻;->۠ܰۙ:[S

    return-void

    :array_0
    .array-data 2
        0xabbs
        -0x35e4s
        -0x35ffs
        -0x35e9s
        -0x35eas
        -0x35ffs
        -0x35c6s
        -0x35e9s
        -0x35ecs
        -0x35eas
        -0x35f9s
        -0x35e0s
        -0x35f9s
        -0x35ffs
        -0x35e6s
        -0x35e3s
        -0x35ecs
        -0x35a5s
        -0x35a3s
        -0x35a3s
        -0x35a3s
        -0x35a6s
    .end array-data
.end method

.method public synthetic constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;J)V
    .locals 6

    const v0, 0x5f423e0c

    sget v1, Ll/֫۠;->ۢᩴ᩺:I

    sget v2, Ll/֡ܳ;->֨ᩳۢ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0730\u073a"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7c45

    const v5, 0xaa1444f

    xor-int/2addr v4, v5

    const v5, 0x65e0a478

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3b81

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ܺ֨᩻;->ܰ:Lorg/json/JSONObject;

    iput-object p2, p0, Ll/ܺ֨᩻;->᩶:Ljava/lang/String;

    sget v3, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    sget v3, Ll/ۖ֡;->ۚۛᩳ:I

    if-lez v3, :cond_4

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    sget v3, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v3, :cond_a

    goto/16 :goto_2

    .line 1
    :sswitch_2
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-lez v3, :cond_8

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-wide p3, p0, Ll/ܺ֨᩻;->ܿ:J

    return-void

    .line 4
    :sswitch_6
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u05a8\u1a78"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b29

    const v5, 0x4415205b

    xor-int/2addr v4, v5

    const v5, -0x7f183a31

    goto :goto_0

    :cond_0
    const-string v3, "\u06e4\u1a7b"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x13d

    const v5, 0x2414875

    xor-int/2addr v4, v5

    const v5, 0x44bcafb3

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e4\u06db"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x25a5

    const v5, 0x45039ed1

    xor-int/2addr v4, v5

    const v5, -0x6f58a4b3

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/ۖ᩹;->۫ܽۗ:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a77\u06d7"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ba9

    const v5, 0x66e83a08

    xor-int/2addr v4, v5

    const v5, -0x5a3352a2

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3a97

    const v5, -0x33f8a520    # -3.5482496E7f

    xor-int/2addr v4, v5

    const v5, 0x4aa41f9b    # 5377997.5f

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v3, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u1a79\u06e1"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1bd5

    const v5, -0x643bf514

    xor-int/2addr v4, v5

    const v5, -0x186a3018

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x575d

    const v5, -0x126dade6

    xor-int/2addr v4, v5

    const v5, -0x73645afb

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u1a77\u1a73"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x13bf

    const v5, -0x468df383

    xor-int/2addr v4, v5

    const v5, 0x7480db0c

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x39a1

    const v5, -0x1c29ffae

    xor-int/2addr v4, v5

    const v5, -0x4ebb7244

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7d07

    const v5, -0x2ad36a45

    xor-int/2addr v4, v5

    const v5, 0x340def1b

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073a\u06d6"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x79b7

    const v5, -0x7b1ca439

    xor-int/2addr v4, v5

    const v5, 0x5c4285e

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06eb\u06e8"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x476d

    const v5, -0x64cd7cde

    xor-int/2addr v4, v5

    const v5, -0x5ac7c27e

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3925

    const v5, -0x730db732

    xor-int/2addr v4, v5

    const v5, -0xda1118b

    goto/16 :goto_0

    :goto_4
    const-string v3, "\u1a73\u06ec"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x11d7

    const v5, -0x5992c42d

    xor-int/2addr v4, v5

    const v5, 0x5fde0d74

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073f\u1a76"

    invoke-static {v3}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6a7f

    const v5, -0x17d37bb8

    xor-int/2addr v4, v5

    const v5, 0x54260484

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5b9b3fd5 -> :sswitch_8
        -0x595af020 -> :sswitch_0
        -0x5159b50a -> :sswitch_7
        -0x4eb6c4b9 -> :sswitch_4
        -0x4795a436 -> :sswitch_d
        -0x4600e02a -> :sswitch_1
        -0x44aa08bf -> :sswitch_0
        -0x3abb5227 -> :sswitch_d
        -0x359d223b -> :sswitch_2
        -0x31b5e2ed -> :sswitch_3
        -0x305b3b46 -> :sswitch_e
        -0x2e094a9e -> :sswitch_5
        -0x256c1134 -> :sswitch_6
        -0x1a51f7e2 -> :sswitch_a
        -0x16a31207 -> :sswitch_e
        -0x5903517 -> :sswitch_a
        -0x48fc6da -> :sswitch_b
        0x12b5899a -> :sswitch_c
        0x136ff6f0 -> :sswitch_7
        0x13cb7e23 -> :sswitch_8
        0x15e95e5b -> :sswitch_4
        0x1751c294 -> :sswitch_2
        0x18dcdb1d -> :sswitch_9
        0x24902fb6 -> :sswitch_b
        0x32bb2086 -> :sswitch_9
        0x3ed76fe3 -> :sswitch_c
        0x53cd18bc -> :sswitch_5
        0x5a4af67e -> :sswitch_6
        0x5d32c15a -> :sswitch_3
        0x7fb02ac8 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 25

    move-object/from16 v0, p0

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

    const v17, -0x1f489b03

    sget v18, Ll/֨ۢ;->۬ܿܺ:I

    sget v19, Ll/ۗܰ;->ܶۜ۬:I

    const-string v20, "\u06e1\u1a74"

    invoke-static/range {v20 .. v20}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v20

    add-int v20, v20, v18

    mul-int/lit8 v20, v20, 0x1b

    xor-int v1, v20, v19

    mul-int/lit16 v1, v1, -0x3b75

    const v22, -0x379cedad

    xor-int v1, v1, v22

    const v22, 0x21c79292

    xor-int v20, v20, v22

    move-object/from16 v16, v4

    move-object v12, v11

    move-object v15, v14

    move/from16 v21, v20

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const v20, -0x1f489b03

    const/16 v22, 0x0

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v7, v20, v19

    mul-int/lit16 v7, v7, -0x1b61

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v1, v7

    xor-int v20, v21, v1

    sparse-switch v20, :sswitch_data_0

    .line 66
    invoke-static {v3, v2}, Ll/ۗ᩶;->ᩳᩳۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget-object v15, Ll/ܺ֨᩻;->۠ܰۙ:[S

    const/16 v5, 0x8

    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    .line 138
    :sswitch_0
    sget v1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v1, :cond_0

    :goto_1
    move/from16 v1, v22

    goto/16 :goto_7

    :cond_0
    move/from16 v21, v5

    move/from16 v1, v22

    goto/16 :goto_a

    :sswitch_1
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖۗ;->۫֡ܺ()I

    move-result v1

    if-gtz v1, :cond_2

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v1

    if-gez v1, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v21, v5

    goto/16 :goto_8

    .line 95
    :sswitch_3
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    goto :goto_1

    .line 56
    :sswitch_4
    invoke-static {}, Ll/ۘ۟;->ۤۢ۟()Z

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    return-void

    .line 66
    :sswitch_5
    invoke-static {v15, v5, v6, v11}, Ll/֡᩻;->ܺܽ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Ll/֡۟;->ۧۧ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 167
    new-instance v1, Ljava/lang/Thread;

    .line 61
    sget-boolean v7, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v7, :cond_3

    :cond_2
    const-string v1, "\u1a74\u0733"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v19

    mul-int/lit16 v7, v7, 0x11d1

    const v21, -0x64fc6f5

    xor-int v7, v7, v21

    const v21, 0x15853cd7

    goto :goto_3

    .line 187
    :cond_3
    new-instance v7, Ll/ۧ֨᩻;

    move/from16 v21, v5

    iget-object v5, v0, Ll/ܺ֨᩻;->᩶:Ljava/lang/String;

    sget v23, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v23, :cond_4

    :goto_2
    move/from16 v5, v21

    goto :goto_1

    :cond_4
    iget-wide v2, v0, Ll/ܺ֨᩻;->ܿ:J

    invoke-direct {v7, v5, v4, v2, v3}, Ll/ۧ֨᩻;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 167
    invoke-direct {v1, v7}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 187
    invoke-static {v1}, Ll/ۗ֫;->ۚ᩻᩷(Ljava/lang/Object;)V

    return-void

    :sswitch_6
    move/from16 v21, v5

    const/16 v6, 0xe

    .line 136
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    const-string v1, "\u0733\u06e8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x1f

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x2a47

    const v7, 0x17e46c19

    xor-int/2addr v5, v7

    const v7, -0x6e1be0a6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06d8\u06d9"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v19

    mul-int/lit16 v7, v7, 0x5ccd

    const v21, -0x4a29e637

    xor-int v7, v7, v21

    const v21, -0x260e3250

    :goto_3
    xor-int v21, v1, v21

    move v1, v7

    goto/16 :goto_0

    :sswitch_7
    move/from16 v21, v5

    .line 66
    invoke-static {v12, v13, v14, v11}, Ll/ۖᩳ;->ܺ᩵᩻([SIII)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Ll/ܺ֨᩻;->ܰ:Lorg/json/JSONObject;

    .line 166
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_7

    :goto_4
    const-string v1, "\u06eb\u1a77"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x2fcb

    const v7, 0x40080eb6

    xor-int/2addr v5, v7

    const v7, 0x5af72460

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u05a1\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x7801

    const v7, 0x675fb0e6

    xor-int/2addr v5, v7

    const v7, 0x2de8d6f4

    goto/16 :goto_6

    :sswitch_8
    move/from16 v21, v5

    const/4 v14, 0x7

    sget v1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz v1, :cond_8

    goto/16 :goto_2

    :cond_8
    const-string v1, "\u0730\u06ec"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x63

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, -0x755

    const v7, 0x7f310477

    xor-int/2addr v5, v7

    const v7, -0x68e99a47

    goto/16 :goto_6

    :sswitch_9
    move/from16 v21, v5

    .line 66
    sget-object v1, Ll/ۗ֨᩻;->ۙ:Ll/ܽ᩻ۙ;

    sget-object v12, Ll/ܺ֨᩻;->۠ܰۙ:[S

    const/4 v13, 0x1

    .line 103
    sget v1, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v1, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v1, "\u1a73\u06eb"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x17

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x7b81

    const v7, -0x170a8651

    xor-int/2addr v5, v7

    const v7, -0x2c8e4f65

    goto :goto_6

    :sswitch_a
    move/from16 v21, v5

    const/16 v1, 0x5d05

    const/16 v11, 0x5d05

    goto :goto_5

    :sswitch_b
    move/from16 v21, v5

    const v1, 0xca73

    const v11, 0xca73

    :goto_5
    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x4931

    const v7, -0x48e2de3a

    xor-int/2addr v5, v7

    const v7, -0x16885c8c

    goto :goto_6

    :sswitch_c
    move/from16 v21, v5

    mul-int v1, v10, v10

    sub-int/2addr v1, v9

    if-gez v1, :cond_a

    const-string v1, "\u1a7b\u06e1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x4d

    xor-int v5, v1, v19

    mul-int/lit16 v5, v5, 0x4d7b

    const v7, -0x30026930

    xor-int/2addr v5, v7

    const v7, -0x798b7da3

    goto :goto_6

    :cond_a
    const-string v1, "\u1a79\u1a75"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v5, v1, v18

    mul-int/lit16 v5, v5, 0x5743

    const v7, -0x5457109e

    xor-int/2addr v5, v7

    const v7, -0x565e7bcf

    :goto_6
    xor-int/2addr v1, v7

    move/from16 v24, v21

    move/from16 v21, v1

    move v1, v5

    move/from16 v5, v24

    goto/16 :goto_0

    :sswitch_d
    move/from16 v21, v5

    mul-int v9, v22, v8

    move/from16 v1, v22

    add-int/lit16 v10, v1, 0x15a9

    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_b

    move/from16 v5, v21

    :goto_7
    const-string v7, "\u06d7\u05a1"

    invoke-static {v7}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v19

    mul-int/lit8 v7, v7, 0x3

    xor-int v0, v7, v18

    mul-int/lit16 v0, v0, -0x2285

    const v21, -0x4419353c

    xor-int v0, v0, v21

    const v21, 0x70ab4bf7

    xor-int v21, v7, v21

    move/from16 v22, v1

    move v1, v0

    goto/16 :goto_d

    :cond_b
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x57

    xor-int v5, v0, v19

    mul-int/lit16 v5, v5, 0x7d8f

    const v7, -0x5e2e1855

    xor-int/2addr v5, v7

    const v7, 0x5048593f

    goto/16 :goto_b

    :sswitch_e
    move/from16 v21, v5

    aget-short v22, v16, v17

    const/16 v8, 0x56a4

    .line 135
    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u06eb\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x6a27

    const v5, -0x75290111

    xor-int/2addr v1, v5

    const v5, 0x66c637d7

    goto :goto_9

    :cond_c
    const-string v0, "\u06e2\u06df"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x65fd

    const v5, 0x619377ea

    xor-int/2addr v1, v5

    const v5, -0x5f977420

    :goto_9
    xor-int/2addr v0, v5

    goto :goto_c

    :sswitch_f
    move/from16 v21, v5

    move/from16 v1, v22

    sget-object v16, Ll/ܺ֨᩻;->۠ܰۙ:[S

    const/16 v17, 0x0

    invoke-static {}, Ll/֡۟;->ۚۙܺ()I

    move-result v0

    if-gtz v0, :cond_d

    :goto_a
    const-string v0, "\u06e7\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x49

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, 0x241b

    const v7, 0x47f26d67

    xor-int/2addr v5, v7

    const v7, 0x5a2fb301

    goto :goto_b

    :cond_d
    const-string v0, "\u06e1\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x6f

    xor-int v5, v0, v18

    mul-int/lit16 v5, v5, -0x75fb

    const v7, -0x550abc6a

    xor-int/2addr v5, v7

    const v7, -0x42c2392b

    :goto_b
    xor-int/2addr v0, v7

    move/from16 v22, v1

    move v1, v5

    :goto_c
    move/from16 v5, v21

    move/from16 v21, v0

    :goto_d
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e6e7d9c -> :sswitch_0
        -0x66c330a6 -> :sswitch_1
        -0x64db487a -> :sswitch_d
        -0x4f2ca1bb -> :sswitch_7
        -0x48a26208 -> :sswitch_3
        -0x37889b2d -> :sswitch_4
        -0x311faf00 -> :sswitch_2
        -0x2f6df124 -> :sswitch_1
        -0x20639352 -> :sswitch_c
        -0x1d100fbd -> :sswitch_a
        -0x10a9f37d -> :sswitch_5
        -0xebe3cd4 -> :sswitch_7
        -0xdc3a5cb -> :sswitch_8
        -0x9d0e9b6 -> :sswitch_2
        -0x55d7be6 -> :sswitch_e
        -0x4b14406 -> :sswitch_9
        -0x278545a -> :sswitch_3
        -0x25baf5c -> :sswitch_0
        0x8b71f9 -> :sswitch_5
        0x13ea9ee -> :sswitch_9
        0x223e0cb -> :sswitch_f
        0x2974059 -> :sswitch_6
        0x9b6a2dc -> :sswitch_8
        0x109b52ed -> :sswitch_f
        0x11c4ad4f -> :sswitch_e
        0x18600f13 -> :sswitch_4
        0x1a432ed3 -> :sswitch_d
        0x3f50d97f -> :sswitch_c
        0x41eb778b -> :sswitch_b
        0x45c3b9d3 -> :sswitch_6
        0x7a9dba9f -> :sswitch_b
        0x7abbab67 -> :sswitch_a
    .end sparse-switch
.end method
