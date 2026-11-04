.class public final Ll/֫ۙܳ;
.super Ljava/lang/Object;
.source "MIRA"


# direct methods
.method public static ۙ(Ljava/io/DataInput;Ll/᩷ۨᩴ;Ll/ܶۤܳ;Ll/ܳ۬ᩴ;Ll/ۖ۬ᩴ;)Ll/ۚۙܳ;
    .locals 8

    .line 110
    invoke-static {p0}, Ll/ۧ۬ᩴ;->ۙ(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "Comparison target mismatch"

    invoke-static {v1, v0}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 111
    invoke-static {p0}, Ll/ۧ۬ᩴ;->ۙ(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v0

    .line 112
    new-instance v1, Ll/ۛᩴܳ;

    move-object v2, p0

    check-cast v2, Ll/ᩴ۬ᩴ;

    invoke-virtual {v2}, Ll/ᩴ۬ᩴ;->readLong()J

    move-result-wide v3

    invoke-virtual {v2}, Ll/ᩴ۬ᩴ;->readLong()J

    move-result-wide v5

    invoke-direct {v1, v3, v4, v5, v6}, Ll/ۛᩴܳ;-><init>(JJ)V

    .line 113
    invoke-virtual {v2}, Ll/ᩴ۬ᩴ;->readBoolean()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 114
    invoke-static {p1, v0, v1}, Ll/֨᩷ܳ;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/String;Ll/ۛᩴܳ;)Ll/֨᩷ܳ;

    move-result-object p1

    goto :goto_0

    .line 115
    :cond_0
    invoke-static {p1, v0, v1}, Ll/֨᩷ܳ;->᩷(Ll/᩷ۨᩴ;Ljava/lang/String;Ll/ۛᩴܳ;)Ll/֨᩷ܳ;

    move-result-object p1

    :goto_0
    if-eqz v3, :cond_1

    .line 119
    invoke-virtual {p1}, Ll/֨᩷ܳ;->᩷()Ll/᩷ۨᩴ;

    move-result-object p4

    const/4 v0, 0x0

    goto :goto_1

    .line 121
    :cond_1
    invoke-static {p0}, Ll/ۧ۬ᩴ;->ۙ(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p4}, Ll/ܶۤܳ;->᩷(Ljava/lang/String;Ll/۟֡֫;)Ll/ܶۤܳ;

    move-result-object v0

    .line 122
    invoke-virtual {v0}, Ll/ܶۤܳ;->᩸()Ll/֨ۨᩴ;

    move-result-object p4

    new-instance v1, Ll/ۛᩴܳ;

    invoke-virtual {v2}, Ll/ᩴ۬ᩴ;->readLong()J

    move-result-wide v4

    invoke-virtual {v2}, Ll/ᩴ۬ᩴ;->readLong()J

    move-result-wide v6

    invoke-direct {v1, v4, v5, v6, v7}, Ll/ۛᩴܳ;-><init>(JJ)V

    .line 124
    :goto_1
    invoke-virtual {p4}, Ll/᩷ۨᩴ;->ܿۙ()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p4}, Ll/᩷ۨᩴ;->ܰۙ()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    const-string v5, "Invalid comparison backing"

    invoke-static {v5, v2}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 125
    invoke-virtual {p4}, Ll/᩷ۨᩴ;->֫()Ll/֨ۨᩴ;

    move-result-object p4

    invoke-static {p4}, Ll/۫۫ܳ;->ۙ(Ll/֨ۨᩴ;)Ll/۫۫ܳ;

    move-result-object p4

    .line 128
    :try_start_0
    invoke-virtual {p4}, Ll/۫۫ܳ;->ۙ()Ll/ۛᩴܳ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۛᩴܳ;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "Comparison backing revision mismatch"

    invoke-static {v2, v1}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 129
    new-instance v1, Ll/ܳۙܳ;

    invoke-direct {v1, p2, p3}, Ll/ܳۙܳ;-><init>(Ll/ܶۤܳ;Ll/ܳ۬ᩴ;)V

    invoke-static {p4, p0, v1}, Ll/ᩳܳܳ;->ۙ(Ll/۫۫ܳ;Ljava/io/DataInput;Ll/ۖᩴܳ;)Ll/ᩳܳܳ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 131
    :try_start_1
    new-instance p2, Ll/ۚۙܳ;

    invoke-direct {p2, p0, p1, v3, v0}, Ll/ۚۙܳ;-><init>(Ll/ᩳܳܳ;Ll/֨᩷ܳ;ZLl/ܶۤܳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p2

    :catchall_0
    move-exception p0

    const/4 v4, 0x1

    goto :goto_3

    :catchall_1
    move-exception p0

    :goto_3
    if-nez v4, :cond_3

    .line 132
    invoke-virtual {p4}, Ll/۫۫ܳ;->close()V

    :cond_3
    throw p0
.end method

.method public static ۙ(Ll/ܶۤܳ;Ll/᩷ۨᩴ;Ll/᩷ۨᩴ;Ll/ۖ۬ᩴ;)Ll/۫ۙܳ;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const/4 v2, 0x0

    .line 78
    :try_start_0
    new-instance v3, Ll/ܳ۬ᩴ;

    invoke-virtual/range {p0 .. p0}, Ll/ܶۤܳ;->֫()Ljava/io/BufferedInputStream;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/ܳ۬ᩴ;-><init>(Ljava/io/BufferedInputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_d

    .line 79
    :try_start_1
    new-instance v4, Ljava/io/DataInputStream;

    invoke-direct {v4, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    .line 80
    :try_start_2
    new-instance v5, Ll/ᩴ۬ᩴ;

    invoke-static/range {p3 .. p3}, Ll/ܿ֡֫;->ۙ(Ll/۟֡֫;)Ll/۟֡֫;

    move-result-object v6

    invoke-direct {v5, v4, v6}, Ll/ᩴ۬ᩴ;-><init>(Ljava/io/DataInputStream;Ll/۟֡֫;)V

    .line 81
    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readInt()I

    move-result v6

    const v7, 0x48435031    # 200000.77f

    if-ne v6, v7, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const-string v7, "Invalid comparison checkpoint"

    invoke-static {v7, v6}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    move-object/from16 v6, p1

    .line 82
    invoke-static {v5, v6, v0, v3, v1}, Ll/֫ۙܳ;->ۙ(Ljava/io/DataInput;Ll/᩷ۨᩴ;Ll/ܶۤܳ;Ll/ܳ۬ᩴ;Ll/ۖ۬ᩴ;)Ll/ۚۙܳ;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_7

    :try_start_3
    iget-object v7, v6, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    move-object/from16 v8, p2

    .line 83
    invoke-static {v5, v8, v0, v3, v1}, Ll/֫ۙܳ;->ۙ(Ljava/io/DataInput;Ll/᩷ۨᩴ;Ll/ܶۤܳ;Ll/ܳ۬ᩴ;Ll/ۖ۬ᩴ;)Ll/ۚۙܳ;

    move-result-object v2

    iget-object v0, v2, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    .line 84
    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readInt()I

    move-result v1

    if-ltz v1, :cond_1

    const v8, 0xf4240

    if-gt v1, v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    const-string v9, "Invalid comparison span count"

    .line 85
    invoke-static {v9, v8}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 86
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-wide v11, v9

    move-wide/from16 v22, v11

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v1, :cond_7

    .line 89
    :try_start_4
    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readUnsignedByte()I

    move-result v14

    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readInt()I

    move-result v13

    move/from16 p0, v1

    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readInt()I

    move-result v1

    move/from16 v16, v15

    const/4 v15, 0x5

    if-gt v14, v15, :cond_4

    if-ltz v13, :cond_4

    if-ltz v1, :cond_4

    if-nez v13, :cond_2

    if-eqz v1, :cond_4

    :cond_2
    if-nez v14, :cond_3

    if-ne v13, v1, :cond_4

    :cond_3
    const/4 v15, 0x1

    goto :goto_3

    :cond_4
    const/4 v15, 0x0

    :goto_3
    move/from16 p1, v14

    const-string v14, "Invalid comparison span"

    .line 90
    invoke-static {v14, v15}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    int-to-long v14, v13

    add-long v24, v14, v9

    .line 92
    invoke-virtual {v7}, Ll/ᩳܳܳ;->length()I

    move-result v14

    int-to-long v14, v14

    cmp-long v17, v24, v14

    if-gtz v17, :cond_5

    int-to-long v14, v1

    add-long/2addr v14, v11

    move/from16 p2, v13

    invoke-virtual {v0}, Ll/ᩳܳܳ;->length()I

    move-result v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 p3, v2

    move-object/from16 v26, v3

    int-to-long v2, v13

    cmp-long v13, v14, v2

    if-gtz v13, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move-object/from16 p3, v2

    move-object/from16 v26, v3

    move/from16 p2, v13

    :cond_6
    const/4 v2, 0x0

    :goto_4
    :try_start_5
    const-string v3, "Comparison coverage overflow"

    invoke-static {v3, v2}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 93
    new-instance v2, Ll/ۡۙܳ;

    long-to-int v15, v9

    long-to-int v3, v11

    move/from16 v9, p2

    move-object v13, v2

    move/from16 v10, p1

    move v14, v10

    move/from16 v27, v16

    move/from16 v16, v3

    move/from16 v17, v9

    move/from16 v18, v1

    move-wide/from16 v19, v22

    move/from16 v21, v10

    .line 35
    invoke-direct/range {v13 .. v21}, Ll/ۡۙܳ;-><init>(IIIIIJI)V

    .line 93
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    int-to-long v2, v1

    add-long/2addr v11, v2

    .line 94
    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    int-to-long v1, v1

    add-long v22, v22, v1

    add-int/lit8 v15, v27, 0x1

    move/from16 v1, p0

    move-object/from16 v2, p3

    move-wide/from16 v9, v24

    move-object/from16 v3, v26

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object/from16 p3, v2

    move-object/from16 v26, v3

    goto :goto_7

    :cond_7
    move-object/from16 p3, v2

    move-object/from16 v26, v3

    .line 96
    :try_start_6
    invoke-virtual {v7}, Ll/ᩳܳܳ;->length()I

    move-result v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    int-to-long v1, v1

    cmp-long v3, v9, v1

    if-nez v3, :cond_8

    :try_start_7
    invoke-virtual {v0}, Ll/ᩳܳܳ;->length()I

    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    int-to-long v1, v1

    cmp-long v3, v11, v1

    if-nez v3, :cond_8

    const/4 v1, 0x1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_8
    const/4 v1, 0x0

    :goto_5
    :try_start_8
    const-string v2, "Incomplete comparison coverage"

    invoke-static {v2, v1}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 97
    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readInt()I

    move-result v1

    const v2, 0x31435048

    if-ne v1, v2, :cond_9

    const/4 v1, 0x1

    goto :goto_6

    :cond_9
    const/4 v1, 0x0

    :goto_6
    const-string v2, "Invalid comparison footer"

    invoke-static {v2, v1}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 98
    invoke-virtual/range {v26 .. v26}, Ll/ܳ۬ᩴ;->ۙ()J

    move-result-wide v1

    invoke-virtual/range {v26 .. v26}, Ll/ܳ۬ᩴ;->᩷()V

    .line 99
    invoke-virtual {v5}, Ll/ᩴ۬ᩴ;->readLong()J

    move-result-wide v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    cmp-long v3, v9, v1

    if-nez v3, :cond_a

    :try_start_9
    invoke-virtual {v4}, Ljava/io/InputStream;->read()I

    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_a

    const/4 v1, 0x1

    goto :goto_8

    :goto_7
    const/4 v1, 0x0

    move-object/from16 v3, p3

    move-object v1, v0

    goto :goto_a

    :cond_a
    const/4 v1, 0x0

    :goto_8
    :try_start_a
    const-string v2, "Invalid comparison checksum"

    invoke-static {v2, v1}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 100
    invoke-virtual {v7}, Ll/ᩳܳܳ;->᩶()V

    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V

    .line 101
    new-instance v0, Ll/۫ۙܳ;

    new-instance v1, Ll/۬ۙܳ;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2, v8}, Ll/ۙ۬ᩴ;->ۙ(IILjava/util/List;)Ll/ۙ۬ᩴ;

    move-result-object v2

    invoke-direct {v1, v2}, Ll/۬ۙܳ;-><init>(Ll/ۙ۬ᩴ;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    move-object/from16 v2, p3

    :try_start_b
    invoke-direct {v0, v6, v2, v1}, Ll/۫ۙܳ;-><init>(Ll/ۚۙܳ;Ll/ۚۙܳ;Ll/۬ۙܳ;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 103
    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :try_start_d
    invoke-virtual/range {v26 .. v26}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    return-object v0

    :catchall_2
    move-exception v0

    const/4 v1, 0x1

    move-object v3, v2

    goto :goto_f

    :catchall_3
    move-exception v0

    const/4 v1, 0x1

    move-object v1, v0

    move-object v3, v2

    const/4 v2, 0x1

    goto :goto_d

    :catchall_4
    move-exception v0

    goto :goto_9

    :catchall_5
    move-exception v0

    move-object/from16 v2, p3

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object/from16 v26, v3

    :goto_9
    const/4 v1, 0x0

    move-object v3, v2

    move v2, v1

    move-object v1, v0

    goto :goto_b

    :catchall_7
    move-exception v0

    move-object/from16 v26, v3

    const/4 v1, 0x0

    move-object v1, v0

    move-object v3, v2

    move-object v6, v3

    :goto_a
    const/4 v2, 0x0

    .line 78
    :goto_b
    :try_start_e
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    goto :goto_c

    :catchall_8
    move-exception v0

    move-object v4, v0

    :try_start_f
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_c
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    :catchall_9
    move-exception v0

    move-object v1, v0

    goto :goto_d

    :catchall_a
    move-exception v0

    move-object/from16 v26, v3

    const/4 v1, 0x0

    move-object v1, v0

    move-object v3, v2

    move-object v6, v3

    const/4 v2, 0x0

    :goto_d
    :try_start_10
    invoke-virtual/range {v26 .. v26}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    goto :goto_e

    :catchall_b
    move-exception v0

    move-object v4, v0

    :try_start_11
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_e
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    :catchall_c
    move-exception v0

    move v1, v2

    :goto_f
    move-object v2, v6

    goto :goto_10

    :catchall_d
    move-exception v0

    const/4 v1, 0x0

    move-object v3, v2

    :goto_10
    if-nez v1, :cond_c

    if-eqz v2, :cond_b

    .line 140
    :try_start_12
    iget-object v1, v2, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    invoke-virtual {v1}, Ll/ᩳܳܳ;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_0

    goto :goto_11

    :catch_0
    nop

    :cond_b
    :goto_11
    if-eqz v3, :cond_c

    :try_start_13
    iget-object v1, v3, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    invoke-virtual {v1}, Ll/ᩳܳܳ;->close()V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1

    .line 105
    :catch_1
    :cond_c
    throw v0
.end method

.method public static ۙ(Ljava/io/DataOutputStream;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/۬ᩴܳ;)V
    .locals 2

    .line 62
    invoke-virtual {p1}, Ll/֨᩷ܳ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۧ۬ᩴ;->ۙ(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p1}, Ll/֨᩷ܳ;->ۤ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۧ۬ᩴ;->ۙ(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Ll/֨᩷ܳ;->᩸()Ll/ۛᩴܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛᩴܳ;->᩷()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V

    invoke-virtual {p1}, Ll/֨᩷ܳ;->᩸()Ll/ۛᩴܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۛᩴܳ;->ۙ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 65
    invoke-virtual {p0, p2}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    if-nez p2, :cond_0

    .line 67
    invoke-virtual {p3}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ll/ۧ۬ᩴ;->ۙ(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 68
    invoke-virtual {p3}, Ll/ܶۤܳ;->᩸()Ll/֨ۨᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ۛᩴܳ;->᩷(Ll/֨ۨᩴ;)Ll/ۛᩴܳ;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ll/ۛᩴܳ;->᩷()J

    move-result-wide p2

    invoke-virtual {p0, p2, p3}, Ljava/io/DataOutputStream;->writeLong(J)V

    invoke-virtual {p1}, Ll/ۛᩴܳ;->ۙ()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 71
    :cond_0
    invoke-virtual {p4, p0}, Ll/۬ᩴܳ;->ۙ(Ljava/io/DataOutputStream;)V

    return-void
.end method

.method public static ۙ(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    .line 136
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(Ll/ۚۙܳ;)V
    .locals 0

    .line 140
    :try_start_0
    iget-object p0, p0, Ll/ۚۙܳ;->ۤ:Ll/ᩳܳܳ;

    invoke-virtual {p0}, Ll/ᩳܳܳ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ۙ(Ll/۬ᩴܳ;Ll/۬ᩴܳ;Ll/ܺۤܳ;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/۬ۙܳ;)V
    .locals 3

    .line 36
    iget-object p9, p9, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    .line 37
    :try_start_0
    new-instance v0, Ll/۫۬ᩴ;

    invoke-virtual {p2}, Ll/ܺۤܳ;->᩸()Ljava/io/BufferedOutputStream;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ll/۫۬ᩴ;-><init>(Ljava/io/BufferedOutputStream;Ll/ܺۤܳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 38
    :try_start_1
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const v2, 0x48435031    # 200000.77f

    .line 39
    :try_start_2
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 40
    invoke-static {v1, p3, p4, p5, p0}, Ll/֫ۙܳ;->ۙ(Ljava/io/DataOutputStream;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/۬ᩴܳ;)V

    .line 41
    invoke-static {v1, p6, p7, p8, p1}, Ll/֫ۙܳ;->ۙ(Ljava/io/DataOutputStream;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/۬ᩴܳ;)V

    .line 42
    iget p3, p9, Ll/۠ۙܳ;->ܰ:I

    invoke-virtual {v1, p3}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 71
    new-instance p3, Ll/ۖۙܳ;

    invoke-direct {p3, p9}, Ll/ۖۙܳ;-><init>(Ll/۠ۙܳ;)V

    .line 43
    :goto_0
    invoke-virtual {p3}, Ll/ۖۙܳ;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p3}, Ll/ۖۙܳ;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/ۡۙܳ;

    .line 44
    iget p5, p4, Ll/ۡۙܳ;->᩷:I

    invoke-virtual {v1, p5}, Ljava/io/DataOutputStream;->writeByte(I)V

    iget p5, p4, Ll/ۡۙܳ;->᩸:I

    invoke-virtual {v1, p5}, Ljava/io/DataOutputStream;->writeInt(I)V

    iget p4, p4, Ll/ۡۙܳ;->ܳ:I

    invoke-virtual {v1, p4}, Ljava/io/DataOutputStream;->writeInt(I)V

    goto :goto_0

    :cond_0
    const p3, 0x31435048

    .line 46
    invoke-virtual {v1, p3}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    .line 47
    invoke-virtual {v0}, Ll/۫۬ᩴ;->ۙ()J

    move-result-wide p3

    invoke-virtual {v0}, Ll/۫۬ᩴ;->᩷()V

    invoke-virtual {v1, p3, p4}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    const/4 p3, 0x0

    .line 50
    invoke-virtual {p2, p3}, Ll/ܺۤܳ;->ۙ(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 51
    :try_start_5
    invoke-virtual {p1}, Ll/۬ᩴܳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    :try_start_6
    invoke-virtual {p0}, Ll/۬ᩴܳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    return-void

    :catchall_0
    move-exception p3

    .line 37
    :try_start_7
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p4

    :try_start_8
    invoke-virtual {p3, p4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception p3

    :try_start_9
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p4

    :try_start_a
    invoke-virtual {p3, p4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception p3

    .line 36
    :try_start_b
    invoke-virtual {p1}, Ll/۬ᩴܳ;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception p1

    :try_start_c
    invoke-virtual {p3, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    :catchall_6
    move-exception p1

    :try_start_d
    invoke-virtual {p0}, Ll/۬ᩴܳ;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception p0

    :try_start_e
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :catchall_8
    move-exception p0

    .line 51
    invoke-virtual {p2, p0}, Ll/ܺۤܳ;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ۙ(Ll/ܺۤܳ;Ll/ۙۤܳ;Ll/֨᩷ܳ;Ll/֨᩷ܳ;ZZLl/ܶۤܳ;Ll/ܶۤܳ;Ljava/util/concurrent/Executor;)V
    .locals 18

    move-object/from16 v1, p1

    const/4 v2, 0x0

    .line 28
    :try_start_0
    monitor-enter p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_a
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_9

    :try_start_1
    iget-object v3, v1, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    :try_start_2
    iget-object v4, v1, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 29
    :try_start_3
    invoke-virtual/range {p1 .. p1}, Ll/ۙۤܳ;->᩷()Ll/۬ۙܳ;

    move-result-object v15

    .line 30
    iget-object v0, v15, Ll/۬ۙܳ;->۫:Ll/۠ۙܳ;

    iget v0, v0, Ll/۠ۙܳ;->ܰ:I

    const v5, 0xf4240

    if-gt v0, v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v5, "Comparison checkpoint exceeds span limit"

    invoke-static {v5, v0}, Ll/֫ۙܳ;->ۙ(Ljava/lang/String;Z)V

    .line 31
    iget-object v0, v1, Ll/ۙۤܳ;->ܿ:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->۫()Ll/۬ᩴܳ;

    move-result-object v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    iget-object v0, v1, Ll/ۙۤܳ;->֨:Ll/ᩳܳܳ;

    invoke-virtual {v0}, Ll/ᩳܳܳ;->۫()Ll/۬ᩴܳ;

    move-result-object v2

    .line 32
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    monitor-exit p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 34
    :try_start_7
    invoke-virtual/range {v16 .. v16}, Ll/۬ᩴܳ;->ۙ()J

    move-result-wide v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/Error; {:try_start_7 .. :try_end_7} :catch_3

    move-object/from16 v4, p0

    :try_start_8
    invoke-virtual {v4, v0, v1}, Ll/ܺۤܳ;->ۙ(J)V

    .line 35
    new-instance v0, Ll/ᩴۙܳ;

    move-object v5, v0

    move-object/from16 v6, v16

    move-object v7, v2

    move-object/from16 v8, p0

    move-object/from16 v9, p2

    move/from16 v10, p4

    move-object/from16 v11, p6

    move-object/from16 v12, p3

    move/from16 v13, p5

    move-object/from16 v14, p7

    invoke-direct/range {v5 .. v15}, Ll/ᩴۙܳ;-><init>(Ll/۬ᩴܳ;Ll/۬ᩴܳ;Ll/ܺۤܳ;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/֨᩷ܳ;ZLl/ܶۤܳ;Ll/۬ۙܳ;)V

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    :goto_1
    move-object/from16 v4, p0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_1

    :catch_5
    move-exception v0

    goto :goto_1

    :goto_2
    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object/from16 v4, p0

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object/from16 v4, p0

    move-object v5, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v5, v2

    move-object/from16 v2, v16

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v5, v2

    .line 32
    :goto_3
    :try_start_9
    monitor-exit v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v0

    move-object/from16 v4, p0

    move-object/from16 v17, v5

    move-object v5, v3

    move-object/from16 v3, v17

    goto :goto_4

    :catchall_5
    move-exception v0

    goto :goto_3

    :catchall_6
    move-exception v0

    move-object/from16 v4, p0

    move-object v5, v3

    move-object v3, v2

    :goto_4
    :try_start_b
    monitor-exit v5
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    :try_start_c
    throw v0

    :catchall_7
    move-exception v0

    goto :goto_4

    :catchall_8
    move-exception v0

    move-object/from16 v4, p0

    move-object v3, v2

    :goto_5
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    :try_start_d
    throw v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_7
    .catch Ljava/lang/Error; {:try_start_d .. :try_end_d} :catch_6

    :catch_6
    move-exception v0

    goto :goto_6

    :catch_7
    move-exception v0

    goto :goto_6

    :catch_8
    move-exception v0

    :goto_6
    move-object v1, v0

    goto :goto_8

    :catchall_9
    move-exception v0

    goto :goto_5

    :catch_9
    move-exception v0

    goto :goto_7

    :catch_a
    move-exception v0

    goto :goto_7

    :catch_b
    move-exception v0

    :goto_7
    move-object/from16 v4, p0

    move-object v1, v0

    move-object v3, v2

    :goto_8
    if-eqz v2, :cond_1

    .line 54
    :try_start_e
    invoke-virtual {v2}, Ll/۬ᩴܳ;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_c

    goto :goto_9

    :catch_c
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_9
    if-eqz v3, :cond_2

    .line 55
    :try_start_f
    invoke-virtual {v3}, Ll/۬ᩴܳ;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_d

    goto :goto_a

    :catch_d
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 56
    :cond_2
    :goto_a
    invoke-virtual {v4, v1}, Ll/ܺۤܳ;->ۙ(Ljava/lang/Throwable;)V

    throw v1
.end method
