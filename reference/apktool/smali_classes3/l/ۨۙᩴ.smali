.class public final Ll/ۨۙᩴ;
.super Ljava/lang/Object;
.source "E6SN"


# instance fields
.field public final ֫:Z

.field public final ۗ:Ljava/lang/Integer;

.field public final ۙ:Z

.field public final ۚ:Ljava/lang/String;

.field public final ۛ:I

.field public final ۤ:Z

.field public final ۧ:F

.field public final ۨ:Z

.field public final ۫:Ljava/lang/Integer;

.field public final ܳ:Z

.field public final ܶ:Ljava/lang/String;

.field public final ܺ:Z

.field public final ܽ:F

.field public final ᩴ:Z

.field public final ᩵:F

.field public final ᩷:Z

.field public final ᩸:I

.field public final ᩹:I

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IIIFFFZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    move-object v0, p0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 24
    iput-object v1, v0, Ll/ۨۙᩴ;->ۚ:Ljava/lang/String;

    move-object v1, p2

    iput-object v1, v0, Ll/ۨۙᩴ;->ܶ:Ljava/lang/String;

    move v1, p3

    iput v1, v0, Ll/ۨۙᩴ;->᩸:I

    move v1, p4

    iput v1, v0, Ll/ۨۙᩴ;->᩹:I

    move v1, p5

    .line 25
    iput v1, v0, Ll/ۨۙᩴ;->ۛ:I

    move v1, p6

    iput v1, v0, Ll/ۨۙᩴ;->᩵:F

    move v1, p9

    iput-boolean v1, v0, Ll/ۨۙᩴ;->֫:Z

    move v1, p7

    .line 26
    iput v1, v0, Ll/ۨۙᩴ;->ۧ:F

    move v1, p8

    iput v1, v0, Ll/ۨۙᩴ;->ܽ:F

    move v1, p10

    .line 27
    iput-boolean v1, v0, Ll/ۨۙᩴ;->ۤ:Z

    move v1, p11

    iput-boolean v1, v0, Ll/ۨۙᩴ;->ᩴ:Z

    move v1, p12

    iput-boolean v1, v0, Ll/ۨۙᩴ;->᩻:Z

    move v1, p13

    .line 28
    iput-boolean v1, v0, Ll/ۨۙᩴ;->ܺ:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Ll/ۨۙᩴ;->ܳ:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Ll/ۨۙᩴ;->᩷:Z

    move/from16 v1, p16

    iput-boolean v1, v0, Ll/ۨۙᩴ;->ۨ:Z

    move/from16 v1, p17

    .line 29
    iput-boolean v1, v0, Ll/ۨۙᩴ;->ۙ:Z

    move-object/from16 v1, p18

    iput-object v1, v0, Ll/ۨۙᩴ;->ۗ:Ljava/lang/Integer;

    move-object/from16 v1, p19

    iput-object v1, v0, Ll/ۨۙᩴ;->۫:Ljava/lang/Integer;

    return-void
.end method

