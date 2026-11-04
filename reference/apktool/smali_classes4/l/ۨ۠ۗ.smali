.class public final synthetic Ll/ۨ۠ۗ;
.super Ljava/lang/Object;
.source "A6I5"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۚۙܽ;
.implements Ll/ᩳܺܺ;
.implements Ll/ۨ᩻ܺ;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۨ۠ۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۤᩳۙ;)V
    .locals 0

    const/4 p1, 0x2

    .line 0
    iput p1, p0, Ll/ۨ۠ۗ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۙ(Ljava/io/FileOutputStream;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ۬᩹;->convertMaybeLegacyFileChannelFromLibrary(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 2
    iget v0, p0, Ll/ۨ۠ۗ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ܶܶ᩷;

    .line 45
    iget-wide v0, p1, Ll/ܶܶ᩷;->᩸:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast p1, Ll/ۡۙ᩷;

    .line 178
    invoke-interface {p1}, Ll/ۡۙ᩷;->۫()Ll/ۗۤ᩷;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗۤ᩷;->ۙ()Ll/֫۫ܽ;

    move-result-object p1

    return-object p1

    .line 45
    :cond_0
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 871
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ljava/io/InputStream;)Ljava/io/InputStream;
    .locals 1

    .line 0
    new-instance v0, Lnet/sf/sevenzipjbinding/NativeXZInputStream;

    invoke-direct {v0, p1}, Lnet/sf/sevenzipjbinding/NativeXZInputStream;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public ۙ([B)Z
    .locals 2

    .line 224
    array-length v0, p1

    const/16 v1, 0xe

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/String;

    sget-object v1, Ll/᩶ۖ᩵;->ۙ:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const-string p1, "resources.arsc"

    .line 169
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
