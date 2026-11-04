.class public final Ll/ܶ᩵᩸;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Ll/ۖ᩹᩸;


# instance fields
.field public ֫:Ll/᩹ܽ᩵;

.field public ۗ:I

.field public ۙ:Ll/᩹ܽ᩵;

.field public ۚ:Ll/᩹ܽ᩵;

.field public ۤ:Ljava/lang/ref/WeakReference;

.field public ۧ:Ll/ۜۗ᩸;

.field public final ۨ:Ll/ۗۤᩴ;

.field public ۫:Ll/᩷᩶᩸;

.field public ܳ:Ll/۬ܶ᩸;

.field public volatile ܶ:Ljava/lang/String;

.field public ܺ:Ll/ᩴۗ᩸;

.field public final ܽ:Ll/ۚ᩹᩸;

.field public ᩴ:Ll/᩹ܽ᩵;

.field public final ᩵:Ll/ܽۢ᩸;

.field public final ᩷:Ll/֫ۤᩴ;

.field public volatile ᩸:Ll/۠᩹᩸;

.field public ᩹:Z

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܽۢ᩸;Ll/ۗۤᩴ;Ll/ᩴۗ᩸;Ll/ۚ᩹᩸;)V
    .locals 2

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 38
    iput v0, p0, Ll/ܶ᩵᩸;->ۗ:I

    const-wide/16 v0, 0x0

    .line 42
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/ܶ᩵᩸;->ۚ:Ll/᩹ܽ᩵;

    .line 49
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܶ᩵᩸;->ۤ:Ljava/lang/ref/WeakReference;

    const-string v0, "active"

    .line 50
    iput-object v0, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    .line 95
    iput-object p1, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    iput-object p2, p0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    iput-object p3, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iput-object p4, p0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    .line 96
    new-instance p1, Ll/֫ۤᩴ;

    invoke-direct {p1, p2}, Ll/֫ۤᩴ;-><init>(Ll/ᩳ۬᩸;)V

    iput-object p1, p0, Ll/ܶ᩵᩸;->᩷:Ll/֫ۤᩴ;

    return-void
.end method