.method public static ۙ(Ljava/io/ByteArrayInputStream;JI)Ll/ۨۙᩴ;
    .locals 27

    move-wide/from16 v0, p1

    move-object/from16 v2, p0

    move/from16 v3, p3

    .line 66
    invoke-static {v0, v1, v2}, Ll/ܺ֡᩸;->ۙ(JLjava/io/InputStream;)Ll/ܺ֡᩸;

    move-result-object v2

    if-ltz v3, :cond_a

    int-to-long v4, v3

    cmp-long v6, v0, v4

    if-gtz v6, :cond_a

    .line 68
    :try_start_0
    invoke-virtual {v2, v3}, Ll/ܺ֡᩸;->ۤ(I)Ljava/lang/String;

    move-result-object v8

    .line 69
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v16

    .line 70
    invoke-virtual {v2}, Ll/ܺ֡᩸;->readByte()I

    move-result v0

    int-to-byte v10, v0

    .line 49
    invoke-virtual {v2}, Ll/ܺ֡᩸;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    .line 72
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۡ᩷()I

    move-result v11

    .line 73
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v17

    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v18

    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v19

    .line 74
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v20

    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v21

    const/4 v0, 0x0

    if-eqz v21, :cond_0

    .line 75
    invoke-virtual {v2, v3}, Ll/ܺ֡᩸;->ۤ(I)Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object v9, v0

    .line 76
    :goto_0
    invoke-virtual {v2}, Ll/ܺ֡᩸;->᩷()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v1, 0x0

    cmp-long v7, v3, v5

    if-nez v7, :cond_1

    const/4 v3, 0x0

    const/4 v12, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ll/ܺ֡᩸;->readInt()I

    move-result v3

    move v12, v3

    :goto_1
    const v3, 0x23456223

    const/4 v4, 0x0

    if-lt v12, v3, :cond_9

    const v3, 0x23456228

    if-gt v12, v3, :cond_8

    .line 82
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v5

    const v6, 0x23456225

    if-lt v12, v6, :cond_2

    .line 83
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    const v7, 0x23456224

    if-lt v12, v7, :cond_3

    .line 84
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v1

    :cond_3
    const v7, 0x23456226

    if-lt v12, v7, :cond_4

    .line 85
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v2}, Ll/ܺ֡᩸;->readInt()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_3

    :cond_4
    move-object v7, v0

    :goto_3
    const v14, 0x23456227

    if-lt v12, v14, :cond_5

    .line 86
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۙ()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v2}, Ll/ܺ֡᩸;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_5
    if-lt v12, v3, :cond_7

    .line 49
    invoke-virtual {v2}, Ll/ܺ֡᩸;->readInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v2}, Ll/ܺ֡᩸;->readInt()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    const v15, 0x3f4ccccd    # 0.8f

    cmpl-float v15, v3, v15

    if-ltz v15, :cond_6

    const/high16 v15, 0x40000000    # 2.0f

    cmpg-float v15, v3, v15

    if-gtz v15, :cond_6

    cmpl-float v4, v14, v4

    if-ltz v4, :cond_6

    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v4, v14, v4

    if-gez v4, :cond_6

    move-object/from16 v26, v0

    move/from16 v24, v1

    move/from16 v22, v5

    move/from16 v23, v6

    move-object/from16 v25, v7

    move v15, v14

    move v14, v3

    goto :goto_4

    .line 91
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid line metrics"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    move-object/from16 v26, v0

    move/from16 v24, v1

    move/from16 v22, v5

    move/from16 v23, v6

    move-object/from16 v25, v7

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    goto :goto_4

    .line 81
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported legacy text config version"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_9
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ܳ()V

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v25, v0

    move-object/from16 v26, v25

    const/high16 v14, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 97
    :goto_4
    invoke-virtual {v2}, Ll/ܺ֡᩸;->ۤ()V

    .line 98
    new-instance v0, Ll/ۨۙᩴ;

    move-object v7, v0

    invoke-direct/range {v7 .. v26}, Ll/ۨۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/String;IIIFFFZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-virtual {v2}, Ll/ܺ֡᩸;->close()V

    return-object v0

    .line 67
    :cond_a
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Legacy text config exceeds app state limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 66
    :try_start_2
    invoke-virtual {v2}, Ll/ܺ֡᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1
.end method

