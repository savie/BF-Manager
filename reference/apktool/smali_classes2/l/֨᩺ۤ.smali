.class public final Ll/֨᩺ۤ;
.super Ljava/lang/Object;
.source "097X"


# direct methods
.method public static ۙ(Ll/ۡۚ᩸;Ll/۠ۨܳ;)V
    .locals 12

    .line 321
    invoke-virtual {p1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a8

    .line 322
    invoke-virtual {v0, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0186

    .line 323
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/᩹ۖ᩸;

    const v3, 0x7f0a0187

    .line 324
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/᩹ۖ᩸;

    const v4, 0x7f0a0681

    .line 325
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f120774

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    const v4, 0x7f0a00e2

    .line 326
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Landroid/widget/CheckBox;

    const v4, 0x7f0a00e6

    .line 327
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Landroid/widget/CheckBox;

    const/4 v4, 0x0

    .line 328
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 329
    invoke-virtual {v8, v4}, Landroid/view/View;->setVisibility(I)V

    const v5, 0x7f120495

    .line 330
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setText(I)V

    const v5, 0x7f120491

    .line 331
    invoke-virtual {v8, v5}, Landroid/widget/TextView;->setText(I)V

    .line 332
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v6, "aciad"

    const/4 v9, 0x1

    invoke-interface {v5, v6, v9}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v7, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 333
    invoke-static {}, Ll/ܿۛ᩸;->۫ۙ()Z

    move-result v5

    invoke-virtual {v8, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 334
    invoke-virtual {v2, v9}, Ll/᩺ۜ᩸;->᩻(Z)V

    .line 335
    invoke-virtual {v3, v9}, Ll/᩺ۜ᩸;->᩻(Z)V

    .line 336
    iget-object v5, p0, Ll/ۡۚ᩸;->ᩴ:Ljava/lang/String;

    iget-object v6, p0, Ll/ۡۚ᩸;->ܳ:Ljava/lang/String;

    invoke-static {v5, v6, v2, v3}, Ll/ۖۚ᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    .line 337
    sget v5, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v11, Ll/ۖۖۧ;

    invoke-direct {v11, v0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 338
    invoke-virtual {v11, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    new-instance v0, Ll/֡᩺ۤ;

    const/4 v10, 0x0

    move-object v5, v0

    move-object v6, p0

    move-object v9, p1

    invoke-direct/range {v5 .. v10}, Ll/֡᩺ۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p1, 0x7f1208c9

    .line 339
    invoke-virtual {v11, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120161

    const/4 v0, 0x0

    .line 344
    invoke-virtual {v11, p1, v0}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120313

    .line 345
    invoke-virtual {v11, p1, v0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 346
    invoke-virtual {v11}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    .line 347
    invoke-virtual {p1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/۟᩺ۤ;

    invoke-direct {v0, p0, v2, v3, v4}, Ll/۟᩺ۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 348
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
