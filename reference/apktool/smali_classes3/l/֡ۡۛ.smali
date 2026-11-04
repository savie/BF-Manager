.class public final Ll/֡ۡۛ;
.super Ll/ܿۡۛ;
.source "M664"


# instance fields
.field public ֡:Ll/ۘۡۛ;

.field public ֨:Ll/ۘۡۛ;

.field public ֫:Ll/ۜۡۛ;

.field public ۖ:I

.field public ۗ:Ll/۫ۖۛ;

.field public ۘ:Ll/᩵ۡۛ;

.field public ۙۙ:I

.field public ۚ:Ll/᩺ۡۛ;

.field public ۛ:Ll/᩵ۡۛ;

.field public final ۜ:Ll/᩹ۖۛ;

.field public ۟:I

.field public ۠:I

.field public ۡ:I

.field public ۢ:I

.field public ۤ:I

.field public ۧ:Ll/۫ۖۛ;

.field public ۨ:Ll/᩵ۡۛ;

.field public ۫:I

.field public ۬:I

.field public ܰ:Ll/۟ۡۛ;

.field public ܳ:I

.field public ܶ:[I

.field public ܺ:Ll/ۘۡۛ;

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:Ll/ۘۡۛ;

.field public ᩵:Ll/᩻ۖۛ;

.field public ᩶:Ll/֫ۖۛ;

.field public ᩸:I

.field public ᩹:Ll/ۜۡۛ;

.field public ᩺:Ll/᩵ۡۛ;

.field public ᩻:Ll/᩻ۖۛ;


# direct methods
.method public constructor <init>(I)V
    .locals 4

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, v0}, Ll/ܿۡۛ;-><init>(Ll/ܿۡۛ;)V

    .line 241
    new-instance v0, Ll/۟ۡۛ;

    const/high16 v1, 0xa00000

    const-wide/32 v2, 0x5f5e100

    invoke-direct {v0, v1, v2, v3}, Ll/۟ۡۛ;-><init>(IJ)V

    iput-object v0, p0, Ll/֡ۡۛ;->ܰ:Ll/۟ۡۛ;

    .line 285
    new-instance v0, Ll/᩹ۖۛ;

    invoke-direct {v0, p0}, Ll/᩹ۖۛ;-><init>(Ll/֡ۡۛ;)V

    iput-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    const/4 p1, 0x4

    .line 1088
    iput p1, p0, Ll/֡ۡۛ;->᩸:I

    return-void

    :cond_0
    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_1

    .line 1090
    iput v0, p0, Ll/֡ۡۛ;->᩸:I

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 1092
    iput p1, p0, Ll/֡ۡۛ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ۙ(ILl/᩵ۖۛ;Ljava/lang/String;Z)Ll/ۗۡۛ;
    .locals 1

    .line 406
    iget-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    if-eqz p4, :cond_0

    .line 407
    iget-object p4, p0, Ll/֡ۡۛ;->ۘ:Ll/᩵ۡۛ;

    .line 408
    invoke-static {v0, p1, p2, p3, p4}, Ll/᩵ۡۛ;->ۙ(Ll/᩹ۖۛ;ILl/᩵ۖۛ;Ljava/lang/String;Ll/᩵ۡۛ;)Ll/᩵ۡۛ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۡۛ;->ۘ:Ll/᩵ۡۛ;

    return-object p1

    .line 411
    :cond_0
    iget-object p4, p0, Ll/֡ۡۛ;->ۛ:Ll/᩵ۡۛ;

    .line 412
    invoke-static {v0, p1, p2, p3, p4}, Ll/᩵ۡۛ;->ۙ(Ll/᩹ۖۛ;ILl/᩵ۖۛ;Ljava/lang/String;Ll/᩵ۡۛ;)Ll/᩵ۡۛ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۡۛ;->ۛ:Ll/᩵ۡۛ;

    return-object p1
.end method

.method public final ۙ(Ljava/lang/String;Z)Ll/ۗۡۛ;
    .locals 1

    .line 394
    iget-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    if-eqz p2, :cond_0

    .line 395
    iget-object p2, p0, Ll/֡ۡۛ;->᩺:Ll/᩵ۡۛ;

    .line 396
    invoke-static {v0, p1, p2}, Ll/᩵ۡۛ;->ۙ(Ll/᩹ۖۛ;Ljava/lang/String;Ll/᩵ۡۛ;)Ll/᩵ۡۛ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۡۛ;->᩺:Ll/᩵ۡۛ;

    return-object p1

    .line 398
    :cond_0
    iget-object p2, p0, Ll/֡ۡۛ;->ۨ:Ll/᩵ۡۛ;

    .line 399
    invoke-static {v0, p1, p2}, Ll/᩵ۡۛ;->ۙ(Ll/᩹ۖۛ;Ljava/lang/String;Ll/᩵ۡۛ;)Ll/᩵ۡۛ;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۡۛ;->ۨ:Ll/᩵ۡۛ;

    return-object p1
.end method

