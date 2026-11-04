.class public final Ll/ۤۢۗ;
.super Ljava/lang/Object;
.source "H6ED"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩷:Ll/ۤۢۗ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۤۢۗ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۤۢۗ;->ۙ:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Ll/ۤۢۗ;->᩷:Ll/ۤۢۗ;

    return-void
.end method

.method public static declared-synchronized ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/ۤۢۗ;
    .locals 4

    .line 2
    const-class v0, Ll/ۤۢۗ;

    .line 3
    monitor-enter v0

    .line 16
    :try_start_0
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۙۢۗ;->ۙ(Ljava/lang/String;)Ll/ۤۢۗ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 18
    monitor-exit v0

    return-object v1

    :cond_0
    const/16 v1, 0x2e

    .line 21
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 24
    new-instance v1, Ll/ۤۢۗ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Ll/ۤۢۗ;-><init>(Ljava/lang/String;Ll/ۤۢۗ;)V

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 26
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v2}, Ll/ۤۢۗ;->ۙ(Ll/֫ۖۗ;Ljava/lang/String;)Ll/ۤۢۗ;

    move-result-object v2

    .line 27
    new-instance v3, Ll/ۤۢۗ;

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    invoke-direct {v3, p1, v2}, Ll/ۤۢۗ;-><init>(Ljava/lang/String;Ll/ۤۢۗ;)V

    move-object v1, v3

    .line 29
    :goto_0
    invoke-virtual {p0}, Ll/֫ۖۗ;->ۚۙ()Ll/ۙۢۗ;

    move-result-object p0

    invoke-virtual {p0, v1}, Ll/ۙۢۗ;->ۙ(Ll/ۤۢۗ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 75
    :cond_0
    instance-of v0, p1, Ll/ۤۢۗ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 78
    :cond_1
    check-cast p1, Ll/ۤۢۗ;

    .line 59
    iget-object p1, p1, Ll/ۤۢۗ;->ۙ:Ljava/lang/String;

    .line 78
    iget-object v0, p0, Ll/ۤۢۗ;->ۙ:Ljava/lang/String;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 83
    iget-object v0, p0, Ll/ۤۢۗ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Ll/ۤۢۗ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۤۢۗ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ll/ۤۢۗ;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۤۢۗ;->᩷:Ll/ۤۢۗ;

    return-object v0
.end method
