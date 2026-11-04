.class public abstract Ll/֫ܽܽ;
.super Ll/ۢܽܽ;
.source "O7SL"

# interfaces
.implements Ll/ܰܽܽ;


# static fields
.field public static final ֡:Ll/ۤܽܽ;

.field public static final ۟:Z

.field public static final ۢ:Ll/ۘܽܽ;

.field public static final ᩳ:Ljava/lang/Object;


# instance fields
.field public volatile ܰ:Ll/ۜܺܽ;

.field public volatile ܿ:Ll/ۚܽܽ;

.field public volatile ᩶:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 274
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/֫ܽܽ;->ᩳ:Ljava/lang/Object;

    .line 281
    new-instance v0, Ll/ۘܽܽ;

    const-class v1, Ll/᩷ܽܽ;

    invoke-direct {v0, v1}, Ll/ۘܽܽ;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ll/֫ܽܽ;->ۢ:Ll/ۘܽܽ;

    :try_start_0
    const-string v0, "guava.concurrent.generate_cancellation_cause"

    const-string v1, "false"

    .line 289
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 288
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 283
    :goto_0
    sput-boolean v0, Ll/֫ܽܽ;->۟:Z

    const-string v0, "java.runtime.name"

    const-string v1, ""

    .line 708
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Android"

    .line 710
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 364
    :cond_0
    new-instance v0, Ll/᩸ܽܽ;

    .line 498
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_2

    .line 343
    :cond_1
    :goto_1
    :try_start_1
    new-instance v0, Ll/۫ܽܽ;

    .line 498
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 346
    :catch_1
    new-instance v0, Ll/᩸ܽܽ;

    .line 498
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 366
    :goto_2
    sput-object v0, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 263
    invoke-direct {p0}, Ll/ۢܽܽ;-><init>()V

    return-void
.end method

.method private ۙ(Ll/ۚܽܽ;)V
    .locals 4

    const/4 v0, 0x0

    .line 462
    iput-object v0, p1, Ll/ۚܽܽ;->᩷:Ljava/lang/Thread;

    .line 466
    :goto_0
    iget-object p1, p0, Ll/֫ܽܽ;->ܿ:Ll/ۚܽܽ;

    .line 467
    sget-object v1, Ll/ۚܽܽ;->ۤ:Ll/ۚܽܽ;

    if-ne p1, v1, :cond_0

    goto :goto_3

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz p1, :cond_4

    .line 472
    iget-object v2, p1, Ll/ۚܽܽ;->ۙ:Ll/ۚܽܽ;

    .line 473
    iget-object v3, p1, Ll/ۚܽܽ;->᩷:Ljava/lang/Thread;

    if-eqz v3, :cond_1

    move-object v1, p1

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 476
    iput-object v2, v1, Ll/ۚܽܽ;->ۙ:Ll/ۚܽܽ;

    .line 477
    iget-object p1, v1, Ll/ۚܽܽ;->᩷:Ljava/lang/Thread;

    if-nez p1, :cond_3

    goto :goto_0

    .line 439
    :cond_2
    sget-object v3, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v3, p0, p1, v2}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;Ll/ۚܽܽ;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    move-object p1, v2

    goto :goto_1

    :cond_4
    :goto_3
    return-void
.end method

.method public static ۙ(Ll/ۚܽܽ;Ljava/lang/Thread;)V
    .locals 1

    .line 426
    sget-object v0, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v0, p0, p1}, Ll/ۤܽܽ;->ۙ(Ll/ۚܽܽ;Ljava/lang/Thread;)V

    return-void
.end method

.method public static ۙ(Ll/ۚܽܽ;Ll/ۚܽܽ;)V
    .locals 1

    .line 431
    sget-object v0, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v0, p0, p1}, Ll/ۤܽܽ;->ۙ(Ll/ۚܽܽ;Ll/ۚܽܽ;)V

    return-void
.end method

