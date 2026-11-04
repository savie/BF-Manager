.class public final Ll/᩹֨ۗ;
.super Ll/ܺ֨ۗ;
.source "YITR"


# instance fields
.field public final ۢ:J


# direct methods
.method public constructor <init>(JLl/֫֨ۗ;)V
    .locals 3

    .line 42
    invoke-direct {p0}, Ll/ܺ֨ۗ;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-eqz v2, :cond_1

    .line 43
    invoke-virtual {p3}, Ll/֫֨ۗ;->ۘ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong literal type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " for value: "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 44
    throw v0

    .line 46
    :cond_1
    :goto_0
    iput-wide p1, p0, Ll/᩹֨ۗ;->ۢ:J

    .line 47
    iput-object p3, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-void
.end method

.method public static ۙ(JLl/֫֨ۗ;)Ll/᩹֨ۗ;
    .locals 1

    .line 12
    new-instance v0, Ll/᩹֨ۗ;

    invoke-direct {v0, p0, p1, p2}, Ll/᩹֨ۗ;-><init>(JLl/֫֨ۗ;)V

    return-object v0
.end method

.method public static ܶۙ()Ll/᩹֨ۗ;
    .locals 4

    .line 33
    new-instance v0, Ll/᩹֨ۗ;

    const-wide/16 v1, 0x0

    sget-object v3, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    invoke-direct {v0, v1, v2, v3}, Ll/᩹֨ۗ;-><init>(JLl/֫֨ۗ;)V

    return-object v0
.end method

