.class public final synthetic Ll/᩷ᩴܳ;
.super Ljava/lang/Object;
.source "1599"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Landroid/view/View;

.field public final synthetic ܰ:I

.field public final synthetic ܿ:Ll/᩹ۖ᩸;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ll/᩹ۖ᩸;Landroid/view/View;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩷ᩴܳ;->ܰ:I

    iput-object p1, p0, Ll/᩷ᩴܳ;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩷ᩴܳ;->ܿ:Ll/᩹ۖ᩸;

    iput-object p3, p0, Ll/᩷ᩴܳ;->֡:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 2
    iget v0, p0, Ll/᩷ᩴܳ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/᩷ᩴܳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, [Landroid/widget/RadioButton;

    .line 11
    iget-object v1, p0, Ll/᩷ᩴܳ;->֡:Landroid/view/View;

    .line 13
    check-cast v1, Landroid/widget/TextView;

    .line 186
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/᩷ᩴܳ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ۨ᩷ܳ;

    iget-object v1, p0, Ll/᩷ᩴܳ;->֡:Landroid/view/View;

    check-cast v1, Ll/᩹ۖ᩸;

    .line 90
    new-instance v2, Ll/ܿܽ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    .line 68
    invoke-direct {v2, v3, p1, v4}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 91
    invoke-virtual {v2}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p1

    const v3, 0x104000d

    invoke-interface {p1, v4, v3, v4, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 92
    invoke-virtual {v2}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p1

    const v3, 0x7f1207bf

    invoke-interface {p1, v4, v3, v4, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 93
    invoke-virtual {v2}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p1

    const v3, 0x7f1207c0

    invoke-interface {p1, v4, v3, v4, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 94
    new-instance p1, Ll/᩸ᩴܳ;

    iget-object v3, p0, Ll/᩷ᩴܳ;->ܿ:Ll/᩹ۖ᩸;

    invoke-direct {p1, v3, v1, v0}, Ll/᩸ᩴܳ;-><init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/ۨ᩷ܳ;)V

    invoke-virtual {v2, p1}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 121
    invoke-virtual {v2}, Ll/ܿܽ;->ᩴ()V

    return-void

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_1

    .line 186
    aget-object v6, v0, v4

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    .line 187
    :goto_1
    invoke-virtual {v6, v5}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 189
    :cond_1
    aget-object v0, v0, v5

    if-ne p1, v0, :cond_2

    goto :goto_2

    :cond_2
    const/16 v3, 0x8

    :goto_2
    iget-object v0, p0, Ll/᩷ᩴܳ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 190
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
