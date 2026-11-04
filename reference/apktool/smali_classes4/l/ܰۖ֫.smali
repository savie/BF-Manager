.class public final Ll/ܰۖ֫;
.super Landroid/widget/FrameLayout;
.source "TIXB"


# instance fields
.field public ܰ:Ll/ۢ۬֫;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 22
    iget-object v0, p0, Ll/ܰۖ֫;->ܰ:Ll/ۢ۬֫;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۢ۬֫;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    iget-object v2, p0, Ll/ܰۖ֫;->ܰ:Ll/ۢ۬֫;

    if-eqz v2, :cond_2

    invoke-virtual {v2, p1}, Ll/ۢ۬֫;->ۙ(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez v0, :cond_1

    .line 26
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    const/4 v0, 0x3

    .line 27
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    .line 28
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 29
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1
    return v1

    .line 34
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final ۙ(Ll/ۢ۬֫;)V
    .locals 0

    .line 18
    iput-object p1, p0, Ll/ܰۖ֫;->ܰ:Ll/ۢ۬֫;

    return-void
.end method
