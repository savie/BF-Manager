.class public final Ll/᩵ۤᩴ;
.super Ljava/lang/Object;
.source "16QU"


# instance fields
.field public final ֫:I

.field public final ۙ:Z

.field public final ۚ:I

.field public final ۤ:Ll/ۨۙᩴ;

.field public final ۧ:Z

.field public final ۫:I

.field public final ܳ:I

.field public final ᩴ:Z

.field public final ᩷:J

.field public final ᩸:J

.field public final ᩻:I


# direct methods
.method public constructor <init>(IIIZZZLl/ܰۤᩴ;Ll/ܽ᩷ᩴ;Ll/ܽ᩷ᩴ;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput p1, p0, Ll/᩵ۤᩴ;->ۚ:I

    iput p2, p0, Ll/᩵ۤᩴ;->֫:I

    iput p3, p0, Ll/᩵ۤᩴ;->᩻:I

    .line 21
    iput-boolean p4, p0, Ll/᩵ۤᩴ;->ۧ:Z

    iput-boolean p5, p0, Ll/᩵ۤᩴ;->ۙ:Z

    iput-boolean p6, p0, Ll/᩵ۤᩴ;->ᩴ:Z

    .line 22
    iget p1, p7, Ll/ܰۤᩴ;->ܰ᩷:I

    iput p1, p0, Ll/᩵ۤᩴ;->۫:I

    iget p1, p7, Ll/ܰۤᩴ;->ۘ᩷:I

    iput p1, p0, Ll/᩵ۤᩴ;->ܳ:I

    .line 23
    invoke-static {p7}, Ll/ۨۙᩴ;->᩷(Ll/ܰۤᩴ;)Ll/ۨۙᩴ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۤᩴ;->ۤ:Ll/ۨۙᩴ;

    .line 24
    invoke-virtual {p8}, Ll/ܽ᩷ᩴ;->ᩴ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩵ۤᩴ;->᩷:J

    invoke-virtual {p9}, Ll/ܽ᩷ᩴ;->ᩴ()J

    move-result-wide p1

    iput-wide p1, p0, Ll/᩵ۤᩴ;->᩸:J

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/᩵ۤᩴ;)Z
    .locals 5

    if-eqz p1, :cond_0

    .line 29
    iget v0, p0, Ll/᩵ۤᩴ;->ۚ:I

    iget v1, p1, Ll/᩵ۤᩴ;->ۚ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ۤᩴ;->֫:I

    iget v1, p1, Ll/᩵ۤᩴ;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ۤᩴ;->᩻:I

    iget v1, p1, Ll/᩵ۤᩴ;->᩻:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ۤᩴ;->۫:I

    iget v1, p1, Ll/᩵ۤᩴ;->۫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/᩵ۤᩴ;->ܳ:I

    iget v1, p1, Ll/᩵ۤᩴ;->ܳ:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩵ۤᩴ;->ۧ:Z

    iget-boolean v1, p1, Ll/᩵ۤᩴ;->ۧ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩵ۤᩴ;->ۙ:Z

    iget-boolean v1, p1, Ll/᩵ۤᩴ;->ۙ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/᩵ۤᩴ;->ᩴ:Z

    iget-boolean v1, p1, Ll/᩵ۤᩴ;->ᩴ:Z

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/᩵ۤᩴ;->᩷:J

    iget-wide v2, p1, Ll/᩵ۤᩴ;->᩷:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-wide v0, p0, Ll/᩵ۤᩴ;->᩸:J

    iget-wide v2, p1, Ll/᩵ۤᩴ;->᩸:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    iget-object v0, p0, Ll/᩵ۤᩴ;->ۤ:Ll/ۨۙᩴ;

    iget-object p1, p1, Ll/᩵ۤᩴ;->ۤ:Ll/ۨۙᩴ;

    .line 32
    invoke-virtual {v0, p1}, Ll/ۨۙᩴ;->ۙ(Ll/ۨۙᩴ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
