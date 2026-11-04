.class public final Ll/ܰ֨֫;
.super Ll/ۧᩳ᩷;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ֡:Landroid/widget/TextView;

.field public final ۟:Landroid/view/View;

.field public final synthetic ۢ:Ll/ۧۡ֫;

.field public final ܰ:Landroid/view/View;

.field public final ܿ:Landroid/widget/ImageView;

.field public final ᩳ:Landroid/widget/TextView;

.field public ᩶:Ll/ۖۗܳ;


# direct methods
.method public constructor <init>(Ll/ۧۡ֫;Landroid/view/ViewGroup;)V
    .locals 2

    .line 1857
    iput-object p1, p0, Ll/ܰ֨֫;->ۢ:Ll/ۧۡ֫;

    .line 1859
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d013a

    const/4 v1, 0x0

    .line 1860
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1857
    invoke-direct {p0, p1}, Ll/ۧᩳ᩷;-><init>(Landroid/view/View;)V

    .line 1863
    iget-object p1, p0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const p2, 0x7f0a0415

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ܰ֨֫;->۟:Landroid/view/View;

    .line 1864
    iget-object p1, p0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const v0, 0x7f0a0116

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ll/ܰ֨֫;->ܰ:Landroid/view/View;

    .line 1865
    iget-object p1, p0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const v0, 0x7f0a0296

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ܰ֨֫;->ܿ:Landroid/widget/ImageView;

    .line 1866
    iget-object p1, p0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const v0, 0x7f0a0418

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܰ֨֫;->ᩳ:Landroid/widget/TextView;

    .line 1867
    iget-object p1, p0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    const v0, 0x7f0a02ab

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܰ֨֫;->֡:Landroid/widget/TextView;

    .line 1870
    iget-object p1, p0, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 1874
    iget-object p1, p0, Ll/ܰ֨֫;->ۢ:Ll/ۧۡ֫;

    invoke-static {p1}, Ll/ۧۡ֫;->ۘ(Ll/ۧۡ֫;)Ll/ۗ֨᩷;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ll/ۗ֨᩷;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 1877
    :cond_0
    invoke-static {p1}, Ll/ۧۡ֫;->ܿ(Ll/ۧۡ֫;)Ll/ۜ᩻۫;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 1879
    :cond_1
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v2

    invoke-interface {v2}, Ll/ۖۗܳ;->ۗۙ()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1880
    invoke-static {p1}, Ll/ۧۡ֫;->ᩴ(Ll/ۧۡ֫;)V

    return-void

    .line 1883
    :cond_2
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v2

    invoke-interface {v2}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1884
    iget-object v1, v0, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    iget-object v1, v1, Ll/۠᩵ܳ;->ۙ:Ll/ܰۗ;

    const-string v2, "backPositionMap"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ll/ۧۡ֫;->᩶(Ll/ۧۡ֫;)Ll/۠֨֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/۠֨֫;->ۙ()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ll/ۡۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1885
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 0
    invoke-static {v0, v1}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1885
    invoke-static {p1, v0}, Ll/ۧۡ֫;->ۤ(Ll/ۧۡ֫;Ljava/lang/String;)V

    return-void

    .line 1889
    :cond_3
    invoke-static {p1}, Ll/ۧۡ֫;->ܰ(Ll/ۧۡ֫;)I

    move-result v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 1896
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v0

    .line 773
    invoke-interface {v0}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1897
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v1

    invoke-interface {v1}, Ll/ۖۗܳ;->isChecked()Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Ll/ۖۗܳ;->setChecked(Z)V

    .line 1898
    invoke-static {p1, p0}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;Ll/ܰ֨֫;)V

    .line 1899
    invoke-static {p1}, Ll/ۧۡ֫;->֡(Ll/ۧۡ֫;)V

    :cond_4
    :goto_0
    return-void

    .line 1917
    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1904
    :cond_6
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v0

    .line 1905
    invoke-static {p1}, Ll/ۧۡ֫;->᩻(Ll/ۧۡ֫;)Ll/᩹ۖ᩸;

    move-result-object v2

    const-string v3, "filenameEditText"

    if-eqz v2, :cond_a

    invoke-virtual {v2, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 1906
    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-static {v0}, Ll/֨ۖ᩵;->᩷(Ljava/lang/String;)I

    move-result v2

    const/4 v4, -0x1

    if-ne v2, v4, :cond_7

    .line 1908
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    .line 1910
    :cond_7
    invoke-static {p1}, Ll/ۧۡ֫;->᩻(Ll/ۧۡ֫;)Ll/᩹ۖ᩸;

    move-result-object v0

    if-eqz v0, :cond_9

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v2}, Ll/᩹ۖ᩸;->ۧ(II)V

    .line 1911
    invoke-static {p1}, Ll/ۧۡ֫;->᩻(Ll/ۧۡ֫;)Ll/᩹ۖ᩸;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۤ(Landroid/view/View;)V

    .line 1912
    invoke-virtual {p0}, Ll/ۧᩳ᩷;->getBindingAdapterPosition()I

    move-result v0

    invoke-static {p1, v0}, Ll/ۧۡ֫;->᩷(Ll/ۧۡ֫;I)V

    .line 1913
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 v2, 0x1f4

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-static {p1, v0, v1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;J)V

    return-void

    .line 1911
    :cond_8
    invoke-static {v3}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 1910
    :cond_9
    invoke-static {v3}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 1905
    :cond_a
    invoke-static {v3}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 1891
    :cond_b
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getPath(...)"

    invoke-static {v0, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v0, v1}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;)V

    .line 1892
    invoke-virtual {p0}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;Ljava/lang/String;)V

    return-void

    :cond_c
    const-string p1, "swipeRefreshLayout"

    .line 1874
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۙ()Landroid/view/View;
    .locals 1

    .line 1864
    iget-object v0, p0, Ll/ܰ֨֫;->ܰ:Landroid/view/View;

    return-object v0
.end method

.method public final ۤ()Landroid/widget/ImageView;
    .locals 1

    .line 1865
    iget-object v0, p0, Ll/ܰ֨֫;->ܿ:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final ܳ()Landroid/widget/TextView;
    .locals 1

    .line 1866
    iget-object v0, p0, Ll/ܰ֨֫;->ᩳ:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ᩴ()Landroid/view/View;
    .locals 1

    .line 1863
    iget-object v0, p0, Ll/ܰ֨֫;->۟:Landroid/view/View;

    return-object v0
.end method

.method public final ᩷()Ll/ۖۗܳ;
    .locals 1

    .line 1862
    iget-object v0, p0, Ll/ܰ֨֫;->᩶:Ll/ۖۗܳ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "fileItem"

    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩸()Landroid/widget/TextView;
    .locals 1

    .line 1867
    iget-object v0, p0, Ll/ܰ֨֫;->֡:Landroid/widget/TextView;

    return-object v0
.end method
