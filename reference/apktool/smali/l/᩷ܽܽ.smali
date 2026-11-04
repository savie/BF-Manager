.class public abstract Ll/᩷ܽܽ;
.super Ll/֫ܽܽ;
.source "B3B1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 233
    invoke-direct {p0}, Ll/֫ܽܽ;-><init>()V

    return-void
.end method

.method private ۙ(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    const/4 v1, 0x0

    .line 733
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 42
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    const-string v1, "SUCCESS, result=["

    .line 976
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 977
    invoke-direct {p0, p1, v2}, Ll/᩷ܽܽ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 978
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    .line 42
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 742
    :cond_1
    throw v2
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    const-string v1, "UNKNOWN, cause=["

    .line 984
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :catch_2
    const-string v0, "CANCELLED"

    .line 982
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :goto_2
    const-string v2, "FAILURE, cause=["

    .line 980
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    return-void

    :catch_3
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private ۙ(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    const-string p2, "null"

    .line 995
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    if-ne p2, p0, :cond_1

    const-string p2, "this future"

    .line 997
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 1000
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@"

    .line 1001
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ۙ(Ll/᩷ܽܽ;Z)V
    .locals 10

    const/4 v0, 0x0

    .line 753
    :goto_0
    invoke-virtual {p0}, Ll/֫ܽܽ;->ۤ()V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 771
    :cond_0
    invoke-virtual {p0}, Ll/᩷ܽܽ;->᩸()V

    .line 883
    sget-object v1, Ll/ۜܺܽ;->᩸:Ll/ۜܺܽ;

    invoke-virtual {p0, v1}, Ll/֫ܽܽ;->ۙ(Ll/ۜܺܽ;)Ll/ۜܺܽ;

    move-result-object p0

    move-object v9, v0

    move-object v0, p0

    move-object p0, v9

    :goto_1
    if-eqz v0, :cond_1

    .line 887
    iget-object v1, v0, Ll/ۜܺܽ;->᩷:Ll/ۜܺܽ;

    .line 888
    iput-object p0, v0, Ll/ۜܺܽ;->᩷:Ll/ۜܺܽ;

    move-object p0, v0

    move-object v0, v1

    goto :goto_1

    :cond_1
    :goto_2
    if-eqz p0, :cond_f

    .line 777
    iget-object v0, p0, Ll/ۜܺܽ;->᩷:Ll/ۜܺܽ;

    .line 782
    iget-object v1, p0, Ll/ۜܺܽ;->ۤ:Ljava/lang/Runnable;

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    instance-of v2, v1, Ll/ۡܺܽ;

    if-eqz v2, :cond_d

    .line 784
    check-cast v1, Ll/ۡܺܽ;

    .line 790
    iget-object p0, v1, Ll/ۡܺܽ;->᩶:Ll/᩷ܽܽ;

    .line 74
    iget-object v2, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-ne v2, v1, :cond_e

    .line 792
    iget-object v2, v1, Ll/ۡܺܽ;->ܰ:Ll/ܰܽܽ;

    const-string v3, "get() did not throw CancellationException, despite reporting isCancelled() == true: "

    .line 648
    instance-of v4, v2, Ll/۬ܺܽ;

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    .line 653
    check-cast v2, Ll/᩷ܽܽ;

    .line 74
    iget-object v2, v2, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    .line 654
    instance-of v3, v2, Ll/֨ܺܽ;

    if-eqz v3, :cond_3

    .line 658
    move-object v3, v2

    check-cast v3, Ll/֨ܺܽ;

    .line 659
    iget-boolean v4, v3, Ll/֨ܺܽ;->᩷:Z

    if-eqz v4, :cond_3

    .line 661
    iget-object v2, v3, Ll/֨ܺܽ;->ۙ:Ljava/lang/Throwable;

    if-eqz v2, :cond_2

    .line 662
    new-instance v2, Ll/֨ܺܽ;

    iget-object v3, v3, Ll/֨ܺܽ;->ۙ:Ljava/lang/Throwable;

    invoke-direct {v2, v3, v5}, Ll/֨ܺܽ;-><init>(Ljava/lang/Throwable;Z)V

    goto :goto_3

    .line 663
    :cond_2
    sget-object v2, Ll/֨ܺܽ;->ۤ:Ll/֨ܺܽ;

    .line 667
    :cond_3
    :goto_3
    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_a

    .line 669
    :cond_4
    instance-of v4, v2, Ll/ۢܽܽ;

    if-eqz v4, :cond_5

    .line 670
    move-object v4, v2

    check-cast v4, Ll/ۢܽܽ;

    .line 671
    invoke-static {v4}, Ll/֨ܽܽ;->ۙ(Ll/ۢܽܽ;)Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 673
    new-instance v2, Ll/۠ܺܽ;

    invoke-direct {v2, v4}, Ll/۠ܺܽ;-><init>(Ljava/lang/Throwable;)V

    goto/16 :goto_a

    .line 676
    :cond_5
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v4

    .line 678
    sget-boolean v6, Ll/֫ܽܽ;->۟:Z

    xor-int/lit8 v6, v6, 0x1

    and-int/2addr v6, v4

    if-eqz v6, :cond_6

    .line 683
    sget-object v2, Ll/֨ܺܽ;->ۤ:Ll/֨ܺܽ;

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_a

    :cond_6
    const/4 v6, 0x0

    .line 733
    :goto_4
    :try_start_0
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_7

    .line 42
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_6

    :catch_1
    move-exception v2

    goto :goto_6

    :catch_2
    move-exception v3

    goto :goto_7

    :catch_3
    move-exception v6

    goto :goto_8

    :cond_7
    :goto_5
    if-eqz v4, :cond_8

    .line 689
    new-instance v6, Ll/֨ܺܽ;

    new-instance v7, Ljava/lang/IllegalArgumentException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v6, v7, v5}, Ll/֨ܺܽ;-><init>(Ljava/lang/Throwable;Z)V

    move-object v2, v6

    goto :goto_a

    :cond_8
    if-nez v7, :cond_9

    .line 1056
    sget-object v2, Ll/֫ܽܽ;->ᩳ:Ljava/lang/Object;

    goto :goto_a

    :cond_9
    move-object v2, v7

    goto :goto_a

    :catchall_0
    move-exception v7

    if-eqz v6, :cond_a

    .line 42
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Thread;->interrupt()V

    .line 742
    :cond_a
    throw v7
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 718
    :goto_6
    new-instance v3, Ll/۠ܺܽ;

    invoke-direct {v3, v2}, Ll/۠ܺܽ;-><init>(Ljava/lang/Throwable;)V

    move-object v2, v3

    goto :goto_a

    :goto_7
    if-nez v4, :cond_b

    .line 710
    new-instance v4, Ll/۠ܺܽ;

    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "get() threw CancellationException, despite reporting isCancelled() == false: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v4, v5}, Ll/۠ܺܽ;-><init>(Ljava/lang/Throwable;)V

    goto :goto_9

    .line 716
    :cond_b
    new-instance v2, Ll/֨ܺܽ;

    invoke-direct {v2, v3, v5}, Ll/֨ܺܽ;-><init>(Ljava/lang/Throwable;Z)V

    goto :goto_a

    :goto_8
    if-eqz v4, :cond_c

    .line 699
    new-instance v4, Ll/֨ܺܽ;

    new-instance v7, Ljava/lang/IllegalArgumentException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v2, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v4, v7, v5}, Ll/֨ܺܽ;-><init>(Ljava/lang/Throwable;Z)V

    :goto_9
    move-object v2, v4

    goto :goto_a

    .line 707
    :cond_c
    new-instance v2, Ll/۠ܺܽ;

    invoke-virtual {v6}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/۠ܺܽ;-><init>(Ljava/lang/Throwable;)V

    .line 793
    :goto_a
    invoke-static {p0, v1, v2}, Ll/֫ܽܽ;->ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto/16 :goto_0

    :catch_4
    const/4 v6, 0x1

    goto/16 :goto_4

    .line 803
    :cond_d
    iget-object p0, p0, Ll/ۜܺܽ;->ۙ:Ljava/util/concurrent/Executor;

    invoke-static {p0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, p0}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_e
    move-object p0, v0

    goto/16 :goto_2

    :cond_f
    return-void
