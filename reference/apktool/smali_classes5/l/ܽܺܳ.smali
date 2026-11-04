.class public final Ll/ܽܺܳ;
.super Ljava/lang/Object;
.source "CIUF"

# interfaces
.implements Ll/ۘܶܳ;


# static fields
.field public static final ֫:Ll/ܽܺܳ;

.field public static volatile ۧ:Ljava/lang/ref/WeakReference;


# instance fields
.field public ۙ:Ll/᩶ܶܳ;

.field public ۚ:Ll/᩶ܽܳ;

.field public volatile ۤ:Z

.field public final ۫:Ll/᩸ܺܳ;

.field public final ܳ:Ll/ܽ᩻ۙ;

.field public final ᩴ:Ll/֡ܽܳ;

.field public final ᩷:Ll/ܽ᩻ۙ;

.field public ᩸:Ll/᩵ܿ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Ll/ܽܺܳ;

    invoke-direct {v0}, Ll/ܽܺܳ;-><init>()V

    sput-object v0, Ll/ܽܺܳ;->֫:Ll/ܽܺܳ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ll/֡ܽܳ;

    sget-object v1, Ll/᩶᩷ۧ;->᩷:Ll/ܽܿ֫;

    invoke-direct {v0, v1}, Ll/֡ܽܳ;-><init>(Ll/ܽܿ֫;)V

    iput-object v0, p0, Ll/ܽܺܳ;->ᩴ:Ll/֡ܽܳ;

    .line 43
    new-instance v0, Ll/᩸ܺܳ;

    sget-object v1, Ll/᩶᩷ۧ;->᩷:Ll/ܽܿ֫;

    invoke-direct {v0, v1}, Ll/᩸ܺܳ;-><init>(Ll/ܽܿ֫;)V

    iput-object v0, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    .line 44
    new-instance v0, Ll/ܽ᩻ۙ;

    .line 40
    invoke-direct {v0}, Ll/ܺ᩻ۙ;-><init>()V

    .line 44
    iput-object v0, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    .line 49
    new-instance v0, Ll/ܽ᩻ۙ;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 33
    invoke-direct {v0, v1}, Ll/ܺ᩻ۙ;-><init>(Ljava/lang/Object;)V

    .line 49
    iput-object v0, p0, Ll/ܽܺܳ;->ܳ:Ll/ܽ᩻ۙ;

    return-void
.end method

.method public static ۘ()Ll/ۧܽܳ;
    .locals 1

    .line 61
    sget-object v0, Ll/ܽܺܳ;->ۧ:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧܽܳ;

    return-object v0
.end method

.method public static ۙ(Ll/ܽܺܳ;)Ll/ܰܶܳ;
    .locals 2

    .line 135
    iget-object p0, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {p0}, Ll/᩸ܺܳ;->᩷()Ll/ۤܺܳ;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 136
    :cond_0
    new-instance v0, Ll/ܰܶܳ;

    iget-object v1, p0, Ll/ۤܺܳ;->᩷:Ljava/lang/String;

    iget-object p0, p0, Ll/ۤܺܳ;->ۙ:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Ll/ܰܶܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private ۙ(Ll/ۧܽܳ;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 188
    iput-boolean v0, p0, Ll/ܽܺܳ;->ۤ:Z

    if-eqz p2, :cond_0

    .line 189
    invoke-static {}, Ll/ܳܺܳ;->ۙ()V

    .line 190
    :cond_0
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-ne v0, p1, :cond_1

    invoke-virtual {p1, p2}, Ll/ۧܽܳ;->ۙ(Z)V

    :cond_1
    if-nez p2, :cond_2

    const p1, 0x7f1207ef

    .line 193
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    .line 195
    :cond_2
    iget-object p1, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ܽܺܳ;Ll/ۧܽܳ;Z)V
    .locals 0

    .line 180
    invoke-direct {p0, p1, p2}, Ll/ܽܺܳ;->ۙ(Ll/ۧܽܳ;Z)V

    return-void
.end method

.method public static bridge synthetic ۤ(Ll/ܽܺܳ;)Ll/᩵ܿ᩻;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    return-object p0
.end method

