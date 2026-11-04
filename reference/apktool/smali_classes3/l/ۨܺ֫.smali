.class public final Ll/ۨܺ֫;
.super Ljava/lang/Object;
.source "H6IQ"


# direct methods
.method public static ۙ(Ljava/io/DataInputStream;)[B
    .locals 5

    .line 30
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    const v1, 0xffd8

    if-ne v0, v1, :cond_8

    .line 32
    :cond_0
    :goto_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    const/16 v1, 0xff

    if-ne v0, v1, :cond_7

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    if-eq v0, v1, :cond_1

    const/16 v1, 0xda

    if-eq v0, v1, :cond_6

    const/16 v1, 0xd9

    if-ne v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/16 v2, 0xd0

    if-lt v0, v2, :cond_3

    const/16 v2, 0xd7

    if-gt v0, v2, :cond_3

    goto :goto_0

    .line 37
    :cond_3
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    add-int/lit8 v3, v2, -0x2

    if-ltz v3, :cond_5

    const/16 v4, 0xe1

    if-ne v0, v4, :cond_4

    const/4 v0, 0x6

    if-lt v3, v0, :cond_4

    new-array v0, v0, [B

    .line 41
    invoke-virtual {p0, v0}, Ljava/io/DataInputStream;->readFully([B)V

    add-int/lit8 v3, v2, -0x8

    const/4 v2, 0x0

    .line 43
    aget-byte v2, v0, v2

    const/16 v4, 0x45

    if-ne v2, v4, :cond_4

    aget-byte v1, v0, v1

    const/16 v2, 0x78

    if-ne v1, v2, :cond_4

    const/4 v1, 0x2

    aget-byte v1, v0, v1

    const/16 v2, 0x69

    if-ne v1, v2, :cond_4

    const/4 v1, 0x3

    aget-byte v1, v0, v1

    const/16 v2, 0x66

    if-ne v1, v2, :cond_4

    const/4 v1, 0x4

    aget-byte v1, v0, v1

    if-nez v1, :cond_4

    const/4 v1, 0x5

    aget-byte v0, v0, v1

    if-nez v0, :cond_4

    int-to-long v0, v3

    .line 45
    invoke-static {p0, v0, v1}, Ll/ۨܺ֫;->ۙ(Ljava/io/DataInputStream;J)[B

    move-result-object p0

    return-object p0

    :cond_4
    int-to-long v0, v3

    .line 47
    invoke-static {p0, v0, v1}, Ll/ۨܺ֫;->᩷(Ljava/io/DataInputStream;J)V

    goto :goto_0

    .line 38
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid JPEG segment size"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :goto_1
    const/4 p0, 0x0

    return-object p0

    .line 32
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid JPEG marker"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 30
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid JPEG signature"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ljava/io/DataInputStream;J)[B
    .locals 3

    const-wide/16 v0, 0x8

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const-wide/32 v0, 0x200000

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    long-to-int p2, p1

    .line 88
    new-array p1, p2, [B

    .line 89
    invoke-virtual {p0, p1}, Ljava/io/DataInputStream;->readFully([B)V

    return-object p1

    .line 87
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid EXIF block size"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ljava/lang/String;Ll/۟ۧ֫;)[B
    .locals 3

    .line 20
    new-instance v0, Ljava/io/DataInputStream;

    new-instance v1, Ljava/io/BufferedInputStream;

    new-instance v2, Ll/᩵ܺ֫;

    .line 21
    invoke-virtual {p0}, Ll/۫ۧ֫;->᩹()Ljava/io/InputStream;

    move-result-object p0

    invoke-direct {v2, p0, p2}, Ll/᩵ܺ֫;-><init>(Ljava/io/InputStream;Ll/۟ۧ֫;)V

    const/16 p0, 0x4000

    invoke-direct {v1, v2, p0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    const-string p0, "image/jpeg"

    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {v0}, Ll/ۨܺ֫;->ۙ(Ljava/io/DataInputStream;)[B

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p0

    :cond_0
    :try_start_1
    const-string p0, "image/png"

    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {v0}, Ll/ۨܺ֫;->᩷(Ljava/io/DataInputStream;)[B

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p0

    :cond_1
    :try_start_2
    const-string p0, "image/webp"

    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-static {v0}, Ll/ۨܺ֫;->ۤ(Ljava/io/DataInputStream;)[B

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-object p0

    .line 25
    :cond_2
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported EXIF container"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    .line 20
    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static ۙ([B)[B
    .locals 24

    move-object/from16 v0, p0

    .line 97
    array-length v1, v0

    const/16 v2, 0x66

    const/4 v3, 0x3

    const/16 v4, 0x69

    const/16 v5, 0x78

    const/16 v6, 0x45

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x6

    if-lt v1, v10, :cond_0

    aget-byte v1, v0, v9

    if-ne v1, v6, :cond_0

    aget-byte v1, v0, v8

    if-ne v1, v5, :cond_0

    aget-byte v1, v0, v7

    if-ne v1, v4, :cond_0

    aget-byte v1, v0, v3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x4

    aget-byte v1, v0, v1

    if-nez v1, :cond_0

    const/4 v1, 0x5

    aget-byte v1, v0, v1

    if-nez v1, :cond_0

    const/4 v1, 0x6

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 98
    :goto_0
    array-length v2, v0

    sub-int/2addr v2, v1

    const/16 v3, 0x8

    if-lt v2, v3, :cond_a

    .line 99
    aget-byte v2, v0, v1

    const/16 v3, 0x49

    if-ne v2, v3, :cond_1

    add-int/lit8 v11, v1, 0x1

    aget-byte v11, v0, v11

    if-ne v11, v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const/16 v11, 0x4d

    if-ne v2, v11, :cond_2

    add-int/lit8 v2, v1, 0x1

    .line 100
    aget-byte v2, v0, v2

    if-ne v2, v11, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-nez v3, :cond_4

    if-eqz v2, :cond_3

    goto :goto_3

    .line 101
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid TIFF byte order"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    add-int/lit8 v3, v1, 0x2

    .line 102
    invoke-static {v3, v0}, Ll/ۜۚܺ;->ۤ(I[B)I

    move-result v3

    add-int/lit8 v11, v1, 0x4

    .line 18
    invoke-static {v11, v0}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v11

    int-to-long v11, v11

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    const v15, 0xffff

    if-eqz v2, :cond_5

    int-to-short v3, v3

    .line 105
    invoke-static {v3}, Ljava/lang/Short;->reverseBytes(S)S

    move-result v3

    and-int/2addr v3, v15

    long-to-int v12, v11

    .line 106
    invoke-static {v12}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v11

    int-to-long v11, v11

    and-long/2addr v11, v13

    :cond_5
    const/16 v13, 0x2a

    if-ne v3, v13, :cond_9

    const-wide/16 v13, 0x8

    cmp-long v3, v11, v13

    if-ltz v3, :cond_9

    .line 108
    array-length v3, v0

    sub-int/2addr v3, v1

    sub-int/2addr v3, v7

    int-to-long v13, v3

    cmp-long v3, v11, v13

    if-gtz v3, :cond_9

    long-to-int v3, v11

    add-int/2addr v3, v1

    .line 110
    invoke-static {v3, v0}, Ll/ۜۚܺ;->ۤ(I[B)I

    move-result v3

    if-eqz v2, :cond_6

    int-to-short v2, v3

    .line 111
    invoke-static {v2}, Ljava/lang/Short;->reverseBytes(S)S

    move-result v2

    and-int v3, v2, v15

    :cond_6
    const-wide/16 v13, 0x2

    add-long v20, v11, v13

    int-to-long v2, v3

    const-wide/16 v18, 0xc

    const-wide/16 v22, 0x4

    move-wide/from16 v16, v2

    .line 112
    invoke-static/range {v16 .. v23}, Ll/ۧ᩺᩻;->ۙ(JJJJ)J

    move-result-wide v2

    array-length v11, v0

    sub-int/2addr v11, v1

    int-to-long v11, v11

    cmp-long v13, v2, v11

    if-gtz v13, :cond_8

    if-eqz v1, :cond_7

    return-object v0

    .line 115
    :cond_7
    array-length v1, v0

    add-int/2addr v1, v10

    new-array v1, v1, [B

    .line 116
    aput-byte v6, v1, v9

    aput-byte v5, v1, v8

    aput-byte v4, v1, v7

    const/16 v2, 0x66

    const/4 v3, 0x3

    aput-byte v2, v1, v3

    .line 117
    array-length v2, v0

    invoke-static {v0, v9, v1, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    .line 113
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated TIFF directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid TIFF directory offset"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated TIFF header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۤ(Ljava/io/DataInputStream;)[B
    .locals 17

    move-object/from16 v0, p0

    .line 70
    invoke-virtual/range {p0 .. p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    const v2, 0x52494646

    if-ne v1, v2, :cond_5

    .line 71
    invoke-virtual/range {p0 .. p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const-wide/16 v5, 0x4

    sub-long/2addr v1, v5

    .line 72
    invoke-virtual/range {p0 .. p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v5

    const v6, 0x57454250

    if-ne v5, v6, :cond_4

    const-wide/16 v5, 0x0

    cmp-long v7, v1, v5

    if-ltz v7, :cond_4

    :goto_0
    const-wide/16 v7, 0x8

    cmp-long v9, v1, v7

    if-ltz v9, :cond_2

    .line 74
    invoke-virtual/range {p0 .. p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v9

    .line 75
    invoke-virtual/range {p0 .. p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v10

    int-to-long v10, v10

    and-long v12, v10, v3

    const-wide/16 v14, 0x1

    and-long/2addr v10, v14

    add-long/2addr v10, v12

    sub-long v14, v1, v7

    cmp-long v16, v10, v14

    if-gtz v16, :cond_1

    const v14, 0x45584946

    if-ne v9, v14, :cond_0

    .line 78
    invoke-static {v0, v12, v13}, Ll/ۨܺ֫;->ۙ(Ljava/io/DataInputStream;J)[B

    move-result-object v0

    return-object v0

    .line 79
    :cond_0
    invoke-static {v0, v10, v11}, Ll/ۨܺ֫;->᩷(Ljava/io/DataInputStream;J)V

    add-long/2addr v10, v7

    sub-long/2addr v1, v10

    goto :goto_0

    .line 77
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WebP chunk size"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    cmp-long v0, v1, v5

    if-nez v0, :cond_3

    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WebP chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 72
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WebP header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WebP signature"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ᩷(Ljava/io/DataInputStream;J)V
    .locals 7

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_3

    const-wide/16 v2, 0x1

    cmp-long v4, p1, v2

    if-lez v4, :cond_0

    sub-long v4, p1, v2

    .line 124
    invoke-virtual {p0, v4, v5}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v4

    goto :goto_1

    :cond_0
    move-wide v4, v0

    :goto_1
    cmp-long v6, v4, v0

    if-nez v6, :cond_2

    .line 126
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-ltz v0, :cond_1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "Truncated image container"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    move-wide v2, v4

    :goto_2
    sub-long/2addr p1, v2

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ᩷(Ljava/io/DataInputStream;)[B
    .locals 8

    .line 52
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v0

    const-wide v2, -0x76afb1b8f2f5e5f6L    # -8.091055181950927E-264

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    .line 54
    :cond_0
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    .line 55
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v4

    const v5, 0x65584966

    if-ne v4, v5, :cond_2

    .line 57
    invoke-static {p0, v0, v1}, Ll/ۨܺ֫;->ۙ(Ljava/io/DataInputStream;J)[B

    move-result-object v0

    .line 58
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v4, 0x4

    new-array v4, v4, [B

    .line 59
    fill-array-data v4, :array_0

    invoke-virtual {v1, v4}, Ljava/util/zip/CRC32;->update([B)V

    .line 60
    invoke-virtual {v1, v0}, Ljava/util/zip/CRC32;->update([B)V

    .line 61
    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v4

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p0

    int-to-long v6, p0

    and-long v1, v6, v2

    cmp-long p0, v4, v1

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid PNG EXIF checksum"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const-wide/16 v2, 0x4

    add-long/2addr v0, v2

    .line 64
    invoke-static {p0, v0, v1}, Ll/ۨܺ֫;->᩷(Ljava/io/DataInputStream;J)V

    const v0, 0x49454e44    # 808164.25f

    if-ne v4, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 52
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid PNG signature"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :array_0
    .array-data 1
        0x65t
        0x58t
        0x49t
        0x66t
    .end array-data
.end method
