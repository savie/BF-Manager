.class public final Ll/᩵ۖۘ;
.super Ljava/lang/Object;
.source "R4JY"

# interfaces
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# instance fields
.field public ܰ:Ll/ܿۖۘ;


# direct methods
.method public constructor <init>(Ll/ܿۖۘ;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Ll/᩵ۖۘ;->ܰ:Ll/ܿۖۘ;

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 72
    iget-object v0, p0, Ll/᩵ۖۘ;->ܰ:Ll/ܿۖۘ;

    const/4 v1, 0x1

    .line 76
    :try_start_0
    invoke-virtual {v0}, Ll/ܿۖۘ;->ᩴ()F

    move-result v0

    .line 77
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    .line 78
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 80
    iget-object v3, p0, Ll/᩵ۖۘ;->ܰ:Ll/ܿۖۘ;

    const/high16 v4, 0x40400000    # 3.0f

    cmpg-float v0, v0, v4

    if-gez v0, :cond_0

    .line 81
    invoke-virtual {v3, v4, v2, p1}, Ll/ܿۖۘ;->᩷(FFF)V

    return v1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 83
    invoke-virtual {v3, v0, v2, p1}, Ll/ܿۖۘ;->᩷(FFF)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v1
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    const/4 p1, 0x0

    .line 37
    iget-object v0, p0, Ll/᩵ۖۘ;->ܰ:Ll/ܿۖۘ;

    if-nez v0, :cond_0

    return p1

    .line 40
    :cond_0
    invoke-virtual {v0}, Ll/ܿۖۘ;->᩸()Landroid/widget/ImageView;

    .line 42
    iget-object v0, p0, Ll/᩵ۖۘ;->ܰ:Ll/ܿۖۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    iget-object v0, p0, Ll/᩵ۖۘ;->ܰ:Ll/ܿۖۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return p1
.end method
