.class public final Ll/ۗܳܳ;
.super Ljava/lang/Object;
.source "D70T"


# instance fields
.field public final ۙ:[J

.field public final ۤ:J

.field public final ᩷:[Ll/֡۫ܳ;

.field public final ᩸:J


# direct methods
.method public constructor <init>([Ll/֡۫ܳ;[JJJ)V
    .locals 0

    .line 5508
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5509
    iput-object p1, p0, Ll/ۗܳܳ;->᩷:[Ll/֡۫ܳ;

    .line 5510
    iput-object p2, p0, Ll/ۗܳܳ;->ۙ:[J

    .line 5511
    iput-wide p3, p0, Ll/ۗܳܳ;->᩸:J

    .line 5512
    iput-wide p5, p0, Ll/ۗܳܳ;->ۤ:J

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۗܳܳ;)[Ll/֡۫ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۗܳܳ;->᩷:[Ll/֡۫ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۗܳܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۗܳܳ;->᩸:J

    return-wide v0
.end method


# virtual methods
.method public final ۙ()J
    .locals 2

    .line 5623
    iget-wide v0, p0, Ll/ۗܳܳ;->ۤ:J

    return-wide v0
.end method

.method public final ۙ(J)Ll/᩹ܳܳ;
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3

    .line 5541
    iget-wide v2, p0, Ll/ۗܳܳ;->᩸:J

    cmp-long v4, p1, v2

    if-gez v4, :cond_3

    .line 5545
    iget-object v2, p0, Ll/ۗܳܳ;->ۙ:[J

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_1

    add-int v4, v6, v3

    ushr-int/lit8 v4, v4, 0x1

    .line 5548
    aget-wide v7, v2, v4

    cmp-long v5, v7, p1

    if-gtz v5, :cond_0

    add-int/lit8 v6, v4, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    goto :goto_0

    :cond_1
    if-nez v6, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v6, -0x1

    .line 5554
    aget-wide v0, v2, v0

    :goto_1
    sub-long v0, p1, v0

    long-to-int v7, v0

    .line 5556
    new-instance v0, Ll/᩹ܳܳ;

    iget-object v1, p0, Ll/ۗܳܳ;->᩷:[Ll/֡۫ܳ;

    aget-object v1, v1, v6

    .line 5557
    invoke-virtual {v1, v7}, Ll/֡۫ܳ;->ۤ(I)I

    move-result v10

    move-object v4, v0

    move-object v5, p0

    move-wide v8, p1

    invoke-direct/range {v4 .. v10}, Ll/᩹ܳܳ;-><init>(Ll/ۗܳܳ;IIJI)V

    return-object v0

    .line 5542
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Match ordinal "

    .line 0
    invoke-static {p1, p2, v1}, Ll/᩻ۗ᩹;->ۙ(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5542
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ljava/io/DataOutputStream;)V
    .locals 5

    .line 5562
    iget-object v0, p0, Ll/ۗܳܳ;->᩷:[Ll/֡۫ܳ;

    array-length v1, v0

    invoke-virtual {p1, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 5563
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    .line 5564
    invoke-virtual {v4, p1, v2}, Ll/֡۫ܳ;->ۙ(Ljava/io/DataOutputStream;I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(I)Z
    .locals 12

    .line 5608
    iget-object v0, p0, Ll/ۗܳܳ;->᩷:[Ll/֡۫ܳ;

    array-length v1, v0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v1, :cond_2

    aget-object v6, v0, v4

    .line 5609
    invoke-virtual {v6, v3}, Ll/֡۫ܳ;->ۤ(I)I

    move-result v7

    if-ltz v2, :cond_0

    int-to-long v8, v2

    int-to-long v10, p1

    add-long/2addr v8, v10

    int-to-long v10, v7

    cmp-long v2, v8, v10

    if-lez v2, :cond_0

    goto :goto_1

    .line 5613
    :cond_0
    invoke-virtual {v6, p1}, Ll/֡۫ܳ;->ۙ(I)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_1
    return v3

    .line 5616
    :cond_1
    invoke-virtual {v6}, Ll/֡۫ܳ;->ۤ()I

    move-result v2

    sub-int/2addr v2, v5

    invoke-virtual {v6, v2}, Ll/֡۫ܳ;->ۤ(I)I

    move-result v2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return v5
.end method

.method public final ᩷(J)I
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3

    .line 5522
    iget-wide v2, p0, Ll/ۗܳܳ;->᩸:J

    cmp-long v4, p1, v2

    if-gez v4, :cond_3

    .line 5526
    iget-object v2, p0, Ll/ۗܳܳ;->ۙ:[J

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    add-int v5, v4, v3

    ushr-int/lit8 v5, v5, 0x1

    .line 5529
    aget-wide v6, v2, v5

    cmp-long v8, v6, p1

    if-gtz v8, :cond_0

    add-int/lit8 v4, v5, 0x1

    goto :goto_0

    :cond_0
    move v3, v5

    goto :goto_0

    :cond_1
    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v4, -0x1

    .line 5535
    aget-wide v0, v2, v0

    .line 5536
    :goto_1
    iget-object v2, p0, Ll/ۗܳܳ;->᩷:[Ll/֡۫ܳ;

    aget-object v2, v2, v4

    sub-long/2addr p1, v0

    long-to-int p2, p1

    invoke-virtual {v2, p2}, Ll/֡۫ܳ;->ۤ(I)I

    move-result p1

    return p1

    .line 5523
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Match ordinal "

    .line 0
    invoke-static {p1, p2, v1}, Ll/᩻ۗ᩹;->ۙ(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 5523
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩷()J
    .locals 2

    .line 5517
    iget-wide v0, p0, Ll/ۗܳܳ;->᩸:J

    return-wide v0
.end method
