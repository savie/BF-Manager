.class public final Ll/۫ܰۗ;
.super Ll/ܺ۠ۗ;
.source "W6ES"


# static fields
.field public static final ᩶:Ll/᩻ܽ᩺;


# instance fields
.field public final ܰ:Ll/ۗܿۗ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 15
    const-class v0, Ll/۫ܰۗ;

    invoke-static {v0}, Ll/ܺܽ᩺;->ۙ(Ljava/lang/Class;)Ll/᩻ܽ᩺;

    move-result-object v0

    sput-object v0, Ll/۫ܰۗ;->᩶:Ll/᩻ܽ᩺;

    return-void
.end method

.method public constructor <init>(Ll/ۗܿۗ;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/۫ܰۗ;->ܰ:Ll/ۗܿۗ;

    return-void
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/۫ܰۗ;->ܰ:Ll/ۗܿۗ;

    invoke-interface {v0}, Ll/ܽܿۗ;->ۤ()Ll/ܶܿۗ;

    const/4 v0, 0x0

    throw v0
.end method

.method public final ۙ(Ll/֫ۖۗ;)V
    .locals 2

    .line 31
    :try_start_0
    iget-object p1, p0, Ll/۫ܰۗ;->ܰ:Ll/ۗܿۗ;

    invoke-interface {p1}, Ll/ۗܿۗ;->ۙ()V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 33
    :goto_0
    sget-object v0, Ll/۫ܰۗ;->᩶:Ll/᩻ܽ᩺;

    const-string v1, "Error in decompile pass init: {}"

    invoke-interface {v0, v1, p0, p1}, Ll/᩻ܽ᩺;->ᩴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/ۖۡۗ;)V
    .locals 3

    .line 50
    :try_start_0
    iget-object v0, p0, Ll/۫ܰۗ;->ܰ:Ll/ۗܿۗ;

    invoke-interface {v0}, Ll/ۗܿۗ;->᩷()V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 52
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error in decompile pass: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {p1, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final ۙ(Ll/᩻ۡۗ;)Z
    .locals 3

    .line 40
    :try_start_0
    iget-object v0, p0, Ll/۫ܰۗ;->ܰ:Ll/ۗܿۗ;

    invoke-interface {v0}, Ll/ۗܿۗ;->᩷()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 42
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error in decompile pass: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-static {p1, v1, v0}, Ll/᩺֫᩵;->ۙ(Ll/᩺ۡۗ;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method