.method public static ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 69
    sget-object v0, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    .line 54
    invoke-virtual {p0}, Ll/֫ܽܽ;->᩷()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 0

    .line 59
    invoke-virtual {p0, p1, p2, p3}, Ll/֫ܽܽ;->ۙ(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 12

    .line 123
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    .line 125
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v2

    if-nez v2, :cond_16

    .line 128
    iget-object v2, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 328
    :goto_0
    instance-of v4, v2, Ll/ۡܺܽ;

    xor-int/lit8 v4, v4, 0x1

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    .line 130
    invoke-static {v2}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 133
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    add-long/2addr v4, v0

    goto :goto_1

    :cond_2
    move-wide v4, v2

    :goto_1
    const-wide/16 v6, 0x3e8

    cmp-long v8, v0, v6

    if-ltz v8, :cond_a

    .line 136
    iget-object v8, p0, Ll/֫ܽܽ;->ܿ:Ll/ۚܽܽ;

    .line 137
    sget-object v9, Ll/ۚܽܽ;->ۤ:Ll/ۚܽܽ;

    if-eq v8, v9, :cond_9

    .line 138
    new-instance v9, Ll/ۚܽܽ;

    invoke-direct {v9}, Ll/ۚܽܽ;-><init>()V

    .line 316
    :cond_3
    invoke-static {v9, v8}, Ll/֫ܽܽ;->ۙ(Ll/ۚܽܽ;Ll/ۚܽܽ;)V

    .line 439
    sget-object v10, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v10, p0, v8, v9}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;Ll/ۚܽܽ;)Z

    move-result v8

    if-eqz v8, :cond_8

    :cond_4
    const-wide v10, 0x1dcd64ffffffffffL    # 3.98785104510193E-165

    .line 37
    invoke-static {v0, v1, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 145
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_7

    .line 152
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    .line 328
    :goto_2
    instance-of v8, v0, Ll/ۡܺܽ;

    xor-int/lit8 v8, v8, 0x1

    and-int/2addr v1, v8

    if-eqz v1, :cond_6

    .line 154
    invoke-static {v0}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 158
    :cond_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long v0, v4, v0

    cmp-long v8, v0, v6

    if-gez v8, :cond_4

    .line 161
    invoke-direct {p0, v9}, Ll/֫ܽܽ;->ۙ(Ll/ۚܽܽ;)V

    goto :goto_3

    .line 146
    :cond_7
    invoke-direct {p0, v9}, Ll/֫ܽܽ;->ۙ(Ll/ۚܽܽ;)V

    .line 147
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 166
    :cond_8
    iget-object v8, p0, Ll/֫ܽܽ;->ܿ:Ll/ۚܽܽ;

    .line 167
    sget-object v10, Ll/ۚܽܽ;->ۤ:Ll/ۚܽܽ;

    if-ne v8, v10, :cond_3

    .line 172
    :cond_9
    iget-object p1, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_3
    cmp-long v8, v0, v2

    if-lez v8, :cond_e

    .line 177
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-eqz v0, :cond_b

    const/4 v1, 0x1

    goto :goto_4

    :cond_b
    const/4 v1, 0x0

    .line 328
    :goto_4
    instance-of v8, v0, Ll/ۡܺܽ;

    xor-int/lit8 v8, v8, 0x1

    and-int/2addr v1, v8

    if-eqz v1, :cond_c

    .line 179
    invoke-static {v0}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 181
    :cond_c
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_d

    .line 184
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long v0, v4, v0

    goto :goto_3

    .line 182
    :cond_d
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 187
    :cond_e
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 188
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "Waited "

    const-string v10, " "

    .line 0
    invoke-static {v9, v10, p1, p2}, Ll/ۖۚ᩷;->ۙ(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 189
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-long v8, v0, v6

    cmp-long p2, v8, v2

    if-gez p2, :cond_14

    const-string p2, " (plus "

    .line 0
    invoke-static {p1, p2}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    neg-long v0, v0

    .line 195
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v0, v1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v8

    .line 196
    invoke-virtual {p3, v8, v9}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p2

    sub-long/2addr v0, p2

    cmp-long p2, v8, v2

    if-eqz p2, :cond_10

    cmp-long p3, v0, v6

    if-lez p3, :cond_f

    goto :goto_5

    :cond_f
    const/4 p3, 0x0

    goto :goto_6

    :cond_10
    :goto_5
    const/4 p3, 0x1

    :goto_6
    if-lez p2, :cond_12

    .line 200
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p3, :cond_11

    const-string p2, ","

    .line 0
    invoke-static {p1, p2}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_11
    invoke-static {p1, v10}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_12
    if-eqz p3, :cond_13

    .line 207
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " nanoseconds "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_13
    const-string p2, "delay)"

    .line 0
    invoke-static {p1, p2}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 215
    :cond_14
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p2

    if-eqz p2, :cond_15

    .line 216
    new-instance p2, Ljava/util/concurrent/TimeoutException;

    const-string p3, " but future completed as timeout expired"

    .line 0
    invoke-static {p1, p3}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 216
    invoke-direct {p2, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 218
    :cond_15
    new-instance p2, Ljava/util/concurrent/TimeoutException;

    const-string p3, " for "

    .line 0
    invoke-static {p1, p3, v4}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 218
    invoke-direct {p2, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 126
    :cond_16
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method public final ۙ(Ll/ۜܺܽ;)Ll/ۜܺܽ;
    .locals 1

    .line 61
    sget-object v0, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v0, p0, p1}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;)Ll/ۜܺܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۜܺܽ;Ll/ۜܺܽ;)Z
    .locals 1

    .line 53
    sget-object v0, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v0, p0, p1, p2}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۜܺܽ;Ll/ۜܺܽ;)Z

    move-result p1

    return p1
