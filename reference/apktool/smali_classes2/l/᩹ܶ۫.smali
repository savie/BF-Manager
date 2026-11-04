.class public Ll/᩹ܶ۫;
.super Ll/ܳۙ᩻;
.source "OAIH"


# static fields
.field public static final synthetic ۤ᩷:I


# instance fields
.field public ֨ۙ:Ll/᩷ۗ۫;

.field public ۖۙ:Z

.field public ۙ᩷:Ll/۫ۛᩴ;

.field public ۜۙ:Z

.field public ۟ۙ:Ll/ᩴ۠ۧ;

.field public ۠ۙ:Ljava/util/List;

.field public ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

.field public ۢۙ:Ll/ۘ᩷۫;

.field public ۬ۙ:Ljava/util/List;

.field public ᩳۙ:Ll/ۗ᩷۫;

.field public ᩷᩷:Ll/ᩳۛ۫;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 80
    invoke-direct {p0}, Ll/ܳۙ᩻;-><init>()V

    .line 82
    invoke-static {}, Ll/᩶᩷ۧ;->ۨ()Z

    move-result v0

    iput-boolean v0, p0, Ll/᩹ܶ۫;->ۜۙ:Z

    .line 0
    invoke-static {}, Ll/֨᩵ᩴ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 83
    iput-object v0, p0, Ll/᩹ܶ۫;->۬ۙ:Ljava/util/List;

    .line 86
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/᩹ܶ۫;->ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 0
    invoke-static {}, Ll/֨᩵ᩴ;->ۙ()Ljava/util/List;

    move-result-object v0

    .line 87
    iput-object v0, p0, Ll/᩹ܶ۫;->۠ۙ:Ljava/util/List;

    .line 88
    new-instance v0, Ll/۫ۛᩴ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/۫ۛᩴ;-><init>(I)V

    iput-object v0, p0, Ll/᩹ܶ۫;->ۙ᩷:Ll/۫ۛᩴ;

    .line 89
    new-instance v0, Ll/ᩴ۠ۧ;

    invoke-direct {v0}, Ll/ᩴ۠ۧ;-><init>()V

    iput-object v0, p0, Ll/᩹ܶ۫;->۟ۙ:Ll/ᩴ۠ۧ;

    .line 95
    new-instance v0, Ll/ܽܶ۫;

    invoke-direct {v0, p0}, Ll/ܽܶ۫;-><init>(Ll/᩹ܶ۫;)V

    iput-object v0, p0, Ll/᩹ܶ۫;->ᩳۙ:Ll/ۗ᩷۫;

    return-void
.end method

