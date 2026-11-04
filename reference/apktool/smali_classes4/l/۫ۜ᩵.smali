.class public abstract Ll/۫ۜ᩵;
.super Ll/ۨۤۨ;
.source "2AXS"


# instance fields
.field public ܿ:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ll/ۨۤۨ;-><init>()V

    .line 49
    iput p1, p0, Ll/۫ۜ᩵;->ܿ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 81
    iget-object v0, p0, Ll/ۨۤۨ;->᩶:Ll/ۛۤۨ;

    .line 84
    :try_start_0
    invoke-virtual {p0}, Ll/۫ۜ᩵;->ۙ()Ll/ۙۢ᩵;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/᩻᩷ۨ;

    .line 85
    iget-object v2, v1, Ll/᩻᩷ۨ;->۟:Ll/ۛۢ᩵;

    .line 86
    iget-object v1, v1, Ll/᩻᩷ۨ;->ᩳ:Ljava/lang/Object;

    .line 103
    invoke-interface {v2}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v3

    .line 104
    invoke-static {v3, v1}, Ll/ᩴۤۨ;->᩷(Ll/ۧۢ᩵;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 105
    sget-object v4, Ll/ᩴۤۨ;->ۙ:Ll/ۜ᩷ۨ;

    const/4 v5, 0x0

    if-eq v1, v4, :cond_0

    .line 107
    invoke-static {v2, v3}, Ll/ܿ۠᩵;->ۙ(Ll/ۙۢ᩵;Ll/ۧۢ᩵;)Ll/᩵۬᩵;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto :goto_0

    :cond_0
    move-object v4, v5

    .line 87
    :goto_0
    :try_start_1
    invoke-interface {v2}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object v6

    .line 88
    invoke-virtual {p0}, Ll/۫ۜ᩵;->ۤ()Ljava/lang/Object;

    move-result-object v7

    .line 89
    invoke-virtual {p0, v7}, Ll/۫ۜ᩵;->᩷(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_3

    .line 95
    iget v9, p0, Ll/۫ۜ᩵;->ܿ:I

    const/4 v10, 0x1

    if-eq v9, v10, :cond_2

    const/4 v11, 0x2

    if-ne v9, v11, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :cond_2
    :goto_1
    if-eqz v10, :cond_3

    sget-object v9, Ll/ۡۜ᩵;->ۛ:Ll/֨ۜ᩵;

    sget-object v9, Ll/֨ۜ᩵;->ܰ:Ll/֨ۜ᩵;

    invoke-interface {v6, v9}, Ll/ۧۢ᩵;->ۙ(Ll/֫ۢ᩵;)Ll/ۚۢ᩵;

    move-result-object v6

    check-cast v6, Ll/ۡۜ᩵;

    goto :goto_2

    :cond_3
    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_4

    .line 96
    invoke-interface {v6}, Ll/ۡۜ᩵;->ۤ()Z

    move-result v9

    if-nez v9, :cond_4

    .line 97
    invoke-interface {v6}, Ll/ۡۜ᩵;->ܳ()Ljava/util/concurrent/CancellationException;

    move-result-object v6

    .line 98
    invoke-virtual {p0, v7, v6}, Ll/۫ۜ᩵;->ۙ(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 216
    invoke-static {v6}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    if-eqz v8, :cond_5

    .line 102
    invoke-static {v8}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;)V

    goto :goto_3

    .line 104
    :cond_5
    invoke-virtual {p0, v7}, Ll/۫ۜ᩵;->ۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/᩵ۢ᩵;->ۙ(Ljava/lang/Object;)V

    .line 107
    :goto_3
    sget-object v2, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_6

    .line 115
    :try_start_2
    invoke-static {v3, v1}, Ll/ᩴۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 112
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    invoke-static {v0}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object v0

    .line 113
    :goto_4
    invoke-static {v0}, Ll/᩸۟᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, Ll/۫ۜ᩵;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_6

    .line 114
    :cond_6
    :try_start_4
    invoke-virtual {v4}, Ll/᩵۬᩵;->ܶ()V

    throw v5

    :catchall_1
    move-exception v2

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ll/᩵۬᩵;->ܶ()V

    throw v5

    .line 115
    :cond_7
    invoke-static {v3, v1}, Ll/ᩴۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Object;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    .line 112
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    invoke-static {v0}, Ll/ᩴ۟᩵;->ۙ(Ljava/lang/Throwable;)Ll/ۤ۟᩵;

    move-result-object v0

    .line 113
    :goto_5
    invoke-static {v0}, Ll/᩸۟᩵;->ۙ(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ll/۫ۜ᩵;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_6
    return-void
.end method

.method public abstract ۙ()Ll/ۙۢ᩵;
.end method

.method public ۙ(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 0

    return-void
.end method

.method public final ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 138
    invoke-static {p1, p2}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    .line 142
    :cond_2
    new-instance p2, Ll/ۙۜ᩵;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 143
    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 23
    invoke-direct {p2, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 144
    invoke-virtual {p0}, Ll/۫ۜ᩵;->ۙ()Ll/ۙۢ᩵;

    move-result-object p1

    invoke-interface {p1}, Ll/ۙۢ᩵;->getContext()Ll/ۧۢ᩵;

    move-result-object p1

    invoke-static {p2, p1}, Ll/ۡ۠᩵;->ۙ(Ljava/lang/Throwable;Ll/ۧۢ᩵;)V

    return-void
.end method

.method public abstract ۤ()Ljava/lang/Object;
.end method

.method public ۤ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p1
.end method

.method public ᩷(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .line 77
    instance-of v0, p1, Ll/ۨ۠᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۨ۠᩵;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Ll/ۨ۠᩵;->ۙ:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    return-object v1
.end method
