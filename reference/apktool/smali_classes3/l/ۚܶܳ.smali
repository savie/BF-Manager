.class public final Ll/ۚܶܳ;
.super Landroid/widget/LinearLayout;
.source "W6DR"


# instance fields
.field public ֡:Ljava/lang/String;

.field public final ܰ:Landroid/widget/TextView;

.field public ܿ:Z

.field public final ᩶:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/֫ܶܳ;)V
    .locals 6

    .line 403
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x10

    .line 404
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 405
    invoke-static {p1}, Ll/֫ܶܳ;->ۧ(Ll/֫ܶܳ;)I

    move-result v0

    invoke-static {p1}, Ll/֫ܶܳ;->ۧ(Ll/֫ܶܳ;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 406
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    .line 407
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 408
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v3, v2, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p0, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 409
    invoke-static {p1}, Ll/֫ܶܳ;->֫(Ll/֫ܶܳ;)Ll/ܽܽܳ;

    move-result-object v2

    const v3, -0x4e443b

    const/16 v4, 0xa

    const-string v5, ""

    invoke-virtual {v2, v4, v3, v5}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    iput-object v2, p0, Ll/ۚܶܳ;->᩶:Landroid/widget/TextView;

    .line 410
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 411
    invoke-static {p1}, Ll/֫ܶܳ;->֫(Ll/֫ܶܳ;)Ll/ܽܽܳ;

    move-result-object v2

    const v3, -0xe0b09

    invoke-virtual {v2, v4, v3, v5}, Ll/ܽܽܳ;->ۙ(IILjava/lang/String;)Landroid/widget/TextView;

    move-result-object v2

    iput-object v2, p0, Ll/ۚܶܳ;->ܰ:Landroid/widget/TextView;

    .line 412
    sget-object v3, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 413
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextIsSelectable(Z)V

    .line 414
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 415
    invoke-static {p1}, Ll/֫ܶܳ;->֫(Ll/֫ܶܳ;)Ll/ܽܽܳ;

    move-result-object p1

    new-instance v0, Ll/۫ܶܳ;

    invoke-direct {v0, p0}, Ll/۫ܶܳ;-><init>(Ll/ۚܶܳ;)V

    invoke-virtual {p1, p0, v0}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;Ll/۫ܶܳ;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۚܶܳ;)V
    .locals 0

    .line 416
    iget-object p0, p0, Ll/ۚܶܳ;->֡:Ljava/lang/String;

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 2

    .line 435
    iget-boolean v0, p0, Ll/ۚܶܳ;->ܿ:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 436
    iput-boolean v0, p0, Ll/ۚܶܳ;->ܿ:Z

    .line 438
    iget-object v0, p0, Ll/ۚܶܳ;->ܰ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextKeepState(Ljava/lang/CharSequence;)V

    .line 440
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    return-void
.end method

.method public final ۙ(Ljava/util/Map$Entry;)V
    .locals 4

    .line 420
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :goto_0
    iput-object v0, p0, Ll/ۚܶܳ;->֡:Ljava/lang/String;

    .line 421
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u2014"

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ll/ۚܶܳ;->֡:Ljava/lang/String;

    .line 423
    :goto_1
    iget-object v1, p0, Ll/ۚܶܳ;->᩶:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    iget-object v3, p0, Ll/ۚܶܳ;->ܰ:Landroid/widget/TextView;

    if-eqz v2, :cond_2

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-void

    .line 425
    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->clearFocus()V

    .line 426
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 427
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 428
    invoke-virtual {v3, p1, p1}, Landroid/view/View;->scrollTo(II)V

    const/4 p1, 0x1

    .line 429
    iput-boolean p1, p0, Ll/ۚܶܳ;->ܿ:Z

    .line 430
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method
