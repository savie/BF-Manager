.class public final Ll/᩸ۢۗ;
.super Ll/ᩳۡۗ;
.source "AIV0"


# instance fields
.field public final ۡ:Ll/ᩴۢۗ;


# direct methods
.method public constructor <init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V
    .locals 2

    .line 61
    sget-object v0, Ll/᩺ۢۗ;->֡:Ll/᩺ۢۗ;

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 62
    iput-object p1, p0, Ll/᩸ۢۗ;->ۡ:Ll/ᩴۢۗ;

    .line 63
    invoke-virtual {p0, p2}, Ll/ᩳۡۗ;->᩷(Ll/ۛ֨ۗ;)V

    .line 64
    invoke-virtual {p0, p3}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 65
    invoke-virtual {p0, p4}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    return-void
.end method

.method public static ۙ(Ll/ۜ᩶ۗ;Ll/ᩴۢۗ;Ll/֫֨ۗ;)Ll/᩸ۢۗ;
    .locals 5

    .line 45
    sget-object v0, Ll/֫֨ۗ;->ܺ:Ll/֫֨ۗ;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Ll/ᩴۢۗ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    sget-object v1, Ll/֫֨ۗ;->ܽ:Ll/֫֨ۗ;

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    const/4 v2, 0x0

    .line 18
    invoke-static {p0, v2, v1}, Ll/ܺ֨ۗ;->ۙ(Ll/ۜ᩶ۗ;ILl/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v1

    if-ne p2, v0, :cond_1

    .line 52
    invoke-virtual {p1}, Ll/ᩴۢۗ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    sget-object p2, Ll/֫֨ۗ;->ۘ:Ll/֫֨ۗ;

    .line 20
    :cond_1
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܶ()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v0, v4, :cond_3

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2

    .line 24
    new-instance v0, Ll/᩸ۢۗ;

    .line 35
    invoke-interface {p0, v3}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result v2

    .line 31
    new-instance v3, Ll/ۛ֨ۗ;

    invoke-direct {v3, v2, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 35
    invoke-interface {p0, v4}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    .line 31
    new-instance v2, Ll/ۛ֨ۗ;

    invoke-direct {v2, p0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 24
    invoke-direct {v0, p1, v1, v3, v2}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    return-object v0

    .line 26
    :cond_2
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected registers count in "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1

    .line 22
    :cond_3
    new-instance v0, Ll/᩸ۢۗ;

    .line 35
    invoke-interface {p0, v2}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result v2

    .line 31
    new-instance v4, Ll/ۛ֨ۗ;

    invoke-direct {v4, v2, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 35
    invoke-interface {p0, v3}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    .line 31
    new-instance v2, Ll/ۛ֨ۗ;

    invoke-direct {v2, p0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 22
    invoke-direct {v0, p1, v1, v4, v2}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    return-object v0
.end method

.method public static ᩷(Ll/ۜ᩶ۗ;Ll/ᩴۢۗ;Ll/֫֨ۗ;)Ll/᩸ۢۗ;
    .locals 5

    .line 45
    sget-object v0, Ll/֫֨ۗ;->ܺ:Ll/֫֨ۗ;

    if-ne p2, v0, :cond_0

    invoke-virtual {p1}, Ll/ᩴۢۗ;->᩸()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 46
    sget-object v1, Ll/֫֨ۗ;->ܽ:Ll/֫֨ۗ;

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    const/4 v2, 0x0

    .line 31
    invoke-static {p0, v2, v1}, Ll/ܺ֨ۗ;->ۙ(Ll/ۜ᩶ۗ;ILl/֫֨ۗ;)Ll/ۛ֨ۗ;

    move-result-object v1

    if-ne p2, v0, :cond_1

    .line 52
    invoke-virtual {p1}, Ll/ᩴۢۗ;->᩸()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    sget-object p2, Ll/֫֨ۗ;->ۘ:Ll/֫֨ۗ;

    .line 66
    :cond_1
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ᩴ()J

    move-result-wide v3

    .line 62
    invoke-static {v3, v4, p2}, Ll/᩹֨ۗ;->᩷(JLl/֫֨ۗ;)Ll/᩹֨ۗ;

    move-result-object v0

    .line 34
    invoke-interface {p0}, Ll/ۜ᩶ۗ;->ܶ()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_3

    const/4 v2, 0x2

    if-ne v3, v2, :cond_2

    .line 38
    new-instance v2, Ll/᩸ۢۗ;

    .line 35
    invoke-interface {p0, v4}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    .line 31
    new-instance v3, Ll/ۛ֨ۗ;

    invoke-direct {v3, p0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 38
    invoke-direct {v2, p1, v1, v3, v0}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    return-object v2

    .line 40
    :cond_2
    new-instance p1, Ll/۠ۧ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unexpected registers count in "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 40
    throw p1

    .line 36
    :cond_3
    new-instance v3, Ll/᩸ۢۗ;

    .line 35
    invoke-interface {p0, v2}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p0

    .line 31
    new-instance v2, Ll/ۛ֨ۗ;

    invoke-direct {v2, p0, p2}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 36
    invoke-direct {v3, p1, v1, v2, v0}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    return-object v3
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 6

    .line 120
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    iget v1, p0, Ll/ᩳۡۗ;->ۢ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": ARITH "

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    sget-object v1, Ll/֫۟ۗ;->ᩳ:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/᩸ۢۗ;->ۡ:Ll/ᩴۢۗ;

    const/4 v4, 0x0

    const/16 v5, 0x20

    if-eqz v1, :cond_0

    .line 124
    invoke-virtual {p0, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ll/ᩴۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 126
    :cond_0
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    :cond_1
    invoke-virtual {p0, v4}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ll/ᩴۢۗ;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    :goto_0
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    .line 134
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 5

    .line 114
    new-instance v0, Ll/᩸ۢۗ;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ܺ֨ۗ;->۠()Ll/ܺ֨ۗ;

    move-result-object v2

    iget-object v3, p0, Ll/᩸ۢۗ;->ۡ:Ll/ᩴۢۗ;

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Ll/᩸ۢۗ;-><init>(Ll/ᩴۢۗ;Ll/ۛ֨ۗ;Ll/ܺ֨ۗ;Ll/ܺ֨ۗ;)V

    .line 115
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 89
    :cond_0
    instance-of v1, p1, Ll/᩸ۢۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 92
    :cond_1
    check-cast p1, Ll/᩸ۢۗ;

    .line 93
    iget-object v1, p0, Ll/᩸ۢۗ;->ۡ:Ll/ᩴۢۗ;

    iget-object v3, p1, Ll/᩸ۢۗ;->ۡ:Ll/ᩴۢۗ;

    if-ne v1, v3, :cond_4

    .line 97
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v1

    .line 98
    invoke-virtual {p1, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object p1

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v3, v1, Ll/᩹֨ۗ;

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of v4, p1, Ll/᩹֨ۗ;

    if-eq v3, v4, :cond_2

    goto :goto_1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_0

    .line 107
    :cond_3
    check-cast v1, Ll/᩹֨ۗ;

    invoke-virtual {v1}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v3

    .line 108
    check-cast p1, Ll/᩹֨ۗ;

    invoke-virtual {p1}, Ll/᩹֨ۗ;->ۧۙ()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-nez p1, :cond_4

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v2
.end method

.method public final ᩵ۙ()Ll/ᩴۢۗ;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/᩸ۢۗ;->ۡ:Ll/ᩴۢۗ;

    return-object v0
.end method
