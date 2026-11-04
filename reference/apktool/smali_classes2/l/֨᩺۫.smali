.class public final Ll/֨᩺۫;
.super Ljava/lang/Object;
.source "9AFA"


# static fields
.field public static final ۙ:Ll/ܶ᩸۫;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 34
    new-instance v0, Ll/ܶ᩸۫;

    new-instance v1, Ll/ۢ᩺۫;

    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v2, Ll/᩶᩹۫;

    invoke-direct {v2}, Ll/᩶᩹۫;-><init>()V

    invoke-direct {v0, v1, v2}, Ll/ܶ᩸۫;-><init>(Ll/ۧ᩺ۨ;Ll/᩶᩹۫;)V

    sput-object v0, Ll/֨᩺۫;->ۙ:Ll/ܶ᩸۫;

    return-void
.end method

.method public static ۙ(Ll/ۢۘ۫;)Ll/֨ۘ۫;
    .locals 2

    .line 117
    :try_start_0
    sget-object v0, Ll/֨᩺۫;->ۙ:Ll/ܶ᩸۫;

    invoke-virtual {v0, p0}, Ll/ܶ᩸۫;->ۙ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֨ۘ۫;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 119
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_1

    .line 122
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 123
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_0

    .line 124
    check-cast v0, Ljava/io/IOException;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 126
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 120
    :cond_1
    check-cast p0, Ljava/io/IOException;

    throw p0
.end method

.method public static ۙ(Ll/֨ۘ۫;)V
    .locals 2

    .line 142
    :try_start_0
    sget-object v0, Ll/֨᩺۫;->ۙ:Ll/ܶ᩸۫;

    invoke-interface {p0}, Ll/֨ۘ۫;->getKey()Ll/ۢۘ۫;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ll/ܶ᩸۫;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ᩷(Ll/֨ۘ۫;)V
    .locals 2

    .line 132
    :try_start_0
    sget-object v0, Ll/֨᩺۫;->ۙ:Ll/ܶ᩸۫;

    invoke-interface {p0}, Ll/֨ۘ۫;->getKey()Ll/ۢۘ۫;

    move-result-object v1

    invoke-virtual {v0, v1, p0}, Ll/ܶ᩸۫;->᩷(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static ᩷(Ll/ۢۘ۫;)V
    .locals 1

    .line 112
    sget-object v0, Ll/֨᩺۫;->ۙ:Ll/ܶ᩸۫;

    invoke-virtual {v0, p0}, Ll/ܶ᩸۫;->᩷(Ljava/lang/Object;)V

    return-void
.end method
