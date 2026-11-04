.class public final Ll/۫֨ᩴ;
.super Ljava/lang/Object;
.source "7AJG"


# static fields
.field public static final ֡:Landroid/os/Handler;

.field public static final ۟:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final ֫:Landroid/widget/TextView;

.field public final ۗ:Landroid/widget/TextView;

.field public ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ۙ:Landroid/widget/Button;

.field public final ۚ:Ljava/lang/ref/WeakReference;

.field public ۛ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ۤ:Ll/۠ۖۧ;

.field public final ۧ:Landroid/view/View;

.field public final ۨ:Landroid/widget/TextView;

.field public final ۫:Landroid/widget/TextView;

.field public ܰ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ܳ:I

.field public final ܶ:Landroid/widget/TextView;

.field public final ܺ:Landroid/widget/ProgressBar;

.field public final ܽ:Landroid/widget/TextView;

.field public ܿ:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ᩴ:Landroid/widget/TextView;

.field public final ᩵:Landroid/view/View;

.field public ᩶:Ljava/util/concurrent/atomic/AtomicReference;

.field public ᩷:Z

.field public final ᩸:Landroid/view/View;

.field public final ᩹:Landroid/widget/TextView;

.field public ᩺:Ljava/util/concurrent/atomic/AtomicReference;

