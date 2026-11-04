.class public final synthetic Ll/᩺ۙ۫;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ֡:Ljava/lang/Object;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩺ۙ۫;->ܰ:I

    iput-object p1, p0, Ll/᩺ۙ۫;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩺ۙ۫;->ܿ:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩺ۙ۫;->֡:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 2
    iget v0, p0, Ll/᩺ۙ۫;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩺ۙ۫;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ll/۠ۨܳ;

    .line 11
    iget-object v1, p0, Ll/᩺ۙ۫;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v1, Ll/ܿܰᩴ;

    .line 15
    iget-object v2, p0, Ll/᩺ۙ۫;->֡:Ljava/lang/Object;

    .line 17
    check-cast v2, Ll/ۡۗܳ;

    .line 438
    invoke-virtual {v0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    .line 439
    invoke-virtual {v2}, Ll/ۡۗܳ;->᩸()I

    move-result v3

    invoke-static {v3}, Ll/ۜ֨ۚ;->᩸(I)Ljava/lang/String;

    move-result-object v3

    .line 440
    invoke-virtual {v2}, Ll/ۡۗܳ;->ۚ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ll/ۡۗܳ;->ۙ()Ljava/lang/String;

    move-result-object v2

    .line 115
    invoke-virtual {v1}, Ll/ܿܰᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3, v4, v2}, Ll/᩹ܳ۫;->ۙ(Ll/ܽ֡֫;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩺ۙ۫;->᩶:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ll/ܽ֡֫;

    iget-object v0, p0, Ll/᩺ۙ۫;->ܿ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ll/᩺ۙ۫;->֡:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ll/ᩳۙ۫;

    .line 192
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_2

    .line 193
    invoke-virtual {v5}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v1

    sget-object v2, Ll/ۖۧۙ;->֡:Ll/ۖۧۙ;

    if-ne v1, v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const v1, 0x7f0d007e

    .line 198
    invoke-virtual {v5, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0681

    .line 199
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f120105

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 201
    invoke-static {v5, v1, v0}, Ll/ܺۖۤ;->ۙ(Ll/ܽ֡֫;Landroid/view/View;Ljava/lang/String;)Ll/֫ۖۤ;

    move-result-object v3

    .line 202
    invoke-virtual {v5}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    .line 203
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v2, 0x7f1208c9

    const/4 v4, 0x0

    .line 204
    invoke-virtual {v0, v2, v4}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/᩵ۙ۫;

    invoke-direct {v2, v6}, Ll/᩵ۙ۫;-><init>(Ll/ᩳۙ۫;)V

    const v7, 0x7f120161

    .line 205
    invoke-virtual {v0, v7, v2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f120b0e

    .line 206
    invoke-virtual {v0, v2, v4}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/ۨۙ۫;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v6}, Ll/ۨۙ۫;-><init>(ILjava/lang/Object;)V

    .line 207
    invoke-virtual {v0, v2}, Ll/ۖۖۧ;->ۙ(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 208
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v2

    .line 209
    invoke-virtual {v2}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-nez v0, :cond_1

    .line 211
    invoke-interface {v6}, Ll/ᩳۙ۫;->ۙ()V

    goto :goto_1

    :cond_1
    const v0, 0x7f0a0573

    .line 214
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 215
    new-instance v0, Ll/ۛۙ۫;

    invoke-direct {v0, v7, v3, v2}, Ll/ۛۙ۫;-><init>(Landroid/widget/TextView;Ll/֫ۖۤ;Ll/۠ۖۧ;)V

    invoke-interface {v3, v0}, Ll/ۚۖۤ;->ۙ(Ljava/lang/Runnable;)V

    .line 219
    new-instance v4, Ll/۫ۖۤ;

    invoke-direct {v4, v1}, Ll/۫ۖۤ;-><init>(Landroid/view/View;)V

    .line 221
    invoke-virtual {v2}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/֨ܿ᩻;

    const/4 v8, 0x3

    invoke-direct {v1, v8, v5}, Ll/֨ܿ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    invoke-virtual {v2}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v8, Ll/ܺۙ۫;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Ll/ܺۙ۫;-><init>(Ll/۠ۖۧ;Ll/֫ۖۤ;Ll/۫ۖۤ;Ll/ܽ֡֫;Ll/ᩳۙ۫;Landroid/widget/TextView;)V

    invoke-virtual {v0, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 195
    :cond_2
    :goto_0
    invoke-interface {v6}, Ll/ᩳۙ۫;->ۙ()V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
