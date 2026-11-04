.class public Ll/ۢܽ۫;
.super Ll/ܺۙ᩻;
.source "195F"


# instance fields
.field public ܺۙ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 484
    invoke-direct {p0}, Ll/ܺۙ᩻;-><init>()V

    .line 485
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۢܽ۫;->ܺۙ:Ljava/util/ArrayList;

    return-void
.end method

.method private ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۨᩴ;JLl/ۗۧܺ;)V
    .locals 7

    const/4 v0, 0x0

    .line 446
    invoke-virtual {p2, v0}, Ll/᩷ۨᩴ;->ۤ(Z)Ljava/io/OutputStream;

    move-result-object v1

    const/16 v2, 0x400

    :try_start_0
    new-array v3, v2, [B

    :cond_0
    const-wide/16 v4, 0x0

    cmp-long v6, p3, v4

    if-lez v6, :cond_1

    int-to-long v4, v2

    .line 587
    invoke-static {v4, v5, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {p1, v3, v0, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    .line 588
    invoke-virtual {p5, v4}, Ll/ۗۧܺ;->ۙ(I)Z

    .line 589
    invoke-virtual {v1, v3, v0, v4}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v4, v4

    sub-long/2addr p3, v4

    .line 591
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_0

    :cond_1
    if-eqz v1, :cond_2

    .line 595
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 596
    :cond_2
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 597
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ᩳ()Z

    return-void

    .line 599
    :cond_3
    iget-object p1, p0, Ll/ۢܽ۫;->ܺۙ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception p1

    if-eqz v1, :cond_4

    .line 583
    :try_start_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p1
.end method

.method private ۙ(Ll/᩷ۨᩴ;Ll/ۨܽ۫;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v7, p0

    move-object/from16 v0, p2

    .line 529
    invoke-virtual/range {p1 .. p1}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v1

    .line 530
    new-instance v8, Ll/ۗۧܺ;

    invoke-direct {v8, v1, v2}, Ll/ۗۧܺ;-><init>(J)V

    new-instance v3, Ll/۬ۧۧ;

    const/4 v4, 0x3

    invoke-direct {v3, v4, v7}, Ll/۬ۧۧ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v8, v3}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    .line 531
    invoke-virtual/range {p1 .. p1}, Ll/᩷ۨᩴ;->᩷᩷()Ljava/io/BufferedInputStream;

    move-result-object v9

    .line 534
    :try_start_0
    iget v3, v0, Ll/ۨܽ۫;->ۢ:I

    const-wide/16 v10, 0x1

    if-nez v3, :cond_1

    .line 535
    iget v3, v0, Ll/ۨܽ۫;->۟:I

    int-to-long v3, v3

    iget v0, v0, Ll/ۨܽ۫;->ᩳ:I

    mul-int/lit8 v0, v0, 0xa

    shl-long v5, v10, v0

    mul-long v3, v3, v5

    .line 536
    div-long v5, v1, v3

    long-to-int v0, v5

    int-to-long v5, v0

    mul-long v5, v5, v3

    cmp-long v12, v5, v1

    if-eqz v12, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    :goto_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 543
    :cond_1
    iget v0, v0, Ll/ۨܽ۫;->֡:I

    int-to-long v3, v0

    .line 544
    div-long v3, v1, v3

    cmp-long v5, v3, v10

    if-gez v5, :cond_2

    cmp-long v5, v3, v1

    if-gez v5, :cond_2

    move-wide v12, v10

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v12, v3

    :goto_2
    int-to-long v3, v0

    mul-long v3, v3, v12

    sub-long/2addr v1, v3

    long-to-int v14, v1

    .line 550
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v15

    const/4 v1, 0x1

    const/4 v6, 0x1

    :goto_3
    if-gt v6, v0, :cond_6

    .line 551
    invoke-virtual/range {p0 .. p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-nez v1, :cond_6

    move-object/from16 v4, p3

    .line 552
    invoke-static {v6, v15, v4}, Ll/ۢܽ۫;->ۤ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 553
    invoke-virtual {v7, v1}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    if-ne v6, v0, :cond_3

    const-wide v2, 0x7fffffffffffffffL

    :goto_4
    move-wide/from16 v16, v2

    goto :goto_5

    :cond_3
    sub-int v2, v0, v6

    if-ge v2, v14, :cond_4

    add-long v2, v12, v10

    goto :goto_4

    :cond_4
    move-wide/from16 v16, v12

    .line 266
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ll/᩷ۨᩴ;->getParent()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    const/4 v1, 0x0

    :goto_6
    move-object v3, v1

    goto :goto_7

    .line 269
    :cond_5
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    goto :goto_6

    :goto_7
    move-object/from16 v1, p0

    move-object v2, v9

    move-wide/from16 v4, v16

    move/from16 v16, v6

    move-object v6, v8

    .line 562
    invoke-direct/range {v1 .. v6}, Ll/ۢܽ۫;->ۙ(Ljava/io/BufferedInputStream;Ll/᩷ۨᩴ;JLl/ۗۧܺ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v6, v16, 0x1

    goto :goto_3

    .line 564
    :cond_6
    invoke-virtual {v9}, Ljava/io/BufferedInputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 531
    :try_start_1
    invoke-virtual {v9}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1
.end method

.method public static ۤ(IILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 656
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 657
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-ge p0, p1, :cond_0

    const/4 p0, 0x0

    const/16 v1, 0x30

    .line 658
    invoke-virtual {v0, p0, v1}, Ljava/lang/StringBuilder;->insert(IC)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p0, "{D}"

    .line 660
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ᩷(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/ۢܽ۫;->ۤ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const v0, 0x7f120b8e

    .line 499
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    const-string v0, "..."

    .line 500
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Lbin/mt/plus/Main;Ll/۠ۨܳ;Ll/۠ۨܳ;Ll/ۨۜۧ;)V
    .locals 0

    .line 605
    iget-object p1, p0, Ll/ۢܽ۫;->ܺۙ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p0, p2}, Ll/ᩳۜۧ;->᩷(Ll/۠ۨܳ;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 606
    invoke-virtual {p2, p1}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 607
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܽۙ()V

    :cond_0
    return-void
.end method

.method public final ۧ()Ll/ۨۜۧ;
    .locals 8

    const-string v0, "file"

    .line 506
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩵(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    const-string v1, "arguments"

    .line 507
    invoke-virtual {p0, v1}, Ll/ᩳۜۧ;->ܶ(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Ll/ۨܽ۫;

    const-string v2, "pattern"

    .line 508
    invoke-virtual {p0, v2}, Ll/ᩳۜۧ;->᩹(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 509
    sget-object v3, Ll/ۨ۠ۧ;->֡:Ll/ۨ۠ۧ;

    invoke-static {v0, v3}, Ll/ۛ۠ۧ;->ۙ(Ll/᩷ۨᩴ;Ll/ۨ۠ۧ;)V

    .line 774
    :try_start_0
    iget v3, v1, Ll/ۨܽ۫;->ۢ:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_3

    .line 571
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->۠ۙ()J

    move-result-wide v3

    const-wide v5, 0x3fffffffffffffffL    # 1.9999999999999998

    cmp-long v7, v3, v5

    if-lez v7, :cond_2

    const-wide v3, 0x7fffffffffffffffL

    goto :goto_2

    :cond_2
    const-wide/16 v5, 0x2

    mul-long v3, v3, v5

    .line 573
    :goto_2
    new-instance v5, Ll/ۗۧܺ;

    invoke-direct {v5, v3, v4}, Ll/ۗۧܺ;-><init>(J)V

    new-instance v3, Ll/۬ۧۧ;

    const/4 v4, 0x3

    invoke-direct {v3, v4, p0}, Ll/۬ۧۧ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v5, v3}, Ll/ۗۧܺ;->ۙ(Ll/ܽۧܺ;)V

    .line 574
    new-instance v3, Ll/ܰܽ۫;

    invoke-direct {v3, v0}, Ll/ܰܽ۫;-><init>(Ll/᩷ۨᩴ;)V

    new-instance v4, Ll/ᩳܽ۫;

    invoke-direct {v4, p0, v0, v2}, Ll/ᩳܽ۫;-><init>(Ll/ۢܽ۫;Ll/᩷ۨᩴ;Ljava/lang/String;)V

    new-instance v2, Ll/ۙ᩻ۧ;

    const/4 v6, 0x2

    invoke-direct {v2, v6, p0}, Ll/ۙ᩻ۧ;-><init>(ILjava/lang/Object;)V

    invoke-static {v3, v4, v1, v5, v2}, Ll/۬ܽ۫;->ۙ(Ll/ܰܽ۫;Ll/ᩳܽ۫;Ll/ۨܽ۫;Ll/ۗۧܺ;Ll/ۙ᩻ۧ;)V

    goto :goto_3

    .line 514
    :cond_3
    invoke-direct {p0, v0, v1, v2}, Ll/ۢܽ۫;->ۙ(Ll/᩷ۨᩴ;Ll/ۨܽ۫;Ljava/lang/String;)V
    :try_end_0
    .catch Ll/֡ܽ۫; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    nop

    .line 519
    :goto_3
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v2

    if-nez v2, :cond_4

    iget-boolean v1, v1, Ll/ۨܽ۫;->֨:Z

    if-eqz v1, :cond_4

    .line 520
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۢ()Z

    .line 522
    :cond_4
    invoke-virtual {p0}, Ll/ᩳۜۧ;->ᩳۙ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0
.end method

.method public final ܶۙ()Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "file"

    .line 494
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩹(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120c57

    .line 651
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object v1

    .line 494
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120bf6

    .line 655
    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/ۨۜۧ;)V
    .locals 0

    .line 613
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    return-void
.end method

.method public final ᩺()Ll/ۨ֡֫;
    .locals 1

    .line 489
    sget-object v0, Ll/ܰ۬ۧ;->᩻:Ll/ۨ֡֫;

    return-object v0
.end method
