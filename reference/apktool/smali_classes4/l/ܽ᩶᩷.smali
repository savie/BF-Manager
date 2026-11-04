.class public final Ll/ܽ᩶᩷;
.super Ljava/lang/Object;
.source "D9OF"


# instance fields
.field public ֫:[B

.field public final ۙ:Ljava/lang/String;

.field public ۚ:[Ll/ܶ᩶᩷;

.field public final ۤ:Ljava/io/File;

.field public final ۫:Ljava/util/concurrent/Executor;

.field public final ܳ:Ll/ۘ᩶᩷;

.field public ᩴ:Z

.field public final ᩷:Landroid/content/res/AssetManager;

.field public final ᩸:[B


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Ll/ۘ᩶᩷;Ljava/lang/String;Ljava/io/File;)V
    .locals 1

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 78
    iput-boolean v0, p0, Ll/ܽ᩶᩷;->ᩴ:Z

    .line 100
    iput-object p1, p0, Ll/ܽ᩶᩷;->᩷:Landroid/content/res/AssetManager;

    .line 101
    iput-object p2, p0, Ll/ܽ᩶᩷;->۫:Ljava/util/concurrent/Executor;

    .line 102
    iput-object p3, p0, Ll/ܽ᩶᩷;->ܳ:Ll/ۘ᩶᩷;

    .line 103
    iput-object p4, p0, Ll/ܽ᩶᩷;->ۙ:Ljava/lang/String;

    .line 106
    iput-object p5, p0, Ll/ܽ᩶᩷;->ۤ:Ljava/io/File;

    .line 380
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x18

    const/4 p3, 0x0

    if-ge p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 p2, 0x1f

    if-lt p1, p2, :cond_1

    .line 386
    sget-object p3, Ll/۠᩶᩷;->۫:[B

    goto :goto_0

    :cond_1
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 402
    :pswitch_0
    sget-object p3, Ll/۠᩶᩷;->ܳ:[B

    goto :goto_0

    .line 397
    :pswitch_1
    sget-object p3, Ll/۠᩶᩷;->ᩴ:[B

    goto :goto_0

    .line 395
    :pswitch_2
    sget-object p3, Ll/۠᩶᩷;->᩸:[B

    goto :goto_0

    .line 392
    :pswitch_3
    sget-object p3, Ll/۠᩶᩷;->ۤ:[B

    .line 107
    :goto_0
    iput-object p3, p0, Ll/ܽ᩶᩷;->᩸:[B

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private ۙ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 202
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    .line 203
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 205
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "compressed"

    .line 206
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ۙ(ILjava/io/Serializable;)V
    .locals 2

    .line 85
    new-instance v0, Ll/֫ܶ֫;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1, p0, p2}, Ll/֫ܶ֫;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Ll/ܽ᩶᩷;->۫:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܽ᩶᩷;ILjava/lang/Object;)V
    .locals 0

    .line 85
    iget-object p0, p0, Ll/ܽ᩶᩷;->ܳ:Ll/ۘ᩶᩷;

    invoke-interface {p0, p1, p2}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final ۙ()Z
    .locals 5

    .line 114
    iget-object v0, p0, Ll/ܽ᩶᩷;->᩸:[B

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 115
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x3

    invoke-direct {p0, v2, v0}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V

    return v1

    .line 125
    :cond_0
    iget-object v0, p0, Ll/ܽ᩶᩷;->ۤ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-eqz v2, :cond_1

    .line 126
    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_2

    .line 127
    invoke-direct {p0, v4, v3}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V

    return v1

    .line 132
    :cond_1
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z

    move-result v0

    if-nez v0, :cond_2

    .line 133
    invoke-direct {p0, v4, v3}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :cond_2
    const/4 v0, 0x1

    .line 144
    iput-boolean v0, p0, Ll/ܽ᩶᩷;->ᩴ:Z

    return v0

    .line 139
    :catch_0
    invoke-direct {p0, v4, v3}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V

    return v1
.end method

.method public final ۤ()V
    .locals 6

    .line 307
    iget-object v0, p0, Ll/ܽ᩶᩷;->ܳ:Ll/ۘ᩶᩷;

    iget-object v1, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    if-eqz v1, :cond_3

    .line 309
    iget-object v2, p0, Ll/ܽ᩶᩷;->᩸:[B

    if-nez v2, :cond_0

    goto :goto_2

    .line 149
    :cond_0
    iget-boolean v3, p0, Ll/ܽ᩶᩷;->ᩴ:Z

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    .line 313
    :try_start_0
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    :try_start_1
    sget-object v5, Ll/ᩳ᩶᩷;->ۙ:[B

    invoke-virtual {v4, v5}, Ljava/io/OutputStream;->write([B)V

    .line 82
    invoke-virtual {v4, v2}, Ljava/io/OutputStream;->write([B)V

    .line 315
    invoke-static {v4, v2, v1}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/ByteArrayOutputStream;[B[Ll/ܶ᩶᩷;)Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x5

    .line 322
    invoke-interface {v0, v1, v3}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    .line 326
    iput-object v3, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    .line 330
    :cond_1
    :try_start_3
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iput-object v1, p0, Ll/ܽ᩶᩷;->֫:[B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 331
    :try_start_4
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 313
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v2

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v1

    const/16 v2, 0x8

    .line 334
    invoke-interface {v0, v2, v1}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    goto :goto_1

    :catch_1
    move-exception v1

    const/4 v2, 0x7

    .line 332
    invoke-interface {v0, v2, v1}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    .line 336
    :goto_1
    iput-object v3, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    return-void

    .line 150
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ᩷()Ll/ܽ᩶᩷;
    .locals 12

    .line 171
    iget-object v0, p0, Ll/ܽ᩶᩷;->᩷:Landroid/content/res/AssetManager;

    iget-object v1, p0, Ll/ܽ᩶᩷;->ܳ:Ll/ۘ᩶᩷;

    .line 149
    iget-boolean v2, p0, Ll/ܽ᩶᩷;->ᩴ:Z

    if-eqz v2, :cond_a

    .line 172
    iget-object v2, p0, Ll/ܽ᩶᩷;->᩸:[B

    if-nez v2, :cond_0

    goto/16 :goto_b

    :cond_0
    const/4 v3, 0x7

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "dexopt/baseline.prof"

    .line 222
    invoke-direct {p0, v0, v5}, Ll/ܽ᩶᩷;->ۙ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v5
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v5

    .line 226
    invoke-interface {v1, v3, v5}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v5

    const/4 v6, 0x6

    .line 224
    invoke-interface {v1, v6, v5}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    :goto_0
    move-object v5, v4

    :goto_1
    const-string v6, "Invalid magic"

    const/4 v7, 0x4

    const/16 v8, 0x8

    if-eqz v5, :cond_2

    .line 240
    :try_start_1
    sget-object v9, Ll/ᩳ᩶᩷;->ۙ:[B

    .line 71
    invoke-static {v5, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v10

    .line 72
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 77
    invoke-static {v5, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v9

    .line 241
    iget-object v10, p0, Ll/ܽ᩶᩷;->ۙ:Ljava/lang/String;

    invoke-static {v5, v9, v10}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/FileInputStream;[BLjava/lang/String;)[Ll/ܶ᩶᩷;

    move-result-object v9
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 248
    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :catch_2
    move-exception v5

    .line 250
    invoke-interface {v1, v3, v5}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    goto :goto_4

    .line 202
    :cond_1
    :try_start_3
    new-instance v9, Ljava/lang/IllegalStateException;

    invoke-direct {v9, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    throw v9
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v9

    .line 245
    :try_start_4
    invoke-interface {v1, v8, v9}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    goto :goto_2

    :catch_4
    move-exception v9

    .line 243
    invoke-interface {v1, v3, v9}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 248
    :goto_2
    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_3

    :catch_5
    move-exception v5

    .line 250
    invoke-interface {v1, v3, v5}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    :goto_3
    move-object v9, v4

    .line 178
    :goto_4
    iput-object v9, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    goto :goto_7

    .line 248
    :goto_5
    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v2

    .line 250
    invoke-interface {v1, v3, v2}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    .line 252
    :goto_6
    throw v0

    .line 180
    :cond_2
    :goto_7
    iget-object v5, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    if-eqz v5, :cond_9

    .line 411
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x18

    if-ge v9, v10, :cond_3

    goto :goto_b

    :cond_3
    const/16 v11, 0x1f

    if-lt v9, v11, :cond_4

    goto :goto_8

    :cond_4
    if-eq v9, v10, :cond_5

    const/16 v10, 0x19

    if-eq v9, v10, :cond_5

    goto :goto_b

    :cond_5
    :goto_8
    :try_start_7
    const-string v9, "dexopt/baseline.profm"

    .line 265
    invoke-direct {p0, v0, v9}, Ll/ܽ᩶᩷;->ۙ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_9
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_7

    if-eqz v0, :cond_7

    .line 267
    :try_start_8
    sget-object v9, Ll/ᩳ᩶᩷;->᩷:[B

    .line 71
    invoke-static {v0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v10

    .line 72
    invoke-static {v9, v10}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 77
    invoke-static {v0, v7}, Ll/᩹᩶᩷;->ۙ(Ljava/io/InputStream;I)[B

    move-result-object v6

    .line 268
    invoke-static {v0, v6, v2, v5}, Ll/ᩳ᩶᩷;->ۙ(Ljava/io/FileInputStream;[B[B[Ll/ܶ᩶᩷;)[Ll/ܶ᩶᩷;

    move-result-object v2

    iput-object v2, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 276
    :try_start_9
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/FileNotFoundException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_9 .. :try_end_9} :catch_7

    move-object v4, p0

    goto :goto_a

    .line 202
    :cond_6
    :try_start_a
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception v2

    .line 265
    :try_start_b
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception v0

    :try_start_c
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v2

    :cond_7
    if-eqz v0, :cond_8

    .line 276
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/FileNotFoundException; {:try_start_c .. :try_end_c} :catch_9
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_8
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_c} :catch_7

    goto :goto_a

    :catch_7
    move-exception v0

    .line 282
    iput-object v4, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    .line 283
    invoke-interface {v1, v8, v0}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    goto :goto_a

    :catch_8
    move-exception v0

    .line 280
    invoke-interface {v1, v3, v0}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    goto :goto_a

    :catch_9
    move-exception v0

    const/16 v2, 0x9

    .line 277
    invoke-interface {v1, v2, v0}, Ll/ۘ᩶᩷;->ۙ(ILjava/lang/Object;)V

    :cond_8
    :goto_a
    if-eqz v4, :cond_9

    return-object v4

    :cond_9
    :goto_b
    return-object p0

    .line 150
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩸()Z
    .locals 8

    .line 347
    iget-object v0, p0, Ll/ܽ᩶᩷;->֫:[B

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 149
    :cond_0
    iget-boolean v2, p0, Ll/ܽ᩶᩷;->ᩴ:Z

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    .line 353
    :try_start_0
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 354
    :try_start_1
    new-instance v0, Ljava/io/FileOutputStream;

    iget-object v4, p0, Ll/ܽ᩶᩷;->ۤ:Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 355
    :try_start_2
    invoke-static {v0}, Ll/ۨ۠ۗ;->ۙ(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileChannel;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 362
    :try_start_3
    invoke-virtual {v4}, Ljava/nio/channels/FileChannel;->tryLock()Ljava/nio/channels/FileLock;

    move-result-object v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v5, :cond_2

    .line 190
    :try_start_4
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->isValid()Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x200

    new-array v6, v6, [B

    .line 196
    :goto_0
    invoke-virtual {v3, v6}, Ljava/io/InputStream;->read([B)I

    move-result v7

    if-lez v7, :cond_1

    .line 197
    invoke-virtual {v0, v6, v1, v7}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    const/4 v6, 0x1

    .line 365
    invoke-direct {p0, v6, v2}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 367
    :try_start_5
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 372
    iput-object v2, p0, Ll/ܽ᩶᩷;->֫:[B

    .line 373
    iput-object v2, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    return v6

    .line 192
    :cond_2
    :try_start_9
    new-instance v6, Ljava/io/IOException;

    const-string v7, "Unable to acquire a lock on the underlying file channel."

    invoke-direct {v6, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catchall_0
    move-exception v6

    if-eqz v5, :cond_3

    .line 352
    :try_start_a
    invoke-virtual {v5}, Ljava/nio/channels/FileLock;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v5

    :try_start_b
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v6
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception v5

    if-eqz v4, :cond_4

    :try_start_c
    invoke-virtual {v4}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v4

    :try_start_d
    invoke-virtual {v5, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v4

    :try_start_e
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception v0

    :try_start_f
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v4
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :catchall_6
    move-exception v0

    :try_start_10
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception v3

    :try_start_11
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0
    :try_end_11
    .catch Ljava/io/FileNotFoundException; {:try_start_11 .. :try_end_11} :catch_1
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    goto :goto_7

    :catch_0
    move-exception v0

    const/4 v3, 0x7

    .line 370
    :try_start_12
    invoke-direct {p0, v3, v0}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V

    goto :goto_5

    :catch_1
    move-exception v0

    const/4 v3, 0x6

    .line 368
    invoke-direct {p0, v3, v0}, Ll/ܽ᩶᩷;->ۙ(ILjava/io/Serializable;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 372
    :goto_5
    iput-object v2, p0, Ll/ܽ᩶᩷;->֫:[B

    .line 373
    iput-object v2, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    :goto_6
    return v1

    .line 372
    :goto_7
    iput-object v2, p0, Ll/ܽ᩶᩷;->֫:[B

    .line 373
    iput-object v2, p0, Ll/ܽ᩶᩷;->ۚ:[Ll/ܶ᩶᩷;

    .line 374
    throw v0

    .line 150
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
