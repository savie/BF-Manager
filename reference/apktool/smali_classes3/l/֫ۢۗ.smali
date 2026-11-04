.class public final Ll/֫ۢۗ;
.super Ll/ᩳۡۗ;
.source "66HE"


# static fields
.field public static final ۙۙ:Ll/֫֨ۗ;

.field public static final ۤۙ:Ll/֫֨ۗ;

.field public static final ۬:Ll/֫֨ۗ;

.field public static final ᩷ۙ:Ll/֫֨ۗ;


# instance fields
.field public final ۖ:I

.field public final ۜ:I

.field public ۠:Ll/֫֨ۗ;

.field public final ۡ:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Ll/ۨ֨ۗ;

    .line 17
    sget-object v2, Ll/ۨ֨ۗ;->ۢ:Ll/ۨ֨ۗ;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Ll/ۨ֨ۗ;->ᩳ:Ll/ۨ֨ۗ;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Ll/֫֨ۗ;->ۙ([Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v1

    sput-object v1, Ll/֫ۢۗ;->᩷ۙ:Ll/֫֨ۗ;

    new-array v1, v0, [Ll/ۨ֨ۗ;

    .line 18
    sget-object v2, Ll/ۨ֨ۗ;->ۙۙ:Ll/ۨ֨ۗ;

    aput-object v2, v1, v3

    sget-object v2, Ll/ۨ֨ۗ;->֨:Ll/ۨ֨ۗ;

    aput-object v2, v1, v4

    invoke-static {v1}, Ll/֫֨ۗ;->ۙ([Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v1

    sput-object v1, Ll/֫ۢۗ;->ۤۙ:Ll/֫֨ۗ;

    new-array v1, v0, [Ll/ۨ֨ۗ;

    .line 19
    sget-object v2, Ll/ۨ֨ۗ;->۠:Ll/ۨ֨ۗ;

    aput-object v2, v1, v3

    sget-object v2, Ll/ۨ֨ۗ;->ۖ:Ll/ۨ֨ۗ;

    aput-object v2, v1, v4

    invoke-static {v1}, Ll/֫֨ۗ;->ۙ([Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v1

    sput-object v1, Ll/֫ۢۗ;->ۙۙ:Ll/֫֨ۗ;

    new-array v0, v0, [Ll/ۨ֨ۗ;

    .line 20
    sget-object v1, Ll/ۨ֨ۗ;->ۜ:Ll/ۨ֨ۗ;

    aput-object v1, v0, v3

    sget-object v1, Ll/ۨ֨ۗ;->ۡ:Ll/ۨ֨ۗ;

    aput-object v1, v0, v4

    invoke-static {v0}, Ll/֫֨ۗ;->ۙ([Ll/ۨ֨ۗ;)Ll/֫֨ۗ;

    move-result-object v0

    sput-object v0, Ll/֫ۢۗ;->۬:Ll/֫֨ۗ;

    return-void
.end method

.method public constructor <init>(IILjava/lang/Object;)V
    .locals 2

    .line 32
    sget-object v0, Ll/᩺ۢۗ;->ᩴۙ:Ll/᩺ۢۗ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 33
    iput-object p3, p0, Ll/֫ۢۗ;->ۡ:Ljava/lang/Object;

    .line 34
    iput p1, p0, Ll/֫ۢۗ;->ۜ:I

    .line 35
    iput p2, p0, Ll/֫ۢۗ;->ۖ:I

    if-eqz p2, :cond_3

    const/4 p1, 0x1

    if-eq p2, p1, :cond_3

    const/4 p1, 0x2

    if-eq p2, p1, :cond_2

    const/4 p1, 0x4

    if-eq p2, p1, :cond_1

    const/16 p1, 0x8

    if-ne p2, p1, :cond_0

    .line 49
    sget-object p1, Ll/֫ۢۗ;->۬:Ll/֫֨ۗ;

    goto :goto_0

    .line 51
    :cond_0
    new-instance p1, Ll/۠ۧ᩵;

    const-string p3, "Unknown array element width: "

    .line 0
    invoke-static {p2, p3}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 47
    :cond_1
    sget-object p1, Ll/֫ۢۗ;->ۙۙ:Ll/֫֨ۗ;

    goto :goto_0

    .line 45
    :cond_2
    sget-object p1, Ll/֫ۢۗ;->ۤۙ:Ll/֫֨ۗ;

    goto :goto_0

    .line 43
    :cond_3
    sget-object p1, Ll/֫ۢۗ;->᩷ۙ:Ll/֫֨ۗ;

    .line 36
    :goto_0
    iput-object p1, p0, Ll/֫ۢۗ;->۠:Ll/֫֨ۗ;

    return-void
.end method

.method public constructor <init>(Ll/᩷ܿۗ;)V
    .locals 2

    .line 28
    invoke-interface {p1}, Ll/᩷ܿۗ;->getData()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ll/᩷ܿۗ;->getSize()I

    move-result v1

    invoke-interface {p1}, Ll/᩷ܿۗ;->۫()I

    move-result p1

    invoke-direct {p0, v1, p1, v0}, Ll/֫ۢۗ;-><init>(IILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 133
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ll/ᩳۡۗ;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    .line 117
    iget-object v2, p0, Ll/֫ۢۗ;->ۡ:Ljava/lang/Object;

    iget v3, p0, Ll/֫ۢۗ;->ۖ:I

    if-eq v3, v1, :cond_3

    const/4 v1, 0x2

    if-eq v3, v1, :cond_2

    const/4 v1, 0x4

    if-eq v3, v1, :cond_1

    const/16 v1, 0x8

    if-eq v3, v1, :cond_0

    const-string v1, "?"

    goto :goto_0

    .line 125
    :cond_0
    check-cast v2, [J

    invoke-static {v2}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 123
    :cond_1
    check-cast v2, [I

    invoke-static {v2}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 121
    :cond_2
    check-cast v2, [S

    invoke-static {v2}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 119
    :cond_3
    check-cast v2, [B

    invoke-static {v2}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    .line 133
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)Ljava/util/ArrayList;
    .locals 7

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    iget v1, p0, Ll/֫ۢۗ;->ۜ:I

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 70
    iget-object v3, p0, Ll/֫ۢۗ;->ۡ:Ljava/lang/Object;

    iget v4, p0, Ll/֫ۢۗ;->ۖ:I

    if-eq v4, v1, :cond_3

    const/4 v1, 0x2

    if-eq v4, v1, :cond_2

    const/4 v1, 0x4

    if-eq v4, v1, :cond_1

    const/16 v1, 0x8

    if-ne v4, v1, :cond_0

    .line 87
    check-cast v3, [J

    array-length v1, v3

    :goto_0
    if-ge v2, v1, :cond_4

    aget-wide v4, v3, v2

    .line 88
    sget v6, Ll/ܺ֨ۗ;->۟:I

    .line 62
    invoke-static {v4, v5, p1}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v4

    .line 88
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 92
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 92
    throw v0

    .line 82
    :cond_1
    check-cast v3, [I

    array-length v1, v3

    :goto_1
    if-ge v2, v1, :cond_4

    aget v4, v3, v2

    int-to-long v4, v4

    .line 83
    sget v6, Ll/ܺ֨ۗ;->۟:I

    .line 62
    invoke-static {v4, v5, p1}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v4

    .line 83
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 77
    :cond_2
    check-cast v3, [S

    array-length v1, v3

    :goto_2
    if-ge v2, v1, :cond_4

    aget-short v4, v3, v2

    int-to-long v4, v4

    .line 78
    sget v6, Ll/ܺ֨ۗ;->۟:I

    .line 62
    invoke-static {v4, v5, p1}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v4

    .line 78
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 72
    :cond_3
    check-cast v3, [B

    array-length v1, v3

    :goto_3
    if-ge v2, v1, :cond_4

    aget-byte v4, v3, v2

    int-to-long v4, v4

    .line 73
    sget v6, Ll/ܺ֨ۗ;->۟:I

    .line 62
    invoke-static {v4, v5, p1}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v4

    .line 73
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    return-object v0
.end method

.method public final ۛۙ()I
    .locals 1

    .line 60
    iget v0, p0, Ll/֫ۢۗ;->ۜ:I

    return v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 4

    .line 111
    new-instance v0, Ll/֫ۢۗ;

    iget v1, p0, Ll/֫ۢۗ;->ۜ:I

    iget v2, p0, Ll/֫ۢۗ;->ۖ:I

    iget-object v3, p0, Ll/֫ۢۗ;->ۡ:Ljava/lang/Object;

    invoke-direct {v0, v1, v2, v3}, Ll/֫ۢۗ;-><init>(IILjava/lang/Object;)V

    .line 112
    iget-object v1, p0, Ll/֫ۢۗ;->۠:Ll/֫֨ۗ;

    iput-object v1, v0, Ll/֫ۢۗ;->۠:Ll/֫֨ۗ;

    .line 113
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 102
    :cond_0
    instance-of v1, p1, Ll/֫ۢۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 105
    :cond_1
    check-cast p1, Ll/֫ۢۗ;

    .line 106
    iget-object v1, p0, Ll/֫ۢۗ;->۠:Ll/֫֨ۗ;

    iget-object v3, p1, Ll/֫ۢۗ;->۠:Ll/֫֨ۗ;

    invoke-virtual {v1, v3}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫ۢۗ;->ۡ:Ljava/lang/Object;

    iget-object p1, p1, Ll/֫ۢۗ;->ۡ:Ljava/lang/Object;

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v2
.end method

.method public final ᩵ۙ()Ll/֫֨ۗ;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/֫ۢۗ;->۠:Ll/֫֨ۗ;

    return-object v0
.end method
