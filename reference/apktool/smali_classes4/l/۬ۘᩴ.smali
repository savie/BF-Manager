.class public final Ll/۬ۘᩴ;
.super Ll/ᩴۜ᩷;
.source "313O"


# instance fields
.field public final synthetic ܰ:Ll/᩻ܰᩴ;


# direct methods
.method public constructor <init>(Ll/᩻ܰᩴ;)V
    .locals 0

    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 421
    iput-object p1, p0, Ll/۬ۘᩴ;->ܰ:Ll/᩻ܰᩴ;

    return-void
.end method


# virtual methods
.method public final onPageScrollStateChanged(I)V
    .locals 1

    .line 429
    iget-object v0, p0, Ll/۬ۘᩴ;->ܰ:Ll/᩻ܰᩴ;

    invoke-static {v0, p1}, Ll/᩻ܰᩴ;->ۙ(Ll/᩻ܰᩴ;I)V

    if-nez p1, :cond_0

    .line 430
    invoke-static {v0}, Ll/᩻ܰᩴ;->ۛ(Ll/᩻ܰᩴ;)V

    :cond_0
    return-void
.end method

.method public final onPageSelected(I)V
    .locals 1

    .line 424
    iget-object v0, p0, Ll/۬ۘᩴ;->ܰ:Ll/᩻ܰᩴ;

    invoke-static {v0}, Ll/᩻ܰᩴ;->ܽ(Ll/᩻ܰᩴ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֫ܰᩴ;

    invoke-virtual {p1}, Ll/֫ܰᩴ;->ۙ()V

    return-void
.end method
