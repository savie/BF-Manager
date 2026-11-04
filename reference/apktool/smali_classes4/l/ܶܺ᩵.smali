.class public final Ll/ܶܺ᩵;
.super Ljava/lang/Object;
.source "1ISQ"


# instance fields
.field public final ۙ:I

.field public final ᩷:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput p1, p0, Ll/ܶܺ᩵;->᩷:I

    .line 46
    iput p2, p0, Ll/ܶܺ᩵;->ۙ:I

    return-void
.end method

.method public static ۙ([BLl/ܶܺ᩵;)Ljava/util/ArrayList;
    .locals 4

    .line 51
    iget v0, p1, Ll/ܶܺ᩵;->᩷:I

    .line 55
    iget p1, p1, Ll/ܶܺ᩵;->ۙ:I

    .line 26
    array-length v1, p0

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 27
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 29
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-lt v0, p1, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v2, v0, 0x20

    .line 34
    invoke-static {v2, p0}, Ll/ܶܿ֫;->ۙ(I[B)I

    move-result v2

    add-int/2addr v2, v0

    move v3, v2

    move v2, v0

    move v0, v3

    goto :goto_0
.end method
