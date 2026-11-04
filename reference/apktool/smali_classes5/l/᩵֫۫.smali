.class public final Ll/᩵֫۫;
.super Ll/ۢۗܳ;
.source "B29A"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1207b6

    const v1, 0x7f08024e

    .line 66
    invoke-direct {p0, v0, v1}, Ll/ۢۗܳ;-><init>(II)V

    return-void
.end method

.method public static ۙ(Ll/᩵֫۫;Ll/۫ۛܳ;Ljava/util/ArrayList;)V
    .locals 2

    .line 503
    invoke-static {p2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v0, Ll/ۜᩴ᩺;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۜᩴ᩺;-><init>(I)V

    invoke-interface {p0, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p0

    new-instance v0, Ll/ۧ֫۫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p0, v0}, Ll/᩵ܺۗ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    .line 504
    invoke-static {p2}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object p2

    new-instance v0, Ll/ܿۧۧ;

    invoke-direct {v0, v1}, Ll/ܿۧۧ;-><init>(I)V

    invoke-interface {p2, v0}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object p2

    new-instance v0, Ll/ۜᩴۤ;

    invoke-direct {v0, v1}, Ll/ۜᩴۤ;-><init>(I)V

    invoke-interface {p2, v0}, Ll/᩵ܺۗ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    .line 505
    sget v0, Ll/۬ۜۧ;->ۙ:I

    .line 268
    new-instance v0, Ll/۠ۜۧ;

    const-class v1, Ll/ۗ֫۫;

    invoke-direct {v0, v1}, Ll/۠ۜۧ;-><init>(Ljava/lang/Class;)V

    .line 506
    invoke-virtual {v0, p1}, Ll/۠ۜۧ;->ۤ(Ll/۫ۛܳ;)V

    const-string v1, "oldNames"

    .line 507
    invoke-virtual {v0, v1, p0}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)V

    const-string p0, "newNames"

    .line 508
    invoke-virtual {v0, p0, p2}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)V

    const-string p0, "path"

    .line 509
    invoke-virtual {p1}, Ll/۫ۛܳ;->۫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ll/۠ۜۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    invoke-virtual {v0}, Ll/۠ۜۧ;->ۙ()I

    return-void
.end method


# virtual methods
.method public final ۤ(Ll/۫ۛܳ;)V
    .locals 11

    const-string v0, "local"

    .line 76
    invoke-virtual {p1, v0}, Ll/۫ۛܳ;->ۙ(Ljava/lang/String;)V

    .line 77
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܽ()Ljava/util/List;

    move-result-object v0

    .line 78
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_6

    .line 79
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۗܳ;

    .line 85
    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    .line 87
    invoke-interface {v0}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, ".bak"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 91
    :goto_0
    invoke-interface {v0}, Ll/ۖۗܳ;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    goto :goto_1

    :cond_1
    const/16 v5, 0x2e

    invoke-virtual {v1, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    :goto_1
    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    .line 94
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    goto :goto_3

    :cond_2
    const-string v6, ".rename"

    .line 95
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 97
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_2

    :cond_3
    const-string v6, ".apk.1"

    .line 98
    invoke-virtual {v3, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 100
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    :goto_2
    move v10, v5

    move v5, v2

    move v2, v10

    .line 106
    :cond_4
    :goto_3
    new-instance v3, Ll/ܺ֫۫;

    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v6

    invoke-direct {v3, v6, p1, v1, v0}, Ll/ܺ֫۫;-><init>(Lbin/mt/plus/Main;Ll/۫ۛܳ;Ljava/lang/String;Ll/ۖۗܳ;)V

    const v1, 0x7f1207b6

    .line 143
    invoke-virtual {v3, v1}, Ll/۠ۢᩴ;->ܺ(I)V

    .line 144
    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    const/4 v1, 0x6

    .line 145
    invoke-virtual {v3, v1}, Ll/۠ۢᩴ;->᩸(I)V

    .line 146
    invoke-virtual {v3}, Ll/۠ۢᩴ;->ۙ()V

    .line 147
    invoke-virtual {v3, v2, v5}, Ll/۠ۢᩴ;->ۙ(II)V

    if-eqz v4, :cond_5

    .line 149
    new-instance v1, Ll/۟᩺ۤ;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v3, v2}, Ll/۟᩺ۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/4 p1, 0x0

    const v2, 0x7f120a78

    .line 229
    invoke-virtual {v3, v2, v1, p1}, Ll/۠ۢᩴ;->ۙ(ILandroid/view/View$OnClickListener;Ll/֫֫۫;)V

    goto :goto_4

    .line 323
    :cond_5
    new-instance p1, Ll/ۚ֫۫;

    const/4 v1, 0x0

    invoke-direct {p1, v3, v1}, Ll/ۚ֫۫;-><init>(Ll/۠ۢᩴ;I)V

    new-instance v1, Ll/֫֫۫;

    invoke-direct {v1, v3}, Ll/֫֫۫;-><init>(Ll/۠ۢᩴ;)V

    const v2, 0x104000b

    invoke-virtual {v3, v2, p1, v1}, Ll/۠ۢᩴ;->ۙ(ILandroid/view/View$OnClickListener;Ll/֫֫۫;)V

    .line 185
    :goto_4
    invoke-static {v3, v0}, Ll/۬ᩳܳ;->ۙ(Ll/۠ۢᩴ;Ll/ۖۗܳ;)V

    xor-int/lit8 p1, v4, 0x1

    .line 186
    invoke-virtual {v3, p1}, Ll/۠ۢᩴ;->᩷(Z)V

    .line 187
    invoke-virtual {v3}, Ll/۠ۢᩴ;->᩸()Ll/۠ۖۧ;

    move-result-object p1

    invoke-static {p1}, Ll/ۚۙܺ;->᩷(Ll/۠ۖۧ;)V

    return-void

    .line 81
    :cond_6
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 356
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_7
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 357
    invoke-interface {v3}, Ll/ۖۗܳ;->᩺ۙ()Ljava/lang/String;

    move-result-object v3

    const-string v4, "application/vnd.android.package-archive"

    .line 358
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    if-eqz v2, :cond_8

    const/4 v0, 0x1

    move v5, v2

    const/4 v4, 0x1

    goto :goto_6

    :cond_8
    const/4 v1, 0x1

    goto :goto_5

    :cond_9
    const-string v4, "image/"

    .line 363
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    if-eqz v1, :cond_a

    const/4 v0, 0x1

    move v4, v1

    const/4 v5, 0x1

    goto :goto_6

    :cond_a
    const/4 v2, 0x1

    goto :goto_5

    :cond_b
    move v4, v1

    move v5, v2

    .line 370
    :goto_6
    invoke-virtual {p1}, Ll/۫ۛܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v8

    .line 371
    new-instance v9, Ll/᩹֫۫;

    move-object v0, v9

    move-object v1, p0

    move-object v2, v8

    move-object v3, v7

    move-object v6, p1

    invoke-direct/range {v0 .. v8}, Ll/᩹֫۫;-><init>(Ll/᩵֫۫;Lbin/mt/plus/Main;Ljava/util/ArrayList;ZZLl/۫ۛܳ;Ljava/util/ArrayList;Lbin/mt/plus/Main;)V

    .line 499
    invoke-virtual {v9}, Ll/᩺֨ܳ;->᩻()V

    return-void
.end method

.method public final ᩸(Ll/۫ۛܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 71
    invoke-virtual {p1, v0}, Ll/۫ۛܳ;->᩷(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/۫ۛܳ;->᩹()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
