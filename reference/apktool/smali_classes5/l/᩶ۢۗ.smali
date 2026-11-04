.class public Ll/᩶ۢۗ;
.super Ll/ܳۢۗ;
.source "B6CK"


# instance fields
.field public final ۖ:Ll/֡ۢۗ;

.field public final ۡ:Ll/᩷ۢۗ;


# direct methods
.method public constructor <init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V
    .locals 1

    .line 42
    sget-object v0, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    .line 11
    invoke-direct {p0, v0, p3}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 43
    iput-object p1, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    .line 44
    iput-object p2, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    return-void
.end method

.method public constructor <init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/֡ۢۗ;Z)V
    .locals 7

    .line 17
    sget-object v0, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    if-eq p3, v0, :cond_0

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/֡ۢۗ;ZZ)V

    return-void
.end method

.method public constructor <init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/֡ۢۗ;ZZ)V
    .locals 2

    .line 21
    sget-object v0, Ll/᩺ۢۗ;->ۧۙ:Ll/᩺ۢۗ;

    invoke-virtual {p1}, Ll/᩷ۢۗ;->᩸()I

    move-result v1

    add-int/2addr v1, p4

    .line 11
    invoke-direct {p0, v0, v1}, Ll/ᩳۡۗ;-><init>(Ll/᩺ۢۗ;I)V

    .line 22
    iput-object p1, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    .line 23
    iput-object p3, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    const/4 p3, 0x0

    if-eqz p5, :cond_0

    .line 25
    invoke-interface {p2, p3}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p3

    :cond_0
    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    move p4, p3

    goto :goto_0

    .line 27
    :cond_1
    invoke-interface {p2, p3}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result p4

    .line 28
    :goto_0
    invoke-virtual {p1}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ᩳۗ;->getType()Ll/֫֨ۗ;

    move-result-object v0

    .line 179
    sget v1, Ll/ܺ֨ۗ;->۟:I

    .line 31
    new-instance v1, Ll/ۛ֨ۗ;

    invoke-direct {v1, p4, v0}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 179
    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    add-int/lit8 p3, p3, 0x1

    .line 31
    :cond_2
    invoke-virtual {p1}, Ll/᩷ۢۗ;->ᩴ()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/֫֨ۗ;

    if-eqz p5, :cond_3

    move v0, p3

    goto :goto_2

    .line 32
    :cond_3
    invoke-interface {p2, p3}, Ll/ۜ᩶ۗ;->ۙ(I)I

    move-result v0

    .line 179
    :goto_2
    sget v1, Ll/ܺ֨ۗ;->۟:I

    .line 31
    new-instance v1, Ll/ۛ֨ۗ;

    invoke-direct {v1, v0, p4}, Ll/ۛ֨ۗ;-><init>(ILl/֫֨ۗ;)V

    .line 179
    invoke-virtual {p0, v1}, Ll/ᩳۡۗ;->ۙ(Ll/ܺ֨ۗ;)V

    .line 33
    invoke-virtual {p4}, Ll/֫֨ۗ;->᩹()I

    move-result p4

    add-int/2addr p3, p4

    goto :goto_1

    .line 35
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " call: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۛۙ()I
    .locals 2

    .line 84
    iget-object v0, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    sget-object v1, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public ۫ۙ()Ll/ᩳۡۗ;
    .locals 4

    .line 89
    new-instance v0, Ll/᩶ۢۗ;

    iget-object v1, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v2

    iget-object v3, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-direct {v0, v3, v1, v2}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    return-object v0
.end method

.method public final ܰۙ()Ll/֡ۢۗ;
    .locals 1

    .line 48
    iget-object v0, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    return-object v0
.end method

.method public ᩴ(Ll/ᩳۡۗ;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 97
    :cond_0
    instance-of v1, p1, Ll/᩶ۢۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-super {p0, p1}, Ll/ᩳۡۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 100
    :cond_1
    check-cast p1, Ll/᩶ۢۗ;

    .line 101
    iget-object v1, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    iget-object v3, p1, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    iget-object p1, p1, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {v1, p1}, Ll/᩷ۢۗ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v2
.end method

.method public final ᩵ۙ()Ll/᩷ۢۗ;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    return-object v0
.end method

.method public final ᩶ۙ()Z
    .locals 4

    .line 71
    sget-object v0, Ll/֡ۢۗ;->ᩳ:Ll/֡ۢۗ;

    const/4 v1, 0x1

    iget-object v2, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    if-ne v2, v0, :cond_0

    return v1

    .line 75
    :cond_0
    sget-object v0, Ll/֡ۢۗ;->ۡ:Ll/֡ۢۗ;

    if-ne v2, v0, :cond_2

    .line 76
    iget-object v0, p0, Ll/᩶ۢۗ;->ۡ:Ll/᩷ۢۗ;

    invoke-virtual {v0}, Ll/᩷ۢۗ;->۫()Ll/֨ᩳۗ;

    move-result-object v2

    invoke-virtual {v2}, Ll/֨ᩳۗ;->֫()Ljava/lang/String;

    move-result-object v2

    const-string v3, "java.lang.invoke.MethodHandle"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 77
    invoke-virtual {v0}, Ll/᩷ۢۗ;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "invoke"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Ll/᩷ۢۗ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "invokeExact"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public ᩺ۙ()Ll/ܺ֨ۗ;
    .locals 2

    .line 59
    iget-object v0, p0, Ll/᩶ۢۗ;->ۖ:Ll/֡ۢۗ;

    sget-object v1, Ll/֡ۢۗ;->ۢ:Ll/֡ۢۗ;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    .line 60
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩸(I)Ll/ܺ֨ۗ;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
