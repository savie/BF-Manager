.class public final synthetic Ll/ۡܿۤ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡܿۤ;->ܰ:I

    iput-object p2, p0, Ll/ۡܿۤ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ۡܿۤ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 2
    iget v0, p0, Ll/ۡܿۤ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۡܿۤ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/֫ᩳ۫;

    .line 11
    iget-object v1, p0, Ll/ۡܿۤ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Landroid/content/Intent;

    .line 16
    invoke-static {v0, v1}, Ll/֫ᩳ۫;->ۙ(Ll/֫ᩳ۫;Landroid/content/Intent;)V

    return-void

    .line 19
    :pswitch_0
    iget-object v0, p0, Ll/ۡܿۤ;->᩶:Ljava/lang/Object;

    .line 21
    check-cast v0, [Z

    .line 23
    iget-object v1, p0, Ll/ۡܿۤ;->ܿ:Ljava/lang/Object;

    .line 25
    check-cast v1, Ll/᩺ۜ᩸;

    const/4 v2, 0x0

    .line 99
    aget-boolean v3, v0, v2

    if-nez v3, :cond_0

    .line 100
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۧ᩸()V

    const/4 v1, 0x1

    .line 101
    aput-boolean v1, v0, v2

    :cond_0
    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۡܿۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۘۡ᩸;

    iget-object v1, p0, Ll/ۡܿۤ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 167
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-nez v1, :cond_1

    .line 168
    new-instance v1, Ll/֨᩺᩻;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ll/֨᩺᩻;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_1
    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/ۡܿۤ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۘ֡ۤ;

    iget-object v1, p0, Ll/ۡܿۤ;->ܿ:Ljava/lang/Object;

    check-cast v1, Ll/ܰᩴ᩸;

    invoke-static {v0, v1}, Ll/ۘ֡ۤ;->ۙ(Ll/ۘ֡ۤ;Ll/ܰᩴ᩸;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
