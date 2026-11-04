.class public final Ll/᩹ۖ֫;
.super Ljava/lang/Object;
.source "E72G"


# instance fields
.field public ۙ:Z

.field public ۤ:Ll/ۡۡ֫;

.field public ܳ:Ljava/lang/String;

.field public final ᩴ:Ll/᩺ۖ֫;

.field public ᩷:Ljava/lang/String;

.field public ᩸:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/᩺ۖ֫;Ll/ۡۡ֫;)V
    .locals 1

    .line 2208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2203
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۖ֫;->ܳ:Ljava/lang/String;

    .line 2209
    iput-object p1, p0, Ll/᩹ۖ֫;->ᩴ:Ll/᩺ۖ֫;

    .line 2210
    iput-object p2, p0, Ll/᩹ۖ֫;->ۤ:Ll/ۡۡ֫;

    return-void
.end method

.method public static ۙ(Ll/᩹ۖ֫;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 2222
    :try_start_0
    iget-object v1, p0, Ll/᩹ۖ֫;->᩷:Ljava/lang/String;

    invoke-static {v1, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 2223
    iput-object p1, p0, Ll/᩹ۖ֫;->᩷:Ljava/lang/String;

    .line 2224
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩹ۖ֫;->ܳ:Ljava/lang/String;

    const/4 p1, 0x0

    .line 2225
    iput-boolean p1, p0, Ll/᩹ۖ֫;->᩸:Z

    .line 2227
    :cond_0
    iget-object p0, p0, Ll/᩹ۖ֫;->ܳ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/᩹ۖ֫;)V
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    const/4 v1, 0x1

    .line 2244
    :try_start_0
    iput-boolean v1, p0, Ll/᩹ۖ֫;->ۙ:Z

    const/4 v1, 0x0

    .line 2245
    iput-object v1, p0, Ll/᩹ۖ֫;->ۤ:Ll/ۡۡ֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2246
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ᩷(Ll/᩹ۖ֫;Ljava/lang/String;)Z
    .locals 2

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 2249
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۖ֫;->ۙ:Z

    if-nez v1, :cond_0

    iget-boolean v1, p0, Ll/᩹ۖ֫;->᩸:Z

    if-eqz v1, :cond_0

    iget-object p0, p0, Ll/᩹ۖ֫;->᩷:Ljava/lang/String;

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public declared-synchronized documentReady(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Ll/ᩳ᩸;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 2217
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۖ֫;->ۙ:Z

    if-nez v1, :cond_0

    if-eqz p1, :cond_0

    iget-object v1, p0, Ll/᩹ۖ֫;->ۤ:Ll/ۡۡ֫;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Ll/ۡۡ֫;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2218
    :cond_0
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

.method public declared-synchronized save(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .annotation build Ll/ᩳ᩸;
    .end annotation

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 2234
    :try_start_0
    iget-boolean v1, p0, Ll/᩹ۖ֫;->ۙ:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/᩹ۖ֫;->᩷:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/᩹ۖ֫;->ܳ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    const v1, 0x186a0

    if-le p1, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 2235
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p1, v1, :cond_2

    .line 2236
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-eq v1, v2, :cond_1

    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x31

    if-eq v1, v2, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 2238
    :cond_2
    :try_start_1
    iget-object p1, p0, Ll/᩹ۖ֫;->ᩴ:Ll/᩺ۖ֫;

    invoke-static {p1}, Ll/᩺ۖ֫;->֫(Ll/᩺ۖ֫;)Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Ll/᩹ۖ֫;->᩷:Ljava/lang/String;

    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2240
    iput-boolean p1, p0, Ll/᩹ۖ֫;->᩸:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2241
    monitor-exit v0

    return-void

    .line 2234
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
