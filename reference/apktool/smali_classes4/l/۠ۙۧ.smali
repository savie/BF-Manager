.class public final Ll/۠ۙۧ;
.super Ll/᩶۫ܺ;
.source "12B7"


# static fields
.field private static final ۙ᩹᩵:[S


# instance fields
.field public final synthetic ܰ:Ll/ۚ᩷ۧ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۙۧ;->ۙ᩹᩵:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x26dcs
        0x593cs
        0x5938s
        0x5929s
        0xa8es
        0x3d43s
        0x3dacs
    .end array-data
.end method

.method public constructor <init>(Ll/ۚ᩷ۧ;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    iput-object p1, p0, Ll/۠ۙۧ;->ܰ:Ll/ۚ᩷ۧ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 22

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

    const/4 v15, 0x0

    const v16, -0x6d6ffd5f

    sget v17, Ll/֫ۢ;->ۚ᩻᩵:I

    sget v18, Ll/ۖۙ;->ۤۧۤ:I

    const-string v19, "\u0730\u06e2"

    invoke-static/range {v19 .. v19}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v18, v19

    mul-int/lit8 v19, v19, -0x35

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, 0x5449

    const v21, -0x56d8f5ed

    xor-int v0, v0, v21

    const v21, 0x65b46837

    xor-int v19, v19, v21

    move-object v5, v4

    move-object/from16 v16, v7

    move-object v13, v12

    move-object v15, v14

    move/from16 v20, v19

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, -0x6d6ffd5f

    const/16 v21, 0x0

    move-object v4, v3

    move-object v7, v6

    const/4 v6, 0x0

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v9, v19, v17

    mul-int/lit16 v9, v9, 0x18d3

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v0, v9

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    .line 223
    invoke-static {v2, v5, v4}, Ll/ۗ֫;->ۢ֨֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ;->ۤۡۖ(Ljava/lang/Object;)V

    sget-object v15, Ll/۠ۙۧ;->ۙ᩹᩵:[S

    const/4 v8, 0x4

    .line 14
    sget v0, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz v0, :cond_2

    goto/16 :goto_5

    .line 179
    :sswitch_0
    invoke-static {}, Ll/ۖ֨;->᩷᩻ܶ()I

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_9

    goto/16 :goto_2

    .line 44
    :sswitch_1
    invoke-static {}, Ll/ۘܽ;->֡֡᩸()Z

    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-lez v0, :cond_c

    goto/16 :goto_2

    .line 112
    :sswitch_2
    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_5

    goto/16 :goto_1

    .line 22
    :sswitch_3
    invoke-static {}, Ll/᩶;->ۡ᩶ۜ()I

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_1

    .line 202
    :sswitch_4
    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    return-void

    .line 224
    :sswitch_5
    invoke-static {v1, v6}, Ll/֫֨;->ܿ᩷ܽ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v0, v1}, Ll/ۖۜ;->᩸᩷᩶(Ljava/lang/Object;I)V

    return-void

    .line 223
    :sswitch_6
    invoke-static {v7}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    const v6, 0x7e4cf01d

    xor-int/2addr v6, v0

    .line 45
    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v0, "\u05a1\u1a78"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x2d

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x729f

    const v20, 0x77426208

    xor-int v9, v9, v20

    const v20, 0x21f54eb9

    goto/16 :goto_6

    :sswitch_7
    const/4 v0, 0x3

    .line 223
    invoke-static {v15, v8, v0, v12}, Ll/ۗ᩵;->᩶֡᩺([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ll/֡ᩴ;->ܿᩴ۫()Z

    move-result v0

    if-eqz v0, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x2177

    const v20, -0x33f41735    # -3.6676396E7f

    xor-int v9, v9, v20

    const v20, 0x17473084

    goto/16 :goto_6

    :cond_2
    const-string v0, "\u1a79\u073f"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x51bb

    const v20, -0x7f275287

    xor-int v9, v9, v20

    const v20, 0x5e5f03ad

    goto/16 :goto_6

    :sswitch_8
    const/4 v0, 0x3

    invoke-static {v13, v14, v0, v12}, Ll/֡ᩴ;->ۚ᩹ۡ([SIII)Ljava/lang/String;

    move-result-object v5

    sget v0, Ll/۬;->᩸ۜ᩹:I

    if-eqz v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u06e1\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x13

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x45bf

    const v20, 0x769d36ca

    xor-int v9, v9, v20

    const v20, 0x5281593

    goto/16 :goto_6

    :sswitch_9
    invoke-static {v3}, Ll/ᩴ᩷ۧ;->᩸(Ll/ᩴ᩷ۧ;)Ljava/lang/String;

    move-result-object v4

    sget-object v13, Ll/۠ۙۧ;->ۙ᩹᩵:[S

    const/4 v14, 0x1

    .line 184
    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_4

    :goto_1
    const-string v0, "\u1a73\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x24e5

    const v20, 0x412d01d

    xor-int v9, v9, v20

    const v20, 0x56a9fdc6

    goto/16 :goto_6

    :cond_4
    const-string v0, "\u06db\u06eb"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x23

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x38f3

    const v20, -0x71e5737e

    xor-int v9, v9, v20

    const v20, -0x9f3647b

    goto/16 :goto_6

    .line 223
    :sswitch_a
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-static {v0}, Ll/ۗܶ;->ܿ᩺ܿ(Ljava/lang/Object;)Ll/ᩳ֫ܺ;

    move-result-object v2

    invoke-static {v1}, Ll/ۚ᩷ۧ;->᩸(Ll/ۚ᩷ۧ;)Ll/ᩴ᩷ۧ;

    move-result-object v3

    .line 151
    sget v0, Ll/᩺;->۫۬۫:I

    if-gtz v0, :cond_6

    :cond_5
    :goto_2
    const-string v0, "\u05ab\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0xfab

    const v20, -0x1570a769

    xor-int v9, v9, v20

    const v20, -0x774d61eb

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u073d\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x3391

    const v20, 0x5d9171c1

    xor-int v9, v9, v20

    const v20, 0x5b85c215

    goto/16 :goto_6

    :sswitch_b
    move-object/from16 v0, p0

    .line 221
    iget-object v1, v0, Ll/۠ۙۧ;->ܰ:Ll/ۚ᩷ۧ;

    invoke-static {v1}, Ll/ۚ᩷ۧ;->᩸(Ll/ۚ᩷ۧ;)Ll/ᩴ᩷ۧ;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Ll/֫ܺ;->ۛۗۛ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Ll/ᩴ᩷ۧ;->᩷(Ll/ᩴ᩷ۧ;Ljava/lang/String;)V

    .line 89
    sget v0, Ll/ۘܽ;->᩹ۧۚ:I

    if-gtz v0, :cond_7

    :goto_3
    const-string v0, "\u06df\u1a7a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x51

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x6b19

    const v20, -0x6a5e43a3

    xor-int v9, v9, v20

    const v20, -0x67b48eed

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06e0\u1a7b"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x35

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x44f1

    const v20, 0x639e5d49

    xor-int v9, v9, v20

    const v20, 0x2e1c4d5b

    goto/16 :goto_6

    :sswitch_c
    const/16 v0, 0x2b9d

    const/16 v12, 0x2b9d

    goto :goto_4

    :sswitch_d
    const/16 v0, 0x594a

    const/16 v12, 0x594a

    :goto_4
    const-string v0, "\u06e1\u06e4"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x1d

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x6f33

    const v20, 0x11013307

    xor-int v9, v9, v20

    const v20, -0x4140c961

    goto/16 :goto_6

    :sswitch_e
    const v0, 0xd54a8b9

    add-int/2addr v0, v11

    mul-int/lit16 v9, v10, 0x74d6

    sub-int/2addr v0, v9

    if-ltz v0, :cond_8

    const-string v0, "\u06d8\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x3b51

    const v20, 0x56f96492

    xor-int v9, v9, v20

    const v20, -0x6db7b5bc

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u06ec\u1a75"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x73

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, 0x215f

    const v20, -0x488279f9

    xor-int v9, v9, v20

    const v20, -0x5bac9874

    goto/16 :goto_6

    :sswitch_f
    aget-short v10, v16, v21

    mul-int v11, v10, v10

    .line 24
    sget v0, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v0, :cond_a

    :cond_9
    const-string v0, "\u0730\u073a"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x5453

    const v20, -0xf724b15

    xor-int v9, v9, v20

    const v20, -0x31bb4a3b

    goto :goto_6

    :cond_a
    const-string v0, "\u1a7b\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x5

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, 0x15c3

    const v20, -0x35d99599

    xor-int v9, v9, v20

    const v20, -0x3387f6e

    goto :goto_6

    :sswitch_10
    const/16 v21, 0x0

    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v0, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "\u06e8\u1a76"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x5f7b

    const v20, 0x1faee2f5

    xor-int v9, v9, v20

    const v20, 0xbc5a86e

    goto :goto_6

    :sswitch_11
    sget-object v16, Ll/۠ۙۧ;->ۙ᩹᩵:[S

    sget v0, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v0, :cond_d

    :cond_c
    :goto_5
    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v9, v0, v17

    mul-int/lit16 v9, v9, -0x2e29

    const v20, 0x25aa3526

    xor-int v9, v9, v20

    const v20, -0x6b48cd2f

    goto :goto_6

    :cond_d
    const-string v0, "\u073a\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v9, v0, v18

    mul-int/lit16 v9, v9, -0x7bad

    const v20, 0x70c9bd77

    xor-int v9, v9, v20

    const v20, -0x51da49c9

    :goto_6
    xor-int v20, v0, v20

    move v0, v9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c4d6696 -> :sswitch_f
        -0x6ef56a14 -> :sswitch_c
        -0x6ee2a92f -> :sswitch_d
        -0x6e996460 -> :sswitch_3
        -0x66fa2098 -> :sswitch_6
        -0x60cffe7d -> :sswitch_6
        -0x5e4dee09 -> :sswitch_8
        -0x555e9fd8 -> :sswitch_1
        -0x4c3b182b -> :sswitch_a
        -0x49a79f8f -> :sswitch_0
        -0x4525db90 -> :sswitch_f
        -0x44a0be93 -> :sswitch_d
        -0x353f80af -> :sswitch_10
        -0x29b2c11a -> :sswitch_9
        -0x252feb81 -> :sswitch_11
        -0x1fd0c43a -> :sswitch_2
        -0x1e7ddcaa -> :sswitch_5
        -0x13a8e49d -> :sswitch_3
        -0x120aa1d5 -> :sswitch_9
        -0x7dd425a -> :sswitch_1
        -0x44daf7a -> :sswitch_e
        0xfea2e4 -> :sswitch_8
        0x162652ab -> :sswitch_c
        0x1cc02989 -> :sswitch_2
        0x22e61bbe -> :sswitch_5
        0x2a925bfd -> :sswitch_4
        0x2b915bbb -> :sswitch_e
        0x2f4ce053 -> :sswitch_b
        0x324f8041 -> :sswitch_4
        0x3ab90bac -> :sswitch_7
        0x49848c78 -> :sswitch_0
        0x4d0f56a2 -> :sswitch_10
        0x5522955c -> :sswitch_7
        0x652a2fa6 -> :sswitch_b
        0x6eb0c4de -> :sswitch_a
        0x75f23a8b -> :sswitch_11
    .end sparse-switch
.end method
