.class public final Ll/᩺֫᩵;
.super Ljava/lang/Object;
.source "GITM"


# static fields
.field public static final ۤ:Ll/᩻ܽ᩺;


# instance fields
.field public final ۙ:Ljava/util/HashSet;

.field public final ᩷:Ljava/util/HashSet;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 22
    const-class v0, Ll/᩺֫᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/᩺֫᩵;->ۤ:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩺֫᩵;->ۙ:Ljava/util/HashSet;

    .line 27
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩺֫᩵;->᩷:Ljava/util/HashSet;

    return-void
.end method

.method public static ۙ(Ll/᩺ۡۗ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, " in "

    .line 0
    invoke-static {p1, v0}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 39
    invoke-interface {p0}, Ll/᩺ۡۗ;->typeName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۡۗ;Ljava/lang/String;)V
    .locals 2

    .line 35
    invoke-virtual {p0}, Ll/ۖۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->۫ۙ()Ll/᩺֫᩵;

    move-result-object v1

    move-object v0, v1

    .line 0
    monitor-enter v0

    .line 73
    :try_start_0
    iget-object v1, v1, Ll/᩺֫᩵;->᩷:Ljava/util/HashSet;

    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 75
    sget-object v1, Ll/᩺֫᩵;->ۤ:Ll/᩻ܽ᩺;

    invoke-static {p0, p1}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0}, Ll/᩻ܽ᩺;->᩸(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
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

.method public static ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 5

    .line 31
    invoke-interface {p0}, Ll/᩺ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->۫ۙ()Ll/᩺֫᩵;

    move-result-object v1

    move-object v0, v1

    .line 0
    monitor-enter v0

    .line 43
    :try_start_0
    iget-object v1, v1, Ll/᩺֫᩵;->ۙ:Ljava/util/HashSet;

    move-object v2, p0

    check-cast v2, Ll/ۛ۟ۗ;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 46
    invoke-static {p0, p1}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 54
    instance-of v2, p2, Ljava/lang/StackOverflowError;

    if-eqz v2, :cond_0

    .line 55
    sget-object v2, Ll/᩺֫᩵;->ۤ:Ll/᩻ܽ᩺;

    const-string v3, "{}, error: StackOverflowError"

    invoke-interface {v2, v1, v3}, Ll/᩻ܽ᩺;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 56
    :cond_0
    instance-of v2, p2, Ll/ۖۧ᩵;

    if-eqz v2, :cond_3

    .line 58
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    .line 59
    new-instance v2, Ll/ۖۧ᩵;

    .line 11
    invoke-direct {v2, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    if-eqz p2, :cond_2

    .line 60
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 63
    :cond_1
    sget-object v3, Ll/᩺֫᩵;->ۤ:Ll/᩻ܽ᩺;

    const-string v4, "{}, details: {}"

    invoke-interface {v3, v4, v1, p2}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    sget-object p2, Ll/᩺֫᩵;->ۤ:Ll/᩻ܽ᩺;

    const-string v3, "{}"

    invoke-interface {p2, v1, v3}, Ll/᩻ܽ᩺;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    move-object p2, v2

    goto :goto_2

    .line 66
    :cond_3
    sget-object v2, Ll/᩺֫᩵;->ۤ:Ll/᩻ܽ᩺;

    invoke-interface {v2, v1, p2}, Ll/᩻ܽ᩺;->᩷(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    :goto_2
    check-cast p0, Ll/ۛ۟ۗ;

    sget-object v1, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    new-instance v2, Ll/ܳᩳۗ;

    invoke-direct {v2, p1, p2}, Ll/ܳᩳۗ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p0, v1, v2}, Ll/ۛ۟ۗ;->ۙ(Ll/ۧ۟ۗ;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
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
