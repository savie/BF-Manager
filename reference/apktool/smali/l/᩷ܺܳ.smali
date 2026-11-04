.class public final Ll/᩷ܺܳ;
.super Ljava/lang/Object;
.source "F6G5"


# static fields
.field public static final ۙ:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    sput-object v0, Ll/᩷ܺܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public static ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;
    .locals 9

    .line 394
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "settings get --user "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " secure "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, p0

    move-wide v5, p3

    move-object v7, p5

    move-object v8, p6

    invoke-static/range {v1 .. v8}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;Ljava/lang/String;IZJLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ljava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;
    .locals 10

    .line 406
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "settings put --user "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move v1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " secure "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v1, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "\'\\\'\'"

    move-object v4, p3

    invoke-virtual {p3, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 406
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v2, p0

    move-wide v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 407
    invoke-static/range {v2 .. v9}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;Ljava/lang/String;IZJLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    return-object v0
.end method

.method public static ۙ(Ll/᩻۠ۧ;Ljava/lang/String;IZJLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;
    .locals 7

    const-string v1, "; } | while IFS= read -r mt_ar_line || [ -n \"$mt_ar_line\" ]; do print -r -- \"MT_AR_OUT:$mt_ar_line\"; done; print -r -- \'"

    const-string v2, "{ "

    const-string v3, "MT_AR_DONE:"

    move-object v0, p0

    .line 422
    monitor-enter v0

    .line 423
    :try_start_0
    invoke-interface {p6}, Ljava/util/function/LongSupplier;->getAsLong()J

    move-result-wide v4

    sub-long/2addr p4, v4

    const-wide/16 v4, 0x0

    const/4 p6, 0x0

    cmp-long v6, p4, v4

    if-gtz v6, :cond_0

    .line 74
    new-instance p0, Ll/ۙܺܳ;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p6}, Ll/ۙܺܳ;-><init>(Ljava/util/List;Z)V

    .line 425
    monitor-exit v0

    return-object p0

    :cond_0
    const-wide/16 v4, 0x9c4

    .line 427
    invoke-static {v4, v5, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    const/4 v4, 0x1

    if-eqz p3, :cond_1

    .line 429
    iput-boolean v4, p7, Ll/ۜ᩻ܳ;->ۙ:Z

    .line 435
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object p7, Ll/᩷ܺܳ;->ۙ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p7}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p7

    invoke-virtual {p3, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 436
    new-instance p7, Ljava/lang/StringBuilder;

    invoke-direct {p7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {p7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 442
    :try_start_1
    invoke-interface {p0, p4, p5, p1}, Ll/᩻۠ۧ;->ۙ(JLjava/lang/String;)Ll/ۧ۠ۧ;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 448
    :try_start_2
    iget-object p4, p1, Ll/ۧ۠ۧ;->ۙ:Ljava/lang/String;

    const-string p5, "Read shell timeout."

    const-string p7, "\\n"

    const/4 v1, -0x1

    .line 481
    invoke-virtual {p4, p7, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p4

    array-length p7, p4

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p7, :cond_3

    aget-object v2, p4, v1

    .line 482
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 p4, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p4, 0x0

    .line 449
    :goto_1
    invoke-interface {p0}, Ll/᩻۠ۧ;->ۙ()Z

    move-result p5

    .line 450
    new-instance p7, Ljava/util/ArrayList;

    invoke-direct {p7}, Ljava/util/ArrayList;-><init>()V

    .line 451
    iget-object v1, p1, Ll/ۧ۠ۧ;->᩷:[Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 464
    :goto_2
    array-length v5, v1

    if-ge v2, v5, :cond_6

    .line 465
    aget-object v5, v1, v2

    .line 466
    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    add-int/lit8 v3, v3, 0x1

    .line 468
    array-length v5, v1

    sub-int/2addr v5, v4

    if-eq v2, v5, :cond_5

    goto :goto_3

    :cond_4
    const-string v6, "MT_AR_OUT:"

    .line 471
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0xa

    .line 472
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    if-ne v3, v4, :cond_7

    const/4 p3, 0x1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 p3, 0x0

    :goto_4
    if-nez p4, :cond_8

    if-eqz p5, :cond_8

    if-nez p3, :cond_9

    .line 452
    instance-of p4, p0, Ll/֫۠ۧ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p4, :cond_9

    .line 491
    :cond_8
    :try_start_3
    invoke-interface {p0}, Ll/᩻۠ۧ;->close()V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 455
    :catch_0
    :cond_9
    :try_start_4
    invoke-virtual {p1}, Ll/ۧ۠ۧ;->᩷()Z

    move-result p0

    if-nez p0, :cond_b

    if-eqz p3, :cond_b

    invoke-virtual {p7}, Ljava/util/ArrayList;->size()I

    move-result p0

    if-eq p0, p2, :cond_a

    goto :goto_5

    .line 458
    :cond_a
    new-instance p0, Ll/ۙܺܳ;

    invoke-direct {p0, p7, v4}, Ll/ۙܺܳ;-><init>(Ljava/util/List;Z)V

    monitor-exit v0

    return-object p0

    .line 74
    :cond_b
    :goto_5
    new-instance p0, Ll/ۙܺܳ;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p6}, Ll/ۙܺܳ;-><init>(Ljava/util/List;Z)V

    .line 456
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object p0

    .line 491
    :catch_1
    :try_start_5
    invoke-interface {p0}, Ll/᩻۠ۧ;->close()V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 74
    :catch_2
    :try_start_6
    new-instance p0, Ll/ۙܺܳ;

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {p0, p1, p6}, Ll/ۙܺܳ;-><init>(Ljava/util/List;Z)V

    .line 445
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 459
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p0
.end method

.method public static ۙ(Landroid/app/Application;Ll/᩻۠ۧ;)Ll/۬᩻ܳ;
    .locals 31

    move-object/from16 v0, p0

    .line 82
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/4 v3, 0x0

    if-gt v2, v1, :cond_0

    .line 84
    invoke-static/range {p0 .. p0}, Ll/᩷ܺܳ;->ۙ(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 85
    :goto_0
    new-instance v4, Landroid/content/ComponentName;

    const-class v5, Lcom/google/android/accessibility/selecttospeak/SelectToSpeakService;

    invoke-direct {v4, v0, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v4}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v8

    .line 86
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/UserHandle;->hashCode()I

    move-result v4

    new-instance v17, Ll/ۖ᩻ܳ;

    invoke-direct/range {v17 .. v17}, Ljava/lang/Object;-><init>()V

    new-instance v26, Ll/ۡ᩻ܳ;

    invoke-direct/range {v26 .. v26}, Ljava/lang/Object;-><init>()V

    new-instance v27, Ll/۠᩻ܳ;

    invoke-direct/range {v27 .. v27}, Ljava/lang/Object;-><init>()V

    .line 176
    new-instance v7, Ll/ۜ᩻ܳ;

    .line 56
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 178
    :try_start_0
    invoke-virtual/range {v17 .. v17}, Ll/ۖ᩻ܳ;->getAsBoolean()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 179
    sget-object v0, Ll/۬᩻ܳ;->۟:Ll/۬᩻ܳ;

    return-object v0

    :cond_1
    if-eqz p1, :cond_1c

    .line 181
    invoke-interface/range {p1 .. p1}, Ll/᩻۠ۧ;->ۙ()Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_b

    .line 184
    :cond_2
    invoke-interface/range {p1 .. p1}, Ll/᩻۠ۧ;->getUid()I

    move-result v5

    if-eqz v5, :cond_3

    const/16 v6, 0x7d0

    if-eq v5, v6, :cond_3

    .line 186
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    return-object v0

    :cond_3
    if-eqz v1, :cond_4

    .line 189
    sget-object v0, Ll/۬᩻ܳ;->ۢ:Ll/۬᩻ܳ;

    return-object v0

    .line 192
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    const-wide/16 v9, 0x3a98

    add-long v28, v5, v9

    const/16 v1, 0x18

    if-lt v2, v1, :cond_9

    const-string v10, "am get-current-user"

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object/from16 v9, p1

    move-wide/from16 v13, v28

    move-object/from16 v15, v26

    move-object/from16 v16, v7

    .line 195
    invoke-static/range {v9 .. v16}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;Ljava/lang/String;IZJLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v1

    .line 197
    iget-boolean v5, v1, Ll/ۙܺܳ;->᩷:Z

    if-nez v5, :cond_6

    .line 497
    iget-boolean v0, v7, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_5

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    return-object v0

    .line 499
    :cond_5
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    return-object v0

    .line 201
    :cond_6
    :try_start_1
    iget-object v1, v1, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    if-eq v1, v4, :cond_7

    .line 206
    :try_start_2
    sget-object v0, Ll/۬᩻ܳ;->ۢ:Ll/۬᩻ܳ;

    return-object v0

    :cond_7
    move/from16 v30, v1

    goto :goto_1

    .line 497
    :catch_0
    iget-boolean v0, v7, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_8

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    goto/16 :goto_d

    .line 499
    :cond_8
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    goto/16 :goto_d

    :cond_9
    move/from16 v30, v4

    :goto_1
    const-string v11, "enabled_accessibility_services"

    move-object/from16 v9, p1

    move/from16 v10, v30

    move-wide/from16 v12, v28

    move-object/from16 v14, v26

    move-object v15, v7

    .line 210
    invoke-static/range {v9 .. v15}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v1

    .line 212
    iget-boolean v4, v1, Ll/ۙܺܳ;->᩷:Z

    if-nez v4, :cond_b

    .line 497
    iget-boolean v0, v7, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_a

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    return-object v0

    .line 499
    :cond_a
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    return-object v0

    :catch_1
    move-object v15, v7

    goto/16 :goto_9

    .line 215
    :cond_b
    iget-object v1, v1, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 216
    invoke-static {v1, v8}, Ll/᩷ܺܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v1, :cond_d

    const-wide/16 v9, 0x3e8

    move-wide/from16 v11, v28

    move-object/from16 v13, v17

    move-object/from16 v14, v26

    move-object/from16 v15, v27

    .line 282
    :try_start_3
    invoke-static/range {v9 .. v15}, Ll/᩷ܺܳ;->ۙ(JJLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;)Z

    move-result v0

    if-nez v0, :cond_c

    move-object/from16 v0, p1

    move/from16 v1, v30

    move-wide/from16 v3, v28

    move-object/from16 v5, v26

    move-object v6, v7

    .line 285
    invoke-static/range {v0 .. v6}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;IIJLl/ۡ᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v0, :cond_c

    return-object v0

    :cond_c
    move-object/from16 v6, p1

    move-object v5, v7

    move/from16 v7, v30

    move-wide/from16 v9, v28

    move-object/from16 v11, v17

    move-object/from16 v12, v26

    move-object/from16 v13, v27

    move-object v14, v5

    .line 291
    :try_start_4
    invoke-static/range {v6 .. v14}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;

    move-result-object v0

    return-object v0

    :catch_2
    move-object v5, v7

    goto/16 :goto_8

    :cond_d
    move-object v5, v7

    move-object/from16 v16, p1

    .line 223
    monitor-enter v16
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_3

    :try_start_5
    const-string v11, "enabled_accessibility_services"

    move-object/from16 v9, p1

    move/from16 v10, v30

    move-wide/from16 v12, v28

    move-object/from16 v14, v26

    move-object v15, v5

    .line 224
    invoke-static/range {v9 .. v15}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v1

    .line 226
    iget-boolean v4, v1, Ll/ۙܺܳ;->᩷:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-nez v4, :cond_f

    .line 497
    :try_start_6
    iget-boolean v0, v5, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_e

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    goto :goto_2

    .line 499
    :cond_e
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    .line 227
    :goto_2
    monitor-exit v16
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v7, v5

    goto/16 :goto_a

    .line 229
    :cond_f
    :try_start_7
    iget-object v1, v1, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 230
    invoke-static {v1, v8}, Ll/᩷ܺܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v4, :cond_10

    goto/16 :goto_7

    :cond_10
    if-eqz v1, :cond_12

    .line 522
    :try_start_8
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_12

    const-string v6, "null"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto :goto_3

    .line 525
    :cond_11
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_4

    :cond_12
    :goto_3
    move-object v1, v8

    .line 89
    :goto_4
    :try_start_9
    invoke-static {v0, v1}, Ll/ܳܺܳ;->ۙ(Landroid/app/Application;Ljava/lang/String;)Ll/ᩴܺܳ;

    move-result-object v0

    const-string v20, "enabled_accessibility_services"

    move-object/from16 v18, p1

    move/from16 v19, v30

    move-object/from16 v21, v1

    move-wide/from16 v22, v28

    move-object/from16 v24, v26

    move-object/from16 v25, v5

    .line 236
    invoke-static/range {v18 .. v25}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ljava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v1

    .line 238
    iget-boolean v1, v1, Ll/ۙܺܳ;->᩷:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    if-nez v1, :cond_14

    .line 497
    :try_start_a
    iget-boolean v0, v5, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_13

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    goto :goto_5

    .line 499
    :cond_13
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    .line 239
    :goto_5
    monitor-exit v16
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    return-object v0

    .line 241
    :cond_14
    :try_start_b
    invoke-virtual {v0}, Ll/ᩴܺܳ;->run()V

    const-string v11, "enabled_accessibility_services"

    move-object/from16 v9, p1

    move/from16 v10, v30

    move-wide/from16 v12, v28

    move-object/from16 v14, v26

    move-object v15, v5

    .line 242
    invoke-static/range {v9 .. v15}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    .line 244
    iget-boolean v1, v0, Ll/ۙܺܳ;->᩷:Z

    if-nez v1, :cond_16

    .line 497
    iget-boolean v0, v5, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_15

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    goto :goto_6

    .line 499
    :cond_15
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    .line 245
    :goto_6
    monitor-exit v16

    return-object v0

    .line 247
    :cond_16
    iget-object v0, v0, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Ll/᩷ܺܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_17

    .line 248
    sget-object v0, Ll/۬᩻ܳ;->֡:Ll/۬᩻ܳ;

    monitor-exit v16

    return-object v0

    .line 252
    :cond_17
    :goto_7
    monitor-exit v16
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    if-eqz v4, :cond_1a

    const-wide/16 v9, 0x3e8

    move-wide/from16 v11, v28

    move-object/from16 v13, v17

    move-object/from16 v14, v26

    move-object/from16 v15, v27

    .line 282
    :try_start_c
    invoke-static/range {v9 .. v15}, Ll/᩷ܺܳ;->ۙ(JJLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;)Z

    move-result v0
    :try_end_c
    .catch Ljava/lang/RuntimeException; {:try_start_c .. :try_end_c} :catch_3

    if-nez v0, :cond_18

    move-object/from16 v0, p1

    move/from16 v1, v30

    move-wide/from16 v3, v28

    move-object v15, v5

    move-object/from16 v5, v26

    move-object v6, v15

    .line 285
    :try_start_d
    invoke-static/range {v0 .. v6}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;IIJLl/ۡ᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;

    move-result-object v0

    if-eqz v0, :cond_19

    return-object v0

    :cond_18
    move-object v15, v5

    :cond_19
    move-object/from16 v6, p1

    move/from16 v7, v30

    move-wide/from16 v9, v28

    move-object/from16 v11, v17

    move-object/from16 v12, v26

    move-object/from16 v13, v27

    move-object v14, v15

    .line 291
    invoke-static/range {v6 .. v14}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;

    move-result-object v0

    return-object v0

    :catch_3
    :goto_8
    move-object v15, v5

    :catch_4
    :goto_9
    move-object v7, v15

    goto :goto_c

    :cond_1a
    move-object v15, v5

    move-object/from16 v0, p1

    move/from16 v1, v30

    move-wide/from16 v3, v28

    move-object/from16 v5, v26

    move-object v6, v15

    .line 258
    invoke-static/range {v0 .. v6}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;IIJLl/ۡ᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;

    move-result-object v0

    if-eqz v0, :cond_1b

    return-object v0

    :cond_1b
    move-object/from16 v6, p1

    move/from16 v7, v30

    move-wide/from16 v9, v28

    move-object/from16 v11, v17

    move-object/from16 v12, v26

    move-object/from16 v13, v27

    move-object v14, v15

    .line 263
    invoke-static/range {v6 .. v14}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/RuntimeException; {:try_start_d .. :try_end_d} :catch_4

    return-object v0

    :catchall_1
    move-exception v0

    move-object v15, v5

    move-object v7, v15

    .line 252
    :goto_a
    :try_start_e
    monitor-exit v16
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :try_start_f
    throw v0
    :try_end_f
    .catch Ljava/lang/RuntimeException; {:try_start_f .. :try_end_f} :catch_5

    :catch_5
    nop

    goto :goto_c

    :catchall_2
    move-exception v0

    goto :goto_a

    :cond_1c
    :goto_b
    move-object v15, v7

    .line 182
    :try_start_10
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;
    :try_end_10
    .catch Ljava/lang/RuntimeException; {:try_start_10 .. :try_end_10} :catch_4

    return-object v0

    .line 497
    :goto_c
    iget-boolean v0, v7, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_1d

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    goto :goto_d

    .line 499
    :cond_1d
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    :goto_d
    return-object v0
.end method

.method public static ۙ(Ll/᩻۠ۧ;IIJLl/ۡ᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;
    .locals 11

    move-object/from16 v8, p6

    const/16 v0, 0x18

    move v1, p2

    if-lt v1, v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v2, "accessibility_enabled"

    move-object v0, p0

    move v1, p1

    move-wide v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 307
    invoke-static/range {v0 .. v6}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    .line 309
    iget-boolean v1, v0, Ll/ۙܺܳ;->᩷:Z

    if-nez v1, :cond_2

    .line 497
    iget-boolean v0, v8, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_1

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    return-object v0

    .line 499
    :cond_1
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    return-object v0

    .line 312
    :cond_2
    iget-object v0, v0, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    const/4 v9, 0x0

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v10, "1"

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const-string v2, "accessibility_enabled"

    const-string v3, "1"

    move-object v0, p0

    move v1, p1

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    .line 315
    invoke-static/range {v0 .. v7}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ljava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    .line 317
    iget-boolean v0, v0, Ll/ۙܺܳ;->᩷:Z

    if-nez v0, :cond_5

    .line 497
    iget-boolean v0, v8, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_4

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    return-object v0

    .line 499
    :cond_4
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    return-object v0

    :cond_5
    const-string v2, "accessibility_enabled"

    move-object v0, p0

    move v1, p1

    move-wide v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 320
    invoke-static/range {v0 .. v6}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    .line 322
    iget-boolean v1, v0, Ll/ۙܺܳ;->᩷:Z

    if-eqz v1, :cond_7

    iget-object v0, v0, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 497
    :cond_7
    :goto_1
    iget-boolean v0, v8, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_8

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    return-object v0

    .line 499
    :cond_8
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    return-object v0
.end method

.method public static ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;Ll/ۜ᩻ܳ;)Ll/۬᩻ܳ;
    .locals 9

    .line 339
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sub-long v0, p3, v0

    const-wide/16 v2, 0x9c4

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    .line 340
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x1f40

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    .line 341
    invoke-static/range {v2 .. v8}, Ll/᩷ܺܳ;->ۙ(JJLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;)Z

    const-string v4, "enabled_accessibility_services"

    move-object v2, p0

    move v3, p1

    move-wide v5, p3

    move-object/from16 v8, p8

    .line 343
    invoke-static/range {v2 .. v8}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    .line 345
    iget-boolean v1, v0, Ll/ۙܺܳ;->᩷:Z

    if-nez v1, :cond_1

    move-object/from16 v1, p8

    .line 497
    iget-boolean v0, v1, Ll/ۜ᩻ܳ;->ۙ:Z

    if-eqz v0, :cond_0

    .line 498
    sget-object v0, Ll/۬᩻ܳ;->ᩳ:Ll/۬᩻ܳ;

    return-object v0

    .line 499
    :cond_0
    sget-object v0, Ll/۬᩻ܳ;->ܿ:Ll/۬᩻ܳ;

    return-object v0

    .line 348
    :cond_1
    iget-object v0, v0, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v1, p2

    invoke-static {v0, p2}, Ll/᩷ܺܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 350
    sget-object v0, Ll/۬᩻ܳ;->֡:Ll/۬᩻ܳ;

    return-object v0

    .line 353
    :cond_2
    invoke-virtual {p5}, Ll/ۖ᩻ܳ;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Ll/۬᩻ܳ;->᩶:Ll/۬᩻ܳ;

    return-object v0

    .line 354
    :cond_3
    sget-object v0, Ll/۬᩻ܳ;->۟:Ll/۬᩻ܳ;

    return-object v0
.end method

.method public static ۙ(JJLl/ۖ᩻ܳ;Ll/ۡ᩻ܳ;Ll/۠᩻ܳ;)Z
    .locals 4

    .line 365
    invoke-virtual {p4}, Ll/ۖ᩻ܳ;->getAsBoolean()Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_0

    .line 368
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p5

    const-wide/16 v0, 0x0

    .line 369
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    add-long/2addr p0, p5

    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    .line 370
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    cmp-long p5, p2, p0

    if-gez p5, :cond_4

    .line 371
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p2

    const-wide/16 p5, 0xc8

    sub-long v2, p0, p2

    .line 372
    invoke-static {p5, p6, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p5

    cmp-long v2, p5, v0

    if-gtz v2, :cond_2

    goto :goto_1

    .line 377
    :cond_2
    invoke-static {p5, p6}, Landroid/os/SystemClock;->sleep(J)V

    .line 378
    invoke-virtual {p4}, Ll/ۖ᩻ܳ;->getAsBoolean()Z

    move-result p5

    if-eqz p5, :cond_3

    :goto_0
    const/4 p0, 0x1

    return p0

    .line 381
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p5

    cmp-long v2, p5, p2

    if-gtz v2, :cond_1

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Landroid/content/Context;)Z
    .locals 2

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "user"

    .line 94
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/UserManager;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {p0}, Landroid/os/UserManager;->getUserProfiles()Ljava/util/List;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_2

    .line 96
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    if-eq p0, v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    return p0

    :catch_0
    :cond_2
    :goto_1
    return v0
.end method

.method public static ۙ(Landroid/content/Context;Ll/᩻۠ۧ;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 104
    invoke-interface {p1}, Ll/᩻۠ۧ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/᩻۠ۧ;->᩷()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 105
    invoke-static {p0}, Ll/᩷ܺܳ;->ۙ(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 503
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "null"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 506
    :cond_0
    invoke-static {p1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    const-string v1, ":"

    const/4 v2, -0x1

    .line 510
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p0, v2

    .line 511
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 512
    invoke-static {v3}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v3

    .line 513
    invoke-virtual {p1, v3}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ll/ۡ᩻ܳ;)Z
    .locals 16

    move-object/from16 v0, p2

    const/4 v1, 0x0

    .line 124
    :try_start_0
    invoke-interface/range {p0 .. p0}, Ll/᩻۠ۧ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface/range {p0 .. p0}, Ll/᩻۠ۧ;->᩷()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_5

    .line 125
    :cond_0
    invoke-static/range {p2 .. p2}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    .line 127
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    const-wide/16 v5, 0x3a98

    add-long/2addr v3, v5

    .line 128
    new-instance v5, Ll/ۜ᩻ܳ;

    .line 56
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    move-object/from16 v15, p0

    .line 129
    monitor-enter v15
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v9, "enabled_accessibility_services"

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-wide v10, v3

    move-object/from16 v12, p3

    move-object v13, v5

    .line 130
    invoke-static/range {v7 .. v13}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v6

    .line 132
    iget-boolean v7, v6, Ll/ۙܺܳ;->᩷:Z

    if-nez v7, :cond_2

    monitor-exit v15

    return v1

    .line 133
    :cond_2
    iget-object v6, v6, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 134
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "null"

    .line 135
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    const-string v8, ":"

    const/4 v9, -0x1

    .line 136
    invoke-virtual {v6, v8, v9}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_6

    aget-object v11, v8, v10

    .line 137
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_5

    invoke-static {v11}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v12

    invoke-virtual {v2, v12}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_1

    .line 138
    :cond_3
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x3a

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    :cond_4
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 142
    :cond_6
    invoke-static {v6, v0}, Ll/᩷ܺܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v9, "enabled_accessibility_services"

    .line 143
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-wide v11, v3

    move-object/from16 v13, p3

    move-object v14, v5

    invoke-static/range {v7 .. v14}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ljava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v2

    iget-boolean v2, v2, Ll/ۙܺܳ;->᩷:Z

    if-nez v2, :cond_7

    .line 144
    monitor-exit v15

    return v1

    :cond_7
    const-string v9, "enabled_accessibility_services"

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-wide v10, v3

    move-object/from16 v12, p3

    move-object v13, v5

    .line 145
    invoke-static/range {v7 .. v13}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v2

    .line 147
    iget-boolean v6, v2, Ll/ۙܺܳ;->᩷:Z

    if-eqz v6, :cond_d

    iget-object v6, v2, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6, v0}, Ll/᩷ܺܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_4

    .line 149
    :cond_8
    iget-object v0, v2, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 150
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v6, 0x1

    if-nez v2, :cond_a

    const-string v2, "null"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_2

    .line 157
    :cond_9
    monitor-exit v15

    return v6

    :cond_a
    :goto_2
    const-string v9, "accessibility_enabled"

    const-string v10, "0"

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-wide v11, v3

    move-object/from16 v13, p3

    move-object v14, v5

    .line 151
    invoke-static/range {v7 .. v14}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ljava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    iget-boolean v0, v0, Ll/ۙܺܳ;->᩷:Z

    if-nez v0, :cond_b

    .line 152
    monitor-exit v15

    return v1

    :cond_b
    const-string v9, "accessibility_enabled"

    move-object/from16 v7, p0

    move/from16 v8, p1

    move-wide v10, v3

    move-object/from16 v12, p3

    move-object v13, v5

    .line 153
    invoke-static/range {v7 .. v13}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;JLjava/util/function/LongSupplier;Ll/ۜ᩻ܳ;)Ll/ۙܺܳ;

    move-result-object v0

    .line 155
    iget-boolean v2, v0, Ll/ۙܺܳ;->᩷:Z

    if-eqz v2, :cond_c

    const-string v2, "0"

    iget-object v0, v0, Ll/ۙܺܳ;->ۙ:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    const/4 v6, 0x0

    :goto_3
    monitor-exit v15

    return v6

    .line 147
    :cond_d
    :goto_4
    monitor-exit v15

    return v1

    :catchall_0
    move-exception v0

    .line 158
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_e
    :goto_5
    return v1
.end method
