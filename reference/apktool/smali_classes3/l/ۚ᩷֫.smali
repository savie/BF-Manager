.class public final Ll/ۚ᩷֫;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ֡:Ll/ۨۧۙ;

.field public final synthetic ۟:Ll/ۜܺۙ;

.field public final synthetic ܰ:Ll/ۗ᩷֫;

.field public final synthetic ܿ:Landroid/content/BroadcastReceiver;

.field public final synthetic ᩳ:Ll/֨֨;

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public constructor <init>(Ll/ۗ᩷֫;Ll/ܽ֡֫;Ll/ܺۙ֫;Ll/ۜܺۙ;Landroid/content/BroadcastReceiver;Ll/ۨۧۙ;)V
    .locals 0

    .line 418
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩷֫;->ܰ:Ll/ۗ᩷֫;

    iput-object p2, p0, Ll/ۚ᩷֫;->᩶:Ll/ܽ֡֫;

    iput-object p3, p0, Ll/ۚ᩷֫;->ᩳ:Ll/֨֨;

    iput-object p4, p0, Ll/ۚ᩷֫;->۟:Ll/ۜܺۙ;

    iput-object p5, p0, Ll/ۚ᩷֫;->ܿ:Landroid/content/BroadcastReceiver;

    iput-object p6, p0, Ll/ۚ᩷֫;->֡:Ll/ۨۧۙ;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    .line 421
    iget-object p1, p0, Ll/ۚ᩷֫;->᩶:Ll/ܽ֡֫;

    instance-of v0, p1, Lbin/mt/plus/Main;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 422
    invoke-static {v0}, Ll/ۗ᩷֫;->ۙ(Z)V

    .line 424
    :cond_0
    iget-object v0, p0, Ll/ۚ᩷֫;->ᩳ:Ll/֨֨;

    if-eqz v0, :cond_1

    .line 425
    invoke-virtual {p1, v0}, Ll/ۚۤ;->ۚ(Ll/֨֨;)V

    .line 426
    invoke-virtual {p1, v0}, Ll/ۚۤ;->ۙ(Ll/֨֨;)V

    .line 428
    :cond_1
    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۚ᩷֫;->۟:Ll/ۜܺۙ;

    iget-object v2, p0, Ll/ۚ᩷֫;->ܿ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Ll/ۜܺۙ;->ۙ(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 429
    invoke-virtual {p1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p1

    iget-object v0, p0, Ll/ۚ᩷֫;->֡:Ll/ۨۧۙ;

    invoke-virtual {p1, v0}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 5

    .line 434
    iget-object p1, p0, Ll/ۚ᩷֫;->ܰ:Ll/ۗ᩷֫;

    invoke-static {p1}, Ll/ۗ᩷֫;->ۤ(Ll/ۗ᩷֫;)Ll/۟ܺ֫;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 435
    invoke-static {p1}, Ll/ۗ᩷֫;->ۤ(Ll/ۗ᩷֫;)Ll/۟ܺ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ܺ֫;->dismiss()V

    .line 436
    invoke-static {p1}, Ll/ۗ᩷֫;->۫(Ll/ۗ᩷֫;)V

    .line 438
    :cond_0
    invoke-static {p1}, Ll/ۗ᩷֫;->᩸(Ll/ۗ᩷֫;)Landroid/widget/PopupWindow;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 440
    invoke-static {p1}, Ll/ۗ᩷֫;->᩸(Ll/ۗ᩷֫;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 441
    invoke-static {p1}, Ll/ۗ᩷֫;->ۚ(Ll/ۗ᩷֫;)V

    .line 443
    :cond_1
    iget-object v0, p0, Ll/ۚ᩷֫;->᩶:Ll/ܽ֡֫;

    instance-of v1, v0, Lbin/mt/plus/Main;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 444
    invoke-static {v2}, Ll/ۗ᩷֫;->ۙ(Z)V

    .line 446
    :cond_2
    iget-object v1, p0, Ll/ۚ᩷֫;->ᩳ:Ll/֨֨;

    if-eqz v1, :cond_3

    .line 447
    invoke-virtual {v0, v1}, Ll/ۚۤ;->ۚ(Ll/֨֨;)V

    .line 449
    :cond_3
    iget-object v1, p0, Ll/ۚ᩷֫;->۟:Ll/ۜܺۙ;

    iget-object v3, p0, Ll/ۚ᩷֫;->ܿ:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v3}, Ll/ۜܺۙ;->ۙ(Landroid/content/BroadcastReceiver;)V

    .line 450
    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    iget-object v3, p0, Ll/ۚ᩷֫;->֡:Ll/ۨۧۙ;

    invoke-virtual {v1, v3}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    .line 451
    invoke-static {p1}, Ll/ۗ᩷֫;->ܳ(Ll/ۗ᩷֫;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_2

    .line 456
    :cond_4
    instance-of v1, v0, Ll/᩵᩷֫;

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Ll/᩵᩷֫;

    .line 457
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v4

    if-nez v4, :cond_5

    .line 458
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 460
    :cond_5
    sget-object v0, Ll/ۗ᩷֫;->ۨ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v0, v4, :cond_7

    invoke-virtual {v1}, Ll/᩵᩷֫;->᩷ۙ()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    .line 465
    :cond_6
    sget-object v0, Ll/ۗ᩷֫;->ۨ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0}, Ll/ܺ᩻ۙ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v0, v1, :cond_7

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_8

    .line 108
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v4, "mbp"

    invoke-interface {v1, v4, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_8

    const/4 v0, 0x1

    :cond_8
    if-eqz v0, :cond_9

    .line 475
    invoke-static {}, Ll/֨᩷֫;->ۙ()V

    .line 476
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 477
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object v0

    iget-boolean v0, v0, Ll/᩹᩷֫;->۫:Z

    .line 478
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object v1

    iget-wide v1, v1, Ll/᩹᩷֫;->ۚ:J

    .line 479
    invoke-static {}, Ll/ۗ᩷֫;->ۤ()Ll/᩹᩷֫;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/᩹᩷֫;->ۙ(Z)V

    .line 480
    invoke-static {}, Ll/ۗ᩷֫;->᩸()V

    if-eqz v0, :cond_9

    .line 482
    invoke-static {p1}, Ll/ۗ᩷֫;->᩷(Ll/ۗ᩷֫;)Ll/ܽ֡֫;

    move-result-object p1

    sget v0, Ll/ۘ᩷֫;->۟:I

    .line 200
    new-instance v0, Landroid/content/Intent;

    const-class v3, Ll/ۘ᩷֫;

    invoke-direct {v0, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "bin.mt.media.MusicPlayerService.ACTION_EXIT"

    .line 201
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v3, "playbackSessionId"

    .line 202
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object v0

    .line 200
    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_9
    :goto_2
    return-void
.end method
