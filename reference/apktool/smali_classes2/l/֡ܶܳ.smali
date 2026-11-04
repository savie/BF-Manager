.class public final synthetic Ll/֡ܶܳ;
.super Ljava/lang/Object;
.source "66CT"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:Ll/ᩳܶܳ;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳܶܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ܶܳ;->ܰ:Ll/ᩳܶܳ;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 10

    .line 2
    check-cast p1, Ljava/lang/Integer;

    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 35
    iget-object v0, p0, Ll/֡ܶܳ;->ܰ:Ll/ᩳܶܳ;

    iget-object v1, v0, Ll/ᩳܶܳ;->ۙ:[Ll/۟ܶܳ;

    iget-object v0, v0, Ll/ᩳܶܳ;->᩷:[I

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget v2, v0, v2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget v0, v0, v3

    invoke-static {v2, v0}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-nez v0, :cond_0

    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget-object v0, v1, v0

    .line 71
    iget v2, v0, Ll/۟ܶܳ;->ۤ:I

    int-to-double v2, v2

    iget v4, v0, Ll/۟ܶܳ;->᩷:I

    int-to-double v4, v4

    sub-double/2addr v2, v4

    iget v4, v0, Ll/۟ܶܳ;->ۙ:I

    int-to-double v4, v4

    iget v0, v0, Ll/۟ܶܳ;->᩸:I

    int-to-double v6, v0

    sub-double/2addr v4, v6

    mul-double v4, v4, v2

    .line 36
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aget-object v0, v1, v0

    .line 71
    iget v1, v0, Ll/۟ܶܳ;->ۤ:I

    int-to-double v1, v1

    iget v3, v0, Ll/۟ܶܳ;->᩷:I

    int-to-double v6, v3

    sub-double/2addr v1, v6

    iget v3, v0, Ll/۟ܶܳ;->ۙ:I

    int-to-double v6, v3

    iget v0, v0, Ll/۟ܶܳ;->᩸:I

    int-to-double v8, v0

    sub-double/2addr v6, v8

    mul-double v6, v6, v1

    .line 36
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    :cond_0
    if-nez v0, :cond_1

    .line 37
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :cond_1
    return v0
.end method