.method private ۤ(Ll/ۛ᩷۫;)V
    .locals 13

    .line 320
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v0

    if-nez v0, :cond_a

    iget-object v0, p0, Ll/᩹ܶ۫;->ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 323
    :cond_0
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܳۙ᩻;->᩷(Ljava/lang/CharSequence;)V

    .line 324
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۘ()V

    .line 326
    :try_start_0
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܶ()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ll/᩹ܶ۫;->۟ۙ:Ll/ᩴ۠ۧ;

    if-eqz v0, :cond_4

    .line 328
    :try_start_1
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩵()Z

    move-result v0

    if-nez v0, :cond_2

    .line 329
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩻()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 330
    sget-object v2, Ll/ۨ۠ۧ;->ᩳ:Ll/ۨ۠ۧ;

    invoke-virtual {v1, v0, v2}, Ll/ᩴ۠ۧ;->ۙ(Ll/᩷ۨᩴ;Ll/ۨ۠ۧ;)V

    .line 331
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۡ()V

    .line 332
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۤ()Ll/᩺᩵ᩴ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 334
    invoke-virtual {v1, v0}, Ll/᩺᩵ᩴ;->᩸(Ll/᩷ۨᩴ;)V

    .line 336
    :cond_1
    iget-boolean v1, p0, Ll/᩹ܶ۫;->ۜۙ:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ۛ᩷()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 337
    iget-object v1, p0, Ll/᩹ܶ۫;->۬ۙ:Ljava/util/List;

    new-instance v2, Ll/ܳ᩵۫;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0, p1}, Ll/ܳ᩵۫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 342
    :cond_2
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩺()V

    .line 343
    iget-object v0, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {v0}, Ll/֫ۤ۫;->֫()V

    .line 344
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۧ()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 345
    iget-object v0, p0, Ll/᩹ܶ۫;->۠ۙ:Ljava/util/List;

    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 348
    :cond_3
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۙ()Ll/᩵᩷۫;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵᩷۫;->ܿ()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩷۫;

    .line 349
    invoke-direct {p0, v1}, Ll/᩹ܶ۫;->ۤ(Ll/ۛ᩷۫;)V

    goto :goto_0

    .line 353
    :cond_4
    invoke-virtual {p1}, Ll/ۛ᩷۫;->֫()Ljava/lang/String;

    move-result-object v3

    .line 355
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۤ()Ll/᩺᩵ᩴ;

    move-result-object v0

    .line 356
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۧ()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۧ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    .line 360
    :goto_1
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩵()Z

    move-result v4

    if-nez v4, :cond_6

    .line 362
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩻()Ll/᩷ۨᩴ;

    move-result-object v4

    .line 363
    sget-object v5, Ll/ۨ۠ۧ;->ᩳ:Ll/ۨ۠ۧ;

    invoke-virtual {v1, v4, v5}, Ll/ᩴ۠ۧ;->ۙ(Ll/᩷ۨᩴ;Ll/ۨ۠ۧ;)V

    goto :goto_2

    .line 364
    :cond_6
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩹()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_8

    .line 366
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩻()Ll/᩷ۨᩴ;

    move-result-object v4

    .line 1147
    invoke-virtual {v4, v5}, Ll/᩷ۨᩴ;->ۙ(Z)Ll/᩷ۨᩴ;

    move-result-object v4

    .line 367
    sget-object v5, Ll/ۨ۠ۧ;->ᩳ:Ll/ۨ۠ۧ;

    invoke-virtual {v1, v4, v5}, Ll/ᩴ۠ۧ;->ۙ(Ll/᩷ۨᩴ;Ll/ۨ۠ۧ;)V

    if-eqz v2, :cond_7

    .line 369
    invoke-virtual {v4}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 370
    invoke-virtual {p1, v2}, Ll/ۛ᩷۫;->᩸(Ljava/lang/String;)V

    :cond_7
    :goto_2
    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v10, v0

    move-object v9, v2

    const/4 v11, 0x0

    const/4 v12, 0x0

    goto :goto_3

    .line 374
    :cond_8
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩻()Ll/᩷ۨᩴ;

    move-result-object v0

    .line 375
    sget-object v4, Ll/ۨ۠ۧ;->ᩳ:Ll/ۨ۠ۧ;

    invoke-virtual {v1, v0, v4}, Ll/ᩴ۠ۧ;->ۙ(Ll/᩷ۨᩴ;Ll/ۨ۠ۧ;)V

    .line 377
    new-instance v1, Ll/᩺᩵ᩴ;

    invoke-direct {v1}, Ll/᩺᩵ᩴ;-><init>()V

    .line 378
    invoke-virtual {v1, v0}, Ll/᩺᩵ᩴ;->᩷(Ll/᩷ۨᩴ;)V

    .line 380
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۛ()Z

    move-result v4

    const/4 v5, 0x1

    move-object v10, v1

    move-object v9, v2

    move v12, v4

    const/4 v11, 0x1

    move-object v4, v0

    .line 384
    :goto_3
    iget-object v1, p0, Ll/᩹ܶ۫;->֨ۙ:Ll/᩷ۗ۫;

    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ll/ۛ᩷۫;->۫()J

    move-result-wide v5

    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܽ()J

    move-result-wide v7

    invoke-virtual/range {v1 .. v12}, Ll/᩷ۗ۫;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩷ۨᩴ;JJLjava/lang/String;Ll/᩺᩵ᩴ;ZZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 387
    :cond_9
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩺()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩺()V

    .line 388
    throw v0

    :cond_a
    :goto_4
    return-void
