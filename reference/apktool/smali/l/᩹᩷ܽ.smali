.class public final Ll/᩹᩷ܽ;
.super Ljava/lang/Object;
.source "33QT"


# static fields
.field public static final ۗ:Ll/ܳ᩷ܽ;

.field public static final ᩹:Ll/ۜۙܽ;


# instance fields
.field public ֫:Ll/ۜۙܽ;

.field public ۙ:I

.field public ۚ:Ll/ۗ᩸ܽ;

.field public ۤ:J

.field public ۧ:Z

.field public ۫:J

.field public ܳ:J

.field public ܶ:Ll/ۨ᩸ܽ;

.field public ܺ:Ll/۫ۙܽ;

.field public ܽ:Ll/ۘۤܽ;

.field public ᩴ:Ll/ۘۤܽ;

.field public ᩷:J

.field public ᩸:Ll/۫ۙܽ;

.field public ᩻:Ll/ܳ᩷ܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 207
    new-instance v0, Ll/ۧ᩷ܽ;

    .line 209
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 208
    invoke-static {v0}, Ll/ۤ᩷ܽ;->ۙ(Ljava/lang/Object;)Ll/ۜۙܽ;

    move-result-object v0

    sput-object v0, Ll/᩹᩷ܽ;->᩹:Ll/ۜۙܽ;

    .line 270
    new-instance v0, Ll/᩻᩷ܽ;

    invoke-direct {v0}, Ll/᩻᩷ܽ;-><init>()V

    sput-object v0, Ll/᩹᩷ܽ;->ۗ:Ll/ܳ᩷ܽ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 313
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 285
    iput-boolean v0, p0, Ll/᩹᩷ܽ;->ۧ:Z

    const/4 v0, -0x1

    .line 288
    iput v0, p0, Ll/᩹᩷ܽ;->ۙ:I

    const-wide/16 v0, -0x1

    .line 289
    iput-wide v0, p0, Ll/᩹᩷ܽ;->ܳ:J

    .line 290
    iput-wide v0, p0, Ll/᩹᩷ܽ;->۫:J

    .line 296
    iput-wide v0, p0, Ll/᩹᩷ܽ;->ۤ:J

    .line 299
    iput-wide v0, p0, Ll/᩹᩷ܽ;->᩷:J

    .line 311
    sget-object v0, Ll/᩹᩷ܽ;->᩹:Ll/ۜۙܽ;

    iput-object v0, p0, Ll/᩹᩷ܽ;->֫:Ll/ۜۙܽ;

    return-void
.end method

