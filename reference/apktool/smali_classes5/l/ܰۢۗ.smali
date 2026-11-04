.class public final Ll/ܰۢۗ;
.super Ll/᩶ۢۗ;
.source "M6G8"


# instance fields
.field public final ۜ:Ll/᩶ۢۗ;

.field public ۠:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/᩶ۢۗ;Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p2, p3, p4}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 35
    iput-object p1, p0, Ll/ܰۢۗ;->ۜ:Ll/᩶ۢۗ;

    return-void
.end method

.method public constructor <init>(Ll/᩶ۢۗ;Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Z)V
    .locals 6

    .line 29
    sget-object v3, Ll/֡ۢۗ;->ܿ:Ll/֡ۢۗ;

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Ll/᩶ۢۗ;-><init>(Ll/᩷ۢۗ;Ll/ۜ᩶ۗ;Ll/֡ۢۗ;ZZ)V

    .line 30
    iput-object p1, p0, Ll/ܰۢۗ;->ۜ:Ll/᩶ۢۗ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    iget v1, p0, Ll/ᩳۡۗ;->ۢ:I

    invoke-static {v1}, Ll/۠֫᩵;->ۙ(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": INVOKE_CUSTOM "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 89
    invoke-virtual {p0}, Ll/ᩳۡۗ;->ܽۙ()Ll/ۛ֨ۗ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    :cond_0
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->ۙ(Ljava/lang/StringBuilder;)Z

    move-result v1

    const/16 v2, 0xa

    if-nez v1, :cond_1

    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    :cond_1
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ljava/lang/StringBuilder;)V

    const-string v1, " call-site: \n  "

    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܰۢۗ;->۠:Ljava/util/List;

    const-string v3, "\n  "

    invoke-static {v1, v3}, Ll/ۘۧ᩵;->ۙ(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡ۙ()Ll/᩶ۢۗ;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ܰۢۗ;->ۜ:Ll/᩶ۢۗ;

    return-object v0
.end method

.method public final ۛۙ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۫ۙ()Ll/ᩳۡۗ;
    .locals 5

    .line 52
    new-instance v0, Ll/ܰۢۗ;

    invoke-virtual {p0}, Ll/᩶ۢۗ;->᩵ۙ()Ll/᩷ۢۗ;

    move-result-object v1

    invoke-virtual {p0}, Ll/᩶ۢۗ;->ܰۙ()Ll/֡ۢۗ;

    move-result-object v2

    invoke-virtual {p0}, Ll/ᩳۡۗ;->᩻ۙ()I

    move-result v3

    iget-object v4, p0, Ll/ܰۢۗ;->ۜ:Ll/᩶ۢۗ;

    invoke-direct {v0, v4, v1, v2, v3}, Ll/ܰۢۗ;-><init>(Ll/᩶ۢۗ;Ll/᩷ۢۗ;Ll/֡ۢۗ;I)V

    .line 53
    invoke-virtual {p0, v0}, Ll/ᩳۡۗ;->᩷(Ll/ᩳۡۗ;)V

    .line 54
    iget-object v1, p0, Ll/ܰۢۗ;->۠:Ljava/util/List;

    .line 43
    iput-object v1, v0, Ll/ܰۢۗ;->۠:Ljava/util/List;

    return-object v0
.end method

.method public final ܿۙ()Ljava/util/List;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/ܰۢۗ;->۠:Ljava/util/List;

    return-object v0
.end method

.method public final ᩴ(Ll/ᩳۡۗ;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 78
    :cond_0
    instance-of v1, p1, Ll/ܰۢۗ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 79
    invoke-super {p0, p1}, Ll/᩶ۢۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result v1

    if-eqz v1, :cond_1

    check-cast p1, Ll/ܰۢۗ;

    iget-object p1, p1, Ll/ܰۢۗ;->ۜ:Ll/᩶ۢۗ;

    iget-object v1, p0, Ll/ܰۢۗ;->ۜ:Ll/᩶ۢۗ;

    invoke-virtual {v1, p1}, Ll/᩶ۢۗ;->ᩴ(Ll/ᩳۡۗ;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final ᩷(Ljava/util/List;)V
    .locals 0

    .line 43
    iput-object p1, p0, Ll/ܰۢۗ;->۠:Ljava/util/List;

    return-void
.end method

.method public final ᩺ۙ()Ll/ܺ֨ۗ;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
