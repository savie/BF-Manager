.class public final synthetic Ll/᩹ۡܳ;
.super Ljava/lang/Object;
.source "L5KK"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ܰ:Ll/ۘۡܳ;

.field public final synthetic ᩶:Ll/᩺ۡܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۘۡܳ;Ll/᩺ۡܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ۡܳ;->ܰ:Ll/ۘۡܳ;

    iput-object p2, p0, Ll/᩹ۡܳ;->᩶:Ll/᩺ۡܳ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget-object p1, p0, Ll/᩹ۡܳ;->ܰ:Ll/ۘۡܳ;

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    iget-object p2, p0, Ll/᩹ۡܳ;->᩶:Ll/᩺ۡܳ;

    invoke-virtual {p2}, Ll/ۧᩳ᩷;->getBindingAdapterPosition()I

    move-result p2

    .line 93
    iget-object v0, p1, Ll/۠ۡܳ;->᩶:Ll/ۡۡܳ;

    invoke-virtual {v0, p1}, Ll/ۡۡܳ;->ۙ(Ll/۠ۡܳ;)I

    move-result v1

    sub-int v1, p2, v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    .line 311
    iget-object p1, p1, Ll/۠ۡܳ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 312
    invoke-static {}, Ll/᩸ܿܳ;->ܺ()Ll/ۙܿܳ;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/ۙܿܳ;->ۙ(I)V

    .line 313
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_0

    .line 314
    invoke-virtual {v0, p2, v2}, Ll/۫۟᩷;->notifyItemRangeRemoved(II)V

    goto :goto_0

    :cond_0
    sub-int/2addr p2, v2

    const/4 p1, 0x2

    .line 316
    invoke-virtual {v0, p2, p1}, Ll/۫۟᩷;->notifyItemRangeRemoved(II)V

    .line 45
    :goto_0
    sget-object p1, Ll/ۘۡܳ;->ۖ:Ll/ܽ᩻ۙ;

    const-class p2, Ljava/lang/Object;

    invoke-virtual {p1, p2}, Ll/ܽ᩻ۙ;->ۙ(Ljava/lang/Object;)V

    return-void
.end method
