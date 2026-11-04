.class public Ll/ᩳ᩷ܳ;
.super Ll/ܽ֡֫;
.source "C5GL"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Ll/ܶ᩷ܳ;
.implements Ll/ۛ᩷ۙ;
.implements Ll/᩸ۧۤ;
.implements Ll/᩹ۤܳ;


# static fields
.field private static final ۜܰ۟:[S

.field public static final synthetic ۧۤ:I


# instance fields
.field public ֡᩷:Z

.field public ֨᩷:Z

.field public ֫ۤ:Z

.field public volatile ֫᩷:Z

.field public ۖ᩷:Ljava/lang/String;

.field public volatile ۗ᩷:Z

.field public ۘ᩷:Landroid/view/inputmethod/InputMethodManager;

.field public ۙۤ:Z

.field public ۚۤ:Ll/᩸ۢ;

.field public ۚ᩷:Z

.field public ۛ᩷:Landroid/widget/TextView;

.field public ۜ᩷:Z

.field public ۟᩷:Ll/֨ۤܳ;

.field public ۠᩷:Ll/ۚ۬ᩴ;

.field public ۡ᩷:Z

.field public ۢ᩷:Landroid/view/View;

.field public ۤۤ:Landroid/view/View;

.field public ۧ᩷:Z

.field public ۨ᩷:Ljava/lang/String;

.field public ۫ۤ:Ll/֨᩷ܳ;

.field public ۫᩷:J

.field public ۬᩷:Ll/᩸ۢ;

.field public ܰ᩷:Ll/ᩴۤܳ;

.field public ܳۤ:Ll/ܶۤܳ;

.field public ܳ᩷:Ljava/util/concurrent/Executor;

.field public ܶ᩷:Ll/۟᩷ۙ;

.field public ܺ᩷:Z

.field public ܽ᩷:Ljava/util/concurrent/Executor;

.field public ܿ᩷:Ll/ܶۙܳ;

.field public ᩳ᩷:Z

.field public ᩴۤ:Ll/ۜ᩸ܳ;

.field public ᩴ᩷:Ll/۟᩷ܳ;

.field public ᩵᩷:Ll/᩷ۨᩴ;

.field public ᩶᩷:Z

.field public ᩷ۤ:Ll/᩸ۢ;

.field public ᩸ۤ:Z

.field public final ᩸᩷:Ll/ܿ᩷ܳ;

.field public ᩹᩷:Ll/ۨ᩷ܳ;

.field public ᩺᩷:Z

.field public volatile ᩻᩷:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8c

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/4 v0, 0x7

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩳ᩷ܳ;->ۜܰ۟:[S

    return-void

    :array_0
    .array-data 2
        0x234es
        0x6ba0s
        -0x7936s
        0x6755s
        0x61a8s
        -0x4873s
        0x64bfs
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    .line 44
    invoke-direct {p0}, Ll/ܽ֡֫;-><init>()V

    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 57
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    .line 58
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    const-wide/high16 v1, -0x8000000000000000L

    .line 72
    iput-wide v1, p0, Ll/ᩳ᩷ܳ;->۫᩷:J

    .line 79
    invoke-static {}, Ll/ۧ۬ᩴ;->ۙ()Ljava/util/concurrent/Executor;

    move-result-object v1

    iput-object v1, p0, Ll/ᩳ᩷ܳ;->ܳ᩷:Ljava/util/concurrent/Executor;

    .line 80
    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Ll/ᩳ᩷ܳ;->ܽ᩷:Ljava/util/concurrent/Executor;

    .line 81
    new-instance v1, Ll/ܿ᩷ܳ;

    .line 1183
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 81
    iput-object v1, p0, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    const/4 v1, 0x0

    .line 1049
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->֨᩷:Z

    .line 1157
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->֫ۤ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩳ᩷ܳ;)Ll/ۜ᩸ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    return-object p0
.end method

.method private ֫ۙ()V
    .locals 4

    .line 273
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۡ᩷:Z

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 275
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    const v1, 0x7f12045e

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void

    .line 276
    :cond_0
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۜ᩷:Z

    if-eqz v0, :cond_1

    .line 277
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    .line 278
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const v0, 0x7f120459

    .line 280
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setTitle(I)V

    .line 281
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    iget-boolean v1, p0, Ll/ᩳ᩷ܳ;->֨᩷:Z

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    const-string v3, " *"

    .line 0
    invoke-static {v1, v2, v3}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 281
    :cond_2
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩳ᩷ܳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 745
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(Z)V

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ᩳ᩷ܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    return-void
.end method

.method public static bridge synthetic ۚ(Ll/ᩳ᩷ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    return p0
.end method

.method private ۚۙ()V
    .locals 3

    .line 741
    invoke-static {}, Ll/ᩳۡ᩻;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 742
    sget v0, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v0, Ll/ۖۖۧ;

    invoke-direct {v0, p0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 742
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    .line 743
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->᩷(Ljava/lang/CharSequence;)V

    const v1, 0x7f120a8c

    .line 744
    invoke-virtual {v0, v1}, Ll/ۖۖۧ;->ۙ(I)V

    new-instance v1, Ll/ۛ᩷ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p0}, Ll/ۛ᩷ܳ;-><init>(ILjava/lang/Object;)V

    const v2, 0x7f120a85

    .line 745
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/᩺᩷ܳ;

    invoke-direct {v1, p0}, Ll/᩺᩷ܳ;-><init>(Ll/ᩳ᩷ܳ;)V

    const v2, 0x7f12031d

    .line 746
    invoke-virtual {v0, v2, v1}, Ll/ۖۖۧ;->᩷(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 747
    invoke-virtual {v0}, Ll/ۖۖۧ;->ۤ()Ll/۠ۖۧ;

    return-void

    .line 749
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->finish()V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ᩳ᩷ܳ;)Ll/۟᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩷ܳ;->ᩴ᩷:Ll/۟᩷ܳ;

    return-object p0
.end method

.method private ۤ(I)V
    .locals 1

    .line 510
    invoke-virtual {p0, p1}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 511
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 512
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    sget-object v0, Ll/ۙ᩷ܳ;->᩷ۙ:Landroid/graphics/Typeface;

    .line 512
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method private native ۤ(Z)V
.end method

.method public static bridge synthetic ۧ(Ll/ᩳ᩷ܳ;)Ll/֨᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ۫(Ll/ᩳ᩷ܳ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ᩳ᩷ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    return p0
.end method

.method public static bridge synthetic ܺ(Ll/ᩳ᩷ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩳ᩷ܳ;->ۚۙ()V

    return-void
.end method

.method public static bridge synthetic ᩴ(Ll/ᩳ᩷ܳ;)Ll/۟᩷ۙ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ᩳ᩷ܳ;)Ll/ܿ᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ᩳ᩷ܳ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    return-void
.end method

.method private ᩷(Z)V
    .locals 7

    .line 1026
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 1029
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    .line 1030
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    if-eqz v1, :cond_1

    .line 1031
    invoke-virtual {v1}, Ll/ۜ᩸ܳ;->ۙ()V

    .line 1033
    :cond_1
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->ᩴ()V

    .line 1034
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩸()Z

    .line 1035
    new-instance v1, Ll/ۚ۬ᩴ;

    iget-boolean v2, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    iget-boolean v3, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    iget-boolean v4, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    iget-object v5, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v6, 0x0

    .line 1474
    invoke-virtual {v5, v6}, Ll/ۨ᩷ܳ;->ۙ(Ll/ܶܳܳ;)Ll/᩵᩷ܳ;

    move-result-object v5

    .line 1036
    invoke-direct {v1, v2, v3, v4, v5}, Ll/ۚ۬ᩴ;-><init>(ZZZLl/᩵᩷ܳ;)V

    iput-object v1, p0, Ll/ᩳ᩷ܳ;->۠᩷:Ll/ۚ۬ᩴ;

    .line 1037
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    if-eqz p1, :cond_2

    if-eqz v1, :cond_2

    .line 1038
    invoke-virtual {v1}, Ll/ܶۤܳ;->۫()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1039
    invoke-virtual {v1}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v6

    .line 1040
    :cond_2
    iput-object v6, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    .line 1046
    new-instance p1, Ll/ܿۜᩴ;

    const/4 v1, 0x0

    .line 37
    invoke-direct {p1, p0, v6, v0, v1}, Ll/ܿۜᩴ;-><init>(Ll/ᩳ᩷ܳ;Ljava/lang/String;ZZ)V

    .line 1046
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    :cond_3
    :goto_0
    return-void
.end method

.method private ᩸(Z)V
    .locals 2

    .line 530
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    if-eqz p1, :cond_1

    .line 532
    iget p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v1, p1, 0x400

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    or-int/lit16 p1, p1, 0x400

    .line 534
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_1

    .line 536
    :cond_1
    iget p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit16 v1, p1, 0x400

    if-nez v1, :cond_2

    :goto_0
    return-void

    :cond_2
    xor-int/lit16 p1, p1, 0x400

    .line 538
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 540
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ᩳ᩷ܳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ᩳ᩷ܳ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ᩴ᩷:Ll/۟᩷ܳ;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 3

    const/4 v0, 0x1

    .line 754
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۗ᩷:Z

    .line 755
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 756
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    const/4 v2, 0x0

    .line 757
    iput-object v2, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 758
    iput-object v2, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 761
    :try_start_0
    invoke-virtual {v0}, Ll/ܶۤܳ;->᩷()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    if-eqz v1, :cond_2

    if-eqz v0, :cond_1

    .line 766
    invoke-virtual {v0}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 768
    :cond_1
    :try_start_1
    invoke-static {v1}, Ll/ܶۤܳ;->ۤ(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 773
    :catch_1
    :cond_2
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 910
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a00ad

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 912
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p1, v1}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_0
    const v0, 0x7f0a00ae

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    .line 914
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p1, v2}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_1
    const v0, 0x7f0a00af

    if-ne p1, v0, :cond_2

    .line 916
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_2
    const v0, 0x7f0a00b0

    if-ne p1, v0, :cond_3

    .line 918
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_3
    const v0, 0x7f0a00b1

    if-ne p1, v0, :cond_4

    .line 920
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_4
    const v0, 0x7f0a00b2

    if-ne p1, v0, :cond_5

    .line 922
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_5
    const v0, 0x7f0a00b3

    if-ne p1, v0, :cond_6

    .line 924
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_6
    const v0, 0x7f0a00b4

    if-ne p1, v0, :cond_7

    .line 926
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_7
    const v0, 0x7f0a00b5

    if-ne p1, v0, :cond_8

    .line 928
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_8
    const v0, 0x7f0a00b6

    if-ne p1, v0, :cond_9

    .line 930
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_9
    const v0, 0x7f0a00b7

    if-ne p1, v0, :cond_a

    .line 932
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_a
    const v0, 0x7f0a00b9

    if-ne p1, v0, :cond_b

    .line 934
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0xb

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_b
    const v0, 0x7f0a00ba

    if-ne p1, v0, :cond_c

    .line 936
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_c
    const v0, 0x7f0a00bc

    if-ne p1, v0, :cond_d

    .line 938
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0xd

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_d
    const v0, 0x7f0a00be

    if-ne p1, v0, :cond_e

    .line 940
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0xe

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_e
    const v0, 0x7f0a00c1

    if-ne p1, v0, :cond_f

    .line 942
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/16 v0, 0xf

    invoke-virtual {p1, v0}, Ll/ۨ᩷ܳ;->ۤ(I)V

    return-void

    :cond_f
    const v0, 0x7f0a0183

    if-ne p1, v0, :cond_12

    .line 944
    iget-boolean p1, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    if-eqz p1, :cond_10

    .line 945
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    .line 946
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    const v0, 0x3e99999a    # 0.3f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 947
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->᩸ۙ()V

    return-void

    .line 949
    :cond_10
    iput-boolean v2, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    .line 950
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 897
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1230
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_13

    .line 897
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_0

    .line 899
    :cond_11
    iput-boolean v2, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 900
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܿ᩷:Ll/ܶۙܳ;

    invoke-virtual {p1, v2, v2}, Ll/ܶۙܳ;->ۙ(ZZ)V

    return-void

    :cond_12
    const v0, 0x7f0a026e

    if-ne p1, v0, :cond_13

    .line 954
    iget-boolean p1, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    xor-int/2addr p1, v2

    iput-boolean p1, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    .line 955
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1222
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    .line 955
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1226
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->۫()I

    move-result v0

    .line 955
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1230
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v1

    .line 955
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1234
    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v2

    .line 955
    invoke-virtual {p0, p1, v0, v2, v1}, Ll/ᩳ᩷ܳ;->ۙ(IIIZ)V

    :cond_13
    :goto_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 517
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 518
    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    .line 519
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ۤۤ:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 520
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->۟᩷:Ll/֨ۤܳ;

    invoke-virtual {p1, v1}, Ll/֨ۤܳ;->ۙ(I)V

    .line 521
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->᩸(Z)V

    return-void

    .line 523
    :cond_0
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ۤۤ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 524
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->۟᩷:Ll/֨ۤܳ;

    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Ll/֨ۤܳ;->ۙ(I)V

    .line 525
    invoke-direct {p0, v1}, Ll/ᩳ᩷ܳ;->᩸(Z)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .line 91
    invoke-super {p0, p1}, Ll/ܽ֡֫;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0d0029

    .line 92
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    const v0, 0x7f120459

    .line 93
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    .line 94
    invoke-static {p0}, Ll/ۜ᩸ܳ;->ۙ(Ll/᩹ۤܳ;)Ll/ۜ᩸ܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    .line 95
    new-instance v0, Ll/ᩴۤܳ;

    invoke-direct {v0, p0}, Ll/ᩴۤܳ;-><init>(Ll/᩹ۤܳ;)V

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ܰ᩷:Ll/ᩴۤܳ;

    const v0, 0x7f0a068a

    .line 96
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶ᩹;

    iput-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    .line 97
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->ۙ(Ll/ܶ᩹;)V

    .line 98
    invoke-virtual {p0}, Ll/ۚۤ;->getOnBackPressedDispatcher()Ll/ۜۤ;

    move-result-object v0

    .line 718
    new-instance v1, Ll/᩶᩷ܳ;

    invoke-direct {v1, p0}, Ll/᩶᩷ܳ;-><init>(Ll/ᩳ᩷ܳ;)V

    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    invoke-virtual {v0, v1}, Ll/ۜۤ;->ۙ(Ll/ۛۤ;)Ll/֡᩷;

    const v0, 0x7f0a02d2

    .line 100
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ܶۙܳ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ܿ᩷:Ll/ܶۙܳ;

    const v0, 0x7f0a0522

    .line 101
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۤۤ:Landroid/view/View;

    const v0, 0x7f0a018c

    .line 102
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܳ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const v0, 0x7f0a026e

    .line 103
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۛ᩷:Landroid/widget/TextView;

    const v0, 0x7f0a02d3

    .line 104
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/֨ۤܳ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->۟᩷:Ll/֨ۤܳ;

    const v0, 0x7f0a017b

    .line 105
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/۟᩷ۙ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    .line 106
    invoke-virtual {v0, p0}, Ll/۟᩷ۙ;->ۙ(Ll/ۛ᩷ۙ;)V

    const v0, 0x7f0a00ad

    .line 107
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00ae

    .line 108
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00af

    .line 109
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b0

    .line 110
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b1

    .line 111
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b2

    .line 112
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b3

    .line 113
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b4

    .line 114
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b5

    .line 115
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b6

    .line 116
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b7

    .line 117
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00b9

    .line 118
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00ba

    .line 119
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00bc

    .line 120
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00be

    .line 121
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    const v0, 0x7f0a00c1

    .line 122
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->ۤ(I)V

    .line 123
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۛ᩷:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v0, p0}, Ll/ۨ᩷ܳ;->ۙ(Ll/ܶ᩷ܳ;)V

    const v0, 0x7f0a0183

    .line 125
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    .line 126
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0270

    .line 127
    invoke-virtual {p0, v0}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/᩻ۙܳ;

    new-instance v1, Ll/ܰ᩷ܳ;

    invoke-direct {v1, p0}, Ll/ܰ᩷ܳ;-><init>(Ll/ᩳ᩷ܳ;)V

    invoke-virtual {v0, v1}, Ll/᩻ۙܳ;->ۙ(Ll/ۧۙܳ;)V

    .line 135
    invoke-virtual {p0}, Ll/ۘᩴ;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    .line 136
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۤۤ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 137
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->۟᩷:Ll/֨ۤܳ;

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Ll/֨ۤܳ;->ۙ(I)V

    .line 138
    invoke-direct {p0, v2}, Ll/ᩳ᩷ܳ;->᩸(Z)V

    .line 141
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "android.intent.action.VIEW"

    .line 142
    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "android.intent.action.EDIT"

    invoke-virtual {v0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 156
    :cond_1
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->finish()V

    return-void

    .line 143
    :cond_2
    :goto_0
    invoke-static {p0}, Ll/ܰۨᩴ;->ۙ(Ll/ܽ֡֫;)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 153
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Ll/ܰۨᩴ;->ۙ(Landroid/content/Intent;)Ll/᩷ۨᩴ;

    move-result-object v2

    .line 146
    iput-object v2, p0, Ll/ᩳ᩷ܳ;->᩵᩷:Ll/᩷ۨᩴ;

    const-string v2, "readOnly"

    .line 147
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۜ᩷:Z

    .line 148
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩵᩷:Ll/᩷ۨᩴ;

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    .line 149
    invoke-direct {p0}, Ll/ᩳ᩷ܳ;->֫ۙ()V

    const/4 v0, 0x0

    if-nez p1, :cond_4

    move-object v2, v0

    goto :goto_1

    :cond_4
    const-string v2, "hex_session_token"

    .line 151
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_1
    iput-object v2, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    if-eqz p1, :cond_6

    const-string v2, "hex_ui_present"

    .line 449
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "hex_ui_scroll"

    .line 453
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v0, "hex_ui_selection_start"

    .line 454
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v4

    const-string v0, "hex_ui_selection_end"

    .line 455
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v0, "hex_ui_select_hex_first"

    .line 456
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v6

    const-string v0, "hex_ui_multi_select"

    .line 457
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v7

    .line 452
    invoke-static/range {v2 .. v7}, Ll/᩵᩷ܳ;->ۙ(JIIZZ)Ll/᩵᩷ܳ;

    move-result-object v0

    .line 458
    new-instance v2, Ll/ۚ۬ᩴ;

    const-string v3, "hex_ui_keyboard_showing"

    .line 459
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "hex_ui_keyboard_enable"

    .line 460
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    const-string v5, "hex_ui_hex_mode"

    .line 461
    invoke-virtual {p1, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-direct {v2, v3, v4, p1, v0}, Ll/ۚ۬ᩴ;-><init>(ZZZLl/᩵᩷ܳ;)V

    move-object v0, v2

    .line 152
    :cond_6
    :goto_2
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->۠᩷:Ll/ۚ۬ᩴ;

    .line 153
    new-instance p1, Ll/ܿۜᩴ;

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    .line 37
    invoke-direct {p1, p0, v0, v1, v1}, Ll/ܿۜᩴ;-><init>(Ll/ᩳ᩷ܳ;Ljava/lang/String;ZZ)V

    .line 153
    invoke-virtual {p1}, Ll/ۖۙܺ;->۫()V

    return-void
.end method

.method public final onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 4

    .line 665
    invoke-virtual {p0}, Ll/ۘᩴ;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f000f

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f0a04d8

    .line 666
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Ll/᩸ۢ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->۬᩷:Ll/᩸ۢ;

    const v0, 0x7f0a06ad

    .line 667
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Ll/᩸ۢ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۚۤ:Ll/᩸ۢ;

    const v0, 0x7f0a03b6

    .line 668
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    check-cast v0, Ll/᩸ۢ;

    iput-object v0, p0, Ll/ᩳ᩷ܳ;->᩷ۤ:Ll/᩸ۢ;

    .line 670
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۧ()Z

    move-result v0

    .line 671
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1444
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩷()Z

    move-result v1

    .line 672
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1448
    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۙ()Z

    move-result v2

    .line 673
    iget-object v3, p0, Ll/ᩳ᩷ܳ;->᩷ۤ:Ll/᩸ۢ;

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 674
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۚۤ:Ll/᩸ۢ;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 675
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->۬᩷:Ll/᩸ۢ;

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 677
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 678
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩷ۤ:Ll/᩸ۢ;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 679
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ۚۤ:Ll/᩸ۢ;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    .line 680
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->۬᩷:Ll/᩸ۢ;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f0a03a5

    .line 681
    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onDestroy()V
    .locals 4

    const/4 v0, 0x1

    .line 786
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    .line 787
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    if-eqz v1, :cond_0

    .line 788
    invoke-virtual {v1}, Ll/ۜ᩸ܳ;->ۙ()V

    .line 790
    :cond_0
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-eqz v1, :cond_2

    .line 791
    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->ᩴ()V

    .line 792
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v1}, Ll/ۨ᩷ܳ;->᩸()Z

    move-result v1

    .line 793
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 817
    new-instance v3, Ll/֡᩷ܳ;

    invoke-direct {v3, v2}, Ll/֡᩷ܳ;-><init>(Ll/ᩳܳܳ;)V

    if-nez v1, :cond_1

    .line 819
    invoke-virtual {v3}, Ll/֡᩷ܳ;->run()V

    goto :goto_0

    .line 823
    :cond_1
    :try_start_0
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ܽ᩷:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 827
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v1, v3}, Ll/ۨ᩷ܳ;->ۙ(Ljava/lang/Runnable;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 828
    invoke-virtual {v3}, Ll/֡᩷ܳ;->run()V

    .line 799
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ᩷ܳ;->ۙ(Ljava/io/File;)V

    .line 800
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    if-eqz v1, :cond_6

    .line 801
    iget-boolean v2, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    iget-boolean v3, p0, Ll/ᩳ᩷ܳ;->ۗ᩷:Z

    if-nez v3, :cond_4

    .line 802
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    if-nez v0, :cond_5

    .line 306
    invoke-virtual {v1}, Ll/ܶۤܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    .line 803
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 806
    :try_start_1
    invoke-virtual {v1}, Ll/ܶۤܳ;->᩷()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 779
    :catch_1
    :cond_6
    :goto_2
    invoke-super {p0}, Ll/ܽ֡֫;->onDestroy()V

    return-void
.end method

.method public final onDrawerClosed(Landroid/view/View;)V
    .locals 2

    .line 1150
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0179

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    .line 1151
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->᩸ۤ:Z

    return-void

    .line 1153
    :cond_0
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->᩶᩷:Z

    return-void
.end method

.method public final onDrawerOpened(Landroid/view/View;)V
    .locals 2

    .line 1142
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f0a0179

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    .line 1143
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->᩸ۤ:Z

    return-void

    .line 1145
    :cond_0
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->᩶᩷:Z

    return-void
.end method

.method public final onDrawerSlide(Landroid/view/View;F)V
    .locals 0

    return-void
.end method

.method public final onDrawerStateChanged(I)V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 1161
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩸ۤ:Z

    if-eqz v0, :cond_1

    .line 1162
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    invoke-virtual {p1}, Ll/ۜ᩸ܳ;->᩷()V

    .line 1163
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ۘ᩷:Landroid/view/inputmethod/InputMethodManager;

    if-nez p1, :cond_0

    .line 1164
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iput-object p1, p0, Ll/ᩳ᩷ܳ;->ۘ᩷:Landroid/view/inputmethod/InputMethodManager;

    if-nez p1, :cond_0

    goto :goto_0

    .line 1167
    :cond_0
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ۘ᩷:Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void

    :cond_1
    if-eqz p1, :cond_3

    .line 1171
    iget-boolean p1, p0, Ll/ᩳ᩷ܳ;->᩶᩷:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll/ᩳ᩷ܳ;->֫ۤ:Z

    if-eqz p1, :cond_2

    .line 1172
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܰ᩷:Ll/ᩴۤܳ;

    invoke-virtual {p1}, Ll/ᩴۤܳ;->ۙ()V

    .line 1173
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->֫ۤ:Z

    :cond_2
    :goto_0
    return-void

    :cond_3
    const/4 p1, 0x1

    .line 1176
    iput-boolean p1, p0, Ll/ᩳ᩷ܳ;->֫ۤ:Z

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 5

    .line 689
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a06ad

    if-ne p1, v0, :cond_0

    .line 691
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۛ()V

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f0a04d8

    if-ne p1, v0, :cond_1

    .line 693
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ۗ()V

    goto/16 :goto_0

    :cond_1
    const v0, 0x7f0a03b6

    const/4 v1, 0x0

    if-ne p1, v0, :cond_2

    .line 695
    invoke-direct {p0, v1}, Ll/ᩳ᩷ܳ;->ۤ(Z)V

    goto/16 :goto_0

    :cond_2
    const v0, 0x7f0a037b

    if-ne p1, v0, :cond_3

    .line 697
    invoke-direct {p0}, Ll/ᩳ᩷ܳ;->ۚۙ()V

    goto/16 :goto_0

    :cond_3
    const v0, 0x7f0a03bd

    const v2, 0x800003

    const v3, 0x800005

    if-ne p1, v0, :cond_5

    .line 699
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v3}, Ll/۟᩷ۙ;->᩸(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 700
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v3}, Ll/۟᩷ۙ;->ۙ(I)V

    .line 701
    :cond_4
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v2}, Ll/۟᩷ۙ;->ܳ(I)V

    goto/16 :goto_0

    :cond_5
    const v0, 0x7f0a0395

    if-ne p1, v0, :cond_7

    .line 703
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v2}, Ll/۟᩷ۙ;->᩸(I)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 704
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v2}, Ll/۟᩷ۙ;->ۙ(I)V

    .line 705
    :cond_6
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    invoke-virtual {p1, v3}, Ll/۟᩷ۙ;->ܳ(I)V

    goto/16 :goto_0

    :cond_7
    const v0, 0x7f0a0386

    if-ne p1, v0, :cond_8

    .line 707
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ll/ۡۜᩴ;

    invoke-direct {v1, p1}, Ll/ۡۜᩴ;-><init>(Ll/ۨ᩷ܳ;)V

    new-instance v2, Ll/ۖۜᩴ;

    invoke-direct {v2, p1}, Ll/ۖۜᩴ;-><init>(Ll/ۨ᩷ܳ;)V

    invoke-static {v0, v1, v2}, Ll/۬ۜᩴ;->ۙ(Landroid/content/Context;Ljava/util/function/IntSupplier;Ljava/util/function/IntConsumer;)V

    goto :goto_0

    :cond_8
    const v0, 0x7f0a03a5

    if-ne p1, v0, :cond_c

    .line 709
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "clipboard"

    .line 30
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/ClipboardManager;

    .line 31
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v3

    const v4, 0x7f120c48

    if-nez v3, :cond_9

    .line 32
    invoke-static {v4, v1}, Ll/᩸۠ۧ;->᩷(II)Ll/᩸۠ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸۠ۧ;->᩷()V

    goto :goto_0

    .line 36
    :cond_9
    invoke-virtual {v2}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 37
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 38
    invoke-static {v4, v1}, Ll/᩸۠ۧ;->᩷(II)Ll/᩸۠ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸۠ۧ;->᩷()V

    goto :goto_0

    .line 41
    :cond_a
    invoke-static {p1}, Ll/ۧ᩸ܳ;->᩷(Ll/ۨ᩷ܳ;)Ll/ۧ᩸ܳ;

    move-result-object v1

    if-nez v1, :cond_b

    goto :goto_0

    .line 45
    :cond_b
    sget v3, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v3, Ll/ۖۖۧ;

    invoke-direct {v3, v0}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 45
    new-instance v0, Ll/ۜۤܳ;

    invoke-direct {v0, p1, v1, v2}, Ll/ۜۤܳ;-><init>(Ll/ۨ᩷ܳ;Ll/ۧ᩸ܳ;Ljava/lang/CharSequence;)V

    const p1, 0x7f030020

    .line 46
    invoke-virtual {v3, p1, v0}, Ll/ۖۖۧ;->ۙ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 48
    invoke-virtual {v3}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ll/۠ۖۧ;->ܳ()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 50
    invoke-virtual {p1}, Ll/۠ۖۧ;->ۚ()V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_c
    return v1
