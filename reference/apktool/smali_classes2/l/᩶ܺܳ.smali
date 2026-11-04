.class public final Ll/᩶ܺܳ;
.super Ljava/lang/Object;
.source "G6IL"


# instance fields
.field public ֫:Ll/֫ܽܳ;

.field public ۙ:Landroid/view/View;

.field public ۚ:Landroid/view/View;

.field public ۤ:Ljava/util/ArrayList;

.field public final ۧ:Ll/ۛܺܳ;

.field public final ۫:Ll/᩷֡֫;

.field public ܳ:Ll/۠ۖۧ;

.field public ܺ:Z

.field public ᩴ:Ll/۠ۖۧ;

.field public final ᩷:Ll/ܽ֡֫;

.field public ᩸:Landroid/widget/BaseAdapter;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ll/ۛܺܳ;

    invoke-direct {v0, p0}, Ll/ۛܺܳ;-><init>(Ll/᩶ܺܳ;)V

    iput-object v0, p0, Ll/᩶ܺܳ;->ۧ:Ll/ۛܺܳ;

    .line 47
    new-instance v0, Ll/᩷֡֫;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷֡֫;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/᩶ܺܳ;->۫:Ll/᩷֡֫;

    .line 51
    iput-object p1, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶ܺܳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܺܳ;->ۤ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ۙ(Landroid/view/View;Z)V
    .locals 2

    const v0, 0x7f0a0479

    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-nez p2, :cond_0

    const v1, 0x7f12055a

    goto :goto_0

    .line 160
    :cond_0
    iget-object v1, p0, Ll/᩶ܺܳ;->ۙ:Landroid/view/View;

    if-ne p1, v1, :cond_1

    const v1, 0x7f120549

    goto :goto_0

    :cond_1
    const v1, 0x7f12055c

    .line 159
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const v0, 0x7f0a0478

    .line 162
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    if-eqz p2, :cond_2

    const v0, 0x7f08010c

    goto :goto_1

    :cond_2
    const v0, 0x7f08010d

    .line 163
    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    if-eqz p2, :cond_3

    const p2, 0x7f06002f

    goto :goto_2

    :cond_3
    const p2, 0x7f060030

    .line 164
    :goto_2
    iget-object v0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    invoke-static {v0, p2}, Ll/۟֡;->ۙ(Landroid/content/Context;I)I

    move-result p2

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-static {p1, p2}, Ll/۫ۙۙ;->ۙ(Landroid/widget/ImageView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܺܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 197
    iput-object v0, p0, Ll/᩶ܺܳ;->ܳ:Ll/۠ۖۧ;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܺܳ;I)V
    .locals 0

    .line 102
    iget-object p0, p0, Ll/᩶ܺܳ;->ۤ:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܿܽܳ;

    iget-object p0, p0, Ll/ܿܽܳ;->ۙ:Ljava/lang/String;

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ۙ(Ll/᩶ܺܳ;Ljava/lang/Integer;)V
    .locals 3

    .line 201
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 202
    :cond_0
    iget-boolean v0, p0, Ll/᩶ܺܳ;->ܺ:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 204
    iput-boolean v1, p0, Ll/᩶ܺܳ;->ܺ:Z

    :cond_1
    if-eqz p1, :cond_4

    .line 206
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_4

    .line 207
    :cond_2
    iget-boolean v0, p0, Ll/᩶ܺܳ;->ܺ:Z

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v2, :cond_3

    const p1, 0x7f120552

    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 208
    :cond_3
    iput-boolean v1, p0, Ll/᩶ܺܳ;->ܺ:Z

    .line 209
    iput-boolean v1, p0, Ll/᩶ܺܳ;->᩻:Z

    .line 211
    :cond_4
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    :cond_5
    :goto_0
    return-void
.end method

