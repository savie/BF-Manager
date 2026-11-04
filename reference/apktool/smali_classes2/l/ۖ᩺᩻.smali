.class public final synthetic Ll/ۖ᩺᩻;
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
    iput p1, p0, Ll/ۖ᩺᩻;->ܰ:I

    iput-object p2, p0, Ll/ۖ᩺᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 2
    iget v0, p0, Ll/ۖ᩺᩻;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ۖ᩺᩻;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Landroid/content/Context;

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v1, Ll/ۡܶ֫;

    invoke-static {v1}, Ll/ۡܶ֫;->ۙ(Ll/ۡܶ֫;)V

    return-void

    :pswitch_1
    check-cast v1, Ll/᩷᩻֫;

    invoke-static {v1}, Ll/᩷᩻֫;->ᩴ(Ll/᩷᩻֫;)V

    return-void

    :pswitch_2
    check-cast v1, [Ljava/lang/String;

    const/4 v0, 0x1

    .line 104
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

    .line 60
    :goto_0
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const/high16 v2, 0x10000000

    .line 61
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 63
    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.coloros.safecenter"

    const-string v4, "com.coloros.safecenter.sysfloatwindow.FloatWindowListActivity"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 65
    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 67
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open OPPO floating window settings"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
