.class public final Ll/ۤۖۛ;
.super Ljava/lang/Object;
.source "U58U"


# static fields
.field public static final ᩵:Ll/ۤۖۛ;


# instance fields
.field public ֫:S

.field public ۗ:S

.field public ۙ:I

.field public ۚ:S

.field public ۤ:Ll/۬ۡۛ;

.field public ۧ:Ll/ۤۖۛ;

.field public ۫:S

.field public ܳ:S

.field public ܶ:S

.field public ܺ:[I

.field public ܽ:Ll/ۖۡۛ;

.field public ᩴ:S

.field public ᩷:S

.field public ᩸:Ll/ۚ۠ۛ;

.field public ᩹:S

.field public ᩻:Ll/ۤۖۛ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 98
    new-instance v0, Ll/ۤۖۛ;

    invoke-direct {v0}, Ll/ۤۖۛ;-><init>()V

    sput-object v0, Ll/ۤۖۛ;->᩵:Ll/ۤۖۛ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 266
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private ᩷(Ll/ۤۖۛ;Ll/᩷ۖۛ;Ll/۟ۡۛ;)Ll/ۤۖۛ;
    .locals 4

    .line 605
    iget-object v0, p0, Ll/ۤۖۛ;->ܽ:Ll/ۖۡۛ;

    const/4 v1, 0x2

    :goto_0
    if-eqz v0, :cond_2

    .line 610
    iget-short v2, p0, Ll/ۤۖۛ;->᩷:S

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/ۤۖۛ;->ܽ:Ll/ۖۡۛ;

    iget-object v2, v2, Ll/ۖۡۛ;->ۙ:Ll/ۖۡۛ;

    if-ne v0, v2, :cond_0

    goto :goto_1

    .line 612
    :cond_0
    iget-object v2, v0, Ll/ۖۡۛ;->ۤ:Ll/ۤۖۛ;

    iget-object v3, v2, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    if-nez v3, :cond_1

    .line 615
    iput-object p1, v2, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    move-object p1, v2

    .line 618
    :cond_1
    :goto_1
    iget-object v0, v0, Ll/ۖۡۛ;->ۙ:Ll/ۖۡۛ;

    add-int/lit8 v1, v1, 0x5

    goto :goto_0

    .line 622
    :cond_2
    iget v0, p0, Ll/ۤۖۛ;->ۙ:I

    :goto_2
    if-eqz p2, :cond_4

    .line 625
    iget-object v2, p2, Ll/᩷ۖۛ;->ܳ:Ll/ۤۖۛ;

    iget v2, v2, Ll/ۤۖۛ;->ۙ:I

    .line 626
    iget-object v3, p2, Ll/᩷ۖۛ;->ۤ:Ll/ۤۖۛ;

    iget v3, v3, Ll/ۤۖۛ;->ۙ:I

    if-lt v0, v2, :cond_3

    if-ge v0, v3, :cond_3

    .line 628
    iget-object v2, p2, Ll/᩷ۖۛ;->᩸:Ll/ۤۖۛ;

    .line 629
    iget-object v3, v2, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    if-nez v3, :cond_3

    .line 630
    iput-object p1, v2, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    move-object p1, v2

    .line 634
    :cond_3
    iget-object p2, p2, Ll/᩷ۖۛ;->ᩴ:Ll/᩷ۖۛ;

    add-int/lit8 v1, v1, 0x5

    goto :goto_2

    .line 637
    :cond_4
    invoke-virtual {p3, v1}, Ll/۟ۡۛ;->᩷(I)V

    return-object p1
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 652
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const-string v1, "L"

    .line 0
    invoke-static {v0, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ll/ۤۖۛ;
    .locals 1

    .line 299
    iget-object v0, p0, Ll/ۤۖۛ;->ۤ:Ll/۬ۡۛ;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, v0, Ll/۬ۡۛ;->֫:Ll/ۤۖۛ;

    return-object v0
.end method

.method public final ۙ(I)V
    .locals 5

    .line 312
    iget-short v0, p0, Ll/ۤۖۛ;->᩷:S

    and-int/lit16 v1, v0, 0x80

    if-nez v1, :cond_0

    or-int/lit16 v0, v0, 0x80

    int-to-short v0, v0

    .line 313
    iput-short v0, p0, Ll/ۤۖۛ;->᩷:S

    int-to-short p1, p1

    .line 314
    iput-short p1, p0, Ll/ۤۖۛ;->֫:S

    return-void

    .line 316
    :cond_0
    iget-object v0, p0, Ll/ۤۖۛ;->ܺ:[I

    const/4 v1, 0x4

    if-nez v0, :cond_1

    new-array v0, v1, [I

    .line 317
    iput-object v0, p0, Ll/ۤۖۛ;->ܺ:[I

    .line 319
    :cond_1
    iget-object v0, p0, Ll/ۤۖۛ;->ܺ:[I

    const/4 v2, 0x0

    aget v3, v0, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v0, v2

    .line 320
    array-length v4, v0

    if-lt v3, v4, :cond_2

    .line 321
    array-length v4, v0

    add-int/2addr v4, v1

    new-array v1, v4, [I

    .line 322
    array-length v4, v0

    invoke-static {v0, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 323
    iput-object v1, p0, Ll/ۤۖۛ;->ܺ:[I

    .line 325
    :cond_2
    iget-object v0, p0, Ll/ۤۖۛ;->ܺ:[I

    aput p1, v0, v3

    return-void
.end method

.method public final ۙ(Ll/ۘۡۛ;)V
    .locals 3

    .line 391
    iget-short v0, p0, Ll/ۤۖۛ;->᩷:S

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_0

    .line 392
    iget v0, p1, Ll/ۘۡۛ;->᩷:I

    int-to-short v0, v0

    .line 393
    iget-short v1, p0, Ll/ۤۖۛ;->۫:S

    const v2, 0xffff

    and-int/2addr v1, v2

    invoke-virtual {p1, v1}, Ll/ۘۡۛ;->ۤ(I)V

    .line 394
    iput-short v0, p0, Ll/ۤۖۛ;->۫:S

    return-void

    .line 396
    :cond_0
    iget v0, p0, Ll/ۤۖۛ;->ۙ:I

    invoke-virtual {p1, v0}, Ll/ۘۡۛ;->ۤ(I)V

    return-void
.end method

.method public final ۙ(Ll/ۘۡۛ;IZ)V
    .locals 2

    .line 364
    iget-short v0, p0, Ll/ۤۖۛ;->᩷:S

    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_1

    .line 365
    iget v0, p1, Ll/ۘۡۛ;->᩷:I

    int-to-short v0, v0

    const v1, 0xffff

    if-eqz p3, :cond_0

    .line 367
    iget-short p3, p0, Ll/ۤۖۛ;->ۚ:S

    and-int/2addr p3, v1

    invoke-virtual {p1, p3}, Ll/ۘۡۛ;->ۤ(I)V

    .line 368
    invoke-virtual {p1, p2}, Ll/ۘۡۛ;->ۤ(I)V

    .line 369
    iput-short v0, p0, Ll/ۤۖۛ;->ۚ:S

    return-void

    .line 371
    :cond_0
    iget-short p2, p0, Ll/ۤۖۛ;->ܳ:S

    and-int/2addr p2, v1

    invoke-virtual {p1, p2}, Ll/ۘۡۛ;->ۤ(I)V

    .line 372
    iput-short v0, p0, Ll/ۤۖۛ;->ܳ:S

    return-void

    :cond_1
    if-eqz p3, :cond_2

    .line 376
    iget p3, p0, Ll/ۤۖۛ;->ۙ:I

    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ۘۡۛ;->᩷(I)V

    return-void

    .line 378
    :cond_2
    iget p3, p0, Ll/ۤۖۛ;->ۙ:I

    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, Ll/ۘۡۛ;->ۤ(I)V

    return-void
.end method

.method public final ۙ(Ll/ۤۖۛ;Ll/᩷ۖۛ;Ll/۟ۡۛ;)V
    .locals 8

    .line 548
    sget-object v0, Ll/ۤۖۛ;->᩵:Ll/ۤۖۛ;

    iput-object v0, p0, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    const/4 v1, 0x0

    move-object v2, p0

    move-object v3, v0

    :goto_0
    if-eq v2, v0, :cond_2

    .line 553
    iget-object v4, v2, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    .line 554
    iput-object v3, v2, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    .line 560
    iget-short v3, v2, Ll/ۤۖۛ;->᩷:S

    and-int/lit8 v3, v3, 0x40

    if-eqz v3, :cond_1

    iget-short v3, v2, Ll/ۤۖۛ;->ۗ:S

    iget-short v5, p1, Ll/ۤۖۛ;->ۗ:S

    if-eq v3, v5, :cond_1

    if-nez v1, :cond_0

    .line 566
    new-instance v1, Ll/ۖۡۛ;

    iget-short v3, v2, Ll/ۤۖۛ;->᩹:S

    iget-object v5, p1, Ll/ۤۖۛ;->ܽ:Ll/ۖۡۛ;

    iget-object v5, v5, Ll/ۖۡۛ;->ۤ:Ll/ۤۖۛ;

    iget-object v6, v2, Ll/ۤۖۛ;->ܽ:Ll/ۖۡۛ;

    invoke-direct {v1, v3, v5, v6}, Ll/ۖۡۛ;-><init>(ILl/ۤۖۛ;Ll/ۖۡۛ;)V

    iput-object v1, v2, Ll/ۤۖۛ;->ܽ:Ll/ۖۡۛ;

    const/4 v1, 0x1

    goto :goto_1

    .line 563
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Multiple rets to single jsr"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 580
    :cond_1
    :goto_1
    invoke-direct {v2, v4, p2, p3}, Ll/ۤۖۛ;->᩷(Ll/ۤۖۛ;Ll/᩷ۖۛ;Ll/۟ۡۛ;)Ll/ۤۖۛ;

    move-result-object v3

    move-object v7, v3

    move-object v3, v2

    move-object v2, v7

    goto :goto_0

    :cond_2
    :goto_2
    if-eq v3, v0, :cond_3

    .line 585
    iget-object p1, v3, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    const/4 p2, 0x0

    .line 586
    iput-object p2, v3, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    move-object v3, p1

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final ۙ(Ll/ܳۖۛ;Z)V
    .locals 2

    .line 336
    invoke-virtual {p1, p0}, Ll/ܳۖۛ;->ۙ(Ll/ۤۖۛ;)V

    if-eqz p2, :cond_0

    .line 337
    iget-short p2, p0, Ll/ۤۖۛ;->᩷:S

    and-int/lit16 p2, p2, 0x80

    if-eqz p2, :cond_0

    .line 338
    iget-short p2, p0, Ll/ۤۖۛ;->֫:S

    const v0, 0xffff

    and-int/2addr p2, v0

    invoke-virtual {p1, p2, p0}, Ll/ܳۖۛ;->᩷(ILl/ۤۖۛ;)V

    .line 339
    iget-object p2, p0, Ll/ۤۖۛ;->ܺ:[I

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 340
    :goto_0
    iget-object v0, p0, Ll/ۤۖۛ;->ܺ:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    if-gt p2, v1, :cond_0

    .line 341
    aget v0, v0, p2

    invoke-virtual {p1, v0, p0}, Ll/ܳۖۛ;->᩷(ILl/ۤۖۛ;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(SLl/᩷ۖۛ;Ll/۟ۡۛ;)V
    .locals 4

    .line 504
    sget-object v0, Ll/ۤۖۛ;->᩵:Ll/ۤۖۛ;

    iput-object v0, p0, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    move-object v1, p0

    :goto_0
    if-eq v1, v0, :cond_1

    .line 508
    iget-object v2, v1, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    const/4 v3, 0x0

    .line 509
    iput-object v3, v1, Ll/ۤۖۛ;->᩻:Ll/ۤۖۛ;

    .line 513
    iget-short v3, v1, Ll/ۤۖۛ;->ۗ:S

    if-nez v3, :cond_0

    .line 514
    iput-short p1, v1, Ll/ۤۖۛ;->ۗ:S

    .line 516
    invoke-direct {v1, v2, p2, p3}, Ll/ۤۖۛ;->᩷(Ll/ۤۖۛ;Ll/᩷ۖۛ;Ll/۟ۡۛ;)Ll/ۤۖۛ;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۙ([BLl/ۘۡۛ;I)Z
    .locals 9

    .line 419
    iget-short v0, p0, Ll/ۤۖۛ;->᩷:S

    or-int/lit8 v0, v0, 0x4

    int-to-short v0, v0

    iput-short v0, p0, Ll/ۤۖۛ;->᩷:S

    .line 420
    iput p3, p0, Ll/ۤۖۛ;->ۙ:I

    const/4 v0, 0x0

    const v1, 0xffff

    if-le p3, v1, :cond_0

    return v0

    .line 426
    :cond_0
    iget-short v2, p0, Ll/ۤۖۛ;->ܳ:S

    and-int/2addr v2, v1

    const/4 v3, 0x0

    :goto_0
    if-eqz v2, :cond_4

    .line 428
    aget-byte v4, p1, v2

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    add-int/lit8 v5, v2, 0x1

    aget-byte v6, p1, v5

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v4, v6

    add-int/lit8 v6, v2, -0x1

    sub-int v7, p3, v6

    const/16 v8, -0x8000

    if-lt v7, v8, :cond_1

    const/16 v8, 0x7fff

    if-le v7, v8, :cond_3

    .line 436
    :cond_1
    aget-byte v3, p1, v6

    and-int/lit16 v3, v3, 0xff

    const/16 v8, 0xc6

    if-ge v3, v8, :cond_2

    add-int/lit8 v3, v3, 0x31

    int-to-byte v3, v3

    .line 439
    aput-byte v3, p1, v6

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x14

    int-to-byte v3, v3

    .line 442
    aput-byte v3, p1, v6

    :goto_1
    const/4 v3, 0x1

    :cond_3
    ushr-int/lit8 v6, v7, 0x8

    int-to-byte v6, v6

    .line 446
    aput-byte v6, p1, v2

    int-to-byte v2, v7

    .line 447
    aput-byte v2, p1, v5

    move v2, v4

    goto :goto_0

    .line 451
    :cond_4
    iget-short v2, p0, Ll/ۤۖۛ;->ۚ:S

    and-int/2addr v2, v1

    :goto_2
    if-eqz v2, :cond_5

    .line 453
    aget-byte v4, p1, v2

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    add-int/lit8 v5, v2, 0x1

    aget-byte v6, p1, v5

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v4, v6

    add-int/lit8 v6, v2, 0x2

    .line 454
    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/lit8 v6, v6, 0x8

    add-int/lit8 v7, v2, 0x3

    aget-byte v7, p1, v7

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v6, v7

    sub-int v6, p3, v6

    ushr-int/lit8 v7, v6, 0x18

    int-to-byte v7, v7

    .line 457
    aput-byte v7, p1, v2

    add-int/lit8 v7, v2, 0x2

    ushr-int/lit8 v8, v6, 0x10

    int-to-byte v8, v8

    .line 458
    aput-byte v8, p1, v5

    add-int/lit8 v2, v2, 0x3

    ushr-int/lit8 v5, v6, 0x8

    int-to-byte v5, v5

    .line 459
    aput-byte v5, p1, v7

    int-to-byte v5, v6

    .line 460
    aput-byte v5, p1, v2

    move v2, v4

    goto :goto_2

    .line 464
    :cond_5
    iget-short p1, p0, Ll/ۤۖۛ;->۫:S

    and-int/2addr p1, v1

    :goto_3
    if-eqz p1, :cond_6

    .line 466
    iget-object v1, p2, Ll/ۘۡۛ;->ۙ:[B

    .line 467
    aget-byte v2, v1, p1

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    add-int/lit8 v4, p1, 0x1

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v2, v5

    ushr-int/lit8 v5, p3, 0x8

    int-to-byte v5, v5

    .line 468
    aput-byte v5, v1, p1

    int-to-byte p1, p3

    .line 469
    aput-byte p1, v1, v4

    move p1, v2

    goto :goto_3

    .line 473
    :cond_6
    iput-short v0, p0, Ll/ۤۖۛ;->ܳ:S

    .line 474
    iput-short v0, p0, Ll/ۤۖۛ;->ۚ:S

    .line 475
    iput-short v0, p0, Ll/ۤۖۛ;->۫:S

    return v3
.end method
