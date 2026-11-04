.class public final Ll/۬֫֫;
.super Ljava/lang/Object;
.source "Q6MT"


# instance fields
.field public final ۙ:Ll/ۜ֫֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    sget-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/۬֫֫;->ۙ:Ll/ۜ֫֫;

    return-void
.end method

.method public static ۙ(II)J
    .locals 4

    int-to-long v0, p0

    int-to-long p0, p1

    add-long/2addr v0, p0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    .line 207
    div-long/2addr v0, p0

    return-wide v0
.end method

.method public static ۙ(III)J
    .locals 2

    .line 211
    invoke-static {p0, p2}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v0

    invoke-static {p1, p2}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide p0

    mul-long v0, v0, p0

    const-wide/16 p0, 0x4

    mul-long v0, v0, p0

    return-wide v0
.end method

.method public static ۙ(Ll/۫ۧ֫;Landroid/graphics/BitmapFactory$Options;Ll/ۜ֫֫;)Landroid/graphics/Bitmap;
    .locals 4

    .line 168
    invoke-virtual {p0}, Ll/۫ۧ֫;->ۚ()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 170
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۧ֫;->᩹()Ljava/io/InputStream;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    :try_start_1
    instance-of v0, p0, Ljava/io/FileInputStream;

    if-eqz v0, :cond_0

    .line 173
    move-object v0, p0

    check-cast v0, Ljava/io/FileInputStream;

    invoke-static {v0}, Ll/᩻ۗ᩹;->ۙ(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v2

    invoke-static {v2, v3, p2}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 174
    move-object p2, p0

    check-cast p2, Ljava/io/FileInputStream;

    invoke-virtual {p2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object p2

    invoke-static {p2, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    .line 171
    :cond_0
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Local source requires a file stream"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 170
    :try_start_4
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_5
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    :goto_1
    if-eqz v1, :cond_2

    .line 178
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 179
    :cond_2
    throw p0

    .line 183
    :cond_3
    :try_start_6
    invoke-static {p0, p2}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_3

    .line 184
    :try_start_7
    invoke-static {p0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 185
    invoke-virtual {p0}, Ll/֨֫֫;->ۙ()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 187
    :try_start_8
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_4
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_3

    return-object v1

    :catchall_2
    move-exception p1

    .line 183
    :try_start_9
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p0

    :try_start_a
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_4
    .catch Ljava/lang/Error; {:try_start_a .. :try_end_a} :catch_3

    :catch_3
    move-exception p0

    goto :goto_3

    :catch_4
    move-exception p0

    goto :goto_3

    :catch_5
    move-exception p0

    :goto_3
    if-eqz v1, :cond_4

    .line 188
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 189
    :cond_4
    throw p0
.end method

.method public static ۙ(I)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 157
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 158
    iput p0, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 159
    sget-object p0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object p0, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 p0, 0x0

    .line 160
    iput-boolean p0, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 161
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt p0, v1, :cond_0

    sget-object p0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p0

    iput-object p0, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    :cond_0
    return-object v0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;
    .locals 3

    .line 194
    invoke-virtual {p0}, Ll/۫ۧ֫;->᩹()Ljava/io/InputStream;

    move-result-object p0

    .line 197
    :try_start_0
    instance-of v0, p0, Ljava/io/FileInputStream;

    if-eqz v0, :cond_0

    .line 198
    move-object v0, p0

    check-cast v0, Ljava/io/FileInputStream;

    invoke-static {v0}, Ll/᩻ۗ᩹;->ۙ(Ljava/io/FileInputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 199
    :cond_0
    new-instance v0, Ll/֨֫֫;

    iget-wide v1, p1, Ll/ۜ֫֫;->ۙ:J

    invoke-direct {v0, v1, v2, p0}, Ll/֨֫֫;-><init>(JLjava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 201
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3

    goto :goto_1

    :catch_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 202
    :goto_1
    throw p1
.end method

.method public static ۙ(Ll/۠֫֫;Ll/ۡۚ֫;J)Ll/۠֫֫;
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 390
    :goto_0
    iget-object v2, p0, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-static {v3, v4, v1}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v3

    cmp-long v5, v3, p2

    if-lez v5, :cond_0

    mul-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_1

    .line 391
    invoke-virtual {p1}, Ll/ۡۚ֫;->close()V

    invoke-virtual {p0}, Ll/۠֫֫;->۠᩷()Ll/۠֫֫;

    move-result-object p0

    return-object p0

    .line 392
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    invoke-static {p2, v1}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide p2

    long-to-int p3, p2

    .line 393
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    invoke-static {p2, v1}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v3

    long-to-int p2, v3

    .line 396
    :try_start_0
    invoke-static {v2, p3, p2, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 397
    :try_start_1
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p3

    int-to-long v2, p3

    invoke-virtual {p1, v2, v3}, Ll/ۡۚ֫;->᩷(J)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 398
    new-instance p3, Ll/۠֫֫;

    iget p0, p0, Ll/۠֫֫;->۟:I

    mul-int p0, p0, v1

    invoke-direct {p3, p2, p1, p0}, Ll/۠֫֫;-><init>(Landroid/graphics/Bitmap;Ll/ۡۚ֫;I)V

    return-object p3

    .line 397
    :cond_2
    new-instance p0, Ll/ᩳ֫֫;

    const-string p3, "Scaled preview exceeded its budget"

    .line 459
    invoke-direct {p0, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 397
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_3

    .line 402
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    .line 403
    :cond_3
    invoke-virtual {p1}, Ll/ۡۚ֫;->close()V

    .line 404
    throw p0
.end method

.method public static ۙ(JLl/ۜ֫֫;)V
    .locals 2

    .line 153
    iget-wide v0, p2, Ll/ۜ֫֫;->ۙ:J

    cmp-long p2, p0, v0

    if-gtz p2, :cond_0

    return-void

    :cond_0
    new-instance p0, Ll/ۢ֫֫;

    const-string p1, "Image input exceeds byte limit"

    .line 454
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 153
    throw p0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۜ֫֫;)V
    .locals 4

    .line 144
    iget-object v0, p1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    iget-object v1, p1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    iget-boolean v2, p1, Ll/ۡ֫֫;->᩷:Z

    invoke-virtual {p2, v0, v2}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object p2

    .line 145
    invoke-virtual {p0}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Ll/ۡ֫֫;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 147
    iget v0, p1, Ll/ۡ֫֫;->֫:I

    iget p1, p1, Ll/ۡ֫֫;->ۤ:I

    invoke-virtual {p2, v0, p1}, Ll/ۜ֫֫;->ۙ(II)V

    .line 148
    iget-wide v2, v1, Ll/ܳۧ֫;->ۤ:J

    invoke-static {v2, v3, p2}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 149
    invoke-virtual {p0, v1}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    return-void

    .line 146
    :cond_0
    new-instance p0, Ll/ᩴۧ֫;

    const-string p1, "Metadata belongs to another image source"

    .line 175
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 146
    throw p0
.end method

.method public static ۙ(Ljava/io/InputStream;)Z
    .locals 13

    .line 231
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xff

    if-ne v0, v2, :cond_19

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/16 v3, 0xd8

    if-eq v0, v3, :cond_0

    goto/16 :goto_8

    :cond_0
    const/16 v0, 0x1000

    new-array v3, v0, [B

    const v4, 0xffffe

    const/4 v5, 0x0

    :cond_1
    :goto_0
    const/4 v6, 0x4

    if-lt v4, v6, :cond_19

    .line 236
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v7

    if-eq v7, v2, :cond_2

    goto/16 :goto_8

    :cond_2
    add-int/lit8 v4, v4, -0x1

    :goto_1
    add-int/lit8 v7, v4, -0x1

    if-gtz v4, :cond_3

    goto/16 :goto_8

    .line 241
    :cond_3
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v8

    if-eq v8, v2, :cond_18

    const/4 v9, 0x2

    if-lt v7, v9, :cond_19

    if-gez v8, :cond_4

    goto/16 :goto_8

    :cond_4
    const/16 v7, 0xda

    const/16 v9, 0xc0

    if-eq v8, v9, :cond_5

    if-eq v8, v7, :cond_5

    const/16 v10, 0xc4

    if-eq v8, v10, :cond_5

    const/16 v10, 0xdb

    if-eq v8, v10, :cond_5

    const/16 v10, 0xdd

    if-eq v8, v10, :cond_5

    const/16 v10, 0xfe

    if-eq v8, v10, :cond_5

    const/16 v10, 0xe0

    if-lt v8, v10, :cond_19

    const/16 v10, 0xef

    if-le v8, v10, :cond_5

    goto/16 :goto_8

    .line 247
    :cond_5
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v10

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v11

    if-ltz v10, :cond_19

    if-gez v11, :cond_6

    goto/16 :goto_8

    :cond_6
    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v10, v11

    add-int/lit8 v11, v10, -0x2

    add-int/lit8 v4, v4, -0x3

    if-ltz v11, :cond_19

    if-le v11, v4, :cond_7

    goto/16 :goto_8

    :cond_7
    sub-int/2addr v4, v11

    if-eq v8, v9, :cond_a

    if-ne v8, v7, :cond_8

    goto :goto_3

    :cond_8
    :goto_2
    if-lez v11, :cond_1

    .line 281
    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 282
    invoke-static {p0, v3, v6}, Ll/۬֫֫;->ۙ(Ljava/io/InputStream;[BI)Z

    move-result v7

    if-nez v7, :cond_9

    goto/16 :goto_8

    :cond_9
    sub-int/2addr v11, v6

    goto :goto_2

    :cond_a
    :goto_3
    if-gt v11, v0, :cond_19

    .line 254
    invoke-static {p0, v3, v11}, Ll/۬֫֫;->ۙ(Ljava/io/InputStream;[BI)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_8

    :cond_b
    const/4 v7, 0x3

    const/4 v12, 0x1

    if-ne v8, v9, :cond_12

    if-nez v5, :cond_19

    const/4 v5, 0x6

    if-lt v11, v5, :cond_19

    .line 256
    aget-byte v6, v3, v1

    const/16 v8, 0x8

    if-eq v6, v8, :cond_c

    goto/16 :goto_8

    :cond_c
    const/4 v6, 0x5

    .line 257
    aget-byte v6, v3, v6

    and-int/2addr v6, v2

    if-eq v6, v12, :cond_d

    if-ne v6, v7, :cond_19

    :cond_d
    mul-int/lit8 v7, v6, 0x3

    add-int/2addr v7, v5

    if-eq v11, v7, :cond_e

    goto/16 :goto_8

    .line 259
    :cond_e
    new-array v7, v6, [I

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v6, :cond_11

    mul-int/lit8 v9, v8, 0x3

    add-int/2addr v9, v5

    .line 261
    aget-byte v9, v3, v9

    and-int/2addr v9, v2

    aput v9, v7, v8

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_10

    .line 262
    aget v10, v7, v9

    aget v11, v7, v8

    if-ne v10, v11, :cond_f

    goto :goto_8

    :cond_f
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_10
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_11
    move-object v5, v7

    goto/16 :goto_0

    :cond_12
    if-eqz v5, :cond_19

    .line 265
    array-length p0, v5

    mul-int/lit8 p0, p0, 0x2

    add-int/2addr p0, v6

    if-ne v11, p0, :cond_19

    aget-byte p0, v3, v1

    and-int/2addr p0, v2

    array-length v0, v5

    if-eq p0, v0, :cond_13

    goto :goto_8

    :cond_13
    const/4 p0, 0x0

    const/4 v0, 0x0

    .line 269
    :goto_6
    array-length v4, v5

    if-ge p0, v4, :cond_17

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 271
    :goto_7
    array-length v8, v5

    if-ge v4, v8, :cond_15

    mul-int/lit8 v8, p0, 0x2

    add-int/2addr v8, v12

    .line 272
    aget-byte v8, v3, v8

    and-int/2addr v8, v2

    aget v9, v5, v4

    if-ne v8, v9, :cond_14

    shl-int v6, v12, v4

    :cond_14
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_15
    if-eqz v6, :cond_19

    and-int v4, v0, v6

    if-eqz v4, :cond_16

    goto :goto_8

    :cond_16
    or-int/2addr v0, v6

    add-int/lit8 p0, p0, 0x1

    goto :goto_6

    :cond_17
    add-int/lit8 p0, v10, -0x5

    .line 276
    aget-byte p0, v3, p0

    if-nez p0, :cond_19

    add-int/lit8 p0, v10, -0x4

    aget-byte p0, v3, p0

    const/16 v0, 0x3f

    if-ne p0, v0, :cond_19

    sub-int/2addr v10, v7

    aget-byte p0, v3, v10

    if-nez p0, :cond_19

    return v12

    :cond_18
    move v4, v7

    goto/16 :goto_1

    :cond_19
    :goto_8
    return v1
.end method

.method public static ۙ(Ljava/io/InputStream;[BI)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    sub-int v2, p2, v1

    .line 293
    invoke-virtual {p0, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_1

    :cond_0
    if-nez v2, :cond_2

    .line 296
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    if-gez v2, :cond_1

    :goto_1
    return v0

    :cond_1
    add-int/lit8 v3, v1, 0x1

    int-to-byte v2, v2

    .line 298
    aput-byte v2, p1, v1

    move v1, v3

    goto :goto_0

    :cond_2
    add-int/2addr v1, v2

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method

.method public static ᩷(Ll/۫ۧ֫;Ll/ۜ֫֫;)Landroid/graphics/BitmapFactory$Options;
    .locals 2

    .line 223
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    .line 224
    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 225
    invoke-static {p0, v0, p1}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Landroid/graphics/BitmapFactory$Options;Ll/ۜ֫֫;)Landroid/graphics/Bitmap;

    return-object v0
.end method


# virtual methods
.method public final ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;J)Ll/۠֫֫;
    .locals 18

    move-object/from16 v0, p2

    move-wide/from16 v4, p4

    const-wide/16 v1, 0x0

    cmp-long v3, v4, v1

    if-lez v3, :cond_d

    .line 100
    iget-object v1, v0, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    iget-object v2, v0, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    iget v3, v0, Ll/ۡ֫֫;->ۤ:I

    iget v6, v0, Ll/ۡ֫֫;->֫:I

    iget-boolean v7, v0, Ll/ۡ֫֫;->᩷:Z

    move-object/from16 v9, p0

    iget-object v8, v9, Ll/۬֫֫;->ۙ:Ll/ۜ֫֫;

    invoke-virtual {v8, v1, v7}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v8

    move-object/from16 v1, p1

    .line 101
    invoke-static {v1, v0, v8}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۜ֫֫;)V

    .line 102
    iget-object v7, v0, Ll/ۡ֫֫;->۫:Ll/֨ۧܺ;

    if-eqz v7, :cond_0

    new-instance v7, Ll/۠ܶ᩸;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    invoke-static/range {v1 .. v8}, Ll/᩶᩻֫;->ۙ(Ll/۫ۧ֫;Ll/ۡ֫֫;Ll/ۖۚ֫;JLl/ۢܺ֫;Ll/۟֡֫;Ll/ۜ֫֫;)Ll/۠֫֫;

    move-result-object v0

    return-object v0

    .line 103
    :cond_0
    invoke-virtual/range {p3 .. p3}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v10

    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    const/4 v0, 0x1

    move-object v7, v1

    :goto_0
    if-lez v0, :cond_c

    .line 106
    invoke-static {v6, v0}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v10

    .line 107
    invoke-static {v3, v0}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v12

    .line 108
    invoke-static {v6, v3, v0}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v14

    const/16 v1, 0x800

    move-object/from16 v16, v8

    int-to-long v8, v1

    const/high16 v1, 0x40000000    # 2.0f

    cmp-long v17, v10, v8

    if-gtz v17, :cond_9

    cmp-long v17, v12, v8

    if-gtz v17, :cond_9

    mul-long v10, v10, v12

    const-wide/32 v8, 0x400000

    cmp-long v12, v10, v8

    if-gtz v12, :cond_9

    cmp-long v10, v14, v4

    if-lez v10, :cond_1

    goto/16 :goto_3

    :cond_1
    move-object/from16 v10, p3

    .line 114
    invoke-virtual {v10, v14, v15}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v11

    if-nez v11, :cond_4

    .line 215
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v8

    if-ge v0, v8, :cond_3

    if-lt v0, v1, :cond_2

    goto :goto_1

    :cond_2
    mul-int/lit8 v0, v0, 0x2

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    move-object v15, v2

    goto/16 :goto_6

    :cond_4
    const/4 v12, 0x0

    .line 121
    :try_start_0
    invoke-virtual {v7, v2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 122
    invoke-static {v0}, Ll/۬֫֫;->ۙ(I)Landroid/graphics/BitmapFactory$Options;

    move-result-object v13

    move-object/from16 v14, v16

    invoke-static {v7, v13, v14}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Landroid/graphics/BitmapFactory$Options;Ll/ۜ֫֫;)Landroid/graphics/Bitmap;

    move-result-object v12

    .line 123
    invoke-virtual {v7, v2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    if-eqz v12, :cond_7

    .line 125
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v7

    move-object v13, v2

    int-to-long v1, v7

    .line 126
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    const/16 v15, 0x800

    if-gt v7, v15, :cond_5

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    if-gt v7, v15, :cond_5

    .line 127
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-long v8, v7

    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    move-object v15, v13

    move-object/from16 v16, v14

    int-to-long v13, v7

    mul-long v8, v8, v13

    const-wide/32 v13, 0x400000

    cmp-long v7, v8, v13

    if-gtz v7, :cond_6

    cmp-long v7, v1, v4

    if-gtz v7, :cond_6

    .line 128
    invoke-virtual {v11, v1, v2}, Ll/ۡۚ֫;->᩷(J)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 129
    new-instance v1, Ll/۠֫֫;

    invoke-direct {v1, v12, v11, v0}, Ll/۠֫֫;-><init>(Landroid/graphics/Bitmap;Ll/ۡۚ֫;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :cond_5
    move-object v15, v13

    move-object/from16 v16, v14

    .line 135
    :cond_6
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 136
    invoke-virtual {v11}, Ll/ۡۚ֫;->close()V

    .line 215
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v0, v1, :cond_b

    const/high16 v1, 0x40000000    # 2.0f

    if-lt v0, v1, :cond_a

    goto :goto_4

    .line 124
    :cond_7
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image preview could not be decoded"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v12, :cond_8

    .line 135
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 136
    :cond_8
    invoke-virtual {v11}, Ll/ۡۚ֫;->close()V

    .line 137
    throw v0

    :cond_9
    :goto_3
    move-object/from16 v10, p3

    move-object v15, v2

    .line 215
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ge v0, v1, :cond_b

    const/high16 v1, 0x40000000    # 2.0f

    if-lt v0, v1, :cond_a

    goto :goto_4

    :cond_a
    mul-int/lit8 v0, v0, 0x2

    goto :goto_5

    :cond_b
    :goto_4
    const/4 v0, 0x0

    :goto_5
    move-object/from16 v7, p1

    :goto_6
    move-object/from16 v9, p0

    move-object/from16 v1, p1

    move-object v2, v15

    move-object/from16 v8, v16

    goto/16 :goto_0

    .line 140
    :cond_c
    new-instance v0, Ll/ᩳ֫֫;

    const-string v1, "No safe preview allocation fits the bitmap budget"

    .line 459
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 140
    throw v0

    .line 99
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Preview byte limit must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ll/۫ۧ֫;Ll/ܳۧ֫;Ll/۟۠ۚ;)Ll/ۡ֫֫;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    .line 41
    invoke-virtual/range {p1 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    move-object/from16 v2, p0

    .line 42
    iget-object v3, v2, Ll/۬֫֫;->ۙ:Ll/ۜ֫֫;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    sget-object v4, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    if-ne v3, v4, :cond_0

    sget-object v4, Ll/ۜ֫֫;->᩸:Ll/ۜ֫֫;

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    move-object/from16 v11, p2

    .line 43
    iget-wide v5, v11, Ll/ܳۧ֫;->ۤ:J

    invoke-static {v5, v6, v4}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 44
    iget-boolean v7, v1, Ll/۟۠ۚ;->᩸:Z

    .line 45
    iget-object v8, v1, Ll/۟۠ۚ;->ۤ:Ljava/lang/String;

    const-string v9, "image/jpeg"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 46
    invoke-static {v0, v4}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object v4

    .line 47
    :try_start_0
    invoke-static {v4}, Ll/۬֫֫;->ۙ(Ljava/io/InputStream;)Z

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    .line 49
    invoke-virtual/range {p1 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 46
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1

    .line 52
    :cond_1
    :goto_2
    invoke-virtual {v3, v8, v7}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v4

    .line 53
    iget-object v10, v1, Ll/۟۠ۚ;->᩷:Ll/֡۠ۚ;

    sget-object v12, Ll/֡۠ۚ;->ᩳ:Ll/֡۠ۚ;

    const/4 v13, 0x0

    if-ne v10, v12, :cond_2

    const-string v1, "image/x-tga"

    .line 54
    invoke-virtual {v3, v1, v13}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v1

    .line 55
    invoke-static {v5, v6, v1}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 56
    invoke-static {v0, v1}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object v3

    .line 57
    :try_start_2
    iget-wide v4, v1, Ll/ۜ֫֫;->᩷:J

    invoke-static {v4, v5, v3}, Ll/۠ۧܺ;->ۙ(JLjava/io/InputStream;)Ll/֨ۧܺ;

    move-result-object v14

    .line 58
    invoke-virtual {v3}, Ll/֨֫֫;->ۙ()V

    .line 59
    iget v4, v14, Ll/֨ۧܺ;->ܽ:I

    iget v5, v14, Ll/֨ۧܺ;->᩸:I

    invoke-virtual {v1, v4, v5}, Ll/ۜ֫֫;->ۙ(II)V

    .line 60
    invoke-virtual/range {p1 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 61
    new-instance v1, Ll/ۡ֫֫;

    invoke-virtual/range {p1 .. p1}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v6

    iget v7, v14, Ll/֨ۧܺ;->ܽ:I

    iget v8, v14, Ll/֨ۧܺ;->᩸:I

    const-string v10, "image/x-tga"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v9, 0x1

    const-wide/16 v12, -0x1

    move-object v5, v1

    move-object/from16 v11, p2

    invoke-direct/range {v5 .. v16}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;JLl/֨ۧܺ;ZI)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 62
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    return-object v1

    :catchall_2
    move-exception v0

    move-object v1, v0

    .line 56
    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1

    .line 64
    :cond_2
    invoke-static {v5, v6, v4}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 65
    iget-object v1, v1, Ll/۟۠ۚ;->ۙ:Landroid/graphics/BitmapFactory$Options;

    if-nez v1, :cond_3

    invoke-static {v0, v4}, Ll/۬֫֫;->᩷(Ll/۫ۧ֫;Ll/ۜ֫֫;)Landroid/graphics/BitmapFactory$Options;

    move-result-object v1

    .line 66
    :cond_3
    invoke-virtual/range {p1 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 67
    iget-object v4, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    invoke-static {v8, v4}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    and-int v15, v7, v4

    .line 68
    iget-object v4, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    invoke-virtual {v3, v4, v15}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v3

    .line 69
    invoke-static {v5, v6, v3}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 70
    iget v4, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v5, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-virtual {v3, v4, v5}, Ll/ۜ֫֫;->ۙ(II)V

    .line 73
    iget-object v4, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    .line 219
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x1

    const-wide/16 v7, -0x1

    if-nez v5, :cond_5

    const-string v5, "image/png"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    const-string v5, "image/webp"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    const/4 v3, 0x1

    move-wide v12, v7

    const/4 v9, 0x1

    goto :goto_6

    .line 74
    :cond_5
    :goto_4
    invoke-static {v0, v3}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object v3

    .line 76
    :try_start_4
    new-instance v4, Ll/۠ᩴۙ;

    .line 4166
    invoke-direct {v4, v3, v13}, Ll/۠ᩴۙ;-><init>(Ljava/io/InputStream;I)V

    const-string v5, "Orientation"

    .line 77
    invoke-virtual {v4, v6, v5}, Ll/۠ᩴۙ;->ۙ(ILjava/lang/String;)I

    move-result v5
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-lt v5, v6, :cond_6

    const/16 v9, 0x8

    if-gt v5, v9, :cond_6

    move v6, v5

    .line 80
    :cond_6
    :try_start_5
    invoke-static {v4}, Ll/ܳ᩻ܺ;->ۙ(Ll/۠ᩴۙ;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_7

    .line 81
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    move-object v1, v0

    goto :goto_7

    .line 88
    :catch_0
    :cond_7
    :goto_5
    :try_start_6
    invoke-virtual {v3}, Ll/֨֫֫;->ۙ()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 89
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    .line 90
    invoke-virtual/range {p1 .. p2}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    move v9, v6

    move-wide v12, v7

    .line 92
    :goto_6
    new-instance v3, Ll/ۡ֫֫;

    invoke-virtual/range {p1 .. p1}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v6

    iget v7, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v8, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget-object v10, v1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v5, v3

    move-object/from16 v11, p2

    invoke-direct/range {v5 .. v16}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;JLl/֨ۧܺ;ZI)V

    return-object v3

    .line 74
    :goto_7
    :try_start_7
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_8

    :catchall_5
    move-exception v0

    move-object v3, v0

    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
.end method
