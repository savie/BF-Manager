.class public final synthetic Ll/۬ܿ᩹;
.super Ljava/lang/Object;
.source "4BPK"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۚۙܽ;


# direct methods
.method public static ۙ(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 4

    const-string v0, "UTF-8"

    .line 62
    :try_start_0
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 63
    new-instance v2, Ljava/io/PrintStream;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3, v0}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;ZLjava/lang/String;)V

    invoke-virtual {p0, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 64
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 66
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static ۙ(Ll/ۙ֡᩹;Ljava/util/Comparator;)Ljava/util/Comparator;
    .locals 1

    .line 76
    instance-of v0, p1, Ll/ۙ֡᩹;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۙ֡᩹;

    invoke-interface {p0, p1}, Ll/ۙ֡᩹;->ۙ(Ll/ۙ֡᩹;)Ll/ۜܿ᩹;

    move-result-object p0

    return-object p0

    .line 77
    :cond_0
    invoke-static {p0, p1}, Ll/ۖ۫ۗ;->$default$thenComparing(Ljava/util/Comparator;Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ll/ᩳܽ᩷;

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
