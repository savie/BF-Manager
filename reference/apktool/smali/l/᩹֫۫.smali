.class public final Ll/᩹֫۫;
.super Ll/᩺֨ܳ;
.source "B29A"


# instance fields
.field public ۖ:Z

.field public final synthetic ۙۙ:Ljava/util/ArrayList;

.field public ۜ:Ljava/util/Map;

.field public ۠:Z

.field public final synthetic ۤۙ:Ll/۫ۛܳ;

.field public final synthetic ۬:Ll/᩵֫۫;

.field public final synthetic ᩷ۙ:Lbin/mt/plus/Main;


# direct methods
.method public constructor <init>(Ll/᩵֫۫;Lbin/mt/plus/Main;Ljava/util/ArrayList;ZZLl/۫ۛܳ;Ljava/util/ArrayList;Lbin/mt/plus/Main;)V
    .locals 0

    .line 371
    iput-object p1, p0, Ll/᩹֫۫;->۬:Ll/᩵֫۫;

    iput-object p6, p0, Ll/᩹֫۫;->ۤۙ:Ll/۫ۛܳ;

    iput-object p7, p0, Ll/᩹֫۫;->ۙۙ:Ljava/util/ArrayList;

    iput-object p8, p0, Ll/᩹֫۫;->᩷ۙ:Lbin/mt/plus/Main;

    invoke-direct {p0, p2, p3, p4, p5}, Ll/᩺֨ܳ;-><init>(Ll/ܽ֡֫;Ljava/util/ArrayList;ZZ)V

    const/4 p1, 0x0

    .line 372
    iput-boolean p1, p0, Ll/᩹֫۫;->ۖ:Z

    .line 373
    iput-boolean p1, p0, Ll/᩹֫۫;->۠:Z

    .line 374
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/᩹֫۫;->ۜ:Ljava/util/Map;

    return-void
.end method

