.class public final Ll/ۘܽܳ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "76ID"


# instance fields
.field public final synthetic ܰ:Ll/᩶ܽܳ;


# direct methods
.method public constructor <init>(Ll/᩶ܽܳ;)V
    .locals 0

    .line 122
    iput-object p1, p0, Ll/ۘܽܳ;->ܰ:Ll/᩶ܽܳ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 124
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v1, p0, Ll/ۘܽܳ;->ܰ:Ll/᩶ܽܳ;

    invoke-static {v0, p1, v1}, Ll/᩶ܽܳ;->ۙ(FFLandroid/view/View;)Z

    move-result p1

    invoke-static {v1, p1}, Ll/᩶ܽܳ;->ۙ(Ll/᩶ܽܳ;Z)V

    const/4 p1, 0x0

    .line 125
    invoke-static {v1, p1}, Ll/᩶ܽܳ;->᩷(Ll/᩶ܽܳ;Z)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 129
    iget-object p3, p0, Ll/ۘܽܳ;->ܰ:Ll/᩶ܽܳ;

    invoke-static {p3}, Ll/᩶ܽܳ;->۫(Ll/᩶ܽܳ;)Z

    move-result p4

    if-nez p4, :cond_1

    invoke-static {p3}, Ll/᩶ܽܳ;->֫(Ll/᩶ܽܳ;)Z

    move-result p4

    if-nez p4, :cond_1

    .line 131
    invoke-static {p3}, Ll/᩶ܽܳ;->ۚ(Ll/᩶ܽܳ;)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 132
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sub-float/2addr p4, v0

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p4, p2

    if-lez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p3, p2}, Ll/᩶ܽܳ;->᩷(Ll/᩶ܽܳ;Z)V

    .line 133
    invoke-static {p3}, Ll/᩶ܽܳ;->֫(Ll/᩶ܽܳ;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p3, p1}, Ll/᩶ܽܳ;->ۙ(Ll/᩶ܽܳ;Landroid/view/MotionEvent;)V

    .line 135
    :cond_1
    invoke-static {p3}, Ll/᩶ܽܳ;->۫(Ll/᩶ܽܳ;)Z

    move-result p1

    return p1
.end method
