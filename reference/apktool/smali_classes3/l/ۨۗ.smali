.class public final Ll/ۨۗ;
.super Ljava/lang/Object;
.source "J5WP"

# interfaces
.implements Ljava/util/Set;


# instance fields
.field public final synthetic ܰ:Ll/ܰۗ;


# direct methods
.method public constructor <init>(Ll/ܰۗ;)V
    .locals 0

    .line 271
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0

    .line 274
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    .line 279
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1

    .line 284
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 289
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0, p1}, Ll/ۡۗ;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 294
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0, p1}, Ll/ܰۗ;->ۙ(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 626
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 629
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    if-eqz v1, :cond_1

    .line 630
    check-cast p1, Ljava/util/Set;

    .line 331
    :try_start_0
    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v1

    .line 633
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    if-ne v1, v2, :cond_1

    .line 294
    invoke-virtual {v0, p1}, Ll/ܰۗ;->ۙ(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 370
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-ltz v1, :cond_1

    .line 371
    invoke-virtual {v0, v1}, Ll/ۡۗ;->ۤ(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    .line 372
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final isEmpty()Z
    .locals 1

    .line 299
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 305
    new-instance v0, Ll/᩵ۗ;

    iget-object v1, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-direct {v0, v1}, Ll/᩵ۗ;-><init>(Ll/ܰۗ;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 311
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0, p1}, Ll/ۡۗ;->᩷(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    .line 313
    invoke-virtual {v0, p1}, Ll/ۡۗ;->ᩴ(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 321
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0, p1}, Ll/ܰۗ;->᩷(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 326
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0, p1}, Ll/ܰۗ;->ۤ(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 331
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 5

    .line 337
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v1

    .line 338
    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 340
    invoke-virtual {v0, v3}, Ll/ۡۗ;->ۤ(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 4

    .line 331
    iget-object v0, p0, Ll/ۨۗ;->ܰ:Ll/ܰۗ;

    invoke-virtual {v0}, Ll/ۡۗ;->size()I

    move-result v1

    .line 350
    array-length v2, p1

    if-ge v2, v1, :cond_0

    .line 351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 354
    invoke-virtual {v0, v2}, Ll/ۡۗ;->ۤ(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 356
    :cond_1
    array-length v0, p1

    if-le v0, v1, :cond_2

    const/4 v0, 0x0

    .line 357
    aput-object v0, p1, v1

    :cond_2
    return-object p1
.end method
