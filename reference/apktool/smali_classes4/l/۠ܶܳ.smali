.class public final Ll/۠ܶܳ;
.super Ll/ۛܽ;
.source "CIS6"


# instance fields
.field public final ᩺ۙ:Ll/ۢۚ;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Ll/ۚܺ;Ljava/util/List;Ll/ܳ᩹ܳ;ILl/ۜܽܳ;)V
    .locals 8

    const/4 v0, 0x0

    const v1, 0x7f0403bf

    const/4 v2, 0x0

    .line 75
    invoke-direct {p0, p1, v0, v1, v2}, Ll/ܺܽ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 31
    new-instance v1, Ll/ۢۚ;

    invoke-direct {v1, p1}, Ll/ۢۚ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    .line 32
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v4, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    const-string v5, "#"

    const-string v6, " "

    .line 0
    invoke-static {v1, v5, v6}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 32
    iget-object v6, p4, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    .line 33
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩴ᩹ܳ;

    iget-object v6, v6, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    const-string v7, "class"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ll/֫ܶܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 32
    invoke-virtual {v4, v2, v1, v2, v5}, Ll/ۢۚ;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v4

    if-ne v1, p5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    .line 34
    :goto_1
    invoke-interface {v4, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    goto :goto_0

    .line 35
    :cond_1
    iget-object p3, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    invoke-virtual {p3, v2, v3, v3}, Ll/ۢۚ;->setGroupCheckable(IZZ)V

    .line 36
    new-instance p3, Ll/ܿۚ;

    const p4, 0x7f0d0013

    invoke-direct {p3, p1, p4}, Ll/ܿۚ;-><init>(Landroid/content/Context;I)V

    .line 37
    new-instance p5, Ll/ۡܶܳ;

    invoke-direct {p5, p0}, Ll/ۡܶܳ;-><init>(Ll/۠ܶܳ;)V

    invoke-virtual {p3, p5}, Ll/ܿۚ;->setCallback(Ll/۫֫;)V

    .line 41
    iget-object p5, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    invoke-virtual {p5, p3}, Ll/ۢۚ;->addMenuPresenter(Ll/ۚ֫;)V

    .line 42
    iget-object p3, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    new-instance p5, Ll/ۖܶܳ;

    invoke-direct {p5, p0, p6}, Ll/ۖܶܳ;-><init>(Ll/۠ܶܳ;Ll/ۜܽܳ;)V

    invoke-virtual {p3, p5}, Ll/ۢۚ;->setCallback(Ll/۟ۚ;)V

    .line 51
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p3

    .line 52
    new-instance p5, Ll/֡ۚ;

    iget-object p6, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    invoke-direct {p5, p6, p3, v2, p4}, Ll/֡ۚ;-><init>(Ll/ۢۚ;Landroid/view/LayoutInflater;ZI)V

    .line 54
    invoke-virtual {p0, p5}, Ll/ܺܽ;->ۙ(Landroid/widget/ListAdapter;)V

    .line 55
    invoke-virtual {p0, p2}, Ll/ܺܽ;->ۙ(Landroid/view/View;)V

    .line 56
    invoke-virtual {p0}, Ll/ܺܽ;->ܽ()V

    .line 57
    invoke-virtual {p0}, Ll/ܺܽ;->ܺ()V

    const p2, 0x7f0d0012

    .line 58
    invoke-virtual {p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const p3, 0x1020016

    .line 59
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const p4, 0x7f120563

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(I)V

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x41000000    # 8.0f

    mul-float p3, p3, p4

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    .line 61
    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    move-result p6

    add-int/2addr p6, p3

    .line 62
    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, p3

    .line 61
    invoke-virtual {p2, p4, p6, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 63
    invoke-virtual {p2, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 64
    new-instance p3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p4, -0x1

    const/4 p6, -0x2

    invoke-direct {p3, p4, p6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    invoke-virtual {p0, p2}, Ll/ܺܽ;->᩷(Landroid/view/View;)V

    .line 68
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p3, p3, 0x2

    .line 69
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const p6, 0x7f070017

    invoke-virtual {p4, p6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    .line 68
    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p3

    const/high16 p4, -0x80000000

    .line 70
    invoke-static {p3, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p4

    .line 71
    invoke-virtual {p2, p4, v2}, Landroid/view/View;->measure(II)V

    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 74
    new-instance p6, Landroid/widget/LinearLayout;

    invoke-direct {p6, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 75
    :goto_2
    invoke-virtual {p5}, Ll/֡ۚ;->getCount()I

    move-result v1

    if-ge p1, v1, :cond_2

    if-ge p2, p3, :cond_2

    .line 76
    invoke-virtual {p5, p1, v0, p6}, Ll/֡ۚ;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 77
    invoke-virtual {v0, p4, v2}, Landroid/view/View;->measure(II)V

    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    .line 80
    :cond_2
    invoke-virtual {p0, p2}, Ll/ܺܽ;->᩸(I)V

    .line 81
    new-instance p1, Ll/֨ܶܳ;

    invoke-direct {p1, p0}, Ll/֨ܶܳ;-><init>(Ll/۠ܶܳ;)V

    invoke-virtual {p0, p1}, Ll/ܺܽ;->ۙ(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/۠ܶܳ;Landroid/widget/AdapterView;I)V
    .locals 0

    .line 82
    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/MenuItem;

    .line 83
    iget-object p0, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ll/ۢۚ;->performIdentifierAction(II)Z

    return-void
.end method


# virtual methods
.method public final show()V
    .locals 3

    .line 91
    invoke-virtual {p0}, Ll/ܺܽ;->isShowing()Z

    move-result v0

    .line 92
    invoke-super {p0}, Ll/ܺܽ;->show()V

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 95
    :goto_0
    iget-object v1, p0, Ll/۠ܶܳ;->᩺ۙ:Ll/ۢۚ;

    invoke-virtual {v1}, Ll/ۢۚ;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 96
    invoke-virtual {v1, v0}, Ll/ۢۚ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 97
    invoke-virtual {p0, v0}, Ll/ܺܽ;->ܳ(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 102
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ll/ܺܽ;->᩸()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Ll/ۢܶܳ;

    invoke-direct {v1, p0}, Ll/ۢܶܳ;-><init>(Ll/۠ܶܳ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method
