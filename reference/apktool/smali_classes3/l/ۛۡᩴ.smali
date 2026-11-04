.class public final synthetic Ll/ۛۡᩴ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۖۡᩴ;

.field public final synthetic ܿ:Ll/ܽ֡֫;

.field public final synthetic ᩶:Ll/֨ۡᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ۖۡᩴ;Ll/֨ۡᩴ;Ll/ܽ֡֫;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛۡᩴ;->ܰ:Ll/ۖۡᩴ;

    iput-object p2, p0, Ll/ۛۡᩴ;->᩶:Ll/֨ۡᩴ;

    iput-object p3, p0, Ll/ۛۡᩴ;->ܿ:Ll/ܽ֡֫;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .line 484
    iget-object v4, p0, Ll/ۛۡᩴ;->᩶:Ll/֨ۡᩴ;

    invoke-virtual {v4}, Ll/֨ۡᩴ;->ۙ()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 487
    :cond_0
    invoke-virtual {v4, p3}, Ll/֨ۡᩴ;->ۙ(I)Ll/ۘۢۧ;

    move-result-object v3

    const p1, 0x7f0d00e8

    .line 529
    iget-object v2, p0, Ll/ۛۡᩴ;->ܿ:Ll/ܽ֡֫;

    invoke-virtual {v2, p1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p1

    .line 543
    invoke-virtual {v3}, Ll/ۘۢۧ;->۫()Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x7f1209fe

    goto :goto_0

    :cond_1
    const p2, 0x7f1209ff

    :goto_0
    invoke-virtual {v2, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 546
    invoke-virtual {v3}, Ll/ۘۢۧ;->᩷()Ljava/lang/String;

    move-result-object p3

    .line 510
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_2

    const p3, 0x7f120a09

    .line 511
    invoke-virtual {v2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    :cond_2
    const p4, 0x7f0a0153

    .line 558
    invoke-virtual {p1, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f0a06a7

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 548
    invoke-virtual {v3}, Ll/ۘۢۧ;->ۤ()J

    move-result-wide p2

    const p4, 0x7f120a01

    const-wide/16 v0, 0x0

    cmp-long p5, p2, v0

    if-gtz p5, :cond_3

    .line 520
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 522
    :cond_3
    invoke-static {p2, p3}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p2

    :goto_1
    const p3, 0x7f0a0207

    .line 558
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 549
    invoke-virtual {v3}, Ll/ۘۢۧ;->᩸()J

    move-result-wide p2

    cmp-long p5, p2, v0

    if-gtz p5, :cond_4

    .line 520
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    .line 522
    :cond_4
    invoke-static {p2, p3}, Ll/᩸֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p2

    :goto_2
    const p3, 0x7f0a02e9

    .line 558
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 550
    invoke-virtual {v3}, Ll/ۘۢۧ;->ᩴ()Ljava/lang/String;

    move-result-object p2

    .line 565
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const p4, 0x7f120a02

    if-eqz p3, :cond_5

    .line 566
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_5
    const p3, 0x7f0a02ec

    .line 558
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 551
    invoke-virtual {v3}, Ll/ۘۢۧ;->ܳ()Ljava/lang/String;

    move-result-object p2

    .line 565
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 566
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_6
    const p3, 0x7f0a06bf

    .line 558
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 531
    sget p2, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance p2, Ll/ۖۖۧ;

    invoke-direct {p2, v2}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 532
    invoke-virtual {p2, p1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const p1, 0x7f1209f5

    const/4 p3, 0x0

    .line 533
    invoke-virtual {p2, p1, p3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12018c

    .line 534
    invoke-virtual {p2, p1, p3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 535
    invoke-virtual {p2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v5

    .line 536
    invoke-virtual {v5}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    new-instance p2, Ll/᩺ۡᩴ;

    iget-object v1, p0, Ll/ۛۡᩴ;->ܰ:Ll/ۖۡᩴ;

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Ll/᩺ۡᩴ;-><init>(Ll/ۖۡᩴ;Ll/ܽ֡֫;Ll/ۘۢۧ;Ll/֨ۡᩴ;Ll/۠ۖۧ;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
