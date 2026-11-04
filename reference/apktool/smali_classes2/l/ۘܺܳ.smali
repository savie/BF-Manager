.class public final Ll/ۘܺܳ;
.super Landroid/widget/BaseAdapter;
.source "G6IL"


# instance fields
.field public final synthetic ܰ:Ll/᩶ܺܳ;


# direct methods
.method public constructor <init>(Ll/᩶ܺܳ;)V
    .locals 0

    .line 56
    iput-object p1, p0, Ll/ۘܺܳ;->ܰ:Ll/᩶ܺܳ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۘܺܳ;->ܰ:Ll/᩶ܺܳ;

    invoke-static {v0}, Ll/᩶ܺܳ;->֫(Ll/᩶ܺܳ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۘܺܳ;->ܰ:Ll/᩶ܺܳ;

    invoke-static {v0}, Ll/᩶ܺܳ;->֫(Ll/᩶ܺܳ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 74
    iget-object v0, p0, Ll/ۘܺܳ;->ܰ:Ll/᩶ܺܳ;

    if-nez p2, :cond_0

    .line 75
    invoke-static {v0}, Ll/᩶ܺܳ;->ۚ(Ll/᩶ܺܳ;)Ll/ܽ֡֫;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0163

    const/4 v2, 0x0

    .line 76
    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    const p3, 0x7f0a0681

    .line 78
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    const v1, 0x7f0a0582

    .line 79
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 80
    invoke-static {v0}, Ll/᩶ܺܳ;->֫(Ll/᩶ܺܳ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܿܽܳ;

    .line 81
    iget-object v0, p1, Ll/ܿܽܳ;->᩷:Ljava/lang/String;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    iget-object p1, p1, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
