.class public final Ll/֡ۘۗ;
.super Ljava/lang/Object;
.source "O6I5"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ۠:Ll/᩻ܽ᩺;


# instance fields
.field public final ֡:Ljava/util/ArrayList;

.field public final ֨:Ljava/util/ArrayList;

.field public ۖ:Ll/֫ۖۗ;

.field public final ۟:Ljava/util/HashMap;

.field public final ۡ:Ll/ᩳۚ᩵;

.field public ۢ:Ll/ۙ֫᩵;

.field public final ܰ:Ll/ۛۘۗ;

.field public ܿ:Z

.field public ᩳ:Ll/۠ۚ᩵;

.field public final ᩶:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 56
    const-class v0, Ll/֡ۘۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/֡ۘۗ;->۠:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 76
    new-instance v0, Ll/ۛۘۗ;

    invoke-direct {v0}, Ll/ۛۘۗ;-><init>()V

    invoke-direct {p0, v0}, Ll/֡ۘۗ;-><init>(Ll/ۛۘۗ;)V

    return-void
.end method

.method public constructor <init>(Ll/ۛۘۗ;)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ۘۗ;->֨:Ljava/util/ArrayList;

    .line 67
    new-instance v0, Ll/ۗ֫᩵;

    invoke-direct {v0}, Ll/ۗ֫᩵;-><init>()V

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ۘۗ;->֡:Ljava/util/ArrayList;

    .line 70
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/֡ۘۗ;->۟:Ljava/util/HashMap;

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡ۘۗ;->᩶:Ljava/util/ArrayList;

    .line 73
    new-instance v0, Ll/۠ۚ᩵;

    invoke-direct {v0}, Ll/۠ۚ᩵;-><init>()V

    iput-object v0, p0, Ll/֡ۘۗ;->ᩳ:Ll/۠ۚ᩵;

    .line 80
    iput-object p1, p0, Ll/֡ۘۗ;->ܰ:Ll/ۛۘۗ;

    .line 81
    new-instance v0, Ll/ᩳۚ᩵;

    invoke-direct {v0, p1}, Ll/ᩳۚ᩵;-><init>(Ll/ۛۘۗ;)V

    iput-object v0, p0, Ll/֡ۘۗ;->ۡ:Ll/ᩳۚ᩵;

    return-void
.end method

