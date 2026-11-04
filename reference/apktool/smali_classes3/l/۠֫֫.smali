.class public final Ll/۠֫֫;
.super Ljava/lang/Object;
.source "Q6MT"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:Ll/ۖ֫֫;

.field public final ۟:I

.field public final ܰ:Landroid/graphics/Bitmap;

.field public final ܿ:Ll/ۡۚ֫;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ll/ۡۚ֫;I)V
    .locals 0

    .line 415
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 416
    iput-object p1, p0, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    .line 417
    iput-object p2, p0, Ll/۠֫֫;->ܿ:Ll/ۡۚ֫;

    .line 418
    iput p3, p0, Ll/۠֫֫;->۟:I

    .line 419
    new-instance p1, Ll/ۖ֫֫;

    .line 449
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    iput p2, p1, Ll/ۖ֫֫;->ۙ:I

    .line 419
    iput-object p1, p0, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    return-void
.end method

.method public constructor <init>(Ll/۠֫֫;)V
    .locals 1

    .line 422
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 423
    iget-object v0, p1, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    iput-object v0, p0, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    iget-object v0, p1, Ll/۠֫֫;->ܿ:Ll/ۡۚ֫;

    iput-object v0, p0, Ll/۠֫֫;->ܿ:Ll/ۡۚ֫;

    iget v0, p1, Ll/۠֫֫;->۟:I

    iput v0, p0, Ll/۠֫֫;->۟:I

    .line 424
    iget-object p1, p1, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    iput-object p1, p0, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 438
    iget-object v0, p0, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    monitor-enter v0

    .line 439
    :try_start_0
    iget-boolean v1, p0, Ll/۠֫֫;->᩶:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 440
    iput-boolean v1, p0, Ll/۠֫֫;->᩶:Z

    .line 441
    iget-object v2, p0, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    iget v3, v2, Ll/ۖ֫֫;->ۙ:I

    sub-int/2addr v3, v1

    iput v3, v2, Ll/ۖ֫֫;->ۙ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v3, :cond_2

    .line 443
    :try_start_1
    iget-object v1, p0, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/۠֫֫;->ܰ:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 444
    :cond_1
    :try_start_2
    iget-object v1, p0, Ll/۠֫֫;->ܿ:Ll/ۡۚ֫;

    invoke-virtual {v1}, Ll/ۡۚ֫;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v2, p0, Ll/۠֫֫;->ܿ:Ll/ۡۚ֫;

    invoke-virtual {v2}, Ll/ۡۚ֫;->close()V

    throw v1

    .line 446
    :cond_2
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final ۠᩷()Ll/۠֫֫;
    .locals 3

    .line 429
    iget-object v0, p0, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    monitor-enter v0

    .line 430
    :try_start_0
    iget-boolean v1, p0, Ll/۠֫֫;->᩶:Z

    if-nez v1, :cond_0

    .line 431
    iget-object v1, p0, Ll/۠֫֫;->֡:Ll/ۖ֫֫;

    iget v2, v1, Ll/ۖ֫֫;->ۙ:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Ll/ۖ֫֫;->ۙ:I

    .line 432
    new-instance v1, Ll/۠֫֫;

    invoke-direct {v1, p0}, Ll/۠֫֫;-><init>(Ll/۠֫֫;)V

    monitor-exit v0

    return-object v1

    .line 430
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Bitmap handle is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 433
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
