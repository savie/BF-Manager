.class public final synthetic Ll/۫᩷ۚ;
.super Ljava/lang/Object;
.source "I6DO"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫᩷ۚ;->ܰ:I

    iput-object p2, p0, Ll/۫᩷ۚ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/۫᩷ۚ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/۫᩷ۚ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ܽܺܳ;

    .line 12
    invoke-virtual {v1}, Ll/ܽܺܳ;->ܽ()V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/۬֨ᩴ;

    .line 18
    invoke-static {v1}, Ll/ܰۖᩴ;->ۙ(Ll/۬֨ᩴ;)V

    return-void

    .line 21
    :pswitch_1
    check-cast v1, Ll/۫֨ᩴ;

    .line 24
    invoke-static {v1}, Ll/۫֨ᩴ;->ۙ(Ll/۫֨ᩴ;)V

    return-void

    .line 27
    :pswitch_2
    check-cast v1, Ll/ۚۚᩴ;

    .line 29
    sget v0, Ll/ۚۚᩴ;->ۛ᩷:I

    const/4 v0, 0x0

    .line 250
    invoke-virtual {v1, v0}, Ll/ۚۚᩴ;->᩷(Z)V

    return-void

    .line 0
    :pswitch_3
    check-cast v1, Landroid/app/Application;

    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v0, v2, :cond_0

    .line 118
    new-instance v0, Landroid/content/Intent;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "package:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const-string v3, "android.settings.MANAGE_UNKNOWN_APP_SOURCES"

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    .line 119
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.settings.SECURITY_SETTINGS"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_0
    const/high16 v2, 0x10000000

    .line 121
    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
