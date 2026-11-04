.class public final Ll/ۤ᩶᩸;
.super Ll/ۖ֨ܺ;
.source "MB3E"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ۤ:I

.field public final ۫:I

.field public final ܳ:I

.field public final ᩴ:Z

.field public final ᩷:Ljava/util/Map;

.field public final ᩸:Z


# direct methods
.method public constructor <init>(IIZILjava/lang/String;ZLjava/util/Map;)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۤ᩶᩸;->۫:I

    iput p2, p0, Ll/ۤ᩶᩸;->ۤ:I

    iput-boolean p3, p0, Ll/ۤ᩶᩸;->ᩴ:Z

    iput p4, p0, Ll/ۤ᩶᩸;->ܳ:I

    iput-object p5, p0, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    iput-boolean p6, p0, Ll/ۤ᩶᩸;->᩸:Z

    iput-object p7, p0, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 103
    instance-of v0, p1, Ll/ۤ᩶᩸;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۤ᩶᩸;

    iget-boolean v0, p0, Ll/ۤ᩶᩸;->ᩴ:Z

    iget-boolean v1, p1, Ll/ۤ᩶᩸;->ᩴ:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۤ᩶᩸;->᩸:Z

    iget-boolean v1, p1, Ll/ۤ᩶᩸;->᩸:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۤ᩶᩸;->۫:I

    iget v1, p1, Ll/ۤ᩶᩸;->۫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۤ᩶᩸;->ۤ:I

    iget v1, p1, Ll/ۤ᩶᩸;->ۤ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۤ᩶᩸;->ܳ:I

    iget v1, p1, Ll/ۤ᩶᩸;->ܳ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    iget-object v1, p1, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    iget-object p1, p1, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 0
    iget-boolean v0, p0, Ll/ۤ᩶᩸;->ᩴ:Z

    const/16 v1, 0x4d5

    if-eqz v0, :cond_0

    const/16 v0, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v0, 0x4d5

    :goto_0
    const/16 v2, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v3, p0, Ll/ۤ᩶᩸;->᩸:Z

    if-eqz v3, :cond_1

    const/16 v1, 0x4cf

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 103
    iget v1, p0, Ll/ۤ᩶᩸;->۫:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۤ᩶᩸;->ۤ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۤ᩶᩸;->ܳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v1, p0, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ll/᩻ۢ᩹;->ۙ(IILjava/lang/String;)I

    move-result v0

    .line 103
    iget-object v1, p0, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    invoke-static {v1}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 103
    iget v0, p0, Ll/ۤ᩶᩸;->۫:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Ll/ۤ᩶᩸;->ۤ:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-boolean v2, p0, Ll/ۤ᩶᩸;->ᩴ:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget v3, p0, Ll/ۤ᩶᩸;->ܳ:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-boolean v4, p0, Ll/ۤ᩶᩸;->᩸:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const/4 v5, 0x7

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v0, v5, v6

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v1, 0x2

    aput-object v2, v5, v1

    const/4 v1, 0x3

    aput-object v3, v5, v1

    const/4 v1, 0x4

    iget-object v2, p0, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    aput-object v2, v5, v1

    const/4 v1, 0x5

    aput-object v4, v5, v1

    const/4 v1, 0x6

    iget-object v2, p0, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    aput-object v2, v5, v1

    const-string v1, "type;charsetIndex;isUtf8;sourceCount;arscPath;hasArscUtil;attrs"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    new-array v1, v6, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, ";"

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "["

    .line 0
    const-class v4, Ll/ۤ᩶᩸;

    invoke-static {v4, v2, v3}, Lorg/bouncycastle/asn1/bc/ExternalValue$$ExternalSyntheticOutline0;->m(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    .line 103
    :goto_1
    array-length v3, v1

    if-ge v6, v3, :cond_2

    aget-object v3, v1, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v3, v5, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v3, v1

    sub-int/2addr v3, v0

    if-eq v6, v3, :cond_1

    const-string v3, ", "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۤ᩶᩸;)Z
    .locals 2

    if-eqz p1, :cond_0

    .line 106
    iget v0, p0, Ll/ۤ᩶᩸;->۫:I

    iget v1, p1, Ll/ۤ᩶᩸;->۫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۤ᩶᩸;->ۤ:I

    iget v1, p1, Ll/ۤ᩶᩸;->ۤ:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۤ᩶᩸;->ᩴ:Z

    iget-boolean v1, p1, Ll/ۤ᩶᩸;->ᩴ:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ۤ᩶᩸;->ܳ:I

    iget v1, p1, Ll/ۤ᩶᩸;->ܳ:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Ll/ۤ᩶᩸;->᩸:Z

    iget-boolean v1, p1, Ll/ۤ᩶᩸;->᩸:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    iget-object v1, p1, Ll/ۤ᩶᩸;->᩷:Ljava/util/Map;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۤ᩶᩸;->ۙ:Ljava/lang/String;

    .line 108
    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
