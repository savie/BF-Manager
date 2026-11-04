.class public final Ll/ܿ۬᩵;
.super Ll/֡۬᩵;
.source "UAXR"


# instance fields
.field public final ֡:Ll/ܿ۬᩵;

.field public final ۟:Z

.field public final ܿ:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    const/4 v0, 0x0

    .line 124
    invoke-direct {p0, p1, v0}, Ll/ܿ۬᩵;-><init>(Landroid/os/Handler;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 114
    invoke-direct {p0, v0}, Ll/֡۬᩵;-><init>(I)V

    .line 111
    iput-object p1, p0, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    .line 113
    iput-boolean p2, p0, Ll/ܿ۬᩵;->۟:Z

    if-eqz p2, :cond_0

    move-object p2, p0

    goto :goto_0

    .line 127
    :cond_0
    new-instance p2, Ll/ܿ۬᩵;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Ll/ܿ۬᩵;-><init>(Landroid/os/Handler;Z)V

    .line 126
    :goto_0
    iput-object p2, p0, Ll/ܿ۬᩵;->֡:Ll/ܿ۬᩵;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 169
    instance-of v0, p1, Ll/ܿ۬᩵;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܿ۬᩵;

    iget-object v0, p1, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    iget-object v1, p0, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    if-ne v0, v1, :cond_0

    iget-boolean p1, p1, Ll/ܿ۬᩵;->۟:Z

    iget-boolean v0, p0, Ll/ܿ۬᩵;->۟:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    .line 171
    iget-object v0, p0, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Ll/ܿ۬᩵;->۟:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 65
    sget v0, Ll/֫ۜ᩵;->ۙ:I

    .line 20
    sget-object v0, Ll/ܿ᩷ۨ;->ۙ:Ll/֡۬᩵;

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 68
    :try_start_0
    invoke-virtual {v0}, Ll/֡۬᩵;->ܶ()Ll/֡۬᩵;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    .line 164
    iget-object v0, p0, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->toString()Ljava/lang/String;

    move-result-object v0

    .line 165
    iget-boolean v1, p0, Ll/ܿ۬᩵;->۟:Z

    if-eqz v1, :cond_2

    const-string v1, ".immediate"

    .line 0
    invoke-static {v0, v1}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    return-object v0
.end method

.method public final ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V
    .locals 3

    .line 134
    iget-object v0, p0, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    invoke-virtual {v0, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 159
    new-instance v0, Ljava/util/concurrent/CancellationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The task was rejected, the handler underlying the dispatcher \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\' was closed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Ll/۬ۜ᩵;->ۙ(Ll/ۧۢ᩵;Ljava/util/concurrent/CancellationException;)V

    .line 160
    invoke-static {}, Ll/֫ۜ᩵;->᩷()Ll/ܽۤۨ;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ܽۤۨ;->ۙ(Ll/ۧۢ᩵;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final ܶ()Ll/֡۬᩵;
    .locals 1

    .line 126
    iget-object v0, p0, Ll/ܿ۬᩵;->֡:Ll/ܿ۬᩵;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 2

    .line 130
    iget-boolean v0, p0, Ll/ܿ۬᩵;->۟:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Ll/ܿ۬᩵;->ܿ:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