.field public ᩻:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 337
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Ll/۫֨ᩴ;->۟:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 338
    new-instance v0, Ll/ܳ֨ᩴ;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Ll/۫֨ᩴ;->֡:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Ll/ܽ֡֫;)V
    .locals 2

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 350
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۫֨ᩴ;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 351
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۫֨ᩴ;->᩺:Ljava/util/concurrent/atomic/AtomicReference;

    .line 352
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۫֨ᩴ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    .line 353
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۫֨ᩴ;->ܰ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 354
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ll/۫֨ᩴ;->ۛ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 355
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/۫֨ᩴ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 357
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/۫֨ᩴ;->ۚ:Ljava/lang/ref/WeakReference;

    .line 358
    sget-object v0, Ll/۫֨ᩴ;->۟:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, Ll/۫֨ᩴ;->ܳ:I

    const v0, 0x7f0d00a9

    .line 56
    invoke-virtual {p1, v0}, Ll/ܽ֡֫;->ۙ(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setKeepScreenOn(Z)V

    const v1, 0x7f0a0681

    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->ۗ:Landroid/widget/TextView;

    const v1, 0x7f0a06c3

    .line 59
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->֫:Landroid/widget/TextView;

    const v1, 0x7f0a06c4

    .line 60
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->ᩴ:Landroid/widget/TextView;

    const v1, 0x7f0a06c5

    .line 61
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->ۨ:Landroid/widget/TextView;

    const v1, 0x7f0a06c6

    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->ܶ:Landroid/widget/TextView;

    const v1, 0x7f0a06c7

    .line 63
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->᩹:Landroid/widget/TextView;

    const v1, 0x7f0a0255

    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->ܽ:Landroid/widget/TextView;

    const v1, 0x7f0a0246

    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/۫֨ᩴ;->᩸:Landroid/view/View;

    const v1, 0x7f0a0249

    .line 67
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/۫֨ᩴ;->᩵:Landroid/view/View;

    const v1, 0x7f0a04a4

    .line 68
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    iput-object v1, p0, Ll/۫֨ᩴ;->ܺ:Landroid/widget/ProgressBar;

    const v1, 0x7f0a00ac

    .line 69
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p0, Ll/۫֨ᩴ;->ۙ:Landroid/widget/Button;

    const v1, 0x7f0a03f4

    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۫֨ᩴ;->۫:Landroid/widget/TextView;

    const v1, 0x7f0a0247

    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/۫֨ᩴ;->ۧ:Landroid/view/View;

    .line 74
    invoke-virtual {p1}, Ll/ܽ֡֫;->buildDialog()Ll/ۖۖۧ;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۖۖۧ;->ۙ(Z)V

    invoke-virtual {p1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    iput-object p1, p0, Ll/۫֨ᩴ;->ۤ:Ll/۠ۖۧ;

    return-void
.end method

.method public static synthetic ۙ(Ll/۫֨ᩴ;)V
    .locals 2

    .line 324
    iget-object v0, p0, Ll/۫֨ᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-direct {p0}, Ll/۫֨ᩴ;->۫()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 325
    invoke-static {v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ll/᩷ܿ֫;

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Ll/᩷ܿ֫;-><init>(ILjava/lang/Object;)V

    const-wide/16 v0, 0x32

    invoke-static {p0, v0, v1}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    return-void

    .line 327
    :cond_0
    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public static synthetic ۙ(Ll/۫֨ᩴ;I)V
    .locals 0

    .line 229
    iget-object p0, p0, Ll/۫֨ᩴ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public static synthetic ۙ(Ll/۫֨ᩴ;Z)V
    .locals 6

    .line 235
    iget-object v0, p0, Ll/۫֨ᩴ;->᩵:Landroid/view/View;

    iget-object v1, p0, Ll/۫֨ᩴ;->᩸:Landroid/view/View;

    iget-object v2, p0, Ll/۫֨ᩴ;->ۧ:Landroid/view/View;

    iget-object v3, p0, Ll/۫֨ᩴ;->۫:Landroid/widget/TextView;

    const/4 v4, 0x0

    const/16 v5, 0x8

    if-eqz p1, :cond_0

    .line 236
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 237
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 238
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 239
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 241
    :cond_0
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 242
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 243
    iget-object p1, p0, Ll/۫֨ᩴ;->ᩴ:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x8

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 244
    iget-object p0, p0, Ll/۫֨ᩴ;->ۨ:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/widget/TextView;->length()I

    move-result p0

    if-nez p0, :cond_2

    const/16 v4, 0x8

    :cond_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/۫֨ᩴ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/۫֨ᩴ;->۫()Z

    return-void
.end method

.method private ۫()Z
    .locals 9

    .line 368
    iget-object v0, p0, Ll/۫֨ᩴ;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 369
    iget-object v2, p0, Ll/۫֨ᩴ;->᩺:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    .line 370
    iget-object v3, p0, Ll/۫֨ᩴ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    .line 371
    iget-object v4, p0, Ll/۫֨ᩴ;->ܰ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    .line 372
    iget-object v5, p0, Ll/۫֨ᩴ;->ۛ:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 373
    iget-object v5, p0, Ll/۫֨ᩴ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v5

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    .line 375
    iget-object v8, p0, Ll/۫֨ᩴ;->ۗ:Landroid/widget/TextView;

    invoke-static {v0}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v2, :cond_1

    .line 379
    iget-object v0, p0, Ll/۫֨ᩴ;->֫:Landroid/widget/TextView;

    invoke-static {v2}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    :cond_1
    if-eqz v3, :cond_2

    .line 383
    iget-object v0, p0, Ll/۫֨ᩴ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    :cond_2
    if-eqz v4, :cond_3

    .line 387
    iget-object v0, p0, Ll/۫֨ᩴ;->ܶ:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    :cond_3
    if-eqz v1, :cond_4

    .line 391
    iget-object v0, p0, Ll/۫֨ᩴ;->۫:Landroid/widget/TextView;

    invoke-static {v1}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v0, 0x1

    :cond_4
    if-eq v5, v6, :cond_5

    .line 395
    iget-object v0, p0, Ll/۫֨ᩴ;->ܺ:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    return v7

    :cond_5
    return v0
.end method

.method public static bridge synthetic ᩷(Ll/۫֨ᩴ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۫֨ᩴ;->᩷:Z

    return p0
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 110
    iget-boolean v0, p0, Ll/۫֨ᩴ;->᩷:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 111
    iput-boolean v0, p0, Ll/۫֨ᩴ;->᩷:Z

    .line 112
    iget-object v0, p0, Ll/۫֨ᩴ;->᩻:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 113
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 3

    .line 303
    iget-object v0, p0, Ll/۫֨ᩴ;->ܺ:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v1

    if-eq v1, p1, :cond_1

    .line 304
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v1

    iget-object v2, p0, Ll/۫֨ᩴ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    .line 305
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 306
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void

    .line 308
    :cond_0
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 309
    invoke-virtual {p0}, Ll/۫֨ᩴ;->ᩴ()V

    :cond_1
    return-void
.end method

.method public final ۙ(ILandroid/view/View$OnClickListener;)V
    .locals 2

    const/4 v0, 0x0

    .line 193
    iget-object v1, p0, Ll/۫֨ᩴ;->ۙ:Landroid/widget/Button;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 194
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    .line 195
    invoke-virtual {v1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ۙ(J)V
    .locals 1

    .line 278
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1, p2}, Ll/۠֫ܺ;->ۙ(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/s"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 279
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result p2

    iget-object v0, p0, Ll/۫֨ᩴ;->᩶:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    .line 280
    invoke-virtual {v0, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 281
    iget-object p2, p0, Ll/۫֨ᩴ;->᩹:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 283
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 284
    invoke-virtual {p0}, Ll/۫֨ᩴ;->ᩴ()V

    return-void
.end method

.method public final ۙ(Ljava/lang/CharSequence;)V
    .locals 2

    .line 164
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->᩸:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 p1, 0x8

    .line 165
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 167
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 168
    iget-object v0, p0, Ll/۫֨ᩴ;->ᩴ:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 82
    iput-boolean v0, p0, Ll/۫֨ᩴ;->᩷:Z

    .line 83
    iput-object p1, p0, Ll/۫֨ᩴ;->᩻:Ljava/lang/Runnable;

    .line 84
    new-instance p1, Ll/ᩴ֨ᩴ;

    invoke-direct {p1, p0}, Ll/ᩴ֨ᩴ;-><init>(Ll/۫֨ᩴ;)V

    iget-object v0, p0, Ll/۫֨ᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {v0, p1}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public final ۙ(Ll/֫ۤ۫;)V
    .locals 3

    .line 255
    invoke-virtual {p1}, Ll/֫ۤ۫;->۫()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "/"

    if-ne v0, v1, :cond_0

    .line 256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֫ۤ۫;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/֫ۤ۫;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 258
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/֫ۤ۫;->ܳ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/֫ۤ۫;->ۙ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/֫ۤ۫;->᩷()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 263
    :goto_0
    invoke-virtual {p0, p1}, Ll/۫֨ᩴ;->᩸(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۙ(Z)V
    .locals 1

    .line 292
    iget-object v0, p0, Ll/۫֨ᩴ;->ܺ:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    return-void
.end method

.method public final ۤ()Ll/۠ۖۧ;
    .locals 1

    .line 334
    iget-object v0, p0, Ll/۫֨ᩴ;->ۤ:Ll/۠ۖۧ;

    return-object v0
.end method

.method public final ۤ(Ljava/lang/CharSequence;)V
    .locals 2

    .line 207
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->᩺:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 208
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 209
    iget-object v0, p0, Ll/۫֨ᩴ;->֫:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 211
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 212
    invoke-virtual {p0}, Ll/۫֨ᩴ;->ᩴ()V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 202
    iget-object v0, p0, Ll/۫֨ᩴ;->ۤ:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    return-void
.end method

.method public final ܳ(Ljava/lang/CharSequence;)V
    .locals 2

    .line 182
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->᩵:Landroid/view/View;

    if-eqz v0, :cond_0

    const/16 p1, 0x8

    .line 183
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 185
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 186
    iget-object v0, p0, Ll/۫֨ᩴ;->ۨ:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩴ()V
    .locals 4

    .line 361
    sget-object v0, Ll/۫֨ᩴ;->֡:Landroid/os/Handler;

    iget v1, p0, Ll/۫֨ᩴ;->ܳ:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v2

    if-nez v2, :cond_0

    .line 362
    iget-object v2, p0, Ll/۫֨ᩴ;->ۚ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0xf

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_0
    return-void
.end method

.method public final ᩴ(Ljava/lang/CharSequence;)V
    .locals 2

    .line 128
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->ܿ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 129
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Ll/۫֨ᩴ;->ۗ:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 132
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 133
    invoke-virtual {p0}, Ll/۫֨ᩴ;->ᩴ()V

    return-void
.end method

.method public final ᩷()V
    .locals 3

    .line 315
    sget-object v0, Ll/۫֨ᩴ;->֡:Landroid/os/Handler;

    iget v1, p0, Ll/۫֨ᩴ;->ܳ:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 316
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 317
    invoke-direct {p0}, Ll/۫֨ᩴ;->۫()Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->ۤ:Ll/۠ۖۧ;

    if-eqz v0, :cond_0

    .line 318
    invoke-static {v1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll/᩷ܿ֫;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Ll/᩷ܿ֫;-><init>(ILjava/lang/Object;)V

    const-wide/16 v1, 0x32

    invoke-static {v0, v1, v2}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;J)V

    return-void

    .line 320
    :cond_0
    invoke-virtual {v1}, Ll/۠ۖۧ;->dismiss()V

    return-void

    .line 323
    :cond_1
    new-instance v0, Ll/۫᩷ۚ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/۫᩷ۚ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩷(I)V
    .locals 1

    .line 226
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    iget-object v0, p0, Ll/۫֨ᩴ;->ܽ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    .line 229
    :cond_0
    new-instance v0, Ll/ۤ֨ᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۤ֨ᩴ;-><init>(Ll/۫֨ᩴ;I)V

    invoke-static {v0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩷(Ljava/lang/CharSequence;)V
    .locals 2

    .line 145
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->ۛ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 146
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 147
    iget-object v0, p0, Ll/۫֨ᩴ;->۫:Landroid/widget/TextView;

    invoke-static {p1}, Ll/ۤ۠ᩴ;->ۤ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 149
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 150
    invoke-virtual {p0}, Ll/۫֨ᩴ;->ᩴ()V

    return-void
.end method

.method public final ᩸(Ljava/lang/CharSequence;)V
    .locals 2

    .line 267
    invoke-static {}, Ll/᩷᩻ܺ;->᩷()Z

    move-result v0

    iget-object v1, p0, Ll/۫֨ᩴ;->ܰ:Ljava/util/concurrent/atomic/AtomicReference;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 268
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 269
    iget-object v0, p0, Ll/۫֨ᩴ;->ܶ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 271
    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 272
    invoke-virtual {p0}, Ll/۫֨ᩴ;->ᩴ()V

    return-void
.end method

.method public final ᩸()Z
    .locals 1

    .line 119
    iget-boolean v0, p0, Ll/۫֨ᩴ;->᩷:Z

    return v0
.end method
