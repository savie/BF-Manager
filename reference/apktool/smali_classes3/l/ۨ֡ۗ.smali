.class public final Ll/ۨ֡ۗ;
.super Ljava/lang/Object;
.source "T6HJ"


# instance fields
.field public final ֫:Ll/ۨ֡ۗ;

.field public final ۙ:Ll/ܳ֡ۗ;

.field public ۚ:Ll/ۜ֡ۗ;

.field public final ۤ:Ll/᩻ۡۗ;

.field public final ۧ:Z

.field public final ۫:Ll/ۡۘۗ;

.field public final ܳ:Ljava/util/HashSet;

.field public final ᩴ:Z

.field public ᩷:Z

.field public ᩸:I

.field public final ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;)V
    .locals 7

    .line 91
    iget-boolean v3, p2, Ll/ۨ֡ۗ;->᩻:Z

    iget-boolean v4, p2, Ll/ۨ֡ۗ;->ᩴ:Z

    iget-boolean v5, p2, Ll/ۨ֡ۗ;->ۧ:Z

    iget-object v6, p2, Ll/ۨ֡ۗ;->۫:Ll/ۡۘۗ;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Ll/ۨ֡ۗ;-><init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;ZZZLl/ۡۘۗ;)V

    return-void
.end method

.method public constructor <init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;ZZZLl/ۡۘۗ;)V
    .locals 1

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۨ֡ۗ;->ܳ:Ljava/util/HashSet;

    .line 97
    iput-object p1, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    .line 98
    iput-object p2, p0, Ll/ۨ֡ۗ;->֫:Ll/ۨ֡ۗ;

    .line 99
    iput-boolean p4, p0, Ll/ۨ֡ۗ;->ᩴ:Z

    .line 100
    iput-boolean p3, p0, Ll/ۨ֡ۗ;->᩻:Z

    .line 101
    iput-boolean p5, p0, Ll/ۨ֡ۗ;->ۧ:Z

    .line 102
    iput-object p6, p0, Ll/ۨ֡ۗ;->۫:Ll/ۡۘۗ;

    .line 104
    new-instance p2, Ll/ܳ֡ۗ;

    invoke-direct {p2, p1, p0}, Ll/ܳ֡ۗ;-><init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;)V

    iput-object p2, p0, Ll/ۨ֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    return-void
.end method

.method private ֫()Z
    .locals 3

    .line 569
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۡۗ;

    .line 570
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic ۙ(Ljava/util/HashMap;Ll/ۨᩳۗ;)Ljava/lang/String;
    .locals 2

    .line 304
    new-instance v0, Ll/ۛۧ᩵;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/ۛۧ᩵;-><init>(I)V

    invoke-static {p0, p1, v0}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static ۙ(Ll/ۨᩳۗ;)Ljava/lang/String;
    .locals 4

    .line 315
    sget-object v0, Ll/᩵֡ۗ;->ۙ:[I

    invoke-interface {p0}, Ll/ۧܰۗ;->ۘ()Ll/֫ܰۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 328
    move-object v0, p0

    check-cast v0, Ll/ܽۡۗ;

    invoke-virtual {v0}, Ll/ܽۡۗ;->᩺()Ll/۬ᩳۗ;

    move-result-object v0

    .line 329
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/۬ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p0}, Ll/᩺ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p0

    invoke-virtual {v0}, Ll/۬ᩳۗ;->᩸()Ll/֫֨ۗ;

    move-result-object v0

    invoke-static {p0, v0}, Ll/֫֨ۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 332
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ll/ۧܰۗ;->ۘ()Ll/֫ܰۗ;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 319
    :cond_1
    check-cast p0, Ll/ۖۡۗ;

    .line 320
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    .line 321
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ܳۧ᩵;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/ܳۧ᩵;-><init>(ILjava/lang/Object;)V

    .line 322
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 323
    invoke-static {}, Ll/֫ܺۗ;->joining()Ll/ۚܺۗ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 324
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ۖۡۗ;->ۤۙ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x28

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 325
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܺ()Ll/᩷ۢۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/᩷ۢۗ;->ۤ()Ll/֫֨ۗ;

    move-result-object p0

    invoke-static {v0, p0}, Ll/֫֨ۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֫֨ۗ;

    move-result-object p0

    invoke-static {p0}, Ll/ܳ۟ۗ;->ۙ(Ll/֫֨ۗ;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 317
    :cond_2
    check-cast p0, Ll/᩻ۡۗ;

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object p0

    invoke-virtual {p0}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Ll/֨ᩳۗ;)V
    .locals 1

    .line 844
    iget-object v0, p0, Ll/ۨ֡ۗ;->֫:Ll/ۨ֡ۗ;

    if-eqz v0, :cond_0

    .line 845
    invoke-direct {v0, p1}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;)V

    return-void

    .line 847
    :cond_0
    iget-object v0, p0, Ll/ۨ֡ۗ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)V
    .locals 2

    .line 687
    invoke-virtual {p3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 688
    invoke-virtual {p3}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 690
    :cond_0
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p2

    .line 692
    :goto_0
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    invoke-static {v1, p2}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/֨ᩳۗ;

    move-result-object p2

    .line 693
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 695
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(Ll/ۧܰۗ;)V

    .line 697
    :cond_1
    invoke-virtual {p2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 698
    invoke-direct {p0, p1, p3}, Ll/ۨ֡ۗ;->ۤ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    return-void
.end method

.method private ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;Z)V
    .locals 6

    .line 470
    invoke-interface {p1}, Ll/ۗۘۗ;->getLength()I

    move-result v0

    const/4 v1, 0x0

    .line 471
    iget-boolean v2, p0, Ll/ۨ֡ۗ;->ᩴ:Z

    if-nez v2, :cond_1

    .line 1011
    invoke-virtual {p2}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    new-array v3, v3, [Z

    aput-boolean v1, v3, v1

    .line 1015
    invoke-virtual {p2}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v4

    new-instance v5, Ll/ܶ֡ۗ;

    invoke-direct {v5, v1, v3}, Ll/ܶ֡ۗ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2, v4, v5}, Ll/᩵ۧ᩵;->ۙ(Ll/ۖۡۗ;Ll/ۛۡۗ;Ljava/util/function/Consumer;)V

    .line 1026
    aget-boolean v3, v3, v1

    :goto_0
    if-eqz v3, :cond_1

    const-string v3, "Ignored leaked move-result in code generation, using default value to continue"

    .line 472
    invoke-virtual {p2, v3}, Ll/ۨᩳۗ;->᩸(Ljava/lang/String;)V

    .line 29
    :cond_1
    invoke-static {p1, p2}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 30
    invoke-static {p1, p2}, Ll/ۚ۟ۗ;->᩷(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 475
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 476
    new-instance p3, Ll/۠֡ۗ;

    invoke-direct {p3, p0, p2}, Ll/۠֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V

    .line 477
    invoke-virtual {p3, p1, v0}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;I)Z

    const/16 p2, 0x3b

    .line 478
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    goto :goto_4

    .line 480
    :cond_2
    sget-object v3, Ll/֫۟ۗ;->ۘۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 481
    iget-boolean v4, p0, Ll/ۨ֡ۗ;->ۧ:Z

    if-eqz v4, :cond_3

    const/4 v3, 0x0

    :cond_3
    if-nez v3, :cond_5

    if-nez v2, :cond_5

    .line 485
    sget-object v2, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {p2, v2}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    .line 488
    :cond_4
    new-instance v2, Ll/۠֡ۗ;

    invoke-direct {v2, p0, p2}, Ll/۠֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V

    goto :goto_2

    .line 486
    :cond_5
    :goto_1
    invoke-static {p2}, Ll/۠֡ۗ;->ۙ(Ll/ۖۡۗ;)Ll/۠֡ۗ;

    move-result-object v2

    .line 490
    :goto_2
    invoke-virtual {v2, p1, v0}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;I)Z

    move-result p2

    if-eqz p2, :cond_6

    const/16 p2, 0x20

    .line 491
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    :cond_6
    const/16 p2, 0x7b

    .line 493
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 494
    invoke-interface {p1}, Ll/ۗۘۗ;->ۤ()V

    if-eqz p3, :cond_7

    .line 496
    invoke-virtual {v2, p1, v1}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;Z)V

    goto :goto_3

    .line 498
    :cond_7
    invoke-virtual {v2, p1}, Ll/۠֡ۗ;->ۙ(Ll/ۗۘۗ;)V

    .line 500
    :goto_3
    invoke-interface {p1}, Ll/ۗۘۗ;->۫()V

    .line 501
    invoke-interface {p1}, Ll/ۗۘۗ;->ܳ()Ll/ܳܰۗ;

    .line 504
    :goto_4
    sget-object p2, Ll/᩹ܰۗ;->ܰ:Ll/᩹ܰۗ;

    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(Ll/ۧܰۗ;)V

    return-void
