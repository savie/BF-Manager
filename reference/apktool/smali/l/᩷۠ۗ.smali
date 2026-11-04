.class public final Ll/᩷۠ۗ;
.super Ljava/lang/Object;
.source "26C0"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ljava/util/List;

.field public final ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/List;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/᩷۠ۗ;->᩶:Ljava/util/ArrayList;

    .line 32
    iput-object p2, p0, Ll/᩷۠ۗ;->ܰ:Ljava/util/List;

    return-void
.end method

.method public static ۙ(Ljava/util/List;)Ll/᩷۠ۗ;
    .locals 4

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ۠ۗ;

    .line 19
    invoke-virtual {v2}, Ll/ۙ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 20
    invoke-virtual {v2}, Ll/ۙ۠ۗ;->ۙ()Ll/ᩴ۠ۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 23
    :cond_1
    new-instance v1, Ll/۬ۖۗ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/ۖ۫ۗ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۫ۚۗ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 24
    new-instance v1, Ll/᩷۠ۗ;

    .line 0
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    .line 24
    invoke-direct {v1, v0, p0}, Ll/᩷۠ۗ;-><init>(Ljava/util/ArrayList;Ljava/util/List;)V

    return-object v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 58
    :cond_0
    instance-of v0, p1, Ll/᩷۠ۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 61
    :cond_1
    check-cast p1, Ll/᩷۠ۗ;

    .line 62
    iget-object v0, p0, Ll/᩷۠ۗ;->ܰ:Ljava/util/List;

    iget-object p1, p1, Ll/᩷۠ۗ;->ܰ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩷۠ۗ;->ܰ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Catch: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    iget-object v1, p0, Ll/᩷۠ۗ;->᩶:Ljava/util/ArrayList;

    const-string v2, ", "

    .line 72
    invoke-static {v1, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/᩷۠ۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 14
    sget-object v0, Ll/ۧ۟ۗ;->ۧ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/᩷۠ۗ;->ܰ:Ljava/util/List;

    return-object v0
.end method

.method public final ᩷()Ljava/util/List;
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩷۠ۗ;->᩶:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