.method public static ܰ()I
    .locals 3

    .line 83
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    const-string v1, "itp"

    const/4 v2, 0x0

    .line 84
    invoke-interface {v0, v1, v2}, Ll/ۢ֫ܺ;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x32

    .line 83
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private ܿ()V
    .locals 2

    .line 245
    iget-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_4

    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-nez v0, :cond_0

    goto :goto_1

    .line 246
    :cond_0
    invoke-virtual {p0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 252
    :cond_1
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v0}, Ll/᩶ܽܳ;->ۧ()V

    .line 253
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    invoke-virtual {v0}, Ll/᩶ܶܳ;->֫()V

    .line 262
    iget-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    const/4 v1, 0x0

    .line 263
    iput-object v1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz v0, :cond_4

    .line 264
    invoke-virtual {v0}, Ll/᩵ܿ᩻;->ۤ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    .line 256
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ll/᩶ܽܳ;->۫()V

    :cond_2
    const v0, 0x7f1204e1

    .line 269
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 247
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    :cond_4
    :goto_1
    return-void
.end method

.method public static ᩶()Z
    .locals 1

    .line 55
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {v0}, Ll/ۧܽܳ;->᩷()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic ᩷(Ll/ܽܺܳ;)V
    .locals 0

    .line 210
    invoke-direct {p0}, Ll/ܽܺܳ;->ܿ()V

    return-void
.end method

