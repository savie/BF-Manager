.class public final Ll/᩺ܶܳ;
.super Ljava/lang/Object;
.source "J6IU"


# instance fields
.field public final ۙ:I

.field public final ᩷:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/view/Display;)V
    .locals 2

    .line 300
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 299
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    iput-object v0, p0, Ll/᩺ܶܳ;->᩷:Landroid/graphics/Point;

    .line 300
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    move-result v1

    iput v1, p0, Ll/᩺ܶܳ;->ۙ:I

    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    return-void
.end method
