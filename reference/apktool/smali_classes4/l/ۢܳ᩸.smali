.class public final synthetic Ll/ۢܳ᩸;
.super Ljava/lang/Object;
.source "8B3M"

# interfaces
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/ۘ֡᩸;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۢܳ᩸;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۢܳ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public write(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۢܳ᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۖܳ᩸;

    .line 6
    iget-object v1, p0, Ll/ۢܳ᩸;->᩶:Ljava/lang/Object;

    .line 8
    check-cast v1, Lnet/sf/sevenzipjbinding/ISequentialOutStream;

    .line 97
    invoke-interface {v0}, Ll/۟֡֫;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 100
    invoke-interface {v1, p1}, Lnet/sf/sevenzipjbinding/ISequentialOutStream;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1

    .line 98
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۙ(III)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۢܳ᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩺ۙᩴ;

    iget-object v1, p0, Ll/ۢܳ᩸;->᩶:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v0, v1, p1, p2, p3}, Ll/᩺ۙᩴ;->ۙ(Ll/᩺ۙᩴ;Ljava/util/ArrayList;III)V

    return-void
.end method