.method public static synthetic ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 575
    invoke-static {p0, p1}, Ll/ܶ᩵᩸;->᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ܶ᩵᩸;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 572
    :try_start_0
    iget-object p0, p0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {p0}, Ll/ۗۤᩴ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p0

    .line 573
    invoke-static {p1, p0}, Ll/ܶ᩵᩸;->᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;Ljava/util/concurrent/Executor;ILl/۟֡֫;Ljava/lang/String;)Ll/ܶ᩵᩸;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move/from16 v8, p4

    move-object/from16 v1, p6

    const-string v2, "app-pages"

    .line 47
    invoke-interface {v0, v2}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ll/᩵۬᩹;

    sget-object v4, Ll/᩵۬᩹;->NOFOLLOW_LINKS:Ll/᩵۬᩹;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ll/ۗ۬᩹;->exists(Ll/᩺۬᩹;[Ll/᩵۬᩹;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 113
    invoke-static/range {p0 .. p0}, Ll/۬ܶ᩸;->᩷(Ll/᩺۬᩹;)Ll/۬ܶ᩸;

    move-result-object v0

    new-instance v1, Ll/ᩳ᩵᩸;

    invoke-direct {v1, v9, v10, v11}, Ll/ᩳ᩵᩸;-><init>(Ll/֡ۢ᩸;Ll/ۖۢ᩸;Ljava/util/concurrent/Executor;)V

    move-object/from16 v12, p5

    invoke-virtual {v0, v1, v8, v12}, Ll/۬ܶ᩸;->ۙ(Ll/ᩳ᩵᩸;ILl/۟֡֫;)Ll/ܶ᩵᩸;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v12, p5

    .line 115
    invoke-static/range {p1 .. p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    invoke-static/range {p3 .. p3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-ltz v8, :cond_6

    .line 118
    invoke-static/range {p5 .. p5}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 122
    :try_start_0
    invoke-static/range {p0 .. p2}, Ll/ܽۢ᩸;->᩷(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;)Ll/᩻ۢ᩸;

    move-result-object v14
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_9
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_7

    .line 123
    :try_start_1
    invoke-static/range {p5 .. p5}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    if-eqz v1, :cond_1

    .line 124
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->ܳ()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ll/֨ܶ᩸;->ۙ(Ll/᩺۬᩹;Ljava/lang/String;Ljava/util/UUID;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_11

    .line 126
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->ۙ()[B

    move-result-object v1

    invoke-virtual {v14}, Ll/᩻ۢ᩸;->ܳ()Ljava/util/UUID;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ۧۤᩴ;->ۙ(Ljava/util/UUID;[B)Ll/ۙᩳ᩸;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    .line 129
    :try_start_3
    invoke-static {v14, v0, v9, v8}, Ll/۫ۗ᩸;->ۙ(Ll/᩻ۢ᩸;Ll/᩺۬᩹;Ll/֡ۢ᩸;I)Ll/۫ۗ᩸;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۗ᩸;->ۙ()Ll/ᩴۗ᩸;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    :try_start_4
    invoke-static/range {p5 .. p5}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 131
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->᩷()Ll/ܽۢ᩸;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 132
    :try_start_5
    invoke-virtual {v2}, Ll/ܽۢ᩸;->᩸ۙ()V

    .line 133
    new-instance v3, Ll/ۗۤᩴ;

    invoke-direct {v3, v2}, Ll/ۗۤᩴ;-><init>(Ll/ܽۢ᩸;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    const/4 v13, 0x0

    goto/16 :goto_3

    :catchall_2
    move-exception v0

    const/4 v3, 0x0

    const/4 v13, 0x0

    goto/16 :goto_10

    .line 136
    :cond_2
    :try_start_6
    invoke-static {v14, v0, v9, v8}, Ll/᩹ܶ᩸;->ۙ(Ll/᩻ۢ᩸;Ll/᩺۬᩹;Ll/֡ۢ᩸;I)Ll/᩹ܶ᩸;

    move-result-object v15

    iget-object v7, v15, Ll/᩹ܶ᩸;->ᩴ:Ll/ۘۙᩴ;

    .line 137
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->۫()Ll/ۜܿ᩸;

    move-result-object v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 77
    :try_start_7
    iget-object v1, v15, Ll/᩹ܶ᩸;->ۤ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v2

    iget-object v3, v15, Ll/᩹ܶ᩸;->᩸:Ll/᩸᩶᩸;

    invoke-static {v7}, Ll/ۨۤᩴ;->ۙ(Ll/ۘۙᩴ;)Ll/ۨۤᩴ;

    move-result-object v4

    iget-object v5, v15, Ll/᩹ܶ᩸;->᩷:[B

    iget-object v1, v15, Ll/᩹ܶ᩸;->ۙ:[B
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_12

    move-object/from16 v16, v1

    move-object v1, v6

    move-object v13, v6

    move-object/from16 v6, v16

    move-object/from16 v16, v7

    move/from16 v7, p4

    :try_start_8
    invoke-static/range {v1 .. v7}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[B[BI)Ll/ۤۗ᩸;

    move-result-object v6
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_11

    .line 139
    :try_start_9
    invoke-virtual {v6, v13, v8}, Ll/ۤۗ᩸;->ۙ(Ll/ۜܿ᩸;I)Ll/۫ۗ᩸;

    move-result-object v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_e

    .line 140
    :try_start_a
    invoke-static/range {p5 .. p5}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 141
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->ܳ()Ljava/util/UUID;

    move-result-object v2

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v6}, Ll/ۤۗ᩸;->ۙ()[B

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 142
    invoke-virtual {v6}, Ll/ۤۗ᩸;->ۙ()[B

    move-result-object v1

    array-length v1, v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    int-to-long v4, v1

    move-object/from16 p6, v6

    move-object/from16 v18, v7

    int-to-long v6, v8

    move-object/from16 v1, p0

    move-object/from16 v8, v18

    move-object/from16 v18, p6

    move-object v12, v8

    move-object/from16 v8, p1

    .line 141
    :try_start_b
    invoke-static/range {v1 .. v8}, Ll/ۙᩳ᩸;->ۙ(Ll/᩺۬᩹;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֡ۢ᩸;)Ll/ۙᩳ᩸;

    move-result-object v1

    .line 143
    invoke-static/range {p5 .. p5}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 144
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->᩷()Ll/ܽۢ᩸;

    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 145
    :try_start_c
    invoke-virtual {v2}, Ll/ܽۢ᩸;->᩸ۙ()V

    .line 146
    new-instance v3, Ll/ۗۤᩴ;

    invoke-virtual/range {v16 .. v16}, Ll/ۘۙᩴ;->ۙ()J

    move-result-wide v4

    invoke-direct {v3, v2, v4, v5}, Ll/ۗۤᩴ;-><init>(Ll/ܽۢ᩸;J)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 147
    :try_start_d
    invoke-virtual {v2}, Ll/ܽۢ᩸;->ܳ()Ll/ܳۢ᩸;

    move-result-object v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 148
    :try_start_e
    invoke-virtual {v4}, Ll/ܳۢ᩸;->ۙ()[B

    move-result-object v5

    invoke-virtual {v2}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v6

    invoke-static {v5, v1, v6}, Ll/ۧۤᩴ;->ۙ([BLl/ۙᩳ᩸;Ljava/util/UUID;)[B

    move-result-object v1

    invoke-virtual {v4, v1}, Ll/ܳۢ᩸;->᩷([B)J

    move-result-wide v5

    .line 149
    invoke-virtual {v2, v5, v6}, Ll/ܽۢ᩸;->᩷(J)Ll/᩹ܽ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 150
    :try_start_f
    invoke-virtual {v4}, Ll/ܳۢ᩸;->close()V

    .line 151
    iget-object v1, v15, Ll/᩹ܶ᩸;->᩸:Ll/᩸᩶᩸;

    invoke-virtual {v12, v2, v1}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩸᩶᩸;)Ll/ᩴۗ᩸;

    move-result-object v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 152
    :try_start_10
    invoke-virtual {v12}, Ll/۫ۗ᩸;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    :try_start_11
    invoke-virtual/range {v18 .. v18}, Ll/ۤۗ᩸;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    :try_start_12
    invoke-virtual {v13}, Ll/۠ܿ᩸;->close()V

    .line 154
    :goto_1
    iget-object v4, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    invoke-virtual {v4, v2}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;)V

    .line 155
    invoke-static/range {p5 .. p5}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 156
    new-instance v4, Ll/ܶ᩵᩸;

    new-instance v5, Ll/ۚ᩹᩸;

    invoke-direct {v5, v2, v0, v9, v11}, Ll/ۚ᩹᩸;-><init>(Ll/ܽۢ᩸;Ll/᩺۬᩹;Ll/֡ۢ᩸;Ljava/util/concurrent/Executor;)V

    invoke-direct {v4, v2, v3, v1, v5}, Ll/ܶ᩵᩸;-><init>(Ll/ܽۢ᩸;Ll/ۗۤᩴ;Ll/ᩴۗ᩸;Ll/ۚ᩹᩸;)V

    .line 158
    iget-object v0, v4, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    new-instance v5, Ll/ᩳ᩵᩸;

    invoke-direct {v5, v9, v10, v11}, Ll/ᩳ᩵᩸;-><init>(Ll/֡ۢ᩸;Ll/ۖۢ᩸;Ljava/util/concurrent/Executor;)V

    iput-object v5, v0, Ll/ۚ᩹᩸;->ܽ:Ll/ᩳ᩵᩸;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 160
    :try_start_13
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_13 .. :try_end_13} :catch_1
    .catch Ljava/lang/Error; {:try_start_13 .. :try_end_13} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    :goto_2
    move-object v13, v1

    goto/16 :goto_15

    :catchall_3
    move-exception v0

    move-object v13, v3

    :goto_3
    move-object v3, v13

    move-object v13, v2

    goto/16 :goto_10

    :catchall_4
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_c

    :catchall_5
    move-exception v0

    move-object/from16 v17, v1

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object v1, v0

    .line 147
    :try_start_14
    invoke-virtual {v4}, Ll/ܳۢ᩸;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception v0

    move-object v4, v0

    :try_start_15
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    :catchall_8
    move-exception v0

    move-object v1, v0

    goto :goto_7

    :catchall_9
    move-exception v0

    move-object v1, v0

    goto :goto_6

    :catchall_a
    move-exception v0

    goto :goto_5

    :catchall_b
    move-exception v0

    move-object/from16 v18, v6

    move-object v12, v7

    :goto_5
    move-object v1, v0

    const/4 v2, 0x0

    :goto_6
    const/4 v3, 0x0

    .line 137
    :goto_7
    :try_start_16
    invoke-virtual {v12}, Ll/۫ۗ᩸;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_c

    goto :goto_8

    :catchall_c
    move-exception v0

    move-object v4, v0

    :try_start_17
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    :catchall_d
    move-exception v0

    const/16 v17, 0x0

    :goto_9
    move-object v1, v0

    move-object/from16 v19, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v19

    goto :goto_a

    :catchall_e
    move-exception v0

    move-object/from16 v18, v6

    move-object v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x0

    :goto_a
    :try_start_18
    invoke-virtual/range {v18 .. v18}, Ll/ۤۗ᩸;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_f

    goto :goto_b

    :catchall_f
    move-exception v0

    move-object v4, v0

    :try_start_19
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    :catchall_10
    move-exception v0

    move-object v1, v2

    :goto_c
    move-object v2, v1

    move-object v1, v0

    goto :goto_e

    :catchall_11
    move-exception v0

    goto :goto_d

    :catchall_12
    move-exception v0

    move-object v13, v6

    :goto_d
    move-object v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/16 v17, 0x0

    :goto_e
    :try_start_1a
    invoke-virtual {v13}, Ll/۠ܿ᩸;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_13

    goto :goto_f

    :catchall_13
    move-exception v0

    move-object v4, v0

    :try_start_1b
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_14

    :catchall_14
    move-exception v0

    move-object v1, v2

    move-object/from16 v13, v17

    :goto_10
    move-object/from16 v17, v1

    move-object v1, v0

    goto :goto_12

    :catch_3
    move-exception v0

    .line 127
    :try_start_1c
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid fragment recovery metadata"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    :goto_11
    move-object v1, v0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    .line 122
    :goto_12
    :try_start_1d
    invoke-virtual {v14}, Ll/᩻ۢ᩸;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_15

    goto :goto_13

    :catchall_15
    move-exception v0

    move-object v2, v0

    :try_start_1e
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_13
    throw v1
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_1e .. :try_end_1e} :catch_5
    .catch Ljava/lang/Error; {:try_start_1e .. :try_end_1e} :catch_4

    :catch_4
    move-exception v0

    goto :goto_14

    :catch_5
    move-exception v0

    goto :goto_14

    :catch_6
    move-exception v0

    :goto_14
    move-object v2, v13

    move-object/from16 v13, v17

    :goto_15
    move-object v1, v0

    move-object/from16 v17, v3

    goto :goto_17

    :catch_7
    move-exception v0

    goto :goto_16

    :catch_8
    move-exception v0

    goto :goto_16

    :catch_9
    move-exception v0

    :goto_16
    move-object v1, v0

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_17
    if-eqz v13, :cond_3

    .line 161
    invoke-virtual {v13}, Ll/ᩴۗ᩸;->close()V

    :cond_3
    if-eqz v17, :cond_4

    .line 163
    :try_start_1f
    invoke-virtual/range {v17 .. v17}, Ll/ۗۤᩴ;->close()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_16

    goto :goto_18

    :catchall_16
    move-exception v0

    move-object v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_18
    if-eqz v2, :cond_5

    .line 166
    :try_start_20
    invoke-virtual {v2}, Ll/ܽۢ᩸;->ۙ()Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_17

    goto :goto_19

    :catchall_17
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 168
    :cond_5
    :goto_19
    throw v1

    .line 117
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negative fragment state limit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/᩺۬᩹;Ll/ᩳ᩵᩸;)Ll/ܶ᩵᩸;
    .locals 6

    .line 174
    iget-object v0, p1, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    iget-object v1, p1, Ll/ᩳ᩵᩸;->ۤ:Ll/ۖۢ᩸;

    invoke-static {p0, v0, v1}, Ll/ܽۢ᩸;->ۙ(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;)Ll/ܽۢ᩸;

    move-result-object v0

    .line 175
    invoke-virtual {v0}, Ll/ܽۢ᩸;->᩸ۙ()V

    .line 176
    new-instance v1, Ll/ܶ᩵᩸;

    new-instance v2, Ll/ۗۤᩴ;

    invoke-direct {v2, v0}, Ll/ۗۤᩴ;-><init>(Ll/ܽۢ᩸;)V

    new-instance v3, Ll/ۚ᩹᩸;

    iget-object v4, p1, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    iget-object v5, p1, Ll/ᩳ᩵᩸;->᩷:Ljava/util/concurrent/Executor;

    invoke-direct {v3, v0, p0, v4, v5}, Ll/ۚ᩹᩸;-><init>(Ll/ܽۢ᩸;Ll/᩺۬᩹;Ll/֡ۢ᩸;Ljava/util/concurrent/Executor;)V

    const/4 p0, 0x0

    invoke-direct {v1, v0, v2, p0, v3}, Ll/ܶ᩵᩸;-><init>(Ll/ܽۢ᩸;Ll/ۗۤᩴ;Ll/ᩴۗ᩸;Ll/ۚ᩹᩸;)V

    .line 178
    iget-object p0, v1, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    iput-object p1, p0, Ll/ۚ᩹᩸;->ܽ:Ll/ᩳ᩵᩸;

    return-object v1
.end method

.method public static synthetic ۙ(Ll/ܶ᩵᩸;)Ll/᩹ܽ᩵;
    .locals 1

    const-string v0, "closing_text_session"

    .line 542
    iput-object v0, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    .line 543
    iget-object p0, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {p0}, Ll/ܽۢ᩸;->᩹()Ll/᩹ܽ᩵;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move/from16 v2, p5

    .line 322
    iget-object v3, v1, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    iget-object v4, v1, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {v4}, Ll/ۚ᩹᩸;->᩸()Ll/᩺۬᩹;

    move-result-object v4

    .line 323
    :try_start_0
    iget-object v5, v1, Ll/ܶ᩵᩸;->ۧ:Ll/ۜۗ᩸;

    if-nez v5, :cond_0

    const/4 v5, 0x0

    move-object v13, v5

    goto :goto_0

    .line 57
    :cond_0
    new-instance v6, Ll/۠ۗ᩸;

    invoke-direct {v6, v5}, Ll/۠ۗ᩸;-><init>(Ll/ۜۗ᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_f

    move-object v13, v6

    .line 324
    :goto_0
    :try_start_1
    invoke-virtual {v3}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    .line 325
    :try_start_2
    invoke-static/range {p1 .. p1}, Ll/֨᩵᩸;->ۙ(Landroid/os/Bundle;)J

    move-result-wide v5

    const-wide/32 v7, 0x8000

    add-long/2addr v5, v7

    invoke-virtual {v14, v5, v6}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    move-object/from16 v12, p3

    .line 326
    :try_start_3
    invoke-virtual {v12, v14, v2}, Ll/ۤۗ᩸;->ۙ(Ll/ۜܿ᩸;I)Ll/۫ۗ᩸;

    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_7

    .line 327
    :try_start_4
    invoke-static/range {p6 .. p6}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 328
    invoke-virtual {v3}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v6

    new-instance v7, Ljava/io/ByteArrayInputStream;

    invoke-virtual/range {p3 .. p3}, Ll/ۤۗ᩸;->ۙ()[B

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual/range {p3 .. p3}, Ll/ۤۗ᩸;->ۙ()[B

    move-result-object v5

    array-length v5, v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    int-to-long v8, v5

    move-object/from16 v16, v10

    int-to-long v10, v2

    move-object/from16 v2, p4

    :try_start_5
    iget-object v2, v2, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v5, v4

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    move-object v12, v2

    :try_start_6
    invoke-static/range {v5 .. v12}, Ll/ۙᩳ᩸;->ۙ(Ll/᩺۬᩹;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֡ۢ᩸;)Ll/ۙᩳ᩸;

    move-result-object v2

    .line 329
    invoke-virtual {v3}, Ll/ܽۢ᩸;->ܳ()Ll/ܳۢ᩸;

    move-result-object v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 330
    :try_start_7
    invoke-virtual {v5}, Ll/ܳۢ᩸;->ۙ()[B

    move-result-object v6

    invoke-virtual {v3}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v7

    invoke-static {v6, v2, v7}, Ll/ۧۤᩴ;->ۙ([BLl/ۙᩳ᩸;Ljava/util/UUID;)[B

    move-result-object v2

    invoke-virtual {v5, v2}, Ll/ܳۢ᩸;->᩷([B)J

    move-result-wide v6

    .line 331
    invoke-virtual {v3, v6, v7}, Ll/ܽۢ᩸;->᩷(J)Ll/᩹ܽ᩵;

    move-result-object v2

    iput-object v2, v1, Ll/ܶ᩵᩸;->ۚ:Ll/᩹ܽ᩵;

    if-nez p7, :cond_1

    .line 332
    invoke-virtual {v2}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 333
    :cond_1
    :try_start_8
    invoke-virtual {v5}, Ll/ܳۢ᩸;->close()V

    move-object/from16 v2, p1

    .line 335
    invoke-static {v4, v2}, Ll/֨᩵᩸;->ۙ(Ll/᩺۬᩹;Landroid/os/Bundle;)V

    .line 336
    iget-object v4, v1, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-eqz v4, :cond_2

    .line 337
    iget-object v4, v1, Ll/ܶ᩵᩸;->ۚ:Ll/᩹ܽ᩵;

    invoke-virtual {v4}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    .line 338
    iget-object v6, v1, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    iget v7, v1, Ll/ܶ᩵᩸;->᩻:I

    iget-object v4, v1, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v4}, Ll/ۗۤᩴ;->isChanged()Z

    move-result v9

    iget v10, v0, Ll/᩸᩶᩸;->ۤ:I

    iget-object v4, v13, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    iget-object v5, v1, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    invoke-virtual {v5}, Ll/۬ܶ᩸;->᩸()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/ۨۤᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v8, p1

    invoke-virtual/range {v6 .. v11}, Ll/۬ܶ᩸;->ۙ(ILandroid/os/Bundle;ZILjava/lang/String;)V

    .line 340
    :cond_2
    invoke-virtual {v13, v3, v0}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩸᩶᩸;)Ll/ᩴۗ᩸;

    move-result-object v0

    .line 345
    iget-object v2, v1, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    .line 346
    iput-object v0, v1, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    if-eqz v2, :cond_3

    .line 347
    invoke-virtual {v2}, Ll/ᩴۗ᩸;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 341
    :cond_3
    :try_start_9
    invoke-virtual {v13}, Ll/۫ۗ᩸;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-eqz v15, :cond_4

    :try_start_a
    invoke-virtual {v15}, Ll/ܿۢ᩸;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :cond_4
    :try_start_b
    invoke-virtual {v14}, Ll/۠ܿ᩸;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_c

    if-eqz v17, :cond_5

    :try_start_c
    invoke-virtual/range {v17 .. v17}, Ll/۠ۗ᩸;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_f

    :cond_5
    invoke-virtual/range {p3 .. p3}, Ll/ۤۗ᩸;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 329
    :try_start_d
    invoke-virtual {v5}, Ll/ܳۢ᩸;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_e
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    goto :goto_2

    :catchall_4
    move-exception v0

    move-object/from16 v17, v13

    move-object v13, v10

    :goto_2
    move-object v2, v0

    .line 323
    :try_start_f
    invoke-virtual {v13}, Ll/۫ۗ᩸;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    move-object v3, v0

    :try_start_10
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    :catchall_6
    move-exception v0

    goto :goto_4

    :catchall_7
    move-exception v0

    move-object/from16 v17, v13

    :goto_4
    move-object v2, v0

    if-eqz v15, :cond_6

    :try_start_11
    invoke-virtual {v15}, Ll/ܿۢ᩸;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    goto :goto_5

    :catchall_8
    move-exception v0

    move-object v3, v0

    :try_start_12
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_5
    throw v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    :catchall_9
    move-exception v0

    goto :goto_6

    :catchall_a
    move-exception v0

    move-object/from16 v17, v13

    :goto_6
    move-object v2, v0

    :try_start_13
    invoke-virtual {v14}, Ll/۠ܿ᩸;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_b

    goto :goto_7

    :catchall_b
    move-exception v0

    move-object v3, v0

    :try_start_14
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_c

    :catchall_c
    move-exception v0

    goto :goto_8

    :catchall_d
    move-exception v0

    move-object/from16 v17, v13

    :goto_8
    move-object v2, v0

    if-eqz v17, :cond_7

    :try_start_15
    invoke-virtual/range {v17 .. v17}, Ll/۠ۗ᩸;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    goto :goto_9

    :catchall_e
    move-exception v0

    move-object v3, v0

    :try_start_16
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_9
    throw v2
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_f

    :catchall_f
    move-exception v0

    move-object v2, v0

    :try_start_17
    invoke-virtual/range {p3 .. p3}, Ll/ۤۗ᩸;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_10

    goto :goto_a

    :catchall_10
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
.end method

.method private ۙ(Ljava/lang/Throwable;)V
    .locals 3

    move-object v0, p0

    .line 89
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->᩸:Ll/۠᩹᩸;

    const/4 v2, 0x0

    iput-object v2, p0, Ll/ܶ᩵᩸;->᩸:Ll/۠᩹᩸;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {v1, p1}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 89
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ۙ(Ll/ۖܰ᩸;ZLl/ۚ᩶᩸;IILl/ᩳ᩵᩸;Ll/۟֡֫;Z)V
    .locals 20

    move-object/from16 v9, p0

    move-object/from16 v0, p3

    .line 426
    iget-object v1, v0, Ll/ۚ᩶᩸;->᩸:Ljava/lang/CharSequence;

    invoke-static/range {p7 .. p7}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    const-string v2, "replacing_source_text"

    .line 427
    invoke-virtual {v9, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 428
    iget-object v2, v9, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v2}, Ll/ۙܿ᩸;->length()I

    move-result v3

    const-string v4, ""

    const/4 v10, 0x0

    invoke-virtual {v2, v10, v3, v4}, Ll/ۙܿ᩸;->replace(IILjava/lang/CharSequence;)Ll/ۙܿ᩸;

    iget-object v11, v9, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {v11}, Ll/ܽۢ᩸;->ܶ()V

    const/4 v3, 0x0

    const/4 v7, 0x0

    .line 429
    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v7, v3, :cond_1

    .line 430
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    int-to-long v3, v3

    int-to-long v5, v7

    const-wide/16 v12, 0x1000

    add-long/2addr v12, v5

    invoke-static {v3, v4, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v12, v3

    .line 431
    iget-object v8, v0, Ll/ۚ᩶᩸;->᩸:Ljava/lang/CharSequence;

    .line 448
    invoke-static/range {p7 .. p7}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 449
    invoke-virtual {v2}, Ll/ۙܿ᩸;->length()I

    move-result v3

    int-to-long v3, v3

    int-to-long v13, v12

    add-long/2addr v3, v13

    sub-long/2addr v3, v5

    const-wide/32 v5, 0x7fffffff

    cmp-long v13, v3, v5

    if-gtz v13, :cond_0

    .line 450
    invoke-virtual {v2}, Ll/ۙܿ᩸;->length()I

    move-result v4

    invoke-virtual {v2}, Ll/ۙܿ᩸;->length()I

    move-result v5

    move-object v3, v2

    move-object v6, v8

    move v8, v12

    invoke-virtual/range {v3 .. v8}, Ll/ۗۤᩴ;->᩷(IILjava/lang/CharSequence;II)V

    .line 452
    invoke-virtual {v11}, Ll/ܽۢ᩸;->ܶ()V

    move v7, v12

    goto :goto_0

    .line 449
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Reloaded text exceeds coordinate limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 434
    :cond_1
    invoke-virtual {v11}, Ll/ܽۢ᩸;->ܰ()V

    .line 233
    invoke-virtual {v2, v10, v10}, Ll/ۙܿ᩸;->setSelection(II)V

    .line 434
    invoke-virtual {v2, v10}, Ll/ۗۤᩴ;->᩷(Z)V

    .line 435
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v2

    const-string v1, "changed"

    .line 436
    invoke-virtual {v2, v1, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "error"

    invoke-virtual {v2, v1, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "e2SourcePending"

    .line 437
    invoke-virtual {v2, v1, v10}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    if-nez p2, :cond_2

    .line 438
    move-object/from16 v1, p1

    check-cast v1, Ll/ۡܰ᩸;

    .line 73
    iget-object v1, v1, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v3

    const-string v1, "fileTime"

    .line 438
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "checkFileExists"

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 440
    :cond_2
    invoke-virtual {v11}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1

    .line 441
    :try_start_0
    iget-object v3, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v12, v3, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v15, v0, Ll/ۚ᩶᩸;->ۤ:Ll/᩸᩶᩸;

    iget-object v3, v0, Ll/ۚ᩶᩸;->ۙ:Ljava/lang/String;

    const/16 v19, 0x1

    move-object v13, v1

    move-object v14, v2

    move-object/from16 v16, v3

    move/from16 v17, p4

    move/from16 v18, p5

    invoke-virtual/range {v12 .. v19}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;IIZ)Ll/ۤۗ᩸;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    .line 443
    iget-object v3, v0, Ll/ۚ᩶᩸;->ۤ:Ll/᩸᩶᩸;

    const/high16 v6, 0x800000

    move-object/from16 v1, p0

    move-object/from16 v5, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 440
    :try_start_1
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2
.end method

.method public static ۙ(Ll/۟֡֫;)V
    .locals 1

    .line 490
    invoke-interface {p0}, Ll/۟֡֫;->۫()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Fragment recovery is canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/ܶ᩵᩸;Ll/᩹ܽ᩵;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 579
    invoke-static {p2, p3}, Ll/ܶ᩵᩸;->᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p2

    move-object v0, p0

    .line 352
    monitor-enter v0

    :try_start_0
    iget-object p3, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_0

    .line 353
    invoke-virtual {p3}, Ll/ᩴۗ᩸;->close()V

    .line 581
    :cond_0
    invoke-direct {p0, p2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/Throwable;)V

    if-nez p2, :cond_1

    .line 596
    invoke-virtual {p1, v1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 597
    :cond_1
    instance-of p0, p2, Ll/ۗܽ᩵;

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    :cond_2
    invoke-virtual {p1, p2}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 352
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/᩺۬᩹;Ll/ۛ᩹᩸;Ll/ᩳ᩵᩸;)V
    .locals 12

    .line 495
    iget-object v2, p2, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    iget-object v3, p2, Ll/ᩳ᩵᩸;->ۤ:Ll/ۖۢ᩸;

    iget-object v4, p2, Ll/ᩳ᩵᩸;->᩷:Ljava/util/concurrent/Executor;

    new-instance v6, Ll/۠ܶ᩸;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const/high16 v5, 0x800000

    move-object v1, p0

    .line 106
    invoke-static/range {v1 .. v7}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;Ljava/util/concurrent/Executor;ILl/۟֡֫;Ljava/lang/String;)Ll/ܶ᩵᩸;

    move-result-object v9

    const/high16 v6, 0x800000

    iget-object v10, v9, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    const/4 v11, 0x0

    .line 498
    :try_start_0
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v2

    .line 499
    invoke-virtual {p1, v2}, Ll/ۛ᩹᩸;->ۙ(Landroid/os/Bundle;)V

    .line 501
    invoke-virtual {v10}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 502
    :try_start_1
    iget-object v3, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v4, v3, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v3, v3, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    invoke-virtual {v4, v1, v2, v3}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;)Ll/ۤۗ᩸;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 503
    :try_start_2
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    .line 504
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v3, v1, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    new-instance v7, Ll/۠ܶ᩸;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    move-object v1, v9

    move-object v5, p2

    .line 317
    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    .line 505
    invoke-virtual {v10}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ll/ܶ᩵᩸;->ۙ(J)Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 508
    invoke-virtual {v9}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 501
    :try_start_3
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_4
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    :goto_1
    move-object v11, v0

    .line 506
    :try_start_5
    throw v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 508
    :goto_2
    :try_start_6
    invoke-virtual {v9}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    :goto_3
    if-nez v11, :cond_0

    .line 509
    throw v0

    :cond_0
    invoke-virtual {v11, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 510
    :goto_4
    throw v1
.end method

.method public static synthetic ۤ(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 544
    invoke-static {p0, p1}, Ll/ܶ᩵᩸;->᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۤ(Ll/ܶ᩵᩸;)V
    .locals 1

    const-string v0, "collecting_checkpoints"

    .line 534
    iput-object v0, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    .line 535
    iget-object p0, p0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {p0}, Ll/ۚ᩹᩸;->᩷()V

    return-void
.end method

.method public static ᩷(Ll/᩺۬᩹;Ll/ᩳ᩵᩸;)Landroid/os/Bundle;
    .locals 15

    move-object/from16 v0, p1

    .line 460
    iget-object v2, v0, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    iget-object v3, v0, Ll/ᩳ᩵᩸;->ۤ:Ll/ۖۢ᩸;

    iget-object v4, v0, Ll/ᩳ᩵᩸;->᩷:Ljava/util/concurrent/Executor;

    new-instance v6, Ll/۠ܶ᩸;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const/high16 v5, 0x800000

    move-object v1, p0

    .line 106
    invoke-static/range {v1 .. v7}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;Ljava/util/concurrent/Executor;ILl/۟֡֫;Ljava/lang/String;)Ll/ܶ᩵᩸;

    move-result-object v9

    .line 463
    :try_start_0
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "filePath"

    .line 464
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "untitled"

    .line 465
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 466
    new-instance v10, Ll/ۡܰ᩸;

    const/4 v11, 0x0

    new-array v3, v11, [Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v12

    invoke-direct {v10, v12}, Ll/ۡܰ᩸;-><init>(Ll/᩷ۨᩴ;)V

    const-string v2, "forceTryAXml"

    .line 467
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    const/4 v13, 0x1

    if-nez v2, :cond_1

    const-string v2, "forceTryClass"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    const/4 v4, 0x1

    :goto_1
    new-instance v7, Ll/۠ܶ᩸;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    const/4 v5, -0x1

    move-object v1, v9

    move-object v2, p0

    move-object v3, v10

    move-object/from16 v6, p1

    .line 236
    invoke-virtual/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/ۖܰ᩸;ZILl/ᩳ᩵᩸;Ll/۟֡֫;Z)Ll/ܶ᩵᩸;

    move-result-object v9

    iget-object v14, v9, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    .line 469
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-virtual {v14}, Ll/ܽۢ᩸;->֡()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۨۤᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 470
    invoke-virtual {v14}, Ll/ܽۢ᩸;->֡()Ll/᩶۟᩸;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    if-eqz v1, :cond_2

    .line 471
    invoke-static {v9, v7, v1}, Ll/ܺ᩶᩸;->ۙ(Ll/ܶ᩵᩸;Ljava/lang/String;Ll/᩸᩶᩸;)Ll/ܺ᩶᩸;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 472
    :try_start_1
    invoke-virtual {v1, v10}, Ll/ܺ᩶᩸;->ۙ(Ll/ۖܰ᩸;)V

    invoke-virtual {v1}, Ll/ܺ᩶᩸;->ۙ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 473
    :try_start_2
    invoke-virtual {v1}, Ll/ܺ᩶᩸;->close()V

    .line 474
    iget-object v1, v9, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v1, v11}, Ll/ۗۤᩴ;->᩷(Z)V

    .line 475
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v10

    const-string v1, "changed"

    .line 476
    invoke-virtual {v10, v1, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "error"

    invoke-virtual {v10, v1, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "fileTime"

    .line 73
    invoke-virtual {v12}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v2

    .line 477
    invoke-virtual {v10, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "checkFileExists"

    invoke-virtual {v10, v1, v13}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 479
    invoke-virtual {v14}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 480
    :try_start_3
    iget-object v2, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v3, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v6, v2, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    const/4 v8, 0x1

    move-object v4, v1

    move-object v5, v10

    invoke-virtual/range {v3 .. v8}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Z)Ll/ۤۗ᩸;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 481
    :try_start_4
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    .line 482
    iget-object v1, v9, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v3, v1, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    new-instance v7, Ll/۠ܶ᩸;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    const/high16 v6, 0x800000

    move-object v1, v9

    move-object v2, v10

    move-object/from16 v5, p1

    .line 317
    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    .line 483
    invoke-virtual {v14}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ll/ܶ᩵᩸;->ۙ(J)Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    return-object v10

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 479
    :try_start_5
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_6
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 471
    :try_start_7
    invoke-virtual {v1}, Ll/ܺ᩶᩸;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2

    .line 470
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Session text is not ready for saving"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 465
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Untitled session requires an output path"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :catchall_4
    move-exception v0

    .line 486
    invoke-virtual {v9}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    throw v0
.end method

.method public static synthetic ᩷(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    .line 577
    invoke-static {p0, p1}, Ll/ܶ᩵᩸;->᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩷(Ll/ܶ᩵᩸;)Ll/᩹ܽ᩵;
    .locals 0

    .line 577
    iget-object p0, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {p0}, Ll/ܽۢ᩸;->ۙ()Ll/᩹ܽ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩷(Ll/ܶ᩵᩸;Ljava/lang/Throwable;)Ll/᩹ܽ᩵;
    .locals 2

    const-string v0, "waiting_document_reads"

    .line 539
    iput-object v0, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    .line 540
    iget-object v0, p0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/۬ܶ᩸;->ܳ()Ll/᩹ܽ᩵;

    move-result-object v0

    :goto_0
    new-instance v1, Ll/᩷᩵᩸;

    invoke-direct {v1, p0}, Ll/᩷᩵᩸;-><init>(Ljava/lang/Object;)V

    .line 541
    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p0

    new-instance v0, Ll/ۤ᩵᩸;

    invoke-direct {v0, p1}, Ll/ۤ᩵᩸;-><init>(Ljava/lang/Throwable;)V

    .line 544
    invoke-virtual {p0, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/ۧܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ᩷(Ll/ܶ᩵᩸;Ll/᩹ܽ᩵;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 547
    invoke-static {p2, p3}, Ll/ܶ᩵᩸;->᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p2

    const-string p3, "releasing_prepared_state"

    .line 548
    iput-object p3, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    move-object v0, p0

    .line 352
    monitor-enter v0

    :try_start_0
    iget-object p3, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    const/4 v1, 0x0

    iput-object v1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p3, :cond_0

    .line 353
    invoke-virtual {p3}, Ll/ᩴۗ᩸;->close()V

    :cond_0
    if-nez p2, :cond_1

    const-string p3, "closed"

    goto :goto_0

    :cond_1
    const-string p3, "close_failed"

    .line 550
    :goto_0
    iput-object p3, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    .line 551
    invoke-direct {p0, p2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/Throwable;)V

    if-nez p2, :cond_2

    .line 596
    invoke-virtual {p1, v1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 597
    :cond_2
    instance-of p0, p2, Ll/ۗܽ᩵;

    if-eqz p0, :cond_3

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    :cond_3
    invoke-virtual {p1, p2}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 352
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ᩸(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    if-eq p0, p1, :cond_1

    .line 589
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 6

    .line 74
    iget-object v0, p0, Ll/ܶ᩵᩸;->ۤ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۜ᩸;

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "owner="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nreleaseStage="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    invoke-static {v0}, Ll/۠᩹᩸;->ۙ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    const-string v3, ""

    goto :goto_1

    .line 77
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "viewOwnsText="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v4

    iget-object v5, p0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_2

    const-string v0, "view=unavailable\n"

    goto :goto_2

    .line 78
    :cond_2
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۢ()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/᩺۬᩹;Ll/ۖܰ᩸;ZILl/ᩳ᩵᩸;Ll/۟֡֫;Z)Ll/ܶ᩵᩸;
    .locals 21

    move-object/from16 v10, p0

    move-object/from16 v0, p2

    move/from16 v4, p4

    move-object/from16 v9, p6

    .line 242
    iget-object v1, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v8

    const-string v1, "e2SourcePending"

    .line 243
    invoke-virtual {v8, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v19

    .line 244
    iget-object v7, v10, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    if-nez v19, :cond_0

    invoke-virtual {v7}, Ll/ܽۢ᩸;->֡()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_e

    :cond_0
    if-eqz v19, :cond_4

    const-string v2, "detecting_source_format"

    .line 246
    invoke-virtual {v10, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    move/from16 v2, p3

    .line 247
    invoke-static {v0, v2, v4, v9}, Ll/᩻᩶᩸;->ۙ(Ll/ۖܰ᩸;ZILl/۟֡֫;)Ll/ۚ᩶᩸;

    move-result-object v5

    .line 248
    invoke-static/range {p6 .. p6}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    if-eqz v5, :cond_1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object v4, v5

    move v5, v6

    move v6, v7

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    .line 250
    invoke-direct/range {v1 .. v9}, Ll/ܶ᩵᩸;->ۙ(Ll/ۖܰ᩸;ZLl/ۚ᩶᩸;IILl/ᩳ᩵᩸;Ll/۟֡֫;Z)V

    return-object v10

    :cond_1
    const-string v2, "textPageSize"

    .line 252
    invoke-virtual {v8, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_3

    iget-object v2, v10, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const-string v2, "opening_source"

    .line 255
    invoke-virtual {v10, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 256
    new-instance v2, Ll/ۜ᩹᩸;

    invoke-direct {v2, v0}, Ll/ۜ᩹᩸;-><init>(Ll/ۖܰ᩸;)V

    move-object/from16 v6, p5

    iget-object v3, v6, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    invoke-static {v7, v2, v3, v4, v9}, Ll/᩷᩶᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩹ۢ᩸;Ll/֡ۢ᩸;ILl/۟֡֫;)Ll/᩷᩶᩸;

    move-result-object v2

    iput-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    goto :goto_2

    :cond_3
    :goto_0
    move-object/from16 v6, p5

    const-wide/16 v7, -0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 262
    invoke-static/range {v1 .. v8}, Ll/۬ܶ᩸;->ۙ(Ll/ܶ᩵᩸;Ll/᩺۬᩹;Ll/ۖܰ᩸;ILl/ᩳ᩵᩸;Ll/۟֡֫;J)Ll/ܶ᩵᩸;

    move-result-object v0

    return-object v0

    :cond_4
    move-object/from16 v6, p5

    const-string v2, "resuming_source"

    .line 258
    invoke-virtual {v10, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 259
    new-instance v2, Ll/ۜ᩹᩸;

    invoke-direct {v2, v0}, Ll/ۜ᩹᩸;-><init>(Ll/ۖܰ᩸;)V

    .line 68
    instance-of v3, v9, Ll/ܺۗ᩸;

    if-nez v3, :cond_5

    goto :goto_1

    .line 69
    :cond_5
    new-instance v3, Ll/֫ۗ᩸;

    invoke-direct {v3, v2, v9}, Ll/֫ۗ᩸;-><init>(Ll/᩹ۢ᩸;Ll/۟֡֫;)V

    move-object v2, v3

    .line 259
    :goto_1
    iget-object v3, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v3, v3, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    iget v3, v3, Ll/᩸᩶᩸;->ۤ:I

    invoke-static {v7, v2, v3}, Ll/᩷᩶᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩹ۢ᩸;I)Ll/᩷᩶᩸;

    move-result-object v2

    iput-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    :goto_2
    const-string v2, "reading_source_prefix"

    .line 261
    invoke-virtual {v10, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 262
    iget-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v2}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ۧ()Ljava/lang/String;

    move-result-object v5

    if-eqz v19, :cond_6

    move-object v4, v5

    goto :goto_3

    .line 263
    :cond_6
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v2, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-virtual {v2, v5}, Ll/ۨۤᩴ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v4, v2

    .line 264
    :goto_3
    iget-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v2}, Ll/᩷᩶᩸;->ۤ()Ll/᩺ᩳ᩸;

    move-result-object v2

    .line 265
    :try_start_0
    invoke-static/range {p6 .. p6}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 266
    iget-object v3, v10, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    if-eqz v2, :cond_7

    :try_start_1
    invoke-virtual {v3}, Ll/ۙܿ᩸;->ܳ()Ll/ܿ۟᩸;

    move-result-object v11

    .line 210
    invoke-static {v11}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v11, v2}, Ll/ܿ۟᩸;->ۙ(Ll/᩺ᩳ᩸;)Ll/᩶۟᩸;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    :cond_7
    if-eqz v2, :cond_8

    .line 267
    invoke-virtual {v2}, Ll/᩺ᩳ᩸;->close()V

    .line 268
    :cond_8
    iget-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v2}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v2}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ܺ()Ll/ܰ۟᩸;

    move-result-object v2

    sget-object v11, Ll/ܰ۟᩸;->ᩳ:Ll/ܰ۟᩸;

    if-ne v2, v11, :cond_9

    goto :goto_4

    .line 269
    :cond_9
    new-instance v0, Ljava/io/IOException;

    iget-object v1, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v1}, Ll/᩷᩶᩸;->ۙ()Ljava/lang/Throwable;

    move-result-object v1

    const-string v2, "Cannot prepare source text"

    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_a
    :goto_4
    if-eqz v19, :cond_b

    .line 270
    iget-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v2}, Ll/᩷᩶᩸;->᩷()Ll/᩸᩶᩸;

    move-result-object v2

    goto :goto_5

    :cond_b
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    :goto_5
    move-object/from16 v20, v2

    const/4 v2, 0x0

    if-eqz v19, :cond_c

    .line 233
    invoke-virtual {v3, v2, v2}, Ll/ۙܿ᩸;->setSelection(II)V

    .line 271
    invoke-virtual {v3, v2}, Ll/ۗۤᩴ;->᩷(Z)V

    .line 272
    :cond_c
    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "changed"

    .line 273
    invoke-virtual {v3}, Ll/ۗۤᩴ;->isChanged()Z

    move-result v11

    invoke-virtual {v8, v1, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "error"

    invoke-virtual {v8, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v1, 0x1

    if-eqz v19, :cond_d

    .line 274
    check-cast v0, Ll/ۡܰ᩸;

    .line 73
    iget-object v0, v0, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v11

    const-string v0, "fileTime"

    .line 274
    invoke-virtual {v8, v0, v11, v12}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "checkFileExists"

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_d
    if-nez v19, :cond_f

    .line 275
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_6

    :cond_e
    move-object v0, v4

    goto :goto_7

    :cond_f
    :goto_6
    iget-object v0, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v0}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶۟᩸;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 277
    :goto_7
    invoke-virtual {v7}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1

    if-eqz v19, :cond_10

    .line 278
    :try_start_2
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v11, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    .line 279
    invoke-virtual {v2}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v18

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v12, v1

    move-object v13, v8

    move-object/from16 v14, v20

    move-object v15, v0

    .line 278
    invoke-virtual/range {v11 .. v18}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;IIZ)Ll/ۤۗ᩸;

    move-result-object v0

    move-object v12, v3

    move-object v13, v4

    move-object v14, v5

    move-object v4, v0

    move-object v0, v7

    goto :goto_8

    .line 280
    :cond_10
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v11, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v11}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v11

    invoke-virtual {v11}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v11

    move-object v12, v3

    move-object v3, v1

    move-object v13, v4

    move-object v4, v8

    move-object v14, v5

    move-object/from16 v5, v20

    move-object v6, v0

    move-object v0, v7

    move v7, v11

    invoke-virtual/range {v2 .. v7}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Z)Ll/ۤۗ᩸;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    move-object v4, v2

    .line 281
    :goto_8
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    if-eqz p7, :cond_11

    .line 283
    iget-object v1, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    invoke-virtual {v1}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v1

    if-eqz v1, :cond_11

    const/4 v1, 0x1

    const/4 v11, 0x1

    goto :goto_9

    :cond_11
    const/4 v1, 0x0

    const/4 v11, 0x0

    :goto_9
    const/high16 v6, 0x800000

    move-object/from16 v1, p0

    move-object v2, v8

    move-object/from16 v3, v20

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move-object v15, v8

    move v8, v11

    .line 284
    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    const-string v1, "reading_source_tail"

    .line 285
    invoke-virtual {v10, v1}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 286
    iget-object v1, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    .line 287
    invoke-virtual {v1}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v2

    .line 288
    :cond_12
    :goto_a
    invoke-virtual {v1}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩶۟᩸;->ܺ()Ll/ܰ۟᩸;

    move-result-object v3

    sget-object v4, Ll/ܰ۟᩸;->ᩳ:Ll/ܰ۟᩸;

    if-ne v3, v4, :cond_15

    .line 289
    invoke-static/range {p6 .. p6}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 290
    invoke-virtual {v1}, Ll/᩷᩶᩸;->ۤ()Ll/᩺ᩳ᩸;

    move-result-object v3

    .line 291
    :try_start_3
    invoke-static/range {p6 .. p6}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    if-eqz v3, :cond_13

    .line 292
    invoke-virtual {v12}, Ll/ۙܿ᩸;->ܳ()Ll/ܿ۟᩸;

    move-result-object v4

    .line 210
    invoke-static {v4}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v4, v3}, Ll/ܿ۟᩸;->ۙ(Ll/᩺ᩳ᩸;)Ll/᩶۟᩸;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_13
    if-eqz v3, :cond_12

    .line 293
    invoke-virtual {v3}, Ll/᩺ᩳ᩸;->close()V

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v3, :cond_14

    .line 290
    :try_start_4
    invoke-virtual {v3}, Ll/᩺ᩳ᩸;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_14
    :goto_b
    throw v1

    .line 295
    :cond_15
    invoke-static/range {p6 .. p6}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 296
    invoke-virtual {v1}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩶۟᩸;->ᩴ()Z

    move-result v3

    if-eqz v3, :cond_19

    if-nez v19, :cond_17

    .line 298
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_c

    :cond_16
    move-object v6, v13

    goto :goto_d

    :cond_17
    :goto_c
    invoke-virtual {v1}, Ll/᩷᩶᩸;->ܳ()Ll/᩶۟᩸;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩶۟᩸;->ۧ()Ljava/lang/String;

    move-result-object v3

    move-object v6, v3

    .line 299
    :goto_d
    invoke-virtual {v1}, Ll/᩷᩶᩸;->close()V

    const/4 v1, 0x0

    .line 300
    iput-object v1, v10, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    if-eqz v2, :cond_18

    :goto_e
    return-object v10

    .line 304
    :cond_18
    invoke-virtual {v0}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1

    .line 305
    :try_start_5
    iget-object v0, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v0, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    const/4 v7, 0x1

    move-object v3, v1

    move-object v4, v15

    move-object/from16 v5, v20

    invoke-virtual/range {v2 .. v7}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Z)Ll/ۤۗ᩸;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 306
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    const/high16 v6, 0x800000

    move-object/from16 v1, p0

    move-object v2, v15

    move-object/from16 v3, v20

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    .line 307
    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    return-object v10

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 304
    :try_start_6
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_f

    :catchall_3
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v2

    .line 296
    :cond_19
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Cannot display incomplete source text"

    invoke-virtual {v1}, Ll/᩷᩶᩸;->ۙ()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catchall_4
    move-exception v0

    move-object v2, v0

    .line 277
    :try_start_7
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_10

    :catchall_5
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_10
    throw v2

    :catchall_6
    move-exception v0

    move-object v1, v0

    if-eqz v2, :cond_1a

    .line 264
    :try_start_8
    invoke-virtual {v2}, Ll/᩺ᩳ᩸;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_11

    :catchall_7
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1a
    :goto_11
    throw v1
.end method

.method public final ۙ(Ll/᩺۬᩹;Ll/ۡܰ᩸;ZZIIILl/ᩳ᩵᩸;Ll/۟֡֫;Z)Ll/ܶ᩵᩸;
    .locals 18

    move-object/from16 v10, p0

    .line 392
    iget-object v0, v10, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    const/4 v1, 0x0

    if-eqz p10, :cond_1

    .line 393
    invoke-virtual {v0}, Ll/ܽۢ᩸;->ۜ()Ll/᩶ᩳ᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩶ᩳ᩸;->᩷()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v2, v2

    .line 394
    iget-object v4, v10, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    .line 395
    :goto_0
    iget v5, v10, Ll/ܶ᩵᩸;->᩻:I

    if-ge v4, v5, :cond_0

    .line 396
    invoke-static/range {p9 .. p9}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    .line 397
    iget-object v5, v10, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    move-object/from16 v7, p8

    invoke-virtual {v5, v4, v7}, Ll/۬ܶ᩸;->ۙ(ILl/ᩳ᩵᩸;)Ll/ܳܿ᩸;

    move-result-object v5

    :try_start_0
    invoke-virtual {v5}, Ll/ܳܿ᩸;->length()I

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v8, v6

    add-long/2addr v2, v8

    invoke-virtual {v5}, Ll/ܳܿ᩸;->close()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    :try_start_1
    invoke-virtual {v5}, Ll/ܳܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    :cond_0
    move-object/from16 v7, p8

    goto :goto_2

    :cond_1
    move-object/from16 v7, p8

    const-wide/16 v2, -0x1

    :goto_2
    move-wide v8, v2

    const-string v2, "detecting_source_format"

    .line 401
    invoke-virtual {v10, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    if-eqz p3, :cond_2

    .line 402
    invoke-static {}, Ll/᩻᩶᩸;->ۙ()Ll/ۚ᩶᩸;

    move-result-object v2

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v11, p9

    goto :goto_3

    :cond_2
    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v11, p9

    invoke-static {v3, v4, v5, v11}, Ll/᩻᩶᩸;->ۙ(Ll/ۖܰ᩸;ZILl/۟֡֫;)Ll/ۚ᩶᩸;

    move-result-object v2

    :goto_3
    move-object v6, v2

    .line 403
    invoke-static/range {p9 .. p9}, Ll/ܶ᩵᩸;->ۙ(Ll/۟֡֫;)V

    if-nez v6, :cond_4

    .line 404
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-nez v2, :cond_3

    iget-object v2, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v2, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v2}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v2

    const-string v12, "textPageSize"

    invoke-virtual {v2, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    if-lez v2, :cond_4

    :cond_3
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p5

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-wide v7, v8

    .line 405
    invoke-static/range {v1 .. v8}, Ll/۬ܶ᩸;->ۙ(Ll/ܶ᩵᩸;Ll/᩺۬᩹;Ll/ۖܰ᩸;ILl/ᩳ᩵᩸;Ll/۟֡֫;J)Ll/ܶ᩵᩸;

    move-result-object v0

    return-object v0

    .line 407
    :cond_4
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-eqz v2, :cond_5

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v6

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-wide v7, v8

    .line 408
    invoke-static/range {v1 .. v8}, Ll/۬ܶ᩸;->ۙ(Ll/ܶ᩵᩸;Ll/ۡܰ᩸;ZLl/ۚ᩶᩸;Ll/ᩳ᩵᩸;Ll/۟֡֫;J)Ll/ܶ᩵᩸;

    move-result-object v0

    return-object v0

    :cond_5
    const/4 v8, 0x1

    if-nez v6, :cond_7

    .line 411
    iget-object v2, v10, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v2}, Ll/ۙܿ᩸;->length()I

    move-result v6

    const-string v9, ""

    invoke-virtual {v2, v1, v6, v9}, Ll/ۙܿ᩸;->replace(IILjava/lang/CharSequence;)Ll/ۙܿ᩸;

    invoke-virtual {v0}, Ll/ܽۢ᩸;->ܰ()V

    .line 233
    invoke-virtual {v2, v1, v1}, Ll/ۙܿ᩸;->setSelection(II)V

    .line 411
    invoke-virtual {v2, v1}, Ll/ۗۤᩴ;->᩷(Z)V

    .line 412
    iget-object v1, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v1, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v1, v1, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v1}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v14

    const-string v1, "e2SourcePending"

    const/4 v2, 0x1

    invoke-virtual {v14, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 413
    invoke-virtual {v0}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1

    .line 414
    :try_start_2
    iget-object v2, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v12, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v12, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    const-string v6, "\n"

    move/from16 v9, p6

    move/from16 v13, p7

    .line 415
    invoke-virtual {v2, v9, v13, v6}, Ll/ۨۤᩴ;->ۙ(IILjava/lang/String;)Ll/ۨۤᩴ;

    move-result-object v16

    const/high16 v17, 0x800000

    const/4 v15, 0x0

    move-object v13, v1

    .line 414
    invoke-virtual/range {v12 .. v17}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;I)Ll/۫ۗ᩸;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const/4 v6, 0x0

    .line 416
    :try_start_3
    invoke-virtual {v2, v0, v6}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩸᩶᩸;)Ll/ᩴۗ᩸;

    move-result-object v0

    .line 345
    iget-object v6, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    .line 346
    iput-object v0, v10, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    if-eqz v6, :cond_6

    .line 347
    invoke-virtual {v6}, Ll/ᩴۗ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 417
    :cond_6
    :try_start_4
    invoke-virtual {v2}, Ll/۫ۗ᩸;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    .line 418
    invoke-virtual/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/ۖܰ᩸;ZILl/ᩳ᩵᩸;Ll/۟֡֫;Z)Ll/ܶ᩵᩸;

    move-result-object v0

    return-object v0

    :catchall_2
    move-exception v0

    move-object v3, v0

    .line 413
    :try_start_5
    invoke-virtual {v2}, Ll/۫ۗ᩸;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_7
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2

    :cond_7
    move/from16 v9, p6

    move/from16 v13, p7

    const/4 v0, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object v4, v6

    move/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move v9, v0

    .line 420
    invoke-direct/range {v1 .. v9}, Ll/ܶ᩵᩸;->ۙ(Ll/ۖܰ᩸;ZLl/ۚ᩶᩸;IILl/ᩳ᩵᩸;Ll/۟֡֫;Z)V

    return-object v10
.end method

.method public final ۙ(J)Ll/᩹ܽ᩵;
    .locals 5

    move-object v0, p0

    .line 519
    monitor-enter v0

    .line 520
    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->ᩴ:Ll/᩹ܽ᩵;

    if-eqz v1, :cond_0

    .line 593
    new-instance p1, Ll/ۖܶ᩸;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v1, p1}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p1

    .line 520
    monitor-exit v0

    return-object p1

    .line 521
    :cond_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->ۙ:Ll/᩹ܽ᩵;

    if-eqz v1, :cond_1

    .line 593
    new-instance p1, Ll/ۖܶ᩸;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v1, p1}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p1

    .line 521
    monitor-exit v0

    return-object p1

    .line 522
    :cond_1
    iget-object v1, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 523
    :try_start_1
    iget-object v2, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {v2}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-nez v4, :cond_2

    iget-object v2, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {v2}, Ll/ܽۢ᩸;->ۘ()J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-ltz v4, :cond_2

    .line 526
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 527
    :try_start_2
    iget-object p1, p0, Ll/ܶ᩵᩸;->᩷:Ll/֫ۤᩴ;

    invoke-virtual {p1}, Ll/֫ۤᩴ;->close()V

    .line 528
    iget-object p1, p0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {p1}, Ll/ۗۤᩴ;->close()V

    .line 529
    new-instance p1, Ll/᩹ܽ᩵;

    invoke-direct {p1}, Ll/᩹ܽ᩵;-><init>()V

    iput-object p1, p0, Ll/ܶ᩵᩸;->ۙ:Ll/᩹ܽ᩵;

    .line 530
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string p2, "draining_checkpoint_queue"

    .line 532
    iput-object p2, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    .line 533
    iget-object p2, p0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {p2}, Ll/ۚ᩹᩸;->ۙ()Ll/᩹ܽ᩵;

    move-result-object p2

    new-instance v0, Ll/۫᩵᩸;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/۫᩵᩸;-><init>(Ll/ۖ᩹᩸;I)V

    sget-object v1, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {p2, v0, v1}, Ll/᩹ܽ᩵;->᩷(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/᩹ܽ᩵;

    move-result-object p2

    new-instance v0, Ll/᩷ۖ᩹;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 537
    invoke-virtual {p2, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/ۧܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p2

    new-instance v0, Ll/ۚ᩵᩸;

    invoke-direct {v0, p0}, Ll/ۚ᩵᩸;-><init>(Ll/ۖ᩹᩸;)V

    .line 538
    invoke-virtual {p2, v0}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p2

    new-instance v0, Ll/֫᩵᩸;

    invoke-direct {v0, p0, p1}, Ll/֫᩵᩸;-><init>(Ll/ܶ᩵᩸;Ll/᩹ܽ᩵;)V

    .line 546
    invoke-virtual {p2, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    .line 593
    new-instance p2, Ll/ۖܶ᩸;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {p1, p2}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object p1

    return-object p1

    .line 524
    :cond_2
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Fragment final checkpoint is not current and durable"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 526
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 530
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final ۙ(I)V
    .locals 7

    .line 216
    iget-object v0, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v0, v0, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v0, v0, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v0}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v3

    const-string v0, "textPageSize"

    invoke-virtual {v3, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 217
    iget-object p1, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {p1}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v0

    .line 218
    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v4, v1, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    iget-object v5, v2, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    const/high16 v6, 0x800000

    move-object v1, v2

    move-object v2, v0

    invoke-virtual/range {v1 .. v6}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;I)Ll/۫ۗ᩸;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 219
    :try_start_1
    iget-object v2, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    invoke-virtual {v1, p1, v2}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩸᩶᩸;)Ll/ᩴۗ᩸;

    move-result-object p1

    .line 345
    iget-object v2, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    .line 346
    iput-object p1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    if-eqz v2, :cond_0

    .line 347
    invoke-virtual {v2}, Ll/ᩴۗ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 220
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ll/۫ۗ᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v0}, Ll/۠ܿ᩸;->close()V

    return-void

    :catchall_0
    move-exception p1

    .line 217
    :try_start_3
    invoke-virtual {v1}, Ll/۫ۗ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_5
    invoke-virtual {v0}, Ll/۠ܿ᩸;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public final ۙ(IILjava/lang/CharSequence;)V
    .locals 6

    .line 183
    iget-object v0, p0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v0}, Ll/ۙܿ᩸;->length()I

    move-result v1

    invoke-virtual {v0}, Ll/ۙܿ᩸;->length()I

    move-result v2

    move-object v3, p3

    move v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Ll/ۗۤᩴ;->᩷(IILjava/lang/CharSequence;II)V

    .line 184
    iget-object p1, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {p1}, Ll/ܽۢ᩸;->ܶ()V

    return-void
.end method

.method public final ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;Ll/۠ܶ᩸;)V
    .locals 8

    const/high16 v5, 0x800000

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p5

    .line 317
    invoke-direct/range {v0 .. v7}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ܶ᩵᩸;->ۧ:Ll/ۜۗ᩸;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۜۗ᩸;->ۙ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ll/ۖ᩹᩸;)V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ܶ᩵᩸;->᩸:Ll/۠᩹᩸;

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {v0, p1, p2}, Ll/۠᩹᩸;->ۙ(Ljava/lang/String;Ll/ۖ᩹᩸;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/֫᩹᩸;)V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ܶ᩵᩸;->᩸:Ll/۠᩹᩸;

    if-eqz v0, :cond_0

    .line 70
    invoke-virtual {v0, p1}, Ll/۠᩹᩸;->ۙ(Ll/֫᩹᩸;)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized ۙ(Ll/۠᩹᩸;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 83
    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->᩸:Ll/۠᩹᩸;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܶ᩵᩸;->ۙ:Ll/᩹ܽ᩵;

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܶ᩵᩸;->ᩴ:Ll/᩹ܽ᩵;

    if-nez v1, :cond_0

    .line 84
    iput-object p1, p0, Ll/ܶ᩵᩸;->᩸:Ll/۠᩹᩸;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    monitor-exit v0

    return-void

    .line 83
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Session directory lease is already owned"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/ۨۤᩴ;[B[BLl/ᩳ᩵᩸;I)V
    .locals 9

    .line 226
    iget-object v0, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v0, v0, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v0, v0, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v0}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v0

    .line 227
    iget-object v1, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {v1}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v8

    .line 228
    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v1, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v3, v1, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    .line 302
    iget-object v1, v2, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-virtual {v1, p1}, Ll/ۨۤᩴ;->ۙ(Ll/ۨۤᩴ;)Ll/ۨۤᩴ;

    move-result-object v4

    move-object v1, v8

    move-object v2, v0

    move-object v5, p2

    move-object v6, p3

    move v7, p5

    invoke-static/range {v1 .. v7}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[B[BI)Ll/ۤۗ᩸;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    invoke-virtual {v8}, Ll/۠ܿ᩸;->close()V

    .line 230
    iget-object p1, p0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v3, p1, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    new-instance v7, Ll/۠ܶ᩸;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v5, p4

    move v6, p5

    .line 317
    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    return-void

    :catchall_0
    move-exception p1

    .line 227
    :try_start_1
    invoke-virtual {v8}, Ll/۠ܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۙ(Ll/۫ۗ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Ll/ᩳ᩵᩸;Ll/۟֡֫;I)V
    .locals 18

    move-object/from16 v9, p0

    .line 194
    iget-object v0, v9, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {v0}, Ll/ܽۢ᩸;->ܰ()V

    .line 233
    iget-object v1, v9, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    move/from16 v2, p7

    invoke-virtual {v1, v2, v2}, Ll/ۙܿ᩸;->setSelection(II)V

    const/4 v2, 0x0

    .line 194
    invoke-virtual {v1, v2}, Ll/ۗۤᩴ;->᩷(Z)V

    .line 196
    invoke-virtual {v0}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/4 v15, 0x0

    move-object/from16 v10, p1

    move-object v11, v1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    .line 197
    :try_start_0
    invoke-virtual/range {v10 .. v17}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;IIZ)Ll/ۤۗ᩸;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    .line 199
    iget-object v0, v9, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    const/high16 v6, 0x800000

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v7, p6

    .line 317
    invoke-direct/range {v1 .. v8}, Ll/ܶ᩵᩸;->ۙ(Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۤۗ᩸;Ll/ᩳ᩵᩸;ILl/۟֡֫;Z)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 196
    :try_start_1
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
.end method

.method public final ۙ(Ll/۬ܶ᩸;II)V
    .locals 9

    .line 204
    iput-object p1, p0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    iput p2, p0, Ll/ܶ᩵᩸;->᩻:I

    .line 205
    invoke-virtual {p1}, Ll/۬ܶ᩸;->᩷()Landroid/os/Bundle;

    move-result-object v2

    .line 206
    invoke-virtual {p1}, Ll/۬ܶ᩸;->ۤ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v0, v0, Ll/ᩴۗ᩸;->ܰ:Ll/᩸᩶᩸;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll/۬ܶ᩸;->ᩴ()Ll/᩸᩶᩸;

    move-result-object v0

    :goto_0
    move-object v6, v0

    .line 207
    iget-object v7, p0, Ll/ܶ᩵᩸;->᩵:Ll/ܽۢ᩸;

    invoke-virtual {v7}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v8

    .line 208
    :try_start_0
    iget-object v0, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v0, v0, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    .line 209
    invoke-virtual {p1}, Ll/۬ܶ᩸;->᩸()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Ll/۠ܿ᩸;->length()I

    move-result v3

    .line 270
    iget-object v4, v0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-virtual {v4, v1}, Ll/ۨۤᩴ;->᩷(Ljava/lang/String;)Ll/ۨۤᩴ;

    move-result-object v1

    .line 271
    invoke-static {v2, v1, v3}, Ll/ܰ᩹᩸;->ۙ(Landroid/os/Bundle;Ll/ۨۤᩴ;I)Ll/ۨۤᩴ;

    move-result-object v4

    move-object v1, v8

    move-object v3, v6

    move v5, p3

    .line 208
    invoke-virtual/range {v0 .. v5}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;I)Ll/۫ۗ᩸;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 210
    :try_start_1
    invoke-virtual {p3, v7, v6}, Ll/۫ۗ᩸;->ۙ(Ll/ܽۢ᩸;Ll/᩸᩶᩸;)Ll/ᩴۗ᩸;

    move-result-object v0

    .line 345
    iget-object v1, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    .line 346
    iput-object v0, p0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    if-eqz v1, :cond_1

    .line 347
    invoke-virtual {v1}, Ll/ᩴۗ᩸;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    :cond_1
    :try_start_2
    invoke-virtual {p3}, Ll/۫ۗ᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {v8}, Ll/۠ܿ᩸;->close()V

    .line 212
    iget-object p3, p0, Ll/ܶ᩵᩸;->ܽ:Ll/ۚ᩹᩸;

    iput-object p1, p3, Ll/ۚ᩹᩸;->ܳ:Ll/۬ܶ᩸;

    iput p2, p3, Ll/ۚ᩹᩸;->ۧ:I

    return-void

    :catchall_0
    move-exception p1

    .line 207
    :try_start_3
    invoke-virtual {p3}, Ll/۫ۗ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    :try_start_5
    invoke-virtual {v8}, Ll/۠ܿ᩸;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final ۙ(Ll/᩺ۜ᩸;)V
    .locals 1

    .line 56
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ܶ᩵᩸;->ۤ:Ljava/lang/ref/WeakReference;

    const-string p1, "session_owner"

    .line 57
    invoke-virtual {p0, p1, p0}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;Ll/ۖ᩹᩸;)V

    return-void
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ܶ᩵᩸;->ܶ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩴ()Ll/᩹ܽ᩵;
    .locals 2

    .line 312
    iget-object v0, p0, Ll/ܶ᩵᩸;->ۚ:Ll/᩹ܽ᩵;

    new-instance v1, Ll/ۧ᩵᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/᩹ܽ᩵;
    .locals 4

    move-object v0, p0

    .line 563
    monitor-enter v0

    .line 564
    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->ᩴ:Ll/᩹ܽ᩵;

    if-eqz v1, :cond_0

    .line 593
    new-instance v2, Ll/ۖܶ᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v1

    .line 564
    monitor-exit v0

    return-object v1

    .line 565
    :cond_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->ۙ:Ll/᩹ܽ᩵;

    .line 566
    iget-object v2, p0, Ll/ܶ᩵᩸;->᩷:Ll/֫ۤᩴ;

    invoke-virtual {v2}, Ll/֫ۤᩴ;->close()V

    .line 567
    new-instance v2, Ll/᩹ܽ᩵;

    invoke-direct {v2}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v2, p0, Ll/ܶ᩵᩸;->ᩴ:Ll/᩹ܽ᩵;

    .line 568
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    const/4 v0, 0x0

    .line 569
    invoke-static {v0}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ll/᩻᩵᩸;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Ll/᩻᩵᩸;-><init>(I)V

    invoke-virtual {v1, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/ۧܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    .line 571
    :goto_0
    new-instance v1, Ll/۫᩶᩸;

    invoke-direct {v1, p0}, Ll/۫᩶᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ܺ᩵᩸;

    invoke-direct {v1, p0}, Ll/ܺ᩵᩸;-><init>(Ll/ܶ᩵᩸;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/ۧܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ܽ᩵᩸;

    invoke-direct {v1, p0}, Ll/ܽ᩵᩸;-><init>(Ll/ܶ᩵᩸;)V

    .line 575
    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/۬ۗ᩸;

    invoke-direct {v1, p0}, Ll/۬ۗ᩸;-><init>(Ljava/lang/Object;)V

    .line 576
    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    new-instance v1, Ll/ۙ᩵᩸;

    const/4 v3, 0x0

    invoke-direct {v1, v3, p0, v2}, Ll/ۙ᩵᩸;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 578
    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    .line 593
    new-instance v0, Ll/ۖܶ᩸;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v2, v0}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 568
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩸()Ll/᩹ܽ᩵;
    .locals 5

    move-object v0, p0

    .line 358
    monitor-enter v0

    .line 359
    :try_start_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->֫:Ll/᩹ܽ᩵;

    if-eqz v1, :cond_0

    .line 593
    new-instance v2, Ll/ۖܶ᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v1

    .line 359
    monitor-exit v0

    return-object v1

    .line 360
    :cond_0
    iget-object v1, p0, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    .line 361
    invoke-static {v2}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object v1

    monitor-exit v0

    return-object v1

    .line 362
    :cond_1
    new-instance v3, Ll/ۙۛ᩸;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Ll/ۙۛ᩸;-><init>(ILjava/lang/Object;)V

    sget-object v1, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-static {v3, v1}, Ll/᩹ܽ᩵;->ۤ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/᩹ܽ᩵;

    move-result-object v1

    iput-object v1, p0, Ll/ܶ᩵᩸;->֫:Ll/᩹ܽ᩵;

    .line 365
    iput-object v2, p0, Ll/ܶ᩵᩸;->۫:Ll/᩷᩶᩸;

    .line 593
    new-instance v2, Ll/ۖܶ᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v1

    .line 366
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 367
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
