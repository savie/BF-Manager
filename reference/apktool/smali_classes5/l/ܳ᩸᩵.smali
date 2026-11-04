.class public final Ll/ܳ᩸᩵;
.super Ll/ܺ۠ۗ;
.source "D6FW"


# instance fields
.field public ܰ:Ll/ۧ᩸᩵;


# direct methods
.method public static ۙ(Ll/ۨᩳۗ;I)V
    .locals 2

    .line 114
    invoke-interface {p0}, Ll/᩵ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 115
    invoke-virtual {v0, p1}, Ll/ۢᩳۗ;->ۙ(I)Ll/ۢᩳۗ;

    move-result-object p1

    if-eq p1, v0, :cond_4

    .line 117
    invoke-interface {p0, p1}, Ll/᩵ۡۗ;->ۙ(Ll/ۢᩳۗ;)V

    .line 251
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "package-private"

    goto :goto_0

    .line 254
    :cond_0
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "public"

    goto :goto_0

    .line 257
    :cond_1
    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "private"

    goto :goto_0

    .line 260
    :cond_2
    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܺ()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "protected"

    :goto_0
    const-string v0, "Access modifiers changed from: "

    .line 118
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۨᩳۗ;->᩷(Ljava/lang/String;)V

    return-void

    .line 263
    :cond_3
    new-instance p0, Ll/۠ۧ᩵;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unknown visibility flags: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 263
    throw p0

    :cond_4
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 1

    .line 35
    new-instance v0, Ll/ۧ᩸᩵;

    invoke-direct {v0, p1}, Ll/ۧ᩸᩵;-><init>(Ll/֫ۖۗ;)V

    iput-object v0, p0, Ll/ܳ᩸᩵;->ܰ:Ll/ۧ᩸᩵;

    .line 36
    invoke-virtual {p1}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 4

    .line 51
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 95
    :cond_0
    invoke-virtual {p1}, Ll/ۖۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 96
    sget-object v1, Ll/ۧ۟ۗ;->ᩳ:Ll/ۧ۟ۗ;

    invoke-virtual {p1, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v1

    check-cast v1, Ll/ܶᩳۗ;

    if-eqz v1, :cond_1

    .line 97
    invoke-virtual {v1}, Ll/ܶᩳۗ;->᩷()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    .line 99
    invoke-virtual {v1}, Ll/ܶᩳۗ;->᩷()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۡۗ;

    .line 100
    new-instance v2, Ll/ۢᩳۗ;

    invoke-interface {v1}, Ll/᩶ۡۗ;->᩶()I

    move-result v1

    sget-object v3, Ll/ᩳᩳۗ;->֡:Ll/ᩳᩳۗ;

    invoke-direct {v2, v1, v3}, Ll/ۢᩳۗ;-><init>(ILl/ᩳᩳۗ;)V

    .line 101
    invoke-virtual {v0, v2}, Ll/ۢᩳۗ;->ۙ(Ll/ۢᩳۗ;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    invoke-virtual {v2}, Ll/ۢᩳۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ۨ()I

    move-result v0

    invoke-static {p1, v0}, Ll/ܳ᩸᩵;->ۙ(Ll/ۨᩳۗ;I)V

    .line 106
    :cond_1
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    .line 107
    iget-object v2, p0, Ll/ܳ᩸᩵;->ܰ:Ll/ۧ᩸᩵;

    new-instance v3, Ll/ᩴ᩸᩵;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v2, p1, v1, v3}, Ll/ۧ᩸᩵;->ۙ(Ll/ۨᩳۗ;Ll/ۨᩳۗ;Ll/֫᩸᩵;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 6

    .line 59
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷()Ll/ۢᩳۗ;

    move-result-object v0

    .line 60
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷᩷()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܽ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 64
    :cond_0
    invoke-virtual {p1}, Ll/᩻ۡۗ;->᩷᩷()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ۢᩳۗ;->᩻()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/ۢᩳۗ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 65
    :cond_1
    invoke-static {p1, v2}, Ll/ܳ᩸᩵;->ۙ(Ll/ۨᩳۗ;I)V

    return v2

    .line 69
    :cond_2
    invoke-virtual {p1}, Ll/᩻ۡۗ;->֨ۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻ۡۗ;

    .line 70
    iget-object v3, p0, Ll/ܳ᩸᩵;->ܰ:Ll/ۧ᩸᩵;

    new-instance v4, Ll/ۤ᩸᩵;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v3, p1, v1, v4}, Ll/ۧ᩸᩵;->ۙ(Ll/ۨᩳۗ;Ll/ۨᩳۗ;Ll/֫᩸᩵;)V

    goto :goto_0

    .line 75
    :cond_3
    invoke-virtual {p1}, Ll/᩻ۡۗ;->ۡۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۡۗ;

    .line 76
    sget-object v3, Ll/ۧ۟ۗ;->۟:Ll/ۧ۟ۗ;

    invoke-virtual {v1, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫᩶ۗ;)Ll/ۧ᩶ۗ;

    move-result-object v3

    check-cast v3, Ll/ܽᩳۗ;

    if-eqz v3, :cond_5

    .line 77
    invoke-virtual {v3}, Ll/ܽᩳۗ;->ܳ()Z

    move-result v3

    if-nez v3, :cond_5

    const/4 v3, 0x1

    goto :goto_1

    :cond_5
    const/4 v3, 0x0

    .line 78
    :goto_1
    sget-object v4, Ll/֫۟ۗ;->۟ۙ:Ll/֫۟ۗ;

    invoke-virtual {v1, v4}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v4

    if-nez v3, :cond_6

    if-eqz v4, :cond_4

    .line 81
    :cond_6
    invoke-virtual {v1}, Ll/ۖۡۗ;->ۜۙ()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v3, Ll/᩺ۜܳ;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Ll/᩺ۜܳ;-><init>(I)V

    .line 82
    invoke-interface {v1, v3}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    .line 83
    invoke-static {}, Ll/֫ܺۗ;->toSet()Ll/ۚܺۗ;

    move-result-object v3

    invoke-interface {v1, v3}, Ll/᩵ܺۗ;->collect(Ll/ۚܺۗ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    .line 85
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻ۡۗ;

    .line 86
    iget-object v4, p0, Ll/ܳ᩸᩵;->ܰ:Ll/ۧ᩸᩵;

    new-instance v5, Ll/᩸᩸᩵;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, p1, v3, v5}, Ll/ۧ᩸᩵;->ۙ(Ll/ۨᩳۗ;Ll/ۨᩳۗ;Ll/֫᩸᩵;)V

    goto :goto_2

    :cond_7
    :goto_3
    return v2
.end method
