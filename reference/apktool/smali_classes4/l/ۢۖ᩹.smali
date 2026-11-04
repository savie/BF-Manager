.class public Ll/ۢۖ᩹;
.super Ll/᩹֨᩹;
.source "C1NC"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Ljava/lang/Cloneable;
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583ebL


# instance fields
.field public transient ܰ:[Ljava/lang/Object;

.field public final ܿ:Z

.field public ᩶:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 302
    new-instance v0, Ll/ܺ᩵ۧ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ܺ᩵ۧ;-><init>(I)V

    new-instance v1, Ll/ܰۖ᩹;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ll/᩻ᩳܳ;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ll/᩻ᩳܳ;-><init>(I)V

    const/4 v3, 0x0

    new-array v3, v3, [Ll/۫ܺۗ;

    invoke-static {v0, v1, v2, v3}, Ll/ܳܺۗ;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;[Ll/۫ܺۗ;)Ll/ۚܺۗ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 121
    invoke-direct {p0}, Ll/᩹֨᩹;-><init>()V

    .line 122
    sget-object v0, Ll/۠ۖ᩹;->ۙ:[Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v0, 0x0

    .line 123
    iput-boolean v0, p0, Ll/ۢۖ᩹;->ܿ:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 114
    invoke-direct {p0}, Ll/᩹֨᩹;-><init>()V

    if-ltz p1, :cond_1

    if-nez p1, :cond_0

    .line 105
    sget-object p1, Ll/۠ۖ᩹;->᩷:[Ljava/lang/Object;

    iput-object p1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    goto :goto_0

    .line 106
    :cond_0
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    :goto_0
    const/4 p1, 0x0

    .line 116
    iput-boolean p1, p0, Ll/ۢۖ᩹;->ܿ:Z

    return-void

    .line 104
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Initial capacity ("

    const-string v2, ") is negative"

    .line 0
    invoke-static {p1, v1, v2}, Ll/ܰ۟ۙ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 104
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>([Ljava/lang/Object;Z)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ll/᩹֨᩹;-><init>()V

    .line 98
    iput-object p1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    .line 99
    iput-boolean p2, p0, Ll/ۢۖ᩹;->ܿ:Z

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 3

    .line 1163
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 1164
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1165
    :goto_0
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 3

    .line 1156
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 1157
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 1158
    :goto_0
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v1, v2, :cond_0

    aget-object v2, v0, v1

    invoke-virtual {p1, v2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ([Ljava/lang/Object;)Ll/ۢۖ᩹;
    .locals 3

    .line 255
    array-length v0, p0

    if-ltz v0, :cond_0

    .line 256
    new-instance v0, Ll/ۢۖ᩹;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ll/ۢۖ᩹;-><init>([Ljava/lang/Object;Z)V

    const/4 p0, 0x0

    .line 257
    iput p0, v0, Ll/ۢۖ᩹;->᩶:I

    return-object v0

    .line 255
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The specified length (0) is greater than the array size ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p0, p0

    const-string v2, ")"

    .line 0
    invoke-static {p0, v2, v1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 255
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 3

    .line 370
    invoke-virtual {p0, p1}, Ll/᩹֨᩹;->ۙ(I)V

    .line 371
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۢۖ᩹;->ᩴ(I)V

    .line 372
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-eq p1, v0, :cond_0

    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    sub-int/2addr v0, p1

    invoke-static {v1, p1, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 373
    :cond_0
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    aput-object p2, v0, p1

    .line 374
    iget p1, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/ۢۖ᩹;->᩶:I

    return-void
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 4

    .line 380
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ll/ۢۖ᩹;->ᩴ(I)V

    .line 381
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۢۖ᩹;->᩶:I

    aput-object p1, v0, v2

    return v1
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 4

    .line 767
    instance-of v0, p2, Ll/ܽ۠᩹;

    if-eqz v0, :cond_0

    .line 768
    check-cast p2, Ll/ܽ۠᩹;

    invoke-virtual {p0, p1, p2}, Ll/ۢۖ᩹;->ۙ(ILl/ܽ۠᩹;)Z

    move-result p1

    return p1

    .line 770
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩹֨᩹;->ۙ(I)V

    .line 771
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 773
    :cond_1
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ll/ۢۖ᩹;->ᩴ(I)V

    .line 774
    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    add-int v2, p1, v0

    iget v3, p0, Ll/ۢۖ᩹;->᩶:I

    sub-int/2addr v3, p1

    invoke-static {v1, p1, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 775
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 776
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۢۖ᩹;->᩶:I

    :goto_0
    add-int/lit8 v1, v0, -0x1

    if-eqz v0, :cond_2

    .line 777
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    add-int/lit8 v2, p1, 0x1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, p1

    move v0, v1

    move p1, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public final clear()V
    .locals 4

    .line 437
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 438
    iput v3, p0, Ll/ۢۖ᩹;->᩶:I

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    .line 1057
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ll/ۢۖ᩹;

    const-class v2, [Ljava/lang/Object;

    sget-object v3, Ll/۠ۖ᩹;->᩷:[Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    .line 1060
    new-instance v0, Ll/ۢۖ᩹;

    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v4, p0, Ll/ۢۖ᩹;->᩶:I

    if-nez v4, :cond_0

    goto :goto_0

    .line 82
    :cond_0
    invoke-static {v1, v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    :goto_0
    const/4 v1, 0x0

    .line 1060
    invoke-direct {v0, v3, v1}, Ll/ۢۖ᩹;-><init>([Ljava/lang/Object;Z)V

    .line 1061
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    iput v1, v0, Ll/ۢۖ᩹;->᩶:I

    return-object v0

    .line 1064
    :cond_1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢۖ᩹;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1071
    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v4, p0, Ll/ۢۖ᩹;->᩶:I

    if-nez v4, :cond_2

    goto :goto_1

    .line 82
    :cond_2
    invoke-static {v1, v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v3

    .line 1071
    :goto_1
    iput-object v3, v0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    return-object v0

    :catch_0
    move-exception v0

    .line 1067
    new-instance v1, Ljava/lang/InternalError;

    invoke-direct {v1, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/Throwable;)V

    throw v1
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

    .line 1104
    :cond_1
    instance-of v2, p1, Ljava/util/List;

    if-nez v2, :cond_2

    return v1

    .line 1105
    :cond_2
    instance-of v2, p1, Ll/ۢۖ᩹;

    if-eqz v2, :cond_8

    .line 1107
    check-cast p1, Ll/ۢۖ᩹;

    if-ne p1, p0, :cond_3

    goto :goto_2

    .line 444
    :cond_3
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    iget v3, p1, Ll/ۢۖ᩹;->᩶:I

    if-eq v2, v3, :cond_4

    goto :goto_1

    .line 1092
    :cond_4
    iget-object v4, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    .line 1093
    iget-object p1, p1, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    if-ne v4, p1, :cond_5

    if-ne v2, v3, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_7

    .line 1095
    aget-object v2, v4, v3

    aget-object v5, p1, v3

    invoke-static {v2, v5}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :goto_1
    return v1

    :cond_6
    move v2, v3

    goto :goto_0

    :cond_7
    :goto_2
    return v0

    .line 1109
    :cond_8
    instance-of v0, p1, Ll/ᩳۖ᩹;

    if-eqz v0, :cond_9

    .line 1112
    check-cast p1, Ll/ᩳۖ᩹;

    invoke-virtual {p1, p0}, Ll/ᩳۖ᩹;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 1114
    :cond_9
    invoke-super {p0, p1}, Ll/᩹֨᩹;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 3

    .line 759
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 760
    :goto_0
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v1, v2, :cond_0

    .line 761
    aget-object v2, v0, v1

    invoke-interface {p1, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3

    .line 388
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge p1, v0, :cond_0

    .line 389
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1

    .line 388
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 388
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 388
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 3

    .line 394
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v1, 0x0

    .line 395
    :goto_0
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v1, v2, :cond_1

    aget-object v2, v0, v1

    invoke-static {p1, v2}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 457
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 3

    .line 401
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    .line 402
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    :goto_0
    add-int/lit8 v2, v1, -0x1

    if-eqz v1, :cond_1

    aget-object v1, v0, v2

    invoke-static {p1, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    move v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public final listIterator(I)Ll/ܶ۠᩹;
    .locals 1

    .line 842
    invoke-virtual {p0, p1}, Ll/᩹֨᩹;->ۙ(I)V

    .line 843
    new-instance v0, Ll/᩶ۖ᩹;

    invoke-direct {v0, p0, p1}, Ll/᩶ۖ᩹;-><init>(Ll/ۢۖ᩹;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 4

    .line 408
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge p1, v0, :cond_1

    .line 409
    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    .line 410
    aget-object v2, v1, p1

    add-int/lit8 v0, v0, -0x1

    .line 411
    iput v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-eq p1, v0, :cond_0

    add-int/lit8 v3, p1, 0x1

    sub-int/2addr v0, p1

    .line 412
    invoke-static {v1, v3, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 413
    :cond_0
    iget p1, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 v0, 0x0

    aput-object v0, v1, p1

    return-object v2

    .line 408
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Index ("

    const-string v2, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v1, v2}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 408
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    const-string v2, ")"

    .line 0
    invoke-static {v1, v2, p1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 408
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 420
    invoke-virtual {p0, p1}, Ll/ۢۖ᩹;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 422
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۢۖ᩹;->remove(I)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 6

    .line 797
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 799
    :goto_0
    iget v4, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v2, v4, :cond_1

    aget-object v4, v0, v2

    invoke-interface {p1, v4}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-object v5, v0, v2

    aput-object v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 800
    invoke-static {v0, v3, v4, p1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 801
    iget p1, p0, Ll/ۢۖ᩹;->᩶:I

    if-eq p1, v3, :cond_2

    const/4 v1, 0x1

    .line 802
    :cond_2
    iput v3, p0, Ll/ۢۖ᩹;->᩶:I

    return v1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 6

    .line 808
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 810
    :goto_0
    iget v4, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v2, v4, :cond_1

    aget-object v4, v0, v2

    invoke-interface {p1, v4}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    add-int/lit8 v4, v3, 0x1

    aget-object v5, v0, v2

    aput-object v5, v0, v3

    move v3, v4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 811
    invoke-static {v0, v3, v4, p1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 812
    iget p1, p0, Ll/ۢۖ᩹;->᩶:I

    if-eq p1, v3, :cond_2

    const/4 v1, 0x1

    .line 813
    :cond_2
    iput v3, p0, Ll/ۢۖ᩹;->᩶:I

    return v1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 429
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge p1, v0, :cond_0

    .line 430
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    aget-object v1, v0, p1

    .line 431
    aput-object p2, v0, p1

    return-object v1

    .line 429
    :cond_0
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "Index ("

    const-string v1, ") is greater than or equal to list size ("

    .line 0
    invoke-static {p1, v0, v1}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 429
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    const-string v1, ")"

    .line 0
    invoke-static {v0, v1, p1}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 429
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final size()I
    .locals 1

    .line 444
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    return v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 1037
    iget-object p1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    .line 1585
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;II)V

    return-void

    .line 1039
    :cond_0
    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    .line 1623
    invoke-static {v1, v0, v2, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    return-void
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/ۢۖ᩹;->spliterator()Ll/۠ۚۗ;

    move-result-object v0

    invoke-static {v0}, Ll/ۖۚۗ;->convert(Ll/۠ۚۗ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ۖ۠᩹;
    .locals 1

    .line 1030
    new-instance v0, Ll/ܿۖ᩹;

    invoke-direct {v0, p0}, Ll/ܿۖ᩹;-><init>(Ll/ۢۖ᩹;)V

    return-object v0
.end method

.method public final spliterator()Ll/۠ۚۗ;
    .locals 1

    .line 1030
    new-instance v0, Ll/ܿۖ᩹;

    invoke-direct {v0, p0}, Ll/ܿۖ᩹;-><init>(Ll/ۢۖ᩹;)V

    return-object v0
.end method

.method public final subList(II)Ljava/util/List;
    .locals 4

    if-nez p1, :cond_0

    .line 444
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-ne p2, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    .line 688
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩹֨᩹;->ۙ(I)V

    .line 689
    invoke-virtual {p0, p2}, Ll/᩹֨᩹;->ۙ(I)V

    if-gt p1, p2, :cond_1

    .line 691
    new-instance v0, Ll/ᩳۖ᩹;

    invoke-direct {v0, p0, p1, p2}, Ll/ᩳۖ᩹;-><init>(Ll/ۢۖ᩹;II)V

    :goto_0
    return-object v0

    .line 690
    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ") is greater than end index ("

    const-string v2, ")"

    const-string v3, "Start index ("

    .line 0
    invoke-static {v3, p1, v1, v2, p2}, Ll/֡᩷᩸;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    .line 690
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 3

    .line 444
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    if-nez v0, :cond_0

    .line 821
    sget-object v0, Ll/۠ۖ᩹;->᩷:[Ljava/lang/Object;

    return-object v0

    .line 822
    :cond_0
    iget-object v1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const-class v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    if-nez p1, :cond_0

    .line 444
    iget p1, p0, Ll/ۢۖ᩹;->᩶:I

    .line 829
    new-array p1, p1, [Ljava/lang/Object;

    goto :goto_0

    .line 830
    :cond_0
    array-length v0, p1

    .line 444
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    if-ge v0, v1, :cond_1

    .line 831
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    .line 444
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    .line 831
    invoke-static {p1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    .line 833
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    .line 444
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 v2, 0x0

    .line 833
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 834
    array-length v0, p1

    .line 444
    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    if-le v0, v1, :cond_2

    const/4 v0, 0x0

    .line 835
    aput-object v0, p1, v1

    :cond_2
    return-object p1
.end method

.method public final ֫()[Ljava/lang/Object;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    return-object v0
.end method

.method public final ۙ(Ljava/util/List;)I
    .locals 7

    .line 1145
    instance-of v0, p1, Ll/ۢۖ᩹;

    if-eqz v0, :cond_4

    .line 1146
    check-cast p1, Ll/ۢۖ᩹;

    .line 444
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    iget v1, p1, Ll/ۢۖ᩹;->᩶:I

    .line 1130
    iget-object v2, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget-object p1, p1, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    if-ge v4, v1, :cond_1

    .line 1135
    aget-object v5, v2, v4

    .line 1136
    aget-object v6, p1, v4

    .line 1137
    check-cast v5, Ljava/lang/Comparable;

    invoke-interface {v5, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-eqz v5, :cond_0

    return v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    if-ge v4, v1, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    if-ge v4, v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v3

    .line 1148
    :cond_4
    instance-of v0, p1, Ll/ᩳۖ᩹;

    if-eqz v0, :cond_5

    .line 1150
    check-cast p1, Ll/ᩳۖ᩹;

    invoke-virtual {p1, p0}, Ll/ᩳۖ᩹;->ۙ(Ljava/util/List;)I

    move-result p1

    neg-int p1, p1

    return p1

    .line 1152
    :cond_5
    invoke-super {p0, p1}, Ll/᩹֨᩹;->ۙ(Ljava/util/List;)I

    move-result p1

    return p1
.end method

.method public final ۙ(II)V
    .locals 2

    .line 716
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    invoke-static {v0, p1, p2}, Ll/ܿܺ᩺;->ۙ(III)V

    .line 717
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    sub-int/2addr v1, p2

    invoke-static {v0, p2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 718
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    sub-int/2addr p2, p1

    sub-int/2addr v0, p2

    iput v0, p0, Ll/ۢۖ᩹;->᩶:I

    :goto_0
    add-int/lit8 p1, p2, -0x1

    if-eqz p2, :cond_0

    .line 720
    iget-object p2, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/2addr v0, p1

    const/4 v1, 0x0

    aput-object v1, p2, v0

    move p2, p1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۙ(III[Ljava/lang/Object;)V
    .locals 1

    .line 361
    array-length v0, p4

    invoke-static {v0, p2, p3}, Ll/ܿܺ᩺;->᩷(III)V

    .line 705
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    invoke-static {v0, p1, p4, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final ۙ(II[Ljava/lang/Object;)V
    .locals 3

    .line 751
    invoke-virtual {p0, p1}, Ll/᩹֨᩹;->ۙ(I)V

    .line 361
    array-length v0, p3

    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Ll/ܿܺ᩺;->᩷(III)V

    add-int v0, p1, p2

    .line 753
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    if-gt v0, v2, :cond_0

    .line 754
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    invoke-static {p3, v1, v0, p1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    .line 753
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string p2, "End index ("

    const-string p3, ") is greater than list size ("

    .line 0
    invoke-static {v0, p2, p3}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 753
    iget p3, p0, Ll/ۢۖ᩹;->᩶:I

    const-string v0, ")"

    .line 0
    invoke-static {p3, v0, p2}, Ll/ۨ᩹ۧ;->ۙ(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    .line 753
    invoke-direct {p1, p2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(ILl/ܽ۠᩹;)Z
    .locals 5

    .line 784
    invoke-virtual {p0, p1}, Ll/᩹֨᩹;->ۙ(I)V

    .line 785
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 787
    :cond_0
    iget v2, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Ll/ۢۖ᩹;->ᩴ(I)V

    .line 788
    iget-object v2, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    add-int v3, p1, v0

    iget v4, p0, Ll/ۢۖ᩹;->᩶:I

    sub-int/2addr v4, p1

    invoke-static {v2, p1, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 789
    iget-object v2, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    invoke-interface {p2, v1, p1, v0, v2}, Ll/ܽ۠᩹;->ۙ(III[Ljava/lang/Object;)V

    .line 790
    iget p1, p0, Ll/ۢۖ᩹;->᩶:I

    add-int/2addr p1, v0

    iput p1, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 p1, 0x1

    return p1
.end method

.method public final ۫(I)V
    .locals 3

    .line 449
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_0

    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    invoke-static {p1, v1, v0}, Ll/۠ۖ᩹;->ۙ(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    .line 450
    :cond_0
    iget v0, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 v1, 0x0

    if-le p1, v0, :cond_1

    iget-object v2, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    invoke-static {v2, v0, p1, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    goto :goto_0

    .line 451
    :cond_1
    iget-object v2, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    invoke-static {v2, p1, v0, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 452
    :goto_0
    iput p1, p0, Ll/ۢۖ᩹;->᩶:I

    return-void
.end method

.method public final ᩴ(I)V
    .locals 5

    .line 356
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    .line 357
    :cond_0
    sget-object v1, Ll/۠ۖ᩹;->ۙ:[Ljava/lang/Object;

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

    .line 359
    :cond_2
    :goto_0
    iget-boolean v0, p0, Ll/ۢۖ᩹;->ܿ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    invoke-static {p1, v1, v0}, Ll/۠ۖ᩹;->ۙ(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    return-void

    .line 361
    :cond_3
    new-array p1, p1, [Ljava/lang/Object;

    .line 362
    iget-object v0, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    iget v1, p0, Ll/ۢۖ᩹;->᩶:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 363
    iput-object p1, p0, Ll/ۢۖ᩹;->ܰ:[Ljava/lang/Object;

    return-void
.end method
