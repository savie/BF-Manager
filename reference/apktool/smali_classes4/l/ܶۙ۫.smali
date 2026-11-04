.class public final synthetic Ll/ܶۙ۫;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܶۙ۫;->ܰ:I

    iput-object p2, p0, Ll/ܶۙ۫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ܶۙ۫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ܶۙ۫;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۠ۖۧ;

    .line 192
    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ܶۙ۫;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/۠ۢᩴ;

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll/᩸֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ܶۙ۫;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܽ֡֫;

    .line 465
    invoke-static {v0, p1}, Ll/֨ۙ۫;->ۙ(Ll/ܽ֡֫;Landroid/view/View;)Ll/ܿܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܿܽ;->ᩴ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
