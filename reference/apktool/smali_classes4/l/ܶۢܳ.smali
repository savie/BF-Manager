.class public final Ll/ܶۢܳ;
.super Ljava/lang/Object;
.source "D1Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ֡:Ll/۠ۨܳ;

.field public ܰ:Ll/۠ۖۧ;

.field public ܿ:Ll/֫ۖ᩸;

.field public ᩶:Ll/᩹ۖ᩸;


# direct methods
.method public constructor <init>(Ll/۠ۨܳ;)V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Ll/ܶۢܳ;->֡:Ll/۠ۨܳ;

    .line 27
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a0

    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0681

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120207

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a0186

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/᩹ۖ᩸;

    iput-object v1, p0, Ll/ܶۢܳ;->᩶:Ll/᩹ۖ᩸;

    const v2, 0x7f0a02ba

    .line 30
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/֫ۖ᩸;

    iput-object v2, p0, Ll/ܶۢܳ;->ܿ:Ll/֫ۖ᩸;

    .line 31
    new-instance v2, Ll/ܽۢܳ;

    invoke-direct {v2, p0}, Ll/ܽۢܳ;-><init>(Ll/ܶۢܳ;)V

    invoke-virtual {v1, v2}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 47
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f1203fd

    const/4 v1, 0x0

    .line 48
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120395

    .line 49
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120161

    .line 50
    invoke-virtual {p1, v0, v1}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 52
    invoke-virtual {p1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ܶۢܳ;->ܰ:Ll/۠ۖۧ;

    .line 53
    invoke-static {p1}, Ll/᩶ۢᩴ;->ۙ(Ll/۠ۖۧ;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ܶۢܳ;)Ll/֫ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶۢܳ;->ܿ:Ll/֫ۖ᩸;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 73
    iget-object v0, p0, Ll/ܶۢܳ;->᩶:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const-string v1, "/"

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v3, 0x1020019

    if-ne p1, v3, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    const-string v3, "\\"

    .line 78
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    .line 82
    :cond_2
    iget-object v1, p0, Ll/ܶۢܳ;->֡:Ll/۠ۨܳ;

    if-nez v2, :cond_8

    .line 83
    invoke-virtual {v1}, Ll/۠ۨܳ;->ܺ()Ll/ۜ᩵ܳ;

    move-result-object v2

    .line 273
    invoke-virtual {v2}, Ll/ۜ᩵ܳ;->ܿ()Ll/۟ۘܳ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۟ۘܳ;->ۤ()Z

    move-result v2

    .line 84
    invoke-virtual {v1}, Ll/۠ۨܳ;->ۧ()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۖۗܳ;

    .line 85
    invoke-interface {v4}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v5

    if-eqz v2, :cond_4

    .line 19
    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    goto :goto_1

    .line 21
    :cond_4
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    :goto_1
    if-eqz v5, :cond_3

    .line 86
    invoke-interface {v4}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz p1, :cond_5

    const p1, 0x7f1203fe

    .line 88
    invoke-virtual {p0, p1}, Ll/ܶۢܳ;->ۙ(I)V

    return-void

    :cond_5
    const p1, 0x7f120a81

    .line 90
    invoke-virtual {p0, p1}, Ll/ܶۢܳ;->ۙ(I)V

    return-void

    :cond_6
    if-eqz p1, :cond_7

    const p1, 0x7f120a80

    .line 94
    invoke-virtual {p0, p1}, Ll/ܶۢܳ;->ۙ(I)V

    return-void

    :cond_7
    const p1, 0x7f1203a3

    .line 96
    invoke-virtual {p0, p1}, Ll/ܶۢܳ;->ۙ(I)V

    return-void

    .line 104
    :cond_8
    :try_start_0
    invoke-virtual {v1}, Ll/۠ۨܳ;->ܺ()Ll/ۜ᩵ܳ;

    move-result-object v2

    invoke-virtual {v2, v1, v0, p1}, Ll/ۜ᩵ܳ;->ۙ(Ll/۠ۨܳ;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ll/ۙۧܺ; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    iget-object p1, p0, Ll/ܶۢܳ;->ܰ:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->dismiss()V

    return-void

    :catch_0
    move-exception p1

    .line 106
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 61
    iget-object v0, p0, Ll/ܶۢܳ;->ܿ:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    :cond_9
    :goto_2
    const p1, 0x7f1203b0

    .line 79
    invoke-virtual {p0, p1}, Ll/ܶۢܳ;->ۙ(I)V

    return-void
.end method

.method public final ۙ()V
    .locals 2

    .line 65
    iget-object v0, p0, Ll/ܶۢܳ;->ܰ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    .line 66
    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    invoke-virtual {v0}, Ll/۠ۖۧ;->ۤ()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 68
    iget-object v0, p0, Ll/ܶۢܳ;->᩶:Ll/᩹ۖ᩸;

    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void
.end method

.method public final ۙ(I)V
    .locals 1

    .line 57
    iget-object v0, p0, Ll/ܶۢܳ;->֡:Ll/۠ۨܳ;

    invoke-virtual {v0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iget-object v0, p0, Ll/ܶۢܳ;->ܿ:Ll/֫ۖ᩸;

    invoke-virtual {v0, p1}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method
