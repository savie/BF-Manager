.class public final Ll/۬᩷ۨ;
.super Ljava/lang/Object;


# static fields
.field public static final ۙ:Ll/ۜ᩷ۨ;

.field public static final ᩷:Ll/ۜ᩷ۨ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 8
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۬᩷ۨ;->᩷:Ll/ۜ᩷ۨ;

    .line 10
    new-instance v0, Ll/ۜ᩷ۨ;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Ll/ۜ᩷ۨ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/۬᩷ۨ;->ۙ:Ll/ۜ᩷ۨ;

    return-void
.end method

.method public static ۙ(IILjava/lang/String;)I
    .locals 7

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    const p1, 0x1ffffe

    :goto_0
    int-to-long v1, p0

    const/4 p0, 0x1

    int-to-long v3, p0

    int-to-long v5, p1

    move-object v0, p2

    .line 31
    invoke-static/range {v0 .. v6}, Ll/۬᩷ۨ;->ۙ(Ljava/lang/String;JJJ)J

    move-result-wide p0

    long-to-int p1, p0

    return p1
.end method

.method public static final ۙ(Ljava/lang/String;JJJ)J
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move-wide/from16 v3, p5

    .line 46
    invoke-static/range {p0 .. p0}, Ll/۬᩷ۨ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    return-wide p1

    .line 164
    :cond_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    .line 171
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x30

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-ge v8, v9, :cond_5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_2

    goto :goto_2

    :cond_2
    const/16 v9, 0x2b

    if-eq v8, v9, :cond_4

    const/16 v9, 0x2d

    if-eq v8, v9, :cond_3

    goto :goto_2

    :cond_3
    const-wide/high16 v10, -0x8000000000000000L

    const/4 v8, 0x1

    goto :goto_0

    :cond_4
    const/4 v7, 0x1

    :cond_5
    const/4 v8, 0x0

    move v8, v7

    const/4 v7, 0x0

    :goto_0
    const-wide/16 v12, 0x0

    const-wide v14, -0x38e38e38e38e38eL    # -2.772000429909333E291

    :goto_1
    if-ge v8, v6, :cond_a

    .line 197
    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const-wide v16, -0x38e38e38e38e38eL    # -2.772000429909333E291

    move/from16 p1, v6

    const/16 v6, 0xa

    .line 303
    invoke-static {v9, v6}, Ljava/lang/Character;->digit(II)I

    move-result v9

    if-gez v9, :cond_6

    goto :goto_2

    :cond_6
    cmp-long v18, v12, v14

    if-gez v18, :cond_7

    cmp-long v18, v14, v16

    if-nez v18, :cond_8

    int-to-long v14, v6

    .line 202
    div-long v14, v10, v14

    cmp-long v16, v12, v14

    if-gez v16, :cond_7

    goto :goto_2

    :cond_7
    move-wide/from16 v16, v14

    int-to-long v14, v6

    mul-long v12, v12, v14

    int-to-long v14, v9

    add-long v18, v10, v14

    cmp-long v6, v12, v18

    if-gez v6, :cond_9

    :cond_8
    :goto_2
    const/4 v6, 0x0

    goto :goto_3

    :cond_9
    sub-long/2addr v12, v14

    add-int/lit8 v8, v8, 0x1

    move/from16 v6, p1

    move-wide/from16 v14, v16

    goto :goto_1

    :cond_a
    if-eqz v7, :cond_b

    .line 219
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_3

    :cond_b
    neg-long v6, v12

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    :goto_3
    const/16 v7, 0x27

    const-string v8, "System property \'"

    if-eqz v6, :cond_d

    .line 47
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v9, v1, v5

    if-gtz v9, :cond_c

    cmp-long v9, v5, v3

    if-gtz v9, :cond_c

    return-wide v5

    .line 49
    :cond_c
    new-instance v9, Ljava/lang/IllegalStateException;

    .line 50
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' should be in range "

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".."

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", but is \'"

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v9, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v9

    .line 47
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 48
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' has unrecognized value \'"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget v0, Ll/ۙۤۨ;->ۙ:I

    .line 13
    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final synthetic ۙ()Ll/ۜ᩷ۨ;
    .locals 1

    .line 1
    sget-object v0, Ll/۬᩷ۨ;->᩷:Ll/ۜ᩷ۨ;

    return-object v0
.end method

