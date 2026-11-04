.class public final Ll/۠ۙܳ;
.super Ljava/lang/Object;
.source "FIQP"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ܰ:I

.field public final synthetic ᩶:Ll/۬ۙܳ;


# direct methods
.method public constructor <init>(Ll/۬ۙܳ;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۠ۙܳ;->᩶:Ll/۬ۙܳ;

    .line 68
    iget-object p1, p1, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p1, Ll/ۙ۬ᩴ;->ۤ:I

    :goto_0
    iput p1, p0, Ll/۠ۙܳ;->ܰ:I

    return-void
.end method


# virtual methods
.method public final get(I)Ll/ۡۙܳ;
    .locals 10

    .line 69
    iget-object v0, p0, Ll/۠ۙܳ;->᩶:Ll/۬ۙܳ;

    iget-object v0, v0, Ll/۬ۙܳ;->ܳ:Ll/ۙ۬ᩴ;

    if-ltz p1, :cond_2

    .line 173
    iget v1, v0, Ll/ۙ۬ᩴ;->ۤ:I

    if-ge p1, v1, :cond_3

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-wide v7, v1

    .line 176
    :goto_0
    iget-object v1, v0, Ll/ۙ۬ᩴ;->۫:Ll/ۙ۬ᩴ;

    if-eqz v1, :cond_1

    .line 177
    iget v2, v1, Ll/ۙ۬ᩴ;->ۤ:I

    if-ge p1, v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    .line 180
    iget v2, v1, Ll/ۙ۬ᩴ;->ۧ:I

    add-int/2addr v3, v2

    iget v2, v1, Ll/ۙ۬ᩴ;->ܽ:I

    add-int/2addr v4, v2

    iget-wide v1, v1, Ll/ۙ۬ᩴ;->᩻:J

    add-long/2addr v7, v1

    .line 181
    iget-object v0, v0, Ll/ۙ۬ᩴ;->ܶ:Ll/ۙ۬ᩴ;

    goto :goto_0

    .line 184
    :cond_1
    new-instance p1, Ll/ۡۙܳ;

    iget v2, v0, Ll/ۙ۬ᩴ;->֫:I

    iget v5, v0, Ll/ۙ۬ᩴ;->ۧ:I

    iget v6, v0, Ll/ۙ۬ᩴ;->ܽ:I

    iget v9, v0, Ll/ۙ۬ᩴ;->ܳ:I

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Ll/ۡۙܳ;-><init>(IIIIIJI)V

    return-object p1

    .line 69
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 71
    new-instance v0, Ll/ۖۙܳ;

    invoke-direct {v0, p0}, Ll/ۖۙܳ;-><init>(Ll/۠ۙܳ;)V

    return-object v0
.end method
