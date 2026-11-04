.class public abstract Ll/ᩴᩴܽ;
.super Ll/ۚᩴܽ;
.source "O3K3"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x21f766b1f568c81dL


# instance fields
.field public transient ֡:Ljava/util/Map;

.field public transient ۟:I


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    invoke-static {v0}, Ll/ۨۙܽ;->ۙ(Z)V

    .line 128
    iput-object p1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴᩴܽ;)Ljava/util/Map;
    .locals 0

    .line 96
    iget-object p0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ᩴᩴܽ;I)V
    .locals 1

    .line 96
    iget v0, p0, Ll/ᩴᩴܽ;->۟:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    return-void
.end method

.method public static ۙ(Ll/ᩴᩴܽ;Ljava/lang/Object;)V
    .locals 1

    .line 1147
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    .line 957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3635
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    .line 1147
    :goto_0
    check-cast p1, Ljava/util/Collection;

    if-eqz p1, :cond_0

    .line 1150
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 1151
    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    .line 1152
    iget p1, p0, Ll/ᩴᩴܽ;->۟:I

    sub-int/2addr p1, v0

    iput p1, p0, Ll/ᩴᩴܽ;->۟:I

    :cond_0
    return-void
.end method

.method public static synthetic ۤ(Ll/ᩴᩴܽ;)V
    .locals 1

    .line 96
    iget v0, p0, Ll/ᩴᩴܽ;->۟:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    return-void
.end method

.method public static synthetic ᩷(Ll/ᩴᩴܽ;)V
    .locals 1

    .line 96
    iget v0, p0, Ll/ᩴᩴܽ;->۟:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    return-void
.end method

.method public static synthetic ᩷(Ll/ᩴᩴܽ;I)V
    .locals 1

    .line 96
    iget v0, p0, Ll/ᩴᩴܽ;->۟:I

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 2

    .line 279
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    .line 280
    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    goto :goto_0

    .line 282
    :cond_0
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    const/4 v0, 0x0

    .line 283
    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    return-void
.end method

.method public get(Ljava/lang/Object;)Ljava/util/Collection;
    .locals 4

    .line 295
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-nez v0, :cond_0

    .line 171
    invoke-virtual {p0}, Ll/ᩴᩴܽ;->۫()Ljava/util/Collection;

    move-result-object v0

    .line 299
    :cond_0
    move-object v1, p0

    check-cast v1, Ll/ܰ᩸ܽ;

    .line 68
    check-cast v0, Ljava/util/List;

    .line 310
    instance-of v2, v0, Ljava/util/RandomAccess;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 311
    new-instance v2, Ll/۠᩸ܽ;

    .line 924
    invoke-direct {v2, v1, p1, v0, v3}, Ll/᩸ᩴܽ;-><init>(Ll/ᩴᩴܽ;Ljava/lang/Object;Ljava/util/List;Ll/᩷ᩴܽ;)V

    return-object v2

    .line 312
    :cond_1
    new-instance v2, Ll/᩸ᩴܽ;

    invoke-direct {v2, v1, p1, v0, v3}, Ll/᩸ᩴܽ;-><init>(Ll/ᩴᩴܽ;Ljava/lang/Object;Ljava/util/List;Ll/᩷ᩴܽ;)V

    return-object v2
.end method

.method public final ֫()Ljava/util/Set;
    .locals 2

    .line 934
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    .line 935
    new-instance v0, Ll/ۖ᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Ll/ۖ᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/NavigableMap;)V

    return-object v0

    .line 936
    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    .line 937
    new-instance v0, Ll/۬᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Ll/۬᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/SortedMap;)V

    return-object v0

    .line 939
    :cond_1
    new-instance v0, Ll/֨᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Ll/֨᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/Map;)V

    return-object v0
.end method

.method public final ۙ(Ljava/util/Map;)V
    .locals 2

    .line 133
    iput-object p1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    const/4 v0, 0x0

    .line 134
    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    .line 135
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 136
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ll/ۨۙܽ;->ۙ(Z)V

    .line 137
    iget v1, p0, Ll/ᩴᩴܽ;->۟:I

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Ll/ᩴᩴܽ;->۟:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۙ(Ljava/lang/Number;Ljava/lang/Object;)Z
    .locals 2

    .line 194
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 171
    invoke-virtual {p0}, Ll/ᩴᩴܽ;->۫()Ljava/util/Collection;

    move-result-object v0

    .line 197
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 198
    iget p2, p0, Ll/ᩴᩴܽ;->۟:I

    add-int/2addr p2, v1

    iput p2, p0, Ll/ᩴᩴܽ;->۟:I

    .line 199
    iget-object p2, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    .line 202
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "New Collection violated the Collection spec"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 204
    :cond_1
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 205
    iget p1, p0, Ll/ᩴᩴܽ;->۟:I

    add-int/2addr p1, v1

    iput p1, p0, Ll/ᩴᩴܽ;->۟:I

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final ۚ()Ljava/util/Map;
    .locals 2

    .line 1291
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    instance-of v1, v0, Ljava/util/NavigableMap;

    if-eqz v1, :cond_0

    .line 1292
    new-instance v0, Ll/ۡ᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    check-cast v1, Ljava/util/NavigableMap;

    invoke-direct {v0, p0, v1}, Ll/ۡ᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/NavigableMap;)V

    return-object v0

    .line 1293
    :cond_0
    instance-of v0, v0, Ljava/util/SortedMap;

    if-eqz v0, :cond_1

    .line 1294
    new-instance v0, Ll/ۜ᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    check-cast v1, Ljava/util/SortedMap;

    invoke-direct {v0, p0, v1}, Ll/ۜ᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/SortedMap;)V

    return-object v0

    .line 1296
    :cond_1
    new-instance v0, Ll/۟᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Ll/۟᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/Map;)V

    return-object v0
.end method

.method public ۤ()Ljava/util/Set;
    .locals 2

    .line 930
    new-instance v0, Ll/֨᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Ll/֨᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/Map;)V

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 182
    iget v0, p0, Ll/ᩴᩴܽ;->۟:I

    return v0
.end method

.method public abstract ۫()Ljava/util/Collection;
.end method

.method public final ܳ()Ljava/util/Map;
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    return-object v0
.end method

.method public ᩷()Ljava/util/Map;
    .locals 2

    .line 1287
    new-instance v0, Ll/۟᩸ܽ;

    iget-object v1, p0, Ll/ᩴᩴܽ;->֡:Ljava/util/Map;

    invoke-direct {v0, p0, v1}, Ll/۟᩸ܽ;-><init>(Ll/ᩴᩴܽ;Ljava/util/Map;)V

    return-object v0
.end method

.method public final ᩸()Ljava/util/Collection;
    .locals 1

    .line 1219
    new-instance v0, Ll/۫ᩴܽ;

    invoke-direct {v0, p0}, Ll/۫ᩴܽ;-><init>(Ll/ᩴᩴܽ;)V

    return-object v0
.end method
