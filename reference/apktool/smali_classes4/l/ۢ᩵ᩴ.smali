.class public final synthetic Ll/ۢ᩵ᩴ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ܶۤۧ;
.implements Ll/֫ۛᩴ;
.implements Ll/᩶ܽ;
.implements Ll/᩶ۚܺ;
.implements Ll/ۧۧۧ;
.implements Ll/ܳ۬᩻;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۢ᩵ᩴ;->ܰ:I

    iput-object p2, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)Ljava/util/List;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩻ۧۧ;

    .line 6
    check-cast p1, Ll/ܶܺۧ;

    .line 55
    :try_start_0
    invoke-interface {p1}, Ll/ܶܺۧ;->ۙ()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 57
    invoke-virtual {v0}, Ll/᩻ۧۧ;->get()Ll/ۘܶۤ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۘܶۤ;->reset(Ljava/lang/CharSequence;)V

    .line 39
    invoke-static {v0}, Ll/۟ۚ᩸;->ۙ(Ll/ۘܶۤ;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 59
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    :cond_0
    new-instance v2, Ll/ܳۧۧ;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ll/ܳۧۧ;-><init>(I)V

    .line 62
    invoke-virtual {v0}, Ll/ۘܶۤ;->start()I

    move-result v3

    iput v3, v2, Ll/ܳۧۧ;->ܰ:I

    .line 63
    invoke-virtual {v0}, Ll/ۘܶۤ;->end()I

    move-result v3

    iput v3, v2, Ll/ܳۧۧ;->᩶:I

    .line 64
    iget v4, v2, Ll/ܳۧۧ;->ܰ:I

    invoke-virtual {v2, v4, v3, p1}, Ll/ܳۧۧ;->ۙ(IILjava/lang/CharSequence;)V

    .line 65
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-static {v0}, Ll/۟ۚ᩸;->ۙ(Ll/ۘܶۤ;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0x7d0

    if-lt v2, v3, :cond_0

    :cond_1
    return-object v1

    :catchall_0
    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    sget v1, Ll/᩶ܽܳ;->ۙ᩷:I

    .line 454
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۙ(Landroid/content/Intent;I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ۢ᩵ᩴ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Lbin/mt/plus/Main;

    invoke-static {v0, p2, p1}, Lbin/mt/plus/Main;->᩷(Lbin/mt/plus/Main;ILandroid/content/Intent;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/᩸ܿۤ;

    invoke-static {v0, p2, p1}, Ll/᩸ܿۤ;->ۙ(Ll/᩸ܿۤ;ILandroid/content/Intent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ۙ(Ll/۬ۢ᩻;)V
    .locals 2

    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܰ۠᩻;

    const-string v1, "response"

    .line 0
    invoke-static {p1, v1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1}, Ll/۬ۢ᩻;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_0

    const p1, 0x7f120ca3

    .line 97
    invoke-virtual {v0, p1}, Ll/ܰ۠᩻;->ۙ(I)V

    return-void

    :cond_0
    const v1, 0x7f120573

    .line 232
    invoke-static {p1, v1}, Ll/֨ᩳ᩻;->ۙ(Ll/۬ۢ᩻;I)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 440
    invoke-virtual {v0, p1, v1}, Ll/ܰ۠᩻;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, [B

    .line 971
    invoke-virtual {p1, v0}, Ll/᩷ۨᩴ;->ۙ([B)V

    return-void
.end method

.method public ᩷()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۢ᩵ᩴ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ᩳ֡᩻;

    .line 116
    invoke-static {v0}, Ll/۠֡᩻;->᩷(Ll/֨֡᩻;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
