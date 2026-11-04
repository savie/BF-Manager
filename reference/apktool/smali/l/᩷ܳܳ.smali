.class public final Ll/᩷ܳܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ֡:J

.field public volatile ܰ:Z

.field public final ܿ:Ll/ۘܳܳ;

.field public final ᩶:I


# direct methods
.method public constructor <init>(IJLl/ۘܳܳ;)V
    .locals 0

    .line 6293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6294
    iput-object p4, p0, Ll/᩷ܳܳ;->ܿ:Ll/ۘܳܳ;

    .line 6295
    iput-wide p2, p0, Ll/᩷ܳܳ;->֡:J

    .line 6296
    iput p1, p0, Ll/᩷ܳܳ;->᩶:I

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩷ܳܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩷ܳܳ;->᩶:I

    return p0
.end method

.method public static bridge synthetic ۤ(Ll/᩷ܳܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/᩷ܳܳ;->֡:J

    return-wide v0
.end method

.method public static bridge synthetic ᩷(Ll/᩷ܳܳ;)Ll/ۘܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩷ܳܳ;->ܿ:Ll/ۘܳܳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 4

    move-object v0, p0

    .line 6329
    monitor-enter v0

    .line 6330
    :try_start_0
    iget-boolean v1, p0, Ll/᩷ܳܳ;->ܰ:Z

    if-eqz v1, :cond_0

    .line 6331
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 6333
    iput-boolean v1, p0, Ll/᩷ܳܳ;->ܰ:Z

    .line 6334
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6335
    iget-object v0, p0, Ll/᩷ܳܳ;->ܿ:Ll/ۘܳܳ;

    iget-wide v1, p0, Ll/᩷ܳܳ;->֡:J

    iget v3, p0, Ll/᩷ܳܳ;->᩶:I

    invoke-virtual {v0, v3, v1, v2}, Ll/ۘܳܳ;->ۤ(IJ)V

    return-void

    :catchall_0
    move-exception v1

    .line 6334
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final isOpen()Z
    .locals 1

    .line 6324
    iget-boolean v0, p0, Ll/᩷ܳܳ;->ܰ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩷ܳܳ;->ܿ:Ll/ۘܳܳ;

    invoke-static {v0}, Ll/ۘܳܳ;->ۙ(Ll/ۘܳܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final length()I
    .locals 1

    .line 6300
    iget v0, p0, Ll/᩷ܳܳ;->᩶:I

    return v0
.end method

.method public final ۙ(I[BII)V
    .locals 10

    .line 6339
    invoke-virtual {p0}, Ll/᩷ܳܳ;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6318
    iget v0, p0, Ll/᩷ܳܳ;->᩶:I

    invoke-static {v0, p1, p4}, Ll/۬ܳܳ;->᩷(III)V

    .line 6319
    array-length v0, p2

    invoke-static {v0, p3, p4}, Ll/۬ܳܳ;->ۙ(III)V

    .line 6320
    iget-wide v0, p0, Ll/᩷ܳܳ;->֡:J

    int-to-long v2, p1

    add-long v5, v0, v2

    iget-object v4, p0, Ll/᩷ܳܳ;->ܿ:Ll/ۘܳܳ;

    move-object v7, p2

    move v8, p3

    move v9, p4

    invoke-virtual/range {v4 .. v9}, Ll/ۘܳܳ;->ۙ(J[BII)V

    return-void

    .line 6340
    :cond_0
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method

.method public final ᩷(I[BII)V
    .locals 10

    .line 6339
    invoke-virtual {p0}, Ll/᩷ܳܳ;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6310
    iget v0, p0, Ll/᩷ܳܳ;->᩶:I

    invoke-static {v0, p1, p4}, Ll/۬ܳܳ;->᩷(III)V

    .line 6311
    array-length v0, p2

    invoke-static {v0, p3, p4}, Ll/۬ܳܳ;->ۙ(III)V

    .line 6312
    iget-wide v0, p0, Ll/᩷ܳܳ;->֡:J

    int-to-long v2, p1

    add-long v5, v0, v2

    iget-object v4, p0, Ll/᩷ܳܳ;->ܿ:Ll/ۘܳܳ;

    move-object v7, p2

    move v8, p3

    move v9, p4

    invoke-virtual/range {v4 .. v9}, Ll/ۘܳܳ;->᩷(J[BII)V

    return-void

    .line 6340
    :cond_0
    new-instance p1, Ljava/nio/channels/ClosedChannelException;

    invoke-direct {p1}, Ljava/nio/channels/ClosedChannelException;-><init>()V

    throw p1
.end method
