.class public final Ll/᩷ۤۚ;
.super Ljava/lang/Object;
.source "56BZ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ܰ:Ll/ۜ᩷ۚ;


# direct methods
.method public constructor <init>(Ll/ۜ᩷ۚ;)V
    .locals 0

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    iput-object p1, p0, Ll/᩷ۤۚ;->ܰ:Ll/ۜ᩷ۚ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 8

    .line 233
    iget-object v1, p0, Ll/᩷ۤۚ;->ܰ:Ll/ۜ᩷ۚ;

    if-eqz v1, :cond_1

    .line 306
    iget-object v0, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    monitor-enter v0

    .line 307
    :try_start_0
    iget-boolean v2, v1, Ll/ۜ᩷ۚ;->ᩴ:Z

    if-nez v2, :cond_0

    iget v2, v1, Ll/ۜ᩷ۚ;->ۗ:I

    if-lez v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Ll/ۜ᩷ۚ;->ۗ:I

    if-nez v2, :cond_0

    .line 308
    iget-wide v2, v1, Ll/ۜ᩷ۚ;->᩵:J

    iget-object v4, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {v4}, Ll/ۤۤۚ;->ۤ(Ll/ۤۤۚ;)Ljava/util/function/LongSupplier;

    move-result-object v4

    check-cast v4, Ll/ۡ᩻ܳ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, v1, Ll/ۜ᩷ۚ;->ۨ:J

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, v1, Ll/ۜ᩷ۚ;->᩵:J

    .line 309
    sget-object v2, Ll/ۙۤۚ;->ܿ:Ll/ۙۤۚ;

    iput-object v2, v1, Ll/ۜ᩷ۚ;->ܺ:Ll/ۙۤۚ;

    .line 310
    iget-object v1, v1, Ll/ۜ᩷ۚ;->ۚ:Ll/ۤۤۚ;

    invoke-static {v1}, Ll/ۤۤۚ;->ۚ(Ll/ۤۤۚ;)V

    .line 312
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 235
    iput-object v0, p0, Ll/᩷ۤۚ;->ܰ:Ll/ۜ᩷ۚ;

    return-void

    :catchall_0
    move-exception v1

    .line 312
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_1
    return-void
.end method
