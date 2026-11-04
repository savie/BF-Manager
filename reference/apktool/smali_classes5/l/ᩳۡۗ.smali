.class public Ll/ᩳۡۗ;
.super Ll/ۚᩳۗ;
.source "44TD"


# instance fields
.field public ֨:Ll/ۛ֨ۗ;

.field public final ۟:Ljava/util/List;

.field public ۢ:I

.field public final ᩳ:Ll/᩺ۢۗ;


# direct methods
.method public constructor <init>(Ll/᩺ۢۗ;I)V
    .locals 1

    if-nez p2, :cond_0

    .line 36
    sget-object p2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(I)V

    move-object p2, v0

    :goto_0
    invoke-direct {p0, p1, p2}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ll/᩺ۢۗ;Ljava/util/List;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ll/ܺ۟ۗ;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    .line 41
    iput-object p2, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    const/4 p1, -0x1

    .line 42
    iput p1, p0, Ll/ᩳۡۗ;->ۢ:I

    .line 43
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺ֨ۗ;

    .line 44
    invoke-virtual {p0, p2}, Ll/ᩳۡۗ;->᩷(Ll/ܺ֨ۗ;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final getOffset()I
    .locals 1

    .line 191
    iget v0, p0, Ll/ᩳۡۗ;->ۢ:I

    return v0
.end method

.method public final getType()Ll/᩺ۢۗ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 626
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۗۙ()V
    .locals 4

    .line 91
    iget-object v0, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    if-eqz v0, :cond_1

    .line 504
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 508
    invoke-virtual {v1, v0}, Ll/ܿ֨ۗ;->᩷(Ll/ۛ֨ۗ;)V

    goto :goto_0

    .line 506
    :cond_0
    new-instance v1, Ll/۠ۧ᩵;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No SSA var for result arg: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " from "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ll/ܺ֨ۗ;->ۜ()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 506
    throw v1

    .line 95
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 510
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 511
    instance-of v2, v1, Ll/ۛ֨ۗ;

    if-eqz v2, :cond_3

    .line 512
    check-cast v1, Ll/ۛ֨ۗ;

    .line 513
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v2

    .line 514
    invoke-virtual {v2, v1}, Ll/ܿ֨ۗ;->ۤ(Ll/ۛ֨ۗ;)V

    .line 515
    invoke-virtual {v2}, Ll/ܿ֨ۗ;->۟()V

    goto :goto_1

    .line 516
    :cond_3
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_2

    .line 517
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ᩳۡۗ;->ۗۙ()V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final ۙ(Ljava/util/function/Function;)Ljava/lang/Object;
    .locals 3

    .line 315
    invoke-interface {p1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 95
    :cond_0
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 319
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 320
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_1

    .line 321
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 322
    invoke-virtual {v1, p1}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/۠ᩴ᩵;)Ljava/lang/Object;
    .locals 3

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 350
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_1

    .line 353
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    .line 354
    invoke-virtual {v1, p1}, Ll/ᩳۡۗ;->ۙ(Ll/۠ᩴ᩵;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    .line 356
    :cond_1
    invoke-virtual {p1, v1}, Ll/۠ᩴ᩵;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_0

    return-object v1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ(Ll/ۖۡۗ;)Ll/ᩳۡۗ;
    .locals 3

    .line 91
    iget-object v0, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 491
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܽۙ()I

    move-result v1

    const/4 v2, 0x0

    .line 492
    invoke-virtual {v0, v1, v2}, Ll/ۛ֨ۗ;->ۙ(ILl/ܿ֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v0

    .line 493
    invoke-virtual {p1, v0}, Ll/ۖۡۗ;->ۙ(Ll/ۛ֨ۗ;)Ll/ܿ֨ۗ;

    .line 478
    invoke-virtual {p0}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object p1

    .line 479
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    return-object p1

    .line 489
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    const-string v0, "Result in null"

    .line 11
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 489
    throw p1
.end method

.method public ۙ(ILl/ܺ֨ۗ;)V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 72
    invoke-virtual {p0, p2}, Ll/ᩳۡۗ;->᩷(Ll/ܺ֨ۗ;)V

    return-void
.end method

.method public ۙ(Ljava/util/Collection;)V
    .locals 3

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 199
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 200
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ۛ֨ۗ;

    if-eqz v2, :cond_1

    .line 201
    check-cast v1, Ll/ۛ֨ۗ;

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 0
    :cond_1
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_0

    .line 203
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public ۙ(Ljava/util/function/Consumer;)V
    .locals 3

    .line 301
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 302
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 303
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_0

    .line 304
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Consumer;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۙ(Ll/֫۬ۗ;)V
    .locals 3

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 335
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v2, v1, Ll/ܽ֨ۗ;

    if-eqz v2, :cond_0

    .line 337
    check-cast v1, Ll/ܽ֨ۗ;

    invoke-virtual {v1}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ᩳۡۗ;->ۙ(Ll/֫۬ۗ;)V

    goto :goto_0

    .line 339
    :cond_0
    invoke-virtual {p1, v1}, Ll/֫۬ۗ;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ۙ(Ll/ܺ֨ۗ;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->᩷(Ll/ܺ֨ۗ;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/StringBuilder;)Z
    .locals 5

    .line 581
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    const-string v1, ", "

    .line 72
    invoke-static {v0, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 585
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x78

    if-ge v3, v4, :cond_1

    .line 586
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v2

    :cond_1
    const-string v1, "\n  "

    .line 591
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    .line 592
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(Ll/ۛ֨ۗ;)Z
    .locals 2

    .line 103
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 126
    :cond_0
    invoke-static {v0, p1}, Ll/۠֫᩵;->ۙ(Ljava/util/List;Ll/ۛ֨ۗ;)Z

    move-result p1

    return p1
.end method

.method public ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z
    .locals 7

    .line 103
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 135
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܺ֨ۗ;

    const/4 v5, 0x1

    if-ne v4, p1, :cond_0

    const/4 p1, 0x0

    .line 137
    invoke-static {p1, v4}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    .line 138
    invoke-virtual {p0, v3, p2}, Ll/ᩳۡۗ;->ۙ(ILl/ܺ֨ۗ;)V

    return v5

    .line 141
    :cond_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v6, v4, Ll/ܽ֨ۗ;

    if-eqz v6, :cond_1

    .line 141
    check-cast v4, Ll/ܽ֨ۗ;

    invoke-virtual {v4}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v4

    invoke-virtual {v4, p1, p2}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final ۙۙ()Z
    .locals 2

    .line 234
    sget-object v0, Ll/۟ۡۗ;->ۙ:[I

    .line 87
    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    .line 234
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۚۙ()Ll/ᩳۡۗ;
    .locals 2

    .line 459
    invoke-virtual {p0}, Ll/ᩳۡۗ;->۫ۙ()Ll/ᩳۡۗ;

    move-result-object v0

    .line 464
    iget-object v1, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    if-eqz v1, :cond_1

    .line 465
    invoke-virtual {v1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 466
    iget-object v1, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    invoke-virtual {v1}, Ll/ۛ֨ۗ;->۠()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    return-object v0

    .line 468
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Can\'t copy if SSA var is set"

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 468
    throw v0

    :cond_1
    return-object v0
.end method

.method public final ۜ()Ljava/lang/String;
    .locals 1

    .line 597
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 598
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    .line 599
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ(Ll/ܺ֨ۗ;)I
    .locals 4

    .line 103
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 167
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne p1, v3, :cond_0

    return v2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ۤ(Ll/ᩳۡۗ;)V
    .locals 3

    .line 544
    iget-object v0, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    sget-object v1, Ll/᩺ۢۗ;->ۢۙ:Ll/᩺ۢۗ;

    sget-object v2, Ll/ۧ۟ۗ;->᩸:Ll/ۧ۟ۗ;

    if-ne v0, v1, :cond_1

    .line 545
    invoke-virtual {p0, p1}, Ll/ۚᩳۗ;->ۙ(Ll/ᩳۡۗ;)V

    .line 546
    sget-object v0, Ll/֫۟ۗ;->ۧ᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 191
    iget v0, p1, Ll/ᩳۡۗ;->ۢ:I

    .line 195
    iput v0, p0, Ll/ᩳۡۗ;->ۢ:I

    .line 76
    invoke-virtual {p0, v2}, Ll/ܺ۟ۗ;->ۤ(Ll/֫᩶ۗ;)V

    .line 77
    invoke-virtual {p0, p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۚᩳۗ;Ll/ۧ۟ۗ;)V

    return-void

    .line 550
    :cond_0
    invoke-virtual {p0, p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۚᩳۗ;Ll/ۧ۟ۗ;)V

    return-void

    .line 553
    :cond_1
    invoke-virtual {p0, p1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/ۚᩳۗ;Ll/ۧ۟ۗ;)V

    .line 554
    invoke-virtual {p0, p1}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    return-void
.end method

.method public final ۤۙ()Z
    .locals 3

    .line 523
    sget-object v0, Ll/۟ۡۗ;->ۙ:[I

    .line 87
    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    .line 523
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const/16 v2, 0xb

    if-eq v0, v2, :cond_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    return v1

    :cond_0
    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x18
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۧۙ()Ljava/util/List;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    return-object v0
.end method

.method public ۫ۙ()Ll/ᩳۡۗ;
    .locals 3

    .line 448
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ᩳۡۗ;

    if-ne v0, v1, :cond_0

    .line 451
    new-instance v0, Ll/ᩳۡۗ;

    .line 103
    iget-object v1, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 451
    iget-object v2, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    invoke-direct {v0, v2, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0

    .line 449
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Copy method not implemented in insn class "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 449
    throw v0
.end method

.method public final ܳ(I)V
    .locals 0

    .line 195
    iput p1, p0, Ll/ᩳۡۗ;->ۢ:I

    return-void
.end method

.method public final ܶۙ()Z
    .locals 3

    .line 209
    sget-object v0, Ll/۟ۡۗ;->ۙ:[I

    .line 87
    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    .line 209
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method

.method public final ܺۙ()Ljava/util/List;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    return-object v0
.end method

.method public final ܽۙ()Ll/ۛ֨ۗ;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    return-object v0
.end method

.method public ᩴ(I)Ll/ܺ֨ۗ;
    .locals 2

    .line 158
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 159
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x0

    .line 160
    invoke-static {p1, v1}, Ll/ۢ֫᩵;->ۙ(Ll/ۖۡۗ;Ll/ܺ֨ۗ;)V

    return-object v1
.end method

.method public ᩴ(Ll/ᩳۡۗ;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 372
    :cond_0
    iget-object v1, p1, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    iget-object p1, p1, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    if-eq v3, v1, :cond_1

    return v2

    .line 375
    :cond_1
    iget-object v1, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    .line 376
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_5

    .line 381
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܺ֨ۗ;

    .line 382
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺ֨ۗ;

    .line 383
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v7, v5, Ll/ܽ֨ۗ;

    if-eqz v7, :cond_4

    .line 384
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v7, v6, Ll/ܽ֨ۗ;

    if-nez v7, :cond_3

    return v2

    .line 387
    :cond_3
    check-cast v5, Ll/ܽ֨ۗ;

    invoke-virtual {v5}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v5

    .line 388
    check-cast v6, Ll/ܽ֨ۗ;

    invoke-virtual {v6}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v6

    .line 389
    invoke-virtual {v5, v6}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v5

    if-nez v5, :cond_4

    return v2

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    return v0
.end method

.method public final ᩴۙ()Z
    .locals 2

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 289
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 290
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v1, Ll/ܽ֨ۗ;

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 603
    invoke-virtual {p0}, Ll/ܺ۟ۗ;->ۢ()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x20

    .line 604
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ܺ۟ۗ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    :cond_0
    invoke-virtual {p0}, Ll/ۚᩳۗ;->۠()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, " (LINE:"

    .line 607
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۚᩳۗ;->۠()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    return-void
.end method

.method public final ᩷(Ll/ۛ֨ۗ;)V
    .locals 1

    .line 55
    iput-object p1, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p1, p0}, Ll/ܺ֨ۗ;->ۙ(Ll/ᩳۡۗ;)V

    .line 58
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 60
    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->᩷(Ll/ۛ֨ۗ;)V

    :cond_0
    return-void
.end method

.method public final ᩷(Ll/ܺ֨ۗ;)V
    .locals 1

    .line 76
    invoke-virtual {p1, p0}, Ll/ܺ֨ۗ;->ۙ(Ll/ᩳۡۗ;)V

    .line 0
    instance-of v0, p1, Ll/ۛ֨ۗ;

    if-eqz v0, :cond_0

    .line 78
    check-cast p1, Ll/ۛ֨ۗ;

    .line 79
    invoke-virtual {p1}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0, p1}, Ll/ܿ֨ۗ;->ۤ(Ll/ۛ֨ۗ;)V

    :cond_0
    return-void
.end method

.method public final ᩷(Ll/ᩳۡۗ;)V
    .locals 2

    .line 103
    iget-object v0, p1, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 95
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 419
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܺ֨ۗ;

    .line 420
    invoke-virtual {v1}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    goto :goto_0

    .line 430
    :cond_0
    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 431
    invoke-virtual {p1, p0}, Ll/ۚᩳۗ;->ۙ(Ll/ۚᩳۗ;)V

    .line 424
    invoke-virtual {p1, p0}, Ll/ۚᩳۗ;->ۙ(Ll/ᩳۡۗ;)V

    .line 191
    iget v0, p0, Ll/ᩳۡۗ;->ۢ:I

    .line 195
    iput v0, p1, Ll/ᩳۡۗ;->ۢ:I

    return-void
.end method

.method public final ᩷ۙ()Z
    .locals 5

    .line 245
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 246
    sget-object v0, Ll/᩺ۢۗ;->᩹ۙ:Ll/᩺ۢۗ;

    if-ne v1, v0, :cond_3

    goto :goto_0

    .line 95
    :cond_0
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 251
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܺ֨ۗ;

    .line 252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, v3, Ll/ܽ֨ۗ;

    if-eqz v4, :cond_1

    .line 253
    check-cast v3, Ll/ܽ֨ۗ;

    invoke-virtual {v3}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v3

    .line 254
    invoke-virtual {v3}, Ll/ᩳۡۗ;->᩷ۙ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 260
    :cond_2
    sget-object v0, Ll/۟ۡۗ;->ۙ:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v2, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    packed-switch v0, :pswitch_data_0

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_3
    :pswitch_0
    return v2

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ᩸(I)Ll/ܺ֨ۗ;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܺ֨ۗ;

    return-object p1
.end method

.method public final ᩸(Ll/ᩳۡۗ;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 404
    :cond_0
    invoke-virtual {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    iget-object v1, p1, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    .line 405
    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    iget-object p1, p1, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    .line 406
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩹ۙ()Z
    .locals 2

    .line 221
    sget-object v0, Ll/۟ۡۗ;->ۙ:[I

    .line 87
    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    .line 221
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 3

    .line 612
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 613
    iget v1, p0, Ll/ᩳۡۗ;->ۢ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    .line 614
    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    :cond_0
    iget-object v1, p0, Ll/ᩳۡۗ;->ᩳ:Ll/᩺ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 617
    iget-object v1, p0, Ll/ᩳۡۗ;->֨:Ll/ۛ֨ۗ;

    if-eqz v1, :cond_1

    .line 618
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    :cond_1
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/lang/StringBuilder;)Z

    .line 621
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻ۙ()I
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ᩳۡۗ;->۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
