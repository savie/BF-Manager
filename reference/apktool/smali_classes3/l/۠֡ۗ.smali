.class public final Ll/۠֡ۗ;
.super Ljava/lang/Object;
.source "C6CM"


# static fields
.field public static final ܳ:Ll/᩻ܽ᩺;

.field public static final synthetic ᩴ:I


# instance fields
.field public final ۙ:Ll/ܳ֡ۗ;

.field public final ۤ:Ll/ۖۡۗ;

.field public final ᩷:Ll/ۨ֡ۗ;

.field public final ᩸:Ll/ۜ֡ۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 64
    const-class v0, Ll/۠֡ۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/۠֡ۗ;->ܳ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p2, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    .line 73
    iput-object p1, p0, Ll/۠֡ۗ;->᩷:Ll/ۨ֡ۗ;

    .line 74
    invoke-virtual {p1}, Ll/ۨ֡ۗ;->ۙ()Ll/ܳ֡ۗ;

    move-result-object v0

    iput-object v0, p0, Ll/۠֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    .line 75
    new-instance v0, Ll/ۜ֡ۗ;

    invoke-direct {v0, p1, p2}, Ll/ۜ֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V

    iput-object v0, p0, Ll/۠֡ۗ;->᩸:Ll/ۜ֡ۗ;

    return-void
.end method

.method public static ۙ(I)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-gez p0, :cond_0

    neg-int p0, p0

    .line 675
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const-string p0, "LB_%x"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 677
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v0

    const-string p0, "L%x"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۡۗ;)Ljava/lang/String;
    .locals 2

    .line 662
    invoke-virtual {p0}, Ll/᩷ۡۗ;->ۖ()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const-string p0, "L%d"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;)Ll/۠֡ۗ;
    .locals 8

    .line 657
    new-instance v7, Ll/ۨ֡ۗ;

    invoke-virtual {p0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    const/4 v5, 0x1

    sget-object v6, Ll/ۡۘۗ;->᩶:Ll/ۡۘۗ;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/ۨ֡ۗ;-><init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;ZZZLl/ۡۘۗ;)V

    .line 658
    new-instance v0, Ll/۠֡ۗ;

    invoke-direct {v0, v7, p0}, Ll/۠֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V

    return-object v0
.end method

