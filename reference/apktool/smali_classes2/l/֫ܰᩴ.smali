.class public final Ll/֫ܰᩴ;
.super Ljava/lang/Object;
.source "313O"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۙ:Ll/ۙܰᩴ;

.field public final ۚ:I

.field public ۤ:Z

.field public final ۧ:Ll/۫ۘᩴ;

.field public final synthetic ۫:Ll/᩻ܰᩴ;

.field public final ܳ:Landroid/view/View;

.field public ᩴ:Z

.field public final ᩷:Landroid/widget/TextView;

.field public ᩸:Z

.field public final ᩻:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;Ljava/lang/String;I)V
    .locals 3

    .line 491
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ܰᩴ;->۫:Ll/᩻ܰᩴ;

    .line 492
    iput-object p2, p0, Ll/֫ܰᩴ;->֫:Ljava/lang/String;

    .line 493
    iput p3, p0, Ll/֫ܰᩴ;->ۚ:I

    .line 494
    invoke-static {p1}, Ll/᩻ܰᩴ;->ۗ(Ll/᩻ܰᩴ;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p1}, Ll/᩻ܰᩴ;->ۧ(Ll/᩻ܰᩴ;)Ll/᩵ۘᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩵ۘᩴ;->ۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0, p2}, Ll/۫ۘᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/۫ۘᩴ;

    move-result-object p2

    iput-object p2, p0, Ll/֫ܰᩴ;->ۧ:Ll/۫ۘᩴ;

    .line 495
    invoke-static {p1}, Ll/᩻ܰᩴ;->۫(Ll/᩻ܰᩴ;)Ll/ܽ֡֫;

    move-result-object p2

    const p3, 0x7f0d00f2

    invoke-virtual {p2, p3}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Ll/֫ܰᩴ;->᩻:Landroid/view/View;

    const p3, 0x7f0a0303

    .line 496
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Ll/᩻ᩳ᩷;

    .line 497
    new-instance v0, Ll/ᩴ֡᩷;

    invoke-static {p1}, Ll/᩻ܰᩴ;->۫(Ll/᩻ܰᩴ;)Ll/ܽ֡֫;

    move-result-object v1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ll/ᩴ֡᩷;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3, v0}, Ll/᩻ᩳ᩷;->setLayoutManager(Ll/᩶۟᩷;)V

    .line 498
    new-instance v0, Ll/ۙܰᩴ;

    invoke-direct {v0, p1, p0}, Ll/ۙܰᩴ;-><init>(Ll/᩻ܰᩴ;Ll/֫ܰᩴ;)V

    iput-object v0, p0, Ll/֫ܰᩴ;->ۙ:Ll/ۙܰᩴ;

    .line 499
    invoke-virtual {p3, v0}, Ll/᩻ᩳ᩷;->setAdapter(Ll/۫۟᩷;)V

    const p1, 0x7f0a04a4

    .line 500
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/֫ܰᩴ;->ܳ:Landroid/view/View;

    const p1, 0x7f0a019e

    .line 501
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/֫ܰᩴ;->᩷:Landroid/widget/TextView;

    .line 502
    new-instance p2, Ll/۫ܰᩴ;

    invoke-direct {p2, p0}, Ll/۫ܰᩴ;-><init>(Ll/֫ܰᩴ;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 505
    invoke-static {p3}, Ll/ܿ᩷ܺ;->ۙ(Ll/᩻ᩳ᩷;)V

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 509
    iget-boolean v0, p0, Ll/֫ܰᩴ;->᩸:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/֫ܰᩴ;->ᩴ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֫ܰᩴ;->۫:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->֫(Ll/᩻ܰᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 510
    iput-boolean v0, p0, Ll/֫ܰᩴ;->ᩴ:Z

    const/4 v0, 0x0

    .line 511
    iput-boolean v0, p0, Ll/֫ܰᩴ;->ۤ:Z

    .line 512
    invoke-virtual {p0}, Ll/֫ܰᩴ;->᩷()V

    .line 513
    new-instance v0, Ll/ۚܰᩴ;

    invoke-direct {v0, p0}, Ll/ۚܰᩴ;-><init>(Ll/֫ܰᩴ;)V

    .line 549
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 553
    iget-boolean v0, p0, Ll/֫ܰᩴ;->ᩴ:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    iget-object v2, p0, Ll/֫ܰᩴ;->ܳ:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 554
    iget-boolean v0, p0, Ll/֫ܰᩴ;->ۤ:Z

    if-eqz v0, :cond_1

    const v0, 0x7f120570

    goto :goto_1

    :cond_1
    const v0, 0x7f1208bc

    :goto_1
    iget-object v2, p0, Ll/֫ܰᩴ;->᩷:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 555
    iget-boolean v0, p0, Ll/֫ܰᩴ;->ۤ:Z

    invoke-virtual {v2, v0}, Landroid/view/View;->setClickable(Z)V

    .line 556
    iget-boolean v0, p0, Ll/֫ܰᩴ;->ᩴ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/֫ܰᩴ;->᩸:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Ll/֫ܰᩴ;->ۤ:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Ll/֫ܰᩴ;->ۙ:Ll/ۙܰᩴ;

    invoke-virtual {v0}, Ll/ۙܰᩴ;->getItemCount()I

    move-result v0

    if-nez v0, :cond_3

    const/4 v1, 0x0

    :cond_3
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
