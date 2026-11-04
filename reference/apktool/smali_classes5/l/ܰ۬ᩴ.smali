.class public final Ll/ܰ۬ᩴ;
.super Ll/᩶᩷ۙ;
.source "HIRF"


# instance fields
.field public ܰ:Z

.field public final synthetic ᩶:Ll/᩸ۙܳ;


# direct methods
.method public constructor <init>(Ll/᩸ۙܳ;)V
    .locals 0

    .line 164
    iput-object p1, p0, Ll/ܰ۬ᩴ;->᩶:Ll/᩸ۙܳ;

    invoke-direct {p0}, Ll/᩶᩷ۙ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDrawerClosed(Landroid/view/View;)V
    .locals 2

    .line 182
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0179

    iget-object v1, p0, Ll/ܰ۬ᩴ;->᩶:Ll/᩸ۙܳ;

    if-ne p1, v0, :cond_0

    .line 184
    invoke-static {v1}, Ll/᩸ۙܳ;->ܰ(Ll/᩸ۙܳ;)Ll/ۜ᩸ܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۜ᩸ܳ;->᩷()V

    .line 186
    :cond_0
    invoke-virtual {v1}, Ll/᩸ۙܳ;->֫()V

    return-void
.end method

.method public final onDrawerSlide(Landroid/view/View;F)V
    .locals 1

    .line 175
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0178

    if-ne p1, v0, :cond_2

    const/4 p1, 0x0

    cmpl-float p1, p2, p1

    if-lez p1, :cond_0

    .line 176
    iget-boolean p2, p0, Ll/ܰ۬ᩴ;->ܰ:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Ll/ܰ۬ᩴ;->᩶:Ll/᩸ۙܳ;

    invoke-static {p2}, Ll/᩸ۙܳ;->ۧ(Ll/᩸ۙܳ;)Ll/۬ۙܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Ll/᩸ۙܳ;->ܽ(Ll/᩸ۙܳ;)Ll/ᩴۤܳ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ᩴۤܳ;->ۙ()V

    :cond_0
    if-lez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 177
    :goto_0
    iput-boolean p1, p0, Ll/ܰ۬ᩴ;->ܰ:Z

    :cond_2
    return-void
.end method

.method public final onDrawerStateChanged(I)V
    .locals 2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 167
    iget-object p1, p0, Ll/ܰ۬ᩴ;->᩶:Ll/᩸ۙܳ;

    invoke-static {p1}, Ll/᩸ۙܳ;->ܺ(Ll/᩸ۙܳ;)Ll/۟᩷ۙ;

    move-result-object v0

    const v1, 0x800003

    invoke-virtual {v0, v1}, Ll/۟᩷ۙ;->᩸(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 169
    invoke-static {p1}, Ll/᩸ۙܳ;->ܰ(Ll/᩸ۙܳ;)Ll/ۜ᩸ܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜ᩸ܳ;->᩷()V

    .line 170
    invoke-virtual {p1}, Ll/᩸ۙܳ;->֫()V

    :cond_0
    return-void
.end method
