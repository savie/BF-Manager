.class public final Ll/᩵᩻֫;
.super Ljava/lang/Object;
.source "G6MH"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:Ll/ۛ᩻֫;

.field public final ֨:I

.field public final ۖ:Ll/ۡۚ֫;

.field public ۟:Ll/ۡۚ֫;

.field public final ۠:I

.field public ۡ:Z

.field public final ۢ:Z

.field public ܰ:Z

.field public final ܿ:I

.field public ᩳ:Landroid/graphics/Picture;

.field public ᩶:Ll/֫ۜܺ;


# direct methods
.method public constructor <init>(Ll/֫ۜܺ;Landroid/graphics/Picture;IIILl/ۡۚ֫;Ll/ۛ᩻֫;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Ll/᩵᩻֫;->᩶:Ll/֫ۜܺ;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iput-boolean p1, p0, Ll/᩵᩻֫;->ۢ:Z

    .line 30
    iput-object p2, p0, Ll/᩵᩻֫;->ᩳ:Landroid/graphics/Picture;

    .line 31
    iput p3, p0, Ll/᩵᩻֫;->۠:I

    .line 32
    iput p4, p0, Ll/᩵᩻֫;->ܿ:I

    .line 33
    iput p5, p0, Ll/᩵᩻֫;->֨:I

    .line 34
    iput-object p6, p0, Ll/᩵᩻֫;->ۖ:Ll/ۡۚ֫;

    .line 35
    iput-object p7, p0, Ll/᩵᩻֫;->֡:Ll/ۛ᩻֫;

    return-void
.end method

.method public static ۙ(F)Z
    .locals 1

    .line 159
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ܳ()V
    .locals 2

    const/4 v0, 0x0

    .line 137
    iput-object v0, p0, Ll/᩵᩻֫;->᩶:Ll/֫ۜܺ;

    .line 138
    iget-object v1, p0, Ll/᩵᩻֫;->֡:Ll/ۛ᩻֫;

    if-eqz v1, :cond_0

    .line 139
    invoke-virtual {v1}, Ll/ۛ᩻֫;->close()V

    .line 140
    iput-object v0, p0, Ll/᩵᩻֫;->֡:Ll/ۛ᩻֫;

    .line 142
    :cond_0
    iget-object v1, p0, Ll/᩵᩻֫;->ۖ:Ll/ۡۚ֫;

    invoke-virtual {v1}, Ll/ۡۚ֫;->close()V

    .line 143
    iget-object v1, p0, Ll/᩵᩻֫;->۟:Ll/ۡۚ֫;

    if-eqz v1, :cond_1

    .line 144
    invoke-virtual {v1}, Ll/ۡۚ֫;->close()V

    .line 145
    iput-object v0, p0, Ll/᩵᩻֫;->۟:Ll/ۡۚ֫;

    :cond_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 110
    invoke-virtual {p0, v0}, Ll/᩵᩻֫;->ۙ(Ll/ۡۚ֫;)V

    return-void
.end method

.method public final ۙ(Landroid/graphics/RectF;FLl/ۖۚ֫;JLl/ܽۧ֫;)Ll/۠֫֫;
    .locals 9

    .line 156
    invoke-virtual {p6}, Ll/ܽۧ֫;->۫()Z

    move-result v0

    if-nez v0, :cond_11

    if-eqz p1, :cond_10

    .line 55
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_10

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_10

    cmpl-float v0, p2, v1

    if-lez v0, :cond_10

    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 56
    invoke-static {v0}, Ll/᩵᩻֫;->ۙ(F)Z

    move-result v0

    if-eqz v0, :cond_10

    iget v0, p1, Landroid/graphics/RectF;->top:F

    invoke-static {v0}, Ll/᩵᩻֫;->ۙ(F)Z

    move-result v0

    if-eqz v0, :cond_10

    iget v0, p1, Landroid/graphics/RectF;->right:F

    invoke-static {v0}, Ll/᩵᩻֫;->ۙ(F)Z

    move-result v0

    if-eqz v0, :cond_10

    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    invoke-static {v0}, Ll/᩵᩻֫;->ۙ(F)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 57
    invoke-static {p2}, Ll/᩵᩻֫;->ۙ(F)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 58
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v0

    float-to-double v2, v0

    float-to-double v4, p2

    mul-double v2, v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    .line 59
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p2

    float-to-double v6, p2

    mul-double v6, v6, v4

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    const-wide v6, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double p2, v2, v6

    if-gtz p2, :cond_f

    cmpl-double p2, v4, v6

    if-gtz p2, :cond_f

    double-to-int p2, v2

    const/4 v2, 0x1

    .line 62
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    double-to-int v0, v4

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    int-to-long v4, p2

    int-to-long v6, v3

    mul-long v4, v4, v6

    const-wide v6, 0x1fffffffffffffffL

    cmp-long v0, v4, v6

    if-gtz v0, :cond_e

    const-wide/16 v6, 0x4

    mul-long v4, v4, v6

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_d

    .line 66
    iget v0, p0, Ll/᩵᩻֫;->֨:I

    int-to-long v6, v0

    div-long/2addr p4, v6

    cmp-long v0, v4, p4

    if-gtz v0, :cond_d

    move-object v0, p0

    .line 69
    monitor-enter v0

    .line 70
    :try_start_0
    iget-boolean p4, p0, Ll/᩵᩻֫;->ܰ:Z

    if-nez p4, :cond_c

    iget-object p4, p0, Ll/᩵᩻֫;->᩶:Ll/֫ۜܺ;

    if-eqz p4, :cond_c

    .line 71
    iget-boolean p5, p0, Ll/᩵᩻֫;->ۡ:Z

    if-nez p5, :cond_b

    .line 72
    iput-boolean v2, p0, Ll/᩵᩻֫;->ۡ:Z

    .line 74
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 p5, 0x0

    const/4 v0, 0x0

    .line 150
    :try_start_1
    invoke-virtual {p3, v4, v5}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-eqz v6, :cond_6

    .line 79
    :try_start_2
    iget v7, p0, Ll/᩵᩻֫;->֨:I

    sub-int/2addr v7, v2

    int-to-long v7, v7

    mul-long v7, v7, v4

    .line 150
    invoke-virtual {p3, v7, v8}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-eqz p3, :cond_5

    .line 156
    :try_start_3
    invoke-virtual {p6}, Ll/ܽۧ֫;->۫()Z

    move-result v7

    if-nez v7, :cond_4

    .line 81
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p2, v3, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 82
    :try_start_4
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    int-to-float p2, p2

    .line 84
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v8

    div-float/2addr p2, v8

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result v8

    div-float/2addr v3, v8

    invoke-virtual {v0, p2, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 85
    iget p2, p1, Landroid/graphics/RectF;->left:F

    neg-float p2, p2

    iget p1, p1, Landroid/graphics/RectF;->top:F

    neg-float p1, p1

    invoke-virtual {v0, p2, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 86
    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Ll/᩵᩻֫;->۠:I

    int-to-float p2, p2

    iget v3, p0, Ll/᩵᩻֫;->ܿ:I

    int-to-float v3, v3

    invoke-direct {p1, v1, v1, p2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {p4, v0, p1}, Ll/֫ۜܺ;->ۙ(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 156
    invoke-virtual {p6}, Ll/ܽۧ֫;->۫()Z

    move-result p1

    if-nez p1, :cond_3

    move-object v0, p0

    .line 88
    monitor-enter v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 89
    :try_start_5
    iget-boolean p1, p0, Ll/᩵᩻֫;->ܰ:Z

    if-nez p1, :cond_2

    .line 90
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 91
    :try_start_6
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p1

    int-to-long p1, p1

    cmp-long p4, p1, v4

    if-gtz p4, :cond_1

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {v6, p1, p2}, Ll/ۡۚ֫;->᩷(J)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 93
    new-instance p1, Ll/۠֫֫;

    invoke-direct {p1, v7, v6, v2}, Ll/۠֫֫;-><init>(Landroid/graphics/Bitmap;Ll/ۡۚ֫;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 100
    invoke-virtual {p3}, Ll/ۡۚ֫;->close()V

    move-object v0, p0

    .line 101
    monitor-enter v0

    .line 102
    :try_start_7
    iput-boolean p5, p0, Ll/᩵᩻֫;->ۡ:Z

    .line 103
    iget-boolean p2, p0, Ll/᩵᩻֫;->ܰ:Z

    if-eqz p2, :cond_0

    invoke-direct {p0}, Ll/᩵᩻֫;->ܳ()V

    .line 104
    :cond_0
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw p1

    .line 92
    :cond_1
    :try_start_8
    new-instance p1, Ll/ᩳ֫֫;

    const-string p2, "SVG raster allocation exceeds estimate"

    .line 459
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 89
    :cond_2
    :try_start_9
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "SVG document was closed while rendering"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 90
    monitor-exit v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw p1

    .line 156
    :cond_3
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "SVG raster cancelled"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception p1

    move-object v0, v7

    goto :goto_0

    :cond_4
    :try_start_b
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "SVG raster cancelled"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :catchall_3
    move-exception p1

    goto :goto_0

    .line 151
    :cond_5
    :try_start_c
    new-instance p1, Ll/ᩳ֫֫;

    const-string p2, "SVG raster reservation exceeds budget"

    .line 459
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception p1

    move-object p3, v0

    goto :goto_0

    :cond_6
    :try_start_d
    new-instance p1, Ll/ᩳ֫֫;

    const-string p2, "SVG raster reservation exceeds budget"

    .line 459
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 151
    throw p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_5
    move-exception p1

    move-object p3, v0

    move-object v6, p3

    :goto_0
    if-eqz v0, :cond_7

    .line 98
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_7
    if-eqz v6, :cond_8

    .line 99
    invoke-virtual {v6}, Ll/ۡۚ֫;->close()V

    :cond_8
    if-eqz p3, :cond_9

    .line 100
    invoke-virtual {p3}, Ll/ۡۚ֫;->close()V

    :cond_9
    move-object v0, p0

    .line 101
    monitor-enter v0

    .line 102
    :try_start_e
    iput-boolean p5, p0, Ll/᩵᩻֫;->ۡ:Z

    .line 103
    iget-boolean p2, p0, Ll/᩵᩻֫;->ܰ:Z

    if-eqz p2, :cond_a

    invoke-direct {p0}, Ll/᩵᩻֫;->ܳ()V

    .line 104
    :cond_a
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    .line 105
    throw p1

    :catchall_6
    move-exception p1

    .line 104
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    throw p1

    .line 71
    :cond_b
    :try_start_10
    new-instance p1, Ljava/io/IOException;

    const-string p2, "SVG raster requests must be serialized"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_c
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "SVG document is closed"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_7
    move-exception p1

    .line 74
    monitor-exit v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    throw p1

    .line 67
    :cond_d
    new-instance p1, Ll/ᩳ֫֫;

    const-string p2, "SVG raster workspace exceeds budget"

    .line 459
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1

    .line 64
    :cond_e
    new-instance p1, Ljava/io/IOException;

    const-string p2, "SVG raster dimensions overflow"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 61
    :cond_f
    new-instance p1, Ljava/io/IOException;

    const-string p2, "SVG raster dimensions exceed limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 57
    :cond_10
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid SVG raster region"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 156
    :cond_11
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "SVG raster cancelled"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/ۡۚ֫;)V
    .locals 3

    move-object v0, p0

    .line 116
    monitor-enter v0

    .line 117
    :try_start_0
    iget-boolean v1, p0, Ll/᩵᩻֫;->ܰ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 118
    iput-boolean v1, p0, Ll/᩵᩻֫;->ܰ:Z

    .line 119
    iput-object p1, p0, Ll/᩵᩻֫;->۟:Ll/ۡۚ֫;

    .line 120
    iget-object p1, p0, Ll/᩵᩻֫;->ᩳ:Landroid/graphics/Picture;

    const/4 v2, 0x0

    .line 121
    iput-object v2, p0, Ll/᩵᩻֫;->ᩳ:Landroid/graphics/Picture;

    .line 123
    iget-boolean v2, p0, Ll/᩵᩻֫;->ۡ:Z

    if-nez v2, :cond_1

    if-nez p1, :cond_1

    invoke-direct {p0}, Ll/᩵᩻֫;->ܳ()V

    .line 124
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz p1, :cond_2

    .line 128
    :try_start_1
    invoke-virtual {p1, v1, v1}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    .line 129
    invoke-virtual {p1}, Landroid/graphics/Picture;->endRecording()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v0, p0

    .line 131
    monitor-enter v0

    :try_start_2
    invoke-direct {p0}, Ll/᩵᩻֫;->ܳ()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    move-object v0, p0

    monitor-enter v0

    :try_start_3
    invoke-direct {p0}, Ll/᩵᩻֫;->ܳ()V

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 132
    throw p1

    :catchall_2
    move-exception p1

    .line 131
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    :cond_2
    return-void

    :catchall_3
    move-exception p1

    .line 124
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p1
.end method

.method public final ۙ()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Ll/᩵᩻֫;->ۢ:Z

    return v0
.end method

.method public final ۙ(Landroid/graphics/Canvas;)Z
    .locals 2

    .line 47
    iget-object v0, p0, Ll/᩵᩻֫;->ᩳ:Landroid/graphics/Picture;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Ll/᩵᩻֫;->ܰ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final declared-synchronized ۤ()J
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v1, p0, Ll/᩵᩻֫;->ۖ:Ll/ۡۚ֫;

    invoke-virtual {v1}, Ll/ۡۚ֫;->ۙ()J

    move-result-wide v1

    iget-object v3, p0, Ll/᩵᩻֫;->֡:Ll/ۛ᩻֫;

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ll/ۛ᩻֫;->ۙ()J

    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    add-long/2addr v1, v3

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩷()I
    .locals 1

    .line 39
    iget v0, p0, Ll/᩵᩻֫;->֨:I

    return v0
.end method
