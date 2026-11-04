.class public final Ll/ۤۤۚ;
.super Ljava/lang/Object;
.source "56BZ"


# static fields
.field public static final ܺ:Ljava/lang/ThreadLocal;

.field public static final ܽ:Ll/ۤۤۚ;


# instance fields
.field public ֫:J

.field public final ۙ:Ljava/util/TreeMap;

.field public final ۚ:Ljava/lang/String;

.field public final ۤ:Ll/ܽ᩻ۙ;

.field public ۧ:J

.field public final ۫:I

.field public ܳ:I

.field public final ᩴ:Ljava/util/TreeMap;

.field public final ᩷:I

.field public final ᩸:Ll/ۡ᩻ܳ;

.field public final ᩻:Ljava/util/LinkedHashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Ll/ۤۤۚ;

    new-instance v1, Ll/ۡ᩻ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Ll/ۤۤۚ;-><init>(Ll/ۡ᩻ܳ;)V

    sput-object v0, Ll/ۤۤۚ;->ܽ:Ll/ۤۤۚ;

    .line 28
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Ll/ۡ᩻ܳ;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۤۚ;->ۚ:Ljava/lang/String;

    .line 33
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/ۤۤۚ;->ۙ:Ljava/util/TreeMap;

    .line 34
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/ۤۤۚ;->ᩴ:Ljava/util/TreeMap;

    .line 35
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۤۤۚ;->᩻:Ljava/util/LinkedHashMap;

    .line 36
    new-instance v0, Ll/ܽ᩻ۙ;

    .line 40
    invoke-direct {v0}, Ll/ܺ᩻ۙ;-><init>()V

    .line 36
    iput-object v0, p0, Ll/ۤۤۚ;->ۤ:Ll/ܽ᩻ۙ;

    .line 42
    iput-object p1, p0, Ll/ۤۤۚ;->᩸:Ll/ۡ᩻ܳ;

    const/16 p1, 0x1f4

    .line 43
    iput p1, p0, Ll/ۤۤۚ;->۫:I

    const/high16 p1, 0x200000

    .line 44
    iput p1, p0, Ll/ۤۤۚ;->᩷:I

    return-void
.end method

.method public static ֫()Ll/᩷ۤۚ;
    .locals 4

    .line 120
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_1

    .line 289
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 290
    :try_start_0
    iget-boolean v2, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v2, :cond_0

    iget v2, v1, Ll/ۜ᩷ۚ;->ۗ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v1, Ll/ۜ᩷ۚ;->ۗ:I

    if-nez v2, :cond_0

    .line 291
    sget-object v2, Ll/ۙۤۚ;->۟:Ll/ۙۤۚ;

    iput-object v2, v1, Ll/ۜ᩷ۚ;->ܺ:Ll/ۙۤۚ;

    .line 292
    iget-object v2, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    iget-object v2, v2, Ll/ۤۤۚ;->᩸:Ll/ۡ᩻ܳ;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v1, Ll/ۜ᩷ۚ;->ۨ:J

    .line 293
    iget-object v2, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {v2}, Ll/ۤۤۚ;->ܳ()V

    .line 295
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 122
    :cond_1
    :goto_0
    new-instance v0, Ll/᩷ۤۚ;

    invoke-direct {v0, v1}, Ll/᩷ۤۚ;-><init>(Ll/ۜ᩷ۚ;)V

    return-object v0
.end method

