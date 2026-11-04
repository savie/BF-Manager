.class public abstract Ll/۬᩵ۨ;
.super Ll/᩸ۨۨ;
.source "L2QA"


# instance fields
.field public ۚ:Z

.field public ۫:Ll/۬ܳܳ;

.field public ܳ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 61
    invoke-direct {p0}, Ll/۫᩵ۨ;-><init>()V

    const-wide/16 v0, -0x1

    .line 103
    iput-wide v0, p0, Ll/۬᩵ۨ;->ܳ:J

    .line 105
    invoke-static {}, Ll/۟᩵ۨ;->ۙ()Ll/۬ܳܳ;

    move-result-object v0

    iput-object v0, p0, Ll/۬᩵ۨ;->۫:Ll/۬ܳܳ;

    const/4 v0, 0x1

    .line 108
    iput-boolean v0, p0, Ll/۬᩵ۨ;->ۚ:Z

    return-void
.end method


# virtual methods
.method public ۙ(J)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 153
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/۬᩵ۨ;->ܳ:J

    return-void
.end method

.method public final ۧ()J
    .locals 2

    .line 115
    iget-wide v0, p0, Ll/۬᩵ۨ;->ܳ:J

    return-wide v0
.end method

.method public final ܺ()Z
    .locals 1

    .line 123
    iget-boolean v0, p0, Ll/۬᩵ۨ;->ۚ:Z

    return v0
.end method

.method public ܽ()V
    .locals 1

    const/4 v0, 0x0

    .line 188
    iput-boolean v0, p0, Ll/۬᩵ۨ;->ۚ:Z

    return-void
.end method

.method public final ᩻()Ll/۬ܳܳ;
    .locals 1

    .line 119
    iget-object v0, p0, Ll/۬᩵ۨ;->۫:Ll/۬ܳܳ;

    return-object v0
.end method
