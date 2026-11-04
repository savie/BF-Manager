.class public final Ll/۠۟ᩴ;
.super Ljava/lang/Object;
.source "P6HO"

# interfaces
.implements Ll/۟ۚ;


# instance fields
.field public final synthetic ܰ:Ll/ۜ۟ᩴ;

.field public final synthetic ᩶:Landroid/view/ActionMode$Callback;


# direct methods
.method public constructor <init>(Ll/ۜ۟ᩴ;Landroid/view/ActionMode$Callback;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠۟ᩴ;->ܰ:Ll/ۜ۟ᩴ;

    iput-object p2, p0, Ll/۠۟ᩴ;->᩶:Landroid/view/ActionMode$Callback;

    return-void
.end method


# virtual methods
.method public final onMenuItemSelected(Ll/ۢۚ;Landroid/view/MenuItem;)Z
    .locals 1

    .line 56
    iget-object p1, p0, Ll/۠۟ᩴ;->᩶:Landroid/view/ActionMode$Callback;

    iget-object v0, p0, Ll/۠۟ᩴ;->ܰ:Ll/ۜ۟ᩴ;

    invoke-interface {p1, v0, p2}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onMenuModeChange(Ll/ۢۚ;)V
    .locals 0

    return-void
.end method
