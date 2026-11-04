.class public final Ll/ۗ᩷ܳ;
.super Ljava/lang/Object;
.source "D5GW"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public volatile ܰ:Z

.field public final ܿ:Ll/ۨ᩷ܳ;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 1359
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1360
    iput-object p1, p0, Ll/ۗ᩷ܳ;->ܿ:Ll/ۨ᩷ܳ;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    move-object v0, p0

    .line 1375
    monitor-enter v0

    .line 1376
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ᩷ܳ;->᩶:Z

    if-eqz v1, :cond_0

    .line 1377
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1379
    iput-boolean v1, p0, Ll/ۗ᩷ܳ;->᩶:Z

    .line 1380
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1381
    iget-object v0, p0, Ll/ۗ᩷ܳ;->ܿ:Ll/ۨ᩷ܳ;

    invoke-static {v0, p0}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۨ᩷ܳ;Ll/ۗ᩷ܳ;)V

    return-void

    :catchall_0
    move-exception v1

    .line 1380
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۙ()V
    .locals 1

    const/4 v0, 0x1

    .line 1370
    iput-boolean v0, p0, Ll/ۗ᩷ܳ;->ܰ:Z

    return-void
.end method

.method public final ᩷()Z
    .locals 1

    .line 1365
    iget-boolean v0, p0, Ll/ۗ᩷ܳ;->ܰ:Z

    return v0
.end method
