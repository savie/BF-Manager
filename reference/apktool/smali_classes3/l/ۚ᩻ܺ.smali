.class public final synthetic Ll/ۚ᩻ܺ;
.super Ljava/lang/Object;
.source "4BMC"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۚۘܳ;
.implements Lnet/sf/sevenzipjbinding/ISequentialOutStream;
.implements Lcom/umeng/commonsdk/listener/OnGetOaidListener;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚ᩻ܺ;->ܰ:I

    iput-object p2, p0, Ll/ۚ᩻ܺ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;Ljava/lang/Object;J)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/ۚ᩻ܺ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۚ᩻ܺ;->᩶:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 2
    iget v0, p0, Ll/ۚ᩻ܺ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ᩴᩳۙ;

    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۚ᩻ܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ᩳۗۙ;

    check-cast p1, Ll/ۤۗۙ;

    .line 3103
    invoke-interface {p1, v0}, Ll/ۤۗۙ;->ۙ(Ll/ᩳۗۙ;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onGetOaid(Ljava/lang/String;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۚ᩻ܺ;->᩶:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۚ᩻ܺ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۧۧۨ;

    .line 388
    :try_start_0
    invoke-interface {v0, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 390
    new-instance v0, Lnet/sf/sevenzipjbinding/SevenZipException;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public ۙ(Ll/᩷ۨᩴ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ۚ᩻ܺ;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠ۨܳ;

    .line 105
    new-instance v1, Ll/ܰۖᩴ;

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ll/ܰۖᩴ;-><init>(Ll/۠ۨܳ;Ljava/lang/String;)V

    return-void
.end method
