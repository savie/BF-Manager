.class public final Ll/֫᩶֫;
.super Ljava/io/FilterInputStream;
.source "F6IK"

# interfaces
.implements Ll/۠ۜ᩹;


# static fields
.field private static final ᩺ۧ۬:[S


# instance fields
.field public final ֡:Ll/᩻ۧܺ;

.field public final ۟:Ll/ۗۧܺ;

.field public final ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܿ:Ll/ۚ᩶֫;

.field public final ᩳ:[B

.field public ᩶:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x25

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֫᩶֫;->᩺ۧ۬:[S

    return-void

    :array_0
    .array-data 2
        0x20a9s
        0x5c11s
        0x5c3es
        0x5c34s
        0x5c22s
        0x5c3fs
        0x5c39s
        0x5c34s
        0x5c70s
        0x5c33s
        0x5c3fs
        0x5c3ds
        0x5c20s
        0x5c39s
        0x5c3cs
        0x5c35s
        0x5c70s
        0x5c3cs
        0x5c39s
        0x5c32s
        0x5c22s
        0x5c31s
        0x5c22s
        0x5c29s
        0x5c70s
        0x5c39s
        0x5c23s
        0x5c70s
        0x5c24s
        0x5c3fs
        0x5c3fs
        0x5c70s
        0x5c3cs
        0x5c31s
        0x5c22s
        0x5c37s
        0x5c35s
    .end array-data
.end method

.method public constructor <init>(Ljava/io/InputStream;Ll/᩻ۧܺ;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x69b49c26

    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    sget v4, Ll/ۖᩳ;->᩹ۧܳ:I

    .line 222
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-string p1, "\u06d7\u06ec"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, 0xff3

    const v6, 0x1c966d59

    xor-int/2addr v5, v6

    const v6, -0x2b8927f

    :goto_0
    xor-int/2addr p1, v6

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x616d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v5

    xor-int/2addr v2, p1

    sparse-switch v2, :sswitch_data_0

    .line 223
    sget-object v1, Ll/ۧ᩶֫;->ۙ:Ll/ۚ᩶֫;

    sget p1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz p1, :cond_3

    goto/16 :goto_1

    .line 146
    :sswitch_0
    invoke-static {}, Ll/֡᩵;->۠۫ۚ()I

    move-result p1

    if-gtz p1, :cond_4

    goto/16 :goto_1

    .line 141
    :sswitch_1
    sget-boolean p1, Ll/ܽ;->᩷۬ۗ:Z

    if-nez p1, :cond_9

    goto :goto_1

    .line 65
    :sswitch_2
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget p1, Ll/֨ۨ;->ۜܳ᩵:I

    if-ltz p1, :cond_b

    goto :goto_1

    .line 218
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ܶ᩸᩻()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 225
    :sswitch_5
    iput-object p3, p0, Ll/֫᩶֫;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 226
    new-instance p1, Ll/ۗۧܺ;

    invoke-static {}, Ll/ۖ᩵;->᩷᩶֨()I

    move-result v5

    if-gtz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-wide/32 v5, 0x8c2800

    .line 170
    sget v7, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v7, :cond_1

    goto :goto_2

    .line 226
    :cond_1
    invoke-direct {p1, v5, v6}, Ll/ۗۧܺ;-><init>(J)V

    invoke-static {p1, p2}, Ll/ۗ֨;->ܽۜܰ(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Ll/֫᩶֫;->۟:Ll/ۗۧܺ;

    return-void

    .line 223
    :sswitch_6
    iput-object v1, p0, Ll/֫᩶֫;->ܿ:Ll/ۚ᩶֫;

    .line 224
    iput-object p2, p0, Ll/֫᩶֫;->֡:Ll/᩻ۧܺ;

    .line 210
    sget-boolean p1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz p1, :cond_2

    const-string p1, "\u06d8\u06e7"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, -0x71e1

    const v6, -0x2d9a9bae

    xor-int/2addr v5, v6

    const v6, -0x1cc113e8

    goto :goto_0

    :cond_2
    const-string p1, "\u1a7a\u1a73"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v4, p1

    mul-int/lit8 p1, p1, -0x1f

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, -0x7715

    const v6, 0x198cf328

    xor-int/2addr v5, v6

    const v6, 0x7b97e9b

    goto/16 :goto_0

    :goto_1
    const-string p1, "\u1a76\u06dc"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x5b

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, 0x366b

    const v6, 0x5f8a0eda

    xor-int/2addr v5, v6

    const v6, -0x470bbe0

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06db\u06db"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, -0x12a1

    const v6, 0x6ee1bdc2

    xor-int/2addr v5, v6

    const v6, 0x25b31b1a

    goto/16 :goto_0

    .line 218
    :sswitch_7
    iput-object v0, p0, Ll/֫᩶֫;->ᩳ:[B

    .line 65
    sget p1, Ll/ۖۗ;->᩻ܳܶ:I

    if-gtz p1, :cond_5

    :cond_4
    :goto_2
    const-string p1, "\u06e1\u06eb"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, 0x11ed

    const v6, 0x32746ea8

    xor-int/2addr v5, v6

    const v6, -0x4a6c630

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u0736\u0733"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, 0x31f3

    const v6, -0x7cdef0c3

    xor-int/2addr v5, v6

    const v6, 0x64f458b6

    goto/16 :goto_0

    :sswitch_8
    sget p1, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz p1, :cond_6

    goto :goto_3

    :cond_6
    const-string p1, "\u0733\u06df"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x3f

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, -0x3007

    const v6, -0x50bc6c56

    xor-int/2addr v5, v6

    const v6, -0x3245163d

    goto/16 :goto_0

    .line 132
    :sswitch_9
    sget p1, Ll/֡۟;->᩶᩺ܰ:I

    if-gtz p1, :cond_7

    goto :goto_4

    :cond_7
    const-string p1, "\u1a74\u1a79"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, -0x494f

    const v6, 0x7d5c708d

    xor-int/2addr v5, v6

    const v6, -0x61f06e5e

    goto/16 :goto_0

    :sswitch_a
    sget p1, Ll/ۘܶ;->ܶ᩵ۢ:I

    if-ltz p1, :cond_8

    goto :goto_3

    :cond_8
    const-string p1, "\u06db\u06df"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, 0x465d

    const v6, -0x7f2dd3e6

    xor-int/2addr v5, v6

    const v6, 0x71ffea09

    goto/16 :goto_0

    .line 111
    :sswitch_b
    sget-boolean p1, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz p1, :cond_a

    :cond_9
    :goto_3
    const-string p1, "\u06dc\u06e2"

    invoke-static {p1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, 0x22fb

    const v6, -0x3e51b12b

    xor-int/2addr v5, v6

    const v6, 0x4f7c9af4    # 4.2380134E9f

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u1a78\u05a1"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, -0x26d5

    const v6, -0x2c0f7875

    xor-int/2addr v5, v6

    const v6, -0x68100142

    goto/16 :goto_0

    :sswitch_c
    const/16 p1, 0x2000

    new-array v0, p1, [B

    sget p1, Ll/֡ܳ;->֨ᩳۢ:I

    if-gtz p1, :cond_c

    :cond_b
    :goto_4
    const-string p1, "\u06e7\u073f"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v4

    xor-int v5, p1, v3

    mul-int/lit16 v5, v5, 0x49f9

    const v6, 0x4ff005e4

    xor-int/2addr v5, v6

    const v6, -0x25fcfb88

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06eb\u073d"

    invoke-static {p1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x1b

    xor-int v5, p1, v4

    mul-int/lit16 v5, v5, -0x5be9

    const v6, 0x1157380c

    xor-int/2addr v5, v6

    const v6, 0xca3b480

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c7785f0 -> :sswitch_b
        -0x6e8dd837 -> :sswitch_5
        -0x6ab59370 -> :sswitch_3
        -0x4df1fd5c -> :sswitch_c
        -0x4befafd6 -> :sswitch_1
        -0x4a2c3616 -> :sswitch_6
        -0x369bd776 -> :sswitch_b
        -0x2eba9509 -> :sswitch_8
        -0x275a8eb9 -> :sswitch_a
        -0x212e8d60 -> :sswitch_1
        -0x20e3b71e -> :sswitch_2
        -0x1e60c703 -> :sswitch_9
        -0x103688ce -> :sswitch_c
        0x57344f3 -> :sswitch_9
        0x6b16ccc -> :sswitch_3
        0xaff626f -> :sswitch_a
        0x1579a1be -> :sswitch_4
        0x37390e44 -> :sswitch_0
        0x4ad354bf -> :sswitch_7
        0x4e9df24f -> :sswitch_8
        0x53d30d15 -> :sswitch_2
        0x5739d76e -> :sswitch_4
        0x60ef4459 -> :sswitch_7
        0x61c0ed2c -> :sswitch_5
        0x668790c8 -> :sswitch_6
        0x735e3e87 -> :sswitch_0
    .end sparse-switch
.end method

.method private ۙ(I)V
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, 0x16ae6441

    sget v17, Ll/ۗܶ;->ᩴ֫۫:I

    sget v18, Ll/ۖ֡;->ۚۛᩳ:I

    const-string v19, "\u06e4\u0736"

    invoke-static/range {v19 .. v19}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v18

    xor-int v2, v19, v17

    mul-int/lit16 v2, v2, 0x41c5

    const v3, -0x3aaec238

    xor-int/2addr v2, v3

    const v3, -0x6e7a3e64

    xor-int v3, v19, v3

    move-object/from16 v19, v8

    const-wide/16 v20, 0x0

    :goto_0
    xor-int v8, v16, v17

    mul-int/lit16 v8, v8, -0x3d0f

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v2, v8

    xor-int v16, v3, v2

    sparse-switch v16, :sswitch_data_0

    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    return-void

    .line 244
    :sswitch_0
    invoke-static {}, Ll/ۧ;->ۧ۟ۧ()I

    move-result v2

    if-eqz v2, :cond_d

    goto/16 :goto_3

    .line 183
    :sswitch_1
    invoke-static {}, Ll/֫ۤ;->ۨᩳᩴ()Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_4

    .line 86
    :sswitch_2
    invoke-static {}, Ll/ۖ֡;->ܿۧ۫()Z

    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u073d\u06d7"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x7a4d

    const v8, 0x5783b0ec

    xor-int/2addr v3, v8

    const v8, 0x44b8094b

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۚ;->ۛ᩹ܽ()I

    goto/16 :goto_4

    .line 262
    :sswitch_4
    iget-object v2, v0, Ll/֫᩶֫;->۟:Ll/ۗۧܺ;

    invoke-static {v2, v1}, Ll/ܽ;->ܳ᩻۬(Ljava/lang/Object;I)Z

    return-void

    .line 261
    :sswitch_5
    new-instance v2, Ljava/io/IOException;

    sget-object v3, Ll/֫᩶֫;->᩺ۧ۬:[S

    const/4 v8, 0x1

    .line 130
    sget v22, Ll/֫֨;->᩶ܺۡ:I

    if-gtz v22, :cond_1

    goto/16 :goto_4

    :cond_1
    const/16 v1, 0x24

    .line 261
    invoke-static {v3, v8, v1, v15}, Ll/ۗ᩸;->۫ᩳۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_6
    iget-object v2, v0, Ll/֫᩶֫;->ܿ:Ll/ۚ᩶֫;

    invoke-static {v2}, Ll/ۗ᩺;->᩶᩶۠(Ljava/lang/Object;)Ljava/lang/Class;

    const-wide/32 v2, 0x8c2800

    cmp-long v8, v6, v2

    if-gtz v8, :cond_2

    const-string v2, "\u1a77\u1a7a"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x2f

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, 0x5f07

    const v8, -0x21a8c148

    xor-int/2addr v3, v8

    const v8, 0x768b6083

    goto :goto_1

    :cond_2
    const-string v2, "\u1a73\u06ec"

    invoke-static {v2}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x5

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x37a1

    const v8, 0x6650e49b

    xor-int/2addr v3, v8

    const v8, 0x750f417c

    goto :goto_1

    .line 260
    :sswitch_7
    iput-wide v6, v0, Ll/֫᩶֫;->᩶:J

    sget v2, Ll/ۖ֡;->ۚۛᩳ:I

    if-gtz v2, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v2, "\u0733\u0730"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x2ca7

    const v8, -0x37bdaec8

    xor-int/2addr v3, v8

    const v8, -0x4d0a1867

    goto :goto_1

    :sswitch_8
    add-long v6, v20, v4

    .line 0
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v2

    if-gtz v2, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v2, "\u06e2\u0733"

    invoke-static {v2}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x4817

    const v8, 0x12577829

    xor-int/2addr v3, v8

    const v8, 0x6f10b5bf

    :goto_1
    xor-int/2addr v2, v8

    move/from16 v23, v3

    move v3, v2

    move/from16 v2, v23

    goto/16 :goto_0

    .line 260
    :sswitch_9
    iget-wide v2, v0, Ll/֫᩶֫;->᩶:J

    int-to-long v4, v1

    .line 37
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v8

    if-gtz v8, :cond_5

    move-wide/from16 v20, v2

    goto/16 :goto_4

    :cond_5
    const-string v8, "\u06d7\u1a7b"

    invoke-static {v8}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v18

    mul-int/lit8 v8, v8, 0x67

    xor-int v0, v8, v17

    mul-int/lit16 v0, v0, 0x2ee7

    const v20, 0x6ac79e50

    xor-int v0, v0, v20

    const v20, -0x30386c14

    xor-int v8, v8, v20

    move-wide/from16 v20, v2

    move v3, v8

    move v2, v0

    goto/16 :goto_7

    :sswitch_a
    const/16 v0, 0x1ace

    const/16 v15, 0x1ace

    goto :goto_2

    :sswitch_b
    const/16 v0, 0x5c50

    const/16 v15, 0x5c50

    :goto_2
    const-string v0, "\u06d6\u1a7a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x29

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0xc31

    const v3, -0x165fa874

    xor-int/2addr v2, v3

    const v3, -0x3b337048

    goto/16 :goto_6

    :sswitch_c
    mul-int v0, v14, v14

    sub-int v0, v12, v0

    if-lez v0, :cond_6

    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x2c67

    const v3, 0x6cede7c6

    xor-int/2addr v2, v3

    const v3, 0x73480dd

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06e0\u06e0"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x53

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0x682b

    const v3, -0x192e2507

    xor-int/2addr v2, v3

    const v3, -0x2b7705df

    goto/16 :goto_6

    :sswitch_d
    add-int v14, v10, v13

    .line 213
    sget v0, Ll/֫ۢ;->ۚ᩻᩵:I

    if-gtz v0, :cond_7

    goto :goto_3

    :cond_7
    const-string v0, "\u05ab\u06db"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x7305

    const v3, 0x19ad5a6a

    xor-int/2addr v2, v3

    const v3, -0xbb07853

    goto/16 :goto_6

    :sswitch_e
    mul-int v12, v10, v11

    const/16 v13, 0x3a64

    invoke-static {}, Ll/ۗ֫;->ۤ۬ۖ()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    :goto_3
    const-string v0, "\u05a8\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x25

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x6b0b

    const v3, -0x3eaaa0d7

    xor-int/2addr v2, v3

    const v3, 0x7d048acc

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u06eb\u0730"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, -0x2845

    const v3, -0x6c0901f6

    xor-int/2addr v2, v3

    const v3, 0x2c57e3c1

    goto/16 :goto_6

    :sswitch_f
    aget-short v10, v19, v9

    const v11, 0xe990

    .line 9
    sget v0, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v0, :cond_a

    const-string v0, "\u06e1\u0730"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x5f23

    const v3, 0x67c1eabb

    xor-int/2addr v2, v3

    const v3, 0x6a1c8296

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u0736\u1a79"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0xd

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, 0x301

    const v3, 0x5161238d

    xor-int/2addr v2, v3

    const v3, -0x25095528

    goto/16 :goto_6

    :sswitch_10
    const/4 v9, 0x0

    .line 230
    sget v0, Ll/ۖܰ;->۟֫ܽ:I

    if-gtz v0, :cond_b

    goto :goto_5

    :cond_b
    const-string v0, "\u1a73\u06d7"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x3b81

    const v3, 0x42514b44

    xor-int/2addr v2, v3

    const v3, 0x4c9ffba

    goto :goto_6

    :sswitch_11
    sget-object v19, Ll/֫᩶֫;->᩺ۧ۬:[S

    sget-boolean v0, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v0, :cond_c

    :goto_4
    const-string v0, "\u06e2\u05ab"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, -0x3a35

    const v3, 0x7480f995

    xor-int/2addr v2, v3

    const v3, -0x5047fc88

    goto :goto_6

    :cond_c
    const-string v0, "\u06d7\u06d9"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x35

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x4107

    const v3, -0x6607b971

    xor-int/2addr v2, v3

    const v3, -0x472f2a32

    goto :goto_6

    :sswitch_12
    sget v0, Ll/ۖۖ;->᩵ۜ֨:I

    if-ltz v0, :cond_e

    :cond_d
    :goto_5
    const-string v0, "\u1a7b\u06eb"

    invoke-static {v0}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, -0x472f

    const v3, -0x47028ecc

    xor-int/2addr v2, v3

    const v3, 0x1d84cb54

    goto :goto_6

    :cond_e
    const-string v0, "\u06ec\u06db"

    invoke-static {v0}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x69

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, -0xa1

    const v3, 0xaa3ac2a

    xor-int/2addr v2, v3

    const v3, 0x689e7285

    :goto_6
    xor-int/2addr v3, v0

    :goto_7
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79acfcb2 -> :sswitch_5
        -0x69e2e9a0 -> :sswitch_c
        -0x581f5273 -> :sswitch_11
        -0x48c1d1de -> :sswitch_2
        -0x440b2cd4 -> :sswitch_11
        -0x30aa7df8 -> :sswitch_10
        -0x2f58d967 -> :sswitch_6
        -0x269bfd7c -> :sswitch_e
        -0x2396dbe9 -> :sswitch_4
        -0x1c6030b2 -> :sswitch_0
        -0x1c0f24bd -> :sswitch_7
        -0xe86cbbc -> :sswitch_a
        -0xc28c5ed -> :sswitch_12
        -0xc1bb430 -> :sswitch_4
        -0x94b2df3 -> :sswitch_9
        0x2ef906c -> :sswitch_d
        0x73a3905 -> :sswitch_12
        0x84e79a4 -> :sswitch_0
        0x12afa159 -> :sswitch_8
        0x1dfbff47 -> :sswitch_10
        0x2b68b308 -> :sswitch_e
        0x2e6517d5 -> :sswitch_b
        0x3a365c59 -> :sswitch_1
        0x3b03cfd7 -> :sswitch_f
        0x3eaa3858 -> :sswitch_2
        0x3fa1a2ad -> :sswitch_d
        0x40aa5e6b -> :sswitch_8
        0x4af0e3e9 -> :sswitch_9
        0x53da84f4 -> :sswitch_b
        0x574e72b8 -> :sswitch_3
        0x58125c3d -> :sswitch_1
        0x61652d10 -> :sswitch_5
        0x6566401d -> :sswitch_a
        0x65bd411e -> :sswitch_c
        0x6698e223 -> :sswitch_f
        0x7ab2cdbe -> :sswitch_6
        0x7ce6f5e7 -> :sswitch_7
        0x7da8f1fe -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x637042c5

    sget v4, Ll/ۗ֨;->᩹ۜۡ:I

    sget v5, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v6, "\u06e1\u06ec"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4687

    const v8, 0x61e2c969

    xor-int/2addr v7, v8

    const v8, -0xeb7be0a

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x3989

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 231
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    const/4 v6, -0x1

    if-eq v2, v6, :cond_1

    const-string v6, "\u06ec\u05a8"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x29d

    const v8, -0x2b9456ca

    xor-int/2addr v7, v8

    const v8, -0x23fcd6be

    goto :goto_0

    :sswitch_0
    invoke-static {}, Ll/ۗۖ;->᩺ۖ᩺()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    sget-boolean v6, Ll/֫ܺ;->ۢ֨ۛ:Z

    if-eqz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v6, "\u06d6\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4ac9

    const v8, -0x12175ec3    # -8.999431E27f

    xor-int/2addr v7, v8

    const v8, 0x1bfc3923

    goto :goto_0

    .line 102
    :sswitch_2
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    move-result v6

    if-lez v6, :cond_b

    goto/16 :goto_3

    .line 113
    :sswitch_3
    invoke-static {}, Ll/ۖܰ;->ۡۜܶ()Z

    invoke-static {}, Ll/֨ۖ;->۫ܳۛ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    invoke-static {}, Ll/ۖۙ;->ᩴ֨ۧ()I

    const/4 v0, 0x0

    return v0

    :sswitch_5
    const/4 v6, 0x1

    .line 233
    invoke-direct {p0, v6}, Ll/֫᩶֫;->ۙ(I)V

    goto :goto_2

    :sswitch_6
    return v2

    :cond_1
    :goto_2
    const-string v6, "\u06d7\u073d"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2103

    const v8, 0x5cefc976

    xor-int/2addr v7, v8

    const v8, -0x27d1b5fa

    goto/16 :goto_0

    .line 230
    :sswitch_7
    invoke-static {v0, v1}, Ll/ۧ᩶֫;->ۙ(Ll/᩻ۧܺ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    sget v6, Ll/֨ۚ;->֡᩸ۛ:I

    if-ltz v6, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v6, "\u06eb\u06e7"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1055

    const v8, -0x38dd6501

    xor-int/2addr v7, v8

    const v8, -0x6d8b898b

    goto/16 :goto_0

    :sswitch_8
    iget-object v1, p0, Ll/֫᩶֫;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 132
    sget v6, Ll/ۗ֡;->ۜ᩻۫:I

    if-ltz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u1a7b\u06e0"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x508b

    const v8, -0x1663f73d

    xor-int/2addr v7, v8

    const v8, 0x58b5169

    goto/16 :goto_0

    .line 142
    :sswitch_9
    sget v6, Ll/ۖۜ;->֨ۡۗ:I

    if-eqz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u0736\u06e1"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x305f

    const v8, 0x7b5f7225

    xor-int/2addr v7, v8

    const v8, 0x23e0e38b

    goto/16 :goto_0

    .line 15
    :sswitch_a
    sget-boolean v6, Ll/֡ᩴ;->۬֡᩺:Z

    if-eqz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u1a78\u06e2"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3123

    const v8, -0x3209aca4

    xor-int/2addr v7, v8

    const v8, 0x3a9ab3e6

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/ۗ᩵;->ᩳܶۤ:I

    if-gtz v6, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v6, "\u1a7b\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5fb5

    const v8, -0x73dc2edb    # -1.262E-31f

    xor-int/2addr v7, v8

    const v8, -0x5d288dfa

    goto/16 :goto_0

    .line 64
    :sswitch_c
    sget v6, Ll/֨᩻;->ۛ֫ܶ:I

    if-ltz v6, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v6, "\u1a75\u06db"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2fa5

    const v8, -0x597ebd8f

    xor-int/2addr v7, v8

    const v8, -0x197543c7

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/֨ܿ;->᩹᩻۟:I

    if-ltz v6, :cond_8

    :goto_3
    const-string v6, "\u06da\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x727b

    const v8, -0x27d4af7f    # -7.53449E14f

    xor-int/2addr v7, v8

    const v8, -0x1fe70b26

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u1a7b\u1a76"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x407f

    const v8, 0x6f8821b9

    xor-int/2addr v7, v8

    const v8, 0xab55f03

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    move-result v6

    if-gtz v6, :cond_a

    :cond_9
    const-string v6, "\u06da\u073a"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x58e1

    const v8, -0x7974ae39

    xor-int/2addr v7, v8

    const v8, 0x77c6ab16

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u1a79\u1a7a"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5555

    const v8, 0x19edfcd6

    xor-int/2addr v7, v8

    const v8, -0x23aa8020

    goto/16 :goto_0

    .line 12
    :sswitch_f
    sget v6, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u05a1\u06e1"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1641

    const v8, 0x52917b50

    xor-int/2addr v7, v8

    const v8, 0x40e46b8c

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06ec\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x20d1

    const v8, 0x7fe6fea6

    xor-int/2addr v7, v8

    const v8, -0x23aecba9

    goto/16 :goto_0

    .line 230
    :sswitch_10
    iget-object v0, p0, Ll/֫᩶֫;->֡:Ll/᩻ۧܺ;

    .line 39
    sget-boolean v6, Ll/֫ۤ;->ۢ֨ܳ:Z

    if-eqz v6, :cond_d

    :goto_5
    const-string v6, "\u06d7\u073f"

    invoke-static {v6}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x6f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6b3d

    const v8, 0x26ae4caf

    xor-int/2addr v7, v8

    const v8, 0x3f69faef

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u1a7a\u1a77"

    invoke-static {v6}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x526d

    const v8, -0x38b72715

    xor-int/2addr v7, v8

    const v8, -0x76d23a3b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fd9f54a -> :sswitch_d
        -0x6843116a -> :sswitch_e
        -0x6811214c -> :sswitch_5
        -0x622578ce -> :sswitch_1
        -0x4c2b7a9b -> :sswitch_e
        -0x44cae0ee -> :sswitch_b
        -0x34c01ed9 -> :sswitch_1
        -0x2ec8426e -> :sswitch_7
        -0x2d30d2c0 -> :sswitch_c
        -0x1ef18df2 -> :sswitch_9
        -0x1c87e328 -> :sswitch_3
        -0x16c6e96d -> :sswitch_a
        -0x106b62d8 -> :sswitch_7
        0x3e75ccf -> :sswitch_b
        0x3f93860 -> :sswitch_f
        0xa04edbe -> :sswitch_4
        0x155586ba -> :sswitch_8
        0x1aa49759 -> :sswitch_4
        0x1ff0724d -> :sswitch_a
        0x25572c16 -> :sswitch_3
        0x25a0e48c -> :sswitch_8
        0x2be0ed4d -> :sswitch_0
        0x323266c4 -> :sswitch_6
        0x364ac745 -> :sswitch_d
        0x415b3b92 -> :sswitch_c
        0x4328eaec -> :sswitch_0
        0x5011c9c0 -> :sswitch_2
        0x57264e1d -> :sswitch_10
        0x63327d7c -> :sswitch_f
        0x66994d5a -> :sswitch_6
        0x6f9bfd22 -> :sswitch_2
        0x714b5e68 -> :sswitch_5
        0x7174a346 -> :sswitch_9
        0x79661765 -> :sswitch_10
    .end sparse-switch
.end method

.method public final read([BII)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x29659ac1

    sget v3, Ll/ۖۖ;->᩵ۜ֨:I

    sget v4, Ll/ۗ᩵;->ᩳܶۤ:I

    const-string v5, "\u06e2\u06da"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x23e3

    const v7, -0x7f78ac63

    xor-int/2addr v6, v7

    const v7, 0x66b6234a

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x6385

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 239
    iget-object v1, p0, Ll/֫᩶֫;->ܰ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v0, v1}, Ll/ۧ᩶֫;->ۙ(Ll/᩻ۧܺ;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 240
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-lez v1, :cond_0

    const-string v5, "\u05ab\u06df"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x33

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7141

    const v7, -0x377715fe    # -280400.06f

    xor-int/2addr v6, v7

    const v7, -0x77e1bf40

    goto :goto_0

    .line 68
    :sswitch_0
    invoke-static {}, Ll/֡ۖ;->᩹ۛۧ()I

    sget v5, Ll/֡᩻;->᩷ۧ᩺:I

    if-lez v5, :cond_c

    goto/16 :goto_2

    .line 204
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->᩵ۙۚ()I

    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_3

    goto/16 :goto_5

    .line 179
    :sswitch_2
    sget v5, Ll/֫֡;->֫ۙۖ:I

    if-gtz v5, :cond_a

    goto/16 :goto_4

    .line 150
    :sswitch_3
    invoke-static {}, Ll/֡᩻;->ۢ֡ۗ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۖᩳ;->ܽ᩷ۚ()I

    const/4 p1, 0x0

    return p1

    .line 242
    :sswitch_5
    invoke-direct {p0, v1}, Ll/֫᩶֫;->ۙ(I)V

    goto :goto_1

    :sswitch_6
    return v1

    :cond_0
    :goto_1
    const-string v5, "\u1a7b\u073a"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x466b

    const v7, 0xf2b828b

    xor-int/2addr v6, v7

    const v7, 0x65429503

    goto :goto_0

    .line 239
    :sswitch_7
    iget-object v0, p0, Ll/֫᩶֫;->֡:Ll/᩻ۧܺ;

    invoke-static {}, Ll/֫֡;->ۗۙۧ()I

    move-result v5

    if-ltz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u0730\u05a8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2e37

    const v7, 0x3c47ccab

    xor-int/2addr v6, v7

    const v7, 0x37c94d1b

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ܽ;->ۤۖۡ()Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u073a\u0730"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2ab5

    const v7, -0x10ded592

    xor-int/2addr v6, v7

    const v7, 0x6d99d149

    goto/16 :goto_0

    .line 88
    :sswitch_9
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v5

    if-gtz v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u1a75\u06d8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xfb3

    const v7, 0x6178f040

    xor-int/2addr v6, v7

    const v7, 0x5ab896d3

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06d6\u1a77"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1ee9

    const v7, -0x24ef82dc    # -4.066999E16f

    xor-int/2addr v6, v7

    const v7, -0x2eb7bb92

    goto/16 :goto_0

    .line 227
    :sswitch_a
    sget v5, Ll/۬;->᩸ۜ᩹:I

    if-eqz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06e1\u06e8"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x42f

    const v7, -0x2609938d

    xor-int/2addr v6, v7

    const v7, 0x5299a33e

    goto/16 :goto_0

    .line 159
    :sswitch_b
    sget-boolean v5, Ll/ܽ;->᩷۬ۗ:Z

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    const-string v5, "\u073a\u0733"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7561

    const v7, 0x120e2628

    xor-int/2addr v6, v7

    const v7, 0x4f4cb10b

    goto/16 :goto_0

    .line 71
    :sswitch_c
    sget v5, Ll/֨ۖ;->ۜۜۖ:I

    if-eqz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u1a74\u073d"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x68c3

    const v7, -0x6539bcb0    # -8.199963E-23f

    xor-int/2addr v6, v7

    const v7, 0x1b098b2

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_8

    :goto_3
    const-string v5, "\u06ec\u073f"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f2f

    const v7, 0x63801924

    xor-int/2addr v6, v7

    const v7, 0x7b539b0

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u073f\u06ec"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3b17

    const v7, 0x33368232

    xor-int/2addr v6, v7

    const v7, -0x17fb27fe

    goto/16 :goto_0

    .line 76
    :sswitch_e
    sget v5, Ll/ۗܰ;->ܶۜ۬:I

    if-ltz v5, :cond_9

    :goto_4
    const-string v5, "\u1a74\u0736"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3731

    const v7, 0x16981f2e

    xor-int/2addr v6, v7

    const v7, 0x4f720d7b

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e2\u1a79"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1905

    const v7, 0x1df786b

    xor-int/2addr v6, v7

    const v7, 0x6a621d20

    goto/16 :goto_0

    .line 144
    :sswitch_f
    invoke-static {}, Ll/ۖ᩹;->۠ۗۘ()Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    :goto_5
    const-string v5, "\u06d9\u1a75"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x740d

    const v7, -0x2f0f3085

    xor-int/2addr v6, v7

    const v7, -0x1beaf486

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u073d\u06d9"

    invoke-static {v5}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1295

    const v7, 0x52592d74

    xor-int/2addr v6, v7

    const v7, -0x1debb5a9

    goto/16 :goto_0

    .line 113
    :sswitch_10
    sget v5, Ll/ۗܶ;->ᩴ֫۫:I

    if-gtz v5, :cond_d

    :cond_c
    const-string v5, "\u06db\u1a79"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x47

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x65d

    const v7, 0x9365582

    xor-int/2addr v6, v7

    const v7, 0x3528651c

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e0\u06e2"

    invoke-static {v5}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6a91

    const v7, -0x1dcc0057

    xor-int/2addr v6, v7

    const v7, -0x73e73da0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ee14af4 -> :sswitch_c
        -0x7c74a43b -> :sswitch_2
        -0x7176378d -> :sswitch_f
        -0x6789502e -> :sswitch_10
        -0x655a7e3b -> :sswitch_8
        -0x63fb49f7 -> :sswitch_9
        -0x606d08bb -> :sswitch_4
        -0x4b0a8579 -> :sswitch_7
        -0x3dc373ad -> :sswitch_a
        -0x3d068977 -> :sswitch_9
        -0x35245bc0 -> :sswitch_2
        -0x30f452f2 -> :sswitch_3
        -0x2432536e -> :sswitch_f
        -0x110d2efc -> :sswitch_b
        -0xade5f74 -> :sswitch_6
        0x2559005 -> :sswitch_10
        0x49c1df3 -> :sswitch_4
        0xf35e7aa -> :sswitch_0
        0x14432f67 -> :sswitch_e
        0x1c6957d2 -> :sswitch_5
        0x23ed51dd -> :sswitch_c
        0x26741db5 -> :sswitch_7
        0x2d3cd67d -> :sswitch_d
        0x2eaa3c3c -> :sswitch_a
        0x2fbf3f71 -> :sswitch_b
        0x30483752 -> :sswitch_8
        0x37a99a7e -> :sswitch_1
        0x3bd9d470 -> :sswitch_1
        0x4c58cfa9 -> :sswitch_0
        0x576328d3 -> :sswitch_3
        0x5785a786 -> :sswitch_5
        0x5aa7a6d0 -> :sswitch_6
        0x70029279 -> :sswitch_e
        0x79dc7d17 -> :sswitch_d
    .end sparse-switch
.end method

.method public final skip(J)J
    .locals 19

    move-object/from16 v0, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x7f04ee6

    sget v13, Ll/֨ܿ;->᩹᩻۟:I

    sget v14, Ll/֨᩻;->ۛ֫ܶ:I

    const-string v15, "\u1a7b\u06e1"

    invoke-static {v15}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v13, v15

    mul-int/lit8 v15, v15, -0x57

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, -0x6da7

    const v2, -0x5af7537d

    xor-int/2addr v1, v2

    const v2, -0x1deca374

    xor-int/2addr v2, v15

    const-wide/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v14

    mul-int/lit16 v12, v12, -0x585f

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v1, v12

    xor-int v12, v2, v1

    sparse-switch v12, :sswitch_data_0

    long-to-int v9, v7

    const/4 v10, 0x0

    .line 203
    sget v1, Ll/ۖ֨;->֨ۨۧ:I

    if-ltz v1, :cond_2

    goto/16 :goto_1

    .line 145
    :sswitch_0
    invoke-static {}, Ll/֫۠;->ۙ֡ۢ()Z

    sget v1, Ll/ۖ᩹;->۫ܽۗ:I

    if-gez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    const-string v1, "\u06d8\u06da"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x324d

    const v15, 0x6a30d6c9

    xor-int/2addr v2, v15

    const v15, -0x103239f9

    goto/16 :goto_7

    :sswitch_1
    invoke-static {}, Ll/ۗ֨;->ܶ᩻᩻()I

    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_a

    goto/16 :goto_6

    .line 156
    :sswitch_2
    sget-boolean v1, Ll/ۖ᩵;->ۧܽ᩹:Z

    if-eqz v1, :cond_d

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ܽۙ۫()I

    goto/16 :goto_1

    .line 23
    :sswitch_4
    invoke-static {}, Ll/֫֨;->ۜۚۡ()I

    invoke-static {}, Ll/ۗ᩸;->֫ۙ᩹()Z

    const-wide/16 v1, 0x0

    return-wide v1

    :sswitch_5
    int-to-long v1, v11

    add-long v16, v16, v1

    goto/16 :goto_3

    .line 250
    :sswitch_6
    invoke-virtual {v0, v3, v10, v9}, Ll/֫᩶֫;->read([BII)I

    move-result v11

    const/4 v1, -0x1

    if-ne v11, v1, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v1, "\u05ab\u06d7"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x6641

    const v15, 0x710fee3

    xor-int/2addr v2, v15

    const v15, 0x2ad09eaf

    goto/16 :goto_7

    :cond_2
    const-string v1, "\u0730\u0736"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x78dd

    const v15, 0x1534803e

    xor-int/2addr v2, v15

    const v15, -0x5fc1a16f

    goto/16 :goto_7

    :sswitch_7
    sub-long v1, p1, v16

    invoke-static {v5, v6, v1, v2}, Ll/ۖۜ;->ᩳۢۧ(JJ)J

    move-result-wide v7

    .line 101
    sget v1, Ll/֫֡;->֫ۙۖ:I

    if-gtz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u1a76\u073a"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, -0x5f

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x41d5

    const v15, 0x30b8fec0

    xor-int/2addr v2, v15

    const v15, -0x3dea6a83

    goto/16 :goto_7

    :sswitch_8
    int-to-long v5, v4

    .line 88
    sget v1, Ll/ۗ᩺;->֡ۙۜ:I

    if-ltz v1, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v1, "\u06db\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x3

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0xd3d

    const v15, -0x3b704a62

    xor-int/2addr v2, v15

    const v15, -0x3d833ced

    goto/16 :goto_7

    .line 250
    :sswitch_9
    iget-object v3, v0, Ll/֫᩶֫;->ᩳ:[B

    array-length v4, v3

    .line 215
    invoke-static {}, Ll/֫ۢ;->֨֨۟()I

    move-result v1

    if-ltz v1, :cond_5

    :goto_1
    const-string v1, "\u1a76\u05a1"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x6d93

    const v15, 0x5572dc1f

    xor-int/2addr v2, v15

    const v15, 0x5e64510c

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u073a\u073f"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x2f9b

    const v15, 0x5674f8e7

    xor-int/2addr v2, v15

    const v15, 0x347aed10

    goto/16 :goto_7

    :sswitch_a
    return-wide v16

    :sswitch_b
    cmp-long v1, v16, p1

    if-gez v1, :cond_6

    const-string v1, "\u06e4\u06dc"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0xb81

    const v15, 0x75c0c552

    xor-int/2addr v2, v15

    const v15, 0x468fd8c7

    goto/16 :goto_7

    :cond_6
    :goto_2
    const-string v1, "\u073a\u06ec"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x1887

    const v15, 0x16416cd6

    xor-int/2addr v2, v15

    const v15, -0x52a9f2cd

    goto/16 :goto_7

    :sswitch_c
    const-wide/16 v1, 0x0

    move-wide/from16 v16, v1

    :goto_3
    const-string v1, "\u06e8\u073a"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0xb3

    const v15, -0xe9a8f08

    xor-int/2addr v2, v15

    const v15, -0x5c787559

    goto/16 :goto_7

    .line 208
    :sswitch_d
    invoke-static {}, Ll/֡ܳ;->ۛ᩶ܺ()I

    move-result v1

    if-ltz v1, :cond_7

    goto :goto_5

    :cond_7
    const-string v1, "\u06e8\u1a78"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x6131

    const v15, 0x13216901

    xor-int/2addr v2, v15

    const v15, -0x5b64afb4

    goto/16 :goto_7

    .line 22
    :sswitch_e
    sget v1, Ll/ۖ;->ܿۚ֡:I

    if-ltz v1, :cond_8

    :goto_4
    const-string v1, "\u06df\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x6563

    const v15, 0x355183f6

    xor-int/2addr v2, v15

    const v15, 0x4bab05c6    # 2.2416268E7f

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u0733\u06eb"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x75

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x2dbd

    const v15, -0x587cd34d

    xor-int/2addr v2, v15

    const v15, -0x55c6078f

    goto/16 :goto_7

    .line 170
    :sswitch_f
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v1, "\u06e8\u05a8"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, 0x29

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, -0x17f9

    const v15, -0x170f9872

    xor-int/2addr v2, v15

    const v15, 0x77724018

    goto/16 :goto_7

    .line 141
    :sswitch_10
    invoke-static {}, Ll/ۘܶ;->᩷ܳۡ()I

    move-result v1

    if-gtz v1, :cond_b

    :cond_a
    :goto_5
    const-string v1, "\u073a\u073d"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x7d59

    const v15, 0x35c3b68a

    xor-int/2addr v2, v15

    const v15, -0x17b1fdae

    goto :goto_7

    :cond_b
    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x60b3

    const v15, -0x15764b03

    xor-int/2addr v2, v15

    const v15, 0x185e74be

    goto :goto_7

    :sswitch_11
    sget v1, Ll/֡ۖ;->۫ۙ᩶:I

    if-gtz v1, :cond_c

    goto :goto_6

    :cond_c
    const-string v1, "\u05ab\u1a78"

    invoke-static {v1}, Ll/֡ᩴ;->ۨ۟ۛ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x73

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x15e5

    const v15, 0xe23f672

    xor-int/2addr v2, v15

    const v15, -0x46495270

    goto :goto_7

    .line 241
    :sswitch_12
    invoke-static {}, Ll/֡ۢ;->᩺֡᩸()Z

    move-result v1

    if-eqz v1, :cond_e

    :cond_d
    :goto_6
    const-string v1, "\u1a7b\u1a7b"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v13

    mul-int/lit16 v2, v2, 0x6ae3

    const v15, 0x62d2fa8d

    xor-int/2addr v2, v15

    const v15, -0x358235a8    # -4158102.0f

    goto :goto_7

    :cond_e
    const-string v1, "\u06e1\u1a73"

    invoke-static {v1}, Ll/֡᩻;->ᩳ᩷ۖ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x118d

    const v15, -0x1678209d

    xor-int/2addr v2, v15

    const v15, -0x61e6ed01

    :goto_7
    xor-int/2addr v1, v15

    move/from16 v18, v2

    move v2, v1

    move/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ec9fe0f -> :sswitch_12
        -0x73b708a8 -> :sswitch_5
        -0x7073127d -> :sswitch_5
        -0x6fcaae47 -> :sswitch_1
        -0x6d1d2ad2 -> :sswitch_8
        -0x660e6b80 -> :sswitch_9
        -0x6033179a -> :sswitch_3
        -0x43ac57b1 -> :sswitch_e
        -0x334070c8 -> :sswitch_f
        -0x30d65a6c -> :sswitch_f
        -0x23971d36 -> :sswitch_7
        -0x12ccca3f -> :sswitch_0
        -0x9b8520b -> :sswitch_e
        -0x7004864 -> :sswitch_4
        -0x2577943 -> :sswitch_10
        0x2037fa7 -> :sswitch_c
        0x2922b6d -> :sswitch_d
        0x3c816cb -> :sswitch_2
        0x6fb446f -> :sswitch_0
        0xafc296a -> :sswitch_a
        0xbce34ba -> :sswitch_a
        0x15001507 -> :sswitch_3
        0x1c1635ac -> :sswitch_8
        0x1fc6c2fe -> :sswitch_4
        0x238b247a -> :sswitch_10
        0x2d07e2ca -> :sswitch_c
        0x2d895280 -> :sswitch_12
        0x3103a56c -> :sswitch_6
        0x3730752e -> :sswitch_2
        0x38812236 -> :sswitch_11
        0x464d6b16 -> :sswitch_9
        0x4955c27e -> :sswitch_1
        0x4e5b6dac -> :sswitch_b
        0x5a4fffd7 -> :sswitch_11
        0x5c0280e9 -> :sswitch_7
        0x710df85c -> :sswitch_d
        0x7cf9c7ca -> :sswitch_b
        0x7f4028a8 -> :sswitch_6
    .end sparse-switch
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/ۡۜ᩹;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
