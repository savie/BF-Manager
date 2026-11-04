.class public final synthetic Ll/ۘۢܳ;
.super Ljava/lang/Object;
.source "E4GI"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ۘۢܳ;->ܰ:I

    iput-object p1, p0, Ll/ۘۢܳ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۘۢܳ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۘۢܳ;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget p1, p0, Ll/ۘۢܳ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۘۢܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ljava/util/ArrayList;

    .line 11
    iget-object p2, p0, Ll/ۘۢܳ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast p2, Ll/ᩴ᩶ܳ;

    .line 15
    iget-object v0, p0, Ll/ۘۢܳ;->֡:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/۫ۛܳ;

    .line 39
    invoke-virtual {p2}, Ll/ᩴ᩶ܳ;->ܺ()I

    move-result p2

    invoke-static {p1, p2}, Ll/᩸ܿܳ;->᩷(Ljava/util/ArrayList;I)V

    .line 40
    invoke-virtual {v0}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ܳ۫;->ۙ(Lbin/mt/plus/Main;)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۘۢܳ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ۢۢܳ;

    iget-object p2, p0, Ll/ۘۢܳ;->ܿ:Ljava/lang/Object;

    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v0, p0, Ll/ۘۢܳ;->֡:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    move-object v0, p1

    .line 244
    monitor-enter v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    .line 245
    :try_start_0
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    .line 246
    invoke-virtual {v1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 247
    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 249
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
