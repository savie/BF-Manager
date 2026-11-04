.class public final Ll/᩻۫ۚ;
.super Ljava/lang/Object;
.source "N795"

# interfaces
.implements Ll/᩸ۧۤ;
.implements Ll/᩷۠ܶ;


# static fields
.field public static ܰ:Ljava/lang/String;

.field public static ܿ:J

.field public static ᩶:J


# direct methods
.method public static declared-synchronized ۙ(Ljava/lang/String;)J
    .locals 5

    .line 2
    const-class v0, Ll/᩻۫ۚ;

    .line 3
    monitor-enter v0

    .line 28
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 29
    monitor-exit v0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 31
    :cond_0
    :try_start_1
    sget-wide v1, Ll/᩻۫ۚ;->ܿ:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    sput-wide v1, Ll/᩻۫ۚ;->ܿ:J

    sput-wide v1, Ll/᩻۫ۚ;->᩶:J

    .line 32
    sput-object p0, Ll/᩻۫ۚ;->ܰ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static declared-synchronized ۙ()Ljava/lang/String;
    .locals 2

    .line 2
    const-class v0, Ll/᩻۫ۚ;

    .line 3
    monitor-enter v0

    .line 51
    :try_start_0
    sget-object v1, Ll/᩻۫ۚ;->ܰ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized ۙ(J)V
    .locals 6

    .line 2
    const-class v0, Ll/᩻۫ۚ;

    .line 3
    monitor-enter v0

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-eqz v3, :cond_0

    .line 40
    :try_start_0
    sget-wide v3, Ll/᩻۫ۚ;->᩶:J

    cmp-long v5, p0, v3

    if-nez v5, :cond_0

    const/4 p0, 0x0

    .line 41
    sput-object p0, Ll/᩻۫ۚ;->ܰ:Ljava/lang/String;

    .line 42
    sput-wide v1, Ll/᩻۫ۚ;->᩶:J

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 44
    :cond_0
    :goto_0
    monitor-exit v0

    return-void
.end method


# virtual methods
.method public ۙ(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;
    .locals 0

    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 40
    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    sub-float/2addr p3, p2

    mul-float p3, p3, p1

    add-float/2addr p3, p2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ll/ᩴܺۤ;)V
    .locals 5

    .line 15
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ֫ۤ;

    invoke-virtual {v0}, Ll/ܰ֫ۤ;->ۚ()I

    move-result v0

    .line 16
    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 18
    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    rem-int/lit8 v3, v3, 0x9

    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    if-ge v4, v0, :cond_0

    .line 20
    invoke-virtual {v1}, Ljava/util/Random;->nextInt()I

    move-result v3

    and-int/lit16 v3, v3, 0xff

    rem-int/lit8 v3, v3, 0xa

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Ll/ܰ֫ۤ;

    invoke-direct {v0}, Ll/ܰ֫ۤ;-><init>()V

    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰ֫ۤ;->ۙ(Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1, v0}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void
.end method
