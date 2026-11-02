.class public final Ll/֫֡;
.super Ljava/lang/Object;
.source "374"


# static fields
.field public static ۡ᩹ۗ:I


# direct methods
.method static native constructor <clinit>()V
.end method

.method public static ֫֫֫([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ֫ۜ۠(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۖ۠᩻(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static ۖܶۤ()Z
    .locals 1

    invoke-static {}, Ll/֫۠᩺;->ܶ()Z

    move-result v0

    return v0
.end method

.method public static ۖܺۧ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ܳܺ᩺;

    invoke-virtual {p0}, Ll/ܳܺ᩺;->ۚ()V

    return-void
.end method

.method public static ۙ(Ll/ۢ֡;)Landroid/app/Person;
    .locals 3

    .line 425
    new-instance v0, Landroid/app/Person$Builder;

    invoke-direct {v0}, Landroid/app/Person$Builder;-><init>()V

    .line 161
    iget-object v1, p0, Ll/ۢ֡;->ۚ:Ljava/lang/CharSequence;

    .line 426
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 167
    iget-object v1, p0, Ll/ۢ֡;->ۙ:Ll/ܽܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 517
    invoke-virtual {v1, v2}, Ll/ܽܿ;->ܰ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object v2

    .line 427
    :cond_0
    invoke-virtual {v0, v2}, Landroid/app/Person$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 185
    iget-object v1, p0, Ll/ۢ֡;->᩹:Ljava/lang/String;

    .line 428
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setUri(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 194
    iget-object v1, p0, Ll/ۢ֡;->ۖ:Ljava/lang/String;

    .line 429
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setKey(Ljava/lang/String;)Landroid/app/Person$Builder;

    move-result-object v0

    .line 202
    iget-boolean v1, p0, Ll/ۢ֡;->ܰ:Z

    .line 430
    invoke-virtual {v0, v1}, Landroid/app/Person$Builder;->setBot(Z)Landroid/app/Person$Builder;

    move-result-object v0

    .line 210
    iget-boolean p0, p0, Ll/ۢ֡;->ۨ:Z

    .line 431
    invoke-virtual {v0, p0}, Landroid/app/Person$Builder;->setImportant(Z)Landroid/app/Person$Builder;

    move-result-object p0

    .line 432
    invoke-virtual {p0}, Landroid/app/Person$Builder;->build()Landroid/app/Person;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Landroid/app/Person;)Ll/ۢ֡;
    .locals 6

    .line 410
    invoke-virtual {p0}, Landroid/app/Person;->getName()Ljava/lang/CharSequence;

    move-result-object v0

    .line 412
    invoke-virtual {p0}, Landroid/app/Person;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 413
    invoke-virtual {p0}, Landroid/app/Person;->getIcon()Landroid/graphics/drawable/Icon;

    move-result-object v1

    invoke-static {v1}, Ll/ܽܿ;->ۙ(Landroid/graphics/drawable/Icon;)Ll/ܽܿ;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 415
    :goto_0
    invoke-virtual {p0}, Landroid/app/Person;->getUri()Ljava/lang/String;

    move-result-object v2

    .line 416
    invoke-virtual {p0}, Landroid/app/Person;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 417
    invoke-virtual {p0}, Landroid/app/Person;->isBot()Z

    move-result v4

    .line 418
    invoke-virtual {p0}, Landroid/app/Person;->isImportant()Z

    move-result p0

    .line 368
    new-instance v5, Ll/ۢ֡;

    .line 100
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object v0, v5, Ll/ۢ֡;->ۚ:Ljava/lang/CharSequence;

    .line 102
    iput-object v1, v5, Ll/ۢ֡;->ۙ:Ll/ܽܿ;

    .line 103
    iput-object v2, v5, Ll/ۢ֡;->᩹:Ljava/lang/String;

    .line 104
    iput-object v3, v5, Ll/ۢ֡;->ۖ:Ljava/lang/String;

    .line 105
    iput-boolean v4, v5, Ll/ۢ֡;->ܰ:Z

    .line 106
    iput-boolean p0, v5, Ll/ۢ֡;->ۨ:Z

    return-object v5
.end method

.method public static ۛ᩻۠(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    check-cast p0, Ll/ܶۙۡ;

    invoke-interface {p0}, Ll/ܶۙۡ;->ܰ()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ᩹ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ܺܿۜ(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ۚ۟ۜ;

    invoke-virtual {p0}, Ll/ۚ۟ۜ;->ۖ()Z

    move-result p0

    return p0
.end method

.method public static ܽۖܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static ᩳۘ۫(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ll/ܶۗ֨;->ۖ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ᩵֨ۖ(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ۨۜ᩹;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Ll/ۨۜ᩹;->ܰ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ᩵ܿۛ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ᩶ۙ۬(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/ۤ۟ۜ;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Ll/ۤ۟ۜ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ᩸۠۠(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public static ᩹ۡ۟(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result p0

    return p0
.end method

.method public static ᩻᩸ۘ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result p0

    return p0
.end method
