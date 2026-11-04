.class public final synthetic Ll/֡᩹᩸;
.super Ljava/lang/Object;
.source "J6S5"

# interfaces
.implements Ll/֫ܶ᩵;
.implements Ll/ۚۘܳ;
.implements Ll/۬᩵ܳ;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Ll/֫۫ۧ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/֡᩹᩸;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic cancel()V
    .locals 0

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֡᩹᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۛۗܳ;

    .line 473
    :try_start_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    .line 474
    invoke-interface {v0, p1}, Ll/ۛۗܳ;->ۙ(Ljava/nio/ByteBuffer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    .line 477
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۙ(I)Ll/ۜ᩵ܳ;
    .locals 2

    .line 2
    iget-object v0, p0, Ll/֡᩹᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/֡ۗ۫;

    .line 267
    new-instance v1, Ll/ۛ᩺۫;

    invoke-direct {v1, p1, v0}, Ll/ۛ᩺۫;-><init>(ILl/֡ۗ۫;)V

    return-object v1
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/֡᩹᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 111
    invoke-static {v0, p1}, Ll/֫ۘܳ;->ۤ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V

    return-void
.end method

.method public ᩷()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/֡᩹᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/֡ۘۧ;

    invoke-static {v0}, Ll/֡ۘۧ;->᩷(Ll/֡ۘۧ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 0
    iget-object p2, p0, Ll/֡᩹᩸;->ܰ:Ljava/lang/Object;

    check-cast p2, Ll/۠᩹᩸;

    check-cast p1, Ljava/lang/Void;

    invoke-static {p2}, Ll/۠᩹᩸;->ۙ(Ll/۠᩹᩸;)V

    return-void
.end method