.end method

.method public final onResume()V
    .locals 3

    .line 404
    invoke-super {p0}, Ll/ܽ֡֫;->onResume()V

    .line 444
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 445
    iget-boolean v1, p0, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    const/4 v2, 0x0

    .line 446
    iput-boolean v2, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 447
    iput-boolean v2, p0, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 448
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    if-nez v1, :cond_0

    goto :goto_1

    .line 470
    :cond_0
    invoke-virtual {v0}, Ll/ܶۤܳ;->ܳ()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    .line 474
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    .line 474
    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 478
    :catch_0
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    invoke-virtual {v0}, Ll/ܶۤܳ;->۫()Z

    move-result v2

    :goto_0
    if-nez v2, :cond_2

    goto :goto_1

    .line 455
    :cond_2
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    invoke-virtual {v0}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    .line 456
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    .line 457
    iput-boolean v1, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    .line 463
    new-instance v2, Ll/ܿۜᩴ;

    invoke-direct {v2, p0, v0, v1, v1}, Ll/ܿۜᩴ;-><init>(Ll/ᩳ᩷ܳ;Ljava/lang/String;ZZ)V

    invoke-virtual {v2}, Ll/ۖۙܺ;->۫()V

    .line 406
    :cond_3
    :goto_1
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-nez v0, :cond_4

    goto :goto_2

    .line 480
    :cond_4
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    .line 410
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    invoke-virtual {v1, v0}, Ll/ܿ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_2

    .line 416
    :cond_5
    :try_start_1
    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 421
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    invoke-virtual {p0, v0, v1}, Ll/ᩳ᩷ܳ;->ۙ(Ll/ᩳܳܳ;Ll/֨᩷ܳ;)V

    return-void

    :catch_1
    move-exception v0

    .line 418
    invoke-virtual {p0, v0}, Ll/ᩳ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 551
    iget-boolean v3, v1, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    const/4 v4, 0x0

    .line 552
    iput-boolean v4, v1, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 553
    iput-boolean v4, v1, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    .line 554
    iget-object v0, v1, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    if-eqz v0, :cond_0

    .line 555
    invoke-virtual {v0}, Ll/ۜ᩸ܳ;->ۙ()V

    .line 557
    :cond_0
    iget-object v0, v1, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-eqz v0, :cond_1

    .line 558
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ᩴ()V

    .line 559
    iget-object v0, v1, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩸()Z

    .line 561
    :cond_1
    iget-object v0, v1, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    const/4 v5, 0x0

    if-nez v0, :cond_2

    move-object v9, v5

    goto :goto_0

    .line 480
    :cond_2
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    move-object v9, v0

    .line 562
    :goto_0
    iget-object v7, v1, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    if-eqz v7, :cond_4

    if-eqz v9, :cond_4

    .line 568
    :try_start_0
    invoke-virtual {v9}, Ll/ᩳܳܳ;->ۚ()Ll/۠ᩴܳ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v5

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v6, v0

    move-object v0, v5

    .line 572
    :goto_1
    new-instance v8, Ll/ۚ۬ᩴ;

    iget-boolean v10, v1, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    iget-boolean v11, v1, Ll/ᩳ᩷ܳ;->֡᩷:Z

    iget-boolean v12, v1, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    iget-object v13, v1, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-nez v0, :cond_3

    move-object v14, v5

    goto :goto_2

    .line 574
    :cond_3
    invoke-virtual {v0}, Ll/۠ᩴܳ;->ۤ()Ll/ܶܳܳ;

    move-result-object v14

    :goto_2
    invoke-virtual {v13, v14}, Ll/ۨ᩷ܳ;->ۙ(Ll/ܶܳܳ;)Ll/᩵᩷ܳ;

    move-result-object v13

    invoke-direct {v8, v10, v11, v12, v13}, Ll/ۚ۬ᩴ;-><init>(ZZZLl/᩵᩷ܳ;)V

    iput-object v8, v1, Ll/ᩳ᩷ܳ;->۠᩷:Ll/ۚ۬ᩴ;

    goto :goto_3

    :cond_4
    move-object v0, v5

    move-object v6, v0

    .line 576
    :goto_3
    iget-object v8, v1, Ll/ᩳ᩷ܳ;->۠᩷:Ll/ۚ۬ᩴ;

    const/4 v14, 0x1

    if-eqz v8, :cond_5

    const-string v10, "hex_ui_present"

    .line 436
    invoke-virtual {v2, v10, v14}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_keyboard_showing"

    .line 437
    iget-boolean v11, v8, Ll/ۚ۬ᩴ;->ۤ:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_keyboard_enable"

    .line 438
    iget-boolean v11, v8, Ll/ۚ۬ᩴ;->᩷:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_hex_mode"

    .line 439
    iget-boolean v11, v8, Ll/ۚ۬ᩴ;->ۙ:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 440
    iget-object v8, v8, Ll/ۚ۬ᩴ;->᩸:Ll/᩵᩷ܳ;

    iget-wide v10, v8, Ll/᩵᩷ܳ;->᩷:J

    const-string v12, "hex_ui_scroll"

    invoke-virtual {v2, v12, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v10, "hex_ui_selection_start"

    .line 441
    iget v11, v8, Ll/᩵᩷ܳ;->ᩴ:I

    invoke-virtual {v2, v10, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v10, "hex_ui_selection_end"

    .line 442
    iget v11, v8, Ll/᩵᩷ܳ;->᩸:I

    invoke-virtual {v2, v10, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v10, "hex_ui_select_hex_first"

    .line 443
    iget-boolean v11, v8, Ll/᩵᩷ܳ;->ۤ:Z

    invoke-virtual {v2, v10, v11}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v10, "hex_ui_multi_select"

    .line 444
    iget-boolean v8, v8, Ll/᩵᩷ܳ;->ۙ:Z

    invoke-virtual {v2, v10, v8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 579
    :cond_5
    iget-object v8, v1, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    const-string v15, "hex_session_token"

    if-eqz v8, :cond_7

    iget-object v10, v1, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    if-eqz v10, :cond_6

    iget-boolean v10, v1, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    if-eqz v10, :cond_7

    .line 580
    :cond_6
    invoke-virtual {v2, v15, v8}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    iput-boolean v14, v1, Ll/ᩳ᩷ܳ;->֫᩷:Z

    goto/16 :goto_8

    .line 584
    :cond_7
    iget-object v8, v1, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 586
    iget-boolean v10, v1, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    const-wide/high16 v12, -0x8000000000000000L

    if-nez v10, :cond_d

    if-eqz v9, :cond_d

    if-eqz v7, :cond_d

    if-eqz v0, :cond_d

    .line 588
    :try_start_1
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual {v0}, Ll/۠ᩴܳ;->ۙ()Z

    move-result v6

    if-eqz v6, :cond_8

    const/4 v6, 0x1

    const/4 v11, 0x1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto/16 :goto_6

    :cond_8
    const/4 v6, 0x0

    const/4 v11, 0x0

    .line 589
    :goto_4
    invoke-virtual {v0}, Ll/۠ᩴܳ;->᩷()J

    move-result-wide v16

    if-nez v11, :cond_9

    .line 590
    iget-boolean v0, v1, Ll/ᩳ᩷ܳ;->ܺ᩷:Z

    if-eqz v0, :cond_9

    .line 362
    iput-wide v12, v1, Ll/ᩳ᩷ܳ;->۫᩷:J

    .line 363
    iput-boolean v4, v1, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    if-eqz v8, :cond_e

    .line 594
    iput-object v5, v1, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 595
    invoke-virtual {v8}, Ll/ܶۤܳ;->᩷()V

    goto/16 :goto_8

    :cond_9
    if-eqz v8, :cond_a

    .line 599
    iget-wide v4, v1, Ll/ᩳ᩷ܳ;->۫᩷:J

    cmp-long v0, v4, v16

    if-nez v0, :cond_a

    iget-boolean v0, v1, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    if-ne v0, v11, :cond_a

    .line 602
    invoke-virtual {v8}, Ll/ܶۤܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 603
    invoke-virtual {v8}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v15, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 604
    iput-boolean v14, v1, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 606
    iput-boolean v3, v1, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    goto/16 :goto_8

    :cond_a
    if-nez v8, :cond_b

    .line 611
    invoke-static {}, Ll/ܶۤܳ;->ܺ()Ll/ܶۤܳ;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v0, 0x1

    move-object v4, v8

    const/4 v3, 0x1

    goto :goto_5

    :cond_b
    const/4 v0, 0x0

    move-object v4, v8

    const/4 v3, 0x0

    .line 615
    :goto_5
    :try_start_2
    iget-object v0, v1, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    invoke-virtual {v0, v9}, Ll/ܿ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Z

    move-result v0

    xor-int/2addr v0, v14

    .line 616
    iget-boolean v8, v1, Ll/ᩳ᩷ܳ;->ܺ᩷:Z

    iget-boolean v5, v1, Ll/ᩳ᩷ܳ;->ۡ᩷:Z

    iget-object v10, v1, Ll/ᩳ᩷ܳ;->ܳ᩷:Ljava/util/concurrent/Executor;

    move-object v6, v4

    move-object/from16 v16, v10

    move v10, v11

    move/from16 v18, v11

    move v11, v5

    move v12, v0

    move-object/from16 v13, v16

    invoke-static/range {v6 .. v13}, Ll/ۧ۬ᩴ;->ۙ(Ll/ܶۤܳ;Ll/֨᩷ܳ;ZLl/ᩳܳܳ;ZZZLjava/util/concurrent/Executor;)Ll/ܺۤܳ;

    move-result-object v0

    .line 620
    invoke-virtual {v4}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v15, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 621
    iput-boolean v14, v1, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 622
    iput-boolean v14, v1, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    .line 623
    invoke-virtual {v0}, Ll/ܺۤܳ;->᩷()J

    move-result-wide v5

    iput-wide v5, v1, Ll/ᩳ᩷ܳ;->۫᩷:J

    move/from16 v6, v18

    .line 624
    iput-boolean v6, v1, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    if-eqz v3, :cond_e

    .line 626
    iput-object v4, v1, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catchall_2
    move-exception v0

    move-object v8, v4

    const-wide/high16 v4, -0x8000000000000000L

    move/from16 v19, v3

    move-object v3, v0

    move/from16 v0, v19

    goto :goto_7

    :goto_6
    const/4 v3, 0x0

    move-object v3, v0

    const/4 v0, 0x0

    const-wide/high16 v4, -0x8000000000000000L

    .line 362
    :goto_7
    iput-wide v4, v1, Ll/ᩳ᩷ܳ;->۫᩷:J

    const/4 v4, 0x0

    .line 363
    iput-boolean v4, v1, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    if-eqz v0, :cond_c

    .line 634
    :try_start_3
    invoke-virtual {v8}, Ll/ܶۤܳ;->᩷()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    move-object v4, v0

    .line 636
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_c
    if-eqz v8, :cond_e

    .line 641
    :try_start_4
    invoke-virtual {v8}, Ll/ܶۤܳ;->ۤ()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v4, v0

    .line 643
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_8

    :cond_d
    move-wide v4, v12

    if-eqz v6, :cond_e

    .line 362
    iput-wide v4, v1, Ll/ᩳ᩷ܳ;->۫᩷:J

    const/4 v0, 0x0

    .line 363
    iput-boolean v0, v1, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    if-eqz v8, :cond_e

    .line 652
    :try_start_5
    invoke-virtual {v8}, Ll/ܶۤܳ;->ۤ()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v3, v0

    .line 654
    invoke-virtual {v6, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 546
    :cond_e
    :goto_8
    invoke-super/range {p0 .. p1}, Ll/ۚۤ;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ֫()V
    .locals 0

    .line 167
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->᩸ۙ()V

    return-void
.end method

.method public final ۙ(IIIZ)V
    .locals 7

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p4, :cond_2

    .line 962
    iget-boolean p4, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    if-eqz p4, :cond_0

    .line 963
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->᩸ۙ()V

    .line 964
    :cond_0
    iget-boolean p4, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    if-eqz p4, :cond_1

    const-string p4, "Sel: %Xh - %Xh  Len: %Xh  Size: %Xh [HEX]"

    goto :goto_0

    :cond_1
    const-string p4, "Sel: %d - %d  Len: %d  Size: %d [DEC]"

    :goto_0
    sub-int v4, p2, p1

    add-int/2addr v4, v3

    .line 968
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v6, 0x4

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p1, v6, v2

    aput-object p2, v6, v3

    aput-object v4, v6, v1

    aput-object p3, v6, v0

    invoke-static {v5, p4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 969
    iget-object p2, p0, Ll/ᩳ᩷ܳ;->ۛ᩷:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    if-ge p1, p3, :cond_4

    .line 972
    iget-boolean p2, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    if-eqz p2, :cond_3

    const-string p2, "Val: %Xh  Pos: %Xh  Size: %Xh [HEX]"

    goto :goto_1

    :cond_3
    const-string p2, "Val: %d  Pos: %d  Size: %d [DEC]"

    .line 977
    :goto_1
    :try_start_0
    iget-object p4, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object p4, p4, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p4}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object p4

    new-array v4, v3, [B

    .line 25
    invoke-virtual {p4, p1, v4, v2, v3}, Ll/ᩳܳܳ;->ۙ(I[BII)V

    .line 26
    aget-byte p4, v4, v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 p4, p4, 0xff

    .line 985
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p4, v0, v2

    aput-object p1, v0, v3

    aput-object p3, v0, v1

    invoke-static {v4, p2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 986
    iget-object p2, p0, Ll/ᩳ᩷ܳ;->ۛ᩷:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :catch_0
    move-exception p1

    .line 979
    invoke-virtual {p0, p1}, Ll/ᩳ᩷ܳ;->ۙ(Ljava/io/IOException;)V

    return-void

    .line 988
    :cond_4
    iget-boolean p1, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    if-eqz p1, :cond_5

    const-string p1, "Size: %Xh [HEX]"

    goto :goto_2

    :cond_5
    const-string p1, "Size: %d [DEC]"

    .line 991
    :goto_2
    sget-object p2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array p4, v3, [Ljava/lang/Object;

    aput-object p3, p4, v2

    invoke-static {p2, p1, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 992
    iget-object p2, p0, Ll/ᩳ᩷ܳ;->ۛ᩷:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Ljava/io/IOException;)V
    .locals 2

    .line 1007
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    .line 1008
    instance-of v1, p1, Ll/۫ۚܳ;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/ᩳܳܳ;->ۗ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 546
    invoke-virtual {p0, p1, v0}, Ll/ܽ֡֫;->ۙ(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 1009
    invoke-direct {p0, p1}, Ll/ᩳ᩷ܳ;->᩷(Z)V

    return-void
.end method

.method public final ۙ(Ll/֨᩷ܳ;)V
    .locals 3

    .line 330
    iput-object p1, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    .line 337
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    const-wide/high16 v0, -0x8000000000000000L

    .line 362
    iput-wide v0, p0, Ll/ᩳ᩷ܳ;->۫᩷:J

    const/4 v0, 0x0

    .line 363
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    if-nez p1, :cond_0

    .line 340
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 341
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    goto :goto_0

    .line 345
    :cond_0
    :try_start_0
    iget-boolean v1, p0, Ll/ᩳ᩷ܳ;->ܺ᩷:Z

    if-eqz v1, :cond_1

    .line 346
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    .line 347
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۧ᩷:Z

    const/4 v0, 0x0

    .line 348
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 349
    invoke-virtual {p1}, Ll/ܶۤܳ;->᩷()V

    goto :goto_0

    .line 352
    :cond_1
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object p1, p1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {p1}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object p1

    .line 352
    invoke-virtual {p1}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ᩳ᩷ܳ;->۫᩷:J

    .line 353
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۚ᩷:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 332
    :catch_0
    :goto_0
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->ܶ()V

    return-void
.end method

.method public final ۙ(Ll/ᩳܳܳ;Ll/֨᩷ܳ;)V
    .locals 1

    .line 428
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->ᩴ᩷:Ll/۟᩷ܳ;

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    .line 429
    invoke-virtual {v0, p1}, Ll/ܿ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 432
    :cond_0
    new-instance v0, Ll/۟᩷ܳ;

    invoke-direct {v0, p0, p1, p2}, Ll/۟᩷ܳ;-><init>(Ll/ᩳ᩷ܳ;Ll/ᩳܳܳ;Ll/֨᩷ܳ;)V

    .line 433
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ᩴ᩷:Ll/۟᩷ܳ;

    .line 435
    :try_start_0
    invoke-virtual {v0}, Ll/ۖۙܺ;->۫()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 437
    iput-object p1, p0, Ll/ᩳ᩷ܳ;->ᩴ᩷:Ll/۟᩷ܳ;

    const p1, 0x7f120999

    const/4 p2, 0x0

    .line 531
    invoke-virtual {p0, p1, p2}, Ll/ܽ֡֫;->ۙ(IZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۙ(Ll/ᩳܳܳ;Ll/ܶۤܳ;Ll/֨᩷ܳ;ZZ)V
    .locals 8

    .line 174
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_c

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    .line 189
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v0

    .line 191
    iput-boolean p5, p0, Ll/ᩳ᩷ܳ;->ۡ᩷:Z

    .line 192
    iget-object p5, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v1

    invoke-virtual {p5, v1}, Ll/ۨ᩷ܳ;->᩷(Z)V

    .line 193
    iget-object p5, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {p5, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ᩳܳܳ;)Ll/ᩳܳܳ;

    move-result-object p5

    .line 194
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 195
    iput-object p2, p0, Ll/ᩳ᩷ܳ;->ܳۤ:Ll/ܶۤܳ;

    .line 196
    iput-object p3, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    .line 197
    iput-boolean p4, p0, Ll/ᩳ᩷ܳ;->ܺ᩷:Z

    const/4 p4, 0x0

    .line 198
    iput-boolean p4, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    .line 200
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->۠᩷:Ll/ۚ۬ᩴ;

    const/4 v3, 0x0

    .line 201
    iput-object v3, p0, Ll/ᩳ᩷ܳ;->۠᩷:Ll/ۚ۬ᩴ;

    .line 258
    iput-object v3, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    const v4, 0x3e99999a    # 0.3f

    if-eqz v2, :cond_2

    .line 205
    iget-boolean v5, v2, Ll/ۚ۬ᩴ;->ۤ:Z

    iput-boolean v5, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 206
    iget-boolean v5, v2, Ll/ۚ۬ᩴ;->᩷:Z

    iput-boolean v5, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    .line 207
    iget-boolean v5, v2, Ll/ۚ۬ᩴ;->ۙ:Z

    iput-boolean v5, p0, Ll/ᩳ᩷ܳ;->᩺᩷:Z

    .line 209
    :try_start_0
    iget-object v5, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    iget-object v2, v2, Ll/ۚ۬ᩴ;->᩸:Ll/᩵᩷ܳ;

    invoke-virtual {v5, v2}, Ll/ۨ᩷ܳ;->ۙ(Ll/᩵᩷ܳ;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 214
    :catch_0
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1222
    iget-object v2, v2, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v2}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result v2

    .line 214
    iget-object v5, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1226
    iget-object v5, v5, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v5}, Ll/ۚ᩷ܳ;->۫()I

    move-result v5

    .line 214
    iget-object v6, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1230
    iget-object v6, v6, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v6}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v6

    .line 215
    iget-object v7, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1234
    iget-object v7, v7, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v7}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v7

    .line 214
    invoke-virtual {p0, v2, v5, v7, v6}, Ll/ᩳ᩷ܳ;->ۙ(IIIZ)V

    .line 265
    :goto_0
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    iget-boolean v5, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    if-eqz v5, :cond_1

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    const v5, 0x3e99999a    # 0.3f

    :goto_1
    invoke-virtual {v2, v5}, Landroid/view/View;->setAlpha(F)V

    .line 266
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ܿ᩷:Ll/ܶۙܳ;

    iget-boolean v5, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    invoke-virtual {v2, v5, p4}, Ll/ܶۙܳ;->ۙ(ZZ)V

    :cond_2
    if-eqz p2, :cond_3

    .line 219
    invoke-virtual {p2}, Ll/ܶۤܳ;->۫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 220
    invoke-virtual {p1}, Ll/ᩳܳܳ;->ܽ()J

    move-result-wide v5

    iput-wide v5, p0, Ll/ᩳ᩷ܳ;->۫᩷:J

    .line 221
    invoke-virtual {p1}, Ll/ᩳܳܳ;->᩹()Z

    move-result v2

    iput-boolean v2, p0, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    goto :goto_2

    :cond_3
    const-wide/high16 v5, -0x8000000000000000L

    .line 362
    iput-wide v5, p0, Ll/ᩳ᩷ܳ;->۫᩷:J

    .line 363
    iput-boolean p4, p0, Ll/ᩳ᩷ܳ;->ۚ᩷:Z

    :goto_2
    if-eqz v0, :cond_4

    .line 225
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x1

    .line 226
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    .line 227
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 379
    :cond_4
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v0

    .line 380
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    invoke-virtual {v2, v0}, Ll/ۨ᩷ܳ;->᩷(Z)V

    .line 381
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ᩴۤ:Ll/ۜ᩸ܳ;

    invoke-virtual {v2, v0}, Ll/ۜ᩸ܳ;->ۙ(Z)V

    const v2, 0x7f0a0271

    .line 382
    invoke-virtual {p0, v2}, Ll/ܽ֡֫;->᩷(I)Landroid/view/View;

    move-result-object v2

    iget-boolean v5, p0, Ll/ᩳ᩷ܳ;->ۡ᩷:Z

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_3

    :cond_5
    const/16 v5, 0x8

    :goto_3
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 383
    invoke-direct {p0}, Ll/ᩳ᩷ܳ;->֫ۙ()V

    .line 384
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    xor-int/lit8 v5, v0, 0x1

    invoke-virtual {v2, v5}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v0, :cond_6

    .line 386
    iput-boolean p4, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    .line 387
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 388
    iput-boolean p4, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 389
    invoke-virtual {p0}, Ll/ܽ֡֫;->ۖ()V

    goto :goto_4

    .line 391
    :cond_6
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ۢ᩷:Landroid/view/View;

    iget-boolean v5, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    if-eqz v5, :cond_7

    const/high16 v4, 0x3f800000    # 1.0f

    :cond_7
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 392
    invoke-virtual {p0}, Ll/ۘᩴ;->ۨ()Ll/ۖ᩸;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 393
    invoke-virtual {p0}, Ll/ۘᩴ;->ۨ()Ll/ۖ᩸;

    move-result-object v2

    invoke-virtual {v2, p4}, Ll/ۖ᩸;->ۤ(Z)V

    .line 395
    :cond_8
    iget-object v2, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    invoke-virtual {v2, v3}, Ll/ܶ᩹;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 398
    :goto_4
    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ܿ᩷:Ll/ܶۙܳ;

    iget-boolean v4, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    invoke-virtual {v2, v4, p4}, Ll/ܶۙܳ;->ۙ(ZZ)V

    .line 399
    iget-object p4, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    if-eqz v0, :cond_9

    new-instance v3, Ll/ۘ᩷ܳ;

    const/4 v0, 0x0

    invoke-direct {v3, v0, p0}, Ll/ۘ᩷ܳ;-><init>(ILjava/lang/Object;)V

    :cond_9
    invoke-virtual {p4, v3}, Ll/ܶ᩹;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 231
    iget-object p4, p0, Ll/ᩳ᩷ܳ;->ܰ᩷:Ll/ᩴۤܳ;

    invoke-virtual {p4}, Ll/ᩴۤܳ;->ۙ()V

    .line 232
    invoke-virtual {p0}, Ll/ۘᩴ;->invalidateOptionsMenu()V

    .line 235
    invoke-virtual {p0, p1, p3}, Ll/ᩳ᩷ܳ;->ۙ(Ll/ᩳܳܳ;Ll/֨᩷ܳ;)V

    if-eqz p5, :cond_a

    if-eq p5, p1, :cond_a

    .line 239
    :try_start_1
    invoke-virtual {p5}, Ll/ᩳܳܳ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    nop

    :cond_a
    :goto_5
    if-eqz v1, :cond_d

    if-eq v1, p2, :cond_d

    if-eqz p2, :cond_b

    .line 245
    invoke-virtual {v1}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ܶۤܳ;->ᩴ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 247
    :cond_b
    :try_start_2
    invoke-virtual {v1}, Ll/ܶۤܳ;->᩷()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_8

    .line 176
    :cond_c
    :goto_6
    :try_start_3
    invoke-virtual {p1}, Ll/ᩳܳܳ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_7

    :catch_2
    nop

    :goto_7
    if-eqz p2, :cond_d

    .line 180
    invoke-virtual {p0, p2}, Ll/ᩳ᩷ܳ;->ۙ(Ll/ܶۤܳ;)Z

    move-result p1

    if-nez p1, :cond_d

    .line 182
    :try_start_4
    invoke-virtual {p2}, Ll/ܶۤܳ;->᩷()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_d
    :goto_8
    return-void
.end method

.method public final ۙ(Ll/ᩴܺۤ;)V
    .locals 2

    .line 1225
    invoke-virtual {p1}, Ll/ᩴܺۤ;->᩷()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ֫ۤ;

    invoke-virtual {v0}, Ll/ܰ֫ۤ;->ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1226
    new-instance v0, Ll/ܰ֫ۤ;

    invoke-direct {v0}, Ll/ܰ֫ۤ;-><init>()V

    .line 1227
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v1

    .line 1227
    invoke-virtual {v0, v1}, Ll/ܰ֫ۤ;->ۙ(Ljava/lang/Object;)V

    .line 1228
    invoke-virtual {p1, v0}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void

    .line 1230
    :cond_0
    new-instance v0, Ll/ܰ֫ۤ;

    invoke-direct {v0}, Ll/ܰ֫ۤ;-><init>()V

    .line 1231
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1234
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩸()I

    move-result v1

    .line 1231
    invoke-virtual {v0, v1}, Ll/ܰ֫ۤ;->ۙ(I)V

    .line 1232
    invoke-virtual {p1, v0}, Ll/ᩴܺۤ;->ۙ(Ll/ܰ֫ۤ;)V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1127
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ll/۟᩷ۙ;->۫(I)V

    return-void

    .line 1129
    :cond_0
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->ܶ᩷:Ll/۟᩷ۙ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/۟᩷ۙ;->۫(I)V

    return-void
.end method

.method public final ۙ(ZZZ)V
    .locals 4

    .line 1109
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->֨᩷:Z

    if-eq v0, p3, :cond_1

    .line 1110
    iput-boolean p3, p0, Ll/ᩳ᩷ܳ;->֨᩷:Z

    .line 1111
    iget-object v0, p0, Ll/ܽ֡֫;->ۡۙ:Ll/ܶ᩹;

    if-eqz p3, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    const-string v3, " *"

    .line 0
    invoke-static {v1, v2, v3}, Ll/۠᩹ᩴ;->ۙ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 1111
    :cond_0
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ۨ᩷:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1}, Ll/ܶ᩹;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 1113
    :cond_1
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩷ۤ:Ll/᩸ۢ;

    if-eqz v0, :cond_2

    .line 1114
    invoke-interface {v0, p3}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1116
    :cond_2
    iget-object p3, p0, Ll/ᩳ᩷ܳ;->ۚۤ:Ll/᩸ۢ;

    if-eqz p3, :cond_3

    .line 1117
    invoke-interface {p3, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 1119
    :cond_3
    iget-object p1, p0, Ll/ᩳ᩷ܳ;->۬᩷:Ll/᩸ۢ;

    if-eqz p1, :cond_4

    .line 1120
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    :cond_4
    return-void
.end method

.method public final synthetic ۙ(J)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ljava/lang/Object;Ll/ᩳܳܳ;)Z
    .locals 1

    .line 316
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    if-ne v0, p2, :cond_0

    .line 317
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    .line 318
    invoke-virtual {v0, p1, p2}, Ll/ܿ᩷ܳ;->ۙ(Ljava/lang/Object;Ll/ᩳܳܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۙ(Ll/ܶۤܳ;)Z
    .locals 4

    .line 289
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    iget-boolean v1, p0, Ll/ᩳ᩷ܳ;->ۗ᩷:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    .line 290
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    if-eqz p1, :cond_2

    .line 306
    invoke-virtual {p1}, Ll/ܶۤܳ;->ۚ()Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    return v3
.end method

.method public final ۤ()Ll/ܽ֡֫;
    .locals 0

    return-object p0
.end method

.method public final ۤۙ()Z
    .locals 1

    .line 295
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->֫᩷:Z

    return v0
.end method

.method public final ۫ۙ()Z
    .locals 1

    .line 300
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ܳ()V
    .locals 2

    .line 1000
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->֡᩷:Z

    if-eqz v0, :cond_1

    .line 897
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 1230
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 897
    invoke-virtual {p0}, Ll/ᩳ᩷ܳ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 899
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 900
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ܿ᩷:Ll/ܶۙܳ;

    invoke-virtual {v1, v0, v0}, Ll/ܶۙܳ;->ۙ(ZZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ܳۙ()V
    .locals 1

    const/4 v0, 0x0

    .line 1019
    invoke-direct {p0, v0}, Ll/ᩳ᩷ܳ;->᩷(Z)V

    return-void
.end method

.method public final ܺ()Z
    .locals 1

    .line 160
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۜ᩷:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۡ᩷:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩴۙ()V
    .locals 2

    const/4 v0, 0x0

    .line 484
    iput-object v0, p0, Ll/ᩳ᩷ܳ;->ۖ᩷:Ljava/lang/String;

    const/4 v0, 0x0

    .line 485
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    .line 486
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 480
    :cond_0
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 491
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    invoke-virtual {p0, v0, v1}, Ll/ᩳ᩷ܳ;->ۙ(Ll/ᩳܳܳ;Ll/֨᩷ܳ;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ᩶()Ljava/lang/String;
    .locals 1

    const-string v0, "HexEditor"

    return-object v0
.end method

.method public final ᩷(Ljava/lang/Object;Ll/ᩳܳܳ;)V
    .locals 1

    .line 323
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩸᩷:Ll/ܿ᩷ܳ;

    invoke-virtual {v0, p1, p2}, Ll/ܿ᩷ܳ;->᩷(Ljava/lang/Object;Ll/ᩳܳܳ;)V

    return-void
.end method

.method public final ᩷(Ll/֨᩷ܳ;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 371
    iput-object p1, p0, Ll/ᩳ᩷ܳ;->۫ۤ:Ll/֨᩷ܳ;

    :cond_0
    const/4 p1, 0x0

    .line 374
    invoke-direct {p0, p1}, Ll/ᩳ᩷ܳ;->᩷(Z)V

    return-void
.end method

.method public final ᩷ۙ()Z
    .locals 2

    .line 497
    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll/ᩳ᩷ܳ;->ۙۤ:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 480
    :cond_0
    iget-object v0, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v0}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v0

    .line 502
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܳܳ;->᩶()V

    .line 503
    iget-boolean v1, p0, Ll/ᩳ᩷ܳ;->᩻᩷:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    .line 480
    iget-object v1, v1, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ᩴ()Ll/ᩳܳܳ;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v1, v0, :cond_1

    const/4 v0, 0x1

    return v0

    :catch_0
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩸()Ll/ۨ᩷ܳ;
    .locals 1

    .line 165
    iget-object v0, p0, Ll/ᩳ᩷ܳ;->᩹᩷:Ll/ۨ᩷ܳ;

    return-object v0
.end method

.method public final ᩸ۙ()V
    .locals 3

    const/4 v0, 0x0

    .line 904
    iput-boolean v0, p0, Ll/ᩳ᩷ܳ;->ᩳ᩷:Z

    .line 905
    iget-object v1, p0, Ll/ᩳ᩷ܳ;->ܿ᩷:Ll/ܶۙܳ;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ll/ܶۙܳ;->ۙ(ZZ)V

    return-void
.end method

.method public final ᩺()V
    .locals 0

    .line 737
    invoke-direct {p0}, Ll/ᩳ᩷ܳ;->ۚۙ()V

    return-void
.end method
