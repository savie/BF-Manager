.class public Ll/ۧܽܳ;
.super Landroid/accessibilityservice/AccessibilityService;
.source "F6FC"


# instance fields
.field public volatile ܰ:Z

.field public volatile ᩶:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 37
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/ܽܺܳ;->ۙ(Ll/ۧܽܳ;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 42
    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 43
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ܽܺܳ;->ۙ(Ll/ۧܽܳ;)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 17
    invoke-super {p0}, Landroid/accessibilityservice/AccessibilityService;->onCreate()V

    .line 18
    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->setTheme(I)V

    .line 19
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܽܺܳ;->ۤ(Ll/ۧܽܳ;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Ll/ۧܽܳ;->ܰ:Z

    .line 56
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܽܺܳ;->᩸(Ll/ۧܽܳ;)V

    .line 57
    invoke-super {p0}, Landroid/accessibilityservice/AccessibilityService;->onDestroy()V

    return-void
.end method

.method public final onInterrupt()V
    .locals 0

    return-void
.end method

.method public final onServiceConnected()V
    .locals 1

    .line 24
    invoke-super {p0}, Landroid/accessibilityservice/AccessibilityService;->onServiceConnected()V

    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Ll/ۧܽܳ;->᩶:Z

    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Ll/ۧܽܳ;->ܰ:Z

    .line 27
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܽܺܳ;->᩷(Ll/ۧܽܳ;)V

    return-void
.end method

.method public final onUnbind(Landroid/content/Intent;)Z
    .locals 1

    const/4 v0, 0x0

    .line 48
    iput-boolean v0, p0, Ll/ۧܽܳ;->ܰ:Z

    .line 49
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/ܽܺܳ;->ᩴ(Ll/ۧܽܳ;)V

    .line 50
    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService;->onUnbind(Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Z)V
    .locals 0

    .line 32
    iput-boolean p1, p0, Ll/ۧܽܳ;->᩶:Z

    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 30
    iget-boolean v0, p0, Ll/ۧܽܳ;->ܰ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۧܽܳ;->᩶:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Ll/ۧܽܳ;->᩶:Z

    return v0
.end method