.method public static ۙ(Ljava/util/ArrayList;Ljava/util/Set;)V
    .locals 5

    .line 188
    :try_start_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/Closeable;

    .line 189
    invoke-interface {p1, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    goto :goto_0

    .line 193
    :cond_0
    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 195
    :try_start_2
    sget-object v3, Ll/֡ۘۗ;->۠:Ll/᩻ܽ᩺;

    const-string v4, "Fail to close \'{}\'"

    invoke-interface {v3, v4, v1, v2}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 199
    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 200
    throw p1
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 156
    :try_start_0
    iget-boolean v1, p0, Ll/֡ۘۗ;->ܿ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    .line 157
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 217
    :try_start_1
    iget-object v2, p0, Ll/֡ۘۗ;->ۡ:Ll/ᩳۚ᩵;

    invoke-virtual {v2}, Ll/ᩳۚ᩵;->᩷()V

    const/4 v2, 0x0

    .line 149
    iput-object v2, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    .line 151
    iget-object v2, p0, Ll/֡ۘۗ;->ᩳ:Ll/۠ۚ᩵;

    invoke-virtual {v2}, Ll/۠ۚ᩵;->ۙ()V

    .line 161
    new-instance v2, Ljava/util/IdentityHashMap;

    invoke-direct {v2}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {v2}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v2

    .line 162
    iget-object v3, p0, Ll/֡ۘۗ;->֨:Ljava/util/ArrayList;

    invoke-static {v3, v2}, Ll/֡ۘۗ;->ۙ(Ljava/util/ArrayList;Ljava/util/Set;)V

    .line 163
    iget-object v3, p0, Ll/֡ۘۗ;->֡:Ljava/util/ArrayList;

    invoke-static {v3, v2}, Ll/֡ۘۗ;->ۙ(Ljava/util/ArrayList;Ljava/util/Set;)V

    .line 164
    iget-object v3, p0, Ll/֡ۘۗ;->᩶:Ljava/util/ArrayList;

    invoke-static {v3, v2}, Ll/֡ۘۗ;->ۙ(Ljava/util/ArrayList;Ljava/util/Set;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 166
    :try_start_2
    iput-boolean v1, p0, Ll/֡ۘۗ;->ܿ:Z

    .line 167
    iget-object v1, p0, Ll/֡ۘۗ;->ۢ:Ll/ۙ֫᩵;

    if-eqz v1, :cond_1

    .line 168
    invoke-virtual {v1}, Ll/ۙ֫᩵;->close()V

    .line 170
    :cond_1
    iget-object v1, p0, Ll/֡ۘۗ;->ܰ:Ll/ۛۘۗ;

    invoke-virtual {v1}, Ll/ۛۘۗ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 172
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    .line 166
    :try_start_3
    iput-boolean v1, p0, Ll/֡ۘۗ;->ܿ:Z

    .line 167
    iget-object v1, p0, Ll/֡ۘۗ;->ۢ:Ll/ۙ֫᩵;

    if-eqz v1, :cond_2

    .line 168
    invoke-virtual {v1}, Ll/ۙ֫᩵;->close()V

    .line 170
    :cond_2
    iget-object v1, p0, Ll/֡ۘۗ;->ܰ:Ll/ۛۘۗ;

    invoke-virtual {v1}, Ll/ۛۘۗ;->close()V

    .line 171
    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 236
    sget v0, Ll/ۢܿۗ;->ۙ:I

    const-string v0, "jadx decompiler dev-fc9688ef483d-mt"

    return-object v0
.end method

.method public final declared-synchronized ۙ(Ll/ۖۡۗ;)Ll/֨ۘۗ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 318
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۛۙ()Ll/֨ۘۗ;

    move-result-object v1

    if-nez v1, :cond_0

    .line 320
    new-instance v1, Ll/֨ۘۗ;

    invoke-virtual {p1}, Ll/ۖۡۗ;->ܿۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/֡ۘۗ;->ۙ(Ll/᩻ۡۗ;)Ll/ᩳۘۗ;

    invoke-direct {v1, p1}, Ll/֨ۘۗ;-><init>(Ll/ۖۡۗ;)V

    .line 321
    invoke-virtual {p1, v1}, Ll/ۖۡۗ;->ۙ(Ll/֨ۘۗ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 323
    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ()Ll/ۛۘۗ;
    .locals 1

    .line 476
    iget-object v0, p0, Ll/֡ۘۗ;->ܰ:Ll/ۛۘۗ;

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)Ll/ᩳۘۗ;
    .locals 3

    .line 287
    iget-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    .line 349
    invoke-virtual {v0}, Ll/֫ۖۗ;->ۜ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۘۘۗ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1}, Ll/ۘۘۗ;-><init>(ILjava/lang/Object;)V

    .line 350
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p1

    .line 351
    invoke-interface {p1}, Ll/᩵ܺۗ;->findFirst()Ll/ܶۚۗ;

    move-result-object p1

    new-instance v0, Ll/ܰۘۗ;

    invoke-direct {v0, p0}, Ll/ܰۘۗ;-><init>(Ll/֡ۘۗ;)V

    .line 352
    invoke-virtual {p1, v0}, Ll/ܶۚۗ;->map(Ljava/util/function/Function;)Ll/ܶۚۗ;

    move-result-object p1

    const/4 v0, 0x0

    .line 353
    invoke-virtual {p1, v0}, Ll/ܶۚۗ;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۘۗ;

    return-object p1
.end method

.method public final declared-synchronized ۙ(Ll/᩻ۡۗ;)Ll/ᩳۘۗ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 295
    :try_start_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۛۙ()Ll/ᩳۘۗ;

    move-result-object v1

    if-nez v1, :cond_1

    .line 297
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۜۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 298
    new-instance v1, Ll/ᩳۘۗ;

    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩶ۙ()Ll/᩻ۡۗ;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/֡ۘۗ;->ۙ(Ll/᩻ۡۗ;)Ll/ᩳۘۗ;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ll/ᩳۘۗ;-><init>(Ll/᩻ۡۗ;Ll/ᩳۘۗ;)V

    goto :goto_0

    .line 299
    :cond_0
    new-instance v1, Ll/ᩳۘۗ;

    invoke-direct {v1, p1, p0}, Ll/ᩳۘۗ;-><init>(Ll/᩻ۡۗ;Ll/֡ۘۗ;)V

    .line 300
    :goto_0
    invoke-virtual {p1, v1}, Ll/᩻ۡۗ;->ۙ(Ll/ᩳۘۗ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/ۚ᩻᩵;)V
    .locals 1

    .line 496
    iget-object v0, p0, Ll/֡ۘۗ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final declared-synchronized ۤ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 177
    :try_start_0
    iget-boolean v1, p0, Ll/֡ۘۗ;->ܿ:Z

    if-nez v1, :cond_1

    .line 180
    iget-object v1, p0, Ll/֡ۘۗ;->ۢ:Ll/ۙ֫᩵;

    if-nez v1, :cond_0

    .line 181
    new-instance v1, Ll/ۙ֫᩵;

    iget-object v2, p0, Ll/֡ۘۗ;->ܰ:Ll/ۛۘۗ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 181
    iput-object v1, p0, Ll/֡ۘۗ;->ۢ:Ll/ۙ֫᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    :cond_0
    monitor-exit v0

    return-void

    .line 178
    :cond_1
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Decompiler is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 183
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܳ()V
    .locals 10

    .line 85
    invoke-virtual {p0}, Ll/֡ۘۗ;->ۤ()V

    .line 217
    iget-object v0, p0, Ll/֡ۘۗ;->ۡ:Ll/ᩳۚ᩵;

    invoke-virtual {v0}, Ll/ᩳۚ᩵;->᩷()V

    const/4 v1, 0x0

    .line 149
    iput-object v1, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    .line 151
    iget-object v1, p0, Ll/֡ۘۗ;->ᩳ:Ll/۠ۚ᩵;

    invoke-virtual {v1}, Ll/۠ۚ᩵;->ۙ()V

    .line 87
    invoke-static {p0}, Ll/᩺ۘۗ;->ۙ(Ll/֡ۘۗ;)V

    const-string v1, "loading ..."

    .line 88
    sget-object v2, Ll/֡ۘۗ;->۠:Ll/᩻ܽ᩺;

    invoke-interface {v2, v1}, Ll/᩻ܽ᩺;->ۤ(Ljava/lang/String;)V

    .line 204
    iget-object v1, p0, Ll/֡ۘۗ;->ܰ:Ll/ۛۘۗ;

    invoke-virtual {v1}, Ll/ۛۘۗ;->᩵()Ll/ܳܿۗ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ᩳۚ᩵;->ۙ(Ll/ܳܿۗ;)V

    .line 205
    invoke-interface {v2}, Ll/᩻ܽ᩺;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "Resolved plugins: {}"

    .line 206
    invoke-virtual {v0}, Ll/ᩳۚ᩵;->ۙ()Ljava/util/TreeSet;

    move-result-object v4

    invoke-interface {v2, v4, v3}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    :cond_0
    invoke-virtual {v0, p0}, Ll/ᩳۚ᩵;->ۙ(Ll/֡ۘۗ;)V

    .line 209
    invoke-interface {v2}, Ll/᩻ܽ᩺;->ۙ()Z

    move-result v3

    iget-object v4, p0, Ll/֡ۘۗ;->۟:Ljava/util/HashMap;

    if-eqz v3, :cond_1

    .line 210
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v3

    new-instance v5, Ll/ۘۜۧ;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Ll/ۘۜۧ;-><init>(I)V

    invoke-interface {v3, v5}, Ll/᩵ܺۗ;->flatMap(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v3

    new-instance v5, Ll/᩶ۘۗ;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ll/᩶ۘۗ;-><init>(I)V

    .line 211
    invoke-interface {v3, v5}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v3

    invoke-static {}, Ll/֫ܺۗ;->toList()Ll/ۚܺۗ;

    move-result-object v5

    invoke-interface {v3, v5}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 212
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Loaded custom passes: {} {}"

    invoke-interface {v2, v6, v5, v3}, Ll/᩻ܽ᩺;->ۙ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    :cond_1
    iget-object v3, p0, Ll/֡ۘۗ;->֨:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 123
    invoke-virtual {v1}, Ll/ۛۘۗ;->᩹()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v5, Ll/ܿۘۗ;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Ll/ܿۘۗ;-><init>(I)V

    invoke-static {v1, v5}, Ll/ۘۧ᩵;->ۙ(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    move-result-object v1

    .line 125
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 126
    invoke-virtual {v0}, Ll/ᩳۚ᩵;->ۙ()Ljava/util/TreeSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۖۚ᩵;

    .line 127
    invoke-virtual {v7}, Ll/ۖۚ᩵;->ᩴ()Ll/֨ۚ᩵;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 129
    invoke-virtual {v7}, Ll/֨ۚ᩵;->ۙ()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܰܰۗ;

    .line 131
    :try_start_0
    invoke-interface {v8, v1}, Ll/ܰܰۗ;->ۙ(Ljava/util/List;)Ll/ۘܰۗ;

    move-result-object v8

    .line 132
    invoke-interface {v8}, Ll/ۘܰۗ;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_3

    .line 133
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 136
    new-instance v1, Ll/۠ۧ᩵;

    const-string v2, "Failed to load DEX input"

    .line 15
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 136
    throw v1

    .line 141
    :cond_4
    iget-object v0, p0, Ll/֡ۘۗ;->֡:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 142
    invoke-interface {v2}, Ll/᩻ܽ᩺;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 143
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v5, "Loaded using {} inputs plugin in {} ms"

    invoke-interface {v2, v5, v0, v1}, Ll/᩻ܽ᩺;->ۙ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    :cond_5
    new-instance v0, Ll/֫ۖۗ;

    invoke-direct {v0, p0}, Ll/֫ۖۗ;-><init>(Ll/֡ۘۗ;)V

    iput-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    .line 116
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘܰۗ;

    .line 117
    new-instance v5, Ll/᩸۫᩸;

    const/4 v6, 0x2

    invoke-direct {v5, v6, v0}, Ll/᩸۫᩸;-><init>(ILjava/lang/Object;)V

    invoke-interface {v3, v5}, Ll/ۘܰۗ;->ۙ(Ll/᩸۫᩸;)V

    goto :goto_1

    .line 95
    :cond_6
    iget-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۖ()V

    .line 96
    iget-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->ۗۙ()V

    .line 98
    iget-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    invoke-virtual {v0, v4}, Ll/֫ۖۗ;->ۙ(Ljava/util/HashMap;)V

    .line 99
    iget-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->᩺ۙ()V

    .line 100
    iget-object v0, p0, Ll/֡ۘۗ;->ۖ:Ll/֫ۖۗ;

    invoke-virtual {v0}, Ll/֫ۖۗ;->᩵ۙ()V

    const-string v0, "Load finished"

    .line 221
    invoke-interface {v2, v0}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;)V

    .line 222
    sget-object v0, Ll/᩹ܿۗ;->ۙ:Ll/᩵ܿۗ;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_7

    .line 224
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽܿۗ;

    .line 225
    check-cast v1, Ll/᩹ܿۗ;

    invoke-interface {v1}, Ll/᩹ܿۗ;->init()V

    goto :goto_2

    :cond_7
    return-void
.end method

.method public final ᩷()Ljava/util/ArrayList;
    .locals 1

    .line 500
    iget-object v0, p0, Ll/֡ۘۗ;->֡:Ljava/util/ArrayList;

    return-object v0
.end method
