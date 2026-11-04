.class public final Ll/֨ۘᩴ;
.super Ljava/lang/Object;
.source "313O"

# interfaces
.implements Ll/ܳܰᩴ;


# instance fields
.field public final synthetic ۙ:Lbin/mt/plus/Main;

.field public final synthetic ᩷:Ll/᩷ۨᩴ;


# direct methods
.method public constructor <init>(Ll/᩷ۨᩴ;Lbin/mt/plus/Main;)V
    .locals 0

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۘᩴ;->᩷:Ll/᩷ۨᩴ;

    iput-object p2, p0, Ll/֨ۘᩴ;->ۙ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/view/View;Ll/᩵ۘᩴ;Ll/ܺۛᩴ;Ll/֨᩺ᩴ;)V
    .locals 2

    .line 174
    new-instance p4, Ll/ܿܽ;

    .line 68
    iget-object v0, p0, Ll/֨ۘᩴ;->ۙ:Lbin/mt/plus/Main;

    const/4 v1, 0x0

    invoke-direct {p4, v0, p1, v1}, Ll/ܿܽ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 175
    invoke-virtual {p4}, Ll/ܿܽ;->ۤ()Ll/ۢۚ;

    move-result-object p1

    const v0, 0x7f120b04

    .line 176
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    const v0, 0x7f1208d1

    .line 177
    invoke-interface {p1, v1, v0, v1, v0}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 178
    new-instance p1, Ll/ۢۘᩴ;

    invoke-direct {p1, p3, p2}, Ll/ۢۘᩴ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p4, p1}, Ll/ܿܽ;->ۙ(Ll/᩶ܽ;)V

    .line 189
    invoke-virtual {p4}, Ll/ܿܽ;->ᩴ()V

    return-void
.end method

.method public final ۙ(Ll/᩵ۘᩴ;Ll/ܺۛᩴ;Ll/֨᩺ᩴ;)V
    .locals 1

    .line 168
    iget-object p3, p0, Ll/֨ۘᩴ;->᩷:Ll/᩷ۨᩴ;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Ll/᩵ۘᩴ;->ۙ(Ll/ܺۛᩴ;Ll/᩷ۨᩴ;Z)V

    return-void
.end method
