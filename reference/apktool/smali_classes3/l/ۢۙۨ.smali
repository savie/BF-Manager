.class public abstract Ll/ۢۙۨ;
.super Ljava/lang/Object;
.source "Z94X"


# instance fields
.field public ܰ:I

.field public ܿ:[Ll/֨ۙۨ;

.field public ᩶:I


# virtual methods
.method public final ۙ()Ll/֨ۙۨ;
    .locals 5

    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 42
    :try_start_0
    iget-object v1, p0, Ll/ۢۙۨ;->ܿ:[Ll/֨ۙۨ;

    if-nez v1, :cond_0

    .line 43
    invoke-virtual {p0}, Ll/ۢۙۨ;->ۤ()[Ll/֨ۙۨ;

    move-result-object v1

    iput-object v1, p0, Ll/ۢۙۨ;->ܿ:[Ll/֨ۙۨ;

    goto :goto_0

    .line 44
    :cond_0
    iget v2, p0, Ll/ۢۙۨ;->ܰ:I

    array-length v3, v1

    if-lt v2, v3, :cond_1

    .line 45
    array-length v2, v1

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "copyOf(...)"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, [Ll/֨ۙۨ;

    iput-object v2, p0, Ll/ۢۙۨ;->ܿ:[Ll/֨ۙۨ;

    check-cast v1, [Ll/֨ۙۨ;

    .line 50
    :cond_1
    :goto_0
    iget v2, p0, Ll/ۢۙۨ;->᩶:I

    .line 53
    :cond_2
    aget-object v3, v1, v2

    if-nez v3, :cond_3

    invoke-virtual {p0}, Ll/ۢۙۨ;->᩷()Ll/֨ۙۨ;

    move-result-object v3

    aput-object v3, v1, v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 55
    array-length v4, v1

    if-lt v2, v4, :cond_4

    const/4 v2, 0x0

    .line 56
    :cond_4
    invoke-virtual {v3, p0}, Ll/֨ۙۨ;->ۙ(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 58
    iput v2, p0, Ll/ۢۙۨ;->᩶:I

    .line 59
    iget v1, p0, Ll/ۢۙۨ;->ܰ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۢۙۨ;->ܰ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final ۙ(Ll/֨ۙۨ;)V
    .locals 2

    move-object v0, p0

    .line 16
    monitor-enter v0

    .line 73
    :try_start_0
    iget v1, p0, Ll/ۢۙۨ;->ܰ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Ll/ۢۙۨ;->ܰ:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    .line 76
    iput v1, p0, Ll/ۢۙۨ;->᩶:I

    :cond_0
    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"

    .line 77
    invoke-static {p1, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/֨ۙۨ;->᩷(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public abstract ۤ()[Ll/֨ۙۨ;
.end method

.method public abstract ᩷()Ll/֨ۙۨ;
.end method

.method public final ᩸()[Ll/֨ۙۨ;
    .locals 1

    .line 18
    iget-object v0, p0, Ll/ۢۙۨ;->ܿ:[Ll/֨ۙۨ;

    return-object v0
.end method
