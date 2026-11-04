.class public final Ll/ۜۙܳ;
.super Ljava/lang/Object;
.source "FIQP"


# instance fields
.field public final ۙ:Ljava/util/function/BooleanSupplier;

.field public final ۤ:[[B

.field public final ᩴ:[I

.field public ᩷:I

.field public final ᩸:Ll/᩸۫ܳ;


# direct methods
.method public constructor <init>(Ll/᩸۫ܳ;Ljava/util/function/BooleanSupplier;)V
    .locals 4

    .line 496
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x4000

    new-array v1, v0, [B

    new-array v0, v0, [B

    const/4 v2, 0x2

    new-array v2, v2, [[B

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 492
    iput-object v2, p0, Ll/ۜۙܳ;->ۤ:[[B

    const/4 v0, -0x1

    .line 493
    filled-new-array {v0, v0}, [I

    move-result-object v0

    iput-object v0, p0, Ll/ۜۙܳ;->ᩴ:[I

    .line 496
    iput-object p1, p0, Ll/ۜۙܳ;->᩸:Ll/᩸۫ܳ;

    iput-object p2, p0, Ll/ۜۙܳ;->ۙ:Ljava/util/function/BooleanSupplier;

    return-void
.end method


# virtual methods
.method public final ۙ(II[B)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    .line 512
    iget-object v2, p0, Ll/ۜۙܳ;->ۙ:Ljava/util/function/BooleanSupplier;

    invoke-static {v2}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    .line 513
    div-int/lit16 v2, p1, 0x4000

    const/16 v3, 0x4000

    mul-int/lit16 v2, v2, 0x4000

    .line 514
    iget-object v4, p0, Ll/ۜۙܳ;->ᩴ:[I

    aget v5, v4, v0

    if-ne v5, v2, :cond_0

    const/4 v5, 0x0

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    aget v6, v4, v5

    if-ne v6, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, -0x1

    .line 515
    :goto_1
    iget-object v6, p0, Ll/ۜۙܳ;->ۤ:[[B

    if-gez v5, :cond_2

    .line 516
    iget v5, p0, Ll/ۜۙܳ;->᩷:I

    xor-int/lit8 v7, v5, 0x1

    iput v7, p0, Ll/ۜۙܳ;->᩷:I

    .line 517
    aget-object v7, v6, v5

    iget-object v8, p0, Ll/ۜۙܳ;->᩸:Ll/᩸۫ܳ;

    invoke-interface {v8}, Ll/᩸۫ܳ;->length()I

    move-result v9

    sub-int/2addr v9, v2

    invoke-static {v3, v9}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-interface {v8, v2, v7, v0, v3}, Ll/᩸۫ܳ;->ۙ(I[BII)V

    .line 518
    aput v2, v4, v5

    :cond_2
    sub-int v3, p2, v1

    sub-int v2, p1, v2

    rsub-int v4, v2, 0x4000

    .line 520
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 521
    aget-object v4, v6, v5

    invoke-static {v4, v2, p3, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p1, v3

    add-int/2addr v1, v3

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ᩷(II[B)V
    .locals 3

    const/16 v0, 0x4000

    if-gt p2, v0, :cond_0

    .line 501
    invoke-virtual {p0, p1, p2, p3}, Ll/ۜۙܳ;->ۙ(II[B)V

    return-void

    .line 503
    :cond_0
    iget-object v0, p0, Ll/ۜۙܳ;->ۙ:Ljava/util/function/BooleanSupplier;

    invoke-static {v0}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    .line 504
    iget-object v1, p0, Ll/ۜۙܳ;->᩸:Ll/᩸۫ܳ;

    const/4 v2, 0x0

    invoke-interface {v1, p1, p3, v2, p2}, Ll/᩸۫ܳ;->ۙ(I[BII)V

    .line 505
    invoke-static {v0}, Ll/۬ۙܳ;->ۙ(Ljava/util/function/BooleanSupplier;)V

    return-void
.end method
