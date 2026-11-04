.class public final Ll/ۘ᩹ۚ;
.super Ljava/lang/Object;
.source "J6BV"


# static fields
.field public static final ܳ:Ll/ۘ᩹ۚ;

.field public static final ᩴ:J


# instance fields
.field public ۙ:Ll/᩺᩹ۚ;

.field public final ۤ:Ll/ۤۢ᩸;

.field public final ᩷:Ljava/lang/Object;

.field public final ᩸:Ljava/util/ArrayDeque;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 12
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ll/ۘ᩹ۚ;->ᩴ:J

    .line 13
    new-instance v0, Ll/ۘ᩹ۚ;

    new-instance v1, Ll/ۤۢ᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Ll/ۘ᩹ۚ;-><init>(Ll/ۤۢ᩸;)V

    sput-object v0, Ll/ۘ᩹ۚ;->ܳ:Ll/ۘ᩹ۚ;

    return-void
.end method

.method public constructor <init>(Ll/ۤۢ᩸;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۘ᩹ۚ;->᩷:Ljava/lang/Object;

    .line 15
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۘ᩹ۚ;->᩸:Ljava/util/ArrayDeque;

    .line 21
    iput-object p1, p0, Ll/ۘ᩹ۚ;->ۤ:Ll/ۤۢ᩸;

    return-void
.end method

.method public static ۙ(Ljava/lang/String;)Ll/᩺᩹ۚ;
    .locals 10

    .line 26
    sget-object v1, Ll/ۘ᩹ۚ;->ܳ:Ll/ۘ᩹ۚ;

    .line 31
    iget-object v0, v1, Ll/ۘ᩹ۚ;->᩷:Ljava/lang/Object;

    monitor-enter v0

    .line 32
    :try_start_0
    iget-object v2, v1, Ll/ۘ᩹ۚ;->ۤ:Ll/ۤۢ᩸;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 33
    iget-object v4, v1, Ll/ۘ᩹ۚ;->᩸:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->peekLast()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛ᩹ۚ;

    if-eqz v4, :cond_0

    .line 34
    iget-wide v5, v4, Ll/ۛ᩹ۚ;->ۙ:J

    sub-long v5, v2, v5

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-ltz v9, :cond_1

    .line 35
    :cond_0
    new-instance v4, Ll/ۛ᩹ۚ;

    sget-wide v5, Ll/ۘ᩹ۚ;->ᩴ:J

    add-long/2addr v2, v5

    invoke-direct {v4, v2, v3}, Ll/ۛ᩹ۚ;-><init>(J)V

    .line 36
    iget-object v2, v1, Ll/ۘ᩹ۚ;->᩸:Ljava/util/ArrayDeque;

    invoke-virtual {v2, v4}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 38
    :cond_1
    new-instance v2, Ll/᩺᩹ۚ;

    const-string v3, "dex_names"

    .line 52
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "files"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "resource_table_"

    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 38
    :goto_1
    invoke-direct {v2, v1, v4, p0}, Ll/᩺᩹ۚ;-><init>(Ll/ۘ᩹ۚ;Ll/ۛ᩹ۚ;Z)V

    .line 39
    iget-object p0, v4, Ll/ۛ᩹ۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object p0, v1, Ll/ۘ᩹ۚ;->᩷:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :try_start_1
    invoke-static {v2}, Ll/᩺᩹ۚ;->᩷(Ll/᩺᩹ۚ;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object v2

    :catch_0
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    .line 46
    :goto_2
    invoke-virtual {v2}, Ll/᩺᩹ۚ;->close()V

    .line 47
    throw p0

    :catchall_0
    move-exception p0

    .line 41
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ۙ(Ll/ۘ᩹ۚ;)Ll/᩺᩹ۚ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩹ۚ;->ۙ:Ll/᩺᩹ۚ;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ۘ᩹ۚ;)Ljava/util/function/LongSupplier;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩹ۚ;->ۤ:Ll/ۤۢ᩸;

    return-object p0
.end method

.method public static ܳ(Ll/ۘ᩹ۚ;)V
    .locals 6

    .line 57
    iget-object v0, p0, Ll/ۘ᩹ۚ;->᩸:Ljava/util/ArrayDeque;

    iget-object v1, p0, Ll/ۘ᩹ۚ;->ۙ:Ll/᩺᩹ۚ;

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩹ۚ;

    .line 59
    iget-object v1, p0, Ll/ۘ᩹ۚ;->ۤ:Ll/ۤۢ᩸;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iget-wide v3, v0, Ll/ۛ᩹ۚ;->ۙ:J

    iget-object v0, v0, Ll/ۛ᩹ۚ;->᩷:Ljava/util/ArrayList;

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gez v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺᩹ۚ;

    .line 61
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺᩹ۚ;

    .line 62
    invoke-static {v2}, Ll/᩺᩹ۚ;->ۙ(Ll/᩺᩹ۚ;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v1, v2

    .line 67
    :cond_3
    iput-object v1, p0, Ll/ۘ᩹ۚ;->ۙ:Ll/᩺᩹ۚ;

    .line 68
    iget-object p0, p0, Ll/ۘ᩹ۚ;->᩷:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    :cond_4
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۘ᩹ۚ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۘ᩹ۚ;->ۙ:Ll/᩺᩹ۚ;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۘ᩹ۚ;)Ljava/lang/Object;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩹ۚ;->᩷:Ljava/lang/Object;

    return-object p0
.end method

.method public static bridge synthetic ᩸(Ll/ۘ᩹ۚ;)Ljava/util/ArrayDeque;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘ᩹ۚ;->᩸:Ljava/util/ArrayDeque;

    return-object p0
.end method
