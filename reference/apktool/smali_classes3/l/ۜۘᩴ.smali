.class public final Ll/ۜۘᩴ;
.super Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;
.source "313O"


# instance fields
.field public final synthetic ۙ:Ll/᩻ܰᩴ;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;Ll/ܳۜ᩷;)V
    .locals 0

    .line 411
    iput-object p1, p0, Ll/ۜۘᩴ;->ۙ:Ll/᩻ܰᩴ;

    invoke-direct {p0, p2}, Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;-><init>(Ll/ܳۜ᩷;)V

    return-void
.end method


# virtual methods
.method public final onTabSelected(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    .locals 3

    .line 414
    iget-object v0, p0, Ll/ۜۘᩴ;->ۙ:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->᩵(Ll/᩻ܰᩴ;)Ll/۬ܿ᩻;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܳۜ᩷;->ۤ()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 415
    invoke-static {v0}, Ll/᩻ܰᩴ;->᩵(Ll/᩻ܰᩴ;)Ll/۬ܿ᩻;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout$Tab;->getPosition()I

    move-result p1

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ܳۜ᩷;->ۙ(IZ)V

    :cond_0
    return-void
.end method
