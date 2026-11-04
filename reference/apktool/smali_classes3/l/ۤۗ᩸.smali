.class public final Ll/ۤۗ᩸;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ll/᩸ۗ᩸;

.field public final ֨:J

.field public ۟:Ll/ܳۗ᩸;

.field public ۡ:Ll/ۨۤᩴ;

.field public final ۢ:I

.field public ܰ:Ll/᩷ۗ᩸;

.field public ܿ:Ll/ۗۙᩴ;

.field public final ᩳ:Ll/᩸ۗ᩸;

.field public ᩶:Ll/ۗܶ᩸;


# direct methods
.method public constructor <init>([BLl/ܿۢ᩸;Ll/ܳۗ᩸;Ll/ۗܶ᩸;Ll/ۨۤᩴ;Ll/ۗۙᩴ;Ll/᩸ۗ᩸;Ll/᩸ۗ᩸;JI)V
    .locals 1

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    new-instance v0, Ll/᩷ۗ᩸;

    invoke-direct {v0, p1, p2}, Ll/᩷ۗ᩸;-><init>([BLl/ܿۢ᩸;)V

    iput-object v0, p0, Ll/ۤۗ᩸;->ܰ:Ll/᩷ۗ᩸;

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 374
    :cond_0
    invoke-virtual {p3}, Ll/ܳۗ᩸;->۠᩷()V

    :goto_0
    iput-object p3, p0, Ll/ۤۗ᩸;->۟:Ll/ܳۗ᩸;

    .line 375
    iput-object p4, p0, Ll/ۤۗ᩸;->᩶:Ll/ۗܶ᩸;

    iput-object p5, p0, Ll/ۤۗ᩸;->ۡ:Ll/ۨۤᩴ;

    iput-object p6, p0, Ll/ۤۗ᩸;->ܿ:Ll/ۗۙᩴ;

    .line 376
    iput-object p7, p0, Ll/ۤۗ᩸;->ᩳ:Ll/᩸ۗ᩸;

    iput-object p8, p0, Ll/ۤۗ᩸;->֡:Ll/᩸ۗ᩸;

    .line 377
    iput-wide p9, p0, Ll/ۤۗ᩸;->֨:J

    iput p11, p0, Ll/ۤۗ᩸;->ۢ:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x0

    .line 416
    iput-object v0, p0, Ll/ۤۗ᩸;->᩶:Ll/ۗܶ᩸;

    iput-object v0, p0, Ll/ۤۗ᩸;->ۡ:Ll/ۨۤᩴ;

    iput-object v0, p0, Ll/ۤۗ᩸;->ܿ:Ll/ۗۙᩴ;

    .line 417
    iget-object v1, p0, Ll/ۤۗ᩸;->۟:Ll/ܳۗ᩸;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܳۗ᩸;->close()V

    iput-object v0, p0, Ll/ۤۗ᩸;->۟:Ll/ܳۗ᩸;

    .line 418
    :cond_0
    iget-object v1, p0, Ll/ۤۗ᩸;->ܰ:Ll/᩷ۗ᩸;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/᩷ۗ᩸;->close()V

    iput-object v0, p0, Ll/ۤۗ᩸;->ܰ:Ll/᩷ۗ᩸;

    :cond_1
    return-void
.end method

.method public final ۙ(Ll/ۜܿ᩸;I)Ll/۫ۗ᩸;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p2

    .line 386
    invoke-virtual/range {p0 .. p0}, Ll/ۤۗ᩸;->ۙ()[B

    move-result-object v3

    if-ltz v2, :cond_7

    .line 387
    array-length v4, v3

    if-gt v4, v2, :cond_7

    .line 388
    invoke-virtual/range {p1 .. p1}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v4

    iget-wide v6, v1, Ll/ۤۗ᩸;->֨:J

    cmp-long v8, v4, v6

    if-nez v8, :cond_6

    invoke-virtual/range {p1 .. p1}, Ll/۠ܿ᩸;->length()I

    move-result v4

    iget v5, v1, Ll/ۤۗ᩸;->ۢ:I

    if-ne v4, v5, :cond_6

    .line 391
    array-length v4, v3

    iget-object v5, v1, Ll/ۤۗ᩸;->ᩳ:Ll/᩸ۗ᩸;

    iget v6, v5, Ll/᩸ۗ᩸;->ۙ:I

    sub-int/2addr v4, v6

    int-to-long v6, v4

    const-wide/16 v8, 0x10

    mul-long v8, v8, v6

    const-wide/16 v10, 0x400

    add-long/2addr v8, v10

    .line 392
    invoke-virtual {v0, v8, v9}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v4

    const-wide/16 v8, 0x4

    mul-long v6, v6, v8

    const-wide/16 v8, 0x2000

    add-long/2addr v6, v8

    const/4 v8, 0x0

    .line 395
    :try_start_0
    invoke-virtual {v0, v6, v7}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 396
    :try_start_1
    iget-object v7, v1, Ll/ۤۗ᩸;->۟:Ll/ܳۗ᩸;

    if-nez v7, :cond_0

    iget-object v7, v1, Ll/ۤۗ᩸;->ܰ:Ll/᩷ۗ᩸;

    invoke-static {v7, v5, v2, v0}, Ll/ܳۗ᩸;->ۙ(Ll/᩷ۗ᩸;Ll/᩸ۗ᩸;ILl/ۜܿ᩸;)Ll/ܳۗ᩸;

    move-result-object v0

    move-object v8, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v7}, Ll/ܳۗ᩸;->۠᩷()V

    move-object v8, v7

    .line 397
    :goto_0
    iget-object v0, v1, Ll/ۤۗ᩸;->ܿ:Ll/ۗۙᩴ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v5, v1, Ll/ۤۗ᩸;->֡:Ll/᩸ۗ᩸;

    if-nez v0, :cond_1

    .line 398
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v5, Ll/᩸ۗ᩸;->ۙ:I

    .line 490
    new-instance v7, Ljava/io/ByteArrayInputStream;

    iget v9, v5, Ll/᩸ۗ᩸;->᩷:I

    invoke-direct {v7, v3, v9, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    int-to-long v9, v0

    .line 398
    invoke-static {v7, v9, v10, v2}, Ll/ۗۙᩴ;->ۙ(Ljava/io/ByteArrayInputStream;JI)Ll/ۗۙᩴ;

    move-result-object v0

    :cond_1
    move-object v13, v0

    .line 399
    new-instance v0, Ll/۫ۗ᩸;

    iget-object v10, v1, Ll/ۤۗ᩸;->᩶:Ll/ۗܶ᩸;

    iget-object v11, v1, Ll/ۤۗ᩸;->ۡ:Ll/ۨۤᩴ;

    invoke-static {v8}, Ll/ܳۗ᩸;->᩷(Ll/ܳۗ᩸;)Ll/᩵ۙᩴ;

    move-result-object v12

    iget-wide v14, v1, Ll/ۤۗ᩸;->֨:J

    iget v2, v1, Ll/ۤۗ᩸;->ۢ:I

    .line 491
    iget v7, v5, Ll/᩸ۗ᩸;->᩷:I

    iget v5, v5, Ll/᩸ۗ᩸;->ۙ:I

    add-int/2addr v5, v7

    invoke-static {v3, v7, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v17

    move-object v9, v0

    move/from16 v16, v2

    .line 400
    invoke-direct/range {v9 .. v17}, Ll/۫ۗ᩸;-><init>(Ll/ۗܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JI[B)V

    .line 401
    invoke-static {v0, v4}, Ll/۫ۗ᩸;->ۙ(Ll/۫ۗ᩸;Ll/ܿۢ᩸;)V

    invoke-static {v0, v8}, Ll/۫ۗ᩸;->ۙ(Ll/۫ۗ᩸;Ll/ܳۗ᩸;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v6, :cond_2

    .line 404
    :try_start_3
    invoke-virtual {v6}, Ll/ܿۢ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v0

    if-eqz v6, :cond_3

    .line 395
    :try_start_4
    invoke-virtual {v6}, Ll/ܿۢ᩸;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_5

    if-eqz v8, :cond_4

    .line 406
    invoke-virtual {v8}, Ll/ܳۗ᩸;->close()V

    :cond_4
    if-eqz v4, :cond_5

    .line 407
    invoke-virtual {v4}, Ll/ܿۢ᩸;->close()V

    .line 409
    :cond_5
    throw v0

    .line 389
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Fragment state belongs to another text revision"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 387
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Fragment state exceeds recovery limit"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ()[B
    .locals 2

    .line 380
    iget-object v0, p0, Ll/ۤۗ᩸;->ܰ:Ll/᩷ۗ᩸;

    if-eqz v0, :cond_0

    .line 381
    invoke-virtual {v0}, Ll/᩷ۗ᩸;->ۙ()[B

    move-result-object v0

    return-object v0

    .line 380
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment record is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷(J)Ll/ܿۢ᩸;
    .locals 1

    .line 412
    invoke-virtual {p0}, Ll/ۤۗ᩸;->ۙ()[B

    .line 413
    iget-object v0, p0, Ll/ۤۗ᩸;->ܰ:Ll/᩷ۗ᩸;

    iget-object v0, v0, Ll/᩷ۗ᩸;->᩶:Ll/ܿۢ᩸;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Ll/ܿۢ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object p1

    return-object p1
.end method
