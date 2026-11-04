.class public final Ll/ܰܺۙ;
.super Ljava/lang/Object;
.source "696G"


# instance fields
.field public final ۙ:Ll/᩺ܺۙ;

.field public final ۤ:Ll/۠ۙܺ;

.field public final ᩷:Ll/ۧܺۙ;

.field public final ᩸:Ll/᩹ܺۙ;


# direct methods
.method public constructor <init>(Ll/᩹ܺۙ;Ll/ۧܺۙ;Ll/᩺ܺۙ;)V
    .locals 1

    const-string v0, "store"

    .line 6
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    .line 11
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultExtras"

    .line 16
    invoke-static {p3, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/ܰܺۙ;->᩸:Ll/᩹ܺۙ;

    .line 37
    iput-object p2, p0, Ll/ܰܺۙ;->᩷:Ll/ۧܺۙ;

    .line 38
    iput-object p3, p0, Ll/ܰܺۙ;->ۙ:Ll/᩺ܺۙ;

    .line 41
    new-instance p1, Ll/۠ۙܺ;

    .line 18
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/ܰܺۙ;->ۤ:Ll/۠ۙܺ;

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۬֨᩵;Ljava/lang/String;)Ll/۫ܺۙ;
    .locals 4

    const-string v0, "key"

    .line 5
    invoke-static {p2, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Ll/ܰܺۙ;->ۤ:Ll/۠ۙܺ;

    .line 23
    monitor-enter v0

    .line 35
    :try_start_0
    iget-object v1, p0, Ll/ܰܺۙ;->᩸:Ll/᩹ܺۙ;

    .line 49
    invoke-virtual {v1, p2}, Ll/᩹ܺۙ;->ۙ(Ljava/lang/String;)Ll/۫ܺۙ;

    move-result-object v1

    .line 50
    invoke-virtual {p1, v1}, Ll/۬֨᩵;->ۙ(Ll/۫ܺۙ;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 35
    iget-object p1, p0, Ll/ܰܺۙ;->᩷:Ll/ۧܺۙ;

    .line 51
    instance-of p2, p1, Ll/ܺܺۙ;

    if-eqz p2, :cond_0

    .line 52
    check-cast p1, Ll/ܺܺۙ;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ll/ܺܺۙ;->ۙ(Ll/۫ܺۙ;)V

    :cond_0
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    .line 54
    invoke-static {v1, p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    .line 57
    :cond_1
    new-instance v1, Ll/ۘܺۙ;

    .line 35
    iget-object v2, p0, Ll/ܰܺۙ;->ۙ:Ll/᩺ܺۙ;

    .line 57
    invoke-direct {v1, v2}, Ll/ۘܺۙ;-><init>(Ll/᩺ܺۙ;)V

    .line 58
    sget-object v2, Ll/ܶܺۙ;->᩷:Ll/ܽܺۙ;

    .line 100
    invoke-virtual {v1}, Ll/᩺ܺۙ;->ۙ()Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    iget-object v2, p0, Ll/ܰܺۙ;->᩷:Ll/ۧܺۙ;

    const-string v3, "factory"

    .line 0
    invoke-static {v2, v3}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    :try_start_1
    invoke-interface {v2, p1, v1}, Ll/ۧܺۙ;->ۙ(Ll/۬֨᩵;Ll/ۘܺۙ;)Ll/۫ܺۙ;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move-object v1, p1

    goto :goto_1

    .line 37
    :catch_0
    :try_start_2
    invoke-static {p1}, Ll/ۙ֨ܺ;->ۙ(Ll/۬֨᩵;)Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ll/ۧܺۙ;->ۙ(Ljava/lang/Class;Ll/ۘܺۙ;)Ll/۫ܺۙ;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 39
    :catch_1
    :try_start_3
    invoke-static {p1}, Ll/ۙ֨ܺ;->ۙ(Ll/۬֨᩵;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v2, p1}, Ll/ۧܺۙ;->ۙ(Ljava/lang/Class;)Ll/۫ܺۙ;

    move-result-object p1

    goto :goto_0

    .line 35
    :goto_1
    iget-object p1, p0, Ll/ܰܺۙ;->᩸:Ll/᩹ܺۙ;

    .line 61
    invoke-virtual {p1, p2, v1}, Ll/᩹ܺۙ;->ۙ(Ljava/lang/String;Ll/۫ܺۙ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 23
    :goto_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