.method public static ᩷(Ll/ܰۤᩴ;)Ll/ۨۙᩴ;
    .locals 23

    move-object/from16 v0, p0

    .line 34
    new-instance v21, Ll/ۨۙᩴ;

    iget-object v1, v0, Ll/ܰۤᩴ;->ܿ᩷:Ljava/lang/String;

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    move-object v3, v1

    .line 35
    :goto_0
    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۙۤ:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Ll/ܰۤᩴ;->۬᩷:Ljava/lang/String;

    if-nez v1, :cond_2

    move-object/from16 v22, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :cond_2
    move-object/from16 v22, v1

    :goto_1
    iget v1, v0, Ll/ܰۤᩴ;->᩷ۤ:I

    int-to-byte v4, v1

    .line 36
    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->ܽ()I

    move-result v1

    const v2, 0xffff

    and-int v5, v1, v2

    iget-object v1, v0, Ll/ۚۚܺ;->۠:Ll/ۢܺۤ;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v7

    .line 37
    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->ۧ()F

    move-result v8

    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->֫()F

    move-result v9

    iget-boolean v10, v0, Ll/ܰۤᩴ;->ۡ᩷:Z

    .line 38
    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->ۗ()Z

    move-result v11

    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->᩵()Z

    move-result v12

    iget-boolean v13, v0, Ll/ܰۤᩴ;->ۛ᩷:Z

    iget-boolean v14, v0, Ll/ܰۤᩴ;->᩶᩷:Z

    iget-boolean v15, v0, Ll/ܰۤᩴ;->ۙۤ:Z

    .line 39
    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->ۨ()Z

    move-result v16

    invoke-virtual/range {p0 .. p0}, Ll/ۚۚܺ;->ۛ()Z

    move-result v17

    iget-boolean v1, v0, Ll/ܰۤᩴ;->ۜ᩷:Z

    move/from16 v18, v1

    iget-object v1, v0, Ll/ܰۤᩴ;->᩻ۙ:Ljava/lang/Integer;

    move-object/from16 v19, v1

    iget-object v0, v0, Ll/ܰۤᩴ;->ۧۙ:Ljava/lang/Integer;

    move-object/from16 v20, v0

    const v6, 0x23456228

    move-object/from16 v1, v21

    move-object v2, v3

    move-object/from16 v3, v22

    invoke-direct/range {v1 .. v20}, Ll/ۨۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/String;IIIFFFZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;)V

    return-object v21
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Ll/ۨۙᩴ;->ۚ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;Z)Ll/ۨۙᩴ;
    .locals 22

    move-object/from16 v0, p0

    .line 59
    new-instance v21, Ll/ۨۙᩴ;

    if-nez p1, :cond_0

    const-string v1, ""

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    if-nez p2, :cond_1

    iget-boolean v1, v0, Ll/ۨۙᩴ;->ܺ:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    const/4 v14, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    const/4 v14, 0x0

    :goto_1
    iget-object v1, v0, Ll/ۨۙᩴ;->ۗ:Ljava/lang/Integer;

    move-object/from16 v19, v1

    iget-object v1, v0, Ll/ۨۙᩴ;->۫:Ljava/lang/Integer;

    move-object/from16 v20, v1

    iget-object v3, v0, Ll/ۨۙᩴ;->ܶ:Ljava/lang/String;

    iget v4, v0, Ll/ۨۙᩴ;->᩸:I

    iget v5, v0, Ll/ۨۙᩴ;->᩹:I

    iget v6, v0, Ll/ۨۙᩴ;->ۛ:I

    iget v7, v0, Ll/ۨۙᩴ;->᩵:F

    iget v8, v0, Ll/ۨۙᩴ;->ۧ:F

    iget v9, v0, Ll/ۨۙᩴ;->ܽ:F

    iget-boolean v10, v0, Ll/ۨۙᩴ;->֫:Z

    iget-boolean v11, v0, Ll/ۨۙᩴ;->ۤ:Z

    iget-boolean v12, v0, Ll/ۨۙᩴ;->ᩴ:Z

    iget-boolean v13, v0, Ll/ۨۙᩴ;->᩻:Z

    iget-boolean v15, v0, Ll/ۨۙᩴ;->ܳ:Z

    iget-boolean v1, v0, Ll/ۨۙᩴ;->᩷:Z

    move/from16 v16, v1

    iget-boolean v1, v0, Ll/ۨۙᩴ;->ۨ:Z

    move/from16 v17, v1

    iget-boolean v1, v0, Ll/ۨۙᩴ;->ۙ:Z

    move/from16 v18, v1

    move-object/from16 v1, v21

    invoke-direct/range {v1 .. v20}, Ll/ۨۙᩴ;-><init>(Ljava/lang/String;Ljava/lang/String;IIIFFFZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;)V

    return-object v21
.end method

