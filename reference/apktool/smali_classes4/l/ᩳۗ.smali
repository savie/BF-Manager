.class public final Ll/ᩳۗ;
.super Ljava/lang/Object;
.source "86CV"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public synthetic ֡:[Ljava/lang/Object;

.field public synthetic ܰ:Z

.field public synthetic ܿ:I

.field public synthetic ᩶:[J


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    :goto_0
    const/16 v1, 0x20

    const/16 v2, 0x50

    if-ge v0, v1, :cond_1

    const/4 v1, 0x1

    shl-int/2addr v1, v0

    add-int/lit8 v1, v1, -0xc

    if-gt v2, v1, :cond_0

    move v2, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    div-int/lit8 v2, v2, 0x8

    .line 77
    new-array v0, v2, [J

    iput-object v0, p0, Ll/ᩳۗ;->᩶:[J

    .line 78
    new-array v0, v2, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 51
    invoke-virtual {p0}, Ll/ᩳۗ;->clone()Ll/ᩳۗ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ᩳۗ;
    .locals 2

    .line 84
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ᩳۗ;

    .line 85
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    iput-object v1, v0, Ll/ᩳۗ;->᩶:[J

    .line 86
    iget-object v1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 520
    invoke-virtual {p0}, Ll/ᩳۗ;->᩷()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    .line 523
    :cond_0
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    mul-int/lit8 v0, v0, 0x1c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v0, 0x7b

    .line 524
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 525
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    if-lez v2, :cond_1

    const-string v3, ", "

    .line 527
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    :cond_1
    invoke-virtual {p0, v2}, Ll/ᩳۗ;->ۙ(I)J

    move-result-wide v3

    .line 530
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    .line 531
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 532
    invoke-virtual {p0, v2}, Ll/ᩳۗ;->ۤ(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_2

    .line 534
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "(this Map)"

    .line 536
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/16 v0, 0x7d

    .line 539
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 523
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ(I)J
    .locals 9

    if-ltz p1, :cond_4

    .line 420
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    if-ge p1, v0, :cond_4

    .line 424
    iget-boolean v1, p0, Ll/ᩳۗ;->ܰ:Z

    if-eqz v1, :cond_3

    .line 330
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    .line 331
    iget-object v2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    .line 333
    aget-object v6, v2, v4

    .line 334
    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v7

    if-eq v6, v7, :cond_1

    if-eq v4, v5, :cond_0

    .line 336
    aget-wide v7, v1, v4

    aput-wide v7, v1, v5

    .line 337
    aput-object v6, v2, v5

    const/4 v6, 0x0

    .line 338
    aput-object v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 343
    :cond_2
    iput-boolean v3, p0, Ll/ᩳۗ;->ܰ:Z

    .line 344
    iput v5, p0, Ll/ᩳۗ;->ܿ:I

    .line 427
    :cond_3
    iget-object v0, p0, Ll/ᩳۗ;->᩶:[J

    aget-wide v1, v0, p1

    return-wide v1

    :cond_4
    const-string v0, "Expected index to be within 0..size()-1, but was "

    .line 0
    invoke-static {p1, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 420
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(J)Ljava/lang/Object;
    .locals 2

    .line 256
    iget-object v0, p0, Ll/ᩳۗ;->᩶:[J

    iget v1, p0, Ll/ᩳۗ;->ܿ:I

    invoke-static {p1, p2, v0, v1}, Ll/ۜۗ;->ۙ(J[JI)I

    move-result p1

    if-ltz p1, :cond_1

    .line 257
    iget-object p2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aget-object p2, p2, p1

    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v0

    if-ne p2, v0, :cond_0

    goto :goto_0

    .line 261
    :cond_0
    iget-object p2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۙ()V
    .locals 5

    .line 489
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    .line 490
    iget-object v1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    const/4 v4, 0x0

    .line 492
    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 494
    :cond_0
    iput v2, p0, Ll/ᩳۗ;->ܿ:I

    .line 495
    iput-boolean v2, p0, Ll/ᩳۗ;->ܰ:Z

    return-void
.end method

.method public final ۙ(JLjava/lang/Long;)V
    .locals 9

    .line 500
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    add-int/lit8 v2, v0, -0x1

    aget-wide v2, v1, v2

    cmp-long v1, p1, v2

    if-gtz v1, :cond_0

    .line 501
    invoke-virtual {p0, p1, p2, p3}, Ll/ᩳۗ;->ۙ(JLjava/lang/Object;)V

    return-void

    .line 504
    :cond_0
    iget-boolean v1, p0, Ll/ᩳۗ;->ܰ:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    array-length v2, v1

    if-lt v0, v2, :cond_4

    .line 331
    iget-object v2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_3

    .line 333
    aget-object v6, v2, v4

    .line 334
    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v7

    if-eq v6, v7, :cond_2

    if-eq v4, v5, :cond_1

    .line 336
    aget-wide v7, v1, v4

    aput-wide v7, v1, v5

    .line 337
    aput-object v6, v2, v5

    const/4 v6, 0x0

    .line 338
    aput-object v6, v2, v4

    :cond_1
    add-int/lit8 v5, v5, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 343
    :cond_3
    iput-boolean v3, p0, Ll/ᩳۗ;->ܰ:Z

    .line 344
    iput v5, p0, Ll/ᩳۗ;->ܿ:I

    .line 507
    :cond_4
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    .line 508
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    array-length v1, v1

    const/4 v2, 0x1

    if-lt v0, v1, :cond_7

    add-int/lit8 v1, v0, 0x1

    mul-int/lit8 v1, v1, 0x8

    const/4 v3, 0x4

    :goto_1
    const/16 v4, 0x20

    if-ge v3, v4, :cond_6

    shl-int v4, v2, v3

    add-int/lit8 v4, v4, -0xc

    if-gt v1, v4, :cond_5

    move v1, v4

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 35
    :cond_6
    :goto_2
    div-int/lit8 v1, v1, 0x8

    .line 510
    iget-object v3, p0, Ll/ᩳۗ;->᩶:[J

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    const-string v4, "copyOf(this, newSize)"

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, Ll/ᩳۗ;->᩶:[J

    .line 511
    iget-object v3, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    .line 513
    :cond_7
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    aput-wide p1, v1, v0

    .line 514
    iget-object p1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aput-object p3, p1, v0

    add-int/2addr v0, v2

    .line 515
    iput v0, p0, Ll/ᩳۗ;->ܿ:I

    return-void
.end method

.method public final ۙ(JLjava/lang/Object;)V
    .locals 9

    .line 349
    iget-object v0, p0, Ll/ᩳۗ;->᩶:[J

    iget v1, p0, Ll/ᩳۗ;->ܿ:I

    invoke-static {p1, p2, v0, v1}, Ll/ۜۗ;->ۙ(J[JI)I

    move-result v0

    if-ltz v0, :cond_0

    .line 351
    iget-object p1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aput-object p3, p1, v0

    return-void

    :cond_0
    not-int v0, v0

    .line 354
    iget v1, p0, Ll/ᩳۗ;->ܿ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    .line 355
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    aput-wide p1, v1, v0

    .line 356
    iget-object p1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aput-object p3, p1, v0

    return-void

    .line 359
    :cond_1
    iget-boolean v1, p0, Ll/ᩳۗ;->ܰ:Z

    if-eqz v1, :cond_5

    iget v1, p0, Ll/ᩳۗ;->ܿ:I

    iget-object v2, p0, Ll/ᩳۗ;->᩶:[J

    array-length v3, v2

    if-lt v1, v3, :cond_5

    .line 331
    iget-object v0, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v1, :cond_4

    .line 333
    aget-object v6, v0, v4

    .line 334
    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v7

    if-eq v6, v7, :cond_3

    if-eq v4, v5, :cond_2

    .line 336
    aget-wide v7, v2, v4

    aput-wide v7, v2, v5

    .line 337
    aput-object v6, v0, v5

    const/4 v6, 0x0

    .line 338
    aput-object v6, v0, v4

    :cond_2
    add-int/lit8 v5, v5, 0x1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 343
    :cond_4
    iput-boolean v3, p0, Ll/ᩳۗ;->ܰ:Z

    .line 344
    iput v5, p0, Ll/ᩳۗ;->ܿ:I

    .line 363
    iget-object v0, p0, Ll/ᩳۗ;->᩶:[J

    invoke-static {p1, p2, v0, v5}, Ll/ۜۗ;->ۙ(J[JI)I

    move-result v0

    not-int v0, v0

    .line 365
    :cond_5
    iget v1, p0, Ll/ᩳۗ;->ܿ:I

    iget-object v2, p0, Ll/ᩳۗ;->᩶:[J

    array-length v2, v2

    const/4 v3, 0x1

    if-lt v1, v2, :cond_8

    add-int/2addr v1, v3

    mul-int/lit8 v1, v1, 0x8

    const/4 v2, 0x4

    :goto_1
    const/16 v4, 0x20

    if-ge v2, v4, :cond_7

    shl-int v4, v3, v2

    add-int/lit8 v4, v4, -0xc

    if-gt v1, v4, :cond_6

    move v1, v4

    goto :goto_2

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 35
    :cond_7
    :goto_2
    div-int/lit8 v1, v1, 0x8

    .line 367
    iget-object v2, p0, Ll/ᩳۗ;->᩶:[J

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    const-string v4, "copyOf(this, newSize)"

    invoke-static {v2, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Ll/ᩳۗ;->᩶:[J

    .line 368
    iget-object v2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    .line 370
    :cond_8
    iget v1, p0, Ll/ᩳۗ;->ܿ:I

    sub-int/2addr v1, v0

    if-eqz v1, :cond_9

    .line 371
    iget-object v2, p0, Ll/ᩳۗ;->᩶:[J

    add-int/lit8 v4, v0, 0x1

    const-string v5, "<this>"

    .line 0
    invoke-static {v2, v5}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1029
    invoke-static {v2, v0, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 377
    iget-object v1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    .line 381
    iget v2, p0, Ll/ᩳۗ;->ܿ:I

    .line 377
    invoke-static {v4, v0, v2, v1, v1}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 384
    :cond_9
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    aput-wide p1, v1, v0

    .line 385
    iget-object p1, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aput-object p3, p1, v0

    .line 386
    iget p1, p0, Ll/ᩳۗ;->ܿ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ᩳۗ;->ܿ:I

    return-void
.end method

.method public final ۤ(I)Ljava/lang/Object;
    .locals 9

    if-ltz p1, :cond_4

    .line 432
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    if-ge p1, v0, :cond_4

    .line 436
    iget-boolean v1, p0, Ll/ᩳۗ;->ܰ:Z

    if-eqz v1, :cond_3

    .line 330
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    .line 331
    iget-object v2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    .line 333
    aget-object v6, v2, v4

    .line 334
    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v7

    if-eq v6, v7, :cond_1

    if-eq v4, v5, :cond_0

    .line 336
    aget-wide v7, v1, v4

    aput-wide v7, v1, v5

    .line 337
    aput-object v6, v2, v5

    const/4 v6, 0x0

    .line 338
    aput-object v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 343
    :cond_2
    iput-boolean v3, p0, Ll/ᩳۗ;->ܰ:Z

    .line 344
    iput v5, p0, Ll/ᩳۗ;->ܿ:I

    .line 441
    :cond_3
    iget-object v0, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1

    :cond_4
    const-string v0, "Expected index to be within 0..size()-1, but was "

    .line 0
    invoke-static {p1, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 432
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()I
    .locals 9

    .line 409
    iget-boolean v0, p0, Ll/ᩳۗ;->ܰ:Z

    if-eqz v0, :cond_3

    .line 328
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    .line 330
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    .line 331
    iget-object v2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    .line 333
    aget-object v6, v2, v4

    .line 334
    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v7

    if-eq v6, v7, :cond_1

    if-eq v4, v5, :cond_0

    .line 336
    aget-wide v7, v1, v4

    aput-wide v7, v1, v5

    .line 337
    aput-object v6, v2, v5

    const/4 v6, 0x0

    .line 338
    aput-object v6, v2, v4

    :cond_0
    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 343
    :cond_2
    iput-boolean v3, p0, Ll/ᩳۗ;->ܰ:Z

    .line 344
    iput v5, p0, Ll/ᩳۗ;->ܿ:I

    .line 412
    :cond_3
    iget v0, p0, Ll/ᩳۗ;->ܿ:I

    return v0
.end method

.method public final ᩷(J)Ljava/lang/Object;
    .locals 3

    const-wide/16 v0, -0x1

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 256
    iget-object v1, p0, Ll/ᩳۗ;->᩶:[J

    iget v2, p0, Ll/ᩳۗ;->ܿ:I

    invoke-static {p1, p2, v1, v2}, Ll/ۜۗ;->ۙ(J[JI)I

    move-result p1

    if-ltz p1, :cond_1

    .line 257
    iget-object p2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aget-object p2, p2, p1

    invoke-static {}, Ll/ۢۗ;->ۙ()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_0

    goto :goto_0

    .line 261
    :cond_0
    iget-object p2, p0, Ll/ᩳۗ;->֡:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1

    :cond_1
    :goto_0
    return-object v0
.end method
