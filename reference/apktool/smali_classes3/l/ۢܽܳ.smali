.class public final Ll/ۢܽܳ;
.super Ljava/lang/Object;
.source "YIXS"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۟:[B


# instance fields
.field public final ֡:Ll/᩸ܽܺ;

.field public final ܰ:Ll/᩶ۚۤ;

.field public final ܿ:Ljava/io/File;

.field public final ᩶:Ll/ܽܽۤ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "resources.arsc"

    .line 28
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ll/ۢܽܳ;->۟:[B

    return-void
.end method

.method public constructor <init>(Ll/᩶ۚۤ;Ll/᩸ܽܺ;Ll/۬ܺۤ;Ljava/io/File;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ۢܽܳ;->ܰ:Ll/᩶ۚۤ;

    .line 36
    iput-object p2, p0, Ll/ۢܽܳ;->֡:Ll/᩸ܽܺ;

    .line 37
    iput-object p3, p0, Ll/ۢܽܳ;->᩶:Ll/ܽܽۤ;

    .line 38
    iput-object p4, p0, Ll/ۢܽܳ;->ܿ:Ljava/io/File;

    return-void
.end method

.method public static ۙ(Ljava/io/File;Ljava/io/File;Ll/᩻ܶܳ;)Ll/ۢܽܳ;
    .locals 17

    .line 43
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 45
    new-instance v1, Ll/᩸ܽܺ;

    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ll/ᩳܽܳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-direct {v1, v0, v2}, Ll/᩸ܽܺ;-><init>(Ljava/lang/String;Ll/ᩳܺܺ;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    const-string v0, "resources.arsc"

    .line 51
    invoke-virtual {v1, v0}, Ll/᩸ܽܺ;->getEntry(Ljava/lang/String;)Ll/۟ܺܺ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    if-nez v0, :cond_0

    .line 103
    invoke-virtual {v1}, Ll/᩸ܽܺ;->close()V

    return-object v2

    .line 53
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Ll/۟ܺܺ;->getSize()J

    move-result-wide v4

    .line 54
    invoke-virtual {v0}, Ll/۟ܺܺ;->᩹()Z

    move-result v6

    if-nez v6, :cond_c

    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v4, v6

    if-gtz v8, :cond_c

    .line 56
    invoke-virtual {v0}, Ll/۟ܺܺ;->ۛ()I

    move-result v8

    const-wide/16 v9, 0x0

    if-nez v8, :cond_2

    cmp-long v6, v4, v9

    if-ltz v6, :cond_1

    .line 57
    invoke-virtual {v0}, Ll/۟ܺܺ;->ܳ()J

    move-result-wide v6

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    .line 59
    new-instance v6, Ll/ܿۚۤ;

    invoke-virtual {v1}, Ll/᩸ܽܺ;->۫()Ll/ܽܽۤ;

    move-result-object v7

    invoke-virtual {v0}, Ll/۟ܺܺ;->֫()J

    move-result-wide v8

    long-to-int v0, v4

    invoke-direct {v6, v7, v8, v9, v0}, Ll/ܿۚۤ;-><init>(Ll/ܽܽۤ;JI)V

    const/4 v3, 0x1

    .line 61
    new-instance v0, Ll/ۢܽܳ;

    invoke-direct {v0, v6, v1, v2, v2}, Ll/ۢܽܳ;-><init>(Ll/᩶ۚۤ;Ll/᩸ܽܺ;Ll/۬ܺۤ;Ljava/io/File;)V

    return-object v0

    .line 58
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Invalid stored resource table length"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 63
    :cond_2
    invoke-virtual {v1, v0}, Ll/᩸ܽܺ;->ۙ(Ll/۟ܺܺ;)Ljava/io/InputStream;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    const-string v0, "Truncated resource table"

    const/high16 v11, 0x10000

    cmp-long v12, v4, v9

    if-ltz v12, :cond_6

    const-wide/32 v13, 0xa00000

    cmp-long v15, v4, v13

    if-gtz v15, :cond_6

    long-to-int v5, v4

    .line 65
    :try_start_2
    new-array v4, v5, [B

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_4

    .line 68
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    sub-int v7, v5, v6

    .line 69
    invoke-static {v11, v7}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-virtual {v8, v4, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-ltz v7, :cond_3

    add-int/2addr v6, v7

    goto :goto_0

    .line 70
    :cond_3
    new-instance v4, Ljava/io/IOException;

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 73
    :cond_4
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 74
    invoke-virtual {v8}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v5, -0x1

    if-ne v0, v5, :cond_5

    .line 75
    new-instance v0, Ll/ۢܽܳ;

    new-instance v5, Ll/ۗۚۤ;

    invoke-direct {v5, v4}, Ll/ۗۚۤ;-><init>([B)V

    invoke-direct {v0, v5, v2, v2, v2}, Ll/ۢܽܳ;-><init>(Ll/᩶ۚۤ;Ll/᩸ܽܺ;Ll/۬ܺۤ;Ljava/io/File;)V

    move-object v13, v2

    goto :goto_3

    .line 74
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Resource table length mismatch"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const-string v13, "inspector-arsc-"

    const-string v14, ".tmp"

    move-object/from16 v15, p1

    .line 77
    invoke-static {v13, v14, v15}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    :try_start_3
    new-array v11, v11, [B

    .line 80
    new-instance v14, Ljava/io/FileOutputStream;

    invoke-direct {v14, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    move-wide v6, v9

    .line 82
    :goto_1
    :try_start_4
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 83
    invoke-virtual {v8, v11}, Ljava/io/InputStream;->read([B)I

    move-result v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-gez v15, :cond_9

    .line 90
    :try_start_5
    invoke-virtual {v14}, Ljava/io/FileOutputStream;->close()V

    if-ltz v12, :cond_8

    cmp-long v11, v9, v4

    if-nez v11, :cond_7

    goto :goto_2

    .line 91
    :cond_7
    new-instance v4, Ljava/io/IOException;

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 92
    :cond_8
    :goto_2
    invoke-static/range {p2 .. p2}, Ll/ۢܽܳ;->ۙ(Ll/᩻ܶܳ;)V

    .line 93
    invoke-static {v13}, Ll/ۧܽۤ;->ۙ(Ljava/io/File;)Ll/۬ܺۤ;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 94
    :try_start_6
    new-instance v0, Ll/ۢܽܳ;

    new-instance v5, Ll/ܿۚۤ;

    long-to-int v10, v9

    invoke-direct {v5, v4, v6, v7, v10}, Ll/ܿۚۤ;-><init>(Ll/ܽܽۤ;JI)V

    invoke-direct {v0, v5, v2, v4, v13}, Ll/ۢܽܳ;-><init>(Ll/᩶ۚۤ;Ll/᩸ܽܺ;Ll/۬ܺۤ;Ljava/io/File;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object v2, v4

    .line 96
    :goto_3
    :try_start_7
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    .line 98
    invoke-virtual {v1}, Ll/᩸ܽܺ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_9
    int-to-long v6, v15

    add-long/2addr v9, v6

    const-wide/32 v6, 0x7fffffff

    cmp-long v16, v9, v6

    if-gtz v16, :cond_b

    if-ltz v12, :cond_a

    cmp-long v16, v9, v4

    if-gtz v16, :cond_b

    .line 88
    :cond_a
    :try_start_8
    invoke-virtual {v14, v11, v3, v15}, Ljava/io/FileOutputStream;->write([BII)V

    const-wide/16 v15, 0x0

    move-wide v6, v15

    goto :goto_1

    .line 87
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Resource table length overflow"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    move-object v4, v0

    .line 80
    :try_start_9
    invoke-virtual {v14}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v5, v0

    :try_start_a
    invoke-virtual {v4, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :catchall_4
    move-exception v0

    move-object v4, v2

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v4, v2

    move-object v13, v4

    :goto_5
    move-object v2, v0

    .line 63
    :try_start_b
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_6

    :catchall_6
    move-exception v0

    move-object v5, v0

    :try_start_c
    invoke-virtual {v2, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :catchall_7
    move-exception v0

    move-object v2, v4

    goto :goto_7

    .line 55
    :cond_c
    :try_start_d
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Unsupported resource table entry"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :catchall_8
    move-exception v0

    move-object v13, v2

    :goto_7
    if-nez v3, :cond_f

    .line 103
    :try_start_e
    invoke-virtual {v1}, Ll/᩸ܽܺ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    if-eqz v2, :cond_d

    .line 105
    :try_start_f
    invoke-virtual {v2}, Ll/۬ܺۤ;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    goto :goto_8

    :catchall_9
    move-exception v0

    move-object v1, v0

    .line 106
    invoke-static {v13}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    throw v1

    :cond_d
    :goto_8
    invoke-static {v13}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    goto :goto_a

    :catchall_a
    move-exception v0

    move-object v1, v0

    if-eqz v2, :cond_e

    .line 105
    :try_start_10
    invoke-virtual {v2}, Ll/۬ܺۤ;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    goto :goto_9

    :catchall_b
    move-exception v0

    move-object v1, v0

    .line 106
    invoke-static {v13}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    throw v1

    :cond_e
    :goto_9
    invoke-static {v13}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    .line 107
    throw v1

    .line 109
    :cond_f
    :goto_a
    throw v0
.end method

.method public static ۙ(Ljava/io/File;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 130
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/᩻ܶܳ;)V
    .locals 1

    .line 113
    invoke-virtual {p0}, Ll/᩻ܶܳ;->getAsBoolean()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "Resource ID lookup cancelled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ᩷([B)Z
    .locals 1

    .line 45
    sget-object v0, Ll/ۢܽܳ;->۟:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 119
    iget-object v0, p0, Ll/ۢܽܳ;->֡:Ll/᩸ܽܺ;

    iget-object v1, p0, Ll/ۢܽܳ;->ܿ:Ljava/io/File;

    :try_start_0
    iget-object v2, p0, Ll/ۢܽܳ;->᩶:Ll/ܽܽۤ;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/nio/channels/Channel;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    if-eqz v0, :cond_1

    .line 122
    :try_start_1
    invoke-virtual {v0}, Ll/᩸ܽܺ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 124
    invoke-static {v1}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    .line 125
    throw v0

    .line 124
    :cond_1
    :goto_0
    invoke-static {v1}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    return-void

    :catchall_1
    move-exception v2

    if-eqz v0, :cond_2

    .line 122
    :try_start_2
    invoke-virtual {v0}, Ll/᩸ܽܺ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    .line 124
    invoke-static {v1}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    .line 125
    throw v0

    .line 124
    :cond_2
    :goto_1
    invoke-static {v1}, Ll/ۢܽܳ;->ۙ(Ljava/io/File;)V

    .line 126
    throw v2
.end method
