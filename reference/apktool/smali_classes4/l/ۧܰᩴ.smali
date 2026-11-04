.class public final Ll/ۧܰᩴ;
.super Ll/ۧᩳ᩷;
.source "313O"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ֡:Ll/᩻ܰᩴ;

.field public final ۟:Landroid/widget/TextView;

.field public ܰ:Ll/᩷ܰᩴ;

.field public final ܿ:Ll/֫ܰᩴ;

.field public final ᩶:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;Landroid/view/View;Ll/֫ܰᩴ;)V
    .locals 0

    .line 646
    iput-object p1, p0, Ll/ۧܰᩴ;->֡:Ll/᩻ܰᩴ;

    .line 647
    invoke-direct {p0, p2}, Ll/ۧᩳ᩷;-><init>(Landroid/view/View;)V

    .line 648
    iput-object p3, p0, Ll/ۧܰᩴ;->ܿ:Ll/֫ܰᩴ;

    const p1, 0x7f0a0634

    .line 649
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۧܰᩴ;->۟:Landroid/widget/TextView;

    const p1, 0x7f0a02a6

    .line 650
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۧܰᩴ;->᩶:Landroid/widget/ImageView;

    .line 651
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 652
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 657
    iget-object p1, p0, Ll/ۧܰᩴ;->֡:Ll/᩻ܰᩴ;

    invoke-static {p1}, Ll/᩻ܰᩴ;->᩹(Ll/᩻ܰᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۧܰᩴ;->ܰ:Ll/᩷ܰᩴ;

    iget-object v0, v0, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ۧܰᩴ;->ܿ:Ll/֫ܰᩴ;

    iget-object v1, v1, Ll/֫ܰᩴ;->ۧ:Ll/۫ۘᩴ;

    invoke-static {v1, v0}, Ll/ۚۘᩴ;->ۤ(Ll/۫ۘᩴ;Ll/ܺۛᩴ;)V

    .line 658
    :cond_0
    invoke-static {p1}, Ll/᩻ܰᩴ;->ܺ(Ll/᩻ܰᩴ;)Ll/ܳܰᩴ;

    move-result-object v0

    invoke-static {p1}, Ll/᩻ܰᩴ;->ۧ(Ll/᩻ܰᩴ;)Ll/᩵ۘᩴ;

    move-result-object v1

    iget-object v2, p0, Ll/ۧܰᩴ;->ܰ:Ll/᩷ܰᩴ;

    iget-object v3, v2, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    iget-object v2, v2, Ll/᩷ܰᩴ;->᩷:Ll/֨᩺ᩴ;

    invoke-interface {v0, v1, v3, v2}, Ll/ܳܰᩴ;->ۙ(Ll/᩵ۘᩴ;Ll/ܺۛᩴ;Ll/֨᩺ᩴ;)V

    .line 659
    invoke-static {p1}, Ll/᩻ܰᩴ;->ۚ(Ll/᩻ܰᩴ;)Ll/۠ۖۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 664
    iget-object v0, p0, Ll/ۧܰᩴ;->֡:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->ܺ(Ll/᩻ܰᩴ;)Ll/ܳܰᩴ;

    move-result-object v1

    invoke-static {v0}, Ll/᩻ܰᩴ;->ۧ(Ll/᩻ܰᩴ;)Ll/᩵ۘᩴ;

    move-result-object v0

    iget-object v2, p0, Ll/ۧܰᩴ;->ܰ:Ll/᩷ܰᩴ;

    iget-object v3, v2, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    iget-object v2, v2, Ll/᩷ܰᩴ;->᩷:Ll/֨᩺ᩴ;

    invoke-interface {v1, p1, v0, v3, v2}, Ll/ܳܰᩴ;->ۙ(Landroid/view/View;Ll/᩵ۘᩴ;Ll/ܺۛᩴ;Ll/֨᩺ᩴ;)V

    const/4 p1, 0x1

    return p1
.end method
