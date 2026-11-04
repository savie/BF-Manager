.class public final Ll/ۡ֨ۗ;
.super Ljava/lang/Object;
.source "36BK"


# direct methods
.method public static ۙ(Ll/᩷᩶ۗ;)Ll/֡ۢۗ;
    .locals 3

    .line 10
    sget-object v0, Ll/֨֨ۗ;->ۙ:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    .line 19
    sget-object p0, Ll/֡ۢۗ;->۟:Ll/֡ۢۗ;

    return-object p0

    .line 22
    :cond_0
    new-instance v0, Ll/۠ۧ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported method handle type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 22
    throw v0

    .line 17
    :cond_1
    sget-object p0, Ll/֡ۢۗ;->֡:Ll/֡ۢۗ;

    return-object p0

    .line 14
    :cond_2
    sget-object p0, Ll/֡ۢۗ;->ۡ:Ll/֡ۢۗ;

    return-object p0

    .line 12
    :cond_3
    sget-object p0, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    return-object p0
.end method
