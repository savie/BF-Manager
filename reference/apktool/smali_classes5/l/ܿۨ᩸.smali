.class public final synthetic Ll/ܿۨ᩸;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 2
    check-cast p1, Ll/᩷ۨᩴ;

    .line 4
    sget v0, Ll/ܿۛ᩸;->֡᩷:I

    .line 37
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".e2"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v1, ".e2-"

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_1

    .line 1291
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ᩳ()Z

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x3

    move v2, v1

    .line 42
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    if-ge v2, v3, :cond_7

    const-string v3, "-new-"

    .line 43
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v4, 0x5

    goto :goto_1

    :cond_2
    const-string v3, "-deleted-"

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v4, 0x9

    :cond_3
    :goto_1
    if-eqz v4, :cond_6

    add-int v3, v2, v4

    add-int/lit8 v5, v3, 0x24

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-le v5, v6, :cond_4

    goto :goto_2

    .line 45
    :cond_4
    invoke-virtual {v0, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 46
    :try_start_0
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v4, v4, 0x24

    add-int/2addr v2, v4

    goto :goto_0

    :catch_0
    :cond_6
    :goto_2
    return-void

    .line 50
    :cond_7
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    new-array v2, v4, [Ljava/lang/String;

    invoke-static {p1, v2}, Ll/ۛ۬᩹;->of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object p1

    .line 51
    invoke-virtual {v0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/᩺۬᩹;->resolveSibling(Ljava/lang/String;)Ll/᩺۬᩹;

    move-result-object v0

    const-string v1, "abandoned_directory_cleanup"

    .line 52
    invoke-static {v1, v0}, Ll/۠᩹᩸;->ۙ(Ljava/lang/String;Ll/᩺۬᩹;)Ll/۠᩹᩸;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ll/۠᩹᩸;->᩷()Ll/᩹ܽ᩵;

    move-result-object v1

    new-instance v2, Ll/᩺᩹᩸;

    invoke-direct {v2, v4, p1}, Ll/᩺᩹᩸;-><init>(ILjava/lang/Object;)V

    sget-object p1, Ll/ۙ᩻ܺ;->ۤ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v1, v2, p1}, Ll/᩹ܽ᩵;->᩷(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)Ll/᩹ܽ᩵;

    move-result-object p1

    new-instance v1, Ll/ۘ᩹᩸;

    invoke-direct {v1, v0}, Ll/ۘ᩹᩸;-><init>(Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p1, v1}, Ll/᩹ܽ᩵;->ۙ(Ll/֫ܶ᩵;)Ll/᩹ܽ᩵;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
