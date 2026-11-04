.class public final Ll/᩹᩸᩵;
.super Ll/ۛ᩸ۨ;
.source "76DY"


# virtual methods
.method public final ۤ(Ll/ۖۡۗ;Ll/ܿۡۗ;)Z
    .locals 3

    .line 76
    instance-of v0, p2, Ll/ۜۖۗ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 78
    check-cast p2, Ll/ۜۖۗ;

    invoke-virtual {p2}, Ll/ۜۖۗ;->ۤۙ()Ll/᩷ۡۗ;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 79
    sget-object v0, Ll/֫۟ۗ;->ܿ:Ll/֫۟ۗ;

    invoke-virtual {p2, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    invoke-virtual {p2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect condition in loop: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    :cond_0
    return v1
.end method
