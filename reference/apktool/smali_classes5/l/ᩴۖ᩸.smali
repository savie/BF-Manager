.class public final Ll/ᩴۖ᩸;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "T6J6"


# instance fields
.field public final synthetic ܰ:Ll/֫ۖ᩸;


# direct methods
.method public constructor <init>(Ll/֫ۖ᩸;)V
    .locals 0

    .line 133
    iput-object p1, p0, Ll/ᩴۖ᩸;->ܰ:Ll/֫ۖ᩸;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 137
    iget-object v0, p0, Ll/ᩴۖ᩸;->ܰ:Ll/֫ۖ᩸;

    invoke-static {v0}, Ll/֫ۖ᩸;->ۚ(Ll/֫ۖ᩸;)Ll/᩹ۖ᩸;

    move-result-object v1

    invoke-static {v0, v1}, Ll/֫ۖ᩸;->᩷(Ll/֫ۖ᩸;Ll/᩹ۖ᩸;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-static {v0, v1, p1}, Ll/֫ۖ᩸;->ۙ(Ll/֫ۖ᩸;FF)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 138
    invoke-virtual {v0}, Ll/֫ۖ᩸;->performClick()Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
