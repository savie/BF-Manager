.class public final Ll/ܳܳܽ;
.super Ljava/lang/Object;
.source "O2OZ"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;


# static fields
.field public static final ۢ:Ljava/lang/Object;


# instance fields
.field public transient ֡:I

.field public transient ۟:Ljava/lang/Object;

.field public transient ܰ:[I

.field public transient ܿ:I

.field public transient ᩳ:[Ljava/lang/Object;

.field public transient ᩶:[Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 110
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܳܳܽ;->ۢ:Ljava/lang/Object;

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 4

    .line 1011
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1012
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v0

    if-ltz v0, :cond_1

    const/16 v1, 0x100

    .line 1016
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {p0, v1}, Ll/ܳܳܽ;->ۤ(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 1018
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    .line 1019
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v3

    .line 1020
    invoke-virtual {p0, v2, v3}, Ll/ܳܳܽ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 1014
    :cond_1
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v1, "Invalid size: "

    .line 0
    invoke-static {v0, v1}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1014
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 998
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 999
    invoke-virtual {p0}, Ll/ܳܳܽ;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 808
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 810
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 812
    :cond_0
    new-instance v0, Ll/ۜᩴܽ;

    invoke-direct {v0, p0}, Ll/ۜᩴܽ;-><init>(Ll/ܳܳܽ;)V

    .line 1001
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1002
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 1003
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 1004
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ֫()[I
    .locals 1

    .line 1041
    iget-object v0, p0, Ll/ܳܳܽ;->ܰ:[I

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [I

    return-object v0
.end method

.method private ۙ(IIII)I
    .locals 8

    .line 428
    invoke-static {p2}, Ll/۫ܳܽ;->ۙ(I)Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p2, p2, -0x1

    if-eqz p4, :cond_0

    and-int/2addr p3, p2

    add-int/lit8 p4, p4, 0x1

    .line 433
    invoke-static {p3, p4, v0}, Ll/۫ܳܽ;->ۙ(IILjava/lang/Object;)V

    .line 1037
    :cond_0
    iget-object p3, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {p3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 437
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object p4

    const/4 v1, 0x0

    :goto_0
    if-gt v1, p1, :cond_2

    .line 445
    invoke-static {v1, p3}, Ll/۫ܳܽ;->ۙ(ILjava/lang/Object;)I

    move-result v2

    :goto_1
    if-eqz v2, :cond_1

    add-int/lit8 v3, v2, -0x1

    .line 454
    aget v4, p4, v3

    not-int v5, p1

    and-int/2addr v5, v4

    or-int/2addr v5, v1

    and-int v6, v5, p2

    .line 460
    invoke-static {v6, v0}, Ll/۫ܳܽ;->ۙ(ILjava/lang/Object;)I

    move-result v7

    .line 461
    invoke-static {v6, v2, v0}, Ll/۫ܳܽ;->ۙ(IILjava/lang/Object;)V

    .line 462
    invoke-static {v5, v7, p2}, Ll/۫ܳܽ;->ۙ(III)I

    move-result v2

    aput v2, p4, v3

    and-int v2, v4, p1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 468
    :cond_2
    iput-object v0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    .line 306
    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x20

    .line 307
    iget p3, p0, Ll/ܳܳܽ;->ܿ:I

    const/16 p4, 0x1f

    .line 308
    invoke-static {p3, p1, p4}, Ll/۫ܳܽ;->ۙ(III)I

    move-result p1

    iput p1, p0, Ll/ܳܳܽ;->ܿ:I

    return p2
.end method

.method private ۙ(Ljava/lang/Object;)I
    .locals 7

    .line 474
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩸()Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    .line 477
    :cond_0
    invoke-static {p1}, Ll/֨ܳܽ;->ۙ(Ljava/lang/Object;)I

    move-result v0

    .line 478
    invoke-direct {p0}, Ll/ܳܳܽ;->۫()I

    move-result v2

    .line 1037
    iget-object v3, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {v3}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    and-int v4, v0, v2

    .line 479
    invoke-static {v4, v3}, Ll/۫ܳܽ;->ۙ(ILjava/lang/Object;)I

    move-result v3

    if-nez v3, :cond_1

    return v1

    :cond_1
    not-int v4, v2

    and-int/2addr v0, v4

    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 1071
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v5

    aget v5, v5, v3

    and-int v6, v5, v4

    if-ne v6, v0, :cond_3

    .line 1062
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v6

    aget-object v6, v6, v3

    .line 488
    invoke-static {p1, v6}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    return v3

    :cond_3
    and-int v3, v5, v2

    if-nez v3, :cond_2

    return v1
.end method

.method public static synthetic ۙ(Ll/ܳܳܽ;)I
    .locals 0

    .line 80
    iget p0, p0, Ll/ܳܳܽ;->ܿ:I

    return p0
.end method

.method public static ۙ(Ll/ܳܳܽ;I)Ljava/lang/Object;
    .locals 0

    .line 1062
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object p0

    aget-object p0, p0, p1

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ܳܳܽ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Ll/ܳܳܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ܳܳܽ;ILjava/lang/Object;)V
    .locals 0

    .line 1079
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object p0

    aput-object p2, p0, p1

    return-void
.end method

.method public static synthetic ۤ(Ll/ܳܳܽ;)[I
    .locals 0

    .line 80
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object p0

    return-object p0
.end method

.method private ۧ()[Ljava/lang/Object;
    .locals 1

    .line 1045
    iget-object v0, p0, Ll/ܳܳܽ;->᩶:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method private ۫()I
    .locals 2

    .line 313
    iget v0, p0, Ll/ܳܳܽ;->ܿ:I

    and-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x1

    shl-int v0, v1, v0

    sub-int/2addr v0, v1

    return v0
.end method

.method public static synthetic ۫(Ll/ܳܳܽ;)I
    .locals 0

    .line 80
    invoke-direct {p0}, Ll/ܳܳܽ;->۫()I

    move-result p0

    return p0
.end method

.method public static synthetic ܳ(Ll/ܳܳܽ;)V
    .locals 1

    .line 80
    iget v0, p0, Ll/ܳܳܽ;->֡:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Ll/ܳܳܽ;->֡:I

    return-void
.end method

.method private ܺ()[Ljava/lang/Object;
    .locals 1

    .line 1049
    iget-object v0, p0, Ll/ܳܳܽ;->ᩳ:[Ljava/lang/Object;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ᩴ()Ljava/lang/Object;
    .locals 1

    .line 80
    sget-object v0, Ll/ܳܳܽ;->ۢ:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ᩴ(Ll/ܳܳܽ;)[Ljava/lang/Object;
    .locals 0

    .line 80
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ᩷(Ll/ܳܳܽ;Ljava/lang/Object;)I
    .locals 0

    .line 80
    invoke-direct {p0, p1}, Ll/ܳܳܽ;->ۙ(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private ᩷(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 536
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩸()Z

    move-result v0

    sget-object v1, Ll/ܳܳܽ;->ۢ:Ljava/lang/Object;

    if-eqz v0, :cond_0

    return-object v1

    .line 539
    :cond_0
    invoke-direct {p0}, Ll/ܳܳܽ;->۫()I

    move-result v0

    .line 1037
    iget-object v5, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {v5}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 546
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v6

    .line 547
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move v4, v0

    .line 541
    invoke-static/range {v2 .. v8}, Ll/۫ܳܽ;->ۙ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I

    move-result p1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    return-object v1

    .line 1067
    :cond_1
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v1

    aget-object v1, v1, p1

    .line 555
    invoke-virtual {p0, p1, v0}, Ll/ܳܳܽ;->ۙ(II)V

    .line 556
    iget p1, p0, Ll/ܳܳܽ;->֡:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll/ܳܳܽ;->֡:I

    .line 557
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩷()V

    return-object v1
.end method

.method public static ᩷(Ll/ܳܳܽ;)Ljava/lang/Object;
    .locals 0

    .line 1037
    iget-object p0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {p0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static ᩷(Ll/ܳܳܽ;I)Ljava/lang/Object;
    .locals 0

    .line 1067
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object p0

    aget-object p0, p0, p1

    return-object p0
.end method

.method public static synthetic ᩸(Ll/ܳܳܽ;)[Ljava/lang/Object;
    .locals 0

    .line 80
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final clear()V
    .locals 6

    .line 976
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 979
    :cond_0
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩷()V

    .line 980
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 983
    invoke-virtual {p0}, Ll/ܳܳܽ;->size()I

    move-result v3

    const v4, 0x3fffffff    # 1.9999999f

    const/4 v5, 0x3

    .line 285
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 983
    iput v3, p0, Ll/ܳܳܽ;->ܿ:I

    .line 984
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 985
    iput-object v1, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    .line 986
    iput v2, p0, Ll/ܳܳܽ;->֡:I

    return-void

    .line 988
    :cond_1
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, Ll/ܳܳܽ;->֡:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 989
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v0

    iget v3, p0, Ll/ܳܳܽ;->֡:I

    invoke-static {v0, v2, v3, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 1037
    iget-object v0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    instance-of v1, v0, [B

    if-eqz v1, :cond_2

    .line 95
    check-cast v0, [B

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    goto :goto_0

    .line 96
    :cond_2
    instance-of v1, v0, [S

    if-eqz v1, :cond_3

    .line 97
    check-cast v0, [S

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([SS)V

    goto :goto_0

    .line 99
    :cond_3
    check-cast v0, [I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 991
    :goto_0
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v0

    iget v1, p0, Ll/ܳܳܽ;->֡:I

    invoke-static {v0, v2, v1, v2}, Ljava/util/Arrays;->fill([IIII)V

    .line 992
    iput v2, p0, Ll/ܳܳܽ;->֡:I

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 505
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 506
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Ll/ܳܳܽ;->ۙ(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 3

    .line 899
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 901
    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 903
    :goto_0
    iget v2, p0, Ll/ܳܳܽ;->֡:I

    if-ge v1, v2, :cond_2

    .line 1067
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v1

    .line 904
    invoke-static {p1, v2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 740
    new-instance v0, Ll/ۙܳܽ;

    invoke-direct {v0, p0}, Ll/ۙܳܽ;-><init>(Ll/ܳܳܽ;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 628
    invoke-static {p0, p1}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 511
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 513
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 515
    :cond_0
    invoke-direct {p0, p1}, Ll/ܳܳܽ;->ۙ(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 1067
    :cond_1
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    .line 740
    new-instance v0, Ll/ۙܳܽ;

    invoke-direct {v0, p0}, Ll/ۙܳܽ;-><init>(Ll/ܳܳܽ;)V

    .line 633
    invoke-virtual {v0}, Ljava/util/AbstractSet;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    .line 894
    invoke-virtual {p0}, Ll/ܳܳܽ;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 690
    new-instance v0, Ll/ۤܳܽ;

    invoke-direct {v0, p0}, Ll/ۤܳܽ;-><init>(Ll/ܳܳܽ;)V

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 331
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩸()Z

    move-result v0

    const/16 v1, 0x20

    const/4 v2, 0x2

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eqz v0, :cond_2

    .line 263
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩸()Z

    move-result v0

    const-string v5, "Arrays already allocated"

    invoke-static {v5, v0}, Ll/ۨۙܽ;->᩷(Ljava/lang/String;Z)V

    .line 265
    iget v0, p0, Ll/ܳܳܽ;->ܿ:I

    add-int/lit8 v5, v0, 0x1

    .line 64
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v5

    int-to-double v6, v5

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    mul-double v6, v6, v8

    double-to-int v6, v6

    if-le v2, v6, :cond_1

    shl-int/lit8 v5, v5, 0x1

    if-lez v5, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v5, 0x40000000    # 2.0f

    .line 74
    :cond_1
    :goto_0
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 267
    invoke-static {v2}, Ll/۫ܳܽ;->ۙ(I)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    sub-int/2addr v2, v4

    .line 306
    invoke-static {v2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x20

    .line 307
    iget v3, p0, Ll/ܳܳܽ;->ܿ:I

    const/16 v5, 0x1f

    .line 308
    invoke-static {v3, v2, v5}, Ll/۫ܳܽ;->ۙ(III)I

    move-result v2

    iput v2, p0, Ll/ܳܳܽ;->ܿ:I

    .line 270
    new-array v2, v0, [I

    iput-object v2, p0, Ll/ܳܳܽ;->ܰ:[I

    .line 271
    new-array v2, v0, [Ljava/lang/Object;

    iput-object v2, p0, Ll/ܳܳܽ;->᩶:[Ljava/lang/Object;

    .line 272
    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ܳܳܽ;->ᩳ:[Ljava/lang/Object;

    .line 334
    :cond_2
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 336
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 338
    :cond_3
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v0

    .line 339
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v2

    .line 340
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v3

    .line 342
    iget v5, p0, Ll/ܳܳܽ;->֡:I

    add-int/lit8 v6, v5, 0x1

    .line 344
    invoke-static {p1}, Ll/֨ܳܽ;->ۙ(Ljava/lang/Object;)I

    move-result v7

    .line 345
    invoke-direct {p0}, Ll/ܳܳܽ;->۫()I

    move-result v8

    and-int v9, v7, v8

    .line 1037
    iget-object v10, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {v10}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    invoke-static {v9, v10}, Ll/۫ܳܽ;->ۙ(ILjava/lang/Object;)I

    move-result v10

    if-nez v10, :cond_6

    if-le v6, v8, :cond_5

    if-ge v8, v1, :cond_4

    const/4 v0, 0x4

    goto :goto_1

    :cond_4
    const/4 v0, 0x2

    :goto_1
    add-int/lit8 v1, v8, 0x1

    mul-int v1, v1, v0

    .line 351
    invoke-direct {p0, v8, v1, v7, v5}, Ll/ܳܳܽ;->ۙ(IIII)I

    move-result v8

    goto/16 :goto_5

    .line 1037
    :cond_5
    iget-object v0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    invoke-static {v9, v6, v0}, Ll/۫ܳܽ;->ۙ(IILjava/lang/Object;)V

    goto/16 :goto_5

    :cond_6
    not-int v1, v8

    and-int v9, v7, v1

    const/4 v11, 0x0

    :goto_2
    sub-int/2addr v10, v4

    .line 362
    aget v4, v0, v10

    and-int v12, v4, v1

    if-ne v12, v9, :cond_7

    .line 363
    aget-object v12, v2, v10

    .line 364
    invoke-static {p1, v12}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    .line 366
    aget-object p1, v3, v10

    .line 368
    aput-object p2, v3, v10

    return-object p1

    :cond_7
    and-int v12, v4, v8

    add-int/lit8 v11, v11, 0x1

    if-nez v12, :cond_e

    const/16 v1, 0x9

    if-lt v11, v1, :cond_a

    .line 292
    invoke-direct {p0}, Ll/ܳܳܽ;->۫()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 287
    new-instance v1, Ljava/util/LinkedHashMap;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v0, v2}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 610
    invoke-virtual {p0}, Ll/ܳܳܽ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, -0x1

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    if-ltz v0, :cond_9

    .line 1062
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v0

    .line 1067
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v0

    .line 294
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    invoke-virtual {p0, v0}, Ll/ܳܳܽ;->᩷(I)I

    move-result v0

    goto :goto_3

    .line 296
    :cond_9
    iput-object v1, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 297
    iput-object v0, p0, Ll/ܳܳܽ;->ܰ:[I

    .line 298
    iput-object v0, p0, Ll/ܳܳܽ;->᩶:[Ljava/lang/Object;

    .line 299
    iput-object v0, p0, Ll/ܳܳܽ;->ᩳ:[Ljava/lang/Object;

    .line 300
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩷()V

    .line 377
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_a
    if-le v6, v8, :cond_c

    const/16 v0, 0x20

    if-ge v8, v0, :cond_b

    const/4 v0, 0x4

    goto :goto_4

    :cond_b
    const/4 v0, 0x2

    :goto_4
    add-int/lit8 v1, v8, 0x1

    mul-int v1, v1, v0

    .line 382
    invoke-direct {p0, v8, v1, v7, v5}, Ll/ܳܳܽ;->ۙ(IIII)I

    move-result v8

    goto :goto_5

    .line 384
    :cond_c
    invoke-static {v4, v6, v8}, Ll/۫ܳܽ;->ۙ(III)I

    move-result v1

    aput v1, v0, v10

    .line 406
    :goto_5
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v0

    array-length v0, v0

    if-le v6, v0, :cond_d

    ushr-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    .line 409
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    or-int/2addr v1, v2

    const v2, 0x3fffffff    # 1.9999999f

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-eq v1, v0, :cond_d

    .line 421
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳܽ;->ܰ:[I

    .line 422
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳܽ;->᩶:[Ljava/lang/Object;

    .line 423
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܳܽ;->ᩳ:[Ljava/lang/Object;

    :cond_d
    const/4 v0, 0x0

    .line 399
    invoke-static {v7, v0, v8}, Ll/۫ܳܽ;->ۙ(III)I

    move-result v0

    .line 1083
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v1

    aput v0, v1, v5

    .line 1075
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v0

    aput-object p1, v0, v5

    .line 1079
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object p1

    aput-object p2, p1, v5

    .line 389
    iput v6, p0, Ll/ܳܳܽ;->֡:I

    .line 390
    invoke-virtual {p0}, Ll/ܳܳܽ;->᩷()V

    const/4 p1, 0x0

    return-object p1

    :cond_e
    const/4 v4, 0x1

    move v10, v12

    goto/16 :goto_2
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    .line 498
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 499
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Ll/ܳܳܽ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 527
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 529
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 531
    :cond_0
    invoke-direct {p0, p1}, Ll/ܳܳܽ;->᩷(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 532
    sget-object v0, Ll/ܳܳܽ;->ۢ:Ljava/lang/Object;

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    :cond_1
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 888
    invoke-virtual {p0}, Ll/ܳܳܽ;->ۙ()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 889
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Ll/ܳܳܽ;->֡:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 638
    invoke-static {p0}, Ll/ܶ֫ܽ;->ۙ(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 913
    new-instance v0, Ll/ᩴܳܽ;

    invoke-direct {v0, p0}, Ll/ᩴܳܽ;-><init>(Ll/ܳܳܽ;)V

    return-object v0
.end method

.method public final ۙ()Ljava/util/Map;
    .locals 2

    .line 280
    iget-object v0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 281
    check-cast v0, Ljava/util/Map;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۙ(II)V
    .locals 10

    .line 1037
    iget-object v0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    invoke-direct {p0}, Ll/ܳܳܽ;->֫()[I

    move-result-object v1

    .line 568
    invoke-direct {p0}, Ll/ܳܳܽ;->ۧ()[Ljava/lang/Object;

    move-result-object v2

    .line 569
    invoke-direct {p0}, Ll/ܳܳܽ;->ܺ()[Ljava/lang/Object;

    move-result-object v3

    .line 570
    invoke-virtual {p0}, Ll/ܳܳܽ;->size()I

    move-result v4

    add-int/lit8 v5, v4, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-ge p1, v5, :cond_2

    .line 573
    aget-object v8, v2, v5

    .line 574
    aput-object v8, v2, p1

    .line 575
    aget-object v9, v3, v5

    aput-object v9, v3, p1

    .line 576
    aput-object v7, v2, v5

    .line 577
    aput-object v7, v3, v5

    .line 580
    aget v2, v1, v5

    aput v2, v1, p1

    .line 581
    aput v6, v1, v5

    .line 584
    invoke-static {v8}, Ll/֨ܳܽ;->ۙ(Ljava/lang/Object;)I

    move-result v2

    and-int/2addr v2, p2

    .line 585
    invoke-static {v2, v0}, Ll/۫ܳܽ;->ۙ(ILjava/lang/Object;)I

    move-result v3

    if-ne v3, v4, :cond_0

    add-int/lit8 p1, p1, 0x1

    .line 589
    invoke-static {v2, p1, v0}, Ll/۫ܳܽ;->ۙ(IILjava/lang/Object;)V

    return-void

    :cond_0
    :goto_0
    add-int/lit8 v3, v3, -0x1

    .line 596
    aget v0, v1, v3

    and-int v2, v0, p2

    if-ne v2, v4, :cond_1

    add-int/lit8 p1, p1, 0x1

    .line 600
    invoke-static {v0, p1, p2}, Ll/۫ܳܽ;->ۙ(III)I

    move-result p1

    aput p1, v1, v3

    return-void

    :cond_1
    move v3, v2

    goto :goto_0

    .line 603
    :cond_2
    aput-object v7, v2, p1

    .line 604
    aput-object v7, v3, p1

    .line 605
    aput v6, v1, p1

    return-void
.end method

.method public final ۤ(I)V
    .locals 3

    const/4 v0, 0x1

    if-ltz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Expected size must be >= 0"

    .line 249
    invoke-static {v2, v1}, Ll/ۨۙܽ;->ۙ(Ljava/lang/String;Z)V

    const v1, 0x3fffffff    # 1.9999999f

    .line 285
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 252
    iput p1, p0, Ll/ܳܳܽ;->ܿ:I

    return-void
.end method

.method public final ᩷(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    .line 614
    iget v0, p0, Ll/ܳܳܽ;->֡:I

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final ᩷()V
    .locals 1

    .line 317
    iget v0, p0, Ll/ܳܳܽ;->ܿ:I

    add-int/lit8 v0, v0, 0x20

    iput v0, p0, Ll/ܳܳܽ;->ܿ:I

    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 257
    iget-object v0, p0, Ll/ܳܳܽ;->۟:Ljava/lang/Object;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
