.class public final Ll/ܰۖۗ;
.super Ll/᩵ۖۗ;
.source "Z6H1"

# interfaces
.implements Ll/ۗۡۗ;


# static fields
.field public static final ۢ:Ljava/lang/Object;


# instance fields
.field public final ۟:Ljava/util/ArrayList;

.field public final ᩳ:Ll/᩷ۡۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 18
    new-instance v0, Ll/᩺ۖۗ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܰۖۗ;->ۢ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ll/ܿۡۗ;Ll/᩷ۡۗ;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Ll/᩵ۖۗ;-><init>(Ll/ܿۡۗ;)V

    .line 31
    iput-object p2, p0, Ll/ܰۖۗ;->ᩳ:Ll/᩷ۡۗ;

    .line 32
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܰۖۗ;->۟:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Switch: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    iget-object v1, p0, Ll/ܰۖۗ;->ᩳ:Ll/᩷ۡۗ;

    invoke-virtual {v1}, Ll/᩷ۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    iget-object v1, p0, Ll/ܰۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘۖۗ;

    .line 103
    invoke-virtual {v2}, Ll/ۘۖۗ;->᩷()Ljava/util/List;

    move-result-object v3

    new-instance v4, Ll/۫۫ۚ;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Ll/۫۫ۚ;-><init>(I)V

    invoke-static {v3, v4}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v3

    const-string v4, "\n case "

    .line 105
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    .line 72
    invoke-static {v3, v4}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 106
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    .line 107
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/ۘۖۗ;->ۙ()Ll/ۛۡۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 109
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۖ()Ljava/util/ArrayList;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ܰۖۗ;->۟:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ۙ(Ljava/util/List;Ll/ۛۡۗ;)V
    .locals 1

    .line 62
    new-instance v0, Ll/ۘۖۗ;

    invoke-direct {v0, p1, p2}, Ll/ۘۖۗ;-><init>(Ljava/util/List;Ll/ۛۡۗ;)V

    iget-object p1, p0, Ll/ܰۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۙ(Ll/۬֡ۗ;Ll/ۗۘۗ;)V
    .locals 0

    .line 90
    invoke-virtual {p1, p0, p2}, Ll/۬֡ۗ;->ۙ(Ll/ܰۖۗ;Ll/ۗۘۗ;)V

    return-void
.end method

.method public final ۠()Ll/᩷ۡۗ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܰۖۗ;->ᩳ:Ll/᩷ۡۗ;

    return-object v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 2

    .line 70
    new-instance v0, Ll/ۛۖۗ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/ܰۖۗ;->۟:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v0

    .line 85
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Ljava/util/List;
    .locals 3

    .line 75
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ܰۖۗ;->۟:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    iget-object v2, p0, Ll/ܰۖۗ;->ᩳ:Ll/᩷ۡۗ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۘۖۗ;

    .line 78
    invoke-static {v2}, Ll/ۘۖۗ;->ۙ(Ll/ۘۖۗ;)Ll/ۛۡۗ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 80
    :cond_0
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 2

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SW:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܰۖۗ;->ᩳ:Ll/᩷ۡۗ;

    invoke-virtual {v1}, Ll/᩷ۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
