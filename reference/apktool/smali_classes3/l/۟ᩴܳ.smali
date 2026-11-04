.class public final Ll/۟ᩴܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final synthetic ֡:Ll/ᩳܳܳ;

.field public ܰ:J

.field public final ܿ:Ljava/util/ArrayDeque;

.field public ᩶:Z


# direct methods
.method public constructor <init>(Ll/ᩳܳܳ;)V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ᩴܳ;->֡:Ll/ᩳܳܳ;

    .line 146
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ll/۟ᩴܳ;->ܿ:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/۟ᩴܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/۟ᩴܳ;->ܰ:J

    return-wide v0
.end method

.method public static bridge synthetic ۙ(Ll/۟ᩴܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/۟ᩴܳ;->ܰ:J

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/۟ᩴܳ;)Ljava/util/ArrayDeque;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟ᩴܳ;->ܿ:Ljava/util/ArrayDeque;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 159
    iget-object v0, p0, Ll/۟ᩴܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    const/4 v1, 0x1

    .line 160
    :try_start_0
    iput-boolean v1, p0, Ll/۟ᩴܳ;->᩶:Z

    iget-object v1, p0, Ll/۟ᩴܳ;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Ll/۟ᩴܳ;->ܰ:J

    iget-object v1, p0, Ll/۟ᩴܳ;->֡:Ll/ᩳܳܳ;

    invoke-static {v1}, Ll/ᩳܳܳ;->᩷(Ll/ᩳܳܳ;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 161
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final poll()Ll/ܰᩴܳ;
    .locals 6

    .line 151
    iget-object v0, p0, Ll/۟ᩴܳ;->֡:Ll/ᩳܳܳ;

    monitor-enter v0

    .line 152
    :try_start_0
    iget-boolean v1, p0, Ll/۟ᩴܳ;->᩶:Z

    if-nez v1, :cond_1

    .line 153
    iget-object v1, p0, Ll/۟ᩴܳ;->ܿ:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰᩴܳ;

    if-eqz v1, :cond_0

    .line 154
    iget-wide v2, p0, Ll/۟ᩴܳ;->ܰ:J

    invoke-virtual {v1}, Ll/ܰᩴܳ;->᩸()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, p0, Ll/۟ᩴܳ;->ܰ:J

    .line 155
    :cond_0
    monitor-exit v0

    return-object v1

    .line 152
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Change cursor is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 156
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
