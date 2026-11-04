.class public abstract Ll/ܺۢܳ;
.super Ljava/lang/Object;
.source "QB4F"


# instance fields
.field public ֡:Landroid/widget/TextView;

.field public ֫:Ljava/lang/String;

.field public ۗ:Landroid/widget/Spinner;

.field public ۘ:Ll/᩻ۢܳ;

.field public ۙ:Ll/ܽ֡֫;

.field public ۚ:Ll/᩹ۖ᩸;

.field public ۛ:Landroid/widget/TextView;

.field public ۟:Landroid/widget/Spinner;

.field public ۢ:[Ljava/lang/String;

.field public ۤ:Ll/֨ܶ;

.field public final ۧ:[Ll/᩻ۢܳ;

.field public ۨ:Ll/᩹ۖ᩸;

.field public ۫:Ljava/lang/String;

.field public ܰ:[Ljava/lang/String;

.field public ܳ:Ll/֨ܶ;

.field public final ܶ:Ljava/util/ArrayList;

.field public ܺ:Ll/ܺۧᩴ;

.field public ܽ:Ll/ۗ֡᩻;

.field public ܿ:Ll/᩹ۖ᩸;

.field public ᩳ:Landroid/widget/Spinner;

.field public ᩴ:Ll/۠ۖۧ;

.field public ᩵:[Ljava/lang/String;

.field public ᩶:Z

.field public ᩷:Ll/֨ܶ;

.field public ᩸:Ll/֨ܶ;

.field public ᩹:Landroid/widget/TextView;

.field public ᩺:Ll/֫ۖ᩸;

.field public ᩻:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>(Ll/ܽ֡֫;)V
    .locals 9

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xd

    new-array v0, v0, [Ll/᩻ۢܳ;

    .line 63
    sget-object v1, Ll/᩻ۢܳ;->᩸ۙ:Ll/᩻ۢܳ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/᩻ۢܳ;->ۡ:Ll/᩻ۢܳ;

    const/4 v3, 0x1

    aput-object v1, v0, v3

    sget-object v1, Ll/᩻ۢܳ;->ۖ:Ll/᩻ۢܳ;

    const/4 v4, 0x2

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->ۜ:Ll/᩻ۢܳ;

    const/4 v4, 0x3

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->ۙۙ:Ll/᩻ۢܳ;

    const/4 v4, 0x4

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->᩷ۙ:Ll/᩻ۢܳ;

    const/4 v4, 0x5

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->۠:Ll/᩻ۢܳ;

    const/4 v4, 0x6

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->۬:Ll/᩻ۢܳ;

    const/4 v4, 0x7

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->ۢ:Ll/᩻ۢܳ;

    const/16 v4, 0x8

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->ۤۙ:Ll/᩻ۢܳ;

    const/16 v4, 0x9

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->ᩴۙ:Ll/᩻ۢܳ;

    const/16 v4, 0xa

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->ᩳ:Ll/᩻ۢܳ;

    const/16 v4, 0xb

    aput-object v1, v0, v4

    sget-object v1, Ll/᩻ۢܳ;->֨:Ll/᩻ۢܳ;

    const/16 v4, 0xc

    aput-object v1, v0, v4

    iput-object v0, p0, Ll/ܺۢܳ;->ۧ:[Ll/᩻ۢܳ;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܺۢܳ;->ܶ:Ljava/util/ArrayList;

    .line 74
    iput-object p1, p0, Ll/ܺۢܳ;->ۙ:Ll/ܽ֡֫;

    const v1, 0x7f0d008f

    .line 75
    invoke-virtual {p1, v1}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v1

    .line 76
    invoke-virtual {v1, v3}, Landroid/view/View;->setKeepScreenOn(Z)V

    const v4, 0x7f0a0186

    .line 77
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/᩹ۖ᩸;

    iput-object v4, p0, Ll/ܺۢܳ;->ۚ:Ll/᩹ۖ᩸;

    const v4, 0x7f0a05a2

    .line 78
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    iput-object v4, p0, Ll/ܺۢܳ;->᩻:Landroid/widget/Spinner;

    const v4, 0x7f0a0641

    .line 79
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, p0, Ll/ܺۢܳ;->᩹:Landroid/widget/TextView;

    const v4, 0x7f0a05a4

    .line 80
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    iput-object v4, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    const v5, 0x7f0a0643

    .line 81
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iput-object v5, p0, Ll/ܺۢܳ;->ۛ:Landroid/widget/TextView;

    const v5, 0x7f0a061e

    .line 82
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Ll/֫ۖ᩸;

    iput-object v5, p0, Ll/ܺۢܳ;->᩺:Ll/֫ۖ᩸;

    const v6, 0x7f0a0187

    .line 83
    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/᩹ۖ᩸;

    iput-object v6, p0, Ll/ܺۢܳ;->ۨ:Ll/᩹ۖ᩸;

    const v7, 0x7f0a0645

    .line 84
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, p0, Ll/ܺۢܳ;->֡:Landroid/widget/TextView;

    const v7, 0x7f0a0188

    .line 85
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/᩹ۖ᩸;

    iput-object v7, p0, Ll/ܺۢܳ;->ܿ:Ll/᩹ۖ᩸;

    const v7, 0x7f0a05a5

    .line 86
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Spinner;

    iput-object v7, p0, Ll/ܺۢܳ;->۟:Landroid/widget/Spinner;

    const v7, 0x7f0a05a6

    .line 87
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/Spinner;

    iput-object v7, p0, Ll/ܺۢܳ;->ᩳ:Landroid/widget/Spinner;

    const v7, 0x7f0a05c5

    .line 88
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/֨ܶ;

    iput-object v7, p0, Ll/ܺۢܳ;->ܳ:Ll/֨ܶ;

    const v7, 0x7f0a05c6

    .line 89
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/֨ܶ;

    iput-object v7, p0, Ll/ܺۢܳ;->᩸:Ll/֨ܶ;

    const v7, 0x7f0a05c7

    .line 90
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/֨ܶ;

    iput-object v7, p0, Ll/ܺۢܳ;->᩷:Ll/֨ܶ;

    const v7, 0x7f0a05c8

    .line 91
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ll/֨ܶ;

    iput-object v7, p0, Ll/ܺۢܳ;->ۤ:Ll/֨ܶ;

    .line 92
    invoke-virtual {p1}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f030028

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Ll/ܺۢܳ;->ۢ:[Ljava/lang/String;

    .line 93
    array-length v8, v7

    sub-int/2addr v8, v3

    invoke-static {v7, v2, v8}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [Ljava/lang/String;

    iput-object v8, p0, Ll/ܺۢܳ;->ܰ:[Ljava/lang/String;

    .line 94
    array-length v8, v7

    sub-int/2addr v8, v3

    invoke-static {v7, v3, v8}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    iput-object v3, p0, Ll/ܺۢܳ;->᩵:[Ljava/lang/String;

    .line 95
    invoke-static {v0, v7}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 96
    new-instance v3, Ll/ۗ֡᩻;

    invoke-direct {v3, p1, v0}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v3, p0, Ll/ܺۢܳ;->ܽ:Ll/ۗ֡᩻;

    .line 97
    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 98
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v3, 0x7f1201e7

    .line 99
    invoke-virtual {v0, v3}, Ll/ۖۖۧ;->᩷(I)V

    .line 100
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(Landroid/view/View;)V

    const v1, 0x7f1208c9

    const/4 v3, 0x0

    .line 101
    invoke-virtual {v0, v1, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120161

    .line 102
    invoke-virtual {v0, v1, v3}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 103
    invoke-virtual {v0, v2}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 104
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object v0

    iput-object v0, p0, Ll/ܺۢܳ;->ᩴ:Ll/۠ۖۧ;

    .line 105
    invoke-static {v0}, Ll/᩶ۢᩴ;->ۙ(Ll/۠ۖۧ;)V

    const/4 v0, -0x1

    .line 106
    invoke-virtual {v5, v0}, Ll/֫ۖ᩸;->᩷(I)V

    const v0, 0x7f08023e

    .line 107
    invoke-virtual {v5, v0}, Ll/֫ۖ᩸;->ۙ(I)V

    .line 108
    new-instance v0, Ll/᩷ۢۤ;

    invoke-direct {v0, p0, p1}, Ll/᩷ۢۤ;-><init>(Ll/ܺۢܳ;Ll/ܽ֡֫;)V

    invoke-virtual {v5, v0}, Ll/֫ۖ᩸;->ۙ(Landroid/view/View$OnClickListener;)V

    .line 125
    new-instance p1, Ll/ᩴۢܳ;

    invoke-direct {p1, p0}, Ll/ᩴۢܳ;-><init>(Ll/ܺۢܳ;)V

    invoke-virtual {v6, p1}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺۢܳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static bridge synthetic ۗ(Ll/ܺۢܳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->۟:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static synthetic ۙ(Ll/ܺۢܳ;)V
    .locals 1

    .line 197
    invoke-direct {p0}, Ll/ܺۢܳ;->᩹()V

    .line 198
    iget-object p0, p0, Ll/ܺۢܳ;->᩻:Landroid/widget/Spinner;

    invoke-virtual {p0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object p0

    instance-of v0, p0, Landroid/widget/BaseAdapter;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/BaseAdapter;

    .line 199
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ܺۢܳ;Ljava/util/List;I)V
    .locals 0

    .line 117
    iget-object p0, p0, Ll/ܺۢܳ;->ۨ:Ll/᩹ۖ᩸;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۘܳ;

    .line 210
    iget-object p1, p1, Ll/ܰۘܳ;->᩷:Ljava/lang/String;

    .line 117
    invoke-virtual {p0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܺۢܳ;Ll/ܽ֡֫;)V
    .locals 5

    .line 109
    invoke-static {}, Ll/᩶ۘܳ;->ۤ()Ljava/util/List;

    move-result-object v0

    .line 110
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 111
    new-instance p0, Landroid/content/Intent;

    const-class v0, Ll/ۛۘܳ;

    invoke-direct {p0, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 112
    invoke-virtual {p1, p0}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void

    .line 115
    :cond_0
    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/۟᩹ۧ;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Ll/۟᩹ۧ;-><init>(I)V

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->map(Ljava/util/function/Function;)Ll/᩵ܺۗ;

    move-result-object v1

    new-instance v2, Ll/ᩳ᩹᩸;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ll/ᩳ᩹᩸;-><init>(I)V

    invoke-interface {v1, v2}, Ll/᩵ܺۗ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/CharSequence;

    .line 116
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v2

    const v3, 0x7f1201a8

    invoke-virtual {v2, v3}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v3, Ll/ۗۡۤ;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p0, v0}, Ll/ۗۡۤ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    invoke-virtual {v2, v1, v3}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12018c

    const/4 v0, 0x0

    .line 118
    invoke-virtual {v2, p0, v0}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p0, Ll/۫᩶ۤ;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Ll/۫᩶ۤ;-><init>(ILjava/lang/Object;)V

    const p1, 0x7f1201ab

    .line 119
    invoke-virtual {v2, p1, p0}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 123
    invoke-virtual {v2}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void
.end method

.method public static ۙ(Ll/ܺۢܳ;Z)V
    .locals 8

    .line 386
    iget-object v0, p0, Ll/ܺۢܳ;->᩵:[Ljava/lang/String;

    iget-object v1, p0, Ll/ܺۢܳ;->ܶ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    iget-object v3, p0, Ll/ܺۢܳ;->ܳ:Ll/֨ܶ;

    iget-object v4, p0, Ll/ܺۢܳ;->᩻:Landroid/widget/Spinner;

    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v5}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v5

    iget-object v6, p0, Ll/ܺۢܳ;->ۤ:Ll/֨ܶ;

    .line 387
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    const-string v7, "dcaw"

    invoke-interface {v5, v7, v6}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object v5

    iget-object v6, p0, Ll/ܺۢܳ;->᩸:Ll/֨ܶ;

    .line 388
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    const-string v7, "dcds"

    invoke-interface {v5, v7, v6}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object v5

    .line 389
    invoke-interface {v5}, Ll/ᩳ֫ܺ;->apply()V

    .line 391
    sget-object v5, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v5}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v5

    const-string v6, "ccef"

    const-string v7, "ccsa2"

    if-eqz p1, :cond_1

    .line 392
    invoke-virtual {p0}, Ll/ܺۢܳ;->ۤ()Ll/᩻ۢܳ;

    move-result-object p0

    iget-boolean p0, p0, Ll/᩻ۢܳ;->ܿ:Z

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    .line 393
    invoke-interface {v5, v7, p0}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p0

    const-string p1, "ccf2"

    .line 394
    invoke-virtual {v4}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v4

    invoke-interface {p0, v4, p1}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 426
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    .line 427
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    array-length v0, v0

    if-ne v1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    :cond_0
    const-string v0, "ccl2"

    .line 395
    invoke-interface {p0, p1, v0}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 396
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-interface {p0, v6, p1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 397
    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void

    :cond_1
    if-eqz p1, :cond_2

    const/4 p0, 0x0

    .line 400
    invoke-interface {v5, v7, p0}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    :cond_2
    const-string p0, "ccf"

    .line 402
    invoke-virtual {v4}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    invoke-interface {v5, p1, p0}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 426
    invoke-virtual {v2}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result p1

    .line 427
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    array-length v0, v0

    if-ne v1, v0, :cond_3

    add-int/lit8 p1, p1, 0x1

    :cond_3
    const-string v0, "ccl"

    .line 403
    invoke-interface {p0, p1, v0}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 404
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    invoke-interface {p0, v6, p1}, Ll/ᩳ֫ܺ;->putBoolean(Ljava/lang/String;Z)Ll/ᩳ֫ܺ;

    move-result-object p0

    .line 405
    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method

.method public static ۙ(ILl/᩻ܽܺ;)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v2, 0x2

    if-eq p0, v2, :cond_3

    const/4 v2, 0x4

    if-eq p0, v2, :cond_2

    const/4 v2, 0x5

    if-eq p0, v2, :cond_1

    const/4 v2, 0x6

    if-eq p0, v2, :cond_0

    goto :goto_0

    .line 535
    :cond_0
    invoke-virtual {p1}, Ll/᩻ܽܺ;->ۤ()V

    const/16 p0, 0x8

    goto :goto_2

    :cond_1
    const/16 p0, 0xa

    const/16 v1, 0xa

    goto :goto_0

    :cond_2
    const/16 p0, 0x9

    const/16 v1, 0x9

    goto :goto_0

    :cond_3
    const/4 p0, 0x3

    const/4 v1, 0x3

    :goto_0
    const/16 v0, 0x8

    goto :goto_1

    :cond_4
    const/16 v0, 0x8

    const/4 v1, 0x1

    :cond_5
    :goto_1
    const/4 p0, 0x0

    move p0, v0

    const/4 v0, 0x0

    .line 539
    :goto_2
    invoke-virtual {p1, v1}, Ll/᩻ܽܺ;->ۙ(I)V

    .line 540
    invoke-virtual {p1, p0}, Ll/᩻ܽܺ;->᩷(I)V

    return v0
.end method

.method public static bridge synthetic ۚ(Ll/ܺۢܳ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->᩹:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic ۛ(Ll/ܺۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܺۢܳ;->᩹()V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ܺۢܳ;)Ll/֨ܶ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ܳ:Ll/֨ܶ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺۢܳ;)[Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->᩵:[Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۨ(Ll/ܺۢܳ;)[Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ۢ:[Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/ܺۢܳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ܶ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ܺۢܳ;)Ll/ۗ֡᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ܽ:Ll/ۗ֡᩻;

    return-object p0
.end method

.method public static bridge synthetic ܶ(Ll/ܺۢܳ;)Ll/᩹ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ܿ:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ܺ(Ll/ܺۢܳ;)Ll/֫ۖ᩸;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->᩺:Ll/֫ۖ᩸;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܺۢܳ;)[Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ܰ:[Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ܺۢܳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->᩻:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static bridge synthetic ᩵(Ll/ܺۢܳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ᩳ:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ܺۢܳ;)Ll/֨ܶ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->᩷:Ll/֨ܶ;

    return-object p0
.end method

.method public static bridge synthetic ᩸(Ll/ܺۢܳ;)[Ll/᩻ۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ۧ:[Ll/᩻ۢܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩹(Ll/ܺۢܳ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->֡:Landroid/widget/TextView;

    return-object p0
.end method

.method private ᩹()V
    .locals 6

    .line 148
    iget-object v0, p0, Ll/ܺۢܳ;->ۚ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 149
    iget-boolean v2, p0, Ll/ܺۢܳ;->᩶:Z

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 151
    iget-object v2, p0, Ll/ܺۢܳ;->ۘ:Ll/᩻ۢܳ;

    iget-boolean v4, v2, Ll/᩻ۢܳ;->ܿ:Z

    if-eqz v4, :cond_0

    .line 152
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Ll/ܺۢܳ;->֫:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll/ܺۢܳ;->ۘ:Ll/᩻ۢܳ;

    iget-object v4, v4, Ll/᩻ۢܳ;->֡:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 154
    :cond_0
    iget-object v2, v2, Ll/᩻ۢܳ;->֡:Ljava/lang/String;

    .line 156
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 157
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v4, v2

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܺۢܳ;->۫:Ljava/lang/String;

    .line 160
    :cond_1
    invoke-virtual {p0}, Ll/ܺۢܳ;->ۤ()Ll/᩻ۢܳ;

    move-result-object v1

    .line 161
    iget-object v2, p0, Ll/ܺۢܳ;->᩷:Ll/֨ܶ;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_4

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 162
    invoke-virtual {v0, v3}, Ll/᩹ۖ᩸;->setEnabled(Z)V

    .line 163
    iget-object v2, p0, Ll/ܺۢܳ;->ۙ:Ll/ܽ֡֫;

    const v3, 0x7f1203a4

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 164
    iget-object v3, p0, Ll/ܺۢܳ;->ܺ:Ll/ܺۧᩴ;

    if-nez v3, :cond_2

    .line 165
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\\A("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ll/ܿܶۤ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/ܺۧᩴ;->ۤ(Ljava/lang/String;)Ll/ۧۧᩴ;

    move-result-object v3

    sget v4, Ll/ۗۡ֫;->ۙ:I

    .line 166
    invoke-virtual {v3, v4}, Ll/ۧۧᩴ;->᩷(I)V

    .line 167
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ۚ᩷()I

    move-result v4

    invoke-virtual {v3, v4}, Ll/ۧۧᩴ;->ۙ(I)V

    .line 168
    invoke-virtual {v3}, Ll/ۧۧᩴ;->ۙ()Ll/ܺۧᩴ;

    move-result-object v3

    iput-object v3, p0, Ll/ܺۢܳ;->ܺ:Ll/ܺۧᩴ;

    .line 170
    :cond_2
    iget-boolean v3, p0, Ll/ܺۢܳ;->᩶:Z

    if-nez v3, :cond_3

    iget-object v3, p0, Ll/ܺۢܳ;->ܺ:Ll/ܺۧᩴ;

    invoke-virtual {v0, v3}, Ll/᩺ۜ᩸;->ۙ(Ll/ܺۧᩴ;)V

    .line 171
    :cond_3
    iput-boolean v5, p0, Ll/ܺۢܳ;->᩶:Z

    .line 0
    invoke-static {v2}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 172
    iget-object v3, v1, Ll/᩻ۢܳ;->֡:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 174
    :cond_4
    iget-boolean v2, p0, Ll/ܺۢܳ;->᩶:Z

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ll/᩺ۜ᩸;->ۙ(Ll/ܺۧᩴ;)V

    .line 175
    :cond_5
    iput-boolean v3, p0, Ll/ܺۢܳ;->᩶:Z

    .line 176
    invoke-virtual {v0, v5}, Ll/᩹ۖ᩸;->setEnabled(Z)V

    .line 177
    iget-boolean v2, v1, Ll/᩻ۢܳ;->ܿ:Z

    if-eqz v2, :cond_6

    .line 178
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Ll/ܺۢܳ;->۫:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll/ܺۢܳ;->֫:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Ll/᩻ۢܳ;->֡:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 180
    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Ll/ܺۢܳ;->۫:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Ll/᩻ۢܳ;->֡:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 182
    :goto_1
    iget-object v2, p0, Ll/ܺۢܳ;->۫:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v3, v2}, Ll/᩹ۖ᩸;->ۧ(II)V

    .line 183
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 185
    :goto_2
    iput-object v1, p0, Ll/ܺۢܳ;->ۘ:Ll/᩻ۢܳ;

    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܺۢܳ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺۢܳ;->ۛ:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 460
    iget-object v0, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public final ۙ()V
    .locals 1

    .line 445
    iget-object v0, p0, Ll/ܺۢܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public final ۙ(IZZ)V
    .locals 12

    .line 190
    iget-boolean v0, p0, Ll/ܺۢܳ;->᩶:Z

    iget-object v1, p0, Ll/ܺۢܳ;->ۚ:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ll/᩺ۜ᩸;->ۙ(Ll/ܺۧᩴ;)V

    :cond_0
    const/4 v0, 0x0

    .line 191
    iput-boolean v0, p0, Ll/ܺۢܳ;->᩶:Z

    .line 192
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Ll/ܺۢܳ;->۫:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ll/᩻ۢܳ;->᩸ۙ:Ll/᩻ۢܳ;

    iput-object v3, p0, Ll/ܺۢܳ;->ۘ:Ll/᩻ۢܳ;

    iget-object v3, v3, Ll/᩻ۢܳ;->֡:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    if-nez p2, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_2

    .line 195
    iget-object v4, p0, Ll/ܺۢܳ;->᩷:Ll/֨ܶ;

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 196
    new-instance v5, Ll/ۙۢܳ;

    invoke-direct {v5, p0}, Ll/ۙۢܳ;-><init>(Ll/ܺۢܳ;)V

    invoke-virtual {v4, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_2
    if-eqz p3, :cond_3

    const/4 p3, 0x0

    goto :goto_1

    :cond_3
    const/16 p3, 0x8

    .line 203
    :goto_1
    iget-object v4, p0, Ll/ܺۢܳ;->ۤ:Ll/֨ܶ;

    invoke-virtual {v4, p3}, Landroid/view/View;->setVisibility(I)V

    .line 204
    sget-object p3, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v5, "dcaw"

    invoke-interface {p3, v5, v0}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    invoke-virtual {v4, p3}, Ll/֨ܶ;->setChecked(Z)V

    .line 205
    sget-object p3, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v4, "dcds"

    invoke-interface {p3, v4, v0}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    iget-object v4, p0, Ll/ܺۢܳ;->᩸:Ll/֨ܶ;

    invoke-virtual {v4, p3}, Ll/֨ܶ;->setChecked(Z)V

    .line 206
    iget-object p3, p0, Ll/ܺۢܳ;->ۙ:Ll/ܽ֡֫;

    invoke-virtual {p3}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f110001

    invoke-virtual {v5, v6, p1}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 207
    new-instance v4, Ll/ܳۢܳ;

    iget-object v8, p0, Ll/ܺۢܳ;->ۙ:Ll/ܽ֡֫;

    iget-object v9, p0, Ll/ܺۢܳ;->ۧ:[Ll/᩻ۢܳ;

    move-object v6, v4

    move-object v7, p0

    move v10, p2

    move v11, p1

    invoke-direct/range {v6 .. v11}, Ll/ܳۢܳ;-><init>(Ll/ܺۢܳ;Landroid/content/Context;[Ll/᩻ۢܳ;ZI)V

    iget-object p1, p0, Ll/ܺۢܳ;->᩻:Landroid/widget/Spinner;

    invoke-virtual {p1, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 239
    new-instance p2, Ll/ۗ֡᩻;

    const v4, 0x7f1200db

    .line 240
    invoke-virtual {p3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v4, 0x7f1200d9

    .line 242
    invoke-virtual {p3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v6, "10 MB"

    const-string v7, "25 MB"

    const-string v8, "50 MB"

    const-string v9, "100 MB"

    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    move-result-object v4

    .line 239
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {p2, p3, v4}, Ll/ۗ֡᩻;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iget-object v4, p0, Ll/ܺۢܳ;->۟:Landroid/widget/Spinner;

    invoke-virtual {v4, p2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 244
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 245
    iget-object v5, p0, Ll/ܺۢܳ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v6

    invoke-virtual {v5, v6}, Ll/᩹ۖ᩸;->setEnabled(Z)V

    .line 246
    new-instance v5, Ll/۫ۢܳ;

    const-string v6, "MB"

    const-string v7, "GB"

    const-string v8, "KB"

    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v5, p3, v6, p2}, Ll/۫ۢܳ;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 252
    iget-object p3, p0, Ll/ܺۢܳ;->ᩳ:Landroid/widget/Spinner;

    invoke-virtual {p3, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 253
    invoke-virtual {p3, v2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 254
    new-instance v6, Ll/᩷ۢܳ;

    invoke-direct {v6, p2}, Ll/᩷ۢܳ;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {p3, v6}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 255
    new-instance p3, Ll/ۚۢܳ;

    invoke-direct {p3, p0, p2, v5}, Ll/ۚۢܳ;-><init>(Ll/ܺۢܳ;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/۫ۢܳ;)V

    invoke-virtual {v4, p3}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 278
    new-instance v6, Ll/֫ۢܳ;

    invoke-direct {v6, p0}, Ll/֫ۢܳ;-><init>(Ll/ܺۢܳ;)V

    if-eqz v3, :cond_4

    .line 366
    sget-object p2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string p3, "ccsa2"

    invoke-interface {p2, p3, v0}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "ccf2"

    const-string p3, "ccl2"

    goto :goto_2

    :cond_4
    const-string p2, "ccf"

    const-string p3, "ccl"

    .line 373
    :goto_2
    invoke-virtual {p1, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 374
    sget-object v4, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v4, p2, v0}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result p2

    .line 375
    iget-object v4, p0, Ll/ܺۢܳ;->ۧ:[Ll/᩻ۢܳ;

    array-length v4, v4

    if-lt p2, v4, :cond_5

    const/4 p2, 0x0

    const/4 v9, 0x0

    goto :goto_3

    :cond_5
    move v9, p2

    .line 378
    :goto_3
    invoke-virtual {p1, v9}, Landroid/widget/AdapterView;->setSelection(I)V

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v7, 0x0

    .line 379
    invoke-virtual/range {v6 .. v11}, Ll/֫ۢܳ;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 380
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const/4 p2, 0x3

    invoke-interface {p1, p3, p2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result p1

    .line 416
    iget-object p2, p0, Ll/ܺۢܳ;->ܶ:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    iget-object v4, p0, Ll/ܺۢܳ;->᩵:[Ljava/lang/String;

    array-length v4, v4

    if-ne p3, v4, :cond_6

    add-int/lit8 p1, p1, -0x1

    .line 437
    :cond_6
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-nez p2, :cond_7

    const/4 p1, 0x0

    goto :goto_4

    :cond_7
    sub-int/2addr p2, v2

    .line 441
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 380
    :goto_4
    iget-object p2, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 381
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string p2, "ccef"

    invoke-interface {p1, p2, v0}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iget-object p2, p0, Ll/ܺۢܳ;->ܳ:Ll/֨ܶ;

    invoke-virtual {p2, p1}, Ll/֨ܶ;->setChecked(Z)V

    .line 382
    invoke-direct {p0}, Ll/ܺۢܳ;->᩹()V

    .line 383
    iget-object p1, p0, Ll/ܺۢܳ;->ᩴ:Ll/۠ۖۧ;

    invoke-virtual {p1}, Ll/۠ۖۧ;->ۚ()V

    .line 384
    invoke-virtual {p1}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p2

    new-instance p3, Ll/ۤۢܳ;

    invoke-direct {p3, p0}, Ll/ۤۢܳ;-><init>(Ll/ܺۢܳ;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 385
    new-instance p2, Ll/᩸ۢܳ;

    invoke-direct {p2, p0, v3}, Ll/᩸ۢܳ;-><init>(Ll/ܺۢܳ;Z)V

    invoke-virtual {p1, p2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 408
    invoke-static {v1}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Ll/ܺۢܳ;->۫:Ljava/lang/String;

    .line 142
    iput-object p2, p0, Ll/ܺۢܳ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ۚ()J
    .locals 7

    .line 551
    iget-object v0, p0, Ll/ܺۢܳ;->ܿ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const-wide/16 v2, -0x1

    if-nez v1, :cond_9

    .line 552
    iget-object v1, p0, Ll/ܺۢܳ;->۟:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    const/4 v4, 0x1

    if-eq v1, v4, :cond_8

    const/4 v5, 0x2

    if-eq v1, v5, :cond_7

    const/4 v6, 0x3

    if-eq v1, v6, :cond_6

    const/4 v6, 0x4

    if-eq v1, v6, :cond_5

    const/4 v6, 0x5

    if-eq v1, v6, :cond_0

    goto :goto_2

    .line 569
    :cond_0
    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 570
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const-wide/16 v0, -0x2

    return-wide v0

    .line 574
    :cond_1
    :try_start_0
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    .line 575
    iget-object v6, p0, Ll/ܺۢܳ;->ᩳ:Landroid/widget/Spinner;

    invoke-virtual {v6}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_4

    if-eq v2, v4, :cond_3

    if-eq v2, v5, :cond_2

    goto :goto_1

    :cond_2
    const-wide/high16 v2, 0x41d0000000000000L    # 1.073741824E9

    goto :goto_0

    :cond_3
    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    goto :goto_0

    :cond_4
    const-wide/high16 v2, 0x4090000000000000L    # 1024.0

    :goto_0
    mul-double v0, v0, v2

    :goto_1
    double-to-long v0, v0

    return-wide v0

    :catch_0
    return-wide v2

    :cond_5
    const-wide/32 v0, 0x6400000

    return-wide v0

    :cond_6
    const-wide/32 v0, 0x3200000

    return-wide v0

    :cond_7
    const-wide/32 v0, 0x1900000

    return-wide v0

    :cond_8
    const-wide/32 v0, 0xa00000

    return-wide v0

    :cond_9
    :goto_2
    return-wide v2
.end method

.method public final ۤ()Ll/᩻ۢܳ;
    .locals 2

    .line 455
    iget-object v0, p0, Ll/ܺۢܳ;->᩻:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    iget-object v1, p0, Ll/ܺۢܳ;->ۧ:[Ll/᩻ۢܳ;

    aget-object v0, v1, v0

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 492
    iget-object v0, p0, Ll/ܺۢܳ;->᩷:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final ۫()Ll/᩹ۖ᩸;
    .locals 1

    .line 591
    iget-object v0, p0, Ll/ܺۢܳ;->ܿ:Ll/᩹ۖ᩸;

    return-object v0
.end method

.method public final ܳ()I
    .locals 3

    .line 465
    iget-object v0, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    const/4 v2, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    const/16 v0, 0x9

    return v0

    .line 479
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    const/4 v0, 0x7

    return v0

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    return v1

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public abstract ܶ()V
.end method

.method public final ܺ()Z
    .locals 2

    .line 595
    iget-object v0, p0, Ll/ܺۢܳ;->ܳ:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ll/ܺۢܳ;->ᩴ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 599
    iget-object v0, p0, Ll/ܺۢܳ;->᩸:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final ᩴ()Ljava/lang/String;
    .locals 1

    .line 545
    iget-object v0, p0, Ll/ܺۢܳ;->᩺:Ll/֫ۖ᩸;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 546
    iget-object v0, p0, Ll/ܺۢܳ;->ۨ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 451
    iget-object v0, p0, Ll/ܺۢܳ;->ۚ:Ll/᩹ۖ᩸;

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩸()I
    .locals 2

    .line 485
    iget-object v0, p0, Ll/ܺۢܳ;->ۗ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 488
    :cond_0
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public final ᩻()Z
    .locals 2

    .line 499
    iget-object v0, p0, Ll/ܺۢܳ;->ۤ:Ll/֨ܶ;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
