.class public Ll/ۚ۫۫;
.super Ll/ܳۙ᩻;
.source "I254"


# static fields
.field public static final synthetic ۫᩷:I


# instance fields
.field public ֨ۙ:Ll/ܿ᩸۫;

.field public ۖۙ:Ljava/util/concurrent/ExecutorService;

.field public ۙ᩷:Ljava/lang/ThreadLocal;

.field public ۜۙ:Ljava/util/concurrent/locks/ReentrantLock;

.field public ۟ۙ:Ll/ᩴ۠ۧ;

.field public ۠ۙ:Ljava/util/HashSet;

.field public ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

.field public ۢۙ:Ll/ۘ᩷۫;

.field public ۤ᩷:Ljava/lang/String;

.field public ۬ۙ:Ljava/util/List;

.field public ܳ᩷:Ll/᩺ܿᩴ;

.field public ᩳۙ:Ll/ۗ᩷۫;

.field public ᩴ᩷:Ll/۫ۛᩴ;

.field public ᩷᩷:Z

.field public ᩸᩷:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 92
    invoke-direct {p0}, Ll/ܳۙ᩻;-><init>()V

    .line 93
    invoke-static {}, Ll/᩶᩷ۧ;->ۨ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۚ۫۫;->᩷᩷:Z

    .line 0
    invoke-static {}, Ll/֨᩵ᩴ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 94
    iput-object v0, p0, Ll/ۚ۫۫;->᩸᩷:Ljava/util/List;

    .line 97
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/ۚ۫۫;->ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    invoke-static {}, Ll/֨᩵ᩴ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 98
    iput-object v0, p0, Ll/ۚ۫۫;->۬ۙ:Ljava/util/List;

    .line 99
    new-instance v0, Ll/۫ۛᩴ;

    invoke-direct {v0}, Ll/۫ۛᩴ;-><init>()V

    iput-object v0, p0, Ll/ۚ۫۫;->ᩴ᩷:Ll/۫ۛᩴ;

    .line 100
    new-instance v0, Ll/ᩴ۠ۧ;

    invoke-direct {v0}, Ll/ᩴ۠ۧ;-><init>()V

    iput-object v0, p0, Ll/ۚ۫۫;->۟ۙ:Ll/ᩴ۠ۧ;

    .line 101
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Ll/ۚ۫۫;->ۙ᩷:Ljava/lang/ThreadLocal;

    .line 102
    new-instance v0, Ll/ܿ᩸۫;

    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Ll/ܿ᩸۫;-><init>(Z)V

    .line 102
    iput-object v0, p0, Ll/ۚ۫۫;->֨ۙ:Ll/ܿ᩸۫;

    .line 103
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۚ۫۫;->۠ۙ:Ljava/util/HashSet;

    .line 104
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/ۚ۫۫;->ۜۙ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 106
    new-instance v0, Ll/ܳ۫۫;

    invoke-direct {v0, p0}, Ll/ܳ۫۫;-><init>(Ll/ۚ۫۫;)V

    iput-object v0, p0, Ll/ۚ۫۫;->ܳ᩷:Ll/᩺ܿᩴ;

    .line 134
    new-instance v0, Ll/۫۫۫;

    invoke-direct {v0, p0}, Ll/۫۫۫;-><init>(Ll/ۚ۫۫;)V

    iput-object v0, p0, Ll/ۚ۫۫;->ᩳۙ:Ll/ۗ᩷۫;

    return-void
.end method

