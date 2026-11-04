.class public final synthetic Ll/ۚܽۤ;
.super Ljava/lang/Object;
.source "Y4GW"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۧۡۙ;
.implements Ll/ܺۛ۫;
.implements Lcom/google/android/material/textfield/TextInputLayout$LengthCounter;
.implements Ll/᩸ۛܽ;


# direct methods
.method public static synthetic ۙ(Ljava/io/RandomAccessFile;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 0
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object p0

    invoke-static {p0}, Ll/ᩴ۬᩹;->convertMaybeLegacyFileChannelFromLibrary(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Landroid/view/WindowManager$LayoutParams;I)V
    .locals 0

    .line 0
    iput p1, p0, Landroid/view/WindowManager$LayoutParams;->layoutInDisplayCutoutMode:I

    return-void
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 1

    .line 0
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    return-object v0
.end method

.method public countLength(Landroid/text/Editable;)I
    .locals 0

    .line 0
    invoke-static {p1}, Lcom/google/android/material/textfield/TextInputLayout;->$r8$lambda$o92w5de0KdW2_dMexjlsVyV6EjQ(Landroid/text/Editable;)I

    move-result p1

    return p1
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 10
    :try_start_0
    invoke-static {}, Ll/ۢ᩵᩵;->ܶ()Ll/ۢ᩵᩵;

    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ll/֡᩵᩵;->ۤ()Ll/ܽ᩵᩵;

    move-result-object v0

    .line 34
    check-cast v0, Ll/۬ܰ᩵;

    invoke-virtual {v0, p1}, Ll/۬ܰ᩵;->᩷(Ljava/lang/String;)[Ll/ܶ᩵᩵;

    move-result-object v0

    .line 35
    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 36
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll/ۤ᩵᩵;->᩷()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object p1
.end method

.method public ۙ()V
    .locals 0

    return-void
.end method
