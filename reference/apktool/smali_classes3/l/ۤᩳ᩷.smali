.class public final Ll/ۤᩳ᩷;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ۙ:Z

.field public ۤ:I

.field public ܳ:I

.field public ᩴ:Landroid/view/animation/Interpolator;

.field public ᩷:I

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 13181
    iput v0, p0, Ll/ۤᩳ᩷;->ܳ:I

    const/4 v0, 0x0

    .line 13185
    iput-boolean v0, p0, Ll/ۤᩳ᩷;->ۙ:Z

    .line 13217
    iput v0, p0, Ll/ۤᩳ᩷;->ۤ:I

    .line 13218
    iput v0, p0, Ll/ۤᩳ᩷;->᩸:I

    const/high16 v0, -0x80000000

    .line 13219
    iput v0, p0, Ll/ۤᩳ᩷;->᩷:I

    const/4 v0, 0x0

    .line 13220
    iput-object v0, p0, Ll/ۤᩳ᩷;->ᩴ:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public final ۙ(I)V
    .locals 0

    .line 13239
    iput p1, p0, Ll/ۤᩳ᩷;->ܳ:I

    return-void
.end method

.method public final ۙ(IILandroid/view/animation/Interpolator;I)V
    .locals 0

    .line 13336
    iput p1, p0, Ll/ۤᩳ᩷;->ۤ:I

    .line 13337
    iput p2, p0, Ll/ۤᩳ᩷;->᩸:I

    .line 13338
    iput p4, p0, Ll/ۤᩳ᩷;->᩷:I

    .line 13339
    iput-object p3, p0, Ll/ۤᩳ᩷;->ᩴ:Landroid/view/animation/Interpolator;

    const/4 p1, 0x1

    .line 13340
    iput-boolean p1, p0, Ll/ۤᩳ᩷;->ۙ:Z

    return-void
.end method

.method public final ۙ(Ll/᩻ᩳ᩷;)V
    .locals 5

    .line 13247
    iget v0, p0, Ll/ۤᩳ᩷;->ܳ:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, -0x1

    .line 13249
    iput v2, p0, Ll/ۤᩳ᩷;->ܳ:I

    .line 13250
    invoke-virtual {p1, v0}, Ll/᩻ᩳ᩷;->jumpToPositionForSmoothScroller(I)V

    .line 13251
    iput-boolean v1, p0, Ll/ۤᩳ᩷;->ۙ:Z

    return-void

    .line 13254
    :cond_0
    iget-boolean v0, p0, Ll/ۤᩳ᩷;->ۙ:Z

    if-eqz v0, :cond_4

    .line 13271
    iget-object v0, p0, Ll/ۤᩳ᩷;->ᩴ:Landroid/view/animation/Interpolator;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v3, p0, Ll/ۤᩳ᩷;->᩷:I

    if-lt v3, v2, :cond_1

    goto :goto_0

    .line 13272
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13274
    :cond_2
    :goto_0
    iget v3, p0, Ll/ۤᩳ᩷;->᩷:I

    if-lt v3, v2, :cond_3

    .line 13256
    iget-object p1, p1, Ll/᩻ᩳ᩷;->mViewFlinger:Ll/֫ᩳ᩷;

    iget v2, p0, Ll/ۤᩳ᩷;->ۤ:I

    iget v4, p0, Ll/ۤᩳ᩷;->᩸:I

    invoke-virtual {p1, v2, v4, v0, v3}, Ll/֫ᩳ᩷;->ۙ(IILandroid/view/animation/Interpolator;I)V

    .line 13264
    iput-boolean v1, p0, Ll/ۤᩳ᩷;->ۙ:Z

    return-void

    .line 13275
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Scroll duration must be a positive number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-void
.end method

.method public final ۙ()Z
    .locals 1

    .line 13243
    iget v0, p0, Ll/ۤᩳ᩷;->ܳ:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