.method public static synthetic ۙ(Ll/᩶ܺܳ;Ll/ܽܺܳ;Ll/ۧܽܳ;)V
    .locals 3

    .line 183
    iget-object v0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    iget-object v1, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v1}, Ll/۠ۖۧ;->۫()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v1

    sget-object v2, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    if-ne v1, v2, :cond_3

    .line 184
    invoke-virtual {p1}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v1

    if-eq v1, p2, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    .line 185
    iput-boolean p2, p0, Ll/᩶ܺܳ;->ܺ:Z

    .line 186
    iput-boolean p2, p0, Ll/᩶ܺܳ;->᩻:Z

    .line 187
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge p2, v1, :cond_1

    .line 188
    invoke-static {}, Ll/۟۠ۧ;->ᩴ()Ll/᩻۠ۧ;

    move-result-object p2

    invoke-static {v0, p2}, Ll/᩷ܺܳ;->ۙ(Landroid/content/Context;Ll/᩻۠ۧ;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 189
    invoke-static {}, Ll/֫ܽܳ;->ᩴ()V

    .line 190
    invoke-virtual {p1}, Ll/ܽܺܳ;->᩵()V

    .line 191
    iget-object p1, p0, Ll/᩶ܺܳ;->֫:Ll/֫ܽܳ;

    invoke-virtual {p1}, Ll/֫ܽܳ;->ۤ()Z

    move-result p1

    if-nez p1, :cond_2

    const p1, 0x7f1207ef

    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    goto :goto_0

    .line 193
    :cond_1
    invoke-virtual {p1}, Ll/ܽܺܳ;->᩸()V

    .line 195
    :cond_2
    :goto_0
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    :cond_3
    :goto_1
    return-void
.end method

.method public static bridge synthetic ۚ(Ll/᩶ܺܳ;)Ll/ܽ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    return-object p0
.end method

.method private ۤ()V
    .locals 3

    const/4 v0, 0x0

    .line 249
    iput-boolean v0, p0, Ll/᩶ܺܳ;->᩻:Z

    const/4 v1, 0x1

    .line 251
    :try_start_0
    iput-boolean v1, p0, Ll/᩶ܺܳ;->ܺ:Z

    .line 252
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    .line 253
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽܺܳ;->᩹()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 255
    iput-boolean v0, p0, Ll/᩶ܺܳ;->ܺ:Z

    .line 256
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    .line 257
    iget-object v0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v0, v1, v2}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static ۤ(Ll/᩶ܺܳ;)V
    .locals 2

    .line 222
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    .line 223
    invoke-virtual {v0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v0

    sget-object v1, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 224
    iput-boolean v0, p0, Ll/᩶ܺܳ;->᩻:Z

    .line 225
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩶ܺܳ;)Ll/۠ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    return-object p0
.end method

