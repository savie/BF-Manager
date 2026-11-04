.class public final Ll/۬᩷ۚ;
.super Ljava/lang/Object;
.source "56BZ"


# instance fields
.field public final ֫:I

.field public final ۙ:Ljava/lang/String;

.field public final ۚ:Ljava/lang/String;

.field public final ۤ:J

.field public final ۧ:Ljava/lang/String;

.field public final ۫:Ll/ۙۤۚ;

.field public final ܳ:J

.field public final ܺ:J

.field public final ܽ:J

.field public final ᩴ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩸:J

.field public final ᩻:J


# direct methods
.method public constructor <init>(Ll/ۜ᩷ۚ;)V
    .locals 2

    .line 346
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 347
    iget-wide v0, p1, Ll/ۜ᩷ۚ;->۫:J

    iput-wide v0, p0, Ll/۬᩷ۚ;->᩸:J

    .line 348
    iget-wide v0, p1, Ll/ۜ᩷ۚ;->ۛ:J

    iput-wide v0, p0, Ll/۬᩷ۚ;->ܽ:J

    .line 349
    iget-wide v0, p1, Ll/ۜ᩷ۚ;->᩻:J

    iput-wide v0, p0, Ll/۬᩷ۚ;->ܳ:J

    .line 350
    iget-wide v0, p1, Ll/ۜ᩷ۚ;->ܳ:J

    iput-wide v0, p0, Ll/۬᩷ۚ;->ۤ:J

    .line 351
    iget-wide v0, p1, Ll/ۜ᩷ۚ;->᩵:J

    iput-wide v0, p0, Ll/۬᩷ۚ;->᩻:J

    .line 352
    iget-wide v0, p1, Ll/ۜ᩷ۚ;->ۨ:J

    iput-wide v0, p0, Ll/۬᩷ۚ;->ܺ:J

    .line 353
    iget-object v0, p1, Ll/ۜ᩷ۚ;->᩹:Ljava/lang/String;

    iput-object v0, p0, Ll/۬᩷ۚ;->ۧ:Ljava/lang/String;

    .line 354
    iget v0, p1, Ll/ۜ᩷ۚ;->ܶ:I

    iput v0, p0, Ll/۬᩷ۚ;->֫:I

    .line 355
    iget-object v0, p1, Ll/ۜ᩷ۚ;->ۙ:Ljava/lang/String;

    iput-object v0, p0, Ll/۬᩷ۚ;->ۙ:Ljava/lang/String;

    .line 356
    iget-object v0, p1, Ll/ۜ᩷ۚ;->ܽ:Ljava/lang/String;

    iget v1, p1, Ll/ۜ᩷ۚ;->ۤ:I

    invoke-static {v1, v0}, Ll/ۜᩴۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/۬᩷ۚ;->ۚ:Ljava/lang/String;

    .line 357
    iget-object v0, p1, Ll/ۜ᩷ۚ;->᩷:Ljava/lang/String;

    iput-object v0, p0, Ll/۬᩷ۚ;->᩷:Ljava/lang/String;

    .line 358
    iget-object v0, p1, Ll/ۜ᩷ۚ;->ۧ:Ljava/lang/String;

    iput-object v0, p0, Ll/۬᩷ۚ;->ᩴ:Ljava/lang/String;

    .line 359
    iget-object p1, p1, Ll/ۜ᩷ۚ;->ܺ:Ll/ۙۤۚ;

    iput-object p1, p0, Ll/۬᩷ۚ;->۫:Ll/ۙۤۚ;

    return-void
.end method

.method public static ۙ(Ll/۬᩷ۚ;)I
    .locals 2

    .line 379
    iget-object v0, p0, Ll/۬᩷ۚ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Ll/۬᩷ۚ;->ۙ:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    iget-object v1, p0, Ll/۬᩷ۚ;->ۚ:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Ll/۬᩷ۚ;->᩷:Ljava/lang/String;

    .line 380
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v1

    iget-object p0, p0, Ll/۬᩷ۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    add-int/2addr p0, v0

    mul-int/lit8 p0, p0, 0x2

    return p0
.end method


# virtual methods
.method public final ۙ(J)J
    .locals 4

    .line 371
    iget-object v0, p0, Ll/۬᩷ۚ;->۫:Ll/ۙۤۚ;

    sget-object v1, Ll/ۙۤۚ;->۟:Ll/ۙۤۚ;

    const-wide/16 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Ll/۬᩷ۚ;->ܺ:J

    sub-long/2addr p1, v0

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    :cond_0
    iget-wide p1, p0, Ll/۬᩷ۚ;->᩻:J

    add-long/2addr p1, v2

    return-wide p1
.end method

.method public final ۙ()Z
    .locals 2

    .line 363
    sget-object v0, Ll/ۙۤۚ;->ܿ:Ll/ۙۤۚ;

    iget-object v1, p0, Ll/۬᩷ۚ;->۫:Ll/ۙۤۚ;

    if-eq v1, v0, :cond_1

    sget-object v0, Ll/ۙۤۚ;->۟:Ll/ۙۤۚ;

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
