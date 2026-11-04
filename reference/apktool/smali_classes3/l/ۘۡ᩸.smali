.class public final Ll/ۘۡ᩸;
.super Ljava/lang/Object;
.source "V8VP"

# interfaces
.implements Ll/᩵۬᩸;


# instance fields
.field public final ֫:Ll/ܽᩳ᩻;

.field public final ۗ:Landroid/view/View;

.field public final ۘ:Landroid/widget/TextView;

.field public final ۙ:Ll/ۖ֫᩸;

.field public final ۚ:Ll/ܽᩳ᩻;

.field public final ۛ:Landroid/view/View;

.field public final ۤ:Ll/᩻ۡ᩸;

.field public final ۧ:Ll/ۛ֡᩻;

.field public ۨ:Ll/ۧ᩸ᩴ;

.field public final ۫:Ll/ۗ۬᩸;

.field public final ܰ:Landroid/widget/TextView;

.field public final ܳ:Ll/ۗ۬᩸;

.field public final ܶ:Landroid/view/View;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ll/ۛ֡᩻;

.field public ܿ:Landroid/view/MenuItem;

.field public final ᩴ:Ll/᩺ۜ᩸;

.field public ᩵:Ll/ۧ᩸ᩴ;

.field public final ᩶:Ll/ۛ֡᩻;

.field public final ᩷:Ll/᩺ۡ᩸;

.field public final ᩸:Ll/᩺ۜ᩸;

.field public final ᩹:Landroid/view/View;

.field public ᩺:Ll/۬ۖۧ;

.field public final ᩻:Ll/ۛ֡᩻;


