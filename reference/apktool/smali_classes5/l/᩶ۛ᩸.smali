.class public final Ll/᩶ۛ᩸;
.super Ll/ۧᩳ᩷;
.source "75NJ"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ֡:Landroid/widget/TextView;

.field public ۟:Landroid/widget/TextView;

.field public final synthetic ۢ:Ll/ܿۛ᩸;

.field public ܰ:Landroid/view/View;

.field public ܿ:Landroid/widget/ImageView;

.field public ᩳ:Landroid/view/View;

.field public ᩶:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩸;Landroid/view/View;)V
    .locals 1

    .line 1402
    iput-object p1, p0, Ll/᩶ۛ᩸;->ۢ:Ll/ܿۛ᩸;

    .line 1403
    invoke-direct {p0, p2}, Ll/ۧᩳ᩷;-><init>(Landroid/view/View;)V

    .line 1404
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1405
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a0058

    .line 1406
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۛ᩸;->ܰ:Landroid/view/View;

    const v0, 0x7f0a048a

    .line 1407
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ۛ᩸;->ᩳ:Landroid/view/View;

    const v0, 0x7f0a0296

    .line 1408
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Ll/᩶ۛ᩸;->ܿ:Landroid/widget/ImageView;

    const v0, 0x7f0a0418

    .line 1409
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩶ۛ᩸;->۟:Landroid/widget/TextView;

    const v0, 0x7f0a03f4

    .line 1410
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩶ۛ᩸;->֡:Landroid/widget/TextView;

    const v0, 0x7f0a016c

    .line 1411
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/᩶ۛ᩸;->᩶:Landroid/widget/ImageView;

    .line 1412
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x1

    .line 1413
    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 1414
    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    const v0, 0x7f08020a

    .line 1415
    invoke-static {p1, v0}, Ll/۟֡;->ۤ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x77

    .line 1416
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 1417
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩶ۛ᩸;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۛ᩸;->ܰ:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/᩶ۛ᩸;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۛ᩸;->ܿ:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/᩶ۛ᩸;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۛ᩸;->۟:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/᩶ۛ᩸;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۛ᩸;->᩶:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ᩸(Ll/᩶ۛ᩸;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ۛ᩸;->֡:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1422
    iget-object p1, p0, Ll/᩶ۛ᩸;->ۢ:Ll/ܿۛ᩸;

    invoke-static {p1}, Ll/ܿۛ᩸;->ۧ(Ll/ܿۛ᩸;)Ll/۠᩶᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠᩶᩻;->᩷()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1423
    invoke-virtual {p0}, Ll/ۧᩳ᩷;->getBindingAdapterPosition()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 1427
    :cond_0
    invoke-static {p1, v0}, Ll/ܿۛ᩸;->᩷(Ll/ܿۛ᩸;I)V

    .line 1428
    invoke-virtual {p1}, Ll/ܿۛ᩸;->ۤۙ()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 7

    .line 1437
    iget-object p1, p0, Ll/᩶ۛ᩸;->ۢ:Ll/ܿۛ᩸;

    invoke-static {p1}, Ll/ܿۛ᩸;->ۧ(Ll/ܿۛ᩸;)Ll/۠᩶᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠᩶᩻;->᩷()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1440
    :cond_0
    invoke-virtual {p0}, Ll/ۧᩳ᩷;->getBindingAdapterPosition()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    :goto_0
    return v1

    .line 1444
    :cond_1
    invoke-static {p1}, Ll/ܿۛ᩸;->۫(Ll/ܿۛ᩸;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۟ܰ᩸;

    .line 1445
    new-instance v3, Ll/ܿܽ;

    const v4, 0x800003

    iget-object v5, p0, Ll/᩶ۛ᩸;->ᩳ:Landroid/view/View;

    invoke-direct {v3, p1, v5, v4}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 1446
    invoke-static {v5}, Ll/ۢ᩶᩻;->֫(Landroid/view/View;)V

    .line 1447
    invoke-virtual {v3}, Ll/ܿܽ;->᩸()V

    .line 1448
    invoke-virtual {v3}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object v4

    const v5, 0x7f12018c

    .line 1449
    invoke-interface {v4, v1, v5, v1, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    const v6, 0x7f0801f9

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1450
    invoke-static {p1, v4, v0}, Ll/ܿۛ᩸;->ۙ(Ll/ܿۛ᩸;Ll/ۢۚ;I)V

    const p1, 0x7f120882

    .line 1451
    invoke-interface {v4, v1, p1, v1, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v5, 0x7f08024a

    invoke-interface {p1, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1452
    invoke-virtual {v2}, Ll/ۜܽ᩸;->ۧ()Z

    move-result p1

    const v5, 0x7f120b9e

    if-eqz p1, :cond_2

    const p1, 0x7f120a34

    .line 1453
    invoke-interface {v4, v1, v5, v1, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v5, 0x7f08024d

    invoke-interface {p1, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    goto :goto_1

    .line 1455
    :cond_2
    invoke-interface {v4, v1, v5, v1, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v5, 0x7f080261

    invoke-interface {p1, v5}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    :goto_1
    const p1, 0x7f120b74

    .line 1457
    invoke-interface {v4, v1, p1, v1, p1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f08020a

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1458
    new-instance p1, Ll/ܰۛ᩸;

    invoke-direct {p1, p0, v2, v0}, Ll/ܰۛ᩸;-><init>(Ll/᩶ۛ᩸;Ll/۟ܰ᩸;I)V

    invoke-virtual {v3, p1}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 1481
    invoke-virtual {v3}, Ll/ܿܽ;->ᩴ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1490
    iget-object v0, p0, Ll/᩶ۛ᩸;->᩶:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 1491
    iget-object p1, p0, Ll/᩶ۛ᩸;->ۢ:Ll/ܿۛ᩸;

    invoke-static {p1}, Ll/ܿۛ᩸;->ۧ(Ll/ܿۛ᩸;)Ll/۠᩶᩻;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۠᩶᩻;->ۙ(Ll/ۧᩳ᩷;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
