.class public final Ll/᩹۟᩷;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ۙ:I

.field public ᩷:I


# virtual methods
.method public final ۙ(Ll/ۧᩳ᩷;)V
    .locals 1

    .line 14589
    iget-object p1, p1, Ll/ۧᩳ᩷;->itemView:Landroid/view/View;

    .line 14590
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, Ll/᩹۟᩷;->ۙ:I

    .line 14591
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Ll/᩹۟᩷;->᩷:I

    .line 14592
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 14593
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    return-void
.end method
