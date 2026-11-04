.class public Ll/֨ۗ;
.super Ljava/lang/Object;
.source "Q57Q"


# instance fields
.field public ۙ:I

.field public final ۤ:Ll/۬ۗ;

.field public ܳ:I

.field public ᩴ:I

.field public final ᩷:Ll/ۨۤۤ;

.field public ᩸:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Ll/֨ۗ;->᩸:I

    if-lez p1, :cond_0

    .line 43
    new-instance p1, Ll/۬ۗ;

    invoke-direct {p1}, Ll/۬ۗ;-><init>()V

    iput-object p1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    .line 44
    new-instance p1, Ll/ۨۤۤ;

    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    return-void

    .line 40
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "maxSize <= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final ۤ(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 229
    invoke-virtual {p0, p1, p2}, Ll/֨ۗ;->᩷(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    .line 230
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Negative size: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const-string v1, "LruCache[maxSize="

    .line 308
    iget-object v0, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    .line 26
    monitor-enter v0

    .line 309
    :try_start_0
    iget v2, p0, Ll/֨ۗ;->ۙ:I

    iget v3, p0, Ll/֨ۗ;->ᩴ:I

    add-int/2addr v3, v2

    if-eqz v3, :cond_0

    mul-int/lit8 v2, v2, 0x64

    .line 311
    div-int/2addr v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 316
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/֨ۗ;->᩸:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",hits="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֨ۗ;->ۙ:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",misses="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/֨ۗ;->ᩴ:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ",hitRate="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "%]"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۙ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    .line 26
    monitor-enter v0

    .line 79
    :try_start_0
    iget-object v1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v1, p1}, Ll/۬ۗ;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 81
    iget v1, p0, Ll/֨ۗ;->ۙ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֨ۗ;->ۙ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    monitor-exit v0

    return-object p1

    .line 84
    :cond_0
    :try_start_1
    iget p1, p0, Ll/֨ۗ;->ᩴ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/֨ۗ;->ᩴ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    monitor-exit v0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    .line 11
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    .line 26
    monitor-enter v0

    .line 124
    :try_start_0
    iget v1, p0, Ll/֨ۗ;->ܳ:I

    invoke-direct {p0, p1, p2}, Ll/֨ۗ;->ۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v1, v2

    iput v1, p0, Ll/֨ۗ;->ܳ:I

    .line 125
    iget-object v1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v1, p1, p2}, Ll/۬ۗ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 127
    iget v1, p0, Ll/֨ۗ;->ܳ:I

    invoke-direct {p0, p1, p2}, Ll/֨ۗ;->ۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr v1, p1

    iput v1, p0, Ll/֨ۗ;->ܳ:I

    .line 129
    :cond_0
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    monitor-exit v0

    .line 135
    iget p1, p0, Ll/֨ۗ;->᩸:I

    invoke-virtual {p0, p1}, Ll/֨ۗ;->ۙ(I)V

    return-object p2

    :catchall_0
    move-exception p1

    .line 26
    monitor-exit v0

    throw p1
.end method

.method public final ۙ()Ljava/util/LinkedHashMap;
    .locals 5

    .line 298
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 299
    iget-object v0, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    .line 26
    monitor-enter v0

    .line 300
    :try_start_0
    iget-object v2, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v2}, Ll/۬ۗ;->ۙ()Ljava/util/Set;

    move-result-object v2

    .line 413
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 300
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 301
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 303
    :cond_0
    sget-object v2, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۙ(I)V
    .locals 4

    .line 151
    :goto_0
    iget-object v0, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    .line 26
    monitor-enter v0

    .line 152
    :try_start_0
    iget v1, p0, Ll/֨ۗ;->ܳ:I

    if-ltz v1, :cond_7

    iget-object v1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v1}, Ll/۬ۗ;->᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Ll/֨ۗ;->ܳ:I

    if-nez v1, :cond_7

    .line 156
    :cond_0
    iget v1, p0, Ll/֨ۗ;->ܳ:I

    if-le v1, p1, :cond_6

    iget-object v1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v1}, Ll/۬ۗ;->᩷()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_3

    .line 160
    :cond_1
    iget-object v1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v1}, Ll/۬ۗ;->ۙ()Ljava/util/Set;

    move-result-object v1

    .line 270
    instance-of v2, v1, Ljava/util/List;

    if-eqz v2, :cond_3

    .line 271
    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    .line 274
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_2

    .line 277
    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 278
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    :goto_1
    const/4 v1, 0x0

    goto :goto_2

    .line 280
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 160
    :goto_2
    check-cast v1, Ljava/util/Map$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_5

    monitor-exit v0

    return-void

    .line 162
    :cond_5
    :try_start_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 163
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 164
    iget-object v3, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v3, v2}, Ll/۬ۗ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    iget v3, p0, Ll/֨ۗ;->ܳ:I

    invoke-direct {p0, v2, v1}, Ll/֨ۗ;->ۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    sub-int/2addr v3, v2

    iput v3, p0, Ll/֨ۗ;->ܳ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    monitor-exit v0

    const-string v0, "oldValue"

    .line 169
    invoke-static {v1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 157
    :cond_6
    :goto_3
    monitor-exit v0

    return-void

    :cond_7
    :try_start_2
    const-string p1, "LruCache.sizeOf() is reporting inconsistent results!"

    .line 152
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    .line 26
    monitor-exit v0

    throw p1
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "key"

    .line 0
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p2, p1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩷(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "key"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Ll/֨ۗ;->᩷:Ll/ۨۤۤ;

    .line 26
    monitor-enter v0

    .line 181
    :try_start_0
    iget-object v1, p0, Ll/֨ۗ;->ۤ:Ll/۬ۗ;

    invoke-virtual {v1, p1}, Ll/۬ۗ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 183
    iget v2, p0, Ll/֨ۗ;->ܳ:I

    invoke-direct {p0, p1, v1}, Ll/֨ۗ;->ۤ(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr v2, p1

    iput v2, p0, Ll/֨ۗ;->ܳ:I

    .line 185
    :cond_0
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
