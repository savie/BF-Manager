.class public final Ll/ۢܺ֫;
.super Ljava/lang/Object;
.source "06MC"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ll/ۡ֫֫;

.field public ֨:Ll/ۡۚ֫;

.field public final ۟:Ljava/lang/Thread;

.field public ۢ:Ll/۠ۧܺ;

.field public ܰ:Z

.field public final ܿ:Ljava/io/InputStream;

.field public final ᩳ:Ll/۫ۧ֫;

.field public final ᩶:Landroid/graphics/BitmapRegionDecoder;


# direct methods
.method public constructor <init>(Ll/۫ۧ֫;Ll/ۡ֫֫;Ljava/io/InputStream;Landroid/graphics/BitmapRegionDecoder;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Ll/ۢܺ֫;->۟:Ljava/lang/Thread;

    .line 29
    iput-object p1, p0, Ll/ۢܺ֫;->ᩳ:Ll/۫ۧ֫;

    .line 30
    iput-object p2, p0, Ll/ۢܺ֫;->֡:Ll/ۡ֫֫;

    .line 31
    iput-object p3, p0, Ll/ۢܺ֫;->ܿ:Ljava/io/InputStream;

    .line 32
    iput-object p4, p0, Ll/ۢܺ֫;->᩶:Landroid/graphics/BitmapRegionDecoder;

    return-void
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;)Ll/ۢܺ֫;
    .locals 7

    .line 38
    sget-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    .line 44
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_9

    .line 46
    iget-object v1, p1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    iget-object v2, p1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    iget-boolean v3, p1, Ll/ۡ֫֫;->᩷:Z

    invoke-virtual {v0, v1, v3}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v0

    .line 47
    invoke-static {p0, p1, v0}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۜ֫֫;)V

    .line 48
    iget-object v1, p1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    invoke-static {v1}, Ll/ۢܺ֫;->ۙ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, 0x0

    .line 53
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۧ֫;->ۚ()Ljava/io/File;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 54
    invoke-virtual {p0}, Ll/۫ۧ֫;->᩹()Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 55
    :try_start_1
    instance-of v5, v3, Ljava/io/FileInputStream;

    if-eqz v5, :cond_0

    .line 57
    move-object v5, v3

    check-cast v5, Ljava/io/FileInputStream;

    invoke-static {v5}, Ll/᩻ۗ᩹;->ۙ(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v5

    invoke-static {v5, v6, v0}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 58
    move-object v0, v3

    check-cast v0, Ljava/io/FileInputStream;

    invoke-virtual {v0}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-static {v0, v4}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/FileDescriptor;Z)Landroid/graphics/BitmapRegionDecoder;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    .line 55
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Local source requires a file stream"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_1

    .line 60
    :cond_1
    :try_start_2
    invoke-static {p0, v0}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 61
    :try_start_3
    invoke-static {v3, v4}, Landroid/graphics/BitmapRegionDecoder;->newInstance(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;

    move-result-object v1

    .line 62
    invoke-virtual {v3}, Ll/֨֫֫;->ۙ()V

    .line 64
    :goto_0
    invoke-virtual {p0, v2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    if-eqz v1, :cond_3

    .line 66
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->getWidth()I

    move-result v0

    iget v4, p1, Ll/ۡ֫֫;->֫:I

    if-ne v0, v4, :cond_2

    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->getHeight()I

    move-result v0

    iget v4, p1, Ll/ۡ֫֫;->ۤ:I

    if-ne v0, v4, :cond_2

    .line 68
    new-instance v0, Ll/ۢܺ֫;

    invoke-direct {v0, p0, p1, v3, v1}, Ll/ۢܺ֫;-><init>(Ll/۫ۧ֫;Ll/ۡ֫֫;Ljava/io/InputStream;Landroid/graphics/BitmapRegionDecoder;)V

    return-object v0

    .line 67
    :cond_2
    new-instance p1, Ll/ᩴۧ֫;

    const-string v0, "Region decoder dimensions changed"

    .line 175
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1

    .line 65
    :cond_3
    new-instance p1, Ll/ᩳܺ֫;

    const-string v0, "Platform rejected region decoding"

    .line 181
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    move-object p1, v1

    move-object v1, v3

    move-object v3, v1

    move-object v1, p1

    goto :goto_3

    :catchall_2
    move-exception p0

    move-object v3, v1

    goto :goto_3

    :catch_1
    move-exception p1

    move-object v3, v1

    .line 74
    :goto_1
    :try_start_4
    invoke-virtual {p0, v2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 75
    instance-of p0, p1, Ll/ᩴۧ֫;

    if-nez p0, :cond_5

    instance-of p0, p1, Ll/ۢ֫֫;

    if-nez p0, :cond_5

    instance-of p0, p1, Ll/ᩳܺ֫;

    if-eqz p0, :cond_4

    goto :goto_2

    .line 78
    :cond_4
    new-instance p0, Ll/ᩳܺ֫;

    const-string v0, "Platform could not open a region decoder"

    .line 182
    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    throw p0

    .line 77
    :cond_5
    :goto_2
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    if-eqz v1, :cond_6

    .line 80
    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    :cond_6
    if-eqz v3, :cond_7

    .line 81
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 82
    :cond_7
    throw p0

    .line 49
    :cond_8
    new-instance p0, Ll/ᩳܺ֫;

    const-string p1, "Image format does not support region decoding"

    .line 181
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p0

    .line 45
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Tile decoder must be opened on a worker thread"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;Ll/۟֡֫;)Ll/ۢܺ֫;
    .locals 6

    .line 88
    sget-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    invoke-static {p0, p1, v0}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۜ֫֫;)V

    iget-object v1, p1, Ll/ۡ֫֫;->۫:Ll/֨ۧܺ;

    .line 89
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-eq v2, v3, :cond_3

    .line 90
    invoke-virtual {p0}, Ll/۫ۧ֫;->ۚ()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    .line 91
    invoke-virtual {v1, v2}, Ll/֨ۧܺ;->ۙ(Z)J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 v2, 0x0

    .line 95
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۧ֫;->ۚ()Ljava/io/File;

    move-result-object v3

    iget-object v4, p1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    iget-boolean v5, p1, Ll/ۡ֫֫;->᩷:Z

    .line 96
    invoke-virtual {v0, v4, v5}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v0

    iget-wide v4, v0, Ll/ۜ֫֫;->ۙ:J

    .line 95
    invoke-static {v3, v1, v4, v5, p3}, Ll/۠ۧܺ;->ۙ(Ljava/io/File;Ll/֨ۧܺ;JLl/۟֡֫;)Ll/۠ۧܺ;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 97
    :try_start_1
    iget-object v0, p1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    invoke-virtual {p0, v0}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 98
    new-instance v0, Ll/ۢܺ֫;

    invoke-direct {v0, p0, p1, v2, v2}, Ll/ۢܺ֫;-><init>(Ll/۫ۧ֫;Ll/ۡ֫֫;Ljava/io/InputStream;Landroid/graphics/BitmapRegionDecoder;)V

    .line 99
    iput-object p3, v0, Ll/ۢܺ֫;->ۢ:Ll/۠ۧܺ;

    .line 100
    iput-object p2, v0, Ll/ۢܺ֫;->֨:Ll/ۡۚ֫;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object v0

    :catchall_0
    move-exception p0

    move-object v2, p3

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v2, :cond_0

    .line 105
    :try_start_2
    invoke-virtual {v2}, Ll/۠ۧܺ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    .line 106
    invoke-virtual {p2}, Ll/ۡۚ֫;->close()V

    throw p0

    :cond_0
    :goto_1
    invoke-virtual {p2}, Ll/ۡۚ֫;->close()V

    .line 107
    throw p0

    .line 92
    :cond_1
    new-instance p0, Ll/ᩳ֫֫;

    const-string p1, "TGA index exceeds bitmap budget"

    .line 459
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    throw p0

    .line 90
    :cond_2
    new-instance p0, Ll/ᩳܺ֫;

    const-string p1, "TGA regions require a prepared local file"

    .line 181
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 90
    throw p0

    .line 89
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "TGA decoder requires a worker"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "image/x-tga"

    .line 176
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/jpeg"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/png"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "image/webp"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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


# virtual methods
.method public final close()V
    .locals 3

    .line 162
    iget-object v0, p0, Ll/ۢܺ֫;->ܿ:Ljava/io/InputStream;

    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Ll/ۢܺ֫;->۟:Ljava/lang/Thread;

    if-ne v1, v2, :cond_7

    .line 163
    iget-boolean v1, p0, Ll/ۢܺ֫;->ܰ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 164
    iput-boolean v1, p0, Ll/ۢܺ֫;->ܰ:Z

    .line 166
    :try_start_0
    iget-object v1, p0, Ll/ۢܺ֫;->᩶:Landroid/graphics/BitmapRegionDecoder;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/BitmapRegionDecoder;->recycle()V

    .line 167
    :cond_1
    iget-object v1, p0, Ll/ۢܺ֫;->ۢ:Ll/۠ۧܺ;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/۠ۧܺ;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    :cond_2
    iget-object v1, p0, Ll/ۢܺ֫;->֨:Ll/ۡۚ֫;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ۡۚ֫;->close()V

    :cond_3
    if-eqz v0, :cond_4

    .line 170
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_4
    :goto_0
    return-void

    :catchall_0
    move-exception v1

    .line 169
    iget-object v2, p0, Ll/ۢܺ֫;->֨:Ll/ۡۚ֫;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ll/ۡۚ֫;->close()V

    :cond_5
    if-eqz v0, :cond_6

    .line 170
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 171
    :cond_6
    throw v1

    .line 157
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Tile decoder must stay on its opening worker thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Landroid/graphics/Rect;ILl/ۖۚ֫;Ll/۟֡֫;)Ll/۠֫֫;
    .locals 8

    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iget-object v1, p0, Ll/ۢܺ֫;->۟:Ljava/lang/Thread;

    if-ne v0, v1, :cond_c

    .line 119
    iget-boolean v0, p0, Ll/ۢܺ֫;->ܰ:Z

    if-nez v0, :cond_b

    .line 120
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->left:I

    if-ltz v0, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->top:I

    if-ltz v0, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget-object v1, p0, Ll/ۢܺ֫;->֡:Ll/ۡ֫֫;

    iget v2, v1, Ll/ۡ֫֫;->֫:I

    iget-object v3, v1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    if-gt v0, v2, :cond_a

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Ll/ۡ֫֫;->ۤ:I

    if-gt v0, v1, :cond_a

    if-lez p2, :cond_a

    add-int/lit8 v0, p2, -0x1

    and-int/2addr v0, p2

    if-nez v0, :cond_a

    .line 124
    iget-object v0, p0, Ll/ۢܺ֫;->ᩳ:Ll/۫ۧ֫;

    invoke-virtual {v0, v3}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 125
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-static {v1, v2, p2}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v1

    .line 126
    invoke-virtual {p3, v1, v2}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v1

    if-eqz v1, :cond_9

    const/4 v2, 0x0

    .line 131
    :try_start_0
    iget-object v4, p0, Ll/ۢܺ֫;->ۢ:Ll/۠ۧܺ;

    if-eqz v4, :cond_1

    .line 132
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-static {v4, p2}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v4

    const-wide/16 v6, 0x4

    mul-long v4, v4, v6

    invoke-virtual {p3, v4, v5}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz p3, :cond_0

    goto :goto_0

    .line 133
    :cond_0
    :try_start_1
    new-instance p1, Ll/ᩳ֫֫;

    const-string p2, "TGA row exceeds bitmap budget"

    .line 459
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 133
    throw p1

    :cond_1
    move-object p3, v2

    .line 135
    :goto_0
    iget-object v4, p0, Ll/ۢܺ֫;->ۢ:Ll/۠ۧܺ;

    if-nez v4, :cond_2

    iget-object v4, p0, Ll/ۢܺ֫;->᩶:Landroid/graphics/BitmapRegionDecoder;

    invoke-static {p2}, Ll/۬֫֫;->ۙ(I)Landroid/graphics/BitmapFactory$Options;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Landroid/graphics/BitmapRegionDecoder;->decodeRegion(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_1

    .line 136
    :cond_2
    invoke-virtual {v4, p1, p2, p4}, Ll/۠ۧܺ;->ۙ(Landroid/graphics/Rect;ILl/۟֡֫;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 137
    :goto_1
    :try_start_2
    invoke-static {p4}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V

    .line 138
    iget-object p4, p0, Ll/ۢܺ֫;->ܿ:Ljava/io/InputStream;

    instance-of v2, p4, Ll/֨֫֫;

    if-eqz v2, :cond_3

    .line 139
    check-cast p4, Ll/֨֫֫;

    invoke-virtual {p4}, Ll/֨֫֫;->ۙ()V

    .line 140
    :cond_3
    invoke-virtual {v0, v3}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    if-eqz p1, :cond_6

    .line 142
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p4

    int-to-long v2, p4

    invoke-virtual {v1, v2, v3}, Ll/ۡۚ֫;->᩷(J)Z

    move-result p4

    if-eqz p4, :cond_5

    .line 144
    new-instance p4, Ll/۠֫֫;

    invoke-direct {p4, p1, v1, p2}, Ll/۠֫֫;-><init>(Landroid/graphics/Bitmap;Ll/ۡۚ֫;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p3, :cond_4

    .line 151
    invoke-virtual {p3}, Ll/ۡۚ֫;->close()V

    :cond_4
    return-object p4

    .line 143
    :cond_5
    :try_start_3
    new-instance p2, Ll/ᩳ֫֫;

    const-string p4, "Tile allocation exceeds bitmap budget"

    .line 459
    invoke-direct {p2, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 143
    throw p2

    .line 141
    :cond_6
    new-instance p2, Ljava/io/IOException;

    const-string p4, "Image region could not be decoded"

    invoke-direct {p2, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p2

    move-object v2, p1

    move-object p1, p2

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object p3, v2

    :goto_2
    if-eqz v2, :cond_7

    .line 149
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 150
    :cond_7
    invoke-virtual {v1}, Ll/ۡۚ֫;->close()V

    if-eqz p3, :cond_8

    .line 151
    invoke-virtual {p3}, Ll/ۡۚ֫;->close()V

    .line 152
    :cond_8
    throw p1

    .line 127
    :cond_9
    new-instance p1, Ll/ᩳ֫֫;

    const-string p2, "Tile reservation exceeds bitmap budget"

    .line 459
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 127
    throw p1

    .line 123
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid region or sample size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 119
    :cond_b
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Tile decoder is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 157
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Tile decoder must stay on its opening worker thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
