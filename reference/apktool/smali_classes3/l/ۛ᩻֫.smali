.class public final Ll/ۛ᩻֫;
.super Ljava/lang/Object;
.source "R6JT"

# interfaces
.implements Ll/᩶ۖܺ;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ܰ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛ᩻֫;->ܰ:Ljava/util/HashMap;

    return-void
.end method

.method public static ۙ(Ljava/util/LinkedHashSet;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ۛ᩻֫;
    .locals 5

    .line 35
    new-instance v0, Ll/ۛ᩻֫;

    invoke-direct {v0}, Ll/ۛ᩻֫;-><init>()V

    .line 37
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v1

    invoke-virtual {p1}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x2

    div-long/2addr v1, v3

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    .line 38
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    .line 39
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 40
    invoke-static {p4}, Ll/ۛ᩻֫;->ۙ(Ll/ۘۧ֫;)V

    int-to-long v3, v1

    .line 41
    div-long v3, p2, v3

    invoke-static {v2, p1, v3, v4, p4}, Ll/ۛ᩻֫;->ۙ(Ljava/lang/String;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ۨ᩻֫;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 43
    :try_start_1
    iget-object v4, v0, Ll/ۛ᩻֫;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :try_start_2
    iget-object v2, v3, Ll/ۨ᩻֫;->᩶:Ll/ۡۚ֫;

    invoke-virtual {v2}, Ll/ۡۚ֫;->ۙ()J

    move-result-wide v2

    sub-long/2addr p2, v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 45
    invoke-virtual {v3}, Ll/ۨ᩻֫;->close()V

    .line 46
    throw p0

    .line 51
    :cond_0
    invoke-static {p4}, Ll/ۛ᩻֫;->ۙ(Ll/ۘۧ֫;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    :catchall_1
    move-exception p0

    .line 54
    invoke-virtual {v0}, Ll/ۛ᩻֫;->close()V

    .line 55
    throw p0
.end method

.method public static ۙ(Ljava/lang/String;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ۨ᩻֫;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 60
    invoke-static/range {p0 .. p0}, Ll/ۛ᩻֫;->᩷(Ljava/lang/String;)I

    move-result v2

    move v3, v2

    .line 62
    :goto_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v4

    const-string v5, "Invalid SVG image Base64 data"

    if-ge v3, v4, :cond_6

    and-int/lit16 v4, v3, 0xfff

    if-nez v4, :cond_0

    .line 63
    invoke-static/range {p4 .. p4}, Ll/ۛ᩻֫;->ۙ(Ll/ۘۧ֫;)V

    .line 64
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x41

    if-lt v4, v6, :cond_1

    const/16 v6, 0x5a

    if-le v4, v6, :cond_5

    :cond_1
    const/16 v6, 0x61

    if-lt v4, v6, :cond_2

    const/16 v6, 0x7a

    if-le v4, v6, :cond_5

    :cond_2
    const/16 v6, 0x30

    if-lt v4, v6, :cond_3

    const/16 v6, 0x39

    if-le v4, v6, :cond_5

    :cond_3
    const/16 v6, 0x2b

    if-eq v4, v6, :cond_5

    const/16 v6, 0x2f

    if-eq v4, v6, :cond_5

    const/16 v6, 0x3d

    if-eq v4, v6, :cond_5

    const/16 v6, 0x20

    if-eq v4, v6, :cond_5

    const/16 v6, 0x9

    if-eq v4, v6, :cond_5

    const/16 v6, 0xd

    if-eq v4, v6, :cond_5

    const/16 v6, 0xa

    if-ne v4, v6, :cond_4

    goto :goto_1

    .line 67
    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 70
    :cond_6
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    int-to-long v6, v2

    sub-long/2addr v3, v6

    const-wide/16 v6, 0x5

    mul-long v3, v3, v6

    const-wide/32 v6, 0x10000

    add-long/2addr v3, v6

    .line 137
    invoke-virtual {v1, v3, v4}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v3

    const-string v4, "SVG image workspace exceeds budget"

    if-eqz v3, :cond_d

    .line 74
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :try_start_1
    invoke-static/range {p4 .. p4}, Ll/ۛ᩻֫;->ۙ(Ll/ۘۧ֫;)V

    .line 79
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v6, 0x1

    .line 80
    iput-boolean v6, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 81
    array-length v7, v0

    invoke-static {v0, v2, v7, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 82
    iget v7, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v8, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 83
    sget-object v9, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    invoke-virtual {v9, v7, v8}, Ll/ۜ֫֫;->ۙ(II)V

    .line 84
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 85
    sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v9, v5, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 86
    iput-boolean v2, v5, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 87
    invoke-virtual/range {p1 .. p1}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v9

    invoke-virtual/range {p1 .. p1}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v11

    sub-long/2addr v9, v11

    move-wide/from16 v11, p2

    invoke-static {v11, v12, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    :goto_2
    if-lez v6, :cond_c

    .line 89
    invoke-static {v7, v8, v6}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v11

    cmp-long v13, v11, v9

    if-gtz v13, :cond_b

    .line 91
    invoke-static/range {p4 .. p4}, Ll/ۛ᩻֫;->ۙ(Ll/ۘۧ֫;)V

    .line 137
    invoke-virtual {v1, v11, v12}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v11, :cond_a

    const/4 v12, 0x0

    .line 95
    :try_start_2
    iput v6, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 96
    array-length v13, v0

    invoke-static {v0, v2, v13, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v12

    if-eqz v12, :cond_8

    .line 98
    invoke-static/range {p4 .. p4}, Ll/ۛ᩻֫;->ۙ(Ll/ۘۧ֫;)V

    .line 99
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v13

    int-to-long v13, v13

    cmp-long v15, v13, v9

    if-gtz v15, :cond_7

    .line 100
    invoke-virtual {v11, v13, v14}, Ll/ۡۚ֫;->᩷(J)Z

    move-result v13

    if-eqz v13, :cond_7

    .line 101
    new-instance v0, Ll/ۨ᩻֫;

    new-instance v1, Ll/ۤ۠ܺ;

    invoke-direct {v1, v12, v7, v8}, Ll/ۤ۠ܺ;-><init>(Landroid/graphics/Bitmap;II)V

    invoke-direct {v0, v1, v11}, Ll/ۨ᩻֫;-><init>(Ll/ۤ۠ܺ;Ll/ۡۚ֫;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 114
    invoke-virtual {v3}, Ll/ۡۚ֫;->close()V

    return-object v0

    .line 107
    :cond_7
    :try_start_3
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 108
    invoke-virtual {v11}, Ll/ۡۚ֫;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    .line 97
    :cond_8
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SVG image could not be decoded"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    if-eqz v12, :cond_9

    .line 107
    :try_start_5
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->recycle()V

    .line 108
    :cond_9
    invoke-virtual {v11}, Ll/ۡۚ֫;->close()V

    .line 109
    throw v0

    .line 138
    :cond_a
    new-instance v0, Ll/ᩳ֫֫;

    .line 459
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 138
    throw v0

    .line 111
    :cond_b
    :goto_3
    invoke-static {v7, v8}, Ljava/lang/Math;->max(II)I

    move-result v11

    if-ge v6, v11, :cond_c

    mul-int/lit8 v6, v6, 0x2

    goto :goto_2

    .line 113
    :cond_c
    new-instance v0, Ll/ᩳ֫֫;

    const-string v1, "SVG embedded image exceeds budget"

    .line 459
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 113
    throw v0

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 76
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 71
    :goto_4
    :try_start_6
    invoke-virtual {v3}, Ll/ۡۚ֫;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v1

    .line 138
    :cond_d
    new-instance v0, Ll/ᩳ֫֫;

    .line 459
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 138
    throw v0
.end method

.method public static ۙ(Ll/ۘۧ֫;)V
    .locals 1

    .line 143
    invoke-virtual {p0}, Ll/ۘۧ֫;->۫()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "SVG image decode cancelled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ᩷(Ljava/lang/String;)I
    .locals 5

    const/16 v0, 0x2c

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const-string v1, "data:"

    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0xc

    if-lt v0, v1, :cond_2

    add-int/lit8 v1, v0, -0x7

    const-string v2, ";base64"

    const/4 v3, 0x0

    const/4 v4, 0x7

    invoke-virtual {p0, v1, v2, v3, v4}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x3b

    .line 26
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, 0x5

    if-le v1, v2, :cond_1

    .line 27
    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v1, "image/svg+xml"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    new-instance p0, Ll/֫֫֫;

    const-string v0, "Nested SVG images are not supported"

    .line 483
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p0

    :cond_1
    :goto_0
    add-int/lit8 v0, v0, 0x1

    return v0

    .line 25
    :cond_2
    new-instance p0, Ll/֫֫֫;

    const-string v0, "SVG image must be a Base64 data URL"

    .line 483
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 132
    iget-object v0, p0, Ll/ۛ᩻֫;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨ᩻֫;

    invoke-virtual {v2}, Ll/ۨ᩻֫;->close()V

    goto :goto_0

    .line 133
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final ۙ()J
    .locals 5

    .line 126
    iget-object v0, p0, Ll/ۛ᩻֫;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۨ᩻֫;

    iget-object v3, v3, Ll/ۨ᩻֫;->᩶:Ll/ۡۚ֫;

    invoke-virtual {v3}, Ll/ۡۚ֫;->ۙ()J

    move-result-wide v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ۤ۠ܺ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۛ᩻֫;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۨ᩻֫;

    if-eqz p1, :cond_0

    .line 121
    iget-object p1, p1, Ll/ۨ᩻֫;->ܰ:Ll/ۤ۠ܺ;

    return-object p1

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SVG image was not prepared"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