.end method

.method private ᩷(Ll/ۛ᩷۫;)V
    .locals 2

    .line 392
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 393
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ۙ()Ll/᩵᩷۫;

    move-result-object v0

    .line 394
    invoke-virtual {v0}, Ll/᩵᩷۫;->֡()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 395
    invoke-virtual {v0}, Ll/᩵᩷۫;->ܿ()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۛ᩷۫;

    .line 396
    invoke-direct {p0, v0}, Ll/᩹ܶ۫;->᩷(Ll/ۛ᩷۫;)V

    goto :goto_0

    :cond_0
    const v1, 0x7f120a3b

    .line 399
    invoke-virtual {p0, v1}, Ll/ᩳۜۧ;->᩻(I)V

    .line 400
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ᩳۜۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 401
    iget-object p1, p0, Ll/᩹ܶ۫;->᩷᩷:Ll/ᩳۛ۫;

    invoke-static {p1, v0}, Ll/᩶ܶ۫;->ۙ(Ll/ᩳۛ۫;Ll/᩵᩷۫;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const v0, 0x7f120956

    .line 126
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    const-string v0, "..."

    .line 127
    invoke-virtual {p0, v0}, Ll/ܳۙ᩻;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Lbin/mt/plus/Main;Ll/۠ۨܳ;Ll/۠ۨܳ;Ll/ۨۜۧ;)V
    .locals 0

    .line 408
    invoke-virtual {p4}, Ll/ۨۜۧ;->᩸()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p2}, Ll/ᩳۜۧ;->᩷(Ll/۠ۨܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 409
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܳ()V

    .line 410
    iget-boolean p1, p0, Ll/᩹ܶ۫;->ۖۙ:Z

    if-eqz p1, :cond_0

    .line 411
    invoke-virtual {p2}, Ll/۠ۨܳ;->ܽۙ()V

    .line 414
    :cond_0
    iget-object p1, p0, Ll/᩹ܶ۫;->۠ۙ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p3}, Ll/ᩳۜۧ;->ۙ(Ll/۠ۨܳ;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 415
    invoke-virtual {p3, p1}, Ll/۠ۨܳ;->ۙ(Ljava/util/Collection;)V

    .line 416
    invoke-virtual {p3}, Ll/۠ۨܳ;->ܽۙ()V

    :cond_1
    return-void
.end method

.method public final ۧ()Ll/ۨۜۧ;
    .locals 5

    const-string v0, "ARG_PATHS"

    .line 141
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->ۗ(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const-string v1, "targetPath"

    .line 134
    invoke-virtual {p0, v1}, Ll/ᩳۜۧ;->᩹(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "moveMode"

    .line 135
    invoke-virtual {p0, v2}, Ll/ᩳۜۧ;->ۤ(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Ll/᩹ܶ۫;->ۖۙ:Z

    .line 136
    invoke-virtual {p0}, Ll/ᩳۜۧ;->ۙۙ()Ll/۟ۘܳ;

    move-result-object v2

    check-cast v2, Ll/ᩳۛ۫;

    iput-object v2, p0, Ll/᩹ܶ۫;->᩷᩷:Ll/ᩳۛ۫;

    .line 147
    sget-object v2, Ll/ۨ۠ۧ;->֡:Ll/ۨ۠ۧ;

    invoke-static {v1, v2}, Ll/ۛ۠ۧ;->ۙ(Ljava/lang/String;Ll/ۨ۠ۧ;)V

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    .line 148
    invoke-static {v1, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩷ۨᩴ;->ۡ()V

    .line 149
    new-instance v3, Ll/ܿ᩸۫;

    .line 25
    invoke-direct {v3, v2}, Ll/ܿ᩸۫;-><init>(Z)V

    .line 149
    iget-object v4, p0, Ll/᩹ܶ۫;->ᩳۙ:Ll/ۗ᩷۫;

    invoke-static {v1, v3, v4}, Ll/ۘ᩷۫;->ۙ(Ljava/lang/String;Ll/ܿ᩸۫;Ll/ۗ᩷۫;)Ll/ۘ᩷۫;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    .line 150
    iget-object v3, p0, Ll/᩹ܶ۫;->᩷᩷:Ll/ᩳۛ۫;

    iget-object v3, v3, Ll/ᩳۛ۫;->᩶:Ll/֡ۗ۫;

    iget-boolean v3, v3, Ll/֡ۗ۫;->۬:Z

    if-nez v3, :cond_0

    .line 151
    invoke-virtual {v1}, Ll/ۘ᩷۫;->᩻()V

    .line 153
    :cond_0
    iget-object v1, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    iget-object v3, p0, Ll/᩹ܶ۫;->᩷᩷:Ll/ᩳۛ۫;

    const/4 v4, 0x1

    invoke-virtual {v1, v0, v3, v2, v4}, Ll/ۘ᩷۫;->ۙ([Ljava/lang/String;Ll/۟ۘܳ;ZZ)V

    .line 161
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_2

    .line 162
    new-instance v0, Ll/᩵ܰᩴ;

    invoke-direct {v0}, Ll/᩵ܰᩴ;-><init>()V

    .line 163
    iget-object v1, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {v1}, Ll/ۘ᩷۫;->ܺ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛ᩷۫;

    .line 164
    invoke-virtual {v2, v0, v4}, Ll/ۛ᩷۫;->ۙ(Ll/᩵ܰᩴ;Z)V

    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {v0}, Ll/᩵ܰᩴ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 167
    invoke-virtual {p0}, Ll/ᩳۜۧ;->cancel()V

    .line 169
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 172
    :cond_2
    iget-boolean v0, p0, Ll/᩹ܶ۫;->ۖۙ:Z

    if-eqz v0, :cond_3

    const v0, 0x7f120805

    goto :goto_1

    :cond_3
    const v0, 0x7f1202d4

    :goto_1
    invoke-virtual {p0, v0}, Ll/ᩳۜۧ;->᩻(I)V

    .line 173
    iget-object v0, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {p0, v0}, Ll/ܳۙ᩻;->᩷(Ll/֫ۤ۫;)V

    .line 174
    invoke-virtual {p0, v4}, Ll/ܳۙ᩻;->᩸(Z)V

    .line 175
    iget-object v0, p0, Ll/᩹ܶ۫;->۟ۙ:Ll/ᩴ۠ۧ;

    invoke-virtual {v0}, Ll/ᩴ۠ۧ;->ۙ()V

    .line 176
    iget-object v0, p0, Ll/᩹ܶ۫;->ۙ᩷:Ll/۫ۛᩴ;

    invoke-virtual {v0}, Ll/۫ۛᩴ;->᩷()V

    .line 178
    new-instance v0, Ll/᩷ۗ۫;

    iget-object v1, p0, Ll/᩹ܶ۫;->᩷᩷:Ll/ᩳۛ۫;

    new-instance v2, Ll/ܶܶ۫;

    invoke-direct {v2, p0}, Ll/ܶܶ۫;-><init>(Ll/᩹ܶ۫;)V

    invoke-direct {v0, v1, v2}, Ll/᩷ۗ۫;-><init>(Ll/ᩳۛ۫;Ll/᩹ܿᩴ;)V

    iput-object v0, p0, Ll/᩹ܶ۫;->֨ۙ:Ll/᩷ۗ۫;

    .line 207
    iget-object v0, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {v0}, Ll/ۘ᩷۫;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    iget-object v2, p0, Ll/᩹ܶ۫;->ۡۙ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩷۫;

    .line 208
    invoke-direct {p0, v1}, Ll/᩹ܶ۫;->ۤ(Ll/ۛ᩷۫;)V

    .line 209
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 214
    :cond_5
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 216
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 218
    :cond_6
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_d

    .line 223
    iget-object v0, p0, Ll/᩹ܶ۫;->֨ۙ:Ll/᩷ۗ۫;

    new-instance v1, Ll/ܺܶ۫;

    invoke-direct {v1, p0}, Ll/ܺܶ۫;-><init>(Ll/᩹ܶ۫;)V

    invoke-virtual {v0, v1}, Ll/᩷ۗ۫;->ۙ(Ll/۬᩹۫;)V

    .line 259
    iget-object v0, p0, Ll/᩹ܶ۫;->֨ۙ:Ll/᩷ۗ۫;

    invoke-virtual {v0}, Ll/᩷ۗ۫;->ۤ()V

    .line 261
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 263
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 265
    :cond_7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_c

    .line 268
    iget-boolean v0, p0, Ll/᩹ܶ۫;->ۖۙ:Z

    if-eqz v0, :cond_9

    .line 270
    iget-object v0, p0, Ll/᩹ܶ۫;->ۢۙ:Ll/ۘ᩷۫;

    invoke-virtual {v0}, Ll/ۘ᩷۫;->ܺ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۛ᩷۫;

    .line 271
    invoke-direct {p0, v1}, Ll/᩹ܶ۫;->᩷(Ll/ۛ᩷۫;)V

    .line 272
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 274
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 278
    :cond_9
    iget-object v0, p0, Ll/᩹ܶ۫;->۬ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    .line 279
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 280
    invoke-virtual {p0}, Ll/ᩳۜۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 282
    invoke-static {}, Ll/ۨۜۧ;->ᩴ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    :cond_b
    const-wide/16 v0, 0x64

    .line 285
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 287
    invoke-static {}, Ll/ۨۜۧ;->ܳ()Ll/ۨۜۧ;

    move-result-object v0

    return-object v0

    .line 266
    :cond_c
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 219
    :cond_d
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ܶۙ()Ljava/lang/CharSequence;
    .locals 2

    .line 120
    iget-boolean v0, p0, Ll/᩹ܶ۫;->ۖۙ:Z

    if-eqz v0, :cond_0

    const v0, 0x7f120bf5

    goto :goto_0

    :cond_0
    const v0, 0x7f120bf1

    :goto_0
    const-string v1, "targetPath"

    .line 121
    invoke-virtual {p0, v1}, Ll/ᩳۜۧ;->ۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 655
    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ll/ۨۜۧ;)V
    .locals 0

    .line 422
    iget-object p1, p0, Ll/᩹ܶ۫;->֨ۙ:Ll/᩷ۗ۫;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩷ۗ۫;->ۙ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 423
    iget-object p1, p0, Ll/᩹ܶ۫;->֨ۙ:Ll/᩷ۗ۫;

    invoke-virtual {p1}, Ll/᩷ۗ۫;->᩷()V

    .line 425
    :cond_0
    iget-object p1, p0, Ll/᩹ܶ۫;->ۙ᩷:Ll/۫ۛᩴ;

    invoke-virtual {p1}, Ll/۫ۛᩴ;->ۤ()V

    .line 426
    invoke-static {}, Ll/ۛۤۧ;->᩷()V

    .line 427
    iget-boolean p1, p0, Ll/᩹ܶ۫;->ۖۙ:Z

    if-eqz p1, :cond_1

    .line 428
    iget-object p1, p0, Ll/᩹ܶ۫;->᩷᩷:Ll/ᩳۛ۫;

    invoke-virtual {p1}, Ll/ᩳۛ۫;->ܶ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۛۤۧ;->ۙ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ᩺()Ll/ۨ֡֫;
    .locals 1

    .line 115
    sget-object v0, Ll/ܰ۬ۧ;->ۨ:Ll/ۨ֡֫;

    return-object v0
.end method
