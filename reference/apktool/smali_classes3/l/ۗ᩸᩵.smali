.class public final Ll/ۗ᩸᩵;
.super Ll/ܺ۠ۗ;
.source "76DY"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 27
    const-class v0, Ll/ۗ᩸᩵;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 7

    .line 31
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۧ᩷()Z

    move-result v0

    if-nez v0, :cond_4

    .line 32
    invoke-virtual {p1}, Ll/ۖۡۗ;->۟ۙ()Ll/ۨۖۗ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 33
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Ll/ۧ۟ۗ;->ۛ:Ll/ۧ۟ۗ;

    .line 34
    invoke-virtual {p1, v0}, Ll/ܺ۟ۗ;->᩷(Ll/֫᩶ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 39
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 40
    new-instance v1, Ll/ܶ᩸᩵;

    invoke-direct {v1, v0}, Ll/ܶ᩸᩵;-><init>(Ljava/util/HashSet;)V

    invoke-static {p1, v1}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    .line 60
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v2

    if-eq v1, v2, :cond_3

    .line 61
    invoke-virtual {p1}, Ll/ۖۡۗ;->ۚۙ()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩷ۡۗ;

    .line 62
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 63
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Ll/֫۟ۗ;->᩶:Ll/֫۟ۗ;

    .line 64
    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    .line 65
    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-nez v3, :cond_1

    sget-object v3, Ll/֫۟ۗ;->ۜۙ:Ll/֫۟ۗ;

    .line 66
    invoke-virtual {v2, v3}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 90
    new-instance v3, Ll/ܳܰۗ;

    invoke-direct {v3}, Ll/ܳܰۗ;-><init>()V

    .line 91
    invoke-virtual {v3}, Ll/ܳܰۗ;->ۤ()V

    .line 92
    invoke-virtual {v3}, Ll/ܳܰۗ;->᩸()Ll/ܳܰۗ;

    .line 93
    invoke-static {p1}, Ll/۠֡ۗ;->ۙ(Ll/ۖۡۗ;)Ll/۠֡ۗ;

    move-result-object v4

    .line 94
    new-instance v5, Ll/֡֡ۗ;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Ll/֡֡ۗ;-><init>(Ll/۠֡ۗ;Z)V

    .line 95
    invoke-virtual {v2}, Ll/᩷ۡۗ;->ۙ()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳۡۗ;

    .line 97
    :try_start_0
    invoke-virtual {v5, v3, v6}, Ll/֡֡ۗ;->ۙ(Ll/ۗۘۗ;Ll/ᩳۡۗ;)V
    :try_end_0
    .catch Ll/۟ۧ᩵; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v3}, Ll/ܳܰۗ;->᩸()Ll/ܳܰۗ;

    .line 103
    invoke-virtual {v3}, Ll/ܳܰۗ;->ۧ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "*/"

    const-string v5, "*\\/"

    .line 67
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    .line 68
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Code restructure failed: missing block: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", code lost:"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ll/ۨᩳۗ;->ۤ(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 73
    :cond_3
    new-instance v0, Ll/᩹᩸᩵;

    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, Ll/ۛ᩸ۨ;-><init>(I)V

    .line 73
    invoke-static {p1, v0}, Ll/᩺᩸᩵;->ۙ(Ll/ۖۡۗ;Ll/ܰ᩸᩵;)V

    :cond_4
    :goto_2
    return-void
.end method
