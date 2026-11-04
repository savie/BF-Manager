.class public final Ll/ۤ۟᩷;
.super Ljava/lang/Object;
.source "Y6A7"

# interfaces
.implements Ll/᩵ۡ;


# instance fields
.field public final synthetic ۙ:Ll/᩻ᩳ᩷;


# direct methods
.method public constructor <init>(Ll/᩻ᩳ᩷;)V
    .locals 0

    .line 729
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤ۟᩷;->ۙ:Ll/᩻ᩳ᩷;

    return-void
.end method


# virtual methods
.method public final ۙ()F
    .locals 2

    .line 757
    iget-object v0, p0, Ll/ۤ۟᩷;->ۙ:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {v1}, Ll/᩶۟᩷;->canScrollVertically()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 758
    iget v0, v0, Ll/᩻ᩳ᩷;->mScaledVerticalScrollFactor:F

    goto :goto_0

    .line 760
    :cond_0
    iget-object v1, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {v1}, Ll/᩶۟᩷;->canScrollHorizontally()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 761
    iget v0, v0, Ll/᩻ᩳ᩷;->mScaledHorizontalScrollFactor:F

    :goto_0
    neg-float v0, v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ۙ(F)Z
    .locals 3

    .line 734
    iget-object v0, p0, Ll/ۤ۟᩷;->ۙ:Ll/᩻ᩳ᩷;

    iget-object v1, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {v1}, Ll/᩶۟᩷;->canScrollVertically()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    float-to-int p1, p1

    const/4 v1, 0x0

    goto :goto_1

    .line 736
    :cond_0
    iget-object v1, v0, Ll/᩻ᩳ᩷;->mLayout:Ll/᩶۟᩷;

    invoke-virtual {v1}, Ll/᩶۟᩷;->canScrollHorizontally()Z

    move-result v1

    if-eqz v1, :cond_1

    float-to-int p1, p1

    move v1, p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 p1, 0x0

    :goto_1
    if-nez v1, :cond_2

    if-nez p1, :cond_2

    return v2

    .line 744
    :cond_2
    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->stopScroll()V

    .line 747
    invoke-virtual {v0, v1, p1}, Ll/᩻ᩳ᩷;->flingNoThresholdCheck(II)Z

    move-result p1

    return p1
.end method

.method public final ᩷()V
    .locals 1

    .line 752
    iget-object v0, p0, Ll/ۤ۟᩷;->ۙ:Ll/᩻ᩳ᩷;

    invoke-virtual {v0}, Ll/᩻ᩳ᩷;->stopScroll()V

    return-void
.end method
