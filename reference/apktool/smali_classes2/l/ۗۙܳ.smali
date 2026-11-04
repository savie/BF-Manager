.class public final Ll/ۗۙܳ;
.super Ljava/lang/Object;
.source "8IQO"


# instance fields
.field public ֫:J

.field public final ۙ:I

.field public ۚ:Z

.field public ۤ:J

.field public ۧ:Z

.field public ۫:[B

.field public ܳ:I

.field public ܶ:Z

.field public ܺ:J

.field public ܽ:Z

.field public final ᩴ:Z

.field public final ᩷:Ll/۬ۙܳ;

.field public ᩸:Z

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۬ۙܳ;Z)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 13
    iput-wide v0, p0, Ll/ۗۙܳ;->ۤ:J

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 18
    iput-object v0, p0, Ll/ۗۙܳ;->۫:[B

    .line 22
    iput-object p1, p0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    .line 23
    iput-boolean p2, p0, Ll/ۗۙܳ;->ᩴ:Z

    .line 24
    iget p2, p1, Ll/۬ۙܳ;->ۤ:I

    iget p1, p1, Ll/۬ۙܳ;->ᩴ:I

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, p0, Ll/ۗۙܳ;->ۙ:I

    return-void
.end method

.method public static ۙ(I)I
    .locals 2

    .line 62
    invoke-static {}, Ll/ۗۡ֫;->ۤ()Z

    move-result v0

    const/4 v1, 0x2

    if-ne p0, v1, :cond_1

    if-eqz v0, :cond_0

    const p0, -0xa3cfd0

    return p0

    :cond_0
    const/16 p0, -0x2223

    return p0

    :cond_1
    const/4 v1, 0x3

    if-ne p0, v1, :cond_3

    if-eqz v0, :cond_2

    const p0, -0xd9b6cc

    return p0

    :cond_2
    const p0, -0x2a0f24

    return p0

    :cond_3
    if-eqz v0, :cond_4

    const p0, -0xc7aa90

    return p0

    :cond_4
    const p0, -0x352606

    return p0
.end method


# virtual methods
.method public final ۙ(J)I
    .locals 2

    .line 27
    iget-object v0, p0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-boolean v1, p0, Ll/ۗۙܳ;->ᩴ:Z

    invoke-virtual {v0, p1, p2, v1}, Ll/۬ۙܳ;->ۙ(JZ)I

    move-result p1

    return p1
.end method

.method public final ۙ(JZ)I
    .locals 4

    .line 36
    iget-object v0, p0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-boolean v1, p0, Ll/ۗۙܳ;->ᩴ:Z

    if-eqz v1, :cond_0

    iget v2, v0, Ll/۬ۙܳ;->ۤ:I

    goto :goto_0

    :cond_0
    iget v2, v0, Ll/۬ۙܳ;->ᩴ:I

    .line 37
    :goto_0
    invoke-virtual {v0, p1, p2}, Ll/۬ۙܳ;->ۙ(J)I

    move-result v3

    if-gez v3, :cond_2

    const-wide/16 v0, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_1

    const/4 p1, 0x0

    goto :goto_3

    :cond_1
    move p1, v2

    goto :goto_3

    .line 41
    :cond_2
    iget-object p1, v0, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    invoke-virtual {p1, v3}, Ll/۠ۙܳ;->get(I)Ll/ۡۙܳ;

    move-result-object p1

    if-eqz v1, :cond_3

    .line 42
    iget p2, p1, Ll/ۡۙܳ;->ۤ:I

    goto :goto_1

    :cond_3
    iget p2, p1, Ll/ۡۙܳ;->ᩴ:I

    :goto_1
    if-eqz v1, :cond_4

    iget p1, p1, Ll/ۡۙܳ;->᩸:I

    goto :goto_2

    :cond_4
    iget p1, p1, Ll/ۡۙܳ;->ܳ:I

    :goto_2
    add-int/2addr p1, p2

    :goto_3
    if-eqz p3, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 p1, p1, -0x1

    :goto_4
    if-ltz p1, :cond_6

    if-ge p1, v2, :cond_6

    return p1

    :cond_6
    const/4 p1, -0x1

    return p1
.end method

.method public final ۙ(Landroid/graphics/Canvas;Ll/ۙ᩷ܳ;IIII)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p6

    sub-int v3, p5, p4

    const/4 v4, 0x0

    .line 71
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 72
    iget-object v4, v0, Ll/ۗۙܳ;->۫:[B

    array-length v4, v4

    const/4 v5, 0x1

    if-ne v4, v3, :cond_1

    iget v4, v0, Ll/ۗۙܳ;->ܳ:I

    if-eq v4, v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v0

    goto/16 :goto_5

    .line 73
    :cond_1
    :goto_0
    new-array v4, v3, [B

    iput-object v4, v0, Ll/ۗۙܳ;->۫:[B

    .line 74
    iput v2, v0, Ll/ۗۙܳ;->ܳ:I

    .line 75
    iget-object v4, v0, Ll/ۗۙܳ;->᩷:Ll/۬ۙܳ;

    iget-wide v6, v4, Ll/۬ۙܳ;->᩸:J

    iget-object v8, v4, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    int-to-long v9, v2

    add-long/2addr v6, v9

    const-wide/16 v11, 0x1

    sub-long/2addr v6, v11

    div-long/2addr v6, v9

    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    const/high16 v2, 0x40400000    # 3.0f

    .line 76
    iget v13, v1, Ll/ۙ᩷ܳ;->ᩴ:F

    mul-float v13, v13, v2

    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_0

    add-int/lit8 v13, v5, 0x1

    int-to-long v14, v13

    mul-long v14, v14, v6

    sub-long/2addr v14, v11

    int-to-long v11, v3

    .line 79
    div-long/2addr v14, v11

    move/from16 v16, v13

    sub-int v13, v3, v2

    if-lt v5, v13, :cond_2

    .line 80
    iget-wide v14, v4, Ll/۬ۙܳ;->᩸:J

    goto :goto_2

    :cond_2
    const-wide/16 v17, 0x1

    add-long v14, v14, v17

    mul-long v14, v14, v9

    sub-long v14, v14, v17

    :goto_2
    const/4 v1, 0x1

    if-nez v8, :cond_3

    const/4 v14, 0x0

    goto :goto_3

    .line 81
    :cond_3
    invoke-virtual {v8, v14, v15, v1, v1}, Ll/ۙ۬ᩴ;->ۙ(JZZ)I

    move-result v14

    :goto_3
    sub-int/2addr v14, v1

    if-gez v14, :cond_4

    move-object/from16 v19, v4

    move-object/from16 v17, v8

    move-object v4, v0

    const-wide/16 v0, 0x1

    goto :goto_4

    .line 83
    :cond_4
    iget-object v15, v4, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    invoke-virtual {v8, v14, v1}, Ll/ۙ۬ᩴ;->ۙ(IZ)I

    move-result v1

    invoke-virtual {v15, v1}, Ll/۠ۙܳ;->get(I)Ll/ۡۙܳ;

    move-result-object v1

    .line 84
    iget-wide v14, v1, Ll/ۡۙܳ;->۫:J

    div-long v17, v14, v9

    mul-long v17, v17, v11

    move-object/from16 v19, v4

    move/from16 v20, v5

    div-long v4, v17, v6

    long-to-int v5, v4

    .line 48
    iget v4, v1, Ll/ۡۙܳ;->᩸:I

    move-object/from16 v17, v8

    iget v8, v1, Ll/ۡۙܳ;->ܳ:I

    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    move-result v4

    move-object v8, v1

    int-to-long v0, v4

    add-long/2addr v14, v0

    add-long/2addr v14, v9

    const-wide/16 v0, 0x1

    sub-long/2addr v14, v0

    .line 85
    div-long/2addr v14, v9

    mul-long v14, v14, v11

    div-long/2addr v14, v6

    long-to-int v4, v14

    const/4 v11, 0x0

    .line 86
    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-static {v11, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int v11, v5, v2

    .line 87
    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    move/from16 v11, v20

    if-lt v11, v5, :cond_5

    if-ge v11, v4, :cond_5

    move-object/from16 v4, p0

    .line 88
    iget-object v5, v4, Ll/ۗۙܳ;->۫:[B

    iget v8, v8, Ll/ۡۙܳ;->ۙ:I

    int-to-byte v8, v8

    aput-byte v8, v5, v11

    goto :goto_4

    :cond_5
    move-object/from16 v4, p0

    :goto_4
    move-wide v11, v0

    move-object v0, v4

    move/from16 v5, v16

    move-object/from16 v8, v17

    move-object/from16 v4, v19

    move-object/from16 v1, p2

    goto/16 :goto_1

    :goto_5
    move-object/from16 v0, p2

    .line 91
    iget-object v1, v0, Ll/ۙ᩷ܳ;->᩶:Ll/ۢܺۤ;

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v3, :cond_9

    add-int/lit8 v5, v2, 0x1

    move v11, v5

    :goto_7
    if-ge v11, v3, :cond_6

    .line 94
    iget-object v5, v4, Ll/ۗۙܳ;->۫:[B

    aget-byte v6, v5, v11

    aget-byte v5, v5, v2

    if-ne v6, v5, :cond_6

    add-int/lit8 v11, v11, 0x1

    goto :goto_7

    .line 95
    :cond_6
    iget-object v5, v4, Ll/ۗۙܳ;->۫:[B

    aget-byte v5, v5, v2

    if-eqz v5, :cond_8

    const/4 v6, 0x1

    if-ne v5, v6, :cond_7

    const v5, -0xbc9673

    const v6, -0x47340b

    .line 97
    invoke-static {v5, v6}, Ll/ۗۡ֫;->ۙ(II)I

    move-result v5

    goto :goto_8

    :cond_7
    invoke-static {v5}, Ll/ۗۙܳ;->ۙ(I)I

    move-result v5

    .line 96
    :goto_8
    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v12, p3

    int-to-float v8, v12

    .line 98
    iget v5, v0, Ll/ۙ᩷ܳ;->֫:F

    sub-float v6, v8, v5

    add-int v2, p4, v2

    int-to-float v7, v2

    add-int v2, p4, v11

    int-to-float v9, v2

    move-object/from16 v5, p1

    move-object v10, v1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_9

    :cond_8
    move/from16 v12, p3

    :goto_9
    move v2, v11

    goto :goto_6

    :cond_9
    return-void
.end method
