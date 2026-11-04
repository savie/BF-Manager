.class public final synthetic Ll/ۧۚۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/֡ۛۙ;
.implements Ll/ᩳۢܳ;
.implements Ll/᩶ܽ;
.implements Ll/ܶ᩸֫;
.implements Ll/ܿ֫ܺ;
.implements Ll/֡֨֫;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧۚۧ;->ܰ:I

    iput-object p2, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget v0, p0, Ll/ۧۚۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۜ۫֫;

    invoke-static {v0, p1}, Ll/ۜ۫֫;->ۙ(Ll/ۜ۫֫;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܰۡܳ;

    invoke-static {v0, p1}, Ll/ܰۡܳ;->ۙ(Ll/ܰۡܳ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Ll/᩻᩺ۙ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public synthetic ۙ()V
    .locals 0

    return-void
.end method

.method public ۙ(JLl/᩶ۨۙ;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܶܽ᩷;

    invoke-static {v0, p1, p2, p3}, Ll/ܶܽ᩷;->ۙ(Ll/ܶܽ᩷;JLl/᩶ۨۙ;)V

    return-void
.end method

.method public ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۧۚۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿܰۧ;

    check-cast p1, Ll/᩶᩵ۧ;

    invoke-static {v0, p1}, Ll/ܿܰۧ;->ۤ(Ll/ܿܰۧ;Ll/᩶᩵ۧ;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/֫ܶۧ;

    invoke-static {p1}, Ll/֫ܶۧ;->ۙ(Ll/֫ܶۧ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۗ֡ۧ;

    invoke-static {v0, p1}, Ll/ۗ֡ۧ;->ۙ(Ll/ۗ֡ۧ;Ljava/lang/String;)V

    return-void
.end method

.method public ᩷(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۧۚۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩸ܽܺ;

    invoke-virtual {v0, p1}, Ll/᩸ܽܺ;->ۙ(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۧۚۧ;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
