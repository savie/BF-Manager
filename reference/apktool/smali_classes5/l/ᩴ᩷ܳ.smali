.class public final Ll/ᩴ᩷ܳ;
.super Ljava/lang/Object;
.source "X4ZQ"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:Z

.field public final ֨:I

.field public ۖ:Z

.field public final ۟:J

.field public final ۡ:Ll/۟ܳܳ;

.field public final ۢ:J

.field public ܰ:Z

.field public final ܿ:I

.field public final ᩳ:Ll/ۚ᩷ܳ;

.field public final ᩶:Ll/ᩳܳܳ;


# direct methods
.method public constructor <init>(Ll/ۚ᩷ܳ;Ll/ᩳܳܳ;JIIJLl/۟ܳܳ;)V
    .locals 0

    .line 812
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 813
    iput-object p1, p0, Ll/ᩴ᩷ܳ;->ᩳ:Ll/ۚ᩷ܳ;

    .line 814
    iput-object p2, p0, Ll/ᩴ᩷ܳ;->᩶:Ll/ᩳܳܳ;

    .line 815
    iput-wide p3, p0, Ll/ᩴ᩷ܳ;->۟:J

    .line 816
    iput p5, p0, Ll/ᩴ᩷ܳ;->֨:I

    .line 817
    iput p6, p0, Ll/ᩴ᩷ܳ;->ܿ:I

    .line 818
    iput-wide p7, p0, Ll/ᩴ᩷ܳ;->ۢ:J

    .line 819
    iput-object p9, p0, Ll/ᩴ᩷ܳ;->ۡ:Ll/۟ܳܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ᩴ᩷ܳ;)Ll/ᩳܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩷ܳ;->᩶:Ll/ᩳܳܳ;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ᩴ᩷ܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴ᩷ܳ;->۟:J

    return-wide v0
.end method

.method public static bridge synthetic ۫(Ll/ᩴ᩷ܳ;)Ll/۟ܳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩷ܳ;->ۡ:Ll/۟ܳܳ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ᩴ᩷ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩴ᩷ܳ;->֨:I

    return p0
.end method

.method public static bridge synthetic ᩴ(Ll/ᩴ᩷ܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ᩴ᩷ܳ;->ۢ:J

    return-wide v0
.end method

.method public static bridge synthetic ᩷(Ll/ᩴ᩷ܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ᩴ᩷ܳ;->ܿ:I

    return p0
.end method

.method public static bridge synthetic ᩸(Ll/ᩴ᩷ܳ;)Ll/ۚ᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩷ܳ;->ᩳ:Ll/ۚ᩷ܳ;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 2

    move-object v0, p0

    .line 848
    monitor-enter v0

    .line 849
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩷ܳ;->ܰ:Z

    if-eqz v1, :cond_0

    .line 850
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 852
    iput-boolean v1, p0, Ll/ᩴ᩷ܳ;->ܰ:Z

    .line 853
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 854
    invoke-virtual {p0}, Ll/ᩴ᩷ܳ;->᩷()V

    return-void

    :catchall_0
    move-exception v1

    .line 853
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final length()I
    .locals 6

    .line 832
    iget v0, p0, Ll/ᩴ᩷ܳ;->ܿ:I

    int-to-long v0, v0

    iget v2, p0, Ll/ᩴ᩷ܳ;->֨:I

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public final declared-synchronized ۙ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 824
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩷ܳ;->ܰ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/ᩴ᩷ܳ;->֡:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 827
    iput-boolean v1, p0, Ll/ᩴ᩷ܳ;->֡:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 828
    monitor-exit v0

    return-void

    .line 825
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Copy request is already consumed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩷()V
    .locals 2

    move-object v0, p0

    .line 837
    monitor-enter v0

    .line 838
    :try_start_0
    iget-boolean v1, p0, Ll/ᩴ᩷ܳ;->ۖ:Z

    if-eqz v1, :cond_0

    .line 839
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 841
    iput-boolean v1, p0, Ll/ᩴ᩷ܳ;->ۖ:Z

    .line 842
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 843
    iget-object v0, p0, Ll/ᩴ᩷ܳ;->ۡ:Ll/۟ܳܳ;

    invoke-virtual {v0}, Ll/۟ܳܳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    .line 842
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
