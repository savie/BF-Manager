.class public final Ll/ۙ֡᩷;
.super Ljava/lang/Object;
.source "R5DS"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final ۟:Ljava/lang/ThreadLocal;

.field public static ᩳ:Ljava/util/Comparator;


# instance fields
.field public final ֡:Ljava/util/ArrayList;

.field public ܰ:J

.field public ܿ:Ljava/util/ArrayList;

.field public ᩶:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۙ֡᩷;->۟:Ljava/lang/ThreadLocal;

    .line 191
    new-instance v0, Ll/۠ܿ᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۙ֡᩷;->ᩳ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙ֡᩷;->ܿ:Ljava/util/ArrayList;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙ֡᩷;->֡:Ljava/util/ArrayList;

    return-void
.end method

.method public static ۙ(Ll/᩻ᩳ᩷;IJ)Ll/ۧᩳ᩷;
    .locals 5

    .line 266
    iget-object v0, p0, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v0}, Ll/ܳܿ᩷;->᩷()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 268
    iget-object v3, p0, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    invoke-virtual {v3, v2}, Ll/ܳܿ᩷;->ۤ(I)Landroid/view/View;

    move-result-object v3

    .line 269
    invoke-static {v3}, Ll/᩻ᩳ᩷;->᩷(Landroid/view/View;)Ll/ۧᩳ᩷;

    move-result-object v3

    .line 271
    iget v4, v3, Ll/ۧᩳ᩷;->mPosition:I

    if-ne v4, p1, :cond_0

    invoke-virtual {v3}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 285
    :cond_1
    iget-object v0, p0, Ll/᩻ᩳ᩷;->mRecycler:Ll/ۖ۟᩷;

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v4, p2, v2

    if-nez v4, :cond_2

    .line 290
    :try_start_0
    invoke-static {}, Ll/᩶ۢ;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "RV Prefetch forced - needed next frame"

    .line 291
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 293
    :cond_2
    invoke-virtual {p0}, Ll/᩻ᩳ᩷;->onEnterLayoutOrScroll()V

    .line 294
    invoke-virtual {v0, p1, p2, p3}, Ll/ۖ۟᩷;->ۙ(IJ)Ll/ۧᩳ᩷;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 298
    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isBound()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result p2

    if-nez p2, :cond_3

    .line 301
    iget-object p2, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {v0, p2}, Ll/ۖ۟᩷;->ۙ(Landroid/view/View;)V

    goto :goto_1

    .line 307
    :cond_3
    invoke-virtual {v0, p1, v1}, Ll/ۖ۟᩷;->ۙ(Ll/ۧᩳ᩷;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    :cond_4
    :goto_1
    invoke-virtual {p0, v1}, Ll/᩻ᩳ᩷;->onExitLayoutOrScroll(Z)V

    .line 312
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 311
    invoke-virtual {p0, v1}, Ll/᩻ᩳ᩷;->onExitLayoutOrScroll(Z)V

    .line 312
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 313
    throw p1
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 383
    iget-object v0, p0, Ll/ۙ֡᩷;->ܿ:Ljava/util/ArrayList;

    const-wide/16 v1, 0x0

    :try_start_0
    const-string v3, "RV Prefetch"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 385
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 392
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move-wide v5, v1

    :goto_0
    if-ge v4, v3, :cond_2

    .line 395
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻ᩳ᩷;

    .line 396
    invoke-virtual {v7}, Landroid/view/View;->getWindowVisibility()I

    move-result v8

    if-nez v8, :cond_1

    .line 397
    invoke-virtual {v7}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    cmp-long v0, v5, v1

    if-nez v0, :cond_3

    goto :goto_1

    .line 406
    :cond_3
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v5, v6}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    iget-wide v5, p0, Ll/ۙ֡᩷;->ܰ:J

    add-long/2addr v3, v5

    .line 408
    invoke-virtual {p0, v3, v4}, Ll/ۙ֡᩷;->ۙ(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 412
    :goto_1
    iput-wide v1, p0, Ll/ۙ֡᩷;->᩶:J

    .line 413
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    .line 412
    iput-wide v1, p0, Ll/ۙ֡᩷;->᩶:J

    .line 413
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 414
    throw v0
.end method

.method public final ۙ(J)V
    .locals 13

    .line 218
    iget-object v0, p0, Ll/ۙ֡᩷;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 221
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻ᩳ᩷;

    .line 222
    invoke-virtual {v5}, Landroid/view/View;->getWindowVisibility()I

    move-result v6

    if-nez v6, :cond_0

    .line 223
    iget-object v6, v5, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    invoke-virtual {v6, v5, v2}, Ll/ۜܿ᩷;->ۙ(Ll/᩻ᩳ᩷;Z)V

    .line 224
    iget-object v5, v5, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    iget v5, v5, Ll/ۜܿ᩷;->ۙ:I

    add-int/2addr v4, v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 229
    :cond_1
    iget-object v2, p0, Ll/ۙ֡᩷;->֡:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->ensureCapacity(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v3, v1, :cond_6

    .line 232
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻ᩳ᩷;

    .line 233
    invoke-virtual {v5}, Landroid/view/View;->getWindowVisibility()I

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_5

    .line 238
    :cond_2
    iget-object v6, v5, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    .line 239
    iget v7, v6, Ll/ۜܿ᩷;->ۤ:I

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    iget v8, v6, Ll/ۜܿ᩷;->᩸:I

    .line 240
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v8

    add-int/2addr v8, v7

    const/4 v7, 0x0

    .line 241
    :goto_2
    iget v9, v6, Ll/ۜܿ᩷;->ۙ:I

    mul-int/lit8 v9, v9, 0x2

    if-ge v7, v9, :cond_5

    .line 243
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-lt v4, v9, :cond_3

    .line 244
    new-instance v9, Ll/۬ܿ᩷;

    invoke-direct {v9}, Ll/۬ܿ᩷;-><init>()V

    .line 245
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 247
    :cond_3
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/۬ܿ᩷;

    .line 249
    :goto_3
    iget-object v10, v6, Ll/ۜܿ᩷;->᩷:[I

    add-int/lit8 v11, v7, 0x1

    aget v11, v10, v11

    if-gt v11, v8, :cond_4

    const/4 v12, 0x1

    goto :goto_4

    :cond_4
    const/4 v12, 0x0

    .line 251
    :goto_4
    iput-boolean v12, v9, Ll/۬ܿ᩷;->᩷:Z

    .line 252
    iput v8, v9, Ll/۬ܿ᩷;->ᩴ:I

    .line 253
    iput v11, v9, Ll/۬ܿ᩷;->ۙ:I

    .line 254
    iput-object v5, v9, Ll/۬ܿ᩷;->᩸:Ll/᩻ᩳ᩷;

    .line 255
    aget v10, v10, v7

    iput v10, v9, Ll/۬ܿ᩷;->ۤ:I

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v7, v7, 0x2

    goto :goto_2

    :cond_5
    :goto_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 262
    :cond_6
    sget-object v0, Ll/ۙ֡᩷;->ᩳ:Ljava/util/Comparator;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v0, 0x0

    .line 365
    :goto_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_e

    .line 366
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬ܿ᩷;

    .line 367
    iget-object v3, v1, Ll/۬ܿ᩷;->᩸:Ll/᩻ᩳ᩷;

    if-nez v3, :cond_7

    goto/16 :goto_b

    .line 353
    :cond_7
    iget-boolean v4, v1, Ll/۬ܿ᩷;->᩷:Z

    const-wide v5, 0x7fffffffffffffffL

    if-eqz v4, :cond_8

    move-wide v7, v5

    goto :goto_7

    :cond_8
    move-wide v7, p1

    .line 354
    :goto_7
    iget v4, v1, Ll/۬ܿ᩷;->ۤ:I

    invoke-static {v3, v4, v7, v8}, Ll/ۙ֡᩷;->ۙ(Ll/᩻ᩳ᩷;IJ)Ll/ۧᩳ᩷;

    move-result-object v3

    if-eqz v3, :cond_d

    .line 356
    iget-object v4, v3, Ll/ۧᩳ᩷;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_d

    .line 358
    invoke-virtual {v3}, Ll/ۧᩳ᩷;->isBound()Z

    move-result v4

    if-eqz v4, :cond_d

    .line 359
    invoke-virtual {v3}, Ll/ۧᩳ᩷;->isInvalid()Z

    move-result v4

    if-nez v4, :cond_d

    .line 360
    iget-object v3, v3, Ll/ۧᩳ᩷;->mNestedRecyclerView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ᩳ᩷;

    if-nez v3, :cond_9

    goto :goto_a

    .line 323
    :cond_9
    iget-boolean v4, v3, Ll/᩻ᩳ᩷;->mDataSetHasChangedAfterLayout:Z

    if-eqz v4, :cond_a

    iget-object v4, v3, Ll/᩻ᩳ᩷;->mChildHelper:Ll/ܳܿ᩷;

    .line 324
    invoke-virtual {v4}, Ll/ܳܿ᩷;->᩷()I

    move-result v4

    if-eqz v4, :cond_a

    .line 327
    invoke-virtual {v3}, Ll/᩻ᩳ᩷;->removeAndRecycleViews()V

    .line 331
    :cond_a
    iget-object v4, v3, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    const/4 v7, 0x1

    .line 332
    invoke-virtual {v4, v3, v7}, Ll/ۜܿ᩷;->ۙ(Ll/᩻ᩳ᩷;Z)V

    .line 334
    iget v7, v4, Ll/ۜܿ᩷;->ۙ:I

    if-eqz v7, :cond_d

    cmp-long v7, p1, v5

    if-nez v7, :cond_b

    :try_start_0
    const-string v5, "RV Nested Prefetch"

    goto :goto_8

    :cond_b
    const-string v5, "RV Nested Prefetch forced - needed next frame"

    .line 336
    :goto_8
    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 339
    iget-object v5, v3, Ll/᩻ᩳ᩷;->mState:Ll/ܳᩳ᩷;

    iget-object v6, v3, Ll/᩻ᩳ᩷;->mAdapter:Ll/۫۟᩷;

    const/4 v7, 0x1

    .line 13594
    iput v7, v5, Ll/ܳᩳ᩷;->ۚ:I

    .line 13595
    invoke-virtual {v6}, Ll/۫۟᩷;->getItemCount()I

    move-result v6

    iput v6, v5, Ll/ܳᩳ᩷;->۫:I

    const/4 v6, 0x0

    .line 13596
    iput-boolean v6, v5, Ll/ܳᩳ᩷;->ᩴ:Z

    .line 13597
    iput-boolean v6, v5, Ll/ܳᩳ᩷;->ܶ:Z

    .line 13598
    iput-boolean v6, v5, Ll/ܳᩳ᩷;->ܳ:Z

    const/4 v5, 0x0

    .line 340
    :goto_9
    iget v6, v4, Ll/ۜܿ᩷;->ۙ:I

    mul-int/lit8 v6, v6, 0x2

    if-ge v5, v6, :cond_c

    .line 343
    iget-object v6, v4, Ll/ۜܿ᩷;->᩷:[I

    aget v6, v6, v5

    .line 344
    invoke-static {v3, v6, p1, p2}, Ll/ۙ֡᩷;->ۙ(Ll/᩻ᩳ᩷;IJ)Ll/ۧᩳ᩷;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v5, v5, 0x2

    goto :goto_9

    .line 347
    :cond_c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_a

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 348
    throw p1

    :cond_d
    :goto_a
    const/4 v3, 0x0

    .line 47
    iput-boolean v3, v1, Ll/۬ܿ᩷;->᩷:Z

    .line 48
    iput v3, v1, Ll/۬ܿ᩷;->ᩴ:I

    .line 49
    iput v3, v1, Ll/۬ܿ᩷;->ۙ:I

    const/4 v4, 0x0

    .line 50
    iput-object v4, v1, Ll/۬ܿ᩷;->᩸:Ll/᩻ᩳ᩷;

    .line 51
    iput v3, v1, Ll/۬ܿ᩷;->ۤ:I

    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_6

    :cond_e
    :goto_b
    return-void
.end method

.method public final ۙ(Ll/᩻ᩳ᩷;II)V
    .locals 5

    .line 178
    invoke-virtual {p1}, Ll/᩻ᩳ᩷;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 179
    sget-boolean v0, Ll/᩻ᩳ᩷;->sDebugAssertionsEnabled:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۙ֡᩷;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 180
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "attempting to post unregistered view!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 182
    :cond_1
    :goto_0
    iget-wide v0, p0, Ll/ۙ֡᩷;->᩶:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_2

    .line 183
    invoke-virtual {p1}, Ll/᩻ᩳ᩷;->getNanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۙ֡᩷;->᩶:J

    .line 184
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 188
    :cond_2
    iget-object p1, p1, Ll/᩻ᩳ᩷;->mPrefetchRegistry:Ll/ۜܿ᩷;

    .line 75
    iput p2, p1, Ll/ۜܿ᩷;->ۤ:I

    .line 76
    iput p3, p1, Ll/ۜܿ᩷;->᩸:I

    return-void
.end method
