.class public final Ll/֡ᩴ᩵;
.super Ll/ۧᩴ᩵;
.source "XIRO"


# instance fields
.field public final ܿ:Ljava/util/LinkedHashMap;

.field public final ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ll/ۧᩴ᩵;-><init>()V

    .line 21
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ᩴ᩵;->᩶:Ljava/util/ArrayList;

    .line 22
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/֡ᩴ᩵;->ܿ:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;Ll/᩹ۡۗ;Ll/ܿۡۗ;)V
    .locals 2

    .line 30
    new-instance p1, Ll/֨ᩴ᩵;

    invoke-direct {p1, p3, p2}, Ll/֨ᩴ᩵;-><init>(Ll/ܿۡۗ;Ll/᩹ۡۗ;)V

    .line 41
    instance-of v0, p3, Ll/ۜۖۗ;

    if-eqz v0, :cond_0

    .line 42
    check-cast p3, Ll/ۜۖۗ;

    .line 43
    invoke-virtual {p3}, Ll/ۜۖۗ;->getType()Ll/᩷ۢܺ;

    move-result-object p3

    .line 44
    instance-of v0, p3, Ll/۠ۖۗ;

    if-eqz v0, :cond_0

    .line 45
    check-cast p3, Ll/۠ۖۗ;

    .line 46
    invoke-virtual {p3}, Ll/۠ۖۗ;->᩷()Ll/ᩳۡۗ;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Ll/֡ᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ll/֨ᩴ᩵;)V

    .line 47
    invoke-virtual {p3}, Ll/۠ۖۗ;->ۙ()Ll/ᩳۡۗ;

    move-result-object p3

    invoke-virtual {p0, p3, p1}, Ll/֡ᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ll/֨ᩴ᩵;)V

    .line 32
    :cond_0
    invoke-interface {p2}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_1

    .line 34
    invoke-interface {p2}, Ll/᩹ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۡۗ;

    .line 35
    invoke-virtual {p0, v1, p1}, Ll/֡ᩴ᩵;->ۙ(Ll/ᩳۡۗ;Ll/֨ᩴ᩵;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۙ(Ll/ᩳۡۗ;Ll/֨ᩴ᩵;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p1}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v0

    .line 58
    iget-object v1, p0, Ll/֡ᩴ᩵;->ܿ:Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_1

    .line 59
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 60
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    .line 76
    new-instance v2, Ll/ܿᩴ᩵;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v0, v2}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡᩴ᩵;

    .line 61
    invoke-virtual {v0}, Ll/ۡᩴ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    :cond_1
    iget-object v0, p0, Ll/֡ᩴ᩵;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 66
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/util/Collection;)V

    .line 67
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ֨ۗ;

    .line 68
    sget-object v2, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {v0, v2}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 69
    invoke-virtual {v0}, Ll/ۛ֨ۗ;->ܶۙ()Ll/ܿ֨ۗ;

    move-result-object v0

    .line 76
    new-instance v2, Ll/ܿᩴ᩵;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, v0, v2}, Ll/ۧۚۗ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡᩴ᩵;

    .line 70
    invoke-virtual {v0}, Ll/ۡᩴ᩵;->᩷()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final ᩷()Ljava/util/LinkedHashMap;
    .locals 1

    .line 25
    iget-object v0, p0, Ll/֡ᩴ᩵;->ܿ:Ljava/util/LinkedHashMap;

    return-object v0
.end method
