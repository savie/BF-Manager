.class public abstract Ll/ܺۜ᩵;
.super Ll/ᩳ۠᩵;
.source "2AYL"


# instance fields
.field public ֡:Ll/ܰ۟᩵;

.field public ۟:J

.field public ܿ:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ll/ᩳ۠᩵;-><init>()V

    return-void
.end method


# virtual methods
.method public shutdown()V
    .locals 0

    return-void
.end method

.method public final ۗ()Z
    .locals 5

    .line 90
    iget-wide v0, p0, Ll/ܺۜ᩵;->۟:J

    const-wide v2, 0x100000000L

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(Ll/۫ۜ᩵;)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ܺۜ᩵;->֡:Ll/ܰ۟᩵;

    if-nez v0, :cond_0

    .line 82
    new-instance v0, Ll/ܰ۟᩵;

    invoke-direct {v0}, Ll/ܰ۟᩵;-><init>()V

    iput-object v0, p0, Ll/ܺۜ᩵;->֡:Ll/ܰ۟᩵;

    .line 83
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܰ۟᩵;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 4

    .line 100
    iget-wide v0, p0, Ll/ܺۜ᩵;->۟:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܺۜ᩵;->۟:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 101
    iput-boolean p1, p0, Ll/ܺۜ᩵;->ܿ:Z

    :cond_1
    return-void
.end method

.method public final ܰ()Z
    .locals 1

    .line 94
    iget-object v0, p0, Ll/ܺۜ᩵;->֡:Ll/ܰ۟᩵;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܰ۟᩵;->isEmpty()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܶ()V
    .locals 5

    .line 105
    iget-wide v0, p0, Ll/ܺۜ᩵;->۟:J

    const-wide v2, 0x100000000L

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܺۜ᩵;->۟:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    goto :goto_0

    .line 108
    :cond_0
    iget-boolean v0, p0, Ll/ܺۜ᩵;->ܿ:Z

    if-eqz v0, :cond_1

    .line 110
    invoke-virtual {p0}, Ll/ܺۜ᩵;->shutdown()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩶()Z
    .locals 3

    .line 63
    iget-object v0, p0, Ll/ܺۜ᩵;->֡:Ll/ܰ۟᩵;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 161
    :cond_0
    invoke-virtual {v0}, Ll/ܰ۟᩵;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ll/ܰ۟᩵;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    .line 64
    :goto_0
    check-cast v0, Ll/۫ۜ᩵;

    if-nez v0, :cond_2

    return v1

    .line 65
    :cond_2
    invoke-virtual {v0}, Ll/۫ۜ᩵;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method public ᩹()J
    .locals 3

    .line 58
    iget-object v0, p0, Ll/ܺۜ᩵;->֡:Ll/ܰ۟᩵;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    .line 59
    :cond_0
    invoke-virtual {v0}, Ll/ܰ۟᩵;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-wide v1

    :cond_1
    const-wide/16 v0, 0x0

    return-wide v0
.end method
