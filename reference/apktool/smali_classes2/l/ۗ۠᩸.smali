.class public final synthetic Ll/ۗ۠᩸;
.super Ljava/lang/Object;
.source "X68P"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۗ۠᩸;->ܰ:I

    iput-object p2, p0, Ll/ۗ۠᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 2
    iget v0, p0, Ll/ۗ۠᩸;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ۗ۠᩸;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/᩹ܿ۫;

    .line 12
    invoke-static {v1}, Ll/᩹ܿ۫;->ۙ(Ll/᩹ܿ۫;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v1, Ll/ܽ֡֫;

    const-string v0, "def_sign_key_warn"

    const v2, 0x7f120239

    .line 293
    invoke-static {v2, v1, v0}, Ll/۫۠ᩴ;->᩷(ILl/ܽ֡֫;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ܺ֡ܳ;

    invoke-static {v1}, Ll/ܺ֡ܳ;->᩷(Ll/ܺ֡ܳ;)V

    return-void

    :pswitch_2
    check-cast v1, Landroid/content/Context;

    .line 129
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 136
    new-instance v2, Ll/᩻֫᩸;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v1}, Ll/᩻֫᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 0
    :pswitch_3
    check-cast v1, Ll/᩷ۙۙ;

    sget v0, Ll/᩷ۙۙ;->ܿ:I

    const/16 v0, 0x8

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 0
    :pswitch_4
    check-cast v1, Ll/᩺ۜ᩸;

    invoke-static {v1}, Ll/᩺ۜ᩸;->۫(Ll/᩺ۜ᩸;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
