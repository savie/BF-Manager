.class public final synthetic Ll/֡۠ᩴ;
.super Ljava/lang/Object;
.source "PAKQ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ll/ܽ֡֫;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ֡֫;I)V
    .locals 0

    .line 0
    iput p2, p0, Ll/֡۠ᩴ;->ܰ:I

    iput-object p1, p0, Ll/֡۠ᩴ;->᩶:Ll/ܽ֡֫;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/֡۠ᩴ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/֡۠ᩴ;->᩶:Ll/ܽ֡֫;

    .line 197
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const v0, 0x7f1208c3

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->᩷(I)V

    const v0, 0x7f1208c4

    .line 198
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(I)V

    const v0, 0x7f12018c

    const/4 v1, 0x0

    .line 199
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 200
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    .line 201
    invoke-static {p1}, Ll/ۚۙܺ;->ۙ(Ll/۠ۖۧ;)V

    return-void

    .line 264
    :pswitch_0
    invoke-static {}, Ll/ۙ۠֫;->ۙ()Z

    move-result p1

    iget-object v0, p0, Ll/֡۠ᩴ;->᩶:Ll/ܽ֡֫;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 265
    invoke-static {}, Ll/۫ۤܺ;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Ll/᩶֡֫;->ۙ(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_0

    .line 267
    :cond_0
    invoke-static {}, Ll/۫ۤܺ;->۫()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v1}, Ll/᩶֡֫;->ۙ(Landroid/content/Context;Ljava/lang/String;Z)V

    :goto_0
    return-void

    .line 0
    :pswitch_1
    iget-object p1, p0, Ll/֡۠ᩴ;->᩶:Ll/ܽ֡֫;

    invoke-static {p1}, Ll/ۤۜᩴ;->ۙ(Ll/ܽ֡֫;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
