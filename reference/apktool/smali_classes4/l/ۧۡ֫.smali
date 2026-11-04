.class public final Ll/ۧۡ֫;
.super Ll/ܽ֡֫;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final synthetic ۙۤ:I


# instance fields
.field public ֡᩷:Ll/ۜܿ᩻;

.field public final ֨᩷:Ljava/util/HashSet;

.field public ֫᩷:Landroid/view/View;

.field public ۖ᩷:Ll/ۗ֨᩷;

.field public ۗ᩷:Ljava/lang/String;

.field public final ۘ᩷:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۚ᩷:Ll/ۜܰ᩻;

.field public ۛ᩷:J

.field public final ۜ᩷:Ll/۠֨֫;

.field public ۟᩷:Z

.field public ۠᩷:I

.field public final ۡ᩷:Ljava/util/HashSet;

.field public ۢ᩷:Ljava/util/List;

.field public ۧ᩷:Ll/ۧ᩶᩻;

.field public ۨ᩷:I

.field public ۫᩷:Ll/ܺ֡ܳ;

.field public ۬᩷:Ll/ۜ᩻۫;

.field public ܰ᩷:I

.field public ܳ᩷:Ll/۬ܰᩴ;

.field public ܶ᩷:Ljava/lang/String;

.field public final ܺ᩷:I

.field public ܽ᩷:Ll/᩹ۖ᩸;

.field public ܿ᩷:Ll/ۚܿ᩻;

.field public ᩳ᩷:I

.field public ᩴ᩷:Ll/ۘ֨֫;

.field public ᩵᩷:Ljava/util/List;

.field public ᩶᩷:Ljava/util/List;

.field public ᩸᩷:Ljava/lang/Object;

.field public ᩹᩷:Z

.field public ᩺᩷:Ll/ۗۤۧ;

.field public final ᩻᩷:Ll/᩻֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 97
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    .line 99
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۧۡ֫;->֨᩷:Ljava/util/HashSet;

    .line 100
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۧۡ֫;->ۡ᩷:Ljava/util/HashSet;

    .line 101
    sget-object v0, Ll/᩷ᩳ᩵;->ܰ:Ll/᩷ᩳ᩵;

    iput-object v0, p0, Ll/ۧۡ֫;->᩸᩷:Ljava/lang/Object;

    .line 103
    new-instance v0, Ll/۠֨֫;

    invoke-direct {v0, p0}, Ll/۠֨֫;-><init>(Ll/ۧۡ֫;)V

    iput-object v0, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    .line 106
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "fcsp"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Ll/ۧۡ֫;->ᩳ᩷:I

    .line 111
    sget-object v0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v1, "fcrp"

    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ۧۡ֫;->۟᩷:Z

    const-string v0, ""

    .line 130
    iput-object v0, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    const v0, 0x7f1208c9

    .line 131
    iput v0, p0, Ll/ۧۡ֫;->ܰ᩷:I

    .line 133
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const-string v1, "emptyList(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    .line 134
    iput-object v0, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    const/4 v1, -0x1

    .line 136
    iput v1, p0, Ll/ۧۡ֫;->ۨ᩷:I

    .line 140
    sget-object v1, Ll/ܽܿ֫;->ܿ:Landroid/content/SharedPreferences;

    const-string v3, "fltp"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/ۧۡ֫;->ܺ᩷:I

    const/4 v1, 0x1

    .line 488
    iput-boolean v1, p0, Ll/ۧۡ֫;->᩹᩷:Z

    .line 513
    iput-object v0, p0, Ll/ۧۡ֫;->ۢ᩷:Ljava/util/List;

    .line 621
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/ۧۡ֫;->ۘ᩷:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1052
    invoke-static {}, Ll/᩻֫ܺ;->ܳ()Ll/᩻֫ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/ۧۡ֫;->᩻᩷:Ll/᩻֫ܺ;

    return-void
.end method

