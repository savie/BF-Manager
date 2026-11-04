.class public final Ll/ᩳۚۤ;
.super Ljava/lang/Object;
.source "UC3T"

# interfaces
.implements Ll/۬֫ܶ;


# direct methods
.method public static ۙ(Ljava/lang/String;Ljava/lang/CharSequence;I)I
    .locals 3

    .line 50
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, p0, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result p0

    return p0

    .line 51
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0

    .line 52
    :cond_1
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v0, v2

    :goto_0
    if-gt p2, v0, :cond_3

    .line 26
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {p1, v1, p2, p0, v2}, Ll/ᩳۚۤ;->ۙ(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    return p2

    :cond_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, -0x1

    return p0
.end method

.method public static ۙ(IILjava/lang/CharSequence;)Ljava/lang/String;
    .locals 3

    .line 13
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-ltz p0, :cond_3

    if-lt p1, p0, :cond_3

    .line 14
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_3

    if-ne p0, p1, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    sub-int/2addr p1, p0

    .line 16
    new-array v0, p1, [C

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    add-int v2, p0, v1

    .line 17
    invoke-interface {p2, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    aput-char v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0

    .line 14
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0
.end method

.method public static ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "<this>"

    .line 5
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    .line 10
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p0, p1, :cond_0

    .line 70
    sget-object v0, Ll/ۜۢ᩵;->ۙ:Ll/ۤ֨᩵;

    invoke-virtual {v0, p0, p1}, Ll/ۙ֨᩵;->ۙ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/۫᩺ۙ;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 87
    :try_start_0
    invoke-interface {p0}, Ll/۫᩺ۙ;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static ۙ(I)Z
    .locals 1

    const/16 v0, 0x400

    if-lt p0, v0, :cond_0

    const v0, 0xffff

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(I[B)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 25
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 26
    aget-byte p1, p1, v2

    and-int/2addr p1, v0

    const/16 v3, 0xfe

    if-ne p0, v3, :cond_0

    if-ne p1, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public static ۙ(Landroid/os/Bundle;Landroid/os/Bundle;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    const-string v2, "android.media.browse.extra.PAGE_SIZE"

    const-string v3, "android.media.browse.extra.PAGE"

    const/4 v4, -0x1

    if-nez p0, :cond_2

    .line 34
    invoke-virtual {p1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v4, :cond_1

    .line 35
    invoke-virtual {p1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v4, :cond_1

    return v0

    :cond_1
    return v1

    :cond_2
    if-nez p1, :cond_4

    .line 37
    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p1, v4, :cond_3

    .line 38
    invoke-virtual {p0, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v4, :cond_3

    return v0

    :cond_3
    return v1

    .line 40
    :cond_4
    invoke-virtual {p0, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v5

    .line 41
    invoke-virtual {p1, v3, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-ne v5, v3, :cond_5

    .line 42
    invoke-virtual {p0, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    .line 43
    invoke-virtual {p1, v2, v4}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    if-ne p0, p1, :cond_5

    return v0

    :cond_5
    return v1
.end method

.method public static ۙ(Landroid/view/MotionEvent;I)Z
    .locals 0

    .line 556
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getSource()I

    move-result p0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۙ(Ljava/lang/CharSequence;ZILjava/lang/String;I)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p2, :cond_5

    .line 36
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p2, v1, :cond_5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, p4

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p4, :cond_4

    add-int v2, p2, v1

    .line 38
    invoke-interface {p0, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    goto :goto_2

    .line 41
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    .line 42
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    if-eq v2, v3, :cond_3

    .line 43
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    if-eq v2, v3, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    .line 37
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_d

    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x40

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    const-wide/16 v6, 0x1

    shl-long v3, v6, v3

    const-wide v6, 0xffffd9ffL

    and-long/2addr v3, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-eqz v8, :cond_b

    return v5

    :cond_1
    const/16 v4, 0x80

    if-ge v3, v4, :cond_2

    const/16 v4, 0x7f

    if-ne v3, v4, :cond_b

    return v5

    :cond_2
    const/16 v4, 0x200b

    if-lt v3, v4, :cond_5

    const/16 v4, 0x206f

    if-gt v3, v4, :cond_5

    const/16 v4, 0x200f

    if-le v3, v4, :cond_4

    const/16 v4, 0x2028

    if-lt v3, v4, :cond_3

    const/16 v4, 0x202f

    if-le v3, v4, :cond_4

    :cond_3
    const/16 v4, 0x2060

    if-lt v3, v4, :cond_b

    :cond_4
    return v5

    :cond_5
    const v4, 0xd800

    if-lt v3, v4, :cond_9

    const v4, 0xdfff

    if-gt v3, v4, :cond_9

    const v6, 0xdbff

    if-gt v3, v6, :cond_8

    add-int/lit8 v2, v2, 0x1

    if-lt v2, v1, :cond_6

    return v5

    .line 65
    :cond_6
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const v7, 0xdc00

    if-lt v6, v7, :cond_8

    if-le v6, v4, :cond_7

    goto :goto_1

    .line 70
    :cond_7
    invoke-static {v3, v6}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v3

    const/high16 v4, 0xf0000

    if-lt v3, v4, :cond_b

    :cond_8
    :goto_1
    return v5

    :cond_9
    const v4, 0xe000

    if-lt v3, v4, :cond_a

    const v4, 0xf8ff

    if-gt v3, v4, :cond_a

    return v5

    :cond_a
    const v4, 0xfffd

    if-eq v3, v4, :cond_c

    const v4, 0xfeff

    if-ne v3, v4, :cond_b

    goto :goto_2

    :cond_b
    add-int/2addr v2, v5

    goto :goto_0

    :cond_c
    :goto_2
    return v5

    :cond_d
    :goto_3
    return v0
.end method

.method public static ۤ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v0, p0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۤ(I[B)Z
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 51
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 52
    aget-byte v3, p1, v2

    and-int/2addr v3, v0

    const/4 v4, 0x2

    .line 53
    aget-byte v4, p1, v4

    and-int/2addr v4, v0

    const/4 v5, 0x3

    .line 54
    aget-byte p1, p1, v5

    and-int/2addr p1, v0

    if-nez p0, :cond_0

    if-nez v3, :cond_0

    const/16 p0, 0xfe

    if-ne v4, p0, :cond_0

    if-ne p1, v0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public static ᩴ(I[B)Z
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 11
    aget-byte p0, p1, v1

    and-int/lit16 p0, p0, 0xff

    const/4 v0, 0x1

    .line 12
    aget-byte v2, p1, v0

    and-int/lit16 v2, v2, 0xff

    const/4 v3, 0x2

    .line 13
    aget-byte p1, p1, v3

    and-int/lit16 p1, p1, 0xff

    const/16 v3, 0xef

    if-ne p0, v3, :cond_0

    const/16 p0, 0xbb

    if-ne v2, p0, :cond_0

    const/16 p0, 0xbf

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public static ᩷(I)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const/4 p0, -0x1

    return p0

    :pswitch_1
    const/16 p0, 0x23

    return p0

    :pswitch_2
    const/16 p0, 0x22

    return p0

    :pswitch_3
    const/16 p0, 0x1d

    return p0

    :pswitch_4
    const/16 p0, 0x1b

    return p0

    :pswitch_5
    const/16 p0, 0x19

    return p0

    :pswitch_6
    const/16 p0, 0x17

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x23
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ᩷(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    .line 21
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    .line 25
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    .line 26
    invoke-static {p0}, Ll/ᩳۚۤ;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_2
    return-object v1
.end method

.method public static ᩷(I[B)Z
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 38
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 39
    aget-byte p1, p1, v2

    and-int/2addr p1, v0

    if-ne p0, v0, :cond_0

    const/16 p0, 0xfe

    if-ne p1, p0, :cond_0

    return v2

    :cond_0
    return v1
.end method

.method public static ᩸(I[B)Z
    .locals 6

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-lt p0, v0, :cond_0

    .line 66
    aget-byte p0, p1, v1

    const/16 v0, 0xff

    and-int/2addr p0, v0

    const/4 v2, 0x1

    .line 67
    aget-byte v3, p1, v2

    and-int/2addr v3, v0

    const/4 v4, 0x2

    .line 68
    aget-byte v4, p1, v4

    and-int/2addr v4, v0

    const/4 v5, 0x3

    .line 69
    aget-byte p1, p1, v5

    and-int/2addr p1, v0

    if-ne p0, v0, :cond_0

    const/16 p0, 0xfe

    if-ne v3, p0, :cond_0

    if-nez v4, :cond_0

    if-nez p1, :cond_0

    return v2

    :cond_0
    return v1
.end method
