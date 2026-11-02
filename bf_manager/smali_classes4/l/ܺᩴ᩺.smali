.class public final Ll/ܺᩴ᩺;
.super Ll/ۗ᩷᩺;
.source "T5M8"


# static fields
.field private static final ֡ۢ۟:[S


# instance fields
.field public final synthetic ֨:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field public final synthetic ۘ:I

.field public final synthetic ۜ:Ljava/lang/String;

.field public final synthetic ۬:J

.field public final synthetic ᩹:Ll/۫ܶۘ;

.field public final synthetic ᩺:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    return-void

    :array_0
    .array-data 2
        0xfd4s
        -0x78b6s
        -0x78a5s
        -0x78bds
        -0x788ds
        -0x78acs
        -0x78a4s
        -0x78abs
        -0x78f5s
        -0x788bs
        -0x788fs
        -0x78f5s
        -0x78f2s
        -0x78fds
        -0x78f7s
        -0x78fds
        -0x78f4s
        -0x78f7s
        -0x78fds
        -0x78f4s
        -0x78f8s
        -0x78f8s
        -0x78f7s
        -0x78f2s
        -0x78f1s
        -0x78f4s
    .end array-data
.end method

.method public constructor <init>(Ll/۫ܶۘ;Ljava/lang/String;JILjava/lang/String;Lcom/tencent/mm/opensdk/openapi/IWXAPI;)V
    .locals 3

    const v0, -0x5190eabf

    sget v1, Ll/֫۟;->᩸ᩴܿ:I

    sget v2, Ll/֫;->ܶܺ᩻:I

    .line 2
    iput-object p1, p0, Ll/ܺᩴ᩺;->᩹:Ll/۫ܶۘ;

    .line 4
    iput-object p2, p0, Ll/ܺᩴ᩺;->ۜ:Ljava/lang/String;

    .line 6
    iput-wide p3, p0, Ll/ܺᩴ᩺;->۬:J

    .line 8
    iput p5, p0, Ll/ܺᩴ᩺;->ۘ:I

    .line 10
    iput-object p6, p0, Ll/ܺᩴ᩺;->᩺:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Ll/ܺᩴ᩺;->֨:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 116
    invoke-direct {p0}, Ll/ۗ᩷᩺;-><init>()V

    const-string p1, "\u06eb\u1a7a"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x43

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2acd

    const p3, -0x1c73d777

    xor-int/2addr p2, p3

    const p3, 0x7aeaf0f4

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x953

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 36
    invoke-static {}, Ll/֫᩺;->֡᩺ۨ()I

    goto :goto_3

    .line 19
    :sswitch_0
    invoke-static {}, Ll/֡ۛ;->᩶᩷ܺ()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06d9\u1a77"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x16d9

    const p3, -0x3a499998

    xor-int/2addr p2, p3

    const p3, 0x727d994a

    goto :goto_0

    .line 28
    :sswitch_1
    sget-boolean p1, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u06df\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x5b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0xffd

    const p3, -0x281e9494

    xor-int/2addr p2, p3

    const p3, 0x2926a5fb

    goto :goto_0

    .line 41
    :sswitch_2
    sget-boolean p1, Ll/֨֫;->᩸ۜ᩵:Z

    if-nez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u05a1\u0730"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x73

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0xbe7

    const p3, -0x50827483

    xor-int/2addr p2, p3

    const p3, 0x1b09e22

    goto :goto_0

    :goto_3
    const-string p1, "\u1a73\u073f"

    invoke-static {p1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x51

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x304d

    const p3, 0x114146d3

    xor-int/2addr p2, p3

    const p3, 0x763ff03d

    goto :goto_0

    .line 90
    :sswitch_3
    invoke-static {}, Ll/֫ܶ;->ܺ֨ᩳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 87
    :sswitch_5
    sget p1, Ll/ۖܽ;->ܳ۠᩹:I

    if-gtz p1, :cond_3

    const-string p1, "\u1a7b\u073a"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x71

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x3f85

    const p3, -0x6738d65d

    xor-int/2addr p2, p3

    const p3, 0x3fa1b41f

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e1\u05a8"

    invoke-static {p1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x55

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1f99

    const p3, 0x6dc1b421

    xor-int/2addr p2, p3

    const p3, -0x29cc2acd

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6dc8b87a -> :sswitch_0
        -0x65d515b3 -> :sswitch_4
        -0x5f80644f -> :sswitch_2
        -0x5110781c -> :sswitch_4
        -0x1af86495 -> :sswitch_1
        -0x1407b76a -> :sswitch_5
        -0xa1415fe -> :sswitch_1
        0xebd3875 -> :sswitch_2
        0x34f5b941 -> :sswitch_5
        0x4d4109c7 -> :sswitch_0
        0x5cdebe87 -> :sswitch_3
        0x7ba94d75 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ۖ()V
    .locals 0

    .line 152
    invoke-static {p0}, Ll/֨֫;->ۜ᩷᩺(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ()V
    .locals 0

    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0xac67d4f

    sget v2, Ll/֫;->ܶܺ᩻:I

    sget v3, Ll/ۘۗ;->ۖۧ۬:I

    const-string v4, "\u1a77\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x590d

    const v6, -0x1a530a21

    xor-int/2addr v5, v6

    const v6, 0x66f8dbc3

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x32df

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 430
    sget-boolean v4, Ll/֡ܽ;->ܰ᩶᩷:Z

    if-eqz v4, :cond_7

    goto/16 :goto_4

    .line 428
    :sswitch_0
    invoke-static {}, Ll/֨ܶ;->۬ܽۛ()I

    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v4

    if-lez v4, :cond_2

    goto/16 :goto_1

    .line 269
    :sswitch_1
    invoke-static {}, Ll/֡᩸;->ۤܶܰ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v4

    if-gtz v4, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡ܳ;->᩷ܰۗ()I

    goto/16 :goto_3

    .line 123
    :sswitch_4
    invoke-static {}, Ll/֡ۚ;->۟ۚ۠()Z

    invoke-static {}, Ll/֫ܺ;->۠ܰᩴ()I

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 546
    invoke-static {v0, p1, v1}, Ll/֫ܳ;->ܳܳۗ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 148
    :sswitch_6
    iget-object v0, p0, Ll/ܺᩴ᩺;->᩹:Ll/۫ܶۘ;

    sget v4, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a7b\u1a79"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x723b

    const v6, 0x654e0178

    xor-int/2addr v5, v6

    const v6, -0x4ce00d97

    goto :goto_0

    .line 212
    :sswitch_7
    sget v4, Ll/֫֡;->ۡ᩹ۗ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u1a76\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7d8f

    const v6, -0x21964ec6

    xor-int/2addr v5, v6

    const v6, -0x70c1aa60

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖۛ;->ۢ۠ۗ()I

    move-result v4

    if-gtz v4, :cond_3

    :cond_2
    const-string v4, "\u1a78\u06e1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6c9d

    const v6, 0x75e62e71

    xor-int/2addr v5, v6

    const v6, 0x488f1984    # 293068.12f

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a77\u06e1"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x72c5

    const v6, 0x36f20072

    xor-int/2addr v5, v6

    const v6, -0x78e656c1

    goto/16 :goto_0

    .line 400
    :sswitch_9
    sget v4, Ll/֨ܰ;->ۢ᩷۟:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a75\u06d8"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x17e7

    const v6, 0x46d3a122

    xor-int/2addr v5, v6

    const v6, -0x7ec8ed13

    goto/16 :goto_0

    .line 459
    :sswitch_a
    sget-boolean v4, Ll/֨۟;->ܿ᩻۫:Z

    if-eqz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u05ab\u06d9"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5ac3

    const v6, -0x4597dc08

    xor-int/2addr v5, v6

    const v6, 0x3e92229f

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e8\u1a7a"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x66a7

    const v6, -0x7849e2d8

    xor-int/2addr v5, v6

    const v6, 0x537d4175

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06da\u1a7b"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x760d

    const v6, -0x1f4eb717

    xor-int/2addr v5, v6

    const v6, 0x16301c53

    goto/16 :goto_0

    .line 128
    :sswitch_b
    invoke-static {}, Ll/ۘۛ;->᩺᩷ܿ()I

    move-result v4

    if-gtz v4, :cond_8

    goto :goto_2

    :cond_8
    const-string v4, "\u06e7\u1a7a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x64b7

    const v6, 0x4dc4a020

    xor-int/2addr v5, v6

    const v6, 0x27eabfc7

    goto/16 :goto_0

    .line 60
    :sswitch_c
    sget v4, Ll/֫;->ܶܺ᩻:I

    if-ltz v4, :cond_9

    :goto_2
    const-string v4, "\u06e0\u06da"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5cad

    const v6, -0x599cc2dd

    xor-int/2addr v5, v6

    const v6, -0x4792961c

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e0\u05ab"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7909

    const v6, 0x46ff48e9

    xor-int/2addr v5, v6

    const v6, 0x69f4e588

    goto/16 :goto_0

    .line 104
    :sswitch_d
    sget v4, Ll/֡ܳ;->֡۠ۧ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u0733\u1a7b"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2e15

    const v6, 0xaddbb9f

    xor-int/2addr v5, v6

    const v6, 0x73699769

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06dc\u05a1"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x280f

    const v6, 0x15817ec6

    xor-int/2addr v5, v6

    const v6, -0x5e16e941

    goto/16 :goto_0

    .line 109
    :sswitch_e
    sget v4, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06e1\u06e2"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6253

    const v6, 0x249f543c

    xor-int/2addr v5, v6

    const v6, 0x37c431ef

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u1a75"

    invoke-static {v4}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4c49

    const v6, 0x332e4706

    xor-int/2addr v5, v6

    const v6, -0x732b6fbf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e612c0f -> :sswitch_a
        -0x7d129ac2 -> :sswitch_e
        -0x7b4f4baa -> :sswitch_0
        -0x76ad4b06 -> :sswitch_c
        -0x721d450b -> :sswitch_b
        -0x71c5b3ce -> :sswitch_b
        -0x6a5d7d84 -> :sswitch_8
        -0x4894cbaf -> :sswitch_9
        -0x3484ad6c -> :sswitch_3
        -0x257bee59 -> :sswitch_2
        -0x21c2cfb8 -> :sswitch_9
        -0x1b38b07e -> :sswitch_4
        -0x119dc138 -> :sswitch_7
        0x1b7a400b -> :sswitch_d
        0x1f1538d7 -> :sswitch_1
        0x22b455d8 -> :sswitch_c
        0x2afd059e -> :sswitch_3
        0x40603f41 -> :sswitch_7
        0x44a69c10 -> :sswitch_2
        0x48b0b870 -> :sswitch_6
        0x4c509fe4 -> :sswitch_a
        0x570a3881 -> :sswitch_5
        0x5a483ee8 -> :sswitch_1
        0x5c7b37a8 -> :sswitch_0
        0x6522ac58 -> :sswitch_8
        0x69054f90 -> :sswitch_5
        0x6ebcac29 -> :sswitch_d
        0x707f9d80 -> :sswitch_6
        0x70fcaabc -> :sswitch_4
        0x7c51ba47 -> :sswitch_e
    .end sparse-switch
.end method

.method public final ۚ()V
    .locals 35

    move-object/from16 v0, p0

    const-wide/16 v2, 0x0

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

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x20713c63

    sget v24, Ll/ۧ;->֫۠ᩴ:I

    sget v25, Ll/ۗ۬;->ۤᩴ᩻:I

    const-string v26, "\u06e0\u1a7b"

    invoke-static/range {v26 .. v26}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v26

    xor-int v26, v26, v24

    mul-int/lit8 v26, v26, -0x11

    xor-int v1, v26, v25

    mul-int/lit16 v1, v1, 0x79ab

    const v28, -0x56d787ad

    xor-int v1, v1, v28

    const v28, 0x1d6dd9c4

    xor-int v26, v26, v28

    move-wide/from16 v21, v2

    move-object/from16 v23, v6

    move-object/from16 v28, v8

    move-object v11, v10

    move-object v15, v14

    move-object/from16 v13, v16

    move-object/from16 v6, v18

    move-object/from16 v3, v20

    move/from16 v27, v26

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v26, 0x20713c63

    move-object/from16 v18, v4

    move-object v8, v7

    move-object v10, v9

    const/4 v4, 0x0

    const/4 v7, 0x0

    :goto_0
    xor-int v9, v26, v25

    mul-int/lit16 v9, v9, -0x42a3

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v1, v9

    xor-int v26, v27, v1

    sparse-switch v26, :sswitch_data_0

    move-object/from16 v27, v3

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v23, v20

    move/from16 v20, v4

    mul-int v1, v17, v17

    mul-int v2, v16, v16

    const v3, 0x1062961

    add-int/2addr v2, v3

    add-int/2addr v2, v2

    sub-int/2addr v1, v2

    if-lez v1, :cond_11

    const-string v1, "\u073a\u1a74"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v2, v1, v25

    mul-int/lit16 v2, v2, -0x1413

    const v3, -0x6ef172c4

    xor-int/2addr v2, v3

    const v3, 0x42ecd17b

    goto/16 :goto_14

    .line 94
    :sswitch_0
    sget-boolean v1, Ll/ۖۛ;->ۡܶ۬:Z

    if-nez v1, :cond_0

    :goto_1
    move-object/from16 v27, v3

    move-object v9, v8

    move-object/from16 v8, v20

    move/from16 v20, v4

    move-wide/from16 v3, v21

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    goto/16 :goto_c

    :cond_0
    move-object/from16 v27, v3

    goto/16 :goto_5

    .line 75
    :sswitch_1
    invoke-static {}, Ll/ۖᩴ;->ᩳۢ᩶()I

    move-result v1

    if-gtz v1, :cond_2

    :cond_1
    move-object/from16 v27, v3

    :goto_2
    move-object/from16 v29, v18

    move/from16 v9, v19

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v23, v20

    move/from16 v20, v4

    goto/16 :goto_16

    :cond_2
    move-object/from16 v27, v3

    move-object/from16 v3, v28

    move/from16 v28, v2

    move-object/from16 v2, v23

    goto/16 :goto_b

    .line 148
    :sswitch_2
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    invoke-static {}, Ll/ۘ֡;->ۡۧܿ()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۖ;->ۘ᩸֫()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֨ܰ;->ᩴۡ᩺()I

    return-void

    .line 138
    :sswitch_5
    invoke-static {v3, v4, v7, v14}, Ll/֨᩹;->ۚܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 139
    invoke-static {v8, v1}, Ll/֫ۚ;->ᩳܶ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->sign:Ljava/lang/String;

    .line 140
    iget-object v1, v0, Ll/ܺᩴ᩺;->֨:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v1, v10}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-object/from16 v27, v3

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-object/from16 v1, v20

    move-wide/from16 v18, v21

    move-object/from16 v21, v28

    move/from16 v28, v2

    goto/16 :goto_9

    .line 138
    :sswitch_6
    invoke-static {v8, v11}, Ll/ۖۧ;->ܺܶ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->packageValue:Ljava/lang/String;

    sget-object v3, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v4, 0x19

    const/4 v7, 0x1

    const-string v1, "\u06e8\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x39

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, -0x5365

    const v27, -0x2f2e7354

    xor-int v9, v9, v27

    const v27, -0x377bc74c

    goto :goto_3

    .line 137
    :sswitch_7
    sget-object v1, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v9, 0x18

    const/4 v11, 0x1

    invoke-static {v1, v9, v11, v14}, Ll/ۘۛ;->᩷ۧ᩹([SIII)Ljava/lang/String;

    move-result-object v11

    sget v1, Ll/ۘۧ;->ܳ᩷᩸:I

    if-gtz v1, :cond_3

    move-object/from16 v27, v3

    goto :goto_4

    :cond_3
    const-string v1, "\u06d8\u1a76"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x27

    xor-int v9, v1, v25

    mul-int/lit16 v9, v9, -0x5f09

    const v27, 0x17a14afc

    xor-int v9, v9, v27

    const v27, -0x38b9780a

    :goto_3
    xor-int v27, v1, v27

    goto/16 :goto_8

    .line 136
    :sswitch_8
    sget-object v1, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v9, 0x17

    move-object/from16 v27, v3

    const/4 v3, 0x1

    invoke-static {v1, v9, v3, v14}, Ll/֫ۛ;->ۖۖۜ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 137
    invoke-static {v8, v1}, Ll/֫ۚ;->ᩳܶ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;

    .line 3
    invoke-static {}, Ll/ۖܽ;->᩷۬ۢ()I

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u1a73\u06e1"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x4d

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, -0x2341

    const v9, 0x1cfa94c5

    xor-int/2addr v3, v9

    const v9, -0x11dc42c2

    goto/16 :goto_a

    :sswitch_9
    move-object/from16 v27, v3

    const/4 v1, 0x1

    .line 135
    invoke-static {v6, v2, v1, v14}, Ll/֨ܰ;->ܺۖ۫([SIII)Ljava/lang/String;

    move-result-object v1

    .line 136
    invoke-static {v8, v1}, Ll/ۖۧ;->ܺܶ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;

    .line 92
    sget v1, Ll/֫ۚ;->ܽ۠᩹:I

    if-ltz v1, :cond_5

    :goto_4
    move/from16 v3, v19

    move-object/from16 v1, v20

    move/from16 v20, v4

    move-object/from16 v31, v28

    move/from16 v28, v2

    move-object/from16 v2, v18

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v31

    goto/16 :goto_e

    :cond_5
    const-string v1, "\u05ab\u05a1"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x5f

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, 0x61e9

    const v9, -0x2edcca2d

    xor-int/2addr v3, v9

    const v9, -0x251aace9

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v27, v3

    const/4 v1, 0x1

    .line 134
    invoke-static {v13, v5, v1, v14}, Ll/ۧ;->۫֨۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 135
    invoke-static {v8, v1}, Ll/֫ۚ;->ᩳܶ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->prepayId:Ljava/lang/String;

    sget-object v6, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v2, 0x16

    sget v1, Ll/֫ܳ;->᩶ۧۛ:I

    if-ltz v1, :cond_6

    :goto_5
    const-string v1, "\u06e1\u1a78"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, 0x15

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, 0x7565

    const v9, -0x608c9a55

    xor-int/2addr v3, v9

    const v9, 0x52240d46

    goto/16 :goto_a

    :cond_6
    const-string v1, "\u06e8\u0733"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, -0x3f

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, -0x54b7

    const v9, -0x5d3d4c2c

    xor-int/2addr v3, v9

    const v9, -0x765ef9da

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v27, v3

    const/16 v1, 0xa

    .line 133
    invoke-static {v15, v12, v1, v14}, Ll/ۗ;->ۘ۫᩹([SIII)Ljava/lang/String;

    move-result-object v1

    .line 134
    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->partnerId:Ljava/lang/String;

    sget-object v13, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v5, 0x15

    .line 149
    sget-boolean v1, Ll/֫ܺ;->ۜ᩶ܽ:Z

    if-nez v1, :cond_7

    :goto_6
    goto/16 :goto_2

    :cond_7
    const-string v1, "\u06d7\u1a76"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, -0x1b

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, -0xae3

    const v9, -0x30ba1e9a

    xor-int/2addr v3, v9

    const v9, 0x7fa961ce

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v27, v3

    .line 132
    new-instance v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;

    invoke-direct {v10}, Lcom/tencent/mm/opensdk/modelpay/PayReq;-><init>()V

    .line 133
    invoke-static {}, Ll/᩶ᩴ᩺;->ܰ()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v10, Lcom/tencent/mm/opensdk/modelpay/PayReq;->appId:Ljava/lang/String;

    sget-object v15, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v12, 0xb

    sget v1, Ll/֨ܶ;->ۛۛۛ:I

    if-gtz v1, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, -0x55e7

    const v9, 0x2be96932

    xor-int/2addr v3, v9

    const v9, 0x39501d78

    goto :goto_a

    :sswitch_d
    move-object/from16 v27, v3

    .line 130
    sget-object v1, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v3, 0x9

    const/4 v9, 0x2

    invoke-static {v1, v3, v9, v14}, Ll/֫ܶ;->۟ۢۚ([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v28

    .line 169
    invoke-static {v1, v3}, Ll/֡ܳ;->᩷᩹᩻(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "\u1a75\u06d7"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, -0x1b

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, 0x106b

    const v28, -0x482699bc

    xor-int v9, v9, v28

    const v28, -0x552d9875

    xor-int v1, v1, v28

    :goto_7
    move-object/from16 v28, v3

    move-object/from16 v3, v27

    move/from16 v27, v1

    :goto_8
    move v1, v9

    goto/16 :goto_0

    :cond_9
    move/from16 v28, v2

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-object/from16 v1, v20

    move-wide/from16 v18, v21

    move-object/from16 v21, v3

    :goto_9
    move/from16 v20, v4

    goto/16 :goto_12

    :sswitch_e
    move-object/from16 v27, v3

    .line 129
    sget-object v1, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/16 v3, 0x8

    const/4 v9, 0x1

    invoke-static {v1, v3, v9, v14}, Ll/ۘۗ;->᩺ۛۙ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 130
    invoke-static {v8, v1}, Ll/ۖۧ;->ܺܶ۟(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v28

    const-string v1, "\u073d\u06da"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v3, v1, v24

    mul-int/lit16 v3, v3, -0x5bc5

    const v9, -0x542f5892

    xor-int/2addr v3, v9

    const v9, -0x594233bc

    :goto_a
    xor-int/2addr v1, v9

    goto/16 :goto_10

    :sswitch_f
    move-object/from16 v27, v3

    move-object/from16 v3, v28

    .line 126
    sget-object v1, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/4 v9, 0x1

    move/from16 v28, v2

    const/4 v2, 0x7

    invoke-static {v1, v9, v2, v14}, Ll/֡᩶;->ۢۖ۟([SIII)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v23

    .line 127
    invoke-static {v2, v1}, Ll/֫ۚ;->ᩳܶ֡(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 128
    new-instance v9, Ll/᩷ᩴ᩺;

    .line 48
    invoke-static {}, Ll/֡֡;->᩹᩻ۚ()I

    move-result v23

    if-gtz v23, :cond_a

    :goto_b
    const-string v1, "\u1a7b\u1a7b"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x73

    xor-int v9, v1, v24

    mul-int/lit16 v9, v9, 0x5c9f

    const v23, 0x469b989b

    xor-int v9, v9, v23

    const v23, 0x7e2b5a2b

    xor-int v1, v1, v23

    move-object/from16 v23, v2

    move/from16 v2, v28

    goto :goto_7

    :cond_a
    move-object/from16 v8, v20

    move/from16 v20, v4

    move-wide/from16 v31, v21

    move-object/from16 v21, v3

    move-wide/from16 v3, v31

    .line 128
    invoke-direct {v9, v2, v8, v3, v4}, Ll/᩷ᩴ᩺;-><init>(Lorg/json/JSONObject;Ljava/lang/String;J)V

    sput-object v9, Ll/᩶ᩴ᩺;->ۨ:Ljava/lang/Runnable;

    .line 129
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ll/֫ۘ;->ۜۢۧ()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_c
    const-string v1, "\u1a74\u1a75"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x73

    move-object/from16 v22, v2

    xor-int v2, v1, v24

    mul-int/lit16 v2, v2, 0x5db9

    const v23, 0x3a9e0a60

    xor-int v2, v2, v23

    const v23, -0x4c212260

    goto :goto_d

    :cond_b
    move-object/from16 v22, v2

    const-string v1, "\u06db\u073d"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v2, v1, v25

    mul-int/lit16 v2, v2, -0x6679

    const v23, 0x5ed16322

    xor-int v2, v2, v23

    const v23, 0x8c8bea3

    :goto_d
    xor-int v1, v1, v23

    move-object/from16 v23, v22

    move-object/from16 v31, v27

    move/from16 v27, v1

    move v1, v2

    move/from16 v2, v28

    move-object/from16 v28, v21

    move-wide/from16 v21, v3

    move/from16 v4, v20

    move-object/from16 v3, v31

    move-object/from16 v20, v8

    move-object v8, v9

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v27, v3

    move-object/from16 v1, v20

    move/from16 v20, v4

    move-wide/from16 v3, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    .line 126
    invoke-static {}, Ll/᩶ᩴ᩺;->ۙ()J

    move-result-wide v29

    cmp-long v2, v3, v29

    if-eqz v2, :cond_c

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-object/from16 v23, v22

    move-wide/from16 v18, v3

    goto/16 :goto_12

    :cond_c
    const-string v2, "\u06e2\u05a8"

    invoke-static {v2}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v9, v2, v24

    mul-int/lit16 v9, v9, -0x5cb1

    const v23, -0x3efdaf1

    xor-int v9, v9, v23

    const v23, 0x3d99e55d

    xor-int v2, v2, v23

    move-object/from16 v23, v22

    move/from16 v31, v20

    move-object/from16 v20, v1

    move v1, v9

    move-object/from16 v32, v27

    move/from16 v27, v2

    move/from16 v2, v28

    move-object/from16 v28, v21

    move-wide/from16 v21, v3

    move/from16 v4, v31

    move-object/from16 v3, v32

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v1, v20

    move/from16 v20, v4

    move-wide/from16 v3, v21

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v2, v18

    .line 163
    invoke-virtual {v2, v9}, Ll/ۖᩴ᩺;->ۙ(I)V

    move-wide/from16 v18, v3

    iget-object v3, v0, Ll/ܺᩴ᩺;->᩺:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/֨۟;->᩸֫ۗ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 162
    invoke-static {v2}, Ll/֫ᩴ᩺;->ۙ(Ll/ۖᩴ᩺;)Lorg/json/JSONObject;

    move-result-object v23

    .line 126
    invoke-static {}, Ll/֡᩸;->۟ܳۙ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܰ֡۠;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v24

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v25

    mul-int/lit16 v4, v4, -0x4ced

    const v22, 0x5d71c50a

    xor-int v4, v4, v22

    const v22, 0x13d50de8

    xor-int v3, v3, v22

    move/from16 v31, v20

    move-object/from16 v20, v1

    move v1, v4

    move/from16 v4, v31

    move-wide/from16 v32, v18

    move-object/from16 v18, v2

    move/from16 v19, v9

    move/from16 v2, v28

    move-object/from16 v28, v21

    move-wide/from16 v21, v32

    move-object/from16 v34, v27

    move/from16 v27, v3

    move-object/from16 v3, v34

    goto/16 :goto_0

    :cond_d
    move-object/from16 v29, v2

    goto/16 :goto_12

    :sswitch_12
    move-object/from16 v27, v3

    move-object/from16 v1, v20

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move/from16 v20, v4

    .line 125
    sget-object v2, Ll/᩶ᩴ᩺;->ۙ:Ll/ۡ᩺ۙ;

    const/16 v2, 0x1112

    .line 162
    invoke-static {v2}, Ll/֨ܰ;->ۚᩳ۠(I)Ll/ۖᩴ᩺;

    move-result-object v2

    .line 163
    iget v3, v0, Ll/ܺᩴ᩺;->ۘ:I

    invoke-virtual {v2, v3}, Ll/ۖᩴ᩺;->ۨ(I)V

    const/4 v3, 0x1

    .line 6
    sget v4, Ll/֫᩺;->᩺۟ۘ:I

    if-gtz v4, :cond_e

    :goto_e
    const-string v4, "\u06d7\u073a"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v25

    xor-int v9, v4, v24

    mul-int/lit16 v9, v9, -0x50b1

    const v23, -0x5b13c871

    xor-int v9, v9, v23

    const v23, -0xc969fee

    xor-int v4, v4, v23

    move-object/from16 v23, v22

    move/from16 v31, v20

    move-object/from16 v20, v1

    move v1, v9

    move-wide/from16 v32, v18

    move-object/from16 v18, v2

    move/from16 v19, v3

    move-object/from16 v3, v27

    move/from16 v2, v28

    move/from16 v27, v4

    move/from16 v4, v31

    move-object/from16 v28, v21

    goto/16 :goto_f

    :cond_e
    const-string v4, "\u06e1\u1a79"

    invoke-static {v4}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v24

    xor-int v9, v4, v25

    mul-int/lit16 v9, v9, -0x392d

    const v23, 0x5317f65

    xor-int v9, v9, v23

    const v23, 0x7d216f81

    xor-int v4, v4, v23

    move-object/from16 v23, v22

    move-object/from16 v3, v27

    move/from16 v27, v4

    move/from16 v4, v20

    move-object/from16 v20, v1

    move v1, v9

    move-wide/from16 v31, v18

    move-object/from16 v18, v2

    move/from16 v2, v28

    const/16 v19, 0x1

    move-object/from16 v28, v21

    move-wide/from16 v21, v31

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v27, v3

    move/from16 v9, v19

    move-object/from16 v1, v20

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move/from16 v20, v4

    move-object/from16 v2, v18

    .line 124
    invoke-static {}, Ll/᩶ᩴ᩺;->ۙ()J

    move-result-wide v3

    move-object/from16 v23, v1

    move-object/from16 v29, v2

    iget-wide v1, v0, Ll/ܺᩴ᩺;->۬:J

    cmp-long v18, v1, v3

    if-eqz v18, :cond_f

    move-wide/from16 v18, v1

    move-object/from16 v1, v23

    goto/16 :goto_11

    :cond_f
    const-string v3, "\u06e4\u05ab"

    invoke-static {v3}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v25, v3

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v24

    mul-int/lit16 v4, v4, -0x2013

    const v18, 0x69e68644

    xor-int v4, v4, v18

    const v18, -0x1b40be53

    xor-int v3, v3, v18

    move/from16 v19, v9

    move-object/from16 v18, v29

    move-object/from16 v31, v27

    move/from16 v27, v3

    move-object/from16 v3, v31

    move-wide/from16 v32, v1

    move v1, v4

    move/from16 v4, v20

    move-object/from16 v20, v23

    move/from16 v2, v28

    move-object/from16 v28, v21

    move-object/from16 v23, v22

    :goto_f
    move-wide/from16 v21, v32

    goto/16 :goto_0

    :sswitch_14
    return-void

    :sswitch_15
    move-object/from16 v27, v3

    move/from16 v20, v4

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    invoke-static {}, Ll/֫ܳ;->᩸᩸֨()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Ll/ܺᩴ᩺;->ۜ:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ܰ֡۠;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const-string v1, "\u06d7\u06e8"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v3, v1, v25

    mul-int/lit16 v3, v3, -0x837

    const v4, -0x59a2e725

    xor-int/2addr v3, v4

    const v4, 0x4930cebd

    xor-int/2addr v1, v4

    move/from16 v4, v20

    move-object/from16 v23, v22

    move-object/from16 v20, v2

    move/from16 v2, v28

    move-object/from16 v28, v21

    move-wide/from16 v21, v18

    move-object/from16 v18, v29

    move/from16 v19, v9

    :goto_10
    move-object/from16 v31, v27

    move/from16 v27, v1

    move v1, v3

    goto/16 :goto_17

    :cond_10
    move-object v1, v2

    :goto_11
    move-object/from16 v23, v22

    :goto_12
    const-string v2, "\u06ec\u1a7b"

    invoke-static {v2}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v3, v2, v24

    mul-int/lit16 v3, v3, -0x41b3

    const v4, -0x36bb9a4f

    xor-int/2addr v3, v4

    const v4, -0x7d8065d5

    xor-int/2addr v2, v4

    move/from16 v4, v20

    move-object/from16 v20, v1

    move v1, v3

    move-object/from16 v3, v27

    move/from16 v27, v2

    goto/16 :goto_15

    :sswitch_16
    move-object/from16 v27, v3

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v23, v20

    move/from16 v20, v4

    const v1, 0xfe46

    const v14, 0xfe46

    goto :goto_13

    :sswitch_17
    move-object/from16 v27, v3

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v23, v20

    move/from16 v20, v4

    const v1, 0x873a

    const v14, 0x873a

    :goto_13
    const-string v1, "\u05ab\u06df"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x2b

    xor-int v2, v1, v24

    mul-int/lit16 v2, v2, 0x1119

    const v3, 0x39a60fcf

    xor-int/2addr v2, v3

    const v3, 0x73b4c54a

    goto :goto_14

    :cond_11
    const-string v1, "\u06e1\u06e7"

    invoke-static {v1}, Ll/᩶;->᩻֫ۘ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x63

    xor-int v2, v1, v24

    mul-int/lit16 v2, v2, -0x2499

    const v3, -0x2243e6cd

    xor-int/2addr v2, v3

    const v3, 0x78278195

    :goto_14
    xor-int/2addr v1, v3

    move/from16 v4, v20

    move-object/from16 v20, v23

    move-object/from16 v3, v27

    move/from16 v27, v1

    move v1, v2

    move-object/from16 v23, v22

    :goto_15
    move/from16 v2, v28

    move-object/from16 v28, v21

    move-wide/from16 v21, v18

    move-object/from16 v18, v29

    move/from16 v19, v9

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v27, v3

    move-object/from16 v29, v18

    move/from16 v9, v19

    move-wide/from16 v18, v21

    move-object/from16 v22, v23

    move-object/from16 v21, v28

    move/from16 v28, v2

    move-object/from16 v23, v20

    move/from16 v20, v4

    sget-object v1, Ll/ܺᩴ᩺;->֡ۢ۟:[S

    const/4 v2, 0x0

    aget-short v1, v1, v2

    add-int/lit16 v2, v1, 0x1031

    sget v3, Ll/ۧ;->֫۠ᩴ:I

    if-ltz v3, :cond_12

    move/from16 v16, v1

    move/from16 v17, v2

    :goto_16
    const-string v1, "\u1a79\u06df"

    invoke-static {v1}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, -0xd

    xor-int v2, v1, v25

    mul-int/lit16 v2, v2, 0x5cf

    const v3, 0x52ca45c2

    xor-int/2addr v2, v3

    const v3, 0x784679b6

    goto :goto_14

    :cond_12
    const-string v3, "\u06d9\u0733"

    invoke-static {v3}, Ll/ۘۧ;->ܳۖ᩷(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v24

    xor-int v4, v3, v25

    mul-int/lit16 v4, v4, -0x893

    const v16, -0x1dc647fb

    xor-int v4, v4, v16

    const v16, 0x65296031    # 4.9990897E22f

    xor-int v3, v3, v16

    move/from16 v16, v1

    move/from16 v17, v2

    move v1, v4

    move/from16 v4, v20

    move-object/from16 v20, v23

    move/from16 v2, v28

    move-object/from16 v28, v21

    move-object/from16 v23, v22

    move-wide/from16 v21, v18

    move-object/from16 v18, v29

    move/from16 v19, v9

    move-object/from16 v31, v27

    move/from16 v27, v3

    :goto_17
    move-object/from16 v3, v31

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79abc263 -> :sswitch_b
        -0x78cc95d3 -> :sswitch_15
        -0x6364d414 -> :sswitch_f
        -0x60a9f5ab -> :sswitch_14
        -0x5bcbee23 -> :sswitch_12
        -0x596f60a5 -> :sswitch_11
        -0x593c7232 -> :sswitch_15
        -0x5033769e -> :sswitch_c
        -0x483366f6 -> :sswitch_e
        -0x4750446b -> :sswitch_17
        -0x4587208a -> :sswitch_1
        -0x449d3688 -> :sswitch_0
        -0x41f85e06 -> :sswitch_e
        -0x3dda83ae -> :sswitch_11
        -0x319bb00f -> :sswitch_10
        -0x3104c723 -> :sswitch_9
        -0x30947b49 -> :sswitch_a
        -0x2b473380 -> :sswitch_2
        -0x215fb657 -> :sswitch_6
        -0x20ffb19a -> :sswitch_12
        -0x1fbadb1e -> :sswitch_4
        -0x1f63c190 -> :sswitch_7
        -0x1ba12aad -> :sswitch_8
        -0x9cb17d9 -> :sswitch_13
        -0x6a7ac74 -> :sswitch_1
        -0x2cff703 -> :sswitch_10
        -0x2172896 -> :sswitch_16
        0x7bf3ece -> :sswitch_d
        0xb7869a9 -> :sswitch_13
        0x111ae9bc -> :sswitch_5
        0x1263087b -> :sswitch_d
        0x1911b123 -> :sswitch_4
        0x20e5c8f8 -> :sswitch_16
        0x21554a0a -> :sswitch_18
        0x237d7e93 -> :sswitch_14
        0x34dca141 -> :sswitch_3
        0x38727eb4 -> :sswitch_8
        0x3c0409e2 -> :sswitch_17
        0x414b195b -> :sswitch_2
        0x49bf9be1 -> :sswitch_5
        0x4dd774d4 -> :sswitch_18
        0x526baee6 -> :sswitch_0
        0x5b582f8d -> :sswitch_6
        0x63fb71a5 -> :sswitch_f
        0x72183370 -> :sswitch_c
        0x745d5106 -> :sswitch_9
        0x750cfdad -> :sswitch_b
        0x7b49bcd6 -> :sswitch_a
        0x7c86d243 -> :sswitch_3
        0x7c8705a5 -> :sswitch_7
    .end sparse-switch
.end method

.method public final ܰ()V
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ܺᩴ᩺;->᩹:Ll/۫ܶۘ;

    invoke-static {p0, v0}, Ll/֫ܳ;->᩺᩻᩺(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
