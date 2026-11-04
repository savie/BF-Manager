.class public final synthetic Ll/ܿۤۚ;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܿۤۚ;->ܰ:I

    iput-object p2, p0, Ll/ܿۤۚ;->᩶:Ljava/lang/Object;

    iput-object p3, p0, Ll/ܿۤۚ;->ܿ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 2
    iget p1, p0, Ll/ܿۤۚ;->ܰ:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ܿۤۚ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۬ܰᩴ;

    .line 11
    iget-object v0, p0, Ll/ܿۤۚ;->ܿ:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/ۖܰᩴ;

    .line 16
    invoke-static {p1, v0}, Ll/۬ܰᩴ;->ۙ(Ll/۬ܰᩴ;Ll/ۖܰᩴ;)V

    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Ll/ܿۤۚ;->᩶:Ljava/lang/Object;

    .line 22
    move-object v4, p1

    check-cast v4, Ll/ܽ֡֫;

    .line 24
    iget-object p1, p0, Ll/ܿۤۚ;->ܿ:Ljava/lang/Object;

    .line 27
    move-object v5, p1

    check-cast v5, Ll/᩶ۤۚ;

    const p1, 0x7f0d007e

    .line 661
    invoke-virtual {v4, p1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0681

    .line 662
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f12007c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 664
    invoke-static {}, Ll/ۢۙۚ;->᩷()Ll/ۤ۠ۤ;

    move-result-object v0

    invoke-static {v4, p1, v0}, Ll/ܺۖۤ;->ۙ(Ll/ܽ֡֫;Landroid/view/View;Ll/ۤ۠ۤ;)Ll/ۚۖۤ;

    move-result-object v2

    .line 665
    invoke-virtual {v4}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    .line 666
    invoke-virtual {v0, p1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v1, 0x7f1208c9

    const/4 v3, 0x0

    .line 667
    invoke-virtual {v0, v1, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120161

    const v6, 0x7f1207f2

    .line 0
    invoke-static {v0, v1, v3, v6, v3}, Ll/۠᩹ᩴ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object v1

    const v0, 0x7f0a0573

    .line 671
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 672
    new-instance v0, Ll/ۖۤۚ;

    const/4 v3, 0x0

    invoke-direct {v0, v6, v2, v1, v3}, Ll/ۖۤۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v2, v0}, Ll/ۚۖۤ;->ۙ(Ljava/lang/Runnable;)V

    .line 676
    new-instance v3, Ll/۫ۖۤ;

    invoke-direct {v3, p1}, Ll/۫ۖۤ;-><init>(Landroid/view/View;)V

    .line 678
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۘ᩷ܳ;

    const/4 v7, 0x2

    invoke-direct {v0, v7, v4}, Ll/ۘ᩷ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 680
    invoke-virtual {v1}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    new-instance v7, Ll/۠ۤۚ;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/۠ۤۚ;-><init>(Ll/۠ۖۧ;Ll/ۚۖۤ;Ll/۫ۖۤ;Ll/ܽ֡֫;Ll/᩶ۤۚ;Landroid/widget/TextView;)V

    invoke-virtual {p1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
