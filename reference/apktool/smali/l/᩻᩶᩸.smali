.class public final Ll/᩻᩶᩸;
.super Ljava/lang/Object;
.source "NB3C"


# static fields
.field public static ۙ:I = 0x1312d00

.field private static final ۛ۫ۡ:[S

.field public static ᩷:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xaf

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/16 v0, 0x2c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩻᩶᩸;->ۛ۫ۡ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xf2as
        0x5b6as
        0x5b36s
        0x5b7bs
        0x5b74s
        0x5b79s
        0x5b6bs
        0x5b6bs
        0x5b51s
        0x5b74s
        0x5b74s
        0x5b7ds
        0x5b7fs
        0x5b79s
        0x5b74s
        0x5b38s
        0x5b6bs
        0x5b7ds
        0x5b7ds
        0x5b73s
        0x5b36s
        0x5b60s
        0x5b75s
        0x5b74s
        0x5b6as
        0x5b7ds
        0x5b6bs
        0x5b77s
        0x5b6ds
        0x5b6as
        0x5b7bs
        0x5b7ds
        0x5b6bs
        0x5b36s
        0x5b79s
        0x5b6as
        0x5b6bs
        0x5b7bs
        0x5b5ds
        0x5b4bs
        0x5b48s
        0x5b51s
        0x5b48s
        0x5b5ds
    .end array-data
.end method

.method public static ۙ()Ll/ۚ᩶᩸;
    .locals 4

    .line 62
    sget-object v0, Ll/᩻᩶᩸;->᩷:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 64
    sput-object v1, Ll/᩻᩶᩸;->᩷:Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    const-string v0, ""

    .line 68
    :goto_0
    new-instance v1, Ll/ۚ᩶᩸;

    const-string v2, "\n"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v0, v3}, Ll/ۚ᩶᩸;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    return-object v1
.end method

.method public static ۙ(Ll/ۖܰ᩸;ZILl/۟֡֫;)Ll/ۚ᩶᩸;
    .locals 1

    const/4 v0, 0x0

    .line 77
    invoke-static {p0, p1, p2, p3, v0}, Ll/᩻᩶᩸;->ۙ(Ll/ۖܰ᩸;ZILl/۟֡֫;Z)Ll/ۚ᩶᩸;

    move-result-object p0

    return-object p0
.end method

.method public static native ۙ(Ll/ۖܰ᩸;ZILl/۟֡֫;Z)Ll/ۚ᩶᩸;
.end method

