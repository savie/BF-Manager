.class public final Ll/ۧ֫ܺ;
.super Ljava/lang/Object;
.source "XALX"


# static fields
.field public static ۙ:Ll/۫֨ܶ;


# direct methods
.method public static final ۙ(Ll/ܿۗ;Ljava/lang/Object;I)I
    .locals 4

    .line 252
    invoke-virtual {p0}, Ll/ܿۗ;->᩸()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    .line 246
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/ܿۗ;->ۤ()[I

    move-result-object v1

    invoke-virtual {p0}, Ll/ܿۗ;->᩸()I

    move-result v2

    invoke-static {v2, p2, v1}, Ll/ۜۗ;->ۙ(II[I)I

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez v1, :cond_1

    goto :goto_0

    .line 266
    :cond_1
    invoke-virtual {p0}, Ll/ܿۗ;->᩷()[Ljava/lang/Object;

    move-result-object v2

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_0
    return v1

    :cond_2
    add-int/lit8 v2, v1, 0x1

    :goto_1
    if-ge v2, v0, :cond_4

    .line 272
    invoke-virtual {p0}, Ll/ܿۗ;->ۤ()[I

    move-result-object v3

    aget v3, v3, v2

    if-ne v3, p2, :cond_4

    .line 273
    invoke-virtual {p0}, Ll/ܿۗ;->᩷()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {p1, v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_5

    .line 281
    invoke-virtual {p0}, Ll/ܿۗ;->ۤ()[I

    move-result-object v0

    aget v0, v0, v1

    if-ne v0, p2, :cond_5

    .line 282
    invoke-virtual {p0}, Ll/ܿۗ;->᩷()[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, v1

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    return v1

    :cond_5
    not-int p0, v2

    return p0

    .line 248
    :catch_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p0
.end method

.method public static ۙ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const p0, 0x7f120a7e

    .line 47
    invoke-static {p0}, Ll/᩶᩷ۧ;->᩷(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 49
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 52
    :cond_1
    invoke-static {p0}, Ll/֨ۖܳ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 54
    invoke-static {p0}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "/"

    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 34
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p1

    .line 39
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 0
    invoke-static {p0, p1}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/16 v0, 0x2f

    invoke-static {v0, p0, p1}, Ll/۟ܺ᩹;->ۙ(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ()Ll/۫֨ܶ;
    .locals 5

    .line 80
    sget-object v0, Ll/ۧ֫ܺ;->ۙ:Ll/۫֨ܶ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "com.portaudio.PortAudio"

    .line 82
    invoke-static {v0, v1}, Ll/ᩳۡܶ;->ۙ(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v0, "com.jsyn.devices.jportaudio.JPortAudioDevice"

    const/4 v2, 0x1

    .line 52
    invoke-static {v0, v2}, Ll/ᩳۡܶ;->ۙ(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫֨ܶ;

    sput-object v0, Ll/ۧ֫ܺ;->ۙ:Ll/۫֨ܶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 88
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Could not load JPortAudio device. "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 65
    :cond_0
    :goto_0
    sget-object v0, Ll/ۧ֫ܺ;->ۙ:Ll/۫֨ܶ;

    if-nez v0, :cond_1

    :try_start_1
    const-string v0, "com.jsyn.devices.javasound.JavaSoundAudioDevice"

    .line 68
    invoke-static {v0, v1}, Ll/ᩳۡܶ;->ۙ(Ljava/lang/String;Z)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫֨ܶ;

    sput-object v0, Ll/ۧ֫ܺ;->ۙ:Ll/۫֨ܶ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    .line 74
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not load JavaSound device. "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 61
    :cond_1
    :goto_1
    sget-object v0, Ll/ۧ֫ܺ;->ۙ:Ll/۫֨ܶ;

    return-object v0
.end method

.method public static ۙ(I)V
    .locals 0

    if-ltz p0, :cond_0

    return-void

    .line 224
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static ۙ(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    .line 153
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ۙ(Ljava/lang/StringBuilder;I)V
    .locals 3

    if-ltz p1, :cond_1

    const/16 v0, 0x3e8

    if-lt p1, v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    div-int/lit8 v0, p1, 0x64

    rem-int/lit8 v0, v0, 0xa

    .line 43
    div-int/lit8 v1, p1, 0xa

    rem-int/lit8 v1, v1, 0xa

    .line 44
    rem-int/lit8 p1, p1, 0xa

    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void

    .line 39
    :cond_1
    :goto_0
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "%03d"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static final ۙ(Ll/ܿۗ;I)V
    .locals 1

    .line 298
    new-array v0, p1, [I

    invoke-virtual {p0, v0}, Ll/ܿۗ;->ۙ([I)V

    .line 299
    new-array p1, p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ll/ܿۗ;->ۙ([Ljava/lang/Object;)V

    return-void
.end method

.method public static ۤ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 16
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const-string v2, "/"

    const/4 v3, 0x1

    if-le v0, v3, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 0
    invoke-static {v3, v1, p0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v4, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2f

    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    return-object v4

    :cond_2
    add-int/2addr v0, v3

    .line 28
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    return-object v4
.end method

.method public static ᩷(I)Ljava/lang/String;
    .locals 10

    ushr-int/lit8 v0, p0, 0x1c

    and-int/lit8 v0, v0, 0xf

    const-string v1, "0123456789abcdef"

    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    ushr-int/lit8 v2, p0, 0x18

    and-int/lit8 v2, v2, 0xf

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    ushr-int/lit8 v3, p0, 0x14

    and-int/lit8 v3, v3, 0xf

    .line 28
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    ushr-int/lit8 v4, p0, 0x10

    and-int/lit8 v4, v4, 0xf

    .line 29
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    ushr-int/lit8 v5, p0, 0xc

    and-int/lit8 v5, v5, 0xf

    .line 30
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    ushr-int/lit8 v6, p0, 0x8

    and-int/lit8 v6, v6, 0xf

    .line 31
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    ushr-int/lit8 v7, p0, 0x4

    and-int/lit8 v7, v7, 0xf

    .line 32
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    and-int/lit8 p0, p0, 0xf

    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v1, 0xa

    new-array v1, v1, [C

    const/16 v8, 0x30

    const/4 v9, 0x0

    aput-char v8, v1, v9

    const/16 v8, 0x78

    const/4 v9, 0x1

    aput-char v8, v1, v9

    const/4 v8, 0x2

    aput-char v0, v1, v8

    const/4 v0, 0x3

    aput-char v2, v1, v0

    const/4 v0, 0x4

    aput-char v3, v1, v0

    const/4 v0, 0x5

    aput-char v4, v1, v0

    const/4 v0, 0x6

    aput-char v5, v1, v0

    const/4 v0, 0x7

    aput-char v6, v1, v0

    const/16 v0, 0x8

    aput-char v7, v1, v0

    const/16 v0, 0x9

    aput-char p0, v1, v0

    .line 34
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 60
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "/"

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 0
    invoke-static {v2, v0, p0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 63
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x2f

    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    return-object p0

    :cond_2
    add-int/2addr v0, v2

    .line 70
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_0
    const-string p0, ""

    return-object p0
.end method
