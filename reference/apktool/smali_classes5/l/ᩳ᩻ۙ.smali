.class public Ll/ᩳ᩻ۙ;
.super Landroid/app/Fragment;
.source "P96C"


# static fields
.field public static final synthetic ᩶:I


# instance fields
.field public ܰ:Ll/᩶᩻ۙ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method

.method private final ۙ(Ll/ۡۧۙ;)V
    .locals 2

    .line 79
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    .line 83
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "getActivity(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Ll/ܿ᩻ۙ;->ۙ(Landroid/app/Activity;Ll/ۡۧۙ;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 44
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 46
    sget-object p1, Ll/ۡۧۙ;->۟:Ll/ۡۧۙ;

    invoke-direct {p0, p1}, Ll/ᩳ᩻ۙ;->ۙ(Ll/ۡۧۙ;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 72
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 73
    sget-object v0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    invoke-direct {p0, v0}, Ll/ᩳ᩻ۙ;->ۙ(Ll/ۡۧۙ;)V

    const/4 v0, 0x0

    .line 75
    iput-object v0, p0, Ll/ᩳ᩻ۙ;->ܰ:Ll/᩶᩻ۙ;

    return-void
.end method

.method public final onPause()V
    .locals 1

    .line 62
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 63
    sget-object v0, Ll/ۡۧۙ;->ۢ:Ll/ۡۧۙ;

    invoke-direct {p0, v0}, Ll/ᩳ᩻ۙ;->ۙ(Ll/ۡۧۙ;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 56
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 57
    iget-object v0, p0, Ll/ᩳ᩻ۙ;->ܰ:Ll/᩶᩻ۙ;

    if-eqz v0, :cond_0

    .line 40
    invoke-interface {v0}, Ll/᩶᩻ۙ;->ۙ()V

    .line 58
    :cond_0
    sget-object v0, Ll/ۡۧۙ;->֨:Ll/ۡۧۙ;

    invoke-direct {p0, v0}, Ll/ᩳ᩻ۙ;->ۙ(Ll/ۡۧۙ;)V

    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 50
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 51
    iget-object v0, p0, Ll/ᩳ᩻ۙ;->ܰ:Ll/᩶᩻ۙ;

    if-eqz v0, :cond_0

    .line 36
    invoke-interface {v0}, Ll/᩶᩻ۙ;->onStart()V

    .line 52
    :cond_0
    sget-object v0, Ll/ۡۧۙ;->ۡ:Ll/ۡۧۙ;

    invoke-direct {p0, v0}, Ll/ᩳ᩻ۙ;->ۙ(Ll/ۡۧۙ;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 67
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 68
    sget-object v0, Ll/ۡۧۙ;->ۖ:Ll/ۡۧۙ;

    invoke-direct {p0, v0}, Ll/ᩳ᩻ۙ;->ۙ(Ll/ۡۧۙ;)V

    return-void
.end method

.method public final ۙ(Ll/᩺᩻ۙ;)V
    .locals 0

    .line 88
    iput-object p1, p0, Ll/ᩳ᩻ۙ;->ܰ:Ll/᩶᩻ۙ;

    return-void
.end method
