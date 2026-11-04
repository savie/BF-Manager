.class public final Ll/᩺᩹ۚ;
.super Ljava/lang/Object;
.source "J6BV"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ֡:Ll/ۘ᩹ۚ;

.field public final ܰ:Ll/ۛ᩹ۚ;

.field public final ܿ:Z

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ۘ᩹ۚ;Ll/ۛ᩹ۚ;Z)V
    .locals 0

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    .line 93
    iput-object p2, p0, Ll/᩺᩹ۚ;->ܰ:Ll/ۛ᩹ۚ;

    .line 94
    iput-boolean p3, p0, Ll/᩺᩹ۚ;->ܿ:Z

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩺᩹ۚ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩺᩹ۚ;->ܿ:Z

    return p0
.end method

.method public static ᩷(Ll/᩺᩹ۚ;)V
    .locals 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 112
    :try_start_0
    iget-object v0, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v0}, Ll/ۘ᩹ۚ;->᩷(Ll/ۘ᩹ۚ;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 114
    :goto_0
    :try_start_1
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ܳ(Ll/ۘ᩹ۚ;)V

    .line 115
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ۙ(Ll/ۘ᩹ۚ;)Ll/᩺᩹ۚ;

    move-result-object v1

    if-ne v1, p0, :cond_2

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    .line 128
    invoke-virtual {v2}, Ll/᩷ۤۚ;->close()V

    :cond_0
    if-eqz v3, :cond_1

    .line 129
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    return-void

    :cond_2
    if-nez v2, :cond_9

    .line 98
    :try_start_2
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ۙ(Ll/ۘ᩹ۚ;)Ll/᩺᩹ۚ;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ۙ(Ll/ۘ᩹ۚ;)Ll/᩺᩹ۚ;

    move-result-object v1

    if-eq v1, p0, :cond_9

    goto :goto_2

    .line 99
    :cond_3
    invoke-static {v1}, Ll/ۘ᩹ۚ;->᩸(Ll/ۘ᩹ۚ;)Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, Ll/᩺᩹ۚ;->ܰ:Ll/ۛ᩹ۚ;

    if-eq v1, v4, :cond_4

    goto :goto_2

    .line 101
    :cond_4
    iget-object v1, v4, Ll/ۛ᩹ۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v4, 0x1

    :cond_5
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺᩹ۚ;

    if-ne v5, p0, :cond_6

    const/4 v4, 0x0

    goto :goto_1

    .line 103
    :cond_6
    iget-boolean v6, p0, Ll/᩺᩹ۚ;->ܿ:Z

    if-nez v6, :cond_7

    iget-boolean v7, v5, Ll/᩺᩹ۚ;->ܿ:Z

    if-nez v7, :cond_8

    :cond_7
    if-eqz v4, :cond_5

    iget-boolean v5, v5, Ll/᩺᩹ۚ;->ܿ:Z

    if-ne v5, v6, :cond_5

    .line 117
    :cond_8
    :goto_2
    invoke-static {}, Ll/ۤۤۚ;->֫()Ll/᩷ۤۚ;

    move-result-object v1

    move-object v2, v1

    .line 118
    :cond_9
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ۙ(Ll/ۘ᩹ۚ;)Ll/᩺᩹ۚ;

    move-result-object v1

    const-wide/16 v4, 0x0

    if-nez v1, :cond_a

    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->᩸(Ll/ۘ᩹ۚ;)Ljava/util/ArrayDeque;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩹ۚ;

    iget-wide v6, v1, Ll/ۛ᩹ۚ;->ۙ:J

    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ۤ(Ll/ۘ᩹ۚ;)Ljava/util/function/LongSupplier;

    move-result-object v1

    check-cast v1, Ll/ۤۢ᩸;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    sub-long/2addr v6, v8

    goto :goto_3

    :cond_a
    move-wide v6, v4

    :goto_3
    cmp-long v1, v6, v4

    if-lez v1, :cond_b

    .line 120
    :try_start_3
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->᩷(Ll/ۘ᩹ۚ;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-virtual {v1, v4, v5}, Ljava/lang/Object;->wait(J)V

    goto/16 :goto_0

    .line 121
    :cond_b
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->᩷(Ll/ۘ᩹ۚ;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    :catch_0
    const/4 v3, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p0

    .line 126
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p0

    move v1, v3

    goto :goto_4

    :catchall_2
    move-exception p0

    :goto_4
    if-eqz v2, :cond_c

    .line 128
    invoke-virtual {v2}, Ll/᩷ۤۚ;->close()V

    :cond_c
    if-eqz v1, :cond_d

    .line 129
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 130
    :cond_d
    throw p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 134
    iget-object v0, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v0}, Ll/ۘ᩹ۚ;->᩷(Ll/ۘ᩹ۚ;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    .line 135
    :try_start_0
    iget-boolean v1, p0, Ll/᩺᩹ۚ;->᩶:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 136
    iput-boolean v1, p0, Ll/᩺᩹ۚ;->᩶:Z

    .line 137
    iget-object v1, p0, Ll/᩺᩹ۚ;->ܰ:Ll/ۛ᩹ۚ;

    iget-object v1, v1, Ll/ۛ᩹ۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 138
    iget-object v1, p0, Ll/᩺᩹ۚ;->ܰ:Ll/ۛ᩹ۚ;

    iget-object v1, v1, Ll/ۛ᩹ۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->᩸(Ll/ۘ᩹ۚ;)Ljava/util/ArrayDeque;

    move-result-object v1

    iget-object v2, p0, Ll/᩺᩹ۚ;->ܰ:Ll/ۛ᩹ۚ;

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 139
    :cond_1
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ۙ(Ll/ۘ᩹ۚ;)Ll/᩺᩹ۚ;

    move-result-object v1

    if-ne v1, p0, :cond_2

    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->ᩴ(Ll/ۘ᩹ۚ;)V

    .line 140
    :cond_2
    iget-object v1, p0, Ll/᩺᩹ۚ;->֡:Ll/ۘ᩹ۚ;

    invoke-static {v1}, Ll/ۘ᩹ۚ;->᩷(Ll/ۘ᩹ۚ;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 141
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
