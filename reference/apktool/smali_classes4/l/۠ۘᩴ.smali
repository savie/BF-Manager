.class public final Ll/۠ۘᩴ;
.super Ll/ۛ۠᩷;
.source "313O"


# instance fields
.field public final synthetic ۤ:Ll/᩻ܰᩴ;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;)V
    .locals 0

    .line 372
    iput-object p1, p0, Ll/۠ۘᩴ;->ۤ:Ll/᩻ܰᩴ;

    invoke-direct {p0}, Ll/ۛ۠᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(I)Ljava/lang/CharSequence;
    .locals 2

    .line 380
    iget-object v0, p0, Ll/۠ۘᩴ;->ۤ:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->۫(Ll/᩻ܰᩴ;)Ll/ܽ֡֫;

    move-result-object v1

    invoke-static {v0}, Ll/᩻ܰᩴ;->ܽ(Ll/᩻ܰᩴ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܰᩴ;

    iget p1, p1, Ll/֫ܰᩴ;->ۚ:I

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ܳۜ᩷;I)Ljava/lang/Object;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/۠ۘᩴ;->ۤ:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->ܽ(Ll/᩻ܰᩴ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֫ܰᩴ;

    iget-object p2, p2, Ll/֫ܰᩴ;->᩻:Landroid/view/View;

    .line 392
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p2
.end method

.method public final ۙ(Ll/ܳۜ᩷;ILjava/lang/Object;)V
    .locals 0

    .line 398
    check-cast p3, Landroid/view/View;

    invoke-virtual {p1, p3}, Ll/ܳۜ᩷;->removeView(Landroid/view/View;)V

    return-void
.end method

.method public final ۙ(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ᩷()I
    .locals 1

    .line 375
    iget-object v0, p0, Ll/۠ۘᩴ;->ۤ:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->ܽ(Ll/᩻ܰᩴ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
