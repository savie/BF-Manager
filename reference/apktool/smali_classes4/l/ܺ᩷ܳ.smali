.class public final Ll/ܺ᩷ܳ;
.super Ljava/lang/Object;
.source "D5GW"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:Z

.field public ֨:Z

.field public ۟:Z

.field public final ۢ:Ljava/lang/Runnable;

.field public ܰ:Ljava/lang/Runnable;

.field public final ܿ:Ljava/lang/Runnable;

.field public final ᩳ:Ll/ۨ᩷ܳ;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ۨ᩷ܳ;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    .line 1258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1259
    iput-object p1, p0, Ll/ܺ᩷ܳ;->ᩳ:Ll/ۨ᩷ܳ;

    .line 1260
    iput-object p2, p0, Ll/ܺ᩷ܳ;->ܿ:Ljava/lang/Runnable;

    .line 1261
    iput-object p3, p0, Ll/ܺ᩷ܳ;->ۢ:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1342
    invoke-virtual {p0}, Ll/ܺ᩷ܳ;->ۤ()V

    move-object v0, p0

    .line 1343
    monitor-enter v0

    .line 1344
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->۟:Z

    if-eqz v1, :cond_0

    .line 1345
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1347
    iput-boolean v1, p0, Ll/ܺ᩷ܳ;->۟:Z

    .line 1348
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1349
    iget-object v0, p0, Ll/ܺ᩷ܳ;->ᩳ:Ll/ۨ᩷ܳ;

    invoke-static {v0, p0}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۨ᩷ܳ;Ll/ܺ᩷ܳ;)V

    return-void

    :catchall_0
    move-exception v1

    .line 1348
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۙ(Ljava/lang/Runnable;)V
    .locals 4

    move-object v0, p0

    .line 1305
    monitor-enter v0

    .line 1306
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->᩶:Z

    if-nez v1, :cond_1

    .line 1307
    iget-object v1, p0, Ll/ܺ᩷ܳ;->ܰ:Ljava/lang/Runnable;

    if-nez v1, :cond_0

    goto :goto_0

    .line 1308
    :cond_0
    new-instance v2, Ll/᩻᩷ܳ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1, p1}, Ll/᩻᩷ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object p1, v2

    :goto_0
    iput-object p1, p0, Ll/ܺ᩷ܳ;->ܰ:Ljava/lang/Runnable;

    const/4 p1, 0x0

    .line 1318
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_2

    .line 1320
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    .line 1318
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ()Z
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 1280
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->֡:Z

    if-nez v1, :cond_1

    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->۟:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1283
    :cond_0
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    .line 1281
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ۤ()V
    .locals 3

    move-object v0, p0

    .line 1289
    monitor-enter v0

    .line 1290
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->᩶:Z

    if-eqz v1, :cond_0

    .line 1291
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1293
    iput-boolean v1, p0, Ll/ܺ᩷ܳ;->᩶:Z

    .line 1294
    iget-object v1, p0, Ll/ܺ᩷ܳ;->ܰ:Ljava/lang/Runnable;

    const/4 v2, 0x0

    .line 1295
    iput-object v2, p0, Ll/ܺ᩷ܳ;->ܰ:Ljava/lang/Runnable;

    .line 1296
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 1298
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 1296
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ܳ()V
    .locals 2

    move-object v0, p0

    .line 1327
    monitor-enter v0

    .line 1328
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->֨:Z

    if-eqz v1, :cond_0

    .line 1329
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 1331
    iput-boolean v1, p0, Ll/ܺ᩷ܳ;->֨:Z

    .line 1332
    iget-object v1, p0, Ll/ܺ᩷ܳ;->ۢ:Ljava/lang/Runnable;

    .line 1333
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1335
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    return-void

    :catchall_0
    move-exception v1

    .line 1333
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩷()V
    .locals 2

    move-object v0, p0

    .line 1267
    monitor-enter v0

    .line 1268
    :try_start_0
    iget-boolean v1, p0, Ll/ܺ᩷ܳ;->֡:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 1269
    iput-boolean v1, p0, Ll/ܺ᩷ܳ;->֡:Z

    .line 1270
    iget-object v1, p0, Ll/ܺ᩷ܳ;->ܿ:Ljava/lang/Runnable;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 1272
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    .line 1274
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    .line 1272
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