.end method

.method private ۙ(Ll/ۤܰۗ;)V
    .locals 4

    .line 133
    iget-object v0, p0, Ll/ۨ֡ۗ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v1

    if-eqz v1, :cond_0

    .line 135
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/᩹֡ۗ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/᩹֡ۗ;-><init>(I)V

    .line 136
    invoke-static {v2}, Ll/ۖ۫ۗ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->sorted(Ljava/util/Comparator;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ۗ֡ۗ;

    invoke-direct {v2, p0, p1}, Ll/ۗ֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۤܰۗ;)V

    .line 137
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    .line 146
    invoke-virtual {p1}, Ll/ܳܰۗ;->᩸()Ll/ܳܰۗ;

    .line 147
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ۨ֡ۗ;Ll/ۗۘۗ;Ll/ۨᩳۗ;)V
    .locals 6

    .line 306
    instance-of v0, p2, Ll/᩻ۡۗ;

    if-eqz v0, :cond_1

    .line 307
    check-cast p2, Ll/᩻ۡۗ;

    .line 350
    :try_start_0
    new-instance v0, Ll/ۨ֡ۗ;

    .line 945
    iget-object v1, p0, Ll/ۨ֡ۗ;->֫:Ll/ۨ֡ۗ;

    if-nez v1, :cond_0

    move-object v1, p0

    .line 350
    :cond_0
    invoke-direct {v0, p2, v1}, Ll/ۨ֡ۗ;-><init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;)V

    .line 351
    invoke-interface {p1}, Ll/ۗۘۗ;->᩸()Ll/ܳܰۗ;

    .line 352
    invoke-virtual {v0, p1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;)V

    .line 353
    iget-object p0, p0, Ll/ۨ֡ۗ;->ܳ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ll/ۨ֡ۗ;->ۤ()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception p0

    const-string p1, "Inner class code generation error"

    .line 19
    invoke-static {p2, p1, p0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 309
    :cond_1
    check-cast p2, Ll/ۖۡۗ;

    .line 392
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-static {v0}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܶۘۗ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    .line 396
    :cond_2
    sget-object v0, Ll/ۧ۟ۗ;->۟:Ll/ۧ۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ܽᩳۗ;

    if-eqz v0, :cond_9

    .line 397
    invoke-virtual {v0}, Ll/ܽᩳۗ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_0

    .line 401
    :cond_3
    :try_start_1
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 402
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto/16 :goto_1

    .line 981
    :cond_4
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۡۗ;

    .line 982
    invoke-virtual {v0}, Ll/ܽᩳۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v4

    sget v5, Ll/ۚ۬ۗ;->ܰ:I

    .line 204
    new-instance v5, Ll/ܳ۬ۗ;

    invoke-direct {v5, v2}, Ll/ܳ۬ۗ;-><init>(Ll/ۖۡۗ;)V

    invoke-virtual {v4, v5}, Ll/ᩳۡۗ;->ۙ(Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-nez v2, :cond_6

    const/4 v3, 0x1

    :cond_6
    if-nez v3, :cond_5

    .line 406
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Method not inlined, access restricted in: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V

    goto :goto_0

    .line 409
    :cond_7
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۚ֡ۗ;

    invoke-direct {v1, v3}, Ll/ۚ֡ۗ;-><init>(I)V

    .line 410
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    .line 411
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 412
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 413
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫۟ۗ;)V

    goto :goto_1

    .line 416
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Method not inlined, still used in: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string v1, "Failed to check method usage"

    .line 420
    invoke-virtual {p2, v1, v0}, Ll/ۨᩳۗ;->ۙ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 372
    :cond_9
    :goto_0
    invoke-interface {p1}, Ll/ۗۘۗ;->getLength()I

    move-result v0

    iget v1, p0, Ll/ۨ֡ۗ;->᩸:I

    if-eq v0, v1, :cond_a

    .line 373
    invoke-interface {p1}, Ll/ۗۘۗ;->᩸()Ll/ܳܰۗ;

    .line 375
    :cond_a
    invoke-interface {p1}, Ll/ۗۘۗ;->ۙ()I

    move-result v0

    .line 377
    :try_start_2
    invoke-virtual {p0, p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-exception p0

    .line 379
    invoke-virtual {p2}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩻ۡۗ;->ۢۙ()Ll/᩻ۡۗ;

    move-result-object v1

    sget-object v2, Ll/֫۟ۗ;->᩸᩷:Ll/֫۟ۗ;

    invoke-virtual {v1, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    const-string v2, "Method generation error"

    if-nez v1, :cond_b

    .line 19
    invoke-static {p2, v2, p0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 383
    invoke-static {p1, p2}, Ll/ۚ۟ۗ;->᩷(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 384
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(I)V

    :goto_1
    return-void

    .line 380
    :cond_b
    new-instance p1, Ll/۠ۧ᩵;

    .line 15
    invoke-direct {p1, v2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 380
    throw p1
.end method

.method public static synthetic ۙ(Ll/ۨ֡ۗ;Ll/ۤܰۗ;Ll/֨ᩳۗ;)V
    .locals 1

    const-string v0, "import "

    .line 138
    invoke-virtual {p1, v0}, Ll/ܳܰۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 139
    iget-object p0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object p0

    invoke-virtual {p0, p2}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 141
    invoke-virtual {p1, p0}, Ll/ۤܰۗ;->ۙ(Ll/ۧܰۗ;)V

    .line 143
    :cond_0
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/ۤܰۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    const/16 p0, 0x3b

    .line 144
    invoke-virtual {p1, p0}, Ll/ۤܰۗ;->ۙ(C)Ll/ۗۘۗ;

    return-void
.end method

.method public static synthetic ۙ([ZLl/᩹ۡۗ;)V
    .locals 2

    const/4 v0, 0x0

    .line 1016
    aget-boolean v1, p0, v0

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1019
    :cond_0
    invoke-interface {p1}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 1020
    invoke-static {v1}, Ll/ۨ֡ۗ;->ۙ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p1, 0x1

    .line 1021
    aput-boolean p1, p0, v0

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۙ(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z
    .locals 1

    .line 870
    invoke-virtual {p0}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 871
    invoke-virtual {p0}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object p0

    .line 872
    invoke-static {p0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z
    .locals 4

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return p0

    .line 881
    :cond_0
    invoke-virtual {p2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v0

    .line 882
    invoke-virtual {p1}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 885
    :cond_1
    invoke-virtual {p0, p1}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 887
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩻ۡۗ;

    .line 888
    invoke-virtual {v2}, Ll/᩻ۡۗ;->֡ۙ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 889
    invoke-virtual {v2}, Ll/᩻ۡۗ;->ܽۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :goto_0
    const/4 p0, 0x1

    return p0

    .line 894
    :cond_3
    invoke-virtual {p1}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object p1

    invoke-static {p0, p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z

    move-result p0

    return p0
.end method

.method public static ۙ(Ll/ۨ֡ۗ;Ll/ۨᩳۗ;)Z
    .locals 0

    .line 337
    iget-boolean p0, p0, Ll/ۨ֡ۗ;->ᩴ:Z

    if-nez p0, :cond_1

    instance-of p0, p1, Ll/᩻ۡۗ;

    if-eqz p0, :cond_0

    move-object p0, p1

    check-cast p0, Ll/᩻ۡۗ;

    invoke-static {p0}, Ll/۠֫᩵;->᩷(Ll/᩻ۡۗ;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    .line 345
    :cond_0
    sget-object p0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result p0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    :goto_1
    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ۙ(Ll/ᩳۡۗ;)Z
    .locals 2

    if-nez p0, :cond_0

    goto :goto_1

    .line 996
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->getType()Ll/᩺ۢۗ;

    move-result-object v0

    sget-object v1, Ll/᩺ۢۗ;->ۛۙ:Ll/᩺ۢۗ;

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 999
    :cond_1
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܺۙ()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺ֨ۗ;

    .line 1000
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v1, v0, Ll/ܽ֨ۗ;

    if-eqz v1, :cond_2

    .line 1000
    check-cast v0, Ll/ܽ֨ۗ;

    invoke-virtual {v0}, Ll/ܽ֨ۗ;->ۧۙ()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-static {v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ᩳۡۗ;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method private ۤ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V
    .locals 5

    .line 702
    invoke-virtual {p2}, Ll/֫֨ۗ;->֫()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_4

    const/16 v0, 0x3c

    .line 704
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 705
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    if-eqz v1, :cond_0

    const-string v2, ", "

    .line 708
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 710
    :cond_0
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    .line 711
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩵()Ll/֫֨ۗ;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 713
    invoke-virtual {v2}, Ll/֫֨ۗ;->ۗ()Ll/۫֨ۗ;

    move-result-object v2

    .line 714
    invoke-virtual {v2}, Ll/۫֨ۗ;->᩸()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 715
    sget-object v4, Ll/۫֨ۗ;->ᩳ:Ll/۫֨ۗ;

    if-eq v2, v4, :cond_2

    .line 716
    invoke-virtual {p0, p1, v3}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    goto :goto_1

    .line 719
    :cond_1
    invoke-virtual {p0, p1, v2}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/16 p2, 0x3e

    .line 722
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    :cond_4
    return-void
.end method

.method private ᩷(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Ljava/lang/String;
    .locals 7

    .line 753
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object v0

    .line 754
    iget-boolean v1, p0, Ll/ۨ֡ۗ;->ᩴ:Z

    if-nez v1, :cond_17

    iget-boolean v1, p0, Ll/ۨ֡ۗ;->᩻:Z

    if-nez v1, :cond_0

    goto/16 :goto_8

    .line 757
    :cond_0
    invoke-virtual {p2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v1

    .line 758
    invoke-virtual {p1, p2}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_7

    .line 761
    :cond_1
    invoke-static {p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_7

    .line 764
    :cond_2
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_b

    .line 805
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 806
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v1

    :goto_0
    const-string v2, "."

    const/4 v4, 0x1

    if-eqz v1, :cond_8

    if-ne v1, p1, :cond_6

    .line 811
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    :goto_1
    if-eqz v1, :cond_4

    .line 813
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ᩳۗ;

    invoke-virtual {p1}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object p1

    .line 1030
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    if-nez p2, :cond_3

    goto :goto_2

    .line 1032
    :cond_3
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 p2, 0x30

    if-gt p2, p1, :cond_4

    const/16 p2, 0x39

    if-gt p1, p2, :cond_4

    .line 815
    invoke-virtual {v0, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 816
    invoke-virtual {v1}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v1

    const/4 v4, 0x0

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz v4, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, "$"

    .line 818
    :goto_3
    new-instance p1, Ll/ܽ֡ۗ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ܽ֡ۗ;-><init>(I)V

    invoke-static {v0, v2, p1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 820
    :cond_6
    invoke-static {p1, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/4 v4, 0x0

    goto :goto_4

    .line 824
    :cond_7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 825
    invoke-virtual {v1}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v1

    goto :goto_0

    .line 827
    :cond_8
    :goto_4
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    if-eqz v4, :cond_a

    .line 829
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ᩳۗ;

    if-eq v1, p2, :cond_9

    .line 831
    invoke-direct {p0, p1, v1}, Ll/ۨ֡ۗ;->᩷(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Ljava/lang/String;

    move-result-object p1

    .line 832
    invoke-virtual {v1}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 834
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۙ()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 837
    :cond_9
    invoke-direct {p0, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;)V

    .line 840
    :cond_a
    new-instance p1, Ll/ܽ֡ۗ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ܽ֡ۗ;-><init>(I)V

    invoke-static {v0, v2, p1}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 767
    :cond_b
    iget-object v2, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v2}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    invoke-static {v4, p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/֫ۖۗ;Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Z

    move-result v4

    if-nez v4, :cond_17

    .line 768
    invoke-virtual {v2}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v2

    .line 901
    invoke-virtual {p1}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v4

    .line 902
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x2e

    if-eqz v5, :cond_c

    goto :goto_5

    .line 906
    :cond_c
    invoke-virtual {p2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v3

    .line 907
    invoke-virtual {v2}, Ll/֫ۖۗ;->᩷ۙ()Ll/᩷֡ۗ;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/᩷֡ۗ;->ۤ(Ljava/lang/String;)Z

    move-result v3

    :goto_5
    if-eqz v3, :cond_d

    goto/16 :goto_8

    .line 860
    :cond_d
    invoke-virtual {p1}, Ll/֨ᩳۗ;->᩵()Ll/֨ᩳۗ;

    move-result-object v2

    .line 861
    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩵()Ll/֨ᩳۗ;

    move-result-object v3

    if-eqz v2, :cond_e

    .line 863
    invoke-virtual {v2, v3}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_6

    .line 866
    :cond_e
    invoke-virtual {p1, v3}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v2

    :goto_6
    if-eqz v2, :cond_f

    goto :goto_7

    .line 775
    :cond_f
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۧ()Ljava/lang/String;

    move-result-object v2

    const-string v3, "java.lang"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object v2

    if-nez v2, :cond_10

    goto :goto_7

    .line 779
    :cond_10
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_7

    .line 782
    :cond_11
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/֨ᩳۗ;->ᩴ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_13

    .line 783
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v0

    if-nez v0, :cond_12

    :goto_7
    return-object v1

    .line 787
    :cond_12
    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩸()Ljava/lang/String;

    move-result-object v0

    .line 789
    :cond_13
    invoke-virtual {p0}, Ll/ۨ֡ۗ;->ۤ()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ᩳۗ;

    .line 790
    invoke-virtual {v3, p2}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    .line 791
    invoke-virtual {v3}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    .line 792
    invoke-virtual {p2}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v2

    if-eqz v2, :cond_15

    .line 793
    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩻()Ll/֨ᩳۗ;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/ۨ֡ۗ;->᩷(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Ljava/lang/String;

    move-result-object p1

    .line 0
    invoke-static {v6, p1, v1}, Ll/۟ܺ᩹;->ۙ(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_15
    return-object v0

    .line 800
    :cond_16
    invoke-direct {p0, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;)V

    return-object v1

    :cond_17
    :goto_8
    return-object v0
.end method

.method private ᩷(Ll/ۤܰۗ;)V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩺ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "package "

    .line 127
    invoke-virtual {p1, v1}, Ll/ۤܰۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->᩺ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ۤܰۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    const/16 v0, 0x3b

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 128
    invoke-virtual {p1}, Ll/ܳܰۗ;->᩸()Ll/ܳܰۗ;

    :cond_0
    return-void
.end method

.method private ᩸(Ll/ۗۘۗ;Ll/֫֨ۗ;)V
    .locals 2

    .line 674
    invoke-virtual {p2}, Ll/֫֨ۗ;->ۧ()Ll/֫֨ۗ;

    move-result-object v0

    .line 675
    invoke-virtual {v0}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 677
    invoke-direct {p0, p1, p2, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)V

    const/16 p2, 0x2e

    .line 678
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 679
    invoke-direct {p0, p1, v0}, Ll/ۨ֡ۗ;->᩸(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    return-void

    .line 682
    :cond_0
    invoke-direct {p0, p1, p2, v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;Ll/֫֨ۗ;)V

    return-void
.end method


# virtual methods
.method public final ۙ()Ll/ܳ֡ۗ;
    .locals 1

    .line 949
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    return-object v0
.end method

.method public final ۙ(Ll/ۗۘۗ;)V
    .locals 6

    .line 162
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    iget-object v1, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v1}, Ll/۠֫᩵;->᩷(Ll/᩻ۡۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 173
    :cond_0
    invoke-virtual {v1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۚ()Z

    move-result v2

    const/16 v3, 0x8

    if-eqz v2, :cond_1

    const/16 v2, 0x400

    .line 175
    invoke-virtual {v0, v2}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    .line 176
    invoke-virtual {v0, v3}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    .line 179
    :cond_1
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v2

    if-nez v2, :cond_2

    .line 180
    invoke-virtual {v0, v3}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ll/ۢᩳۗ;->᩷(I)Ll/ۢᩳۗ;

    move-result-object v0

    .line 183
    :cond_2
    invoke-static {p1, v1}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 184
    invoke-static {p1, v1}, Ll/ۚ۟ۗ;->᩷(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 185
    invoke-static {p1, v1}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/᩻ۡۗ;)V

    .line 187
    iget-object v2, p0, Ll/ۨ֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    invoke-virtual {v2, p1}, Ll/ܳ֡ۗ;->ۙ(Ll/ۗۘۗ;)V

    .line 188
    invoke-virtual {v1}, Ll/ۚᩳۗ;->۠()I

    move-result v2

    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۤ(I)Ll/ܳܰۗ;

    move-result-object v2

    sget-object v3, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    invoke-virtual {v1, v3}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v3

    invoke-virtual {v0, v3}, Ll/ۢᩳۗ;->ۙ(Z)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 189
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۚ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 190
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x40

    .line 191
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    :cond_3
    const-string v2, "interface "

    .line 193
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_0

    .line 194
    :cond_4
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܳ()Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "enum "

    .line 195
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_0

    :cond_5
    const-string v2, "class "

    .line 197
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 199
    :goto_0
    invoke-interface {p1, v1}, Ll/ۗۘۗ;->ۙ(Ll/ܺܰۗ;)V

    .line 200
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 202
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܶۙ()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {p0, p1, v2, v3}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ljava/util/List;Z)Z

    const/16 v2, 0x20

    .line 203
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 205
    invoke-virtual {v1}, Ll/᩻ۡۗ;->۟ۙ()Ll/֫֨ۗ;

    move-result-object v3

    const-string v4, "extends "

    if-eqz v3, :cond_6

    .line 206
    sget-object v5, Ll/֫֨ۗ;->ܰ:Ll/֫֨ۗ;

    .line 207
    invoke-virtual {v3, v5}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    sget-object v5, Ll/֫۟ۗ;->۬ۙ:Ll/֫۟ۗ;

    .line 208
    invoke-virtual {v1, v5}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v5

    if-nez v5, :cond_6

    .line 209
    invoke-interface {p1, v4}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 210
    invoke-virtual {p0, p1, v3}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    .line 211
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 214
    :cond_6
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۤ()Z

    move-result v0

    if-nez v0, :cond_a

    .line 215
    invoke-virtual {v1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 216
    invoke-interface {p1, v4}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_1

    :cond_7
    const-string v0, "implements "

    .line 218
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 220
    :goto_1
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫֨ۗ;

    .line 222
    invoke-virtual {p0, p1, v3}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    .line 223
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    const-string v3, ", "

    .line 224
    invoke-interface {p1, v3}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_2

    .line 227
    :cond_9
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܳۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 228
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    :cond_a
    const/4 v0, 0x0

    .line 275
    invoke-virtual {p0, p1, v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Z)V

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V
    .locals 1

    .line 741
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ۨ֡ۗ;->᩷(Ll/֨ᩳۗ;Ll/֨ᩳۗ;)Ljava/lang/String;

    move-result-object p2

    .line 742
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V
    .locals 1

    .line 662
    invoke-virtual {p2}, Ll/֫֨ۗ;->ܺ()Ll/֫֨ۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 664
    invoke-virtual {p0, p1, v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    const/16 v0, 0x2e

    .line 665
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 666
    invoke-direct {p0, p1, p2}, Ll/ۨ֡ۗ;->᩸(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    return-void

    .line 669
    :cond_0
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-static {v0, p2}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ll/ۨ֡ۗ;->ۤ(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V

    .line 670
    invoke-direct {p0, p1, p2}, Ll/ۨ֡ۗ;->ۤ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;)V
    .locals 6

    .line 435
    invoke-virtual {p2}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-static {p2}, Ll/۠֫᩵;->ۙ(Ll/ۖۡۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 440
    :cond_0
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֫ۖۗ;->ۛۙ()Ll/ۤܰۗ;

    move-result-object v2

    .line 441
    invoke-interface {p1}, Ll/ۗۘۗ;->ۙ()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܳܰۗ;->ۙ(I)V

    .line 442
    sget-object v3, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    invoke-virtual {p2, v3}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v3

    const-string v4, "Failed to reload method in instruction form"

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    .line 462
    :try_start_0
    invoke-static {p2}, Ll/۠֡ۗ;->᩷(Ll/ۖۡۗ;)V
    :try_end_0
    .catch Ll/ۡۧ᩵; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 464
    new-instance v0, Ll/۟ۧ᩵;

    .line 31
    invoke-direct {v0, p2, v4, p1}, Ll/ۡۧ᩵;-><init>(Ll/ۖۡۗ;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 464
    throw v0

    .line 446
    :cond_1
    :try_start_1
    invoke-direct {p0, v2, p2, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    .line 448
    invoke-virtual {p2}, Ll/ۖۡۗ;->۠ۙ()Ll/᩻ۡۗ;

    move-result-object v2

    sget-object v3, Ll/֫۟ۗ;->᩸᩷:Ll/֫۟ۗ;

    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "Method generation error"

    .line 19
    invoke-static {p2, v2, v1}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 452
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۛۙ()Ll/ۤܰۗ;

    move-result-object v2

    .line 453
    invoke-interface {p1}, Ll/ۗۘۗ;->ۙ()I

    move-result v0

    invoke-virtual {v2, v0}, Ll/ܳܰۗ;->ۙ(I)V

    .line 462
    :try_start_2
    invoke-static {p2}, Ll/۠֡ۗ;->᩷(Ll/ۖۡۗ;)V
    :try_end_2
    .catch Ll/ۡۧ᩵; {:try_start_2 .. :try_end_2} :catch_2

    .line 466
    :goto_0
    invoke-direct {p0, v2, p2, v5}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;Z)V

    .line 457
    :goto_1
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->ۙ(Ll/ۤܰۗ;)Ll/ۗۘۗ;

    return-void

    :catch_2
    move-exception p1

    .line 464
    new-instance v0, Ll/۟ۧ᩵;

    .line 31
    invoke-direct {v0, p2, v4, p1}, Ll/ۡۧ᩵;-><init>(Ll/ۖۡۗ;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 464
    throw v0

    .line 449
    :cond_2
    throw v1

    .line 436
    :cond_3
    :goto_2
    invoke-direct {p0, p1, p2, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۖۡۗ;Z)V

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;Z)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const/16 v0, 0x7b

    .line 283
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 284
    iget-object v3, v1, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    if-eqz p2, :cond_0

    sget-object v0, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    invoke-virtual {v3, v0}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 285
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, " // from class: "

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    :cond_0
    const/4 v4, 0x1

    .line 961
    iput-boolean v4, v1, Ll/ۨ֡ۗ;->᩷:Z

    .line 288
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->getLength()I

    move-result v0

    iput v0, v1, Ll/ۨ֡ۗ;->᩸:I

    .line 289
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ۤ()V

    .line 578
    sget-object v0, Ll/ۧ۟ۗ;->ۚ:Ll/ۧ۟ۗ;

    invoke-virtual {v3, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/֨۟ۗ;

    const/4 v5, 0x0

    const/16 v6, 0x3b

    const/16 v7, 0x20

    if-nez v0, :cond_1

    goto/16 :goto_3

    .line 583
    :cond_1
    invoke-virtual {v0}, Ll/֨۟ۗ;->ۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v9, 0x0

    :cond_2
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    .line 584
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۢ۟ۗ;

    .line 586
    invoke-virtual {v10}, Ll/ۢ۟ۗ;->ۤ()Ll/ܽۡۗ;

    move-result-object v11

    invoke-static {v2, v11}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 587
    invoke-virtual {v10}, Ll/ۢ۟ۗ;->ۤ()Ll/ܽۡۗ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ܽۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v2, v11}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 588
    invoke-virtual {v10}, Ll/ۢ۟ۗ;->᩷()Ll/ۜ֨ۗ;

    move-result-object v11

    .line 589
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v12

    invoke-virtual {v11}, Ll/ۜ֨ۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v13

    invoke-virtual {v12, v13}, Ll/֫ۖۗ;->ۙ(Ll/᩷ۢۗ;)Ll/ۖۡۗ;

    move-result-object v12

    if-eqz v12, :cond_3

    .line 618
    sget-object v13, Ll/ۧ۟ۗ;->ۙۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v12, v13}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v13

    check-cast v13, Ll/᩶ᩳۗ;

    if-eqz v13, :cond_3

    .line 620
    invoke-virtual {v13}, Ll/᩶ᩳۗ;->ۙ()I

    move-result v13

    goto :goto_1

    :cond_3
    const/4 v13, 0x0

    .line 591
    :goto_1
    invoke-virtual {v11}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v14

    if-le v14, v13, :cond_5

    if-nez v9, :cond_4

    .line 593
    invoke-virtual {v0}, Ll/֨۟ۗ;->᩷()Ll/ۖۡۗ;

    move-result-object v9

    .line 627
    new-instance v13, Ll/۠֡ۗ;

    invoke-direct {v13, v1, v9}, Ll/۠֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V

    .line 628
    new-instance v9, Ll/֡֡ۗ;

    invoke-direct {v9, v13, v5}, Ll/֡֡ۗ;-><init>(Ll/۠֡ۗ;Z)V

    .line 595
    :cond_4
    invoke-virtual {v9, v2, v11, v5, v12}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܳۢۗ;ILl/ۖۡۗ;)V

    .line 597
    :cond_5
    invoke-virtual {v10}, Ll/ۢ۟ۗ;->ۙ()Ll/᩻ۡۗ;

    move-result-object v11

    if-eqz v11, :cond_6

    .line 598
    invoke-interface {v2, v7}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 599
    new-instance v11, Ll/ۨ֡ۗ;

    invoke-virtual {v10}, Ll/ۢ۟ۗ;->ۙ()Ll/᩻ۡۗ;

    move-result-object v10

    invoke-direct {v11, v10, v1}, Ll/ۨ֡ۗ;-><init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;)V

    invoke-virtual {v11, v2, v4}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Z)V

    .line 601
    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x2c

    .line 602
    invoke-interface {v2, v10}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    goto :goto_0

    .line 426
    :cond_7
    invoke-virtual {v3}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۖۡۗ;

    .line 427
    sget-object v10, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v9, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v9

    if-nez v9, :cond_8

    goto :goto_2

    .line 605
    :cond_9
    invoke-direct/range {p0 .. p0}, Ll/ۨ֡ۗ;->֫()Z

    move-result v8

    if-nez v8, :cond_b

    .line 360
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩻ۡۗ;

    .line 361
    sget-object v10, Ll/ۧ۟ۗ;->ۙ:Ll/ۧ۟ۗ;

    invoke-virtual {v9, v10}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v9

    if-nez v9, :cond_a

    .line 606
    :cond_b
    :goto_2
    invoke-virtual {v0}, Ll/֨۟ۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 607
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->᩷()Ll/ܳܰۗ;

    .line 609
    :cond_c
    invoke-interface {v2, v6}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 610
    invoke-direct/range {p0 .. p0}, Ll/ۨ֡ۗ;->֫()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 611
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->᩸()Ll/ܳܰۗ;

    .line 509
    :cond_d
    :goto_3
    invoke-virtual {v3}, Ll/᩻ۡۗ;->getFields()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۡۗ;

    .line 515
    sget-object v9, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v9}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_4

    .line 518
    :cond_e
    sget-object v9, Ll/᩻᩶ۗ;->ۤ:Ll/᩻᩶ۗ;

    invoke-virtual {v0, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v9

    if-nez v9, :cond_f

    sget-object v9, Ll/ۧ۟ۗ;->ۨ:Ll/ۧ۟ۗ;

    .line 519
    invoke-virtual {v0, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v9

    if-nez v9, :cond_f

    sget-object v9, Ll/ۧ۟ۗ;->᩸:Ll/ۧ۟ۗ;

    .line 520
    invoke-virtual {v0, v9}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v9

    if-eqz v9, :cond_10

    .line 521
    :cond_f
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->᩸()Ll/ܳܰۗ;

    .line 526
    :cond_10
    invoke-static {v2, v0}, Ll/ۚ۟ۗ;->ۙ(Ll/ۗۘۗ;Ll/ۨᩳۗ;)V

    .line 527
    iget-object v9, v1, Ll/ۨ֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    invoke-virtual {v9, v2, v0}, Ll/ܳ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ܽۡۗ;)V

    .line 529
    invoke-virtual {v0}, Ll/ܽۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v10

    sget-object v11, Ll/ܽۘۗ;->֡:Ll/ܽۘۗ;

    invoke-virtual {v0, v11}, Ll/ۨᩳۗ;->ۙ(Ll/ܽۘۗ;)Z

    move-result v11

    invoke-virtual {v10, v11}, Ll/ۢᩳۗ;->ۙ(Z)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ll/ۗۘۗ;->᩷(Ljava/lang/String;)Ll/ܳܰۗ;

    .line 530
    invoke-virtual {v0}, Ll/ܽۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v10

    invoke-virtual {v1, v2, v10}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    .line 531
    invoke-interface {v2, v7}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 532
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->ۙ(Ll/ܺܰۗ;)V

    .line 533
    invoke-virtual {v0}, Ll/ܽۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 535
    sget-object v10, Ll/ۧ۟ۗ;->ܽ:Ll/ۧ۟ۗ;

    invoke-virtual {v0, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v10

    check-cast v10, Ll/ۨ۟ۗ;

    const-string v11, " = "

    if-eqz v10, :cond_11

    .line 537
    invoke-virtual {v10}, Ll/ۨ۟ۗ;->᩷()Ll/ۖۡۗ;

    move-result-object v0

    .line 627
    new-instance v9, Ll/۠֡ۗ;

    invoke-direct {v9, v1, v0}, Ll/۠֡ۗ;-><init>(Ll/ۨ֡ۗ;Ll/ۖۡۗ;)V

    .line 628
    new-instance v0, Ll/֡֡ۗ;

    invoke-direct {v0, v9, v5}, Ll/֡֡ۗ;-><init>(Ll/۠֡ۗ;Z)V

    .line 538
    invoke-interface {v2, v11}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 539
    invoke-virtual {v10}, Ll/ۨ۟ۗ;->ۙ()Ll/ᩳۡۗ;

    move-result-object v9

    .line 633
    :try_start_0
    sget-object v10, Ll/ܿ֡ۗ;->ܿ:Ll/ܿ֡ۗ;

    invoke-virtual {v0, v9, v2, v10}, Ll/֡֡ۗ;->ۙ(Ll/ᩳۡۗ;Ll/ۗۘۗ;Ll/ܿ֡ۗ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    const-string v9, "Failed to generate init code"

    .line 19
    invoke-static {v3, v9, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_6

    .line 541
    :cond_11
    sget-object v10, Ll/᩻᩶ۗ;->ᩴ:Ll/᩻᩶ۗ;

    invoke-virtual {v0, v10}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v10

    check-cast v10, Ll/ܳ᩶ۗ;

    if-eqz v10, :cond_15

    .line 543
    invoke-interface {v2, v11}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 544
    invoke-virtual {v10}, Ll/ܳ᩶ۗ;->ۙ()Ll/᩸᩶ۗ;

    move-result-object v11

    sget-object v12, Ll/᩸᩶ۗ;->ۤۙ:Ll/᩸᩶ۗ;

    iget-boolean v15, v1, Ll/ۨ֡ۗ;->ᩴ:Z

    if-ne v11, v12, :cond_12

    .line 545
    invoke-virtual {v0}, Ll/ܽۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    sget v9, Ll/ܳ۟ۗ;->ۙ:I

    .line 55
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v9

    invoke-virtual {v9}, Ll/֫ۖۗ;->ܺۙ()Ll/ۨۧ᩵;

    move-result-object v16

    const/16 v18, 0x0

    const-wide/16 v13, 0x0

    move v11, v15

    move-object v15, v0

    move/from16 v17, v11

    invoke-static/range {v13 .. v18}, Ll/ܳ۟ۗ;->ۙ(JLl/֫֨ۗ;Ll/ۨۧ᩵;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 545
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_6

    :cond_12
    move v11, v15

    .line 547
    invoke-static {v10}, Ll/ۛ֫᩵;->ۙ(Ll/ܳ᩶ۗ;)Ljava/lang/Object;

    move-result-object v12

    .line 548
    instance-of v13, v12, Ll/᩹֨ۗ;

    if-eqz v13, :cond_14

    .line 549
    check-cast v12, Ll/᩹֨ۗ;

    invoke-virtual {v12}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v13

    .line 550
    invoke-virtual {v0}, Ll/ܽۡۗ;->getType()Ll/֫֨ۗ;

    move-result-object v15

    .line 561
    iget-object v0, v1, Ll/ۨ֡ۗ;->۫:Ll/ۡۘۗ;

    sget-object v9, Ll/ۡۘۗ;->ܿ:Ll/ۡۘۗ;

    if-eq v0, v9, :cond_13

    sget v0, Ll/ܰۧ᩵;->ۙ:I

    .line 47
    sget-object v0, Ll/֫֨ۗ;->ܺ:Ll/֫֨ۗ;

    invoke-virtual {v15, v0}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 51
    invoke-virtual {v3}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 52
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ۤۙ()Ljava/lang/String;

    move-result-object v0

    const-string v9, "R"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 562
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-array v9, v4, [Ljava/lang/Object;

    aput-object v0, v9, v5

    const-string v0, "0x%08x"

    invoke-static {v0, v9}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 565
    :cond_13
    sget v0, Ll/ܳ۟ۗ;->ۙ:I

    .line 55
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->ܺۙ()Ll/ۨۧ᩵;

    move-result-object v16

    const/16 v18, 0x0

    move/from16 v17, v11

    invoke-static/range {v13 .. v18}, Ll/ܳ۟ۗ;->ۙ(JLl/֫֨ۗ;Ll/ۨۧ᩵;ZZ)Ljava/lang/String;

    move-result-object v0

    .line 550
    :goto_5
    invoke-interface {v2, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_6

    .line 552
    :cond_14
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v9, v0, v2, v10}, Ll/ܳ֡ۗ;->ۙ(Ll/֫ۖۗ;Ll/ۗۘۗ;Ll/ܳ᩶ۗ;)V

    .line 557
    :cond_15
    :goto_6
    invoke-interface {v2, v6}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    goto/16 :goto_4

    .line 298
    :cond_16
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 299
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ۗۙ()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v3}, Ll/᩻ۡۗ;->getMethods()Ljava/util/List;

    move-result-object v3

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/util/List;

    aput-object v6, v7, v5

    aput-object v3, v7, v4

    invoke-static {v7}, Ll/᩹ܺۗ;->of([Ljava/lang/Object;)Ll/᩵ܺۗ;

    move-result-object v3

    new-instance v6, Ll/ۘۜۧ;

    invoke-direct {v6, v4}, Ll/ۘۜۧ;-><init>(I)V

    .line 300
    invoke-interface {v3, v6}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v3

    new-instance v4, Ll/۫֡ۗ;

    invoke-direct {v4, v5, v1}, Ll/۫֡ۗ;-><init>(ILjava/lang/Object;)V

    .line 301
    invoke-interface {v3, v4}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v3

    new-instance v4, Ll/֫֡ۗ;

    invoke-direct {v4, v5}, Ll/֫֡ۗ;-><init>(I)V

    .line 302
    invoke-static {v4}, Ll/ۖ۫ۗ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v4

    new-instance v6, Ll/ۧ֡ۗ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 303
    invoke-static {v4, v6}, Ll/۠۫ۗ;->thenComparingInt(Ljava/util/Comparator;Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v4

    new-instance v6, Ll/᩻֡ۗ;

    invoke-direct {v6, v5, v0}, Ll/᩻֡ۗ;-><init>(ILjava/lang/Object;)V

    .line 304
    invoke-static {v4, v6}, Ll/۠۫ۗ;->thenComparing(Ljava/util/Comparator;Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object v0

    .line 302
    invoke-interface {v3, v0}, Ll/᩵ܺۗ;->sorted(Ljava/util/Comparator;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v3, Ll/ܺ֡ۗ;

    invoke-direct {v3, v5, v1, v2}, Ll/ܺ֡ۗ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 305
    invoke-interface {v0, v3}, Ll/᩵ܺۗ;->forEach(Ljava/util/function/Consumer;)V

    .line 292
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->۫()V

    .line 293
    invoke-interface/range {p1 .. p1}, Ll/ۗۘۗ;->ܳ()Ll/ܳܰۗ;

    .line 294
    sget-object v0, Ll/᩹ܰۗ;->ܰ:Ll/᩹ܰۗ;

    invoke-interface {v2, v0}, Ll/ۗۘۗ;->ۙ(Ll/ۧܰۗ;)V

    return-void
.end method

.method public final ۙ(Ll/ۜ֡ۗ;)V
    .locals 0

    .line 970
    iput-object p1, p0, Ll/ۨ֡ۗ;->ۚ:Ll/ۜ֡ۗ;

    return-void
.end method

.method public final ۙ(Ll/ۗۘۗ;Ljava/util/List;Z)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_8

    .line 234
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const/16 v1, 0x3c

    .line 237
    invoke-interface {p1, v1}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    .line 239
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫֨ۗ;

    if-eqz v0, :cond_1

    const-string v2, ", "

    .line 241
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 243
    :cond_1
    invoke-virtual {v1}, Ll/֫֨ۗ;->᩺()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 244
    invoke-virtual {v1}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_1

    .line 246
    :cond_2
    invoke-virtual {p0, p1, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    .line 248
    :goto_1
    invoke-virtual {v1}, Ll/֫֨ۗ;->ۚ()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 249
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    const-string v2, " extends "

    .line 250
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 251
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 252
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֫֨ۗ;

    .line 253
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩺()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 254
    invoke-virtual {v2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_3

    .line 256
    :cond_4
    invoke-virtual {p0, p1, v2}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    if-eqz p3, :cond_5

    .line 258
    iget-object v3, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v3}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֨ᩳۗ;->ۛ()Z

    move-result v4

    if-nez v4, :cond_5

    .line 259
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۛۘۗ;->ܳۙ()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 260
    invoke-virtual {v3}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v3

    invoke-static {v3, v2}, Ll/֨ᩳۗ;->ۙ(Ll/֫ۖۗ;Ll/֫֨ۗ;)Ll/֨ᩳۗ;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;)V

    .line 263
    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, " & "

    .line 264
    invoke-interface {p1, v2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    goto :goto_2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_7
    const/16 p2, 0x3e

    .line 270
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->ۙ(C)Ll/ۗۘۗ;

    const/4 p1, 0x1

    return p1

    :cond_8
    :goto_4
    return v0
.end method

.method public final ۚ()Ll/᩹ۘۗ;
    .locals 3

    .line 112
    sget-object v0, Ll/֫۟ۗ;->ۖۙ:Ll/֫۟ۗ;

    iget-object v1, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 152
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۛۙ()Ll/ۤܰۗ;

    move-result-object v0

    .line 153
    iget-object v2, p0, Ll/ۨ֡ۗ;->ۙ:Ll/ܳ֡ۗ;

    invoke-virtual {v2, v0}, Ll/ܳ֡ۗ;->ۙ(Ll/ۗۘۗ;)V

    .line 154
    invoke-virtual {v0}, Ll/ܳܰۗ;->᩸()Ll/ܳܰۗ;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۤܰۗ;->ۙ(Ll/ܺܰۗ;)V

    .line 156
    invoke-direct {p0, v0}, Ll/ۨ֡ۗ;->᩷(Ll/ۤܰۗ;)V

    .line 157
    invoke-direct {p0, v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ۤܰۗ;)V

    .line 158
    invoke-virtual {v0}, Ll/ۤܰۗ;->᩻()Ll/᩹ۘۗ;

    move-result-object v0

    return-object v0

    .line 115
    :cond_0
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۛۙ()Ll/ۤܰۗ;

    move-result-object v0

    .line 116
    invoke-virtual {p0, v0}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;)V

    .line 118
    invoke-virtual {v1}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֫ۖۗ;->ۛۙ()Ll/ۤܰۗ;

    move-result-object v1

    .line 119
    invoke-direct {p0, v1}, Ll/ۨ֡ۗ;->᩷(Ll/ۤܰۗ;)V

    .line 120
    invoke-direct {p0, v1}, Ll/ۨ֡ۗ;->ۙ(Ll/ۤܰۗ;)V

    .line 121
    invoke-virtual {v1, v0}, Ll/ۤܰۗ;->ۙ(Ll/ۤܰۗ;)Ll/ۗۘۗ;

    .line 122
    invoke-virtual {v1}, Ll/ۤܰۗ;->᩻()Ll/᩹ۘۗ;

    move-result-object v0

    return-object v0
.end method

.method public final ۤ()Ljava/util/Set;
    .locals 1

    .line 852
    iget-object v0, p0, Ll/ۨ֡ۗ;->֫:Ll/ۨ֡ۗ;

    if-eqz v0, :cond_0

    .line 853
    invoke-virtual {v0}, Ll/ۨ֡ۗ;->ۤ()Ljava/util/Set;

    move-result-object v0

    return-object v0

    .line 855
    :cond_0
    iget-object v0, p0, Ll/ۨ֡ۗ;->ܳ:Ljava/util/HashSet;

    return-object v0
.end method

.method public final ۤ(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V
    .locals 1

    .line 727
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {v0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/֫ۖۗ;->ۙ(Ll/֨ᩳۗ;)Ll/᩻ۡۗ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 736
    invoke-interface {p1, v0}, Ll/ۗۘۗ;->ۙ(Ll/ۧܰۗ;)V

    .line 737
    invoke-virtual {v0}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V

    return-void

    .line 731
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V

    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 953
    iget-boolean v0, p0, Ll/ۨ֡ۗ;->ᩴ:Z

    return v0
.end method

.method public final ܳ()Z
    .locals 1

    .line 957
    iget-boolean v0, p0, Ll/ۨ֡ۗ;->᩷:Z

    return v0
.end method

.method public final ᩴ()Ll/ۨ֡ۗ;
    .locals 1

    .line 945
    iget-object v0, p0, Ll/ۨ֡ۗ;->֫:Ll/ۨ֡ۗ;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public final ᩷()Ll/᩻ۡۗ;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    return-object v0
.end method

.method public final ᩷(Ll/ۗۘۗ;Ll/֨ᩳۗ;)V
    .locals 2

    .line 746
    invoke-virtual {p2}, Ll/֨ᩳۗ;->۫()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    .line 747
    iget-object p1, p0, Ll/ۨ֡ۗ;->ۤ:Ll/᩻ۡۗ;

    invoke-virtual {p1}, Ll/᩻ۡۗ;->ᩴۙ()Ll/֨ᩳۗ;

    move-result-object p1

    .line 860
    invoke-virtual {p1}, Ll/֨ᩳۗ;->᩵()Ll/֨ᩳۗ;

    move-result-object v0

    .line 861
    invoke-virtual {p2}, Ll/֨ᩳۗ;->᩵()Ll/֨ᩳۗ;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 863
    invoke-virtual {v0, v1}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    .line 866
    :cond_0
    invoke-virtual {p1, v1}, Ll/֨ᩳۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-nez p1, :cond_1

    .line 748
    invoke-direct {p0, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/֨ᩳۗ;)V

    :cond_1
    return-void
.end method

.method public final ᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V
    .locals 2

    .line 640
    invoke-virtual {p2}, Ll/֫֨ۗ;->ܶ()Ll/ۨ֨ۗ;

    move-result-object v0

    if-nez v0, :cond_0

    .line 642
    invoke-virtual {p2}, Ll/֫֨ۗ;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return-void

    .line 643
    :cond_0
    sget-object v1, Ll/ۨ֨ۗ;->۬:Ll/ۨ֨ۗ;

    if-ne v0, v1, :cond_2

    .line 644
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩺()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 645
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩻()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return-void

    .line 647
    :cond_1
    invoke-virtual {p0, p1, p2}, Ll/ۨ֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    return-void

    .line 649
    :cond_2
    sget-object v1, Ll/ۨ֨ۗ;->۟:Ll/ۨ֨ۗ;

    if-ne v0, v1, :cond_3

    .line 650
    invoke-virtual {p2}, Ll/֫֨ۗ;->ܳ()Ll/֫֨ۗ;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ll/ۨ֡ۗ;->᩷(Ll/ۗۘۗ;Ll/֫֨ۗ;)V

    const-string p2, "[]"

    .line 651
    invoke-interface {p1, p2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return-void

    .line 653
    :cond_3
    invoke-virtual {v0}, Ll/ۨ֨ۗ;->᩸()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ll/ۗۘۗ;->add(Ljava/lang/String;)Ll/ۗۘۗ;

    return-void
.end method

.method public final ᩸()Ll/ۜ֡ۗ;
    .locals 1

    .line 966
    iget-object v0, p0, Ll/ۨ֡ۗ;->ۚ:Ll/ۜ֡ۗ;

    return-object v0
.end method
