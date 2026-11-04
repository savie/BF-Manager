.class public final Ll/ۢۢܳ;
.super Ljava/lang/Object;
.source "E4GI"


# instance fields
.field public final ۙ:Ll/ܽ֡֫;

.field public ۤ:Z

.field public final ᩷:Ll/ᩳۢܳ;

.field public ᩸:Ljava/util/function/BooleanSupplier;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/᩸ܽܺ;)V
    .locals 2

    .line 42
    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/ۧۚۧ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p2}, Ll/ۧۚۧ;-><init>(ILjava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Ll/ۢۢܳ;-><init>(Ll/ܽ֡֫;Ll/ᩳۢܳ;)V

    return-void
.end method

.method public constructor <init>(Ll/ܽ֡֫;Ll/ᩳۢܳ;)V
    .locals 1

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ll/᩹ܳ᩸;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    .line 37
    iput-object p1, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    .line 38
    iput-object p2, p0, Ll/ۢۢܳ;->᩷:Ll/ᩳۢܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۢۢܳ;)Ll/ܽ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ۢۢܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 5

    .line 69
    iget-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    .line 70
    monitor-enter v0

    .line 71
    :try_start_0
    iput-boolean v2, p0, Ll/ۢۢܳ;->ۤ:Z

    .line 72
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 74
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 77
    :cond_0
    new-instance v3, Ll/᩶ۢܳ;

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-direct {v3, p0, v0, p1}, Ll/᩶ۢܳ;-><init>(Ll/ۢۢܳ;Ll/ܽ֡֫;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    const/4 v4, 0x0

    .line 113
    invoke-virtual {v3, v4}, Ll/᩸ۡᩴ;->ۙ(Ljava/lang/String;)V

    .line 114
    invoke-virtual {p2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 116
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    invoke-virtual {v3}, Ll/᩸ۡᩴ;->ۚ()V

    return-void

    .line 0
    :cond_2
    :goto_0
    invoke-virtual {p2, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eq v0, v3, :cond_2

    :goto_1
    move-object v0, p0

    .line 118
    monitor-enter v0

    .line 119
    :try_start_1
    iput-boolean v2, p0, Ll/ۢۢܳ;->ۤ:Z

    .line 120
    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 122
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static synthetic ۙ(Ll/ۢۢܳ;Ljava/util/concurrent/atomic/AtomicBoolean;[Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 4

    .line 231
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    .line 232
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 239
    :cond_0
    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v2, 0x7f1201a8

    .line 240
    invoke-virtual {v0, v2}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v2, Ll/ۗ۬ۤ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p3}, Ll/ۗ۬ۤ;-><init>(ILjava/lang/Object;)V

    const/4 v3, -0x1

    .line 241
    invoke-virtual {v0, p2, v3, v2}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f1208c9

    const/4 v2, 0x0

    .line 242
    invoke-virtual {v0, p2, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ۘۢܳ;

    const/4 v3, 0x0

    invoke-direct {p2, p0, p1, p3, v3}, Ll/ۘۢܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v3, 0x7f120161

    .line 243
    invoke-virtual {v0, v3, p2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p2, 0x0

    .line 251
    invoke-virtual {v0, p2}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 252
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p2

    .line 253
    invoke-virtual {p4, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 255
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    .line 256
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 265
    :cond_1
    invoke-virtual {p2}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p4

    new-instance v0, Ll/ܰۢܳ;

    invoke-direct {v0, p0, p3, p1, p2}, Ll/ܰۢܳ;-><init>(Ll/ۢۢܳ;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۠ۖۧ;)V

    invoke-virtual {p4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 0
    :cond_2
    :goto_0
    invoke-virtual {p4, p2, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p3

    if-eq p3, p2, :cond_2

    .line 258
    :goto_1
    invoke-virtual {p2}, Ll/۠ۖۧ;->dismiss()V

    move-object v0, p0

    .line 259
    monitor-enter v0

    .line 260
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 261
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 262
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_4
    :goto_2
    move-object v0, p0

    .line 233
    monitor-enter v0

    .line 234
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 235
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 236
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static bridge synthetic ۤ(Ll/ۢۢܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۢۢܳ;->ۤ:Z

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۢۢܳ;)Ll/ᩳۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢۢܳ;->᩷:Ll/ᩳۢܳ;

    return-object p0
.end method


# virtual methods
.method public final ۙ(Ljava/util/function/BooleanSupplier;)V
    .locals 0

    .line 52
    iput-object p1, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    return-void
.end method

.method public final ۙ()Z
    .locals 7

    .line 57
    invoke-static {}, Ll/᩷᩻ܺ;->ۤ()V

    .line 58
    iget-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 59
    iput-boolean v2, p0, Ll/ۢۢܳ;->ۤ:Z

    return v1

    .line 62
    :cond_0
    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    if-eqz v0, :cond_7

    .line 63
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    .line 66
    :cond_1
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 67
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 68
    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    new-instance v5, Ll/ۛۢܳ;

    invoke-direct {v5, p0, v3, v4}, Ll/ۛۢܳ;-><init>(Ll/ۢۢܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {v0, v5}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    move-object v0, p0

    .line 128
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const-wide/16 v5, 0xc8

    .line 130
    :try_start_1
    invoke-virtual {p0, v5, v6}, Ljava/lang/Object;->wait(J)V

    .line 131
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_0

    .line 134
    :cond_3
    iget-object v5, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v5}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v5, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v5}, Landroid/app/Activity;->isDestroyed()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 135
    :cond_4
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 136
    iput-boolean v2, p0, Ll/ۢۢܳ;->ۤ:Z

    const/4 v1, 0x0

    .line 137
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ۡᩴ;

    if-eqz v1, :cond_5

    .line 139
    iget-object v3, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    new-instance v4, Ll/ۚۛܳ;

    const/4 v5, 0x4

    invoke-direct {v4, v5, v1}, Ll/ۚۛܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 145
    :cond_5
    :goto_0
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_6
    :goto_1
    return v1

    .line 150
    :cond_7
    new-instance v0, Ll/֡ۢܳ;

    invoke-direct {v0, p0}, Ll/֡ۢܳ;-><init>(Ll/ۢۢܳ;)V

    iget-object v1, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    .line 185
    invoke-virtual {v0, v1}, Ll/᩷ۙ᩻;->ۙ(Ljava/util/function/BooleanSupplier;)Z

    move-result v0

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Ll/ۢۢܳ;->ۤ:Z

    .line 187
    :catch_0
    :goto_2
    iget-boolean v0, p0, Ll/ۢۢܳ;->ۤ:Z

    xor-int/2addr v0, v2

    return v0
.end method

.method public final ۙ(Ljava/util/List;)Z
    .locals 14

    .line 194
    invoke-static {}, Ll/᩷᩻ܺ;->ۤ()V

    .line 195
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 196
    invoke-virtual {p0}, Ll/ۢۢܳ;->ۙ()Z

    move-result p1

    return p1

    .line 0
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 213
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    new-array v5, v0, [Ljava/lang/CharSequence;

    const/4 v8, 0x0

    const/4 v0, 0x0

    .line 214
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 215
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۘܳ;

    invoke-virtual {v2}, Ll/ܰۘܳ;->ۙ()Ljava/lang/CharSequence;

    move-result-object v2

    aput-object v2, v5, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 217
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const v2, 0x7f120309

    invoke-static {v2}, Ll/᩶᩷ۧ;->ۤ(I)Ljava/lang/CharSequence;

    move-result-object v2

    aput-object v2, v5, v0

    .line 218
    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    const/4 v9, -0x1

    if-nez v0, :cond_3

    .line 300
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v9}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 301
    new-instance v2, Ll/۟ۢܳ;

    invoke-direct {v2, v5, v0}, Ll/۟ۢܳ;-><init>([Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;)V

    iget-object v3, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    .line 318
    invoke-virtual {v2, v3}, Ll/᩷ۙ᩻;->ۙ(Ljava/util/function/BooleanSupplier;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 319
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v9

    goto/16 :goto_3

    .line 223
    :cond_3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_4

    goto/16 :goto_3

    .line 226
    :cond_4
    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v10, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 227
    new-instance v11, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v11, v9}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 228
    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v12}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 229
    iget-object v0, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    new-instance v13, Ll/᩺ۢܳ;

    move-object v2, v13

    move-object v3, p0

    move-object v4, v10

    move-object v6, v11

    move-object v7, v12

    invoke-direct/range {v2 .. v7}, Ll/᩺ۢܳ;-><init>(Ll/ۢۢܳ;Ljava/util/concurrent/atomic/AtomicBoolean;[Ljava/lang/CharSequence;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {v0, v13}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    move-object v0, p0

    .line 278
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    :cond_5
    :goto_2
    :try_start_1
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_7

    const-wide/16 v2, 0xc8

    .line 280
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V

    .line 281
    iget-object v2, p0, Ll/ۢۢܳ;->᩸:Ljava/util/function/BooleanSupplier;

    invoke-interface {v2}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_6

    iget-object v2, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 282
    :cond_6
    invoke-virtual {v10, v8, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    .line 283
    invoke-virtual {v12, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠ۖۧ;

    if-eqz v2, :cond_5

    .line 285
    iget-object v3, p0, Ll/ۢۢܳ;->ۙ:Ll/ܽ֡֫;

    new-instance v4, Ll/᩷ܿ֫;

    const/4 v5, 0x1

    invoke-direct {v4, v5, v2}, Ll/᩷ܿ֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_2

    .line 290
    :cond_7
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 295
    invoke-virtual {v11}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v9

    goto :goto_3

    :catchall_0
    move-exception v2

    .line 290
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v2
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 292
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_8
    :goto_3
    if-gez v9, :cond_9

    .line 201
    iput-boolean v1, p0, Ll/ۢۢܳ;->ۤ:Z

    return v8

    .line 204
    :cond_9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ne v9, v0, :cond_a

    .line 205
    invoke-virtual {p0}, Ll/ۢۢܳ;->ۙ()Z

    move-result p1

    return p1

    .line 207
    :cond_a
    iget-object v0, p0, Ll/ۢۢܳ;->᩷:Ll/ᩳۢܳ;

    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۘܳ;

    .line 210
    iget-object p1, p1, Ll/ܰۘܳ;->᩷:Ljava/lang/String;

    .line 207
    invoke-interface {v0, p1}, Ll/ᩳۢܳ;->᩷(Ljava/lang/String;)V

    return v1
.end method
