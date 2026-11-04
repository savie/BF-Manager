.class public final synthetic Ll/۬ۚ᩸;
.super Ljava/lang/Object;
.source "61L9"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/᩻ܶ᩵;
.implements Ll/ۘ᩺᩻;


# direct methods
.method public static ۙ(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/io/IOException;)Ljava/lang/String;
    .locals 1

    .line 0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ljava/lang/String;)Ll/ܽܺۗ;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/String;->codePoints()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܺۗ;->convert(Ljava/util/stream/IntStream;)Ll/ܽܺۗ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    sget v0, Ll/ۖ֫᩸;->۟᩷:I

    .line 1253
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return-object p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ljava/lang/String;Z)I
    .locals 0

    .line 0
    sget-object p1, Ll/ܰ᩺᩻;->ۧۙ:Ll/᩻֫ܺ;

    const/4 p1, 0x2

    return p1
.end method
