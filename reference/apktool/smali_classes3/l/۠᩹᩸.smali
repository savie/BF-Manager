.class public final Ll/۠᩹᩸;
.super Ljava/lang/Object;
.source "J6S5"


# static fields
.field public static final ܺ:Ljava/util/HashMap;

.field public static final synthetic ᩻:I


# instance fields
.field public final ֫:Ll/᩹ܽ᩵;

.field public final ۙ:J

.field public volatile ۚ:Ll/۠᩹᩸;

.field public final ۤ:Ll/᩹ܽ᩵;

.field public volatile ۧ:Z

.field public volatile ۫:Ljava/lang/String;

.field public final ܳ:Ll/᩹ܽ᩵;

.field public final ᩴ:Ll/᩺۬᩹;

.field public volatile ᩷:Ll/֫᩹᩸;

.field public volatile ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۠᩹᩸;->ܺ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Ll/᩺۬᩹;Ll/۠᩹᩸;Ljava/lang/String;)V
    .locals 2

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v0, p0, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/۠᩹᩸;->ۙ:J

    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۠᩹᩸;->᩸:Ljava/lang/ref/WeakReference;

    .line 32
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v0, p0, Ll/۠᩹᩸;->ۤ:Ll/᩹ܽ᩵;

    .line 40
    iput-object p1, p0, Ll/۠᩹᩸;->ᩴ:Ll/᩺۬᩹;

    iput-object p3, p0, Ll/۠᩹᩸;->۫:Ljava/lang/String;

    if-nez p2, :cond_0

    .line 41
    invoke-static {v1}, Ll/᩹ܽ᩵;->᩸(Ljava/lang/Object;)Ll/᩹ܽ᩵;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p2, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    :goto_0
    iput-object p1, p0, Ll/۠᩹᩸;->֫:Ll/᩹ܽ᩵;

    .line 42
    iput-object p2, p0, Ll/۠᩹᩸;->ۚ:Ll/۠᩹᩸;

    .line 44
    new-instance p2, Ll/֡᩹᩸;

    invoke-direct {p2, p0}, Ll/֡᩹᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void
.end method

.method public static ۙ(Landroid/view/View;)Ljava/lang/String;
    .locals 6

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0xa

    if-nez p0, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    .line 117
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Ll/ۗۚܺ;->ۙ(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v2

    :goto_0
    if-nez v2, :cond_1

    const-string p0, "viewActivity=unavailable\n"

    return-object p0

    .line 119
    :cond_1
    invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v3

    .line 120
    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "viewActivity="

    .line 121
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\nviewActivityClass="

    .line 122
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\nviewActivityComponent="

    .line 123
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "unavailable"

    if-nez v3, :cond_2

    move-object v3, v5

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-virtual {v3}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v3

    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\nviewActivityTaskId="

    .line 124
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/app/Activity;->getTaskId()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "\nviewActivityFinishing="

    .line 125
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, "\nviewActivityDestroyed="

    .line 126
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, "\nviewActivityChangingConfigurations="

    .line 127
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, "\nviewActivityLifecycle="

    .line 128
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    instance-of v3, v2, Ll/ۤ᩻ۙ;

    if-eqz v3, :cond_3

    check-cast v2, Ll/ۤ᩻ۙ;

    .line 129
    invoke-interface {v2}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v5

    .line 128
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\nviewActivityIntentAction="

    .line 130
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v4, :cond_4

    move-object v2, v5

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nviewActivityIntentFlags="

    .line 131
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v4, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Landroid/content/Intent;->getFlags()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    :goto_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nviewWindowFocus="

    .line 132
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "\nviewWindowVisibility="

    .line 133
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\nviewShown="

    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    move-exception p0

    const-string v2, "\nviewActivityError="

    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 139
    :goto_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "null"

    return-object p0

    .line 111
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/᩹ܽ᩵;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const-string p0, "absent"

    return-object p0

    .line 143
    :cond_0
    invoke-virtual {p0}, Ll/᩹ܽ᩵;->isDone()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p0, "pending"

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ll/᩹ܽ᩵;->᩸()Z

    move-result p0

    if-eqz p0, :cond_2

    const-string p0, "failed"

    return-object p0

    :cond_2
    const-string p0, "done"

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ll/᩺۬᩹;)Ll/۠᩹᩸;
    .locals 4

    .line 53
    invoke-interface {p1}, Ll/᩺۬᩹;->toAbsolutePath()Ll/᩺۬᩹;

    move-result-object p1

    invoke-interface {p1}, Ll/᩺۬᩹;->normalize()Ll/᩺۬᩹;

    move-result-object p1

    .line 54
    sget-object v1, Ll/۠᩹᩸;->ܺ:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    .line 55
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠᩹᩸;

    .line 56
    new-instance v3, Ll/۠᩹᩸;

    invoke-direct {v3, p1, v2, p0}, Ll/۠᩹᩸;-><init>(Ll/᩺۬᩹;Ll/۠᩹᩸;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v1, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p0

    .line 59
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/᩺۬᩹;)Ll/۠᩹᩸;
    .locals 1

    const-string v0, "stored_text"

    .line 49
    invoke-static {v0, p0}, Ll/۠᩹᩸;->ۙ(Ljava/lang/String;Ll/᩺۬᩹;)Ll/۠᩹᩸;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ljava/util/Map$Entry;)Ll/᩹ܽ᩵;
    .locals 0

    .line 68
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/۠᩹᩸;

    iget-object p0, p0, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/۠᩹᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Ll/۠᩹᩸;->ۚ:Ll/۠᩹᩸;

    return-void
