.class public final Ll/᩶᩻֫;
.super Ljava/lang/Object;
.source "56JK"


# direct methods
.method public static ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;JLl/ۢܺ֫;Ll/۟֡֫;Ll/ۜ֫֫;)Ll/۠֫֫;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    .line 19
    iget-object v4, v0, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    iget-object v5, v0, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    iget-boolean v6, v0, Ll/ۡ֫֫;->᩷:Z

    move-object/from16 v7, p7

    invoke-virtual {v7, v4, v6}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v4

    .line 20
    iget-object v7, v0, Ll/ۡ֫֫;->۫:Ll/֨ۧܺ;

    .line 21
    new-instance v8, Landroid/graphics/Rect;

    iget v0, v7, Ll/֨ۧܺ;->ܽ:I

    iget v6, v7, Ll/֨ۧܺ;->᩸:I

    const/4 v9, 0x0

    invoke-direct {v8, v9, v9, v0, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 22
    invoke-virtual/range {p2 .. p2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v9

    move-wide/from16 v11, p3

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    const/4 v0, 0x1

    const/4 v13, 0x1

    :goto_0
    if-lez v13, :cond_8

    const/high16 v0, 0x40000000    # 2.0f

    if-gt v13, v0, :cond_8

    .line 24
    invoke-static/range {p6 .. p6}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 25
    iget v0, v7, Ll/֨ۧܺ;->ܽ:I

    invoke-static {v0, v13}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v11

    long-to-int v12, v11

    .line 26
    invoke-static {v6, v13}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v14

    long-to-int v11, v14

    int-to-long v14, v12

    int-to-long v0, v11

    mul-long v14, v14, v0

    const-wide/16 v0, 0x4

    mul-long v0, v0, v14

    .line 28
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p1, v6

    const/16 v6, 0x800

    if-gt v12, v6, :cond_7

    if-gt v11, v6, :cond_7

    const-wide/32 v16, 0x400000

    cmp-long v6, v14, v16

    if-gtz v6, :cond_7

    cmp-long v6, v0, v9

    if-lez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    if-eqz v3, :cond_2

    move-object/from16 v14, p6

    .line 32
    :try_start_0
    invoke-virtual {v3, v8, v13, v2, v14}, Ll/ۢܺ֫;->ۙ(Landroid/graphics/Rect;ILl/ۖۚ֫;Ll/۟֡֫;)Ll/۠֫֫;

    move-result-object v0
    :try_end_0
    .catch Ll/ᩳ֫֫; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    const/4 v0, 0x1

    if-ne v12, v0, :cond_3

    if-eq v11, v0, :cond_1

    goto :goto_1

    .line 35
    :cond_1
    throw v1

    :cond_2
    move-object/from16 v14, p6

    const/4 v6, 0x1

    const/4 v15, 0x0

    .line 39
    invoke-virtual {v7, v15}, Ll/֨ۧܺ;->ۙ(Z)J

    move-result-wide v15

    add-long/2addr v15, v0

    add-long/2addr v0, v15

    .line 40
    invoke-virtual {v2, v0, v1}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v1

    if-nez v1, :cond_4

    if-ne v12, v6, :cond_3

    if-eq v11, v6, :cond_8

    :cond_3
    :goto_1
    move-object/from16 v15, p0

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    move-object/from16 v15, p0

    .line 47
    :try_start_1
    invoke-virtual {v15, v5}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 48
    invoke-static {v15, v4}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 49
    :try_start_2
    iget-wide v9, v4, Ll/ۜ֫֫;->᩷:J

    invoke-static {v9, v10, v3}, Ll/۠ۧܺ;->ۙ(JLjava/io/InputStream;)Ll/֨ۧܺ;

    move-result-object v0

    invoke-virtual {v7, v0}, Ll/֨ۧܺ;->ۙ(Ll/֨ۧܺ;)V

    .line 50
    iget-wide v10, v4, Ll/ۜ֫֫;->ۙ:J

    move-object v6, v3

    move v9, v13

    move-object/from16 v12, p6

    invoke-static/range {v6 .. v12}, Ll/۠ۧܺ;->ۙ(Ljava/io/InputStream;Ll/֨ۧܺ;Landroid/graphics/Rect;IJLl/۟֡֫;)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 53
    invoke-virtual {v15, v5}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 54
    invoke-static/range {p6 .. p6}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 55
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v0

    int-to-long v3, v0

    invoke-virtual {v1, v3, v4}, Ll/ۡۚ֫;->᩷(J)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 57
    new-instance v0, Ll/۠֫֫;

    invoke-direct {v0, v2, v1, v13}, Ll/۠֫֫;-><init>(Landroid/graphics/Bitmap;Ll/ۡۚ֫;I)V

    return-object v0

    .line 56
    :cond_5
    new-instance v0, Ll/ᩳ֫֫;

    const-string v3, "TGA preview allocation exceeds budget"

    .line 459
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_0
    move-exception v0

    move-object v4, v0

    .line 48
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v2, :cond_6

    .line 62
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 63
    :cond_6
    invoke-virtual {v1}, Ll/ۡۚ֫;->close()V

    .line 64
    throw v0

    :cond_7
    :goto_3
    move-object/from16 v15, p0

    move-object/from16 v14, p6

    :goto_4
    mul-int/lit8 v13, v13, 0x2

    move/from16 v6, p1

    move-object v1, v15

    goto/16 :goto_0

    .line 66
    :cond_8
    new-instance v0, Ll/ᩳ֫֫;

    const-string v1, "TGA preview does not fit bitmap budget"

    .line 459
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 66
    throw v0
.end method
