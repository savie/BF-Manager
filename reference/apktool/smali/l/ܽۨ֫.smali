.class public final Ll/ܽۨ֫;
.super Ljava/lang/Object;
.source "Z43S"


# static fields
.field public static final ۙ:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x82

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    .line 806
    invoke-static {}, Ll/ܽۨ֫;->ۙ()[B

    move-result-object v0

    sput-object v0, Ll/ܽۨ֫;->ۙ:[B

    return-void
.end method

.method public static ۙ([BI)V
    .locals 22
    .annotation build Ll/ܰ᩺ۤ;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

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

    const v16, -0x4d28262

    sget v17, Ll/ۗ֡;->ۜ᩻۫:I

    sget v18, Ll/ۗ᩺;->֡ۙۜ:I

    const-string v19, "\u073a\u06df"

    invoke-static/range {v19 .. v19}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v2, v19, v17

    mul-int/lit16 v2, v2, -0x2067

    const v21, 0x37452b28

    xor-int v2, v2, v21

    const v21, -0x74ea04e2

    xor-int v19, v19, v21

    move/from16 v20, v19

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

    const v19, -0x4d28262

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, 0x38f3

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v2, v3

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    .line 830
    sget-object v2, Ll/ܽۨ֫;->ۙ:[B

    aget-byte v2, v2, v12

    xor-int v13, v6, v2

    sget v2, Ll/ۗ᩸;->ۧ۫ᩴ:I

    if-gtz v2, :cond_3

    goto/16 :goto_4

    .line 45
    :sswitch_0
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v2, :cond_0

    goto :goto_1

    .line 737
    :sswitch_1
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v2, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v2, :cond_8

    goto/16 :goto_9

    .line 725
    :sswitch_2
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    sget v2, Ll/֨ۖ;->ۜۜۖ:I

    if-nez v2, :cond_e

    goto :goto_1

    .line 248
    :sswitch_3
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    :goto_1
    const-string v2, "\u073a\u1a79"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x46d5

    const v20, -0x73aa1172

    xor-int v3, v3, v20

    const v20, 0x5efb4b00

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۗܰ;->ۢۚܿ()I

    return-void

    .line 826
    :sswitch_5
    aput-byte v16, v0, v4

    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v21

    goto/16 :goto_6

    :sswitch_6
    aget-byte v2, v0, v4

    xor-int/2addr v2, v15

    int-to-byte v2, v2

    .line 600
    sget v3, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v3, :cond_1

    move/from16 v16, v2

    :cond_0
    const-string v2, "\u05ab\u1a75"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x47

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x6b0f

    const v20, 0x2e671ba2

    xor-int v3, v3, v20

    const v20, 0x6c0d494d

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u0733\u1a7a"

    invoke-static {v3}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, 0x19

    move/from16 v16, v2

    xor-int v2, v3, v18

    mul-int/lit16 v2, v2, 0x15ff

    const v20, -0x24a85dd7

    xor-int v2, v2, v20

    const v20, 0x55fcee43

    xor-int v20, v3, v20

    goto/16 :goto_0

    :sswitch_7
    const/16 v2, 0xa7

    const/16 v15, 0xa7

    goto :goto_2

    :sswitch_8
    const/16 v2, 0xa8

    const/16 v15, 0xa8

    :goto_2
    const-string v2, "\u06dc\u06dc"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x1f

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x366b

    const v20, 0x2a3226e6

    xor-int v3, v3, v20

    const v20, 0x353c4422

    goto/16 :goto_5

    .line 830
    :sswitch_9
    aput-byte v14, v0, v5

    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v21

    goto/16 :goto_7

    :sswitch_a
    int-to-byte v14, v13

    sget v2, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v2, :cond_2

    goto :goto_3

    :cond_2
    const-string v2, "\u0730\u1a73"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x41

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x40d

    const v20, 0x4b195d01    # 1.0050817E7f

    xor-int v3, v3, v20

    const v20, 0x650325c

    goto/16 :goto_5

    :cond_3
    const-string v2, "\u1a74\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0x6a43

    const v20, 0x3a40d5b7

    xor-int v3, v3, v20

    const v20, -0x685dea42

    goto/16 :goto_5

    :sswitch_b
    rem-int v12, v10, v11

    sget v2, Ll/֨ۢ;->۬ܿܺ:I

    if-ltz v2, :cond_4

    :goto_3
    const-string v2, "\u06e8\u06e8"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0xd

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0xe59

    const v20, 0x1f3a5744

    xor-int v3, v3, v20

    const v20, 0x5cf6cfb6

    goto/16 :goto_5

    :cond_4
    const-string v2, "\u1a7b\u06e8"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0x3f7

    const v20, -0x84ebb80

    xor-int v3, v3, v20

    const v20, 0x72dee822

    goto/16 :goto_5

    :sswitch_c
    div-int v10, v8, v9

    const/16 v11, 0x8

    sget v2, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v2, :cond_5

    goto :goto_4

    :cond_5
    const-string v2, "\u06e0\u1a79"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, 0x6b

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x2167

    const v20, 0x76a3b358

    xor-int v3, v3, v20

    const v20, 0x767aab44

    goto/16 :goto_5

    :sswitch_d
    const/16 v9, 0x9

    sget v2, Ll/֨ᩳ;->ۚ֫ۛ:I

    if-eqz v2, :cond_6

    goto :goto_4

    :cond_6
    const-string v2, "\u06da\u06e1"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x4f

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0x1805

    const v20, 0x2027a536

    xor-int v3, v3, v20

    const v20, -0x1203618b

    goto/16 :goto_5

    :sswitch_e
    mul-int v8, v5, v7

    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_4

    :cond_7
    const-string v2, "\u06dc\u1a77"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x5e9

    const v20, 0x3594f26a

    xor-int v3, v3, v20

    const v20, -0x4db04b09

    goto/16 :goto_5

    :sswitch_f
    aget-byte v6, v0, v5

    const/16 v7, 0x1f

    .line 419
    sget v2, Ll/֫֡;->֫ۙۖ:I

    if-gtz v2, :cond_9

    :cond_8
    :goto_4
    const-string v2, "\u06d6\u06df"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x47

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x4959

    const v20, 0x3145b0ee

    xor-int v3, v3, v20

    const v20, -0x65abeaf9

    goto/16 :goto_5

    :cond_9
    const-string v2, "\u06e4\u1a7b"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x59

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x7fff

    const v20, -0x544c1e04

    xor-int v3, v3, v20

    const v20, -0x7fb25a0

    goto/16 :goto_5

    .line 824
    :sswitch_10
    rem-int/lit8 v2, v4, 0x2

    if-nez v2, :cond_a

    const-string v2, "\u06db\u1a7b"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x3ec1

    const v20, -0x4bd71d82

    xor-int v3, v3, v20

    const v20, 0x528238d5

    goto :goto_5

    :cond_a
    const-string v2, "\u06dc\u1a7a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x2c9d

    const v20, 0x41b76663

    xor-int v3, v3, v20

    const v20, 0xb4565f2

    goto :goto_5

    :sswitch_11
    return-void

    :sswitch_12
    if-ge v5, v1, :cond_b

    const-string v2, "\u1a78\u06da"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x2479

    const v20, 0x638062d6

    xor-int v3, v3, v20

    const v20, -0x582ae2b8

    goto :goto_5

    :sswitch_13
    if-ge v4, v1, :cond_b

    const-string v2, "\u1a79\u06db"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0xea7

    const v20, 0x140dcc5c

    xor-int v3, v3, v20

    const v20, -0x144f528e

    goto :goto_5

    :cond_b
    const-string v2, "\u06d7\u06db"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, 0x5

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x2133

    const v20, -0x1daccc19    # -9.7400074E20f

    xor-int v3, v3, v20

    const v20, -0x578ba9b2

    :goto_5
    xor-int v20, v2, v20

    goto/16 :goto_b

    :sswitch_14
    move/from16 v2, v21

    .line 822
    invoke-static {v2, v0}, Ll/֨ۨ;->᩵ܿۢ(ILjava/lang/Object;)I

    move-result v3

    const v0, -0x5d20323d

    if-ne v3, v0, :cond_c

    move v4, v2

    :goto_6
    const-string v0, "\u0736\u06ec"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7b

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x1f51

    const v20, -0x1b55c291

    xor-int v3, v3, v20

    const v20, 0x672ac9ac

    goto :goto_a

    :cond_c
    move v5, v2

    :goto_7
    const-string v0, "\u06e1\u06da"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x4d75

    const v20, 0x6a4cb5a0

    xor-int v3, v3, v20

    const v20, -0x7a834abd

    goto :goto_a

    :sswitch_15
    const/16 v21, 0x0

    .line 268
    invoke-static {}, Ll/֨ܿ;->ܰ֫᩵()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u06d6\u1a76"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x23

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0x9bd

    const v3, 0x149dc2bb

    xor-int/2addr v2, v3

    const v3, -0x30bf8139

    :goto_8
    xor-int v20, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_16
    move/from16 v2, v21

    .line 223
    sget v0, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v0, :cond_f

    move/from16 v21, v2

    :cond_e
    :goto_9
    const-string v0, "\u0733\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0x36b1

    const v3, -0x216e33bf

    xor-int/2addr v2, v3

    const v3, 0x20400c17

    goto :goto_8

    :cond_f
    const-string v0, "\u06d9\u06e2"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x6bd1

    const v20, -0x51afaede

    xor-int v3, v3, v20

    const v20, -0x1dd61740

    :goto_a
    xor-int v20, v0, v20

    move-object/from16 v0, p0

    move/from16 v21, v2

    :goto_b
    move v2, v3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72ce2118 -> :sswitch_0
        -0x6b329f91 -> :sswitch_10
        -0x597f62ab -> :sswitch_1
        -0x581914f4 -> :sswitch_13
        -0x52c756f8 -> :sswitch_2
        -0x528c9989 -> :sswitch_d
        -0x4fe75ed1 -> :sswitch_5
        -0x46f8c389 -> :sswitch_9
        -0x42766a6c -> :sswitch_4
        -0x420b2f2c -> :sswitch_15
        -0x3ee7169e -> :sswitch_c
        -0x3b7c0d8a -> :sswitch_1
        -0x386de694 -> :sswitch_7
        -0x3414803a -> :sswitch_4
        -0x30633620 -> :sswitch_3
        -0x2aae0adb -> :sswitch_e
        -0x1f84beb1 -> :sswitch_3
        -0x1b6656ba -> :sswitch_8
        -0x19f0c7c6 -> :sswitch_b
        -0x1731cdd6 -> :sswitch_c
        -0x15aafb4f -> :sswitch_14
        -0x5b837db -> :sswitch_14
        0x3f1c467 -> :sswitch_11
        0x46fb55a -> :sswitch_10
        0x5a64d22 -> :sswitch_8
        0xfcd862d -> :sswitch_12
        0x106ca7e3 -> :sswitch_12
        0x1722b52c -> :sswitch_f
        0x1c1e84e2 -> :sswitch_2
        0x1e05d342 -> :sswitch_16
        0x20aaff56 -> :sswitch_9
        0x275f9555 -> :sswitch_d
        0x2f40f0e3 -> :sswitch_0
        0x32c6e893 -> :sswitch_f
        0x381fd8c5 -> :sswitch_6
        0x399bf408 -> :sswitch_5
        0x3bd8e924 -> :sswitch_b
        0x3eed32f2 -> :sswitch_6
        0x3f28886c -> :sswitch_16
        0x413b9567 -> :sswitch_11
        0x57ce9374 -> :sswitch_13
        0x64cfcb85 -> :sswitch_e
        0x700b2ebf -> :sswitch_7
        0x71ed5598 -> :sswitch_a
        0x7739fd50 -> :sswitch_15
        0x787d0cf3 -> :sswitch_a
    .end sparse-switch
.end method

.method public static native ۙ()[B
.end method

.method public static ᩷([BI)V
    .locals 18
    .annotation build Ll/ܰ᩺ۤ;
    .end annotation

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

    const v11, 0x36ddb4d5

    sget v12, Ll/֫֡;->֫ۙۖ:I

    sget v13, Ll/ۗۖ;->ۙ᩶֨:I

    const-string v14, "\u06e4\u0730"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x79fb

    const v16, 0x29a9d0ec

    xor-int v15, v15, v16

    const v16, 0x74184759

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x75b1

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move/from16 v14, p1

    move/from16 v16, v0

    .line 561
    sget v0, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v0, :cond_d

    goto/16 :goto_9

    .line 354
    :sswitch_0
    invoke-static {}, Ll/֨ۢ;->ۘܳۘ()Z

    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    move-result v14

    if-eqz v14, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_2
    move/from16 v14, p1

    move/from16 v16, v0

    goto/16 :goto_8

    .line 745
    :sswitch_1
    sget v14, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v14, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_3
    move/from16 v14, p1

    move/from16 v16, v0

    goto/16 :goto_9

    .line 329
    :sswitch_2
    invoke-static {}, Ll/ۗ֡;->֨ۙ᩷()I

    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v14

    if-lez v14, :cond_9

    goto/16 :goto_4

    .line 828
    :sswitch_3
    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    goto/16 :goto_4

    .line 611
    :sswitch_4
    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    return-void

    .line 838
    :sswitch_5
    aput-byte v10, p0, v0

    add-int/lit8 v0, v0, 0x1

    move/from16 v14, p1

    goto/16 :goto_6

    :sswitch_6
    int-to-byte v10, v9

    .line 540
    sget v14, Ll/ۗۖ;->ۙ᩶֨:I

    if-gtz v14, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v14, "\u06e4\u06e8"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x3b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6f53

    const v16, 0x1e78e90b

    xor-int v15, v15, v16

    const v16, -0x2c5d78ee

    goto :goto_0

    :sswitch_7
    xor-int v9, v1, v8

    .line 544
    invoke-static {}, Ll/֨ۨ;->ۨܽۖ()Z

    move-result v14

    if-nez v14, :cond_3

    goto :goto_2

    :cond_3
    const-string v14, "\u1a79\u06e0"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x75

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1c71

    const v16, -0x37e4fccb

    xor-int v15, v15, v16

    const v16, 0x255bd823

    goto/16 :goto_0

    .line 838
    :sswitch_8
    sget-object v8, Ll/ܽۨ֫;->ۙ:[B

    aget-byte v8, v8, v7

    sget v14, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v14, :cond_4

    goto :goto_2

    :cond_4
    const-string v14, "\u06d9\u073f"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1e91

    const v16, -0x51bc0b25

    xor-int v15, v15, v16

    const v16, 0x787c16cb

    goto/16 :goto_0

    :sswitch_9
    rem-int v7, v5, v6

    .line 271
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v14

    if-gtz v14, :cond_5

    const-string v14, "\u1a7b\u06da"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x7893

    const v16, 0x42cc882e

    xor-int v15, v15, v16

    const v16, 0x5ee550fc

    goto/16 :goto_0

    :cond_5
    const-string v14, "\u06d8\u073d"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x1d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x28e7

    const v16, -0x61f744ee

    xor-int v15, v15, v16

    const v16, -0x37e55ec4

    goto/16 :goto_0

    .line 838
    :sswitch_a
    div-int v5, v3, v4

    const/16 v6, 0x8

    .line 403
    sget v14, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v14, :cond_6

    :goto_4
    const-string v14, "\u1a79\u06ec"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, -0x3d

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1c13

    const v16, -0xb89f140

    xor-int v15, v15, v16

    const v16, -0x3be79d50

    goto/16 :goto_0

    :cond_6
    const-string v14, "\u06e7\u06e1"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x7531

    const v16, -0x713d5f7b

    xor-int v15, v15, v16

    const v16, -0x345a08c5    # -2.1753462E7f

    goto/16 :goto_0

    :sswitch_b
    const/16 v4, 0x9

    .line 378
    sget v14, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v14, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v14, "\u1a75\u06e4"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x2d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x1fd5

    const v16, -0x2adb6a47

    xor-int v15, v15, v16

    const v16, 0x1a976bf8

    goto/16 :goto_0

    :sswitch_c
    mul-int v3, v0, v2

    sget-boolean v14, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v14, :cond_8

    goto :goto_5

    :cond_8
    const-string v14, "\u06dc\u1a76"

    invoke-static {v14}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x5b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x503d

    const v16, -0x11cda25c

    xor-int v15, v15, v16

    const v16, 0x49daaabe    # 1791319.8f

    goto/16 :goto_0

    .line 838
    :sswitch_d
    aget-byte v1, p0, v0

    const/16 v2, 0x1f

    .line 145
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v14

    if-gtz v14, :cond_a

    :cond_9
    :goto_5
    const-string v14, "\u1a7a\u1a77"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x2b

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x314d

    const v16, 0x1569d07a

    xor-int v15, v15, v16

    const v16, -0x2831b1ab

    goto/16 :goto_0

    :cond_a
    const-string v14, "\u1a75\u1a74"

    invoke-static {v14}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x6a15

    const v16, 0x4d9952cb    # 3.215425E8f

    xor-int v15, v15, v16

    const v16, -0x700b03de

    goto/16 :goto_0

    :sswitch_e
    return-void

    :sswitch_f
    move/from16 v14, p1

    if-ge v0, v14, :cond_b

    const-string v15, "\u1a75\u05a1"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move/from16 v16, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, 0x8bf

    const v17, 0x303a351b

    xor-int v0, v0, v17

    const v17, -0x9893402

    goto :goto_7

    :cond_b
    move/from16 v16, v0

    const-string v0, "\u06df\u05a1"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x1f5f

    const v17, 0x327abd43

    xor-int v15, v15, v17

    const v17, 0x6099f902

    goto/16 :goto_a

    :sswitch_10
    move/from16 v14, p1

    const/4 v0, 0x0

    :goto_6
    const-string v15, "\u06df\u06da"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v12, v15

    mul-int/lit8 v15, v15, 0x33

    move/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0x503f

    const v17, 0x2e570385

    xor-int v0, v0, v17

    const v17, 0xb21338c

    :goto_7
    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto :goto_b

    :sswitch_11
    move/from16 v14, p1

    move/from16 v16, v0

    sget v0, Ll/֡᩵;->ۤܳ۬:I

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u06e1\u06d7"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x6ac1

    const v17, 0x19524aae

    xor-int v15, v15, v17

    const v17, 0x2afb52e2

    goto :goto_a

    :cond_c
    const-string v0, "\u1a7b\u06dc"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1c89

    const v17, -0x1a3e2ac8

    xor-int v15, v15, v17

    const v17, -0x675b8627

    goto :goto_a

    :goto_9
    const-string v0, "\u06e8\u06df"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x35

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x7ca9

    const v17, 0x24370973

    xor-int v15, v15, v17

    const v17, -0x33b67736    # -5.2831016E7f

    goto :goto_a

    :cond_d
    const-string v0, "\u05ab\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x4f

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x202f

    const v17, -0x1120ba05

    xor-int v15, v15, v17

    const v17, -0x44adcb04

    :goto_a
    xor-int v0, v0, v17

    move v14, v0

    :goto_b
    move/from16 v0, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aedebd5 -> :sswitch_2
        -0x7a3d6bd4 -> :sswitch_6
        -0x6c082e99 -> :sswitch_9
        -0x6a93b051 -> :sswitch_f
        -0x67e54987 -> :sswitch_8
        -0x5f2f8163 -> :sswitch_e
        -0x51d8f74c -> :sswitch_d
        -0x4d8eea4a -> :sswitch_b
        -0x3ce36b53 -> :sswitch_3
        -0x3a189b9e -> :sswitch_5
        -0x39698d6f -> :sswitch_c
        -0x330f7b4b -> :sswitch_d
        -0x2e397dcc -> :sswitch_10
        -0x2cf704ce -> :sswitch_b
        -0x20eefeb1 -> :sswitch_f
        -0x1e753a8e -> :sswitch_9
        -0x1e51f568 -> :sswitch_1
        -0xe11369b -> :sswitch_11
        -0xde7a5fd -> :sswitch_c
        -0x30eb121 -> :sswitch_a
        0x57e6c57 -> :sswitch_11
        0xa59544e -> :sswitch_0
        0x1787ab6f -> :sswitch_0
        0x30e7e2a9 -> :sswitch_4
        0x311d0d61 -> :sswitch_7
        0x35a06df3 -> :sswitch_2
        0x38cbd926 -> :sswitch_e
        0x3bd0386a -> :sswitch_6
        0x46df214f -> :sswitch_10
        0x4d9b4856 -> :sswitch_7
        0x5aaa9c78 -> :sswitch_4
        0x71df6657 -> :sswitch_5
        0x71e90f9e -> :sswitch_8
        0x72a97472 -> :sswitch_1
        0x7bc82708 -> :sswitch_3
        0x7f38ab6d -> :sswitch_a
    .end sparse-switch
.end method
