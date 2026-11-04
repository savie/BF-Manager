.class public final synthetic Ll/۫ۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ۟:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p5, p0, Ll/۫ۤۚ;->ܰ:I

    iput-object p1, p0, Ll/۫ۤۚ;->᩶:Landroid/view/KeyEvent$Callback;

    iput-object p2, p0, Ll/۫ۤۚ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/۫ۤۚ;->֡:Ljava/lang/Object;

    iput-object p4, p0, Ll/۫ۤۚ;->۟:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 2
    iget v0, p0, Ll/۫ۤۚ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/۫ۤۚ;->۟:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/۫ۤۚ;->֡:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/۫ۤۚ;->ܿ:Ljava/lang/Object;

    .line 10
    iget-object v4, p0, Ll/۫ۤۚ;->᩶:Landroid/view/KeyEvent$Callback;

    packed-switch v0, :pswitch_data_0

    .line 16
    check-cast v4, Ll/ܶۜۚ;

    .line 19
    move-object v10, v3

    check-cast v10, Ljava/util/ArrayList;

    .line 22
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    check-cast v1, Ll/۬֨ᩴ;

    .line 27
    sget v0, Ll/ܶۜۚ;->ۡ᩷:I

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v4, Ll/֫ۖ᩸;

    check-cast v3, Ll/᩹ۖ᩸;

    check-cast v2, Ll/ܽ֡֫;

    check-cast v1, Ll/۠ۖۧ;

    invoke-static {v4, v3, v2, v1}, Ll/ۛ᩸ۚ;->ۙ(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;Ll/ܽ֡֫;Ll/۠ۖۧ;)V

    return-void

    .line 670
    :goto_0
    :try_start_0
    new-instance v0, Ll/ۧۜۚ;

    invoke-direct {v0, v2}, Ll/ۧۜۚ;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-static {v10, v0}, Ll/ᩴ᩻֫;->ۙ(Ljava/util/ArrayList;Ll/ۧۜۚ;)Ll/᩸᩻֫;

    move-result-object v9

    .line 671
    new-instance v0, Ll/۬۠ۚ;

    move-object v5, v0

    move-object v6, v4

    move-object v7, v1

    move-object v8, v2

    invoke-direct/range {v5 .. v10}, Ll/۬۠ۚ;-><init>(Ll/ܶۜۚ;Ll/۬֨ᩴ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/᩸᩻֫;Ljava/util/ArrayList;)V

    invoke-virtual {v4, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 685
    new-instance v3, Ll/᩶۟ܳ;

    invoke-direct {v3, v4, v1, v2, v0}, Ll/᩶۟ܳ;-><init>(Ll/ܶۜۚ;Ll/۬֨ᩴ;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/Exception;)V

    invoke-virtual {v4, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
