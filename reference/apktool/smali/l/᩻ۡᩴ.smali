.class public final Ll/᩻ۡᩴ;
.super Ljava/lang/Object;
.source "36IP"


# direct methods
.method public static ۙ(Ll/᩹ۖ᩸;)Ljava/util/function/Consumer;
    .locals 1

    .line 78
    new-instance v0, Ll/ۧۡᩴ;

    invoke-direct {v0, p0}, Ll/ۧۡᩴ;-><init>(Ll/᩹ۖ᩸;)V

    return-object v0
.end method

.method public static ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;ZLjava/util/function/Consumer;)V
    .locals 6

    .line 30
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 31
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 32
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    const/16 v2, 0x7b

    .line 33
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    if-gez v1, :cond_0

    goto :goto_2

    :cond_0
    const/16 v2, 0x7d

    .line 35
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v2

    if-gez v2, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    if-eqz p2, :cond_2

    if-lez v1, :cond_2

    add-int/lit8 v3, v1, -0x1

    .line 38
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_2

    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 40
    new-instance v4, Landroid/text/style/StyleSpan;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v5, 0x21

    invoke-virtual {v0, v4, v1, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 41
    new-instance v4, Ll/۫ۡᩴ;

    invoke-direct {v4, v3, p3}, Ll/۫ۡᩴ;-><init>(Ljava/lang/String;Ljava/util/function/Consumer;)V

    invoke-virtual {v0, v4, v1, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :goto_1
    move v1, v2

    goto :goto_0

    .line 52
    :cond_3
    :goto_2
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    new-instance p1, Ll/ۚۡᩴ;

    invoke-direct {p1}, Landroid/text/method/LinkMovementMethod;-><init>()V

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method
