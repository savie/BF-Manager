.class public final Ll/ܳܶܳ;
.super Landroid/widget/BaseAdapter;
.source "W6DR"


# instance fields
.field public final synthetic ܰ:Ll/֫ܶܳ;

.field public final synthetic ܿ:I

.field public final synthetic ᩶:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/֫ܶܳ;Ljava/util/ArrayList;I)V
    .locals 0

    .line 370
    iput-object p1, p0, Ll/ܳܶܳ;->ܰ:Ll/֫ܶܳ;

    iput-object p2, p0, Ll/ܳܶܳ;->᩶:Ljava/util/ArrayList;

    iput p3, p0, Ll/ܳܶܳ;->ܿ:I

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 371
    iget-object v0, p0, Ll/ܳܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 2

    .line 372
    iget-object v0, p0, Ll/ܳܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .line 375
    iget-object v0, p0, Ll/ܳܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 377
    iget-object p3, p0, Ll/ܳܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Ll/ܳܶܳ;->ܰ:Ll/֫ܶܳ;

    if-ne p1, v0, :cond_2

    if-eqz p2, :cond_0

    return-object p2

    .line 379
    :cond_0
    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 380
    invoke-static {v1}, Ll/֫ܶܳ;->֫(Ll/֫ܶܳ;)Ll/ܽܽܳ;

    move-result-object p2

    invoke-static {v1}, Ll/֫ܶܳ;->۫(Ll/֫ܶܳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f120562

    goto :goto_0

    :cond_1
    const v0, 0x7f120561

    .line 381
    :goto_0
    new-instance v2, Ll/ᩴܶܳ;

    iget v3, p0, Ll/ܳܶܳ;->ܿ:I

    invoke-direct {v2, p0, v3}, Ll/ᩴܶܳ;-><init>(Ll/ܳܶܳ;I)V

    .line 380
    invoke-virtual {p2, p1, v0, v2}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;ILjava/lang/Runnable;)Landroid/widget/TextView;

    .line 385
    invoke-static {v1}, Ll/֫ܶܳ;->֫(Ll/֫ܶܳ;)Ll/ܽܽܳ;

    move-result-object p2

    new-instance v0, Ll/۬ۧܽ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p3}, Ll/۬ۧܽ;-><init>(ILjava/lang/Object;)V

    const p3, 0x7f120424

    invoke-virtual {p2, p1, p3, v0}, Ll/ܽܽܳ;->ۙ(Landroid/widget/LinearLayout;ILjava/lang/Runnable;)Landroid/widget/TextView;

    return-object p1

    .line 389
    :cond_2
    instance-of v0, p2, Ll/ۚܶܳ;

    if-eqz v0, :cond_3

    check-cast p2, Ll/ۚܶܳ;

    goto :goto_1

    :cond_3
    new-instance p2, Ll/ۚܶܳ;

    invoke-direct {p2, v1}, Ll/ۚܶܳ;-><init>(Ll/֫ܶܳ;)V

    .line 390
    :goto_1
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p2, p1}, Ll/ۚܶܳ;->ۙ(Ljava/util/Map$Entry;)V

    return-object p2
.end method

.method public final getViewTypeCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
