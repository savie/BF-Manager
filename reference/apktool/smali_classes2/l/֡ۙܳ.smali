.class public final Ll/֡ۙܳ;
.super Ljava/lang/Object;
.source "FIQP"


# instance fields
.field public ֫:[I

.field public ۙ:Z

.field public final ۚ:[I

.field public ۤ:I

.field public ۫:[J

.field public ܳ:[J

.field public ᩴ:I

.field public ᩷:I

.field public ᩸:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    new-array v0, v0, [I

    .line 283
    iput-object v0, p0, Ll/֡ۙܳ;->ۚ:[I

    return-void
.end method


# virtual methods
.method public final ۙ(IIII)V
    .locals 0

    .line 296
    iput p1, p0, Ll/֡ۙܳ;->᩷:I

    iput p3, p0, Ll/֡ۙܳ;->᩸:I

    add-int/2addr p1, p2

    .line 297
    iput p1, p0, Ll/֡ۙܳ;->ۤ:I

    add-int/2addr p3, p4

    iput p3, p0, Ll/֡ۙܳ;->ᩴ:I

    return-void
.end method

.method public final ᩷(IIII)Z
    .locals 3

    .line 290
    iget v0, p0, Ll/֡ۙܳ;->᩷:I

    if-lt p1, v0, :cond_0

    iget v1, p0, Ll/֡ۙܳ;->᩸:I

    if-lt p3, v1, :cond_0

    sub-int v0, p1, v0

    rem-int/lit8 v0, v0, 0x20

    if-nez v0, :cond_0

    int-to-long v0, p1

    int-to-long p1, p2

    add-long/2addr v0, p1

    iget p1, p0, Ll/֡ۙܳ;->ۤ:I

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    int-to-long p1, p3

    int-to-long p3, p4

    add-long/2addr p1, p3

    iget p3, p0, Ll/֡ۙܳ;->ᩴ:I

    int-to-long p3, p3

    cmp-long v0, p1, p3

    if-gtz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
