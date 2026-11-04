.class public final Ll/֡ᩴܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ll/ۚᩴܳ;


# instance fields
.field public final ܰ:[B

.field public volatile ᩶:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 5905
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5906
    new-array p1, p1, [B

    iput-object p1, p0, Ll/֡ᩴܳ;->ܰ:[B

    return-void
.end method


# virtual methods
.method public final synthetic close()V
    .locals 0

    return-void
.end method

.method public final length()I
    .locals 1

    .line 5932
    iget v0, p0, Ll/֡ᩴܳ;->᩶:I

    return v0
.end method

.method public final ۙ()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final declared-synchronized ۙ(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-ltz p1, :cond_0

    .line 5920
    :try_start_0
    iget v1, p0, Ll/֡ᩴܳ;->᩶:I

    if-gt p1, v1, :cond_0

    .line 5923
    iput p1, p0, Ll/֡ᩴܳ;->᩶:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5924
    monitor-exit v0

    return-void

    .line 5921
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid arena rollback"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(I[BII)V
    .locals 1

    .line 5943
    iget v0, p0, Ll/֡ᩴܳ;->᩶:I

    invoke-static {v0, p1, p4}, Ll/۬ܳܳ;->᩷(III)V

    .line 5944
    array-length v0, p2

    invoke-static {v0, p3, p4}, Ll/۬ܳܳ;->ۙ(III)V

    .line 5945
    iget-object v0, p0, Ll/֡ᩴܳ;->ܰ:[B

    invoke-static {v0, p1, p2, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۠᩷()Ll/᩸۫ܳ;
    .locals 0

    return-object p0
.end method

.method public final synthetic ۢ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ()I
    .locals 2

    .line 5927
    iget-object v0, p0, Ll/֡ᩴܳ;->ܰ:[B

    array-length v0, v0

    iget v1, p0, Ll/֡ᩴܳ;->᩶:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final declared-synchronized ᩴ(II[B)I
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 5910
    :try_start_0
    invoke-virtual {p0}, Ll/֡ᩴܳ;->ܳ()I

    move-result v1

    if-gt p2, v1, :cond_0

    .line 5913
    iget v1, p0, Ll/֡ᩴܳ;->᩶:I

    .line 5914
    iget-object v2, p0, Ll/֡ᩴܳ;->ܰ:[B

    invoke-static {p3, p1, v2, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5915
    iget p1, p0, Ll/֡ᩴܳ;->᩶:I

    add-int/2addr p1, p2

    iput p1, p0, Ll/֡ᩴܳ;->᩶:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5916
    monitor-exit v0

    return v1

    .line 5911
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Arena block overflow"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 5916
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩴ()J
    .locals 2

    .line 5938
    iget-object v0, p0, Ll/֡ᩴܳ;->ܰ:[B

    array-length v0, v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public final ᩷()J
    .locals 2

    .line 84
    invoke-virtual {p0}, Ll/֡ᩴܳ;->ᩴ()J

    move-result-wide v0

    return-wide v0
.end method
