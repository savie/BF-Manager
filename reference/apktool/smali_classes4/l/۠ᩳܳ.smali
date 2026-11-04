.class public final Ll/۠ᩳܳ;
.super Ll/۠ۢᩴ;
.source "66IZ"


# instance fields
.field public final synthetic ۜ:Ll/۬ᩳܳ;


# direct methods
.method public constructor <init>(Ll/۬ᩳܳ;)V
    .locals 5

    .line 198
    iput-object p1, p0, Ll/۠ᩳܳ;->ۜ:Ll/۬ᩳܳ;

    .line 199
    invoke-static {p1}, Ll/۬ᩳܳ;->᩸(Ll/۬ᩳܳ;)Ll/۠ۢᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v0

    const/4 v1, -0x1

    .line 39
    invoke-direct {p0, v0, v1}, Ll/۠ۢᩴ;-><init>(Ll/ܽ֡֫;I)V

    const v0, 0x7f120082

    .line 200
    invoke-virtual {p0, v0}, Ll/۠ۢᩴ;->ܺ(I)V

    .line 201
    invoke-static {p1}, Ll/۬ᩳܳ;->᩷(Ll/۬ᩳܳ;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    .line 202
    sget p1, Ll/ۗۡ֫;->ۙ:I

    invoke-virtual {p0, p1}, Ll/۠ۢᩴ;->ۤ(I)V

    .line 203
    new-instance p1, Ll/֨ᩳܳ;

    invoke-direct {p1, p0}, Ll/֨ᩳܳ;-><init>(Ll/۠ᩳܳ;)V

    const/4 v0, 0x0

    const v1, 0x7f120087

    .line 229
    invoke-virtual {p0, v1, p1, v0}, Ll/۠ۢᩴ;->ۙ(ILandroid/view/View$OnClickListener;Ll/֫֫۫;)V

    .line 207
    invoke-virtual {p0}, Ll/۠ۢᩴ;->۫()Landroid/widget/TextView;

    move-result-object p1

    .line 238
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v0

    const v1, 0x7f120a4a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n{N}"

    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 240
    new-instance v2, Landroid/text/SpannableStringBuilder;

    const/4 v3, 0x0

    if-ltz v1, :cond_0

    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-direct {v2, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    const-string v0, "\n"

    .line 241
    invoke-virtual {v2, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v1

    const v4, 0x7f120a4b

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 208
    new-instance v0, Ll/ۡᩳܳ;

    invoke-direct {v0, p0}, Ll/ۡᩳܳ;-><init>(Ll/۠ᩳܳ;)V

    const/4 v1, 0x1

    invoke-static {p1, v2, v1, v0}, Ll/᩻ۡᩴ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;ZLjava/util/function/Consumer;)V

    const/high16 v0, 0x41600000    # 14.0f

    .line 215
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v0, 0x0

    const v1, 0x3f8ccccd    # 1.1f

    .line 216
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 217
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, 0x40c00000    # 6.0f

    .line 218
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    invoke-virtual {p1, v3, v0, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 219
    new-instance p1, Ll/ۖᩳܳ;

    invoke-direct {p1, p0}, Ll/ۖᩳܳ;-><init>(Ll/۠ᩳܳ;)V

    invoke-virtual {p0, p1}, Ll/۠ۢᩴ;->ۙ(Landroid/text/TextWatcher;)V

    .line 226
    invoke-direct {p0}, Ll/۠ᩳܳ;->ܿ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/۠ᩳܳ;)V
    .locals 1

    const-string v0, "{AN}_{AV}.apk"

    .line 204
    invoke-virtual {p0, v0}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    .line 205
    invoke-direct {p0}, Ll/۠ᩳܳ;->ܿ()V

    return-void
.end method

.method private ܿ()V
    .locals 3

    .line 231
    invoke-virtual {p0}, Ll/۠ۢᩴ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 232
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    .line 233
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ".apk"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, -0x4

    :cond_0
    const/4 v0, 0x0

    .line 234
    invoke-virtual {p0, v0, v1}, Ll/۠ۢᩴ;->ۙ(II)V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 269
    iget-object p1, p0, Ll/۠ᩳܳ;->ۜ:Ll/۬ᩳܳ;

    invoke-static {p1}, Ll/۬ᩳܳ;->ᩴ(Ll/۬ᩳܳ;)Ll/۠ᩳܳ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-static {p1}, Ll/۬ᩳܳ;->ܳ(Ll/۬ᩳܳ;)V

    :cond_0
    return-void
.end method

.method public final ܶ()V
    .locals 4

    .line 255
    iget-object v0, p0, Ll/۠ᩳܳ;->ۜ:Ll/۬ᩳܳ;

    invoke-static {v0}, Ll/۬ᩳܳ;->۫(Ll/۬ᩳܳ;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 256
    :cond_0
    invoke-virtual {p0}, Ll/۠ۢᩴ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۬ᩳܳ;->᩷(Ll/۬ᩳܳ;Ljava/lang/String;)Ll/ۜᩳܳ;

    move-result-object v1

    .line 257
    invoke-static {v1}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 258
    invoke-virtual {p0}, Ll/۠ᩳܳ;->᩶()V

    return-void

    .line 261
    :cond_1
    invoke-virtual {p0}, Ll/۠ۢᩴ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۬ᩳܳ;->ۙ(Ll/۬ᩳܳ;Ljava/lang/String;)V

    .line 262
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    const-string v2, "aqrp"

    invoke-static {v0}, Ll/۬ᩳܳ;->᩷(Ll/۬ᩳܳ;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v1

    invoke-interface {v1}, Ll/ᩳ֫ܺ;->apply()V

    .line 263
    invoke-static {v0}, Ll/۬ᩳܳ;->ۚ(Ll/۬ᩳܳ;)V

    .line 264
    invoke-virtual {p0}, Ll/۠ۢᩴ;->᩷()V

    return-void
.end method

.method public final ᩶()V
    .locals 4

    .line 246
    iget-object v0, p0, Ll/۠ᩳܳ;->ۜ:Ll/۬ᩳܳ;

    invoke-static {v0}, Ll/۬ᩳܳ;->۫(Ll/۬ᩳܳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Ll/۠ۢᩴ;->᩸()Ll/۠ۖۧ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_3

    .line 247
    :cond_0
    invoke-virtual {p0}, Ll/۠ۢᩴ;->֫()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/۬ᩳܳ;->᩷(Ll/۬ᩳܳ;Ljava/lang/String;)Ll/ۜᩳܳ;

    move-result-object v0

    .line 248
    invoke-static {v0}, Ll/ۜᩳܳ;->ۙ(Ll/ۜᩳܳ;)I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v1

    invoke-static {v0}, Ll/ۜᩳܳ;->ۙ(Ll/ۜᩳܳ;)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p0, v1}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/String;)V

    .line 249
    invoke-static {v0}, Ll/ۜᩳܳ;->ۙ(Ll/ۜᩳܳ;)I

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    .line 250
    :cond_3
    invoke-virtual {p0}, Ll/۠ۢᩴ;->ۤ()Ll/ܽ֡֫;

    move-result-object v1

    const v2, 0x7f120084

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 249
    :goto_1
    invoke-virtual {p0, v2}, Ll/۠ۢᩴ;->᩷(Ljava/lang/String;)V

    .line 251
    invoke-virtual {p0}, Ll/۠ۢᩴ;->᩸()Ll/۠ۖۧ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v1

    invoke-static {v0}, Ll/ۜᩳܳ;->᩷(Ll/ۜᩳܳ;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    :cond_5
    :goto_3
    return-void
.end method
