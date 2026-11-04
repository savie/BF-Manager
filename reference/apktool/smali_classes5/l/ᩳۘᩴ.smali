.class public final Ll/ᩳۘᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ll/ܳܰᩴ;


# instance fields
.field public final synthetic ۙ:Ll/ۖۗܳ;

.field public final synthetic ᩷:Ll/۠ۨܳ;


# direct methods
.method public constructor <init>(Ll/۠ۨܳ;Ll/ۖۗܳ;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳۘᩴ;->᩷:Ll/۠ۨܳ;

    iput-object p2, p0, Ll/ᩳۘᩴ;->ۙ:Ll/ۖۗܳ;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/view/View;Ll/᩵ۘᩴ;Ll/ܺۛᩴ;Ll/֨᩺ᩴ;)V
    .locals 7

    .line 124
    iget-object v0, p0, Ll/ᩳۘᩴ;->ۙ:Ll/ۖۗܳ;

    invoke-interface {v0}, Ll/ۖۗܳ;->ۛۙ()Ljava/lang/String;

    move-result-object v3

    .line 125
    new-instance v0, Ll/ܿܽ;

    iget-object v1, p0, Ll/ᩳۘᩴ;->᩷:Ll/۠ۨܳ;

    invoke-virtual {v1}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 126
    invoke-virtual {v0}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p1

    const v1, 0x7f1208d5

    .line 127
    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    invoke-interface {v1, v4}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    if-eqz p3, :cond_0

    const v1, 0x7f1208d1

    .line 129
    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 131
    :cond_0
    new-instance p1, Ll/᩷ۜ᩻;

    iget-object v5, p0, Ll/ᩳۘᩴ;->᩷:Ll/۠ۨܳ;

    move-object v1, p1

    move-object v2, p4

    move-object v4, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ll/᩷ۜ᩻;-><init>(Ll/֨᩺ᩴ;Ljava/lang/String;Ll/ܺۛᩴ;Ll/۠ۨܳ;Ll/᩵ۘᩴ;)V

    invoke-virtual {v0, p1}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 149
    invoke-virtual {v0}, Ll/ܿܽ;->ᩴ()V

    return-void
.end method

.method public final ۙ(Ll/᩵ۘᩴ;Ll/ܺۛᩴ;Ll/֨᩺ᩴ;)V
    .locals 2

    .line 109
    iget-object v0, p0, Ll/ᩳۘᩴ;->᩷:Ll/۠ۨܳ;

    iget-object v1, p0, Ll/ᩳۘᩴ;->ۙ:Ll/ۖۗܳ;

    if-eqz p3, :cond_0

    .line 110
    invoke-virtual {p3, v0, v1}, Ll/֨᩺ᩴ;->ۙ(Ll/۠ۨܳ;Ll/ۖۗܳ;)V

    return-void

    .line 111
    :cond_0
    invoke-static {v0, v1}, Ll/ۗۘᩴ;->ۙ(Ll/۠ۨܳ;Ll/ۖۗܳ;)Z

    move-result p3

    if-eqz p3, :cond_1

    const/16 p1, 0x1388

    .line 112
    invoke-static {v1, p1}, Ll/ᩴ᩶ܳ;->ۙ(Ll/ۖۗܳ;I)V

    .line 113
    invoke-interface {p2}, Ll/ܺۛᩴ;->ۤ()Landroid/content/ComponentName;

    move-result-object p1

    invoke-static {v0, v1, p1}, Ll/ۗۘᩴ;->ۙ(Ll/۠ۨܳ;Ll/ۖۗܳ;Landroid/content/ComponentName;)V

    return-void

    .line 115
    :cond_1
    new-instance p3, Ll/ۚ۟ܳ;

    invoke-direct {p3, v1, p1, p2}, Ll/ۚ۟ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1, p3}, Ll/֫ۘܳ;->ۙ(Ll/۠ۨܳ;Ll/ۖۗܳ;Ll/ۚۘܳ;)V

    return-void
.end method
