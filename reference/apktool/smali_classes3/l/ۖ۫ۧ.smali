.class public final synthetic Ll/ۖ۫ۧ;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/ܶ᩻ۙ;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۖ۫ۧ;->ܰ:I

    iput-object p2, p0, Ll/ۖ۫ۧ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۖ۫ۧ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۖ۫ۧ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Landroid/view/MenuItem;

    .line 11
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    .line 18
    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Ll/ۖ۫ۧ;->᩶:Ljava/lang/Object;

    .line 23
    check-cast v0, Ll/֨֫ۧ;

    .line 25
    check-cast p1, Ljava/lang/Throwable;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
