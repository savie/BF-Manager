.class public final Ll/᩸ܽ۫;
.super Ll/ۢۗܳ;
.source "Y96B"


# virtual methods
.method public final ۤ(Ll/۫ۛܳ;)V
    .locals 10

    .line 58
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a3

    .line 59
    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0620

    .line 60
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll/֫ۖ᩸;

    const v2, 0x7f0a0622

    .line 61
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ll/֫ۖ᩸;

    .line 62
    invoke-static {v4}, Ll/۟۫ܺ;->ۙ(Ll/֫ۖ᩸;)V

    .line 63
    invoke-static {v5}, Ll/۟۫ܺ;->ۙ(Ll/֫ۖ᩸;)V

    .line 65
    new-instance v2, Ll/۠۬֫;

    invoke-direct {v2, v5}, Ll/۠۬֫;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Ll/֫ۖ᩸;->ۙ(Ll/۠۬֫;)V

    const v2, 0x7f0a00e1

    .line 67
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/widget/CheckBox;

    .line 68
    new-instance v7, Ll/ۙܽ۫;

    invoke-direct {v7}, Ll/ۙܽ۫;-><init>()V

    .line 69
    invoke-virtual {v7}, Ll/ۙܽ۫;->ۙ()V

    .line 70
    invoke-virtual {v0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x7f110000

    invoke-virtual {p1}, Ll/۫ۛܳ;->ܺ()I

    move-result v6

    invoke-virtual {v2, v3, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    iget-boolean v2, v7, Ll/ۙܽ۫;->᩷:Z

    invoke-virtual {v8, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 72
    iget-boolean v2, v7, Ll/ۙܽ۫;->ۤ:Z

    if-eqz v2, :cond_0

    .line 73
    invoke-virtual {v4}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v2

    invoke-static {v2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ll/᩹ۖ᩸;->᩺(Z)V

    const/16 v2, 0x8

    .line 74
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    :cond_0
    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v1, 0x7f1208c9

    const/4 v2, 0x0

    .line 77
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120161

    .line 78
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 79
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v6

    .line 80
    invoke-virtual {v4}, Ll/֫ۖ᩸;->ۙ()Ll/᩹ۖ᩸;

    move-result-object v0

    invoke-static {v0}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    .line 81
    invoke-virtual {v6}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/۬ܺ۫;

    move-object v3, v1

    move-object v9, p1

    invoke-direct/range {v3 .. v9}, Ll/۬ܺ۫;-><init>(Ll/֫ۖ᩸;Ll/֫ۖ᩸;Ll/۠ۖۧ;Ll/ۙܽ۫;Landroid/widget/CheckBox;Ll/۫ۛܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ᩸(Ll/۫ۛܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 47
    invoke-virtual {p1, v0}, Ll/۫ۛܳ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p1}, Ll/۫ۛܳ;->᩹()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    .line 53
    :cond_1
    invoke-virtual {p1}, Ll/۫ۛܳ;->ۨ()Z

    move-result p1

    return p1
.end method
