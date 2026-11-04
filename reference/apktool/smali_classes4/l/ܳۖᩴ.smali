.class public final synthetic Ll/ܳۖᩴ;
.super Ljava/lang/Object;
.source "964K"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/ܳۖᩴ;->ܰ:I

    iput-object p1, p0, Ll/ܳۖᩴ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܳۖᩴ;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܳۖᩴ;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget v0, p0, Ll/ܳۖᩴ;->ܰ:I

    .line 4
    iget-object v1, p0, Ll/ܳۖᩴ;->֡:Ljava/lang/Object;

    .line 6
    iget-object v2, p0, Ll/ܳۖᩴ;->ܿ:Ljava/lang/Object;

    .line 8
    iget-object v3, p0, Ll/ܳۖᩴ;->᩶:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 13
    check-cast v3, Ll/ܽ֡֫;

    .line 15
    check-cast v2, Ll/᩷ۨᩴ;

    .line 17
    check-cast v1, Ll/ۖۗܳ;

    .line 19
    sget p1, Ll/ۧۤ᩻;->ۧ᩷:I

    .line 428
    sget p1, Ll/֫ۘܳ;->ۙ:I

    .line 2015
    new-instance p1, Landroid/content/Intent;

    const-class p2, Ll/ۧۤ᩻;

    invoke-direct {p1, v3, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p2, 0x10000000

    .line 2016
    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string p2, "android.intent.action.VIEW"

    .line 2017
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 2018
    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2019
    invoke-virtual {v3, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    const/16 p1, 0x7d0

    .line 234
    invoke-static {v1, p1}, Ll/ᩴ᩶ܳ;->ۙ(Ll/ۖۗܳ;I)V

    return-void

    .line 0
    :pswitch_0
    check-cast v3, Ll/ۖᩴۧ;

    check-cast v2, Ll/ܽ֡֫;

    check-cast v1, [I

    .line 102
    invoke-virtual {v2}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const p2, 0x7f120c3f

    .line 103
    invoke-virtual {p1, p2}, Ll/ۖۖۧ;->᩷(I)V

    const p2, 0x7f120165

    .line 104
    invoke-virtual {p1, p2}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance p2, Ll/ᩳۚ᩸;

    const/4 v0, 0x1

    invoke-direct {p2, v0, v3, v1}, Ll/ᩳۚ᩸;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v0, 0x7f1208c9

    .line 105
    invoke-virtual {p1, v0, p2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f120161

    const/4 v0, 0x0

    .line 108
    invoke-virtual {p1, p2, v0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 109
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 0
    :pswitch_1
    check-cast v3, Ll/ܰۖᩴ;

    check-cast v2, Ll/۠ۨܳ;

    check-cast v1, Ljava/lang/String;

    invoke-static {v3, v2, v1, p1, p2}, Ll/ܰۖᩴ;->ۙ(Ll/ܰۖᩴ;Ll/۠ۨܳ;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
