.class public final Ll/᩻֨ۚ;
.super Ll/ۨܽ֫;
.source "2ISH"


# static fields
.field public static final ۫:Ll/᩻֨ۚ;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    .line 12
    new-instance v6, Ll/᩻֨ۚ;

    const-string v4, "ffmpeg"

    const-string v5, "/assets/ffmpeg"

    const-string v1, "FFmpeg"

    const-string v2, "ffmpegJNI"

    const-string v3, "libffmpegJNI.so"

    move-object v0, v6

    .line 15
    invoke-direct/range {v0 .. v5}, Ll/ۨܽ֫;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    sput-object v6, Ll/᩻֨ۚ;->۫:Ll/᩻֨ۚ;

    return-void
.end method

.method public static ᩸()V
    .locals 3

    .line 22
    :try_start_0
    sget-object v0, Ll/᩻֨ۚ;->۫:Ll/᩻֨ۚ;

    invoke-virtual {v0}, Ll/ۨܽ֫;->ۙ()V
    :try_end_0
    .catch Ll/ۧ֨ۚ; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 25
    new-instance v1, Ljava/lang/UnsatisfiedLinkError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/UnsatisfiedLinkError;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 27
    throw v1
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    .locals 1

    .line 52
    new-instance v0, Ll/ۧ֨ۚ;

    .line 58
    invoke-direct {v0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 33
    invoke-static {}, Lbin/mt/plus/Features;->getABI()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/᩵ܽ֫;
    .locals 3

    const-string v0, "arm64-v8a"

    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 40
    :cond_0
    new-instance p1, Ll/᩵ܽ֫;

    const-wide/32 v0, 0x12d8f8

    const-string v2, "8a4a5a08835f6155ff8edc25ad560958ea0d1056052cd966a9c763ba09fcdfb8"

    invoke-direct {p1, v0, v1, v2}, Ll/᩵ܽ֫;-><init>(JLjava/lang/String;)V

    return-object p1
.end method