.method public static ᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;
    .locals 4

    .line 16
    new-instance v0, Ll/᩹֨ۗ;

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-eqz v3, :cond_3

    .line 20
    invoke-virtual {p2}, Ll/֫֨ۗ;->᩶()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ll/ۨ֨ۗ;->ۜ:Ll/ۨ֨ۗ;

    invoke-virtual {p2, v1}, Ll/֫֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ll/ۨ֨ۗ;->ۡ:Ll/ۨ֨ۗ;

    invoke-virtual {p2, v1}, Ll/֫֨ۗ;->᩷(Ll/ۨ֨ۗ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x1

    cmp-long p2, p0, v1

    if-nez p2, :cond_1

    .line 24
    sget-object p2, Ll/֫֨ۗ;->ۛ:Ll/֫֨ۗ;

    goto :goto_0

    :cond_1
    if-gez v3, :cond_2

    .line 27
    sget-object p2, Ll/֫֨ۗ;->ۨ:Ll/֫֨ۗ;

    goto :goto_0

    .line 29
    :cond_2
    sget-object p2, Ll/֫֨ۗ;->᩺:Ll/֫֨ۗ;

    .line 16
    :cond_3
    :goto_0
    invoke-direct {v0, p0, p1, p2}, Ll/᩹֨ۗ;-><init>(JLl/֫֨ۗ;)V

    return-object v0
.end method

.method public static ᩹ۙ()Ll/᩹֨ۗ;
    .locals 4

    .line 37
    new-instance v0, Ll/᩹֨ۗ;

    const-wide/16 v1, 0x1

    sget-object v3, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    invoke-direct {v0, v1, v2, v3}, Ll/᩹֨ۗ;-><init>(JLl/֫֨ۗ;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 129
    const-class v2, Ll/᩹֨ۗ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 132
    :cond_1
    check-cast p1, Ll/᩹֨ۗ;

    .line 133
    iget-wide v2, p0, Ll/᩹֨ۗ;->ۢ:J

    iget-wide v4, p1, Ll/᩹֨ۗ;->ۢ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    .line 10
    iget-object v2, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    iget-object p1, p1, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 133
    invoke-virtual {v2, p1}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 5

    const/16 v0, 0x20

    .line 121
    iget-wide v1, p0, Ll/᩹֨ۗ;->ۢ:J

    ushr-long v3, v1, v0

    xor-long v0, v1, v3

    long-to-int v1, v0

    .line 10
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 930
    iget v0, v0, Ll/֫֨ۗ;->ۙ:I

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    const-string v0, "("

    const/16 v1, 0x29

    const/16 v2, 0x20

    .line 144
    :try_start_0
    iget-wide v3, p0, Ll/᩹֨ۗ;->ۢ:J

    .line 10
    iget-object v5, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 144
    invoke-static {}, Ll/ۨۧ᩵;->ۙ()Ll/ۨۧ᩵;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Ll/ܳ۟ۗ;->ۙ(JLl/֫֨ۗ;Ll/ۨۧ᩵;ZZ)Ljava/lang/String;

    move-result-object v3

    .line 10
    iget-object v4, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    .line 145
    sget-object v5, Ll/֫֨ۗ;->᩷:Ll/֫֨ۗ;

    invoke-virtual {v4, v5}, Ll/֫֨ۗ;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "true"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "false"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    return-object v3

    .line 148
    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ll/۠ۧ᩵; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 151
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Ll/᩹֨ۗ;->ۢ:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Ljava/lang/String;
    .locals 2

    .line 138
    iget-wide v0, p0, Ll/᩹֨ۗ;->ۢ:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/֫֨ۗ;)V
    .locals 0

    .line 14
    iput-object p1, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    return-void
.end method

.method public final ۚۙ()Z
    .locals 5

    .line 66
    iget-wide v0, p0, Ll/᩹֨ۗ;->ۢ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۠()Ll/ܺ֨ۗ;
    .locals 4

    .line 116
    new-instance v0, Ll/᩹֨ۗ;

    iget-wide v1, p0, Ll/᩹֨ۗ;->ۢ:J

    iget-object v3, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-direct {v0, v1, v2, v3}, Ll/᩹֨ۗ;-><init>(JLl/֫֨ۗ;)V

    .line 323
    invoke-virtual {v0, p0}, Ll/ܺ۟ۗ;->ۙ(Ll/ܺ۟ۗ;)V

    .line 324
    iget-object v1, p0, Ll/ܺ֨ۗ;->֡:Ll/ᩳۡۗ;

    invoke-virtual {v0, v1}, Ll/ܺ֨ۗ;->ۙ(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ۧۙ()J
    .locals 2

    .line 51
    iget-wide v0, p0, Ll/᩹֨ۗ;->ۢ:J

    return-wide v0
.end method

.method public final ܺۙ()Z
    .locals 7

    .line 83
    invoke-virtual {p0}, Ll/᩹֨ۗ;->᩻ۙ()Z

    move-result v0

    const/4 v1, 0x1

    iget-wide v2, p0, Ll/᩹֨ۗ;->ۢ:J

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    const-wide/16 v5, 0x0

    cmp-long v0, v2, v5

    if-gez v0, :cond_0

    return v1

    :cond_0
    return v4

    .line 86
    :cond_1
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    sget-object v5, Ll/֫֨ۗ;->᩻:Ll/֫֨ۗ;

    if-ne v0, v5, :cond_3

    long-to-int v0, v2

    .line 87
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const/4 v2, 0x0

    cmpg-float v2, v0, v2

    if-gez v2, :cond_2

    .line 0
    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    return v4

    .line 90
    :cond_3
    sget-object v5, Ll/֫֨ۗ;->۫:Ll/֫֨ۗ;

    if-ne v0, v5, :cond_4

    .line 91
    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    const-wide/16 v5, 0x0

    cmpg-double v0, v2, v5

    if-gez v0, :cond_4

    .line 0
    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_4

    return v1

    :cond_4
    return v4
.end method

.method public final ܽۙ()Ll/᩹֨ۗ;
    .locals 4

    .line 100
    invoke-virtual {p0}, Ll/᩹֨ۗ;->᩻ۙ()Z

    move-result v0

    iget-wide v1, p0, Ll/᩹֨ۗ;->ۢ:J

    if-eqz v0, :cond_0

    neg-long v0, v1

    goto :goto_0

    .line 102
    :cond_0
    iget-object v0, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    sget-object v3, Ll/֫֨ۗ;->᩻:Ll/֫֨ۗ;

    if-ne v0, v3, :cond_1

    long-to-int v0, v1

    .line 103
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    neg-float v0, v0

    .line 104
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    int-to-long v0, v0

    goto :goto_0

    .line 105
    :cond_1
    sget-object v3, Ll/֫֨ۗ;->۫:Ll/֫֨ۗ;

    if-ne v0, v3, :cond_2

    .line 106
    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    neg-double v0, v0

    .line 107
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    .line 111
    :goto_0
    new-instance v2, Ll/᩹֨ۗ;

    iget-object v3, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-direct {v2, v0, v1, v3}, Ll/᩹֨ۗ;-><init>(JLl/֫֨ۗ;)V

    return-object v2

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩻ۙ()Z
    .locals 3

    .line 70
    sget-object v0, Ll/ܶ֨ۗ;->ۙ:[I

    iget-object v1, p0, Ll/֡֨ۗ;->ܿ:Ll/֫֨ۗ;

    invoke-virtual {v1}, Ll/֫֨ۗ;->ܶ()Ll/ۨ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    const/4 v2, 0x5

    if-eq v0, v2, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    return v1
.end method