.method public static ۙ(Ll/ۡܰ᩸;ILl/۟֡֫;)Ll/ۚ᩶᩸;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 72
    invoke-static {p0, v0, p1, p2, v1}, Ll/᩻᩶᩸;->ۙ(Ll/ۖܰ᩸;ZILl/۟֡֫;Z)Ll/ۚ᩶᩸;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۧ᩶᩸;ILl/۟֡֫;)Ll/ۚ᩶᩸;
    .locals 20
    .annotation build Ll/ܰ᩺ۤ;
    .end annotation

    const-string v0, "tmp_"

    .line 211
    invoke-interface/range {p0 .. p0}, Ll/ۧ᩶᩸;->᩷()Ljava/io/InputStream;

    move-result-object v1

    const v2, 0x8000

    .line 212
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->mark(I)V

    new-array v3, v2, [B

    const/4 v4, 0x0

    .line 2096
    invoke-static {v1, v3, v4, v2}, Ll/ۙ᩵ۨ;->ۙ(Ljava/io/InputStream;[BII)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const-string v5, "\n"

    if-gtz v2, :cond_0

    .line 216
    :try_start_1
    new-instance v0, Ll/ۚ᩶᩸;

    const-string v2, ""

    sget v3, Ll/ۖۚۤ;->ۗ:I

    invoke-direct {v0, v5, v2, v3}, Ll/ۚ᩶᩸;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 367
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    :cond_0
    const/4 v6, -0x1

    if-nez v2, :cond_1

    .line 372
    :try_start_2
    sget v7, Ll/ۖۚۤ;->ۗ:I

    goto :goto_1

    :cond_1
    move/from16 v7, p1

    if-eq v7, v6, :cond_2

    goto :goto_1

    .line 374
    :cond_2
    invoke-static {v2, v3}, Ll/ۙܶ᩸;->ۙ(I[B)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    const/4 v7, -0x1

    goto :goto_0

    .line 375
    :cond_3
    invoke-static {v7}, Ll/ۖۚۤ;->ۙ(Ljava/lang/String;)I

    move-result v7

    :goto_0
    if-ne v7, v6, :cond_4

    .line 376
    invoke-static {v2, v3}, Ll/ۖۚۤ;->᩷(I[B)I

    move-result v7

    .line 220
    :cond_4
    :goto_1
    invoke-virtual {v1}, Ljava/io/InputStream;->reset()V

    .line 221
    sget v8, Ll/ۖۚۤ;->ۗ:I

    if-eq v7, v8, :cond_9

    sget v8, Ll/ۖۚۤ;->᩵:I

    if-ne v7, v8, :cond_5

    goto :goto_2

    .line 225
    :cond_5
    sget v8, Ll/ۖۚۤ;->ܺ:I

    const-wide/16 v9, 0x2

    if-ne v7, v8, :cond_6

    .line 226
    invoke-static {v2, v3}, Ll/ᩳۚۤ;->ۙ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 227
    invoke-static {v9, v10, v1}, Ll/ۙ᩵ۨ;->᩷(JLjava/io/InputStream;)V

    goto :goto_3

    .line 229
    :cond_6
    sget v8, Ll/ۖۚۤ;->ܽ:I

    if-ne v7, v8, :cond_7

    .line 230
    invoke-static {v2, v3}, Ll/ᩳۚۤ;->᩷(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 231
    invoke-static {v9, v10, v1}, Ll/ۙ᩵ۨ;->᩷(JLjava/io/InputStream;)V

    goto :goto_3

    .line 233
    :cond_7
    sget v8, Ll/ۖۚۤ;->ܶ:I

    const-wide/16 v9, 0x4

    if-ne v7, v8, :cond_8

    .line 234
    invoke-static {v2, v3}, Ll/ᩳۚۤ;->ۤ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 235
    invoke-static {v9, v10, v1}, Ll/ۙ᩵ۨ;->᩷(JLjava/io/InputStream;)V

    goto :goto_3

    .line 237
    :cond_8
    sget v8, Ll/ۖۚۤ;->᩹:I

    if-ne v7, v8, :cond_a

    .line 238
    invoke-static {v2, v3}, Ll/ᩳۚۤ;->᩸(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 239
    invoke-static {v9, v10, v1}, Ll/ۙ᩵ۨ;->᩷(JLjava/io/InputStream;)V

    goto :goto_3

    .line 222
    :cond_9
    :goto_2
    invoke-static {v2, v3}, Ll/ᩳۚۤ;->ᩴ(I[B)Z

    move-result v2

    if-eqz v2, :cond_a

    const-wide/16 v2, 0x3

    .line 223
    invoke-static {v2, v3, v1}, Ll/ۙ᩵ۨ;->᩷(JLjava/io/InputStream;)V

    .line 242
    :cond_a
    :goto_3
    new-instance v2, Ll/᩺ܽۤ;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-static {v7}, Ll/ۖۚۤ;->ۙ(I)Ljava/nio/charset/Charset;

    move-result-object v8

    invoke-direct {v3, v1, v8}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Ll/᩺ܽۤ;-><init>(Ljava/io/InputStreamReader;)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/CharSequence;

    const/4 v8, 0x0

    aput-object v8, v3, v4

    .line 244
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 249
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "_"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 250
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 251
    sget-object v12, Ll/ۙ᩻ܺ;->᩸:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v12, Ll/ۤ᩷ܺ;->ۙ:I

    invoke-static {v12}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 253
    :try_start_3
    new-instance v13, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v13}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 256
    sget v14, Ll/᩻᩶᩸;->ۙ:I

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v8

    .line 257
    :goto_4
    invoke-virtual {v2}, Ll/᩺ܽۤ;->read()I

    move-result v4
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eq v4, v6, :cond_17

    if-lt v15, v14, :cond_10

    int-to-char v6, v4

    .line 258
    :try_start_4
    sget v18, Ll/ܿܺ᩵;->ۙ:I

    const v8, 0xd800

    if-lt v6, v8, :cond_b

    const v8, 0xe000

    if-ge v6, v8, :cond_b

    goto/16 :goto_8

    .line 259
    :cond_b
    invoke-interface/range {p2 .. p2}, Ll/۟֡֫;->۫()Z

    move-result v6

    if-nez v6, :cond_f

    .line 262
    :goto_5
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    const/4 v8, 0x3

    if-lt v6, v8, :cond_c

    const-wide/16 v18, 0xa

    .line 263
    invoke-static/range {v18 .. v19}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_5

    .line 265
    :cond_c
    invoke-static {}, Ll/᩶ۨ᩸;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v15

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v6

    const/16 v8, 0xa

    .line 266
    invoke-static {v9, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    .line 268
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v15

    add-int/lit16 v15, v15, -0x3e8

    if-lt v8, v15, :cond_d

    const/4 v15, 0x0

    .line 269
    invoke-virtual {v9, v15, v8}, Ljava/lang/StringBuilder;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v18

    .line 270
    invoke-virtual {v9, v15, v8}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :goto_6
    move-object/from16 v8, v18

    goto :goto_7

    .line 272
    :cond_d
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const/4 v8, 0x0

    .line 273
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    goto :goto_6

    .line 275
    :goto_7
    invoke-virtual {v13}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 276
    new-instance v15, Ll/ᩴ᩶᩸;

    invoke-direct {v15, v6, v8, v13}, Ll/ᩴ᩶᩸;-><init>(Ll/᩷ۨᩴ;Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-interface {v12, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v15

    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v16, :cond_e

    const/4 v15, 0x0

    aput-object v8, v3, v15

    const/16 v16, 0x1

    .line 285
    :cond_e
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v15

    .line 286
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 260
    :cond_f
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0}, Ljava/util/concurrent/CancellationException;-><init>()V

    throw v0

    :cond_10
    :goto_8
    const/16 v6, 0xd

    if-ne v4, v6, :cond_16

    const/16 v4, 0xa

    .line 289
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v15, 0x1

    .line 291
    invoke-virtual {v2}, Ll/᩺ܽۤ;->read()I

    move-result v8

    if-nez v17, :cond_12

    if-ne v8, v4, :cond_11

    const-string v4, "\r\n"

    goto :goto_9

    :cond_11
    const-string v4, "\r"

    :goto_9
    move-object/from16 v17, v4

    :cond_12
    const/4 v4, -0x1

    if-eq v8, v4, :cond_15

    const/16 v4, 0xa

    if-ne v8, v4, :cond_13

    goto :goto_b

    :cond_13
    const/16 v6, 0xd

    if-ne v8, v6, :cond_14

    .line 299
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_a

    :cond_14
    int-to-char v4, v8

    .line 302
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_a
    add-int/lit8 v15, v15, 0x2

    goto :goto_c

    :cond_15
    :goto_b
    move v15, v6

    goto :goto_c

    :cond_16
    int-to-char v4, v4

    .line 306
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v15, v15, 0x1

    :goto_c
    const/4 v4, 0x0

    const/4 v6, -0x1

    const/4 v8, 0x0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :catch_0
    move-exception v0

    goto/16 :goto_11

    :catch_1
    move-exception v0

    goto/16 :goto_11

    :catch_2
    move-exception v0

    goto/16 :goto_11

    :cond_17
    if-nez v17, :cond_18

    goto :goto_d

    :cond_18
    move-object/from16 v5, v17

    :goto_d
    if-eqz v16, :cond_1b

    if-lez v15, :cond_19

    .line 315
    invoke-static {}, Ll/᩶ۨ᩸;->ۙ()Ll/᩷ۨᩴ;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 316
    invoke-static {v0, v9}, Ll/᩻᩶᩸;->ۙ(Ll/᩷ۨᩴ;Ljava/lang/CharSequence;)V

    .line 317
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    :cond_19
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_3
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_5
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 321
    :try_start_5
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/Error; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_e

    :catch_4
    move-exception v0

    move-object v2, v0

    .line 323
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 328
    :cond_1a
    new-instance v0, Ll/ۚ᩶᩸;

    const/4 v2, 0x0

    aget-object v2, v3, v2

    invoke-direct {v0, v2, v5, v10, v7}, Ll/ۚ᩶᩸;-><init>(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/util/ArrayList;I)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 365
    :try_start_7
    invoke-interface {v12}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 367
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    .line 330
    :cond_1b
    :try_start_8
    new-instance v0, Ll/ۚ᩶᩸;

    invoke-direct {v0, v5, v9, v7}, Ll/ۚ᩶᩸;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_5
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/Error; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 365
    :try_start_9
    invoke-interface {v12}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 367
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    return-object v0

    :catch_5
    const/4 v4, 0x0

    goto :goto_13

    .line 359
    :goto_f
    :try_start_a
    invoke-static {v11}, Ll/᩻᩶᩸;->ۙ(Ljava/util/ArrayList;)V

    .line 360
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۨᩴ;

    .line 361
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ᩳ()Z

    goto :goto_10

    .line 363
    :cond_1c
    new-instance v2, Ljava/io/IOException;

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 353
    :goto_11
    invoke-static {v11}, Ll/᩻᩶᩸;->ۙ(Ljava/util/ArrayList;)V

    .line 354
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ۨᩴ;

    .line 355
    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ᩳ()Z

    goto :goto_12

    .line 357
    :cond_1d
    throw v0

    :catch_6
    :goto_13
    const/4 v2, 0x0

    .line 338
    aput-object v2, v3, v4

    .line 339
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 340
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->trimToSize()V

    .line 341
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catchall_1
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Future;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 343
    :try_start_b
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    goto :goto_14

    .line 348
    :cond_1e
    :try_start_c
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 349
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 350
    sget v0, Ll/᩻᩶᩸;->ۙ:I

    int-to-float v0, v0

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float v0, v0, v2

    float-to-int v0, v0

    sput v0, Ll/᩻᩶᩸;->ۙ:I

    .line 351
    new-instance v0, Ll/֫᩶᩸;

    .line 389
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 351
    throw v0

    .line 332
    :catch_7
    invoke-static {v11}, Ll/᩻᩶᩸;->ۙ(Ljava/util/ArrayList;)V

    .line 333
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۨᩴ;

    .line 334
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ᩳ()Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto :goto_15

    .line 365
    :cond_1f
    :try_start_d
    invoke-interface {v12}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 367
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    const/4 v1, 0x0

    return-object v1

    :catchall_2
    move-exception v0

    .line 365
    :try_start_e
    invoke-interface {v12}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 366
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    :catchall_3
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_20

    .line 211
    :try_start_f
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    goto :goto_16

    :catchall_4
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_20
    :goto_16
    throw v2
.end method

.method public static ۙ(Ljava/util/ArrayList;)V
    .locals 2

    .line 393
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    const/4 v1, 0x1

    .line 394
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 396
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ljava/lang/CharSequence;)V
    .locals 5

    .line 403
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    .line 407
    new-instance v1, Ll/۟ܽۤ;

    new-instance v2, Ll/ۛܽۤ;

    new-instance v3, Ll/ܰܽۤ;

    const/4 v4, 0x0

    .line 446
    invoke-virtual {p0, v4}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object p0

    .line 407
    invoke-direct {v3, p0}, Ll/ܰܽۤ;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v2, v3}, Ll/ۛܽۤ;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {v1, v2}, Ll/۟ܽۤ;-><init>(Ljava/io/OutputStream;)V

    .line 408
    :try_start_0
    invoke-virtual {v1, p1, v4, v0}, Ll/۟ܽۤ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 409
    invoke-virtual {v1}, Ll/۟ܽۤ;->close()V

    return-void

    :catchall_0
    move-exception p0

    .line 407
    :try_start_1
    invoke-virtual {v1}, Ll/۟ܽۤ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method
