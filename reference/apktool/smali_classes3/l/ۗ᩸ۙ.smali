.class public Ll/ۗ᩸ۙ;
.super Ljava/lang/Object;
.source "EB24"

# interfaces
.implements Ll/ۖۢ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 85
    new-instance v0, Ll/᩻᩸ۙ;

    .line 142
    new-instance v1, Ll/ܶ᩸ۙ;

    invoke-direct {v1, p1}, Ll/ܶ᩸ۙ;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ll/ۜۤۙ;-><init>(Ll/ܳ᩸ۙ;)V

    const/4 v1, 0x1

    .line 1598
    iput v1, v0, Ll/ۜۤۙ;->᩷:I

    .line 85
    invoke-static {v0}, Ll/֫᩸ۙ;->ۙ(Ll/ۜۤۙ;)V

    .line 97
    invoke-static {p1}, Ll/֨ۢ᩷;->ۙ(Landroid/content/Context;)Ll/֨ۢ᩷;

    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ll/֨ۢ᩷;->ۙ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩻ۙ;

    .line 100
    invoke-interface {p1}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p1

    .line 101
    new-instance v0, Ll/ۧ᩸ۙ;

    invoke-direct {v0, p0, p1}, Ll/ۧ᩸ۙ;-><init>(Ll/ۗ᩸ۙ;Ll/۠ۧۙ;)V

    invoke-virtual {p1, v0}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    .line 71
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ۙ()Ljava/util/List;
    .locals 1

    .line 121
    const-class v0, Ll/ۗ᩻ۙ;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
