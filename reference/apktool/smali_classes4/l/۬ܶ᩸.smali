.class public final Ll/۬ܶ᩸;
.super Ljava/lang/Object;
.source "36NN"


# instance fields
.field public ֫:Z

.field public final ۙ:[Z

.field public ۚ:Ljava/lang/String;

.field public ۤ:Landroid/os/Bundle;

.field public ۧ:I

.field public final ۫:Ljava/util/List;

.field public final ܳ:Ljava/lang/String;

.field public final ܺ:Ljava/lang/Object;

.field public ᩴ:Ll/᩹ܽ᩵;

.field public ᩷:I

.field public ᩸:I

.field public final ᩻:Ll/᩺۬᩹;


# direct methods
.method public constructor <init>(Ll/᩺۬᩹;Ljava/lang/String;Ljava/util/List;[ZLandroid/os/Bundle;IILjava/lang/String;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۬ܶ᩸;->ܺ:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 256
    invoke-static {v0}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object v0

    iput-object v0, p0, Ll/۬ܶ᩸;->ᩴ:Ll/᩹ܽ᩵;

    .line 42
    iput-object p1, p0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    iput-object p2, p0, Ll/۬ܶ᩸;->ܳ:Ljava/lang/String;

    .line 0
    new-instance p1, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 42
    iput-object p1, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    .line 43
    iput-object p4, p0, Ll/۬ܶ᩸;->ۙ:[Z

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Ll/۬ܶ᩸;->ۤ:Landroid/os/Bundle;

    iput p6, p0, Ll/۬ܶ᩸;->᩸:I

    .line 44
    iput p7, p0, Ll/۬ܶ᩸;->᩷:I

    iput-object p8, p0, Ll/۬ܶ᩸;->ۚ:Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ll/ܶ᩵᩸;Ll/ۡܰ᩸;ZLl/ۚ᩶᩸;Ll/ᩳ᩵᩸;Ll/۟֡֫;J)Ll/ܶ᩵᩸;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v10, p4

    move-wide/from16 v11, p6

    .line 366
    iget-object v2, v0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    iget-object v14, v2, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    .line 367
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "pages-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 368
    invoke-interface {v14, v15}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v13

    const/4 v9, 0x0

    new-array v2, v9, [Ll/۬۬᩹;

    .line 369
    invoke-static {v13, v2}, Ll/ۗ۬᩹;->createDirectory(Ll/᩺۬᩹;[Ll/۬۬᩹;)Ll/᩺۬᩹;

    const/16 v22, 0x0

    :try_start_0
    const-string v2, "creating_page"

    .line 373
    invoke-virtual {v0, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    const-string v2, "0"

    .line 374
    invoke-interface {v13, v2}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v2

    invoke-static {v2, v10}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/ᩳ᩵᩸;)Ll/ܶ᩵᩸;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v7, v8, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    const-string v2, "replacing_source_text"

    .line 375
    invoke-virtual {v0, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 376
    :goto_0
    iget-object v3, v1, Ll/ۚ᩶᩸;->᩸:Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_0

    .line 377
    invoke-static/range {p5 .. p5}, Ll/۬ܶ᩸;->ۙ(Ll/۟֡֫;)V

    int-to-long v4, v2

    const-wide/32 v16, 0x8000

    add-long v4, v4, v16

    .line 378
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v6

    int-to-long v9, v6

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    .line 379
    invoke-virtual {v8, v2, v5, v3}, Ll/ܶ᩵᩸;->ۙ(IILjava/lang/CharSequence;)V

    move-object/from16 v10, p4

    move v2, v5

    const/4 v9, 0x0

    goto :goto_0

    .line 381
    :cond_0
    iget-object v2, v0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v2, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v2, v2, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v2}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v10

    const-string v2, "e2SourcePending"

    const/4 v9, 0x0

    .line 382
    invoke-virtual {v10, v2, v9}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "changed"

    .line 383
    invoke-virtual {v10, v2, v9}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "error"

    invoke-virtual {v10, v2, v9}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v2, 0x1

    if-nez p2, :cond_1

    const-string v3, "fileTime"

    move-object/from16 v4, p1

    .line 73
    iget-object v4, v4, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v4

    .line 384
    invoke-virtual {v10, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v3, "checkFileExists"

    invoke-virtual {v10, v3, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_1
    const-wide/16 v2, 0x0

    .line 385
    invoke-static {v2, v3, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v7}, Ll/ۙܿ᩸;->length()I

    move-result v4

    int-to-long v4, v4

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v6, v2

    const-string v2, "persisting_source_pages"

    .line 386
    invoke-virtual {v0, v2}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 387
    iget-object v2, v0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v3, v2, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v5, v1, Ll/ۚ᩶᩸;->ۤ:Ll/᩸᩶᩸;

    iget-object v4, v1, Ll/ۚ᩶᩸;->ۙ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    const/4 v2, 0x1

    const-wide/16 v23, 0x0

    const/4 v11, 0x1

    move-object v2, v8

    move-object v12, v4

    move-object v4, v10

    move/from16 v25, v6

    move-object v6, v12

    move-object v12, v7

    move-object/from16 v7, p4

    move-object v11, v8

    move-object/from16 v8, p5

    const/16 v16, 0x0

    move/from16 v9, v25

    :try_start_2
    invoke-virtual/range {v2 .. v9}, Ll/ܶ᩵᩸;->ۙ(Ll/۫ۗ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Ll/ᩳ᩵᩸;Ll/۟֡֫;I)V

    .line 388
    invoke-virtual {v12}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v2

    .line 389
    invoke-virtual {v12}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v3

    invoke-virtual {v11, v3, v4}, Ll/ܶ᩵᩸;->ۙ(J)Ll/᩹ܽ᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 390
    :try_start_3
    invoke-static/range {p5 .. p5}, Ll/۬ܶ᩸;->ۙ(Ll/۟֡֫;)V

    const-string v3, "publishing_page_index"

    .line 391
    invoke-virtual {v0, v3}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 392
    new-instance v3, Ll/۬ܶ᩸;

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    aput-object v2, v5, v16

    .line 0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v5, v5, v16

    invoke-static {v5}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v16

    new-array v2, v4, [Z

    .line 392
    iget-object v5, v1, Ll/ۚ᩶᩸;->ۤ:Ll/᩸᩶᩸;

    iget v5, v5, Ll/᩸᩶᩸;->ۤ:I

    iget-object v1, v1, Ll/ۚ᩶᩸;->ۙ:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/16 v19, 0x0

    move-object v6, v13

    move-object v13, v3

    move-object/from16 v17, v2

    move-object/from16 v18, v10

    move/from16 v20, v5

    move-object/from16 v21, v1

    :try_start_4
    invoke-direct/range {v13 .. v21}, Ll/۬ܶ᩸;-><init>(Ll/᩺۬᩹;Ljava/lang/String;Ljava/util/List;[ZLandroid/os/Bundle;IILjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 394
    :try_start_5
    invoke-direct {v3}, Ll/۬ܶ᩸;->۫()V

    .line 395
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    iget-object v1, v0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 408
    :try_start_6
    iget-object v2, v1, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    iget-object v1, v1, Ll/۬ܶ᩸;->ܳ:Ljava/lang/String;

    invoke-interface {v2, v1}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v1

    invoke-static {v1}, Ll/۬ܶ᩸;->ۙ(Ll/᩺۬᩹;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_0
    :try_start_7
    const-string v1, "opening_selected_page"

    .line 396
    invoke-virtual {v0, v1}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    const/high16 v1, 0x800000

    move-object/from16 v2, p4

    move-object/from16 v5, p5

    .line 397
    invoke-virtual {v3, v2, v1, v5}, Ll/۬ܶ᩸;->ۙ(Ll/ᩳ᩵᩸;ILl/۟֡֫;)Ll/ܶ᩵᩸;

    move-result-object v1

    const/4 v2, 0x1

    cmp-long v4, p6, v23

    if-ltz v4, :cond_3

    .line 398
    iget-object v0, v0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    .line 48
    iget-object v0, v0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v0, v25

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, -0x1

    .line 398
    :goto_2
    iput v0, v1, Ll/ܶ᩵᩸;->ۗ:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 402
    iget-boolean v0, v3, Ll/۬ܶ᩸;->֫:Z

    if-nez v0, :cond_4

    invoke-static {v6}, Ll/۬ܶ᩸;->ۙ(Ll/᩺۬᩹;)V

    :cond_4
    return-object v1

    :catchall_0
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v6, v13

    goto :goto_4

    :catchall_3
    move-exception v0

    goto :goto_3

    :catchall_4
    move-exception v0

    move-object v11, v8

    :goto_3
    move-object v6, v13

    move-object/from16 v3, v22

    move-object/from16 v22, v11

    goto :goto_5

    :goto_4
    move-object/from16 v3, v22

    :goto_5
    if-eqz v22, :cond_5

    .line 401
    invoke-virtual/range {v22 .. v22}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    :cond_5
    if-eqz v3, :cond_6

    .line 402
    iget-boolean v1, v3, Ll/۬ܶ᩸;->֫:Z

    if-nez v1, :cond_7

    :cond_6
    invoke-static {v6}, Ll/۬ܶ᩸;->ۙ(Ll/᩺۬᩹;)V

    .line 403
    :cond_7
    throw v0
.end method

.method public static ۙ(Ll/ܶ᩵᩸;Ll/᩺۬᩹;Ll/ۖܰ᩸;ILl/ᩳ᩵᩸;Ll/۟֡֫;J)Ll/ܶ᩵᩸;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const-string v3, "opening_paged_source"

    .line 268
    invoke-virtual {v0, v3}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 269
    iget-object v3, v0, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v3}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽۢ᩸;->ۜ()Ll/᩶ᩳ᩸;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩶ᩳ᩸;->᩷()I

    move-result v3

    .line 270
    iget-object v4, v0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    .line 48
    iget-object v4, v4, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v5, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 271
    :goto_0
    iget-object v7, v0, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;

    if-nez v7, :cond_1

    move-object/from16 v7, p1

    goto :goto_1

    :cond_1
    iget-object v7, v7, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    .line 272
    :goto_1
    iget-object v8, v0, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v8, v8, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    iget-object v8, v8, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    invoke-virtual {v8}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v8

    const-string v9, "textPageSize"

    const v10, 0x1312d00

    .line 273
    invoke-virtual {v8, v9, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v9

    const v10, 0x7ffdffff

    if-gtz v9, :cond_2

    goto :goto_2

    .line 274
    :cond_2
    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    :goto_2
    const/4 v9, 0x4

    .line 275
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 5
    div-int/lit8 v10, v9, 0x64

    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/high16 v10, 0x10000

    invoke-static {v10, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int v10, v9, v5

    .line 277
    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "pages-"

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 278
    invoke-interface {v7, v11}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v12

    new-array v6, v6, [Ll/۬۬᩹;

    .line 279
    invoke-static {v12, v6}, Ll/ۗ۬᩹;->createDirectory(Ll/᩺۬᩹;[Ll/۬۬᩹;)Ll/᩺۬᩹;

    .line 280
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 285
    :try_start_0
    new-instance v14, Ll/ۜ᩹᩸;

    invoke-direct {v14, v1}, Ll/ۜ᩹᩸;-><init>(Ll/ۖܰ᩸;)V

    iget-object v15, v2, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    move/from16 v13, p3

    move-object/from16 v0, p5

    invoke-static {v14, v15, v13, v0}, Ll/᩷᩶᩸;->᩷(Ll/᩹ۢ᩸;Ll/֡ۢ᩸;ILl/۟֡֫;)Ll/۠ܰ᩸;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_18

    :try_start_1
    iget-object v14, v13, Ll/۠ܰ᩸;->᩶:Ll/֡۟᩸;

    .line 286
    iget-object v15, v2, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    mul-int/lit8 v16, v5, 0x2

    const v17, 0x8002

    add-int v0, v16, v17

    move/from16 v17, v3

    int-to-long v2, v0

    const-wide/16 v18, 0x2

    mul-long v2, v2, v18

    const-wide/16 v18, 0x400

    add-long v2, v2, v18

    .line 145
    invoke-virtual {v15, v2, v3}, Ll/֡ۢ᩸;->ۙ(J)Ll/ܿۢ᩸;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_15

    const v0, 0x8000

    :try_start_2
    new-array v0, v0, [C

    .line 288
    new-instance v3, Ljava/lang/StringBuilder;

    add-int/lit8 v15, v16, 0x2

    invoke-direct {v3, v15}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 290
    new-instance v26, Ll/᩸᩶᩸;

    move-object/from16 p3, v0

    iget v0, v13, Ll/۠ܰ᩸;->ܰ:I

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v26

    move/from16 v20, v0

    invoke-direct/range {v18 .. v25}, Ll/᩸᩶᩸;-><init>(IIZILl/᩷ۨᩴ;Ll/᩶ۤۤ;Ljava/util/Map;)V

    const-string v0, "e2SourcePending"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_12

    move-object/from16 v18, v2

    const/4 v2, 0x0

    .line 291
    :try_start_3
    invoke-virtual {v8, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "changed"

    invoke-virtual {v8, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "error"

    invoke-virtual {v8, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "fileTime"

    .line 292
    check-cast v1, Ll/ۡܰ᩸;

    .line 73
    iget-object v1, v1, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۡۙ()J

    move-result-wide v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_11

    .line 292
    :try_start_4
    invoke-virtual {v8, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v0, "checkFileExists"

    const/4 v1, 0x1

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_10

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    const/16 v19, 0x0

    const/16 v20, -0x1

    move-object/from16 v2, p5

    move-object/from16 p2, v11

    move-object/from16 v19, v13

    move/from16 v20, v16

    const/16 v16, 0x0

    const/16 v21, 0x0

    const/16 v22, -0x1

    move v11, v5

    move-object v13, v7

    move v7, v15

    move-object/from16 v5, p3

    move v15, v9

    move-object v9, v3

    move v3, v10

    move v10, v4

    move-object v4, v12

    move-object v12, v6

    move-object v6, v14

    move-object v14, v8

    const/4 v8, 0x0

    move-wide/from16 v39, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-wide/from16 p0, p6

    move-wide/from16 p3, v39

    .line 294
    :goto_3
    :try_start_5
    invoke-static {v2}, Ll/۬ܶ᩸;->ۙ(Ll/۟֡֫;)V

    move/from16 p5, v7

    const-string v7, "creating_page"

    .line 295
    invoke-virtual {v0, v7}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 296
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v7

    invoke-static {v7, v1}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/ᩳ᩵᩸;)Ll/ܶ᩵᩸;

    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_f

    move-object/from16 v23, v1

    :try_start_6
    iget-object v1, v7, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_e

    move-object/from16 v24, v4

    :try_start_7
    const-string v4, "reading_source_pages"
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_d

    .line 297
    :try_start_8
    invoke-virtual {v0, v4}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 298
    :goto_4
    invoke-virtual {v1}, Ll/ۙܿ᩸;->length()I

    move-result v4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    move-object/from16 v25, v0

    const-string v0, "Text input made invalid progress"

    if-ge v4, v3, :cond_6

    .line 299
    :try_start_9
    invoke-static {v2}, Ll/۬ܶ᩸;->ۙ(Ll/۟֡֫;)V

    .line 300
    invoke-virtual {v1}, Ll/ۙܿ᩸;->length()I

    move-result v4

    sub-int v4, v3, v4

    move-object/from16 p6, v1

    const v1, 0x8000

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 301
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_3

    .line 302
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v7, v1, v0, v9}, Ll/ܶ᩵᩸;->ۙ(IILjava/lang/CharSequence;)V

    invoke-virtual {v9, v1, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_3
    const/4 v4, 0x0

    .line 304
    invoke-virtual {v6, v5, v4, v1}, Ll/֡۟᩸;->read([CII)I

    move-result v1

    if-gez v1, :cond_4

    move-object/from16 v21, v13

    move-object/from16 v28, v14

    move/from16 v27, v17

    move/from16 v4, v20

    move/from16 v30, v22

    move-object/from16 v22, v23

    move-object/from16 v31, v26

    move-object/from16 v17, p2

    move-object v13, v2

    move/from16 v20, v10

    move-object/from16 v23, v16

    move-object/from16 v26, v19

    move/from16 v10, p5

    move-object v2, v0

    move/from16 v16, v3

    move-object/from16 v19, v9

    move-wide/from16 v0, p0

    move-object/from16 v3, p6

    move-object v9, v6

    move-object v6, v7

    move-object v7, v5

    move v5, v11

    move-object/from16 v11, v25

    move-object/from16 v25, v18

    move/from16 v18, v8

    move-object v8, v12

    move v12, v15

    move-wide/from16 v14, p3

    goto/16 :goto_7

    :cond_4
    if-eqz v1, :cond_5

    .line 307
    invoke-static {v5, v4, v1}, Ljava/nio/CharBuffer;->wrap([CII)Ljava/nio/CharBuffer;

    move-result-object v0

    invoke-virtual {v7, v4, v1, v0}, Ll/ܶ᩵᩸;->ۙ(IILjava/lang/CharSequence;)V

    :goto_5
    move-object/from16 v1, p6

    move-object/from16 v0, v25

    goto :goto_4

    .line 306
    :cond_5
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catchall_0
    move-exception v0

    move-object/from16 v4, v24

    goto/16 :goto_9

    :cond_6
    move-object/from16 p6, v1

    move-object/from16 v28, v14

    move/from16 v27, v17

    move/from16 v4, v20

    move/from16 v29, v21

    move/from16 v30, v22

    move-object/from16 v22, v23

    move-object/from16 v31, v26

    move-object/from16 v17, p2

    move/from16 v20, v10

    move-object/from16 v21, v13

    move-object/from16 v23, v16

    move-object/from16 v26, v19

    move/from16 v10, p5

    move-object v13, v2

    move/from16 v16, v3

    move-object/from16 v19, v9

    move-object/from16 v3, p6

    move-object v2, v0

    move-object v9, v6

    move-object v6, v7

    move-wide/from16 v0, p0

    move-object v7, v5

    move v5, v11

    move-object/from16 v11, v25

    move-object/from16 v25, v18

    move/from16 v18, v8

    move-object v8, v12

    move v12, v15

    move-wide/from16 v14, p3

    :goto_6
    if-nez v29, :cond_a

    move-object/from16 v32, v11

    .line 310
    :try_start_a
    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    if-ge v11, v10, :cond_9

    .line 311
    invoke-static {v13}, Ll/۬ܶ᩸;->ۙ(Ll/۟֡֫;)V

    .line 312
    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    sub-int v11, v10, v11

    move/from16 v33, v10

    const v10, 0x8000

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    const/4 v11, 0x0

    invoke-virtual {v9, v7, v11, v10}, Ll/֡۟᩸;->read([CII)I

    move-result v10

    if-gez v10, :cond_7

    move-object/from16 v11, v32

    move/from16 v10, v33

    :goto_7
    const/16 v29, 0x1

    goto :goto_6

    :cond_7
    if-eqz v10, :cond_8

    move-object/from16 v34, v13

    move-object/from16 v13, v19

    .line 315
    invoke-virtual {v13, v7, v11, v10}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    move-object/from16 v19, v13

    move-object/from16 v11, v32

    move/from16 v10, v33

    move-object/from16 v13, v34

    goto :goto_6

    .line 314
    :cond_8
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move/from16 v33, v10

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v7, v6

    move-object/from16 v16, v23

    move-object/from16 v4, v24

    move-object/from16 v18, v25

    move-object/from16 v19, v26

    goto :goto_9

    :cond_a
    move/from16 v33, v10

    move-object/from16 v32, v11

    :goto_8
    move-object/from16 v34, v13

    move-object/from16 v13, v19

    if-eqz v29, :cond_b

    .line 317
    invoke-virtual {v3}, Ll/ۙܿ᩸;->length()I

    move-result v2

    int-to-long v10, v2

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    move-object/from16 v19, v7

    move-object/from16 v35, v8

    int-to-long v7, v2

    add-long/2addr v10, v7

    int-to-long v7, v12

    move-object/from16 v36, v3

    int-to-long v2, v5

    add-long/2addr v7, v2

    cmp-long v2, v10, v7

    if-gtz v2, :cond_c

    .line 318
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move/from16 v37, v4

    move/from16 v38, v12

    goto/16 :goto_11

    :goto_9
    move-object/from16 v24, v4

    move-object v6, v7

    move-object/from16 v23, v16

    move-object/from16 v25, v18

    move-object/from16 v26, v19

    goto/16 :goto_1a

    :cond_b
    move-object/from16 v36, v3

    move-object/from16 v19, v7

    move-object/from16 v35, v8

    :cond_c
    const v2, 0x7fffffff

    const v3, 0x7fffffff

    const/4 v7, 0x1

    const/4 v8, -0x1

    const/4 v2, -0x1

    const v3, 0x7fffffff

    const v7, 0x7fffffff

    const/4 v8, 0x1

    .line 10
    :goto_a
    :try_start_b
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-ge v8, v10, :cond_1a

    if-gt v8, v4, :cond_1a

    add-int/lit8 v10, v8, -0x1

    .line 11
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v10

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v11

    .line 12
    invoke-static {v10}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v37

    if-eqz v37, :cond_e

    invoke-static {v11}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v37
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    if-nez v37, :cond_d

    goto :goto_b

    :cond_d
    move/from16 v37, v4

    move/from16 v38, v12

    goto/16 :goto_10

    :cond_e
    :goto_b
    move/from16 v37, v4

    const/16 v4, 0xa

    move/from16 v38, v12

    const/16 v12, 0xd

    if-ne v10, v12, :cond_f

    if-ne v11, v4, :cond_f

    goto :goto_10

    :cond_f
    if-eq v10, v4, :cond_17

    if-ne v10, v12, :cond_10

    goto :goto_e

    :cond_10
    :try_start_c
    const-string v4, "\u3002\uff01\uff1f!?\uff1b;"

    .line 15
    invoke-virtual {v4, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_11

    goto :goto_c

    :cond_11
    const/16 v4, 0x2e

    const/4 v12, 0x2

    if-ne v10, v4, :cond_13

    .line 16
    invoke-static {v11}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v4

    if-eqz v4, :cond_13

    if-lt v8, v12, :cond_12

    add-int/lit8 v4, v8, -0x2

    .line 17
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-nez v4, :cond_13

    :cond_12
    :goto_c
    const/4 v4, 0x1

    goto :goto_f

    :cond_13
    const-string v4, "\uff0c,\u3001\uff1a:"

    .line 18
    invoke-virtual {v4, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_14

    const/4 v4, 0x2

    goto :goto_f

    :cond_14
    const/16 v4, 0x20

    if-eq v10, v4, :cond_16

    const/16 v4, 0x9

    if-ne v10, v4, :cond_15

    goto :goto_d

    :cond_15
    const/4 v4, 0x4

    goto :goto_f

    :cond_16
    :goto_d
    const/4 v4, 0x3

    goto :goto_f

    :cond_17
    :goto_e
    const/4 v4, 0x0

    :goto_f
    sub-int v10, v8, v5

    .line 21
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v10

    if-lt v4, v3, :cond_18

    if-ne v4, v3, :cond_19

    if-ge v10, v7, :cond_19

    :cond_18
    move v3, v4

    move v2, v8

    move v7, v10

    :cond_19
    :goto_10
    add-int/lit8 v8, v8, 0x1

    move/from16 v4, v37

    move/from16 v12, v38

    goto/16 :goto_a

    :cond_1a
    move/from16 v37, v4

    move/from16 v38, v12

    if-gez v2, :cond_1b

    .line 26
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto :goto_11

    :catchall_2
    move-exception v0

    move-object v7, v6

    move-object/from16 v16, v23

    move-object/from16 v4, v24

    move-object/from16 v18, v25

    move-object/from16 v19, v26

    goto/16 :goto_17

    :cond_1b
    :goto_11
    const/4 v3, 0x0

    .line 319
    :try_start_d
    invoke-virtual {v6, v3, v2, v13}, Ll/ܶ᩵᩸;->ۙ(IILjava/lang/CharSequence;)V

    invoke-virtual {v13, v3, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    cmp-long v2, v0, v14

    if-ltz v2, :cond_1d

    .line 321
    :try_start_e
    invoke-virtual/range {v36 .. v36}, Ll/ۙܿ᩸;->length()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v14

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1c

    if-eqz v29, :cond_1d

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-nez v2, :cond_1d

    .line 322
    :cond_1c
    invoke-virtual/range {v35 .. v35}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-long v3, v0, v14

    .line 323
    invoke-virtual/range {v36 .. v36}, Ll/ۙܿ᩸;->length()I

    move-result v7

    int-to-long v7, v7

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    long-to-int v4, v3

    move v11, v2

    move v2, v4

    move v12, v2

    goto :goto_12

    :catchall_3
    move-exception v0

    goto/16 :goto_1a

    :cond_1d
    const/4 v2, 0x0

    move/from16 v11, v18

    move/from16 v12, v30

    .line 325
    :goto_12
    :try_start_f
    invoke-virtual/range {v36 .. v36}, Ll/ۙܿ᩸;->length()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v3, v14

    const-string v7, "persisting_source_pages"

    move-object/from16 v14, v32

    .line 326
    invoke-virtual {v14, v7}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 327
    iget-object v7, v14, Ll/ܶ᩵᩸;->ܺ:Ll/ᩴۗ᩸;

    iget-object v7, v7, Ll/ᩴۗ᩸;->᩶:Ll/۫ۗ᩸;

    new-instance v8, Landroid/os/Bundle;

    move-object/from16 v10, v28

    invoke-direct {v8, v10}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v9}, Ll/֡۟᩸;->ۙ()Ljava/lang/String;

    move-result-object v15
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    move-object/from16 p0, v6

    move-object/from16 p1, v7

    move-object/from16 p2, v8

    move-object/from16 p3, v31

    move-object/from16 p4, v15

    move-object/from16 p5, v22

    move-object/from16 p6, v34

    move/from16 p7, v2

    :try_start_10
    invoke-virtual/range {p0 .. p7}, Ll/ܶ᩵᩸;->ۙ(Ll/۫ۗ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Ll/ᩳ᩵᩸;Ll/۟֡֫;I)V

    .line 328
    invoke-virtual/range {v36 .. v36}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v2

    move-object/from16 v8, v35

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 329
    invoke-virtual/range {v36 .. v36}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v2

    move-wide/from16 p0, v0

    invoke-virtual {v2}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Ll/ܶ᩵᩸;->ۙ(J)Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 330
    :try_start_11
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/high16 v1, 0x10000

    if-gt v0, v1, :cond_24

    if-eqz v29, :cond_23

    .line 331
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_23

    .line 332
    invoke-virtual {v9}, Ll/֡۟᩸;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 334
    invoke-virtual/range {v26 .. v26}, Ll/۠ܰ᩸;->close()V

    .line 335
    invoke-static/range {v34 .. v34}, Ll/۬ܶ᩸;->ۙ(Ll/۟֡֫;)V

    const-string v1, "publishing_page_index"

    .line 336
    invoke-virtual {v14, v1}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    .line 337
    new-instance v1, Ll/۬ܶ᩸;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v6, v2, [Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    move-object/from16 v15, v26

    :try_start_12
    iget v9, v15, Ll/۠ܰ᩸;->ܰ:I

    move-object v2, v1

    move-object/from16 v3, v21

    move-object/from16 v28, v10

    move-object/from16 v4, v17

    move-object v5, v8

    move-object/from16 v7, v28

    move v8, v11

    move-object v10, v0

    invoke-direct/range {v2 .. v10}, Ll/۬ܶ᩸;-><init>(Ll/᩺۬᩹;Ljava/lang/String;Ljava/util/List;[ZLandroid/os/Bundle;IILjava/lang/String;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 339
    :try_start_13
    invoke-direct {v1}, Ll/۬ܶ᩸;->۫()V

    .line 340
    invoke-virtual {v14}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    .line 341
    iget-object v0, v14, Ll/ܶ᩵᩸;->ܳ:Ll/۬ܶ᩸;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    if-eqz v0, :cond_1e

    .line 408
    :try_start_14
    iget-object v2, v0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    iget-object v0, v0, Ll/۬ܶ᩸;->ܳ:Ljava/lang/String;

    invoke-interface {v2, v0}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v0

    invoke-static {v0}, Ll/۬ܶ᩸;->ۙ(Ll/᩺۬᩹;)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_0
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 342
    :catch_0
    :cond_1e
    :try_start_15
    invoke-virtual/range {v25 .. v25}, Ll/ܿۢ᩸;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    :try_start_16
    invoke-virtual {v15}, Ll/۠ܰ᩸;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 344
    iget-boolean v0, v1, Ll/۬ܶ᩸;->֫:Z

    if-nez v0, :cond_1f

    .line 345
    invoke-static/range {v24 .. v24}, Ll/۬ܶ᩸;->ۙ(Ll/᩺۬᩹;)V

    :cond_1f
    const-string v0, "opening_selected_page"

    .line 348
    invoke-virtual {v14, v0}, Ll/ܶ᩵᩸;->ۙ(Ljava/lang/String;)V

    const/high16 v0, 0x800000

    move-object/from16 v6, v22

    move-object/from16 v2, v34

    .line 349
    invoke-virtual {v1, v6, v0, v2}, Ll/۬ܶ᩸;->ۙ(Ll/ᩳ᩵᩸;ILl/۟֡֫;)Ll/ܶ᩵᩸;

    move-result-object v0

    if-nez v20, :cond_21

    .line 48
    iget-object v1, v1, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_20

    goto :goto_13

    :cond_20
    return-object v0

    .line 352
    :cond_21
    :goto_13
    iput v12, v0, Ll/ܶ᩵᩸;->ۗ:I

    .line 353
    iget v1, v14, Ll/ܶ᩵᩸;->᩻:I

    if-ne v11, v1, :cond_22

    move/from16 v1, v27

    if-ne v12, v1, :cond_22

    const/4 v1, 0x1

    goto :goto_14

    :cond_22
    const/4 v1, 0x0

    :goto_14
    iput-boolean v1, v0, Ll/ܶ᩵᩸;->᩹:Z

    return-object v0

    :catchall_4
    move-exception v0

    move-object/from16 v13, v23

    move-object/from16 v12, v24

    move-object/from16 v23, v1

    goto/16 :goto_23

    :catchall_5
    move-exception v0

    move-object v13, v15

    move-object/from16 v6, v23

    move-object/from16 v12, v24

    move-object/from16 v23, v1

    goto/16 :goto_20

    :catchall_6
    move-exception v0

    move-object/from16 v26, v15

    goto/16 :goto_19

    :cond_23
    move-object/from16 v28, v10

    move-object/from16 v6, v22

    move-object/from16 v15, v26

    move/from16 v1, v27

    move-object/from16 v2, v34

    move-wide/from16 p3, v3

    move/from16 v22, v12

    move-object v0, v14

    move/from16 v3, v16

    move-object/from16 p2, v17

    move/from16 v10, v20

    move-object/from16 v16, v23

    move-object/from16 v4, v24

    move-object/from16 v18, v25

    move-object/from16 v14, v28

    move-object/from16 v26, v31

    move/from16 v7, v33

    move/from16 v20, v37

    move/from16 v17, v1

    move-object v1, v6

    move-object v12, v8

    move-object v6, v9

    move v8, v11

    move-object v9, v13

    move-object/from16 v13, v21

    move/from16 v21, v29

    move v11, v5

    move-object/from16 v5, v19

    move-object/from16 v19, v15

    move/from16 v15, v38

    goto/16 :goto_3

    :cond_24
    move-object/from16 v15, v26

    .line 330
    :try_start_17
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Too many text pages"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    :catchall_7
    move-exception v0

    move-object/from16 v13, v23

    move-object/from16 v12, v24

    move-object/from16 v2, v25

    goto/16 :goto_1d

    :catchall_8
    move-exception v0

    move-object/from16 v15, v26

    move-object v13, v15

    move-object/from16 v16, v23

    move-object/from16 v12, v24

    move-object/from16 v2, v25

    goto :goto_1b

    :catchall_9
    move-exception v0

    move-object/from16 v15, v26

    move-object/from16 v26, v15

    goto :goto_18

    :catchall_a
    move-exception v0

    move-object/from16 v15, v26

    goto :goto_15

    :catchall_b
    move-exception v0

    move-object/from16 v15, v26

    :goto_15
    move-object v7, v6

    move-object/from16 v19, v15

    move-object/from16 v16, v23

    move-object/from16 v4, v24

    move-object/from16 v18, v25

    goto :goto_17

    :catchall_c
    move-exception v0

    goto :goto_16

    :catchall_d
    move-exception v0

    goto :goto_16

    :catchall_e
    move-exception v0

    move-object/from16 v24, v4

    :goto_16
    move-object/from16 v4, v24

    :goto_17
    move-object/from16 v24, v4

    move-object v6, v7

    move-object/from16 v23, v16

    move-object/from16 v25, v18

    move-object/from16 v26, v19

    :goto_18
    move-object/from16 v1, v23

    move-object/from16 v23, v6

    :goto_19
    move-object/from16 v6, v23

    move-object/from16 v23, v1

    :goto_1a
    move-object v1, v0

    goto :goto_1e

    :catchall_f
    move-exception v0

    move-object/from16 v24, v4

    move-object/from16 v2, v18

    move-object/from16 v13, v19

    move-object/from16 v12, v24

    goto :goto_1b

    :catchall_10
    move-exception v0

    move-object/from16 v2, v18

    const/16 v16, 0x0

    :goto_1b
    move-object v15, v13

    move-object/from16 v13, v16

    goto :goto_1d

    :catchall_11
    move-exception v0

    goto :goto_1c

    :catchall_12
    move-exception v0

    move-object/from16 v18, v2

    :goto_1c
    move-object v15, v13

    move-object/from16 v2, v18

    const/4 v13, 0x0

    :goto_1d
    move-object v1, v0

    move-object/from16 v25, v2

    move-object/from16 v24, v12

    move-object v6, v13

    move-object/from16 v23, v6

    move-object/from16 v26, v15

    .line 285
    :goto_1e
    :try_start_18
    invoke-virtual/range {v25 .. v25}, Ll/ܿۢ᩸;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_13

    goto :goto_1f

    :catchall_13
    move-exception v0

    move-object v2, v0

    :try_start_19
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1f
    throw v1
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    :catchall_14
    move-exception v0

    move-object/from16 v12, v24

    move-object/from16 v13, v26

    :goto_20
    move-object v1, v0

    goto :goto_21

    :catchall_15
    move-exception v0

    move-object v1, v0

    const/4 v6, 0x0

    const/16 v23, 0x0

    :goto_21
    :try_start_1a
    invoke-virtual {v13}, Ll/۠ܰ᩸;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_16

    goto :goto_22

    :catchall_16
    move-exception v0

    move-object v2, v0

    :try_start_1b
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_22
    throw v1
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_17

    :catchall_17
    move-exception v0

    move-object v13, v6

    :goto_23
    move-object/from16 v1, v23

    goto :goto_24

    :catchall_18
    move-exception v0

    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_24
    if-eqz v13, :cond_25

    .line 343
    invoke-virtual {v13}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;

    :cond_25
    if-eqz v1, :cond_26

    .line 344
    iget-boolean v1, v1, Ll/۬ܶ᩸;->֫:Z

    if-nez v1, :cond_27

    .line 345
    :cond_26
    invoke-static {v12}, Ll/۬ܶ᩸;->ۙ(Ll/᩺۬᩹;)V

    .line 347
    :cond_27
    throw v0
.end method

.method public static ۙ(Ll/۟֡֫;)V
    .locals 1

    .line 419
    invoke-interface {p0}, Ll/۟֡֫;->۫()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Text pagination is canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۙ(Ll/۬ܶ᩸;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬ܶ᩸;->ۧ:I

    return-void
.end method

.method public static ۙ(Ll/᩺۬᩹;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܽ۬᩹;

    .line 413
    invoke-static {p0, v0}, Ll/ۗ۬᩹;->walk(Ll/᩺۬᩹;[Ll/ܽ۬᩹;)Ll/᩵ܺۗ;

    move-result-object p0

    .line 414
    :try_start_0
    invoke-static {}, Ll/ۖ۫ۗ;->reverseOrder()Ljava/util/Comparator;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/᩵ܺۗ;->sorted(Ljava/util/Comparator;)Ll/᩵ܺۗ;

    move-result-object v0

    invoke-interface {v0}, Ll/᩵ܺۗ;->toList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺۬᩹;

    invoke-static {v1}, Ll/ۗ۬᩹;->delete(Ll/᩺۬᩹;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 415
    :cond_0
    invoke-interface {p0}, Ll/ᩴܺۗ;->close()V

    return-void

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_1

    .line 413
    :try_start_1
    invoke-interface {p0}, Ll/ᩴܺۗ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p0

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    throw v0
.end method

.method public static bridge synthetic ۙ(Ll/۬ܶ᩸;)[Z
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܶ᩸;->ۙ:[Z

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/۬ܶ᩸;)Ll/᩹ܽ᩵;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܶ᩸;->ᩴ:Ll/᩹ܽ᩵;

    return-object p0
.end method

.method private ۫()V
    .locals 11

    .line 106
    iget-object v0, p0, Ll/۬ܶ᩸;->ܺ:Ljava/lang/Object;

    monitor-enter v0

    move-object v1, p0

    .line 111
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 112
    :try_start_1
    new-instance v2, Landroid/os/Bundle;

    iget-object v3, p0, Ll/۬ܶ᩸;->ۤ:Landroid/os/Bundle;

    invoke-direct {v2, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iget-object v3, p0, Ll/۬ܶ᩸;->ۙ:[Z

    invoke-virtual {v3}, [Z->clone()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Z

    .line 113
    iget v4, p0, Ll/۬ܶ᩸;->᩸:I

    iget v5, p0, Ll/۬ܶ᩸;->᩷:I

    iget-object v6, p0, Ll/۬ܶ᩸;->ۚ:Ljava/lang/String;

    .line 114
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    :try_start_2
    new-instance v1, Ll/ۛۚۤ;

    invoke-direct {v1}, Ll/ۛۚۤ;-><init>()V

    .line 116
    iget-object v7, p0, Ll/۬ܶ᩸;->ܳ:Ljava/lang/String;

    const/4 v8, 0x6

    invoke-virtual {v7, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v7

    const v8, 0x31504745

    .line 117
    invoke-virtual {v1, v8}, Ll/ۛۚۤ;->writeInt(I)V

    const/4 v8, 0x1

    invoke-virtual {v1, v8}, Ll/ۛۚۤ;->writeInt(I)V

    invoke-virtual {v7}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Ll/ۛۚۤ;->᩷(J)V

    invoke-virtual {v7}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Ll/ۛۚۤ;->᩷(J)V

    .line 48
    iget-object v7, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    .line 118
    invoke-virtual {v1, v7}, Ll/ۛۚۤ;->writeInt(I)V

    invoke-virtual {v1, v4}, Ll/ۛۚۤ;->writeInt(I)V

    invoke-virtual {v1, v5}, Ll/ۛۚۤ;->writeInt(I)V

    const-string v4, "\r"

    .line 119
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x2

    const/4 v7, 0x0

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const-string v4, "\r\n"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x2

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v1, v4}, Ll/ۛۚۤ;->writeInt(I)V

    const/4 v4, 0x0

    .line 48
    :goto_1
    iget-object v6, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_2

    .line 121
    iget-object v6, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/UUID;

    .line 122
    invoke-virtual {v6}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Ll/ۛۚۤ;->᩷(J)V

    invoke-virtual {v6}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Ll/ۛۚۤ;->᩷(J)V

    aget-boolean v6, v3, v4

    invoke-virtual {v1, v6}, Ll/ۛۚۤ;->ۙ(Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    const/high16 v3, 0x200000

    .line 124
    invoke-static {v3, v2}, Ll/ۗܶ᩸;->ۙ(ILandroid/os/Bundle;)Ll/ۗܶ᩸;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/ۗܶ᩸;->ۙ(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ۛۚۤ;->᩷([B)V

    .line 125
    invoke-virtual {v1}, Ll/ۛۚۤ;->size()I

    move-result v3

    const v4, 0x1ffffc

    if-gt v3, v4, :cond_4

    .line 126
    new-instance v3, Ljava/util/zip/CRC32;

    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v1}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v4

    invoke-virtual {v1}, Ll/ۛۚۤ;->size()I

    move-result v6

    invoke-virtual {v3, v4, v7, v6}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v3

    long-to-int v4, v3

    invoke-virtual {v1, v4}, Ll/ۛۚۤ;->writeInt(I)V

    .line 128
    iget-object v3, p0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    const-string v4, "app-pages.tmp"

    invoke-interface {v3, v4}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v3

    new-array v4, v8, [Ll/᩵۬᩹;

    .line 215
    sget-object v6, Ll/᩵۬᩹;->NOFOLLOW_LINKS:Ll/᩵۬᩹;

    aput-object v6, v4, v7

    invoke-static {v3, v4}, Ll/ۗ۬᩹;->exists(Ll/᩺۬᩹;[Ll/᩵۬᩹;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v3}, Ll/֨ܶ᩸;->ۙ(Ll/᩺۬᩹;)V

    invoke-static {v3}, Ll/ۗ۬᩹;->delete(Ll/᩺۬᩹;)V

    .line 129
    :cond_3
    invoke-virtual {v1}, Ll/ۛۚۤ;->۫()[B

    move-result-object v1

    invoke-static {v3, v1}, Ll/۟ܶ᩸;->ۙ(Ll/᩺۬᩹;[B)V

    iget-object v1, p0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    const-string v4, "app-pages"

    invoke-interface {v1, v4}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v1

    new-array v4, v5, [Ll/֫۬᩹;

    .line 207
    sget-object v5, Ll/ܿ۬᩹;->ATOMIC_MOVE:Ll/ܿ۬᩹;

    aput-object v5, v4, v7

    sget-object v5, Ll/ܿ۬᩹;->REPLACE_EXISTING:Ll/ܿ۬᩹;

    aput-object v5, v4, v8

    invoke-static {v3, v1, v4}, Ll/ۗ۬᩹;->move(Ll/᩺۬᩹;Ll/᩺۬᩹;[Ll/֫۬᩹;)Ll/᩺۬᩹;

    .line 131
    iput-boolean v8, p0, Ll/۬ܶ᩸;->֫:Z

    .line 132
    iget-object v1, p0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    .line 212
    sget-object v3, Ll/᩸֨᩸;->ۙ:Ll/᩸֨᩸;

    invoke-interface {v3, v1}, Ll/᩸֨᩸;->ۙ(Ll/᩺۬᩹;)V

    .line 133
    iget-object v1, p0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    invoke-static {v1, v2}, Ll/֨᩵᩸;->ۙ(Ll/᩺۬᩹;Landroid/os/Bundle;)V

    .line 134
    monitor-exit v0

    return-void

    .line 125
    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Text page directory exceeds limit"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_0
    move-exception v2

    .line 114
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :catchall_1
    move-exception v1

    .line 134
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method public static bridge synthetic ܳ(Ll/۬ܶ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬ܶ᩸;->۫()V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/۬ܶ᩸;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܶ᩸;->ܺ:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/۬ܶ᩸;)Landroid/os/Bundle;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ܶ᩸;->ۤ:Landroid/os/Bundle;

    return-object p0
.end method

.method public static ᩷(Ll/᩺۬᩹;)Ll/۬ܶ᩸;
    .locals 19

    const-string v0, "app-pages"

    move-object/from16 v2, p0

    .line 64
    invoke-interface {v2, v0}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v0

    .line 65
    sget-object v1, Ll/᩵۬᩹;->NOFOLLOW_LINKS:Ll/᩵۬᩹;

    const/4 v3, 0x1

    new-array v4, v3, [Ll/᩵۬᩹;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    invoke-static {v0, v4}, Ll/ۗ۬᩹;->isRegularFile(Ll/᩺۬᩹;[Ll/᩵۬᩹;)Z

    move-result v4

    const-string v10, "Invalid text page directory"

    if-eqz v4, :cond_c

    .line 66
    invoke-static {v0}, Ll/ۗ۬᩹;->size(Ll/᩺۬᩹;)J

    move-result-wide v6

    const-wide/16 v8, 0x28

    cmp-long v4, v6, v8

    if-ltz v4, :cond_b

    const-wide/32 v8, 0x200000

    cmp-long v4, v6, v8

    if-gtz v4, :cond_b

    long-to-int v4, v6

    .line 68
    new-array v6, v4, [B

    new-array v7, v3, [Ll/ۨ۬᩹;

    aput-object v1, v7, v5

    .line 69
    invoke-static {v0, v7}, Ll/ۗ۬᩹;->newInputStream(Ll/᩺۬᩹;[Ll/ۨ۬᩹;)Ljava/io/InputStream;

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_1

    sub-int v7, v4, v0

    .line 72
    :try_start_0
    invoke-virtual {v1, v6, v0, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-lez v7, :cond_0

    add-int/2addr v0, v7

    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Truncated text page directory"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v7, -0x1

    if-ne v0, v7, :cond_9

    .line 77
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 79
    :try_start_1
    new-instance v0, Ll/᩵ۚۤ;

    invoke-direct {v0, v6}, Ll/᩵ۚۤ;-><init>([B)V

    .line 80
    new-instance v1, Ljava/util/zip/CRC32;

    invoke-direct {v1}, Ljava/util/zip/CRC32;-><init>()V

    add-int/lit8 v7, v4, -0x4

    invoke-virtual {v1, v6, v5, v7}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long v5, v7

    .line 81
    invoke-virtual {v0, v5, v6}, Ll/᩵ۚۤ;->seek(J)V

    .line 82
    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v5

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v6

    long-to-int v1, v6

    if-ne v5, v1, :cond_8

    const-wide/16 v5, 0x0

    .line 83
    invoke-virtual {v0, v5, v6}, Ll/᩵ۚۤ;->seek(J)V

    .line 84
    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    const v5, 0x31504745

    if-ne v1, v5, :cond_7

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    if-ne v1, v3, :cond_7

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "pages-"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v5, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readLong()J

    move-result-wide v6

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readLong()J

    move-result-wide v8

    invoke-direct {v5, v6, v7, v8, v9}, Ljava/util/UUID;-><init>(JJ)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 86
    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v7

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v8

    .line 87
    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v6

    if-lt v1, v3, :cond_6

    add-int/lit8 v4, v4, -0x28

    .line 88
    div-int/lit8 v4, v4, 0x11

    if-gt v1, v4, :cond_6

    if-ltz v7, :cond_6

    if-ge v7, v1, :cond_6

    if-ltz v6, :cond_6

    const/4 v4, 0x2

    if-gt v6, v4, :cond_6

    .line 91
    invoke-static {v8}, Ll/ۖۚۤ;->ۙ(I)Ljava/nio/charset/Charset;

    .line 92
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v9, 0x0

    .line 93
    new-array v11, v1, [Z

    :goto_1
    if-ge v9, v1, :cond_2

    .line 95
    new-instance v12, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readLong()J

    move-result-wide v13

    move-object v15, v4

    invoke-virtual {v0}, Ll/᩵ۚۤ;->readLong()J

    move-result-wide v3

    invoke-direct {v12, v13, v14, v3, v4}, Ljava/util/UUID;-><init>(JJ)V

    move-object v4, v15

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ll/᩵ۚۤ;->ܳ()Z

    move-result v3

    aput-boolean v3, v11, v9

    add-int/lit8 v9, v9, 0x1

    const/4 v3, 0x1

    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v0}, Ll/᩵ۚۤ;->readInt()I

    move-result v1

    if-ltz v1, :cond_5

    int-to-long v12, v1

    .line 98
    invoke-virtual {v0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v15

    const-wide/16 v17, 0x4

    sub-long v15, v15, v17

    cmp-long v3, v12, v15

    if-nez v3, :cond_5

    .line 99
    new-instance v3, Ljava/io/ByteArrayInputStream;

    .line 211
    new-array v9, v1, [B

    .line 212
    invoke-virtual {v0, v1, v9}, Ll/᩵ۚۤ;->ۙ(I[B)V

    .line 99
    invoke-direct {v3, v9}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/high16 v0, 0x200000

    invoke-static {v0, v12, v13, v3}, Ll/ۗܶ᩸;->ۙ(IJLjava/io/InputStream;)Ll/ۗܶ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܶ᩸;->ۤ()Landroid/os/Bundle;

    move-result-object v0

    .line 100
    new-instance v12, Ll/۬ܶ᩸;

    const/4 v1, 0x1

    if-ne v6, v1, :cond_3

    const-string v1, "\r"

    :goto_2
    move-object v9, v1

    goto :goto_3

    :cond_3
    const/4 v1, 0x2

    if-ne v6, v1, :cond_4

    const-string v1, "\r\n"

    goto :goto_2

    :cond_4
    const-string v1, "\n"

    goto :goto_2

    :goto_3
    move-object v1, v12

    move-object/from16 v2, p0

    move-object v3, v5

    move-object v5, v11

    move-object v6, v0

    .line 101
    invoke-direct/range {v1 .. v9}, Ll/۬ܶ᩸;-><init>(Ll/᩺۬᩹;Ljava/lang/String;Ljava/util/List;[ZLandroid/os/Bundle;IILjava/lang/String;)V

    return-object v12

    .line 98
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid text page configuration length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 89
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid text page directory fields"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported text page directory"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 82
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid text page directory checksum"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 102
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v10, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 76
    :cond_9
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Trailing text page directory data"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    if-eqz v1, :cond_a

    .line 69
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_4
    throw v2

    .line 67
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid text page directory length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_c
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static bridge synthetic ᩸(Ll/۬ܶ᩸;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/۬ܶ᩸;->ۧ:I

    return p0
.end method


# virtual methods
.method public final declared-synchronized ۙ(ILjava/lang/CharSequence;Ll/ᩳ᩵᩸;)Ll/ۜܶ᩸;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 187
    :try_start_0
    iget v1, p0, Ll/۬ܶ᩸;->ۧ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/۬ܶ᩸;->ۧ:I

    if-nez v1, :cond_0

    new-instance v1, Ll/᩹ܽ᩵;

    invoke-direct {v1}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v1, p0, Ll/۬ܶ᩸;->ᩴ:Ll/᩹ܽ᩵;

    .line 188
    :cond_0
    new-instance v1, Ll/ۜܶ᩸;

    invoke-direct {v1, p0, p1, p2, p3}, Ll/ۜܶ᩸;-><init>(Ll/۬ܶ᩸;ILjava/lang/CharSequence;Ll/ᩳ᩵᩸;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(ILl/ᩳ᩵᩸;)Ll/ܳܿ᩸;
    .locals 2

    .line 179
    invoke-virtual {p0, p1}, Ll/۬ܶ᩸;->᩷(I)Ll/᩺۬᩹;

    move-result-object v0

    iget-object v1, p2, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    iget-object p2, p2, Ll/ᩳ᩵᩸;->ۤ:Ll/ۖۢ᩸;

    invoke-static {v0, v1, p2}, Ll/ܽۢ᩸;->᩷(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;)Ll/᩻ۢ᩸;

    move-result-object p2

    .line 180
    :try_start_0
    iget-object v0, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/UUID;

    invoke-virtual {p2}, Ll/᩻ۢ᩸;->ܳ()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 181
    invoke-virtual {p2}, Ll/᩻ۢ᩸;->۫()Ll/ۜܿ᩸;

    move-result-object p1

    invoke-static {p1}, Ll/ܳܿ᩸;->ۙ(Ll/ۜܿ᩸;)Ll/ܳܿ᩸;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    invoke-virtual {p2}, Ll/᩻ۢ᩸;->close()V

    return-object p1

    .line 180
    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Text page identity changed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 179
    :try_start_2
    invoke-virtual {p2}, Ll/᩻ۢ᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۙ(ILl/ᩳ᩵᩸;ILl/۟֡֫;Z)Ll/ܶ᩵᩸;
    .locals 7

    .line 157
    invoke-virtual {p0, p1}, Ll/۬ܶ᩸;->᩷(I)Ll/᩺۬᩹;

    move-result-object v0

    iget-object v1, p2, Ll/ᩳ᩵᩸;->ۙ:Ll/֡ۢ᩸;

    iget-object v2, p2, Ll/ᩳ᩵᩸;->ۤ:Ll/ۖۢ᩸;

    iget-object v3, p2, Ll/ᩳ᩵᩸;->᩷:Ljava/util/concurrent/Executor;

    const/4 v6, 0x0

    move v4, p3

    move-object v5, p4

    .line 106
    invoke-static/range {v0 .. v6}, Ll/ܶ᩵᩸;->ۙ(Ll/᩺۬᩹;Ll/֡ۢ᩸;Ll/ۖۢ᩸;Ljava/util/concurrent/Executor;ILl/۟֡֫;Ljava/lang/String;)Ll/ܶ᩵᩸;

    move-result-object p2

    .line 159
    :try_start_0
    iget-object p4, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/UUID;

    iget-object v0, p2, Ll/ܶ᩵᩸;->ۨ:Ll/ۗۤᩴ;

    invoke-virtual {v0}, Ll/ۗۤᩴ;->ܳ᩷()Ll/ܽۢ᩸;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 160
    invoke-virtual {p2, p0, p1, p3}, Ll/ܶ᩵᩸;->ۙ(Ll/۬ܶ᩸;II)V

    if-eqz p5, :cond_1

    .line 162
    iget-object p3, p0, Ll/۬ܶ᩸;->ܺ:Ljava/lang/Object;

    move-object v0, p3

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p0

    .line 163
    :try_start_1
    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    :try_start_2
    iget p3, p0, Ll/۬ܶ᩸;->ۧ:I

    if-nez p3, :cond_0

    .line 165
    iput p1, p0, Ll/۬ܶ᩸;->᩸:I

    .line 166
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 167
    :try_start_3
    invoke-direct {p0}, Ll/۬ܶ᩸;->۫()V

    .line 168
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-object p2

    .line 164
    :cond_0
    :try_start_4
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Text document is being read"

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 166
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p1

    :catchall_1
    move-exception p1

    .line 168
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    throw p1

    :cond_1
    return-object p2

    .line 159
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Text page identity changed"

    invoke-direct {p1, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    .line 172
    :goto_0
    :try_start_7
    invoke-virtual {p2}, Ll/ܶ᩵᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object p2

    invoke-virtual {p2}, Ll/᩹ܽ᩵;->ᩴ()Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 173
    :goto_1
    throw p1
.end method

.method public final ۙ(Ll/ᩳ᩵᩸;ILl/۟֡֫;)Ll/ܶ᩵᩸;
    .locals 6

    .line 0
    monitor-enter p0

    .line 49
    :try_start_0
    iget v1, p0, Ll/۬ܶ᩸;->᩸:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    .line 153
    invoke-virtual/range {v0 .. v5}, Ll/۬ܶ᩸;->ۙ(ILl/ᩳ᩵᩸;ILl/۟֡֫;Z)Ll/ܶ᩵᩸;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 49
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(ILandroid/os/Bundle;ZILjava/lang/String;)V
    .locals 2

    .line 139
    iget-object v0, p0, Ll/۬ܶ᩸;->ܺ:Ljava/lang/Object;

    monitor-enter v0

    move-object v1, p0

    .line 140
    :try_start_0
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 141
    :try_start_1
    iput p4, p0, Ll/۬ܶ᩸;->᩷:I

    iput-object p5, p0, Ll/۬ܶ᩸;->ۚ:Ljava/lang/String;

    .line 142
    iget-object p4, p0, Ll/۬ܶ᩸;->ۙ:[Z

    aput-boolean p3, p4, p1

    .line 143
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Ll/۬ܶ᩸;->ۤ:Landroid/os/Bundle;

    .line 145
    iget-object p1, p0, Ll/۬ܶ᩸;->ۙ:[Z

    array-length p2, p1

    const/4 p3, 0x0

    const/4 p4, 0x0

    :goto_0
    if-ge p3, p2, :cond_0

    aget-boolean p5, p1, p3

    or-int/2addr p4, p5

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 146
    :cond_0
    iget-object p1, p0, Ll/۬ܶ᩸;->ۤ:Landroid/os/Bundle;

    const-string p2, "changed"

    invoke-virtual {p1, p2, p4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 147
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    :try_start_2
    invoke-direct {p0}, Ll/۬ܶ᩸;->۫()V

    .line 149
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception p1

    .line 147
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1

    :catchall_1
    move-exception p1

    .line 149
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public final declared-synchronized ۙ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 50
    :try_start_0
    iget v1, p0, Ll/۬ܶ᩸;->ۧ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۙ(I)Z
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 52
    :goto_0
    :try_start_0
    iget-object v3, p0, Ll/۬ܶ᩸;->ۙ:[Z

    array-length v4, v3

    if-ge v2, v4, :cond_1

    if-eq v2, p1, :cond_0

    aget-boolean v3, v3, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 53
    :cond_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۤ()I
    .locals 1

    .line 48
    iget-object v0, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized ܳ()Ll/᩹ܽ᩵;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 257
    :try_start_0
    iget-object v1, p0, Ll/۬ܶ᩸;->ᩴ:Ll/᩹ܽ᩵;

    new-instance v2, Ll/ۖܶ᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ۖܶ᩸;-><init>(I)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩴ()Ll/᩸᩶᩸;
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 57
    :try_start_0
    new-instance v9, Ll/᩸᩶᩸;

    iget v3, p0, Ll/۬ܶ᩸;->᩷:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Ll/᩸᩶᩸;-><init>(IIZILl/᩷ۨᩴ;Ll/᩶ۤۤ;Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v9

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩷()Landroid/os/Bundle;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 55
    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    iget-object v2, p0, Ll/۬ܶ᩸;->ۤ:Landroid/os/Bundle;

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩷(I)Ll/᩺۬᩹;
    .locals 2

    if-ltz p1, :cond_0

    .line 48
    iget-object v0, p0, Ll/۬ܶ᩸;->۫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 60
    iget-object v0, p0, Ll/۬ܶ᩸;->᩻:Ll/᩺۬᩹;

    iget-object v1, p0, Ll/۬ܶ᩸;->ܳ:Ljava/lang/String;

    invoke-interface {v0, v1}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/᩺۬᩹;->resolve(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object p1

    return-object p1

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Invalid text page index"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ᩸()Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 56
    :try_start_0
    iget-object v1, p0, Ll/۬ܶ᩸;->ۚ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
