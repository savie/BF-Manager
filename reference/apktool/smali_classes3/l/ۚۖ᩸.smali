.class public final Ll/ۚۖ᩸;
.super Ll/᩸᩻;
.source "T6J6"


# instance fields
.field public final synthetic ܰ:Ll/֫ۖ᩸;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;Landroid/content/Context;)V
    .locals 0

    .line 807
    iput-object p1, p0, Ll/ۚۖ᩸;->ܰ:Ll/֫ۖ᩸;

    invoke-direct {p0, p2}, Ll/᩸᩻;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 4

    .line 810
    invoke-super {p0, p1}, Landroid/widget/ImageButton;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 811
    iget-object v0, p0, Ll/ۚۖ᩸;->ܰ:Ll/֫ۖ᩸;

    invoke-static {v0}, Ll/֫ۖ᩸;->᩸(Ll/֫ۖ᩸;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    invoke-static {v0}, Ll/֫ۖ᩸;->ۤ(Ll/֫ۖ᩸;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 812
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    if-eqz v0, :cond_2

    .line 813
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    return-void
.end method
