.class public final Ll/ۙۤܳ;
.super Ljava/lang/Object;
.source "ZIPT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ll/۟ᩴܳ;

.field public final ֨:Ll/ᩳܳܳ;

.field public ۖ:J

.field public ۟:J

.field public final ۡ:Ll/۟ᩴܳ;

.field public ۢ:I

.field public ܰ:Z

.field public final ܿ:Ll/ᩳܳܳ;

.field public ᩳ:J

.field public ᩶:Ll/۬ۙܳ;


# direct methods
.method public constructor <init>(Ll/ᩳܳܳ;Ll/ᩳܳܳ;Ll/۬ۙܳ;)V
    .locals 4

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x40000

    .line 21
    iput v0, p0, Ll/ۙۤܳ;->ۢ:I

    .line 26
    iput-object p1, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    iput-object p2, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    move-object v0, p1

    .line 27
    monitor-enter v0

    move-object v1, p2

    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 28
    :try_start_1
    invoke-virtual {p1}, Ll/ᩳܳܳ;->length()I

    move-result v2

    iget v3, p3, Ll/۬ۙܳ;->ۤ:I

    if-ne v2, v3, :cond_0

    invoke-virtual {p2}, Ll/ᩳܳܳ;->length()I

    move-result v2

    iget v3, p3, Ll/۬ۙܳ;->ᩴ:I

    if-ne v2, v3, :cond_0

    .line 30
    invoke-virtual {p1}, Ll/ᩳܳܳ;->᩵()Ll/۟ᩴܳ;

    move-result-object v2

    iput-object v2, p0, Ll/ۙۤܳ;->֡:Ll/۟ᩴܳ;

    invoke-virtual {p2}, Ll/ᩳܳܳ;->᩵()Ll/۟ᩴܳ;

    move-result-object v2

    iput-object v2, p0, Ll/ۙۤܳ;->ۡ:Ll/۟ᩴܳ;

    .line 31
    invoke-virtual {p1}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v2

    iput-wide v2, p0, Ll/ۙۤܳ;->۟:J

    invoke-virtual {p2}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۙۤܳ;->ۖ:J

    .line 32
    iput-object p3, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    .line 33
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    .line 29
    :cond_0
    :try_start_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Comparison does not cover documents"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 33
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public static ۙ(Ll/۬ۙܳ;JJLl/ۙ۬ᩴ;)Ll/۬ۙܳ;
    .locals 4

    .line 110
    new-instance v0, Ll/۬ۙܳ;

    iget-object v1, p0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const-wide/16 v2, 0x0

    .line 111
    invoke-static {v1, v2, v3, p1, p2}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p1

    .line 110
    invoke-static {p1, p5}, Ll/ۙ۬ᩴ;->᩷(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p1

    iget-object p2, p0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    iget-wide v1, p0, Ll/۬ۙܳ;->᩸:J

    .line 112
    invoke-static {p2, p3, p4, v1, v2}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object p0

    .line 110
    invoke-static {p1, p0}, Ll/ۙ۬ᩴ;->᩷(Ll/ۙ۬ᩴ;Ll/ۙ۬ᩴ;)Ll/ۙ۬ᩴ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/۬ۙܳ;-><init>(Ll/ۙ۬ᩴ;)V

    return-object v0
.end method

.method private ۙ(JJ)V
    .locals 10

    cmp-long v0, p1, p3

    if-nez v0, :cond_0

    return-void

    .line 98
    :cond_0
    iput-wide p1, p0, Ll/ۙۤܳ;->ᩳ:J

    .line 99
    iget-object v0, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-object v0, v0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const/4 v1, 0x1

    .line 100
    invoke-virtual {v0, p1, p2, v1}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, p1, p2, v3}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v4

    sub-long v5, p3, p1

    const-wide/32 v7, 0x8000

    cmp-long v9, v5, v7

    if-gtz v9, :cond_1

    .line 103
    invoke-static {v0, p1, p2, p3, p4}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object v0

    invoke-static {v0, v3}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;Z)Ll/ۙ۬ᩴ;

    move-result-object v0

    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {v0, p3, p4, v1}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, p3, p4, v3}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v0

    sub-int/2addr v0, v4

    const/4 v2, 0x5

    .line 104
    invoke-static {v2, v1, v0}, Ll/ۙ۬ᩴ;->ۙ(III)Ll/ۙ۬ᩴ;

    move-result-object v0

    :goto_0
    move-object v6, v0

    .line 106
    iget-object v1, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    move-wide v2, p1

    move-wide v4, p3

    invoke-static/range {v1 .. v6}, Ll/ۙۤܳ;->ۙ(Ll/۬ۙܳ;JJLl/ۙ۬ᩴ;)Ll/۬ۙܳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    return-void