.method private ۙ(Ljava/lang/String;)V
    .locals 10

    .line 450
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ᩴ()Ljava/lang/String;

    move-result-object v2

    .line 451
    invoke-virtual {p0}, Ll/᩺֨ܳ;->᩸()Ljava/lang/String;

    move-result-object v3

    .line 452
    iget-object v6, p0, Ll/᩹֫۫;->ۤۙ:Ll/۫ۛܳ;

    invoke-virtual {v6}, Ll/۫ۛܳ;->۫()Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    new-array v1, v7, [Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    const/4 v1, 0x1

    .line 413
    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->᩷(Z)Ljava/util/List;

    move-result-object v1

    .line 454
    new-instance v8, Ll/ۗ᩸۫;

    invoke-static {v0, v1}, Ll/ܰۨᩴ;->ۙ(Ll/᩷ۨᩴ;Ljava/util/List;)Z

    move-result v0

    iget-object v4, p0, Ll/᩹֫۫;->ۙۙ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v8, v5, v0}, Ll/ۗ᩸۫;-><init>(IZ)V

    .line 455
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ۨᩴ;

    .line 456
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ll/ۗ᩸۫;->ۙ(Ljava/lang/String;)V

    goto :goto_0

    .line 458
    :cond_0
    invoke-virtual {p0}, Ll/᩺֨ܳ;->۫()Z

    move-result v5

    iget-object v9, p0, Ll/᩹֫۫;->ۜ:Ljava/util/Map;

    move-object v0, v4

    move-object v1, p1

    move v4, v5

    move-object v5, v9

    invoke-static/range {v0 .. v5}, Ll/ۚ᩸۫;->ۙ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Ljava/util/ArrayList;

    move-result-object v0

    .line 459
    invoke-static {v0}, Ll/ۚ᩸۫;->ۙ(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v1

    .line 460
    invoke-static {v8, v1}, Ll/ۚ᩸۫;->ۙ(Ll/ۗ᩸۫;Ljava/util/ArrayList;)V

    .line 461
    new-instance v2, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 463
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫᩸۫;

    .line 464
    invoke-virtual {v3}, Ll/۫᩸۫;->᩸()Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x1

    const/4 v7, 0x1

    .line 467
    :cond_1
    invoke-virtual {v3}, Ll/۫᩸۫;->ۙ()Landroid/text/Spanned;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const v0, 0x7f0d00cd

    .line 469
    iget-object v3, p0, Ll/᩹֫۫;->᩷ۙ:Lbin/mt/plus/Main;

    invoke-virtual {v3, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v4, 0x7f0a0681

    .line 470
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v8, 0x7f12095b

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(I)V

    const v5, 0x7f0a0301

    .line 471
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ListView;

    .line 472
    invoke-static {v5}, Ll/ܿ᩷ܺ;->ۙ(Landroid/widget/ListView;)V

    .line 473
    new-instance v8, Ll/ᩳܰ᩻;

    const v9, 0x7f0d01cc

    .line 200
    invoke-direct {v8, v9, v3, v2}, Ll/ᩳܰ᩻;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    .line 473
    invoke-virtual {v5, v8}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 474
    invoke-virtual {v3}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const-string v5, "{P}{S}"

    .line 475
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const v5, 0x7f12018c

    const/4 v8, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ll/᩺֨ܳ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 476
    invoke-virtual {v3, v5, v8}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_2

    :cond_3
    if-eqz v7, :cond_4

    .line 478
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ۧ()V

    .line 479
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const v0, 0x7f12095c

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 480
    invoke-virtual {v3, v5, v8}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_2

    .line 482
    :cond_4
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ۧ()V

    .line 483
    new-instance p1, Ll/ܽ֫۫;

    invoke-direct {p1, p0, v6, v1}, Ll/ܽ֫۫;-><init>(Ll/᩹֫۫;Ll/۫ۛܳ;Ljava/util/ArrayList;)V

    const v0, 0x7f1207b6

    invoke-virtual {v3, v0, p1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120161

    .line 487
    invoke-virtual {v3, p1, v8}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    :goto_2
    const p1, 0x7f12077f

    .line 489
    invoke-virtual {v3, p1, v8}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 490
    invoke-virtual {v3}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/۟ۨ᩸;

    const/4 v1, 0x5

    invoke-direct {v0, v1, v2}, Ll/۟ۨ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩹֫۫;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩹֫۫;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩹֫۫;Ll/۫ۛܳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 484
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ۙ()V

    .line 485
    invoke-virtual {p0}, Ll/᩺֨ܳ;->֫()V

    .line 486
    iget-object p0, p0, Ll/᩹֫۫;->۬:Ll/᩵֫۫;

    invoke-static {p0, p1, p2}, Ll/᩵֫۫;->ۙ(Ll/᩵֫۫;Ll/۫ۛܳ;Ljava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method public final ۚ()V
    .locals 4

    .line 378
    invoke-virtual {p0}, Ll/᩺֨ܳ;->ܳ()Ljava/lang/String;

    move-result-object v0

    .line 381
    iget-boolean v1, p0, Ll/᩹֫۫;->ۖ:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 382
    invoke-static {v0}, Ll/ܺۙܺ;->ۙ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 386
    :goto_0
    iget-boolean v3, p0, Ll/᩹֫۫;->۠:Z

    if-nez v3, :cond_1

    const-string v3, "{E}"

    .line 387
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v1, :cond_2

    if-nez v2, :cond_2

    .line 392
    invoke-direct {p0, v0}, Ll/᩹֫۫;->ۙ(Ljava/lang/String;)V

    return-void

    .line 397
    :cond_2
    new-instance v3, Ll/ܶ֫۫;

    invoke-direct {v3, p0, v1, v2, v0}, Ll/ܶ֫۫;-><init>(Ll/᩹֫۫;ZZLjava/lang/String;)V

    .line 446
    invoke-virtual {v3}, Ll/ۖۙܺ;->۫()V

    return-void
.end method
