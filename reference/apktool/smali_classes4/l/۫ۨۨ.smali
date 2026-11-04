.class public final Ll/۫ۨۨ;
.super Ll/ܳۨۨ;
.source "K2S3"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 105
    invoke-direct {p0}, Ll/ܳۨۨ;-><init>()V

    move-object v0, p0

    .line 109
    monitor-enter v0

    const/16 v1, 0x400

    .line 110
    :try_start_0
    invoke-virtual {p0, v1}, Ll/ܳۨۨ;->ۙ(I)V

    .line 111
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final declared-synchronized write(I)V
    .locals 1

    move-object v0, p0

    monitor-enter v0

    .line 155
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ܳۨۨ;->᩷(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final write([BII)V
    .locals 1

    .line 139
    invoke-static {p2, p3, p1}, Ll/ۙ᩵ۨ;->ۙ(II[B)V

    if-nez p3, :cond_0

    return-void

    :cond_0
    move-object v0, p0

    .line 143
    monitor-enter v0

    .line 144
    :try_start_0
    invoke-virtual {p0, p2, p3, p1}, Ll/ܳۨۨ;->ᩴ(II[B)V

    .line 145
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۙ()[B
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 129
    :try_start_0
    invoke-virtual {p0}, Ll/ܳۨۨ;->᩷()[B

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
