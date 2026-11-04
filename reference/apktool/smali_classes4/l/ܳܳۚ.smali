.class public final Ll/ܳܳۚ;
.super Ljava/lang/Object;
.source "9IQO"


# static fields
.field public static ۙ:Ljava/lang/ref/SoftReference;

.field public static ᩷:Ljava/lang/ref/SoftReference;


# direct methods
.method public static ۙ(Ll/ܿܶۤ;Ljava/lang/CharSequence;)Ll/ۘܶۤ;
    .locals 1

    .line 15
    invoke-virtual {p0, p1}, Ll/ܿܶۤ;->matcher(Ljava/lang/CharSequence;)Ll/ۘܶۤ;

    move-result-object p1

    const/16 v0, 0x1388

    invoke-virtual {p1, v0}, Ll/ۘܶۤ;->setTimeoutMillis(I)V

    .line 16
    invoke-virtual {p0}, Ll/ܿܶۤ;->flags()I

    move-result p0

    and-int/lit8 p0, p0, 0x10

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {p1, p0}, Ll/ۘܶۤ;->᩷(Z)V

    return-object p1
.end method

.method public static declared-synchronized ۙ()Ll/᩺۫ۤ;
    .locals 3

    .line 2
    const-class v0, Ll/ܳܳۚ;

    .line 3
    monitor-enter v0

    .line 21
    :try_start_0
    sget-object v1, Ll/ܳܳۚ;->ۙ:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_0

    .line 22
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩺۫ۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 24
    monitor-exit v0

    return-object v1

    .line 27
    :cond_0
    :try_start_1
    new-instance v1, Ll/᩺۫ۤ;

    const-string v2, "/assets/1"

    invoke-static {v2}, Ll/ۨۚܺ;->ۙ(Ljava/lang/String;)[B

    move-result-object v2

    invoke-direct {v1, v2}, Ll/᩺۫ۤ;-><init>([B)V

    .line 28
    new-instance v2, Ljava/lang/ref/SoftReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v2, Ll/ܳܳۚ;->ۙ:Ljava/lang/ref/SoftReference;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    monitor-exit v0

    return-object v1

    :catch_0
    move-exception v1

    .line 31
    :try_start_2
    new-instance v2, Ljava/lang/Error;

    invoke-direct {v2, v1}, Ljava/lang/Error;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "POST"

    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PATCH"

    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PUT"

    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DELETE"

    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MOVE"

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static declared-synchronized ᩷()Ll/ۜۤۤ;
    .locals 3

    .line 2
    const-class v0, Ll/ܳܳۚ;

    .line 3
    monitor-enter v0

    .line 37
    :try_start_0
    sget-object v1, Ll/ܳܳۚ;->᩷:Ljava/lang/ref/SoftReference;

    if-eqz v1, :cond_0

    .line 38
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۜۤۤ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 40
    monitor-exit v0

    return-object v1

    .line 43
    :cond_0
    :try_start_1
    invoke-static {}, Ll/ܳܳۚ;->ۙ()Ll/᩺۫ۤ;

    move-result-object v1

    .line 44
    new-instance v2, Ll/ۜۤۤ;

    invoke-direct {v2, v1}, Ll/ۜۤۤ;-><init>(Ll/ۜܳۤ;)V

    .line 45
    new-instance v1, Ljava/lang/ref/SoftReference;

    invoke-direct {v1, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Ll/ܳܳۚ;->᩷:Ljava/lang/ref/SoftReference;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static ᩷(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "GET"

    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HEAD"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
