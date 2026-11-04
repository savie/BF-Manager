.class public final Ll/ۢۡ۫;
.super Ljava/lang/Object;
.source "08FX"


# direct methods
.method public static ۙ(Ljava/io/BufferedInputStream;)Ljava/io/InputStream;
    .locals 2

    .line 96
    new-instance v0, Ll/ܽ֡ܳ;

    invoke-direct {v0, p0}, Ll/ܽ֡ܳ;-><init>(Ljava/io/BufferedInputStream;)V

    const/4 v1, 0x0

    .line 101
    invoke-static {p0, v0, v1}, Ll/ۢۡ۫;->ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۡ;Z)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/io/BufferedInputStream;Ll/ܽ֡ܳ;)Ljava/io/InputStream;
    .locals 1

    const/4 v0, 0x1

    .line 107
    invoke-static {p0, p1, v0}, Ll/ۢۡ۫;->ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۡ;Z)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۡ;)Ljava/io/InputStream;
    .locals 1

    const/4 v0, 0x0

    .line 101
    invoke-static {p0, p1, v0}, Ll/ۢۡ۫;->ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۡ;Z)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۡ;Z)Ljava/io/InputStream;
    .locals 8

    .line 114
    invoke-virtual {p0}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 117
    invoke-static {}, Ll/᩻ܳ۫;->᩸()[B

    move-result-object v0

    .line 118
    array-length v1, v0

    invoke-virtual {p0, v1}, Ljava/io/InputStream;->mark(I)V

    .line 2096
    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;[BII)I

    move-result v1

    .line 120
    invoke-virtual {p0}, Ljava/io/InputStream;->reset()V

    const/4 p0, 0x0

    .line 123
    :try_start_0
    invoke-static {}, Ll/᩻ܳ۫;->values()[Ll/᩻ܳ۫;

    move-result-object v3

    array-length v4, v3

    :goto_0
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 124
    invoke-virtual {v5, v0, v1}, Ll/᩻ܳ۫;->ۙ([BI)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 125
    invoke-interface {p1}, Ll/᩷ۡ;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p2, :cond_0

    .line 126
    :try_start_1
    invoke-virtual {v5, p1}, Ll/᩻ܳ۫;->᩷(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {v5, p1}, Ll/᩻ܳ۫;->ۙ(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object p0

    :catch_1
    move-exception p1

    :goto_1
    if-eqz p0, :cond_3

    .line 131
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 133
    :cond_3
    throw p1

    .line 115
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ۙ(Ljava/io/Closeable;Ll/ۜ᩹ۨ;Ll/᩷ۨᩴ;ZLl/ᩳۡ۫;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const/4 v2, 0x0

    .line 42
    :try_start_0
    instance-of v3, v1, Ll/ۚۗۨ;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ll/ۚۗۨ;

    move-object/from16 v4, p1

    .line 43
    invoke-virtual {v3, v4}, Ll/ۚۗۨ;->ۙ(Ll/ۜ᩹ۨ;)Ljava/io/InputStream;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    .line 44
    instance-of v3, v1, Ll/۬᩹ۨ;

    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, Ll/۬᩹ۨ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :goto_0
    const/4 v5, 0x0

    .line 446
    :try_start_1
    invoke-virtual {v0, v5}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 v7, 0x1000

    :try_start_2
    new-array v7, v7, [B

    .line 52
    invoke-virtual/range {p1 .. p1}, Ll/ۜ᩹ۨ;->᩵()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    move-wide v12, v10

    .line 54
    :cond_1
    invoke-virtual {v3, v7}, Ljava/io/InputStream;->read([B)I

    move-result v14

    if-lez v14, :cond_3

    .line 55
    invoke-virtual {v6, v7, v5, v14}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v14, v14

    add-long/2addr v12, v14

    cmp-long v14, v8, v10

    if-lez v14, :cond_2

    move-object/from16 v14, p4

    .line 58
    invoke-interface {v14, v12, v13, v8, v9}, Ll/ᩳۡ۫;->ۙ(JJ)V

    goto :goto_1

    :cond_2
    move-object/from16 v14, p4

    .line 59
    :goto_1
    invoke-interface/range {p4 .. p4}, Ll/۟֡֫;->۫()Z

    move-result v15

    if-eqz v15, :cond_1

    .line 60
    invoke-static {v6}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    :try_start_3
    invoke-virtual/range {p2 .. p2}, Ll/᩷ۨᩴ;->ᩳ()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eq v3, v1, :cond_5

    .line 74
    invoke-static {v3}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    return-void

    .line 67
    :cond_3
    :try_start_4
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p3, :cond_4

    .line 69
    :try_start_5
    invoke-static {}, Ll/᩶᩷ۧ;->ۨ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 70
    invoke-virtual/range {p1 .. p1}, Ll/ۜ᩹ۨ;->ܽ()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ll/᩷ۨᩴ;->ۙ(J)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_4
    if-eq v3, v1, :cond_5

    .line 74
    invoke-static {v3}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    :cond_5
    return-void

    :catchall_0
    move-exception v0

    move-object v2, v6

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_2
    move-object/from16 v16, v3

    move-object v3, v2

    move-object/from16 v2, v16

    goto :goto_3

    .line 47
    :cond_6
    :try_start_6
    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    move-object v3, v2

    :goto_3
    if-eq v2, v1, :cond_7

    .line 74
    invoke-static {v2}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 76
    :cond_7
    invoke-static {v3}, Ll/᩵֫ܺ;->ۙ(Ljava/lang/AutoCloseable;)V

    .line 77
    throw v0
.end method

.method public static ۙ(Ll/ۚۗۨ;Ll/ۜ᩹ۨ;Ll/᩷ۨᩴ;Ll/ᩳۡ۫;)V
    .locals 1

    const/4 v0, 0x1

    .line 35
    invoke-static {p0, p1, p2, v0, p3}, Ll/ۢۡ۫;->ۙ(Ljava/io/Closeable;Ll/ۜ᩹ۨ;Ll/᩷ۨᩴ;ZLl/ᩳۡ۫;)V

    return-void
.end method

.method public static ۙ(Ll/۬᩹ۨ;Ll/ۜ᩹ۨ;Ll/᩷ۨᩴ;Ll/ᩳۡ۫;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-static {p0, p1, p2, v0, p3}, Ll/ۢۡ۫;->ۙ(Ljava/io/Closeable;Ll/ۜ᩹ۨ;Ll/᩷ۨᩴ;ZLl/ᩳۡ۫;)V

    return-void
.end method