.end method

.method public static synthetic ۙ(Ll/۠᩹᩸;Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 3

    .line 176
    sget-object v1, Ll/۠᩹᩸;->ܺ:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Ll/۠᩹᩸;->ᩴ:Ll/᩺۬᩹;

    invoke-static {v1, v2, p0}, Ll/ۧۚۗ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    iget-object v0, p0, Ll/۠᩹᩸;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    if-nez p1, :cond_1

    .line 179
    iget-object p0, p0, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void

    .line 180
    :cond_1
    iget-object p0, p0, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    invoke-virtual {p0, p1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 176
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۙ(Ll/۠᩹᩸;Ll/᩹ܽ᩵;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    invoke-virtual {p1}, Ll/᩹ܽ᩵;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    iget-object p0, p0, Ll/۠᩹᩸;->᩷:Ll/֫᩹᩸;

    if-nez p0, :cond_1

    :goto_0
    return-void

    .line 96
    :cond_1
    :try_start_0
    iget-object p0, p0, Ll/֫᩹᩸;->ܰ:Ll/ۨ᩹᩸;

    invoke-static {p0}, Ll/ۨ᩹᩸;->ۤ(Ll/ۨ᩹᩸;)Ll/᩹ܽ᩵;

    move-result-object p0

    new-instance v0, Ll/ܿ᩹᩸;

    invoke-direct {v0, p1}, Ll/ܿ᩹᩸;-><init>(Ll/᩹ܽ᩵;)V

    invoke-virtual {p0, v0}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    .line 100
    invoke-virtual {p1, p0}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static ᩷(Ll/۠᩹᩸;)Ll/᩹ܽ᩵;
    .locals 4

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    new-instance v0, Ll/᩹ܽ᩵;

    invoke-direct {v0}, Ll/᩹ܽ᩵;-><init>()V

    .line 88
    iget-object v1, p0, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    new-instance v2, Ll/۬ۜ᩸;

    invoke-direct {v2, v0}, Ll/۬ۜ᩸;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    .line 91
    iget-object v1, p0, Ll/۠᩹᩸;->ۤ:Ll/᩹ܽ᩵;

    new-instance v2, Ll/֨᩹᩸;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0, v0}, Ll/֨᩹᩸;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Runnable;)Ll/᩹ܽ᩵;

    return-object v0
.end method

.method public static ᩷(Ll/᩺۬᩹;)Ll/᩹ܽ᩵;
    .locals 3

    .line 64
    invoke-interface {p0}, Ll/᩺۬᩹;->toAbsolutePath()Ll/᩺۬᩹;

    move-result-object p0

    invoke-interface {p0}, Ll/᩺۬᩹;->normalize()Ll/᩺۬᩹;

    move-result-object p0

    .line 65
    sget-object v1, Ll/۠᩹᩸;->ܺ:Ljava/util/HashMap;

    move-object v0, v1

    monitor-enter v0

    .line 66
    :try_start_0
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/۟᩹᩸;

    invoke-direct {v2, p0}, Ll/۟᩹᩸;-><init>(Ll/᩺۬᩹;)V

    .line 67
    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v1, Ll/۟᩹ۧ;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ll/۟᩹ۧ;-><init>(I)V

    .line 68
    invoke-interface {p0, v1}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v1, Ll/ᩳ᩹᩸;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ᩳ᩹᩸;-><init>(I)V

    invoke-interface {p0, v1}, Ll/᩵ܺۗ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩹ܽ᩵;

    .line 66
    invoke-static {p0}, Ll/᩹ܽ᩵;->ۙ([Ll/᩹ܽ᩵;)Ll/᩹ܽ᩵;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 69
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ۙ()Ljava/lang/String;
    .locals 8

    .line 148
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_3

    .line 149
    new-instance v0, Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\n[sessionDirectoryLeases]\ndirectory="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/۠᩹᩸;->ᩴ:Ll/᩺۬᩹;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    move-object v2, p0

    :goto_0
    if-eqz v2, :cond_1

    const/16 v3, 0x40

    if-ge v1, v3, :cond_1

    .line 152
    iget-object v3, v2, Ll/۠᩹᩸;->ۚ:Ll/۠᩹᩸;

    const-string v4, "[lease depth="

    .line 153
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]\nid="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\nholder="

    .line 154
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Ll/۠᩹᩸;->۫:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\nageMs="

    .line 155
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    iget-wide v6, v2, Ll/۠᩹᩸;->ۙ:J

    sub-long/2addr v4, v6

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "\nready="

    .line 156
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Ll/۠᩹᩸;->֫:Ll/᩹ܽ᩵;

    invoke-static {v4}, Ll/۠᩹᩸;->ۙ(Ll/᩹ܽ᩵;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\nreleaseRequested="

    .line 157
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, v2, Ll/۠᩹᩸;->ۧ:Z

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, "\nfinished="

    .line 158
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v2, Ll/۠᩹᩸;->ܳ:Ll/᩹ܽ᩵;

    invoke-static {v4}, Ll/۠᩹᩸;->ۙ(Ll/᩹ܽ᩵;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\npredecessor="

    .line 159
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 160
    iget-object v2, v2, Ll/۠᩹᩸;->᩸:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖ᩹᩸;

    if-eqz v2, :cond_0

    .line 162
    :try_start_0
    invoke-interface {v2}, Ll/ۖ᩹᩸;->ۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v5, "diagnosticsError="

    .line 163
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v2, "holderDetails=unavailable\n"

    .line 164
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    move-object v2, v3

    goto/16 :goto_0

    :cond_1
    if-eqz v2, :cond_2

    const-string v1, "chainTruncated=true\n"

    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 148
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Lease diagnostics require the main thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ljava/lang/String;Ll/ۖ᩹᩸;)V
    .locals 1

    const-string v0, "@"

    .line 0
    invoke-static {p1, v0}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 107
    invoke-static {p2}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۠᩹᩸;->۫:Ljava/lang/String;

    .line 108
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll/۠᩹᩸;->᩸:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ۙ(Ljava/lang/Throwable;)V
    .locals 2

    move-object v0, p0

    .line 173
    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Ll/۠᩹᩸;->ۧ:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Ll/۠᩹᩸;->ۧ:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 174
    iput-object v0, p0, Ll/۠᩹᩸;->᩷:Ll/֫᩹᩸;

    .line 175
    iget-object v0, p0, Ll/۠᩹᩸;->֫:Ll/᩹ܽ᩵;

    new-instance v1, Ll/᩶᩹᩸;

    invoke-direct {v1, p0, p1}, Ll/᩶᩹᩸;-><init>(Ll/۠᩹᩸;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void

    :catchall_0
    move-exception p1

    .line 173
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final ۙ(Ll/֫᩹᩸;)V
    .locals 1

    .line 82
    iput-object p1, p0, Ll/۠᩹᩸;->᩷:Ll/֫᩹᩸;

    .line 83
    iget-object p1, p0, Ll/۠᩹᩸;->ۤ:Ll/᩹ܽ᩵;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۤ()Ll/᩹ܽ᩵;
    .locals 3

    .line 76
    iget-object v0, p0, Ll/۠᩹᩸;->ۚ:Ll/۠᩹᩸;

    if-nez v0, :cond_0

    .line 77
    invoke-virtual {p0}, Ll/۠᩹᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0

    .line 78
    :cond_0
    invoke-virtual {v0}, Ll/۠᩹᩸;->ۤ()Ll/᩹ܽ᩵;

    move-result-object v1

    new-instance v2, Ll/ۢ᩹᩸;

    invoke-direct {v2, v0}, Ll/ۢ᩹᩸;-><init>(Ll/۠᩹᩸;)V

    invoke-virtual {v1, v2}, Ll/᩹ܽ᩵;->ۤ(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ll/᩹ܽ᩵;
    .locals 2

    .line 72
    new-instance v0, Ll/ۢܳۙ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ll/۠᩹᩸;->֫:Ll/᩹ܽ᩵;

    invoke-virtual {v1, v0}, Ll/᩹ܽ᩵;->᩷(Ll/᩻ܶ᩵;)Ll/᩹ܽ᩵;

    move-result-object v0

    return-object v0
.end method
