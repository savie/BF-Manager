.class public final Ll/ۛۢۚ;
.super Ljava/lang/Object;
.source "Y6JG"

# interfaces
.implements Ll/ۨ۠ۚ;


# instance fields
.field public ۙ:I

.field public final synthetic ۤ:Ll/ۨ۠ۚ;

.field public final synthetic ᩷:J


# direct methods
.method public constructor <init>(JLl/ۨ۠ۚ;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۛۢۚ;->᩷:J

    iput-object p3, p0, Ll/ۛۢۚ;->ۤ:Ll/ۨ۠ۚ;

    return-void
.end method


# virtual methods
.method public final ۙ(J[BII)I
    .locals 7

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    int-to-long v0, p5

    .line 58
    iget-wide v2, p0, Ll/ۛۢۚ;->᩷:J

    sub-long/2addr v2, p1

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    const/high16 v0, 0x1000000

    iget v1, p0, Ll/ۛۢۚ;->ۙ:I

    sub-int/2addr v0, v1

    if-gt p5, v0, :cond_1

    .line 60
    iget-object v1, p0, Ll/ۛۢۚ;->ۤ:Ll/ۨ۠ۚ;

    move-wide v2, p1

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Ll/ۨ۠ۚ;->ۙ(J[BII)I

    move-result p1

    if-lez p1, :cond_0

    .line 61
    iget p2, p0, Ll/ۛۢۚ;->ۙ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۛۢۚ;->ۙ:I

    :cond_0
    return p1

    .line 59
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Audio metadata exceeds source boundary or read limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