.method private ᩷(Z)V
    .locals 5

    .line 153
    invoke-static {}, Ll/֫ܽܳ;->ᩴ()V

    .line 154
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    .line 155
    invoke-virtual {p0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    .line 156
    sget-object v2, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    const-string v3, "iad"

    .line 157
    invoke-interface {v2, v3, v1}, Ll/ۢ֫ܺ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 33
    invoke-static {v0}, Ll/ܳܺܳ;->ۙ(Landroid/content/ContextWrapper;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 159
    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    const/4 v4, 0x0

    if-lt v2, v3, :cond_1

    .line 161
    :try_start_0
    invoke-virtual {v0}, Landroid/accessibilityservice/AccessibilityService;->disableSelf()V

    .line 162
    invoke-static {}, Ll/ܳܺܳ;->ۙ()V

    .line 164
    invoke-virtual {v0, v1}, Ll/ۧܽܳ;->ۙ(Z)V

    .line 165
    iget-object p1, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    invoke-virtual {p1, v4}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const p1, 0x7f1207ef

    .line 168
    invoke-static {p1}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 173
    :cond_1
    iput-boolean v1, p0, Ll/ܽܺܳ;->ۤ:Z

    .line 174
    invoke-virtual {v0, v1}, Ll/ۧܽܳ;->ۙ(Z)V

    .line 175
    iget-object v1, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    invoke-virtual {v1, v4}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    .line 177
    :try_start_1
    sget-object v1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/֫ܺܳ;

    invoke-direct {v2, p0, v0, p1}, Ll/֫ܺܳ;-><init>(Ll/ܽܺܳ;Ll/ۧܽܳ;Z)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    const/4 p1, 0x0

    .line 183
    invoke-direct {p0, v0, p1}, Ll/ܽܺܳ;->ۙ(Ll/ۧܽܳ;Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static ᩺()Ll/ܽܺܳ;
    .locals 1

    .line 52
    sget-object v0, Ll/ܽܺܳ;->֫:Ll/ܽܺܳ;

    return-object v0
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 2

    .line 75
    iget-object v0, p0, Ll/ܽܺܳ;->ᩴ:Ll/֡ܽܳ;

    invoke-virtual {v0}, Ll/֡ܽܳ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll/֡ܽܳ;->᩷()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final ۗ()Ll/ܽ᩻ۙ;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ܽܺܳ;->ܳ:Ll/ܽ᩻ۙ;

    return-object v0
.end method

.method public final ۙ(Landroid/view/View;)Ll/ܿܽ;
    .locals 1

    .line 294
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    .line 295
    invoke-virtual {v0, p1}, Ll/᩶ܽܳ;->ۙ(Landroid/view/View;)Ll/ܿܽ;

    move-result-object p1

    return-object p1

    .line 294
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Inspector window is not available"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ()V
    .locals 2

    .line 198
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/᩶ܶܳ;->ۙ()V

    :cond_0
    return-void
.end method

.method public final ۙ(I)V
    .locals 2

    const/16 v0, 0x32

    .line 92
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 93
    sget-object v0, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    invoke-interface {v0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v0

    const-string v1, "itp"

    invoke-interface {v0, p1, v1}, Ll/ᩳ֫ܺ;->ۙ(ILjava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳ֫ܺ;->apply()V

    .line 94
    iget-object p1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ll/ܽܺܳ;->ۚ()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 95
    :cond_0
    iget-object p1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ll/ܽܺܳ;->ۚ()F

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩵ܿ᩻;->ۙ(F)V

    .line 96
    :cond_1
    iget-object p1, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/᩶ܶܳ;->ܺ()V

    :cond_2
    return-void
.end method

.method public final ۙ(Ll/۠ܶܳ;)V
    .locals 1

    .line 300
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    .line 301
    invoke-virtual {v0, p1}, Ll/᩶ܽܳ;->ۙ(Ll/۠ܶܳ;)V

    return-void

    .line 300
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Inspector window is not available"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ll/ۧܽܳ;)V
    .locals 1

    .line 333
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    iget-object p1, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/᩶ܶܳ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/ۧܽܳ;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 336
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-ne v0, p1, :cond_4

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 337
    :cond_0
    iget-object v0, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {v0, p2}, Ll/᩸ܺܳ;->ۙ(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 338
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩻()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 339
    :cond_1
    invoke-static {p1}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    return-void

    .line 340
    :cond_2
    iget-object p1, p0, Ll/ܽܺܳ;->ᩴ:Ll/֡ܽܳ;

    invoke-virtual {p1, p2}, Ll/֡ܽܳ;->ۙ(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 306
    iget-object p1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz p1, :cond_3

    iget-object p2, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-nez p2, :cond_3

    invoke-virtual {p1}, Ll/᩶ܽܳ;->ܺ()V

    .line 307
    :cond_3
    iget-object p1, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final ۙ(Ll/ܶܶܳ;)V
    .locals 1

    .line 281
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ll/᩶ܽܳ;->ۙ(Ll/ܶܶܳ;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/᩶ܶܳ;)V
    .locals 1

    .line 284
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eq p1, v0, :cond_0

    return-void

    .line 262
    :cond_0
    iget-object p1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    const/4 v0, 0x0

    .line 263
    iput-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz p1, :cond_1

    .line 264
    invoke-virtual {p1}, Ll/᩵ܿ᩻;->ۤ()V

    .line 286
    :cond_1
    iget-object p1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ll/᩶ܽܳ;->ܳ()V

    .line 287
    :cond_2
    iput-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    .line 288
    iput-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    .line 289
    iget-object p1, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {p1}, Ll/᩸ܺܳ;->ۤ()V

    const/4 p1, 0x0

    .line 290
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Ll/ܽܺܳ;->ܳ:Ll/ܽ᩻ۙ;

    invoke-virtual {v0, p1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۙ(Ll/᩶ܶܳ;I)V
    .locals 1

    .line 276
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/ܽܺܳ;->ܳ:Ll/ܽ᩻ۙ;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final ۙ(Ll/᩶ܽܳ;)V
    .locals 1

    .line 271
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    :cond_0
    return-void
.end method

.method public final ۙ(Z)V
    .locals 2

    .line 279
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Ll/᩶ܽܳ;->ۙ(Z)V

    :cond_0
    return-void
.end method

.method public final ۚ()F
    .locals 2

    .line 89
    invoke-static {}, Ll/ܽܺܳ;->ܰ()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v0

    return v1
.end method

.method public final ۛ()V
    .locals 1

    .line 101
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩶ܽܳ;->᩻()V

    :cond_0
    return-void
.end method

.method public final ۤ()V
    .locals 2

    .line 304
    iget-object v0, p0, Ll/ܽܺܳ;->ᩴ:Ll/֡ܽܳ;

    invoke-virtual {v0}, Ll/֡ܽܳ;->ۙ()V

    .line 306
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ll/᩶ܽܳ;->ܺ()V

    .line 307
    :cond_0
    iget-object v0, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۤ(Ll/ۧܽܳ;)V
    .locals 1

    .line 311
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 312
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    .line 313
    iget-object v0, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {v0}, Ll/᩸ܺܳ;->ۙ()V

    .line 315
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/ܽܺܳ;->ۧ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Ll/ܽܺܳ;->ۤ:Z

    return v0
.end method

.method public final ۨ()V
    .locals 1

    const/4 v0, 0x1

    .line 144
    invoke-direct {p0, v0}, Ll/ܽܺܳ;->᩷(Z)V

    return-void
.end method

.method public final ۫()Ljava/util/ArrayList;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܽܺܳ;->ᩴ:Ll/֡ܽܳ;

    invoke-virtual {v0}, Ll/֡ܽܳ;->᩷()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ll/֫ܶܳ;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ll/᩶ܶܳ;->ۤ()Ll/֫ܶܳ;

    move-result-object v0

    return-object v0
.end method

.method public final ܶ()V
    .locals 1

    .line 272
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩶ܶܳ;->ۚ()V

    :cond_0
    return-void
.end method

.method public final ܺ()Z
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩶ܽܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 4

    .line 203
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ll/᩶ܶܳ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 204
    :cond_0
    invoke-virtual {p0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 208
    :cond_1
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "inspector"

    invoke-static {v0, v1}, Ll/᩵ܿ᩻;->ۙ(Landroid/content/Context;Ljava/lang/String;)Ll/᩵ܿ᩻;

    move-result-object v0

    iget-object v1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    .line 209
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x7f08011a

    invoke-static {v1, v3, v2}, Ll/᩻۠᩷;->ۙ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩻۠᩷;

    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 209
    new-instance v1, Ll/ۗۜۧ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ۗۜۧ;-><init>(ILjava/lang/Object;)V

    .line 105
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 211
    iget-object v1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f1204ef

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 212
    invoke-virtual {p0}, Ll/ܽܺܳ;->ۚ()F

    move-result v1

    invoke-virtual {v0, v1}, Ll/᩵ܿ᩻;->ۙ(F)V

    .line 213
    new-instance v1, Ll/ܺܺܳ;

    invoke-direct {v1, p0, v0}, Ll/ܺܺܳ;-><init>(Ll/ܽܺܳ;Ll/᩵ܿ᩻;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 224
    :try_start_0
    invoke-virtual {v0}, Ll/᩵ܿ᩻;->ۙ()V

    .line 225
    iput-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    .line 226
    iget-object v1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v1}, Ll/᩶ܽܳ;->۫()V

    .line 227
    iget-object v1, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    invoke-virtual {v1}, Ll/᩶ܶܳ;->ۧ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    nop

    .line 229
    iget-object v1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-ne v1, v0, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-ne v1, v0, :cond_3

    const/4 v1, 0x0

    .line 230
    iput-object v1, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    .line 231
    :cond_3
    invoke-virtual {v0}, Ll/᩵ܿ᩻;->ۤ()V

    if-eqz v2, :cond_4

    .line 232
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_4

    .line 233
    :try_start_1
    invoke-virtual {v0}, Ll/᩶ܽܳ;->ۧ()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 236
    :catch_1
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    :cond_4
    :goto_1
    const v0, 0x7f1204e1

    .line 269
    invoke-static {v0}, Ll/᩸۠ۧ;->ۙ(I)Ll/᩸۠ۧ;

    return-void

    .line 205
    :cond_5
    :goto_2
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    :cond_6
    :goto_3
    return-void
.end method

.method public final ᩴ()Ll/ۧܽܳ;
    .locals 2

    .line 66
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    .line 67
    iget-boolean v1, p0, Ll/ܽܺܳ;->ۤ:Z

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۧܽܳ;->ۙ()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩴ(Ll/ۧܽܳ;)V
    .locals 1

    .line 323
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-eq v0, p1, :cond_0

    return-void

    .line 324
    :cond_0
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    .line 325
    iget-object p1, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {p1}, Ll/᩸ܺܳ;->ۙ()V

    .line 326
    iget-object p1, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩵()V
    .locals 1

    .line 140
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩶ܶܳ;->᩷()V

    :cond_0
    return-void
.end method

.method public final ᩷()Ll/ܽ᩻ۙ;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    return-object v0
.end method

.method public final ᩷(Ll/ۧܽܳ;)V
    .locals 1

    .line 318
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-eq v0, p1, :cond_0

    return-void

    .line 319
    :cond_0
    iget-object p1, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {p1}, Ll/᩸ܺܳ;->ۤ()V

    .line 320
    iget-object p1, p0, Ll/ܽܺܳ;->᩷:Ll/ܽ᩻ۙ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܽ᩻ۙ;->᩷(Ljava/lang/Object;)V

    return-void
.end method

.method public final ᩸()V
    .locals 1

    const/4 v0, 0x0

    .line 149
    invoke-direct {p0, v0}, Ll/ܽܺܳ;->᩷(Z)V

    return-void
.end method

.method public final ᩸(Ll/ۧܽܳ;)V
    .locals 1

    .line 329
    invoke-virtual {p0, p1}, Ll/ܽܺܳ;->ᩴ(Ll/ۧܽܳ;)V

    .line 330
    invoke-static {}, Ll/ܽܺܳ;->ۘ()Ll/ۧܽܳ;

    move-result-object v0

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    sput-object p1, Ll/ܽܺܳ;->ۧ:Ljava/lang/ref/WeakReference;

    :cond_0
    return-void
.end method

.method public final ᩹()V
    .locals 4

    .line 109
    invoke-virtual {p0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 111
    invoke-static {v0}, Ll/۟֨ܺ;->᩷(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 113
    :try_start_0
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩶ܶܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    iget-object v0, p0, Ll/ܽܺܳ;->۫:Ll/᩸ܺܳ;

    invoke-virtual {v0}, Ll/᩸ܺܳ;->ۤ()V

    .line 115
    iget-object v0, p0, Ll/ܽܺܳ;->ᩴ:Ll/֡ܽܳ;

    invoke-virtual {v0}, Ll/֡ܽܳ;->᩸()V

    .line 117
    new-instance v0, Landroid/view/ContextThemeWrapper;

    sget-object v1, Ll/᩶᩷ۧ;->᩷:Ll/ܽܿ֫;

    invoke-static {}, Ll/ۜܳۧ;->ۚۙ()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 119
    new-instance v1, Landroid/content/res/Configuration;

    invoke-direct {v1}, Landroid/content/res/Configuration;-><init>()V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 120
    iput v2, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 121
    invoke-virtual {v0, v1}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V

    .line 122
    new-instance v1, Ll/᩶ܶܳ;

    new-instance v2, Ll/֡۠֫;

    invoke-direct {v2, p0}, Ll/֡۠֫;-><init>(Ljava/lang/Object;)V

    new-instance v3, Ll/ۚܺܳ;

    invoke-direct {v3, p0}, Ll/ۚܺܳ;-><init>(Ll/ܽܺܳ;)V

    invoke-direct {v1, v0, v2, v3, p0}, Ll/᩶ܶܳ;-><init>(Landroid/view/ContextThemeWrapper;Ll/֡۠֫;Ll/ۚܺܳ;Ll/ܽܺܳ;)V

    iput-object v1, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    .line 123
    new-instance v1, Ll/᩶ܽܳ;

    invoke-direct {v1, v0, p0}, Ll/᩶ܽܳ;-><init>(Landroid/view/ContextThemeWrapper;Ll/ܽܺܳ;)V

    iput-object v1, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    .line 125
    :cond_1
    iget-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz v0, :cond_2

    .line 126
    invoke-direct {p0}, Ll/ܽܺܳ;->ܿ()V

    return-void

    .line 129
    :cond_2
    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    invoke-virtual {v0}, Ll/᩶ܽܳ;->ۧ()V

    .line 130
    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    invoke-virtual {v0}, Ll/᩶ܶܳ;->֫()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 131
    invoke-virtual {p0}, Ll/ܽܺܳ;->᩵()V

    throw v0

    .line 111
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Overlay permission is not granted"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Accessibility service is not connected"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 69
    invoke-virtual {p0}, Ll/ܽܺܳ;->ᩴ()Ll/ۧܽܳ;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ܽܺܳ;->ۙ:Ll/᩶ܶܳ;

    if-eqz v0, :cond_1

    .line 70
    invoke-virtual {v0}, Ll/᩶ܶܳ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ܽܺܳ;->ۚ:Ll/᩶ܽܳ;

    if-eqz v0, :cond_1

    .line 71
    invoke-virtual {v0}, Ll/᩶ܽܳ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܽܺܳ;->᩸:Ll/᩵ܿ᩻;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll/᩵ܿ᩻;->᩷()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
