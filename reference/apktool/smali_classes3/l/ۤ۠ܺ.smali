.class public final Ll/ۤ۠ܺ;
.super Ljava/lang/Object;
.source "SB7W"


# instance fields
.field public final ۙ:Landroid/graphics/Bitmap;

.field public final ۤ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;II)V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p2, :cond_0

    if-lez p3, :cond_0

    .line 108
    iput-object p1, p0, Ll/ۤ۠ܺ;->ۙ:Landroid/graphics/Bitmap;

    .line 109
    iput p2, p0, Ll/ۤ۠ܺ;->ۤ:I

    .line 110
    iput p3, p0, Ll/ۤ۠ܺ;->᩷:I

    return-void

    .line 107
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid resolved image"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
