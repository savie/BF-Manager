.class public final Ll/۬ۙܳ;
.super Ljava/lang/Object;
.source "FIQP"


# instance fields
.field public final ۙ:Z

.field public final ۤ:I

.field public final ۫:Ll/۠ۙܳ;

.field public final ܳ:Ll/ۙ۬ᩴ;

.field public final ᩴ:I

.field public final ᩷:Ll/ۢۙܳ;

.field public final ᩸:J


# direct methods
.method public constructor <init>(Ll/ۙ۬ᩴ;)V
    .locals 3

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    .line 59
    new-instance v0, Ll/۠ۙܳ;

    invoke-direct {v0, p0}, Ll/۠ۙܳ;-><init>(Ll/۬ۙܳ;)V

    iput-object v0, p0, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    new-instance v0, Ll/ۢۙܳ;

    invoke-direct {v0, p0}, Ll/ۢۙܳ;-><init>(Ll/۬ۙܳ;)V

    iput-object v0, p0, Ll/۬ۙܳ;->᩷:Ll/ۢۙܳ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 60
    iget-boolean v1, p1, Ll/ۙ۬ᩴ;->᩷:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ll/۬ۙܳ;->ۙ:Z

    if-nez p1, :cond_1

    const-wide/16 v1, 0x0

    goto :goto_1

    .line 61
    :cond_1
    iget-wide v1, p1, Ll/ۙ۬ᩴ;->᩻:J

    :goto_1
    iput-wide v1, p0, Ll/۬ۙܳ;->᩸:J

    if-nez p1, :cond_2

    const/4 v1, 0x0

    goto :goto_2

    .line 62
    :cond_2
    iget v1, p1, Ll/ۙ۬ᩴ;->ۧ:I

    :goto_2
    iput v1, p0, Ll/۬ۙܳ;->ۤ:I

    if-nez p1, :cond_3

    goto :goto_3

    .line 63
    :cond_3
    iget v0, p1, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_3
    iput v0, p0, Ll/۬ۙܳ;->ᩴ:I

    return-void
.end method

