.class public final Ll/᩻ܰ᩸;
.super Ljava/lang/Object;
.source "3B3L"


# instance fields
.field public ֫:Ll/ᩳ۬᩸;

.field public ۙ:Ll/ۚܰ᩸;

.field public final ۚ:Ll/᩸᩶᩸;

.field public final ۤ:Ll/᩹ܽ᩵;

.field public final ۧ:Ljava/lang/String;

.field public ۫:Ll/֨ۗ᩸;

.field public final ܳ:Ll/ۧܶ᩸;

.field public final ܶ:Ll/᩺ۜ᩸;

.field public final ܺ:Ll/ۖۗ᩸;

.field public final synthetic ܽ:Ll/۟ܰ᩸;

.field public final ᩴ:Ll/֫ܰ᩸;

.field public ᩷:Ll/᩹ܽ᩵;

.field public ᩸:Ll/᩹ܽ᩵;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/۟ܰ᩸;Ll/᩸᩶᩸;)V
    .locals 4

    .line 2432
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܰ᩸;->ܽ:Ll/۟ܰ᩸;

    .line 2418
    iget-object v0, p1, Ll/۟ܰ᩸;->۠:Ll/᩺ۜ᩸;

    iput-object v0, p0, Ll/᩻ܰ᩸;->ܶ:Ll/᩺ۜ᩸;

    .line 2419
    iget-object v1, p1, Ll/ۜܽ᩸;->᩶:Ll/ۧܶ᩸;

    iput-object v1, p0, Ll/᩻ܰ᩸;->ܳ:Ll/ۧܶ᩸;

    .line 2420
    invoke-virtual {p1}, Ll/ۜܽ᩸;->ۤ()Ll/ۡܰ᩸;

    move-result-object v2

    .line 63
    iget-object v2, v2, Ll/ۡܰ᩸;->ۙ:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    .line 2420
    iput-object v2, p0, Ll/᩻ܰ᩸;->ۧ:Ljava/lang/String;

    .line 2422
    new-instance v2, Ll/᩹ܽ᩵;

    invoke-direct {v2}, Ll/᩹ܽ᩵;-><init>()V

    iput-object v2, p0, Ll/᩻ܰ᩸;->ۤ:Ll/᩹ܽ᩵;

    .line 2423
    new-instance v2, Ll/ۖۗ᩸;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Ll/ۖۗ᩸;-><init>(ILjava/lang/Object;)V

    iput-object v2, p0, Ll/᩻ܰ᩸;->ܺ:Ll/ۖۗ᩸;

    .line 2424
    new-instance v2, Ll/֫ܰ᩸;

    invoke-direct {v2, p0}, Ll/֫ܰ᩸;-><init>(Ll/᩻ܰ᩸;)V

    iput-object v2, p0, Ll/᩻ܰ᩸;->ᩴ:Ll/֫ܰ᩸;

    .line 2433
    iput-object p2, p0, Ll/᩻ܰ᩸;->ۚ:Ll/᩸᩶᩸;

    .line 2434
    invoke-static {p1}, Ll/۟ܰ᩸;->᩹(Ll/۟ܰ᩸;)Ll/ۨ᩹᩸;

    move-result-object p2

    const/4 v2, 0x0

    if-nez p2, :cond_2

    invoke-static {p1}, Ll/۟ܰ᩸;->ۧ(Ll/۟ܰ᩸;)Ll/᩵ܰ᩸;

    move-result-object p1

    if-nez p1, :cond_2

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۧܶ᩸;->᩸()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    goto :goto_0

    .line 2435
    :cond_1
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v2

    :cond_2
    :goto_0
    iput-object v2, p0, Ll/᩻ܰ᩸;->֫:Ll/ᩳ۬᩸;

    return-void
.end method


# virtual methods
.method public final ۙ()V
    .locals 2

    .line 2511
    iget-object v0, p0, Ll/᩻ܰ᩸;->᩷:Ll/᩹ܽ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->cancel(Z)Z

    .line 2512
    :cond_0
    iget-object v0, p0, Ll/᩻ܰ᩸;->᩸:Ll/᩹ܽ᩵;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ll/᩹ܽ᩵;->cancel(Z)Z

    .line 2513
    :cond_1
    iget-object v0, p0, Ll/᩻ܰ᩸;->ܶ:Ll/᩺ۜ᩸;

    if-eqz v0, :cond_2

    iget-object v1, p0, Ll/᩻ܰ᩸;->ܺ:Ll/ۖۗ᩸;

    invoke-virtual {v0, v1}, Ll/᩺ۜ᩸;->᩷(Ll/ۖۗ᩸;)V

    .line 2514
    :cond_2
    iget-object v0, p0, Ll/᩻ܰ᩸;->ܳ:Ll/ۧܶ᩸;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ll/᩻ܰ᩸;->ᩴ:Ll/֫ܰ᩸;

    invoke-virtual {v0, v1}, Ll/ۧܶ᩸;->᩷(Ll/֫ܰ᩸;)V

    .line 2515
    :cond_3
    iget-object v0, p0, Ll/᩻ܰ᩸;->ܽ:Ll/۟ܰ᩸;

    invoke-static {v0}, Ll/۟ܰ᩸;->᩸(Ll/۟ܰ᩸;)Ll/᩻ܰ᩸;

    move-result-object v1

    if-ne v1, p0, :cond_4

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/۟ܰ᩸;->ۙ(Ll/۟ܰ᩸;Ll/᩻ܰ᩸;)V

    :cond_4
    return-void
.end method

.method public final ۙ(Ljava/lang/Throwable;)V
    .locals 2

    .line 2504
    iget-object v0, p0, Ll/᩻ܰ᩸;->ۤ:Ll/᩹ܽ᩵;

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->isDone()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 2505
    :cond_0
    invoke-virtual {p0}, Ll/᩻ܰ᩸;->ۙ()V

    .line 2506
    invoke-virtual {v0, p1}, Ll/᩹ܽ᩵;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ᩷()V
    .locals 1

    .line 2450
    iget-boolean v0, p0, Ll/᩻ܰ᩸;->᩻:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻ܰ᩸;->ۤ:Ll/᩹ܽ᩵;

    invoke-virtual {v0}, Ll/᩹ܽ᩵;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 2451
    iput-boolean v0, p0, Ll/᩻ܰ᩸;->᩻:Z

    .line 2452
    new-instance v0, Ll/ۧܰ᩸;

    invoke-direct {v0, p0}, Ll/ۧܰ᩸;-><init>(Ll/᩻ܰ᩸;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