.method public static synthetic ۙ(Ll/ۖۡۗ;Ll/ܽۘۗ;Ljava/util/Set;)V
    .locals 1

    .line 487
    new-instance v0, Ll/ᩳ֡ۗ;

    invoke-direct {v0, p0, p1}, Ll/ᩳ֡ۗ;-><init>(Ll/ۖۡۗ;Ll/ܽۘۗ;)V

    invoke-static {p2, v0}, Ll/ۙ۬᩹;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method private ۙ(Ll/ۗۘۗ;Ll/ۖ֡ۗ;Ljava/util/ArrayList;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .line 434
    sget-object v0, Ll/ۖ֡ۗ;->ܿ:Ll/ۖ֡ۗ;

    iget-object v4, v1, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    if-ne v3, v0, :cond_1

    .line 54
    invoke-virtual {v4}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۘۗ;->۫()Ll/ܽۘۗ;

    move-result-object v0

    .line 434
    sget-object v5, Ll/ܽۘۗ;->᩶:Ll/ܽۘۗ;

    if-eq v0, v5, :cond_1

    .line 435
    invoke-virtual {v4}, Ll/ۖۡۗ;->᩵ۙ()I

    move-result v0

    int-to-long v5, v0

    const-wide/16 v7, 0xc8

    cmp-long v0, v5, v7

    if-lez v0, :cond_1

    .line 437
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ۤ()V

    .line 438
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Method dump skipped, instruction units count: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 439
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "To view this dump change \'Code comments level\' option to \'DEBUG\'"

    .line 440
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    goto :goto_0

    :cond_0
    const-string v0, "To view this dump add \'--comments-level debug\' option"

    .line 442
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 444
    :goto_0
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->۫()V

    return-void

    .line 448
    :cond_1
    sget-object v0, Ll/ۖ֡ۗ;->֡:Ll/ۖ֡ۗ;

    sget-object v5, Ll/۠֡ۗ;->ܳ:Ll/᩻ܽ᩺;

    if-eq v3, v0, :cond_2

    .line 450
    :try_start_0
    invoke-static {v4}, Ll/۠֡ۗ;->᩷(Ll/ۖۡۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v3, v0

    const-string v0, "Error reload instructions in fallback mode:"

    .line 452
    invoke-interface {v5, v0, v3}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 453
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "// Can\'t load method instructions: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    return-void

    .line 457
    :cond_2
    :goto_1
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۙ()[Ll/ᩳۡۗ;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v0, "// Can\'t load method instructions."

    .line 459
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    return-void

    .line 462
    :cond_3
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ۤ()V

    const/16 v0, 0x20

    .line 463
    iget-object v7, v1, Ll/۠֡ۗ;->᩸:Ll/ۜ֡ۗ;

    if-eqz p3, :cond_9

    .line 495
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 496
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_4
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۡ֡ۗ;

    .line 497
    invoke-static {v10}, Ll/ۡ֡ۗ;->ۙ(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10}, Ll/ۡ֡ۗ;->᩷(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    .line 498
    invoke-static {v10}, Ll/ۡ֡ۗ;->ۙ(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 501
    :cond_5
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_6
    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/16 v11, 0x3b

    const-string v12, " = "

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۡ֡ۗ;

    .line 502
    invoke-static {v10}, Ll/ۡ֡ۗ;->᩷(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    .line 503
    new-instance v13, Ll/᩵֨ۗ;

    const-string v14, "instructionArg"

    invoke-static {v10}, Ll/ۡ֡ۗ;->ۤ(Ll/ۡ֡ۗ;)Ll/֫֨ۗ;

    move-result-object v15

    invoke-direct {v13, v15, v14}, Ll/᩵֨ۗ;-><init>(Ll/֫֨ۗ;Ljava/lang/String;)V

    invoke-virtual {v7, v13}, Ll/ۜ֡ۗ;->ۙ(Ll/᩵֨ۗ;)Ljava/lang/String;

    move-result-object v13

    .line 504
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->᩷()Ll/ܳܰۗ;

    .line 505
    iget-object v14, v1, Ll/۠֡ۗ;->᩷:Ll/ۨ֡ۗ;

    invoke-static {v10}, Ll/ۡ֡ۗ;->ۤ(Ll/ۡ֡ۗ;)Ll/֫֨ۗ;

    move-result-object v15

    invoke-virtual {v14, v2, v15}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    .line 506
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    move-result-object v14

    invoke-interface {v14, v13}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v14

    invoke-interface {v14, v12}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v12

    invoke-static {v10}, Ll/ۡ֡ۗ;->᩷(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v12, v14}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v12

    invoke-interface {v12, v11}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 507
    invoke-static {v10, v13}, Ll/ۡ֡ۗ;->ۙ(Ll/ۡ֡ۗ;Ljava/lang/String;)V

    goto :goto_3

    .line 510
    :cond_7
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡ֡ۗ;

    .line 511
    invoke-static {v7}, Ll/ۡ֡ۗ;->ۙ(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7}, Ll/ۡ֡ۗ;->᩷(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    .line 512
    invoke-static {v7}, Ll/ۡ֡ۗ;->ۙ(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2, v8}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    move-result-object v8

    invoke-interface {v8, v12}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v8

    invoke-static {v7}, Ll/ۡ֡ۗ;->᩷(Ll/ۡ֡ۗ;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v7

    invoke-interface {v7, v11}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    goto :goto_4

    .line 465
    :cond_9
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 466
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    invoke-virtual {v7, v0}, Ll/ۜ֡ۗ;->ۙ(Ll/ۛ֨ۗ;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    move-result-object v0

    const-string v7, " = this;"

    invoke-interface {v0, v7}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 538
    :cond_a
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ۙ()I

    move-result v7

    .line 539
    invoke-static {v4}, Ll/۠֡ۗ;->ۙ(Ll/ۖۡۗ;)Ll/۠֡ۗ;

    move-result-object v4

    .line 540
    new-instance v8, Ll/֡֡ۗ;

    const/4 v9, 0x1

    invoke-direct {v8, v4, v9}, Ll/֡֡ۗ;-><init>(Ll/۠֡ۗ;Z)V

    .line 542
    array-length v10, v6

    const/4 v0, 0x0

    const/4 v11, 0x0

    :goto_5
    if-ge v11, v10, :cond_16

    aget-object v12, v6, v11

    if-nez v12, :cond_b

    goto/16 :goto_b

    .line 553
    :cond_b
    sget-object v13, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 554
    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܳᩳۗ;

    const-string v14, "// "

    .line 555
    invoke-interface {v2, v14}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    move-result-object v14

    invoke-virtual {v13}, Ll/ܳᩳۗ;->᩸()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v14, v13}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_6

    .line 559
    :cond_c
    sget-object v13, Ll/ۖ֡ۗ;->᩶:Ll/ۖ֡ۗ;

    if-eq v3, v13, :cond_f

    .line 633
    sget-object v13, Ll/ۧ۟ۗ;->᩻:Ll/ۧ۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v13

    if-eqz v13, :cond_d

    goto :goto_7

    .line 636
    :cond_d
    sget-object v13, Ll/ۧ۟ۗ;->᩺:Ll/ۧ۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v14

    if-eqz v14, :cond_f

    if-eqz v0, :cond_e

    .line 638
    invoke-virtual {v0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v14

    sget-object v15, Ll/᩺ۢۗ;->۫ۙ:Ll/᩺ۢۗ;

    if-ne v14, v15, :cond_e

    .line 639
    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v13

    .line 640
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v14

    if-ne v14, v9, :cond_e

    const/4 v14, 0x0

    .line 641
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/۫ᩳۗ;

    .line 642
    invoke-virtual {v13}, Ll/۫ᩳۗ;->᩷()I

    move-result v14

    invoke-virtual {v0}, Ll/ᩳۡۗ;->getOffset()I

    move-result v15

    if-ne v14, v15, :cond_e

    invoke-virtual {v13}, Ll/۫ᩳۗ;->ۙ()I

    move-result v13

    invoke-virtual {v12}, Ll/ᩳۡۗ;->getOffset()I

    move-result v14

    if-ne v13, v14, :cond_e

    .line 643
    check-cast v0, Ll/ܽۢۗ;

    invoke-virtual {v0}, Ll/ܽۢۗ;->᩵ۙ()I

    move-result v0

    .line 644
    invoke-virtual {v12}, Ll/ᩳۡۗ;->getOffset()I

    move-result v13

    if-ne v13, v0, :cond_f

    .line 560
    :cond_e
    :goto_7
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->۫()V

    .line 561
    invoke-virtual {v12}, Ll/ᩳۡۗ;->getOffset()I

    move-result v0

    invoke-static {v0}, Ll/۠֡ۗ;->ۙ(I)Ljava/lang/String;

    move-result-object v0

    const-string v13, ":"

    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 562
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ۤ()V

    .line 564
    :cond_f
    invoke-virtual {v12}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v13, Ll/᩺ۢۗ;->᩶ۙ:Ll/᩺ۢۗ;

    if-ne v0, v13, :cond_10

    goto/16 :goto_a

    .line 623
    :cond_10
    :try_start_1
    sget-object v0, Ll/ۖ֡ۗ;->ܿ:Ll/ۖ֡ۗ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v13, "*/"

    if-ne v3, v0, :cond_11

    .line 624
    :try_start_2
    invoke-virtual {v12}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v14, Ll/᩺ۢۗ;->ۙۙ:Ll/᩺ۢۗ;

    if-ne v0, v14, :cond_11

    .line 625
    move-object v0, v12

    check-cast v0, Ll/ۚۢۗ;

    invoke-virtual {v0}, Ll/ۚۢۗ;->getString()Ljava/lang/String;

    move-result-object v0

    .line 626
    invoke-virtual {v0, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    goto :goto_8

    :cond_11
    const/4 v0, 0x0

    :goto_8
    if-eqz v0, :cond_12

    .line 570
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->۫()V

    .line 571
    invoke-interface {v2, v13}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    const-string v13, "//  "

    .line 572
    invoke-interface {v2, v13}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    goto :goto_9

    .line 574
    :cond_12
    invoke-virtual {v12}, Ll/ۚᩳۗ;->۠()I

    move-result v13

    invoke-interface {v2, v13}, Ll/ۗۘۗ;->ۤ(I)Ll/ܳܰۗ;

    .line 576
    :goto_9
    invoke-static {v2, v12}, Ll/ܽܰۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;)V

    .line 577
    invoke-virtual {v12}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v13

    if-eqz v13, :cond_13

    .line 579
    invoke-virtual {v13}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v13

    .line 580
    invoke-virtual {v13}, Ll/֫֨ۗ;->᩶()Z

    move-result v14

    if-eqz v14, :cond_13

    .line 581
    invoke-virtual {v13}, Ll/֫֨ۗ;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v2, v13}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object v13

    const/16 v14, 0x20

    invoke-interface {v13, v14}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 584
    :cond_13
    sget-object v13, Ll/ܿ֡ۗ;->֡:Ll/ܿ֡ۗ;

    invoke-virtual {v8, v12, v2, v13}, Ll/֡֡ۗ;->ۙ(Ll/ᩳۡۗ;Ll/ۗۘۗ;Ll/ܿ֡ۗ;)V

    if-eqz v0, :cond_14

    const-string v0, "/*"

    .line 586
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 587
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ۤ()V

    .line 589
    :cond_14
    invoke-direct {v4, v2, v12, v9}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;Z)V

    .line 590
    iget-object v0, v4, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-static {v2, v0, v12}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۨᩳۗ;Ll/ܺ۟ۗ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    const-string v13, "Error generate fallback instruction: "

    .line 592
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {v5, v13, v0}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 593
    invoke-interface {v2, v7}, Ll/ۗۘۗ;->ۙ(I)V

    .line 594
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v13, "// error: "

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    :cond_15
    :goto_a
    move-object v0, v12

    :goto_b
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_5

    .line 469
    :cond_16
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->۫()V

    return-void
.end method

.method public static ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;I)V
    .locals 2

    .line 181
    new-instance v0, Ll/ܶܰۗ;

    invoke-interface {p0}, Ll/ۗۘۗ;->getLength()I

    move-result v1

    sub-int/2addr v1, p2

    invoke-direct {v0, p1, v1}, Ll/ܶܰۗ;-><init>(Ll/ܺܰۗ;I)V

    invoke-interface {p0, v0}, Ll/ۗۘۗ;->ۙ(Ll/ۧܰۗ;)V

    return-void
.end method

.method private ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;Z)V
    .locals 4

    .line 600
    sget-object v0, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object p2

    check-cast p2, Ll/᩷۠ۗ;

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "     // Catch:"

    .line 604
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 605
    invoke-virtual {p2}, Ll/᩷۠ۗ;->ۙ()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۙ۠ۗ;

    .line 606
    invoke-virtual {v0}, Ll/ۙ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v1

    const/16 v2, 0x20

    .line 607
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 608
    invoke-virtual {v0}, Ll/ۙ۠ۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object v2

    iget-object v3, p0, Ll/۠֡ۗ;->᩷:Ll/ۨ֡ۗ;

    if-nez v2, :cond_1

    .line 609
    sget-object v0, Ll/֫֨ۗ;->ᩳ:Ll/֫֨ۗ;

    invoke-virtual {v3, p1, v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    goto :goto_1

    .line 611
    :cond_1
    invoke-virtual {v0}, Ll/ۙ۠ۗ;->᩷()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {v3, p1, v0}, Ll/ۨ֡ۗ;->ۤ(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V

    :goto_1
    const-string v0, " -> "

    .line 613
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    if-eqz p3, :cond_2

    .line 615
    invoke-virtual {v1}, Ll/ᩴ۠ۗ;->۫()I

    move-result v0

    invoke-static {v0}, Ll/۠֡ۗ;->ۙ(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_0

    .line 617
    :cond_2
    invoke-virtual {v1}, Ll/ᩴ۠ۗ;->ܳ()Ll/᩷ۡۗ;

    move-result-object v0

    invoke-static {v0}, Ll/۠֡ۗ;->ۙ(Ll/᩷ۡۗ;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method private ۙ(Ll/ۤܰۗ;)V
    .locals 9

    .line 394
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 395
    iget-object v1, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 396
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 398
    :cond_0
    invoke-virtual {v1}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛ֨ۗ;

    .line 399
    invoke-virtual {v3}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 401
    :cond_1
    invoke-virtual {v1}, Ll/ۖۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿ֨ۗ;

    .line 402
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->᩸()Ll/ᩳۡۗ;

    move-result-object v4

    .line 403
    invoke-virtual {v3}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v3

    if-eqz v4, :cond_2

    .line 404
    invoke-virtual {v4}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v4

    sget-object v5, Ll/᩺ۢۗ;->᩵ۙ:Ll/᩺ۢۗ;

    if-ne v4, v5, :cond_2

    .line 405
    invoke-virtual {v3}, Ll/ۧ֨ۗ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 406
    iget-object v4, p0, Ll/۠֡ۗ;->᩸:Ll/ۜ֡ۗ;

    invoke-virtual {v4, v3}, Ll/ۜ֡ۗ;->ۙ(Ll/ۧ֨ۗ;)Ljava/lang/String;

    goto :goto_1

    .line 358
    :cond_3
    new-instance v0, Ll/᩸۟ۗ;

    invoke-direct {v0, v1}, Ll/᩸۟ۗ;-><init>(Ll/ۖۡۗ;)V

    .line 359
    invoke-virtual {v0}, Ll/᩸۟ۗ;->ۙ()Ljava/util/List;

    move-result-object v2

    .line 360
    new-instance v3, Ll/֡֡ۗ;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Ll/֡֡ۗ;-><init>(Ll/۠֡ۗ;Z)V

    .line 361
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩷ۡۗ;

    .line 362
    sget-object v5, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v4, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_2

    .line 365
    :cond_5
    invoke-virtual {v0, v4}, Ll/᩸۟ۗ;->᩷(Ll/᩷ۡۗ;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 366
    invoke-virtual {p1}, Ll/ܳܰۗ;->۫()V

    .line 367
    invoke-static {v4}, Ll/۠֡ۗ;->ۙ(Ll/᩷ۡۗ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    const/16 v5, 0x3a

    invoke-interface {p1, v5}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 368
    invoke-virtual {p1}, Ll/ܳܰۗ;->ۤ()V

    .line 370
    :cond_6
    invoke-virtual {v4}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    .line 371
    sget-object v7, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v6, v7}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v7

    if-nez v7, :cond_7

    .line 372
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    if-eqz v7, :cond_8

    .line 373
    invoke-virtual {v6}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v7

    .line 374
    invoke-virtual {v7}, Ll/ۧ֨ۗ;->ܳ()Z

    move-result v8

    if-nez v8, :cond_8

    .line 375
    sget-object v8, Ll/֫۟ۗ;->۬:Ll/֫۟ۗ;

    invoke-virtual {v6, v8}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    .line 376
    invoke-virtual {v7}, Ll/ۧ֨ۗ;->֫()V

    .line 379
    :cond_8
    invoke-static {p1, v6}, Ll/ܽܰۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;)V

    const/4 v7, 0x0

    .line 276
    invoke-virtual {v3, v6, p1, v7}, Ll/֡֡ۗ;->ۙ(Ll/ᩳۡۗ;Ll/ۗۘۗ;Ll/ܿ֡ۗ;)V

    const/4 v7, 0x0

    .line 381
    invoke-direct {p0, p1, v6, v7}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;Z)V

    .line 382
    invoke-static {p1, v1, v6}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۨᩳۗ;Ll/ܺ۟ۗ;)V

    goto :goto_3

    .line 385
    :cond_9
    invoke-virtual {v0, v4}, Ll/᩸۟ۗ;->ۙ(Ll/᩷ۡۗ;)Ll/᩷ۡۗ;

    move-result-object v4

    if-eqz v4, :cond_4

    const-string v5, "goto "

    .line 387
    invoke-virtual {p1, v5}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    invoke-static {v4}, Ll/۠֡ۗ;->ۙ(Ll/᩷ۡۗ;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto/16 :goto_2

    :cond_a
    return-void
.end method

.method public static ᩷(Ll/ۖۡۗ;)V
    .locals 7

    .line 474
    sget-object v0, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v1

    .line 475
    sget-object v2, Ll/ۧ۟ۗ;->ۨ:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v2

    check-cast v2, Ll/ᩴᩳۗ;

    .line 476
    sget-object v3, Ll/ۧ۟ۗ;->᩸:Ll/ۧ۟ۗ;

    invoke-virtual {p0, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;)Ljava/util/List;

    move-result-object v4

    .line 478
    :try_start_0
    invoke-virtual {p0}, Ll/ۖۡۗ;->᩵᩷()V

    .line 479
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܶ᩷()V

    .line 480
    invoke-static {}, Ll/ۢܿۗ;->ۙ()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬ۜۗ;

    .line 481
    invoke-static {v6, p0}, Ll/ۜ۠ۗ;->ۙ(Ll/۬ۜۗ;Ll/ۖۡۗ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 484
    :cond_0
    invoke-virtual {p0, v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/util/List;)V

    if-eqz v2, :cond_1

    .line 486
    invoke-virtual {v2}, Ll/ᩴᩳۗ;->ۙ()Ljava/util/EnumMap;

    move-result-object v0

    new-instance v1, Ll/۟֡ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/۟֡ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 489
    :cond_1
    invoke-virtual {p0, v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/util/List;)V

    return-void

    :catchall_0
    move-exception v5

    .line 484
    invoke-virtual {p0, v0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/util/List;)V

    if-eqz v2, :cond_2

    .line 486
    invoke-virtual {v2}, Ll/ᩴᩳۗ;->ۙ()Ljava/util/EnumMap;

    move-result-object v0

    new-instance v1, Ll/۟֡ۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/۟֡ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Ll/ۧۚۗ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 489
    :cond_2
    invoke-virtual {p0, v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/util/List;)V

    .line 490
    throw v5
.end method


# virtual methods
.method public final ۙ()Ll/ۨ֡ۗ;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/۠֡ۗ;->᩷:Ll/ۨ֡ۗ;

    return-object v0
.end method

.method public final ۙ(Ll/ۗۘۗ;)V
    .locals 5

    .line 275
    iget-object v0, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v0}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object v1

    .line 276
    sget-object v2, Ll/֨֡ۗ;->ۙ:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    const/4 v3, 0x3

    const/4 v4, 0x0

    if-eq v1, v3, :cond_1

    const/4 v0, 0x4

    if-eq v1, v0, :cond_0

    return-void

    .line 295
    :cond_0
    sget-object v0, Ll/ۖ֡ۗ;->֡:Ll/ۖ֡ۗ;

    .line 429
    invoke-direct {p0, p1, v0, v4}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖ֡ۗ;Ljava/util/ArrayList;)V

    return-void

    .line 319
    :cond_1
    sget-object v1, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v1}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 320
    invoke-virtual {p0, p1, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Z)V

    return-void

    .line 323
    :cond_2
    invoke-virtual {v0}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v0, "// Blocks not ready for readable form, using instruction form"

    .line 324
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 325
    sget-object v0, Ll/ۖ֡ۗ;->֡:Ll/ۖ֡ۗ;

    .line 429
    invoke-direct {p0, p1, v0, v4}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖ֡ۗ;Ljava/util/ArrayList;)V

    return-void

    .line 328
    :cond_3
    invoke-virtual {v0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v1

    .line 329
    invoke-virtual {v1}, Ll/ۛۘۗ;->ܳ()Ll/᩵ۘۗ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ll/ۤܰۗ;

    invoke-direct {v3, v1}, Ll/ۤܰۗ;-><init>(Ll/ۛۘۗ;)V

    .line 331
    :try_start_0
    invoke-interface {p1}, Ll/ۗۘۗ;->ۙ()I

    move-result v1

    invoke-virtual {v3, v1}, Ll/ܳܰۗ;->ۙ(I)V

    .line 332
    invoke-direct {p0, v3}, Ll/۠֡ۗ;->ۙ(Ll/ۤܰۗ;)V

    .line 333
    invoke-interface {p1, v3}, Ll/ۗۘۗ;->ۙ(Ll/ۤܰۗ;)Ll/ۗۘۗ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "Readable code generation failed"

    .line 19
    invoke-static {v0, v3, v1}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 336
    invoke-static {p1, v3, v1}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    invoke-virtual {p0, p1, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Z)V

    return-void

    .line 287
    :cond_4
    invoke-virtual {p0, p1}, Ll/۠֡ۗ;->᩷(Ll/ۗۘۗ;)V

    return-void

    .line 278
    :cond_5
    iget-object v1, p0, Ll/۠֡ۗ;->᩷:Ll/ۨ֡ۗ;

    invoke-virtual {v1}, Ll/ۨ֡ۗ;->۫()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_0

    .line 282
    :cond_6
    invoke-virtual {p0, p1}, Ll/۠֡ۗ;->᩷(Ll/ۗۘۗ;)V

    return-void

    .line 280
    :cond_7
    :goto_0
    invoke-virtual {p0, p1}, Ll/۠֡ۗ;->ۤ(Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;Z)V
    .locals 5

    .line 343
    sget-object v0, Ll/ܽۘۗ;->ۢ:Ll/ܽۘۗ;

    iget-object v1, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v1, v0}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/* WARN: Readable processing failed; using instruction form */"

    .line 344
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 346
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 347
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 348
    new-instance v2, Ll/ۡ֡ۗ;

    invoke-virtual {v1}, Ll/ۖۡۗ;->ۡۙ()Ll/ۛ֨ۗ;

    move-result-object v3

    const-string v4, "this"

    invoke-direct {v2, v3, v4}, Ll/ۡ֡ۗ;-><init>(Ll/ۛ֨ۗ;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    :cond_1
    invoke-virtual {v1}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ֨ۗ;

    .line 351
    new-instance v3, Ll/ۡ֡ۗ;

    iget-object v4, p0, Ll/۠֡ۗ;->᩸:Ll/ۜ֡ۗ;

    invoke-virtual {v4, v2}, Ll/ۜ֡ۗ;->ۙ(Ll/ۛ֨ۗ;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Ll/ۡ֡ۗ;-><init>(Ll/ۛ֨ۗ;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_3

    .line 353
    sget-object p2, Ll/ۖ֡ۗ;->۟:Ll/ۖ֡ۗ;

    goto :goto_1

    :cond_3
    sget-object p2, Ll/ۖ֡ۗ;->֡:Ll/ۖ֡ۗ;

    :goto_1
    invoke-direct {p0, p1, p2, v0}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖ֡ۗ;Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;I)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 97
    iget-object v3, v0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v3}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    .line 98
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩷ۢۗ;->᩹()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_0

    .line 99
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->᩷()Ll/ܳܰۗ;

    .line 100
    invoke-static {v1, v3, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;I)V

    const-string v2, "static"

    .line 101
    invoke-interface {v1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return v6

    .line 104
    :cond_0
    sget-object v5, Ll/֫۟ۗ;->۟:Ll/֫۟ۗ;

    invoke-virtual {v3, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    .line 105
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v5

    invoke-static {v5}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ܶۘۗ;->ۙ()Z

    move-result v5

    if-nez v5, :cond_1

    .line 107
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->᩷()Ll/ܳܰۗ;

    .line 108
    invoke-static {v1, v3, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;I)V

    return v7

    .line 193
    :cond_1
    sget-object v5, Ll/ۧ۟ۗ;->ᩳ:Ll/ۧ۟ۗ;

    invoke-virtual {v3, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v5

    check-cast v5, Ll/ܶᩳۗ;

    const-string v8, ", "

    if-nez v5, :cond_2

    goto :goto_0

    .line 197
    :cond_2
    invoke-virtual {v5}, Ll/ܶᩳۗ;->ۙ()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    const-string v9, "@Override"

    .line 198
    invoke-interface {v1, v9}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 199
    sget-object v9, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    invoke-virtual {v3, v9}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, " // "

    .line 200
    invoke-interface {v1, v9}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 201
    invoke-virtual {v5}, Ll/ܶᩳۗ;->᩷()Ljava/util/List;

    move-result-object v5

    new-instance v9, Ll/ۢ֡ۗ;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Ll/ۢ֡ۗ;-><init>(I)V

    invoke-static {v5, v8, v9}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 115
    :cond_3
    :goto_0
    iget-object v5, v0, Ll/۠֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    invoke-virtual {v5, v1, v3}, Ll/ܳ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;)V

    .line 117
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v9

    .line 119
    invoke-virtual {v9}, Ll/ۢᩳۗ;->ۚ()Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x400

    .line 120
    invoke-virtual {v4, v10}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v4

    .line 121
    invoke-virtual {v4, v6}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v4

    .line 124
    :cond_4
    invoke-virtual {v9}, Ll/ۢᩳۗ;->ۤ()Z

    move-result v10

    if-eqz v10, :cond_5

    .line 125
    invoke-virtual {v4, v6}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v4

    .line 127
    :cond_5
    sget-object v10, Ll/֫۟ۗ;->ۘۙ:Ll/֫۟ۗ;

    invoke-virtual {v3, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v10

    if-eqz v10, :cond_8

    sget-object v10, Ll/ܽۘۗ;->ܿ:Ll/ܽۘۗ;

    invoke-virtual {v3, v10}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v10

    if-eqz v10, :cond_8

    const-string v10, "/*"

    .line 128
    invoke-interface {v1, v10}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 129
    move-object v10, v1

    check-cast v10, Ll/ܳܰۗ;

    invoke-virtual {v10}, Ll/ܳܰۗ;->ۤ()V

    const-string v11, "Code decompiled incorrectly, please refer to instructions dump."

    .line 130
    invoke-virtual {v10, v11}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 131
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۛۘۗ;->ᩴۙ()Z

    move-result v11

    if-nez v11, :cond_7

    .line 0
    instance-of v11, v10, Ll/ۤܰۗ;

    if-eqz v11, :cond_6

    const-string v11, "To view partially-correct code enable \'Show inconsistent code\' option in preferences"

    .line 133
    invoke-virtual {v10, v11}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    goto :goto_1

    :cond_6
    const-string v11, "To view partially-correct add \'--show-bad-code\' argument"

    .line 135
    invoke-virtual {v10, v11}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 138
    :cond_7
    :goto_1
    invoke-virtual {v10}, Ll/ܳܰۗ;->۫()V

    const-string v11, "*/"

    .line 139
    invoke-virtual {v10, v11}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 142
    :cond_8
    invoke-virtual {v3}, Ll/ۚᩳۗ;->۠()I

    move-result v10

    invoke-interface {v1, v10}, Ll/ۗۘۗ;->ۤ(I)Ll/ܳܰۗ;

    .line 143
    sget-object v10, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    invoke-virtual {v3, v10}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v10

    invoke-virtual {v4, v10}, Ll/ۢᩳۗ;->ۙ(Z)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v1, v10}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 144
    invoke-virtual {v9}, Ll/ۢᩳۗ;->ۚ()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-virtual {v3}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v9

    if-nez v9, :cond_9

    invoke-virtual {v3}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ۢᩳۗ;->ܶ()Z

    move-result v9

    if-nez v9, :cond_9

    const-string v9, "default "

    .line 146
    invoke-interface {v1, v9}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 149
    :cond_9
    invoke-virtual {v3}, Ll/ۖۡۗ;->᩸()Ljava/util/List;

    move-result-object v9

    iget-object v10, v0, Ll/۠֡ۗ;->᩷:Ll/ۨ֡ۗ;

    invoke-virtual {v10, v1, v9, v7}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ljava/util/List;Z)Z

    move-result v7

    const/16 v9, 0x20

    if-eqz v7, :cond_a

    .line 150
    invoke-interface {v1, v9}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 152
    :cond_a
    invoke-virtual {v4}, Ll/ۢᩳۗ;->ᩴ()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 153
    invoke-static {v1, v3, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;I)V

    .line 154
    invoke-virtual {v10}, Ll/ۨ֡ۗ;->᩷()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩻ۡۗ;->֡ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_3

    .line 156
    :cond_b
    invoke-virtual {v3}, Ll/ۖۡۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v4

    invoke-virtual {v10, v1, v4}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    .line 157
    invoke-interface {v1, v9}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 185
    sget-object v4, Ll/ۧ۟ۗ;->ۢ:Ll/ۧ۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/᩹ᩳۗ;

    if-eqz v4, :cond_c

    .line 187
    invoke-virtual {v4}, Ll/᩹ᩳۗ;->ۙ()Ll/ۖۡۗ;

    move-result-object v4

    goto :goto_2

    :cond_c
    move-object v4, v3

    .line 159
    :goto_2
    invoke-static {v1, v4, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;I)V

    .line 160
    invoke-virtual {v4}, Ll/ۖۡۗ;->ۤۙ()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    :goto_3
    const/16 v2, 0x28

    .line 162
    invoke-interface {v1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 212
    invoke-virtual {v3}, Ll/ۖۡۗ;->۫ۙ()Ljava/util/List;

    move-result-object v2

    .line 213
    sget-object v4, Ll/᩻᩶ۗ;->᩸:Ll/᩻᩶ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/᩹᩶ۗ;

    .line 215
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v6

    .line 217
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v9

    invoke-static {v9}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܶۘۗ;->ۙ()Z

    move-result v9

    .line 218
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v11, -0x1

    const/4 v12, 0x1

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۛ֨ۗ;

    add-int/2addr v11, v6

    if-nez v9, :cond_d

    .line 220
    invoke-static {v3, v11}, Ll/᩶ᩳۗ;->ۙ(Ll/ۖۡۗ;I)Z

    move-result v14

    if-eqz v14, :cond_d

    goto :goto_4

    :cond_d
    if-eqz v12, :cond_e

    const/4 v6, 0x0

    const/4 v12, 0x0

    goto :goto_5

    .line 226
    :cond_e
    invoke-interface {v1, v8}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 228
    :goto_5
    invoke-virtual {v13}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v6

    if-nez v6, :cond_f

    .line 232
    invoke-virtual {v10}, Ll/ۨ֡ۗ;->۫()Z

    move-result v14

    invoke-static {v13, v14}, Ll/ۧ֨ۗ;->ۙ(Ll/ۛ֨ۗ;Z)Ll/ۧ֨ۗ;

    move-result-object v14

    goto :goto_6

    .line 234
    :cond_f
    invoke-virtual {v6}, Ll/ܿ֨ۗ;->ᩴ()Ll/ۧ֨ۗ;

    move-result-object v14

    :goto_6
    if-eqz v4, :cond_10

    .line 239
    invoke-virtual {v5, v1, v4, v11}, Ll/ܳ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/᩹᩶ۗ;I)V

    .line 241
    :cond_10
    invoke-virtual {v14}, Ll/ۧ֨ۗ;->۫()Z

    move-result v15

    if-eqz v15, :cond_11

    const-string v15, "final "

    .line 242
    invoke-interface {v1, v15}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 245
    :cond_11
    invoke-virtual {v14}, Ll/ۧ֨ۗ;->ᩴ()Ll/֫֨ۗ;

    move-result-object v15

    move-object/from16 p2, v2

    if-eqz v15, :cond_12

    .line 246
    sget-object v2, Ll/֫֨ۗ;->ۢ:Ll/֫֨ۗ;

    if-ne v15, v2, :cond_13

    .line 248
    :cond_12
    invoke-virtual {v13}, Ll/ۛ֨ۗ;->ܺۙ()Ll/֫֨ۗ;

    move-result-object v15

    :cond_13
    if-ne v11, v7, :cond_15

    .line 252
    invoke-virtual {v3}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۢᩳۗ;->᩵()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 254
    invoke-virtual {v15}, Ll/֫֨ۗ;->ۨ()Z

    move-result v2

    if-eqz v2, :cond_14

    .line 255
    invoke-virtual {v15}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object v2

    .line 256
    invoke-virtual {v10, v1, v2}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    const-string v2, "..."

    .line 257
    invoke-interface {v1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_7

    .line 259
    :cond_14
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v13, "Last argument in varargs method is not array: "

    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 260
    invoke-virtual {v10, v1, v15}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    goto :goto_7

    .line 263
    :cond_15
    invoke-virtual {v10, v1, v15}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    :goto_7
    const/16 v2, 0x20

    .line 265
    invoke-interface {v1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 266
    iget-object v2, v0, Ll/۠֡ۗ;->᩸:Ll/ۜ֡ۗ;

    invoke-virtual {v2, v14}, Ll/ۜ֡ۗ;->ۙ(Ll/ۧ֨ۗ;)Ljava/lang/String;

    move-result-object v2

    .line 267
    move-object v13, v1

    check-cast v13, Ll/ܳܰۗ;

    .line 0
    instance-of v13, v13, Ll/ۤܰۗ;

    if-eqz v13, :cond_16

    if-eqz v6, :cond_16

    .line 29
    invoke-virtual {v14}, Ll/ۧ֨ۗ;->ۙ()Ll/ܿ֨ۗ;

    move-result-object v6

    invoke-static {v3, v6}, Ll/ۗܰۗ;->ۙ(Ll/ۖۡۗ;Ll/ܿ֨ۗ;)Ll/ۗܰۗ;

    move-result-object v6

    .line 268
    invoke-interface {v1, v6}, Ll/ۗۘۗ;->ۙ(Ll/ܺܰۗ;)V

    .line 270
    :cond_16
    invoke-interface {v1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    const/4 v6, 0x1

    move-object/from16 v2, p2

    goto/16 :goto_4

    :cond_17
    const/4 v2, 0x1

    const/16 v4, 0x29

    .line 164
    invoke-interface {v1, v4}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 166
    invoke-virtual {v5, v1, v3}, Ll/ܳ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/ۖۡۗ;)V

    .line 169
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۢᩳۗ;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_19

    .line 136
    sget-object v4, Ll/᩻᩶ۗ;->ۙ:Ll/᩻᩶ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v4

    check-cast v4, Ll/ܽ᩶ۗ;

    if-nez v4, :cond_18

    const/4 v4, 0x0

    goto :goto_8

    .line 140
    :cond_18
    invoke-virtual {v4}, Ll/ܽ᩶ۗ;->ۙ()Ll/ܳ᩶ۗ;

    move-result-object v4

    :goto_8
    if-eqz v4, :cond_19

    const-string v6, " default "

    .line 172
    invoke-interface {v1, v6}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 173
    invoke-virtual {v3}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v3

    invoke-virtual {v5, v3, v1, v4}, Ll/ܳ֡ۗ;->ۙ(Ll/֫ۖۗ;Ll/ۗۘۗ;Ll/ܳ᩶ۗ;)V

    :cond_19
    return v2
.end method

.method public final ۤ()Ll/ۜ֡ۗ;
    .locals 1

    .line 83
    iget-object v0, p0, Ll/۠֡ۗ;->᩸:Ll/ۜ֡ۗ;

    return-object v0
.end method

.method public final ۤ(Ll/ۗۘۗ;)V
    .locals 3

    .line 412
    sget-object v0, Ll/ܽۘۗ;->ܿ:Ll/ܽۘۗ;

    iget-object v1, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    invoke-virtual {v1, v0}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "/*"

    .line 413
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 414
    sget-object v0, Ll/ۖ֡ۗ;->ܿ:Ll/ۖ֡ۗ;

    const/4 v2, 0x0

    .line 429
    invoke-direct {p0, p1, v0, v2}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖ֡ۗ;Ljava/util/ArrayList;)V

    const-string v0, "*/"

    .line 415
    move-object v2, p1

    check-cast v2, Ll/ܳܰۗ;

    invoke-virtual {v2, v0}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    :cond_0
    const-string v0, "throw new UnsupportedOperationException(\"Method not decompiled: "

    .line 417
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    move-result-object p1

    .line 418
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object p1

    const/16 v0, 0x2e

    .line 419
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    move-result-object p1

    .line 420
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۤۙ()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object p1

    const/16 v0, 0x28

    .line 421
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    move-result-object p1

    .line 422
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v0

    const-string v2, ", "

    .line 72
    invoke-static {v0, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 422
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object p1

    const-string v0, "):"

    .line 423
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object p1

    .line 424
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫֨ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    move-result-object p1

    const-string v0, "\");"

    .line 425
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return-void
.end method

.method public final ᩷()Ll/ۖۡۗ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    return-object v0
.end method

.method public final ᩷(Ll/ۗۘۗ;)V
    .locals 5

    const-string v0, "Method code generation error"

    .line 302
    iget-object v1, p0, Ll/۠֡ۗ;->ۤ:Ll/ۖۡۗ;

    :try_start_0
    new-instance v2, Ll/۬֡ۗ;

    const/4 v3, 0x0

    .line 60
    invoke-direct {v2, p0, v3}, Ll/֡֡ۗ;-><init>(Ll/۠֡ۗ;Z)V

    .line 303
    invoke-virtual {v1}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v3

    invoke-virtual {v2, p1, v3}, Ll/۬֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۛۡۗ;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/BootstrapMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 309
    invoke-virtual {v1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v3

    sget-object v4, Ll/֫۟ۗ;->᩸᩷:Ll/֫۟ۗ;

    invoke-virtual {v3, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 19
    invoke-static {v1, v0, v2}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 313
    invoke-static {p1, v1}, Ll/ۚ۟ۗ;->᩷(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 314
    invoke-virtual {p0, p1}, Ll/۠֡ۗ;->ۤ(Ll/ۗۘۗ;)V

    goto :goto_0

    .line 310
    :cond_0
    throw v2

    .line 305
    :catch_1
    new-instance v2, Ll/ۖۧ᩵;

    const-string v3, "StackOverflow"

    .line 11
    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 305
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {v1, v0, v2}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    invoke-static {p1, v1}, Ll/ۚ۟ۗ;->᩷(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 307
    invoke-virtual {p0, p1}, Ll/۠֡ۗ;->ۤ(Ll/ۗۘۗ;)V

    :goto_0
    return-void
.end method
