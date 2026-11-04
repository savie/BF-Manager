.class public final Ll/ۢܰ᩸;
.super Ljava/lang/Object;
.source "N6J6"

# interfaces
.implements Ljava/lang/AutoCloseable;


# static fields
.field public static final ۬:[I


# instance fields
.field public final ֡:Landroid/view/MenuItem;

.field public ֨:Ll/֫ܶ᩸;

.field public ۖ:Z

.field public final ۜ:Ll/ܶ᩹;

.field public final ۟:Ll/ᩳܰ᩸;

.field public ۠:I

.field public final ۡ:Landroid/view/MenuItem;

.field public final ۢ:Ll/ۢۚ;

.field public ܰ:Z

.field public ܿ:Z

.field public final ᩳ:Ll/ܺۚ;

.field public final ᩶:Landroid/view/MenuItem;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const v0, 0x7f0a03ca

    const v1, 0x7f0a038d

    const v2, 0x7f0a0391

    const v3, 0x7f0a03cf

    .line 23
    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Ll/ۢܰ᩸;->۬:[I

    return-void
.end method

.method public constructor <init>(Ll/ܶ᩹;Landroid/view/Menu;)V
    .locals 3

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ll/ᩳܰ᩸;

    invoke-direct {v0, p0}, Ll/ᩳܰ᩸;-><init>(Ll/ۢܰ᩸;)V

    iput-object v0, p0, Ll/ۢܰ᩸;->۟:Ll/ᩳܰ᩸;

    .line 35
    iput-object p1, p0, Ll/ۢܰ᩸;->ۜ:Ll/ܶ᩹;

    .line 36
    move-object v1, p2

    check-cast v1, Ll/ۢۚ;

    iput-object v1, p0, Ll/ۢܰ᩸;->ۢ:Ll/ۢۚ;

    const v1, 0x7f0a039a

    .line 37
    invoke-interface {p2, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܰ᩸;->᩶:Landroid/view/MenuItem;

    const v1, 0x7f0a039b

    .line 38
    invoke-interface {p2, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iput-object v1, p0, Ll/ۢܰ᩸;->֡:Landroid/view/MenuItem;

    const v1, 0x7f0a03a7

    .line 39
    invoke-interface {p2, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p2

    iput-object p2, p0, Ll/ۢܰ᩸;->ۡ:Landroid/view/MenuItem;

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0002

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ܺۚ;

    iput-object p2, p0, Ll/ۢܰ᩸;->ᩳ:Ll/ܺۚ;

    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private ۙ(Landroid/view/MenuItem;)I
    .locals 2

    .line 109
    check-cast p1, Ll/۠ۚ;

    iget-object v0, p0, Ll/ۢܰ᩸;->ᩳ:Ll/ܺۚ;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ll/ܺۚ;->initialize(Ll/۠ۚ;I)V

    .line 110
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 111
    invoke-virtual {v0, p1, p1}, Landroid/view/View;->measure(II)V

    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-static {v0}, Ll/ۢܰ᩸;->ۙ(Landroid/view/View;)I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method public static ۙ(Landroid/view/View;)I
    .locals 1

    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    instance-of v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 117
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ۙ()V
    .locals 8

    .line 66
    iget-boolean v0, p0, Ll/ۢܰ᩸;->ܰ:Z

    if-eqz v0, :cond_0

    return-void

    .line 67
    :cond_0
    iget-object v0, p0, Ll/ۢܰ᩸;->ۜ:Ll/ܶ᩹;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    .line 68
    invoke-static {v0}, Ll/ۜ֡᩻;->᩷(Ll/ܶ᩹;)Landroid/widget/ImageButton;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 69
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_1

    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-static {v2}, Ll/ۢܰ᩸;->ۙ(Landroid/view/View;)I

    move-result v2

    add-int/2addr v3, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 71
    :goto_0
    invoke-virtual {v0}, Ll/ܶ᩹;->getCurrentContentInsetStart()I

    move-result v2

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr v1, v2

    .line 72
    invoke-static {v0}, Ll/ۜ֡᩻;->ۙ(Ll/ܶ᩹;)Ll/ܽۧ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 74
    invoke-static {v2}, Ll/ۢܰ᩸;->ۙ(Landroid/view/View;)I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    add-int/2addr v4, v3

    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    add-int/2addr v2, v4

    sub-int/2addr v1, v2

    :cond_2
    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 77
    :goto_1
    iget-object v4, p0, Ll/ۢܰ᩸;->ۢ:Ll/ۢۚ;

    invoke-virtual {v4}, Ll/ۢۚ;->size()I

    move-result v5

    iget-object v6, p0, Ll/ۢܰ᩸;->᩶:Landroid/view/MenuItem;

    iget-object v7, p0, Ll/ۢܰ᩸;->ۡ:Landroid/view/MenuItem;

    if-ge v2, v5, :cond_4

    .line 78
    invoke-virtual {v4, v2}, Ll/ۢۚ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    check-cast v4, Ll/۠ۚ;

    if-eq v4, v6, :cond_3

    if-eq v4, v7, :cond_3

    .line 79
    invoke-virtual {v4}, Ll/۠ۚ;->isVisible()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Ll/۠ۚ;->᩷()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 80
    invoke-direct {p0, v4}, Ll/ۢܰ᩸;->ۙ(Landroid/view/MenuItem;)I

    move-result v4

    add-int/2addr v3, v4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 84
    :cond_4
    invoke-virtual {v0}, Ll/ܶ᩹;->getCurrentContentInsetEnd()I

    move-result v0

    if-lt v1, v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    sub-int/2addr v1, v3

    .line 86
    invoke-direct {p0, v6}, Ll/ۢܰ᩸;->ۙ(Landroid/view/MenuItem;)I

    move-result v2

    .line 87
    iget-boolean v3, p0, Ll/ۢܰ᩸;->ܿ:Z

    if-eqz v3, :cond_6

    if-eqz v0, :cond_6

    if-lt v1, v2, :cond_6

    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_7

    sub-int/2addr v1, v2

    .line 89
    :cond_7
    iget v2, p0, Ll/ۢܰ᩸;->۠:I

    if-eqz v2, :cond_9

    if-eqz v0, :cond_9

    if-eqz v3, :cond_8

    if-eqz v5, :cond_9

    .line 90
    :cond_8
    invoke-direct {p0, v7}, Ll/ۢܰ᩸;->ۙ(Landroid/view/MenuItem;)I

    move-result v0

    if-lt v1, v0, :cond_9

    const/4 v0, 0x1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    .line 92
    :goto_4
    invoke-virtual {v4}, Ll/ۢۚ;->stopDispatchingItemsChanged()V

    .line 121
    :try_start_0
    invoke-interface {v6}, Landroid/view/MenuItem;->isVisible()Z

    move-result v1

    if-eq v1, v5, :cond_a

    invoke-interface {v6, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 95
    :cond_a
    iget-object v1, p0, Ll/ۢܰ᩸;->֡:Landroid/view/MenuItem;

    iget-boolean v2, p0, Ll/ۢܰ᩸;->ܿ:Z

    if-eqz v2, :cond_b

    if-nez v5, :cond_b

    const/4 v2, 0x1

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    .line 121
    :goto_5
    invoke-interface {v1}, Landroid/view/MenuItem;->isVisible()Z

    move-result v3

    if-eq v3, v2, :cond_c

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_c
    invoke-interface {v7}, Landroid/view/MenuItem;->isVisible()Z

    move-result v1

    if-eq v1, v0, :cond_d

    invoke-interface {v7, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 97
    :cond_d
    iget-boolean v1, p0, Ll/ۢܰ᩸;->ۖ:Z

    .line 125
    invoke-interface {v7}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v2

    if-eq v2, v1, :cond_e

    invoke-interface {v7, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 98
    :cond_e
    sget-object v1, Ll/ۢܰ᩸;->۬:[I

    const/4 v2, 0x0

    :goto_6
    const/4 v3, 0x4

    if-ge v2, v3, :cond_12

    aget v3, v1, v2

    .line 99
    invoke-virtual {v4, v3}, Ll/ۢۚ;->findItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 100
    iget v6, p0, Ll/ۢܰ᩸;->۠:I

    if-ne v3, v6, :cond_f

    if-nez v0, :cond_f

    const/4 v3, 0x1

    goto :goto_7

    :cond_f
    const/4 v3, 0x0

    .line 121
    :goto_7
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eq v6, v3, :cond_10

    invoke-interface {v5, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 101
    :cond_10
    iget-boolean v3, p0, Ll/ۢܰ᩸;->ۖ:Z

    .line 125
    invoke-interface {v5}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v6

    if-eq v6, v3, :cond_11

    invoke-interface {v5, v3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    .line 104
    :cond_12
    invoke-virtual {v4}, Ll/ۢۚ;->startDispatchingItemsChanged()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Ll/ۢۚ;->startDispatchingItemsChanged()V

    .line 105
    throw v0
.end method

.method public static synthetic ۙ(Ll/ۢܰ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۢܰ᩸;->ۙ()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 130
    iget-boolean v0, p0, Ll/ۢܰ᩸;->ܰ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 131
    iput-boolean v0, p0, Ll/ۢܰ᩸;->ܰ:Z

    .line 132
    iget-object v0, p0, Ll/ۢܰ᩸;->ۜ:Ll/ܶ᩹;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Ll/ۢܰ᩸;->۟:Ll/ᩳܰ᩸;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 133
    iget-object v0, p0, Ll/ۢܰ᩸;->֨:Ll/֫ܶ᩸;

    if-eqz v0, :cond_1

    .line 134
    invoke-virtual {v0}, Ll/֫ܶ᩸;->run()V

    const/4 v0, 0x0

    .line 135
    iput-object v0, p0, Ll/ۢܰ᩸;->֨:Ll/֫ܶ᩸;

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۙ(IZZ)V
    .locals 1

    .line 47
    iget-boolean v0, p0, Ll/ۢܰ᩸;->ܰ:Z

    if-eqz v0, :cond_0

    return-void

    .line 48
    :cond_0
    iput-boolean p2, p0, Ll/ۢܰ᩸;->ܿ:Z

    .line 49
    iput-boolean p3, p0, Ll/ۢܰ᩸;->ۖ:Z

    .line 50
    iget p2, p0, Ll/ۢܰ᩸;->۠:I

    if-eq p2, p1, :cond_4

    .line 51
    iput p1, p0, Ll/ۢܰ᩸;->۠:I

    if-eqz p1, :cond_4

    const p2, 0x7f0a0391

    if-eq p1, p2, :cond_3

    const p2, 0x7f0a03ca

    if-ne p1, p2, :cond_1

    goto :goto_0

    :cond_1
    const p2, 0x7f0a03cf

    if-ne p1, p2, :cond_2

    const p1, 0x7f0801e7

    goto :goto_1

    :cond_2
    const p1, 0x7f0801ce

    goto :goto_1

    :cond_3
    :goto_0
    const p1, 0x7f0801cf

    .line 53
    :goto_1
    iget-object p2, p0, Ll/ۢܰ᩸;->ۡ:Landroid/view/MenuItem;

    invoke-interface {p2, p1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 58
    :cond_4
    invoke-direct {p0}, Ll/ۢܰ᩸;->ۙ()V

    return-void
.end method

.method public final ۙ(Ll/֫ܶ᩸;)V
    .locals 0

    .line 62
    iput-object p1, p0, Ll/ۢܰ᩸;->֨:Ll/֫ܶ᩸;

    return-void
.end method