.method private ۤ()V
    .locals 6

    .line 1074
    iget-object v0, p0, Ll/᩹᩷ܽ;->ܶ:Ll/ۨ᩸ܽ;

    const/4 v1, 0x0

    const-wide/16 v2, -0x1

    if-nez v0, :cond_1

    .line 1075
    iget-wide v4, p0, Ll/᩹᩷ܽ;->۫:J

    cmp-long v0, v4, v2

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    const-string v0, "maximumWeight requires weigher"

    invoke-static {v0, v1}, Ll/ۨۙܽ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 1077
    :cond_1
    iget-boolean v0, p0, Ll/᩹᩷ܽ;->ۧ:Z

    if-eqz v0, :cond_3

    .line 1078
    iget-wide v4, p0, Ll/᩹᩷ܽ;->۫:J

    cmp-long v0, v4, v2

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    const-string v0, "weigher requires maximumWeight"

    invoke-static {v0, v1}, Ll/ۨۙܽ;->᩷(Ljava/lang/String;Z)V

    return-void

    .line 1080
    :cond_3
    iget-wide v0, p0, Ll/᩹᩷ܽ;->۫:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    .line 1081
    sget-object v0, Ll/ܺ᩷ܽ;->ۙ:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "ignoring weigher specified without maximumWeight"

    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static ᩸()Ll/᩹᩷ܽ;
    .locals 1

    .line 323
    new-instance v0, Ll/᩹᩷ܽ;

    invoke-direct {v0}, Ll/᩹᩷ܽ;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1094
    invoke-static {p0}, Ll/᩵ۙܽ;->ۙ(Ljava/lang/Object;)Ll/ۗۙܽ;

    move-result-object v0

    .line 1098
    iget v1, p0, Ll/᩹᩷ܽ;->ۙ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, "concurrencyLevel"

    .line 1099
    invoke-virtual {v0, v2, v1}, Ll/ۗۙܽ;->ۙ(Ljava/lang/String;I)V

    .line 1101
    :cond_0
    iget-wide v1, p0, Ll/᩹᩷ܽ;->ܳ:J

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    const-string v5, "maximumSize"

    .line 1102
    invoke-virtual {v0, v1, v2, v5}, Ll/ۗۙܽ;->ۙ(JLjava/lang/String;)V

    .line 1104
    :cond_1
    iget-wide v1, p0, Ll/᩹᩷ܽ;->۫:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    const-string v5, "maximumWeight"

    .line 1105
    invoke-virtual {v0, v1, v2, v5}, Ll/ۗۙܽ;->ۙ(JLjava/lang/String;)V

    .line 1107
    :cond_2
    iget-wide v1, p0, Ll/᩹᩷ܽ;->ۤ:J

    const-string v5, "ns"

    cmp-long v6, v1, v3

    if-eqz v6, :cond_3

    .line 1108
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v6, p0, Ll/᩹᩷ܽ;->ۤ:J

    .line 0
    invoke-static {v1, v6, v7, v5}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "expireAfterWrite"

    .line 1108
    invoke-virtual {v0, v1, v2}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1110
    :cond_3
    iget-wide v1, p0, Ll/᩹᩷ܽ;->᩷:J

    cmp-long v6, v1, v3

    if-eqz v6, :cond_4

    .line 1111
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v2, p0, Ll/᩹᩷ܽ;->᩷:J

    .line 0
    invoke-static {v1, v2, v3, v5}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "expireAfterAccess"

    .line 1111
    invoke-virtual {v0, v1, v2}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1113
    :cond_4
    iget-object v1, p0, Ll/᩹᩷ܽ;->ᩴ:Ll/ۘۤܽ;

    if-eqz v1, :cond_5

    .line 1114
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۟۬ܺ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "keyStrength"

    invoke-virtual {v0, v1, v2}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1116
    :cond_5
    iget-object v1, p0, Ll/᩹᩷ܽ;->ܽ:Ll/ۘۤܽ;

    if-eqz v1, :cond_6

    .line 1117
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/۟۬ܺ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "valueStrength"

    invoke-virtual {v0, v1, v2}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1119
    :cond_6
    iget-object v1, p0, Ll/᩹᩷ܽ;->᩸:Ll/۫ۙܽ;

    if-eqz v1, :cond_7

    const-string v1, "keyEquivalence"

    .line 1120
    invoke-virtual {v0, v1}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;)V

    .line 1122
    :cond_7
    iget-object v1, p0, Ll/᩹᩷ܽ;->ܺ:Ll/۫ۙܽ;

    if-eqz v1, :cond_8

    const-string v1, "valueEquivalence"

    .line 1123
    invoke-virtual {v0, v1}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;)V

    .line 1125
    :cond_8
    iget-object v1, p0, Ll/᩹᩷ܽ;->ۚ:Ll/ۗ᩸ܽ;

    if-eqz v1, :cond_9

    const-string v1, "removalListener"

    .line 1126
    invoke-virtual {v0, v1}, Ll/ۗۙܽ;->ۙ(Ljava/lang/Object;)V

    .line 1128
    :cond_9
    invoke-virtual {v0}, Ll/ۗۙܽ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/֫᩷ܽ;
    .locals 1

    .line 1064
    invoke-direct {p0}, Ll/᩹᩷ܽ;->ۤ()V

    .line 1066
    new-instance v0, Ll/ܺۤܽ;

    invoke-direct {v0, p0}, Ll/ܺۤܽ;-><init>(Ll/᩹᩷ܽ;)V

    return-object v0
.end method

