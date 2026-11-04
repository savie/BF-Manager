.class public final synthetic Ll/۬۟֫;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۤ۟ܶ:[S


# instance fields
.field public final synthetic ܰ:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬۟֫;->ۤ۟ܶ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x132cs
        0x6ed7s
        -0x72das
        0x46b3s
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۬۟֫;->ܰ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

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

    const v12, 0x7cf06363

    sget v13, Ll/ۖ֡;->ۚۛᩳ:I

    sget v14, Ll/֫֡;->֫ۙۖ:I

    const-string v15, "\u0733\u06dc"

    invoke-static {v15}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x6f

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x7843

    const v17, -0x2d5b3fb3

    xor-int v0, v0, v17

    const v17, -0x4062c838

    xor-int v15, v15, v17

    move-object v3, v2

    move-object v11, v10

    move/from16 v16, v15

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, 0x7cf06363

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0xb6d

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move/from16 v16, v1

    const/16 v0, 0x1ea0

    const/16 v10, 0x1ea0

    goto/16 :goto_2

    .line 501
    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۡܺ()I

    move-result v0

    if-nez v0, :cond_0

    :goto_1
    move/from16 v16, v1

    goto/16 :goto_7

    :cond_0
    move/from16 v16, v1

    goto/16 :goto_8

    .line 16
    :sswitch_1
    invoke-static {}, Ll/ۖۜ;->᩸ᩳۡ()I

    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-gez v0, :cond_a

    :cond_1
    move/from16 v16, v1

    goto/16 :goto_3

    .line 850
    :sswitch_2
    sget v0, Ll/ۗۖ;->ۙ᩶֨:I

    if-lez v0, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto :goto_1

    .line 164
    :sswitch_4
    invoke-static {}, Ll/ۖۖ;->ܿᩳᩴ()Z

    return-void

    :sswitch_5
    move-object/from16 v0, p0

    .line 2066
    iget-object v2, v0, Ll/۬۟֫;->ܰ:Landroid/widget/TextView;

    invoke-static {v2, v1}, Ll/֫ܺ;->۠֫ۖ(Ljava/lang/Object;I)V

    return-void

    :sswitch_6
    move-object/from16 v0, p0

    .line 2
    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    const v16, 0x7eaa6cb5

    xor-int v1, v1, v16

    .line 1930
    sget-boolean v16, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v16, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v16, "\u1a77\u06da"

    invoke-static/range {v16 .. v16}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v0, v16, v13

    mul-int/lit16 v0, v0, -0x2ac5

    const v17, -0x5c4c0f92

    xor-int v0, v0, v17

    const v17, -0x290c5da0

    xor-int v16, v16, v17

    goto :goto_0

    :sswitch_7
    const/4 v0, 0x3

    .line 2
    invoke-static {v11, v12, v0, v10}, Ll/ۖۗ;->ܳܰ᩺([SIII)Ljava/lang/String;

    move-result-object v2

    .line 957
    sget v0, Ll/ۘ֡;->᩹ܶ۬:I

    if-gtz v0, :cond_3

    move/from16 v16, v1

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u06dc\u1a7b"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4d

    move/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x18c3

    const v17, 0xf2ce023

    xor-int v1, v1, v17

    const v17, 0x452a3145

    goto/16 :goto_9

    :sswitch_8
    move/from16 v16, v1

    const/4 v12, 0x1

    sget v0, Ll/ۗ֨;->᩹ۜۡ:I

    if-ltz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u05ab\u06d6"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0xddf

    const v17, -0x4a3fd798

    xor-int v1, v1, v17

    const v17, 0x7e69fb53

    goto/16 :goto_9

    :sswitch_9
    move/from16 v16, v1

    .line 2
    sget v0, Ll/۟ۢ֫;->ۡ᩷:I

    sget-object v11, Ll/۬۟֫;->ۤ۟ܶ:[S

    sget-boolean v0, Ll/ۗ֫;->ۘ᩹֨:Z

    if-nez v0, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u1a77\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x6f

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x3d3f

    const v17, -0x49a14a0e

    xor-int v1, v1, v17

    const v17, -0x5dfc986f

    goto/16 :goto_9

    :sswitch_a
    move/from16 v16, v1

    const/16 v0, 0x126f

    const/16 v10, 0x126f

    :goto_2
    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x4abd

    const v17, -0x68c7f1b7

    xor-int v1, v1, v17

    const v17, -0x4f7b87df

    goto/16 :goto_9

    :sswitch_b
    move/from16 v16, v1

    add-int/lit8 v0, v9, 0x1

    sub-int v0, v7, v0

    if-gez v0, :cond_6

    const-string v0, "\u073f\u05ab"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x5e47

    const v17, -0x65009eac

    xor-int v1, v1, v17

    const v17, -0xc020e33

    goto/16 :goto_9

    :cond_6
    const-string v0, "\u0736\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x3d

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0xb2d

    const v17, -0x4daf645e

    xor-int v1, v1, v17

    const v17, 0x4943114c    # 798996.75f

    goto/16 :goto_9

    :sswitch_c
    move/from16 v16, v1

    mul-int v9, v5, v8

    .line 860
    sget v0, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v0, :cond_7

    :goto_3
    const-string v0, "\u06d8\u05a1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x75c9

    const v17, 0x415d4e45

    xor-int v1, v1, v17

    const v17, -0x4838768e

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u1a7a\u1a74"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x243d

    const v17, 0x595b79a8

    xor-int v1, v1, v17

    const v17, -0x38f1e8a8

    goto/16 :goto_9

    :sswitch_d
    move/from16 v16, v1

    mul-int v7, v6, v6

    const/4 v8, 0x2

    sget v0, Ll/֡ۢ;->۟֡᩻:I

    if-gtz v0, :cond_8

    goto :goto_5

    :cond_8
    const-string v0, "\u06e2\u06d8"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x1d

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x5cb

    const v17, -0x6b356415

    xor-int v1, v1, v17

    const v17, 0x6fb08dd3

    goto/16 :goto_9

    :sswitch_e
    move/from16 v16, v1

    add-int/lit8 v6, v5, 0x1

    sget v0, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz v0, :cond_9

    :goto_4
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x4c4f

    const v17, -0x307f671b

    xor-int v1, v1, v17

    const v17, -0x17a929af

    goto/16 :goto_9

    :cond_9
    const-string v0, "\u06e7\u06e1"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x1f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x1a67

    const v17, 0x35975591

    xor-int v1, v1, v17

    const v17, -0x5d7be6dd

    goto/16 :goto_9

    :sswitch_f
    move/from16 v16, v1

    aget-short v5, v3, v4

    .line 1656
    sget v0, Ll/֫֡;->֫ۙۖ:I

    if-gtz v0, :cond_b

    :goto_5
    move/from16 v1, v16

    :cond_a
    :goto_6
    const-string v0, "\u06e4\u1a73"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x29

    move/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0xff3

    const v17, -0x5bf45230

    xor-int v1, v1, v17

    const v17, -0x6c6157d

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u06eb\u06d9"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x1d63

    const v17, -0x25b9baeb    # -1.3952E16f

    xor-int v1, v1, v17

    const v17, 0x6cc021db

    goto :goto_9

    :sswitch_10
    move/from16 v16, v1

    const/4 v4, 0x0

    sget v0, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v0, :cond_c

    :goto_7
    const-string v0, "\u1a76\u06dc"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x41

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x4813

    const v17, -0x2612afc2

    xor-int v1, v1, v17

    const v17, 0x3279f42c

    goto :goto_9

    :cond_c
    const-string v0, "\u06db\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x6b9d

    const v17, -0x64001a3e

    xor-int v1, v1, v17

    const v17, 0x5085abfc

    goto :goto_9

    :sswitch_11
    move/from16 v16, v1

    sget-object v3, Ll/۬۟֫;->ۤ۟ܶ:[S

    .line 753
    invoke-static {}, Ll/ۗ᩶;->᩺ᩴܳ()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_8
    const-string v0, "\u06eb\u0736"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0xf

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x500f

    const v17, 0x5018f6c3

    xor-int v1, v1, v17

    const v17, 0x39967451

    goto :goto_9

    :cond_d
    const-string v0, "\u1a78\u1a77"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x10a7

    const v17, 0x7913bc12

    xor-int v1, v1, v17

    const v17, -0x4ad9b186

    :goto_9
    xor-int v0, v0, v17

    move/from16 v18, v16

    move/from16 v16, v0

    move v0, v1

    move/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c9b0f19 -> :sswitch_5
        -0x75fbc606 -> :sswitch_0
        -0x6f31afba -> :sswitch_2
        -0x6e50cf24 -> :sswitch_a
        -0x6cdf7a64 -> :sswitch_4
        -0x6adaa7d5 -> :sswitch_7
        -0x606ea6f1 -> :sswitch_5
        -0x5aa080c1 -> :sswitch_b
        -0x56bc3782 -> :sswitch_e
        -0x4dfff8e7 -> :sswitch_10
        -0x4136139d -> :sswitch_a
        -0x40751a9b -> :sswitch_d
        -0x3fb0a323 -> :sswitch_c
        -0x3dd19025 -> :sswitch_3
        -0x39b8be28 -> :sswitch_2
        -0x393b8583 -> :sswitch_11
        -0x2a6a881a -> :sswitch_3
        -0x26815529 -> :sswitch_d
        -0x1d9ff8f2 -> :sswitch_11
        -0x18073ee1 -> :sswitch_6
        -0x1089ce62 -> :sswitch_f
        -0x61a9adc -> :sswitch_9
        -0x3bb3f57 -> :sswitch_10
        -0x328d538 -> :sswitch_8
        0xe92dbc8 -> :sswitch_e
        0x1c3b6a85 -> :sswitch_7
        0x21b95cb6 -> :sswitch_b
        0x228d1665 -> :sswitch_9
        0x2a4435e7 -> :sswitch_c
        0x3b1e30e9 -> :sswitch_4
        0x3c9ce048 -> :sswitch_0
        0x4a4eba0f -> :sswitch_1
        0x4ff2f8a7 -> :sswitch_f
        0x52eb2ff1 -> :sswitch_8
        0x578488ca -> :sswitch_6
        0x7526ceb8 -> :sswitch_1
    .end sparse-switch
.end method