# direct methods
.method public constructor <init>(Ll/ۖ֫᩸;Ll/᩻ۡ᩸;Ll/᩺ۡ᩸;)V
    .locals 7

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Ll/۬ۖۧ;

    new-instance v1, Ll/᩻۠᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p0, v1}, Ll/۬ۖۧ;-><init>(Ljava/lang/Object;Ll/ۜۖۧ;)V

    iput-object v0, p0, Ll/ۘۡ᩸;->᩺:Ll/۬ۖۧ;

    .line 80
    iput-object p1, p0, Ll/ۘۡ᩸;->ۙ:Ll/ۖ֫᩸;

    .line 81
    iput-object p2, p0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    .line 82
    invoke-virtual {p2}, Ll/᩻ۡ᩸;->۫()Ll/᩺ۜ᩸;

    move-result-object v0

    iput-object v0, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    .line 83
    invoke-virtual {p2}, Ll/᩻ۡ᩸;->ۚ()Ll/᩺ۜ᩸;

    move-result-object p2

    iput-object p2, p0, Ll/ۘۡ᩸;->ᩴ:Ll/᩺ۜ᩸;

    const-string v1, "text"

    .line 84
    iput-object v1, p0, Ll/ۘۡ᩸;->ܺ:Ljava/lang/String;

    .line 85
    new-instance v1, Ll/ۗ۬᩸;

    invoke-direct {v1, p1, v0}, Ll/ۗ۬᩸;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;)V

    iput-object v1, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    .line 86
    new-instance v2, Ll/ۗ۬᩸;

    invoke-direct {v2, p1, p2}, Ll/ۗ۬᩸;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;)V

    iput-object v2, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    .line 87
    iput-object p3, p0, Ll/ۘۡ᩸;->᩷:Ll/᩺ۡ᩸;

    .line 89
    invoke-virtual {v1}, Ll/ۗ۬᩸;->᩷()V

    .line 90
    invoke-virtual {v2}, Ll/ۗ۬᩸;->᩷()V

    .line 92
    invoke-interface {p3}, Ll/᩺ۡ᩸;->ۙ()Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    const v1, 0x7f0a0504

    .line 93
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/ۘۡ᩸;->ۗ:Landroid/view/View;

    const v1, 0x7f0a04fd

    .line 94
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ۘۡ᩸;->᩹:Landroid/view/View;

    const v2, 0x7f0a04fc

    .line 95
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Ll/ۘۡ᩸;->ܶ:Landroid/view/View;

    const v3, 0x7f0a0197

    .line 96
    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ܽᩳ᩻;

    iput-object v3, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    const v4, 0x7f0a0194

    .line 97
    invoke-virtual {p3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/ܽᩳ᩻;

    iput-object v4, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    .line 98
    invoke-virtual {v3}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v5

    invoke-static {v5}, Ll/ۙۤᩴ;->ۙ(Ll/᩹ۖ᩸;)V

    .line 99
    invoke-virtual {v4}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v5

    invoke-static {v5}, Ll/ۙۤᩴ;->ۙ(Ll/᩹ۖ᩸;)V

    const v5, 0x7f0a05e7

    .line 101
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ۛ֡᩻;

    iput-object v5, p0, Ll/ۘۡ᩸;->ܽ:Ll/ۛ֡᩻;

    const v5, 0x7f0a05d9

    .line 102
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ۛ֡᩻;

    iput-object v5, p0, Ll/ۘۡ᩸;->ۧ:Ll/ۛ֡᩻;

    const v5, 0x7f0a05ea

    .line 103
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ۛ֡᩻;

    iput-object v5, p0, Ll/ۘۡ᩸;->᩶:Ll/ۛ֡᩻;

    const v5, 0x7f0a05e4

    .line 104
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/ۛ֡᩻;

    iput-object v5, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    const v5, 0x7f0a0530

    .line 105
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, p0, Ll/ۘۡ᩸;->ܰ:Landroid/widget/TextView;

    const v5, 0x7f0a052f

    .line 106
    invoke-virtual {p3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, p0, Ll/ۘۡ᩸;->ۘ:Landroid/widget/TextView;

    .line 107
    move-object v5, p3

    check-cast v5, Landroid/view/ViewGroup;

    const v6, 0x7f0a01eb

    invoke-virtual {p3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const-string v5, "text_s"

    const/4 v6, 0x0

    .line 248
    invoke-virtual {v3, v5, v6}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "text_r"

    invoke-virtual {v4, v3, v6}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    new-instance v3, Ll/ۧ᩸ᩴ;

    invoke-direct {v3, p1, v0}, Ll/ۧ᩸ᩴ;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;)V

    iput-object v3, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    .line 111
    new-instance v3, Ll/ۧ᩸ᩴ;

    invoke-direct {v3, p1, p2}, Ll/ۧ᩸ᩴ;-><init>(Ll/ܽ֡֫;Ll/᩺ۜ᩸;)V

    iput-object v3, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    .line 194
    new-instance p1, Ll/ܶ᩸ᩴ;

    const v3, 0x7f0a0688

    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-direct {p1, v3}, Ll/ܶ᩸ᩴ;-><init>(Landroid/widget/TextView;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    if-ge v4, v5, :cond_1

    if-nez v4, :cond_0

    .line 196
    iget-object v5, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    goto :goto_1

    :cond_0
    iget-object v5, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    .line 197
    :goto_1
    new-instance v6, Ll/᩵ۡ᩸;

    invoke-direct {v6, p0, p1}, Ll/᩵ۡ᩸;-><init>(Ll/ۘۡ᩸;Ll/ܶ᩸ᩴ;)V

    invoke-virtual {v5, v6}, Ll/ۧ᩸ᩴ;->ۙ(Ll/ᩴ᩸ᩴ;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 236
    :cond_1
    new-instance v4, Ll/۫֫᩸;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p0}, Ll/۫֫᩸;-><init>(ILjava/lang/Object;)V

    .line 253
    new-instance v5, Ll/֡᩵ۚ;

    invoke-direct {v5, p0, p1}, Ll/֡᩵ۚ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 288
    iget-object p1, p0, Ll/ۘۡ᩸;->ܽ:Ll/ۛ֡᩻;

    invoke-virtual {p1, v5}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 289
    iget-object p1, p0, Ll/ۘۡ᩸;->ۧ:Ll/ۛ֡᩻;

    invoke-virtual {p1, v5}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 290
    iget-object p1, p0, Ll/ۘۡ᩸;->᩶:Ll/ۛ֡᩻;

    invoke-virtual {p1, v5}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    .line 291
    iget-object p1, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {p1, v5}, Ll/ۛ֡᩻;->ۙ(Ll/ۨ֡᩻;)V

    const p1, 0x7f0a0204

    const v5, 0x7f0a010a

    const v6, 0x7f0a0205

    .line 293
    filled-new-array {v6, p1, v2, v1, v5}, [I

    move-result-object p1

    :goto_2
    const/4 v1, 0x5

    if-ge v3, v1, :cond_2

    .line 294
    aget v1, p1, v3

    .line 295
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 296
    invoke-static {v1}, Ll/ܽ۟֫;->ۙ(Landroid/view/View;)V

    .line 297
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 299
    :cond_2
    iget-object p1, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    new-instance p3, Ll/ۨۡ᩸;

    invoke-direct {p3, p0}, Ll/ۨۡ᩸;-><init>(Ll/ۘۡ᩸;)V

    invoke-virtual {p1, p3}, Ll/ܽᩳ᩻;->ۙ(Landroid/text/TextWatcher;)V

    .line 320
    new-instance p1, Ll/᩷᩹;

    const/4 p3, 0x1

    invoke-direct {p1, p3, p0}, Ll/᩷᩹;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/Runnable;)V

    .line 321
    new-instance p1, Ll/᩷᩹;

    invoke-direct {p1, p3, p0}, Ll/᩷᩹;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/᩺ۜ᩸;->ۙ(Ljava/lang/Runnable;)V

    .line 322
    new-instance p1, Ll/ܽۡ᩸;

    invoke-direct {p1, p0}, Ll/ܽۡ᩸;-><init>(Ll/ۘۡ᩸;)V

    invoke-virtual {v0, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/ۧ᩷ᩴ;)V

    .line 323
    new-instance p1, Ll/ܶۡ᩸;

    const/4 p3, 0x0

    invoke-direct {p1, p3, p0}, Ll/ܶۡ᩸;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p2, p1}, Ll/᩺ۜ᩸;->ۙ(Ll/ۧ᩷ᩴ;)V

    .line 113
    iget-object p1, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {p1, p0}, Ll/᩺ۜ᩸;->ۙ(Ll/᩵۬᩸;)V

    .line 114
    iget-object p1, p0, Ll/ۘۡ᩸;->ᩴ:Ll/᩺ۜ᩸;

    invoke-virtual {p1, p0}, Ll/᩺ۜ᩸;->ۙ(Ll/᩵۬᩸;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۘۡ᩸;)V
    .locals 2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 641
    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Ll/ۘۡ᩸;->ۙ:Ll/ۖ֫᩸;

    const-class v1, Ll/ۡ᩷ۧ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 642
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۘۡ᩸;Landroid/view/View;)V
    .locals 4

    .line 237
    iget-object v0, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    iget-object v1, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    iget-object v2, p0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    invoke-virtual {v2}, Ll/᩻ۡ᩸;->᩹()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    goto :goto_0

    :cond_0
    iget-object v2, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    .line 238
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v3, 0x7f0a0205

    if-ne p1, v3, :cond_1

    .line 240
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/ۧ᩸ᩴ;->᩷(Ljava/lang/String;)V

    return-void

    :cond_1
    const v3, 0x7f0a0204

    if-ne p1, v3, :cond_2

    .line 242
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ll/ۧ᩸ᩴ;->ۙ(Ljava/lang/String;)V

    return-void

    :cond_2
    const v3, 0x7f0a04fc

    if-ne p1, v3, :cond_3

    const/4 p1, 0x0

    .line 244
    invoke-virtual {p0, p1}, Ll/ۘۡ᩸;->ۙ(Z)Z

    move-result p0

    if-nez p0, :cond_5

    .line 245
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/ۧ᩸ᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const v3, 0x7f0a04fd

    if-ne p1, v3, :cond_4

    .line 248
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ll/ۧ᩸ᩴ;->᩷(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    const v0, 0x7f0a010a

    if-ne p1, v0, :cond_5

    .line 250
    invoke-virtual {p0}, Ll/ۘۡ᩸;->ۤ()V

    :cond_5
    return-void
.end method

.method public static ۙ(Ll/ۘۡ᩸;Ljava/util/regex/PatternSyntaxException;)V
    .locals 1

    .line 186
    iget-object p0, p0, Ll/ۘۡ᩸;->ۙ:Ll/ۖ֫᩸;

    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p0

    const v0, 0x7f12030b

    .line 187
    invoke-virtual {p0, v0}, Ll/ۖۖۧ;->᩷(I)V

    .line 188
    invoke-static {p1}, Ll/ܿܶۤ;->ۙ(Ljava/util/regex/PatternSyntaxException;)Landroid/text/SpannableStringBuilder;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const p1, 0x7f12018c

    const/4 v0, 0x0

    .line 189
    invoke-virtual {p0, p1, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 190
    invoke-virtual {p0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public static synthetic ۙ(Ll/ۘۡ᩸;Ll/ܶ᩸ᩴ;Ll/ۛ֡᩻;ZZ)V
    .locals 5

    .line 254
    iget-object v0, p0, Ll/ۘۡ᩸;->ܺ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    iget-object v2, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    const v3, 0x7f0a05e7

    const-string v4, "_bit"

    if-ne p2, v3, :cond_2

    .line 256
    invoke-virtual {v2, p3}, Ll/ۧ᩸ᩴ;->᩸(Z)V

    .line 257
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->᩸(Z)V

    if-eqz p4, :cond_1

    if-eqz p3, :cond_0

    const p2, 0x7f1209c1

    goto :goto_0

    :cond_0
    const p2, 0x7f1209c0

    .line 259
    :goto_0
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 261
    :cond_1
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 0
    invoke-static {v0, v4}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 261
    invoke-virtual {v2}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 262
    invoke-virtual {p0}, Ll/ۘۡ᩸;->ۧ()V

    return-void

    :cond_2
    const v3, 0x7f0a05ea

    if-ne p2, v3, :cond_5

    .line 264
    invoke-virtual {v2, p3}, Ll/ۧ᩸ᩴ;->ᩴ(Z)V

    .line 265
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->ᩴ(Z)V

    if-eqz p4, :cond_4

    if-eqz p3, :cond_3

    const p2, 0x7f120d52

    goto :goto_1

    :cond_3
    const p2, 0x7f120d51

    .line 267
    :goto_1
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 269
    :cond_4
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 0
    invoke-static {v0, v4}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 269
    invoke-virtual {v2}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 270
    invoke-virtual {p0}, Ll/ۘۡ᩸;->ۧ()V

    return-void

    :cond_5
    const v3, 0x7f0a05d9

    if-ne p2, v3, :cond_8

    .line 272
    invoke-virtual {v2, p3}, Ll/ۧ᩸ᩴ;->ۙ(Z)V

    .line 273
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->ۙ(Z)V

    if-eqz p4, :cond_7

    if-eqz p3, :cond_6

    const p2, 0x7f1205a7

    goto :goto_2

    :cond_6
    const p2, 0x7f1205a6

    .line 275
    :goto_2
    invoke-virtual {p1, p2}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 277
    :cond_7
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    .line 0
    invoke-static {v0, v4}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 277
    invoke-virtual {v2}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p3

    invoke-interface {p1, p3, p2}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 278
    invoke-virtual {p0}, Ll/ۘۡ᩸;->ۧ()V

    return-void

    :cond_8
    const p0, 0x7f0a05e4

    if-ne p2, p0, :cond_b

    .line 280
    invoke-virtual {v2, p3}, Ll/ۧ᩸ᩴ;->᩷(Z)V

    .line 281
    invoke-virtual {v1, p3}, Ll/ۧ᩸ᩴ;->᩷(Z)V

    if-eqz p4, :cond_a

    if-eqz p3, :cond_9

    const p0, 0x7f1208ae

    goto :goto_3

    :cond_9
    const p0, 0x7f120102

    .line 283
    :goto_3
    invoke-virtual {p1, p0}, Ll/ܶ᩸ᩴ;->ۙ(I)V

    .line 285
    :cond_a
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 0
    invoke-static {v0, v4}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 285
    invoke-virtual {v2}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/ᩳ֫ܺ;->ۙ(BLjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    :cond_b
    return-void
.end method

.method public static synthetic ۙ(Ll/ۘۡ᩸;ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 392
    iget-object v0, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    iget-object v1, p0, Ll/ۘۡ᩸;->᩹:Landroid/view/View;

    iget-object v2, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    invoke-direct {p0}, Ll/ۘۡ᩸;->ܶ()V

    .line 393
    iget-object v3, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz p1, :cond_0

    const/4 v6, 0x0

    goto :goto_0

    :cond_0
    const/16 v6, 0x8

    :goto_0
    invoke-virtual {v3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 394
    iget-object v3, p0, Ll/ۘۡ᩸;->ۗ:Landroid/view/View;

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const/4 v4, 0x0

    :cond_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 395
    invoke-direct {p0}, Ll/ۘۡ᩸;->ܽ()V

    .line 396
    iget-object v3, p0, Ll/ۘۡ᩸;->᩷:Ll/᩺ۡ᩸;

    invoke-interface {v3}, Ll/᩺ۡ᩸;->᩷()V

    if-eqz p1, :cond_2

    .line 398
    invoke-virtual {v2, p3}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    :cond_2
    if-eqz p2, :cond_3

    .line 401
    iget-object p3, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {p3, p4}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    .line 402
    iget-object p3, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {p3, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    if-eqz p1, :cond_6

    const p1, 0x3e851eb8    # 0.26f

    .line 406
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 407
    invoke-virtual {v1, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 408
    iget-object p3, p0, Ll/ۘۡ᩸;->ܶ:Landroid/view/View;

    .line 409
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result p4

    const/4 v3, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz p4, :cond_4

    .line 410
    invoke-virtual {p3, p1}, Landroid/view/View;->setAlpha(F)V

    .line 411
    invoke-virtual {p3, v5}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 413
    :cond_4
    invoke-virtual {p3, v4}, Landroid/view/View;->setAlpha(F)V

    .line 414
    invoke-virtual {p3, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 417
    :goto_1
    invoke-virtual {v2}, Ll/ܽᩳ᩻;->᩸()I

    move-result p1

    if-eqz p1, :cond_5

    .line 418
    invoke-virtual {p0}, Ll/ۘۡ᩸;->ۧ()V

    :cond_5
    if-eqz p2, :cond_6

    .line 420
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result p0

    if-nez p0, :cond_6

    .line 422
    invoke-virtual {v1, v4}, Landroid/view/View;->setAlpha(F)V

    .line 423
    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    :cond_6
    return-void
.end method

.method public static synthetic ۤ(Ll/ۘۡ᩸;)V
    .locals 3

    .line 169
    iget-object v0, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 170
    iget-object p0, p0, Ll/ۘۡ᩸;->ᩴ:Ll/᩺ۜ᩸;

    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܶۙ()I

    move-result v1

    invoke-virtual {p0, v2, v1}, Ll/᩺ۜ᩸;->scrollTo(II)V

    .line 171
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 172
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public static bridge synthetic ۫(Ll/ۘۡ᩸;)Ll/۬ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۡ᩸;->᩺:Ll/۬ۖۧ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۘۡ᩸;)Ll/ۧ᩸ᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    return-object p0
.end method

.method private ܶ()V
    .locals 4

    .line 327
    iget-object v0, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ܳ()Z

    move-result v1

    .line 112
    iget-object v2, p0, Ll/ۘۡ᩸;->ܽ:Ll/ۛ֡᩻;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 328
    iget-object v1, p0, Ll/ۘۡ᩸;->ۧ:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۤ()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 329
    iget-object v1, p0, Ll/ۘۡ᩸;->᩶:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->۫()Z

    move-result v2

    .line 112
    invoke-virtual {v1, v2, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    .line 330
    iget-object v1, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->᩸()Z

    move-result v0

    .line 112
    invoke-virtual {v1, v0, v3}, Ll/ۛ֡᩻;->ۙ(ZZ)V

    return-void
.end method

.method private ܺ()V
    .locals 3

    .line 547
    invoke-virtual {p0}, Ll/ۘۡ᩸;->۫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 548
    iget-object v0, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    invoke-virtual {v2, v1}, Ll/ۧ᩸ᩴ;->ۤ(Ljava/lang/String;)V

    .line 549
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    invoke-virtual {v1, v0}, Ll/ۧ᩸ᩴ;->ۤ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private ܽ()V
    .locals 3

    .line 554
    iget-object v0, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    iget-object v2, p0, Ll/ۘۡ᩸;->ۙ:Ll/ۖ֫᩸;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 555
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    sget v1, Ll/ۗۡ֫;->ܽ:I

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void

    .line 557
    :cond_0
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    invoke-virtual {v1}, Ll/᩻ۡ᩸;->۫()Ll/᩺ۜ᩸;

    move-result-object v1

    .line 1105
    iget-object v1, v1, Ll/᩺ۜ᩸;->۬᩸:Ll/ܰۤᩴ;

    iget v1, v1, Ll/ܰۤᩴ;->ᩴۙ:I

    .line 557
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ۘۡ᩸;)Ll/ۧ᩸ᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    return-object p0
.end method

.method public static synthetic ᩷(Ll/ۘۡ᩸;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ll/ۘۡ᩸;->ܺ()V

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ۘۡ᩸;)Ll/᩻ۡ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    return-object p0
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 160
    iget-object v0, p0, Ll/ۘۡ᩸;->ܿ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 161
    iget-object v0, p0, Ll/ۘۡ᩸;->ܿ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    iget-object v1, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v1, v0}, Ll/ۗ۬᩸;->ۙ(Z)V

    .line 162
    iget-object v0, p0, Ll/ۘۡ᩸;->ܿ:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    iget-object v2, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v2, v0}, Ll/ۗ۬᩸;->ۙ(Z)V

    .line 163
    invoke-virtual {v1}, Ll/ۗ۬᩸;->ۤ()Ll/ܶ᩷ᩴ;

    move-result-object v0

    .line 164
    invoke-virtual {v2}, Ll/ۗ۬᩸;->ۤ()Ll/ܶ᩷ᩴ;

    move-result-object v1

    .line 165
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 166
    new-instance v3, Ll/ۡܿۤ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0, v2}, Ll/ۡܿۤ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 177
    iget-object v2, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-virtual {v2, v0, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶ᩷ᩴ;Ljava/lang/Runnable;)V

    .line 178
    iget-object v0, p0, Ll/ۘۡ᩸;->ᩴ:Ll/᩺ۜ᩸;

    invoke-virtual {v0, v1, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/ܶ᩷ᩴ;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۙ()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 455
    invoke-virtual {p0, v0, v1}, Ll/ۘۡ᩸;->ۙ(ZZ)V

    return-void
.end method

.method public final ۙ(Landroid/view/MenuItem;)V
    .locals 1

    .line 155
    iput-object p1, p0, Ll/ۘۡ᩸;->ܿ:Landroid/view/MenuItem;

    .line 156
    iget-object v0, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-static {p1, v0}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Class;)V
    .locals 1

    .line 577
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->֫()V

    .line 578
    iget-object v0, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ljava/lang/Class;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 141
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ljava/lang/String;)V

    .line 142
    iget-object p1, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {p1, p2}, Ll/ۗ۬᩸;->ۙ(Ljava/lang/String;)V

    .line 143
    iget-object p1, p0, Ll/ۘۡ᩸;->ܿ:Landroid/view/MenuItem;

    iget-object p2, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-static {p1, p2}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return-void
.end method

.method public final ۙ(Ll/ۛۚۤ;)V
    .locals 1

    .line 566
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ll/ۛۚۤ;)V

    .line 567
    iget-object v0, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ll/ۛۚۤ;)V

    return-void
.end method

.method public final ۙ(Ll/ۤ᩻ۙ;Ll/ۚۨ᩸;Ljava/lang/Class;)V
    .locals 2

    .line 118
    new-instance p3, Ll/ۗۡ᩸;

    invoke-direct {p3, p0}, Ll/ۗۡ᩸;-><init>(Ll/ۘۡ᩸;)V

    iget-object v0, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    .line 136
    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    .line 137
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v1

    .line 118
    invoke-virtual {p2, p1, p3, v0, v1}, Ll/ۚۨ᩸;->ۙ(Ll/ۤ᩻ۙ;Ll/۟ܳᩴ;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;)V

    return-void
.end method

.method public final ۙ(Ll/᩵ۚۤ;)V
    .locals 1

    .line 571
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ll/᩵ۚۤ;)V

    .line 572
    iget-object v0, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0, p1}, Ll/ۗ۬᩸;->ۙ(Ll/᩵ۚۤ;)V

    .line 573
    iget-object p1, p0, Ll/ۘۡ᩸;->ܿ:Landroid/view/MenuItem;

    iget-object v0, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    invoke-static {p1, v0}, Ll/᩹۬᩸;->᩷(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return-void
.end method

.method public final ۙ(ZZ)V
    .locals 8

    .line 460
    invoke-virtual {p0}, Ll/ۘۡ᩸;->۫()Z

    move-result v0

    .line 461
    iget-object v1, p0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    invoke-virtual {v1}, Ll/᩻ۡ᩸;->֫()Ll/᩺ۜ᩸;

    move-result-object v1

    const/4 v2, 0x1

    .line 462
    iget-object v3, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    const/4 v4, 0x0

    if-nez v0, :cond_2

    .line 463
    iget-object v5, p0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    iget-object v5, v5, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v5}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v5

    if-nez v5, :cond_9

    iget-object v5, p0, Ll/ۘۡ᩸;->ᩴ:Ll/᩺ۜ᩸;

    iget-object v5, v5, Ll/᩺ۜ᩸;->ۜ᩷:Ll/۬ۡ᩸;

    invoke-virtual {v5}, Ll/۬ۡ᩸;->ܽ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_2

    .line 465
    :cond_0
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Ll/ۘۡ᩸;->ܺ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_bit"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ll/ۢ֫ܺ;->ۙ(BLjava/lang/String;)B

    move-result v5

    .line 466
    invoke-virtual {v3, v5}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 467
    iget-object v6, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    invoke-virtual {v6, v5}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 468
    invoke-direct {p0}, Ll/ۘۡ᩸;->ܶ()V

    .line 469
    iget-object v5, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    invoke-virtual {v5, v4}, Landroid/view/View;->setVisibility(I)V

    .line 470
    iget-object v5, p0, Ll/ۘۡ᩸;->ۗ:Landroid/view/View;

    const/16 v6, 0x8

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 471
    invoke-direct {p0}, Ll/ۘۡ᩸;->ܽ()V

    .line 472
    iget-object v5, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 473
    iget-object v5, p0, Ll/ۘۡ᩸;->᩷:Ll/᩺ۡ᩸;

    invoke-interface {v5}, Ll/᩺ۡ᩸;->᩷()V

    .line 475
    iget-object v5, p0, Ll/ۘۡ᩸;->᩹:Landroid/view/View;

    const v6, 0x3e851eb8    # 0.26f

    invoke-virtual {v5, v6}, Landroid/view/View;->setAlpha(F)V

    .line 476
    invoke-virtual {v5, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 478
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩷ۤ()Z

    move-result v5

    iget-object v7, p0, Ll/ۘۡ᩸;->ܶ:Landroid/view/View;

    if-eqz v5, :cond_1

    .line 479
    invoke-virtual {v7, v6}, Landroid/view/View;->setAlpha(F)V

    .line 480
    invoke-virtual {v7, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_0

    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    .line 482
    invoke-virtual {v7, v5}, Landroid/view/View;->setAlpha(F)V

    .line 483
    invoke-virtual {v7, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 486
    :cond_2
    :goto_0
    iget-object v5, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    if-eqz p1, :cond_3

    .line 487
    invoke-virtual {v5}, Landroid/view/View;->requestFocus()Z

    .line 488
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object v6

    invoke-static {v6}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    .line 490
    :cond_3
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v6

    .line 491
    aget v4, v6, v4

    .line 492
    aget v2, v6, v2

    if-eq v4, v2, :cond_5

    sub-int v6, v2, v4

    const v7, 0xc350

    if-gt v6, v7, :cond_5

    if-nez p2, :cond_5

    .line 495
    :try_start_0
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p2

    invoke-interface {p2, v4, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    .line 496
    invoke-virtual {v3}, Ll/ۧ᩸ᩴ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 497
    invoke-static {p2}, Ll/ܽۚܺ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\r"

    const-string v1, "\\r"

    .line 498
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "\t"

    const-string v1, "\\t"

    .line 499
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 500
    :cond_4
    invoke-virtual {v5, p2}, Ll/ܽᩳ᩻;->ۙ(Ljava/lang/CharSequence;)V

    if-eqz p1, :cond_7

    .line 502
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->֫()V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :cond_5
    if-nez v0, :cond_6

    .line 508
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->ۚ()V

    if-eqz p1, :cond_7

    .line 510
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->֫()V

    goto :goto_1

    :cond_6
    if-nez p2, :cond_7

    goto :goto_2

    .line 515
    :cond_7
    :goto_1
    invoke-virtual {v5}, Ll/ܽᩳ᩻;->᩸()I

    move-result p1

    if-eqz p1, :cond_8

    .line 516
    invoke-virtual {p0}, Ll/ۘۡ᩸;->ۧ()V

    goto :goto_2

    .line 518
    :cond_8
    invoke-virtual {p0}, Ll/ۘۡ᩸;->᩻()V

    :cond_9
    :goto_2
    return-void
.end method

.method public final ۙ(Z)Z
    .locals 3

    .line 431
    iget-object v0, p0, Ll/ۘۡ᩸;->ۗ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 432
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 433
    iget-object v0, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 435
    iget-object v1, p0, Ll/ۘۡ᩸;->᩹:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    const/4 v0, 0x1

    .line 436
    invoke-virtual {v1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 437
    iget-object v1, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 438
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->ۚ()V

    .line 439
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->֫()V

    if-eqz p1, :cond_0

    .line 441
    invoke-virtual {v1}, Ll/ܽᩳ᩻;->᩷()Ll/᩹ۖ᩸;

    move-result-object p1

    invoke-static {p1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    :cond_0
    return v0

    :cond_1
    return v2
.end method

.method public final ۚ()Z
    .locals 2

    .line 590
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ۚ()Z

    move-result v0

    iget-object v1, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v1}, Ll/ۗ۬᩸;->ۚ()Z

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final ۤ()V
    .locals 3

    .line 526
    iget-object v0, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    .line 268
    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۚ()V

    .line 527
    iget-object v0, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    .line 268
    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۚ()V

    .line 528
    iget-object v0, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-nez v1, :cond_0

    .line 529
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 530
    invoke-direct {p0}, Ll/ۘۡ᩸;->ܽ()V

    .line 531
    iget-object v0, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ܳ()V

    .line 532
    iget-object v0, p0, Ll/ۘۡ᩸;->᩷:Ll/᩺ۡ᩸;

    invoke-interface {v0}, Ll/᩺ۡ᩸;->᩷()V

    .line 534
    :cond_0
    iget-object v0, p0, Ll/ۘۡ᩸;->ۗ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    .line 535
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 536
    iget-object v0, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ܳ()V

    .line 538
    :cond_1
    iget-object v0, p0, Ll/ۘۡ᩸;->᩻:Ll/ۛ֡᩻;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 542
    iget-object v0, p0, Ll/ۘۡ᩸;->᩺:Ll/۬ۖۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 543
    invoke-direct {p0}, Ll/ۘۡ᩸;->ܺ()V

    return-void
.end method

.method public final ۫()Z
    .locals 1

    .line 522
    iget-object v0, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()V
    .locals 1

    const/4 v0, 0x0

    .line 455
    invoke-virtual {p0, v0, v0}, Ll/ۘۡ᩸;->ۙ(ZZ)V

    return-void
.end method

.method public final ᩷(Ll/ۛۚۤ;)V
    .locals 3

    .line 371
    iget-object v0, p0, Ll/ۘۡ᩸;->ۛ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 372
    iget-object v2, p0, Ll/ۘۡ᩸;->ۗ:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x1

    .line 373
    :cond_1
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Z)V

    .line 374
    invoke-virtual {p1, v1}, Ll/ۛۚۤ;->ۙ(Z)V

    const-string v2, ""

    if-eqz v0, :cond_2

    .line 375
    iget-object v0, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_3

    .line 376
    iget-object v0, p0, Ll/ۘۡ᩸;->ۚ:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->ۤ()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-virtual {p1, v2}, Ll/ۛۚۤ;->ۙ(Ljava/lang/CharSequence;)V

    .line 377
    iget-object v0, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۙ()B

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۛۚۤ;->writeByte(I)V

    return-void
.end method

.method public final ᩷(Ll/᩵ۚۤ;)V
    .locals 6

    .line 381
    invoke-virtual {p1}, Ll/᩵ۚۤ;->ܳ()Z

    move-result v2

    .line 382
    invoke-virtual {p1}, Ll/᩵ۚۤ;->ܳ()Z

    move-result v3

    .line 383
    invoke-static {p1}, Ll/᩵ۙᩴ;->᩷(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v4

    .line 384
    invoke-static {p1}, Ll/᩵ۙᩴ;->᩷(Ll/᩵ۚۤ;)Ljava/lang/String;

    move-result-object v5

    .line 385
    invoke-virtual {p1}, Ll/᩵ۚۤ;->readByte()B

    move-result p1

    if-eqz v2, :cond_0

    .line 387
    iget-object v0, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0, p1}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 388
    iget-object v0, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    invoke-virtual {v0, p1}, Ll/ۧ᩸ᩴ;->ۙ(B)V

    .line 391
    :cond_0
    new-instance p1, Ll/᩹ۡ᩸;

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ll/᩹ۡ᩸;-><init>(Ll/ۘۡ᩸;ZZLjava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩷(Landroid/view/MenuItem;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 674
    iget-object v2, v0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    invoke-virtual {v2}, Ll/᩻ۡ᩸;->֫()Ll/᩺ۜ᩸;

    move-result-object v3

    .line 675
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    const v5, 0x7f0a04d8

    const/4 v6, 0x1

    if-ne v4, v5, :cond_0

    .line 677
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->֡ۤ()V

    return v6

    :cond_0
    const v5, 0x7f0a06ad

    if-ne v4, v5, :cond_1

    .line 679
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ܺ᩸()V

    return v6

    :cond_1
    const v5, 0x7f0a036d

    if-ne v4, v5, :cond_2

    .line 681
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->᩸()V

    return v6

    :cond_2
    const v5, 0x7f0a0384

    if-ne v4, v5, :cond_3

    .line 683
    invoke-virtual {v3}, Ll/᩺ۜ᩸;->ܳۙ()V

    return v6

    :cond_3
    const v5, 0x7f0a03bd

    if-ne v4, v5, :cond_4

    .line 685
    invoke-virtual/range {p0 .. p0}, Ll/ۘۡ᩸;->ۙ()V

    return v6

    :cond_4
    const v5, 0x7f0a0399

    .line 686
    iget-object v7, v0, Ll/ۘۡ᩸;->ۙ:Ll/ۖ֫᩸;

    if-ne v4, v5, :cond_5

    .line 647
    invoke-virtual {v2}, Ll/᩻ۡ᩸;->֫()Ll/᩺ۜ᩸;

    move-result-object v1

    .line 648
    new-instance v2, Ll/ۛۡ᩸;

    invoke-direct {v2, v7, v1}, Ll/ۛۡ᩸;-><init>(Ll/ۖ֫᩸;Ll/᩺ۜ᩸;)V

    const v3, 0x7f1207a2

    .line 665
    invoke-virtual {v2, v3}, Ll/۠ۢᩴ;->ܺ(I)V

    const/4 v3, 0x2

    .line 666
    invoke-virtual {v2, v3}, Ll/۠ۢᩴ;->ᩴ(I)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "1\u2026"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 667
    invoke-virtual {v1}, Ll/᩺ۜ᩸;->᩶ۙ()I

    move-result v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ll/۠ۢᩴ;->ۤ(Ljava/lang/String;)V

    .line 668
    invoke-virtual {v2}, Ll/۠ۢᩴ;->ۙ()V

    .line 669
    invoke-virtual {v2, v3}, Ll/۠ۢᩴ;->᩸(I)V

    .line 202
    invoke-virtual {v2, v6}, Ll/۠ۢᩴ;->᩷(Z)V

    return v6

    :cond_5
    const v5, 0x7f0a03ce

    const/4 v8, 0x0

    .line 688
    iget-object v9, v0, Ll/ۘۡ᩸;->ᩴ:Ll/᩺ۜ᩸;

    iget-object v10, v0, Ll/ۘۡ᩸;->᩸:Ll/᩺ۜ᩸;

    if-ne v4, v5, :cond_7

    .line 603
    invoke-virtual {v2}, Ll/᩻ۡ᩸;->᩹()Z

    move-result v1

    iget-object v2, v0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    iget-object v3, v0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    if-eqz v1, :cond_6

    move-object/from16 v17, v2

    move-object v14, v3

    move-object/from16 v18, v9

    move-object v15, v10

    goto :goto_0

    :cond_6
    move-object v14, v2

    move-object/from16 v17, v3

    move-object v15, v9

    move-object/from16 v18, v10

    .line 614
    :goto_0
    invoke-virtual {v14}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {v17 .. v17}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    .line 615
    invoke-static {}, Ll/ۡۧᩴ;->ܳ()Ljava/util/List;

    move-result-object v1

    new-array v2, v8, [Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 616
    invoke-static {}, Ll/ۡۧᩴ;->ܳ()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v14}, Ll/ۗ۬᩸;->ᩴ()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 617
    invoke-virtual {v7}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v3

    const v4, 0x7f1207ce

    .line 618
    invoke-virtual {v3, v4}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v4, Ll/ܺۡ᩸;

    move-object v11, v4

    move v12, v2

    move-object v13, v1

    invoke-direct/range {v11 .. v18}, Ll/ܺۡ᩸;-><init>(I[Ljava/lang/String;Ll/ۗ۬᩸;Ll/᩺ۜ᩸;ZLl/ۗ۬᩸;Ll/᩺ۜ᩸;)V

    .line 619
    invoke-virtual {v3, v1, v2, v4}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12018c

    const/4 v2, 0x0

    .line 637
    invoke-virtual {v3, v1, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120bd5

    .line 638
    invoke-virtual {v3, v1, v2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 639
    invoke-virtual {v3}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v1

    .line 640
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/۟ۘᩴ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v0}, Ll/۟ۘᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return v6

    :cond_7
    const v2, 0x7f0a03c1

    if-ne v4, v2, :cond_8

    .line 691
    const-class v1, Ll/ۧۧ᩸;

    invoke-virtual {v0, v1}, Ll/ۘۡ᩸;->ۙ(Ljava/lang/Class;)V

    return v6

    :cond_8
    const v2, 0x7f0a03cc

    if-ne v4, v2, :cond_9

    .line 693
    invoke-virtual/range {p0 .. p0}, Ll/ۘۡ᩸;->֫()V

    return v6

    :cond_9
    const v2, 0x7f0a0585

    if-ne v4, v2, :cond_b

    .line 695
    invoke-virtual {v10}, Ll/᩺ۜ᩸;->ۚۤ()Z

    move-result v2

    xor-int/lit8 v3, v2, 0x1

    .line 696
    invoke-virtual {v10, v3}, Ll/᩺ۜ᩸;->ۨ(Z)V

    .line 697
    invoke-virtual {v9, v3}, Ll/᩺ۜ᩸;->ۨ(Z)V

    .line 698
    invoke-interface {v1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    if-nez v2, :cond_a

    const-string v1, "smooth_mode"

    const v2, 0x7f120b72

    .line 700
    invoke-static {v2, v7, v1}, Ll/۫۠ᩴ;->ۙ(ILl/ܽ֡֫;Ljava/lang/String;)V

    :cond_a
    return v6

    :cond_b
    const v2, 0x7f0a037a

    if-ne v4, v2, :cond_c

    .line 703
    invoke-static {v1, v3}, Ll/᩹۬᩸;->ۙ(Landroid/view/MenuItem;Ll/᩺ۜ᩸;)V

    return v6

    .line 704
    :cond_c
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    instance-of v2, v1, Ll/ۤ֫ᩴ;

    if-eqz v2, :cond_d

    check-cast v1, Ll/ۤ֫ᩴ;

    .line 705
    invoke-virtual {v1}, Ll/ۤ֫ᩴ;->ۙ()Ll/᩸֫ᩴ;

    move-result-object v1

    invoke-virtual {v1, v3}, Ll/᩸֫ᩴ;->ۙ(Ll/᩺ۜ᩸;)V

    return v6

    :cond_d
    return v8
.end method

.method public final ᩸()V
    .locals 2

    .line 582
    iget-object v0, p0, Ll/ۘۡ᩸;->᩺:Ll/۬ۖۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 583
    iget-object v0, p0, Ll/ۘۡ᩸;->᩵:Ll/ۧ᩸ᩴ;

    .line 268
    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۚ()V

    .line 584
    iget-object v0, p0, Ll/ۘۡ᩸;->ۨ:Ll/ۧ᩸ᩴ;

    .line 268
    invoke-virtual {v0}, Ll/ۧ᩸ᩴ;->ۚ()V

    .line 585
    iget-object v0, p0, Ll/ۘۡ᩸;->ܳ:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    :try_start_0
    sget-object v1, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 586
    :catch_0
    iget-object v0, p0, Ll/ۘۡ᩸;->۫:Ll/ۗ۬᩸;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    :try_start_1
    sget-object v1, Ll/᩶᩷ۧ;->ܳ:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method public final ᩻()V
    .locals 7

    .line 335
    invoke-virtual {p0}, Ll/ۘۡ᩸;->۫()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 338
    :cond_0
    iget-object v0, p0, Ll/ۘۡ᩸;->֫:Ll/ܽᩳ᩻;

    invoke-virtual {v0}, Ll/ܽᩳ᩻;->᩸()I

    move-result v0

    iget-object v1, p0, Ll/ۘۡ᩸;->ܰ:Landroid/widget/TextView;

    iget-object v2, p0, Ll/ۘۡ᩸;->ۘ:Landroid/widget/TextView;

    if-nez v0, :cond_2

    .line 364
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v3, "0"

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 365
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    :cond_1
    sget-object v0, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 341
    sget-object v0, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    .line 344
    :cond_2
    iget-object v0, p0, Ll/ۘۡ᩸;->ۤ:Ll/᩻ۡ᩸;

    invoke-virtual {v0}, Ll/᩻ۡ᩸;->֫()Ll/᩺ۜ᩸;

    move-result-object v0

    .line 345
    iget-object v3, v0, Ll/᩺ۜ᩸;->ۛ᩸:Ll/ۖ᩷ᩴ;

    .line 347
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۡۙ()[I

    move-result-object v4

    .line 348
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v5, 0x0

    aget v5, v4, v5

    const/4 v6, 0x1

    aget v4, v4, v6

    invoke-virtual {v3, v0, v5, v4}, Ll/ۖ᩷ᩴ;->ۙ(Landroid/content/Context;II)Ll/۟᩷ᩴ;

    move-result-object v0

    .line 350
    invoke-virtual {v0}, Ll/۟᩷ᩴ;->ۙ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 351
    sget-object v3, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 352
    sget-object v1, Ll/ۗۡ֫;->᩻ۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    .line 353
    :cond_3
    invoke-virtual {v0}, Ll/۟᩷ᩴ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 354
    sget v3, Ll/ۗۡ֫;->ܶۙ:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 355
    sget v1, Ll/ۗۡ֫;->ܶۙ:I

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    .line 357
    :cond_4
    sget-object v3, Ll/ۗۡ֫;->ۧۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 358
    sget-object v1, Ll/ۗۡ֫;->ۧۙ:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 360
    :goto_0
    invoke-virtual {v0}, Ll/۟᩷ᩴ;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 364
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 365
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    :goto_1
    return-void
.end method
