.class public abstract Ll/᩸ۡᩴ;
.super Ljava/lang/Object;
.source "A5PU"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ֡:Landroid/widget/TextView;

.field public final ܰ:Ll/۠ۖۧ;

.field public final ܿ:Landroid/widget/TextView;

.field public final ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;I)V
    .locals 3

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d00df

    .line 28
    invoke-virtual {p1, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0681

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/᩸ۡᩴ;->֡:Landroid/widget/TextView;

    const v1, 0x7f0a03d9

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/᩸ۡᩴ;->ܿ:Landroid/widget/TextView;

    const v1, 0x7f0a0186

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/᩹ۖ᩸;

    iput-object v1, p0, Ll/᩸ۡᩴ;->᩶:Ll/᩹ۖ᩸;

    .line 32
    sget v1, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v1, Ll/ۖۖۧ;

    invoke-direct {v1, p1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-virtual {v1, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 34
    invoke-virtual {v1, p1}, Ll/ۖۖۧ;->ۙ(Z)V

    const p1, 0x7f1208c9

    const/4 v0, 0x0

    .line 35
    invoke-virtual {v1, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p1, Ll/᩷ۡᩴ;

    invoke-direct {p1, p0}, Ll/᩷ۡᩴ;-><init>(Ll/᩸ۡᩴ;)V

    const v2, 0x7f120161

    .line 36
    invoke-virtual {v1, v2, p1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    .line 38
    invoke-virtual {v1, p2, v0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 39
    :cond_0
    invoke-virtual {v1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ۡᩴ;->ܰ:Ll/۠ۖۧ;

    .line 40
    new-instance p2, Ll/ۤۡᩴ;

    invoke-direct {p2, p0}, Ll/ۤۡᩴ;-><init>(Ll/᩸ۡᩴ;)V

    invoke-virtual {p1, p2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 41
    invoke-static {p1}, Ll/᩶ۢᩴ;->ۙ(Ll/۠ۖۧ;)V

    .line 42
    invoke-static {p1}, Ll/ۚۙܺ;->᩷(Ll/۠ۖۧ;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 122
    invoke-virtual {p0}, Ll/᩸ۡᩴ;->ᩴ()V

    return-void
.end method

.method public final ۙ()V
    .locals 1

    .line 46
    iget-object v0, p0, Ll/᩸ۡᩴ;->ܰ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 2

    .line 95
    iget-object v0, p0, Ll/᩸ۡᩴ;->ܿ:Landroid/widget/TextView;

    if-nez p1, :cond_0

    const/16 p1, 0x8

    .line 96
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 98
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 99
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۚ()V
    .locals 2

    .line 54
    iget-object v0, p0, Ll/᩸ۡᩴ;->ܰ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    .line 55
    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 58
    new-instance v1, Ll/ۙۡᩴ;

    invoke-direct {v1, p0}, Ll/ۙۡᩴ;-><init>(Ll/᩸ۡᩴ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    :cond_0
    iget-object v0, p0, Ll/᩸ۡᩴ;->᩶:Ll/᩹ۖ᩸;

    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void
.end method

.method public ۤ()V
    .locals 0

    return-void
.end method

.method public final ۫()V
    .locals 2

    const v0, 0x7f12030a

    .line 105
    iget-object v1, p0, Ll/᩸ۡᩴ;->֡:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 90
    iget-object v0, p0, Ll/᩸ۡᩴ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩹ۖ᩸;->֡᩸()V

    return-void
.end method

.method public abstract ᩴ()V
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Ll/᩸ۡᩴ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩸ۡᩴ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public ᩸()V
    .locals 0

    return-void
.end method
