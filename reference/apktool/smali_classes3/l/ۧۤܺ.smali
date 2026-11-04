.class public final Ll/ۧۤܺ;
.super Ljava/lang/Object;
.source "Y6P1"


# instance fields
.field public final ۙ:Ll/۠ۧۙ;


# direct methods
.method public constructor <init>(Ll/۠ۧۙ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/ۧۤܺ;->ۙ:Ll/۠ۧۙ;

    return-void
.end method

.method public static ۙ(Ll/ۤ᩻ۙ;)Ll/ۧۤܺ;
    .locals 1

    .line 34
    new-instance v0, Ll/ۧۤܺ;

    invoke-interface {p0}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۧۤܺ;-><init>(Ll/۠ۧۙ;)V

    return-object v0
.end method

.method public static ۙ(Ll/᩺ۜ᩸;)Ll/ۧۤܺ;
    .locals 4

    const-string v0, "<this>"

    .line 0
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const v2, 0x7f0a06db

    .line 53
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ll/ۤ᩻ۙ;

    if-eqz v3, :cond_0

    check-cast v2, Ll/ۤ᩻ۙ;

    goto :goto_1

    :cond_0
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_1

    goto :goto_3

    .line 68
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const v2, 0x7f0a06da

    .line 71
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 72
    instance-of v2, v0, Landroid/view/ViewParent;

    if-eqz v2, :cond_3

    move-object v2, v0

    check-cast v2, Landroid/view/ViewParent;

    goto :goto_2

    :cond_3
    move-object v2, v1

    .line 57
    :goto_2
    instance-of v0, v2, Landroid/view/View;

    if-eqz v0, :cond_4

    move-object v0, v2

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_4
    move-object v0, v1

    goto :goto_0

    :cond_5
    move-object v2, v1

    :goto_3
    if-nez v2, :cond_6

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Ll/ۗۚܺ;->ۙ(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    .line 43
    instance-of v0, p0, Ll/ۤ᩻ۙ;

    if-eqz v0, :cond_6

    move-object v2, p0

    check-cast v2, Ll/ۤ᩻ۙ;

    .line 46
    :cond_6
    new-instance p0, Ll/ۧۤܺ;

    if-nez v2, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v2}, Ll/ۤ᩻ۙ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    :goto_4
    invoke-direct {p0, v1}, Ll/ۧۤܺ;-><init>(Ll/۠ۧۙ;)V

    return-object p0
.end method


# virtual methods
.method public final ۙ()Ll/۠ۧۙ;
    .locals 1

    .line 28
    iget-object v0, p0, Ll/ۧۤܺ;->ۙ:Ll/۠ۧۙ;

    return-object v0
.end method

.method public final ᩷()Z
    .locals 2

    .line 52
    iget-object v0, p0, Ll/ۧۤܺ;->ۙ:Ll/۠ۧۙ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    sget-object v1, Ll/ۖۧۙ;->֡:Ll/ۖۧۙ;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
