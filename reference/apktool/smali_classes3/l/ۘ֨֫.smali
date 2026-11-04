.class public final Ll/ۘ֨֫;
.super Ll/۫۟᩷;
.source "6AY4"


# instance fields
.field public final synthetic ۙ:Ll/ۧۡ֫;


# direct methods
.method public constructor <init>(Ll/ۧۡ֫;)V
    .locals 0

    .line 1818
    iput-object p1, p0, Ll/ۘ֨֫;->ۙ:Ll/ۧۡ֫;

    invoke-direct {p0}, Ll/۫۟᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 1852
    iget-object v0, p0, Ll/ۘ֨֫;->ۙ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ܽ(Ll/ۧۡ֫;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۧᩳ᩷;I)V
    .locals 5

    .line 1818
    check-cast p1, Ll/ܰ֨֫;

    const-string v0, "holder"

    .line 0
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1825
    iget-object v0, p0, Ll/ۘ֨֫;->ۙ:Ll/ۧۡ֫;

    invoke-static {v0}, Ll/ۧۡ֫;->ܽ(Ll/ۧۡ֫;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۖۗܳ;

    const-string v1, "<set-?>"

    .line 0
    invoke-static {p2, v1}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1862
    iput-object p2, p1, Ll/ܰ֨֫;->᩶:Ll/ۖۗܳ;

    .line 1827
    invoke-virtual {p1}, Ll/ܰ֨֫;->ܳ()Landroid/widget/TextView;

    move-result-object v1

    invoke-interface {p2}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1828
    invoke-interface {p2}, Ll/ۖۗܳ;->ܰ᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1829
    invoke-virtual {p1}, Ll/ܰ֨֫;->ܳ()Landroid/widget/TextView;

    move-result-object v1

    sget v2, Ll/ۗۡ֫;->ᩴۙ:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 1831
    :cond_0
    invoke-virtual {p1}, Ll/ܰ֨֫;->ܳ()Landroid/widget/TextView;

    move-result-object v1

    sget-object v2, Ll/ۗۡ֫;->ۧۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 1833
    :goto_0
    invoke-interface {p2}, Ll/ۖۗܳ;->ۗۙ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1834
    invoke-virtual {p1}, Ll/ܰ֨֫;->᩸()Landroid/widget/TextView;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 1836
    :cond_1
    invoke-static {v0}, Ll/ۧۡ֫;->ۧ(Ll/ۧۡ֫;)I

    move-result v1

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    .line 1837
    :goto_1
    invoke-interface {p2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4, v1, v2}, Ll/᩸֫ܺ;->ۙ(JZZ)Ljava/lang/String;

    move-result-object v1

    .line 1838
    invoke-interface {p2}, Ll/ۖۗܳ;->ܰۙ()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1839
    invoke-interface {p2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "  "

    .line 0
    invoke-static {v1, v3, v2}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1841
    :cond_3
    invoke-virtual {p1}, Ll/ܰ֨֫;->᩸()Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1843
    :goto_2
    invoke-interface {p2}, Ll/ۖۗܳ;->getIcon()Ll/ۨ֡֫;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 1845
    invoke-virtual {p1}, Ll/ܰ֨֫;->ۤ()Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {p2}, Ll/ۨ֡֫;->᩷()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1847
    :cond_4
    invoke-static {v0}, Ll/ۧۡ֫;->᩶(Ll/ۧۡ֫;)Ll/۠֨֫;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/۠֨֫;->ۙ(Ll/ܰ֨֫;)V

    .line 1848
    invoke-static {v0, p1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;Ll/ܰ֨֫;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۧᩳ᩷;
    .locals 1

    const-string p2, "parent"

    .line 0
    invoke-static {p1, p2}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1821
    new-instance p2, Ll/ܰ֨֫;

    iget-object v0, p0, Ll/ۘ֨֫;->ۙ:Ll/ۧۡ֫;

    invoke-direct {p2, v0, p1}, Ll/ܰ֨֫;-><init>(Ll/ۧۡ֫;Landroid/view/ViewGroup;)V

    return-object p2
.end method
