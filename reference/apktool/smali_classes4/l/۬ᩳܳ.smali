.class public final Ll/۬ᩳܳ;
.super Ljava/lang/Object;
.source "66IZ"


# instance fields
.field public final ֫:Ll/۠ۢᩴ;

.field public ۙ:Ll/ۧۙܺ;

.field public final ۚ:Landroid/widget/TextView;

.field public ۤ:Ljava/lang/String;

.field public ۧ:Ll/۠ᩳܳ;

.field public ۫:Z

.field public ܳ:Z

.field public final ᩴ:Ll/ᩳᩳܳ;

.field public ᩷:Z

.field public final ᩸:Ll/ۖۗܳ;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/۠ۢᩴ;Ll/ۖۗܳ;)V
    .locals 3

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Ll/۬ᩳܳ;->֫:Ll/۠ۢᩴ;

    .line 56
    iput-object p2, p0, Ll/۬ᩳܳ;->᩸:Ll/ۖۗܳ;

    .line 57
    sget-object p2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "aqrp"

    const-string v1, "{AN}_{AV}.apk"

    invoke-interface {p2, v0, v1}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/۬ᩳܳ;->ۤ:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object p2

    const v0, 0x7f0d005c

    invoke-virtual {p2, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p2

    const v0, 0x7f0a0076

    .line 59
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/۬ᩳܳ;->ۚ:Landroid/widget/TextView;

    .line 60
    new-instance v1, Ll/۟ᩳܳ;

    invoke-direct {v1, p0, p1}, Ll/۟ᩳܳ;-><init>(Ll/۬ᩳܳ;Ll/۠ۢᩴ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0077

    .line 66
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 67
    new-instance v1, Ll/ܽܽ᩸;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/ܽܽ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    new-instance v0, Ll/ᩳᩳܳ;

    invoke-direct {v0, p0}, Ll/ᩳᩳܳ;-><init>(Ll/۬ᩳܳ;)V

    iput-object v0, p0, Ll/۬ᩳܳ;->ᩴ:Ll/ᩳᩳܳ;

    .line 77
    invoke-virtual {p1}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    .line 79
    invoke-virtual {p1}, Ll/۠ۢᩴ;->᩸()Ll/۠ۖۧ;

    move-result-object v0

    new-instance v1, Ll/۟֨ܳ;

    invoke-direct {v1, v2, p0, p1}, Ll/۟֨ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 86
    invoke-virtual {p1}, Ll/۠ۢᩴ;->ܳ()Landroid/widget/FrameLayout;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    invoke-virtual {p1}, Ll/۠ۢᩴ;->ܳ()Landroid/widget/FrameLayout;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 88
    invoke-direct {p0}, Ll/۬ᩳܳ;->ۤ()V

    return-void
.end method

.method private ۙ(Ljava/lang/String;)Ll/ۜᩳܳ;
    .locals 11

    .line 107
    invoke-static {p1}, Ll/ܺۙܺ;->ۙ(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/۬ᩳܳ;->ܳ:Z

    if-nez v0, :cond_2

    .line 129
    iget-boolean p1, p0, Ll/۬ᩳܳ;->۫:Z

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    iget-boolean p1, p0, Ll/۬ᩳܳ;->᩷:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 130
    iput-boolean p1, p0, Ll/۬ᩳܳ;->۫:Z

    .line 131
    new-instance p1, Ll/ۢᩳܳ;

    invoke-direct {p1, p0}, Ll/ۢᩳܳ;-><init>(Ll/۬ᩳܳ;)V

    .line 149
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    .line 109
    :cond_1
    :goto_0
    new-instance p1, Ll/ۜᩳܳ;

    invoke-direct {p1, v2, v1}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 111
    :cond_2
    iget-object v0, p0, Ll/۬ᩳܳ;->᩸:Ll/ۖۗܳ;

    iget-object v3, p0, Ll/۬ᩳܳ;->ۙ:Ll/ۧۙܺ;

    .line 163
    invoke-static {p1}, Ll/ܺۙܺ;->ۙ(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez v3, :cond_3

    .line 164
    new-instance p1, Ll/ۜᩳܳ;

    const v0, 0x7f120086

    invoke-direct {p1, v2, v0}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_3
    const-string v4, "{AN}"

    .line 165
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Ll/ۧۙܺ;->ۤ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    :cond_4
    const-string v4, "{AP}"

    .line 166
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Ll/ۧۙܺ;->ܳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    const-string v4, "{AV}"

    .line 167
    invoke-virtual {p1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v3}, Ll/ۧۙܺ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    .line 168
    invoke-virtual {v3}, Ll/ۧۙܺ;->ۧ()Ljava/lang/String;

    move-result-object v4

    const-string v5, "null"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 169
    :cond_6
    new-instance p1, Ll/ۜᩳܳ;

    const v0, 0x7f120085

    invoke-direct {p1, v2, v0}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 172
    :cond_7
    new-instance v4, Ll/ܳ᩸۫;

    invoke-direct {v4}, Ll/ܳ᩸۫;-><init>()V

    .line 173
    iput-object v3, v4, Ll/ܳ᩸۫;->ۙ:Ll/ۧۙܺ;

    const v3, 0x7f120083

    .line 176
    :try_start_0
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v7, ""

    const-string v8, ""

    .line 177
    invoke-interface {v0}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v10

    const/4 v9, 0x0

    move-object v6, p1

    .line 176
    invoke-static/range {v5 .. v10}, Ll/ۚ᩸۫;->ۙ(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Ljava/util/ArrayList;

    move-result-object p1

    .line 177
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫᩸۫;

    invoke-virtual {p1}, Ll/۫᩸۫;->᩷()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, ".."

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    .line 184
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v0, v4, :cond_b

    .line 185
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_a

    const/16 v5, 0x5c

    if-eq v4, v5, :cond_a

    const/16 v5, 0x20

    if-lt v4, v5, :cond_a

    const/16 v5, 0x7f

    if-ne v4, v5, :cond_9

    goto :goto_2

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 188
    :cond_a
    :goto_2
    new-instance p1, Ll/ۜᩳܳ;

    invoke-direct {p1, v2, v3}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 191
    :cond_b
    new-instance v0, Ll/ۜᩳܳ;

    invoke-direct {v0, p1, v1}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object v0

    .line 182
    :cond_c
    :goto_3
    new-instance p1, Ll/ۜᩳܳ;

    invoke-direct {p1, v2, v3}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object p1

    .line 179
    :catch_0
    new-instance p1, Ll/ۜᩳܳ;

    invoke-direct {p1, v2, v3}, Ll/ۜᩳܳ;-><init>(Ljava/lang/String;I)V

    return-object p1
.end method

.method private ۙ()V
    .locals 2

    .line 98
    iget-boolean v0, p0, Ll/۬ᩳܳ;->᩷:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 99
    iput-boolean v0, p0, Ll/۬ᩳܳ;->᩷:Z

    .line 100
    iget-object v0, p0, Ll/۬ᩳܳ;->֫:Ll/۠ۢᩴ;

    invoke-virtual {v0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    iget-object v1, p0, Ll/۬ᩳܳ;->ᩴ:Ll/ᩳᩳܳ;

    invoke-virtual {v0, v1}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    .line 101
    iget-object v0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۠ۢᩴ;->᩷()V

    :cond_1
    const/4 v0, 0x0

    .line 102
    iput-object v0, p0, Ll/۬ᩳܳ;->ۙ:Ll/ۧۙܺ;

    .line 103
    iput-object v0, p0, Ll/۬ᩳܳ;->᩻:Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ll/۠ۢᩴ;Ll/ۖۗܳ;)V
    .locals 2

    .line 48
    invoke-interface {p1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll/ۖۗܳ;->᩺ۙ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "application/vnd.android.package-archive"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-interface {p1}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".apex"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 50
    new-instance v0, Ll/۬ᩳܳ;

    invoke-direct {v0, p0, p1}, Ll/۬ᩳܳ;-><init>(Ll/۠ۢᩴ;Ll/ۖۗܳ;)V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/۬ᩳܳ;)V
    .locals 2

    .line 68
    invoke-direct {p0}, Ll/۬ᩳܳ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 69
    :cond_0
    new-instance v0, Ll/۠ᩳܳ;

    invoke-direct {v0, p0}, Ll/۠ᩳܳ;-><init>(Ll/۬ᩳܳ;)V

    iput-object v0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    const/4 v1, 0x1

    .line 202
    invoke-virtual {v0, v1}, Ll/۠ۢᩴ;->᩷(Z)V

    .line 71
    iget-object v0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    invoke-virtual {v0}, Ll/۠ۢᩴ;->᩸()Ll/۠ۖۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    const v1, 0x7f1207b9

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 72
    iget-object p0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    invoke-virtual {p0}, Ll/۠ᩳܳ;->᩶()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/۬ᩳܳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۬ᩳܳ;->ۤ:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ۙ(Ll/۬ᩳܳ;Ll/۠ۢᩴ;)V
    .locals 2

    .line 61
    invoke-direct {p0}, Ll/۬ᩳܳ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۬ᩳܳ;->᩻:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_1

    .line 62
    :cond_0
    invoke-virtual {p1, v0}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    .line 63
    iget-object v0, p0, Ll/۬ᩳܳ;->᩻:Ljava/lang/String;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_1

    goto :goto_0

    .line 64
    :cond_1
    iget-object p0, p0, Ll/۬ᩳܳ;->᩻:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    const/4 p0, 0x0

    invoke-virtual {p1, p0, v0}, Ll/۠ۢᩴ;->ۙ(II)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic ۙ(Ll/۬ᩳܳ;Ll/۠ۢᩴ;Landroid/content/DialogInterface;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ll/۬ᩳܳ;->ۙ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/۬ᩳܳ;Ll/ۡۧۙ;)V
    .locals 1

    .line 75
    sget-object v0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Ll/۬ᩳܳ;->ۙ()V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/۬ᩳܳ;Ll/ۧۙܺ;)V
    .locals 1

    .line 153
    invoke-direct {p0}, Ll/۬ᩳܳ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 154
    iput-boolean v0, p0, Ll/۬ᩳܳ;->۫:Z

    const/4 v0, 0x1

    .line 155
    iput-boolean v0, p0, Ll/۬ᩳܳ;->ܳ:Z

    .line 156
    iput-object p1, p0, Ll/۬ᩳܳ;->ۙ:Ll/ۧۙܺ;

    .line 157
    invoke-direct {p0}, Ll/۬ᩳܳ;->ۤ()V

    .line 158
    iget-object p0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ll/۠ᩳܳ;->᩶()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۚ(Ll/۬ᩳܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬ᩳܳ;->ۤ()V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/۬ᩳܳ;)Ll/ۖۗܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩳܳ;->᩸:Ll/ۖۗܳ;

    return-object p0
.end method

.method private ۤ()V
    .locals 4

    .line 115
    iget-object v0, p0, Ll/۬ᩳܳ;->ۤ:Ljava/lang/String;

    invoke-direct {p0, v0}, Ll/۬ᩳܳ;->ۙ(Ljava/lang/String;)Ll/ۜᩳܳ;

    move-result-object v0

    .line 116
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/۬ᩳܳ;->᩻:Ljava/lang/String;

    .line 117
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ll/۬ᩳܳ;->֫:Ll/۠ۢᩴ;

    invoke-virtual {v1}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v1

    .line 118
    invoke-static {v0}, Ll/ۜᩳܳ;->ۙ(Ll/ۜᩳܳ;)I

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Ll/ۜᩳܳ;->ۙ(Ll/ۜᩳܳ;)I

    move-result v2

    goto :goto_0

    :cond_1
    const v2, 0x7f120084

    .line 117
    :goto_0
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iget-object v2, p0, Ll/۬ᩳܳ;->ۚ:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v1

    .line 120
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    or-int/lit8 v1, v1, 0x8

    goto :goto_2

    :cond_2
    and-int/lit8 v1, v1, -0x9

    :goto_2
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 122
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    sget v1, Ll/ۗۡ֫;->ۙ:I

    goto :goto_3

    :cond_3
    sget v1, Ll/ۗۡ֫;->ۚۙ:I

    :goto_3
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 123
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 124
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    const/4 v3, 0x1

    :cond_5
    invoke-virtual {v2, v3}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method public static bridge synthetic ۫(Ll/۬ᩳܳ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۬ᩳܳ;->᩷()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/۬ᩳܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/۬ᩳܳ;)Ll/۠ᩳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩳܳ;->ۧ:Ll/۠ᩳܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/۬ᩳܳ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩳܳ;->ۤ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/۬ᩳܳ;Ljava/lang/String;)Ll/ۜᩳܳ;
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/۬ᩳܳ;->ۙ(Ljava/lang/String;)Ll/ۜᩳܳ;

    move-result-object p0

    return-object p0
.end method

.method private ᩷()Z
    .locals 2

    .line 92
    iget-boolean v0, p0, Ll/۬ᩳܳ;->᩷:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/۬ᩳܳ;->֫:Ll/۠ۢᩴ;

    invoke-virtual {v0}, Ll/۠ۢᩴ;->᩸()Ll/۠ۖۧ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 93
    invoke-virtual {v0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ᩸(Ll/۬ᩳܳ;)Ll/۠ۢᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۬ᩳܳ;->֫:Ll/۠ۢᩴ;

    return-object p0
.end method
