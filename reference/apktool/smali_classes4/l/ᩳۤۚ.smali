.class public final synthetic Ll/ᩳۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ۟:Landroid/view/KeyEvent$Callback;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩳ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p6, p0, Ll/ᩳۤۚ;->ܰ:I

    iput-object p1, p0, Ll/ᩳۤۚ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ᩳۤۚ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ᩳۤۚ;->֡:Ljava/lang/Object;

    iput-object p4, p0, Ll/ᩳۤۚ;->۟:Landroid/view/KeyEvent$Callback;

    iput-object p5, p0, Ll/ᩳۤۚ;->ᩳ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 2
    iget v0, p0, Ll/ᩳۤۚ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ᩳۤۚ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 11
    iget-object v1, p0, Ll/ᩳۤۚ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ljava/lang/String;

    .line 15
    iget-object v2, p0, Ll/ᩳۤۚ;->֡:Ljava/lang/Object;

    .line 17
    check-cast v2, Ll/᩸ۡ᩻;

    .line 19
    iget-object v3, p0, Ll/ᩳۤۚ;->۟:Landroid/view/KeyEvent$Callback;

    .line 21
    check-cast v3, Landroid/app/Activity;

    .line 23
    iget-object v4, p0, Ll/ᩳۤۚ;->ᩳ:Ljava/lang/Object;

    .line 25
    check-cast v4, Ll/ܳ۬᩻;

    .line 28
    invoke-static {v0, v1, v2, v3, v4}, Ll/ۧ۬᩻;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩸ۡ᩻;Landroid/app/Activity;Ll/ܳ۬᩻;)V

    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, Ll/ᩳۤۚ;->᩶:Ljava/lang/Object;

    .line 33
    check-cast v0, Ll/۠ۖۧ;

    .line 35
    iget-object v1, p0, Ll/ᩳۤۚ;->ܿ:Ljava/lang/Object;

    .line 37
    check-cast v1, Ll/ܽ֡֫;

    .line 39
    iget-object v2, p0, Ll/ᩳۤۚ;->֡:Ljava/lang/Object;

    .line 42
    move-object v3, v2

    check-cast v3, Ll/᩶֨֫;

    .line 44
    iget-object v2, p0, Ll/ᩳۤۚ;->۟:Landroid/view/KeyEvent$Callback;

    .line 46
    check-cast v2, Ll/᩹ۖ᩸;

    .line 48
    iget-object v4, p0, Ll/ᩳۤۚ;->ᩳ:Ljava/lang/Object;

    .line 51
    move-object v10, v4

    check-cast v10, Ll/֡ۤۚ;

    .line 433
    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 434
    instance-of v0, v1, Ll/᩵᩸ۧ;

    if-eqz v0, :cond_0

    check-cast v1, Ll/᩵᩸ۧ;

    const/4 v0, 0x1

    .line 435
    invoke-virtual {v1, v0}, Ll/᩵᩸ۧ;->᩷(Z)V

    .line 438
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v5, 0x7f1205f2

    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 1654
    invoke-virtual/range {v3 .. v9}, Ll/ܶ֨֫;->ۙ(IILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 440
    invoke-virtual {v10}, Ll/֡ۤۚ;->run()V

    .line 441
    throw v0

    :cond_1
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
