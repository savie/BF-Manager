.class public final Ll/ۖۚ᩵;
.super Ljava/lang/Object;
.source "E411"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field public static final ֨:Ll/᩻ܽ᩺;


# instance fields
.field public final ֡:Ll/᩺ܰۗ;

.field public final ۟:Ljava/lang/ClassLoader;

.field public final ۢ:Ll/֡ۧۤ;

.field public ܰ:Ll/᩺ۚ᩵;

.field public ܿ:Ll/۫ܿۗ;

.field public ᩳ:Ll/֨ۚ᩵;

.field public final ᩶:Ll/ۛۘۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Ll/ۖۚ᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/ۖۚ᩵;->֨:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/᩺ܰۗ;Ll/ۛۘۗ;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ۖۚ᩵;->֡:Ll/᩺ܰۗ;

    .line 34
    invoke-interface {p1}, Ll/᩺ܰۗ;->ۙ()Ll/֡ۧۤ;

    move-result-object v0

    iput-object v0, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    iput-object p1, p0, Ll/ۖۚ᩵;->۟:Ljava/lang/ClassLoader;

    .line 36
    iput-object p2, p0, Ll/ۖۚ᩵;->᩶:Ll/ۛۘۗ;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 15
    check-cast p1, Ll/ۖۚ᩵;

    .line 97
    iget-object v0, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 125
    :cond_0
    instance-of v1, p1, Ll/ۖۚ᩵;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    .line 97
    :cond_1
    iget-object v1, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    check-cast p1, Ll/ۖۚ᩵;

    .line 97
    iget-object p1, p1, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x5434294

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "dex-input"

    return-object v0
.end method

.method public final ֫()Ll/֡ۧۤ;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    return-object v0
.end method

.method public final ۙ()Ll/᩺ۚ᩵;
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ۖۚ᩵;->ܰ:Ll/᩺ۚ᩵;

    return-object v0
.end method

.method public final ۙ(Ll/֨ۚ᩵;)V
    .locals 4

    .line 40
    iput-object p1, p0, Ll/ۖۚ᩵;->ᩳ:Ll/֨ۚ᩵;

    .line 66
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 68
    iget-object v2, p0, Ll/ۖۚ᩵;->۟:Ljava/lang/ClassLoader;

    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 43
    :try_start_0
    iget-object v2, p0, Ll/ۖۚ᩵;->֡:Ll/᩺ܰۗ;

    invoke-interface {v2, p1}, Ll/᩺ܰۗ;->ۙ(Ll/֨ۚ᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 45
    :try_start_1
    sget-object v2, Ll/ۖۚ᩵;->֨:Ll/᩻ܽ᩺;

    const-string v3, "Plugin init failed"

    invoke-interface {v2, v3, p1}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 46
    iput-object p1, p0, Ll/ۖۚ᩵;->ᩳ:Ll/֨ۚ᩵;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    return-void

    :catchall_1
    move-exception p1

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 73
    throw p1
.end method

.method public final ۙ(Ll/۫ܿۗ;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 80
    :cond_0
    iput-object p1, p0, Ll/ۖۚ᩵;->ܿ:Ll/۫ܿۗ;

    .line 82
    :try_start_0
    iget-object v0, p0, Ll/ۖۚ᩵;->᩶:Ll/ۛۘۗ;

    invoke-virtual {v0}, Ll/ۛۘۗ;->ۘ()Ljava/util/HashMap;

    move-result-object v0

    check-cast p1, Ll/ܺܿۗ;

    invoke-virtual {p1, v0}, Ll/ܺܿۗ;->ۙ(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 84
    new-instance v0, Ll/۠ۧ᩵;

    .line 97
    iget-object v1, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "Failed to apply options for plugin: dex-input"

    .line 15
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    throw v0
.end method

.method public final ۙ(Ll/᩺ۚ᩵;)V
    .locals 0

    .line 105
    iput-object p1, p0, Ll/ۖۚ᩵;->ܰ:Ll/᩺ۚ᩵;

    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 52
    iget-object v0, p0, Ll/ۖۚ᩵;->ᩳ:Ll/֨ۚ᩵;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 54
    :try_start_0
    iget-object v1, p0, Ll/ۖۚ᩵;->֡:Ll/᩺ܰۗ;

    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۡۚ᩵;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v1}, Ll/ۡۚ᩵;-><init>(ILjava/lang/Object;)V

    .line 62
    iget-object v1, p0, Ll/ۖۚ᩵;->۟:Ljava/lang/ClassLoader;

    .line 66
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    .line 68
    invoke-virtual {v3, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 70
    :try_start_1
    invoke-virtual {v2}, Ll/ۡۚ᩵;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    :try_start_2
    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 56
    iput-object v0, p0, Ll/ۖۚ᩵;->ᩳ:Ll/֨ۚ᩵;

    return-void

    :catchall_0
    move-exception v1

    .line 72
    :try_start_3
    invoke-virtual {v3, v4}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 73
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    .line 56
    iput-object v0, p0, Ll/ۖۚ᩵;->ᩳ:Ll/֨ۚ᩵;

    .line 57
    throw v1

    :cond_0
    return-void
.end method

.method public final ۫()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۖۚ᩵;->ۢ:Ll/֡ۧۤ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "dex-input"

    return-object v0
.end method

.method public final ᩴ()Ll/֨ۚ᩵;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۖۚ᩵;->ᩳ:Ll/֨ۚ᩵;

    return-object v0
.end method

.method public final ᩸()Ll/۫ܿۗ;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۖۚ᩵;->ܿ:Ll/۫ܿۗ;

    return-object v0
.end method
