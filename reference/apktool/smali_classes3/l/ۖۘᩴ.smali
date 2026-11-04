.class public final Ll/ۖۘᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ll/ۖܿ᩻;


# instance fields
.field public final synthetic ۙ:Ll/᩻ܰᩴ;

.field public final synthetic ۤ:Landroid/view/View;

.field public final synthetic ᩷:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 276
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۘᩴ;->ۙ:Ll/᩻ܰᩴ;

    iput-object p2, p0, Ll/ۖۘᩴ;->᩷:Landroid/view/View;

    iput-object p3, p0, Ll/ۖۘᩴ;->ۤ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 280
    iget-object v0, p0, Ll/ۖۘᩴ;->ۙ:Ll/᩻ܰᩴ;

    invoke-static {v0, p1}, Ll/᩻ܰᩴ;->ۙ(Ll/᩻ܰᩴ;Ljava/lang/String;)V

    .line 281
    invoke-static {v0}, Ll/᩻ܰᩴ;->ܽ(Ll/᩻ܰᩴ;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܰᩴ;

    .line 282
    iget-object v0, v0, Ll/֫ܰᩴ;->ۙ:Ll/ۙܰᩴ;

    invoke-virtual {v0}, Ll/ۙܰᩴ;->ۙ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/۠ܿ᩻;)V
    .locals 2

    .line 288
    invoke-virtual {p1}, Ll/۠ܿ᩻;->᩸()Z

    move-result p1

    iget-object v0, p0, Ll/ۖۘᩴ;->ۤ:Landroid/view/View;

    iget-object v1, p0, Ll/ۖۘᩴ;->᩷:Landroid/view/View;

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    .line 289
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    const/4 p1, 0x4

    .line 290
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 292
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 293
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final synthetic ᩷(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
