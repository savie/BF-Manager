.class public final Ll/ܿۚۤ;
.super Ll/᩶ۚۤ;
.source "TITQ"


# instance fields
.field public final ۤ:Ll/ܽܽۤ;

.field public final ᩷:J

.field public final ᩸:I


# direct methods
.method public constructor <init>(Ll/ܽܽۤ;JI)V
    .locals 6

    .line 16
    invoke-direct {p0}, Ll/᩶ۚۤ;-><init>()V

    move-object v0, p1

    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    invoke-interface {p1}, Ll/ܽܽۤ;->isClosed()Z

    move-result v1

    if-nez v1, :cond_1

    .line 19
    invoke-interface {p1}, Ll/ܽܽۤ;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, p2, v3

    if-ltz v5, :cond_0

    if-ltz p4, :cond_0

    cmp-long v3, p2, v1

    if-gtz v3, :cond_0

    int-to-long v3, p4

    sub-long/2addr v1, p2

    cmp-long v5, v3, v1

    if-gtz v5, :cond_0

    .line 22
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    iput-object p1, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    .line 24
    iput-wide p2, p0, Ll/ܿۚۤ;->᩷:J

    .line 25
    iput p4, p0, Ll/ܿۚۤ;->᩸:I

    return-void

    .line 21
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid file buffer range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 18
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "File is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private ۚ(I)V
    .locals 5

    .line 34
    iget-object v0, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    invoke-interface {v0}, Ll/ܽܽۤ;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    .line 35
    iget-wide v1, p0, Ll/ܿۚۤ;->᩷:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-interface {v0, v1, v2}, Ll/ܽܽۤ;->seek(J)V

    return-void

    .line 34
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "File is closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩸(II)J
    .locals 7

    .line 39
    invoke-virtual {p0, p1, p2}, Ll/᩶ۚۤ;->᩷(II)V

    .line 40
    iget-object v0, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    monitor-enter v0

    .line 42
    :try_start_0
    invoke-direct {p0, p1}, Ll/ܿۚۤ;->ۚ(I)V

    const-wide/16 v1, 0x0

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p2, :cond_0

    .line 44
    iget-object v3, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    invoke-interface {v3}, Ll/ܽܽۤ;->readByte()B

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    mul-int/lit8 v5, p1, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 45
    :cond_0
    :try_start_1
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 47
    new-instance p2, Ll/᩻ۚۤ;

    .line 8
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 47
    throw p2

    .line 49
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 30
    iget v0, p0, Ll/ܿۚۤ;->᩸:I

    return v0
.end method

.method public final ۙ(II[B)V
    .locals 2

    .line 89
    invoke-virtual {p0, p1, p2}, Ll/᩶ۚۤ;->᩷(II)V

    .line 90
    array-length v0, p3

    if-gt p2, v0, :cond_1

    array-length v0, p3

    if-ltz v0, :cond_1

    .line 92
    iget-object v0, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    monitor-enter v0

    .line 94
    :try_start_0
    invoke-direct {p0, p1}, Ll/ܿۚۤ;->ۚ(I)V

    if-eqz p2, :cond_0

    .line 95
    iget-object p1, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    const/4 v1, 0x0

    invoke-interface {p1, p3, v1, p2}, Ll/ܽܽۤ;->readFully([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    :cond_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 97
    new-instance p2, Ll/᩻ۚۤ;

    .line 8
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 97
    throw p2

    .line 99
    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    .line 91
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "Invalid destination range"

    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۤ(I)I
    .locals 2

    const/4 v0, 0x4

    .line 64
    invoke-direct {p0, p1, v0}, Ll/ܿۚۤ;->᩸(II)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method

.method public final ۤ(II)[I
    .locals 3

    .line 74
    invoke-virtual {p0, p1, p2}, Ll/᩶ۚۤ;->ۙ(II)V

    .line 75
    new-array v1, p2, [I

    .line 76
    iget-object v0, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    monitor-enter v0

    .line 78
    :try_start_0
    invoke-direct {p0, p1}, Ll/ܿۚۤ;->ۚ(I)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p2, :cond_0

    .line 79
    iget-object v2, p0, Ll/ܿۚۤ;->ۤ:Ll/ܽܽۤ;

    invoke-interface {v2}, Ll/ܽܽۤ;->readInt()I

    move-result v2

    aput v2, v1, p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 83
    :cond_0
    :try_start_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 81
    new-instance p2, Ll/᩻ۚۤ;

    .line 8
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 81
    throw p2

    .line 83
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ᩷(I)B
    .locals 2

    const/4 v0, 0x1

    .line 54
    invoke-direct {p0, p1, v0}, Ll/ܿۚۤ;->᩸(II)J

    move-result-wide v0

    long-to-int p1, v0

    int-to-byte p1, p1

    return p1
.end method

.method public final ᩸(I)S
    .locals 2

    const/4 v0, 0x2

    .line 59
    invoke-direct {p0, p1, v0}, Ll/ܿۚۤ;->᩸(II)J

    move-result-wide v0

    long-to-int p1, v0

    int-to-short p1, p1

    return p1
.end method