.method public static ۙ(Ll/᩸۫ܳ;Ll/᩸۫ܳ;Ljava/util/function/BooleanSupplier;)Ll/۬ۙܳ;
    .locals 29

    move-object/from16 v11, p2

    .line 111
    new-instance v12, Ll/۟ۙܳ;

    invoke-direct {v12}, Ll/۟ۙܳ;-><init>()V

    .line 112
    invoke-interface/range {p0 .. p0}, Ll/᩸۫ܳ;->length()I

    move-result v0

    invoke-interface/range {p1 .. p1}, Ll/᩸۫ܳ;->length()I

    move-result v1

    const/16 v2, 0x4000

    new-array v3, v2, [B

    new-array v4, v2, [B

    .line 114
    new-instance v13, Ll/ۜۙܳ;

    move-object/from16 v14, p0

    invoke-direct {v13, v14, v11}, Ll/ۜۙܳ;-><init>(Ll/᩸۫ܳ;Ljava/util/function/BooleanSupplier;)V

    new-instance v15, Ll/ۜۙܳ;

    move-object/from16 v10, p1

    invoke-direct {v15, v10, v11}, Ll/ۜۙܳ;-><init>(Ll/᩸۫ܳ;Ljava/util/function/BooleanSupplier;)V

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v16, 0x0

    move v8, v0

    move-wide/from16 v17, v5

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/16 v19, 0x0

    move v6, v1

    move-object v5, v3

    .line 119
    :goto_0
    iget-object v3, v12, Ll/۟ۙܳ;->᩸:Ljava/util/ArrayList;

    if-lt v9, v8, :cond_1

    if-ge v7, v6, :cond_0

    goto :goto_1

    :cond_0
    move-object v9, v3

    goto :goto_2

    .line 120
    :cond_1
    :goto_1
    invoke-static/range {p2 .. p2}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    .line 121
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0x186a0

    if-lt v0, v1, :cond_2

    sub-int v4, v8, v9

    sub-int v5, v6, v7

    const/4 v1, 0x4

    move-object v0, v12

    move v2, v9

    move-object v9, v3

    move v3, v7

    .line 122
    invoke-virtual/range {v0 .. v5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    :goto_2
    const/4 v0, 0x0

    move/from16 v25, v6

    move/from16 v23, v8

    move-object v8, v9

    const/4 v7, 0x0

    goto/16 :goto_15

    :cond_2
    sub-int v1, v8, v9

    .line 125
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v10, v6, v7

    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-eqz v0, :cond_1e

    if-nez v2, :cond_3

    goto/16 :goto_13

    .line 130
    :cond_3
    invoke-virtual {v13, v9, v0, v5}, Ll/ۜۙܳ;->ۙ(II[B)V

    .line 131
    invoke-virtual {v15, v7, v2, v4}, Ll/ۜۙܳ;->ۙ(II[B)V

    const/4 v3, 0x0

    .line 133
    :goto_3
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v11

    if-ge v3, v11, :cond_4

    aget-byte v11, v5, v3

    move-object/from16 v20, v5

    aget-byte v5, v4, v3

    if-ne v11, v5, :cond_5

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v5, v20

    goto :goto_3

    :cond_4
    move-object/from16 v20, v5

    :cond_5
    if-lez v3, :cond_6

    const/4 v1, 0x0

    move-object v0, v12

    move v2, v9

    move v10, v3

    move v3, v7

    move-object v11, v4

    move v4, v10

    move-object/from16 v21, v20

    move v5, v10

    .line 135
    invoke-virtual/range {v0 .. v5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    add-int/2addr v9, v10

    add-int/2addr v7, v10

    const/16 v2, 0x4000

    :goto_4
    move-object/from16 v10, p1

    move-object v4, v11

    move-object/from16 v5, v21

    :goto_5
    move-object/from16 v11, p2

    goto :goto_0

    :cond_6
    move-object v11, v4

    move-object/from16 v21, v20

    const/16 v20, 0x1

    if-nez v19, :cond_f

    .line 157
    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    move-object v4, v11

    move-object/from16 v5, v21

    :goto_6
    if-ge v1, v0, :cond_e

    .line 212
    invoke-static/range {p2 .. p2}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    if-nez v1, :cond_7

    const/16 v2, 0x4000

    goto :goto_7

    :cond_7
    const/high16 v2, 0x40000

    :goto_7
    sub-int v3, v0, v1

    .line 213
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 214
    array-length v3, v5

    if-ge v3, v2, :cond_8

    .line 215
    new-array v3, v2, [B

    new-array v4, v2, [B

    move-object v5, v3

    :cond_8
    sub-int v3, v8, v1

    sub-int/2addr v3, v2

    .line 217
    invoke-virtual {v13, v3, v2, v5}, Ll/ۜۙܳ;->᩷(II[B)V

    sub-int v3, v6, v1

    sub-int/2addr v3, v2

    .line 218
    invoke-virtual {v15, v3, v2, v4}, Ll/ۜۙܳ;->᩷(II[B)V

    const/4 v3, 0x0

    :goto_8
    if-ge v3, v2, :cond_c

    .line 222
    invoke-static/range {p2 .. p2}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    add-int/lit16 v10, v3, 0x4000

    .line 223
    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    :goto_9
    if-ge v3, v10, :cond_9

    sub-int v16, v2, v3

    add-int/lit8 v16, v16, -0x1

    move/from16 v19, v0

    .line 224
    aget-byte v0, v5, v16

    move-object/from16 v20, v5

    aget-byte v5, v4, v16

    if-ne v0, v5, :cond_a

    add-int/lit8 v3, v3, 0x1

    move/from16 v0, v19

    move-object/from16 v5, v20

    goto :goto_9

    :cond_9
    move/from16 v19, v0

    move-object/from16 v20, v5

    :cond_a
    if-eq v3, v10, :cond_b

    goto :goto_a

    :cond_b
    move/from16 v0, v19

    move-object/from16 v5, v20

    goto :goto_8

    :cond_c
    move/from16 v19, v0

    move-object/from16 v20, v5

    :goto_a
    add-int/2addr v1, v3

    if-eq v3, v2, :cond_d

    goto :goto_b

    :cond_d
    move/from16 v0, v19

    move-object/from16 v5, v20

    goto :goto_6

    :cond_e
    :goto_b
    move/from16 v16, v1

    sub-int v8, v8, v16

    sub-int v6, v6, v16

    const/16 v2, 0x4000

    const/16 v19, 0x1

    goto/16 :goto_4

    .line 164
    :cond_f
    iget-object v3, v12, Ll/۟ۙܳ;->ۙ:Ll/֡ۙܳ;

    if-eqz v3, :cond_11

    invoke-virtual {v3, v9, v0, v7, v2}, Ll/֡ۙܳ;->᩷(IIII)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_c

    :cond_10
    const/4 v3, 0x0

    move v14, v0

    move/from16 v22, v6

    move/from16 v23, v8

    move-object/from16 v24, v15

    move v6, v1

    move v8, v2

    goto/16 :goto_e

    :cond_11
    :goto_c
    const/16 v3, 0x200

    .line 165
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v14, v0

    move-object v0, v12

    move/from16 v22, v6

    move v6, v1

    move-object/from16 v1, v21

    move/from16 v23, v8

    move v8, v2

    move v2, v4

    const/16 v4, 0x200

    move-object v3, v11

    move-object/from16 v24, v15

    const/16 v15, 0x200

    move v4, v5

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v5}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BI[BILjava/util/function/BooleanSupplier;)[I

    move-result-object v0

    if-nez v0, :cond_13

    if-gt v14, v15, :cond_12

    if-le v8, v15, :cond_13

    :cond_12
    const/16 v15, 0x800

    .line 167
    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v8, v15}, Ljava/lang/Math;->min(II)I

    move-result v4

    move-object v0, v12

    move-object/from16 v1, v21

    move-object v3, v11

    move-object/from16 v5, p2

    invoke-static/range {v0 .. v5}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BI[BILjava/util/function/BooleanSupplier;)[I

    move-result-object v0

    goto :goto_d

    :cond_13
    const/16 v15, 0x800

    :goto_d
    move-object v3, v0

    if-nez v3, :cond_15

    if-gt v14, v15, :cond_14

    if-le v8, v15, :cond_15

    :cond_14
    move-object v0, v12

    move-object/from16 v1, v21

    move v2, v14

    move-object v3, v11

    move v4, v8

    move-object/from16 v5, p2

    .line 168
    invoke-static/range {v0 .. v5}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BI[BILjava/util/function/BooleanSupplier;)[I

    move-result-object v3

    :cond_15
    :goto_e
    if-nez v3, :cond_19

    const/16 v0, 0x4000

    if-gt v6, v0, :cond_16

    if-le v10, v0, :cond_19

    :cond_16
    int-to-long v0, v9

    int-to-long v4, v7

    add-long v25, v4, v0

    cmp-long v0, v25, v17

    if-ltz v0, :cond_19

    move-object/from16 v0, v21

    .line 171
    array-length v1, v0

    const/high16 v2, 0x40000

    if-ge v1, v2, :cond_17

    new-array v5, v2, [B

    new-array v4, v2, [B

    move-object v11, v4

    move-object v15, v5

    goto :goto_f

    :cond_17
    move-object v15, v0

    .line 174
    :goto_f
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 175
    invoke-virtual {v13, v9, v6, v15}, Ll/ۜۙܳ;->ۙ(II[B)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v7, v10, v11}, Ll/ۜۙܳ;->ۙ(II[B)V

    move-object v0, v12

    move-object v1, v15

    move v2, v6

    move-object v3, v11

    move v4, v10

    move-object/from16 v21, v5

    move-object/from16 v5, p2

    .line 176
    invoke-static/range {v0 .. v5}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BI[BILjava/util/function/BooleanSupplier;)[I

    move-result-object v3

    if-nez v3, :cond_1a

    const-wide/32 v0, 0x40000

    add-long v25, v25, v0

    .line 180
    iget-object v0, v12, Ll/۟ۙܳ;->ۙ:Ll/֡ۙܳ;

    if-eqz v0, :cond_18

    iget-boolean v1, v0, Ll/֡ۙܳ;->ۙ:Z

    if-eqz v1, :cond_18

    invoke-virtual {v0, v9, v6, v7, v10}, Ll/֡ۙܳ;->ۙ(IIII)V

    :cond_18
    move-object v10, v3

    move-wide/from16 v17, v25

    goto :goto_10

    :cond_19
    move-object/from16 v0, v21

    move-object/from16 v21, v24

    move-object v15, v0

    :cond_1a
    move-object v10, v3

    :goto_10
    if-eqz v10, :cond_1b

    const/4 v8, 0x0

    .line 184
    aget v2, v10, v8

    aget v4, v10, v20

    move-object v0, v12

    move-object v1, v15

    move-object v3, v11

    move v5, v9

    move/from16 v14, v22

    move v6, v7

    move/from16 v22, v7

    move-object/from16 v7, p2

    invoke-static/range {v0 .. v7}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BI[BIIILjava/util/function/BooleanSupplier;)V

    .line 185
    aget v0, v10, v8

    add-int/2addr v9, v0

    aget v0, v10, v20

    add-int v7, v22, v0

    move/from16 v25, v14

    goto/16 :goto_12

    :cond_1b
    move/from16 v10, v22

    move/from16 v22, v7

    add-int v7, v9, v14

    move/from16 v6, v23

    if-ne v7, v6, :cond_1c

    add-int v0, v22, v8

    if-ne v0, v10, :cond_1c

    move-object v0, v12

    move-object v1, v15

    move v2, v14

    move-object v3, v11

    move v4, v8

    move v5, v9

    move/from16 v23, v6

    move/from16 v6, v22

    move/from16 v24, v7

    move-object/from16 v7, p2

    .line 188
    invoke-static/range {v0 .. v7}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BI[BIIILjava/util/function/BooleanSupplier;)V

    move/from16 v27, v8

    move/from16 v25, v10

    goto :goto_11

    :cond_1c
    move/from16 v23, v6

    move/from16 v24, v7

    const/16 v0, 0x800

    .line 190
    invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 191
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    const/16 v25, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/16 v26, 0x0

    move-object v0, v12

    move-object v1, v15

    move-object v4, v11

    move v7, v9

    move/from16 v27, v8

    move/from16 v8, v22

    move/from16 v28, v9

    move/from16 v9, v25

    move/from16 v25, v10

    move-object/from16 v10, p2

    .line 190
    invoke-static/range {v0 .. v10}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BII[BIIIIZLjava/util/function/BooleanSupplier;)[I

    move-result-object v0

    if-eqz v0, :cond_1d

    .line 193
    aget v1, v0, v26

    add-int v9, v28, v1

    aget v0, v0, v20

    add-int v7, v22, v0

    goto :goto_12

    :cond_1d
    const/4 v1, 0x4

    move-object v0, v12

    move/from16 v2, v28

    move/from16 v3, v22

    move v4, v14

    move/from16 v5, v27

    .line 196
    invoke-virtual/range {v0 .. v5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    :goto_11
    add-int v7, v22, v27

    move/from16 v9, v24

    :goto_12
    const/16 v2, 0x4000

    move-object/from16 v14, p0

    move-object/from16 v10, p1

    move-object v4, v11

    move-object v5, v15

    move-object/from16 v15, v21

    move/from16 v8, v23

    move/from16 v6, v25

    goto/16 :goto_5

    :cond_1e
    :goto_13
    move v14, v0

    move/from16 v25, v6

    move/from16 v22, v7

    move/from16 v23, v8

    move/from16 v28, v9

    move v6, v1

    const/4 v7, 0x0

    if-nez v14, :cond_1f

    const/4 v0, 0x3

    const/4 v1, 0x3

    goto :goto_14

    :cond_1f
    const/4 v0, 0x2

    const/4 v1, 0x2

    :goto_14
    move-object v0, v12

    move/from16 v2, v28

    move-object v8, v3

    move/from16 v3, v22

    move v4, v6

    move v5, v10

    .line 127
    invoke-virtual/range {v0 .. v5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    :goto_15
    const/4 v1, 0x0

    move-object v0, v12

    move/from16 v2, v23

    move/from16 v3, v25

    move/from16 v4, v16

    move/from16 v5, v16

    .line 201
    invoke-virtual/range {v0 .. v5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    .line 202
    invoke-static/range {p2 .. p2}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    .line 203
    invoke-interface/range {p0 .. p0}, Ll/᩸۫ܳ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-interface/range {p1 .. p1}, Ll/᩸۫ܳ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_21

    .line 204
    new-instance v0, Ll/۬ۙܳ;

    invoke-interface/range {p0 .. p0}, Ll/᩸۫ܳ;->length()I

    move-result v1

    invoke-interface/range {p1 .. p1}, Ll/᩸۫ܳ;->length()I

    move-result v2

    .line 52
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v7, v3, v8}, Ll/ۙ۬ᩴ;->ۙ(IILjava/util/List;)Ll/ۙ۬ᩴ;

    move-result-object v3

    invoke-direct {v0, v3}, Ll/۬ۙܳ;-><init>(Ll/ۙ۬ᩴ;)V

    .line 53
    iget v3, v0, Ll/۬ۙܳ;->ۤ:I

    if-ne v3, v1, :cond_20

    iget v1, v0, Ll/۬ۙܳ;->ᩴ:I

    if-ne v1, v2, :cond_20

    return-object v0

    .line 54
    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Alignment coverage mismatch"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 203
    :cond_21
    new-instance v0, Ll/۫ۚܳ;

    invoke-direct {v0}, Ll/۫ۚܳ;-><init>()V

    throw v0
.end method

.method public static bridge synthetic ۙ(Ljava/util/function/BooleanSupplier;)V
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    return-void
.end method

.method public static ۙ(Ll/۟ۙܳ;[BI[BIIILjava/util/function/BooleanSupplier;)V
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move/from16 v1, p2

    move/from16 v2, p4

    move/from16 v14, p5

    move/from16 v15, p6

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    if-gtz v1, :cond_1

    if-lez v2, :cond_0

    goto :goto_1

    :cond_0
    return-void

    .line 319
    :cond_1
    :goto_1
    invoke-static/range {p7 .. p7}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    if-eqz v1, :cond_7

    if-nez v2, :cond_2

    goto/16 :goto_3

    :cond_2
    move-object/from16 v13, p0

    .line 322
    iget-object v3, v13, Ll/۟ۙܳ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const v4, 0x186a0

    const/4 v5, 0x0

    if-ge v3, v4, :cond_5

    add-int v3, v1, v2

    const/16 v4, 0x2000

    if-gt v3, v4, :cond_3

    sub-int v3, v1, v2

    .line 323
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    const/16 v4, 0x100

    if-gt v3, v4, :cond_3

    const/4 v12, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, v16

    move v6, v1

    move-object/from16 v7, p3

    move/from16 v8, v17

    move v9, v2

    move v10, v14

    move v11, v15

    move-object/from16 v13, p7

    .line 324
    invoke-static/range {v3 .. v13}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BII[BIIIIZLjava/util/function/BooleanSupplier;)[I

    move-result-object v5

    :cond_3
    if-nez v5, :cond_5

    const/16 v3, 0x800

    if-gt v1, v3, :cond_4

    if-le v2, v3, :cond_5

    .line 326
    :cond_4
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 327
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v11, 0x1

    move v13, v2

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, v16

    move-object/from16 v6, p3

    move/from16 v7, v17

    move v9, v14

    move v10, v15

    move-object/from16 v12, p7

    .line 326
    invoke-static/range {v2 .. v12}, Ll/۬ۙܳ;->ۙ(Ll/۟ۙܳ;[BII[BIIIIZLjava/util/function/BooleanSupplier;)[I

    move-result-object v5

    goto :goto_2

    :cond_5
    move v13, v2

    :goto_2
    if-nez v5, :cond_6

    const/4 v0, 0x4

    move/from16 p1, v0

    move/from16 p2, v14

    move/from16 p3, v15

    move/from16 p4, v1

    move/from16 p5, v13

    .line 329
    invoke-virtual/range {p0 .. p5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    return-void

    .line 330
    :cond_6
    aget v2, v5, v0

    add-int v16, v16, v2

    const/4 v3, 0x1

    aget v3, v5, v3

    add-int v17, v17, v3

    add-int/2addr v14, v2

    add-int/2addr v15, v3

    sub-int/2addr v1, v2

    sub-int v2, v13, v3

    goto/16 :goto_0

    :cond_7
    :goto_3
    move v13, v2

    const/4 v0, 0x1

    move/from16 p1, v0

    move/from16 p2, v14

    move/from16 p3, v15

    move/from16 p4, v1

    move/from16 p5, v13

    .line 320
    invoke-virtual/range {p0 .. p5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    return-void
.end method

.method public static ۙ(Ll/۟ۙܳ;[BII[BIIIIZLjava/util/function/BooleanSupplier;)[I
    .locals 17

    move-object/from16 v0, p0

    move/from16 v10, p3

    move/from16 v11, p6

    .line 339
    invoke-static/range {p10 .. p10}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    .line 340
    iget-object v1, v0, Ll/۟ۙܳ;->ۤ:Ll/֨ۙܳ;

    if-nez v1, :cond_0

    new-instance v1, Ll/֨ۙܳ;

    invoke-direct {v1}, Ll/֨ۙܳ;-><init>()V

    iput-object v1, v0, Ll/۟ۙܳ;->ۤ:Ll/֨ۙܳ;

    .line 341
    :cond_0
    iget-object v12, v0, Ll/۟ۙܳ;->ۤ:Ll/֨ۙܳ;

    move-object v1, v12

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p9

    .line 343
    invoke-virtual/range {v1 .. v8}, Ll/֨ۙܳ;->ۙ([BII[BIIZ)Z

    move-result v1

    if-nez v1, :cond_1

    if-eqz p9, :cond_19

    const/4 v8, 0x1

    move-object v1, v12

    move-object/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v5, p1

    move/from16 v6, p2

    move/from16 v7, p3

    .line 344
    invoke-virtual/range {v1 .. v8}, Ll/֨ۙܳ;->ۙ([BII[BIIZ)Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_f

    :cond_1
    move-object v1, v12

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p9

    move-object/from16 v9, p10

    .line 346
    invoke-virtual/range {v1 .. v9}, Ll/֨ۙܳ;->ۙ([BII[BIIZLjava/util/function/BooleanSupplier;)Z

    move-result v1

    if-nez v1, :cond_2

    if-eqz p9, :cond_19

    const/4 v8, 0x1

    move-object v1, v12

    move-object/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v5, p1

    move/from16 v6, p2

    move/from16 v7, p3

    move-object/from16 v9, p10

    .line 347
    invoke-virtual/range {v1 .. v9}, Ll/֨ۙܳ;->ۙ([BII[BIIZLjava/util/function/BooleanSupplier;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_f

    .line 348
    :cond_2
    invoke-virtual {v12}, Ll/֨ۙܳ;->ۙ()V

    .line 350
    invoke-static {v12}, Ll/֨ۙܳ;->᩸(Ll/֨ۙܳ;)[I

    move-result-object v1

    .line 351
    invoke-static {v12}, Ll/֨ۙܳ;->ۤ(Ll/֨ۙܳ;)[[I

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x100

    if-gt v4, v5, :cond_b

    .line 355
    invoke-static/range {p10 .. p10}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    neg-int v6, v4

    move v7, v6

    :goto_1
    if-gt v7, v4, :cond_8

    if-eq v7, v6, :cond_4

    if-eq v7, v4, :cond_3

    add-int/lit16 v8, v7, 0x100

    .line 357
    aget v8, v1, v8

    add-int/lit16 v9, v7, 0x102

    aget v9, v1, v9

    if-ge v8, v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit16 v8, v7, 0x100

    .line 358
    aget v8, v1, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_4
    :goto_2
    add-int/lit16 v8, v7, 0x102

    aget v8, v1, v8

    :goto_3
    sub-int v9, v8, v7

    :goto_4
    if-ge v8, v10, :cond_5

    if-ge v9, v11, :cond_5

    add-int v13, p2, v8

    .line 360
    aget-byte v13, p1, v13

    add-int v14, p5, v9

    aget-byte v14, p4, v14

    if-ne v13, v14, :cond_5

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_5
    add-int/lit16 v13, v7, 0x101

    .line 361
    aput v8, v1, v13

    if-eqz p9, :cond_6

    if-ge v8, v10, :cond_c

    if-lt v9, v11, :cond_7

    goto :goto_5

    :cond_6
    if-lt v8, v10, :cond_7

    if-lt v9, v11, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v7, v7, 0x2

    goto :goto_1

    :cond_8
    if-ge v4, v5, :cond_a

    .line 368
    aget-object v5, v2, v4

    if-nez v5, :cond_9

    mul-int/lit8 v5, v4, 0x2

    add-int/lit8 v5, v5, 0x1

    new-array v5, v5, [I

    aput-object v5, v2, v4

    :cond_9
    rsub-int v5, v4, 0x101

    .line 369
    aget-object v6, v2, v4

    mul-int/lit8 v7, v4, 0x2

    add-int/lit8 v7, v7, 0x1

    invoke-static {v1, v5, v6, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_b
    const/4 v4, -0x1

    move v8, v10

    move v9, v11

    :cond_c
    :goto_5
    if-gez v4, :cond_d

    goto/16 :goto_f

    .line 373
    :cond_d
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 374
    invoke-static {v12}, Ll/֨ۙܳ;->ۙ(Ll/֨ۙܳ;)[I

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v12}, Ll/֨ۙܳ;->ۙ(Ll/֨ۙܳ;)[I

    move-result-object v3

    array-length v3, v3

    if-ge v3, v1, :cond_f

    .line 375
    :cond_e
    new-array v3, v1, [I

    invoke-static {v12, v3}, Ll/֨ۙܳ;->ۙ(Ll/֨ۙܳ;[I)V

    new-array v1, v1, [I

    invoke-static {v12, v1}, Ll/֨ۙܳ;->᩷(Ll/֨ۙܳ;[I)V

    .line 377
    :cond_f
    invoke-static {v12}, Ll/֨ۙܳ;->ۙ(Ll/֨ۙܳ;)[I

    move-result-object v1

    invoke-static {v12}, Ll/֨ۙܳ;->᩷(Ll/֨ۙܳ;)[I

    move-result-object v3

    const/4 v5, 0x0

    move v6, v8

    move v7, v9

    :goto_6
    if-lez v4, :cond_13

    add-int/lit8 v12, v4, -0x1

    .line 380
    aget-object v13, v2, v12

    sub-int v14, v6, v7

    neg-int v15, v4

    if-eq v14, v15, :cond_11

    if-eq v14, v4, :cond_10

    add-int v15, v12, v14

    add-int/lit8 v16, v15, -0x1

    .line 382
    aget v0, v13, v16

    add-int/lit8 v15, v15, 0x1

    aget v15, v13, v15

    if-ge v0, v15, :cond_10

    goto :goto_7

    :cond_10
    add-int/lit8 v14, v14, -0x1

    goto :goto_8

    :cond_11
    :goto_7
    add-int/lit8 v14, v14, 0x1

    :goto_8
    add-int/2addr v12, v14

    .line 383
    aget v0, v13, v12

    sub-int v12, v0, v14

    :goto_9
    if-le v6, v0, :cond_12

    if-le v7, v12, :cond_12

    add-int/lit8 v6, v6, -0x1

    .line 384
    aput v6, v1, v5

    add-int/lit8 v13, v5, 0x1

    add-int/lit8 v7, v7, -0x1

    aput v7, v3, v5

    move v5, v13

    goto :goto_9

    :cond_12
    add-int/lit8 v4, v4, -0x1

    move v6, v0

    move v7, v12

    move-object/from16 v0, p0

    goto :goto_6

    :cond_13
    :goto_a
    if-lez v6, :cond_14

    if-lez v7, :cond_14

    add-int/lit8 v6, v6, -0x1

    .line 387
    aput v6, v1, v5

    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v7, v7, -0x1

    aput v7, v3, v5

    move v5, v0

    goto :goto_a

    :cond_14
    const/4 v0, 0x0

    if-eqz p9, :cond_1b

    :goto_b
    add-int/lit8 v2, v0, 0x8

    if-gt v2, v5, :cond_18

    .line 392
    aget v4, v1, v0

    add-int/lit16 v6, v10, -0x100

    if-ge v4, v6, :cond_17

    aget v4, v3, v0

    add-int/lit16 v6, v11, -0x100

    if-lt v4, v6, :cond_15

    goto :goto_d

    :cond_15
    const/4 v4, 0x1

    :goto_c
    const/16 v6, 0x8

    if-ge v4, v6, :cond_16

    add-int v7, v0, v4

    .line 394
    aget v8, v1, v7

    aget v9, v1, v0

    sub-int/2addr v9, v4

    if-ne v8, v9, :cond_16

    aget v7, v3, v7

    aget v8, v3, v0

    sub-int/2addr v8, v4

    if-ne v7, v8, :cond_16

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_16
    if-ne v4, v6, :cond_17

    goto :goto_e

    :cond_17
    :goto_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_18
    :goto_e
    if-le v2, v5, :cond_1a

    :cond_19
    :goto_f
    const/4 v0, 0x0

    return-object v0

    .line 399
    :cond_1a
    aget v2, v1, v0

    add-int/lit8 v8, v2, 0x1

    aget v2, v3, v0

    add-int/lit8 v9, v2, 0x1

    :cond_1b
    add-int/lit8 v5, v5, -0x1

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_10
    if-lt v5, v0, :cond_1d

    const/4 v6, 0x1

    :goto_11
    sub-int v7, v5, v6

    if-lt v7, v0, :cond_1c

    .line 404
    aget v10, v1, v7

    aget v11, v1, v5

    add-int/2addr v11, v6

    if-ne v10, v11, :cond_1c

    aget v10, v3, v7

    aget v11, v3, v5

    add-int/2addr v11, v6

    if-ne v10, v11, :cond_1c

    add-int/lit8 v6, v6, 0x1

    goto :goto_11

    :cond_1c
    add-int v10, p7, v2

    add-int v11, p8, v4

    .line 405
    aget v12, v1, v5

    sub-int v2, v12, v2

    aget v12, v3, v5

    sub-int v4, v12, v4

    const/4 v12, 0x1

    move-object/from16 p1, p0

    move/from16 p2, v12

    move/from16 p3, v10

    move/from16 p4, v11

    move/from16 p5, v2

    move/from16 p6, v4

    invoke-virtual/range {p1 .. p6}, Ll/۟ۙܳ;->ۙ(IIIII)V

    .line 406
    aget v2, v1, v5

    add-int v2, p7, v2

    aget v4, v3, v5

    add-int v4, p8, v4

    const/4 v10, 0x0

    move/from16 p2, v10

    move/from16 p3, v2

    move/from16 p4, v4

    move/from16 p5, v6

    move/from16 p6, v6

    invoke-virtual/range {p1 .. p6}, Ll/۟ۙܳ;->ۙ(IIIII)V

    .line 407
    aget v2, v1, v5

    add-int/2addr v2, v6

    aget v4, v3, v5

    add-int/2addr v4, v6

    move v5, v7

    goto :goto_10

    :cond_1d
    add-int v0, p7, v2

    add-int v1, p8, v4

    sub-int v2, v8, v2

    sub-int v3, v9, v4

    const/4 v4, 0x1

    move/from16 p1, v4

    move/from16 p2, v0

    move/from16 p3, v1

    move/from16 p4, v2

    move/from16 p5, v3

    .line 410
    invoke-virtual/range {p0 .. p5}, Ll/۟ۙܳ;->ۙ(IIIII)V

    .line 411
    filled-new-array {v8, v9}, [I

    move-result-object v0

    return-object v0
.end method

.method public static ۙ(Ll/۟ۙܳ;[BI[BILjava/util/function/BooleanSupplier;)[I
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p4

    const/16 v3, 0x20

    if-lt v1, v3, :cond_1b

    if-ge v2, v3, :cond_0

    goto/16 :goto_11

    .line 237
    :cond_0
    iget-object v4, v0, Ll/۟ۙܳ;->ۙ:Ll/֡ۙܳ;

    if-nez v4, :cond_1

    new-instance v4, Ll/֡ۙܳ;

    invoke-direct {v4}, Ll/֡ۙܳ;-><init>()V

    iput-object v4, v0, Ll/۟ۙܳ;->ۙ:Ll/֡ۙܳ;

    .line 238
    :cond_1
    iget-object v0, v0, Ll/۟ۙܳ;->ۙ:Ll/֡ۙܳ;

    const/4 v4, 0x1

    .line 301
    iput-boolean v4, v0, Ll/֡ۙܳ;->ۙ:Z

    iget-object v5, v0, Ll/֡ۙܳ;->ۚ:[I

    const/4 v6, -0x1

    .line 302
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([II)V

    .line 303
    div-int/lit8 v6, v1, 0x20

    add-int/2addr v6, v4

    .line 304
    iget-object v4, v0, Ll/֡ۙܳ;->֫:[I

    if-eqz v4, :cond_2

    array-length v4, v4

    if-ge v4, v6, :cond_3

    .line 305
    :cond_2
    new-array v4, v6, [I

    iput-object v4, v0, Ll/֡ۙܳ;->֫:[I

    new-array v4, v6, [J

    iput-object v4, v0, Ll/֡ۙܳ;->۫:[J

    :cond_3
    const/16 v4, 0x4000

    const-wide/16 v6, 0x0

    if-le v1, v4, :cond_5

    .line 308
    iget-object v8, v0, Ll/֡ۙܳ;->ܳ:[J

    if-nez v8, :cond_4

    array-length v8, v5

    new-array v8, v8, [J

    iput-object v8, v0, Ll/֡ۙܳ;->ܳ:[J

    goto :goto_0

    .line 309
    :cond_4
    invoke-static {v8, v6, v7}, Ljava/util/Arrays;->fill([JJ)V

    .line 240
    :cond_5
    :goto_0
    iget-object v8, v0, Ll/֡ۙܳ;->֫:[I

    .line 241
    iget-object v9, v0, Ll/֡ۙܳ;->۫:[J

    if-le v1, v4, :cond_6

    .line 243
    iget-object v4, v0, Ll/֡ۙܳ;->ܳ:[J

    goto :goto_1

    :cond_6
    const/4 v4, 0x0

    :goto_1
    const/4 v12, 0x1

    const-wide/16 v13, 0x1

    :goto_2
    const-wide/16 v15, 0x101

    if-ge v12, v3, :cond_7

    mul-long v13, v13, v15

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_7
    sub-int/2addr v1, v3

    .line 247
    div-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x20

    :goto_3
    const/16 v12, 0x3a

    const/16 v17, 0x0

    if-ltz v1, :cond_b

    and-int/lit16 v6, v1, 0x3ff

    if-nez v6, :cond_8

    .line 248
    invoke-static/range {p5 .. p5}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    :cond_8
    const/4 v6, 0x0

    const-wide/16 v18, 0x0

    :goto_4
    if-ge v6, v3, :cond_9

    mul-long v18, v18, v15

    add-int v7, v1, v6

    .line 250
    aget-byte v7, p1, v7

    and-int/lit16 v7, v7, 0xff

    int-to-long v10, v7

    add-long v18, v18, v10

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 251
    :cond_9
    div-int/lit8 v6, v1, 0x20

    ushr-long v10, v18, v3

    xor-long v10, v18, v10

    long-to-int v7, v10

    array-length v10, v5

    add-int/lit8 v10, v10, -0x1

    and-int/2addr v7, v10

    .line 252
    aput-wide v18, v9, v6

    aget v10, v5, v7

    aput v10, v8, v6

    aput v6, v5, v7

    if-eqz v4, :cond_a

    .line 253
    aget-wide v10, v4, v7

    move-object/from16 p0, v4

    ushr-long v3, v18, v12

    long-to-int v4, v3

    const-wide/16 v18, 0x1

    shl-long v3, v18, v4

    or-long/2addr v3, v10

    aput-wide v3, p0, v7

    goto :goto_5

    :cond_a
    move-object/from16 p0, v4

    :goto_5
    add-int/lit8 v1, v1, -0x20

    const/16 v3, 0x20

    move-object/from16 v4, p0

    const-wide/16 v6, 0x0

    goto :goto_3

    :cond_b
    move-object/from16 p0, v4

    const/4 v1, 0x0

    const/16 v3, 0x20

    const-wide/16 v6, 0x0

    :goto_6
    if-ge v1, v3, :cond_c

    mul-long v6, v6, v15

    .line 256
    aget-byte v4, p3, v1

    and-int/lit16 v4, v4, 0xff

    int-to-long v10, v4

    add-long/2addr v6, v10

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_c
    const v1, 0x7fffffff

    const/4 v4, 0x0

    const/4 v10, -0x1

    const/4 v11, -0x1

    :goto_7
    add-int/lit8 v15, v4, 0x20

    if-gt v15, v2, :cond_18

    if-ge v4, v1, :cond_18

    move/from16 v16, v1

    and-int/lit16 v1, v4, 0x3ff

    if-nez v1, :cond_d

    .line 259
    invoke-static/range {p5 .. p5}, Ll/۬ۙܳ;->᩷(Ljava/util/function/BooleanSupplier;)V

    :cond_d
    ushr-long v22, v6, v3

    move/from16 p2, v10

    move v1, v11

    xor-long v10, v22, v6

    long-to-int v3, v10

    .line 260
    array-length v10, v5

    add-int/lit8 v10, v10, -0x1

    and-int/2addr v3, v10

    if-eqz p0, :cond_f

    .line 261
    aget-wide v10, p0, v3

    move-wide/from16 v22, v13

    ushr-long v12, v6, v12

    long-to-int v13, v12

    const-wide/16 v20, 0x1

    shl-long v12, v20, v13

    and-long/2addr v10, v12

    const-wide/16 v12, 0x0

    cmp-long v14, v10, v12

    if-eqz v14, :cond_e

    goto :goto_8

    :cond_e
    move/from16 v10, p2

    move v11, v1

    move-object/from16 v26, v5

    move/from16 v1, v16

    goto/16 :goto_e

    :cond_f
    move-wide/from16 v22, v13

    const-wide/16 v12, 0x0

    const-wide/16 v20, 0x1

    .line 262
    :goto_8
    aget v3, v5, v3

    const/4 v10, 0x0

    move/from16 v11, p2

    move v14, v1

    move/from16 v1, v16

    :goto_9
    if-ltz v3, :cond_15

    add-int/lit8 v16, v10, 0x1

    const/16 v12, 0x20

    if-ge v10, v12, :cond_15

    mul-int/lit8 v10, v3, 0x20

    add-int v13, v10, v4

    if-ge v13, v1, :cond_13

    .line 265
    aget-wide v24, v9, v3

    cmp-long v26, v24, v6

    if-eqz v26, :cond_10

    goto :goto_c

    :cond_10
    const/16 v24, 0x0

    move/from16 v24, v1

    const/4 v1, 0x0

    :goto_a
    if-ge v1, v12, :cond_12

    add-int v12, v10, v1

    .line 267
    aget-byte v12, p1, v12

    add-int v25, v4, v1

    move-object/from16 v26, v5

    aget-byte v5, p3, v25

    if-ne v12, v5, :cond_11

    add-int/lit8 v1, v1, 0x1

    const/16 v12, 0x20

    move-object/from16 v5, v26

    goto :goto_a

    :cond_11
    const/16 v12, 0x20

    goto :goto_b

    :cond_12
    move-object/from16 v26, v5

    :goto_b
    if-ne v1, v12, :cond_14

    move v14, v4

    move v11, v10

    move v1, v13

    goto :goto_d

    :cond_13
    :goto_c
    move/from16 v24, v1

    move-object/from16 v26, v5

    :cond_14
    move/from16 v1, v24

    .line 263
    :goto_d
    aget v3, v8, v3

    move/from16 v10, v16

    move-object/from16 v5, v26

    const-wide/16 v12, 0x0

    goto :goto_9

    :cond_15
    move/from16 v24, v1

    move-object/from16 v26, v5

    const/4 v1, 0x0

    if-ltz v3, :cond_16

    .line 271
    iput-boolean v1, v0, Ll/֡ۙܳ;->ۙ:Z

    :cond_16
    move v10, v11

    move v11, v14

    move/from16 v1, v24

    :goto_e
    if-ge v15, v2, :cond_17

    .line 274
    aget-byte v3, p3, v4

    and-int/lit16 v3, v3, 0xff

    int-to-long v12, v3

    mul-long v12, v12, v22

    sub-long/2addr v6, v12

    const-wide/16 v12, 0x101

    mul-long v6, v6, v12

    aget-byte v3, p3, v15

    and-int/lit16 v3, v3, 0xff

    int-to-long v14, v3

    add-long/2addr v6, v14

    goto :goto_f

    :cond_17
    const-wide/16 v12, 0x101

    :goto_f
    add-int/lit8 v4, v4, 0x1

    const/16 v3, 0x20

    const/16 v5, 0x3a

    move-wide v15, v12

    move-wide/from16 v13, v22

    move-object/from16 v5, v26

    const/16 v12, 0x3a

    goto/16 :goto_7

    :cond_18
    move/from16 p2, v10

    move v1, v11

    if-gez p2, :cond_19

    goto :goto_12

    :cond_19
    move/from16 v10, p2

    move v11, v1

    :goto_10
    if-lez v10, :cond_1a

    if-lez v11, :cond_1a

    add-int/lit8 v0, v10, -0x1

    .line 277
    aget-byte v0, p1, v0

    add-int/lit8 v1, v11, -0x1

    aget-byte v1, p3, v1

    if-ne v0, v1, :cond_1a

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v11, v11, -0x1

    goto :goto_10

    .line 278
    :cond_1a
    filled-new-array {v10, v11}, [I

    move-result-object v0

    return-object v0

    :cond_1b
    :goto_11
    const/16 v17, 0x0

    :goto_12
    return-object v17
.end method

.method public static ᩷(Ljava/util/function/BooleanSupplier;)V
    .locals 0

    .line 485
    invoke-interface {p0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ll/ۡܳܳ;

    invoke-direct {p0}, Ll/ۡܳܳ;-><init>()V

    throw p0
.end method


# virtual methods
.method public final ۙ(J)I
    .locals 6

    const/4 v0, -0x1

    .line 98
    iget-object v1, p0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez v1, :cond_0

    return v0

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-ltz v4, :cond_4

    .line 188
    iget-wide v2, v1, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v4, p1, v2

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 190
    :goto_0
    iget-object v2, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v2, :cond_3

    .line 191
    iget-wide v3, v2, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v5, p1, v3

    if-gez v5, :cond_2

    move-object v1, v2

    goto :goto_0

    :cond_2
    sub-long/2addr p1, v3

    .line 192
    iget v2, v2, Ll/ۙ۬ᩴ;->ۤ:I

    add-int/2addr v0, v2

    iget-object v1, v1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_0

    :cond_3
    return v0

    .line 98
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    return v0
.end method

.method public final ۙ(JZ)I
    .locals 7

    const/4 v0, -0x1

    .line 99
    iget-object v1, p0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez v1, :cond_0

    return v0

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-ltz v4, :cond_7

    .line 226
    iget-wide v2, v1, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v4, p1, v2

    if-ltz v4, :cond_1

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    .line 228
    :goto_0
    iget-object v3, v1, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v3, :cond_4

    .line 229
    iget-wide v4, v3, Ll/ۙ۬ᩴ;->᩻:J

    cmp-long v6, p1, v4

    if-gez v6, :cond_2

    move-object v1, v3

    goto :goto_0

    :cond_2
    sub-long/2addr p1, v4

    if-eqz p3, :cond_3

    .line 231
    iget v3, v3, Ll/ۙ۬ᩴ;->ۧ:I

    goto :goto_1

    :cond_3
    iget v3, v3, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_1
    add-int/2addr v2, v3

    .line 232
    iget-object v1, v1, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_0

    :cond_4
    if-eqz p3, :cond_5

    .line 235
    iget p3, v1, Ll/ۙ۬ᩴ;->ۧ:I

    goto :goto_2

    :cond_5
    iget p3, v1, Ll/ۙ۬ᩴ;->ܽ:I

    :goto_2
    int-to-long v3, p3

    cmp-long p3, p1, v3

    if-gez p3, :cond_6

    long-to-int p2, p1

    add-int/2addr v2, p2

    return v2

    :cond_6
    :goto_3
    return v0

    .line 99
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v0
.end method

.method public final ۙ(IZ)J
    .locals 1

    .line 100
    iget-object v0, p0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez v0, :cond_0

    const-wide/16 p1, 0x0

    return-wide p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ۙ۬ᩴ;->᩷(IZ)J

    move-result-wide p1

    return-wide p1
.end method
