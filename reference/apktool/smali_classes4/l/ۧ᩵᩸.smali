.class public final synthetic Ll/ۧ᩵᩸;
.super Ljava/lang/Object;
.source "T6QN"

# interfaces
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/᩻ܶ᩵;


# direct methods
.method public static ۙ(Ljava/security/Key;Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    .line 1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۙ(Ljava/lang/CharSequence;)Ll/ܽܺۗ;
    .locals 0

    .line 0
    invoke-interface {p0}, Ljava/lang/CharSequence;->chars()Ljava/util/stream/IntStream;

    move-result-object p0

    invoke-static {p0}, Ll/᩻ܺۗ;->convert(Ljava/util/stream/IntStream;)Ll/ܽܺۗ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Long;

    const/4 p1, 0x0

    return-object p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 0

    .line 107
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    return p1
.end method