.method public final ۙ(Ll/ܰۤᩴ;)V
    .locals 2

    .line 105
    iget-object v0, p0, Ll/ۨۙᩴ;->ۚ:Ljava/lang/String;

    iput-object v0, p1, Ll/ܰۤᩴ;->ܿ᩷:Ljava/lang/String;

    iget-boolean v0, p0, Ll/ۨۙᩴ;->֫:Z

    iput-boolean v0, p1, Ll/ܰۤᩴ;->ۡ᩷:Z

    .line 106
    iget v0, p0, Ll/ۨۙᩴ;->᩸:I

    iget v1, p0, Ll/ۨۙᩴ;->᩵:F

    invoke-virtual {p1, v1, v0}, Ll/ܰۤᩴ;->ۙ(FI)V

    iget v0, p0, Ll/ۨۙᩴ;->᩹:I

    invoke-virtual {p1, v0}, Ll/ۚۚܺ;->ۙ(I)V

    .line 107
    iget v0, p0, Ll/ۨۙᩴ;->ۧ:F

    invoke-virtual {p1, v0}, Ll/ܰۤᩴ;->ۙ(F)V

    .line 108
    iget-boolean v0, p0, Ll/ۨۙᩴ;->ۤ:Z

    invoke-virtual {p1, v0}, Ll/ۚۚܺ;->ۙ(Z)V

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ᩴ:Z

    invoke-virtual {p1, v0}, Ll/ۚۚܺ;->᩷(Z)V

    .line 109
    iget-boolean v0, p0, Ll/ۨۙᩴ;->᩻:Z

    iput-boolean v0, p1, Ll/ܰۤᩴ;->ۛ᩷:Z

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ܺ:Z

    iput-boolean v0, p1, Ll/ܰۤᩴ;->᩶᩷:Z

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ܳ:Z

    iput-boolean v0, p1, Ll/ܰۤᩴ;->ۙۤ:Z

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Ll/ۨۙᩴ;->ܶ:Ljava/lang/String;

    iput-object v0, p1, Ll/ܰۤᩴ;->۬᩷:Ljava/lang/String;

    :cond_0
    const v0, 0x23456223

    .line 111
    iget v1, p0, Ll/ۨۙᩴ;->ۛ:I

    if-ge v1, v0, :cond_1

    return-void

    .line 112
    :cond_1
    iget-boolean v0, p0, Ll/ۨۙᩴ;->᩷:Z

    invoke-virtual {p1, v0}, Ll/ۚۚܺ;->ۤ(Z)V

    const v0, 0x23456225

    if-lt v1, v0, :cond_2

    .line 113
    iget-boolean v0, p0, Ll/ۨۙᩴ;->ۨ:Z

    invoke-virtual {p1, v0}, Ll/ۚۚܺ;->᩸(Z)V

    :cond_2
    const v0, 0x23456224

    if-lt v1, v0, :cond_3

    .line 114
    iget-boolean v0, p0, Ll/ۨۙᩴ;->ۙ:Z

    iput-boolean v0, p1, Ll/ܰۤᩴ;->ۜ᩷:Z

    .line 115
    :cond_3
    iget-object v0, p0, Ll/ۨۙᩴ;->ۗ:Ljava/lang/Integer;

    .line 599
    iput-object v0, p1, Ll/ܰۤᩴ;->᩻ۙ:Ljava/lang/Integer;

    .line 600
    invoke-virtual {p1}, Ll/ܰۤᩴ;->ܿ()V

    .line 115
    iget-object v0, p0, Ll/ۨۙᩴ;->۫:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Ll/ܰۤᩴ;->ۙ(Ljava/lang/Integer;)V

    return-void
.end method

.method public final ۙ(Ll/ۨۙᩴ;)Z
    .locals 2

    .line 47
    iget v0, p0, Ll/ۨۙᩴ;->᩸:I

    iget v1, p1, Ll/ۨۙᩴ;->᩸:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۨۙᩴ;->᩹:I

    iget v1, p1, Ll/ۨۙᩴ;->᩹:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۨۙᩴ;->ۛ:I

    iget v1, p1, Ll/ۨۙᩴ;->ۛ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۨۙᩴ;->᩵:F

    iget v1, p1, Ll/ۨۙᩴ;->᩵:F

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨۙᩴ;->ۧ:F

    iget v1, p1, Ll/ۨۙᩴ;->ۧ:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨۙᩴ;->ܽ:F

    iget v1, p1, Ll/ۨۙᩴ;->ܽ:F

    .line 49
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->֫:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->֫:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ۤ:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->ۤ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ᩴ:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->ᩴ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->᩻:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->᩻:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ܺ:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->ܺ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ܳ:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->ܳ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->᩷:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->᩷:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ۨ:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->ۨ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۨۙᩴ;->ۙ:Z

    iget-boolean v1, p1, Ll/ۨۙᩴ;->ۙ:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۨۙᩴ;->ۚ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۨۙᩴ;->ۚ:Ljava/lang/String;

    .line 53
    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨۙᩴ;->ܶ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۨۙᩴ;->ܶ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨۙᩴ;->ۗ:Ljava/lang/Integer;

    iget-object v1, p1, Ll/ۨۙᩴ;->ۗ:Ljava/lang/Integer;

    .line 54
    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۨۙᩴ;->۫:Ljava/lang/Integer;

    iget-object p1, p1, Ll/ۨۙᩴ;->۫:Ljava/lang/Integer;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