.end method

.method public static ᩷(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 295
    instance-of v0, p0, Ll/֨ܺܽ;

    if-nez v0, :cond_2

    .line 297
    instance-of v0, p0, Ll/۠ܺܽ;

    if-nez v0, :cond_1

    .line 310
    sget-object v0, Ll/֫ܽܽ;->ᩳ:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    .line 298
    :cond_1
    check-cast p0, Ll/۠ܺܽ;

    .line 168
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    iget-object p0, p0, Ll/۠ܺܽ;->ۙ:Ljava/lang/Throwable;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    .line 298
    throw v0

    .line 296
    :cond_2
    check-cast p0, Ll/֨ܺܽ;

    .line 197
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 198
    iget-object p0, p0, Ll/֨ܺܽ;->ۙ:Ljava/lang/Throwable;

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 296
    throw v0
.end method

.method public static ᩷(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 5

    .line 1040
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1044
    sget-object v1, Ll/֫ܽܽ;->ۢ:Ll/ۘܽܽ;

    invoke-virtual {v1}, Ll/ۘܽܽ;->ۙ()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RuntimeException while executing runnable "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1045
    invoke-virtual {v1, v2, p0, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 6

    .line 74
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 364
    :goto_0
    instance-of v4, v0, Ll/ۡܺܽ;

    or-int/2addr v3, v4

    if-eqz v3, :cond_8

    .line 368
    sget-boolean v2, Ll/֫ܽܽ;->۟:Z

    if-eqz v2, :cond_1

    .line 369
    new-instance v2, Ll/֨ܺܽ;

    new-instance v3, Ljava/util/concurrent/CancellationException;

    const-string v4, "Future.cancel() was called."

    invoke-direct {v3, v4}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3, p1}, Ll/֨ܺܽ;-><init>(Ljava/lang/Throwable;Z)V

    :goto_1
    move-object v3, v2

    goto :goto_3

    :cond_1
    if-eqz p1, :cond_2

    .line 383
    sget-object v2, Ll/֨ܺܽ;->᩸:Ll/֨ܺܽ;

    goto :goto_2

    .line 384
    :cond_2
    sget-object v2, Ll/֨ܺܽ;->ۤ:Ll/֨ܺܽ;

    .line 381
    :goto_2
    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :goto_3
    const/4 v2, 0x0

    move-object v4, p0

    .line 387
    :cond_3
    :goto_4
    invoke-static {v4, v0, v3}, Ll/֫ܽܽ;->ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 389
    invoke-static {v4, p1}, Ll/᩷ܽܽ;->ۙ(Ll/᩷ܽܽ;Z)V

    .line 390
    instance-of v2, v0, Ll/ۡܺܽ;

    if-eqz v2, :cond_6

    .line 393
    check-cast v0, Ll/ۡܺܽ;

    iget-object v0, v0, Ll/ۡܺܽ;->ܰ:Ll/ܰܽܽ;

    .line 394
    instance-of v2, v0, Ll/۬ܺܽ;

    if-eqz v2, :cond_5

    .line 402
    move-object v4, v0

    check-cast v4, Ll/᩷ܽܽ;

    .line 74
    iget-object v0, v4, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-nez v0, :cond_4

    const/4 v2, 0x1

    goto :goto_5

    :cond_4
    const/4 v2, 0x0

    .line 404
    :goto_5
    instance-of v5, v0, Ll/ۡܺܽ;

    or-int/2addr v2, v5

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    .line 410
    :cond_5
    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_6
    return v1

    .line 74
    :cond_7
    iget-object v0, v4, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    .line 328
    instance-of v5, v0, Ll/ۡܺܽ;

    if-nez v5, :cond_3

    :cond_8
    return v2
.end method

.method public isCancelled()Z
    .locals 1

    .line 74
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    .line 340
    instance-of v0, v0, Ll/֨ܺܽ;

    return v0
.end method

.method public isDone()Z
    .locals 2

    .line 74
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 328
    :goto_0
    instance-of v0, v0, Ll/ۡܺܽ;

    xor-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 898
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 899
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.common.util.concurrent."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 900
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 902
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x40

    .line 904
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 905
    invoke-virtual {p0}, Ll/᩷ܽܽ;->isCancelled()Z

    move-result v1

    const-string v2, "]"

    if-eqz v1, :cond_1

    const-string v1, "CANCELLED"

    .line 906
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_6

    .line 907
    :cond_1
    invoke-virtual {p0}, Ll/᩷ܽܽ;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 908
    invoke-direct {p0, v0}, Ll/᩷ܽܽ;->ۙ(Ljava/lang/StringBuilder;)V

    goto/16 :goto_6

    .line 933
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v3, "PENDING"

    .line 935
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    iget-object v3, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    .line 938
    instance-of v4, v3, Ll/ۡܺܽ;

    const-string v5, "Exception thrown from implementation: "

    if-eqz v4, :cond_6

    const-string v4, ", setFuture=["

    .line 939
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 940
    check-cast v3, Ll/ۡܺܽ;

    iget-object v3, v3, Ll/ۡܺܽ;->ܰ:Ll/ܰܽܽ;

    if-ne v3, p0, :cond_3

    :try_start_0
    const-string v3, "this future"

    .line 1015
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 1017
    :cond_3
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v3

    .line 47
    instance-of v4, v3, Ljava/lang/Error;

    if-eqz v4, :cond_5

    instance-of v4, v3, Ljava/lang/StackOverflowError;

    if-eqz v4, :cond_4

    goto :goto_1

    .line 48
    :cond_4
    check-cast v3, Ljava/lang/Error;

    throw v3

    .line 1029
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 941
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 945
    :cond_6
    :try_start_1
    invoke-virtual {p0}, Ll/᩷ܽܽ;->ᩴ()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 58
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_a

    :cond_7
    const/4 v3, 0x0

    goto :goto_4

    :catchall_1
    move-exception v3

    .line 47
    instance-of v4, v3, Ljava/lang/Error;

    if-eqz v4, :cond_9

    instance-of v4, v3, Ljava/lang/StackOverflowError;

    if-eqz v4, :cond_8

    goto :goto_3

    .line 48
    :cond_8
    check-cast v3, Ljava/lang/Error;

    throw v3

    .line 956
    :cond_9
    :goto_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_a
    :goto_4
    if-eqz v3, :cond_b

    const-string v4, ", info=["

    .line 0
    invoke-static {v0, v4, v3, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 965
    :cond_b
    :goto_5
    invoke-virtual {p0}, Ll/᩷ܽܽ;->isDone()Z

    move-result v3

    if-eqz v3, :cond_c

    .line 967
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 968
    invoke-direct {p0, v0}, Ll/᩷ܽܽ;->ۙ(Ljava/lang/StringBuilder;)V

    .line 912
    :cond_c
    :goto_6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/Throwable;
    .locals 2

    .line 852
    instance-of v0, p0, Ll/۬ܺܽ;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    .line 854
    instance-of v1, v0, Ll/۠ܺܽ;

    if-eqz v1, :cond_0

    .line 855
    check-cast v0, Ll/۠ܺܽ;

    iget-object v0, v0, Ll/۠ܺܽ;->ۙ:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۙ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3

    const-string v0, "Executor was null."

    .line 465
    invoke-static {p2, v0}, Ll/ۨۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 475
    invoke-virtual {p0}, Ll/᩷ܽܽ;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    .line 79
    iget-object v0, p0, Ll/֫ܽܽ;->ܰ:Ll/ۜܺܽ;

    .line 477
    sget-object v1, Ll/ۜܺܽ;->᩸:Ll/ۜܺܽ;

    if-eq v0, v1, :cond_2

    .line 478
    new-instance v1, Ll/ۜܺܽ;

    invoke-direct {v1, p1, p2}, Ll/ۜܺܽ;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 480
    :cond_0
    iput-object v0, v1, Ll/ۜܺܽ;->᩷:Ll/ۜܺܽ;

    .line 481
    invoke-virtual {p0, v0, v1}, Ll/֫ܽܽ;->ۙ(Ll/ۜܺܽ;Ll/ۜܺܽ;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 79
    :cond_1
    iget-object v0, p0, Ll/֫ܽܽ;->ܰ:Ll/ۜܺܽ;

    .line 485
    sget-object v2, Ll/ۜܺܽ;->᩸:Ll/ۜܺܽ;

    if-ne v0, v2, :cond_0

    .line 490
    :cond_2
    invoke-static {p1, p2}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public ۙ(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    .line 1056
    sget-object p1, Ll/֫ܽܽ;->ᩳ:Ljava/lang/Object;

    :cond_0
    const/4 v0, 0x0

    .line 511
    invoke-static {p0, v0, p1}, Ll/֫ܽܽ;->ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 512
    invoke-static {p0, v0}, Ll/᩷ܽܽ;->ۙ(Ll/᩷ܽܽ;Z)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public ۙ(Ljava/lang/Throwable;)Z
    .locals 1

    .line 540
    new-instance v0, Ll/۠ܺܽ;

    invoke-direct {v0, p1}, Ll/۠ܺܽ;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 541
    invoke-static {p0, p1, v0}, Ll/֫ܽܽ;->ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 542
    invoke-static {p0, v0}, Ll/᩷ܽܽ;->ۙ(Ll/᩷ܽܽ;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public ᩴ()Ljava/lang/String;
    .locals 3

    .line 923
    instance-of v0, p0, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 924
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "remaining delay=["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ᩸()V
    .locals 0

    return-void
.end method
