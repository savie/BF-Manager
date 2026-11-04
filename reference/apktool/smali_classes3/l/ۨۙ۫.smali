.class public final synthetic Ll/ۨۙ۫;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨۙ۫;->ܰ:I

    iput-object p2, p0, Ll/ۨۙ۫;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 2
    iget p1, p0, Ll/ۨۙ۫;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۨۙ۫;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/֫ۖۤ;

    .line 947
    invoke-interface {p1}, Ll/֫ۖۤ;->ܳ()V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۨۙ۫;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ᩳۙ۫;

    .line 207
    invoke-interface {p1}, Ll/ᩳۙ۫;->ۙ()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
