.class public final Ll/ۡ᩸ܳ;
.super Ljava/lang/Object;
.source "J57U"


# instance fields
.field public volatile ۙ:Z

.field public final ۤ:Ll/ᩳܳܳ;

.field public final synthetic ܳ:Ll/ۜ᩸ܳ;

.field public volatile ᩴ:Ll/ۢ᩸ܳ;

.field public volatile ᩷:J

.field public final ᩸:Ll/ۨ᩷ܳ;


# direct methods
.method public constructor <init>(Ll/ۜ᩸ܳ;Ll/ۨ᩷ܳ;Ll/ᩳܳܳ;)V
    .locals 0

    .line 498
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩸ܳ;->ܳ:Ll/ۜ᩸ܳ;

    .line 499
    iput-object p2, p0, Ll/ۡ᩸ܳ;->᩸:Ll/ۨ᩷ܳ;

    .line 500
    iput-object p3, p0, Ll/ۡ᩸ܳ;->ۤ:Ll/ᩳܳܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۡ᩸ܳ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۡ᩸ܳ;->᩷:J

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۡ᩸ܳ;Ll/ۢ᩸ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۡ᩸ܳ;->ᩴ:Ll/ۢ᩸ܳ;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۡ᩸ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۡ᩸ܳ;->ۙ:Z

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۡ᩸ܳ;)Ll/ۢ᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ᩸ܳ;->ᩴ:Ll/ۢ᩸ܳ;

    return-object p0
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 505
    iget-object v0, p0, Ll/ۡ᩸ܳ;->ᩴ:Ll/ۢ᩸ܳ;

    if-eqz v0, :cond_1

    .line 506
    iget-boolean v1, v0, Ll/ۢ᩸ܳ;->ۙ:Z

    if-nez v1, :cond_1

    iget-wide v1, v0, Ll/ۢ᩸ܳ;->᩷:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    iget-object v1, p0, Ll/ۡ᩸ܳ;->ܳ:Ll/ۜ᩸ܳ;

    iget-object v2, p0, Ll/ۡ᩸ܳ;->ۤ:Ll/ᩳܳܳ;

    .line 507
    invoke-static {v1, v2}, Ll/ۜ᩸ܳ;->ۙ(Ll/ۜ᩸ܳ;Ll/ᩳܳܳ;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ۡ᩸ܳ;->ۤ:Ll/ᩳܳܳ;

    .line 508
    invoke-virtual {v1}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ۡ᩸ܳ;->᩷:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    goto :goto_0

    .line 511
    :cond_0
    iget-object v1, p0, Ll/ۡ᩸ܳ;->᩸:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->ܶ()V

    .line 512
    iget-object v1, p0, Ll/ۡ᩸ܳ;->᩸:Ll/ۨ᩷ܳ;

    iget v0, v0, Ll/ۢ᩸ܳ;->ۤ:I

    .line 484
    iget-object v2, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    const/4 v3, 0x1

    .line 156
    invoke-virtual {v2, v0, v3}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 485
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 486
    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    .line 513
    iput-boolean v3, p0, Ll/ۡ᩸ܳ;->ۙ:Z

    :cond_1
    :goto_0
    return-void
.end method
