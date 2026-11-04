.class public final Ll/ۖܶܳ;
.super Ljava/lang/Object;
.source "CIS6"

# interfaces
.implements Ll/۟ۚ;


# instance fields
.field public final synthetic ܰ:Ll/۠ܶܳ;

.field public final synthetic ᩶:Ll/ۜܽܳ;


# direct methods
.method public constructor <init>(Ll/۠ܶܳ;Ll/ۜܽܳ;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖܶܳ;->ܰ:Ll/۠ܶܳ;

    iput-object p2, p0, Ll/ۖܶܳ;->᩶:Ll/ۜܽܳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۢۚ;Landroid/view/MenuItem;)Z
    .locals 1

    const/4 p1, 0x1

    .line 44
    invoke-interface {p2, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 45
    iget-object v0, p0, Ll/ۖܶܳ;->ܰ:Ll/۠ܶܳ;

    invoke-virtual {v0}, Ll/ܺܽ;->dismiss()V

    .line 46
    iget-object v0, p0, Ll/ۖܶܳ;->᩶:Ll/ۜܽܳ;

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    invoke-virtual {v0, p2}, Ll/ۜܽܳ;->accept(I)V

    return p1
.end method

.method public final onMenuModeChange(Ll/ۢۚ;)V
    .locals 0

    return-void
.end method