.end method

.method private ۙ(Z)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-eqz v1, :cond_0

    .line 46
    iget-object v2, v0, Ll/ۙۤܳ;->֡:Ll/۟ᩴܳ;

    goto :goto_0

    :cond_0
    iget-object v2, v0, Ll/ۙۤܳ;->ۡ:Ll/۟ᩴܳ;

    .line 47
    :goto_0
    invoke-virtual {v2}, Ll/۟ᩴܳ;->poll()Ll/ܰᩴܳ;

    move-result-object v3

    if-eqz v3, :cond_14

    iget-wide v4, v3, Ll/ܰᩴܳ;->ۙ:J

    const/high16 v6, 0x40000

    .line 48
    iput v6, v0, Ll/ۙۤܳ;->ۢ:I

    if-eqz v1, :cond_1

    .line 49
    iget-wide v6, v0, Ll/ۙۤܳ;->۟:J

    goto :goto_1

    :cond_1
    iget-wide v6, v0, Ll/ۙۤܳ;->ۖ:J

    .line 50
    :goto_1
    iget-boolean v8, v3, Ll/ܰᩴܳ;->۫:Z

    if-nez v8, :cond_10

    iget-wide v8, v3, Ll/ܰᩴܳ;->ۤ:J

    cmp-long v10, v8, v6

    if-eqz v10, :cond_2

    goto/16 :goto_b

    .line 51
    :cond_2
    invoke-virtual {v3}, Ll/ܰᩴܳ;->᩷()I

    move-result v6

    const/16 v7, 0x1000

    if-le v6, v7, :cond_3

    .line 52
    invoke-virtual {v3}, Ll/ܰᩴܳ;->ۙ()Ll/ۘᩴܳ;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ll/ܰᩴܳ;->ۤ()Ljava/util/List;

    move-result-object v3

    .line 51
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۘᩴܳ;

    .line 53
    iget v7, v6, Ll/ۘᩴܳ;->ۤ:I

    iget v8, v6, Ll/ۘᩴܳ;->᩸:I

    int-to-long v9, v7

    iget v7, v6, Ll/ۘᩴܳ;->ۙ:I

    int-to-long v11, v7

    mul-long v9, v9, v11

    long-to-int v7, v9

    int-to-long v13, v7

    cmp-long v15, v9, v13

    if-nez v15, :cond_e

    .line 54
    iget v6, v6, Ll/ۘᩴܳ;->᩷:I

    int-to-long v9, v6

    mul-long v9, v9, v11

    long-to-int v6, v9

    int-to-long v11, v6

    cmp-long v13, v9, v11

    if-nez v13, :cond_d

    const-wide/16 v11, 0x1

    const/4 v13, 0x1

    if-ne v7, v6, :cond_6

    if-nez v7, :cond_4

    move-object/from16 v22, v2

    move-object/from16 v23, v3

    goto/16 :goto_a

    .line 86
    :cond_4
    iget-object v6, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-object v6, v6, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    const-wide/16 v14, 0x400

    .line 87
    invoke-virtual {v6, v8, v1}, Ll/ۙ۬ᩴ;->᩷(IZ)J

    move-result-wide v9

    add-int/2addr v8, v7

    sub-int/2addr v8, v13

    invoke-virtual {v6, v8, v1}, Ll/ۙ۬ᩴ;->᩷(IZ)J

    move-result-wide v7

    add-long/2addr v11, v7

    sub-long v14, v9, v14

    move-object/from16 v22, v2

    move-object/from16 v23, v3

    const-wide/16 v2, 0x0

    .line 88
    invoke-static {v2, v3, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iget-wide v14, v6, Ll/ۙ۬ᩴ;->᩻:J

    const-wide/16 v16, 0x401

    add-long v7, v7, v16

    invoke-static {v14, v15, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    sub-long v14, v7, v2

    const-wide/32 v16, 0x8000

    cmp-long v18, v14, v16

    if-gtz v18, :cond_5

    .line 90
    iget-object v14, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    .line 91
    invoke-static {v6, v9, v10, v11, v12}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;JJ)Ll/ۙ۬ᩴ;

    move-result-object v6

    invoke-static {v6, v13}, Ll/ۙ۬ᩴ;->ۙ(Ll/ۙ۬ᩴ;Z)Ll/ۙ۬ᩴ;

    move-result-object v21

    move-object/from16 v16, v14

    move-wide/from16 v17, v9

    move-wide/from16 v19, v11

    .line 90
    invoke-static/range {v16 .. v21}, Ll/ۙۤܳ;->ۙ(Ll/۬ۙܳ;JJLl/ۙ۬ᩴ;)Ll/۬ۙܳ;

    move-result-object v6

    iput-object v6, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    .line 93
    :cond_5
    invoke-direct {v0, v2, v3, v7, v8}, Ll/ۙۤܳ;->ۙ(JJ)V

    goto/16 :goto_a

    :cond_6
    move-object/from16 v22, v2

    move-object/from16 v23, v3

    const-wide/16 v2, 0x400

    .line 70
    iget-object v9, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-object v10, v9, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-eqz v1, :cond_7

    .line 71
    iget v14, v9, Ll/۬ۙܳ;->ۤ:I

    goto :goto_4

    :cond_7
    iget v14, v9, Ll/۬ۙܳ;->ᩴ:I

    :goto_4
    if-ne v8, v14, :cond_8

    .line 72
    iget-wide v14, v9, Ll/۬ۙܳ;->᩸:J

    goto :goto_5

    :cond_8
    invoke-virtual {v10, v8, v1}, Ll/ۙ۬ᩴ;->᩷(IZ)J

    move-result-wide v14

    :goto_5
    if-nez v7, :cond_9

    move-wide v7, v14

    goto :goto_6

    :cond_9
    add-int/2addr v8, v7

    sub-int/2addr v8, v13

    .line 73
    invoke-virtual {v10, v8, v1}, Ll/ۙ۬ᩴ;->᩷(IZ)J

    move-result-wide v7

    add-long/2addr v7, v11

    :goto_6
    if-nez v10, :cond_a

    const/4 v9, 0x0

    goto :goto_7

    :cond_a
    xor-int/lit8 v9, v1, 0x1

    .line 74
    invoke-virtual {v10, v7, v8, v9}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v11

    invoke-virtual {v10, v14, v15, v9}, Ll/ۙ۬ᩴ;->ۙ(JZ)I

    move-result v9

    sub-int v9, v11, v9

    :goto_7
    if-eqz v1, :cond_b

    move v10, v6

    goto :goto_8

    :cond_b
    move v10, v9

    :goto_8
    if-eqz v1, :cond_c

    move v11, v9

    goto :goto_9

    :cond_c
    move v11, v6

    :goto_9
    const/4 v12, 0x5

    .line 75
    invoke-static {v12, v10, v11}, Ll/ۙ۬ᩴ;->ۙ(III)Ll/ۙ۬ᩴ;

    move-result-object v29

    .line 77
    iget-object v10, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    move-object/from16 v24, v10

    move-wide/from16 v25, v14

    move-wide/from16 v27, v7

    invoke-static/range {v24 .. v29}, Ll/ۙۤܳ;->ۙ(Ll/۬ۙܳ;JJLl/ۙ۬ᩴ;)Ll/۬ۙܳ;

    move-result-object v7

    iput-object v7, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    .line 79
    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    int-to-long v6, v6

    sub-long v8, v14, v2

    const-wide/16 v10, 0x0

    .line 80
    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    iget-object v10, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v10, v10, Ll/۬ۙܳ;->᩸:J

    add-long/2addr v14, v6

    add-long/2addr v14, v2

    .line 81
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    .line 80
    invoke-direct {v0, v8, v9, v2, v3}, Ll/ۙۤܳ;->ۙ(JJ)V

    :goto_a
    move-object/from16 v2, v22

    move-object/from16 v3, v23

    goto/16 :goto_3

    .line 0
    :cond_d
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_f
    move-object/from16 v22, v2

    goto :goto_d

    :cond_10
    :goto_b
    move-object/from16 v22, v2

    .line 50
    iget v2, v3, Ll/ܰᩴܳ;->᩷:I

    .line 64
    new-instance v3, Ll/۬ۙܳ;

    if-eqz v1, :cond_11

    move v6, v2

    goto :goto_c

    .line 65
    :cond_11
    iget-object v6, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget v6, v6, Ll/۬ۙܳ;->ۤ:I

    :goto_c
    if-eqz v1, :cond_12

    iget-object v2, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget v2, v2, Ll/۬ۙܳ;->ᩴ:I

    :cond_12
    const/4 v7, 0x4

    .line 64
    invoke-static {v7, v6, v2}, Ll/ۙ۬ᩴ;->ۙ(III)Ll/ۙ۬ᩴ;

    move-result-object v2

    invoke-direct {v3, v2}, Ll/۬ۙܳ;-><init>(Ll/ۙ۬ᩴ;)V

    iput-object v3, v0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    :goto_d
    if-eqz v1, :cond_13

    .line 58
    iput-wide v4, v0, Ll/ۙۤܳ;->۟:J

    goto :goto_e

    :cond_13
    iput-wide v4, v0, Ll/ۙۤܳ;->ۖ:J

    :goto_e
    move-object/from16 v2, v22

    goto/16 :goto_0

    :cond_14
    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 155
    :try_start_0
    iget-boolean v1, p0, Ll/ۙۤܳ;->ܰ:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/ۙۤܳ;->ܰ:Z

    iget-object v1, p0, Ll/ۙۤܳ;->֡:Ll/۟ᩴܳ;

    invoke-virtual {v1}, Ll/۟ᩴܳ;->close()V

    iget-object v1, p0, Ll/ۙۤܳ;->ۡ:Ll/۟ᩴܳ;

    invoke-virtual {v1}, Ll/۟ᩴܳ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۙ()Ll/۬᩷ܳ;
    .locals 14

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 117
    :try_start_0
    invoke-virtual {p0}, Ll/ۙۤܳ;->᩷()Ll/۬ۙܳ;

    .line 118
    iget-object v1, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v2, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    :try_start_2
    iget-object v3, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۙۤܳ;->۟:J

    const/4 v7, 0x0

    cmp-long v8, v3, v5

    if-nez v8, :cond_7

    iget-object v3, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۙۤܳ;->ۖ:J

    cmp-long v8, v3, v5

    if-eqz v8, :cond_0

    goto/16 :goto_4

    .line 120
    :cond_0
    iget-object v3, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-object v3, v3, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-eqz v3, :cond_6

    .line 121
    iget-boolean v4, v3, Ll/ۙ۬ᩴ;->ܺ:Z

    if-eqz v4, :cond_6

    iget v4, p0, Ll/ۙۤܳ;->ۢ:I

    if-gtz v4, :cond_1

    goto/16 :goto_3

    .line 122
    :cond_1
    iget-wide v4, p0, Ll/ۙۤܳ;->ᩳ:J

    invoke-virtual {v3, v4, v5}, Ll/ۙ۬ᩴ;->ۙ(J)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-gez v8, :cond_4

    .line 89
    iget-boolean v4, v3, Ll/ۙ۬ᩴ;->ܺ:Z

    if-nez v4, :cond_2

    const-wide/16 v4, -0x1

    goto :goto_1

    :cond_2
    move-object v8, v3

    move-wide v4, v6

    .line 91
    :goto_0
    iget-object v9, v8, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v9, :cond_4

    .line 92
    iget-boolean v10, v9, Ll/ۙ۬ᩴ;->ܺ:Z

    if-eqz v10, :cond_3

    move-object v8, v9

    goto :goto_0

    .line 93
    :cond_3
    iget-wide v9, v9, Ll/ۙ۬ᩴ;->᩻:J

    add-long/2addr v4, v9

    iget-object v8, v8, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_0

    :cond_4
    :goto_1
    move-wide v8, v4

    .line 124
    invoke-virtual {v3, v8, v9}, Ll/ۙ۬ᩴ;->᩷(J)J

    move-result-wide v4

    .line 125
    iget v10, p0, Ll/ۙۤܳ;->ۢ:I

    const v11, 0x8000

    invoke-static {v11, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    int-to-long v10, v10

    add-long/2addr v10, v8

    cmp-long v12, v4, v6

    if-gez v12, :cond_5

    iget-wide v4, v3, Ll/ۙ۬ᩴ;->᩻:J

    :cond_5
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    .line 126
    iget-object v3, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܿ()Ll/۟ܳܳ;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    :try_start_3
    new-instance v12, Ll/۬᩷ܳ;

    iget-object v5, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-object v4, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    invoke-virtual {v4}, Ll/ᩳܳܳ;->ܿ()Ll/۟ܳܳ;

    move-result-object v13

    move-object v4, v12

    move-wide v6, v8

    move-wide v8, v10

    move-object v10, v3

    move-object v11, v13

    invoke-direct/range {v4 .. v11}, Ll/۬᩷ܳ;-><init>(Ll/۬ۙܳ;JJLl/۟ܳܳ;Ll/۟ܳܳ;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit v0

    return-object v12

    :catch_0
    move-exception v4

    goto :goto_2

    :catch_1
    move-exception v4

    .line 129
    :goto_2
    :try_start_6
    invoke-virtual {v3}, Ll/۟ܳܳ;->close()V

    throw v4

    .line 121
    :cond_6
    :goto_3
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    monitor-exit v0

    return-object v7

    .line 119
    :cond_7
    :goto_4
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    monitor-exit v0

    return-object v7

    :catchall_0
    move-exception v3

    .line 130
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw v3

    :catchall_1
    move-exception v2

    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :try_start_c
    throw v2

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    throw v1
.end method

.method public final declared-synchronized ۙ(Ll/۬᩷ܳ;Ll/۬ۙܳ;)V
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 135
    :try_start_0
    iget-boolean v1, p0, Ll/ۙۤܳ;->ܰ:Z

    if-nez v1, :cond_4

    iget-boolean v1, p1, Ll/۬᩷ܳ;->֡:Z

    if-nez v1, :cond_4

    iget-object v1, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-object v2, p1, Ll/۬᩷ܳ;->ܿ:Ll/۬ۙܳ;

    if-eq v1, v2, :cond_0

    goto/16 :goto_1

    .line 136
    :cond_0
    iget-object v1, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v2, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 137
    :try_start_2
    invoke-static {p1}, Ll/۬᩷ܳ;->ۙ(Ll/۬᩷ܳ;)Ll/۟ܳܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۟ܳܳ;->᩷()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {p1}, Ll/۬᩷ܳ;->᩷(Ll/۬᩷ܳ;)Ll/۟ܳܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۟ܳܳ;->᩷()Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    .line 138
    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v3

    iget-wide v5, p1, Ll/۬᩷ܳ;->֨:J

    cmp-long v7, v3, v5

    if-nez v7, :cond_3

    iget-object v3, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    invoke-virtual {v3}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v3

    iget-wide v5, p1, Ll/۬᩷ܳ;->۠:J

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    goto :goto_0

    .line 139
    :cond_1
    iget v3, p2, Ll/۬ۙܳ;->ۤ:I

    iget v4, p1, Ll/۬᩷ܳ;->ۖ:I

    if-ne v3, v4, :cond_2

    iget v3, p2, Ll/۬ۙܳ;->ᩴ:I

    iget v4, p1, Ll/۬᩷ܳ;->ۡ:I

    if-ne v3, v4, :cond_2

    .line 141
    iget-object v5, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    iget-wide v6, p1, Ll/۬᩷ܳ;->ۢ:J

    iget-wide v8, p1, Ll/۬᩷ܳ;->۟:J

    iget-object v10, p2, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    invoke-static/range {v5 .. v10}, Ll/ۙۤܳ;->ۙ(Ll/۬ۙܳ;JJLl/ۙ۬ᩴ;)Ll/۬ۙܳ;

    move-result-object v3

    iput-object v3, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    .line 142
    iget v3, p0, Ll/ۙۤܳ;->ۢ:I

    iget v4, p1, Ll/۬᩷ܳ;->ۖ:I

    iget v5, p1, Ll/۬᩷ܳ;->ۡ:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, p0, Ll/ۙۤܳ;->ۢ:I

    .line 143
    iget-wide v3, p1, Ll/۬᩷ܳ;->ۢ:J

    iget-wide p1, p2, Ll/۬ۙܳ;->᩸:J

    add-long/2addr v3, p1

    iput-wide v3, p0, Ll/ۙۤܳ;->ᩳ:J

    .line 144
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-void

    .line 140
    :cond_2
    :try_start_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Local comparison coverage mismatch"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 138
    :cond_3
    :goto_0
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 145
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw p1

    :catchall_1
    move-exception p1

    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 135
    :cond_4
    :goto_1
    monitor-exit v0

    return-void

    :catchall_2
    move-exception p1

    :try_start_9
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    throw p1
.end method

.method public final declared-synchronized ᩷()Ll/۬ۙܳ;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 158
    :try_start_0
    iget-boolean v1, p0, Ll/ۙۤܳ;->ܰ:Z

    if-nez v1, :cond_0

    .line 39
    iget-object v1, p0, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v2, p0, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x1

    .line 40
    :try_start_2
    invoke-direct {p0, v3}, Ll/ۙۤܳ;->ۙ(Z)V

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Ll/ۙۤܳ;->ۙ(Z)V

    .line 41
    iget-object v3, p0, Ll/ۙۤܳ;->᩶:Ll/۬ۙܳ;

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception v3

    .line 42
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v3

    :catchall_1
    move-exception v2

    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw v2

    .line 158
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Comparison session is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_2
    move-exception v1

    .line 42
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw v1
.end method

.method public final declared-synchronized ᩷(J)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    const-wide/16 v1, 0x400

    sub-long/2addr p1, v1

    const-wide/16 v1, 0x0

    .line 150
    :try_start_0
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۙۤܳ;->ᩳ:J

    const/high16 p1, 0x40000

    .line 151
    iput p1, p0, Ll/ۙۤܳ;->ۢ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