.method public static ۫(Ll/᩶ܺܳ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    .line 230
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽܺܳ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    .line 231
    iput-boolean v0, p0, Ll/᩶ܺܳ;->ܺ:Z

    .line 232
    iput-boolean v0, p0, Ll/᩶ܺܳ;->᩻:Z

    .line 233
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ۨ()V

    .line 234
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    return-void

    .line 237
    :cond_0
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v1

    if-nez v1, :cond_1

    .line 238
    iget-object p0, p0, Ll/᩶ܺܳ;->֫:Ll/֫ܽܳ;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ll/֫ܽܳ;->ۙ(Z)V

    return-void

    .line 241
    :cond_1
    invoke-static {v0}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 215
    invoke-static {v0}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_2

    return-void

    :cond_2
    const/4 p0, 0x0

    .line 76
    :try_start_0
    invoke-static {v0, p0}, Ll/۟֨ܺ;->ۤ(Landroid/content/Context;Ll/֡֨ܺ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 546
    invoke-virtual {v0, v1, p0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 245
    :cond_3
    invoke-direct {p0}, Ll/᩶ܺܳ;->ۤ()V

    return-void
.end method

.method public static synthetic ܳ(Ll/᩶ܺܳ;)V
    .locals 2

    const/4 v0, 0x0

    .line 111
    iput-boolean v0, p0, Ll/᩶ܺܳ;->ܺ:Z

    .line 112
    iput-boolean v0, p0, Ll/᩶ܺܳ;->᩻:Z

    .line 113
    iget-object v0, p0, Ll/᩶ܺܳ;->֫:Ll/֫ܽܳ;

    invoke-virtual {v0}, Ll/֫ܽܳ;->᩷()V

    .line 114
    iget-object v0, p0, Ll/᩶ܺܳ;->ܳ:Ll/۠ۖۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    .line 115
    :cond_0
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->᩷()Ll/ܽ᩻ۙ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ܺܳ;->ۧ:Ll/ۛܺܳ;

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۙ;->᩷(Ll/ܶ᩻ۙ;)V

    .line 116
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ۗ()Ll/ܽ᩻ۙ;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ܺܳ;->۫:Ll/᩷֡֫;

    invoke-virtual {v0, v1}, Ll/ܺ᩻ۙ;->᩷(Ll/ܶ᩻ۙ;)V

    .line 117
    iget-object p0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    instance-of v0, p0, Ll/۫ܺܳ;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/᩶ܺܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/᩶ܺܳ;->᩻:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩶ܺܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    return-void
.end method

.method public static ᩴ(Ll/᩶ܺܳ;)V
    .locals 2

    .line 215
    iget-object p0, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    invoke-static {p0}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 76
    :try_start_0
    invoke-static {p0, v0}, Ll/۟֨ܺ;->ۤ(Landroid/content/Context;Ll/֡֨ܺ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 546
    invoke-virtual {p0, v1, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method private ᩷()V
    .locals 6

    .line 128
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 129
    :cond_0
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 130
    :goto_0
    iget-object v3, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    invoke-static {v3}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v4

    .line 131
    iget-boolean v5, p0, Ll/᩶ܺܳ;->᩻:Z

    if-eqz v5, :cond_3

    if-nez v4, :cond_2

    .line 132
    iput-boolean v2, p0, Ll/᩶ܺܳ;->᩻:Z

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 133
    invoke-virtual {v3}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۠ۧۙ;->ۙ()Ll/ۖۧۙ;

    move-result-object v3

    sget-object v5, Ll/ۖۧۙ;->ᩳ:Ll/ۖۧۙ;

    if-ne v3, v5, :cond_3

    .line 134
    iput-boolean v2, p0, Ll/᩶ܺܳ;->᩻:Z

    .line 135
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽܺܳ;->᩻()Z

    move-result v3

    if-nez v3, :cond_3

    .line 136
    invoke-direct {p0}, Ll/᩶ܺܳ;->ۤ()V

    return-void

    .line 141
    :cond_3
    :goto_1
    iget-object v3, p0, Ll/᩶ܺܳ;->ۙ:Landroid/view/View;

    invoke-direct {p0, v3, v0}, Ll/᩶ܺܳ;->ۙ(Landroid/view/View;Z)V

    .line 142
    iget-object v3, p0, Ll/᩶ܺܳ;->ۚ:Landroid/view/View;

    invoke-direct {p0, v3, v4}, Ll/᩶ܺܳ;->ۙ(Landroid/view/View;Z)V

    .line 143
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ܽܺܳ;->᩻()Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v0, :cond_4

    if-nez v4, :cond_5

    .line 144
    :cond_4
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->᩵()V

    .line 145
    :cond_5
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->᩻()Z

    move-result v0

    .line 146
    iget-object v3, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v3}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v3

    iget-boolean v4, p0, Ll/᩶ܺܳ;->ܺ:Z

    if-eqz v4, :cond_6

    if-nez v0, :cond_6

    const v4, 0x7f12057b

    goto :goto_2

    :cond_6
    if-eqz v0, :cond_7

    const v4, 0x7f120b9f

    goto :goto_2

    :cond_7
    const v4, 0x7f12054b

    :goto_2
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    .line 148
    iget-object v3, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v3}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v3

    iget-boolean v4, p0, Ll/᩶ܺܳ;->ܺ:Z

    if-eqz v4, :cond_8

    if-eqz v0, :cond_9

    .line 149
    :cond_8
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    const/4 v1, 0x0

    .line 148
    :goto_3
    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 150
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->۫()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܺܳ;->ۤ:Ljava/util/ArrayList;

    .line 151
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 152
    iget-object v1, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v1

    if-nez v0, :cond_a

    const/16 v2, 0x8

    :cond_a
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 153
    iget-object v0, p0, Ll/᩶ܺܳ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_b
    :goto_4
    return-void
.end method

.method public static synthetic ᩷(Ll/᩶ܺܳ;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    return-void
.end method

.method public static ᩸(Ll/᩶ܺܳ;)V
    .locals 5

    .line 170
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ll/ܽܺܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 172
    :cond_0
    invoke-virtual {v0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v1

    if-nez v1, :cond_1

    .line 174
    iget-object p0, p0, Ll/᩶ܺܳ;->֫:Ll/֫ܽܳ;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ll/֫ܽܳ;->ۙ(Z)V

    return-void

    .line 177
    :cond_1
    iget-object v2, p0, Ll/᩶ܺܳ;->ܳ:Ll/۠ۖۧ;

    if-eqz v2, :cond_2

    :goto_0
    return-void

    .line 178
    :cond_2
    iget-object v2, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    invoke-virtual {v2}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v2

    const v3, 0x7f120559

    invoke-virtual {v2, v3}, Ll/ۖۖۧ;->᩷(I)V

    const v3, 0x7f120548

    .line 179
    invoke-virtual {v2, v3}, Ll/ۖۖۧ;->ۙ(I)V

    const v3, 0x7f120161

    const/4 v4, 0x0

    .line 180
    invoke-virtual {v2, v3, v4}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/᩺ܺܳ;

    invoke-direct {v3, p0, v0, v1}, Ll/᩺ܺܳ;-><init>(Ll/᩶ܺܳ;Ll/ܽܺܳ;Ll/ۧܽܳ;)V

    const v0, 0x7f12018c

    .line 181
    invoke-virtual {v2, v0, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 196
    invoke-virtual {v2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܺܳ;->ܳ:Ll/۠ۖۧ;

    .line 197
    new-instance v1, Ll/ܶܺܳ;

    invoke-direct {v1, p0}, Ll/ܶܺܳ;-><init>(Ll/᩶ܺܳ;)V

    invoke-virtual {v0, v1}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩶ܺܳ;)Ll/֫ܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶ܺܳ;->֫:Ll/֫ܽܳ;

    return-object p0
.end method


# virtual methods
.method public final ۙ()V
    .locals 6

    .line 55
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->۫()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Ll/᩶ܺܳ;->ۤ:Ljava/util/ArrayList;

    .line 56
    new-instance v0, Ll/ۘܺܳ;

    invoke-direct {v0, p0}, Ll/ۘܺܳ;-><init>(Ll/᩶ܺܳ;)V

    iput-object v0, p0, Ll/᩶ܺܳ;->᩸:Landroid/widget/BaseAdapter;

    const v0, 0x7f0d00c9

    .line 91
    iget-object v1, p0, Ll/᩶ܺܳ;->᩷:Ll/ܽ֡֫;

    invoke-virtual {v1, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a0036

    .line 92
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/᩶ܺܳ;->ۙ:Landroid/view/View;

    const v2, 0x7f0a0460

    .line 93
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/᩶ܺܳ;->ۚ:Landroid/view/View;

    const v2, 0x7f0a04d3

    .line 94
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ܰᩴᩴ;

    .line 96
    invoke-virtual {v1}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x43700000    # 240.0f

    mul-float v3, v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ܰᩴᩴ;->ۙ(I)V

    .line 97
    iget-object v3, p0, Ll/᩶ܺܳ;->ۙ:Landroid/view/View;

    new-instance v4, Ll/۟ۨ᩸;

    const/4 v5, 0x3

    invoke-direct {v4, v5, p0}, Ll/۟ۨ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    iget-object v3, p0, Ll/᩶ܺܳ;->ۚ:Landroid/view/View;

    new-instance v4, Ll/᩹ܺܳ;

    const/4 v5, 0x0

    invoke-direct {v4, v5, p0}, Ll/᩹ܺܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    iget-object v3, p0, Ll/᩶ܺܳ;->᩸:Landroid/widget/BaseAdapter;

    invoke-virtual {v2, v3}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    const v3, 0x7f0a04d1

    .line 100
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    .line 101
    new-instance v3, Ll/ۗܺܳ;

    invoke-direct {v3, p0}, Ll/ۗܺܳ;-><init>(Ll/᩶ܺܳ;)V

    invoke-virtual {v2, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 104
    invoke-virtual {v1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v2

    const v3, 0x7f1204ef

    invoke-virtual {v2, v3}, Ll/ۖۖۧ;->᩷(I)V

    invoke-virtual {v2, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v0, 0x7f12054b

    const/4 v3, 0x0

    .line 105
    invoke-virtual {v2, v0, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12018c

    const v4, 0x7f12054a

    .line 0
    invoke-static {v2, v0, v3, v4, v3}, Ll/۠᩹ᩴ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object v0

    .line 107
    iput-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    .line 108
    new-instance v2, Ll/֫ܽܳ;

    new-instance v3, Ll/ۜۙ᩻;

    const/4 v4, 0x2

    invoke-direct {v3, v4, p0}, Ll/ۜۙ᩻;-><init>(ILjava/lang/Object;)V

    invoke-direct {v2, v1, v0, v3}, Ll/֫ܽܳ;-><init>(Ll/ܽ֡֫;Ll/۠ۖۧ;Ll/ۜۙ᩻;)V

    iput-object v2, p0, Ll/᩶ܺܳ;->֫:Ll/֫ܽܳ;

    .line 109
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-static {v0}, Ll/ۚۙܺ;->᩷(Ll/۠ۖۧ;)V

    .line 110
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    new-instance v2, Ll/᩵ܺܳ;

    invoke-direct {v2, p0}, Ll/᩵ܺܳ;-><init>(Ll/᩶ܺܳ;)V

    invoke-virtual {v0, v2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 119
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Ll/֨ܿ᩻;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p0}, Ll/֨ܿ᩻;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    iget-object v0, p0, Ll/᩶ܺܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Ll/ۨܺܳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    invoke-virtual {v1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    new-instance v2, Ll/ܰܺܳ;

    invoke-direct {v2, p0}, Ll/ܰܺܳ;-><init>(Ll/᩶ܺܳ;)V

    invoke-virtual {v0, v2}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    .line 122
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->᩷()Ll/ܽ᩻ۙ;

    move-result-object v0

    iget-object v2, p0, Ll/᩶ܺܳ;->ۧ:Ll/ۛܺܳ;

    invoke-virtual {v0, v1, v2}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V

    .line 123
    invoke-static {}, Ll/ܽܺܳ;->᩺()Ll/ܽܺܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽܺܳ;->ۗ()Ll/ܽ᩻ۙ;

    move-result-object v0

    iget-object v2, p0, Ll/᩶ܺܳ;->۫:Ll/᩷֡֫;

    invoke-virtual {v0, v1, v2}, Ll/ܺ᩻ۙ;->ۙ(Ll/ۤ᩻ۙ;Ll/ܶ᩻ۙ;)V

    .line 124
    invoke-direct {p0}, Ll/᩶ܺܳ;->᩷()V

    return-void
.end method
