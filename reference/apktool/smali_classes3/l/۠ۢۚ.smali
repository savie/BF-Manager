.class public final Ll/۠ۢۚ;
.super Ljava/lang/Object;
.source "26KB"


# direct methods
.method public static ۙ(JLl/ۨ۠ۚ;)Ll/ۡۢۚ;
    .locals 1

    .line 205
    new-instance v0, Ll/ۢۢۚ;

    .line 170
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 206
    invoke-static {p2, p0, p1, v0}, Ll/᩵ۚ֫;->ۙ(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)Ll/᩵ۚ֫;

    .line 207
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    new-instance p0, Ll/ۡۢۚ;

    sget-object p2, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, p2, p1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 208
    :cond_0
    invoke-static {v0}, Ll/ۢۢۚ;->᩷(Ll/ۢۢۚ;)Ll/ۡۢۚ;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {v0}, Ll/ۢۢۚ;->᩷(Ll/ۢۢۚ;)Ll/ۡۢۚ;

    move-result-object p0

    return-object p0

    .line 209
    :cond_1
    invoke-static {v0}, Ll/ۢۢۚ;->ۙ(Ll/ۢۢۚ;)Ll/ۡۢۚ;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {v0}, Ll/ۢۢۚ;->ۙ(Ll/ۢۢۚ;)Ll/ۡۢۚ;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ll/ۡۢۚ;

    sget-object p2, Ll/ۖۢۚ;->ܿ:Ll/ۖۢۚ;

    invoke-direct {p0, p2, p1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0
.end method

.method public static ۙ(Landroid/media/MediaDataSource;Ljava/lang/String;)Ll/ۡۢۚ;
    .locals 6

    .line 109
    invoke-static {p1}, Ll/۠ۢۚ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 111
    :try_start_0
    new-instance v0, Ll/۟ۢۚ;

    invoke-direct {v0, p0}, Ll/۟ۢۚ;-><init>(Landroid/media/MediaDataSource;)V

    invoke-virtual {p0}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, Ll/۠ۢۚ;->ۙ(Ll/ۨ۠ۚ;JZ)Ll/ۡۢۚ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return-object v0

    .line 114
    :catch_0
    new-instance p0, Ll/ۡۢۚ;

    sget-object p1, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, p1, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 117
    :cond_0
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 119
    :try_start_1
    new-instance v2, Ll/֨ۢۚ;

    invoke-direct {v2, p0}, Ll/֨ۢۚ;-><init>(Landroid/media/MediaDataSource;)V

    .line 120
    invoke-virtual {v0, v2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 121
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object v3

    .line 122
    invoke-static {v2}, Ll/֨ۢۚ;->ۙ(Ll/֨ۢۚ;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 124
    :cond_1
    invoke-static {v3}, Ll/۠ۢۚ;->᩷([B)Ll/ۡۢۚ;

    move-result-object v2

    .line 125
    invoke-virtual {v2}, Ll/ۡۢۚ;->᩷()Ll/ۖۢۚ;

    move-result-object v4

    sget-object v5, Ll/ۖۢۚ;->۟:Ll/ۖۢۚ;

    if-eq v4, v5, :cond_2

    invoke-static {p1}, Ll/۠ۢۚ;->᩷(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 127
    new-instance p1, Ll/۟ۢۚ;

    invoke-direct {p1, p0}, Ll/۟ۢۚ;-><init>(Landroid/media/MediaDataSource;)V

    invoke-virtual {p0}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v3

    const/4 p0, 0x1

    invoke-static {p1, v3, v4, p0}, Ll/۠ۢۚ;->ۙ(Ll/ۨ۠ۚ;JZ)Ll/ۡۢۚ;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_5
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_3

    .line 138
    :try_start_2
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    return-object p0

    :cond_2
    if-nez v3, :cond_3

    .line 131
    :try_start_3
    new-instance p1, Ll/۟ۢۚ;

    invoke-direct {p1, p0}, Ll/۟ۢۚ;-><init>(Landroid/media/MediaDataSource;)V

    invoke-virtual {p0}, Landroid/media/MediaDataSource;->getSize()J

    move-result-wide v2

    invoke-static {v2, v3, p1}, Ll/۠ۢۚ;->ۙ(JLl/ۨ۠ۚ;)Ll/ۡۢۚ;

    move-result-object p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 138
    :try_start_4
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    return-object p0

    :cond_3
    :try_start_5
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    return-object v2

    .line 123
    :cond_4
    :goto_0
    :try_start_6
    new-instance p0, Ll/ۡۢۚ;

    sget-object p1, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, p1, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 138
    :try_start_7
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    :catch_4
    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 135
    :catch_5
    :try_start_8
    new-instance p0, Ll/ۡۢۚ;

    sget-object p1, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, p1, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 138
    :try_start_9
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    :catch_6
    return-object p0

    :goto_1
    :try_start_a
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 141
    :catch_7
    throw p0
.end method

.method public static ۙ(Ll/ۨ۠ۚ;JZ)Ll/ۡۢۚ;
    .locals 1

    .line 162
    new-instance v0, Ll/ۢۢۚ;

    .line 170
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    .line 163
    invoke-static {p0, p1, p2, v0}, Ll/ܰۢۚ;->᩷(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)V

    goto :goto_0

    .line 164
    :cond_0
    invoke-static {p0, p1, p2, v0}, Ll/ܰۢۚ;->ۙ(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)V

    .line 165
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Ll/ۡۢۚ;

    sget-object p1, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 166
    :cond_1
    invoke-static {v0}, Ll/ۢۢۚ;->᩷(Ll/ۢۢۚ;)Ll/ۡۢۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;)Ll/ۡۢۚ;
    .locals 9

    .line 40
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/۠ۢۚ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 42
    :try_start_0
    invoke-static {p0}, Ll/۠ۢۚ;->᩷(Ll/᩷ۨᩴ;)Ll/ۡۢۚ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    return-object v0

    .line 45
    :catch_0
    new-instance p0, Ll/ۡۢۚ;

    sget-object v0, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, v0, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 48
    :cond_0
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 50
    :try_start_1
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->᩵()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 51
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۙۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۗۙ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 53
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۤۙ()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 59
    :goto_0
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object v2

    if-nez v2, :cond_2

    .line 60
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v3

    .line 200
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v5, v4, -0x4

    const-string v6, ".wav"

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v4, 0x1

    invoke-virtual/range {v3 .. v8}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v2, "r"

    .line 61
    invoke-virtual {p0, v2}, Ll/᩷ۨᩴ;->ۧ(Ljava/lang/String;)Ll/۬ܺۤ;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 62
    :try_start_2
    new-instance v2, Ll/᩶ۢۚ;

    invoke-direct {v2, p0}, Ll/᩶ۢۚ;-><init>(Ll/۬ܺۤ;)V

    .line 65
    invoke-virtual {p0}, Ll/۬ܺۤ;->length()J

    move-result-wide v3

    .line 62
    invoke-static {v3, v4, v2}, Ll/۠ۢۚ;->ۙ(JLl/ۨ۠ۚ;)Ll/ۡۢۚ;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    :try_start_3
    invoke-virtual {p0}, Ll/۬ܺۤ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 80
    :try_start_4
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    return-object v2

    :catchall_0
    move-exception v2

    .line 61
    :try_start_5
    invoke-virtual {p0}, Ll/۬ܺۤ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_6
    invoke-virtual {v2, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v2

    .line 68
    :cond_2
    invoke-static {v2}, Ll/۠ۢۚ;->᩷([B)Ll/ۡۢۚ;

    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ll/ۡۢۚ;->᩷()Ll/ۖۢۚ;

    move-result-object v3

    sget-object v4, Ll/ۖۢۚ;->۟:Ll/ۖۢۚ;

    if-eq v3, v4, :cond_3

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/۠ۢۚ;->᩷(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 71
    invoke-static {p0}, Ll/۠ۢۚ;->᩷(Ll/᩷ۨᩴ;)Ll/ۡۢۚ;

    move-result-object p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz p0, :cond_3

    .line 80
    :try_start_7
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    :catch_2
    return-object p0

    :cond_3
    :try_start_8
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    :catch_3
    return-object v2

    .line 54
    :cond_4
    :try_start_9
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_5

    .line 55
    invoke-static {p0, v0}, Ll/۠ۢۚ;->ۙ(Ll/᩷ۨᩴ;Landroid/media/MediaMetadataRetriever;)Ll/ۡۢۚ;

    move-result-object p0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 80
    :try_start_a
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4

    :catch_4
    return-object p0

    .line 57
    :cond_5
    :try_start_b
    new-instance p0, Ll/ۡۢۚ;

    sget-object v2, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, v2, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_b .. :try_end_b} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 80
    :try_start_c
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    :catch_5
    return-object p0

    :catchall_2
    move-exception p0

    goto :goto_2

    .line 76
    :catch_6
    :try_start_d
    new-instance p0, Ll/ۡۢۚ;

    sget-object v2, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, v2, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 80
    :try_start_e
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7

    :catch_7
    return-object p0

    :goto_2
    :try_start_f
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_8

    .line 83
    :catch_8
    throw p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Landroid/media/MediaMetadataRetriever;)Ll/ۡۢۚ;
    .locals 8

    .line 89
    new-instance v0, Ll/ᩳۢۚ;

    .line 238
    invoke-direct {v0, p0}, Ll/֡ܿ᩻;-><init>(Ll/᩷ۨᩴ;)V

    .line 90
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    .line 91
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->getEmbeddedPicture()[B

    move-result-object p1

    .line 92
    invoke-static {v0}, Ll/ᩳۢۚ;->ۙ(Ll/ᩳۢۚ;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    .line 95
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 200
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v4, v1, -0x4

    const-string v5, ".wav"

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v3, 0x1

    invoke-virtual/range {v2 .. v7}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 96
    new-instance p1, Ll/ܿۢۚ;

    invoke-direct {p1, v0}, Ll/ܿۢۚ;-><init>(Ll/ᩳۢۚ;)V

    invoke-virtual {v0}, Ll/֡ܿ᩻;->getSize()J

    move-result-wide v1

    invoke-static {v1, v2, p1}, Ll/۠ۢۚ;->ۙ(JLl/ۨ۠ۚ;)Ll/ۡۢۚ;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ll/۠ۢۚ;->᩷([B)Ll/ۡۢۚ;

    move-result-object p1

    .line 97
    :goto_0
    invoke-virtual {p1}, Ll/ۡۢۚ;->᩷()Ll/ۖۢۚ;

    move-result-object v1

    sget-object v2, Ll/ۖۢۚ;->۟:Ll/ۖۢۚ;

    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/۠ۢۚ;->᩷(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    .line 98
    new-instance p0, Ll/ܿۢۚ;

    invoke-direct {p0, v0}, Ll/ܿۢۚ;-><init>(Ll/ᩳۢۚ;)V

    invoke-virtual {v0}, Ll/֡ܿ᩻;->getSize()J

    move-result-wide v1

    const/4 v3, 0x1

    invoke-static {p0, v1, v2, v3}, Ll/۠ۢۚ;->ۙ(Ll/ۨ۠ۚ;JZ)Ll/ۡۢۚ;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_2

    .line 102
    invoke-virtual {v0}, Ll/ᩳۢۚ;->close()V

    return-object p0

    :cond_2
    invoke-virtual {v0}, Ll/ᩳۢۚ;->close()V

    return-object p1

    .line 93
    :cond_3
    :goto_1
    :try_start_1
    new-instance p0, Ll/ۡۢۚ;

    sget-object p1, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    invoke-virtual {v0}, Ll/ᩳۢۚ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 89
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳۢۚ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method

.method public static bridge synthetic ۙ([B)Ll/ۡۢۚ;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/۠ۢۚ;->᩷([B)Ll/ۡۢۚ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 7

    .line 187
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x5

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v2, 0x1

    const-string v4, ".flac"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 188
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x1

    const-string v4, ".ogg"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 189
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x1

    const-string v4, ".oga"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 190
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x5

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v2, 0x1

    const-string v4, ".opus"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷(Ll/᩷ۨᩴ;)Ll/ۡۢۚ;
    .locals 4

    :try_start_0
    const-string v0, "r"

    .line 147
    invoke-virtual {p0, v0}, Ll/᩷ۨᩴ;->ۧ(Ljava/lang/String;)Ll/۬ܺۤ;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :try_start_1
    new-instance v1, Ll/֡ۢۚ;

    invoke-direct {v1, v0}, Ll/֡ۢۚ;-><init>(Ll/۬ܺۤ;)V

    .line 156
    invoke-virtual {v0}, Ll/۬ܺۤ;->length()J

    move-result-wide v2

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/۠ۢۚ;->᩷(Ljava/lang/String;)Z

    move-result p0

    .line 153
    invoke-static {v1, v2, v3, p0}, Ll/۠ۢۚ;->ۙ(Ll/ۨ۠ۚ;JZ)Ll/ۡۢۚ;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 157
    invoke-virtual {v0}, Ll/۬ܺۤ;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    .line 152
    :try_start_2
    invoke-virtual {v0}, Ll/۬ܺۤ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ᩷([B)Ll/ۡۢۚ;
    .locals 9

    .line 213
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Ll/ۡۢۚ;

    sget-object v0, Ll/ۖۢۚ;->֡:Ll/ۖۢۚ;

    invoke-direct {p0, v0, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    .line 214
    new-instance p0, Ll/ۡۢۚ;

    sget-object v0, Ll/ۖۢۚ;->ܿ:Ll/ۖۢۚ;

    invoke-direct {p0, v0, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 216
    :cond_1
    array-length v0, p0

    if-eqz v0, :cond_6

    array-length v0, p0

    const/high16 v2, 0x800000

    if-le v0, v2, :cond_2

    goto :goto_2

    .line 217
    :cond_2
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v2, 0x1

    .line 218
    iput-boolean v2, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    const/4 v2, 0x0

    .line 219
    array-length v3, p0

    invoke-static {p0, v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 220
    iget v2, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-lez v2, :cond_5

    if-lez v0, :cond_5

    .line 222
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/16 v4, 0x4000

    if-gt v3, v4, :cond_5

    int-to-long v3, v2

    int-to-long v5, v0

    mul-long v3, v3, v5

    const-wide/32 v5, 0x1000000

    cmp-long v7, v3, v5

    if-gtz v7, :cond_5

    .line 224
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v5, v0

    const-wide/16 v7, 0x20

    mul-long v5, v5, v7

    cmp-long v0, v3, v5

    if-lez v0, :cond_3

    goto :goto_1

    .line 227
    :cond_3
    new-instance v0, Ll/ᩳ֡᩻;

    invoke-direct {v0, p0}, Ll/ᩳ֡᩻;-><init>([B)V

    invoke-static {v0}, Ll/۠֡᩻;->ۙ(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object p0

    .line 228
    new-instance v0, Ll/ۡۢۚ;

    if-nez p0, :cond_4

    sget-object v1, Ll/ۖۢۚ;->᩶:Ll/ۖۢۚ;

    goto :goto_0

    :cond_4
    sget-object v1, Ll/ۖۢۚ;->۟:Ll/ۖۢۚ;

    :goto_0
    invoke-direct {v0, v1, p0}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object v0

    .line 225
    :cond_5
    :goto_1
    new-instance p0, Ll/ۡۢۚ;

    sget-object v0, Ll/ۖۢۚ;->᩶:Ll/ۖۢۚ;

    invoke-direct {p0, v0, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 216
    :cond_6
    :goto_2
    new-instance p0, Ll/ۡۢۚ;

    sget-object v0, Ll/ۖۢۚ;->᩶:Ll/ۖۢۚ;

    invoke-direct {p0, v0, v1}, Ll/ۡۢۚ;-><init>(Ll/ۖۢۚ;Landroid/graphics/Bitmap;)V

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 7

    .line 194
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x1

    const-string v4, ".mp3"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 195
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x4

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x1

    const-string v4, ".mp2"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result v0

    if-nez v0, :cond_1

    .line 196
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v3, v0, -0x5

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v2, 0x1

    const-string v4, ".mpga"

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
