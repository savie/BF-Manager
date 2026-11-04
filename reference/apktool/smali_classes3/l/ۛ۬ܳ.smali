.class public final synthetic Ll/ۛ۬ܳ;
.super Ljava/lang/Object;
.source "L73L"

# interfaces
.implements Ll/ᩴۨۙ;
.implements Ll/ۤ֨ܳ;
.implements Ll/ۢ᩵ۨ;


# direct methods
.method public static ۙ(IIII)I
    .locals 0

    sub-int/2addr p0, p1

    .line 1
    div-int/2addr p0, p2

    add-int/2addr p0, p3

    return p0
.end method

.method public static bridge synthetic ۙ(Ljava/lang/Object;)Landroid/content/pm/ShortcutManager;
    .locals 0

    .line 0
    check-cast p0, Landroid/content/pm/ShortcutManager;

    return-object p0
.end method

.method public static ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 1
    invoke-interface {p0, p1, p2}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method

.method public static ۙ(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 73
    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 74
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt p0, v2, :cond_0

    return v0

    .line 77
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    .line 78
    invoke-virtual {p2, v1}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    if-ne v2, v3, :cond_1

    goto :goto_1

    .line 112
    :cond_1
    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v4

    .line 113
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(I)I

    move-result v5

    if-eq v4, v5, :cond_3

    .line 115
    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v4

    invoke-static {v5}, Ljava/lang/Character;->toLowerCase(I)I

    move-result v5

    if-ne v4, v5, :cond_2

    goto :goto_1

    :cond_2
    return v0

    .line 82
    :cond_3
    :goto_1
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr p0, v2

    .line 83
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public accept(Landroid/widget/TextView;)V
    .locals 1

    const-string v0, "0"

    .line 203
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/io/Closeable;

    if-eqz p1, :cond_0

    .line 722
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    :cond_0
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ll/ᩴᩳۙ;

    .line 841
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
