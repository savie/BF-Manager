.class public final synthetic Ll/ۘۚܳ;
.super Ljava/lang/Object;
.source "R6KO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ֡:Landroid/view/View;

.field public final synthetic ۟:Landroid/widget/Button;

.field public final synthetic ۢ:Landroid/content/res/ColorStateList;

.field public final synthetic ܰ:Landroid/view/View;

.field public final synthetic ܿ:Ll/۟֫ܳ;

.field public final synthetic ᩳ:Landroid/widget/TextView;

.field public final synthetic ᩶:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;Ll/۟֫ܳ;Landroid/view/View;Landroid/widget/Button;Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۚܳ;->ܰ:Landroid/view/View;

    iput-object p2, p0, Ll/ۘۚܳ;->᩶:Landroid/view/View;

    iput-object p3, p0, Ll/ۘۚܳ;->ܿ:Ll/۟֫ܳ;

    iput-object p4, p0, Ll/ۘۚܳ;->֡:Landroid/view/View;

    iput-object p5, p0, Ll/ۘۚܳ;->۟:Landroid/widget/Button;

    iput-object p6, p0, Ll/ۘۚܳ;->ᩳ:Landroid/widget/TextView;

    iput-object p7, p0, Ll/ۘۚܳ;->ۢ:Landroid/content/res/ColorStateList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 106
    iget-object p1, p0, Ll/ۘۚܳ;->ܰ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    .line 107
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 108
    iget-object p1, p0, Ll/ۘۚܳ;->ܿ:Ll/۟֫ܳ;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    iget-object v3, p0, Ll/ۘۚܳ;->᩶:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    if-nez v0, :cond_4

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    const/16 v1, 0x8

    .line 109
    :cond_4
    :goto_3
    iget-object p1, p0, Ll/ۘۚܳ;->֡:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    if-eqz v0, :cond_5

    .line 110
    iget-object p1, p0, Ll/ۘۚܳ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    goto :goto_4

    :cond_5
    iget-object p1, p0, Ll/ۘۚܳ;->ۢ:Landroid/content/res/ColorStateList;

    :goto_4
    iget-object v0, p0, Ll/ۘۚܳ;->۟:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method