.method public static bridge synthetic ۙ(Ll/ۤۤۚ;)Ljava/util/TreeMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۤۚ;->ۙ:Ljava/util/TreeMap;

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;)V
    .locals 4

    .line 166
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_3

    .line 167
    iget-object v0, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    const-string v2, "mt_apk_build"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x2f

    const/4 v2, 0x1

    .line 0
    invoke-static {v0, v2, p0}, Ll/ܿۘۙ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 169
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 170
    :cond_1
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 171
    :try_start_0
    iget-boolean v3, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v3, :cond_2

    const/16 v3, 0x200

    .line 172
    invoke-static {v3, p0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 173
    iput-boolean v2, v1, Ll/ۜ᩷ۚ;->᩸:Z

    .line 174
    iget-object p0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    .line 176
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_3
    :goto_0
    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 154
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_2

    .line 155
    iget-object v0, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    const-string v2, "mt_apk_resource_delete"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 157
    :try_start_0
    iget-boolean v2, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v2, :cond_1

    .line 158
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 159
    iget-object p0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    .line 161
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 204
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 206
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move-object p1, p2

    :cond_2
    const/16 v0, 0x100

    invoke-static {v0, p1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 207
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 208
    :try_start_0
    iget-object v2, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    iget-object v2, v2, Ll/ۤۤۚ;->᩻:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, p0, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    :goto_0
    iget-object v2, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    iget-object v2, v2, Ll/ۤۤۚ;->᩻:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    move-result v2

    const/16 v3, 0x1f4

    if-le v2, v3, :cond_3

    .line 210
    iget-object v2, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    iget-object v2, v2, Ll/ۤۤۚ;->᩻:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 212
    :cond_3
    invoke-virtual {v1, p1, p2}, Ll/ۜ᩷ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    iget-object v2, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    iget-object v2, v2, Ll/ۤۤۚ;->ۙ:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩷ۚ;

    .line 215
    iget-object v4, v3, Ll/ۜ᩷ۚ;->᩺:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 216
    invoke-virtual {v3, p1, p2}, Ll/ۜ᩷ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 219
    :cond_5
    iget-object p0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    .line 220
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۙ(Ljava/util/concurrent/Semaphore;)V
    .locals 3

    const-wide/16 v0, 0x0

    .line 112
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, v2}, Ljava/util/concurrent/Semaphore;->tryAcquire(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 113
    :cond_0
    invoke-static {}, Ll/ۤۤۚ;->֫()Ll/᩷ۤۚ;

    move-result-object v0

    .line 114
    :try_start_0
    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->acquire()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    invoke-virtual {v0}, Ll/᩷ۤۚ;->close()V

    return-void

    :catchall_0
    move-exception p0

    .line 113
    :try_start_1
    invoke-virtual {v0}, Ll/᩷ۤۚ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method

.method public static ۙ(Ljava/util/concurrent/locks/ReentrantLock;)V
    .locals 4

    const/4 v0, 0x0

    .line 95
    :goto_0
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ljava/util/concurrent/locks/ReentrantLock;->tryLock(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 102
    :cond_0
    :try_start_1
    invoke-static {}, Ll/ۤۤۚ;->֫()Ll/᩷ۤۚ;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 103
    :try_start_2
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 104
    :try_start_3
    invoke-virtual {v1}, Ll/᩷ۤۚ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v0, :cond_1

    .line 106
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    return-void

    :catchall_0
    move-exception p0

    .line 102
    :try_start_4
    invoke-virtual {v1}, Ll/᩷ۤۚ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    :try_start_5
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p0

    if-eqz v0, :cond_2

    .line 106
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 107
    :cond_2
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static bridge synthetic ۙ(Ll/ۤۤۚ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۤۤۚ;->ܳ:I

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ۤۤۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    return-void
.end method

.method public static ۚ()Z
    .locals 3

    .line 195
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 197
    :cond_0
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 198
    :try_start_0
    iget-object v1, v1, Ll/ۜ᩷ۚ;->ۙ:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const/4 v2, 0x1

    :cond_2
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    .line 199
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static bridge synthetic ۤ(Ll/ۤۤۚ;)Ljava/util/function/LongSupplier;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۤۚ;->᩸:Ll/ۡ᩻ܳ;

    return-object p0
.end method

.method public static ۤ(Ljava/lang/String;)V
    .locals 4

    .line 181
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_2

    .line 182
    iget-object v0, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    const-string v2, "mt_apk_install"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 183
    :cond_0
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 184
    :try_start_0
    iget-boolean v2, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v2, :cond_1

    .line 185
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v3, "path"

    invoke-virtual {v2, v3, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 186
    iget-object v2, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    invoke-static {p0, v2}, Ll/ۜᩴۚ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 187
    iget-object v2, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    invoke-static {p0, v2}, Ll/ۜᩴۚ;->ܳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ᩷ۚ;->᩷:Ljava/lang/String;

    .line 188
    iget-object p0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    .line 190
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۫(Ll/ۤۤۚ;)Ljava/util/LinkedHashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۤۚ;->᩻:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method public static ۫()Ll/ۤۤۚ;
    .locals 1

    .line 48
    sget-object v0, Ll/ۤۤۚ;->ܽ:Ll/ۤۤۚ;

    return-object v0
.end method

.method public static bridge synthetic ܳ(Ll/ۤۤۚ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۤۚ;->۫:I

    return p0
.end method

.method private ܳ()V
    .locals 4

    .line 85
    iget-wide v0, p0, Ll/ۤۤۚ;->֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۤۤۚ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Ll/ۤۤۚ;->ۤ:Ll/ܽ᩻ۙ;

    invoke-virtual {v1, v0}, Ll/ܽ᩻ۙ;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۤۤۚ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۤۚ;->ܳ:I

    return p0
.end method

.method public static bridge synthetic ᩴ()Ljava/lang/ThreadLocal;
    .locals 1

    .line 0
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method public static bridge synthetic ᩷(Ll/ۤۤۚ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۤۚ;->᩷:I

    return p0
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 3

    .line 140
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_2

    .line 141
    iget-object v0, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    const-string v2, "mt_apk_continue"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 143
    :try_start_0
    iget-boolean v2, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v2, :cond_1

    .line 144
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->ܶ(Lbin/mt/json/JSONObject;Ljava/lang/String;)I

    move-result v2

    iput v2, v1, Ll/ۜ᩷ۚ;->ܶ:I

    .line 145
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->ܽ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    .line 146
    invoke-static {p0, p1}, Ll/ۜᩴۚ;->ܳ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ll/ۜ᩷ۚ;->᩷:Ljava/lang/String;

    .line 147
    iget-object p0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    .line 149
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static ᩷(Ljava/lang/String;)V
    .locals 3

    .line 127
    sget-object v0, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_2

    .line 128
    iget-object v0, v1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    const-string v2, "mt_apk_continue"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 129
    :cond_0
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 130
    :try_start_0
    invoke-static {p0}, Ll/ۜᩴۚ;->۫(Ljava/lang/String;)I

    move-result p0

    .line 131
    iget-boolean v2, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v2, :cond_1

    if-eqz p0, :cond_1

    iget v2, v1, Ll/ۜ᩷ۚ;->ܶ:I

    if-eq v2, p0, :cond_1

    .line 132
    iput p0, v1, Ll/ۜ᩷ۚ;->ܶ:I

    .line 133
    iget-object p0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V

    .line 135
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ۤۤۚ;)Ljava/util/TreeMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۤۚ;->ᩴ:Ljava/util/TreeMap;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ll/ۜ᩷ۚ;
    .locals 10

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 77
    :try_start_0
    new-instance v9, Ll/ۜ᩷ۚ;

    iget-wide v1, p0, Ll/ۤۤۚ;->ۧ:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Ll/ۤۤۚ;->ۧ:J

    iget-object v1, p0, Ll/ۤۤۚ;->᩸:Ll/ۡ᩻ܳ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v7

    move-object v1, v9

    move-object v2, p0

    move-object v5, p2

    move-object v6, p1

    invoke-direct/range {v1 .. v8}, Ll/ۜ᩷ۚ;-><init>(Ll/ۤۤۚ;JLjava/lang/String;Lbin/mt/json/JSONObject;J)V

    .line 78
    iget-object p1, p0, Ll/ۤۤۚ;->ۙ:Ljava/util/TreeMap;

    iget-wide v1, v9, Ll/ۜ᩷ۚ;->۫:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p1, p2, v9}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object p1, Ll/ۤۤۚ;->ܺ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, v9}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 80
    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    monitor-exit v0

    return-object v9

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ()Ll/ܽ᩻ۙ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۤۤۚ;->ۤ:Ll/ܽ᩻ۙ;

    return-object v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/ۤۤۚ;->ۚ:Ljava/lang/String;

    return-object v0
.end method

.method public final declared-synchronized ᩷()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 70
    :try_start_0
    iget-object v1, p0, Ll/ۤۤۚ;->ᩴ:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    .line 71
    :cond_0
    :try_start_1
    iget-object v1, p0, Ll/ۤۤۚ;->ᩴ:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->clear()V

    const/4 v1, 0x0

    .line 72
    iput v1, p0, Ll/ۤۤۚ;->ܳ:I

    .line 73
    invoke-direct {p0}, Ll/ۤۤۚ;->ܳ()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩸()Ljava/util/ArrayList;
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 63
    :try_start_0
    new-instance v1, Ljava/util/TreeMap;

    iget-object v2, p0, Ll/ۤۤۚ;->ᩴ:Ljava/util/TreeMap;

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/SortedMap;)V

    .line 64
    iget-object v2, p0, Ll/ۤۤۚ;->ۙ:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜ᩷ۚ;

    iget-wide v4, v3, Ll/ۜ᩷ۚ;->۫:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    new-instance v5, Ll/۬᩷ۚ;

    invoke-direct {v5, v3}, Ll/۬᩷ۚ;-><init>(Ll/ۜ᩷ۚ;)V

    invoke-virtual {v1, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 65
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
