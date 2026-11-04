.class public final Ll/᩻ܰᩴ;
.super Ljava/lang/Object;
.source "313O"


# instance fields
.field public ֫:I

.field public ۗ:Z

.field public final ۙ:Ll/ܽ֡֫;

.field public ۚ:Ll/ܳܰᩴ;

.field public final ۤ:Ll/۠ۖۧ;

.field public final ۧ:Ljava/util/ArrayList;

.field public final ۨ:Ll/۬ܿ᩻;

.field public ۫:Ljava/lang/String;

.field public ܳ:Ljava/lang/String;

.field public ܶ:Z

.field public ܺ:Ll/֫ܰᩴ;

.field public ܽ:Z

.field public final ᩴ:Ll/᩵ۘᩴ;

.field public ᩵:Ljava/lang/String;

.field public final ᩷:Landroid/view/View;

.field public ᩸:Z

.field public final ᩹:Lcom/google/android/material/tabs/TabLayout;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;Ll/᩵ۘᩴ;)V
    .locals 6

    .line 259
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻ܰᩴ;->ۧ:Ljava/util/ArrayList;

    const-string v0, ""

    .line 92
    iput-object v0, p0, Ll/᩻ܰᩴ;->ܳ:Ljava/lang/String;

    .line 95
    iput-object v0, p0, Ll/᩻ܰᩴ;->᩵:Ljava/lang/String;

    const/4 v0, 0x0

    .line 98
    iput v0, p0, Ll/᩻ܰᩴ;->֫:I

    .line 260
    iput-object p1, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    .line 261
    iput-object p2, p0, Ll/᩻ܰᩴ;->ᩴ:Ll/᩵ۘᩴ;

    const v1, 0x7f0d00f0

    .line 262
    invoke-virtual {p1, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/᩻ܰᩴ;->᩷:Landroid/view/View;

    const v2, 0x7f0a06d6

    .line 263
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/۬ܿ᩻;

    iput-object v2, p0, Ll/᩻ܰᩴ;->ۨ:Ll/۬ܿ᩻;

    const v3, 0x7f0a05ef

    .line 264
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/tabs/TabLayout;

    iput-object v3, p0, Ll/᩻ܰᩴ;->᩹:Lcom/google/android/material/tabs/TabLayout;

    .line 265
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v4, 0x7f0d00f1

    invoke-virtual {v3, v4, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0a0634

    .line 266
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f1207ad

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 267
    invoke-virtual {v3, v0, v0}, Landroid/view/View;->measure(II)V

    .line 269
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ۧܰ;

    .line 270
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sget-object v4, Ll/֨᩺ᩴ;->᩷:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, 0x2

    const/4 v5, 0x3

    div-int/2addr v4, v5

    mul-int v4, v4, v3

    iput v4, v0, Ll/ۧܰ;->᩷ۙ:I

    .line 271
    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f0a0268

    .line 273
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v2, 0x7f0a0681

    .line 274
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0a0535

    .line 275
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۜܿ᩻;

    .line 276
    new-instance v4, Ll/ۖۘᩴ;

    invoke-direct {v4, p0, v0, v2}, Ll/ۖۘᩴ;-><init>(Ll/᩻ܰᩴ;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v3, v4}, Ll/ۜܿ᩻;->ۙ(Ll/ۖܿ᩻;)V

    .line 298
    new-instance v2, Ll/ܿ۠֫;

    invoke-direct {v2, v5, p0}, Ll/ܿ۠֫;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 299
    sget v0, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v0, Ll/ۖۖۧ;

    invoke-direct {v0, p1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 300
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const v1, 0x7f12018c

    const/4 v2, 0x0

    .line 301
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120917

    .line 302
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v1, 0x1

    .line 303
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 304
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    .line 305
    new-instance v2, Ll/᩺ۘᩴ;

    invoke-direct {v2, p0}, Ll/᩺ۘᩴ;-><init>(Ll/᩻ܰᩴ;)V

    invoke-virtual {v0, v2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 307
    new-instance v2, Ll/ۘۘᩴ;

    invoke-direct {v2, p0, v3}, Ll/ۘۘᩴ;-><init>(Ll/᩻ܰᩴ;Ll/ۜܿ᩻;)V

    invoke-virtual {v0, v2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 321
    new-instance v2, Ll/ܰۘᩴ;

    invoke-direct {v2, p0}, Ll/ܰۘᩴ;-><init>(Ll/᩻ܰᩴ;)V

    .line 324
    invoke-virtual {p1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    .line 325
    invoke-virtual {v0}, Ll/۠ۖۧ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object v0

    new-instance v3, Ll/᩶ۘᩴ;

    invoke-direct {v3, p0, p1, v2}, Ll/᩶ۘᩴ;-><init>(Ll/᩻ܰᩴ;Ll/ܽ֡֫;Ll/ܰۘᩴ;)V

    invoke-virtual {v0, v3}, Ll/۠ۧۙ;->ۙ(Ll/᩷᩻ۙ;)V

    .line 331
    invoke-virtual {p2}, Ll/᩵ۘᩴ;->ۙ()Ljava/lang/String;

    move-result-object p1

    const-string p2, "*/*"

    .line 332
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p1, "built-in"

    .line 333
    iput-object p1, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    return-void

    :cond_0
    const-string p2, "text/"

    .line 334
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p1, "text/*"

    .line 335
    iput-object p1, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    return-void

    :cond_1
    const-string p2, "image/"

    .line 336
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p1, "image/*"

    .line 337
    iput-object p1, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    return-void

    :cond_2
    const-string p2, "video/"

    .line 338
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p1, "video/*"

    .line 339
    iput-object p1, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    return-void

    :cond_3
    const-string p2, "audio/"

    .line 340
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "audio/*"

    .line 341
    iput-object p1, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    return-void

    :cond_4
    const-string p1, "default"

    .line 343
    iput-object p1, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    .line 344
    iput-boolean v1, p0, Ll/᩻ܰᩴ;->ܽ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩻ܰᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩻ܰᩴ;->᩸:Z

    return p0
.end method

.method public static bridge synthetic ۗ(Ll/᩻ܰᩴ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->᩵:Ljava/lang/String;

    return-object p0
.end method

.method public static ۙ(Ll/᩻ܰᩴ;Ljava/lang/String;Ll/۫ۘᩴ;)Ljava/util/ArrayList;
    .locals 11

    .line 563
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "built-in"

    .line 564
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 565
    invoke-static {}, Ll/ۙᩴۧ;->ۧۙ()[I

    move-result-object p0

    array-length p1, p0

    :goto_0
    if-ge v2, p1, :cond_6

    aget p2, p0, v2

    .line 566
    new-instance v1, Ll/᩷ܰᩴ;

    invoke-static {p2}, Ll/֨᩺ᩴ;->ۙ(I)Ll/֨᩺ᩴ;

    move-result-object p2

    invoke-direct {v1, p2}, Ll/᩷ܰᩴ;-><init>(Ll/֨᩺ᩴ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 569
    :cond_0
    iget-object v1, p0, Ll/᩻ܰᩴ;->ᩴ:Ll/᩵ۘᩴ;

    invoke-virtual {v1, p1}, Ll/᩵ۘᩴ;->ۙ(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 570
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 571
    invoke-static {}, Ll/ۚۘᩴ;->ۙ()Ll/ۚۘᩴ;

    move-result-object v1

    .line 572
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۘᩴ;

    .line 573
    new-instance v3, Ll/᩷ܰᩴ;

    invoke-virtual {v1, p2, v2}, Ll/ۚۘᩴ;->ۙ(Ll/۫ۘᩴ;Ll/ܺۛᩴ;)I

    move-result v4

    .line 574
    invoke-virtual {v1, p2, v2}, Ll/ۚۘᩴ;->᩷(Ll/۫ۘᩴ;Ll/ܺۛᩴ;)I

    move-result v5

    invoke-direct {v3, p0, v2, v4, v5}, Ll/᩷ܰᩴ;-><init>(Landroid/content/pm/PackageManager;Ll/ܽۘᩴ;II)V

    .line 573
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 577
    :cond_1
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object p0

    .line 578
    new-instance p1, Ll/ۛۘᩴ;

    invoke-direct {p1, p0}, Ll/ۛۘᩴ;-><init>(Ljava/text/Collator;)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 593
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p1, p0, [Z

    const/4 p2, 0x0

    :goto_2
    add-int/lit8 v1, p0, -0x1

    if-ge p2, v1, :cond_6

    .line 595
    aget-boolean v1, p1, p2

    if-eqz v1, :cond_2

    goto :goto_4

    .line 597
    :cond_2
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ܰᩴ;

    .line 599
    iget-object v2, v1, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    invoke-virtual {v2}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v3, p2, 0x1

    const/4 v4, 0x0

    :goto_3
    const/16 v5, 0x29

    const-string v6, "\n("

    if-ge v3, p0, :cond_4

    .line 601
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩷ܰᩴ;

    .line 602
    iget-object v8, v7, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    iget-object v9, v7, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    iget-object v10, v1, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 603
    invoke-virtual {v9}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    .line 604
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v7, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v7, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    const/4 v4, 0x1

    .line 605
    aput-boolean v4, p1, v3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_5

    .line 611
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v1, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Ll/᩷ܰᩴ;->ۙ:Ll/ܽۘᩴ;

    invoke-virtual {v3}, Ll/ܽۘᩴ;->ᩴ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/᩷ܰᩴ;->ᩴ:Ljava/lang/String;

    :cond_5
    :goto_4
    add-int/lit8 p2, p2, 0x1

    goto/16 :goto_2

    :cond_6
    return-object v0
.end method

.method public static ۙ(Ll/ܽ֡֫;)Ll/᩻ܰᩴ;
    .locals 3

    .line 122
    sget-object v0, Ll/ۛۨᩴ;->ᩴ:Ll/᩷ۨᩴ;

    const-string v1, "a.apk"

    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 250
    new-instance v1, Ll/᩻ܰᩴ;

    const-string v2, "application/vnd.android.package-archive"

    invoke-static {p0, v0, v2}, Ll/᩵ۘᩴ;->ۙ(Ll/ܽ֡֫;Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩵ۘᩴ;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Ll/᩻ܰᩴ;-><init>(Ll/ܽ֡֫;Ll/᩵ۘᩴ;)V

    const-string p0, "default"

    .line 251
    iput-object p0, v1, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    const/4 p0, 0x1

    .line 252
    iput-boolean p0, v1, Ll/᩻ܰᩴ;->ܶ:Z

    .line 253
    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܶۙ()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Ll/᩻ܰᩴ;->᩵:Ljava/lang/String;

    const p0, 0x7f0a0268

    .line 254
    iget-object v0, v1, Ll/᩻ܰᩴ;->᩷:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    const/4 v2, 0x4

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    const p0, 0x7f0a0535

    .line 255
    invoke-virtual {v0, p0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    return-object v1
.end method

.method private ۙ()V
    .locals 8

    .line 361
    iget-boolean v0, p0, Ll/᩻ܰᩴ;->ܶ:Z

    const v1, 0x7f120c6e

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "built-in"

    const v2, 0x7f120c6b

    .line 364
    invoke-direct {p0, v2, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    .line 365
    iget-boolean v0, p0, Ll/᩻ܰᩴ;->ܽ:Z

    if-eqz v0, :cond_1

    const-string v0, "default"

    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    :cond_1
    const-string v0, "text/*"

    const v1, 0x7f120c6f

    .line 366
    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    const-string v0, "image/*"

    const v1, 0x7f120c6d

    .line 367
    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    const-string v0, "video/*"

    const v1, 0x7f120c70

    .line 368
    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    const-string v0, "audio/*"

    const v1, 0x7f120c6a

    .line 369
    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    const-string v0, "*/*"

    const v1, 0x7f120c69

    .line 370
    invoke-direct {p0, v1, v0}, Ll/᩻ܰᩴ;->ۙ(ILjava/lang/String;)V

    .line 372
    :goto_0
    new-instance v0, Ll/۠ۘᩴ;

    invoke-direct {v0, p0}, Ll/۠ۘᩴ;-><init>(Ll/᩻ܰᩴ;)V

    iget-object v1, p0, Ll/᩻ܰᩴ;->ۨ:Ll/۬ܿ᩻;

    invoke-virtual {v1, v0}, Ll/ܳۜ᩷;->ۙ(Ll/ۛ۠᩷;)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 402
    :goto_1
    iget-object v4, p0, Ll/᩻ܰᩴ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v2, v5, :cond_3

    .line 403
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ܰᩴ;

    iget-object v4, v4, Ll/֫ܰᩴ;->֫:Ljava/lang/String;

    iget-object v5, p0, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v3, v2

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 406
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v5, 0x1

    sub-int/2addr v2, v5

    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܳۜ᩷;->ᩴ(I)V

    .line 407
    invoke-virtual {v1, v3, v0}, Ll/ܳۜ᩷;->ۙ(IZ)V

    .line 408
    iget-object v2, p0, Ll/᩻ܰᩴ;->᩹:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v2, v1}, Lcom/google/android/material/tabs/TabLayout;->setupWithViewPager(Ll/ܳۜ᩷;)V

    .line 410
    invoke-virtual {v2}, Lcom/google/android/material/tabs/TabLayout;->clearOnTabSelectedListeners()V

    .line 411
    new-instance v6, Ll/ۜۘᩴ;

    invoke-direct {v6, p0, v1}, Ll/ۜۘᩴ;-><init>(Ll/᩻ܰᩴ;Ll/ܳۜ᩷;)V

    invoke-virtual {v2, v6}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 419
    iget-boolean v6, p0, Ll/᩻ܰᩴ;->ܶ:Z

    const/16 v7, 0x8

    if-eqz v6, :cond_4

    const/16 v6, 0x8

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 420
    iget-boolean v2, p0, Ll/᩻ܰᩴ;->ܶ:Z

    xor-int/2addr v2, v5

    invoke-virtual {v1, v2}, Ll/۬ܿ᩻;->ۙ(Z)V

    .line 421
    new-instance v2, Ll/۬ۘᩴ;

    invoke-direct {v2, p0}, Ll/۬ۘᩴ;-><init>(Ll/᩻ܰᩴ;)V

    invoke-virtual {v1, v2}, Ll/ܳۜ᩷;->ۙ(Ll/ۙۜ᩷;)V

    .line 433
    iget-object v1, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {v1}, Ll/۠ۖۧ;->ۚ()V

    .line 434
    invoke-virtual {v1}, Ll/۠ۖۧ;->ۤ()Landroid/widget/Button;

    move-result-object v1

    .line 435
    iget-boolean v2, p0, Ll/᩻ܰᩴ;->ܶ:Z

    if-nez v2, :cond_6

    iget-object v2, p0, Ll/᩻ܰᩴ;->ᩴ:Ll/᩵ۘᩴ;

    invoke-virtual {v2}, Ll/᩵ۘᩴ;->᩷()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 436
    sget-object v2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v6, "show_install_file_transfer"

    invoke-interface {v2, v6, v0}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 437
    new-instance v0, Ll/ܿۘᩴ;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0}, Ll/ܿۘᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    .line 439
    :cond_5
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 440
    invoke-direct {p0, v5}, Ll/᩻ܰᩴ;->ۙ(Z)V

    goto :goto_3

    .line 443
    :cond_6
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 445
    :goto_3
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ܰᩴ;

    invoke-virtual {v0}, Ll/֫ܰᩴ;->ۙ()V

    return-void
.end method

.method private ۙ(ILjava/lang/String;)V
    .locals 1

    .line 449
    new-instance v0, Ll/֫ܰᩴ;

    invoke-direct {v0, p0, p2, p1}, Ll/֫ܰᩴ;-><init>(Ll/᩻ܰᩴ;Ljava/lang/String;I)V

    iget-object p1, p0, Ll/᩻ܰᩴ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic ۙ(Ll/֫ᩴۧ;Ll/᩻ܰᩴ;)V
    .locals 2

    .line 230
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "dsai"

    invoke-interface {v0, v1}, Ll/ᩳ֫ܺ;->remove(Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    .line 231
    invoke-virtual {p0}, Ll/֫ᩴۧ;->۟()V

    .line 232
    iget-object p0, p1, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {p0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public static ۙ(Ll/۠ۨܳ;Ll/ۖۗܳ;Z)V
    .locals 4

    .line 104
    invoke-virtual {p0}, Ll/۠ۨܳ;->ܺ()Ll/ۜ᩵ܳ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۜ᩵ܳ;->᩷(Ll/ۖۗܳ;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 105
    invoke-virtual {p0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object v1

    .line 241
    new-instance v2, Ll/᩻ܰᩴ;

    invoke-interface {p1}, Ll/ۖۗܳ;->᩺ۙ()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v0, v3}, Ll/᩵ۘᩴ;->ۙ(Ll/ܽ֡֫;Ll/᩷ۨᩴ;Ljava/lang/String;)Ll/᩵ۘᩴ;

    move-result-object v0

    invoke-direct {v2, v1, v0}, Ll/᩻ܰᩴ;-><init>(Ll/ܽ֡֫;Ll/᩵ۘᩴ;)V

    .line 242
    invoke-interface {p1}, Ll/ۖۗܳ;->ۛۙ()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Ll/᩻ܰᩴ;->᩵:Ljava/lang/String;

    const/4 v0, 0x1

    .line 243
    iput-boolean v0, v2, Ll/᩻ܰᩴ;->ۗ:Z

    .line 106
    new-instance v1, Ll/ᩳۘᩴ;

    invoke-direct {v1, p0, p1}, Ll/ᩳۘᩴ;-><init>(Ll/۠ۨܳ;Ll/ۖۗܳ;)V

    iput-object v1, v2, Ll/᩻ܰᩴ;->ۚ:Ll/ܳܰᩴ;

    if-eqz p2, :cond_0

    const-string p0, "built-in"

    .line 154
    iput-object p0, v2, Ll/᩻ܰᩴ;->۫:Ljava/lang/String;

    .line 155
    iget-object p0, v2, Ll/᩻ܰᩴ;->ᩴ:Ll/᩵ۘᩴ;

    invoke-virtual {p0}, Ll/᩵ۘᩴ;->ۙ()Ljava/lang/String;

    move-result-object p0

    const-string p1, "*/*"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v0

    iput-boolean p0, v2, Ll/᩻ܰᩴ;->ܽ:Z

    .line 157
    :cond_0
    invoke-direct {v2}, Ll/᩻ܰᩴ;->ۙ()V

    return-void
.end method

.method public static ۙ(Ll/۠ۨܳ;Ll/᩷ۨᩴ;)V
    .locals 2

    .line 161
    invoke-virtual {p0}, Ll/۠ۨܳ;->᩹()Lbin/mt/plus/Main;

    move-result-object p0

    .line 162
    invoke-static {p0}, Ll/᩻ܰᩴ;->ۙ(Ll/ܽ֡֫;)Ll/᩻ܰᩴ;

    move-result-object v0

    const/4 v1, 0x1

    .line 163
    iput-boolean v1, v0, Ll/᩻ܰᩴ;->ۗ:Z

    .line 164
    new-instance v1, Ll/֨ۘᩴ;

    invoke-direct {v1, p1, p0}, Ll/֨ۘᩴ;-><init>(Ll/᩷ۨᩴ;Lbin/mt/plus/Main;)V

    iput-object v1, v0, Ll/᩻ܰᩴ;->ۚ:Ll/ܳܰᩴ;

    .line 193
    invoke-direct {v0}, Ll/᩻ܰᩴ;->ۙ()V

    return-void
.end method

.method public static ۙ(Ll/ܽ֡֫;Ll/֫ᩴۧ;)V
    .locals 4

    .line 197
    invoke-static {p0}, Ll/᩻ܰᩴ;->ۙ(Ll/ܽ֡֫;)Ll/᩻ܰᩴ;

    move-result-object v0

    .line 198
    iget-object v1, v0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    const v2, 0x7f120a73

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    const/4 v3, -0x3

    invoke-virtual {v1, v3, p0, v2}, Ll/۠ۖۧ;->ۙ(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 199
    iget-object p0, v0, Ll/᩻ܰᩴ;->᩷:Landroid/view/View;

    const v2, 0x7f0a0681

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f12021f

    .line 200
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    const v2, 0x7f0a02c2

    .line 201
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v2, 0x7f120220

    .line 202
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setText(I)V

    const/4 v2, 0x0

    .line 203
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 204
    new-instance p0, Ll/ۡۘᩴ;

    invoke-direct {p0, p1}, Ll/ۡۘᩴ;-><init>(Ll/֫ᩴۧ;)V

    iput-object p0, v0, Ll/᩻ܰᩴ;->ۚ:Ll/ܳܰᩴ;

    .line 226
    invoke-direct {v0}, Ll/᩻ܰᩴ;->ۙ()V

    .line 227
    invoke-virtual {v1}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object p0

    .line 228
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v2, "dsai"

    invoke-interface {v1, v2}, Ll/ۢ֫ܺ;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 229
    new-instance v1, Ll/ۨۘᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, v0}, Ll/ۨۘᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    const/16 p1, 0x8

    .line 235
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩻ܰᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 437
    invoke-direct {p0, v0}, Ll/᩻ܰᩴ;->ۙ(Z)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩻ܰᩴ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩻ܰᩴ;->֫:I

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/᩻ܰᩴ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻ܰᩴ;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ۙ(Ll/᩻ܰᩴ;Ll/ۡۧۙ;)V
    .locals 1

    .line 322
    sget-object v0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    if-ne p1, v0, :cond_0

    iget-object p0, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {p0}, Ll/۠ۖۧ;->dismiss()V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/᩻ܰᩴ;Ll/ܽ֡֫;Ll/ܰۘᩴ;Ll/ۡۧۙ;)V
    .locals 1

    .line 326
    sget-object v0, Ll/ۡۧۙ;->ᩳ:Ll/ۡۧۙ;

    if-ne p3, v0, :cond_1

    .line 453
    iget-boolean p3, p0, Ll/᩻ܰᩴ;->᩸:Z

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    .line 454
    iput-boolean p3, p0, Ll/᩻ܰᩴ;->᩸:Z

    .line 455
    invoke-static {p0}, Ll/ᩴܰᩴ;->ۙ(Ll/᩻ܰᩴ;)V

    .line 328
    :goto_0
    invoke-virtual {p1}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p0

    invoke-virtual {p0, p2}, Ll/۠ۧۙ;->᩷(Ll/᩷᩻ۙ;)V

    :cond_1
    return-void
.end method

.method private ۙ(Z)V
    .locals 3

    .line 616
    sget v0, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v0, Ll/ۖۖۧ;

    iget-object v1, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    invoke-direct {v0, v1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1204c0

    .line 617
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    const v1, 0x7f1204e5

    .line 618
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v1, Ll/᩷֫᩸;

    const/4 v2, 0x1

    invoke-direct {v1, v2, p0}, Ll/᩷֫᩸;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f1204e2

    .line 619
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120161

    const/4 v2, 0x0

    .line 633
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    if-eqz p1, :cond_0

    .line 635
    new-instance p1, Ll/֡ۘᩴ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const v1, 0x7f120c41

    invoke-virtual {v0, v1, p1}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 637
    :cond_0
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public static ۙ(Ll/᩻ܰᩴ;Ll/ۜܿ᩻;ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    .line 309
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result p2

    if-nez p2, :cond_1

    .line 310
    invoke-virtual {p1}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    .line 242
    invoke-virtual {p1, p0}, Ll/ۜܿ᩻;->ۙ(Ljava/lang/String;)V

    .line 312
    invoke-virtual {p1}, Ll/ۜܿ᩻;->᩷()V

    return v0

    .line 314
    :cond_0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {p0}, Ll/۠ۖۧ;->cancel()V

    :cond_1
    return v0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۚ(Ll/᩻ܰᩴ;)Ll/۠ۖۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    return-object p0
.end method

.method public static ۛ(Ll/᩻ܰᩴ;)V
    .locals 3

    .line 460
    iget-boolean v0, p0, Ll/᩻ܰᩴ;->᩸:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/᩻ܰᩴ;->ܶ:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/᩻ܰᩴ;->᩻:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩻ܰᩴ;->ܺ:Ll/֫ܰᩴ;

    if-nez v0, :cond_1

    iget v0, p0, Ll/᩻ܰᩴ;->֫:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 462
    iput-boolean v0, p0, Ll/᩻ܰᩴ;->᩻:Z

    .line 463
    iget-object v0, p0, Ll/᩻ܰᩴ;->ۨ:Ll/۬ܿ᩻;

    new-instance v1, Ll/۠۠ۧ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/۠۠ۧ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۤ(Ll/᩻ܰᩴ;)V
    .locals 3

    const-string v0, "filetransfer.apk"

    .line 621
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    :try_start_0
    sget-object v1, Ll/ۛۨᩴ;->ۚ:Ll/᩷ۨᩴ;

    invoke-virtual {v1, v0}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 622
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩷ۨᩴ;->ۙ(Ljava/io/InputStream;)V

    .line 623
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->᩺᩷()Landroid/net/Uri;

    move-result-object v0

    .line 624
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "application/vnd.android.package-archive"

    .line 625
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    .line 626
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 627
    invoke-static {v1, v0}, Ll/֨ۤ۫;->ۙ(Landroid/content/Intent;Landroid/net/Uri;)V

    .line 628
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {p0, v0, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩻ܰᩴ;)Ll/᩵ۘᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ᩴ:Ll/᩵ۘᩴ;

    return-object p0
.end method

.method public static bridge synthetic ۨ(Ll/᩻ܰᩴ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/᩻ܰᩴ;->ܺ:Ll/֫ܰᩴ;

    return-void
.end method

.method public static bridge synthetic ۫(Ll/᩻ܰᩴ;)Ll/ܽ֡֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    return-object p0
.end method

.method public static synthetic ܳ(Ll/᩻ܰᩴ;)V
    .locals 3

    const/4 v0, 0x0

    .line 464
    iput-boolean v0, p0, Ll/᩻ܰᩴ;->᩻:Z

    .line 465
    iget-boolean v0, p0, Ll/᩻ܰᩴ;->᩸:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/᩻ܰᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩻ܰᩴ;->ܺ:Ll/֫ܰᩴ;

    if-nez v0, :cond_2

    iget v0, p0, Ll/᩻ܰᩴ;->֫:I

    if-eqz v0, :cond_0

    goto :goto_0

    .line 467
    :cond_0
    iget-object v0, p0, Ll/᩻ܰᩴ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ܰᩴ;

    .line 469
    iget-boolean v2, v1, Ll/֫ܰᩴ;->᩸:Z

    if-nez v2, :cond_1

    iget-boolean v2, v1, Ll/֫ܰᩴ;->ᩴ:Z

    if-nez v2, :cond_1

    iget-boolean v2, v1, Ll/֫ܰᩴ;->ۤ:Z

    if-nez v2, :cond_1

    .line 470
    iput-object v1, p0, Ll/᩻ܰᩴ;->ܺ:Ll/֫ܰᩴ;

    .line 471
    invoke-virtual {v1}, Ll/֫ܰᩴ;->ۙ()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ܶ(Ll/᩻ܰᩴ;)Ll/֫ܰᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ܺ:Ll/֫ܰᩴ;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/᩻ܰᩴ;)Ll/ܳܰᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۚ:Ll/ܳܰᩴ;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/᩻ܰᩴ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static ᩴ(Ll/᩻ܰᩴ;)V
    .locals 1

    .line 453
    iget-boolean v0, p0, Ll/᩻ܰᩴ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 454
    iput-boolean v0, p0, Ll/᩻ܰᩴ;->᩸:Z

    .line 455
    invoke-static {p0}, Ll/ᩴܰᩴ;->ۙ(Ll/᩻ܰᩴ;)V

    return-void
.end method

.method public static bridge synthetic ᩵(Ll/᩻ܰᩴ;)Ll/۬ܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ۨ:Ll/۬ܿ᩻;

    return-object p0
.end method

.method public static synthetic ᩷(Ll/᩻ܰᩴ;)V
    .locals 2

    .line 355
    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    const-class v1, Ll/ܳۘᩴ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 356
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static ᩸(Ll/᩻ܰᩴ;)V
    .locals 3

    .line 349
    iget-object v0, p0, Ll/᩻ܰᩴ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {v0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v1, 0x7f120451

    .line 350
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    const v1, 0x7f1208d2

    .line 351
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(I)V

    const v1, 0x7f12018c

    const/4 v2, 0x0

    .line 352
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f1208d4

    .line 353
    invoke-virtual {v0, v1, v2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 354
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/۟ۘᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/۟ۘᩴ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static bridge synthetic ᩹(Ll/᩻ܰᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/᩻ܰᩴ;->ۗ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/᩻ܰᩴ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩻ܰᩴ;->ܳ:Ljava/lang/String;

    return-object p0
.end method
