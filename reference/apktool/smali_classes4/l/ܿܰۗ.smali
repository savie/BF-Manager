.class public final Ll/ܿܰۗ;
.super Ljava/lang/Object;
.source "E5S4"


# direct methods
.method public static ۙ(ILl/֡ܰۗ;)Ljava/lang/String;
    .locals 6

    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    .line 33
    invoke-static {p0, v1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "public "

    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v2, 0x2

    .line 36
    invoke-static {p0, v2}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "private "

    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const/4 v3, 0x4

    .line 39
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "protected "

    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v3, 0x8

    .line 42
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "static "

    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    const/16 v3, 0x10

    .line 45
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "final "

    .line 46
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    const/16 v3, 0x400

    .line 48
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "abstract "

    .line 49
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    const/16 v3, 0x100

    .line 51
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "native "

    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    :cond_6
    sget-object v3, Ll/᩶ܰۗ;->ۙ:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v3, p1

    const/16 v3, 0x80

    const/16 v4, 0x40

    const/16 v5, 0x20

    if-eq p1, v1, :cond_e

    if-eq p1, v2, :cond_c

    const/4 v1, 0x3

    if-eq p1, v1, :cond_7

    goto/16 :goto_0

    :cond_7
    const p1, 0x8000

    .line 77
    invoke-static {p0, p1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "module "

    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    const/16 p1, 0x800

    .line 80
    invoke-static {p0, p1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "strict "

    .line 81
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    :cond_9
    invoke-static {p0, v5}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_a

    const-string p1, "super "

    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    const/16 p1, 0x4000

    .line 86
    invoke-static {p0, p1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_b

    const-string p1, "enum "

    .line 87
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    const/high16 p1, 0x40000

    .line 89
    invoke-static {p0, p1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_11

    const-string p1, "data "

    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 68
    :cond_c
    invoke-static {p0, v4}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_d

    const-string p1, "volatile "

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    :cond_d
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_11

    const-string p1, "transient "

    .line 72
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 56
    :cond_e
    invoke-static {p0, v5}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_f

    const-string p1, "synchronized "

    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    :cond_f
    invoke-static {p0, v4}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_10

    const-string p1, "bridge "

    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    :cond_10
    invoke-static {p0, v3}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p1

    if-eqz p1, :cond_11

    const-string p1, "varargs "

    .line 63
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    :goto_0
    const/16 p1, 0x1000

    .line 94
    invoke-static {p0, p1}, Ll/ܿܰۗ;->ۙ(II)Z

    move-result p0

    if-eqz p0, :cond_12

    const-string p0, "synthetic "

    .line 95
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    :cond_12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
