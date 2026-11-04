.class public final synthetic Ll/֫ܺܳ;
.super Ljava/lang/Object;
.source "CIUF"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:Ll/ܽܺܳ;

.field public final synthetic ܿ:Ll/ۧܽܳ;

.field public final synthetic ᩶:Z


# direct methods
.method public synthetic constructor <init>(Ll/ܽܺܳ;Ll/ۧܽܳ;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܺܳ;->ܰ:Ll/ܽܺܳ;

    iput-boolean p3, p0, Ll/֫ܺܳ;->᩶:Z

    iput-object p2, p0, Ll/֫ܺܳ;->ܿ:Ll/ۧܽܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 2
    iget-object v1, p0, Ll/֫ܺܳ;->ܰ:Ll/ܽܺܳ;

    .line 4
    iget-boolean v2, p0, Ll/֫ܺܳ;->᩶:Z

    .line 6
    iget-object v3, p0, Ll/֫ܺܳ;->ܿ:Ll/ۧܽܳ;

    .line 178
    sget-object v4, Ll/᩶᩷ۧ;->᩷:Ll/ܽܿ֫;

    .line 179
    invoke-static {}, Ll/۟۠ۧ;->ᩴ()Ll/᩻۠ۧ;

    move-result-object v5

    .line 110
    invoke-static {v4, v5}, Ll/᩷ܺܳ;->ۙ(Landroid/content/Context;Ll/᩻۠ۧ;)Z

    move-result v0

    const/4 v6, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    .line 111
    monitor-enter v0

    if-eqz v2, :cond_1

    .line 113
    :try_start_0
    invoke-static {v4}, Ll/ܳܺܳ;->ۙ(Landroid/content/ContextWrapper;)Z

    move-result v2

    if-nez v2, :cond_1

    monitor-exit v0

    goto :goto_0

    .line 114
    :cond_1
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/UserHandle;->hashCode()I

    move-result v2

    new-instance v6, Landroid/content/ComponentName;

    const-class v7, Lcom/google/android/accessibility/selecttospeak/SelectToSpeakService;

    invoke-direct {v6, v4, v7}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 115
    invoke-virtual {v6}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ll/ۡ᩻ܳ;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 114
    invoke-static {v5, v2, v4, v6}, Ll/᩷ܺܳ;->ۙ(Ll/᩻۠ۧ;ILjava/lang/String;Ll/ۡ᩻ܳ;)Z

    move-result v6

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 180
    :goto_0
    new-instance v0, Ll/ۧܺܳ;

    invoke-direct {v0, v1, v3, v6}, Ll/ۧܺܳ;-><init>(Ll/ܽܺܳ;Ll/ۧܽܳ;Z)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v1

    .line 117
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
