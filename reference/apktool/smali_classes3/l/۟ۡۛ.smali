.class public final Ll/۟ۡۛ;
.super Ljava/lang/Object;
.source "WIWC"


# instance fields
.field public ۙ:I

.field public ᩷:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput p1, p0, Ll/۟ۡۛ;->ۙ:I

    .line 56
    iput-wide p2, p0, Ll/۟ۡۛ;->᩷:J

    return-void
.end method

.method public constructor <init>(Ll/۟ۡۛ;)V
    .locals 3

    .line 65
    iget v0, p1, Ll/۟ۡۛ;->ۙ:I

    iget-wide v1, p1, Ll/۟ۡۛ;->᩷:J

    invoke-direct {p0, v0, v1, v2}, Ll/۟ۡۛ;-><init>(IJ)V

    return-void
.end method


# virtual methods
.method public final ۙ(I)[I
    .locals 2

    mul-int/lit8 v0, p1, 0x4

    add-int/lit8 v0, v0, 0x10

    if-ltz v0, :cond_0

    .line 77
    iget v1, p0, Ll/۟ۡۛ;->ۙ:I

    if-gt v0, v1, :cond_0

    sub-int/2addr v1, v0

    .line 80
    iput v1, p0, Ll/۟ۡۛ;->ۙ:I

    .line 81
    new-array p1, p1, [I

    return-object p1

    .line 78
    :cond_0
    new-instance p1, Ll/᩸ۖۛ;

    const-string v0, "Too many allocated bytes"

    .line 18
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 78
    throw p1
.end method

.method public final ᩷(I)V
    .locals 4

    int-to-long v0, p1

    .line 91
    iget-wide v2, p0, Ll/۟ۡۛ;->᩷:J

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    sub-long/2addr v2, v0

    .line 94
    iput-wide v2, p0, Ll/۟ۡۛ;->᩷:J

    return-void

    .line 92
    :cond_0
    new-instance p1, Ll/᩸ۖۛ;

    const-string v0, "Too many operations"

    .line 18
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 92
    throw p1
.end method