.method private ᩷(Ll/ۛ᩷۫;)V
    .locals 2

    .line 219
    iget-object v0, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ᩴ۫۫;

    invoke-direct {v1, p0, p1}, Ll/ᩴ۫۫;-><init>(Ll/ۚ۫۫;Ll/ۛ᩷۫;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 339
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۙ()Ll/᩵᩷۫;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩵᩷۫;->ܿ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩷۫;

    .line 341
    invoke-direct {p0, v0}, Ll/ۚ۫۫;->᩷(Ll/ۛ᩷۫;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public ֫()V
    .locals 1

    const v0, 0x7f120956

    .line 168
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    const-string v0, "..."

    .line 169
    invoke-virtual {p0, v0}, Ll/ܳۙ᩻;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ۙ(Lbin/mt/plus/Main;Ll/۠ۨܳ;Ll/۠ۨܳ;Ll/ۨۜۧ;)V
    .locals 0

    .line 348
    invoke-virtual {p4}, Ll/ۨۜۧ;->᩸()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ᩳۜۧ;->᩷(Ll/۠ۨܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 349
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܳ()V

    .line 351
    :cond_0
    iget-object p1, p0, Ll/ۚ۫۫;->۬ۙ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-virtual {p0, p3}, Ll/ᩳۜۧ;->ۙ(Ll/۠ۨܳ;)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 352
    invoke-virtual {p3, p1}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 353
    invoke-virtual {p3}, Ll/۠ۨܳ;->ܽۙ()V

    .line 354
    iget-object p3, p0, Ll/ۚ۫۫;->ۤ᩷:Ljava/lang/String;

    if-eqz p3, :cond_1

    .line 355
    invoke-virtual {p2, p1}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 356
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܽۙ()V

    :cond_1
    return-void
.end method

.method public ۧ()Ll/ۨۜۧ;
    .locals 6

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۗ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "targetPath"

    .line 176
    invoke-virtual {p0, v1}, Ll/ᩳۜۧ;->᩹(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 177
    sget v2, Ll/ܺ᩶ᩴ;->ۙ:I

    .line 294
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܺ᩶ᩴ;->ۙ(Ljava/io/File;)Ll/֫᩶ᩴ;

    move-result-object v2

    const-string v3, "replacedName"

    .line 178
    invoke-virtual {p0, v3}, Ll/ᩳۜۧ;->᩺(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Ll/ۚ۫۫;->ۤ᩷:Ljava/lang/String;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    .line 179
    invoke-virtual {v2}, Ll/֫᩶ᩴ;->ۙۤ()Ll/᩻᩶ᩴ;

    move-result-object v2

    .line 461
    iget-object v2, v2, Ll/᩻᩶ᩴ;->ۤ:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 180
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    .line 381
    :cond_0
    sget-object v2, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v4, "optimize_external_storage_dt"

    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 181
    invoke-static {v0}, Ll/֫۫۫;->ۙ([Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫۫۫;->ۙ([Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 182
    :cond_1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    .line 184
    invoke-static {v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    iput-object v2, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    .line 187
    :goto_0
    sget-object v2, Ll/ۨ۠ۧ;->֡:Ll/ۨ۠ۧ;

    invoke-static {v1, v2}, Ll/ۛ۠ۧ;->ۙ(Ljava/lang/String;Ll/ۨ۠ۧ;)V

    const/4 v2, 0x0

    new-array v4, v2, [Ljava/lang/String;

    .line 188
    invoke-static {v1, v4}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩷ۨᩴ;->ۡ()V

    .line 189
    iget-object v4, p0, Ll/ۚ۫۫;->֨ۙ:Ll/ܿ᩸۫;

    iget-object v5, p0, Ll/ۚ۫۫;->ᩳۙ:Ll/ۗ᩷۫;

    invoke-static {v1, v4, v5}, Ll/ۘ᩷۫;->ۙ(Ljava/lang/String;Ll/ܿ᩸۫;Ll/ۗ᩷۫;)Ll/ۘ᩷۫;

    move-result-object v1

    iput-object v1, p0, Ll/ۚ۫۫;->ۢۙ:Ll/ۘ᩷۫;

    .line 190
    iget-object v4, p0, Ll/ۚ۫۫;->ۤ᩷:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ll/ۘ᩷۫;->ۙ(Ljava/lang/String;)V

    .line 191
    iget-object v1, p0, Ll/ۚ۫۫;->ۢۙ:Ll/ۘ᩷۫;

    sget-object v4, Ll/ۧ᩻۫;->᩶:Ll/ۧ᩻۫;

    invoke-virtual {v1, v0, v4, v2, v3}, Ll/ۘ᩷۫;->ۙ([Ljava/lang/String;Ll/۟ۘܳ;ZZ)V

    .line 192
    iget-object v0, p0, Ll/ۚ۫۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {v0, v3}, Ll/ۘ᩷۫;->ۙ(Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 193
    invoke-virtual {p0}, Ll/ᩳۜۧ;->cancel()V

    .line 194
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    :cond_3
    const v0, 0x7f120203

    .line 196
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    .line 197
    iget-object v0, p0, Ll/ۚ۫۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {p0, v0}, Ll/ܳۙ᩻;->᩷(Ll/֫ۤ۫;)V

    .line 198
    invoke-virtual {p0, v3}, Ll/ܳۙ᩻;->᩸(Z)V

    .line 199
    iget-object v0, p0, Ll/ۚ۫۫;->۟ۙ:Ll/ᩴ۠ۧ;

    invoke-virtual {v0}, Ll/ᩴ۠ۧ;->ۙ()V

    .line 200
    iget-object v0, p0, Ll/ۚ۫۫;->ᩴ᩷:Ll/۫ۛᩴ;

    invoke-virtual {v0}, Ll/۫ۛᩴ;->᩷()V

    .line 201
    iget-object v0, p0, Ll/ۚ۫۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {v0}, Ll/ۘ᩷۫;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩷۫;

    .line 202
    invoke-direct {p0, v1}, Ll/ۚ۫۫;->᩷(Ll/ۛ᩷۫;)V

    goto :goto_1

    .line 204
    :cond_4
    iget-object v0, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Ll/ۙ᩻ܺ;->ۙ(Ljava/util/concurrent/ExecutorService;)V

    .line 205
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 206
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 208
    :cond_5
    iget-object v0, p0, Ll/ۚ۫۫;->ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    .line 211
    iget-object v0, p0, Ll/ۚ۫۫;->᩸᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 212
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :cond_6
    const-wide/16 v0, 0x64

    .line 214
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 215
    invoke-static {}, Ll/ۨۜۧ;->ܳ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 209
    :cond_7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ܶۙ()Ljava/lang/CharSequence;
    .locals 2

    .line 159
    iget-object v0, p0, Ll/ۚ۫۫;->ۤ᩷:Ljava/lang/String;

    if-eqz v0, :cond_0

    const v1, 0x7f120bee

    .line 160
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 655
    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "targetPath"

    .line 162
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120bed

    .line 655
    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ᩷(Ll/ۨۜۧ;)V
    .locals 0

    .line 363
    iget-object p1, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result p1

    if-nez p1, :cond_0

    .line 364
    iget-object p1, p0, Ll/ۚ۫۫;->ۖۙ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 366
    :cond_0
    iget-object p1, p0, Ll/ۚ۫۫;->ᩴ᩷:Ll/۫ۛᩴ;

    invoke-virtual {p1}, Ll/۫ۛᩴ;->ۤ()V

    .line 367
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    return-void
.end method

.method public final ᩺()Ll/ۨ֡֫;
    .locals 1

    .line 154
    sget-object v0, Ll/ܰ۬ۧ;->᩸:Ll/ۨ֡֫;

    return-object v0
.end method
