.class public final Ll/۫᩺ܽ;
.super Ljava/lang/Object;
.source "26GL"

# interfaces
.implements Ll/ۙܰܽ;


# static fields
.field public static final ֫:Ll/ܽۨܽ;

.field public static final ۙ:Ll/ܽۨܽ;

.field public static final ۚ:Ll/ܽۨܽ;

.field public static final ۤ:Ll/ܶۨܽ;

.field public static final ۧ:Ll/ܽۨܽ;

.field public static final ۫:Ll/ܽۨܽ;

.field public static final ܳ:Ll/ܽۨܽ;

.field public static final ᩴ:Ll/ܽۨܽ;

.field public static final ᩷:Ll/ܽۨܽ;

.field public static final ᩸:Ll/ܽۨܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 51
    new-instance v0, Ll/۠ۛܽ;

    const-string v1, "seconds"

    const-string v2, "nanos"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v3

    .line 52
    invoke-direct {v0, v3}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 51
    sput-object v0, Ll/۫᩺ܽ;->ۙ:Ll/ܽۨܽ;

    .line 65
    new-instance v0, Ll/ۜۛܽ;

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 66
    invoke-direct {v0, v1}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 65
    sput-object v0, Ll/۫᩺ܽ;->᩷:Ll/ܽۨܽ;

    .line 79
    new-instance v0, Ll/۬ۛܽ;

    const-string v1, "year"

    const-string v2, "month"

    const-string v3, "day"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    .line 80
    invoke-direct {v0, v4}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 79
    sput-object v0, Ll/۫᩺ܽ;->᩸:Ll/ܽۨܽ;

    .line 94
    new-instance v0, Ll/ۙ᩺ܽ;

    const-string v4, "second"

    const-string v5, "nano"

    const-string v6, "hour"

    const-string v7, "minute"

    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    .line 95
    invoke-direct {v0, v4}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 94
    sput-object v0, Ll/۫᩺ܽ;->ᩴ:Ll/ܽۨܽ;

    .line 153
    new-instance v0, Ll/ۤ᩺ܽ;

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v3

    .line 154
    invoke-direct {v0, v3}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 153
    sput-object v0, Ll/۫᩺ܽ;->ܳ:Ll/ܽۨܽ;

    .line 248
    new-instance v0, Ll/ܳ᩺ܽ;

    const-string v3, "months"

    const-string v4, "days"

    const-string v5, "years"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    .line 249
    invoke-direct {v0, v3}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 248
    sput-object v0, Ll/۫᩺ܽ;->۫:Ll/ܽۨܽ;

    .line 261
    new-instance v0, Ll/ᩳۛܽ;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    .line 262
    invoke-direct {v0, v3}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 261
    sput-object v0, Ll/۫᩺ܽ;->ۚ:Ll/ܽۨܽ;

    .line 274
    new-instance v0, Ll/ۢۛܽ;

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 275
    invoke-direct {v0, v1}, Ll/ۤܰܽ;-><init>([Ljava/lang/String;)V

    .line 274
    sput-object v0, Ll/۫᩺ܽ;->֫:Ll/ܽۨܽ;

    .line 292
    new-instance v0, Ll/֨ۛܽ;

    invoke-direct {v0}, Ll/֨ۛܽ;-><init>()V

    .line 338
    invoke-virtual {v0}, Ll/ܽۨܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object v0

    sput-object v0, Ll/۫᩺ܽ;->ۧ:Ll/ܽۨܽ;

    .line 393
    new-instance v0, Ll/ۖۛܽ;

    invoke-direct {v0}, Ll/ۖۛܽ;-><init>()V

    sput-object v0, Ll/۫᩺ܽ;->ۤ:Ll/ܶۨܽ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۙ()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->ۙ:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static ۙ(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;
    .locals 3

    .line 341
    invoke-static {p0}, Ll/۫᩺ܽ;->᩸(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;

    move-result-object v0

    .line 342
    const-class v1, Ll/ۤ᩸ۗ;

    .line 408
    invoke-static {v1}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object v1

    .line 343
    const-class v2, Ll/᩷᩸ۗ;

    .line 408
    invoke-static {v2}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v2

    invoke-virtual {p0, v2}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p0

    .line 344
    new-instance v2, Ll/ۡۛܽ;

    invoke-direct {v2, v0, v1, p0}, Ll/ۡۛܽ;-><init>(Ll/ܽۨܽ;Ll/ܽۨܽ;Ll/ܽۨܽ;)V

    .line 390
    invoke-virtual {v2}, Ll/ܽۨܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/io/Serializable;Ljava/lang/String;Ll/ۘܰܽ;)V
    .locals 2

    if-eqz p0, :cond_0

    return-void

    .line 444
    :cond_0
    new-instance p0, Ll/ۜ᩵ܽ;

    const-string v0, "Missing "

    const-string v1, " field; at path "

    .line 0
    invoke-static {v0, p1, v1}, Ll/᩸ۨۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 445
    invoke-virtual {p2}, Ll/ۘܰܽ;->ܽ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 42
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 445
    throw p0
.end method

.method public static synthetic ۚ()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->ۚ:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static synthetic ۤ()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->ۧ:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static ۤ(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;
    .locals 2

    .line 167
    invoke-static {p0}, Ll/۫᩺ܽ;->᩸(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;

    move-result-object v0

    .line 168
    const-class v1, Ll/ۤ᩸ۗ;

    .line 408
    invoke-static {v1}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p0

    .line 169
    new-instance v1, Ll/᩸᩺ܽ;

    invoke-direct {v1, v0, p0}, Ll/᩸᩺ܽ;-><init>(Ll/ܽۨܽ;Ll/ܽۨܽ;)V

    .line 204
    invoke-virtual {v1}, Ll/ܽۨܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۫()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->۫:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static synthetic ܳ()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->ܳ:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static synthetic ᩴ()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->᩸:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static synthetic ᩷()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->֫:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static synthetic ᩷(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;
    .locals 0

    .line 44
    invoke-static {p0}, Ll/۫᩺ܽ;->᩸(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩸()Ll/ܽۨܽ;
    .locals 1

    .line 44
    sget-object v0, Ll/۫᩺ܽ;->᩷:Ll/ܽۨܽ;

    return-object v0
.end method

.method public static ᩸(Ll/᩺᩵ܽ;)Ll/ܽۨܽ;
    .locals 2

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    const-class v0, Ll/۟ۤۗ;

    invoke-static {v0}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object v0

    .line 115
    const-class v1, Ll/ۢۤۗ;

    .line 408
    invoke-static {v1}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p0

    .line 116
    new-instance v1, Ll/᩷᩺ܽ;

    invoke-direct {v1, v0, p0}, Ll/᩷᩺ܽ;-><init>(Ll/ܽۨܽ;Ll/ܽۨܽ;)V

    .line 150
    invoke-virtual {v1}, Ll/ܽۨܽ;->ۙ()Ll/ܽۨܽ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final get()Ll/ܶۨܽ;
    .locals 1

    .line 48
    sget-object v0, Ll/۫᩺ܽ;->ۤ:Ll/ܶۨܽ;

    return-object v0
.end method
