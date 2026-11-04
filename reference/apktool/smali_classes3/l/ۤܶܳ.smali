.class public final Ll/ۤܶܳ;
.super Landroid/widget/BaseAdapter;
.source "W6DR"


# instance fields
.field public final synthetic ܰ:Ll/֫ܶܳ;


# direct methods
.method public constructor <init>(Ll/֫ܶܳ;)V
    .locals 0

    .line 321
    iput-object p1, p0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 322
    iget-object v0, p0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {v0}, Ll/֫ܶܳ;->ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 323
    iget-object v0, p0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {v0}, Ll/֫ܶܳ;->ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    .line 324
    iget-object v0, p0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {v0}, Ll/֫ܶܳ;->ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 326
    iget-object p3, p0, Ll/ۤܶܳ;->ܰ:Ll/֫ܶܳ;

    invoke-static {p3}, Ll/֫ܶܳ;->ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;

    move-result-object v0

    iget-object v0, v0, Ll/᩹᩹ܳ;->۫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 327
    instance-of p1, p2, Ll/ܶ᩹ܳ;

    if-eqz p1, :cond_0

    .line 328
    check-cast p2, Ll/ܶ᩹ܳ;

    goto :goto_0

    :cond_0
    new-instance p2, Ll/ܶ᩹ܳ;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ܶ᩹ܳ;-><init>(Landroid/content/Context;)V

    .line 329
    :goto_0
    invoke-static {p3}, Ll/֫ܶܳ;->ۚ(Ll/֫ܶܳ;)Ll/ܳ᩹ܳ;

    move-result-object p1

    iget-object p1, p1, Ll/ܳ᩹ܳ;->ۙ:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴ᩹ܳ;

    iget-object p1, p1, Ll/ᩴ᩹ܳ;->ۙ:Ljava/util/Map;

    const-string v0, "text"

    .line 330
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 331
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    const-string v0, "hint-text"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_2
    if-eqz v0, :cond_3

    .line 332
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    const-string v0, "content-desc"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_4
    move-object v3, v0

    const-string v0, "class"

    .line 333
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ll/֫ܶܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3}, Ll/֫ܶܳ;->ᩴ(Ll/֫ܶܳ;)Ll/᩹᩹ܳ;

    move-result-object v4

    invoke-static {p3}, Ll/֫ܶܳ;->ܳ(Ll/֫ܶܳ;)Ll/᩶ܶܳ;

    move-result-object p1

    .line 334
    invoke-virtual {p1}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {p3}, Ll/֫ܶܳ;->ܳ(Ll/֫ܶܳ;)Ll/᩶ܶܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩶ܶܳ;->᩸()Ll/֨ܽܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֨ܽܳ;->᩸()I

    move-result p1

    if-ne p1, v1, :cond_5

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_1
    new-instance v6, Ll/ۙܶܳ;

    invoke-direct {v6, p0, v1}, Ll/ۙܶܳ;-><init>(Ll/ۤܶܳ;I)V

    new-instance v7, Ll/᩷ܶܳ;

    invoke-direct {v7, p0, v1}, Ll/᩷ܶܳ;-><init>(Ll/ۤܶܳ;I)V

    move-object v0, p2

    .line 333
    invoke-virtual/range {v0 .. v7}, Ll/ܶ᩹ܳ;->ۙ(ILjava/lang/String;Ljava/lang/String;Ll/᩹᩹ܳ;ZLl/ۙܶܳ;Ll/᩷ܶܳ;)V

    return-object p2
.end method
