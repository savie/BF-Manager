.class public final Ll/ܿۗ;
.super Ljava/lang/Object;
.source "M6I2"

# interfaces
.implements Ljava/util/Collection;
.implements Ljava/util/Set;


# instance fields
.field public ܰ:I

.field public ܿ:[I

.field public ᩶:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    sget-object v0, Ll/ۜۗ;->ۙ:[I

    iput-object v0, p0, Ll/ܿۗ;->ܿ:[I

    .line 51
    sget-object v0, Ll/ۜۗ;->᩷:[Ljava/lang/Object;

    iput-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    if-lez p1, :cond_0

    .line 88
    invoke-static {p0, p1}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 8

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 v2, 0x0

    .line 295
    invoke-static {p0, v2, v1}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I

    move-result v2

    const/4 v3, 0x0

    goto :goto_0

    .line 362
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    .line 363
    invoke-static {p0, p1, v3}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I

    move-result v2

    :goto_0
    if-ltz v2, :cond_1

    return v1

    :cond_1
    not-int v2, v2

    .line 50
    iget-object v4, p0, Ll/ܿۗ;->ܿ:[I

    .line 371
    array-length v5, v4

    if-lt v0, v5, :cond_6

    const/16 v5, 0x8

    if-lt v0, v5, :cond_2

    shr-int/lit8 v5, v0, 0x1

    add-int/2addr v5, v0

    goto :goto_1

    :cond_2
    const/4 v6, 0x4

    if-lt v0, v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x4

    .line 51
    :goto_1
    iget-object v6, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 381
    invoke-static {p0, v5}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;I)V

    .line 53
    iget v5, p0, Ll/ܿۗ;->ܰ:I

    if-ne v0, v5, :cond_5

    .line 50
    iget-object v5, p0, Ll/ܿۗ;->ܿ:[I

    .line 387
    array-length v7, v5

    if-nez v7, :cond_4

    goto :goto_2

    .line 388
    :cond_4
    array-length v7, v4

    .line 1004
    invoke-static {v1, v1, v4, v5, v7}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 51
    iget-object v4, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 389
    array-length v5, v6

    const/4 v7, 0x6

    invoke-static {v1, v5, v7, v6, v4}, Ll/᩶۟᩵;->᩷(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_2

    .line 384
    :cond_5
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_6
    :goto_2
    if-ge v2, v0, :cond_7

    .line 50
    iget-object v1, p0, Ll/ܿۗ;->ܿ:[I

    add-int/lit8 v4, v2, 0x1

    .line 394
    invoke-static {v4, v2, v1, v1, v0}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 51
    iget-object v1, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 400
    invoke-static {v4, v2, v0, v1, v1}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 53
    :cond_7
    iget v1, p0, Ll/ܿۗ;->ܰ:I

    if-ne v0, v1, :cond_8

    .line 50
    iget-object v0, p0, Ll/ܿۗ;->ܿ:[I

    .line 408
    array-length v4, v0

    if-ge v2, v4, :cond_8

    .line 412
    aput v3, v0, v2

    .line 51
    iget-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 413
    aput-object p1, v0, v2

    const/4 p1, 0x1

    add-int/2addr v1, p1

    .line 53
    iput v1, p0, Ll/ܿۗ;->ܰ:I

    return p1

    .line 409
    :cond_8
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 6

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    .line 601
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v1, v0

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    .line 50
    iget-object v2, p0, Ll/ܿۗ;->ܿ:[I

    .line 318
    array-length v3, v2

    const/4 v4, 0x0

    if-ge v3, v1, :cond_0

    .line 51
    iget-object v3, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 321
    invoke-static {p0, v1}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;I)V

    .line 53
    iget v1, p0, Ll/ܿۗ;->ܰ:I

    if-lez v1, :cond_0

    .line 50
    iget-object v5, p0, Ll/ܿۗ;->ܿ:[I

    .line 1004
    invoke-static {v4, v4, v2, v5, v1}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 51
    iget-object v1, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 53
    iget v2, p0, Ll/ܿۗ;->ܰ:I

    const/4 v5, 0x6

    .line 324
    invoke-static {v4, v2, v5, v3, v1}, Ll/᩶۟᩵;->᩷(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 53
    :cond_0
    iget v1, p0, Ll/ܿۗ;->ܰ:I

    if-ne v1, v0, :cond_2

    .line 603
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 604
    invoke-virtual {p0, v0}, Ll/ܿۗ;->add(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v4, v0

    goto :goto_0

    :cond_1
    return v4

    .line 328
    :cond_2
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    if-eqz v0, :cond_0

    .line 305
    sget-object v0, Ll/ۜۗ;->ۙ:[I

    .line 50
    iput-object v0, p0, Ll/ܿۗ;->ܿ:[I

    .line 306
    sget-object v0, Ll/ۜۗ;->᩷:[Ljava/lang/Object;

    .line 51
    iput-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 53
    iput v0, p0, Ll/ܿۗ;->ܰ:I

    :cond_0
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    if-nez v0, :cond_1

    return-void

    .line 311
    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 295
    invoke-static {p0, p1, v0}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I

    move-result p1

    goto :goto_0

    .line 339
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {p0, p1, v1}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 591
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 592
    invoke-virtual {p0, v0}, Ll/ܿۗ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 534
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    .line 55
    iget v1, p0, Ll/ܿۗ;->ܰ:I

    .line 535
    move-object v3, p1

    check-cast v3, Ljava/util/Set;

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v3

    if-eq v1, v3, :cond_1

    return v2

    .line 53
    :cond_1
    :try_start_0
    iget v1, p0, Ll/ܿۗ;->ܰ:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 51
    iget-object v4, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 345
    aget-object v4, v4, v3

    .line 541
    move-object v5, p1

    check-cast v5, Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v4, :cond_2

    return v2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v0

    :catch_0
    :cond_4
    return v2
.end method

.method public final hashCode()I
    .locals 5

    .line 50
    iget-object v0, p0, Ll/ܿۗ;->ܿ:[I

    .line 53
    iget v1, p0, Ll/ܿۗ;->ܰ:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 561
    aget v4, v0, v2

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final isEmpty()Z
    .locals 1

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 249
    new-instance v0, Ll/᩶ۗ;

    invoke-direct {v0, p0}, Ll/᩶ۗ;-><init>(Ll/ܿۗ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 295
    invoke-static {p0, p1, v0}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I

    move-result p1

    goto :goto_0

    .line 339
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {p0, p1, v1}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I

    move-result p1

    :goto_0
    if-ltz p1, :cond_1

    .line 442
    invoke-virtual {p0, p1}, Ll/ܿۗ;->ۙ(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 612
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 613
    invoke-virtual {p0, v1}, Ll/ܿۗ;->remove(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 3

    const-string v0, "elements"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-ge v2, v0, :cond_1

    .line 51
    iget-object v2, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 622
    aget-object v2, v2, v0

    .line 77
    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 623
    invoke-virtual {p0, v0}, Ll/ܿۗ;->ۙ(I)Ljava/lang/Object;

    const/4 v1, 0x1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public final size()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 3

    .line 202
    iget-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Ll/ܿۗ;->ܰ:I

    invoke-static {v1, v2, v0}, Ll/᩶۟᩵;->ۙ(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    const-string v0, "array"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    .line 30
    array-length v1, p1

    if-ge v1, v0, :cond_0

    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    goto :goto_0

    .line 33
    :cond_0
    array-length v1, p1

    if-le v1, v0, :cond_1

    const/4 v1, 0x0

    .line 34
    aput-object v1, p1, v0

    .line 210
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    iget v1, p0, Ll/ܿۗ;->ܰ:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v1, v0, p1}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 568
    invoke-virtual {p0}, Ll/ܿۗ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    .line 53
    :cond_0
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    mul-int/lit8 v0, v0, 0xe

    .line 572
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v0, 0x7b

    .line 573
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    if-lez v2, :cond_1

    const-string v3, ", "

    .line 576
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    :cond_1
    iget-object v3, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 345
    aget-object v3, v3, v2

    if-eq v3, p0, :cond_2

    .line 580
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "(this Set)"

    .line 582
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/16 v0, 0x7d

    .line 585
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 572
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder(capacity).\u2026builderAction).toString()"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ۙ(I)Ljava/lang/Object;
    .locals 8

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    .line 51
    iget-object v1, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 451
    aget-object v2, v1, p1

    const/4 v3, 0x1

    if-gt v0, v3, :cond_0

    .line 454
    invoke-virtual {p0}, Ll/ܿۗ;->clear()V

    return-object v2

    :cond_0
    add-int/lit8 v3, v0, -0x1

    .line 50
    iget-object v4, p0, Ll/ܿۗ;->ܿ:[I

    .line 457
    array-length v5, v4

    const/16 v6, 0x8

    if-le v5, v6, :cond_3

    array-length v5, v4

    div-int/lit8 v5, v5, 0x3

    if-ge v0, v5, :cond_3

    if-le v0, v6, :cond_1

    shr-int/lit8 v5, v0, 0x1

    add-int v6, v0, v5

    .line 467
    :cond_1
    invoke-static {p0, v6}, Ll/ۧ֫ܺ;->ۙ(Ll/ܿۗ;I)V

    if-lez p1, :cond_2

    .line 50
    iget-object v5, p0, Ll/ܿۗ;->ܿ:[I

    const/4 v6, 0x0

    .line 1004
    invoke-static {v6, v6, v4, v5, p1}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 51
    iget-object v5, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    const/4 v7, 0x6

    .line 470
    invoke-static {v6, p1, v7, v1, v5}, Ll/᩶۟᩵;->᩷(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_2
    if-ge p1, v3, :cond_5

    .line 50
    iget-object v5, p0, Ll/ܿۗ;->ܿ:[I

    add-int/lit8 v6, p1, 0x1

    .line 473
    invoke-static {p1, v6, v4, v5, v0}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 51
    iget-object v4, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 479
    invoke-static {p1, v6, v0, v1, v4}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    if-ge p1, v3, :cond_4

    add-int/lit8 v1, p1, 0x1

    .line 488
    invoke-static {p1, v1, v4, v4, v0}, Ll/᩶۟᩵;->ۙ(II[I[II)V

    .line 51
    iget-object v4, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 494
    invoke-static {p1, v1, v0, v4, v4}, Ll/᩶۟᩵;->ۙ(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 51
    :cond_4
    iget-object p1, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 501
    aput-object v1, p1, v3

    .line 53
    :cond_5
    :goto_0
    iget p1, p0, Ll/ܿۗ;->ܰ:I

    if-ne v0, p1, :cond_6

    iput v3, p0, Ll/ܿۗ;->ܰ:I

    return-object v2

    .line 504
    :cond_6
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1
.end method

.method public final ۙ([I)V
    .locals 0

    .line 50
    iput-object p1, p0, Ll/ܿۗ;->ܿ:[I

    return-void
.end method

.method public final ۙ([Ljava/lang/Object;)V
    .locals 0

    .line 51
    iput-object p1, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    return-void
.end method

.method public final ۤ()[I
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ܿۗ;->ܿ:[I

    return-object v0
.end method

.method public final ᩷(I)Ljava/lang/Object;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    .line 345
    aget-object p1, v0, p1

    return-object p1
.end method

.method public final ᩷()[Ljava/lang/Object;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ܿۗ;->᩶:[Ljava/lang/Object;

    return-object v0
.end method

.method public final ᩸()I
    .locals 1

    .line 53
    iget v0, p0, Ll/ܿۗ;->ܰ:I

    return v0
.end method
