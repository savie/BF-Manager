.class public final Ll/ܳۨ᩹;
.super Ll/۠᩵᩹;
.source "HBSC"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583eaL


# instance fields
.field public transient ܰ:[F

.field public ᩶:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 99
    invoke-direct {p0}, Ll/۠᩵᩹;-><init>()V

    .line 100
    sget-object v0, Ll/ۧۨ᩹;->ۙ:[F

    iput-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    return-void
.end method

.method public constructor <init>([F)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ll/۠᩵᩹;-><init>()V

    .line 79
    iput-object p1, p0, Ll/ܳۨ᩹;->ܰ:[F

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3

    .line 1061
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1062
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    new-array v0, v0, [F

    iput-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v1, 0x0

    .line 1063
    :goto_0
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readFloat()F

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1055
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1056
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v1, 0x0

    .line 1057
    :goto_0
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge v1, v2, :cond_0

    aget v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeFloat(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ([F)Ll/ܳۨ᩹;
    .locals 4

    .line 236
    array-length v0, p0

    .line 219
    array-length v1, p0

    if-gt v0, v1, :cond_0

    .line 220
    new-instance v1, Ll/ܳۨ᩹;

    invoke-direct {v1, p0}, Ll/ܳۨ᩹;-><init>([F)V

    .line 221
    iput v0, v1, Ll/ܳۨ᩹;->᩶:I

    return-object v1

    .line 219
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The specified length ("

    const-string v3, ") is greater than the array size ("

    .line 0
    invoke-static {v0, v2, v3}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 219
    array-length p0, p0

    const-string v2, ")"

    .line 0
    invoke-static {p0, v2, v0}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 219
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final add(F)Z
    .locals 4

    .line 305
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ll/ܳۨ᩹;->۫(I)V

    .line 306
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ܳۨ᩹;->᩶:I

    aput p1, v0, v2

    return v1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    .line 361
    iput v0, p0, Ll/ܳۨ᩹;->᩶:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 3

    .line 960
    new-instance v0, Ll/ܳۨ᩹;

    iget-object v1, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    if-nez v2, :cond_0

    .line 62
    sget-object v1, Ll/ۧۨ᩹;->᩷:[F

    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    .line 960
    :goto_0
    invoke-direct {v0, v1}, Ll/ܳۨ᩹;-><init>([F)V

    .line 961
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    iput v1, v0, Ll/ܳۨ᩹;->᩶:I

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 1003
    :cond_1
    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_2

    return v1

    .line 1004
    :cond_2
    instance-of v2, p1, Ll/ܳۨ᩹;

    if-eqz v2, :cond_8

    .line 1006
    check-cast p1, Ll/ܳۨ᩹;

    if-ne p1, p0, :cond_3

    goto :goto_2

    .line 367
    :cond_3
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    iget v3, p1, Ll/ܳۨ᩹;->᩶:I

    if-eq v2, v3, :cond_4

    goto :goto_1

    .line 991
    :cond_4
    iget-object v4, p0, Ll/ܳۨ᩹;->ܰ:[F

    .line 992
    iget-object p1, p1, Ll/ܳۨ᩹;->ܰ:[F

    if-ne v4, p1, :cond_5

    if-ne v2, v3, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_7

    .line 994
    aget v2, v4, v3

    aget v5, p1, v3

    cmpl-float v2, v2, v5

    if-eqz v2, :cond_6

    :goto_1
    return v1

    :cond_6
    move v2, v3

    goto :goto_0

    :cond_7
    :goto_2
    return v0

    .line 1008
    :cond_8
    instance-of v0, p1, Ll/ᩴۨ᩹;

    if-eqz v0, :cond_9

    .line 1011
    check-cast p1, Ll/ᩴۨ᩹;

    invoke-virtual {p1, p0}, Ll/ᩴۨ᩹;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1013
    :cond_9
    invoke-super {p0, p1}, Ll/۠᩵᩹;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final getFloat(I)F
    .locals 3

    .line 313
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge p1, v0, :cond_0

    .line 314
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    aget p1, v0, p1

    return p1

    .line 313
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 313
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 313
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 379
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final listIterator(I)Ll/ۤۛ᩹;
    .locals 1

    .line 743
    invoke-virtual {p0, p1}, Ll/۠᩵᩹;->ۙ(I)V

    .line 744
    new-instance v0, Ll/ۙۨ᩹;

    invoke-direct {v0, p0, p1}, Ll/ۙۨ᩹;-><init>(Ll/ܳۨ᩹;I)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 367
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    return v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ܳۨ᩹;->spliterator()Ll/۠ۚۗ;

    move-result-object v0

    invoke-static {v0}, Ll/ۖۚۗ;->convert(Ll/۠ۚۗ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚۗ;
    .locals 1

    .line 931
    new-instance v0, Ll/᩷ۨ᩹;

    invoke-direct {v0, p0}, Ll/᩷ۨ᩹;-><init>(Ll/ܳۨ᩹;)V

    return-object v0
.end method

.method public final spliterator()Ll/ܶۛ᩹;
    .locals 1

    .line 931
    new-instance v0, Ll/᩷ۨ᩹;

    invoke-direct {v0, p0}, Ll/᩷ۨ᩹;-><init>(Ll/ܳۨ᩹;)V

    return-object v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 4

    if-nez p1, :cond_0

    .line 367
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-ne p2, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    .line 609
    :cond_0
    invoke-virtual {p0, p1}, Ll/۠᩵᩹;->ۙ(I)V

    .line 610
    invoke-virtual {p0, p2}, Ll/۠᩵᩹;->ۙ(I)V

    if-gt p1, p2, :cond_1

    .line 612
    new-instance v0, Ll/ᩴۨ᩹;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩴۨ᩹;-><init>(Ll/ܳۨ᩹;II)V

    :goto_0
    return-object v0

    .line 611
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/֡᩷᩸;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 611
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(FI)F
    .locals 2

    .line 353
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge p2, v0, :cond_0

    .line 354
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    aget v1, v0, p2

    .line 355
    aput p1, v0, p2

    return v1

    .line 353
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index ("

    const-string v1, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p2, v0, v1}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 353
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    const-string v1, ")"

    .line 0
    invoke-static {v0, v1, p2}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 353
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/util/List;)I
    .locals 7

    .line 1044
    instance-of v0, p1, Ll/ܳۨ᩹;

    if-eqz v0, :cond_5

    .line 1045
    check-cast p1, Ll/ܳۨ᩹;

    .line 367
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    iget v1, p1, Ll/ܳۨ᩹;->᩶:I

    .line 1029
    iget-object v2, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget-object p1, p1, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v3, 0x0

    if-ne v2, p1, :cond_0

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    if-ge v4, v1, :cond_2

    .line 1035
    aget v5, v2, v4

    .line 1036
    aget v6, p1, v4

    .line 1037
    invoke-static {v5, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v5

    if-eqz v5, :cond_1

    return v5

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-ge v4, v1, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-ge v4, v0, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v3

    .line 1047
    :cond_5
    instance-of v0, p1, Ll/ᩴۨ᩹;

    if-eqz v0, :cond_6

    .line 1049
    check-cast p1, Ll/ᩴۨ᩹;

    invoke-virtual {p1, p0}, Ll/ᩴۨ᩹;->ۙ(Ljava/util/List;)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 1051
    :cond_6
    invoke-super {p0, p1}, Ll/۠᩵᩹;->ۙ(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ۙ(II)V
    .locals 2

    .line 637
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    invoke-static {v0, p1, p2}, Ll/ܿܺ᩺;->ۙ(III)V

    .line 638
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 639
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ܳۨ᩹;->᩶:I

    return-void
.end method

.method public final ۙ(III[F)V
    .locals 1

    .line 357
    array-length v0, p4

    invoke-static {v0, p2, p3}, Ll/ܿܺ᩺;->᩷(III)V

    .line 626
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    invoke-static {v0, p1, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۙ(II[F)V
    .locals 3

    .line 670
    invoke-virtual {p0, p1}, Ll/۠᩵᩹;->ۙ(I)V

    .line 357
    array-length v0, p3

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Ll/ܿܺ᩺;->᩷(III)V

    add-int v0, p1, p2

    .line 672
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    if-gt v0, v2, :cond_0

    .line 673
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    invoke-static {p3, v1, v0, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 672
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "End index ("

    const-string p3, ") is greater than list size ("

    .line 0
    invoke-static {v0, p2, p3}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 672
    iget p3, p0, Ll/ܳۨ᩹;->᩶:I

    const-string v0, ")"

    .line 0
    invoke-static {p3, v0, p2}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 672
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(ILl/ܽۨ᩹;)Z
    .locals 4

    .line 686
    instance-of v0, p2, Ll/᩷ۛ᩹;

    if-eqz v0, :cond_0

    .line 687
    check-cast p2, Ll/᩷ۛ᩹;

    invoke-virtual {p0, p1, p2}, Ll/ܳۨ᩹;->ۙ(ILl/᩷ۛ᩹;)Z

    move-result p1

    return p1

    .line 689
    :cond_0
    invoke-virtual {p0, p1}, Ll/۠᩵᩹;->ۙ(I)V

    .line 690
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 692
    :cond_1
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ll/ܳۨ᩹;->۫(I)V

    .line 693
    iget-object v1, p0, Ll/ܳۨ᩹;->ܰ:[F

    add-int v2, p1, v0

    iget v3, p0, Ll/ܳۨ᩹;->᩶:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 694
    invoke-interface {p2}, Ll/ܽۨ᩹;->iterator()Ll/ۡۨ᩹;

    move-result-object p2

    .line 695
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ܳۨ᩹;->᩶:I

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_2

    .line 696
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    add-int/lit8 v2, p1, 0x1

    invoke-interface {p2}, Ll/ۡۨ᩹;->nextFloat()F

    move-result v3

    aput v3, v0, p1

    move v0, v1

    move p1, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(ILl/᩷ۛ᩹;)Z
    .locals 5

    .line 703
    invoke-virtual {p0, p1}, Ll/۠᩵᩹;->ۙ(I)V

    .line 704
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 706
    :cond_0
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Ll/ܳۨ᩹;->۫(I)V

    .line 707
    iget-object v2, p0, Ll/ܳۨ᩹;->ܰ:[F

    add-int v3, p1, v0

    iget v4, p0, Ll/ܳۨ᩹;->᩶:I

    sub-int/2addr v4, p1

    invoke-static {v2, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 708
    iget-object v2, p0, Ll/ܳۨ᩹;->ܰ:[F

    invoke-interface {p2, v1, p1, v0, v2}, Ll/᩷ۛ᩹;->ۙ(III[F)V

    .line 709
    iget p1, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ܳۨ᩹;->᩶:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ۙ(Ll/֫ۛ᩹;)Z
    .locals 6

    .line 726
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 728
    :goto_0
    iget v4, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge v2, v4, :cond_1

    aget v4, v0, v2

    invoke-interface {p1, v4}, Ll/֫ۛ᩹;->ۤ(F)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget v5, v0, v2

    aput v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eq v4, v3, :cond_2

    const/4 v1, 0x1

    .line 730
    :cond_2
    iput v3, p0, Ll/ܳۨ᩹;->᩶:I

    return v1
.end method

.method public final ۤ(Ll/ܽۨ᩹;)Z
    .locals 6

    .line 716
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 718
    :goto_0
    iget v4, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge v2, v4, :cond_1

    aget v4, v0, v2

    invoke-interface {p1, v4}, Ll/ܽۨ᩹;->ܳ(F)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget v5, v0, v2

    aput v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    if-eq v4, v3, :cond_2

    const/4 v1, 0x1

    .line 720
    :cond_2
    iput v3, p0, Ll/ܳۨ᩹;->᩶:I

    return v1
.end method

.method public final ۫(I)V
    .locals 5

    .line 286
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    .line 287
    :cond_0
    sget-object v1, Ll/ۧۨ᩹;->ۙ:[F

    if-eq v0, v1, :cond_1

    array-length v1, v0

    int-to-long v1, v1

    array-length v0, v0

    shr-int/lit8 v0, v0, 0x1

    int-to-long v3, v0

    add-long/2addr v1, v3

    const-wide/32 v3, 0x7ffffff7

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    int-to-long v2, p1

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    goto :goto_0

    :cond_1
    const/16 v0, 0xa

    if-ge p1, v0, :cond_2

    const/16 p1, 0xa

    .line 289
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    .line 126
    new-array p1, p1, [F

    const/4 v2, 0x0

    .line 127
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 289
    iput-object p1, p0, Ll/ܳۨ᩹;->ܰ:[F

    return-void
.end method

.method public final ܺ(I)F
    .locals 4

    .line 333
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge p1, v0, :cond_1

    .line 334
    iget-object v1, p0, Ll/ܳۨ᩹;->ܰ:[F

    .line 335
    aget v2, v1, p1

    add-int/lit8 v0, v0, -0x1

    .line 336
    iput v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-eq p1, v0, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v0, p1

    .line 337
    invoke-static {v1, v3, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    return v2

    .line 333
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 333
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 333
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩴ(I)V
    .locals 3

    .line 273
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    array-length v1, v0

    if-le p1, v1, :cond_2

    sget-object v1, Ll/ۧۨ᩹;->ۙ:[F

    if-ne v0, v1, :cond_0

    const/16 v1, 0xa

    if-gt p1, v1, :cond_0

    goto :goto_0

    .line 274
    :cond_0
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    .line 161
    array-length v2, v0

    if-le p1, v2, :cond_1

    .line 126
    new-array p1, p1, [F

    const/4 v2, 0x0

    .line 127
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v0, p1

    .line 274
    :cond_1
    iput-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    :cond_2
    :goto_0
    return-void
.end method

.method public final ᩴ(F)Z
    .locals 1

    .line 344
    invoke-virtual {p0, p1}, Ll/ܳۨ᩹;->᩸(F)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 346
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܳۨ᩹;->ܺ(I)F

    const/4 p1, 0x1

    return p1
.end method

.method public final ᩴ()[F
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    return-object v0
.end method

.method public final ᩷(F)I
    .locals 4

    .line 326
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    .line 327
    iget v1, p0, Ll/ܳۨ᩹;->᩶:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    aget v3, v0, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    if-ne v1, v3, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final ᩷(FI)V
    .locals 3

    .line 295
    invoke-virtual {p0, p2}, Ll/۠᩵᩹;->ۙ(I)V

    .line 296
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ܳۨ᩹;->۫(I)V

    .line 297
    iget v0, p0, Ll/ܳۨ᩹;->᩶:I

    if-eq p2, v0, :cond_0

    iget-object v1, p0, Ll/ܳۨ᩹;->ܰ:[F

    add-int/lit8 v2, p2, 0x1

    sub-int/2addr v0, p2

    invoke-static {v1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 298
    :cond_0
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    aput p1, v0, p2

    .line 299
    iget p1, p0, Ll/ܳۨ᩹;->᩶:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ܳۨ᩹;->᩶:I

    return-void
.end method

.method public final ᩷(Ll/֡ۨ᩹;)V
    .locals 3

    .line 678
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v1, 0x0

    .line 679
    :goto_0
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge v1, v2, :cond_0

    .line 680
    aget v2, v0, v1

    invoke-interface {p1, v2}, Ll/֡ۨ᩹;->ۙ(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩷(Ll/ۛۨ᩹;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 937
    iget-object p1, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    .line 1475
    invoke-static {v1, v2, p1, v0}, Ll/ۧۨ᩹;->ۙ(II[F[F)V

    return-void

    .line 939
    :cond_0
    iget-object v2, p0, Ll/ܳۨ᩹;->ܰ:[F

    iget v3, p0, Ll/ܳۨ᩹;->᩶:I

    .line 1546
    invoke-static {v2, v1, v3, p1, v0}, Ll/ۧۨ᩹;->ۙ([FIILl/ۛۨ᩹;[F)V

    return-void
.end method

.method public final ᩸(F)I
    .locals 4

    .line 319
    iget-object v0, p0, Ll/ܳۨ᩹;->ܰ:[F

    const/4 v1, 0x0

    .line 320
    :goto_0
    iget v2, p0, Ll/ܳۨ᩹;->᩶:I

    if-ge v1, v2, :cond_1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    aget v3, v0, v1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    if-ne v2, v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method