.method public static final synthetic ֡(Ll/ۧۡ֫;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ll/ۧۡ֫;->᩻ۙ()V

    return-void
.end method

.method public static final synthetic ֫(Ll/ۧۡ֫;)Ll/ۜܰ᩻;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ۚ᩷:Ll/ۜܰ᩻;

    return-object p0
.end method

.method private final ֫ۙ()V
    .locals 4

    .line 1313
    iget-object v0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-nez v0, :cond_0

    return-void

    .line 1314
    :cond_0
    invoke-static {}, Ll/᩶᩷ۧ;->ᩴ()Landroid/app/Application;

    move-result-object v1

    const-string v2, "clipboard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type android.content.ClipboardManager"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/ClipboardManager;

    .line 1315
    new-instance v2, Ll/۬֨֫;

    invoke-direct {v2, p0}, Ll/۬֨֫;-><init>(Ll/ۧۡ֫;)V

    const v3, 0x7f1204fe

    .line 1325
    invoke-virtual {v2, v3}, Ll/۠ۢᩴ;->ܺ(I)V

    .line 1326
    invoke-virtual {v0}, Ll/ۜ᩵ܳ;->ۘ()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x7d0

    invoke-static {v3, v0}, Ll/ᩳۡܶ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/۠ۢᩴ;->ۙ(Ljava/lang/CharSequence;)V

    .line 1327
    invoke-virtual {v2}, Ll/۠ۢᩴ;->᩹()V

    const/4 v0, 0x2

    .line 1328
    invoke-virtual {v2, v0}, Ll/۠ۢᩴ;->᩸(I)V

    const/4 v0, 0x1

    .line 202
    invoke-virtual {v2, v0}, Ll/۠ۢᩴ;->᩷(Z)V

    .line 1330
    invoke-virtual {v2}, Ll/۠ۢᩴ;->ۚ()Landroid/widget/Button;

    move-result-object v0

    new-instance v3, Ll/ۙ֨֫;

    invoke-direct {v3, v1, v2}, Ll/ۙ֨֫;-><init>(Landroid/content/ClipboardManager;Ll/۬֨֫;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static final synthetic ۗ(Ll/ۧۡ֫;)Ll/ۚܿ᩻;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    return-object p0
.end method

.method public static final synthetic ۘ(Ll/ۧۡ֫;)Ll/ۗ֨᩷;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    return-object p0
.end method

.method public static ۙ(Ll/ۜ᩻۫;Ljava/lang/String;Ll/ۧۡ֫;Ljava/lang/String;)Ll/ۧ۟᩵;
    .locals 0

    .line 1072
    iget-object p0, p0, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    iget-object p0, p0, Ll/۠᩵ܳ;->ۙ:Ll/ܰۗ;

    invoke-virtual {p0, p1}, Ll/ۡۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    .line 1073
    iget-object p1, p2, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {p1, p0, p3}, Ll/۠֨֫;->ۙ(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1074
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static ۙ(Ll/ۧۡ֫;Ll/ۖ᩵ܳ;Ljava/lang/String;)Ll/ۧ۟᩵;
    .locals 0

    .line 1137
    iget-object p0, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    iget p1, p1, Ll/ۖ᩵ܳ;->᩸:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/۠֨֫;->ۙ(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1138
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static ۙ(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)Ll/ۧ۟᩵;
    .locals 1

    .line 1274
    iget-object p1, p1, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/۠֨֫;->ۙ(Ljava/lang/String;)V

    .line 1275
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static ۙ(Ll/᩻ۡ᩵;Ll/ۧۡ֫;)Ll/ۧ۟᩵;
    .locals 0

    .line 1303
    iget-object p1, p1, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    iget-object p0, p0, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    .line 1304
    invoke-virtual {p1, p0}, Ll/۠֨֫;->ۙ(I)V

    goto :goto_0

    .line 1306
    :cond_0
    check-cast p0, Ljava/lang/String;

    invoke-virtual {p1, p0}, Ll/۠֨֫;->ۙ(Ljava/lang/String;)V

    .line 1308
    :goto_0
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static final ۙ(Ll/ۧ۫ۙ;Ll/֡֨֫;)Ll/᩶֨֫;
    .locals 2

    .line 1536
    new-instance v0, Ll/᩶֨֫;

    new-instance v1, Ll/᩵֨֫;

    invoke-direct {v1, p1}, Ll/᩵֨֫;-><init>(Ll/֡֨֫;)V

    invoke-static {p0, v1}, Ll/ۨۤۧ;->ۙ(Ll/ۧ۫ۙ;Ll/ܶۤۧ;)Ll/ۗۤۧ;

    move-result-object p0

    .line 1640
    invoke-direct {v0, p0}, Ll/ܶ֨֫;-><init>(Ll/ۗۤۧ;)V

    return-object v0
.end method

.method public static final ۙ(Ll/ۨ᩸;Ljava/lang/String;Ll/֡֨֫;)Ll/᩶֨֫;
    .locals 2

    const-string v0, "registry"

    .line 0
    invoke-static {p0, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1512
    new-instance v0, Ll/᩶֨֫;

    new-instance v1, Ll/ۨ֨֫;

    invoke-direct {v1, p2}, Ll/ۨ֨֫;-><init>(Ll/֡֨֫;)V

    invoke-static {p0, p1, v1}, Ll/ۨۤۧ;->ۙ(Ll/ۨ᩸;Ljava/lang/String;Ll/ۨ֨֫;)Ll/ۗۤۧ;

    move-result-object p0

    .line 1640
    invoke-direct {v0, p0}, Ll/ܶ֨֫;-><init>(Ll/ۗۤۧ;)V

    return-object v0
.end method

.method public static final ۙ(Ll/ܽ֡֫;Ll/֡֨֫;)Ll/᩶֨֫;
    .locals 2

    .line 1523
    new-instance v0, Ll/᩶֨֫;

    new-instance v1, Ll/ܽᩳ֫;

    invoke-direct {v1, p1}, Ll/ܽᩳ֫;-><init>(Ljava/lang/Object;)V

    .line 824
    invoke-static {p0, v1}, Ll/ۨۤۧ;->ۙ(Ll/ۚۤ;Ll/ܶۤۧ;)Ll/ۗۤۧ;

    move-result-object p0

    .line 1640
    invoke-direct {v0, p0}, Ll/ܶ֨֫;-><init>(Ll/ۗۤۧ;)V

    return-object v0
.end method

.method public static final ۙ(Ll/ۧ۫ۙ;Ll/ܿ֨֫;)Ll/᩺֨֫;
    .locals 2

    .line 1594
    new-instance v0, Ll/᩺֨֫;

    new-instance v1, Ll/᩹֨֫;

    invoke-direct {v1, p1}, Ll/᩹֨֫;-><init>(Ll/ܿ֨֫;)V

    invoke-static {p0, v1}, Ll/ۨۤۧ;->ۙ(Ll/ۧ۫ۙ;Ll/ܶۤۧ;)Ll/ۗۤۧ;

    move-result-object p0

    .line 1715
    invoke-direct {v0, p0}, Ll/ܶ֨֫;-><init>(Ll/ۗۤۧ;)V

    return-object v0
.end method

.method private final ۙ(Landroid/os/Bundle;)V
    .locals 13

    .line 366
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 372
    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 1435
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x3

    const-string v4, "getPath(...)"

    const-string v5, "toLowerCase(...)"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "android.intent.extra.ALLOW_MULTIPLE"

    .line 1444
    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x3

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 373
    :goto_0
    iput v1, p0, Ll/ۧۡ֫;->۠᩷:I

    const-string v1, "android.intent.extra.MIME_TYPES"

    .line 381
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 10562
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10995
    array-length v2, v0

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v2, :cond_1

    aget-object v10, v0, v9

    .line 382
    invoke-static {v10}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    new-array v11, v6, [C

    const/16 v12, 0x2c

    aput-char v12, v11, v8

    invoke-static {v10, v11}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/String;[C)Ljava/util/List;

    move-result-object v10

    .line 118
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1586
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v1}, Ll/۟۟᩵;->ۙ(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1661
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 1662
    check-cast v2, Ljava/lang/String;

    .line 383
    invoke-static {v2}, Ll/֨ۖ᩵;->᩸(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v10, "ROOT"

    invoke-static {v9, v10}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1662
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 777
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Ljava/lang/String;

    .line 384
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_3

    .line 873
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 384
    :cond_4
    sget-object v1, Ll/᩷ᩳ᩵;->ܰ:Ll/᩷ᩳ᩵;

    .line 381
    :cond_5
    iput-object v1, p0, Ll/ۧۡ֫;->᩸᩷:Ljava/lang/Object;

    const-string v0, "exportSelectFile"

    .line 386
    iput-object v0, p0, Ll/ۧۡ֫;->ۗ᩷:Ljava/lang/String;

    .line 387
    sget-object v0, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    move-object v1, v7

    move-object v2, v1

    const/4 v9, 0x0

    goto :goto_5

    :cond_6
    const-string v1, "type"

    .line 389
    invoke-virtual {v0, v1, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Ll/ۧۡ֫;->۠᩷:I

    const-string v1, "initFilename"

    .line 390
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "suffixes"

    .line 391
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const-string v9, "customButtonTitle"

    .line 392
    invoke-virtual {v0, v9, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    const-string v10, "initPathKey"

    .line 394
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, p0, Ll/ۧۡ֫;->ۗ᩷:Ljava/lang/String;

    const-string v10, "initPath"

    .line 395
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    sget-object v0, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 396
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_8

    goto :goto_4

    :cond_8
    const-string v10, "/"

    .line 449
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_9

    .line 397
    :goto_4
    sget-object v0, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 400
    :cond_9
    :goto_5
    iget-object v4, p0, Ll/ۧۡ֫;->ۗ᩷:Ljava/lang/String;

    if-eqz v4, :cond_a

    .line 401
    sget-object v10, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v10, v4, v0}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "getString(...)"

    invoke-static {v0, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    if-eqz p1, :cond_c

    const-string v4, "visitorData"

    .line 403
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_b

    goto :goto_6

    .line 410
    :cond_b
    new-instance v0, Ll/ۜ᩻۫;

    new-instance v10, Ll/᩵ۚۤ;

    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v10, p1}, Ll/᩵ۚۤ;-><init>([B)V

    invoke-direct {v0, v10}, Ll/ۜ᩻۫;-><init>(Ll/᩵ۚۤ;)V

    goto :goto_7

    :cond_c
    :goto_6
    new-array p1, v8, [Ljava/lang/String;

    .line 404
    invoke-static {v0, p1}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 405
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {p1}, Ll/᩷ۨᩴ;->᩺ۙ()Z

    move-result v4

    if-eqz v4, :cond_d

    .line 406
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->᩻ۙ()Ljava/lang/String;

    move-result-object v0

    .line 408
    :cond_d
    new-instance p1, Ll/ۜ᩻۫;

    invoke-direct {p1, v0}, Ll/ۜ᩻۫;-><init>(Ljava/lang/String;)V

    move-object v0, p1

    .line 403
    :goto_7
    iput-object v0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    .line 411
    invoke-direct {p0}, Ll/ۧۡ֫;->ۧۙ()V

    const-string p1, "filenameEditText"

    if-eqz v1, :cond_f

    .line 414
    iget-object v0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_e

    invoke-virtual {v0, v1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_e
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    :cond_f
    :goto_8
    if-eqz v2, :cond_11

    .line 14048
    array-length v0, v2

    const/4 v1, 0x0

    :goto_9
    if-ge v1, v0, :cond_11

    aget-object v4, v2, v1

    const-string v10, "<this>"

    .line 1196
    invoke-static {v4, v10}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0x2e

    .line 1126
    invoke-virtual {v4, v10, v8}, Ljava/lang/String;->indexOf(II)I

    move-result v10

    if-ltz v10, :cond_10

    .line 418
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "."

    invoke-virtual {v10, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v10, p0, Ll/ۧۡ֫;->ۡ᩷:Ljava/util/HashSet;

    invoke-virtual {v10, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 420
    :cond_10
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, p0, Ll/ۧۡ֫;->֨᩷:Ljava/util/HashSet;

    invoke-virtual {v10, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    .line 424
    :cond_11
    iget v0, p0, Ll/ۧۡ֫;->۠᩷:I

    const/4 v1, 0x2

    const v2, 0x7f0a015b

    const/16 v4, 0x8

    const v5, 0x7f0a00ae

    if-eqz v0, :cond_19

    if-eq v0, v6, :cond_16

    if-eq v0, v1, :cond_15

    if-eq v0, v3, :cond_12

    goto/16 :goto_c

    .line 443
    :cond_12
    invoke-virtual {p0, v5}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 444
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 445
    iget-object v0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_14

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 446
    invoke-virtual {p0, v5}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 142
    sget v0, Ll/ۗۡ֫;->ᩴ:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    if-eqz v9, :cond_13

    goto :goto_b

    :cond_13
    const v9, 0x7f1208c9

    .line 448
    :goto_b
    iput v9, p0, Ll/ۧۡ֫;->ܰ᩷:I

    .line 450
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    invoke-direct {p0}, Ll/ۧۡ֫;->᩻ۙ()V

    goto/16 :goto_c

    .line 445
    :cond_14
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    :cond_15
    const p1, 0x7f0a00af

    .line 455
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a0632

    .line 456
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 457
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 458
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 142
    sget v0, Ll/ۗۡ֫;->ᩴ:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 460
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v9, :cond_1a

    .line 462
    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(I)V

    goto :goto_c

    .line 438
    :cond_16
    iget-object v0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_18

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 439
    iget-object p1, p0, Ll/ۧۡ֫;->֫᩷:Landroid/view/View;

    if-eqz p1, :cond_17

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_c

    :cond_17
    const-string p1, "bottomSpace"

    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 438
    :cond_18
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 426
    :cond_19
    invoke-virtual {p0, v5}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 427
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 428
    iget-object v0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_1b

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 429
    invoke-virtual {p0, v5}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 142
    sget v0, Ll/ۗۡ֫;->ᩴ:I

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 431
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v9, :cond_1a

    .line 433
    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(I)V

    .line 466
    :cond_1a
    :goto_c
    iget-object p1, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2032
    new-instance v0, Ljava/lang/Thread;

    .line 2101
    iget-object v2, p1, Ll/۠֨֫;->۫:Ll/ۧۡ֫;

    new-instance v3, Ll/ۡ֨֫;

    invoke-direct {v3, v2, p1}, Ll/ۡ֨֫;-><init>(Ll/ۧۡ֫;Ll/۠֨֫;)V

    .line 2032
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 2101
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 618
    invoke-static {p0, v8, v7, v1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 468
    new-instance p1, Ll/ܺ֡ܳ;

    new-instance v0, Ll/۠۬֫;

    invoke-direct {v0, p0}, Ll/۠۬֫;-><init>(Ljava/lang/Object;)V

    invoke-direct {p1, p0, v0}, Ll/ܺ֡ܳ;-><init>(Ll/ۧۡ֫;Ll/۠۬֫;)V

    iput-object p1, p0, Ll/ۧۡ֫;->۫᩷:Ll/ܺ֡ܳ;

    return-void

    .line 428
    :cond_1b
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7
.end method

.method public static ۙ(Landroid/view/MenuItem;Ll/᩵ܰܳ;)V
    .locals 1

    const-string v0, "typeIcon"

    .line 6
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 545
    iget-object p1, p1, Ll/᩵ܰܳ;->᩷:Ll/ۨ֡֫;

    invoke-virtual {p1}, Ll/ۨ֡֫;->᩷()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-void
.end method

.method private final ۙ(Ljava/lang/String;Ll/ᩴ֨᩵;)V
    .locals 4

    .line 1288
    iget-object v0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 1289
    iget-object v1, v0, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    invoke-direct {p0}, Ll/ۧۡ֫;->ܳۙ()Ll/ۖ᩵ܳ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۠᩵ܳ;->ۤ(Ll/ۖ᩵ܳ;)V

    .line 830
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 833
    :cond_0
    invoke-direct {p0}, Ll/ۧۡ֫;->᩸ۙ()Z

    .line 834
    invoke-direct {p0}, Ll/ۧۡ֫;->᩻ۙ()V

    .line 1292
    :goto_0
    new-instance v1, Ll/᩻ۡ᩵;

    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "/"

    const/4 v3, 0x0

    .line 486
    invoke-static {p1, v2, v3}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1293
    invoke-virtual {v0, p1}, Ll/ۜ᩻۫;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1294
    invoke-static {p1}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/᩻ۡ᩵;->ܰ:Ljava/lang/Object;

    .line 1295
    invoke-static {p1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "getParent(...)"

    invoke-static {p1, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1297
    :cond_1
    invoke-virtual {v0, p1}, Ll/ۜ᩻۫;->ᩴ(Ljava/lang/String;)V

    .line 1298
    iget-object p1, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    const/4 v0, 0x0

    const-string v2, "searchView"

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, ""

    .line 1299
    iput-object p1, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    .line 1300
    iget-object p1, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/ۜܿ᩻;->᩸()V

    goto :goto_1

    :cond_2
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    if-nez p2, :cond_4

    .line 1302
    new-instance p2, Ll/֨ۢ֫;

    invoke-direct {p2, v1, p0}, Ll/֨ۢ֫;-><init>(Ll/᩻ۡ᩵;Ll/ۧۡ֫;)V

    :cond_4
    const/4 p1, 0x2

    const/4 v0, 0x1

    invoke-static {p0, v0, p2, p1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 1309
    invoke-direct {p0}, Ll/ۧۡ֫;->ۧۙ()V

    return-void

    .line 1298
    :cond_5
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/ۧۡ֫;)V
    .locals 9

    .line 189
    iget v0, p0, Ll/ۧۡ֫;->ۨ᩷:I

    .line 190
    iget-wide v1, p0, Ll/ۧۡ֫;->ۛ᩷:J

    const/4 v3, -0x1

    if-eq v0, v3, :cond_6

    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-nez v6, :cond_0

    goto :goto_1

    .line 194
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    cmp-long v8, v6, v1

    if-lez v8, :cond_1

    .line 195
    iput-wide v4, p0, Ll/ۧۡ֫;->ۛ᩷:J

    return-void

    .line 198
    :cond_1
    iget-object v1, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    const/4 v2, 0x0

    const-string v4, "recyclerView"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ll/ۚܿ᩻;->ۙ()I

    move-result v1

    if-lt v0, v1, :cond_3

    .line 199
    iget-object v1, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ll/ۚܿ᩻;->᩷()I

    move-result v1

    if-le v0, v1, :cond_6

    goto :goto_0

    :cond_2
    invoke-static {v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    .line 201
    :cond_3
    :goto_0
    iget-object v1, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    if-eqz v1, :cond_4

    invoke-virtual {v1, v0}, Ll/ۚܿ᩻;->scrollToPosition(I)V

    .line 202
    iput v3, p0, Ll/ۧۡ֫;->ۨ᩷:I

    return-void

    .line 201
    :cond_4
    invoke-static {v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    .line 198
    :cond_5
    invoke-static {v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_1
    return-void
.end method

.method public static final ۙ(Ll/ۧۡ֫;I)V
    .locals 11

    .line 930
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 931
    iget-object v1, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v2}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 932
    invoke-interface {v2}, Ll/ۖۗܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 933
    invoke-interface {v2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v2

    invoke-static {p1, v2, v3}, Ll/ܺ᩵ܳ;->ۙ(IJ)[J

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 936
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    .line 940
    :cond_2
    iget-object p1, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v3}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 941
    invoke-interface {v3}, Ll/ۖۗܳ;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    .line 944
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-string v5, "iterator(...)"

    invoke-static {v4, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    const-string v6, "next(...)"

    invoke-static {v5, v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, [J

    .line 945
    aget-wide v6, v5, v1

    invoke-interface {v3}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v8

    cmp-long v10, v6, v8

    if-gtz v10, :cond_5

    invoke-interface {v3}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v6

    const/4 v8, 0x1

    aget-wide v9, v5, v8

    cmp-long v5, v6, v9

    if-gez v5, :cond_5

    .line 946
    invoke-interface {v3, v8}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 v2, 0x1

    goto :goto_1

    .line 952
    :cond_6
    invoke-direct {p0, v2, v1}, Ll/ۧۡ֫;->ۙ(ZZ)V

    return-void
.end method

.method public static ۙ(Ll/ۧۡ֫;ILandroid/content/Intent;)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    if-eqz p2, :cond_1

    .line 331
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_1

    .line 332
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    .line 333
    iget-object p0, p0, Ll/ۧۡ֫;->ܳ᩷:Ll/۬ܰᩴ;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ll/۬ܰᩴ;->ۙ(Landroid/net/Uri;)V

    return-void

    :cond_0
    const-string p0, "androidDataGranter"

    invoke-static {p0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static final synthetic ۙ(Ll/ۧۡ֫;J)V
    .locals 0

    .line 97
    iput-wide p1, p0, Ll/ۧۡ֫;->ۛ᩷:J

    return-void
.end method

.method public static final ۙ(Ll/ۧۡ֫;JJ)V
    .locals 6

    .line 978
    iget-object v0, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v2}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 982
    :cond_1
    invoke-interface {v2}, Ll/ۖۗܳ;->ܰۙ()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v3

    cmp-long v5, p1, v3

    if-gtz v5, :cond_2

    invoke-interface {v2}, Ll/ۖۗܳ;->getSize()J

    move-result-wide v3

    cmp-long v5, v3, p3

    if-gez v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 983
    :goto_1
    invoke-interface {v2}, Ll/ۖۗܳ;->isChecked()Z

    move-result v4

    if-eq v4, v3, :cond_0

    .line 984
    invoke-interface {v2, v3}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    .line 988
    :cond_3
    invoke-direct {p0, v1, v3}, Ll/ۧۡ֫;->ۙ(ZZ)V

    return-void
.end method

.method public static final synthetic ۙ(Ll/ۧۡ֫;Ljava/lang/String;)V
    .locals 0

    .line 97
    invoke-direct {p0, p1}, Ll/ۧۡ֫;->ۤ(Ljava/lang/String;)V

    return-void
.end method

.method public static ۙ(Ll/ۧۡ֫;Ljava/lang/String;Ll/۠᩶ܳ;)V
    .locals 1

    if-eqz p2, :cond_0

    const p0, 0x7f120886

    .line 470
    invoke-static {p0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 473
    :cond_0
    iget-object p2, p0, Ll/ۧۡ֫;->ۚ᩷:Ll/ۜܰ᩻;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ll/ۜܰ᩻;->ۤ()V

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    .line 474
    invoke-static {p1, p2}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 475
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result p2

    .line 476
    new-instance v0, Ll/ᩴ֨֫;

    invoke-direct {v0, p2, p0, p1}, Ll/ᩴ֨֫;-><init>(ZLl/ۧۡ֫;Ll/᩷ۨᩴ;)V

    const-wide/16 p0, 0xb4

    invoke-static {p0, p1, v0}, Ll/᩶᩷ۧ;->ۙ(JLjava/lang/Runnable;)V

    return-void

    :cond_1
    const-string p0, "bottomSlideLayout"

    .line 473
    invoke-static {p0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final ۙ(Ll/ۧۡ֫;Ljava/util/List;)V
    .locals 5

    .line 750
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 751
    invoke-direct {p0}, Ll/ۧۡ֫;->ᩴۙ()Ljava/util/HashSet;

    move-result-object v0

    goto :goto_0

    .line 753
    :cond_0
    sget-object v0, Ll/᩸ᩳ᩵;->ܰ:Ll/᩸ᩳ᩵;

    .line 755
    :goto_0
    iput-object p1, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    .line 756
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    .line 810
    iget-object v1, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 811
    invoke-interface {v3}, Ll/ۖۗܳ;->ܺ᩷()Z

    move-result v4

    if-nez v4, :cond_1

    .line 773
    invoke-interface {v3}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 813
    invoke-interface {v3}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    invoke-interface {v3, v4}, Ll/ۖۗܳ;->setChecked(Z)V

    goto :goto_1

    .line 759
    :cond_3
    iget-object v0, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    .line 777
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 873
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ll/ۖۗܳ;

    .line 762
    invoke-interface {v3}, Ll/ۖۗܳ;->ۗۙ()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {v3}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    invoke-static {v3, v4, v2}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 873
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    move-object p1, v0

    .line 759
    :goto_4
    iput-object p1, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    .line 764
    invoke-direct {p0}, Ll/ۧۡ֫;->᩻ۙ()V

    .line 765
    iget-object p0, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    .line 2166
    invoke-virtual {p0, v2}, Ll/۠֨֫;->ۙ(Z)V

    return-void
.end method

.method public static final ۙ(Ll/ۧۡ֫;Ll/ۚۡ֫;)V
    .locals 5

    .line 996
    iget-object v0, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v2}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 1000
    :cond_1
    invoke-interface {v2}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getName(...)"

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ll/ۚۡ֫;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 1001
    invoke-interface {v2}, Ll/ۖۗܳ;->isChecked()Z

    move-result v4

    if-eq v4, v3, :cond_0

    .line 1002
    invoke-interface {v2, v3}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    .line 1006
    :cond_2
    invoke-direct {p0, v1, v3}, Ll/ۧۡ֫;->ۙ(ZZ)V

    return-void
.end method

.method public static final ۙ(Ll/ۧۡ֫;Ll/ܰ֨֫;)V
    .locals 1

    .line 1046
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 1047
    invoke-virtual {p1}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object p0

    .line 773
    invoke-interface {p0}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 1048
    invoke-virtual {p1}, Ll/ܰ֨֫;->᩷()Ll/ۖۗܳ;

    move-result-object p0

    invoke-interface {p0}, Ll/ۖۗܳ;->isChecked()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 1049
    :goto_0
    invoke-virtual {p1}, Ll/ܰ֨֫;->ᩴ()Landroid/view/View;

    move-result-object p1

    if-eqz p0, :cond_1

    sget v0, Ll/ۗۡ֫;->ܺ:I

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public static final ۙ(Ll/ۧۡ֫;Z)V
    .locals 1

    .line 113
    iput-boolean p1, p0, Ll/ۧۡ֫;->۟᩷:Z

    .line 114
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v0, "fcrp"

    .line 0
    invoke-static {p0, v0, p1}, Ll/ۛ۬ܳ;->ۙ(Ll/ۢ֫ܺ;Ljava/lang/String;Z)V

    return-void
.end method

.method public static ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V
    .locals 9

    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x1

    :goto_0
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    move-object v7, p2

    .line 628
    iget-object p2, p0, Ll/ۧۡ֫;->ۘ᩷:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v4, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-nez v4, :cond_2

    return-void

    .line 629
    :cond_2
    invoke-virtual {p0}, Ll/ۚۤ;->getLifecycle()Ll/۠ۧۙ;

    move-result-object p3

    const-string v0, "<get-lifecycle>(...)"

    invoke-static {p3, v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 630
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p2

    :goto_1
    move v6, p2

    .line 631
    new-instance p2, Ll/۫ۡ֫;

    move-object v5, p3

    check-cast v5, Ll/ᩴ᩻ۙ;

    move-object v1, p2

    move-object v3, p0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Ll/۫ۡ֫;-><init>(ZLl/ۧۡ֫;Ll/ۜ᩻۫;Ll/ᩴ᩻ۙ;ILl/ᩴ֨᩵;Z)V

    .line 746
    invoke-virtual {p2}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public static ۙ(Ll/ۧ᩶᩻;Ll/ۧۡ֫;)V
    .locals 10

    .line 255
    invoke-virtual {p0}, Ll/ۧ᩶᩻;->᩸()I

    move-result v0

    .line 1042
    invoke-direct {p1}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v1

    const/4 v2, 0x3

    if-eqz v1, :cond_1

    invoke-direct {p1}, Ll/ۧۡ֫;->۫ۙ()I

    move-result v1

    if-lez v1, :cond_1

    if-ne v0, v2, :cond_0

    .line 880
    new-instance p0, Ll/ܺ᩵ܳ;

    new-instance v0, Ll/֫ۡ֫;

    invoke-direct {v0, p1}, Ll/֫ۡ֫;-><init>(Ll/ۧۡ֫;)V

    invoke-direct {p0, p1, v0}, Ll/ܺ᩵ܳ;-><init>(Ll/ܽ֡֫;Ll/֫᩵ܳ;)V

    .line 896
    invoke-virtual {p0}, Ll/ܺ᩵ܳ;->ۙ()V

    return-void

    :cond_0
    const p1, 0x7f120ad8

    const v1, 0x7f120ad1

    const v2, 0x7f120ad0

    const v3, 0x7f120ad7

    const v4, 0x7f120161

    .line 266
    filled-new-array {v2, v3, v4, p1, v1}, [I

    move-result-object p1

    .line 268
    aget p1, p1, v0

    invoke-virtual {p0, v0, p1}, Ll/ۧ᩶᩻;->ۤ(II)V

    return-void

    .line 269
    :cond_1
    invoke-virtual {p0}, Ll/ۧ᩶᩻;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_b

    if-eqz v0, :cond_a

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v3, 0x2

    if-eq v0, v3, :cond_8

    if-eq v0, v2, :cond_3

    const/4 p0, 0x4

    if-eq v0, p0, :cond_2

    goto :goto_1

    .line 284
    :cond_2
    invoke-direct {p1}, Ll/ۧۡ֫;->֫ۙ()V

    return-void

    :cond_3
    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    .line 276
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 275
    invoke-virtual {p0, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 278
    iget-object p0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    const-string v0, "searchView"

    const/4 v2, 0x0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result p0

    if-nez p0, :cond_5

    .line 279
    iget-object p0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz p0, :cond_4

    .line 242
    invoke-virtual {p0, v2}, Ll/ۜܿ᩻;->ۙ(Ljava/lang/String;)V

    goto :goto_0

    .line 279
    :cond_4
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    .line 281
    :cond_5
    :goto_0
    iget-object p0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz p0, :cond_6

    .line 274
    invoke-virtual {p0, v1}, Ll/ۜܿ᩻;->᩷(Z)V

    return-void

    .line 281
    :cond_6
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    .line 278
    :cond_7
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v2

    :cond_8
    const p1, 0x7f1203bb

    .line 273
    invoke-virtual {p0, v3, p1}, Ll/ۧ᩶᩻;->ۤ(II)V

    return-void

    :cond_9
    const p1, 0x7f120409

    .line 272
    invoke-virtual {p0, v1, p1}, Ll/ۧ᩶᩻;->ۤ(II)V

    return-void

    :cond_a
    const p1, 0x7f12011c

    const/4 v0, 0x0

    .line 271
    invoke-virtual {p0, v0, p1}, Ll/ۧ᩶᩻;->ۤ(II)V

    :cond_b
    :goto_1
    return-void
.end method

.method public static ۙ(Ll/۬֨ᩴ;Ll/ۧۡ֫;Landroid/os/Bundle;)V
    .locals 0

    .line 358
    invoke-virtual {p0}, Ll/۬֨ᩴ;->ۙ()V

    .line 359
    invoke-direct {p1, p2}, Ll/ۧۡ֫;->ۙ(Landroid/os/Bundle;)V

    return-void
.end method

.method public static ۙ(Ll/᩹ۖ᩸;Ll/ۧۡ֫;Ll/۠ۖۧ;Ll/֫ۖ᩸;)V
    .locals 3

    .line 1211
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "\\"

    const/4 v1, 0x0

    .line 1182
    invoke-static {p0, v0, v1}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "/"

    invoke-static {p0, v0, v1}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1216
    :cond_0
    iget-object v0, p1, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p0

    .line 1217
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1218
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0x7f1203fe

    .line 1191
    :goto_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p3, p0}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const p0, 0x7f120a80

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    .line 1227
    :try_start_0
    iget-object v0, p1, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    invoke-static {v0}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll/ۜ᩻۫;->ܰ()Ljava/lang/String;

    move-result-object v0

    .line 1228
    sget-object v2, Ll/ۨ۠ۧ;->۟:Ll/ۨ۠ۧ;

    .line 1226
    invoke-static {v0, v2}, Ll/ۛ۠ۧ;->ۙ(Ljava/lang/String;Ll/ۨ۠ۧ;)V
    :try_end_0
    .catch Ll/ۙۧܺ; {:try_start_0 .. :try_end_0} :catch_1

    .line 1235
    :try_start_1
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ۡ()V

    .line 1236
    new-instance v0, Ll/ۤ֨֫;

    invoke-direct {v0, p0, p1}, Ll/ۤ֨֫;-><init>(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)V

    const/4 p0, 0x2

    .line 618
    invoke-static {p1, v1, v0, p0}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 1239
    invoke-virtual {p2}, Ll/۠ۖۧ;->dismiss()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 546
    :goto_1
    invoke-virtual {p1, p0, p3}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_3
    :goto_2
    const p0, 0x7f1203b0

    goto :goto_0
.end method

.method public static ۙ(Ll/᩻֫ܺ;Ll/ۧۡ֫;Ll/ۧ᩶᩻;)V
    .locals 11

    .line 233
    iget-object v0, p1, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {p0}, Ll/᩻֫ܺ;->ۤ()Z

    move-result p0

    if-eqz p0, :cond_0

    goto/16 :goto_a

    .line 1042
    :cond_0
    invoke-direct {p1}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result p0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p0, :cond_1

    invoke-direct {p1}, Ll/ۧۡ֫;->۫ۙ()I

    move-result p0

    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eqz p0, :cond_11

    .line 235
    invoke-virtual {p2}, Ll/ۧ᩶᩻;->᩸()I

    move-result p0

    if-eqz p0, :cond_e

    if-eq p0, v1, :cond_b

    if-eq p0, v4, :cond_9

    const/4 p2, 0x3

    if-eq p0, p2, :cond_3

    if-eq p0, v3, :cond_2

    goto/16 :goto_a

    :cond_2
    const p0, 0x7f120ad1

    const p2, 0x7f120ad4

    .line 415
    invoke-virtual {p1, p0, p2, v2}, Ll/ܽ֡֫;->ۙ(IIZ)V

    return-void

    .line 900
    :cond_3
    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 901
    iget-object p2, p1, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "getName(...)"

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v3}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 902
    invoke-interface {v3}, Ll/ۖۗܳ;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 903
    invoke-interface {v3}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Ll/ۛ֨֫;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 906
    :cond_5
    invoke-virtual {p0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    goto/16 :goto_a

    .line 910
    :cond_6
    iget-object p2, p1, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v3, 0x0

    :cond_7
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v5}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v6

    if-eqz v6, :cond_7

    .line 913
    invoke-interface {v5}, Ll/ۖۗܳ;->isChecked()Z

    move-result v6

    if-nez v6, :cond_7

    .line 914
    invoke-interface {v5}, Ll/ۖۗܳ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Ll/ۛ֨֫;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 916
    invoke-interface {v5, v1}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 v3, 0x1

    goto :goto_2

    .line 920
    :cond_8
    invoke-direct {p1}, Ll/ۧۡ֫;->᩻ۙ()V

    if-eqz v3, :cond_24

    .line 922
    invoke-virtual {v0, v2}, Ll/۠֨֫;->ۙ(Z)V

    return-void

    .line 838
    :cond_9
    invoke-direct {p1}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_a

    .line 841
    :cond_a
    invoke-direct {p1}, Ll/ۧۡ֫;->᩸ۙ()Z

    move-result p0

    .line 842
    invoke-direct {p1}, Ll/ۧۡ֫;->᩻ۙ()V

    if-eqz p0, :cond_24

    .line 844
    invoke-virtual {v0, v2}, Ll/۠֨֫;->ۙ(Z)V

    return-void

    .line 864
    :cond_b
    iget-object p0, p1, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x0

    :cond_c
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v3}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 866
    invoke-interface {v3}, Ll/ۖۗܳ;->isChecked()Z

    move-result p2

    xor-int/2addr p2, v1

    invoke-interface {v3, p2}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 p2, 0x1

    goto :goto_3

    .line 870
    :cond_d
    invoke-direct {p1}, Ll/ۧۡ֫;->᩻ۙ()V

    if-eqz p2, :cond_24

    .line 872
    invoke-virtual {v0, v2}, Ll/۠֨֫;->ۙ(Z)V

    return-void

    .line 850
    :cond_e
    iget-object p0, p1, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p2, 0x0

    :cond_f
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v3}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v4

    if-eqz v4, :cond_f

    .line 851
    invoke-interface {v3}, Ll/ۖۗܳ;->isChecked()Z

    move-result v4

    if-nez v4, :cond_f

    .line 852
    invoke-interface {v3, v1}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 p2, 0x1

    goto :goto_4

    .line 856
    :cond_10
    invoke-direct {p1}, Ll/ۧۡ֫;->᩻ۙ()V

    if-eqz p2, :cond_24

    .line 858
    invoke-virtual {v0, v2}, Ll/۠֨֫;->ۙ(Z)V

    return-void

    .line 247
    :cond_11
    invoke-virtual {p2}, Ll/ۧ᩶᩻;->᩸()I

    move-result p0

    const-string p2, "swipeRefreshLayout"

    const-string v0, ""

    const-string v5, "filterText"

    const-string v6, "searchView"

    const/4 v7, 0x0

    if-eqz p0, :cond_22

    if-eq p0, v1, :cond_16

    if-eq p0, v4, :cond_13

    if-eq p0, v3, :cond_12

    goto/16 :goto_a

    .line 251
    :cond_12
    invoke-direct {p1}, Ll/ۧۡ֫;->᩷ۙ()V

    return-void

    :cond_13
    const p0, 0x7f0d00a0

    .line 1180
    invoke-virtual {p1, p0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object p0

    const p2, 0x7f0a0186

    .line 1181
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/᩹ۖ᩸;

    const v0, 0x7f0a02ba

    .line 1182
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/֫ۖ᩸;

    .line 1183
    new-instance v3, Ll/ۜ֨֫;

    invoke-direct {v3, v0}, Ll/ۜ֨֫;-><init>(Ll/֫ۖ᩸;)V

    invoke-virtual {p2, v3}, Ll/᩺ۜ᩸;->ۙ(Landroid/text/TextWatcher;)V

    .line 1194
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v3

    invoke-virtual {v3, p0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    invoke-virtual {v3, v2}, Ll/ۖۖۧ;->ۙ(Z)V

    .line 1196
    iget v2, p1, Ll/ۧۡ֫;->۠᩷:I

    if-eqz v2, :cond_14

    goto :goto_5

    :cond_14
    const/4 v1, 0x0

    :goto_5
    const v2, 0x7f120161

    const v4, 0x7f0a0681

    if-eqz v1, :cond_15

    .line 1198
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v4, 0x7f120207

    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(I)V

    const p0, 0x7f1203fd

    .line 1199
    invoke-virtual {v3, p0, v7}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f120395

    .line 1200
    invoke-virtual {v3, p0, v7}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1201
    invoke-virtual {v3, v2, v7}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    goto :goto_6

    .line 1203
    :cond_15
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    const v4, 0x7f1203bb

    invoke-virtual {p0, v4}, Landroid/widget/TextView;->setText(I)V

    const p0, 0x7f1208c9

    .line 1204
    invoke-virtual {v3, p0, v7}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1205
    invoke-virtual {v3, v2, v7}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1207
    :goto_6
    invoke-virtual {v3}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    move-result-object p0

    .line 1208
    invoke-static {p0}, Ll/᩶ۢᩴ;->ۙ(Ll/۠ۖۧ;)V

    .line 1209
    invoke-static {p2}, Ll/᩶᩷ۧ;->᩷(Landroid/view/View;)V

    .line 1210
    invoke-virtual {p0}, Ll/۠ۖۧ;->ᩴ()Landroid/widget/Button;

    move-result-object v2

    new-instance v3, Ll/ۖۢ֫;

    invoke-direct {v3, p2, p1, p0, v0}, Ll/ۖۢ֫;-><init>(Ll/᩹ۖ᩸;Ll/ۧۡ֫;Ll/۠ۖۧ;Ll/֫ۖ᩸;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz v1, :cond_24

    .line 1245
    invoke-virtual {p0}, Ll/۠ۖۧ;->ۤ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/۠ۢ֫;

    invoke-direct {v2, p2, p1, p0, v0}, Ll/۠ۢ֫;-><init>(Ll/᩹ۖ᩸;Ll/ۧۡ֫;Ll/۠ۖۧ;Ll/֫ۖ᩸;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 1150
    :cond_16
    iget-object p0, p1, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    if-eqz p0, :cond_21

    invoke-virtual {p0}, Ll/ۗ֨᩷;->᩷()Z

    move-result p0

    if-eqz p0, :cond_17

    goto/16 :goto_a

    .line 1153
    :cond_17
    iget-object p0, p1, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-nez p0, :cond_18

    goto/16 :goto_a

    .line 1154
    :cond_18
    iget-object p2, p0, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    invoke-direct {p1}, Ll/ۧۡ֫;->ܳۙ()Ll/ۖ᩵ܳ;

    move-result-object v3

    invoke-virtual {p2, v3}, Ll/۠᩵ܳ;->᩷(Ll/ۖ᩵ܳ;)Ll/ۖ᩵ܳ;

    move-result-object p2

    .line 1155
    invoke-virtual {p0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v3

    .line 830
    invoke-direct {p1}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v8

    if-nez v8, :cond_19

    goto :goto_7

    .line 833
    :cond_19
    invoke-direct {p1}, Ll/ۧۡ֫;->᩸ۙ()Z

    .line 834
    invoke-direct {p1}, Ll/ۧۡ֫;->᩻ۙ()V

    .line 1157
    :goto_7
    iget-object v8, p2, Ll/ۖ᩵ܳ;->ۤ:Ljava/lang/String;

    iget-object v9, p2, Ll/ۖ᩵ܳ;->᩷:Ljava/lang/String;

    invoke-virtual {p0, v8}, Ll/ۜ᩻۫;->ᩴ(Ljava/lang/String;)V

    .line 1158
    invoke-virtual {p0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object p0

    .line 1160
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v10

    if-le v8, v10, :cond_1a

    invoke-static {v3}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 169
    invoke-virtual {p0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1a

    .line 1161
    invoke-static {v3}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_8

    :cond_1a
    move-object p0, v7

    .line 1165
    :goto_8
    iget-boolean v3, p2, Ll/ۖ᩵ܳ;->ۙ:Z

    if-eqz v3, :cond_1d

    .line 1166
    iget-object v0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_1c

    .line 242
    invoke-virtual {v0, v9}, Ll/ۜܿ᩻;->ۙ(Ljava/lang/String;)V

    .line 1167
    iget-object v0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_1b

    invoke-virtual {v0, v2}, Ll/ۜܿ᩻;->᩷(Z)V

    .line 1168
    invoke-static {v9, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p1, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    goto :goto_9

    .line 1167
    :cond_1b
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1166
    :cond_1c
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1169
    :cond_1d
    iget-object v2, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_1f

    .line 1170
    iput-object v0, p1, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    .line 1171
    iget-object v0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ll/ۜܿ᩻;->᩸()V

    goto :goto_9

    :cond_1e
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1173
    :cond_1f
    :goto_9
    new-instance v0, Ll/ۡۢ֫;

    invoke-direct {v0, p1, p2, p0}, Ll/ۡۢ֫;-><init>(Ll/ۧۡ֫;Ll/ۖ᩵ܳ;Ljava/lang/String;)V

    invoke-static {p1, v1, v0, v4}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 1176
    invoke-direct {p1}, Ll/ۧۡ֫;->ۧۙ()V

    return-void

    .line 1169
    :cond_20
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1150
    :cond_21
    invoke-static {p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1113
    :cond_22
    iget-object p0, p1, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    if-eqz p0, :cond_2e

    invoke-virtual {p0}, Ll/ۗ֨᩷;->᩷()Z

    move-result p0

    if-eqz p0, :cond_23

    goto :goto_a

    .line 1116
    :cond_23
    iget-object p0, p1, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-nez p0, :cond_25

    :cond_24
    :goto_a
    return-void

    .line 1117
    :cond_25
    iget-object p2, p0, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    invoke-direct {p1}, Ll/ۧۡ֫;->ܳۙ()Ll/ۖ᩵ܳ;

    move-result-object v3

    invoke-virtual {p2, v3}, Ll/۠᩵ܳ;->ۙ(Ll/ۖ᩵ܳ;)Ll/ۖ᩵ܳ;

    move-result-object p2

    .line 1118
    invoke-virtual {p0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v3

    .line 830
    invoke-direct {p1}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v8

    if-nez v8, :cond_26

    goto :goto_b

    .line 833
    :cond_26
    invoke-direct {p1}, Ll/ۧۡ֫;->᩸ۙ()Z

    .line 834
    invoke-direct {p1}, Ll/ۧۡ֫;->᩻ۙ()V

    .line 1120
    :goto_b
    iget-object v8, p2, Ll/ۖ᩵ܳ;->ۤ:Ljava/lang/String;

    iget-object v9, p2, Ll/ۖ᩵ܳ;->᩷:Ljava/lang/String;

    invoke-virtual {p0, v8}, Ll/ۜ᩻۫;->ᩴ(Ljava/lang/String;)V

    .line 1121
    invoke-virtual {p0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object p0

    .line 1123
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v10

    if-le v8, v10, :cond_27

    invoke-static {v3}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 169
    invoke-virtual {p0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_27

    .line 1124
    invoke-static {v3}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_c

    :cond_27
    move-object p0, v7

    .line 1128
    :goto_c
    iget-boolean v3, p2, Ll/ۖ᩵ܳ;->ۙ:Z

    if-eqz v3, :cond_2a

    .line 1129
    iget-object v0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_29

    .line 242
    invoke-virtual {v0, v9}, Ll/ۜܿ᩻;->ۙ(Ljava/lang/String;)V

    .line 1130
    iget-object v0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_28

    invoke-virtual {v0, v2}, Ll/ۜܿ᩻;->᩷(Z)V

    .line 1131
    invoke-static {v9, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v9, p1, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    goto :goto_d

    .line 1130
    :cond_28
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1129
    :cond_29
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1132
    :cond_2a
    iget-object v2, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v2, :cond_2d

    invoke-virtual {v2}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_2c

    .line 1133
    iput-object v0, p1, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    .line 1134
    iget-object v0, p1, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Ll/ۜܿ᩻;->᩸()V

    goto :goto_d

    :cond_2b
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1136
    :cond_2c
    :goto_d
    new-instance v0, Ll/ۜۢ֫;

    invoke-direct {v0, p1, p2, p0}, Ll/ۜۢ֫;-><init>(Ll/ۧۡ֫;Ll/ۖ᩵ܳ;Ljava/lang/String;)V

    invoke-static {p1, v1, v0, v4}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 1139
    invoke-direct {p1}, Ll/ۧۡ֫;->ۧۙ()V

    return-void

    .line 1132
    :cond_2d
    invoke-static {v6}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7

    .line 1113
    :cond_2e
    invoke-static {p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v7
.end method

.method public static ۙ(ZLl/ۧۡ֫;Ll/᩷ۨᩴ;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 478
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    const-string p2, "getPath(...)"

    invoke-static {p0, p2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 1287
    invoke-direct {p1, p0, p2}, Ll/ۧۡ֫;->ۙ(Ljava/lang/String;Ll/ᩴ֨᩵;)V

    return-void

    .line 480
    :cond_0
    invoke-virtual {p2}, Ll/᩷ۨᩴ;->᩻ۙ()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ll/ܳ֨֫;

    invoke-direct {v0, p2, p1}, Ll/ܳ֨֫;-><init>(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)V

    invoke-direct {p1, p0, v0}, Ll/ۧۡ֫;->ۙ(Ljava/lang/String;Ll/ᩴ֨᩵;)V

    return-void
.end method

.method private final ۙ(ZZ)V
    .locals 1

    .line 1013
    invoke-direct {p0}, Ll/ۧۡ֫;->᩻ۙ()V

    if-eqz p1, :cond_0

    .line 1015
    iget-object p1, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/۠֨֫;->ۙ(Z)V

    :cond_0
    if-eqz p2, :cond_1

    .line 1017
    invoke-direct {p0}, Ll/ۧۡ֫;->۫ۙ()I

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f1208ad

    .line 1018
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    :cond_1
    return-void
.end method

.method public static final synthetic ۚ(Ll/ۧۡ֫;)Ll/ܺ֡ܳ;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->۫᩷:Ll/ܺ֡ܳ;

    return-object p0
.end method

.method private final ۚۙ()Z
    .locals 2

    .line 769
    iget v0, p0, Ll/ۧۡ֫;->۠᩷:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final synthetic ۛ(Ll/ۧۡ֫;)Ljava/util/HashSet;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->֨᩷:Ljava/util/HashSet;

    return-object p0
.end method

.method private final ۤ(Ljava/lang/String;)V
    .locals 3

    .line 1377
    iget-object v0, p0, Ll/ۧۡ֫;->ۗ᩷:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 1378
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    invoke-static {p1}, Ll/ܳۧܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    .line 1380
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1381
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "getIntent(...)"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1435
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-static {v1, v2}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1382
    invoke-static {p1}, Ll/ܽۨᩴ;->ۙ(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/4 p1, 0x1

    .line 1383
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 p1, 0x2

    .line 1384
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_0

    :cond_1
    const-string v1, "path"

    .line 1386
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1387
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v1, "extra"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 1388
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    :cond_2
    :goto_0
    const/4 p1, -0x1

    .line 1391
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 1392
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public static ۤ(Ll/ۧۡ֫;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ll/ۧۡ֫;->֫ۙ()V

    return-void
.end method

.method public static final ۤ(Ll/ۧۡ֫;I)V
    .locals 1

    .line 108
    iput p1, p0, Ll/ۧۡ֫;->ᩳ᩷:I

    .line 109
    sget-object p0, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    const-string v0, "fcsp"

    invoke-interface {p0, p1, v0}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    return-void
.end method

.method public static synthetic ۤ(Ll/ۧۡ֫;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1287
    invoke-direct {p0, p1, v0}, Ll/ۧۡ֫;->ۙ(Ljava/lang/String;Ll/ᩴ֨᩵;)V

    return-void
.end method

.method public static ۤ(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)V
    .locals 3

    .line 1360
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    .line 155
    invoke-static {v0, v2}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;)V

    .line 1361
    invoke-virtual {p0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0}, Ll/ۧۡ֫;->ۤ(Ljava/lang/String;)V

    return-void
.end method

.method private final ۤۙ()V
    .locals 4

    .line 1055
    iget-object v0, p0, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/ۗ֨᩷;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1058
    :cond_0
    iget-object v0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 1059
    :cond_1
    invoke-virtual {v0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-static {v1}, Ll/ۧ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1061
    invoke-static {v1}, Ll/ۧ֫ܺ;->ۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    .line 1063
    iget-object v0, p0, Ll/ۧۡ֫;->᩻᩷:Ll/᩻֫ܺ;

    invoke-virtual {v0}, Ll/᩻֫ܺ;->ۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f12095a

    .line 1064
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 1066
    :cond_2
    invoke-static {}, Ll/᩸۠ۧ;->ۤ()V

    .line 1067
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    .line 1071
    :cond_3
    new-instance v3, Ll/۬ۢ֫;

    invoke-direct {v3, v0, v1, p0, v2}, Ll/۬ۢ֫;-><init>(Ll/ۜ᩻۫;Ljava/lang/String;Ll/ۧۡ֫;Ljava/lang/String;)V

    invoke-direct {p0, v1, v3}, Ll/ۧۡ֫;->ۙ(Ljava/lang/String;Ll/ᩴ֨᩵;)V

    return-void

    :cond_4
    const-string v0, "swipeRefreshLayout"

    .line 1055
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final synthetic ۧ(Ll/ۧۡ֫;)I
    .locals 0

    .line 97
    iget p0, p0, Ll/ۧۡ֫;->ܺ᩷:I

    return p0
.end method

.method private final ۧۙ()V
    .locals 7

    .line 609
    iget-object v0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 610
    invoke-virtual {v0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getPath(...)"

    invoke-static {v2, v3}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v2, v1}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;)V

    .line 611
    iget-object v2, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {v0}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 613
    :cond_0
    iget-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    const-string v2, "bottomToolbar"

    if-eqz v0, :cond_8

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ll/ۧ᩶᩻;->ۙ(I)Ll/ᩴ᩶᩻;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    check-cast v0, Ll/ܳ᩶᩻;

    .line 1106
    iget-object v4, p0, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    const-string v5, "swipeRefreshLayout"

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ll/ۗ֨᩷;->᩷()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    goto :goto_0

    .line 1109
    :cond_1
    iget-object v4, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-eqz v4, :cond_2

    iget-object v4, v4, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ll/۠᩵ܳ;->ۙ()Z

    move-result v4

    if-ne v4, v6, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x0

    .line 613
    :goto_1
    invoke-virtual {v0, v4}, Ll/ܳ᩶᩻;->ۙ(Z)V

    .line 614
    iget-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    if-eqz v0, :cond_6

    invoke-virtual {v0, v6}, Ll/ۧ᩶᩻;->ۙ(I)Ll/ᩴ᩶᩻;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    check-cast v0, Ll/ܳ᩶᩻;

    .line 1143
    iget-object v2, p0, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ll/ۗ֨᩷;->᩷()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 1146
    :cond_3
    iget-object v1, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-eqz v1, :cond_4

    iget-object v1, v1, Ll/ۜ᩵ܳ;->ۚ:Ll/۠᩵ܳ;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ll/۠᩵ܳ;->᩷()Z

    move-result v1

    if-ne v1, v6, :cond_4

    const/4 v3, 0x1

    .line 614
    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, Ll/ܳ᩶᩻;->ۙ(Z)V

    return-void

    .line 1143
    :cond_5
    invoke-static {v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 614
    :cond_6
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 1106
    :cond_7
    invoke-static {v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 613
    :cond_8
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic ۨ(Ll/ۧۡ֫;)I
    .locals 0

    .line 97
    iget p0, p0, Ll/ۧۡ֫;->ᩳ᩷:I

    return p0
.end method

.method public static final synthetic ۫(Ll/ۧۡ֫;)Ll/ۘ֨֫;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ᩴ᩷:Ll/ۘ֨֫;

    return-object p0
.end method

.method private final ۫ۙ()I
    .locals 4

    .line 801
    iget-object v0, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v2}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 802
    invoke-interface {v2}, Ll/ۖۗܳ;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static final synthetic ܰ(Ll/ۧۡ֫;)I
    .locals 0

    .line 97
    iget p0, p0, Ll/ۧۡ֫;->۠᩷:I

    return p0
.end method

.method public static final synthetic ܳ(Ll/ۧۡ֫;)Ljava/util/List;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->᩸᩷:Ljava/lang/Object;

    return-object p0
.end method

.method private final ܳۙ()Ll/ۖ᩵ܳ;
    .locals 5

    .line 1285
    new-instance v0, Ll/ۖ᩵ܳ;

    iget-object v1, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {v2}, Ll/۠֨֫;->ۙ()I

    move-result v2

    iget-object v3, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result v3

    iget-object v4, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v4, v3}, Ll/ۖ᩵ܳ;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    return-object v0

    :cond_0
    const-string v0, "searchView"

    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final synthetic ܶ(Ll/ۧۡ֫;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ۘ᩷:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static final synthetic ܺ(Ll/ۧۡ֫;)Ljava/lang/String;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic ܽ(Ll/ۧۡ֫;)Ljava/util/List;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic ܿ(Ll/ۧۡ֫;)Ll/ۜ᩻۫;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    return-object p0
.end method

.method public static final synthetic ᩴ(Ll/ۧۡ֫;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ll/ۧۡ֫;->ۤۙ()V

    return-void
.end method

.method private final ᩴۙ()Ljava/util/HashSet;
    .locals 4

    .line 777
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 778
    iget-object v1, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v2}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 779
    invoke-interface {v2}, Ll/ۖۗܳ;->isChecked()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 780
    invoke-interface {v2}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final synthetic ᩵(Ll/ۧۡ֫;)Z
    .locals 0

    .line 97
    iget-boolean p0, p0, Ll/ۧۡ֫;->۟᩷:Z

    return p0
.end method

.method public static final synthetic ᩶(Ll/ۧۡ֫;)Ll/۠֨֫;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    return-object p0
.end method

.method public static ᩷(Ll/ۧۡ֫;Ll/ۖ᩵ܳ;Ljava/lang/String;)Ll/ۧ۟᩵;
    .locals 0

    .line 1174
    iget-object p0, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    iget p1, p1, Ll/ۖ᩵ܳ;->᩸:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Ll/۠֨֫;->ۙ(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1175
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static ᩷(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)Ll/ۧ۟᩵;
    .locals 1

    .line 481
    iget-object p1, p1, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/۠֨֫;->ۙ(Ljava/lang/String;)V

    .line 482
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static ᩷(Ll/ۧۡ֫;)V
    .locals 0

    .line 168
    iget-object p0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-eqz p0, :cond_0

    .line 169
    invoke-virtual {p0}, Ll/ۜ᩵ܳ;->ۘ()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static final synthetic ᩷(Ll/ۧۡ֫;I)V
    .locals 0

    .line 97
    iput p1, p0, Ll/ۧۡ֫;->ۨ᩷:I

    return-void
.end method

.method public static final ᩷(Ll/ۧۡ֫;JJ)V
    .locals 6

    .line 960
    iget-object v0, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v2}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 964
    :cond_1
    invoke-interface {v2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v3

    cmp-long v5, p1, v3

    if-gtz v5, :cond_2

    invoke-interface {v2}, Ll/ۖۗܳ;->getTime()J

    move-result-wide v3

    cmp-long v5, v3, p3

    if-gez v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 965
    :goto_1
    invoke-interface {v2}, Ll/ۖۗܳ;->isChecked()Z

    move-result v4

    if-eq v4, v3, :cond_0

    .line 966
    invoke-interface {v2, v3}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 v1, 0x1

    goto :goto_0

    .line 970
    :cond_3
    invoke-direct {p0, v1, v3}, Ll/ۧۡ֫;->ۙ(ZZ)V

    return-void
.end method

.method public static final synthetic ᩷(Ll/ۧۡ֫;Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Ll/ۧۡ֫;->ܶ᩷:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic ᩷(Ll/ۧۡ֫;Ljava/util/List;)V
    .locals 0

    .line 97
    iput-object p1, p0, Ll/ۧۡ֫;->᩵᩷:Ljava/util/List;

    return-void
.end method

.method public static ᩷(Ll/᩹ۖ᩸;Ll/ۧۡ֫;Ll/۠ۖۧ;Ll/֫ۖ᩸;)V
    .locals 5

    const-string v0, "Failed to create file: "

    .line 1246
    invoke-virtual {p0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\\"

    const/4 v2, 0x0

    .line 1182
    invoke-static {p0, v1, v2}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "/"

    invoke-static {p0, v1, v2}, Ll/֨ۖ᩵;->ۙ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    .line 1251
    :cond_0
    iget-object v1, p1, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    invoke-static {v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v1

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object v1

    .line 1252
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 1253
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->ۛۙ()Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0x7f120a81

    .line 1191
    :goto_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p3, p0}, Ll/֫ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const p0, 0x7f1203a3

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    .line 1262
    :try_start_0
    iget-object v3, p1, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    invoke-static {v3}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ll/ۜ᩻۫;->ܰ()Ljava/lang/String;

    move-result-object v3

    .line 1263
    sget-object v4, Ll/ۨ۠ۧ;->۟:Ll/ۨ۠ۧ;

    .line 1261
    invoke-static {v3, v4}, Ll/ۛ۠ۧ;->ۙ(Ljava/lang/String;Ll/ۨ۠ۧ;)V
    :try_end_0
    .catch Ll/ۙۧܺ; {:try_start_0 .. :try_end_0} :catch_1

    .line 1270
    :try_start_1
    invoke-virtual {v1}, Ll/᩷ۨᩴ;->۟()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1273
    new-instance p0, Ll/᩸֨֫;

    invoke-direct {p0, v1, p1}, Ll/᩸֨֫;-><init>(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)V

    const/4 v0, 0x2

    .line 618
    invoke-static {p1, v2, p0, v0}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 1276
    invoke-virtual {p2}, Ll/۠ۖۧ;->dismiss()V

    return-void

    .line 1271
    :cond_3
    new-instance p2, Ljava/lang/Exception;

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    .line 546
    :goto_1
    invoke-virtual {p1, p0, p3}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_4
    :goto_2
    const p0, 0x7f1203b0

    goto :goto_0
.end method

.method private final ᩷ۙ()V
    .locals 3

    .line 1078
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Ll/ۧۡ֫;->ᩴۙ()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 838
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 841
    :cond_0
    invoke-direct {p0}, Ll/ۧۡ֫;->᩸ۙ()Z

    move-result v0

    .line 842
    invoke-direct {p0}, Ll/ۧۡ֫;->᩻ۙ()V

    if-eqz v0, :cond_1

    .line 844
    iget-object v0, p0, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/۠֨֫;->ۙ(Z)V

    :cond_1
    :goto_0
    return-void

    .line 1080
    :cond_2
    iget-object v0, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    const/4 v1, 0x0

    const-string v2, "searchView"

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1081
    iget-object v0, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ll/ۜܿ᩻;->᩷()V

    return-void

    :cond_3
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 1083
    :cond_4
    invoke-direct {p0}, Ll/ۧۡ֫;->ۤۙ()V

    return-void

    .line 1080
    :cond_5
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1
.end method

.method public static ᩸(Ll/᩷ۨᩴ;Ll/ۧۡ֫;)Ll/ۧ۟᩵;
    .locals 1

    .line 1237
    iget-object p1, p1, Ll/ۧۡ֫;->ۜ᩷:Ll/۠֨֫;

    invoke-virtual {p0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getName(...)"

    invoke-static {p0, v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ll/۠֨֫;->ۙ(Ljava/lang/String;)V

    .line 1238
    sget-object p0, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return-object p0
.end method

.method public static final synthetic ᩸(Ll/ۧۡ֫;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ll/ۧۡ֫;->᩷ۙ()V

    return-void
.end method

.method private final ᩸ۙ()Z
    .locals 5

    .line 820
    iget-object v0, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۗܳ;

    .line 821
    invoke-interface {v3}, Ll/ۖۗܳ;->ܺ᩷()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v3}, Ll/ۖۗܳ;->isChecked()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 822
    invoke-interface {v3, v1}, Ll/ۖۗܳ;->setChecked(Z)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public static final synthetic ᩹(Ll/ۧۡ֫;)Ljava/util/List;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic ᩺(Ll/ۧۡ֫;)Ljava/util/HashSet;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ۡ᩷:Ljava/util/HashSet;

    return-object p0
.end method

.method public static final synthetic ᩻(Ll/ۧۡ֫;)Ll/᩹ۖ᩸;
    .locals 0

    .line 97
    iget-object p0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    return-object p0
.end method

.method private final ᩻ۙ()V
    .locals 4

    .line 1023
    invoke-direct {p0}, Ll/ۧۡ֫;->ۚۙ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1026
    :cond_0
    invoke-direct {p0}, Ll/ۧۡ֫;->۫ۙ()I

    move-result v0

    const v1, 0x7f0a00ae

    .line 1027
    invoke-virtual {p0, v1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 1028
    iget v2, p0, Ll/ۧۡ֫;->ܰ᩷:I

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-lez v0, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 1029
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    const/4 v1, 0x0

    const-string v2, "bottomToolbar"

    if-lez v0, :cond_3

    .line 1032
    iget-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/ۧ᩶᩻;->ۧ()V

    return-void

    :cond_2
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1

    .line 1034
    :cond_3
    iget-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ll/ۧ᩶᩻;->֫()V

    return-void

    :cond_4
    invoke-static {v2}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 1340
    iget-object p1, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-nez p1, :cond_0

    goto/16 :goto_5

    .line 1341
    :cond_0
    iget v0, p0, Ll/ۧۡ֫;->۠᩷:I

    const-string v1, "getPath(...)"

    if-eqz v0, :cond_11

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eq v0, v4, :cond_e

    const/4 p1, 0x3

    if-ne v0, p1, :cond_d

    .line 787
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 788
    iget-object v0, p0, Ll/ۧۡ֫;->᩶᩷:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۗܳ;

    .line 773
    invoke-interface {v1}, Ll/ۖۗܳ;->֡ۙ()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 789
    invoke-interface {v1}, Ll/ۖۗܳ;->isChecked()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 790
    invoke-interface {v1}, Ll/ۖۗܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1348
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    .line 1396
    iget-object v0, p0, Ll/ۧۡ֫;->ۗ᩷:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 1397
    iget-object v1, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/ܳۧܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1398
    :cond_4
    sget-object v6, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {v6}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v6

    invoke-interface {v6, v0, v1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->apply()V

    .line 1400
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1435
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "paths"

    if-eqz v0, :cond_a

    .line 1460
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1461
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v2, :cond_6

    .line 1462
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ll/ܽۨᩴ;->ۙ(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_3

    .line 1465
    :cond_6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    add-int/lit8 v7, v3, 0x1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 1466
    invoke-static {v8}, Ll/ܽۨᩴ;->ۙ(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    if-nez v3, :cond_7

    .line 1468
    invoke-static {v1, v8}, Landroid/content/ClipData;->newRawUri(Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    move-result-object v3

    move-object v5, v3

    goto :goto_2

    :cond_7
    if-eqz v5, :cond_8

    .line 1470
    new-instance v3, Landroid/content/ClipData$Item;

    invoke-direct {v3, v8}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v5, v3}, Landroid/content/ClipData;->addItem(Landroid/content/ClipData$Item;)V

    :cond_8
    :goto_2
    move v3, v7

    goto :goto_1

    .line 1473
    :cond_9
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 1475
    :goto_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_b

    .line 1476
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1477
    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_4

    .line 1452
    :cond_a
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    move-result-object v0

    const-string p1, "putStringArrayListExtra(...)"

    invoke-static {v0, p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_b
    :goto_4
    const/4 p1, -0x1

    .line 1405
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 1406
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_c
    :goto_5
    return-void

    .line 1371
    :cond_d
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1354
    :cond_e
    invoke-virtual {p1}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ll/᩺ۜ᩸;->ܳ᩷()Ll/ᩳ۬᩸;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܰۨᩴ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷ۨᩴ;

    move-result-object p1

    .line 1355
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->֨()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1356
    invoke-virtual {p0}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object v0

    const v1, 0x7f120d44

    .line 1357
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(I)V

    .line 1358
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v1, v2, v3

    const v1, 0x7f1203b7

    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(Ljava/lang/CharSequence;)V

    .line 1359
    new-instance v1, Ll/ۢۢ֫;

    invoke-direct {v1, v3, p1, p0}, Ll/ۢۢ֫;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x7f1208c9

    invoke-virtual {v0, p1, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120161

    .line 1362
    invoke-virtual {v0, p1, v5}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1363
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 1365
    :cond_f
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    invoke-static {v0, v5}, Ll/᩸ܿܳ;->ۙ(Ljava/lang/String;Ll/۠᩶ܳ;)V

    .line 1366
    invoke-virtual {p1}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ۧۡ֫;->ۤ(Ljava/lang/String;)V

    return-void

    :cond_10
    const-string p1, "filenameEditText"

    .line 1354
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v5

    .line 1343
    :cond_11
    invoke-virtual {p1}, Ll/ۜ᩵ܳ;->᩺()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ll/ۧۡ֫;->ۤ(Ljava/lang/String;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 7

    .line 147
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    .line 148
    invoke-virtual {p0}, Ll/ܽ֡֫;->ܰ()V

    const v0, 0x7f0d0026

    .line 149
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    .line 150
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object v0

    .line 1088
    new-instance v1, Ll/ۙۡ֫;

    invoke-direct {v1, p0}, Ll/ۙۡ֫;-><init>(Ll/ۧۡ֫;)V

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۜۤ;->ۙ(Ll/ۛۤ;)Ll/֡᩷;

    .line 151
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "getIntent(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1435
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f120ae9

    .line 152
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(I)V

    goto :goto_0

    .line 154
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "title"

    const v2, 0x7f120395

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(I)V

    :goto_0
    const v0, 0x7f0a068a

    .line 157
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩹;

    iput-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 159
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    .line 160
    invoke-virtual {p0}, Ll/ۘᩴ;->ۨ()Ll/ۖ᩸;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Ll/ۖ᩸;->ۤ(Z)V

    :cond_1
    const v1, 0x7f0801bf

    .line 161
    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setNavigationIcon(I)V

    .line 162
    new-instance v1, Ll/֫᩶ۤ;

    const/4 v3, 0x5

    invoke-direct {v1, v3, p0}, Ll/֫᩶ۤ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v1, "..."

    .line 163
    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 164
    invoke-static {v0}, Ll/ۜ֡᩻;->᩸(Ll/ܶ᩹;)Landroid/widget/TextView;

    move-result-object v1

    .line 165
    invoke-static {v0}, Ll/ۜ֡᩻;->ۤ(Ll/ܶ᩹;)Landroid/widget/TextView;

    move-result-object v0

    .line 166
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 167
    new-instance v3, Ll/᩷֨֫;

    invoke-direct {v3, p0}, Ll/᩷֨֫;-><init>(Ll/ۧۡ֫;)V

    .line 173
    new-instance v4, Ll/۫֨֫;

    invoke-direct {v4, p0}, Ll/۫֨֫;-><init>(Ll/ۧۡ֫;)V

    .line 174
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 177
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a01fb

    .line 180
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "view(...)"

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/᩹ۖ᩸;

    iput-object v0, p0, Ll/ۧۡ֫;->ܽ᩷:Ll/᩹ۖ᩸;

    const v0, 0x7f0a04d5

    .line 181
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۚܿ᩻;

    iput-object v0, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    const v0, 0x7f0a04f0

    .line 182
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۗ֨᩷;

    iput-object v0, p0, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    const v0, 0x7f0a009e

    .line 183
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ll/ۧۡ֫;->֫᩷:Landroid/view/View;

    .line 184
    new-instance v0, Ll/ۘ֨֫;

    invoke-direct {v0, p0}, Ll/ۘ֨֫;-><init>(Ll/ۧۡ֫;)V

    iput-object v0, p0, Ll/ۧۡ֫;->ᩴ᩷:Ll/ۘ֨֫;

    .line 185
    iget-object v3, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    const/4 v4, 0x0

    const-string v5, "recyclerView"

    if-eqz v3, :cond_9

    invoke-virtual {v3, v0}, Ll/ۚܿ᩻;->setAdapter(Ll/۫۟᩷;)V

    .line 186
    iget-object v0, p0, Ll/ۧۡ֫;->ۖ᩷:Ll/ۗ֨᩷;

    if-eqz v0, :cond_8

    new-instance v3, Ll/ۜܿ֫;

    invoke-direct {v3, p0}, Ll/ۜܿ֫;-><init>(Ll/ܽ֡֫;)V

    invoke-virtual {v0, v3}, Ll/ۗ֨᩷;->ۙ(Ll/ܽ֨᩷;)V

    .line 188
    iget-object v0, p0, Ll/ۧۡ֫;->ܿ᩷:Ll/ۚܿ᩻;

    if-eqz v0, :cond_7

    new-instance v3, Ll/ۚ֨֫;

    invoke-direct {v3, p0}, Ll/ۚ֨֫;-><init>(Ll/ۧۡ֫;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const v0, 0x7f0a00a0

    .line 207
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۧ᩶᩻;

    iput-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    const v0, 0x7f0a009b

    .line 208
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۜܰ᩻;

    iput-object v0, p0, Ll/ۧۡ֫;->ۚ᩷:Ll/ۜܰ᩻;

    .line 962
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    .line 963
    invoke-virtual {v3}, Landroid/view/Window;->getStatusBarColor()I

    move-result v5

    .line 964
    new-instance v6, Ll/۫֡֫;

    invoke-direct {v6, v3, v5}, Ll/۫֡֫;-><init>(Landroid/view/Window;I)V

    invoke-virtual {v0, v6}, Ll/ۜܰ᩻;->ۙ(Ll/۬ܰ᩻;)V

    const v0, 0x7f0a00a1

    .line 210
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/᩻᩶᩻;

    .line 211
    iget-object v3, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    const-string v5, "bottomToolbar"

    if-eqz v3, :cond_6

    invoke-virtual {v0, v3}, Ll/᩻᩶᩻;->ۙ(Ll/ۧ᩶᩻;)V

    .line 212
    iget-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    if-eqz v0, :cond_5

    .line 213
    iget-object v3, p0, Ll/ۧۡ֫;->ۚ᩷:Ll/ۜܰ᩻;

    if-eqz v3, :cond_4

    invoke-virtual {v0, v3}, Ll/ۧ᩶᩻;->ۙ(Ll/ۜܰ᩻;)V

    .line 214
    invoke-virtual {v0}, Ll/ۧ᩶᩻;->ۙ()V

    const v3, 0x7f0802db

    const v5, 0x7f0802dd

    .line 215
    invoke-virtual {v0, v3, v5}, Ll/ۧ᩶᩻;->ۙ(II)Ll/ܳ᩶᩻;

    move-result-object v3

    const/4 v5, 0x0

    .line 216
    invoke-virtual {v3, v5}, Ll/ܳ᩶᩻;->ۙ(Z)V

    const v3, 0x7f0802dc

    const v6, 0x7f0802df

    .line 217
    invoke-virtual {v0, v3, v6}, Ll/ۧ᩶᩻;->ۙ(II)Ll/ܳ᩶᩻;

    move-result-object v3

    .line 218
    invoke-virtual {v3, v5}, Ll/ܳ᩶᩻;->ۙ(Z)V

    const v3, 0x7f0802d9

    const/16 v6, 0x2d

    .line 219
    invoke-virtual {v0, v3, v6}, Ll/ۧ᩶᩻;->᩷(II)V

    .line 221
    new-instance v3, Ll/ܺۧ᩸;

    invoke-direct {v3, v0}, Ll/ܺۧ᩸;-><init>(Landroid/view/View;)V

    .line 220
    invoke-virtual {v0, v3}, Ll/ۧ᩶᩻;->ۙ(Ll/ܺۧ᩸;)Ll/ܳ᩶᩻;

    move-result-object v3

    .line 228
    invoke-virtual {v3}, Ll/ܳ᩶᩻;->ܳ()V

    .line 229
    invoke-virtual {v3, v5}, Ll/ܳ᩶᩻;->ۙ(Z)V

    const v3, 0x7f0802da

    const v5, 0x7f0802de

    .line 230
    invoke-virtual {v0, v3, v5}, Ll/ۧ᩶᩻;->ۙ(II)Ll/ܳ᩶᩻;

    const/16 v3, 0xc8

    .line 231
    invoke-static {v3}, Ll/᩻֫ܺ;->ۙ(I)Ll/᩻֫ܺ;

    move-result-object v3

    .line 232
    new-instance v5, Ll/֫֨֫;

    invoke-direct {v5, v3, p0, v0}, Ll/֫֨֫;-><init>(Ll/᩻֫ܺ;Ll/ۧۡ֫;Ll/ۧ᩶᩻;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    new-instance v3, Ll/ۧ֨֫;

    invoke-direct {v3, v0, p0}, Ll/ۧ֨֫;-><init>(Ll/ۧ᩶᩻;Ll/ۧۡ֫;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a0535

    .line 292
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ll/ۜܿ᩻;

    iput-object v0, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    .line 293
    invoke-virtual {v0, v2}, Ll/ۜܿ᩻;->ۙ(Z)V

    .line 294
    iget-object v0, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz v0, :cond_3

    new-instance v1, Ll/᩷ۡ֫;

    invoke-direct {v1, p0}, Ll/᩷ۡ֫;-><init>(Ll/ۧۡ֫;)V

    invoke-virtual {v0, v1}, Ll/ۜܿ᩻;->ۙ(Ll/ۖܿ᩻;)V

    .line 323
    new-instance v0, Ll/۬ܰᩴ;

    new-instance v1, Ll/᩻֨֫;

    invoke-direct {v1, p0}, Ll/᩻֨֫;-><init>(Ll/ۧۡ֫;)V

    invoke-direct {v0, p0, v1}, Ll/۬ܰᩴ;-><init>(Ll/ܽ֡֫;Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/ۧۡ֫;->ܳ᩷:Ll/۬ܰᩴ;

    .line 329
    new-instance v0, Ll/ܺ֨֫;

    invoke-direct {v0, p0}, Ll/ܺ֨֫;-><init>(Ll/ۧۡ֫;)V

    .line 824
    invoke-static {p0, v0}, Ll/ۨۤۧ;->ۙ(Ll/ۚۤ;Ll/ܶۤۧ;)Ll/ۗۤۧ;

    move-result-object v0

    .line 329
    iput-object v0, p0, Ll/ۧۡ֫;->᩺᩷:Ll/ۗۤۧ;

    .line 341
    invoke-static {p0}, Ll/᩵᩶ᩴ;->ۙ(Ll/ܽ֡֫;)V

    .line 344
    invoke-static {}, Ll/ܽ۟֫;->᩷()V

    .line 347
    invoke-static {}, Ll/۟۠ۧ;->۫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 348
    invoke-direct {p0, p1}, Ll/ۧۡ֫;->ۙ(Landroid/os/Bundle;)V

    return-void

    .line 350
    :cond_2
    new-instance v0, Ll/۬֨ᩴ;

    const v1, 0x7f12057b

    invoke-direct {v0, p0, v1}, Ll/۬֨ᩴ;-><init>(Ll/ܽ֡֫;I)V

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Ll/۬֨ᩴ;->ۤ(I)V

    .line 351
    new-instance v1, Ljava/lang/Thread;

    .line 361
    new-instance v2, Ll/ܽ֨֫;

    invoke-direct {v2, v0, p0, p1}, Ll/ܽ֨֫;-><init>(Ll/۬֨ᩴ;Ll/ۧۡ֫;Landroid/os/Bundle;)V

    .line 351
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 361
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    :cond_3
    const-string p1, "searchView"

    .line 294
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4

    :cond_4
    const-string p1, "bottomSlideLayout"

    .line 213
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4

    .line 212
    :cond_5
    invoke-static {v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4

    .line 211
    :cond_6
    invoke-static {v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4

    .line 188
    :cond_7
    invoke-static {v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4

    :cond_8
    const-string p1, "swipeRefreshLayout"

    .line 186
    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4

    .line 185
    :cond_9
    invoke-static {v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v4
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 10

    const-string v0, "menu"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 516
    invoke-virtual {p0}, Ll/ۘᩴ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000c

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a03c9

    .line 517
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 518
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 519
    invoke-interface {p1}, Landroid/view/Menu;->clear()V

    const v2, 0x7f120a7e

    const v3, 0x7f120581

    const/4 v4, 0x0

    .line 520
    invoke-interface {p1, v0, v3, v4, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const-string v5, "add(...)"

    invoke-static {v2, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    sget-object v6, Ll/᩵ܰܳ;->᩹ۙ:Ll/᩵ܰܳ;

    const-string v7, "ROOT"

    invoke-static {v6, v7}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Ll/ۧۡ֫;->ۙ(Landroid/view/MenuItem;Ll/᩵ܰܳ;)V

    const-string v2, "/"

    .line 522
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f120582

    const v6, 0x7f120ba3

    .line 523
    invoke-interface {p1, v0, v2, v4, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    invoke-static {v2, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    sget-object v6, Ll/᩵ܰܳ;->ۨۙ:Ll/᩵ܰܳ;

    const-string v7, "SDCARD"

    invoke-static {v6, v7}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Ll/ۧۡ֫;->ۙ(Landroid/view/MenuItem;Ll/᩵ܰܳ;)V

    .line 529
    sget-object v2, Ll/ۛۨᩴ;->۫:Ll/᩷ۨᩴ;

    invoke-virtual {v2}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 530
    invoke-static {}, Ll/ܽܿᩴ;->᩷()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܺܿᩴ;

    .line 531
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/2addr v8, v3

    iget-object v9, v6, Ll/ܺܿᩴ;->᩷:Ljava/lang/String;

    invoke-interface {p1, v0, v8, v4, v9}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v8

    invoke-static {v8, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    sget-object v9, Ll/᩵ܰܳ;->ۨۙ:Ll/᩵ܰܳ;

    invoke-static {v9, v7}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v9}, Ll/ۧۡ֫;->ۙ(Landroid/view/MenuItem;Ll/᩵ܰܳ;)V

    .line 533
    iget-object v6, v6, Ll/ܺܿᩴ;->ۤ:Ljava/io/File;

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 535
    :cond_0
    invoke-static {}, Ll/ܺ᩶ᩴ;->ᩴ()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩻᩶ᩴ;

    .line 536
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v7, v3

    iget-object v8, v6, Ll/᩻᩶ᩴ;->ᩴ:Ljava/lang/String;

    invoke-interface {p1, v0, v7, v4, v8}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-static {v7, v5}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    .line 537
    sget-object v8, Ll/᩵ܰܳ;->᩺:Ll/᩵ܰܳ;

    const-string v9, "FOLDER"

    invoke-static {v8, v9}, Ll/ܳۡ᩵;->᩷(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7, v8}, Ll/ۧۡ֫;->ۙ(Landroid/view/MenuItem;Ll/᩵ܰܳ;)V

    .line 538
    invoke-virtual {v6}, Ll/᩻᩶ᩴ;->ۙ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 540
    :cond_1
    iput-object v1, p0, Ll/ۧۡ֫;->ۢ᩷:Ljava/util/List;

    const/4 p1, 0x1

    return p1
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 7

    const-string v0, "selectedMenuItem"

    .line 6
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0a03f0

    const v2, 0x7f0a03c2

    const v3, 0x7f0a03c3

    const/4 v4, 0x1

    if-ne v0, v1, :cond_0

    .line 552
    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-static {p1}, Ll/ܳۡ᩵;->ۙ(Ljava/lang/Object;)V

    .line 553
    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 554
    invoke-static {}, Ll/ᩴ᩻۫;->ۤ()Z

    move-result v1

    .line 553
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 555
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 556
    invoke-static {}, Ll/ᩴ᩻۫;->᩷()Z

    move-result v0

    .line 555
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return v4

    :cond_0
    const v1, 0x7f0a03ae

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-ne v0, v1, :cond_1

    const/4 p1, 0x2

    .line 618
    invoke-static {p0, v5, v6, p1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 560
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return v4

    :cond_1
    const v1, 0x7f0a0380

    if-ne v0, v1, :cond_6

    .line 564
    invoke-static {}, Ll/ܺۡ֫;->ۙ()V

    .line 565
    iget-object p1, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    const-string v0, "searchView"

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ll/ۜܿ᩻;->ᩴ()Z

    move-result p1

    if-nez p1, :cond_3

    .line 566
    iget-object p1, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz p1, :cond_2

    .line 242
    invoke-virtual {p1, v6}, Ll/ۜܿ᩻;->ۙ(Ljava/lang/String;)V

    goto :goto_0

    .line 566
    :cond_2
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v6

    .line 568
    :cond_3
    :goto_0
    iget-object p1, p0, Ll/ۧۡ֫;->֡᩷:Ll/ۜܿ᩻;

    if-eqz p1, :cond_4

    .line 274
    invoke-virtual {p1, v4}, Ll/ۜܿ᩻;->᩷(Z)V

    .line 568
    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return v4

    :cond_4
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v6

    .line 565
    :cond_5
    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v6

    :cond_6
    const v1, 0x7f0a03c6

    if-ne v0, v1, :cond_7

    .line 572
    new-instance p1, Ll/֨֨֫;

    invoke-direct {p1, p0}, Ll/֨֨֫;-><init>(Ll/ۧۡ֫;)V

    return v4

    :cond_7
    const/4 v1, 0x4

    if-ne v0, v3, :cond_8

    .line 576
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v4

    .line 577
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 578
    invoke-static {v0}, Ll/ᩴ᩻۫;->᩷(Z)V

    .line 579
    invoke-static {p0, v4, v6, v1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return v4

    :cond_8
    if-ne v0, v2, :cond_9

    .line 583
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v4

    .line 584
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 585
    invoke-static {v0}, Ll/ᩴ᩻۫;->ۙ(Z)V

    .line 586
    invoke-static {p0, v4, v6, v1}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return v4

    :cond_9
    const v1, 0x7f0a037b

    if-ne v0, v1, :cond_a

    .line 590
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p1, Ll/ۧ۟᩵;->ۙ:Ll/ۧ۟᩵;

    return v4

    .line 594
    :cond_a
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result p1

    const v1, 0x7f0a03c9

    if-ne p1, v1, :cond_b

    const p1, 0x7f120581

    sub-int/2addr v0, p1

    .line 596
    iget-object p1, p0, Ll/ۧۡ֫;->ۢ᩷:Ljava/util/List;

    if-ltz v0, :cond_b

    .line 597
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_b

    .line 598
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 1287
    invoke-direct {p0, p1, v6}, Ll/ۧۡ֫;->ۙ(Ljava/lang/String;Ll/ᩴ֨᩵;)V

    return v4

    :cond_b
    return v5
.end method

.method public final onResume()V
    .locals 3

    .line 491
    invoke-super {p0}, Ll/ܽ֡֫;->onResume()V

    .line 492
    iget-boolean v0, p0, Ll/ۧۡ֫;->᩹᩷:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 493
    iput-boolean v0, p0, Ll/ۧۡ֫;->᩹᩷:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v2, 0x4

    .line 495
    invoke-static {p0, v0, v1, v2}, Ll/ۧۡ֫;->ۙ(Ll/ۧۡ֫;ZLl/ᩴ֨᩵;I)V

    .line 497
    :goto_0
    iget-object v0, p0, Ll/ۧۡ֫;->ۧ᩷:Ll/ۧ᩶᩻;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/ۧ᩶᩻;->᩻()V

    return-void

    :cond_1
    const-string v0, "bottomToolbar"

    invoke-static {v0}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    throw v1
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "outState"

    .line 5
    invoke-static {p1, v0}, Ll/ܳۡ᩵;->ۤ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 501
    invoke-super {p0, p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 502
    iget-object v0, p0, Ll/ۧۡ֫;->۬᩷:Ll/ۜ᩻۫;

    if-eqz v0, :cond_0

    .line 503
    new-instance v1, Ll/ۛۚۤ;

    invoke-direct {v1}, Ll/ۛۚۤ;-><init>()V

    .line 504
    invoke-virtual {v0, v1}, Ll/ۜ᩻۫;->ۙ(Ll/ۛۚۤ;)V

    const-string v0, "visitorData"

    .line 505
    invoke-virtual {v1}, Ll/ۛۚۤ;->۫()[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "FilePickerActivity"

    return-object v0
.end method

.method public final ᩷(Landroid/content/Intent;)V
    .locals 1

    .line 510
    iget-object v0, p0, Ll/ۧۡ֫;->᩺᩷:Ll/ۗۤۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/ۗۤۧ;->ۙ(Landroid/content/Intent;)V

    return-void

    :cond_0
    const-string p1, "launcherForGrantPathPrimary"

    invoke-static {p1}, Ll/ܳۡ᩵;->᩷(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
