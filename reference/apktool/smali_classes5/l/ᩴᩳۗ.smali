.class public final Ll/ᩴᩳۗ;
.super Ljava/lang/Object;
.source "56EU"

# interfaces
.implements Ll/ۧ᩶ۗ;


# instance fields
.field public final ܰ:Ljava/util/EnumMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Ll/ܽۘۗ;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Ll/ᩴᩳۗ;->ܰ:Ljava/util/EnumMap;

    return-void
.end method

.method public static synthetic ۙ(Ljava/util/Map$Entry;)Ll/᩵ܺۗ;
    .locals 3

    .line 47
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۘۗ;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-static {p0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v1, Ll/ۗۘ֫;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/ۗۘ֫;-><init>(ILjava/lang/Object;)V

    .line 49
    invoke-interface {p0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۛ۟ۗ;Ll/ܽۘۗ;Ljava/lang/String;)V
    .locals 2

    .line 25
    sget-object v0, Ll/ۧ۟ۗ;->ۨ:Ll/ۧ۟ۗ;

    invoke-interface {p0, v0}, Ll/ۛ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v0

    check-cast v0, Ll/ᩴᩳۗ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Ll/ᩴᩳۗ;

    invoke-direct {v0}, Ll/ᩴᩳۗ;-><init>()V

    .line 30
    invoke-interface {p0, v0}, Ll/ۛ۟ۗ;->ۙ(Ll/ۧ᩶ۗ;)V

    .line 37
    :goto_0
    iget-object p0, v0, Ll/ᩴᩳۗ;->ܰ:Ljava/util/EnumMap;

    new-instance v0, Ll/ᩳۢ֫;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ll/ᩳۢ֫;-><init>(I)V

    invoke-static {p0, p1, v0}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    invoke-interface {p0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JadxCommentsAttr{\n "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ᩴᩳۗ;->ܰ:Ljava/util/EnumMap;

    .line 67
    invoke-virtual {v1}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    new-instance v2, Ll/ܽܿ᩺;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ll/ܽܿ᩺;-><init>(I)V

    const-string v3, "\n "

    invoke-static {v1, v3, v2}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡()Ljava/lang/String;
    .locals 1

    .line 18
    invoke-virtual {p0}, Ll/ᩴᩳۗ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ll/֫᩶ۗ;
    .locals 1

    .line 61
    sget-object v0, Ll/ۧ۟ۗ;->ۨ:Ll/ۧ۟ۗ;

    return-object v0
.end method

.method public final ۙ()Ljava/util/EnumMap;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/ᩴᩳۗ;->ܰ:Ljava/util/EnumMap;

    return-object v0
.end method

.method public final ۙ(Ll/ܽۘۗ;)Ljava/util/List;
    .locals 2

    .line 41
    sget-object v0, Ll/ܽۘۗ;->۟:Ll/ܽۘۗ;

    if-eq p1, v0, :cond_1

    sget-object v0, Ll/ܽۘۗ;->ᩳ:Ll/ܽۘۗ;

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Ll/ᩴᩳۗ;->ܰ:Ljava/util/EnumMap;

    invoke-virtual {v0}, Ljava/util/EnumMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/᩸ᩳۗ;

    invoke-direct {v1, p1}, Ll/᩸ᩳۗ;-><init>(Ll/ܽۘۗ;)V

    .line 45
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p1

    new-instance v0, Ll/۠ۚ۫;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/۠ۚ۫;-><init>(I)V

    .line 46
    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p1

    .line 51
    invoke-interface {p1}, Ll/᩵ܺۗ;->sorted()Ll/᩵ܺۗ;

    move-result-object p1

    .line 52
    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 42
    :cond_1
    :goto_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public final synthetic ᩹()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
