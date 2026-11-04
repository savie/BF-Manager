.class public final Ll/֡ۗ;
.super Ljava/lang/Object;
.source "L3KT"


# instance fields
.field public ۙ:I

.field public ۤ:I

.field public ᩷:[I

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    const/4 v0, 0x7

    .line 43
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    shl-int/2addr v0, v2

    :cond_0
    add-int/lit8 v1, v0, -0x1

    .line 47
    iput v1, p0, Ll/֡ۗ;->ۙ:I

    .line 48
    new-array v0, v0, [I

    iput-object v0, p0, Ll/֡ۗ;->᩷:[I

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 124
    iget v0, p0, Ll/֡ۗ;->ۤ:I

    iput v0, p0, Ll/֡ۗ;->᩸:I

    return-void
.end method

.method public final ۙ(I)V
    .locals 6

    .line 86
    iget-object v0, p0, Ll/֡ۗ;->᩷:[I

    iget v1, p0, Ll/֡ۗ;->᩸:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 87
    iget p1, p0, Ll/֡ۗ;->ۙ:I

    and-int/2addr p1, v1

    iput p1, p0, Ll/֡ۗ;->᩸:I

    .line 88
    iget v1, p0, Ll/֡ۗ;->ۤ:I

    if-ne p1, v1, :cond_1

    .line 52
    array-length p1, v0

    sub-int v2, p1, v1

    shl-int/lit8 v3, p1, 0x1

    if-ltz v3, :cond_0

    .line 58
    new-array v4, v3, [I

    const/4 v5, 0x0

    .line 59
    invoke-static {v5, v1, v0, v4, p1}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 60
    iget-object v0, p0, Ll/֡ۗ;->᩷:[I

    iget v1, p0, Ll/֡ۗ;->ۤ:I

    invoke-static {v2, v5, v0, v4, v1}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 61
    iput-object v4, p0, Ll/֡ۗ;->᩷:[I

    .line 62
    iput v5, p0, Ll/֡ۗ;->ۤ:I

    .line 63
    iput p1, p0, Ll/֡ۗ;->᩸:I

    add-int/lit8 v3, v3, -0x1

    .line 64
    iput v3, p0, Ll/֡ۗ;->ۙ:I

    return-void

    .line 56
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Max array capacity exceeded"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method public final ۤ()I
    .locals 3

    .line 100
    iget v0, p0, Ll/֡ۗ;->ۤ:I

    iget v1, p0, Ll/֡ۗ;->᩸:I

    if-eq v0, v1, :cond_0

    .line 101
    iget-object v1, p0, Ll/֡ۗ;->᩷:[I

    aget v1, v1, v0

    add-int/lit8 v0, v0, 0x1

    .line 102
    iget v2, p0, Ll/֡ۗ;->ۙ:I

    and-int/2addr v0, v2

    iput v0, p0, Ll/֡ۗ;->ۤ:I

    return v1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public final ᩷()Z
    .locals 2

    .line 211
    iget v0, p0, Ll/֡ۗ;->ۤ:I

    iget v1, p0, Ll/֡ۗ;->᩸:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
