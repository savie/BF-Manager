.class public Ll/ۛۙ᩸;
.super Ll/ܽ֡֫;
.source "B9R5"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field public static final synthetic ܺ᩷:I

.field public static final ܽ᩷:Ll/᩷ۨᩴ;


# instance fields
.field public ֫᩷:Ll/ᩴܿ᩻;

.field public ۚ᩷:Ll/᩷ۨᩴ;

.field public ۧ᩷:Landroid/view/View;

.field public ۫᩷:Ljava/lang/String;

.field public final ܳ᩷:Ljava/util/ArrayList;

.field public ᩴ᩷:Ll/ᩳۧ;

.field public ᩸᩷:Z

.field public final ᩻᩷:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 62
    sget-object v0, Ll/ۛۨᩴ;->ᩴ:Ll/᩷ۨᩴ;

    const-string v1, "tran3"

    invoke-virtual {v0, v1}, Ll/᩷ۨᩴ;->᩸(Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    sput-object v0, Ll/ۛۙ᩸;->ܽ᩷:Ll/᩷ۨᩴ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 61
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۛۙ᩸;->ܳ᩷:Ljava/util/ArrayList;

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛۙ᩸;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛۙ᩸;->᩸ۙ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ۛۙ᩸;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ll/ۛۙ᩸;->᩸ۙ()V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۛۙ᩸;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛۙ᩸;->۫᩷:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ۙ(Ll/ۛۙ᩸;[Z[Ljava/lang/String;Ll/۠ۖۧ;)V
    .locals 8

    .line 445
    iget-object v0, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    .line 446
    :goto_0
    array-length v6, p1

    const v7, 0x7f120798

    if-ge v3, v6, :cond_3

    .line 447
    aget-boolean v6, p1, v3

    if-eqz v6, :cond_2

    if-ne v4, v1, :cond_0

    move v4, v3

    goto :goto_1

    :cond_0
    if-ne v5, v1, :cond_1

    move v5, v3

    goto :goto_1

    .line 453
    :cond_1
    invoke-static {v7}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    if-eq v4, v1, :cond_b

    if-ne v5, v1, :cond_4

    goto/16 :goto_4

    .line 462
    :cond_4
    aget-object p1, p2, v4

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ۙ᩸;

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    aget-object p2, p2, v5

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺ۙ᩸;

    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 466
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘۙ᩸;

    .line 467
    new-instance v4, Ll/᩷ۙ᩸;

    iget v5, v3, Ll/ۘۙ᩸;->ۙ:I

    iget v6, v3, Ll/ۘۙ᩸;->ᩴ:I

    invoke-direct {v4, v5, v6}, Ll/᩷ۙ᩸;-><init>(II)V

    .line 468
    new-instance v5, Ll/ۨۙ᩸;

    iget-object v6, v3, Ll/ۘۙ᩸;->᩸:Ljava/lang/String;

    if-nez v6, :cond_5

    iget-object v6, v3, Ll/ۘۙ᩸;->᩷:Ljava/lang/String;

    :cond_5
    invoke-direct {v5, v6}, Ll/ۨۙ᩸;-><init>(Ljava/lang/String;)V

    .line 469
    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 471
    :cond_6
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۘۙ᩸;

    .line 472
    new-instance v4, Ll/᩷ۙ᩸;

    iget v5, v3, Ll/ۘۙ᩸;->ۙ:I

    iget v6, v3, Ll/ۘۙ᩸;->ᩴ:I

    invoke-direct {v4, v5, v6}, Ll/᩷ۙ᩸;-><init>(II)V

    .line 473
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۨۙ᩸;

    if-eqz v4, :cond_7

    .line 475
    iget-object v5, v3, Ll/ۘۙ᩸;->᩸:Ljava/lang/String;

    if-nez v5, :cond_8

    iget-object v5, v3, Ll/ۘۙ᩸;->᩷:Ljava/lang/String;

    :cond_8
    iput-object v5, v4, Ll/ۨۙ᩸;->᩷:Ljava/lang/String;

    goto :goto_3

    .line 478
    :cond_9
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ll/֨۫ۗ;->stream(Ljava/util/Collection;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/ۚۙ᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 479
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->filter(Ljava/util/function/Predicate;)Ll/᩵ܺۗ;

    move-result-object v0

    new-instance v1, Ll/֫ۙ᩸;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 480
    invoke-interface {v0, v1}, Ll/᩵ܺۗ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/ۨۙ᩸;

    .line 481
    array-length v1, v0

    if-nez v1, :cond_a

    const p0, 0x7f120797

    .line 482
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 485
    :cond_a
    invoke-virtual {p3}, Ll/۠ۖۧ;->dismiss()V

    .line 486
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p3

    const v1, 0x7f120795

    .line 487
    invoke-virtual {p3, v1}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 488
    invoke-virtual {p1}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " > "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    const v1, 0x7f1208c9

    const/4 v3, 0x0

    .line 489
    invoke-virtual {p3, v1, v3}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120161

    const v4, 0x7f120313

    .line 0
    invoke-static {p3, v1, v3, v4, v3}, Ll/۠᩹ᩴ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object p3

    const/4 v1, 0x1

    new-array v1, v1, [Z

    aput-boolean v2, v1, v2

    .line 494
    invoke-virtual {p3}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v2

    new-instance v3, Ll/ۧۙ᩸;

    invoke-direct {v3, v1, p3, p2, p1}, Ll/ۧۙ᩸;-><init>([ZLl/۠ۖۧ;Ll/᩺ۙ᩸;Ll/᩺ۙ᩸;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 502
    invoke-virtual {p3}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    new-instance p2, Ll/᩻ۙ᩸;

    invoke-direct {p2, p0, p3, v0, v1}, Ll/᩻ۙ᩸;-><init>(Ll/ۛۙ᩸;Ll/۠ۖۧ;[Ll/ۨۙ᩸;[Z)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 459
    :cond_b
    :goto_4
    invoke-static {v7}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ۛۙ᩸;)Ljava/lang/String;
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛۙ᩸;->ۤۙ()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ۤ(Ll/ۛۙ᩸;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۙ᩸;->ܳ᩷:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ۤۙ()Ljava/lang/String;
    .locals 3

    .line 268
    invoke-static {}, Ll/ܳ֫ܺ;->ۙ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 269
    iget-object v1, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙ᩸;

    .line 270
    invoke-virtual {v2, v0}, Ll/᩺ۙ᩸;->ۙ(Ljava/security/MessageDigest;)V

    goto :goto_0

    .line 272
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳ֫ܺ;->᩷([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic ۫(Ll/ۛۙ᩸;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۛۙ᩸;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۛۙ᩸;)Ll/ᩴܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۙ᩸;->֫᩷:Ll/ᩴܿ᩻;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۛۙ᩸;)Ll/ᩳۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۙ᩸;->ᩴ᩷:Ll/ᩳۧ;

    return-object p0
.end method

.method public static bridge synthetic ᩷ۙ()Ll/᩷ۨᩴ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۛۙ᩸;->ܽ᩷:Ll/᩷ۨᩴ;

    return-object v0
.end method

.method public static bridge synthetic ᩸(Ll/ۛۙ᩸;)Ll/᩷ۨᩴ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۙ᩸;->ۚ᩷:Ll/᩷ۨᩴ;

    return-object p0
.end method

.method private ᩸ۙ()V
    .locals 3

    .line 327
    iget-boolean v0, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    if-eqz v0, :cond_0

    .line 328
    sget v0, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v0, Ll/ۖۖۧ;

    invoke-direct {v0, p0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    const v1, 0x7f120d44

    .line 329
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    const v1, 0x7f120a8c

    .line 330
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v1, Ll/ᩴۙ᩸;

    invoke-direct {v1, p0}, Ll/ᩴۙ᩸;-><init>(Ll/ۛۙ᩸;)V

    const v2, 0x7f120a85

    .line 331
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ܳۙ᩸;

    invoke-direct {v1, p0}, Ll/ܳۙ᩸;-><init>(Ll/ۛۙ᩸;)V

    const v2, 0x7f12031d

    .line 332
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 333
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 335
    :cond_0
    invoke-virtual {p0}, Ll/ۛۙ᩸;->finish()V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    .line 341
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 342
    sget-object v0, Ll/ۛۙ᩸;->ܽ᩷:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ᩳ()Z

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 79
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 80
    invoke-virtual {p0}, Ll/ܽ֡֫;->ܰ()V

    const v0, 0x7f0d001f

    .line 81
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v0, 0x7f120c5f

    .line 82
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v0, 0x7f0a068a

    .line 83
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩹;

    iput-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 84
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    .line 85
    invoke-virtual {p0}, Ll/ܽ֡֫;->ۖ()V

    .line 86
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    new-instance v1, Ll/᩺֡᩻;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Ll/᩺֡᩻;-><init>(Landroid/view/KeyEvent$Callback;I)V

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object v0

    .line 313
    new-instance v1, Ll/ܽۙ᩸;

    invoke-direct {v1, p0}, Ll/ܽۙ᩸;-><init>(Ll/ۛۙ᩸;)V

    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۜۤ;->ۙ(Ll/ۛۤ;)Ll/֡᩷;

    const v0, 0x102000a

    .line 89
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ᩴܿ᩻;

    iput-object v0, p0, Ll/ۛۙ᩸;->֫᩷:Ll/ᩴܿ᩻;

    const/4 v1, 0x1

    .line 90
    invoke-virtual {v0, v1}, Ll/ᩴܿ᩻;->setFastScrollEnabled(Z)V

    .line 91
    iget-object v0, p0, Ll/ۛۙ᩸;->֫᩷:Ll/ᩴܿ᩻;

    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    const v0, 0x7f0a0559

    .line 93
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۙ᩸;->ۧ᩷:Landroid/view/View;

    const v0, 0x7f0a00e2

    .line 94
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ᩳۧ;

    iput-object v0, p0, Ll/ۛۙ᩸;->ᩴ᩷:Ll/ᩳۧ;

    .line 95
    sget-object v2, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v3, "arsc_translation_keep"

    invoke-interface {v2, v3, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 96
    iget-object v0, p0, Ll/ۛۙ᩸;->ᩴ᩷:Ll/ᩳۧ;

    new-instance v2, Ll/۫ۙ᩸;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 99
    invoke-static {p0}, Ll/ܰۨᩴ;->ۙ(Ll/ܽ֡֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 153
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-static {v0}, Ll/ܰۨᩴ;->ۙ(Landroid/content/Intent;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 102
    iput-object v0, p0, Ll/ۛۙ᩸;->ۚ᩷:Ll/᩷ۨᩴ;

    if-eqz p1, :cond_2

    const-string v0, "stateOK"

    .line 103
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    const-string v0, "digest"

    .line 105
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۛۙ᩸;->۫᩷:Ljava/lang/String;

    const-string v0, "changed"

    .line 106
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    const-string v0, "filePaths"

    .line 107
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Ll/ۛۙ᩸;->ܳ᩷:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/String;

    .line 109
    invoke-static {v0, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v0

    .line 110
    new-instance v3, Ll/᩺ۙ᩸;

    invoke-direct {v3, v0}, Ll/᩺ۙ᩸;-><init>(Ll/᩷ۨᩴ;)V

    .line 111
    invoke-virtual {v3}, Ll/᩺ۙ᩸;->᩷()Ljava/lang/String;

    move-result-object v0

    .line 112
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    iget-object v2, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 115
    :cond_1
    invoke-static {v2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 116
    iget-object p1, p0, Ll/ۛۙ᩸;->֫᩷:Ll/ᩴܿ᩻;

    new-instance v0, Ll/ۗۙ᩸;

    invoke-direct {v0, p0}, Ll/ۗۙ᩸;-><init>(Ll/ۛۙ᩸;)V

    invoke-virtual {p1, v0}, Ll/ᩴܿ᩻;->setAdapter(Landroid/widget/ListAdapter;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 118
    invoke-virtual {p0, p1, v1}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Z)V

    return-void

    .line 122
    :cond_2
    new-instance p1, Ll/ܺۙ᩸;

    invoke-direct {p1, p0}, Ll/ܺۙ᩸;-><init>(Ll/ۛۙ᩸;)V

    .line 226
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .line 277
    invoke-virtual {p0}, Ll/ۘᩴ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0003

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 424
    new-instance p1, Landroid/content/Intent;

    const-class p2, Ll/۬۬ۤ;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 425
    iget-object p2, p0, Ll/ۛۙ᩸;->ܳ᩷:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    iget-object p3, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺ۙ᩸;

    invoke-static {p2}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ll/᩺ۙ᩸;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object p2

    .line 426
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ۘ᩷()Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 427
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 9

    .line 283
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a03b6

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    .line 346
    new-instance p1, Ll/ܶۙ᩸;

    invoke-direct {p1, p0, v1}, Ll/ܶۙ᩸;-><init>(Ll/ۛۙ᩸;Z)V

    .line 419
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    return v2

    :cond_0
    const v0, 0x7f0a037b

    if-ne p1, v0, :cond_1

    .line 288
    invoke-direct {p0}, Ll/ۛۙ᩸;->᩸ۙ()V

    return v2

    :cond_1
    const v0, 0x7f0a0559

    if-ne p1, v0, :cond_3

    .line 291
    iget-object p1, p0, Ll/ۛۙ᩸;->ۧ᩷:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_2

    .line 292
    iget-object p1, p0, Ll/ۛۙ᩸;->ۧ᩷:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return v2

    .line 294
    :cond_2
    iget-object p1, p0, Ll/ۛۙ᩸;->ۧ᩷:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return v2

    :cond_3
    const v0, 0x7f0a0385

    if-ne p1, v0, :cond_5

    .line 431
    iget-object p1, p0, Ll/ۛۙ᩸;->ܳ᩷:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v3, 0x2

    if-ge v0, v3, :cond_4

    const p1, 0x7f120796

    .line 432
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return v2

    :cond_4
    const v0, 0x7f120798

    .line 435
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    new-array v0, v1, [Ljava/lang/String;

    .line 436
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, [Ljava/lang/String;

    .line 437
    array-length p1, v6

    new-array v5, p1, [Z

    .line 438
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    const v0, 0x7f120795

    .line 439
    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->᩷(I)V

    new-instance v0, Ll/᩶ܳۧ;

    const/4 v1, 0x1

    invoke-direct {v0, v5, v1}, Ll/᩶ܳۧ;-><init>([ZI)V

    .line 440
    invoke-virtual {p1, v6, v5, v0}, Ll/ۖۖۧ;->ۙ([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    const v0, 0x7f1208c9

    const v1, 0x7f120161

    const/4 v3, 0x0

    .line 0
    invoke-static {p1, v0, v3, v1, v3}, Ll/ܰ۟ۙ;->ۙ(Ll/ۖۖۧ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/۠ۖۧ;

    move-result-object v7

    .line 444
    invoke-virtual {v7}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۖܰ֫;

    const/4 v8, 0x1

    move-object v3, v0

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Ll/ۖܰ֫;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return v2

    :cond_5
    const v0, 0x7f0a0379

    if-ne p1, v0, :cond_7

    .line 300
    invoke-static {}, Ll/ᩳۡ᩻;->ܺ()Z

    move-result p1

    if-nez p1, :cond_6

    const p1, 0x7f120916

    .line 301
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return v2

    .line 303
    :cond_6
    new-instance p1, Landroid/content/Intent;

    const-class v0, Ll/᩺ܿۤ;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 304
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->startActivity(Landroid/content/Intent;)V

    return v2

    :cond_7
    return v1
.end method

.method public final onResume()V
    .locals 4

    .line 247
    invoke-super {p0}, Ll/ܽ֡֫;->onResume()V

    .line 248
    iget-object v0, p0, Ll/ۛۙ᩸;->۫᩷:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_1

    .line 252
    :cond_0
    iget-object v0, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۙ᩸;

    .line 254
    :try_start_0
    invoke-virtual {v3}, Ll/᩺ۙ᩸;->ۚ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const/4 v3, 0x0

    .line 546
    invoke-virtual {p0, v2, v3}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    .line 261
    iput-boolean v1, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    goto :goto_1

    .line 263
    :cond_2
    iget-boolean v0, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ۛۙ᩸;->۫᩷:Ljava/lang/String;

    invoke-direct {p0}, Ll/ۛۙ᩸;->ۤۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    :goto_1
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 231
    invoke-super {p0, p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 232
    iget-object v0, p0, Ll/ۛۙ᩸;->۫᩷:Ljava/lang/String;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "digest"

    .line 235
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "changed"

    .line 236
    iget-boolean v1, p0, Ll/ۛۙ᩸;->᩸᩷:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 237
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۛۙ᩸;->᩻᩷:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 238
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩺ۙ᩸;

    .line 239
    invoke-virtual {v2}, Ll/᩺ۙ᩸;->ۘ᩷()Ll/᩷ۨᩴ;

    move-result-object v2

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v1, "filePaths"

    .line 241
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "stateOK"

    const/4 v1, 0x1

    .line 242
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "ArscTranslationMain"

    return-object v0
.end method

.method public final ᩺()V
    .locals 0

    .line 323
    invoke-direct {p0}, Ll/ۛۙ᩸;->᩸ۙ()V

    return-void
.end method
