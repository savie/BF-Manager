.class public final Ll/۫ۡ֫;
.super Ll/ۖۙܺ;
.source "6AY4"


# instance fields
.field public final synthetic ֫:Z

.field public final synthetic ۚ:Ll/ᩴ֨᩵;

.field public final synthetic ۧ:Z

.field public final synthetic ۫:I

.field public final synthetic ܳ:Ll/ᩴ᩻ۙ;

.field public final synthetic ܶ:Ll/ۧۡ֫;

.field public ܺ:Z

.field public ܽ:Ljava/util/List;

.field public ᩹:Z

.field public final synthetic ᩻:Ll/ۜ᩻۫;


# direct methods
.method public constructor <init>(ZLl/ۧۡ֫;Ll/ۜ᩻۫;Ll/ᩴ᩻ۙ;ILl/ᩴ֨᩵;Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Ll/۫ۡ֫;->֫:Z

    .line 4
    iput-object p2, p0, Ll/۫ۡ֫;->ܶ:Ll/ۧۡ֫;

    .line 6
    iput-object p3, p0, Ll/۫ۡ֫;->᩻:Ll/ۜ᩻۫;

    .line 8
    iput-object p4, p0, Ll/۫ۡ֫;->ܳ:Ll/ᩴ᩻ۙ;

    .line 10
    iput p5, p0, Ll/۫ۡ֫;->۫:I

    .line 12
    iput-object p6, p0, Ll/۫ۡ֫;->ۚ:Ll/ᩴ֨᩵;

    .line 14
    iput-boolean p7, p0, Ll/۫ۡ֫;->ۧ:Z

    .line 631
    invoke-direct {p0}, Ll/ۖۙܺ;-><init>()V

    const/4 p1, 0x1

    .line 633
    iput-boolean p1, p0, Ll/۫ۡ֫;->᩹:Z

    return-void
.end method

.method public static ۙ(Ll/۫ۡ֫;Ll/ۧۡ֫;)V
    .locals 0

    .line 639
    iget-boolean p0, p0, Ll/۫ۡ֫;->᩹:Z

    if-eqz p0, :cond_1

    .line 640
    invoke-static {p1}, Ll/ۧۡ֫;->ۘ(Ll/ۧۡ֫;)Ll/ۗ֨᩷;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ll/ۗ֨᩷;->ۙ(Z)V

    return-void

    :cond_0
    const-string p0, "swipeRefreshLayout"

    invoke-static {p0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 3

    const/4 v0, 0x0

    .line 722
    iput-boolean v0, p0, Ll/۫ۡ֫;->᩹:Z

    .line 723
    iget-object v0, p0, Ll/۫ۡ֫;->ܳ:Ll/ᩴ᩻ۙ;

    invoke-virtual {v0}, Ll/ᩴ᩻ۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    sget-object v1, Ll/ۖۧۙ;->ܿ:Ll/ۖۧۙ;

    invoke-virtual {v0, v1}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۫ۡ֫;->ܶ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ܶ(Ll/ۧۡ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p0, Ll/۫ۡ֫;->۫:I

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 726
    :cond_0
    iget-boolean v1, p0, Ll/۫ۡ֫;->֫:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Ll/۫ۡ֫;->ܺ:Z

    if-eqz v1, :cond_2

    .line 727
    :cond_1
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;Ljava/util/List;)V

    .line 728
    iget-object v0, p0, Ll/۫ۡ֫;->ۚ:Ll/ᩴ֨᩵;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ll/ᩴ֨᩵;->ۙ()Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۙ(Ljava/lang/Exception;)V
    .locals 3

    const/4 v0, 0x0

    .line 733
    iput-boolean v0, p0, Ll/۫ۡ֫;->᩹:Z

    .line 734
    iget-object v0, p0, Ll/۫ۡ֫;->ܳ:Ll/ᩴ᩻ۙ;

    invoke-virtual {v0}, Ll/ᩴ᩻ۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    sget-object v1, Ll/ۖۧۙ;->ܿ:Ll/ۖۧۙ;

    invoke-virtual {v0, v1}, Ll/ۖۧۙ;->ۙ(Ll/ۖۧۙ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۫ۡ֫;->ܶ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ܶ(Ll/ۧۡ֫;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p0, Ll/۫ۡ֫;->۫:I

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 738
    iget-boolean p1, p0, Ll/۫ۡ֫;->ۧ:Z

    if-eqz p1, :cond_1

    .line 739
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v1, "emptyList(...)"

    invoke-static {p1, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۚ()Ljava/util/List;
    .locals 1

    .line 632
    iget-object v0, p0, Ll/۫ۡ֫;->ܽ:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "tempItems"

    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩴ()V
    .locals 13

    .line 647
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v1, p0, Ll/۫ۡ֫;->᩻:Ll/ۜ᩻۫;

    const/16 v2, 0x1e

    if-lt v0, v2, :cond_0

    .line 648
    sget-object v3, Ll/ܿܰᩴ;->۠:Ll/ۘܰᩴ;

    invoke-virtual {v1}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getPath(...)"

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ll/ۘܰᩴ;->ۤ(Ljava/lang/String;)V

    .line 650
    :cond_0
    invoke-virtual {v1}, Ll/ۜ᩻۫;->֨()Ljava/util/List;

    move-result-object v3

    const-string v4, "list(...)"

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 632
    iput-object v3, p0, Ll/۫ۡ֫;->ܽ:Ljava/util/List;

    const-string v3, ""

    if-lt v0, v2, :cond_1

    .line 652
    sget-object v0, Ll/ܿܰᩴ;->۠:Ll/ۘܰᩴ;

    invoke-static {v3}, Ll/ۘܰᩴ;->ۤ(Ljava/lang/String;)V

    .line 654
    :cond_1
    iget-object v0, p0, Ll/۫ۡ֫;->ܶ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ܰ(Ll/ۧۡ֫;)I

    move-result v2

    const-string v4, "collect(...)"

    const/4 v5, 0x1

    if-nez v2, :cond_2

    .line 656
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v2

    new-instance v6, Ll/᩸ۡ֫;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Ll/֨ۛۧ;

    invoke-direct {v7, v5, v6}, Ll/֨ۛۧ;-><init>(ILjava/lang/Object;)V

    invoke-interface {v2, v7}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v2

    .line 657
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v6

    invoke-interface {v2, v6}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v2

    .line 656
    invoke-static {v2, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    .line 632
    :goto_0
    iput-object v2, p0, Ll/۫ۡ֫;->ܽ:Ljava/util/List;

    goto :goto_1

    .line 658
    :cond_2
    invoke-static {v0}, Ll/ۧۡ֫;->ۛ(Ll/ۧۡ֫;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v0}, Ll/ۧۡ֫;->᩺(Ll/ۧۡ֫;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 659
    :cond_3
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v2

    new-instance v6, Ll/ᩴۡ֫;

    invoke-direct {v6, v0}, Ll/ᩴۡ֫;-><init>(Ll/ۧۡ֫;)V

    new-instance v7, Ll/ܳۡ֫;

    invoke-direct {v7, v6}, Ll/ܳۡ֫;-><init>(Ll/ᩴۡ֫;)V

    invoke-interface {v2, v7}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v2

    .line 672
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v6

    invoke-interface {v2, v6}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v2

    .line 659
    invoke-static {v2, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/List;

    goto :goto_0

    .line 674
    :cond_4
    :goto_1
    invoke-static {v0}, Ll/ۧۡ֫;->ܳ(Ll/ۧۡ֫;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_e

    .line 675
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v2

    .line 777
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ll/ۖۗܳ;

    .line 676
    invoke-interface {v7}, Ll/ۖۗܳ;->ۗۙ()Z

    move-result v8

    if-nez v8, :cond_c

    invoke-interface {v7}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v8

    if-nez v8, :cond_c

    sget v8, Ll/ۧۡ֫;->ۙۤ:I

    invoke-interface {v7}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "getName(...)"

    invoke-static {v7, v8}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۧۡ֫;->ܳ(Ll/ۧۡ֫;)Ljava/util/List;

    move-result-object v8

    .line 1485
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_c

    const-string v9, "*/*"

    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    goto/16 :goto_4

    .line 1486
    :cond_6
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v10, "ROOT"

    invoke-static {v9, v10}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "toLowerCase(...)"

    invoke-static {v7, v9}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1487
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v9

    .line 495
    invoke-static {v7}, Ll/֨ۖ᩵;->᩷(Ljava/lang/String;)I

    move-result v10

    const/4 v11, -0x1

    if-ne v10, v11, :cond_7

    move-object v10, v3

    goto :goto_3

    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 496
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v11

    invoke-virtual {v7, v10, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const-string v11, "substring(...)"

    invoke-static {v10, v11}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1488
    :goto_3
    invoke-virtual {v9, v10}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_8

    const-string v9, "application/octet-stream"

    .line 777
    :cond_8
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_2

    .line 873
    :cond_9
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const/16 v11, 0x2e

    .line 1491
    invoke-static {v10, v11}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;C)Z

    move-result v11

    const/4 v12, 0x0

    if-eqz v11, :cond_b

    .line 486
    invoke-static {v7, v10, v12}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-nez v11, :cond_c

    .line 169
    :cond_b
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    const-string v11, "/*"

    .line 486
    invoke-static {v10, v11, v12}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v11

    if-eqz v11, :cond_a

    .line 1492
    invoke-static {v5, v10}, Ll/֨ۖ᩵;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 449
    invoke-virtual {v9, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_a

    .line 873
    :cond_c
    :goto_4
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 632
    :cond_d
    iput-object v4, p0, Ll/۫ۡ֫;->ܽ:Ljava/util/List;

    .line 680
    :cond_e
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 681
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v3

    .line 682
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Ll/ܶ᩷۫;->ۙ(Ljava/util/List;)Z

    move-result v4

    .line 683
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖۗܳ;

    .line 684
    invoke-interface {v7}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ll/֨᩷۫;

    invoke-interface {v7}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v9, v3, v7, v4}, Ll/֨᩷۫;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 686
    :cond_f
    invoke-virtual {v1}, Ll/ۜ᩵ܳ;->ۘ()Ljava/lang/String;

    move-result-object v1

    const-string v6, "local:"

    .line 0
    invoke-static {v6, v1}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 689
    sget-object v6, Ll/ܽ۟֫;->ܺ:Ljava/util/HashMap;

    invoke-virtual {v6, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 690
    invoke-virtual {v6, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 691
    invoke-static {v1}, Ll/۬᩷۫;->ۙ(I)I

    move-result v6

    .line 692
    invoke-static {v1}, Ll/۬᩷۫;->᩷(I)Z

    move-result v1

    goto :goto_6

    .line 694
    :cond_10
    invoke-static {v0}, Ll/ۧۡ֫;->ۨ(Ll/ۧۡ֫;)I

    move-result v6

    .line 695
    invoke-static {v0}, Ll/ۧۡ֫;->᩵(Ll/ۧۡ֫;)Z

    move-result v1

    :goto_6
    if-eqz v6, :cond_14

    if-eq v6, v5, :cond_13

    const/4 v7, 0x2

    if-eq v6, v7, :cond_12

    const/4 v7, 0x3

    if-ne v6, v7, :cond_11

    .line 701
    new-instance v6, Ll/ۜ᩷۫;

    invoke-direct {v6, v2, v1}, Ll/ۜ᩷۫;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_7

    .line 702
    :cond_11
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 700
    :cond_12
    new-instance v6, Ll/۠᩷۫;

    invoke-direct {v6, v2, v1}, Ll/۠᩷۫;-><init>(Ljava/util/HashMap;Z)V

    goto :goto_7

    .line 699
    :cond_13
    new-instance v6, Ll/ۢ᩷۫;

    invoke-direct {v6, v2, v1, v5}, Ll/ۢ᩷۫;-><init>(Ljava/util/HashMap;ZZ)V

    goto :goto_7

    .line 698
    :cond_14
    new-instance v6, Ll/ۖ᩷۫;

    invoke-direct {v6, v2, v1}, Ll/ۖ᩷۫;-><init>(Ljava/util/HashMap;Z)V

    .line 705
    :goto_7
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    move-exception v1

    if-nez v4, :cond_17

    .line 710
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 711
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۗܳ;

    .line 712
    invoke-interface {v4}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ll/֨᩷۫;

    invoke-interface {v4}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v8, v3, v4, v5}, Ll/֨᩷۫;-><init>(Ljava/text/Collator;Ljava/lang/String;Z)V

    invoke-virtual {v2, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    .line 714
    :cond_15
    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 716
    :goto_9
    iget-boolean v1, p0, Ll/۫ۡ֫;->֫:Z

    if-eqz v1, :cond_16

    invoke-virtual {p0}, Ll/۫ۡ֫;->ۚ()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Ll/ۧۡ֫;->᩹(Ll/ۧۡ֫;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Ll/۠ۨܳ;->ۙ(Ljava/util/List;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 717
    iput-boolean v5, p0, Ll/۫ۡ֫;->ܺ:Z

    :cond_16
    return-void

    .line 708
    :cond_17
    throw v1
.end method

.method public final ᩷()V
    .locals 5

    .line 637
    iget-boolean v0, p0, Ll/۫ۡ֫;->֫:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۫ۡ֫;->ܶ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ۘ(Ll/ۧۡ֫;)Ll/ۗ֨᩷;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "swipeRefreshLayout"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ll/ۗ֨᩷;->᩷()Z

    move-result v1

    if-nez v1, :cond_2

    .line 638
    invoke-static {v0}, Ll/ۧۡ֫;->ۘ(Ll/ۧۡ֫;)Ll/ۗ֨᩷;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ll/ۤۡ֫;

    invoke-direct {v2, p0, v0}, Ll/ۤۡ֫;-><init>(Ll/۫ۡ֫;Ll/ۧۡ֫;)V

    const-wide/16 v3, 0x12c

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    invoke-static {v3}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    .line 637
    :cond_1
    invoke-static {v3}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    :cond_2
    return-void
.end method

.method public final ᩸()V
    .locals 2

    .line 744
    iget-object v0, p0, Ll/۫ۡ֫;->ܶ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ۘ(Ll/ۧۡ֫;)Ll/ۗ֨᩷;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۗ֨᩷;->ۙ(Z)V

    return-void

    :cond_0
    const-string v0, "swipeRefreshLayout"

    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