.method public final ۙ(ILjava/lang/String;Ljava/lang/String;)Ll/ۚۖۛ;
    .locals 2

    .line 370
    new-instance v0, Ll/֫ۖۛ;

    .line 373
    iget-object v1, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v1, p2}, Ll/᩹ۖۛ;->᩷(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p2

    iget p2, p2, Ll/ܺۖۛ;->᩷:I

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 375
    :cond_0
    invoke-virtual {v1, p3}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result p3

    :goto_0
    invoke-direct {v0, v1, p2, p1, p3}, Ll/֫ۖۛ;-><init>(Ll/᩹ۖۛ;III)V

    iput-object v0, p0, Ll/֡ۡۛ;->᩶:Ll/֫ۖۛ;

    return-object v0
.end method

.method public final ۙ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll/۠ۡۛ;
    .locals 8

    .line 487
    new-instance v7, Ll/ۜۡۛ;

    iget-object v1, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    move-object v0, v7

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Ll/ۜۡۛ;-><init>(Ll/᩹ۖۛ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 489
    iget-object p1, p0, Ll/֡ۡۛ;->֫:Ll/ۜۡۛ;

    if-nez p1, :cond_0

    .line 490
    iput-object v7, p0, Ll/֡ۡۛ;->֫:Ll/ۜۡۛ;

    goto :goto_0

    .line 492
    :cond_0
    iget-object p1, p0, Ll/֡ۡۛ;->᩹:Ll/ۜۡۛ;

    iput-object v7, p1, Ll/۠ۡۛ;->᩷:Ll/۠ۡۛ;

    .line 494
    :goto_0
    iput-object v7, p0, Ll/֡ۡۛ;->᩹:Ll/ۜۡۛ;

    return-object v7
.end method

.method public final ۙ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܳۖۛ;
    .locals 10

    .line 504
    new-instance v9, Ll/۫ۖۛ;

    iget v7, p0, Ll/֡ۡۛ;->᩸:I

    new-instance v8, Ll/۟ۡۛ;

    iget-object v0, p0, Ll/֡ۡۛ;->ܰ:Ll/۟ۡۛ;

    invoke-direct {v8, v0}, Ll/۟ۡۛ;-><init>(Ll/۟ۡۛ;)V

    iget-object v1, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    move-object v0, v9

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v8}, Ll/۫ۖۛ;-><init>(Ll/᩹ۖۛ;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;ILl/۟ۡۛ;)V

    .line 514
    iget-object p1, p0, Ll/֡ۡۛ;->ۧ:Ll/۫ۖۛ;

    if-nez p1, :cond_0

    .line 515
    iput-object v9, p0, Ll/֡ۡۛ;->ۧ:Ll/۫ۖۛ;

    goto :goto_0

    .line 517
    :cond_0
    iget-object p1, p0, Ll/֡ۡۛ;->ۗ:Ll/۫ۖۛ;

    iput-object v9, p1, Ll/ܳۖۛ;->᩷:Ll/ܳۖۛ;

    .line 519
    :goto_0
    iput-object v9, p0, Ll/֡ۡۛ;->ۗ:Ll/۫ۖۛ;

    return-object v9
.end method

.method public final ۙ()V
    .locals 0

    return-void
.end method

.method public final ۙ(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 338
    iput p1, p0, Ll/֡ۡۛ;->ۙۙ:I

    .line 339
    iput p2, p0, Ll/֡ۡۛ;->ۤ:I

    const p2, 0xffff

    and-int/2addr p1, p2

    .line 340
    iget-object p2, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {p2, p1, p3}, Ll/᩹ۖۛ;->᩷(ILjava/lang/String;)I

    move-result p3

    iput p3, p0, Ll/֡ۡۛ;->۬:I

    if-eqz p4, :cond_0

    .line 342
    invoke-virtual {p2, p4}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Ll/֡ۡۛ;->ۡ:I

    :cond_0
    const/4 p3, 0x0

    if-nez p5, :cond_1

    const/4 p4, 0x0

    goto :goto_0

    .line 344
    :cond_1
    invoke-virtual {p2, p5}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p4

    iget p4, p4, Ll/ܺۖۛ;->᩷:I

    :goto_0
    iput p4, p0, Ll/֡ۡۛ;->۠:I

    if-eqz p6, :cond_2

    .line 345
    array-length p4, p6

    if-lez p4, :cond_2

    .line 346
    array-length p4, p6

    iput p4, p0, Ll/֡ۡۛ;->ܽ:I

    .line 347
    new-array p4, p4, [I

    iput-object p4, p0, Ll/֡ۡۛ;->ܶ:[I

    .line 348
    :goto_1
    iget p4, p0, Ll/֡ۡۛ;->ܽ:I

    if-ge p3, p4, :cond_2

    .line 349
    iget-object p4, p0, Ll/֡ۡۛ;->ܶ:[I

    aget-object p5, p6, p3

    invoke-virtual {p2, p5}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p5

    iget p5, p5, Ll/ܺۖۛ;->᩷:I

    aput p5, p4, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 352
    :cond_2
    iget p2, p0, Ll/֡ۡۛ;->᩸:I

    const/4 p3, 0x1

    if-ne p2, p3, :cond_3

    const/16 p2, 0x33

    if-lt p1, p2, :cond_3

    const/4 p1, 0x2

    .line 353
    iput p1, p0, Ll/֡ۡۛ;->᩸:I

    :cond_3
    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    .line 380
    iget-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v0, p1}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p1

    iget p1, p1, Ll/ܺۖۛ;->᩷:I

    iput p1, p0, Ll/֡ۡۛ;->ܿ:I

    return-void
.end method

.method public final ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 445
    iget-object v0, p0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    if-nez v0, :cond_0

    .line 446
    new-instance v0, Ll/ۘۡۛ;

    invoke-direct {v0}, Ll/ۘۡۛ;-><init>()V

    iput-object v0, p0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    .line 454
    :cond_0
    iget-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v0, p1}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p1

    .line 455
    iget v1, p1, Ll/ܺۖۛ;->ۤ:I

    if-nez v1, :cond_3

    .line 456
    iget v1, p0, Ll/֡ۡۛ;->۟:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/֡ۡۛ;->۟:I

    .line 457
    iget-object v1, p0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    iget v2, p1, Ll/ܺۖۛ;->᩷:I

    invoke-virtual {v1, v2}, Ll/ۘۡۛ;->ۤ(I)V

    .line 458
    iget-object v1, p0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    const/4 v2, 0x0

    if-nez p3, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p3}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p3

    iget p3, p3, Ll/ܺۖۛ;->᩷:I

    :goto_0
    invoke-virtual {v1, p3}, Ll/ۘۡۛ;->ۤ(I)V

    .line 459
    iget-object p3, p0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    if-nez p4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p4}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v2

    :goto_1
    invoke-virtual {p3, v2}, Ll/ۘۡۛ;->ۤ(I)V

    .line 460
    iget-object p3, p0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    invoke-virtual {p3, p2}, Ll/ۘۡۛ;->ۤ(I)V

    .line 461
    iget p2, p0, Ll/֡ۡۛ;->۟:I

    iput p2, p1, Ll/ܺۖۛ;->ۤ:I

    :cond_3
    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 360
    iget-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v0, p1}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/֡ۡۛ;->ۖ:I

    :cond_0
    if-eqz p2, :cond_1

    .line 363
    new-instance p1, Ll/ۘۡۛ;

    invoke-direct {p1}, Ll/ۘۡۛ;-><init>()V

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p1, v0, v1, p2}, Ll/ۘۡۛ;->ۙ(IILjava/lang/String;)V

    iput-object p1, p0, Ll/֡ۡۛ;->ᩴ:Ll/ۘۡۛ;

    :cond_1
    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 386
    iget-object v0, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v0, p1}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p1

    iget p1, p1, Ll/ܺۖۛ;->᩷:I

    iput p1, p0, Ll/֡ۡۛ;->ܳ:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 388
    invoke-virtual {v0, p2, p3}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Ll/֡ۡۛ;->۫:I

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/᩺ۡۛ;)V
    .locals 1

    .line 420
    iget-object v0, p0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    iput-object v0, p1, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    .line 421
    iput-object p1, p0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    return-void
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 2

    .line 435
    iget-object v0, p0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    if-nez v0, :cond_0

    .line 436
    new-instance v0, Ll/ۘۡۛ;

    invoke-direct {v0}, Ll/ۘۡۛ;-><init>()V

    iput-object v0, p0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    .line 438
    :cond_0
    iget v0, p0, Ll/֡ۡۛ;->ۢ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֡ۡۛ;->ۢ:I

    .line 439
    iget-object v0, p0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    iget-object v1, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v1, p1}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p1

    iget p1, p1, Ll/ܺۖۛ;->᩷:I

    invoke-virtual {v0, p1}, Ll/ۘۡۛ;->ۤ(I)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۧۖۛ;
    .locals 2

    .line 470
    new-instance v0, Ll/᩻ۖۛ;

    iget-object v1, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-direct {v0, v1, p1, p2, p3}, Ll/᩻ۖۛ;-><init>(Ll/᩹ۖۛ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    iget-object p1, p0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    if-nez p1, :cond_0

    .line 473
    iput-object v0, p0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    goto :goto_0

    .line 475
    :cond_0
    iget-object p1, p0, Ll/֡ۡۛ;->᩵:Ll/᩻ۖۛ;

    iput-object v0, p1, Ll/ۧۖۛ;->᩷:Ll/ۧۖۛ;

    .line 477
    :goto_0
    iput-object v0, p0, Ll/֡ۡۛ;->᩵:Ll/᩻ۖۛ;

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 2

    .line 426
    iget-object v0, p0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    if-nez v0, :cond_0

    .line 427
    new-instance v0, Ll/ۘۡۛ;

    invoke-direct {v0}, Ll/ۘۡۛ;-><init>()V

    iput-object v0, p0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    .line 429
    :cond_0
    iget v0, p0, Ll/֡ۡۛ;->ᩳ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/֡ۡۛ;->ᩳ:I

    .line 430
    iget-object v0, p0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    iget-object v1, p0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    invoke-virtual {v1, p1}, Ll/᩹ۖۛ;->ۙ(Ljava/lang/String;)Ll/ܽۖۛ;

    move-result-object p1

    iget p1, p1, Ll/ܺۖۛ;->᩷:I

    invoke-virtual {v0, p1}, Ll/ۘۡۛ;->ۤ(I)V

    return-void
.end method

.method public final ᩷()[B
    .locals 30

    move-object/from16 v0, p0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    if-ge v1, v2, :cond_31

    .line 544
    iget v2, v0, Ll/֡ۡۛ;->ܽ:I

    mul-int/lit8 v2, v2, 0x2

    add-int/lit8 v2, v2, 0x18

    .line 546
    iget-object v3, v0, Ll/֡ۡۛ;->֫:Ll/ۜۡۛ;

    const/4 v4, 0x0

    :goto_1
    if-eqz v3, :cond_0

    add-int/lit8 v4, v4, 0x1

    .line 549
    invoke-virtual {v3}, Ll/ۜۡۛ;->᩷()I

    move-result v5

    add-int/2addr v2, v5

    .line 550
    iget-object v3, v3, Ll/۠ۡۛ;->᩷:Ll/۠ۡۛ;

    check-cast v3, Ll/ۜۡۛ;

    goto :goto_1

    .line 553
    :cond_0
    iget-object v3, v0, Ll/֡ۡۛ;->ۧ:Ll/۫ۖۛ;

    const/4 v5, 0x0

    :goto_2
    if-eqz v3, :cond_1

    add-int/lit8 v5, v5, 0x1

    .line 556
    invoke-virtual {v3}, Ll/۫ۖۛ;->ᩴ()I

    move-result v6

    add-int/2addr v2, v6

    .line 557
    iget-object v3, v3, Ll/ܳۖۛ;->᩷:Ll/ܳۖۛ;

    check-cast v3, Ll/۫ۖۛ;

    goto :goto_2

    .line 562
    :cond_1
    iget-object v3, v0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    const-string v6, "InnerClasses"

    iget-object v7, v0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    if-eqz v3, :cond_2

    .line 564
    iget v3, v3, Ll/ۘۡۛ;->᩷:I

    add-int/lit8 v3, v3, 0x8

    add-int/2addr v2, v3

    .line 565
    invoke-virtual {v7, v6}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    const/4 v3, 0x1

    goto :goto_3

    :cond_2
    const/4 v3, 0x0

    .line 567
    :goto_3
    iget v8, v0, Ll/֡ۡۛ;->ܳ:I

    const-string v9, "EnclosingMethod"

    if-eqz v8, :cond_3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0xa

    .line 570
    invoke-virtual {v7, v9}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 572
    :cond_3
    iget v8, v0, Ll/֡ۡۛ;->ۤ:I

    and-int/lit16 v8, v8, 0x1000

    const-string v10, "Synthetic"

    const/16 v11, 0x31

    const v12, 0xffff

    if-eqz v8, :cond_4

    iget v8, v0, Ll/֡ۡۛ;->ۙۙ:I

    and-int/2addr v8, v12

    if-ge v8, v11, :cond_4

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x6

    .line 575
    invoke-virtual {v7, v10}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 577
    :cond_4
    iget v8, v0, Ll/֡ۡۛ;->ۡ:I

    const-string v11, "Signature"

    if-eqz v8, :cond_5

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x8

    .line 580
    invoke-virtual {v7, v11}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 582
    :cond_5
    iget v8, v0, Ll/֡ۡۛ;->ۖ:I

    const-string v12, "SourceFile"

    if-eqz v8, :cond_6

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x8

    .line 585
    invoke-virtual {v7, v12}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 587
    :cond_6
    iget-object v8, v0, Ll/֡ۡۛ;->ᩴ:Ll/ۘۡۛ;

    const-string v13, "SourceDebugExtension"

    if-eqz v8, :cond_7

    add-int/lit8 v3, v3, 0x1

    .line 589
    iget v8, v8, Ll/ۘۡۛ;->᩷:I

    add-int/lit8 v8, v8, 0x6

    add-int/2addr v2, v8

    .line 590
    invoke-virtual {v7, v13}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 592
    :cond_7
    iget v8, v0, Ll/֡ۡۛ;->ۤ:I

    const/high16 v14, 0x20000

    and-int/2addr v8, v14

    const-string v15, "Deprecated"

    if-eqz v8, :cond_8

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x6

    .line 595
    invoke-virtual {v7, v15}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 597
    :cond_8
    iget-object v8, v0, Ll/֡ۡۛ;->᩺:Ll/᩵ۡۛ;

    if-eqz v8, :cond_9

    add-int/lit8 v3, v3, 0x1

    const-string v14, "RuntimeVisibleAnnotations"

    .line 600
    invoke-virtual {v8, v14}, Ll/᩵ۡۛ;->᩷(Ljava/lang/String;)I

    move-result v8

    add-int/2addr v2, v8

    .line 603
    :cond_9
    iget-object v8, v0, Ll/֡ۡۛ;->ۨ:Ll/᩵ۡۛ;

    if-eqz v8, :cond_a

    add-int/lit8 v3, v3, 0x1

    const-string v14, "RuntimeInvisibleAnnotations"

    .line 606
    invoke-virtual {v8, v14}, Ll/᩵ۡۛ;->᩷(Ljava/lang/String;)I

    move-result v8

    add-int/2addr v2, v8

    .line 609
    :cond_a
    iget-object v8, v0, Ll/֡ۡۛ;->ۘ:Ll/᩵ۡۛ;

    if-eqz v8, :cond_b

    add-int/lit8 v3, v3, 0x1

    const-string v14, "RuntimeVisibleTypeAnnotations"

    .line 612
    invoke-virtual {v8, v14}, Ll/᩵ۡۛ;->᩷(Ljava/lang/String;)I

    move-result v8

    add-int/2addr v2, v8

    .line 615
    :cond_b
    iget-object v8, v0, Ll/֡ۡۛ;->ۛ:Ll/᩵ۡۛ;

    if-eqz v8, :cond_c

    add-int/lit8 v3, v3, 0x1

    const-string v14, "RuntimeInvisibleTypeAnnotations"

    .line 618
    invoke-virtual {v8, v14}, Ll/᩵ۡۛ;->᩷(Ljava/lang/String;)I

    move-result v8

    add-int/2addr v2, v8

    .line 621
    :cond_c
    invoke-virtual {v7}, Ll/᩹ۖۛ;->ۙ()I

    move-result v8

    if-lez v8, :cond_d

    add-int/lit8 v3, v3, 0x1

    .line 623
    invoke-virtual {v7}, Ll/᩹ۖۛ;->ۙ()I

    move-result v8

    add-int/2addr v2, v8

    .line 625
    :cond_d
    iget-object v8, v0, Ll/֡ۡۛ;->᩶:Ll/֫ۖۛ;

    if-eqz v8, :cond_e

    .line 626
    invoke-virtual {v8}, Ll/֫ۖۛ;->ۤ()I

    move-result v8

    add-int/2addr v3, v8

    .line 627
    iget-object v8, v0, Ll/֡ۡۛ;->᩶:Ll/֫ۖۛ;

    invoke-virtual {v8}, Ll/֫ۖۛ;->᩷()I

    move-result v8

    add-int/2addr v2, v8

    .line 629
    :cond_e
    iget v8, v0, Ll/֡ۡۛ;->ܿ:I

    const-string v14, "NestHost"

    if-eqz v8, :cond_f

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x8

    .line 632
    invoke-virtual {v7, v14}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 634
    :cond_f
    iget-object v8, v0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    move/from16 v16, v1

    const-string v1, "NestMembers"

    if-eqz v8, :cond_10

    add-int/lit8 v3, v3, 0x1

    .line 636
    iget v8, v8, Ll/ۘۡۛ;->᩷:I

    add-int/lit8 v8, v8, 0x8

    add-int/2addr v2, v8

    .line 637
    invoke-virtual {v7, v1}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 639
    :cond_10
    iget-object v8, v0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    move-object/from16 v17, v1

    const-string v1, "PermittedSubclasses"

    if-eqz v8, :cond_11

    add-int/lit8 v3, v3, 0x1

    .line 641
    iget v8, v8, Ll/ۘۡۛ;->᩷:I

    add-int/lit8 v8, v8, 0x8

    add-int/2addr v2, v8

    .line 642
    invoke-virtual {v7, v1}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    .line 646
    :cond_11
    iget v8, v0, Ll/֡ۡۛ;->ۤ:I

    const/high16 v18, 0x10000

    and-int v8, v8, v18

    move-object/from16 v19, v1

    const-string v1, "Record"

    if-nez v8, :cond_13

    iget-object v8, v0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    if-eqz v8, :cond_12

    goto :goto_4

    :cond_12
    const/4 v8, 0x0

    const/16 v20, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    goto :goto_6

    .line 647
    :cond_13
    :goto_4
    iget-object v8, v0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_5
    if-eqz v8, :cond_14

    add-int/lit8 v21, v21, 0x1

    .line 650
    invoke-virtual {v8}, Ll/᩻ۖۛ;->᩷()I

    move-result v22

    add-int v20, v20, v22

    .line 651
    iget-object v8, v8, Ll/ۧۖۛ;->᩷:Ll/ۧۖۛ;

    check-cast v8, Ll/᩻ۖۛ;

    goto :goto_5

    :cond_14
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v8, v20, 0x8

    add-int/2addr v2, v8

    .line 655
    invoke-virtual {v7, v1}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move/from16 v23, v21

    .line 657
    :goto_6
    iget-object v8, v0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    if-eqz v8, :cond_16

    const/16 v21, 0x0

    :goto_7
    if-eqz v8, :cond_15

    add-int/lit8 v21, v21, 0x1

    .line 292
    iget-object v8, v8, Ll/᩺ۡۛ;->᩷:Ll/᩺ۡۛ;

    goto :goto_7

    :cond_15
    add-int v3, v3, v21

    .line 659
    iget-object v8, v0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    invoke-virtual {v8, v7}, Ll/᩺ۡۛ;->ۙ(Ll/᩹ۖۛ;)I

    move-result v8

    add-int/2addr v2, v8

    .line 664
    :cond_16
    invoke-virtual {v7}, Ll/᩹ۖۛ;->᩸()I

    move-result v8

    add-int/2addr v2, v8

    .line 665
    invoke-virtual {v7}, Ll/᩹ۖۛ;->ۤ()I

    move-result v8

    move-object/from16 v21, v1

    const v1, 0xffff

    if-gt v8, v1, :cond_30

    .line 672
    new-instance v8, Ll/ۘۡۛ;

    .line 54
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 55
    new-array v2, v2, [B

    iput-object v2, v8, Ll/ۘۡۛ;->ۙ:[B

    const v2, -0x35014542    # -8346975.0f

    .line 673
    invoke-virtual {v8, v2}, Ll/ۘۡۛ;->᩷(I)V

    iget v2, v0, Ll/֡ۡۛ;->ۙۙ:I

    invoke-virtual {v8, v2}, Ll/ۘۡۛ;->᩷(I)V

    .line 674
    invoke-virtual {v7, v8}, Ll/᩹ۖۛ;->᩷(Ll/ۘۡۛ;)V

    .line 675
    iget v2, v0, Ll/֡ۡۛ;->ۙۙ:I

    and-int/2addr v1, v2

    const/16 v2, 0x31

    if-ge v1, v2, :cond_17

    const/16 v1, 0x1000

    goto :goto_8

    :cond_17
    const/4 v1, 0x0

    .line 676
    :goto_8
    iget v2, v0, Ll/֡ۡۛ;->ۤ:I

    not-int v1, v1

    and-int/2addr v1, v2

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget v1, v0, Ll/֡ۡۛ;->۬:I

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget v1, v0, Ll/֡ۡۛ;->۠:I

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    .line 677
    iget v1, v0, Ll/֡ۡۛ;->ܽ:I

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    const/4 v1, 0x0

    .line 678
    :goto_9
    iget v2, v0, Ll/֡ۡۛ;->ܽ:I

    if-ge v1, v2, :cond_18

    .line 679
    iget-object v2, v0, Ll/֡ۡۛ;->ܶ:[I

    aget v2, v2, v1

    invoke-virtual {v8, v2}, Ll/ۘۡۛ;->ۤ(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 681
    :cond_18
    invoke-virtual {v8, v4}, Ll/ۘۡۛ;->ۤ(I)V

    .line 682
    iget-object v1, v0, Ll/֡ۡۛ;->֫:Ll/ۜۡۛ;

    :goto_a
    if-eqz v1, :cond_19

    .line 684
    invoke-virtual {v1, v8}, Ll/ۜۡۛ;->ۙ(Ll/ۘۡۛ;)V

    .line 685
    iget-object v1, v1, Ll/۠ۡۛ;->᩷:Ll/۠ۡۛ;

    check-cast v1, Ll/ۜۡۛ;

    goto :goto_a

    .line 687
    :cond_19
    invoke-virtual {v8, v5}, Ll/ۘۡۛ;->ۤ(I)V

    .line 690
    iget-object v1, v0, Ll/֡ۡۛ;->ۧ:Ll/۫ۖۛ;

    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_b
    if-eqz v1, :cond_1b

    .line 692
    invoke-virtual {v1}, Ll/۫ۖۛ;->۫()Z

    move-result v5

    or-int/2addr v2, v5

    .line 693
    invoke-virtual {v1}, Ll/۫ۖۛ;->ܳ()Z

    move-result v5

    if-eqz v5, :cond_1a

    .line 694
    invoke-virtual {v1}, Ll/۫ۖۛ;->᩸()V

    const/4 v4, 0x1

    .line 697
    :cond_1a
    invoke-virtual {v1, v8}, Ll/۫ۖۛ;->ۙ(Ll/ۘۡۛ;)V

    .line 698
    iget-object v1, v1, Ll/ܳۖۛ;->᩷:Ll/ܳۖۛ;

    check-cast v1, Ll/۫ۖۛ;

    goto :goto_b

    .line 701
    :cond_1b
    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->ۤ(I)V

    .line 702
    iget-object v1, v0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    if-eqz v1, :cond_1c

    .line 704
    invoke-virtual {v7, v6}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget-object v1, v0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    iget v1, v1, Ll/ۘۡۛ;->᩷:I

    add-int/lit8 v1, v1, 0x2

    .line 705
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget v1, v0, Ll/֡ۡۛ;->۟:I

    .line 706
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget-object v1, v0, Ll/֡ۡۛ;->ܺ:Ll/ۘۡۛ;

    iget-object v3, v1, Ll/ۘۡۛ;->ۙ:[B

    iget v1, v1, Ll/ۘۡۛ;->᩷:I

    const/4 v5, 0x0

    .line 707
    invoke-virtual {v8, v5, v1, v3}, Ll/ۘۡۛ;->ۙ(II[B)V

    .line 709
    :cond_1c
    iget v1, v0, Ll/֡ۡۛ;->ܳ:I

    if-eqz v1, :cond_1d

    .line 711
    invoke-virtual {v7, v9}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    const/4 v1, 0x4

    .line 712
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget v1, v0, Ll/֡ۡۛ;->ܳ:I

    .line 713
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget v1, v0, Ll/֡ۡۛ;->۫:I

    .line 714
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    .line 716
    :cond_1d
    iget v1, v0, Ll/֡ۡۛ;->ۤ:I

    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_1e

    iget v1, v0, Ll/֡ۡۛ;->ۙۙ:I

    const v3, 0xffff

    and-int/2addr v1, v3

    const/16 v3, 0x31

    if-ge v1, v3, :cond_1e

    .line 717
    invoke-virtual {v7, v10}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    .line 719
    :cond_1e
    iget v1, v0, Ll/֡ۡۛ;->ۡ:I

    if-eqz v1, :cond_1f

    .line 721
    invoke-virtual {v7, v11}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    const/4 v1, 0x2

    .line 722
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget v3, v0, Ll/֡ۡۛ;->ۡ:I

    .line 723
    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->ۤ(I)V

    goto :goto_c

    :cond_1f
    const/4 v1, 0x2

    .line 725
    :goto_c
    iget v3, v0, Ll/֡ۡۛ;->ۖ:I

    if-eqz v3, :cond_20

    .line 727
    invoke-virtual {v7, v12}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->ۤ(I)V

    .line 728
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget v1, v0, Ll/֡ۡۛ;->ۖ:I

    .line 729
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    .line 731
    :cond_20
    iget-object v1, v0, Ll/֡ۡۛ;->ᩴ:Ll/ۘۡۛ;

    if-eqz v1, :cond_21

    .line 732
    iget v1, v1, Ll/ۘۡۛ;->᩷:I

    .line 734
    invoke-virtual {v7, v13}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->ۤ(I)V

    .line 735
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget-object v3, v0, Ll/֡ۡۛ;->ᩴ:Ll/ۘۡۛ;

    iget-object v3, v3, Ll/ۘۡۛ;->ۙ:[B

    const/4 v5, 0x0

    .line 736
    invoke-virtual {v8, v5, v1, v3}, Ll/ۘۡۛ;->ۙ(II[B)V

    goto :goto_d

    :cond_21
    const/4 v5, 0x0

    .line 738
    :goto_d
    iget v1, v0, Ll/֡ۡۛ;->ۤ:I

    const/high16 v3, 0x20000

    and-int/2addr v1, v3

    if-eqz v1, :cond_22

    .line 739
    invoke-virtual {v7, v15}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    invoke-virtual {v8, v5}, Ll/ۘۡۛ;->᩷(I)V

    .line 741
    :cond_22
    iget-object v1, v0, Ll/֡ۡۛ;->᩺:Ll/᩵ۡۛ;

    iget-object v3, v0, Ll/֡ۡۛ;->ۨ:Ll/᩵ۡۛ;

    iget-object v5, v0, Ll/֡ۡۛ;->ۘ:Ll/᩵ۡۛ;

    iget-object v6, v0, Ll/֡ۡۛ;->ۛ:Ll/᩵ۡۛ;

    iget-object v9, v0, Ll/֡ۡۛ;->ۜ:Ll/᩹ۖۛ;

    move-object/from16 v24, v9

    move-object/from16 v25, v1

    move-object/from16 v26, v3

    move-object/from16 v27, v5

    move-object/from16 v28, v6

    move-object/from16 v29, v8

    invoke-static/range {v24 .. v29}, Ll/᩵ۡۛ;->ۙ(Ll/᩹ۖۛ;Ll/᩵ۡۛ;Ll/᩵ۡۛ;Ll/᩵ۡۛ;Ll/᩵ۡۛ;Ll/ۘۡۛ;)V

    .line 748
    invoke-virtual {v7, v8}, Ll/᩹ۖۛ;->ۙ(Ll/ۘۡۛ;)V

    .line 749
    iget-object v1, v0, Ll/֡ۡۛ;->᩶:Ll/֫ۖۛ;

    if-eqz v1, :cond_23

    .line 750
    invoke-virtual {v1, v8}, Ll/֫ۖۛ;->ۙ(Ll/ۘۡۛ;)V

    .line 752
    :cond_23
    iget v1, v0, Ll/֡ۡۛ;->ܿ:I

    if-eqz v1, :cond_24

    .line 754
    invoke-virtual {v7, v14}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    const/4 v1, 0x2

    .line 755
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget v3, v0, Ll/֡ۡۛ;->ܿ:I

    .line 756
    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->ۤ(I)V

    goto :goto_e

    :cond_24
    const/4 v1, 0x2

    .line 758
    :goto_e
    iget-object v3, v0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    if-eqz v3, :cond_25

    move-object/from16 v3, v17

    .line 760
    invoke-virtual {v7, v3}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->ۤ(I)V

    iget-object v3, v0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    iget v3, v3, Ll/ۘۡۛ;->᩷:I

    add-int/2addr v3, v1

    .line 761
    invoke-virtual {v8, v3}, Ll/ۘۡۛ;->᩷(I)V

    iget v1, v0, Ll/֡ۡۛ;->ᩳ:I

    .line 762
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget-object v1, v0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    iget-object v3, v1, Ll/ۘۡۛ;->ۙ:[B

    iget v1, v1, Ll/ۘۡۛ;->᩷:I

    const/4 v5, 0x0

    .line 763
    invoke-virtual {v8, v5, v1, v3}, Ll/ۘۡۛ;->ۙ(II[B)V

    .line 765
    :cond_25
    iget-object v1, v0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    if-eqz v1, :cond_26

    move-object/from16 v1, v19

    .line 767
    invoke-virtual {v7, v1}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget-object v1, v0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    iget v1, v1, Ll/ۘۡۛ;->᩷:I

    add-int/lit8 v1, v1, 0x2

    .line 768
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    iget v1, v0, Ll/֡ۡۛ;->ۢ:I

    .line 769
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    iget-object v1, v0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    iget-object v3, v1, Ll/ۘۡۛ;->ۙ:[B

    iget v1, v1, Ll/ۘۡۛ;->᩷:I

    const/4 v5, 0x0

    .line 770
    invoke-virtual {v8, v5, v1, v3}, Ll/ۘۡۛ;->ۙ(II[B)V

    .line 772
    :cond_26
    iget v1, v0, Ll/֡ۡۛ;->ۤ:I

    and-int v1, v1, v18

    if-nez v1, :cond_27

    iget-object v1, v0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    if-eqz v1, :cond_28

    :cond_27
    move-object/from16 v1, v21

    .line 774
    invoke-virtual {v7, v1}, Ll/᩹ۖۛ;->᩸(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    add-int/lit8 v1, v20, 0x2

    .line 775
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->᩷(I)V

    move/from16 v1, v23

    .line 776
    invoke-virtual {v8, v1}, Ll/ۘۡۛ;->ۤ(I)V

    .line 777
    iget-object v1, v0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    :goto_f
    if-eqz v1, :cond_28

    .line 779
    invoke-virtual {v1, v8}, Ll/᩻ۖۛ;->ۙ(Ll/ۘۡۛ;)V

    .line 780
    iget-object v1, v1, Ll/ۧۖۛ;->᩷:Ll/ۧۖۛ;

    check-cast v1, Ll/᩻ۖۛ;

    goto :goto_f

    .line 783
    :cond_28
    iget-object v1, v0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    if-eqz v1, :cond_29

    .line 784
    invoke-virtual {v1, v7, v8}, Ll/᩺ۡۛ;->ۙ(Ll/᩹ۖۛ;Ll/ۘۡۛ;)V

    :cond_29
    if-eqz v4, :cond_2f

    .line 789
    iget-object v1, v8, Ll/ۘۡۛ;->ۙ:[B

    .line 842
    new-instance v3, Ll/ۛۡۛ;

    invoke-direct {v3}, Ll/ۛۡۛ;-><init>()V

    .line 843
    iget-object v4, v0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    invoke-virtual {v3, v4}, Ll/ۛۡۛ;->ۙ(Ll/᩺ۡۛ;)V

    .line 844
    iget-object v4, v0, Ll/֡ۡۛ;->֫:Ll/ۜۡۛ;

    :goto_10
    if-eqz v4, :cond_2a

    .line 846
    invoke-virtual {v4, v3}, Ll/ۜۡۛ;->ۙ(Ll/ۛۡۛ;)V

    .line 847
    iget-object v4, v4, Ll/۠ۡۛ;->᩷:Ll/۠ۡۛ;

    check-cast v4, Ll/ۜۡۛ;

    goto :goto_10

    .line 849
    :cond_2a
    iget-object v4, v0, Ll/֡ۡۛ;->ۧ:Ll/۫ۖۛ;

    :goto_11
    if-eqz v4, :cond_2b

    .line 851
    invoke-virtual {v4, v3}, Ll/۫ۖۛ;->ۙ(Ll/ۛۡۛ;)V

    .line 852
    iget-object v4, v4, Ll/ܳۖۛ;->᩷:Ll/ܳۖۛ;

    check-cast v4, Ll/۫ۖۛ;

    goto :goto_11

    .line 854
    :cond_2b
    iget-object v4, v0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    :goto_12
    if-eqz v4, :cond_2c

    .line 856
    invoke-virtual {v4, v3}, Ll/᩻ۖۛ;->ۙ(Ll/ۛۡۛ;)V

    .line 857
    iget-object v4, v4, Ll/ۧۖۛ;->᩷:Ll/ۧۖۛ;

    check-cast v4, Ll/᩻ۖۛ;

    goto :goto_12

    .line 859
    :cond_2c
    invoke-virtual {v3}, Ll/ۛۡۛ;->ۙ()[Ll/᩺ۡۛ;

    move-result-object v3

    const/4 v4, 0x0

    .line 811
    iput-object v4, v0, Ll/֡ۡۛ;->֫:Ll/ۜۡۛ;

    .line 812
    iput-object v4, v0, Ll/֡ۡۛ;->᩹:Ll/ۜۡۛ;

    .line 813
    iput-object v4, v0, Ll/֡ۡۛ;->ۧ:Ll/۫ۖۛ;

    .line 814
    iput-object v4, v0, Ll/֡ۡۛ;->ۗ:Ll/۫ۖۛ;

    .line 815
    iput-object v4, v0, Ll/֡ۡۛ;->᩺:Ll/᩵ۡۛ;

    .line 816
    iput-object v4, v0, Ll/֡ۡۛ;->ۨ:Ll/᩵ۡۛ;

    .line 817
    iput-object v4, v0, Ll/֡ۡۛ;->ۘ:Ll/᩵ۡۛ;

    .line 818
    iput-object v4, v0, Ll/֡ۡۛ;->ۛ:Ll/᩵ۡۛ;

    .line 819
    iput-object v4, v0, Ll/֡ۡۛ;->᩶:Ll/֫ۖۛ;

    const/4 v5, 0x0

    .line 820
    iput v5, v0, Ll/֡ۡۛ;->ܿ:I

    .line 821
    iput v5, v0, Ll/֡ۡۛ;->ᩳ:I

    .line 822
    iput-object v4, v0, Ll/֡ۡۛ;->֡:Ll/ۘۡۛ;

    .line 823
    iput v5, v0, Ll/֡ۡۛ;->ۢ:I

    .line 824
    iput-object v4, v0, Ll/֡ۡۛ;->֨:Ll/ۘۡۛ;

    .line 825
    iput-object v4, v0, Ll/֡ۡۛ;->᩻:Ll/᩻ۖۛ;

    .line 826
    iput-object v4, v0, Ll/֡ۡۛ;->᩵:Ll/᩻ۖۛ;

    .line 827
    iput-object v4, v0, Ll/֡ۡۛ;->ۚ:Ll/᩺ۡۛ;

    if-eqz v2, :cond_2d

    const/4 v4, 0x3

    goto :goto_13

    :cond_2d
    const/4 v4, 0x0

    .line 828
    :goto_13
    iput v4, v0, Ll/֡ۡۛ;->᩸:I

    .line 829
    new-instance v4, Ll/ܰۡۛ;

    invoke-direct {v4, v1, v5}, Ll/ܰۡۛ;-><init>([BZ)V

    if-eqz v2, :cond_2e

    const/16 v1, 0x8

    goto :goto_14

    :cond_2e
    const/4 v1, 0x0

    :goto_14
    or-int/lit16 v1, v1, 0x100

    .line 830
    invoke-virtual {v4, v0, v3, v1}, Ll/ܰۡۛ;->ۙ(Ll/ܿۡۛ;[Ll/᩺ۡۛ;I)V

    add-int/lit8 v1, v16, 0x1

    goto/16 :goto_0

    .line 794
    :cond_2f
    iget-object v1, v8, Ll/ۘۡۛ;->ۙ:[B

    return-object v1

    .line 667
    :cond_30
    new-instance v1, Ll/᩶ۡۛ;

    invoke-virtual {v7}, Ll/᩹ۖۛ;->᩷()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Class too large: "

    .line 0
    invoke-static {v3, v2}, Ll/᩻᩵᩸;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 51
    invoke-direct {v1, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 667
    throw v1

    .line 798
    :cond_31
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1
.end method