.end method

.method public final ۤ()V
    .locals 3

    .line 84
    sget-object v0, Ll/ۚܽܽ;->ۤ:Ll/ۚܽܽ;

    .line 447
    sget-object v1, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v1, p0, v0}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;)Ll/ۚܽܽ;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 323
    iget-object v1, v0, Ll/ۚܽܽ;->᩷:Ljava/lang/Thread;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 325
    iput-object v2, v0, Ll/ۚܽܽ;->᩷:Ljava/lang/Thread;

    .line 326
    invoke-static {v1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 85
    :cond_0
    iget-object v0, v0, Ll/ۚܽܽ;->ۙ:Ll/ۚܽܽ;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ᩷()Ljava/lang/Object;
    .locals 4

    .line 224
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_8

    .line 227
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 328
    :goto_0
    instance-of v2, v0, Ll/ۡܺܽ;

    xor-int/lit8 v2, v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    .line 229
    invoke-static {v0}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 231
    :cond_1
    iget-object v0, p0, Ll/֫ܽܽ;->ܿ:Ll/ۚܽܽ;

    .line 232
    sget-object v1, Ll/ۚܽܽ;->ۤ:Ll/ۚܽܽ;

    if-eq v0, v1, :cond_7

    .line 233
    new-instance v1, Ll/ۚܽܽ;

    invoke-direct {v1}, Ll/ۚܽܽ;-><init>()V

    .line 316
    :cond_2
    invoke-static {v1, v0}, Ll/֫ܽܽ;->ۙ(Ll/ۚܽܽ;Ll/ۚܽܽ;)V

    .line 439
    sget-object v2, Ll/֫ܽܽ;->֡:Ll/ۤܽܽ;

    invoke-virtual {v2, p0, v0, v1}, Ll/ۤܽܽ;->ۙ(Ll/֫ܽܽ;Ll/ۚܽܽ;Ll/ۚܽܽ;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 239
    :cond_3
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 241
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 247
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    .line 328
    :goto_1
    instance-of v3, v0, Ll/ۡܺܽ;

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v2, v3

    if-eqz v2, :cond_3

    .line 249
    invoke-static {v0}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 242
    :cond_5
    invoke-direct {p0, v1}, Ll/֫ܽܽ;->ۙ(Ll/ۚܽܽ;)V

    .line 243
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 253
    :cond_6
    iget-object v0, p0, Ll/֫ܽܽ;->ܿ:Ll/ۚܽܽ;

    .line 254
    sget-object v2, Ll/ۚܽܽ;->ۤ:Ll/ۚܽܽ;

    if-ne v0, v2, :cond_2

    .line 259
    :cond_7
    iget-object v0, p0, Ll/֫ܽܽ;->᩶:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ll/᩷ܽܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 225
    :cond_8
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method
