.class public final Ll/ۛ֡ۗ;
.super Ljava/lang/Object;
.source "3IRZ"


# direct methods
.method public static ۙ(Ll/᩻ۡۗ;)Ll/᩹ۘۗ;
    .locals 9

    .line 15
    sget-object v0, Ll/֫۟ۗ;->᩷ۙ:Ll/֫۟ۗ;

    invoke-virtual {p0, v0}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll/۠֫᩵;->᩷(Ll/᩻ۡۗ;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    sget-object p0, Ll/᩹ۘۗ;->ۙ:Ll/ᩴܰۗ;

    return-object p0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ll/᩻ۡۗ;->ܰ()Ll/֫ۖۗ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫ۖۗ;->۠()Ll/ۛۘۗ;

    move-result-object v0

    .line 23
    new-instance v8, Ll/ۨ֡ۗ;

    .line 86
    invoke-virtual {v0}, Ll/ۛۘۗ;->ܳۙ()Z

    move-result v4

    invoke-static {p0}, Ll/۠֫᩵;->ۙ(Ll/᩻ۡۗ;)Ll/ܶۘۗ;

    move-result-object v1

    sget-object v2, Ll/ܶۘۗ;->ܿ:Ll/ܶۘۗ;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 87
    :goto_0
    invoke-virtual {v0}, Ll/ۛۘۗ;->ᩴۙ()Z

    move-result v6

    invoke-virtual {v0}, Ll/ۛۘۗ;->ۗ()Ll/ۡۘۗ;

    move-result-object v7

    const/4 v3, 0x0

    move-object v1, v8

    move-object v2, p0

    .line 86
    invoke-direct/range {v1 .. v7}, Ll/ۨ֡ۗ;-><init>(Ll/᩻ۡۗ;Ll/ۨ֡ۗ;ZZZLl/ۡۘۗ;)V

    .line 29
    :try_start_0
    invoke-virtual {v8}, Ll/ۨ֡ۗ;->ۚ()Ll/᩹ۘۗ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 31
    sget-object v1, Ll/֫۟ۗ;->᩸᩷:Ll/֫۟ۗ;

    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۙ(Ll/֫۟ۗ;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 32
    invoke-virtual {p0, v1}, Ll/ܺ۟ۗ;->ۤ(Ll/֫۟ۗ;)V

    .line 34
    :try_start_1
    invoke-virtual {v8}, Ll/ۨ֡ۗ;->ۚ()Ll/᩹ۘۗ;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 36
    new-instance v0, Ll/۠ۧ᩵;

    const-string v1, "Code generation error after restart"

    .line 15
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    throw v0

    .line 39
    :cond_2
    new-instance p0, Ll/۠ۧ᩵;

    const-string v1, "Code generation error"

    .line 15
    invoke-direct {p0, v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    throw p0
.end method
