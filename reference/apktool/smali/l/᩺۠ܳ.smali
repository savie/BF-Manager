.class public final Ll/᩺۠ܳ;
.super Ll/ܺ֡᩷;
.source "164Z"


# instance fields
.field public final synthetic ᩴ:Ll/۬۠ܳ;

.field public final synthetic ᩸:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/۬۠ܳ;Ljava/util/ArrayList;)V
    .locals 0

    .line 546
    iput-object p1, p0, Ll/᩺۠ܳ;->ᩴ:Ll/۬۠ܳ;

    iput-object p2, p0, Ll/᩺۠ܳ;->᩸:Ljava/util/ArrayList;

    invoke-direct {p0}, Ll/ܺ֡᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩻ᩳ᩷;Ll/ۧᩳ᩷;Ll/ۧᩳ᩷;)Z
    .locals 1

    .line 559
    invoke-virtual {p2}, Ll/ۧᩳ᩷;->getBindingAdapterPosition()I

    move-result p1

    .line 560
    invoke-virtual {p3}, Ll/ۧᩳ᩷;->getBindingAdapterPosition()I

    move-result p2

    const/4 p3, -0x1

    if-eq p1, p3, :cond_1

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 564
    :cond_0
    iget-object p3, p0, Ll/᩺۠ܳ;->᩸:Ljava/util/ArrayList;

    invoke-static {p1, p2, p3}, Ll/ۢۚܺ;->ۙ(IILjava/util/List;)V

    .line 565
    iget-object v0, p0, Ll/᩺۠ܳ;->ᩴ:Ll/۬۠ܳ;

    invoke-virtual {v0, p1, p2}, Ll/۫۟᩷;->notifyItemMoved(II)V

    .line 566
    invoke-static {p3}, Ll/֫ۜܳ;->ۙ(Ljava/util/ArrayList;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۤ(Ll/ۧᩳ᩷;)V
    .locals 0

    return-void
.end method

.method public final ۤ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷(Ll/ۧᩳ᩷;)I
    .locals 1

    .line 550
    iget-object p1, p0, Ll/᩺۠ܳ;->ᩴ:Ll/۬۠ܳ;

    invoke-static {p1}, Ll/۬۠ܳ;->ۤ(Ll/۬۠ܳ;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 552
    :goto_0
    invoke-static {p1, v0}, Ll/ܺ֡᩷;->ۤ(II)I

    move-result p1

    return p1
.end method

.method public final ᩷()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
