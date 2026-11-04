.class public final synthetic Ll/ᩴۜۚ;
.super Ljava/lang/Object;
.source "X8B6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/ᩴۜۚ;->ܰ:I

    iput-object p1, p0, Ll/ᩴۜۚ;->᩶:Ll/ܽ֡֫;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ᩴۜۚ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ᩴۜۚ;->᩶:Ll/ܽ֡֫;

    .line 9
    check-cast p1, Lbin/mt/plus/Main;

    .line 112
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۘ֡ۤ;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "fromDialog"

    const/4 v2, 0x1

    .line 113
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 114
    invoke-virtual {p1, v0}, Lbin/mt/plus/Main;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ᩴۜۚ;->᩶:Ll/ܽ֡֫;

    check-cast p1, Ll/ܶۜۚ;

    invoke-static {p1}, Ll/ܶۜۚ;->ۤ(Ll/ܶۜۚ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