.method public final ۙ(Ll/᩵᩷ܽ;)Ll/ۛ᩷ܽ;
    .locals 2

    .line 1047
    invoke-direct {p0}, Ll/᩹᩷ܽ;->ۤ()V

    .line 1048
    new-instance v0, Ll/ۧۤܽ;

    .line 4780
    new-instance v1, Ll/ۚ᩸ܽ;

    .line 957
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4780
    invoke-direct {v1, p0, p1}, Ll/ۚ᩸ܽ;-><init>(Ll/᩹᩷ܽ;Ll/᩵᩷ܽ;)V

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, Ll/ܺۤܽ;-><init>(Ll/ۚ᩸ܽ;I)V

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 4

    .line 464
    iget v0, p0, Ll/᩹᩷ܽ;->ۙ:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    if-lez p1, :cond_1

    const/4 v2, 0x1

    .line 468
    :cond_1
    invoke-static {v2}, Ll/ۨۙܽ;->ۙ(Z)V

    .line 469
    iput p1, p0, Ll/᩹᩷ܽ;->ۙ:I

    return-void

    .line 598
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    const-string v0, "concurrency level was already set to %s"

    invoke-static {v0, v1}, Ll/۠ۙܽ;->ۙ(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(J)V
    .locals 7

    .line 500
    iget-wide v0, p0, Ll/᩹᩷ܽ;->ܳ:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v6, "maximum size was already set to %s"

    invoke-static {v0, v1, v6, v5}, Ll/ۨۙܽ;->᩷(JLjava/lang/String;Z)V

    .line 502
    iget-wide v0, p0, Ll/᩹᩷ܽ;->۫:J

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v4, "maximum weight was already set to %s"

    invoke-static {v0, v1, v4, v3}, Ll/ۨۙܽ;->᩷(JLjava/lang/String;Z)V

    .line 506
    iget-object v0, p0, Ll/᩹᩷ܽ;->ܶ:Ll/ۨ᩸ܽ;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const-string v1, "maximum size can not be combined with weigher"

    invoke-static {v1, v0}, Ll/ۨۙܽ;->᩷(Ljava/lang/String;Z)V

    const-wide/16 v0, 0x0

    cmp-long v3, p1, v0

    if-ltz v3, :cond_3

    const/4 v2, 0x1

    :cond_3
    const-string v0, "maximum size must not be negative"

    .line 507
    invoke-static {v0, v2}, Ll/ۨۙܽ;->ۙ(Ljava/lang/String;Z)V

    .line 508
    iput-wide p1, p0, Ll/᩹᩷ܽ;->ܳ:J

    return-void
.end method

.method public final ۙ(Ll/ۨ᩸ܽ;)V
    .locals 6

    .line 588
    iget-object v0, p0, Ll/᩹᩷ܽ;->ܶ:Ll/ۨ᩸ܽ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/ۨۙܽ;->᩷(Z)V

    .line 589
    iget-boolean v0, p0, Ll/᩹᩷ܽ;->ۧ:Z

    if-eqz v0, :cond_2

    .line 590
    iget-wide v2, p0, Ll/᩹᩷ܽ;->ܳ:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    const-string v0, "weigher can not be combined with maximum size (%s provided)"

    invoke-static {v2, v3, v0, v1}, Ll/ۨۙܽ;->᩷(JLjava/lang/String;Z)V

    .line 957
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    iput-object p1, p0, Ll/᩹᩷ܽ;->ܶ:Ll/ۨ᩸ܽ;

    return-void
.end method

.method public final ᩷()V
    .locals 4

    .line 695
    sget-object v0, Ll/ۘۤܽ;->᩶:Ll/ۘۤܽ;

    .line 700
    iget-object v1, p0, Ll/᩹᩷ܽ;->ܽ:Ll/ۘۤܽ;

    if-nez v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const-string v3, "Value strength was already set to %s"

    invoke-static {v1, v3, v2}, Ll/ۨۙܽ;->᩷(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 957
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    iput-object v0, p0, Ll/᩹᩷ܽ;->ܽ:Ll/ۘۤܽ;

    return-void
.end method

.method public final ᩷(J)V
    .locals 7

    .line 543
    iget-wide v0, p0, Ll/᩹᩷ܽ;->۫:J

    const/4 v2, 0x0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v6, "maximum weight was already set to %s"

    invoke-static {v0, v1, v6, v5}, Ll/ۨۙܽ;->᩷(JLjava/lang/String;Z)V

    .line 547
    iget-wide v0, p0, Ll/᩹᩷ܽ;->ܳ:J

    cmp-long v5, v0, v3

    if-nez v5, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    const-string v4, "maximum size was already set to %s"

    invoke-static {v0, v1, v4, v3}, Ll/ۨۙܽ;->᩷(JLjava/lang/String;Z)V

    const-wide/16 v0, 0x0

    cmp-long v3, p1, v0

    if-ltz v3, :cond_2

    const/4 v2, 0x1

    :cond_2
    const-string v0, "maximum weight must not be negative"

    .line 549
    invoke-static {v0, v2}, Ll/ۨۙܽ;->ۙ(Ljava/lang/String;Z)V

    .line 550
    iput-wide p1, p0, Ll/᩹᩷ܽ;->۫:J

    return-void
.end method
