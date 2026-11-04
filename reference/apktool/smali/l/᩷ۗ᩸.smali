.class public final Ll/᩷ۗ᩸;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ܰ:[B

.field public final ᩶:Ll/ܿۢ᩸;


# direct methods
.method public constructor <init>([BLl/ܿۢ᩸;)V
    .locals 0

    .line 426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۗ᩸;->ܰ:[B

    iput-object p2, p0, Ll/᩷ۗ᩸;->᩶:Ll/ܿۢ᩸;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 440
    :try_start_0
    iget-object v1, p0, Ll/᩷ۗ᩸;->ܰ:[B

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Ll/᩷ۗ᩸;->ܰ:[B

    iget-object v1, p0, Ll/᩷ۗ᩸;->᩶:Ll/ܿۢ᩸;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ܿۢ᩸;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 441
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۙ()[B
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 436
    :try_start_0
    iget-object v1, p0, Ll/᩷ۗ᩸;->ܰ:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 437
    monitor-exit v0

    return-object v1

    .line 436
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fragment buffer is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 437
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
