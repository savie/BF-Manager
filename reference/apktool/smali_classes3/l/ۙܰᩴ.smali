.class public final Ll/ۙܰᩴ;
.super Ll/۫۟᩷;
.source "313O"


# instance fields
.field public ۙ:Ljava/util/List;

.field public final ۤ:Ll/֫ܰᩴ;

.field public ᩷:Ljava/util/List;

.field public final synthetic ᩸:Ll/᩻ܰᩴ;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;Ll/֫ܰᩴ;)V
    .locals 0

    .line 681
    iput-object p1, p0, Ll/ۙܰᩴ;->᩸:Ll/᩻ܰᩴ;

    invoke-direct {p0}, Ll/۫۟᩷;-><init>()V

    .line 678
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۙܰᩴ;->ۙ:Ljava/util/List;

    .line 679
    iput-object p1, p0, Ll/ۙܰᩴ;->᩷:Ljava/util/List;

    .line 682
    iput-object p2, p0, Ll/ۙܰᩴ;->ۤ:Ll/֫ܰᩴ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۙܰᩴ;Ljava/util/ArrayList;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۙܰᩴ;->ۙ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 728
    iget-object v0, p0, Ll/ۙܰᩴ;->᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۧᩳ᩷;I)V
    .locals 2

    .line 676
    check-cast p1, Ll/ۧܰᩴ;

    .line 712
    iget-object v0, p0, Ll/ۙܰᩴ;->᩷:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩷ܰᩴ;

    .line 713
    iput-object p2, p1, Ll/ۧܰᩴ;->ܰ:Ll/᩷ܰᩴ;

    .line 714
    iget-object v0, p1, Ll/ۧܰᩴ;->۟:Landroid/widget/TextView;

    iget-object v1, p2, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 715
    iget-object p1, p1, Ll/ۧܰᩴ;->᩶:Landroid/widget/ImageView;

    .line 756
    iget-object v0, p2, Ll/᩷ܰᩴ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 757
    invoke-static {p1}, Ll/ᩴܰᩴ;->ۙ(Landroid/widget/ImageView;)V

    .line 758
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 760
    :cond_0
    iget-object p2, p2, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    iget-object v0, p0, Ll/ۙܰᩴ;->᩸:Ll/᩻ܰᩴ;

    invoke-static {p2, p1, v0}, Ll/ᩴܰᩴ;->ۙ(Ll/ܽۘᩴ;Landroid/widget/ImageView;Ll/᩻ܰᩴ;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۧᩳ᩷;
    .locals 3

    .line 706
    iget-object p2, p0, Ll/ۙܰᩴ;->᩸:Ll/᩻ܰᩴ;

    invoke-static {p2}, Ll/᩻ܰᩴ;->۫(Ll/᩻ܰᩴ;)Ll/ܽ֡֫;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d00f1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 707
    new-instance v0, Ll/ۧܰᩴ;

    iget-object v1, p0, Ll/ۙܰᩴ;->ۤ:Ll/֫ܰᩴ;

    invoke-direct {v0, p2, p1, v1}, Ll/ۧܰᩴ;-><init>(Ll/᩻ܰᩴ;Landroid/view/View;Ll/֫ܰᩴ;)V

    return-object v0
.end method

.method public final onViewRecycled(Ll/ۧᩳ᩷;)V
    .locals 2

    .line 676
    check-cast p1, Ll/ۧܰᩴ;

    .line 720
    iget-object v0, p1, Ll/ۧܰᩴ;->᩶:Landroid/widget/ImageView;

    invoke-static {v0}, Ll/ᩴܰᩴ;->ۙ(Landroid/widget/ImageView;)V

    .line 721
    iget-object v0, p1, Ll/ۧܰᩴ;->᩶:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 722
    iput-object v1, p1, Ll/ۧܰᩴ;->ܰ:Ll/᩷ܰᩴ;

    .line 723
    invoke-super {p0, p1}, Ll/۫۟᩷;->onViewRecycled(Ll/ۧᩳ᩷;)V

    return-void
.end method

.method public final ۙ()V
    .locals 6

    .line 687
    iget-object v0, p0, Ll/ۙܰᩴ;->᩸:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->᩻(Ll/᩻ܰᩴ;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 688
    iget-object v0, p0, Ll/ۙܰᩴ;->ۙ:Ljava/util/List;

    iput-object v0, p0, Ll/ۙܰᩴ;->᩷:Ljava/util/List;

    goto :goto_1

    .line 690
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 691
    iget-object v2, p0, Ll/ۙܰᩴ;->ۙ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ܰᩴ;

    .line 692
    iget-object v4, v3, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    invoke-static {v0}, Ll/᩻ܰᩴ;->᩻(Ll/᩻ܰᩴ;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v3, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    if-eqz v4, :cond_1

    .line 693
    invoke-virtual {v4}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ll/᩻ܰᩴ;->᩻(Ll/᩻ܰᩴ;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Ll/᩺ۨۨ;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 694
    :cond_2
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 697
    :cond_3
    iput-object v1, p0, Ll/ۙܰᩴ;->᩷:Ljava/util/List;

    .line 699
    :goto_1
    invoke-virtual {p0}, Ll/۫۟᩷;->notifyDataSetChanged()V

    .line 700
    iget-object v0, p0, Ll/ۙܰᩴ;->ۤ:Ll/֫ܰᩴ;

    invoke-virtual {v0}, Ll/֫ܰᩴ;->᩷()V

    return-void
.end method
