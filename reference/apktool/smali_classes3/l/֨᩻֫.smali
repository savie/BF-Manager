.class public final Ll/֨᩻֫;
.super Ljava/lang/Object;
.source "66IQ"

# interfaces
.implements Ll/ۙۧ֫;


# instance fields
.field public ۙ:Ll/᩺ۤܺ;

.field public final ۤ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(Ll/᩺ۤܺ;)V
    .locals 3

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    iput-object p1, p0, Ll/֨᩻֫;->ۙ:Ll/᩺ۤܺ;

    .line 111
    invoke-virtual {p1}, Ll/᩺ۤܺ;->getIntrinsicWidth()I

    move-result v0

    iput v0, p0, Ll/֨᩻֫;->ۤ:I

    .line 112
    invoke-virtual {p1}, Ll/᩺ۤܺ;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Ll/֨᩻֫;->᩷:I

    const/4 v2, 0x0

    .line 113
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 121
    iput-object v0, p0, Ll/֨᩻֫;->ۙ:Ll/᩺ۤܺ;

    return-void
.end method

.method public final getHeight()I
    .locals 1

    .line 117
    iget v0, p0, Ll/֨᩻֫;->᩷:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 116
    iget v0, p0, Ll/֨᩻֫;->ۤ:I

    return v0
.end method

.method public final ۙ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۙ(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 0

    .line 119
    iget-object p2, p0, Ll/֨᩻֫;->ۙ:Ll/᩺ۤܺ;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ll/᩺ۤܺ;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Landroid/graphics/RectF;FZ)V
    .locals 0

    return-void
.end method
