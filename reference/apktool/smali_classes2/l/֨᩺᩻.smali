.class public final synthetic Ll/֨᩺᩻;
.super Ljava/lang/Object;
.source "08W8"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨᩺᩻;->ܰ:I

    iput-object p2, p0, Ll/֨᩺᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/֨᩺᩻;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/֨᩺᩻;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Landroid/content/Context;

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast v1, Ll/۟᩺᩻;

    invoke-virtual {v1}, Ll/۟᩺᩻;->ۚ()V

    return-void

    :pswitch_1
    check-cast v1, Ljava/util/List;

    .line 94
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۟ᩴ;

    .line 95
    invoke-virtual {v1}, Ll/ܶ۟ᩴ;->ۙ()V

    goto :goto_0

    :cond_0
    return-void

    .line 0
    :pswitch_2
    check-cast v1, Ll/ۘۡ᩸;

    invoke-static {v1}, Ll/ۘۡ᩸;->ۤ(Ll/ۘۡ᩸;)V

    return-void

    :pswitch_3
    check-cast v1, [Ljava/lang/String;

    const/4 v0, 0x1

    .line 43
    aget-object v0, v1, v0

    sget-object v1, Ll/ۜ᩺᩻;->ۙ:Ll/ܽ᩻ۙ;

    const-string v1, "orderId"

    .line 0
    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    new-instance v1, Ljava/lang/Thread;

    .line 173
    new-instance v2, Ll/۠ۡۘ;

    const/4 v3, 0x4

    invoke-direct {v2, v3, v0}, Ll/۠ۡۘ;-><init>(ILjava/lang/Object;)V

    .line 160
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 173
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    .line 37
    :goto_1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.meizu.safe.security.SHOW_APPSEC"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "packageName"

    .line 39
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    .line 40
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 41
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 43
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    .line 44
    invoke-static {v1}, Ll/۟֨ܺ;->ۤ(Landroid/content/Context;)V

    :goto_2
    return-void

    .line 46
    :cond_1
    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