.method public static final ۙ(Ljava/lang/Object;Ll/ۙۢ᩵;)V
    .locals 6

    .line 278
    instance-of v0, p1, Ll/᩻᩷ۨ;

    if-eqz v0, :cond_8

    check-cast p1, Ll/᩻᩷ۨ;

    iget-object v0, p1, Ll/᩻᩷ۨ;->ۢ:Ll/ᩳ۠᩵;

    iget-object v1, p1, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    .line 10
    invoke-static {p0}, Ll/᩸۟᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v3, p0

    goto :goto_0

    .line 12
    :cond_0
    new-instance v3, Ll/ۨ۠᩵;

    const/4 v4, 0x0

    .line 38
    invoke-direct {v3, v2, v4}, Ll/ۨ۠᩵;-><init>(Ljava/lang/Throwable;Z)V

    .line 0
    :goto_0
    invoke-interface {v1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    .line 315
    invoke-virtual {v0}, Ll/ᩳ۠᩵;->᩷()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 316
    iput-object v3, p1, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    .line 317
    iput v4, p1, Ll/۫ۜ᩵;->ܿ:I

    .line 0
    invoke-interface {v1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p0

    .line 318
    invoke-virtual {v0, p0, p1}, Ll/ᩳ۠᩵;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V

    return-void

    .line 327
    :cond_1
    invoke-static {}, Ll/᩹۬᩵;->ۙ()Ll/ܺۜ᩵;

    move-result-object v0

    .line 330
    invoke-virtual {v0}, Ll/ܺۜ᩵;->ۗ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 332
    iput-object v3, p1, Ll/᩻᩷ۨ;->֡:Ljava/lang/Object;

    .line 333
    iput v4, p1, Ll/۫ۜ᩵;->ܿ:I

    .line 334
    invoke-virtual {v0, p1}, Ll/ܺۜ᩵;->ۙ(Ll/۫ۜ᩵;)V

    goto :goto_4

    .line 339
    :cond_2
    invoke-virtual {v0, v4}, Ll/ܺۜ᩵;->ۙ(Z)V

    const/4 v2, 0x0

    .line 0
    :try_start_0
    invoke-interface {v1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v4

    .line 343
    sget-object v5, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    invoke-interface {v4, v5}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object v4

    check-cast v4, Ll/ۡۜ᩵;

    if-eqz v4, :cond_3

    .line 344
    invoke-interface {v4}, Ll/ۡۜ᩵;->ۤ()Z

    move-result v5

    if-nez v5, :cond_3

    .line 345
    invoke-interface {v4}, Ll/ۡۜ᩵;->ܳ()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    .line 346
    invoke-virtual {p1, v3, p0}, Ll/᩻᩷ۨ;->ۙ(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 347
    invoke-static {p0}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩻᩷ۨ;->ۙ(Ljava/lang/Object;)V

    goto :goto_2

    .line 352
    :cond_3
    iget-object v3, p1, Ll/᩻᩷ۨ;->ᩳ:Ljava/lang/Object;

    .line 353
    invoke-interface {v1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v4

    .line 354
    invoke-static {v4, v3}, Ll/ᩴۤۨ;->᩷(Ll/ۧۢ᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 355
    sget-object v5, Ll/ᩴۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    if-eq v3, v5, :cond_4

    .line 357
    invoke-static {v1, v4}, Ll/ܿ۠᩵;->ۙ(Ll/ۙۢ᩵;Ll/ۧۢ᩵;)Ll/᩵۬᩵;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_4
    move-object v5, v2

    .line 363
    :goto_1
    :try_start_1
    invoke-virtual {v1, p0}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;)V

    .line 364
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_6

    .line 366
    :try_start_2
    invoke-static {v4, v3}, Ll/ᩴۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V

    .line 371
    :cond_5
    :goto_2
    invoke-virtual {v0}, Ll/ܺۜ᩵;->᩶()Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_3

    .line 365
    :cond_6
    invoke-virtual {v5}, Ll/᩵۬᩵;->ܶ()V

    throw v2

    :catchall_0
    move-exception p0

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ll/᩵۬᩵;->ܶ()V

    throw v2

    .line 366
    :cond_7
    invoke-static {v4, v3}, Ll/ᩴۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p0

    .line 378
    :try_start_3
    invoke-virtual {p1, p0, v2}, Ll/۫ۜ᩵;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 380
    :goto_3
    invoke-virtual {v0}, Ll/ܺۜ᩵;->ܶ()V

    :goto_4
    return-void

    :catchall_2
    move-exception p0

    invoke-virtual {v0}, Ll/ܺۜ᩵;->ܶ()V

    throw p0

    .line 279
    :cond_8
    invoke-interface {p1, p0}, Ll/ۙۢ᩵;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public static final ᩷()I
    .locals 1

    .line 1
    invoke-static {}, Ll/ۙۤۨ;->ۙ()I

    move-result v0

    return v0
.end method
